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
     * @param request the request parameters of BindAppDomain  BindAppDomainRequest
     * @return BindAppDomainResponse
     */
    CompletableFuture<BindAppDomainResponse> bindAppDomain(BindAppDomainRequest request);

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
     * @param request the request parameters of ExportMaterialFile  ExportMaterialFileRequest
     * @return ExportMaterialFileResponse
     */
    CompletableFuture<ExportMaterialFileResponse> exportMaterialFile(ExportMaterialFileRequest request);

    /**
     * @param request the request parameters of GetAppInstance  GetAppInstanceRequest
     * @return GetAppInstanceResponse
     */
    CompletableFuture<GetAppInstanceResponse> getAppInstance(GetAppInstanceRequest request);

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
     * @param request the request parameters of SubmitMaterialTask  SubmitMaterialTaskRequest
     * @return SubmitMaterialTaskResponse
     */
    CompletableFuture<SubmitMaterialTaskResponse> submitMaterialTask(SubmitMaterialTaskRequest request);

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
     * @param request the request parameters of UploadMaterialFile  UploadMaterialFileRequest
     * @return UploadMaterialFileResponse
     */
    CompletableFuture<UploadMaterialFileResponse> uploadMaterialFile(UploadMaterialFileRequest request);

}
