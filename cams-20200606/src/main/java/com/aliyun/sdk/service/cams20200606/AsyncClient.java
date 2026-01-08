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
     * @param request the request parameters of AddChatGroup  AddChatGroupRequest
     * @return AddChatGroupResponse
     */
    CompletableFuture<AddChatGroupResponse> addChatGroup(AddChatGroupRequest request);

    /**
     * @param request the request parameters of AddChatGroupInviteLink  AddChatGroupInviteLinkRequest
     * @return AddChatGroupInviteLinkResponse
     */
    CompletableFuture<AddChatGroupInviteLinkResponse> addChatGroupInviteLink(AddChatGroupInviteLinkRequest request);

    /**
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
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ChatappBindWaba  ChatappBindWabaRequest
     * @return ChatappBindWabaResponse
     */
    CompletableFuture<ChatappBindWabaResponse> chatappBindWaba(ChatappBindWabaRequest request);

    /**
     * <b>description</b> :
     * <p>The space ID of the RAM user within the independent software vendor (ISV) account.</p>
     * 
     * @param request the request parameters of ChatappMigrationRegister  ChatappMigrationRegisterRequest
     * @return ChatappMigrationRegisterResponse
     */
    CompletableFuture<ChatappMigrationRegisterResponse> chatappMigrationRegister(ChatappMigrationRegisterRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ChatappMigrationVerified  ChatappMigrationVerifiedRequest
     * @return ChatappMigrationVerifiedResponse
     */
    CompletableFuture<ChatappMigrationVerifiedResponse> chatappMigrationVerified(ChatappMigrationVerifiedRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ChatappPhoneNumberDeregister  ChatappPhoneNumberDeregisterRequest
     * @return ChatappPhoneNumberDeregisterResponse
     */
    CompletableFuture<ChatappPhoneNumberDeregisterResponse> chatappPhoneNumberDeregister(ChatappPhoneNumberDeregisterRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ChatappPhoneNumberRegister  ChatappPhoneNumberRegisterRequest
     * @return ChatappPhoneNumberRegisterResponse
     */
    CompletableFuture<ChatappPhoneNumberRegisterResponse> chatappPhoneNumberRegister(ChatappPhoneNumberRegisterRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ChatappSyncPhoneNumber  ChatappSyncPhoneNumberRequest
     * @return ChatappSyncPhoneNumberResponse
     */
    CompletableFuture<ChatappSyncPhoneNumberResponse> chatappSyncPhoneNumber(ChatappSyncPhoneNumberRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ChatappVerifyAndRegister  ChatappVerifyAndRegisterRequest
     * @return ChatappVerifyAndRegisterResponse
     */
    CompletableFuture<ChatappVerifyAndRegisterResponse> chatappVerifyAndRegister(ChatappVerifyAndRegisterRequest request);

    /**
     * @param request the request parameters of CopyTemplate  CopyTemplateRequest
     * @return CopyTemplateResponse
     */
    CompletableFuture<CopyTemplateResponse> copyTemplate(CopyTemplateRequest request);

    /**
     * @param request the request parameters of CreateChatFlow  CreateChatFlowRequest
     * @return CreateChatFlowResponse
     */
    CompletableFuture<CreateChatFlowResponse> createChatFlow(CreateChatFlowRequest request);

    /**
     * @param request the request parameters of CreateChatFlowByImport  CreateChatFlowByImportRequest
     * @return CreateChatFlowByImportResponse
     */
    CompletableFuture<CreateChatFlowByImportResponse> createChatFlowByImport(CreateChatFlowByImportRequest request);

    /**
     * @param request the request parameters of CreateChatFlowLogSetting  CreateChatFlowLogSettingRequest
     * @return CreateChatFlowLogSettingResponse
     */
    CompletableFuture<CreateChatFlowLogSettingResponse> createChatFlowLogSetting(CreateChatFlowLogSettingRequest request);

    /**
     * <b>description</b> :
     * <p>The status of the phone number.</p>
     * 
     * @param request the request parameters of CreateChatappMigrationInitiate  CreateChatappMigrationInitiateRequest
     * @return CreateChatappMigrationInitiateResponse
     */
    CompletableFuture<CreateChatappMigrationInitiateResponse> createChatappMigrationInitiate(CreateChatappMigrationInitiateRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#qps-"></a>QPS limit</h3>
     * <p>You can call this operation up to 50 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
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
     * <p>You can call this operation up to five times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of CreateFlow  CreateFlowRequest
     * @return CreateFlowResponse
     */
    CompletableFuture<CreateFlowResponse> createFlow(CreateFlowRequest request);

    /**
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
     * @param request the request parameters of DeleteChatFlow  DeleteChatFlowRequest
     * @return DeleteChatFlowResponse
     */
    CompletableFuture<DeleteChatFlowResponse> deleteChatFlow(DeleteChatFlowRequest request);

    /**
     * @param request the request parameters of DeleteChatGroup  DeleteChatGroupRequest
     * @return DeleteChatGroupResponse
     */
    CompletableFuture<DeleteChatGroupResponse> deleteChatGroup(DeleteChatGroupRequest request);

    /**
     * @param request the request parameters of DeleteChatGroupInviteLink  DeleteChatGroupInviteLinkRequest
     * @return DeleteChatGroupInviteLinkResponse
     */
    CompletableFuture<DeleteChatGroupInviteLinkResponse> deleteChatGroupInviteLink(DeleteChatGroupInviteLinkRequest request);

    /**
     * @param request the request parameters of DeleteChatGroupParticipants  DeleteChatGroupParticipantsRequest
     * @return DeleteChatGroupParticipantsResponse
     */
    CompletableFuture<DeleteChatGroupParticipantsResponse> deleteChatGroupParticipants(DeleteChatGroupParticipantsRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to five times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
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
     * <p>You can call this operation up to five times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteFlow  DeleteFlowRequest
     * @return DeleteFlowResponse
     */
    CompletableFuture<DeleteFlowResponse> deleteFlow(DeleteFlowRequest request);

    /**
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
     * @param request the request parameters of DeletePhoneMessageQrdl  DeletePhoneMessageQrdlRequest
     * @return DeletePhoneMessageQrdlResponse
     */
    CompletableFuture<DeletePhoneMessageQrdlResponse> deletePhoneMessageQrdl(DeletePhoneMessageQrdlRequest request);

    /**
     * @param request the request parameters of DeprecateFlow  DeprecateFlowRequest
     * @return DeprecateFlowResponse
     */
    CompletableFuture<DeprecateFlowResponse> deprecateFlow(DeprecateFlowRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to five times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of EnableWhatsappROIMetric  EnableWhatsappROIMetricRequest
     * @return EnableWhatsappROIMetricResponse
     */
    CompletableFuture<EnableWhatsappROIMetricResponse> enableWhatsappROIMetric(EnableWhatsappROIMetricRequest request);

    /**
     * @param request the request parameters of FlowBindPhone  FlowBindPhoneRequest
     * @return FlowBindPhoneResponse
     */
    CompletableFuture<FlowBindPhoneResponse> flowBindPhone(FlowBindPhoneRequest request);

    /**
     * @param request the request parameters of FlowRebindPhone  FlowRebindPhoneRequest
     * @return FlowRebindPhoneResponse
     */
    CompletableFuture<FlowRebindPhoneResponse> flowRebindPhone(FlowRebindPhoneRequest request);

    /**
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
     * @param request the request parameters of GetChatFlowMetric  GetChatFlowMetricRequest
     * @return GetChatFlowMetricResponse
     */
    CompletableFuture<GetChatFlowMetricResponse> getChatFlowMetric(GetChatFlowMetricRequest request);

    /**
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
     * <p>You can call this operation up to 50 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
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
     * <p>You can call this API operation up to five times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of GetChatappTemplateDetail  GetChatappTemplateDetailRequest
     * @return GetChatappTemplateDetailResponse
     */
    CompletableFuture<GetChatappTemplateDetailResponse> getChatappTemplateDetail(GetChatappTemplateDetailRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 50 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of GetChatappTemplateMetric  GetChatappTemplateMetricRequest
     * @return GetChatappTemplateMetricResponse
     */
    CompletableFuture<GetChatappTemplateMetricResponse> getChatappTemplateMetric(GetChatappTemplateMetricRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to five times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of GetChatappUploadAuthorization  GetChatappUploadAuthorizationRequest
     * @return GetChatappUploadAuthorizationResponse
     */
    CompletableFuture<GetChatappUploadAuthorizationResponse> getChatappUploadAuthorization(GetChatappUploadAuthorizationRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of GetChatappVerifyCode  GetChatappVerifyCodeRequest
     * @return GetChatappVerifyCodeResponse
     */
    CompletableFuture<GetChatappVerifyCodeResponse> getChatappVerifyCode(GetChatappVerifyCodeRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of GetCommerceSetting  GetCommerceSettingRequest
     * @return GetCommerceSettingResponse
     */
    CompletableFuture<GetCommerceSettingResponse> getCommerceSetting(GetCommerceSettingRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#qps-"></a>QPS limit</h3>
     * <p>You can call this operation up to five times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     * This operation will directly obtain data from Facebook, which sets an upper limit on the total number of calls for operations. We recommend that you take note of the limit when you call this operation.</p>
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
     * <p>You can call this operation up to five times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of GetFlow  GetFlowRequest
     * @return GetFlowResponse
     */
    CompletableFuture<GetFlowResponse> getFlow(GetFlowRequest request);

    /**
     * @param request the request parameters of GetFlowJSONAssest  GetFlowJSONAssestRequest
     * @return GetFlowJSONAssestResponse
     */
    CompletableFuture<GetFlowJSONAssestResponse> getFlowJSONAssest(GetFlowJSONAssestRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to five times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
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
     * <p>The single user QPS limit for this interface is 10 times per second. Exceeding the limit may result in restricted API calls, which may affect your business. Please make reasonable calls.</p>
     * 
     * @param request the request parameters of GetMigrationVerifyCode  GetMigrationVerifyCodeRequest
     * @return GetMigrationVerifyCodeResponse
     */
    CompletableFuture<GetMigrationVerifyCodeResponse> getMigrationVerifyCode(GetMigrationVerifyCodeRequest request);

    /**
     * @param request the request parameters of GetPermissionByCode  GetPermissionByCodeRequest
     * @return GetPermissionByCodeResponse
     */
    CompletableFuture<GetPermissionByCodeResponse> getPermissionByCode(GetPermissionByCodeRequest request);

    /**
     * @param request the request parameters of GetPhoneEncryptionPublicKey  GetPhoneEncryptionPublicKeyRequest
     * @return GetPhoneEncryptionPublicKeyResponse
     */
    CompletableFuture<GetPhoneEncryptionPublicKeyResponse> getPhoneEncryptionPublicKey(GetPhoneEncryptionPublicKeyRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
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
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
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
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
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
     * <p>You can call this operation up to five times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     * This operation will directly obtain data from Facebook, which sets an upper limit on the total number of calls for operations. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of GetWhatsappHealthStatus  GetWhatsappHealthStatusRequest
     * @return GetWhatsappHealthStatusResponse
     */
    CompletableFuture<GetWhatsappHealthStatusResponse> getWhatsappHealthStatus(GetWhatsappHealthStatusRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
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
     * <li>You can call this interface to query the list of phone numbers or merchant account IDs bound to a process, or you can view the list in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder"><strong>Flow Editor</strong></a> &gt; <strong>Settings</strong> interface.</li>
     * <li>Before calling this interface, make sure that the process you created has already been bound to a phone number or merchant account ID.</li>
     * <li>If the process you created is not bound to a phone number or merchant account ID, you can manually bind a phone number or merchant account ID in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder"><strong>Flow Editor</strong></a> &gt; <strong>Settings</strong> interface, or bind it through the <a href="https://help.aliyun.com/document_detail/2937190.html">FlowBindPhone</a> interface.</li>
     * </ul>
     * 
     * @param request the request parameters of ListBindingRelationsForFlowVersion  ListBindingRelationsForFlowVersionRequest
     * @return ListBindingRelationsForFlowVersionResponse
     */
    CompletableFuture<ListBindingRelationsForFlowVersionResponse> listBindingRelationsForFlowVersion(ListBindingRelationsForFlowVersionRequest request);

    /**
     * @param request the request parameters of ListChatFlow  ListChatFlowRequest
     * @return ListChatFlowResponse
     */
    CompletableFuture<ListChatFlowResponse> listChatFlow(ListChatFlowRequest request);

    /**
     * @param request the request parameters of ListChatFlowTemplate  ListChatFlowTemplateRequest
     * @return ListChatFlowTemplateResponse
     */
    CompletableFuture<ListChatFlowTemplateResponse> listChatFlowTemplate(ListChatFlowTemplateRequest request);

    /**
     * @param request the request parameters of ListChatGroup  ListChatGroupRequest
     * @return ListChatGroupResponse
     */
    CompletableFuture<ListChatGroupResponse> listChatGroup(ListChatGroupRequest request);

    /**
     * @param request the request parameters of ListChatGroupParticipants  ListChatGroupParticipantsRequest
     * @return ListChatGroupParticipantsResponse
     */
    CompletableFuture<ListChatGroupParticipantsResponse> listChatGroupParticipants(ListChatGroupParticipantsRequest request);

    /**
     * @param request the request parameters of ListChatappMessage  ListChatappMessageRequest
     * @return ListChatappMessageResponse
     */
    CompletableFuture<ListChatappMessageResponse> listChatappMessage(ListChatappMessageRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to five times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
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
     * <p>You can call this operation up to five times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
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
     * @param request the request parameters of ListFlowNodePrototypeV2  ListFlowNodePrototypeV2Request
     * @return ListFlowNodePrototypeV2Response
     */
    CompletableFuture<ListFlowNodePrototypeV2Response> listFlowNodePrototypeV2(ListFlowNodePrototypeV2Request request);

    /**
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
     * @param request the request parameters of ListPhoneMessageQrdl  ListPhoneMessageQrdlRequest
     * @return ListPhoneMessageQrdlResponse
     */
    CompletableFuture<ListPhoneMessageQrdlResponse> listPhoneMessageQrdl(ListPhoneMessageQrdlRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ListProduct  ListProductRequest
     * @return ListProductResponse
     */
    CompletableFuture<ListProductResponse> listProduct(ListProductRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
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
     * <b>description</b> :
     * <p>The name of the message template.</p>
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
     * <p>You can call this operation up to five times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ModifyFlow  ModifyFlowRequest
     * @return ModifyFlowResponse
     */
    CompletableFuture<ModifyFlowResponse> modifyFlow(ModifyFlowRequest request);

    /**
     * <b>description</b> :
     * <p>ModifyPhoneBusinessProfile</p>
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
     * @param request the request parameters of OfflineFlowVersion  OfflineFlowVersionRequest
     * @return OfflineFlowVersionResponse
     */
    CompletableFuture<OfflineFlowVersionResponse> offlineFlowVersion(OfflineFlowVersionRequest request);

    /**
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
     * <p>You can call this operation up to five times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of PublishFlow  PublishFlowRequest
     * @return PublishFlowResponse
     */
    CompletableFuture<PublishFlowResponse> publishFlow(PublishFlowRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of QueryChatappBindWaba  QueryChatappBindWabaRequest
     * @return QueryChatappBindWabaResponse
     */
    CompletableFuture<QueryChatappBindWabaResponse> queryChatappBindWaba(QueryChatappBindWabaRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
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
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of QueryPhoneBusinessProfile  QueryPhoneBusinessProfileRequest
     * @return QueryPhoneBusinessProfileResponse
     */
    CompletableFuture<QueryPhoneBusinessProfileResponse> queryPhoneBusinessProfile(QueryPhoneBusinessProfileRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of QueryWabaBusinessInfo  QueryWabaBusinessInfoRequest
     * @return QueryWabaBusinessInfoResponse
     */
    CompletableFuture<QueryWabaBusinessInfoResponse> queryWabaBusinessInfo(QueryWabaBusinessInfoRequest request);

    /**
     * @param request the request parameters of ReadChatFlow  ReadChatFlowRequest
     * @return ReadChatFlowResponse
     */
    CompletableFuture<ReadChatFlowResponse> readChatFlow(ReadChatFlowRequest request);

    /**
     * @param request the request parameters of ReadChatFlowLogSetting  ReadChatFlowLogSettingRequest
     * @return ReadChatFlowLogSettingResponse
     */
    CompletableFuture<ReadChatFlowLogSettingResponse> readChatFlowLogSetting(ReadChatFlowLogSettingRequest request);

    /**
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
     * @param request the request parameters of RequestWhatsappConversionApi  RequestWhatsappConversionApiRequest
     * @return RequestWhatsappConversionApiResponse
     */
    CompletableFuture<RequestWhatsappConversionApiResponse> requestWhatsappConversionApi(RequestWhatsappConversionApiRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     * You can send messages to up to 1,000 phone numbers in a single request.</p>
     * 
     * @param request the request parameters of SendChatappMassMessage  SendChatappMassMessageRequest
     * @return SendChatappMassMessageResponse
     */
    CompletableFuture<SendChatappMassMessageResponse> sendChatappMassMessage(SendChatappMassMessageRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 200 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of SendChatappMessage  SendChatappMessageRequest
     * @return SendChatappMessageResponse
     */
    CompletableFuture<SendChatappMessageResponse> sendChatappMessage(SendChatappMessageRequest request);

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
     * <p>After triggering an online flow, if your flow contains components that incur costs for cloud products, such as message sending or function calls, please ensure you fully understand the billing methods and prices of the related products before using this interface.</p>
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
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
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
     * @param request the request parameters of UpdateChatFlow  UpdateChatFlowRequest
     * @return UpdateChatFlowResponse
     */
    CompletableFuture<UpdateChatFlowResponse> updateChatFlow(UpdateChatFlowRequest request);

    /**
     * @param request the request parameters of UpdateChatFlowLogSetting  UpdateChatFlowLogSettingRequest
     * @return UpdateChatFlowLogSettingResponse
     */
    CompletableFuture<UpdateChatFlowLogSettingResponse> updateChatFlowLogSetting(UpdateChatFlowLogSettingRequest request);

    /**
     * @param request the request parameters of UpdateChatGroup  UpdateChatGroupRequest
     * @return UpdateChatGroupResponse
     */
    CompletableFuture<UpdateChatGroupResponse> updateChatGroup(UpdateChatGroupRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
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
     * <h3><a href="#qps-"></a>QPS limit</h3>
     * <p>You can call this operation up to five times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     * This operation will directly obtain data from Facebook, which sets an upper limit on the total number of calls for operations. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of UpdateConversationalAutomation  UpdateConversationalAutomationRequest
     * @return UpdateConversationalAutomationResponse
     */
    CompletableFuture<UpdateConversationalAutomationResponse> updateConversationalAutomation(UpdateConversationalAutomationRequest request);

    /**
     * @param request the request parameters of UpdateFlowJSONAsset  UpdateFlowJSONAssetRequest
     * @return UpdateFlowJSONAssetResponse
     */
    CompletableFuture<UpdateFlowJSONAssetResponse> updateFlowJSONAsset(UpdateFlowJSONAssetRequest request);

    /**
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
     * @param request the request parameters of UpdatePhoneEncryptionPublicKey  UpdatePhoneEncryptionPublicKeyRequest
     * @return UpdatePhoneEncryptionPublicKeyResponse
     */
    CompletableFuture<UpdatePhoneEncryptionPublicKeyResponse> updatePhoneEncryptionPublicKey(UpdatePhoneEncryptionPublicKeyRequest request);

    /**
     * @param request the request parameters of UpdatePhoneMessageQrdl  UpdatePhoneMessageQrdlRequest
     * @return UpdatePhoneMessageQrdlResponse
     */
    CompletableFuture<UpdatePhoneMessageQrdlResponse> updatePhoneMessageQrdl(UpdatePhoneMessageQrdlRequest request);

    /**
     * <b>description</b> :
     * <p>The error message returned.</p>
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

}
