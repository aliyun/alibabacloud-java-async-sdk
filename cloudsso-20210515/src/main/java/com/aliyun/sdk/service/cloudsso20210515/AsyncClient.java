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
      * You can add up to two SAML signing certificates.
      * This topic provides an example on how to add a SAML signing certificate to the directory `d-00fc2p61****`.
      *
     */
    CompletableFuture<AddExternalSAMLIdPCertificateResponse> addExternalSAMLIdPCertificate(AddExternalSAMLIdPCertificateRequest request);

    /**
      * This topic provides an example on how to add the system policy `AliyunECSFullAccess` to the access configuration `ac-00jhtfl8thteu6uj****`.
      *
     */
    CompletableFuture<AddPermissionPolicyToAccessConfigurationResponse> addPermissionPolicyToAccessConfiguration(AddPermissionPolicyToAccessConfigurationRequest request);

    /**
      * If System for Cross-domain Identity Management (SCIM) synchronization is enabled, you cannot add a user to a group that is synchronized by using SCIM.
      * This topic provides an example of how to add the user `u-00q8wbq42wiltcrk****` to the group `g-00jqzghi2n3o5hkh****`.
      *
     */
    CompletableFuture<AddUserToGroupResponse> addUserToGroup(AddUserToGroupRequest request);

    /**
      * If single sign-on (SSO) logon is disabled, you can clear the configurations of a SAML IdP. If SSO logon is enabled, you cannot clear the configurations.
      * This topic provides an example on how to clear the configurations of the SAML IdP within the directory `d-00fc2p61****`.
      *
     */
    CompletableFuture<ClearExternalSAMLIdentityProviderResponse> clearExternalSAMLIdentityProvider(ClearExternalSAMLIdentityProviderRequest request);

    /**
      * When you call this operation, an asynchronous task is created. You can call the [GetTask](~~340670~~) operation to query the progress of the task based on the value of the `TaskId` response parameter.
      * For more information about how to assign permissions on an account in your resource directory, see [Overview of multi-account authorization](~~266726~~).
      * This topic provides an example on how to assign access permissions on the account `114240524784****` in your resource directory to the CloudSSO user `u-00q8wbq42wiltcrk****` by using the access configuration `ac-00jhtfl8thteu6uj****`. After the call is successful, the CloudSSO user can access resources within the account in the resource directory.
      *
     */
    CompletableFuture<CreateAccessAssignmentResponse> createAccessAssignment(CreateAccessAssignmentRequest request);

    /**
      * For more information about access configurations, see [Overview of access configurations](~~266737~~).
      * This topic provides an example on how to create an access configuration named `ECS-Admin`.
      *
     */
    CompletableFuture<CreateAccessConfigurationResponse> createAccessConfiguration(CreateAccessConfigurationRequest request);

    /**
      * A directory is a CloudSSO instance. Before you can use CloudSSO, you must create a directory. The directory is used to manage all CloudSSO resources.
      * To create a directory, you must select a region. Alibaba Cloud stores data in the directory only in the region that you select. However, you can deploy Alibaba Cloud resources including Elastic Compute Service (ECS) instances and ApsaraDB RDS instances in other regions. You can also use your cloud account for logons and access the Alibaba Cloud resources in other regions. You can select a region to create a directory based on your security compliance requirements and the geographic location of specific users. If you do not have strict security compliance requirements, we recommend that you select a region that is the closest to the geographical location of the specific users. This way, access to cloud resources is accelerated. You can create the CloudSSO directory in the China (Shanghai), China (Hong Kong), US (Silicon Valley), or Germany (Frankfurt) region.
      * This topic provides an example on how to create a directory named `example` in the China (Shanghai) region.
      * ## Limits
      * - You can create only one directory for a management account.
      * - If you want to change the region of a directory, you must delete the directory and then create a directory in a different region.
      *
     */
    CompletableFuture<CreateDirectoryResponse> createDirectory(CreateDirectoryRequest request);

    /**
      * This topic provides an example on how to create a group named `TestGroup`.
      *
     */
    CompletableFuture<CreateGroupResponse> createGroup(CreateGroupRequest request);

    /**
      * SCIM credentials are required for SCIM synchronization. You can create up to two SCIM credentials.
      * This topic provides an example on how to create a SCIM credential within the directory `d-00fc2p61****`.
      *
     */
    CompletableFuture<CreateSCIMServerCredentialResponse> createSCIMServerCredential(CreateSCIMServerCredentialRequest request);

    /**
      * This topic provides an example on how to create a user named `Alice`.
      *
     */
    CompletableFuture<CreateUserResponse> createUser(CreateUserRequest request);

    CompletableFuture<CreateUserProvisioningResponse> createUserProvisioning(CreateUserProvisioningRequest request);

    /**
      * When you call this operation, an asynchronous task is created. You can call the [GetTask](~~340670~~) operation to query the progress of the task based on the value of the `TaskId` response parameter.
      * This topic provides an example on how to remove the access permissions on the account `114240524784****` in the resource directory from the CloudSSO user `u-00q8wbq42wiltcrk****`. The access permissions are assigned by using the access configuration `ac-00jhtfl8thteu6uj****`.
      *
     */
    CompletableFuture<DeleteAccessAssignmentResponse> deleteAccessAssignment(DeleteAccessAssignmentRequest request);

    /**
      * This topic provides an example on how to delete the access configuration whose ID is `ac-001j9mcm3k7335bc****`.
      * ## Prerequisites
      * The access configuration that you want to delete is de-provisioned from the accounts in your resource directory. For more information, see [DeprovisionAccessConfiguration](~~338352~~).
      *
     */
    CompletableFuture<DeleteAccessConfigurationResponse> deleteAccessConfiguration(DeleteAccessConfigurationRequest request);

    /**
      * This topic provides an example on how to delete a directory whose ID is `d-00fc2p61****`.
      * ## Prerequisites
      * No resources are contained in the directory that you want to delete.
      * *   Access permissions on the accounts in your resource directory are removed from all users and groups. For more information, see [DeleteAccessAssignment](~~338350~~).
      * *   Users are deleted. For more information, see [DeleteUser](~~341671~~).
      * *   Groups are deleted. For more information, see [DeleteGroup](~~341821~~).
      * *   Access configurations are deleted. For more information, see [DeleteAccessConfiguration](~~336907~~).
      * *   System for Cross-domain Identity Management (SCIM) credentials are deleted. For more information, see [DeleteSCIMServerCredential](~~341842~~).
      * *   SSO logon configurations are deleted. For more information, see [ClearExternalSAMLIdentityProvider](~~341573~~).
      *
     */
    CompletableFuture<DeleteDirectoryResponse> deleteDirectory(DeleteDirectoryRequest request);

    /**
      * If System for Cross-domain Identity Management (SCIM) synchronization is enabled, you cannot delete a group that is synchronized by using SCIM.
      * ## Prerequisites
      * The group that you want to delete is not associated with the following resources. If the group is associated with the resources, the deletion fails.
      * *   Users: You must remove users from the group. For more information, see [RemoveUserFromGroup](~~335116~~).
      * *   Access permissions: You must remove the access permissions on the accounts in your resource directory from the group. For more information, see [DeleteAccessAssignment](~~338350~~).
      *
     */
    CompletableFuture<DeleteGroupResponse> deleteGroup(DeleteGroupRequest request);

    /**
      * This topic provides an example on how to unbind the MFA device `mfa-00ujhet8pycljj7j****` from the user `u-00q8wbq42wiltcrk****`.
      *
     */
    CompletableFuture<DeleteMFADeviceForUserResponse> deleteMFADeviceForUser(DeleteMFADeviceForUserRequest request);

    /**
      * After a SCIM credential is deleted, the synchronization task that uses the SCIM credential fails.
      * This topic provides an example on how to delete the SCIM credential whose ID is `scimcred-004whl0kvfwcypbi****`.
      *
     */
    CompletableFuture<DeleteSCIMServerCredentialResponse> deleteSCIMServerCredential(DeleteSCIMServerCredentialRequest request);

    /**
      * If System for Cross-domain Identity Management (SCIM) synchronization is enabled, you cannot delete a user that is synchronized by using SCIM.
      * ## Prerequisites
      * The user that you want to delete is not associated with the following resources. If the user is associated with the resources, the deletion fails.
      * *   Multi-factor authentication (MFA) devices: You must unbind the MFA devices from the user. For more information, see [DeleteMFADeviceForUser](~~341675~~).
      * *   Access permissions: You must remove the access permissions on the accounts in your resource directory from the user. For more information, see [DeleteAccessAssignment](~~338350~~).
      * *   Groups: You must remove the user from groups. For more information, see [RemoveUserFromGroup](~~335116~~).
      *
     */
    CompletableFuture<DeleteUserResponse> deleteUser(DeleteUserRequest request);

    CompletableFuture<DeleteUserProvisioningResponse> deleteUserProvisioning(DeleteUserProvisioningRequest request);

    CompletableFuture<DeleteUserProvisioningEventResponse> deleteUserProvisioningEvent(DeleteUserProvisioningEventRequest request);

    /**
      * When you call this operation, an asynchronous task is automatically created. You can call the [GetTask](~~340670~~) operation to query the progress of the task based on the value of the `TaskId` response parameter.
      * This topic provides an example on how to de-provision the access configuration `ac-00jhtfl8thteu6uj****` from the account `114240524784****` in your resource directory.
      *
     */
    CompletableFuture<DeprovisionAccessConfigurationResponse> deprovisionAccessConfiguration(DeprovisionAccessConfigurationRequest request);

    /**
      * If your CloudSSO has no directory, you can disable CloudSSO based on your business requirements. After you disable CloudSSO, you can enable it at any time.
      *
     */
    CompletableFuture<DisableServiceResponse> disableService(DisableServiceRequest request);

    /**
      * You can call this operation only if your account belongs to the management account that is used to enable a resource directory and has permissions to enable CloudSSO. For more information, see [Enable CloudSSO](~~262819~~).
      * If you call this operation, you agree to the [Alibaba Cloud International Website Product Terms of Service](https://www.alibabacloud.com/help/doc-detail/42416.htm).
      *
     */
    CompletableFuture<EnableServiceResponse> enableService(EnableServiceRequest request);

    /**
      * This topic provides an example on how to query the information about the access configuration whose ID is `ac-00ccule7tadaijxc****`.
      *
     */
    CompletableFuture<GetAccessConfigurationResponse> getAccessConfiguration(GetAccessConfigurationRequest request);

    /**
      * This topic provides an example on how to query information about the directory whose ID is `d-00fc2p61****`.
      *
     */
    CompletableFuture<GetDirectoryResponse> getDirectory(GetDirectoryRequest request);

    /**
      * During SAML 2.0-based single sign-on (SSO) logon, CloudSSO is an SP, and the identity management system of an enterprise is an identity provider (IdP).
      * This topic provides an example on how to query the information about the SP within the directory `d-00fc2p61****`.
      *
     */
    CompletableFuture<GetDirectorySAMLServiceProviderInfoResponse> getDirectorySAMLServiceProviderInfo(GetDirectorySAMLServiceProviderInfoRequest request);

    /**
      * ### [](#)
      * This topic provides an example on how to query the statistics of a directory whose ID is `d-00fc2p61****`. The statistics include the number of users, quota for users, number of groups, quota for groups, number of access configurations, quota for access configurations, quota for system policies that can be configured for an access configuration, number of access permissions that are assigned, number of System for Cross-domain Identity Management (SCIM) credentials, number of asynchronous tasks, status of single sign-on (SSO), and status of SCIM synchronization.
      * ### [](#qps)Limit
      * You can call this operation up to 100 times per second per account. This operation is globally limited to 100 times per second across all accounts. If the number of the calls per second exceeds a limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limits when you call this operation.
      *
     */
    CompletableFuture<GetDirectoryStatisticsResponse> getDirectoryStatistics(GetDirectoryStatisticsRequest request);

    /**
      * This topic provides an example on how to query the configurations of the SAML IdP within the directory `d-00fc2p61****`.
      *
     */
    CompletableFuture<GetExternalSAMLIdentityProviderResponse> getExternalSAMLIdentityProvider(GetExternalSAMLIdentityProviderRequest request);

    /**
      * This topic provides an example on how to query the information about the group `g-00jqzghi2n3o5hkh****` in the directory `d-00fc2p61****`.
      *
     */
    CompletableFuture<GetGroupResponse> getGroup(GetGroupRequest request);

    CompletableFuture<GetLoginPreferenceResponse> getLoginPreference(GetLoginPreferenceRequest request);

    /**
      * If you enable username-password logon for CloudSSO users, you can also configure MFA for the users.
      * This topic provides an example on how to query the MFA setting of all CloudSSO users that belong to the directory named `00q8wbq42wiltcrk****`.
      *
     */
    CompletableFuture<GetMFAAuthenticationSettingInfoResponse> getMFAAuthenticationSettingInfo(GetMFAAuthenticationSettingInfoRequest request);

    /**
      * > This operation is no longer maintained and updated. You can call the [GetMFAAuthenticationSettingInfo](~~611286~~) operation to query more detailed information.
      * This topic provides an example on how to query the MFA setting of the users that belong to the directory named `d-00fc2p61****`. The returned result shows that MFA is enabled for all the users.
      *
     */
    CompletableFuture<GetMFAAuthenticationSettingsResponse> getMFAAuthenticationSettings(GetMFAAuthenticationSettingsRequest request);

    /**
      * This topic provides an example on how to check whether MFA is enabled for users in the directory whose ID is `00fc2p61****`. The returned result shows that MFA is in the Enabled state.
      *
     */
    CompletableFuture<GetMFAAuthenticationStatusResponse> getMFAAuthenticationStatus(GetMFAAuthenticationStatusRequest request);

    CompletableFuture<GetPasswordPolicyResponse> getPasswordPolicy(GetPasswordPolicyRequest request);

    /**
      * This topic provides an example on how to query the status of SCIM synchronization within the directory `d-00fc2p61****`. The returned result shows that SCIM synchronization is in the Enabled state.
      *
     */
    CompletableFuture<GetSCIMSynchronizationStatusResponse> getSCIMSynchronizationStatus(GetSCIMSynchronizationStatusRequest request);

    CompletableFuture<GetServiceStatusResponse> getServiceStatus(GetServiceStatusRequest request);

    /**
      * This topic provides an example on how to query the information about the task whose ID is `t-shfqw1u1edszvxw5****`.
      *
     */
    CompletableFuture<GetTaskResponse> getTask(GetTaskRequest request);

    /**
      * You can call the GetTaskStatus operation to query the status of an asynchronous task. If you want to query more information about an asynchronous task, call the [GetTask](~~340670~~) operation.
      * This topic provides an example on how to query the information about the task whose ID is `t-shfqw1u1edszvxw5****`.
      *
     */
    CompletableFuture<GetTaskStatusResponse> getTaskStatus(GetTaskStatusRequest request);

    /**
      * This topic provides an example on how to query information about the user whose ID is `u-00q8wbq42wiltcrk****` in the `d-00fc2p61****` directory.
      *
     */
    CompletableFuture<GetUserResponse> getUser(GetUserRequest request);

    CompletableFuture<GetUserIdResponse> getUserId(GetUserIdRequest request);

    /**
      * This topic provides an example on how to query the MFA setting of the user named `u-00q8wbq42wiltcrk****`. The returned result shows that MFA is enabled for the user.
      *
     */
    CompletableFuture<GetUserMFAAuthenticationSettingsResponse> getUserMFAAuthenticationSettings(GetUserMFAAuthenticationSettingsRequest request);

    CompletableFuture<GetUserProvisioningResponse> getUserProvisioning(GetUserProvisioningRequest request);

    CompletableFuture<GetUserProvisioningConfigurationResponse> getUserProvisioningConfiguration(GetUserProvisioningConfigurationRequest request);

    CompletableFuture<GetUserProvisioningEventResponse> getUserProvisioningEvent(GetUserProvisioningEventRequest request);

    CompletableFuture<GetUserProvisioningRdAccountStatisticsResponse> getUserProvisioningRdAccountStatistics(GetUserProvisioningRdAccountStatisticsRequest request);

    CompletableFuture<GetUserProvisioningStatisticsResponse> getUserProvisioningStatistics(GetUserProvisioningStatisticsRequest request);

    /**
      * This topic provides an example on how to query the assigned access permissions on the account `114240524784****` in your resource directory. The returned result shows that access permissions on the account in your resource directory is assigned to one user.
      *
     */
    CompletableFuture<ListAccessAssignmentsResponse> listAccessAssignments(ListAccessAssignmentsRequest request);

    /**
      * This topic provides an example on how to query the accounts for which the access permission `ac-00ccule7tadaijxc****` is provisioned. The returned result shows that the access configuration is provisioned for two accounts in your resource directory.
      *
     */
    CompletableFuture<ListAccessConfigurationProvisioningsResponse> listAccessConfigurationProvisionings(ListAccessConfigurationProvisioningsRequest request);

    /**
      * This topic provides an example on how to query the access configurations within the directory `d-00fc2p61****`. The returned result shows that the directory contains the `VPC-Admin` and `ECS-Admin` access configurations.
      *
     */
    CompletableFuture<ListAccessConfigurationsResponse> listAccessConfigurations(ListAccessConfigurationsRequest request);

    /**
      * This topic provides an example on how to query the directories within your Alibaba Cloud account. The returned result shows that only one directory with the ID `d-00fc2p61****` is created within your Alibaba Cloud account.
      *
     */
    CompletableFuture<ListDirectoriesResponse> listDirectories(ListDirectoriesRequest request);

    /**
      * This topic provides an example on how to query the SAML signing certificates within the directory `d-00fc2p61****`. The returned result shows that the directory contains one SAML signing certificate.
      *
     */
    CompletableFuture<ListExternalSAMLIdPCertificatesResponse> listExternalSAMLIdPCertificates(ListExternalSAMLIdPCertificatesRequest request);

    /**
      * This topic provides an example on how to query the users in the group `g-00jqzghi2n3o5hkh****`. The returned result shows that the group contains the user `Alice` and the user `user1`.
      *
     */
    CompletableFuture<ListGroupMembersResponse> listGroupMembers(ListGroupMembersRequest request);

    /**
      * This topic provides an example on how to query the groups in the directory `d-00fc2p61****`. The returned result shows that the directory contains three groups. The groups `group1` and `group2` are synchronized from an external identity provider (IdP). The group `TestGroup` is manually created in CloudSSO.
      *
     */
    CompletableFuture<ListGroupsResponse> listGroups(ListGroupsRequest request);

    /**
      * This topic provides an example on how to query the groups to which the user `u-00q8wbq42wiltcrk****` is added. The returned result shows that the user is added to both the `TestGroup` and the `group1` groups.
      *
     */
    CompletableFuture<ListJoinedGroupsForUserResponse> listJoinedGroupsForUser(ListJoinedGroupsForUserRequest request);

    /**
      * This topic provides an example on how to query the MFA devices that are bound to the user `u-00q8wbq42wiltcrk****`. The returned result shows that the MFA device named `Alice-MFA1` is bound to the user.
      *
     */
    CompletableFuture<ListMFADevicesForUserResponse> listMFADevicesForUser(ListMFADevicesForUserRequest request);

    /**
      * This topic provides an example on how to query the policies that are created for the access configuration `ac-00jhtfl8thteu6uj****`. The returned result shows that the access configuration contains one system policy and one inline policy.
      *
     */
    CompletableFuture<ListPermissionPoliciesInAccessConfigurationResponse> listPermissionPoliciesInAccessConfiguration(ListPermissionPoliciesInAccessConfigurationRequest request);

    /**
      * This topic provides an example on how to query the SCIM credentials within the `d-00fc2p61****` directory.
      *
     */
    CompletableFuture<ListSCIMServerCredentialsResponse> listSCIMServerCredentials(ListSCIMServerCredentialsRequest request);

    /**
      * By default, this operation queries the tasks within the previous 24 hours. This operation allows you to query the tasks within a maximum of 7 days. You can specify the start time of the query by using `Filter`.
      * This topic provides an example on how to query the tasks within the previous 24 hours.
      *
     */
    CompletableFuture<ListTasksResponse> listTasks(ListTasksRequest request);

    CompletableFuture<ListUserProvisioningEventsResponse> listUserProvisioningEvents(ListUserProvisioningEventsRequest request);

    CompletableFuture<ListUserProvisioningsResponse> listUserProvisionings(ListUserProvisioningsRequest request);

    /**
      * This topic provides an example on how to query users in the `d-00fc2p61****` directory. The returned result shows that the directory contains two users. The user `AliceLee` is synchronized from an external identity provider (IdP). The user `user1` is manually created within CloudSSO.
      *
     */
    CompletableFuture<ListUsersResponse> listUsers(ListUsersRequest request);

    /**
      * When you call this operation, an asynchronous task is automatically created. You can call the [GetTask](~~340670~~) operation to query the progress of the task based on the value of the `TaskId` response parameter.
      * This topic provides an example on how to provision the access configuration `ac-00jhtfl8thteu6uj****` for the account `114240524784****` in your resource directory.
      *
     */
    CompletableFuture<ProvisionAccessConfigurationResponse> provisionAccessConfiguration(ProvisionAccessConfigurationRequest request);

    /**
      * This topic provides an example on how to remove the SAML signing certificate whose ID is `idp-c-00dt9gnl7fmjaw9c****`.
      *
     */
    CompletableFuture<RemoveExternalSAMLIdPCertificateResponse> removeExternalSAMLIdPCertificate(RemoveExternalSAMLIdPCertificateRequest request);

    /**
      * After you remove an inline policy from an access configuration, the policy cannot be restored.
      * This topic provides an example on how to remove the system policy `AliyunECSFullAccess` from the access configuration `ac-00jhtfl8thteu6uj****`.
      *
     */
    CompletableFuture<RemovePermissionPolicyFromAccessConfigurationResponse> removePermissionPolicyFromAccessConfiguration(RemovePermissionPolicyFromAccessConfigurationRequest request);

    /**
      * If System for Cross-domain Identity Management (SCIM) synchronization is enabled, you cannot remove a user from a group that is synchronized by using SCIM.  
      * This topic provides an example on how to remove the user `u-00q8wbq42wiltcrk****` from the group `g-00jqzghi2n3o5hkh****`.
      *
     */
    CompletableFuture<RemoveUserFromGroupResponse> removeUserFromGroup(RemoveUserFromGroupRequest request);

    /**
      * If you forget your password or your password expires or is at risk, you must contact a CloudSSO administrator to reset your password.
      * >  After you enable SSO logon, your password cannot be reset.
      * This topic provides an example on how to reset the password of the user `u-00q8wbq42wiltcrk****`. The new password is automatically generated by the system.
      *
     */
    CompletableFuture<ResetUserPasswordResponse> resetUserPassword(ResetUserPasswordRequest request);

    CompletableFuture<RetryUserProvisioningEventResponse> retryUserProvisioningEvent(RetryUserProvisioningEventRequest request);

    /**
      * During SAML 2.0-based single sign-on (SSO) logon, CloudSSO is an SP, and the identity management system of an enterprise is an IdP.
      * You can use one of the following methods to configure a SAML IdP. You can obtain the required metadata file or parameter values from your IdP.
      * *   Use the metadata file. You can specify the `EncodedMetadataDocument` parameter to upload the metadata file.
      * *   Manually configure the IdP. You can manually specify the following parameters for your IdP: `EntityId`, `LoginUrl`, `WantRequestSigned`, and `X509Certificate`.
      * If you have configured a SAML IdP, the existing configurations are replaced after you call this operation.
      * *   If the IdP is configured by using the metadata file, all existing configurations are replaced with new configurations.
      * *   If the IdP is manually configured, the original parameter values that are different from the new parameter values are replaced.
      * >  If SSO logon is enabled, new configurations immediately take effect. Take note of the impacts on the production environment.
      * This topic provides an example on how to configure an IdP by using the metadata file within the directory `d-00fc2p61****`.
      *
     */
    CompletableFuture<SetExternalSAMLIdentityProviderResponse> setExternalSAMLIdentityProvider(SetExternalSAMLIdentityProviderRequest request);

    CompletableFuture<SetLoginPreferenceResponse> setLoginPreference(SetLoginPreferenceRequest request);

    /**
      * If a CloudSSO administrator enables username-password logon for users, CloudSSO automatically enables MFA to improve security. The administrator can call this operation to enable or disable MFA based on the business requirements.
      * This topic provides an example on how to enable MFA for users.
      *
     */
    CompletableFuture<SetMFAAuthenticationStatusResponse> setMFAAuthenticationStatus(SetMFAAuthenticationStatusRequest request);

    CompletableFuture<SetPasswordPolicyResponse> setPasswordPolicy(SetPasswordPolicyRequest request);

    /**
      * You can synchronize users or groups from an external identity provider (IdP) that supports SCIM 2.0 to CloudSSO only after SCIM synchronization is enabled. If you disable SCIM synchronization, you can no longer synchronize users or groups to CloudSSO. The following list describes the impacts after SCIM synchronization is enabled or disabled:
      * *   After you enable SCIM synchronization, you cannot modify or delete the users or groups that are synchronized to CloudSSO by using SCIM. In addition, you cannot add users to or remove users from the groups. However, you can change the passwords of the users and enable or disable the logon of the users.
      * *   After you disable SCIM synchronization, you can modify and delete the users and groups that are synchronized to CloudSSO by using SCIM. You can also add users to or remove users from the groups.
      * This topic provides an example on how to enable SCIM synchronization within the directory `d-00fc2p61****`.
      *
     */
    CompletableFuture<SetSCIMSynchronizationStatusResponse> setSCIMSynchronizationStatus(SetSCIMSynchronizationStatusRequest request);

    /**
      * You can modify the `Description`, `SessionDuration`, and `RelayState` parameters for an access configuration.
      * This topic provides an example on how to change the initial web page in the access configuration `ac-00jhtfl8thteu6uj****` to `https://cloudsso.console.aliyun.com`.
      *
     */
    CompletableFuture<UpdateAccessConfigurationResponse> updateAccessConfiguration(UpdateAccessConfigurationRequest request);

    /**
      * After you change the name of a directory, the URL that is used to log on to the Cloud SSO user portal is changed. You must notify the Cloud SSO users of the correct URL. 
      * This topic provides an example on how to change the name of a directory to `new-example`.
      *
     */
    CompletableFuture<UpdateDirectoryResponse> updateDirectory(UpdateDirectoryRequest request);

    /**
      * You can modify `GroupName` and `Description` for a group.
      * >  If System for Cross-domain Identity Management (SCIM) synchronization is enabled, you cannot modify the information about a group that is synchronized by using SCIM.
      * This topic provides an example on how to change the name of the group `g-00jqzghi2n3o5hkh****` to `NewTestGroup`.
      *
     */
    CompletableFuture<UpdateGroupResponse> updateGroup(UpdateGroupRequest request);

    /**
      * This topic provides an example on how to modify an inline policy that is created for the access configuration `ac-00jhtfl8thteu6uj****`.
      *
     */
    CompletableFuture<UpdateInlinePolicyForAccessConfigurationResponse> updateInlinePolicyForAccessConfiguration(UpdateInlinePolicyForAccessConfigurationRequest request);

    /**
      * If you enable username-password logon for CloudSSO users, you can also configure MFA for the users.
      * This topic provides an example on how to enable MFA for all CloudSSO users that belong to the directory named `d-00fc2p61****`.
      *
     */
    CompletableFuture<UpdateMFAAuthenticationSettingsResponse> updateMFAAuthenticationSettings(UpdateMFAAuthenticationSettingsRequest request);

    /**
      * This topic provides an example on how to disable the SCIM credential whose ID is `scimcred-004whl0kvfwcypbi****`. After the SCIM credential is disabled, the synchronization task that uses the SCIM credential fails. You can call this operation again to enable the SCIM credential.
      *
     */
    CompletableFuture<UpdateSCIMServerCredentialStatusResponse> updateSCIMServerCredentialStatus(UpdateSCIMServerCredentialStatusRequest request);

    /**
      * You can modify `FirstName`, `LastName`, `DisplayName`, `Email`, and `Description` for a user. You cannot modify `UserName` for a user.
      * >  If System for Cross-domain Identity Management (SCIM) synchronization is enabled, you cannot modify the information about a user that is synchronized by using SCIM.
      * This topic provides an example on how to change the email address of the user whose ID is `u-00q8wbq42wiltcrk****` to `AliceLee@example.com`.
      *
     */
    CompletableFuture<UpdateUserResponse> updateUser(UpdateUserRequest request);

    /**
      * If you call the [UpdateMFAAuthenticationSettings](~~450134~~) operation to set the MFAAuthenticationSettings parameter to `Byuser`, user-specific settings are applied. Then, you must call the UpdateUserMFAAuthenticationSettings operation to configure MFA for each user.
      * By default, the MFAAuthenticationSettings parameter is set to `Enabled` for a new user.
      * This topic provides an example on how to enable MFA for the user named `u-00q8wbq42wiltcrk****`.
      *
     */
    CompletableFuture<UpdateUserMFAAuthenticationSettingsResponse> updateUserMFAAuthenticationSettings(UpdateUserMFAAuthenticationSettingsRequest request);

    CompletableFuture<UpdateUserProvisioningResponse> updateUserProvisioning(UpdateUserProvisioningRequest request);

    CompletableFuture<UpdateUserProvisioningConfigurationResponse> updateUserProvisioningConfiguration(UpdateUserProvisioningConfigurationRequest request);

    /**
      * This topic provides an example on how to change the status of the user whose ID is `u-00q8wbq42wiltcrk****` to Disabled. Users in the Disabled state cannot log on to the CloudSSO user portal.
      *
     */
    CompletableFuture<UpdateUserStatusResponse> updateUserStatus(UpdateUserStatusRequest request);

}
