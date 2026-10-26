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
     * <b>description</b> :
     * <p>Queries the information about the Supabase instance associated with a resource.</p>
     * 
     * @param request the request parameters of AllocateSupabaseForAdmin  AllocateSupabaseForAdminRequest
     * @return AllocateSupabaseForAdminResponse
     */
    CompletableFuture<AllocateSupabaseForAdminResponse> allocateSupabaseForAdmin(AllocateSupabaseForAdminRequest request);

    /**
     * <b>description</b> :
     * <p>Queries application instance information.</p>
     * 
     * @param request the request parameters of AssignRbacUserRole  AssignRbacUserRoleRequest
     * @return AssignRbacUserRoleResponse
     */
    CompletableFuture<AssignRbacUserRoleResponse> assignRbacUserRole(AssignRbacUserRoleRequest request);

    /**
     * @param request the request parameters of AuthorizeAppProxyOps  AuthorizeAppProxyOpsRequest
     * @return AuthorizeAppProxyOpsResponse
     */
    CompletableFuture<AuthorizeAppProxyOpsResponse> authorizeAppProxyOps(AuthorizeAppProxyOpsRequest request);

    /**
     * <b>description</b> :
     * <p>Manages the Supabase instance information associated with the resources.</p>
     * 
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
     * <b>description</b> :
     * <p>Retrieves the configuration information of the code generation plugin.</p>
     * 
     * @param request the request parameters of CheckAppVerifyCode  CheckAppVerifyCodeRequest
     * @return CheckAppVerifyCodeResponse
     */
    CompletableFuture<CheckAppVerifyCodeResponse> checkAppVerifyCode(CheckAppVerifyCodeRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the Supabase instance information corresponding to the resource.</p>
     * 
     * @param request the request parameters of CheckResourceMeasure  CheckResourceMeasureRequest
     * @return CheckResourceMeasureResponse
     */
    CompletableFuture<CheckResourceMeasureResponse> checkResourceMeasure(CheckResourceMeasureRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the Supabase instance information corresponding to the resource.</p>
     * 
     * @param request the request parameters of CheckUserResourceMeasure  CheckUserResourceMeasureRequest
     * @return CheckUserResourceMeasureResponse
     */
    CompletableFuture<CheckUserResourceMeasureResponse> checkUserResourceMeasure(CheckUserResourceMeasureRequest request);

    /**
     * <b>description</b> :
     * <p>Queries application instance information.</p>
     * 
     * @param request the request parameters of ConfirmAppInstance  ConfirmAppInstanceRequest
     * @return ConfirmAppInstanceResponse
     */
    CompletableFuture<ConfirmAppInstanceResponse> confirmAppInstance(ConfirmAppInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the code generation plug-in configuration information.</p>
     * 
     * @param request the request parameters of CopyAppPluginConfig  CopyAppPluginConfigRequest
     * @return CopyAppPluginConfigResponse
     */
    CompletableFuture<CopyAppPluginConfigResponse> copyAppPluginConfig(CopyAppPluginConfigRequest request);

    /**
     * <b>description</b> :
     * <p>Initiates a WanXiaoZhi 2.0 AI conversation.</p>
     * 
     * @param request the request parameters of CreateAIStaffChat  CreateAIStaffChatRequest
     * @return CreateAIStaffChatResponse
     */
    CompletableFuture<CreateAIStaffChatResponse> createAIStaffChat(CreateAIStaffChatRequest request);

    /**
     * <b>description</b> :
     * <p>Creates an AI session for Wan Xiaozhi 2.0.</p>
     * 
     * @param request the request parameters of CreateAIStaffConversation  CreateAIStaffConversationRequest
     * @return CreateAIStaffConversationResponse
     */
    CompletableFuture<CreateAIStaffConversationResponse> createAIStaffConversation(CreateAIStaffConversationRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the configuration information of the code generation plugin.</p>
     * 
     * @param request the request parameters of CreateAppAssistantAgent  CreateAppAssistantAgentRequest
     * @return CreateAppAssistantAgentResponse
     */
    CompletableFuture<CreateAppAssistantAgentResponse> createAppAssistantAgent(CreateAppAssistantAgentRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the configuration information of the code generation plugin.</p>
     * 
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
     * <b>description</b> :
     * <p>Retrieves the code generation plugin configuration information.</p>
     * 
     * @param request the request parameters of CreateAppLlmApiKeyForPartner  CreateAppLlmApiKeyForPartnerRequest
     * @return CreateAppLlmApiKeyForPartnerResponse
     */
    CompletableFuture<CreateAppLlmApiKeyForPartnerResponse> createAppLlmApiKeyForPartner(CreateAppLlmApiKeyForPartnerRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the configuration information of the code generation plug-in.</p>
     * 
     * @param request the request parameters of CreateAppNotificationScene  CreateAppNotificationSceneRequest
     * @return CreateAppNotificationSceneResponse
     */
    CompletableFuture<CreateAppNotificationSceneResponse> createAppNotificationScene(CreateAppNotificationSceneRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the configuration information of the code generation plug-in.</p>
     * 
     * @param request the request parameters of CreateAppPlugin  CreateAppPluginRequest
     * @return CreateAppPluginResponse
     */
    CompletableFuture<CreateAppPluginResponse> createAppPlugin(CreateAppPluginRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the configuration information of the code generation plugin.</p>
     * 
     * @param request the request parameters of CreateAppTokenService  CreateAppTokenServiceRequest
     * @return CreateAppTokenServiceResponse
     */
    CompletableFuture<CreateAppTokenServiceResponse> createAppTokenService(CreateAppTokenServiceRequest request);

    /**
     * <b>description</b> :
     * <p>Distributes and generates channel drafts.</p>
     * 
     * @param request the request parameters of CreateDistribution  CreateDistributionRequest
     * @return CreateDistributionResponse
     */
    CompletableFuture<CreateDistributionResponse> createDistribution(CreateDistributionRequest request);

    /**
     * @param request the request parameters of CreateInspiration  CreateInspirationRequest
     * @return CreateInspirationResponse
     */
    CompletableFuture<CreateInspirationResponse> createInspiration(CreateInspirationRequest request);

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
     * <b>description</b> :
     * <p>Wanxiaozhi 2.0 AI conversation.</p>
     * 
     * @param request the request parameters of CreateRbacOrgUnit  CreateRbacOrgUnitRequest
     * @return CreateRbacOrgUnitResponse
     */
    CompletableFuture<CreateRbacOrgUnitResponse> createRbacOrgUnit(CreateRbacOrgUnitRequest request);

    /**
     * <b>description</b> :
     * <p>Creates an AI conversation session through Wanxiaozhi 2.0.</p>
     * 
     * @param request the request parameters of CreateRbacPermission  CreateRbacPermissionRequest
     * @return CreateRbacPermissionResponse
     */
    CompletableFuture<CreateRbacPermissionResponse> createRbacPermission(CreateRbacPermissionRequest request);

    /**
     * <b>description</b> :
     * <p>Wanxiaozhi 2.0 AI conversation.</p>
     * 
     * @param request the request parameters of CreateRbacRole  CreateRbacRoleRequest
     * @return CreateRbacRoleResponse
     */
    CompletableFuture<CreateRbacRoleResponse> createRbacRole(CreateRbacRoleRequest request);

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
     * <b>description</b> :
     * <p>Queries application instance information.</p>
     * 
     * @param request the request parameters of DeleteAppFile  DeleteAppFileRequest
     * @return DeleteAppFileResponse
     */
    CompletableFuture<DeleteAppFileResponse> deleteAppFile(DeleteAppFileRequest request);

    /**
     * <b>description</b> :
     * <p>Queries application instance information.</p>
     * 
     * @param request the request parameters of DeleteAppInstanceFile  DeleteAppInstanceFileRequest
     * @return DeleteAppInstanceFileResponse
     */
    CompletableFuture<DeleteAppInstanceFileResponse> deleteAppInstanceFile(DeleteAppInstanceFileRequest request);

    /**
     * <b>description</b> :
     * <p>Queries application instance information.</p>
     * 
     * @param request the request parameters of DeleteAppNotificationScene  DeleteAppNotificationSceneRequest
     * @return DeleteAppNotificationSceneResponse
     */
    CompletableFuture<DeleteAppNotificationSceneResponse> deleteAppNotificationScene(DeleteAppNotificationSceneRequest request);

    /**
     * @param request the request parameters of DeleteAppPlugin  DeleteAppPluginRequest
     * @return DeleteAppPluginResponse
     */
    CompletableFuture<DeleteAppPluginResponse> deleteAppPlugin(DeleteAppPluginRequest request);

    /**
     * <b>description</b> :
     * <p>Queries application instance information.</p>
     * 
     * @param request the request parameters of DeleteAppSceneRecipient  DeleteAppSceneRecipientRequest
     * @return DeleteAppSceneRecipientResponse
     */
    CompletableFuture<DeleteAppSceneRecipientResponse> deleteAppSceneRecipient(DeleteAppSceneRecipientRequest request);

    /**
     * <b>description</b> :
     * <p>The Supabase instance information corresponding to the operated resource.</p>
     * 
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
     * <b>description</b> :
     * <p>Queries application instance information.</p>
     * 
     * @param request the request parameters of DeleteRbacOrgUnit  DeleteRbacOrgUnitRequest
     * @return DeleteRbacOrgUnitResponse
     */
    CompletableFuture<DeleteRbacOrgUnitResponse> deleteRbacOrgUnit(DeleteRbacOrgUnitRequest request);

    /**
     * <b>description</b> :
     * <p>Creates an AI conversation session for WanXiaoZhi 2.0.</p>
     * 
     * @param request the request parameters of DeleteRbacPermission  DeleteRbacPermissionRequest
     * @return DeleteRbacPermissionResponse
     */
    CompletableFuture<DeleteRbacPermissionResponse> deleteRbacPermission(DeleteRbacPermissionRequest request);

    /**
     * <b>description</b> :
     * <p>Queries application instance information.</p>
     * 
     * @param request the request parameters of DeleteRbacRole  DeleteRbacRoleRequest
     * @return DeleteRbacRoleResponse
     */
    CompletableFuture<DeleteRbacRoleResponse> deleteRbacRole(DeleteRbacRoleRequest request);

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
     * <b>description</b> :
     * <p>Queries the Supabase instance configuration information corresponding to a resource.</p>
     * 
     * @param request the request parameters of ExportRbacConfig  ExportRbacConfigRequest
     * @return ExportRbacConfigResponse
     */
    CompletableFuture<ExportRbacConfigResponse> exportRbacConfig(ExportRbacConfigRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the site preview URL for WanXiaoZhi 2.0.</p>
     * 
     * @param request the request parameters of GetAIStaffPreviewUrl  GetAIStaffPreviewUrlRequest
     * @return GetAIStaffPreviewUrlResponse
     */
    CompletableFuture<GetAIStaffPreviewUrlResponse> getAIStaffPreviewUrl(GetAIStaffPreviewUrlRequest request);

    /**
     * <b>description</b> :
     * <p>Queries application instance information.</p>
     * 
     * @param request the request parameters of GetAppCodeWorkspaceDetail  GetAppCodeWorkspaceDetailRequest
     * @return GetAppCodeWorkspaceDetailResponse
     */
    CompletableFuture<GetAppCodeWorkspaceDetailResponse> getAppCodeWorkspaceDetail(GetAppCodeWorkspaceDetailRequest request);

    /**
     * <b>description</b> :
     * <p>The Wanxiaozhi 2.0 API operation for creating AI conversations.</p>
     * 
     * @param request the request parameters of GetAppConversation  GetAppConversationRequest
     * @return GetAppConversationResponse
     */
    CompletableFuture<GetAppConversationResponse> getAppConversation(GetAppConversationRequest request);

    /**
     * <b>description</b> :
     * <p>The API operation for creating an AI session in Wanxiaozhi 2.0.</p>
     * 
     * @param request the request parameters of GetAppConversationLockStatus  GetAppConversationLockStatusRequest
     * @return GetAppConversationLockStatusResponse
     */
    CompletableFuture<GetAppConversationLockStatusResponse> getAppConversationLockStatus(GetAppConversationLockStatusRequest request);

    /**
     * <b>description</b> :
     * <p>Queries application instance information.</p>
     * 
     * @param request the request parameters of GetAppDatabaseTableSchemas  GetAppDatabaseTableSchemasRequest
     * @return GetAppDatabaseTableSchemasResponse
     */
    CompletableFuture<GetAppDatabaseTableSchemasResponse> getAppDatabaseTableSchemas(GetAppDatabaseTableSchemasRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the configuration information of the code generation plugin.</p>
     * 
     * @param request the request parameters of GetAppFileContent  GetAppFileContentRequest
     * @return GetAppFileContentResponse
     */
    CompletableFuture<GetAppFileContentResponse> getAppFileContent(GetAppFileContentRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the details of a website builder application instance.</p>
     * 
     * @param request the request parameters of GetAppInstance  GetAppInstanceRequest
     * @return GetAppInstanceResponse
     */
    CompletableFuture<GetAppInstanceResponse> getAppInstance(GetAppInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the entitlement information of an application instance.</p>
     * 
     * @param request the request parameters of GetAppInstanceEntitlement  GetAppInstanceEntitlementRequest
     * @return GetAppInstanceEntitlementResponse
     */
    CompletableFuture<GetAppInstanceEntitlementResponse> getAppInstanceEntitlement(GetAppInstanceEntitlementRequest request);

    /**
     * <b>description</b> :
     * <p>Queries application instance information.</p>
     * 
     * @param request the request parameters of GetAppInstanceForAdmin  GetAppInstanceForAdminRequest
     * @return GetAppInstanceForAdminResponse
     */
    CompletableFuture<GetAppInstanceForAdminResponse> getAppInstanceForAdmin(GetAppInstanceForAdminRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the configuration information of the code generation plug-in.</p>
     * 
     * @param request the request parameters of GetAppInstanceForPartner  GetAppInstanceForPartnerRequest
     * @return GetAppInstanceForPartnerResponse
     */
    CompletableFuture<GetAppInstanceForPartnerResponse> getAppInstanceForPartner(GetAppInstanceForPartnerRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the configuration information of the code generation plugin.</p>
     * 
     * @param request the request parameters of GetAppInstanceTempShortUrl  GetAppInstanceTempShortUrlRequest
     * @return GetAppInstanceTempShortUrlResponse
     */
    CompletableFuture<GetAppInstanceTempShortUrlResponse> getAppInstanceTempShortUrl(GetAppInstanceTempShortUrlRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the configuration information of a code generation plugin.</p>
     * 
     * @param request the request parameters of GetAppPlugin  GetAppPluginRequest
     * @return GetAppPluginResponse
     */
    CompletableFuture<GetAppPluginResponse> getAppPlugin(GetAppPluginRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the configuration information of a code generation plugin.</p>
     * 
     * @param request the request parameters of GetAppPluginConfig  GetAppPluginConfigRequest
     * @return GetAppPluginConfigResponse
     */
    CompletableFuture<GetAppPluginConfigResponse> getAppPluginConfig(GetAppPluginConfigRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the configuration information of the code generation plug-in.</p>
     * 
     * @param request the request parameters of GetAppPublishStatus  GetAppPublishStatusRequest
     * @return GetAppPublishStatusResponse
     */
    CompletableFuture<GetAppPublishStatusResponse> getAppPublishStatus(GetAppPublishStatusRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the configuration information of the code generation plug-in.</p>
     * 
     * @param request the request parameters of GetAppRecommendedCommodities  GetAppRecommendedCommoditiesRequest
     * @return GetAppRecommendedCommoditiesResponse
     */
    CompletableFuture<GetAppRecommendedCommoditiesResponse> getAppRecommendedCommodities(GetAppRecommendedCommoditiesRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the configuration information of the code generation plugin.</p>
     * 
     * @param request the request parameters of GetAppRequirement  GetAppRequirementRequest
     * @return GetAppRequirementResponse
     */
    CompletableFuture<GetAppRequirementResponse> getAppRequirement(GetAppRequirementRequest request);

    /**
     * <b>description</b> :
     * <p>Wanxiaozhi 2.0 - Retrieves the site preview URL.</p>
     * 
     * @param request the request parameters of GetAppSandboxPreviewUrl  GetAppSandboxPreviewUrlRequest
     * @return GetAppSandboxPreviewUrlResponse
     */
    CompletableFuture<GetAppSandboxPreviewUrlResponse> getAppSandboxPreviewUrl(GetAppSandboxPreviewUrlRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the configuration information of the code generation plugin.</p>
     * 
     * @param request the request parameters of GetAppSeoStatus  GetAppSeoStatusRequest
     * @return GetAppSeoStatusResponse
     */
    CompletableFuture<GetAppSeoStatusResponse> getAppSeoStatus(GetAppSeoStatusRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the configuration information of the code generation plugin.</p>
     * 
     * @param request the request parameters of GetAppSeoTrends  GetAppSeoTrendsRequest
     * @return GetAppSeoTrendsResponse
     */
    CompletableFuture<GetAppSeoTrendsResponse> getAppSeoTrends(GetAppSeoTrendsRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the configuration information of the code generation plugin.</p>
     * 
     * @param request the request parameters of GetAppSitemap  GetAppSitemapRequest
     * @return GetAppSitemapResponse
     */
    CompletableFuture<GetAppSitemapResponse> getAppSitemap(GetAppSitemapRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the Supabase instance authentication configuration information for a specified resource.</p>
     * 
     * @param request the request parameters of GetAppSupabaseAuthConfig  GetAppSupabaseAuthConfigRequest
     * @return GetAppSupabaseAuthConfigResponse
     */
    CompletableFuture<GetAppSupabaseAuthConfigResponse> getAppSupabaseAuthConfig(GetAppSupabaseAuthConfigRequest request);

    /**
     * <b>description</b> :
     * <p>Queries application instance information.</p>
     * 
     * @param request the request parameters of GetAppSupabaseInstance  GetAppSupabaseInstanceRequest
     * @return GetAppSupabaseInstanceResponse
     */
    CompletableFuture<GetAppSupabaseInstanceResponse> getAppSupabaseInstance(GetAppSupabaseInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the Supabase instance information corresponding to the specified resource.</p>
     * 
     * @param request the request parameters of GetAppSupabaseSecrets  GetAppSupabaseSecretsRequest
     * @return GetAppSupabaseSecretsResponse
     */
    CompletableFuture<GetAppSupabaseSecretsResponse> getAppSupabaseSecrets(GetAppSupabaseSecretsRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the configuration information of a code generation plug-in.</p>
     * 
     * @param request the request parameters of GetAppTemplate  GetAppTemplateRequest
     * @return GetAppTemplateResponse
     */
    CompletableFuture<GetAppTemplateResponse> getAppTemplate(GetAppTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the configuration information of the code generation plug-in.</p>
     * 
     * @param request the request parameters of GetAppTokenService  GetAppTokenServiceRequest
     * @return GetAppTokenServiceResponse
     */
    CompletableFuture<GetAppTokenServiceResponse> getAppTokenService(GetAppTokenServiceRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the information of an application instance.</p>
     * 
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
     * <b>description</b> :
     * <p>Queries the Supabase instance configuration information corresponding to a resource.</p>
     * 
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
     * <b>description</b> :
     * <p>Retrieves the configuration information of the code generation plugin.</p>
     * 
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
     * <b>description</b> :
     * <p>Retrieves the configuration information of the code generation plug-in.</p>
     * 
     * @param request the request parameters of GetOssUploadPolicy  GetOssUploadPolicyRequest
     * @return GetOssUploadPolicyResponse
     */
    CompletableFuture<GetOssUploadPolicyResponse> getOssUploadPolicy(GetOssUploadPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the configuration information of the code generation plugin.</p>
     * 
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
     * <b>description</b> :
     * <p>Retrieves the configuration information for the code generation plugin.</p>
     * 
     * @param request the request parameters of GrantPromotionOfferForPartner  GrantPromotionOfferForPartnerRequest
     * @return GrantPromotionOfferForPartnerResponse
     */
    CompletableFuture<GrantPromotionOfferForPartnerResponse> grantPromotionOfferForPartner(GrantPromotionOfferForPartnerRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the configuration information of the code generation plugin.</p>
     * 
     * @param request the request parameters of InstallAppPlugin  InstallAppPluginRequest
     * @return InstallAppPluginResponse
     */
    CompletableFuture<InstallAppPluginResponse> installAppPlugin(InstallAppPluginRequest request);

    /**
     * @param request the request parameters of IntrospectAppInstanceTicketForPreview  IntrospectAppInstanceTicketForPreviewRequest
     * @return IntrospectAppInstanceTicketForPreviewResponse
     */
    CompletableFuture<IntrospectAppInstanceTicketForPreviewResponse> introspectAppInstanceTicketForPreview(IntrospectAppInstanceTicketForPreviewRequest request);

    /**
     * <b>description</b> :
     * <p>Wanxiaozhi 2.0 - Retrieves the streaming output results of AI conversations.</p>
     * 
     * @param request the request parameters of ListAIStaffChatEvents  ListAIStaffChatEventsRequest
     * @return ListAIStaffChatEventsResponse
     */
    CompletableFuture<ListAIStaffChatEventsResponse> listAIStaffChatEvents(ListAIStaffChatEventsRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the AI conversation history for Wanxiaozhi 2.0.</p>
     * 
     * @param request the request parameters of ListAIStaffChatMessages  ListAIStaffChatMessagesRequest
     * @return ListAIStaffChatMessagesResponse
     */
    CompletableFuture<ListAIStaffChatMessagesResponse> listAIStaffChatMessages(ListAIStaffChatMessagesRequest request);

    /**
     * <b>description</b> :
     * <p>Queries application instance information.</p>
     * 
     * @param request the request parameters of ListAppAssistantAgents  ListAppAssistantAgentsRequest
     * @return ListAppAssistantAgentsResponse
     */
    CompletableFuture<ListAppAssistantAgentsResponse> listAppAssistantAgents(ListAppAssistantAgentsRequest request);

    /**
     * <b>description</b> :
     * <p>Wanxiaozhi 2.0 - AI conversation history query API.</p>
     * 
     * @param request the request parameters of ListAppChatMessages  ListAppChatMessagesRequest
     * @return ListAppChatMessagesResponse
     */
    CompletableFuture<ListAppChatMessagesResponse> listAppChatMessages(ListAppChatMessagesRequest request);

    /**
     * @deprecated OpenAPI ListAppCommoditySpecificationsForPartner is deprecated, please use WebsiteBuild::2025-04-29::ListAppCommoditySpecificationsV2ForPartner instead.  * @description Retrieves the configuration information of the code generation plug-in.
     * 
     * @param request the request parameters of ListAppCommoditySpecificationsForPartner  ListAppCommoditySpecificationsForPartnerRequest
     * @return ListAppCommoditySpecificationsForPartnerResponse
     */
    @Deprecated
    CompletableFuture<ListAppCommoditySpecificationsForPartnerResponse> listAppCommoditySpecificationsForPartner(ListAppCommoditySpecificationsForPartnerRequest request);

    /**
     * <b>description</b> :
     * <p>Get QR code plugin configuration information</p>
     * 
     * @param request the request parameters of ListAppCommoditySpecificationsV2ForPartner  ListAppCommoditySpecificationsV2ForPartnerRequest
     * @return ListAppCommoditySpecificationsV2ForPartnerResponse
     */
    CompletableFuture<ListAppCommoditySpecificationsV2ForPartnerResponse> listAppCommoditySpecificationsV2ForPartner(ListAppCommoditySpecificationsV2ForPartnerRequest request);

    /**
     * <b>description</b> :
     * <p>Wanxiaozhi 2.0 - API for querying AI session history information.</p>
     * 
     * @param request the request parameters of ListAppConversationMessages  ListAppConversationMessagesRequest
     * @return ListAppConversationMessagesResponse
     */
    CompletableFuture<ListAppConversationMessagesResponse> listAppConversationMessages(ListAppConversationMessagesRequest request);

    /**
     * <b>description</b> :
     * <p>Creates an AI conversation in Wanxiaozhi 2.0.</p>
     * 
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
     * <b>description</b> :
     * <p>Retrieves the configuration information of code generation plug-ins.</p>
     * 
     * @param request the request parameters of ListAppPluginConfigs  ListAppPluginConfigsRequest
     * @return ListAppPluginConfigsResponse
     */
    CompletableFuture<ListAppPluginConfigsResponse> listAppPluginConfigs(ListAppPluginConfigsRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the configuration information of the code generation plugin.</p>
     * 
     * @param request the request parameters of ListAppPluginFiles  ListAppPluginFilesRequest
     * @return ListAppPluginFilesResponse
     */
    CompletableFuture<ListAppPluginFilesResponse> listAppPluginFiles(ListAppPluginFilesRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the configuration information of the code generation plug-in.</p>
     * 
     * @param request the request parameters of ListAppPluginVersions  ListAppPluginVersionsRequest
     * @return ListAppPluginVersionsResponse
     */
    CompletableFuture<ListAppPluginVersionsResponse> listAppPluginVersions(ListAppPluginVersionsRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the configuration information of code generation plugins.</p>
     * 
     * @param request the request parameters of ListAppPlugins  ListAppPluginsRequest
     * @return ListAppPluginsResponse
     */
    CompletableFuture<ListAppPluginsResponse> listAppPlugins(ListAppPluginsRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the information about application instances.</p>
     * 
     * @param request the request parameters of ListAppPublishHistory  ListAppPublishHistoryRequest
     * @return ListAppPublishHistoryResponse
     */
    CompletableFuture<ListAppPublishHistoryResponse> listAppPublishHistory(ListAppPublishHistoryRequest request);

    /**
     * <b>description</b> :
     * <p>Queries application instance information.</p>
     * 
     * @param request the request parameters of ListAppTemplateDicts  ListAppTemplateDictsRequest
     * @return ListAppTemplateDictsResponse
     */
    CompletableFuture<ListAppTemplateDictsResponse> listAppTemplateDicts(ListAppTemplateDictsRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the configuration information of the code generation plug-in.</p>
     * 
     * @param request the request parameters of ListAppTemplates  ListAppTemplatesRequest
     * @return ListAppTemplatesResponse
     */
    CompletableFuture<ListAppTemplatesResponse> listAppTemplates(ListAppTemplatesRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the configuration information of the code generation plugin.</p>
     * 
     * @param request the request parameters of ListIsvPaymentPluginConfigs  ListIsvPaymentPluginConfigsRequest
     * @return ListIsvPaymentPluginConfigsResponse
     */
    CompletableFuture<ListIsvPaymentPluginConfigsResponse> listIsvPaymentPluginConfigs(ListIsvPaymentPluginConfigsRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the configuration information of code generation plug-ins.</p>
     * 
     * @param request the request parameters of ListMarketplaceAppPlugins  ListMarketplaceAppPluginsRequest
     * @return ListMarketplaceAppPluginsResponse
     */
    CompletableFuture<ListMarketplaceAppPluginsResponse> listMarketplaceAppPlugins(ListMarketplaceAppPluginsRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the configuration information of code generation plugins.</p>
     * 
     * @param request the request parameters of ListMyAppPlugins  ListMyAppPluginsRequest
     * @return ListMyAppPluginsResponse
     */
    CompletableFuture<ListMyAppPluginsResponse> listMyAppPlugins(ListMyAppPluginsRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the configuration information of code generation plug-ins.</p>
     * 
     * @param request the request parameters of ListMyInstalledAppPlugins  ListMyInstalledAppPluginsRequest
     * @return ListMyInstalledAppPluginsResponse
     */
    CompletableFuture<ListMyInstalledAppPluginsResponse> listMyInstalledAppPlugins(ListMyInstalledAppPluginsRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the configuration information of the code generation plug-in.</p>
     * 
     * @param request the request parameters of ListPromotionActivitiesForPartner  ListPromotionActivitiesForPartnerRequest
     * @return ListPromotionActivitiesForPartnerResponse
     */
    CompletableFuture<ListPromotionActivitiesForPartnerResponse> listPromotionActivitiesForPartner(ListPromotionActivitiesForPartnerRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the configuration information of the code generation plug-in.</p>
     * 
     * @param request the request parameters of ListPromotionOfferRecordsForPartner  ListPromotionOfferRecordsForPartnerRequest
     * @return ListPromotionOfferRecordsForPartnerResponse
     */
    CompletableFuture<ListPromotionOfferRecordsForPartnerResponse> listPromotionOfferRecordsForPartner(ListPromotionOfferRecordsForPartnerRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the configuration information of the code generation plugin.</p>
     * 
     * @param request the request parameters of ListRbacOrgTree  ListRbacOrgTreeRequest
     * @return ListRbacOrgTreeResponse
     */
    CompletableFuture<ListRbacOrgTreeResponse> listRbacOrgTree(ListRbacOrgTreeRequest request);

    /**
     * <b>description</b> :
     * <p>Creates an AI conversation session through WanXiaoZhi 2.0.</p>
     * 
     * @param request the request parameters of ListRbacPermissions  ListRbacPermissionsRequest
     * @return ListRbacPermissionsResponse
     */
    CompletableFuture<ListRbacPermissionsResponse> listRbacPermissions(ListRbacPermissionsRequest request);

    /**
     * <b>description</b> :
     * <p>Queries application instance information.</p>
     * 
     * @param request the request parameters of ListRbacRoleHierarchy  ListRbacRoleHierarchyRequest
     * @return ListRbacRoleHierarchyResponse
     */
    CompletableFuture<ListRbacRoleHierarchyResponse> listRbacRoleHierarchy(ListRbacRoleHierarchyRequest request);

    /**
     * <b>description</b> :
     * <p>Queries application instance information.</p>
     * 
     * @param request the request parameters of ListRbacRoles  ListRbacRolesRequest
     * @return ListRbacRolesResponse
     */
    CompletableFuture<ListRbacRolesResponse> listRbacRoles(ListRbacRolesRequest request);

    /**
     * <b>description</b> :
     * <p>Modifies the specifications of a website building application instance.</p>
     * 
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
     * <b>description</b> :
     * <p>Queries application instance information.</p>
     * 
     * @param request the request parameters of NotifyAppNotificationForAdmin  NotifyAppNotificationForAdminRequest
     * @return NotifyAppNotificationForAdminResponse
     */
    CompletableFuture<NotifyAppNotificationForAdminResponse> notifyAppNotificationForAdmin(NotifyAppNotificationForAdminRequest request);

    /**
     * @param request the request parameters of OfflineAppInstance  OfflineAppInstanceRequest
     * @return OfflineAppInstanceResponse
     */
    CompletableFuture<OfflineAppInstanceResponse> offlineAppInstance(OfflineAppInstanceRequest request);

    /**
     * @param request the request parameters of OnlineAppInstance  OnlineAppInstanceRequest
     * @return OnlineAppInstanceResponse
     */
    CompletableFuture<OnlineAppInstanceResponse> onlineAppInstance(OnlineAppInstanceRequest request);

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
     * <b>description</b> :
     * <p>Retrieves the configuration information of the code generation plug-in.</p>
     * 
     * @param request the request parameters of OperateAppTemplateLike  OperateAppTemplateLikeRequest
     * @return OperateAppTemplateLikeResponse
     */
    CompletableFuture<OperateAppTemplateLikeResponse> operateAppTemplateLike(OperateAppTemplateLikeRequest request);

    /**
     * <b>description</b> :
     * <p>The Supabase instance information for the operated resource.</p>
     * 
     * @param request the request parameters of OperateSupabaseForAdmin  OperateSupabaseForAdminRequest
     * @return OperateSupabaseForAdminResponse
     */
    CompletableFuture<OperateSupabaseForAdminResponse> operateSupabaseForAdmin(OperateSupabaseForAdminRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the application instance information.</p>
     * 
     * @param request the request parameters of PublishAppInstance  PublishAppInstanceRequest
     * @return PublishAppInstanceResponse
     */
    CompletableFuture<PublishAppInstanceResponse> publishAppInstance(PublishAppInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the Supabase instance information corresponding to a resource.</p>
     * 
     * @param request the request parameters of PushResourceMeasure  PushResourceMeasureRequest
     * @return PushResourceMeasureResponse
     */
    CompletableFuture<PushResourceMeasureResponse> pushResourceMeasure(PushResourceMeasureRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the Supabase instance information corresponding to the resource.</p>
     * 
     * @param request the request parameters of QueryInspirationAccountDetails  QueryInspirationAccountDetailsRequest
     * @return QueryInspirationAccountDetailsResponse
     */
    CompletableFuture<QueryInspirationAccountDetailsResponse> queryInspirationAccountDetails(QueryInspirationAccountDetailsRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the Supabase instance information corresponding to the resource.</p>
     * 
     * @param request the request parameters of QueryInspirationBalance  QueryInspirationBalanceRequest
     * @return QueryInspirationBalanceResponse
     */
    CompletableFuture<QueryInspirationBalanceResponse> queryInspirationBalance(QueryInspirationBalanceRequest request);

    /**
     * @param request the request parameters of QueryInspirationBalanceForPartner  QueryInspirationBalanceForPartnerRequest
     * @return QueryInspirationBalanceForPartnerResponse
     */
    CompletableFuture<QueryInspirationBalanceForPartnerResponse> queryInspirationBalanceForPartner(QueryInspirationBalanceForPartnerRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the configuration information of the code generation plugin.</p>
     * 
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
     * <b>description</b> :
     * <p>Queries the list of material generation tasks.</p>
     * 
     * @param request the request parameters of QueryMaterialTaskList  QueryMaterialTaskListRequest
     * @return QueryMaterialTaskListResponse
     */
    CompletableFuture<QueryMaterialTaskListResponse> queryMaterialTaskList(QueryMaterialTaskListRequest request);

    /**
     * <b>description</b> :
     * <p>Queries application instance information.</p>
     * 
     * @param request the request parameters of QueryRbacRole  QueryRbacRoleRequest
     * @return QueryRbacRoleResponse
     */
    CompletableFuture<QueryRbacRoleResponse> queryRbacRole(QueryRbacRoleRequest request);

    /**
     * <b>description</b> :
     * <p>Creates an AI conversation session for Wan Xiaozhi 2.0.</p>
     * 
     * @param request the request parameters of QueryRbacRolePermissions  QueryRbacRolePermissionsRequest
     * @return QueryRbacRolePermissionsResponse
     */
    CompletableFuture<QueryRbacRolePermissionsResponse> queryRbacRolePermissions(QueryRbacRolePermissionsRequest request);

    /**
     * <b>description</b> :
     * <p>Queries application instance information.</p>
     * 
     * @param request the request parameters of QueryRbacUserRoles  QueryRbacUserRolesRequest
     * @return QueryRbacUserRolesResponse
     */
    CompletableFuture<QueryRbacUserRolesResponse> queryRbacUserRoles(QueryRbacUserRolesRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the authentication configuration of the Supabase instance associated with the resource.</p>
     * 
     * @param request the request parameters of QuerySupabaseAuthConfigsForAdmin  QuerySupabaseAuthConfigsForAdminRequest
     * @return QuerySupabaseAuthConfigsForAdminResponse
     */
    CompletableFuture<QuerySupabaseAuthConfigsForAdminResponse> querySupabaseAuthConfigsForAdmin(QuerySupabaseAuthConfigsForAdminRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the configuration information of the Supabase instance associated with a resource.</p>
     * 
     * @param request the request parameters of QuerySupabaseConfigsForAdmin  QuerySupabaseConfigsForAdminRequest
     * @return QuerySupabaseConfigsForAdminResponse
     */
    CompletableFuture<QuerySupabaseConfigsForAdminResponse> querySupabaseConfigsForAdmin(QuerySupabaseConfigsForAdminRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the information of the Supabase instance associated with a resource.</p>
     * 
     * @param request the request parameters of QuerySupabaseInstanceInfoForAdmin  QuerySupabaseInstanceInfoForAdminRequest
     * @return QuerySupabaseInstanceInfoForAdminResponse
     */
    CompletableFuture<QuerySupabaseInstanceInfoForAdminResponse> querySupabaseInstanceInfoForAdmin(QuerySupabaseInstanceInfoForAdminRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the configuration information of the code generation plug-in.</p>
     * 
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
     * <b>description</b> :
     * <p>Queries application instance information.</p>
     * 
     * @param request the request parameters of RemoveRbacRoleHierarchy  RemoveRbacRoleHierarchyRequest
     * @return RemoveRbacRoleHierarchyResponse
     */
    CompletableFuture<RemoveRbacRoleHierarchyResponse> removeRbacRoleHierarchy(RemoveRbacRoleHierarchyRequest request);

    /**
     * @param request the request parameters of RenewAppInstance  RenewAppInstanceRequest
     * @return RenewAppInstanceResponse
     */
    CompletableFuture<RenewAppInstanceResponse> renewAppInstance(RenewAppInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the configuration information of the code generation plug-in.</p>
     * 
     * @param request the request parameters of RenewAppSandbox  RenewAppSandboxRequest
     * @return RenewAppSandboxResponse
     */
    CompletableFuture<RenewAppSandboxResponse> renewAppSandbox(RenewAppSandboxRequest request);

    /**
     * <b>description</b> :
     * <p>Reports the publishing result.</p>
     * 
     * @param request the request parameters of ReportChannelPublishResult  ReportChannelPublishResultRequest
     * @return ReportChannelPublishResultResponse
     */
    CompletableFuture<ReportChannelPublishResultResponse> reportChannelPublishResult(ReportChannelPublishResultRequest request);

    /**
     * <b>description</b> :
     * <p>Retries a publish operation.</p>
     * 
     * @param request the request parameters of RetryChannelPublish  RetryChannelPublishRequest
     * @return RetryChannelPublishResponse
     */
    CompletableFuture<RetryChannelPublishResponse> retryChannelPublish(RetryChannelPublishRequest request);

    /**
     * <b>description</b> :
     * <p>Wanxiaozhi 2.0 AI conversation.</p>
     * 
     * @param request the request parameters of RevokeRbacUserRole  RevokeRbacUserRoleRequest
     * @return RevokeRbacUserRoleResponse
     */
    CompletableFuture<RevokeRbacUserRoleResponse> revokeRbacUserRole(RevokeRbacUserRoleRequest request);

    /**
     * <b>description</b> :
     * <p>Rewrites a channel title.</p>
     * 
     * @param request the request parameters of RewriteChannelTitle  RewriteChannelTitleRequest
     * @return RewriteChannelTitleResponse
     */
    CompletableFuture<RewriteChannelTitleResponse> rewriteChannelTitle(RewriteChannelTitleRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the configuration information of the code generation plug-in.</p>
     * 
     * @param request the request parameters of RollbackAppCodeSnapshot  RollbackAppCodeSnapshotRequest
     * @return RollbackAppCodeSnapshotResponse
     */
    CompletableFuture<RollbackAppCodeSnapshotResponse> rollbackAppCodeSnapshot(RollbackAppCodeSnapshotRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the details of an application instance.</p>
     * 
     * @param request the request parameters of RollbackAppInstancePublish  RollbackAppInstancePublishRequest
     * @return RollbackAppInstancePublishResponse
     */
    CompletableFuture<RollbackAppInstancePublishResponse> rollbackAppInstancePublish(RollbackAppInstancePublishRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the configuration information of the code generation plugin.</p>
     * 
     * @param request the request parameters of RollbackAppPluginVersion  RollbackAppPluginVersionRequest
     * @return RollbackAppPluginVersionResponse
     */
    CompletableFuture<RollbackAppPluginVersionResponse> rollbackAppPluginVersion(RollbackAppPluginVersionRequest request);

    /**
     * <b>description</b> :
     * <p>Get code generation plugin configuration information</p>
     * 
     * @param request the request parameters of SaveAppRequirement  SaveAppRequirementRequest
     * @return SaveAppRequirementResponse
     */
    CompletableFuture<SaveAppRequirementResponse> saveAppRequirement(SaveAppRequirementRequest request);

    /**
     * <b>description</b> :
     * <p>The Supabase instance information corresponding to the operated resource.</p>
     * 
     * @param request the request parameters of SaveAppSupabaseSecrets  SaveAppSupabaseSecretsRequest
     * @return SaveAppSupabaseSecretsResponse
     */
    CompletableFuture<SaveAppSupabaseSecretsResponse> saveAppSupabaseSecrets(SaveAppSupabaseSecretsRequest request);

    /**
     * <b>description</b> :
     * <p>Saves a channel draft.</p>
     * 
     * @param request the request parameters of SaveChannelDraft  SaveChannelDraftRequest
     * @return SaveChannelDraftResponse
     */
    CompletableFuture<SaveChannelDraftResponse> saveChannelDraft(SaveChannelDraftRequest request);

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
     * <b>description</b> :
     * <p>Retrieves the configuration information of the code generation plugin.</p>
     * 
     * @param request the request parameters of SetRbacRoleHierarchy  SetRbacRoleHierarchyRequest
     * @return SetRbacRoleHierarchyResponse
     */
    CompletableFuture<SetRbacRoleHierarchyResponse> setRbacRoleHierarchy(SetRbacRoleHierarchyRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the configuration information of the code generation plugin.</p>
     * 
     * @param request the request parameters of SubmitAppSeoIndex  SubmitAppSeoIndexRequest
     * @return SubmitAppSeoIndexResponse
     */
    CompletableFuture<SubmitAppSeoIndexResponse> submitAppSeoIndex(SubmitAppSeoIndexRequest request);

    /**
     * <b>description</b> :
     * <p>Submits a material generation task.</p>
     * 
     * @param request the request parameters of SubmitMaterialTask  SubmitMaterialTaskRequest
     * @return SubmitMaterialTaskResponse
     */
    CompletableFuture<SubmitMaterialTaskResponse> submitMaterialTask(SubmitMaterialTaskRequest request);

    /**
     * <b>description</b> :
     * <p>Creates an AI conversation through the Wanxiaozhi 2.0 interface.</p>
     * 
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
     * <b>description</b> :
     * <p>Translates a channel draft.</p>
     * 
     * @param request the request parameters of TranslateChannelDraft  TranslateChannelDraftRequest
     * @return TranslateChannelDraftResponse
     */
    CompletableFuture<TranslateChannelDraftResponse> translateChannelDraft(TranslateChannelDraftRequest request);

    /**
     * @param request the request parameters of UnbindAppDomain  UnbindAppDomainRequest
     * @return UnbindAppDomainResponse
     */
    CompletableFuture<UnbindAppDomainResponse> unbindAppDomain(UnbindAppDomainRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the configuration information of the code generation plug-in.</p>
     * 
     * @param request the request parameters of UninstallAppPlugin  UninstallAppPluginRequest
     * @return UninstallAppPluginResponse
     */
    CompletableFuture<UninstallAppPluginResponse> uninstallAppPlugin(UninstallAppPluginRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the AI conversation history for Wanxiaozhi 2.0.</p>
     * 
     * @param request the request parameters of UpdateAppChatMessage  UpdateAppChatMessageRequest
     * @return UpdateAppChatMessageResponse
     */
    CompletableFuture<UpdateAppChatMessageResponse> updateAppChatMessage(UpdateAppChatMessageRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the configuration information of the code generation plug-in.</p>
     * 
     * @param request the request parameters of UpdateAppCode  UpdateAppCodeRequest
     * @return UpdateAppCodeResponse
     */
    CompletableFuture<UpdateAppCodeResponse> updateAppCode(UpdateAppCodeRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the configuration information of the code generation plugin.</p>
     * 
     * @param request the request parameters of UpdateAppFile  UpdateAppFileRequest
     * @return UpdateAppFileResponse
     */
    CompletableFuture<UpdateAppFileResponse> updateAppFile(UpdateAppFileRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the information of an application instance.</p>
     * 
     * @param request the request parameters of UpdateAppInstance  UpdateAppInstanceRequest
     * @return UpdateAppInstanceResponse
     */
    CompletableFuture<UpdateAppInstanceResponse> updateAppInstance(UpdateAppInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the configuration information of the code generation plugin.</p>
     * 
     * @param request the request parameters of UpdateAppPlugin  UpdateAppPluginRequest
     * @return UpdateAppPluginResponse
     */
    CompletableFuture<UpdateAppPluginResponse> updateAppPlugin(UpdateAppPluginRequest request);

    /**
     * <b>description</b> :
     * <p>Wanxiaozhi 2.0 AI conversation.</p>
     * 
     * @param request the request parameters of UpdateAppSeoStatus  UpdateAppSeoStatusRequest
     * @return UpdateAppSeoStatusResponse
     */
    CompletableFuture<UpdateAppSeoStatusResponse> updateAppSeoStatus(UpdateAppSeoStatusRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the Supabase instance authentication configuration information corresponding to a resource.</p>
     * 
     * @param request the request parameters of UpdateAppSupabaseAuthConfig  UpdateAppSupabaseAuthConfigRequest
     * @return UpdateAppSupabaseAuthConfigResponse
     */
    CompletableFuture<UpdateAppSupabaseAuthConfigResponse> updateAppSupabaseAuthConfig(UpdateAppSupabaseAuthConfigRequest request);

    /**
     * <b>description</b> :
     * <p>The Supabase instance information corresponding to the operated resource.</p>
     * 
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
     * <b>description</b> :
     * <p>Retrieves the configuration information of the code generation plug-in.</p>
     * 
     * @param request the request parameters of UpdateRbacOrgUnit  UpdateRbacOrgUnitRequest
     * @return UpdateRbacOrgUnitResponse
     */
    CompletableFuture<UpdateRbacOrgUnitResponse> updateRbacOrgUnit(UpdateRbacOrgUnitRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the configuration information of the code generation plug-in.</p>
     * 
     * @param request the request parameters of UpdateRbacRole  UpdateRbacRoleRequest
     * @return UpdateRbacRoleResponse
     */
    CompletableFuture<UpdateRbacRoleResponse> updateRbacRole(UpdateRbacRoleRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the configuration information of the code generation plugin.</p>
     * 
     * @param request the request parameters of UploadAppPluginVersion  UploadAppPluginVersionRequest
     * @return UploadAppPluginVersionResponse
     */
    CompletableFuture<UploadAppPluginVersionResponse> uploadAppPluginVersion(UploadAppPluginVersionRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the configuration information of the code generation plug-in.</p>
     * 
     * @param request the request parameters of UploadAppSiteValidationFile  UploadAppSiteValidationFileRequest
     * @return UploadAppSiteValidationFileResponse
     */
    CompletableFuture<UploadAppSiteValidationFileResponse> uploadAppSiteValidationFile(UploadAppSiteValidationFileRequest request);

    /**
     * <b>description</b> :
     * <p>The Supabase instance information corresponding to the resource.</p>
     * 
     * @param request the request parameters of UploadMaterialFile  UploadMaterialFileRequest
     * @return UploadMaterialFileResponse
     */
    CompletableFuture<UploadMaterialFileResponse> uploadMaterialFile(UploadMaterialFileRequest request);

    /**
     * <b>description</b> :
     * <p>The Supabase instance information corresponding to the operation resource.</p>
     * 
     * @param request the request parameters of UploadMaterialFileForAdmin  UploadMaterialFileForAdminRequest
     * @return UploadMaterialFileForAdminResponse
     */
    CompletableFuture<UploadMaterialFileForAdminResponse> uploadMaterialFileForAdmin(UploadMaterialFileForAdminRequest request);

}
