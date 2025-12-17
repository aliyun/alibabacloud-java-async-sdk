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
     * <b>description</b> :
     * <p>API for comparing two addresses, standardizing and checking address consistency.</p>
     * 
     * @param request the request parameters of AddressCompareIntl  AddressCompareIntlRequest
     * @return AddressCompareIntlResponse
     */
    @Override
    public CompletableFuture<AddressCompareIntlResponse> addressCompareIntl(AddressCompareIntlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddressCompareIntl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddressCompareIntlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddressCompareIntlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI AddressVerifyIntl is deprecated, please use Cloudauth-intl::2022-08-09::AddressVerifyV2Intl instead.  * @description Based on the operator\\"s capabilities, input the phone number and address (or latitude and longitude) to verify whether the provided address is the user\\"s usual residence.
     * 
     * @param request the request parameters of AddressVerifyIntl  AddressVerifyIntlRequest
     * @return AddressVerifyIntlResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<AddressVerifyIntlResponse> addressVerifyIntl(AddressVerifyIntlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddressVerifyIntl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddressVerifyIntlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddressVerifyIntlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddressVerifyV2Intl  AddressVerifyV2IntlRequest
     * @return AddressVerifyV2IntlResponse
     */
    @Override
    public CompletableFuture<AddressVerifyV2IntlResponse> addressVerifyV2Intl(AddressVerifyV2IntlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddressVerifyV2Intl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddressVerifyV2IntlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddressVerifyV2IntlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Verification of bank card elements, including: two-element verification (name + bank card number), three-element verification (name + ID number + bank card number), and four-element verification (name + ID number + phone number + bank card number) for consistency.</p>
     * 
     * @param request the request parameters of BankMetaVerifyIntl  BankMetaVerifyIntlRequest
     * @return BankMetaVerifyIntlResponse
     */
    @Override
    public CompletableFuture<BankMetaVerifyIntlResponse> bankMetaVerifyIntl(BankMetaVerifyIntlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BankMetaVerifyIntl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BankMetaVerifyIntlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BankMetaVerifyIntlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
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
     * <b>description</b> :
     * <p>After obtaining the TransactionId, you can use this interface on the server side to get the corresponding authentication result.</p>
     * 
     * @param request the request parameters of CredentialGetResultIntl  CredentialGetResultIntlRequest
     * @return CredentialGetResultIntlResponse
     */
    @Override
    public CompletableFuture<CredentialGetResultIntlResponse> credentialGetResultIntl(CredentialGetResultIntlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CredentialGetResultIntl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CredentialGetResultIntlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CredentialGetResultIntlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Detects whether a voucher (such as water, electricity, gas, credit card, etc., e-bills) is forged using AI technology and extracts key information from the voucher.</p>
     * 
     * @param request the request parameters of CredentialRecognitionIntl  CredentialRecognitionIntlRequest
     * @return CredentialRecognitionIntlResponse
     */
    @Override
    public CompletableFuture<CredentialRecognitionIntlResponse> credentialRecognitionIntl(CredentialRecognitionIntlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CredentialRecognitionIntl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CredentialRecognitionIntlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CredentialRecognitionIntlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Initialization interface for credential recognition OCR, through which you can obtain the transactionId.</p>
     * 
     * @param request the request parameters of CredentialSubmitIntl  CredentialSubmitIntlRequest
     * @return CredentialSubmitIntlResponse
     */
    @Override
    public CompletableFuture<CredentialSubmitIntlResponse> credentialSubmitIntl(CredentialSubmitIntlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CredentialSubmitIntl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CredentialSubmitIntlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CredentialSubmitIntlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Input a face image and use the algorithm to detect if there is a risk of deep forgery. This includes risk scenarios such as AIGC-generated faces, deepfake face swapping, template faces, and rephotographed faces, and outputs risk labels and confidence levels.</p>
     * 
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
     * @param request the request parameters of DeleteFaceGroup  DeleteFaceGroupRequest
     * @return DeleteFaceGroupResponse
     */
    @Override
    public CompletableFuture<DeleteFaceGroupResponse> deleteFaceGroup(DeleteFaceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteFaceGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteFaceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteFaceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteFaceRecord  DeleteFaceRecordRequest
     * @return DeleteFaceRecordResponse
     */
    @Override
    public CompletableFuture<DeleteFaceRecordResponse> deleteFaceRecord(DeleteFaceRecordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteFaceRecord").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteFaceRecordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteFaceRecordResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of DocOcrMax  DocOcrMaxRequest
     * @return DocOcrMaxResponse
     */
    @Override
    public CompletableFuture<DocOcrMaxResponse> docOcrMax(DocOcrMaxRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DocOcrMax").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DocOcrMaxResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DocOcrMaxResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DownloadVerifyRecordIntl  DownloadVerifyRecordIntlRequest
     * @return DownloadVerifyRecordIntlResponse
     */
    @Override
    public CompletableFuture<DownloadVerifyRecordIntlResponse> downloadVerifyRecordIntl(DownloadVerifyRecordIntlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DownloadVerifyRecordIntl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DownloadVerifyRecordIntlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DownloadVerifyRecordIntlResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of FaceCrossCompareIntl  FaceCrossCompareIntlRequest
     * @return FaceCrossCompareIntlResponse
     */
    @Override
    public CompletableFuture<FaceCrossCompareIntlResponse> faceCrossCompareIntl(FaceCrossCompareIntlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("FaceCrossCompareIntl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FaceCrossCompareIntlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FaceCrossCompareIntlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of FaceDuplicationCheckIntl  FaceDuplicationCheckIntlRequest
     * @return FaceDuplicationCheckIntlResponse
     */
    @Override
    public CompletableFuture<FaceDuplicationCheckIntlResponse> faceDuplicationCheckIntl(FaceDuplicationCheckIntlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("FaceDuplicationCheckIntl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FaceDuplicationCheckIntlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FaceDuplicationCheckIntlResponse> future = new CompletableFuture<>();
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
     * @deprecated OpenAPI FraudResultCallBack is deprecated  * @param request  the request parameters of FraudResultCallBack  FraudResultCallBackRequest
     * @return FraudResultCallBackResponse
     */
    @Deprecated
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
     * @param request the request parameters of KeepaliveIntl  KeepaliveIntlRequest
     * @return KeepaliveIntlResponse
     */
    @Override
    public CompletableFuture<KeepaliveIntlResponse> keepaliveIntl(KeepaliveIntlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("KeepaliveIntl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(KeepaliveIntlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<KeepaliveIntlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of Mobile2MetaVerifyIntl  Mobile2MetaVerifyIntlRequest
     * @return Mobile2MetaVerifyIntlResponse
     */
    @Override
    public CompletableFuture<Mobile2MetaVerifyIntlResponse> mobile2MetaVerifyIntl(Mobile2MetaVerifyIntlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("Mobile2MetaVerifyIntl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(Mobile2MetaVerifyIntlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<Mobile2MetaVerifyIntlResponse> future = new CompletableFuture<>();
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

    /**
     * @param request the request parameters of ModifyFaceGroup  ModifyFaceGroupRequest
     * @return ModifyFaceGroupResponse
     */
    @Override
    public CompletableFuture<ModifyFaceGroupResponse> modifyFaceGroup(ModifyFaceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyFaceGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyFaceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyFaceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyFaceRecord  ModifyFaceRecordRequest
     * @return ModifyFaceRecordResponse
     */
    @Override
    public CompletableFuture<ModifyFaceRecordResponse> modifyFaceRecord(ModifyFaceRecordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyFaceRecord").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyFaceRecordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyFaceRecordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryFaceGroup  QueryFaceGroupRequest
     * @return QueryFaceGroupResponse
     */
    @Override
    public CompletableFuture<QueryFaceGroupResponse> queryFaceGroup(QueryFaceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryFaceGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryFaceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryFaceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryFaceRecord  QueryFaceRecordRequest
     * @return QueryFaceRecordResponse
     */
    @Override
    public CompletableFuture<QueryFaceRecordResponse> queryFaceRecord(QueryFaceRecordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryFaceRecord").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryFaceRecordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryFaceRecordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TempAccessTokenIntl  TempAccessTokenIntlRequest
     * @return TempAccessTokenIntlResponse
     */
    @Override
    public CompletableFuture<TempAccessTokenIntlResponse> tempAccessTokenIntl(TempAccessTokenIntlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TempAccessTokenIntl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TempAccessTokenIntlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TempAccessTokenIntlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TempOssUrlIntl  TempOssUrlIntlRequest
     * @return TempOssUrlIntlResponse
     */
    @Override
    public CompletableFuture<TempOssUrlIntlResponse> tempOssUrlIntl(TempOssUrlIntlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TempOssUrlIntl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TempOssUrlIntlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TempOssUrlIntlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
