// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth_intl20220809;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.cloudauth_intl20220809.models.*;
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
     * @deprecated 
     */
    @Deprecated
    CompletableFuture<CardOcrResponse> cardOcr(CardOcrRequest request);

    CompletableFuture<CheckResultResponse> checkResult(CheckResultRequest request);

    CompletableFuture<DeleteVerifyResultResponse> deleteVerifyResult(DeleteVerifyResultRequest request);

    CompletableFuture<DocOcrResponse> docOcr(DocOcrRequest request);

    CompletableFuture<EkycVerifyResponse> ekycVerify(EkycVerifyRequest request);

    CompletableFuture<FaceCompareResponse> faceCompare(FaceCompareRequest request);

    CompletableFuture<FaceLivenessResponse> faceLiveness(FaceLivenessRequest request);

    CompletableFuture<FraudResultCallBackResponse> fraudResultCallBack(FraudResultCallBackRequest request);

    CompletableFuture<Id2MetaVerifyIntlResponse> id2MetaVerifyIntl(Id2MetaVerifyIntlRequest request);

    CompletableFuture<InitializeResponse> initialize(InitializeRequest request);

    CompletableFuture<Mobile3MetaVerifyIntlResponse> mobile3MetaVerifyIntl(Mobile3MetaVerifyIntlRequest request);

}
