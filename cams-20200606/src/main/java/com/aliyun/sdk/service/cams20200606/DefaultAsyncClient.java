// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.cams20200606.models.*;
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
        this.product = "cams";
        this.version = "2020-06-06";
        this.endpointRule = "regional";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of AddAddressRecoverSuspend  AddAddressRecoverSuspendRequest
     * @return AddAddressRecoverSuspendResponse
     */
    @Override
    public CompletableFuture<AddAddressRecoverSuspendResponse> addAddressRecoverSuspend(AddAddressRecoverSuspendRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddAddressRecoverSuspend").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddAddressRecoverSuspendResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddAddressRecoverSuspendResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddAuditViberOpen  AddAuditViberOpenRequest
     * @return AddAuditViberOpenResponse
     */
    @Override
    public CompletableFuture<AddAuditViberOpenResponse> addAuditViberOpen(AddAuditViberOpenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddAuditViberOpen").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddAuditViberOpenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddAuditViberOpenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: The feature of creating IM groups through API operations is a Meta closed beta feature. Contact your account manager to apply for whitelist access.</notice></p>
     * </blockquote>
     * <ul>
     * <li>You can call this operation to create an IM group. Currently, you can only create IM groups by calling API operations.</li>
     * <li>After the group is created, you can call the <a href="https://help.aliyun.com/document_detail/3019211.html">AddChatGroupInviteLink</a> operation to add an invitation link and invite members to the IM group.</li>
     * <li>For groups whose channel type is WhatsApp, the maximum number of members is 8.</li>
     * </ul>
     * 
     * @param request the request parameters of AddChatGroup  AddChatGroupRequest
     * @return AddChatGroupResponse
     */
    @Override
    public CompletableFuture<AddChatGroupResponse> addChatGroup(AddChatGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddChatGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddChatGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddChatGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><notice>The feature to add an IM group invite link through the API is a Meta beta feature. Contact your account manager to request allowlist access.</notice></p>
     * <ul>
     * <li>Before calling this API operation, make sure that you have created an IM group.</li>
     * <li>If you have not created an IM group, you can call the <a href="https://help.aliyun.com/document_detail/2998429.html">AddChatGroup</a> operation to create one.</li>
     * <li>After calling this API operation to add an IM group invite link, you can use the link to invite members to the IM group.</li>
     * <li>Currently, members can only join an IM group by using an invite link.</li>
     * <li>The maximum number of members in a group with the WhatsApp channel type is 8.</li>
     * </ul>
     * 
     * @param request the request parameters of AddChatGroupInviteLink  AddChatGroupInviteLinkRequest
     * @return AddChatGroupInviteLinkResponse
     */
    @Override
    public CompletableFuture<AddChatGroupInviteLinkResponse> addChatGroupInviteLink(AddChatGroupInviteLinkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddChatGroupInviteLink").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddChatGroupInviteLinkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddChatGroupInviteLinkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The QPS limit per user for this API operation is 10 requests per second. If the limit is exceeded, API calls are throttled, which may affect your business. Call this API operation as needed.</p>
     * 
     * @param request the request parameters of AddChatappPhoneNumber  AddChatappPhoneNumberRequest
     * @return AddChatappPhoneNumberResponse
     */
    @Override
    public CompletableFuture<AddChatappPhoneNumberResponse> addChatappPhoneNumber(AddChatappPhoneNumberRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddChatappPhoneNumber").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddChatappPhoneNumberResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddChatappPhoneNumberResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddContacts  AddContactsRequest
     * @return AddContactsResponse
     */
    @Override
    public CompletableFuture<AddContactsResponse> addContacts(AddContactsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddContacts").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddContactsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddContactsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>After you submit the users of a custom audience to Meta, Meta discards the matching data if fewer than 100 users are successfully matched. This prevents the submitted phone numbers from being compared with tokens to establish direct relationships. You can pass up to 10,000 user records in a single request.</p>
     * 
     * @param request the request parameters of AddCustomAudienceUser  AddCustomAudienceUserRequest
     * @return AddCustomAudienceUserResponse
     */
    @Override
    public CompletableFuture<AddCustomAudienceUserResponse> addCustomAudienceUser(AddCustomAudienceUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddCustomAudienceUser").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddCustomAudienceUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddCustomAudienceUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddGroup  AddGroupRequest
     * @return AddGroupResponse
     */
    @Override
    public CompletableFuture<AddGroupResponse> addGroup(AddGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddMarketingFlow  AddMarketingFlowRequest
     * @return AddMarketingFlowResponse
     */
    @Override
    public CompletableFuture<AddMarketingFlowResponse> addMarketingFlow(AddMarketingFlowRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddMarketingFlow").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddMarketingFlowResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddMarketingFlowResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ArchiveChatappTemplate  ArchiveChatappTemplateRequest
     * @return ArchiveChatappTemplateResponse
     */
    @Override
    public CompletableFuture<ArchiveChatappTemplateResponse> archiveChatappTemplate(ArchiveChatappTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ArchiveChatappTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ArchiveChatappTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ArchiveChatappTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BindDmAccount  BindDmAccountRequest
     * @return BindDmAccountResponse
     */
    @Override
    public CompletableFuture<BindDmAccountResponse> bindDmAccount(BindDmAccountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BindDmAccount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BindDmAccountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BindDmAccountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BindInstagramPage  BindInstagramPageRequest
     * @return BindInstagramPageResponse
     */
    @Override
    public CompletableFuture<BindInstagramPageResponse> bindInstagramPage(BindInstagramPageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BindInstagramPage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BindInstagramPageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BindInstagramPageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BindMessengerPage  BindMessengerPageRequest
     * @return BindMessengerPageResponse
     */
    @Override
    public CompletableFuture<BindMessengerPageResponse> bindMessengerPage(BindMessengerPageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BindMessengerPage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BindMessengerPageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BindMessengerPageResponse> future = new CompletableFuture<>();
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
     * <b>description</b> :
     * <p>The queries per second (QPS) limit for a single user is 10. If you exceed this limit, API calls are throttled, which may affect your services. Make API calls at a reasonable rate.</p>
     * 
     * @param request the request parameters of ChatappBindWaba  ChatappBindWabaRequest
     * @return ChatappBindWabaResponse
     */
    @Override
    public CompletableFuture<ChatappBindWabaResponse> chatappBindWaba(ChatappBindWabaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ChatappBindWaba").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChatappBindWabaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChatappBindWabaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The queries per second (QPS) limit for this operation is 10 calls per second per user. If this limit is exceeded, API calls are throttled, which may affect your business. Call this operation at an appropriate frequency.</p>
     * 
     * @param request the request parameters of ChatappMigrationRegister  ChatappMigrationRegisterRequest
     * @return ChatappMigrationRegisterResponse
     */
    @Override
    public CompletableFuture<ChatappMigrationRegisterResponse> chatappMigrationRegister(ChatappMigrationRegisterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ChatappMigrationRegister").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChatappMigrationRegisterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChatappMigrationRegisterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The China Message Service API has a single-user QPS limit of 10 calls per second. If this limit is exceeded, throttling is triggered, which may affect your business. Manage your calls appropriately.</p>
     * 
     * @param request the request parameters of ChatappMigrationVerified  ChatappMigrationVerifiedRequest
     * @return ChatappMigrationVerifiedResponse
     */
    @Override
    public CompletableFuture<ChatappMigrationVerifiedResponse> chatappMigrationVerified(ChatappMigrationVerifiedRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ChatappMigrationVerified").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChatappMigrationVerifiedResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChatappMigrationVerifiedResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The queries per second (QPS) limit per user for this operation is 10. If this limit is exceeded, API calls are throttled, which may affect your business. Make API calls at a reasonable rate.</p>
     * 
     * @param request the request parameters of ChatappPhoneNumberDeregister  ChatappPhoneNumberDeregisterRequest
     * @return ChatappPhoneNumberDeregisterResponse
     */
    @Override
    public CompletableFuture<ChatappPhoneNumberDeregisterResponse> chatappPhoneNumberDeregister(ChatappPhoneNumberDeregisterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ChatappPhoneNumberDeregister").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChatappPhoneNumberDeregisterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChatappPhoneNumberDeregisterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The queries per second (QPS) limit for a single user is 10. If the limit is exceeded, API calls are throttled, which may affect your services. Call the API at a reasonable frequency.</p>
     * 
     * @param request the request parameters of ChatappPhoneNumberRegister  ChatappPhoneNumberRegisterRequest
     * @return ChatappPhoneNumberRegisterResponse
     */
    @Override
    public CompletableFuture<ChatappPhoneNumberRegisterResponse> chatappPhoneNumberRegister(ChatappPhoneNumberRegisterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ChatappPhoneNumberRegister").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChatappPhoneNumberRegisterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChatappPhoneNumberRegisterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The China-specific QPS limit for this API is 10 calls per second. If this limit is exceeded, the API calls are throttled, which may affect your business. Call this operation at a reasonable frequency.</p>
     * 
     * @param request the request parameters of ChatappSyncPhoneNumber  ChatappSyncPhoneNumberRequest
     * @return ChatappSyncPhoneNumberResponse
     */
    @Override
    public CompletableFuture<ChatappSyncPhoneNumberResponse> chatappSyncPhoneNumber(ChatappSyncPhoneNumberRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ChatappSyncPhoneNumber").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChatappSyncPhoneNumberResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChatappSyncPhoneNumberResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The QPS limit per user is 10 requests per second. If this limit is exceeded, API calls are throttled, which may affect your services. Call this API at a reasonable frequency.</p>
     * 
     * @param request the request parameters of ChatappVerifyAndRegister  ChatappVerifyAndRegisterRequest
     * @return ChatappVerifyAndRegisterResponse
     */
    @Override
    public CompletableFuture<ChatappVerifyAndRegisterResponse> chatappVerifyAndRegister(ChatappVerifyAndRegisterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ChatappVerifyAndRegister").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChatappVerifyAndRegisterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChatappVerifyAndRegisterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CheckDirectSendMessageSample  CheckDirectSendMessageSampleRequest
     * @return CheckDirectSendMessageSampleResponse
     */
    @Override
    public CompletableFuture<CheckDirectSendMessageSampleResponse> checkDirectSendMessageSample(CheckDirectSendMessageSampleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CheckDirectSendMessageSample").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckDirectSendMessageSampleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckDirectSendMessageSampleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CopyTemplate  CopyTemplateRequest
     * @return CopyTemplateResponse
     */
    @Override
    public CompletableFuture<CopyTemplateResponse> copyTemplate(CopyTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CopyTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CopyTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CopyTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can create a flow by calling this operation or manually create a flow in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Editor</a> console.</li>
     * <li>After you create a flow, you can refer to <a href="https://help.aliyun.com/document_detail/2836818.html">Flow Editor component description</a> to orchestrate the canvas.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateChatFlow  CreateChatFlowRequest
     * @return CreateChatFlowResponse
     */
    @Override
    public CompletableFuture<CreateChatFlowResponse> createChatFlow(CreateChatFlowRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateChatFlow").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateChatFlowResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateChatFlowResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to create and import a flow, or manually create and import a flow in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">flow orchestration</a> console.</li>
     * <li>Before calling this operation, make sure you have exported flow DSL data.</li>
     * <li>If you do not have exported flow DSL data, go to the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">flow orchestration</a> console, click a flow name to open the canvas orchestration page, arrange canvas components, save the flow, and export it as a JSON data file.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateChatFlowByImport  CreateChatFlowByImportRequest
     * @return CreateChatFlowByImportResponse
     */
    @Override
    public CompletableFuture<CreateChatFlowByImportResponse> createChatFlowByImport(CreateChatFlowByImportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateChatFlowByImport").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateChatFlowByImportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateChatFlowByImportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>To update a flow log setting by using an API, you must first create a flow log setting. After the setting is created, you can call the <a href="https://help.aliyun.com/document_detail/2937212.html">ReadChatFlowLogSetting</a> operation to view the flow log setting information, and then call the <a href="https://help.aliyun.com/document_detail/2937210.html">UpdateChatFlowLogSetting</a> operation to update the flow log setting.</li>
     * <li>If you do not need to update the flow log setting by using an API, you can manually update the flow log information in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder"><strong>Flow Editor</strong></a> &gt; <strong>Settings</strong> &gt; <strong>Log</strong> page.</li>
     * <li>Before calling this operation, make sure that you have a successfully created flow.</li>
     * <li>If you do not have a successfully created flow, you can manually create a flow in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Editor</a> page or call the <a href="https://help.aliyun.com/document_detail/2937204.html">CreateChatFlow</a> operation to create a flow.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateChatFlowLogSetting  CreateChatFlowLogSettingRequest
     * @return CreateChatFlowLogSettingResponse
     */
    @Override
    public CompletableFuture<CreateChatFlowLogSettingResponse> createChatFlowLogSetting(CreateChatFlowLogSettingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateChatFlowLogSetting").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateChatFlowLogSettingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateChatFlowLogSettingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This API is limited to 10 queries per second (QPS) for each user. If you exceed this limit, API calls are throttled, which can affect your business. Call this API within the specified limit.</p>
     * 
     * @param request the request parameters of CreateChatappMigrationInitiate  CreateChatappMigrationInitiateRequest
     * @return CreateChatappMigrationInitiateResponse
     */
    @Override
    public CompletableFuture<CreateChatappMigrationInitiateResponse> createChatappMigrationInitiate(CreateChatappMigrationInitiateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateChatappMigrationInitiate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateChatappMigrationInitiateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateChatappMigrationInitiateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The QPS limit for a single user calling this API operation is 50. If the limit is exceeded, API calls are throttled, which may affect your business. Call this API operation at a reasonable rate.</p>
     * <h3>Status changes</h3>
     * <p>You can listen for template status and quality changes by using MNS or HTTP. For more information, see <a href="https://help.aliyun.com/document_detail/421545.html">Message receipts</a>.</p>
     * 
     * @param request the request parameters of CreateChatappTemplate  CreateChatappTemplateRequest
     * @return CreateChatappTemplateResponse
     */
    @Override
    public CompletableFuture<CreateChatappTemplateResponse> createChatappTemplate(CreateChatappTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateChatappTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateChatappTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateChatappTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateCustomAudience  CreateCustomAudienceRequest
     * @return CreateCustomAudienceResponse
     */
    @Override
    public CompletableFuture<CreateCustomAudienceResponse> createCustomAudience(CreateCustomAudienceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateCustomAudience").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCustomAudienceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCustomAudienceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The China Message Service (Chinese SMS) API has a single-user QPS limit of 5 calls per second. If this limit is exceeded, API calls are throttled, which may affect your business. Call this operation appropriately.</p>
     * 
     * @param request the request parameters of CreateFlow  CreateFlowRequest
     * @return CreateFlowResponse
     */
    @Override
    public CompletableFuture<CreateFlowResponse> createFlow(CreateFlowRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateFlow").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateFlowResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateFlowResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to create a new flow version, or click a flow name on the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">flow editor</a> page to enter the canvas orchestration page and manually copy a new flow version.</li>
     * <li>Before calling this operation, make sure that you have a successfully created flow.</li>
     * <li>If you do not have a successfully created flow, you can manually create a flow on the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">flow editor</a> page or create a flow by calling the <a href="https://help.aliyun.com/document_detail/2937204.html">CreateChatFlow</a> operation.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateFlowVersion  CreateFlowVersionRequest
     * @return CreateFlowVersionResponse
     */
    @Override
    public CompletableFuture<CreateFlowVersionResponse> createFlowVersion(CreateFlowVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateFlowVersion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateFlowVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateFlowVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateInstance  CreateInstanceRequest
     * @return CreateInstanceResponse
     */
    @Override
    public CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateMessageCampaign  CreateMessageCampaignRequest
     * @return CreateMessageCampaignResponse
     */
    @Override
    public CompletableFuture<CreateMessageCampaignResponse> createMessageCampaign(CreateMessageCampaignRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateMessageCampaign").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMessageCampaignResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMessageCampaignResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateMessengerPage  CreateMessengerPageRequest
     * @return CreateMessengerPageResponse
     */
    @Override
    public CompletableFuture<CreateMessengerPageResponse> createMessengerPage(CreateMessengerPageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateMessengerPage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMessengerPageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMessengerPageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>After the QR code is created, users can scan it with WhatsApp to quickly open the corresponding business phone number.</li>
     * <li>Before calling this operation, make sure that you have a successfully created WhatsApp message channel.</li>
     * <li>If you do not have a successfully created WhatsApp message channel, you can manually create one on the
     * &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement">Channel Management</a>
     * &lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList">Channel Management</a>
     * page.</li>
     * </ul>
     * <h4>QPS limit</h4>
     * <p>The single-user QPS limit for this operation is 5 calls per second. If this limit is exceeded, the API calls are throttled, which may affect your business. Call this operation appropriately.</p>
     * 
     * @param request the request parameters of CreatePhoneMessageQrdl  CreatePhoneMessageQrdlRequest
     * @return CreatePhoneMessageQrdlResponse
     */
    @Override
    public CompletableFuture<CreatePhoneMessageQrdlResponse> createPhoneMessageQrdl(CreatePhoneMessageQrdlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreatePhoneMessageQrdl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePhoneMessageQrdlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePhoneMessageQrdlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateWhatsappConversionApi  CreateWhatsappConversionApiRequest
     * @return CreateWhatsappConversionApiResponse
     */
    @Override
    public CompletableFuture<CreateWhatsappConversionApiResponse> createWhatsappConversionApi(CreateWhatsappConversionApiRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateWhatsappConversionApi").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateWhatsappConversionApiResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateWhatsappConversionApiResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to delete a flow, or manually delete a flow in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">flow editor</a>.</li>
     * <li>Before deleting a flow, make sure the flow status is offline.</li>
     * <li>A deleted flow cannot be recovered. Proceed with caution.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteChatFlow  DeleteChatFlowRequest
     * @return DeleteChatFlowResponse
     */
    @Override
    public CompletableFuture<DeleteChatFlowResponse> deleteChatFlow(DeleteChatFlowRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteChatFlow").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteChatFlowResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteChatFlowResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: The API-based IM group deletion feature is a Meta beta feature. Contact your account manager to apply for access.</p>
     * </blockquote>
     * <ul>
     * <li>Before calling this operation, make sure that you have a successfully created IM group.</li>
     * <li>If you do not have a successfully created IM group, call the <a href="https://help.aliyun.com/document_detail/2998429.html">AddChatGroup</a> operation to create one.</li>
     * <li>A deleted IM group cannot be recovered. Proceed with caution.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteChatGroup  DeleteChatGroupRequest
     * @return DeleteChatGroupResponse
     */
    @Override
    public CompletableFuture<DeleteChatGroupResponse> deleteChatGroup(DeleteChatGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteChatGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteChatGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteChatGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: The ability to delete IM group invitation links through the API is a Meta beta feature. Contact your account manager to request access.</p>
     * </blockquote>
     * <ul>
     * <li>Before calling this operation, make sure that the IM group you created already has an IM group invitation link added.</li>
     * <li>If you do not have an existing IM group, call the <a href="https://help.aliyun.com/document_detail/2998429.html">AddChatGroup</a> and <a href="https://help.aliyun.com/document_detail/3019211.html">AddChatGroupInviteLink</a> operations to create an IM group and add an invitation link.</li>
     * <li>After you delete an IM group invitation link, the IM group can no longer invite members to join. Proceed with caution.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteChatGroupInviteLink  DeleteChatGroupInviteLinkRequest
     * @return DeleteChatGroupInviteLinkResponse
     */
    @Override
    public CompletableFuture<DeleteChatGroupInviteLinkResponse> deleteChatGroupInviteLink(DeleteChatGroupInviteLinkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteChatGroupInviteLink").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteChatGroupInviteLinkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteChatGroupInviteLinkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: 
     * This operation is a beta feature from Meta. Contact your account manager to add your account to the allowlist before use.</p>
     * </blockquote>
     * <ul>
     * <li>This operation requires an existing IM group that members have joined via an invitation link.</li>
     * <li>To create an IM group and add an invitation link, call the <a href="https://help.aliyun.com/document_detail/2998429.html">AddChatGroup</a> and <a href="https://help.aliyun.com/document_detail/3019211.html">AddChatGroupInviteLink</a> operations.</li>
     * <li>Removed members no longer receive messages from the group. Use this operation with caution.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteChatGroupParticipants  DeleteChatGroupParticipantsRequest
     * @return DeleteChatGroupParticipantsResponse
     */
    @Override
    public CompletableFuture<DeleteChatGroupParticipantsResponse> deleteChatGroupParticipants(DeleteChatGroupParticipantsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteChatGroupParticipants").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteChatGroupParticipantsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteChatGroupParticipantsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>This operation allows a maximum of 5 requests per second per account. Excess requests are throttled, which may affect your business. Stay within the specified limit.</p>
     * 
     * @param request the request parameters of DeleteChatappTemplate  DeleteChatappTemplateRequest
     * @return DeleteChatappTemplateResponse
     */
    @Override
    public CompletableFuture<DeleteChatappTemplateResponse> deleteChatappTemplate(DeleteChatappTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteChatappTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteChatappTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteChatappTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteContacts  DeleteContactsRequest
     * @return DeleteContactsResponse
     */
    @Override
    public CompletableFuture<DeleteContactsResponse> deleteContacts(DeleteContactsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteContacts").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteContactsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteContactsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteContactsByIds  DeleteContactsByIdsRequest
     * @return DeleteContactsByIdsResponse
     */
    @Override
    public CompletableFuture<DeleteContactsByIdsResponse> deleteContactsByIds(DeleteContactsByIdsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteContactsByIds").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteContactsByIdsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteContactsByIdsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The single-user QPS limit for this operation is 5 calls per second. If this limit is exceeded, API calls are throttled, which may affect your business. Call this operation appropriately.</p>
     * 
     * @param request the request parameters of DeleteFlow  DeleteFlowRequest
     * @return DeleteFlowResponse
     */
    @Override
    public CompletableFuture<DeleteFlowResponse> deleteFlow(DeleteFlowRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteFlow").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteFlowResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteFlowResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to delete a flow version, or click a flow name in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">flow editor</a> to go to the canvas orchestration page and manually delete the flow version.</li>
     * <li>Before calling this operation, make sure that the flow version is in the offline state and that at least two flow versions exist.</li>
     * <li>If the flow version is in the online state, click the flow name in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">flow editor</a> to go to the canvas orchestration page and manually take the flow version offline, or call the <a href="https://help.aliyun.com/document_detail/2937198.html">OfflineFlowVersion</a> operation to take the flow version offline.</li>
     * <li>After a flow version is deleted, the canvas flow that you orchestrated cannot be recovered. Proceed with caution.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteFlowVersion  DeleteFlowVersionRequest
     * @return DeleteFlowVersionResponse
     */
    @Override
    public CompletableFuture<DeleteFlowVersionResponse> deleteFlowVersion(DeleteFlowVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteFlowVersion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteFlowVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteFlowVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteGroupById  DeleteGroupByIdRequest
     * @return DeleteGroupByIdResponse
     */
    @Override
    public CompletableFuture<DeleteGroupByIdResponse> deleteGroupById(DeleteGroupByIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteGroupById").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteGroupByIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteGroupByIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteInstagramPage  DeleteInstagramPageRequest
     * @return DeleteInstagramPageResponse
     */
    @Override
    public CompletableFuture<DeleteInstagramPageResponse> deleteInstagramPage(DeleteInstagramPageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteInstagramPage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteInstagramPageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteInstagramPageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteInstance  DeleteInstanceRequest
     * @return DeleteInstanceResponse
     */
    @Override
    public CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteMarketingFlow  DeleteMarketingFlowRequest
     * @return DeleteMarketingFlowResponse
     */
    @Override
    public CompletableFuture<DeleteMarketingFlowResponse> deleteMarketingFlow(DeleteMarketingFlowRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteMarketingFlow").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMarketingFlowResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMarketingFlowResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteMessageCampaign  DeleteMessageCampaignRequest
     * @return DeleteMessageCampaignResponse
     */
    @Override
    public CompletableFuture<DeleteMessageCampaignResponse> deleteMessageCampaign(DeleteMessageCampaignRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteMessageCampaign").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMessageCampaignResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMessageCampaignResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteMessengerPage  DeleteMessengerPageRequest
     * @return DeleteMessengerPageResponse
     */
    @Override
    public CompletableFuture<DeleteMessengerPageResponse> deleteMessengerPage(DeleteMessengerPageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteMessengerPage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMessengerPageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMessengerPageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>After you delete a message QR code, users can no longer open the corresponding business phone number by scanning the original QR code. Proceed with caution.</li>
     * <li>Before calling this operation, make sure that you have a successfully created message QR code.</li>
     * <li>If you do not have a successfully created message QR code, call the <a href="https://help.aliyun.com/document_detail/2638749.html">CreatePhoneMessageQrdl</a> operation to create one first.</li>
     * </ul>
     * <h4>QPS limit</h4>
     * <p>The single-user QPS limit for this operation is 5 calls per second. If this limit is exceeded, the API calls are throttled, which may affect your business. Call this operation as appropriate.</p>
     * 
     * @param request the request parameters of DeletePhoneMessageQrdl  DeletePhoneMessageQrdlRequest
     * @return DeletePhoneMessageQrdlResponse
     */
    @Override
    public CompletableFuture<DeletePhoneMessageQrdlResponse> deletePhoneMessageQrdl(DeletePhoneMessageQrdlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeletePhoneMessageQrdl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeletePhoneMessageQrdlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeletePhoneMessageQrdlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteWhatsappUserName  DeleteWhatsappUserNameRequest
     * @return DeleteWhatsappUserNameResponse
     */
    @Override
    public CompletableFuture<DeleteWhatsappUserNameResponse> deleteWhatsappUserName(DeleteWhatsappUserNameRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteWhatsappUserName").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteWhatsappUserNameResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteWhatsappUserNameResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The China Message Service API has a single-user QPS limit of 5 calls per second. If this limit is exceeded, API calls are throttled, which may affect your business. Call this operation at a reasonable frequency.</p>
     * 
     * @param request the request parameters of DeprecateFlow  DeprecateFlowRequest
     * @return DeprecateFlowResponse
     */
    @Override
    public CompletableFuture<DeprecateFlowResponse> deprecateFlow(DeprecateFlowRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeprecateFlow").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeprecateFlowResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeprecateFlowResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before you retrieve metrics for the message sending volume of WhatsApp-type channels or metrics related to Marketing-type templates by calling API operations, call this operation to enable WhatsApp ROI metric collection.</li>
     * <li>After you enable WhatsApp ROI metric collection, at least one day is required before metric data becomes available. Message sending volume metrics and Marketing-type template metrics for messages sent before the feature is enabled are not collected.</li>
     * <li>After you enable WhatsApp ROI metric collection, you can call the <a href="https://help.aliyun.com/document_detail/2557788.html">GetChatappPhoneNumberMetric</a> operation to query the sending volume metrics of a phone number, or call the <a href="https://help.aliyun.com/document_detail/2557790.html">GetChatappTemplateMetric</a> operation to query metrics related to Marketing-type templates.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The single-user QPS limit for this operation is 5 calls per second. If this limit is exceeded, the API calls are throttled, which may affect your business. Call this operation appropriately.</p>
     * 
     * @param request the request parameters of EnableWhatsappROIMetric  EnableWhatsappROIMetricRequest
     * @return EnableWhatsappROIMetricResponse
     */
    @Override
    public CompletableFuture<EnableWhatsappROIMetricResponse> enableWhatsappROIMetric(EnableWhatsappROIMetricRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableWhatsappROIMetric").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableWhatsappROIMetricResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableWhatsappROIMetricResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to bind a phone number or merchant account ID to a flow, or manually bind them in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder"><strong>Flow Builder</strong></a> &gt; <strong>Settings</strong> page.</li>
     * <li>Before calling this operation, make sure that you have a successfully created flow and a successfully created message channel that corresponds to the flow type.</li>
     * <li>For the WhatsApp channel type, complete <a href="https://help.aliyun.com/document_detail/172335.html">WABA registration and bindng</a> and <a href="https://help.aliyun.com/document_detail/2656131.html">add a phone number</a>.</li>
     * <li>For the Messenger channel type, complete <a href="https://help.aliyun.com/document_detail/2837713.html">connecting a public page account</a>.</li>
     * <li>For the Instagram channel type, complete <a href="https://help.aliyun.com/document_detail/2837720.html">connecting a professional account</a>.
     * &lt;props=&quot;intl&quot;&gt;- For the Viber channel type, complete <a href="https://help.aliyun.com/document_detail/2807995.html">applying for a service ID</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of FlowBindPhone  FlowBindPhoneRequest
     * @return FlowBindPhoneResponse
     */
    @Override
    public CompletableFuture<FlowBindPhoneResponse> flowBindPhone(FlowBindPhoneRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("FlowBindPhone").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FlowBindPhoneResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FlowBindPhoneResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Call this operation to rebind a phone number or merchant account ID to a flow that already has a binding. You can also manually rebind in <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder"><strong>Flow Builder</strong></a> &gt; <strong>Settings</strong>.</li>
     * <li>Before calling this operation, make sure that your flow already has a phone number or merchant account ID bound to it.</li>
     * <li>If you are binding a phone number or merchant account ID to a flow for the first time, use the <a href="https://help.aliyun.com/document_detail/2937190.html">FlowBindPhone</a> operation.</li>
     * </ul>
     * 
     * @param request the request parameters of FlowRebindPhone  FlowRebindPhoneRequest
     * @return FlowRebindPhoneResponse
     */
    @Override
    public CompletableFuture<FlowRebindPhoneResponse> flowRebindPhone(FlowRebindPhoneRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("FlowRebindPhone").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FlowRebindPhoneResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FlowRebindPhoneResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before you call this operation, make sure that your flow is in the offline state. If your flow is in the online state, you can click the flow name on the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Editor</a> page to go to the canvas orchestration page and manually take it offline, or call the <a href="https://help.aliyun.com/document_detail/2937198.html">OfflineFlowVersion</a> operation to take the flow offline.</li>
     * <li>You can call this operation to dissociate a phone number or merchant account ID from a flow, or manually dissociate it on the <strong>Settings</strong> page in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder"><strong>Flow Editor</strong></a>.</li>
     * <li>Before you call this operation, make sure that a phone number or merchant account ID is associated with the flow you created.</li>
     * <li>If no phone number or merchant account ID is associated, you can manually associate one on the <strong>Settings</strong> page in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder"><strong>Flow Editor</strong></a> or call the <a href="https://help.aliyun.com/document_detail/2937190.html">FlowBindPhone</a> operation to associate one.</li>
     * <li>After a phone number or merchant account ID is dissociated from a flow, the flow cannot be taken online. You must re-associate a phone number or merchant account ID with the flow before you can take it online.</li>
     * </ul>
     * 
     * @param request the request parameters of FlowUnbindPhone  FlowUnbindPhoneRequest
     * @return FlowUnbindPhoneResponse
     */
    @Override
    public CompletableFuture<FlowUnbindPhoneResponse> flowUnbindPhone(FlowUnbindPhoneRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("FlowUnbindPhone").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FlowUnbindPhoneResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FlowUnbindPhoneResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GeneratePresignedUrl  GeneratePresignedUrlRequest
     * @return GeneratePresignedUrlResponse
     */
    @Override
    public CompletableFuture<GeneratePresignedUrlResponse> generatePresignedUrl(GeneratePresignedUrlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GeneratePresignedUrl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GeneratePresignedUrlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GeneratePresignedUrlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAuditRequestByTypeUnAudit  GetAuditRequestByTypeUnAuditRequest
     * @return GetAuditRequestByTypeUnAuditResponse
     */
    @Override
    public CompletableFuture<GetAuditRequestByTypeUnAuditResponse> getAuditRequestByTypeUnAudit(GetAuditRequestByTypeUnAuditRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAuditRequestByTypeUnAudit").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAuditRequestByTypeUnAuditResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAuditRequestByTypeUnAuditResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAutoGeneratedTemplate  GetAutoGeneratedTemplateRequest
     * @return GetAutoGeneratedTemplateResponse
     */
    @Override
    public CompletableFuture<GetAutoGeneratedTemplateResponse> getAutoGeneratedTemplate(GetAutoGeneratedTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAutoGeneratedTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAutoGeneratedTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAutoGeneratedTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before calling this operation, make sure that the flow you created is online and has been triggered.</li>
     * <li>If your flow is not online, go to the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Editor</a> page, click the flow name to enter the canvas orchestration page, and manually bring the flow online. Alternatively, call the <a href="https://help.aliyun.com/document_detail/2937203.html">OnlineFlowVersion</a> operation to bring the flow online.</li>
     * <li>For flows with a manual trigger type, call the <a href="https://help.aliyun.com/document_detail/2859101.html">TriggerChatFlow</a> operation to trigger the flow, or go to the <a href="https://chatapp.console.aliyun.com/MarketingActivityManagement">Marketing Activity Management</a> page and trigger the flow by associating it with a marketing activity.</li>
     * <li>For flows with a non-manual trigger type, you do not need to manually trigger the flow. The flow is triggered when a message is sent to the business account bound to the flow.</li>
     * </ul>
     * 
     * @param request the request parameters of GetChatFlowMetric  GetChatFlowMetricRequest
     * @return GetChatFlowMetricResponse
     */
    @Override
    public CompletableFuture<GetChatFlowMetricResponse> getChatFlowMetric(GetChatFlowMetricRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetChatFlowMetric").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetChatFlowMetricResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetChatFlowMetricResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to query the details of a flow template. You can also view template details by clicking the template name on the <strong>Template View</strong> page in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder"><strong>Flow Editor</strong></a>.</li>
     * <li>After you view template details by clicking the template name on the <strong>Template View</strong> page in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder"><strong>Flow Editor</strong></a>, you can directly use the template to create a flow.</li>
     * </ul>
     * 
     * @param request the request parameters of GetChatFlowTemplate  GetChatFlowTemplateRequest
     * @return GetChatFlowTemplateResponse
     */
    @Override
    public CompletableFuture<GetChatFlowTemplateResponse> getChatFlowTemplate(GetChatFlowTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetChatFlowTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetChatFlowTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetChatFlowTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetChatappOpenStatus  GetChatappOpenStatusRequest
     * @return GetChatappOpenStatusResponse
     */
    @Override
    public CompletableFuture<GetChatappOpenStatusResponse> getChatappOpenStatus(GetChatappOpenStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetChatappOpenStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetChatappOpenStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetChatappOpenStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation can only query the sending volume metrics for phone numbers on WhatsApp channels.</li>
     * <li>You can call this operation to query phone number sending volume metrics, or view them in the &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement"><strong>Channels Management</strong></a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channels Management</strong></a> &gt; <strong>Manage</strong> &gt; <strong>Customer Statistics Daily Report</strong> page.</li>
     * <li>Before calling this operation, call the <a href="https://help.aliyun.com/document_detail/2557789.html">EnableWhatsAppROIMetric</a> operation to enable WhatsApp ROI metric collection. After enabling, at least one day is required before statistics become available. Message sending volume metrics for messages sent before enabling are not collected.</li>
     * <li>After enabling WhatsApp ROI metric collection, ensure that your channel has successfully sent messages. You can send messages on the &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement"><strong>Channels Management</strong></a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channels Management</strong></a> &gt; <strong>Manage</strong> &gt; <strong>Send Message</strong> page, or by calling the <a href="https://help.aliyun.com/document_detail/432208.html">SendChatappMessage</a> or <a href="https://help.aliyun.com/document_detail/447926.html">SendChatappMassMessage</a> operation.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The single-user QPS limit for this operation is 50 calls per second. Requests that exceed this limit are throttled, which may affect your business. Call this operation as appropriate.</p>
     * 
     * @param request the request parameters of GetChatappPhoneNumberMetric  GetChatappPhoneNumberMetricRequest
     * @return GetChatappPhoneNumberMetricResponse
     */
    @Override
    public CompletableFuture<GetChatappPhoneNumberMetricResponse> getChatappPhoneNumberMetric(GetChatappPhoneNumberMetricRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetChatappPhoneNumberMetric").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetChatappPhoneNumberMetricResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetChatappPhoneNumberMetricResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetChatappPhoneNumberSetting  GetChatappPhoneNumberSettingRequest
     * @return GetChatappPhoneNumberSettingResponse
     */
    @Override
    public CompletableFuture<GetChatappPhoneNumberSettingResponse> getChatappPhoneNumberSetting(GetChatappPhoneNumberSettingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetChatappPhoneNumberSetting").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetChatappPhoneNumberSettingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetChatappPhoneNumberSettingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit for a single user is 5. If the limit is exceeded, API calls are throttled, which may affect your services. Call this API at a reasonable rate.</p>
     * 
     * @param request the request parameters of GetChatappTemplateDetail  GetChatappTemplateDetailRequest
     * @return GetChatappTemplateDetailResponse
     */
    @Override
    public CompletableFuture<GetChatappTemplateDetailResponse> getChatappTemplateDetail(GetChatappTemplateDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetChatappTemplateDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetChatappTemplateDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetChatappTemplateDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation can only query metrics for marketing templates of WhatsApp channels.</li>
     * <li>Before calling this operation, call the <a href="https://help.aliyun.com/document_detail/2557789.html">EnableWhatsAppROIMetric</a> operation to enable WhatsApp ROI metric collection. After enabling, statistical data requires at least one day to become available. Metrics for marketing templates sent before enabling are not collected.</li>
     * <li>After enabling WhatsApp ROI metric collection, make sure that the marketing templates of your created channels have successfully sent messages. You can send messages on the &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement"><strong>Channel Management</strong></a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channel Management</strong></a> &gt; <strong>Manage</strong> &gt; <strong>Send Message</strong> page, or by calling the <a href="https://help.aliyun.com/document_detail/432208.html">SendChatappMessage</a> or <a href="https://help.aliyun.com/document_detail/447926.html">SendChatappMassMessage</a> operation.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The single-user QPS limit for this operation is 50 calls per second. Requests that exceed this limit are throttled, which may affect your business. Call this operation as appropriate.</p>
     * 
     * @param request the request parameters of GetChatappTemplateMetric  GetChatappTemplateMetricRequest
     * @return GetChatappTemplateMetricResponse
     */
    @Override
    public CompletableFuture<GetChatappTemplateMetricResponse> getChatappTemplateMetric(GetChatappTemplateMetricRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetChatappTemplateMetric").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetChatappTemplateMetricResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetChatappTemplateMetricResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation allows a maximum of 5 requests per second per account. Excess requests are throttled, which may affect your business. Stay within the specified limit.</p>
     * 
     * @param request the request parameters of GetChatappUploadAuthorization  GetChatappUploadAuthorizationRequest
     * @return GetChatappUploadAuthorizationResponse
     */
    @Override
    public CompletableFuture<GetChatappUploadAuthorizationResponse> getChatappUploadAuthorization(GetChatappUploadAuthorizationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetChatappUploadAuthorization").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetChatappUploadAuthorizationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetChatappUploadAuthorizationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This API is limited to 10 queries per second (QPS) for each user. If you exceed this limit, API calls are throttled, which can affect your business. Call this API within the specified limit.</p>
     * 
     * @param request the request parameters of GetChatappVerifyCode  GetChatappVerifyCodeRequest
     * @return GetChatappVerifyCodeResponse
     */
    @Override
    public CompletableFuture<GetChatappVerifyCodeResponse> getChatappVerifyCode(GetChatappVerifyCodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetChatappVerifyCode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetChatappVerifyCodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetChatappVerifyCodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation allows a maximum of 10 requests per second per account. Excess requests are throttled, which may affect your business. Stay within the specified limit.</p>
     * 
     * @param request the request parameters of GetCommerceSetting  GetCommerceSettingRequest
     * @return GetCommerceSettingResponse
     */
    @Override
    public CompletableFuture<GetCommerceSettingResponse> getCommerceSetting(GetCommerceSettingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCommerceSetting").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCommerceSettingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCommerceSettingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3><a href="#qps-"></a>QPS limit</h3>
     * <p>This operation allows a maximum of 5 requests per second per account. Excess requests are throttled, which may affect your business. Stay within the specified limit.
     * This operation retrieves data directly from Meta. Meta imposes its own rate limits on the total number of calls. Stay within the specified limit.</p>
     * 
     * @param request the request parameters of GetConversationalAutomation  GetConversationalAutomationRequest
     * @return GetConversationalAutomationResponse
     */
    @Override
    public CompletableFuture<GetConversationalAutomationResponse> getConversationalAutomation(GetConversationalAutomationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetConversationalAutomation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetConversationalAutomationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetConversationalAutomationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetCustomerSite  GetCustomerSiteRequest
     * @return GetCustomerSiteResponse
     */
    @Override
    public CompletableFuture<GetCustomerSiteResponse> getCustomerSite(GetCustomerSiteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCustomerSite").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCustomerSiteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCustomerSiteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDownloadExcelList  GetDownloadExcelListRequest
     * @return GetDownloadExcelListResponse
     */
    @Override
    public CompletableFuture<GetDownloadExcelListResponse> getDownloadExcelList(GetDownloadExcelListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDownloadExcelList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDownloadExcelListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDownloadExcelListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetFbInstagramPages  GetFbInstagramPagesRequest
     * @return GetFbInstagramPagesResponse
     */
    @Override
    public CompletableFuture<GetFbInstagramPagesResponse> getFbInstagramPages(GetFbInstagramPagesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetFbInstagramPages").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetFbInstagramPagesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetFbInstagramPagesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetFbMessengerPages  GetFbMessengerPagesRequest
     * @return GetFbMessengerPagesResponse
     */
    @Override
    public CompletableFuture<GetFbMessengerPagesResponse> getFbMessengerPages(GetFbMessengerPagesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetFbMessengerPages").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetFbMessengerPagesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetFbMessengerPagesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before calling this operation, make sure that you have successfully created a WhatsApp Flow.</li>
     * <li>If you do not have a successfully created WhatsApp Flow, call the <a href="https://help.aliyun.com/document_detail/2638742.html">CreateFlow</a> operation to create one.</li>
     * </ul>
     * <h4>QPS limit</h4>
     * <p>The single-user QPS limit for this operation is 5 calls per second. If this limit is exceeded, the API calls are throttled, which may affect your business. Call this operation as appropriate.</p>
     * 
     * @param request the request parameters of GetFlow  GetFlowRequest
     * @return GetFlowResponse
     */
    @Override
    public CompletableFuture<GetFlowResponse> getFlow(GetFlowRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetFlow").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetFlowResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetFlowResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before calling this operation, make sure that you have successfully created a WhatsApp Flow.</li>
     * <li>If you do not have a successfully created WhatsApp Flow, create one by calling the <a href="https://help.aliyun.com/document_detail/2638742.html">CreateFlow</a> operation.</li>
     * </ul>
     * <h4>QPS limit</h4>
     * <p>The single-user QPS limit for this operation is 5 calls per second. If this limit is exceeded, the API calls are throttled, which may affect your business. Call this operation appropriately.</p>
     * 
     * @param request the request parameters of GetFlowJSONAssest  GetFlowJSONAssestRequest
     * @return GetFlowJSONAssestResponse
     */
    @Override
    public CompletableFuture<GetFlowJSONAssestResponse> getFlowJSONAssest(GetFlowJSONAssestRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetFlowJSONAssest").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetFlowJSONAssestResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetFlowJSONAssestResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>After creating a WhatsApp Flow, you can call this operation to retrieve the Flow preview URL to preview your Flow.</li>
     * <li>Before calling this operation, make sure you have a successfully created WhatsApp Flow.</li>
     * <li>If you do not have a successfully created WhatsApp Flow, call the <a href="https://help.aliyun.com/document_detail/2638742.html">CreateFlow</a> operation to create one.</li>
     * </ul>
     * <h4>QPS limit</h4>
     * <p>The single-user QPS limit for this operation is 5 calls per second. If this limit is exceeded, the API calls are throttled, which may affect your business. Call this operation appropriately.</p>
     * 
     * @param request the request parameters of GetFlowPreviewUrl  GetFlowPreviewUrlRequest
     * @return GetFlowPreviewUrlResponse
     */
    @Override
    public CompletableFuture<GetFlowPreviewUrlResponse> getFlowPreviewUrl(GetFlowPreviewUrlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetFlowPreviewUrl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetFlowPreviewUrlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetFlowPreviewUrlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetGroupExist  GetGroupExistRequest
     * @return GetGroupExistResponse
     */
    @Override
    public CompletableFuture<GetGroupExistResponse> getGroupExist(GetGroupExistRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetGroupExist").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetGroupExistResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetGroupExistResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMessageCampaignInsights  GetMessageCampaignInsightsRequest
     * @return GetMessageCampaignInsightsResponse
     */
    @Override
    public CompletableFuture<GetMessageCampaignInsightsResponse> getMessageCampaignInsights(GetMessageCampaignInsightsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetMessageCampaignInsights").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMessageCampaignInsightsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMessageCampaignInsightsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The China Message Service API has a single-user QPS limit of 10 calls per second. If this limit is exceeded, throttling is triggered, which may affect your business. Adjust your call frequency accordingly.</p>
     * 
     * @param request the request parameters of GetMigrationVerifyCode  GetMigrationVerifyCodeRequest
     * @return GetMigrationVerifyCodeResponse
     */
    @Override
    public CompletableFuture<GetMigrationVerifyCodeResponse> getMigrationVerifyCode(GetMigrationVerifyCodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetMigrationVerifyCode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMigrationVerifyCodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMigrationVerifyCodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The China Message Service API has a single-user QPS limit of 5 calls per second. If this limit is exceeded, API calls are throttled, which may affect your business. Call this operation at a reasonable frequency.</p>
     * 
     * @param request the request parameters of GetPermissionByCode  GetPermissionByCodeRequest
     * @return GetPermissionByCodeResponse
     */
    @Override
    public CompletableFuture<GetPermissionByCodeResponse> getPermissionByCode(GetPermissionByCodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetPermissionByCode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPermissionByCodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPermissionByCodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before calling this operation, make sure that a phone number has been added under your WABA and has passed phone number verification.</li>
     * <li>If no phone number has been added under your WABA, call the <a href="https://help.aliyun.com/document_detail/600746.html">GetChatappVerifyCode</a> and <a href="https://help.aliyun.com/document_detail/600770.html">ChatappVerifyAndRegister</a> operations to obtain a verification code and register the phone number.</li>
     * </ul>
     * <h4>QPS limit</h4>
     * <p>The single-user QPS limit for this operation is 5 calls per second. If this limit is exceeded, the API calls are throttled, which may affect your business. Call this operation appropriately.</p>
     * 
     * @param request the request parameters of GetPhoneEncryptionPublicKey  GetPhoneEncryptionPublicKeyRequest
     * @return GetPhoneEncryptionPublicKeyResponse
     */
    @Override
    public CompletableFuture<GetPhoneEncryptionPublicKeyResponse> getPhoneEncryptionPublicKey(GetPhoneEncryptionPublicKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetPhoneEncryptionPublicKey").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPhoneEncryptionPublicKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPhoneEncryptionPublicKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to retrieve the verification status of a phone number. You can also view the verification status in the
     * &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement">Channel Management</a>
     * &lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channel Management</strong></a>&gt; <strong>Manage</strong> &gt; <strong>WABA Management</strong> &gt; <strong>Phone Number Management</strong> page.</li>
     * <li>This operation only queries the verification status of a phone number. If the phone number status is verified, you can directly call the registration operation to register the phone number without obtaining a new verification code.</li>
     * <li>Before calling this operation, make sure that a phone number has been added to your WABA and that phone number verification has been submitted.</li>
     * <li>If a phone number has been added to your WABA and needs to be registered, but the verification status is unverified or verification has expired, call <a href="https://help.aliyun.com/document_detail/600746.html">GetChatappVerifyCode</a> and <a href="https://help.aliyun.com/document_detail/600770.html">ChatappVerifyAndRegister</a> to obtain a verification code and register the phone number.
     * The queries per second (QPS) limit for a single user on this operation is 10. If this limit is exceeded, API calls are throttled, which may affect your business. Call this operation appropriately.</li>
     * </ul>
     * 
     * @param request the request parameters of GetPhoneNumberVerificationStatus  GetPhoneNumberVerificationStatusRequest
     * @return GetPhoneNumberVerificationStatusResponse
     */
    @Override
    public CompletableFuture<GetPhoneNumberVerificationStatusResponse> getPhoneNumberVerificationStatus(GetPhoneNumberVerificationStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetPhoneNumberVerificationStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPhoneNumberVerificationStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPhoneNumberVerificationStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetPledgeTemplateAddress  GetPledgeTemplateAddressRequest
     * @return GetPledgeTemplateAddressResponse
     */
    @Override
    public CompletableFuture<GetPledgeTemplateAddressResponse> getPledgeTemplateAddress(GetPledgeTemplateAddressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetPledgeTemplateAddress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPledgeTemplateAddressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPledgeTemplateAddressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This API is limited to 10 queries per second (QPS) for each user. If you exceed this limit, API calls are throttled, which can affect your business. Call this API within the specified limit.</p>
     * 
     * @param request the request parameters of GetPreValidatePhoneId  GetPreValidatePhoneIdRequest
     * @return GetPreValidatePhoneIdResponse
     */
    @Override
    public CompletableFuture<GetPreValidatePhoneIdResponse> getPreValidatePhoneId(GetPreValidatePhoneIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetPreValidatePhoneId").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPreValidatePhoneIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPreValidatePhoneIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetViberByRequestNo  GetViberByRequestNoRequest
     * @return GetViberByRequestNoResponse
     */
    @Override
    public CompletableFuture<GetViberByRequestNoResponse> getViberByRequestNo(GetViberByRequestNoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetViberByRequestNo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetViberByRequestNoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetViberByRequestNoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetViberPauseTimes  GetViberPauseTimesRequest
     * @return GetViberPauseTimesResponse
     */
    @Override
    public CompletableFuture<GetViberPauseTimesResponse> getViberPauseTimes(GetViberPauseTimesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetViberPauseTimes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetViberPauseTimesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetViberPauseTimesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation allows a maximum of 10 requests per second per account. Excess requests are throttled, which may affect your business. Stay within the specified limit.</p>
     * 
     * @param request the request parameters of GetWhatsappConnectionCatalog  GetWhatsappConnectionCatalogRequest
     * @return GetWhatsappConnectionCatalogResponse
     */
    @Override
    public CompletableFuture<GetWhatsappConnectionCatalogResponse> getWhatsappConnectionCatalog(GetWhatsappConnectionCatalogRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetWhatsappConnectionCatalog").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetWhatsappConnectionCatalogResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetWhatsappConnectionCatalogResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetWhatsappConversionApi  GetWhatsappConversionApiRequest
     * @return GetWhatsappConversionApiResponse
     */
    @Override
    public CompletableFuture<GetWhatsappConversionApiResponse> getWhatsappConversionApi(GetWhatsappConversionApiRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetWhatsappConversionApi").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetWhatsappConversionApiResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetWhatsappConversionApiResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3><a href="#qps-"></a>QPS limit</h3>
     * <p>This operation allows a maximum of 5 requests per second per account. Excess requests are throttled, which may affect your business. Stay within the specified limit.
     * This operation retrieves data directly from Meta. Meta imposes its own rate limits on the total number of calls. Stay within the specified limit.</p>
     * 
     * @param request the request parameters of GetWhatsappHealthStatus  GetWhatsappHealthStatusRequest
     * @return GetWhatsappHealthStatusResponse
     */
    @Override
    public CompletableFuture<GetWhatsappHealthStatusResponse> getWhatsappHealthStatus(GetWhatsappHealthStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetWhatsappHealthStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetWhatsappHealthStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetWhatsappHealthStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetWhatsappUserName  GetWhatsappUserNameRequest
     * @return GetWhatsappUserNameResponse
     */
    @Override
    public CompletableFuture<GetWhatsappUserNameResponse> getWhatsappUserName(GetWhatsappUserNameRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetWhatsappUserName").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetWhatsappUserNameResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetWhatsappUserNameResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetWhatsappUserNameSuggestions  GetWhatsappUserNameSuggestionsRequest
     * @return GetWhatsappUserNameSuggestionsResponse
     */
    @Override
    public CompletableFuture<GetWhatsappUserNameSuggestionsResponse> getWhatsappUserNameSuggestions(GetWhatsappUserNameSuggestionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetWhatsappUserNameSuggestions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetWhatsappUserNameSuggestionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetWhatsappUserNameSuggestionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The QPS limit for a single user of this API is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Call this API at a reasonable frequency.</p>
     * 
     * @param request the request parameters of IsvGetAppId  IsvGetAppIdRequest
     * @return IsvGetAppIdResponse
     */
    @Override
    public CompletableFuture<IsvGetAppIdResponse> isvGetAppId(IsvGetAppIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("IsvGetAppId").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(IsvGetAppIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<IsvGetAppIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAllGroups  ListAllGroupsRequest
     * @return ListAllGroupsResponse
     */
    @Override
    public CompletableFuture<ListAllGroupsResponse> listAllGroups(ListAllGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAllGroups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAllGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAllGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListBindDmAccount  ListBindDmAccountRequest
     * @return ListBindDmAccountResponse
     */
    @Override
    public CompletableFuture<ListBindDmAccountResponse> listBindDmAccount(ListBindDmAccountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListBindDmAccount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListBindDmAccountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListBindDmAccountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to query the list of phone numbers or business account IDs bound to a flow. You can also view the list in <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder"><strong>Flow Builder</strong></a> &gt; <strong>Settings</strong>.</li>
     * <li>Before calling this operation, make sure that your flow is already bound to phone numbers or business account IDs.</li>
     * <li>If your flow is not bound to phone numbers or business account IDs, manually bind them in <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder"><strong>Flow Builder</strong></a> &gt; <strong>Settings</strong>, or call the <a href="https://help.aliyun.com/document_detail/2937190.html">FlowBindPhone</a> operation to bind them.</li>
     * </ul>
     * 
     * @param request the request parameters of ListBindingRelationsForFlowVersion  ListBindingRelationsForFlowVersionRequest
     * @return ListBindingRelationsForFlowVersionResponse
     */
    @Override
    public CompletableFuture<ListBindingRelationsForFlowVersionResponse> listBindingRelationsForFlowVersion(ListBindingRelationsForFlowVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListBindingRelationsForFlowVersion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListBindingRelationsForFlowVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListBindingRelationsForFlowVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to query flows, or manually query flows in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Builder</a> console.</li>
     * <li>Before calling this operation, make sure that you have successfully created flows.</li>
     * <li>If you do not have any successfully created flows, you can manually create a flow in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Builder</a> console or create a flow by calling the <a href="https://help.aliyun.com/document_detail/2937204.html">CreateChatFlow</a> operation.</li>
     * <li>The optional parameters in this operation are filter conditions for querying flows. If you do not specify them, all flows are queried.</li>
     * </ul>
     * 
     * @param request the request parameters of ListChatFlow  ListChatFlowRequest
     * @return ListChatFlowResponse
     */
    @Override
    public CompletableFuture<ListChatFlowResponse> listChatFlow(ListChatFlowRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListChatFlow").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListChatFlowResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListChatFlowResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to view the template list, or view the template list in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder"><strong>Flow Editor</strong></a> &gt; <strong>Template View</strong> page.</li>
     * <li>The optional parameters in this operation are filter conditions for the template list. If not specified, all templates are queried.</li>
     * </ul>
     * 
     * @param request the request parameters of ListChatFlowTemplate  ListChatFlowTemplateRequest
     * @return ListChatFlowTemplateResponse
     */
    @Override
    public CompletableFuture<ListChatFlowTemplateResponse> listChatFlowTemplate(ListChatFlowTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListChatFlowTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListChatFlowTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListChatFlowTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: The feature of retrieving IM group lists through API is a Meta beta feature. Contact your account manager to apply for access.</p>
     * </blockquote>
     * <ul>
     * <li>Before calling this operation, make sure you have successfully created IM groups.</li>
     * <li>If you do not have any created IM groups, you can only create IM groups through the <a href="https://help.aliyun.com/document_detail/2998429.html">AddChatGroup</a> operation.</li>
     * <li>The optional parameters of this operation are filter conditions for the IM group list. If you do not specify them, all IM groups are returned.</li>
     * </ul>
     * 
     * @param request the request parameters of ListChatGroup  ListChatGroupRequest
     * @return ListChatGroupResponse
     */
    @Override
    public CompletableFuture<ListChatGroupResponse> listChatGroup(ListChatGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListChatGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListChatGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListChatGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: The feature of retrieving IM group member lists through API is a Meta beta feature. Contact your account manager to apply for access.</p>
     * </blockquote>
     * <ul>
     * <li>Before calling this operation, make sure that the IM group you created has an IM group invitation link added and that members have joined the IM group through the link.</li>
     * <li>If you do not have a created IM group, use the <a href="https://help.aliyun.com/document_detail/2998429.html">AddChatGroup</a> and <a href="https://help.aliyun.com/document_detail/3019211.html">AddChatGroupInviteLink</a> operations to create an IM group and add an invitation link.</li>
     * </ul>
     * 
     * @param request the request parameters of ListChatGroupParticipants  ListChatGroupParticipantsRequest
     * @return ListChatGroupParticipantsResponse
     */
    @Override
    public CompletableFuture<ListChatGroupParticipantsResponse> listChatGroupParticipants(ListChatGroupParticipantsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListChatGroupParticipants").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListChatGroupParticipantsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListChatGroupParticipantsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to query the message list. You can also view the message list in the <a href="https://chatapp.console.aliyun.com/CustomerList"><strong>Channel Management</strong></a> &gt; <strong>Management</strong> &gt; <strong>Message List</strong> console.</li>
     * <li>This API operation supports querying the message list only for WhatsApp&lt;props=&quot;intl&quot;&gt; and Viber channels.</li>
     * <li>Before calling this operation, make sure that you have created a WhatsApp&lt;props=&quot;intl&quot;&gt; or Viber channel, bound a phone number or merchant account ID, created a template that has passed the review, and sent messages through the channel.</li>
     * </ul>
     * 
     * @param request the request parameters of ListChatappMessage  ListChatappMessageRequest
     * @return ListChatappMessageResponse
     */
    @Override
    public CompletableFuture<ListChatappMessageResponse> listChatappMessage(ListChatappMessageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListChatappMessage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListChatappMessageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListChatappMessageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The QPS limit for this operation is 5 calls per second per user. If the limit is exceeded, API calls are throttled, which may affect your business. Call this operation at a reasonable rate.</p>
     * 
     * @param request the request parameters of ListChatappTemplate  ListChatappTemplateRequest
     * @return ListChatappTemplateResponse
     */
    @Override
    public CompletableFuture<ListChatappTemplateResponse> listChatappTemplate(ListChatappTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListChatappTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListChatappTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListChatappTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListCustomAudience  ListCustomAudienceRequest
     * @return ListCustomAudienceResponse
     */
    @Override
    public CompletableFuture<ListCustomAudienceResponse> listCustomAudience(ListCustomAudienceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCustomAudience").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCustomAudienceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCustomAudienceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDmAccount  ListDmAccountRequest
     * @return ListDmAccountResponse
     */
    @Override
    public CompletableFuture<ListDmAccountResponse> listDmAccount(ListDmAccountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDmAccount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDmAccountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDmAccountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDmTag  ListDmTagRequest
     * @return ListDmTagResponse
     */
    @Override
    public CompletableFuture<ListDmTagResponse> listDmTag(ListDmTagRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDmTag").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDmTagResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDmTagResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListFacebookPosts  ListFacebookPostsRequest
     * @return ListFacebookPostsResponse
     */
    @Override
    public CompletableFuture<ListFacebookPostsResponse> listFacebookPosts(ListFacebookPostsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListFacebookPosts").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListFacebookPostsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListFacebookPostsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The China Message Service API has a single-user QPS limit of 5 calls per second. If this limit is exceeded, API calls are throttled, which may affect your business. Call this operation appropriately.</p>
     * 
     * @param request the request parameters of ListFlow  ListFlowRequest
     * @return ListFlowResponse
     */
    @Override
    public CompletableFuture<ListFlowResponse> listFlow(ListFlowRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListFlow").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListFlowResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListFlowResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListFlowNodeGroup  ListFlowNodeGroupRequest
     * @return ListFlowNodeGroupResponse
     */
    @Override
    public CompletableFuture<ListFlowNodeGroupResponse> listFlowNodeGroup(ListFlowNodeGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListFlowNodeGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListFlowNodeGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListFlowNodeGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to query flow component prototypes. You can also click a flow name in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Editor</a> to go to the canvas orchestration page and view flow component prototypes.</li>
     * <li>The optional parameters in this operation are filter conditions for flow component prototypes. If you do not specify them, all flow component prototypes are queried.</li>
     * </ul>
     * 
     * @param request the request parameters of ListFlowNodePrototypeV2  ListFlowNodePrototypeV2Request
     * @return ListFlowNodePrototypeV2Response
     */
    @Override
    public CompletableFuture<ListFlowNodePrototypeV2Response> listFlowNodePrototypeV2(ListFlowNodePrototypeV2Request request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListFlowNodePrototypeV2").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListFlowNodePrototypeV2Response.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListFlowNodePrototypeV2Response> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to query flow versions. You can also click a flow name on the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">flow editor</a> page to go to the canvas orchestration page and view flow versions.</li>
     * <li>Before calling this operation, make sure that you have a successfully created flow.</li>
     * <li>If you do not have a successfully created flow, you can manually create a flow on the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">flow editor</a> page or create a flow by calling the <a href="https://help.aliyun.com/document_detail/2937204.html">CreateChatFlow</a> operation.</li>
     * <li>The optional parameters in this operation are filter conditions for querying flow versions. If you do not specify them, all flow versions are queried.</li>
     * </ul>
     * 
     * @param request the request parameters of ListFlowVersion  ListFlowVersionRequest
     * @return ListFlowVersionResponse
     */
    @Override
    public CompletableFuture<ListFlowVersionResponse> listFlowVersion(ListFlowVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListFlowVersion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListFlowVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListFlowVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListInstagramPage  ListInstagramPageRequest
     * @return ListInstagramPageResponse
     */
    @Override
    public CompletableFuture<ListInstagramPageResponse> listInstagramPage(ListInstagramPageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListInstagramPage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListInstagramPageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListInstagramPageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListInstagramPosts  ListInstagramPostsRequest
     * @return ListInstagramPostsResponse
     */
    @Override
    public CompletableFuture<ListInstagramPostsResponse> listInstagramPosts(ListInstagramPostsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListInstagramPosts").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListInstagramPostsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListInstagramPostsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListInstance  ListInstanceRequest
     * @return ListInstanceResponse
     */
    @Override
    public CompletableFuture<ListInstanceResponse> listInstance(ListInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListMarketingFlow  ListMarketingFlowRequest
     * @return ListMarketingFlowResponse
     */
    @Override
    public CompletableFuture<ListMarketingFlowResponse> listMarketingFlow(ListMarketingFlowRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListMarketingFlow").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMarketingFlowResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMarketingFlowResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListMessageCampaign  ListMessageCampaignRequest
     * @return ListMessageCampaignResponse
     */
    @Override
    public CompletableFuture<ListMessageCampaignResponse> listMessageCampaign(ListMessageCampaignRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListMessageCampaign").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMessageCampaignResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMessageCampaignResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListMessengerSubscriptionToken  ListMessengerSubscriptionTokenRequest
     * @return ListMessengerSubscriptionTokenResponse
     */
    @Override
    public CompletableFuture<ListMessengerSubscriptionTokenResponse> listMessengerSubscriptionToken(ListMessengerSubscriptionTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListMessengerSubscriptionToken").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMessengerSubscriptionTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMessengerSubscriptionTokenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPageAdAccount  ListPageAdAccountRequest
     * @return ListPageAdAccountResponse
     */
    @Override
    public CompletableFuture<ListPageAdAccountResponse> listPageAdAccount(ListPageAdAccountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListPageAdAccount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPageAdAccountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPageAdAccountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The queries per second (QPS) limit for this operation is 5 per user. If this limit is exceeded, the API calls are throttled, which may affect your business. Call this operation as needed.</p>
     * 
     * @param request the request parameters of ListPhoneMessageQrdl  ListPhoneMessageQrdlRequest
     * @return ListPhoneMessageQrdlResponse
     */
    @Override
    public CompletableFuture<ListPhoneMessageQrdlResponse> listPhoneMessageQrdl(ListPhoneMessageQrdlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListPhoneMessageQrdl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPhoneMessageQrdlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPhoneMessageQrdlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This API is limited to 10 queries per second (QPS) for each user. If you exceed this limit, API calls are throttled, which can affect your business. Call this API within the specified limit.</p>
     * 
     * @param request the request parameters of ListProduct  ListProductRequest
     * @return ListProductResponse
     */
    @Override
    public CompletableFuture<ListProductResponse> listProduct(ListProductRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListProduct").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListProductResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListProductResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The queries per second (QPS) limit per user is 10. If this limit is exceeded, API calls are throttled, which may affect your services. Call this API at a reasonable frequency.</p>
     * 
     * @param request the request parameters of ListProductCatalog  ListProductCatalogRequest
     * @return ListProductCatalogResponse
     */
    @Override
    public CompletableFuture<ListProductCatalogResponse> listProductCatalog(ListProductCatalogRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListProductCatalog").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListProductCatalogResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListProductCatalogResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListViberServiceMessage  ListViberServiceMessageRequest
     * @return ListViberServiceMessageResponse
     */
    @Override
    public CompletableFuture<ListViberServiceMessageResponse> listViberServiceMessage(ListViberServiceMessageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListViberServiceMessage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListViberServiceMessageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListViberServiceMessageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListWhatAppTemplate  ListWhatAppTemplateRequest
     * @return ListWhatAppTemplateResponse
     */
    @Override
    public CompletableFuture<ListWhatAppTemplateResponse> listWhatAppTemplate(ListWhatAppTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListWhatAppTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListWhatAppTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListWhatAppTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit per user for this API operation is 50. If the limit is exceeded, API calls are throttled, which may affect your business. Make API calls at a reasonable rate.</p>
     * <h3>Status changes</h3>
     * <p>You can listen for template status and quality changes by using MNS or HTTP. For more information, see <a href="https://help.aliyun.com/document_detail/421545.html">Receipt messages</a>.</p>
     * 
     * @param request the request parameters of ModifyChatappTemplate  ModifyChatappTemplateRequest
     * @return ModifyChatappTemplateResponse
     */
    @Override
    public CompletableFuture<ModifyChatappTemplateResponse> modifyChatappTemplate(ModifyChatappTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyChatappTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyChatappTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyChatappTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyChatappTemplateProperties  ModifyChatappTemplatePropertiesRequest
     * @return ModifyChatappTemplatePropertiesResponse
     */
    @Override
    public CompletableFuture<ModifyChatappTemplatePropertiesResponse> modifyChatappTemplateProperties(ModifyChatappTemplatePropertiesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyChatappTemplateProperties").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyChatappTemplatePropertiesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyChatappTemplatePropertiesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The China Short Message Service (China SMS) API has a single-user QPS limit of 5 calls per second. If this limit is exceeded, the API calls are throttled, which may affect your business. Call this operation appropriately.</p>
     * 
     * @param request the request parameters of ModifyFlow  ModifyFlowRequest
     * @return ModifyFlowResponse
     */
    @Override
    public CompletableFuture<ModifyFlowResponse> modifyFlow(ModifyFlowRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyFlow").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyFlowResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyFlowResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The China Message Service (China) API has a single-user QPS limit of 10 calls per second. If this limit is exceeded, throttling is triggered, which may affect your business. Manage your calls appropriately.</p>
     * 
     * @param request the request parameters of ModifyPhoneBusinessProfile  ModifyPhoneBusinessProfileRequest
     * @return ModifyPhoneBusinessProfileResponse
     */
    @Override
    public CompletableFuture<ModifyPhoneBusinessProfileResponse> modifyPhoneBusinessProfile(ModifyPhoneBusinessProfileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyPhoneBusinessProfile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyPhoneBusinessProfileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyPhoneBusinessProfileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of MoveContactToGroup  MoveContactToGroupRequest
     * @return MoveContactToGroupResponse
     */
    @Override
    public CompletableFuture<MoveContactToGroupResponse> moveContactToGroup(MoveContactToGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("MoveContactToGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MoveContactToGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MoveContactToGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to take a flow version offline, or click the flow name in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Editor</a> to go to the canvas orchestration page and manually take the flow version offline.</li>
     * <li>Before calling this operation, make sure that the flow you created is online.</li>
     * <li>If the flow you created is not online, you can click the flow name in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Editor</a> to go to the canvas orchestration page and manually take the flow version online, or call the <a href="https://help.aliyun.com/document_detail/2937203.html">OnlineFlowVersion</a> operation to take the flow version online.</li>
     * <li>After a flow version is taken offline, the orchestrated flow stops running. This may affect your business. Proceed with caution.</li>
     * </ul>
     * 
     * @param request the request parameters of OfflineFlowVersion  OfflineFlowVersionRequest
     * @return OfflineFlowVersionResponse
     */
    @Override
    public CompletableFuture<OfflineFlowVersionResponse> offlineFlowVersion(OfflineFlowVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OfflineFlowVersion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OfflineFlowVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OfflineFlowVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to publish a flow version. You can also click a flow name on the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Editor</a> page to go to the canvas orchestration page and manually publish a flow version.</li>
     * <li>Before calling this operation, make sure that you have a successfully created flow and that your flow is bindded to a phone number or merchant account ID.</li>
     * <li>If you do not have a successfully created flow, you can manually create a flow and bindded it to a phone number or merchant account ID on the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Editor</a> page, or call the <a href="https://help.aliyun.com/document_detail/2937204.html">CreateChatFlow</a> and <a href="https://help.aliyun.com/document_detail/2937190.html">FlowBindPhone</a> operations to create a flow and bind it to a phone number or merchant account ID.</li>
     * <li>After a flow with a non-manual trigger type is published, the flow is triggered when the bound phone number or merchant account sends a message to the merchant. If your flow contains components that incur fees for corresponding cloud services, such as message sending or function calling, make sure that you fully understand the billing methods and pricing of the related services before using this operation.</li>
     * </ul>
     * 
     * @param request the request parameters of OnlineFlowVersion  OnlineFlowVersionRequest
     * @return OnlineFlowVersionResponse
     */
    @Override
    public CompletableFuture<OnlineFlowVersionResponse> onlineFlowVersion(OnlineFlowVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OnlineFlowVersion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OnlineFlowVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OnlineFlowVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of OpenChatappService  OpenChatappServiceRequest
     * @return OpenChatappServiceResponse
     */
    @Override
    public CompletableFuture<OpenChatappServiceResponse> openChatappService(OpenChatappServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OpenChatappService").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OpenChatappServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OpenChatappServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PauseMarketingFLow  PauseMarketingFLowRequest
     * @return PauseMarketingFLowResponse
     */
    @Override
    public CompletableFuture<PauseMarketingFLowResponse> pauseMarketingFLow(PauseMarketingFLowRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PauseMarketingFLow").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PauseMarketingFLowResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PauseMarketingFLowResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before calling this operation, make sure that you have a successfully created WhatsApp Flow.</li>
     * <li>If you do not have a successfully created WhatsApp Flow, create one by calling the <a href="https://help.aliyun.com/document_detail/2638742.html">CreateFlow</a> operation.</li>
     * </ul>
     * <h4>QPS limit</h4>
     * <p>The single-user QPS limit for this operation is 5 calls per second. If this limit is exceeded, the API calls are throttled, which may affect your business. Call this operation as needed.</p>
     * 
     * @param request the request parameters of PublishFlow  PublishFlowRequest
     * @return PublishFlowResponse
     */
    @Override
    public CompletableFuture<PublishFlowResponse> publishFlow(PublishFlowRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PublishFlow").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PublishFlowResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PublishFlowResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The single-user QPS limit for this operation is 10 calls per second. If the limit is exceeded, API calls are throttled. This may affect your business. Call this operation at a reasonable rate.</p>
     * 
     * @param request the request parameters of QueryChatappBindWaba  QueryChatappBindWabaRequest
     * @return QueryChatappBindWabaResponse
     */
    @Override
    public CompletableFuture<QueryChatappBindWabaResponse> queryChatappBindWaba(QueryChatappBindWabaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryChatappBindWaba").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryChatappBindWabaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryChatappBindWabaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The throttling limit for this operation is 10 calls per second per user. If the limit is exceeded, API calls are throttled, which may affect your business. Call this operation at a reasonable rate.</p>
     * 
     * @param request the request parameters of QueryChatappPhoneNumbers  QueryChatappPhoneNumbersRequest
     * @return QueryChatappPhoneNumbersResponse
     */
    @Override
    public CompletableFuture<QueryChatappPhoneNumbersResponse> queryChatappPhoneNumbers(QueryChatappPhoneNumbersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryChatappPhoneNumbers").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryChatappPhoneNumbersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryChatappPhoneNumbersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryInstance  QueryInstanceRequest
     * @return QueryInstanceResponse
     */
    @Override
    public CompletableFuture<QueryInstanceResponse> queryInstance(QueryInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryMMLActive  QueryMMLActiveRequest
     * @return QueryMMLActiveResponse
     */
    @Override
    public CompletableFuture<QueryMMLActiveResponse> queryMMLActive(QueryMMLActiveRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryMMLActive").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryMMLActiveResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryMMLActiveResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The queries per second (QPS) limit per user is 10. If this limit is exceeded, API calls are throttled, which may affect your services. Make API calls at a reasonable rate.</p>
     * 
     * @param request the request parameters of QueryPhoneBusinessProfile  QueryPhoneBusinessProfileRequest
     * @return QueryPhoneBusinessProfileResponse
     */
    @Override
    public CompletableFuture<QueryPhoneBusinessProfileResponse> queryPhoneBusinessProfile(QueryPhoneBusinessProfileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryPhoneBusinessProfile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryPhoneBusinessProfileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryPhoneBusinessProfileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation allows a maximum of 10 requests per second per account. Excess requests are throttled, which may affect your business. Stay within the specified limit.</p>
     * 
     * @param request the request parameters of QueryWabaBusinessInfo  QueryWabaBusinessInfoRequest
     * @return QueryWabaBusinessInfoResponse
     */
    @Override
    public CompletableFuture<QueryWabaBusinessInfoResponse> queryWabaBusinessInfo(QueryWabaBusinessInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryWabaBusinessInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryWabaBusinessInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryWabaBusinessInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to retrieve flow details, or manually view flow details in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">flow editor</a>.</li>
     * <li>Before calling this operation, ensure that you have a successfully created flow.</li>
     * <li>If you do not have a successfully created flow, you can manually create a flow in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">flow editor</a> or create a flow by calling the <a href="https://help.aliyun.com/document_detail/2937204.html">CreateChatFlow</a> operation.</li>
     * </ul>
     * 
     * @param request the request parameters of ReadChatFlow  ReadChatFlowRequest
     * @return ReadChatFlowResponse
     */
    @Override
    public CompletableFuture<ReadChatFlowResponse> readChatFlow(ReadChatFlowRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReadChatFlow").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReadChatFlowResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReadChatFlowResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before calling this operation, make sure that flow log settings have been created for your flow.</li>
     * <li>If flow log settings have not been created for your flow, first create them by calling the <a href="https://help.aliyun.com/document_detail/2937211.html">CreateChatFlowLogSetting</a> operation.</li>
     * <li>You can use the unique ID returned by this operation to call the <a href="https://help.aliyun.com/document_detail/2937210.html">UpdateChatFlowLogSetting</a> operation to update the flow log settings.</li>
     * </ul>
     * 
     * @param request the request parameters of ReadChatFlowLogSetting  ReadChatFlowLogSettingRequest
     * @return ReadChatFlowLogSettingResponse
     */
    @Override
    public CompletableFuture<ReadChatFlowLogSettingResponse> readChatFlowLogSetting(ReadChatFlowLogSettingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReadChatFlowLogSetting").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReadChatFlowLogSettingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReadChatFlowLogSettingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to query a flow version. You can also click a flow name on the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">flow editor</a> page to go to the canvas orchestration page and view the flow version.</li>
     * <li>Before calling this operation, make sure that you have successfully created a flow.</li>
     * <li>If you do not have a successfully created flow, you can manually create a flow on the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">flow editor</a> page or create a flow by calling <a href="https://help.aliyun.com/document_detail/2937204.html">CreateChatFlow</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of ReadFlowVersion  ReadFlowVersionRequest
     * @return ReadFlowVersionResponse
     */
    @Override
    public CompletableFuture<ReadFlowVersionResponse> readFlowVersion(ReadFlowVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReadFlowVersion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReadFlowVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReadFlowVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RemoveContactById  RemoveContactByIdRequest
     * @return RemoveContactByIdResponse
     */
    @Override
    public CompletableFuture<RemoveContactByIdResponse> removeContactById(RemoveContactByIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveContactById").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveContactByIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveContactByIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The China-specific QPS limit for a single user of this API operation is 100 calls per second. If this limit is exceeded, API calls are throttled, which may affect your business. Call this operation as needed.</p>
     * 
     * @param request the request parameters of RequestWhatsappConversionApi  RequestWhatsappConversionApiRequest
     * @return RequestWhatsappConversionApiResponse
     */
    @Override
    public CompletableFuture<RequestWhatsappConversionApiResponse> requestWhatsappConversionApi(RequestWhatsappConversionApiRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RequestWhatsappConversionApi").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RequestWhatsappConversionApiResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RequestWhatsappConversionApiResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to send messages in batches, or manually send messages in batches on the &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement"><strong>Channel Management</strong></a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channel Management</strong></a> &gt; <strong>Manage</strong> &gt; <strong>Message Sending</strong> page.</li>
     * <li>Before calling this operation, make sure that you have created a channel and have an approved template.</li>
     * <li>For the WhatsApp channel type, complete <a href="https://help.aliyun.com/document_detail/172335.html">WABA registration and binding</a> and <a href="https://help.aliyun.com/document_detail/2656131.html">add a phone number</a>.</li>
     * <li>For the Messenger channel type, complete <a href="https://help.aliyun.com/document_detail/2837713.html">connecting a public page account</a>.</li>
     * <li>For the Instagram channel type, complete <a href="https://help.aliyun.com/document_detail/2837720.html">connecting a professional account</a>.
     * &lt;props=&quot;intl&quot;&gt;- For the Viber channel type, complete <a href="https://help.aliyun.com/document_detail/2807995.html">applying for a service number</a>.</li>
     * </ul>
     * <h3>QPS limits</h3>
     * <ul>
     * <li>The QPS limit for this operation is 10 calls per second per user. If the limit is exceeded, API calls are throttled, which may affect your business. Call this operation at a reasonable rate.</li>
     * <li>A single request supports a maximum of 1,000 phone numbers.</li>
     * </ul>
     * <h3>Status changes</h3>
     * <p>You can monitor message delivery status changes through MNS or HTTP. For more information, see <a href="https://help.aliyun.com/document_detail/421545.html">Receipt messages</a>.</p>
     * 
     * @param request the request parameters of SendChatappMassMessage  SendChatappMassMessageRequest
     * @return SendChatappMassMessageResponse
     */
    @Override
    public CompletableFuture<SendChatappMassMessageResponse> sendChatappMassMessage(SendChatappMassMessageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SendChatappMassMessage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SendChatappMassMessageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SendChatappMassMessageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to send a message, or manually send a message on the &lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement"><strong>Channel Management</strong></a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channel Management</strong></a> &gt; <strong>Management</strong> &gt; <strong>Send Message</strong> page.</li>
     * <li>Before calling this operation, make sure that you have created a channel and have an approved template.</li>
     * <li>For WhatsApp channels, you must complete <a href="https://help.aliyun.com/document_detail/172335.html">WABA registration and bindng</a> and <a href="https://help.aliyun.com/document_detail/2656131.html">add a phone number</a>.</li>
     * <li>For Messenger channels, you must complete <a href="https://help.aliyun.com/document_detail/2837713.html">connecting a public page account</a>.</li>
     * <li>For Instagram channels, you must complete <a href="https://help.aliyun.com/document_detail/2837720.html">connecting a professional account</a>.
     * &lt;props=&quot;intl&quot;&gt;- For Viber channels, you must complete <a href="https://help.aliyun.com/document_detail/2807995.html">applying for a service ID</a>.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The single-user QPS limit for this operation is 250 calls per second. If this limit is exceeded, API calls are throttled, which may affect your business. Call this operation appropriately.</p>
     * <h3>Status changes</h3>
     * <p>You can monitor message delivery status through MNS or HTTP. For more information, see <a href="https://help.aliyun.com/document_detail/421545.html">Receipt messages</a>.</p>
     * 
     * @param request the request parameters of SendChatappMessage  SendChatappMessageRequest
     * @return SendChatappMessageResponse
     */
    @Override
    public CompletableFuture<SendChatappMessageResponse> sendChatappMessage(SendChatappMessageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SendChatappMessage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SendChatappMessageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SendChatappMessageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubmitVerifyCodeResult  SubmitVerifyCodeResultRequest
     * @return SubmitVerifyCodeResultResponse
     */
    @Override
    public CompletableFuture<SubmitVerifyCodeResultResponse> submitVerifyCodeResult(SubmitVerifyCodeResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitVerifyCodeResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitVerifyCodeResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitVerifyCodeResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before calling this operation, configure the webhooks for messages and receipts by using <a href="https://help.aliyun.com/document_detail/600763.html">UpdatePhoneWebhook</a> and <a href="https://help.aliyun.com/document_detail/600765.html">UpdateAccountWebhook</a>. Otherwise, the webhook address cannot be found during historical message synchronization, which causes the synchronization to fail.</li>
     * <li>This operation takes effect only once. After the first call, subsequent calls do not trigger historical message pushes.</li>
     * </ul>
     * 
     * @param request the request parameters of SyncBusinessAppHistory  SyncBusinessAppHistoryRequest
     * @return SyncBusinessAppHistoryResponse
     */
    @Override
    public CompletableFuture<SyncBusinessAppHistoryResponse> syncBusinessAppHistory(SyncBusinessAppHistoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SyncBusinessAppHistory").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SyncBusinessAppHistoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SyncBusinessAppHistoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SyncFlow  SyncFlowRequest
     * @return SyncFlowResponse
     */
    @Override
    public CompletableFuture<SyncFlowResponse> syncFlow(SyncFlowRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SyncFlow").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SyncFlowResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SyncFlowResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SyncMessageCampaign  SyncMessageCampaignRequest
     * @return SyncMessageCampaignResponse
     */
    @Override
    public CompletableFuture<SyncMessageCampaignResponse> syncMessageCampaign(SyncMessageCampaignRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SyncMessageCampaign").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SyncMessageCampaignResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SyncMessageCampaignResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SyncMessengerSubscriptionToken  SyncMessengerSubscriptionTokenRequest
     * @return SyncMessengerSubscriptionTokenResponse
     */
    @Override
    public CompletableFuture<SyncMessengerSubscriptionTokenResponse> syncMessengerSubscriptionToken(SyncMessengerSubscriptionTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SyncMessengerSubscriptionToken").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SyncMessengerSubscriptionTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SyncMessengerSubscriptionTokenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to trigger a published version of a flow that has a manual trigger. You can also trigger the flow from the <a href="https://chatapp.console.aliyun.com/MarketingActivityManagement">Marketing Campaign Management</a> page if the flow is associated with a marketing campaign.</li>
     * <li>Before you call this operation, make sure that the flow has a manual trigger and is published.</li>
     * <li>If a flow with a manual trigger does not have a published version, you must publish it. In <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Chat Flow</a>, you can click the flow name to open the canvas and publish the version. Alternatively, you can call the <a href="https://help.aliyun.com/document_detail/2937203.html">OnlineFlowVersion</a> API to publish the version.</li>
     * <li>If your flow contains components that incur costs, such as message sending or function invocations, make sure that you understand the billing methods and pricing for these products before you trigger the flow.</li>
     * </ul>
     * 
     * @param request the request parameters of TriggerChatFlow  TriggerChatFlowRequest
     * @return TriggerChatFlowResponse
     */
    @Override
    public CompletableFuture<TriggerChatFlowResponse> triggerChatFlow(TriggerChatFlowRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TriggerChatFlow").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TriggerChatFlowResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TriggerChatFlowResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UnbindDmAccount  UnbindDmAccountRequest
     * @return UnbindDmAccountResponse
     */
    @Override
    public CompletableFuture<UnbindDmAccountResponse> unbindDmAccount(UnbindDmAccountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UnbindDmAccount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnbindDmAccountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnbindDmAccountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation allows a maximum of 10 requests per second per account. Excess requests are throttled, which may affect your business. Stay within the specified limit.</p>
     * 
     * @param request the request parameters of UpdateAccountWebhook  UpdateAccountWebhookRequest
     * @return UpdateAccountWebhookResponse
     */
    @Override
    public CompletableFuture<UpdateAccountWebhookResponse> updateAccountWebhook(UpdateAccountWebhookRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateAccountWebhook").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAccountWebhookResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAccountWebhookResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateAuditRequest  UpdateAuditRequestRequest
     * @return UpdateAuditRequestResponse
     */
    @Override
    public CompletableFuture<UpdateAuditRequestResponse> updateAuditRequest(UpdateAuditRequestRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateAuditRequest").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAuditRequestResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAuditRequestResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to update the basic information of a flow, or manually update it in <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder"><strong>Flow Builder</strong></a> &gt; <strong>Settings</strong> &gt; <strong>Basic Information</strong>.</li>
     * <li>Before calling this operation, make sure you have a successfully created flow.</li>
     * <li>If you do not have a successfully created flow, click <strong>Create Flow</strong> in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder"><strong>Flow Builder</strong></a> to manually create one.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateChatFlow  UpdateChatFlowRequest
     * @return UpdateChatFlowResponse
     */
    @Override
    public CompletableFuture<UpdateChatFlowResponse> updateChatFlow(UpdateChatFlowRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateChatFlow").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateChatFlowResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateChatFlowResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to update flow log settings, or manually update them in <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder"><strong>Flow Builder</strong></a> &gt; <strong>Settings</strong> &gt; <strong>Log</strong>.</li>
     * <li>Before calling this operation, make sure that you have activated <a href="https://sls.console.aliyun.com/lognext/open">Simple Log Service</a> and created flow log settings.</li>
     * <li>If you have not created flow log settings for the flow, first create them by calling the <a href="https://help.aliyun.com/document_detail/2937211.html">CreateChatFlowLogSetting</a> operation.</li>
     * <li>Updating flow log settings may affect your business. Proceed with caution.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateChatFlowLogSetting  UpdateChatFlowLogSettingRequest
     * @return UpdateChatFlowLogSettingResponse
     */
    @Override
    public CompletableFuture<UpdateChatFlowLogSettingResponse> updateChatFlowLogSetting(UpdateChatFlowLogSettingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateChatFlowLogSetting").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateChatFlowLogSettingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateChatFlowLogSettingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: Modifying IM group information through API is a Meta beta feature. Contact your account manager to request allowlisting.</p>
     * </blockquote>
     * <ul>
     * <li>Creating WhatsApp groups through API is a Meta beta feature. Contact your account manager to request allowlisting.</li>
     * <li>Before calling this operation, make sure that you have an IM group that has been created.</li>
     * <li>If you do not have a created IM group, create one by calling the <a href="https://help.aliyun.com/document_detail/2998429.html">AddChatGroup</a> operation.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateChatGroup  UpdateChatGroupRequest
     * @return UpdateChatGroupResponse
     */
    @Override
    public CompletableFuture<UpdateChatGroupResponse> updateChatGroup(UpdateChatGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateChatGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateChatGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateChatGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This API is limited to 10 queries per second (QPS) for each user. If you exceed this limit, API calls are throttled, which can affect your business. Call this API within the specified limit.</p>
     * 
     * @param request the request parameters of UpdateCommerceSetting  UpdateCommerceSettingRequest
     * @return UpdateCommerceSettingResponse
     */
    @Override
    public CompletableFuture<UpdateCommerceSettingResponse> updateCommerceSetting(UpdateCommerceSettingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateCommerceSetting").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateCommerceSettingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateCommerceSettingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateContactById  UpdateContactByIdRequest
     * @return UpdateContactByIdResponse
     */
    @Override
    public CompletableFuture<UpdateContactByIdResponse> updateContactById(UpdateContactByIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateContactById").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateContactByIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateContactByIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The single-user QPS limit for this API is 5 calls per second. If this limit is exceeded, the API calls are throttled, which may affect your business. Call this API appropriately.
     * This API directly retrieves data from Facebook. Facebook imposes a limit on the total number of API calls. Use this API appropriately.</p>
     * 
     * @param request the request parameters of UpdateConversationalAutomation  UpdateConversationalAutomationRequest
     * @return UpdateConversationalAutomationResponse
     */
    @Override
    public CompletableFuture<UpdateConversationalAutomationResponse> updateConversationalAutomation(UpdateConversationalAutomationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateConversationalAutomation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateConversationalAutomationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateConversationalAutomationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The queries per second (QPS) limit per user is 5. If the number of API calls exceeds this limit, throttling is triggered, which may affect your business. Make API calls at a reasonable rate.</p>
     * 
     * @param request the request parameters of UpdateFlowJSONAsset  UpdateFlowJSONAssetRequest
     * @return UpdateFlowJSONAssetResponse
     */
    @Override
    public CompletableFuture<UpdateFlowJSONAssetResponse> updateFlowJSONAsset(UpdateFlowJSONAssetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateFlowJSONAsset").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateFlowJSONAssetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateFlowJSONAssetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to update the DSL data of a flow version, or click a flow name on the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">flow editor</a> page to go to the canvas orchestration page and update the DSL data of the flow version.</li>
     * <li>Before calling this operation, make sure that you have created a flow and the flow status is offline.</li>
     * <li>If you have not created a flow, you can manually create a flow on the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">flow editor</a> page or create a flow by calling the <a href="https://help.aliyun.com/document_detail/2937204.html">CreateChatFlow</a> operation.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateFlowVersion  UpdateFlowVersionRequest
     * @return UpdateFlowVersionResponse
     */
    @Override
    public CompletableFuture<UpdateFlowVersionResponse> updateFlowVersion(UpdateFlowVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateFlowVersion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateFlowVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateFlowVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateGroupName  UpdateGroupNameRequest
     * @return UpdateGroupNameResponse
     */
    @Override
    public CompletableFuture<UpdateGroupNameResponse> updateGroupName(UpdateGroupNameRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateGroupName").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateGroupNameResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateGroupNameResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateInstance  UpdateInstanceRequest
     * @return UpdateInstanceResponse
     */
    @Override
    public CompletableFuture<UpdateInstanceResponse> updateInstance(UpdateInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateMarketingFLow  UpdateMarketingFLowRequest
     * @return UpdateMarketingFLowResponse
     */
    @Override
    public CompletableFuture<UpdateMarketingFLowResponse> updateMarketingFLow(UpdateMarketingFLowRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateMarketingFLow").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateMarketingFLowResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateMarketingFLowResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before calling this operation, make sure that a phone number has been added under your WABA and has passed phone number verification.</li>
     * <li>If no phone number has been added under your WABA, call the <a href="https://help.aliyun.com/document_detail/600746.html">GetChatappVerifyCode</a> and <a href="https://help.aliyun.com/document_detail/600770.html">ChatappVerifyAndRegister</a> operations to obtain a verification code and register a phone number.</li>
     * </ul>
     * <h4>QPS limit</h4>
     * <p>The single-user QPS limit for this operation is 5 calls per second. If this limit is exceeded, API calls are throttled, which may affect your business. Call this operation as appropriate.</p>
     * 
     * @param request the request parameters of UpdatePhoneEncryptionPublicKey  UpdatePhoneEncryptionPublicKeyRequest
     * @return UpdatePhoneEncryptionPublicKeyResponse
     */
    @Override
    public CompletableFuture<UpdatePhoneEncryptionPublicKeyResponse> updatePhoneEncryptionPublicKey(UpdatePhoneEncryptionPublicKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdatePhoneEncryptionPublicKey").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdatePhoneEncryptionPublicKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdatePhoneEncryptionPublicKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>After you modify a message QR code, users can no longer open the corresponding business phone number by scanning the original QR code. Proceed with caution.</li>
     * <li>Before calling this operation, make sure that you have created a message QR code.</li>
     * <li>If you have not created a message QR code, call the <a href="https://help.aliyun.com/document_detail/2638749.html">CreatePhoneMessageQrdl</a> operation to create one first.</li>
     * </ul>
     * <h4>QPS limit</h4>
     * <p>The single-user QPS limit for this operation is 5 calls per second. If this limit is exceeded, the API calls are throttled, which may affect your business. Call this operation as needed.</p>
     * 
     * @param request the request parameters of UpdatePhoneMessageQrdl  UpdatePhoneMessageQrdlRequest
     * @return UpdatePhoneMessageQrdlResponse
     */
    @Override
    public CompletableFuture<UpdatePhoneMessageQrdlResponse> updatePhoneMessageQrdl(UpdatePhoneMessageQrdlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdatePhoneMessageQrdl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdatePhoneMessageQrdlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdatePhoneMessageQrdlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The queries per second (QPS) limit per user is 10. If this limit is exceeded, API calls are throttled, which may affect your business. Make API calls at a reasonable frequency.</p>
     * 
     * @param request the request parameters of UpdatePhoneWebhook  UpdatePhoneWebhookRequest
     * @return UpdatePhoneWebhookResponse
     */
    @Override
    public CompletableFuture<UpdatePhoneWebhookResponse> updatePhoneWebhook(UpdatePhoneWebhookRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdatePhoneWebhook").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdatePhoneWebhookResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdatePhoneWebhookResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateWabaMmlStatus  UpdateWabaMmlStatusRequest
     * @return UpdateWabaMmlStatusResponse
     */
    @Override
    public CompletableFuture<UpdateWabaMmlStatusResponse> updateWabaMmlStatus(UpdateWabaMmlStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateWabaMmlStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateWabaMmlStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateWabaMmlStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateWhatsappUserName  UpdateWhatsappUserNameRequest
     * @return UpdateWhatsappUserNameResponse
     */
    @Override
    public CompletableFuture<UpdateWhatsappUserNameResponse> updateWhatsappUserName(UpdateWhatsappUserNameRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateWhatsappUserName").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateWhatsappUserNameResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateWhatsappUserNameResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of WhatsappCall  WhatsappCallRequest
     * @return WhatsappCallResponse
     */
    @Override
    public CompletableFuture<WhatsappCallResponse> whatsappCall(WhatsappCallRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("WhatsappCall").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(WhatsappCallResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<WhatsappCallResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
