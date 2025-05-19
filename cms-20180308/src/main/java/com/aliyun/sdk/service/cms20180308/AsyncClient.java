// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20180308;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.cms20180308.models.*;
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
     * @param request the request parameters of AccessKeyGet  AccessKeyGetRequest
     * @return AccessKeyGetResponse
     */
    CompletableFuture<AccessKeyGetResponse> accessKeyGet(AccessKeyGetRequest request);

    /**
     * @param request the request parameters of AddMyGroupInstances  AddMyGroupInstancesRequest
     * @return AddMyGroupInstancesResponse
     */
    CompletableFuture<AddMyGroupInstancesResponse> addMyGroupInstances(AddMyGroupInstancesRequest request);

    /**
     * @param request the request parameters of CreateAlarm  CreateAlarmRequest
     * @return CreateAlarmResponse
     */
    CompletableFuture<CreateAlarmResponse> createAlarm(CreateAlarmRequest request);

    /**
     * @param request the request parameters of CreateHybridDoubleWrite  CreateHybridDoubleWriteRequest
     * @return CreateHybridDoubleWriteResponse
     */
    CompletableFuture<CreateHybridDoubleWriteResponse> createHybridDoubleWrite(CreateHybridDoubleWriteRequest request);

    /**
     * @param request the request parameters of CreateMonitoringTemplate  CreateMonitoringTemplateRequest
     * @return CreateMonitoringTemplateResponse
     */
    CompletableFuture<CreateMonitoringTemplateResponse> createMonitoringTemplate(CreateMonitoringTemplateRequest request);

    /**
     * @param request the request parameters of CreateMyGroups  CreateMyGroupsRequest
     * @return CreateMyGroupsResponse
     */
    CompletableFuture<CreateMyGroupsResponse> createMyGroups(CreateMyGroupsRequest request);

    /**
     * @param request the request parameters of CreateTask  CreateTaskRequest
     * @return CreateTaskResponse
     */
    CompletableFuture<CreateTaskResponse> createTask(CreateTaskRequest request);

    /**
     * @param request the request parameters of DeleteAlarm  DeleteAlarmRequest
     * @return DeleteAlarmResponse
     */
    CompletableFuture<DeleteAlarmResponse> deleteAlarm(DeleteAlarmRequest request);

    /**
     * @param request the request parameters of DeleteCustomMetric  DeleteCustomMetricRequest
     * @return DeleteCustomMetricResponse
     */
    CompletableFuture<DeleteCustomMetricResponse> deleteCustomMetric(DeleteCustomMetricRequest request);

    /**
     * @param request the request parameters of DeleteHybridDoubleWrite  DeleteHybridDoubleWriteRequest
     * @return DeleteHybridDoubleWriteResponse
     */
    CompletableFuture<DeleteHybridDoubleWriteResponse> deleteHybridDoubleWrite(DeleteHybridDoubleWriteRequest request);

    /**
     * @param request the request parameters of DeleteMetricRuleTargets  DeleteMetricRuleTargetsRequest
     * @return DeleteMetricRuleTargetsResponse
     */
    CompletableFuture<DeleteMetricRuleTargetsResponse> deleteMetricRuleTargets(DeleteMetricRuleTargetsRequest request);

    /**
     * @param request the request parameters of DeleteMetricRules  DeleteMetricRulesRequest
     * @return DeleteMetricRulesResponse
     */
    CompletableFuture<DeleteMetricRulesResponse> deleteMetricRules(DeleteMetricRulesRequest request);

    /**
     * @param request the request parameters of DeleteMyGroupInstances  DeleteMyGroupInstancesRequest
     * @return DeleteMyGroupInstancesResponse
     */
    CompletableFuture<DeleteMyGroupInstancesResponse> deleteMyGroupInstances(DeleteMyGroupInstancesRequest request);

    /**
     * @param request the request parameters of DeleteMyGroups  DeleteMyGroupsRequest
     * @return DeleteMyGroupsResponse
     */
    CompletableFuture<DeleteMyGroupsResponse> deleteMyGroups(DeleteMyGroupsRequest request);

    /**
     * @param request the request parameters of DeleteTasks  DeleteTasksRequest
     * @return DeleteTasksResponse
     */
    CompletableFuture<DeleteTasksResponse> deleteTasks(DeleteTasksRequest request);

    /**
     * @param request the request parameters of DescribeAlarmHistory  DescribeAlarmHistoryRequest
     * @return DescribeAlarmHistoryResponse
     */
    CompletableFuture<DescribeAlarmHistoryResponse> describeAlarmHistory(DescribeAlarmHistoryRequest request);

    /**
     * @param request the request parameters of DescribeAlarms  DescribeAlarmsRequest
     * @return DescribeAlarmsResponse
     */
    CompletableFuture<DescribeAlarmsResponse> describeAlarms(DescribeAlarmsRequest request);

    /**
     * @param request the request parameters of DescribeAlarmsForResources  DescribeAlarmsForResourcesRequest
     * @return DescribeAlarmsForResourcesResponse
     */
    CompletableFuture<DescribeAlarmsForResourcesResponse> describeAlarmsForResources(DescribeAlarmsForResourcesRequest request);

    /**
     * @param request the request parameters of DescribeAlertHistoryList  DescribeAlertHistoryListRequest
     * @return DescribeAlertHistoryListResponse
     */
    CompletableFuture<DescribeAlertHistoryListResponse> describeAlertHistoryList(DescribeAlertHistoryListRequest request);

    /**
     * @param request the request parameters of DescribeContact  DescribeContactRequest
     * @return DescribeContactResponse
     */
    CompletableFuture<DescribeContactResponse> describeContact(DescribeContactRequest request);

    /**
     * @param request the request parameters of DescribeHybridDoubleWrite  DescribeHybridDoubleWriteRequest
     * @return DescribeHybridDoubleWriteResponse
     */
    CompletableFuture<DescribeHybridDoubleWriteResponse> describeHybridDoubleWrite(DescribeHybridDoubleWriteRequest request);

    /**
     * @param request the request parameters of DescribeISPAreaCity  DescribeISPAreaCityRequest
     * @return DescribeISPAreaCityResponse
     */
    CompletableFuture<DescribeISPAreaCityResponse> describeISPAreaCity(DescribeISPAreaCityRequest request);

    /**
     * @param request the request parameters of DescribeMetricRuleList  DescribeMetricRuleListRequest
     * @return DescribeMetricRuleListResponse
     */
    CompletableFuture<DescribeMetricRuleListResponse> describeMetricRuleList(DescribeMetricRuleListRequest request);

    /**
     * @param request the request parameters of DescribeTaskDetail  DescribeTaskDetailRequest
     * @return DescribeTaskDetailResponse
     */
    CompletableFuture<DescribeTaskDetailResponse> describeTaskDetail(DescribeTaskDetailRequest request);

    /**
     * @param request the request parameters of DescribeTasks  DescribeTasksRequest
     * @return DescribeTasksResponse
     */
    CompletableFuture<DescribeTasksResponse> describeTasks(DescribeTasksRequest request);

    /**
     * @param request the request parameters of DisableAlarm  DisableAlarmRequest
     * @return DisableAlarmResponse
     */
    CompletableFuture<DisableAlarmResponse> disableAlarm(DisableAlarmRequest request);

    /**
     * @param request the request parameters of EnableAlarm  EnableAlarmRequest
     * @return EnableAlarmResponse
     */
    CompletableFuture<EnableAlarmResponse> enableAlarm(EnableAlarmRequest request);

    /**
     * @param request the request parameters of GetContacts  GetContactsRequest
     * @return GetContactsResponse
     */
    CompletableFuture<GetContactsResponse> getContacts(GetContactsRequest request);

    /**
     * @param request the request parameters of GetLineSplitResult  GetLineSplitResultRequest
     * @return GetLineSplitResultResponse
     */
    CompletableFuture<GetLineSplitResultResponse> getLineSplitResult(GetLineSplitResultRequest request);

    /**
     * @param request the request parameters of GetLogColumnTranslateResult  GetLogColumnTranslateResultRequest
     * @return GetLogColumnTranslateResultResponse
     */
    CompletableFuture<GetLogColumnTranslateResultResponse> getLogColumnTranslateResult(GetLogColumnTranslateResultRequest request);

    /**
     * @param request the request parameters of GetMonitoringTemplate  GetMonitoringTemplateRequest
     * @return GetMonitoringTemplateResponse
     */
    CompletableFuture<GetMonitoringTemplateResponse> getMonitoringTemplate(GetMonitoringTemplateRequest request);

    /**
     * @param request the request parameters of GetMyGroups  GetMyGroupsRequest
     * @return GetMyGroupsResponse
     */
    CompletableFuture<GetMyGroupsResponse> getMyGroups(GetMyGroupsRequest request);

    /**
     * @param request the request parameters of ListAlarm  ListAlarmRequest
     * @return ListAlarmResponse
     */
    CompletableFuture<ListAlarmResponse> listAlarm(ListAlarmRequest request);

    /**
     * @param request the request parameters of ListAlarmHistory  ListAlarmHistoryRequest
     * @return ListAlarmHistoryResponse
     */
    CompletableFuture<ListAlarmHistoryResponse> listAlarmHistory(ListAlarmHistoryRequest request);

    /**
     * @param request the request parameters of ListContactGroup  ListContactGroupRequest
     * @return ListContactGroupResponse
     */
    CompletableFuture<ListContactGroupResponse> listContactGroup(ListContactGroupRequest request);

    /**
     * @param request the request parameters of ListEventRules  ListEventRulesRequest
     * @return ListEventRulesResponse
     */
    CompletableFuture<ListEventRulesResponse> listEventRules(ListEventRulesRequest request);

    /**
     * @param request the request parameters of ListMyGroupInstances  ListMyGroupInstancesRequest
     * @return ListMyGroupInstancesResponse
     */
    CompletableFuture<ListMyGroupInstancesResponse> listMyGroupInstances(ListMyGroupInstancesRequest request);

    /**
     * @param request the request parameters of ListMyGroups  ListMyGroupsRequest
     * @return ListMyGroupsResponse
     */
    CompletableFuture<ListMyGroupsResponse> listMyGroups(ListMyGroupsRequest request);

    /**
     * @param request the request parameters of ModifyTask  ModifyTaskRequest
     * @return ModifyTaskResponse
     */
    CompletableFuture<ModifyTaskResponse> modifyTask(ModifyTaskRequest request);

    /**
     * @param request the request parameters of NodeList  NodeListRequest
     * @return NodeListResponse
     */
    CompletableFuture<NodeListResponse> nodeList(NodeListRequest request);

    /**
     * @param request the request parameters of NodeProcessCreate  NodeProcessCreateRequest
     * @return NodeProcessCreateResponse
     */
    CompletableFuture<NodeProcessCreateResponse> nodeProcessCreate(NodeProcessCreateRequest request);

    /**
     * @param request the request parameters of NodeProcesses  NodeProcessesRequest
     * @return NodeProcessesResponse
     */
    CompletableFuture<NodeProcessesResponse> nodeProcesses(NodeProcessesRequest request);

    /**
     * @param request the request parameters of NodeStatusList  NodeStatusListRequest
     * @return NodeStatusListResponse
     */
    CompletableFuture<NodeStatusListResponse> nodeStatusList(NodeStatusListRequest request);

    /**
     * @param request the request parameters of NodeUninstall  NodeUninstallRequest
     * @return NodeUninstallResponse
     */
    CompletableFuture<NodeUninstallResponse> nodeUninstall(NodeUninstallRequest request);

    /**
     * @param request the request parameters of PutCustomMetric  PutCustomMetricRequest
     * @return PutCustomMetricResponse
     */
    CompletableFuture<PutCustomMetricResponse> putCustomMetric(PutCustomMetricRequest request);

    /**
     * @param request the request parameters of PutEvent  PutEventRequest
     * @return PutEventResponse
     */
    CompletableFuture<PutEventResponse> putEvent(PutEventRequest request);

    /**
     * @param request the request parameters of PutEventRule  PutEventRuleRequest
     * @return PutEventRuleResponse
     */
    CompletableFuture<PutEventRuleResponse> putEventRule(PutEventRuleRequest request);

    /**
     * @param request the request parameters of PutEventTargets  PutEventTargetsRequest
     * @return PutEventTargetsResponse
     */
    CompletableFuture<PutEventTargetsResponse> putEventTargets(PutEventTargetsRequest request);

    /**
     * @param request the request parameters of PutMetricRuleTargets  PutMetricRuleTargetsRequest
     * @return PutMetricRuleTargetsResponse
     */
    CompletableFuture<PutMetricRuleTargetsResponse> putMetricRuleTargets(PutMetricRuleTargetsRequest request);

    /**
     * @param request the request parameters of PutResourceMetricRule  PutResourceMetricRuleRequest
     * @return PutResourceMetricRuleResponse
     */
    CompletableFuture<PutResourceMetricRuleResponse> putResourceMetricRule(PutResourceMetricRuleRequest request);

    /**
     * @param request the request parameters of QueryCustomMetricList  QueryCustomMetricListRequest
     * @return QueryCustomMetricListResponse
     */
    CompletableFuture<QueryCustomMetricListResponse> queryCustomMetricList(QueryCustomMetricListRequest request);

    /**
     * @param request the request parameters of QueryMetricData  QueryMetricDataRequest
     * @return QueryMetricDataResponse
     */
    CompletableFuture<QueryMetricDataResponse> queryMetricData(QueryMetricDataRequest request);

    /**
     * @param request the request parameters of QueryMetricLast  QueryMetricLastRequest
     * @return QueryMetricLastResponse
     */
    CompletableFuture<QueryMetricLastResponse> queryMetricLast(QueryMetricLastRequest request);

    /**
     * @param request the request parameters of QueryMetricList  QueryMetricListRequest
     * @return QueryMetricListResponse
     */
    CompletableFuture<QueryMetricListResponse> queryMetricList(QueryMetricListRequest request);

    /**
     * @param request the request parameters of QueryMetricMeta  QueryMetricMetaRequest
     * @return QueryMetricMetaResponse
     */
    CompletableFuture<QueryMetricMetaResponse> queryMetricMeta(QueryMetricMetaRequest request);

    /**
     * @param request the request parameters of QueryMetricTop  QueryMetricTopRequest
     * @return QueryMetricTopResponse
     */
    CompletableFuture<QueryMetricTopResponse> queryMetricTop(QueryMetricTopRequest request);

    /**
     * @param request the request parameters of QueryProjectMeta  QueryProjectMetaRequest
     * @return QueryProjectMetaResponse
     */
    CompletableFuture<QueryProjectMetaResponse> queryProjectMeta(QueryProjectMetaRequest request);

    /**
     * @param request the request parameters of QueryStaticsAvailability  QueryStaticsAvailabilityRequest
     * @return QueryStaticsAvailabilityResponse
     */
    CompletableFuture<QueryStaticsAvailabilityResponse> queryStaticsAvailability(QueryStaticsAvailabilityRequest request);

    /**
     * @param request the request parameters of QueryStaticsResponseTime  QueryStaticsResponseTimeRequest
     * @return QueryStaticsResponseTimeResponse
     */
    CompletableFuture<QueryStaticsResponseTimeResponse> queryStaticsResponseTime(QueryStaticsResponseTimeRequest request);

    /**
     * @param request the request parameters of QuerySystemEventCount  QuerySystemEventCountRequest
     * @return QuerySystemEventCountResponse
     */
    CompletableFuture<QuerySystemEventCountResponse> querySystemEventCount(QuerySystemEventCountRequest request);

    /**
     * @param request the request parameters of QuerySystemEventDemo  QuerySystemEventDemoRequest
     * @return QuerySystemEventDemoResponse
     */
    CompletableFuture<QuerySystemEventDemoResponse> querySystemEventDemo(QuerySystemEventDemoRequest request);

    /**
     * @param request the request parameters of QueryTaskConfig  QueryTaskConfigRequest
     * @return QueryTaskConfigResponse
     */
    CompletableFuture<QueryTaskConfigResponse> queryTaskConfig(QueryTaskConfigRequest request);

    /**
     * @param request the request parameters of QueryTaskMonitorData  QueryTaskMonitorDataRequest
     * @return QueryTaskMonitorDataResponse
     */
    CompletableFuture<QueryTaskMonitorDataResponse> queryTaskMonitorData(QueryTaskMonitorDataRequest request);

    /**
     * @param request the request parameters of TaskConfigList  TaskConfigListRequest
     * @return TaskConfigListResponse
     */
    CompletableFuture<TaskConfigListResponse> taskConfigList(TaskConfigListRequest request);

    /**
     * @param request the request parameters of UpdateAlarm  UpdateAlarmRequest
     * @return UpdateAlarmResponse
     */
    CompletableFuture<UpdateAlarmResponse> updateAlarm(UpdateAlarmRequest request);

    /**
     * @param request the request parameters of UpdateMonitoringTemplate  UpdateMonitoringTemplateRequest
     * @return UpdateMonitoringTemplateResponse
     */
    CompletableFuture<UpdateMonitoringTemplateResponse> updateMonitoringTemplate(UpdateMonitoringTemplateRequest request);

}
