// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.safconsole20250521;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.safconsole20250521.models.*;
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
        this.product = "safconsole";
        this.version = "2025-05-21";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of CreateCustomerModuleBasicInfo  CreateCustomerModuleBasicInfoRequest
     * @return CreateCustomerModuleBasicInfoResponse
     */
    @Override
    public CompletableFuture<CreateCustomerModuleBasicInfoResponse> createCustomerModuleBasicInfo(CreateCustomerModuleBasicInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateCustomerModuleBasicInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCustomerModuleBasicInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCustomerModuleBasicInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <ul>
     * <li>This interface is used to query all available feature templates in the system.</li>
     * <li>The request method is GET, and no additional parameters are required.</li>
     * <li>The returned result includes multiple feature template options, each option including a label (label) and value (value).</li>
     * </ul>
     * 
     * @param request the request parameters of CreateCustomerModuleMetaInfo  CreateCustomerModuleMetaInfoRequest
     * @return CreateCustomerModuleMetaInfoResponse
     */
    @Override
    public CompletableFuture<CreateCustomerModuleMetaInfoResponse> createCustomerModuleMetaInfo(CreateCustomerModuleMetaInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateCustomerModuleMetaInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCustomerModuleMetaInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCustomerModuleMetaInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateCustomerModuleOutputInfo  CreateCustomerModuleOutputInfoRequest
     * @return CreateCustomerModuleOutputInfoResponse
     */
    @Override
    public CompletableFuture<CreateCustomerModuleOutputInfoResponse> createCustomerModuleOutputInfo(CreateCustomerModuleOutputInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateCustomerModuleOutputInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCustomerModuleOutputInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCustomerModuleOutputInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <p>This API is used to delete a specified customer model from the system. When calling, you must provide the <code>customerModuleId</code> parameter, which identifies the specific model to be deleted.</p>
     * <ul>
     * <li><strong>Note</strong>: Deletion is irreversible, please use with caution.</li>
     * </ul>
     * 
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
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <p>By providing the <code>customerModuleId</code> parameter, you can query the current status of a specified customer model. The status values may include but are not limited to &quot;EDIT&quot;, &quot;ONLINE&quot;, etc.</p>
     * 
     * @param request the request parameters of DescribeCustomerModuleBasicInfo  DescribeCustomerModuleBasicInfoRequest
     * @return DescribeCustomerModuleBasicInfoResponse
     */
    @Override
    public CompletableFuture<DescribeCustomerModuleBasicInfoResponse> describeCustomerModuleBasicInfo(DescribeCustomerModuleBasicInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCustomerModuleBasicInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCustomerModuleBasicInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCustomerModuleBasicInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <p>通过提供<code>customerModuleId</code>参数，可以查询指定客户模型的当前状态。状态值可能包括但不限于&quot;EDIT&quot;、&quot;ONLINE&quot;等。</p>
     * 
     * @param request the request parameters of DescribeCustomerModuleMetaInfo  DescribeCustomerModuleMetaInfoRequest
     * @return DescribeCustomerModuleMetaInfoResponse
     */
    @Override
    public CompletableFuture<DescribeCustomerModuleMetaInfoResponse> describeCustomerModuleMetaInfo(DescribeCustomerModuleMetaInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCustomerModuleMetaInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCustomerModuleMetaInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCustomerModuleMetaInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <p>通过提供<code>customerModuleId</code>参数，可以查询指定客户模型的当前状态。状态值可能包括但不限于&quot;EDIT&quot;、&quot;ONLINE&quot;等。</p>
     * 
     * @param request the request parameters of DescribeCustomerModuleOutputInfo  DescribeCustomerModuleOutputInfoRequest
     * @return DescribeCustomerModuleOutputInfoResponse
     */
    @Override
    public CompletableFuture<DescribeCustomerModuleOutputInfoResponse> describeCustomerModuleOutputInfo(DescribeCustomerModuleOutputInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCustomerModuleOutputInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCustomerModuleOutputInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCustomerModuleOutputInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询系统中所有可用的特征模板。</li>
     * <li>请求方式为 GET，无需提供额外参数。</li>
     * <li>返回结果包含多个特征模板选项，每个选项包括标签（label）和值（value）。</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeFeatureOption  DescribeFeatureOptionRequest
     * @return DescribeFeatureOptionResponse
     */
    @Override
    public CompletableFuture<DescribeFeatureOptionResponse> describeFeatureOption(DescribeFeatureOptionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeFeatureOption").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeFeatureOptionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeFeatureOptionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询系统中所有可用的特征模板。</li>
     * <li>请求方式为 GET，无需提供额外参数。</li>
     * <li>返回结果包含多个特征模板选项，每个选项包括标签（label）和值（value）。</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeFeatureTemplateList  DescribeFeatureTemplateListRequest
     * @return DescribeFeatureTemplateListResponse
     */
    @Override
    public CompletableFuture<DescribeFeatureTemplateListResponse> describeFeatureTemplateList(DescribeFeatureTemplateListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeFeatureTemplateList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeFeatureTemplateListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeFeatureTemplateListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询系统中所有可用的特征模板。</li>
     * <li>请求方式为 GET，无需提供额外参数。</li>
     * <li>返回结果包含多个特征模板选项，每个选项包括标签（label）和值（value）。</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeModelFeature  DescribeModelFeatureRequest
     * @return DescribeModelFeatureResponse
     */
    @Override
    public CompletableFuture<DescribeModelFeatureResponse> describeModelFeature(DescribeModelFeatureRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeModelFeature").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeModelFeatureResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeModelFeatureResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeModelOssToken  DescribeModelOssTokenRequest
     * @return DescribeModelOssTokenResponse
     */
    @Override
    public CompletableFuture<DescribeModelOssTokenResponse> describeModelOssToken(DescribeModelOssTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeModelOssToken").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeModelOssTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeModelOssTokenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <p>该接口用于通过提供的<code>customerModuleId</code>来检查特定的模型服务是否已经存在。如果存在，则返回<code>true</code>；反之则返回<code>false</code>。</p>
     * <h3>注意事项</h3>
     * <ul>
     * <li><code>customerModuleId</code>是必须提供的参数，且为字符串类型。</li>
     * <li>此API主要用于前端页面展示或逻辑判断时使用，以确认用户所选模型是否有对应的服务被创建。</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeModuleServiceExist  DescribeModuleServiceExistRequest
     * @return DescribeModuleServiceExistResponse
     */
    @Override
    public CompletableFuture<DescribeModuleServiceExistResponse> describeModuleServiceExist(DescribeModuleServiceExistRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeModuleServiceExist").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeModuleServiceExistResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeModuleServiceExistResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <p>通过提供<code>customerModuleId</code>参数，可以查询指定客户模型的当前状态。状态值可能包括但不限于&quot;EDIT&quot;、&quot;ONLINE&quot;等。</p>
     * 
     * @param request the request parameters of DescribeModuleStatus  DescribeModuleStatusRequest
     * @return DescribeModuleStatusResponse
     */
    @Override
    public CompletableFuture<DescribeModuleStatusResponse> describeModuleStatus(DescribeModuleStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeModuleStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeModuleStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeModuleStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSafRmmpOrder  DescribeSafRmmpOrderRequest
     * @return DescribeSafRmmpOrderResponse
     */
    @Override
    public CompletableFuture<DescribeSafRmmpOrderResponse> describeSafRmmpOrder(DescribeSafRmmpOrderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSafRmmpOrder").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSafRmmpOrderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSafRmmpOrderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeServiceAndScene  DescribeServiceAndSceneRequest
     * @return DescribeServiceAndSceneResponse
     */
    @Override
    public CompletableFuture<DescribeServiceAndSceneResponse> describeServiceAndScene(DescribeServiceAndSceneRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeServiceAndScene").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeServiceAndSceneResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeServiceAndSceneResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <p>该 API 用于查询特定用户下的所有模型信息，并支持通过分页参数进行分页查询。可以通过 <code>name</code> 参数进行模糊搜索。</p>
     * <ul>
     * <li><code>regId</code>: 地域标识，必填。</li>
     * <li><code>pageSize</code>: 每页显示的条目数，必填。</li>
     * <li><code>currentPage</code>: 当前页码，从1开始计数，必填。</li>
     * <li><code>userId</code>: 用户ID，必填。</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeUserModelList  DescribeUserModelListRequest
     * @return DescribeUserModelListResponse
     */
    @Override
    public CompletableFuture<DescribeUserModelListResponse> describeUserModelList(DescribeUserModelListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeUserModelList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeUserModelListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeUserModelListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <p>本API用于从系统中删除指定的客户模型。调用时必须提供<code>customerModuleId</code>参数，该参数标识了要删除的具体模型。</p>
     * <ul>
     * <li><strong>注意</strong>：删除操作不可逆，请谨慎使用。</li>
     * </ul>
     * 
     * @param request the request parameters of DuplicateModel  DuplicateModelRequest
     * @return DuplicateModelResponse
     */
    @Override
    public CompletableFuture<DuplicateModelResponse> duplicateModel(DuplicateModelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DuplicateModel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DuplicateModelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DuplicateModelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EditModel  EditModelRequest
     * @return EditModelResponse
     */
    @Override
    public CompletableFuture<EditModelResponse> editModel(EditModelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EditModel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EditModelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EditModelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <p>本API用于从系统中删除指定的客户模型。调用时必须提供<code>customerModuleId</code>参数，该参数标识了要删除的具体模型。</p>
     * <ul>
     * <li><strong>注意</strong>：删除操作不可逆，请谨慎使用。</li>
     * </ul>
     * 
     * @param request the request parameters of IterateModel  IterateModelRequest
     * @return IterateModelResponse
     */
    @Override
    public CompletableFuture<IterateModelResponse> iterateModel(IterateModelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("IterateModel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(IterateModelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<IterateModelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of OfflineModel  OfflineModelRequest
     * @return OfflineModelResponse
     */
    @Override
    public CompletableFuture<OfflineModelResponse> offlineModel(OfflineModelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OfflineModel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OfflineModelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OfflineModelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <p>本API用于从系统中删除指定的客户模型。调用时必须提供<code>customerModuleId</code>参数，该参数标识了要删除的具体模型。</p>
     * <ul>
     * <li><strong>注意</strong>：删除操作不可逆，请谨慎使用。</li>
     * </ul>
     * 
     * @param request the request parameters of OnlineModel  OnlineModelRequest
     * @return OnlineModelResponse
     */
    @Override
    public CompletableFuture<OnlineModelResponse> onlineModel(OnlineModelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OnlineModel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OnlineModelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OnlineModelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询系统中所有可用的特征模板。</li>
     * <li>请求方式为 GET，无需提供额外参数。</li>
     * <li>返回结果包含多个特征模板选项，每个选项包括标签（label）和值（value）。</li>
     * </ul>
     * 
     * @param request the request parameters of ParseExpressionParameters  ParseExpressionParametersRequest
     * @return ParseExpressionParametersResponse
     */
    @Override
    public CompletableFuture<ParseExpressionParametersResponse> parseExpressionParameters(ParseExpressionParametersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ParseExpressionParameters").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ParseExpressionParametersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ParseExpressionParametersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PrepublishModel  PrepublishModelRequest
     * @return PrepublishModelResponse
     */
    @Override
    public CompletableFuture<PrepublishModelResponse> prepublishModel(PrepublishModelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PrepublishModel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PrepublishModelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PrepublishModelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <p>This API is used to delete a specified customer model from the system. When calling, you must provide the <code>customerModuleId</code> parameter, which identifies the specific model to be deleted.</p>
     * <ul>
     * <li><strong>Note</strong>: The deletion operation is irreversible, please use with caution.</li>
     * </ul>
     * 
     * @param request the request parameters of RollbackModel  RollbackModelRequest
     * @return RollbackModelResponse
     */
    @Override
    public CompletableFuture<RollbackModelResponse> rollbackModel(RollbackModelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RollbackModel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RollbackModelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RollbackModelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询系统中所有可用的特征模板。</li>
     * <li>请求方式为 GET，无需提供额外参数。</li>
     * <li>返回结果包含多个特征模板选项，每个选项包括标签（label）和值（value）。</li>
     * </ul>
     * 
     * @param request the request parameters of TestModel  TestModelRequest
     * @return TestModelResponse
     */
    @Override
    public CompletableFuture<TestModelResponse> testModel(TestModelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TestModel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TestModelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TestModelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询系统中所有可用的特征模板。</li>
     * <li>请求方式为 GET，无需提供额外参数。</li>
     * <li>返回结果包含多个特征模板选项，每个选项包括标签（label）和值（value）。</li>
     * </ul>
     * 
     * @param request the request parameters of TestPreModel  TestPreModelRequest
     * @return TestPreModelResponse
     */
    @Override
    public CompletableFuture<TestPreModelResponse> testPreModel(TestPreModelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TestPreModel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TestPreModelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TestPreModelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询系统中所有可用的特征模板。</li>
     * <li>请求方式为 GET，无需提供额外参数。</li>
     * <li>返回结果包含多个特征模板选项，每个选项包括标签（label）和值（value）。</li>
     * </ul>
     * 
     * @param request the request parameters of TestProcessExpression  TestProcessExpressionRequest
     * @return TestProcessExpressionResponse
     */
    @Override
    public CompletableFuture<TestProcessExpressionResponse> testProcessExpression(TestProcessExpressionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TestProcessExpression").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TestProcessExpressionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TestProcessExpressionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateModuleBasicInfo  UpdateModuleBasicInfoRequest
     * @return UpdateModuleBasicInfoResponse
     */
    @Override
    public CompletableFuture<UpdateModuleBasicInfoResponse> updateModuleBasicInfo(UpdateModuleBasicInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateModuleBasicInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateModuleBasicInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateModuleBasicInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ValidateModelFile  ValidateModelFileRequest
     * @return ValidateModelFileResponse
     */
    @Override
    public CompletableFuture<ValidateModelFileResponse> validateModelFile(ValidateModelFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ValidateModelFile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ValidateModelFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ValidateModelFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ValidateTestFile  ValidateTestFileRequest
     * @return ValidateTestFileResponse
     */
    @Override
    public CompletableFuture<ValidateTestFileResponse> validateTestFile(ValidateTestFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ValidateTestFile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ValidateTestFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ValidateTestFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
