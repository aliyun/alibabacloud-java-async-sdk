// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.appstream_center20210901.models.*;
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

    CompletableFuture<AccessPageGetAclResponse> accessPageGetAcl(AccessPageGetAclRequest request);

    CompletableFuture<AccessPageSetAclResponse> accessPageSetAcl(AccessPageSetAclRequest request);

    CompletableFuture<ApproveOtaTaskResponse> approveOtaTask(ApproveOtaTaskRequest request);

    CompletableFuture<AskSessionPackagePriceResponse> askSessionPackagePrice(AskSessionPackagePriceRequest request);

    CompletableFuture<AskSessionPackageRenewPriceResponse> askSessionPackageRenewPrice(AskSessionPackageRenewPriceRequest request);

    CompletableFuture<AuthorizeInstanceGroupResponse> authorizeInstanceGroup(AuthorizeInstanceGroupRequest request);

    CompletableFuture<BuySessionPackageResponse> buySessionPackage(BuySessionPackageRequest request);

    CompletableFuture<CancelOtaTaskResponse> cancelOtaTask(CancelOtaTaskRequest request);

    CompletableFuture<CreateAccessPageResponse> createAccessPage(CreateAccessPageRequest request);

    CompletableFuture<CreateAppInstanceGroupResponse> createAppInstanceGroup(CreateAppInstanceGroupRequest request);

    CompletableFuture<CreateImageFromAppInstanceGroupResponse> createImageFromAppInstanceGroup(CreateImageFromAppInstanceGroupRequest request);

    CompletableFuture<CreateProjectResponse> createProject(CreateProjectRequest request);

    CompletableFuture<DeleteAccessPageResponse> deleteAccessPage(DeleteAccessPageRequest request);

    CompletableFuture<DeleteAppInstanceGroupResponse> deleteAppInstanceGroup(DeleteAppInstanceGroupRequest request);

    CompletableFuture<DeleteAppInstancesResponse> deleteAppInstances(DeleteAppInstancesRequest request);

    CompletableFuture<DeleteProjectResponse> deleteProject(DeleteProjectRequest request);

    CompletableFuture<GetAccessPageSessionResponse> getAccessPageSession(GetAccessPageSessionRequest request);

    CompletableFuture<GetAppInstanceGroupResponse> getAppInstanceGroup(GetAppInstanceGroupRequest request);

    CompletableFuture<GetConnectionTicketResponse> getConnectionTicket(GetConnectionTicketRequest request);

    CompletableFuture<GetDebugAppInstanceResponse> getDebugAppInstance(GetDebugAppInstanceRequest request);

    CompletableFuture<GetOtaTaskByTaskIdResponse> getOtaTaskByTaskId(GetOtaTaskByTaskIdRequest request);

    CompletableFuture<GetProjectPoliciesResponse> getProjectPolicies(GetProjectPoliciesRequest request);

    CompletableFuture<GetResourcePriceResponse> getResourcePrice(GetResourcePriceRequest request);

    CompletableFuture<GetResourceRenewPriceResponse> getResourceRenewPrice(GetResourceRenewPriceRequest request);

    CompletableFuture<ListAccessPagesResponse> listAccessPages(ListAccessPagesRequest request);

    CompletableFuture<ListAppInstanceGroupResponse> listAppInstanceGroup(ListAppInstanceGroupRequest request);

    CompletableFuture<ListAppInstancesResponse> listAppInstances(ListAppInstancesRequest request);

    CompletableFuture<ListNodeInstanceTypeResponse> listNodeInstanceType(ListNodeInstanceTypeRequest request);

    CompletableFuture<ListOtaTaskResponse> listOtaTask(ListOtaTaskRequest request);

    CompletableFuture<ListProjectsResponse> listProjects(ListProjectsRequest request);

    CompletableFuture<ListRegionsResponse> listRegions(ListRegionsRequest request);

    CompletableFuture<ListSessionPackagesResponse> listSessionPackages(ListSessionPackagesRequest request);

    CompletableFuture<ListTenantConfigResponse> listTenantConfig(ListTenantConfigRequest request);

    CompletableFuture<LogOffAllSessionsInAppInstanceGroupResponse> logOffAllSessionsInAppInstanceGroup(LogOffAllSessionsInAppInstanceGroupRequest request);

    CompletableFuture<MigrateSessionPackageResponse> migrateSessionPackage(MigrateSessionPackageRequest request);

    CompletableFuture<ModifyAppInstanceGroupAttributeResponse> modifyAppInstanceGroupAttribute(ModifyAppInstanceGroupAttributeRequest request);

    CompletableFuture<ModifyNodePoolAttributeResponse> modifyNodePoolAttribute(ModifyNodePoolAttributeRequest request);

    CompletableFuture<ModifyProjectPolicyResponse> modifyProjectPolicy(ModifyProjectPolicyRequest request);

    CompletableFuture<ModifyTenantConfigResponse> modifyTenantConfig(ModifyTenantConfigRequest request);

    CompletableFuture<PageListAppInstanceGroupUserResponse> pageListAppInstanceGroupUser(PageListAppInstanceGroupUserRequest request);

    CompletableFuture<RefreshAccessUrlResponse> refreshAccessUrl(RefreshAccessUrlRequest request);

    CompletableFuture<RenewAppInstanceGroupResponse> renewAppInstanceGroup(RenewAppInstanceGroupRequest request);

    CompletableFuture<RenewSessionPackageResponse> renewSessionPackage(RenewSessionPackageRequest request);

    CompletableFuture<UnbindResponse> unbind(UnbindRequest request);

    CompletableFuture<UpdateAccessPageStateResponse> updateAccessPageState(UpdateAccessPageStateRequest request);

    CompletableFuture<UpdateAppInstanceGroupImageResponse> updateAppInstanceGroupImage(UpdateAppInstanceGroupImageRequest request);

}
