// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.csas20230120.models.*;
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
     * @param request the request parameters of AddDeviceGroupMatchDevices  AddDeviceGroupMatchDevicesRequest
     * @return AddDeviceGroupMatchDevicesResponse
     */
    CompletableFuture<AddDeviceGroupMatchDevicesResponse> addDeviceGroupMatchDevices(AddDeviceGroupMatchDevicesRequest request);

    /**
     * @param request the request parameters of AddVirusScanAdditionalLists  AddVirusScanAdditionalListsRequest
     * @return AddVirusScanAdditionalListsResponse
     */
    CompletableFuture<AddVirusScanAdditionalListsResponse> addVirusScanAdditionalLists(AddVirusScanAdditionalListsRequest request);

    /**
     * @param request the request parameters of AttachApplication2Connector  AttachApplication2ConnectorRequest
     * @return AttachApplication2ConnectorResponse
     */
    CompletableFuture<AttachApplication2ConnectorResponse> attachApplication2Connector(AttachApplication2ConnectorRequest request);

    /**
     * @param request the request parameters of AttachPolicy2ApprovalProcess  AttachPolicy2ApprovalProcessRequest
     * @return AttachPolicy2ApprovalProcessResponse
     */
    CompletableFuture<AttachPolicy2ApprovalProcessResponse> attachPolicy2ApprovalProcess(AttachPolicy2ApprovalProcessRequest request);

    /**
     * @param request the request parameters of BatchCreateDomainItems  BatchCreateDomainItemsRequest
     * @return BatchCreateDomainItemsResponse
     */
    CompletableFuture<BatchCreateDomainItemsResponse> batchCreateDomainItems(BatchCreateDomainItemsRequest request);

    /**
     * @param request the request parameters of BatchDeleteDomainItems  BatchDeleteDomainItemsRequest
     * @return BatchDeleteDomainItemsResponse
     */
    CompletableFuture<BatchDeleteDomainItemsResponse> batchDeleteDomainItems(BatchDeleteDomainItemsRequest request);

    /**
     * @param request the request parameters of BatchDeletePrivateAccessApplication  BatchDeletePrivateAccessApplicationRequest
     * @return BatchDeletePrivateAccessApplicationResponse
     */
    CompletableFuture<BatchDeletePrivateAccessApplicationResponse> batchDeletePrivateAccessApplication(BatchDeletePrivateAccessApplicationRequest request);

    /**
     * @param request the request parameters of BatchDeletePrivateAccessPolicy  BatchDeletePrivateAccessPolicyRequest
     * @return BatchDeletePrivateAccessPolicyResponse
     */
    CompletableFuture<BatchDeletePrivateAccessPolicyResponse> batchDeletePrivateAccessPolicy(BatchDeletePrivateAccessPolicyRequest request);

    /**
     * @param request the request parameters of BindSaseUserTag  BindSaseUserTagRequest
     * @return BindSaseUserTagResponse
     */
    CompletableFuture<BindSaseUserTagResponse> bindSaseUserTag(BindSaseUserTagRequest request);

    /**
     * @param request the request parameters of CancelVirusScanTasks  CancelVirusScanTasksRequest
     * @return CancelVirusScanTasksResponse
     */
    CompletableFuture<CancelVirusScanTasksResponse> cancelVirusScanTasks(CancelVirusScanTasksRequest request);

    /**
     * @param request the request parameters of CancelVulScanTasks  CancelVulScanTasksRequest
     * @return CancelVulScanTasksResponse
     */
    CompletableFuture<CancelVulScanTasksResponse> cancelVulScanTasks(CancelVulScanTasksRequest request);

    /**
     * @param request the request parameters of CreateApprovalProcess  CreateApprovalProcessRequest
     * @return CreateApprovalProcessResponse
     */
    CompletableFuture<CreateApprovalProcessResponse> createApprovalProcess(CreateApprovalProcessRequest request);

    /**
     * @param request the request parameters of CreateClientUser  CreateClientUserRequest
     * @return CreateClientUserResponse
     */
    CompletableFuture<CreateClientUserResponse> createClientUser(CreateClientUserRequest request);

    /**
     * @param request the request parameters of CreateConnector  CreateConnectorRequest
     * @return CreateConnectorResponse
     */
    CompletableFuture<CreateConnectorResponse> createConnector(CreateConnectorRequest request);

    /**
     * @param request the request parameters of CreateDeviceGroup  CreateDeviceGroupRequest
     * @return CreateDeviceGroupResponse
     */
    CompletableFuture<CreateDeviceGroupResponse> createDeviceGroup(CreateDeviceGroupRequest request);

    /**
     * @param request the request parameters of CreateDomainMeta  CreateDomainMetaRequest
     * @return CreateDomainMetaResponse
     */
    CompletableFuture<CreateDomainMetaResponse> createDomainMeta(CreateDomainMetaRequest request);

    /**
     * @param request the request parameters of CreateDynamicRoute  CreateDynamicRouteRequest
     * @return CreateDynamicRouteResponse
     */
    CompletableFuture<CreateDynamicRouteResponse> createDynamicRoute(CreateDynamicRouteRequest request);

    /**
     * @param request the request parameters of CreateEnterpriseAcceleratePolicy  CreateEnterpriseAcceleratePolicyRequest
     * @return CreateEnterpriseAcceleratePolicyResponse
     */
    CompletableFuture<CreateEnterpriseAcceleratePolicyResponse> createEnterpriseAcceleratePolicy(CreateEnterpriseAcceleratePolicyRequest request);

    /**
     * @param request the request parameters of CreateEnterpriseAccelerateTarget  CreateEnterpriseAccelerateTargetRequest
     * @return CreateEnterpriseAccelerateTargetResponse
     */
    CompletableFuture<CreateEnterpriseAccelerateTargetResponse> createEnterpriseAccelerateTarget(CreateEnterpriseAccelerateTargetRequest request);

    /**
     * @param request the request parameters of CreateForwardStrategy  CreateForwardStrategyRequest
     * @return CreateForwardStrategyResponse
     */
    CompletableFuture<CreateForwardStrategyResponse> createForwardStrategy(CreateForwardStrategyRequest request);

    /**
     * @param request the request parameters of CreateIdpDepartment  CreateIdpDepartmentRequest
     * @return CreateIdpDepartmentResponse
     */
    CompletableFuture<CreateIdpDepartmentResponse> createIdpDepartment(CreateIdpDepartmentRequest request);

    /**
     * @param request the request parameters of CreatePADiagnosisTask  CreatePADiagnosisTaskRequest
     * @return CreatePADiagnosisTaskResponse
     */
    CompletableFuture<CreatePADiagnosisTaskResponse> createPADiagnosisTask(CreatePADiagnosisTaskRequest request);

    /**
     * <b>description</b> :
     * <p>By default, you can create a maximum of 500 office applications.</p>
     * 
     * @param request the request parameters of CreatePrivateAccessApplication  CreatePrivateAccessApplicationRequest
     * @return CreatePrivateAccessApplicationResponse
     */
    CompletableFuture<CreatePrivateAccessApplicationResponse> createPrivateAccessApplication(CreatePrivateAccessApplicationRequest request);

    /**
     * <b>description</b> :
     * <p>By default, up to 500 private access policies can be created.</p>
     * 
     * @param request the request parameters of CreatePrivateAccessPolicy  CreatePrivateAccessPolicyRequest
     * @return CreatePrivateAccessPolicyResponse
     */
    CompletableFuture<CreatePrivateAccessPolicyResponse> createPrivateAccessPolicy(CreatePrivateAccessPolicyRequest request);

    /**
     * @param request the request parameters of CreatePrivateAccessTag  CreatePrivateAccessTagRequest
     * @return CreatePrivateAccessTagResponse
     */
    CompletableFuture<CreatePrivateAccessTagResponse> createPrivateAccessTag(CreatePrivateAccessTagRequest request);

    /**
     * @param request the request parameters of CreateProhibitedPolicy  CreateProhibitedPolicyRequest
     * @return CreateProhibitedPolicyResponse
     */
    CompletableFuture<CreateProhibitedPolicyResponse> createProhibitedPolicy(CreateProhibitedPolicyRequest request);

    /**
     * @param request the request parameters of CreateProhibitedSoftware  CreateProhibitedSoftwareRequest
     * @return CreateProhibitedSoftwareResponse
     */
    CompletableFuture<CreateProhibitedSoftwareResponse> createProhibitedSoftware(CreateProhibitedSoftwareRequest request);

    /**
     * @param request the request parameters of CreateProhibitedTag  CreateProhibitedTagRequest
     * @return CreateProhibitedTagResponse
     */
    CompletableFuture<CreateProhibitedTagResponse> createProhibitedTag(CreateProhibitedTagRequest request);

    /**
     * @param request the request parameters of CreateRegistrationPolicy  CreateRegistrationPolicyRequest
     * @return CreateRegistrationPolicyResponse
     */
    CompletableFuture<CreateRegistrationPolicyResponse> createRegistrationPolicy(CreateRegistrationPolicyRequest request);

    /**
     * @param request the request parameters of CreateSaseUserTag  CreateSaseUserTagRequest
     * @return CreateSaseUserTagResponse
     */
    CompletableFuture<CreateSaseUserTagResponse> createSaseUserTag(CreateSaseUserTagRequest request);

    /**
     * @param request the request parameters of CreateSoftwarelibDistributeTask  CreateSoftwarelibDistributeTaskRequest
     * @return CreateSoftwarelibDistributeTaskResponse
     */
    CompletableFuture<CreateSoftwarelibDistributeTaskResponse> createSoftwarelibDistributeTask(CreateSoftwarelibDistributeTaskRequest request);

    /**
     * @param request the request parameters of CreateSoftwarelibVersion  CreateSoftwarelibVersionRequest
     * @return CreateSoftwarelibVersionResponse
     */
    CompletableFuture<CreateSoftwarelibVersionResponse> createSoftwarelibVersion(CreateSoftwarelibVersionRequest request);

    /**
     * @param request the request parameters of CreateUserGroup  CreateUserGroupRequest
     * @return CreateUserGroupResponse
     */
    CompletableFuture<CreateUserGroupResponse> createUserGroup(CreateUserGroupRequest request);

    /**
     * @param request the request parameters of CreateVirusScanScheduledStrategy  CreateVirusScanScheduledStrategyRequest
     * @return CreateVirusScanScheduledStrategyResponse
     */
    CompletableFuture<CreateVirusScanScheduledStrategyResponse> createVirusScanScheduledStrategy(CreateVirusScanScheduledStrategyRequest request);

    /**
     * @param request the request parameters of CreateVirusScanTask  CreateVirusScanTaskRequest
     * @return CreateVirusScanTaskResponse
     */
    CompletableFuture<CreateVirusScanTaskResponse> createVirusScanTask(CreateVirusScanTaskRequest request);

    /**
     * @param request the request parameters of CreateVulScanScheduledStrategy  CreateVulScanScheduledStrategyRequest
     * @return CreateVulScanScheduledStrategyResponse
     */
    CompletableFuture<CreateVulScanScheduledStrategyResponse> createVulScanScheduledStrategy(CreateVulScanScheduledStrategyRequest request);

    /**
     * @param request the request parameters of CreateVulScanTask  CreateVulScanTaskRequest
     * @return CreateVulScanTaskResponse
     */
    CompletableFuture<CreateVulScanTaskResponse> createVulScanTask(CreateVulScanTaskRequest request);

    /**
     * @param request the request parameters of CreateVulnerabilityFixTask  CreateVulnerabilityFixTaskRequest
     * @return CreateVulnerabilityFixTaskResponse
     */
    CompletableFuture<CreateVulnerabilityFixTaskResponse> createVulnerabilityFixTask(CreateVulnerabilityFixTaskRequest request);

    /**
     * @param request the request parameters of CreateWmBaseImage  CreateWmBaseImageRequest
     * @return CreateWmBaseImageResponse
     */
    CompletableFuture<CreateWmBaseImageResponse> createWmBaseImage(CreateWmBaseImageRequest request);

    /**
     * @param request the request parameters of CreateWmEmbedTask  CreateWmEmbedTaskRequest
     * @return CreateWmEmbedTaskResponse
     */
    CompletableFuture<CreateWmEmbedTaskResponse> createWmEmbedTask(CreateWmEmbedTaskRequest request);

    /**
     * @param request the request parameters of CreateWmExtractTask  CreateWmExtractTaskRequest
     * @return CreateWmExtractTaskResponse
     */
    CompletableFuture<CreateWmExtractTaskResponse> createWmExtractTask(CreateWmExtractTaskRequest request);

    /**
     * @param request the request parameters of CreateWmInfoMapping  CreateWmInfoMappingRequest
     * @return CreateWmInfoMappingResponse
     */
    CompletableFuture<CreateWmInfoMappingResponse> createWmInfoMapping(CreateWmInfoMappingRequest request);

    /**
     * @param request the request parameters of DeleteApprovalProcesses  DeleteApprovalProcessesRequest
     * @return DeleteApprovalProcessesResponse
     */
    CompletableFuture<DeleteApprovalProcessesResponse> deleteApprovalProcesses(DeleteApprovalProcessesRequest request);

    /**
     * @param request the request parameters of DeleteClientUser  DeleteClientUserRequest
     * @return DeleteClientUserResponse
     */
    CompletableFuture<DeleteClientUserResponse> deleteClientUser(DeleteClientUserRequest request);

    /**
     * @param request the request parameters of DeleteConnector  DeleteConnectorRequest
     * @return DeleteConnectorResponse
     */
    CompletableFuture<DeleteConnectorResponse> deleteConnector(DeleteConnectorRequest request);

    /**
     * @param request the request parameters of DeleteConnectorClient  DeleteConnectorClientRequest
     * @return DeleteConnectorClientResponse
     */
    CompletableFuture<DeleteConnectorClientResponse> deleteConnectorClient(DeleteConnectorClientRequest request);

    /**
     * @param request the request parameters of DeleteDeviceGroups  DeleteDeviceGroupsRequest
     * @return DeleteDeviceGroupsResponse
     */
    CompletableFuture<DeleteDeviceGroupsResponse> deleteDeviceGroups(DeleteDeviceGroupsRequest request);

    /**
     * @param request the request parameters of DeleteDevicesVulnerability  DeleteDevicesVulnerabilityRequest
     * @return DeleteDevicesVulnerabilityResponse
     */
    CompletableFuture<DeleteDevicesVulnerabilityResponse> deleteDevicesVulnerability(DeleteDevicesVulnerabilityRequest request);

    /**
     * @param request the request parameters of DeleteDomainMeta  DeleteDomainMetaRequest
     * @return DeleteDomainMetaResponse
     */
    CompletableFuture<DeleteDomainMetaResponse> deleteDomainMeta(DeleteDomainMetaRequest request);

    /**
     * @param request the request parameters of DeleteDynamicRoute  DeleteDynamicRouteRequest
     * @return DeleteDynamicRouteResponse
     */
    CompletableFuture<DeleteDynamicRouteResponse> deleteDynamicRoute(DeleteDynamicRouteRequest request);

    /**
     * @param request the request parameters of DeleteEnterpriseAcceleratePolicy  DeleteEnterpriseAcceleratePolicyRequest
     * @return DeleteEnterpriseAcceleratePolicyResponse
     */
    CompletableFuture<DeleteEnterpriseAcceleratePolicyResponse> deleteEnterpriseAcceleratePolicy(DeleteEnterpriseAcceleratePolicyRequest request);

    /**
     * @param request the request parameters of DeleteEnterpriseAccelerateTarget  DeleteEnterpriseAccelerateTargetRequest
     * @return DeleteEnterpriseAccelerateTargetResponse
     */
    CompletableFuture<DeleteEnterpriseAccelerateTargetResponse> deleteEnterpriseAccelerateTarget(DeleteEnterpriseAccelerateTargetRequest request);

    /**
     * @param request the request parameters of DeleteForwardStrategy  DeleteForwardStrategyRequest
     * @return DeleteForwardStrategyResponse
     */
    CompletableFuture<DeleteForwardStrategyResponse> deleteForwardStrategy(DeleteForwardStrategyRequest request);

    /**
     * @param request the request parameters of DeleteIdpDepartment  DeleteIdpDepartmentRequest
     * @return DeleteIdpDepartmentResponse
     */
    CompletableFuture<DeleteIdpDepartmentResponse> deleteIdpDepartment(DeleteIdpDepartmentRequest request);

    /**
     * @param request the request parameters of DeleteOtpConfig  DeleteOtpConfigRequest
     * @return DeleteOtpConfigResponse
     */
    CompletableFuture<DeleteOtpConfigResponse> deleteOtpConfig(DeleteOtpConfigRequest request);

    /**
     * @param request the request parameters of DeletePrivateAccessApplication  DeletePrivateAccessApplicationRequest
     * @return DeletePrivateAccessApplicationResponse
     */
    CompletableFuture<DeletePrivateAccessApplicationResponse> deletePrivateAccessApplication(DeletePrivateAccessApplicationRequest request);

    /**
     * @param request the request parameters of DeletePrivateAccessPolicy  DeletePrivateAccessPolicyRequest
     * @return DeletePrivateAccessPolicyResponse
     */
    CompletableFuture<DeletePrivateAccessPolicyResponse> deletePrivateAccessPolicy(DeletePrivateAccessPolicyRequest request);

    /**
     * @param request the request parameters of DeletePrivateAccessTag  DeletePrivateAccessTagRequest
     * @return DeletePrivateAccessTagResponse
     */
    CompletableFuture<DeletePrivateAccessTagResponse> deletePrivateAccessTag(DeletePrivateAccessTagRequest request);

    /**
     * @param request the request parameters of DeleteProhibitedPolicies  DeleteProhibitedPoliciesRequest
     * @return DeleteProhibitedPoliciesResponse
     */
    CompletableFuture<DeleteProhibitedPoliciesResponse> deleteProhibitedPolicies(DeleteProhibitedPoliciesRequest request);

    /**
     * @param request the request parameters of DeleteProhibitedSoftware  DeleteProhibitedSoftwareRequest
     * @return DeleteProhibitedSoftwareResponse
     */
    CompletableFuture<DeleteProhibitedSoftwareResponse> deleteProhibitedSoftware(DeleteProhibitedSoftwareRequest request);

    /**
     * @param request the request parameters of DeleteProhibitedTags  DeleteProhibitedTagsRequest
     * @return DeleteProhibitedTagsResponse
     */
    CompletableFuture<DeleteProhibitedTagsResponse> deleteProhibitedTags(DeleteProhibitedTagsRequest request);

    /**
     * @param request the request parameters of DeleteRegistrationPolicies  DeleteRegistrationPoliciesRequest
     * @return DeleteRegistrationPoliciesResponse
     */
    CompletableFuture<DeleteRegistrationPoliciesResponse> deleteRegistrationPolicies(DeleteRegistrationPoliciesRequest request);

    /**
     * @param request the request parameters of DeleteSaseUserTag  DeleteSaseUserTagRequest
     * @return DeleteSaseUserTagResponse
     */
    CompletableFuture<DeleteSaseUserTagResponse> deleteSaseUserTag(DeleteSaseUserTagRequest request);

    /**
     * @param request the request parameters of DeleteUserDevices  DeleteUserDevicesRequest
     * @return DeleteUserDevicesResponse
     */
    CompletableFuture<DeleteUserDevicesResponse> deleteUserDevices(DeleteUserDevicesRequest request);

    /**
     * @param request the request parameters of DeleteUserGroup  DeleteUserGroupRequest
     * @return DeleteUserGroupResponse
     */
    CompletableFuture<DeleteUserGroupResponse> deleteUserGroup(DeleteUserGroupRequest request);

    /**
     * @param request the request parameters of DeleteVirusFile  DeleteVirusFileRequest
     * @return DeleteVirusFileResponse
     */
    CompletableFuture<DeleteVirusFileResponse> deleteVirusFile(DeleteVirusFileRequest request);

    /**
     * @param request the request parameters of DeleteVirusScanScheduledStrategies  DeleteVirusScanScheduledStrategiesRequest
     * @return DeleteVirusScanScheduledStrategiesResponse
     */
    CompletableFuture<DeleteVirusScanScheduledStrategiesResponse> deleteVirusScanScheduledStrategies(DeleteVirusScanScheduledStrategiesRequest request);

    /**
     * @param request the request parameters of DeleteVulScanScheduledStrategy  DeleteVulScanScheduledStrategyRequest
     * @return DeleteVulScanScheduledStrategyResponse
     */
    CompletableFuture<DeleteVulScanScheduledStrategyResponse> deleteVulScanScheduledStrategy(DeleteVulScanScheduledStrategyRequest request);

    /**
     * @deprecated OpenAPI DetachApplication2Connector is deprecated, please use csas::2023-01-20::ModifyForwardStrategy instead.  * @param request  the request parameters of DetachApplication2Connector  DetachApplication2ConnectorRequest
     * @return DetachApplication2ConnectorResponse
     */
    @Deprecated
    CompletableFuture<DetachApplication2ConnectorResponse> detachApplication2Connector(DetachApplication2ConnectorRequest request);

    /**
     * @param request the request parameters of DetachPolicy2ApprovalProcess  DetachPolicy2ApprovalProcessRequest
     * @return DetachPolicy2ApprovalProcessResponse
     */
    CompletableFuture<DetachPolicy2ApprovalProcessResponse> detachPolicy2ApprovalProcess(DetachPolicy2ApprovalProcessRequest request);

    /**
     * @param request the request parameters of DisableEnterpriseAcceleratePolicy  DisableEnterpriseAcceleratePolicyRequest
     * @return DisableEnterpriseAcceleratePolicyResponse
     */
    CompletableFuture<DisableEnterpriseAcceleratePolicyResponse> disableEnterpriseAcceleratePolicy(DisableEnterpriseAcceleratePolicyRequest request);

    /**
     * @param request the request parameters of EnableEnterpriseAcceleratePolicy  EnableEnterpriseAcceleratePolicyRequest
     * @return EnableEnterpriseAcceleratePolicyResponse
     */
    CompletableFuture<EnableEnterpriseAcceleratePolicyResponse> enableEnterpriseAcceleratePolicy(EnableEnterpriseAcceleratePolicyRequest request);

    /**
     * @param request the request parameters of ExportUserDevices  ExportUserDevicesRequest
     * @return ExportUserDevicesResponse
     */
    CompletableFuture<ExportUserDevicesResponse> exportUserDevices(ExportUserDevicesRequest request);

    /**
     * @param request the request parameters of GetActiveIdpConfig  GetActiveIdpConfigRequest
     * @return GetActiveIdpConfigResponse
     */
    CompletableFuture<GetActiveIdpConfigResponse> getActiveIdpConfig(GetActiveIdpConfigRequest request);

    /**
     * @param request the request parameters of GetAntiVirusRealTimeDefenceStrategy  GetAntiVirusRealTimeDefenceStrategyRequest
     * @return GetAntiVirusRealTimeDefenceStrategyResponse
     */
    CompletableFuture<GetAntiVirusRealTimeDefenceStrategyResponse> getAntiVirusRealTimeDefenceStrategy(GetAntiVirusRealTimeDefenceStrategyRequest request);

    /**
     * @param request the request parameters of GetApproval  GetApprovalRequest
     * @return GetApprovalResponse
     */
    CompletableFuture<GetApprovalResponse> getApproval(GetApprovalRequest request);

    /**
     * @param request the request parameters of GetApprovalProcess  GetApprovalProcessRequest
     * @return GetApprovalProcessResponse
     */
    CompletableFuture<GetApprovalProcessResponse> getApprovalProcess(GetApprovalProcessRequest request);

    /**
     * @param request the request parameters of GetApprovalSchema  GetApprovalSchemaRequest
     * @return GetApprovalSchemaResponse
     */
    CompletableFuture<GetApprovalSchemaResponse> getApprovalSchema(GetApprovalSchemaRequest request);

    /**
     * @param request the request parameters of GetBootAndAntiUninstallPolicy  GetBootAndAntiUninstallPolicyRequest
     * @return GetBootAndAntiUninstallPolicyResponse
     */
    CompletableFuture<GetBootAndAntiUninstallPolicyResponse> getBootAndAntiUninstallPolicy(GetBootAndAntiUninstallPolicyRequest request);

    /**
     * @param request the request parameters of GetClientUser  GetClientUserRequest
     * @return GetClientUserResponse
     */
    CompletableFuture<GetClientUserResponse> getClientUser(GetClientUserRequest request);

    /**
     * @param request the request parameters of GetConnector  GetConnectorRequest
     * @return GetConnectorResponse
     */
    CompletableFuture<GetConnectorResponse> getConnector(GetConnectorRequest request);

    /**
     * @param request the request parameters of GetConnectorClient  GetConnectorClientRequest
     * @return GetConnectorClientResponse
     */
    CompletableFuture<GetConnectorClientResponse> getConnectorClient(GetConnectorClientRequest request);

    /**
     * @param request the request parameters of GetDeviceGroup  GetDeviceGroupRequest
     * @return GetDeviceGroupResponse
     */
    CompletableFuture<GetDeviceGroupResponse> getDeviceGroup(GetDeviceGroupRequest request);

    /**
     * @param request the request parameters of GetDeviceOnlineHeatmap  GetDeviceOnlineHeatmapRequest
     * @return GetDeviceOnlineHeatmapResponse
     */
    CompletableFuture<GetDeviceOnlineHeatmapResponse> getDeviceOnlineHeatmap(GetDeviceOnlineHeatmapRequest request);

    /**
     * @param request the request parameters of GetDynamicRoute  GetDynamicRouteRequest
     * @return GetDynamicRouteResponse
     */
    CompletableFuture<GetDynamicRouteResponse> getDynamicRoute(GetDynamicRouteRequest request);

    /**
     * @param request the request parameters of GetForwardStrategy  GetForwardStrategyRequest
     * @return GetForwardStrategyResponse
     */
    CompletableFuture<GetForwardStrategyResponse> getForwardStrategy(GetForwardStrategyRequest request);

    /**
     * @param request the request parameters of GetIdpConfig  GetIdpConfigRequest
     * @return GetIdpConfigResponse
     */
    CompletableFuture<GetIdpConfigResponse> getIdpConfig(GetIdpConfigRequest request);

    /**
     * @param request the request parameters of GetNacPortalSmsPhoneWhitelist  GetNacPortalSmsPhoneWhitelistRequest
     * @return GetNacPortalSmsPhoneWhitelistResponse
     */
    CompletableFuture<GetNacPortalSmsPhoneWhitelistResponse> getNacPortalSmsPhoneWhitelist(GetNacPortalSmsPhoneWhitelistRequest request);

    /**
     * @param request the request parameters of GetPADiagnosisTask  GetPADiagnosisTaskRequest
     * @return GetPADiagnosisTaskResponse
     */
    CompletableFuture<GetPADiagnosisTaskResponse> getPADiagnosisTask(GetPADiagnosisTaskRequest request);

    /**
     * @param request the request parameters of GetPrivateAccessApplication  GetPrivateAccessApplicationRequest
     * @return GetPrivateAccessApplicationResponse
     */
    CompletableFuture<GetPrivateAccessApplicationResponse> getPrivateAccessApplication(GetPrivateAccessApplicationRequest request);

    /**
     * @param request the request parameters of GetPrivateAccessPolicy  GetPrivateAccessPolicyRequest
     * @return GetPrivateAccessPolicyResponse
     */
    CompletableFuture<GetPrivateAccessPolicyResponse> getPrivateAccessPolicy(GetPrivateAccessPolicyRequest request);

    /**
     * @param request the request parameters of GetProhibitedPolicy  GetProhibitedPolicyRequest
     * @return GetProhibitedPolicyResponse
     */
    CompletableFuture<GetProhibitedPolicyResponse> getProhibitedPolicy(GetProhibitedPolicyRequest request);

    /**
     * @param request the request parameters of GetProhibitedSoftware  GetProhibitedSoftwareRequest
     * @return GetProhibitedSoftwareResponse
     */
    CompletableFuture<GetProhibitedSoftwareResponse> getProhibitedSoftware(GetProhibitedSoftwareRequest request);

    /**
     * @param request the request parameters of GetRegistrationPolicy  GetRegistrationPolicyRequest
     * @return GetRegistrationPolicyResponse
     */
    CompletableFuture<GetRegistrationPolicyResponse> getRegistrationPolicy(GetRegistrationPolicyRequest request);

    /**
     * @param request the request parameters of GetSaseUserTag  GetSaseUserTagRequest
     * @return GetSaseUserTagResponse
     */
    CompletableFuture<GetSaseUserTagResponse> getSaseUserTag(GetSaseUserTagRequest request);

    /**
     * @param request the request parameters of GetUserDevice  GetUserDeviceRequest
     * @return GetUserDeviceResponse
     */
    CompletableFuture<GetUserDeviceResponse> getUserDevice(GetUserDeviceRequest request);

    /**
     * @param request the request parameters of GetUserDeviceWorkloadTrend  GetUserDeviceWorkloadTrendRequest
     * @return GetUserDeviceWorkloadTrendResponse
     */
    CompletableFuture<GetUserDeviceWorkloadTrendResponse> getUserDeviceWorkloadTrend(GetUserDeviceWorkloadTrendRequest request);

    /**
     * @param request the request parameters of GetUserGroup  GetUserGroupRequest
     * @return GetUserGroupResponse
     */
    CompletableFuture<GetUserGroupResponse> getUserGroup(GetUserGroupRequest request);

    /**
     * @param request the request parameters of GetVirusScanGlobalConfig  GetVirusScanGlobalConfigRequest
     * @return GetVirusScanGlobalConfigResponse
     */
    CompletableFuture<GetVirusScanGlobalConfigResponse> getVirusScanGlobalConfig(GetVirusScanGlobalConfigRequest request);

    /**
     * @param request the request parameters of GetVirusScanScheduledStrategy  GetVirusScanScheduledStrategyRequest
     * @return GetVirusScanScheduledStrategyResponse
     */
    CompletableFuture<GetVirusScanScheduledStrategyResponse> getVirusScanScheduledStrategy(GetVirusScanScheduledStrategyRequest request);

    /**
     * @param request the request parameters of GetVulScanGlobalConfig  GetVulScanGlobalConfigRequest
     * @return GetVulScanGlobalConfigResponse
     */
    CompletableFuture<GetVulScanGlobalConfigResponse> getVulScanGlobalConfig(GetVulScanGlobalConfigRequest request);

    /**
     * @param request the request parameters of GetVulScanScheduledStrategy  GetVulScanScheduledStrategyRequest
     * @return GetVulScanScheduledStrategyResponse
     */
    CompletableFuture<GetVulScanScheduledStrategyResponse> getVulScanScheduledStrategy(GetVulScanScheduledStrategyRequest request);

    /**
     * @param request the request parameters of GetVulnerability  GetVulnerabilityRequest
     * @return GetVulnerabilityResponse
     */
    CompletableFuture<GetVulnerabilityResponse> getVulnerability(GetVulnerabilityRequest request);

    /**
     * @param request the request parameters of GetWmEmbedTask  GetWmEmbedTaskRequest
     * @return GetWmEmbedTaskResponse
     */
    CompletableFuture<GetWmEmbedTaskResponse> getWmEmbedTask(GetWmEmbedTaskRequest request);

    /**
     * @param request the request parameters of GetWmExtractTask  GetWmExtractTaskRequest
     * @return GetWmExtractTaskResponse
     */
    CompletableFuture<GetWmExtractTaskResponse> getWmExtractTask(GetWmExtractTaskRequest request);

    /**
     * @param request the request parameters of ImportEnterpriseAccelerateTargets  ImportEnterpriseAccelerateTargetsRequest
     * @return ImportEnterpriseAccelerateTargetsResponse
     */
    CompletableFuture<ImportEnterpriseAccelerateTargetsResponse> importEnterpriseAccelerateTargets(ImportEnterpriseAccelerateTargetsRequest request);

    /**
     * @param request the request parameters of ListApplicationsForPrivateAccessPolicy  ListApplicationsForPrivateAccessPolicyRequest
     * @return ListApplicationsForPrivateAccessPolicyResponse
     */
    CompletableFuture<ListApplicationsForPrivateAccessPolicyResponse> listApplicationsForPrivateAccessPolicy(ListApplicationsForPrivateAccessPolicyRequest request);

    /**
     * @param request the request parameters of ListApplicationsForPrivateAccessTag  ListApplicationsForPrivateAccessTagRequest
     * @return ListApplicationsForPrivateAccessTagResponse
     */
    CompletableFuture<ListApplicationsForPrivateAccessTagResponse> listApplicationsForPrivateAccessTag(ListApplicationsForPrivateAccessTagRequest request);

    /**
     * @param request the request parameters of ListApprovalProcesses  ListApprovalProcessesRequest
     * @return ListApprovalProcessesResponse
     */
    CompletableFuture<ListApprovalProcessesResponse> listApprovalProcesses(ListApprovalProcessesRequest request);

    /**
     * @param request the request parameters of ListApprovalProcessesForApprovalSchemas  ListApprovalProcessesForApprovalSchemasRequest
     * @return ListApprovalProcessesForApprovalSchemasResponse
     */
    CompletableFuture<ListApprovalProcessesForApprovalSchemasResponse> listApprovalProcessesForApprovalSchemas(ListApprovalProcessesForApprovalSchemasRequest request);

    /**
     * @param request the request parameters of ListApprovalSchemas  ListApprovalSchemasRequest
     * @return ListApprovalSchemasResponse
     */
    CompletableFuture<ListApprovalSchemasResponse> listApprovalSchemas(ListApprovalSchemasRequest request);

    /**
     * @param request the request parameters of ListApprovalSchemasForApprovalProcesses  ListApprovalSchemasForApprovalProcessesRequest
     * @return ListApprovalSchemasForApprovalProcessesResponse
     */
    CompletableFuture<ListApprovalSchemasForApprovalProcessesResponse> listApprovalSchemasForApprovalProcesses(ListApprovalSchemasForApprovalProcessesRequest request);

    /**
     * @param request the request parameters of ListApprovals  ListApprovalsRequest
     * @return ListApprovalsResponse
     */
    CompletableFuture<ListApprovalsResponse> listApprovals(ListApprovalsRequest request);

    /**
     * @param request the request parameters of ListClientUsers  ListClientUsersRequest
     * @return ListClientUsersResponse
     */
    CompletableFuture<ListClientUsersResponse> listClientUsers(ListClientUsersRequest request);

    /**
     * @param request the request parameters of ListConnectors  ListConnectorsRequest
     * @return ListConnectorsResponse
     */
    CompletableFuture<ListConnectorsResponse> listConnectors(ListConnectorsRequest request);

    /**
     * @param request the request parameters of ListDeviceGroups  ListDeviceGroupsRequest
     * @return ListDeviceGroupsResponse
     */
    CompletableFuture<ListDeviceGroupsResponse> listDeviceGroups(ListDeviceGroupsRequest request);

    /**
     * @param request the request parameters of ListDevicesForVulnerability  ListDevicesForVulnerabilityRequest
     * @return ListDevicesForVulnerabilityResponse
     */
    CompletableFuture<ListDevicesForVulnerabilityResponse> listDevicesForVulnerability(ListDevicesForVulnerabilityRequest request);

    /**
     * @param request the request parameters of ListDlpOutboundLogs  ListDlpOutboundLogsRequest
     * @return ListDlpOutboundLogsResponse
     */
    CompletableFuture<ListDlpOutboundLogsResponse> listDlpOutboundLogs(ListDlpOutboundLogsRequest request);

    /**
     * @param request the request parameters of ListDomainAccessLogs  ListDomainAccessLogsRequest
     * @return ListDomainAccessLogsResponse
     */
    CompletableFuture<ListDomainAccessLogsResponse> listDomainAccessLogs(ListDomainAccessLogsRequest request);

    /**
     * @param request the request parameters of ListDomainItems  ListDomainItemsRequest
     * @return ListDomainItemsResponse
     */
    CompletableFuture<ListDomainItemsResponse> listDomainItems(ListDomainItemsRequest request);

    /**
     * @param request the request parameters of ListDomainMetas  ListDomainMetasRequest
     * @return ListDomainMetasResponse
     */
    CompletableFuture<ListDomainMetasResponse> listDomainMetas(ListDomainMetasRequest request);

    /**
     * @param request the request parameters of ListDynamicDisposalProcesses  ListDynamicDisposalProcessesRequest
     * @return ListDynamicDisposalProcessesResponse
     */
    CompletableFuture<ListDynamicDisposalProcessesResponse> listDynamicDisposalProcesses(ListDynamicDisposalProcessesRequest request);

    /**
     * @param request the request parameters of ListDynamicRouteRegions  ListDynamicRouteRegionsRequest
     * @return ListDynamicRouteRegionsResponse
     */
    CompletableFuture<ListDynamicRouteRegionsResponse> listDynamicRouteRegions(ListDynamicRouteRegionsRequest request);

    /**
     * @param request the request parameters of ListDynamicRoutes  ListDynamicRoutesRequest
     * @return ListDynamicRoutesResponse
     */
    CompletableFuture<ListDynamicRoutesResponse> listDynamicRoutes(ListDynamicRoutesRequest request);

    /**
     * @param request the request parameters of ListEnterpriseAccelerateLogs  ListEnterpriseAccelerateLogsRequest
     * @return ListEnterpriseAccelerateLogsResponse
     */
    CompletableFuture<ListEnterpriseAccelerateLogsResponse> listEnterpriseAccelerateLogs(ListEnterpriseAccelerateLogsRequest request);

    /**
     * @param request the request parameters of ListEnterpriseAcceleratePolicies  ListEnterpriseAcceleratePoliciesRequest
     * @return ListEnterpriseAcceleratePoliciesResponse
     */
    CompletableFuture<ListEnterpriseAcceleratePoliciesResponse> listEnterpriseAcceleratePolicies(ListEnterpriseAcceleratePoliciesRequest request);

    /**
     * @param request the request parameters of ListEnterpriseAccelerateTargets  ListEnterpriseAccelerateTargetsRequest
     * @return ListEnterpriseAccelerateTargetsResponse
     */
    CompletableFuture<ListEnterpriseAccelerateTargetsResponse> listEnterpriseAccelerateTargets(ListEnterpriseAccelerateTargetsRequest request);

    /**
     * @param request the request parameters of ListExcessiveDeviceRegistrationApplications  ListExcessiveDeviceRegistrationApplicationsRequest
     * @return ListExcessiveDeviceRegistrationApplicationsResponse
     */
    CompletableFuture<ListExcessiveDeviceRegistrationApplicationsResponse> listExcessiveDeviceRegistrationApplications(ListExcessiveDeviceRegistrationApplicationsRequest request);

    /**
     * @param request the request parameters of ListForwardStrategies  ListForwardStrategiesRequest
     * @return ListForwardStrategiesResponse
     */
    CompletableFuture<ListForwardStrategiesResponse> listForwardStrategies(ListForwardStrategiesRequest request);

    /**
     * @param request the request parameters of ListForwardStrategyBindingItems  ListForwardStrategyBindingItemsRequest
     * @return ListForwardStrategyBindingItemsResponse
     */
    CompletableFuture<ListForwardStrategyBindingItemsResponse> listForwardStrategyBindingItems(ListForwardStrategyBindingItemsRequest request);

    /**
     * @param request the request parameters of ListIdpConfigs  ListIdpConfigsRequest
     * @return ListIdpConfigsResponse
     */
    CompletableFuture<ListIdpConfigsResponse> listIdpConfigs(ListIdpConfigsRequest request);

    /**
     * @param request the request parameters of ListIdpDepartments  ListIdpDepartmentsRequest
     * @return ListIdpDepartmentsResponse
     */
    CompletableFuture<ListIdpDepartmentsResponse> listIdpDepartments(ListIdpDepartmentsRequest request);

    /**
     * @param request the request parameters of ListNacUserCert  ListNacUserCertRequest
     * @return ListNacUserCertResponse
     */
    CompletableFuture<ListNacUserCertResponse> listNacUserCert(ListNacUserCertRequest request);

    /**
     * @param request the request parameters of ListOperationAuditLogs  ListOperationAuditLogsRequest
     * @return ListOperationAuditLogsResponse
     */
    CompletableFuture<ListOperationAuditLogsResponse> listOperationAuditLogs(ListOperationAuditLogsRequest request);

    /**
     * @param request the request parameters of ListPolicesForPrivateAccessApplication  ListPolicesForPrivateAccessApplicationRequest
     * @return ListPolicesForPrivateAccessApplicationResponse
     */
    CompletableFuture<ListPolicesForPrivateAccessApplicationResponse> listPolicesForPrivateAccessApplication(ListPolicesForPrivateAccessApplicationRequest request);

    /**
     * @param request the request parameters of ListPolicesForPrivateAccessTag  ListPolicesForPrivateAccessTagRequest
     * @return ListPolicesForPrivateAccessTagResponse
     */
    CompletableFuture<ListPolicesForPrivateAccessTagResponse> listPolicesForPrivateAccessTag(ListPolicesForPrivateAccessTagRequest request);

    /**
     * @param request the request parameters of ListPolicesForUserGroup  ListPolicesForUserGroupRequest
     * @return ListPolicesForUserGroupResponse
     */
    CompletableFuture<ListPolicesForUserGroupResponse> listPolicesForUserGroup(ListPolicesForUserGroupRequest request);

    /**
     * @param request the request parameters of ListPopTrafficStatistics  ListPopTrafficStatisticsRequest
     * @return ListPopTrafficStatisticsResponse
     */
    CompletableFuture<ListPopTrafficStatisticsResponse> listPopTrafficStatistics(ListPopTrafficStatisticsRequest request);

    /**
     * @param request the request parameters of ListPrivateAccessApplicationL7Switches  ListPrivateAccessApplicationL7SwitchesRequest
     * @return ListPrivateAccessApplicationL7SwitchesResponse
     */
    CompletableFuture<ListPrivateAccessApplicationL7SwitchesResponse> listPrivateAccessApplicationL7Switches(ListPrivateAccessApplicationL7SwitchesRequest request);

    /**
     * @param request the request parameters of ListPrivateAccessApplications  ListPrivateAccessApplicationsRequest
     * @return ListPrivateAccessApplicationsResponse
     */
    CompletableFuture<ListPrivateAccessApplicationsResponse> listPrivateAccessApplications(ListPrivateAccessApplicationsRequest request);

    /**
     * @param request the request parameters of ListPrivateAccessApplicationsForDynamicRoute  ListPrivateAccessApplicationsForDynamicRouteRequest
     * @return ListPrivateAccessApplicationsForDynamicRouteResponse
     */
    CompletableFuture<ListPrivateAccessApplicationsForDynamicRouteResponse> listPrivateAccessApplicationsForDynamicRoute(ListPrivateAccessApplicationsForDynamicRouteRequest request);

    /**
     * @param request the request parameters of ListPrivateAccessPolices  ListPrivateAccessPolicesRequest
     * @return ListPrivateAccessPolicesResponse
     */
    CompletableFuture<ListPrivateAccessPolicesResponse> listPrivateAccessPolices(ListPrivateAccessPolicesRequest request);

    /**
     * @param request the request parameters of ListPrivateAccessTags  ListPrivateAccessTagsRequest
     * @return ListPrivateAccessTagsResponse
     */
    CompletableFuture<ListPrivateAccessTagsResponse> listPrivateAccessTags(ListPrivateAccessTagsRequest request);

    /**
     * @param request the request parameters of ListPrivateAccessTagsForDynamicRoute  ListPrivateAccessTagsForDynamicRouteRequest
     * @return ListPrivateAccessTagsForDynamicRouteResponse
     */
    CompletableFuture<ListPrivateAccessTagsForDynamicRouteResponse> listPrivateAccessTagsForDynamicRoute(ListPrivateAccessTagsForDynamicRouteRequest request);

    /**
     * @param request the request parameters of ListProhibitedPolicies  ListProhibitedPoliciesRequest
     * @return ListProhibitedPoliciesResponse
     */
    CompletableFuture<ListProhibitedPoliciesResponse> listProhibitedPolicies(ListProhibitedPoliciesRequest request);

    /**
     * @param request the request parameters of ListProhibitedSoftware  ListProhibitedSoftwareRequest
     * @return ListProhibitedSoftwareResponse
     */
    CompletableFuture<ListProhibitedSoftwareResponse> listProhibitedSoftware(ListProhibitedSoftwareRequest request);

    /**
     * @param request the request parameters of ListProhibitedTags  ListProhibitedTagsRequest
     * @return ListProhibitedTagsResponse
     */
    CompletableFuture<ListProhibitedTagsResponse> listProhibitedTags(ListProhibitedTagsRequest request);

    /**
     * @param request the request parameters of ListRegistrationPolicies  ListRegistrationPoliciesRequest
     * @return ListRegistrationPoliciesResponse
     */
    CompletableFuture<ListRegistrationPoliciesResponse> listRegistrationPolicies(ListRegistrationPoliciesRequest request);

    /**
     * @param request the request parameters of ListRegistrationPoliciesForUserGroup  ListRegistrationPoliciesForUserGroupRequest
     * @return ListRegistrationPoliciesForUserGroupResponse
     */
    CompletableFuture<ListRegistrationPoliciesForUserGroupResponse> listRegistrationPoliciesForUserGroup(ListRegistrationPoliciesForUserGroupRequest request);

    /**
     * @param request the request parameters of ListRiskItems  ListRiskItemsRequest
     * @return ListRiskItemsResponse
     */
    CompletableFuture<ListRiskItemsResponse> listRiskItems(ListRiskItemsRequest request);

    /**
     * @param request the request parameters of ListSaseUserTags  ListSaseUserTagsRequest
     * @return ListSaseUserTagsResponse
     */
    CompletableFuture<ListSaseUserTagsResponse> listSaseUserTags(ListSaseUserTagsRequest request);

    /**
     * @param request the request parameters of ListSoftwareForUserDevice  ListSoftwareForUserDeviceRequest
     * @return ListSoftwareForUserDeviceResponse
     */
    CompletableFuture<ListSoftwareForUserDeviceResponse> listSoftwareForUserDevice(ListSoftwareForUserDeviceRequest request);

    /**
     * @param request the request parameters of ListSoftwarelibSoftware  ListSoftwarelibSoftwareRequest
     * @return ListSoftwarelibSoftwareResponse
     */
    CompletableFuture<ListSoftwarelibSoftwareResponse> listSoftwarelibSoftware(ListSoftwarelibSoftwareRequest request);

    /**
     * @param request the request parameters of ListTagsForPrivateAccessApplication  ListTagsForPrivateAccessApplicationRequest
     * @return ListTagsForPrivateAccessApplicationResponse
     */
    CompletableFuture<ListTagsForPrivateAccessApplicationResponse> listTagsForPrivateAccessApplication(ListTagsForPrivateAccessApplicationRequest request);

    /**
     * @param request the request parameters of ListTagsForPrivateAccessPolicy  ListTagsForPrivateAccessPolicyRequest
     * @return ListTagsForPrivateAccessPolicyResponse
     */
    CompletableFuture<ListTagsForPrivateAccessPolicyResponse> listTagsForPrivateAccessPolicy(ListTagsForPrivateAccessPolicyRequest request);

    /**
     * @param request the request parameters of ListUninstallApplications  ListUninstallApplicationsRequest
     * @return ListUninstallApplicationsResponse
     */
    CompletableFuture<ListUninstallApplicationsResponse> listUninstallApplications(ListUninstallApplicationsRequest request);

    /**
     * @param request the request parameters of ListUserApplications  ListUserApplicationsRequest
     * @return ListUserApplicationsResponse
     */
    CompletableFuture<ListUserApplicationsResponse> listUserApplications(ListUserApplicationsRequest request);

    /**
     * @param request the request parameters of ListUserDevices  ListUserDevicesRequest
     * @return ListUserDevicesResponse
     */
    CompletableFuture<ListUserDevicesResponse> listUserDevices(ListUserDevicesRequest request);

    /**
     * @param request the request parameters of ListUserGroups  ListUserGroupsRequest
     * @return ListUserGroupsResponse
     */
    CompletableFuture<ListUserGroupsResponse> listUserGroups(ListUserGroupsRequest request);

    /**
     * @param request the request parameters of ListUserGroupsForPrivateAccessPolicy  ListUserGroupsForPrivateAccessPolicyRequest
     * @return ListUserGroupsForPrivateAccessPolicyResponse
     */
    CompletableFuture<ListUserGroupsForPrivateAccessPolicyResponse> listUserGroupsForPrivateAccessPolicy(ListUserGroupsForPrivateAccessPolicyRequest request);

    /**
     * @param request the request parameters of ListUserGroupsForRegistrationPolicy  ListUserGroupsForRegistrationPolicyRequest
     * @return ListUserGroupsForRegistrationPolicyResponse
     */
    CompletableFuture<ListUserGroupsForRegistrationPolicyResponse> listUserGroupsForRegistrationPolicy(ListUserGroupsForRegistrationPolicyRequest request);

    /**
     * @param request the request parameters of ListUserPrivateAccessPolicies  ListUserPrivateAccessPoliciesRequest
     * @return ListUserPrivateAccessPoliciesResponse
     */
    CompletableFuture<ListUserPrivateAccessPoliciesResponse> listUserPrivateAccessPolicies(ListUserPrivateAccessPoliciesRequest request);

    /**
     * @param request the request parameters of ListUsers  ListUsersRequest
     * @return ListUsersResponse
     */
    CompletableFuture<ListUsersResponse> listUsers(ListUsersRequest request);

    /**
     * @param request the request parameters of ListVirusFileStatuses  ListVirusFileStatusesRequest
     * @return ListVirusFileStatusesResponse
     */
    CompletableFuture<ListVirusFileStatusesResponse> listVirusFileStatuses(ListVirusFileStatusesRequest request);

    /**
     * @param request the request parameters of ListVirusScanAdditionalLists  ListVirusScanAdditionalListsRequest
     * @return ListVirusScanAdditionalListsResponse
     */
    CompletableFuture<ListVirusScanAdditionalListsResponse> listVirusScanAdditionalLists(ListVirusScanAdditionalListsRequest request);

    /**
     * @param request the request parameters of ListVirusScanScheduledStrategies  ListVirusScanScheduledStrategiesRequest
     * @return ListVirusScanScheduledStrategiesResponse
     */
    CompletableFuture<ListVirusScanScheduledStrategiesResponse> listVirusScanScheduledStrategies(ListVirusScanScheduledStrategiesRequest request);

    /**
     * @param request the request parameters of ListVirusScanTaskStatuses  ListVirusScanTaskStatusesRequest
     * @return ListVirusScanTaskStatusesResponse
     */
    CompletableFuture<ListVirusScanTaskStatusesResponse> listVirusScanTaskStatuses(ListVirusScanTaskStatusesRequest request);

    /**
     * @param request the request parameters of ListVirusScanTaskSummary  ListVirusScanTaskSummaryRequest
     * @return ListVirusScanTaskSummaryResponse
     */
    CompletableFuture<ListVirusScanTaskSummaryResponse> listVirusScanTaskSummary(ListVirusScanTaskSummaryRequest request);

    /**
     * @param request the request parameters of ListVirusScanTasks  ListVirusScanTasksRequest
     * @return ListVirusScanTasksResponse
     */
    CompletableFuture<ListVirusScanTasksResponse> listVirusScanTasks(ListVirusScanTasksRequest request);

    /**
     * @param request the request parameters of ListVulScanScheduledStrategies  ListVulScanScheduledStrategiesRequest
     * @return ListVulScanScheduledStrategiesResponse
     */
    CompletableFuture<ListVulScanScheduledStrategiesResponse> listVulScanScheduledStrategies(ListVulScanScheduledStrategiesRequest request);

    /**
     * @param request the request parameters of ListVulScanTasks  ListVulScanTasksRequest
     * @return ListVulScanTasksResponse
     */
    CompletableFuture<ListVulScanTasksResponse> listVulScanTasks(ListVulScanTasksRequest request);

    /**
     * @param request the request parameters of ListVulnerabilities  ListVulnerabilitiesRequest
     * @return ListVulnerabilitiesResponse
     */
    CompletableFuture<ListVulnerabilitiesResponse> listVulnerabilities(ListVulnerabilitiesRequest request);

    /**
     * @param request the request parameters of LookupWmInfoMapping  LookupWmInfoMappingRequest
     * @return LookupWmInfoMappingResponse
     */
    CompletableFuture<LookupWmInfoMappingResponse> lookupWmInfoMapping(LookupWmInfoMappingRequest request);

    /**
     * @param request the request parameters of ModifyEnterpriseAcceleratePolicy  ModifyEnterpriseAcceleratePolicyRequest
     * @return ModifyEnterpriseAcceleratePolicyResponse
     */
    CompletableFuture<ModifyEnterpriseAcceleratePolicyResponse> modifyEnterpriseAcceleratePolicy(ModifyEnterpriseAcceleratePolicyRequest request);

    /**
     * @param request the request parameters of ModifyForwardStrategy  ModifyForwardStrategyRequest
     * @return ModifyForwardStrategyResponse
     */
    CompletableFuture<ModifyForwardStrategyResponse> modifyForwardStrategy(ModifyForwardStrategyRequest request);

    /**
     * @param request the request parameters of ModifyForwardStrategyBindingItems  ModifyForwardStrategyBindingItemsRequest
     * @return ModifyForwardStrategyBindingItemsResponse
     */
    CompletableFuture<ModifyForwardStrategyBindingItemsResponse> modifyForwardStrategyBindingItems(ModifyForwardStrategyBindingItemsRequest request);

    /**
     * @param request the request parameters of RemoveDeviceGroupMatchDevices  RemoveDeviceGroupMatchDevicesRequest
     * @return RemoveDeviceGroupMatchDevicesResponse
     */
    CompletableFuture<RemoveDeviceGroupMatchDevicesResponse> removeDeviceGroupMatchDevices(RemoveDeviceGroupMatchDevicesRequest request);

    /**
     * @param request the request parameters of RemoveVirusScanAdditionalLists  RemoveVirusScanAdditionalListsRequest
     * @return RemoveVirusScanAdditionalListsResponse
     */
    CompletableFuture<RemoveVirusScanAdditionalListsResponse> removeVirusScanAdditionalLists(RemoveVirusScanAdditionalListsRequest request);

    /**
     * @param request the request parameters of RevokeUserDeviceSession  RevokeUserDeviceSessionRequest
     * @return RevokeUserDeviceSessionResponse
     */
    CompletableFuture<RevokeUserDeviceSessionResponse> revokeUserDeviceSession(RevokeUserDeviceSessionRequest request);

    /**
     * @deprecated OpenAPI RevokeUserSession is deprecated  * @param request  the request parameters of RevokeUserSession  RevokeUserSessionRequest
     * @return RevokeUserSessionResponse
     */
    @Deprecated
    CompletableFuture<RevokeUserSessionResponse> revokeUserSession(RevokeUserSessionRequest request);

    /**
     * @param request the request parameters of UnbindSaseUserTag  UnbindSaseUserTagRequest
     * @return UnbindSaseUserTagResponse
     */
    CompletableFuture<UnbindSaseUserTagResponse> unbindSaseUserTag(UnbindSaseUserTagRequest request);

    /**
     * @param request the request parameters of UpdateAntiVirusRealTimeDefenceStrategy  UpdateAntiVirusRealTimeDefenceStrategyRequest
     * @return UpdateAntiVirusRealTimeDefenceStrategyResponse
     */
    CompletableFuture<UpdateAntiVirusRealTimeDefenceStrategyResponse> updateAntiVirusRealTimeDefenceStrategy(UpdateAntiVirusRealTimeDefenceStrategyRequest request);

    /**
     * @param request the request parameters of UpdateApprovalProcess  UpdateApprovalProcessRequest
     * @return UpdateApprovalProcessResponse
     */
    CompletableFuture<UpdateApprovalProcessResponse> updateApprovalProcess(UpdateApprovalProcessRequest request);

    /**
     * @param request the request parameters of UpdateApprovalStatus  UpdateApprovalStatusRequest
     * @return UpdateApprovalStatusResponse
     */
    CompletableFuture<UpdateApprovalStatusResponse> updateApprovalStatus(UpdateApprovalStatusRequest request);

    /**
     * @param request the request parameters of UpdateBootAndAntiUninstallPolicy  UpdateBootAndAntiUninstallPolicyRequest
     * @return UpdateBootAndAntiUninstallPolicyResponse
     */
    CompletableFuture<UpdateBootAndAntiUninstallPolicyResponse> updateBootAndAntiUninstallPolicy(UpdateBootAndAntiUninstallPolicyRequest request);

    /**
     * @param request the request parameters of UpdateClientUser  UpdateClientUserRequest
     * @return UpdateClientUserResponse
     */
    CompletableFuture<UpdateClientUserResponse> updateClientUser(UpdateClientUserRequest request);

    /**
     * @param request the request parameters of UpdateClientUserPassword  UpdateClientUserPasswordRequest
     * @return UpdateClientUserPasswordResponse
     */
    CompletableFuture<UpdateClientUserPasswordResponse> updateClientUserPassword(UpdateClientUserPasswordRequest request);

    /**
     * @param request the request parameters of UpdateClientUserStatus  UpdateClientUserStatusRequest
     * @return UpdateClientUserStatusResponse
     */
    CompletableFuture<UpdateClientUserStatusResponse> updateClientUserStatus(UpdateClientUserStatusRequest request);

    /**
     * @param request the request parameters of UpdateConnector  UpdateConnectorRequest
     * @return UpdateConnectorResponse
     */
    CompletableFuture<UpdateConnectorResponse> updateConnector(UpdateConnectorRequest request);

    /**
     * @param request the request parameters of UpdateConnectorClient  UpdateConnectorClientRequest
     * @return UpdateConnectorClientResponse
     */
    CompletableFuture<UpdateConnectorClientResponse> updateConnectorClient(UpdateConnectorClientRequest request);

    /**
     * @param request the request parameters of UpdateDeviceGroup  UpdateDeviceGroupRequest
     * @return UpdateDeviceGroupResponse
     */
    CompletableFuture<UpdateDeviceGroupResponse> updateDeviceGroup(UpdateDeviceGroupRequest request);

    /**
     * @param request the request parameters of UpdateDomainMeta  UpdateDomainMetaRequest
     * @return UpdateDomainMetaResponse
     */
    CompletableFuture<UpdateDomainMetaResponse> updateDomainMeta(UpdateDomainMetaRequest request);

    /**
     * @param request the request parameters of UpdateDynamicRoute  UpdateDynamicRouteRequest
     * @return UpdateDynamicRouteResponse
     */
    CompletableFuture<UpdateDynamicRouteResponse> updateDynamicRoute(UpdateDynamicRouteRequest request);

    /**
     * @param request the request parameters of UpdateExcessiveDeviceRegistrationApplicationsStatus  UpdateExcessiveDeviceRegistrationApplicationsStatusRequest
     * @return UpdateExcessiveDeviceRegistrationApplicationsStatusResponse
     */
    CompletableFuture<UpdateExcessiveDeviceRegistrationApplicationsStatusResponse> updateExcessiveDeviceRegistrationApplicationsStatus(UpdateExcessiveDeviceRegistrationApplicationsStatusRequest request);

    /**
     * @param request the request parameters of UpdateIdpDepartment  UpdateIdpDepartmentRequest
     * @return UpdateIdpDepartmentResponse
     */
    CompletableFuture<UpdateIdpDepartmentResponse> updateIdpDepartment(UpdateIdpDepartmentRequest request);

    /**
     * @param request the request parameters of UpdateNacPortalSmsPhoneWhitelist  UpdateNacPortalSmsPhoneWhitelistRequest
     * @return UpdateNacPortalSmsPhoneWhitelistResponse
     */
    CompletableFuture<UpdateNacPortalSmsPhoneWhitelistResponse> updateNacPortalSmsPhoneWhitelist(UpdateNacPortalSmsPhoneWhitelistRequest request);

    /**
     * @param request the request parameters of UpdateNacUserCertStatus  UpdateNacUserCertStatusRequest
     * @return UpdateNacUserCertStatusResponse
     */
    CompletableFuture<UpdateNacUserCertStatusResponse> updateNacUserCertStatus(UpdateNacUserCertStatusRequest request);

    /**
     * @param request the request parameters of UpdatePrivateAccessApplication  UpdatePrivateAccessApplicationRequest
     * @return UpdatePrivateAccessApplicationResponse
     */
    CompletableFuture<UpdatePrivateAccessApplicationResponse> updatePrivateAccessApplication(UpdatePrivateAccessApplicationRequest request);

    /**
     * @param request the request parameters of UpdatePrivateAccessApplicationL7Switch  UpdatePrivateAccessApplicationL7SwitchRequest
     * @return UpdatePrivateAccessApplicationL7SwitchResponse
     */
    CompletableFuture<UpdatePrivateAccessApplicationL7SwitchResponse> updatePrivateAccessApplicationL7Switch(UpdatePrivateAccessApplicationL7SwitchRequest request);

    /**
     * @param request the request parameters of UpdatePrivateAccessPolicy  UpdatePrivateAccessPolicyRequest
     * @return UpdatePrivateAccessPolicyResponse
     */
    CompletableFuture<UpdatePrivateAccessPolicyResponse> updatePrivateAccessPolicy(UpdatePrivateAccessPolicyRequest request);

    /**
     * @param request the request parameters of UpdateProhibitedPolicy  UpdateProhibitedPolicyRequest
     * @return UpdateProhibitedPolicyResponse
     */
    CompletableFuture<UpdateProhibitedPolicyResponse> updateProhibitedPolicy(UpdateProhibitedPolicyRequest request);

    /**
     * @param request the request parameters of UpdateProhibitedSoftware  UpdateProhibitedSoftwareRequest
     * @return UpdateProhibitedSoftwareResponse
     */
    CompletableFuture<UpdateProhibitedSoftwareResponse> updateProhibitedSoftware(UpdateProhibitedSoftwareRequest request);

    /**
     * @param request the request parameters of UpdateProhibitedTag  UpdateProhibitedTagRequest
     * @return UpdateProhibitedTagResponse
     */
    CompletableFuture<UpdateProhibitedTagResponse> updateProhibitedTag(UpdateProhibitedTagRequest request);

    /**
     * @param request the request parameters of UpdateRegistrationPolicy  UpdateRegistrationPolicyRequest
     * @return UpdateRegistrationPolicyResponse
     */
    CompletableFuture<UpdateRegistrationPolicyResponse> updateRegistrationPolicy(UpdateRegistrationPolicyRequest request);

    /**
     * @param request the request parameters of UpdateRiskStatus  UpdateRiskStatusRequest
     * @return UpdateRiskStatusResponse
     */
    CompletableFuture<UpdateRiskStatusResponse> updateRiskStatus(UpdateRiskStatusRequest request);

    /**
     * @param request the request parameters of UpdateSaseUserTag  UpdateSaseUserTagRequest
     * @return UpdateSaseUserTagResponse
     */
    CompletableFuture<UpdateSaseUserTagResponse> updateSaseUserTag(UpdateSaseUserTagRequest request);

    /**
     * @param request the request parameters of UpdateUninstallApplicationsStatus  UpdateUninstallApplicationsStatusRequest
     * @return UpdateUninstallApplicationsStatusResponse
     */
    CompletableFuture<UpdateUninstallApplicationsStatusResponse> updateUninstallApplicationsStatus(UpdateUninstallApplicationsStatusRequest request);

    /**
     * @param request the request parameters of UpdateUserDevicesSharingStatus  UpdateUserDevicesSharingStatusRequest
     * @return UpdateUserDevicesSharingStatusResponse
     */
    CompletableFuture<UpdateUserDevicesSharingStatusResponse> updateUserDevicesSharingStatus(UpdateUserDevicesSharingStatusRequest request);

    /**
     * @param request the request parameters of UpdateUserDevicesStatus  UpdateUserDevicesStatusRequest
     * @return UpdateUserDevicesStatusResponse
     */
    CompletableFuture<UpdateUserDevicesStatusResponse> updateUserDevicesStatus(UpdateUserDevicesStatusRequest request);

    /**
     * @param request the request parameters of UpdateUserGroup  UpdateUserGroupRequest
     * @return UpdateUserGroupResponse
     */
    CompletableFuture<UpdateUserGroupResponse> updateUserGroup(UpdateUserGroupRequest request);

    /**
     * @param request the request parameters of UpdateUsersStatus  UpdateUsersStatusRequest
     * @return UpdateUsersStatusResponse
     */
    CompletableFuture<UpdateUsersStatusResponse> updateUsersStatus(UpdateUsersStatusRequest request);

    /**
     * @param request the request parameters of UpdateVirusFileStatus  UpdateVirusFileStatusRequest
     * @return UpdateVirusFileStatusResponse
     */
    CompletableFuture<UpdateVirusFileStatusResponse> updateVirusFileStatus(UpdateVirusFileStatusRequest request);

    /**
     * @param request the request parameters of UpdateVirusScanGlobalConfig  UpdateVirusScanGlobalConfigRequest
     * @return UpdateVirusScanGlobalConfigResponse
     */
    CompletableFuture<UpdateVirusScanGlobalConfigResponse> updateVirusScanGlobalConfig(UpdateVirusScanGlobalConfigRequest request);

    /**
     * @param request the request parameters of UpdateVirusScanScheduledStrategy  UpdateVirusScanScheduledStrategyRequest
     * @return UpdateVirusScanScheduledStrategyResponse
     */
    CompletableFuture<UpdateVirusScanScheduledStrategyResponse> updateVirusScanScheduledStrategy(UpdateVirusScanScheduledStrategyRequest request);

    /**
     * @param request the request parameters of UpdateVulScanGlobalConfig  UpdateVulScanGlobalConfigRequest
     * @return UpdateVulScanGlobalConfigResponse
     */
    CompletableFuture<UpdateVulScanGlobalConfigResponse> updateVulScanGlobalConfig(UpdateVulScanGlobalConfigRequest request);

    /**
     * @param request the request parameters of UpdateVulScanScheduledStrategy  UpdateVulScanScheduledStrategyRequest
     * @return UpdateVulScanScheduledStrategyResponse
     */
    CompletableFuture<UpdateVulScanScheduledStrategyResponse> updateVulScanScheduledStrategy(UpdateVulScanScheduledStrategyRequest request);

}
