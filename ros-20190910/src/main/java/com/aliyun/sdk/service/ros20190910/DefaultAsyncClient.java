// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.ros20190910.models.*;
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
        this.product = "ROS";
        this.version = "2019-09-10";
        this.endpointRule = "central";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of CancelStackOperation  CancelStackOperationRequest
     * @return CancelStackOperationResponse
     */
    @Override
    public CompletableFuture<CancelStackOperationResponse> cancelStackOperation(CancelStackOperationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelStackOperation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelStackOperationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelStackOperationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CancelUpdateStack  CancelUpdateStackRequest
     * @return CancelUpdateStackResponse
     */
    @Override
    public CompletableFuture<CancelUpdateStackResponse> cancelUpdateStack(CancelUpdateStackRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelUpdateStack").setMethod(HttpMethod.POST).setPathRegex("/V2/CancelUpdateStack").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelUpdateStackResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelUpdateStackResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to continue to create a stack after the stack fails to be created. In this example, the stack whose ID is <code>4a6c9851-3b0f-4f5f-b4ca-a14bf691****</code> is created in the China (Hangzhou) region.</p>
     * 
     * @param request the request parameters of ContinueCreateStack  ContinueCreateStackRequest
     * @return ContinueCreateStackResponse
     */
    @Override
    public CompletableFuture<ContinueCreateStackResponse> continueCreateStack(ContinueCreateStackRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ContinueCreateStack").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ContinueCreateStackResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ContinueCreateStackResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateAITask  CreateAITaskRequest
     * @return CreateAITaskResponse
     */
    @Override
    public CompletableFuture<CreateAITaskResponse> createAITask(CreateAITaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAITask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAITaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAITaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Scenarios</h3>
     * <h4><a href="#"></a>Use a change set to create a stack</h4>
     * <p>If you want to manage a large number of cloud resources and preview the creation effect of the resources before a stack that contains the resources is created, you can create the stack by using a change set. In this case, you must set <code>ChangeSetType</code> to CREATE and configure the relevant parameters. For more information about change sets, see <a href="https://help.aliyun.com/document_detail/155649.html">Change set</a>.</p>
     * <h4><a href="#"></a>Use a change set to update a stack</h4>
     * <p>If you want to preview the impacts of changes to an existing stack before you update the stack resources, you can create a change set for the stack. In this case, you must set ChangeSetType to UPDATE and configure the relevant parameters. For more information about change sets, see <a href="https://help.aliyun.com/document_detail/155649.html">Change set</a>.</p>
     * <h4><a href="#"></a>Use a change set and existing resources to create a stack</h4>
     * <p>If you want to add existing cloud resources to a new stack for centralized management, you can use a change set to create a stack and import the resources to the stack. In this case, you must set ChangeSetType to IMPORT and configure the relevant parameters. For more information about the resource import feature, see <a href="https://help.aliyun.com/document_detail/193454.html">Overview</a>.</p>
     * <h4><a href="#"></a>Use a change set and existing resources to update a stack</h4>
     * <p>If you want to import existing resources to an existing stack for centralized management, you can use a change set to update the stack. In this case, you must set ChangeSetType to IMPORT and configure the relevant parameters. For more information about the resource import feature, see <a href="https://help.aliyun.com/document_detail/193454.html">Overview</a>.</p>
     * <h3><a href="#"></a>Limits</h3>
     * <ul>
     * <li>You can use change sets to update only stacks that are in specific states. For more information, see <a href="https://help.aliyun.com/document_detail/155873.html">Use a change set to update a stack</a>.</li>
     * <li>A stack can have up to 20 change sets.</li>
     * <li>Change sets reflect only the changes to stacks. Change sets do not reflect whether stacks can be successfully updated.</li>
     * <li>A change set does not check if you exceed an account limit, if you update resources that cannot be updated, or if you have insufficient permissions to modify resources, all of which can cause a stack update to fail. If a stack update fails, Resource Orchestration Service (ROS) attempts to roll back your resources to their original status.
     * This topic provides an example on how to use a change set to update a stack. In this example, a change set named <code>MyChangeSet</code> is created in the <code>China (Hangzhou)</code> region. The template of a stack whose ID is <code>4a6c9851-3b0f-4f5f-b4ca-a14bf691****</code> is updated to <code>{&quot;ROSTemplateFormatVersion&quot;:&quot;2015-09-01&quot;}</code>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateChangeSet  CreateChangeSetRequest
     * @return CreateChangeSetResponse
     */
    @Override
    public CompletableFuture<CreateChangeSetResponse> createChangeSet(CreateChangeSetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateChangeSet").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateChangeSetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateChangeSetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateDiagnostic  CreateDiagnosticRequest
     * @return CreateDiagnosticResponse
     */
    @Override
    public CompletableFuture<CreateDiagnosticResponse> createDiagnostic(CreateDiagnosticRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDiagnostic").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDiagnosticResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDiagnosticResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>A stack is a collection of ROS resources that you can manage as a single unit. To create a collection of resources, you can create a stack. For more information about stacks, see <a href="https://help.aliyun.com/document_detail/172973.html">Overview</a>.\
     * When you call the operation, take note of the following limits:</p>
     * <ul>
     * <li>You can create up to 200 stacks within an Alibaba Cloud account.</li>
     * <li>You can create up to 200 resources in a stack.
     * This topic provides an example on how to create a stack named <code>MyStack</code> in the China (Hangzhou) region by using a template. In this example, <code>TemplateBody</code> is set to <code>{&quot;ROSTemplateFormatVersion&quot;:&quot;2015-09-01&quot;}</code>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateStack  CreateStackRequest
     * @return CreateStackResponse
     */
    @Override
    public CompletableFuture<CreateStackResponse> createStack(CreateStackRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateStack").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateStackResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateStackResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>A stack group is a collection of ROS stacks that you can manage as a unit. You can use an ROS template of a stack group to create stacks within Alibaba Cloud accounts across regions.
     * You can create a stack group that is granted self-managed or service-managed permissions:</p>
     * <ul>
     * <li>If you use an Alibaba Cloud account to create a self-managed stack group, the administrator account and the execution account are Alibaba Cloud accounts.</li>
     * <li>If you enable a resource directory and use the management account or a delegated administrator account of the resource directory to create a service-managed stack group, the administrator account is the management account or delegated administrator account, and the execution account is a member account of the resource directory.
     * For more information about stack groups, see <a href="https://help.aliyun.com/document_detail/154578.html">Overview</a>.
     * In this topic, a stack group named <code>MyStackGroup</code> is created in the <code>China (Hangzhou)</code> region and granted the self-managed permissions. In this example, the template whose ID is <code>5ecd1e10-b0e9-4389-a565-e4c15efc****</code> is used.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateStackGroup  CreateStackGroupRequest
     * @return CreateStackGroupResponse
     */
    @Override
    public CompletableFuture<CreateStackGroupResponse> createStackGroup(CreateStackGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateStackGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateStackGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateStackGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that a stack group is created. For more information, see <a href="https://help.aliyun.com/document_detail/151333.html">CreateStackGroup</a>.
     * In this topic, the stack group named <code>MyStackGroup</code> is used. The stack group is created in the China (Hangzhou) region and granted the self-managed permissions. In this example, stacks are created by using Alibaba Cloud accounts whose IDs are <code>151266687691****</code> and <code>141261387191****</code> in the China (Hangzhou) region and China (Beijing) region.</p>
     * 
     * @param request the request parameters of CreateStackInstances  CreateStackInstancesRequest
     * @return CreateStackInstancesResponse
     */
    @Override
    public CompletableFuture<CreateStackInstancesResponse> createStackInstances(CreateStackInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateStackInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateStackInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateStackInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>In this topic, a custom template named <code>MyTemplate</code> is created in the <code>cn-hangzhou</code> region. The <code>TemplateBody</code> parameter of the template is set to <code>{&quot;ROSTemplateFormatVersion&quot;: &quot;2015-09-01&quot;}</code>.</p>
     * 
     * @param request the request parameters of CreateTemplate  CreateTemplateRequest
     * @return CreateTemplateResponse
     */
    @Override
    public CompletableFuture<CreateTemplateResponse> createTemplate(CreateTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Limits</h3>
     * <p>Only specific resource types support the resource scenario feature. For more information, see <a href="https://help.aliyun.com/document_detail/353175.htmll">Resource types that support the scenario feature</a>.</p>
     * <h3><a href="#"></a>Description</h3>
     * <p>Resource Orchestration Service (ROS) provides the resource scenario feature that allows you to specify the scope of a collection of resources on a user interface (UI) and perform operations, such as replication and management, on the resources. This helps you manage resources in a simplified manner. For more information about resource scenarios, see <a href="https://help.aliyun.com/document_detail/352074.html">Overview</a>.</p>
     * <h4><a href="#"></a>Resource replication scenario</h4>
     * <p>If you want to replicate a collection of resources and dependencies between the resources, you can create a resource replication scenario. This type of resource scenario allows you to replicate all existing resources within the specified scope and generate a collection of resources that have the same architecture as the existing resources. For more information, see <a href="https://help.aliyun.com/document_detail/353133.html">Resource replication scenario</a>.</p>
     * <h4><a href="#"></a>Resource detection scenario</h4>
     * <p>If the relationships between resources that you want to create are complicated, you can create a resource detection scenario to preview the overall resource architecture or the architecture of a specific resource. This facilitates resource management. For more information, see <a href="https://help.aliyun.com/document_detail/2591901.html">Resource detection scenario</a>.</p>
     * <h4><a href="#"></a>Resource management scenario</h4>
     * <p>If you want to import a collection of existing resources to a stack and manage the resources in a centralized manner, you can create a resource management scenario. For more information, see <a href="https://help.aliyun.com/document_detail/353163.html">Resource management scenario</a>.</p>
     * <h4><a href="#"></a>Resource migration scenario</h4>
     * <p>If you want to migrate a collection of resources and dependencies between the resources, you can create a resource migration scenario. When you migrate the resources, ROS generates a stack. You can view the migration progress on the Stacks tab of the scenario details page. After you migrate the resources, you can delete source resources. For more information, see <a href="https://help.aliyun.com/document_detail/379902.html">Resource migration scenario</a>.
     * This topic provides an example on how to create a resource replication scenario in the China (Hangzhou) region to replicate a resource. In this example, a virtual private cloud (VPC) whose ID is <code>vpc-bp1m6fww66xbntjyc****</code> is replicated.</p>
     * 
     * @param request the request parameters of CreateTemplateScratch  CreateTemplateScratchRequest
     * @return CreateTemplateScratchResponse
     */
    @Override
    public CompletableFuture<CreateTemplateScratchResponse> createTemplateScratch(CreateTemplateScratchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateTemplateScratch").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTemplateScratchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTemplateScratchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that the following requirements are met:
     *     *   The status of the change set is CREATE_COMPLETE, CREATE_FAILED, or DELETE_FAILED.
     *     *   The execution status is UNAVAILABLE or AVAILABLE.</p>
     * <ul>
     * <li>After a change set is executed, other change sets associated with the same stack as this change set are also deleted.</li>
     * <li>After a stack is deleted, change sets associated with the stack are deleted.</li>
     * <li>If a change set of the CREATE type is deleted, you must delete stacks associated with the change set.
     * In this example, a change set whose ID is <code>1f6521a4-05af-4975-afe9-bc4b45ad****</code> is deleted. The change set is created in the China (Hangzhou) region.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteChangeSet  DeleteChangeSetRequest
     * @return DeleteChangeSetResponse
     */
    @Override
    public CompletableFuture<DeleteChangeSetResponse> deleteChangeSet(DeleteChangeSetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteChangeSet").setMethod(HttpMethod.POST).setPathRegex("/V2/DeleteChangeSet").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteChangeSetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteChangeSetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteDiagnostic  DeleteDiagnosticRequest
     * @return DeleteDiagnosticResponse
     */
    @Override
    public CompletableFuture<DeleteDiagnosticResponse> deleteDiagnostic(DeleteDiagnosticRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDiagnostic").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDiagnosticResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDiagnosticResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteStack  DeleteStackRequest
     * @return DeleteStackResponse
     */
    @Override
    public CompletableFuture<DeleteStackResponse> deleteStack(DeleteStackRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteStack").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteStackResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteStackResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>A stack group can be deleted only when the stack group does not contain stacks. You can call the <a href="https://help.aliyun.com/document_detail/151715.html">DeleteStackInstances</a> operation to delete stacks.
     * This topic provides an example on how to delete a stack group. In this example, a stack group named <code>MyStackGroup</code> in the China (Hangzhou) region is deleted.</p>
     * 
     * @param request the request parameters of DeleteStackGroup  DeleteStackGroupRequest
     * @return DeleteStackGroupResponse
     */
    @Override
    public CompletableFuture<DeleteStackGroupResponse> deleteStackGroup(DeleteStackGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteStackGroup").setMethod(HttpMethod.POST).setPathRegex("/V2/DeleteStackGroup").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteStackGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteStackGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>In this topic, the stack group named <code>MyStackGroup</code> that is created in the China (Hangzhou) region is used. In this example, the stacks of the stack group that are deployed in the China (Beijing) region by using the Alibaba Cloud account whose ID is <code>151266687691****</code> are deleted.</p>
     * 
     * @param request the request parameters of DeleteStackInstances  DeleteStackInstancesRequest
     * @return DeleteStackInstancesResponse
     */
    @Override
    public CompletableFuture<DeleteStackInstancesResponse> deleteStackInstances(DeleteStackInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteStackInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteStackInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteStackInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If a template is shared with other Alibaba Cloud accounts, you must unshare the template before you delete it.</p>
     * 
     * @param request the request parameters of DeleteTemplate  DeleteTemplateRequest
     * @return DeleteTemplateResponse
     */
    @Override
    public CompletableFuture<DeleteTemplateResponse> deleteTemplate(DeleteTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>In this topic, a scenario whose ID is <code>ts-4f83704400994409****</code> is deleted in the China (Hangzhou) region.</p>
     * 
     * @param request the request parameters of DeleteTemplateScratch  DeleteTemplateScratchRequest
     * @return DeleteTemplateScratchResponse
     */
    @Override
    public CompletableFuture<DeleteTemplateScratchResponse> deleteTemplateScratch(DeleteTemplateScratchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteTemplateScratch").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteTemplateScratchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteTemplateScratchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  If you delete a resource type, you can no longer use the resource type in Resource Orchestration Service (ROS).</p>
     * <ul>
     * <li>If you delete a version of a resource type, you can no longer use the version in ROS.</li>
     * <li>If a resource type has only one version, you can delete the version by calling the operation. If a resource type has more than one version, you must manually delete the remaining versions.</li>
     * <li>When a resource type has more than one version, you cannot delete the default version by calling the operation.</li>
     * <li>When a resource type has only one version, you can delete the resource type and the version by calling the operation.</li>
     * </ul>
     * 
     * @param request the request parameters of DeregisterResourceType  DeregisterResourceTypeRequest
     * @return DeregisterResourceTypeResponse
     */
    @Override
    public CompletableFuture<DeregisterResourceTypeResponse> deregisterResourceType(DeregisterResourceTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeregisterResourceType").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeregisterResourceTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeregisterResourceTypeResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of DetectStackDrift  DetectStackDriftRequest
     * @return DetectStackDriftResponse
     */
    @Override
    public CompletableFuture<DetectStackDriftResponse> detectStackDrift(DetectStackDriftRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetectStackDrift").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetectStackDriftResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetectStackDriftResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DetectStackGroupDrift  DetectStackGroupDriftRequest
     * @return DetectStackGroupDriftResponse
     */
    @Override
    public CompletableFuture<DetectStackGroupDriftResponse> detectStackGroupDrift(DetectStackGroupDriftRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetectStackGroupDrift").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetectStackGroupDriftResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetectStackGroupDriftResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DetectStackResourceDrift  DetectStackResourceDriftRequest
     * @return DetectStackResourceDriftResponse
     */
    @Override
    public CompletableFuture<DetectStackResourceDriftResponse> detectStackResourceDrift(DetectStackResourceDriftRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetectStackResourceDrift").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetectStackResourceDriftResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetectStackResourceDriftResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>In this example, the change set whose ID is <code>1f6521a4-05af-4975-afe9-bc4b45ad****</code> is executed. The change set is created in the <code>China (Hangzhou)</code> region.</p>
     * 
     * @param request the request parameters of ExecuteChangeSet  ExecuteChangeSetRequest
     * @return ExecuteChangeSetResponse
     */
    @Override
    public CompletableFuture<ExecuteChangeSetResponse> executeChangeSet(ExecuteChangeSetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ExecuteChangeSet").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExecuteChangeSetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExecuteChangeSetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>In this example, a template is generated for a resource management scenario that resides in the China (Hangzhou) region. The ID of the resource scenario is <code>ts-aa9c62feab844a6b****</code>.</p>
     * <blockquote>
     * <p> You cannot generate a template for a resource detection scenario.</p>
     * </blockquote>
     * 
     * @param request the request parameters of GenerateTemplateByScratch  GenerateTemplateByScratchRequest
     * @return GenerateTemplateByScratchResponse
     */
    @Override
    public CompletableFuture<GenerateTemplateByScratchResponse> generateTemplateByScratch(GenerateTemplateByScratchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GenerateTemplateByScratch").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GenerateTemplateByScratchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GenerateTemplateByScratchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If the policy information is related to Enterprise Distributed Application Service (EDAS), you must log on to your Alibaba Cloud account and grant the required permissions to the relevant RAM users.
     * In this example, a policy is generated for a template whose ID is <code>5ecd1e10-b0e9-4389-a565-e4c15efc****</code>.</p>
     * 
     * @param request the request parameters of GenerateTemplatePolicy  GenerateTemplatePolicyRequest
     * @return GenerateTemplatePolicyResponse
     */
    @Override
    public CompletableFuture<GenerateTemplatePolicyResponse> generateTemplatePolicy(GenerateTemplatePolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GenerateTemplatePolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GenerateTemplatePolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GenerateTemplatePolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAITask  GetAITaskRequest
     * @return GetAITaskResponse
     */
    @Override
    public CompletableFuture<GetAITaskResponse> getAITask(GetAITaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAITask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAITaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAITaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>In this example, the details of a change set whose ID is <code>4c11658d-bd47-4dd0-ba64-727edc62****</code> is queried. The change set is created in the China (Hangzhou) region.</p>
     * 
     * @param request the request parameters of GetChangeSet  GetChangeSetRequest
     * @return GetChangeSetResponse
     */
    @Override
    public CompletableFuture<GetChangeSetResponse> getChangeSet(GetChangeSetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetChangeSet").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetChangeSetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetChangeSetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDiagnostic  GetDiagnosticRequest
     * @return GetDiagnosticResponse
     */
    @Override
    public CompletableFuture<GetDiagnosticResponse> getDiagnostic(GetDiagnosticRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDiagnostic").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDiagnosticResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDiagnosticResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the Terraform hosting, resource cleaner, and scenario features.
     * This topic provides an example on how to query the details of features supported by ROS in the China (Hangzhou) region. The details include Terraform versions, provider versions, and supported resource types.</p>
     * <blockquote>
     * <p> In the Examples section, only part of the sample code is provided.</p>
     * </blockquote>
     * 
     * @param request the request parameters of GetFeatureDetails  GetFeatureDetailsRequest
     * @return GetFeatureDetailsResponse
     */
    @Override
    public CompletableFuture<GetFeatureDetailsResponse> getFeatureDetails(GetFeatureDetailsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetFeatureDetails").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetFeatureDetailsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetFeatureDetailsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>For more information about common request parameters, see <a href="https://help.aliyun.com/document_detail/131957.html">Common parameters</a>.</p>
     * 
     * @param request the request parameters of GetResourceType  GetResourceTypeRequest
     * @return GetResourceTypeResponse
     */
    @Override
    public CompletableFuture<GetResourceTypeResponse> getResourceType(GetResourceTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetResourceType").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetResourceTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetResourceTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetResourceTypeTemplate  GetResourceTypeTemplateRequest
     * @return GetResourceTypeTemplateResponse
     */
    @Override
    public CompletableFuture<GetResourceTypeTemplateResponse> getResourceTypeTemplate(GetResourceTypeTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetResourceTypeTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetResourceTypeTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetResourceTypeTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>Description</h3>
     * <p>This topic describes how to query the activation status and the RAM roles of an Alibaba Cloud service. In this example, the Elastic High Performance Computing (E-HPC) service that is deployed in the China (Hangzhou) region is queried.</p>
     * <blockquote>
     * <p>Make sure that you have the permissions to call the <a href="https://help.aliyun.com/document_detail/28711.html">GetRole</a> operation.</p>
     * </blockquote>
     * 
     * @param request the request parameters of GetServiceProvisions  GetServiceProvisionsRequest
     * @return GetServiceProvisionsResponse
     */
    @Override
    public CompletableFuture<GetServiceProvisionsResponse> getServiceProvisions(GetServiceProvisionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetServiceProvisions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetServiceProvisionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetServiceProvisionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>In this example, the information about a stack whose ID is <code>c754d2a4-28f1-46df-b557-9586173a****</code> in the China (Hangzhou) region is queried.</p>
     * 
     * @param request the request parameters of GetStack  GetStackRequest
     * @return GetStackResponse
     */
    @Override
    public CompletableFuture<GetStackResponse> getStack(GetStackRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetStack").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetStackResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetStackResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>In this topic, the status of a drift detection operation whose ID is <code>a7044f0d-6f2e-4128-a307-4524ef88****</code> is queried. The operation is performed in the China (Hangzhou) region.</p>
     * 
     * @param request the request parameters of GetStackDriftDetectionStatus  GetStackDriftDetectionStatusRequest
     * @return GetStackDriftDetectionStatusResponse
     */
    @Override
    public CompletableFuture<GetStackDriftDetectionStatusResponse> getStackDriftDetectionStatus(GetStackDriftDetectionStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetStackDriftDetectionStatus").setMethod(HttpMethod.POST).setPathRegex("/V2/GetStackDriftDetectionStatus").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetStackDriftDetectionStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetStackDriftDetectionStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>For more information about common request parameters, see <a href="https://help.aliyun.com/document_detail/131957.html">Common parameters</a>.</p>
     * 
     * @param request the request parameters of GetStackGroup  GetStackGroupRequest
     * @return GetStackGroupResponse
     */
    @Override
    public CompletableFuture<GetStackGroupResponse> getStackGroup(GetStackGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetStackGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetStackGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetStackGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>In this example, the information about the stack group operation whose ID is <code>6da106ca-1784-4a6f-a7e1-e723863d****</code> is queried. The stack group named <code>MyStackGroup</code> is granted self-managed permissions and deployed in the China (Hangzhou) region.</p>
     * 
     * @param request the request parameters of GetStackGroupOperation  GetStackGroupOperationRequest
     * @return GetStackGroupOperationResponse
     */
    @Override
    public CompletableFuture<GetStackGroupOperationResponse> getStackGroupOperation(GetStackGroupOperationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetStackGroupOperation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetStackGroupOperationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetStackGroupOperationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>In this example, the information about a stack instance associated with a stack group named <code>MyStackGroup</code> is queried. The stack instance is deployed in the China (Beijing) region within the <code>151266687691****</code> Alibaba Cloud account. The stack group is granted self-managed permissions and deployed in the China (Hangzhou) region.</p>
     * 
     * @param request the request parameters of GetStackInstance  GetStackInstanceRequest
     * @return GetStackInstanceResponse
     */
    @Override
    public CompletableFuture<GetStackInstanceResponse> getStackInstance(GetStackInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetStackInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetStackInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetStackInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>In this example, the stack policy of a stack whose ID is <code>4a6c9851-3b0f-4f5f-b4ca-a14bf691****</code> is queried. The stack is deployed in the China (Hangzhou) region.</p>
     * 
     * @param request the request parameters of GetStackPolicy  GetStackPolicyRequest
     * @return GetStackPolicyResponse
     */
    @Override
    public CompletableFuture<GetStackPolicyResponse> getStackPolicy(GetStackPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetStackPolicy").setMethod(HttpMethod.POST).setPathRegex("/V2/GetStackPolicy").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetStackPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetStackPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <table>
     * <thead>
     * <tr>
     * <th>Http status code</th>
     * <th>Error code</th>
     * <th>Error message</th>
     * <th>Description</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>404</td>
     * <td>ResourceNotFound</td>
     * <td>The Resource ({name}) could not be found in Stack {stack}.</td>
     * <td>The error message returned because the specified resource does not exist in the stack. name indicates the resource name. stack indicates the stack name or ID.</td>
     * </tr>
     * <tr>
     * <td>404</td>
     * <td>StackNotFound</td>
     * <td>The Stack ({name}) could not be found.</td>
     * <td>The error message returned because the stack does not exist. name indicates the name or ID of the stack.</td>
     * </tr>
     * </tbody></table>
     * 
     * @param request the request parameters of GetStackResource  GetStackResourceRequest
     * @return GetStackResourceResponse
     */
    @Override
    public CompletableFuture<GetStackResourceResponse> getStackResource(GetStackResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetStackResource").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetStackResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetStackResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>In this example, the details of a template whose ID is <code>5ecd1e10-b0e9-4389-a565-e4c15efc****</code> is queried. The region ID of the template is <code>cn-hangzhou</code>.</p>
     * 
     * @param request the request parameters of GetTemplate  GetTemplateRequest
     * @return GetTemplateResponse
     */
    @Override
    public CompletableFuture<GetTemplateResponse> getTemplate(GetTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3></h3>
     * <ul>
     * <li>For more information about the resources that support price inquiry in Resource Orchestration Service (ROS) templates, see the &quot;<strong>Resource types that support price inquiry</strong>&quot; section of the <a href="https://help.aliyun.com/document_detail/203165.html">Estimate resource prices</a> topic.</li>
     * <li>For more information about the resources that support price inquiry in Terraform templates, see the &quot;<strong>ROS resources supported by Terraform</strong>&quot; section of the <a href="https://help.aliyun.com/document_detail/184389.html">ROS features and resources supported by Terraform</a> topic.
     * The following sample code provides an example on how to query the estimated price of an elastic IP address (EIP) that you want to create based on a template. In this example, the following template is used:
     * {
     *   &quot;ROSTemplateFormatVersion&quot;: &quot;2015-09-01&quot;,
     *   &quot;Parameters&quot;: {
     * &quot;Isp&quot;: {
     *   &quot;Type&quot;: &quot;String&quot;,
     *   &quot;Default&quot;: &quot;BGP&quot;
     * },
     * &quot;Name&quot;: {
     *   &quot;Type&quot;: &quot;String&quot;,
     *   &quot;Default&quot;: &quot;test&quot;
     * },
     * &quot;Netmode&quot;: {
     *   &quot;Type&quot;: &quot;String&quot;,
     *   &quot;Default&quot;: &quot;public&quot;
     * },
     * &quot;Bandwidth&quot;: {
     *   &quot;Type&quot;: &quot;Number&quot;,
     *   &quot;Default&quot;: 5
     * }
     *   },
     *   &quot;Resources&quot;: {
     * &quot;NewEip&quot;: {
     *   &quot;Type&quot;: &quot;ALIYUN::VPC::EIP&quot;,
     *   &quot;Properties&quot;: {
     *     &quot;InstanceChargeType&quot;: &quot;Prepaid&quot;,
     *     &quot;PricingCycle&quot;: &quot;Month&quot;,
     *     &quot;Isp&quot;: {
     *       &quot;Ref&quot;: &quot;Isp&quot;
     *     },
     *     &quot;Period&quot;: 1,
     *     &quot;DeletionProtection&quot;: false,
     *     &quot;AutoPay&quot;: false,
     *     &quot;Name&quot;: {
     *       &quot;Ref&quot;: &quot;Name&quot;
     *     },
     *     &quot;InternetChargeType&quot;: &quot;PayByTraffic&quot;,
     *     &quot;Netmode&quot;: {
     *       &quot;Ref&quot;: &quot;Netmode&quot;
     *     },
     *     &quot;Bandwidth&quot;: {
     *       &quot;Ref&quot;: &quot;Bandwidth&quot;
     *     }
     *   }
     * }
     *   }
     * }</li>
     * </ul>
     * 
     * @param request the request parameters of GetTemplateEstimateCost  GetTemplateEstimateCostRequest
     * @return GetTemplateEstimateCostResponse
     */
    @Override
    public CompletableFuture<GetTemplateEstimateCostResponse> getTemplateEstimateCost(GetTemplateEstimateCostRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetTemplateEstimateCost").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTemplateEstimateCostResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTemplateEstimateCostResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the values of a parameter. In this example, the values of the <code>ZoneInfo</code> parameter in a template that is created in the China (Hangzhou) region are queried. The template body is <code>{&quot;Parameters&quot;:{&quot;ZoneInfo&quot;:{&quot;Type&quot;: &quot;String&quot;},&quot;InstanceType&quot;: {&quot;Type&quot;: &quot;String&quot;}},&quot;ROSTemplateFormatVersion&quot;: &quot;2015-09-01&quot;,&quot;Resources&quot;:{&quot;ECS&quot;:{&quot;Properties&quot;:{&quot;ZoneId&quot;:{&quot;Ref&quot;: &quot;ZoneInfo&quot;},&quot;InstanceType&quot;: {&quot;Ref&quot;: &quot;InstanceType&quot;}},&quot;Type&quot;: &quot;ALIYUN::ECS::Instance&quot;}}}</code>.
     * For more information about the template parameters whose values you can query by calling this operation and the sample code of the template, see <a href="https://help.aliyun.com/document_detail/432820.html">Query the constraints of parameters</a>.</p>
     * 
     * @param request the request parameters of GetTemplateParameterConstraints  GetTemplateParameterConstraintsRequest
     * @return GetTemplateParameterConstraintsResponse
     */
    @Override
    public CompletableFuture<GetTemplateParameterConstraintsResponse> getTemplateParameterConstraints(GetTemplateParameterConstraintsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetTemplateParameterConstraints").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTemplateParameterConstraintsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTemplateParameterConstraintsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTemplateRecommendParameters  GetTemplateRecommendParametersRequest
     * @return GetTemplateRecommendParametersResponse
     */
    @Override
    public CompletableFuture<GetTemplateRecommendParametersResponse> getTemplateRecommendParameters(GetTemplateRecommendParametersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetTemplateRecommendParameters").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTemplateRecommendParametersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTemplateRecommendParametersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>In this example, the details of the resource scenario whose ID is <code>ts-7f7a704cf71c49a6****</code> is queried. In the response, the source node data is displayed.</p>
     * 
     * @param request the request parameters of GetTemplateScratch  GetTemplateScratchRequest
     * @return GetTemplateScratchResponse
     */
    @Override
    public CompletableFuture<GetTemplateScratchResponse> getTemplateScratch(GetTemplateScratchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetTemplateScratch").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTemplateScratchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTemplateScratchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTemplateSummary  GetTemplateSummaryRequest
     * @return GetTemplateSummaryResponse
     */
    @Override
    public CompletableFuture<GetTemplateSummaryResponse> getTemplateSummary(GetTemplateSummaryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetTemplateSummary").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTemplateSummaryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTemplateSummaryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ImportStacksToStackGroup  ImportStacksToStackGroupRequest
     * @return ImportStacksToStackGroupResponse
     */
    @Override
    public CompletableFuture<ImportStacksToStackGroupResponse> importStacksToStackGroup(ImportStacksToStackGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ImportStacksToStackGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ImportStacksToStackGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ImportStacksToStackGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAITaskEvents  ListAITaskEventsRequest
     * @return ListAITaskEventsResponse
     */
    @Override
    public CompletableFuture<ListAITaskEventsResponse> listAITaskEvents(ListAITaskEventsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAITaskEvents").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAITaskEventsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAITaskEventsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAITasks  ListAITasksRequest
     * @return ListAITasksResponse
     */
    @Override
    public CompletableFuture<ListAITasksResponse> listAITasks(ListAITasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAITasks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAITasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAITasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListChangeSets  ListChangeSetsRequest
     * @return ListChangeSetsResponse
     */
    @Override
    public CompletableFuture<ListChangeSetsResponse> listChangeSets(ListChangeSetsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListChangeSets").setMethod(HttpMethod.POST).setPathRegex("/V2/ListChangeSets").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListChangeSetsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListChangeSetsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDiagnostics  ListDiagnosticsRequest
     * @return ListDiagnosticsResponse
     */
    @Override
    public CompletableFuture<ListDiagnosticsResponse> listDiagnostics(ListDiagnosticsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDiagnostics").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDiagnosticsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDiagnosticsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListResourceTypeRegistrations  ListResourceTypeRegistrationsRequest
     * @return ListResourceTypeRegistrationsResponse
     */
    @Override
    public CompletableFuture<ListResourceTypeRegistrationsResponse> listResourceTypeRegistrations(ListResourceTypeRegistrationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListResourceTypeRegistrations").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListResourceTypeRegistrationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListResourceTypeRegistrationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListResourceTypeVersions  ListResourceTypeVersionsRequest
     * @return ListResourceTypeVersionsResponse
     */
    @Override
    public CompletableFuture<ListResourceTypeVersionsResponse> listResourceTypeVersions(ListResourceTypeVersionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListResourceTypeVersions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListResourceTypeVersionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListResourceTypeVersionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>For more information about errors common to all operations, see <a href="/help/en/resource-orchestration-service/latest/common-error-codes">Common error codes</a>.</p>
     * 
     * @param request the request parameters of ListResourceTypes  ListResourceTypesRequest
     * @return ListResourceTypesResponse
     */
    @Override
    public CompletableFuture<ListResourceTypesResponse> listResourceTypes(ListResourceTypesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListResourceTypes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListResourceTypesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListResourceTypesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListStackEvents  ListStackEventsRequest
     * @return ListStackEventsResponse
     */
    @Override
    public CompletableFuture<ListStackEventsResponse> listStackEvents(ListStackEventsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListStackEvents").setMethod(HttpMethod.POST).setPathRegex("/V2/ListStackEvents").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListStackEventsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListStackEventsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>In this example, the operation ID <code>6da106ca-1784-4a6f-a7e1-e723863d∗∗∗∗</code> is set to query the results of an operation on a stack group named <code>MyStackGroup</code>. The stack group is granted self-managed permissions and created in the China (Hangzhou) region.</p>
     * 
     * @param request the request parameters of ListStackGroupOperationResults  ListStackGroupOperationResultsRequest
     * @return ListStackGroupOperationResultsResponse
     */
    @Override
    public CompletableFuture<ListStackGroupOperationResultsResponse> listStackGroupOperationResults(ListStackGroupOperationResultsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListStackGroupOperationResults").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListStackGroupOperationResultsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListStackGroupOperationResultsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListStackGroupOperations  ListStackGroupOperationsRequest
     * @return ListStackGroupOperationsResponse
     */
    @Override
    public CompletableFuture<ListStackGroupOperationsResponse> listStackGroupOperations(ListStackGroupOperationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListStackGroupOperations").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListStackGroupOperationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListStackGroupOperationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>In this example, the list of stack groups that are in the ACTIVE state and deployed in the China (Hangzhou) region is queried.</p>
     * 
     * @param request the request parameters of ListStackGroups  ListStackGroupsRequest
     * @return ListStackGroupsResponse
     */
    @Override
    public CompletableFuture<ListStackGroupsResponse> listStackGroups(ListStackGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListStackGroups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListStackGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListStackGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>In this example, the list of stack instances that are associated with a stack group named <code>MyStackGroup</code> is queried. The stack group is granted self-managed permissions and deployed in the China (Hangzhou) region.</p>
     * 
     * @param request the request parameters of ListStackInstances  ListStackInstancesRequest
     * @return ListStackInstancesResponse
     */
    @Override
    public CompletableFuture<ListStackInstancesResponse> listStackInstances(ListStackInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListStackInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListStackInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListStackInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The ListStackOperationRisks operation is suitable for the following scenarios:</p>
     * <ul>
     * <li>You want to detect high risks that may arise in resources when you delete a stack that contains the resources, and query the cause of each risk in a resource.</li>
     * <li>When you create a stack, the creation may fail. In this case, you can call this operation to check which types of permissions that are required to create stacks are missing.</li>
     * </ul>
     * 
     * @param request the request parameters of ListStackOperationRisks  ListStackOperationRisksRequest
     * @return ListStackOperationRisksResponse
     */
    @Override
    public CompletableFuture<ListStackOperationRisksResponse> listStackOperationRisks(ListStackOperationRisksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListStackOperationRisks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListStackOperationRisksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListStackOperationRisksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListStackResourceDrifts  ListStackResourceDriftsRequest
     * @return ListStackResourceDriftsResponse
     */
    @Override
    public CompletableFuture<ListStackResourceDriftsResponse> listStackResourceDrifts(ListStackResourceDriftsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListStackResourceDrifts").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListStackResourceDriftsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListStackResourceDriftsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>For more information about common request parameters, see <a href="https://help.aliyun.com/document_detail/131957.html">Common parameters</a>.</p>
     * 
     * @param request the request parameters of ListStackResources  ListStackResourcesRequest
     * @return ListStackResourcesResponse
     */
    @Override
    public CompletableFuture<ListStackResourcesResponse> listStackResources(ListStackResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListStackResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListStackResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListStackResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3></h3>
     * <p>This topic provides an example on how to query a list of stacks. In this example, the stacks that are deployed in the China (Hangzhou) region are queried.</p>
     * 
     * @param request the request parameters of ListStacks  ListStacksRequest
     * @return ListStacksResponse
     */
    @Override
    public CompletableFuture<ListStacksResponse> listStacks(ListStacksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListStacks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListStacksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListStacksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>In this example, the tag keys that are added to a stack in the China (Hangzhou) region are queried.</p>
     * 
     * @param request the request parameters of ListTagKeys  ListTagKeysRequest
     * @return ListTagKeysResponse
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
     * <b>description</b> :
     * <h3></h3>
     * <ul>
     * <li>To specify the query object, specify ResourceId or Tag in the request. Tag consists of Key and Value.</li>
     * <li>If you specify Tag and ResourceId, ROS resources that match both the parameters are returned.
     * This topic provides an example on how to query the tags that are added to a stack. In this example, the stack ID is <code>6bc589b5-9c02-4944-8fc3-f3624234****</code>. The stack is deployed in the China (Hangzhou) region.</li>
     * </ul>
     * 
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
     * <p>In this example, the tag values of <code>TagKey1</code> that is added to a stack in the China (Hangzhou) region are queried.</p>
     * 
     * @param request the request parameters of ListTagValues  ListTagValuesRequest
     * @return ListTagValuesResponse
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
     * <b>description</b> :
     * <p>In this example, the scenarios that are created in the China (Hangzhou) region are queried. In the response, a scenario of the Resource Management and a scenario of the Resource Replication type are returned.</p>
     * 
     * @param request the request parameters of ListTemplateScratches  ListTemplateScratchesRequest
     * @return ListTemplateScratchesResponse
     */
    @Override
    public CompletableFuture<ListTemplateScratchesResponse> listTemplateScratches(ListTemplateScratchesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTemplateScratches").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTemplateScratchesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTemplateScratchesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTemplateVersions  ListTemplateVersionsRequest
     * @return ListTemplateVersionsResponse
     */
    @Override
    public CompletableFuture<ListTemplateVersionsResponse> listTemplateVersions(ListTemplateVersionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTemplateVersions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTemplateVersionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTemplateVersionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTemplates  ListTemplatesRequest
     * @return ListTemplatesResponse
     */
    @Override
    public CompletableFuture<ListTemplatesResponse> listTemplates(ListTemplatesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTemplates").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTemplatesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTemplatesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>In this example, a stack deployed in the <code>China (Hangzhou)</code> region is moved to a specific resource group. The ID of the stack is <code>4e8611cb-251e-42b7-b9cb-3496362c****</code> and the ID of the resource group is <code>rg-acfm3peow3k****</code>.</p>
     * 
     * @param request the request parameters of MoveResourceGroup  MoveResourceGroupRequest
     * @return MoveResourceGroupResponse
     */
    @Override
    public CompletableFuture<MoveResourceGroupResponse> moveResourceGroup(MoveResourceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("MoveResourceGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MoveResourceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MoveResourceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to create a stack named <code>MyStack</code> in the China (Hangzhou) region by using a template and preview the information about the stack. In this example, the <code>template body</code> is <code>{&quot;ROSTemplateFormatVersion&quot;:&quot;2015-09-01&quot;}</code>.</p>
     * 
     * @param request the request parameters of PreviewStack  PreviewStackRequest
     * @return PreviewStackResponse
     */
    @Override
    public CompletableFuture<PreviewStackResponse> previewStack(PreviewStackRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PreviewStack").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PreviewStackResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PreviewStackResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Versions increase from v1.</p>
     * <ul>
     * <li>If you create a new resource type, v1 is used as the default version of the resource type. You can call the SetResourceType operation to change the default version of a resource type.</li>
     * </ul>
     * 
     * @param request the request parameters of RegisterResourceType  RegisterResourceTypeRequest
     * @return RegisterResourceTypeResponse
     */
    @Override
    public CompletableFuture<RegisterResourceTypeResponse> registerResourceType(RegisterResourceTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RegisterResourceType").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RegisterResourceTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RegisterResourceTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetDeletionProtection  SetDeletionProtectionRequest
     * @return SetDeletionProtectionResponse
     */
    @Override
    public CompletableFuture<SetDeletionProtectionResponse> setDeletionProtection(SetDeletionProtectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetDeletionProtection").setMethod(HttpMethod.POST).setPathRegex("/V2/SetDeletionProtection").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetDeletionProtectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetDeletionProtectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetResourceType  SetResourceTypeRequest
     * @return SetResourceTypeResponse
     */
    @Override
    public CompletableFuture<SetResourceTypeResponse> setResourceType(SetResourceTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetResourceType").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetResourceTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetResourceTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>In this example, a stack policy is configured for a stack deployed in the <code>China (Hangzhou)</code> region whose ID is <code>4a6c9851-3b0f-4f5f-b4ca-a14bf691****</code>. The URL to the stack policy body is <code>oss://ros/stack-policy/demo</code>.</p>
     * 
     * @param request the request parameters of SetStackPolicy  SetStackPolicyRequest
     * @return SetStackPolicyResponse
     */
    @Override
    public CompletableFuture<SetStackPolicyResponse> setStackPolicy(SetStackPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetStackPolicy").setMethod(HttpMethod.POST).setPathRegex("/V2/SetStackPolicy").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetStackPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetStackPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>In this example, the template whose ID is <code>5ecd1e10-b0e9-4389-a565-e4c15efc****</code> is shared with an Alibaba Cloud account. The ID of the Alibaba Cloud account is <code>151266687691****</code>.</p>
     * <blockquote>
     * <p>The recipient Alibaba Cloud account (ID: <code>151266687691****</code>) can authorize RAM users to use the shared template.</p>
     * </blockquote>
     * 
     * @param request the request parameters of SetTemplatePermission  SetTemplatePermissionRequest
     * @return SetTemplatePermissionResponse
     */
    @Override
    public CompletableFuture<SetTemplatePermissionResponse> setTemplatePermission(SetTemplatePermissionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetTemplatePermission").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetTemplatePermissionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetTemplatePermissionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SignalResource  SignalResourceRequest
     * @return SignalResourceResponse
     */
    @Override
    public CompletableFuture<SignalResourceResponse> signalResource(SignalResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SignalResource").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SignalResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SignalResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to stop a stack group operation whose ID is <code>6da106ca-1784-4a6f-a7e1-e723863****</code> in the China (Hangzhou) region.</p>
     * 
     * @param request the request parameters of StopStackGroupOperation  StopStackGroupOperationRequest
     * @return StopStackGroupOperationResponse
     */
    @Override
    public CompletableFuture<StopStackGroupOperationResponse> stopStackGroupOperation(StopStackGroupOperationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopStackGroupOperation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopStackGroupOperationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopStackGroupOperationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to create a tag and add the tag to a stack. In this example, the stack ID is <code>7fee80e1-8c48-4c2f-8300-0f6dc40b****</code>, the tag key is <code>FinanceDept</code>, and the tag value is <code>FinanceJoshua</code>.</p>
     * 
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
     * <b>description</b> :
     * <p>This topic provides an example on how to remove all tags from a stack that is deployed in the China (Hangzhou) region. In this example, the stack ID is <code>46ec7b78-9d5e-4b21-aefd-448c90aa****</code>.</p>
     * 
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
     * <p>The values of parameters in the Parameters section vary based on the value that you specify for the UsePreviousParameters parameter in the request. If you do not add the parameters that are defined in the template to the Parameters section, take note of the following items:</p>
     * <ul>
     * <li>UsePreviousParameters is set to false: If the template parameters have default values, the default values are used. Otherwise, you must specify values for the template parameters in the Parameters section.</li>
     * <li>UsePreviousParameters is set to true: If you specify values for the template parameters when you create a stack, the values are used. If you leave the template parameters empty when you create a stack but the template parameters have default values, the default values are used.
     * This topic describes how to update a stack. In this example, the template body of a stack whose ID is <code>4a6c9851-3b0f-4f5f-b4ca-a14bf691****</code> in the China (Beijing) region is updated to <code>{&quot;ROSTemplateFormatVersion&quot;: &quot;2015-09-01&quot;}</code>.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateStack  UpdateStackRequest
     * @return UpdateStackResponse
     */
    @Override
    public CompletableFuture<UpdateStackResponse> updateStack(UpdateStackRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateStack").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateStackResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateStackResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The name of the stack group. The name must be unique within a region.
     * The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (_). The name must start with a digit or a letter.</p>
     * 
     * @param request the request parameters of UpdateStackGroup  UpdateStackGroupRequest
     * @return UpdateStackGroupResponse
     */
    @Override
    public CompletableFuture<UpdateStackGroupResponse> updateStackGroup(UpdateStackGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateStackGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateStackGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateStackGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>In this topic, the stack group named <code>MyStackGroup</code> that is created in the China (Hangzhou) region is used. The stack group is granted the self-managed permissions. In this example, stacks of the stack group are updated by using the Alibaba Cloud accounts whose IDs are <code>151266687691****</code> and <code>141261387191****</code> in the China (Hangzhou) region and China (Beijing) region.</p>
     * 
     * @param request the request parameters of UpdateStackInstances  UpdateStackInstancesRequest
     * @return UpdateStackInstancesResponse
     */
    @Override
    public CompletableFuture<UpdateStackInstancesResponse> updateStackInstances(UpdateStackInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateStackInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateStackInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateStackInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Limits: You can eliminate only drift on stacks that have drifted. You must call the <a href="https://help.aliyun.com/document_detail/155094.html">DetectStackDrift</a> operation to perform drift detection on a stack, call the <a href="https://help.aliyun.com/document_detail/155097.html">GetStackDriftDetectionStatus</a> operation to query the drift status of the stack to make sure that the stack has drifted, and then call the UpdateStackTemplateByResources operation to eliminate drift.
     * In this topic, drift is eliminated for a stack whose ID is <code>4a6c9851-3b0f-4f5f-b4ca-a14bf691****</code>. The stack is deployed in the China (Hangzhou) region.</p>
     * 
     * @param request the request parameters of UpdateStackTemplateByResources  UpdateStackTemplateByResourcesRequest
     * @return UpdateStackTemplateByResourcesResponse
     */
    @Override
    public CompletableFuture<UpdateStackTemplateByResourcesResponse> updateStackTemplateByResources(UpdateStackTemplateByResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateStackTemplateByResources").setMethod(HttpMethod.POST).setPathRegex("/V2/UpdateStackTemplateByResources").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateStackTemplateByResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateStackTemplateByResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>When updating a template, please note:   </p>
     * <ul>
     * <li>If you specify <code>TemplateBody</code> or <code>TemplateURL</code>, the template version will be incremented by 1 after a successful update. For example, the version changes from v1 to v2.</li>
     * <li>If neither <code>TemplateBody</code> nor <code>TemplateURL</code> is specified, the template version remains unchanged.</li>
     * <li>A template can have up to 100 versions. If the version limit is reached, the template update will fail, and you need to recreate the template.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateTemplate  UpdateTemplateRequest
     * @return UpdateTemplateResponse
     */
    @Override
    public CompletableFuture<UpdateTemplateResponse> updateTemplate(UpdateTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Resource replication scenario</h3>
     * <p>Resource Orchestration Service (ROS) allows you to update a resource replication scenario. The updates that you make to a resource replication scenario do not affect the stack that is generated by using the resource scenario. You can call the <a href="https://help.aliyun.com/document_detail/610829.html">GenerateTemplateByScratch</a> operation to generate a template for the resource scenario.</p>
     * <h3><a href="#"></a>Resource migration scenario</h3>
     * <ul>
     * <li>If you want to update a resource migration scenario in which the migrated source resources are retained, you can delete the source resources to manage the updated resource migration scenario. You can also call the <a href="https://help.aliyun.com/document_detail/610829.html">GenerateTemplateByScratch</a> operation to generate a template for the resource scenario.
     * **
     * <strong>Note</strong> Make sure that the source resources that you want to delete from a resource migration scenario are associated only with the resource scenario. Otherwise, the source resources fail to be deleted.</li>
     * <li>If you want to update a resource migration scenario in which the migrated source resources are deleted, you can only call the <a href="https://help.aliyun.com/document_detail/610829.html">GenerateTemplateByScratch</a> operation to generate a template for the resource scenario.</li>
     * </ul>
     * <h3><a href="#"></a>Resource management scenario</h3>
     * <p>If you want to update a resource management scenario after you use the resource scenario to manage resources, you can only call the <a href="https://help.aliyun.com/document_detail/610829.html">GenerateTemplateByScratch</a> operation to generate a template for the resource scenario.</p>
     * <h3><a href="#"></a>Resource detection scenario</h3>
     * <p>After you update a resource detection scenario, ROS obtains the most recent data from Resource Center and renders the architecture diagram.
     * This topic provides an example on how to update a resource scenario. In this example, the ID of a virtual private cloud (VPC) in a resource scenario whose ID is <code>ts-7f7a704cf71c49a6****</code> is updated to <code>vpc-bp1m6fww66xbntjyc****</code>.</p>
     * 
     * @param request the request parameters of UpdateTemplateScratch  UpdateTemplateScratchRequest
     * @return UpdateTemplateScratchResponse
     */
    @Override
    public CompletableFuture<UpdateTemplateScratchResponse> updateTemplateScratch(UpdateTemplateScratchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateTemplateScratch").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateTemplateScratchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateTemplateScratchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>In this example, a template that you want to use to create a stack is validated. <code>TemplateURL</code> is set to <code>oss://ros/template/demo</code>.</p>
     * 
     * @param request the request parameters of ValidateTemplate  ValidateTemplateRequest
     * @return ValidateTemplateResponse
     */
    @Override
    public CompletableFuture<ValidateTemplateResponse> validateTemplate(ValidateTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ValidateTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ValidateTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ValidateTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
