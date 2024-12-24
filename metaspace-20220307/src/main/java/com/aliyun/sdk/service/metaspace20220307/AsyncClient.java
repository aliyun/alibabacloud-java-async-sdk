// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.metaspace20220307;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.metaspace20220307.models.*;
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
     * @param request the request parameters of ApplyCoordinationWithCode  ApplyCoordinationWithCodeRequest
     * @return ApplyCoordinationWithCodeResponse
     */
    CompletableFuture<ApplyCoordinationWithCodeResponse> applyCoordinationWithCode(ApplyCoordinationWithCodeRequest request);

    /**
     * @param request the request parameters of EndAllCoordinationByOwner  EndAllCoordinationByOwnerRequest
     * @return EndAllCoordinationByOwnerResponse
     */
    CompletableFuture<EndAllCoordinationByOwnerResponse> endAllCoordinationByOwner(EndAllCoordinationByOwnerRequest request);

    /**
     * @param request the request parameters of GenerateCoordinationCode  GenerateCoordinationCodeRequest
     * @return GenerateCoordinationCodeResponse
     */
    CompletableFuture<GenerateCoordinationCodeResponse> generateCoordinationCode(GenerateCoordinationCodeRequest request);

}
