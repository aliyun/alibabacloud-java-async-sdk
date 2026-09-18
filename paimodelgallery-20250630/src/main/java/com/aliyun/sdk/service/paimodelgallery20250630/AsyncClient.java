// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paimodelgallery20250630;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.paimodelgallery20250630.models.*;
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
    CompletableFuture<CreateJobPlanResponse> createJobPlan(CreateJobPlanRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description.</h2>
     * 
     * @param request the request parameters of DeleteJobPlan  DeleteJobPlanRequest
     * @return DeleteJobPlanResponse
     */
    CompletableFuture<DeleteJobPlanResponse> deleteJobPlan(DeleteJobPlanRequest request);

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
    CompletableFuture<GetDistillationTemplateResponse> getDistillationTemplate(GetDistillationTemplateRequest request);

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <p>This API operation retrieves the details of a job plan based on the specified job plan ID (<code>JobPlanId</code>), including but not limited to the name, type, and current step status of the job plan. Make sure the <code>JobPlanId</code> provided in the request is valid and belongs to your workspace.</p>
     * 
     * @param request the request parameters of GetJobPlan  GetJobPlanRequest
     * @return GetJobPlanResponse
     */
    CompletableFuture<GetJobPlanResponse> getJobPlan(GetJobPlanRequest request);

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
    CompletableFuture<ListDistillationTemplatesResponse> listDistillationTemplates(ListDistillationTemplatesRequest request);

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
    CompletableFuture<ListJobPlansResponse> listJobPlans(ListJobPlansRequest request);

    /**
     * @param request the request parameters of ListModelGalleryModels  ListModelGalleryModelsRequest
     * @return ListModelGalleryModelsResponse
     */
    CompletableFuture<ListModelGalleryModelsResponse> listModelGalleryModels(ListModelGalleryModelsRequest request);

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
    CompletableFuture<UpdateJobPlanResponse> updateJobPlan(UpdateJobPlanRequest request);

}
