// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.resourcemanager20200331.models.*;
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
        this.product = "ResourceManager";
        this.version = "2020-03-31";
        this.endpointRule = "central";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
      * After an invited Alibaba Cloud account joins a resource directory, it becomes a member of the resource directory. By default, the name of the invited Alibaba Cloud account is used as the display name of the account in the resource directory.
      * This topic provides an example on how to call the API operation to accept the invitation `h-Ih8IuPfvV0t0****` that is initiated to invite the Alibaba Cloud account `177242285274****` to join the resource directory `rd-3G****`.
      *
     */
    @Override
    public CompletableFuture<AcceptHandshakeResponse> acceptHandshake(AcceptHandshakeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AcceptHandshake").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AcceptHandshakeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AcceptHandshakeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * After you attach an access control policy, the operations performed on resources by using members are limited by the policy. Make sure that the attached policy meets your expectations. Otherwise, your business may be affected.
      * By default, the system access control policy FullAliyunAccess is attached to each folder and member.
      * The access control policy that is attached to a folder also applies to all its subfolders and all members in the subfolders.
      * A maximum of 10 access control policies can be attached to a folder or member.
      * This topic provides an example on how to call the API operation to attach the custom access control policy `cp-jExXAqIYkwHN****` to the folder `fd-ZDNPiT****`.
      *
     */
    @Override
    public CompletableFuture<AttachControlPolicyResponse> attachControlPolicy(AttachControlPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AttachControlPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AttachControlPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AttachControlPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * In this example, the policy `AdministratorAccess` is attached to the RAM user `alice@demo.onaliyun.com` and takes effect only for resources in the `rg-9gLOoK****` resource group.
      *
     */
    @Override
    public CompletableFuture<AttachPolicyResponse> attachPolicy(AttachPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AttachPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AttachPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AttachPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You can call this API operation only to bind a mobile phone number to a member of the resource account type. You cannot call this API operation to change the mobile phone number that is bound to a member of the resource account type.
      * To ensure that the system can record the operators of management operations, you must use a RAM user or RAM role to which the AliyunResourceDirectoryFullAccess policy is attached within the management account of your resource directory to call this API operation.
      * This topic provides an example on how to call the API operation to bind a mobile phone number to the member `138660628348****` for security purposes.
      *
     */
    @Override
    public CompletableFuture<BindSecureMobilePhoneResponse> bindSecureMobilePhone(BindSecureMobilePhoneRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BindSecureMobilePhone").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BindSecureMobilePhoneResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BindSecureMobilePhoneResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CancelChangeAccountEmailResponse> cancelChangeAccountEmail(CancelChangeAccountEmailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelChangeAccountEmail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelChangeAccountEmailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelChangeAccountEmailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CancelCreateCloudAccountResponse> cancelCreateCloudAccount(CancelCreateCloudAccountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelCreateCloudAccount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelCreateCloudAccountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelCreateCloudAccountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * This topic provides an example on how to call the API operation to cancel the invitation whose ID is `h-ycm4rp****`.
      *
     */
    @Override
    public CompletableFuture<CancelHandshakeResponse> cancelHandshake(CancelHandshakeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelHandshake").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelHandshakeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelHandshakeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CancelPromoteResourceAccountResponse> cancelPromoteResourceAccount(CancelPromoteResourceAccountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelPromoteResourceAccount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelPromoteResourceAccountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelPromoteResourceAccountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ChangeAccountEmailResponse> changeAccountEmail(ChangeAccountEmailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ChangeAccountEmail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChangeAccountEmailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChangeAccountEmailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * Before you delete a member, you must call this API operation to check whether the member can be deleted.
      * This topic provides an example on how to call the API operation to perform a deletion check on the member whose ID is `179855839641****`.
      *
     */
    @Override
    public CompletableFuture<CheckAccountDeleteResponse> checkAccountDelete(CheckAccountDeleteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CheckAccountDelete").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckAccountDeleteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckAccountDeleteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * A resource directory supports two types of member accounts: resource accounts and cloud accounts.
      * *   Resource account (recommended): A resource account is only used as a resource container and fully depends on a resource directory. Such member accounts are secure and easy-to-create. For more information about how to create a resource account, see [CreateResourceAccount](~~159392~~).
      * >  A resource account can be upgraded to a cloud account. For more information, see [PromoteResourceAccount](~~159395~~) .
      * *   Cloud account: A cloud account has all the features of an Alibaba Cloud account, including root permissions.
      *
     */
    @Override
    public CompletableFuture<CreateCloudAccountResponse> createCloudAccount(CreateCloudAccountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateCloudAccount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCloudAccountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCloudAccountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * This topic provides an example on how to call the API operation to create a custom access control policy named `ExampleControlPolicy`. This access control policy is used to prohibit modifications to the ResourceDirectoryAccountAccessRole role and the permissions of the role.
      *
     */
    @Override
    public CompletableFuture<CreateControlPolicyResponse> createControlPolicy(CreateControlPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateControlPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateControlPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateControlPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * >  A maximum of five levels of folders can be created under the root folder.
      * In this example, a folder named `rdFolder` is created under the root folder.
      *
     */
    @Override
    public CompletableFuture<CreateFolderResponse> createFolder(CreateFolderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateFolder").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateFolderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateFolderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreatePolicyResponse> createPolicy(CreatePolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreatePolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreatePolicyVersionResponse> createPolicyVersion(CreatePolicyVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreatePolicyVersion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePolicyVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePolicyVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * A member serves as a container for resources and is also an organizational unit in a resource directory. A member indicates a project or application. The resources of different members are isolated.
      * This topic provides an example on how to call the API operation to create a member in the `fd-r23M55****` folder. The display name of the member is `Dev`, and the prefix for the Alibaba Cloud account name of the member is `alice`.
      *
     */
    @Override
    public CompletableFuture<CreateResourceAccountResponse> createResourceAccount(CreateResourceAccountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateResourceAccount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateResourceAccountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateResourceAccountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * For more information about common request parameters, see [Common parameters](~~159973~~).
      *
     */
    @Override
    public CompletableFuture<CreateResourceGroupResponse> createResourceGroup(CreateResourceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateResourceGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateResourceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateResourceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateRoleResponse> createRole(CreateRoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateRole").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateRoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateRoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateServiceLinkedRoleResponse> createServiceLinkedRole(CreateServiceLinkedRoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateServiceLinkedRole").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateServiceLinkedRoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateServiceLinkedRoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeclineHandshakeResponse> declineHandshake(DeclineHandshakeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeclineHandshake").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeclineHandshakeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeclineHandshakeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * The ID of the member that you want to delete.
      *
     */
    @Override
    public CompletableFuture<DeleteAccountResponse> deleteAccount(DeleteAccountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteAccount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAccountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAccountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * If you want to delete a custom control policy that is attached to folders or member accounts, you must call the [DetachControlPolicy](~~208331~~) operation to detach the policy before you delete it.
      * In this example, the custom control policy `cp-SImPt8GCEwiq****` is deleted.
      *
     */
    @Override
    public CompletableFuture<DeleteControlPolicyResponse> deleteControlPolicy(DeleteControlPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteControlPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteControlPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteControlPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * >  Before you delete a folder, make sure that the folder does not contain any member accounts or child folders.
      *
     */
    @Override
    public CompletableFuture<DeleteFolderResponse> deleteFolder(DeleteFolderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteFolder").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteFolderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteFolderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > 
      * *   Before you delete a policy, you must delete all non-default versions of the policy. For more information about how to delete a policy version, see [DeletePolicyVersion](~~159041~~).
      * *   Before you delete a policy, make sure that the policy is not referenced. This means that the policy is not attached to RAM users, RAM user groups, or RAM roles. For more information about how to detach a policy, see [DetachPolicy](~~159168~~).
      *
     */
    @Override
    public CompletableFuture<DeletePolicyResponse> deletePolicy(DeletePolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeletePolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeletePolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeletePolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * >  The default version of a permission policy cannot be deleted.
      *
     */
    @Override
    public CompletableFuture<DeletePolicyVersionResponse> deletePolicyVersion(DeletePolicyVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeletePolicyVersion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeletePolicyVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeletePolicyVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * >  Before you delete a resource group, you must delete all the resources in it.
      * In this example, the resource group whose ID is `rg-9gLOoK****` is deleted.
      *
     */
    @Override
    public CompletableFuture<DeleteResourceGroupResponse> deleteResourceGroup(DeleteResourceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteResourceGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteResourceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteResourceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteRoleResponse> deleteRole(DeleteRoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteRole").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteRoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteRoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteServiceLinkedRoleResponse> deleteServiceLinkedRole(DeleteServiceLinkedRoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteServiceLinkedRole").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteServiceLinkedRoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteServiceLinkedRoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * >  If the delegated administrator account that you want to remove has historical management tasks in the related trusted service, the trusted service may be affected after the delegated administrator account is removed. Therefore, proceed with caution.
      * This topic provides an example on how to call the API operation to remove the delegated administrator account `181761095690****` for Cloud Firewall.
      *
     */
    @Override
    public CompletableFuture<DeregisterDelegatedAdministratorResponse> deregisterDelegatedAdministrator(DeregisterDelegatedAdministratorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeregisterDelegatedAdministrator").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeregisterDelegatedAdministratorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeregisterDelegatedAdministratorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * Before you disable a resource directory, make sure that the following requirements are met:
      * *   All member accounts must be removed from the resource directory. For more information about how to remove a member account, see [RemoveCloudAccount](~~159431~~).
      * *   All folders except the root folder must be deleted from the resource directory. For more information about how to delete a folder, see [DeleteFolder](~~159432~~).
      *
     */
    @Override
    public CompletableFuture<DestroyResourceDirectoryResponse> destroyResourceDirectory(DestroyResourceDirectoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DestroyResourceDirectory").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DestroyResourceDirectoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DestroyResourceDirectoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * After you detach an access control policy, the operations performed on resources by using members are not limited by the policy. Make sure that the detached policy meets your expectations. Otherwise, your business may be affected.
      * Both the system and custom access control policies can be detached. If an object has only one access control policy attached, the policy cannot be detached.
      * This topic provides an example on how to call the API operation to detach the custom control policy `cp-jExXAqIYkwHN****` from the folder `fd-ZDNPiT****`.
      *
     */
    @Override
    public CompletableFuture<DetachControlPolicyResponse> detachControlPolicy(DetachControlPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetachControlPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetachControlPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetachControlPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DetachPolicyResponse> detachPolicy(DetachPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetachPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetachPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetachPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DisableAssociatedTransferResponse> disableAssociatedTransfer(DisableAssociatedTransferRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisableAssociatedTransfer").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableAssociatedTransferResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableAssociatedTransferResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * After you disable the Control Policy feature, the system automatically detaches all control policies that are attached to folders and member accounts. The system does not delete these control policies, but you cannot attach them to folders or member accounts again.
      * >  If you disable the Control Policy feature, the permissions of all folders and member accounts in a resource directory are affected. You must proceed with caution.
      *
     */
    @Override
    public CompletableFuture<DisableControlPolicyResponse> disableControlPolicy(DisableControlPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisableControlPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableControlPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableControlPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<EnableAssociatedTransferResponse> enableAssociatedTransfer(EnableAssociatedTransferRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableAssociatedTransfer").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableAssociatedTransferResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableAssociatedTransferResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * The Control Policy feature allows you to manage the permission boundaries of the folders or member accounts in a resource directory in a centralized manner. This feature is implemented based on the resource directory. You can use this feature to develop common or dedicated rules for access control. The Control Policy feature does not grant permissions but only defines permission boundaries. A member account in a resource directory can be used to access resources only after it is granted the required permissions by using the Resource Access Management (RAM) service. For more information, see [Overview of the Control Policy feature](~~178671~~).
      *
     */
    @Override
    public CompletableFuture<EnableControlPolicyResponse> enableControlPolicy(EnableControlPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableControlPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableControlPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableControlPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You can use the current account or a newly created account to enable a resource directory. For more information, see [Enable a resource directory](~~111215~~).
      * In this example, the current account is used to enable a resource directory.
      *
     */
    @Override
    public CompletableFuture<EnableResourceDirectoryResponse> enableResourceDirectory(EnableResourceDirectoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableResourceDirectory").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableResourceDirectoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableResourceDirectoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * This topic provides an example on how to call the API operation to query the information of the member whose Alibaba Cloud account ID is `181761095690****`.
      *
     */
    @Override
    public CompletableFuture<GetAccountResponse> getAccount(GetAccountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAccount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAccountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAccountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * After you call the [CheckAccountDelete](~~448542~~) operation to perform a member deletion check, you can call the GetAccountDeletionCheckResult operation to query the check result. If the check result shows that the member meets deletion requirements, you can delete the member. Otherwise, you need to first modify the items that do not meet requirements.
      * This topic provides an example on how to call the API operation to query the result of the deletion check for the member whose ID is `179855839641****`. The response shows that the member does not meet deletion requirements.
      *
     */
    @Override
    public CompletableFuture<GetAccountDeletionCheckResultResponse> getAccountDeletionCheckResult(GetAccountDeletionCheckResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAccountDeletionCheckResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAccountDeletionCheckResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAccountDeletionCheckResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * This topic provides an example on how to call the API operation to query the deletion status of the member whose Alibaba Cloud account ID is `169946124551****`. The response shows that the member is deleted.
      *
     */
    @Override
    public CompletableFuture<GetAccountDeletionStatusResponse> getAccountDeletionStatus(GetAccountDeletionStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAccountDeletionStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAccountDeletionStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAccountDeletionStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * This topic provides an example on how to call the API operation to query the details of the access control policy whose ID is `cp-SImPt8GCEwiq****`.
      *
     */
    @Override
    public CompletableFuture<GetControlPolicyResponse> getControlPolicy(GetControlPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetControlPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetControlPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetControlPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetControlPolicyEnablementStatusResponse> getControlPolicyEnablementStatus(GetControlPolicyEnablementStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetControlPolicyEnablementStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetControlPolicyEnablementStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetControlPolicyEnablementStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * In this example, the information of the folder `fd-Jyl5U7****` is queried.
      *
     */
    @Override
    public CompletableFuture<GetFolderResponse> getFolder(GetFolderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetFolder").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetFolderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetFolderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * In this example, the information of the invitation whose ID is `h-ycm4rp****` is queried.
      *
     */
    @Override
    public CompletableFuture<GetHandshakeResponse> getHandshake(GetHandshakeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetHandshake").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetHandshakeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetHandshakeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetPayerForAccountResponse> getPayerForAccount(GetPayerForAccountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetPayerForAccount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPayerForAccountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPayerForAccountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetPolicyResponse> getPolicy(GetPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetPolicyVersionResponse> getPolicyVersion(GetPolicyVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetPolicyVersion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPolicyVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPolicyVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * This topic provides an example on how to use a management account to call the API operation to query the information of the resource directory that is enabled by using the management account.
      *
     */
    @Override
    public CompletableFuture<GetResourceDirectoryResponse> getResourceDirectory(GetResourceDirectoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetResourceDirectory").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetResourceDirectoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetResourceDirectoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * For more information about common request parameters, see [Common parameters](~~159973~~).
      *
     */
    @Override
    public CompletableFuture<GetResourceGroupResponse> getResourceGroup(GetResourceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetResourceGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetResourceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetResourceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetRoleResponse> getRole(GetRoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetRole").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetRoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetRoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetServiceLinkedRoleDeletionStatusResponse> getServiceLinkedRoleDeletionStatus(GetServiceLinkedRoleDeletionStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetServiceLinkedRoleDeletionStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetServiceLinkedRoleDeletionStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetServiceLinkedRoleDeletionStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > 
      * *   An account can be used to enable a resource directory only after it passes enterprise real-name verification. An account that only passed individual real-name verification cannot be used to enable a resource directory.
      * *   We recommend that you only use the enterprise management account as the administrator of the resource directory. Do not use the enterprise management account to purchase cloud resources.
      *
     */
    @Override
    public CompletableFuture<InitResourceDirectoryResponse> initResourceDirectory(InitResourceDirectoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("InitResourceDirectory").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InitResourceDirectoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InitResourceDirectoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * This topic provides an example on how to call the API operation to invite the account `someone@example.com` to join a resource directory.
      *
     */
    @Override
    public CompletableFuture<InviteAccountToResourceDirectoryResponse> inviteAccountToResourceDirectory(InviteAccountToResourceDirectoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("InviteAccountToResourceDirectory").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InviteAccountToResourceDirectoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InviteAccountToResourceDirectoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You can use only the management account of a resource directory or a delegated administrator account of a trusted service to call this operation.
      *
     */
    @Override
    public CompletableFuture<ListAccountsResponse> listAccounts(ListAccountsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAccounts").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAccountsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAccountsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListAccountsForParentResponse> listAccountsForParent(ListAccountsForParentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAccountsForParent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAccountsForParentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAccountsForParentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListAncestorsResponse> listAncestors(ListAncestorsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAncestors").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAncestorsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAncestorsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * This topic provides an example on how to call the API operation to query the system access control policies within a resource directory. The response shows that the resource directory has only one system access control policy. The policy is named `FullAliyunAccess`.
      *
     */
    @Override
    public CompletableFuture<ListControlPoliciesResponse> listControlPolicies(ListControlPoliciesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListControlPolicies").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListControlPoliciesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListControlPoliciesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * This topic provides an example on how to call the API operation to query the access control policies that are attached to the folder `fd-ZDNPiT****`.
      *
     */
    @Override
    public CompletableFuture<ListControlPolicyAttachmentsForTargetResponse> listControlPolicyAttachmentsForTarget(ListControlPolicyAttachmentsForTargetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListControlPolicyAttachmentsForTarget").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListControlPolicyAttachmentsForTargetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListControlPolicyAttachmentsForTargetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * This topic provides an example on how to call the API operation to query all delegated administrator accounts in a resource directory. The response shows that two delegated administrator accounts for Cloud Firewall exist in the resource directory.
      *
     */
    @Override
    public CompletableFuture<ListDelegatedAdministratorsResponse> listDelegatedAdministrators(ListDelegatedAdministratorsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDelegatedAdministrators").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDelegatedAdministratorsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDelegatedAdministratorsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * This topic provides an example on how to call the API operation to query the trusted services for which the member `138660628348****` is specified as a delegated administrator account. The response shows that the member is specified as a delegated administrator account of Cloud Firewall.
      *
     */
    @Override
    public CompletableFuture<ListDelegatedServicesForAccountResponse> listDelegatedServicesForAccount(ListDelegatedServicesForAccountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDelegatedServicesForAccount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDelegatedServicesForAccountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDelegatedServicesForAccountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * >  You can view the information of only the first-level subfolders of a folder.
      *
     */
    @Override
    public CompletableFuture<ListFoldersForParentResponse> listFoldersForParent(ListFoldersForParentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListFoldersForParent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListFoldersForParentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListFoldersForParentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * This topic provides an example on how to call the API operation to query the invitations that are associated with the management account `172841235500****`. The response shows that two invitations are associated with the management account.
      *
     */
    @Override
    public CompletableFuture<ListHandshakesForAccountResponse> listHandshakesForAccount(ListHandshakesForAccountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListHandshakesForAccount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListHandshakesForAccountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListHandshakesForAccountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListHandshakesForResourceDirectoryResponse> listHandshakesForResourceDirectory(ListHandshakesForResourceDirectoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListHandshakesForResourceDirectory").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListHandshakesForResourceDirectoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListHandshakesForResourceDirectoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListPoliciesResponse> listPolicies(ListPoliciesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListPolicies").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPoliciesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPoliciesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You can view the following information:
      * *   Policy attachment records under an Alibaba Cloud account or a resource group
      * *   Policies attached to RAM users, RAM user groups, or RAM roles
      * *   RAM users, RAM user groups, or RAM roles to which policies are attached under an Alibaba Cloud account or a resource group
      *
     */
    @Override
    public CompletableFuture<ListPolicyAttachmentsResponse> listPolicyAttachments(ListPolicyAttachmentsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListPolicyAttachments").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPolicyAttachmentsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPolicyAttachmentsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListPolicyVersionsResponse> listPolicyVersions(ListPolicyVersionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListPolicyVersions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPolicyVersionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPolicyVersionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You can call this API operation to query all resource groups within the current account. You can also call this API operation to query a specific resource group based on the status, ID, identifier, or display name of the resource group.
      * This topic provides an example on how to call the API operation to query the basic information about the resource groups `rg-1hSBH2****` and `rg-9gLOoK****` within the current account.
      *
     */
    @Override
    public CompletableFuture<ListResourceGroupsResponse> listResourceGroups(ListResourceGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListResourceGroups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListResourceGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListResourceGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * >  You can use a RAM role that is not associated with a session policy to call this API operation.
      * This topic provides an example on how to call the API operation to query resources that can be accessed by the current account in resource groups. The response shows that the current account can access only the Elastic Compute Service (ECS) instance `i-23v38****` in the resource group `rg-uPJpP****`.
      *
     */
    @Override
    public CompletableFuture<ListResourcesResponse> listResources(ListResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListRolesResponse> listRoles(ListRolesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListRoles").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRolesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRolesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * This topic provides an example on how to call the API operation to query tag keys. The response shows that the custom tag key team exists.
      *
     */
    @Override
    public CompletableFuture<ListTagKeysResponse> listTagKeys(ListTagKeysRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTagKeys").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTagKeysResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTagKeysResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * This topic provides an example on how to call the API operation to query the tags that are added to the resource group with an ID of `rg-aekz6bre2uq****`. The response shows that only the `k1:v1` tag is added to the resource group.
      *
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
      * This topic provides an example on how to call the API operation to query the tag values of the tag key k1. The response shows that the tag value of the tag key k1 is v1.
      *
     */
    @Override
    public CompletableFuture<ListTagValuesResponse> listTagValues(ListTagValuesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTagValues").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTagValuesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTagValuesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * In this example, the folders or member accounts to which the control policy `cp-jExXAqIYkwHN****` is attached are queried. The returned result shows that the control policy is attached to the folder `fd-ZDNPiT****`.
      *
     */
    @Override
    public CompletableFuture<ListTargetAttachmentsForControlPolicyResponse> listTargetAttachmentsForControlPolicy(ListTargetAttachmentsForControlPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTargetAttachmentsForControlPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTargetAttachmentsForControlPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTargetAttachmentsForControlPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * >  Only an enterprise management account or delegated administrator account can be used to call this operation.
      * In this example, the trusted services that are enabled within an enterprise management account are queried. The returned result shows that the trusted services Cloud Config and ActionTrail are enabled within the enterprise management account.
      *
     */
    @Override
    public CompletableFuture<ListTrustedServiceStatusResponse> listTrustedServiceStatus(ListTrustedServiceStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTrustedServiceStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTrustedServiceStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTrustedServiceStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<MoveAccountResponse> moveAccount(MoveAccountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("MoveAccount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MoveAccountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MoveAccountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * For more information about Alibaba Cloud services whose resources can be moved between resource groups, see the **Supported by the API** column in [Alibaba Cloud services that support resource groups](~~94479~~).
      * In this example, two virtual private clouds (VPCs) `vpc-bp1sig0mjktx5ewx1****` and `vpc-bp1visxm225pv49dz****` that reside in different regions and belong to different resource groups are moved to the resource group `rg-aekzmeobk5w****`.
      *
     */
    @Override
    public CompletableFuture<MoveResourcesResponse> moveResources(MoveResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("MoveResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MoveResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MoveResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<PromoteResourceAccountResponse> promoteResourceAccount(PromoteResourceAccountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PromoteResourceAccount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PromoteResourceAccountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PromoteResourceAccountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * The delegated administrator account can be used to access the information of the resource directory and view the structure and members of the resource directory. The delegated administrator account can also be used to perform service-related management operations in the trusted service on behalf of the management account of the resource directory.
      * When you call this operation, you must take note of the following limits:
      * *   Only some trusted services support delegated administrator accounts. For more information, see [Supported trusted services](~~208133~~).
      * *   Only the management account of a resource directory or an authorized RAM user or RAM role of the management account can be used to call this operation.
      * *   The number of delegated administrator accounts that are allowed for a trusted service is defined by the trusted service.
      * This topic provides an example on how to call the API operation to specify the member `181761095690****` as a delegated administrator account of Cloud Firewall.
      *
     */
    @Override
    public CompletableFuture<RegisterDelegatedAdministratorResponse> registerDelegatedAdministrator(RegisterDelegatedAdministratorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RegisterDelegatedAdministrator").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RegisterDelegatedAdministratorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RegisterDelegatedAdministratorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * This topic provides an example on how to call the API operation to remove the member `177242285274****` from a resource directory.
      *
     */
    @Override
    public CompletableFuture<RemoveCloudAccountResponse> removeCloudAccount(RemoveCloudAccountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveCloudAccount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveCloudAccountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveCloudAccountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ResendCreateCloudAccountEmailResponse> resendCreateCloudAccountEmail(ResendCreateCloudAccountEmailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ResendCreateCloudAccountEmail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResendCreateCloudAccountEmailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResendCreateCloudAccountEmailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ResendPromoteResourceAccountEmailResponse> resendPromoteResourceAccountEmail(ResendPromoteResourceAccountEmailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ResendPromoteResourceAccountEmail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResendPromoteResourceAccountEmailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResendPromoteResourceAccountEmailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<RetryChangeAccountEmailResponse> retryChangeAccountEmail(RetryChangeAccountEmailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RetryChangeAccountEmail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RetryChangeAccountEmailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RetryChangeAccountEmailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * To ensure that the system can record the operators of management operations, you must use a RAM user or RAM role to which the AliyunResourceDirectoryFullAccess policy is attached within the management account of your resource directory to call this operation.
      * In this example, a verification code is sent to the mobile phone number that you want to bind to the resource account `138660628348****`.
      *
     */
    @Override
    public CompletableFuture<SendVerificationCodeForBindSecureMobilePhoneResponse> sendVerificationCodeForBindSecureMobilePhone(SendVerificationCodeForBindSecureMobilePhoneRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SendVerificationCodeForBindSecureMobilePhone").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SendVerificationCodeForBindSecureMobilePhoneResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SendVerificationCodeForBindSecureMobilePhoneResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * Each Alibaba Cloud account can be used to send a maximum of 100 verification codes per day.
      *
     */
    @Override
    public CompletableFuture<SendVerificationCodeForEnableRDResponse> sendVerificationCodeForEnableRD(SendVerificationCodeForEnableRDRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SendVerificationCodeForEnableRD").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SendVerificationCodeForEnableRDResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SendVerificationCodeForEnableRDResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<SetDefaultPolicyVersionResponse> setDefaultPolicyVersion(SetDefaultPolicyVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetDefaultPolicyVersion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetDefaultPolicyVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetDefaultPolicyVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * Members of the resource account type can be deleted only after the member deletion feature is enabled.
      *
     */
    @Override
    public CompletableFuture<SetMemberDeletionPermissionResponse> setMemberDeletionPermission(SetMemberDeletionPermissionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetMemberDeletionPermission").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetMemberDeletionPermissionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetMemberDeletionPermissionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * This topic provides an example on how to call the API operation to add the tag `k1:v1` to the resource group with an ID of `rg-aekz6bre2uq****`.
      *
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
      * This topic provides an example on how to call the API operation to remove the tag whose tag key is `k1` from the resource group whose ID is `rg-aek2dpwyrfr****`.
      *
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
      * *   To ensure that the system can record the operators of management operations, you must use a RAM user or RAM role to which the AliyunResourceDirectoryFullAccess policy is attached within the management account of your resource directory to call this operation.
      * *   Before you switch the type of a member from resource account to cloud account, make sure that specific conditions are met. For more information about the conditions, see [Switch a resource account to a cloud account](~~111233~~).
      * *   Before you switch the type of a member from cloud account to resource account, make sure that specific conditions are met. For more information about the conditions, see [Switch a cloud account to a resource account](~~209980~~).
      * This example provides an example on how to call the API operation to change the display name of the member `12323344****` to `admin`.
      *
     */
    @Override
    public CompletableFuture<UpdateAccountResponse> updateAccount(UpdateAccountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateAccount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAccountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAccountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * In this example, the name of the access control policy whose ID is `cp-jExXAqIYkwHN****` is changed to `NewControlPolicy`.
      *
     */
    @Override
    public CompletableFuture<UpdateControlPolicyResponse> updateControlPolicy(UpdateControlPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateControlPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateControlPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateControlPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<UpdateFolderResponse> updateFolder(UpdateFolderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateFolder").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateFolderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateFolderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * In this example, the display name of the resource group `rg-9gLOoK****` is changed to `project`.
      *
     */
    @Override
    public CompletableFuture<UpdateResourceGroupResponse> updateResourceGroup(UpdateResourceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateResourceGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateResourceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateResourceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * In this example, the description of the RAM role `ECSAdmin` is updated to `ECS administrator`.
      *
     */
    @Override
    public CompletableFuture<UpdateRoleResponse> updateRole(UpdateRoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateRole").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateRoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateRoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
