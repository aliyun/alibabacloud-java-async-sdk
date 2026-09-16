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
     * <p>Verifies bank card information consistency, including two-element verification (name + bank card number), three-element verification (name + ID card number + bank card number), and four-element verification (name + ID card number + phone number + bank card number).</p>
     * <ul>
     * <li>Service endpoint:<ul>
     * <li>Singapore region: cloudauth.ap-southeast-1.aliyuncs.com (IPv4) or cloudauth-dualstack.ap-southeast-1.aliyuncs.com (IPv6).</li>
     * <li>Malaysia region: cloudauth.ap-southeast-3.aliyuncs.com (IPv4) or cloudauth-dualstack.ap-southeast-3.aliyuncs.com (IPv6).</li>
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
     * <li>API operation: CompareFaceVerify.</li>
     * <li>Endpoint: cloudauth.aliyuncs.com.</li>
     * <li>Request method: HTTPS POST and GET.</li>
     * <li>Operation description: Implements ID Verification through server-side integration.</li>
     * </ul>
     * <h4>Photo format requirements</h4>
     * <p>When performing face comparison, submit two face photos that meet all of the following conditions:</p>
     * <ul>
     * <li>Recent photos or recent reference photos with a complete, clear, and unobstructed face, a natural expression, and the subject facing the camera directly.</li>
     * <li>Clear photos with normal exposure. The face must not be too dark, too bright, or have lens flare, and the angle must not deviate significantly.</li>
     * <li>Resolution must not exceed 1920×1080 and must be at least 640×480. The short side is recommended to be scaled to 720 pixels with a compression ratio greater than 0.9.</li>
     * <li>Photo size: &lt; 1 MB.</li>
     * <li>Photos rotated 90, 180, and 270 degrees are supported. If multiple faces are detected, the largest face is selected.</li>
     * </ul>
     * 
     * @param request the request parameters of CompareFaceVerify  CompareFaceVerifyRequest
     * @return CompareFaceVerifyResponse
     */
    CompletableFuture<CompareFaceVerifyResponse> compareFaceVerify(CompareFaceVerifyRequest request);

    /**
     * <b>description</b> :
     * <p>Request method: Only HTTPS POST requests are supported.
     * Operation description: Specifies two face images for comparison and returns a similarity score between the faces in the two images.</p>
     * <ul>
     * <li>At least one of the specified comparison images must be of the face photo type (FacePic).</li>
     * <li>If an image contains multiple faces, the algorithm automatically selects the face that occupies the largest area in the image.</li>
     * <li>If no face is detected in one of the two comparison images, the system returns a &quot;No face detected&quot; error.
     * When you submit images, you must provide the corresponding HTTP URL or Base64 encoding of each image.</li>
     * <li>HTTP URL: A publicly accessible HTTP URL. For example, <code>http://image-demo.img-cn-hangzhou.aliyuncs.com/example.jpg</code>.</li>
     * <li>Base64 encoding: A Base64-encoded image in the format <code>base64://&lt;Base64-encoded image string&gt;</code>.
     * Image limits.</li>
     * <li>Relative paths or absolute paths of local images are not supported.</li>
     * <li>Keep the size of each image within 2 MB to avoid algorithm retrieval timeout.</li>
     * <li>The body of a single request has a size limit of 8 MB. Make sure that the total size of all images and other information in the request does not exceed this limit.</li>
     * <li>When you use Base64 to transmit images, set the request method to POST. Remove the header description from the Base64 character string, such as <code>data:image/png;base64,</code>.</li>
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
     * <p>Request method: Send requests by using the HTTPS POST method.
     * Request URL: cloudauth.aliyuncs.com.</p>
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
     * <li>Request method: POST and GET.</li>
     * <li>Transfer protocol: HTTPS.</li>
     * </ul>
     * 
     * @param request the request parameters of CredentialVerify  CredentialVerifyRequest
     * @return CredentialVerifyResponse
     */
    CompletableFuture<CredentialVerifyResponse> credentialVerify(CredentialVerifyRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The face deepfake detection operation is currently in free public preview. The free public preview ends at 23:59:59 on August 30, 2024. During the public preview, the QPS cannot exceed 3 queries per second.</p>
     * </blockquote>
     * <ul>
     * <li>Service endpoint: cloudauth.aliyuncs.com (IPv4) or cloudauth-dualstack.aliyuncs.com (IPv6).</li>
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
     * <p>Request method: Supports sending requests by using the HTTPS POST and GET methods.</p>
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
     * <p>Request method: Supports sending requests using the HTTPS POST method.
     * Request URL: cloudauth.aliyuncs.com.</p>
     * 
     * @param request the request parameters of DeleteControlStrategy  DeleteControlStrategyRequest
     * @return DeleteControlStrategyResponse
     */
    CompletableFuture<DeleteControlStrategyResponse> deleteControlStrategy(DeleteControlStrategyRequest request);

    /**
     * <b>description</b> :
     * <p>Request method: Supports sending requests by using HTTPS POST and GET methods.</p>
     * <blockquote>
     * <p>The authorization key is valid for 30 minutes and cannot be reused. Obtain a new key before each activation.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteCustomizeFlowStrategy  DeleteCustomizeFlowStrategyRequest
     * @return DeleteCustomizeFlowStrategyResponse
     */
    CompletableFuture<DeleteCustomizeFlowStrategyResponse> deleteCustomizeFlowStrategy(DeleteCustomizeFlowStrategyRequest request);

    /**
     * <b>description</b> :
     * <p>Deletes all personal information fields from the request, including name, ID card number, phone number, IP address, images, videos, device information, etc.</p>
     * 
     * @param request the request parameters of DeleteFaceVerifyResult  DeleteFaceVerifyResultRequest
     * @return DeleteFaceVerifyResultResponse
     */
    CompletableFuture<DeleteFaceVerifyResultResponse> deleteFaceVerifyResult(DeleteFaceVerifyResultRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Request method: HTTPS POST and GET methods are supported.</li>
     * <li>Request URL: cloudauth.aliyuncs.com.<blockquote>
     * <p>The authorization code is valid for 30 minutes and cannot be reused. Obtain a new authorization code before each activation.</p>
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
     * <p>After you receive a callback notification, you can call this operation on the server side to obtain the corresponding verification status and verification materials.</p>
     * 
     * @param request the request parameters of DescribeCardVerify  DescribeCardVerifyRequest
     * @return DescribeCardVerifyResponse
     */
    CompletableFuture<DescribeCardVerifyResponse> describeCardVerify(DescribeCardVerifyRequest request);

    /**
     * <b>description</b> :
     * <p>Request method: Supports sending requests by using HTTPS POST and GET methods.</p>
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
     * <li>Request method: HTTPS POST and GET methods are supported.</li>
     * <li>Service address: cloudauth.aliyuncs.com.</li>
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
     * <p>Before you begin: Before calling this API, make sure that you have completed the required preparations. For more information, see <a href="https://help.aliyun.com/document_detail/127471.html">ID Verification server-side integration preparations</a> and <a href="https://help.aliyun.com/document_detail/127717.html">Face liveness verification server-side integration preparations</a>.</p>
     * <blockquote>
     * <p>Alibaba Cloud ID Verification retains verification data for only the last 180 days. To use verification data for subsequent business purposes, call this operation promptly to retrieve and store the data to avoid data loss.
     * Request method: HTTPS POST and GET.
     * Operation description: After the caller\&quot;s mobile client receives a callback, the server can call this operation to obtain the corresponding verification status and verification materials.
     * Applicable scope: This operation is applicable to the SDK + server-side integration verification solution.</p>
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
     * <p>Preparations: Before calling this operation, make sure that you have completed the required preparations. For more information, see <a href="https://help.aliyun.com/document_detail/127536.html">Overview of the ID Verification scheme integration process</a> and <a href="https://help.aliyun.com/document_detail/127687.html">Overview of the face liveness verification scheme (liveness detection scheme) integration process</a>.
     * Request method: HTTPS POST and GET.
     * Operation description: Before each authentication, call this operation to obtain an authentication token (VerifyToken), which is used to connect the various operations in the authentication request.
     * Scope of application: This operation is applicable to mobile SDK integration.
     * Image URL: Use a publicly accessible HTTP or HTTPS URL. Example: <code>http://image-demo.img-cn-hangzhou.aliyuncs.com/example.jpg</code>.
     * Image limits:</p>
     * <ul>
     * <li>The relative path or absolute path of local images is not supported.</li>
     * <li>Keep the size of a single image within 2 MB to avoid algorithm fetch timeout.</li>
     * <li>The face area in the image must be at least 64 × 64 pixels (px).</li>
     * <li>The body of a single request has a size limit of 8 MB. Make sure that the total size of all images and other information in the request does not exceed this limit.</li>
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
     * Operation description: Detects validity-related attributes of faces in an input photo, helping you determine whether the photo meets your business requirements for retention or comparison. Currently supported face validity attributes include: whether a face is present, whether the face is blurry, whether glasses are worn, facial pose, and whether the face is smiling.
     * Notes on uploading image addresses: When submitting an image, provide its HTTP URL, OSS address, or Base64 encoding.</p>
     * <ul>
     * <li>HTTP address: A publicly accessible HTTP URL. For example, <code>http://image-demo.img-cn-hangzhou.aliyuncs.com/example.jpg</code>.</li>
     * <li>Base64 encoding: A Base64-encoded image in the format <code>base64://&lt;Base64-encoded image string&gt;</code>.
     * Image limits:</li>
     * <li>Relative paths or absolute paths of local images are not supported.</li>
     * <li>Keep the size of a single image within 2 MB to avoid algorithm fetch timeouts.</li>
     * <li>The request body has a size limit of 8 MB. Make sure the total size of all images and other information in the request does not exceed this limit.</li>
     * <li>When using Base64 to transmit images, set the request method to POST. Remove the header description from the Base64 character string, such as <code>data:image/png,base64</code>.</li>
     * </ul>
     * 
     * @param request the request parameters of DetectFaceAttributes  DetectFaceAttributesRequest
     * @return DetectFaceAttributesResponse
     */
    CompletableFuture<DetectFaceAttributesResponse> detectFaceAttributes(DetectFaceAttributesRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the download link for the statistical call data file under a product plan based on the specified query conditions.</p>
     * <ul>
     * <li>Method: HTTPS POST</li>
     * <li>Endpoint: cloudauth.aliyuncs.com<blockquote>
     * <p>ID Verification counts call volume by CertifyId. To facilitate reconciliation, retain the CertifyId field in your system.</p>
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
     * <li>Request method: POST and GET.</li>
     * <li>Transfer protocol: HTTPS.</li>
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
     * <p>Retrieves a CertifyId before each authentication session. The CertifyId links all API operations within the authentication request.</p>
     * 
     * @param request the request parameters of InitCardVerify  InitCardVerifyRequest
     * @return InitCardVerifyResponse
     */
    CompletableFuture<InitCardVerifyResponse> initCardVerify(InitCardVerifyRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Service endpoint: cloudauth.aliyuncs.com</li>
     * <li>Request method: HTTPS POST and GET.</li>
     * <li>This operation uses different parameters for different product plans. For more information, refer to the <a href="https://www.alibabacloud.com/help/en/id-verification/financial-grade-id-verification/product-overview/introduction/">official documentation</a>.</li>
     * </ul>
     * <h4>Image format requirements</h4>
     * <p>When performing ID Verification, submit images that meet all of the following conditions:</p>
     * <ul>
     * <li>A recent photo with a complete, clear, and unobstructed face, natural expression, and facing the camera directly.</li>
     * <li>Clear photo with normal exposure. The face must not be too dark, too bright, or have glare, and the angle must not deviate significantly.</li>
     * <li>Resolution must not exceed 1920×1080, must be at least 640×480. We recommend scaling the short edge to 720 pixels with a compression ratio greater than 0.9.</li>
     * <li>Photo size: &lt; 1 MB.</li>
     * <li>Photos rotated 90, 180, and 270 degrees are supported. For multiple faces, the largest face is selected.</li>
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
     * <p>Calls the LivenessFaceVerify operation to perform liveness detection on a face image.</p>
     * 
     * @param request the request parameters of LivenessFaceVerify  LivenessFaceVerifyRequest
     * @return LivenessFaceVerifyResponse
     */
    CompletableFuture<LivenessFaceVerifyResponse> livenessFaceVerify(LivenessFaceVerifyRequest request);

    /**
     * <b>description</b> :
     * <p>Passes in a mobile phone number and a name, and verifies their authenticity and consistency through an authoritative data source.</p>
     * 
     * @param request the request parameters of Mobile2MetaVerify  Mobile2MetaVerifyRequest
     * @return Mobile2MetaVerifyResponse
     */
    CompletableFuture<Mobile2MetaVerifyResponse> mobile2MetaVerify(Mobile2MetaVerifyRequest request);

    /**
     * <b>description</b> :
     * <p>Passes in a phone number, name, and ID card number, and verifies their authenticity and consistency through an authoritative data source. If the information is inconsistent, the reason for the inconsistency is returned.</p>
     * 
     * @param request the request parameters of Mobile3MetaDetailStandardVerify  Mobile3MetaDetailStandardVerifyRequest
     * @return Mobile3MetaDetailStandardVerifyResponse
     */
    CompletableFuture<Mobile3MetaDetailStandardVerifyResponse> mobile3MetaDetailStandardVerify(Mobile3MetaDetailStandardVerifyRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Service endpoint: cloudauth.aliyuncs.com (IPv4) or cloudauth-dualstack.aliyuncs.com (IPv6).</li>
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
     * <p>Passes in a phone number, name, and ID card number, and verifies their authenticity and consistency through an authoritative data source.</p>
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
     * <p>Passes in a phone number and its registration date, and verifies the authenticity and consistency of the information through an authoritative data source.</p>
     * 
     * @param request the request parameters of MobileRecycledMetaVerify  MobileRecycledMetaVerifyRequest
     * @return MobileRecycledMetaVerifyResponse
     */
    CompletableFuture<MobileRecycledMetaVerifyResponse> mobileRecycledMetaVerify(MobileRecycledMetaVerifyRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Service address: cloudauth.aliyuncs.com.</li>
     * <li>Request method: HTTPS POST and GET.</li>
     * <li>Operation description: Creates or modifies a blacklist rule.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyBlackListStrategy  ModifyBlackListStrategyRequest
     * @return ModifyBlackListStrategyResponse
     */
    CompletableFuture<ModifyBlackListStrategyResponse> modifyBlackListStrategy(ModifyBlackListStrategyRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Request method: HTTPS POST.</li>
     * <li>Request URL: cloudauth.aliyuncs.com.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyControlStrategy  ModifyControlStrategyRequest
     * @return ModifyControlStrategyResponse
     */
    CompletableFuture<ModifyControlStrategyResponse> modifyControlStrategy(ModifyControlStrategyRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Request method: HTTPS POST and GET methods are supported.</li>
     * <li>Endpoint: cloudauth.aliyuncs.com.</li>
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
     * <li>Request endpoint: cloudauth.aliyuncs.com</li>
     * <li>Request method: HTTPS POST and GET.<blockquote>
     * <p>You can configure blacklists for IP addresses, ID card numbers, phone numbers, and bank card numbers. When a request matches a blacklist entry, the system rejects the request and returns a fixed error code.
     * You can configure blacklists for IP addresses, ID card numbers, phone numbers, and bank card numbers. When a request matches a blacklist entry, the system rejects the request and returns a fixed error code.</p>
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
     * <li>Request method: HTTPS POST and GET.</li>
     * <li>Request URL: cloudauth.aliyuncs.com.</li>
     * </ul>
     * 
     * @param request the request parameters of QueryControlStrategy  QueryControlStrategyRequest
     * @return QueryControlStrategyResponse
     */
    CompletableFuture<QueryControlStrategyResponse> queryControlStrategy(QueryControlStrategyRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Service endpoint: cloudauth.aliyuncs.com</li>
     * <li>Request method: HTTPS POST and GET.</li>
     * <li>Security rules: monitoring rules that ensure system security, such as API abuse and abnormal account theft. When a threshold is triggered, the system sends an alert.</li>
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
     * <p>Retrieves the download link of a statistical call data file under a product plan based on query conditions.</p>
     * <ul>
     * <li>Method: HTTPS POST</li>
     * <li>Endpoint: cloudauth.aliyuncs.com<blockquote>
     * <p>ID Verification uses CertifyId to calculate the call volume. To facilitate reconciliation, retain the CertifyId field in your system.</p>
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
     * <li>Request URL: cloudauth.aliyuncs.com.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateSceneConfig  UpdateSceneConfigRequest
     * @return UpdateSceneConfigResponse
     */
    CompletableFuture<UpdateSceneConfigResponse> updateSceneConfig(UpdateSceneConfigRequest request);

    /**
     * <b>description</b> :
     * <p>Queries basic vehicle information by license plate number and vehicle type.</p>
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
     * <p>Verifies the consistency of the name, ID card number, license plate number, and vehicle type, and supports returning vehicle details.</p>
     * 
     * @param request the request parameters of VehicleMetaVerifyV2  VehicleMetaVerifyV2Request
     * @return VehicleMetaVerifyV2Response
     */
    CompletableFuture<VehicleMetaVerifyV2Response> vehicleMetaVerifyV2(VehicleMetaVerifyV2Request request);

    /**
     * <b>description</b> :
     * <p>Queries detailed vehicle information by license plate number and vehicle type.</p>
     * 
     * @param request the request parameters of VehicleQuery  VehicleQueryRequest
     * @return VehicleQueryResponse
     */
    CompletableFuture<VehicleQueryResponse> vehicleQuery(VehicleQueryRequest request);

    /**
     * <b>description</b> :
     * <p>Before you begin: Before calling this API, ensure that you have completed the required preparations. For more information, see <a href="https://help.aliyun.com/document_detail/127471.html">Server-side integration preparations</a>.
     * Request method: HTTPS POST and GET.
     * Operation description: The caller\&quot;s server submits verification materials to the ID Verification service for comparison and validation. The result is returned synchronously.
     * Applicable scope: This operation is applicable only to server-side-only verification solutions.
     * Image URL description:</p>
     * <ul>
     * <li>HTTP or HTTPS URL: Publicly accessible HTTP or HTTPS URLs are supported. For example, <code>http://image-demo.img-cn-hangzhou.aliyuncs.com/example.jpg</code>.</li>
     * <li>OSS URL: If the caller\&quot;s images are local files, Alibaba Cloud provides an upload SDK that allows you to upload images to the OSS bucket designated by the ID Verification service and obtain the corresponding OSS URL to use as the image URL parameter. If your business requires the upload SDK, <a href="https://selfservice.console.aliyun.com/ticket/category/cloudauth/today">submit a ticket</a> to contact us.
     * Image restrictions:</li>
     * <li>Relative paths or absolute paths of local images are not supported.</li>
     * <li>Keep each image within 2 MB to avoid algorithm fetch timeouts.</li>
     * <li>The face area in the image must be at least 64 × 64 pixels.</li>
     * <li>The request body has an 8 MB size limit. Ensure that the total size of all images and other information in the request does not exceed this limit.</li>
     * </ul>
     * 
     * @param request the request parameters of VerifyMaterial  VerifyMaterialRequest
     * @return VerifyMaterialResponse
     */
    CompletableFuture<VerifyMaterialResponse> verifyMaterial(VerifyMaterialRequest request);

}
