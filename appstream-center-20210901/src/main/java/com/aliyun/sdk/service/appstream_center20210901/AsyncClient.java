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

    /**
     * @param request the request parameters of AccessPageSetAcl  AccessPageSetAclRequest
     * @return AccessPageSetAclResponse
     */
    CompletableFuture<AccessPageSetAclResponse> accessPageSetAcl(AccessPageSetAclRequest request);

    /**
     * @param request the request parameters of ApproveOtaTask  ApproveOtaTaskRequest
     * @return ApproveOtaTaskResponse
     */
    CompletableFuture<ApproveOtaTaskResponse> approveOtaTask(ApproveOtaTaskRequest request);

    /**
     * @param request the request parameters of AskSessionPackagePrice  AskSessionPackagePriceRequest
     * @return AskSessionPackagePriceResponse
     */
    CompletableFuture<AskSessionPackagePriceResponse> askSessionPackagePrice(AskSessionPackagePriceRequest request);

    /**
     * @param request the request parameters of AuthorizeInstanceGroup  AuthorizeInstanceGroupRequest
     * @return AuthorizeInstanceGroupResponse
     */
    CompletableFuture<AuthorizeInstanceGroupResponse> authorizeInstanceGroup(AuthorizeInstanceGroupRequest request);

    /**
     * @param request the request parameters of BuySessionPackage  BuySessionPackageRequest
     * @return BuySessionPackageResponse
     */
    CompletableFuture<BuySessionPackageResponse> buySessionPackage(BuySessionPackageRequest request);

    /**
     * @param request the request parameters of CreateAccessPage  CreateAccessPageRequest
     * @return CreateAccessPageResponse
     */
    CompletableFuture<CreateAccessPageResponse> createAccessPage(CreateAccessPageRequest request);

    /**
     * @param request the request parameters of CreateAppInstanceGroup  CreateAppInstanceGroupRequest
     * @return CreateAppInstanceGroupResponse
     */
    CompletableFuture<CreateAppInstanceGroupResponse> createAppInstanceGroup(CreateAppInstanceGroupRequest request);

    /**
     * @param request the request parameters of CreateImageFromAppInstanceGroup  CreateImageFromAppInstanceGroupRequest
     * @return CreateImageFromAppInstanceGroupResponse
     */
    CompletableFuture<CreateImageFromAppInstanceGroupResponse> createImageFromAppInstanceGroup(CreateImageFromAppInstanceGroupRequest request);

    /**
     * @param request the request parameters of DeleteAccessPage  DeleteAccessPageRequest
     * @return DeleteAccessPageResponse
     */
    CompletableFuture<DeleteAccessPageResponse> deleteAccessPage(DeleteAccessPageRequest request);

    /**
     * @param request the request parameters of DeleteAppInstanceGroup  DeleteAppInstanceGroupRequest
     * @return DeleteAppInstanceGroupResponse
     */
    CompletableFuture<DeleteAppInstanceGroupResponse> deleteAppInstanceGroup(DeleteAppInstanceGroupRequest request);

    /**
     * @param request the request parameters of DeleteAppInstances  DeleteAppInstancesRequest
     * @return DeleteAppInstancesResponse
     */
    CompletableFuture<DeleteAppInstancesResponse> deleteAppInstances(DeleteAppInstancesRequest request);

    /**
     * @param request the request parameters of GetAccessPageSession  GetAccessPageSessionRequest
     * @return GetAccessPageSessionResponse
     */
    CompletableFuture<GetAccessPageSessionResponse> getAccessPageSession(GetAccessPageSessionRequest request);

    /**
     * @param request the request parameters of GetAppInstanceGroup  GetAppInstanceGroupRequest
     * @return GetAppInstanceGroupResponse
     */
    CompletableFuture<GetAppInstanceGroupResponse> getAppInstanceGroup(GetAppInstanceGroupRequest request);

    /**
     * @param request the request parameters of GetConnectionTicket  GetConnectionTicketRequest
     * @return GetConnectionTicketResponse
     */
    CompletableFuture<GetConnectionTicketResponse> getConnectionTicket(GetConnectionTicketRequest request);

    /**
     * @param request the request parameters of GetDebugAppInstance  GetDebugAppInstanceRequest
     * @return GetDebugAppInstanceResponse
     */
    CompletableFuture<GetDebugAppInstanceResponse> getDebugAppInstance(GetDebugAppInstanceRequest request);

    /**
     * @param request the request parameters of GetOtaTaskByTaskId  GetOtaTaskByTaskIdRequest
     * @return GetOtaTaskByTaskIdResponse
     */
    CompletableFuture<GetOtaTaskByTaskIdResponse> getOtaTaskByTaskId(GetOtaTaskByTaskIdRequest request);

    /**
     * @param request the request parameters of GetResourcePrice  GetResourcePriceRequest
     * @return GetResourcePriceResponse
     */
    CompletableFuture<GetResourcePriceResponse> getResourcePrice(GetResourcePriceRequest request);

    /**
     * @param request the request parameters of GetResourceRenewPrice  GetResourceRenewPriceRequest
     * @return GetResourceRenewPriceResponse
     */
    CompletableFuture<GetResourceRenewPriceResponse> getResourceRenewPrice(GetResourceRenewPriceRequest request);

    /**
     * @param request the request parameters of ListAccessPages  ListAccessPagesRequest
     * @return ListAccessPagesResponse
     */
    CompletableFuture<ListAccessPagesResponse> listAccessPages(ListAccessPagesRequest request);

    /**
     * @param request the request parameters of ListAppInstanceGroup  ListAppInstanceGroupRequest
     * @return ListAppInstanceGroupResponse
     */
    CompletableFuture<ListAppInstanceGroupResponse> listAppInstanceGroup(ListAppInstanceGroupRequest request);

    /**
     * @param request the request parameters of ListAppInstances  ListAppInstancesRequest
     * @return ListAppInstancesResponse
     */
    CompletableFuture<ListAppInstancesResponse> listAppInstances(ListAppInstancesRequest request);

    /**
     * @param request the request parameters of ListBindInfo  ListBindInfoRequest
     * @return ListBindInfoResponse
     */
    CompletableFuture<ListBindInfoResponse> listBindInfo(ListBindInfoRequest request);

    /**
     * @param request the request parameters of ListNodeInstanceType  ListNodeInstanceTypeRequest
     * @return ListNodeInstanceTypeResponse
     */
    CompletableFuture<ListNodeInstanceTypeResponse> listNodeInstanceType(ListNodeInstanceTypeRequest request);

    /**
     * @param request the request parameters of ListOtaTask  ListOtaTaskRequest
     * @return ListOtaTaskResponse
     */
    CompletableFuture<ListOtaTaskResponse> listOtaTask(ListOtaTaskRequest request);

    /**
     * @param request the request parameters of ListRegions  ListRegionsRequest
     * @return ListRegionsResponse
     */
    CompletableFuture<ListRegionsResponse> listRegions(ListRegionsRequest request);

    /**
     * @param request the request parameters of ListSessionPackages  ListSessionPackagesRequest
     * @return ListSessionPackagesResponse
     */
    CompletableFuture<ListSessionPackagesResponse> listSessionPackages(ListSessionPackagesRequest request);

    /**
     * @param request the request parameters of ListTenantConfig  ListTenantConfigRequest
     * @return ListTenantConfigResponse
     */
    CompletableFuture<ListTenantConfigResponse> listTenantConfig(ListTenantConfigRequest request);

    /**
     * @param request the request parameters of LogOffAllSessionsInAppInstanceGroup  LogOffAllSessionsInAppInstanceGroupRequest
     * @return LogOffAllSessionsInAppInstanceGroupResponse
     */
    CompletableFuture<LogOffAllSessionsInAppInstanceGroupResponse> logOffAllSessionsInAppInstanceGroup(LogOffAllSessionsInAppInstanceGroupRequest request);

    /**
     * @param request the request parameters of ModifyAppInstanceGroupAttribute  ModifyAppInstanceGroupAttributeRequest
     * @return ModifyAppInstanceGroupAttributeResponse
     */
    CompletableFuture<ModifyAppInstanceGroupAttributeResponse> modifyAppInstanceGroupAttribute(ModifyAppInstanceGroupAttributeRequest request);

    /**
     * @param request the request parameters of ModifyAppPolicy  ModifyAppPolicyRequest
     * @return ModifyAppPolicyResponse
     */
    CompletableFuture<ModifyAppPolicyResponse> modifyAppPolicy(ModifyAppPolicyRequest request);

    /**
     * @param request the request parameters of ModifyNodePoolAttribute  ModifyNodePoolAttributeRequest
     * @return ModifyNodePoolAttributeResponse
     */
    CompletableFuture<ModifyNodePoolAttributeResponse> modifyNodePoolAttribute(ModifyNodePoolAttributeRequest request);

    /**
     * @param request the request parameters of ModifyTenantConfig  ModifyTenantConfigRequest
     * @return ModifyTenantConfigResponse
     */
    CompletableFuture<ModifyTenantConfigResponse> modifyTenantConfig(ModifyTenantConfigRequest request);

    /**
     * @param request the request parameters of PageListAppInstanceGroupUser  PageListAppInstanceGroupUserRequest
     * @return PageListAppInstanceGroupUserResponse
     */
    CompletableFuture<PageListAppInstanceGroupUserResponse> pageListAppInstanceGroupUser(PageListAppInstanceGroupUserRequest request);

    /**
     * @param request the request parameters of RenewAppInstanceGroup  RenewAppInstanceGroupRequest
     * @return RenewAppInstanceGroupResponse
     */
    CompletableFuture<RenewAppInstanceGroupResponse> renewAppInstanceGroup(RenewAppInstanceGroupRequest request);

    /**
     * @param request the request parameters of Unbind  UnbindRequest
     * @return UnbindResponse
     */
    CompletableFuture<UnbindResponse> unbind(UnbindRequest request);

    /**
     * @param request the request parameters of UpdateAppInstanceGroupImage  UpdateAppInstanceGroupImageRequest
     * @return UpdateAppInstanceGroupImageResponse
     */
    CompletableFuture<UpdateAppInstanceGroupImageResponse> updateAppInstanceGroupImage(UpdateAppInstanceGroupImageRequest request);

}
