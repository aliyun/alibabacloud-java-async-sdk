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
     * @param request the request parameters of CreateJobPlan  CreateJobPlanRequest
     * @return CreateJobPlanResponse
     */
    CompletableFuture<CreateJobPlanResponse> createJobPlan(CreateJobPlanRequest request);

    /**
     * @param request the request parameters of DeleteJobPlan  DeleteJobPlanRequest
     * @return DeleteJobPlanResponse
     */
    CompletableFuture<DeleteJobPlanResponse> deleteJobPlan(DeleteJobPlanRequest request);

    /**
     * @param request the request parameters of GetDistillationTemplate  GetDistillationTemplateRequest
     * @return GetDistillationTemplateResponse
     */
    CompletableFuture<GetDistillationTemplateResponse> getDistillationTemplate(GetDistillationTemplateRequest request);

    /**
     * @param request the request parameters of GetJobPlan  GetJobPlanRequest
     * @return GetJobPlanResponse
     */
    CompletableFuture<GetJobPlanResponse> getJobPlan(GetJobPlanRequest request);

    /**
     * @param request the request parameters of ListDistillationTemplates  ListDistillationTemplatesRequest
     * @return ListDistillationTemplatesResponse
     */
    CompletableFuture<ListDistillationTemplatesResponse> listDistillationTemplates(ListDistillationTemplatesRequest request);

    /**
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
     * @param request the request parameters of UpdateJobPlan  UpdateJobPlanRequest
     * @return UpdateJobPlanResponse
     */
    CompletableFuture<UpdateJobPlanResponse> updateJobPlan(UpdateJobPlanRequest request);

}
