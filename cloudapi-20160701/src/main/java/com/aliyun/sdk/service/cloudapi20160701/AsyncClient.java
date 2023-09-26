// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160701;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.cloudapi20160701.models.*;
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

    CompletableFuture<AbolishApiResponse> abolishApi(AbolishApiRequest request);

    CompletableFuture<AddBlackListResponse> addBlackList(AddBlackListRequest request);

    CompletableFuture<AddIpControlPolicyItemResponse> addIpControlPolicyItem(AddIpControlPolicyItemRequest request);

    CompletableFuture<AddTrafficSpecialControlResponse> addTrafficSpecialControl(AddTrafficSpecialControlRequest request);

    CompletableFuture<CreateApiResponse> createApi(CreateApiRequest request);

    CompletableFuture<CreateApiGroupResponse> createApiGroup(CreateApiGroupRequest request);

    CompletableFuture<CreateApiStageVariableResponse> createApiStageVariable(CreateApiStageVariableRequest request);

    CompletableFuture<CreateAppResponse> createApp(CreateAppRequest request);

    CompletableFuture<CreateCustomizedInfoResponse> createCustomizedInfo(CreateCustomizedInfoRequest request);

    CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request);

    CompletableFuture<CreateIntranetDomainResponse> createIntranetDomain(CreateIntranetDomainRequest request);

    CompletableFuture<CreateIpControlResponse> createIpControl(CreateIpControlRequest request);

    CompletableFuture<CreateLogConfigResponse> createLogConfig(CreateLogConfigRequest request);

    CompletableFuture<CreateRaceWorkForInnerResponse> createRaceWorkForInner(CreateRaceWorkForInnerRequest request);

    CompletableFuture<CreateSecretKeyResponse> createSecretKey(CreateSecretKeyRequest request);

    CompletableFuture<CreateTrafficControlResponse> createTrafficControl(CreateTrafficControlRequest request);

    CompletableFuture<DeleteAllTrafficSpecialControlResponse> deleteAllTrafficSpecialControl(DeleteAllTrafficSpecialControlRequest request);

    CompletableFuture<DeleteApiResponse> deleteApi(DeleteApiRequest request);

    CompletableFuture<DeleteApiGroupResponse> deleteApiGroup(DeleteApiGroupRequest request);

    CompletableFuture<DeleteApiStageVariableResponse> deleteApiStageVariable(DeleteApiStageVariableRequest request);

    CompletableFuture<DeleteAppResponse> deleteApp(DeleteAppRequest request);

    CompletableFuture<DeleteDomainResponse> deleteDomain(DeleteDomainRequest request);

    CompletableFuture<DeleteDomainCertificateResponse> deleteDomainCertificate(DeleteDomainCertificateRequest request);

    CompletableFuture<DeleteIpControlResponse> deleteIpControl(DeleteIpControlRequest request);

    CompletableFuture<DeleteLogConfigResponse> deleteLogConfig(DeleteLogConfigRequest request);

    CompletableFuture<DeleteSecretKeyResponse> deleteSecretKey(DeleteSecretKeyRequest request);

    CompletableFuture<DeleteTrafficControlResponse> deleteTrafficControl(DeleteTrafficControlRequest request);

    CompletableFuture<DeleteTrafficSpecialControlResponse> deleteTrafficSpecialControl(DeleteTrafficSpecialControlRequest request);

    CompletableFuture<DeployApiResponse> deployApi(DeployApiRequest request);

    CompletableFuture<DescribeApiResponse> describeApi(DescribeApiRequest request);

    CompletableFuture<DescribeApiDocResponse> describeApiDoc(DescribeApiDocRequest request);

    CompletableFuture<DescribeApiDocsResponse> describeApiDocs(DescribeApiDocsRequest request);

    CompletableFuture<DescribeApiErrorResponse> describeApiError(DescribeApiErrorRequest request);

    CompletableFuture<DescribeApiGroupDetailResponse> describeApiGroupDetail(DescribeApiGroupDetailRequest request);

    CompletableFuture<DescribeApiGroupDetailForConsumerResponse> describeApiGroupDetailForConsumer(DescribeApiGroupDetailForConsumerRequest request);

    CompletableFuture<DescribeApiGroupsResponse> describeApiGroups(DescribeApiGroupsRequest request);

    CompletableFuture<DescribeApiIpControlsResponse> describeApiIpControls(DescribeApiIpControlsRequest request);

    CompletableFuture<DescribeApiLatencyResponse> describeApiLatency(DescribeApiLatencyRequest request);

    CompletableFuture<DescribeApiQpsResponse> describeApiQps(DescribeApiQpsRequest request);

    CompletableFuture<DescribeApiRulesResponse> describeApiRules(DescribeApiRulesRequest request);

    CompletableFuture<DescribeApiStageDetailResponse> describeApiStageDetail(DescribeApiStageDetailRequest request);

    CompletableFuture<DescribeApiTrafficResponse> describeApiTraffic(DescribeApiTrafficRequest request);

    CompletableFuture<DescribeApisResponse> describeApis(DescribeApisRequest request);

    CompletableFuture<DescribeApisByAppResponse> describeApisByApp(DescribeApisByAppRequest request);

    CompletableFuture<DescribeApisByIpControlResponse> describeApisByIpControl(DescribeApisByIpControlRequest request);

    CompletableFuture<DescribeApisByRuleResponse> describeApisByRule(DescribeApisByRuleRequest request);

    CompletableFuture<DescribeApisForConsoleResponse> describeApisForConsole(DescribeApisForConsoleRequest request);

    CompletableFuture<DescribeAppResponse> describeApp(DescribeAppRequest request);

    CompletableFuture<DescribeAppSecuritiesResponse> describeAppSecurities(DescribeAppSecuritiesRequest request);

    CompletableFuture<DescribeAppSecurityResponse> describeAppSecurity(DescribeAppSecurityRequest request);

    CompletableFuture<DescribeAppsResponse> describeApps(DescribeAppsRequest request);

    CompletableFuture<DescribeAppsByApiResponse> describeAppsByApi(DescribeAppsByApiRequest request);

    CompletableFuture<DescribeAppsForProviderResponse> describeAppsForProvider(DescribeAppsForProviderRequest request);

    CompletableFuture<DescribeBlackListsResponse> describeBlackLists(DescribeBlackListsRequest request);

    CompletableFuture<DescribeDeployedApiResponse> describeDeployedApi(DescribeDeployedApiRequest request);

    CompletableFuture<DescribeDeployedApisResponse> describeDeployedApis(DescribeDeployedApisRequest request);

    CompletableFuture<DescribeDomainResponse> describeDomain(DescribeDomainRequest request);

    CompletableFuture<DescribeDomainResolutionResponse> describeDomainResolution(DescribeDomainResolutionRequest request);

    CompletableFuture<DescribeHistoryApiResponse> describeHistoryApi(DescribeHistoryApiRequest request);

    CompletableFuture<DescribeHistoryApisResponse> describeHistoryApis(DescribeHistoryApisRequest request);

    CompletableFuture<DescribeIpControlPolicyItemsResponse> describeIpControlPolicyItems(DescribeIpControlPolicyItemsRequest request);

    CompletableFuture<DescribeIpControlsResponse> describeIpControls(DescribeIpControlsRequest request);

    CompletableFuture<DescribeLogConfigResponse> describeLogConfig(DescribeLogConfigRequest request);

    CompletableFuture<DescribePurchasedApiResponse> describePurchasedApi(DescribePurchasedApiRequest request);

    CompletableFuture<DescribePurchasedApiGroupDetailResponse> describePurchasedApiGroupDetail(DescribePurchasedApiGroupDetailRequest request);

    CompletableFuture<DescribePurchasedApiGroupsResponse> describePurchasedApiGroups(DescribePurchasedApiGroupsRequest request);

    CompletableFuture<DescribePurchasedApisResponse> describePurchasedApis(DescribePurchasedApisRequest request);

    CompletableFuture<DescribeRaceWorkForInnerResponse> describeRaceWorkForInner(DescribeRaceWorkForInnerRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<DescribeRulesByApiResponse> describeRulesByApi(DescribeRulesByApiRequest request);

    CompletableFuture<DescribeSecretKeysResponse> describeSecretKeys(DescribeSecretKeysRequest request);

    CompletableFuture<DescribeSystemParametersResponse> describeSystemParameters(DescribeSystemParametersRequest request);

    CompletableFuture<DescribeSystemParamsResponse> describeSystemParams(DescribeSystemParamsRequest request);

    CompletableFuture<DescribeTrafficControlsResponse> describeTrafficControls(DescribeTrafficControlsRequest request);

    CompletableFuture<ExportSwaggerResponse> exportSwagger(ExportSwaggerRequest request);

    CompletableFuture<GetApiMethodsResponse> getApiMethods(GetApiMethodsRequest request);

    CompletableFuture<GetCustomizedInfoResponse> getCustomizedInfo(GetCustomizedInfoRequest request);

    CompletableFuture<ImportSwaggerResponse> importSwagger(ImportSwaggerRequest request);

    CompletableFuture<ModifyApiResponse> modifyApi(ModifyApiRequest request);

    CompletableFuture<ModifyApiGroupResponse> modifyApiGroup(ModifyApiGroupRequest request);

    CompletableFuture<ModifyAppResponse> modifyApp(ModifyAppRequest request);

    CompletableFuture<ModifyInstanceAttributeResponse> modifyInstanceAttribute(ModifyInstanceAttributeRequest request);

    CompletableFuture<ModifyInstanceVpcAttributeResponse> modifyInstanceVpcAttribute(ModifyInstanceVpcAttributeRequest request);

    CompletableFuture<ModifyIpControlResponse> modifyIpControl(ModifyIpControlRequest request);

    CompletableFuture<ModifyIpControlPolicyItemResponse> modifyIpControlPolicyItem(ModifyIpControlPolicyItemRequest request);

    CompletableFuture<ModifyLogConfigResponse> modifyLogConfig(ModifyLogConfigRequest request);

    CompletableFuture<ModifySecretKeyResponse> modifySecretKey(ModifySecretKeyRequest request);

    CompletableFuture<ModifyTrafficControlResponse> modifyTrafficControl(ModifyTrafficControlRequest request);

    CompletableFuture<ReactivateDomainResponse> reactivateDomain(ReactivateDomainRequest request);

    CompletableFuture<RecoverApiFromHistoricalResponse> recoverApiFromHistorical(RecoverApiFromHistoricalRequest request);

    CompletableFuture<RecoveryApiDefineFromHistoricalResponse> recoveryApiDefineFromHistorical(RecoveryApiDefineFromHistoricalRequest request);

    CompletableFuture<RecoveryApiFromHistoricalResponse> recoveryApiFromHistorical(RecoveryApiFromHistoricalRequest request);

    CompletableFuture<RefreshDomainResponse> refreshDomain(RefreshDomainRequest request);

    CompletableFuture<RemoveAccessPermissionByApisResponse> removeAccessPermissionByApis(RemoveAccessPermissionByApisRequest request);

    CompletableFuture<RemoveAccessPermissionByAppsResponse> removeAccessPermissionByApps(RemoveAccessPermissionByAppsRequest request);

    CompletableFuture<RemoveAllBlackListResponse> removeAllBlackList(RemoveAllBlackListRequest request);

    CompletableFuture<RemoveApiRuleResponse> removeApiRule(RemoveApiRuleRequest request);

    CompletableFuture<RemoveBlackListResponse> removeBlackList(RemoveBlackListRequest request);

    CompletableFuture<RemoveIpControlApisResponse> removeIpControlApis(RemoveIpControlApisRequest request);

    CompletableFuture<RemoveIpControlPolicyItemResponse> removeIpControlPolicyItem(RemoveIpControlPolicyItemRequest request);

    CompletableFuture<ResetAppKeySecretResponse> resetAppKeySecret(ResetAppKeySecretRequest request);

    CompletableFuture<ResetCustomizedResponse> resetCustomized(ResetCustomizedRequest request);

    CompletableFuture<SdkGenerateResponse> sdkGenerate(SdkGenerateRequest request);

    CompletableFuture<SdkGenerateByAppResponse> sdkGenerateByApp(SdkGenerateByAppRequest request);

    CompletableFuture<SdkGenerateByGroupResponse> sdkGenerateByGroup(SdkGenerateByGroupRequest request);

    CompletableFuture<SetAccessPermissionByApisResponse> setAccessPermissionByApis(SetAccessPermissionByApisRequest request);

    CompletableFuture<SetAccessPermissionsResponse> setAccessPermissions(SetAccessPermissionsRequest request);

    CompletableFuture<SetApiRuleResponse> setApiRule(SetApiRuleRequest request);

    CompletableFuture<SetDomainResponse> setDomain(SetDomainRequest request);

    CompletableFuture<SetDomainCertificateResponse> setDomainCertificate(SetDomainCertificateRequest request);

    CompletableFuture<SetDomainWebSocketStatusResponse> setDomainWebSocketStatus(SetDomainWebSocketStatusRequest request);

    CompletableFuture<SetIpControlApisResponse> setIpControlApis(SetIpControlApisRequest request);

    CompletableFuture<SetMockIntegrationResponse> setMockIntegration(SetMockIntegrationRequest request);

    CompletableFuture<SetWildcardDomainPatternsResponse> setWildcardDomainPatterns(SetWildcardDomainPatternsRequest request);

    CompletableFuture<SwitchApiResponse> switchApi(SwitchApiRequest request);

    CompletableFuture<VpcDescribeAccessesResponse> vpcDescribeAccesses(VpcDescribeAccessesRequest request);

    CompletableFuture<VpcGrantAccessResponse> vpcGrantAccess(VpcGrantAccessRequest request);

    CompletableFuture<VpcModifyAccessResponse> vpcModifyAccess(VpcModifyAccessRequest request);

    CompletableFuture<VpcRevokeAccessResponse> vpcRevokeAccess(VpcRevokeAccessRequest request);

}
