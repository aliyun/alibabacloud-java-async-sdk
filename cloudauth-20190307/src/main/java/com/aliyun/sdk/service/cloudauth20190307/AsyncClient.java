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
     * <p>Bank card consistency verification, including two-element verification (name and bank card number), three-element verification (name, ID card number, and bank card number), and four-element verification (name, ID card number, mobile phone number, and bank card number).</p>
     * <ul>
     * <li>Service endpoints:<ul>
     * <li>China (Beijing) region: cloudauth.cn-beijing.aliyuncs.com (IPv4) or cloudauth-dualstack.cn-beijing.aliyuncs.com (IPv6).</li>
     * <li>China (Shanghai) region: cloudauth.cn-shanghai.aliyuncs.com (IPv4) or cloudauth-dualstack.cn-shanghai.aliyuncs.com (IPv6).</li>
     * </ul>
     * </li>
     * <li>Request methods: POST and GET.</li>
     * <li>Transport protocol: HTTPS.</li>
     * </ul>
     * 
     * @param request the request parameters of BankMetaVerify  BankMetaVerifyRequest
     * @return BankMetaVerifyResponse
     */
    CompletableFuture<BankMetaVerifyResponse> bankMetaVerify(BankMetaVerifyRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>API operation: CompareFaceVerify.</li>
     * <li>Endpoint: cloudauth.aliyuncs.com.</li>
     * <li>Request methods: HTTPS POST and GET.</li>
     * <li>Operation description: Implements ID Verification through server-side integration.</li>
     * </ul>
     * <h4>Requirements for uploaded photos</h4>
     * <p>When you perform face comparison, upload two face photos that meet all the following conditions.</p>
     * <ul>
     * <li>The photos must be recent photos or recent photos from the base library. The faces must be complete, clear, and unobstructed, with natural expressions and facing the camera directly.</li>
     * <li>The photos must be clear and properly exposed. The faces must not be too dark, too bright, or have halos. The angle must not deviate significantly.</li>
     * <li>The resolution must not exceed 1920×1080 and must be at least 640×480. We recommend that you scale the short side to 720 pixels and use a compression ratio greater than 0.9.</li>
     * <li>Photo size: less than 1 MB.</li>
     * <li>Photos rotated by 90, 180, and 270 degrees are supported. If multiple faces are detected, the largest face is selected.</li>
     * </ul>
     * 
     * @param request the request parameters of CompareFaceVerify  CompareFaceVerifyRequest
     * @return CompareFaceVerifyResponse
     */
    CompletableFuture<CompareFaceVerifyResponse> compareFaceVerify(CompareFaceVerifyRequest request);

    /**
     * <b>description</b> :
     * <p>Request method: Only HTTPS POST requests are supported.
     * API description: Compares two specified face images and returns the similarity score of the faces in the two images.</p>
     * <ul>
     * <li>At least one of the specified images must be a face photo (FacePic).</li>
     * <li>If an image contains multiple faces, the algorithm automatically selects the largest face in the image.</li>
     * <li>If no face is detected in one of the two images, the system returns a &quot;No face detected&quot; error message.
     * When you pass images, you must upload the HTTP URL or Base64 encoding of the image.</li>
     * <li>HTTP URL: A publicly accessible HTTP URL. Example: <code>http://image-demo.img-cn-hangzhou.aliyuncs.com/example.jpg</code>.</li>
     * <li>Base64 encoding: A Base64-encoded image in the format of <code>base64://&lt;Base64 string of the image&gt;</code>.
     * Image limits.</li>
     * <li>The relative path or absolute path of local images is not supported.</li>
     * <li>The size of a single image must be less than 2 MB to prevent algorithm pull timeouts.</li>
     * <li>The body of a single request is limited to 8 MB. Make sure that the total size of all images and other information in the request does not exceed this limit.</li>
     * <li>When you use Base64 to pass images, the request method must be POST. You must remove the header description from the Base64 character string, such as the data URI prefix.</li>
     * </ul>
     * 
     * @param request the request parameters of CompareFaces  CompareFacesRequest
     * @return CompareFacesResponse
     */
    CompletableFuture<CompareFacesResponse> compareFaces(CompareFacesRequest request);

    /**
     * <b>description</b> :
     * <p>Request method: Supports sending requests by using HTTPS POST and GET methods.</p>
     * <blockquote>
     * <p>The authorization key is valid for 30 minutes and cannot be reused. Obtain a new key before each activation.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateAntCloudAuthScene  CreateAntCloudAuthSceneRequest
     * @return CreateAntCloudAuthSceneResponse
     */
    CompletableFuture<CreateAntCloudAuthSceneResponse> createAntCloudAuthScene(CreateAntCloudAuthSceneRequest request);

    /**
     * <b>description</b> :
     * <p>Request method: Supports sending requests by using HTTPS POST and GET methods.</p>
     * <blockquote>
     * <p>The authorization key is valid for 30 minutes and cannot be reused. Obtain a new key before each activation.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateAuthKey  CreateAuthKeyRequest
     * @return CreateAuthKeyResponse
     */
    CompletableFuture<CreateAuthKeyResponse> createAuthKey(CreateAuthKeyRequest request);

    /**
     * <b>description</b> :
     * <p>Request method: Supports sending requests by using HTTPS POST and GET methods.</p>
     * <blockquote>
     * <p>The authorization code is valid for 30 minutes and cannot be reused. Obtain a new authorization code before each activation.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateCloudauthstScene  CreateCloudauthstSceneRequest
     * @return CreateCloudauthstSceneResponse
     */
    CompletableFuture<CreateCloudauthstSceneResponse> createCloudauthstScene(CreateCloudauthstSceneRequest request);

    /**
     * <b>description</b> :
     * <p>Request method: HTTPS POST.
     * Request endpoint: cloudauth.aliyuncs.com.</p>
     * <blockquote>
     * <p>The authorization key is valid for 30 minutes and cannot be reused. Obtain a new key before each activation.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateSceneConfig  CreateSceneConfigRequest
     * @return CreateSceneConfigResponse
     */
    CompletableFuture<CreateSceneConfigResponse> createSceneConfig(CreateSceneConfigRequest request);

    /**
     * <b>description</b> :
     * <p>Request method: Only HTTPS POST requests are supported.</p>
     * 
     * @param request the request parameters of CreateVerifySetting  CreateVerifySettingRequest
     * @return CreateVerifySettingResponse
     */
    CompletableFuture<CreateVerifySettingResponse> createVerifySetting(CreateVerifySettingRequest request);

    /**
     * <b>description</b> :
     * <p>Request method: Only HTTPS POST requests are supported.</p>
     * 
     * @param request the request parameters of CreateWhitelistSetting  CreateWhitelistSettingRequest
     * @return CreateWhitelistSettingResponse
     */
    CompletableFuture<CreateWhitelistSettingResponse> createWhitelistSetting(CreateWhitelistSettingRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Service endpoint: cloudauth.aliyuncs.com (IPv4) or cloudauth-dualstack.aliyuncs.com (IPv6).</li>
     * <li>Request methods: POST and GET.</li>
     * <li>Transport protocol: HTTPS.</li>
     * </ul>
     * 
     * @param request the request parameters of CredentialVerify  CredentialVerifyRequest
     * @return CredentialVerifyResponse
     */
    CompletableFuture<CredentialVerifyResponse> credentialVerify(CredentialVerifyRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The facial deepfake detection API is currently in the free public preview phase. The free public preview ends at 23:59:59 on August 30, 2024. During the public preview, the queries per second (QPS) cannot exceed 3.</p>
     * </blockquote>
     * <ul>
     * <li>Service endpoint: cloudauth.aliyuncs.com (IPv4) or cloudauth-dualstack.aliyuncs.com (IPv6).</li>
     * <li>Request methods: POST and GET.</li>
     * <li>Transport protocol: HTTPS.</li>
     * </ul>
     * 
     * @param request the request parameters of DeepfakeDetect  DeepfakeDetectRequest
     * @return DeepfakeDetectResponse
     */
    CompletableFuture<DeepfakeDetectResponse> deepfakeDetect(DeepfakeDetectRequest request);

    /**
     * <b>description</b> :
     * <p>Request method: You can send requests by using the HTTPS POST and GET methods.</p>
     * <blockquote>
     * <p>The authorization key is valid for 30 minutes and cannot be reused. Obtain a new key before each activation.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteAllCustomizeFlowStrategy  DeleteAllCustomizeFlowStrategyRequest
     * @return DeleteAllCustomizeFlowStrategyResponse
     */
    CompletableFuture<DeleteAllCustomizeFlowStrategyResponse> deleteAllCustomizeFlowStrategy(DeleteAllCustomizeFlowStrategyRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Endpoint: cloudauth.aliyuncs.com.</li>
     * <li>Request method: HTTPS POST and GET.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteAntCloudAuthScene  DeleteAntCloudAuthSceneRequest
     * @return DeleteAntCloudAuthSceneResponse
     */
    CompletableFuture<DeleteAntCloudAuthSceneResponse> deleteAntCloudAuthScene(DeleteAntCloudAuthSceneRequest request);

    /**
     * <b>description</b> :
     * <p>Request method: Only HTTPS POST requests are supported.</p>
     * 
     * @param request the request parameters of DeleteBlackListStrategy  DeleteBlackListStrategyRequest
     * @return DeleteBlackListStrategyResponse
     */
    CompletableFuture<DeleteBlackListStrategyResponse> deleteBlackListStrategy(DeleteBlackListStrategyRequest request);

    /**
     * <b>description</b> :
     * <p>Request method: Supports sending requests using HTTPS POST and GET methods.</p>
     * <blockquote>
     * <p>The authorization key is valid for 30 minutes and cannot be reused. We recommend that you obtain a new key before each activation.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteCloudauthstScene  DeleteCloudauthstSceneRequest
     * @return DeleteCloudauthstSceneResponse
     */
    CompletableFuture<DeleteCloudauthstSceneResponse> deleteCloudauthstScene(DeleteCloudauthstSceneRequest request);

    /**
     * <b>description</b> :
     * <p>Request method: You can send requests by using the HTTPS POST method.
     * Request endpoint: cloudauth.aliyuncs.com.</p>
     * 
     * @param request the request parameters of DeleteControlStrategy  DeleteControlStrategyRequest
     * @return DeleteControlStrategyResponse
     */
    CompletableFuture<DeleteControlStrategyResponse> deleteControlStrategy(DeleteControlStrategyRequest request);

    /**
     * <b>description</b> :
     * <p>Request method: You can send requests by using the HTTPS POST and GET methods.</p>
     * <blockquote>
     * <p>An authorization key is valid for 30 minutes and cannot be reused. Obtain a new key before each activation.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteCustomizeFlowStrategy  DeleteCustomizeFlowStrategyRequest
     * @return DeleteCustomizeFlowStrategyResponse
     */
    CompletableFuture<DeleteCustomizeFlowStrategyResponse> deleteCustomizeFlowStrategy(DeleteCustomizeFlowStrategyRequest request);

    /**
     * <b>description</b> :
     * <p>Deletes all fields related to personal information in the request, such as the name, ID card number, mobile phone number, IP address, images, videos, and device information.</p>
     * 
     * @param request the request parameters of DeleteFaceVerifyResult  DeleteFaceVerifyResultRequest
     * @return DeleteFaceVerifyResultResponse
     */
    CompletableFuture<DeleteFaceVerifyResultResponse> deleteFaceVerifyResult(DeleteFaceVerifyResultRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Request method: Supports HTTPS POST and GET methods.</li>
     * <li>Endpoint: cloudauth.aliyuncs.com.<blockquote>
     * <p>The authorization key is valid for 30 minutes and cannot be reused. Obtain a new key before each activation.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteSceneConfig  DeleteSceneConfigRequest
     * @return DeleteSceneConfigResponse
     */
    CompletableFuture<DeleteSceneConfigResponse> deleteSceneConfig(DeleteSceneConfigRequest request);

    /**
     * <b>description</b> :
     * <p>Request method: Only HTTPS POST requests are supported.</p>
     * 
     * @param request the request parameters of DeleteWhitelistSetting  DeleteWhitelistSettingRequest
     * @return DeleteWhitelistSettingResponse
     */
    CompletableFuture<DeleteWhitelistSettingResponse> deleteWhitelistSetting(DeleteWhitelistSettingRequest request);

    /**
     * <b>description</b> :
     * <p>Request method: Supports sending requests by using HTTPS POST and GET methods.</p>
     * <blockquote>
     * <p>The authorization key is valid for 30 minutes and cannot be reused. Obtain a new key before each activation.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeAntAndCloudAuthUserStatus  DescribeAntAndCloudAuthUserStatusRequest
     * @return DescribeAntAndCloudAuthUserStatusResponse
     */
    CompletableFuture<DescribeAntAndCloudAuthUserStatusResponse> describeAntAndCloudAuthUserStatus(DescribeAntAndCloudAuthUserStatusRequest request);

    /**
     * @param request the request parameters of DescribeAuthVerify  DescribeAuthVerifyRequest
     * @return DescribeAuthVerifyResponse
     */
    CompletableFuture<DescribeAuthVerifyResponse> describeAuthVerify(DescribeAuthVerifyRequest request);

    /**
     * <b>description</b> :
     * <p>After you receive a callback notification, you can call this operation on your server to retrieve the authentication status and materials.</p>
     * 
     * @param request the request parameters of DescribeCardVerify  DescribeCardVerifyRequest
     * @return DescribeCardVerifyResponse
     */
    CompletableFuture<DescribeCardVerifyResponse> describeCardVerify(DescribeCardVerifyRequest request);

    /**
     * <b>description</b> :
     * <p>Request method: You can send requests by using the HTTPS POST or GET method.</p>
     * <blockquote>
     * <p>The authorization key is valid for 30 minutes and cannot be reused. Obtain a new key before each activation.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeCloudauthstSceneList  DescribeCloudauthstSceneListRequest
     * @return DescribeCloudauthstSceneListResponse
     */
    CompletableFuture<DescribeCloudauthstSceneListResponse> describeCloudauthstSceneList(DescribeCloudauthstSceneListRequest request);

    /**
     * <b>description</b> :
     * <p>Request method: supports sending requests using HTTPS POST and GET methods.</p>
     * 
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
     * <b>description</b> :
     * <ul>
     * <li>Service endpoint: cloudauth.aliyuncs.com.</li>
     * <li>Request method: HTTPS POST and GET.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeFaceVerify  DescribeFaceVerifyRequest
     * @return DescribeFaceVerifyResponse
     */
    CompletableFuture<DescribeFaceVerifyResponse> describeFaceVerify(DescribeFaceVerifyRequest request);

    /**
     * <b>description</b> :
     * <p>Request method: Supports sending requests by using HTTPS POST and GET methods.</p>
     * 
     * @param request the request parameters of DescribeInfoCheckExportRecord  DescribeInfoCheckExportRecordRequest
     * @return DescribeInfoCheckExportRecordResponse
     */
    CompletableFuture<DescribeInfoCheckExportRecordResponse> describeInfoCheckExportRecord(DescribeInfoCheckExportRecordRequest request);

    /**
     * <b>description</b> :
     * <p>Request method: Supports sending requests by using HTTPS POST and GET methods.</p>
     * <blockquote>
     * <p>The authorization key is valid for 30 minutes and cannot be reused. Obtain a new key before each activation.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeListAntCloudAuthScenes  DescribeListAntCloudAuthScenesRequest
     * @return DescribeListAntCloudAuthScenesResponse
     */
    CompletableFuture<DescribeListAntCloudAuthScenesResponse> describeListAntCloudAuthScenes(DescribeListAntCloudAuthScenesRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Service endpoint: cloudauth.aliyuncs.com.</li>
     * <li>Request method: HTTPS POST and GET.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeListFaceVerifyData  DescribeListFaceVerifyDataRequest
     * @return DescribeListFaceVerifyDataResponse
     */
    CompletableFuture<DescribeListFaceVerifyDataResponse> describeListFaceVerifyData(DescribeListFaceVerifyDataRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Service endpoint: cloudauth.aliyuncs.com.</li>
     * <li>Request method: HTTPS POST and GET.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeListFaceVerifyInfos  DescribeListFaceVerifyInfosRequest
     * @return DescribeListFaceVerifyInfosResponse
     */
    CompletableFuture<DescribeListFaceVerifyInfosResponse> describeListFaceVerifyInfos(DescribeListFaceVerifyInfosRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Service address: cloudauth.aliyuncs.com.</li>
     * <li>Request method: HTTPS POST and GET.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeMetaSearchPageList  DescribeMetaSearchPageListRequest
     * @return DescribeMetaSearchPageListResponse
     */
    CompletableFuture<DescribeMetaSearchPageListResponse> describeMetaSearchPageList(DescribeMetaSearchPageListRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Request method: Supports sending requests by using HTTPS POST and GET methods.</li>
     * <li>Service address: cloudauth.aliyuncs.com.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeMetaStatisticsList  DescribeMetaStatisticsListRequest
     * @return DescribeMetaStatisticsListResponse
     */
    CompletableFuture<DescribeMetaStatisticsListResponse> describeMetaStatisticsList(DescribeMetaStatisticsListRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Request method: HTTPS POST and GET methods are supported.</li>
     * <li>Service address: cloudauth.aliyuncs.com.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeMetaStatisticsPageList  DescribeMetaStatisticsPageListRequest
     * @return DescribeMetaStatisticsPageListResponse
     */
    CompletableFuture<DescribeMetaStatisticsPageListResponse> describeMetaStatisticsPageList(DescribeMetaStatisticsPageListRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Request method: HTTPS POST and GET methods are supported.</li>
     * <li>Endpoint: cloudauth.aliyuncs.com.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeOssStatus  DescribeOssStatusRequest
     * @return DescribeOssStatusResponse
     */
    CompletableFuture<DescribeOssStatusResponse> describeOssStatus(DescribeOssStatusRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Request methods: Supports HTTPS POST and GET methods.</li>
     * <li>Service endpoint: cloudauth.aliyuncs.com.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeOssStatusV2  DescribeOssStatusV2Request
     * @return DescribeOssStatusV2Response
     */
    CompletableFuture<DescribeOssStatusV2Response> describeOssStatusV2(DescribeOssStatusV2Request request);

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
     * <b>description</b> :
     * <p>Request method: Only HTTPS POST requests are supported.</p>
     * 
     * @param request the request parameters of DescribePageSetting  DescribePageSettingRequest
     * @return DescribePageSettingResponse
     */
    CompletableFuture<DescribePageSettingResponse> describePageSetting(DescribePageSettingRequest request);

    /**
     * <b>description</b> :
     * <p>Request method: Send requests by using the HTTPS GET or POST method.</p>
     * 
     * @param request the request parameters of DescribeProductCode  DescribeProductCodeRequest
     * @return DescribeProductCodeResponse
     */
    CompletableFuture<DescribeProductCodeResponse> describeProductCode(DescribeProductCodeRequest request);

    /**
     * @param request the request parameters of DescribeSmartStatisticsPageList  DescribeSmartStatisticsPageListRequest
     * @return DescribeSmartStatisticsPageListResponse
     */
    CompletableFuture<DescribeSmartStatisticsPageListResponse> describeSmartStatisticsPageList(DescribeSmartStatisticsPageListRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Service address: cloudauth.aliyuncs.com.</li>
     * <li>Request method: HTTPS POST and GET.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVerifyDeviceRiskStatistics  DescribeVerifyDeviceRiskStatisticsRequest
     * @return DescribeVerifyDeviceRiskStatisticsResponse
     */
    CompletableFuture<DescribeVerifyDeviceRiskStatisticsResponse> describeVerifyDeviceRiskStatistics(DescribeVerifyDeviceRiskStatisticsRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Service address: cloudauth.aliyuncs.com.</li>
     * <li>Request method: HTTPS POST and GET.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVerifyFailStatistics  DescribeVerifyFailStatisticsRequest
     * @return DescribeVerifyFailStatisticsResponse
     */
    CompletableFuture<DescribeVerifyFailStatisticsResponse> describeVerifyFailStatistics(DescribeVerifyFailStatisticsRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Service endpoint: cloudauth.aliyuncs.com.</li>
     * <li>Request method: HTTPS POST and GET.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVerifyPersonasDeviceModelStatistics  DescribeVerifyPersonasDeviceModelStatisticsRequest
     * @return DescribeVerifyPersonasDeviceModelStatisticsResponse
     */
    CompletableFuture<DescribeVerifyPersonasDeviceModelStatisticsResponse> describeVerifyPersonasDeviceModelStatistics(DescribeVerifyPersonasDeviceModelStatisticsRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Service address: cloudauth.aliyuncs.com.</li>
     * <li>Request method: HTTPS POST and GET.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVerifyPersonasOsStatistics  DescribeVerifyPersonasOsStatisticsRequest
     * @return DescribeVerifyPersonasOsStatisticsResponse
     */
    CompletableFuture<DescribeVerifyPersonasOsStatisticsResponse> describeVerifyPersonasOsStatistics(DescribeVerifyPersonasOsStatisticsRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Service address: cloudauth.aliyuncs.com.</li>
     * <li>Request method: HTTPS POST and GET.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVerifyPersonasProvinceStatistics  DescribeVerifyPersonasProvinceStatisticsRequest
     * @return DescribeVerifyPersonasProvinceStatisticsResponse
     */
    CompletableFuture<DescribeVerifyPersonasProvinceStatisticsResponse> describeVerifyPersonasProvinceStatistics(DescribeVerifyPersonasProvinceStatisticsRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Service address: cloudauth.aliyuncs.com.</li>
     * <li>Request method: HTTPS POST and GET.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVerifyPersonasSexStatistics  DescribeVerifyPersonasSexStatisticsRequest
     * @return DescribeVerifyPersonasSexStatisticsResponse
     */
    CompletableFuture<DescribeVerifyPersonasSexStatisticsResponse> describeVerifyPersonasSexStatistics(DescribeVerifyPersonasSexStatisticsRequest request);

    /**
     * <b>description</b> :
     * <p>Before you begin: Before integrating this API, make sure that you have completed the required preparations. For more information, see <a href="https://help.aliyun.com/document_detail/127471.html">Preparations for integrating the ID Verification server</a> and <a href="https://help.aliyun.com/document_detail/127717.html">Preparations for integrating the face liveness verification server</a>.</p>
     * <blockquote>
     * <p>Alibaba Cloud ID Verification stores verification data only for the last 180 days. To use the verification data for subsequent business purposes, call this API to retrieve and store the data promptly to prevent service interruptions.
     * Request methods: HTTPS POST and GET.
     * Operation description: After the mobile client of the integrator receives a callback, the server can call this API to retrieve the corresponding verification status and materials.
     * Applicable scope: This API applies to the verification solution that integrates the SDK and the server.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeVerifyResult  DescribeVerifyResultRequest
     * @return DescribeVerifyResultResponse
     */
    CompletableFuture<DescribeVerifyResultResponse> describeVerifyResult(DescribeVerifyResultRequest request);

    /**
     * <b>description</b> :
     * <p>Request method: Supports HTTPS POST and GET methods.
     * Operation description: Retrieves the result of an offline facial recognition SDK generation task based on the task ID.</p>
     * 
     * @param request the request parameters of DescribeVerifySDK  DescribeVerifySDKRequest
     * @return DescribeVerifySDKResponse
     */
    CompletableFuture<DescribeVerifySDKResponse> describeVerifySDK(DescribeVerifySDKRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Service endpoint: cloudauth.aliyuncs.com.</li>
     * <li>Request method: HTTPS POST and GET.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVerifySearchPageList  DescribeVerifySearchPageListRequest
     * @return DescribeVerifySearchPageListResponse
     */
    CompletableFuture<DescribeVerifySearchPageListResponse> describeVerifySearchPageList(DescribeVerifySearchPageListRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Request method: HTTPS POST and GET methods are supported.</li>
     * <li>Service address: cloudauth.aliyuncs.com.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVerifyStatistics  DescribeVerifyStatisticsRequest
     * @return DescribeVerifyStatisticsResponse
     */
    CompletableFuture<DescribeVerifyStatisticsResponse> describeVerifyStatistics(DescribeVerifyStatisticsRequest request);

    /**
     * <b>description</b> :
     * <p>Preparations: Before integrating this API, make sure that you have completed the corresponding preparations. For more information, see <a href="https://help.aliyun.com/document_detail/127536.html">Overview of the integration process for ID Verification solutions</a> and <a href="https://help.aliyun.com/document_detail/127687.html">Overview of the integration process for face liveness verification solutions (liveness detection solutions)</a>.
     * Request methods: HTTPS POST and GET.
     * Operation description: Before each authentication, call this operation to obtain an authentication token (VerifyToken). The token is used to link all operations in the authentication request.
     * Applicable scope: This operation applies to mobile SDK integration.
     * Image URL: You must use an HTTP or HTTPS URL that is accessible over the Internet. Example: <code>http://image-demo.img-cn-hangzhou.aliyuncs.com/example.jpg</code>.
     * Image limits:</p>
     * <ul>
     * <li>The relative path or absolute path of local images is not supported.</li>
     * <li>The size of a single image must not exceed 2 MB to prevent algorithm pull timeouts.</li>
     * <li>The face area in the image must be at least 64 × 64 pixels.</li>
     * <li>The body of a single request is limited to 8 MB. Calculate the total size of all images and other information in the request to ensure that the limit is not exceeded.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVerifyToken  DescribeVerifyTokenRequest
     * @return DescribeVerifyTokenResponse
     */
    CompletableFuture<DescribeVerifyTokenResponse> describeVerifyToken(DescribeVerifyTokenRequest request);

    /**
     * <b>description</b> :
     * <p>Request method: Only HTTPS POST requests are supported.</p>
     * 
     * @param request the request parameters of DescribeWhitelistSetting  DescribeWhitelistSettingRequest
     * @return DescribeWhitelistSettingResponse
     */
    CompletableFuture<DescribeWhitelistSettingResponse> describeWhitelistSetting(DescribeWhitelistSettingRequest request);

    /**
     * <b>description</b> :
     * <p>Request method: Only HTTPS POST requests are supported.
     * API description: Detects the validity-related attributes of faces in the input photo to help you determine whether the photo meets your business requirements for retention or comparison. Currently supported face validity attributes include whether it is a face, whether it is blurred, whether glasses are worn, face pose, and whether it is a smiling face.
     * Image URL description: When you pass an image, you must provide its HTTP URL, OSS URL, or Base64-encoded string.</p>
     * <ul>
     * <li>HTTP URL: A publicly accessible HTTP URL. Example: <code>http://image-demo.img-cn-hangzhou.aliyuncs.com/example.jpg</code>.</li>
     * <li>Base64 encoding: A Base64-encoded image in the format of <code>base64://&lt;Base64 string of the image&gt;</code>.
     * Image limits:</li>
     * <li>Neither a relative path nor an absolute path is supported for local images.</li>
     * <li>The size of a single image must not exceed 2 MB to prevent algorithm pulling timeouts.</li>
     * <li>The body of a single request is limited to 8 MB. Calculate the total size of all images and other information in the request to ensure it does not exceed the limit.</li>
     * <li>When you use Base64 to pass an image, the request method of the API must be POST. The header description, such as the data:image/png prefix, must be removed from the Base64 character string of the image.</li>
     * </ul>
     * 
     * @param request the request parameters of DetectFaceAttributes  DetectFaceAttributesRequest
     * @return DetectFaceAttributesResponse
     */
    CompletableFuture<DetectFaceAttributesResponse> detectFaceAttributes(DetectFaceAttributesRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the download link for the statistical call data file of a product solution based on query conditions.</p>
     * <ul>
     * <li>Method: HTTPS POST</li>
     * <li>Endpoint: cloudauth.aliyuncs.com<blockquote>
     * <p>ID Verification products calculate call volumes based on CertifyId. To facilitate reconciliation, retain the CertifyId field in your system.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DownloadVerifyRecords  DownloadVerifyRecordsRequest
     * @return DownloadVerifyRecordsResponse
     */
    CompletableFuture<DownloadVerifyRecordsResponse> downloadVerifyRecords(DownloadVerifyRecordsRequest request);

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
     * <li>Service endpoint: cloudauth.aliyuncs.com (IPv4) or cloudauth-dualstack.aliyuncs.com (IPv6).</li>
     * <li>Request methods: POST and GET.</li>
     * <li>Transport protocol: HTTPS.</li>
     * </ul>
     * 
     * @param request the request parameters of Id2MetaVerify  Id2MetaVerifyRequest
     * @return Id2MetaVerifyResponse
     */
    CompletableFuture<Id2MetaVerifyResponse> id2MetaVerify(Id2MetaVerifyRequest request);

    /**
     * @param request the request parameters of InitAuthVerify  InitAuthVerifyRequest
     * @return InitAuthVerifyResponse
     */
    CompletableFuture<InitAuthVerifyResponse> initAuthVerify(InitAuthVerifyRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves a CertifyId by calling this API before each authentication session. The CertifyId is used to link all API calls within the authentication request.</p>
     * 
     * @param request the request parameters of InitCardVerify  InitCardVerifyRequest
     * @return InitCardVerifyResponse
     */
    CompletableFuture<InitCardVerifyResponse> initCardVerify(InitCardVerifyRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Endpoint: cloudauth.aliyuncs.com</li>
     * <li>Request method: HTTPS POST and GET.</li>
     * <li>This API operation uses different parameters for different product solutions. For more information, see <a href="https://www.alibabacloud.com/help/en/id-verification/financial-grade-id-verification/product-overview/introduction/">official documentation</a>.</li>
     * </ul>
     * <h4>Image format requirements</h4>
     * <p>When you perform ID Verification, make sure that the uploaded image meets all the following conditions:</p>
     * <ul>
     * <li>The photo is recent, the face is complete, clear, and unobstructed, the expression is natural, and the face is directly facing the camera.</li>
     * <li>The photo is clear and properly exposed. The face is not too dark, too bright, or surrounded by halos. The angle does not have significant deviation.</li>
     * <li>The resolution does not exceed 1920×1080 and is at least 640×480. We recommend that you scale the short side to 720 pixels and set the compression ratio to greater than 0.9.</li>
     * <li>Image size: less than 1 MB.</li>
     * <li>Photos rotated by 90, 180, or 270 degrees are supported. If multiple faces are detected, the largest face is selected.</li>
     * </ul>
     * 
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
     * <b>description</b> :
     * <p>Calls the LivenessFaceVerify operation to perform liveness detection on face images.</p>
     * 
     * @param request the request parameters of LivenessFaceVerify  LivenessFaceVerifyRequest
     * @return LivenessFaceVerifyResponse
     */
    CompletableFuture<LivenessFaceVerifyResponse> livenessFaceVerify(LivenessFaceVerifyRequest request);

    /**
     * <b>description</b> :
     * <p>Verifies the authenticity and consistency of a mobile phone number and name against authoritative data sources.</p>
     * 
     * @param request the request parameters of Mobile2MetaVerify  Mobile2MetaVerifyRequest
     * @return Mobile2MetaVerifyResponse
     */
    CompletableFuture<Mobile2MetaVerifyResponse> mobile2MetaVerify(Mobile2MetaVerifyRequest request);

    /**
     * <b>description</b> :
     * <p>Verifies the authenticity and consistency of a mobile phone number, name, and ID card number through authoritative data sources. If the information is inconsistent, the system returns the reason for the inconsistency.</p>
     * 
     * @param request the request parameters of Mobile3MetaDetailStandardVerify  Mobile3MetaDetailStandardVerifyRequest
     * @return Mobile3MetaDetailStandardVerifyResponse
     */
    CompletableFuture<Mobile3MetaDetailStandardVerifyResponse> mobile3MetaDetailStandardVerify(Mobile3MetaDetailStandardVerifyRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Endpoint: cloudauth.aliyuncs.com (IPv4) or cloudauth-dualstack.aliyuncs.com (IPv6).</li>
     * <li>HTTP method: POST and GET.</li>
     * <li>Transport protocol: HTTPS.</li>
     * </ul>
     * 
     * @param request the request parameters of Mobile3MetaDetailVerify  Mobile3MetaDetailVerifyRequest
     * @return Mobile3MetaDetailVerifyResponse
     */
    CompletableFuture<Mobile3MetaDetailVerifyResponse> mobile3MetaDetailVerify(Mobile3MetaDetailVerifyRequest request);

    /**
     * <b>description</b> :
     * <p>Verifies the authenticity and consistency of a mobile phone number, name, and ID card number by using authoritative data sources.</p>
     * 
     * @param request the request parameters of Mobile3MetaSimpleStandardVerify  Mobile3MetaSimpleStandardVerifyRequest
     * @return Mobile3MetaSimpleStandardVerifyResponse
     */
    CompletableFuture<Mobile3MetaSimpleStandardVerifyResponse> mobile3MetaSimpleStandardVerify(Mobile3MetaSimpleStandardVerifyRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Service endpoint: cloudauth.aliyuncs.com (IPv4) or cloudauth-dualstack.aliyuncs.com (IPv6).</li>
     * <li>Request methods: POST and GET.</li>
     * <li>Transport protocol: HTTPS.</li>
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
     * <p>Verifies the authenticity and consistency of a mobile phone number and its registration time by using an authoritative data source.</p>
     * 
     * @param request the request parameters of MobileRecycledMetaVerify  MobileRecycledMetaVerifyRequest
     * @return MobileRecycledMetaVerifyResponse
     */
    CompletableFuture<MobileRecycledMetaVerifyResponse> mobileRecycledMetaVerify(MobileRecycledMetaVerifyRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Endpoint: cloudauth.aliyuncs.com.</li>
     * <li>Request method: HTTPS POST and GET.</li>
     * <li>Operation description: Creates or modifies blacklist rules.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyBlackListStrategy  ModifyBlackListStrategyRequest
     * @return ModifyBlackListStrategyResponse
     */
    CompletableFuture<ModifyBlackListStrategyResponse> modifyBlackListStrategy(ModifyBlackListStrategyRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Request method: Requests are sent by using the HTTPS POST method.</li>
     * <li>Request endpoint: cloudauth.aliyuncs.com.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyControlStrategy  ModifyControlStrategyRequest
     * @return ModifyControlStrategyResponse
     */
    CompletableFuture<ModifyControlStrategyResponse> modifyControlStrategy(ModifyControlStrategyRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Request method: You can send requests by using the HTTPS POST and GET methods.</li>
     * <li>Service endpoint: cloudauth.aliyuncs.com.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyCustomizeFlowStrategyList  ModifyCustomizeFlowStrategyListRequest
     * @return ModifyCustomizeFlowStrategyListResponse
     */
    CompletableFuture<ModifyCustomizeFlowStrategyListResponse> modifyCustomizeFlowStrategyList(ModifyCustomizeFlowStrategyListRequest request);

    /**
     * <b>description</b> :
     * <p>Request method: You can send requests by using the HTTPS POST and GET methods.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>Request URL: cloudauth.aliyuncs.com</li>
     * <li>Request method: HTTPS POST and GET.<blockquote>
     * <p>You can configure blacklists for IP addresses, ID card numbers, mobile phone numbers, and bank card numbers. When a request matches a blacklist, the system rejects the request and returns a fixed error code.
     * You can configure blacklists for IP addresses, ID card numbers, mobile phone numbers, and bank card numbers. When a request matches a blacklist, the system rejects the request and returns a fixed error code.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of QueryBlackListStrategy  QueryBlackListStrategyRequest
     * @return QueryBlackListStrategyResponse
     */
    CompletableFuture<QueryBlackListStrategyResponse> queryBlackListStrategy(QueryBlackListStrategyRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Request method: The HTTPS POST and GET methods are supported.</li>
     * <li>Request endpoint: cloudauth.aliyuncs.com.</li>
     * </ul>
     * 
     * @param request the request parameters of QueryControlStrategy  QueryControlStrategyRequest
     * @return QueryControlStrategyResponse
     */
    CompletableFuture<QueryControlStrategyResponse> queryControlStrategy(QueryControlStrategyRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Endpoint: cloudauth.aliyuncs.com</li>
     * <li>Request method: HTTPS POST and GET.</li>
     * <li>Security rules: monitoring rules that ensure system security, such as API abuse and abnormal account theft. When a threshold is reached, the system triggers an alert.</li>
     * </ul>
     * 
     * @param request the request parameters of QueryCustomizeFlowStrategy  QueryCustomizeFlowStrategyRequest
     * @return QueryCustomizeFlowStrategyResponse
     */
    CompletableFuture<QueryCustomizeFlowStrategyResponse> queryCustomizeFlowStrategy(QueryCustomizeFlowStrategyRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Service endpoint: cloudauth.aliyuncs.com.</li>
     * <li>Request methods: HTTPS POST and GET.</li>
     * </ul>
     * 
     * @param request the request parameters of QuerySceneConfigs  QuerySceneConfigsRequest
     * @return QuerySceneConfigsResponse
     */
    CompletableFuture<QuerySceneConfigsResponse> querySceneConfigs(QuerySceneConfigsRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the download URL for the statistical call data file of a product plan based on query conditions.</p>
     * <ul>
     * <li>Method: HTTPS POST</li>
     * <li>Endpoint: cloudauth.aliyuncs.com<blockquote>
     * <p>The ID Verification product calculates the call volume based on CertifyId. To facilitate reconciliation, retain the CertifyId field in your system.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of QueryVerifyDownloadTask  QueryVerifyDownloadTaskRequest
     * @return QueryVerifyDownloadTaskResponse
     */
    CompletableFuture<QueryVerifyDownloadTaskResponse> queryVerifyDownloadTask(QueryVerifyDownloadTaskRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Service endpoint: cloudauth.aliyuncs.com</li>
     * <li>Request method: HTTPS POST and GET.</li>
     * <li>This operation uses different parameters for different product plans. For more information, refer to the <a href="https://www.alibabacloud.com/help/en/id-verification/financial-grade-id-verification/product-overview/introduction/">official documentation</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of QueryVerifyFlowPackage  QueryVerifyFlowPackageRequest
     * @return QueryVerifyFlowPackageResponse
     */
    CompletableFuture<QueryVerifyFlowPackageResponse> queryVerifyFlowPackage(QueryVerifyFlowPackageRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Request endpoint: cloudauth.aliyuncs.com</li>
     * <li>Request method: HTTPS POST and GET.<blockquote>
     * <p>ID Verification products use CertifyId to calculate call volume. To facilitate reconciliation, retain the CertifyId field in your system.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of QueryVerifyInvokeSatistic  QueryVerifyInvokeSatisticRequest
     * @return QueryVerifyInvokeSatisticResponse
     */
    CompletableFuture<QueryVerifyInvokeSatisticResponse> queryVerifyInvokeSatistic(QueryVerifyInvokeSatisticRequest request);

    /**
     * @param request the request parameters of RemoveWhiteListSetting  RemoveWhiteListSettingRequest
     * @return RemoveWhiteListSettingResponse
     */
    CompletableFuture<RemoveWhiteListSettingResponse> removeWhiteListSetting(RemoveWhiteListSettingRequest request);

    /**
     * <b>description</b> :
     * <p>Updates the information of a China Finance Certification scenario based on the scenario ID.</p>
     * <ul>
     * <li>Service endpoint: cloudauth.aliyuncs.com.</li>
     * <li>Request method: HTTPS POST.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateAntCloudAuthScene  UpdateAntCloudAuthSceneRequest
     * @return UpdateAntCloudAuthSceneResponse
     */
    CompletableFuture<UpdateAntCloudAuthSceneResponse> updateAntCloudAuthScene(UpdateAntCloudAuthSceneRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Request method: HTTPS POST.</li>
     * <li>Request endpoint: cloudauth.aliyuncs.com.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateSceneConfig  UpdateSceneConfigRequest
     * @return UpdateSceneConfigResponse
     */
    CompletableFuture<UpdateSceneConfigResponse> updateSceneConfig(UpdateSceneConfigRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the basic vehicle information based on the license plate number and vehicle type.</p>
     * 
     * @param request the request parameters of Vehicle5ItemQuery  Vehicle5ItemQueryRequest
     * @return Vehicle5ItemQueryResponse
     */
    CompletableFuture<Vehicle5ItemQueryResponse> vehicle5ItemQuery(Vehicle5ItemQueryRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the insurance date of a vehicle by license plate number, vehicle type, and vehicle identification number (VIN).</p>
     * 
     * @param request the request parameters of VehicleInsureQuery  VehicleInsureQueryRequest
     * @return VehicleInsureQueryResponse
     */
    CompletableFuture<VehicleInsureQueryResponse> vehicleInsureQuery(VehicleInsureQueryRequest request);

    /**
     * <b>description</b> :
     * <p>Verifies the consistency of the name, ID card number, license plate number, and vehicle type.</p>
     * 
     * @param request the request parameters of VehicleMetaVerify  VehicleMetaVerifyRequest
     * @return VehicleMetaVerifyResponse
     */
    CompletableFuture<VehicleMetaVerifyResponse> vehicleMetaVerify(VehicleMetaVerifyRequest request);

    /**
     * <b>description</b> :
     * <p>Verifies the consistency of the name, ID card number, license plate number, and vehicle type, and returns vehicle details.</p>
     * 
     * @param request the request parameters of VehicleMetaVerifyV2  VehicleMetaVerifyV2Request
     * @return VehicleMetaVerifyV2Response
     */
    CompletableFuture<VehicleMetaVerifyV2Response> vehicleMetaVerifyV2(VehicleMetaVerifyV2Request request);

    /**
     * <b>description</b> :
     * <p>Queries the detailed information of a vehicle by license plate number and vehicle type.</p>
     * 
     * @param request the request parameters of VehicleQuery  VehicleQueryRequest
     * @return VehicleQueryResponse
     */
    CompletableFuture<VehicleQueryResponse> vehicleQuery(VehicleQueryRequest request);

    /**
     * <b>description</b> :
     * <p>Preparations: Before integrating this API, ensure that you have completed the required preparations. For more information, see <a href="https://help.aliyun.com/document_detail/127471.html">Server-side integration preparations</a>.
     * Request methods: HTTPS POST and GET.
     * API description: The integrator\&quot;s server submits authentication materials to the ID Verification service for verification and comparison, and the result is returned synchronously.
     * Applicable scope: This API is applicable only to server-only integration authentication solutions.
     * Image URL description:</p>
     * <ul>
     * <li>HTTP or HTTPS URL: Publicly accessible HTTP or HTTPS URLs are supported. Example: <code>http://image-demo.img-cn-hangzhou.aliyuncs.com/example.jpg</code>.</li>
     * <li>OSS URL: If the integrator\&quot;s images are local files, Alibaba Cloud provides corresponding upload SDKs. You can use the SDK to upload images to the OSS bucket specified by the ID Verification service, obtain the corresponding OSS URL, and use it as the image URL parameter for the API. If your business requires the upload SDK, submit a <a href="https://selfservice.console.aliyun.com/ticket/category/cloudauth/today">ticket</a> to contact us.
     * Image limits:</li>
     * <li>The relative path or absolute path of a local image is not supported.</li>
     * <li>Keep the size of a single image within 2 MB to prevent timeouts when the algorithm pulls the image.</li>
     * <li>The face area in the image must be at least 64 × 64 pixels.</li>
     * <li>The body of a single request is limited to 8 MB. Calculate the total size of all images and other information in the request to ensure it does not exceed the limit.</li>
     * </ul>
     * 
     * @param request the request parameters of VerifyMaterial  VerifyMaterialRequest
     * @return VerifyMaterialResponse
     */
    CompletableFuture<VerifyMaterialResponse> verifyMaterial(VerifyMaterialRequest request);

}
