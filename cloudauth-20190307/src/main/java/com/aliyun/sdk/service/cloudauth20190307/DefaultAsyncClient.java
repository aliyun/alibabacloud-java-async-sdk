// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.cloudauth20190307.models.*;
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
        this.product = "Cloudauth";
        this.version = "2019-03-07";
        this.endpointRule = "central";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of AIGCFaceVerify  AIGCFaceVerifyRequest
     * @return AIGCFaceVerifyResponse
     */
    @Override
    public CompletableFuture<AIGCFaceVerifyResponse> aIGCFaceVerify(AIGCFaceVerifyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AIGCFaceVerify").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AIGCFaceVerifyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AIGCFaceVerifyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<BankMetaVerifyResponse> bankMetaVerify(BankMetaVerifyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BankMetaVerify").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BankMetaVerifyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BankMetaVerifyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<CompareFaceVerifyResponse> compareFaceVerify(CompareFaceVerifyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CompareFaceVerify").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CompareFaceVerifyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CompareFaceVerifyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<CompareFacesResponse> compareFaces(CompareFacesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CompareFaces").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CompareFacesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CompareFacesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<CreateAntCloudAuthSceneResponse> createAntCloudAuthScene(CreateAntCloudAuthSceneRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAntCloudAuthScene").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAntCloudAuthSceneResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAntCloudAuthSceneResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<CreateAuthKeyResponse> createAuthKey(CreateAuthKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAuthKey").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAuthKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAuthKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<CreateCloudauthstSceneResponse> createCloudauthstScene(CreateCloudauthstSceneRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateCloudauthstScene").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCloudauthstSceneResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCloudauthstSceneResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<CreateSceneConfigResponse> createSceneConfig(CreateSceneConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSceneConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSceneConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSceneConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Request Method: Only supports sending requests via HTTPS POST.</p>
     * 
     * @param request the request parameters of CreateVerifySetting  CreateVerifySettingRequest
     * @return CreateVerifySettingResponse
     */
    @Override
    public CompletableFuture<CreateVerifySettingResponse> createVerifySetting(CreateVerifySettingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateVerifySetting").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateVerifySettingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateVerifySettingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Request Method: Only supports sending requests via HTTPS POST.</p>
     * 
     * @param request the request parameters of CreateWhitelistSetting  CreateWhitelistSettingRequest
     * @return CreateWhitelistSettingResponse
     */
    @Override
    public CompletableFuture<CreateWhitelistSettingResponse> createWhitelistSetting(CreateWhitelistSettingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateWhitelistSetting").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateWhitelistSettingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateWhitelistSettingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CredentialVerify  CredentialVerifyRequest
     * @return CredentialVerifyResponse
     */
    @Override
    public CompletableFuture<CredentialVerifyResponse> credentialVerify(CredentialVerifyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CredentialVerify").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CredentialVerifyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CredentialVerifyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DeepfakeDetectResponse> deepfakeDetect(DeepfakeDetectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeepfakeDetect").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeepfakeDetectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeepfakeDetectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DeleteAllCustomizeFlowStrategyResponse> deleteAllCustomizeFlowStrategy(DeleteAllCustomizeFlowStrategyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteAllCustomizeFlowStrategy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAllCustomizeFlowStrategyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAllCustomizeFlowStrategyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DeleteAntCloudAuthSceneResponse> deleteAntCloudAuthScene(DeleteAntCloudAuthSceneRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteAntCloudAuthScene").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAntCloudAuthSceneResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAntCloudAuthSceneResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Request Method: Only supports sending requests via HTTPS POST method.</p>
     * 
     * @param request the request parameters of DeleteBlackListStrategy  DeleteBlackListStrategyRequest
     * @return DeleteBlackListStrategyResponse
     */
    @Override
    public CompletableFuture<DeleteBlackListStrategyResponse> deleteBlackListStrategy(DeleteBlackListStrategyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteBlackListStrategy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteBlackListStrategyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteBlackListStrategyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DeleteCloudauthstSceneResponse> deleteCloudauthstScene(DeleteCloudauthstSceneRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteCloudauthstScene").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCloudauthstSceneResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCloudauthstSceneResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Request Method: Supports sending requests via HTTPS POST.
     * Request URL: cloudauth.aliyuncs.com.</p>
     * 
     * @param request the request parameters of DeleteControlStrategy  DeleteControlStrategyRequest
     * @return DeleteControlStrategyResponse
     */
    @Override
    public CompletableFuture<DeleteControlStrategyResponse> deleteControlStrategy(DeleteControlStrategyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteControlStrategy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteControlStrategyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteControlStrategyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DeleteCustomizeFlowStrategyResponse> deleteCustomizeFlowStrategy(DeleteCustomizeFlowStrategyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteCustomizeFlowStrategy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCustomizeFlowStrategyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCustomizeFlowStrategyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Deletes all personal information fields in the request, including name, ID number, phone number, IP, images, videos, and device information, etc.</p>
     * 
     * @param request the request parameters of DeleteFaceVerifyResult  DeleteFaceVerifyResultRequest
     * @return DeleteFaceVerifyResultResponse
     */
    @Override
    public CompletableFuture<DeleteFaceVerifyResultResponse> deleteFaceVerifyResult(DeleteFaceVerifyResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteFaceVerifyResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteFaceVerifyResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteFaceVerifyResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DeleteSceneConfigResponse> deleteSceneConfig(DeleteSceneConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteSceneConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSceneConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSceneConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Request Method: Only supports sending requests via HTTPS POST method.</p>
     * 
     * @param request the request parameters of DeleteWhitelistSetting  DeleteWhitelistSettingRequest
     * @return DeleteWhitelistSettingResponse
     */
    @Override
    public CompletableFuture<DeleteWhitelistSettingResponse> deleteWhitelistSetting(DeleteWhitelistSettingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteWhitelistSetting").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteWhitelistSettingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteWhitelistSettingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DescribeAntAndCloudAuthUserStatusResponse> describeAntAndCloudAuthUserStatus(DescribeAntAndCloudAuthUserStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAntAndCloudAuthUserStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAntAndCloudAuthUserStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAntAndCloudAuthUserStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeAuthVerify  DescribeAuthVerifyRequest
     * @return DescribeAuthVerifyResponse
     */
    @Override
    public CompletableFuture<DescribeAuthVerifyResponse> describeAuthVerify(DescribeAuthVerifyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAuthVerify").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAuthVerifyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAuthVerifyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>After receiving the callback notification, you can use this interface on the server side to obtain the corresponding authentication status and information.</p>
     * 
     * @param request the request parameters of DescribeCardVerify  DescribeCardVerifyRequest
     * @return DescribeCardVerifyResponse
     */
    @Override
    public CompletableFuture<DescribeCardVerifyResponse> describeCardVerify(DescribeCardVerifyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCardVerify").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCardVerifyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCardVerifyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DescribeCloudauthstSceneListResponse> describeCloudauthstSceneList(DescribeCloudauthstSceneListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCloudauthstSceneList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCloudauthstSceneListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCloudauthstSceneListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Request Method: Supports sending requests using HTTPS POST and GET methods.</p>
     * 
     * @param request the request parameters of DescribeDeviceInfo  DescribeDeviceInfoRequest
     * @return DescribeDeviceInfoResponse
     */
    @Override
    public CompletableFuture<DescribeDeviceInfoResponse> describeDeviceInfo(DescribeDeviceInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDeviceInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDeviceInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDeviceInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeFaceGuardRisk  DescribeFaceGuardRiskRequest
     * @return DescribeFaceGuardRiskResponse
     */
    @Override
    public CompletableFuture<DescribeFaceGuardRiskResponse> describeFaceGuardRisk(DescribeFaceGuardRiskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeFaceGuardRisk").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeFaceGuardRiskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeFaceGuardRiskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DescribeFaceVerifyResponse> describeFaceVerify(DescribeFaceVerifyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeFaceVerify").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeFaceVerifyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeFaceVerifyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeInfoCheckExportRecord  DescribeInfoCheckExportRecordRequest
     * @return DescribeInfoCheckExportRecordResponse
     */
    @Override
    public CompletableFuture<DescribeInfoCheckExportRecordResponse> describeInfoCheckExportRecord(DescribeInfoCheckExportRecordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInfoCheckExportRecord").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInfoCheckExportRecordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInfoCheckExportRecordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DescribeListAntCloudAuthScenesResponse> describeListAntCloudAuthScenes(DescribeListAntCloudAuthScenesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeListAntCloudAuthScenes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeListAntCloudAuthScenesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeListAntCloudAuthScenesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DescribeListFaceVerifyDataResponse> describeListFaceVerifyData(DescribeListFaceVerifyDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeListFaceVerifyData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeListFaceVerifyDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeListFaceVerifyDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DescribeListFaceVerifyInfosResponse> describeListFaceVerifyInfos(DescribeListFaceVerifyInfosRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeListFaceVerifyInfos").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeListFaceVerifyInfosResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeListFaceVerifyInfosResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeMetaSearchPageList  DescribeMetaSearchPageListRequest
     * @return DescribeMetaSearchPageListResponse
     */
    @Override
    public CompletableFuture<DescribeMetaSearchPageListResponse> describeMetaSearchPageList(DescribeMetaSearchPageListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeMetaSearchPageList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMetaSearchPageListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMetaSearchPageListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeMetaStatisticsList  DescribeMetaStatisticsListRequest
     * @return DescribeMetaStatisticsListResponse
     */
    @Override
    public CompletableFuture<DescribeMetaStatisticsListResponse> describeMetaStatisticsList(DescribeMetaStatisticsListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeMetaStatisticsList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMetaStatisticsListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMetaStatisticsListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeMetaStatisticsPageList  DescribeMetaStatisticsPageListRequest
     * @return DescribeMetaStatisticsPageListResponse
     */
    @Override
    public CompletableFuture<DescribeMetaStatisticsPageListResponse> describeMetaStatisticsPageList(DescribeMetaStatisticsPageListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeMetaStatisticsPageList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMetaStatisticsPageListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMetaStatisticsPageListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DescribeOssStatusResponse> describeOssStatus(DescribeOssStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeOssStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeOssStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeOssStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DescribeOssStatusV2Response> describeOssStatusV2(DescribeOssStatusV2Request request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeOssStatusV2").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeOssStatusV2Response.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeOssStatusV2Response> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeOssUploadToken  DescribeOssUploadTokenRequest
     * @return DescribeOssUploadTokenResponse
     */
    @Override
    public CompletableFuture<DescribeOssUploadTokenResponse> describeOssUploadToken(DescribeOssUploadTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeOssUploadToken").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeOssUploadTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeOssUploadTokenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribePageFaceVerifyData  DescribePageFaceVerifyDataRequest
     * @return DescribePageFaceVerifyDataResponse
     */
    @Override
    public CompletableFuture<DescribePageFaceVerifyDataResponse> describePageFaceVerifyData(DescribePageFaceVerifyDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePageFaceVerifyData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePageFaceVerifyDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePageFaceVerifyDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Request Method: Only supports sending requests via HTTPS POST method.</p>
     * 
     * @param request the request parameters of DescribePageSetting  DescribePageSettingRequest
     * @return DescribePageSettingResponse
     */
    @Override
    public CompletableFuture<DescribePageSettingResponse> describePageSetting(DescribePageSettingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePageSetting").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePageSettingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePageSettingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Request Method: Supports sending requests via HTTPS GET/POST methods.</p>
     * 
     * @param request the request parameters of DescribeProductCode  DescribeProductCodeRequest
     * @return DescribeProductCodeResponse
     */
    @Override
    public CompletableFuture<DescribeProductCodeResponse> describeProductCode(DescribeProductCodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeProductCode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeProductCodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeProductCodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSmartStatisticsPageList  DescribeSmartStatisticsPageListRequest
     * @return DescribeSmartStatisticsPageListResponse
     */
    @Override
    public CompletableFuture<DescribeSmartStatisticsPageListResponse> describeSmartStatisticsPageList(DescribeSmartStatisticsPageListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSmartStatisticsPageList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSmartStatisticsPageListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSmartStatisticsPageListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DescribeVerifyDeviceRiskStatisticsResponse> describeVerifyDeviceRiskStatistics(DescribeVerifyDeviceRiskStatisticsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVerifyDeviceRiskStatistics").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVerifyDeviceRiskStatisticsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVerifyDeviceRiskStatisticsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DescribeVerifyFailStatisticsResponse> describeVerifyFailStatistics(DescribeVerifyFailStatisticsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVerifyFailStatistics").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVerifyFailStatisticsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVerifyFailStatisticsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DescribeVerifyPersonasDeviceModelStatisticsResponse> describeVerifyPersonasDeviceModelStatistics(DescribeVerifyPersonasDeviceModelStatisticsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVerifyPersonasDeviceModelStatistics").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVerifyPersonasDeviceModelStatisticsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVerifyPersonasDeviceModelStatisticsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DescribeVerifyPersonasOsStatisticsResponse> describeVerifyPersonasOsStatistics(DescribeVerifyPersonasOsStatisticsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVerifyPersonasOsStatistics").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVerifyPersonasOsStatisticsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVerifyPersonasOsStatisticsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DescribeVerifyPersonasProvinceStatisticsResponse> describeVerifyPersonasProvinceStatistics(DescribeVerifyPersonasProvinceStatisticsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVerifyPersonasProvinceStatistics").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVerifyPersonasProvinceStatisticsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVerifyPersonasProvinceStatisticsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DescribeVerifyPersonasSexStatisticsResponse> describeVerifyPersonasSexStatistics(DescribeVerifyPersonasSexStatisticsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVerifyPersonasSexStatistics").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVerifyPersonasSexStatisticsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVerifyPersonasSexStatisticsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DescribeVerifyResultResponse> describeVerifyResult(DescribeVerifyResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVerifyResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVerifyResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVerifyResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Request Method: Supports sending requests via HTTPS POST and GET methods.
     * Interface Description: Obtain the SDK generation result based on the task ID for generating an offline facial recognition SDK.</p>
     * 
     * @param request the request parameters of DescribeVerifySDK  DescribeVerifySDKRequest
     * @return DescribeVerifySDKResponse
     */
    @Override
    public CompletableFuture<DescribeVerifySDKResponse> describeVerifySDK(DescribeVerifySDKRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVerifySDK").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVerifySDKResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVerifySDKResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DescribeVerifySearchPageListResponse> describeVerifySearchPageList(DescribeVerifySearchPageListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVerifySearchPageList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVerifySearchPageListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVerifySearchPageListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DescribeVerifyStatisticsResponse> describeVerifyStatistics(DescribeVerifyStatisticsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVerifyStatistics").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVerifyStatisticsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVerifyStatisticsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DescribeVerifyTokenResponse> describeVerifyToken(DescribeVerifyTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVerifyToken").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVerifyTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVerifyTokenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Request Method: Only supports sending requests via HTTPS POST method.</p>
     * 
     * @param request the request parameters of DescribeWhitelistSetting  DescribeWhitelistSettingRequest
     * @return DescribeWhitelistSettingResponse
     */
    @Override
    public CompletableFuture<DescribeWhitelistSettingResponse> describeWhitelistSetting(DescribeWhitelistSettingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeWhitelistSetting").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeWhitelistSettingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeWhitelistSettingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DetectFaceAttributesResponse> detectFaceAttributes(DetectFaceAttributesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetectFaceAttributes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetectFaceAttributesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetectFaceAttributesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DownloadVerifyRecordsResponse> downloadVerifyRecords(DownloadVerifyRecordsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DownloadVerifyRecords").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DownloadVerifyRecordsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DownloadVerifyRecordsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of Id2MetaPeriodVerify  Id2MetaPeriodVerifyRequest
     * @return Id2MetaPeriodVerifyResponse
     */
    @Override
    public CompletableFuture<Id2MetaPeriodVerifyResponse> id2MetaPeriodVerify(Id2MetaPeriodVerifyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("Id2MetaPeriodVerify").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(Id2MetaPeriodVerifyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<Id2MetaPeriodVerifyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of Id2MetaStandardVerify  Id2MetaStandardVerifyRequest
     * @return Id2MetaStandardVerifyResponse
     */
    @Override
    public CompletableFuture<Id2MetaStandardVerifyResponse> id2MetaStandardVerify(Id2MetaStandardVerifyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("Id2MetaStandardVerify").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(Id2MetaStandardVerifyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<Id2MetaStandardVerifyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<Id2MetaVerifyResponse> id2MetaVerify(Id2MetaVerifyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("Id2MetaVerify").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(Id2MetaVerifyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<Id2MetaVerifyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of InitAuthVerify  InitAuthVerifyRequest
     * @return InitAuthVerifyResponse
     */
    @Override
    public CompletableFuture<InitAuthVerifyResponse> initAuthVerify(InitAuthVerifyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("InitAuthVerify").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InitAuthVerifyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InitAuthVerifyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before each authentication, use this interface to obtain the CertifyId, which is used to link various interfaces in the authentication request.</p>
     * 
     * @param request the request parameters of InitCardVerify  InitCardVerifyRequest
     * @return InitCardVerifyResponse
     */
    @Override
    public CompletableFuture<InitCardVerifyResponse> initCardVerify(InitCardVerifyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("InitCardVerify").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InitCardVerifyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InitCardVerifyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<InitFaceVerifyResponse> initFaceVerify(InitFaceVerifyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("InitFaceVerify").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InitFaceVerifyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InitFaceVerifyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of InsertWhiteListSetting  InsertWhiteListSettingRequest
     * @return InsertWhiteListSettingResponse
     */
    @Override
    public CompletableFuture<InsertWhiteListSettingResponse> insertWhiteListSetting(InsertWhiteListSettingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("InsertWhiteListSetting").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InsertWhiteListSettingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InsertWhiteListSettingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Invoke the LivenessFaceVerify interface to perform liveness detection on a face image.</p>
     * 
     * @param request the request parameters of LivenessFaceVerify  LivenessFaceVerifyRequest
     * @return LivenessFaceVerifyResponse
     */
    @Override
    public CompletableFuture<LivenessFaceVerifyResponse> livenessFaceVerify(LivenessFaceVerifyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("LivenessFaceVerify").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(LivenessFaceVerifyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<LivenessFaceVerifyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Input the phone number and name, verify their authenticity and consistency through authoritative data sources.</p>
     * 
     * @param request the request parameters of Mobile2MetaVerify  Mobile2MetaVerifyRequest
     * @return Mobile2MetaVerifyResponse
     */
    @Override
    public CompletableFuture<Mobile2MetaVerifyResponse> mobile2MetaVerify(Mobile2MetaVerifyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("Mobile2MetaVerify").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(Mobile2MetaVerifyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<Mobile2MetaVerifyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Input the phone number, name, and ID number to verify their authenticity and consistency through authoritative data sources. If they do not match, the reason for the mismatch is returned.</p>
     * 
     * @param request the request parameters of Mobile3MetaDetailStandardVerify  Mobile3MetaDetailStandardVerifyRequest
     * @return Mobile3MetaDetailStandardVerifyResponse
     */
    @Override
    public CompletableFuture<Mobile3MetaDetailStandardVerifyResponse> mobile3MetaDetailStandardVerify(Mobile3MetaDetailStandardVerifyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("Mobile3MetaDetailStandardVerify").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(Mobile3MetaDetailStandardVerifyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<Mobile3MetaDetailStandardVerifyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<Mobile3MetaDetailVerifyResponse> mobile3MetaDetailVerify(Mobile3MetaDetailVerifyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("Mobile3MetaDetailVerify").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(Mobile3MetaDetailVerifyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<Mobile3MetaDetailVerifyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Input the phone number, name, and ID number to verify their authenticity and consistency through authoritative data sources.</p>
     * 
     * @param request the request parameters of Mobile3MetaSimpleStandardVerify  Mobile3MetaSimpleStandardVerifyRequest
     * @return Mobile3MetaSimpleStandardVerifyResponse
     */
    @Override
    public CompletableFuture<Mobile3MetaSimpleStandardVerifyResponse> mobile3MetaSimpleStandardVerify(Mobile3MetaSimpleStandardVerifyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("Mobile3MetaSimpleStandardVerify").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(Mobile3MetaSimpleStandardVerifyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<Mobile3MetaSimpleStandardVerifyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<Mobile3MetaSimpleVerifyResponse> mobile3MetaSimpleVerify(Mobile3MetaSimpleVerifyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("Mobile3MetaSimpleVerify").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(Mobile3MetaSimpleVerifyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<Mobile3MetaSimpleVerifyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of MobileDetect  MobileDetectRequest
     * @return MobileDetectResponse
     */
    @Override
    public CompletableFuture<MobileDetectResponse> mobileDetect(MobileDetectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("MobileDetect").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MobileDetectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MobileDetectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of MobileOnlineStatus  MobileOnlineStatusRequest
     * @return MobileOnlineStatusResponse
     */
    @Override
    public CompletableFuture<MobileOnlineStatusResponse> mobileOnlineStatus(MobileOnlineStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("MobileOnlineStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MobileOnlineStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MobileOnlineStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of MobileOnlineTime  MobileOnlineTimeRequest
     * @return MobileOnlineTimeResponse
     */
    @Override
    public CompletableFuture<MobileOnlineTimeResponse> mobileOnlineTime(MobileOnlineTimeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("MobileOnlineTime").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MobileOnlineTimeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MobileOnlineTimeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of MobileRecycledMetaVerify  MobileRecycledMetaVerifyRequest
     * @return MobileRecycledMetaVerifyResponse
     */
    @Override
    public CompletableFuture<MobileRecycledMetaVerifyResponse> mobileRecycledMetaVerify(MobileRecycledMetaVerifyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("MobileRecycledMetaVerify").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MobileRecycledMetaVerifyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MobileRecycledMetaVerifyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<ModifyBlackListStrategyResponse> modifyBlackListStrategy(ModifyBlackListStrategyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyBlackListStrategy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyBlackListStrategyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyBlackListStrategyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<ModifyControlStrategyResponse> modifyControlStrategy(ModifyControlStrategyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyControlStrategy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyControlStrategyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyControlStrategyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<ModifyCustomizeFlowStrategyListResponse> modifyCustomizeFlowStrategyList(ModifyCustomizeFlowStrategyListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyCustomizeFlowStrategyList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyCustomizeFlowStrategyListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyCustomizeFlowStrategyListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Request Method: Supports sending requests using HTTPS POST and GET methods.</p>
     * 
     * @param request the request parameters of ModifyDeviceInfo  ModifyDeviceInfoRequest
     * @return ModifyDeviceInfoResponse
     */
    @Override
    public CompletableFuture<ModifyDeviceInfoResponse> modifyDeviceInfo(ModifyDeviceInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDeviceInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDeviceInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDeviceInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PageQueryWhiteListSetting  PageQueryWhiteListSettingRequest
     * @return PageQueryWhiteListSettingResponse
     */
    @Override
    public CompletableFuture<PageQueryWhiteListSettingResponse> pageQueryWhiteListSetting(PageQueryWhiteListSettingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PageQueryWhiteListSetting").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PageQueryWhiteListSettingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PageQueryWhiteListSettingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<QueryBlackListStrategyResponse> queryBlackListStrategy(QueryBlackListStrategyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryBlackListStrategy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryBlackListStrategyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryBlackListStrategyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<QueryControlStrategyResponse> queryControlStrategy(QueryControlStrategyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryControlStrategy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryControlStrategyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryControlStrategyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<QueryCustomizeFlowStrategyResponse> queryCustomizeFlowStrategy(QueryCustomizeFlowStrategyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryCustomizeFlowStrategy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryCustomizeFlowStrategyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryCustomizeFlowStrategyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<QuerySceneConfigsResponse> querySceneConfigs(QuerySceneConfigsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QuerySceneConfigs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QuerySceneConfigsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QuerySceneConfigsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<QueryVerifyDownloadTaskResponse> queryVerifyDownloadTask(QueryVerifyDownloadTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryVerifyDownloadTask").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryVerifyDownloadTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryVerifyDownloadTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<QueryVerifyFlowPackageResponse> queryVerifyFlowPackage(QueryVerifyFlowPackageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryVerifyFlowPackage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryVerifyFlowPackageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryVerifyFlowPackageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<QueryVerifyInvokeSatisticResponse> queryVerifyInvokeSatistic(QueryVerifyInvokeSatisticRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryVerifyInvokeSatistic").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryVerifyInvokeSatisticResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryVerifyInvokeSatisticResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RemoveWhiteListSetting  RemoveWhiteListSettingRequest
     * @return RemoveWhiteListSettingResponse
     */
    @Override
    public CompletableFuture<RemoveWhiteListSettingResponse> removeWhiteListSetting(RemoveWhiteListSettingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveWhiteListSetting").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveWhiteListSettingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveWhiteListSettingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<UpdateAntCloudAuthSceneResponse> updateAntCloudAuthScene(UpdateAntCloudAuthSceneRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateAntCloudAuthScene").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAntCloudAuthSceneResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAntCloudAuthSceneResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<UpdateSceneConfigResponse> updateSceneConfig(UpdateSceneConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateSceneConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSceneConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSceneConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Query basic vehicle information through the license plate number and vehicle type.</p>
     * 
     * @param request the request parameters of Vehicle5ItemQuery  Vehicle5ItemQueryRequest
     * @return Vehicle5ItemQueryResponse
     */
    @Override
    public CompletableFuture<Vehicle5ItemQueryResponse> vehicle5ItemQuery(Vehicle5ItemQueryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("Vehicle5ItemQuery").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(Vehicle5ItemQueryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<Vehicle5ItemQueryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Query the vehicle insurance date through the license plate number, vehicle type, and vehicle identification number (VIN).</p>
     * 
     * @param request the request parameters of VehicleInsureQuery  VehicleInsureQueryRequest
     * @return VehicleInsureQueryResponse
     */
    @Override
    public CompletableFuture<VehicleInsureQueryResponse> vehicleInsureQuery(VehicleInsureQueryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("VehicleInsureQuery").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(VehicleInsureQueryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<VehicleInsureQueryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Verifies the consistency of name, ID number, vehicle license plate, and vehicle type.</p>
     * 
     * @param request the request parameters of VehicleMetaVerify  VehicleMetaVerifyRequest
     * @return VehicleMetaVerifyResponse
     */
    @Override
    public CompletableFuture<VehicleMetaVerifyResponse> vehicleMetaVerify(VehicleMetaVerifyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("VehicleMetaVerify").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(VehicleMetaVerifyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<VehicleMetaVerifyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Verifies the consistency of name, ID number, license plate number, and vehicle type, and supports returning detailed vehicle information.</p>
     * 
     * @param request the request parameters of VehicleMetaVerifyV2  VehicleMetaVerifyV2Request
     * @return VehicleMetaVerifyV2Response
     */
    @Override
    public CompletableFuture<VehicleMetaVerifyV2Response> vehicleMetaVerifyV2(VehicleMetaVerifyV2Request request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("VehicleMetaVerifyV2").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(VehicleMetaVerifyV2Response.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<VehicleMetaVerifyV2Response> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Query detailed vehicle information through the license plate number and vehicle type.</p>
     * 
     * @param request the request parameters of VehicleQuery  VehicleQueryRequest
     * @return VehicleQueryResponse
     */
    @Override
    public CompletableFuture<VehicleQueryResponse> vehicleQuery(VehicleQueryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("VehicleQuery").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(VehicleQueryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<VehicleQueryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<VerifyMaterialResponse> verifyMaterial(VerifyMaterialRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("VerifyMaterial").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(VerifyMaterialResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<VerifyMaterialResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
