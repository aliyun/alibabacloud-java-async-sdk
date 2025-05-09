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
     * <p>You can call this operation to apply an account baseline to existing resource accounts.
     * Accounts are enrolled in the account factory in asynchronous mode. After a resource account is created, an account baseline is applied to the account. You can call the <a href="https://help.aliyun.com/document_detail/609062.html">GetEnrolledAccount</a> operation to query the details of the account enrolled in the account factory and check whether the account baseline is applied to the account.</p>
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
     * <p>You can call this API operation to create a new account or manage an existing account and apply the account baseline to the account.
     * Accounts are created in asynchronous mode. After you create an account, you can apply the account baseline to the account. You can call the <a href="~~GetEnrolledAccount~~">GetEnrolledAccount API</a> operation to view the details about the account to obtain the result of applying the account baseline to the account.</p>
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
