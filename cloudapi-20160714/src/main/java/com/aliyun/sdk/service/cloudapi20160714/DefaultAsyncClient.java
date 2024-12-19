// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.cloudapi20160714.models.*;
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
        this.product = "CloudAPI";
        this.version = "2016-07-14";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("cn-qingdao", "apigateway.cn-qingdao.aliyuncs.com"),
            new TeaPair("cn-beijing", "apigateway.cn-beijing.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "apigateway.cn-zhangjiakou.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "apigateway.cn-huhehaote.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "apigateway.cn-wulanchabu.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "apigateway.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-shanghai", "apigateway.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "apigateway.cn-shenzhen.aliyuncs.com"),
            new TeaPair("cn-heyuan", "apigateway.cn-heyuan.aliyuncs.com"),
            new TeaPair("cn-guangzhou", "apigateway.cn-guangzhou.aliyuncs.com"),
            new TeaPair("cn-chengdu", "apigateway.cn-chengdu.aliyuncs.com"),
            new TeaPair("cn-hongkong", "apigateway.cn-hongkong.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "apigateway.ap-northeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "apigateway.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "apigateway.ap-southeast-2.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "apigateway.ap-southeast-3.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "apigateway.ap-southeast-5.aliyuncs.com"),
            new TeaPair("ap-southeast-6", "apigateway.ap-southeast-6.aliyuncs.com"),
            new TeaPair("ap-southeast-7", "apigateway.ap-southeast-7.aliyuncs.com"),
            new TeaPair("us-east-1", "apigateway.us-east-1.aliyuncs.com"),
            new TeaPair("us-west-1", "apigateway.us-west-1.aliyuncs.com"),
            new TeaPair("eu-west-1", "apigateway.eu-west-1.aliyuncs.com"),
            new TeaPair("eu-central-1", "apigateway.eu-central-1.aliyuncs.com"),
            new TeaPair("ap-south-1", "apigateway.ap-south-1.aliyuncs.com"),
            new TeaPair("me-east-1", "apigateway.me-east-1.aliyuncs.com"),
            new TeaPair("me-central-1", "apigateway.me-central-1.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "apigateway.cn-hangzhou-finance.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "apigateway.cn-shanghai-finance-1.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "apigateway.cn-shenzhen-finance-1.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "apigateway.cn-north-2-gov-1.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "apigateway.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "apigateway.cn-beijing-finance-1.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "apigateway.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "apigateway.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "apigateway.aliyuncs.com"),
            new TeaPair("cn-edge-1", "apigateway.aliyuncs.com"),
            new TeaPair("cn-fujian", "apigateway.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "apigateway.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "apigateway.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "apigateway.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "apigateway.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "apigateway.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "apigateway.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "apigateway.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "apigateway.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "apigateway.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "apigateway.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "apigateway.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "apigateway.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "apigateway.cn-shanghai-inner.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "apigateway.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "apigateway.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "apigateway.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "apigateway.aliyuncs.com"),
            new TeaPair("cn-wuhan", "apigateway.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "apigateway.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "apigateway.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "apigateway.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "apigateway.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "apigateway.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "apigateway.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "apigateway.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API providers and is the opposite of DeployApi.</p>
     * <ul>
     * <li>An API can be unpublished from a specified runtime environment in under 5 seconds.</li>
     * <li>An unpublished API cannot be called in the specified runtime environment.</li>
     * </ul>
     * 
     * @param request the request parameters of AbolishApi  AbolishApiRequest
     * @return AbolishApiResponse
     */
    @Override
    public CompletableFuture<AbolishApiResponse> abolishApi(AbolishApiRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AbolishApi").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AbolishApiResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AbolishApiResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddAccessControlListEntry  AddAccessControlListEntryRequest
     * @return AddAccessControlListEntryResponse
     */
    @Override
    public CompletableFuture<AddAccessControlListEntryResponse> addAccessControlListEntry(AddAccessControlListEntryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddAccessControlListEntry").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddAccessControlListEntryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddAccessControlListEntryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation, note that:</p>
     * <ul>
     * <li>This operation is intended for API providers.</li>
     * <li>An added policy immediately takes effect on all APIs that are bound to the access control list (ACL).</li>
     * <li>A maximum of 100 policies can be added to an ACL.</li>
     * </ul>
     * 
     * @param request the request parameters of AddIpControlPolicyItem  AddIpControlPolicyItemRequest
     * @return AddIpControlPolicyItemResponse
     */
    @Override
    public CompletableFuture<AddIpControlPolicyItemResponse> addIpControlPolicyItem(AddIpControlPolicyItemRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddIpControlPolicyItem").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddIpControlPolicyItemResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddIpControlPolicyItemResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This API is intended for API providers.</p>
     * <ul>
     * <li>If the input SpecialKey already exists, the previous configuration is overwritten. Use caution when calling this operation.</li>
     * <li>Special throttling policies must be added to an existing throttling policy, and can take effect on all the APIs to which the throttling policy is bound.</li>
     * </ul>
     * 
     * @param request the request parameters of AddTrafficSpecialControl  AddTrafficSpecialControlRequest
     * @return AddTrafficSpecialControlResponse
     */
    @Override
    public CompletableFuture<AddTrafficSpecialControlResponse> addTrafficSpecialControl(AddTrafficSpecialControlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddTrafficSpecialControl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddTrafficSpecialControlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddTrafficSpecialControlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>An internal domain name resolution can be associated only with a dedicated instance, not with a shared instance or shared instance cluster.</p>
     * 
     * @param request the request parameters of AssociateInstanceWithPrivateDNS  AssociateInstanceWithPrivateDNSRequest
     * @return AssociateInstanceWithPrivateDNSResponse
     */
    @Override
    public CompletableFuture<AssociateInstanceWithPrivateDNSResponse> associateInstanceWithPrivateDNS(AssociateInstanceWithPrivateDNSRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AssociateInstanceWithPrivateDNS").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AssociateInstanceWithPrivateDNSResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AssociateInstanceWithPrivateDNSResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AttachApiProduct  AttachApiProductRequest
     * @return AttachApiProductResponse
     */
    @Override
    public CompletableFuture<AttachApiProductResponse> attachApiProduct(AttachApiProductRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AttachApiProduct").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AttachApiProductResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AttachApiProductResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API providers.</p>
     * <ul>
     * <li>You can only bind plug-ins to published APIs.</li>
     * <li>The plug-in takes effect immediately after it is bound to an API.</li>
     * <li>If you bind a different plug-in to an API, this plug-in takes effect immediately.</li>
     * </ul>
     * 
     * @param request the request parameters of AttachPlugin  AttachPluginRequest
     * @return AttachPluginResponse
     */
    @Override
    public CompletableFuture<AttachPluginResponse> attachPlugin(AttachPluginRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AttachPlugin").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AttachPluginResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AttachPluginResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BatchAbolishApis  BatchAbolishApisRequest
     * @return BatchAbolishApisResponse
     */
    @Override
    public CompletableFuture<BatchAbolishApisResponse> batchAbolishApis(BatchAbolishApisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchAbolishApis").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchAbolishApisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchAbolishApisResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BatchDeployApis  BatchDeployApisRequest
     * @return BatchDeployApisResponse
     */
    @Override
    public CompletableFuture<BatchDeployApisResponse> batchDeployApis(BatchDeployApisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchDeployApis").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchDeployApisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchDeployApisResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateAccessControlList  CreateAccessControlListRequest
     * @return CreateAccessControlListResponse
     */
    @Override
    public CompletableFuture<CreateAccessControlListResponse> createAccessControlList(CreateAccessControlListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAccessControlList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAccessControlListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAccessControlListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API providers.</p>
     * <ul>
     * <li>The name of an API must be unique within an API group.</li>
     * <li>A request path must be unique within an API group.</li>
     * <li>The QPS limit on this operation is 50 per user.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateApi  CreateApiRequest
     * @return CreateApiResponse
     */
    @Override
    public CompletableFuture<CreateApiResponse> createApi(CreateApiRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateApi").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateApiResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateApiResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateApiGroup  CreateApiGroupRequest
     * @return CreateApiGroupResponse
     */
    @Override
    public CompletableFuture<CreateApiGroupResponse> createApiGroup(CreateApiGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateApiGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateApiGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateApiGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API providers.</p>
     * 
     * @param request the request parameters of CreateApiStageVariable  CreateApiStageVariableRequest
     * @return CreateApiStageVariableResponse
     */
    @Override
    public CompletableFuture<CreateApiStageVariableResponse> createApiStageVariable(CreateApiStageVariableRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateApiStageVariable").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateApiStageVariableResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateApiStageVariableResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API callers.</p>
     * <ul>
     * <li>Each application has a key-value pair which is used for identity verification when you call an API.</li>
     * <li>An application must be authorized to call an API.</li>
     * <li>Each application has only one key-value pair, which can be reset if the pair is leaked.</li>
     * <li>A maximum of 1,000 applications can be created for each Alibaba Cloud account.</li>
     * <li>You can call this operation up to 50 times per second per account.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateApp  CreateAppRequest
     * @return CreateAppResponse
     */
    @Override
    public CompletableFuture<CreateAppResponse> createApp(CreateAppRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateApp").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAppResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAppResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateAppCode  CreateAppCodeRequest
     * @return CreateAppCodeResponse
     */
    @Override
    public CompletableFuture<CreateAppCodeResponse> createAppCode(CreateAppCodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAppCode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAppCodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAppCodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateAppKey  CreateAppKeyRequest
     * @return CreateAppKeyResponse
     */
    @Override
    public CompletableFuture<CreateAppKeyResponse> createAppKey(CreateAppKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAppKey").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAppKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAppKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateBackend  CreateBackendRequest
     * @return CreateBackendResponse
     */
    @Override
    public CompletableFuture<CreateBackendResponse> createBackend(CreateBackendRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateBackend").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateBackendResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateBackendResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateBackendModel  CreateBackendModelRequest
     * @return CreateBackendModelResponse
     */
    @Override
    public CompletableFuture<CreateBackendModelResponse> createBackendModel(CreateBackendModelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateBackendModel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateBackendModelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateBackendModelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateDataset  CreateDatasetRequest
     * @return CreateDatasetResponse
     */
    @Override
    public CompletableFuture<CreateDatasetResponse> createDataset(CreateDatasetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDataset").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDatasetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDatasetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateDatasetItem  CreateDatasetItemRequest
     * @return CreateDatasetItemResponse
     */
    @Override
    public CompletableFuture<CreateDatasetItemResponse> createDatasetItem(CreateDatasetItemRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDatasetItem").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDatasetItemResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDatasetItemResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateInstance  CreateInstanceRequest
     * @return CreateInstanceResponse
     */
    @Override
    public CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateIntranetDomain  CreateIntranetDomainRequest
     * @return CreateIntranetDomainResponse
     */
    @Override
    public CompletableFuture<CreateIntranetDomainResponse> createIntranetDomain(CreateIntranetDomainRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateIntranetDomain").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateIntranetDomainResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateIntranetDomainResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API providers.</p>
     * <ul>
     * <li>An ACL must be bound to an API to take effect. After an ACL is bound to an API, the ACL takes effect on the API immediately.</li>
     * <li>You can add policies to an ACL when you create the ACL.</li>
     * <li>If an ACL does not have any policy, the ACL is ineffective.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateIpControl  CreateIpControlRequest
     * @return CreateIpControlResponse
     */
    @Override
    public CompletableFuture<CreateIpControlResponse> createIpControl(CreateIpControlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateIpControl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateIpControlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateIpControlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateLogConfig  CreateLogConfigRequest
     * @return CreateLogConfigResponse
     */
    @Override
    public CompletableFuture<CreateLogConfigResponse> createLogConfig(CreateLogConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateLogConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateLogConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateLogConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  For more information about the model definition, see <a href="https://tools.ietf.org/html/draft-zyp-json-schema-04?spm=a2c4g.11186623.2.10.2e977ff7p4BpQd">JSON Schema Draft 4</a>.</p>
     * <ul>
     * <li>JSON Schema supports only element attributes of the Object type.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateModel  CreateModelRequest
     * @return CreateModelResponse
     */
    @Override
    public CompletableFuture<CreateModelResponse> createModel(CreateModelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateModel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateModelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateModelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateMonitorGroup  CreateMonitorGroupRequest
     * @return CreateMonitorGroupResponse
     */
    @Override
    public CompletableFuture<CreateMonitorGroupResponse> createMonitorGroup(CreateMonitorGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateMonitorGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMonitorGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMonitorGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API providers.</p>
     * <ul>
     * <li>The number of plug-ins of the same type that each user can create is limited. Different limits apply to different plug-in types.</li>
     * <li>The plug-in definitions for advanced features are restricted.</li>
     * <li>Plug-ins must be bound to APIs to take effect. After a plug-in is bound, it takes effect on that API immediately.</li>
     * </ul>
     * 
     * @param request the request parameters of CreatePlugin  CreatePluginRequest
     * @return CreatePluginResponse
     */
    @Override
    public CompletableFuture<CreatePluginResponse> createPlugin(CreatePluginRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreatePlugin").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePluginResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePluginResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>An internal domain name resolution of the virtual private cloud (VPC) type can be bound only to traditional dedicated instances. An internal domain name resolution of the A type can be bound only to VPC integration dedicated instances.</p>
     * 
     * @param request the request parameters of CreatePrivateDNS  CreatePrivateDNSRequest
     * @return CreatePrivateDNSResponse
     */
    @Override
    public CompletableFuture<CreatePrivateDNSResponse> createPrivateDNS(CreatePrivateDNSRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreatePrivateDNS").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePrivateDNSResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePrivateDNSResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This API is intended for API providers.</p>
     * <ul>
     * <li>The API operation only creates a key policy. You must call the binding operation to bind the key to an API.</li>
     * <li>After the key is bound to the API, requests sent from API Gateway to the backend service contain signature strings. You can specify whether your backend service verifies these signature strings.</li>
     * <li>The QPS limit on this operation is 50 per user.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateSignature  CreateSignatureRequest
     * @return CreateSignatureResponse
     */
    @Override
    public CompletableFuture<CreateSignatureResponse> createSignature(CreateSignatureRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSignature").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSignatureResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSignatureResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This API is intended for API providers.</p>
     * <ul>
     * <li>Throttling policies must be bound to APIs to take effect. After a policy is bound to an API, it goes into effect on that API immediately.</li>
     * <li>The QPS limit on this operation is 50 per user.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateTrafficControl  CreateTrafficControlRequest
     * @return CreateTrafficControlResponse
     */
    @Override
    public CompletableFuture<CreateTrafficControlResponse> createTrafficControl(CreateTrafficControlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateTrafficControl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTrafficControlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTrafficControlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteAccessControlList  DeleteAccessControlListRequest
     * @return DeleteAccessControlListResponse
     */
    @Override
    public CompletableFuture<DeleteAccessControlListResponse> deleteAccessControlList(DeleteAccessControlListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteAccessControlList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAccessControlListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAccessControlListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This API is intended for API providers.</p>
     * 
     * @param request the request parameters of DeleteAllTrafficSpecialControl  DeleteAllTrafficSpecialControlRequest
     * @return DeleteAllTrafficSpecialControlResponse
     */
    @Override
    public CompletableFuture<DeleteAllTrafficSpecialControlResponse> deleteAllTrafficSpecialControl(DeleteAllTrafficSpecialControlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteAllTrafficSpecialControl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAllTrafficSpecialControlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAllTrafficSpecialControlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API providers and cannot be undone after it is complete.</p>
     * <ul>
     * <li>An API that is running in the runtime environment must be unpublished before you can delete the API.****</li>
     * <li>The QPS limit on this operation is 50 per user.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteApi  DeleteApiRequest
     * @return DeleteApiResponse
     */
    @Override
    public CompletableFuture<DeleteApiResponse> deleteApi(DeleteApiRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteApi").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteApiResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteApiResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API providers.</p>
     * <ul>
     * <li>An API group that contains APIs cannot be deleted. To delete the API group, you must first delete its APIs.</li>
     * <li>After an API group is deleted, the second-level domain name bound to the API group is automatically invalidated.</li>
     * <li>If the specified API group does not exist, a success response is returned.</li>
     * <li>The QPS limit on this operation is 50 per user.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteApiGroup  DeleteApiGroupRequest
     * @return DeleteApiGroupResponse
     */
    @Override
    public CompletableFuture<DeleteApiGroupResponse> deleteApiGroup(DeleteApiGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteApiGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteApiGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteApiGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteApiProduct  DeleteApiProductRequest
     * @return DeleteApiProductResponse
     */
    @Override
    public CompletableFuture<DeleteApiProductResponse> deleteApiProduct(DeleteApiProductRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteApiProduct").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteApiProductResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteApiProductResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API providers.</p>
     * 
     * @param request the request parameters of DeleteApiStageVariable  DeleteApiStageVariableRequest
     * @return DeleteApiStageVariableResponse
     */
    @Override
    public CompletableFuture<DeleteApiStageVariableResponse> deleteApiStageVariable(DeleteApiStageVariableRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteApiStageVariable").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteApiStageVariableResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteApiStageVariableResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API callers.</p>
     * <ul>
     * <li>After an application is deleted, the application and its API authorization cannot be restored.</li>
     * <li>You can call this operation up to 50 times per second per account.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteApp  DeleteAppRequest
     * @return DeleteAppResponse
     */
    @Override
    public CompletableFuture<DeleteAppResponse> deleteApp(DeleteAppRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteApp").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAppResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAppResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteAppCode  DeleteAppCodeRequest
     * @return DeleteAppCodeResponse
     */
    @Override
    public CompletableFuture<DeleteAppCodeResponse> deleteAppCode(DeleteAppCodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteAppCode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAppCodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAppCodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteAppKey  DeleteAppKeyRequest
     * @return DeleteAppKeyResponse
     */
    @Override
    public CompletableFuture<DeleteAppKeyResponse> deleteAppKey(DeleteAppKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteAppKey").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAppKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAppKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteBackend  DeleteBackendRequest
     * @return DeleteBackendResponse
     */
    @Override
    public CompletableFuture<DeleteBackendResponse> deleteBackend(DeleteBackendRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteBackend").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteBackendResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteBackendResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteBackendModel  DeleteBackendModelRequest
     * @return DeleteBackendModelResponse
     */
    @Override
    public CompletableFuture<DeleteBackendModelResponse> deleteBackendModel(DeleteBackendModelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteBackendModel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteBackendModelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteBackendModelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteDataset  DeleteDatasetRequest
     * @return DeleteDatasetResponse
     */
    @Override
    public CompletableFuture<DeleteDatasetResponse> deleteDataset(DeleteDatasetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDataset").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDatasetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDatasetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteDatasetItem  DeleteDatasetItemRequest
     * @return DeleteDatasetItemResponse
     */
    @Override
    public CompletableFuture<DeleteDatasetItemResponse> deleteDatasetItem(DeleteDatasetItemRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDatasetItem").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDatasetItemResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDatasetItemResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API providers.</p>
     * <ul>
     * <li>If the specified domain name does not exist, a successful response will still appear.</li>
     * <li>Unbinding a domain name from an API group will affect access to the APIs in the group. Exercise caution when using this operation.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteDomain  DeleteDomainRequest
     * @return DeleteDomainResponse
     */
    @Override
    public CompletableFuture<DeleteDomainResponse> deleteDomain(DeleteDomainRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDomain").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDomainResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDomainResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteDomainCertificate  DeleteDomainCertificateRequest
     * @return DeleteDomainCertificateResponse
     */
    @Override
    public CompletableFuture<DeleteDomainCertificateResponse> deleteDomainCertificate(DeleteDomainCertificateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDomainCertificate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDomainCertificateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDomainCertificateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteInstance  DeleteInstanceRequest
     * @return DeleteInstanceResponse
     */
    @Override
    public CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API providers.</p>
     * <ul>
     * <li>If the ACL is bound to an API, you must unbind the ACL from the API before you can delete the ACL. Otherwise, an error is returned.</li>
     * <li>If you call this operation on an ACL that does not exist, a success message is returned.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteIpControl  DeleteIpControlRequest
     * @return DeleteIpControlResponse
     */
    @Override
    public CompletableFuture<DeleteIpControlResponse> deleteIpControl(DeleteIpControlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteIpControl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteIpControlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteIpControlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteLogConfig  DeleteLogConfigRequest
     * @return DeleteLogConfigResponse
     */
    @Override
    public CompletableFuture<DeleteLogConfigResponse> deleteLogConfig(DeleteLogConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteLogConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLogConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLogConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteModel  DeleteModelRequest
     * @return DeleteModelResponse
     */
    @Override
    public CompletableFuture<DeleteModelResponse> deleteModel(DeleteModelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteModel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteModelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteModelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteMonitorGroup  DeleteMonitorGroupRequest
     * @return DeleteMonitorGroupResponse
     */
    @Override
    public CompletableFuture<DeleteMonitorGroupResponse> deleteMonitorGroup(DeleteMonitorGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteMonitorGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMonitorGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMonitorGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API providers.</p>
     * <ul>
     * <li>You must first unbind the plug-in from the API. Otherwise, an error is reported when you delete the plug-in.</li>
     * </ul>
     * 
     * @param request the request parameters of DeletePlugin  DeletePluginRequest
     * @return DeletePluginResponse
     */
    @Override
    public CompletableFuture<DeletePluginResponse> deletePlugin(DeletePluginRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeletePlugin").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeletePluginResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeletePluginResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeletePrivateDNS  DeletePrivateDNSRequest
     * @return DeletePrivateDNSResponse
     */
    @Override
    public CompletableFuture<DeletePrivateDNSResponse> deletePrivateDNS(DeletePrivateDNSRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeletePrivateDNS").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeletePrivateDNSResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeletePrivateDNSResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This API is intended for API providers.</p>
     * <ul>
     * <li>This API operation deletes an existing backend signature key.</li>
     * <li>You cannot delete a key that is bound to an API. To delete the key, you must unbind it first.</li>
     * <li>The QPS limit on this operation is 50 per user.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteSignature  DeleteSignatureRequest
     * @return DeleteSignatureResponse
     */
    @Override
    public CompletableFuture<DeleteSignatureResponse> deleteSignature(DeleteSignatureRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteSignature").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSignatureResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSignatureResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This API is intended for API providers.</p>
     * <ul>
     * <li>If the throttling policy you want to delete is bound to APIs, you need to unbind the policy first. Otherwise, an error is reported when you delete the policy.</li>
     * <li>The QPS limit on this operation is 50 per user.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteTrafficControl  DeleteTrafficControlRequest
     * @return DeleteTrafficControlResponse
     */
    @Override
    public CompletableFuture<DeleteTrafficControlResponse> deleteTrafficControl(DeleteTrafficControlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteTrafficControl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteTrafficControlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteTrafficControlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This API is intended for API providers.</p>
     * <ul>
     * <li>You can obtain the input parameters required in this operation by calling other APIs.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteTrafficSpecialControl  DeleteTrafficSpecialControlRequest
     * @return DeleteTrafficSpecialControlResponse
     */
    @Override
    public CompletableFuture<DeleteTrafficSpecialControlResponse> deleteTrafficSpecialControl(DeleteTrafficSpecialControlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteTrafficSpecialControl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteTrafficSpecialControlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteTrafficSpecialControlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API providers. Only the API that you have defined and published to a runtime environment can be called.</p>
     * <ul>
     * <li>An API is published to a cluster in under 5 seconds.</li>
     * <li>The QPS limit on this operation is 50 per user.</li>
     * </ul>
     * 
     * @param request the request parameters of DeployApi  DeployApiRequest
     * @return DeployApiResponse
     */
    @Override
    public CompletableFuture<DeployApiResponse> deployApi(DeployApiRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeployApi").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeployApiResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeployApiResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeAbolishApiTask  DescribeAbolishApiTaskRequest
     * @return DescribeAbolishApiTaskResponse
     */
    @Override
    public CompletableFuture<DescribeAbolishApiTaskResponse> describeAbolishApiTask(DescribeAbolishApiTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAbolishApiTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAbolishApiTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAbolishApiTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeAccessControlListAttribute  DescribeAccessControlListAttributeRequest
     * @return DescribeAccessControlListAttributeResponse
     */
    @Override
    public CompletableFuture<DescribeAccessControlListAttributeResponse> describeAccessControlListAttribute(DescribeAccessControlListAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAccessControlListAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAccessControlListAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAccessControlListAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeAccessControlLists  DescribeAccessControlListsRequest
     * @return DescribeAccessControlListsResponse
     */
    @Override
    public CompletableFuture<DescribeAccessControlListsResponse> describeAccessControlLists(DescribeAccessControlListsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAccessControlLists").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAccessControlListsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAccessControlListsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API providers.</p>
     * 
     * @param request the request parameters of DescribeApi  DescribeApiRequest
     * @return DescribeApiResponse
     */
    @Override
    public CompletableFuture<DescribeApiResponse> describeApi(DescribeApiRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeApi").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeApiResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeApiResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  For API callers, the specified API must be a public or authorized private API that has been published to a runtime environment.</p>
     * <ul>
     * <li>When you call this operation as an API caller, the service information, parameter definitions, and other details of the API you specify are returned.</li>
     * <li>When you call this operation as an API provider, the definition of the specified API running in the specified runtime environment is returned. The returned definition takes effect in the runtime environment, and may be different from the definition of the API you modify.</li>
     * <li>Before you call this operation as an API provider, ensure that the API to be queried is a public one or that your application has been authorized to call the API, because authentication on API callers is required.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeApiDoc  DescribeApiDocRequest
     * @return DescribeApiDocResponse
     */
    @Override
    public CompletableFuture<DescribeApiDocResponse> describeApiDoc(DescribeApiDocRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeApiDoc").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeApiDocResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeApiDocResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API providers.</p>
     * 
     * @param request the request parameters of DescribeApiGroup  DescribeApiGroupRequest
     * @return DescribeApiGroupResponse
     */
    @Override
    public CompletableFuture<DescribeApiGroupResponse> describeApiGroup(DescribeApiGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeApiGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeApiGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeApiGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeApiGroupVpcWhitelist  DescribeApiGroupVpcWhitelistRequest
     * @return DescribeApiGroupVpcWhitelistResponse
     */
    @Override
    public CompletableFuture<DescribeApiGroupVpcWhitelistResponse> describeApiGroupVpcWhitelist(DescribeApiGroupVpcWhitelistRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeApiGroupVpcWhitelist").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeApiGroupVpcWhitelistResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeApiGroupVpcWhitelistResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API providers.</p>
     * 
     * @param request the request parameters of DescribeApiGroups  DescribeApiGroupsRequest
     * @return DescribeApiGroupsResponse
     */
    @Override
    public CompletableFuture<DescribeApiGroupsResponse> describeApiGroups(DescribeApiGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeApiGroups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeApiGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeApiGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API providers. Only APIs that have been published have historical version records.</p>
     * <ul>
     * <li>This operation allows you to obtain the historical versions of an API. This operation is always called by other operations.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeApiHistories  DescribeApiHistoriesRequest
     * @return DescribeApiHistoriesResponse
     */
    @Override
    public CompletableFuture<DescribeApiHistoriesResponse> describeApiHistories(DescribeApiHistoriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeApiHistories").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeApiHistoriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeApiHistoriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the details of a specified historical version of a specified API definition.</p>
     * <ul>
     * <li>This API is intended for API providers.</li>
     * <li>API Gateway records the time and definition of an API every time the API is published. You can use the version number obtained from other operations to query definition details at a certain publication.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeApiHistory  DescribeApiHistoryRequest
     * @return DescribeApiHistoryResponse
     */
    @Override
    public CompletableFuture<DescribeApiHistoryResponse> describeApiHistory(DescribeApiHistoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeApiHistory").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeApiHistoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeApiHistoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API callers.</p>
     * <ul>
     * <li>If an optional parameter is not specified, all results are returned on separate pages.
     * ·</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeApiIpControls  DescribeApiIpControlsRequest
     * @return DescribeApiIpControlsResponse
     */
    @Override
    public CompletableFuture<DescribeApiIpControlsResponse> describeApiIpControls(DescribeApiIpControlsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeApiIpControls").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeApiIpControlsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeApiIpControlsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the latency metrics in milliseconds for a specified API.</p>
     * <ul>
     * <li>This API is intended for API providers.</li>
     * <li>Only statistics for API calls made in the release environment are collected by default.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeApiLatencyData  DescribeApiLatencyDataRequest
     * @return DescribeApiLatencyDataResponse
     */
    @Override
    public CompletableFuture<DescribeApiLatencyDataResponse> describeApiLatencyData(DescribeApiLatencyDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeApiLatencyData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeApiLatencyDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeApiLatencyDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeApiMarketAttributes  DescribeApiMarketAttributesRequest
     * @return DescribeApiMarketAttributesResponse
     */
    @Override
    public CompletableFuture<DescribeApiMarketAttributesResponse> describeApiMarketAttributes(DescribeApiMarketAttributesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeApiMarketAttributes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeApiMarketAttributesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeApiMarketAttributesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeApiProductApis  DescribeApiProductApisRequest
     * @return DescribeApiProductApisResponse
     */
    @Override
    public CompletableFuture<DescribeApiProductApisResponse> describeApiProductApis(DescribeApiProductApisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeApiProductApis").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeApiProductApisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeApiProductApisResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeApiProductsByApp  DescribeApiProductsByAppRequest
     * @return DescribeApiProductsByAppResponse
     */
    @Override
    public CompletableFuture<DescribeApiProductsByAppResponse> describeApiProductsByApp(DescribeApiProductsByAppRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeApiProductsByApp").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeApiProductsByAppResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeApiProductsByAppResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This API is intended for API providers.</p>
     * <ul>
     * <li>Only statistics for API calls made in the release environment are collected by default.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeApiQpsData  DescribeApiQpsDataRequest
     * @return DescribeApiQpsDataResponse
     */
    @Override
    public CompletableFuture<DescribeApiQpsDataResponse> describeApiQpsData(DescribeApiQpsDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeApiQpsData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeApiQpsDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeApiQpsDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This API is intended for API providers.</p>
     * <ul>
     * <li>The ApiIds parameter is optional. If this parameter is not specified, all results in the specified environment of an API group are returned.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeApiSignatures  DescribeApiSignaturesRequest
     * @return DescribeApiSignaturesResponse
     */
    @Override
    public CompletableFuture<DescribeApiSignaturesResponse> describeApiSignatures(DescribeApiSignaturesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeApiSignatures").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeApiSignaturesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeApiSignaturesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This API is intended for API providers.</p>
     * <ul>
     * <li>The ApiIds parameter is optional. If this parameter is not specified, all results in the specified environment of an API group are returned.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeApiTrafficControls  DescribeApiTrafficControlsRequest
     * @return DescribeApiTrafficControlsResponse
     */
    @Override
    public CompletableFuture<DescribeApiTrafficControlsResponse> describeApiTrafficControls(DescribeApiTrafficControlsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeApiTrafficControls").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeApiTrafficControlsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeApiTrafficControlsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This API is intended for API providers.</p>
     * <ul>
     * <li>Only statistics for API calls made in the release environment are collected by default.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeApiTrafficData  DescribeApiTrafficDataRequest
     * @return DescribeApiTrafficDataResponse
     */
    @Override
    public CompletableFuture<DescribeApiTrafficDataResponse> describeApiTrafficData(DescribeApiTrafficDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeApiTrafficData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeApiTrafficDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeApiTrafficDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API callers.</p>
     * <ul>
     * <li>This operation returns a list of all APIs that are being defined. The basic information about these APIs is also returned in the list.</li>
     * <li>This operation returns all APIs that are being edited, regardless of their environments. The returned definitions may be different from the definitions in the environments.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeApis  DescribeApisRequest
     * @return DescribeApisResponse
     */
    @Override
    public CompletableFuture<DescribeApisResponse> describeApis(DescribeApisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeApis").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeApisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeApisResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeApisByApp  DescribeApisByAppRequest
     * @return DescribeApisByAppResponse
     */
    @Override
    public CompletableFuture<DescribeApisByAppResponse> describeApisByApp(DescribeApisByAppRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeApisByApp").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeApisByAppResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeApisByAppResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeApisByBackend  DescribeApisByBackendRequest
     * @return DescribeApisByBackendResponse
     */
    @Override
    public CompletableFuture<DescribeApisByBackendResponse> describeApisByBackend(DescribeApisByBackendRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeApisByBackend").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeApisByBackendResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeApisByBackendResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API callers.</p>
     * <ul>
     * <li>You can specify PageNumber to obtain the result on the specified page.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeApisByIpControl  DescribeApisByIpControlRequest
     * @return DescribeApisByIpControlResponse
     */
    @Override
    public CompletableFuture<DescribeApisByIpControlResponse> describeApisByIpControl(DescribeApisByIpControlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeApisByIpControl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeApisByIpControlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeApisByIpControlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This API is intended for API providers.</p>
     * <ul>
     * <li>The results are returned on separate pages. You can specify PageNumber to obtain the result on the specified page.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeApisBySignature  DescribeApisBySignatureRequest
     * @return DescribeApisBySignatureResponse
     */
    @Override
    public CompletableFuture<DescribeApisBySignatureResponse> describeApisBySignature(DescribeApisBySignatureRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeApisBySignature").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeApisBySignatureResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeApisBySignatureResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This API is intended for API providers.</p>
     * <ul>
     * <li>You can specify PageNumber to obtain the result on the specified page.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeApisByTrafficControl  DescribeApisByTrafficControlRequest
     * @return DescribeApisByTrafficControlResponse
     */
    @Override
    public CompletableFuture<DescribeApisByTrafficControlResponse> describeApisByTrafficControl(DescribeApisByTrafficControlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeApisByTrafficControl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeApisByTrafficControlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeApisByTrafficControlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeApisByVpcAccess  DescribeApisByVpcAccessRequest
     * @return DescribeApisByVpcAccessResponse
     */
    @Override
    public CompletableFuture<DescribeApisByVpcAccessResponse> describeApisByVpcAccess(DescribeApisByVpcAccessRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeApisByVpcAccess").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeApisByVpcAccessResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeApisByVpcAccessResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeApisWithStageNameIntegratedByApp  DescribeApisWithStageNameIntegratedByAppRequest
     * @return DescribeApisWithStageNameIntegratedByAppResponse
     */
    @Override
    public CompletableFuture<DescribeApisWithStageNameIntegratedByAppResponse> describeApisWithStageNameIntegratedByApp(DescribeApisWithStageNameIntegratedByAppRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeApisWithStageNameIntegratedByApp").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeApisWithStageNameIntegratedByAppResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeApisWithStageNameIntegratedByAppResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeApp  DescribeAppRequest
     * @return DescribeAppResponse
     */
    @Override
    public CompletableFuture<DescribeAppResponse> describeApp(DescribeAppRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeApp").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAppResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAppResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API callers.</p>
     * <ul>
     * <li>AppId is optional.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeAppAttributes  DescribeAppAttributesRequest
     * @return DescribeAppAttributesResponse
     */
    @Override
    public CompletableFuture<DescribeAppAttributesResponse> describeAppAttributes(DescribeAppAttributesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAppAttributes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAppAttributesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAppAttributesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeAppSecurities  DescribeAppSecuritiesRequest
     * @return DescribeAppSecuritiesResponse
     */
    @Override
    public CompletableFuture<DescribeAppSecuritiesResponse> describeAppSecurities(DescribeAppSecuritiesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAppSecurities").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAppSecuritiesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAppSecuritiesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API callers.</p>
     * 
     * @param request the request parameters of DescribeAppSecurity  DescribeAppSecurityRequest
     * @return DescribeAppSecurityResponse
     */
    @Override
    public CompletableFuture<DescribeAppSecurityResponse> describeAppSecurity(DescribeAppSecurityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAppSecurity").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAppSecurityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAppSecurityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This API is intended for API providers.</p>
     * <ul>
     * <li>API providers can use the app IDs or their Alibaba Cloud accounts to query app information.</li>
     * <li>Each provider can call this operation for a maximum of 200 times every day in a region.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeApps  DescribeAppsRequest
     * @return DescribeAppsResponse
     */
    @Override
    public CompletableFuture<DescribeAppsResponse> describeApps(DescribeAppsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeApps").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAppsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAppsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeAppsByApiProduct  DescribeAppsByApiProductRequest
     * @return DescribeAppsByApiProductResponse
     */
    @Override
    public CompletableFuture<DescribeAppsByApiProductResponse> describeAppsByApiProduct(DescribeAppsByApiProductRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAppsByApiProduct").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAppsByApiProductResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAppsByApiProductResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API callers.</p>
     * <ul>
     * <li>The specified application can call all APIs included in the responses.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeAuthorizedApis  DescribeAuthorizedApisRequest
     * @return DescribeAuthorizedApisResponse
     */
    @Override
    public CompletableFuture<DescribeAuthorizedApisResponse> describeAuthorizedApis(DescribeAuthorizedApisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAuthorizedApis").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAuthorizedApisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAuthorizedApisResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API providers.</p>
     * <ul>
     * <li>All applications included in the responses have access to the specified API.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeAuthorizedApps  DescribeAuthorizedAppsRequest
     * @return DescribeAuthorizedAppsResponse
     */
    @Override
    public CompletableFuture<DescribeAuthorizedAppsResponse> describeAuthorizedApps(DescribeAuthorizedAppsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAuthorizedApps").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAuthorizedAppsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAuthorizedAppsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeBackendInfo  DescribeBackendInfoRequest
     * @return DescribeBackendInfoResponse
     */
    @Override
    public CompletableFuture<DescribeBackendInfoResponse> describeBackendInfo(DescribeBackendInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeBackendInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeBackendInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeBackendInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeBackendList  DescribeBackendListRequest
     * @return DescribeBackendListResponse
     */
    @Override
    public CompletableFuture<DescribeBackendListResponse> describeBackendList(DescribeBackendListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeBackendList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeBackendListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeBackendListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDatasetInfo  DescribeDatasetInfoRequest
     * @return DescribeDatasetInfoResponse
     */
    @Override
    public CompletableFuture<DescribeDatasetInfoResponse> describeDatasetInfo(DescribeDatasetInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDatasetInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDatasetInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDatasetInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDatasetItemInfo  DescribeDatasetItemInfoRequest
     * @return DescribeDatasetItemInfoResponse
     */
    @Override
    public CompletableFuture<DescribeDatasetItemInfoResponse> describeDatasetItemInfo(DescribeDatasetItemInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDatasetItemInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDatasetItemInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDatasetItemInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDatasetItemList  DescribeDatasetItemListRequest
     * @return DescribeDatasetItemListResponse
     */
    @Override
    public CompletableFuture<DescribeDatasetItemListResponse> describeDatasetItemList(DescribeDatasetItemListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDatasetItemList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDatasetItemListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDatasetItemListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDatasetList  DescribeDatasetListRequest
     * @return DescribeDatasetListResponse
     */
    @Override
    public CompletableFuture<DescribeDatasetListResponse> describeDatasetList(DescribeDatasetListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDatasetList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDatasetListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDatasetListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDeployApiTask  DescribeDeployApiTaskRequest
     * @return DescribeDeployApiTaskResponse
     */
    @Override
    public CompletableFuture<DescribeDeployApiTaskResponse> describeDeployApiTask(DescribeDeployApiTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDeployApiTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDeployApiTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDeployApiTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDeployedApi  DescribeDeployedApiRequest
     * @return DescribeDeployedApiResponse
     */
    @Override
    public CompletableFuture<DescribeDeployedApiResponse> describeDeployedApi(DescribeDeployedApiRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDeployedApi").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDeployedApiResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDeployedApiResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This API is intended for API providers.</p>
     * 
     * @param request the request parameters of DescribeDeployedApis  DescribeDeployedApisRequest
     * @return DescribeDeployedApisResponse
     */
    @Override
    public CompletableFuture<DescribeDeployedApisResponse> describeDeployedApis(DescribeDeployedApisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDeployedApis").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDeployedApisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDeployedApisResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDomain  DescribeDomainRequest
     * @return DescribeDomainResponse
     */
    @Override
    public CompletableFuture<DescribeDomainResponse> describeDomain(DescribeDomainRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDomain").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDomainResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDomainResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeGroupLatency  DescribeGroupLatencyRequest
     * @return DescribeGroupLatencyResponse
     */
    @Override
    public CompletableFuture<DescribeGroupLatencyResponse> describeGroupLatency(DescribeGroupLatencyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeGroupLatency").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeGroupLatencyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeGroupLatencyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeGroupQps  DescribeGroupQpsRequest
     * @return DescribeGroupQpsResponse
     */
    @Override
    public CompletableFuture<DescribeGroupQpsResponse> describeGroupQps(DescribeGroupQpsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeGroupQps").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeGroupQpsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeGroupQpsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeGroupTraffic  DescribeGroupTrafficRequest
     * @return DescribeGroupTrafficResponse
     */
    @Override
    public CompletableFuture<DescribeGroupTrafficResponse> describeGroupTraffic(DescribeGroupTrafficRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeGroupTraffic").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeGroupTrafficResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeGroupTrafficResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeHistoryApis  DescribeHistoryApisRequest
     * @return DescribeHistoryApisResponse
     */
    @Override
    public CompletableFuture<DescribeHistoryApisResponse> describeHistoryApis(DescribeHistoryApisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeHistoryApis").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeHistoryApisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeHistoryApisResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeImportOASTask  DescribeImportOASTaskRequest
     * @return DescribeImportOASTaskResponse
     */
    @Override
    public CompletableFuture<DescribeImportOASTaskResponse> describeImportOASTask(DescribeImportOASTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeImportOASTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeImportOASTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeImportOASTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeInstanceClusterInfo  DescribeInstanceClusterInfoRequest
     * @return DescribeInstanceClusterInfoResponse
     */
    @Override
    public CompletableFuture<DescribeInstanceClusterInfoResponse> describeInstanceClusterInfo(DescribeInstanceClusterInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceClusterInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceClusterInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceClusterInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeInstanceClusterList  DescribeInstanceClusterListRequest
     * @return DescribeInstanceClusterListResponse
     */
    @Override
    public CompletableFuture<DescribeInstanceClusterListResponse> describeInstanceClusterList(DescribeInstanceClusterListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceClusterList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceClusterListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceClusterListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeInstanceDropConnections  DescribeInstanceDropConnectionsRequest
     * @return DescribeInstanceDropConnectionsResponse
     */
    @Override
    public CompletableFuture<DescribeInstanceDropConnectionsResponse> describeInstanceDropConnections(DescribeInstanceDropConnectionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceDropConnections").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceDropConnectionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceDropConnectionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeInstanceDropPacket  DescribeInstanceDropPacketRequest
     * @return DescribeInstanceDropPacketResponse
     */
    @Override
    public CompletableFuture<DescribeInstanceDropPacketResponse> describeInstanceDropPacket(DescribeInstanceDropPacketRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceDropPacket").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceDropPacketResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceDropPacketResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeInstanceHttpCode  DescribeInstanceHttpCodeRequest
     * @return DescribeInstanceHttpCodeResponse
     */
    @Override
    public CompletableFuture<DescribeInstanceHttpCodeResponse> describeInstanceHttpCode(DescribeInstanceHttpCodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceHttpCode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceHttpCodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceHttpCodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeInstanceLatency  DescribeInstanceLatencyRequest
     * @return DescribeInstanceLatencyResponse
     */
    @Override
    public CompletableFuture<DescribeInstanceLatencyResponse> describeInstanceLatency(DescribeInstanceLatencyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceLatency").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceLatencyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceLatencyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeInstanceNewConnections  DescribeInstanceNewConnectionsRequest
     * @return DescribeInstanceNewConnectionsResponse
     */
    @Override
    public CompletableFuture<DescribeInstanceNewConnectionsResponse> describeInstanceNewConnections(DescribeInstanceNewConnectionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceNewConnections").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceNewConnectionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceNewConnectionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeInstancePackets  DescribeInstancePacketsRequest
     * @return DescribeInstancePacketsResponse
     */
    @Override
    public CompletableFuture<DescribeInstancePacketsResponse> describeInstancePackets(DescribeInstancePacketsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstancePackets").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstancePacketsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstancePacketsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeInstanceQps  DescribeInstanceQpsRequest
     * @return DescribeInstanceQpsResponse
     */
    @Override
    public CompletableFuture<DescribeInstanceQpsResponse> describeInstanceQps(DescribeInstanceQpsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceQps").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceQpsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceQpsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeInstanceSlbConnect  DescribeInstanceSlbConnectRequest
     * @return DescribeInstanceSlbConnectResponse
     */
    @Override
    public CompletableFuture<DescribeInstanceSlbConnectResponse> describeInstanceSlbConnect(DescribeInstanceSlbConnectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceSlbConnect").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceSlbConnectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceSlbConnectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeInstanceTraffic  DescribeInstanceTrafficRequest
     * @return DescribeInstanceTrafficResponse
     */
    @Override
    public CompletableFuture<DescribeInstanceTrafficResponse> describeInstanceTraffic(DescribeInstanceTrafficRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceTraffic").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceTrafficResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceTrafficResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeInstances  DescribeInstancesRequest
     * @return DescribeInstancesResponse
     */
    @Override
    public CompletableFuture<DescribeInstancesResponse> describeInstances(DescribeInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API providers.</p>
     * <ul>
     * <li>You can filter the query results by policy ID.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeIpControlPolicyItems  DescribeIpControlPolicyItemsRequest
     * @return DescribeIpControlPolicyItemsResponse
     */
    @Override
    public CompletableFuture<DescribeIpControlPolicyItemsResponse> describeIpControlPolicyItems(DescribeIpControlPolicyItemsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeIpControlPolicyItems").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeIpControlPolicyItemsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeIpControlPolicyItemsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API providers.</p>
     * <ul>
     * <li>This operation is used to query the ACLs in a region. Region is a system parameter.</li>
     * <li>You can filter the query results by ACL ID, name, or type.</li>
     * <li>This operation cannot be used to query specific policies. If you want to query specific policies, call the <a href="~~DescribeIpControlPolicyItems~~">DescribeIpControlPolicyItems</a> operation.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeIpControls  DescribeIpControlsRequest
     * @return DescribeIpControlsResponse
     */
    @Override
    public CompletableFuture<DescribeIpControlsResponse> describeIpControls(DescribeIpControlsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeIpControls").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeIpControlsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeIpControlsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeLogConfig  DescribeLogConfigRequest
     * @return DescribeLogConfigResponse
     */
    @Override
    public CompletableFuture<DescribeLogConfigResponse> describeLogConfig(DescribeLogConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLogConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLogConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLogConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeMarketRemainsQuota  DescribeMarketRemainsQuotaRequest
     * @return DescribeMarketRemainsQuotaResponse
     */
    @Override
    public CompletableFuture<DescribeMarketRemainsQuotaResponse> describeMarketRemainsQuota(DescribeMarketRemainsQuotaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeMarketRemainsQuota").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMarketRemainsQuotaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMarketRemainsQuotaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Fuzzy queries are supported.</p>
     * 
     * @param request the request parameters of DescribeModels  DescribeModelsRequest
     * @return DescribeModelsResponse
     */
    @Override
    public CompletableFuture<DescribeModelsResponse> describeModels(DescribeModelsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeModels").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeModelsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeModelsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribePluginApis  DescribePluginApisRequest
     * @return DescribePluginApisResponse
     */
    @Override
    public CompletableFuture<DescribePluginApisResponse> describePluginApis(DescribePluginApisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePluginApis").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePluginApisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePluginApisResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribePluginSchemas  DescribePluginSchemasRequest
     * @return DescribePluginSchemasResponse
     */
    @Override
    public CompletableFuture<DescribePluginSchemasResponse> describePluginSchemas(DescribePluginSchemasRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePluginSchemas").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePluginSchemasResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePluginSchemasResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribePluginTemplates  DescribePluginTemplatesRequest
     * @return DescribePluginTemplatesResponse
     */
    @Override
    public CompletableFuture<DescribePluginTemplatesResponse> describePluginTemplates(DescribePluginTemplatesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePluginTemplates").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePluginTemplatesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePluginTemplatesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation supports pagination.</p>
     * <ul>
     * <li>This operation allows you to query plug-ins by business type.</li>
     * <li>This operation allows you to query plug-ins by ID.</li>
     * <li>This operation allows you to query plug-ins by name.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribePlugins  DescribePluginsRequest
     * @return DescribePluginsResponse
     */
    @Override
    public CompletableFuture<DescribePluginsResponse> describePlugins(DescribePluginsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePlugins").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePluginsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePluginsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API callers.</p>
     * <ul>
     * <li>This operation supports pagination.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribePluginsByApi  DescribePluginsByApiRequest
     * @return DescribePluginsByApiResponse
     */
    @Override
    public CompletableFuture<DescribePluginsByApiResponse> describePluginsByApi(DescribePluginsByApiRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePluginsByApi").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePluginsByApiResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePluginsByApiResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribePurchasedApiGroup  DescribePurchasedApiGroupRequest
     * @return DescribePurchasedApiGroupResponse
     */
    @Override
    public CompletableFuture<DescribePurchasedApiGroupResponse> describePurchasedApiGroup(DescribePurchasedApiGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePurchasedApiGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePurchasedApiGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePurchasedApiGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribePurchasedApiGroups  DescribePurchasedApiGroupsRequest
     * @return DescribePurchasedApiGroupsResponse
     */
    @Override
    public CompletableFuture<DescribePurchasedApiGroupsResponse> describePurchasedApiGroups(DescribePurchasedApiGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePurchasedApiGroups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePurchasedApiGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePurchasedApiGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribePurchasedApis  DescribePurchasedApisRequest
     * @return DescribePurchasedApisResponse
     */
    @Override
    public CompletableFuture<DescribePurchasedApisResponse> describePurchasedApis(DescribePurchasedApisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePurchasedApis").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePurchasedApisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePurchasedApisResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation queries regions in which API Gateway is available.</p>
     * <ul>
     * <li>This operation is intended for API providers and callers.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    @Override
    public CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRegions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRegionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRegionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This API is intended for API providers.</p>
     * <ul>
     * <li>This operation is used to query the backend signature keys in a Region. Region is a system parameter.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSignatures  DescribeSignaturesRequest
     * @return DescribeSignaturesResponse
     */
    @Override
    public CompletableFuture<DescribeSignaturesResponse> describeSignatures(DescribeSignaturesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSignatures").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSignaturesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSignaturesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This API is intended for API providers.</p>
     * 
     * @param request the request parameters of DescribeSignaturesByApi  DescribeSignaturesByApiRequest
     * @return DescribeSignaturesByApiResponse
     */
    @Override
    public CompletableFuture<DescribeSignaturesByApiResponse> describeSignaturesByApi(DescribeSignaturesByApiRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSignaturesByApi").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSignaturesByApiResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSignaturesByApiResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSummaryData  DescribeSummaryDataRequest
     * @return DescribeSummaryDataResponse
     */
    @Override
    public CompletableFuture<DescribeSummaryDataResponse> describeSummaryData(DescribeSummaryDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSummaryData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSummaryDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSummaryDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This API is intended for API callers.</p>
     * <ul>
     * <li>The response of this API contains the system parameters that are optional in API definitions.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSystemParameters  DescribeSystemParametersRequest
     * @return DescribeSystemParametersResponse
     */
    @Override
    public CompletableFuture<DescribeSystemParametersResponse> describeSystemParameters(DescribeSystemParametersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSystemParameters").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSystemParametersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSystemParametersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This API is intended for API providers.</p>
     * <ul>
     * <li>This API can be used to query all existing throttling policies (including special throttling policies) and their details.</li>
     * <li>You can specify query conditions. For example, you can query the throttling policies bound to a specified API or in a specified environment.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeTrafficControls  DescribeTrafficControlsRequest
     * @return DescribeTrafficControlsResponse
     */
    @Override
    public CompletableFuture<DescribeTrafficControlsResponse> describeTrafficControls(DescribeTrafficControlsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeTrafficControls").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeTrafficControlsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeTrafficControlsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This API is intended for API providers.</p>
     * 
     * @param request the request parameters of DescribeTrafficControlsByApi  DescribeTrafficControlsByApiRequest
     * @return DescribeTrafficControlsByApiResponse
     */
    @Override
    public CompletableFuture<DescribeTrafficControlsByApiResponse> describeTrafficControlsByApi(DescribeTrafficControlsByApiRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeTrafficControlsByApi").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeTrafficControlsByApiResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeTrafficControlsByApiResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeUpdateBackendTask  DescribeUpdateBackendTaskRequest
     * @return DescribeUpdateBackendTaskResponse
     */
    @Override
    public CompletableFuture<DescribeUpdateBackendTaskResponse> describeUpdateBackendTask(DescribeUpdateBackendTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeUpdateBackendTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeUpdateBackendTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeUpdateBackendTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeUpdateVpcInfoTask  DescribeUpdateVpcInfoTaskRequest
     * @return DescribeUpdateVpcInfoTaskResponse
     */
    @Override
    public CompletableFuture<DescribeUpdateVpcInfoTaskResponse> describeUpdateVpcInfoTask(DescribeUpdateVpcInfoTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeUpdateVpcInfoTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeUpdateVpcInfoTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeUpdateVpcInfoTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeVpcAccesses  DescribeVpcAccessesRequest
     * @return DescribeVpcAccessesResponse
     */
    @Override
    public CompletableFuture<DescribeVpcAccessesResponse> describeVpcAccesses(DescribeVpcAccessesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVpcAccesses").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVpcAccessesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVpcAccessesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeZones  DescribeZonesRequest
     * @return DescribeZonesResponse
     */
    @Override
    public CompletableFuture<DescribeZonesResponse> describeZones(DescribeZonesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeZones").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeZonesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeZonesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DetachApiProduct  DetachApiProductRequest
     * @return DetachApiProductResponse
     */
    @Override
    public CompletableFuture<DetachApiProductResponse> detachApiProduct(DetachApiProductRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetachApiProduct").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetachApiProductResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetachApiProductResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DetachPlugin  DetachPluginRequest
     * @return DetachPluginResponse
     */
    @Override
    public CompletableFuture<DetachPluginResponse> detachPlugin(DetachPluginRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetachPlugin").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetachPluginResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetachPluginResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DisableInstanceAccessControl  DisableInstanceAccessControlRequest
     * @return DisableInstanceAccessControlResponse
     */
    @Override
    public CompletableFuture<DisableInstanceAccessControlResponse> disableInstanceAccessControl(DisableInstanceAccessControlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisableInstanceAccessControl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableInstanceAccessControlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableInstanceAccessControlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DissociateInstanceWithPrivateDNS  DissociateInstanceWithPrivateDNSRequest
     * @return DissociateInstanceWithPrivateDNSResponse
     */
    @Override
    public CompletableFuture<DissociateInstanceWithPrivateDNSResponse> dissociateInstanceWithPrivateDNS(DissociateInstanceWithPrivateDNSRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DissociateInstanceWithPrivateDNS").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DissociateInstanceWithPrivateDNSResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DissociateInstanceWithPrivateDNSResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DryRunSwagger  DryRunSwaggerRequest
     * @return DryRunSwaggerResponse
     */
    @Override
    public CompletableFuture<DryRunSwaggerResponse> dryRunSwagger(DryRunSwaggerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DryRunSwagger").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DryRunSwaggerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DryRunSwaggerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnableInstanceAccessControl  EnableInstanceAccessControlRequest
     * @return EnableInstanceAccessControlResponse
     */
    @Override
    public CompletableFuture<EnableInstanceAccessControlResponse> enableInstanceAccessControl(EnableInstanceAccessControlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableInstanceAccessControl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableInstanceAccessControlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableInstanceAccessControlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ExportOAS  ExportOASRequest
     * @return ExportOASResponse
     */
    @Override
    public CompletableFuture<ExportOASResponse> exportOAS(ExportOASRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ExportOAS").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExportOASResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExportOASResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ImportOAS  ImportOASRequest
     * @return ImportOASResponse
     */
    @Override
    public CompletableFuture<ImportOASResponse> importOAS(ImportOASRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ImportOAS").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ImportOASResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ImportOASResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Alibaba Cloud supports extensions based on Swagger 2.0.</p>
     * <ul>
     * <li>Alibaba Cloud supports Swagger configuration files in JSON and YAML formats.</li>
     * </ul>
     * 
     * @param request the request parameters of ImportSwagger  ImportSwaggerRequest
     * @return ImportSwaggerResponse
     */
    @Override
    public CompletableFuture<ImportSwaggerResponse> importSwagger(ImportSwaggerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ImportSwagger").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ImportSwaggerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ImportSwaggerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPrivateDNS  ListPrivateDNSRequest
     * @return ListPrivateDNSResponse
     */
    @Override
    public CompletableFuture<ListPrivateDNSResponse> listPrivateDNS(ListPrivateDNSRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListPrivateDNS").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPrivateDNSResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPrivateDNSResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  The Tag.N.Key and Tag.N.Value parameters constitute a key-value pair.</p>
     * <ul>
     * <li>ResourceId.N must meet all the key-value pairs that are entered. If you enter multiple key-value pairs, resources that contain the specified key-value pairs are returned.</li>
     * <li>This operation is used to query resource tags based on conditions. If no relationship matches the conditions, an empty list is returned.</li>
     * <li>You can query both user tags and visible system tags.</li>
     * <li>In addition to the required parameters, you can also specify ResourceId.N to query the visible resource tags of a specified resource in a region.</li>
     * <li>You can also specify Tag.N.Key to query the visible keys of a specified key in a region.</li>
     * <li>At least one of ResourceId.N, Tag.N.Key, and Tag.N.Value exists.</li>
     * <li>You can query tags of the same type or different types in a single operation.</li>
     * <li>You can query all your user types and visible system tags.</li>
     * </ul>
     * 
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    @Override
    public CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTagResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><em>This operation is intended for API providers.</em>*</p>
     * <ul>
     * <li>This API operation requires a full update. Updates of partial parameters are not supported.</li>
     * <li>When you modify an API name, make sure that the name of each API within the same group is unique.</li>
     * <li>When you modify the request path, make sure that each request path within the same group is unique.</li>
     * <li>The QPS limit on this operation is 50 per user.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyApi  ModifyApiRequest
     * @return ModifyApiResponse
     */
    @Override
    public CompletableFuture<ModifyApiResponse> modifyApi(ModifyApiRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyApi").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyApiResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyApiResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyApiConfiguration  ModifyApiConfigurationRequest
     * @return ModifyApiConfigurationResponse
     */
    @Override
    public CompletableFuture<ModifyApiConfigurationResponse> modifyApiConfiguration(ModifyApiConfigurationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyApiConfiguration").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyApiConfigurationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyApiConfigurationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API providers.</p>
     * <ul>
     * <li>The QPS limit on this operation is 50 per user.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyApiGroup  ModifyApiGroupRequest
     * @return ModifyApiGroupResponse
     */
    @Override
    public CompletableFuture<ModifyApiGroupResponse> modifyApiGroup(ModifyApiGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyApiGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyApiGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyApiGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyApiGroupInstance  ModifyApiGroupInstanceRequest
     * @return ModifyApiGroupInstanceResponse
     */
    @Override
    public CompletableFuture<ModifyApiGroupInstanceResponse> modifyApiGroupInstance(ModifyApiGroupInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyApiGroupInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyApiGroupInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyApiGroupInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyApiGroupNetworkPolicy  ModifyApiGroupNetworkPolicyRequest
     * @return ModifyApiGroupNetworkPolicyResponse
     */
    @Override
    public CompletableFuture<ModifyApiGroupNetworkPolicyResponse> modifyApiGroupNetworkPolicy(ModifyApiGroupNetworkPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyApiGroupNetworkPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyApiGroupNetworkPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyApiGroupNetworkPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyApiGroupVpcWhitelist  ModifyApiGroupVpcWhitelistRequest
     * @return ModifyApiGroupVpcWhitelistResponse
     */
    @Override
    public CompletableFuture<ModifyApiGroupVpcWhitelistResponse> modifyApiGroupVpcWhitelist(ModifyApiGroupVpcWhitelistRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyApiGroupVpcWhitelist").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyApiGroupVpcWhitelistResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyApiGroupVpcWhitelistResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API callers.</p>
     * <ul>
     * <li>AppName or Description can be modified. If these parameters are not specified, no modifications are made and the operation will directly return a successful response.********</li>
     * <li>The QPS limit on this operation is 50 per user.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyApp  ModifyAppRequest
     * @return ModifyAppResponse
     */
    @Override
    public CompletableFuture<ModifyAppResponse> modifyApp(ModifyAppRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyApp").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyAppResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyAppResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyBackend  ModifyBackendRequest
     * @return ModifyBackendResponse
     */
    @Override
    public CompletableFuture<ModifyBackendResponse> modifyBackend(ModifyBackendRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyBackend").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyBackendResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyBackendResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyBackendModel  ModifyBackendModelRequest
     * @return ModifyBackendModelResponse
     */
    @Override
    public CompletableFuture<ModifyBackendModelResponse> modifyBackendModel(ModifyBackendModelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyBackendModel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyBackendModelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyBackendModelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyDataset  ModifyDatasetRequest
     * @return ModifyDatasetResponse
     */
    @Override
    public CompletableFuture<ModifyDatasetResponse> modifyDataset(ModifyDatasetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDataset").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDatasetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDatasetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyDatasetItem  ModifyDatasetItemRequest
     * @return ModifyDatasetItemResponse
     */
    @Override
    public CompletableFuture<ModifyDatasetItemResponse> modifyDatasetItem(ModifyDatasetItemRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDatasetItem").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDatasetItemResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDatasetItemResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyInstanceAttribute  ModifyInstanceAttributeRequest
     * @return ModifyInstanceAttributeResponse
     */
    @Override
    public CompletableFuture<ModifyInstanceAttributeResponse> modifyInstanceAttribute(ModifyInstanceAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInstanceAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyInstanceAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyInstanceAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyInstanceSpec  ModifyInstanceSpecRequest
     * @return ModifyInstanceSpecResponse
     */
    @Override
    public CompletableFuture<ModifyInstanceSpecResponse> modifyInstanceSpec(ModifyInstanceSpecRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInstanceSpec").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyInstanceSpecResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyInstanceSpecResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyIntranetDomainPolicy  ModifyIntranetDomainPolicyRequest
     * @return ModifyIntranetDomainPolicyResponse
     */
    @Override
    public CompletableFuture<ModifyIntranetDomainPolicyResponse> modifyIntranetDomainPolicy(ModifyIntranetDomainPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyIntranetDomainPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyIntranetDomainPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyIntranetDomainPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API providers.</p>
     * <ul>
     * <li>This operation allows you to modify only the name and description of an ACL. You cannot modify the type of the ACL.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyIpControl  ModifyIpControlRequest
     * @return ModifyIpControlResponse
     */
    @Override
    public CompletableFuture<ModifyIpControlResponse> modifyIpControl(ModifyIpControlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyIpControl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyIpControlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyIpControlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API providers.</p>
     * <ul>
     * <li>The modification immediately takes effect on all the APIs that are bound to the policy.</li>
     * <li>This operation causes a full modification of the content of a policy.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyIpControlPolicyItem  ModifyIpControlPolicyItemRequest
     * @return ModifyIpControlPolicyItemResponse
     */
    @Override
    public CompletableFuture<ModifyIpControlPolicyItemResponse> modifyIpControlPolicyItem(ModifyIpControlPolicyItemRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyIpControlPolicyItem").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyIpControlPolicyItemResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyIpControlPolicyItemResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyLogConfig  ModifyLogConfigRequest
     * @return ModifyLogConfigResponse
     */
    @Override
    public CompletableFuture<ModifyLogConfigResponse> modifyLogConfig(ModifyLogConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyLogConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyLogConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyLogConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyModel  ModifyModelRequest
     * @return ModifyModelResponse
     */
    @Override
    public CompletableFuture<ModifyModelResponse> modifyModel(ModifyModelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyModel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyModelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyModelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API providers.</p>
     * <ul>
     * <li>The name of the plug-in must be unique.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyPlugin  ModifyPluginRequest
     * @return ModifyPluginResponse
     */
    @Override
    public CompletableFuture<ModifyPluginResponse> modifyPlugin(ModifyPluginRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyPlugin").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyPluginResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyPluginResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This API is intended for API providers.</p>
     * <ul>
     * <li>This API operation modifies the name, Key value, and Secret value of an existing signature key.</li>
     * <li>Note that the modification takes effect immediately. If the key has been bound to an API, you must adjust the backend signature verification based on the new key accordingly.</li>
     * <li>The QPS limit on this operation is 50 per user.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifySignature  ModifySignatureRequest
     * @return ModifySignatureResponse
     */
    @Override
    public CompletableFuture<ModifySignatureResponse> modifySignature(ModifySignatureRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifySignature").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifySignatureResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifySignatureResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This API is intended for API providers.</p>
     * <ul>
     * <li>The modifications take effect on the bound APIs instantly.</li>
     * <li>The QPS limit on this operation is 50 per user.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyTrafficControl  ModifyTrafficControlRequest
     * @return ModifyTrafficControlResponse
     */
    @Override
    public CompletableFuture<ModifyTrafficControlResponse> modifyTrafficControl(ModifyTrafficControlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyTrafficControl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyTrafficControlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyTrafficControlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyVpcAccessAndUpdateApis  ModifyVpcAccessAndUpdateApisRequest
     * @return ModifyVpcAccessAndUpdateApisResponse
     */
    @Override
    public CompletableFuture<ModifyVpcAccessAndUpdateApisResponse> modifyVpcAccessAndUpdateApis(ModifyVpcAccessAndUpdateApisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyVpcAccessAndUpdateApis").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyVpcAccessAndUpdateApisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyVpcAccessAndUpdateApisResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of OpenApiGatewayService  OpenApiGatewayServiceRequest
     * @return OpenApiGatewayServiceResponse
     */
    @Override
    public CompletableFuture<OpenApiGatewayServiceResponse> openApiGatewayService(OpenApiGatewayServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OpenApiGatewayService").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OpenApiGatewayServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OpenApiGatewayServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryRequestLogs  QueryRequestLogsRequest
     * @return QueryRequestLogsResponse
     */
    @Override
    public CompletableFuture<QueryRequestLogsResponse> queryRequestLogs(QueryRequestLogsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryRequestLogs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryRequestLogsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryRequestLogsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API providers.</p>
     * <ul>
     * <li>You must solve the problem that is mentioned in the domain name exception prompt before you can reactivate the domain name.</li>
     * <li>A typical reason why a custom domain name becomes abnormal is that the domain name does not have an ICP filing or the domain name is included in a blacklist by the administration. When a custom domain name is abnormal, users cannot use it to call APIs.</li>
     * <li>You can call this operation to reactivate the domain name to resume normal access.</li>
     * </ul>
     * 
     * @param request the request parameters of ReactivateDomain  ReactivateDomainRequest
     * @return ReactivateDomainResponse
     */
    @Override
    public CompletableFuture<ReactivateDomainResponse> reactivateDomain(ReactivateDomainRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReactivateDomain").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReactivateDomainResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReactivateDomainResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RemoveAccessControlListEntry  RemoveAccessControlListEntryRequest
     * @return RemoveAccessControlListEntryResponse
     */
    @Override
    public CompletableFuture<RemoveAccessControlListEntryResponse> removeAccessControlListEntry(RemoveAccessControlListEntryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveAccessControlListEntry").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveAccessControlListEntryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveAccessControlListEntryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RemoveApiProductsAuthorities  RemoveApiProductsAuthoritiesRequest
     * @return RemoveApiProductsAuthoritiesResponse
     */
    @Override
    public CompletableFuture<RemoveApiProductsAuthoritiesResponse> removeApiProductsAuthorities(RemoveApiProductsAuthoritiesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveApiProductsAuthorities").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveApiProductsAuthoritiesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveApiProductsAuthoritiesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API providers and callers.</p>
     * <ul>
     * <li>Before you revoke access permissions, check by whom the permissions were granted. API providers can only revoke permissions granted by a Provider, and API callers can only revoke permissions granted by a Consumer.</li>
     * </ul>
     * 
     * @param request the request parameters of RemoveApisAuthorities  RemoveApisAuthoritiesRequest
     * @return RemoveApisAuthoritiesResponse
     */
    @Override
    public CompletableFuture<RemoveApisAuthoritiesResponse> removeApisAuthorities(RemoveApisAuthoritiesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveApisAuthorities").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveApisAuthoritiesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveApisAuthoritiesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API providers and callers.</p>
     * <ul>
     * <li>Before you revoke access permissions, check by whom the permissions were granted. API providers can only revoke permissions granted by a Provider, and API callers can only revoke permissions granted by a Consumer.</li>
     * </ul>
     * 
     * @param request the request parameters of RemoveAppsAuthorities  RemoveAppsAuthoritiesRequest
     * @return RemoveAppsAuthoritiesResponse
     */
    @Override
    public CompletableFuture<RemoveAppsAuthoritiesResponse> removeAppsAuthorities(RemoveAppsAuthoritiesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveAppsAuthorities").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveAppsAuthoritiesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveAppsAuthoritiesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API callers.</p>
     * <ul>
     * <li>The unbinding takes effect immediately. After the API is unbound from the ACL, the corresponding environment does not have any IP address access control in place for the API.</li>
     * </ul>
     * 
     * @param request the request parameters of RemoveIpControlApis  RemoveIpControlApisRequest
     * @return RemoveIpControlApisResponse
     */
    @Override
    public CompletableFuture<RemoveIpControlApisResponse> removeIpControlApis(RemoveIpControlApisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveIpControlApis").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveIpControlApisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveIpControlApisResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API providers.</p>
     * 
     * @param request the request parameters of RemoveIpControlPolicyItem  RemoveIpControlPolicyItemRequest
     * @return RemoveIpControlPolicyItemResponse
     */
    @Override
    public CompletableFuture<RemoveIpControlPolicyItemResponse> removeIpControlPolicyItem(RemoveIpControlPolicyItemRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveIpControlPolicyItem").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveIpControlPolicyItemResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveIpControlPolicyItemResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This API is intended for API providers.</p>
     * <ul>
     * <li>The operation takes effect immediately. The request sent from API Gateway to the backend service does not contain the signature string. The corresponding verification step can be removed from the backend.</li>
     * </ul>
     * 
     * @param request the request parameters of RemoveSignatureApis  RemoveSignatureApisRequest
     * @return RemoveSignatureApisResponse
     */
    @Override
    public CompletableFuture<RemoveSignatureApisResponse> removeSignatureApis(RemoveSignatureApisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveSignatureApis").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveSignatureApisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveSignatureApisResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This API is intended for API providers.</p>
     * <ul>
     * <li>This API allows you to unbind a specified throttling policy from up to 100 APIs at a time.</li>
     * </ul>
     * 
     * @param request the request parameters of RemoveTrafficControlApis  RemoveTrafficControlApisRequest
     * @return RemoveTrafficControlApisResponse
     */
    @Override
    public CompletableFuture<RemoveTrafficControlApisResponse> removeTrafficControlApis(RemoveTrafficControlApisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveTrafficControlApis").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveTrafficControlApisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveTrafficControlApisResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This API is intended for API providers.</p>
     * <ul>
     * <li>Revokes the permissions of API Gateway to access your VPC instance.<blockquote>
     * <p> Deleting an authorization affects the associated API. Before you delete the authorization, make sure that it is not used by the API.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of RemoveVpcAccess  RemoveVpcAccessRequest
     * @return RemoveVpcAccessResponse
     */
    @Override
    public CompletableFuture<RemoveVpcAccessResponse> removeVpcAccess(RemoveVpcAccessRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveVpcAccess").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveVpcAccessResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveVpcAccessResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RemoveVpcAccessAndAbolishApis  RemoveVpcAccessAndAbolishApisRequest
     * @return RemoveVpcAccessAndAbolishApisResponse
     */
    @Override
    public CompletableFuture<RemoveVpcAccessAndAbolishApisResponse> removeVpcAccessAndAbolishApis(RemoveVpcAccessAndAbolishApisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveVpcAccessAndAbolishApis").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveVpcAccessAndAbolishApisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveVpcAccessAndAbolishApisResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ResetAppCode  ResetAppCodeRequest
     * @return ResetAppCodeResponse
     */
    @Override
    public CompletableFuture<ResetAppCodeResponse> resetAppCode(ResetAppCodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ResetAppCode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResetAppCodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResetAppCodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API callers.</p>
     * <ul>
     * <li>A new secret is automatically generated after you have called this operation. This secret cannot be customized.</li>
     * <li>The results returned by this operation do not contain the application secret. You can obtain the secret by calling DescribeAppSecurity.</li>
     * </ul>
     * 
     * @param request the request parameters of ResetAppSecret  ResetAppSecretRequest
     * @return ResetAppSecretResponse
     */
    @Override
    public CompletableFuture<ResetAppSecretResponse> resetAppSecret(ResetAppSecretRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ResetAppSecret").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResetAppSecretResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResetAppSecretResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SdkGenerateByApp  SdkGenerateByAppRequest
     * @return SdkGenerateByAppResponse
     */
    @Override
    public CompletableFuture<SdkGenerateByAppResponse> sdkGenerateByApp(SdkGenerateByAppRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SdkGenerateByApp").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SdkGenerateByAppResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SdkGenerateByAppResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SdkGenerateByAppForRegion  SdkGenerateByAppForRegionRequest
     * @return SdkGenerateByAppForRegionResponse
     */
    @Override
    public CompletableFuture<SdkGenerateByAppForRegionResponse> sdkGenerateByAppForRegion(SdkGenerateByAppForRegionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SdkGenerateByAppForRegion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SdkGenerateByAppForRegionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SdkGenerateByAppForRegionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SdkGenerateByGroup  SdkGenerateByGroupRequest
     * @return SdkGenerateByGroupResponse
     */
    @Override
    public CompletableFuture<SdkGenerateByGroupResponse> sdkGenerateByGroup(SdkGenerateByGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SdkGenerateByGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SdkGenerateByGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SdkGenerateByGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetAccessControlListAttribute  SetAccessControlListAttributeRequest
     * @return SetAccessControlListAttributeResponse
     */
    @Override
    public CompletableFuture<SetAccessControlListAttributeResponse> setAccessControlListAttribute(SetAccessControlListAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetAccessControlListAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetAccessControlListAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetAccessControlListAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetApiProductsAuthorities  SetApiProductsAuthoritiesRequest
     * @return SetApiProductsAuthoritiesResponse
     */
    @Override
    public CompletableFuture<SetApiProductsAuthoritiesResponse> setApiProductsAuthorities(SetApiProductsAuthoritiesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetApiProductsAuthorities").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetApiProductsAuthoritiesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetApiProductsAuthoritiesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API providers and callers.</p>
     * <ul>
     * <li>API providers can authorize all applications to call their APIs.</li>
     * <li>API callers can authorize their own applications to call the APIs that they have purchased.</li>
     * </ul>
     * 
     * @param request the request parameters of SetApisAuthorities  SetApisAuthoritiesRequest
     * @return SetApisAuthoritiesResponse
     */
    @Override
    public CompletableFuture<SetApisAuthoritiesResponse> setApisAuthorities(SetApisAuthoritiesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetApisAuthorities").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetApisAuthoritiesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetApisAuthoritiesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetAppsAuthToApiProduct  SetAppsAuthToApiProductRequest
     * @return SetAppsAuthToApiProductResponse
     */
    @Override
    public CompletableFuture<SetAppsAuthToApiProductResponse> setAppsAuthToApiProduct(SetAppsAuthToApiProductRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetAppsAuthToApiProduct").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetAppsAuthToApiProductResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetAppsAuthToApiProductResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API providers and callers.</p>
     * <ul>
     * <li>API providers can authorize all applications to call their APIs.</li>
     * <li>API callers can authorize their own applications to call the APIs that they have purchased.</li>
     * </ul>
     * 
     * @param request the request parameters of SetAppsAuthorities  SetAppsAuthoritiesRequest
     * @return SetAppsAuthoritiesResponse
     */
    @Override
    public CompletableFuture<SetAppsAuthoritiesResponse> setAppsAuthorities(SetAppsAuthoritiesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetAppsAuthorities").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetAppsAuthoritiesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetAppsAuthoritiesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetDomain  SetDomainRequest
     * @return SetDomainResponse
     */
    @Override
    public CompletableFuture<SetDomainResponse> setDomain(SetDomainRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetDomain").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetDomainResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetDomainResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API providers.</p>
     * <ul>
     * <li>The SSL certificate must match the custom domain name.</li>
     * <li>After the SSL certificate is bound, HTTPS-based API services become available.</li>
     * </ul>
     * 
     * @param request the request parameters of SetDomainCertificate  SetDomainCertificateRequest
     * @return SetDomainCertificateResponse
     */
    @Override
    public CompletableFuture<SetDomainCertificateResponse> setDomainCertificate(SetDomainCertificateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetDomainCertificate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetDomainCertificateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetDomainCertificateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetDomainWebSocketStatus  SetDomainWebSocketStatusRequest
     * @return SetDomainWebSocketStatusResponse
     */
    @Override
    public CompletableFuture<SetDomainWebSocketStatusResponse> setDomainWebSocketStatus(SetDomainWebSocketStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetDomainWebSocketStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetDomainWebSocketStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetDomainWebSocketStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetGroupAuthAppCode  SetGroupAuthAppCodeRequest
     * @return SetGroupAuthAppCodeResponse
     */
    @Override
    public CompletableFuture<SetGroupAuthAppCodeResponse> setGroupAuthAppCode(SetGroupAuthAppCodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetGroupAuthAppCode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetGroupAuthAppCodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetGroupAuthAppCodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API callers.</p>
     * <ul>
     * <li>A maximum of 100 APIs can be bound at a time.</li>
     * </ul>
     * 
     * @param request the request parameters of SetIpControlApis  SetIpControlApisRequest
     * @return SetIpControlApisResponse
     */
    @Override
    public CompletableFuture<SetIpControlApisResponse> setIpControlApis(SetIpControlApisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetIpControlApis").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetIpControlApisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetIpControlApisResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetSignatureApis  SetSignatureApisRequest
     * @return SetSignatureApisResponse
     */
    @Override
    public CompletableFuture<SetSignatureApisResponse> setSignatureApis(SetSignatureApisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetSignatureApis").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetSignatureApisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetSignatureApisResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This API is intended for API providers.</p>
     * <ul>
     * <li>This API allows you to bind a specific throttling policy to up to 100 APIs at a time.</li>
     * </ul>
     * 
     * @param request the request parameters of SetTrafficControlApis  SetTrafficControlApisRequest
     * @return SetTrafficControlApisResponse
     */
    @Override
    public CompletableFuture<SetTrafficControlApisResponse> setTrafficControlApis(SetTrafficControlApisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetTrafficControlApis").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetTrafficControlApisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetTrafficControlApisResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation is intended for API providers.</p>
     * <ul>
     * <li>This operation is used to authorize API Gateway to access your VPC instance.</li>
     * </ul>
     * 
     * @param request the request parameters of SetVpcAccess  SetVpcAccessRequest
     * @return SetVpcAccessResponse
     */
    @Override
    public CompletableFuture<SetVpcAccessResponse> setVpcAccess(SetVpcAccessRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetVpcAccess").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetVpcAccessResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetVpcAccessResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetWildcardDomainPatterns  SetWildcardDomainPatternsRequest
     * @return SetWildcardDomainPatternsResponse
     */
    @Override
    public CompletableFuture<SetWildcardDomainPatternsResponse> setWildcardDomainPatterns(SetWildcardDomainPatternsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetWildcardDomainPatterns").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetWildcardDomainPatternsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetWildcardDomainPatternsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SwitchApi  SwitchApiRequest
     * @return SwitchApiResponse
     */
    @Override
    public CompletableFuture<SwitchApiResponse> switchApi(SwitchApiRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SwitchApi").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SwitchApiResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SwitchApiResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  All tags (key-value pairs) are applied to all resources of a specified ResourceId, with each resource specified as ResourceId.N.</p>
     * <ul>
     * <li>Tag.N is a resource tag consisting of a key-value pair: Tag.N.Key and Tag.N.Value.</li>
     * <li>If you call this operation to tag multiple resources simultaneously, either all or none of the resources will be tagged.</li>
     * <li>If you specify Tag.1.Value in addition to required parameters, you must also specify Tag.1.Key. Otherwise, an InvalidParameter.TagKey error is reported. A tag that has a value must have the corresponding key, but the key can be an empty string.</li>
     * <li>If a tag with the same key has been bound to a resource, the new tag will overwrite the existing one.</li>
     * </ul>
     * 
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    @Override
    public CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TagResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  If you call this operation to untag multiple resources simultaneously, either all or none of the resources will be untagged.</p>
     * <ul>
     * <li>If you specify resource IDs without specifying tag keys and set the All parameter to true, all tags bound to the specified resources will be deleted. If a resource does not have any tags, the request is not processed but a success is returned.</li>
     * <li>If you specify resource IDs without specifying tag keys and set the All parameter to false, the request is not processed but a success is returned.</li>
     * <li>When tag keys are specified, the All parameter is invalid.</li>
     * <li>When multiple resources and key-value pairs are specified, the specified tags bound to the resources are deleted.</li>
     * </ul>
     * 
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    @Override
    public CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UntagResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UntagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UntagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdatePrivateDNS  UpdatePrivateDNSRequest
     * @return UpdatePrivateDNSResponse
     */
    @Override
    public CompletableFuture<UpdatePrivateDNSResponse> updatePrivateDNS(UpdatePrivateDNSRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdatePrivateDNS").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdatePrivateDNSResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdatePrivateDNSResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ValidateVpcConnectivity  ValidateVpcConnectivityRequest
     * @return ValidateVpcConnectivityResponse
     */
    @Override
    public CompletableFuture<ValidateVpcConnectivityResponse> validateVpcConnectivity(ValidateVpcConnectivityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ValidateVpcConnectivity").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ValidateVpcConnectivityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ValidateVpcConnectivityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
