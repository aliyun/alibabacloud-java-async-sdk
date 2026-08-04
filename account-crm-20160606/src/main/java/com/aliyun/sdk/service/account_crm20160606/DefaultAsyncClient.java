// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.account_crm20160606;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.account_crm20160606.models.*;
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
        this.product = "account-crm";
        this.version = "2016-06-06";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of AccountOneKeyDelete  AccountOneKeyDeleteRequest
     * @return AccountOneKeyDeleteResponse
     */
    @Override
    public CompletableFuture<AccountOneKeyDeleteResponse> accountOneKeyDelete(AccountOneKeyDeleteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AccountOneKeyDelete").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AccountOneKeyDeleteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AccountOneKeyDeleteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddCustomerLabel  AddCustomerLabelRequest
     * @return AddCustomerLabelResponse
     */
    @Override
    public CompletableFuture<AddCustomerLabelResponse> addCustomerLabel(AddCustomerLabelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddCustomerLabel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddCustomerLabelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddCustomerLabelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AllowAgAccountLogin  AllowAgAccountLoginRequest
     * @return AllowAgAccountLoginResponse
     */
    @Override
    public CompletableFuture<AllowAgAccountLoginResponse> allowAgAccountLogin(AllowAgAccountLoginRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AllowAgAccountLogin").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AllowAgAccountLoginResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AllowAgAccountLoginResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ApplyAgOneKeyDeleteTask  ApplyAgOneKeyDeleteTaskRequest
     * @return ApplyAgOneKeyDeleteTaskResponse
     */
    @Override
    public CompletableFuture<ApplyAgOneKeyDeleteTaskResponse> applyAgOneKeyDeleteTask(ApplyAgOneKeyDeleteTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ApplyAgOneKeyDeleteTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ApplyAgOneKeyDeleteTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ApplyAgOneKeyDeleteTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ApplyAgOneKeyOnlyCheckerTask  ApplyAgOneKeyOnlyCheckerTaskRequest
     * @return ApplyAgOneKeyOnlyCheckerTaskResponse
     */
    @Override
    public CompletableFuture<ApplyAgOneKeyOnlyCheckerTaskResponse> applyAgOneKeyOnlyCheckerTask(ApplyAgOneKeyOnlyCheckerTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ApplyAgOneKeyOnlyCheckerTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ApplyAgOneKeyOnlyCheckerTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ApplyAgOneKeyOnlyCheckerTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ApplyIdentityRegistration  ApplyIdentityRegistrationRequest
     * @return ApplyIdentityRegistrationResponse
     */
    @Override
    public CompletableFuture<ApplyIdentityRegistrationResponse> applyIdentityRegistration(ApplyIdentityRegistrationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ApplyIdentityRegistration").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ApplyIdentityRegistrationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ApplyIdentityRegistrationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AsyncCreateAgAccount  AsyncCreateAgAccountRequest
     * @return AsyncCreateAgAccountResponse
     */
    @Override
    public CompletableFuture<AsyncCreateAgAccountResponse> asyncCreateAgAccount(AsyncCreateAgAccountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AsyncCreateAgAccount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AsyncCreateAgAccountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AsyncCreateAgAccountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AsyncModifyAgLoginEmail  AsyncModifyAgLoginEmailRequest
     * @return AsyncModifyAgLoginEmailResponse
     */
    @Override
    public CompletableFuture<AsyncModifyAgLoginEmailResponse> asyncModifyAgLoginEmail(AsyncModifyAgLoginEmailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AsyncModifyAgLoginEmail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AsyncModifyAgLoginEmailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AsyncModifyAgLoginEmailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AuthAndActiveWithHid  AuthAndActiveWithHidRequest
     * @return AuthAndActiveWithHidResponse
     */
    @Override
    public CompletableFuture<AuthAndActiveWithHidResponse> authAndActiveWithHid(AuthAndActiveWithHidRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AuthAndActiveWithHid").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AuthAndActiveWithHidResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AuthAndActiveWithHidResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AuthAndRefreshLoginTicket  AuthAndRefreshLoginTicketRequest
     * @return AuthAndRefreshLoginTicketResponse
     */
    @Override
    public CompletableFuture<AuthAndRefreshLoginTicketResponse> authAndRefreshLoginTicket(AuthAndRefreshLoginTicketRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AuthAndRefreshLoginTicket").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AuthAndRefreshLoginTicketResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AuthAndRefreshLoginTicketResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AuthLoginTicket  AuthLoginTicketRequest
     * @return AuthLoginTicketResponse
     */
    @Override
    public CompletableFuture<AuthLoginTicketResponse> authLoginTicket(AuthLoginTicketRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AuthLoginTicket").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AuthLoginTicketResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AuthLoginTicketResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BatchQueryAgAccount  BatchQueryAgAccountRequest
     * @return BatchQueryAgAccountResponse
     */
    @Override
    public CompletableFuture<BatchQueryAgAccountResponse> batchQueryAgAccount(BatchQueryAgAccountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchQueryAgAccount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchQueryAgAccountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchQueryAgAccountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BatchQueryCreateAccountTrace  BatchQueryCreateAccountTraceRequest
     * @return BatchQueryCreateAccountTraceResponse
     */
    @Override
    public CompletableFuture<BatchQueryCreateAccountTraceResponse> batchQueryCreateAccountTrace(BatchQueryCreateAccountTraceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchQueryCreateAccountTrace").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchQueryCreateAccountTraceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchQueryCreateAccountTraceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BatchQueryModifyLoginEmailTrace  BatchQueryModifyLoginEmailTraceRequest
     * @return BatchQueryModifyLoginEmailTraceResponse
     */
    @Override
    public CompletableFuture<BatchQueryModifyLoginEmailTraceResponse> batchQueryModifyLoginEmailTrace(BatchQueryModifyLoginEmailTraceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchQueryModifyLoginEmailTrace").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchQueryModifyLoginEmailTraceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchQueryModifyLoginEmailTraceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CancelAsyncCreateAgAccount  CancelAsyncCreateAgAccountRequest
     * @return CancelAsyncCreateAgAccountResponse
     */
    @Override
    public CompletableFuture<CancelAsyncCreateAgAccountResponse> cancelAsyncCreateAgAccount(CancelAsyncCreateAgAccountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelAsyncCreateAgAccount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelAsyncCreateAgAccountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelAsyncCreateAgAccountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CancelAsyncModifyLoginEmail  CancelAsyncModifyLoginEmailRequest
     * @return CancelAsyncModifyLoginEmailResponse
     */
    @Override
    public CompletableFuture<CancelAsyncModifyLoginEmailResponse> cancelAsyncModifyLoginEmail(CancelAsyncModifyLoginEmailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelAsyncModifyLoginEmail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelAsyncModifyLoginEmailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelAsyncModifyLoginEmailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ChangeAgAccountNationalityCode  ChangeAgAccountNationalityCodeRequest
     * @return ChangeAgAccountNationalityCodeResponse
     */
    @Override
    public CompletableFuture<ChangeAgAccountNationalityCodeResponse> changeAgAccountNationalityCode(ChangeAgAccountNationalityCodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ChangeAgAccountNationalityCode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChangeAgAccountNationalityCodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChangeAgAccountNationalityCodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ChangeAgSecurityEmail  ChangeAgSecurityEmailRequest
     * @return ChangeAgSecurityEmailResponse
     */
    @Override
    public CompletableFuture<ChangeAgSecurityEmailResponse> changeAgSecurityEmail(ChangeAgSecurityEmailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ChangeAgSecurityEmail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChangeAgSecurityEmailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChangeAgSecurityEmailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ChangeAgSecurityMobile  ChangeAgSecurityMobileRequest
     * @return ChangeAgSecurityMobileResponse
     */
    @Override
    public CompletableFuture<ChangeAgSecurityMobileResponse> changeAgSecurityMobile(ChangeAgSecurityMobileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ChangeAgSecurityMobile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChangeAgSecurityMobileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChangeAgSecurityMobileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateAccountProfileInfo  CreateAccountProfileInfoRequest
     * @return CreateAccountProfileInfoResponse
     */
    @Override
    public CompletableFuture<CreateAccountProfileInfoResponse> createAccountProfileInfo(CreateAccountProfileInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAccountProfileInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAccountProfileInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAccountProfileInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateAgAccount  CreateAgAccountRequest
     * @return CreateAgAccountResponse
     */
    @Override
    public CompletableFuture<CreateAgAccountResponse> createAgAccount(CreateAgAccountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAgAccount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAgAccountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAgAccountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateContacter  CreateContacterRequest
     * @return CreateContacterResponse
     */
    @Override
    public CompletableFuture<CreateContacterResponse> createContacter(CreateContacterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateContacter").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateContacterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateContacterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateRealNameCertification  CreateRealNameCertificationRequest
     * @return CreateRealNameCertificationResponse
     */
    @Override
    public CompletableFuture<CreateRealNameCertificationResponse> createRealNameCertification(CreateRealNameCertificationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateRealNameCertification").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateRealNameCertificationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateRealNameCertificationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CustomerSensitiveInfoLogicalDelete  CustomerSensitiveInfoLogicalDeleteRequest
     * @return CustomerSensitiveInfoLogicalDeleteResponse
     */
    @Override
    public CompletableFuture<CustomerSensitiveInfoLogicalDeleteResponse> customerSensitiveInfoLogicalDelete(CustomerSensitiveInfoLogicalDeleteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CustomerSensitiveInfoLogicalDelete").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CustomerSensitiveInfoLogicalDeleteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CustomerSensitiveInfoLogicalDeleteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CustomerSensitiveInfoPhysicalDelete  CustomerSensitiveInfoPhysicalDeleteRequest
     * @return CustomerSensitiveInfoPhysicalDeleteResponse
     */
    @Override
    public CompletableFuture<CustomerSensitiveInfoPhysicalDeleteResponse> customerSensitiveInfoPhysicalDelete(CustomerSensitiveInfoPhysicalDeleteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CustomerSensitiveInfoPhysicalDelete").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CustomerSensitiveInfoPhysicalDeleteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CustomerSensitiveInfoPhysicalDeleteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DelCacheOperateSync  DelCacheOperateSyncRequest
     * @return DelCacheOperateSyncResponse
     */
    @Override
    public CompletableFuture<DelCacheOperateSyncResponse> delCacheOperateSync(DelCacheOperateSyncRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DelCacheOperateSync").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DelCacheOperateSyncResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DelCacheOperateSyncResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteContacter  DeleteContacterRequest
     * @return DeleteContacterResponse
     */
    @Override
    public CompletableFuture<DeleteContacterResponse> deleteContacter(DeleteContacterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteContacter").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteContacterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteContacterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteCustomerLabel  DeleteCustomerLabelRequest
     * @return DeleteCustomerLabelResponse
     */
    @Override
    public CompletableFuture<DeleteCustomerLabelResponse> deleteCustomerLabel(DeleteCustomerLabelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteCustomerLabel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCustomerLabelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCustomerLabelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ExistBindsByOuterId  ExistBindsByOuterIdRequest
     * @return ExistBindsByOuterIdResponse
     */
    @Override
    public CompletableFuture<ExistBindsByOuterIdResponse> existBindsByOuterId(ExistBindsByOuterIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ExistBindsByOuterId").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExistBindsByOuterIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExistBindsByOuterIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of FindAllContacter  FindAllContacterRequest
     * @return FindAllContacterResponse
     */
    @Override
    public CompletableFuture<FindAllContacterResponse> findAllContacter(FindAllContacterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("FindAllContacter").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FindAllContacterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FindAllContacterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of FindBizCategoryConfig  FindBizCategoryConfigRequest
     * @return FindBizCategoryConfigResponse
     */
    @Override
    public CompletableFuture<FindBizCategoryConfigResponse> findBizCategoryConfig(FindBizCategoryConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("FindBizCategoryConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FindBizCategoryConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FindBizCategoryConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of FindContacter  FindContacterRequest
     * @return FindContacterResponse
     */
    @Override
    public CompletableFuture<FindContacterResponse> findContacter(FindContacterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("FindContacter").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FindContacterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FindContacterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of FindCustomerInfo  FindCustomerInfoRequest
     * @return FindCustomerInfoResponse
     */
    @Override
    public CompletableFuture<FindCustomerInfoResponse> findCustomerInfo(FindCustomerInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("FindCustomerInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FindCustomerInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FindCustomerInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of FindCustomerSnapshot  FindCustomerSnapshotRequest
     * @return FindCustomerSnapshotResponse
     */
    @Override
    public CompletableFuture<FindCustomerSnapshotResponse> findCustomerSnapshot(FindCustomerSnapshotRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("FindCustomerSnapshot").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FindCustomerSnapshotResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FindCustomerSnapshotResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of FindFinanceTax  FindFinanceTaxRequest
     * @return FindFinanceTaxResponse
     */
    @Override
    public CompletableFuture<FindFinanceTaxResponse> findFinanceTax(FindFinanceTaxRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("FindFinanceTax").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FindFinanceTaxResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FindFinanceTaxResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of FindFinanceTaxDetail  FindFinanceTaxDetailRequest
     * @return FindFinanceTaxDetailResponse
     */
    @Override
    public CompletableFuture<FindFinanceTaxDetailResponse> findFinanceTaxDetail(FindFinanceTaxDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("FindFinanceTaxDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FindFinanceTaxDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FindFinanceTaxDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of FindPkByHidForLoginWithLegacy  FindPkByHidForLoginWithLegacyRequest
     * @return FindPkByHidForLoginWithLegacyResponse
     */
    @Override
    public CompletableFuture<FindPkByHidForLoginWithLegacyResponse> findPkByHidForLoginWithLegacy(FindPkByHidForLoginWithLegacyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("FindPkByHidForLoginWithLegacy").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FindPkByHidForLoginWithLegacyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FindPkByHidForLoginWithLegacyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ForbiddenAgAccountLogin  ForbiddenAgAccountLoginRequest
     * @return ForbiddenAgAccountLoginResponse
     */
    @Override
    public CompletableFuture<ForbiddenAgAccountLoginResponse> forbiddenAgAccountLogin(ForbiddenAgAccountLoginRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ForbiddenAgAccountLogin").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ForbiddenAgAccountLoginResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ForbiddenAgAccountLoginResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GenerateAliyunCertUrl  GenerateAliyunCertUrlRequest
     * @return GenerateAliyunCertUrlResponse
     */
    @Override
    public CompletableFuture<GenerateAliyunCertUrlResponse> generateAliyunCertUrl(GenerateAliyunCertUrlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GenerateAliyunCertUrl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GenerateAliyunCertUrlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GenerateAliyunCertUrlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAgAccountAk  GetAgAccountAkRequest
     * @return GetAgAccountAkResponse
     */
    @Override
    public CompletableFuture<GetAgAccountAkResponse> getAgAccountAk(GetAgAccountAkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAgAccountAk").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAgAccountAkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAgAccountAkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAgOneKeyDeleteTask  GetAgOneKeyDeleteTaskRequest
     * @return GetAgOneKeyDeleteTaskResponse
     */
    @Override
    public CompletableFuture<GetAgOneKeyDeleteTaskResponse> getAgOneKeyDeleteTask(GetAgOneKeyDeleteTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAgOneKeyDeleteTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAgOneKeyDeleteTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAgOneKeyDeleteTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAgRelation  GetAgRelationRequest
     * @return GetAgRelationResponse
     */
    @Override
    public CompletableFuture<GetAgRelationResponse> getAgRelation(GetAgRelationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAgRelation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAgRelationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAgRelationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAliyunIdByPk  GetAliyunIdByPkRequest
     * @return GetAliyunIdByPkResponse
     */
    @Override
    public CompletableFuture<GetAliyunIdByPkResponse> getAliyunIdByPk(GetAliyunIdByPkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAliyunIdByPk").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAliyunIdByPkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAliyunIdByPkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAliyunPKByAliyunID  GetAliyunPKByAliyunIDRequest
     * @return GetAliyunPKByAliyunIDResponse
     */
    @Override
    public CompletableFuture<GetAliyunPKByAliyunIDResponse> getAliyunPKByAliyunID(GetAliyunPKByAliyunIDRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAliyunPKByAliyunID").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAliyunPKByAliyunIDResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAliyunPKByAliyunIDResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetCustomerCategory  GetCustomerCategoryRequest
     * @return GetCustomerCategoryResponse
     */
    @Override
    public CompletableFuture<GetCustomerCategoryResponse> getCustomerCategory(GetCustomerCategoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCustomerCategory").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCustomerCategoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCustomerCategoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetCustomerCategoryDictionary  GetCustomerCategoryDictionaryRequest
     * @return GetCustomerCategoryDictionaryResponse
     */
    @Override
    public CompletableFuture<GetCustomerCategoryDictionaryResponse> getCustomerCategoryDictionary(GetCustomerCategoryDictionaryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCustomerCategoryDictionary").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCustomerCategoryDictionaryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCustomerCategoryDictionaryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetCustomerInformation  GetCustomerInformationRequest
     * @return GetCustomerInformationResponse
     */
    @Override
    public CompletableFuture<GetCustomerInformationResponse> getCustomerInformation(GetCustomerInformationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCustomerInformation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCustomerInformationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCustomerInformationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDingTalkUserOrgByAliyunTmpCode  GetDingTalkUserOrgByAliyunTmpCodeRequest
     * @return GetDingTalkUserOrgByAliyunTmpCodeResponse
     */
    @Override
    public CompletableFuture<GetDingTalkUserOrgByAliyunTmpCodeResponse> getDingTalkUserOrgByAliyunTmpCode(GetDingTalkUserOrgByAliyunTmpCodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDingTalkUserOrgByAliyunTmpCode").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDingTalkUserOrgByAliyunTmpCodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDingTalkUserOrgByAliyunTmpCodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetIdentityRegistrationByCustomer  GetIdentityRegistrationByCustomerRequest
     * @return GetIdentityRegistrationByCustomerResponse
     */
    @Override
    public CompletableFuture<GetIdentityRegistrationByCustomerResponse> getIdentityRegistrationByCustomer(GetIdentityRegistrationByCustomerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetIdentityRegistrationByCustomer").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetIdentityRegistrationByCustomerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetIdentityRegistrationByCustomerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetProfileTypeByPk  GetProfileTypeByPkRequest
     * @return GetProfileTypeByPkResponse
     */
    @Override
    public CompletableFuture<GetProfileTypeByPkResponse> getProfileTypeByPk(GetProfileTypeByPkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetProfileTypeByPk").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetProfileTypeByPkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetProfileTypeByPkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetUploadIdentityRegistrationDocConfig  GetUploadIdentityRegistrationDocConfigRequest
     * @return GetUploadIdentityRegistrationDocConfigResponse
     */
    @Override
    public CompletableFuture<GetUploadIdentityRegistrationDocConfigResponse> getUploadIdentityRegistrationDocConfig(GetUploadIdentityRegistrationDocConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetUploadIdentityRegistrationDocConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetUploadIdentityRegistrationDocConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetUploadIdentityRegistrationDocConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of IncrByCacheOperateSync  IncrByCacheOperateSyncRequest
     * @return IncrByCacheOperateSyncResponse
     */
    @Override
    public CompletableFuture<IncrByCacheOperateSyncResponse> incrByCacheOperateSync(IncrByCacheOperateSyncRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("IncrByCacheOperateSync").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(IncrByCacheOperateSyncResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<IncrByCacheOperateSyncResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of JudgeAgExistQuietPeriod  JudgeAgExistQuietPeriodRequest
     * @return JudgeAgExistQuietPeriodResponse
     */
    @Override
    public CompletableFuture<JudgeAgExistQuietPeriodResponse> judgeAgExistQuietPeriod(JudgeAgExistQuietPeriodRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("JudgeAgExistQuietPeriod").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(JudgeAgExistQuietPeriodResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<JudgeAgExistQuietPeriodResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of LoadRealNameInfoByPk  LoadRealNameInfoByPkRequest
     * @return LoadRealNameInfoByPkResponse
     */
    @Override
    public CompletableFuture<LoadRealNameInfoByPkResponse> loadRealNameInfoByPk(LoadRealNameInfoByPkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("LoadRealNameInfoByPk").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(LoadRealNameInfoByPkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<LoadRealNameInfoByPkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of MapFromHavanaBindId  MapFromHavanaBindIdRequest
     * @return MapFromHavanaBindIdResponse
     */
    @Override
    public CompletableFuture<MapFromHavanaBindIdResponse> mapFromHavanaBindId(MapFromHavanaBindIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("MapFromHavanaBindId").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MapFromHavanaBindIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MapFromHavanaBindIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of MapPkFromHid  MapPkFromHidRequest
     * @return MapPkFromHidResponse
     */
    @Override
    public CompletableFuture<MapPkFromHidResponse> mapPkFromHid(MapPkFromHidRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("MapPkFromHid").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MapPkFromHidResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MapPkFromHidResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of MapPkToHid  MapPkToHidRequest
     * @return MapPkToHidResponse
     */
    @Override
    public CompletableFuture<MapPkToHidResponse> mapPkToHid(MapPkToHidRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("MapPkToHid").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MapPkToHidResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MapPkToHidResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of MapToHavanaBindId  MapToHavanaBindIdRequest
     * @return MapToHavanaBindIdResponse
     */
    @Override
    public CompletableFuture<MapToHavanaBindIdResponse> mapToHavanaBindId(MapToHavanaBindIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("MapToHavanaBindId").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MapToHavanaBindIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MapToHavanaBindIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyBizCategory  ModifyBizCategoryRequest
     * @return ModifyBizCategoryResponse
     */
    @Override
    public CompletableFuture<ModifyBizCategoryResponse> modifyBizCategory(ModifyBizCategoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyBizCategory").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyBizCategoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyBizCategoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyContacter  ModifyContacterRequest
     * @return ModifyContacterResponse
     */
    @Override
    public CompletableFuture<ModifyContacterResponse> modifyContacter(ModifyContacterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyContacter").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyContacterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyContacterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyCustomerInfo  ModifyCustomerInfoRequest
     * @return ModifyCustomerInfoResponse
     */
    @Override
    public CompletableFuture<ModifyCustomerInfoResponse> modifyCustomerInfo(ModifyCustomerInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyCustomerInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyCustomerInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyCustomerInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of OperateFinanceTax  OperateFinanceTaxRequest
     * @return OperateFinanceTaxResponse
     */
    @Override
    public CompletableFuture<OperateFinanceTaxResponse> operateFinanceTax(OperateFinanceTaxRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OperateFinanceTax").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OperateFinanceTaxResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OperateFinanceTaxResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryAccountAddressInfo  QueryAccountAddressInfoRequest
     * @return QueryAccountAddressInfoResponse
     */
    @Override
    public CompletableFuture<QueryAccountAddressInfoResponse> queryAccountAddressInfo(QueryAccountAddressInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryAccountAddressInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryAccountAddressInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryAccountAddressInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryAccountAddressInfoWithoutHavana  QueryAccountAddressInfoWithoutHavanaRequest
     * @return QueryAccountAddressInfoWithoutHavanaResponse
     */
    @Override
    public CompletableFuture<QueryAccountAddressInfoWithoutHavanaResponse> queryAccountAddressInfoWithoutHavana(QueryAccountAddressInfoWithoutHavanaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryAccountAddressInfoWithoutHavana").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryAccountAddressInfoWithoutHavanaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryAccountAddressInfoWithoutHavanaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryAccountDeliveryAddressInfo  QueryAccountDeliveryAddressInfoRequest
     * @return QueryAccountDeliveryAddressInfoResponse
     */
    @Override
    public CompletableFuture<QueryAccountDeliveryAddressInfoResponse> queryAccountDeliveryAddressInfo(QueryAccountDeliveryAddressInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryAccountDeliveryAddressInfo").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryAccountDeliveryAddressInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryAccountDeliveryAddressInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryAccountProfileInfo  QueryAccountProfileInfoRequest
     * @return QueryAccountProfileInfoResponse
     */
    @Override
    public CompletableFuture<QueryAccountProfileInfoResponse> queryAccountProfileInfo(QueryAccountProfileInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryAccountProfileInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryAccountProfileInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryAccountProfileInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryAccountRealNameInfo  QueryAccountRealNameInfoRequest
     * @return QueryAccountRealNameInfoResponse
     */
    @Override
    public CompletableFuture<QueryAccountRealNameInfoResponse> queryAccountRealNameInfo(QueryAccountRealNameInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryAccountRealNameInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryAccountRealNameInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryAccountRealNameInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryAccountSite  QueryAccountSiteRequest
     * @return QueryAccountSiteResponse
     */
    @Override
    public CompletableFuture<QueryAccountSiteResponse> queryAccountSite(QueryAccountSiteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryAccountSite").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryAccountSiteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryAccountSiteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryAccountTrueName  QueryAccountTrueNameRequest
     * @return QueryAccountTrueNameResponse
     */
    @Override
    public CompletableFuture<QueryAccountTrueNameResponse> queryAccountTrueName(QueryAccountTrueNameRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryAccountTrueName").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryAccountTrueNameResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryAccountTrueNameResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryAgAccountLoginPermission  QueryAgAccountLoginPermissionRequest
     * @return QueryAgAccountLoginPermissionResponse
     */
    @Override
    public CompletableFuture<QueryAgAccountLoginPermissionResponse> queryAgAccountLoginPermission(QueryAgAccountLoginPermissionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryAgAccountLoginPermission").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryAgAccountLoginPermissionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryAgAccountLoginPermissionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryAgRelationCountAndQuota  QueryAgRelationCountAndQuotaRequest
     * @return QueryAgRelationCountAndQuotaResponse
     */
    @Override
    public CompletableFuture<QueryAgRelationCountAndQuotaResponse> queryAgRelationCountAndQuota(QueryAgRelationCountAndQuotaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryAgRelationCountAndQuota").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryAgRelationCountAndQuotaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryAgRelationCountAndQuotaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryAgSecurityMobile  QueryAgSecurityMobileRequest
     * @return QueryAgSecurityMobileResponse
     */
    @Override
    public CompletableFuture<QueryAgSecurityMobileResponse> queryAgSecurityMobile(QueryAgSecurityMobileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryAgSecurityMobile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryAgSecurityMobileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryAgSecurityMobileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryBindsByOuterId  QueryBindsByOuterIdRequest
     * @return QueryBindsByOuterIdResponse
     */
    @Override
    public CompletableFuture<QueryBindsByOuterIdResponse> queryBindsByOuterId(QueryBindsByOuterIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryBindsByOuterId").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryBindsByOuterIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryBindsByOuterIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryBindsByPk  QueryBindsByPkRequest
     * @return QueryBindsByPkResponse
     */
    @Override
    public CompletableFuture<QueryBindsByPkResponse> queryBindsByPk(QueryBindsByPkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryBindsByPk").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryBindsByPkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryBindsByPkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryCustomerLabel  QueryCustomerLabelRequest
     * @return QueryCustomerLabelResponse
     */
    @Override
    public CompletableFuture<QueryCustomerLabelResponse> queryCustomerLabel(QueryCustomerLabelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryCustomerLabel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryCustomerLabelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryCustomerLabelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryDeleteTaskCheckData  QueryDeleteTaskCheckDataRequest
     * @return QueryDeleteTaskCheckDataResponse
     */
    @Override
    public CompletableFuture<QueryDeleteTaskCheckDataResponse> queryDeleteTaskCheckData(QueryDeleteTaskCheckDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDeleteTaskCheckData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDeleteTaskCheckDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDeleteTaskCheckDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryEncryptedAccountProfileInfo  QueryEncryptedAccountProfileInfoRequest
     * @return QueryEncryptedAccountProfileInfoResponse
     */
    @Override
    public CompletableFuture<QueryEncryptedAccountProfileInfoResponse> queryEncryptedAccountProfileInfo(QueryEncryptedAccountProfileInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryEncryptedAccountProfileInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryEncryptedAccountProfileInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryEncryptedAccountProfileInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryEnterpriseInfo  QueryEnterpriseInfoRequest
     * @return QueryEnterpriseInfoResponse
     */
    @Override
    public CompletableFuture<QueryEnterpriseInfoResponse> queryEnterpriseInfo(QueryEnterpriseInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryEnterpriseInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryEnterpriseInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryEnterpriseInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryEnumConfigByType  QueryEnumConfigByTypeRequest
     * @return QueryEnumConfigByTypeResponse
     */
    @Override
    public CompletableFuture<QueryEnumConfigByTypeResponse> queryEnumConfigByType(QueryEnumConfigByTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryEnumConfigByType").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryEnumConfigByTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryEnumConfigByTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryOneKeyDeleteBlockList  QueryOneKeyDeleteBlockListRequest
     * @return QueryOneKeyDeleteBlockListResponse
     */
    @Override
    public CompletableFuture<QueryOneKeyDeleteBlockListResponse> queryOneKeyDeleteBlockList(QueryOneKeyDeleteBlockListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryOneKeyDeleteBlockList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryOneKeyDeleteBlockListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryOneKeyDeleteBlockListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QuerySecurityInfo  QuerySecurityInfoRequest
     * @return QuerySecurityInfoResponse
     */
    @Override
    public CompletableFuture<QuerySecurityInfoResponse> querySecurityInfo(QuerySecurityInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QuerySecurityInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QuerySecurityInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QuerySecurityInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RegisterInternalAccountForBuc  RegisterInternalAccountForBucRequest
     * @return RegisterInternalAccountForBucResponse
     */
    @Override
    public CompletableFuture<RegisterInternalAccountForBucResponse> registerInternalAccountForBuc(RegisterInternalAccountForBucRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RegisterInternalAccountForBuc").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RegisterInternalAccountForBucResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RegisterInternalAccountForBucResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ReleaseAgAccount  ReleaseAgAccountRequest
     * @return ReleaseAgAccountResponse
     */
    @Override
    public CompletableFuture<ReleaseAgAccountResponse> releaseAgAccount(ReleaseAgAccountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReleaseAgAccount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReleaseAgAccountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReleaseAgAccountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ResendAsyncCreateAgAccount  ResendAsyncCreateAgAccountRequest
     * @return ResendAsyncCreateAgAccountResponse
     */
    @Override
    public CompletableFuture<ResendAsyncCreateAgAccountResponse> resendAsyncCreateAgAccount(ResendAsyncCreateAgAccountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ResendAsyncCreateAgAccount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResendAsyncCreateAgAccountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResendAsyncCreateAgAccountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ResendAsyncModifyLoginEmail  ResendAsyncModifyLoginEmailRequest
     * @return ResendAsyncModifyLoginEmailResponse
     */
    @Override
    public CompletableFuture<ResendAsyncModifyLoginEmailResponse> resendAsyncModifyLoginEmail(ResendAsyncModifyLoginEmailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ResendAsyncModifyLoginEmail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResendAsyncModifyLoginEmailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResendAsyncModifyLoginEmailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SeparateAgRelation  SeparateAgRelationRequest
     * @return SeparateAgRelationResponse
     */
    @Override
    public CompletableFuture<SeparateAgRelationResponse> separateAgRelation(SeparateAgRelationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SeparateAgRelation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SeparateAgRelationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SeparateAgRelationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetCacheOperateSync  SetCacheOperateSyncRequest
     * @return SetCacheOperateSyncResponse
     */
    @Override
    public CompletableFuture<SetCacheOperateSyncResponse> setCacheOperateSync(SetCacheOperateSyncRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetCacheOperateSync").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetCacheOperateSyncResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetCacheOperateSyncResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateAccountAddressInfo  UpdateAccountAddressInfoRequest
     * @return UpdateAccountAddressInfoResponse
     */
    @Override
    public CompletableFuture<UpdateAccountAddressInfoResponse> updateAccountAddressInfo(UpdateAccountAddressInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateAccountAddressInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAccountAddressInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAccountAddressInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateAccountProfileInfo  UpdateAccountProfileInfoRequest
     * @return UpdateAccountProfileInfoResponse
     */
    @Override
    public CompletableFuture<UpdateAccountProfileInfoResponse> updateAccountProfileInfo(UpdateAccountProfileInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateAccountProfileInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAccountProfileInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAccountProfileInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateAgAccountAddressInfo  UpdateAgAccountAddressInfoRequest
     * @return UpdateAgAccountAddressInfoResponse
     */
    @Override
    public CompletableFuture<UpdateAgAccountAddressInfoResponse> updateAgAccountAddressInfo(UpdateAgAccountAddressInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateAgAccountAddressInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAgAccountAddressInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAgAccountAddressInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateAgServiceStatus  UpdateAgServiceStatusRequest
     * @return UpdateAgServiceStatusResponse
     */
    @Override
    public CompletableFuture<UpdateAgServiceStatusResponse> updateAgServiceStatus(UpdateAgServiceStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateAgServiceStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAgServiceStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAgServiceStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateCustomerCategory  UpdateCustomerCategoryRequest
     * @return UpdateCustomerCategoryResponse
     */
    @Override
    public CompletableFuture<UpdateCustomerCategoryResponse> updateCustomerCategory(UpdateCustomerCategoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateCustomerCategory").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateCustomerCategoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateCustomerCategoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateCustomerInformation  UpdateCustomerInformationRequest
     * @return UpdateCustomerInformationResponse
     */
    @Override
    public CompletableFuture<UpdateCustomerInformationResponse> updateCustomerInformation(UpdateCustomerInformationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateCustomerInformation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateCustomerInformationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateCustomerInformationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateOrInsertEnterpriseInfo  UpdateOrInsertEnterpriseInfoRequest
     * @return UpdateOrInsertEnterpriseInfoResponse
     */
    @Override
    public CompletableFuture<UpdateOrInsertEnterpriseInfoResponse> updateOrInsertEnterpriseInfo(UpdateOrInsertEnterpriseInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateOrInsertEnterpriseInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateOrInsertEnterpriseInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateOrInsertEnterpriseInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of doLogicalDeleteResource  DoLogicalDeleteResourceRequest
     * @return DoLogicalDeleteResourceResponse
     */
    @Override
    public CompletableFuture<DoLogicalDeleteResourceResponse> doLogicalDeleteResource(DoLogicalDeleteResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("doLogicalDeleteResource").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DoLogicalDeleteResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DoLogicalDeleteResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
