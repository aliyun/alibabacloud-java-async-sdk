// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.vod20170321.models.*;
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
        this.product = "vod";
        this.version = "2017-03-21";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("cn-hangzhou", "vod.cn-shanghai.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "vod.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "vod.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "vod.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "vod.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "vod.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "vod.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "vod.aliyuncs.com"),
            new TeaPair("cn-chengdu", "vod.aliyuncs.com"),
            new TeaPair("cn-edge-1", "vod.aliyuncs.com"),
            new TeaPair("cn-fujian", "vod.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "vod.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "vod.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "vod.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "vod.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "vod.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "vod.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "vod.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "vod.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "vod.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "vod.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "vod.aliyuncs.com"),
            new TeaPair("cn-qingdao", "vod.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "vod.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "vod.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "vod.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "vod.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "vod.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "vod.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "vod.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "vod.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "vod.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "vod.aliyuncs.com"),
            new TeaPair("cn-wuhan", "vod.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "vod.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "vod.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "vod.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "vod.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "vod.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "vod.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "vod.aliyuncs.com"),
            new TeaPair("me-east-1", "vod.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "vod.aliyuncs.com"),
            new TeaPair("us-east-1", "vod.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * <b>description</b> :
     * <p>  Regions that support this operation: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</p>
     * <ul>
     * <li>Before you add an AI template for automated review and smart thumbnail tasks, make sure that <a href="https://ai.aliyun.com/vi/censor">automated review</a> and <a href="https://ai.aliyun.com/vi/cover">smart thumbnail</a> are enabled.</li>
     * </ul>
     * 
     * @param request the request parameters of AddAITemplate  AddAITemplateRequest
     * @return AddAITemplateResponse
     */
    @Override
    public CompletableFuture<AddAITemplateResponse> addAITemplate(AddAITemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddAITemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddAITemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddAITemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can create a maximum of 3 levels of categories for audio, video, and image files and 2 levels of categories for short video materials. Each category level can contain a maximum of 100 subcategories. To create categories for audio and video files, set <code>Type</code> to <code>default</code>. To create categories for short video materials, set <code>Type</code> to <code>material</code>.</p>
     * <ul>
     * <li>After you create a category, you can categorize media resources during upload or categorize the uploaded media resources. For more information, see <a href="https://help.aliyun.com/document_detail/86070.html">Manage video categories</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of AddCategory  AddCategoryRequest
     * @return AddCategoryResponse
     */
    @Override
    public CompletableFuture<AddCategoryResponse> addCategory(AddCategoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddCategory").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddCategoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddCategoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  For more information about the online editing feature, see <a href="https://help.aliyun.com/document_detail/95482.html">Overview</a>.</p>
     * 
     * @param request the request parameters of AddEditingProject  AddEditingProjectRequest
     * @return AddEditingProjectResponse
     */
    @Override
    public CompletableFuture<AddEditingProjectResponse> addEditingProject(AddEditingProjectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddEditingProject").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddEditingProjectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddEditingProjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddEditingProjectMaterials  AddEditingProjectMaterialsRequest
     * @return AddEditingProjectMaterialsResponse
     */
    @Override
    public CompletableFuture<AddEditingProjectMaterialsResponse> addEditingProjectMaterials(AddEditingProjectMaterialsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddEditingProjectMaterials").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddEditingProjectMaterialsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddEditingProjectMaterialsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You cannot perform custom operations on transcoding template groups that are <strong>locked</strong> in the ApsaraVideo VOD console. You can call the <a href="~~GetTranscodeTemplateGroup~~">GetTranscodeTemplateGroup</a> operation to query the information about a transcoding template group and check whether the transcoding template group is locked based on the value of the Locked parameter. You can call the <a href="~~UpdateTranscodeTemplateGroup~~">UpdateTranscodeTemplateGroup</a> operation to unlock a transcoding template group if it is locked. Then, you can perform custom operations on the transcoding template group.</p>
     * <ul>
     * <li>An Object Storage Service (OSS) bucket is required to store files that are used for transcoding. You cannot create a transcoding template group if no bucket is available. To activate a bucket, perform the following operations: Log on to the ApsaraVideo VOD console. In the left-side navigation pane, choose <strong>Configuration Management &gt; Media Management &gt; Storage</strong>. On the <strong>Storage</strong> page, activate the bucket that is allocated by ApsaraVideo VOD.</li>
     * <li>You cannot add transcoding templates to the <strong>No Transcoding</strong> template group.</li>
     * <li>You can create a maximum of 20 transcoding template groups.</li>
     * <li>You can add a maximum of 20 transcoding templates to a transcoding template group.</li>
     * <li>If you want to generate a URL for adaptive bitrate streaming, you can add video packaging templates to a transcoding template group. You can add a maximum of 10 video packaging templates to a transcoding template group. If you add more than 10 video packaging templates, URLs of the video transcoded based on the video packaging templates are generated but the URL for adaptive bitrate streaming is not generated.</li>
     * </ul>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to five times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of AddTranscodeTemplateGroup  AddTranscodeTemplateGroupRequest
     * @return AddTranscodeTemplateGroupResponse
     */
    @Override
    public CompletableFuture<AddTranscodeTemplateGroupResponse> addTranscodeTemplateGroup(AddTranscodeTemplateGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddTranscodeTemplateGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddTranscodeTemplateGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddTranscodeTemplateGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>Before you add a domain name to accelerate, you must activate ApsaraVideo VOD and apply for an Internet content provider (ICP) filing for the domain name. For more information about how to activate ApsaraVideo VOD, see <a href="https://help.aliyun.com/document_detail/51512.html">Activate ApsaraVideo VOD</a>.</li>
     * <li>If the content on the origin server is not stored on Alibaba Cloud, the content must be reviewed by Alibaba Cloud. The review will be complete by the end of the next business day after you submit an application.</li>
     * <li>You can add only one domain name to accelerate in a request. You can add a maximum of 20 accelerated domain names within an Alibaba Cloud account.</li>
     * </ul>
     * 
     * @param request the request parameters of AddVodDomain  AddVodDomainRequest
     * @return AddVodDomainResponse
     */
    @Override
    public CompletableFuture<AddVodDomainResponse> addVodDomain(AddVodDomainRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddVodDomain").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddVodDomainResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddVodDomainResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to add a buckets to an ApsaraVideo VOD applications.</p>
     * <blockquote>
     * <p>You can add only one ApsaraVideo VOD bucket for each application. If you specify an AppId that does not exist or the ID of an application for which an VOD bucket is enabled, an error is returned.</p>
     * </blockquote>
     * 
     * @param request the request parameters of AddVodStorageForApp  AddVodStorageForAppRequest
     * @return AddVodStorageForAppResponse
     */
    @Override
    public CompletableFuture<AddVodStorageForAppResponse> addVodStorageForApp(AddVodStorageForAppRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddVodStorageForApp").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddVodStorageForAppResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddVodStorageForAppResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  After you add a snapshot template, you can call the <a href="https://help.aliyun.com/document_detail/72213.html">SubmitSnapshotJob</a> operation and specify the template ID to submit a snapshot job.</p>
     * <ul>
     * <li>You can use the HTTP (HTTPS compatible) callback or MNS callback method to receive the <a href="https://help.aliyun.com/document_detail/57337.html">SnapshotComplete</a> callback. For more information, see <a href="https://help.aliyun.com/document_detail/55627.html">Overview</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of AddVodTemplate  AddVodTemplateRequest
     * @return AddVodTemplateResponse
     */
    @Override
    public CompletableFuture<AddVodTemplateResponse> addVodTemplate(AddVodTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddVodTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddVodTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddVodTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to create an <code>Image</code> watermark template or a <code>Text</code> watermark template. You can use static images in the PNG format or dynamic images in the GIF, APNG, and MOV formats as image watermarks.</p>
     * <ul>
     * <li>After you call this operation to create a watermark template, you must call the <a href="~~AddTranscodeTemplateGroup~~">AddTranscodeTemplateGroup</a> or <a href="~~UpdateTranscodeTemplateGroup~~">UpdateTranscodeTemplateGroup</a> operation to associate the watermark template with a transcoding template group. This way, you can add watermarks to videos during transcoding.</li>
     * <li>For more information, see <a href="https://help.aliyun.com/document_detail/99369.html">Video watermarks</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of AddWatermark  AddWatermarkRequest
     * @return AddWatermarkResponse
     */
    @Override
    public CompletableFuture<AddWatermarkResponse> addWatermark(AddWatermarkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddWatermark").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddWatermarkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddWatermarkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can grant a RAM user or RAM role permissions to access up to 10 applications.</p>
     * </blockquote>
     * 
     * @param request the request parameters of AttachAppPolicyToIdentity  AttachAppPolicyToIdentityRequest
     * @return AttachAppPolicyToIdentityResponse
     */
    @Override
    public CompletableFuture<AttachAppPolicyToIdentityResponse> attachAppPolicyToIdentity(AttachAppPolicyToIdentityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AttachAppPolicyToIdentity").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AttachAppPolicyToIdentityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AttachAppPolicyToIdentityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * </blockquote>
     * 
     * @param request the request parameters of BatchSetVodDomainConfigs  BatchSetVodDomainConfigsRequest
     * @return BatchSetVodDomainConfigsResponse
     */
    @Override
    public CompletableFuture<BatchSetVodDomainConfigsResponse> batchSetVodDomainConfigs(BatchSetVodDomainConfigsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchSetVodDomainConfigs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchSetVodDomainConfigsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchSetVodDomainConfigsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>If the domain name that you want to enable is invalid or your Alibaba Cloud account has overdue payments, you cannot call this operation to enable the domain name.</li>
     * </ul>
     * 
     * @param request the request parameters of BatchStartVodDomain  BatchStartVodDomainRequest
     * @return BatchStartVodDomainResponse
     */
    @Override
    public CompletableFuture<BatchStartVodDomainResponse> batchStartVodDomain(BatchStartVodDomainRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchStartVodDomain").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchStartVodDomainResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchStartVodDomainResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>After you disable an accelerated domain name, the information about the domain name is retained. The system automatically reroutes all the requests that are destined for the domain name to the origin server.</li>
     * </ul>
     * 
     * @param request the request parameters of BatchStopVodDomain  BatchStopVodDomainRequest
     * @return BatchStopVodDomainResponse
     */
    @Override
    public CompletableFuture<BatchStopVodDomainResponse> batchStopVodDomain(BatchStopVodDomainRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchStopVodDomain").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchStopVodDomainResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchStopVodDomainResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can cancel only URL-based upload jobs in the <strong>Pending</strong> state. You can query the status of a URL-based upload job by calling the <a href="https://help.aliyun.com/document_detail/106830.html">GetURLUploadInfos</a> operation.</p>
     * <ul>
     * <li>You cannot cancel an upload job that already starts.</li>
     * <li>You must specify either JobIds or UploadUrls. If you specify both parameters, only JobIds takes effect.</li>
     * </ul>
     * 
     * @param request the request parameters of CancelUrlUploadJobs  CancelUrlUploadJobsRequest
     * @return CancelUrlUploadJobsResponse
     */
    @Override
    public CompletableFuture<CancelUrlUploadJobsResponse> cancelUrlUploadJobs(CancelUrlUploadJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelUrlUploadJobs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelUrlUploadJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelUrlUploadJobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ChangeResourceGroup  ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    @Override
    public CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ChangeResourceGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChangeResourceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChangeResourceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can create up to 10 applications within an Alibaba Cloud account. For more information, see <a href="https://help.aliyun.com/document_detail/113600.html">Multi-application service</a>.</p>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limits on API operations in ApsaraVideo VOD</a>.</p>
     * 
     * @param request the request parameters of CreateAppInfo  CreateAppInfoRequest
     * @return CreateAppInfoResponse
     */
    @Override
    public CompletableFuture<CreateAppInfoResponse> createAppInfo(CreateAppInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAppInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAppInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAppInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateAudit  CreateAuditRequest
     * @return CreateAuditResponse
     */
    @Override
    public CompletableFuture<CreateAuditResponse> createAudit(CreateAuditRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAudit").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAuditResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAuditResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  <strong>Make sure that you understand the billing method and prices of ApsaraVideo VOD before you call this operation. You are charged storage fees after you upload media files to ApsaraVideo VOD. For more information, see <a href="~~188308#section_e97_xrp_mzz~~">Billing of media asset storage</a>. If you have activated the acceleration service, you are charged acceleration fees when you upload media files to ApsaraVideo VOD. For more information, see <a href="~~188310#section_sta_zm2_tsv~~">Billing of acceleration traffic</a>.</strong></p>
     * <ul>
     * <li>You can call this operation only to obtain the upload URLs and credentials for media files and create media assets in ApsaraVideo VOD. You cannot call this operation to upload media files. For more information about how to upload media files by calling API operations, see <a href="https://help.aliyun.com/document_detail/476208.html">Upload media files by calling API operations</a>.</li>
     * <li>If the upload credential expires after 3,000 seconds, you can call the CreateUploadAttachedMedia operation again to obtain a new upload URL and a new upload credential.</li>
     * <li>You can configure a callback to receive an <a href="https://help.aliyun.com/document_detail/103250.html">AttachedMediaUploadComplete</a> event notification to determine whether the upload is successful.</li>
     * <li>You must obtain a URL and a credential before you upload a media file to ApsaraVideo VOD. ApsaraVideo VOD supports multiple upload methods. Each method has different requirements on upload URLs and credentials. For more information, see <a href="https://help.aliyun.com/document_detail/55397.html">Upload URLs and credentials</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateUploadAttachedMedia  CreateUploadAttachedMediaRequest
     * @return CreateUploadAttachedMediaResponse
     */
    @Override
    public CompletableFuture<CreateUploadAttachedMediaResponse> createUploadAttachedMedia(CreateUploadAttachedMediaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateUploadAttachedMedia").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateUploadAttachedMediaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateUploadAttachedMediaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  <strong>Make sure that you understand the billing method and price of ApsaraVideo VOD before you call this operation. You are charged storage fees after you upload media files to ApsaraVideo VOD. For more information, see <a href="~~188308#section_e97_xrp_mzz~~">Billing of media asset storage</a>. If you have activated the acceleration service, you are charged acceleration fees when you upload media files to ApsaraVideo VOD. For more information, see <a href="~~188310#section_sta_zm2_tsv~~">Billing of acceleration traffic</a>.</strong></p>
     * <ul>
     * <li>You must obtain a URL and a credential before you upload an image to ApsaraVideo VOD. ApsaraVideo VOD provides multiple upload methods. You can upload files by using server upload SDKs, client upload SDKs, URLs, Object Storage Service (OSS) API, or OSS SDKs. Each upload method has different requirements for obtaining upload URLs and credentials. For more information, see the &quot;Usage notes&quot; section of the <a href="https://help.aliyun.com/document_detail/55397.html">Upload URLs and credentials</a> topic.</li>
     * <li>You cannot refresh the upload URL or credential when you upload images. If the image upload credential expires, you can call this operation to obtain a new upload URL and credential. By default, the validity period of an image upload credential is 3,000 seconds.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/98467.html">CreateUploadAttachedMedia</a> operation to upload image watermarks.</li>
     * <li>You can configure a callback for <a href="https://help.aliyun.com/document_detail/91968.html">ImageUploadComplete</a> to receive notifications about the image upload status.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateUploadImage  CreateUploadImageRequest
     * @return CreateUploadImageResponse
     */
    @Override
    public CompletableFuture<CreateUploadImageResponse> createUploadImage(CreateUploadImageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateUploadImage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateUploadImageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateUploadImageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  <strong>Make sure that you understand the billing method and prices of ApsaraVideo VOD before you call this operation. You are charged storage fees after you upload media files to ApsaraVideo VOD. For more information, see <a href="~~188308#section_e97_xrp_mzz~~">Billing of media asset storage</a>. If you have activated the acceleration service, you are charged acceleration fees when you upload media files to ApsaraVideo VOD. For more information, see <a href="~~188310#section_sta_zm2_tsv~~">Billing of acceleration traffic</a>.</strong></p>
     * <ul>
     * <li>You can call this operation to obtain upload URLs and credentials for video and audio files. For more information, see <a href="https://help.aliyun.com/document_detail/55397.html">Upload URLs and credentials</a>.</li>
     * <li>You can call this operation only to obtain the upload URLs and credentials for media files and create media assets in ApsaraVideo VOD. You cannot call this operation to upload media files. For more information about how to upload media files by calling API operations, see <a href="https://help.aliyun.com/document_detail/476208.html">Upload media files by calling API operations</a>.</li>
     * <li>If the upload credential expires, call the <a href="~~RefreshUploadVideo~~">RefreshUploadVideo</a> operation to obtain a new upload credential. The default validity period of an upload credential is 3,000 seconds.</li>
     * <li>You can configure a callback to receive an event notification when an audio or video file is uploaded. Alternatively, after you upload an audio or video file, you can call the <a href="https://help.aliyun.com/document_detail/59624.html">GetMezzanineInfo</a> operation to determine whether the upload is successful. For more information, see <a href="https://help.aliyun.com/document_detail/55396.html">Overview</a>.</li>
     * <li>The value of the VideoId parameter that is returned after you call this operation can be used for media processing or the lifecycle management of media assets.</li>
     * <li>You must obtain a URL and a credential before you upload a media file to ApsaraVideo VOD. ApsaraVideo VOD supports multiple upload methods. Each method has different requirements on upload URLs and credentials. For more information, see <a href="https://help.aliyun.com/document_detail/55397.html">Upload URLs and credentials</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateUploadVideo  CreateUploadVideoRequest
     * @return CreateUploadVideoResponse
     */
    @Override
    public CompletableFuture<CreateUploadVideoResponse> createUploadVideo(CreateUploadVideoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateUploadVideo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateUploadVideoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateUploadVideoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DecryptKMSDataKey  DecryptKMSDataKeyRequest
     * @return DecryptKMSDataKeyResponse
     */
    @Override
    public CompletableFuture<DecryptKMSDataKeyResponse> decryptKMSDataKey(DecryptKMSDataKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DecryptKMSDataKey").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DecryptKMSDataKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DecryptKMSDataKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Regions that support this operation: <strong>China (Beijing)</strong> and <strong>China (Shanghai)</strong>.</p>
     * <ul>
     * <li>This operation deletes only information about images that are submitted for AI processing. The image files are not deleted.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteAIImageInfos  DeleteAIImageInfosRequest
     * @return DeleteAIImageInfosResponse
     */
    @Override
    public CompletableFuture<DeleteAIImageInfosResponse> deleteAIImageInfos(DeleteAIImageInfosRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteAIImageInfos").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAIImageInfosResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAIImageInfosResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Regions that support this operation: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</p>
     * <ul>
     * <li>You cannot delete an AI template that is set as the default template.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteAITemplate  DeleteAITemplateRequest
     * @return DeleteAITemplateResponse
     */
    @Override
    public CompletableFuture<DeleteAITemplateResponse> deleteAITemplate(DeleteAITemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteAITemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAITemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAITemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Application with resources can not be deleted.</p>
     * 
     * @param request the request parameters of DeleteAppInfo  DeleteAppInfoRequest
     * @return DeleteAppInfoResponse
     */
    @Override
    public CompletableFuture<DeleteAppInfoResponse> deleteAppInfo(DeleteAppInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteAppInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAppInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAppInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  <strong>This operation physically deletes auxiliary media assets. You cannot recover the auxiliary media assets that you deleted. Exercise caution when you call this operation.</strong></p>
     * <ul>
     * <li>You can delete a maximum of 20 auxiliary media assets in one request.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteAttachedMedia  DeleteAttachedMediaRequest
     * @return DeleteAttachedMediaResponse
     */
    @Override
    public CompletableFuture<DeleteAttachedMediaResponse> deleteAttachedMedia(DeleteAttachedMediaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteAttachedMedia").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAttachedMediaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAttachedMediaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  <strong>After you call this operation to delete a category, all subcategories including level 2 and level 3 categories are deleted at the same time. Exercise caution when you call this operation.</strong></p>
     * <ul>
     * <li>If you have classified specific media resources to a category, the category names labeled on these media resources are automatically deleted when you delete the category.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteCategory  DeleteCategoryRequest
     * @return DeleteCategoryResponse
     */
    @Override
    public CompletableFuture<DeleteCategoryResponse> deleteCategory(DeleteCategoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteCategory").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCategoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCategoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation deletes only the information about animated stickers, but not the animated stickers themselves.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteDynamicImage  DeleteDynamicImageRequest
     * @return DeleteDynamicImageResponse
     */
    @Override
    public CompletableFuture<DeleteDynamicImageResponse> deleteDynamicImage(DeleteDynamicImageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDynamicImage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDynamicImageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDynamicImageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to delete multiple online editing projects at a time.</p>
     * 
     * @param request the request parameters of DeleteEditingProject  DeleteEditingProjectRequest
     * @return DeleteEditingProjectResponse
     */
    @Override
    public CompletableFuture<DeleteEditingProjectResponse> deleteEditingProject(DeleteEditingProjectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteEditingProject").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteEditingProjectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteEditingProjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteEditingProjectMaterials  DeleteEditingProjectMaterialsRequest
     * @return DeleteEditingProjectMaterialsResponse
     */
    @Override
    public CompletableFuture<DeleteEditingProjectMaterialsResponse> deleteEditingProjectMaterials(DeleteEditingProjectMaterialsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteEditingProjectMaterials").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteEditingProjectMaterialsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteEditingProjectMaterialsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  <strong>After you call this operation to delete an image, the source file is permanently deleted and cannot be recovered. Exercise caution when you call this operation.</strong></p>
     * <ul>
     * <li>If some images are cached on Alibaba Cloud CDN points of presence (POPs), the image URLs do not immediately become invalid.</li>
     * <li>You can call this operation to delete uploaded images and video snapshots.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteImage  DeleteImageRequest
     * @return DeleteImageResponse
     */
    @Override
    public CompletableFuture<DeleteImageResponse> deleteImage(DeleteImageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteImage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteImageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteImageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/55627.html">Overview</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteMessageCallback  DeleteMessageCallbackRequest
     * @return DeleteMessageCallbackResponse
     */
    @Override
    public CompletableFuture<DeleteMessageCallbackResponse> deleteMessageCallback(DeleteMessageCallbackRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteMessageCallback").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMessageCallbackResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMessageCallbackResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>All media processing operations in ApsaraVideo VOD, such as transcoding, snapshot capture, and content moderation, are performed based on source files. If you delete the source files, you cannot perform media processing operations. Exercise caution when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteMezzanines  DeleteMezzaninesRequest
     * @return DeleteMezzaninesResponse
     */
    @Override
    public CompletableFuture<DeleteMezzaninesResponse> deleteMezzanines(DeleteMezzaninesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteMezzanines").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMezzaninesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMezzaninesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  During multipart upload, useless parts may be retained if the upload fails. These useless parts are automatically deleted after 7 days. You can call this operation to delete the generated parts after the upload is successful or fails.</p>
     * <ul>
     * <li>This operation does not delete the source file or transcoded file, but deletes only the parts generated during the upload.</li>
     * <li>If you call the <a href="https://help.aliyun.com/document_detail/52837.html">DeleteVideo</a> operation, the entire video file is deleted, including the generated parts.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteMultipartUpload  DeleteMultipartUploadRequest
     * @return DeleteMultipartUploadResponse
     */
    @Override
    public CompletableFuture<DeleteMultipartUploadResponse> deleteMultipartUpload(DeleteMultipartUploadRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteMultipartUpload").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMultipartUploadResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMultipartUploadResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteStream  DeleteStreamRequest
     * @return DeleteStreamResponse
     */
    @Override
    public CompletableFuture<DeleteStreamResponse> deleteStream(DeleteStreamRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteStream").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteStreamResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteStreamResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You cannot call this operation to delete the default transcoding template. You can delete the transcoding template when it is no longer specified as the default one.</p>
     * <ul>
     * <li>For security purposes, you cannot add, modify, or delete transcoding templates in a transcoding template group that is locked. To check whether a transcoding template group is locked, call the <a href="~~GetTranscodeTemplateGroup~~">GetTranscodeTemplateGroup</a> operation and obtain the Locked parameter from the response. To modify transcoding templates within a locked transcoding template group, you must call the <a href="~~UpdateTranscodeTemplateGroup~~">UpdateTranscodeTemplateGroup</a> operation to unlock the transcoding template group first.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteTranscodeTemplateGroup  DeleteTranscodeTemplateGroupRequest
     * @return DeleteTranscodeTemplateGroupResponse
     */
    @Override
    public CompletableFuture<DeleteTranscodeTemplateGroupResponse> deleteTranscodeTemplateGroup(DeleteTranscodeTemplateGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteTranscodeTemplateGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteTranscodeTemplateGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteTranscodeTemplateGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation physically deletes videos. Deleted videos cannot be recovered. Exercise caution when you call this operation.</p>
     * <ul>
     * <li>You can call this operation to delete multiple videos at a time.</li>
     * <li>When you delete a video, its source file, transcoded stream file, and thumbnail screenshot are also deleted. However, the Alibaba Cloud Content Delivery Network (CDN) cache is not refreshed simultaneously. You can use the refresh feature in the ApsaraVideo VOD console to clear garbage data on CDN nodes. For more information, see <a href="https://help.aliyun.com/document_detail/86098.html">Refresh and prefetch</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteVideo  DeleteVideoRequest
     * @return DeleteVideoResponse
     */
    @Override
    public CompletableFuture<DeleteVideoResponse> deleteVideo(DeleteVideoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteVideo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteVideoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteVideoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>This operation is available only in the <strong>China (Shanghai)</strong> region.</li>
     * <li>After a domain name for CDN is removed from ApsaraVideo VOD, the domain name becomes unavailable. Proceed with caution. We recommend that you restore the A record at your DNS service provider before you remove the domain name for CDN.</li>
     * <li>After you call this operation to remove a domain name for CDN from ApsaraVideo VOD, all records that are related to the domain name are deleted. If you only want to disable a domain name for CDN, call the <a href="https://help.aliyun.com/document_detail/120208.html">BatchStopVodDomain</a> operation.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteVodDomain  DeleteVodDomainRequest
     * @return DeleteVodDomainResponse
     */
    @Override
    public CompletableFuture<DeleteVodDomainResponse> deleteVodDomain(DeleteVodDomainRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteVodDomain").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteVodDomainResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteVodDomainResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>This operation is available only in the <strong>China (Shanghai)</strong> region.</li>
     * <li>After the configurations of a domain name for CDN are deleted, the domain name becomes unavailable. We recommend that you restore the A record at your DNS service provider before you delete the configurations of the domain name for CDN.</li>
     * <li>After you call this operation to remove a domain name for CDN from ApsaraVideo VOD, all records that are related to the domain name are deleted. If you only want to disable a domain name for CDN, call the <a href="https://help.aliyun.com/document_detail/120208.html">BatchStopVodDomain</a> operation.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteVodSpecificConfig  DeleteVodSpecificConfigRequest
     * @return DeleteVodSpecificConfigResponse
     */
    @Override
    public CompletableFuture<DeleteVodSpecificConfigResponse> deleteVodSpecificConfig(DeleteVodSpecificConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteVodSpecificConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteVodSpecificConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteVodSpecificConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteVodTemplate  DeleteVodTemplateRequest
     * @return DeleteVodTemplateResponse
     */
    @Override
    public CompletableFuture<DeleteVodTemplateResponse> deleteVodTemplate(DeleteVodTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteVodTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteVodTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteVodTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  <strong>After you delete an image watermark template, the source watermark file is physically deleted and cannot be restored. Exercise caution when you call this operation.</strong></p>
     * <ul>
     * <li>You cannot delete the default watermark template. To delete a default watermark template, call the <a href="~~SetDefaultWatermark~~">SetDefaultWatermark</a> operation to set another watermark template as the default one.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteWatermark  DeleteWatermarkRequest
     * @return DeleteWatermarkResponse
     */
    @Override
    public CompletableFuture<DeleteWatermarkResponse> deleteWatermark(DeleteWatermarkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteWatermark").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteWatermarkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteWatermarkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>You can query playback statistics on top 1,000 videos at most on a specified day. By default, top videos are sorted in descending order based on video views.</li>
     * <li>You can call this operation to query only playback statistics collected on videos that are played by using ApsaraVideo Player SDKs.</li>
     * <li>Playback statistics for the previous day are generated at 09:00 on the current day, in UTC+8.</li>
     * <li>You can query data that is generated since January 1, 2018. The maximum time range to query is 180 days.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribePlayTopVideos  DescribePlayTopVideosRequest
     * @return DescribePlayTopVideosResponse
     */
    @Override
    public CompletableFuture<DescribePlayTopVideosResponse> describePlayTopVideos(DescribePlayTopVideosRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePlayTopVideos").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePlayTopVideosResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePlayTopVideosResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>This operation is available only in the <strong>China (Shanghai)</strong> region.</li>
     * <li>You can call this operation to query only playback statistics collected on videos that are played by using ApsaraVideo Player SDKs.</li>
     * <li>Playback statistics for the previous day are generated at 09:00 on the current day, in UTC+8.</li>
     * <li>You can query data that is generated since January 1, 2018. The maximum time range to query is 180 days.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of DescribePlayUserAvg  DescribePlayUserAvgRequest
     * @return DescribePlayUserAvgResponse
     */
    @Override
    public CompletableFuture<DescribePlayUserAvgResponse> describePlayUserAvg(DescribePlayUserAvgRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePlayUserAvg").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePlayUserAvgResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePlayUserAvgResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>You can call this operation to query only playback statistics collected on videos that are played by using ApsaraVideo Player SDKs.</li>
     * <li>Playback statistics for the current day are generated at 09:00 (UTC+8) on the next day.</li>
     * <li>You can query data that is generated since January 1, 2018. The maximum time range to query is 180 days.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribePlayUserTotal  DescribePlayUserTotalRequest
     * @return DescribePlayUserTotalResponse
     */
    @Override
    public CompletableFuture<DescribePlayUserTotalResponse> describePlayUserTotal(DescribePlayUserTotalRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePlayUserTotal").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePlayUserTotalResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePlayUserTotalResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>You can call this operation to query only playback statistics collected on videos that are played by using ApsaraVideo Player SDKs.</li>
     * <li>Playback statistics for the current day are generated at 09:00 (UTC+8) on the next day.</li>
     * <li>You can query only data in the last 730 days. The maximum time range to query is 180 days.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribePlayVideoStatis  DescribePlayVideoStatisRequest
     * @return DescribePlayVideoStatisResponse
     */
    @Override
    public CompletableFuture<DescribePlayVideoStatisResponse> describePlayVideoStatis(DescribePlayVideoStatisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePlayVideoStatis").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePlayVideoStatisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePlayVideoStatisResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>This operation is available only in the <strong>China (Shanghai)</strong> region.</li>
     * <li>If the time range to query is less than or equal to seven days, the system returns the statistics collected on an hourly basis. If the time range to query is greater than seven days, the system returns the statistics collected on a daily basis. The maximum time range that you can specify to query is 31 days.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeVodAIData  DescribeVodAIDataRequest
     * @return DescribeVodAIDataResponse
     */
    @Override
    public CompletableFuture<DescribeVodAIDataResponse> describeVodAIData(DescribeVodAIDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVodAIData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVodAIDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVodAIDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeVodCertificateList  DescribeVodCertificateListRequest
     * @return DescribeVodCertificateListResponse
     */
    @Override
    public CompletableFuture<DescribeVodCertificateListResponse> describeVodCertificateList(DescribeVodCertificateListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVodCertificateList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVodCertificateListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVodCertificateListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If you specify neither the StartTime parameter nor the EndTime parameter, the data in the last 24 hours is queried. Alternatively, you can specify both the StartTime and EndTime parameters to query data that is generated in the specified duration. You can query data for the last 90 days at most.</p>
     * 
     * @param request the request parameters of DescribeVodDomainBpsData  DescribeVodDomainBpsDataRequest
     * @return DescribeVodDomainBpsDataResponse
     */
    @Override
    public CompletableFuture<DescribeVodDomainBpsDataResponse> describeVodDomainBpsData(DescribeVodDomainBpsDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVodDomainBpsData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVodDomainBpsDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVodDomainBpsDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this API operation up to 20 times per second per account. If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range. Time granularity
     * The time granularity supported by Interval, the maximum time period within which historical data is available, and the data delay vary based on the time range to query, as described in the following table.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>15 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>3 to 4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>90 days</td>
     * <td>366 days</td>
     * <td>4 hours in most cases, not more than 24 hours</td>
     * </tr>
     * </tbody></table>
     * 
     * @param request the request parameters of DescribeVodDomainBpsDataByLayer  DescribeVodDomainBpsDataByLayerRequest
     * @return DescribeVodDomainBpsDataByLayerResponse
     */
    @Override
    public CompletableFuture<DescribeVodDomainBpsDataByLayerResponse> describeVodDomainBpsDataByLayer(DescribeVodDomainBpsDataByLayerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVodDomainBpsDataByLayer").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVodDomainBpsDataByLayerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVodDomainBpsDataByLayerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * 
     * @param request the request parameters of DescribeVodDomainCertificateInfo  DescribeVodDomainCertificateInfoRequest
     * @return DescribeVodDomainCertificateInfoResponse
     */
    @Override
    public CompletableFuture<DescribeVodDomainCertificateInfoResponse> describeVodDomainCertificateInfo(DescribeVodDomainCertificateInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVodDomainCertificateInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVodDomainCertificateInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVodDomainCertificateInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeVodDomainConfigs  DescribeVodDomainConfigsRequest
     * @return DescribeVodDomainConfigsResponse
     */
    @Override
    public CompletableFuture<DescribeVodDomainConfigsResponse> describeVodDomainConfigs(DescribeVodDomainConfigsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVodDomainConfigs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVodDomainConfigsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVodDomainConfigsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeVodDomainDetail  DescribeVodDomainDetailRequest
     * @return DescribeVodDomainDetailResponse
     */
    @Override
    public CompletableFuture<DescribeVodDomainDetailResponse> describeVodDomainDetail(DescribeVodDomainDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVodDomainDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVodDomainDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVodDomainDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation is supported only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>You can specify a maximum of 500 accelerated domain names.</li>
     * <li>If you specify neither <code>StartTime</code> nor <code>EndTime</code>, the data of the last 24 hours is queried. You can specify both <code>StartTime</code> and <code>EndTime</code> parameters to query data of a specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the <code>StartTime</code> and <code>EndTime</code> parameters. The following table describes the time period within which historical data is available and the data delay when you do not set <code>Interval</code>.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>Time range per query &#x3C; 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days ≤ Time range per query &#x3C; 31 days</td>
     * <td>186 days</td>
     * <td>3 to 4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>31 days ≤ Time span of a single query ≤ 366 days</td>
     * <td>366 days</td>
     * <td>4 hours in most cases, not more than 24 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVodDomainHitRateData  DescribeVodDomainHitRateDataRequest
     * @return DescribeVodDomainHitRateDataResponse
     */
    @Override
    public CompletableFuture<DescribeVodDomainHitRateDataResponse> describeVodDomainHitRateData(DescribeVodDomainHitRateDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVodDomainHitRateData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVodDomainHitRateDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVodDomainHitRateDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>For more information about the log format and latency, see <a href="https://help.aliyun.com/document_detail/86099.html">Download logs</a>.</li>
     * <li>If you specify neither the StartTime parameter nor the EndTime parameter, the log data in the last 24 hours is queried.</li>
     * <li>You can specify both the StartTime and EndTime parameters to query the log data that is generated in the specified time range.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVodDomainLog  DescribeVodDomainLogRequest
     * @return DescribeVodDomainLogResponse
     */
    @Override
    public CompletableFuture<DescribeVodDomainLogResponse> describeVodDomainLog(DescribeVodDomainLogRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVodDomainLog").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVodDomainLogResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVodDomainLogResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeVodDomainMax95BpsData  DescribeVodDomainMax95BpsDataRequest
     * @return DescribeVodDomainMax95BpsDataResponse
     */
    @Override
    public CompletableFuture<DescribeVodDomainMax95BpsDataResponse> describeVodDomainMax95BpsData(DescribeVodDomainMax95BpsDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVodDomainMax95BpsData").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVodDomainMax95BpsDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVodDomainMax95BpsDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation is available only in the China (Shanghai) region.</p>
     * <ul>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the last 24 hours. If you set both these parameters, the request returns the data collected within the specified time range.
     * <strong>Time granularity</strong>
     * The time granularity supported by the Interval parameter, the maximum time period within which historical data is available, and the data delay vary with the maximum time range per query, as described in the following table.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>31 days</td>
     * <td>186 days</td>
     * <td>3 to 4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>366 days</td>
     * <td>366 days</td>
     * <td>4 to 24 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * <hr>
     * 
     * @param request the request parameters of DescribeVodDomainQpsData  DescribeVodDomainQpsDataRequest
     * @return DescribeVodDomainQpsDataResponse
     */
    @Override
    public CompletableFuture<DescribeVodDomainQpsDataResponse> describeVodDomainQpsData(DescribeVodDomainQpsDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVodDomainQpsData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVodDomainQpsDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVodDomainQpsDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation is supported only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>You can specify a maximum of 500 accelerated domain names.</li>
     * <li>If you specify neither <code>StartTime</code> nor <code>EndTime</code>, the data of the last 1 hour is queried. You can specify both <code>StartTime</code> and <code>EndTime</code> parameters to query data of a specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the <code>StartTime</code> and <code>EndTime</code> parameters. The following table describes the time period within which historical data is available and the data delay.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>Time range per query ≤ 1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>1 Hour &#x3C; Time range per query ≤ 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days &#x3C; Time range per query ≤ 31 days</td>
     * <td>186 days</td>
     * <td>3 to 4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVodDomainRealTimeBpsData  DescribeVodDomainRealTimeBpsDataRequest
     * @return DescribeVodDomainRealTimeBpsDataResponse
     */
    @Override
    public CompletableFuture<DescribeVodDomainRealTimeBpsDataResponse> describeVodDomainRealTimeBpsData(DescribeVodDomainRealTimeBpsDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVodDomainRealTimeBpsData").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVodDomainRealTimeBpsDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVodDomainRealTimeBpsDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation is supported only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>You can specify a maximum of 100 accelerated domain names.</li>
     * <li>If you specify neither <code>StartTime</code> nor <code>EndTime</code>, the data of the last 1 hour is queried. You can specify both <code>StartTime</code> and <code>EndTime</code> parameters to query data of a specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the <code>StartTime</code> and <code>EndTime</code> parameters. The following table describes the time period within which historical data is available and the data delay.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>Time range per query ≤ 1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>1 Hour &#x3C; Time range per query ≤ 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days &#x3C; Time range per query ≤ 31 days</td>
     * <td>186 days</td>
     * <td>3 to 4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVodDomainRealTimeByteHitRateData  DescribeVodDomainRealTimeByteHitRateDataRequest
     * @return DescribeVodDomainRealTimeByteHitRateDataResponse
     */
    @Override
    public CompletableFuture<DescribeVodDomainRealTimeByteHitRateDataResponse> describeVodDomainRealTimeByteHitRateData(DescribeVodDomainRealTimeByteHitRateDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVodDomainRealTimeByteHitRateData").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVodDomainRealTimeByteHitRateDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVodDomainRealTimeByteHitRateDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can query data within the last seven days. Data is collected every minute. You can call this API operation up to 10 times per second per account.</p>
     * 
     * @param request the request parameters of DescribeVodDomainRealTimeDetailData  DescribeVodDomainRealTimeDetailDataRequest
     * @return DescribeVodDomainRealTimeDetailDataResponse
     */
    @Override
    public CompletableFuture<DescribeVodDomainRealTimeDetailDataResponse> describeVodDomainRealTimeDetailData(DescribeVodDomainRealTimeDetailDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVodDomainRealTimeDetailData").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVodDomainRealTimeDetailDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVodDomainRealTimeDetailDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation is supported only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>You can specify a maximum of 100 accelerated domain names.</li>
     * <li>If you specify neither <code>StartTime</code> nor <code>EndTime</code>, the data of the last 1 hour is queried. You can specify both <code>StartTime</code> and <code>EndTime</code> parameters to query data of a specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the <code>StartTime</code> and <code>EndTime</code> parameters. The following table describes the time period within which historical data is available and the data delay.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query</th>
     * <th>Historical data available (days)</th>
     * <th>Data latency</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>Time range per query ≤ 1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>1 hour &#x3C; Time range per query &#x3C; 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days ≤ Time range per query &#x3C; 31 days</td>
     * <td>186 days</td>
     * <td>3 to 4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVodDomainRealTimeHttpCodeData  DescribeVodDomainRealTimeHttpCodeDataRequest
     * @return DescribeVodDomainRealTimeHttpCodeDataResponse
     */
    @Override
    public CompletableFuture<DescribeVodDomainRealTimeHttpCodeDataResponse> describeVodDomainRealTimeHttpCodeData(DescribeVodDomainRealTimeHttpCodeDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVodDomainRealTimeHttpCodeData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVodDomainRealTimeHttpCodeDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVodDomainRealTimeHttpCodeDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation is supported only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>You can specify a maximum of 500 accelerated domain names.</li>
     * <li>If you specify neither <code>StartTime</code> nor <code>EndTime</code>, the data of the last 1 hour is queried. You can specify both <code>StartTime</code> and <code>EndTime</code> parameters to query data of a specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the <code>StartTime</code> and <code>EndTime</code> parameters. The following table describes the time period within which historical data is available and the data delay.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>Time range per query ≤ 1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>1 Hour &#x3C; Time range per query ≤ 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days &#x3C; Time range per query ≤ 31 days</td>
     * <td>186 days</td>
     * <td>3 to 4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVodDomainRealTimeQpsData  DescribeVodDomainRealTimeQpsDataRequest
     * @return DescribeVodDomainRealTimeQpsDataResponse
     */
    @Override
    public CompletableFuture<DescribeVodDomainRealTimeQpsDataResponse> describeVodDomainRealTimeQpsData(DescribeVodDomainRealTimeQpsDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVodDomainRealTimeQpsData").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVodDomainRealTimeQpsDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVodDomainRealTimeQpsDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation is supported only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>You can specify a maximum of 100 accelerated domain names.</li>
     * <li>If you specify neither <code>StartTime</code> nor <code>EndTime</code>, the data of the last 1 hour is queried. You can specify both <code>StartTime</code> and <code>EndTime</code> parameters to query data of a specified time range.</li>
     * <li>By default, the POST method is used for Go. To use the FET method, you must declare <code>request.Method=&quot;GET&quot;</code>.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the <code>StartTime</code> and <code>EndTime</code> parameters. The following table describes the time period within which historical data is available and the data delay.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>Time range per query ≤ 1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>1 hour &#x3C; Time range per query &#x3C; 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days ≤ Time range per query &#x3C; 31 days</td>
     * <td>186 days</td>
     * <td>3 to 4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVodDomainRealTimeReqHitRateData  DescribeVodDomainRealTimeReqHitRateDataRequest
     * @return DescribeVodDomainRealTimeReqHitRateDataResponse
     */
    @Override
    public CompletableFuture<DescribeVodDomainRealTimeReqHitRateDataResponse> describeVodDomainRealTimeReqHitRateData(DescribeVodDomainRealTimeReqHitRateDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVodDomainRealTimeReqHitRateData").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVodDomainRealTimeReqHitRateDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVodDomainRealTimeReqHitRateDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation is supported only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>You can specify a maximum of 100 accelerated domain names.</li>
     * <li>If you specify neither <code>StartTime</code> nor <code>EndTime</code>, the data of the last 1 hour is queried. You can specify both <code>StartTime</code> and <code>EndTime</code> parameters to query data of a specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the <code>StartTime</code> and <code>EndTime</code> parameters. The following table describes the time period within which historical data is available and the data delay.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>1 minute</td>
     * <td>Time range per query ≤ 1 hour</td>
     * <td>7 days</td>
     * <td>5 minutes</td>
     * </tr>
     * <tr>
     * <td>5 minutes</td>
     * <td>1 Hour &#x3C; Time range per query ≤ 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days &#x3C; Time range per query ≤ 31 days</td>
     * <td>186 days</td>
     * <td>3 to 4 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVodDomainRealTimeTrafficData  DescribeVodDomainRealTimeTrafficDataRequest
     * @return DescribeVodDomainRealTimeTrafficDataResponse
     */
    @Override
    public CompletableFuture<DescribeVodDomainRealTimeTrafficDataResponse> describeVodDomainRealTimeTrafficData(DescribeVodDomainRealTimeTrafficDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVodDomainRealTimeTrafficData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVodDomainRealTimeTrafficDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVodDomainRealTimeTrafficDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation is supported only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>You can specify a maximum of 500 accelerated domain names.</li>
     * <li>If you specify neither <code>StartTime</code> nor <code>EndTime</code>, the data of the last 24 hours is queried. You can specify both <code>StartTime</code> and <code>EndTime</code> parameters to query data of a specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the <code>StartTime</code> and <code>EndTime</code> parameters. The following table describes the time period within which historical data is available and the data delay when you do not set <code>Interval</code>.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>Time range per query &#x3C; 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days ≤ Time range per query &#x3C; 31 days</td>
     * <td>186 days</td>
     * <td>3 to 4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>31 days ≤ Time range per query ≤ 90 days</td>
     * <td>366 days</td>
     * <td>4 hours in most cases, not more than 24 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVodDomainReqHitRateData  DescribeVodDomainReqHitRateDataRequest
     * @return DescribeVodDomainReqHitRateDataResponse
     */
    @Override
    public CompletableFuture<DescribeVodDomainReqHitRateDataResponse> describeVodDomainReqHitRateData(DescribeVodDomainReqHitRateDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVodDomainReqHitRateData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVodDomainReqHitRateDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVodDomainReqHitRateDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation is supported only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>You can specify a maximum of 500 accelerated domain names.</li>
     * <li>If you specify neither <code>StartTime</code> nor <code>EndTime</code>, the data of the last 24 hours is queried. You can specify both <code>StartTime</code> and <code>EndTime</code> parameters to query data of a specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the <code>StartTime</code> and <code>EndTime</code> parameters. The following table describes the time period within which historical data is available and the data delay when you do not set <code>Interval</code>.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>Time range per query &#x3C; 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days ≤ Time range per query &#x3C; 31 days</td>
     * <td>186 days</td>
     * <td>3 to 4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>31 days ≤ Time span of a single query ≤ 366 days</td>
     * <td>366 days</td>
     * <td>4 hours in most cases, not more than 24 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVodDomainSrcBpsData  DescribeVodDomainSrcBpsDataRequest
     * @return DescribeVodDomainSrcBpsDataResponse
     */
    @Override
    public CompletableFuture<DescribeVodDomainSrcBpsDataResponse> describeVodDomainSrcBpsData(DescribeVodDomainSrcBpsDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVodDomainSrcBpsData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVodDomainSrcBpsDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVodDomainSrcBpsDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>ApsaraVideo VOD stores the origin traffic data for 90 days before the data is deleted.</li>
     * <li>If you do not set the <code>StartTime</code> or <code>EndTime</code> parameter, the request returns the data collected in the last 24 hours. If you set both the <code>StartTime</code> and <code>EndTime</code> parameters, the request returns the data collected within the specified time range.</li>
     * <li>You can specify a maximum of 500 domain names in a request. Separate multiple domain names with commas (,). If you specify multiple domain names in a request, aggregation results are returned.</li>
     * </ul>
     * <h3>Time granularity</h3>
     * <p>The time granularity supported by the Interval parameter varies based on the time range per query specified by using <code>StartTime</code> and <code>EndTime</code>. The following table describes the time period within which historical data is available and the data delay.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query (days)</th>
     * <th>Historical data available (days)</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>(0, 3\]</td>
     * <td>93</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>(3, 31\]</td>
     * <td>186</td>
     * <td>4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>(31, 366\]</td>
     * <td>366</td>
     * <td>04:00 on the next day</td>
     * </tr>
     * </tbody></table>
     * 
     * @param request the request parameters of DescribeVodDomainSrcTrafficData  DescribeVodDomainSrcTrafficDataRequest
     * @return DescribeVodDomainSrcTrafficDataResponse
     */
    @Override
    public CompletableFuture<DescribeVodDomainSrcTrafficDataResponse> describeVodDomainSrcTrafficData(DescribeVodDomainSrcTrafficDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVodDomainSrcTrafficData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVodDomainSrcTrafficDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVodDomainSrcTrafficDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation is supported only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>You can specify a maximum of 500 accelerated domain names.</li>
     * <li>If you specify neither <code>StartTime</code> nor <code>EndTime</code>, the data of the last 24 hour is queried. You can specify both <code>StartTime</code> and <code>EndTime</code> parameters to query data of a specified time range.
     * <strong>Time granularity</strong>
     * The time granularity varies with the time range specified by the <code>StartTime</code> and <code>EndTime</code> parameters. The following table describes the time period within which historical data is available and the data delay when you do not set <code>Interval</code>.<table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>Time range per query &#x3C; 3 days</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * <tr>
     * <td>1 hour</td>
     * <td>3 days ≤ Time range per query &#x3C; 31 days</td>
     * <td>186 days</td>
     * <td>3 to 4 hours</td>
     * </tr>
     * <tr>
     * <td>1 day</td>
     * <td>31 days ≤ Time range per query ≤ 366 days</td>
     * <td>366 days</td>
     * <td>4 hours in most cases, not more than 24 hours</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVodDomainTrafficData  DescribeVodDomainTrafficDataRequest
     * @return DescribeVodDomainTrafficDataResponse
     */
    @Override
    public CompletableFuture<DescribeVodDomainTrafficDataResponse> describeVodDomainTrafficData(DescribeVodDomainTrafficDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVodDomainTrafficData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVodDomainTrafficDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVodDomainTrafficDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>You can specify up to 100 accelerated domain names in a request. Separate multiple domain names with commas (,). If you do not specify an accelerated domain name, the data of all accelerated domain names within your Alibaba Cloud account is returned.</li>
     * <li>You can query data in the last year. The maximum time range that can be queried is three months. If you specify a time range of one to three days, the system returns data on an hourly basis. If you specify a time range of four days or more, the system returns data on a daily basis.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVodDomainUsageData  DescribeVodDomainUsageDataRequest
     * @return DescribeVodDomainUsageDataResponse
     */
    @Override
    public CompletableFuture<DescribeVodDomainUsageDataResponse> describeVodDomainUsageData(DescribeVodDomainUsageDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVodDomainUsageData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVodDomainUsageDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVodDomainUsageDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>Only playback data in ApsaraVideo Player SDK is collected.</li>
     * <li>You can query only data within the last 30 days.</li>
     * <li>Before you call this operation, make sure that the following requirements are met:<ul>
     * <li>ApsaraVideo Player SDK for Android or iOS<ul>
     * <li>ApsaraVideo Player SDK for Android or iOS V5.4.9.2 or later is used.</li>
     * <li>A license for ApsaraVideo Player SDK is obtained. For more information, see <a href="https://help.aliyun.com/document_detail/469166.html">Manage licenses</a>.</li>
     * <li>The log reporting feature is enabled. By default, the feature is enabled for ApsaraVideo Player SDKs. For more information, see <a href="~~311525#section-dc4-gp6-xk2~~">Integrate ApsaraVideo Player SDK for Android</a> and <a href="~~313855#section-cmf-k7d-jg5~~">Integrate ApsaraVideo Player SDK for iOS</a>.</li>
     * </ul>
     * </li>
     * <li>ApsaraVideo Player SDK for Web<ul>
     * <li>ApsaraVideo Player SDK for Web V2.16.0 or later is used.</li>
     * <li>A license for <strong>playback quality monitoring</strong> is obtained. To apply for the license, <a href="https://yida.alibaba-inc.com/o/webplayer#/">submit a request on Yida to enable value-added features for ApsaraVideo Player SDK for Web</a>. For more information, see the description of the <code>license</code> parameter in the <a href="~~125572#section-3ty-gwp-6pa~~">API operations</a> topic.</li>
     * <li>The log reporting feature is enabled. By default, the feature is enabled for ApsaraVideo Player SDKs.</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVodMediaPlayData  DescribeVodMediaPlayDataRequest
     * @return DescribeVodMediaPlayDataResponse
     */
    @Override
    public CompletableFuture<DescribeVodMediaPlayDataResponse> describeVodMediaPlayData(DescribeVodMediaPlayDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVodMediaPlayData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVodMediaPlayDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVodMediaPlayDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The data is collected every 5 minutes. You can call this API operation up to 20 times per second per account. Time granularity
     * The time granularity supported by Interval, the maximum time period within which historical data is available, and the data delay vary based on the time range to query, as described in the following table.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Time granularity</th>
     * <th>Maximum time range per query</th>
     * <th>Historical data available</th>
     * <th>Data delay</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>5 minutes</td>
     * <td>1 hour</td>
     * <td>93 days</td>
     * <td>15 minutes</td>
     * </tr>
     * </tbody></table>
     * 
     * @param request the request parameters of DescribeVodRangeDataByLocateAndIspService  DescribeVodRangeDataByLocateAndIspServiceRequest
     * @return DescribeVodRangeDataByLocateAndIspServiceResponse
     */
    @Override
    public CompletableFuture<DescribeVodRangeDataByLocateAndIspServiceResponse> describeVodRangeDataByLocateAndIspService(DescribeVodRangeDataByLocateAndIspServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVodRangeDataByLocateAndIspService").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVodRangeDataByLocateAndIspServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVodRangeDataByLocateAndIspServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>This operation is available only in the <strong>China (Shanghai)</strong> region.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/69215.html">RefreshVodObjectCaches</a> operation to refresh content and the <a href="https://help.aliyun.com/document_detail/69211.html">PreloadVodObjectCaches</a> operation to prefetch content.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeVodRefreshQuota  DescribeVodRefreshQuotaRequest
     * @return DescribeVodRefreshQuotaResponse
     */
    @Override
    public CompletableFuture<DescribeVodRefreshQuotaResponse> describeVodRefreshQuota(DescribeVodRefreshQuotaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVodRefreshQuota").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVodRefreshQuotaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVodRefreshQuotaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>If you do not specify the TaskId or ObjectPath parameter, the data in the last three days is returned on the first page. By default, one page displays a maximum of 20 entries. You can specify the TaskId and ObjectPath parameters at the same time.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVodRefreshTasks  DescribeVodRefreshTasksRequest
     * @return DescribeVodRefreshTasksResponse
     */
    @Override
    public CompletableFuture<DescribeVodRefreshTasksResponse> describeVodRefreshTasks(DescribeVodRefreshTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVodRefreshTasks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVodRefreshTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVodRefreshTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeVodSSLCertificateList  DescribeVodSSLCertificateListRequest
     * @return DescribeVodSSLCertificateListResponse
     */
    @Override
    public CompletableFuture<DescribeVodSSLCertificateListResponse> describeVodSSLCertificateList(DescribeVodSSLCertificateListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVodSSLCertificateList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVodSSLCertificateListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVodSSLCertificateListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>This operation is available only in the <strong>China (Shanghai)</strong> region.</li>
     * <li>If the time range to query is less than or equal to seven days, the system returns the statistics collected on an hourly basis. If the time range to query is greater than seven days, the system returns the statistics collected on a daily basis. The maximum time range that you can specify to query is 31 days.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeVodStorageData  DescribeVodStorageDataRequest
     * @return DescribeVodStorageDataResponse
     */
    @Override
    public CompletableFuture<DescribeVodStorageDataResponse> describeVodStorageData(DescribeVodStorageDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVodStorageData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVodStorageDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVodStorageDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>If you specify a time range within 7 days, the request returns the data based on hours. If you specify a time range longer than 7 days, the request returns the data based on days. The maximum time range is 31 days.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVodTieringStorageData  DescribeVodTieringStorageDataRequest
     * @return DescribeVodTieringStorageDataResponse
     */
    @Override
    public CompletableFuture<DescribeVodTieringStorageDataResponse> describeVodTieringStorageData(DescribeVodTieringStorageDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVodTieringStorageData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVodTieringStorageDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVodTieringStorageDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>If you specify a time range within 7 days, the request returns the data based on hours. If you specify a time range longer than 7 days, the request returns the data based on days. The maximum time range is 31 days.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVodTieringStorageRetrievalData  DescribeVodTieringStorageRetrievalDataRequest
     * @return DescribeVodTieringStorageRetrievalDataResponse
     */
    @Override
    public CompletableFuture<DescribeVodTieringStorageRetrievalDataResponse> describeVodTieringStorageRetrievalData(DescribeVodTieringStorageRetrievalDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVodTieringStorageRetrievalData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVodTieringStorageRetrievalDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVodTieringStorageRetrievalDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>If the time range to query is less than or equal to seven days, the system returns the statistics collected on an hourly basis. If the time range to query is greater than seven days, the system returns the statistics collected on a daily basis. The maximum time range that you can specify to query is 31 days.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVodTranscodeData  DescribeVodTranscodeDataRequest
     * @return DescribeVodTranscodeDataResponse
     */
    @Override
    public CompletableFuture<DescribeVodTranscodeDataResponse> describeVodTranscodeData(DescribeVodTranscodeDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVodTranscodeData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVodTranscodeDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVodTranscodeDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can filter domain names by name and status. Fuzzy match is supported for domain name-based query.</p>
     * <ul>
     * <li>This operation is available only in the China (Shanghai) region.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVodUserDomains  DescribeVodUserDomainsRequest
     * @return DescribeVodUserDomainsResponse
     */
    @Override
    public CompletableFuture<DescribeVodUserDomainsResponse> describeVodUserDomains(DescribeVodUserDomainsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVodUserDomains").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVodUserDomainsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVodUserDomainsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * 
     * @param request the request parameters of DescribeVodVerifyContent  DescribeVodVerifyContentRequest
     * @return DescribeVodVerifyContentResponse
     */
    @Override
    public CompletableFuture<DescribeVodVerifyContentResponse> describeVodVerifyContent(DescribeVodVerifyContentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVodVerifyContent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVodVerifyContentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVodVerifyContentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can grant a maximum of 10 application permissions to a RAM user or RAM role.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DetachAppPolicyFromIdentity  DetachAppPolicyFromIdentityRequest
     * @return DetachAppPolicyFromIdentityResponse
     */
    @Override
    public CompletableFuture<DetachAppPolicyFromIdentityResponse> detachAppPolicyFromIdentity(DetachAppPolicyFromIdentityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetachAppPolicyFromIdentity").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetachAppPolicyFromIdentityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetachAppPolicyFromIdentityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  To use the secure download feature, you must enable the download feature in the ApsaraVideo VOD console and set the download method to secure download. For more information, see <a href="https://help.aliyun.com/document_detail/86107.html">Configure download settings</a>.</p>
     * <ul>
     * <li>After you generate a key for secure download, you must configure the key in ApsaraVideo Player SDK. For more information, see <a href="https://help.aliyun.com/document_detail/124735.html">Secure download</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of GenerateDownloadSecretKey  GenerateDownloadSecretKeyRequest
     * @return GenerateDownloadSecretKeyResponse
     */
    @Override
    public CompletableFuture<GenerateDownloadSecretKeyResponse> generateDownloadSecretKey(GenerateDownloadSecretKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GenerateDownloadSecretKey").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GenerateDownloadSecretKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GenerateDownloadSecretKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GenerateKMSDataKey  GenerateKMSDataKeyRequest
     * @return GenerateKMSDataKeyResponse
     */
    @Override
    public CompletableFuture<GenerateKMSDataKeyResponse> generateKMSDataKey(GenerateKMSDataKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GenerateKMSDataKey").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GenerateKMSDataKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GenerateKMSDataKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Regions that support this operation: <strong>China (Beijing)</strong> and <strong>China (Shanghai)</strong>.</p>
     * <ul>
     * <li>Call the <a href="~~SubmitAIImageJob~~">SubmitAIImageJob</a> operation to submit image AI processing jobs before you call this operation to query image AI processing jobs.</li>
     * <li>You can query a maximum of 10 jobs of image AI processing in one request.</li>
     * </ul>
     * 
     * @param request the request parameters of GetAIImageJobs  GetAIImageJobsRequest
     * @return GetAIImageJobsResponse
     */
    @Override
    public CompletableFuture<GetAIImageJobsResponse> getAIImageJobs(GetAIImageJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAIImageJobs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAIImageJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAIImageJobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>ApsaraVideo VOD stores the snapshots of the intelligent review results free of charge for two weeks. After this period, the snapshots are automatically deleted.</p>
     * 
     * @param request the request parameters of GetAIMediaAuditJob  GetAIMediaAuditJobRequest
     * @return GetAIMediaAuditJobResponse
     */
    @Override
    public CompletableFuture<GetAIMediaAuditJobResponse> getAIMediaAuditJob(GetAIMediaAuditJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAIMediaAuditJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAIMediaAuditJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAIMediaAuditJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Regions that support this operation: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</p>
     * <ul>
     * <li>Before you call this operation to query details of an AI template, you must obtain the ID of the AI template.</li>
     * </ul>
     * 
     * @param request the request parameters of GetAITemplate  GetAITemplateRequest
     * @return GetAITemplateResponse
     */
    @Override
    public CompletableFuture<GetAITemplateResponse> getAITemplate(GetAITemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAITemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAITemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAITemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Regions that support this operation: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</p>
     * <ul>
     * <li>You can obtain the smart tagging results by using the video ID.</li>
     * </ul>
     * 
     * @param request the request parameters of GetAIVideoTagResult  GetAIVideoTagResultRequest
     * @return GetAIVideoTagResultResponse
     */
    @Override
    public CompletableFuture<GetAIVideoTagResultResponse> getAIVideoTagResult(GetAIVideoTagResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAIVideoTagResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAIVideoTagResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAIVideoTagResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can specify multiple accelerated domain names in a request.</p>
     * 
     * @param request the request parameters of GetAppInfos  GetAppInfosRequest
     * @return GetAppInfosResponse
     */
    @Override
    public CompletableFuture<GetAppInfosResponse> getAppInfos(GetAppInfosRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAppInfos").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAppInfosResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAppInfosResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can query information about up to 20 auxiliary media assets in a request.</p>
     * 
     * @param request the request parameters of GetAttachedMediaInfo  GetAttachedMediaInfoRequest
     * @return GetAttachedMediaInfoResponse
     */
    @Override
    public CompletableFuture<GetAttachedMediaInfoResponse> getAttachedMediaInfo(GetAttachedMediaInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAttachedMediaInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAttachedMediaInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAttachedMediaInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAuditHistory  GetAuditHistoryRequest
     * @return GetAuditHistoryResponse
     */
    @Override
    public CompletableFuture<GetAuditHistoryResponse> getAuditHistory(GetAuditHistoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAuditHistory").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAuditHistoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAuditHistoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetCategories  GetCategoriesRequest
     * @return GetCategoriesResponse
     */
    @Override
    public CompletableFuture<GetCategoriesResponse> getCategories(GetCategoriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCategories").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCategoriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCategoriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Regions that support this operation: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</p>
     * <ul>
     * <li>You can query information only about the default AI template for automated review.</li>
     * </ul>
     * 
     * @param request the request parameters of GetDefaultAITemplate  GetDefaultAITemplateRequest
     * @return GetDefaultAITemplateResponse
     */
    @Override
    public CompletableFuture<GetDefaultAITemplateResponse> getDefaultAITemplate(GetDefaultAITemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDefaultAITemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDefaultAITemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDefaultAITemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation is supported only in the China (Shanghai) and China (Beijing) regions.</p>
     * <ul>
     * <li>You can call this operation to query the watermark content after you call the <a href="~~SubmitDigitalWatermarkExtractJob~~">SubmitDigitalWatermarkExtractJob</a> operation to extract the copyright or user-tracing watermark in a video.</li>
     * <li>You can query watermark content extracted only from watermark extraction jobs that are submitted in the last 2 years.</li>
     * </ul>
     * 
     * @param request the request parameters of GetDigitalWatermarkExtractResult  GetDigitalWatermarkExtractResultRequest
     * @return GetDigitalWatermarkExtractResultResponse
     */
    @Override
    public CompletableFuture<GetDigitalWatermarkExtractResultResponse> getDigitalWatermarkExtractResult(GetDigitalWatermarkExtractResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDigitalWatermarkExtractResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDigitalWatermarkExtractResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDigitalWatermarkExtractResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetEditingProject  GetEditingProjectRequest
     * @return GetEditingProjectResponse
     */
    @Override
    public CompletableFuture<GetEditingProjectResponse> getEditingProject(GetEditingProjectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetEditingProject").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetEditingProjectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetEditingProjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>During editing, you can add materials to the timeline, but some of them may not be used.</p>
     * 
     * @param request the request parameters of GetEditingProjectMaterials  GetEditingProjectMaterialsRequest
     * @return GetEditingProjectMaterialsResponse
     */
    @Override
    public CompletableFuture<GetEditingProjectMaterialsResponse> getEditingProjectMaterials(GetEditingProjectMaterialsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetEditingProjectMaterials").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetEditingProjectMaterialsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetEditingProjectMaterialsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetImageInfo  GetImageInfoRequest
     * @return GetImageInfoResponse
     */
    @Override
    public CompletableFuture<GetImageInfoResponse> getImageInfo(GetImageInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetImageInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetImageInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetImageInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call the <a href="~~CreateUploadImage~~">CreateUploadImage</a> operation to upload images to ApsaraVideo VOD and call this operation to query the basic information about multiple images at a time.</p>
     * <ul>
     * <li>To query information about video snapshots, call the <a href="~~ListSnapshots~~">ListSnapshots</a> operation.</li>
     * <li>You can specify up to 20 image IDs in one call.</li>
     * </ul>
     * 
     * @param request the request parameters of GetImageInfos  GetImageInfosRequest
     * @return GetImageInfosResponse
     */
    @Override
    public CompletableFuture<GetImageInfosResponse> getImageInfos(GetImageInfosRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetImageInfos").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetImageInfosResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetImageInfosResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If notifications for the <a href="https://help.aliyun.com/document_detail/89576.html">CreateAuditComplete</a> event are configured, event notifications are sent to the callback URL after automated review is complete. You can call this operation to query the details of audio review results.</p>
     * 
     * @param request the request parameters of GetMediaAuditAudioResultDetail  GetMediaAuditAudioResultDetailRequest
     * @return GetMediaAuditAudioResultDetailResponse
     */
    @Override
    public CompletableFuture<GetMediaAuditAudioResultDetailResponse> getMediaAuditAudioResultDetail(GetMediaAuditAudioResultDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetMediaAuditAudioResultDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMediaAuditAudioResultDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMediaAuditAudioResultDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMediaAuditResult  GetMediaAuditResultRequest
     * @return GetMediaAuditResultResponse
     */
    @Override
    public CompletableFuture<GetMediaAuditResultResponse> getMediaAuditResult(GetMediaAuditResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetMediaAuditResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMediaAuditResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMediaAuditResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  By default, only details of snapshots that violate content regulations and potentially violate content regulations are returned.</p>
     * <ul>
     * <li>ApsaraVideo VOD stores the snapshots in the automated review results free of charge for two weeks. After this period, the snapshots are automatically deleted.</li>
     * <li>This operation is available only in the Singapore region.</li>
     * </ul>
     * 
     * @param request the request parameters of GetMediaAuditResultDetail  GetMediaAuditResultDetailRequest
     * @return GetMediaAuditResultDetailResponse
     */
    @Override
    public CompletableFuture<GetMediaAuditResultDetailResponse> getMediaAuditResultDetail(GetMediaAuditResultDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetMediaAuditResultDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMediaAuditResultDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMediaAuditResultDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> By default, only details of snapshots that violate content regulations and potentially violate content regulations are returned.
     * This operation is available only in the Singapore region.</p>
     * </blockquote>
     * 
     * @param request the request parameters of GetMediaAuditResultTimeline  GetMediaAuditResultTimelineRequest
     * @return GetMediaAuditResultTimelineResponse
     */
    @Override
    public CompletableFuture<GetMediaAuditResultTimelineResponse> getMediaAuditResultTimeline(GetMediaAuditResultTimelineRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetMediaAuditResultTimeline").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMediaAuditResultTimelineResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMediaAuditResultTimelineResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Regions that support this operation: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</p>
     * 
     * @param request the request parameters of GetMediaDNAResult  GetMediaDNAResultRequest
     * @return GetMediaDNAResultResponse
     */
    @Override
    public CompletableFuture<GetMediaDNAResultResponse> getMediaDNAResult(GetMediaDNAResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetMediaDNAResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMediaDNAResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMediaDNAResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can query the information about all media files or a specific media file in a refresh or prefetch job.</p>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 50 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limits on API operations in ApsaraVideo VoD</a>.</p>
     * 
     * @param request the request parameters of GetMediaRefreshJobs  GetMediaRefreshJobsRequest
     * @return GetMediaRefreshJobsResponse
     */
    @Override
    public CompletableFuture<GetMediaRefreshJobsResponse> getMediaRefreshJobs(GetMediaRefreshJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetMediaRefreshJobs").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMediaRefreshJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMediaRefreshJobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/55627.html">Event notification</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of GetMessageCallback  GetMessageCallbackRequest
     * @return GetMessageCallbackResponse
     */
    @Override
    public CompletableFuture<GetMessageCallbackResponse> getMessageCallback(GetMessageCallbackRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetMessageCallback").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMessageCallbackResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMessageCallbackResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can obtain complete information about the source file only after a stream is transcoded.</p>
     * 
     * @param request the request parameters of GetMezzanineInfo  GetMezzanineInfoRequest
     * @return GetMezzanineInfoResponse
     */
    @Override
    public CompletableFuture<GetMezzanineInfoResponse> getMezzanineInfo(GetMezzanineInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetMezzanineInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMezzanineInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMezzanineInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  <strong>Make sure that you understand the billing method and price of ApsaraVideo VOD before you call this operation. You are charged for outbound traffic when you download or play videos based on URLs in ApsaraVideo VOD. For more information about billing of outbound traffic, see <a href="~~188308#section-rwh-e88-f7j~~">Billing of outbound traffic</a>. If you have configured an accelerated domain name, see <a href="~~188308#section-c5t-oq9-15e~~">Billing of the acceleration service</a>. If you have activated the acceleration service, you are charged acceleration fees when you upload media files to ApsaraVideo VOD. For more information, see <a href="~~188310#section_sta_zm2_tsv~~">Billing of acceleration traffic</a>.</strong></p>
     * <ul>
     * <li>Only videos whose Status is Normal can be played. For more information, see <a href="https://help.aliyun.com/document_detail/57290.html">Overview</a>.</li>
     * <li>If video playback fails, you can call the <a href="~~GetMezzanineInfo~~">GetMezzanineInfo</a> operation to check whether the video source information is correct.</li>
     * </ul>
     * 
     * @param request the request parameters of GetPlayInfo  GetPlayInfoRequest
     * @return GetPlayInfoResponse
     */
    @Override
    public CompletableFuture<GetPlayInfoResponse> getPlayInfo(GetPlayInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetPlayInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPlayInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPlayInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  An audio or video file may be transcoded multiple times. This operation returns only the latest transcoding summary.</p>
     * <ul>
     * <li>You can query transcoding summaries for a maximum of 10 audio and video files in one request.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/109120.html">ListTranscodeTask</a> operation to query historical transcoding tasks.</li>
     * <li>**You can call this operation to query information only about transcoding tasks created within the past year.</li>
     * </ul>
     * 
     * @param request the request parameters of GetTranscodeSummary  GetTranscodeSummaryRequest
     * @return GetTranscodeSummaryResponse
     */
    @Override
    public CompletableFuture<GetTranscodeSummaryResponse> getTranscodeSummary(GetTranscodeSummaryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetTranscodeSummary").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTranscodeSummaryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTranscodeSummaryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query only transcoding tasks created within the past year.</p>
     * 
     * @param request the request parameters of GetTranscodeTask  GetTranscodeTaskRequest
     * @return GetTranscodeTaskResponse
     */
    @Override
    public CompletableFuture<GetTranscodeTaskResponse> getTranscodeTask(GetTranscodeTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetTranscodeTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTranscodeTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTranscodeTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation returns information about the specified transcoding template group and the configurations of all the transcoding templates in the group.</p>
     * 
     * @param request the request parameters of GetTranscodeTemplateGroup  GetTranscodeTemplateGroupRequest
     * @return GetTranscodeTemplateGroupResponse
     */
    @Override
    public CompletableFuture<GetTranscodeTemplateGroupResponse> getTranscodeTemplateGroup(GetTranscodeTemplateGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetTranscodeTemplateGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTranscodeTemplateGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTranscodeTemplateGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can query the information about a URL-based upload job by specifying the upload URL or using the job ID returned when you upload media files. The information includes the status of the upload job, custom configurations, the time when the job was created, and the time when the job was complete.
     * If the upload fails, you can view the error code and error message. If the upload is successful, you can obtain the video ID.</p>
     * 
     * @param request the request parameters of GetURLUploadInfos  GetURLUploadInfosRequest
     * @return GetURLUploadInfosResponse
     */
    @Override
    public CompletableFuture<GetURLUploadInfosResponse> getURLUploadInfos(GetURLUploadInfosRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetURLUploadInfos").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetURLUploadInfosResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetURLUploadInfosResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to obtain the upload details only about audio and video files.</p>
     * <ul>
     * <li>If you use the ApsaraVideo VOD console to upload audio and video files, you can call this operation to query information such as the upload ratio. If you use an upload SDK to upload audio and video files, make sure that the version of the <a href="https://help.aliyun.com/document_detail/52200.html">upload SDK</a> meets one of the following requirements:<ul>
     * <li>The version of the upload SDK for Java is 1.4.4 or later.</li>
     * <li>The version of the upload SDK for C++ is 1.0.0 or later.</li>
     * <li>The version of the upload SDK for PHP is 1.0.2 or later.</li>
     * <li>The version of the upload SDK for Python is 1.3.0 or later.</li>
     * <li>The version of the upload SDK for JavaScript is 1.4.0 or later.</li>
     * <li>The version of the upload SDK for Android is 1.5.0 or later.</li>
     * <li>The version of the upload SDK for iOS is 1.5.0 or later.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetUploadDetails  GetUploadDetailsRequest
     * @return GetUploadDetailsResponse
     */
    @Override
    public CompletableFuture<GetUploadDetailsResponse> getUploadDetails(GetUploadDetailsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetUploadDetails").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetUploadDetailsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetUploadDetailsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>After a media file is uploaded, ApsaraVideo VOD processes the source file. Then, information about the media file is asynchronously generated. You can configure notifications for the <a href="https://help.aliyun.com/document_detail/99935.html">VideoAnalysisComplete</a> event and call this operation to query information about a media file after you receive notifications for the <a href="https://help.aliyun.com/document_detail/99935.html">VideoAnalysisComplete</a> event. For more information, see <a href="https://help.aliyun.com/document_detail/55627.html">Overview</a>.</p>
     * 
     * @param request the request parameters of GetVideoInfo  GetVideoInfoRequest
     * @return GetVideoInfoResponse
     */
    @Override
    public CompletableFuture<GetVideoInfoResponse> getVideoInfo(GetVideoInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetVideoInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetVideoInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetVideoInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can specify up to 20 audio or video file IDs in each request.</p>
     * <ul>
     * <li>After a media file is uploaded, ApsaraVideo VOD processes the source file. Then, information about the media file is asynchronously generated. You can configure notifications for the <a href="https://help.aliyun.com/document_detail/99935.html">VideoAnalysisComplete</a> event and call this operation to query information about a media file after you receive notifications for the <a href="https://help.aliyun.com/document_detail/99935.html">VideoAnalysisComplete</a> event. For more information, see <a href="https://help.aliyun.com/document_detail/55627.html">Overview</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of GetVideoInfos  GetVideoInfosRequest
     * @return GetVideoInfosResponse
     */
    @Override
    public CompletableFuture<GetVideoInfosResponse> getVideoInfos(GetVideoInfosRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetVideoInfos").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetVideoInfosResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetVideoInfosResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query information about media files based on the filter conditions that you specify, such as video status and category ID. Information about a maximum of <strong>5,000</strong> media files can be returned for each request. We recommend that you set the StartTime and EndTime parameters to specify a time range for each request. For more information about how to query information about more media files or even all media files, see <a href="https://help.aliyun.com/document_detail/86044.html">SearchMedia</a>.</p>
     * 
     * @param request the request parameters of GetVideoList  GetVideoListRequest
     * @return GetVideoListResponse
     */
    @Override
    public CompletableFuture<GetVideoListResponse> getVideoList(GetVideoListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetVideoList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetVideoListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetVideoListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to obtain a playback credential when you use ApsaraVideo Player SDK to play a media file based on PlayAuth. The credential is used to obtain the playback URL. For more information, see <a href="https://help.aliyun.com/document_detail/125579.html">ApsaraVideo Player SDK</a>.</p>
     * <ul>
     * <li>You cannot obtain the playback URL of a video by using a credential that has expired. A new credential is required.</li>
     * </ul>
     * 
     * @param request the request parameters of GetVideoPlayAuth  GetVideoPlayAuthRequest
     * @return GetVideoPlayAuthResponse
     */
    @Override
    public CompletableFuture<GetVideoPlayAuthResponse> getVideoPlayAuth(GetVideoPlayAuthRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetVideoPlayAuth").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetVideoPlayAuthResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetVideoPlayAuthResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetVodTemplate  GetVodTemplateRequest
     * @return GetVodTemplateResponse
     */
    @Override
    public CompletableFuture<GetVodTemplateResponse> getVodTemplate(GetVodTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetVodTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetVodTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetVodTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetWatermark  GetWatermarkRequest
     * @return GetWatermarkResponse
     */
    @Override
    public CompletableFuture<GetWatermarkResponse> getWatermark(GetWatermarkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetWatermark").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetWatermarkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetWatermarkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Regions that support this operation: <strong>China (Beijing)</strong> and <strong>China (Shanghai)</strong>.</p>
     * <ul>
     * <li>You can call this operation to query AI processing results about images of a specified video. Images of different videos cannot be queried in one request.</li>
     * </ul>
     * 
     * @param request the request parameters of ListAIImageInfo  ListAIImageInfoRequest
     * @return ListAIImageInfoResponse
     */
    @Override
    public CompletableFuture<ListAIImageInfoResponse> listAIImageInfo(ListAIImageInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAIImageInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAIImageInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAIImageInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Regions that support this operation: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</p>
     * <ul>
     * <li>You can call this operation to query video fingerprinting jobs and smart tagging jobs.</li>
     * </ul>
     * 
     * @param request the request parameters of ListAIJob  ListAIJobRequest
     * @return ListAIJobResponse
     */
    @Override
    public CompletableFuture<ListAIJobResponse> listAIJob(ListAIJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAIJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAIJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAIJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Regions that support this operation: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</p>
     * <ul>
     * <li>You can call this operation to query AI templates of a specified type.</li>
     * </ul>
     * 
     * @param request the request parameters of ListAITemplate  ListAITemplateRequest
     * @return ListAITemplateResponse
     */
    @Override
    public CompletableFuture<ListAITemplateResponse> listAITemplate(ListAITemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAITemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAITemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAITemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <p>You can query applications based on states.</p>
     * <h3><a href="#qps-"></a>QPS limit</h3>
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limits on API operations</a>.</p>
     * 
     * @param request the request parameters of ListAppInfo  ListAppInfoRequest
     * @return ListAppInfoResponse
     */
    @Override
    public CompletableFuture<ListAppInfoResponse> listAppInfo(ListAppInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAppInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAppInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAppInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The IdentityType and IdentityName parameters take effect only when an identity assumes the application administrator role to call this operation. Otherwise, only application policies that are attached to the current identity are returned.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListAppPoliciesForIdentity  ListAppPoliciesForIdentityRequest
     * @return ListAppPoliciesForIdentityResponse
     */
    @Override
    public CompletableFuture<ListAppPoliciesForIdentityResponse> listAppPoliciesForIdentity(ListAppPoliciesForIdentityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAppPoliciesForIdentity").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAppPoliciesForIdentityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAppPoliciesForIdentityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAuditSecurityIp  ListAuditSecurityIpRequest
     * @return ListAuditSecurityIpResponse
     */
    @Override
    public CompletableFuture<ListAuditSecurityIpResponse> listAuditSecurityIp(ListAuditSecurityIpRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAuditSecurityIp").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAuditSecurityIpResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAuditSecurityIpResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDynamicImage  ListDynamicImageRequest
     * @return ListDynamicImageResponse
     */
    @Override
    public CompletableFuture<ListDynamicImageResponse> listDynamicImage(ListDynamicImageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDynamicImage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDynamicImageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDynamicImageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can query up to 5,000 videos based on the specified filter condition.</p>
     * 
     * @param request the request parameters of ListLiveRecordVideo  ListLiveRecordVideoRequest
     * @return ListLiveRecordVideoResponse
     */
    @Override
    public CompletableFuture<ListLiveRecordVideoResponse> listLiveRecordVideo(ListLiveRecordVideoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListLiveRecordVideo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListLiveRecordVideoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListLiveRecordVideoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If multiple snapshots exist for a video, you can call this operation to query information about the latest snapshot.</p>
     * 
     * @param request the request parameters of ListSnapshots  ListSnapshotsRequest
     * @return ListSnapshotsResponse
     */
    @Override
    public CompletableFuture<ListSnapshotsResponse> listSnapshots(ListSnapshotsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListSnapshots").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSnapshotsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSnapshotsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call the <a href="https://help.aliyun.com/document_detail/109121.html">GetTranscodeTask</a> operation to query details about transcoding jobs.</p>
     * <ul>
     * <li><strong>You can call this operation to query only transcoding tasks created within the past year.</strong></li>
     * </ul>
     * 
     * @param request the request parameters of ListTranscodeTask  ListTranscodeTaskRequest
     * @return ListTranscodeTaskResponse
     */
    @Override
    public CompletableFuture<ListTranscodeTaskResponse> listTranscodeTask(ListTranscodeTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTranscodeTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTranscodeTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTranscodeTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation does not return the configurations of transcoding templates in each transcoding template group. To query the configurations of transcoding templates in a specific transcoding template group, call the <a href="https://help.aliyun.com/document_detail/102670.html">GetTranscodeTemplateGroup</a> operation.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListTranscodeTemplateGroup  ListTranscodeTemplateGroupRequest
     * @return ListTranscodeTemplateGroupResponse
     */
    @Override
    public CompletableFuture<ListTranscodeTemplateGroupResponse> listTranscodeTemplateGroup(ListTranscodeTemplateGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTranscodeTemplateGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTranscodeTemplateGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTranscodeTemplateGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListVodTemplate  ListVodTemplateRequest
     * @return ListVodTemplateResponse
     */
    @Override
    public CompletableFuture<ListVodTemplateResponse> listVodTemplate(ListVodTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListVodTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListVodTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListVodTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListWatermark  ListWatermarkRequest
     * @return ListWatermarkResponse
     */
    @Override
    public CompletableFuture<ListWatermarkResponse> listWatermark(ListWatermarkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListWatermark").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListWatermarkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListWatermarkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of MoveAppResource  MoveAppResourceRequest
     * @return MoveAppResourceResponse
     */
    @Override
    public CompletableFuture<MoveAppResourceResponse> moveAppResource(MoveAppResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("MoveAppResource").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MoveAppResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MoveAppResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>This operation is available only in the <strong>China (Shanghai)</strong> region.</li>
     * <li>You can submit a maximum of 500 requests to prefetch resources based on URLs each day by using an Alibaba Cloud account. You cannot prefetch resources based on directories.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/69215.html">RefreshVodObjectCaches</a> operation to refresh content and the <a href="https://help.aliyun.com/document_detail/69211.htmll">PreloadVodObjectCaches</a> operation to prefetch content.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of PreloadVodObjectCaches  PreloadVodObjectCachesRequest
     * @return PreloadVodObjectCachesResponse
     */
    @Override
    public CompletableFuture<PreloadVodObjectCachesResponse> preloadVodObjectCaches(PreloadVodObjectCachesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PreloadVodObjectCaches").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PreloadVodObjectCachesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PreloadVodObjectCachesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  <strong>Make sure that you understand the billing method and price of ApsaraVideo VOD before you call this operation. You are charged for using the online editing feature. For more information, see <a href="~~188310#section-pyv-b8h-bo7~~">Billing</a>.</strong></p>
     * <ul>
     * <li>This operation returns only the submission result of a video production task. When the submission result is returned, video production may still be in progress. After a video production task is submitted, the task is queued in the background for asynchronous processing.</li>
     * <li>The source files that are used in the timeline of an online editing project can be materials directly uploaded to the online project or selected from the media asset library. Only media assets that are in the Normal state can be used in the project.</li>
     * <li>Videos are produced based on ProjectId and Timeline. The following content describes the parameter configurations:<ul>
     * <li>You must specify ProjectId or Timeline. If you leave both parameters empty, the video cannot be produced.</li>
     * <li>If you specify Timeline and leave ProjectId empty, the system automatically creates an online editing project based on Timeline and adds the materials specified in the Timeline to the project to produce videos.</li>
     * <li>If you specify ProjectId and leave Timeline empty, the system automatically uses the latest timeline information of the project to produce videos.</li>
     * <li>If you specify both ProjectId and Timeline, the system automatically uses the timeline information that you specified to produce videos and updates the project timeline and materials. You can also specify other parameters to update the corresponding information about the online editing project.</li>
     * </ul>
     * </li>
     * <li>You can create up to 100 video tracks, 100 image tracks, and 100 subtitle tracks in a project.</li>
     * <li>The total size of material files cannot exceed 1 TB.</li>
     * <li>The buckets in which the materials reside and where the exported videos are stored must be in the same region as the region where ApsaraVideo VOD is activated.</li>
     * <li>The exported videos must meet the following requirements:<ul>
     * <li>The width and height of the video image cannot be less than 128 pixels.</li>
     * <li>The width and height of the video image cannot exceed 4,096 pixels.</li>
     * <li>The width cannot exceed 2,160 pixels.</li>
     * </ul>
     * </li>
     * <li>After a video is produced, the video is automatically uploaded to ApsaraVideo VOD. Then, the <strong>ProduceMediaComplete</strong> and <strong>FileUploadComplete</strong> event notifications are sent to you. After the produced video is transcoded, the <strong>StreamTranscodeComplete</strong> and <strong>TranscodeComplete</strong> event notifications are sent to you.</li>
     * <li>You can add special effects to the video. For more information, see <a href="https://help.aliyun.com/document_detail/69082.html">Special effects</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of ProduceEditingProjectVideo  ProduceEditingProjectVideoRequest
     * @return ProduceEditingProjectVideoResponse
     */
    @Override
    public CompletableFuture<ProduceEditingProjectVideoResponse> produceEditingProjectVideo(ProduceEditingProjectVideoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ProduceEditingProjectVideo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ProduceEditingProjectVideoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ProduceEditingProjectVideoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  ApsaraVideo VOD allows you to purge and prefetch resources. The purge feature forces the point of presence (POP) to clear cached resources and retrieve the latest resources from origin servers. The prefetch feature allows the POP to retrieve frequently accessed resources from origin servers during off-peak hours. This increases the cache hit ratio.</p>
     * <ul>
     * <li>You can call this operation to submit purge or prefetch tasks based on the media ID. You can also specify the format and resolution of the media streams to purge or prefetch based on your business requirements.</li>
     * <li>You can submit a maximum of 20 purge or prefetch tasks at a time.</li>
     * </ul>
     * 
     * @param request the request parameters of RefreshMediaPlayUrls  RefreshMediaPlayUrlsRequest
     * @return RefreshMediaPlayUrlsResponse
     */
    @Override
    public CompletableFuture<RefreshMediaPlayUrlsResponse> refreshMediaPlayUrls(RefreshMediaPlayUrlsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RefreshMediaPlayUrls").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RefreshMediaPlayUrlsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RefreshMediaPlayUrlsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can also call this operation to overwrite the source file of an audio or video file. After you call this operation, the system obtains the upload URL and uploads a new source file without changing the ID of the audio or video file. If you have configured transcoding or snapshot capture for the upload, the transcoding or snapshot capture job is automatically triggered. For more information, see <a href="https://help.aliyun.com/document_detail/55397.html">Upload URLs and credentials</a>.</p>
     * 
     * @param request the request parameters of RefreshUploadVideo  RefreshUploadVideoRequest
     * @return RefreshUploadVideoResponse
     */
    @Override
    public CompletableFuture<RefreshUploadVideoResponse> refreshUploadVideo(RefreshUploadVideoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RefreshUploadVideo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RefreshUploadVideoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RefreshUploadVideoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * <ul>
     * <li>You can submit a maximum of 2,000 requests to refresh resources based on URLs and 100 requests to refresh resources based on directories each day by using an Alibaba Cloud account.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/69215.html">RefreshVodObjectCaches</a> operation to refresh content and the <a href="https://help.aliyun.com/document_detail/69211.html">PreloadVodObjectCaches</a> operation to prefetch content.</li>
     * </ul>
     * 
     * @param request the request parameters of RefreshVodObjectCaches  RefreshVodObjectCachesRequest
     * @return RefreshVodObjectCachesResponse
     */
    @Override
    public CompletableFuture<RefreshVodObjectCachesResponse> refreshVodObjectCaches(RefreshVodObjectCachesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RefreshVodObjectCaches").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RefreshVodObjectCachesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RefreshVodObjectCachesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  After you add an OSS bucket to ApsaraVideo VOD, you must register media files in the OSS bucket to generate the required information. Then, you can use media IDs for features such as transcoding, snapshot capture, and AI processing.use features such as xxx on media files by specifying their IDs?</p>
     * <ul>
     * <li>You can register up to 10 media files in an OSS bucket in a request. The media files must be stored in the same bucket.</li>
     * <li>If you do not specify a transcoding template group ID when you upload a media file to ApsaraVideo VOD, the media file is automatically transcoded based on the default template group. If you do not specify a transcoding template group ID after you register a media file, the media file is not automatically transcoded. The registered media files are automatically transcoded only if you specify a transcoding template group ID.</li>
     * <li>If the media file that you want to register has been registered, this operation returns only the unique media ID that is associated with the media file. No further operation is performed.</li>
     * <li>Make sure that the media file that you want to register has a valid suffix. Otherwise, the registration fails.</li>
     * </ul>
     * 
     * @param request the request parameters of RegisterMedia  RegisterMediaRequest
     * @return RegisterMediaResponse
     */
    @Override
    public CompletableFuture<RegisterMediaResponse> registerMedia(RegisterMediaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RegisterMedia").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RegisterMediaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RegisterMediaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to restore only Archive and Cold Archive audio and video files. You can access the audio and video files after the files are restored. You cannot change the storage class of an audio or video file that is being restored. You are charged for the retrieval traffic generated during restoration. After a Cold Archive audio or video file is restored, a Standard replica of the file is generated for access. You are charged for the storage of the replica before the file returns to the frozen state.</p>
     * 
     * @param request the request parameters of RestoreMedia  RestoreMediaRequest
     * @return RestoreMediaResponse
     */
    @Override
    public CompletableFuture<RestoreMediaResponse> restoreMedia(RestoreMediaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RestoreMedia").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RestoreMediaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RestoreMediaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SearchEditingProject  SearchEditingProjectRequest
     * @return SearchEditingProjectResponse
     */
    @Override
    public CompletableFuture<SearchEditingProjectResponse> searchEditingProject(SearchEditingProjectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SearchEditingProject").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SearchEditingProjectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SearchEditingProjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The maximum number of data records that you can query varies based on the method used to query the data. You can use the following methods to query data:</p>
     * <ul>
     * <li>Method 1: Traverse data by page
     * You can use the PageNo and PageSize parameters to traverse up to 5,000 data records that meet the specified filter condition. PageNo specifies the page number and PageSize specifies the number of data records displayed on a page. If the number of data records that meet the specified filter condition exceeds 5,000, change the filter conditions to narrow down the results. You cannot use this method to traverse all data records. If you want to traverse more data records, use Method 2.</li>
     * <li>Method 2: Traverse all data (available only for audio and video files)
     * You can use this method to traverse up to 2 million data records related to audio and video files. If the number of data records that meet the specified filter condition exceeds 2 million, change the filter conditions to narrow down the results. To traverse data page by page, you must set the PageNo, PageSize, and ScrollToken parameters. The total number of data records from the current page to the target page cannot exceed 100. For example, you set PageSize to 20. The following content describes the traverse logic:<ul>
     * <li>When the PageNo parameter is set to 1, you can traverse data records from page 1 to page 5.</li>
     * <li>When the PageNo parameter is set to 2, you can traverse data records from page 2 to page 6.
     * Make sure that you set the appropriate page number and page size, and use a traverse method based on the number of results that meet your filter condition.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of SearchMedia  SearchMediaRequest
     * @return SearchMediaResponse
     */
    @Override
    public CompletableFuture<SearchMediaResponse> searchMedia(SearchMediaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SearchMedia").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SearchMediaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SearchMediaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can play videos in the Checking or Blocked state only from the IP addresses that are added to review security groups.</p>
     * 
     * @param request the request parameters of SetAuditSecurityIp  SetAuditSecurityIpRequest
     * @return SetAuditSecurityIpResponse
     */
    @Override
    public CompletableFuture<SetAuditSecurityIpResponse> setAuditSecurityIp(SetAuditSecurityIpRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetAuditSecurityIp").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetAuditSecurityIpResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetAuditSecurityIpResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>After you use the cross-domain policy file to update the resources on the origin server, you must refresh the resources that are cached on Alibaba Cloud CDN nodes. You can use the ApsaraVideo VOD console to refresh resources. For more information, see <a href="https://help.aliyun.com/document_detail/86098.html">Refresh and prefetch</a>. Alternatively, you can call the <a href="https://help.aliyun.com/document_detail/69215.html">RefreshVodObjectCaches</a> operation to refresh resources.</p>
     * </blockquote>
     * 
     * @param request the request parameters of SetCrossdomainContent  SetCrossdomainContentRequest
     * @return SetCrossdomainContentResponse
     */
    @Override
    public CompletableFuture<SetCrossdomainContentResponse> setCrossdomainContent(SetCrossdomainContentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetCrossdomainContent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetCrossdomainContentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetCrossdomainContentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Specifies an AI template as the default template.</p>
     * 
     * @param request the request parameters of SetDefaultAITemplate  SetDefaultAITemplateRequest
     * @return SetDefaultAITemplateResponse
     */
    @Override
    public CompletableFuture<SetDefaultAITemplateResponse> setDefaultAITemplate(SetDefaultAITemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetDefaultAITemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetDefaultAITemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetDefaultAITemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetDefaultTranscodeTemplateGroup  SetDefaultTranscodeTemplateGroupRequest
     * @return SetDefaultTranscodeTemplateGroupResponse
     */
    @Override
    public CompletableFuture<SetDefaultTranscodeTemplateGroupResponse> setDefaultTranscodeTemplateGroup(SetDefaultTranscodeTemplateGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetDefaultTranscodeTemplateGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetDefaultTranscodeTemplateGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetDefaultTranscodeTemplateGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetDefaultWatermark  SetDefaultWatermarkRequest
     * @return SetDefaultWatermarkResponse
     */
    @Override
    public CompletableFuture<SetDefaultWatermarkResponse> setDefaultWatermark(SetDefaultWatermarkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetDefaultWatermark").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetDefaultWatermarkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetDefaultWatermarkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetEditingProjectMaterials  SetEditingProjectMaterialsRequest
     * @return SetEditingProjectMaterialsResponse
     */
    @Override
    public CompletableFuture<SetEditingProjectMaterialsResponse> setEditingProjectMaterials(SetEditingProjectMaterialsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetEditingProjectMaterials").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetEditingProjectMaterialsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetEditingProjectMaterialsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>HTTP callbacks and MNS callbacks are supported. For more information, see <a href="https://help.aliyun.com/document_detail/55627.html">Overview</a>.</p>
     * 
     * @param request the request parameters of SetMessageCallback  SetMessageCallbackRequest
     * @return SetMessageCallbackResponse
     */
    @Override
    public CompletableFuture<SetMessageCallbackResponse> setMessageCallback(SetMessageCallbackRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetMessageCallback").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetMessageCallbackResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetMessageCallbackResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * </blockquote>
     * 
     * @param request the request parameters of SetVodDomainCertificate  SetVodDomainCertificateRequest
     * @return SetVodDomainCertificateResponse
     */
    @Override
    public CompletableFuture<SetVodDomainCertificateResponse> setVodDomainCertificate(SetVodDomainCertificateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetVodDomainCertificate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetVodDomainCertificateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetVodDomainCertificateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetVodDomainSSLCertificate  SetVodDomainSSLCertificateRequest
     * @return SetVodDomainSSLCertificateResponse
     */
    @Override
    public CompletableFuture<SetVodDomainSSLCertificateResponse> setVodDomainSSLCertificate(SetVodDomainSSLCertificateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetVodDomainSSLCertificate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetVodDomainSSLCertificateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetVodDomainSSLCertificateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation is available only in the Singapore region.</p>
     * 
     * @param request the request parameters of SubmitAIImageAuditJob  SubmitAIImageAuditJobRequest
     * @return SubmitAIImageAuditJobResponse
     */
    @Override
    public CompletableFuture<SubmitAIImageAuditJobResponse> submitAIImageAuditJob(SubmitAIImageAuditJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitAIImageAuditJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitAIImageAuditJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitAIImageAuditJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Regions that support this operation: <strong>China (Beijing)</strong> and <strong>China (Shanghai)</strong>.</p>
     * <ul>
     * <li>After you call this operation, you can call the <a href="https://help.aliyun.com/document_detail/186923.html">GetAIImageJobs</a> operation to query the job execution result.</li>
     * </ul>
     * 
     * @param request the request parameters of SubmitAIImageJob  SubmitAIImageJobRequest
     * @return SubmitAIImageJobResponse
     */
    @Override
    public CompletableFuture<SubmitAIImageJobResponse> submitAIImageJob(SubmitAIImageJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitAIImageJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitAIImageJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitAIImageJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  <strong>Make sure that you understand the billing method and price of ApsaraVideo VOD before you call this operation. You are charged for using the smart tagging and video fingerprinting features. For more information, see <a href="~~188310#section-g7l-s3o-9ng~~">Billing of video AI</a>.</strong></p>
     * <ul>
     * <li>Regions that support the video fingerprinting feature: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>. Regions that support the smart tagging feature: <strong>China (Beijing)</strong> and <strong>China (Shanghai)</strong>.</li>
     * <li>You need to enable the video fingerprinting feature or the smart tagging feature before you can call this operation to submit jobs. For more information, see <a href="https://help.aliyun.com/document_detail/101148.html">Overview</a>.</li>
     * <li>If this is the first time you use the video fingerprinting feature, you must submit a ticket to apply for using the media fingerprint library for free. Otherwise, the video fingerprinting feature will be affected. For more information about how to submit a ticket, see <a href="https://help.aliyun.com/document_detail/464625.html">Contact us</a>.</li>
     * <li>After you submit an AI job, ApsaraVideo VOD asynchronously processes the job. The operation may return a response before the job is complete. You can configure the <a href="https://help.aliyun.com/document_detail/55627.html">Event Notification</a> feature and set the callback event to <strong>AI Processing Completed</strong>. After you receive the event notification, you can query the execution result of the AI job.</li>
     * </ul>
     * 
     * @param request the request parameters of SubmitAIJob  SubmitAIJobRequest
     * @return SubmitAIJobResponse
     */
    @Override
    public CompletableFuture<SubmitAIJobResponse> submitAIJob(SubmitAIJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitAIJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitAIJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitAIJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  <strong>Make sure that you understand the billing methods and price of ApsaraVideo VOD before you call this operation. You are charged for using the automated review feature. For more information about billing, submit a ticket or contact your account manager.</strong></p>
     * <ul>
     * <li>You can call this operation only in the <strong>China (Shanghai)</strong>, <strong>China (Beijing)</strong>, and <strong>Singapore</strong> regions.</li>
     * <li>For more information, see <a href="https://help.aliyun.com/document_detail/101148.html">Automated review</a>.</li>
     * <li>After an automated review job is complete, the images generated during the review are stored in the VOD bucket for two weeks free of charge. The images are automatically deleted after two weeks.</li>
     * </ul>
     * 
     * @param request the request parameters of SubmitAIMediaAuditJob  SubmitAIMediaAuditJobRequest
     * @return SubmitAIMediaAuditJobResponse
     */
    @Override
    public CompletableFuture<SubmitAIMediaAuditJobResponse> submitAIMediaAuditJob(SubmitAIMediaAuditJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitAIMediaAuditJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitAIMediaAuditJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitAIMediaAuditJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  <strong>Make sure that you understand the billing methods and price of ApsaraVideo VOD before you call this operation. You are charged for generating and extracting digital watermarks. For more information, see <a href="~~188310#62b9c940403se~~">Billing</a>.</strong></p>
     * <ul>
     * <li>This operation is supported only in the <strong>China (Shanghai)</strong> and <strong>China (Beijing)</strong> regions.</li>
     * <li>Before you submit a digital watermark extraction job, make sure that the following conditions are met:<ul>
     * <li>The video from which you want to extract the watermark is uploaded to the ApsaraVideo VOD.</li>
     * <li>The video from which you want to extract the watermark is longer than 6 minutes.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of SubmitDigitalWatermarkExtractJob  SubmitDigitalWatermarkExtractJobRequest
     * @return SubmitDigitalWatermarkExtractJobResponse
     */
    @Override
    public CompletableFuture<SubmitDigitalWatermarkExtractJobResponse> submitDigitalWatermarkExtractJob(SubmitDigitalWatermarkExtractJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitDigitalWatermarkExtractJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitDigitalWatermarkExtractJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitDigitalWatermarkExtractJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can capture a part of a video and generate animated images only when the video is in the <strong>Uploaded</strong>, <strong>Transcoding</strong>, <strong>Normal</strong>, <strong>Reviewing</strong>, or <strong>Flagged</strong> state.</p>
     * <ul>
     * <li>The fees for frame animation are included in your video transcoding bill. You are charged based on the output resolution and the duration. For more information, see <a href="https://help.aliyun.com/document_detail/188308.html">Billing of basic services</a>.</li>
     * </ul>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limit on API operations</a>.</p>
     * 
     * @param request the request parameters of SubmitDynamicImageJob  SubmitDynamicImageJobRequest
     * @return SubmitDynamicImageJobResponse
     */
    @Override
    public CompletableFuture<SubmitDynamicImageJobResponse> submitDynamicImageJob(SubmitDynamicImageJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitDynamicImageJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitDynamicImageJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitDynamicImageJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Regions that support this operation: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</p>
     * 
     * @param request the request parameters of SubmitMediaDNADeleteJob  SubmitMediaDNADeleteJobRequest
     * @return SubmitMediaDNADeleteJobResponse
     */
    @Override
    public CompletableFuture<SubmitMediaDNADeleteJobResponse> submitMediaDNADeleteJob(SubmitMediaDNADeleteJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitMediaDNADeleteJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitMediaDNADeleteJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitMediaDNADeleteJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  During video preprocessing, videos are transcoded to meet the playback requirements of the production studio. Therefore, <strong>you are charged for video preprocessing</strong>. For more information about billing, see <a href="https://help.aliyun.com/document_detail/64531.html">Billing of production studios</a>.</p>
     * <ul>
     * <li>You can obtain the preprocessing result in the <a href="https://help.aliyun.com/document_detail/55638.html">TranscodeComplete</a> event notification. If <strong>Preprocess=true</strong> is returned in the event notification, the video is transcoded.</li>
     * </ul>
     * 
     * @param request the request parameters of SubmitPreprocessJobs  SubmitPreprocessJobsRequest
     * @return SubmitPreprocessJobsResponse
     */
    @Override
    public CompletableFuture<SubmitPreprocessJobsResponse> submitPreprocessJobs(SubmitPreprocessJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitPreprocessJobs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitPreprocessJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitPreprocessJobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Only snapshots in the JPG format are generated.</p>
     * <ul>
     * <li>After a snapshot is captured, the <a href="https://help.aliyun.com/document_detail/57337.html">SnapshotComplete</a> callback is fired and EventType=SnapshotComplete, SubType=SpecifiedTime is returned.</li>
     * </ul>
     * <h3><a href="#qps-"></a>QPS limits</h3>
     * <p>You can call this operation up to 30 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of SubmitSnapshotJob  SubmitSnapshotJobRequest
     * @return SubmitSnapshotJobResponse
     */
    @Override
    public CompletableFuture<SubmitSnapshotJobResponse> submitSnapshotJob(SubmitSnapshotJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitSnapshotJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitSnapshotJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitSnapshotJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <ul>
     * <li><strong>Make sure that you understand the billing methods and prices of ApsaraVideo VOD before you call this operation. For more information about billing of the transcoding feature, see <a href="~~188308#section-ejb-nii-nqa~~">Billing of basic services</a>.</strong></li>
     * <li>You can transcode a video only in the Uploaded, Normal, or Reviewing state.</li>
     * <li>You can obtain the transcoding results from the <a href="https://help.aliyun.com/document_detail/55636.html">StreamTranscodeComplete</a> or <a href="https://help.aliyun.com/document_detail/55638.html">TranscodeComplete</a> callback.</li>
     * <li>You can call this operation to dynamically override the subtitle URL in an HTTP Live Streaming (HLS) packaging task. If the packaging task does not contain subtitles, we recommend that you specify the ID of the specific packaging template group when you upload the video instead of calling this operation.</li>
     * </ul>
     * 
     * @param request the request parameters of SubmitTranscodeJobs  SubmitTranscodeJobsRequest
     * @return SubmitTranscodeJobsResponse
     */
    @Override
    public CompletableFuture<SubmitTranscodeJobsResponse> submitTranscodeJobs(SubmitTranscodeJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitTranscodeJobs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitTranscodeJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitTranscodeJobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><strong>Make sure that you understand the billing method and price of ApsaraVideo VOD before you call this operation. When you use workflows to process videos, you may be charged for transcoding, encryption, and automated review. For more information, see <a href="https://help.aliyun.com/document_detail/188307.html">Billing overview</a>.</strong></p>
     * <ul>
     * <li>You can call this operation to initiate a VOD workflow to process media files. For more information, see <a href="https://help.aliyun.com/document_detail/115347.html">Workflows</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of SubmitWorkflowJob  SubmitWorkflowJobRequest
     * @return SubmitWorkflowJobResponse
     */
    @Override
    public CompletableFuture<SubmitWorkflowJobResponse> submitWorkflowJob(SubmitWorkflowJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitWorkflowJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitWorkflowJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitWorkflowJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Regions that support this operation: <strong>China (Beijing)</strong>, <strong>China (Shanghai)</strong>, and <strong>Singapore</strong>.</p>
     * <ul>
     * <li>After you call the <a href="https://help.aliyun.com/document_detail/102930.html">AddAITemplate</a> operation to add an AI template, you can call this operation to modify the AI template.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateAITemplate  UpdateAITemplateRequest
     * @return UpdateAITemplateResponse
     */
    @Override
    public CompletableFuture<UpdateAITemplateResponse> updateAITemplate(UpdateAITemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateAITemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAITemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAITemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>A single user can perform a maximum of 30 queries per second (QPS). Throttling is triggered when the number of calls per second exceeds the QPS limit. The throttling may affect your business. Thus, we recommend that you observe the QPS limit on this operation.</p>
     * 
     * @param request the request parameters of UpdateAppInfo  UpdateAppInfoRequest
     * @return UpdateAppInfoResponse
     */
    @Override
    public CompletableFuture<UpdateAppInfoResponse> updateAppInfo(UpdateAppInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateAppInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAppInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAppInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can modify the information about up to 20 auxiliary media assets at a time.</p>
     * 
     * @param request the request parameters of UpdateAttachedMediaInfos  UpdateAttachedMediaInfosRequest
     * @return UpdateAttachedMediaInfosResponse
     */
    @Override
    public CompletableFuture<UpdateAttachedMediaInfosResponse> updateAttachedMediaInfos(UpdateAttachedMediaInfosRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateAttachedMediaInfos").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAttachedMediaInfosResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAttachedMediaInfosResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>After you create a category, you can call this operation to modify the name of the category. If you have classified specific media resources to this category, the category names that are labeled on the media resources are automatically updated.</p>
     * 
     * @param request the request parameters of UpdateCategory  UpdateCategoryRequest
     * @return UpdateCategoryResponse
     */
    @Override
    public CompletableFuture<UpdateCategoryResponse> updateCategory(UpdateCategoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateCategory").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateCategoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateCategoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateEditingProject  UpdateEditingProjectRequest
     * @return UpdateEditingProjectResponse
     */
    @Override
    public CompletableFuture<UpdateEditingProjectResponse> updateEditingProject(UpdateEditingProjectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateEditingProject").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateEditingProjectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateEditingProjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to modify information such as the title, tags, description, and category about images based on image IDs. You must pass in the parameters that you want to modify. Otherwise, parameter configurations are not overwritten.</p>
     * <ul>
     * <li>You can modify the information about up to 20 images at a time.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateImageInfos  UpdateImageInfosRequest
     * @return UpdateImageInfosResponse
     */
    @Override
    public CompletableFuture<UpdateImageInfosResponse> updateImageInfos(UpdateImageInfosRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateImageInfos").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateImageInfosResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateImageInfosResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation is an asynchronous operation. You can call this operation to modify the storage classes of media assets. After the storage class is modified, a callback notification is sent.</p>
     * <ul>
     * <li>If the storage class of the media asset is Archive or Cold Archive and you call this operation to modify the storage class of the media asset, the media asset is automatically restored before the storage class is modified. You do not need to call the RestoreMedia operation to restore the media asset. You must specify the restoration priority for Cold Archive objects. Default configuration: RestoreTier=Standard.</li>
     * <li>Media assets whose storage classes are being modified cannot be used or processed.</li>
     * <li>Non-Standard objects have minimum storage durations. If an object is stored for less than the minimum storage duration, the storage class of the object cannot be changed. The following content describes the minimum storage durations for objects in different storage classes: IA or IA storage for source files: 30 days, Archive or Archive storage for source files: 60 days, Cold Archive or Cold Archive for source files: 180 days.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateMediaStorageClass  UpdateMediaStorageClassRequest
     * @return UpdateMediaStorageClassResponse
     */
    @Override
    public CompletableFuture<UpdateMediaStorageClassResponse> updateMediaStorageClass(UpdateMediaStorageClassRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateMediaStorageClass").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateMediaStorageClassResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateMediaStorageClassResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>For security purposes, you cannot add, modify, or delete transcoding templates in a transcoding template group that is locked. You can call the <a href="~~GetTranscodeTemplateGroup~~">GetTranscodeTemplateGroup</a> operation to query the configurations of a transcoding template group, check whether the transcoding template group is locked by using the response parameter Locked, and unlock the transcoding template group before you perform operations such as add, modify, and delete transcoding templates.</p>
     * 
     * @param request the request parameters of UpdateTranscodeTemplateGroup  UpdateTranscodeTemplateGroupRequest
     * @return UpdateTranscodeTemplateGroupResponse
     */
    @Override
    public CompletableFuture<UpdateTranscodeTemplateGroupResponse> updateTranscodeTemplateGroup(UpdateTranscodeTemplateGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateTranscodeTemplateGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateTranscodeTemplateGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateTranscodeTemplateGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The specific parameter of a video is updated only when a new value is passed in the parameter.</p>
     * 
     * @param request the request parameters of UpdateVideoInfo  UpdateVideoInfoRequest
     * @return UpdateVideoInfoResponse
     */
    @Override
    public CompletableFuture<UpdateVideoInfoResponse> updateVideoInfo(UpdateVideoInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateVideoInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateVideoInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateVideoInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The specific parameter of a video is updated only when a new value is passed in the parameter.</p>
     * 
     * @param request the request parameters of UpdateVideoInfos  UpdateVideoInfosRequest
     * @return UpdateVideoInfosResponse
     */
    @Override
    public CompletableFuture<UpdateVideoInfosResponse> updateVideoInfos(UpdateVideoInfosRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateVideoInfos").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateVideoInfosResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateVideoInfosResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>UpdateVodDomain</p>
     * 
     * @param request the request parameters of UpdateVodDomain  UpdateVodDomainRequest
     * @return UpdateVodDomainResponse
     */
    @Override
    public CompletableFuture<UpdateVodDomainResponse> updateVodDomain(UpdateVodDomainRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateVodDomain").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateVodDomainResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateVodDomainResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateVodTemplate  UpdateVodTemplateRequest
     * @return UpdateVodTemplateResponse
     */
    @Override
    public CompletableFuture<UpdateVodTemplateResponse> updateVodTemplate(UpdateVodTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateVodTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateVodTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateVodTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can modify the name and configurations of the watermark template after you call the <a href="~~AddWatermark~~">AddWatermark</a> operation to create a watermark template.</p>
     * <ul>
     * <li>You cannot call this operation to change the image in an image watermark template.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateWatermark  UpdateWatermarkRequest
     * @return UpdateWatermarkResponse
     */
    @Override
    public CompletableFuture<UpdateWatermarkResponse> updateWatermark(UpdateWatermarkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateWatermark").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateWatermarkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateWatermarkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to upload media files that are not stored on a local server or device and must be uploaded based on URLs over the Internet.</p>
     * <ul>
     * <li>The URL-based upload jobs are asynchronous. After you submit a URL-based upload job by calling this operation, it may take hours, even days to complete. If you require high timeliness, we recommend that you use the upload SDK.</li>
     * <li>If you configure callbacks, you can receive an <a href="https://help.aliyun.com/document_detail/86326.html">UploadByURLComplete</a> event notification after the media file is uploaded. You can query the upload status by calling the <a href="https://help.aliyun.com/document_detail/106830.html">GetURLUploadInfos</a> operation.</li>
     * <li>After you submit an upload job, the job is asynchronously processed on the cloud. All URL-based upload jobs that are submitted in each region are queued. The waiting time for the upload job depends on the number of queued jobs. After the upload job is complete, you can associate the playback URL included in the callback with the media ID.</li>
     * <li>You can call this operation only in the <strong>China (Shanghai)</strong> and <strong>Singapore</strong> regions.</li>
     * <li>Every time you submit a URL-based upload job, a new media ID is generated in ApsaraVideo VOD.</li>
     * </ul>
     * 
     * @param request the request parameters of UploadMediaByURL  UploadMediaByURLRequest
     * @return UploadMediaByURLResponse
     */
    @Override
    public CompletableFuture<UploadMediaByURLResponse> uploadMediaByURL(UploadMediaByURLRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UploadMediaByURL").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UploadMediaByURLResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UploadMediaByURLResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  <strong>Make sure that you understand the billing method and price of ApsaraVideo VOD before you call this operation. You are charged storage fees after you upload media files to ApsaraVideo VOD. For more information, see <a href="~~188308#section_e97_xrp_mzz~~">Billing of media asset storage</a>. If you have activated the acceleration service, you are charged acceleration fees when you upload media files to ApsaraVideo VOD. For more information, see <a href="~~188310#section_sta_zm2_tsv~~">Billing of acceleration traffic</a>.</strong></p>
     * <ul>
     * <li>This operation is available only in the <strong>China (Shanghai)</strong> and <strong>Singapore</strong> regions.</li>
     * <li>You can call this operation to upload transcoded streams to ApsaraVideo VOD from external storage. The following HDR types of transcoded streams are supported: HDR, HDR 10, HLG, Dolby Vision, HDR Vivid, and SDR+.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/106830.html">GetURLUploadInfos</a> operation to query the upload status. After the upload is complete, the callback of the <a href="https://help.aliyun.com/document_detail/376427.html">UploadByURLComplete</a> event is returned.</li>
     * </ul>
     * 
     * @param request the request parameters of UploadStreamByURL  UploadStreamByURLRequest
     * @return UploadStreamByURLResponse
     */
    @Override
    public CompletableFuture<UploadStreamByURLResponse> uploadStreamByURL(UploadStreamByURLRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UploadStreamByURL").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UploadStreamByURLResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UploadStreamByURLResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation is available only in the <strong>China (Shanghai)</strong> region.</p>
     * 
     * @param request the request parameters of VerifyVodDomainOwner  VerifyVodDomainOwnerRequest
     * @return VerifyVodDomainOwnerResponse
     */
    @Override
    public CompletableFuture<VerifyVodDomainOwnerResponse> verifyVodDomainOwner(VerifyVodDomainOwnerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("VerifyVodDomainOwner").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(VerifyVodDomainOwnerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<VerifyVodDomainOwnerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
