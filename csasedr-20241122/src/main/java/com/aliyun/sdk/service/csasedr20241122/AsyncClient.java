// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csasedr20241122;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.csasedr20241122.models.*;
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
     * <b>description</b> :
     * <p>Creates a client rule policy. The policy type is specified by PolicyType.</p>
     * 
     * @param request the request parameters of CreateClientRuleStrategy  CreateClientRuleStrategyRequest
     * @return CreateClientRuleStrategyResponse
     */
    CompletableFuture<CreateClientRuleStrategyResponse> createClientRuleStrategy(CreateClientRuleStrategyRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is used for the initialization of a general asset selection configuration and generates a SelectionKey. The addition or selection of specific assets is completed in What to do next. When you invoke this operation, it only generates the configuration object and does not save the configuration record.</p>
     * 
     * @param request the request parameters of CreateSelectionConfig  CreateSelectionConfigRequest
     * @return CreateSelectionConfigResponse
     */
    CompletableFuture<CreateSelectionConfigResponse> createSelectionConfig(CreateSelectionConfigRequest request);

    /**
     * @param request the request parameters of CreateSimilarSecurityEventsQueryTask  CreateSimilarSecurityEventsQueryTaskRequest
     * @return CreateSimilarSecurityEventsQueryTaskResponse
     */
    CompletableFuture<CreateSimilarSecurityEventsQueryTaskResponse> createSimilarSecurityEventsQueryTask(CreateSimilarSecurityEventsQueryTaskRequest request);

    /**
     * @param request the request parameters of DeleteClientRuleStrategy  DeleteClientRuleStrategyRequest
     * @return DeleteClientRuleStrategyResponse
     */
    CompletableFuture<DeleteClientRuleStrategyResponse> deleteClientRuleStrategy(DeleteClientRuleStrategyRequest request);

    /**
     * @param request the request parameters of DeleteSecurityEventMarkMissList  DeleteSecurityEventMarkMissListRequest
     * @return DeleteSecurityEventMarkMissListResponse
     */
    CompletableFuture<DeleteSecurityEventMarkMissListResponse> deleteSecurityEventMarkMissList(DeleteSecurityEventMarkMissListRequest request);

    /**
     * @param request the request parameters of DescribeAssetScope  DescribeAssetScopeRequest
     * @return DescribeAssetScopeResponse
     */
    CompletableFuture<DescribeAssetScopeResponse> describeAssetScope(DescribeAssetScopeRequest request);

    /**
     * @param request the request parameters of DescribeNsasSuspEventType  DescribeNsasSuspEventTypeRequest
     * @return DescribeNsasSuspEventTypeResponse
     */
    CompletableFuture<DescribeNsasSuspEventTypeResponse> describeNsasSuspEventType(DescribeNsasSuspEventTypeRequest request);

    /**
     * @param request the request parameters of DescribeSecurityEventMarkMissList  DescribeSecurityEventMarkMissListRequest
     * @return DescribeSecurityEventMarkMissListResponse
     */
    CompletableFuture<DescribeSecurityEventMarkMissListResponse> describeSecurityEventMarkMissList(DescribeSecurityEventMarkMissListRequest request);

    /**
     * @param request the request parameters of DescribeSecurityEventOperationStatus  DescribeSecurityEventOperationStatusRequest
     * @return DescribeSecurityEventOperationStatusResponse
     */
    CompletableFuture<DescribeSecurityEventOperationStatusResponse> describeSecurityEventOperationStatus(DescribeSecurityEventOperationStatusRequest request);

    /**
     * <b>description</b> :
     * <p>This operation queries the handling operations that can be displayed for a specified endpoint alert. When initiating a subsequent response, you must select the operation items returned in this response where UserCanOperate is true, and submit parameters as required by the response operation. The query result does not guarantee that the subsequent response will succeed.
     * The actual returned results are affected by feature switches, canary releases, dynamic allowlists, alert templates, alert statuses, and filter conditions. The list may be empty. The examples are used to illustrate field formats or rule combinations and do not represent that a specific alert will definitely return these values. MappingMarkFields and its subfields are generic compatibility structures. The current query pipeline does not populate their elements, and you should not infer that this operation supports the corresponding capabilities based on them.</p>
     * 
     * @param request the request parameters of DescribeSecurityEventOperations  DescribeSecurityEventOperationsRequest
     * @return DescribeSecurityEventOperationsResponse
     */
    CompletableFuture<DescribeSecurityEventOperationsResponse> describeSecurityEventOperations(DescribeSecurityEventOperationsRequest request);

    /**
     * @param request the request parameters of DescribeSimilarEventScenarios  DescribeSimilarEventScenariosRequest
     * @return DescribeSimilarEventScenariosResponse
     */
    CompletableFuture<DescribeSimilarEventScenariosResponse> describeSimilarEventScenarios(DescribeSimilarEventScenariosRequest request);

    /**
     * @param request the request parameters of DescribeSimilarSecurityEvents  DescribeSimilarSecurityEventsRequest
     * @return DescribeSimilarSecurityEventsResponse
     */
    CompletableFuture<DescribeSimilarSecurityEventsResponse> describeSimilarSecurityEvents(DescribeSimilarSecurityEventsRequest request);

    /**
     * @param request the request parameters of DescribeSuspEvents  DescribeSuspEventsRequest
     * @return DescribeSuspEventsResponse
     */
    CompletableFuture<DescribeSuspEventsResponse> describeSuspEvents(DescribeSuspEventsRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the detailed information of a client rule policy based on the policy ID.</p>
     * 
     * @param request the request parameters of GetClientRuleStrategyDetail  GetClientRuleStrategyDetailRequest
     * @return GetClientRuleStrategyDetailResponse
     */
    CompletableFuture<GetClientRuleStrategyDetailResponse> getClientRuleStrategyDetail(GetClientRuleStrategyDetailRequest request);

    /**
     * <b>description</b> :
     * <p>Counts the number of proactive defense policies (PolicyType=2) for the current account and returns the number of system rule policies and custom rule policies.</p>
     * 
     * @param request the request parameters of GetClientRuleStrategyStatistics  GetClientRuleStrategyStatisticsRequest
     * @return GetClientRuleStrategyStatisticsResponse
     */
    CompletableFuture<GetClientRuleStrategyStatisticsResponse> getClientRuleStrategyStatistics(GetClientRuleStrategyStatisticsRequest request);

    /**
     * @param request the request parameters of HandleSecurityEvents  HandleSecurityEventsRequest
     * @return HandleSecurityEventsResponse
     */
    CompletableFuture<HandleSecurityEventsResponse> handleSecurityEvents(HandleSecurityEventsRequest request);

    /**
     * <b>description</b> :
     * <p>First, call the CreateSimilarSecurityEventsQueryTask operation to create a similar alert query task. Wait until the data extraction for the task is complete and the task reaches the DataRetrieved state before you call this operation. The processing scope covers the security alerts filtered under the TaskId. This scope is determined by the similar scenario and alert configurations selected when the query task was created. The scope does not equal all alerts of the same type, nor is it fixed to alerts with the same IP address. After this operation is successfully called, the processing continues to run asynchronously in the background.</p>
     * 
     * @param request the request parameters of HandleSimilarSecurityEvents  HandleSimilarSecurityEventsRequest
     * @return HandleSimilarSecurityEventsResponse
     */
    CompletableFuture<HandleSimilarSecurityEventsResponse> handleSimilarSecurityEvents(HandleSimilarSecurityEventsRequest request);

    /**
     * <b>description</b> :
     * <p>Performs a paged query to retrieve client rule policies based on the policy type (PolicyType) with paging. You can call GetClientRuleStrategyDetail to query the details.</p>
     * 
     * @param request the request parameters of ListClientRuleStrategy  ListClientRuleStrategyRequest
     * @return ListClientRuleStrategyResponse
     */
    CompletableFuture<ListClientRuleStrategyResponse> listClientRuleStrategy(ListClientRuleStrategyRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the system rule catalog and the switch status of rules under a specified SelectionKey. You can use the returned SwitchId and the same SelectionKey to call the OperateTargetConfig operation to modify the switch status.</p>
     * 
     * @param request the request parameters of ListSystemConfigRules  ListSystemConfigRulesRequest
     * @return ListSystemConfigRulesResponse
     */
    CompletableFuture<ListSystemConfigRulesResponse> listSystemConfigRules(ListSystemConfigRulesRequest request);

    /**
     * <b>description</b> :
     * <p>Updates the override configuration of rule switches for each SwitchId under the same SelectionKey. Obtain the rule SwitchId by calling ListSystemConfigRules first. Do not use this operation to replace UpdateClientRuleStrategy for updating the overall policy switch Status, and do not use software process names as system rule SwitchIds.</p>
     * 
     * @param request the request parameters of OperateTargetConfig  OperateTargetConfigRequest
     * @return OperateTargetConfigResponse
     */
    CompletableFuture<OperateTargetConfigResponse> operateTargetConfig(OperateTargetConfigRequest request);

    /**
     * @param request the request parameters of UpdateAssetScope  UpdateAssetScopeRequest
     * @return UpdateAssetScopeResponse
     */
    CompletableFuture<UpdateAssetScopeResponse> updateAssetScope(UpdateAssetScopeRequest request);

    /**
     * <b>description</b> :
     * <p>Updates a client rule policy based on the policy ID.</p>
     * 
     * @param request the request parameters of UpdateClientRuleStrategy  UpdateClientRuleStrategyRequest
     * @return UpdateClientRuleStrategyResponse
     */
    CompletableFuture<UpdateClientRuleStrategyResponse> updateClientRuleStrategy(UpdateClientRuleStrategyRequest request);

}
