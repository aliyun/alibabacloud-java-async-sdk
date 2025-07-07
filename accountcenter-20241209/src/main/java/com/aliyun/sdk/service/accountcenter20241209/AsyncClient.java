// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.accountcenter20241209;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.accountcenter20241209.models.*;
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
     * @param request the request parameters of EnterpriseAccountChangeLoginPassword  EnterpriseAccountChangeLoginPasswordRequest
     * @return EnterpriseAccountChangeLoginPasswordResponse
     */
    CompletableFuture<EnterpriseAccountChangeLoginPasswordResponse> enterpriseAccountChangeLoginPassword(EnterpriseAccountChangeLoginPasswordRequest request);

    /**
     * @param request the request parameters of EnterpriseAccountChangeSecurityEmail  EnterpriseAccountChangeSecurityEmailRequest
     * @return EnterpriseAccountChangeSecurityEmailResponse
     */
    CompletableFuture<EnterpriseAccountChangeSecurityEmailResponse> enterpriseAccountChangeSecurityEmail(EnterpriseAccountChangeSecurityEmailRequest request);

    /**
     * @param request the request parameters of EnterpriseAccountChangeSecurityMobile  EnterpriseAccountChangeSecurityMobileRequest
     * @return EnterpriseAccountChangeSecurityMobileResponse
     */
    CompletableFuture<EnterpriseAccountChangeSecurityMobileResponse> enterpriseAccountChangeSecurityMobile(EnterpriseAccountChangeSecurityMobileRequest request);

    /**
     * @param request the request parameters of EnterpriseAccountQueryAccountGrantedRoles  EnterpriseAccountQueryAccountGrantedRolesRequest
     * @return EnterpriseAccountQueryAccountGrantedRolesResponse
     */
    CompletableFuture<EnterpriseAccountQueryAccountGrantedRolesResponse> enterpriseAccountQueryAccountGrantedRoles(EnterpriseAccountQueryAccountGrantedRolesRequest request);

    /**
     * @param request the request parameters of EnterpriseAccountQueryAccountsInfo  EnterpriseAccountQueryAccountsInfoRequest
     * @return EnterpriseAccountQueryAccountsInfoResponse
     */
    CompletableFuture<EnterpriseAccountQueryAccountsInfoResponse> enterpriseAccountQueryAccountsInfo(EnterpriseAccountQueryAccountsInfoRequest request);

    /**
     * @param request the request parameters of EnterpriseAccountQueryLoginSettings  EnterpriseAccountQueryLoginSettingsRequest
     * @return EnterpriseAccountQueryLoginSettingsResponse
     */
    CompletableFuture<EnterpriseAccountQueryLoginSettingsResponse> enterpriseAccountQueryLoginSettings(EnterpriseAccountQueryLoginSettingsRequest request);

    /**
     * @param request the request parameters of EnterpriseAccountRemoveMfa  EnterpriseAccountRemoveMfaRequest
     * @return EnterpriseAccountRemoveMfaResponse
     */
    CompletableFuture<EnterpriseAccountRemoveMfaResponse> enterpriseAccountRemoveMfa(EnterpriseAccountRemoveMfaRequest request);

    /**
     * @param request the request parameters of EnterpriseAccountSeparateEa  EnterpriseAccountSeparateEaRequest
     * @return EnterpriseAccountSeparateEaResponse
     */
    CompletableFuture<EnterpriseAccountSeparateEaResponse> enterpriseAccountSeparateEa(EnterpriseAccountSeparateEaRequest request);

    /**
     * @param request the request parameters of EnterpriseAccountUpdateAccountAlias  EnterpriseAccountUpdateAccountAliasRequest
     * @return EnterpriseAccountUpdateAccountAliasResponse
     */
    CompletableFuture<EnterpriseAccountUpdateAccountAliasResponse> enterpriseAccountUpdateAccountAlias(EnterpriseAccountUpdateAccountAliasRequest request);

    /**
     * @param request the request parameters of EnterpriseAccountUpdateAccountBizRoleGrant  EnterpriseAccountUpdateAccountBizRoleGrantRequest
     * @return EnterpriseAccountUpdateAccountBizRoleGrantResponse
     */
    CompletableFuture<EnterpriseAccountUpdateAccountBizRoleGrantResponse> enterpriseAccountUpdateAccountBizRoleGrant(EnterpriseAccountUpdateAccountBizRoleGrantRequest request);

    /**
     * @param request the request parameters of EnterpriseAccountUpdateIpMask  EnterpriseAccountUpdateIpMaskRequest
     * @return EnterpriseAccountUpdateIpMaskResponse
     */
    CompletableFuture<EnterpriseAccountUpdateIpMaskResponse> enterpriseAccountUpdateIpMask(EnterpriseAccountUpdateIpMaskRequest request);

    /**
     * @param request the request parameters of EnterpriseAccountUpdateOperateRiskControl  EnterpriseAccountUpdateOperateRiskControlRequest
     * @return EnterpriseAccountUpdateOperateRiskControlResponse
     */
    CompletableFuture<EnterpriseAccountUpdateOperateRiskControlResponse> enterpriseAccountUpdateOperateRiskControl(EnterpriseAccountUpdateOperateRiskControlRequest request);

    /**
     * @param request the request parameters of EnterpriseAccountUpdateSecurityMobileLoginStatus  EnterpriseAccountUpdateSecurityMobileLoginStatusRequest
     * @return EnterpriseAccountUpdateSecurityMobileLoginStatusResponse
     */
    CompletableFuture<EnterpriseAccountUpdateSecurityMobileLoginStatusResponse> enterpriseAccountUpdateSecurityMobileLoginStatus(EnterpriseAccountUpdateSecurityMobileLoginStatusRequest request);

    /**
     * @param request the request parameters of EnterpriseAccountUpdateSessionExpireTime  EnterpriseAccountUpdateSessionExpireTimeRequest
     * @return EnterpriseAccountUpdateSessionExpireTimeResponse
     */
    CompletableFuture<EnterpriseAccountUpdateSessionExpireTimeResponse> enterpriseAccountUpdateSessionExpireTime(EnterpriseAccountUpdateSessionExpireTimeRequest request);

    /**
     * @param request the request parameters of EnterpriseOrgQueryLoadTree  EnterpriseOrgQueryLoadTreeRequest
     * @return EnterpriseOrgQueryLoadTreeResponse
     */
    CompletableFuture<EnterpriseOrgQueryLoadTreeResponse> enterpriseOrgQueryLoadTree(EnterpriseOrgQueryLoadTreeRequest request);

    /**
     * @param request the request parameters of EnterpriseRegisterAccount  EnterpriseRegisterAccountRequest
     * @return EnterpriseRegisterAccountResponse
     */
    CompletableFuture<EnterpriseRegisterAccountResponse> enterpriseRegisterAccount(EnterpriseRegisterAccountRequest request);

    /**
     * @param request the request parameters of EnterpriseRoleCreateBizRole  EnterpriseRoleCreateBizRoleRequest
     * @return EnterpriseRoleCreateBizRoleResponse
     */
    CompletableFuture<EnterpriseRoleCreateBizRoleResponse> enterpriseRoleCreateBizRole(EnterpriseRoleCreateBizRoleRequest request);

    /**
     * @param request the request parameters of EnterpriseRoleDeleteBizRole  EnterpriseRoleDeleteBizRoleRequest
     * @return EnterpriseRoleDeleteBizRoleResponse
     */
    CompletableFuture<EnterpriseRoleDeleteBizRoleResponse> enterpriseRoleDeleteBizRole(EnterpriseRoleDeleteBizRoleRequest request);

    /**
     * @param request the request parameters of EnterpriseRoleQueryAccountForRoleGrantByPage  EnterpriseRoleQueryAccountForRoleGrantByPageRequest
     * @return EnterpriseRoleQueryAccountForRoleGrantByPageResponse
     */
    CompletableFuture<EnterpriseRoleQueryAccountForRoleGrantByPageResponse> enterpriseRoleQueryAccountForRoleGrantByPage(EnterpriseRoleQueryAccountForRoleGrantByPageRequest request);

    /**
     * @param request the request parameters of EnterpriseRoleQueryBizRoleByPage  EnterpriseRoleQueryBizRoleByPageRequest
     * @return EnterpriseRoleQueryBizRoleByPageResponse
     */
    CompletableFuture<EnterpriseRoleQueryBizRoleByPageResponse> enterpriseRoleQueryBizRoleByPage(EnterpriseRoleQueryBizRoleByPageRequest request);

    /**
     * @param request the request parameters of EnterpriseRoleQueryBizRoleDetail  EnterpriseRoleQueryBizRoleDetailRequest
     * @return EnterpriseRoleQueryBizRoleDetailResponse
     */
    CompletableFuture<EnterpriseRoleQueryBizRoleDetailResponse> enterpriseRoleQueryBizRoleDetail(EnterpriseRoleQueryBizRoleDetailRequest request);

    /**
     * @param request the request parameters of EnterpriseRoleUpdateBizRole  EnterpriseRoleUpdateBizRoleRequest
     * @return EnterpriseRoleUpdateBizRoleResponse
     */
    CompletableFuture<EnterpriseRoleUpdateBizRoleResponse> enterpriseRoleUpdateBizRole(EnterpriseRoleUpdateBizRoleRequest request);

    /**
     * @param request the request parameters of EnterpriseTodoDealAccountTodo  EnterpriseTodoDealAccountTodoRequest
     * @return EnterpriseTodoDealAccountTodoResponse
     */
    CompletableFuture<EnterpriseTodoDealAccountTodoResponse> enterpriseTodoDealAccountTodo(EnterpriseTodoDealAccountTodoRequest request);

    /**
     * @param request the request parameters of EnterpriseTodoQueryAccountTodoList  EnterpriseTodoQueryAccountTodoListRequest
     * @return EnterpriseTodoQueryAccountTodoListResponse
     */
    CompletableFuture<EnterpriseTodoQueryAccountTodoListResponse> enterpriseTodoQueryAccountTodoList(EnterpriseTodoQueryAccountTodoListRequest request);

    /**
     * @param request the request parameters of EnterpriseTodoQueryAccountTodoListByApplicant  EnterpriseTodoQueryAccountTodoListByApplicantRequest
     * @return EnterpriseTodoQueryAccountTodoListByApplicantResponse
     */
    CompletableFuture<EnterpriseTodoQueryAccountTodoListByApplicantResponse> enterpriseTodoQueryAccountTodoListByApplicant(EnterpriseTodoQueryAccountTodoListByApplicantRequest request);

    /**
     * @param request the request parameters of EnterpriseUninvitedAdminInviteJoinEnterprise  EnterpriseUninvitedAdminInviteJoinEnterpriseRequest
     * @return EnterpriseUninvitedAdminInviteJoinEnterpriseResponse
     */
    CompletableFuture<EnterpriseUninvitedAdminInviteJoinEnterpriseResponse> enterpriseUninvitedAdminInviteJoinEnterprise(EnterpriseUninvitedAdminInviteJoinEnterpriseRequest request);

}
