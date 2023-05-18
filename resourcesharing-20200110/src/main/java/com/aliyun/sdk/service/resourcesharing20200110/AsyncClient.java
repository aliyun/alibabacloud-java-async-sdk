// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcesharing20200110;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.resourcesharing20200110.models.*;
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
      * The ID of the resource sharing invitation.
      * You can call the [ListResourceShareInvitations](~~450564~~) operation to obtain the ID of a resource sharing invitation.
      *
     */
    CompletableFuture<AcceptResourceShareInvitationResponse> acceptResourceShareInvitation(AcceptResourceShareInvitationRequest request);

    /**
      * The operation that you want to perform. Set the value to AssociateResourceShare.
      *
     */
    CompletableFuture<AssociateResourceShareResponse> associateResourceShare(AssociateResourceShareRequest request);

    /**
      * The name of the permission.
      *
     */
    CompletableFuture<AssociateResourceSharePermissionResponse> associateResourceSharePermission(AssociateResourceSharePermissionRequest request);

    /**
      * The operation that you want to perform. Set the value to CreateResourceShare.
      *
     */
    CompletableFuture<CreateResourceShareResponse> createResourceShare(CreateResourceShareRequest request);

    /**
      * The operation that you want to perform. Set the value to DeleteResourceShare.
      *
     */
    CompletableFuture<DeleteResourceShareResponse> deleteResourceShare(DeleteResourceShareRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
      * The operation that you want to perform. Set the value to DisassociateResourceShare.
      *
     */
    CompletableFuture<DisassociateResourceShareResponse> disassociateResourceShare(DisassociateResourceShareRequest request);

    /**
      * This topic provides an example on how to call the API operation to disassociate the `AliyunRSDefaultPermissionVSwitch` permission from the `rs-6GRmdD3X****` resource share in the `cn-hangzhou` region.
      * ## Limits
      * You can call this operation up to 20 times per second per account. This operation is globally limited to 500 times per second across all accounts. If the number of the calls per second exceeds a limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limits when you call this operation.
      *
     */
    CompletableFuture<DisassociateResourceSharePermissionResponse> disassociateResourceSharePermission(DisassociateResourceSharePermissionRequest request);

    /**
      * The operation that you want to perform. Set the value to EnableSharingWithResourceDirectory.
      *
     */
    CompletableFuture<EnableSharingWithResourceDirectoryResponse> enableSharingWithResourceDirectory(EnableSharingWithResourceDirectoryRequest request);

    /**
      * The version of the permission.
      *
     */
    CompletableFuture<GetPermissionResponse> getPermission(GetPermissionRequest request);

    /**
      * The maximum number of entries to return for a single request.
      * Valid values: 1 to 100. Default value: 20.
      *
     */
    CompletableFuture<ListPermissionVersionsResponse> listPermissionVersions(ListPermissionVersionsRequest request);

    /**
      * The maximum number of entries to return for a single request.
      * Valid values: 1 to 100. Default value: 20.
      *
     */
    CompletableFuture<ListPermissionsResponse> listPermissions(ListPermissionsRequest request);

    /**
      * This topic provides an example on how to call the API operation to query the association records of the resource shares that are created by using the current Alibaba Cloud account in the `cn-hangzhou` region. The response shows the following records:
      * *   The resource `vsw-bp1upw03qyz8n7us9****` of the `VSwitch` type has been associated with the resource share `rs-6GRmdD3X****`. The resource is in the `Associated` state. This indicates that the resource is being shared.
      * *   The resource `vsw-bp183p93qs667muql****` of the `VSwitch` type has been disassociated from the resource share `rs-6GRmdD3X****`. The resource is in the `Disassociated` state. This indicates that the sharing of the resource is stopped.
      * ## Limits
      * You can call this operation up to 20 times per second per account. This operation is globally limited to 500 times per second across all accounts. If the number of the calls per second exceeds a limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limits when you call this operation.
      *
     */
    CompletableFuture<ListResourceShareAssociationsResponse> listResourceShareAssociations(ListResourceShareAssociationsRequest request);

    /**
      * The maximum number of entries to return for a single request.
      * Valid values: 1 to 100. Default value: 20.
      *
     */
    CompletableFuture<ListResourceShareInvitationsResponse> listResourceShareInvitations(ListResourceShareInvitationsRequest request);

    /**
      * The maximum number of entries to return for a single request.
      * Valid values: 1 to 100. Default value: 20.
      *
     */
    CompletableFuture<ListResourceSharePermissionsResponse> listResourceSharePermissions(ListResourceSharePermissionsRequest request);

    /**
      * The operation that you want to perform. Set the value to ListResourceShares.
      *
     */
    CompletableFuture<ListResourceSharesResponse> listResourceShares(ListResourceSharesRequest request);

    /**
      * This topic provides an example on how to call the API operation to query the resources that you share with other accounts in the `cn-hangzhou` region. The response shows that in the resource share `rs-6GRmdD3X****`, you share the `vsw-bp1upw03qyz8n7us9****` resource of the `VSwitch` type with other accounts.
      * ## Limits
      * You can call this operation up to 20 times per second per account. This operation is globally limited to 500 times per second across all accounts. If the number of the calls per second exceeds a limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limits when you call this operation.
      *
     */
    CompletableFuture<ListSharedResourcesResponse> listSharedResources(ListSharedResourcesRequest request);

    /**
      * If you are a resource owner, you can query the principals with which you share your resources.
      * If you are a principal, you can query the resources that are shared with you.
      * This topic provides an example on how to call the API operation to query the principals with which you share your resources in the `cn-hangzhou` region. The response shows that you share your resources with the principals `114240524784****` and `172050525300****`.
      * ## Limits
      * You can call this operation up to 20 times per second per account. This operation is globally limited to 500 times per second across all accounts. If the number of the calls per second exceeds a limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limits when you call this operation.
      *
     */
    CompletableFuture<ListSharedTargetsResponse> listSharedTargets(ListSharedTargetsRequest request);

    /**
      * The ID of the resource sharing invitation.
      * You can call the [ListResourceShareInvitations](~~450564~~) operation to obtain the ID of a resource sharing invitation.
      *
     */
    CompletableFuture<RejectResourceShareInvitationResponse> rejectResourceShareInvitation(RejectResourceShareInvitationRequest request);

    /**
      * The operation that you want to perform. Set the value to UpdateResourceShare.
      *
     */
    CompletableFuture<UpdateResourceShareResponse> updateResourceShare(UpdateResourceShareRequest request);

}
