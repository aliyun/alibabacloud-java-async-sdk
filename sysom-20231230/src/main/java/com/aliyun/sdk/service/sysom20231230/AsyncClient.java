// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.sysom20231230.models.*;
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
     * @param request the request parameters of AuthDiagnosis  AuthDiagnosisRequest
     * @return AuthDiagnosisResponse
     */
    CompletableFuture<AuthDiagnosisResponse> authDiagnosis(AuthDiagnosisRequest request);

    /**
     * @param request the request parameters of GenerateCopilotResponse  GenerateCopilotResponseRequest
     * @return GenerateCopilotResponseResponse
     */
    CompletableFuture<GenerateCopilotResponseResponse> generateCopilotResponse(GenerateCopilotResponseRequest request);

    /**
     * @param request the request parameters of GetAbnormalEventsCount  GetAbnormalEventsCountRequest
     * @return GetAbnormalEventsCountResponse
     */
    CompletableFuture<GetAbnormalEventsCountResponse> getAbnormalEventsCount(GetAbnormalEventsCountRequest request);

    /**
     * @param request the request parameters of GetDiagnosisResult  GetDiagnosisResultRequest
     * @return GetDiagnosisResultResponse
     */
    CompletableFuture<GetDiagnosisResultResponse> getDiagnosisResult(GetDiagnosisResultRequest request);

    /**
     * @param request the request parameters of GetHealthPercentage  GetHealthPercentageRequest
     * @return GetHealthPercentageResponse
     */
    CompletableFuture<GetHealthPercentageResponse> getHealthPercentage(GetHealthPercentageRequest request);

    /**
     * @param request the request parameters of InvokeDiagnosis  InvokeDiagnosisRequest
     * @return InvokeDiagnosisResponse
     */
    CompletableFuture<InvokeDiagnosisResponse> invokeDiagnosis(InvokeDiagnosisRequest request);

}
