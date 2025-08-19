// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.cloudauth20190307.models.*;
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
     * @param request the request parameters of AIGCFaceVerify  AIGCFaceVerifyRequest
     * @return AIGCFaceVerifyResponse
     */
    CompletableFuture<AIGCFaceVerifyResponse> aIGCFaceVerify(AIGCFaceVerifyRequest request);

    /**
     * <b>description</b> :
     * <p>Bank card verification, including: two elements (name + bank card number), three elements (name + ID number + bank card number), and four elements (name + ID number + mobile phone number + bank card number) consistency verification.</p>
     * <ul>
     * <li>Service address:<ul>
     * <li>Beijing region: cloudauth.cn-beijing.aliyuncs.com (IPv4) or cloudauth-dualstack.cn-beijing.aliyuncs.com (IPv6).</li>
     * <li>Shanghai region: cloudauth.cn-shanghai.aliyuncs.com (IPv4) or cloudauth-dualstack.cn-shanghai.aliyuncs.com (IPv6).</li>
     * </ul>
     * </li>
     * <li>Request method: POST and GET.</li>
     * <li>Transfer protocol: HTTPS.</li>
     * </ul>
     * 
     * @param request the request parameters of BankMetaVerify  BankMetaVerifyRequest
     * @return BankMetaVerifyResponse
     */
    CompletableFuture<BankMetaVerifyResponse> bankMetaVerify(BankMetaVerifyRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>API Name: CompareFaceVerify.</li>
     * <li>Service Address: cloudauth.aliyuncs.com.</li>
     * <li>Request Method: HTTPS POST and GET.</li>
     * <li>API Description: An interface to achieve real-person authentication through server-side integration.</li>
     * </ul>
     * <h4>Photo Format Requirements</h4>
     * <p>When performing face comparison, please upload 2 facial photos that meet all the following conditions:</p>
     * <ul>
     * <li>Recent photo/recent database photo, with a complete, clear, unobstructed face, natural expression, and facing the camera directly.</li>
     * <li>Clear photo with normal exposure, no overly dark, overly bright, or halo effects on the face, and no significant angle deviation.</li>
     * <li>Resolution not exceeding 1920<em>1080, at least 640</em>480, recommended to scale the shorter side to 720 pixels, with a compression ratio greater than 0.9.</li>
     * <li>Photo size: &lt;1MB.</li>
     * <li>Supports 90, 180, and 270-degree photos; in cases of multiple faces, the largest face will be selected.</li>
     * </ul>
     * 
     * @param request the request parameters of CompareFaceVerify  CompareFaceVerifyRequest
     * @return CompareFaceVerifyResponse
     */
    CompletableFuture<CompareFaceVerifyResponse> compareFaceVerify(CompareFaceVerifyRequest request);

    /**
     * <b>description</b> :
     * <p>Request Method: Only supports sending requests via HTTPS POST.
     * Interface Description: Compares two face images and outputs the similarity score of the faces in the two images as the result.</p>
     * <ul>
     * <li>At least one of the specified comparison images should be a face photo (FacePic).</li>
     * <li>If an image contains multiple faces, the algorithm will automatically select the largest face in the image.</li>
     * <li>If one of the two comparison images does not detect a face, the system will return an error message stating \&quot;No face detected\&quot;.
     * When uploading images, you need to provide the HTTP address or base64 encoding of the image.</li>
     * <li>HTTP Address: A publicly accessible HTTP address. For example, <code>http://image-demo.img-cn-hangzhou.aliyuncs.com/example.jpg</code>.</li>
     * <li>Base64 Encoding: An image encoded in base64, formatted as <code>base64://&lt;base64 string of the image&gt;</code>.
     * Image Restrictions</li>
     * <li>Does not support relative or absolute paths for local images.</li>
     * <li>Please keep the size of a single image within 2MB to avoid timeout during retrieval by the algorithm.</li>
     * <li>The body of a single request has a size limit of 8MB; please calculate the total size of all images and other information in the request to ensure it does not exceed this limit.</li>
     * <li>When using base64 to transmit images, the request method must be changed to POST; the header description such as <code>data:image/png;base64,</code> should be removed from the base64 string of the image.</li>
     * </ul>
     * 
     * @param request the request parameters of CompareFaces  CompareFacesRequest
     * @return CompareFacesResponse
     */
    CompletableFuture<CompareFacesResponse> compareFaces(CompareFacesRequest request);

    /**
     * @param request the request parameters of CreateAuthKey  CreateAuthKeyRequest
     * @return CreateAuthKeyResponse
     */
    CompletableFuture<CreateAuthKeyResponse> createAuthKey(CreateAuthKeyRequest request);

    /**
     * @param request the request parameters of CreateVerifySetting  CreateVerifySettingRequest
     * @return CreateVerifySettingResponse
     */
    CompletableFuture<CreateVerifySettingResponse> createVerifySetting(CreateVerifySettingRequest request);

    /**
     * @param request the request parameters of CredentialVerify  CredentialVerifyRequest
     * @return CredentialVerifyResponse
     */
    CompletableFuture<CredentialVerifyResponse> credentialVerify(CredentialVerifyRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The Face Deepfake Detection API is currently in the free public beta stage, which will end on August 30, 2024, at 23:59:59. During the public beta, the QPS (Queries Per Second) cannot exceed 3 times/second.</p>
     * </blockquote>
     * <ul>
     * <li>Service address: cloudauth.aliyuncs.com (IPv4) or cloudauth-dualstack.aliyuncs.com (IPv6).</li>
     * <li>Request method: POST and GET.</li>
     * <li>Transfer protocol: HTTPS.</li>
     * </ul>
     * 
     * @param request the request parameters of DeepfakeDetect  DeepfakeDetectRequest
     * @return DeepfakeDetectResponse
     */
    CompletableFuture<DeepfakeDetectResponse> deepfakeDetect(DeepfakeDetectRequest request);

    /**
     * <b>description</b> :
     * <p>Deletes all personal information fields in the request, including name, ID number, phone number, IP, images, videos, and device information, etc.</p>
     * 
     * @param request the request parameters of DeleteFaceVerifyResult  DeleteFaceVerifyResultRequest
     * @return DeleteFaceVerifyResultResponse
     */
    CompletableFuture<DeleteFaceVerifyResultResponse> deleteFaceVerifyResult(DeleteFaceVerifyResultRequest request);

    /**
     * @param request the request parameters of DescribeCardVerify  DescribeCardVerifyRequest
     * @return DescribeCardVerifyResponse
     */
    CompletableFuture<DescribeCardVerifyResponse> describeCardVerify(DescribeCardVerifyRequest request);

    /**
     * @param request the request parameters of DescribeDeviceInfo  DescribeDeviceInfoRequest
     * @return DescribeDeviceInfoResponse
     */
    CompletableFuture<DescribeDeviceInfoResponse> describeDeviceInfo(DescribeDeviceInfoRequest request);

    /**
     * @param request the request parameters of DescribeFaceGuardRisk  DescribeFaceGuardRiskRequest
     * @return DescribeFaceGuardRiskResponse
     */
    CompletableFuture<DescribeFaceGuardRiskResponse> describeFaceGuardRisk(DescribeFaceGuardRiskRequest request);

    /**
     * @param request the request parameters of DescribeFaceVerify  DescribeFaceVerifyRequest
     * @return DescribeFaceVerifyResponse
     */
    CompletableFuture<DescribeFaceVerifyResponse> describeFaceVerify(DescribeFaceVerifyRequest request);

    /**
     * @param request the request parameters of DescribeOssUploadToken  DescribeOssUploadTokenRequest
     * @return DescribeOssUploadTokenResponse
     */
    CompletableFuture<DescribeOssUploadTokenResponse> describeOssUploadToken(DescribeOssUploadTokenRequest request);

    /**
     * @param request the request parameters of DescribePageFaceVerifyData  DescribePageFaceVerifyDataRequest
     * @return DescribePageFaceVerifyDataResponse
     */
    CompletableFuture<DescribePageFaceVerifyDataResponse> describePageFaceVerifyData(DescribePageFaceVerifyDataRequest request);

    /**
     * @param request the request parameters of DescribeSmartStatisticsPageList  DescribeSmartStatisticsPageListRequest
     * @return DescribeSmartStatisticsPageListResponse
     */
    CompletableFuture<DescribeSmartStatisticsPageListResponse> describeSmartStatisticsPageList(DescribeSmartStatisticsPageListRequest request);

    /**
     * @param request the request parameters of DescribeVerifyResult  DescribeVerifyResultRequest
     * @return DescribeVerifyResultResponse
     */
    CompletableFuture<DescribeVerifyResultResponse> describeVerifyResult(DescribeVerifyResultRequest request);

    /**
     * @param request the request parameters of DescribeVerifySDK  DescribeVerifySDKRequest
     * @return DescribeVerifySDKResponse
     */
    CompletableFuture<DescribeVerifySDKResponse> describeVerifySDK(DescribeVerifySDKRequest request);

    /**
     * @param request the request parameters of DescribeVerifyToken  DescribeVerifyTokenRequest
     * @return DescribeVerifyTokenResponse
     */
    CompletableFuture<DescribeVerifyTokenResponse> describeVerifyToken(DescribeVerifyTokenRequest request);

    /**
     * @param request the request parameters of DetectFaceAttributes  DetectFaceAttributesRequest
     * @return DetectFaceAttributesResponse
     */
    CompletableFuture<DetectFaceAttributesResponse> detectFaceAttributes(DetectFaceAttributesRequest request);

    /**
     * @param request the request parameters of Id2MetaPeriodVerify  Id2MetaPeriodVerifyRequest
     * @return Id2MetaPeriodVerifyResponse
     */
    CompletableFuture<Id2MetaPeriodVerifyResponse> id2MetaPeriodVerify(Id2MetaPeriodVerifyRequest request);

    /**
     * @param request the request parameters of Id2MetaStandardVerify  Id2MetaStandardVerifyRequest
     * @return Id2MetaStandardVerifyResponse
     */
    CompletableFuture<Id2MetaStandardVerifyResponse> id2MetaStandardVerify(Id2MetaStandardVerifyRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Service address: cloudauth.aliyuncs.com (IPv4) or cloudauth-dualstack.aliyuncs.com (IPv6).</li>
     * <li>Request method: POST and GET.</li>
     * <li>Transfer protocol: HTTPS.</li>
     * </ul>
     * 
     * @param request the request parameters of Id2MetaVerify  Id2MetaVerifyRequest
     * @return Id2MetaVerifyResponse
     */
    CompletableFuture<Id2MetaVerifyResponse> id2MetaVerify(Id2MetaVerifyRequest request);

    /**
     * <b>description</b> :
     * <p>Before each authentication, use this interface to obtain the CertifyId, which is used to link various interfaces in the authentication request.</p>
     * 
     * @param request the request parameters of InitCardVerify  InitCardVerifyRequest
     * @return InitCardVerifyResponse
     */
    CompletableFuture<InitCardVerifyResponse> initCardVerify(InitCardVerifyRequest request);

    /**
     * @param request the request parameters of InitFaceVerify  InitFaceVerifyRequest
     * @return InitFaceVerifyResponse
     */
    CompletableFuture<InitFaceVerifyResponse> initFaceVerify(InitFaceVerifyRequest request);

    /**
     * @param request the request parameters of InsertWhiteListSetting  InsertWhiteListSettingRequest
     * @return InsertWhiteListSettingResponse
     */
    CompletableFuture<InsertWhiteListSettingResponse> insertWhiteListSetting(InsertWhiteListSettingRequest request);

    /**
     * @param request the request parameters of LivenessFaceVerify  LivenessFaceVerifyRequest
     * @return LivenessFaceVerifyResponse
     */
    CompletableFuture<LivenessFaceVerifyResponse> livenessFaceVerify(LivenessFaceVerifyRequest request);

    /**
     * <b>description</b> :
     * <p>Input the phone number and name, verify their authenticity and consistency through authoritative data sources.</p>
     * 
     * @param request the request parameters of Mobile2MetaVerify  Mobile2MetaVerifyRequest
     * @return Mobile2MetaVerifyResponse
     */
    CompletableFuture<Mobile2MetaVerifyResponse> mobile2MetaVerify(Mobile2MetaVerifyRequest request);

    /**
     * <b>description</b> :
     * <p>Input the phone number, name, and ID number to verify their authenticity and consistency through authoritative data sources. If they do not match, the reason for the mismatch is returned.</p>
     * 
     * @param request the request parameters of Mobile3MetaDetailStandardVerify  Mobile3MetaDetailStandardVerifyRequest
     * @return Mobile3MetaDetailStandardVerifyResponse
     */
    CompletableFuture<Mobile3MetaDetailStandardVerifyResponse> mobile3MetaDetailStandardVerify(Mobile3MetaDetailStandardVerifyRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Service address: cloudauth.aliyuncs.com (IPv4) or cloudauth-dualstack.aliyuncs.com (IPv6).</li>
     * <li>Request method: POST and GET.</li>
     * <li>Transfer protocol: HTTPS.</li>
     * </ul>
     * 
     * @param request the request parameters of Mobile3MetaDetailVerify  Mobile3MetaDetailVerifyRequest
     * @return Mobile3MetaDetailVerifyResponse
     */
    CompletableFuture<Mobile3MetaDetailVerifyResponse> mobile3MetaDetailVerify(Mobile3MetaDetailVerifyRequest request);

    /**
     * <b>description</b> :
     * <p>Input the phone number, name, and ID number to verify their authenticity and consistency through authoritative data sources.</p>
     * 
     * @param request the request parameters of Mobile3MetaSimpleStandardVerify  Mobile3MetaSimpleStandardVerifyRequest
     * @return Mobile3MetaSimpleStandardVerifyResponse
     */
    CompletableFuture<Mobile3MetaSimpleStandardVerifyResponse> mobile3MetaSimpleStandardVerify(Mobile3MetaSimpleStandardVerifyRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Service address: cloudauth.aliyuncs.com (IPv4) or cloudauth-dualstack.aliyuncs.com (IPv6).</li>
     * <li>Request method: POST and GET.</li>
     * <li>Transfer protocol: HTTPS.</li>
     * </ul>
     * 
     * @param request the request parameters of Mobile3MetaSimpleVerify  Mobile3MetaSimpleVerifyRequest
     * @return Mobile3MetaSimpleVerifyResponse
     */
    CompletableFuture<Mobile3MetaSimpleVerifyResponse> mobile3MetaSimpleVerify(Mobile3MetaSimpleVerifyRequest request);

    /**
     * @param request the request parameters of MobileDetect  MobileDetectRequest
     * @return MobileDetectResponse
     */
    CompletableFuture<MobileDetectResponse> mobileDetect(MobileDetectRequest request);

    /**
     * @param request the request parameters of MobileOnlineStatus  MobileOnlineStatusRequest
     * @return MobileOnlineStatusResponse
     */
    CompletableFuture<MobileOnlineStatusResponse> mobileOnlineStatus(MobileOnlineStatusRequest request);

    /**
     * @param request the request parameters of MobileOnlineTime  MobileOnlineTimeRequest
     * @return MobileOnlineTimeResponse
     */
    CompletableFuture<MobileOnlineTimeResponse> mobileOnlineTime(MobileOnlineTimeRequest request);

    /**
     * <b>description</b> :
     * <p>Request Method: Supports sending requests using HTTPS POST and GET methods.</p>
     * 
     * @param request the request parameters of ModifyDeviceInfo  ModifyDeviceInfoRequest
     * @return ModifyDeviceInfoResponse
     */
    CompletableFuture<ModifyDeviceInfoResponse> modifyDeviceInfo(ModifyDeviceInfoRequest request);

    /**
     * @param request the request parameters of PageQueryWhiteListSetting  PageQueryWhiteListSettingRequest
     * @return PageQueryWhiteListSettingResponse
     */
    CompletableFuture<PageQueryWhiteListSettingResponse> pageQueryWhiteListSetting(PageQueryWhiteListSettingRequest request);

    /**
     * @param request the request parameters of RemoveWhiteListSetting  RemoveWhiteListSettingRequest
     * @return RemoveWhiteListSettingResponse
     */
    CompletableFuture<RemoveWhiteListSettingResponse> removeWhiteListSetting(RemoveWhiteListSettingRequest request);

    /**
     * <b>description</b> :
     * <p>Query basic vehicle information through the license plate number and vehicle type.</p>
     * 
     * @param request the request parameters of Vehicle5ItemQuery  Vehicle5ItemQueryRequest
     * @return Vehicle5ItemQueryResponse
     */
    CompletableFuture<Vehicle5ItemQueryResponse> vehicle5ItemQuery(Vehicle5ItemQueryRequest request);

    /**
     * <b>description</b> :
     * <p>Query the vehicle insurance date through the license plate number, vehicle type, and vehicle identification number (VIN).</p>
     * 
     * @param request the request parameters of VehicleInsureQuery  VehicleInsureQueryRequest
     * @return VehicleInsureQueryResponse
     */
    CompletableFuture<VehicleInsureQueryResponse> vehicleInsureQuery(VehicleInsureQueryRequest request);

    /**
     * <b>description</b> :
     * <p>Verifies the consistency of name, ID number, vehicle license plate, and vehicle type.</p>
     * 
     * @param request the request parameters of VehicleMetaVerify  VehicleMetaVerifyRequest
     * @return VehicleMetaVerifyResponse
     */
    CompletableFuture<VehicleMetaVerifyResponse> vehicleMetaVerify(VehicleMetaVerifyRequest request);

    /**
     * <b>description</b> :
     * <p>Verifies the consistency of name, ID number, license plate number, and vehicle type, and supports returning detailed vehicle information.</p>
     * 
     * @param request the request parameters of VehicleMetaVerifyV2  VehicleMetaVerifyV2Request
     * @return VehicleMetaVerifyV2Response
     */
    CompletableFuture<VehicleMetaVerifyV2Response> vehicleMetaVerifyV2(VehicleMetaVerifyV2Request request);

    /**
     * <b>description</b> :
     * <p>Query detailed vehicle information through the license plate number and vehicle type.</p>
     * 
     * @param request the request parameters of VehicleQuery  VehicleQueryRequest
     * @return VehicleQueryResponse
     */
    CompletableFuture<VehicleQueryResponse> vehicleQuery(VehicleQueryRequest request);

    /**
     * @param request the request parameters of VerifyMaterial  VerifyMaterialRequest
     * @return VerifyMaterialResponse
     */
    CompletableFuture<VerifyMaterialResponse> verifyMaterial(VerifyMaterialRequest request);

}
