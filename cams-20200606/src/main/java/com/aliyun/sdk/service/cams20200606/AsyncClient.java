// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.cams20200606.models.*;
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
     * @param request the request parameters of AddAddressRecoverSuspend  AddAddressRecoverSuspendRequest
     * @return AddAddressRecoverSuspendResponse
     */
    CompletableFuture<AddAddressRecoverSuspendResponse> addAddressRecoverSuspend(AddAddressRecoverSuspendRequest request);

    /**
     * @param request the request parameters of AddAuditViberOpen  AddAuditViberOpenRequest
     * @return AddAuditViberOpenResponse
     */
    CompletableFuture<AddAuditViberOpenResponse> addAuditViberOpen(AddAuditViberOpenRequest request);

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
    CompletableFuture<AddChatGroupResponse> addChatGroup(AddChatGroupRequest request);

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
    CompletableFuture<AddChatGroupInviteLinkResponse> addChatGroupInviteLink(AddChatGroupInviteLinkRequest request);

    /**
     * <b>description</b> :
     * <p>The QPS limit per user for this API operation is 10 requests per second. If the limit is exceeded, API calls are throttled, which may affect your business. Call this API operation as needed.</p>
     * 
     * @param request the request parameters of AddChatappPhoneNumber  AddChatappPhoneNumberRequest
     * @return AddChatappPhoneNumberResponse
     */
    CompletableFuture<AddChatappPhoneNumberResponse> addChatappPhoneNumber(AddChatappPhoneNumberRequest request);

    /**
     * @param request the request parameters of AddContacts  AddContactsRequest
     * @return AddContactsResponse
     */
    CompletableFuture<AddContactsResponse> addContacts(AddContactsRequest request);

    /**
     * <b>description</b> :
     * <p>After you submit the users of a custom audience to Meta, Meta discards the matching data if fewer than 100 users are successfully matched. This prevents the submitted phone numbers from being compared with tokens to establish direct relationships. You can pass up to 10,000 user records in a single request.</p>
     * 
     * @param request the request parameters of AddCustomAudienceUser  AddCustomAudienceUserRequest
     * @return AddCustomAudienceUserResponse
     */
    CompletableFuture<AddCustomAudienceUserResponse> addCustomAudienceUser(AddCustomAudienceUserRequest request);

    /**
     * @param request the request parameters of AddGroup  AddGroupRequest
     * @return AddGroupResponse
     */
    CompletableFuture<AddGroupResponse> addGroup(AddGroupRequest request);

    /**
     * @param request the request parameters of AddMarketingFlow  AddMarketingFlowRequest
     * @return AddMarketingFlowResponse
     */
    CompletableFuture<AddMarketingFlowResponse> addMarketingFlow(AddMarketingFlowRequest request);

    /**
     * @param request the request parameters of ArchiveChatappTemplate  ArchiveChatappTemplateRequest
     * @return ArchiveChatappTemplateResponse
     */
    CompletableFuture<ArchiveChatappTemplateResponse> archiveChatappTemplate(ArchiveChatappTemplateRequest request);

    /**
     * @param request the request parameters of BindDmAccount  BindDmAccountRequest
     * @return BindDmAccountResponse
     */
    CompletableFuture<BindDmAccountResponse> bindDmAccount(BindDmAccountRequest request);

    /**
     * @param request the request parameters of BindInstagramPage  BindInstagramPageRequest
     * @return BindInstagramPageResponse
     */
    CompletableFuture<BindInstagramPageResponse> bindInstagramPage(BindInstagramPageRequest request);

    /**
     * @param request the request parameters of BindMessengerPage  BindMessengerPageRequest
     * @return BindMessengerPageResponse
     */
    CompletableFuture<BindMessengerPageResponse> bindMessengerPage(BindMessengerPageRequest request);

    /**
     * @param request the request parameters of ChangeResourceGroup  ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    /**
     * <b>description</b> :
     * <p>The queries per second (QPS) limit for a single user is 10. If you exceed this limit, API calls are throttled, which may affect your services. Make API calls at a reasonable rate.</p>
     * 
     * @param request the request parameters of ChatappBindWaba  ChatappBindWabaRequest
     * @return ChatappBindWabaResponse
     */
    CompletableFuture<ChatappBindWabaResponse> chatappBindWaba(ChatappBindWabaRequest request);

    /**
     * <b>description</b> :
     * <p>The queries per second (QPS) limit for this operation is 10 calls per second per user. If this limit is exceeded, API calls are throttled, which may affect your business. Call this operation at an appropriate frequency.</p>
     * 
     * @param request the request parameters of ChatappMigrationRegister  ChatappMigrationRegisterRequest
     * @return ChatappMigrationRegisterResponse
     */
    CompletableFuture<ChatappMigrationRegisterResponse> chatappMigrationRegister(ChatappMigrationRegisterRequest request);

    /**
     * <b>description</b> :
     * <p>The China Message Service API has a single-user QPS limit of 10 calls per second. If this limit is exceeded, throttling is triggered, which may affect your business. Manage your calls appropriately.</p>
     * 
     * @param request the request parameters of ChatappMigrationVerified  ChatappMigrationVerifiedRequest
     * @return ChatappMigrationVerifiedResponse
     */
    CompletableFuture<ChatappMigrationVerifiedResponse> chatappMigrationVerified(ChatappMigrationVerifiedRequest request);

    /**
     * <b>description</b> :
     * <p>The queries per second (QPS) limit per user for this operation is 10. If this limit is exceeded, API calls are throttled, which may affect your business. Make API calls at a reasonable rate.</p>
     * 
     * @param request the request parameters of ChatappPhoneNumberDeregister  ChatappPhoneNumberDeregisterRequest
     * @return ChatappPhoneNumberDeregisterResponse
     */
    CompletableFuture<ChatappPhoneNumberDeregisterResponse> chatappPhoneNumberDeregister(ChatappPhoneNumberDeregisterRequest request);

    /**
     * <b>description</b> :
     * <p>The queries per second (QPS) limit for a single user is 10. If the limit is exceeded, API calls are throttled, which may affect your services. Call the API at a reasonable frequency.</p>
     * 
     * @param request the request parameters of ChatappPhoneNumberRegister  ChatappPhoneNumberRegisterRequest
     * @return ChatappPhoneNumberRegisterResponse
     */
    CompletableFuture<ChatappPhoneNumberRegisterResponse> chatappPhoneNumberRegister(ChatappPhoneNumberRegisterRequest request);

    /**
     * <b>description</b> :
     * <p>The China-specific QPS limit for this API is 10 calls per second. If this limit is exceeded, the API calls are throttled, which may affect your business. Call this operation at a reasonable frequency.</p>
     * 
     * @param request the request parameters of ChatappSyncPhoneNumber  ChatappSyncPhoneNumberRequest
     * @return ChatappSyncPhoneNumberResponse
     */
    CompletableFuture<ChatappSyncPhoneNumberResponse> chatappSyncPhoneNumber(ChatappSyncPhoneNumberRequest request);

    /**
     * <b>description</b> :
     * <p>The QPS limit per user is 10 requests per second. If this limit is exceeded, API calls are throttled, which may affect your services. Call this API at a reasonable frequency.</p>
     * 
     * @param request the request parameters of ChatappVerifyAndRegister  ChatappVerifyAndRegisterRequest
     * @return ChatappVerifyAndRegisterResponse
     */
    CompletableFuture<ChatappVerifyAndRegisterResponse> chatappVerifyAndRegister(ChatappVerifyAndRegisterRequest request);

    /**
     * @param request the request parameters of CheckDirectSendMessageSample  CheckDirectSendMessageSampleRequest
     * @return CheckDirectSendMessageSampleResponse
     */
    CompletableFuture<CheckDirectSendMessageSampleResponse> checkDirectSendMessageSample(CheckDirectSendMessageSampleRequest request);

    /**
     * @param request the request parameters of CopyTemplate  CopyTemplateRequest
     * @return CopyTemplateResponse
     */
    CompletableFuture<CopyTemplateResponse> copyTemplate(CopyTemplateRequest request);

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
    CompletableFuture<CreateChatFlowResponse> createChatFlow(CreateChatFlowRequest request);

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
    CompletableFuture<CreateChatFlowByImportResponse> createChatFlowByImport(CreateChatFlowByImportRequest request);

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
    CompletableFuture<CreateChatFlowLogSettingResponse> createChatFlowLogSetting(CreateChatFlowLogSettingRequest request);

    /**
     * <b>description</b> :
     * <p>This API is limited to 10 queries per second (QPS) for each user. If you exceed this limit, API calls are throttled, which can affect your business. Call this API within the specified limit.</p>
     * 
     * @param request the request parameters of CreateChatappMigrationInitiate  CreateChatappMigrationInitiateRequest
     * @return CreateChatappMigrationInitiateResponse
     */
    CompletableFuture<CreateChatappMigrationInitiateResponse> createChatappMigrationInitiate(CreateChatappMigrationInitiateRequest request);

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
    CompletableFuture<CreateChatappTemplateResponse> createChatappTemplate(CreateChatappTemplateRequest request);

    /**
     * @param request the request parameters of CreateCustomAudience  CreateCustomAudienceRequest
     * @return CreateCustomAudienceResponse
     */
    CompletableFuture<CreateCustomAudienceResponse> createCustomAudience(CreateCustomAudienceRequest request);

    /**
     * <b>description</b> :
     * <p>The China Message Service (Chinese SMS) API has a single-user QPS limit of 5 calls per second. If this limit is exceeded, API calls are throttled, which may affect your business. Call this operation appropriately.</p>
     * 
     * @param request the request parameters of CreateFlow  CreateFlowRequest
     * @return CreateFlowResponse
     */
    CompletableFuture<CreateFlowResponse> createFlow(CreateFlowRequest request);

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
    CompletableFuture<CreateFlowVersionResponse> createFlowVersion(CreateFlowVersionRequest request);

    /**
     * @param request the request parameters of CreateInstance  CreateInstanceRequest
     * @return CreateInstanceResponse
     */
    CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request);

    /**
     * @param request the request parameters of CreateMessageCampaign  CreateMessageCampaignRequest
     * @return CreateMessageCampaignResponse
     */
    CompletableFuture<CreateMessageCampaignResponse> createMessageCampaign(CreateMessageCampaignRequest request);

    /**
     * @param request the request parameters of CreateMessengerPage  CreateMessengerPageRequest
     * @return CreateMessengerPageResponse
     */
    CompletableFuture<CreateMessengerPageResponse> createMessengerPage(CreateMessengerPageRequest request);

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
    CompletableFuture<CreatePhoneMessageQrdlResponse> createPhoneMessageQrdl(CreatePhoneMessageQrdlRequest request);

    /**
     * @param request the request parameters of CreateWhatsappConversionApi  CreateWhatsappConversionApiRequest
     * @return CreateWhatsappConversionApiResponse
     */
    CompletableFuture<CreateWhatsappConversionApiResponse> createWhatsappConversionApi(CreateWhatsappConversionApiRequest request);

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
    CompletableFuture<DeleteChatFlowResponse> deleteChatFlow(DeleteChatFlowRequest request);

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
    CompletableFuture<DeleteChatGroupResponse> deleteChatGroup(DeleteChatGroupRequest request);

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
    CompletableFuture<DeleteChatGroupInviteLinkResponse> deleteChatGroupInviteLink(DeleteChatGroupInviteLinkRequest request);

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
    CompletableFuture<DeleteChatGroupParticipantsResponse> deleteChatGroupParticipants(DeleteChatGroupParticipantsRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>This operation allows a maximum of 5 requests per second per account. Excess requests are throttled, which may affect your business. Stay within the specified limit.</p>
     * 
     * @param request the request parameters of DeleteChatappTemplate  DeleteChatappTemplateRequest
     * @return DeleteChatappTemplateResponse
     */
    CompletableFuture<DeleteChatappTemplateResponse> deleteChatappTemplate(DeleteChatappTemplateRequest request);

    /**
     * @param request the request parameters of DeleteContacts  DeleteContactsRequest
     * @return DeleteContactsResponse
     */
    CompletableFuture<DeleteContactsResponse> deleteContacts(DeleteContactsRequest request);

    /**
     * @param request the request parameters of DeleteContactsByIds  DeleteContactsByIdsRequest
     * @return DeleteContactsByIdsResponse
     */
    CompletableFuture<DeleteContactsByIdsResponse> deleteContactsByIds(DeleteContactsByIdsRequest request);

    /**
     * <b>description</b> :
     * <p>The single-user QPS limit for this operation is 5 calls per second. If this limit is exceeded, API calls are throttled, which may affect your business. Call this operation appropriately.</p>
     * 
     * @param request the request parameters of DeleteFlow  DeleteFlowRequest
     * @return DeleteFlowResponse
     */
    CompletableFuture<DeleteFlowResponse> deleteFlow(DeleteFlowRequest request);

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
    CompletableFuture<DeleteFlowVersionResponse> deleteFlowVersion(DeleteFlowVersionRequest request);

    /**
     * @param request the request parameters of DeleteGroupById  DeleteGroupByIdRequest
     * @return DeleteGroupByIdResponse
     */
    CompletableFuture<DeleteGroupByIdResponse> deleteGroupById(DeleteGroupByIdRequest request);

    /**
     * @param request the request parameters of DeleteInstagramPage  DeleteInstagramPageRequest
     * @return DeleteInstagramPageResponse
     */
    CompletableFuture<DeleteInstagramPageResponse> deleteInstagramPage(DeleteInstagramPageRequest request);

    /**
     * @param request the request parameters of DeleteInstance  DeleteInstanceRequest
     * @return DeleteInstanceResponse
     */
    CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request);

    /**
     * @param request the request parameters of DeleteMarketingFlow  DeleteMarketingFlowRequest
     * @return DeleteMarketingFlowResponse
     */
    CompletableFuture<DeleteMarketingFlowResponse> deleteMarketingFlow(DeleteMarketingFlowRequest request);

    /**
     * @param request the request parameters of DeleteMessageCampaign  DeleteMessageCampaignRequest
     * @return DeleteMessageCampaignResponse
     */
    CompletableFuture<DeleteMessageCampaignResponse> deleteMessageCampaign(DeleteMessageCampaignRequest request);

    /**
     * @param request the request parameters of DeleteMessengerPage  DeleteMessengerPageRequest
     * @return DeleteMessengerPageResponse
     */
    CompletableFuture<DeleteMessengerPageResponse> deleteMessengerPage(DeleteMessengerPageRequest request);

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
    CompletableFuture<DeletePhoneMessageQrdlResponse> deletePhoneMessageQrdl(DeletePhoneMessageQrdlRequest request);

    /**
     * @param request the request parameters of DeleteWhatsappUserName  DeleteWhatsappUserNameRequest
     * @return DeleteWhatsappUserNameResponse
     */
    CompletableFuture<DeleteWhatsappUserNameResponse> deleteWhatsappUserName(DeleteWhatsappUserNameRequest request);

    /**
     * <b>description</b> :
     * <p>The China Message Service API has a single-user QPS limit of 5 calls per second. If this limit is exceeded, API calls are throttled, which may affect your business. Call this operation at a reasonable frequency.</p>
     * 
     * @param request the request parameters of DeprecateFlow  DeprecateFlowRequest
     * @return DeprecateFlowResponse
     */
    CompletableFuture<DeprecateFlowResponse> deprecateFlow(DeprecateFlowRequest request);

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
    CompletableFuture<EnableWhatsappROIMetricResponse> enableWhatsappROIMetric(EnableWhatsappROIMetricRequest request);

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
    CompletableFuture<FlowBindPhoneResponse> flowBindPhone(FlowBindPhoneRequest request);

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
    CompletableFuture<FlowRebindPhoneResponse> flowRebindPhone(FlowRebindPhoneRequest request);

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
    CompletableFuture<FlowUnbindPhoneResponse> flowUnbindPhone(FlowUnbindPhoneRequest request);

    /**
     * @param request the request parameters of GeneratePresignedUrl  GeneratePresignedUrlRequest
     * @return GeneratePresignedUrlResponse
     */
    CompletableFuture<GeneratePresignedUrlResponse> generatePresignedUrl(GeneratePresignedUrlRequest request);

    /**
     * @param request the request parameters of GetAuditRequestByTypeUnAudit  GetAuditRequestByTypeUnAuditRequest
     * @return GetAuditRequestByTypeUnAuditResponse
     */
    CompletableFuture<GetAuditRequestByTypeUnAuditResponse> getAuditRequestByTypeUnAudit(GetAuditRequestByTypeUnAuditRequest request);

    /**
     * @param request the request parameters of GetAutoGeneratedTemplate  GetAutoGeneratedTemplateRequest
     * @return GetAutoGeneratedTemplateResponse
     */
    CompletableFuture<GetAutoGeneratedTemplateResponse> getAutoGeneratedTemplate(GetAutoGeneratedTemplateRequest request);

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
    CompletableFuture<GetChatFlowMetricResponse> getChatFlowMetric(GetChatFlowMetricRequest request);

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
    CompletableFuture<GetChatFlowTemplateResponse> getChatFlowTemplate(GetChatFlowTemplateRequest request);

    /**
     * @param request the request parameters of GetChatappOpenStatus  GetChatappOpenStatusRequest
     * @return GetChatappOpenStatusResponse
     */
    CompletableFuture<GetChatappOpenStatusResponse> getChatappOpenStatus(GetChatappOpenStatusRequest request);

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
    CompletableFuture<GetChatappPhoneNumberMetricResponse> getChatappPhoneNumberMetric(GetChatappPhoneNumberMetricRequest request);

    /**
     * @param request the request parameters of GetChatappPhoneNumberSetting  GetChatappPhoneNumberSettingRequest
     * @return GetChatappPhoneNumberSettingResponse
     */
    CompletableFuture<GetChatappPhoneNumberSettingResponse> getChatappPhoneNumberSetting(GetChatappPhoneNumberSettingRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit for a single user is 5. If the limit is exceeded, API calls are throttled, which may affect your services. Call this API at a reasonable rate.</p>
     * 
     * @param request the request parameters of GetChatappTemplateDetail  GetChatappTemplateDetailRequest
     * @return GetChatappTemplateDetailResponse
     */
    CompletableFuture<GetChatappTemplateDetailResponse> getChatappTemplateDetail(GetChatappTemplateDetailRequest request);

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
    CompletableFuture<GetChatappTemplateMetricResponse> getChatappTemplateMetric(GetChatappTemplateMetricRequest request);

    /**
     * <b>description</b> :
     * <p>This operation allows a maximum of 5 requests per second per account. Excess requests are throttled, which may affect your business. Stay within the specified limit.</p>
     * 
     * @param request the request parameters of GetChatappUploadAuthorization  GetChatappUploadAuthorizationRequest
     * @return GetChatappUploadAuthorizationResponse
     */
    CompletableFuture<GetChatappUploadAuthorizationResponse> getChatappUploadAuthorization(GetChatappUploadAuthorizationRequest request);

    /**
     * <b>description</b> :
     * <p>This API is limited to 10 queries per second (QPS) for each user. If you exceed this limit, API calls are throttled, which can affect your business. Call this API within the specified limit.</p>
     * 
     * @param request the request parameters of GetChatappVerifyCode  GetChatappVerifyCodeRequest
     * @return GetChatappVerifyCodeResponse
     */
    CompletableFuture<GetChatappVerifyCodeResponse> getChatappVerifyCode(GetChatappVerifyCodeRequest request);

    /**
     * <b>description</b> :
     * <p>This operation allows a maximum of 10 requests per second per account. Excess requests are throttled, which may affect your business. Stay within the specified limit.</p>
     * 
     * @param request the request parameters of GetCommerceSetting  GetCommerceSettingRequest
     * @return GetCommerceSettingResponse
     */
    CompletableFuture<GetCommerceSettingResponse> getCommerceSetting(GetCommerceSettingRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#qps-"></a>QPS limit</h3>
     * <p>This operation allows a maximum of 5 requests per second per account. Excess requests are throttled, which may affect your business. Stay within the specified limit.
     * This operation retrieves data directly from Meta. Meta imposes its own rate limits on the total number of calls. Stay within the specified limit.</p>
     * 
     * @param request the request parameters of GetConversationalAutomation  GetConversationalAutomationRequest
     * @return GetConversationalAutomationResponse
     */
    CompletableFuture<GetConversationalAutomationResponse> getConversationalAutomation(GetConversationalAutomationRequest request);

    /**
     * @param request the request parameters of GetCustomerSite  GetCustomerSiteRequest
     * @return GetCustomerSiteResponse
     */
    CompletableFuture<GetCustomerSiteResponse> getCustomerSite(GetCustomerSiteRequest request);

    /**
     * @param request the request parameters of GetDownloadExcelList  GetDownloadExcelListRequest
     * @return GetDownloadExcelListResponse
     */
    CompletableFuture<GetDownloadExcelListResponse> getDownloadExcelList(GetDownloadExcelListRequest request);

    /**
     * @param request the request parameters of GetFbInstagramPages  GetFbInstagramPagesRequest
     * @return GetFbInstagramPagesResponse
     */
    CompletableFuture<GetFbInstagramPagesResponse> getFbInstagramPages(GetFbInstagramPagesRequest request);

    /**
     * @param request the request parameters of GetFbMessengerPages  GetFbMessengerPagesRequest
     * @return GetFbMessengerPagesResponse
     */
    CompletableFuture<GetFbMessengerPagesResponse> getFbMessengerPages(GetFbMessengerPagesRequest request);

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
    CompletableFuture<GetFlowResponse> getFlow(GetFlowRequest request);

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
    CompletableFuture<GetFlowJSONAssestResponse> getFlowJSONAssest(GetFlowJSONAssestRequest request);

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
    CompletableFuture<GetFlowPreviewUrlResponse> getFlowPreviewUrl(GetFlowPreviewUrlRequest request);

    /**
     * @param request the request parameters of GetGroupExist  GetGroupExistRequest
     * @return GetGroupExistResponse
     */
    CompletableFuture<GetGroupExistResponse> getGroupExist(GetGroupExistRequest request);

    /**
     * @param request the request parameters of GetMessageCampaignInsights  GetMessageCampaignInsightsRequest
     * @return GetMessageCampaignInsightsResponse
     */
    CompletableFuture<GetMessageCampaignInsightsResponse> getMessageCampaignInsights(GetMessageCampaignInsightsRequest request);

    /**
     * <b>description</b> :
     * <p>The China Message Service API has a single-user QPS limit of 10 calls per second. If this limit is exceeded, throttling is triggered, which may affect your business. Adjust your call frequency accordingly.</p>
     * 
     * @param request the request parameters of GetMigrationVerifyCode  GetMigrationVerifyCodeRequest
     * @return GetMigrationVerifyCodeResponse
     */
    CompletableFuture<GetMigrationVerifyCodeResponse> getMigrationVerifyCode(GetMigrationVerifyCodeRequest request);

    /**
     * <b>description</b> :
     * <p>The China Message Service API has a single-user QPS limit of 5 calls per second. If this limit is exceeded, API calls are throttled, which may affect your business. Call this operation at a reasonable frequency.</p>
     * 
     * @param request the request parameters of GetPermissionByCode  GetPermissionByCodeRequest
     * @return GetPermissionByCodeResponse
     */
    CompletableFuture<GetPermissionByCodeResponse> getPermissionByCode(GetPermissionByCodeRequest request);

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
    CompletableFuture<GetPhoneEncryptionPublicKeyResponse> getPhoneEncryptionPublicKey(GetPhoneEncryptionPublicKeyRequest request);

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
    CompletableFuture<GetPhoneNumberVerificationStatusResponse> getPhoneNumberVerificationStatus(GetPhoneNumberVerificationStatusRequest request);

    /**
     * @param request the request parameters of GetPledgeTemplateAddress  GetPledgeTemplateAddressRequest
     * @return GetPledgeTemplateAddressResponse
     */
    CompletableFuture<GetPledgeTemplateAddressResponse> getPledgeTemplateAddress(GetPledgeTemplateAddressRequest request);

    /**
     * <b>description</b> :
     * <p>This API is limited to 10 queries per second (QPS) for each user. If you exceed this limit, API calls are throttled, which can affect your business. Call this API within the specified limit.</p>
     * 
     * @param request the request parameters of GetPreValidatePhoneId  GetPreValidatePhoneIdRequest
     * @return GetPreValidatePhoneIdResponse
     */
    CompletableFuture<GetPreValidatePhoneIdResponse> getPreValidatePhoneId(GetPreValidatePhoneIdRequest request);

    /**
     * @param request the request parameters of GetViberByRequestNo  GetViberByRequestNoRequest
     * @return GetViberByRequestNoResponse
     */
    CompletableFuture<GetViberByRequestNoResponse> getViberByRequestNo(GetViberByRequestNoRequest request);

    /**
     * @param request the request parameters of GetViberPauseTimes  GetViberPauseTimesRequest
     * @return GetViberPauseTimesResponse
     */
    CompletableFuture<GetViberPauseTimesResponse> getViberPauseTimes(GetViberPauseTimesRequest request);

    /**
     * <b>description</b> :
     * <p>This operation allows a maximum of 10 requests per second per account. Excess requests are throttled, which may affect your business. Stay within the specified limit.</p>
     * 
     * @param request the request parameters of GetWhatsappConnectionCatalog  GetWhatsappConnectionCatalogRequest
     * @return GetWhatsappConnectionCatalogResponse
     */
    CompletableFuture<GetWhatsappConnectionCatalogResponse> getWhatsappConnectionCatalog(GetWhatsappConnectionCatalogRequest request);

    /**
     * @param request the request parameters of GetWhatsappConversionApi  GetWhatsappConversionApiRequest
     * @return GetWhatsappConversionApiResponse
     */
    CompletableFuture<GetWhatsappConversionApiResponse> getWhatsappConversionApi(GetWhatsappConversionApiRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#qps-"></a>QPS limit</h3>
     * <p>This operation allows a maximum of 5 requests per second per account. Excess requests are throttled, which may affect your business. Stay within the specified limit.
     * This operation retrieves data directly from Meta. Meta imposes its own rate limits on the total number of calls. Stay within the specified limit.</p>
     * 
     * @param request the request parameters of GetWhatsappHealthStatus  GetWhatsappHealthStatusRequest
     * @return GetWhatsappHealthStatusResponse
     */
    CompletableFuture<GetWhatsappHealthStatusResponse> getWhatsappHealthStatus(GetWhatsappHealthStatusRequest request);

    /**
     * @param request the request parameters of GetWhatsappUserName  GetWhatsappUserNameRequest
     * @return GetWhatsappUserNameResponse
     */
    CompletableFuture<GetWhatsappUserNameResponse> getWhatsappUserName(GetWhatsappUserNameRequest request);

    /**
     * @param request the request parameters of GetWhatsappUserNameSuggestions  GetWhatsappUserNameSuggestionsRequest
     * @return GetWhatsappUserNameSuggestionsResponse
     */
    CompletableFuture<GetWhatsappUserNameSuggestionsResponse> getWhatsappUserNameSuggestions(GetWhatsappUserNameSuggestionsRequest request);

    /**
     * <b>description</b> :
     * <p>The QPS limit for a single user of this API is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Call this API at a reasonable frequency.</p>
     * 
     * @param request the request parameters of IsvGetAppId  IsvGetAppIdRequest
     * @return IsvGetAppIdResponse
     */
    CompletableFuture<IsvGetAppIdResponse> isvGetAppId(IsvGetAppIdRequest request);

    /**
     * @param request the request parameters of ListAllGroups  ListAllGroupsRequest
     * @return ListAllGroupsResponse
     */
    CompletableFuture<ListAllGroupsResponse> listAllGroups(ListAllGroupsRequest request);

    /**
     * @param request the request parameters of ListBindDmAccount  ListBindDmAccountRequest
     * @return ListBindDmAccountResponse
     */
    CompletableFuture<ListBindDmAccountResponse> listBindDmAccount(ListBindDmAccountRequest request);

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
    CompletableFuture<ListBindingRelationsForFlowVersionResponse> listBindingRelationsForFlowVersion(ListBindingRelationsForFlowVersionRequest request);

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
    CompletableFuture<ListChatFlowResponse> listChatFlow(ListChatFlowRequest request);

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
    CompletableFuture<ListChatFlowTemplateResponse> listChatFlowTemplate(ListChatFlowTemplateRequest request);

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
    CompletableFuture<ListChatGroupResponse> listChatGroup(ListChatGroupRequest request);

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
    CompletableFuture<ListChatGroupParticipantsResponse> listChatGroupParticipants(ListChatGroupParticipantsRequest request);

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
    CompletableFuture<ListChatappMessageResponse> listChatappMessage(ListChatappMessageRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The QPS limit for this operation is 5 calls per second per user. If the limit is exceeded, API calls are throttled, which may affect your business. Call this operation at a reasonable rate.</p>
     * 
     * @param request the request parameters of ListChatappTemplate  ListChatappTemplateRequest
     * @return ListChatappTemplateResponse
     */
    CompletableFuture<ListChatappTemplateResponse> listChatappTemplate(ListChatappTemplateRequest request);

    /**
     * @param request the request parameters of ListCustomAudience  ListCustomAudienceRequest
     * @return ListCustomAudienceResponse
     */
    CompletableFuture<ListCustomAudienceResponse> listCustomAudience(ListCustomAudienceRequest request);

    /**
     * @param request the request parameters of ListDmAccount  ListDmAccountRequest
     * @return ListDmAccountResponse
     */
    CompletableFuture<ListDmAccountResponse> listDmAccount(ListDmAccountRequest request);

    /**
     * @param request the request parameters of ListDmTag  ListDmTagRequest
     * @return ListDmTagResponse
     */
    CompletableFuture<ListDmTagResponse> listDmTag(ListDmTagRequest request);

    /**
     * @param request the request parameters of ListFacebookPosts  ListFacebookPostsRequest
     * @return ListFacebookPostsResponse
     */
    CompletableFuture<ListFacebookPostsResponse> listFacebookPosts(ListFacebookPostsRequest request);

    /**
     * <b>description</b> :
     * <p>The China Message Service API has a single-user QPS limit of 5 calls per second. If this limit is exceeded, API calls are throttled, which may affect your business. Call this operation appropriately.</p>
     * 
     * @param request the request parameters of ListFlow  ListFlowRequest
     * @return ListFlowResponse
     */
    CompletableFuture<ListFlowResponse> listFlow(ListFlowRequest request);

    /**
     * @param request the request parameters of ListFlowNodeGroup  ListFlowNodeGroupRequest
     * @return ListFlowNodeGroupResponse
     */
    CompletableFuture<ListFlowNodeGroupResponse> listFlowNodeGroup(ListFlowNodeGroupRequest request);

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
    CompletableFuture<ListFlowNodePrototypeV2Response> listFlowNodePrototypeV2(ListFlowNodePrototypeV2Request request);

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
    CompletableFuture<ListFlowVersionResponse> listFlowVersion(ListFlowVersionRequest request);

    /**
     * @param request the request parameters of ListInstagramPage  ListInstagramPageRequest
     * @return ListInstagramPageResponse
     */
    CompletableFuture<ListInstagramPageResponse> listInstagramPage(ListInstagramPageRequest request);

    /**
     * @param request the request parameters of ListInstagramPosts  ListInstagramPostsRequest
     * @return ListInstagramPostsResponse
     */
    CompletableFuture<ListInstagramPostsResponse> listInstagramPosts(ListInstagramPostsRequest request);

    /**
     * @param request the request parameters of ListInstance  ListInstanceRequest
     * @return ListInstanceResponse
     */
    CompletableFuture<ListInstanceResponse> listInstance(ListInstanceRequest request);

    /**
     * @param request the request parameters of ListMarketingFlow  ListMarketingFlowRequest
     * @return ListMarketingFlowResponse
     */
    CompletableFuture<ListMarketingFlowResponse> listMarketingFlow(ListMarketingFlowRequest request);

    /**
     * @param request the request parameters of ListMessageCampaign  ListMessageCampaignRequest
     * @return ListMessageCampaignResponse
     */
    CompletableFuture<ListMessageCampaignResponse> listMessageCampaign(ListMessageCampaignRequest request);

    /**
     * @param request the request parameters of ListMessengerSubscriptionToken  ListMessengerSubscriptionTokenRequest
     * @return ListMessengerSubscriptionTokenResponse
     */
    CompletableFuture<ListMessengerSubscriptionTokenResponse> listMessengerSubscriptionToken(ListMessengerSubscriptionTokenRequest request);

    /**
     * @param request the request parameters of ListPageAdAccount  ListPageAdAccountRequest
     * @return ListPageAdAccountResponse
     */
    CompletableFuture<ListPageAdAccountResponse> listPageAdAccount(ListPageAdAccountRequest request);

    /**
     * <b>description</b> :
     * <p>The queries per second (QPS) limit for this operation is 5 per user. If this limit is exceeded, the API calls are throttled, which may affect your business. Call this operation as needed.</p>
     * 
     * @param request the request parameters of ListPhoneMessageQrdl  ListPhoneMessageQrdlRequest
     * @return ListPhoneMessageQrdlResponse
     */
    CompletableFuture<ListPhoneMessageQrdlResponse> listPhoneMessageQrdl(ListPhoneMessageQrdlRequest request);

    /**
     * <b>description</b> :
     * <p>This API is limited to 10 queries per second (QPS) for each user. If you exceed this limit, API calls are throttled, which can affect your business. Call this API within the specified limit.</p>
     * 
     * @param request the request parameters of ListProduct  ListProductRequest
     * @return ListProductResponse
     */
    CompletableFuture<ListProductResponse> listProduct(ListProductRequest request);

    /**
     * <b>description</b> :
     * <p>The queries per second (QPS) limit per user is 10. If this limit is exceeded, API calls are throttled, which may affect your services. Call this API at a reasonable frequency.</p>
     * 
     * @param request the request parameters of ListProductCatalog  ListProductCatalogRequest
     * @return ListProductCatalogResponse
     */
    CompletableFuture<ListProductCatalogResponse> listProductCatalog(ListProductCatalogRequest request);

    /**
     * @param request the request parameters of ListViberServiceMessage  ListViberServiceMessageRequest
     * @return ListViberServiceMessageResponse
     */
    CompletableFuture<ListViberServiceMessageResponse> listViberServiceMessage(ListViberServiceMessageRequest request);

    /**
     * @param request the request parameters of ListWhatAppTemplate  ListWhatAppTemplateRequest
     * @return ListWhatAppTemplateResponse
     */
    CompletableFuture<ListWhatAppTemplateResponse> listWhatAppTemplate(ListWhatAppTemplateRequest request);

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
    CompletableFuture<ModifyChatappTemplateResponse> modifyChatappTemplate(ModifyChatappTemplateRequest request);

    /**
     * @param request the request parameters of ModifyChatappTemplateProperties  ModifyChatappTemplatePropertiesRequest
     * @return ModifyChatappTemplatePropertiesResponse
     */
    CompletableFuture<ModifyChatappTemplatePropertiesResponse> modifyChatappTemplateProperties(ModifyChatappTemplatePropertiesRequest request);

    /**
     * <b>description</b> :
     * <p>The China Short Message Service (China SMS) API has a single-user QPS limit of 5 calls per second. If this limit is exceeded, the API calls are throttled, which may affect your business. Call this operation appropriately.</p>
     * 
     * @param request the request parameters of ModifyFlow  ModifyFlowRequest
     * @return ModifyFlowResponse
     */
    CompletableFuture<ModifyFlowResponse> modifyFlow(ModifyFlowRequest request);

    /**
     * <b>description</b> :
     * <p>The China Message Service (China) API has a single-user QPS limit of 10 calls per second. If this limit is exceeded, throttling is triggered, which may affect your business. Manage your calls appropriately.</p>
     * 
     * @param request the request parameters of ModifyPhoneBusinessProfile  ModifyPhoneBusinessProfileRequest
     * @return ModifyPhoneBusinessProfileResponse
     */
    CompletableFuture<ModifyPhoneBusinessProfileResponse> modifyPhoneBusinessProfile(ModifyPhoneBusinessProfileRequest request);

    /**
     * @param request the request parameters of MoveContactToGroup  MoveContactToGroupRequest
     * @return MoveContactToGroupResponse
     */
    CompletableFuture<MoveContactToGroupResponse> moveContactToGroup(MoveContactToGroupRequest request);

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
    CompletableFuture<OfflineFlowVersionResponse> offlineFlowVersion(OfflineFlowVersionRequest request);

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
    CompletableFuture<OnlineFlowVersionResponse> onlineFlowVersion(OnlineFlowVersionRequest request);

    /**
     * @param request the request parameters of OpenChatappService  OpenChatappServiceRequest
     * @return OpenChatappServiceResponse
     */
    CompletableFuture<OpenChatappServiceResponse> openChatappService(OpenChatappServiceRequest request);

    /**
     * @param request the request parameters of PauseMarketingFLow  PauseMarketingFLowRequest
     * @return PauseMarketingFLowResponse
     */
    CompletableFuture<PauseMarketingFLowResponse> pauseMarketingFLow(PauseMarketingFLowRequest request);

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
    CompletableFuture<PublishFlowResponse> publishFlow(PublishFlowRequest request);

    /**
     * <b>description</b> :
     * <p>The single-user QPS limit for this operation is 10 calls per second. If the limit is exceeded, API calls are throttled. This may affect your business. Call this operation at a reasonable rate.</p>
     * 
     * @param request the request parameters of QueryChatappBindWaba  QueryChatappBindWabaRequest
     * @return QueryChatappBindWabaResponse
     */
    CompletableFuture<QueryChatappBindWabaResponse> queryChatappBindWaba(QueryChatappBindWabaRequest request);

    /**
     * <b>description</b> :
     * <p>The throttling limit for this operation is 10 calls per second per user. If the limit is exceeded, API calls are throttled, which may affect your business. Call this operation at a reasonable rate.</p>
     * 
     * @param request the request parameters of QueryChatappPhoneNumbers  QueryChatappPhoneNumbersRequest
     * @return QueryChatappPhoneNumbersResponse
     */
    CompletableFuture<QueryChatappPhoneNumbersResponse> queryChatappPhoneNumbers(QueryChatappPhoneNumbersRequest request);

    /**
     * @param request the request parameters of QueryInstance  QueryInstanceRequest
     * @return QueryInstanceResponse
     */
    CompletableFuture<QueryInstanceResponse> queryInstance(QueryInstanceRequest request);

    /**
     * @param request the request parameters of QueryMMLActive  QueryMMLActiveRequest
     * @return QueryMMLActiveResponse
     */
    CompletableFuture<QueryMMLActiveResponse> queryMMLActive(QueryMMLActiveRequest request);

    /**
     * <b>description</b> :
     * <p>The queries per second (QPS) limit per user is 10. If this limit is exceeded, API calls are throttled, which may affect your services. Make API calls at a reasonable rate.</p>
     * 
     * @param request the request parameters of QueryPhoneBusinessProfile  QueryPhoneBusinessProfileRequest
     * @return QueryPhoneBusinessProfileResponse
     */
    CompletableFuture<QueryPhoneBusinessProfileResponse> queryPhoneBusinessProfile(QueryPhoneBusinessProfileRequest request);

    /**
     * <b>description</b> :
     * <p>This operation allows a maximum of 10 requests per second per account. Excess requests are throttled, which may affect your business. Stay within the specified limit.</p>
     * 
     * @param request the request parameters of QueryWabaBusinessInfo  QueryWabaBusinessInfoRequest
     * @return QueryWabaBusinessInfoResponse
     */
    CompletableFuture<QueryWabaBusinessInfoResponse> queryWabaBusinessInfo(QueryWabaBusinessInfoRequest request);

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
    CompletableFuture<ReadChatFlowResponse> readChatFlow(ReadChatFlowRequest request);

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
    CompletableFuture<ReadChatFlowLogSettingResponse> readChatFlowLogSetting(ReadChatFlowLogSettingRequest request);

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
    CompletableFuture<ReadFlowVersionResponse> readFlowVersion(ReadFlowVersionRequest request);

    /**
     * @param request the request parameters of RemoveContactById  RemoveContactByIdRequest
     * @return RemoveContactByIdResponse
     */
    CompletableFuture<RemoveContactByIdResponse> removeContactById(RemoveContactByIdRequest request);

    /**
     * <b>description</b> :
     * <p>The China-specific QPS limit for a single user of this API operation is 100 calls per second. If this limit is exceeded, API calls are throttled, which may affect your business. Call this operation as needed.</p>
     * 
     * @param request the request parameters of RequestWhatsappConversionApi  RequestWhatsappConversionApiRequest
     * @return RequestWhatsappConversionApiResponse
     */
    CompletableFuture<RequestWhatsappConversionApiResponse> requestWhatsappConversionApi(RequestWhatsappConversionApiRequest request);

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
    CompletableFuture<SendChatappMassMessageResponse> sendChatappMassMessage(SendChatappMassMessageRequest request);

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
    CompletableFuture<SendChatappMessageResponse> sendChatappMessage(SendChatappMessageRequest request);

    /**
     * @param request the request parameters of SubmitVerifyCodeResult  SubmitVerifyCodeResultRequest
     * @return SubmitVerifyCodeResultResponse
     */
    CompletableFuture<SubmitVerifyCodeResultResponse> submitVerifyCodeResult(SubmitVerifyCodeResultRequest request);

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
    CompletableFuture<SyncBusinessAppHistoryResponse> syncBusinessAppHistory(SyncBusinessAppHistoryRequest request);

    /**
     * @param request the request parameters of SyncFlow  SyncFlowRequest
     * @return SyncFlowResponse
     */
    CompletableFuture<SyncFlowResponse> syncFlow(SyncFlowRequest request);

    /**
     * @param request the request parameters of SyncMessageCampaign  SyncMessageCampaignRequest
     * @return SyncMessageCampaignResponse
     */
    CompletableFuture<SyncMessageCampaignResponse> syncMessageCampaign(SyncMessageCampaignRequest request);

    /**
     * @param request the request parameters of SyncMessengerSubscriptionToken  SyncMessengerSubscriptionTokenRequest
     * @return SyncMessengerSubscriptionTokenResponse
     */
    CompletableFuture<SyncMessengerSubscriptionTokenResponse> syncMessengerSubscriptionToken(SyncMessengerSubscriptionTokenRequest request);

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
    CompletableFuture<TriggerChatFlowResponse> triggerChatFlow(TriggerChatFlowRequest request);

    /**
     * @param request the request parameters of UnbindDmAccount  UnbindDmAccountRequest
     * @return UnbindDmAccountResponse
     */
    CompletableFuture<UnbindDmAccountResponse> unbindDmAccount(UnbindDmAccountRequest request);

    /**
     * <b>description</b> :
     * <p>This operation allows a maximum of 10 requests per second per account. Excess requests are throttled, which may affect your business. Stay within the specified limit.</p>
     * 
     * @param request the request parameters of UpdateAccountWebhook  UpdateAccountWebhookRequest
     * @return UpdateAccountWebhookResponse
     */
    CompletableFuture<UpdateAccountWebhookResponse> updateAccountWebhook(UpdateAccountWebhookRequest request);

    /**
     * @param request the request parameters of UpdateAuditRequest  UpdateAuditRequestRequest
     * @return UpdateAuditRequestResponse
     */
    CompletableFuture<UpdateAuditRequestResponse> updateAuditRequest(UpdateAuditRequestRequest request);

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
    CompletableFuture<UpdateChatFlowResponse> updateChatFlow(UpdateChatFlowRequest request);

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
    CompletableFuture<UpdateChatFlowLogSettingResponse> updateChatFlowLogSetting(UpdateChatFlowLogSettingRequest request);

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
    CompletableFuture<UpdateChatGroupResponse> updateChatGroup(UpdateChatGroupRequest request);

    /**
     * <b>description</b> :
     * <p>This API is limited to 10 queries per second (QPS) for each user. If you exceed this limit, API calls are throttled, which can affect your business. Call this API within the specified limit.</p>
     * 
     * @param request the request parameters of UpdateCommerceSetting  UpdateCommerceSettingRequest
     * @return UpdateCommerceSettingResponse
     */
    CompletableFuture<UpdateCommerceSettingResponse> updateCommerceSetting(UpdateCommerceSettingRequest request);

    /**
     * @param request the request parameters of UpdateContactById  UpdateContactByIdRequest
     * @return UpdateContactByIdResponse
     */
    CompletableFuture<UpdateContactByIdResponse> updateContactById(UpdateContactByIdRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The single-user QPS limit for this API is 5 calls per second. If this limit is exceeded, the API calls are throttled, which may affect your business. Call this API appropriately.
     * This API directly retrieves data from Facebook. Facebook imposes a limit on the total number of API calls. Use this API appropriately.</p>
     * 
     * @param request the request parameters of UpdateConversationalAutomation  UpdateConversationalAutomationRequest
     * @return UpdateConversationalAutomationResponse
     */
    CompletableFuture<UpdateConversationalAutomationResponse> updateConversationalAutomation(UpdateConversationalAutomationRequest request);

    /**
     * <b>description</b> :
     * <p>The queries per second (QPS) limit per user is 5. If the number of API calls exceeds this limit, throttling is triggered, which may affect your business. Make API calls at a reasonable rate.</p>
     * 
     * @param request the request parameters of UpdateFlowJSONAsset  UpdateFlowJSONAssetRequest
     * @return UpdateFlowJSONAssetResponse
     */
    CompletableFuture<UpdateFlowJSONAssetResponse> updateFlowJSONAsset(UpdateFlowJSONAssetRequest request);

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
    CompletableFuture<UpdateFlowVersionResponse> updateFlowVersion(UpdateFlowVersionRequest request);

    /**
     * @param request the request parameters of UpdateGroupName  UpdateGroupNameRequest
     * @return UpdateGroupNameResponse
     */
    CompletableFuture<UpdateGroupNameResponse> updateGroupName(UpdateGroupNameRequest request);

    /**
     * @param request the request parameters of UpdateInstance  UpdateInstanceRequest
     * @return UpdateInstanceResponse
     */
    CompletableFuture<UpdateInstanceResponse> updateInstance(UpdateInstanceRequest request);

    /**
     * @param request the request parameters of UpdateMarketingFLow  UpdateMarketingFLowRequest
     * @return UpdateMarketingFLowResponse
     */
    CompletableFuture<UpdateMarketingFLowResponse> updateMarketingFLow(UpdateMarketingFLowRequest request);

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
    CompletableFuture<UpdatePhoneEncryptionPublicKeyResponse> updatePhoneEncryptionPublicKey(UpdatePhoneEncryptionPublicKeyRequest request);

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
    CompletableFuture<UpdatePhoneMessageQrdlResponse> updatePhoneMessageQrdl(UpdatePhoneMessageQrdlRequest request);

    /**
     * <b>description</b> :
     * <p>The queries per second (QPS) limit per user is 10. If this limit is exceeded, API calls are throttled, which may affect your business. Make API calls at a reasonable frequency.</p>
     * 
     * @param request the request parameters of UpdatePhoneWebhook  UpdatePhoneWebhookRequest
     * @return UpdatePhoneWebhookResponse
     */
    CompletableFuture<UpdatePhoneWebhookResponse> updatePhoneWebhook(UpdatePhoneWebhookRequest request);

    /**
     * @param request the request parameters of UpdateWabaMmlStatus  UpdateWabaMmlStatusRequest
     * @return UpdateWabaMmlStatusResponse
     */
    CompletableFuture<UpdateWabaMmlStatusResponse> updateWabaMmlStatus(UpdateWabaMmlStatusRequest request);

    /**
     * @param request the request parameters of UpdateWhatsappUserName  UpdateWhatsappUserNameRequest
     * @return UpdateWhatsappUserNameResponse
     */
    CompletableFuture<UpdateWhatsappUserNameResponse> updateWhatsappUserName(UpdateWhatsappUserNameRequest request);

    /**
     * @param request the request parameters of WhatsappCall  WhatsappCallRequest
     * @return WhatsappCallResponse
     */
    CompletableFuture<WhatsappCallResponse> whatsappCall(WhatsappCallRequest request);

}
