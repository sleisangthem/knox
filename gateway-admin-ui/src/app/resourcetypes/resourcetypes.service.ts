/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
import { Injectable, OnInit } from '@angular/core';
import { Subject } from 'rxjs/Subject';

@Injectable()
export class ResourceTypesService {

    resourceTypes = ['Provider Configurations', 'Descriptors', 'Topologies'];
    selectedResourceTypeSource = new Subject<string>();
    public selectedResourceType$ = this.selectedResourceTypeSource.asObservable();

    constructor() {
    }

    getResourceTypes(): string[] {
        return this.resourceTypes;
    }

    selectResourceType(resType: string) {
      //console.debug('ResourceTypeService --> selectResourceType() --> ' + resType);
      this.selectedResourceTypeSource.next(resType);
    }
}