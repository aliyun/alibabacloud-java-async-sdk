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
     * @param request the request parameters of CreateLogoTask  CreateLogoTaskRequest
     * @return CreateLogoTaskResponse
     */
    CompletableFuture<CreateLogoTaskResponse> createLogoTask(CreateLogoTaskRequest request);

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
     * @param request the request parameters of DescribeAppDomainDnsRecord  DescribeAppDomainDnsRecordRequest
     * @return DescribeAppDomainDnsRecordResponse
     */
    CompletableFuture<DescribeAppDomainDnsRecordResponse> describeAppDomainDnsRecord(DescribeAppDomainDnsRecordRequest request);

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
     * @param request the request parameters of GetUserTmpIdentityForPartner  GetUserTmpIdentityForPartnerRequest
     * @return GetUserTmpIdentityForPartnerResponse
     */
    CompletableFuture<GetUserTmpIdentityForPartnerResponse> getUserTmpIdentityForPartner(GetUserTmpIdentityForPartnerRequest request);

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
     * @param request the request parameters of SyncAppInstanceForPartner  SyncAppInstanceForPartnerRequest
     * @return SyncAppInstanceForPartnerResponse
     */
    CompletableFuture<SyncAppInstanceForPartnerResponse> syncAppInstanceForPartner(SyncAppInstanceForPartnerRequest request);

    /**
     * @param request the request parameters of UnbindAppDomain  UnbindAppDomainRequest
     * @return UnbindAppDomainResponse
     */
    CompletableFuture<UnbindAppDomainResponse> unbindAppDomain(UnbindAppDomainRequest request);

}
