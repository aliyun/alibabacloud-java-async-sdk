// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcesharing20200110;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.resourcesharing20200110.models.*;
import darabonba.core.utils.*;
import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;

import java.util.concurrent.CompletableFuture;


/**
 * <p>Main client.</p>
 */
public final class DefaultAsyncClient implements AsyncClient {

    protected final String product;
    protected final String version;
    protected final String endpointRule;
    protected final java.util.Map<String, String> endpointMap;
    protected final TeaRequest REQUEST;
    protected final TeaAsyncHandler handler;

    protected DefaultAsyncClient(ClientConfiguration configuration) {
        this.handler = new TeaAsyncHandler(configuration);
        this.product = "ResourceSharing";
        this.version = "2020-01-10";
        this.endpointRule = "regional";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
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
    @Override
    public CompletableFuture<AcceptResourceShareInvitationResponse> acceptResourceShareInvitation(AcceptResourceShareInvitationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AcceptResourceShareInvitation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AcceptResourceShareInvitationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AcceptResourceShareInvitationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to associate the vSwitch <code>vsw-bp183p93qs667muql****</code> and the member <code>172050525300****</code> with the resource share <code>rs-6GRmdD3X****</code> in the <code>cn-hangzhou</code> region. After the association, the vSwitch is shared with the member.</p>
     * 
     * @param request the request parameters of AssociateResourceShare  AssociateResourceShareRequest
     * @return AssociateResourceShareResponse
     */
    @Override
    public CompletableFuture<AssociateResourceShareResponse> associateResourceShare(AssociateResourceShareRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AssociateResourceShare").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AssociateResourceShareResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AssociateResourceShareResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to associate the <code>AliyunRSDefaultPermissionVSwitch</code> permission with the <code>rs-6GRmdD3X****</code> resource share in the <code>cn-hangzhou</code> region.</p>
     * 
     * @param request the request parameters of AssociateResourceSharePermission  AssociateResourceSharePermissionRequest
     * @return AssociateResourceSharePermissionResponse
     */
    @Override
    public CompletableFuture<AssociateResourceSharePermissionResponse> associateResourceSharePermission(AssociateResourceSharePermissionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AssociateResourceSharePermission").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AssociateResourceSharePermissionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AssociateResourceSharePermissionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ChangeResourceGroup  ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    @Override
    public CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ChangeResourceGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChangeResourceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChangeResourceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CheckSharingWithResourceDirectoryStatus  CheckSharingWithResourceDirectoryStatusRequest
     * @return CheckSharingWithResourceDirectoryStatusResponse
     */
    @Override
    public CompletableFuture<CheckSharingWithResourceDirectoryStatusResponse> checkSharingWithResourceDirectoryStatus(CheckSharingWithResourceDirectoryStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CheckSharingWithResourceDirectoryStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckSharingWithResourceDirectoryStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckSharingWithResourceDirectoryStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Resource Sharing allows you to share your resources with one or more accounts and access the resources shared by other accounts. For more information, see <a href="https://help.aliyun.com/document_detail/160622.html">Resource Sharing overview</a>.
     * This topic provides an example on how to call the API operation to create a resource share named <code>test</code> in the <code>cn-hangzhou</code> region to share the vSwitch <code>vsw-bp183p93qs667muql****</code> with the member <code>172050525300****</code> in a resource directory. In this example, the management account of the resource directory is used to call this API operation.</p>
     * 
     * @param request the request parameters of CreateResourceShare  CreateResourceShareRequest
     * @return CreateResourceShareResponse
     */
    @Override
    public CompletableFuture<CreateResourceShareResponse> createResourceShare(CreateResourceShareRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateResourceShare").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateResourceShareResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateResourceShareResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>After a resource share is deleted, all principals in the resource share can no longer access the resources in the resource share. However, the resources are not deleted with the resource share.
     * A resource share that is deleted is in the <code>Deleted</code> state. The system deletes the record of the resource share within 48 hours to 96 hours.
     * This topic provides an example on how to call the API operation to delete the resource share <code>rs-qSkW1HBY****</code> in the <code>cn-hangzhou</code> region.</p>
     * 
     * @param request the request parameters of DeleteResourceShare  DeleteResourceShareRequest
     * @return DeleteResourceShareResponse
     */
    @Override
    public CompletableFuture<DeleteResourceShareResponse> deleteResourceShare(DeleteResourceShareRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteResourceShare").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteResourceShareResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteResourceShareResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    @Override
    public CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRegions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRegionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRegionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DisassociateResourceShareResponse> disassociateResourceShare(DisassociateResourceShareRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisassociateResourceShare").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisassociateResourceShareResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisassociateResourceShareResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to disassociate the <code>AliyunRSDefaultPermissionVSwitch</code> permission from the <code>rs-6GRmdD3X****</code> resource share in the <code>cn-hangzhou</code> region.</p>
     * 
     * @param request the request parameters of DisassociateResourceSharePermission  DisassociateResourceSharePermissionRequest
     * @return DisassociateResourceSharePermissionResponse
     */
    @Override
    public CompletableFuture<DisassociateResourceSharePermissionResponse> disassociateResourceSharePermission(DisassociateResourceSharePermissionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisassociateResourceSharePermission").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisassociateResourceSharePermissionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisassociateResourceSharePermissionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can share your resources with all members in your resource directory, all members in a specific folder in your resource directory, or a specific member in your resource directory as a resource owner only after you enable resource sharing for your resource directory.
     * You can call this API operation only by using the management account of your resource directory or a RAM user or RAM role to which the required permissions are granted within the management account.</p>
     * 
     * @param request the request parameters of EnableSharingWithResourceDirectory  EnableSharingWithResourceDirectoryRequest
     * @return EnableSharingWithResourceDirectoryResponse
     */
    @Override
    public CompletableFuture<EnableSharingWithResourceDirectoryResponse> enableSharingWithResourceDirectory(EnableSharingWithResourceDirectoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableSharingWithResourceDirectory").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableSharingWithResourceDirectoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableSharingWithResourceDirectoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to query the information about the <code>AliyunRSDefaultPermissionVSwitch</code> permission whose version is <code>v1</code> in the <code>cn-hangzhou</code> region.</p>
     * 
     * @param request the request parameters of GetPermission  GetPermissionRequest
     * @return GetPermissionResponse
     */
    @Override
    public CompletableFuture<GetPermissionResponse> getPermission(GetPermissionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetPermission").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPermissionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPermissionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to query the versions of the <code>AliyunRSDefaultPermissionVSwitch</code> permission in the <code>cn-hangzhou</code> region.</p>
     * 
     * @param request the request parameters of ListPermissionVersions  ListPermissionVersionsRequest
     * @return ListPermissionVersionsResponse
     */
    @Override
    public CompletableFuture<ListPermissionVersionsResponse> listPermissionVersions(ListPermissionVersionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListPermissionVersions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPermissionVersionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPermissionVersionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to query the information about the default permission for the <code>VSwitch</code> resource type in the <code>cn-hangzhou</code> region.</p>
     * 
     * @param request the request parameters of ListPermissions  ListPermissionsRequest
     * @return ListPermissionsResponse
     */
    @Override
    public CompletableFuture<ListPermissionsResponse> listPermissions(ListPermissionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListPermissions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPermissionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPermissionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<ListResourceShareAssociationsResponse> listResourceShareAssociations(ListResourceShareAssociationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListResourceShareAssociations").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListResourceShareAssociationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListResourceShareAssociationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a></h3>
     * <p>This topic provides an example on how to call the API operation to query the resource sharing invitations that are received by the current account in the <code>cn-hangzhou</code> region. The response shows that one invitation is received by the current account and is waiting for confirmation.</p>
     * 
     * @param request the request parameters of ListResourceShareInvitations  ListResourceShareInvitationsRequest
     * @return ListResourceShareInvitationsResponse
     */
    @Override
    public CompletableFuture<ListResourceShareInvitationsResponse> listResourceShareInvitations(ListResourceShareInvitationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListResourceShareInvitations").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListResourceShareInvitationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListResourceShareInvitationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to query the permissions that are associated with the resource share created by using the current Alibaba Cloud account in the <code>cn-hangzhou</code> region.</p>
     * 
     * @param request the request parameters of ListResourceSharePermissions  ListResourceSharePermissionsRequest
     * @return ListResourceSharePermissionsResponse
     */
    @Override
    public CompletableFuture<ListResourceSharePermissionsResponse> listResourceSharePermissions(ListResourceSharePermissionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListResourceSharePermissions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListResourceSharePermissionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListResourceSharePermissionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<ListResourceSharesResponse> listResourceShares(ListResourceSharesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListResourceShares").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListResourceSharesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListResourceSharesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to query the resources that you share with other accounts in the <code>cn-hangzhou</code> region. The response shows that in the resource share <code>rs-6GRmdD3X****</code>, you share the <code>vsw-bp1upw03qyz8n7us9****</code> resource of the <code>VSwitch</code> type with other accounts.</p>
     * 
     * @param request the request parameters of ListSharedResources  ListSharedResourcesRequest
     * @return ListSharedResourcesResponse
     */
    @Override
    public CompletableFuture<ListSharedResourcesResponse> listSharedResources(ListSharedResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListSharedResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSharedResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSharedResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If you are a resource owner, you can query the principals with which you share your resources. If you are a principal, you can query the resources that are shared with you.
     * This topic provides an example on how to call the API operation to query the principals with which you share your resources in the <code>cn-hangzhou</code> region. The response shows that you share your resources with the principals <code>114240524784****</code> and <code>172050525300****</code>.</p>
     * 
     * @param request the request parameters of ListSharedTargets  ListSharedTargetsRequest
     * @return ListSharedTargetsResponse
     */
    @Override
    public CompletableFuture<ListSharedTargetsResponse> listSharedTargets(ListSharedTargetsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListSharedTargets").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSharedTargetsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSharedTargetsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    @Override
    public CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTagResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to reject the resource sharing invitation <code>i-yyTWbkjHArYh****</code> in the <code>cn-hangzhou</code> region.</p>
     * 
     * @param request the request parameters of RejectResourceShareInvitation  RejectResourceShareInvitationRequest
     * @return RejectResourceShareInvitationResponse
     */
    @Override
    public CompletableFuture<RejectResourceShareInvitationResponse> rejectResourceShareInvitation(RejectResourceShareInvitationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RejectResourceShareInvitation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RejectResourceShareInvitationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RejectResourceShareInvitationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    @Override
    public CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TagResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    @Override
    public CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UntagResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UntagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UntagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this API operation to change the name or resource sharing scope of a resource share.
     * This topic provides an example on how to call the API operation to change the name of the resource share <code>rs-qSkW1HBY****</code> in the <code>cn-hangzhou</code> region from <code>test</code> to <code>new</code>.</p>
     * 
     * @param request the request parameters of UpdateResourceShare  UpdateResourceShareRequest
     * @return UpdateResourceShareResponse
     */
    @Override
    public CompletableFuture<UpdateResourceShareResponse> updateResourceShare(UpdateResourceShareRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateResourceShare").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateResourceShareResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateResourceShareResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
