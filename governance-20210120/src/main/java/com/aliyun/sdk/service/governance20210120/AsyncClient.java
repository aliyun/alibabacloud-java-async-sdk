// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.governance20210120;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.governance20210120.models.*;
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
     * @param request the request parameters of BatchEnrollAccounts  BatchEnrollAccountsRequest
     * @return BatchEnrollAccountsResponse
     */
    CompletableFuture<BatchEnrollAccountsResponse> batchEnrollAccounts(BatchEnrollAccountsRequest request);

    /**
     * @param request the request parameters of CreateAccountFactoryBaseline  CreateAccountFactoryBaselineRequest
     * @return CreateAccountFactoryBaselineResponse
     */
    CompletableFuture<CreateAccountFactoryBaselineResponse> createAccountFactoryBaseline(CreateAccountFactoryBaselineRequest request);

    /**
     * @param request the request parameters of DeleteAccountFactoryBaseline  DeleteAccountFactoryBaselineRequest
     * @return DeleteAccountFactoryBaselineResponse
     */
    CompletableFuture<DeleteAccountFactoryBaselineResponse> deleteAccountFactoryBaseline(DeleteAccountFactoryBaselineRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this API operation to create a new account or manage an existing account and apply the account baseline to the account.
     * Accounts are created in asynchronous mode. After you create an account, you can apply the account baseline to the account. You can call the <a href="~~GetEnrolledAccount~~">GetEnrolledAccount API</a> operation to view the details about the account to obtain the result of applying the account baseline to the account.</p>
     * 
     * @param request the request parameters of EnrollAccount  EnrollAccountRequest
     * @return EnrollAccountResponse
     */
    CompletableFuture<EnrollAccountResponse> enrollAccount(EnrollAccountRequest request);

    /**
     * @param request the request parameters of GetAccountFactoryBaseline  GetAccountFactoryBaselineRequest
     * @return GetAccountFactoryBaselineResponse
     */
    CompletableFuture<GetAccountFactoryBaselineResponse> getAccountFactoryBaseline(GetAccountFactoryBaselineRequest request);

    /**
     * @param request the request parameters of GetEnrolledAccount  GetEnrolledAccountRequest
     * @return GetEnrolledAccountResponse
     */
    CompletableFuture<GetEnrolledAccountResponse> getEnrolledAccount(GetEnrolledAccountRequest request);

    /**
     * @param request the request parameters of ListAccountFactoryBaselineItems  ListAccountFactoryBaselineItemsRequest
     * @return ListAccountFactoryBaselineItemsResponse
     */
    CompletableFuture<ListAccountFactoryBaselineItemsResponse> listAccountFactoryBaselineItems(ListAccountFactoryBaselineItemsRequest request);

    /**
     * @param request the request parameters of ListAccountFactoryBaselines  ListAccountFactoryBaselinesRequest
     * @return ListAccountFactoryBaselinesResponse
     */
    CompletableFuture<ListAccountFactoryBaselinesResponse> listAccountFactoryBaselines(ListAccountFactoryBaselinesRequest request);

    /**
     * @param request the request parameters of ListEnrolledAccounts  ListEnrolledAccountsRequest
     * @return ListEnrolledAccountsResponse
     */
    CompletableFuture<ListEnrolledAccountsResponse> listEnrolledAccounts(ListEnrolledAccountsRequest request);

    /**
     * @param request the request parameters of ListEvaluationMetadata  ListEvaluationMetadataRequest
     * @return ListEvaluationMetadataResponse
     */
    CompletableFuture<ListEvaluationMetadataResponse> listEvaluationMetadata(ListEvaluationMetadataRequest request);

    /**
     * @param request the request parameters of ListEvaluationMetricDetails  ListEvaluationMetricDetailsRequest
     * @return ListEvaluationMetricDetailsResponse
     */
    CompletableFuture<ListEvaluationMetricDetailsResponse> listEvaluationMetricDetails(ListEvaluationMetricDetailsRequest request);

    /**
     * @param request the request parameters of ListEvaluationResults  ListEvaluationResultsRequest
     * @return ListEvaluationResultsResponse
     */
    CompletableFuture<ListEvaluationResultsResponse> listEvaluationResults(ListEvaluationResultsRequest request);

    /**
     * @param request the request parameters of ListEvaluationScoreHistory  ListEvaluationScoreHistoryRequest
     * @return ListEvaluationScoreHistoryResponse
     */
    CompletableFuture<ListEvaluationScoreHistoryResponse> listEvaluationScoreHistory(ListEvaluationScoreHistoryRequest request);

    /**
     * @param request the request parameters of RunEvaluation  RunEvaluationRequest
     * @return RunEvaluationResponse
     */
    CompletableFuture<RunEvaluationResponse> runEvaluation(RunEvaluationRequest request);

    /**
     * @param request the request parameters of UpdateAccountFactoryBaseline  UpdateAccountFactoryBaselineRequest
     * @return UpdateAccountFactoryBaselineResponse
     */
    CompletableFuture<UpdateAccountFactoryBaselineResponse> updateAccountFactoryBaseline(UpdateAccountFactoryBaselineRequest request);

}
