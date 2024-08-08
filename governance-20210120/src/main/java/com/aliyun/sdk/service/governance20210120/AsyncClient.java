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

    CompletableFuture<BatchEnrollAccountsResponse> batchEnrollAccounts(BatchEnrollAccountsRequest request);

    CompletableFuture<CreateAccountFactoryBaselineResponse> createAccountFactoryBaseline(CreateAccountFactoryBaselineRequest request);

    CompletableFuture<DeleteAccountFactoryBaselineResponse> deleteAccountFactoryBaseline(DeleteAccountFactoryBaselineRequest request);

    /**
      * You can call this API operation to create a new account or manage an existing account and apply the account baseline to the account.
      * Accounts are created in asynchronous mode. After you create an account, you can apply the account baseline to the account. You can call the [GetEnrolledAccount API](~~GetEnrolledAccount~~) operation to view the details about the account to obtain the result of applying the account baseline to the account.
      *
     */
    CompletableFuture<EnrollAccountResponse> enrollAccount(EnrollAccountRequest request);

    CompletableFuture<GetAccountFactoryBaselineResponse> getAccountFactoryBaseline(GetAccountFactoryBaselineRequest request);

    CompletableFuture<GetEnrolledAccountResponse> getEnrolledAccount(GetEnrolledAccountRequest request);

    CompletableFuture<ListAccountFactoryBaselineItemsResponse> listAccountFactoryBaselineItems(ListAccountFactoryBaselineItemsRequest request);

    CompletableFuture<ListAccountFactoryBaselinesResponse> listAccountFactoryBaselines(ListAccountFactoryBaselinesRequest request);

    CompletableFuture<ListEnrolledAccountsResponse> listEnrolledAccounts(ListEnrolledAccountsRequest request);

    CompletableFuture<ListEvaluationMetadataResponse> listEvaluationMetadata(ListEvaluationMetadataRequest request);

    CompletableFuture<ListEvaluationMetricDetailsResponse> listEvaluationMetricDetails(ListEvaluationMetricDetailsRequest request);

    CompletableFuture<ListEvaluationResultsResponse> listEvaluationResults(ListEvaluationResultsRequest request);

    CompletableFuture<ListEvaluationScoreHistoryResponse> listEvaluationScoreHistory(ListEvaluationScoreHistoryRequest request);

    CompletableFuture<RunEvaluationResponse> runEvaluation(RunEvaluationRequest request);

    CompletableFuture<UpdateAccountFactoryBaselineResponse> updateAccountFactoryBaseline(UpdateAccountFactoryBaselineRequest request);

}
