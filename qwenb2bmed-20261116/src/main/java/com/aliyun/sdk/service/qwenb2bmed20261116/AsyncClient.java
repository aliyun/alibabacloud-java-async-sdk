// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qwenb2bmed20261116;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.qwenb2bmed20261116.models.*;
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
     * @param request the request parameters of MedicalAgentChat  MedicalAgentChatRequest
     * @return MedicalAgentChatResponse
     */
    CompletableFuture<MedicalAgentChatResponse> medicalAgentChat(MedicalAgentChatRequest request);

    ResponseIterable<MedicalAgentChatResponseBody> medicalAgentChatWithResponseIterable(MedicalAgentChatRequest request);

    /**
     * @param request the request parameters of MedicalModelInference  MedicalModelInferenceRequest
     * @return MedicalModelInferenceResponse
     */
    CompletableFuture<MedicalModelInferenceResponse> medicalModelInference(MedicalModelInferenceRequest request);

    ResponseIterable<MedicalModelInferenceResponseBody> medicalModelInferenceWithResponseIterable(MedicalModelInferenceRequest request);

    /**
     * @param request the request parameters of OpenService  OpenServiceRequest
     * @return OpenServiceResponse
     */
    CompletableFuture<OpenServiceResponse> openService(OpenServiceRequest request);

}
