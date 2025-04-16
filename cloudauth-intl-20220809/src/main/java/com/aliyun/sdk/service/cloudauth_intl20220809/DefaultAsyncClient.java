// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth_intl20220809;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.cloudauth_intl20220809.models.*;
import darabonba.core.utils.*;
import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;

import java.util.concurrent.CompletableFuture;


/**
 * <p>Main client.</p>
 */
public final class DefaultAsyncClient implements AsyncClient {

    protected final String product;
    protected final String version;
    protected final String endpointRule;
    protected final java.util.Map<String, String> endpointMap;
    protected final TeaRequest REQUEST;
    protected final TeaAsyncHandler handler;

    protected DefaultAsyncClient(ClientConfiguration configuration) {
        this.handler = new TeaAsyncHandler(configuration);
        this.product = "Cloudauth-intl";
        this.version = "2022-08-09";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @deprecated OpenAPI CardOcr is deprecated, please use Cloudauth-intl::2022-08-09::DocOcr instead.  * @param request  the request parameters of CardOcr  CardOcrRequest
     * @return CardOcrResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<CardOcrResponse> cardOcr(CardOcrRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CardOcr").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CardOcrResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CardOcrResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CheckResult  CheckResultRequest
     * @return CheckResultResponse
     */
    @Override
    public CompletableFuture<CheckResultResponse> checkResult(CheckResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CheckResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CheckVerifyLog  CheckVerifyLogRequest
     * @return CheckVerifyLogResponse
     */
    @Override
    public CompletableFuture<CheckVerifyLogResponse> checkVerifyLog(CheckVerifyLogRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CheckVerifyLog").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckVerifyLogResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckVerifyLogResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeepfakeDetectIntl  DeepfakeDetectIntlRequest
     * @return DeepfakeDetectIntlResponse
     */
    @Override
    public CompletableFuture<DeepfakeDetectIntlResponse> deepfakeDetectIntl(DeepfakeDetectIntlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeepfakeDetectIntl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeepfakeDetectIntlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeepfakeDetectIntlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteVerifyResult  DeleteVerifyResultRequest
     * @return DeleteVerifyResultResponse
     */
    @Override
    public CompletableFuture<DeleteVerifyResultResponse> deleteVerifyResult(DeleteVerifyResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteVerifyResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteVerifyResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteVerifyResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DocOcr  DocOcrRequest
     * @return DocOcrResponse
     */
    @Override
    public CompletableFuture<DocOcrResponse> docOcr(DocOcrRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DocOcr").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DocOcrResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DocOcrResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EkycVerify  EkycVerifyRequest
     * @return EkycVerifyResponse
     */
    @Override
    public CompletableFuture<EkycVerifyResponse> ekycVerify(EkycVerifyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EkycVerify").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EkycVerifyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EkycVerifyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of FaceCompare  FaceCompareRequest
     * @return FaceCompareResponse
     */
    @Override
    public CompletableFuture<FaceCompareResponse> faceCompare(FaceCompareRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("FaceCompare").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FaceCompareResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FaceCompareResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of FaceGuardRisk  FaceGuardRiskRequest
     * @return FaceGuardRiskResponse
     */
    @Override
    public CompletableFuture<FaceGuardRiskResponse> faceGuardRisk(FaceGuardRiskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("FaceGuardRisk").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FaceGuardRiskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FaceGuardRiskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of FaceLiveness  FaceLivenessRequest
     * @return FaceLivenessResponse
     */
    @Override
    public CompletableFuture<FaceLivenessResponse> faceLiveness(FaceLivenessRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("FaceLiveness").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FaceLivenessResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FaceLivenessResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of FraudResultCallBack  FraudResultCallBackRequest
     * @return FraudResultCallBackResponse
     */
    @Override
    public CompletableFuture<FraudResultCallBackResponse> fraudResultCallBack(FraudResultCallBackRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("FraudResultCallBack").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FraudResultCallBackResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FraudResultCallBackResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of Id2MetaPeriodVerifyIntl  Id2MetaPeriodVerifyIntlRequest
     * @return Id2MetaPeriodVerifyIntlResponse
     */
    @Override
    public CompletableFuture<Id2MetaPeriodVerifyIntlResponse> id2MetaPeriodVerifyIntl(Id2MetaPeriodVerifyIntlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("Id2MetaPeriodVerifyIntl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(Id2MetaPeriodVerifyIntlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<Id2MetaPeriodVerifyIntlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of Id2MetaVerifyIntl  Id2MetaVerifyIntlRequest
     * @return Id2MetaVerifyIntlResponse
     */
    @Override
    public CompletableFuture<Id2MetaVerifyIntlResponse> id2MetaVerifyIntl(Id2MetaVerifyIntlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("Id2MetaVerifyIntl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(Id2MetaVerifyIntlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<Id2MetaVerifyIntlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of Initialize  InitializeRequest
     * @return InitializeResponse
     */
    @Override
    public CompletableFuture<InitializeResponse> initialize(InitializeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("Initialize").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InitializeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InitializeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of Mobile3MetaVerifyIntl  Mobile3MetaVerifyIntlRequest
     * @return Mobile3MetaVerifyIntlResponse
     */
    @Override
    public CompletableFuture<Mobile3MetaVerifyIntlResponse> mobile3MetaVerifyIntl(Mobile3MetaVerifyIntlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("Mobile3MetaVerifyIntl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(Mobile3MetaVerifyIntlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<Mobile3MetaVerifyIntlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
