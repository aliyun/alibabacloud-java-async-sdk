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
     * @param request the request parameters of AttachApplication2Connector  AttachApplication2ConnectorRequest
     * @return AttachApplication2ConnectorResponse
     */
    CompletableFuture<AttachApplication2ConnectorResponse> attachApplication2Connector(AttachApplication2ConnectorRequest request);

    /**
     * @param request the request parameters of CreateClientUser  CreateClientUserRequest
     * @return CreateClientUserResponse
     */
    CompletableFuture<CreateClientUserResponse> createClientUser(CreateClientUserRequest request);

    /**
     * @param request the request parameters of CreateDynamicRoute  CreateDynamicRouteRequest
     * @return CreateDynamicRouteResponse
     */
    CompletableFuture<CreateDynamicRouteResponse> createDynamicRoute(CreateDynamicRouteRequest request);

    /**
     * @param request the request parameters of CreateIdpDepartment  CreateIdpDepartmentRequest
     * @return CreateIdpDepartmentResponse
     */
    CompletableFuture<CreateIdpDepartmentResponse> createIdpDepartment(CreateIdpDepartmentRequest request);

    /**
     * @param request the request parameters of CreatePrivateAccessApplication  CreatePrivateAccessApplicationRequest
     * @return CreatePrivateAccessApplicationResponse
     */
    CompletableFuture<CreatePrivateAccessApplicationResponse> createPrivateAccessApplication(CreatePrivateAccessApplicationRequest request);

    /**
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
     * @param request the request parameters of CreateRegistrationPolicy  CreateRegistrationPolicyRequest
     * @return CreateRegistrationPolicyResponse
     */
    CompletableFuture<CreateRegistrationPolicyResponse> createRegistrationPolicy(CreateRegistrationPolicyRequest request);

    /**
     * @param request the request parameters of CreateUserGroup  CreateUserGroupRequest
     * @return CreateUserGroupResponse
     */
    CompletableFuture<CreateUserGroupResponse> createUserGroup(CreateUserGroupRequest request);

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
     * @param request the request parameters of DeleteClientUser  DeleteClientUserRequest
     * @return DeleteClientUserResponse
     */
    CompletableFuture<DeleteClientUserResponse> deleteClientUser(DeleteClientUserRequest request);

    /**
     * @param request the request parameters of DeleteDynamicRoute  DeleteDynamicRouteRequest
     * @return DeleteDynamicRouteResponse
     */
    CompletableFuture<DeleteDynamicRouteResponse> deleteDynamicRoute(DeleteDynamicRouteRequest request);

    /**
     * @param request the request parameters of DeleteIdpDepartment  DeleteIdpDepartmentRequest
     * @return DeleteIdpDepartmentResponse
     */
    CompletableFuture<DeleteIdpDepartmentResponse> deleteIdpDepartment(DeleteIdpDepartmentRequest request);

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
     * @param request the request parameters of DeleteRegistrationPolicies  DeleteRegistrationPoliciesRequest
     * @return DeleteRegistrationPoliciesResponse
     */
    CompletableFuture<DeleteRegistrationPoliciesResponse> deleteRegistrationPolicies(DeleteRegistrationPoliciesRequest request);

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
     * @param request the request parameters of DetachApplication2Connector  DetachApplication2ConnectorRequest
     * @return DetachApplication2ConnectorResponse
     */
    CompletableFuture<DetachApplication2ConnectorResponse> detachApplication2Connector(DetachApplication2ConnectorRequest request);

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
     * @param request the request parameters of GetClientUser  GetClientUserRequest
     * @return GetClientUserResponse
     */
    CompletableFuture<GetClientUserResponse> getClientUser(GetClientUserRequest request);

    /**
     * @param request the request parameters of GetDynamicRoute  GetDynamicRouteRequest
     * @return GetDynamicRouteResponse
     */
    CompletableFuture<GetDynamicRouteResponse> getDynamicRoute(GetDynamicRouteRequest request);

    /**
     * @param request the request parameters of GetIdpConfig  GetIdpConfigRequest
     * @return GetIdpConfigResponse
     */
    CompletableFuture<GetIdpConfigResponse> getIdpConfig(GetIdpConfigRequest request);

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
     * @param request the request parameters of GetRegistrationPolicy  GetRegistrationPolicyRequest
     * @return GetRegistrationPolicyResponse
     */
    CompletableFuture<GetRegistrationPolicyResponse> getRegistrationPolicy(GetRegistrationPolicyRequest request);

    /**
     * @param request the request parameters of GetUserDevice  GetUserDeviceRequest
     * @return GetUserDeviceResponse
     */
    CompletableFuture<GetUserDeviceResponse> getUserDevice(GetUserDeviceRequest request);

    /**
     * @param request the request parameters of GetUserGroup  GetUserGroupRequest
     * @return GetUserGroupResponse
     */
    CompletableFuture<GetUserGroupResponse> getUserGroup(GetUserGroupRequest request);

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
     * @param request the request parameters of ListExcessiveDeviceRegistrationApplications  ListExcessiveDeviceRegistrationApplicationsRequest
     * @return ListExcessiveDeviceRegistrationApplicationsResponse
     */
    CompletableFuture<ListExcessiveDeviceRegistrationApplicationsResponse> listExcessiveDeviceRegistrationApplications(ListExcessiveDeviceRegistrationApplicationsRequest request);

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
     * @param request the request parameters of ListSoftwareForUserDevice  ListSoftwareForUserDeviceRequest
     * @return ListSoftwareForUserDeviceResponse
     */
    CompletableFuture<ListSoftwareForUserDeviceResponse> listSoftwareForUserDevice(ListSoftwareForUserDeviceRequest request);

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
     * @param request the request parameters of ListUsers  ListUsersRequest
     * @return ListUsersResponse
     */
    CompletableFuture<ListUsersResponse> listUsers(ListUsersRequest request);

    /**
     * @param request the request parameters of LookupWmInfoMapping  LookupWmInfoMappingRequest
     * @return LookupWmInfoMappingResponse
     */
    CompletableFuture<LookupWmInfoMappingResponse> lookupWmInfoMapping(LookupWmInfoMappingRequest request);

    /**
     * @param request the request parameters of RevokeUserSession  RevokeUserSessionRequest
     * @return RevokeUserSessionResponse
     */
    CompletableFuture<RevokeUserSessionResponse> revokeUserSession(RevokeUserSessionRequest request);

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
     * @param request the request parameters of UpdatePrivateAccessPolicy  UpdatePrivateAccessPolicyRequest
     * @return UpdatePrivateAccessPolicyResponse
     */
    CompletableFuture<UpdatePrivateAccessPolicyResponse> updatePrivateAccessPolicy(UpdatePrivateAccessPolicyRequest request);

    /**
     * @param request the request parameters of UpdateRegistrationPolicy  UpdateRegistrationPolicyRequest
     * @return UpdateRegistrationPolicyResponse
     */
    CompletableFuture<UpdateRegistrationPolicyResponse> updateRegistrationPolicy(UpdateRegistrationPolicyRequest request);

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

}
