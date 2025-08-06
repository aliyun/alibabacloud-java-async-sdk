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
     * @param request the request parameters of AddCustomTemplateAndGroupConsole  AddCustomTemplateAndGroupConsoleRequest
     * @return AddCustomTemplateAndGroupConsoleResponse
     */
    @Override
    public CompletableFuture<AddCustomTemplateAndGroupConsoleResponse> addCustomTemplateAndGroupConsole(AddCustomTemplateAndGroupConsoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddCustomTemplateAndGroupConsole").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddCustomTemplateAndGroupConsoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddCustomTemplateAndGroupConsoleResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of AddFilterConfigs  AddFilterConfigsRequest
     * @return AddFilterConfigsResponse
     */
    @Override
    public CompletableFuture<AddFilterConfigsResponse> addFilterConfigs(AddFilterConfigsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddFilterConfigs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddFilterConfigsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddFilterConfigsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddFreeLicense  AddFreeLicenseRequest
     * @return AddFreeLicenseResponse
     */
    @Override
    public CompletableFuture<AddFreeLicenseResponse> addFreeLicense(AddFreeLicenseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddFreeLicense").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddFreeLicenseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddFreeLicenseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddLicense  AddLicenseRequest
     * @return AddLicenseResponse
     */
    @Override
    public CompletableFuture<AddLicenseResponse> addLicense(AddLicenseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddLicense").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddLicenseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddLicenseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddMediaSequences  AddMediaSequencesRequest
     * @return AddMediaSequencesResponse
     */
    @Override
    public CompletableFuture<AddMediaSequencesResponse> addMediaSequences(AddMediaSequencesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddMediaSequences").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddMediaSequencesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddMediaSequencesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddStorage  AddStorageRequest
     * @return AddStorageResponse
     */
    @Override
    public CompletableFuture<AddStorageResponse> addStorage(AddStorageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddStorage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddStorageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddStorageResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of AddWatermarkConsole  AddWatermarkConsoleRequest
     * @return AddWatermarkConsoleResponse
     */
    @Override
    public CompletableFuture<AddWatermarkConsoleResponse> addWatermarkConsole(AddWatermarkConsoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddWatermarkConsole").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddWatermarkConsoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddWatermarkConsoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddWorkflow  AddWorkflowRequest
     * @return AddWorkflowResponse
     */
    @Override
    public CompletableFuture<AddWorkflowResponse> addWorkflow(AddWorkflowRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddWorkflow").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddWorkflowResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddWorkflowResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AssignProductAccountId  AssignProductAccountIdRequest
     * @return AssignProductAccountIdResponse
     */
    @Override
    public CompletableFuture<AssignProductAccountIdResponse> assignProductAccountId(AssignProductAccountIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AssignProductAccountId").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AssignProductAccountIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AssignProductAccountIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AssumeExperienceRole  AssumeExperienceRoleRequest
     * @return AssumeExperienceRoleResponse
     */
    @Override
    public CompletableFuture<AssumeExperienceRoleResponse> assumeExperienceRole(AssumeExperienceRoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AssumeExperienceRole").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AssumeExperienceRoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AssumeExperienceRoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AssumeOssRole  AssumeOssRoleRequest
     * @return AssumeOssRoleResponse
     */
    @Override
    public CompletableFuture<AssumeOssRoleResponse> assumeOssRole(AssumeOssRoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AssumeOssRole").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AssumeOssRoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AssumeOssRoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AssumeSlsRole  AssumeSlsRoleRequest
     * @return AssumeSlsRoleResponse
     */
    @Override
    public CompletableFuture<AssumeSlsRoleResponse> assumeSlsRole(AssumeSlsRoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AssumeSlsRole").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AssumeSlsRoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AssumeSlsRoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AssumeSlsRoleV2  AssumeSlsRoleV2Request
     * @return AssumeSlsRoleV2Response
     */
    @Override
    public CompletableFuture<AssumeSlsRoleV2Response> assumeSlsRoleV2(AssumeSlsRoleV2Request request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AssumeSlsRoleV2").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AssumeSlsRoleV2Response.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AssumeSlsRoleV2Response> future = new CompletableFuture<>();
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
     * <p>  You can specify up to 20 audio or video file IDs in each request.</p>
     * <ul>
     * <li>After a media file is uploaded, ApsaraVideo VOD processes the source file. Then, information about the media file is asynchronously generated. You can configure notifications for the <a href="https://help.aliyun.com/document_detail/99935.html">VideoAnalysisComplete</a> event and call this operation to query information about a media file after you receive notifications for the <a href="https://help.aliyun.com/document_detail/99935.html">VideoAnalysisComplete</a> event. For more information, see <a href="https://help.aliyun.com/document_detail/55627.html">Overview</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of BatchGetMediaInfos  BatchGetMediaInfosRequest
     * @return BatchGetMediaInfosResponse
     */
    @Override
    public CompletableFuture<BatchGetMediaInfosResponse> batchGetMediaInfos(BatchGetMediaInfosRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchGetMediaInfos").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchGetMediaInfosResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchGetMediaInfosResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of BlockVodObjectCaches  BlockVodObjectCachesRequest
     * @return BlockVodObjectCachesResponse
     */
    @Override
    public CompletableFuture<BlockVodObjectCachesResponse> blockVodObjectCaches(BlockVodObjectCachesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BlockVodObjectCaches").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BlockVodObjectCachesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BlockVodObjectCachesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CancelBucketRedundancyTransition  CancelBucketRedundancyTransitionRequest
     * @return CancelBucketRedundancyTransitionResponse
     */
    @Override
    public CompletableFuture<CancelBucketRedundancyTransitionResponse> cancelBucketRedundancyTransition(CancelBucketRedundancyTransitionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelBucketRedundancyTransition").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelBucketRedundancyTransitionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelBucketRedundancyTransitionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CancelMediaExportJobs  CancelMediaExportJobsRequest
     * @return CancelMediaExportJobsResponse
     */
    @Override
    public CompletableFuture<CancelMediaExportJobsResponse> cancelMediaExportJobs(CancelMediaExportJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelMediaExportJobs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelMediaExportJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelMediaExportJobsResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of CheckLicense  CheckLicenseRequest
     * @return CheckLicenseResponse
     */
    @Override
    public CompletableFuture<CheckLicenseResponse> checkLicense(CheckLicenseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CheckLicense").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckLicenseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckLicenseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CheckVodDefaultRole  CheckVodDefaultRoleRequest
     * @return CheckVodDefaultRoleResponse
     */
    @Override
    public CompletableFuture<CheckVodDefaultRoleResponse> checkVodDefaultRole(CheckVodDefaultRoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CheckVodDefaultRole").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckVodDefaultRoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckVodDefaultRoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ControlVodAppService  ControlVodAppServiceRequest
     * @return ControlVodAppServiceResponse
     */
    @Override
    public CompletableFuture<ControlVodAppServiceResponse> controlVodAppService(ControlVodAppServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ControlVodAppService").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ControlVodAppServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ControlVodAppServiceResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of CreateAppPolicy  CreateAppPolicyRequest
     * @return CreateAppPolicyResponse
     */
    @Override
    public CompletableFuture<CreateAppPolicyResponse> createAppPolicy(CreateAppPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAppPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAppPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAppPolicyResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of CreateDNADB  CreateDNADBRequest
     * @return CreateDNADBResponse
     */
    @Override
    public CompletableFuture<CreateDNADBResponse> createDNADB(CreateDNADBRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDNADB").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDNADBResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDNADBResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateIntelligentStrategy  CreateIntelligentStrategyRequest
     * @return CreateIntelligentStrategyResponse
     */
    @Override
    public CompletableFuture<CreateIntelligentStrategyResponse> createIntelligentStrategy(CreateIntelligentStrategyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateIntelligentStrategy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateIntelligentStrategyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateIntelligentStrategyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateKMSServiceKey  CreateKMSServiceKeyRequest
     * @return CreateKMSServiceKeyResponse
     */
    @Override
    public CompletableFuture<CreateKMSServiceKeyResponse> createKMSServiceKey(CreateKMSServiceKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateKMSServiceKey").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateKMSServiceKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateKMSServiceKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateLicense  CreateLicenseRequest
     * @return CreateLicenseResponse
     */
    @Override
    public CompletableFuture<CreateLicenseResponse> createLicense(CreateLicenseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateLicense").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateLicenseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateLicenseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateMediaDNALib  CreateMediaDNALibRequest
     * @return CreateMediaDNALibResponse
     */
    @Override
    public CompletableFuture<CreateMediaDNALibResponse> createMediaDNALib(CreateMediaDNALibRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateMediaDNALib").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMediaDNALibResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMediaDNALibResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateMediaLifecycleRule  CreateMediaLifecycleRuleRequest
     * @return CreateMediaLifecycleRuleResponse
     */
    @Override
    public CompletableFuture<CreateMediaLifecycleRuleResponse> createMediaLifecycleRule(CreateMediaLifecycleRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateMediaLifecycleRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMediaLifecycleRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMediaLifecycleRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateMultiOrderForLicense  CreateMultiOrderForLicenseRequest
     * @return CreateMultiOrderForLicenseResponse
     */
    @Override
    public CompletableFuture<CreateMultiOrderForLicenseResponse> createMultiOrderForLicense(CreateMultiOrderForLicenseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateMultiOrderForLicense").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMultiOrderForLicenseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMultiOrderForLicenseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateOrder  CreateOrderRequest
     * @return CreateOrderResponse
     */
    @Override
    public CompletableFuture<CreateOrderResponse> createOrder(CreateOrderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateOrder").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateOrderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateOrderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateOrderForLicense  CreateOrderForLicenseRequest
     * @return CreateOrderForLicenseResponse
     */
    @Override
    public CompletableFuture<CreateOrderForLicenseResponse> createOrderForLicense(CreateOrderForLicenseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateOrderForLicense").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateOrderForLicenseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateOrderForLicenseResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of CreateVodRealTimeLogDelivery  CreateVodRealTimeLogDeliveryRequest
     * @return CreateVodRealTimeLogDeliveryResponse
     */
    @Override
    public CompletableFuture<CreateVodRealTimeLogDeliveryResponse> createVodRealTimeLogDelivery(CreateVodRealTimeLogDeliveryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateVodRealTimeLogDelivery").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateVodRealTimeLogDeliveryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateVodRealTimeLogDeliveryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateVodUserUsageDetailDataExportTask  CreateVodUserUsageDetailDataExportTaskRequest
     * @return CreateVodUserUsageDetailDataExportTaskResponse
     */
    @Override
    public CompletableFuture<CreateVodUserUsageDetailDataExportTaskResponse> createVodUserUsageDetailDataExportTask(CreateVodUserUsageDetailDataExportTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateVodUserUsageDetailDataExportTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateVodUserUsageDetailDataExportTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateVodUserUsageDetailDataExportTaskResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of DelApp  DelAppRequest
     * @return DelAppResponse
     */
    @Override
    public CompletableFuture<DelAppResponse> delApp(DelAppRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DelApp").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DelAppResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DelAppResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DelFreeLicense  DelFreeLicenseRequest
     * @return DelFreeLicenseResponse
     */
    @Override
    public CompletableFuture<DelFreeLicenseResponse> delFreeLicense(DelFreeLicenseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DelFreeLicense").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DelFreeLicenseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DelFreeLicenseResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of DeleteAppLicense  DeleteAppLicenseRequest
     * @return DeleteAppLicenseResponse
     */
    @Override
    public CompletableFuture<DeleteAppLicenseResponse> deleteAppLicense(DeleteAppLicenseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteAppLicense").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAppLicenseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAppLicenseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteAppPolicy  DeleteAppPolicyRequest
     * @return DeleteAppPolicyResponse
     */
    @Override
    public CompletableFuture<DeleteAppPolicyResponse> deleteAppPolicy(DeleteAppPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteAppPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAppPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAppPolicyResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of DeleteCustomTemplateConsole  DeleteCustomTemplateConsoleRequest
     * @return DeleteCustomTemplateConsoleResponse
     */
    @Override
    public CompletableFuture<DeleteCustomTemplateConsoleResponse> deleteCustomTemplateConsole(DeleteCustomTemplateConsoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteCustomTemplateConsole").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCustomTemplateConsoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCustomTemplateConsoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteDNADB  DeleteDNADBRequest
     * @return DeleteDNADBResponse
     */
    @Override
    public CompletableFuture<DeleteDNADBResponse> deleteDNADB(DeleteDNADBRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDNADB").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDNADBResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDNADBResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteDRMCertInfo  DeleteDRMCertInfoRequest
     * @return DeleteDRMCertInfoResponse
     */
    @Override
    public CompletableFuture<DeleteDRMCertInfoResponse> deleteDRMCertInfo(DeleteDRMCertInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDRMCertInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDRMCertInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDRMCertInfoResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of DeleteFilterConfigs  DeleteFilterConfigsRequest
     * @return DeleteFilterConfigsResponse
     */
    @Override
    public CompletableFuture<DeleteFilterConfigsResponse> deleteFilterConfigs(DeleteFilterConfigsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteFilterConfigs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteFilterConfigsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteFilterConfigsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteFreeLicense  DeleteFreeLicenseRequest
     * @return DeleteFreeLicenseResponse
     */
    @Override
    public CompletableFuture<DeleteFreeLicenseResponse> deleteFreeLicense(DeleteFreeLicenseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteFreeLicense").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteFreeLicenseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteFreeLicenseResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of DeleteIntelligentStrategy  DeleteIntelligentStrategyRequest
     * @return DeleteIntelligentStrategyResponse
     */
    @Override
    public CompletableFuture<DeleteIntelligentStrategyResponse> deleteIntelligentStrategy(DeleteIntelligentStrategyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteIntelligentStrategy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteIntelligentStrategyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteIntelligentStrategyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteMediaExportJobs  DeleteMediaExportJobsRequest
     * @return DeleteMediaExportJobsResponse
     */
    @Override
    public CompletableFuture<DeleteMediaExportJobsResponse> deleteMediaExportJobs(DeleteMediaExportJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteMediaExportJobs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMediaExportJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMediaExportJobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteMediaLifecycleRule  DeleteMediaLifecycleRuleRequest
     * @return DeleteMediaLifecycleRuleResponse
     */
    @Override
    public CompletableFuture<DeleteMediaLifecycleRuleResponse> deleteMediaLifecycleRule(DeleteMediaLifecycleRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteMediaLifecycleRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMediaLifecycleRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMediaLifecycleRuleResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of DeleteMessageCloudMonitorConfig  DeleteMessageCloudMonitorConfigRequest
     * @return DeleteMessageCloudMonitorConfigResponse
     */
    @Override
    public CompletableFuture<DeleteMessageCloudMonitorConfigResponse> deleteMessageCloudMonitorConfig(DeleteMessageCloudMonitorConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteMessageCloudMonitorConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMessageCloudMonitorConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMessageCloudMonitorConfigResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of DeleteStorage  DeleteStorageRequest
     * @return DeleteStorageResponse
     */
    @Override
    public CompletableFuture<DeleteStorageResponse> deleteStorage(DeleteStorageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteStorage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteStorageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteStorageResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of DeleteTemplateGroupConsole  DeleteTemplateGroupConsoleRequest
     * @return DeleteTemplateGroupConsoleResponse
     */
    @Override
    public CompletableFuture<DeleteTemplateGroupConsoleResponse> deleteTemplateGroupConsole(DeleteTemplateGroupConsoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteTemplateGroupConsole").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteTemplateGroupConsoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteTemplateGroupConsoleResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of DeleteTranscodeTemplates  DeleteTranscodeTemplatesRequest
     * @return DeleteTranscodeTemplatesResponse
     */
    @Override
    public CompletableFuture<DeleteTranscodeTemplatesResponse> deleteTranscodeTemplates(DeleteTranscodeTemplatesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteTranscodeTemplates").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteTranscodeTemplatesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteTranscodeTemplatesResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of DeleteVodRealTimeLogLogstore  DeleteVodRealTimeLogLogstoreRequest
     * @return DeleteVodRealTimeLogLogstoreResponse
     */
    @Override
    public CompletableFuture<DeleteVodRealTimeLogLogstoreResponse> deleteVodRealTimeLogLogstore(DeleteVodRealTimeLogLogstoreRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteVodRealTimeLogLogstore").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteVodRealTimeLogLogstoreResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteVodRealTimeLogLogstoreResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteVodRealtimeLogDelivery  DeleteVodRealtimeLogDeliveryRequest
     * @return DeleteVodRealtimeLogDeliveryResponse
     */
    @Override
    public CompletableFuture<DeleteVodRealtimeLogDeliveryResponse> deleteVodRealtimeLogDelivery(DeleteVodRealtimeLogDeliveryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteVodRealtimeLogDelivery").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteVodRealtimeLogDeliveryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteVodRealtimeLogDeliveryResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of DeleteWatermarkConsole  DeleteWatermarkConsoleRequest
     * @return DeleteWatermarkConsoleResponse
     */
    @Override
    public CompletableFuture<DeleteWatermarkConsoleResponse> deleteWatermarkConsole(DeleteWatermarkConsoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteWatermarkConsole").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteWatermarkConsoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteWatermarkConsoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteWorkflow  DeleteWorkflowRequest
     * @return DeleteWorkflowResponse
     */
    @Override
    public CompletableFuture<DeleteWorkflowResponse> deleteWorkflow(DeleteWorkflowRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteWorkflow").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteWorkflowResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteWorkflowResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeBizUserType  DescribeBizUserTypeRequest
     * @return DescribeBizUserTypeResponse
     */
    @Override
    public CompletableFuture<DescribeBizUserTypeResponse> describeBizUserType(DescribeBizUserTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeBizUserType").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeBizUserTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeBizUserTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeCdnDomainLogs  DescribeCdnDomainLogsRequest
     * @return DescribeCdnDomainLogsResponse
     */
    @Override
    public CompletableFuture<DescribeCdnDomainLogsResponse> describeCdnDomainLogs(DescribeCdnDomainLogsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCdnDomainLogs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCdnDomainLogsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCdnDomainLogsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDailyAsyncJob  DescribeDailyAsyncJobRequest
     * @return DescribeDailyAsyncJobResponse
     */
    @Override
    public CompletableFuture<DescribeDailyAsyncJobResponse> describeDailyAsyncJob(DescribeDailyAsyncJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDailyAsyncJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDailyAsyncJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDailyAsyncJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDomainBpsData  DescribeDomainBpsDataRequest
     * @return DescribeDomainBpsDataResponse
     */
    @Override
    public CompletableFuture<DescribeDomainBpsDataResponse> describeDomainBpsData(DescribeDomainBpsDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDomainBpsData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDomainBpsDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDomainBpsDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDomainFlowData  DescribeDomainFlowDataRequest
     * @return DescribeDomainFlowDataResponse
     */
    @Override
    public CompletableFuture<DescribeDomainFlowDataResponse> describeDomainFlowData(DescribeDomainFlowDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDomainFlowData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDomainFlowDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDomainFlowDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeFileIdPlayStatisByEdge  DescribeFileIdPlayStatisByEdgeRequest
     * @return DescribeFileIdPlayStatisByEdgeResponse
     */
    @Override
    public CompletableFuture<DescribeFileIdPlayStatisByEdgeResponse> describeFileIdPlayStatisByEdge(DescribeFileIdPlayStatisByEdgeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeFileIdPlayStatisByEdge").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeFileIdPlayStatisByEdgeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeFileIdPlayStatisByEdgeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeFileIdPlayStatisByOrigin  DescribeFileIdPlayStatisByOriginRequest
     * @return DescribeFileIdPlayStatisByOriginResponse
     */
    @Override
    public CompletableFuture<DescribeFileIdPlayStatisByOriginResponse> describeFileIdPlayStatisByOrigin(DescribeFileIdPlayStatisByOriginRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeFileIdPlayStatisByOrigin").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeFileIdPlayStatisByOriginResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeFileIdPlayStatisByOriginResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeFilterConfigs  DescribeFilterConfigsRequest
     * @return DescribeFilterConfigsResponse
     */
    @Override
    public CompletableFuture<DescribeFilterConfigsResponse> describeFilterConfigs(DescribeFilterConfigsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeFilterConfigs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeFilterConfigsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeFilterConfigsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  This operation is available only in the China (Shanghai) region.</p>
     * <ul>
     * <li>If you do not set the StartTime or EndTime parameter, the request returns the data collected in the previous 7 days. If you set both the parameters, the request returns the data collected within the specified time range.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeMediaDistribution  DescribeMediaDistributionRequest
     * @return DescribeMediaDistributionResponse
     */
    @Override
    public CompletableFuture<DescribeMediaDistributionResponse> describeMediaDistribution(DescribeMediaDistributionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeMediaDistribution").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMediaDistributionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMediaDistributionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeMultiPriceForLicense  DescribeMultiPriceForLicenseRequest
     * @return DescribeMultiPriceForLicenseResponse
     */
    @Override
    public CompletableFuture<DescribeMultiPriceForLicenseResponse> describeMultiPriceForLicense(DescribeMultiPriceForLicenseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeMultiPriceForLicense").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMultiPriceForLicenseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMultiPriceForLicenseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribePlayDetail  DescribePlayDetailRequest
     * @return DescribePlayDetailResponse
     */
    @Override
    public CompletableFuture<DescribePlayDetailResponse> describePlayDetail(DescribePlayDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePlayDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePlayDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePlayDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribePlayEventList  DescribePlayEventListRequest
     * @return DescribePlayEventListResponse
     */
    @Override
    public CompletableFuture<DescribePlayEventListResponse> describePlayEventList(DescribePlayEventListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePlayEventList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePlayEventListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePlayEventListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribePlayFirstFrameDurationMetricData  DescribePlayFirstFrameDurationMetricDataRequest
     * @return DescribePlayFirstFrameDurationMetricDataResponse
     */
    @Override
    public CompletableFuture<DescribePlayFirstFrameDurationMetricDataResponse> describePlayFirstFrameDurationMetricData(DescribePlayFirstFrameDurationMetricDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePlayFirstFrameDurationMetricData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePlayFirstFrameDurationMetricDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePlayFirstFrameDurationMetricDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribePlayList  DescribePlayListRequest
     * @return DescribePlayListResponse
     */
    @Override
    public CompletableFuture<DescribePlayListResponse> describePlayList(DescribePlayListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePlayList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePlayListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePlayListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribePlayMetricAuth  DescribePlayMetricAuthRequest
     * @return DescribePlayMetricAuthResponse
     */
    @Override
    public CompletableFuture<DescribePlayMetricAuthResponse> describePlayMetricAuth(DescribePlayMetricAuthRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePlayMetricAuth").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePlayMetricAuthResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePlayMetricAuthResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribePlayMetricData  DescribePlayMetricDataRequest
     * @return DescribePlayMetricDataResponse
     */
    @Override
    public CompletableFuture<DescribePlayMetricDataResponse> describePlayMetricData(DescribePlayMetricDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePlayMetricData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePlayMetricDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePlayMetricDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribePlayQoeList  DescribePlayQoeListRequest
     * @return DescribePlayQoeListResponse
     */
    @Override
    public CompletableFuture<DescribePlayQoeListResponse> describePlayQoeList(DescribePlayQoeListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePlayQoeList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePlayQoeListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePlayQoeListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribePlayQosList  DescribePlayQosListRequest
     * @return DescribePlayQosListResponse
     */
    @Override
    public CompletableFuture<DescribePlayQosListResponse> describePlayQosList(DescribePlayQosListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePlayQosList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePlayQosListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePlayQosListResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of DescribeQueryConfigs  DescribeQueryConfigsRequest
     * @return DescribeQueryConfigsResponse
     */
    @Override
    public CompletableFuture<DescribeQueryConfigsResponse> describeQueryConfigs(DescribeQueryConfigsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeQueryConfigs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeQueryConfigsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeQueryConfigsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeRefreshQuota  DescribeRefreshQuotaRequest
     * @return DescribeRefreshQuotaResponse
     */
    @Override
    public CompletableFuture<DescribeRefreshQuotaResponse> describeRefreshQuota(DescribeRefreshQuotaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRefreshQuota").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRefreshQuotaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRefreshQuotaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeRefreshTasks  DescribeRefreshTasksRequest
     * @return DescribeRefreshTasksResponse
     */
    @Override
    public CompletableFuture<DescribeRefreshTasksResponse> describeRefreshTasks(DescribeRefreshTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRefreshTasks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRefreshTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRefreshTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeUserVodStatus  DescribeUserVodStatusRequest
     * @return DescribeUserVodStatusResponse
     */
    @Override
    public CompletableFuture<DescribeUserVodStatusResponse> describeUserVodStatus(DescribeUserVodStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeUserVodStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeUserVodStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeUserVodStatusResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of DescribeVodAppName  DescribeVodAppNameRequest
     * @return DescribeVodAppNameResponse
     */
    @Override
    public CompletableFuture<DescribeVodAppNameResponse> describeVodAppName(DescribeVodAppNameRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVodAppName").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVodAppNameResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVodAppNameResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeVodCertificateDetail  DescribeVodCertificateDetailRequest
     * @return DescribeVodCertificateDetailResponse
     */
    @Override
    public CompletableFuture<DescribeVodCertificateDetailResponse> describeVodCertificateDetail(DescribeVodCertificateDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVodCertificateDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVodCertificateDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVodCertificateDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeVodCertificateDetailById  DescribeVodCertificateDetailByIdRequest
     * @return DescribeVodCertificateDetailByIdResponse
     */
    @Override
    public CompletableFuture<DescribeVodCertificateDetailByIdResponse> describeVodCertificateDetailById(DescribeVodCertificateDetailByIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVodCertificateDetailById").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVodCertificateDetailByIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVodCertificateDetailByIdResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of DescribeVodDomainCname  DescribeVodDomainCnameRequest
     * @return DescribeVodDomainCnameResponse
     */
    @Override
    public CompletableFuture<DescribeVodDomainCnameResponse> describeVodDomainCname(DescribeVodDomainCnameRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVodDomainCname").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVodDomainCnameResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVodDomainCnameResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of DescribeVodDomainHttpCodeData  DescribeVodDomainHttpCodeDataRequest
     * @return DescribeVodDomainHttpCodeDataResponse
     */
    @Override
    public CompletableFuture<DescribeVodDomainHttpCodeDataResponse> describeVodDomainHttpCodeData(DescribeVodDomainHttpCodeDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVodDomainHttpCodeData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVodDomainHttpCodeDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVodDomainHttpCodeDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeVodDomainISPData  DescribeVodDomainISPDataRequest
     * @return DescribeVodDomainISPDataResponse
     */
    @Override
    public CompletableFuture<DescribeVodDomainISPDataResponse> describeVodDomainISPData(DescribeVodDomainISPDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVodDomainISPData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVodDomainISPDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVodDomainISPDataResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of DescribeVodDomainPvData  DescribeVodDomainPvDataRequest
     * @return DescribeVodDomainPvDataResponse
     */
    @Override
    public CompletableFuture<DescribeVodDomainPvDataResponse> describeVodDomainPvData(DescribeVodDomainPvDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVodDomainPvData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVodDomainPvDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVodDomainPvDataResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of DescribeVodDomainRealTimeSrcBpsData  DescribeVodDomainRealTimeSrcBpsDataRequest
     * @return DescribeVodDomainRealTimeSrcBpsDataResponse
     */
    @Override
    public CompletableFuture<DescribeVodDomainRealTimeSrcBpsDataResponse> describeVodDomainRealTimeSrcBpsData(DescribeVodDomainRealTimeSrcBpsDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVodDomainRealTimeSrcBpsData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVodDomainRealTimeSrcBpsDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVodDomainRealTimeSrcBpsDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeVodDomainRealTimeSrcTrafficData  DescribeVodDomainRealTimeSrcTrafficDataRequest
     * @return DescribeVodDomainRealTimeSrcTrafficDataResponse
     */
    @Override
    public CompletableFuture<DescribeVodDomainRealTimeSrcTrafficDataResponse> describeVodDomainRealTimeSrcTrafficData(DescribeVodDomainRealTimeSrcTrafficDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVodDomainRealTimeSrcTrafficData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVodDomainRealTimeSrcTrafficDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVodDomainRealTimeSrcTrafficDataResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of DescribeVodDomainRealtimeLogDelivery  DescribeVodDomainRealtimeLogDeliveryRequest
     * @return DescribeVodDomainRealtimeLogDeliveryResponse
     */
    @Override
    public CompletableFuture<DescribeVodDomainRealtimeLogDeliveryResponse> describeVodDomainRealtimeLogDelivery(DescribeVodDomainRealtimeLogDeliveryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVodDomainRealtimeLogDelivery").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVodDomainRealtimeLogDeliveryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVodDomainRealtimeLogDeliveryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeVodDomainRegionData  DescribeVodDomainRegionDataRequest
     * @return DescribeVodDomainRegionDataResponse
     */
    @Override
    public CompletableFuture<DescribeVodDomainRegionDataResponse> describeVodDomainRegionData(DescribeVodDomainRegionDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVodDomainRegionData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVodDomainRegionDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVodDomainRegionDataResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of DescribeVodDomainStagingConfig  DescribeVodDomainStagingConfigRequest
     * @return DescribeVodDomainStagingConfigResponse
     */
    @Override
    public CompletableFuture<DescribeVodDomainStagingConfigResponse> describeVodDomainStagingConfig(DescribeVodDomainStagingConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVodDomainStagingConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVodDomainStagingConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVodDomainStagingConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeVodDomainTopReferVisit  DescribeVodDomainTopReferVisitRequest
     * @return DescribeVodDomainTopReferVisitResponse
     */
    @Override
    public CompletableFuture<DescribeVodDomainTopReferVisitResponse> describeVodDomainTopReferVisit(DescribeVodDomainTopReferVisitRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVodDomainTopReferVisit").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVodDomainTopReferVisitResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVodDomainTopReferVisitResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeVodDomainTopUrlVisit  DescribeVodDomainTopUrlVisitRequest
     * @return DescribeVodDomainTopUrlVisitResponse
     */
    @Override
    public CompletableFuture<DescribeVodDomainTopUrlVisitResponse> describeVodDomainTopUrlVisit(DescribeVodDomainTopUrlVisitRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVodDomainTopUrlVisit").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVodDomainTopUrlVisitResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVodDomainTopUrlVisitResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of DescribeVodDomainUvData  DescribeVodDomainUvDataRequest
     * @return DescribeVodDomainUvDataResponse
     */
    @Override
    public CompletableFuture<DescribeVodDomainUvDataResponse> describeVodDomainUvData(DescribeVodDomainUvDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVodDomainUvData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVodDomainUvDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVodDomainUvDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeVodDomainsUsageByDay  DescribeVodDomainsUsageByDayRequest
     * @return DescribeVodDomainsUsageByDayResponse
     */
    @Override
    public CompletableFuture<DescribeVodDomainsUsageByDayResponse> describeVodDomainsUsageByDay(DescribeVodDomainsUsageByDayRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVodDomainsUsageByDay").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVodDomainsUsageByDayResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVodDomainsUsageByDayResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeVodEditingUsageData  DescribeVodEditingUsageDataRequest
     * @return DescribeVodEditingUsageDataResponse
     */
    @Override
    public CompletableFuture<DescribeVodEditingUsageDataResponse> describeVodEditingUsageData(DescribeVodEditingUsageDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVodEditingUsageData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVodEditingUsageDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVodEditingUsageDataResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of DescribeVodMultiUsageData  DescribeVodMultiUsageDataRequest
     * @return DescribeVodMultiUsageDataResponse
     */
    @Override
    public CompletableFuture<DescribeVodMultiUsageDataResponse> describeVodMultiUsageData(DescribeVodMultiUsageDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVodMultiUsageData").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVodMultiUsageDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVodMultiUsageDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeVodPlayerCollectData  DescribeVodPlayerCollectDataRequest
     * @return DescribeVodPlayerCollectDataResponse
     */
    @Override
    public CompletableFuture<DescribeVodPlayerCollectDataResponse> describeVodPlayerCollectData(DescribeVodPlayerCollectDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVodPlayerCollectData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVodPlayerCollectDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVodPlayerCollectDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeVodPlayerCollectDataDemo  DescribeVodPlayerCollectDataDemoRequest
     * @return DescribeVodPlayerCollectDataDemoResponse
     */
    @Override
    public CompletableFuture<DescribeVodPlayerCollectDataDemoResponse> describeVodPlayerCollectDataDemo(DescribeVodPlayerCollectDataDemoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVodPlayerCollectDataDemo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVodPlayerCollectDataDemoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVodPlayerCollectDataDemoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeVodPlayerDimensionData  DescribeVodPlayerDimensionDataRequest
     * @return DescribeVodPlayerDimensionDataResponse
     */
    @Override
    public CompletableFuture<DescribeVodPlayerDimensionDataResponse> describeVodPlayerDimensionData(DescribeVodPlayerDimensionDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVodPlayerDimensionData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVodPlayerDimensionDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVodPlayerDimensionDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeVodPlayerDimensionDataDemo  DescribeVodPlayerDimensionDataDemoRequest
     * @return DescribeVodPlayerDimensionDataDemoResponse
     */
    @Override
    public CompletableFuture<DescribeVodPlayerDimensionDataDemoResponse> describeVodPlayerDimensionDataDemo(DescribeVodPlayerDimensionDataDemoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVodPlayerDimensionDataDemo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVodPlayerDimensionDataDemoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVodPlayerDimensionDataDemoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeVodPlayerMetricData  DescribeVodPlayerMetricDataRequest
     * @return DescribeVodPlayerMetricDataResponse
     */
    @Override
    public CompletableFuture<DescribeVodPlayerMetricDataResponse> describeVodPlayerMetricData(DescribeVodPlayerMetricDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVodPlayerMetricData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVodPlayerMetricDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVodPlayerMetricDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeVodPlayerMetricDataDemo  DescribeVodPlayerMetricDataDemoRequest
     * @return DescribeVodPlayerMetricDataDemoResponse
     */
    @Override
    public CompletableFuture<DescribeVodPlayerMetricDataDemoResponse> describeVodPlayerMetricDataDemo(DescribeVodPlayerMetricDataDemoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVodPlayerMetricDataDemo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVodPlayerMetricDataDemoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVodPlayerMetricDataDemoResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of DescribeVodRealtimeDeliveryAcc  DescribeVodRealtimeDeliveryAccRequest
     * @return DescribeVodRealtimeDeliveryAccResponse
     */
    @Override
    public CompletableFuture<DescribeVodRealtimeDeliveryAccResponse> describeVodRealtimeDeliveryAcc(DescribeVodRealtimeDeliveryAccRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVodRealtimeDeliveryAcc").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVodRealtimeDeliveryAccResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVodRealtimeDeliveryAccResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeVodRealtimeLogAuthorized  DescribeVodRealtimeLogAuthorizedRequest
     * @return DescribeVodRealtimeLogAuthorizedResponse
     */
    @Override
    public CompletableFuture<DescribeVodRealtimeLogAuthorizedResponse> describeVodRealtimeLogAuthorized(DescribeVodRealtimeLogAuthorizedRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVodRealtimeLogAuthorized").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVodRealtimeLogAuthorizedResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVodRealtimeLogAuthorizedResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of DescribeVodService  DescribeVodServiceRequest
     * @return DescribeVodServiceResponse
     */
    @Override
    public CompletableFuture<DescribeVodServiceResponse> describeVodService(DescribeVodServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVodService").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVodServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVodServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeVodStatis  DescribeVodStatisRequest
     * @return DescribeVodStatisResponse
     */
    @Override
    public CompletableFuture<DescribeVodStatisResponse> describeVodStatis(DescribeVodStatisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVodStatis").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVodStatisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVodStatisResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of DescribeVodTagResources  DescribeVodTagResourcesRequest
     * @return DescribeVodTagResourcesResponse
     */
    @Override
    public CompletableFuture<DescribeVodTagResourcesResponse> describeVodTagResources(DescribeVodTagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVodTagResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVodTagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVodTagResourcesResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of DescribeVodTopDomainsByFlow  DescribeVodTopDomainsByFlowRequest
     * @return DescribeVodTopDomainsByFlowResponse
     */
    @Override
    public CompletableFuture<DescribeVodTopDomainsByFlowResponse> describeVodTopDomainsByFlow(DescribeVodTopDomainsByFlowRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVodTopDomainsByFlow").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVodTopDomainsByFlowResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVodTopDomainsByFlowResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of DescribeVodUserBillPrediction  DescribeVodUserBillPredictionRequest
     * @return DescribeVodUserBillPredictionResponse
     */
    @Override
    public CompletableFuture<DescribeVodUserBillPredictionResponse> describeVodUserBillPrediction(DescribeVodUserBillPredictionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVodUserBillPrediction").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVodUserBillPredictionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVodUserBillPredictionResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of DescribeVodUserQuota  DescribeVodUserQuotaRequest
     * @return DescribeVodUserQuotaResponse
     */
    @Override
    public CompletableFuture<DescribeVodUserQuotaResponse> describeVodUserQuota(DescribeVodUserQuotaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVodUserQuota").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVodUserQuotaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVodUserQuotaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeVodUserResourcePackage  DescribeVodUserResourcePackageRequest
     * @return DescribeVodUserResourcePackageResponse
     */
    @Override
    public CompletableFuture<DescribeVodUserResourcePackageResponse> describeVodUserResourcePackage(DescribeVodUserResourcePackageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVodUserResourcePackage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVodUserResourcePackageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVodUserResourcePackageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeVodUserTags  DescribeVodUserTagsRequest
     * @return DescribeVodUserTagsResponse
     */
    @Override
    public CompletableFuture<DescribeVodUserTagsResponse> describeVodUserTags(DescribeVodUserTagsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVodUserTags").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVodUserTagsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVodUserTagsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeVodUserUsageDetailDataExportTask  DescribeVodUserUsageDetailDataExportTaskRequest
     * @return DescribeVodUserUsageDetailDataExportTaskResponse
     */
    @Override
    public CompletableFuture<DescribeVodUserUsageDetailDataExportTaskResponse> describeVodUserUsageDetailDataExportTask(DescribeVodUserUsageDetailDataExportTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVodUserUsageDetailDataExportTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVodUserUsageDetailDataExportTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVodUserUsageDetailDataExportTaskResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of DisableVodRealtimeLogDelivery  DisableVodRealtimeLogDeliveryRequest
     * @return DisableVodRealtimeLogDeliveryResponse
     */
    @Override
    public CompletableFuture<DisableVodRealtimeLogDeliveryResponse> disableVodRealtimeLogDelivery(DisableVodRealtimeLogDeliveryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisableVodRealtimeLogDelivery").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableVodRealtimeLogDeliveryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableVodRealtimeLogDeliveryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DisplayAIAuditSwitch  DisplayAIAuditSwitchRequest
     * @return DisplayAIAuditSwitchResponse
     */
    @Override
    public CompletableFuture<DisplayAIAuditSwitchResponse> displayAIAuditSwitch(DisplayAIAuditSwitchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisplayAIAuditSwitch").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisplayAIAuditSwitchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisplayAIAuditSwitchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EditAppInfo  EditAppInfoRequest
     * @return EditAppInfoResponse
     */
    @Override
    public CompletableFuture<EditAppInfoResponse> editAppInfo(EditAppInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EditAppInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EditAppInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EditAppInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EditLicense  EditLicenseRequest
     * @return EditLicenseResponse
     */
    @Override
    public CompletableFuture<EditLicenseResponse> editLicense(EditLicenseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EditLicense").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EditLicenseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EditLicenseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnableVodRealtimeLogDelivery  EnableVodRealtimeLogDeliveryRequest
     * @return EnableVodRealtimeLogDeliveryResponse
     */
    @Override
    public CompletableFuture<EnableVodRealtimeLogDeliveryResponse> enableVodRealtimeLogDelivery(EnableVodRealtimeLogDeliveryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableVodRealtimeLogDelivery").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableVodRealtimeLogDeliveryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableVodRealtimeLogDeliveryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of FaceRegistration  FaceRegistrationRequest
     * @return FaceRegistrationResponse
     */
    @Override
    public CompletableFuture<FaceRegistrationResponse> faceRegistration(FaceRegistrationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("FaceRegistration").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FaceRegistrationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FaceRegistrationResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of GetAICaptionExtractionJobs  GetAICaptionExtractionJobsRequest
     * @return GetAICaptionExtractionJobsResponse
     */
    @Override
    public CompletableFuture<GetAICaptionExtractionJobsResponse> getAICaptionExtractionJobs(GetAICaptionExtractionJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAICaptionExtractionJobs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAICaptionExtractionJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAICaptionExtractionJobsResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of GetAIService  GetAIServiceRequest
     * @return GetAIServiceResponse
     */
    @Override
    public CompletableFuture<GetAIServiceResponse> getAIService(GetAIServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAIService").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAIServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAIServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAIStatis  GetAIStatisRequest
     * @return GetAIStatisResponse
     */
    @Override
    public CompletableFuture<GetAIStatisResponse> getAIStatis(GetAIStatisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAIStatis").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAIStatisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAIStatisResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of GetAppPolicies  GetAppPoliciesRequest
     * @return GetAppPoliciesResponse
     */
    @Override
    public CompletableFuture<GetAppPoliciesResponse> getAppPolicies(GetAppPoliciesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAppPolicies").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAppPoliciesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAppPoliciesResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of GetAuditResult  GetAuditResultRequest
     * @return GetAuditResultResponse
     */
    @Override
    public CompletableFuture<GetAuditResultResponse> getAuditResult(GetAuditResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAuditResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAuditResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAuditResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAuditResultDetail  GetAuditResultDetailRequest
     * @return GetAuditResultDetailResponse
     */
    @Override
    public CompletableFuture<GetAuditResultDetailResponse> getAuditResultDetail(GetAuditResultDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAuditResultDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAuditResultDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAuditResultDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetBucketDeleteTask  GetBucketDeleteTaskRequest
     * @return GetBucketDeleteTaskResponse
     */
    @Override
    public CompletableFuture<GetBucketDeleteTaskResponse> getBucketDeleteTask(GetBucketDeleteTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetBucketDeleteTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetBucketDeleteTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetBucketDeleteTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetCDNStatis  GetCDNStatisRequest
     * @return GetCDNStatisResponse
     */
    @Override
    public CompletableFuture<GetCDNStatisResponse> getCDNStatis(GetCDNStatisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCDNStatis").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCDNStatisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCDNStatisResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetCDNStatisSum  GetCDNStatisSumRequest
     * @return GetCDNStatisSumResponse
     */
    @Override
    public CompletableFuture<GetCDNStatisSumResponse> getCDNStatisSum(GetCDNStatisSumRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCDNStatisSum").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCDNStatisSumResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCDNStatisSumResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of GetCheckChannel  GetCheckChannelRequest
     * @return GetCheckChannelResponse
     */
    @Override
    public CompletableFuture<GetCheckChannelResponse> getCheckChannel(GetCheckChannelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCheckChannel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCheckChannelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCheckChannelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetClientConfig  GetClientConfigRequest
     * @return GetClientConfigResponse
     */
    @Override
    public CompletableFuture<GetClientConfigResponse> getClientConfig(GetClientConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetClientConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetClientConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetClientConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetCustomerConfig  GetCustomerConfigRequest
     * @return GetCustomerConfigResponse
     */
    @Override
    public CompletableFuture<GetCustomerConfigResponse> getCustomerConfig(GetCustomerConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCustomerConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCustomerConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCustomerConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDNADB  GetDNADBRequest
     * @return GetDNADBResponse
     */
    @Override
    public CompletableFuture<GetDNADBResponse> getDNADB(GetDNADBRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDNADB").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDNADBResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDNADBResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDRMCertInfo  GetDRMCertInfoRequest
     * @return GetDRMCertInfoResponse
     */
    @Override
    public CompletableFuture<GetDRMCertInfoResponse> getDRMCertInfo(GetDRMCertInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDRMCertInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDRMCertInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDRMCertInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDRMLicense  GetDRMLicenseRequest
     * @return GetDRMLicenseResponse
     */
    @Override
    public CompletableFuture<GetDRMLicenseResponse> getDRMLicense(GetDRMLicenseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDRMLicense").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDRMLicenseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDRMLicenseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDailyPlayRegionStatis  GetDailyPlayRegionStatisRequest
     * @return GetDailyPlayRegionStatisResponse
     */
    @Override
    public CompletableFuture<GetDailyPlayRegionStatisResponse> getDailyPlayRegionStatis(GetDailyPlayRegionStatisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDailyPlayRegionStatis").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDailyPlayRegionStatisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDailyPlayRegionStatisResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDailyPlayStatis  GetDailyPlayStatisRequest
     * @return GetDailyPlayStatisResponse
     */
    @Override
    public CompletableFuture<GetDailyPlayStatisResponse> getDailyPlayStatis(GetDailyPlayStatisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDailyPlayStatis").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDailyPlayStatisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDailyPlayStatisResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of GetIntelligentStrategy  GetIntelligentStrategyRequest
     * @return GetIntelligentStrategyResponse
     */
    @Override
    public CompletableFuture<GetIntelligentStrategyResponse> getIntelligentStrategy(GetIntelligentStrategyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetIntelligentStrategy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetIntelligentStrategyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetIntelligentStrategyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <hr>
     * <p>You can call this operation to query only asynchronous tasks of the last six months. The types of tasks that you can query include transcoding tasks, snapshot tasks, and AI tasks.
     * <strong>QPS limit</strong>
     * You can call this operation up to 15 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limits</a>.</p>
     * 
     * @param request the request parameters of GetJobDetail  GetJobDetailRequest
     * @return GetJobDetailResponse
     */
    @Override
    public CompletableFuture<GetJobDetailResponse> getJobDetail(GetJobDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetJobDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetJobDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetJobDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetKMSServiceKey  GetKMSServiceKeyRequest
     * @return GetKMSServiceKeyResponse
     */
    @Override
    public CompletableFuture<GetKMSServiceKeyResponse> getKMSServiceKey(GetKMSServiceKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetKMSServiceKey").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetKMSServiceKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetKMSServiceKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetLicenseInfo  GetLicenseInfoRequest
     * @return GetLicenseInfoResponse
     */
    @Override
    public CompletableFuture<GetLicenseInfoResponse> getLicenseInfo(GetLicenseInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetLicenseInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLicenseInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLicenseInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetLicenseKey  GetLicenseKeyRequest
     * @return GetLicenseKeyResponse
     */
    @Override
    public CompletableFuture<GetLicenseKeyResponse> getLicenseKey(GetLicenseKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetLicenseKey").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLicenseKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLicenseKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetLicensePurchaseStatus  GetLicensePurchaseStatusRequest
     * @return GetLicensePurchaseStatusResponse
     */
    @Override
    public CompletableFuture<GetLicensePurchaseStatusResponse> getLicensePurchaseStatus(GetLicensePurchaseStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetLicensePurchaseStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLicensePurchaseStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLicensePurchaseStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetLicenses  GetLicensesRequest
     * @return GetLicensesResponse
     */
    @Override
    public CompletableFuture<GetLicensesResponse> getLicenses(GetLicensesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetLicenses").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLicensesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLicensesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMTSStatis  GetMTSStatisRequest
     * @return GetMTSStatisResponse
     */
    @Override
    public CompletableFuture<GetMTSStatisResponse> getMTSStatis(GetMTSStatisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetMTSStatis").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMTSStatisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMTSStatisResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of GetMediaExportJobs  GetMediaExportJobsRequest
     * @return GetMediaExportJobsResponse
     */
    @Override
    public CompletableFuture<GetMediaExportJobsResponse> getMediaExportJobs(GetMediaExportJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetMediaExportJobs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMediaExportJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMediaExportJobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMediaLifecycleRule  GetMediaLifecycleRuleRequest
     * @return GetMediaLifecycleRuleResponse
     */
    @Override
    public CompletableFuture<GetMediaLifecycleRuleResponse> getMediaLifecycleRule(GetMediaLifecycleRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetMediaLifecycleRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMediaLifecycleRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMediaLifecycleRuleResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of GetMessageCallbackEventList  GetMessageCallbackEventListRequest
     * @return GetMessageCallbackEventListResponse
     */
    @Override
    public CompletableFuture<GetMessageCallbackEventListResponse> getMessageCallbackEventList(GetMessageCallbackEventListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetMessageCallbackEventList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMessageCallbackEventListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMessageCallbackEventListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMessageCloudMonitorConfig  GetMessageCloudMonitorConfigRequest
     * @return GetMessageCloudMonitorConfigResponse
     */
    @Override
    public CompletableFuture<GetMessageCloudMonitorConfigResponse> getMessageCloudMonitorConfig(GetMessageCloudMonitorConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetMessageCloudMonitorConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMessageCloudMonitorConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMessageCloudMonitorConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMessageCloudMonitorEventList  GetMessageCloudMonitorEventListRequest
     * @return GetMessageCloudMonitorEventListResponse
     */
    @Override
    public CompletableFuture<GetMessageCloudMonitorEventListResponse> getMessageCloudMonitorEventList(GetMessageCloudMonitorEventListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetMessageCloudMonitorEventList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMessageCloudMonitorEventListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMessageCloudMonitorEventListResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of GetOSSFlowStatis  GetOSSFlowStatisRequest
     * @return GetOSSFlowStatisResponse
     */
    @Override
    public CompletableFuture<GetOSSFlowStatisResponse> getOSSFlowStatis(GetOSSFlowStatisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetOSSFlowStatis").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetOSSFlowStatisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetOSSFlowStatisResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetOSSStatis  GetOSSStatisRequest
     * @return GetOSSStatisResponse
     */
    @Override
    public CompletableFuture<GetOSSStatisResponse> getOSSStatis(GetOSSStatisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetOSSStatis").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetOSSStatisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetOSSStatisResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetPageByCondAppInfo  GetPageByCondAppInfoRequest
     * @return GetPageByCondAppInfoResponse
     */
    @Override
    public CompletableFuture<GetPageByCondAppInfoResponse> getPageByCondAppInfo(GetPageByCondAppInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetPageByCondAppInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPageByCondAppInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPageByCondAppInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetPageByCondLicenseInstance  GetPageByCondLicenseInstanceRequest
     * @return GetPageByCondLicenseInstanceResponse
     */
    @Override
    public CompletableFuture<GetPageByCondLicenseInstanceResponse> getPageByCondLicenseInstance(GetPageByCondLicenseInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetPageByCondLicenseInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPageByCondLicenseInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPageByCondLicenseInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetPersonalStorageList  GetPersonalStorageListRequest
     * @return GetPersonalStorageListResponse
     */
    @Override
    public CompletableFuture<GetPersonalStorageListResponse> getPersonalStorageList(GetPersonalStorageListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetPersonalStorageList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPersonalStorageListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPersonalStorageListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetPlanSpecificationForLicense  GetPlanSpecificationForLicenseRequest
     * @return GetPlanSpecificationForLicenseResponse
     */
    @Override
    public CompletableFuture<GetPlanSpecificationForLicenseResponse> getPlanSpecificationForLicense(GetPlanSpecificationForLicenseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetPlanSpecificationForLicense").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPlanSpecificationForLicenseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPlanSpecificationForLicenseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetPlayConfig  GetPlayConfigRequest
     * @return GetPlayConfigResponse
     */
    @Override
    public CompletableFuture<GetPlayConfigResponse> getPlayConfig(GetPlayConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetPlayConfig").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPlayConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPlayConfigResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of GetPlayerConfig  GetPlayerConfigRequest
     * @return GetPlayerConfigResponse
     */
    @Override
    public CompletableFuture<GetPlayerConfigResponse> getPlayerConfig(GetPlayerConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetPlayerConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPlayerConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPlayerConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetSdkIntegration  GetSdkIntegrationRequest
     * @return GetSdkIntegrationResponse
     */
    @Override
    public CompletableFuture<GetSdkIntegrationResponse> getSdkIntegration(GetSdkIntegrationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetSdkIntegration").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSdkIntegrationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSdkIntegrationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetSdkList  GetSdkListRequest
     * @return GetSdkListResponse
     */
    @Override
    public CompletableFuture<GetSdkListResponse> getSdkList(GetSdkListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetSdkList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSdkListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSdkListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetSpecificationsForLicense  GetSpecificationsForLicenseRequest
     * @return GetSpecificationsForLicenseResponse
     */
    @Override
    public CompletableFuture<GetSpecificationsForLicenseResponse> getSpecificationsForLicense(GetSpecificationsForLicenseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetSpecificationsForLicense").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSpecificationsForLicenseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSpecificationsForLicenseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetStorageInfo  GetStorageInfoRequest
     * @return GetStorageInfoResponse
     */
    @Override
    public CompletableFuture<GetStorageInfoResponse> getStorageInfo(GetStorageInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetStorageInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetStorageInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetStorageInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetStorageList  GetStorageListRequest
     * @return GetStorageListResponse
     */
    @Override
    public CompletableFuture<GetStorageListResponse> getStorageList(GetStorageListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetStorageList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetStorageListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetStorageListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetStorageNotifyConfig  GetStorageNotifyConfigRequest
     * @return GetStorageNotifyConfigResponse
     */
    @Override
    public CompletableFuture<GetStorageNotifyConfigResponse> getStorageNotifyConfig(GetStorageNotifyConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetStorageNotifyConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetStorageNotifyConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetStorageNotifyConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetStorageRegionList  GetStorageRegionListRequest
     * @return GetStorageRegionListResponse
     */
    @Override
    public CompletableFuture<GetStorageRegionListResponse> getStorageRegionList(GetStorageRegionListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetStorageRegionList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetStorageRegionListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetStorageRegionListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTemplateGroupConsole  GetTemplateGroupConsoleRequest
     * @return GetTemplateGroupConsoleResponse
     */
    @Override
    public CompletableFuture<GetTemplateGroupConsoleResponse> getTemplateGroupConsole(GetTemplateGroupConsoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetTemplateGroupConsole").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTemplateGroupConsoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTemplateGroupConsoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTotalStatis  GetTotalStatisRequest
     * @return GetTotalStatisResponse
     */
    @Override
    public CompletableFuture<GetTotalStatisResponse> getTotalStatis(GetTotalStatisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetTotalStatis").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTotalStatisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTotalStatisResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of GetUnactivatedLicenseOrder  GetUnactivatedLicenseOrderRequest
     * @return GetUnactivatedLicenseOrderResponse
     */
    @Override
    public CompletableFuture<GetUnactivatedLicenseOrderResponse> getUnactivatedLicenseOrder(GetUnactivatedLicenseOrderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetUnactivatedLicenseOrder").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetUnactivatedLicenseOrderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetUnactivatedLicenseOrderResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of GetUploadProgress  GetUploadProgressRequest
     * @return GetUploadProgressResponse
     */
    @Override
    public CompletableFuture<GetUploadProgressResponse> getUploadProgress(GetUploadProgressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetUploadProgress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetUploadProgressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetUploadProgressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetVideoConfig  GetVideoConfigRequest
     * @return GetVideoConfigResponse
     */
    @Override
    public CompletableFuture<GetVideoConfigResponse> getVideoConfig(GetVideoConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetVideoConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetVideoConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetVideoConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetVideoDNAResult  GetVideoDNAResultRequest
     * @return GetVideoDNAResultResponse
     */
    @Override
    public CompletableFuture<GetVideoDNAResultResponse> getVideoDNAResult(GetVideoDNAResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetVideoDNAResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetVideoDNAResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetVideoDNAResultResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of GetVideoPlayInfo  GetVideoPlayInfoRequest
     * @return GetVideoPlayInfoResponse
     */
    @Override
    public CompletableFuture<GetVideoPlayInfoResponse> getVideoPlayInfo(GetVideoPlayInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetVideoPlayInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetVideoPlayInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetVideoPlayInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetVodServiceRegion  GetVodServiceRegionRequest
     * @return GetVodServiceRegionResponse
     */
    @Override
    public CompletableFuture<GetVodServiceRegionResponse> getVodServiceRegion(GetVodServiceRegionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetVodServiceRegion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetVodServiceRegionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetVodServiceRegionResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of GetWatermarkConsole  GetWatermarkConsoleRequest
     * @return GetWatermarkConsoleResponse
     */
    @Override
    public CompletableFuture<GetWatermarkConsoleResponse> getWatermarkConsole(GetWatermarkConsoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetWatermarkConsole").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetWatermarkConsoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetWatermarkConsoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetWatermarksConsole  GetWatermarksConsoleRequest
     * @return GetWatermarksConsoleResponse
     */
    @Override
    public CompletableFuture<GetWatermarksConsoleResponse> getWatermarksConsole(GetWatermarksConsoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetWatermarksConsole").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetWatermarksConsoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetWatermarksConsoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetWorkflow  GetWorkflowRequest
     * @return GetWorkflowResponse
     */
    @Override
    public CompletableFuture<GetWorkflowResponse> getWorkflow(GetWorkflowRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetWorkflow").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetWorkflowResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetWorkflowResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of HttpRequestVodTestTool  HttpRequestVodTestToolRequest
     * @return HttpRequestVodTestToolResponse
     */
    @Override
    public CompletableFuture<HttpRequestVodTestToolResponse> httpRequestVodTestTool(HttpRequestVodTestToolRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("HttpRequestVodTestTool").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(HttpRequestVodTestToolResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<HttpRequestVodTestToolResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of InitialTranscodeConfig  InitialTranscodeConfigRequest
     * @return InitialTranscodeConfigResponse
     */
    @Override
    public CompletableFuture<InitialTranscodeConfigResponse> initialTranscodeConfig(InitialTranscodeConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("InitialTranscodeConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InitialTranscodeConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InitialTranscodeConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAIASRJob  ListAIASRJobRequest
     * @return ListAIASRJobResponse
     */
    @Override
    public CompletableFuture<ListAIASRJobResponse> listAIASRJob(ListAIASRJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAIASRJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAIASRJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAIASRJobResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of ListAIStatisType  ListAIStatisTypeRequest
     * @return ListAIStatisTypeResponse
     */
    @Override
    public CompletableFuture<ListAIStatisTypeResponse> listAIStatisType(ListAIStatisTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAIStatisType").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAIStatisTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAIStatisTypeResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of ListAIVideoCategoryJob  ListAIVideoCategoryJobRequest
     * @return ListAIVideoCategoryJobResponse
     */
    @Override
    public CompletableFuture<ListAIVideoCategoryJobResponse> listAIVideoCategoryJob(ListAIVideoCategoryJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAIVideoCategoryJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAIVideoCategoryJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAIVideoCategoryJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAIVideoCensorJob  ListAIVideoCensorJobRequest
     * @return ListAIVideoCensorJobResponse
     */
    @Override
    public CompletableFuture<ListAIVideoCensorJobResponse> listAIVideoCensorJob(ListAIVideoCensorJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAIVideoCensorJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAIVideoCensorJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAIVideoCensorJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAIVideoCoverJob  ListAIVideoCoverJobRequest
     * @return ListAIVideoCoverJobResponse
     */
    @Override
    public CompletableFuture<ListAIVideoCoverJobResponse> listAIVideoCoverJob(ListAIVideoCoverJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAIVideoCoverJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAIVideoCoverJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAIVideoCoverJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAIVideoFaceRecogJob  ListAIVideoFaceRecogJobRequest
     * @return ListAIVideoFaceRecogJobResponse
     */
    @Override
    public CompletableFuture<ListAIVideoFaceRecogJobResponse> listAIVideoFaceRecogJob(ListAIVideoFaceRecogJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAIVideoFaceRecogJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAIVideoFaceRecogJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAIVideoFaceRecogJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAIVideoPornRecogJob  ListAIVideoPornRecogJobRequest
     * @return ListAIVideoPornRecogJobResponse
     */
    @Override
    public CompletableFuture<ListAIVideoPornRecogJobResponse> listAIVideoPornRecogJob(ListAIVideoPornRecogJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAIVideoPornRecogJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAIVideoPornRecogJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAIVideoPornRecogJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAIVideoSummaryJob  ListAIVideoSummaryJobRequest
     * @return ListAIVideoSummaryJobResponse
     */
    @Override
    public CompletableFuture<ListAIVideoSummaryJobResponse> listAIVideoSummaryJob(ListAIVideoSummaryJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAIVideoSummaryJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAIVideoSummaryJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAIVideoSummaryJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAIVideoTagJob  ListAIVideoTagJobRequest
     * @return ListAIVideoTagJobResponse
     */
    @Override
    public CompletableFuture<ListAIVideoTagJobResponse> listAIVideoTagJob(ListAIVideoTagJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAIVideoTagJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAIVideoTagJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAIVideoTagJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAIVideoTerrorismRecogJob  ListAIVideoTerrorismRecogJobRequest
     * @return ListAIVideoTerrorismRecogJobResponse
     */
    @Override
    public CompletableFuture<ListAIVideoTerrorismRecogJobResponse> listAIVideoTerrorismRecogJob(ListAIVideoTerrorismRecogJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAIVideoTerrorismRecogJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAIVideoTerrorismRecogJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAIVideoTerrorismRecogJobResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of ListAppPolicy  ListAppPolicyRequest
     * @return ListAppPolicyResponse
     */
    @Override
    public CompletableFuture<ListAppPolicyResponse> listAppPolicy(ListAppPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAppPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAppPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAppPolicyResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of ListBucketRedundancyTransition  ListBucketRedundancyTransitionRequest
     * @return ListBucketRedundancyTransitionResponse
     */
    @Override
    public CompletableFuture<ListBucketRedundancyTransitionResponse> listBucketRedundancyTransition(ListBucketRedundancyTransitionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListBucketRedundancyTransition").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListBucketRedundancyTransitionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListBucketRedundancyTransitionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDNADB  ListDNADBRequest
     * @return ListDNADBResponse
     */
    @Override
    public CompletableFuture<ListDNADBResponse> listDNADB(ListDNADBRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDNADB").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDNADBResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDNADBResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDRMCertInfo  ListDRMCertInfoRequest
     * @return ListDRMCertInfoResponse
     */
    @Override
    public CompletableFuture<ListDRMCertInfoResponse> listDRMCertInfo(ListDRMCertInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDRMCertInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDRMCertInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDRMCertInfoResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of ListIntelligentStrategy  ListIntelligentStrategyRequest
     * @return ListIntelligentStrategyResponse
     */
    @Override
    public CompletableFuture<ListIntelligentStrategyResponse> listIntelligentStrategy(ListIntelligentStrategyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListIntelligentStrategy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListIntelligentStrategyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListIntelligentStrategyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <hr>
     * <ul>
     * <li>You can call the <a href="https://apiworkbench.aliyun-inc.com/document/vod/2017-03-21/GetJobDetail?spm=openapi-amp.newDocPublishment.0.0.616a281fSegn0e">GetJobDetail</a> operation to query detailed information about the tasks.</li>
     * <li>You can call this operation to query only asynchronous tasks of the last six months. The types of tasks that you can query include transcoding tasks, snapshot tasks, and AI tasks.
     * <strong>QPS limits</strong>
     * You can call this operation up to 15 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limits</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of ListJobInfo  ListJobInfoRequest
     * @return ListJobInfoResponse
     */
    @Override
    public CompletableFuture<ListJobInfoResponse> listJobInfo(ListJobInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListJobInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListJobInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListJobInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListLicenseInfos  ListLicenseInfosRequest
     * @return ListLicenseInfosResponse
     */
    @Override
    public CompletableFuture<ListLicenseInfosResponse> listLicenseInfos(ListLicenseInfosRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListLicenseInfos").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListLicenseInfosResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListLicenseInfosResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListLicenses  ListLicensesRequest
     * @return ListLicensesResponse
     */
    @Override
    public CompletableFuture<ListLicensesResponse> listLicenses(ListLicensesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListLicenses").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListLicensesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListLicensesResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of ListMediaDNADeleteJob  ListMediaDNADeleteJobRequest
     * @return ListMediaDNADeleteJobResponse
     */
    @Override
    public CompletableFuture<ListMediaDNADeleteJobResponse> listMediaDNADeleteJob(ListMediaDNADeleteJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListMediaDNADeleteJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMediaDNADeleteJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMediaDNADeleteJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListMediaDNALibs  ListMediaDNALibsRequest
     * @return ListMediaDNALibsResponse
     */
    @Override
    public CompletableFuture<ListMediaDNALibsResponse> listMediaDNALibs(ListMediaDNALibsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListMediaDNALibs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMediaDNALibsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMediaDNALibsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListMediaExportJobs  ListMediaExportJobsRequest
     * @return ListMediaExportJobsResponse
     */
    @Override
    public CompletableFuture<ListMediaExportJobsResponse> listMediaExportJobs(ListMediaExportJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListMediaExportJobs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMediaExportJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMediaExportJobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListMediaLifecycleRule  ListMediaLifecycleRuleRequest
     * @return ListMediaLifecycleRuleResponse
     */
    @Override
    public CompletableFuture<ListMediaLifecycleRuleResponse> listMediaLifecycleRule(ListMediaLifecycleRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListMediaLifecycleRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMediaLifecycleRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMediaLifecycleRuleResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of ListStrategyExecutionRecord  ListStrategyExecutionRecordRequest
     * @return ListStrategyExecutionRecordResponse
     */
    @Override
    public CompletableFuture<ListStrategyExecutionRecordResponse> listStrategyExecutionRecord(ListStrategyExecutionRecordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListStrategyExecutionRecord").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListStrategyExecutionRecordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListStrategyExecutionRecordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
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
     * @param request the request parameters of ListTemplateGroup  ListTemplateGroupRequest
     * @return ListTemplateGroupResponse
     */
    @Override
    public CompletableFuture<ListTemplateGroupResponse> listTemplateGroup(ListTemplateGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTemplateGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTemplateGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTemplateGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTemplateGroupConsole  ListTemplateGroupConsoleRequest
     * @return ListTemplateGroupConsoleResponse
     */
    @Override
    public CompletableFuture<ListTemplateGroupConsoleResponse> listTemplateGroupConsole(ListTemplateGroupConsoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTemplateGroupConsole").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTemplateGroupConsoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTemplateGroupConsoleResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of ListVodEsTemplateInfo  ListVodEsTemplateInfoRequest
     * @return ListVodEsTemplateInfoResponse
     */
    @Override
    public CompletableFuture<ListVodEsTemplateInfoResponse> listVodEsTemplateInfo(ListVodEsTemplateInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListVodEsTemplateInfo").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListVodEsTemplateInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListVodEsTemplateInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListVodRealtimeLogDelivery  ListVodRealtimeLogDeliveryRequest
     * @return ListVodRealtimeLogDeliveryResponse
     */
    @Override
    public CompletableFuture<ListVodRealtimeLogDeliveryResponse> listVodRealtimeLogDelivery(ListVodRealtimeLogDeliveryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListVodRealtimeLogDelivery").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListVodRealtimeLogDeliveryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListVodRealtimeLogDeliveryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListVodRealtimeLogDeliveryDomains  ListVodRealtimeLogDeliveryDomainsRequest
     * @return ListVodRealtimeLogDeliveryDomainsResponse
     */
    @Override
    public CompletableFuture<ListVodRealtimeLogDeliveryDomainsResponse> listVodRealtimeLogDeliveryDomains(ListVodRealtimeLogDeliveryDomainsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListVodRealtimeLogDeliveryDomains").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListVodRealtimeLogDeliveryDomainsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListVodRealtimeLogDeliveryDomainsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListVodRealtimeLogDeliveryInfos  ListVodRealtimeLogDeliveryInfosRequest
     * @return ListVodRealtimeLogDeliveryInfosResponse
     */
    @Override
    public CompletableFuture<ListVodRealtimeLogDeliveryInfosResponse> listVodRealtimeLogDeliveryInfos(ListVodRealtimeLogDeliveryInfosRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListVodRealtimeLogDeliveryInfos").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListVodRealtimeLogDeliveryInfosResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListVodRealtimeLogDeliveryInfosResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListVodTagResources  ListVodTagResourcesRequest
     * @return ListVodTagResourcesResponse
     */
    @Override
    public CompletableFuture<ListVodTagResourcesResponse> listVodTagResources(ListVodTagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListVodTagResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListVodTagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListVodTagResourcesResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of ListWorkflow  ListWorkflowRequest
     * @return ListWorkflowResponse
     */
    @Override
    public CompletableFuture<ListWorkflowResponse> listWorkflow(ListWorkflowRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListWorkflow").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListWorkflowResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListWorkflowResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyLicenseInfo  ModifyLicenseInfoRequest
     * @return ModifyLicenseInfoResponse
     */
    @Override
    public CompletableFuture<ModifyLicenseInfoResponse> modifyLicenseInfo(ModifyLicenseInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyLicenseInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyLicenseInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyLicenseInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyVodDomainSchdmByProperty  ModifyVodDomainSchdmByPropertyRequest
     * @return ModifyVodDomainSchdmByPropertyResponse
     */
    @Override
    public CompletableFuture<ModifyVodDomainSchdmByPropertyResponse> modifyVodDomainSchdmByProperty(ModifyVodDomainSchdmByPropertyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyVodDomainSchdmByProperty").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyVodDomainSchdmByPropertyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyVodDomainSchdmByPropertyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyVodService  ModifyVodServiceRequest
     * @return ModifyVodServiceResponse
     */
    @Override
    public CompletableFuture<ModifyVodServiceResponse> modifyVodService(ModifyVodServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyVodService").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyVodServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyVodServiceResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of OpenVodService  OpenVodServiceRequest
     * @return OpenVodServiceResponse
     */
    @Override
    public CompletableFuture<OpenVodServiceResponse> openVodService(OpenVodServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OpenVodService").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OpenVodServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OpenVodServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PreloadPlayDeviceAbility  PreloadPlayDeviceAbilityRequest
     * @return PreloadPlayDeviceAbilityResponse
     */
    @Override
    public CompletableFuture<PreloadPlayDeviceAbilityResponse> preloadPlayDeviceAbility(PreloadPlayDeviceAbilityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PreloadPlayDeviceAbility").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PreloadPlayDeviceAbilityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PreloadPlayDeviceAbilityResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of PublishVodStagingConfigToProduction  PublishVodStagingConfigToProductionRequest
     * @return PublishVodStagingConfigToProductionResponse
     */
    @Override
    public CompletableFuture<PublishVodStagingConfigToProductionResponse> publishVodStagingConfigToProduction(PublishVodStagingConfigToProductionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PublishVodStagingConfigToProduction").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PublishVodStagingConfigToProductionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PublishVodStagingConfigToProductionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PushObjectCache  PushObjectCacheRequest
     * @return PushObjectCacheResponse
     */
    @Override
    public CompletableFuture<PushObjectCacheResponse> pushObjectCache(PushObjectCacheRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PushObjectCache").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PushObjectCacheResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PushObjectCacheResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryCssOrderForLicense  QueryCssOrderForLicenseRequest
     * @return QueryCssOrderForLicenseResponse
     */
    @Override
    public CompletableFuture<QueryCssOrderForLicenseResponse> queryCssOrderForLicense(QueryCssOrderForLicenseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryCssOrderForLicense").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryCssOrderForLicenseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryCssOrderForLicenseResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of RefreshObjectCaches  RefreshObjectCachesRequest
     * @return RefreshObjectCachesResponse
     */
    @Override
    public CompletableFuture<RefreshObjectCachesResponse> refreshObjectCaches(RefreshObjectCachesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RefreshObjectCaches").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RefreshObjectCachesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RefreshObjectCachesResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of RegistDRMCertInfo  RegistDRMCertInfoRequest
     * @return RegistDRMCertInfoResponse
     */
    @Override
    public CompletableFuture<RegistDRMCertInfoResponse> registDRMCertInfo(RegistDRMCertInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RegistDRMCertInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RegistDRMCertInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RegistDRMCertInfoResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of RenewAppLicense  RenewAppLicenseRequest
     * @return RenewAppLicenseResponse
     */
    @Override
    public CompletableFuture<RenewAppLicenseResponse> renewAppLicense(RenewAppLicenseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RenewAppLicense").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RenewAppLicenseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RenewAppLicenseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RenewFreeLicense  RenewFreeLicenseRequest
     * @return RenewFreeLicenseResponse
     */
    @Override
    public CompletableFuture<RenewFreeLicenseResponse> renewFreeLicense(RenewFreeLicenseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RenewFreeLicense").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RenewFreeLicenseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RenewFreeLicenseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ReportUploadProgress  ReportUploadProgressRequest
     * @return ReportUploadProgressResponse
     */
    @Override
    public CompletableFuture<ReportUploadProgressResponse> reportUploadProgress(ReportUploadProgressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReportUploadProgress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReportUploadProgressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReportUploadProgressResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of RollbackVodStagingConfig  RollbackVodStagingConfigRequest
     * @return RollbackVodStagingConfigResponse
     */
    @Override
    public CompletableFuture<RollbackVodStagingConfigResponse> rollbackVodStagingConfig(RollbackVodStagingConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RollbackVodStagingConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RollbackVodStagingConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RollbackVodStagingConfigResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of SetAIService  SetAIServiceRequest
     * @return SetAIServiceResponse
     */
    @Override
    public CompletableFuture<SetAIServiceResponse> setAIService(SetAIServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetAIService").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetAIServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetAIServiceResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of SetCheckChannel  SetCheckChannelRequest
     * @return SetCheckChannelResponse
     */
    @Override
    public CompletableFuture<SetCheckChannelResponse> setCheckChannel(SetCheckChannelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetCheckChannel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetCheckChannelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetCheckChannelResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of SetCustomerConfig  SetCustomerConfigRequest
     * @return SetCustomerConfigResponse
     */
    @Override
    public CompletableFuture<SetCustomerConfigResponse> setCustomerConfig(SetCustomerConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetCustomerConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetCustomerConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetCustomerConfigResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of SetDefaultPlayDomain  SetDefaultPlayDomainRequest
     * @return SetDefaultPlayDomainResponse
     */
    @Override
    public CompletableFuture<SetDefaultPlayDomainResponse> setDefaultPlayDomain(SetDefaultPlayDomainRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetDefaultPlayDomain").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetDefaultPlayDomainResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetDefaultPlayDomainResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetDefaultTemplateGroupConsole  SetDefaultTemplateGroupConsoleRequest
     * @return SetDefaultTemplateGroupConsoleResponse
     */
    @Override
    public CompletableFuture<SetDefaultTemplateGroupConsoleResponse> setDefaultTemplateGroupConsole(SetDefaultTemplateGroupConsoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetDefaultTemplateGroupConsole").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetDefaultTemplateGroupConsoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetDefaultTemplateGroupConsoleResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of SetDefaultUploadStorage  SetDefaultUploadStorageRequest
     * @return SetDefaultUploadStorageResponse
     */
    @Override
    public CompletableFuture<SetDefaultUploadStorageResponse> setDefaultUploadStorage(SetDefaultUploadStorageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetDefaultUploadStorage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetDefaultUploadStorageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetDefaultUploadStorageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetDefaultVodTemplate  SetDefaultVodTemplateRequest
     * @return SetDefaultVodTemplateResponse
     */
    @Override
    public CompletableFuture<SetDefaultVodTemplateResponse> setDefaultVodTemplate(SetDefaultVodTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetDefaultVodTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetDefaultVodTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetDefaultVodTemplateResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of SetDefaultWatermarkConsole  SetDefaultWatermarkConsoleRequest
     * @return SetDefaultWatermarkConsoleResponse
     */
    @Override
    public CompletableFuture<SetDefaultWatermarkConsoleResponse> setDefaultWatermarkConsole(SetDefaultWatermarkConsoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetDefaultWatermarkConsole").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetDefaultWatermarkConsoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetDefaultWatermarkConsoleResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of SetL2OssKeyConfig  SetL2OssKeyConfigRequest
     * @return SetL2OssKeyConfigResponse
     */
    @Override
    public CompletableFuture<SetL2OssKeyConfigResponse> setL2OssKeyConfig(SetL2OssKeyConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetL2OssKeyConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetL2OssKeyConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetL2OssKeyConfigResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of SetMessageCloudMonitorConfig  SetMessageCloudMonitorConfigRequest
     * @return SetMessageCloudMonitorConfigResponse
     */
    @Override
    public CompletableFuture<SetMessageCloudMonitorConfigResponse> setMessageCloudMonitorConfig(SetMessageCloudMonitorConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetMessageCloudMonitorConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetMessageCloudMonitorConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetMessageCloudMonitorConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetStorageACL  SetStorageACLRequest
     * @return SetStorageACLResponse
     */
    @Override
    public CompletableFuture<SetStorageACLResponse> setStorageACL(SetStorageACLRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetStorageACL").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetStorageACLResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetStorageACLResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of SetVodDomainStagingConfig  SetVodDomainStagingConfigRequest
     * @return SetVodDomainStagingConfigResponse
     */
    @Override
    public CompletableFuture<SetVodDomainStagingConfigResponse> setVodDomainStagingConfig(SetVodDomainStagingConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetVodDomainStagingConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetVodDomainStagingConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetVodDomainStagingConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StartVodDomain  StartVodDomainRequest
     * @return StartVodDomainResponse
     */
    @Override
    public CompletableFuture<StartVodDomainResponse> startVodDomain(StartVodDomainRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartVodDomain").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartVodDomainResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartVodDomainResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StopVodDomain  StopVodDomainRequest
     * @return StopVodDomainResponse
     */
    @Override
    public CompletableFuture<StopVodDomainResponse> stopVodDomain(StopVodDomainRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopVodDomain").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopVodDomainResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopVodDomainResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubmitAIASRJob  SubmitAIASRJobRequest
     * @return SubmitAIASRJobResponse
     */
    @Override
    public CompletableFuture<SubmitAIASRJobResponse> submitAIASRJob(SubmitAIASRJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitAIASRJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitAIASRJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitAIASRJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubmitAICaptionExtractionJob  SubmitAICaptionExtractionJobRequest
     * @return SubmitAICaptionExtractionJobResponse
     */
    @Override
    public CompletableFuture<SubmitAICaptionExtractionJobResponse> submitAICaptionExtractionJob(SubmitAICaptionExtractionJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitAICaptionExtractionJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitAICaptionExtractionJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitAICaptionExtractionJobResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of SubmitAIVideoCategoryJob  SubmitAIVideoCategoryJobRequest
     * @return SubmitAIVideoCategoryJobResponse
     */
    @Override
    public CompletableFuture<SubmitAIVideoCategoryJobResponse> submitAIVideoCategoryJob(SubmitAIVideoCategoryJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitAIVideoCategoryJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitAIVideoCategoryJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitAIVideoCategoryJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubmitAIVideoCensorJob  SubmitAIVideoCensorJobRequest
     * @return SubmitAIVideoCensorJobResponse
     */
    @Override
    public CompletableFuture<SubmitAIVideoCensorJobResponse> submitAIVideoCensorJob(SubmitAIVideoCensorJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitAIVideoCensorJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitAIVideoCensorJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitAIVideoCensorJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubmitAIVideoCoverJob  SubmitAIVideoCoverJobRequest
     * @return SubmitAIVideoCoverJobResponse
     */
    @Override
    public CompletableFuture<SubmitAIVideoCoverJobResponse> submitAIVideoCoverJob(SubmitAIVideoCoverJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitAIVideoCoverJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitAIVideoCoverJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitAIVideoCoverJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubmitAIVideoFaceRecogJob  SubmitAIVideoFaceRecogJobRequest
     * @return SubmitAIVideoFaceRecogJobResponse
     */
    @Override
    public CompletableFuture<SubmitAIVideoFaceRecogJobResponse> submitAIVideoFaceRecogJob(SubmitAIVideoFaceRecogJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitAIVideoFaceRecogJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitAIVideoFaceRecogJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitAIVideoFaceRecogJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubmitAIVideoPornRecogJob  SubmitAIVideoPornRecogJobRequest
     * @return SubmitAIVideoPornRecogJobResponse
     */
    @Override
    public CompletableFuture<SubmitAIVideoPornRecogJobResponse> submitAIVideoPornRecogJob(SubmitAIVideoPornRecogJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitAIVideoPornRecogJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitAIVideoPornRecogJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitAIVideoPornRecogJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubmitAIVideoSummaryJob  SubmitAIVideoSummaryJobRequest
     * @return SubmitAIVideoSummaryJobResponse
     */
    @Override
    public CompletableFuture<SubmitAIVideoSummaryJobResponse> submitAIVideoSummaryJob(SubmitAIVideoSummaryJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitAIVideoSummaryJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitAIVideoSummaryJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitAIVideoSummaryJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubmitAIVideoTagJob  SubmitAIVideoTagJobRequest
     * @return SubmitAIVideoTagJobResponse
     */
    @Override
    public CompletableFuture<SubmitAIVideoTagJobResponse> submitAIVideoTagJob(SubmitAIVideoTagJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitAIVideoTagJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitAIVideoTagJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitAIVideoTagJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubmitAIVideoTerrorismRecogJob  SubmitAIVideoTerrorismRecogJobRequest
     * @return SubmitAIVideoTerrorismRecogJobResponse
     */
    @Override
    public CompletableFuture<SubmitAIVideoTerrorismRecogJobResponse> submitAIVideoTerrorismRecogJob(SubmitAIVideoTerrorismRecogJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitAIVideoTerrorismRecogJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitAIVideoTerrorismRecogJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitAIVideoTerrorismRecogJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubmitBucketDeleteTask  SubmitBucketDeleteTaskRequest
     * @return SubmitBucketDeleteTaskResponse
     */
    @Override
    public CompletableFuture<SubmitBucketDeleteTaskResponse> submitBucketDeleteTask(SubmitBucketDeleteTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitBucketDeleteTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitBucketDeleteTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitBucketDeleteTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubmitBucketRedundancyTransition  SubmitBucketRedundancyTransitionRequest
     * @return SubmitBucketRedundancyTransitionResponse
     */
    @Override
    public CompletableFuture<SubmitBucketRedundancyTransitionResponse> submitBucketRedundancyTransition(SubmitBucketRedundancyTransitionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitBucketRedundancyTransition").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitBucketRedundancyTransitionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitBucketRedundancyTransitionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubmitDNAInitializationJob  SubmitDNAInitializationJobRequest
     * @return SubmitDNAInitializationJobResponse
     */
    @Override
    public CompletableFuture<SubmitDNAInitializationJobResponse> submitDNAInitializationJob(SubmitDNAInitializationJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitDNAInitializationJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitDNAInitializationJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitDNAInitializationJobResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of SubmitLiveEditing  SubmitLiveEditingRequest
     * @return SubmitLiveEditingResponse
     */
    @Override
    public CompletableFuture<SubmitLiveEditingResponse> submitLiveEditing(SubmitLiveEditingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitLiveEditing").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitLiveEditingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitLiveEditingResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of SubmitMediaExportJob  SubmitMediaExportJobRequest
     * @return SubmitMediaExportJobResponse
     */
    @Override
    public CompletableFuture<SubmitMediaExportJobResponse> submitMediaExportJob(SubmitMediaExportJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitMediaExportJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitMediaExportJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitMediaExportJobResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of SubmitPreprocessJobsConsole  SubmitPreprocessJobsConsoleRequest
     * @return SubmitPreprocessJobsConsoleResponse
     */
    @Override
    public CompletableFuture<SubmitPreprocessJobsConsoleResponse> submitPreprocessJobsConsole(SubmitPreprocessJobsConsoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitPreprocessJobsConsole").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitPreprocessJobsConsoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitPreprocessJobsConsoleResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of SyncUserProdAccountAndBucket  SyncUserProdAccountAndBucketRequest
     * @return SyncUserProdAccountAndBucketResponse
     */
    @Override
    public CompletableFuture<SyncUserProdAccountAndBucketResponse> syncUserProdAccountAndBucket(SyncUserProdAccountAndBucketRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SyncUserProdAccountAndBucket").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SyncUserProdAccountAndBucketResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SyncUserProdAccountAndBucketResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
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
     * @param request the request parameters of TagVodResources  TagVodResourcesRequest
     * @return TagVodResourcesResponse
     */
    @Override
    public CompletableFuture<TagVodResourcesResponse> tagVodResources(TagVodResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TagVodResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TagVodResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TagVodResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TerminateBucketDeleteTask  TerminateBucketDeleteTaskRequest
     * @return TerminateBucketDeleteTaskResponse
     */
    @Override
    public CompletableFuture<TerminateBucketDeleteTaskResponse> terminateBucketDeleteTask(TerminateBucketDeleteTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TerminateBucketDeleteTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TerminateBucketDeleteTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TerminateBucketDeleteTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UnTagVodResources  UnTagVodResourcesRequest
     * @return UnTagVodResourcesResponse
     */
    @Override
    public CompletableFuture<UnTagVodResourcesResponse> unTagVodResources(UnTagVodResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UnTagVodResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnTagVodResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnTagVodResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
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
     * @param request the request parameters of UpdateAppPolicy  UpdateAppPolicyRequest
     * @return UpdateAppPolicyResponse
     */
    @Override
    public CompletableFuture<UpdateAppPolicyResponse> updateAppPolicy(UpdateAppPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateAppPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAppPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAppPolicyResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of UpdateCustomTemplateAndGroupConsole  UpdateCustomTemplateAndGroupConsoleRequest
     * @return UpdateCustomTemplateAndGroupConsoleResponse
     */
    @Override
    public CompletableFuture<UpdateCustomTemplateAndGroupConsoleResponse> updateCustomTemplateAndGroupConsole(UpdateCustomTemplateAndGroupConsoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateCustomTemplateAndGroupConsole").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateCustomTemplateAndGroupConsoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateCustomTemplateAndGroupConsoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateDNADB  UpdateDNADBRequest
     * @return UpdateDNADBResponse
     */
    @Override
    public CompletableFuture<UpdateDNADBResponse> updateDNADB(UpdateDNADBRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateDNADB").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDNADBResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDNADBResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of UpdateIntelligentStrategy  UpdateIntelligentStrategyRequest
     * @return UpdateIntelligentStrategyResponse
     */
    @Override
    public CompletableFuture<UpdateIntelligentStrategyResponse> updateIntelligentStrategy(UpdateIntelligentStrategyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateIntelligentStrategy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateIntelligentStrategyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateIntelligentStrategyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateMediaLifecycleRule  UpdateMediaLifecycleRuleRequest
     * @return UpdateMediaLifecycleRuleResponse
     */
    @Override
    public CompletableFuture<UpdateMediaLifecycleRuleResponse> updateMediaLifecycleRule(UpdateMediaLifecycleRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateMediaLifecycleRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateMediaLifecycleRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateMediaLifecycleRuleResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of UpdateStreamInfo  UpdateStreamInfoRequest
     * @return UpdateStreamInfoResponse
     */
    @Override
    public CompletableFuture<UpdateStreamInfoResponse> updateStreamInfo(UpdateStreamInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateStreamInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateStreamInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateStreamInfoResponse> future = new CompletableFuture<>();
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
     * <h3><a href="#"></a></h3>
     * <p>You can call this operation to modify information such as the title, tags, and description about audio and video files based on audio or video IDs. You must pass in the parameters that you want to modify. Otherwise, parameter configurations are not overwritten.</p>
     * <h3><a href="#qps-"></a>Queries per second (QPS) limit</h3>
     * <p>You can call this operation up to 100 times per second per account. Requests that exceed this limit are dropped and you may experience service interruptions. We recommend that you take note of this limit when you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/342790.html">QPS limits on API operations</a>.</p>
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
     * @param request the request parameters of UpdateWatermarkConsole  UpdateWatermarkConsoleRequest
     * @return UpdateWatermarkConsoleResponse
     */
    @Override
    public CompletableFuture<UpdateWatermarkConsoleResponse> updateWatermarkConsole(UpdateWatermarkConsoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateWatermarkConsole").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateWatermarkConsoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateWatermarkConsoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateWorkflow  UpdateWorkflowRequest
     * @return UpdateWorkflowResponse
     */
    @Override
    public CompletableFuture<UpdateWorkflowResponse> updateWorkflow(UpdateWorkflowRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateWorkflow").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateWorkflowResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateWorkflowResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of ValidateCdnUrlAuth  ValidateCdnUrlAuthRequest
     * @return ValidateCdnUrlAuthResponse
     */
    @Override
    public CompletableFuture<ValidateCdnUrlAuthResponse> validateCdnUrlAuth(ValidateCdnUrlAuthRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ValidateCdnUrlAuth").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ValidateCdnUrlAuthResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ValidateCdnUrlAuthResponse> future = new CompletableFuture<>();
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
