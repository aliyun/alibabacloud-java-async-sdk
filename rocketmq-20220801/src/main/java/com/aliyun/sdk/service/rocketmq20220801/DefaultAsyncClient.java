// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.rocketmq20220801.models.*;
import darabonba.core.sse.SSEHttpResponseHandler;
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
        this.product = "RocketMQ";
        this.version = "2022-08-01";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("cn-guangzhou", "rocketmq.cn-guangzhou.aliyuncs.com	")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of AddDisasterRecoveryItem  AddDisasterRecoveryItemRequest
     * @return AddDisasterRecoveryItemResponse
     */
    @Override
    public CompletableFuture<AddDisasterRecoveryItemResponse> addDisasterRecoveryItem(AddDisasterRecoveryItemRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AddDisasterRecoveryItem").setMethod(HttpMethod.POST).setPathRegex("/disaster_recovery/{planId}/items").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddDisasterRecoveryItemResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddDisasterRecoveryItemResponse> future = new CompletableFuture<>();
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ChangeResourceGroup").setMethod(HttpMethod.POST).setPathRegex("/resourceGroup/change").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChangeResourceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChangeResourceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateAgentConversation  CreateAgentConversationRequest
     * @return CreateAgentConversationResponse
     */
    @Override
    public CompletableFuture<CreateAgentConversationResponse> createAgentConversation(CreateAgentConversationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateAgentConversation").setMethod(HttpMethod.POST).setPathRegex("/api/v1/conversations").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAgentConversationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAgentConversationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: The OpenAPI operations provided by Alibaba Cloud are management APIs used to manage and query Alibaba Cloud service resources. Use these operations only in the management link. Do not use them in the core data link for sending and receiving messages, as this may introduce risks to the link.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateConsumerGroup  CreateConsumerGroupRequest
     * @return CreateConsumerGroupResponse
     */
    @Override
    public CompletableFuture<CreateConsumerGroupResponse> createConsumerGroup(CreateConsumerGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateConsumerGroup").setMethod(HttpMethod.POST).setPathRegex("/instances/{instanceId}/consumerGroups/{consumerGroupId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateConsumerGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateConsumerGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateDisasterRecoveryPlan  CreateDisasterRecoveryPlanRequest
     * @return CreateDisasterRecoveryPlanResponse
     */
    @Override
    public CompletableFuture<CreateDisasterRecoveryPlanResponse> createDisasterRecoveryPlan(CreateDisasterRecoveryPlanRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateDisasterRecoveryPlan").setMethod(HttpMethod.POST).setPathRegex("/disaster_recovery").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDisasterRecoveryPlanResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDisasterRecoveryPlanResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: The OpenAPI provided by Alibaba Cloud is a management and control API used to manage and query resources of Alibaba Cloud services. Integrate it only into the management and control link. Do not rely on OpenAPI in the core data link for message sending and receiving. Otherwise, risks may occur on the link.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateInstance  CreateInstanceRequest
     * @return CreateInstanceResponse
     */
    @Override
    public CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateInstance").setMethod(HttpMethod.POST).setPathRegex("/instances").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateInstanceAccount  CreateInstanceAccountRequest
     * @return CreateInstanceAccountResponse
     */
    @Override
    public CompletableFuture<CreateInstanceAccountResponse> createInstanceAccount(CreateInstanceAccountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateInstanceAccount").setMethod(HttpMethod.POST).setPathRegex("/instances/{instanceId}/accounts").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateInstanceAccountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateInstanceAccountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateInstanceAcl  CreateInstanceAclRequest
     * @return CreateInstanceAclResponse
     */
    @Override
    public CompletableFuture<CreateInstanceAclResponse> createInstanceAcl(CreateInstanceAclRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateInstanceAcl").setMethod(HttpMethod.POST).setPathRegex("/instances/{instanceId}/acl/account/{username}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateInstanceAclResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateInstanceAclResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateInstanceInspection  CreateInstanceInspectionRequest
     * @return CreateInstanceInspectionResponse
     */
    @Override
    public CompletableFuture<CreateInstanceInspectionResponse> createInstanceInspection(CreateInstanceInspectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateInstanceInspection").setMethod(HttpMethod.POST).setPathRegex("/api/v1/monitoring/instance-inspections/{instanceId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateInstanceInspectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateInstanceInspectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateInstanceIpWhitelist  CreateInstanceIpWhitelistRequest
     * @return CreateInstanceIpWhitelistResponse
     */
    @Override
    public CompletableFuture<CreateInstanceIpWhitelistResponse> createInstanceIpWhitelist(CreateInstanceIpWhitelistRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateInstanceIpWhitelist").setMethod(HttpMethod.POST).setPathRegex("/instances/{instanceId}/ip/whitelist").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateInstanceIpWhitelistResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateInstanceIpWhitelistResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateTopic  CreateTopicRequest
     * @return CreateTopicResponse
     */
    @Override
    public CompletableFuture<CreateTopicResponse> createTopic(CreateTopicRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateTopic").setMethod(HttpMethod.POST).setPathRegex("/instances/{instanceId}/topics/{topicName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTopicResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTopicResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteAgentConversation  DeleteAgentConversationRequest
     * @return DeleteAgentConversationResponse
     */
    @Override
    public CompletableFuture<DeleteAgentConversationResponse> deleteAgentConversation(DeleteAgentConversationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteAgentConversation").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/conversations/{conversationId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAgentConversationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAgentConversationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: OpenAPI operations provided by Alibaba Cloud are management API operations used to manage and query resources of Alibaba Cloud services. Integrate these operations only into management workflows. Do not rely on OpenAPI operations in the core data link for message sending and receiving. Otherwise, risks may occur in the workflows.
     * After you delete a specified consumer group, consumer clients with the identity of the consumer group cannot consume messages. Invoke this operation with caution.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteConsumerGroup  DeleteConsumerGroupRequest
     * @return DeleteConsumerGroupResponse
     */
    @Override
    public CompletableFuture<DeleteConsumerGroupResponse> deleteConsumerGroup(DeleteConsumerGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteConsumerGroup").setMethod(HttpMethod.DELETE).setPathRegex("/instances/{instanceId}/consumerGroups/{consumerGroupId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteConsumerGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteConsumerGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteConsumerGroupSubscription  DeleteConsumerGroupSubscriptionRequest
     * @return DeleteConsumerGroupSubscriptionResponse
     */
    @Override
    public CompletableFuture<DeleteConsumerGroupSubscriptionResponse> deleteConsumerGroupSubscription(DeleteConsumerGroupSubscriptionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteConsumerGroupSubscription").setMethod(HttpMethod.DELETE).setPathRegex("/instances/{instanceId}/consumerGroups/{consumerGroupId}/subscriptions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteConsumerGroupSubscriptionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteConsumerGroupSubscriptionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteDisasterRecoveryItem  DeleteDisasterRecoveryItemRequest
     * @return DeleteDisasterRecoveryItemResponse
     */
    @Override
    public CompletableFuture<DeleteDisasterRecoveryItemResponse> deleteDisasterRecoveryItem(DeleteDisasterRecoveryItemRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteDisasterRecoveryItem").setMethod(HttpMethod.DELETE).setPathRegex("/disaster_recovery/{planId}/items/{itemId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDisasterRecoveryItemResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDisasterRecoveryItemResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteDisasterRecoveryPlan  DeleteDisasterRecoveryPlanRequest
     * @return DeleteDisasterRecoveryPlanResponse
     */
    @Override
    public CompletableFuture<DeleteDisasterRecoveryPlanResponse> deleteDisasterRecoveryPlan(DeleteDisasterRecoveryPlanRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteDisasterRecoveryPlan").setMethod(HttpMethod.DELETE).setPathRegex("/disaster_recovery/{planId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDisasterRecoveryPlanResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDisasterRecoveryPlanResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>API operations provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.</p>
     * </blockquote>
     * <ul>
     * <li>After an instance is deleted, the instance cannot be restored. Exercise caution when you call this operation.</li>
     * <li>This operation is used to delete a pay-as-you-go instance. A subscription instance is automatically released after it expires. You do not need to manually delete a subscription instance.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteInstance  DeleteInstanceRequest
     * @return DeleteInstanceResponse
     */
    @Override
    public CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteInstance").setMethod(HttpMethod.DELETE).setPathRegex("/instances/{instanceId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteInstanceAccount  DeleteInstanceAccountRequest
     * @return DeleteInstanceAccountResponse
     */
    @Override
    public CompletableFuture<DeleteInstanceAccountResponse> deleteInstanceAccount(DeleteInstanceAccountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteInstanceAccount").setMethod(HttpMethod.DELETE).setPathRegex("/instances/{instanceId}/accounts/{username}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteInstanceAccountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteInstanceAccountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteInstanceAcl  DeleteInstanceAclRequest
     * @return DeleteInstanceAclResponse
     */
    @Override
    public CompletableFuture<DeleteInstanceAclResponse> deleteInstanceAcl(DeleteInstanceAclRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteInstanceAcl").setMethod(HttpMethod.DELETE).setPathRegex("/instances/{instanceId}/acl/account/{username}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteInstanceAclResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteInstanceAclResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteInstanceInspection  DeleteInstanceInspectionRequest
     * @return DeleteInstanceInspectionResponse
     */
    @Override
    public CompletableFuture<DeleteInstanceInspectionResponse> deleteInstanceInspection(DeleteInstanceInspectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteInstanceInspection").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/monitoring/instance-inspections/{instanceId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteInstanceInspectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteInstanceInspectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteInstanceIpWhitelist  DeleteInstanceIpWhitelistRequest
     * @return DeleteInstanceIpWhitelistResponse
     */
    @Override
    public CompletableFuture<DeleteInstanceIpWhitelistResponse> deleteInstanceIpWhitelist(DeleteInstanceIpWhitelistRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteInstanceIpWhitelist").setMethod(HttpMethod.DELETE).setPathRegex("/instances/{instanceId}/ip/whitelist").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteInstanceIpWhitelistResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteInstanceIpWhitelistResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Deleting a topic clears all publish-subscribe relationships under the topic. Call this operation with caution.</p>
     * 
     * @param request the request parameters of DeleteTopic  DeleteTopicRequest
     * @return DeleteTopicResponse
     */
    @Override
    public CompletableFuture<DeleteTopicResponse> deleteTopic(DeleteTopicRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteTopic").setMethod(HttpMethod.DELETE).setPathRegex("/instances/{instanceId}/topics/{topicName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteTopicResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteTopicResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ExecuteMigrationOperation  ExecuteMigrationOperationRequest
     * @return ExecuteMigrationOperationResponse
     */
    @Override
    public CompletableFuture<ExecuteMigrationOperationResponse> executeMigrationOperation(ExecuteMigrationOperationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ExecuteMigrationOperation").setMethod(HttpMethod.POST).setPathRegex("/migrations/{migrationId}/stages/{stageType}/operations/{operationId}/execute").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExecuteMigrationOperationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExecuteMigrationOperationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of FinishMigrationStage  FinishMigrationStageRequest
     * @return FinishMigrationStageResponse
     */
    @Override
    public CompletableFuture<FinishMigrationStageResponse> finishMigrationStage(FinishMigrationStageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("FinishMigrationStage").setMethod(HttpMethod.POST).setPathRegex("/migrations/{migrationId}/stages/{stageType}/finish").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FinishMigrationStageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FinishMigrationStageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAgentConversation  GetAgentConversationRequest
     * @return GetAgentConversationResponse
     */
    @Override
    public CompletableFuture<GetAgentConversationResponse> getAgentConversation(GetAgentConversationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAgentConversation").setMethod(HttpMethod.GET).setPathRegex("/api/v1/conversations/{conversationId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAgentConversationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAgentConversationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAgentConversationEvents  GetAgentConversationEventsRequest
     * @return GetAgentConversationEventsResponse
     */
    @Override
    public CompletableFuture<GetAgentConversationEventsResponse> getAgentConversationEvents(GetAgentConversationEventsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAgentConversationEvents").setMethod(HttpMethod.GET).setPathRegex("/api/v1/conversations/{conversationId}/events").setBodyType(BodyType.STRING).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAgentConversationEventsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAgentConversationEventsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public <ReturnT> CompletableFuture<ReturnT> getAgentConversationEventsWithAsyncResponseHandler(GetAgentConversationEventsRequest request, AsyncResponseHandler<GetAgentConversationEventsResponse, ReturnT> responseHandler) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAgentConversationEvents").setMethod(HttpMethod.GET).setPathRegex("/api/v1/conversations/{conversationId}/events").setBodyType(BodyType.STRING).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withResponseHandler(responseHandler).withOutput(GetAgentConversationEventsResponse.create());
            return this.handler.execute(params)
                    .thenCompose((output) -> CompletableFuture.completedFuture(responseHandler.transform((GetAgentConversationEventsResponse)output)));
        } catch (Exception e) {
            CompletableFuture<ReturnT> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public ResponseIterable<String> getAgentConversationEventsWithResponseIterable(GetAgentConversationEventsRequest request) {
        this.handler.validateRequestModel(request);
        TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.SSE).setAction("GetAgentConversationEvents").setMethod(HttpMethod.GET).setPathRegex("/api/v1/conversations/{conversationId}/events").setBodyType(BodyType.STRING).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
        GetAgentConversationEventsResponseBodyIterator iterator = GetAgentConversationEventsResponseBodyIterator.create();
        ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withHttpResponseHandler(new SSEHttpResponseHandler(iterator));
        this.handler.execute(params);
        return new ResponseIterable<>(iterator);
    }

    /**
     * @param request the request parameters of GetAgentConversationTimeline  GetAgentConversationTimelineRequest
     * @return GetAgentConversationTimelineResponse
     */
    @Override
    public CompletableFuture<GetAgentConversationTimelineResponse> getAgentConversationTimeline(GetAgentConversationTimelineRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAgentConversationTimeline").setMethod(HttpMethod.GET).setPathRegex("/api/v1/conversations/{conversationId}/timeline").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAgentConversationTimelineResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAgentConversationTimelineResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetConsumeTimespan  GetConsumeTimespanRequest
     * @return GetConsumeTimespanResponse
     */
    @Override
    public CompletableFuture<GetConsumeTimespanResponse> getConsumeTimespan(GetConsumeTimespanRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetConsumeTimespan").setMethod(HttpMethod.GET).setPathRegex("/instances/{instanceId}/consumerGroups/{consumerGroupId}/consumeTimespan/{topicName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetConsumeTimespanResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetConsumeTimespanResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: The OpenAPI provided by Alibaba Cloud is a management and control API used to manage and query related resources of Alibaba Cloud services. It is recommended only for integration in management and control data links. Using OpenAPI in the core data link for message sending and receiving is strictly prohibited. Otherwise, risks may occur in the data link.</p>
     * </blockquote>
     * 
     * @param request the request parameters of GetConsumerGroup  GetConsumerGroupRequest
     * @return GetConsumerGroupResponse
     */
    @Override
    public CompletableFuture<GetConsumerGroupResponse> getConsumerGroup(GetConsumerGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetConsumerGroup").setMethod(HttpMethod.GET).setPathRegex("/instances/{instanceId}/consumerGroups/{consumerGroupId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetConsumerGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetConsumerGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetConsumerGroupLag  GetConsumerGroupLagRequest
     * @return GetConsumerGroupLagResponse
     */
    @Override
    public CompletableFuture<GetConsumerGroupLagResponse> getConsumerGroupLag(GetConsumerGroupLagRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetConsumerGroupLag").setMethod(HttpMethod.GET).setPathRegex("/instances/{instanceId}/consumerGroups/{consumerGroupId}/lag").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetConsumerGroupLagResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetConsumerGroupLagResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetConsumerGroupSubscription  GetConsumerGroupSubscriptionRequest
     * @return GetConsumerGroupSubscriptionResponse
     */
    @Override
    public CompletableFuture<GetConsumerGroupSubscriptionResponse> getConsumerGroupSubscription(GetConsumerGroupSubscriptionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetConsumerGroupSubscription").setMethod(HttpMethod.GET).setPathRegex("/instances/{instanceId}/consumerGroups/{consumerGroupId}/subscriptions/{topicName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetConsumerGroupSubscriptionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetConsumerGroupSubscriptionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetConsumerStack  GetConsumerStackRequest
     * @return GetConsumerStackResponse
     */
    @Override
    public CompletableFuture<GetConsumerStackResponse> getConsumerStack(GetConsumerStackRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetConsumerStack").setMethod(HttpMethod.GET).setPathRegex("/instances/{instanceId}/consumerGroups/{consumerGroupId}/stack").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetConsumerStackResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetConsumerStackResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDisasterRecoveryItem  GetDisasterRecoveryItemRequest
     * @return GetDisasterRecoveryItemResponse
     */
    @Override
    public CompletableFuture<GetDisasterRecoveryItemResponse> getDisasterRecoveryItem(GetDisasterRecoveryItemRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetDisasterRecoveryItem").setMethod(HttpMethod.GET).setPathRegex("/disaster_recovery/{planId}/items/{itemId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDisasterRecoveryItemResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDisasterRecoveryItemResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before querying, make sure you have created a Global Replicator backup plan. Before using Global Replicator, your account must have the AliyunServiceRoleForRMQDisasterRecovery service-linked role. This role is used to grant authorization for ApsaraMQ for RocketMQ to access the EventBridge event bus. The system typically creates this role automatically the first time you use the associated feature. If automatic creation failed, create the role manually.</p>
     * 
     * @param request the request parameters of GetDisasterRecoveryPlan  GetDisasterRecoveryPlanRequest
     * @return GetDisasterRecoveryPlanResponse
     */
    @Override
    public CompletableFuture<GetDisasterRecoveryPlanResponse> getDisasterRecoveryPlan(GetDisasterRecoveryPlanRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetDisasterRecoveryPlan").setMethod(HttpMethod.GET).setPathRegex("/disaster_recovery/{planId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDisasterRecoveryPlanResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDisasterRecoveryPlanResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: The OpenAPI operations provided by Alibaba Cloud are management APIs used to manage and query Alibaba Cloud service resources. Use them only in management and control workflows. Do not rely on OpenAPI in core data link workflows for message sending and receiving, as this may introduce risks to the data link.</notice></p>
     * </blockquote>
     * 
     * @param request the request parameters of GetInstance  GetInstanceRequest
     * @return GetInstanceResponse
     */
    @Override
    public CompletableFuture<GetInstanceResponse> getInstance(GetInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetInstance").setMethod(HttpMethod.GET).setPathRegex("/instances/{instanceId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetInstanceAccount  GetInstanceAccountRequest
     * @return GetInstanceAccountResponse
     */
    @Override
    public CompletableFuture<GetInstanceAccountResponse> getInstanceAccount(GetInstanceAccountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetInstanceAccount").setMethod(HttpMethod.GET).setPathRegex("/instances/{instanceId}/account").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetInstanceAccountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetInstanceAccountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetInstanceAcl  GetInstanceAclRequest
     * @return GetInstanceAclResponse
     */
    @Override
    public CompletableFuture<GetInstanceAclResponse> getInstanceAcl(GetInstanceAclRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetInstanceAcl").setMethod(HttpMethod.GET).setPathRegex("/instances/{instanceId}/acl/account/{username}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetInstanceAclResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetInstanceAclResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetInstanceInspection  GetInstanceInspectionRequest
     * @return GetInstanceInspectionResponse
     */
    @Override
    public CompletableFuture<GetInstanceInspectionResponse> getInstanceInspection(GetInstanceInspectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetInstanceInspection").setMethod(HttpMethod.GET).setPathRegex("/api/v1/monitoring/instance-inspections/{instanceId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetInstanceInspectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetInstanceInspectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetInstanceInspectionReport  GetInstanceInspectionReportRequest
     * @return GetInstanceInspectionReportResponse
     */
    @Override
    public CompletableFuture<GetInstanceInspectionReportResponse> getInstanceInspectionReport(GetInstanceInspectionReportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetInstanceInspectionReport").setMethod(HttpMethod.GET).setPathRegex("/api/v1/monitoring/instance-inspections/reports/{reportId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetInstanceInspectionReportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetInstanceInspectionReportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetInstanceInspectionRun  GetInstanceInspectionRunRequest
     * @return GetInstanceInspectionRunResponse
     */
    @Override
    public CompletableFuture<GetInstanceInspectionRunResponse> getInstanceInspectionRun(GetInstanceInspectionRunRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetInstanceInspectionRun").setMethod(HttpMethod.GET).setPathRegex("/api/v1/monitoring/instance-inspections/{instanceId}/runs/{runId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetInstanceInspectionRunResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetInstanceInspectionRunResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetInstanceIpWhitelist  GetInstanceIpWhitelistRequest
     * @return GetInstanceIpWhitelistResponse
     */
    @Override
    public CompletableFuture<GetInstanceIpWhitelistResponse> getInstanceIpWhitelist(GetInstanceIpWhitelistRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetInstanceIpWhitelist").setMethod(HttpMethod.GET).setPathRegex("/instances/{instanceId}/ip/whitelists").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetInstanceIpWhitelistResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetInstanceIpWhitelistResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMessageDetail  GetMessageDetailRequest
     * @return GetMessageDetailResponse
     */
    @Override
    public CompletableFuture<GetMessageDetailResponse> getMessageDetail(GetMessageDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetMessageDetail").setMethod(HttpMethod.GET).setPathRegex("/instances/{instanceId}/topics/{topicName}/messages/{messageId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMessageDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMessageDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTopic  GetTopicRequest
     * @return GetTopicResponse
     */
    @Override
    public CompletableFuture<GetTopicResponse> getTopic(GetTopicRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetTopic").setMethod(HttpMethod.GET).setPathRegex("/instances/{instanceId}/topics/{topicName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTopicResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTopicResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTrace  GetTraceRequest
     * @return GetTraceResponse
     */
    @Override
    public CompletableFuture<GetTraceResponse> getTrace(GetTraceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetTrace").setMethod(HttpMethod.GET).setPathRegex("/instances/{instanceId}/topics/{topicName}/traces/{messageId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTraceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTraceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAgentConversations  ListAgentConversationsRequest
     * @return ListAgentConversationsResponse
     */
    @Override
    public CompletableFuture<ListAgentConversationsResponse> listAgentConversations(ListAgentConversationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAgentConversations").setMethod(HttpMethod.GET).setPathRegex("/api/v1/conversations").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAgentConversationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAgentConversationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAvailableZones  ListAvailableZonesRequest
     * @return ListAvailableZonesResponse
     */
    @Override
    public CompletableFuture<ListAvailableZonesResponse> listAvailableZones(ListAvailableZonesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAvailableZones").setMethod(HttpMethod.GET).setPathRegex("/zones").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAvailableZonesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAvailableZonesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListConsumerConnections  ListConsumerConnectionsRequest
     * @return ListConsumerConnectionsResponse
     */
    @Override
    public CompletableFuture<ListConsumerConnectionsResponse> listConsumerConnections(ListConsumerConnectionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListConsumerConnections").setMethod(HttpMethod.GET).setPathRegex("/instances/{instanceId}/consumerGroups/{consumerGroupId}/connections").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListConsumerConnectionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListConsumerConnectionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListConsumerGroupSubscriptions  ListConsumerGroupSubscriptionsRequest
     * @return ListConsumerGroupSubscriptionsResponse
     */
    @Override
    public CompletableFuture<ListConsumerGroupSubscriptionsResponse> listConsumerGroupSubscriptions(ListConsumerGroupSubscriptionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListConsumerGroupSubscriptions").setMethod(HttpMethod.GET).setPathRegex("/instances/{instanceId}/consumerGroups/{consumerGroupId}/subscriptions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListConsumerGroupSubscriptionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListConsumerGroupSubscriptionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: The OpenAPI provided by Alibaba Cloud is a management and control API used to manage and query related resources of Alibaba Cloud services. It is recommended only for integration in management and control links. Using OpenAPI in the core data link for message sending and receiving is strictly prohibited. Otherwise, risks may occur in the link.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListConsumerGroups  ListConsumerGroupsRequest
     * @return ListConsumerGroupsResponse
     */
    @Override
    public CompletableFuture<ListConsumerGroupsResponse> listConsumerGroups(ListConsumerGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListConsumerGroups").setMethod(HttpMethod.GET).setPathRegex("/instances/{instanceId}/consumerGroups").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListConsumerGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListConsumerGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, create a Global Replicator backup plan and add topic mapping items to the plan. Then use the corresponding planId, itemId, and source instance ID to query consumer offset synchronization checkpoints. To use Global Replicator, make sure that your account has the AliyunServiceRoleForRMQDisasterRecovery service-linked role. The system typically performs automatic creation of this role when you first use the associated feature.</p>
     * 
     * @param request the request parameters of ListDisasterRecoveryCheckpoints  ListDisasterRecoveryCheckpointsRequest
     * @return ListDisasterRecoveryCheckpointsResponse
     */
    @Override
    public CompletableFuture<ListDisasterRecoveryCheckpointsResponse> listDisasterRecoveryCheckpoints(ListDisasterRecoveryCheckpointsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListDisasterRecoveryCheckpoints").setMethod(HttpMethod.GET).setPathRegex("/disaster_recovery/{planId}/items/{itemId}/checkpoints").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDisasterRecoveryCheckpointsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDisasterRecoveryCheckpointsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDisasterRecoveryItems  ListDisasterRecoveryItemsRequest
     * @return ListDisasterRecoveryItemsResponse
     */
    @Override
    public CompletableFuture<ListDisasterRecoveryItemsResponse> listDisasterRecoveryItems(ListDisasterRecoveryItemsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListDisasterRecoveryItems").setMethod(HttpMethod.GET).setPathRegex("/disaster_recovery/{planId}/items").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDisasterRecoveryItemsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDisasterRecoveryItemsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDisasterRecoveryPlans  ListDisasterRecoveryPlansRequest
     * @return ListDisasterRecoveryPlansResponse
     */
    @Override
    public CompletableFuture<ListDisasterRecoveryPlansResponse> listDisasterRecoveryPlans(ListDisasterRecoveryPlansRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListDisasterRecoveryPlans").setMethod(HttpMethod.GET).setPathRegex("/disaster_recovery").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDisasterRecoveryPlansResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDisasterRecoveryPlansResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListInspectionTemplates  ListInspectionTemplatesRequest
     * @return ListInspectionTemplatesResponse
     */
    @Override
    public CompletableFuture<ListInspectionTemplatesResponse> listInspectionTemplates(ListInspectionTemplatesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListInspectionTemplates").setMethod(HttpMethod.GET).setPathRegex("/api/v1/monitoring/templates").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListInspectionTemplatesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListInspectionTemplatesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListInstanceAccount  ListInstanceAccountRequest
     * @return ListInstanceAccountResponse
     */
    @Override
    public CompletableFuture<ListInstanceAccountResponse> listInstanceAccount(ListInstanceAccountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListInstanceAccount").setMethod(HttpMethod.GET).setPathRegex("/instances/{instanceId}/accounts").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListInstanceAccountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListInstanceAccountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListInstanceAcl  ListInstanceAclRequest
     * @return ListInstanceAclResponse
     */
    @Override
    public CompletableFuture<ListInstanceAclResponse> listInstanceAcl(ListInstanceAclRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListInstanceAcl").setMethod(HttpMethod.GET).setPathRegex("/instances/{instanceId}/acl").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListInstanceAclResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListInstanceAclResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListInstanceInspectionResources  ListInstanceInspectionResourcesRequest
     * @return ListInstanceInspectionResourcesResponse
     */
    @Override
    public CompletableFuture<ListInstanceInspectionResourcesResponse> listInstanceInspectionResources(ListInstanceInspectionResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListInstanceInspectionResources").setMethod(HttpMethod.GET).setPathRegex("/api/v1/monitoring/instance-inspections/{instanceId}/resources").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListInstanceInspectionResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListInstanceInspectionResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListInstanceInspectionRuns  ListInstanceInspectionRunsRequest
     * @return ListInstanceInspectionRunsResponse
     */
    @Override
    public CompletableFuture<ListInstanceInspectionRunsResponse> listInstanceInspectionRuns(ListInstanceInspectionRunsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListInstanceInspectionRuns").setMethod(HttpMethod.GET).setPathRegex("/api/v1/monitoring/instance-inspections/{instanceId}/runs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListInstanceInspectionRunsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListInstanceInspectionRunsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListInstanceInspections  ListInstanceInspectionsRequest
     * @return ListInstanceInspectionsResponse
     */
    @Override
    public CompletableFuture<ListInstanceInspectionsResponse> listInstanceInspections(ListInstanceInspectionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListInstanceInspections").setMethod(HttpMethod.GET).setPathRegex("/api/v1/monitoring/instance-inspections").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListInstanceInspectionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListInstanceInspectionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListInstanceIpWhitelist  ListInstanceIpWhitelistRequest
     * @return ListInstanceIpWhitelistResponse
     */
    @Override
    public CompletableFuture<ListInstanceIpWhitelistResponse> listInstanceIpWhitelist(ListInstanceIpWhitelistRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListInstanceIpWhitelist").setMethod(HttpMethod.GET).setPathRegex("/instances/{instanceId}/ip/whitelist").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListInstanceIpWhitelistResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListInstanceIpWhitelistResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: The OpenAPI operations provided by Alibaba Cloud are management API operations that are used to manage and query resources of Alibaba Cloud services. Integrate OpenAPI operations only into the management data link. Do not use OpenAPI operations in the core data link for sending and receiving messages. Otherwise, risks may occur on the data link.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListInstances  ListInstancesRequest
     * @return ListInstancesResponse
     */
    @Override
    public CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListInstances").setMethod(HttpMethod.GET).setPathRegex("/instances").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListMessages  ListMessagesRequest
     * @return ListMessagesResponse
     */
    @Override
    public CompletableFuture<ListMessagesResponse> listMessages(ListMessagesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListMessages").setMethod(HttpMethod.GET).setPathRegex("/instances/{instanceId}/topics/{topicName}/messages").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMessagesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMessagesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListMetricMeta  ListMetricMetaRequest
     * @return ListMetricMetaResponse
     */
    @Override
    public CompletableFuture<ListMetricMetaResponse> listMetricMeta(ListMetricMetaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListMetricMeta").setMethod(HttpMethod.GET).setPathRegex("/monitor/metrics/meta").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMetricMetaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMetricMetaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListMigrationOperations  ListMigrationOperationsRequest
     * @return ListMigrationOperationsResponse
     */
    @Override
    public CompletableFuture<ListMigrationOperationsResponse> listMigrationOperations(ListMigrationOperationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListMigrationOperations").setMethod(HttpMethod.GET).setPathRegex("/migrations/{migrationId}/stages/{stageType}/operations").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMigrationOperationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMigrationOperationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListMigrations  ListMigrationsRequest
     * @return ListMigrationsResponse
     */
    @Override
    public CompletableFuture<ListMigrationsResponse> listMigrations(ListMigrationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListMigrations").setMethod(HttpMethod.GET).setPathRegex("/migrations").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMigrationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMigrationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListRegions  ListRegionsRequest
     * @return ListRegionsResponse
     */
    @Override
    public CompletableFuture<ListRegionsResponse> listRegions(ListRegionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListRegions").setMethod(HttpMethod.GET).setPathRegex("/regions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRegionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRegionsResponse> future = new CompletableFuture<>();
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListTagResources").setMethod(HttpMethod.GET).setPathRegex("/resourceTag/list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTopicSubscriptions  ListTopicSubscriptionsRequest
     * @return ListTopicSubscriptionsResponse
     */
    @Override
    public CompletableFuture<ListTopicSubscriptionsResponse> listTopicSubscriptions(ListTopicSubscriptionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListTopicSubscriptions").setMethod(HttpMethod.GET).setPathRegex("/instances/{instanceId}/topics/{topicName}/subscriptions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTopicSubscriptionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTopicSubscriptionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTopics  ListTopicsRequest
     * @return ListTopicsResponse
     */
    @Override
    public CompletableFuture<ListTopicsResponse> listTopics(ListTopicsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListTopics").setMethod(HttpMethod.GET).setPathRegex("/instances/{instanceId}/topics").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTopicsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTopicsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTraces  ListTracesRequest
     * @return ListTracesResponse
     */
    @Override
    public CompletableFuture<ListTracesResponse> listTraces(ListTracesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListTraces").setMethod(HttpMethod.GET).setPathRegex("/instances/{instanceId}/topics/{topicName}/traces").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTracesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTracesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ResetConsumeOffset  ResetConsumeOffsetRequest
     * @return ResetConsumeOffsetResponse
     */
    @Override
    public CompletableFuture<ResetConsumeOffsetResponse> resetConsumeOffset(ResetConsumeOffsetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ResetConsumeOffset").setMethod(HttpMethod.PATCH).setPathRegex("/instances/{instanceId}/consumerGroups/{consumerGroupId}/consumeOffsets/{topicName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResetConsumeOffsetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResetConsumeOffsetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RespondAgentConversationAction  RespondAgentConversationActionRequest
     * @return RespondAgentConversationActionResponse
     */
    @Override
    public CompletableFuture<RespondAgentConversationActionResponse> respondAgentConversationAction(RespondAgentConversationActionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RespondAgentConversationAction").setMethod(HttpMethod.POST).setPathRegex("/api/v1/conversations/{conversationId}/actions/{actionId}/respond").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RespondAgentConversationActionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RespondAgentConversationActionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RunInstanceInspection  RunInstanceInspectionRequest
     * @return RunInstanceInspectionResponse
     */
    @Override
    public CompletableFuture<RunInstanceInspectionResponse> runInstanceInspection(RunInstanceInspectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RunInstanceInspection").setMethod(HttpMethod.POST).setPathRegex("/api/v1/monitoring/instance-inspections/{instanceId}/runs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RunInstanceInspectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RunInstanceInspectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SendAgentConversationMessage  SendAgentConversationMessageRequest
     * @return SendAgentConversationMessageResponse
     */
    @Override
    public CompletableFuture<SendAgentConversationMessageResponse> sendAgentConversationMessage(SendAgentConversationMessageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SendAgentConversationMessage").setMethod(HttpMethod.POST).setPathRegex("/api/v1/conversations/{conversationId}/messages").setBodyType(BodyType.STRING).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SendAgentConversationMessageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SendAgentConversationMessageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public <ReturnT> CompletableFuture<ReturnT> sendAgentConversationMessageWithAsyncResponseHandler(SendAgentConversationMessageRequest request, AsyncResponseHandler<SendAgentConversationMessageResponse, ReturnT> responseHandler) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SendAgentConversationMessage").setMethod(HttpMethod.POST).setPathRegex("/api/v1/conversations/{conversationId}/messages").setBodyType(BodyType.STRING).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withResponseHandler(responseHandler).withOutput(SendAgentConversationMessageResponse.create());
            return this.handler.execute(params)
                    .thenCompose((output) -> CompletableFuture.completedFuture(responseHandler.transform((SendAgentConversationMessageResponse)output)));
        } catch (Exception e) {
            CompletableFuture<ReturnT> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public ResponseIterable<String> sendAgentConversationMessageWithResponseIterable(SendAgentConversationMessageRequest request) {
        this.handler.validateRequestModel(request);
        TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.SSE).setAction("SendAgentConversationMessage").setMethod(HttpMethod.POST).setPathRegex("/api/v1/conversations/{conversationId}/messages").setBodyType(BodyType.STRING).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
        SendAgentConversationMessageResponseBodyIterator iterator = SendAgentConversationMessageResponseBodyIterator.create();
        ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withHttpResponseHandler(new SSEHttpResponseHandler(iterator));
        this.handler.execute(params);
        return new ResponseIterable<>(iterator);
    }

    /**
     * @param request the request parameters of StartDisasterRecoveryItem  StartDisasterRecoveryItemRequest
     * @return StartDisasterRecoveryItemResponse
     */
    @Override
    public CompletableFuture<StartDisasterRecoveryItemResponse> startDisasterRecoveryItem(StartDisasterRecoveryItemRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StartDisasterRecoveryItem").setMethod(HttpMethod.POST).setPathRegex("/disaster_recovery/{planId}/items/{itemId}/start").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartDisasterRecoveryItemResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartDisasterRecoveryItemResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SteerAgentConversation  SteerAgentConversationRequest
     * @return SteerAgentConversationResponse
     */
    @Override
    public CompletableFuture<SteerAgentConversationResponse> steerAgentConversation(SteerAgentConversationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SteerAgentConversation").setMethod(HttpMethod.POST).setPathRegex("/api/v1/conversations/{conversationId}/actions/steer").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SteerAgentConversationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SteerAgentConversationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StopAgentConversation  StopAgentConversationRequest
     * @return StopAgentConversationResponse
     */
    @Override
    public CompletableFuture<StopAgentConversationResponse> stopAgentConversation(StopAgentConversationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StopAgentConversation").setMethod(HttpMethod.POST).setPathRegex("/api/v1/conversations/{conversationId}/actions/stop").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopAgentConversationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopAgentConversationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StopDisasterRecoveryItem  StopDisasterRecoveryItemRequest
     * @return StopDisasterRecoveryItemResponse
     */
    @Override
    public CompletableFuture<StopDisasterRecoveryItemResponse> stopDisasterRecoveryItem(StopDisasterRecoveryItemRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StopDisasterRecoveryItem").setMethod(HttpMethod.POST).setPathRegex("/disaster_recovery/{planId}/items/{itemId}/stop").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopDisasterRecoveryItemResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopDisasterRecoveryItemResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SyncDisasterRecoveryCheckpoint  SyncDisasterRecoveryCheckpointRequest
     * @return SyncDisasterRecoveryCheckpointResponse
     */
    @Override
    public CompletableFuture<SyncDisasterRecoveryCheckpointResponse> syncDisasterRecoveryCheckpoint(SyncDisasterRecoveryCheckpointRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SyncDisasterRecoveryCheckpoint").setMethod(HttpMethod.POST).setPathRegex("/disaster_recovery/{planId}/items/{itemId}/checkpoints/{checkpointId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SyncDisasterRecoveryCheckpointResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SyncDisasterRecoveryCheckpointResponse> future = new CompletableFuture<>();
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("TagResources").setMethod(HttpMethod.POST).setPathRegex("/resourceTag/create").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UntagResources").setMethod(HttpMethod.DELETE).setPathRegex("/resourceTag/delete").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UntagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UntagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateAgentConversation  UpdateAgentConversationRequest
     * @return UpdateAgentConversationResponse
     */
    @Override
    public CompletableFuture<UpdateAgentConversationResponse> updateAgentConversation(UpdateAgentConversationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateAgentConversation").setMethod(HttpMethod.PATCH).setPathRegex("/api/v1/conversations/{conversationId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAgentConversationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAgentConversationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateAgentConversationShareScope  UpdateAgentConversationShareScopeRequest
     * @return UpdateAgentConversationShareScopeResponse
     */
    @Override
    public CompletableFuture<UpdateAgentConversationShareScopeResponse> updateAgentConversationShareScope(UpdateAgentConversationShareScopeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateAgentConversationShareScope").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/conversations/{conversationId}/share-scope").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAgentConversationShareScopeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAgentConversationShareScopeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: The OpenAPI provided by Alibaba Cloud is a management and control API used to manage and query resources of Alibaba Cloud services. It is recommended only for integration in management and control links. Do not use OpenAPI in the core data link for sending and receiving messages. Otherwise, risks may occur on the data link.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UpdateConsumerGroup  UpdateConsumerGroupRequest
     * @return UpdateConsumerGroupResponse
     */
    @Override
    public CompletableFuture<UpdateConsumerGroupResponse> updateConsumerGroup(UpdateConsumerGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateConsumerGroup").setMethod(HttpMethod.PATCH).setPathRegex("/instances/{instanceId}/consumerGroups/{consumerGroupId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateConsumerGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateConsumerGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateDisasterRecoveryItem  UpdateDisasterRecoveryItemRequest
     * @return UpdateDisasterRecoveryItemResponse
     */
    @Override
    public CompletableFuture<UpdateDisasterRecoveryItemResponse> updateDisasterRecoveryItem(UpdateDisasterRecoveryItemRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateDisasterRecoveryItem").setMethod(HttpMethod.PATCH).setPathRegex("/disaster_recovery/{planId}/items/{itemId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDisasterRecoveryItemResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDisasterRecoveryItemResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateDisasterRecoveryPlan  UpdateDisasterRecoveryPlanRequest
     * @return UpdateDisasterRecoveryPlanResponse
     */
    @Override
    public CompletableFuture<UpdateDisasterRecoveryPlanResponse> updateDisasterRecoveryPlan(UpdateDisasterRecoveryPlanRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateDisasterRecoveryPlan").setMethod(HttpMethod.PATCH).setPathRegex("/disaster_recovery/{planId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDisasterRecoveryPlanResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDisasterRecoveryPlanResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: The OpenAPI provided by Alibaba Cloud is a management and control API used to manage and query resources of Alibaba Cloud services. It is recommended only for integration in management and control paths. Do not use OpenAPI in the core data link for sending and receiving messages. Otherwise, risks may occur on the link.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UpdateInstance  UpdateInstanceRequest
     * @return UpdateInstanceResponse
     */
    @Override
    public CompletableFuture<UpdateInstanceResponse> updateInstance(UpdateInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateInstance").setMethod(HttpMethod.PATCH).setPathRegex("/instances/{instanceId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateInstanceAccount  UpdateInstanceAccountRequest
     * @return UpdateInstanceAccountResponse
     */
    @Override
    public CompletableFuture<UpdateInstanceAccountResponse> updateInstanceAccount(UpdateInstanceAccountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateInstanceAccount").setMethod(HttpMethod.PATCH).setPathRegex("/instances/{instanceId}/accounts/{username}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateInstanceAccountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateInstanceAccountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateInstanceAcl  UpdateInstanceAclRequest
     * @return UpdateInstanceAclResponse
     */
    @Override
    public CompletableFuture<UpdateInstanceAclResponse> updateInstanceAcl(UpdateInstanceAclRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateInstanceAcl").setMethod(HttpMethod.PATCH).setPathRegex("/instances/{instanceId}/acl/account/{username}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateInstanceAclResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateInstanceAclResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateInstanceInspection  UpdateInstanceInspectionRequest
     * @return UpdateInstanceInspectionResponse
     */
    @Override
    public CompletableFuture<UpdateInstanceInspectionResponse> updateInstanceInspection(UpdateInstanceInspectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateInstanceInspection").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/monitoring/instance-inspections/{instanceId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateInstanceInspectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateInstanceInspectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateTopic  UpdateTopicRequest
     * @return UpdateTopicResponse
     */
    @Override
    public CompletableFuture<UpdateTopicResponse> updateTopic(UpdateTopicRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateTopic").setMethod(HttpMethod.PATCH).setPathRegex("/instances/{instanceId}/topics/{topicName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateTopicResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateTopicResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UploadAgentConversationLog  UploadAgentConversationLogRequest
     * @return UploadAgentConversationLogResponse
     */
    @Override
    public CompletableFuture<UploadAgentConversationLogResponse> uploadAgentConversationLog(UploadAgentConversationLogRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UploadAgentConversationLog").setMethod(HttpMethod.POST).setPathRegex("/api/v1/conversations/{conversationId}/logs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UploadAgentConversationLogResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UploadAgentConversationLogResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of VerifyConsumeMessage  VerifyConsumeMessageRequest
     * @return VerifyConsumeMessageResponse
     */
    @Override
    public CompletableFuture<VerifyConsumeMessageResponse> verifyConsumeMessage(VerifyConsumeMessageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("VerifyConsumeMessage").setMethod(HttpMethod.POST).setPathRegex("/instances/{instanceId}/topics/{topicName}/messages/{messageId}/action/verifyConsume").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(VerifyConsumeMessageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<VerifyConsumeMessageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of VerifySendMessage  VerifySendMessageRequest
     * @return VerifySendMessageResponse
     */
    @Override
    public CompletableFuture<VerifySendMessageResponse> verifySendMessage(VerifySendMessageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("VerifySendMessage").setMethod(HttpMethod.POST).setPathRegex("/instances/{instanceId}/topics/{topicName}/messages").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(VerifySendMessageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<VerifySendMessageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
