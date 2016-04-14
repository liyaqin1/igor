/*
 * Copyright 2016 Google, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License")
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.netflix.spinnaker.igor.docker.service

import com.netflix.spinnaker.igor.docker.model.ClouddriverAccount
import retrofit.http.GET
import retrofit.http.Query

/*
 * This service represents the interface with a simplified V2 docker registry service.
 * Specifically, the interface to docker registry images presented by clouddriver.
 */
interface ClouddriverService {
    @GET('/dockerRegistry/images/find')
    List<TaggedImage> getImagesByAccount(@Query('account') String account)

    @GET('/credentials')
    List<ClouddriverAccount> getAllAccounts()
}