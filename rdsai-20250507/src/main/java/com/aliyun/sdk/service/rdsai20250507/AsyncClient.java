// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.rdsai20250507.models.*;
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
     * @param request the request parameters of ChatMessages  ChatMessagesRequest
     * @return ChatMessagesResponse
     */
    CompletableFuture<ChatMessagesResponse> chatMessages(ChatMessagesRequest request);

    ResponseIterable<ChatMessagesResponseBody> chatMessagesWithResponseIterable(ChatMessagesRequest request);

    /**
     * @param request the request parameters of ChatMessagesTaskStop  ChatMessagesTaskStopRequest
     * @return ChatMessagesTaskStopResponse
     */
    CompletableFuture<ChatMessagesTaskStopResponse> chatMessagesTaskStop(ChatMessagesTaskStopRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p> Fees of an instance are changed if the call is successful. Before you call this operation, carefully read the related topics.
     * <a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateAppInstance  CreateAppInstanceRequest
     * @return CreateAppInstanceResponse
     */
    CompletableFuture<CreateAppInstanceResponse> createAppInstance(CreateAppInstanceRequest request);

    /**
     * @param request the request parameters of CreateCustomAgent  CreateCustomAgentRequest
     * @return CreateCustomAgentResponse
     */
    CompletableFuture<CreateCustomAgentResponse> createCustomAgent(CreateCustomAgentRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p> Fees of an instance are changed if the call is successful. Before you call this operation, carefully read the related topics.
     * <a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a>
     *  If you delete an RDS Supabase instance, the created RDS for PostgreSQL instance and the created NAT gateway are not automatically deleted. You must manually release the instance and delete the Internet NAT gateway and EIP.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteAppInstance  DeleteAppInstanceRequest
     * @return DeleteAppInstanceResponse
     */
    CompletableFuture<DeleteAppInstanceResponse> deleteAppInstance(DeleteAppInstanceRequest request);

    /**
     * @param request the request parameters of DeleteCustomAgent  DeleteCustomAgentRequest
     * @return DeleteCustomAgentResponse
     */
    CompletableFuture<DeleteCustomAgentResponse> deleteCustomAgent(DeleteCustomAgentRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3><a href="#"></a>References</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * @param request the request parameters of DescribeAppInstanceAttribute  DescribeAppInstanceAttributeRequest
     * @return DescribeAppInstanceAttributeResponse
     */
    CompletableFuture<DescribeAppInstanceAttributeResponse> describeAppInstanceAttribute(DescribeAppInstanceAttributeRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3><a href="#"></a>References</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * @param request the request parameters of DescribeAppInstances  DescribeAppInstancesRequest
     * @return DescribeAppInstancesResponse
     */
    CompletableFuture<DescribeAppInstancesResponse> describeAppInstances(DescribeAppInstancesRequest request);

    /**
     * @param request the request parameters of DescribeEventsList  DescribeEventsListRequest
     * @return DescribeEventsListResponse
     */
    CompletableFuture<DescribeEventsListResponse> describeEventsList(DescribeEventsListRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3><a href="#"></a>References</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * @param request the request parameters of DescribeInstanceAuthInfo  DescribeInstanceAuthInfoRequest
     * @return DescribeInstanceAuthInfoResponse
     */
    CompletableFuture<DescribeInstanceAuthInfoResponse> describeInstanceAuthInfo(DescribeInstanceAuthInfoRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3><a href="#"></a>References</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * @param request the request parameters of DescribeInstanceEndpoints  DescribeInstanceEndpointsRequest
     * @return DescribeInstanceEndpointsResponse
     */
    CompletableFuture<DescribeInstanceEndpointsResponse> describeInstanceEndpoints(DescribeInstanceEndpointsRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3><a href="#"></a>References</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * @param request the request parameters of DescribeInstanceIpWhitelist  DescribeInstanceIpWhitelistRequest
     * @return DescribeInstanceIpWhitelistResponse
     */
    CompletableFuture<DescribeInstanceIpWhitelistResponse> describeInstanceIpWhitelist(DescribeInstanceIpWhitelistRequest request);

    /**
     * @param request the request parameters of DescribeInstanceRAGConfig  DescribeInstanceRAGConfigRequest
     * @return DescribeInstanceRAGConfigResponse
     */
    CompletableFuture<DescribeInstanceRAGConfigResponse> describeInstanceRAGConfig(DescribeInstanceRAGConfigRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3><a href="#"></a>References</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * @param request the request parameters of DescribeInstanceSSL  DescribeInstanceSSLRequest
     * @return DescribeInstanceSSLResponse
     */
    CompletableFuture<DescribeInstanceSSLResponse> describeInstanceSSL(DescribeInstanceSSLRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3><a href="#"></a>References</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * <blockquote>
     * <p> Only Object Storage Service (OSS) is supported for the storage of RDS Supabase.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeInstanceStorageConfig  DescribeInstanceStorageConfigRequest
     * @return DescribeInstanceStorageConfigResponse
     */
    CompletableFuture<DescribeInstanceStorageConfigResponse> describeInstanceStorageConfig(DescribeInstanceStorageConfigRequest request);

    /**
     * @param request the request parameters of GetConversations  GetConversationsRequest
     * @return GetConversationsResponse
     */
    CompletableFuture<GetConversationsResponse> getConversations(GetConversationsRequest request);

    /**
     * @param request the request parameters of GetCustomAgent  GetCustomAgentRequest
     * @return GetCustomAgentResponse
     */
    CompletableFuture<GetCustomAgentResponse> getCustomAgent(GetCustomAgentRequest request);

    /**
     * @param request the request parameters of GetMessages  GetMessagesRequest
     * @return GetMessagesResponse
     */
    CompletableFuture<GetMessagesResponse> getMessages(GetMessagesRequest request);

    /**
     * @param request the request parameters of ListCustomAgent  ListCustomAgentRequest
     * @return ListCustomAgentResponse
     */
    CompletableFuture<ListCustomAgentResponse> listCustomAgent(ListCustomAgentRequest request);

    /**
     * @param request the request parameters of ListCustomAgentTools  ListCustomAgentToolsRequest
     * @return ListCustomAgentToolsResponse
     */
    CompletableFuture<ListCustomAgentToolsResponse> listCustomAgentTools(ListCustomAgentToolsRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3><a href="#"></a>References</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * @param request the request parameters of ModifyInstanceAuthConfig  ModifyInstanceAuthConfigRequest
     * @return ModifyInstanceAuthConfigResponse
     */
    CompletableFuture<ModifyInstanceAuthConfigResponse> modifyInstanceAuthConfig(ModifyInstanceAuthConfigRequest request);

    /**
     * @param request the request parameters of ModifyInstanceConfig  ModifyInstanceConfigRequest
     * @return ModifyInstanceConfigResponse
     */
    CompletableFuture<ModifyInstanceConfigResponse> modifyInstanceConfig(ModifyInstanceConfigRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3><a href="#"></a>References</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * @param request the request parameters of ModifyInstanceIpWhitelist  ModifyInstanceIpWhitelistRequest
     * @return ModifyInstanceIpWhitelistResponse
     */
    CompletableFuture<ModifyInstanceIpWhitelistResponse> modifyInstanceIpWhitelist(ModifyInstanceIpWhitelistRequest request);

    /**
     * @param request the request parameters of ModifyInstanceRAGConfig  ModifyInstanceRAGConfigRequest
     * @return ModifyInstanceRAGConfigResponse
     */
    CompletableFuture<ModifyInstanceRAGConfigResponse> modifyInstanceRAGConfig(ModifyInstanceRAGConfigRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3><a href="#"></a>References</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * @param request the request parameters of ModifyInstanceSSL  ModifyInstanceSSLRequest
     * @return ModifyInstanceSSLResponse
     */
    CompletableFuture<ModifyInstanceSSLResponse> modifyInstanceSSL(ModifyInstanceSSLRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3><a href="#"></a>References</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * <blockquote>
     * <p> Only Object Storage Service (OSS) is supported for the storage of RDS Supabase.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyInstanceStorageConfig  ModifyInstanceStorageConfigRequest
     * @return ModifyInstanceStorageConfigResponse
     */
    CompletableFuture<ModifyInstanceStorageConfigResponse> modifyInstanceStorageConfig(ModifyInstanceStorageConfigRequest request);

    /**
     * @param request the request parameters of ModifyMessagesFeedbacks  ModifyMessagesFeedbacksRequest
     * @return ModifyMessagesFeedbacksResponse
     */
    CompletableFuture<ModifyMessagesFeedbacksResponse> modifyMessagesFeedbacks(ModifyMessagesFeedbacksRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3><a href="#"></a>References</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * <blockquote>
     * <p> You can only change the password of a RDS Supabase Dashboard user.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ResetInstancePassword  ResetInstancePasswordRequest
     * @return ResetInstancePasswordResponse
     */
    CompletableFuture<ResetInstancePasswordResponse> resetInstancePassword(ResetInstancePasswordRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3><a href="#"></a>References</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * @param request the request parameters of RestartInstance  RestartInstanceRequest
     * @return RestartInstanceResponse
     */
    CompletableFuture<RestartInstanceResponse> restartInstance(RestartInstanceRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3><a href="#"></a>References</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * @param request the request parameters of StartInstance  StartInstanceRequest
     * @return StartInstanceResponse
     */
    CompletableFuture<StartInstanceResponse> startInstance(StartInstanceRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3><a href="#"></a>References</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * @param request the request parameters of StopInstance  StopInstanceRequest
     * @return StopInstanceResponse
     */
    CompletableFuture<StopInstanceResponse> stopInstance(StopInstanceRequest request);

    /**
     * @param request the request parameters of UpdateCustomAgent  UpdateCustomAgentRequest
     * @return UpdateCustomAgentResponse
     */
    CompletableFuture<UpdateCustomAgentResponse> updateCustomAgent(UpdateCustomAgentRequest request);

}
