// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20160511;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.domain20160511.models.*;
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
     * @param request the request parameters of CheckDomain  CheckDomainRequest
     * @return CheckDomainResponse
     */
    CompletableFuture<CheckDomainResponse> checkDomain(CheckDomainRequest request);

    /**
     * @param request the request parameters of DeleteContactTemplate  DeleteContactTemplateRequest
     * @return DeleteContactTemplateResponse
     */
    CompletableFuture<DeleteContactTemplateResponse> deleteContactTemplate(DeleteContactTemplateRequest request);

    /**
     * @param request the request parameters of QueryBatchTaskDetailList  QueryBatchTaskDetailListRequest
     * @return QueryBatchTaskDetailListResponse
     */
    CompletableFuture<QueryBatchTaskDetailListResponse> queryBatchTaskDetailList(QueryBatchTaskDetailListRequest request);

    /**
     * @param request the request parameters of QueryBatchTaskList  QueryBatchTaskListRequest
     * @return QueryBatchTaskListResponse
     */
    CompletableFuture<QueryBatchTaskListResponse> queryBatchTaskList(QueryBatchTaskListRequest request);

    /**
     * @param request the request parameters of QueryContact  QueryContactRequest
     * @return QueryContactResponse
     */
    CompletableFuture<QueryContactResponse> queryContact(QueryContactRequest request);

    /**
     * @param request the request parameters of QueryContactTemplate  QueryContactTemplateRequest
     * @return QueryContactTemplateResponse
     */
    CompletableFuture<QueryContactTemplateResponse> queryContactTemplate(QueryContactTemplateRequest request);

    /**
     * @param request the request parameters of QueryDomainBySaleId  QueryDomainBySaleIdRequest
     * @return QueryDomainBySaleIdResponse
     */
    CompletableFuture<QueryDomainBySaleIdResponse> queryDomainBySaleId(QueryDomainBySaleIdRequest request);

    /**
     * @param request the request parameters of QueryDomainList  QueryDomainListRequest
     * @return QueryDomainListResponse
     */
    CompletableFuture<QueryDomainListResponse> queryDomainList(QueryDomainListRequest request);

    /**
     * @param request the request parameters of QueryFailReasonList  QueryFailReasonListRequest
     * @return QueryFailReasonListResponse
     */
    CompletableFuture<QueryFailReasonListResponse> queryFailReasonList(QueryFailReasonListRequest request);

    /**
     * @param request the request parameters of SaveContactTemplate  SaveContactTemplateRequest
     * @return SaveContactTemplateResponse
     */
    CompletableFuture<SaveContactTemplateResponse> saveContactTemplate(SaveContactTemplateRequest request);

    /**
     * @param request the request parameters of SaveContactTemplateCredential  SaveContactTemplateCredentialRequest
     * @return SaveContactTemplateCredentialResponse
     */
    CompletableFuture<SaveContactTemplateCredentialResponse> saveContactTemplateCredential(SaveContactTemplateCredentialRequest request);

    /**
     * @param request the request parameters of SaveTaskForModifyingDomainDns  SaveTaskForModifyingDomainDnsRequest
     * @return SaveTaskForModifyingDomainDnsResponse
     */
    CompletableFuture<SaveTaskForModifyingDomainDnsResponse> saveTaskForModifyingDomainDns(SaveTaskForModifyingDomainDnsRequest request);

    /**
     * @param request the request parameters of SaveTaskForSubmittingDomainNameCredential  SaveTaskForSubmittingDomainNameCredentialRequest
     * @return SaveTaskForSubmittingDomainNameCredentialResponse
     */
    CompletableFuture<SaveTaskForSubmittingDomainNameCredentialResponse> saveTaskForSubmittingDomainNameCredential(SaveTaskForSubmittingDomainNameCredentialRequest request);

    /**
     * @param request the request parameters of SaveTaskForSubmittingDomainNameCredentialByTemplateId  SaveTaskForSubmittingDomainNameCredentialByTemplateIdRequest
     * @return SaveTaskForSubmittingDomainNameCredentialByTemplateIdResponse
     */
    CompletableFuture<SaveTaskForSubmittingDomainNameCredentialByTemplateIdResponse> saveTaskForSubmittingDomainNameCredentialByTemplateId(SaveTaskForSubmittingDomainNameCredentialByTemplateIdRequest request);

    /**
     * @param request the request parameters of SaveTaskForUpdatingContactByTempateId  SaveTaskForUpdatingContactByTempateIdRequest
     * @return SaveTaskForUpdatingContactByTempateIdResponse
     */
    CompletableFuture<SaveTaskForUpdatingContactByTempateIdResponse> saveTaskForUpdatingContactByTempateId(SaveTaskForUpdatingContactByTempateIdRequest request);

    /**
     * @param request the request parameters of SaveTaskForUpdatingContactByTemplateId  SaveTaskForUpdatingContactByTemplateIdRequest
     * @return SaveTaskForUpdatingContactByTemplateIdResponse
     */
    CompletableFuture<SaveTaskForUpdatingContactByTemplateIdResponse> saveTaskForUpdatingContactByTemplateId(SaveTaskForUpdatingContactByTemplateIdRequest request);

    /**
     * @param request the request parameters of WhoisProtection  WhoisProtectionRequest
     * @return WhoisProtectionResponse
     */
    CompletableFuture<WhoisProtectionResponse> whoisProtection(WhoisProtectionRequest request);

}
