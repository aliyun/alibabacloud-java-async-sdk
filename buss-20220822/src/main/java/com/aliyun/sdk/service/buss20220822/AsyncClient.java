// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.buss20220822;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.buss20220822.models.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;

import java.util.concurrent.CompletableFuture;

public interface AsyncClient extends SdkAutoCloseable {

    static DefaultAsyncClientBuilder builder() {
        return new DefaultAsyncClientBuilder();
    }

    static AsyncClient create() {
        return builder().build();
    }

    CompletableFuture<BusinessResultServiceResponse> businessResultService(BusinessResultServiceRequest request);

    CompletableFuture<CreateUserInvestigationInfoQueryTaskResponse> createUserInvestigationInfoQueryTask(CreateUserInvestigationInfoQueryTaskRequest request);

    CompletableFuture<FindInstanceInfoResponse> findInstanceInfo(FindInstanceInfoRequest request);

    CompletableFuture<FindUserAvailbleResourcesResponse> findUserAvailbleResources(FindUserAvailbleResourcesRequest request);

    CompletableFuture<PunishResourceSearchResponse> punishResourceSearch(PunishResourceSearchRequest request);

    CompletableFuture<RiskEventSyncResponse> riskEventSync(RiskEventSyncRequest request);

    CompletableFuture<SearchPunishEventsResponse> searchPunishEvents(SearchPunishEventsRequest request);

    CompletableFuture<SearchPunishRecordsResponse> searchPunishRecords(SearchPunishRecordsRequest request);

    CompletableFuture<SearchPunishRequestResponse> searchPunishRequest(SearchPunishRequestRequest request);

}
