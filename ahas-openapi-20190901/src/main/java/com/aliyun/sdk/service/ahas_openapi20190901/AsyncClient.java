// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.ahas_openapi20190901.models.*;
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

    CompletableFuture<CheckExperimentRunnableResponse> checkExperimentRunnable(CheckExperimentRunnableRequest request);

    CompletableFuture<CreateDegradeRuleResponse> createDegradeRule(CreateDegradeRuleRequest request);

    CompletableFuture<CreateExperimentResponse> createExperiment(CreateExperimentRequest request);

    CompletableFuture<CreateFlowRuleResponse> createFlowRule(CreateFlowRuleRequest request);

    CompletableFuture<CreateHotParamItemsResponse> createHotParamItems(CreateHotParamItemsRequest request);

    CompletableFuture<CreateHotParamRuleResponse> createHotParamRule(CreateHotParamRuleRequest request);

    CompletableFuture<CreateIsolationRuleResponse> createIsolationRule(CreateIsolationRuleRequest request);

    CompletableFuture<CreateSystemRuleResponse> createSystemRule(CreateSystemRuleRequest request);

    CompletableFuture<DeleteDegradeRuleResponse> deleteDegradeRule(DeleteDegradeRuleRequest request);

    CompletableFuture<DeleteFlowRuleResponse> deleteFlowRule(DeleteFlowRuleRequest request);

    CompletableFuture<DeleteHotParamRuleResponse> deleteHotParamRule(DeleteHotParamRuleRequest request);

    CompletableFuture<DeleteIsolationRuleResponse> deleteIsolationRule(DeleteIsolationRuleRequest request);

    CompletableFuture<DeleteSystemRuleResponse> deleteSystemRule(DeleteSystemRuleRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<DisableDegradeRuleResponse> disableDegradeRule(DisableDegradeRuleRequest request);

    CompletableFuture<DisableFlowRuleResponse> disableFlowRule(DisableFlowRuleRequest request);

    CompletableFuture<DisableHotParamRuleResponse> disableHotParamRule(DisableHotParamRuleRequest request);

    CompletableFuture<DisableIsolationRuleResponse> disableIsolationRule(DisableIsolationRuleRequest request);

    CompletableFuture<DisableSystemRuleResponse> disableSystemRule(DisableSystemRuleRequest request);

    CompletableFuture<EnableDegradeRuleResponse> enableDegradeRule(EnableDegradeRuleRequest request);

    CompletableFuture<EnableFlowRuleResponse> enableFlowRule(EnableFlowRuleRequest request);

    CompletableFuture<EnableHotParamRuleResponse> enableHotParamRule(EnableHotParamRuleRequest request);

    CompletableFuture<EnableIsolationRuleResponse> enableIsolationRule(EnableIsolationRuleRequest request);

    CompletableFuture<EnableSystemRuleResponse> enableSystemRule(EnableSystemRuleRequest request);

    CompletableFuture<ExecuteExperimentResponse> executeExperiment(ExecuteExperimentRequest request);

    CompletableFuture<FinishExperimentTaskResponse> finishExperimentTask(FinishExperimentTaskRequest request);

    CompletableFuture<GetActivityTaskResponse> getActivityTask(GetActivityTaskRequest request);

    CompletableFuture<GetExperimentMetaResponse> getExperimentMeta(GetExperimentMetaRequest request);

    CompletableFuture<GetExperimentTaskResponse> getExperimentTask(GetExperimentTaskRequest request);

    CompletableFuture<GetLicenseKeyResponse> getLicenseKey(GetLicenseKeyRequest request);

    CompletableFuture<GetMetricsOfAppResponse> getMetricsOfApp(GetMetricsOfAppRequest request);

    CompletableFuture<GetMetricsOfResourceResponse> getMetricsOfResource(GetMetricsOfResourceRequest request);

    CompletableFuture<GetSentinelAppSumMetricResponse> getSentinelAppSumMetric(GetSentinelAppSumMetricRequest request);

    CompletableFuture<GetUserApplicationGroupsResponse> getUserApplicationGroups(GetUserApplicationGroupsRequest request);

    CompletableFuture<GetUserApplicationsResponse> getUserApplications(GetUserApplicationsRequest request);

    CompletableFuture<GetUserWorkspaceResponse> getUserWorkspace(GetUserWorkspaceRequest request);

    CompletableFuture<ListActiveAppsResponse> listActiveApps(ListActiveAppsRequest request);

    CompletableFuture<ListDegradeRulesOfAppResponse> listDegradeRulesOfApp(ListDegradeRulesOfAppRequest request);

    CompletableFuture<ListDegradeRulesOfResourceResponse> listDegradeRulesOfResource(ListDegradeRulesOfResourceRequest request);

    CompletableFuture<ListExperimentMetasResponse> listExperimentMetas(ListExperimentMetasRequest request);

    CompletableFuture<ListFlowRulesOfAppResponse> listFlowRulesOfApp(ListFlowRulesOfAppRequest request);

    CompletableFuture<ListFlowRulesOfResourceResponse> listFlowRulesOfResource(ListFlowRulesOfResourceRequest request);

    CompletableFuture<ListHotParamRulesOfAppResponse> listHotParamRulesOfApp(ListHotParamRulesOfAppRequest request);

    CompletableFuture<ListHotParamRulesOfResourceResponse> listHotParamRulesOfResource(ListHotParamRulesOfResourceRequest request);

    CompletableFuture<ListIsolationRulesOfAppResponse> listIsolationRulesOfApp(ListIsolationRulesOfAppRequest request);

    CompletableFuture<ListIsolationRulesOfResourceResponse> listIsolationRulesOfResource(ListIsolationRulesOfResourceRequest request);

    CompletableFuture<ListSystemRulesResponse> listSystemRules(ListSystemRulesRequest request);

    CompletableFuture<ModifyDegradeRuleResponse> modifyDegradeRule(ModifyDegradeRuleRequest request);

    CompletableFuture<ModifyFlowRuleResponse> modifyFlowRule(ModifyFlowRuleRequest request);

    CompletableFuture<ModifyHotParamRuleResponse> modifyHotParamRule(ModifyHotParamRuleRequest request);

    CompletableFuture<ModifyIsolationRuleResponse> modifyIsolationRule(ModifyIsolationRuleRequest request);

    CompletableFuture<ModifySystemRuleResponse> modifySystemRule(ModifySystemRuleRequest request);

    CompletableFuture<OpenAhasServiceResponse> openAhasService(OpenAhasServiceRequest request);

    CompletableFuture<PageableQueryExperimentTaskByClusterIdResponse> pageableQueryExperimentTaskByClusterId(PageableQueryExperimentTaskByClusterIdRequest request);

    CompletableFuture<PageableQueryExperimentTaskByExperimentIdResponse> pageableQueryExperimentTaskByExperimentId(PageableQueryExperimentTaskByExperimentIdRequest request);

    CompletableFuture<PageableQueryUserExperimentResponse> pageableQueryUserExperiment(PageableQueryUserExperimentRequest request);

    CompletableFuture<PushExperimentTaskResponse> pushExperimentTask(PushExperimentTaskRequest request);

    CompletableFuture<UpdateExperimentResponse> updateExperiment(UpdateExperimentRequest request);

    CompletableFuture<UpdateExperimentBasicInfoResponse> updateExperimentBasicInfo(UpdateExperimentBasicInfoRequest request);

}
