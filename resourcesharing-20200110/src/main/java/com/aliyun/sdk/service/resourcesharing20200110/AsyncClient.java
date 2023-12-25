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
      * *   A principal needs to accept or reject a resource sharing invitation only if the principal is not the management account or a member of a resource directory. If you share resources with an object in a resource directory, the system automatically accepts the resource sharing invitation for the object.
      * *   A resource sharing invitation is valid for seven days. A principal must accept or reject the invitation within the validity period.
      * This topic provides an example on how to call the API operation to accept the resource sharing invitation `i-pMnItMX19fBJ****` in the `cn-hangzhou` region.
      *
     */
    CompletableFuture<AcceptResourceShareInvitationResponse> acceptResourceShareInvitation(AcceptResourceShareInvitationRequest request);

    /**
      * This topic provides an example on how to call the API operation to associate the vSwitch `vsw-bp183p93qs667muql****` and the member `172050525300****` with the resource share `rs-6GRmdD3X****` in the `cn-hangzhou` region. After the association, the vSwitch is shared with the member.
      *
     */
    CompletableFuture<AssociateResourceShareResponse> associateResourceShare(AssociateResourceShareRequest request);

    /**
      * This topic provides an example on how to call the API operation to associate the `AliyunRSDefaultPermissionVSwitch` permission with the `rs-6GRmdD3X****` resource share in the `cn-hangzhou` region.
      *
     */
    CompletableFuture<AssociateResourceSharePermissionResponse> associateResourceSharePermission(AssociateResourceSharePermissionRequest request);

    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    CompletableFuture<CheckSharingWithResourceDirectoryStatusResponse> checkSharingWithResourceDirectoryStatus(CheckSharingWithResourceDirectoryStatusRequest request);

    /**
      * Resource Sharing allows you to share your resources with one or more accounts and access the resources shared by other accounts. For more information, see [Resource Sharing overview](~~160622~~).
      * This topic provides an example on how to call the API operation to create a resource share named `test` in the `cn-hangzhou` region to share the vSwitch `vsw-bp183p93qs667muql****` with the member `172050525300****`. In this example, the management account of a resource directory is used to call this API operation.
      *
     */
    CompletableFuture<CreateResourceShareResponse> createResourceShare(CreateResourceShareRequest request);

    /**
      * After a resource share is deleted, all principals in the resource share can no longer access the resources in the resource share. However, the resources are not deleted with the resource share.
      * A resource share that is deleted is in the `Deleted` state. The system deletes the record of the resource share within 48 hours to 96 hours.
      * This topic provides an example on how to call the API operation to delete the resource share `rs-qSkW1HBY****` in the `cn-hangzhou` region.
      *
     */
    CompletableFuture<DeleteResourceShareResponse> deleteResourceShare(DeleteResourceShareRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
      * *   A resource owner can call this API operation to remove shared resources or principals from a resource share.
      * *   If an Alibaba Cloud account that is not the management account or a member of a resource directory is added to a resource share as a principal, you can use the Alibaba Cloud account to call this API operation to exit the resource share. For more information, see [Exit a resource share](~~440614~~).
      * This topic provides an example on how to use the management account of a resource directory to call the API operation to remove the member `172050525300****` from the resource share `rs-6GRmdD3X****` in the `cn-hangzhou` region. After the member is removed from the resource share, the member cannot share the resources in the resource share.
      *
     */
    CompletableFuture<DisassociateResourceShareResponse> disassociateResourceShare(DisassociateResourceShareRequest request);

    /**
      * This topic provides an example on how to call the API operation to disassociate the `AliyunRSDefaultPermissionVSwitch` permission from the `rs-6GRmdD3X****` resource share in the `cn-hangzhou` region.
      *
     */
    CompletableFuture<DisassociateResourceSharePermissionResponse> disassociateResourceSharePermission(DisassociateResourceSharePermissionRequest request);

    /**
      * You can share your resources with all members in your resource directory, all members in a specific folder in your resource directory, or a specific member in your resource directory as a resource owner only after you enable resource sharing for your resource directory.
      * You can call this API operation only by using the management account of your resource directory or a RAM user or RAM role to which the required permissions are granted within the management account.
      *
     */
    CompletableFuture<EnableSharingWithResourceDirectoryResponse> enableSharingWithResourceDirectory(EnableSharingWithResourceDirectoryRequest request);

    /**
      * This topic provides an example on how to call the API operation to query the information about the `AliyunRSDefaultPermissionVSwitch` permission whose version is `v1` in the `cn-hangzhou` region.
      *
     */
    CompletableFuture<GetPermissionResponse> getPermission(GetPermissionRequest request);

    /**
      * This topic provides an example on how to call the API operation to query the versions of the `AliyunRSDefaultPermissionVSwitch` permission in the `cn-hangzhou` region.
      *
     */
    CompletableFuture<ListPermissionVersionsResponse> listPermissionVersions(ListPermissionVersionsRequest request);

    /**
      * This topic provides an example on how to call the API operation to query the information about the default permission for the `VSwitch` resource type in the `cn-hangzhou` region.
      *
     */
    CompletableFuture<ListPermissionsResponse> listPermissions(ListPermissionsRequest request);

    /**
      * This topic provides an example on how to call the API operation to query the association records of the resource shares that are created by using the current Alibaba Cloud account in the `cn-hangzhou` region. The response shows the following records:
      * *   The resource `vsw-bp1upw03qyz8n7us9****` of the `VSwitch` type has been associated with the resource share `rs-6GRmdD3X****`. The resource is in the `Associated` state. This indicates that the resource is being shared.
      * *   The resource `vsw-bp183p93qs667muql****` of the `VSwitch` type has been disassociated from the resource share `rs-6GRmdD3X****`. The resource is in the `Disassociated` state. This indicates that the sharing of the resource is stopped.
      *
     */
    CompletableFuture<ListResourceShareAssociationsResponse> listResourceShareAssociations(ListResourceShareAssociationsRequest request);

    /**
      * This topic provides an example on how to call the API operation to query the resource sharing invitations that are received by the current account in the `cn-hangzhou` region. The response shows that one invitation is received by the current account and is waiting for confirmation.
      *
     */
    CompletableFuture<ListResourceShareInvitationsResponse> listResourceShareInvitations(ListResourceShareInvitationsRequest request);

    /**
      * This topic provides an example on how to call the API operation to query the permissions that are associated with the resource share created by using the current Alibaba Cloud account in the `cn-hangzhou` region.
      *
     */
    CompletableFuture<ListResourceSharePermissionsResponse> listResourceSharePermissions(ListResourceSharePermissionsRequest request);

    /**
      * This topic provides an example on how to call the API operation to query the resource shares that are created by using the current Alibaba Cloud account in the `cn-hangzhou` region. The response shows that the following resource shares are created by using the account whose ID is `151266687691****`:
      * *   `rs-hX9wC5jO****`, which is in the `Deleted` state
      * *   `rs-PqysnzIj****`, which is in the `Active` state
      *
     */
    CompletableFuture<ListResourceSharesResponse> listResourceShares(ListResourceSharesRequest request);

    /**
      * This topic provides an example on how to call the API operation to query the resources that you share with other accounts in the `cn-hangzhou` region. The response shows that in the resource share `rs-6GRmdD3X****`, you share the `vsw-bp1upw03qyz8n7us9****` resource of the `VSwitch` type with other accounts.
      *
     */
    CompletableFuture<ListSharedResourcesResponse> listSharedResources(ListSharedResourcesRequest request);

    /**
      * If you are a resource owner, you can query the principals with which you share your resources.
      * If you are a principal, you can query the resources that are shared with you.
      * This topic provides an example on how to call the API operation to query the principals with which you share your resources in the `cn-hangzhou` region. The response shows that you share your resources with the principals `114240524784****` and `172050525300****`.
      *
     */
    CompletableFuture<ListSharedTargetsResponse> listSharedTargets(ListSharedTargetsRequest request);

    /**
      * This topic provides an example on how to call the API operation to reject the resource sharing invitation `i-yyTWbkjHArYh****` in the `cn-hangzhou` region.
      *
     */
    CompletableFuture<RejectResourceShareInvitationResponse> rejectResourceShareInvitation(RejectResourceShareInvitationRequest request);

    /**
      * You can call this API operation to change the name or resource sharing scope of a resource share.
      * This topic provides an example on how to call the API operation to change the name of the resource share `rs-qSkW1HBY****` in the `cn-hangzhou` region from `test` to `new`.
      *
     */
    CompletableFuture<UpdateResourceShareResponse> updateResourceShare(UpdateResourceShareRequest request);

}
