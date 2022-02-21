// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.gemp20210413.models.*;
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

    CompletableFuture<AddProblemServiceGroupResponse> addProblemServiceGroup(AddProblemServiceGroupRequest request);

    CompletableFuture<CancelProblemResponse> cancelProblem(CancelProblemRequest request);

    CompletableFuture<CheckWebhookResponse> checkWebhook(CheckWebhookRequest request);

    CompletableFuture<ConfirmIntegrationConfigResponse> confirmIntegrationConfig(ConfirmIntegrationConfigRequest request);

    CompletableFuture<CreateEscalationPlanResponse> createEscalationPlan(CreateEscalationPlanRequest request);

    CompletableFuture<CreateIncidentResponse> createIncident(CreateIncidentRequest request);

    CompletableFuture<CreateIncidentSubtotalResponse> createIncidentSubtotal(CreateIncidentSubtotalRequest request);

    CompletableFuture<CreateIntegrationConfigResponse> createIntegrationConfig(CreateIntegrationConfigRequest request);

    CompletableFuture<CreateProblemResponse> createProblem(CreateProblemRequest request);

    CompletableFuture<CreateProblemEffectionServiceResponse> createProblemEffectionService(CreateProblemEffectionServiceRequest request);

    CompletableFuture<CreateProblemMeasureResponse> createProblemMeasure(CreateProblemMeasureRequest request);

    CompletableFuture<CreateProblemSubtotalResponse> createProblemSubtotal(CreateProblemSubtotalRequest request);

    CompletableFuture<CreateProblemTimelineResponse> createProblemTimeline(CreateProblemTimelineRequest request);

    CompletableFuture<CreateProblemTimelinesResponse> createProblemTimelines(CreateProblemTimelinesRequest request);

    CompletableFuture<CreateRichTextResponse> createRichText(CreateRichTextRequest request);

    CompletableFuture<CreateRouteRuleResponse> createRouteRule(CreateRouteRuleRequest request);

    CompletableFuture<CreateServiceResponse> createService(CreateServiceRequest request);

    CompletableFuture<CreateServiceGroupResponse> createServiceGroup(CreateServiceGroupRequest request);

    CompletableFuture<CreateServiceGroupSchedulingResponse> createServiceGroupScheduling(CreateServiceGroupSchedulingRequest request);

    CompletableFuture<CreateSubscriptionResponse> createSubscription(CreateSubscriptionRequest request);

    CompletableFuture<CreateTenantApplicationResponse> createTenantApplication(CreateTenantApplicationRequest request);

    CompletableFuture<CreateUserResponse> createUser(CreateUserRequest request);

    CompletableFuture<DeleteEscalationPlanResponse> deleteEscalationPlan(DeleteEscalationPlanRequest request);

    CompletableFuture<DeleteIncidentResponse> deleteIncident(DeleteIncidentRequest request);

    CompletableFuture<DeleteIntegrationConfigResponse> deleteIntegrationConfig(DeleteIntegrationConfigRequest request);

    CompletableFuture<DeleteProblemResponse> deleteProblem(DeleteProblemRequest request);

    CompletableFuture<DeleteProblemEffectionServiceResponse> deleteProblemEffectionService(DeleteProblemEffectionServiceRequest request);

    CompletableFuture<DeleteProblemMeasureResponse> deleteProblemMeasure(DeleteProblemMeasureRequest request);

    CompletableFuture<DeleteProblemTimelineResponse> deleteProblemTimeline(DeleteProblemTimelineRequest request);

    CompletableFuture<DeleteRouteRuleResponse> deleteRouteRule(DeleteRouteRuleRequest request);

    CompletableFuture<DeleteServiceResponse> deleteService(DeleteServiceRequest request);

    CompletableFuture<DeleteServiceGroupResponse> deleteServiceGroup(DeleteServiceGroupRequest request);

    CompletableFuture<DeleteServiceGroupUserResponse> deleteServiceGroupUser(DeleteServiceGroupUserRequest request);

    CompletableFuture<DeleteSubscriptionResponse> deleteSubscription(DeleteSubscriptionRequest request);

    CompletableFuture<DeleteUserResponse> deleteUser(DeleteUserRequest request);

    CompletableFuture<DeliverIncidentResponse> deliverIncident(DeliverIncidentRequest request);

    CompletableFuture<DisableEscalationPlanResponse> disableEscalationPlan(DisableEscalationPlanRequest request);

    CompletableFuture<DisableIntegrationConfigResponse> disableIntegrationConfig(DisableIntegrationConfigRequest request);

    CompletableFuture<DisableRouteRuleResponse> disableRouteRule(DisableRouteRuleRequest request);

    CompletableFuture<DisableServiceGroupWebhookResponse> disableServiceGroupWebhook(DisableServiceGroupWebhookRequest request);

    CompletableFuture<DisableSubscriptionResponse> disableSubscription(DisableSubscriptionRequest request);

    CompletableFuture<EnableEscalationPlanResponse> enableEscalationPlan(EnableEscalationPlanRequest request);

    CompletableFuture<EnableIntegrationConfigResponse> enableIntegrationConfig(EnableIntegrationConfigRequest request);

    CompletableFuture<EnableRouteRuleResponse> enableRouteRule(EnableRouteRuleRequest request);

    CompletableFuture<EnableServiceGroupWebhookResponse> enableServiceGroupWebhook(EnableServiceGroupWebhookRequest request);

    CompletableFuture<EnableSubscriptionResponse> enableSubscription(EnableSubscriptionRequest request);

    CompletableFuture<FinishIncidentResponse> finishIncident(FinishIncidentRequest request);

    CompletableFuture<FinishProblemResponse> finishProblem(FinishProblemRequest request);

    CompletableFuture<GeneratePictureLinkResponse> generatePictureLink(GeneratePictureLinkRequest request);

    CompletableFuture<GeneratePictureUploadSignResponse> generatePictureUploadSign(GeneratePictureUploadSignRequest request);

    CompletableFuture<GenerateProblemPictureLinkResponse> generateProblemPictureLink(GenerateProblemPictureLinkRequest request);

    CompletableFuture<GenerateProblemPictureUploadSignResponse> generateProblemPictureUploadSign(GenerateProblemPictureUploadSignRequest request);

    CompletableFuture<GetEscalationPlanResponse> getEscalationPlan(GetEscalationPlanRequest request);

    CompletableFuture<GetEventResponse> getEvent(GetEventRequest request);

    CompletableFuture<GetHomePageGuidanceResponse> getHomePageGuidance(GetHomePageGuidanceRequest request);

    CompletableFuture<GetIncidentResponse> getIncident(GetIncidentRequest request);

    CompletableFuture<GetIncidentStatisticsResponse> getIncidentStatistics(GetIncidentStatisticsRequest request);

    CompletableFuture<GetIncidentSubtotalCountResponse> getIncidentSubtotalCount(GetIncidentSubtotalCountRequest request);

    CompletableFuture<GetIntegrationConfigResponse> getIntegrationConfig(GetIntegrationConfigRequest request);

    CompletableFuture<GetProblemResponse> getProblem(GetProblemRequest request);

    CompletableFuture<GetProblemEffectionServiceResponse> getProblemEffectionService(GetProblemEffectionServiceRequest request);

    CompletableFuture<GetProblemImprovementResponse> getProblemImprovement(GetProblemImprovementRequest request);

    CompletableFuture<GetProblemPreviewResponse> getProblemPreview(GetProblemPreviewRequest request);

    CompletableFuture<GetResourceStatisticsResponse> getResourceStatistics(GetResourceStatisticsRequest request);

    CompletableFuture<GetRichTextResponse> getRichText(GetRichTextRequest request);

    CompletableFuture<GetRouteRuleResponse> getRouteRule(GetRouteRuleRequest request);

    CompletableFuture<GetServiceResponse> getService(GetServiceRequest request);

    CompletableFuture<GetServiceGroupResponse> getServiceGroup(GetServiceGroupRequest request);

    CompletableFuture<GetServiceGroupPersonSchedulingResponse> getServiceGroupPersonScheduling(GetServiceGroupPersonSchedulingRequest request);

    CompletableFuture<GetServiceGroupSchedulingResponse> getServiceGroupScheduling(GetServiceGroupSchedulingRequest request);

    CompletableFuture<GetServiceGroupSchedulingPreviewResponse> getServiceGroupSchedulingPreview(GetServiceGroupSchedulingPreviewRequest request);

    CompletableFuture<GetServiceGroupSpecialPersonSchedulingResponse> getServiceGroupSpecialPersonScheduling(GetServiceGroupSpecialPersonSchedulingRequest request);

    CompletableFuture<GetSimilarIncidentStatisticsResponse> getSimilarIncidentStatistics(GetSimilarIncidentStatisticsRequest request);

    CompletableFuture<GetSubscriptionResponse> getSubscription(GetSubscriptionRequest request);

    CompletableFuture<GetTenantApplicationResponse> getTenantApplication(GetTenantApplicationRequest request);

    CompletableFuture<GetUserResponse> getUser(GetUserRequest request);

    CompletableFuture<GetUserGuideStatusResponse> getUserGuideStatus(GetUserGuideStatusRequest request);

    CompletableFuture<ListAlertsResponse> listAlerts(ListAlertsRequest request);

    CompletableFuture<ListChartDataForServiceGroupResponse> listChartDataForServiceGroup(ListChartDataForServiceGroupRequest request);

    CompletableFuture<ListChartDataForUserResponse> listChartDataForUser(ListChartDataForUserRequest request);

    CompletableFuture<ListConfigsResponse> listConfigs(ListConfigsRequest request);

    CompletableFuture<ListDataReportForServiceGroupResponse> listDataReportForServiceGroup(ListDataReportForServiceGroupRequest request);

    CompletableFuture<ListDataReportForUserResponse> listDataReportForUser(ListDataReportForUserRequest request);

    CompletableFuture<ListDictionariesResponse> listDictionaries(ListDictionariesRequest request);

    CompletableFuture<ListEscalationPlanServicesResponse> listEscalationPlanServices(ListEscalationPlanServicesRequest request);

    CompletableFuture<ListEscalationPlansResponse> listEscalationPlans(ListEscalationPlansRequest request);

    CompletableFuture<ListIncidentDetailEscalationPlansResponse> listIncidentDetailEscalationPlans(ListIncidentDetailEscalationPlansRequest request);

    CompletableFuture<ListIncidentDetailTimelinesResponse> listIncidentDetailTimelines(ListIncidentDetailTimelinesRequest request);

    CompletableFuture<ListIncidentSubtotalsResponse> listIncidentSubtotals(ListIncidentSubtotalsRequest request);

    CompletableFuture<ListIncidentTimelinesResponse> listIncidentTimelines(ListIncidentTimelinesRequest request);

    CompletableFuture<ListIncidentsResponse> listIncidents(ListIncidentsRequest request);

    CompletableFuture<ListIntegrationConfigTimelinesResponse> listIntegrationConfigTimelines(ListIntegrationConfigTimelinesRequest request);

    CompletableFuture<ListIntegrationConfigsResponse> listIntegrationConfigs(ListIntegrationConfigsRequest request);

    CompletableFuture<ListMonitorSourcesResponse> listMonitorSources(ListMonitorSourcesRequest request);

    CompletableFuture<ListProblemDetailOperationsResponse> listProblemDetailOperations(ListProblemDetailOperationsRequest request);

    CompletableFuture<ListProblemOperationsResponse> listProblemOperations(ListProblemOperationsRequest request);

    CompletableFuture<ListProblemSubtotalsResponse> listProblemSubtotals(ListProblemSubtotalsRequest request);

    CompletableFuture<ListProblemTimeLinesResponse> listProblemTimeLines(ListProblemTimeLinesRequest request);

    CompletableFuture<ListProblemsResponse> listProblems(ListProblemsRequest request);

    CompletableFuture<ListRouteRulesResponse> listRouteRules(ListRouteRulesRequest request);

    CompletableFuture<ListServiceGroupMonitorSourceTemplatesResponse> listServiceGroupMonitorSourceTemplates(ListServiceGroupMonitorSourceTemplatesRequest request);

    CompletableFuture<ListServiceGroupsResponse> listServiceGroups(ListServiceGroupsRequest request);

    CompletableFuture<ListServicesResponse> listServices(ListServicesRequest request);

    CompletableFuture<ListSourceEventsResponse> listSourceEvents(ListSourceEventsRequest request);

    CompletableFuture<ListSourceEventsForMonitorSourceResponse> listSourceEventsForMonitorSource(ListSourceEventsForMonitorSourceRequest request);

    CompletableFuture<ListSubscriptionServiceGroupsResponse> listSubscriptionServiceGroups(ListSubscriptionServiceGroupsRequest request);

    CompletableFuture<ListSubscriptionsResponse> listSubscriptions(ListSubscriptionsRequest request);

    CompletableFuture<ListTrendForSourceEventResponse> listTrendForSourceEvent(ListTrendForSourceEventRequest request);

    CompletableFuture<ListUserSerivceGroupsResponse> listUserSerivceGroups(ListUserSerivceGroupsRequest request);

    CompletableFuture<ListUsersResponse> listUsers(ListUsersRequest request);

    CompletableFuture<RecoverProblemResponse> recoverProblem(RecoverProblemRequest request);

    CompletableFuture<RefreshIntegrationConfigKeyResponse> refreshIntegrationConfigKey(RefreshIntegrationConfigKeyRequest request);

    CompletableFuture<RemoveProblemServiceGroupResponse> removeProblemServiceGroup(RemoveProblemServiceGroupRequest request);

    CompletableFuture<ReplayProblemResponse> replayProblem(ReplayProblemRequest request);

    CompletableFuture<RespondIncidentResponse> respondIncident(RespondIncidentRequest request);

    CompletableFuture<RevokeProblemRecoveryResponse> revokeProblemRecovery(RevokeProblemRecoveryRequest request);

    CompletableFuture<UpdateEscalationPlanResponse> updateEscalationPlan(UpdateEscalationPlanRequest request);

    CompletableFuture<UpdateIncidentResponse> updateIncident(UpdateIncidentRequest request);

    CompletableFuture<UpdateIntegrationConfigResponse> updateIntegrationConfig(UpdateIntegrationConfigRequest request);

    CompletableFuture<UpdateProblemResponse> updateProblem(UpdateProblemRequest request);

    CompletableFuture<UpdateProblemEffectionServiceResponse> updateProblemEffectionService(UpdateProblemEffectionServiceRequest request);

    CompletableFuture<UpdateProblemImprovementResponse> updateProblemImprovement(UpdateProblemImprovementRequest request);

    CompletableFuture<UpdateProblemMeasureResponse> updateProblemMeasure(UpdateProblemMeasureRequest request);

    CompletableFuture<UpdateProblemNoticeResponse> updateProblemNotice(UpdateProblemNoticeRequest request);

    CompletableFuture<UpdateProblemTimelineResponse> updateProblemTimeline(UpdateProblemTimelineRequest request);

    CompletableFuture<UpdateRichTextResponse> updateRichText(UpdateRichTextRequest request);

    CompletableFuture<UpdateRouteRuleResponse> updateRouteRule(UpdateRouteRuleRequest request);

    CompletableFuture<UpdateServiceResponse> updateService(UpdateServiceRequest request);

    CompletableFuture<UpdateServiceGroupResponse> updateServiceGroup(UpdateServiceGroupRequest request);

    CompletableFuture<UpdateServiceGroupSchedulingResponse> updateServiceGroupScheduling(UpdateServiceGroupSchedulingRequest request);

    CompletableFuture<UpdateServiceGroupSpecialDaySchedulingResponse> updateServiceGroupSpecialDayScheduling(UpdateServiceGroupSpecialDaySchedulingRequest request);

    CompletableFuture<UpdateSubscriptionResponse> updateSubscription(UpdateSubscriptionRequest request);

    CompletableFuture<UpdateUserResponse> updateUser(UpdateUserRequest request);

    CompletableFuture<UpdateUserGuideStatusResponse> updateUserGuideStatus(UpdateUserGuideStatusRequest request);

    CompletableFuture<VerifyRouteRuleResponse> verifyRouteRule(VerifyRouteRuleRequest request);

}
