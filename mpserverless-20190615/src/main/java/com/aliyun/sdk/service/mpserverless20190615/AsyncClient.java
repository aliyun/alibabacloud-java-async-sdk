// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.mpserverless20190615.models.*;
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

    CompletableFuture<AddCorsDomainResponse> addCorsDomain(AddCorsDomainRequest request);

    CompletableFuture<AddDingtalkOpenPlatformConfigResponse> addDingtalkOpenPlatformConfig(AddDingtalkOpenPlatformConfigRequest request);

    CompletableFuture<AttachWebHostingCertificateResponse> attachWebHostingCertificate(AttachWebHostingCertificateRequest request);

    CompletableFuture<BatchDeleteWebHostingFilesResponse> batchDeleteWebHostingFiles(BatchDeleteWebHostingFilesRequest request);

    CompletableFuture<BindWebHostingCustomDomainResponse> bindWebHostingCustomDomain(BindWebHostingCustomDomainRequest request);

    CompletableFuture<CheckMpServerlessRoleExistsResponse> checkMpServerlessRoleExists(CheckMpServerlessRoleExistsRequest request);

    CompletableFuture<CreateDBExportTaskResponse> createDBExportTask(CreateDBExportTaskRequest request);

    CompletableFuture<CreateDBImportTaskResponse> createDBImportTask(CreateDBImportTaskRequest request);

    CompletableFuture<CreateDBRestoreTaskResponse> createDBRestoreTask(CreateDBRestoreTaskRequest request);

    CompletableFuture<CreateFunctionResponse> createFunction(CreateFunctionRequest request);

    CompletableFuture<CreateFunctionDeploymentResponse> createFunctionDeployment(CreateFunctionDeploymentRequest request);

    CompletableFuture<CreateSpaceResponse> createSpace(CreateSpaceRequest request);

    CompletableFuture<CreateSpaceWithOrderResponse> createSpaceWithOrder(CreateSpaceWithOrderRequest request);

    CompletableFuture<DeleteAntOpenPlatformConfigResponse> deleteAntOpenPlatformConfig(DeleteAntOpenPlatformConfigRequest request);

    CompletableFuture<DeleteCorsDomainResponse> deleteCorsDomain(DeleteCorsDomainRequest request);

    CompletableFuture<DeleteDBCollectionResponse> deleteDBCollection(DeleteDBCollectionRequest request);

    CompletableFuture<DeleteDingtalkOpenPlatformConfigResponse> deleteDingtalkOpenPlatformConfig(DeleteDingtalkOpenPlatformConfigRequest request);

    CompletableFuture<DeleteFileResponse> deleteFile(DeleteFileRequest request);

    CompletableFuture<DeleteFunctionResponse> deleteFunction(DeleteFunctionRequest request);

    CompletableFuture<DeleteSpaceResponse> deleteSpace(DeleteSpaceRequest request);

    CompletableFuture<DeleteWebHostingCertificateResponse> deleteWebHostingCertificate(DeleteWebHostingCertificateRequest request);

    CompletableFuture<DeleteWebHostingFileResponse> deleteWebHostingFile(DeleteWebHostingFileRequest request);

    CompletableFuture<DeleteWechatOpenPlatformConfigResponse> deleteWechatOpenPlatformConfig(DeleteWechatOpenPlatformConfigRequest request);

    CompletableFuture<DeployFunctionResponse> deployFunction(DeployFunctionRequest request);

    CompletableFuture<DescribeCdnDomainResponse> describeCdnDomain(DescribeCdnDomainRequest request);

    CompletableFuture<DescribeFCOpenStatusResponse> describeFCOpenStatus(DescribeFCOpenStatusRequest request);

    CompletableFuture<DescribeFileUploadSignedUrlResponse> describeFileUploadSignedUrl(DescribeFileUploadSignedUrlRequest request);

    CompletableFuture<DescribeFunctionResponse> describeFunction(DescribeFunctionRequest request);

    CompletableFuture<DescribeHttpTriggerConfigResponse> describeHttpTriggerConfig(DescribeHttpTriggerConfigRequest request);

    CompletableFuture<DescribeResourceQuotaResponse> describeResourceQuota(DescribeResourceQuotaRequest request);

    CompletableFuture<DescribeResourceUsageResponse> describeResourceUsage(DescribeResourceUsageRequest request);

    CompletableFuture<DescribeServicePolicyResponse> describeServicePolicy(DescribeServicePolicyRequest request);

    CompletableFuture<DescribeSpaceClientConfigResponse> describeSpaceClientConfig(DescribeSpaceClientConfigRequest request);

    CompletableFuture<DescribeSpacesResponse> describeSpaces(DescribeSpacesRequest request);

    CompletableFuture<DescribeWebHostingFileResponse> describeWebHostingFile(DescribeWebHostingFileRequest request);

    CompletableFuture<EnableExtensionResponse> enableExtension(EnableExtensionRequest request);

    CompletableFuture<GetWebHostingCertificateDetailResponse> getWebHostingCertificateDetail(GetWebHostingCertificateDetailRequest request);

    CompletableFuture<GetWebHostingConfigResponse> getWebHostingConfig(GetWebHostingConfigRequest request);

    CompletableFuture<GetWebHostingDomainVerificationContentResponse> getWebHostingDomainVerificationContent(GetWebHostingDomainVerificationContentRequest request);

    CompletableFuture<GetWebHostingStatusResponse> getWebHostingStatus(GetWebHostingStatusRequest request);

    CompletableFuture<GetWebHostingUploadCredentialResponse> getWebHostingUploadCredential(GetWebHostingUploadCredentialRequest request);

    CompletableFuture<ListAvailableCertificatesResponse> listAvailableCertificates(ListAvailableCertificatesRequest request);

    CompletableFuture<ListCorsDomainsResponse> listCorsDomains(ListCorsDomainsRequest request);

    CompletableFuture<ListDingtalkOpenPlatformConfigsResponse> listDingtalkOpenPlatformConfigs(ListDingtalkOpenPlatformConfigsRequest request);

    CompletableFuture<ListExtensionsResponse> listExtensions(ListExtensionsRequest request);

    CompletableFuture<ListFileResponse> listFile(ListFileRequest request);

    CompletableFuture<ListFunctionResponse> listFunction(ListFunctionRequest request);

    CompletableFuture<ListFunctionDeploymentResponse> listFunctionDeployment(ListFunctionDeploymentRequest request);

    CompletableFuture<ListFunctionLogResponse> listFunctionLog(ListFunctionLogRequest request);

    CompletableFuture<ListOpenPlatformConfigResponse> listOpenPlatformConfig(ListOpenPlatformConfigRequest request);

    CompletableFuture<ListSpaceResponse> listSpace(ListSpaceRequest request);

    CompletableFuture<ListWebHostingCustomDomainsResponse> listWebHostingCustomDomains(ListWebHostingCustomDomainsRequest request);

    CompletableFuture<ListWebHostingFilesResponse> listWebHostingFiles(ListWebHostingFilesRequest request);

    CompletableFuture<ModifyWebHostingConfigResponse> modifyWebHostingConfig(ModifyWebHostingConfigRequest request);

    CompletableFuture<OpenServiceResponse> openService(OpenServiceRequest request);

    CompletableFuture<OpenWebHostingServiceResponse> openWebHostingService(OpenWebHostingServiceRequest request);

    CompletableFuture<QueryDBBackupCollectionsResponse> queryDBBackupCollections(QueryDBBackupCollectionsRequest request);

    CompletableFuture<QueryDBBackupDumpTimesResponse> queryDBBackupDumpTimes(QueryDBBackupDumpTimesRequest request);

    CompletableFuture<QueryDBExportTaskStatusResponse> queryDBExportTaskStatus(QueryDBExportTaskStatusRequest request);

    CompletableFuture<QueryDBImportTaskStatusResponse> queryDBImportTaskStatus(QueryDBImportTaskStatusRequest request);

    CompletableFuture<QueryDBRestoreTaskStatusResponse> queryDBRestoreTaskStatus(QueryDBRestoreTaskStatusRequest request);

    CompletableFuture<QueryServiceStatusResponse> queryServiceStatus(QueryServiceStatusRequest request);

    CompletableFuture<QuerySpaceConsumptionResponse> querySpaceConsumption(QuerySpaceConsumptionRequest request);

    CompletableFuture<QuerySpaceSpecDetailResponse> querySpaceSpecDetail(QuerySpaceSpecDetailRequest request);

    CompletableFuture<QuerySpaceUsageResponse> querySpaceUsage(QuerySpaceUsageRequest request);

    CompletableFuture<RefreshWebHostingCustomDomainCacheResponse> refreshWebHostingCustomDomainCache(RefreshWebHostingCustomDomainCacheRequest request);

    CompletableFuture<RegisterFileResponse> registerFile(RegisterFileRequest request);

    CompletableFuture<RenameDBCollectionResponse> renameDBCollection(RenameDBCollectionRequest request);

    CompletableFuture<ResetServerSecretResponse> resetServerSecret(ResetServerSecretRequest request);

    CompletableFuture<RunDBCommandResponse> runDBCommand(RunDBCommandRequest request);

    CompletableFuture<RunFunctionResponse> runFunction(RunFunctionRequest request);

    CompletableFuture<SaveAntOpenPlatformConfigResponse> saveAntOpenPlatformConfig(SaveAntOpenPlatformConfigRequest request);

    CompletableFuture<SaveAppAuthTokenResponse> saveAppAuthToken(SaveAppAuthTokenRequest request);

    CompletableFuture<SaveCdnDomainConfigResponse> saveCdnDomainConfig(SaveCdnDomainConfigRequest request);

    CompletableFuture<SaveWebHostingCustomDomainConfigResponse> saveWebHostingCustomDomainConfig(SaveWebHostingCustomDomainConfigRequest request);

    CompletableFuture<SaveWebHostingCustomDomainCorsConfigResponse> saveWebHostingCustomDomainCorsConfig(SaveWebHostingCustomDomainCorsConfigRequest request);

    CompletableFuture<SaveWechatOpenPlatformConfigResponse> saveWechatOpenPlatformConfig(SaveWechatOpenPlatformConfigRequest request);

    CompletableFuture<UnbindWebHostingCustomDomainResponse> unbindWebHostingCustomDomain(UnbindWebHostingCustomDomainRequest request);

    CompletableFuture<UpdateDingtalkOpenPlatformConfigResponse> updateDingtalkOpenPlatformConfig(UpdateDingtalkOpenPlatformConfigRequest request);

    CompletableFuture<UpdateFunctionResponse> updateFunction(UpdateFunctionRequest request);

    CompletableFuture<UpdateHttpTriggerConfigResponse> updateHttpTriggerConfig(UpdateHttpTriggerConfigRequest request);

    CompletableFuture<UpdateServicePolicyResponse> updateServicePolicy(UpdateServicePolicyRequest request);

    CompletableFuture<UpdateSpaceResponse> updateSpace(UpdateSpaceRequest request);

    CompletableFuture<VerifyWebHostingDomainOwnerResponse> verifyWebHostingDomainOwner(VerifyWebHostingDomainOwnerRequest request);

}
