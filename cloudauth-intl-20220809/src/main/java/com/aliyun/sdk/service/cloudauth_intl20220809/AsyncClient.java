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
     * <b>description</b> :
     * <p>Standardizes and compares two addresses to check for consistency.</p>
     * 
     * @param request the request parameters of AddressCompareIntl  AddressCompareIntlRequest
     * @return AddressCompareIntlResponse
     */
    CompletableFuture<AddressCompareIntlResponse> addressCompareIntl(AddressCompareIntlRequest request);

    /**
     * @deprecated OpenAPI AddressVerifyIntl is deprecated, please use Cloudauth-intl::2022-08-09::AddressVerifyV2Intl instead.  * @description Verifies whether a provided address belongs to the regular residence of a user based on carrier capabilities by using a mobile phone number and an address or coordinates.
     * 
     * @param request the request parameters of AddressVerifyIntl  AddressVerifyIntlRequest
     * @return AddressVerifyIntlResponse
     */
    @Deprecated
    CompletableFuture<AddressVerifyIntlResponse> addressVerifyIntl(AddressVerifyIntlRequest request);

    /**
     * @param request the request parameters of AddressVerifyV2Intl  AddressVerifyV2IntlRequest
     * @return AddressVerifyV2IntlResponse
     */
    CompletableFuture<AddressVerifyV2IntlResponse> addressVerifyV2Intl(AddressVerifyV2IntlRequest request);

    /**
     * <b>description</b> :
     * <p>Verifies bank card information, including two-element verification (name and bank card number), three-element verification (name, ID card number, and bank card number), and four-element verification (name, ID card number, mobile phone number, and bank card number).</p>
     * 
     * @param request the request parameters of BankMetaVerifyIntl  BankMetaVerifyIntlRequest
     * @return BankMetaVerifyIntlResponse
     */
    CompletableFuture<BankMetaVerifyIntlResponse> bankMetaVerifyIntl(BankMetaVerifyIntlRequest request);

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
     * <b>description</b> :
     * <p>After you obtain the TransactionId, you can call this operation on the server to retrieve the corresponding authentication results.</p>
     * 
     * @param request the request parameters of CredentialGetResultIntl  CredentialGetResultIntlRequest
     * @return CredentialGetResultIntlResponse
     */
    CompletableFuture<CredentialGetResultIntlResponse> credentialGetResultIntl(CredentialGetResultIntlRequest request);

    /**
     * <b>description</b> :
     * <p>Uses AI technology to detect whether credential documents, such as electronic utility bills and credit card statements, are forged, and extracts key information from the documents.</p>
     * 
     * @param request the request parameters of CredentialRecognitionIntl  CredentialRecognitionIntlRequest
     * @return CredentialRecognitionIntlResponse
     */
    CompletableFuture<CredentialRecognitionIntlResponse> credentialRecognitionIntl(CredentialRecognitionIntlRequest request);

    /**
     * <b>description</b> :
     * <p>Initializes the credential recognition OCR process and retrieves a transaction ID.</p>
     * 
     * @param request the request parameters of CredentialSubmitIntl  CredentialSubmitIntlRequest
     * @return CredentialSubmitIntlResponse
     */
    CompletableFuture<CredentialSubmitIntlResponse> credentialSubmitIntl(CredentialSubmitIntlRequest request);

    /**
     * <b>description</b> :
     * <p>Accepts face images and uses algorithms to detect deepfake risks. Covers risk scenarios such as AIGC-generated faces, deepfake face swaps, template faces, and recaptured faces, and outputs risk tags and confidence scores.</p>
     * 
     * @param request the request parameters of DeepfakeDetectIntl  DeepfakeDetectIntlRequest
     * @return DeepfakeDetectIntlResponse
     */
    CompletableFuture<DeepfakeDetectIntlResponse> deepfakeDetectIntl(DeepfakeDetectIntlRequest request);

    /**
     * @param request the request parameters of DeleteFaceGroup  DeleteFaceGroupRequest
     * @return DeleteFaceGroupResponse
     */
    CompletableFuture<DeleteFaceGroupResponse> deleteFaceGroup(DeleteFaceGroupRequest request);

    /**
     * @param request the request parameters of DeleteFaceRecord  DeleteFaceRecordRequest
     * @return DeleteFaceRecordResponse
     */
    CompletableFuture<DeleteFaceRecordResponse> deleteFaceRecord(DeleteFaceRecordRequest request);

    /**
     * @param request the request parameters of DeleteFaceRecordV2  DeleteFaceRecordV2Request
     * @return DeleteFaceRecordV2Response
     */
    CompletableFuture<DeleteFaceRecordV2Response> deleteFaceRecordV2(DeleteFaceRecordV2Request request);

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
     * @param request the request parameters of DocOcrMax  DocOcrMaxRequest
     * @return DocOcrMaxResponse
     */
    CompletableFuture<DocOcrMaxResponse> docOcrMax(DocOcrMaxRequest request);

    /**
     * @param request the request parameters of DownloadVerifyRecordIntl  DownloadVerifyRecordIntlRequest
     * @return DownloadVerifyRecordIntlResponse
     */
    CompletableFuture<DownloadVerifyRecordIntlResponse> downloadVerifyRecordIntl(DownloadVerifyRecordIntlRequest request);

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
     * @param request the request parameters of FaceCrossCompareIntl  FaceCrossCompareIntlRequest
     * @return FaceCrossCompareIntlResponse
     */
    CompletableFuture<FaceCrossCompareIntlResponse> faceCrossCompareIntl(FaceCrossCompareIntlRequest request);

    /**
     * @param request the request parameters of FaceDuplicationCheckIntl  FaceDuplicationCheckIntlRequest
     * @return FaceDuplicationCheckIntlResponse
     */
    CompletableFuture<FaceDuplicationCheckIntlResponse> faceDuplicationCheckIntl(FaceDuplicationCheckIntlRequest request);

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
     * @deprecated OpenAPI FraudResultCallBack is deprecated  * @param request  the request parameters of FraudResultCallBack  FraudResultCallBackRequest
     * @return FraudResultCallBackResponse
     */
    @Deprecated
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
     * <b>description</b> :
     * <p>Maintains client connections.</p>
     * 
     * @param request the request parameters of KeepaliveIntl  KeepaliveIntlRequest
     * @return KeepaliveIntlResponse
     */
    CompletableFuture<KeepaliveIntlResponse> keepaliveIntl(KeepaliveIntlRequest request);

    /**
     * <b>description</b> :
     * <p>Verifies the authenticity and consistency of a mobile phone number and name against authoritative data sources. Before using this API operation, make sure that you fully understand the billing method and pricing of the mobile phone number and name verification service.</p>
     * 
     * @param request the request parameters of Mobile2MetaVerifyIntl  Mobile2MetaVerifyIntlRequest
     * @return Mobile2MetaVerifyIntlResponse
     */
    CompletableFuture<Mobile2MetaVerifyIntlResponse> mobile2MetaVerifyIntl(Mobile2MetaVerifyIntlRequest request);

    /**
     * @param request the request parameters of Mobile3MetaVerifyIntl  Mobile3MetaVerifyIntlRequest
     * @return Mobile3MetaVerifyIntlResponse
     */
    CompletableFuture<Mobile3MetaVerifyIntlResponse> mobile3MetaVerifyIntl(Mobile3MetaVerifyIntlRequest request);

    /**
     * @param request the request parameters of ModifyFaceGroup  ModifyFaceGroupRequest
     * @return ModifyFaceGroupResponse
     */
    CompletableFuture<ModifyFaceGroupResponse> modifyFaceGroup(ModifyFaceGroupRequest request);

    /**
     * @param request the request parameters of ModifyFaceRecord  ModifyFaceRecordRequest
     * @return ModifyFaceRecordResponse
     */
    CompletableFuture<ModifyFaceRecordResponse> modifyFaceRecord(ModifyFaceRecordRequest request);

    /**
     * @param request the request parameters of QueryFaceGroup  QueryFaceGroupRequest
     * @return QueryFaceGroupResponse
     */
    CompletableFuture<QueryFaceGroupResponse> queryFaceGroup(QueryFaceGroupRequest request);

    /**
     * @param request the request parameters of QueryFaceRecord  QueryFaceRecordRequest
     * @return QueryFaceRecordResponse
     */
    CompletableFuture<QueryFaceRecordResponse> queryFaceRecord(QueryFaceRecordRequest request);

    /**
     * @param request the request parameters of TempAccessTokenIntl  TempAccessTokenIntlRequest
     * @return TempAccessTokenIntlResponse
     */
    CompletableFuture<TempAccessTokenIntlResponse> tempAccessTokenIntl(TempAccessTokenIntlRequest request);

    /**
     * @param request the request parameters of TempOssUrlIntl  TempOssUrlIntlRequest
     * @return TempOssUrlIntlResponse
     */
    CompletableFuture<TempOssUrlIntlResponse> tempOssUrlIntl(TempOssUrlIntlRequest request);

}
