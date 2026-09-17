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
     * <p>Compares two addresses for consistency by using address standardization.</p>
     * 
     * @param request the request parameters of AddressCompareIntl  AddressCompareIntlRequest
     * @return AddressCompareIntlResponse
     */
    CompletableFuture<AddressCompareIntlResponse> addressCompareIntl(AddressCompareIntlRequest request);

    /**
     * @deprecated OpenAPI AddressVerifyIntl is deprecated, please use Cloudauth-intl::2022-08-09::AddressVerifyV2Intl instead.  * @description Verifies whether a specified address belongs to a user\\"s residential address based on telecommunications service provider capabilities, using a phone number and an address (or coordinates).
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
     * <p>Verifies bank card elements, including two-element verification (name + bank card number), three-element verification (name + ID card number + bank card number), and four-element verification (name + ID card number + phone number + bank card number) for consistency.</p>
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
     * <p>After you obtain the TransactionId, you can call this operation on the server side to retrieve the corresponding authentication result.</p>
     * 
     * @param request the request parameters of CredentialGetResultIntl  CredentialGetResultIntlRequest
     * @return CredentialGetResultIntlResponse
     */
    CompletableFuture<CredentialGetResultIntlResponse> credentialGetResultIntl(CredentialGetResultIntlRequest request);

    /**
     * <b>description</b> :
     * <p>Uses AI technology to detect whether a credential (such as a water, electricity, gas, or credit card electronic bill) has been forged, and extracts key information from the credential.</p>
     * 
     * @param request the request parameters of CredentialRecognitionIntl  CredentialRecognitionIntlRequest
     * @return CredentialRecognitionIntlResponse
     */
    CompletableFuture<CredentialRecognitionIntlResponse> credentialRecognitionIntl(CredentialRecognitionIntlRequest request);

    /**
     * <b>description</b> :
     * <p>Initializes the credential recognition OCR operation and retrieves a transactionId through this operation.</p>
     * 
     * @param request the request parameters of CredentialSubmitIntl  CredentialSubmitIntlRequest
     * @return CredentialSubmitIntlResponse
     */
    CompletableFuture<CredentialSubmitIntlResponse> credentialSubmitIntl(CredentialSubmitIntlRequest request);

    /**
     * <b>description</b> :
     * <p>Submits a facial image and uses algorithms to detect potential deepfake risks. This operation covers risk scenarios such as AIGC-generated faces, deep forgery face swaps, template faces, and recaptured faces. It returns risk labels and confidence scores.</p>
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
     * <p>Configures client connection keep-alive settings.</p>
     * 
     * @param request the request parameters of KeepaliveIntl  KeepaliveIntlRequest
     * @return KeepaliveIntlResponse
     */
    CompletableFuture<KeepaliveIntlResponse> keepaliveIntl(KeepaliveIntlRequest request);

    /**
     * <b>description</b> :
     * <p>Pass in a phone number and name to verify their authenticity and consistency through an authoritative data source. Before using this operation, make sure that you fully understand the billing method and pricing of the two-factor phone number verification service.</p>
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
