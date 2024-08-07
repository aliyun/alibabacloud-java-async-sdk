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

    CompletableFuture<RunContractResultGenerationResponse> runContractResultGeneration(RunContractResultGenerationRequest request);

    ResponseIterable<RunContractResultGenerationResponseBody> runContractResultGenerationWithResponseIterable(RunContractResultGenerationRequest request);

    CompletableFuture<RunContractRuleGenerationResponse> runContractRuleGeneration(RunContractRuleGenerationRequest request);

    ResponseIterable<RunContractRuleGenerationResponseBody> runContractRuleGenerationWithResponseIterable(RunContractRuleGenerationRequest request);

    CompletableFuture<RunLegalAdviceConsultationResponse> runLegalAdviceConsultation(RunLegalAdviceConsultationRequest request);

    ResponseIterable<RunLegalAdviceConsultationResponseBody> runLegalAdviceConsultationWithResponseIterable(RunLegalAdviceConsultationRequest request);

}
