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
     * @deprecated OpenAPI CardOcr is deprecated, please use Cloudauth-intl::2022-08-09::DocOcr instead.  * @param request  the request parameters of CardOcr  CardOcrRequest
     * @return CardOcrResponse
     */
    @Deprecated
    CompletableFuture<CardOcrResponse> cardOcr(CardOcrRequest request);

    /**
     * @param request the request parameters of CheckResult  CheckResultRequest
     * @return CheckResultResponse
     */
    CompletableFuture<CheckResultResponse> checkResult(CheckResultRequest request);

    /**
     * @param request the request parameters of CheckVerifyLog  CheckVerifyLogRequest
     * @return CheckVerifyLogResponse
     */
    CompletableFuture<CheckVerifyLogResponse> checkVerifyLog(CheckVerifyLogRequest request);

    /**
     * @param request the request parameters of DeleteVerifyResult  DeleteVerifyResultRequest
     * @return DeleteVerifyResultResponse
     */
    CompletableFuture<DeleteVerifyResultResponse> deleteVerifyResult(DeleteVerifyResultRequest request);

    /**
     * @param request the request parameters of DocOcr  DocOcrRequest
     * @return DocOcrResponse
     */
    CompletableFuture<DocOcrResponse> docOcr(DocOcrRequest request);

    /**
     * @param request the request parameters of EkycVerify  EkycVerifyRequest
     * @return EkycVerifyResponse
     */
    CompletableFuture<EkycVerifyResponse> ekycVerify(EkycVerifyRequest request);

    /**
     * @param request the request parameters of FaceCompare  FaceCompareRequest
     * @return FaceCompareResponse
     */
    CompletableFuture<FaceCompareResponse> faceCompare(FaceCompareRequest request);

    /**
     * @param request the request parameters of FaceGuardRisk  FaceGuardRiskRequest
     * @return FaceGuardRiskResponse
     */
    CompletableFuture<FaceGuardRiskResponse> faceGuardRisk(FaceGuardRiskRequest request);

    /**
     * @param request the request parameters of FaceLiveness  FaceLivenessRequest
     * @return FaceLivenessResponse
     */
    CompletableFuture<FaceLivenessResponse> faceLiveness(FaceLivenessRequest request);

    /**
     * @param request the request parameters of FraudResultCallBack  FraudResultCallBackRequest
     * @return FraudResultCallBackResponse
     */
    CompletableFuture<FraudResultCallBackResponse> fraudResultCallBack(FraudResultCallBackRequest request);

    /**
     * @param request the request parameters of Id2MetaPeriodVerifyIntl  Id2MetaPeriodVerifyIntlRequest
     * @return Id2MetaPeriodVerifyIntlResponse
     */
    CompletableFuture<Id2MetaPeriodVerifyIntlResponse> id2MetaPeriodVerifyIntl(Id2MetaPeriodVerifyIntlRequest request);

    /**
     * @param request the request parameters of Id2MetaVerifyIntl  Id2MetaVerifyIntlRequest
     * @return Id2MetaVerifyIntlResponse
     */
    CompletableFuture<Id2MetaVerifyIntlResponse> id2MetaVerifyIntl(Id2MetaVerifyIntlRequest request);

    /**
     * @param request the request parameters of Initialize  InitializeRequest
     * @return InitializeResponse
     */
    CompletableFuture<InitializeResponse> initialize(InitializeRequest request);

    /**
     * @param request the request parameters of Mobile3MetaVerifyIntl  Mobile3MetaVerifyIntlRequest
     * @return Mobile3MetaVerifyIntlResponse
     */
    CompletableFuture<Mobile3MetaVerifyIntlResponse> mobile3MetaVerifyIntl(Mobile3MetaVerifyIntlRequest request);

}
