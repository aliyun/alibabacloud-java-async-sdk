// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.ons20190214.models.*;
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
        this.product = "Ons";
        this.version = "2019-02-14";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("ap-northeast-2-pop", "ons.ap-northeast-1.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "ons.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "ons.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "ons.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "ons.aliyuncs.com"),
            new TeaPair("cn-edge-1", "ons.aliyuncs.com"),
            new TeaPair("cn-fujian", "ons.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "ons.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "ons.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "ons.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "ons.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "ons.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "ons.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "ons.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "ons.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "ons.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "ons.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "ons.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "ons.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "ons.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "ons.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "ons.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "ons.aliyuncs.com"),
            new TeaPair("cn-wuhan", "ons.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "ons.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "ons.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "ons.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "ons.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "ons.ap-northeast-1.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "ons.ap-northeast-1.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * When you call the **ListTagResources** operation, specify at least one of the following parameters in the request: **Tag.N.Key** and **ResourceId.N**. You can specify a resource ID to query all tags that are attached to the specified resource. You can also specify a tag key to query the tag value and the resource to which the tag is attached.
      * *   If you include the **Tag.N.Key** parameter in a request, you can obtain the tag value and the ID of the resource to which the tag is attached.********
      * *   If you include the **ResourceId.N** parameter in a request, you can obtain the keys and values of all tags that are attached to the specified resource.
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
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * You can call this operation in scenarios in which you want to know the message consumption progress of a specified consumer group in production environments. You can obtain the information about message consumption and consumption latency based on the returned information. This operation returns the total number of accumulated messages in all topics to which the specified consumer group subscribes and the number of accumulated messages in each topic.
      *
     */
    @Override
    public CompletableFuture<OnsConsumerAccumulateResponse> onsConsumerAccumulate(OnsConsumerAccumulateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OnsConsumerAccumulate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OnsConsumerAccumulateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OnsConsumerAccumulateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * When messages are accumulated in a topic, you can call this operation to check whether a consumer is online.
      *
     */
    @Override
    public CompletableFuture<OnsConsumerGetConnectionResponse> onsConsumerGetConnection(OnsConsumerGetConnectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OnsConsumerGetConnection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OnsConsumerGetConnectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OnsConsumerGetConnectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * You can call this operation to clear accumulated messages or reset the consumption progress. You can use one of the following methods to clear accumulated messages:
      * *   Clear all accumulated messages in a specified topic.
      * *   Clear the messages that were published to the specified topic before a specified point in time.
      *
     */
    @Override
    public CompletableFuture<OnsConsumerResetOffsetResponse> onsConsumerResetOffset(OnsConsumerResetOffsetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OnsConsumerResetOffset").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OnsConsumerResetOffsetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OnsConsumerResetOffsetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * *   You can call this operation in scenarios in which consumers are online and messages are accumulated. You can troubleshoot errors based on the information that is returned by this operation. You can check whether all consumers in the consumer group subscribe to the same topics and tags, and whether load balancing is performed as expected. You can also obtain the information about thread stack traces of online consumers.
      * *   This operation uses multiple backend operations to query and aggregate data. The system requires a long period of time to process a request. We recommend that you do not frequently call this operation.
      *
     */
    @Override
    public CompletableFuture<OnsConsumerStatusResponse> onsConsumerStatus(OnsConsumerStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OnsConsumerStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OnsConsumerStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OnsConsumerStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * You can call this operation to query the earliest point in time when a message was published to a specified topic and the most recent point in time when a message was published to the specified topic. You can also obtain the most recent point in time when a message in the topic was consumed. This operation is usually used with the \\*\\*OnsConsumerAccumulate\\*\\* operation to display the overview of the consumption progress.
      *
     */
    @Override
    public CompletableFuture<OnsConsumerTimeSpanResponse> onsConsumerTimeSpan(OnsConsumerTimeSpanRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OnsConsumerTimeSpan").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OnsConsumerTimeSpanResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OnsConsumerTimeSpanResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * This operation uses the exact match method to query a dead-letter message based on the message ID. You can obtain the message ID that is required to query the information about a dead-letter message from the SendResult parameter that is returned after the message is sent. You can also obtain the message ID by calling the OnsDLQMessagePageQueryByGroupId operation to query multiple messages at a time. The queried information about the dead-letter message includes the point in time when the message is stored, the message body, and attributes such as the message tag and the message key.
      *
     */
    @Override
    public CompletableFuture<OnsDLQMessageGetByIdResponse> onsDLQMessageGetById(OnsDLQMessageGetByIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OnsDLQMessageGetById").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OnsDLQMessageGetByIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OnsDLQMessageGetByIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * *   If you do not know the ID of the dead-letter message that you want to query, you can call this operation to query all dead-letter messages that are sent to a specified consumer group within a specified time range. The results are returned by page.
      * *   We recommend that you specify a short time range to query dead-letter messages in this method. If you specify a long time range, a large number of dead-letter messages are returned. In this case, you cannot find the dead-letter message that you want to query in an efficient manner. You can perform the following steps to query dead-letter messages:
      *     1.  Perform a paged query by specifying the group ID, start time, end time, and number of entries to return on each page. If matched messages are found, the information about the dead-letter messages on the first page, total number of pages, and task ID are returned by default.
      *     2.  Specify the task ID and a page number to call this operation again to query the dead-letter messages on the specified page. In this query, the BeginTime, EndTime, and PageSize parameters do not take effect. By default, the system uses the values of these parameters that you specified in the request when you created the specified query task.
      *
     */
    @Override
    public CompletableFuture<OnsDLQMessagePageQueryByGroupIdResponse> onsDLQMessagePageQueryByGroupId(OnsDLQMessagePageQueryByGroupIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OnsDLQMessagePageQueryByGroupId").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OnsDLQMessagePageQueryByGroupIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OnsDLQMessagePageQueryByGroupIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * *   After the number of retries to send a message to a consumer group for consumption reaches the upper limit and the message is not consumed by a consumer in the group, the message is added to the dead-letter queue of the consumer group. The message is a dead-letter message. After you resend the dead-letter message to the consumer group for consumption and the message fails to be consumed again after the maximum number of retries, a dead-letter message with the same message ID is added to the dead-letter queue. You can view the details of the dead-letter message on the Dead-letter Queues page in the Message Queue for Apache RocketMQ console or by calling the API operations that are used to query dead-letter messages. You can obtain the number of consumption failures for a message based on the number of dead-letter messages with the same message ID in the dead-letter queue.
      * *   A dead-letter message is a message that fails to be consumed after the number of consumption retries reaches the upper limit. Generally, dead-letter messages are produced because of incorrect consumption logic. We recommend that you troubleshoot the consumption failures and then call this operation to send the message to the consumer group for consumption again.
      * *   Message Queue for Apache RocketMQ does not manage the status of dead-letter messages based on the consumption status of the dead-letter messages. After you call this operation to send a dead-letter message to a consumer group and the message is consumed, Message Queue for Apache RocketMQ does not remove the dead-letter message from the dead-letter queue. You must manage dead-letter messages and determine whether to send a dead-letter message to a consumer group for consumption. This way, you do not resend and reconsume the messages that are consumed.
      *
     */
    @Override
    public CompletableFuture<OnsDLQMessageResendByIdResponse> onsDLQMessageResendById(OnsDLQMessageResendByIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OnsDLQMessageResendById").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OnsDLQMessageResendByIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OnsDLQMessageResendByIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * You can call this operation to configure the permissions for a consumer group to read messages based on a specified region of Message Queue for Apache RocketMQ and a specified group ID. You can call this operation in scenarios in which you want to forbid consumers in a specific group from reading messages.
      *
     */
    @Override
    public CompletableFuture<OnsGroupConsumerUpdateResponse> onsGroupConsumerUpdate(OnsGroupConsumerUpdateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OnsGroupConsumerUpdate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OnsGroupConsumerUpdateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OnsGroupConsumerUpdateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * When you release a new application or implement new business logic, you need new consumer groups. You can call this operation to create a consumer group.
      *
     */
    @Override
    public CompletableFuture<OnsGroupCreateResponse> onsGroupCreate(OnsGroupCreateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OnsGroupCreate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OnsGroupCreateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OnsGroupCreateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > 
      * *   The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * *   After you delete a group, the consumers in the group immediately stop receiving messages. Exercise caution when you call this operation.
      * You can call this operation to delete a group when you need to deallocate the resources of the group. For example, after an application is brought offline, you can delete the groups that are used for the application. After you delete a group, the backend of Message Queue for Apache RocketMQ deallocates the resources of the group. The system requires a long period of time to deallocate the resources. We recommend that you do not create a group that uses the same name as a deleted group immediately after you delete the group. If the system fails to delete the specified group, troubleshoot the issue based on the error code.
      *
     */
    @Override
    public CompletableFuture<OnsGroupDeleteResponse> onsGroupDelete(OnsGroupDeleteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OnsGroupDelete").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OnsGroupDeleteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OnsGroupDeleteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      *
     */
    @Override
    public CompletableFuture<OnsGroupListResponse> onsGroupList(OnsGroupListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OnsGroupList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OnsGroupListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OnsGroupListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      *
     */
    @Override
    public CompletableFuture<OnsGroupSubDetailResponse> onsGroupSubDetail(OnsGroupSubDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OnsGroupSubDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OnsGroupSubDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OnsGroupSubDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * To send and receive messages, a client must be connected to a Message Queue for Apache RocketMQ instance by using an endpoint. You can call this operation to query the endpoints of the instance.
      *
     */
    @Override
    public CompletableFuture<OnsInstanceBaseInfoResponse> onsInstanceBaseInfo(OnsInstanceBaseInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OnsInstanceBaseInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OnsInstanceBaseInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OnsInstanceBaseInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * An instance is a virtual machine (VM) that can be used to store information about the topics and groups of Message Queue for Apache RocketMQ. You can call this operation when you need to create service resources for the business that you want to launch. Take note of the following points when you call this operation:
      * *   A maximum of eight Message Queue for Apache RocketMQ instances can be deployed in each region.
      * *   This operation can be called to create only a Standard Edition instance. You can use the Message Queue for Apache RocketMQ console to create Standard Edition instances and Enterprise Platinum Edition instances. For information about how to create Message Queue for Apache RocketMQ instances, see [Manage instances](~~200153~~).
      *
     */
    @Override
    public CompletableFuture<OnsInstanceCreateResponse> onsInstanceCreate(OnsInstanceCreateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OnsInstanceCreate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OnsInstanceCreateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OnsInstanceCreateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * *   You can call this operation when you need to reclaim resources. For example, after you unpublish an application, you can reclaim the resources that were used for the application. An instance can be deleted only when the instance does not contain topics and groups.
      * *   After an instance is deleted, the instance cannot be recovered. Exercise caution when you call this operation.
      *
     */
    @Override
    public CompletableFuture<OnsInstanceDeleteResponse> onsInstanceDelete(OnsInstanceDeleteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OnsInstanceDelete").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OnsInstanceDeleteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OnsInstanceDeleteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      *
     */
    @Override
    public CompletableFuture<OnsInstanceInServiceListResponse> onsInstanceInServiceList(OnsInstanceInServiceListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OnsInstanceInServiceList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OnsInstanceInServiceListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OnsInstanceInServiceListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * A maximum of eight Message Queue for Apache RocketMQ instances can be deployed in each region.
      *
     */
    @Override
    public CompletableFuture<OnsInstanceUpdateResponse> onsInstanceUpdate(OnsInstanceUpdateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OnsInstanceUpdate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OnsInstanceUpdateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OnsInstanceUpdateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<OnsMessageDetailResponse> onsMessageDetail(OnsMessageDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OnsMessageDetail").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OnsMessageDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OnsMessageDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * *   This operation uses the fuzzy match method to query messages based on a specified message key. The same message key may be used by multiple messages. Therefore, the returned result may contain the information about multiple messages.
      * *   This operation can be used in scenarios in which you cannot obtain the IDs of the messages that you want to query. You can perform the following steps to query the information about messages:
      *     1.  Call this operation to query message IDs.
      *     2.  Call the **OnsMessageGetByMsgId** operation to query the details of a specified message. The OnsMessageGetByMsgId operation uses the exact match method. For more information about the **OnsMessageGetByMsgId** operation, see [OnsMessageGetByMsgId](~~29607~~).
      *
     */
    @Override
    public CompletableFuture<OnsMessageGetByKeyResponse> onsMessageGetByKey(OnsMessageGetByKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OnsMessageGetByKey").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OnsMessageGetByKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OnsMessageGetByKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * *   If a message is not consumed as expected, you can call this operation to query the information about the message for troubleshooting.
      * *   This operation uses the exact match method to query a message based on the message ID. You can obtain the message ID from the SendResult parameter that is returned after the message is sent. You must store the returned information after each message is sent. The queried information about a message includes the point in time when the message was sent, the broker on which the message is stored, and the attributes of the message such as the message key and tag.
      *
     */
    @Override
    public CompletableFuture<OnsMessageGetByMsgIdResponse> onsMessageGetByMsgId(OnsMessageGetByMsgIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OnsMessageGetByMsgId").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OnsMessageGetByMsgIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OnsMessageGetByMsgIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * *   If you do not know the message ID or message key of a message that you want to query, you can call this operation to query all messages that are stored in a topic within a specified time range. The results are displayed by page.
      * *   We recommend that you specify a short time range to query messages. If you specify a long time range, a large number of messages are returned. In this case, you cannot find the message that you want to query in an efficient manner. You can perform the following steps to query messages:
      *     1.  Perform a paged query by specifying the topic, start time, end time, and number of entries to return on each page. If the topic contains messages, the information about the messages on the first page, total number of pages, and task ID are returned by default.
      *     2.  Specify the task ID and a page number to call this operation again to query the messages on the specified page. In this query, the BeginTime, EndTime, and PageSize parameters do not take effect. By default, the system uses the values of these parameters that you specified in the request when you created the specified query task.
      *
     */
    @Override
    public CompletableFuture<OnsMessagePageQueryByTopicResponse> onsMessagePageQueryByTopic(OnsMessagePageQueryByTopicRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OnsMessagePageQueryByTopic").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OnsMessagePageQueryByTopicResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OnsMessagePageQueryByTopicResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Note
      * This operation can be used to check whether messages in a specified topic can be consumed by consumers in a specified consumer group. This operation obtains the body of the message that is specified by the MsgId parameter, re-encapsulates the message body to produce a new message, and then pushes the new message to a specified consumer. The content of the message that is sent to the consumer is the same as the content of the original message. They are not the same message because they use different message IDs.
      *
     */
    @Override
    public CompletableFuture<OnsMessagePushResponse> onsMessagePush(OnsMessagePushRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OnsMessagePush").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OnsMessagePushResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OnsMessagePushResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * *   You can call this operation to check whether a specified message is consumed. If the message is not consumed, you can troubleshoot the issue based on the returned information.
      * *   This operation queries information based on the built-in offset mechanism of Message Queue for Apache RocketMQ. In most cases, the results are correct. If you have reset the consumer offset or cleared accumulated messages, the results may not be correct.
      *
     */
    @Override
    public CompletableFuture<OnsMessageTraceResponse> onsMessageTrace(OnsMessageTraceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OnsMessageTrace").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OnsMessageTraceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OnsMessageTraceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * When you use an SDK to access and manage a Message Queue for Apache RocketMQ instance, you must sequentially specify the information about two regions. You can query the information about the second region by calling the \\*\\*OnsRegionList\\*\\* operation. You must apply for a public endpoint in the following scenarios:
      * *   Connect your application to Message Queue for Apache RocketMQ: Select the nearest API gateway endpoint based on the region where your application is deployed, and enter the corresponding **region ID**. The **regionId** is used to access Alibaba Cloud API Gateway because Message Queue for Apache RocketMQ instances provide API services by using the OpenAPI Explorer platform, which is also called POP.
      * *   Access a region to manage its resources: Specify a region where you want to manage Message Queue for Apache RocketMQ resources and enter the region ID. You can query the region ID by calling the **OnsRegionList** operation.
      *
     */
    @Override
    public CompletableFuture<OnsRegionListResponse> onsRegionList(OnsRegionListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OnsRegionList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OnsRegionListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OnsRegionListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * When you want to release a new application or expand your business, you can call this operation to create a topic based on your business requirements.
      *
     */
    @Override
    public CompletableFuture<OnsTopicCreateResponse> onsTopicCreate(OnsTopicCreateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OnsTopicCreate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OnsTopicCreateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OnsTopicCreateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * >  The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur. - After you delete the topic, the publishing and subscription relationships that are constructed based on the topic are cleared. Exercise caution when you call this operation.
      * You can call this operation to delete a topic when you need to reclaim the resources from the topic. For example, after an application is brought offline, you can delete the topics that are used for the application. After you delete a topic, the backend of Message Queue for Apache RocketMQ reclaims the resources from the topic. The system requires a long period of time to reclaim the resources. After you delete a topic, we recommend that you do not create a topic that uses the same name as the deleted topic within a short period of time. If the system fails to delete the specified topic, troubleshoot the issue based on the error code.
      *
     */
    @Override
    public CompletableFuture<OnsTopicDeleteResponse> onsTopicDelete(OnsTopicDeleteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OnsTopicDelete").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OnsTopicDeleteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OnsTopicDeleteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * This operation returns the basic information about topics and does not return the details of topics.
      *
     */
    @Override
    public CompletableFuture<OnsTopicListResponse> onsTopicList(OnsTopicListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OnsTopicList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OnsTopicListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OnsTopicListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * You can determine the resource usage of a topic based on the information that is returned by this operation. The returned information includes the total number of messages in the topic and the most recent point in time when a message was published to the topic.
      *
     */
    @Override
    public CompletableFuture<OnsTopicStatusResponse> onsTopicStatus(OnsTopicStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OnsTopicStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OnsTopicStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OnsTopicStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * You can call this operation to query the online consumer groups that subscribe to a specified topic. If all consumers in a group are offline, the information about the group is not returned.
      *
     */
    @Override
    public CompletableFuture<OnsTopicSubDetailResponse> onsTopicSubDetail(OnsTopicSubDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OnsTopicSubDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OnsTopicSubDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OnsTopicSubDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise system risks may occur.
      * You can call this operation to forbid read or write operations on a specific topic.
      *
     */
    @Override
    public CompletableFuture<OnsTopicUpdateResponse> onsTopicUpdate(OnsTopicUpdateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OnsTopicUpdate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OnsTopicUpdateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OnsTopicUpdateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Usage notes
      * *   Before you call this operation to query the details of the trace of a message, you must create a task to query the trace of the message based on the message ID or message key and obtains the task ID. Then, you can call this operation to query the details of the message trace based on the task ID. You can call the [OnsTraceQueryByMsgId](~~59830~~) operation or the [OnsTraceQueryByMsgKey](~~59831~~) operation to create a task to query the trace of the message and obtain the task ID from the **QueryId** response parameter.
      * *   A trace query task is time-consuming. If you call this operation to query the details immediately after you create a trace query task, the results may be empty. In this case, we recommend that you try again later.
      *
     */
    @Override
    public CompletableFuture<OnsTraceGetResultResponse> onsTraceGetResult(OnsTraceGetResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OnsTraceGetResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OnsTraceGetResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OnsTraceGetResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Note
      * If you want to query the trace of a message based on the message ID, you can call this operation to create a query task. After you obtain the task ID, you can call the [OnsTraceGetResult](~~59832~~) operation to query the details of the message trace based on the task ID.
      *
     */
    @Override
    public CompletableFuture<OnsTraceQueryByMsgIdResponse> onsTraceQueryByMsgId(OnsTraceQueryByMsgIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OnsTraceQueryByMsgId").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OnsTraceQueryByMsgIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OnsTraceQueryByMsgIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * If you obtain the key of a message and want to query the trace of the message, you can call this operation to create a query task. After you obtain the task ID, you can call the OnsTraceGetResult operation to query the details of the message trace based on the task ID.
      *
     */
    @Override
    public CompletableFuture<OnsTraceQueryByMsgKeyResponse> onsTraceQueryByMsgKey(OnsTraceQueryByMsgKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OnsTraceQueryByMsgKey").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OnsTraceQueryByMsgKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OnsTraceQueryByMsgKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Note
      * You can call this operation to query the following statistics that are collected in the production environment:
      * *   The number of messages that are consumed during each sampling period
      * *   The transactions per second (TPS) for message consumption during each sampling period
      * >  If your application publishes a small number of messages and does not publish messages at a specific interval, we recommend that you query the number of messages that are consumed during each sampling period because the statistics of TPS may not show a clear change trend.
      *
     */
    @Override
    public CompletableFuture<OnsTrendGroupOutputTpsResponse> onsTrendGroupOutputTps(OnsTrendGroupOutputTpsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OnsTrendGroupOutputTps").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OnsTrendGroupOutputTpsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OnsTrendGroupOutputTpsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Note
      * You can call this operation to query the statistics of messages that are published to a specified topic in the production environment. You can obtain the number of messages that are published to the topic or the transactions per second (TPS) for message publishing during each sampling period within a specified time range.
      * >  If your application publishes a small number of messages and does not publish messages at a specific interval, we recommend that you query the number of messages that are published to the topic during each sampling period because the statistics of TPS may not show a clear change trend.
      *
     */
    @Override
    public CompletableFuture<OnsTrendTopicInputTpsResponse> onsTrendTopicInputTps(OnsTrendTopicInputTpsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OnsTrendTopicInputTps").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OnsTrendTopicInputTpsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OnsTrendTopicInputTpsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * You can call this operation when you use Message Queue for Apache RocketMQ for the first time. You can use Message Queue for Apache RocketMQ only after this service is activated.
      * The Message Queue for Apache RocketMQ service can be activated only in the China (Hangzhou) region. Service activation is not billed.
      *
     */
    @Override
    public CompletableFuture<OpenOnsServiceResponse> openOnsService(OpenOnsServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OpenOnsService").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OpenOnsServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OpenOnsServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
      * You can call this operation to attach tags to a source. You can use tags to classify resources in Message Queue for Apache RocketMQ. This can help you aggregate and search resources in an efficient manner.
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
      * > : The API operations that are provided by Alibaba Cloud are used to manage and query resources of Alibaba Cloud services. We recommend that you integrate these API operations only in management systems. Do not use these API operations in the core system of messaging services. Otherwise, system risks may occur.
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

}
