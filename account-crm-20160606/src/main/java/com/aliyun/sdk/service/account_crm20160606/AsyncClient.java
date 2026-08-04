// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.account_crm20160606;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.account_crm20160606.models.*;
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
     * @param request the request parameters of AccountOneKeyDelete  AccountOneKeyDeleteRequest
     * @return AccountOneKeyDeleteResponse
     */
    CompletableFuture<AccountOneKeyDeleteResponse> accountOneKeyDelete(AccountOneKeyDeleteRequest request);

    /**
     * @param request the request parameters of AddCustomerLabel  AddCustomerLabelRequest
     * @return AddCustomerLabelResponse
     */
    CompletableFuture<AddCustomerLabelResponse> addCustomerLabel(AddCustomerLabelRequest request);

    /**
     * @param request the request parameters of AllowAgAccountLogin  AllowAgAccountLoginRequest
     * @return AllowAgAccountLoginResponse
     */
    CompletableFuture<AllowAgAccountLoginResponse> allowAgAccountLogin(AllowAgAccountLoginRequest request);

    /**
     * @param request the request parameters of ApplyAgOneKeyDeleteTask  ApplyAgOneKeyDeleteTaskRequest
     * @return ApplyAgOneKeyDeleteTaskResponse
     */
    CompletableFuture<ApplyAgOneKeyDeleteTaskResponse> applyAgOneKeyDeleteTask(ApplyAgOneKeyDeleteTaskRequest request);

    /**
     * @param request the request parameters of ApplyAgOneKeyOnlyCheckerTask  ApplyAgOneKeyOnlyCheckerTaskRequest
     * @return ApplyAgOneKeyOnlyCheckerTaskResponse
     */
    CompletableFuture<ApplyAgOneKeyOnlyCheckerTaskResponse> applyAgOneKeyOnlyCheckerTask(ApplyAgOneKeyOnlyCheckerTaskRequest request);

    /**
     * @param request the request parameters of ApplyIdentityRegistration  ApplyIdentityRegistrationRequest
     * @return ApplyIdentityRegistrationResponse
     */
    CompletableFuture<ApplyIdentityRegistrationResponse> applyIdentityRegistration(ApplyIdentityRegistrationRequest request);

    /**
     * @param request the request parameters of AsyncCreateAgAccount  AsyncCreateAgAccountRequest
     * @return AsyncCreateAgAccountResponse
     */
    CompletableFuture<AsyncCreateAgAccountResponse> asyncCreateAgAccount(AsyncCreateAgAccountRequest request);

    /**
     * @param request the request parameters of AsyncModifyAgLoginEmail  AsyncModifyAgLoginEmailRequest
     * @return AsyncModifyAgLoginEmailResponse
     */
    CompletableFuture<AsyncModifyAgLoginEmailResponse> asyncModifyAgLoginEmail(AsyncModifyAgLoginEmailRequest request);

    /**
     * @param request the request parameters of AuthAndActiveWithHid  AuthAndActiveWithHidRequest
     * @return AuthAndActiveWithHidResponse
     */
    CompletableFuture<AuthAndActiveWithHidResponse> authAndActiveWithHid(AuthAndActiveWithHidRequest request);

    /**
     * @param request the request parameters of AuthAndRefreshLoginTicket  AuthAndRefreshLoginTicketRequest
     * @return AuthAndRefreshLoginTicketResponse
     */
    CompletableFuture<AuthAndRefreshLoginTicketResponse> authAndRefreshLoginTicket(AuthAndRefreshLoginTicketRequest request);

    /**
     * @param request the request parameters of AuthLoginTicket  AuthLoginTicketRequest
     * @return AuthLoginTicketResponse
     */
    CompletableFuture<AuthLoginTicketResponse> authLoginTicket(AuthLoginTicketRequest request);

    /**
     * @param request the request parameters of BatchQueryAgAccount  BatchQueryAgAccountRequest
     * @return BatchQueryAgAccountResponse
     */
    CompletableFuture<BatchQueryAgAccountResponse> batchQueryAgAccount(BatchQueryAgAccountRequest request);

    /**
     * @param request the request parameters of BatchQueryCreateAccountTrace  BatchQueryCreateAccountTraceRequest
     * @return BatchQueryCreateAccountTraceResponse
     */
    CompletableFuture<BatchQueryCreateAccountTraceResponse> batchQueryCreateAccountTrace(BatchQueryCreateAccountTraceRequest request);

    /**
     * @param request the request parameters of BatchQueryModifyLoginEmailTrace  BatchQueryModifyLoginEmailTraceRequest
     * @return BatchQueryModifyLoginEmailTraceResponse
     */
    CompletableFuture<BatchQueryModifyLoginEmailTraceResponse> batchQueryModifyLoginEmailTrace(BatchQueryModifyLoginEmailTraceRequest request);

    /**
     * @param request the request parameters of CancelAsyncCreateAgAccount  CancelAsyncCreateAgAccountRequest
     * @return CancelAsyncCreateAgAccountResponse
     */
    CompletableFuture<CancelAsyncCreateAgAccountResponse> cancelAsyncCreateAgAccount(CancelAsyncCreateAgAccountRequest request);

    /**
     * @param request the request parameters of CancelAsyncModifyLoginEmail  CancelAsyncModifyLoginEmailRequest
     * @return CancelAsyncModifyLoginEmailResponse
     */
    CompletableFuture<CancelAsyncModifyLoginEmailResponse> cancelAsyncModifyLoginEmail(CancelAsyncModifyLoginEmailRequest request);

    /**
     * @param request the request parameters of ChangeAgAccountNationalityCode  ChangeAgAccountNationalityCodeRequest
     * @return ChangeAgAccountNationalityCodeResponse
     */
    CompletableFuture<ChangeAgAccountNationalityCodeResponse> changeAgAccountNationalityCode(ChangeAgAccountNationalityCodeRequest request);

    /**
     * @param request the request parameters of ChangeAgSecurityEmail  ChangeAgSecurityEmailRequest
     * @return ChangeAgSecurityEmailResponse
     */
    CompletableFuture<ChangeAgSecurityEmailResponse> changeAgSecurityEmail(ChangeAgSecurityEmailRequest request);

    /**
     * @param request the request parameters of ChangeAgSecurityMobile  ChangeAgSecurityMobileRequest
     * @return ChangeAgSecurityMobileResponse
     */
    CompletableFuture<ChangeAgSecurityMobileResponse> changeAgSecurityMobile(ChangeAgSecurityMobileRequest request);

    /**
     * @param request the request parameters of CreateAccountProfileInfo  CreateAccountProfileInfoRequest
     * @return CreateAccountProfileInfoResponse
     */
    CompletableFuture<CreateAccountProfileInfoResponse> createAccountProfileInfo(CreateAccountProfileInfoRequest request);

    /**
     * @param request the request parameters of CreateAgAccount  CreateAgAccountRequest
     * @return CreateAgAccountResponse
     */
    CompletableFuture<CreateAgAccountResponse> createAgAccount(CreateAgAccountRequest request);

    /**
     * @param request the request parameters of CreateContacter  CreateContacterRequest
     * @return CreateContacterResponse
     */
    CompletableFuture<CreateContacterResponse> createContacter(CreateContacterRequest request);

    /**
     * @param request the request parameters of CreateRealNameCertification  CreateRealNameCertificationRequest
     * @return CreateRealNameCertificationResponse
     */
    CompletableFuture<CreateRealNameCertificationResponse> createRealNameCertification(CreateRealNameCertificationRequest request);

    /**
     * @param request the request parameters of CustomerSensitiveInfoLogicalDelete  CustomerSensitiveInfoLogicalDeleteRequest
     * @return CustomerSensitiveInfoLogicalDeleteResponse
     */
    CompletableFuture<CustomerSensitiveInfoLogicalDeleteResponse> customerSensitiveInfoLogicalDelete(CustomerSensitiveInfoLogicalDeleteRequest request);

    /**
     * @param request the request parameters of CustomerSensitiveInfoPhysicalDelete  CustomerSensitiveInfoPhysicalDeleteRequest
     * @return CustomerSensitiveInfoPhysicalDeleteResponse
     */
    CompletableFuture<CustomerSensitiveInfoPhysicalDeleteResponse> customerSensitiveInfoPhysicalDelete(CustomerSensitiveInfoPhysicalDeleteRequest request);

    /**
     * @param request the request parameters of DelCacheOperateSync  DelCacheOperateSyncRequest
     * @return DelCacheOperateSyncResponse
     */
    CompletableFuture<DelCacheOperateSyncResponse> delCacheOperateSync(DelCacheOperateSyncRequest request);

    /**
     * @param request the request parameters of DeleteContacter  DeleteContacterRequest
     * @return DeleteContacterResponse
     */
    CompletableFuture<DeleteContacterResponse> deleteContacter(DeleteContacterRequest request);

    /**
     * @param request the request parameters of DeleteCustomerLabel  DeleteCustomerLabelRequest
     * @return DeleteCustomerLabelResponse
     */
    CompletableFuture<DeleteCustomerLabelResponse> deleteCustomerLabel(DeleteCustomerLabelRequest request);

    /**
     * @param request the request parameters of ExistBindsByOuterId  ExistBindsByOuterIdRequest
     * @return ExistBindsByOuterIdResponse
     */
    CompletableFuture<ExistBindsByOuterIdResponse> existBindsByOuterId(ExistBindsByOuterIdRequest request);

    /**
     * @param request the request parameters of FindAllContacter  FindAllContacterRequest
     * @return FindAllContacterResponse
     */
    CompletableFuture<FindAllContacterResponse> findAllContacter(FindAllContacterRequest request);

    /**
     * @param request the request parameters of FindBizCategoryConfig  FindBizCategoryConfigRequest
     * @return FindBizCategoryConfigResponse
     */
    CompletableFuture<FindBizCategoryConfigResponse> findBizCategoryConfig(FindBizCategoryConfigRequest request);

    /**
     * @param request the request parameters of FindContacter  FindContacterRequest
     * @return FindContacterResponse
     */
    CompletableFuture<FindContacterResponse> findContacter(FindContacterRequest request);

    /**
     * @param request the request parameters of FindCustomerInfo  FindCustomerInfoRequest
     * @return FindCustomerInfoResponse
     */
    CompletableFuture<FindCustomerInfoResponse> findCustomerInfo(FindCustomerInfoRequest request);

    /**
     * @param request the request parameters of FindCustomerSnapshot  FindCustomerSnapshotRequest
     * @return FindCustomerSnapshotResponse
     */
    CompletableFuture<FindCustomerSnapshotResponse> findCustomerSnapshot(FindCustomerSnapshotRequest request);

    /**
     * @param request the request parameters of FindFinanceTax  FindFinanceTaxRequest
     * @return FindFinanceTaxResponse
     */
    CompletableFuture<FindFinanceTaxResponse> findFinanceTax(FindFinanceTaxRequest request);

    /**
     * @param request the request parameters of FindFinanceTaxDetail  FindFinanceTaxDetailRequest
     * @return FindFinanceTaxDetailResponse
     */
    CompletableFuture<FindFinanceTaxDetailResponse> findFinanceTaxDetail(FindFinanceTaxDetailRequest request);

    /**
     * @param request the request parameters of FindPkByHidForLoginWithLegacy  FindPkByHidForLoginWithLegacyRequest
     * @return FindPkByHidForLoginWithLegacyResponse
     */
    CompletableFuture<FindPkByHidForLoginWithLegacyResponse> findPkByHidForLoginWithLegacy(FindPkByHidForLoginWithLegacyRequest request);

    /**
     * @param request the request parameters of ForbiddenAgAccountLogin  ForbiddenAgAccountLoginRequest
     * @return ForbiddenAgAccountLoginResponse
     */
    CompletableFuture<ForbiddenAgAccountLoginResponse> forbiddenAgAccountLogin(ForbiddenAgAccountLoginRequest request);

    /**
     * @param request the request parameters of GenerateAliyunCertUrl  GenerateAliyunCertUrlRequest
     * @return GenerateAliyunCertUrlResponse
     */
    CompletableFuture<GenerateAliyunCertUrlResponse> generateAliyunCertUrl(GenerateAliyunCertUrlRequest request);

    /**
     * @param request the request parameters of GetAgAccountAk  GetAgAccountAkRequest
     * @return GetAgAccountAkResponse
     */
    CompletableFuture<GetAgAccountAkResponse> getAgAccountAk(GetAgAccountAkRequest request);

    /**
     * @param request the request parameters of GetAgOneKeyDeleteTask  GetAgOneKeyDeleteTaskRequest
     * @return GetAgOneKeyDeleteTaskResponse
     */
    CompletableFuture<GetAgOneKeyDeleteTaskResponse> getAgOneKeyDeleteTask(GetAgOneKeyDeleteTaskRequest request);

    /**
     * @param request the request parameters of GetAgRelation  GetAgRelationRequest
     * @return GetAgRelationResponse
     */
    CompletableFuture<GetAgRelationResponse> getAgRelation(GetAgRelationRequest request);

    /**
     * @param request the request parameters of GetAliyunIdByPk  GetAliyunIdByPkRequest
     * @return GetAliyunIdByPkResponse
     */
    CompletableFuture<GetAliyunIdByPkResponse> getAliyunIdByPk(GetAliyunIdByPkRequest request);

    /**
     * @param request the request parameters of GetAliyunPKByAliyunID  GetAliyunPKByAliyunIDRequest
     * @return GetAliyunPKByAliyunIDResponse
     */
    CompletableFuture<GetAliyunPKByAliyunIDResponse> getAliyunPKByAliyunID(GetAliyunPKByAliyunIDRequest request);

    /**
     * @param request the request parameters of GetCustomerCategory  GetCustomerCategoryRequest
     * @return GetCustomerCategoryResponse
     */
    CompletableFuture<GetCustomerCategoryResponse> getCustomerCategory(GetCustomerCategoryRequest request);

    /**
     * @param request the request parameters of GetCustomerCategoryDictionary  GetCustomerCategoryDictionaryRequest
     * @return GetCustomerCategoryDictionaryResponse
     */
    CompletableFuture<GetCustomerCategoryDictionaryResponse> getCustomerCategoryDictionary(GetCustomerCategoryDictionaryRequest request);

    /**
     * @param request the request parameters of GetCustomerInformation  GetCustomerInformationRequest
     * @return GetCustomerInformationResponse
     */
    CompletableFuture<GetCustomerInformationResponse> getCustomerInformation(GetCustomerInformationRequest request);

    /**
     * @param request the request parameters of GetDingTalkUserOrgByAliyunTmpCode  GetDingTalkUserOrgByAliyunTmpCodeRequest
     * @return GetDingTalkUserOrgByAliyunTmpCodeResponse
     */
    CompletableFuture<GetDingTalkUserOrgByAliyunTmpCodeResponse> getDingTalkUserOrgByAliyunTmpCode(GetDingTalkUserOrgByAliyunTmpCodeRequest request);

    /**
     * @param request the request parameters of GetIdentityRegistrationByCustomer  GetIdentityRegistrationByCustomerRequest
     * @return GetIdentityRegistrationByCustomerResponse
     */
    CompletableFuture<GetIdentityRegistrationByCustomerResponse> getIdentityRegistrationByCustomer(GetIdentityRegistrationByCustomerRequest request);

    /**
     * @param request the request parameters of GetProfileTypeByPk  GetProfileTypeByPkRequest
     * @return GetProfileTypeByPkResponse
     */
    CompletableFuture<GetProfileTypeByPkResponse> getProfileTypeByPk(GetProfileTypeByPkRequest request);

    /**
     * @param request the request parameters of GetUploadIdentityRegistrationDocConfig  GetUploadIdentityRegistrationDocConfigRequest
     * @return GetUploadIdentityRegistrationDocConfigResponse
     */
    CompletableFuture<GetUploadIdentityRegistrationDocConfigResponse> getUploadIdentityRegistrationDocConfig(GetUploadIdentityRegistrationDocConfigRequest request);

    /**
     * @param request the request parameters of IncrByCacheOperateSync  IncrByCacheOperateSyncRequest
     * @return IncrByCacheOperateSyncResponse
     */
    CompletableFuture<IncrByCacheOperateSyncResponse> incrByCacheOperateSync(IncrByCacheOperateSyncRequest request);

    /**
     * @param request the request parameters of JudgeAgExistQuietPeriod  JudgeAgExistQuietPeriodRequest
     * @return JudgeAgExistQuietPeriodResponse
     */
    CompletableFuture<JudgeAgExistQuietPeriodResponse> judgeAgExistQuietPeriod(JudgeAgExistQuietPeriodRequest request);

    /**
     * @param request the request parameters of LoadRealNameInfoByPk  LoadRealNameInfoByPkRequest
     * @return LoadRealNameInfoByPkResponse
     */
    CompletableFuture<LoadRealNameInfoByPkResponse> loadRealNameInfoByPk(LoadRealNameInfoByPkRequest request);

    /**
     * @param request the request parameters of MapFromHavanaBindId  MapFromHavanaBindIdRequest
     * @return MapFromHavanaBindIdResponse
     */
    CompletableFuture<MapFromHavanaBindIdResponse> mapFromHavanaBindId(MapFromHavanaBindIdRequest request);

    /**
     * @param request the request parameters of MapPkFromHid  MapPkFromHidRequest
     * @return MapPkFromHidResponse
     */
    CompletableFuture<MapPkFromHidResponse> mapPkFromHid(MapPkFromHidRequest request);

    /**
     * @param request the request parameters of MapPkToHid  MapPkToHidRequest
     * @return MapPkToHidResponse
     */
    CompletableFuture<MapPkToHidResponse> mapPkToHid(MapPkToHidRequest request);

    /**
     * @param request the request parameters of MapToHavanaBindId  MapToHavanaBindIdRequest
     * @return MapToHavanaBindIdResponse
     */
    CompletableFuture<MapToHavanaBindIdResponse> mapToHavanaBindId(MapToHavanaBindIdRequest request);

    /**
     * @param request the request parameters of ModifyBizCategory  ModifyBizCategoryRequest
     * @return ModifyBizCategoryResponse
     */
    CompletableFuture<ModifyBizCategoryResponse> modifyBizCategory(ModifyBizCategoryRequest request);

    /**
     * @param request the request parameters of ModifyContacter  ModifyContacterRequest
     * @return ModifyContacterResponse
     */
    CompletableFuture<ModifyContacterResponse> modifyContacter(ModifyContacterRequest request);

    /**
     * @param request the request parameters of ModifyCustomerInfo  ModifyCustomerInfoRequest
     * @return ModifyCustomerInfoResponse
     */
    CompletableFuture<ModifyCustomerInfoResponse> modifyCustomerInfo(ModifyCustomerInfoRequest request);

    /**
     * @param request the request parameters of OperateFinanceTax  OperateFinanceTaxRequest
     * @return OperateFinanceTaxResponse
     */
    CompletableFuture<OperateFinanceTaxResponse> operateFinanceTax(OperateFinanceTaxRequest request);

    /**
     * @param request the request parameters of QueryAccountAddressInfo  QueryAccountAddressInfoRequest
     * @return QueryAccountAddressInfoResponse
     */
    CompletableFuture<QueryAccountAddressInfoResponse> queryAccountAddressInfo(QueryAccountAddressInfoRequest request);

    /**
     * @param request the request parameters of QueryAccountAddressInfoWithoutHavana  QueryAccountAddressInfoWithoutHavanaRequest
     * @return QueryAccountAddressInfoWithoutHavanaResponse
     */
    CompletableFuture<QueryAccountAddressInfoWithoutHavanaResponse> queryAccountAddressInfoWithoutHavana(QueryAccountAddressInfoWithoutHavanaRequest request);

    /**
     * @param request the request parameters of QueryAccountDeliveryAddressInfo  QueryAccountDeliveryAddressInfoRequest
     * @return QueryAccountDeliveryAddressInfoResponse
     */
    CompletableFuture<QueryAccountDeliveryAddressInfoResponse> queryAccountDeliveryAddressInfo(QueryAccountDeliveryAddressInfoRequest request);

    /**
     * @param request the request parameters of QueryAccountProfileInfo  QueryAccountProfileInfoRequest
     * @return QueryAccountProfileInfoResponse
     */
    CompletableFuture<QueryAccountProfileInfoResponse> queryAccountProfileInfo(QueryAccountProfileInfoRequest request);

    /**
     * @param request the request parameters of QueryAccountRealNameInfo  QueryAccountRealNameInfoRequest
     * @return QueryAccountRealNameInfoResponse
     */
    CompletableFuture<QueryAccountRealNameInfoResponse> queryAccountRealNameInfo(QueryAccountRealNameInfoRequest request);

    /**
     * @param request the request parameters of QueryAccountSite  QueryAccountSiteRequest
     * @return QueryAccountSiteResponse
     */
    CompletableFuture<QueryAccountSiteResponse> queryAccountSite(QueryAccountSiteRequest request);

    /**
     * @param request the request parameters of QueryAccountTrueName  QueryAccountTrueNameRequest
     * @return QueryAccountTrueNameResponse
     */
    CompletableFuture<QueryAccountTrueNameResponse> queryAccountTrueName(QueryAccountTrueNameRequest request);

    /**
     * @param request the request parameters of QueryAgAccountLoginPermission  QueryAgAccountLoginPermissionRequest
     * @return QueryAgAccountLoginPermissionResponse
     */
    CompletableFuture<QueryAgAccountLoginPermissionResponse> queryAgAccountLoginPermission(QueryAgAccountLoginPermissionRequest request);

    /**
     * @param request the request parameters of QueryAgRelationCountAndQuota  QueryAgRelationCountAndQuotaRequest
     * @return QueryAgRelationCountAndQuotaResponse
     */
    CompletableFuture<QueryAgRelationCountAndQuotaResponse> queryAgRelationCountAndQuota(QueryAgRelationCountAndQuotaRequest request);

    /**
     * @param request the request parameters of QueryAgSecurityMobile  QueryAgSecurityMobileRequest
     * @return QueryAgSecurityMobileResponse
     */
    CompletableFuture<QueryAgSecurityMobileResponse> queryAgSecurityMobile(QueryAgSecurityMobileRequest request);

    /**
     * @param request the request parameters of QueryBindsByOuterId  QueryBindsByOuterIdRequest
     * @return QueryBindsByOuterIdResponse
     */
    CompletableFuture<QueryBindsByOuterIdResponse> queryBindsByOuterId(QueryBindsByOuterIdRequest request);

    /**
     * @param request the request parameters of QueryBindsByPk  QueryBindsByPkRequest
     * @return QueryBindsByPkResponse
     */
    CompletableFuture<QueryBindsByPkResponse> queryBindsByPk(QueryBindsByPkRequest request);

    /**
     * @param request the request parameters of QueryCustomerLabel  QueryCustomerLabelRequest
     * @return QueryCustomerLabelResponse
     */
    CompletableFuture<QueryCustomerLabelResponse> queryCustomerLabel(QueryCustomerLabelRequest request);

    /**
     * @param request the request parameters of QueryDeleteTaskCheckData  QueryDeleteTaskCheckDataRequest
     * @return QueryDeleteTaskCheckDataResponse
     */
    CompletableFuture<QueryDeleteTaskCheckDataResponse> queryDeleteTaskCheckData(QueryDeleteTaskCheckDataRequest request);

    /**
     * @param request the request parameters of QueryEncryptedAccountProfileInfo  QueryEncryptedAccountProfileInfoRequest
     * @return QueryEncryptedAccountProfileInfoResponse
     */
    CompletableFuture<QueryEncryptedAccountProfileInfoResponse> queryEncryptedAccountProfileInfo(QueryEncryptedAccountProfileInfoRequest request);

    /**
     * @param request the request parameters of QueryEnterpriseInfo  QueryEnterpriseInfoRequest
     * @return QueryEnterpriseInfoResponse
     */
    CompletableFuture<QueryEnterpriseInfoResponse> queryEnterpriseInfo(QueryEnterpriseInfoRequest request);

    /**
     * @param request the request parameters of QueryEnumConfigByType  QueryEnumConfigByTypeRequest
     * @return QueryEnumConfigByTypeResponse
     */
    CompletableFuture<QueryEnumConfigByTypeResponse> queryEnumConfigByType(QueryEnumConfigByTypeRequest request);

    /**
     * @param request the request parameters of QueryOneKeyDeleteBlockList  QueryOneKeyDeleteBlockListRequest
     * @return QueryOneKeyDeleteBlockListResponse
     */
    CompletableFuture<QueryOneKeyDeleteBlockListResponse> queryOneKeyDeleteBlockList(QueryOneKeyDeleteBlockListRequest request);

    /**
     * @param request the request parameters of QuerySecurityInfo  QuerySecurityInfoRequest
     * @return QuerySecurityInfoResponse
     */
    CompletableFuture<QuerySecurityInfoResponse> querySecurityInfo(QuerySecurityInfoRequest request);

    /**
     * @param request the request parameters of RegisterInternalAccountForBuc  RegisterInternalAccountForBucRequest
     * @return RegisterInternalAccountForBucResponse
     */
    CompletableFuture<RegisterInternalAccountForBucResponse> registerInternalAccountForBuc(RegisterInternalAccountForBucRequest request);

    /**
     * @param request the request parameters of ReleaseAgAccount  ReleaseAgAccountRequest
     * @return ReleaseAgAccountResponse
     */
    CompletableFuture<ReleaseAgAccountResponse> releaseAgAccount(ReleaseAgAccountRequest request);

    /**
     * @param request the request parameters of ResendAsyncCreateAgAccount  ResendAsyncCreateAgAccountRequest
     * @return ResendAsyncCreateAgAccountResponse
     */
    CompletableFuture<ResendAsyncCreateAgAccountResponse> resendAsyncCreateAgAccount(ResendAsyncCreateAgAccountRequest request);

    /**
     * @param request the request parameters of ResendAsyncModifyLoginEmail  ResendAsyncModifyLoginEmailRequest
     * @return ResendAsyncModifyLoginEmailResponse
     */
    CompletableFuture<ResendAsyncModifyLoginEmailResponse> resendAsyncModifyLoginEmail(ResendAsyncModifyLoginEmailRequest request);

    /**
     * @param request the request parameters of SeparateAgRelation  SeparateAgRelationRequest
     * @return SeparateAgRelationResponse
     */
    CompletableFuture<SeparateAgRelationResponse> separateAgRelation(SeparateAgRelationRequest request);

    /**
     * @param request the request parameters of SetCacheOperateSync  SetCacheOperateSyncRequest
     * @return SetCacheOperateSyncResponse
     */
    CompletableFuture<SetCacheOperateSyncResponse> setCacheOperateSync(SetCacheOperateSyncRequest request);

    /**
     * @param request the request parameters of UpdateAccountAddressInfo  UpdateAccountAddressInfoRequest
     * @return UpdateAccountAddressInfoResponse
     */
    CompletableFuture<UpdateAccountAddressInfoResponse> updateAccountAddressInfo(UpdateAccountAddressInfoRequest request);

    /**
     * @param request the request parameters of UpdateAccountProfileInfo  UpdateAccountProfileInfoRequest
     * @return UpdateAccountProfileInfoResponse
     */
    CompletableFuture<UpdateAccountProfileInfoResponse> updateAccountProfileInfo(UpdateAccountProfileInfoRequest request);

    /**
     * @param request the request parameters of UpdateAgAccountAddressInfo  UpdateAgAccountAddressInfoRequest
     * @return UpdateAgAccountAddressInfoResponse
     */
    CompletableFuture<UpdateAgAccountAddressInfoResponse> updateAgAccountAddressInfo(UpdateAgAccountAddressInfoRequest request);

    /**
     * @param request the request parameters of UpdateAgServiceStatus  UpdateAgServiceStatusRequest
     * @return UpdateAgServiceStatusResponse
     */
    CompletableFuture<UpdateAgServiceStatusResponse> updateAgServiceStatus(UpdateAgServiceStatusRequest request);

    /**
     * @param request the request parameters of UpdateCustomerCategory  UpdateCustomerCategoryRequest
     * @return UpdateCustomerCategoryResponse
     */
    CompletableFuture<UpdateCustomerCategoryResponse> updateCustomerCategory(UpdateCustomerCategoryRequest request);

    /**
     * @param request the request parameters of UpdateCustomerInformation  UpdateCustomerInformationRequest
     * @return UpdateCustomerInformationResponse
     */
    CompletableFuture<UpdateCustomerInformationResponse> updateCustomerInformation(UpdateCustomerInformationRequest request);

    /**
     * @param request the request parameters of UpdateOrInsertEnterpriseInfo  UpdateOrInsertEnterpriseInfoRequest
     * @return UpdateOrInsertEnterpriseInfoResponse
     */
    CompletableFuture<UpdateOrInsertEnterpriseInfoResponse> updateOrInsertEnterpriseInfo(UpdateOrInsertEnterpriseInfoRequest request);

    /**
     * @param request the request parameters of doLogicalDeleteResource  DoLogicalDeleteResourceRequest
     * @return DoLogicalDeleteResourceResponse
     */
    CompletableFuture<DoLogicalDeleteResourceResponse> doLogicalDeleteResource(DoLogicalDeleteResourceRequest request);

}
