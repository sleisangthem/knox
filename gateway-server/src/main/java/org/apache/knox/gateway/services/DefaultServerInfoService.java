/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.knox.gateway.services;

import java.util.Map;

import org.apache.knox.gateway.GatewayServer;
import org.apache.knox.gateway.config.GatewayConfig;

/**
 * Simple server info service implementation that delegates to the
 * static methods of the GatewayServer itself for the info.
 */
public class DefaultServerInfoService implements ServerInfoService {

  /* (non-Javadoc)
   * @see Service#init(GatewayConfig, java.util.Map)
   */
  @Override
  public void init(GatewayConfig config, Map<String, String> options)
      throws ServiceLifecycleException {
  }

  /* (non-Javadoc)
   * @see Service#start()
   */
  @Override
  public void start() throws ServiceLifecycleException {
  }

  /* (non-Javadoc)
   * @see Service#stop()
   */
  @Override
  public void stop() throws ServiceLifecycleException {
  }

  /* (non-Javadoc)
   * @see ServerInfoService#getBuildVersion()
   */
  @Override
  public String getBuildVersion() {
    return GatewayServer.getBuildVersion();
  }

  /* (non-Javadoc)
   * @see ServerInfoService#getBuildHash()
   */
  @Override
  public String getBuildHash() {
    return GatewayServer.getBuildHash();
  }

}
