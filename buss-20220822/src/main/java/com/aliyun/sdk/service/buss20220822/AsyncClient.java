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

    /**
     * @param request the request parameters of BusinessResultService  BusinessResultServiceRequest
     * @return BusinessResultServiceResponse
     */
    CompletableFuture<BusinessResultServiceResponse> businessResultService(BusinessResultServiceRequest request);

    /**
     * @param request the request parameters of CreateUserInvestigationInfoQueryTask  CreateUserInvestigationInfoQueryTaskRequest
     * @return CreateUserInvestigationInfoQueryTaskResponse
     */
    CompletableFuture<CreateUserInvestigationInfoQueryTaskResponse> createUserInvestigationInfoQueryTask(CreateUserInvestigationInfoQueryTaskRequest request);

    /**
     * @param request the request parameters of FindInstanceInfo  FindInstanceInfoRequest
     * @return FindInstanceInfoResponse
     */
    CompletableFuture<FindInstanceInfoResponse> findInstanceInfo(FindInstanceInfoRequest request);

    /**
     * @param request the request parameters of FindUserAvailbleResources  FindUserAvailbleResourcesRequest
     * @return FindUserAvailbleResourcesResponse
     */
    CompletableFuture<FindUserAvailbleResourcesResponse> findUserAvailbleResources(FindUserAvailbleResourcesRequest request);

    /**
     * @param request the request parameters of GetSecurityEventDetail  GetSecurityEventDetailRequest
     * @return GetSecurityEventDetailResponse
     */
    CompletableFuture<GetSecurityEventDetailResponse> getSecurityEventDetail(GetSecurityEventDetailRequest request);

    /**
     * @param request the request parameters of PunishResourceSearch  PunishResourceSearchRequest
     * @return PunishResourceSearchResponse
     */
    CompletableFuture<PunishResourceSearchResponse> punishResourceSearch(PunishResourceSearchRequest request);

    /**
     * @param request the request parameters of RecordClickLinkAction  RecordClickLinkActionRequest
     * @return RecordClickLinkActionResponse
     */
    CompletableFuture<RecordClickLinkActionResponse> recordClickLinkAction(RecordClickLinkActionRequest request);

    /**
     * @param request the request parameters of RiskEventSync  RiskEventSyncRequest
     * @return RiskEventSyncResponse
     */
    CompletableFuture<RiskEventSyncResponse> riskEventSync(RiskEventSyncRequest request);

    /**
     * @param request the request parameters of SearchPunishEvents  SearchPunishEventsRequest
     * @return SearchPunishEventsResponse
     */
    CompletableFuture<SearchPunishEventsResponse> searchPunishEvents(SearchPunishEventsRequest request);

    /**
     * @param request the request parameters of SearchPunishRecords  SearchPunishRecordsRequest
     * @return SearchPunishRecordsResponse
     */
    CompletableFuture<SearchPunishRecordsResponse> searchPunishRecords(SearchPunishRecordsRequest request);

    /**
     * @param request the request parameters of SearchPunishRequest  SearchPunishRequestRequest
     * @return SearchPunishRequestResponse
     */
    CompletableFuture<SearchPunishRequestResponse> searchPunishRequest(SearchPunishRequestRequest request);

    /**
     * @param request the request parameters of UpdateSecurityEventStatus  UpdateSecurityEventStatusRequest
     * @return UpdateSecurityEventStatusResponse
     */
    CompletableFuture<UpdateSecurityEventStatusResponse> updateSecurityEventStatus(UpdateSecurityEventStatusRequest request);

}
