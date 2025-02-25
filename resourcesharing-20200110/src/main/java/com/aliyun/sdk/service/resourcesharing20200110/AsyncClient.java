// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcesharing20200110;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.resourcesharing20200110.models.*;
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
     * <h3><a href="#"></a></h3>
     * <ul>
     * <li>A principal needs to accept or reject a resource sharing invitation only if the principal is not the management account or a member of a resource directory. If you share resources with an object in a resource directory, the system automatically accepts the resource sharing invitation for the object.</li>
     * <li>A resource sharing invitation is valid for seven days. A principal must accept or reject the invitation within the validity period.
     * This topic provides an example on how to call the API operation to accept the resource sharing invitation whose ID is <code>i-pMnItMX19fBJ****</code> in the <code>cn-hangzhou</code> region.</li>
     * </ul>
     * 
     * @param request the request parameters of AcceptResourceShareInvitation  AcceptResourceShareInvitationRequest
     * @return AcceptResourceShareInvitationResponse
     */
    CompletableFuture<AcceptResourceShareInvitationResponse> acceptResourceShareInvitation(AcceptResourceShareInvitationRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to associate the vSwitch <code>vsw-bp183p93qs667muql****</code> and the member <code>172050525300****</code> with the resource share <code>rs-6GRmdD3X****</code> in the <code>cn-hangzhou</code> region. After the association, the vSwitch is shared with the member.</p>
     * 
     * @param request the request parameters of AssociateResourceShare  AssociateResourceShareRequest
     * @return AssociateResourceShareResponse
     */
    CompletableFuture<AssociateResourceShareResponse> associateResourceShare(AssociateResourceShareRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to associate the <code>AliyunRSDefaultPermissionVSwitch</code> permission with the <code>rs-6GRmdD3X****</code> resource share in the <code>cn-hangzhou</code> region.</p>
     * 
     * @param request the request parameters of AssociateResourceSharePermission  AssociateResourceSharePermissionRequest
     * @return AssociateResourceSharePermissionResponse
     */
    CompletableFuture<AssociateResourceSharePermissionResponse> associateResourceSharePermission(AssociateResourceSharePermissionRequest request);

    /**
     * @param request the request parameters of ChangeResourceGroup  ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    /**
     * @param request the request parameters of CheckSharingWithResourceDirectoryStatus  CheckSharingWithResourceDirectoryStatusRequest
     * @return CheckSharingWithResourceDirectoryStatusResponse
     */
    CompletableFuture<CheckSharingWithResourceDirectoryStatusResponse> checkSharingWithResourceDirectoryStatus(CheckSharingWithResourceDirectoryStatusRequest request);

    /**
     * <b>description</b> :
     * <p>Resource Sharing allows you to share your resources with one or more accounts and access the resources shared by other accounts. For more information, see <a href="https://help.aliyun.com/document_detail/160622.html">Resource Sharing overview</a>.
     * This topic provides an example on how to call the API operation to create a resource share named <code>test</code> in the <code>cn-hangzhou</code> region to share the vSwitch <code>vsw-bp183p93qs667muql****</code> with the member <code>172050525300****</code> in a resource directory. In this example, the management account of the resource directory is used to call this API operation.</p>
     * 
     * @param request the request parameters of CreateResourceShare  CreateResourceShareRequest
     * @return CreateResourceShareResponse
     */
    CompletableFuture<CreateResourceShareResponse> createResourceShare(CreateResourceShareRequest request);

    /**
     * <b>description</b> :
     * <p>After a resource share is deleted, all principals in the resource share can no longer access the resources in the resource share. However, the resources are not deleted with the resource share.
     * A resource share that is deleted is in the <code>Deleted</code> state. The system deletes the record of the resource share within 48 hours to 96 hours.
     * This topic provides an example on how to call the API operation to delete the resource share <code>rs-qSkW1HBY****</code> in the <code>cn-hangzhou</code> region.</p>
     * 
     * @param request the request parameters of DeleteResourceShare  DeleteResourceShareRequest
     * @return DeleteResourceShareResponse
     */
    CompletableFuture<DeleteResourceShareResponse> deleteResourceShare(DeleteResourceShareRequest request);

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * <b>description</b> :
     * <p>  A resource owner can call this API operation to disassociate shared resources or principals from a resource share.</p>
     * <ul>
     * <li>If a principal does not belong to a resource directory, the principal can call this API operation to exit the resource share. For more information, see <a href="https://help.aliyun.com/document_detail/440614.html">Exit a resource share</a>.
     * This topic provides an example on how to use the management account of a resource directory to call the API operation to disassociate the member <code>172050525300****</code> from the resource share <code>rs-6GRmdD3X****</code> in the <code>cn-hangzhou</code> region. After the member is disassociated from the resource share, the member cannot share the resources in the resource share.</li>
     * </ul>
     * 
     * @param request the request parameters of DisassociateResourceShare  DisassociateResourceShareRequest
     * @return DisassociateResourceShareResponse
     */
    CompletableFuture<DisassociateResourceShareResponse> disassociateResourceShare(DisassociateResourceShareRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to disassociate the <code>AliyunRSDefaultPermissionVSwitch</code> permission from the <code>rs-6GRmdD3X****</code> resource share in the <code>cn-hangzhou</code> region.</p>
     * 
     * @param request the request parameters of DisassociateResourceSharePermission  DisassociateResourceSharePermissionRequest
     * @return DisassociateResourceSharePermissionResponse
     */
    CompletableFuture<DisassociateResourceSharePermissionResponse> disassociateResourceSharePermission(DisassociateResourceSharePermissionRequest request);

    /**
     * <b>description</b> :
     * <p>You can share your resources with all members in your resource directory, all members in a specific folder in your resource directory, or a specific member in your resource directory as a resource owner only after you enable resource sharing for your resource directory.
     * You can call this API operation only by using the management account of your resource directory or a RAM user or RAM role to which the required permissions are granted within the management account.</p>
     * 
     * @param request the request parameters of EnableSharingWithResourceDirectory  EnableSharingWithResourceDirectoryRequest
     * @return EnableSharingWithResourceDirectoryResponse
     */
    CompletableFuture<EnableSharingWithResourceDirectoryResponse> enableSharingWithResourceDirectory(EnableSharingWithResourceDirectoryRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to query the information about the <code>AliyunRSDefaultPermissionVSwitch</code> permission whose version is <code>v1</code> in the <code>cn-hangzhou</code> region.</p>
     * 
     * @param request the request parameters of GetPermission  GetPermissionRequest
     * @return GetPermissionResponse
     */
    CompletableFuture<GetPermissionResponse> getPermission(GetPermissionRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to query the versions of the <code>AliyunRSDefaultPermissionVSwitch</code> permission in the <code>cn-hangzhou</code> region.</p>
     * 
     * @param request the request parameters of ListPermissionVersions  ListPermissionVersionsRequest
     * @return ListPermissionVersionsResponse
     */
    CompletableFuture<ListPermissionVersionsResponse> listPermissionVersions(ListPermissionVersionsRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to query the information about the default permission for the <code>VSwitch</code> resource type in the <code>cn-hangzhou</code> region.</p>
     * 
     * @param request the request parameters of ListPermissions  ListPermissionsRequest
     * @return ListPermissionsResponse
     */
    CompletableFuture<ListPermissionsResponse> listPermissions(ListPermissionsRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to query the association records of the resource shares that are created by using the current Alibaba Cloud account in the <code>cn-hangzhou</code> region. The response shows the following records:</p>
     * <ul>
     * <li>The resource <code>vsw-bp1upw03qyz8n7us9****</code> of the <code>VSwitch</code> type has been associated with the resource share <code>rs-6GRmdD3X****</code>. The resource is in the <code>Associated</code> state. This indicates that the resource is being shared.</li>
     * <li>The resource <code>vsw-bp183p93qs667muql****</code> of the <code>VSwitch</code> type has been disassociated from the resource share <code>rs-6GRmdD3X****</code>. The resource is in the <code>Disassociated</code> state. This indicates that the sharing of the resource is stopped.</li>
     * </ul>
     * 
     * @param request the request parameters of ListResourceShareAssociations  ListResourceShareAssociationsRequest
     * @return ListResourceShareAssociationsResponse
     */
    CompletableFuture<ListResourceShareAssociationsResponse> listResourceShareAssociations(ListResourceShareAssociationsRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a></h3>
     * <p>This topic provides an example on how to call the API operation to query the resource sharing invitations that are received by the current account in the <code>cn-hangzhou</code> region. The response shows that one invitation is received by the current account and is waiting for confirmation.</p>
     * 
     * @param request the request parameters of ListResourceShareInvitations  ListResourceShareInvitationsRequest
     * @return ListResourceShareInvitationsResponse
     */
    CompletableFuture<ListResourceShareInvitationsResponse> listResourceShareInvitations(ListResourceShareInvitationsRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to query the permissions that are associated with the resource share created by using the current Alibaba Cloud account in the <code>cn-hangzhou</code> region.</p>
     * 
     * @param request the request parameters of ListResourceSharePermissions  ListResourceSharePermissionsRequest
     * @return ListResourceSharePermissionsResponse
     */
    CompletableFuture<ListResourceSharePermissionsResponse> listResourceSharePermissions(ListResourceSharePermissionsRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to query the resource shares that are created by using the current Alibaba Cloud account in the <code>cn-hangzhou</code> region. The response shows that the following resource shares are created by using the account whose ID is <code>151266687691****</code>:</p>
     * <ul>
     * <li><code>rs-hX9wC5jO****</code>, which is in the <code>Deleted</code> state</li>
     * <li><code>rs-PqysnzIj****</code>, which is in the <code>Active</code> state</li>
     * </ul>
     * 
     * @param request the request parameters of ListResourceShares  ListResourceSharesRequest
     * @return ListResourceSharesResponse
     */
    CompletableFuture<ListResourceSharesResponse> listResourceShares(ListResourceSharesRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to query the resources that you share with other accounts in the <code>cn-hangzhou</code> region. The response shows that in the resource share <code>rs-6GRmdD3X****</code>, you share the <code>vsw-bp1upw03qyz8n7us9****</code> resource of the <code>VSwitch</code> type with other accounts.</p>
     * 
     * @param request the request parameters of ListSharedResources  ListSharedResourcesRequest
     * @return ListSharedResourcesResponse
     */
    CompletableFuture<ListSharedResourcesResponse> listSharedResources(ListSharedResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>If you are a resource owner, you can query the principals with which you share your resources. If you are a principal, you can query the resources that are shared with you.
     * This topic provides an example on how to call the API operation to query the principals with which you share your resources in the <code>cn-hangzhou</code> region. The response shows that you share your resources with the principals <code>114240524784****</code> and <code>172050525300****</code>.</p>
     * 
     * @param request the request parameters of ListSharedTargets  ListSharedTargetsRequest
     * @return ListSharedTargetsResponse
     */
    CompletableFuture<ListSharedTargetsResponse> listSharedTargets(ListSharedTargetsRequest request);

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to reject the resource sharing invitation <code>i-yyTWbkjHArYh****</code> in the <code>cn-hangzhou</code> region.</p>
     * 
     * @param request the request parameters of RejectResourceShareInvitation  RejectResourceShareInvitationRequest
     * @return RejectResourceShareInvitationResponse
     */
    CompletableFuture<RejectResourceShareInvitationResponse> rejectResourceShareInvitation(RejectResourceShareInvitationRequest request);

    /**
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this API operation to change the name or resource sharing scope of a resource share.
     * This topic provides an example on how to call the API operation to change the name of the resource share <code>rs-qSkW1HBY****</code> in the <code>cn-hangzhou</code> region from <code>test</code> to <code>new</code>.</p>
     * 
     * @param request the request parameters of UpdateResourceShare  UpdateResourceShareRequest
     * @return UpdateResourceShareResponse
     */
    CompletableFuture<UpdateResourceShareResponse> updateResourceShare(UpdateResourceShareRequest request);

}
