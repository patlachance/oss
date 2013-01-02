/*
 * Copyright 2012-2013 Mathias Herberts 
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.geoxp.oss.servlet;

import com.google.inject.servlet.ServletModule;

public class GuiceServletModule extends ServletModule {
  @Override
  protected void configureServlets() {
    serve("/GenMasterSecret").with(GenMasterSecretServlet.class);
    serve("/Init").with(InitServlet.class);
    serve("/GetSecret").with(GetSecretServlet.class);
    serve("/GenSecret").with(GenSecretServlet.class);
    serve("/GetOSSRSA").with(GetOSSRSAServlet.class);
  }
}
