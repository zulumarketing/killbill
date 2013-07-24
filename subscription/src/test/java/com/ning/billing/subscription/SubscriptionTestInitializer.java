/*
 * Copyright 2010-2013 Ning, Inc.
 *
 * Ning licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.ning.billing.subscription;

import com.ning.billing.account.api.AccountData;
import com.ning.billing.api.TestApiListener;
import com.ning.billing.api.TestListenerStatus;
import com.ning.billing.catalog.api.Catalog;
import com.ning.billing.catalog.api.CatalogService;
import com.ning.billing.clock.ClockMock;
import com.ning.billing.subscription.api.SubscriptionService;
import com.ning.billing.subscription.api.user.SubscriptionBundle;
import com.ning.billing.subscription.api.user.SubscriptionUserApi;
import com.ning.billing.util.callcontext.CallContext;
import com.ning.billing.util.svcsapi.bus.BusService;

public interface SubscriptionTestInitializer {

    public Catalog initCatalog(final CatalogService catalogService) throws Exception;

    public AccountData initAccountData();

    public SubscriptionBundle initBundle(final SubscriptionUserApi subscriptionApi, final CallContext callContext) throws Exception;

    public void startTestFamework(final TestApiListener testListener,
                                  final TestListenerStatus testListenerStatus,
                                  final ClockMock clock,
                                  final BusService busService,
                                  final SubscriptionService subscriptionService) throws Exception;

    public void stopTestFramework(final TestApiListener testListener,
                                  final BusService busService,
                                  final SubscriptionService subscriptionService) throws Exception;
}