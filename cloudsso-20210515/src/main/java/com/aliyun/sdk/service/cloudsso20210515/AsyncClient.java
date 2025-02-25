// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.cloudsso20210515.models.*;
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
     * <p>You can add up to two SAML signing certificates.
     * This topic provides an example on how to add a SAML signing certificate to the directory <code>d-00fc2p61****</code>.</p>
     * 
     * @param request the request parameters of AddExternalSAMLIdPCertificate  AddExternalSAMLIdPCertificateRequest
     * @return AddExternalSAMLIdPCertificateResponse
     */
    CompletableFuture<AddExternalSAMLIdPCertificateResponse> addExternalSAMLIdPCertificate(AddExternalSAMLIdPCertificateRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to add the system policy <code>AliyunECSFullAccess</code> to the access configuration <code>ac-00jhtfl8thteu6uj****</code>.</p>
     * 
     * @param request the request parameters of AddPermissionPolicyToAccessConfiguration  AddPermissionPolicyToAccessConfigurationRequest
     * @return AddPermissionPolicyToAccessConfigurationResponse
     */
    CompletableFuture<AddPermissionPolicyToAccessConfigurationResponse> addPermissionPolicyToAccessConfiguration(AddPermissionPolicyToAccessConfigurationRequest request);

    /**
     * <b>description</b> :
     * <p>If System for Cross-domain Identity Management (SCIM) synchronization is enabled, you cannot add a user to a group that is synchronized by using SCIM.
     * This topic provides an example of how to add the user <code>u-00q8wbq42wiltcrk****</code> to the group <code>g-00jqzghi2n3o5hkh****</code>.</p>
     * 
     * @param request the request parameters of AddUserToGroup  AddUserToGroupRequest
     * @return AddUserToGroupResponse
     */
    CompletableFuture<AddUserToGroupResponse> addUserToGroup(AddUserToGroupRequest request);

    /**
     * <b>description</b> :
     * <p>If single sign-on (SSO) logon is disabled, you can clear the configurations of a SAML IdP. If SSO logon is enabled, you cannot clear the configurations.
     * This topic provides an example on how to clear the configurations of the SAML IdP within the directory <code>d-00fc2p61****</code>.</p>
     * 
     * @param request the request parameters of ClearExternalSAMLIdentityProvider  ClearExternalSAMLIdentityProviderRequest
     * @return ClearExternalSAMLIdentityProviderResponse
     */
    CompletableFuture<ClearExternalSAMLIdentityProviderResponse> clearExternalSAMLIdentityProvider(ClearExternalSAMLIdentityProviderRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation, an asynchronous task is created. You can call the <a href="https://help.aliyun.com/document_detail/340670.html">GetTask</a> operation to query the progress of the task based on the value of the <code>TaskId</code> response parameter.
     * For more information about how to assign permissions on an account in your resource directory, see <a href="https://help.aliyun.com/document_detail/266726.html">Overview of multi-account authorization</a>.
     * This topic provides an example on how to assign access permissions on the account <code>114240524784****</code> in your resource directory to the CloudSSO user <code>u-00q8wbq42wiltcrk****</code> by using the access configuration <code>ac-00jhtfl8thteu6uj****</code>. After the call is successful, the CloudSSO user can access resources within the account in the resource directory.</p>
     * 
     * @param request the request parameters of CreateAccessAssignment  CreateAccessAssignmentRequest
     * @return CreateAccessAssignmentResponse
     */
    CompletableFuture<CreateAccessAssignmentResponse> createAccessAssignment(CreateAccessAssignmentRequest request);

    /**
     * <b>description</b> :
     * <p>For more information about access configurations, see <a href="https://help.aliyun.com/document_detail/266737.html">Overview of access configurations</a>.
     * This topic provides an example on how to create an access configuration named <code>ECS-Admin</code>.</p>
     * 
     * @param request the request parameters of CreateAccessConfiguration  CreateAccessConfigurationRequest
     * @return CreateAccessConfigurationResponse
     */
    CompletableFuture<CreateAccessConfigurationResponse> createAccessConfiguration(CreateAccessConfigurationRequest request);

    /**
     * <b>description</b> :
     * <p>A directory is a CloudSSO instance. Before you can use CloudSSO, you must create a directory. The directory is used to manage all CloudSSO resources.
     * To create a directory, you must select a region. Alibaba Cloud stores data in the directory only in the region that you select. However, you can deploy Alibaba Cloud resources including Elastic Compute Service (ECS) instances and ApsaraDB RDS instances in other regions. You can also use your cloud account for logons and access the Alibaba Cloud resources in other regions. You can select a region to create a directory based on your security compliance requirements and the geographic location of specific users. If you do not have strict security compliance requirements, we recommend that you select a region that is the closest to the geographical location of the specific users. This way, access to cloud resources is accelerated. You can create the CloudSSO directory in the China (Shanghai), China (Hong Kong), US (Silicon Valley), or Germany (Frankfurt) region.
     * This topic provides an example on how to create a directory named <code>example</code> in the China (Shanghai) region.</p>
     * <h2>Limits</h2>
     * <ul>
     * <li>You can create only one directory for a management account.</li>
     * <li>If you want to change the region of a directory, you must delete the directory and then create a directory in a different region.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateDirectory  CreateDirectoryRequest
     * @return CreateDirectoryResponse
     */
    CompletableFuture<CreateDirectoryResponse> createDirectory(CreateDirectoryRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to create a group named <code>TestGroup</code>.</p>
     * 
     * @param request the request parameters of CreateGroup  CreateGroupRequest
     * @return CreateGroupResponse
     */
    CompletableFuture<CreateGroupResponse> createGroup(CreateGroupRequest request);

    /**
     * <b>description</b> :
     * <p>SCIM credentials are required for SCIM synchronization. You can create up to two SCIM credentials.
     * This topic provides an example on how to create a SCIM credential within the directory <code>d-00fc2p61****</code>.</p>
     * 
     * @param request the request parameters of CreateSCIMServerCredential  CreateSCIMServerCredentialRequest
     * @return CreateSCIMServerCredentialResponse
     */
    CompletableFuture<CreateSCIMServerCredentialResponse> createSCIMServerCredential(CreateSCIMServerCredentialRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to create a user named <code>Alice</code>.</p>
     * 
     * @param request the request parameters of CreateUser  CreateUserRequest
     * @return CreateUserResponse
     */
    CompletableFuture<CreateUserResponse> createUser(CreateUserRequest request);

    /**
     * <b>description</b> :
     * <p>You can create a RAM user provisioning for a member in your resource directory to create a RAM user that has the same username as a CloudSSO user. This way, the CloudSSO user can access the resources of the member as the RAM user.</p>
     * 
     * @param request the request parameters of CreateUserProvisioning  CreateUserProvisioningRequest
     * @return CreateUserProvisioningResponse
     */
    CompletableFuture<CreateUserProvisioningResponse> createUserProvisioning(CreateUserProvisioningRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation, an asynchronous task is created. You can call the <a href="https://help.aliyun.com/document_detail/340670.html">GetTask</a> operation to query the progress of the task based on the value of the <code>TaskId</code> response parameter.
     * This topic provides an example on how to remove the access permissions on the account <code>114240524784****</code> in the resource directory from the CloudSSO user <code>u-00q8wbq42wiltcrk****</code>. The access permissions are assigned by using the access configuration <code>ac-00jhtfl8thteu6uj****</code>.</p>
     * 
     * @param request the request parameters of DeleteAccessAssignment  DeleteAccessAssignmentRequest
     * @return DeleteAccessAssignmentResponse
     */
    CompletableFuture<DeleteAccessAssignmentResponse> deleteAccessAssignment(DeleteAccessAssignmentRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to delete the access configuration whose ID is <code>ac-001j9mcm3k7335bc****</code>.</p>
     * <h2>Prerequisites</h2>
     * <p>The access configuration that you want to delete is de-provisioned from the accounts in your resource directory. For more information, see <a href="https://help.aliyun.com/document_detail/338352.html">DeprovisionAccessConfiguration</a>.</p>
     * 
     * @param request the request parameters of DeleteAccessConfiguration  DeleteAccessConfigurationRequest
     * @return DeleteAccessConfigurationResponse
     */
    CompletableFuture<DeleteAccessConfigurationResponse> deleteAccessConfiguration(DeleteAccessConfigurationRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to delete a directory whose ID is <code>d-00fc2p61****</code>.</p>
     * <h2>Prerequisites</h2>
     * <p>No resources are contained in the directory that you want to delete.</p>
     * <ul>
     * <li>Access permissions on the accounts in your resource directory are removed from all users and groups. For more information, see <a href="https://help.aliyun.com/document_detail/338350.html">DeleteAccessAssignment</a>.</li>
     * <li>Users are deleted. For more information, see <a href="https://help.aliyun.com/document_detail/341671.html">DeleteUser</a>.</li>
     * <li>Groups are deleted. For more information, see <a href="https://help.aliyun.com/document_detail/341821.html">DeleteGroup</a>.</li>
     * <li>Access configurations are deleted. For more information, see <a href="https://help.aliyun.com/document_detail/336907.html">DeleteAccessConfiguration</a>.</li>
     * <li>System for Cross-domain Identity Management (SCIM) credentials are deleted. For more information, see <a href="https://help.aliyun.com/document_detail/341842.html">DeleteSCIMServerCredential</a>.</li>
     * <li>SSO logon configurations are deleted. For more information, see <a href="https://help.aliyun.com/document_detail/341573.html">ClearExternalSAMLIdentityProvider</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteDirectory  DeleteDirectoryRequest
     * @return DeleteDirectoryResponse
     */
    CompletableFuture<DeleteDirectoryResponse> deleteDirectory(DeleteDirectoryRequest request);

    /**
     * <b>description</b> :
     * <p>If System for Cross-domain Identity Management (SCIM) synchronization is enabled, you cannot delete a group that is synchronized by using SCIM.</p>
     * <h2>Prerequisites</h2>
     * <p>The group that you want to delete is not associated with the following resources. If the group is associated with the resources, the deletion fails.</p>
     * <ul>
     * <li>Users: You must remove users from the group. For more information, see <a href="https://help.aliyun.com/document_detail/335116.html">RemoveUserFromGroup</a>.</li>
     * <li>Access permissions: You must remove the access permissions on the accounts in your resource directory from the group. For more information, see <a href="https://help.aliyun.com/document_detail/338350.html">DeleteAccessAssignment</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteGroup  DeleteGroupRequest
     * @return DeleteGroupResponse
     */
    CompletableFuture<DeleteGroupResponse> deleteGroup(DeleteGroupRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to unbind the MFA device <code>mfa-00ujhet8pycljj7j****</code> from the user <code>u-00q8wbq42wiltcrk****</code>.</p>
     * 
     * @param request the request parameters of DeleteMFADeviceForUser  DeleteMFADeviceForUserRequest
     * @return DeleteMFADeviceForUserResponse
     */
    CompletableFuture<DeleteMFADeviceForUserResponse> deleteMFADeviceForUser(DeleteMFADeviceForUserRequest request);

    /**
     * <b>description</b> :
     * <p>After a SCIM credential is deleted, the synchronization task that uses the SCIM credential fails.
     * This topic provides an example on how to delete the SCIM credential whose ID is <code>scimcred-004whl0kvfwcypbi****</code>.</p>
     * 
     * @param request the request parameters of DeleteSCIMServerCredential  DeleteSCIMServerCredentialRequest
     * @return DeleteSCIMServerCredentialResponse
     */
    CompletableFuture<DeleteSCIMServerCredentialResponse> deleteSCIMServerCredential(DeleteSCIMServerCredentialRequest request);

    /**
     * <b>description</b> :
     * <p>If System for Cross-domain Identity Management (SCIM) synchronization is enabled, you cannot delete a user that is synchronized by using SCIM.</p>
     * <h2>Prerequisites</h2>
     * <p>The user that you want to delete is not associated with the following resources. If the user is associated with the resources, the deletion fails.</p>
     * <ul>
     * <li>Multi-factor authentication (MFA) devices: You must unbind the MFA devices from the user. For more information, see <a href="https://help.aliyun.com/document_detail/341675.html">DeleteMFADeviceForUser</a>.</li>
     * <li>Access permissions: You must remove the access permissions on the accounts in your resource directory from the user. For more information, see <a href="https://help.aliyun.com/document_detail/338350.html">DeleteAccessAssignment</a>.</li>
     * <li>Groups: You must remove the user from groups. For more information, see <a href="https://help.aliyun.com/document_detail/335116.html">RemoveUserFromGroup</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteUser  DeleteUserRequest
     * @return DeleteUserResponse
     */
    CompletableFuture<DeleteUserResponse> deleteUser(DeleteUserRequest request);

    /**
     * @param request the request parameters of DeleteUserProvisioning  DeleteUserProvisioningRequest
     * @return DeleteUserProvisioningResponse
     */
    CompletableFuture<DeleteUserProvisioningResponse> deleteUserProvisioning(DeleteUserProvisioningRequest request);

    /**
     * @param request the request parameters of DeleteUserProvisioningEvent  DeleteUserProvisioningEventRequest
     * @return DeleteUserProvisioningEventResponse
     */
    CompletableFuture<DeleteUserProvisioningEventResponse> deleteUserProvisioningEvent(DeleteUserProvisioningEventRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation, an asynchronous task is automatically created. You can call the <a href="https://help.aliyun.com/document_detail/340670.html">GetTask</a> operation to query the progress of the task based on the value of the <code>TaskId</code> response parameter.
     * This topic provides an example on how to de-provision the access configuration <code>ac-00jhtfl8thteu6uj****</code> from the account <code>114240524784****</code> in your resource directory.</p>
     * 
     * @param request the request parameters of DeprovisionAccessConfiguration  DeprovisionAccessConfigurationRequest
     * @return DeprovisionAccessConfigurationResponse
     */
    CompletableFuture<DeprovisionAccessConfigurationResponse> deprovisionAccessConfiguration(DeprovisionAccessConfigurationRequest request);

    /**
     * @param request the request parameters of DisableDelegateAccount  DisableDelegateAccountRequest
     * @return DisableDelegateAccountResponse
     */
    CompletableFuture<DisableDelegateAccountResponse> disableDelegateAccount(DisableDelegateAccountRequest request);

    /**
     * <b>description</b> :
     * <p>If your CloudSSO has no directory, you can disable CloudSSO based on your business requirements. After you disable CloudSSO, you can enable it at any time.</p>
     * 
     * @param request the request parameters of DisableService  DisableServiceRequest
     * @return DisableServiceResponse
     */
    CompletableFuture<DisableServiceResponse> disableService(DisableServiceRequest request);

    /**
     * <b>description</b> :
     * <p>You can use the management account of a resource directory to specify a member of the resource directory as the delegated administrator account of CloudSSO. For more information, see <a href="https://help.aliyun.com/document_detail/208117.html">Add a delegated administrator account</a>.
     * After the delegated administrator account of CloudSSO is specified, you can call this operation to enable the delegated administrator account of CloudSSO to manage CloudSSO resources.</p>
     * 
     * @param request the request parameters of EnableDelegateAccount  EnableDelegateAccountRequest
     * @return EnableDelegateAccountResponse
     */
    CompletableFuture<EnableDelegateAccountResponse> enableDelegateAccount(EnableDelegateAccountRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation only if your account belongs to the management account that is used to enable a resource directory and has permissions to enable CloudSSO. For more information, see <a href="https://help.aliyun.com/document_detail/262819.html">Enable CloudSSO</a>.
     * If you call this operation, you agree to the <a href="https://www.alibabacloud.com/help/doc-detail/42416.htm">Alibaba Cloud International Website Product Terms of Service</a>.</p>
     * 
     * @param request the request parameters of EnableService  EnableServiceRequest
     * @return EnableServiceResponse
     */
    CompletableFuture<EnableServiceResponse> enableService(EnableServiceRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the information about the access configuration whose ID is <code>ac-00ccule7tadaijxc****</code>.</p>
     * 
     * @param request the request parameters of GetAccessConfiguration  GetAccessConfigurationRequest
     * @return GetAccessConfigurationResponse
     */
    CompletableFuture<GetAccessConfigurationResponse> getAccessConfiguration(GetAccessConfigurationRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query information about the directory whose ID is <code>d-00fc2p61****</code>.</p>
     * 
     * @param request the request parameters of GetDirectory  GetDirectoryRequest
     * @return GetDirectoryResponse
     */
    CompletableFuture<GetDirectoryResponse> getDirectory(GetDirectoryRequest request);

    /**
     * <b>description</b> :
     * <p>During SAML 2.0-based single sign-on (SSO) logon, CloudSSO is an SP, and the identity management system of an enterprise is an identity provider (IdP).
     * This topic provides an example on how to query the information about the SP within the directory <code>d-00fc2p61****</code>.</p>
     * 
     * @param request the request parameters of GetDirectorySAMLServiceProviderInfo  GetDirectorySAMLServiceProviderInfoRequest
     * @return GetDirectorySAMLServiceProviderInfoResponse
     */
    CompletableFuture<GetDirectorySAMLServiceProviderInfoResponse> getDirectorySAMLServiceProviderInfo(GetDirectorySAMLServiceProviderInfoRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the statistics of a directory whose ID is <code>d-00fc2p61****</code>. The statistics include the number of users, quota for users, number of groups, quota for groups, number of access configurations, quota for access configurations, number of access permissions that are assigned, number of system policies that can be configured for an access configuration, number of System for Cross-domain Identity Management (SCIM) credentials, number of asynchronous tasks, status of single sign-on (SSO) logon, and status of SCIM synchronization.</p>
     * 
     * @param request the request parameters of GetDirectoryStatistics  GetDirectoryStatisticsRequest
     * @return GetDirectoryStatisticsResponse
     */
    CompletableFuture<GetDirectoryStatisticsResponse> getDirectoryStatistics(GetDirectoryStatisticsRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the configurations of the SAML IdP within the directory <code>d-00fc2p61****</code>.</p>
     * 
     * @param request the request parameters of GetExternalSAMLIdentityProvider  GetExternalSAMLIdentityProviderRequest
     * @return GetExternalSAMLIdentityProviderResponse
     */
    CompletableFuture<GetExternalSAMLIdentityProviderResponse> getExternalSAMLIdentityProvider(GetExternalSAMLIdentityProviderRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the information about the group <code>g-00jqzghi2n3o5hkh****</code> in the directory <code>d-00fc2p61****</code>.</p>
     * 
     * @param request the request parameters of GetGroup  GetGroupRequest
     * @return GetGroupResponse
     */
    CompletableFuture<GetGroupResponse> getGroup(GetGroupRequest request);

    /**
     * @param request the request parameters of GetLoginPreference  GetLoginPreferenceRequest
     * @return GetLoginPreferenceResponse
     */
    CompletableFuture<GetLoginPreferenceResponse> getLoginPreference(GetLoginPreferenceRequest request);

    /**
     * <b>description</b> :
     * <p>If you enable username-password logon for CloudSSO users, you can also configure MFA for the users.
     * This topic provides an example on how to query the MFA setting of all CloudSSO users that belong to the directory named <code>00q8wbq42wiltcrk****</code>.</p>
     * 
     * @param request the request parameters of GetMFAAuthenticationSettingInfo  GetMFAAuthenticationSettingInfoRequest
     * @return GetMFAAuthenticationSettingInfoResponse
     */
    CompletableFuture<GetMFAAuthenticationSettingInfoResponse> getMFAAuthenticationSettingInfo(GetMFAAuthenticationSettingInfoRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation is no longer maintained and updated. You can call the <a href="https://help.aliyun.com/document_detail/611286.html">GetMFAAuthenticationSettingInfo</a> operation to query more detailed information.
     * This topic provides an example on how to query the MFA setting of the users that belong to the directory named <code>d-00fc2p61****</code>. The returned result shows that MFA is enabled for all the users.</p>
     * </blockquote>
     * 
     * @param request the request parameters of GetMFAAuthenticationSettings  GetMFAAuthenticationSettingsRequest
     * @return GetMFAAuthenticationSettingsResponse
     */
    CompletableFuture<GetMFAAuthenticationSettingsResponse> getMFAAuthenticationSettings(GetMFAAuthenticationSettingsRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to check whether MFA is enabled for users in the directory whose ID is <code>00fc2p61****</code>. The returned result shows that MFA is in the Enabled state.</p>
     * 
     * @param request the request parameters of GetMFAAuthenticationStatus  GetMFAAuthenticationStatusRequest
     * @return GetMFAAuthenticationStatusResponse
     */
    CompletableFuture<GetMFAAuthenticationStatusResponse> getMFAAuthenticationStatus(GetMFAAuthenticationStatusRequest request);

    /**
     * @param request the request parameters of GetPasswordPolicy  GetPasswordPolicyRequest
     * @return GetPasswordPolicyResponse
     */
    CompletableFuture<GetPasswordPolicyResponse> getPasswordPolicy(GetPasswordPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the status of SCIM synchronization within the directory <code>d-00fc2p61****</code>. The returned result shows that SCIM synchronization is in the Enabled state.</p>
     * 
     * @param request the request parameters of GetSCIMSynchronizationStatus  GetSCIMSynchronizationStatusRequest
     * @return GetSCIMSynchronizationStatusResponse
     */
    CompletableFuture<GetSCIMSynchronizationStatusResponse> getSCIMSynchronizationStatus(GetSCIMSynchronizationStatusRequest request);

    /**
     * @param request the request parameters of GetServiceStatus  GetServiceStatusRequest
     * @return GetServiceStatusResponse
     */
    CompletableFuture<GetServiceStatusResponse> getServiceStatus(GetServiceStatusRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the information about the task whose ID is <code>t-shfqw1u1edszvxw5****</code>.</p>
     * 
     * @param request the request parameters of GetTask  GetTaskRequest
     * @return GetTaskResponse
     */
    CompletableFuture<GetTaskResponse> getTask(GetTaskRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the GetTaskStatus operation to query the status of an asynchronous task. If you want to query more information about an asynchronous task, call the <a href="https://help.aliyun.com/document_detail/340670.html">GetTask</a> operation.
     * This topic provides an example on how to query the information about the task whose ID is <code>t-shfqw1u1edszvxw5****</code>.</p>
     * 
     * @param request the request parameters of GetTaskStatus  GetTaskStatusRequest
     * @return GetTaskStatusResponse
     */
    CompletableFuture<GetTaskStatusResponse> getTaskStatus(GetTaskStatusRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query information about the user whose ID is <code>u-00q8wbq42wiltcrk****</code> in the <code>d-00fc2p61****</code> directory.</p>
     * 
     * @param request the request parameters of GetUser  GetUserRequest
     * @return GetUserResponse
     */
    CompletableFuture<GetUserResponse> getUser(GetUserRequest request);

    /**
     * @param request the request parameters of GetUserId  GetUserIdRequest
     * @return GetUserIdResponse
     */
    CompletableFuture<GetUserIdResponse> getUserId(GetUserIdRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the MFA setting of the user named <code>u-00q8wbq42wiltcrk****</code>. The returned result shows that MFA is enabled for the user.</p>
     * 
     * @param request the request parameters of GetUserMFAAuthenticationSettings  GetUserMFAAuthenticationSettingsRequest
     * @return GetUserMFAAuthenticationSettingsResponse
     */
    CompletableFuture<GetUserMFAAuthenticationSettingsResponse> getUserMFAAuthenticationSettings(GetUserMFAAuthenticationSettingsRequest request);

    /**
     * @param request the request parameters of GetUserProvisioning  GetUserProvisioningRequest
     * @return GetUserProvisioningResponse
     */
    CompletableFuture<GetUserProvisioningResponse> getUserProvisioning(GetUserProvisioningRequest request);

    /**
     * @param request the request parameters of GetUserProvisioningConfiguration  GetUserProvisioningConfigurationRequest
     * @return GetUserProvisioningConfigurationResponse
     */
    CompletableFuture<GetUserProvisioningConfigurationResponse> getUserProvisioningConfiguration(GetUserProvisioningConfigurationRequest request);

    /**
     * @param request the request parameters of GetUserProvisioningEvent  GetUserProvisioningEventRequest
     * @return GetUserProvisioningEventResponse
     */
    CompletableFuture<GetUserProvisioningEventResponse> getUserProvisioningEvent(GetUserProvisioningEventRequest request);

    /**
     * @param request the request parameters of GetUserProvisioningRdAccountStatistics  GetUserProvisioningRdAccountStatisticsRequest
     * @return GetUserProvisioningRdAccountStatisticsResponse
     */
    CompletableFuture<GetUserProvisioningRdAccountStatisticsResponse> getUserProvisioningRdAccountStatistics(GetUserProvisioningRdAccountStatisticsRequest request);

    /**
     * @param request the request parameters of GetUserProvisioningStatistics  GetUserProvisioningStatisticsRequest
     * @return GetUserProvisioningStatisticsResponse
     */
    CompletableFuture<GetUserProvisioningStatisticsResponse> getUserProvisioningStatistics(GetUserProvisioningStatisticsRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the assigned access permissions on the account <code>114240524784****</code> in your resource directory. The returned result shows that access permissions on the account in your resource directory is assigned to one user.</p>
     * 
     * @param request the request parameters of ListAccessAssignments  ListAccessAssignmentsRequest
     * @return ListAccessAssignmentsResponse
     */
    CompletableFuture<ListAccessAssignmentsResponse> listAccessAssignments(ListAccessAssignmentsRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the accounts for which the access permission <code>ac-00ccule7tadaijxc****</code> is provisioned. The returned result shows that the access configuration is provisioned for two accounts in your resource directory.</p>
     * 
     * @param request the request parameters of ListAccessConfigurationProvisionings  ListAccessConfigurationProvisioningsRequest
     * @return ListAccessConfigurationProvisioningsResponse
     */
    CompletableFuture<ListAccessConfigurationProvisioningsResponse> listAccessConfigurationProvisionings(ListAccessConfigurationProvisioningsRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the access configurations within the directory <code>d-00fc2p61****</code>. The returned result shows that the directory contains the <code>VPC-Admin</code> and <code>ECS-Admin</code> access configurations.</p>
     * 
     * @param request the request parameters of ListAccessConfigurations  ListAccessConfigurationsRequest
     * @return ListAccessConfigurationsResponse
     */
    CompletableFuture<ListAccessConfigurationsResponse> listAccessConfigurations(ListAccessConfigurationsRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the directories within your Alibaba Cloud account. The returned result shows that only one directory with the ID <code>d-00fc2p61****</code> is created within your Alibaba Cloud account.</p>
     * 
     * @param request the request parameters of ListDirectories  ListDirectoriesRequest
     * @return ListDirectoriesResponse
     */
    CompletableFuture<ListDirectoriesResponse> listDirectories(ListDirectoriesRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the SAML signing certificates within the directory <code>d-00fc2p61****</code>. The returned result shows that the directory contains one SAML signing certificate.</p>
     * 
     * @param request the request parameters of ListExternalSAMLIdPCertificates  ListExternalSAMLIdPCertificatesRequest
     * @return ListExternalSAMLIdPCertificatesResponse
     */
    CompletableFuture<ListExternalSAMLIdPCertificatesResponse> listExternalSAMLIdPCertificates(ListExternalSAMLIdPCertificatesRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the users in the group <code>g-00jqzghi2n3o5hkh****</code>. The returned result shows that the group contains the user <code>Alice</code> and the user <code>user1</code>.</p>
     * 
     * @param request the request parameters of ListGroupMembers  ListGroupMembersRequest
     * @return ListGroupMembersResponse
     */
    CompletableFuture<ListGroupMembersResponse> listGroupMembers(ListGroupMembersRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the groups in the directory <code>d-00fc2p61****</code>. The returned result shows that the directory contains three groups. The groups <code>group1</code> and <code>group2</code> are synchronized from an external identity provider (IdP). The group <code>TestGroup</code> is manually created in CloudSSO.</p>
     * 
     * @param request the request parameters of ListGroups  ListGroupsRequest
     * @return ListGroupsResponse
     */
    CompletableFuture<ListGroupsResponse> listGroups(ListGroupsRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the groups to which the user <code>u-00q8wbq42wiltcrk****</code> is added. The returned result shows that the user is added to both the <code>TestGroup</code> and the <code>group1</code> groups.</p>
     * 
     * @param request the request parameters of ListJoinedGroupsForUser  ListJoinedGroupsForUserRequest
     * @return ListJoinedGroupsForUserResponse
     */
    CompletableFuture<ListJoinedGroupsForUserResponse> listJoinedGroupsForUser(ListJoinedGroupsForUserRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the MFA devices that are bound to the user <code>u-00q8wbq42wiltcrk****</code>. The returned result shows that the MFA device named <code>Alice-MFA1</code> is bound to the user.</p>
     * 
     * @param request the request parameters of ListMFADevicesForUser  ListMFADevicesForUserRequest
     * @return ListMFADevicesForUserResponse
     */
    CompletableFuture<ListMFADevicesForUserResponse> listMFADevicesForUser(ListMFADevicesForUserRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the policies that are created for the access configuration <code>ac-00jhtfl8thteu6uj****</code>. The returned result shows that the access configuration contains one system policy and one inline policy.</p>
     * 
     * @param request the request parameters of ListPermissionPoliciesInAccessConfiguration  ListPermissionPoliciesInAccessConfigurationRequest
     * @return ListPermissionPoliciesInAccessConfigurationResponse
     */
    CompletableFuture<ListPermissionPoliciesInAccessConfigurationResponse> listPermissionPoliciesInAccessConfiguration(ListPermissionPoliciesInAccessConfigurationRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the SCIM credentials within the <code>d-00fc2p61****</code> directory.</p>
     * 
     * @param request the request parameters of ListSCIMServerCredentials  ListSCIMServerCredentialsRequest
     * @return ListSCIMServerCredentialsResponse
     */
    CompletableFuture<ListSCIMServerCredentialsResponse> listSCIMServerCredentials(ListSCIMServerCredentialsRequest request);

    /**
     * <b>description</b> :
     * <p>By default, this operation queries the tasks within the previous 24 hours. This operation allows you to query the tasks within a maximum of 7 days. You can specify the start time of the query by using <code>Filter</code>.
     * This topic provides an example on how to query the tasks within the previous 24 hours.</p>
     * 
     * @param request the request parameters of ListTasks  ListTasksRequest
     * @return ListTasksResponse
     */
    CompletableFuture<ListTasksResponse> listTasks(ListTasksRequest request);

    /**
     * @param request the request parameters of ListUserProvisioningEvents  ListUserProvisioningEventsRequest
     * @return ListUserProvisioningEventsResponse
     */
    CompletableFuture<ListUserProvisioningEventsResponse> listUserProvisioningEvents(ListUserProvisioningEventsRequest request);

    /**
     * @param request the request parameters of ListUserProvisionings  ListUserProvisioningsRequest
     * @return ListUserProvisioningsResponse
     */
    CompletableFuture<ListUserProvisioningsResponse> listUserProvisionings(ListUserProvisioningsRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query users in the <code>d-00fc2p61****</code> directory. The returned result shows that the directory contains two users. The user <code>AliceLee</code> is synchronized from an external identity provider (IdP). The user <code>user1</code> is manually created within CloudSSO.</p>
     * 
     * @param request the request parameters of ListUsers  ListUsersRequest
     * @return ListUsersResponse
     */
    CompletableFuture<ListUsersResponse> listUsers(ListUsersRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation, an asynchronous task is automatically created. You can call the <a href="https://help.aliyun.com/document_detail/340670.html">GetTask</a> operation to query the progress of the task based on the value of the <code>TaskId</code> response parameter.
     * This topic provides an example on how to provision the access configuration <code>ac-00jhtfl8thteu6uj****</code> for the account <code>114240524784****</code> in your resource directory.</p>
     * 
     * @param request the request parameters of ProvisionAccessConfiguration  ProvisionAccessConfigurationRequest
     * @return ProvisionAccessConfigurationResponse
     */
    CompletableFuture<ProvisionAccessConfigurationResponse> provisionAccessConfiguration(ProvisionAccessConfigurationRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to remove the SAML signing certificate whose ID is <code>idp-c-00dt9gnl7fmjaw9c****</code>.</p>
     * 
     * @param request the request parameters of RemoveExternalSAMLIdPCertificate  RemoveExternalSAMLIdPCertificateRequest
     * @return RemoveExternalSAMLIdPCertificateResponse
     */
    CompletableFuture<RemoveExternalSAMLIdPCertificateResponse> removeExternalSAMLIdPCertificate(RemoveExternalSAMLIdPCertificateRequest request);

    /**
     * <b>description</b> :
     * <p>After you remove an inline policy from an access configuration, the policy cannot be restored.
     * This topic provides an example on how to remove the system policy <code>AliyunECSFullAccess</code> from the access configuration <code>ac-00jhtfl8thteu6uj****</code>.</p>
     * 
     * @param request the request parameters of RemovePermissionPolicyFromAccessConfiguration  RemovePermissionPolicyFromAccessConfigurationRequest
     * @return RemovePermissionPolicyFromAccessConfigurationResponse
     */
    CompletableFuture<RemovePermissionPolicyFromAccessConfigurationResponse> removePermissionPolicyFromAccessConfiguration(RemovePermissionPolicyFromAccessConfigurationRequest request);

    /**
     * <b>description</b> :
     * <p>If System for Cross-domain Identity Management (SCIM) synchronization is enabled, you cannot remove a user from a group that is synchronized by using SCIM.<br>This topic provides an example on how to remove the user <code>u-00q8wbq42wiltcrk****</code> from the group <code>g-00jqzghi2n3o5hkh****</code>.</p>
     * 
     * @param request the request parameters of RemoveUserFromGroup  RemoveUserFromGroupRequest
     * @return RemoveUserFromGroupResponse
     */
    CompletableFuture<RemoveUserFromGroupResponse> removeUserFromGroup(RemoveUserFromGroupRequest request);

    /**
     * <b>description</b> :
     * <p>If you forget your password or your password expires or is at risk, you must contact a CloudSSO administrator to reset your password.</p>
     * <blockquote>
     * <p> After you enable SSO logon, your password cannot be reset.
     * This topic provides an example on how to reset the password of the user <code>u-00q8wbq42wiltcrk****</code>. The new password is automatically generated by the system.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ResetUserPassword  ResetUserPasswordRequest
     * @return ResetUserPasswordResponse
     */
    CompletableFuture<ResetUserPasswordResponse> resetUserPassword(ResetUserPasswordRequest request);

    /**
     * @param request the request parameters of RetryUserProvisioningEvent  RetryUserProvisioningEventRequest
     * @return RetryUserProvisioningEventResponse
     */
    CompletableFuture<RetryUserProvisioningEventResponse> retryUserProvisioningEvent(RetryUserProvisioningEventRequest request);

    /**
     * <b>description</b> :
     * <p>During SAML 2.0-based single sign-on (SSO) logon, CloudSSO is an SP, and the identity management system of an enterprise is an IdP.
     * You can use one of the following methods to configure a SAML IdP. You can obtain the required metadata file or parameter values from your IdP.</p>
     * <ul>
     * <li>Use the metadata file. You can specify the <code>EncodedMetadataDocument</code> parameter to upload the metadata file.</li>
     * <li>Manually configure the IdP. You can manually specify the following parameters for your IdP: <code>EntityId</code>, <code>LoginUrl</code>, <code>WantRequestSigned</code>, and <code>X509Certificate</code>.
     * If you have configured a SAML IdP, the existing configurations are replaced after you call this operation.</li>
     * <li>If the IdP is configured by using the metadata file, all existing configurations are replaced with new configurations.</li>
     * <li>If the IdP is manually configured, the original parameter values that are different from the new parameter values are replaced.<blockquote>
     * <p> If SSO logon is enabled, new configurations immediately take effect. Take note of the impacts on the production environment.
     * This topic provides an example on how to configure an IdP by using the metadata file within the directory <code>d-00fc2p61****</code>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of SetExternalSAMLIdentityProvider  SetExternalSAMLIdentityProviderRequest
     * @return SetExternalSAMLIdentityProviderResponse
     */
    CompletableFuture<SetExternalSAMLIdentityProviderResponse> setExternalSAMLIdentityProvider(SetExternalSAMLIdentityProviderRequest request);

    /**
     * @param request the request parameters of SetLoginPreference  SetLoginPreferenceRequest
     * @return SetLoginPreferenceResponse
     */
    CompletableFuture<SetLoginPreferenceResponse> setLoginPreference(SetLoginPreferenceRequest request);

    /**
     * <b>description</b> :
     * <p>If a CloudSSO administrator enables username-password logon for users, CloudSSO automatically enables MFA to improve security. The administrator can call this operation to enable or disable MFA based on the business requirements.
     * This topic provides an example on how to enable MFA for users.</p>
     * 
     * @param request the request parameters of SetMFAAuthenticationStatus  SetMFAAuthenticationStatusRequest
     * @return SetMFAAuthenticationStatusResponse
     */
    CompletableFuture<SetMFAAuthenticationStatusResponse> setMFAAuthenticationStatus(SetMFAAuthenticationStatusRequest request);

    /**
     * @param request the request parameters of SetPasswordPolicy  SetPasswordPolicyRequest
     * @return SetPasswordPolicyResponse
     */
    CompletableFuture<SetPasswordPolicyResponse> setPasswordPolicy(SetPasswordPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>You can synchronize users or groups from an external identity provider (IdP) that supports SCIM 2.0 to CloudSSO only after SCIM synchronization is enabled. If you disable SCIM synchronization, you can no longer synchronize users or groups to CloudSSO. The following list describes the impacts after SCIM synchronization is enabled or disabled:</p>
     * <ul>
     * <li>After you enable SCIM synchronization, you cannot modify or delete the users or groups that are synchronized to CloudSSO by using SCIM. In addition, you cannot add users to or remove users from the groups. However, you can change the passwords of the users and enable or disable the logon of the users.</li>
     * <li>After you disable SCIM synchronization, you can modify and delete the users and groups that are synchronized to CloudSSO by using SCIM. You can also add users to or remove users from the groups.
     * This topic provides an example on how to enable SCIM synchronization within the directory <code>d-00fc2p61****</code>.</li>
     * </ul>
     * 
     * @param request the request parameters of SetSCIMSynchronizationStatus  SetSCIMSynchronizationStatusRequest
     * @return SetSCIMSynchronizationStatusResponse
     */
    CompletableFuture<SetSCIMSynchronizationStatusResponse> setSCIMSynchronizationStatus(SetSCIMSynchronizationStatusRequest request);

    /**
     * <b>description</b> :
     * <p>You can modify the <code>Description</code>, <code>SessionDuration</code>, and <code>RelayState</code> parameters for an access configuration.
     * This topic provides an example on how to change the initial web page in the access configuration <code>ac-00jhtfl8thteu6uj****</code> to <code>https://cloudsso.console.aliyun.com</code>.</p>
     * 
     * @param request the request parameters of UpdateAccessConfiguration  UpdateAccessConfigurationRequest
     * @return UpdateAccessConfigurationResponse
     */
    CompletableFuture<UpdateAccessConfigurationResponse> updateAccessConfiguration(UpdateAccessConfigurationRequest request);

    /**
     * <b>description</b> :
     * <p>After you change the name of a directory, the URL that is used to log on to the Cloud SSO user portal is changed. You must notify the Cloud SSO users of the correct URL. 
     * This topic provides an example on how to change the name of a directory to <code>new-example</code>.</p>
     * 
     * @param request the request parameters of UpdateDirectory  UpdateDirectoryRequest
     * @return UpdateDirectoryResponse
     */
    CompletableFuture<UpdateDirectoryResponse> updateDirectory(UpdateDirectoryRequest request);

    /**
     * <b>description</b> :
     * <p>You can modify <code>GroupName</code> and <code>Description</code> for a group.</p>
     * <blockquote>
     * <p> If System for Cross-domain Identity Management (SCIM) synchronization is enabled, you cannot modify the information about a group that is synchronized by using SCIM.
     * This topic provides an example on how to change the name of the group <code>g-00jqzghi2n3o5hkh****</code> to <code>NewTestGroup</code>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UpdateGroup  UpdateGroupRequest
     * @return UpdateGroupResponse
     */
    CompletableFuture<UpdateGroupResponse> updateGroup(UpdateGroupRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to modify an inline policy that is created for the access configuration <code>ac-00jhtfl8thteu6uj****</code>.</p>
     * 
     * @param request the request parameters of UpdateInlinePolicyForAccessConfiguration  UpdateInlinePolicyForAccessConfigurationRequest
     * @return UpdateInlinePolicyForAccessConfigurationResponse
     */
    CompletableFuture<UpdateInlinePolicyForAccessConfigurationResponse> updateInlinePolicyForAccessConfiguration(UpdateInlinePolicyForAccessConfigurationRequest request);

    /**
     * <b>description</b> :
     * <p>If you enable username-password logon for CloudSSO users, you can also configure MFA for the users.
     * This topic provides an example on how to enable MFA for all CloudSSO users that belong to the directory named <code>d-00fc2p61****</code>.</p>
     * 
     * @param request the request parameters of UpdateMFAAuthenticationSettings  UpdateMFAAuthenticationSettingsRequest
     * @return UpdateMFAAuthenticationSettingsResponse
     */
    CompletableFuture<UpdateMFAAuthenticationSettingsResponse> updateMFAAuthenticationSettings(UpdateMFAAuthenticationSettingsRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to disable the SCIM credential whose ID is <code>scimcred-004whl0kvfwcypbi****</code>. After the SCIM credential is disabled, the synchronization task that uses the SCIM credential fails. You can call this operation again to enable the SCIM credential.</p>
     * 
     * @param request the request parameters of UpdateSCIMServerCredentialStatus  UpdateSCIMServerCredentialStatusRequest
     * @return UpdateSCIMServerCredentialStatusResponse
     */
    CompletableFuture<UpdateSCIMServerCredentialStatusResponse> updateSCIMServerCredentialStatus(UpdateSCIMServerCredentialStatusRequest request);

    /**
     * <b>description</b> :
     * <p>You can modify <code>FirstName</code>, <code>LastName</code>, <code>DisplayName</code>, <code>Email</code>, and <code>Description</code> for a user. You cannot modify <code>UserName</code> for a user.</p>
     * <blockquote>
     * <p> If System for Cross-domain Identity Management (SCIM) synchronization is enabled, you cannot modify the information about a user that is synchronized by using SCIM.
     * This topic provides an example on how to change the email address of the user whose ID is <code>u-00q8wbq42wiltcrk****</code> to <code>AliceLee@example.com</code>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UpdateUser  UpdateUserRequest
     * @return UpdateUserResponse
     */
    CompletableFuture<UpdateUserResponse> updateUser(UpdateUserRequest request);

    /**
     * <b>description</b> :
     * <p>If you call the <a href="https://help.aliyun.com/document_detail/450134.html">UpdateMFAAuthenticationSettings</a> operation to set the MFAAuthenticationSettings parameter to <code>Byuser</code>, user-specific settings are applied. Then, you must call the UpdateUserMFAAuthenticationSettings operation to configure MFA for each user.
     * By default, the MFAAuthenticationSettings parameter is set to <code>Enabled</code> for a new user.
     * This topic provides an example on how to enable MFA for the user named <code>u-00q8wbq42wiltcrk****</code>.</p>
     * 
     * @param request the request parameters of UpdateUserMFAAuthenticationSettings  UpdateUserMFAAuthenticationSettingsRequest
     * @return UpdateUserMFAAuthenticationSettingsResponse
     */
    CompletableFuture<UpdateUserMFAAuthenticationSettingsResponse> updateUserMFAAuthenticationSettings(UpdateUserMFAAuthenticationSettingsRequest request);

    /**
     * @param request the request parameters of UpdateUserProvisioning  UpdateUserProvisioningRequest
     * @return UpdateUserProvisioningResponse
     */
    CompletableFuture<UpdateUserProvisioningResponse> updateUserProvisioning(UpdateUserProvisioningRequest request);

    /**
     * @param request the request parameters of UpdateUserProvisioningConfiguration  UpdateUserProvisioningConfigurationRequest
     * @return UpdateUserProvisioningConfigurationResponse
     */
    CompletableFuture<UpdateUserProvisioningConfigurationResponse> updateUserProvisioningConfiguration(UpdateUserProvisioningConfigurationRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to change the status of the user whose ID is <code>u-00q8wbq42wiltcrk****</code> to Disabled. Users in the Disabled state cannot log on to the CloudSSO user portal.</p>
     * 
     * @param request the request parameters of UpdateUserStatus  UpdateUserStatusRequest
     * @return UpdateUserStatusResponse
     */
    CompletableFuture<UpdateUserStatusResponse> updateUserStatus(UpdateUserStatusRequest request);

}
