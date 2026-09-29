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
     * <b>description</b> :
     * <p>Applies an account baseline to multiple existing resource accounts at a time.
     * Account enrollment is an asynchronous process. After the accounts are enrolled, the account factory baseline is applied to each account. To query the enrollment details and check the baseline application result, call <a href="https://help.aliyun.com/document_detail/609062.html">GetEnrolledAccount</a>.</p>
     * 
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
     * @param request the request parameters of DecommissionGovernance  DecommissionGovernanceRequest
     * @return DecommissionGovernanceResponse
     */
    CompletableFuture<DecommissionGovernanceResponse> decommissionGovernance(DecommissionGovernanceRequest request);

    /**
     * @param request the request parameters of DeleteAccountFactoryBaseline  DeleteAccountFactoryBaselineRequest
     * @return DeleteAccountFactoryBaselineResponse
     */
    CompletableFuture<DeleteAccountFactoryBaselineResponse> deleteAccountFactoryBaseline(DeleteAccountFactoryBaselineRequest request);

    /**
     * <b>description</b> :
     * <p>Creates a new resource account or enrolls an existing resource account, and applies the account factory baseline to the account.
     * Account enrollment is an asynchronous process. After an account is created, the account factory baseline is applied to the account. To query the enrollment details and check the baseline application result, call <a href="~~GetEnrolledAccount~~">GetEnrolledAccount</a>.</p>
     * 
     * @param request the request parameters of EnrollAccount  EnrollAccountRequest
     * @return EnrollAccountResponse
     */
    CompletableFuture<EnrollAccountResponse> enrollAccount(EnrollAccountRequest request);

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
    CompletableFuture<GenerateEvaluationReportResponse> generateEvaluationReport(GenerateEvaluationReportRequest request);

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
     * @param request the request parameters of OpenGovernanceService  OpenGovernanceServiceRequest
     * @return OpenGovernanceServiceResponse
     */
    CompletableFuture<OpenGovernanceServiceResponse> openGovernanceService(OpenGovernanceServiceRequest request);

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
