// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.farui20240628;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.farui20240628.models.*;
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
     * @param request the request parameters of RunContractResultGeneration  RunContractResultGenerationRequest
     * @return RunContractResultGenerationResponse
     */
    CompletableFuture<RunContractResultGenerationResponse> runContractResultGeneration(RunContractResultGenerationRequest request);

    ResponseIterable<RunContractResultGenerationResponseBody> runContractResultGenerationWithResponseIterable(RunContractResultGenerationRequest request);

    /**
     * @param request the request parameters of RunContractRuleGeneration  RunContractRuleGenerationRequest
     * @return RunContractRuleGenerationResponse
     */
    CompletableFuture<RunContractRuleGenerationResponse> runContractRuleGeneration(RunContractRuleGenerationRequest request);

    ResponseIterable<RunContractRuleGenerationResponseBody> runContractRuleGenerationWithResponseIterable(RunContractRuleGenerationRequest request);

    /**
     * @param request the request parameters of RunLegalAdviceConsultation  RunLegalAdviceConsultationRequest
     * @return RunLegalAdviceConsultationResponse
     */
    CompletableFuture<RunLegalAdviceConsultationResponse> runLegalAdviceConsultation(RunLegalAdviceConsultationRequest request);

    ResponseIterable<RunLegalAdviceConsultationResponseBody> runLegalAdviceConsultationWithResponseIterable(RunLegalAdviceConsultationRequest request);

    /**
     * @param request the request parameters of RunSearchCaseFullText  RunSearchCaseFullTextRequest
     * @return RunSearchCaseFullTextResponse
     */
    CompletableFuture<RunSearchCaseFullTextResponse> runSearchCaseFullText(RunSearchCaseFullTextRequest request);

    /**
     * @param request the request parameters of RunSearchLawQuery  RunSearchLawQueryRequest
     * @return RunSearchLawQueryResponse
     */
    CompletableFuture<RunSearchLawQueryResponse> runSearchLawQuery(RunSearchLawQueryRequest request);

}
