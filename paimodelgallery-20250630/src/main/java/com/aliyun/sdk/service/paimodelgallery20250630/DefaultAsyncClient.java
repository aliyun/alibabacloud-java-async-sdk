// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paimodelgallery20250630;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.paimodelgallery20250630.models.*;
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
        this.product = "PAIModelGallery";
        this.version = "2025-06-30";
        this.endpointRule = "regional";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API operation creates a new node plan. You can specify the workspace ID, node plan type, name, and steps.</li>
     * <li>If you use a scenario-specific distillation template, provide the <code>TemplateId</code> parameter and make sure that <code>JobPlanSteps</code> contains distillation configurations that match the template.</li>
     * <li>The <code>Tag</code> parameter follows the Alibaba Cloud label system specification and is used to add additional identity information to the node plan.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateJobPlan  CreateJobPlanRequest
     * @return CreateJobPlanResponse
     */
    @Override
    public CompletableFuture<CreateJobPlanResponse> createJobPlan(CreateJobPlanRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateJobPlan").setMethod(HttpMethod.POST).setPathRegex("/api/v1/jobplans").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateJobPlanResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateJobPlanResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description.</h2>
     * 
     * @param request the request parameters of DeleteJobPlan  DeleteJobPlanRequest
     * @return DeleteJobPlanResponse
     */
    @Override
    public CompletableFuture<DeleteJobPlanResponse> deleteJobPlan(DeleteJobPlanRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteJobPlan").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/jobplans/{JobPlanId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteJobPlanResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteJobPlanResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API operation queries the full details of a specific distillation template to facilitate rendering the creation form.</li>
     * <li>The template ID is a required parameter, obtained from the <code>ListDistillationTemplates</code> operation.</li>
     * <li>The <code>DefaultConfig</code> field provides the complete EasyDistill configuration YAML (with comments). All paths in the YAML are relative paths, and callers do not need to perform absolute path conversion or string replacement.</li>
     * <li>All translatable fields are automatically parsed into the corresponding language version based on the <code>x-acs-accept-language</code> request header.</li>
     * <li>If the <code>TrainingOptions</code> field is missing, the template supports only the first stage of processing. Attempts to use such a template to create a task that includes the second stage will fail.</li>
     * </ul>
     * 
     * @param request the request parameters of GetDistillationTemplate  GetDistillationTemplateRequest
     * @return GetDistillationTemplateResponse
     */
    @Override
    public CompletableFuture<GetDistillationTemplateResponse> getDistillationTemplate(GetDistillationTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetDistillationTemplate").setMethod(HttpMethod.GET).setPathRegex("/api/v1/distillationtemplates/{TemplateId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDistillationTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDistillationTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <p>This API operation retrieves the details of a job plan based on the specified job plan ID (<code>JobPlanId</code>), including but not limited to the name, type, and current step status of the job plan. Make sure the <code>JobPlanId</code> provided in the request is valid and belongs to your workspace.</p>
     * 
     * @param request the request parameters of GetJobPlan  GetJobPlanRequest
     * @return GetJobPlanResponse
     */
    @Override
    public CompletableFuture<GetJobPlanResponse> getJobPlan(GetJobPlanRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetJobPlan").setMethod(HttpMethod.GET).setPathRegex("/api/v1/jobplans/{JobPlanId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetJobPlanResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetJobPlanResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation supports filtered queries by using the TemplateId, Category, and Keyword parameters.</li>
     * <li>Pagination is controlled by the PageNumber and PageSize parameters, consistent with other paginated operations of the same service.</li>
     * <li>Templates are public resources that do not belong to any workspace. Therefore, you do not need to specify WorkspaceId.</li>
     * <li>All translatable fields such as TemplateName and Description are automatically parsed into the corresponding language version based on the x-acs-accept-language request header.</li>
     * </ul>
     * 
     * @param request the request parameters of ListDistillationTemplates  ListDistillationTemplatesRequest
     * @return ListDistillationTemplatesResponse
     */
    @Override
    public CompletableFuture<ListDistillationTemplatesResponse> listDistillationTemplates(ListDistillationTemplatesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListDistillationTemplates").setMethod(HttpMethod.GET).setPathRegex("/api/v1/distillationtemplates").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDistillationTemplatesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDistillationTemplatesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li><code>WorkspaceId</code> is a required parameter that specifies the workspace to which the job plans belong.</li>
     * <li>The <code>Tag</code> parameter must be encoded by using <code>EncodeURI</code> before being passed.</li>
     * <li>If both <code>TemplateId</code> and <code>HasTemplate</code> are specified, the value of <code>TemplateId</code> takes precedence for filtering.</li>
     * <li><code>JobPlanName</code> supports exact match. Enclose the specific name in quotation marks.</li>
     * <li>By default, results are sorted in descending order by creation time (<code>GmtCreateTime</code>). Set the <code>Order</code> parameter to <code>ASC</code> to change the sort order.</li>
     * </ul>
     * 
     * @param request the request parameters of ListJobPlans  ListJobPlansRequest
     * @return ListJobPlansResponse
     */
    @Override
    public CompletableFuture<ListJobPlansResponse> listJobPlans(ListJobPlansRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListJobPlans").setMethod(HttpMethod.GET).setPathRegex("/api/v1/jobplans").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListJobPlansResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListJobPlansResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListModelGalleryModels  ListModelGalleryModelsRequest
     * @return ListModelGalleryModelsResponse
     */
    @Override
    public CompletableFuture<ListModelGalleryModelsResponse> listModelGalleryModels(ListModelGalleryModelsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListModelGalleryModels").setMethod(HttpMethod.GET).setPathRegex("/api/v1/modelgallery/models").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListModelGalleryModelsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListModelGalleryModelsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>You can use this API operation to update the current execution step (<code>JobPlanCurrentStep</code>) and related tags (<code>Tag</code>) of a specific task plan identified by <code>JobPlanId</code>. If the request contains tag information, tags are updated or added based on the provided key-value pairs.</p>
     * <ul>
     * <li><strong>JobPlanId</strong> is a path parameter. You must provide a valid task plan ID.</li>
     * <li><strong>JobPlanCurrentStep</strong> is an optional parameter that specifies the new current step of the task.</li>
     * <li><strong>Tag</strong> is an optional parameter that specifies a list of key-value pairs used to label the task plan. Each tag consists of a <code>Key</code> and a <code>Value</code>.
     * Note: Ensure that the <code>JobPlanId</code> you provide exists and that you have the permissions to modify it.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateJobPlan  UpdateJobPlanRequest
     * @return UpdateJobPlanResponse
     */
    @Override
    public CompletableFuture<UpdateJobPlanResponse> updateJobPlan(UpdateJobPlanRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateJobPlan").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/jobplans/{JobPlanId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateJobPlanResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateJobPlanResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
