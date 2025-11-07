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
     * <b>description</b> :
     * <p>Request Method: Supports sending requests via HTTPS POST and GET methods.</p>
     * <blockquote>
     * <p>The authorization key is valid for 30 minutes and cannot be reused. It is recommended to reacquire it before each activation.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateAntCloudAuthScene  CreateAntCloudAuthSceneRequest
     * @return CreateAntCloudAuthSceneResponse
     */
    CompletableFuture<CreateAntCloudAuthSceneResponse> createAntCloudAuthScene(CreateAntCloudAuthSceneRequest request);

    /**
     * <b>description</b> :
     * <p>Request Method: Supports sending requests via HTTPS POST and GET methods.</p>
     * <blockquote>
     * <p>The authorization key is valid for 30 minutes and cannot be reused. It is recommended to re-obtain it before each activation.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateAuthKey  CreateAuthKeyRequest
     * @return CreateAuthKeyResponse
     */
    CompletableFuture<CreateAuthKeyResponse> createAuthKey(CreateAuthKeyRequest request);

    /**
     * <b>description</b> :
     * <p>Request Method: Supports sending requests via HTTPS POST and GET methods.</p>
     * <blockquote>
     * <p>The authorization key is valid for 30 minutes and cannot be reused. It is recommended to reacquire it before each activation.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateCloudauthstScene  CreateCloudauthstSceneRequest
     * @return CreateCloudauthstSceneResponse
     */
    CompletableFuture<CreateCloudauthstSceneResponse> createCloudauthstScene(CreateCloudauthstSceneRequest request);

    /**
     * <b>description</b> :
     * <p>Request Method: Supports sending requests via HTTPS POST.
     * Request Address: cloudauth.aliyuncs.com.</p>
     * <blockquote>
     * <p>The authorization key is valid for 30 minutes and cannot be reused. It is recommended to reacquire it before each activation.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateSceneConfig  CreateSceneConfigRequest
     * @return CreateSceneConfigResponse
     */
    CompletableFuture<CreateSceneConfigResponse> createSceneConfig(CreateSceneConfigRequest request);

    /**
     * <b>description</b> :
     * <p>Request Method: Only supports sending requests via HTTPS POST.</p>
     * 
     * @param request the request parameters of CreateVerifySetting  CreateVerifySettingRequest
     * @return CreateVerifySettingResponse
     */
    CompletableFuture<CreateVerifySettingResponse> createVerifySetting(CreateVerifySettingRequest request);

    /**
     * <b>description</b> :
     * <p>Request Method: Only supports sending requests via HTTPS POST.</p>
     * 
     * @param request the request parameters of CreateWhitelistSetting  CreateWhitelistSettingRequest
     * @return CreateWhitelistSettingResponse
     */
    CompletableFuture<CreateWhitelistSettingResponse> createWhitelistSetting(CreateWhitelistSettingRequest request);

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
     * <p>Request Method: Supports sending requests via HTTPS POST and GET methods.</p>
     * <blockquote>
     * <p>The authorization key is valid for 30 minutes and cannot be reused. It is recommended to reacquire it before each activation.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteAllCustomizeFlowStrategy  DeleteAllCustomizeFlowStrategyRequest
     * @return DeleteAllCustomizeFlowStrategyResponse
     */
    CompletableFuture<DeleteAllCustomizeFlowStrategyResponse> deleteAllCustomizeFlowStrategy(DeleteAllCustomizeFlowStrategyRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Service Address: cloudauth.aliyuncs.com.</li>
     * <li>Request Method: HTTPS POST and GET.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteAntCloudAuthScene  DeleteAntCloudAuthSceneRequest
     * @return DeleteAntCloudAuthSceneResponse
     */
    CompletableFuture<DeleteAntCloudAuthSceneResponse> deleteAntCloudAuthScene(DeleteAntCloudAuthSceneRequest request);

    /**
     * <b>description</b> :
     * <p>Request Method: Only supports sending requests via HTTPS POST method.</p>
     * 
     * @param request the request parameters of DeleteBlackListStrategy  DeleteBlackListStrategyRequest
     * @return DeleteBlackListStrategyResponse
     */
    CompletableFuture<DeleteBlackListStrategyResponse> deleteBlackListStrategy(DeleteBlackListStrategyRequest request);

    /**
     * <b>description</b> :
     * <p>Request Method: Supports sending requests using HTTPS POST and GET methods.</p>
     * <blockquote>
     * <p>The authorization key is valid for 30 minutes and cannot be reused. It is recommended to re-obtain it before each activation.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteCloudauthstScene  DeleteCloudauthstSceneRequest
     * @return DeleteCloudauthstSceneResponse
     */
    CompletableFuture<DeleteCloudauthstSceneResponse> deleteCloudauthstScene(DeleteCloudauthstSceneRequest request);

    /**
     * <b>description</b> :
     * <p>Request Method: Supports sending requests via HTTPS POST.
     * Request URL: cloudauth.aliyuncs.com.</p>
     * 
     * @param request the request parameters of DeleteControlStrategy  DeleteControlStrategyRequest
     * @return DeleteControlStrategyResponse
     */
    CompletableFuture<DeleteControlStrategyResponse> deleteControlStrategy(DeleteControlStrategyRequest request);

    /**
     * <b>description</b> :
     * <p>Request Method: Supports sending requests using HTTPS POST and GET methods.</p>
     * <blockquote>
     * <p>The authorization key is valid for 30 minutes and cannot be reused. It is recommended to reacquire it before each activation.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteCustomizeFlowStrategy  DeleteCustomizeFlowStrategyRequest
     * @return DeleteCustomizeFlowStrategyResponse
     */
    CompletableFuture<DeleteCustomizeFlowStrategyResponse> deleteCustomizeFlowStrategy(DeleteCustomizeFlowStrategyRequest request);

    /**
     * <b>description</b> :
     * <p>Deletes all personal information fields in the request, including name, ID number, phone number, IP, images, videos, and device information, etc.</p>
     * 
     * @param request the request parameters of DeleteFaceVerifyResult  DeleteFaceVerifyResultRequest
     * @return DeleteFaceVerifyResultResponse
     */
    CompletableFuture<DeleteFaceVerifyResultResponse> deleteFaceVerifyResult(DeleteFaceVerifyResultRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Request Method: Supports sending requests via HTTPS POST and GET methods.</li>
     * <li>Request URL: cloudauth.aliyuncs.com.<blockquote>
     * <p>The authorization key is valid for 30 minutes and cannot be reused. It is recommended to re-obtain it before each activation.</p>
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
     * <p>Request Method: Only supports sending requests via HTTPS POST method.</p>
     * 
     * @param request the request parameters of DeleteWhitelistSetting  DeleteWhitelistSettingRequest
     * @return DeleteWhitelistSettingResponse
     */
    CompletableFuture<DeleteWhitelistSettingResponse> deleteWhitelistSetting(DeleteWhitelistSettingRequest request);

    /**
     * <b>description</b> :
     * <p>Request Method: Supports sending requests via HTTPS POST and GET methods.</p>
     * <blockquote>
     * <p>The authorization key is valid for 30 minutes and cannot be reused. It is recommended to re-obtain it before each activation.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeAntAndCloudAuthUserStatus  DescribeAntAndCloudAuthUserStatusRequest
     * @return DescribeAntAndCloudAuthUserStatusResponse
     */
    CompletableFuture<DescribeAntAndCloudAuthUserStatusResponse> describeAntAndCloudAuthUserStatus(DescribeAntAndCloudAuthUserStatusRequest request);

    /**
     * <b>description</b> :
     * <p>After receiving the callback notification, you can use this interface on the server side to obtain the corresponding authentication status and information.</p>
     * 
     * @param request the request parameters of DescribeCardVerify  DescribeCardVerifyRequest
     * @return DescribeCardVerifyResponse
     */
    CompletableFuture<DescribeCardVerifyResponse> describeCardVerify(DescribeCardVerifyRequest request);

    /**
     * <b>description</b> :
     * <p>Request Method: Supports sending requests via HTTPS POST and GET methods.</p>
     * <blockquote>
     * <p>The authorization key is valid for 30 minutes and cannot be reused. It is recommended to reacquire it before each activation.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeCloudauthstSceneList  DescribeCloudauthstSceneListRequest
     * @return DescribeCloudauthstSceneListResponse
     */
    CompletableFuture<DescribeCloudauthstSceneListResponse> describeCloudauthstSceneList(DescribeCloudauthstSceneListRequest request);

    /**
     * <b>description</b> :
     * <p>Request Method: Supports sending requests using HTTPS POST and GET methods.</p>
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
     * <li>Service Address: cloudauth.aliyuncs.com.</li>
     * <li>Request Method: HTTPS POST and GET.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeFaceVerify  DescribeFaceVerifyRequest
     * @return DescribeFaceVerifyResponse
     */
    CompletableFuture<DescribeFaceVerifyResponse> describeFaceVerify(DescribeFaceVerifyRequest request);

    /**
     * @param request the request parameters of DescribeInfoCheckExportRecord  DescribeInfoCheckExportRecordRequest
     * @return DescribeInfoCheckExportRecordResponse
     */
    CompletableFuture<DescribeInfoCheckExportRecordResponse> describeInfoCheckExportRecord(DescribeInfoCheckExportRecordRequest request);

    /**
     * <b>description</b> :
     * <p>Request Method: Supports sending requests via HTTPS POST and GET methods.</p>
     * <blockquote>
     * <p>The authorization key is valid for 30 minutes and cannot be reused. It is recommended to re-obtain it before each activation.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeListAntCloudAuthScenes  DescribeListAntCloudAuthScenesRequest
     * @return DescribeListAntCloudAuthScenesResponse
     */
    CompletableFuture<DescribeListAntCloudAuthScenesResponse> describeListAntCloudAuthScenes(DescribeListAntCloudAuthScenesRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Service Address: cloudauth.aliyuncs.com.</li>
     * <li>Request Method: HTTPS POST and GET.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeListFaceVerifyData  DescribeListFaceVerifyDataRequest
     * @return DescribeListFaceVerifyDataResponse
     */
    CompletableFuture<DescribeListFaceVerifyDataResponse> describeListFaceVerifyData(DescribeListFaceVerifyDataRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Service address: cloudauth.aliyuncs.com.</li>
     * <li>Request method: HTTPS POST and GET.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeListFaceVerifyInfos  DescribeListFaceVerifyInfosRequest
     * @return DescribeListFaceVerifyInfosResponse
     */
    CompletableFuture<DescribeListFaceVerifyInfosResponse> describeListFaceVerifyInfos(DescribeListFaceVerifyInfosRequest request);

    /**
     * @param request the request parameters of DescribeMetaSearchPageList  DescribeMetaSearchPageListRequest
     * @return DescribeMetaSearchPageListResponse
     */
    CompletableFuture<DescribeMetaSearchPageListResponse> describeMetaSearchPageList(DescribeMetaSearchPageListRequest request);

    /**
     * @param request the request parameters of DescribeMetaStatisticsList  DescribeMetaStatisticsListRequest
     * @return DescribeMetaStatisticsListResponse
     */
    CompletableFuture<DescribeMetaStatisticsListResponse> describeMetaStatisticsList(DescribeMetaStatisticsListRequest request);

    /**
     * @param request the request parameters of DescribeMetaStatisticsPageList  DescribeMetaStatisticsPageListRequest
     * @return DescribeMetaStatisticsPageListResponse
     */
    CompletableFuture<DescribeMetaStatisticsPageListResponse> describeMetaStatisticsPageList(DescribeMetaStatisticsPageListRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Request Method: Supports sending requests via HTTPS POST and GET methods.</li>
     * <li>Service Address: cloudauth.aliyuncs.com.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeOssStatus  DescribeOssStatusRequest
     * @return DescribeOssStatusResponse
     */
    CompletableFuture<DescribeOssStatusResponse> describeOssStatus(DescribeOssStatusRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Request Method: Supports sending requests via HTTPS POST and GET methods.</li>
     * <li>Service Address: cloudauth.aliyuncs.com.</li>
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
     * <p>Request Method: Only supports sending requests via HTTPS POST method.</p>
     * 
     * @param request the request parameters of DescribePageSetting  DescribePageSettingRequest
     * @return DescribePageSettingResponse
     */
    CompletableFuture<DescribePageSettingResponse> describePageSetting(DescribePageSettingRequest request);

    /**
     * <b>description</b> :
     * <p>Request Method: Supports sending requests via HTTPS GET/POST methods.</p>
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
     * <li>Service Address: cloudauth.aliyuncs.com.</li>
     * <li>Request Method: HTTPS POST and GET.</li>
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
     * <li>Service Address: cloudauth.aliyuncs.com.</li>
     * <li>Request Method: HTTPS POST and GET.</li>
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
     * <p>Prerequisites: Before accessing this API, please ensure that you have completed the necessary preparations. For more details, see <a href="https://help.aliyun.com/document_detail/127471.html">Real Person Authentication Server-side Preparation</a> and <a href="https://help.aliyun.com/document_detail/127717.html">Liveness Face Verification Server-side Preparation</a>.</p>
     * <blockquote>
     * <p>Alibaba Cloud Real Person Authentication only stores authentication data for the last 180 days. For any subsequent business use, please call this interface in a timely manner to retrieve and store the data yourself to avoid any impact on usage.
     * Request Method: HTTPS POST and GET.
     * Interface Description: After the mobile end of the access party receives the callback, its server can call this interface to obtain the corresponding authentication status and authentication information.
     * Applicable Scope: This interface is applicable to the authentication solution with SDK + server-side integration.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeVerifyResult  DescribeVerifyResultRequest
     * @return DescribeVerifyResultResponse
     */
    CompletableFuture<DescribeVerifyResultResponse> describeVerifyResult(DescribeVerifyResultRequest request);

    /**
     * <b>description</b> :
     * <p>Request Method: Supports sending requests via HTTPS POST and GET methods.
     * Interface Description: Obtain the SDK generation result based on the task ID for generating an offline facial recognition SDK.</p>
     * 
     * @param request the request parameters of DescribeVerifySDK  DescribeVerifySDKRequest
     * @return DescribeVerifySDKResponse
     */
    CompletableFuture<DescribeVerifySDKResponse> describeVerifySDK(DescribeVerifySDKRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Service Address: cloudauth.aliyuncs.com.</li>
     * <li>Request Method: HTTPS POST and GET.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVerifySearchPageList  DescribeVerifySearchPageListRequest
     * @return DescribeVerifySearchPageListResponse
     */
    CompletableFuture<DescribeVerifySearchPageListResponse> describeVerifySearchPageList(DescribeVerifySearchPageListRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Request Method: Supports sending requests using HTTPS POST and GET methods.</li>
     * <li>Service Address: cloudauth.aliyuncs.com.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVerifyStatistics  DescribeVerifyStatisticsRequest
     * @return DescribeVerifyStatisticsResponse
     */
    CompletableFuture<DescribeVerifyStatisticsResponse> describeVerifyStatistics(DescribeVerifyStatisticsRequest request);

    /**
     * <b>description</b> :
     * <p>Preparation for Access: When integrating this API, please ensure that the corresponding preparations have been completed. For details, see <a href="https://help.aliyun.com/document_detail/127536.html">Overview of Real Person Authentication Solution Integration Process</a> and <a href="https://help.aliyun.com/document_detail/127687.html">Overview of Live Face Verification Solution (Liveness Detection Solution) Integration Process</a>.
     * Request Method: HTTPS POST and GET
     * API Description: Before each authentication, use this interface to obtain an authentication Token (VerifyToken), which is used to link various interfaces in the authentication request.
     * Applicable Scope: This interface is suitable for wireless SDK integration.
     * Image Address: Use HTTP or HTTPS addresses that are publicly accessible over the Internet. For example, <code>http://image-demo.img-cn-hangzhou.aliyuncs.com/example.jpg</code>.
     * Image Restrictions:</p>
     * <ul>
     * <li>Relative or absolute paths of local images are not supported.</li>
     * <li>The size of a single image should be controlled within 2 MB to avoid algorithm retrieval timeout.</li>
     * <li>The face area in the image must be at least 64*64 pixels (px).</li>
     * <li>There is an 8 MB size limit for the Body of a single request. Please calculate the total size of all images and other information in the request to ensure it does not exceed the limit.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVerifyToken  DescribeVerifyTokenRequest
     * @return DescribeVerifyTokenResponse
     */
    CompletableFuture<DescribeVerifyTokenResponse> describeVerifyToken(DescribeVerifyTokenRequest request);

    /**
     * <b>description</b> :
     * <p>Request Method: Only supports sending requests via HTTPS POST method.</p>
     * 
     * @param request the request parameters of DescribeWhitelistSetting  DescribeWhitelistSettingRequest
     * @return DescribeWhitelistSettingResponse
     */
    CompletableFuture<DescribeWhitelistSettingResponse> describeWhitelistSetting(DescribeWhitelistSettingRequest request);

    /**
     * <b>description</b> :
     * <p>Request Method: Only supports sending requests via HTTPS POST.
     * Interface Description: Detects the validity-related attributes of faces in the input photo, which helps the business side to determine whether the photo meets their own business retention or comparison requirements. The currently supported face validity-related attributes include: whether it is a face, whether it is blurry, whether glasses are worn, face pose, whether it is a smile, etc.
     * Instructions for Uploading Image Addresses: When passing in images, you need to upload their corresponding HTTP, OSS addresses, or Base64 encoding.</p>
     * <ul>
     * <li>HTTP Address: A publicly accessible HTTP address. For example, <code>http://image-demo.img-cn-hangzhou.aliyuncs.com/example.jpg</code>.</li>
     * <li>Base64 Encoding: An image encoded through base64, with the format being <code>base64://&lt;image base64 string&gt;</code>.
     * Image Limitations:</li>
     * <li>Does not support relative or absolute paths of local images.</li>
     * <li>Please keep the size of a single image within 2 MB to avoid algorithm timeout.</li>
     * <li>There is an 8 MB size limit for the Body of a single request; please calculate the total size of all images and other information in the request and do not exceed the limit.</li>
     * <li>When using Base64 to pass images, the request method needs to be changed to POST; the header description of the image Base64 string, such as <code>data:image/png;base64</code>, should be removed.</li>
     * </ul>
     * 
     * @param request the request parameters of DetectFaceAttributes  DetectFaceAttributesRequest
     * @return DetectFaceAttributesResponse
     */
    CompletableFuture<DetectFaceAttributesResponse> detectFaceAttributes(DetectFaceAttributesRequest request);

    /**
     * <b>description</b> :
     * <p>Obtain the download link for statistical call data files under the product plan based on query conditions.</p>
     * <ul>
     * <li>Method: HTTPS POST</li>
     * <li>Service Address: cloudauth.aliyuncs.com<blockquote>
     * <p>Real-person authentication products use CertifyId to count call volumes. For ease of reconciliation, please retain the CertifyId field in your system.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>Service Address: cloudauth.aliyuncs.com</li>
     * <li>Request Method: HTTPS POST and GET.</li>
     * <li>This interface uses different parameters for different product solutions. For details, please refer to the <a href="https://help.aliyun.com/zh/id-verification/financial-grade-id-verification/product-overview/introduction/?spm=a2c4g.11186623.help-menu-2401581.d_0_0.13f644ecRzFHfm&scm=20140722.H_99169._.OR_help-T_cn~zh-V_1">official documentation</a>.</li>
     * </ul>
     * <h4>Image Format Requirements</h4>
     * <p>When performing real-person authentication, please provide images that meet all of the following conditions:</p>
     * <ul>
     * <li>Recent photo with a clear, unobstructed face, natural expression, and facing the camera directly.</li>
     * <li>Clear photo with normal exposure, no overexposure, underexposure, or halo effects, and no significant angle deviation.</li>
     * <li>Resolution not exceeding 1920<em>1080, at least 640</em>480, recommended short side scaled to 720 pixels, compression ratio greater than 0.9.</li>
     * <li>Photo size: &lt;1MB.</li>
     * <li>Supports 90, 180, and 270-degree photos; in the case of multiple faces, the largest face will be selected.</li>
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
     * <p>Invoke the LivenessFaceVerify interface to perform liveness detection on a face image.</p>
     * 
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
     * <ul>
     * <li>Service Address: cloudauth.aliyuncs.com.</li>
     * <li>Request Method: HTTPS POST and GET.</li>
     * <li>Interface Description: Add or modify blacklist rule.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyBlackListStrategy  ModifyBlackListStrategyRequest
     * @return ModifyBlackListStrategyResponse
     */
    CompletableFuture<ModifyBlackListStrategyResponse> modifyBlackListStrategy(ModifyBlackListStrategyRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Request Method: Supports sending requests via HTTPS POST method.</li>
     * <li>Request Address: cloudauth.aliyuncs.com.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyControlStrategy  ModifyControlStrategyRequest
     * @return ModifyControlStrategyResponse
     */
    CompletableFuture<ModifyControlStrategyResponse> modifyControlStrategy(ModifyControlStrategyRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Request Method: Supports sending requests via HTTPS POST and GET methods.</li>
     * <li>Service Address: cloudauth.aliyuncs.com.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyCustomizeFlowStrategyList  ModifyCustomizeFlowStrategyListRequest
     * @return ModifyCustomizeFlowStrategyListResponse
     */
    CompletableFuture<ModifyCustomizeFlowStrategyListResponse> modifyCustomizeFlowStrategyList(ModifyCustomizeFlowStrategyListRequest request);

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
     * <b>description</b> :
     * <ul>
     * <li>Request URL: cloudauth.aliyuncs.com</li>
     * <li>Request Method: HTTPS POST and GET.<blockquote>
     * <p>Supports setting blacklists for IP, ID number, phone number, bank card number, etc. When a blacklist is hit, the system rejects the request and returns a fixed error code.
     * Supports setting blacklists for IP, ID number, phone number, bank card number, etc. When a blacklist is hit, the system rejects the request and returns a fixed error code.</p>
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
     * <li>Request Method: Supports sending requests via HTTPS POST and GET methods.</li>
     * <li>Request Address: cloudauth.aliyuncs.com.</li>
     * </ul>
     * 
     * @param request the request parameters of QueryControlStrategy  QueryControlStrategyRequest
     * @return QueryControlStrategyResponse
     */
    CompletableFuture<QueryControlStrategyResponse> queryControlStrategy(QueryControlStrategyRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Service Address: cloudauth.aliyuncs.com</li>
     * <li>Request Method: HTTPS POST and GET.</li>
     * <li>Security Rules: These are rules to ensure system security, such as monitoring for API abuse, account theft, etc. When a threshold is triggered, the system supports alerting.</li>
     * </ul>
     * 
     * @param request the request parameters of QueryCustomizeFlowStrategy  QueryCustomizeFlowStrategyRequest
     * @return QueryCustomizeFlowStrategyResponse
     */
    CompletableFuture<QueryCustomizeFlowStrategyResponse> queryCustomizeFlowStrategy(QueryCustomizeFlowStrategyRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Service address: cloudauth.aliyuncs.com.</li>
     * <li>Request method: HTTPS POST and GET.</li>
     * </ul>
     * 
     * @param request the request parameters of QuerySceneConfigs  QuerySceneConfigsRequest
     * @return QuerySceneConfigsResponse
     */
    CompletableFuture<QuerySceneConfigsResponse> querySceneConfigs(QuerySceneConfigsRequest request);

    /**
     * <b>description</b> :
     * <p>Obtain the download link for statistical call data files under the product plan based on query conditions.</p>
     * <ul>
     * <li>Method: HTTPS POST</li>
     * <li>Service Address: cloudauth.aliyuncs.com<blockquote>
     * <p>The real-person authentication product uses CertifyId to count the number of calls. For ease of reconciliation, please retain the CertifyId field in your system.</p>
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
     * <li>Service address: cloudauth.aliyuncs.com</li>
     * <li>Request method: HTTPS POST and GET.</li>
     * <li>This interface uses different parameters for different product solutions. For details, please refer to the <a href="https://help.aliyun.com/zh/id-verification/financial-grade-id-verification/product-overview/introduction/?spm=a2c4g.11186623.help-menu-2401581.d_0_0.13f644ecRzFHfm&scm=20140722.H_99169._.OR_help-T_cn~zh-V_1">official documentation</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of QueryVerifyFlowPackage  QueryVerifyFlowPackageRequest
     * @return QueryVerifyFlowPackageResponse
     */
    CompletableFuture<QueryVerifyFlowPackageResponse> queryVerifyFlowPackage(QueryVerifyFlowPackageRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Request URL: cloudauth.aliyuncs.com</li>
     * <li>Request Method: HTTPS POST and GET.<blockquote>
     * <p>Real-person authentication products use CertifyId to count call volume. For ease of reconciliation, please retain the CertifyId field in your system.</p>
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
     * <p>Update the information of a financial-level authentication scenario based on the scenario ID.</p>
     * <ul>
     * <li>Service address: cloudauth.aliyuncs.com.</li>
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
     * <li>Request Method: Supports sending requests via HTTPS POST.</li>
     * <li>Request URL: cloudauth.aliyuncs.com.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateSceneConfig  UpdateSceneConfigRequest
     * @return UpdateSceneConfigResponse
     */
    CompletableFuture<UpdateSceneConfigResponse> updateSceneConfig(UpdateSceneConfigRequest request);

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
     * <b>description</b> :
     * <p>Preparation for Access: When integrating this API, please ensure that the corresponding preparatory work has been completed. For details, please refer to <a href="https://help.aliyun.com/document_detail/127471.html">Server-side Access Preparation</a>.
     * Request Method: HTTPS POST and GET.
     * API Description: The server of the access party submits the authentication materials to the real-person authentication service for verification and comparison, with the results returned synchronously.
     * Applicable Scope: This interface is only applicable to pure server-side access authentication solutions.
     * Image Upload Address Explanation:</p>
     * <ul>
     * <li>HTTP or HTTPS address: Supports publicly accessible HTTP or HTTPS addresses. For example, <code>http://image-demo.img-cn-hangzhou.aliyuncs.com/example.jpg</code>.</li>
     * <li>OSS address: If the images from the access party are local files, Alibaba Cloud also provides an upload SDK, supporting the business party to upload the images to the specified OSS bucket of the real-person authentication service, and use the obtained OSS address as the image address parameter in the interface. If your business needs to use the upload SDK, please submit a <a href="https://selfservice.console.aliyun.com/ticket/category/cloudauth/today">ticket</a> to contact us for acquisition.
     * Image Limitations:</li>
     * <li>Does not support relative or absolute paths of local images.</li>
     * <li>Please keep the size of a single image within 2 MB to avoid algorithm retrieval timeout.</li>
     * <li>The face area in the image should be at least 64*64 pixels.</li>
     * <li>There is an 8 MB size limit for the Body of a single request. Please calculate the total size of all images and other information in the request, and do not exceed the limit.</li>
     * </ul>
     * 
     * @param request the request parameters of VerifyMaterial  VerifyMaterialRequest
     * @return VerifyMaterialResponse
     */
    CompletableFuture<VerifyMaterialResponse> verifyMaterial(VerifyMaterialRequest request);

}
