// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20160511;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.domain20160511.models.*;
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
        this.product = "Domain";
        this.version = "2016-05-11";
        this.endpointRule = "central";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of CheckDomain  CheckDomainRequest
     * @return CheckDomainResponse
     */
    @Override
    public CompletableFuture<CheckDomainResponse> checkDomain(CheckDomainRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CheckDomain").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckDomainResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckDomainResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteContactTemplate  DeleteContactTemplateRequest
     * @return DeleteContactTemplateResponse
     */
    @Override
    public CompletableFuture<DeleteContactTemplateResponse> deleteContactTemplate(DeleteContactTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteContactTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteContactTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteContactTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryBatchTaskDetailList  QueryBatchTaskDetailListRequest
     * @return QueryBatchTaskDetailListResponse
     */
    @Override
    public CompletableFuture<QueryBatchTaskDetailListResponse> queryBatchTaskDetailList(QueryBatchTaskDetailListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryBatchTaskDetailList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryBatchTaskDetailListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryBatchTaskDetailListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryBatchTaskList  QueryBatchTaskListRequest
     * @return QueryBatchTaskListResponse
     */
    @Override
    public CompletableFuture<QueryBatchTaskListResponse> queryBatchTaskList(QueryBatchTaskListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryBatchTaskList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryBatchTaskListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryBatchTaskListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryContact  QueryContactRequest
     * @return QueryContactResponse
     */
    @Override
    public CompletableFuture<QueryContactResponse> queryContact(QueryContactRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryContact").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryContactResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryContactResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryContactTemplate  QueryContactTemplateRequest
     * @return QueryContactTemplateResponse
     */
    @Override
    public CompletableFuture<QueryContactTemplateResponse> queryContactTemplate(QueryContactTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryContactTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryContactTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryContactTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryDomainBySaleId  QueryDomainBySaleIdRequest
     * @return QueryDomainBySaleIdResponse
     */
    @Override
    public CompletableFuture<QueryDomainBySaleIdResponse> queryDomainBySaleId(QueryDomainBySaleIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDomainBySaleId").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDomainBySaleIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDomainBySaleIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryDomainList  QueryDomainListRequest
     * @return QueryDomainListResponse
     */
    @Override
    public CompletableFuture<QueryDomainListResponse> queryDomainList(QueryDomainListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDomainList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDomainListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDomainListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryFailReasonList  QueryFailReasonListRequest
     * @return QueryFailReasonListResponse
     */
    @Override
    public CompletableFuture<QueryFailReasonListResponse> queryFailReasonList(QueryFailReasonListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryFailReasonList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryFailReasonListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryFailReasonListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveContactTemplate  SaveContactTemplateRequest
     * @return SaveContactTemplateResponse
     */
    @Override
    public CompletableFuture<SaveContactTemplateResponse> saveContactTemplate(SaveContactTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveContactTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveContactTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveContactTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveContactTemplateCredential  SaveContactTemplateCredentialRequest
     * @return SaveContactTemplateCredentialResponse
     */
    @Override
    public CompletableFuture<SaveContactTemplateCredentialResponse> saveContactTemplateCredential(SaveContactTemplateCredentialRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveContactTemplateCredential").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveContactTemplateCredentialResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveContactTemplateCredentialResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveTaskForModifyingDomainDns  SaveTaskForModifyingDomainDnsRequest
     * @return SaveTaskForModifyingDomainDnsResponse
     */
    @Override
    public CompletableFuture<SaveTaskForModifyingDomainDnsResponse> saveTaskForModifyingDomainDns(SaveTaskForModifyingDomainDnsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveTaskForModifyingDomainDns").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveTaskForModifyingDomainDnsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveTaskForModifyingDomainDnsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveTaskForSubmittingDomainNameCredential  SaveTaskForSubmittingDomainNameCredentialRequest
     * @return SaveTaskForSubmittingDomainNameCredentialResponse
     */
    @Override
    public CompletableFuture<SaveTaskForSubmittingDomainNameCredentialResponse> saveTaskForSubmittingDomainNameCredential(SaveTaskForSubmittingDomainNameCredentialRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveTaskForSubmittingDomainNameCredential").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveTaskForSubmittingDomainNameCredentialResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveTaskForSubmittingDomainNameCredentialResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveTaskForSubmittingDomainNameCredentialByTemplateId  SaveTaskForSubmittingDomainNameCredentialByTemplateIdRequest
     * @return SaveTaskForSubmittingDomainNameCredentialByTemplateIdResponse
     */
    @Override
    public CompletableFuture<SaveTaskForSubmittingDomainNameCredentialByTemplateIdResponse> saveTaskForSubmittingDomainNameCredentialByTemplateId(SaveTaskForSubmittingDomainNameCredentialByTemplateIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveTaskForSubmittingDomainNameCredentialByTemplateId").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveTaskForSubmittingDomainNameCredentialByTemplateIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveTaskForSubmittingDomainNameCredentialByTemplateIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveTaskForUpdatingContactByTempateId  SaveTaskForUpdatingContactByTempateIdRequest
     * @return SaveTaskForUpdatingContactByTempateIdResponse
     */
    @Override
    public CompletableFuture<SaveTaskForUpdatingContactByTempateIdResponse> saveTaskForUpdatingContactByTempateId(SaveTaskForUpdatingContactByTempateIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveTaskForUpdatingContactByTempateId").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveTaskForUpdatingContactByTempateIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveTaskForUpdatingContactByTempateIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveTaskForUpdatingContactByTemplateId  SaveTaskForUpdatingContactByTemplateIdRequest
     * @return SaveTaskForUpdatingContactByTemplateIdResponse
     */
    @Override
    public CompletableFuture<SaveTaskForUpdatingContactByTemplateIdResponse> saveTaskForUpdatingContactByTemplateId(SaveTaskForUpdatingContactByTemplateIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SaveTaskForUpdatingContactByTemplateId").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveTaskForUpdatingContactByTemplateIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveTaskForUpdatingContactByTemplateIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of WhoisProtection  WhoisProtectionRequest
     * @return WhoisProtectionResponse
     */
    @Override
    public CompletableFuture<WhoisProtectionResponse> whoisProtection(WhoisProtectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("WhoisProtection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(WhoisProtectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<WhoisProtectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
