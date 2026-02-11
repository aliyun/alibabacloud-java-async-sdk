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
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <ul>
     * <li>This interface is used for customers to create a modeling project for the first time.</li>
     * <li><code>projectName</code> is a required field, with a maximum length of 50 characters.</li>
     * <li><code>remark</code> and <code>instanceSpec</code> are optional, where <code>remark</code> has a maximum length of 200 characters.</li>
     * <li>The available values for <code>instanceSpec</code> include <code>SECURE_ENV_LITE</code> and <code>SECURE_ENV_PRO</code>.</li>
     * </ul>
     * 
     * @param request the request parameters of ApplyBastionAccount  ApplyBastionAccountRequest
     * @return ApplyBastionAccountResponse
     */
    @Override
    public CompletableFuture<ApplyBastionAccountResponse> applyBastionAccount(ApplyBastionAccountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ApplyBastionAccount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ApplyBastionAccountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ApplyBastionAccountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>本接口用于客户首次创建建模项目。</li>
     * <li><code>projectName</code> 是必填项，长度不超过50个字符。</li>
     * <li><code>remark</code> 和 <code>instanceSpec</code> 为可选项，其中 <code>remark</code> 长度不超过200个字符。</li>
     * <li><code>instanceSpec</code> 可选值包括 <code>SECURE_ENV_LITE</code> 和 <code>SECURE_ENV_PRO</code>。</li>
     * </ul>
     * 
     * @param request the request parameters of AssociatePocTask  AssociatePocTaskRequest
     * @return AssociatePocTaskResponse
     */
    @Override
    public CompletableFuture<AssociatePocTaskResponse> associatePocTask(AssociatePocTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AssociatePocTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AssociatePocTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AssociatePocTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>本接口用于客户首次创建建模项目。</li>
     * <li><code>projectName</code> 是必填项，长度不超过50个字符。</li>
     * <li><code>remark</code> 和 <code>instanceSpec</code> 为可选项，其中 <code>remark</code> 长度不超过200个字符。</li>
     * <li><code>instanceSpec</code> 可选值包括 <code>SECURE_ENV_LITE</code> 和 <code>SECURE_ENV_PRO</code>。</li>
     * </ul>
     * 
     * @param request the request parameters of CompleteModelingProject  CompleteModelingProjectRequest
     * @return CompleteModelingProjectResponse
     */
    @Override
    public CompletableFuture<CompleteModelingProjectResponse> completeModelingProject(CompleteModelingProjectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CompleteModelingProject").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CompleteModelingProjectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CompleteModelingProjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
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
     * <ul>
     * <li>This interface is used for customers to create a modeling project for the first time.</li>
     * <li><code>projectName</code> is a required field, with a maximum length of 50 characters.</li>
     * <li><code>remark</code> and <code>instanceSpec</code> are optional, where <code>remark</code> has a maximum length of 200 characters.</li>
     * <li>The available values for <code>instanceSpec</code> include <code>SECURE_ENV_LITE</code> and <code>SECURE_ENV_PRO</code>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateModelingProject  CreateModelingProjectRequest
     * @return CreateModelingProjectResponse
     */
    @Override
    public CompletableFuture<CreateModelingProjectResponse> createModelingProject(CreateModelingProjectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateModelingProject").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateModelingProjectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateModelingProjectResponse> future = new CompletableFuture<>();
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>本接口用于客户首次创建建模项目。</li>
     * <li><code>projectName</code> 是必填项，长度不超过50个字符。</li>
     * <li><code>remark</code> 和 <code>instanceSpec</code> 为可选项，其中 <code>remark</code> 长度不超过200个字符。</li>
     * <li><code>instanceSpec</code> 可选值包括 <code>SECURE_ENV_LITE</code> 和 <code>SECURE_ENV_PRO</code>。</li>
     * </ul>
     * 
     * @param request the request parameters of DeployModelFile  DeployModelFileRequest
     * @return DeployModelFileResponse
     */
    @Override
    public CompletableFuture<DeployModelFileResponse> deployModelFile(DeployModelFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeployModelFile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeployModelFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeployModelFileResponse> future = new CompletableFuture<>();
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
     * <h2>Request Description</h2>
     * <p>By providing the <code>customerModuleId</code> parameter, you can query the current status of a specified customer model. The status values may include, but are not limited to, &quot;EDIT&quot;, &quot;ONLINE&quot;, etc.</p>
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
     * <h2>Request Description</h2>
     * <p>By providing the <code>customerModuleId</code> parameter, you can query the current status of a specified customer model. The status values may include but are not limited to &quot;EDIT&quot;, &quot;ONLINE&quot;, etc.</p>
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
     * <h2>Request Description</h2>
     * <ul>
     * <li>This interface is used to query all available feature templates in the system.</li>
     * <li>The request method is GET, and no additional parameters are required.</li>
     * <li>The returned result includes multiple feature template options, each of which includes a label (label) and a value (value).</li>
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
     * <h2>Request Description</h2>
     * <ul>
     * <li>This interface is used to query all available feature templates in the system.</li>
     * <li>The request method is GET, and no additional parameters are required.</li>
     * <li>The returned result includes multiple feature template options, each of which consists of a label (label) and a value (value).</li>
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
     * <li>本接口用于客户首次创建建模项目。</li>
     * <li><code>projectName</code> 是必填项，长度不超过50个字符。</li>
     * <li><code>remark</code> 和 <code>instanceSpec</code> 为可选项，其中 <code>remark</code> 长度不超过200个字符。</li>
     * <li><code>instanceSpec</code> 可选值包括 <code>SECURE_ENV_LITE</code> 和 <code>SECURE_ENV_PRO</code>。</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeFileDownloadUrl  DescribeFileDownloadUrlRequest
     * @return DescribeFileDownloadUrlResponse
     */
    @Override
    public CompletableFuture<DescribeFileDownloadUrlResponse> describeFileDownloadUrl(DescribeFileDownloadUrlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeFileDownloadUrl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeFileDownloadUrlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeFileDownloadUrlResponse> future = new CompletableFuture<>();
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
     * <li>The returned result includes multiple feature template options, each including a label (label) and value (value).</li>
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
     * <ul>
     * <li>本接口用于客户首次创建建模项目。</li>
     * <li><code>projectName</code> 是必填项，长度不超过50个字符。</li>
     * <li><code>remark</code> 和 <code>instanceSpec</code> 为可选项，其中 <code>remark</code> 长度不超过200个字符。</li>
     * <li><code>instanceSpec</code> 可选值包括 <code>SECURE_ENV_LITE</code> 和 <code>SECURE_ENV_PRO</code>。</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeModelingProjectDetail  DescribeModelingProjectDetailRequest
     * @return DescribeModelingProjectDetailResponse
     */
    @Override
    public CompletableFuture<DescribeModelingProjectDetailResponse> describeModelingProjectDetail(DescribeModelingProjectDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeModelingProjectDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeModelingProjectDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeModelingProjectDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API用于获取指定租户下的所有建模项目的概览信息。</li>
     * <li>支持通过<code>pageSize</code>和<code>currentPage</code>参数进行分页查询，默认每页显示10条记录。</li>
     * <li>可选地，使用<code>status</code>参数来过滤特定状态（如<code>active</code>, <code>released</code>等）的项目。</li>
     * <li>返回结果中包含每个项目的ID、名称、环境状态、建模状态、开始时间及结束时间（如果有的话），以及创建该项目的登录账号。</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeModelingProjectList  DescribeModelingProjectListRequest
     * @return DescribeModelingProjectListResponse
     */
    @Override
    public CompletableFuture<DescribeModelingProjectListResponse> describeModelingProjectList(DescribeModelingProjectListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeModelingProjectList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeModelingProjectListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeModelingProjectListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <p>This interface is used to check whether a specific model service exists by providing the <code>customerModuleId</code>. If it exists, it returns <code>true</code>; otherwise, it returns <code>false</code>.</p>
     * <h3>Notes</h3>
     * <ul>
     * <li><code>customerModuleId</code> is a required parameter and must be of string type.</li>
     * <li>This API is mainly used for front-end page display or logical judgment to confirm whether the service corresponding to the user\&quot;s selected model has been created.</li>
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
     * <h2>Request Description</h2>
     * <p>By providing the <code>customerModuleId</code> parameter, you can query the current status of a specified customer model. The status values may include, but are not limited to, &quot;EDIT&quot;, &quot;ONLINE&quot;, etc.</p>
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
     * @param request the request parameters of DescribePocTaskList  DescribePocTaskListRequest
     * @return DescribePocTaskListResponse
     */
    @Override
    public CompletableFuture<DescribePocTaskListResponse> describePocTaskList(DescribePocTaskListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePocTaskList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePocTaskListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePocTaskListResponse> future = new CompletableFuture<>();
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
     * <h2>Request Description</h2>
     * <p>This API is used to query all model information under a specific user and supports pagination through page parameters. Fuzzy search can be performed using the <code>name</code> parameter.</p>
     * <ul>
     * <li><code>regId</code>: Region identifier, required.</li>
     * <li><code>pageSize</code>: Number of items per page, required.</li>
     * <li><code>currentPage</code>: Current page number, starting from 1, required.</li>
     * <li><code>userId</code>: User ID, required.</li>
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
     * <h2>Request Description</h2>
     * <p>This API is used to delete a specified customer model from the system. When calling, you must provide the <code>customerModuleId</code> parameter, which identifies the specific model to be deleted.</p>
     * <ul>
     * <li><strong>Note</strong>: The deletion operation is irreversible, please use with caution.</li>
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
     * <ul>
     * <li>本接口用于客户首次创建建模项目。</li>
     * <li><code>projectName</code> 是必填项，长度不超过50个字符。</li>
     * <li><code>remark</code> 和 <code>instanceSpec</code> 为可选项，其中 <code>remark</code> 长度不超过200个字符。</li>
     * <li><code>instanceSpec</code> 可选值包括 <code>SECURE_ENV_LITE</code> 和 <code>SECURE_ENV_PRO</code>。</li>
     * </ul>
     * 
     * @param request the request parameters of GetBastionHostCertification  GetBastionHostCertificationRequest
     * @return GetBastionHostCertificationResponse
     */
    @Override
    public CompletableFuture<GetBastionHostCertificationResponse> getBastionHostCertification(GetBastionHostCertificationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetBastionHostCertification").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetBastionHostCertificationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetBastionHostCertificationResponse> future = new CompletableFuture<>();
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
     * <h2>Request Description</h2>
     * <p>This API is used to delete a specified customer model from the system. When calling, you must provide the <code>customerModuleId</code> parameter, which identifies the specific model to be deleted.</p>
     * <ul>
     * <li><strong>Note</strong>: Deletion is irreversible, please use with caution.</li>
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
     * <h2>Request Description</h2>
     * <ul>
     * <li>This interface is used to query all available feature templates in the system.</li>
     * <li>The request method is GET, and no additional parameters are required.</li>
     * <li>The returned result includes multiple feature template options, each of which includes a label (label) and a value (value).</li>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>本接口用于客户首次创建建模项目。</li>
     * <li><code>projectName</code> 是必填项，长度不超过50个字符。</li>
     * <li><code>remark</code> 和 <code>instanceSpec</code> 为可选项，其中 <code>remark</code> 长度不超过200个字符。</li>
     * <li><code>instanceSpec</code> 可选值包括 <code>SECURE_ENV_LITE</code> 和 <code>SECURE_ENV_PRO</code>。</li>
     * </ul>
     * 
     * @param request the request parameters of RequestModelFileSync  RequestModelFileSyncRequest
     * @return RequestModelFileSyncResponse
     */
    @Override
    public CompletableFuture<RequestModelFileSyncResponse> requestModelFileSync(RequestModelFileSyncRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RequestModelFileSync").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RequestModelFileSyncResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RequestModelFileSyncResponse> future = new CompletableFuture<>();
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
     * <h2>Request Description</h2>
     * <ul>
     * <li>This interface is used to query all available feature templates in the system.</li>
     * <li>The request method is GET, and no additional parameters are required.</li>
     * <li>The returned result includes multiple feature template options, each of which includes a label (label) and a value (value).</li>
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
     * <h2>Request Description</h2>
     * <ul>
     * <li>This interface is used to query all available feature templates in the system.</li>
     * <li>The request method is GET, and no additional parameters are required.</li>
     * <li>The returned result includes multiple feature template options, each of which includes a label (label) and a value (value).</li>
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
     * <h2>Request Description</h2>
     * <ul>
     * <li>This interface is used to query all available feature templates in the system.</li>
     * <li>The request method is GET, and no additional parameters are required.</li>
     * <li>The returned result includes multiple feature template options, each of which includes a label (label) and a value (value).</li>
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
