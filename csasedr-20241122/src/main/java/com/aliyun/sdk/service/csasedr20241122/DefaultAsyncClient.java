// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csasedr20241122;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.csasedr20241122.models.*;
import darabonba.core.utils.*;
import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;

import java.util.concurrent.CompletableFuture;


/**
 * <p>Main client.</p>
 */
public final class DefaultAsyncClient implements AsyncClient {

    protected final String product;
    protected final String version;
    protected final String endpointRule;
    protected final java.util.Map<String, String> endpointMap;
    protected final TeaRequest REQUEST;
    protected final TeaAsyncHandler handler;

    protected DefaultAsyncClient(ClientConfiguration configuration) {
        this.handler = new TeaAsyncHandler(configuration);
        this.product = "CsasEdr";
        this.version = "2024-11-22";
        this.endpointRule = "regional";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * <b>description</b> :
     * <p>Creates a client rule policy. The policy type is specified by PolicyType.</p>
     * 
     * @param request the request parameters of CreateClientRuleStrategy  CreateClientRuleStrategyRequest
     * @return CreateClientRuleStrategyResponse
     */
    @Override
    public CompletableFuture<CreateClientRuleStrategyResponse> createClientRuleStrategy(CreateClientRuleStrategyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateClientRuleStrategy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateClientRuleStrategyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateClientRuleStrategyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation is used for the initialization of a general asset selection configuration and generates a SelectionKey. The addition or selection of specific assets is completed in What to do next. When you invoke this operation, it only generates the configuration object and does not save the configuration record.</p>
     * 
     * @param request the request parameters of CreateSelectionConfig  CreateSelectionConfigRequest
     * @return CreateSelectionConfigResponse
     */
    @Override
    public CompletableFuture<CreateSelectionConfigResponse> createSelectionConfig(CreateSelectionConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSelectionConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSelectionConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSelectionConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateSimilarSecurityEventsQueryTask  CreateSimilarSecurityEventsQueryTaskRequest
     * @return CreateSimilarSecurityEventsQueryTaskResponse
     */
    @Override
    public CompletableFuture<CreateSimilarSecurityEventsQueryTaskResponse> createSimilarSecurityEventsQueryTask(CreateSimilarSecurityEventsQueryTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSimilarSecurityEventsQueryTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSimilarSecurityEventsQueryTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSimilarSecurityEventsQueryTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteClientRuleStrategy  DeleteClientRuleStrategyRequest
     * @return DeleteClientRuleStrategyResponse
     */
    @Override
    public CompletableFuture<DeleteClientRuleStrategyResponse> deleteClientRuleStrategy(DeleteClientRuleStrategyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteClientRuleStrategy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteClientRuleStrategyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteClientRuleStrategyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteSecurityEventMarkMissList  DeleteSecurityEventMarkMissListRequest
     * @return DeleteSecurityEventMarkMissListResponse
     */
    @Override
    public CompletableFuture<DeleteSecurityEventMarkMissListResponse> deleteSecurityEventMarkMissList(DeleteSecurityEventMarkMissListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteSecurityEventMarkMissList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSecurityEventMarkMissListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSecurityEventMarkMissListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeAssetScope  DescribeAssetScopeRequest
     * @return DescribeAssetScopeResponse
     */
    @Override
    public CompletableFuture<DescribeAssetScopeResponse> describeAssetScope(DescribeAssetScopeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAssetScope").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAssetScopeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAssetScopeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeNsasSuspEventType  DescribeNsasSuspEventTypeRequest
     * @return DescribeNsasSuspEventTypeResponse
     */
    @Override
    public CompletableFuture<DescribeNsasSuspEventTypeResponse> describeNsasSuspEventType(DescribeNsasSuspEventTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeNsasSuspEventType").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeNsasSuspEventTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeNsasSuspEventTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSecurityEventMarkMissList  DescribeSecurityEventMarkMissListRequest
     * @return DescribeSecurityEventMarkMissListResponse
     */
    @Override
    public CompletableFuture<DescribeSecurityEventMarkMissListResponse> describeSecurityEventMarkMissList(DescribeSecurityEventMarkMissListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSecurityEventMarkMissList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSecurityEventMarkMissListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSecurityEventMarkMissListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSecurityEventOperationStatus  DescribeSecurityEventOperationStatusRequest
     * @return DescribeSecurityEventOperationStatusResponse
     */
    @Override
    public CompletableFuture<DescribeSecurityEventOperationStatusResponse> describeSecurityEventOperationStatus(DescribeSecurityEventOperationStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSecurityEventOperationStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSecurityEventOperationStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSecurityEventOperationStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation queries the handling operations that can be displayed for a specified endpoint alert. When initiating a subsequent response, you must select the operation items returned in this response where UserCanOperate is true, and submit parameters as required by the response operation. The query result does not guarantee that the subsequent response will succeed.
     * The actual returned results are affected by feature switches, canary releases, dynamic allowlists, alert templates, alert statuses, and filter conditions. The list may be empty. The examples are used to illustrate field formats or rule combinations and do not represent that a specific alert will definitely return these values. MappingMarkFields and its subfields are generic compatibility structures. The current query pipeline does not populate their elements, and you should not infer that this operation supports the corresponding capabilities based on them.</p>
     * 
     * @param request the request parameters of DescribeSecurityEventOperations  DescribeSecurityEventOperationsRequest
     * @return DescribeSecurityEventOperationsResponse
     */
    @Override
    public CompletableFuture<DescribeSecurityEventOperationsResponse> describeSecurityEventOperations(DescribeSecurityEventOperationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSecurityEventOperations").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSecurityEventOperationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSecurityEventOperationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSimilarEventScenarios  DescribeSimilarEventScenariosRequest
     * @return DescribeSimilarEventScenariosResponse
     */
    @Override
    public CompletableFuture<DescribeSimilarEventScenariosResponse> describeSimilarEventScenarios(DescribeSimilarEventScenariosRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSimilarEventScenarios").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSimilarEventScenariosResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSimilarEventScenariosResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSimilarSecurityEvents  DescribeSimilarSecurityEventsRequest
     * @return DescribeSimilarSecurityEventsResponse
     */
    @Override
    public CompletableFuture<DescribeSimilarSecurityEventsResponse> describeSimilarSecurityEvents(DescribeSimilarSecurityEventsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSimilarSecurityEvents").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSimilarSecurityEventsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSimilarSecurityEventsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSuspEvents  DescribeSuspEventsRequest
     * @return DescribeSuspEventsResponse
     */
    @Override
    public CompletableFuture<DescribeSuspEventsResponse> describeSuspEvents(DescribeSuspEventsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSuspEvents").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSuspEventsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSuspEventsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the detailed information of a client rule policy based on the policy ID.</p>
     * 
     * @param request the request parameters of GetClientRuleStrategyDetail  GetClientRuleStrategyDetailRequest
     * @return GetClientRuleStrategyDetailResponse
     */
    @Override
    public CompletableFuture<GetClientRuleStrategyDetailResponse> getClientRuleStrategyDetail(GetClientRuleStrategyDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetClientRuleStrategyDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetClientRuleStrategyDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetClientRuleStrategyDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Counts the number of proactive defense policies (PolicyType=2) for the current account and returns the number of system rule policies and custom rule policies.</p>
     * 
     * @param request the request parameters of GetClientRuleStrategyStatistics  GetClientRuleStrategyStatisticsRequest
     * @return GetClientRuleStrategyStatisticsResponse
     */
    @Override
    public CompletableFuture<GetClientRuleStrategyStatisticsResponse> getClientRuleStrategyStatistics(GetClientRuleStrategyStatisticsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetClientRuleStrategyStatistics").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetClientRuleStrategyStatisticsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetClientRuleStrategyStatisticsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of HandleSecurityEvents  HandleSecurityEventsRequest
     * @return HandleSecurityEventsResponse
     */
    @Override
    public CompletableFuture<HandleSecurityEventsResponse> handleSecurityEvents(HandleSecurityEventsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("HandleSecurityEvents").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(HandleSecurityEventsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<HandleSecurityEventsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>First, call the CreateSimilarSecurityEventsQueryTask operation to create a similar alert query task. Wait until the data extraction for the task is complete and the task reaches the DataRetrieved state before you call this operation. The processing scope covers the security alerts filtered under the TaskId. This scope is determined by the similar scenario and alert configurations selected when the query task was created. The scope does not equal all alerts of the same type, nor is it fixed to alerts with the same IP address. After this operation is successfully called, the processing continues to run asynchronously in the background.</p>
     * 
     * @param request the request parameters of HandleSimilarSecurityEvents  HandleSimilarSecurityEventsRequest
     * @return HandleSimilarSecurityEventsResponse
     */
    @Override
    public CompletableFuture<HandleSimilarSecurityEventsResponse> handleSimilarSecurityEvents(HandleSimilarSecurityEventsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("HandleSimilarSecurityEvents").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(HandleSimilarSecurityEventsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<HandleSimilarSecurityEventsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Performs a paged query to retrieve client rule policies based on the policy type (PolicyType) with paging. You can call GetClientRuleStrategyDetail to query the details.</p>
     * 
     * @param request the request parameters of ListClientRuleStrategy  ListClientRuleStrategyRequest
     * @return ListClientRuleStrategyResponse
     */
    @Override
    public CompletableFuture<ListClientRuleStrategyResponse> listClientRuleStrategy(ListClientRuleStrategyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListClientRuleStrategy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListClientRuleStrategyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListClientRuleStrategyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the system rule catalog and the switch status of rules under a specified SelectionKey. You can use the returned SwitchId and the same SelectionKey to call the OperateTargetConfig operation to modify the switch status.</p>
     * 
     * @param request the request parameters of ListSystemConfigRules  ListSystemConfigRulesRequest
     * @return ListSystemConfigRulesResponse
     */
    @Override
    public CompletableFuture<ListSystemConfigRulesResponse> listSystemConfigRules(ListSystemConfigRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListSystemConfigRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSystemConfigRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSystemConfigRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Updates the override configuration of rule switches for each SwitchId under the same SelectionKey. Obtain the rule SwitchId by calling ListSystemConfigRules first. Do not use this operation to replace UpdateClientRuleStrategy for updating the overall policy switch Status, and do not use software process names as system rule SwitchIds.</p>
     * 
     * @param request the request parameters of OperateTargetConfig  OperateTargetConfigRequest
     * @return OperateTargetConfigResponse
     */
    @Override
    public CompletableFuture<OperateTargetConfigResponse> operateTargetConfig(OperateTargetConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OperateTargetConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OperateTargetConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OperateTargetConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateAssetScope  UpdateAssetScopeRequest
     * @return UpdateAssetScopeResponse
     */
    @Override
    public CompletableFuture<UpdateAssetScopeResponse> updateAssetScope(UpdateAssetScopeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateAssetScope").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAssetScopeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAssetScopeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Updates a client rule policy based on the policy ID.</p>
     * 
     * @param request the request parameters of UpdateClientRuleStrategy  UpdateClientRuleStrategyRequest
     * @return UpdateClientRuleStrategyResponse
     */
    @Override
    public CompletableFuture<UpdateClientRuleStrategyResponse> updateClientRuleStrategy(UpdateClientRuleStrategyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateClientRuleStrategy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateClientRuleStrategyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateClientRuleStrategyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
