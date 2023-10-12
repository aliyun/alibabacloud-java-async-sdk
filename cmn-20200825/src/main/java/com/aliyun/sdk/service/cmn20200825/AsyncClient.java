// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.cmn20200825.models.*;
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

    CompletableFuture<ApplyIPResponse> applyIP(ApplyIPRequest request);

    CompletableFuture<AutoDutyResponse> autoDuty(AutoDutyRequest request);

    CompletableFuture<CloseEventResponse> closeEvent(CloseEventRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<CreateConfigurationSpecificationResponse> createConfigurationSpecification(CreateConfigurationSpecificationRequest request);

    CompletableFuture<CreateConfigurationVariateResponse> createConfigurationVariate(CreateConfigurationVariateRequest request);

    CompletableFuture<CreateDedicatedLineResponse> createDedicatedLine(CreateDedicatedLineRequest request);

    CompletableFuture<CreateDeviceResponse> createDevice(CreateDeviceRequest request);

    CompletableFuture<CreateDeviceFormResponse> createDeviceForm(CreateDeviceFormRequest request);

    CompletableFuture<CreateDevicePropertyResponse> createDeviceProperty(CreateDevicePropertyRequest request);

    CompletableFuture<CreateDevicesResponse> createDevices(CreateDevicesRequest request);

    CompletableFuture<CreateEventDefinitionResponse> createEventDefinition(CreateEventDefinitionRequest request);

    CompletableFuture<CreateLinkJobResponse> createLinkJob(CreateLinkJobRequest request);

    CompletableFuture<CreateMonitorItemResponse> createMonitorItem(CreateMonitorItemRequest request);

    CompletableFuture<CreateOsVersionResponse> createOsVersion(CreateOsVersionRequest request);

    CompletableFuture<CreatePhysicalSpaceResponse> createPhysicalSpace(CreatePhysicalSpaceRequest request);

    CompletableFuture<CreateRealtimeTaskResponse> createRealtimeTask(CreateRealtimeTaskRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<CreateResourceInformationResponse> createResourceInformation(CreateResourceInformationRequest request);

    CompletableFuture<CreateSetupProjectResponse> createSetupProject(CreateSetupProjectRequest request);

    CompletableFuture<CreateSpaceModelResponse> createSpaceModel(CreateSpaceModelRequest request);

    CompletableFuture<CreateTaskResponse> createTask(CreateTaskRequest request);

    CompletableFuture<CreateTimePeriodResponse> createTimePeriod(CreateTimePeriodRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DeleteConfigurationSpecificationResponse> deleteConfigurationSpecification(DeleteConfigurationSpecificationRequest request);

    CompletableFuture<DeleteConfigurationVariateResponse> deleteConfigurationVariate(DeleteConfigurationVariateRequest request);

    CompletableFuture<DeleteDedicatedLineResponse> deleteDedicatedLine(DeleteDedicatedLineRequest request);

    CompletableFuture<DeleteDeliveryArchVersionResponse> deleteDeliveryArchVersion(DeleteDeliveryArchVersionRequest request);

    CompletableFuture<DeleteDeliveryProjectResponse> deleteDeliveryProject(DeleteDeliveryProjectRequest request);

    CompletableFuture<DeleteDeviceResponse> deleteDevice(DeleteDeviceRequest request);

    CompletableFuture<DeleteDeviceFormResponse> deleteDeviceForm(DeleteDeviceFormRequest request);

    CompletableFuture<DeleteDevicePropertyResponse> deleteDeviceProperty(DeleteDevicePropertyRequest request);

    CompletableFuture<DeleteDeviceResourceResponse> deleteDeviceResource(DeleteDeviceResourceRequest request);

    CompletableFuture<DeleteDevicesResponse> deleteDevices(DeleteDevicesRequest request);

    CompletableFuture<DeleteEventDefinitionResponse> deleteEventDefinition(DeleteEventDefinitionRequest request);

    CompletableFuture<DeleteInspectionTaskResponse> deleteInspectionTask(DeleteInspectionTaskRequest request);

    CompletableFuture<DeleteOsVersionResponse> deleteOsVersion(DeleteOsVersionRequest request);

    CompletableFuture<DeletePhysicalSpaceResponse> deletePhysicalSpace(DeletePhysicalSpaceRequest request);

    CompletableFuture<DeleteResourceInformationResponse> deleteResourceInformation(DeleteResourceInformationRequest request);

    CompletableFuture<DeleteSetupProjectResponse> deleteSetupProject(DeleteSetupProjectRequest request);

    CompletableFuture<DeleteSpaceModelResponse> deleteSpaceModel(DeleteSpaceModelRequest request);

    CompletableFuture<DisableNotificationResponse> disableNotification(DisableNotificationRequest request);

    CompletableFuture<DownloadDeviceResourceResponse> downloadDeviceResource(DownloadDeviceResourceRequest request);

    CompletableFuture<EnableNotificationResponse> enableNotification(EnableNotificationRequest request);

    CompletableFuture<GetAlarmStatusResponse> getAlarmStatus(GetAlarmStatusRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<GetConfigurationSpecificationResponse> getConfigurationSpecification(GetConfigurationSpecificationRequest request);

    CompletableFuture<GetConfigurationVariateResponse> getConfigurationVariate(GetConfigurationVariateRequest request);

    CompletableFuture<GetDedicatedLineResponse> getDedicatedLine(GetDedicatedLineRequest request);

    CompletableFuture<GetDeviceResponse> getDevice(GetDeviceRequest request);

    CompletableFuture<GetDeviceConfigResponse> getDeviceConfig(GetDeviceConfigRequest request);

    CompletableFuture<GetDeviceConfigDateResponse> getDeviceConfigDate(GetDeviceConfigDateRequest request);

    CompletableFuture<GetDeviceConfigDiffResponse> getDeviceConfigDiff(GetDeviceConfigDiffRequest request);

    CompletableFuture<GetDeviceFormResponse> getDeviceForm(GetDeviceFormRequest request);

    CompletableFuture<GetDeviceOpLogResponse> getDeviceOpLog(GetDeviceOpLogRequest request);

    CompletableFuture<GetDevicePropertyResponse> getDeviceProperty(GetDevicePropertyRequest request);

    CompletableFuture<GetDeviceResourceResponse> getDeviceResource(GetDeviceResourceRequest request);

    CompletableFuture<GetInspectionTaskResponse> getInspectionTask(GetInspectionTaskRequest request);

    CompletableFuture<GetMonitorItemResponse> getMonitorItem(GetMonitorItemRequest request);

    CompletableFuture<GetOsDownloadPathResponse> getOsDownloadPath(GetOsDownloadPathRequest request);

    CompletableFuture<GetOsVersionResponse> getOsVersion(GetOsVersionRequest request);

    CompletableFuture<GetOssPolicyResponse> getOssPolicy(GetOssPolicyRequest request);

    CompletableFuture<GetPhysicalSpaceResponse> getPhysicalSpace(GetPhysicalSpaceRequest request);

    CompletableFuture<GetPhysicalSpaceTopoResponse> getPhysicalSpaceTopo(GetPhysicalSpaceTopoRequest request);

    CompletableFuture<GetRealtimeTaskResponse> getRealtimeTask(GetRealtimeTaskRequest request);

    CompletableFuture<GetScheduleWorkerResponse> getScheduleWorker(GetScheduleWorkerRequest request);

    CompletableFuture<GetSetupProjectResponse> getSetupProject(GetSetupProjectRequest request);

    CompletableFuture<GetSpaceModelResponse> getSpaceModel(GetSpaceModelRequest request);

    CompletableFuture<GetSpaceModelInstanceResponse> getSpaceModelInstance(GetSpaceModelInstanceRequest request);

    CompletableFuture<GetSpaceModelSortResponse> getSpaceModelSort(GetSpaceModelSortRequest request);

    CompletableFuture<GetTaskResponse> getTask(GetTaskRequest request);

    CompletableFuture<ListAlarmStatusResponse> listAlarmStatus(ListAlarmStatusRequest request);

    CompletableFuture<ListAlarmStatusHistoriesResponse> listAlarmStatusHistories(ListAlarmStatusHistoriesRequest request);

    CompletableFuture<ListAlarmStatusStatisticsResponse> listAlarmStatusStatistics(ListAlarmStatusStatisticsRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<ListArchitectureAttributeResponse> listArchitectureAttribute(ListArchitectureAttributeRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<ListConfigurationSpecificationsResponse> listConfigurationSpecifications(ListConfigurationSpecificationsRequest request);

    CompletableFuture<ListConfigurationVariateResponse> listConfigurationVariate(ListConfigurationVariateRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<ListConnectionPoliciesResponse> listConnectionPolicies(ListConnectionPoliciesRequest request);

    CompletableFuture<ListDedicatedLinesResponse> listDedicatedLines(ListDedicatedLinesRequest request);

    CompletableFuture<ListDeviceFormsResponse> listDeviceForms(ListDeviceFormsRequest request);

    CompletableFuture<ListDevicePropertiesResponse> listDeviceProperties(ListDevicePropertiesRequest request);

    CompletableFuture<ListDeviceResourcesResponse> listDeviceResources(ListDeviceResourcesRequest request);

    CompletableFuture<ListDeviceValuesResponse> listDeviceValues(ListDeviceValuesRequest request);

    CompletableFuture<ListDevicesResponse> listDevices(ListDevicesRequest request);

    CompletableFuture<ListEventDefinitionsResponse> listEventDefinitions(ListEventDefinitionsRequest request);

    CompletableFuture<ListEventsResponse> listEvents(ListEventsRequest request);

    CompletableFuture<ListInspectionDevicesResponse> listInspectionDevices(ListInspectionDevicesRequest request);

    CompletableFuture<ListInspectionTaskReportsResponse> listInspectionTaskReports(ListInspectionTaskReportsRequest request);

    CompletableFuture<ListInspectionTasksResponse> listInspectionTasks(ListInspectionTasksRequest request);

    CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request);

    CompletableFuture<ListIpBlocksResponse> listIpBlocks(ListIpBlocksRequest request);

    CompletableFuture<ListLinksResponse> listLinks(ListLinksRequest request);

    CompletableFuture<ListLogsResponse> listLogs(ListLogsRequest request);

    CompletableFuture<ListMonitorDataResponse> listMonitorData(ListMonitorDataRequest request);

    CompletableFuture<ListNotificationHistoriesResponse> listNotificationHistories(ListNotificationHistoriesRequest request);

    CompletableFuture<ListNotificationHistoriesStatisticsResponse> listNotificationHistoriesStatistics(ListNotificationHistoriesStatisticsRequest request);

    CompletableFuture<ListOsVersionsResponse> listOsVersions(ListOsVersionsRequest request);

    CompletableFuture<ListPhysicalSpacesResponse> listPhysicalSpaces(ListPhysicalSpacesRequest request);

    CompletableFuture<ListRegionsResponse> listRegions(ListRegionsRequest request);

    CompletableFuture<ListResourceInformationsResponse> listResourceInformations(ListResourceInformationsRequest request);

    CompletableFuture<ListResourceInstancesResponse> listResourceInstances(ListResourceInstancesRequest request);

    CompletableFuture<ListResourceTypesResponse> listResourceTypes(ListResourceTypesRequest request);

    CompletableFuture<ListSetupProjectsResponse> listSetupProjects(ListSetupProjectsRequest request);

    CompletableFuture<ListSpaceModelsResponse> listSpaceModels(ListSpaceModelsRequest request);

    CompletableFuture<ListTasksHistoriesResponse> listTasksHistories(ListTasksHistoriesRequest request);

    CompletableFuture<ListTreePhysicalSpacesResponse> listTreePhysicalSpaces(ListTreePhysicalSpacesRequest request);

    CompletableFuture<LockSpaceModelResponse> lockSpaceModel(LockSpaceModelRequest request);

    CompletableFuture<ReleaseIPResponse> releaseIP(ReleaseIPRequest request);

    CompletableFuture<RetryTasksResponse> retryTasks(RetryTasksRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<UpdateConfigurationSpecificationResponse> updateConfigurationSpecification(UpdateConfigurationSpecificationRequest request);

    CompletableFuture<UpdateConfigurationVariateResponse> updateConfigurationVariate(UpdateConfigurationVariateRequest request);

    CompletableFuture<UpdateDedicatedLineResponse> updateDedicatedLine(UpdateDedicatedLineRequest request);

    CompletableFuture<UpdateDeviceResponse> updateDevice(UpdateDeviceRequest request);

    CompletableFuture<UpdateDeviceFormResponse> updateDeviceForm(UpdateDeviceFormRequest request);

    CompletableFuture<UpdateDevicePropertyResponse> updateDeviceProperty(UpdateDevicePropertyRequest request);

    CompletableFuture<UpdateDeviceResourceResponse> updateDeviceResource(UpdateDeviceResourceRequest request);

    CompletableFuture<UpdateDevicesResponse> updateDevices(UpdateDevicesRequest request);

    CompletableFuture<UpdateEventDefinitionResponse> updateEventDefinition(UpdateEventDefinitionRequest request);

    CompletableFuture<UpdateInformationKeyActionResponse> updateInformationKeyAction(UpdateInformationKeyActionRequest request);

    CompletableFuture<UpdateInstanceResponse> updateInstance(UpdateInstanceRequest request);

    CompletableFuture<UpdateOsVersionResponse> updateOsVersion(UpdateOsVersionRequest request);

    CompletableFuture<UpdatePhysicalSpaceResponse> updatePhysicalSpace(UpdatePhysicalSpaceRequest request);

    CompletableFuture<UpdateProjectProgressResponse> updateProjectProgress(UpdateProjectProgressRequest request);

    CompletableFuture<UpdateResourceInformationResponse> updateResourceInformation(UpdateResourceInformationRequest request);

    CompletableFuture<UpdateResourceInstanceResponse> updateResourceInstance(UpdateResourceInstanceRequest request);

    CompletableFuture<UpdateSetupProjectResponse> updateSetupProject(UpdateSetupProjectRequest request);

    CompletableFuture<UpdateSpaceModelResponse> updateSpaceModel(UpdateSpaceModelRequest request);

    CompletableFuture<UpdateSpaceModelInstanceResponse> updateSpaceModelInstance(UpdateSpaceModelInstanceRequest request);

}
