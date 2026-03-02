// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.neuron20211115.models.*;
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
     * @param request the request parameters of AddOrQuitPdpLaneForServiceGroup  AddOrQuitPdpLaneForServiceGroupRequest
     * @return AddOrQuitPdpLaneForServiceGroupResponse
     */
    CompletableFuture<AddOrQuitPdpLaneForServiceGroupResponse> addOrQuitPdpLaneForServiceGroup(AddOrQuitPdpLaneForServiceGroupRequest request);

    /**
     * @param request the request parameters of AuditForkReview  AuditForkReviewRequest
     * @return AuditForkReviewResponse
     */
    CompletableFuture<AuditForkReviewResponse> auditForkReview(AuditForkReviewRequest request);

    /**
     * @param request the request parameters of AuditPbcInvokeReview  AuditPbcInvokeReviewRequest
     * @return AuditPbcInvokeReviewResponse
     */
    CompletableFuture<AuditPbcInvokeReviewResponse> auditPbcInvokeReview(AuditPbcInvokeReviewRequest request);

    /**
     * @param request the request parameters of AuthorizeProducts  AuthorizeProductsRequest
     * @return AuthorizeProductsResponse
     */
    CompletableFuture<AuthorizeProductsResponse> authorizeProducts(AuthorizeProductsRequest request);

    /**
     * @param request the request parameters of BatchGrantRolesToDeveloper  BatchGrantRolesToDeveloperRequest
     * @return BatchGrantRolesToDeveloperResponse
     */
    CompletableFuture<BatchGrantRolesToDeveloperResponse> batchGrantRolesToDeveloper(BatchGrantRolesToDeveloperRequest request);

    /**
     * @param request the request parameters of CheckDeveloperRole  CheckDeveloperRoleRequest
     * @return CheckDeveloperRoleResponse
     */
    CompletableFuture<CheckDeveloperRoleResponse> checkDeveloperRole(CheckDeveloperRoleRequest request);

    /**
     * @param request the request parameters of CompleteRegisterLibrary  CompleteRegisterLibraryRequest
     * @return CompleteRegisterLibraryResponse
     */
    CompletableFuture<CompleteRegisterLibraryResponse> completeRegisterLibrary(CompleteRegisterLibraryRequest request);

    /**
     * @param request the request parameters of CompleteRegistrationPbcVersion  CompleteRegistrationPbcVersionRequest
     * @return CompleteRegistrationPbcVersionResponse
     */
    CompletableFuture<CompleteRegistrationPbcVersionResponse> completeRegistrationPbcVersion(CompleteRegistrationPbcVersionRequest request);

    /**
     * @param request the request parameters of ContinueDeployment  ContinueDeploymentRequest
     * @return ContinueDeploymentResponse
     */
    CompletableFuture<ContinueDeploymentResponse> continueDeployment(ContinueDeploymentRequest request);

    /**
     * @param request the request parameters of CreateAssetWatch  CreateAssetWatchRequest
     * @return CreateAssetWatchResponse
     */
    CompletableFuture<CreateAssetWatchResponse> createAssetWatch(CreateAssetWatchRequest request);

    /**
     * @param request the request parameters of CreateComponent  CreateComponentRequest
     * @return CreateComponentResponse
     */
    CompletableFuture<CreateComponentResponse> createComponent(CreateComponentRequest request);

    /**
     * @param request the request parameters of CreateComponentTemplate  CreateComponentTemplateRequest
     * @return CreateComponentTemplateResponse
     */
    CompletableFuture<CreateComponentTemplateResponse> createComponentTemplate(CreateComponentTemplateRequest request);

    /**
     * @param request the request parameters of CreateDeveloper  CreateDeveloperRequest
     * @return CreateDeveloperResponse
     */
    CompletableFuture<CreateDeveloperResponse> createDeveloper(CreateDeveloperRequest request);

    /**
     * @param request the request parameters of CreateEnterprise  CreateEnterpriseRequest
     * @return CreateEnterpriseResponse
     */
    CompletableFuture<CreateEnterpriseResponse> createEnterprise(CreateEnterpriseRequest request);

    /**
     * @param request the request parameters of CreateForkReview  CreateForkReviewRequest
     * @return CreateForkReviewResponse
     */
    CompletableFuture<CreateForkReviewResponse> createForkReview(CreateForkReviewRequest request);

    /**
     * @param request the request parameters of CreateGreyPdpServiceGroup  CreateGreyPdpServiceGroupRequest
     * @return CreateGreyPdpServiceGroupResponse
     */
    CompletableFuture<CreateGreyPdpServiceGroupResponse> createGreyPdpServiceGroup(CreateGreyPdpServiceGroupRequest request);

    /**
     * @param request the request parameters of CreateLibrary  CreateLibraryRequest
     * @return CreateLibraryResponse
     */
    CompletableFuture<CreateLibraryResponse> createLibrary(CreateLibraryRequest request);

    /**
     * @param request the request parameters of CreateLibraryInstruction  CreateLibraryInstructionRequest
     * @return CreateLibraryInstructionResponse
     */
    CompletableFuture<CreateLibraryInstructionResponse> createLibraryInstruction(CreateLibraryInstructionRequest request);

    /**
     * @param request the request parameters of CreateLibraryReview  CreateLibraryReviewRequest
     * @return CreateLibraryReviewResponse
     */
    CompletableFuture<CreateLibraryReviewResponse> createLibraryReview(CreateLibraryReviewRequest request);

    /**
     * @param request the request parameters of CreateLibrarySchema  CreateLibrarySchemaRequest
     * @return CreateLibrarySchemaResponse
     */
    CompletableFuture<CreateLibrarySchemaResponse> createLibrarySchema(CreateLibrarySchemaRequest request);

    /**
     * @param request the request parameters of CreateMonitorArmsAlert  CreateMonitorArmsAlertRequest
     * @return CreateMonitorArmsAlertResponse
     */
    CompletableFuture<CreateMonitorArmsAlertResponse> createMonitorArmsAlert(CreateMonitorArmsAlertRequest request);

    /**
     * @param request the request parameters of CreateMonitorArmsAlerts  CreateMonitorArmsAlertsRequest
     * @return CreateMonitorArmsAlertsResponse
     */
    CompletableFuture<CreateMonitorArmsAlertsResponse> createMonitorArmsAlerts(CreateMonitorArmsAlertsRequest request);

    /**
     * @param request the request parameters of CreateMonitorContact  CreateMonitorContactRequest
     * @return CreateMonitorContactResponse
     */
    CompletableFuture<CreateMonitorContactResponse> createMonitorContact(CreateMonitorContactRequest request);

    /**
     * @param request the request parameters of CreateMonitorContactGroup  CreateMonitorContactGroupRequest
     * @return CreateMonitorContactGroupResponse
     */
    CompletableFuture<CreateMonitorContactGroupResponse> createMonitorContactGroup(CreateMonitorContactGroupRequest request);

    /**
     * @param request the request parameters of CreateMonitorGroupMember  CreateMonitorGroupMemberRequest
     * @return CreateMonitorGroupMemberResponse
     */
    CompletableFuture<CreateMonitorGroupMemberResponse> createMonitorGroupMember(CreateMonitorGroupMemberRequest request);

    /**
     * @param request the request parameters of CreateMonitorMqAlert  CreateMonitorMqAlertRequest
     * @return CreateMonitorMqAlertResponse
     */
    CompletableFuture<CreateMonitorMqAlertResponse> createMonitorMqAlert(CreateMonitorMqAlertRequest request);

    /**
     * @param request the request parameters of CreateMonitorMqAlerts  CreateMonitorMqAlertsRequest
     * @return CreateMonitorMqAlertsResponse
     */
    CompletableFuture<CreateMonitorMqAlertsResponse> createMonitorMqAlerts(CreateMonitorMqAlertsRequest request);

    /**
     * @param request the request parameters of CreateMonitorSlsAlert  CreateMonitorSlsAlertRequest
     * @return CreateMonitorSlsAlertResponse
     */
    CompletableFuture<CreateMonitorSlsAlertResponse> createMonitorSlsAlert(CreateMonitorSlsAlertRequest request);

    /**
     * @param request the request parameters of CreateMonitorSlsAlerts  CreateMonitorSlsAlertsRequest
     * @return CreateMonitorSlsAlertsResponse
     */
    CompletableFuture<CreateMonitorSlsAlertsResponse> createMonitorSlsAlerts(CreateMonitorSlsAlertsRequest request);

    /**
     * @param request the request parameters of CreateMonitorWebhook  CreateMonitorWebhookRequest
     * @return CreateMonitorWebhookResponse
     */
    CompletableFuture<CreateMonitorWebhookResponse> createMonitorWebhook(CreateMonitorWebhookRequest request);

    /**
     * @param request the request parameters of CreateMqGroup  CreateMqGroupRequest
     * @return CreateMqGroupResponse
     */
    CompletableFuture<CreateMqGroupResponse> createMqGroup(CreateMqGroupRequest request);

    /**
     * @param request the request parameters of CreateMqTopic  CreateMqTopicRequest
     * @return CreateMqTopicResponse
     */
    CompletableFuture<CreateMqTopicResponse> createMqTopic(CreateMqTopicRequest request);

    /**
     * @param request the request parameters of CreatePbc  CreatePbcRequest
     * @return CreatePbcResponse
     */
    CompletableFuture<CreatePbcResponse> createPbc(CreatePbcRequest request);

    /**
     * @param request the request parameters of CreatePbcApiSchema  CreatePbcApiSchemaRequest
     * @return CreatePbcApiSchemaResponse
     */
    CompletableFuture<CreatePbcApiSchemaResponse> createPbcApiSchema(CreatePbcApiSchemaRequest request);

    /**
     * @param request the request parameters of CreatePbcInstruction  CreatePbcInstructionRequest
     * @return CreatePbcInstructionResponse
     */
    CompletableFuture<CreatePbcInstructionResponse> createPbcInstruction(CreatePbcInstructionRequest request);

    /**
     * @param request the request parameters of CreatePbcInvoke  CreatePbcInvokeRequest
     * @return CreatePbcInvokeResponse
     */
    CompletableFuture<CreatePbcInvokeResponse> createPbcInvoke(CreatePbcInvokeRequest request);

    /**
     * @param request the request parameters of CreatePbcInvokeReview  CreatePbcInvokeReviewRequest
     * @return CreatePbcInvokeReviewResponse
     */
    CompletableFuture<CreatePbcInvokeReviewResponse> createPbcInvokeReview(CreatePbcInvokeReviewRequest request);

    /**
     * @param request the request parameters of CreatePbcReview  CreatePbcReviewRequest
     * @return CreatePbcReviewResponse
     */
    CompletableFuture<CreatePbcReviewResponse> createPbcReview(CreatePbcReviewRequest request);

    /**
     * @param request the request parameters of CreatePbcSchema  CreatePbcSchemaRequest
     * @return CreatePbcSchemaResponse
     */
    CompletableFuture<CreatePbcSchemaResponse> createPbcSchema(CreatePbcSchemaRequest request);

    /**
     * @param request the request parameters of CreatePbcVersion  CreatePbcVersionRequest
     * @return CreatePbcVersionResponse
     */
    CompletableFuture<CreatePbcVersionResponse> createPbcVersion(CreatePbcVersionRequest request);

    /**
     * @param request the request parameters of CreatePdpConfig  CreatePdpConfigRequest
     * @return CreatePdpConfigResponse
     */
    CompletableFuture<CreatePdpConfigResponse> createPdpConfig(CreatePdpConfigRequest request);

    /**
     * @param request the request parameters of CreatePdpLane  CreatePdpLaneRequest
     * @return CreatePdpLaneResponse
     */
    CompletableFuture<CreatePdpLaneResponse> createPdpLane(CreatePdpLaneRequest request);

    /**
     * @param request the request parameters of CreatePdpPbc  CreatePdpPbcRequest
     * @return CreatePdpPbcResponse
     */
    CompletableFuture<CreatePdpPbcResponse> createPdpPbc(CreatePdpPbcRequest request);

    /**
     * @param request the request parameters of CreatePdpService  CreatePdpServiceRequest
     * @return CreatePdpServiceResponse
     */
    CompletableFuture<CreatePdpServiceResponse> createPdpService(CreatePdpServiceRequest request);

    /**
     * @param request the request parameters of CreatePdpServiceGroup  CreatePdpServiceGroupRequest
     * @return CreatePdpServiceGroupResponse
     */
    CompletableFuture<CreatePdpServiceGroupResponse> createPdpServiceGroup(CreatePdpServiceGroupRequest request);

    /**
     * @param request the request parameters of CreatePrivilege  CreatePrivilegeRequest
     * @return CreatePrivilegeResponse
     */
    CompletableFuture<CreatePrivilegeResponse> createPrivilege(CreatePrivilegeRequest request);

    /**
     * @param request the request parameters of CreatePrivilegePop  CreatePrivilegePopRequest
     * @return CreatePrivilegePopResponse
     */
    CompletableFuture<CreatePrivilegePopResponse> createPrivilegePop(CreatePrivilegePopRequest request);

    /**
     * @param request the request parameters of CreateProduct  CreateProductRequest
     * @return CreateProductResponse
     */
    CompletableFuture<CreateProductResponse> createProduct(CreateProductRequest request);

    /**
     * @param request the request parameters of CreateRepoFork  CreateRepoForkRequest
     * @return CreateRepoForkResponse
     */
    CompletableFuture<CreateRepoForkResponse> createRepoFork(CreateRepoForkRequest request);

    /**
     * @param request the request parameters of CreateResource  CreateResourceRequest
     * @return CreateResourceResponse
     */
    CompletableFuture<CreateResourceResponse> createResource(CreateResourceRequest request);

    /**
     * @param request the request parameters of CreateRole  CreateRoleRequest
     * @return CreateRoleResponse
     */
    CompletableFuture<CreateRoleResponse> createRole(CreateRoleRequest request);

    /**
     * @param request the request parameters of CreateSettled  CreateSettledRequest
     * @return CreateSettledResponse
     */
    CompletableFuture<CreateSettledResponse> createSettled(CreateSettledRequest request);

    /**
     * @param request the request parameters of DeleteComponent  DeleteComponentRequest
     * @return DeleteComponentResponse
     */
    CompletableFuture<DeleteComponentResponse> deleteComponent(DeleteComponentRequest request);

    /**
     * @param request the request parameters of DeleteComponentTemplate  DeleteComponentTemplateRequest
     * @return DeleteComponentTemplateResponse
     */
    CompletableFuture<DeleteComponentTemplateResponse> deleteComponentTemplate(DeleteComponentTemplateRequest request);

    /**
     * @param request the request parameters of DeleteDeveloper  DeleteDeveloperRequest
     * @return DeleteDeveloperResponse
     */
    CompletableFuture<DeleteDeveloperResponse> deleteDeveloper(DeleteDeveloperRequest request);

    /**
     * @param request the request parameters of DeleteEnterprise  DeleteEnterpriseRequest
     * @return DeleteEnterpriseResponse
     */
    CompletableFuture<DeleteEnterpriseResponse> deleteEnterprise(DeleteEnterpriseRequest request);

    /**
     * @param request the request parameters of DeleteLibrary  DeleteLibraryRequest
     * @return DeleteLibraryResponse
     */
    CompletableFuture<DeleteLibraryResponse> deleteLibrary(DeleteLibraryRequest request);

    /**
     * @param request the request parameters of DeleteLibraryInstruction  DeleteLibraryInstructionRequest
     * @return DeleteLibraryInstructionResponse
     */
    CompletableFuture<DeleteLibraryInstructionResponse> deleteLibraryInstruction(DeleteLibraryInstructionRequest request);

    /**
     * @param request the request parameters of DeleteLibrarySchema  DeleteLibrarySchemaRequest
     * @return DeleteLibrarySchemaResponse
     */
    CompletableFuture<DeleteLibrarySchemaResponse> deleteLibrarySchema(DeleteLibrarySchemaRequest request);

    /**
     * @param request the request parameters of DeleteMonitorAlert  DeleteMonitorAlertRequest
     * @return DeleteMonitorAlertResponse
     */
    CompletableFuture<DeleteMonitorAlertResponse> deleteMonitorAlert(DeleteMonitorAlertRequest request);

    /**
     * @param request the request parameters of DeleteMonitorContact  DeleteMonitorContactRequest
     * @return DeleteMonitorContactResponse
     */
    CompletableFuture<DeleteMonitorContactResponse> deleteMonitorContact(DeleteMonitorContactRequest request);

    /**
     * @param request the request parameters of DeleteMonitorContactGroup  DeleteMonitorContactGroupRequest
     * @return DeleteMonitorContactGroupResponse
     */
    CompletableFuture<DeleteMonitorContactGroupResponse> deleteMonitorContactGroup(DeleteMonitorContactGroupRequest request);

    /**
     * @param request the request parameters of DeleteMonitorGroupMember  DeleteMonitorGroupMemberRequest
     * @return DeleteMonitorGroupMemberResponse
     */
    CompletableFuture<DeleteMonitorGroupMemberResponse> deleteMonitorGroupMember(DeleteMonitorGroupMemberRequest request);

    /**
     * @param request the request parameters of DeleteMonitorWebhook  DeleteMonitorWebhookRequest
     * @return DeleteMonitorWebhookResponse
     */
    CompletableFuture<DeleteMonitorWebhookResponse> deleteMonitorWebhook(DeleteMonitorWebhookRequest request);

    /**
     * @param request the request parameters of DeleteMqGroup  DeleteMqGroupRequest
     * @return DeleteMqGroupResponse
     */
    CompletableFuture<DeleteMqGroupResponse> deleteMqGroup(DeleteMqGroupRequest request);

    /**
     * @param request the request parameters of DeleteMqTopic  DeleteMqTopicRequest
     * @return DeleteMqTopicResponse
     */
    CompletableFuture<DeleteMqTopicResponse> deleteMqTopic(DeleteMqTopicRequest request);

    /**
     * @param request the request parameters of DeletePbcInvoke  DeletePbcInvokeRequest
     * @return DeletePbcInvokeResponse
     */
    CompletableFuture<DeletePbcInvokeResponse> deletePbcInvoke(DeletePbcInvokeRequest request);

    /**
     * @param request the request parameters of DeletePdpConfig  DeletePdpConfigRequest
     * @return DeletePdpConfigResponse
     */
    CompletableFuture<DeletePdpConfigResponse> deletePdpConfig(DeletePdpConfigRequest request);

    /**
     * @param request the request parameters of DeletePdpLane  DeletePdpLaneRequest
     * @return DeletePdpLaneResponse
     */
    CompletableFuture<DeletePdpLaneResponse> deletePdpLane(DeletePdpLaneRequest request);

    /**
     * @param request the request parameters of DeletePdpLaneInletService  DeletePdpLaneInletServiceRequest
     * @return DeletePdpLaneInletServiceResponse
     */
    CompletableFuture<DeletePdpLaneInletServiceResponse> deletePdpLaneInletService(DeletePdpLaneInletServiceRequest request);

    /**
     * @param request the request parameters of DeletePdpLaneServiceGroup  DeletePdpLaneServiceGroupRequest
     * @return DeletePdpLaneServiceGroupResponse
     */
    CompletableFuture<DeletePdpLaneServiceGroupResponse> deletePdpLaneServiceGroup(DeletePdpLaneServiceGroupRequest request);

    /**
     * @param request the request parameters of DeletePdpPbc  DeletePdpPbcRequest
     * @return DeletePdpPbcResponse
     */
    CompletableFuture<DeletePdpPbcResponse> deletePdpPbc(DeletePdpPbcRequest request);

    /**
     * @param request the request parameters of DeletePdpService  DeletePdpServiceRequest
     * @return DeletePdpServiceResponse
     */
    CompletableFuture<DeletePdpServiceResponse> deletePdpService(DeletePdpServiceRequest request);

    /**
     * @param request the request parameters of DeletePdpServiceGroup  DeletePdpServiceGroupRequest
     * @return DeletePdpServiceGroupResponse
     */
    CompletableFuture<DeletePdpServiceGroupResponse> deletePdpServiceGroup(DeletePdpServiceGroupRequest request);

    /**
     * @param request the request parameters of DeletePrivilege  DeletePrivilegeRequest
     * @return DeletePrivilegeResponse
     */
    CompletableFuture<DeletePrivilegeResponse> deletePrivilege(DeletePrivilegeRequest request);

    /**
     * @param request the request parameters of DeleteProduct  DeleteProductRequest
     * @return DeleteProductResponse
     */
    CompletableFuture<DeleteProductResponse> deleteProduct(DeleteProductRequest request);

    /**
     * @param request the request parameters of DeleteResource  DeleteResourceRequest
     * @return DeleteResourceResponse
     */
    CompletableFuture<DeleteResourceResponse> deleteResource(DeleteResourceRequest request);

    /**
     * @param request the request parameters of DeleteRole  DeleteRoleRequest
     * @return DeleteRoleResponse
     */
    CompletableFuture<DeleteRoleResponse> deleteRole(DeleteRoleRequest request);

    /**
     * @param request the request parameters of DeleteSettled  DeleteSettledRequest
     * @return DeleteSettledResponse
     */
    CompletableFuture<DeleteSettledResponse> deleteSettled(DeleteSettledRequest request);

    /**
     * @param request the request parameters of DependLibrary  DependLibraryRequest
     * @return DependLibraryResponse
     */
    CompletableFuture<DependLibraryResponse> dependLibrary(DependLibraryRequest request);

    /**
     * @param request the request parameters of FeedbackLibraryReview  FeedbackLibraryReviewRequest
     * @return FeedbackLibraryReviewResponse
     */
    CompletableFuture<FeedbackLibraryReviewResponse> feedbackLibraryReview(FeedbackLibraryReviewRequest request);

    /**
     * @param request the request parameters of FeedbackPbcReview  FeedbackPbcReviewRequest
     * @return FeedbackPbcReviewResponse
     */
    CompletableFuture<FeedbackPbcReviewResponse> feedbackPbcReview(FeedbackPbcReviewRequest request);

    /**
     * @param request the request parameters of GetBucEnterprise  GetBucEnterpriseRequest
     * @return GetBucEnterpriseResponse
     */
    CompletableFuture<GetBucEnterpriseResponse> getBucEnterprise(GetBucEnterpriseRequest request);

    /**
     * @param request the request parameters of GetComponent  GetComponentRequest
     * @return GetComponentResponse
     */
    CompletableFuture<GetComponentResponse> getComponent(GetComponentRequest request);

    /**
     * @param request the request parameters of GetComponentTemplate  GetComponentTemplateRequest
     * @return GetComponentTemplateResponse
     */
    CompletableFuture<GetComponentTemplateResponse> getComponentTemplate(GetComponentTemplateRequest request);

    /**
     * @param request the request parameters of GetDeployment  GetDeploymentRequest
     * @return GetDeploymentResponse
     */
    CompletableFuture<GetDeploymentResponse> getDeployment(GetDeploymentRequest request);

    /**
     * @param request the request parameters of GetDeveloper  GetDeveloperRequest
     * @return GetDeveloperResponse
     */
    CompletableFuture<GetDeveloperResponse> getDeveloper(GetDeveloperRequest request);

    /**
     * @param request the request parameters of GetDeveloperEnterprise  GetDeveloperEnterpriseRequest
     * @return GetDeveloperEnterpriseResponse
     */
    CompletableFuture<GetDeveloperEnterpriseResponse> getDeveloperEnterprise(GetDeveloperEnterpriseRequest request);

    /**
     * @param request the request parameters of GetEnterprise  GetEnterpriseRequest
     * @return GetEnterpriseResponse
     */
    CompletableFuture<GetEnterpriseResponse> getEnterprise(GetEnterpriseRequest request);

    /**
     * @param request the request parameters of GetEnterpriseDeveloper  GetEnterpriseDeveloperRequest
     * @return GetEnterpriseDeveloperResponse
     */
    CompletableFuture<GetEnterpriseDeveloperResponse> getEnterpriseDeveloper(GetEnterpriseDeveloperRequest request);

    /**
     * @param request the request parameters of GetForkReview  GetForkReviewRequest
     * @return GetForkReviewResponse
     */
    CompletableFuture<GetForkReviewResponse> getForkReview(GetForkReviewRequest request);

    /**
     * @param request the request parameters of GetHistoryDeveloper  GetHistoryDeveloperRequest
     * @return GetHistoryDeveloperResponse
     */
    CompletableFuture<GetHistoryDeveloperResponse> getHistoryDeveloper(GetHistoryDeveloperRequest request);

    /**
     * @param request the request parameters of GetLastDeploymentConfig  GetLastDeploymentConfigRequest
     * @return GetLastDeploymentConfigResponse
     */
    CompletableFuture<GetLastDeploymentConfigResponse> getLastDeploymentConfig(GetLastDeploymentConfigRequest request);

    /**
     * @param request the request parameters of GetLibrary  GetLibraryRequest
     * @return GetLibraryResponse
     */
    CompletableFuture<GetLibraryResponse> getLibrary(GetLibraryRequest request);

    /**
     * @param request the request parameters of GetLibraryDeveloperRepoMetrics  GetLibraryDeveloperRepoMetricsRequest
     * @return GetLibraryDeveloperRepoMetricsResponse
     */
    CompletableFuture<GetLibraryDeveloperRepoMetricsResponse> getLibraryDeveloperRepoMetrics(GetLibraryDeveloperRepoMetricsRequest request);

    /**
     * @param request the request parameters of GetLibraryInstruction  GetLibraryInstructionRequest
     * @return GetLibraryInstructionResponse
     */
    CompletableFuture<GetLibraryInstructionResponse> getLibraryInstruction(GetLibraryInstructionRequest request);

    /**
     * @param request the request parameters of GetLibraryRepoMetrics  GetLibraryRepoMetricsRequest
     * @return GetLibraryRepoMetricsResponse
     */
    CompletableFuture<GetLibraryRepoMetricsResponse> getLibraryRepoMetrics(GetLibraryRepoMetricsRequest request);

    /**
     * @param request the request parameters of GetLibraryReview  GetLibraryReviewRequest
     * @return GetLibraryReviewResponse
     */
    CompletableFuture<GetLibraryReviewResponse> getLibraryReview(GetLibraryReviewRequest request);

    /**
     * @param request the request parameters of GetLibrarySchema  GetLibrarySchemaRequest
     * @return GetLibrarySchemaResponse
     */
    CompletableFuture<GetLibrarySchemaResponse> getLibrarySchema(GetLibrarySchemaRequest request);

    /**
     * @param request the request parameters of GetLogUrl  GetLogUrlRequest
     * @return GetLogUrlResponse
     */
    CompletableFuture<GetLogUrlResponse> getLogUrl(GetLogUrlRequest request);

    /**
     * @param request the request parameters of GetLoginUserInfo  GetLoginUserInfoRequest
     * @return GetLoginUserInfoResponse
     */
    CompletableFuture<GetLoginUserInfoResponse> getLoginUserInfo(GetLoginUserInfoRequest request);

    /**
     * @param request the request parameters of GetMonitorAlert  GetMonitorAlertRequest
     * @return GetMonitorAlertResponse
     */
    CompletableFuture<GetMonitorAlertResponse> getMonitorAlert(GetMonitorAlertRequest request);

    /**
     * @param request the request parameters of GetMonitorAlertHistory  GetMonitorAlertHistoryRequest
     * @return GetMonitorAlertHistoryResponse
     */
    CompletableFuture<GetMonitorAlertHistoryResponse> getMonitorAlertHistory(GetMonitorAlertHistoryRequest request);

    /**
     * @param request the request parameters of GetMonitorContact  GetMonitorContactRequest
     * @return GetMonitorContactResponse
     */
    CompletableFuture<GetMonitorContactResponse> getMonitorContact(GetMonitorContactRequest request);

    /**
     * @param request the request parameters of GetMonitorContactGroup  GetMonitorContactGroupRequest
     * @return GetMonitorContactGroupResponse
     */
    CompletableFuture<GetMonitorContactGroupResponse> getMonitorContactGroup(GetMonitorContactGroupRequest request);

    /**
     * @param request the request parameters of GetMonitorWebhook  GetMonitorWebhookRequest
     * @return GetMonitorWebhookResponse
     */
    CompletableFuture<GetMonitorWebhookResponse> getMonitorWebhook(GetMonitorWebhookRequest request);

    /**
     * @param request the request parameters of GetPbc  GetPbcRequest
     * @return GetPbcResponse
     */
    CompletableFuture<GetPbcResponse> getPbc(GetPbcRequest request);

    /**
     * @param request the request parameters of GetPbcApiSchema  GetPbcApiSchemaRequest
     * @return GetPbcApiSchemaResponse
     */
    CompletableFuture<GetPbcApiSchemaResponse> getPbcApiSchema(GetPbcApiSchemaRequest request);

    /**
     * @param request the request parameters of GetPbcDeveloperRepoMetrics  GetPbcDeveloperRepoMetricsRequest
     * @return GetPbcDeveloperRepoMetricsResponse
     */
    CompletableFuture<GetPbcDeveloperRepoMetricsResponse> getPbcDeveloperRepoMetrics(GetPbcDeveloperRepoMetricsRequest request);

    /**
     * @param request the request parameters of GetPbcInstruction  GetPbcInstructionRequest
     * @return GetPbcInstructionResponse
     */
    CompletableFuture<GetPbcInstructionResponse> getPbcInstruction(GetPbcInstructionRequest request);

    /**
     * @param request the request parameters of GetPbcInvokeReview  GetPbcInvokeReviewRequest
     * @return GetPbcInvokeReviewResponse
     */
    CompletableFuture<GetPbcInvokeReviewResponse> getPbcInvokeReview(GetPbcInvokeReviewRequest request);

    /**
     * @param request the request parameters of GetPbcRepoMetrics  GetPbcRepoMetricsRequest
     * @return GetPbcRepoMetricsResponse
     */
    CompletableFuture<GetPbcRepoMetricsResponse> getPbcRepoMetrics(GetPbcRepoMetricsRequest request);

    /**
     * @param request the request parameters of GetPbcReview  GetPbcReviewRequest
     * @return GetPbcReviewResponse
     */
    CompletableFuture<GetPbcReviewResponse> getPbcReview(GetPbcReviewRequest request);

    /**
     * @param request the request parameters of GetPbcSchema  GetPbcSchemaRequest
     * @return GetPbcSchemaResponse
     */
    CompletableFuture<GetPbcSchemaResponse> getPbcSchema(GetPbcSchemaRequest request);

    /**
     * @param request the request parameters of GetPbcVersion  GetPbcVersionRequest
     * @return GetPbcVersionResponse
     */
    CompletableFuture<GetPbcVersionResponse> getPbcVersion(GetPbcVersionRequest request);

    /**
     * @param request the request parameters of GetPdpConfig  GetPdpConfigRequest
     * @return GetPdpConfigResponse
     */
    CompletableFuture<GetPdpConfigResponse> getPdpConfig(GetPdpConfigRequest request);

    /**
     * @param request the request parameters of GetPdpHistoryConfig  GetPdpHistoryConfigRequest
     * @return GetPdpHistoryConfigResponse
     */
    CompletableFuture<GetPdpHistoryConfigResponse> getPdpHistoryConfig(GetPdpHistoryConfigRequest request);

    /**
     * @param request the request parameters of GetPdpLane  GetPdpLaneRequest
     * @return GetPdpLaneResponse
     */
    CompletableFuture<GetPdpLaneResponse> getPdpLane(GetPdpLaneRequest request);

    /**
     * @param request the request parameters of GetPdpPbc  GetPdpPbcRequest
     * @return GetPdpPbcResponse
     */
    CompletableFuture<GetPdpPbcResponse> getPdpPbc(GetPdpPbcRequest request);

    /**
     * @param request the request parameters of GetPdpService  GetPdpServiceRequest
     * @return GetPdpServiceResponse
     */
    CompletableFuture<GetPdpServiceResponse> getPdpService(GetPdpServiceRequest request);

    /**
     * @param request the request parameters of GetPdpServiceGroup  GetPdpServiceGroupRequest
     * @return GetPdpServiceGroupResponse
     */
    CompletableFuture<GetPdpServiceGroupResponse> getPdpServiceGroup(GetPdpServiceGroupRequest request);

    /**
     * @param request the request parameters of GetProduct  GetProductRequest
     * @return GetProductResponse
     */
    CompletableFuture<GetProductResponse> getProduct(GetProductRequest request);

    /**
     * @param request the request parameters of GetResource  GetResourceRequest
     * @return GetResourceResponse
     */
    CompletableFuture<GetResourceResponse> getResource(GetResourceRequest request);

    /**
     * @param request the request parameters of GetRole  GetRoleRequest
     * @return GetRoleResponse
     */
    CompletableFuture<GetRoleResponse> getRole(GetRoleRequest request);

    /**
     * @param request the request parameters of GetStackDetail  GetStackDetailRequest
     * @return GetStackDetailResponse
     */
    CompletableFuture<GetStackDetailResponse> getStackDetail(GetStackDetailRequest request);

    /**
     * @param request the request parameters of GetToken  GetTokenRequest
     * @return GetTokenResponse
     */
    CompletableFuture<GetTokenResponse> getToken(GetTokenRequest request);

    /**
     * @param request the request parameters of GetTraceDetail  GetTraceDetailRequest
     * @return GetTraceDetailResponse
     */
    CompletableFuture<GetTraceDetailResponse> getTraceDetail(GetTraceDetailRequest request);

    /**
     * @param request the request parameters of GrantRole  GrantRoleRequest
     * @return GrantRoleResponse
     */
    CompletableFuture<GrantRoleResponse> grantRole(GrantRoleRequest request);

    /**
     * @param request the request parameters of ListAuthorizeProducts  ListAuthorizeProductsRequest
     * @return ListAuthorizeProductsResponse
     */
    CompletableFuture<ListAuthorizeProductsResponse> listAuthorizeProducts(ListAuthorizeProductsRequest request);

    /**
     * @param request the request parameters of ListBucUserEnterprise  ListBucUserEnterpriseRequest
     * @return ListBucUserEnterpriseResponse
     */
    CompletableFuture<ListBucUserEnterpriseResponse> listBucUserEnterprise(ListBucUserEnterpriseRequest request);

    /**
     * @param request the request parameters of ListComponentTemplates  ListComponentTemplatesRequest
     * @return ListComponentTemplatesResponse
     */
    CompletableFuture<ListComponentTemplatesResponse> listComponentTemplates(ListComponentTemplatesRequest request);

    /**
     * @param request the request parameters of ListComponents  ListComponentsRequest
     * @return ListComponentsResponse
     */
    CompletableFuture<ListComponentsResponse> listComponents(ListComponentsRequest request);

    /**
     * @param request the request parameters of ListDependLibrarys  ListDependLibrarysRequest
     * @return ListDependLibrarysResponse
     */
    CompletableFuture<ListDependLibrarysResponse> listDependLibrarys(ListDependLibrarysRequest request);

    /**
     * @param request the request parameters of ListDeployments  ListDeploymentsRequest
     * @return ListDeploymentsResponse
     */
    CompletableFuture<ListDeploymentsResponse> listDeployments(ListDeploymentsRequest request);

    /**
     * @param request the request parameters of ListDeveloperEnterprises  ListDeveloperEnterprisesRequest
     * @return ListDeveloperEnterprisesResponse
     */
    CompletableFuture<ListDeveloperEnterprisesResponse> listDeveloperEnterprises(ListDeveloperEnterprisesRequest request);

    /**
     * @param request the request parameters of ListDeveloperPbcs  ListDeveloperPbcsRequest
     * @return ListDeveloperPbcsResponse
     */
    CompletableFuture<ListDeveloperPbcsResponse> listDeveloperPbcs(ListDeveloperPbcsRequest request);

    /**
     * @param request the request parameters of ListDevelopers  ListDevelopersRequest
     * @return ListDevelopersResponse
     */
    CompletableFuture<ListDevelopersResponse> listDevelopers(ListDevelopersRequest request);

    /**
     * @param request the request parameters of ListDownstreamPbc  ListDownstreamPbcRequest
     * @return ListDownstreamPbcResponse
     */
    CompletableFuture<ListDownstreamPbcResponse> listDownstreamPbc(ListDownstreamPbcRequest request);

    /**
     * @param request the request parameters of ListEnterprises  ListEnterprisesRequest
     * @return ListEnterprisesResponse
     */
    CompletableFuture<ListEnterprisesResponse> listEnterprises(ListEnterprisesRequest request);

    /**
     * @param request the request parameters of ListEnvInfos  ListEnvInfosRequest
     * @return ListEnvInfosResponse
     */
    CompletableFuture<ListEnvInfosResponse> listEnvInfos(ListEnvInfosRequest request);

    /**
     * @param request the request parameters of ListForkReviews  ListForkReviewsRequest
     * @return ListForkReviewsResponse
     */
    CompletableFuture<ListForkReviewsResponse> listForkReviews(ListForkReviewsRequest request);

    /**
     * @param request the request parameters of ListGrantedRoles  ListGrantedRolesRequest
     * @return ListGrantedRolesResponse
     */
    CompletableFuture<ListGrantedRolesResponse> listGrantedRoles(ListGrantedRolesRequest request);

    /**
     * @param request the request parameters of ListInvokePbcs  ListInvokePbcsRequest
     * @return ListInvokePbcsResponse
     */
    CompletableFuture<ListInvokePbcsResponse> listInvokePbcs(ListInvokePbcsRequest request);

    /**
     * @param request the request parameters of ListLibraryReviews  ListLibraryReviewsRequest
     * @return ListLibraryReviewsResponse
     */
    CompletableFuture<ListLibraryReviewsResponse> listLibraryReviews(ListLibraryReviewsRequest request);

    /**
     * @param request the request parameters of ListLibrarys  ListLibrarysRequest
     * @return ListLibrarysResponse
     */
    CompletableFuture<ListLibrarysResponse> listLibrarys(ListLibrarysRequest request);

    /**
     * @param request the request parameters of ListMarkets  ListMarketsRequest
     * @return ListMarketsResponse
     */
    CompletableFuture<ListMarketsResponse> listMarkets(ListMarketsRequest request);

    /**
     * @param request the request parameters of ListMetadataInfos  ListMetadataInfosRequest
     * @return ListMetadataInfosResponse
     */
    CompletableFuture<ListMetadataInfosResponse> listMetadataInfos(ListMetadataInfosRequest request);

    /**
     * @param request the request parameters of ListMicroService  ListMicroServiceRequest
     * @return ListMicroServiceResponse
     */
    CompletableFuture<ListMicroServiceResponse> listMicroService(ListMicroServiceRequest request);

    /**
     * @param request the request parameters of ListMonitorContactGroups  ListMonitorContactGroupsRequest
     * @return ListMonitorContactGroupsResponse
     */
    CompletableFuture<ListMonitorContactGroupsResponse> listMonitorContactGroups(ListMonitorContactGroupsRequest request);

    /**
     * @param request the request parameters of ListMonitorContacts  ListMonitorContactsRequest
     * @return ListMonitorContactsResponse
     */
    CompletableFuture<ListMonitorContactsResponse> listMonitorContacts(ListMonitorContactsRequest request);

    /**
     * @param request the request parameters of ListMonitorNotifyObjects  ListMonitorNotifyObjectsRequest
     * @return ListMonitorNotifyObjectsResponse
     */
    CompletableFuture<ListMonitorNotifyObjectsResponse> listMonitorNotifyObjects(ListMonitorNotifyObjectsRequest request);

    /**
     * @param request the request parameters of ListMonitorTasks  ListMonitorTasksRequest
     * @return ListMonitorTasksResponse
     */
    CompletableFuture<ListMonitorTasksResponse> listMonitorTasks(ListMonitorTasksRequest request);

    /**
     * @param request the request parameters of ListMonitorWebhooks  ListMonitorWebhooksRequest
     * @return ListMonitorWebhooksResponse
     */
    CompletableFuture<ListMonitorWebhooksResponse> listMonitorWebhooks(ListMonitorWebhooksRequest request);

    /**
     * @param request the request parameters of ListMqGroupMsgs  ListMqGroupMsgsRequest
     * @return ListMqGroupMsgsResponse
     */
    CompletableFuture<ListMqGroupMsgsResponse> listMqGroupMsgs(ListMqGroupMsgsRequest request);

    /**
     * @param request the request parameters of ListMqTopicMsgs  ListMqTopicMsgsRequest
     * @return ListMqTopicMsgsResponse
     */
    CompletableFuture<ListMqTopicMsgsResponse> listMqTopicMsgs(ListMqTopicMsgsRequest request);

    /**
     * @param request the request parameters of ListMqTopicSubs  ListMqTopicSubsRequest
     * @return ListMqTopicSubsResponse
     */
    CompletableFuture<ListMqTopicSubsResponse> listMqTopicSubs(ListMqTopicSubsRequest request);

    /**
     * @param request the request parameters of ListMqTopics  ListMqTopicsRequest
     * @return ListMqTopicsResponse
     */
    CompletableFuture<ListMqTopicsResponse> listMqTopics(ListMqTopicsRequest request);

    /**
     * @param request the request parameters of ListPbcInvokeReviews  ListPbcInvokeReviewsRequest
     * @return ListPbcInvokeReviewsResponse
     */
    CompletableFuture<ListPbcInvokeReviewsResponse> listPbcInvokeReviews(ListPbcInvokeReviewsRequest request);

    /**
     * @param request the request parameters of ListPbcInvokes  ListPbcInvokesRequest
     * @return ListPbcInvokesResponse
     */
    CompletableFuture<ListPbcInvokesResponse> listPbcInvokes(ListPbcInvokesRequest request);

    /**
     * @param request the request parameters of ListPbcReviews  ListPbcReviewsRequest
     * @return ListPbcReviewsResponse
     */
    CompletableFuture<ListPbcReviewsResponse> listPbcReviews(ListPbcReviewsRequest request);

    /**
     * @param request the request parameters of ListPbcSubscribe  ListPbcSubscribeRequest
     * @return ListPbcSubscribeResponse
     */
    CompletableFuture<ListPbcSubscribeResponse> listPbcSubscribe(ListPbcSubscribeRequest request);

    /**
     * @param request the request parameters of ListPbcVersionBuild  ListPbcVersionBuildRequest
     * @return ListPbcVersionBuildResponse
     */
    CompletableFuture<ListPbcVersionBuildResponse> listPbcVersionBuild(ListPbcVersionBuildRequest request);

    /**
     * @param request the request parameters of ListPbcVersionNumbers  ListPbcVersionNumbersRequest
     * @return ListPbcVersionNumbersResponse
     */
    CompletableFuture<ListPbcVersionNumbersResponse> listPbcVersionNumbers(ListPbcVersionNumbersRequest request);

    /**
     * @param request the request parameters of ListPbcs  ListPbcsRequest
     * @return ListPbcsResponse
     */
    CompletableFuture<ListPbcsResponse> listPbcs(ListPbcsRequest request);

    /**
     * @param request the request parameters of ListPdpConfigs  ListPdpConfigsRequest
     * @return ListPdpConfigsResponse
     */
    CompletableFuture<ListPdpConfigsResponse> listPdpConfigs(ListPdpConfigsRequest request);

    /**
     * @param request the request parameters of ListPdpHistoryConfigs  ListPdpHistoryConfigsRequest
     * @return ListPdpHistoryConfigsResponse
     */
    CompletableFuture<ListPdpHistoryConfigsResponse> listPdpHistoryConfigs(ListPdpHistoryConfigsRequest request);

    /**
     * @param request the request parameters of ListPdpImage  ListPdpImageRequest
     * @return ListPdpImageResponse
     */
    CompletableFuture<ListPdpImageResponse> listPdpImage(ListPdpImageRequest request);

    /**
     * @param request the request parameters of ListPdpLanes  ListPdpLanesRequest
     * @return ListPdpLanesResponse
     */
    CompletableFuture<ListPdpLanesResponse> listPdpLanes(ListPdpLanesRequest request);

    /**
     * @param request the request parameters of ListPdpLanesForServiceGroup  ListPdpLanesForServiceGroupRequest
     * @return ListPdpLanesForServiceGroupResponse
     */
    CompletableFuture<ListPdpLanesForServiceGroupResponse> listPdpLanesForServiceGroup(ListPdpLanesForServiceGroupRequest request);

    /**
     * @param request the request parameters of ListPdpLogs  ListPdpLogsRequest
     * @return ListPdpLogsResponse
     */
    CompletableFuture<ListPdpLogsResponse> listPdpLogs(ListPdpLogsRequest request);

    /**
     * @param request the request parameters of ListPdpPbcs  ListPdpPbcsRequest
     * @return ListPdpPbcsResponse
     */
    CompletableFuture<ListPdpPbcsResponse> listPdpPbcs(ListPdpPbcsRequest request);

    /**
     * @param request the request parameters of ListPdpServiceGroups  ListPdpServiceGroupsRequest
     * @return ListPdpServiceGroupsResponse
     */
    CompletableFuture<ListPdpServiceGroupsResponse> listPdpServiceGroups(ListPdpServiceGroupsRequest request);

    /**
     * @param request the request parameters of ListPdpServices  ListPdpServicesRequest
     * @return ListPdpServicesResponse
     */
    CompletableFuture<ListPdpServicesResponse> listPdpServices(ListPdpServicesRequest request);

    /**
     * @param request the request parameters of ListPermissionResource  ListPermissionResourceRequest
     * @return ListPermissionResourceResponse
     */
    CompletableFuture<ListPermissionResourceResponse> listPermissionResource(ListPermissionResourceRequest request);

    /**
     * @param request the request parameters of ListPermissionResourceForFront  ListPermissionResourceForFrontRequest
     * @return ListPermissionResourceForFrontResponse
     */
    CompletableFuture<ListPermissionResourceForFrontResponse> listPermissionResourceForFront(ListPermissionResourceForFrontRequest request);

    /**
     * @param request the request parameters of ListPermissionResourcePop  ListPermissionResourcePopRequest
     * @return ListPermissionResourcePopResponse
     */
    CompletableFuture<ListPermissionResourcePopResponse> listPermissionResourcePop(ListPermissionResourcePopRequest request);

    /**
     * @param request the request parameters of ListPrivilegeByRole  ListPrivilegeByRoleRequest
     * @return ListPrivilegeByRoleResponse
     */
    CompletableFuture<ListPrivilegeByRoleResponse> listPrivilegeByRole(ListPrivilegeByRoleRequest request);

    /**
     * @param request the request parameters of ListProductEnvInfos  ListProductEnvInfosRequest
     * @return ListProductEnvInfosResponse
     */
    CompletableFuture<ListProductEnvInfosResponse> listProductEnvInfos(ListProductEnvInfosRequest request);

    /**
     * @param request the request parameters of ListProductEnvs  ListProductEnvsRequest
     * @return ListProductEnvsResponse
     */
    CompletableFuture<ListProductEnvsResponse> listProductEnvs(ListProductEnvsRequest request);

    /**
     * @param request the request parameters of ListProducts  ListProductsRequest
     * @return ListProductsResponse
     */
    CompletableFuture<ListProductsResponse> listProducts(ListProductsRequest request);

    /**
     * @param request the request parameters of ListResources  ListResourcesRequest
     * @return ListResourcesResponse
     */
    CompletableFuture<ListResourcesResponse> listResources(ListResourcesRequest request);

    /**
     * @param request the request parameters of ListReviewers  ListReviewersRequest
     * @return ListReviewersResponse
     */
    CompletableFuture<ListReviewersResponse> listReviewers(ListReviewersRequest request);

    /**
     * @param request the request parameters of ListRoles  ListRolesRequest
     * @return ListRolesResponse
     */
    CompletableFuture<ListRolesResponse> listRoles(ListRolesRequest request);

    /**
     * @param request the request parameters of ListRuntimeTokens  ListRuntimeTokensRequest
     * @return ListRuntimeTokensResponse
     */
    CompletableFuture<ListRuntimeTokensResponse> listRuntimeTokens(ListRuntimeTokensRequest request);

    /**
     * @param request the request parameters of ListServerInstances  ListServerInstancesRequest
     * @return ListServerInstancesResponse
     */
    CompletableFuture<ListServerInstancesResponse> listServerInstances(ListServerInstancesRequest request);

    /**
     * @param request the request parameters of ListServiceMetrics  ListServiceMetricsRequest
     * @return ListServiceMetricsResponse
     */
    CompletableFuture<ListServiceMetricsResponse> listServiceMetrics(ListServiceMetricsRequest request);

    /**
     * @param request the request parameters of ListSettleds  ListSettledsRequest
     * @return ListSettledsResponse
     */
    CompletableFuture<ListSettledsResponse> listSettleds(ListSettledsRequest request);

    /**
     * @param request the request parameters of ListSubscribePbcs  ListSubscribePbcsRequest
     * @return ListSubscribePbcsResponse
     */
    CompletableFuture<ListSubscribePbcsResponse> listSubscribePbcs(ListSubscribePbcsRequest request);

    /**
     * @param request the request parameters of ListUpstreamPbc  ListUpstreamPbcRequest
     * @return ListUpstreamPbcResponse
     */
    CompletableFuture<ListUpstreamPbcResponse> listUpstreamPbc(ListUpstreamPbcRequest request);

    /**
     * @param request the request parameters of ListWatchAssets  ListWatchAssetsRequest
     * @return ListWatchAssetsResponse
     */
    CompletableFuture<ListWatchAssetsResponse> listWatchAssets(ListWatchAssetsRequest request);

    /**
     * @param request the request parameters of ObtainMqConsoleLink  ObtainMqConsoleLinkRequest
     * @return ObtainMqConsoleLinkResponse
     */
    CompletableFuture<ObtainMqConsoleLinkResponse> obtainMqConsoleLink(ObtainMqConsoleLinkRequest request);

    /**
     * @param request the request parameters of OpenServiceGroupForService  OpenServiceGroupForServiceRequest
     * @return OpenServiceGroupForServiceResponse
     */
    CompletableFuture<OpenServiceGroupForServiceResponse> openServiceGroupForService(OpenServiceGroupForServiceRequest request);

    /**
     * @param request the request parameters of PreviewComponentCrdSchema  PreviewComponentCrdSchemaRequest
     * @return PreviewComponentCrdSchemaResponse
     */
    CompletableFuture<PreviewComponentCrdSchemaResponse> previewComponentCrdSchema(PreviewComponentCrdSchemaRequest request);

    /**
     * @param request the request parameters of RegisterBucUser  RegisterBucUserRequest
     * @return RegisterBucUserResponse
     */
    CompletableFuture<RegisterBucUserResponse> registerBucUser(RegisterBucUserRequest request);

    /**
     * @param request the request parameters of RemoveAssetWatch  RemoveAssetWatchRequest
     * @return RemoveAssetWatchResponse
     */
    CompletableFuture<RemoveAssetWatchResponse> removeAssetWatch(RemoveAssetWatchRequest request);

    /**
     * @param request the request parameters of RemoveDependLibrary  RemoveDependLibraryRequest
     * @return RemoveDependLibraryResponse
     */
    CompletableFuture<RemoveDependLibraryResponse> removeDependLibrary(RemoveDependLibraryRequest request);

    /**
     * @param request the request parameters of RevertPdpService  RevertPdpServiceRequest
     * @return RevertPdpServiceResponse
     */
    CompletableFuture<RevertPdpServiceResponse> revertPdpService(RevertPdpServiceRequest request);

    /**
     * @param request the request parameters of RevokeLibraryReview  RevokeLibraryReviewRequest
     * @return RevokeLibraryReviewResponse
     */
    CompletableFuture<RevokeLibraryReviewResponse> revokeLibraryReview(RevokeLibraryReviewRequest request);

    /**
     * @param request the request parameters of RevokePbcReview  RevokePbcReviewRequest
     * @return RevokePbcReviewResponse
     */
    CompletableFuture<RevokePbcReviewResponse> revokePbcReview(RevokePbcReviewRequest request);

    /**
     * @param request the request parameters of RevokeRole  RevokeRoleRequest
     * @return RevokeRoleResponse
     */
    CompletableFuture<RevokeRoleResponse> revokeRole(RevokeRoleRequest request);

    /**
     * @param request the request parameters of RollbackPdpService  RollbackPdpServiceRequest
     * @return RollbackPdpServiceResponse
     */
    CompletableFuture<RollbackPdpServiceResponse> rollbackPdpService(RollbackPdpServiceRequest request);

    /**
     * @param request the request parameters of SearchAssets  SearchAssetsRequest
     * @return SearchAssetsResponse
     */
    CompletableFuture<SearchAssetsResponse> searchAssets(SearchAssetsRequest request);

    /**
     * @param request the request parameters of SearchPbcAssets  SearchPbcAssetsRequest
     * @return SearchPbcAssetsResponse
     */
    CompletableFuture<SearchPbcAssetsResponse> searchPbcAssets(SearchPbcAssetsRequest request);

    /**
     * @param request the request parameters of SearchTracesByPage  SearchTracesByPageRequest
     * @return SearchTracesByPageResponse
     */
    CompletableFuture<SearchTracesByPageResponse> searchTracesByPage(SearchTracesByPageRequest request);

    /**
     * @param request the request parameters of SendTTSVerifyLink  SendTTSVerifyLinkRequest
     * @return SendTTSVerifyLinkResponse
     */
    CompletableFuture<SendTTSVerifyLinkResponse> sendTTSVerifyLink(SendTTSVerifyLinkRequest request);

    /**
     * @param request the request parameters of SubscribePbc  SubscribePbcRequest
     * @return SubscribePbcResponse
     */
    CompletableFuture<SubscribePbcResponse> subscribePbc(SubscribePbcRequest request);

    /**
     * @param request the request parameters of SyncComponentTemplateConfig  SyncComponentTemplateConfigRequest
     * @return SyncComponentTemplateConfigResponse
     */
    CompletableFuture<SyncComponentTemplateConfigResponse> syncComponentTemplateConfig(SyncComponentTemplateConfigRequest request);

    /**
     * @param request the request parameters of TransferEnterprise  TransferEnterpriseRequest
     * @return TransferEnterpriseResponse
     */
    CompletableFuture<TransferEnterpriseResponse> transferEnterprise(TransferEnterpriseRequest request);

    /**
     * @param request the request parameters of TriggerDeployment  TriggerDeploymentRequest
     * @return TriggerDeploymentResponse
     */
    CompletableFuture<TriggerDeploymentResponse> triggerDeployment(TriggerDeploymentRequest request);

    /**
     * @param request the request parameters of UpShelfLibrary  UpShelfLibraryRequest
     * @return UpShelfLibraryResponse
     */
    CompletableFuture<UpShelfLibraryResponse> upShelfLibrary(UpShelfLibraryRequest request);

    /**
     * @param request the request parameters of UpShelfPbcVersion  UpShelfPbcVersionRequest
     * @return UpShelfPbcVersionResponse
     */
    CompletableFuture<UpShelfPbcVersionResponse> upShelfPbcVersion(UpShelfPbcVersionRequest request);

    /**
     * @param request the request parameters of UpdateComponent  UpdateComponentRequest
     * @return UpdateComponentResponse
     */
    CompletableFuture<UpdateComponentResponse> updateComponent(UpdateComponentRequest request);

    /**
     * @param request the request parameters of UpdateComponentTemplate  UpdateComponentTemplateRequest
     * @return UpdateComponentTemplateResponse
     */
    CompletableFuture<UpdateComponentTemplateResponse> updateComponentTemplate(UpdateComponentTemplateRequest request);

    /**
     * @param request the request parameters of UpdateDeveloper  UpdateDeveloperRequest
     * @return UpdateDeveloperResponse
     */
    CompletableFuture<UpdateDeveloperResponse> updateDeveloper(UpdateDeveloperRequest request);

    /**
     * @param request the request parameters of UpdateEnterprise  UpdateEnterpriseRequest
     * @return UpdateEnterpriseResponse
     */
    CompletableFuture<UpdateEnterpriseResponse> updateEnterprise(UpdateEnterpriseRequest request);

    /**
     * @param request the request parameters of UpdateLibrary  UpdateLibraryRequest
     * @return UpdateLibraryResponse
     */
    CompletableFuture<UpdateLibraryResponse> updateLibrary(UpdateLibraryRequest request);

    /**
     * @param request the request parameters of UpdateLibraryInstruction  UpdateLibraryInstructionRequest
     * @return UpdateLibraryInstructionResponse
     */
    CompletableFuture<UpdateLibraryInstructionResponse> updateLibraryInstruction(UpdateLibraryInstructionRequest request);

    /**
     * @param request the request parameters of UpdateLibrarySchema  UpdateLibrarySchemaRequest
     * @return UpdateLibrarySchemaResponse
     */
    CompletableFuture<UpdateLibrarySchemaResponse> updateLibrarySchema(UpdateLibrarySchemaRequest request);

    /**
     * @param request the request parameters of UpdateMonitorArmsAlert  UpdateMonitorArmsAlertRequest
     * @return UpdateMonitorArmsAlertResponse
     */
    CompletableFuture<UpdateMonitorArmsAlertResponse> updateMonitorArmsAlert(UpdateMonitorArmsAlertRequest request);

    /**
     * @param request the request parameters of UpdateMonitorContact  UpdateMonitorContactRequest
     * @return UpdateMonitorContactResponse
     */
    CompletableFuture<UpdateMonitorContactResponse> updateMonitorContact(UpdateMonitorContactRequest request);

    /**
     * @param request the request parameters of UpdateMonitorContactGroup  UpdateMonitorContactGroupRequest
     * @return UpdateMonitorContactGroupResponse
     */
    CompletableFuture<UpdateMonitorContactGroupResponse> updateMonitorContactGroup(UpdateMonitorContactGroupRequest request);

    /**
     * @param request the request parameters of UpdateMonitorMqAlert  UpdateMonitorMqAlertRequest
     * @return UpdateMonitorMqAlertResponse
     */
    CompletableFuture<UpdateMonitorMqAlertResponse> updateMonitorMqAlert(UpdateMonitorMqAlertRequest request);

    /**
     * @param request the request parameters of UpdateMonitorSlsAlert  UpdateMonitorSlsAlertRequest
     * @return UpdateMonitorSlsAlertResponse
     */
    CompletableFuture<UpdateMonitorSlsAlertResponse> updateMonitorSlsAlert(UpdateMonitorSlsAlertRequest request);

    /**
     * @param request the request parameters of UpdateMonitorWebhook  UpdateMonitorWebhookRequest
     * @return UpdateMonitorWebhookResponse
     */
    CompletableFuture<UpdateMonitorWebhookResponse> updateMonitorWebhook(UpdateMonitorWebhookRequest request);

    /**
     * @param request the request parameters of UpdatePbcApiSchema  UpdatePbcApiSchemaRequest
     * @return UpdatePbcApiSchemaResponse
     */
    CompletableFuture<UpdatePbcApiSchemaResponse> updatePbcApiSchema(UpdatePbcApiSchemaRequest request);

    /**
     * @param request the request parameters of UpdatePbcInstruction  UpdatePbcInstructionRequest
     * @return UpdatePbcInstructionResponse
     */
    CompletableFuture<UpdatePbcInstructionResponse> updatePbcInstruction(UpdatePbcInstructionRequest request);

    /**
     * @param request the request parameters of UpdatePbcSchema  UpdatePbcSchemaRequest
     * @return UpdatePbcSchemaResponse
     */
    CompletableFuture<UpdatePbcSchemaResponse> updatePbcSchema(UpdatePbcSchemaRequest request);

    /**
     * @param request the request parameters of UpdatePbcVersion  UpdatePbcVersionRequest
     * @return UpdatePbcVersionResponse
     */
    CompletableFuture<UpdatePbcVersionResponse> updatePbcVersion(UpdatePbcVersionRequest request);

    /**
     * @param request the request parameters of UpdatePdpConfig  UpdatePdpConfigRequest
     * @return UpdatePdpConfigResponse
     */
    CompletableFuture<UpdatePdpConfigResponse> updatePdpConfig(UpdatePdpConfigRequest request);

    /**
     * @param request the request parameters of UpdatePdpLane  UpdatePdpLaneRequest
     * @return UpdatePdpLaneResponse
     */
    CompletableFuture<UpdatePdpLaneResponse> updatePdpLane(UpdatePdpLaneRequest request);

    /**
     * @param request the request parameters of UpdatePdpPbc  UpdatePdpPbcRequest
     * @return UpdatePdpPbcResponse
     */
    CompletableFuture<UpdatePdpPbcResponse> updatePdpPbc(UpdatePdpPbcRequest request);

    /**
     * @param request the request parameters of UpdatePdpService  UpdatePdpServiceRequest
     * @return UpdatePdpServiceResponse
     */
    CompletableFuture<UpdatePdpServiceResponse> updatePdpService(UpdatePdpServiceRequest request);

    /**
     * @param request the request parameters of UpdatePdpServiceGroup  UpdatePdpServiceGroupRequest
     * @return UpdatePdpServiceGroupResponse
     */
    CompletableFuture<UpdatePdpServiceGroupResponse> updatePdpServiceGroup(UpdatePdpServiceGroupRequest request);

    /**
     * @param request the request parameters of UpdateProduct  UpdateProductRequest
     * @return UpdateProductResponse
     */
    CompletableFuture<UpdateProductResponse> updateProduct(UpdateProductRequest request);

    /**
     * @param request the request parameters of UpdateResource  UpdateResourceRequest
     * @return UpdateResourceResponse
     */
    CompletableFuture<UpdateResourceResponse> updateResource(UpdateResourceRequest request);

    /**
     * @param request the request parameters of UpdateRole  UpdateRoleRequest
     * @return UpdateRoleResponse
     */
    CompletableFuture<UpdateRoleResponse> updateRole(UpdateRoleRequest request);

    /**
     * @param request the request parameters of UpdateSettled  UpdateSettledRequest
     * @return UpdateSettledResponse
     */
    CompletableFuture<UpdateSettledResponse> updateSettled(UpdateSettledRequest request);

}
