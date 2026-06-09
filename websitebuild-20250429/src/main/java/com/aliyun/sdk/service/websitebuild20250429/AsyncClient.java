// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.websitebuild20250429.models.*;
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
     * @param request the request parameters of AllocateSupabaseForAdmin  AllocateSupabaseForAdminRequest
     * @return AllocateSupabaseForAdminResponse
     */
    CompletableFuture<AllocateSupabaseForAdminResponse> allocateSupabaseForAdmin(AllocateSupabaseForAdminRequest request);

    /**
     * @param request the request parameters of BatchCheckResourceMeasure  BatchCheckResourceMeasureRequest
     * @return BatchCheckResourceMeasureResponse
     */
    CompletableFuture<BatchCheckResourceMeasureResponse> batchCheckResourceMeasure(BatchCheckResourceMeasureRequest request);

    /**
     * @param request the request parameters of BindAppDomain  BindAppDomainRequest
     * @return BindAppDomainResponse
     */
    CompletableFuture<BindAppDomainResponse> bindAppDomain(BindAppDomainRequest request);

    /**
     * @param request the request parameters of CheckResourceMeasure  CheckResourceMeasureRequest
     * @return CheckResourceMeasureResponse
     */
    CompletableFuture<CheckResourceMeasureResponse> checkResourceMeasure(CheckResourceMeasureRequest request);

    /**
     * @param request the request parameters of CheckUserResourceMeasure  CheckUserResourceMeasureRequest
     * @return CheckUserResourceMeasureResponse
     */
    CompletableFuture<CheckUserResourceMeasureResponse> checkUserResourceMeasure(CheckUserResourceMeasureRequest request);

    /**
     * @param request the request parameters of ConfirmAppInstance  ConfirmAppInstanceRequest
     * @return ConfirmAppInstanceResponse
     */
    CompletableFuture<ConfirmAppInstanceResponse> confirmAppInstance(ConfirmAppInstanceRequest request);

    /**
     * @param request the request parameters of CopyAppPluginConfig  CopyAppPluginConfigRequest
     * @return CopyAppPluginConfigResponse
     */
    CompletableFuture<CopyAppPluginConfigResponse> copyAppPluginConfig(CopyAppPluginConfigRequest request);

    /**
     * @param request the request parameters of CreateAIStaffChat  CreateAIStaffChatRequest
     * @return CreateAIStaffChatResponse
     */
    CompletableFuture<CreateAIStaffChatResponse> createAIStaffChat(CreateAIStaffChatRequest request);

    /**
     * @param request the request parameters of CreateAIStaffConversation  CreateAIStaffConversationRequest
     * @return CreateAIStaffConversationResponse
     */
    CompletableFuture<CreateAIStaffConversationResponse> createAIStaffConversation(CreateAIStaffConversationRequest request);

    /**
     * @param request the request parameters of CreateAppAssistantAgent  CreateAppAssistantAgentRequest
     * @return CreateAppAssistantAgentResponse
     */
    CompletableFuture<CreateAppAssistantAgentResponse> createAppAssistantAgent(CreateAppAssistantAgentRequest request);

    /**
     * @param request the request parameters of CreateAppAssistantAgentSsoLogin  CreateAppAssistantAgentSsoLoginRequest
     * @return CreateAppAssistantAgentSsoLoginResponse
     */
    CompletableFuture<CreateAppAssistantAgentSsoLoginResponse> createAppAssistantAgentSsoLogin(CreateAppAssistantAgentSsoLoginRequest request);

    /**
     * @param request the request parameters of CreateAppChat  CreateAppChatRequest
     * @return CreateAppChatResponse
     */
    CompletableFuture<CreateAppChatResponse> createAppChat(CreateAppChatRequest request);

    ResponseIterable<String> createAppChatWithResponseIterable(CreateAppChatRequest request);

    /**
     * @param request the request parameters of CreateAppInstance  CreateAppInstanceRequest
     * @return CreateAppInstanceResponse
     */
    CompletableFuture<CreateAppInstanceResponse> createAppInstance(CreateAppInstanceRequest request);

    /**
     * @param request the request parameters of CreateAppInstanceTicket  CreateAppInstanceTicketRequest
     * @return CreateAppInstanceTicketResponse
     */
    CompletableFuture<CreateAppInstanceTicketResponse> createAppInstanceTicket(CreateAppInstanceTicketRequest request);

    /**
     * @param request the request parameters of CreateAppLlmApiKeyForPartner  CreateAppLlmApiKeyForPartnerRequest
     * @return CreateAppLlmApiKeyForPartnerResponse
     */
    CompletableFuture<CreateAppLlmApiKeyForPartnerResponse> createAppLlmApiKeyForPartner(CreateAppLlmApiKeyForPartnerRequest request);

    /**
     * @param request the request parameters of CreateAppTokenService  CreateAppTokenServiceRequest
     * @return CreateAppTokenServiceResponse
     */
    CompletableFuture<CreateAppTokenServiceResponse> createAppTokenService(CreateAppTokenServiceRequest request);

    /**
     * @param request the request parameters of CreateLogoTask  CreateLogoTaskRequest
     * @return CreateLogoTaskResponse
     */
    CompletableFuture<CreateLogoTaskResponse> createLogoTask(CreateLogoTaskRequest request);

    /**
     * @param request the request parameters of CreateMaterialDirectory  CreateMaterialDirectoryRequest
     * @return CreateMaterialDirectoryResponse
     */
    CompletableFuture<CreateMaterialDirectoryResponse> createMaterialDirectory(CreateMaterialDirectoryRequest request);

    /**
     * @param request the request parameters of DeleteAppDomainCertificate  DeleteAppDomainCertificateRequest
     * @return DeleteAppDomainCertificateResponse
     */
    CompletableFuture<DeleteAppDomainCertificateResponse> deleteAppDomainCertificate(DeleteAppDomainCertificateRequest request);

    /**
     * @param request the request parameters of DeleteAppDomainRedirect  DeleteAppDomainRedirectRequest
     * @return DeleteAppDomainRedirectResponse
     */
    CompletableFuture<DeleteAppDomainRedirectResponse> deleteAppDomainRedirect(DeleteAppDomainRedirectRequest request);

    /**
     * @param request the request parameters of DeleteAppFile  DeleteAppFileRequest
     * @return DeleteAppFileResponse
     */
    CompletableFuture<DeleteAppFileResponse> deleteAppFile(DeleteAppFileRequest request);

    /**
     * @param request the request parameters of DeleteAppInstanceFile  DeleteAppInstanceFileRequest
     * @return DeleteAppInstanceFileResponse
     */
    CompletableFuture<DeleteAppInstanceFileResponse> deleteAppInstanceFile(DeleteAppInstanceFileRequest request);

    /**
     * @param request the request parameters of DeleteAppSupabaseSecrets  DeleteAppSupabaseSecretsRequest
     * @return DeleteAppSupabaseSecretsResponse
     */
    CompletableFuture<DeleteAppSupabaseSecretsResponse> deleteAppSupabaseSecrets(DeleteAppSupabaseSecretsRequest request);

    /**
     * @param request the request parameters of DeleteMaterialDirectory  DeleteMaterialDirectoryRequest
     * @return DeleteMaterialDirectoryResponse
     */
    CompletableFuture<DeleteMaterialDirectoryResponse> deleteMaterialDirectory(DeleteMaterialDirectoryRequest request);

    /**
     * @param request the request parameters of DeleteMaterialTask  DeleteMaterialTaskRequest
     * @return DeleteMaterialTaskResponse
     */
    CompletableFuture<DeleteMaterialTaskResponse> deleteMaterialTask(DeleteMaterialTaskRequest request);

    /**
     * @param request the request parameters of DescribeAppDomainDnsRecord  DescribeAppDomainDnsRecordRequest
     * @return DescribeAppDomainDnsRecordResponse
     */
    CompletableFuture<DescribeAppDomainDnsRecordResponse> describeAppDomainDnsRecord(DescribeAppDomainDnsRecordRequest request);

    /**
     * @param request the request parameters of DispatchConsoleAPIForPartner  DispatchConsoleAPIForPartnerRequest
     * @return DispatchConsoleAPIForPartnerResponse
     */
    CompletableFuture<DispatchConsoleAPIForPartnerResponse> dispatchConsoleAPIForPartner(DispatchConsoleAPIForPartnerRequest request);

    /**
     * @param request the request parameters of EditPluginConfig  EditPluginConfigRequest
     * @return EditPluginConfigResponse
     */
    CompletableFuture<EditPluginConfigResponse> editPluginConfig(EditPluginConfigRequest request);

    /**
     * @param request the request parameters of ExportMaterialFile  ExportMaterialFileRequest
     * @return ExportMaterialFileResponse
     */
    CompletableFuture<ExportMaterialFileResponse> exportMaterialFile(ExportMaterialFileRequest request);

    /**
     * @param request the request parameters of GetAIStaffPreviewUrl  GetAIStaffPreviewUrlRequest
     * @return GetAIStaffPreviewUrlResponse
     */
    CompletableFuture<GetAIStaffPreviewUrlResponse> getAIStaffPreviewUrl(GetAIStaffPreviewUrlRequest request);

    /**
     * @param request the request parameters of GetAppCodeWorkspaceDetail  GetAppCodeWorkspaceDetailRequest
     * @return GetAppCodeWorkspaceDetailResponse
     */
    CompletableFuture<GetAppCodeWorkspaceDetailResponse> getAppCodeWorkspaceDetail(GetAppCodeWorkspaceDetailRequest request);

    /**
     * @param request the request parameters of GetAppConversation  GetAppConversationRequest
     * @return GetAppConversationResponse
     */
    CompletableFuture<GetAppConversationResponse> getAppConversation(GetAppConversationRequest request);

    /**
     * @param request the request parameters of GetAppConversationLockStatus  GetAppConversationLockStatusRequest
     * @return GetAppConversationLockStatusResponse
     */
    CompletableFuture<GetAppConversationLockStatusResponse> getAppConversationLockStatus(GetAppConversationLockStatusRequest request);

    /**
     * @param request the request parameters of GetAppDatabaseTableSchemas  GetAppDatabaseTableSchemasRequest
     * @return GetAppDatabaseTableSchemasResponse
     */
    CompletableFuture<GetAppDatabaseTableSchemasResponse> getAppDatabaseTableSchemas(GetAppDatabaseTableSchemasRequest request);

    /**
     * @param request the request parameters of GetAppFileContent  GetAppFileContentRequest
     * @return GetAppFileContentResponse
     */
    CompletableFuture<GetAppFileContentResponse> getAppFileContent(GetAppFileContentRequest request);

    /**
     * @param request the request parameters of GetAppInstance  GetAppInstanceRequest
     * @return GetAppInstanceResponse
     */
    CompletableFuture<GetAppInstanceResponse> getAppInstance(GetAppInstanceRequest request);

    /**
     * @param request the request parameters of GetAppInstanceEntitlement  GetAppInstanceEntitlementRequest
     * @return GetAppInstanceEntitlementResponse
     */
    CompletableFuture<GetAppInstanceEntitlementResponse> getAppInstanceEntitlement(GetAppInstanceEntitlementRequest request);

    /**
     * @param request the request parameters of GetAppInstanceForAdmin  GetAppInstanceForAdminRequest
     * @return GetAppInstanceForAdminResponse
     */
    CompletableFuture<GetAppInstanceForAdminResponse> getAppInstanceForAdmin(GetAppInstanceForAdminRequest request);

    /**
     * @param request the request parameters of GetAppInstanceForPartner  GetAppInstanceForPartnerRequest
     * @return GetAppInstanceForPartnerResponse
     */
    CompletableFuture<GetAppInstanceForPartnerResponse> getAppInstanceForPartner(GetAppInstanceForPartnerRequest request);

    /**
     * @param request the request parameters of GetAppInstanceTempShortUrl  GetAppInstanceTempShortUrlRequest
     * @return GetAppInstanceTempShortUrlResponse
     */
    CompletableFuture<GetAppInstanceTempShortUrlResponse> getAppInstanceTempShortUrl(GetAppInstanceTempShortUrlRequest request);

    /**
     * @param request the request parameters of GetAppPluginConfig  GetAppPluginConfigRequest
     * @return GetAppPluginConfigResponse
     */
    CompletableFuture<GetAppPluginConfigResponse> getAppPluginConfig(GetAppPluginConfigRequest request);

    /**
     * @param request the request parameters of GetAppPublishStatus  GetAppPublishStatusRequest
     * @return GetAppPublishStatusResponse
     */
    CompletableFuture<GetAppPublishStatusResponse> getAppPublishStatus(GetAppPublishStatusRequest request);

    /**
     * @param request the request parameters of GetAppRecommendedCommodities  GetAppRecommendedCommoditiesRequest
     * @return GetAppRecommendedCommoditiesResponse
     */
    CompletableFuture<GetAppRecommendedCommoditiesResponse> getAppRecommendedCommodities(GetAppRecommendedCommoditiesRequest request);

    /**
     * @param request the request parameters of GetAppRequirement  GetAppRequirementRequest
     * @return GetAppRequirementResponse
     */
    CompletableFuture<GetAppRequirementResponse> getAppRequirement(GetAppRequirementRequest request);

    /**
     * @param request the request parameters of GetAppSandboxPreviewUrl  GetAppSandboxPreviewUrlRequest
     * @return GetAppSandboxPreviewUrlResponse
     */
    CompletableFuture<GetAppSandboxPreviewUrlResponse> getAppSandboxPreviewUrl(GetAppSandboxPreviewUrlRequest request);

    /**
     * @param request the request parameters of GetAppSeoStatus  GetAppSeoStatusRequest
     * @return GetAppSeoStatusResponse
     */
    CompletableFuture<GetAppSeoStatusResponse> getAppSeoStatus(GetAppSeoStatusRequest request);

    /**
     * @param request the request parameters of GetAppSeoTrends  GetAppSeoTrendsRequest
     * @return GetAppSeoTrendsResponse
     */
    CompletableFuture<GetAppSeoTrendsResponse> getAppSeoTrends(GetAppSeoTrendsRequest request);

    /**
     * @param request the request parameters of GetAppSitemap  GetAppSitemapRequest
     * @return GetAppSitemapResponse
     */
    CompletableFuture<GetAppSitemapResponse> getAppSitemap(GetAppSitemapRequest request);

    /**
     * @param request the request parameters of GetAppSupabaseAuthConfig  GetAppSupabaseAuthConfigRequest
     * @return GetAppSupabaseAuthConfigResponse
     */
    CompletableFuture<GetAppSupabaseAuthConfigResponse> getAppSupabaseAuthConfig(GetAppSupabaseAuthConfigRequest request);

    /**
     * @param request the request parameters of GetAppSupabaseInstance  GetAppSupabaseInstanceRequest
     * @return GetAppSupabaseInstanceResponse
     */
    CompletableFuture<GetAppSupabaseInstanceResponse> getAppSupabaseInstance(GetAppSupabaseInstanceRequest request);

    /**
     * @param request the request parameters of GetAppSupabaseSecrets  GetAppSupabaseSecretsRequest
     * @return GetAppSupabaseSecretsResponse
     */
    CompletableFuture<GetAppSupabaseSecretsResponse> getAppSupabaseSecrets(GetAppSupabaseSecretsRequest request);

    /**
     * @param request the request parameters of GetAppTemplate  GetAppTemplateRequest
     * @return GetAppTemplateResponse
     */
    CompletableFuture<GetAppTemplateResponse> getAppTemplate(GetAppTemplateRequest request);

    /**
     * @param request the request parameters of GetAppTokenService  GetAppTokenServiceRequest
     * @return GetAppTokenServiceResponse
     */
    CompletableFuture<GetAppTokenServiceResponse> getAppTokenService(GetAppTokenServiceRequest request);

    /**
     * @param request the request parameters of GetAppWorkspaceDirectory  GetAppWorkspaceDirectoryRequest
     * @return GetAppWorkspaceDirectoryResponse
     */
    CompletableFuture<GetAppWorkspaceDirectoryResponse> getAppWorkspaceDirectory(GetAppWorkspaceDirectoryRequest request);

    /**
     * @param request the request parameters of GetCreateLogoTask  GetCreateLogoTaskRequest
     * @return GetCreateLogoTaskResponse
     */
    CompletableFuture<GetCreateLogoTaskResponse> getCreateLogoTask(GetCreateLogoTaskRequest request);

    /**
     * @param request the request parameters of GetDomainInfoForPartner  GetDomainInfoForPartnerRequest
     * @return GetDomainInfoForPartnerResponse
     */
    CompletableFuture<GetDomainInfoForPartnerResponse> getDomainInfoForPartner(GetDomainInfoForPartnerRequest request);

    /**
     * @param request the request parameters of GetIcpFilingInfoForPartner  GetIcpFilingInfoForPartnerRequest
     * @return GetIcpFilingInfoForPartnerResponse
     */
    CompletableFuture<GetIcpFilingInfoForPartnerResponse> getIcpFilingInfoForPartner(GetIcpFilingInfoForPartnerRequest request);

    /**
     * @param request the request parameters of GetLlmProxyConfigForAdmin  GetLlmProxyConfigForAdminRequest
     * @return GetLlmProxyConfigForAdminResponse
     */
    CompletableFuture<GetLlmProxyConfigForAdminResponse> getLlmProxyConfigForAdmin(GetLlmProxyConfigForAdminRequest request);

    /**
     * @param request the request parameters of GetMiniAppAuthUrl  GetMiniAppAuthUrlRequest
     * @return GetMiniAppAuthUrlResponse
     */
    CompletableFuture<GetMiniAppAuthUrlResponse> getMiniAppAuthUrl(GetMiniAppAuthUrlRequest request);

    /**
     * @param request the request parameters of GetMiniAppBinding  GetMiniAppBindingRequest
     * @return GetMiniAppBindingResponse
     */
    CompletableFuture<GetMiniAppBindingResponse> getMiniAppBinding(GetMiniAppBindingRequest request);

    /**
     * @param request the request parameters of GetMiniAppBindingForAdmin  GetMiniAppBindingForAdminRequest
     * @return GetMiniAppBindingForAdminResponse
     */
    CompletableFuture<GetMiniAppBindingForAdminResponse> getMiniAppBindingForAdmin(GetMiniAppBindingForAdminRequest request);

    /**
     * @param request the request parameters of GetOssUploadPolicy  GetOssUploadPolicyRequest
     * @return GetOssUploadPolicyResponse
     */
    CompletableFuture<GetOssUploadPolicyResponse> getOssUploadPolicy(GetOssUploadPolicyRequest request);

    /**
     * @param request the request parameters of GetTempDownloadUrl  GetTempDownloadUrlRequest
     * @return GetTempDownloadUrlResponse
     */
    CompletableFuture<GetTempDownloadUrlResponse> getTempDownloadUrl(GetTempDownloadUrlRequest request);

    /**
     * @param request the request parameters of GetUserAccessTokenForPartner  GetUserAccessTokenForPartnerRequest
     * @return GetUserAccessTokenForPartnerResponse
     */
    CompletableFuture<GetUserAccessTokenForPartnerResponse> getUserAccessTokenForPartner(GetUserAccessTokenForPartnerRequest request);

    /**
     * @param request the request parameters of GetUserTmpIdentityForPartner  GetUserTmpIdentityForPartnerRequest
     * @return GetUserTmpIdentityForPartnerResponse
     */
    CompletableFuture<GetUserTmpIdentityForPartnerResponse> getUserTmpIdentityForPartner(GetUserTmpIdentityForPartnerRequest request);

    /**
     * @param request the request parameters of IntrospectAppInstanceTicketForPreview  IntrospectAppInstanceTicketForPreviewRequest
     * @return IntrospectAppInstanceTicketForPreviewResponse
     */
    CompletableFuture<IntrospectAppInstanceTicketForPreviewResponse> introspectAppInstanceTicketForPreview(IntrospectAppInstanceTicketForPreviewRequest request);

    /**
     * @param request the request parameters of ListAIStaffChatEvents  ListAIStaffChatEventsRequest
     * @return ListAIStaffChatEventsResponse
     */
    CompletableFuture<ListAIStaffChatEventsResponse> listAIStaffChatEvents(ListAIStaffChatEventsRequest request);

    /**
     * @param request the request parameters of ListAIStaffChatMessages  ListAIStaffChatMessagesRequest
     * @return ListAIStaffChatMessagesResponse
     */
    CompletableFuture<ListAIStaffChatMessagesResponse> listAIStaffChatMessages(ListAIStaffChatMessagesRequest request);

    /**
     * @param request the request parameters of ListAppAssistantAgents  ListAppAssistantAgentsRequest
     * @return ListAppAssistantAgentsResponse
     */
    CompletableFuture<ListAppAssistantAgentsResponse> listAppAssistantAgents(ListAppAssistantAgentsRequest request);

    /**
     * @param request the request parameters of ListAppChatMessages  ListAppChatMessagesRequest
     * @return ListAppChatMessagesResponse
     */
    CompletableFuture<ListAppChatMessagesResponse> listAppChatMessages(ListAppChatMessagesRequest request);

    /**
     * @deprecated OpenAPI ListAppCommoditySpecificationsForPartner is deprecated, please use WebsiteBuild::2025-04-29::ListAppCommoditySpecificationsV2ForPartner instead.  * @param request  the request parameters of ListAppCommoditySpecificationsForPartner  ListAppCommoditySpecificationsForPartnerRequest
     * @return ListAppCommoditySpecificationsForPartnerResponse
     */
    @Deprecated
    CompletableFuture<ListAppCommoditySpecificationsForPartnerResponse> listAppCommoditySpecificationsForPartner(ListAppCommoditySpecificationsForPartnerRequest request);

    /**
     * @param request the request parameters of ListAppCommoditySpecificationsV2ForPartner  ListAppCommoditySpecificationsV2ForPartnerRequest
     * @return ListAppCommoditySpecificationsV2ForPartnerResponse
     */
    CompletableFuture<ListAppCommoditySpecificationsV2ForPartnerResponse> listAppCommoditySpecificationsV2ForPartner(ListAppCommoditySpecificationsV2ForPartnerRequest request);

    /**
     * @param request the request parameters of ListAppConversationMessages  ListAppConversationMessagesRequest
     * @return ListAppConversationMessagesResponse
     */
    CompletableFuture<ListAppConversationMessagesResponse> listAppConversationMessages(ListAppConversationMessagesRequest request);

    /**
     * @param request the request parameters of ListAppConversations  ListAppConversationsRequest
     * @return ListAppConversationsResponse
     */
    CompletableFuture<ListAppConversationsResponse> listAppConversations(ListAppConversationsRequest request);

    /**
     * @param request the request parameters of ListAppDomainRedirectRecords  ListAppDomainRedirectRecordsRequest
     * @return ListAppDomainRedirectRecordsResponse
     */
    CompletableFuture<ListAppDomainRedirectRecordsResponse> listAppDomainRedirectRecords(ListAppDomainRedirectRecordsRequest request);

    /**
     * @param request the request parameters of ListAppInstanceDomains  ListAppInstanceDomainsRequest
     * @return ListAppInstanceDomainsResponse
     */
    CompletableFuture<ListAppInstanceDomainsResponse> listAppInstanceDomains(ListAppInstanceDomainsRequest request);

    /**
     * @param request the request parameters of ListAppInstances  ListAppInstancesRequest
     * @return ListAppInstancesResponse
     */
    CompletableFuture<ListAppInstancesResponse> listAppInstances(ListAppInstancesRequest request);

    /**
     * @param request the request parameters of ListAppPluginConfigs  ListAppPluginConfigsRequest
     * @return ListAppPluginConfigsResponse
     */
    CompletableFuture<ListAppPluginConfigsResponse> listAppPluginConfigs(ListAppPluginConfigsRequest request);

    /**
     * @param request the request parameters of ListAppPlugins  ListAppPluginsRequest
     * @return ListAppPluginsResponse
     */
    CompletableFuture<ListAppPluginsResponse> listAppPlugins(ListAppPluginsRequest request);

    /**
     * @param request the request parameters of ListAppPublishHistory  ListAppPublishHistoryRequest
     * @return ListAppPublishHistoryResponse
     */
    CompletableFuture<ListAppPublishHistoryResponse> listAppPublishHistory(ListAppPublishHistoryRequest request);

    /**
     * @param request the request parameters of ListAppTemplateDicts  ListAppTemplateDictsRequest
     * @return ListAppTemplateDictsResponse
     */
    CompletableFuture<ListAppTemplateDictsResponse> listAppTemplateDicts(ListAppTemplateDictsRequest request);

    /**
     * @param request the request parameters of ListAppTemplates  ListAppTemplatesRequest
     * @return ListAppTemplatesResponse
     */
    CompletableFuture<ListAppTemplatesResponse> listAppTemplates(ListAppTemplatesRequest request);

    /**
     * @param request the request parameters of ListIsvPaymentPluginConfigs  ListIsvPaymentPluginConfigsRequest
     * @return ListIsvPaymentPluginConfigsResponse
     */
    CompletableFuture<ListIsvPaymentPluginConfigsResponse> listIsvPaymentPluginConfigs(ListIsvPaymentPluginConfigsRequest request);

    /**
     * @param request the request parameters of ModifyAppInstanceSpec  ModifyAppInstanceSpecRequest
     * @return ModifyAppInstanceSpecResponse
     */
    CompletableFuture<ModifyAppInstanceSpecResponse> modifyAppInstanceSpec(ModifyAppInstanceSpecRequest request);

    /**
     * @param request the request parameters of ModifyMaterialDirectory  ModifyMaterialDirectoryRequest
     * @return ModifyMaterialDirectoryResponse
     */
    CompletableFuture<ModifyMaterialDirectoryResponse> modifyMaterialDirectory(ModifyMaterialDirectoryRequest request);

    /**
     * @param request the request parameters of ModifyMaterialFile  ModifyMaterialFileRequest
     * @return ModifyMaterialFileResponse
     */
    CompletableFuture<ModifyMaterialFileResponse> modifyMaterialFile(ModifyMaterialFileRequest request);

    /**
     * @param request the request parameters of ModifyMaterialFileStatus  ModifyMaterialFileStatusRequest
     * @return ModifyMaterialFileStatusResponse
     */
    CompletableFuture<ModifyMaterialFileStatusResponse> modifyMaterialFileStatus(ModifyMaterialFileStatusRequest request);

    /**
     * @param request the request parameters of MoveMaterialDirectory  MoveMaterialDirectoryRequest
     * @return MoveMaterialDirectoryResponse
     */
    CompletableFuture<MoveMaterialDirectoryResponse> moveMaterialDirectory(MoveMaterialDirectoryRequest request);

    /**
     * @param request the request parameters of MoveMaterialFile  MoveMaterialFileRequest
     * @return MoveMaterialFileResponse
     */
    CompletableFuture<MoveMaterialFileResponse> moveMaterialFile(MoveMaterialFileRequest request);

    /**
     * @param request the request parameters of OperateAppInstanceForPartner  OperateAppInstanceForPartnerRequest
     * @return OperateAppInstanceForPartnerResponse
     */
    CompletableFuture<OperateAppInstanceForPartnerResponse> operateAppInstanceForPartner(OperateAppInstanceForPartnerRequest request);

    /**
     * @param request the request parameters of OperateAppServiceForPartner  OperateAppServiceForPartnerRequest
     * @return OperateAppServiceForPartnerResponse
     */
    CompletableFuture<OperateAppServiceForPartnerResponse> operateAppServiceForPartner(OperateAppServiceForPartnerRequest request);

    /**
     * @param request the request parameters of OperateAppTemplateLike  OperateAppTemplateLikeRequest
     * @return OperateAppTemplateLikeResponse
     */
    CompletableFuture<OperateAppTemplateLikeResponse> operateAppTemplateLike(OperateAppTemplateLikeRequest request);

    /**
     * @param request the request parameters of OperateSupabaseForAdmin  OperateSupabaseForAdminRequest
     * @return OperateSupabaseForAdminResponse
     */
    CompletableFuture<OperateSupabaseForAdminResponse> operateSupabaseForAdmin(OperateSupabaseForAdminRequest request);

    /**
     * @param request the request parameters of PublishAppInstance  PublishAppInstanceRequest
     * @return PublishAppInstanceResponse
     */
    CompletableFuture<PublishAppInstanceResponse> publishAppInstance(PublishAppInstanceRequest request);

    /**
     * @param request the request parameters of PushResourceMeasure  PushResourceMeasureRequest
     * @return PushResourceMeasureResponse
     */
    CompletableFuture<PushResourceMeasureResponse> pushResourceMeasure(PushResourceMeasureRequest request);

    /**
     * @param request the request parameters of QueryInspirationAccountDetails  QueryInspirationAccountDetailsRequest
     * @return QueryInspirationAccountDetailsResponse
     */
    CompletableFuture<QueryInspirationAccountDetailsResponse> queryInspirationAccountDetails(QueryInspirationAccountDetailsRequest request);

    /**
     * @param request the request parameters of QueryInspirationBalance  QueryInspirationBalanceRequest
     * @return QueryInspirationBalanceResponse
     */
    CompletableFuture<QueryInspirationBalanceResponse> queryInspirationBalance(QueryInspirationBalanceRequest request);

    /**
     * @param request the request parameters of QueryInspirationConsumeRecords  QueryInspirationConsumeRecordsRequest
     * @return QueryInspirationConsumeRecordsResponse
     */
    CompletableFuture<QueryInspirationConsumeRecordsResponse> queryInspirationConsumeRecords(QueryInspirationConsumeRecordsRequest request);

    /**
     * @param request the request parameters of QueryMaterialDirectoryTree  QueryMaterialDirectoryTreeRequest
     * @return QueryMaterialDirectoryTreeResponse
     */
    CompletableFuture<QueryMaterialDirectoryTreeResponse> queryMaterialDirectoryTree(QueryMaterialDirectoryTreeRequest request);

    /**
     * @param request the request parameters of QueryMaterialFileDetail  QueryMaterialFileDetailRequest
     * @return QueryMaterialFileDetailResponse
     */
    CompletableFuture<QueryMaterialFileDetailResponse> queryMaterialFileDetail(QueryMaterialFileDetailRequest request);

    /**
     * @param request the request parameters of QueryMaterialFileList  QueryMaterialFileListRequest
     * @return QueryMaterialFileListResponse
     */
    CompletableFuture<QueryMaterialFileListResponse> queryMaterialFileList(QueryMaterialFileListRequest request);

    /**
     * @param request the request parameters of QueryMaterialFileSummaryInfo  QueryMaterialFileSummaryInfoRequest
     * @return QueryMaterialFileSummaryInfoResponse
     */
    CompletableFuture<QueryMaterialFileSummaryInfoResponse> queryMaterialFileSummaryInfo(QueryMaterialFileSummaryInfoRequest request);

    /**
     * @param request the request parameters of QueryMaterialTaskDetail  QueryMaterialTaskDetailRequest
     * @return QueryMaterialTaskDetailResponse
     */
    CompletableFuture<QueryMaterialTaskDetailResponse> queryMaterialTaskDetail(QueryMaterialTaskDetailRequest request);

    /**
     * @param request the request parameters of QueryMaterialTaskList  QueryMaterialTaskListRequest
     * @return QueryMaterialTaskListResponse
     */
    CompletableFuture<QueryMaterialTaskListResponse> queryMaterialTaskList(QueryMaterialTaskListRequest request);

    /**
     * @param request the request parameters of QuerySupabaseAuthConfigsForAdmin  QuerySupabaseAuthConfigsForAdminRequest
     * @return QuerySupabaseAuthConfigsForAdminResponse
     */
    CompletableFuture<QuerySupabaseAuthConfigsForAdminResponse> querySupabaseAuthConfigsForAdmin(QuerySupabaseAuthConfigsForAdminRequest request);

    /**
     * @param request the request parameters of QuerySupabaseConfigsForAdmin  QuerySupabaseConfigsForAdminRequest
     * @return QuerySupabaseConfigsForAdminResponse
     */
    CompletableFuture<QuerySupabaseConfigsForAdminResponse> querySupabaseConfigsForAdmin(QuerySupabaseConfigsForAdminRequest request);

    /**
     * @param request the request parameters of QuerySupabaseInstanceInfoForAdmin  QuerySupabaseInstanceInfoForAdminRequest
     * @return QuerySupabaseInstanceInfoForAdminResponse
     */
    CompletableFuture<QuerySupabaseInstanceInfoForAdminResponse> querySupabaseInstanceInfoForAdmin(QuerySupabaseInstanceInfoForAdminRequest request);

    /**
     * @param request the request parameters of ReconnectAppChat  ReconnectAppChatRequest
     * @return ReconnectAppChatResponse
     */
    CompletableFuture<ReconnectAppChatResponse> reconnectAppChat(ReconnectAppChatRequest request);

    ResponseIterable<String> reconnectAppChatWithResponseIterable(ReconnectAppChatRequest request);

    /**
     * @param request the request parameters of RefreshAppInstanceTicket  RefreshAppInstanceTicketRequest
     * @return RefreshAppInstanceTicketResponse
     */
    CompletableFuture<RefreshAppInstanceTicketResponse> refreshAppInstanceTicket(RefreshAppInstanceTicketRequest request);

    /**
     * @param request the request parameters of RefundAppInstanceForPartner  RefundAppInstanceForPartnerRequest
     * @return RefundAppInstanceForPartnerResponse
     */
    CompletableFuture<RefundAppInstanceForPartnerResponse> refundAppInstanceForPartner(RefundAppInstanceForPartnerRequest request);

    /**
     * @param request the request parameters of RenewAppInstance  RenewAppInstanceRequest
     * @return RenewAppInstanceResponse
     */
    CompletableFuture<RenewAppInstanceResponse> renewAppInstance(RenewAppInstanceRequest request);

    /**
     * @param request the request parameters of RenewAppSandbox  RenewAppSandboxRequest
     * @return RenewAppSandboxResponse
     */
    CompletableFuture<RenewAppSandboxResponse> renewAppSandbox(RenewAppSandboxRequest request);

    /**
     * @param request the request parameters of RollbackAppCodeSnapshot  RollbackAppCodeSnapshotRequest
     * @return RollbackAppCodeSnapshotResponse
     */
    CompletableFuture<RollbackAppCodeSnapshotResponse> rollbackAppCodeSnapshot(RollbackAppCodeSnapshotRequest request);

    /**
     * @param request the request parameters of RollbackAppInstancePublish  RollbackAppInstancePublishRequest
     * @return RollbackAppInstancePublishResponse
     */
    CompletableFuture<RollbackAppInstancePublishResponse> rollbackAppInstancePublish(RollbackAppInstancePublishRequest request);

    /**
     * @param request the request parameters of SaveAppRequirement  SaveAppRequirementRequest
     * @return SaveAppRequirementResponse
     */
    CompletableFuture<SaveAppRequirementResponse> saveAppRequirement(SaveAppRequirementRequest request);

    /**
     * @param request the request parameters of SaveAppSupabaseSecrets  SaveAppSupabaseSecretsRequest
     * @return SaveAppSupabaseSecretsResponse
     */
    CompletableFuture<SaveAppSupabaseSecretsResponse> saveAppSupabaseSecrets(SaveAppSupabaseSecretsRequest request);

    /**
     * @param request the request parameters of SearchImage  SearchImageRequest
     * @return SearchImageResponse
     */
    CompletableFuture<SearchImageResponse> searchImage(SearchImageRequest request);

    /**
     * @param request the request parameters of SetAppDomainCertificate  SetAppDomainCertificateRequest
     * @return SetAppDomainCertificateResponse
     */
    CompletableFuture<SetAppDomainCertificateResponse> setAppDomainCertificate(SetAppDomainCertificateRequest request);

    /**
     * @param request the request parameters of SubmitAppSeoIndex  SubmitAppSeoIndexRequest
     * @return SubmitAppSeoIndexResponse
     */
    CompletableFuture<SubmitAppSeoIndexResponse> submitAppSeoIndex(SubmitAppSeoIndexRequest request);

    /**
     * @param request the request parameters of SubmitMaterialTask  SubmitMaterialTaskRequest
     * @return SubmitMaterialTaskResponse
     */
    CompletableFuture<SubmitMaterialTaskResponse> submitMaterialTask(SubmitMaterialTaskRequest request);

    /**
     * @param request the request parameters of SwitchAppConversation  SwitchAppConversationRequest
     * @return SwitchAppConversationResponse
     */
    CompletableFuture<SwitchAppConversationResponse> switchAppConversation(SwitchAppConversationRequest request);

    /**
     * @param request the request parameters of SyncAppInstanceForPartner  SyncAppInstanceForPartnerRequest
     * @return SyncAppInstanceForPartnerResponse
     */
    CompletableFuture<SyncAppInstanceForPartnerResponse> syncAppInstanceForPartner(SyncAppInstanceForPartnerRequest request);

    /**
     * @param request the request parameters of UnbindAppDomain  UnbindAppDomainRequest
     * @return UnbindAppDomainResponse
     */
    CompletableFuture<UnbindAppDomainResponse> unbindAppDomain(UnbindAppDomainRequest request);

    /**
     * @param request the request parameters of UpdateAppChatMessage  UpdateAppChatMessageRequest
     * @return UpdateAppChatMessageResponse
     */
    CompletableFuture<UpdateAppChatMessageResponse> updateAppChatMessage(UpdateAppChatMessageRequest request);

    /**
     * @param request the request parameters of UpdateAppCode  UpdateAppCodeRequest
     * @return UpdateAppCodeResponse
     */
    CompletableFuture<UpdateAppCodeResponse> updateAppCode(UpdateAppCodeRequest request);

    /**
     * @param request the request parameters of UpdateAppFile  UpdateAppFileRequest
     * @return UpdateAppFileResponse
     */
    CompletableFuture<UpdateAppFileResponse> updateAppFile(UpdateAppFileRequest request);

    /**
     * @param request the request parameters of UpdateAppInstance  UpdateAppInstanceRequest
     * @return UpdateAppInstanceResponse
     */
    CompletableFuture<UpdateAppInstanceResponse> updateAppInstance(UpdateAppInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>WanXiaoZhi 2.0 AI Conversation</p>
     * 
     * @param request the request parameters of UpdateAppSeoStatus  UpdateAppSeoStatusRequest
     * @return UpdateAppSeoStatusResponse
     */
    CompletableFuture<UpdateAppSeoStatusResponse> updateAppSeoStatus(UpdateAppSeoStatusRequest request);

    /**
     * @param request the request parameters of UpdateAppSupabaseAuthConfig  UpdateAppSupabaseAuthConfigRequest
     * @return UpdateAppSupabaseAuthConfigResponse
     */
    CompletableFuture<UpdateAppSupabaseAuthConfigResponse> updateAppSupabaseAuthConfig(UpdateAppSupabaseAuthConfigRequest request);

    /**
     * @param request the request parameters of UpdateAppSupabaseSecret  UpdateAppSupabaseSecretRequest
     * @return UpdateAppSupabaseSecretResponse
     */
    CompletableFuture<UpdateAppSupabaseSecretResponse> updateAppSupabaseSecret(UpdateAppSupabaseSecretRequest request);

    /**
     * @param request the request parameters of UpdateMiniAppBinding  UpdateMiniAppBindingRequest
     * @return UpdateMiniAppBindingResponse
     */
    CompletableFuture<UpdateMiniAppBindingResponse> updateMiniAppBinding(UpdateMiniAppBindingRequest request);

    /**
     * @param request the request parameters of UploadAppSiteValidationFile  UploadAppSiteValidationFileRequest
     * @return UploadAppSiteValidationFileResponse
     */
    CompletableFuture<UploadAppSiteValidationFileResponse> uploadAppSiteValidationFile(UploadAppSiteValidationFileRequest request);

    /**
     * @param request the request parameters of UploadMaterialFile  UploadMaterialFileRequest
     * @return UploadMaterialFileResponse
     */
    CompletableFuture<UploadMaterialFileResponse> uploadMaterialFile(UploadMaterialFileRequest request);

}
