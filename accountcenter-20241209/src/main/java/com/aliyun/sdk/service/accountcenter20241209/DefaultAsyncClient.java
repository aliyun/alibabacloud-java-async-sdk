// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.accountcenter20241209;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.accountcenter20241209.models.*;
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
        this.product = "AccountCenter";
        this.version = "2024-12-09";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of AccountContactAdd  AccountContactAddRequest
     * @return AccountContactAddResponse
     */
    @Override
    public CompletableFuture<AccountContactAddResponse> accountContactAdd(AccountContactAddRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AccountContactAdd").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AccountContactAddResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AccountContactAddResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AccountContactDelete  AccountContactDeleteRequest
     * @return AccountContactDeleteResponse
     */
    @Override
    public CompletableFuture<AccountContactDeleteResponse> accountContactDelete(AccountContactDeleteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AccountContactDelete").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AccountContactDeleteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AccountContactDeleteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AccountContactEdit  AccountContactEditRequest
     * @return AccountContactEditResponse
     */
    @Override
    public CompletableFuture<AccountContactEditResponse> accountContactEdit(AccountContactEditRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AccountContactEdit").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AccountContactEditResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AccountContactEditResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AccountContactQueryDetail  AccountContactQueryDetailRequest
     * @return AccountContactQueryDetailResponse
     */
    @Override
    public CompletableFuture<AccountContactQueryDetailResponse> accountContactQueryDetail(AccountContactQueryDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AccountContactQueryDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AccountContactQueryDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AccountContactQueryDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AccountContactQueryPageList  AccountContactQueryPageListRequest
     * @return AccountContactQueryPageListResponse
     */
    @Override
    public CompletableFuture<AccountContactQueryPageListResponse> accountContactQueryPageList(AccountContactQueryPageListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AccountContactQueryPageList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AccountContactQueryPageListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AccountContactQueryPageListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnterpriseAccountChangeLoginPassword  EnterpriseAccountChangeLoginPasswordRequest
     * @return EnterpriseAccountChangeLoginPasswordResponse
     */
    @Override
    public CompletableFuture<EnterpriseAccountChangeLoginPasswordResponse> enterpriseAccountChangeLoginPassword(EnterpriseAccountChangeLoginPasswordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnterpriseAccountChangeLoginPassword").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnterpriseAccountChangeLoginPasswordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnterpriseAccountChangeLoginPasswordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnterpriseAccountChangeSecurityEmail  EnterpriseAccountChangeSecurityEmailRequest
     * @return EnterpriseAccountChangeSecurityEmailResponse
     */
    @Override
    public CompletableFuture<EnterpriseAccountChangeSecurityEmailResponse> enterpriseAccountChangeSecurityEmail(EnterpriseAccountChangeSecurityEmailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnterpriseAccountChangeSecurityEmail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnterpriseAccountChangeSecurityEmailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnterpriseAccountChangeSecurityEmailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnterpriseAccountChangeSecurityMobile  EnterpriseAccountChangeSecurityMobileRequest
     * @return EnterpriseAccountChangeSecurityMobileResponse
     */
    @Override
    public CompletableFuture<EnterpriseAccountChangeSecurityMobileResponse> enterpriseAccountChangeSecurityMobile(EnterpriseAccountChangeSecurityMobileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnterpriseAccountChangeSecurityMobile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnterpriseAccountChangeSecurityMobileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnterpriseAccountChangeSecurityMobileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnterpriseAccountQueryAccountGrantedRoles  EnterpriseAccountQueryAccountGrantedRolesRequest
     * @return EnterpriseAccountQueryAccountGrantedRolesResponse
     */
    @Override
    public CompletableFuture<EnterpriseAccountQueryAccountGrantedRolesResponse> enterpriseAccountQueryAccountGrantedRoles(EnterpriseAccountQueryAccountGrantedRolesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnterpriseAccountQueryAccountGrantedRoles").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnterpriseAccountQueryAccountGrantedRolesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnterpriseAccountQueryAccountGrantedRolesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnterpriseAccountQueryAccountsInfo  EnterpriseAccountQueryAccountsInfoRequest
     * @return EnterpriseAccountQueryAccountsInfoResponse
     */
    @Override
    public CompletableFuture<EnterpriseAccountQueryAccountsInfoResponse> enterpriseAccountQueryAccountsInfo(EnterpriseAccountQueryAccountsInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnterpriseAccountQueryAccountsInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnterpriseAccountQueryAccountsInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnterpriseAccountQueryAccountsInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnterpriseAccountQueryLoginSettings  EnterpriseAccountQueryLoginSettingsRequest
     * @return EnterpriseAccountQueryLoginSettingsResponse
     */
    @Override
    public CompletableFuture<EnterpriseAccountQueryLoginSettingsResponse> enterpriseAccountQueryLoginSettings(EnterpriseAccountQueryLoginSettingsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnterpriseAccountQueryLoginSettings").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnterpriseAccountQueryLoginSettingsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnterpriseAccountQueryLoginSettingsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnterpriseAccountRemoveMfa  EnterpriseAccountRemoveMfaRequest
     * @return EnterpriseAccountRemoveMfaResponse
     */
    @Override
    public CompletableFuture<EnterpriseAccountRemoveMfaResponse> enterpriseAccountRemoveMfa(EnterpriseAccountRemoveMfaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnterpriseAccountRemoveMfa").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnterpriseAccountRemoveMfaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnterpriseAccountRemoveMfaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnterpriseAccountSeparateEa  EnterpriseAccountSeparateEaRequest
     * @return EnterpriseAccountSeparateEaResponse
     */
    @Override
    public CompletableFuture<EnterpriseAccountSeparateEaResponse> enterpriseAccountSeparateEa(EnterpriseAccountSeparateEaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnterpriseAccountSeparateEa").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnterpriseAccountSeparateEaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnterpriseAccountSeparateEaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnterpriseAccountUpdateAccountAlias  EnterpriseAccountUpdateAccountAliasRequest
     * @return EnterpriseAccountUpdateAccountAliasResponse
     */
    @Override
    public CompletableFuture<EnterpriseAccountUpdateAccountAliasResponse> enterpriseAccountUpdateAccountAlias(EnterpriseAccountUpdateAccountAliasRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnterpriseAccountUpdateAccountAlias").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnterpriseAccountUpdateAccountAliasResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnterpriseAccountUpdateAccountAliasResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnterpriseAccountUpdateAccountBizRoleGrant  EnterpriseAccountUpdateAccountBizRoleGrantRequest
     * @return EnterpriseAccountUpdateAccountBizRoleGrantResponse
     */
    @Override
    public CompletableFuture<EnterpriseAccountUpdateAccountBizRoleGrantResponse> enterpriseAccountUpdateAccountBizRoleGrant(EnterpriseAccountUpdateAccountBizRoleGrantRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnterpriseAccountUpdateAccountBizRoleGrant").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnterpriseAccountUpdateAccountBizRoleGrantResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnterpriseAccountUpdateAccountBizRoleGrantResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnterpriseAccountUpdateIpMask  EnterpriseAccountUpdateIpMaskRequest
     * @return EnterpriseAccountUpdateIpMaskResponse
     */
    @Override
    public CompletableFuture<EnterpriseAccountUpdateIpMaskResponse> enterpriseAccountUpdateIpMask(EnterpriseAccountUpdateIpMaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnterpriseAccountUpdateIpMask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnterpriseAccountUpdateIpMaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnterpriseAccountUpdateIpMaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnterpriseAccountUpdateOperateRiskControl  EnterpriseAccountUpdateOperateRiskControlRequest
     * @return EnterpriseAccountUpdateOperateRiskControlResponse
     */
    @Override
    public CompletableFuture<EnterpriseAccountUpdateOperateRiskControlResponse> enterpriseAccountUpdateOperateRiskControl(EnterpriseAccountUpdateOperateRiskControlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnterpriseAccountUpdateOperateRiskControl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnterpriseAccountUpdateOperateRiskControlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnterpriseAccountUpdateOperateRiskControlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnterpriseAccountUpdateSecurityMobileLoginStatus  EnterpriseAccountUpdateSecurityMobileLoginStatusRequest
     * @return EnterpriseAccountUpdateSecurityMobileLoginStatusResponse
     */
    @Override
    public CompletableFuture<EnterpriseAccountUpdateSecurityMobileLoginStatusResponse> enterpriseAccountUpdateSecurityMobileLoginStatus(EnterpriseAccountUpdateSecurityMobileLoginStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnterpriseAccountUpdateSecurityMobileLoginStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnterpriseAccountUpdateSecurityMobileLoginStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnterpriseAccountUpdateSecurityMobileLoginStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnterpriseAccountUpdateSessionExpireTime  EnterpriseAccountUpdateSessionExpireTimeRequest
     * @return EnterpriseAccountUpdateSessionExpireTimeResponse
     */
    @Override
    public CompletableFuture<EnterpriseAccountUpdateSessionExpireTimeResponse> enterpriseAccountUpdateSessionExpireTime(EnterpriseAccountUpdateSessionExpireTimeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnterpriseAccountUpdateSessionExpireTime").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnterpriseAccountUpdateSessionExpireTimeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnterpriseAccountUpdateSessionExpireTimeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnterpriseContactAdd  EnterpriseContactAddRequest
     * @return EnterpriseContactAddResponse
     */
    @Override
    public CompletableFuture<EnterpriseContactAddResponse> enterpriseContactAdd(EnterpriseContactAddRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnterpriseContactAdd").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnterpriseContactAddResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnterpriseContactAddResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnterpriseContactDelete  EnterpriseContactDeleteRequest
     * @return EnterpriseContactDeleteResponse
     */
    @Override
    public CompletableFuture<EnterpriseContactDeleteResponse> enterpriseContactDelete(EnterpriseContactDeleteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnterpriseContactDelete").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnterpriseContactDeleteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnterpriseContactDeleteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnterpriseContactEdit  EnterpriseContactEditRequest
     * @return EnterpriseContactEditResponse
     */
    @Override
    public CompletableFuture<EnterpriseContactEditResponse> enterpriseContactEdit(EnterpriseContactEditRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnterpriseContactEdit").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnterpriseContactEditResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnterpriseContactEditResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnterpriseContactQueryDetail  EnterpriseContactQueryDetailRequest
     * @return EnterpriseContactQueryDetailResponse
     */
    @Override
    public CompletableFuture<EnterpriseContactQueryDetailResponse> enterpriseContactQueryDetail(EnterpriseContactQueryDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnterpriseContactQueryDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnterpriseContactQueryDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnterpriseContactQueryDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnterpriseContactQueryPageList  EnterpriseContactQueryPageListRequest
     * @return EnterpriseContactQueryPageListResponse
     */
    @Override
    public CompletableFuture<EnterpriseContactQueryPageListResponse> enterpriseContactQueryPageList(EnterpriseContactQueryPageListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnterpriseContactQueryPageList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnterpriseContactQueryPageListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnterpriseContactQueryPageListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnterpriseOrgQueryLoadTree  EnterpriseOrgQueryLoadTreeRequest
     * @return EnterpriseOrgQueryLoadTreeResponse
     */
    @Override
    public CompletableFuture<EnterpriseOrgQueryLoadTreeResponse> enterpriseOrgQueryLoadTree(EnterpriseOrgQueryLoadTreeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnterpriseOrgQueryLoadTree").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnterpriseOrgQueryLoadTreeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnterpriseOrgQueryLoadTreeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnterpriseRegisterAccount  EnterpriseRegisterAccountRequest
     * @return EnterpriseRegisterAccountResponse
     */
    @Override
    public CompletableFuture<EnterpriseRegisterAccountResponse> enterpriseRegisterAccount(EnterpriseRegisterAccountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnterpriseRegisterAccount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnterpriseRegisterAccountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnterpriseRegisterAccountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnterpriseRoleCreateBizRole  EnterpriseRoleCreateBizRoleRequest
     * @return EnterpriseRoleCreateBizRoleResponse
     */
    @Override
    public CompletableFuture<EnterpriseRoleCreateBizRoleResponse> enterpriseRoleCreateBizRole(EnterpriseRoleCreateBizRoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnterpriseRoleCreateBizRole").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnterpriseRoleCreateBizRoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnterpriseRoleCreateBizRoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnterpriseRoleDeleteBizRole  EnterpriseRoleDeleteBizRoleRequest
     * @return EnterpriseRoleDeleteBizRoleResponse
     */
    @Override
    public CompletableFuture<EnterpriseRoleDeleteBizRoleResponse> enterpriseRoleDeleteBizRole(EnterpriseRoleDeleteBizRoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnterpriseRoleDeleteBizRole").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnterpriseRoleDeleteBizRoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnterpriseRoleDeleteBizRoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnterpriseRoleQueryAccountForRoleGrantByPage  EnterpriseRoleQueryAccountForRoleGrantByPageRequest
     * @return EnterpriseRoleQueryAccountForRoleGrantByPageResponse
     */
    @Override
    public CompletableFuture<EnterpriseRoleQueryAccountForRoleGrantByPageResponse> enterpriseRoleQueryAccountForRoleGrantByPage(EnterpriseRoleQueryAccountForRoleGrantByPageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnterpriseRoleQueryAccountForRoleGrantByPage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnterpriseRoleQueryAccountForRoleGrantByPageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnterpriseRoleQueryAccountForRoleGrantByPageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnterpriseRoleQueryBizRoleByPage  EnterpriseRoleQueryBizRoleByPageRequest
     * @return EnterpriseRoleQueryBizRoleByPageResponse
     */
    @Override
    public CompletableFuture<EnterpriseRoleQueryBizRoleByPageResponse> enterpriseRoleQueryBizRoleByPage(EnterpriseRoleQueryBizRoleByPageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnterpriseRoleQueryBizRoleByPage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnterpriseRoleQueryBizRoleByPageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnterpriseRoleQueryBizRoleByPageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnterpriseRoleQueryBizRoleDetail  EnterpriseRoleQueryBizRoleDetailRequest
     * @return EnterpriseRoleQueryBizRoleDetailResponse
     */
    @Override
    public CompletableFuture<EnterpriseRoleQueryBizRoleDetailResponse> enterpriseRoleQueryBizRoleDetail(EnterpriseRoleQueryBizRoleDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnterpriseRoleQueryBizRoleDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnterpriseRoleQueryBizRoleDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnterpriseRoleQueryBizRoleDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnterpriseRoleUpdateBizRole  EnterpriseRoleUpdateBizRoleRequest
     * @return EnterpriseRoleUpdateBizRoleResponse
     */
    @Override
    public CompletableFuture<EnterpriseRoleUpdateBizRoleResponse> enterpriseRoleUpdateBizRole(EnterpriseRoleUpdateBizRoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnterpriseRoleUpdateBizRole").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnterpriseRoleUpdateBizRoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnterpriseRoleUpdateBizRoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnterpriseTodoDealAccountTodo  EnterpriseTodoDealAccountTodoRequest
     * @return EnterpriseTodoDealAccountTodoResponse
     */
    @Override
    public CompletableFuture<EnterpriseTodoDealAccountTodoResponse> enterpriseTodoDealAccountTodo(EnterpriseTodoDealAccountTodoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnterpriseTodoDealAccountTodo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnterpriseTodoDealAccountTodoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnterpriseTodoDealAccountTodoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnterpriseTodoQueryAccountTodoList  EnterpriseTodoQueryAccountTodoListRequest
     * @return EnterpriseTodoQueryAccountTodoListResponse
     */
    @Override
    public CompletableFuture<EnterpriseTodoQueryAccountTodoListResponse> enterpriseTodoQueryAccountTodoList(EnterpriseTodoQueryAccountTodoListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnterpriseTodoQueryAccountTodoList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnterpriseTodoQueryAccountTodoListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnterpriseTodoQueryAccountTodoListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnterpriseTodoQueryAccountTodoListByApplicant  EnterpriseTodoQueryAccountTodoListByApplicantRequest
     * @return EnterpriseTodoQueryAccountTodoListByApplicantResponse
     */
    @Override
    public CompletableFuture<EnterpriseTodoQueryAccountTodoListByApplicantResponse> enterpriseTodoQueryAccountTodoListByApplicant(EnterpriseTodoQueryAccountTodoListByApplicantRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnterpriseTodoQueryAccountTodoListByApplicant").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnterpriseTodoQueryAccountTodoListByApplicantResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnterpriseTodoQueryAccountTodoListByApplicantResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnterpriseUninvitedAdminInviteJoinEnterprise  EnterpriseUninvitedAdminInviteJoinEnterpriseRequest
     * @return EnterpriseUninvitedAdminInviteJoinEnterpriseResponse
     */
    @Override
    public CompletableFuture<EnterpriseUninvitedAdminInviteJoinEnterpriseResponse> enterpriseUninvitedAdminInviteJoinEnterprise(EnterpriseUninvitedAdminInviteJoinEnterpriseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnterpriseUninvitedAdminInviteJoinEnterprise").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnterpriseUninvitedAdminInviteJoinEnterpriseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnterpriseUninvitedAdminInviteJoinEnterpriseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SendAsyncEmailCaptcha  SendAsyncEmailCaptchaRequest
     * @return SendAsyncEmailCaptchaResponse
     */
    @Override
    public CompletableFuture<SendAsyncEmailCaptchaResponse> sendAsyncEmailCaptcha(SendAsyncEmailCaptchaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SendAsyncEmailCaptcha").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SendAsyncEmailCaptchaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SendAsyncEmailCaptchaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SendAsyncMobileCaptcha  SendAsyncMobileCaptchaRequest
     * @return SendAsyncMobileCaptchaResponse
     */
    @Override
    public CompletableFuture<SendAsyncMobileCaptchaResponse> sendAsyncMobileCaptcha(SendAsyncMobileCaptchaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SendAsyncMobileCaptcha").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SendAsyncMobileCaptchaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SendAsyncMobileCaptchaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
