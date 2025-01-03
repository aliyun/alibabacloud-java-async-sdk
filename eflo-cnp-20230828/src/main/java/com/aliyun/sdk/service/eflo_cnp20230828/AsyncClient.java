// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_cnp20230828;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.eflo_cnp20230828.models.*;
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
     * @param request the request parameters of ChangeResourceGroup  ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    /**
     * @param request the request parameters of CreateExperimentPlan  CreateExperimentPlanRequest
     * @return CreateExperimentPlanResponse
     */
    CompletableFuture<CreateExperimentPlanResponse> createExperimentPlan(CreateExperimentPlanRequest request);

    /**
     * @param request the request parameters of CreateExperimentPlanTemplate  CreateExperimentPlanTemplateRequest
     * @return CreateExperimentPlanTemplateResponse
     */
    CompletableFuture<CreateExperimentPlanTemplateResponse> createExperimentPlanTemplate(CreateExperimentPlanTemplateRequest request);

    /**
     * @param request the request parameters of CreateResource  CreateResourceRequest
     * @return CreateResourceResponse
     */
    CompletableFuture<CreateResourceResponse> createResource(CreateResourceRequest request);

    /**
     * @param request the request parameters of DeleteExperiment  DeleteExperimentRequest
     * @return DeleteExperimentResponse
     */
    CompletableFuture<DeleteExperimentResponse> deleteExperiment(DeleteExperimentRequest request);

    /**
     * @param request the request parameters of DeleteExperimentPlanTemplate  DeleteExperimentPlanTemplateRequest
     * @return DeleteExperimentPlanTemplateResponse
     */
    CompletableFuture<DeleteExperimentPlanTemplateResponse> deleteExperimentPlanTemplate(DeleteExperimentPlanTemplateRequest request);

    /**
     * @param request the request parameters of GetExperiment  GetExperimentRequest
     * @return GetExperimentResponse
     */
    CompletableFuture<GetExperimentResponse> getExperiment(GetExperimentRequest request);

    /**
     * @param request the request parameters of GetExperimentPlan  GetExperimentPlanRequest
     * @return GetExperimentPlanResponse
     */
    CompletableFuture<GetExperimentPlanResponse> getExperimentPlan(GetExperimentPlanRequest request);

    /**
     * @param request the request parameters of GetExperimentResultData  GetExperimentResultDataRequest
     * @return GetExperimentResultDataResponse
     */
    CompletableFuture<GetExperimentResultDataResponse> getExperimentResultData(GetExperimentResultDataRequest request);

    /**
     * @param request the request parameters of GetResource  GetResourceRequest
     * @return GetResourceResponse
     */
    CompletableFuture<GetResourceResponse> getResource(GetResourceRequest request);

    /**
     * @param request the request parameters of GetResourcePredictResult  GetResourcePredictResultRequest
     * @return GetResourcePredictResultResponse
     */
    CompletableFuture<GetResourcePredictResultResponse> getResourcePredictResult(GetResourcePredictResultRequest request);

    /**
     * @param request the request parameters of GetWorkload  GetWorkloadRequest
     * @return GetWorkloadResponse
     */
    CompletableFuture<GetWorkloadResponse> getWorkload(GetWorkloadRequest request);

    /**
     * @param request the request parameters of ListExperimentPlanTemplates  ListExperimentPlanTemplatesRequest
     * @return ListExperimentPlanTemplatesResponse
     */
    CompletableFuture<ListExperimentPlanTemplatesResponse> listExperimentPlanTemplates(ListExperimentPlanTemplatesRequest request);

    /**
     * @param request the request parameters of ListExperimentPlans  ListExperimentPlansRequest
     * @return ListExperimentPlansResponse
     */
    CompletableFuture<ListExperimentPlansResponse> listExperimentPlans(ListExperimentPlansRequest request);

    /**
     * @param request the request parameters of ListExperiments  ListExperimentsRequest
     * @return ListExperimentsResponse
     */
    CompletableFuture<ListExperimentsResponse> listExperiments(ListExperimentsRequest request);

    /**
     * @param request the request parameters of ListWorkloads  ListWorkloadsRequest
     * @return ListWorkloadsResponse
     */
    CompletableFuture<ListWorkloadsResponse> listWorkloads(ListWorkloadsRequest request);

    /**
     * @param request the request parameters of StopExperiment  StopExperimentRequest
     * @return StopExperimentResponse
     */
    CompletableFuture<StopExperimentResponse> stopExperiment(StopExperimentRequest request);

    /**
     * @param request the request parameters of ValidateResource  ValidateResourceRequest
     * @return ValidateResourceResponse
     */
    CompletableFuture<ValidateResourceResponse> validateResource(ValidateResourceRequest request);

}
