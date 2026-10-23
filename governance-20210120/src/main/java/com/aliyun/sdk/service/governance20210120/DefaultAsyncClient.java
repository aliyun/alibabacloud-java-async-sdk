// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.governance20210120;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.governance20210120.models.*;
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
        this.product = "governance";
        this.version = "2021-01-20";
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
     * <p>Applies an account baseline to multiple existing resource accounts at a time.
     * Account enrollment is an asynchronous process. After the accounts are enrolled, the account factory baseline is applied to each account. To query the enrollment details and check the baseline application result, call <a href="https://help.aliyun.com/document_detail/609062.html">GetEnrolledAccount</a>.</p>
     * 
     * @param request the request parameters of BatchEnrollAccounts  BatchEnrollAccountsRequest
     * @return BatchEnrollAccountsResponse
     */
    @Override
    public CompletableFuture<BatchEnrollAccountsResponse> batchEnrollAccounts(BatchEnrollAccountsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchEnrollAccounts").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchEnrollAccountsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchEnrollAccountsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateAccountFactoryBaseline  CreateAccountFactoryBaselineRequest
     * @return CreateAccountFactoryBaselineResponse
     */
    @Override
    public CompletableFuture<CreateAccountFactoryBaselineResponse> createAccountFactoryBaseline(CreateAccountFactoryBaselineRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAccountFactoryBaseline").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAccountFactoryBaselineResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAccountFactoryBaselineResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Asynchronously disables AI Cloud Governance Center by RegionId. This operation first disables governance maturity detection, waits for the cleanup to complete, and then disables the AI Cloud Governance Center service. This operation does not destroy or unsubscribe from Landing Zone. Before the request is accepted, Landing Zone must be disabled or not enabled. If Landing Zone is being set up, has been successfully set up, has failed to be set up, or has residual cleanup data, the request is rejected and the OperationDenied.LandingZoneEnabled error is returned. A successful request only indicates that the request is accepted. Call GetGovernanceServiceStatus to query the final result. You can initiate the disable operation when the status is Enabled or DisableFailed. If the status is Disabled or EnableFailed, the InvalidStatus.NotEnabled error is returned. If the status is Enabling or Disabling, the InvalidStatus.OperationInProgress error is returned. If the disable operation fails, the disabled parts are not restored. You can retry the operation after you troubleshoot the cause of the failure. If the failure persists, submit a ticket.</p>
     * 
     * @param request the request parameters of DecommissionGovernance  DecommissionGovernanceRequest
     * @return DecommissionGovernanceResponse
     */
    @Override
    public CompletableFuture<DecommissionGovernanceResponse> decommissionGovernance(DecommissionGovernanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DecommissionGovernance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DecommissionGovernanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DecommissionGovernanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteAccountFactoryBaseline  DeleteAccountFactoryBaselineRequest
     * @return DeleteAccountFactoryBaselineResponse
     */
    @Override
    public CompletableFuture<DeleteAccountFactoryBaselineResponse> deleteAccountFactoryBaseline(DeleteAccountFactoryBaselineRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteAccountFactoryBaseline").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAccountFactoryBaselineResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAccountFactoryBaselineResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Creates a new resource account or enrolls an existing resource account, and applies the account factory baseline to the account.
     * Account enrollment is an asynchronous process. After an account is created, the account factory baseline is applied to the account. To query the enrollment details and check the baseline application result, call <a href="~~GetEnrolledAccount~~">GetEnrolledAccount</a>.</p>
     * 
     * @param request the request parameters of EnrollAccount  EnrollAccountRequest
     * @return EnrollAccountResponse
     */
    @Override
    public CompletableFuture<EnrollAccountResponse> enrollAccount(EnrollAccountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnrollAccount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnrollAccountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnrollAccountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Generates a governance evaluation report.</p>
     * <blockquote>
     * <ul>
     * <li>This is an asynchronous API. You can check the <code>Finished</code> field in the response to determine the report generation status.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of GenerateEvaluationReport  GenerateEvaluationReportRequest
     * @return GenerateEvaluationReportResponse
     */
    @Override
    public CompletableFuture<GenerateEvaluationReportResponse> generateEvaluationReport(GenerateEvaluationReportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GenerateEvaluationReport").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GenerateEvaluationReportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GenerateEvaluationReportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAccountFactoryBaseline  GetAccountFactoryBaselineRequest
     * @return GetAccountFactoryBaselineResponse
     */
    @Override
    public CompletableFuture<GetAccountFactoryBaselineResponse> getAccountFactoryBaseline(GetAccountFactoryBaselineRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAccountFactoryBaseline").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAccountFactoryBaselineResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAccountFactoryBaselineResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetEnrolledAccount  GetEnrolledAccountRequest
     * @return GetEnrolledAccountResponse
     */
    @Override
    public CompletableFuture<GetEnrolledAccountResponse> getEnrolledAccount(GetEnrolledAccountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetEnrolledAccount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetEnrolledAccountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetEnrolledAccountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>按 RegionId 查询 AI 云治理中心服务状态。开通和关闭均异步执行，调用方应轮询至结果状态。查询成功的 ServiceStatus 为 EnableFailed/DisableFailed 时，失败原因随 FailureCode/FailureMessage 返回，仍属于成功查询。Enabling/Disabling 是进行中状态；开通补偿未完成或补偿失败后继续补偿时仍为 Enabling。仅缺失/非法地域、地域与 endpoint 不匹配、无权限等请求问题走错误响应；不得将子服务的业务失败转为查询请求失败。既有开通记录保持原有兼容口径；本次 API 新发起开通仅在 AI 云治理中心和治理成熟度检测均开通成功后返回 Enabled。</p>
     * 
     * @param request the request parameters of GetGovernanceServiceStatus  GetGovernanceServiceStatusRequest
     * @return GetGovernanceServiceStatusResponse
     */
    @Override
    public CompletableFuture<GetGovernanceServiceStatusResponse> getGovernanceServiceStatus(GetGovernanceServiceStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetGovernanceServiceStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetGovernanceServiceStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetGovernanceServiceStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAccountFactoryBaselineItems  ListAccountFactoryBaselineItemsRequest
     * @return ListAccountFactoryBaselineItemsResponse
     */
    @Override
    public CompletableFuture<ListAccountFactoryBaselineItemsResponse> listAccountFactoryBaselineItems(ListAccountFactoryBaselineItemsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAccountFactoryBaselineItems").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAccountFactoryBaselineItemsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAccountFactoryBaselineItemsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAccountFactoryBaselines  ListAccountFactoryBaselinesRequest
     * @return ListAccountFactoryBaselinesResponse
     */
    @Override
    public CompletableFuture<ListAccountFactoryBaselinesResponse> listAccountFactoryBaselines(ListAccountFactoryBaselinesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAccountFactoryBaselines").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAccountFactoryBaselinesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAccountFactoryBaselinesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListEnrolledAccounts  ListEnrolledAccountsRequest
     * @return ListEnrolledAccountsResponse
     */
    @Override
    public CompletableFuture<ListEnrolledAccountsResponse> listEnrolledAccounts(ListEnrolledAccountsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListEnrolledAccounts").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListEnrolledAccountsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListEnrolledAccountsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListEvaluationMetadata  ListEvaluationMetadataRequest
     * @return ListEvaluationMetadataResponse
     */
    @Override
    public CompletableFuture<ListEvaluationMetadataResponse> listEvaluationMetadata(ListEvaluationMetadataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListEvaluationMetadata").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListEvaluationMetadataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListEvaluationMetadataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListEvaluationMetricDetails  ListEvaluationMetricDetailsRequest
     * @return ListEvaluationMetricDetailsResponse
     */
    @Override
    public CompletableFuture<ListEvaluationMetricDetailsResponse> listEvaluationMetricDetails(ListEvaluationMetricDetailsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListEvaluationMetricDetails").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListEvaluationMetricDetailsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListEvaluationMetricDetailsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListEvaluationResults  ListEvaluationResultsRequest
     * @return ListEvaluationResultsResponse
     */
    @Override
    public CompletableFuture<ListEvaluationResultsResponse> listEvaluationResults(ListEvaluationResultsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListEvaluationResults").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListEvaluationResultsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListEvaluationResultsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListEvaluationScoreHistory  ListEvaluationScoreHistoryRequest
     * @return ListEvaluationScoreHistoryResponse
     */
    @Override
    public CompletableFuture<ListEvaluationScoreHistoryResponse> listEvaluationScoreHistory(ListEvaluationScoreHistoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListEvaluationScoreHistory").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListEvaluationScoreHistoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListEvaluationScoreHistoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Asynchronously enables AI Cloud Governance Center for the specified region ID. This process first enables the AI Cloud Governance Center service and then enables governance maturity detection, excluding the Landing Zone. A successful request only indicates that the request is accepted, not that the enabling process is complete. Use GetGovernanceServiceStatus to poll until the final status is reached. If any step fails, the system automatically cleans up the partially enabled components. During the cleanup process, including subsequent compensation attempts after initial failures, the status remains Enabling. The status changes to EnableFailed only after the cleanup is complete. You can initiate the enabling process when the status is Disabled or EnableFailed. If the status is Enabled, the system returns InvalidStatus.AlreadyEnabled. If the status is DisableFailed, the system returns InvalidStatus.NotAllowed. If the status is Enabling or Disabling, the system returns InvalidStatus.OperationInProgress. Existing services remain compatible, and newly initiated enabling processes execute the complete two-step enabling workflow.</p>
     * 
     * @param request the request parameters of OpenGovernanceService  OpenGovernanceServiceRequest
     * @return OpenGovernanceServiceResponse
     */
    @Override
    public CompletableFuture<OpenGovernanceServiceResponse> openGovernanceService(OpenGovernanceServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OpenGovernanceService").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OpenGovernanceServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OpenGovernanceServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RunEvaluation  RunEvaluationRequest
     * @return RunEvaluationResponse
     */
    @Override
    public CompletableFuture<RunEvaluationResponse> runEvaluation(RunEvaluationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RunEvaluation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RunEvaluationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RunEvaluationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateAccountFactoryBaseline  UpdateAccountFactoryBaselineRequest
     * @return UpdateAccountFactoryBaselineResponse
     */
    @Override
    public CompletableFuture<UpdateAccountFactoryBaselineResponse> updateAccountFactoryBaseline(UpdateAccountFactoryBaselineRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateAccountFactoryBaseline").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAccountFactoryBaselineResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAccountFactoryBaselineResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
