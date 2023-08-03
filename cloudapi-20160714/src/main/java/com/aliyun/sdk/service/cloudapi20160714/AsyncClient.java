// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.cloudapi20160714.models.*;
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

    CompletableFuture<AddAccessControlListEntryResponse> addAccessControlListEntry(AddAccessControlListEntryRequest request);

    /**
      * The restriction policy on app IDs for a specific policy. You can restrict app IDs only for whitelists. The IpControlType values of whitelists are ALLOW.
      * *   You can add only one app ID restriction policy at a time.
      * *   If this parameter is empty, no restriction is imposed on the app IDs.
      * *   If this parameter is not empty, there is restriction not only on IP addresses, but also on apps.
      * *   Please note that if this parameter is not empty and the security authentication method of the API is No Authentication, all API calls are restricted.
      * *   If this parameter is not empty for a blacklist, API Gateway automatically skips this parameter and sets only restriction on IP addresses. The IpControlType value of a blacklist is REFUSE.
      *
     */
    CompletableFuture<AddIpControlPolicyItemResponse> addIpControlPolicyItem(AddIpControlPolicyItemRequest request);

    /**
      * The type of the special throttling policy. Valid values:
      * *   **APP**
      * *   **USER**
      *
     */
    CompletableFuture<AddTrafficSpecialControlResponse> addTrafficSpecialControl(AddTrafficSpecialControlRequest request);

    CompletableFuture<AttachPluginResponse> attachPlugin(AttachPluginRequest request);

    CompletableFuture<BatchAbolishApisResponse> batchAbolishApis(BatchAbolishApisRequest request);

    CompletableFuture<BatchDeployApisResponse> batchDeployApis(BatchDeployApisRequest request);

    CompletableFuture<CreateAccessControlListResponse> createAccessControlList(CreateAccessControlListRequest request);

    /**
      * *   This operation is intended for API providers.
      * *   The name of each API within the same group must be unique.
      * *   Each request path within the same group must be unique.
      * *   The QPS limit on this operation is 50 per user.
      *
     */
    CompletableFuture<CreateApiResponse> createApi(CreateApiRequest request);

    CompletableFuture<CreateApiGroupResponse> createApiGroup(CreateApiGroupRequest request);

    CompletableFuture<CreateApiStageVariableResponse> createApiStageVariable(CreateApiStageVariableRequest request);

    CompletableFuture<CreateAppResponse> createApp(CreateAppRequest request);

    CompletableFuture<CreateBackendResponse> createBackend(CreateBackendRequest request);

    CompletableFuture<CreateBackendModelResponse> createBackendModel(CreateBackendModelRequest request);

    CompletableFuture<CreateDatasetResponse> createDataset(CreateDatasetRequest request);

    CompletableFuture<CreateDatasetItemResponse> createDatasetItem(CreateDatasetItemRequest request);

    CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request);

    CompletableFuture<CreateIntranetDomainResponse> createIntranetDomain(CreateIntranetDomainRequest request);

    CompletableFuture<CreateIpControlResponse> createIpControl(CreateIpControlRequest request);

    CompletableFuture<CreateLogConfigResponse> createLogConfig(CreateLogConfigRequest request);

    /**
      * *   For more information about the model definition, see [JSON Schema Draft 4](https://tools.ietf.org/html/draft-zyp-json-schema-04?spm=a2c4g.11186623.2.10.2e977ff7p4BpQd).
      * *   JSON Schema supports only element attributes of the Object type.
      *
     */
    CompletableFuture<CreateModelResponse> createModel(CreateModelRequest request);

    CompletableFuture<CreateMonitorGroupResponse> createMonitorGroup(CreateMonitorGroupRequest request);

    CompletableFuture<CreatePluginResponse> createPlugin(CreatePluginRequest request);

    /**
      * The Key value of the key. The value must be 6 to 20 characters in length and can contain letters, digits, and underscores (\\_). It must start with a letter.
      *
     */
    CompletableFuture<CreateSignatureResponse> createSignature(CreateSignatureRequest request);

    /**
      * ThrottlingTest
      *
     */
    CompletableFuture<CreateTrafficControlResponse> createTrafficControl(CreateTrafficControlRequest request);

    CompletableFuture<DeleteAccessControlListResponse> deleteAccessControlList(DeleteAccessControlListRequest request);

    /**
      * The ID of the request.
      *
     */
    CompletableFuture<DeleteAllTrafficSpecialControlResponse> deleteAllTrafficSpecialControl(DeleteAllTrafficSpecialControlRequest request);

    CompletableFuture<DeleteApiResponse> deleteApi(DeleteApiRequest request);

    CompletableFuture<DeleteApiGroupResponse> deleteApiGroup(DeleteApiGroupRequest request);

    CompletableFuture<DeleteApiStageVariableResponse> deleteApiStageVariable(DeleteApiStageVariableRequest request);

    CompletableFuture<DeleteAppResponse> deleteApp(DeleteAppRequest request);

    CompletableFuture<DeleteBackendResponse> deleteBackend(DeleteBackendRequest request);

    CompletableFuture<DeleteBackendModelResponse> deleteBackendModel(DeleteBackendModelRequest request);

    CompletableFuture<DeleteDatasetResponse> deleteDataset(DeleteDatasetRequest request);

    CompletableFuture<DeleteDatasetItemResponse> deleteDatasetItem(DeleteDatasetItemRequest request);

    /**
      * The custom domain name.
      *
     */
    CompletableFuture<DeleteDomainResponse> deleteDomain(DeleteDomainRequest request);

    CompletableFuture<DeleteDomainCertificateResponse> deleteDomainCertificate(DeleteDomainCertificateRequest request);

    CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request);

    /**
      * The ID of the request.
      *
     */
    CompletableFuture<DeleteIpControlResponse> deleteIpControl(DeleteIpControlRequest request);

    CompletableFuture<DeleteLogConfigResponse> deleteLogConfig(DeleteLogConfigRequest request);

    CompletableFuture<DeleteModelResponse> deleteModel(DeleteModelRequest request);

    CompletableFuture<DeleteMonitorGroupResponse> deleteMonitorGroup(DeleteMonitorGroupRequest request);

    CompletableFuture<DeletePluginResponse> deletePlugin(DeletePluginRequest request);

    /**
      * The ID of the request.
      *
     */
    CompletableFuture<DeleteSignatureResponse> deleteSignature(DeleteSignatureRequest request);

    CompletableFuture<DeleteTrafficControlResponse> deleteTrafficControl(DeleteTrafficControlRequest request);

    /**
      * The type of the special throttling policy. Valid values:
      * *   **APP**
      * *   **USER**
      *
     */
    CompletableFuture<DeleteTrafficSpecialControlResponse> deleteTrafficSpecialControl(DeleteTrafficSpecialControlRequest request);

    /**
      * The ID of the API.
      *
     */
    CompletableFuture<DeployApiResponse> deployApi(DeployApiRequest request);

    CompletableFuture<DescribeAbolishApiTaskResponse> describeAbolishApiTask(DescribeAbolishApiTaskRequest request);

    CompletableFuture<DescribeAccessControlListAttributeResponse> describeAccessControlListAttribute(DescribeAccessControlListAttributeRequest request);

    CompletableFuture<DescribeAccessControlListsResponse> describeAccessControlLists(DescribeAccessControlListsRequest request);

    /**
      * *   This operation is intended for API providers.
      *
     */
    CompletableFuture<DescribeApiResponse> describeApi(DescribeApiRequest request);

    CompletableFuture<DescribeApiDocResponse> describeApiDoc(DescribeApiDocRequest request);

    /**
      * *   This operation is intended for API providers.
      *
     */
    CompletableFuture<DescribeApiGroupResponse> describeApiGroup(DescribeApiGroupRequest request);

    CompletableFuture<DescribeApiGroupVpcWhitelistResponse> describeApiGroupVpcWhitelist(DescribeApiGroupVpcWhitelistRequest request);

    CompletableFuture<DescribeApiGroupsResponse> describeApiGroups(DescribeApiGroupsRequest request);

    /**
      * The name of the runtime environment. Valid values:
      * *   **RELEASE**
      * *   **TEST: the test environment**
      *
     */
    CompletableFuture<DescribeApiHistoriesResponse> describeApiHistories(DescribeApiHistoriesRequest request);

    /**
      * You can call this operation to query the definition of a specified published version of an API.
      * *   This operation is intended for API providers.
      * *   Each time an API is published, API Gateway records the publishing details, such as the time and the API definition. You can use the version number obtained from other API operations to query the details of an API definition that is published on a specific occasion.
      *
     */
    CompletableFuture<DescribeApiHistoryResponse> describeApiHistory(DescribeApiHistoryRequest request);

    /**
      * The ID of the API group.
      *
     */
    CompletableFuture<DescribeApiIpControlsResponse> describeApiIpControls(DescribeApiIpControlsRequest request);

    CompletableFuture<DescribeApiLatencyDataResponse> describeApiLatencyData(DescribeApiLatencyDataRequest request);

    CompletableFuture<DescribeApiMarketAttributesResponse> describeApiMarketAttributes(DescribeApiMarketAttributesRequest request);

    CompletableFuture<DescribeApiQpsDataResponse> describeApiQpsData(DescribeApiQpsDataRequest request);

    /**
      * The runtime environment. Valid values:
      * *   **RELEASE**
      * *   **TEST**
      *
     */
    CompletableFuture<DescribeApiSignaturesResponse> describeApiSignatures(DescribeApiSignaturesRequest request);

    /**
      * The runtime environment of the API. Valid values:
      * *   **RELEASE**
      * *   **TEST**: the test environment
      *
     */
    CompletableFuture<DescribeApiTrafficControlsResponse> describeApiTrafficControls(DescribeApiTrafficControlsRequest request);

    CompletableFuture<DescribeApiTrafficDataResponse> describeApiTrafficData(DescribeApiTrafficDataRequest request);

    /**
      * *   This operation is intended for API callers.
      * *   This operation returns a list of all APIs that are being defined. The basic information about these APIs is also returned in the list.
      * *   This operation returns all APIs that are being edited, regardless of their environments. The returned definitions may be different from the definitions in the environments.
      *
     */
    CompletableFuture<DescribeApisResponse> describeApis(DescribeApisRequest request);

    CompletableFuture<DescribeApisByAppResponse> describeApisByApp(DescribeApisByAppRequest request);

    CompletableFuture<DescribeApisByBackendResponse> describeApisByBackend(DescribeApisByBackendRequest request);

    /**
      * The number of entries to return on each page. Maximum value: 100. Default value: 10.
      *
     */
    CompletableFuture<DescribeApisByIpControlResponse> describeApisByIpControl(DescribeApisByIpControlRequest request);

    /**
      * The ID of the signature key.
      *
     */
    CompletableFuture<DescribeApisBySignatureResponse> describeApisBySignature(DescribeApisBySignatureRequest request);

    /**
      * The number of entries to return on each page. Maximum value: 100. Default value: 10.
      *
     */
    CompletableFuture<DescribeApisByTrafficControlResponse> describeApisByTrafficControl(DescribeApisByTrafficControlRequest request);

    CompletableFuture<DescribeAppResponse> describeApp(DescribeAppRequest request);

    CompletableFuture<DescribeAppAttributesResponse> describeAppAttributes(DescribeAppAttributesRequest request);

    CompletableFuture<DescribeAppSecurityResponse> describeAppSecurity(DescribeAppSecurityRequest request);

    /**
      * The ID of the app.
      *
     */
    CompletableFuture<DescribeAppsResponse> describeApps(DescribeAppsRequest request);

    /**
      * The number of the page to return. Pages start from page 1. Default value: 1.
      *
     */
    CompletableFuture<DescribeAuthorizedApisResponse> describeAuthorizedApis(DescribeAuthorizedApisRequest request);

    CompletableFuture<DescribeAuthorizedAppsResponse> describeAuthorizedApps(DescribeAuthorizedAppsRequest request);

    CompletableFuture<DescribeBackendInfoResponse> describeBackendInfo(DescribeBackendInfoRequest request);

    CompletableFuture<DescribeBackendListResponse> describeBackendList(DescribeBackendListRequest request);

    CompletableFuture<DescribeDatasetInfoResponse> describeDatasetInfo(DescribeDatasetInfoRequest request);

    CompletableFuture<DescribeDatasetItemInfoResponse> describeDatasetItemInfo(DescribeDatasetItemInfoRequest request);

    CompletableFuture<DescribeDatasetItemListResponse> describeDatasetItemList(DescribeDatasetItemListRequest request);

    CompletableFuture<DescribeDatasetListResponse> describeDatasetList(DescribeDatasetListRequest request);

    CompletableFuture<DescribeDeployApiTaskResponse> describeDeployApiTask(DescribeDeployApiTaskRequest request);

    CompletableFuture<DescribeDeployedApiResponse> describeDeployedApi(DescribeDeployedApiRequest request);

    CompletableFuture<DescribeDeployedApisResponse> describeDeployedApis(DescribeDeployedApisRequest request);

    /**
      * The ID of the API group to which the domain name is bound. This ID is generated by the system and globally unique.
      *
     */
    CompletableFuture<DescribeDomainResponse> describeDomain(DescribeDomainRequest request);

    CompletableFuture<DescribeGroupQpsResponse> describeGroupQps(DescribeGroupQpsRequest request);

    CompletableFuture<DescribeHistoryApisResponse> describeHistoryApis(DescribeHistoryApisRequest request);

    CompletableFuture<DescribeImportOASTaskResponse> describeImportOASTask(DescribeImportOASTaskRequest request);

    CompletableFuture<DescribeInstanceDropConnectionsResponse> describeInstanceDropConnections(DescribeInstanceDropConnectionsRequest request);

    CompletableFuture<DescribeInstanceDropPacketResponse> describeInstanceDropPacket(DescribeInstanceDropPacketRequest request);

    CompletableFuture<DescribeInstanceHttpCodeResponse> describeInstanceHttpCode(DescribeInstanceHttpCodeRequest request);

    CompletableFuture<DescribeInstanceLatencyResponse> describeInstanceLatency(DescribeInstanceLatencyRequest request);

    CompletableFuture<DescribeInstanceNewConnectionsResponse> describeInstanceNewConnections(DescribeInstanceNewConnectionsRequest request);

    CompletableFuture<DescribeInstancePacketsResponse> describeInstancePackets(DescribeInstancePacketsRequest request);

    CompletableFuture<DescribeInstanceQpsResponse> describeInstanceQps(DescribeInstanceQpsRequest request);

    CompletableFuture<DescribeInstanceSlbConnectResponse> describeInstanceSlbConnect(DescribeInstanceSlbConnectRequest request);

    CompletableFuture<DescribeInstanceTrafficResponse> describeInstanceTraffic(DescribeInstanceTrafficRequest request);

    CompletableFuture<DescribeInstancesResponse> describeInstances(DescribeInstancesRequest request);

    CompletableFuture<DescribeIpControlPolicyItemsResponse> describeIpControlPolicyItems(DescribeIpControlPolicyItemsRequest request);

    /**
      * *   This operation is intended for API providers.
      * *   This operation is used to query the ACLs in a region. Region is a system parameter.
      * *   You can filter the query results by ACL ID, name, or type.
      * *   This operation cannot be used to query specific policies. If you want to query specific policies, call the [DescribeIpControlPolicyItems](~~65532~~) operation.
      *
     */
    CompletableFuture<DescribeIpControlsResponse> describeIpControls(DescribeIpControlsRequest request);

    CompletableFuture<DescribeLogConfigResponse> describeLogConfig(DescribeLogConfigRequest request);

    CompletableFuture<DescribeMarketRemainsQuotaResponse> describeMarketRemainsQuota(DescribeMarketRemainsQuotaRequest request);

    /**
      * The name of the model.
      *
     */
    CompletableFuture<DescribeModelsResponse> describeModels(DescribeModelsRequest request);

    CompletableFuture<DescribePluginApisResponse> describePluginApis(DescribePluginApisRequest request);

    CompletableFuture<DescribePluginSchemasResponse> describePluginSchemas(DescribePluginSchemasRequest request);

    CompletableFuture<DescribePluginTemplatesResponse> describePluginTemplates(DescribePluginTemplatesRequest request);

    CompletableFuture<DescribePluginsResponse> describePlugins(DescribePluginsRequest request);

    /**
      * *   This operation is intended for API callers.
      * *   This operation supports pagination.
      *
     */
    CompletableFuture<DescribePluginsByApiResponse> describePluginsByApi(DescribePluginsByApiRequest request);

    CompletableFuture<DescribePurchasedApiGroupResponse> describePurchasedApiGroup(DescribePurchasedApiGroupRequest request);

    CompletableFuture<DescribePurchasedApiGroupsResponse> describePurchasedApiGroups(DescribePurchasedApiGroupsRequest request);

    CompletableFuture<DescribePurchasedApisResponse> describePurchasedApis(DescribePurchasedApisRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
      * The IDs of the keys to query.
      *
     */
    CompletableFuture<DescribeSignaturesResponse> describeSignatures(DescribeSignaturesRequest request);

    /**
      * The ID of the group to which the API belongs.
      *
     */
    CompletableFuture<DescribeSignaturesByApiResponse> describeSignaturesByApi(DescribeSignaturesByApiRequest request);

    CompletableFuture<DescribeSummaryDataResponse> describeSummaryData(DescribeSummaryDataRequest request);

    /**
      * The returned information about system parameters. It is an array that consists of SystemParam data.
      *
     */
    CompletableFuture<DescribeSystemParametersResponse> describeSystemParameters(DescribeSystemParametersRequest request);

    /**
      * The specified group ID. This parameter must be specified together with ApiId and StageName.
      *
     */
    CompletableFuture<DescribeTrafficControlsResponse> describeTrafficControls(DescribeTrafficControlsRequest request);

    /**
      * The ID of the API.
      *
     */
    CompletableFuture<DescribeTrafficControlsByApiResponse> describeTrafficControlsByApi(DescribeTrafficControlsByApiRequest request);

    CompletableFuture<DescribeUpdateBackendTaskResponse> describeUpdateBackendTask(DescribeUpdateBackendTaskRequest request);

    CompletableFuture<DescribeUpdateVpcInfoTaskResponse> describeUpdateVpcInfoTask(DescribeUpdateVpcInfoTaskRequest request);

    CompletableFuture<DescribeVpcAccessesResponse> describeVpcAccesses(DescribeVpcAccessesRequest request);

    CompletableFuture<DescribeZonesResponse> describeZones(DescribeZonesRequest request);

    CompletableFuture<DetachPluginResponse> detachPlugin(DetachPluginRequest request);

    CompletableFuture<DisableInstanceAccessControlResponse> disableInstanceAccessControl(DisableInstanceAccessControlRequest request);

    CompletableFuture<DryRunSwaggerResponse> dryRunSwagger(DryRunSwaggerRequest request);

    CompletableFuture<EnableInstanceAccessControlResponse> enableInstanceAccessControl(EnableInstanceAccessControlRequest request);

    CompletableFuture<ImportOASResponse> importOAS(ImportOASRequest request);

    /**
      * 0009db9c828549768a200320714b8930
      *
     */
    CompletableFuture<ImportSwaggerResponse> importSwagger(ImportSwaggerRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
      * 58928
      *
     */
    CompletableFuture<ModifyApiResponse> modifyApi(ModifyApiRequest request);

    CompletableFuture<ModifyApiConfigurationResponse> modifyApiConfiguration(ModifyApiConfigurationRequest request);

    CompletableFuture<ModifyApiGroupResponse> modifyApiGroup(ModifyApiGroupRequest request);

    CompletableFuture<ModifyApiGroupVpcWhitelistResponse> modifyApiGroupVpcWhitelist(ModifyApiGroupVpcWhitelistRequest request);

    CompletableFuture<ModifyAppResponse> modifyApp(ModifyAppRequest request);

    CompletableFuture<ModifyBackendResponse> modifyBackend(ModifyBackendRequest request);

    CompletableFuture<ModifyBackendModelResponse> modifyBackendModel(ModifyBackendModelRequest request);

    CompletableFuture<ModifyDatasetResponse> modifyDataset(ModifyDatasetRequest request);

    CompletableFuture<ModifyDatasetItemResponse> modifyDatasetItem(ModifyDatasetItemRequest request);

    CompletableFuture<ModifyInstanceSpecResponse> modifyInstanceSpec(ModifyInstanceSpecRequest request);

    /**
      * The name of the ACL. The name must be 4 to 50 characters in length, and can contain letters, digits, and underscores (\\_). The name cannot start with an underscore (\\_).
      *
     */
    CompletableFuture<ModifyIpControlResponse> modifyIpControl(ModifyIpControlRequest request);

    /**
      * The ID of the policy.
      *
     */
    CompletableFuture<ModifyIpControlPolicyItemResponse> modifyIpControlPolicyItem(ModifyIpControlPolicyItemRequest request);

    CompletableFuture<ModifyLogConfigResponse> modifyLogConfig(ModifyLogConfigRequest request);

    CompletableFuture<ModifyModelResponse> modifyModel(ModifyModelRequest request);

    CompletableFuture<ModifyPluginResponse> modifyPlugin(ModifyPluginRequest request);

    /**
      * The new name of the key. The name must be 4 to 50 characters in length and can contain letters, digits, and underscores (\\_). It must start with a letter.
      *
     */
    CompletableFuture<ModifySignatureResponse> modifySignature(ModifySignatureRequest request);

    /**
      * The throttling policy name. The name must be 4 to 50 characters in length and can contain letters, digits, and underscores (\\_). It cannot start with an underscore.
      *
     */
    CompletableFuture<ModifyTrafficControlResponse> modifyTrafficControl(ModifyTrafficControlRequest request);

    CompletableFuture<ModifyVpcAccessAndUpdateApisResponse> modifyVpcAccessAndUpdateApis(ModifyVpcAccessAndUpdateApisRequest request);

    CompletableFuture<OpenApiGatewayServiceResponse> openApiGatewayService(OpenApiGatewayServiceRequest request);

    CompletableFuture<QueryRequestLogsResponse> queryRequestLogs(QueryRequestLogsRequest request);

    /**
      * The ID of the API group to which the domain name is bound. This ID is generated by the system and globally unique.
      *
     */
    CompletableFuture<ReactivateDomainResponse> reactivateDomain(ReactivateDomainRequest request);

    CompletableFuture<RemoveAccessControlListEntryResponse> removeAccessControlListEntry(RemoveAccessControlListEntryRequest request);

    /**
      * The ID of the app. The ID is generated by the system and globally unique.
      *
     */
    CompletableFuture<RemoveApisAuthoritiesResponse> removeApisAuthorities(RemoveApisAuthoritiesRequest request);

    /**
      * The ID of the API. This ID is generated by the system and globally unique.
      *
     */
    CompletableFuture<RemoveAppsAuthoritiesResponse> removeAppsAuthorities(RemoveAppsAuthoritiesRequest request);

    /**
      * The ID of the API group containing the API to be managed.
      *
     */
    CompletableFuture<RemoveIpControlApisResponse> removeIpControlApis(RemoveIpControlApisRequest request);

    /**
      * The ID of a policy. Separate multiple IDs with semicolons (;). A maximum of 100 IDs can be entered.
      *
     */
    CompletableFuture<RemoveIpControlPolicyItemResponse> removeIpControlPolicyItem(RemoveIpControlPolicyItemRequest request);

    /**
      * The ID of the signature key.
      *
     */
    CompletableFuture<RemoveSignatureApisResponse> removeSignatureApis(RemoveSignatureApisRequest request);

    /**
      * The ID of the API group containing the APIs from which you want to unbind a specified throttling policy.
      *
     */
    CompletableFuture<RemoveTrafficControlApisResponse> removeTrafficControlApis(RemoveTrafficControlApisRequest request);

    CompletableFuture<RemoveVpcAccessResponse> removeVpcAccess(RemoveVpcAccessRequest request);

    CompletableFuture<RemoveVpcAccessAndAbolishApisResponse> removeVpcAccessAndAbolishApis(RemoveVpcAccessAndAbolishApisRequest request);

    /**
      * The new AppCode takes effect about 2 seconds after you call this operation.
      *
     */
    CompletableFuture<ResetAppCodeResponse> resetAppCode(ResetAppCodeRequest request);

    /**
      * *   This operation is intended for API callers.
      * *   A new secret is automatically generated after you have called this operation. This secret cannot be customized.
      * *   The results returned by this operation do not contain the application secret. You can obtain the secret by calling DescribeAppSecurity.
      *
     */
    CompletableFuture<ResetAppSecretResponse> resetAppSecret(ResetAppSecretRequest request);

    CompletableFuture<SdkGenerateByAppResponse> sdkGenerateByApp(SdkGenerateByAppRequest request);

    CompletableFuture<SdkGenerateByAppForRegionResponse> sdkGenerateByAppForRegion(SdkGenerateByAppForRegionRequest request);

    CompletableFuture<SdkGenerateByGroupResponse> sdkGenerateByGroup(SdkGenerateByGroupRequest request);

    CompletableFuture<SetAccessControlListAttributeResponse> setAccessControlListAttribute(SetAccessControlListAttributeRequest request);

    /**
      * The ID of the app. This ID is generated by the system and globally unique.
      *
     */
    CompletableFuture<SetApisAuthoritiesResponse> setApisAuthorities(SetApisAuthoritiesRequest request);

    /**
      * The ID of the API. This ID is generated by the system and globally unique.
      *
     */
    CompletableFuture<SetAppsAuthoritiesResponse> setAppsAuthorities(SetAppsAuthoritiesRequest request);

    CompletableFuture<SetDomainResponse> setDomain(SetDomainRequest request);

    /**
      * 382271
      *
     */
    CompletableFuture<SetDomainCertificateResponse> setDomainCertificate(SetDomainCertificateRequest request);

    CompletableFuture<SetDomainWebSocketStatusResponse> setDomainWebSocketStatus(SetDomainWebSocketStatusRequest request);

    CompletableFuture<SetGroupAuthAppCodeResponse> setGroupAuthAppCode(SetGroupAuthAppCodeRequest request);

    /**
      * The ID of the API group.
      *
     */
    CompletableFuture<SetIpControlApisResponse> setIpControlApis(SetIpControlApisRequest request);

    /**
      * The ID of the signature key.
      *
     */
    CompletableFuture<SetSignatureApisResponse> setSignatureApis(SetSignatureApisRequest request);

    /**
      * The ID of the API group containing the APIs to which you want to bind a specified throttling policy.
      *
     */
    CompletableFuture<SetTrafficControlApisResponse> setTrafficControlApis(SetTrafficControlApisRequest request);

    CompletableFuture<SetVpcAccessResponse> setVpcAccess(SetVpcAccessRequest request);

    CompletableFuture<SetWildcardDomainPatternsResponse> setWildcardDomainPatterns(SetWildcardDomainPatternsRequest request);

    /**
      * The ID of the API.
      *
     */
    CompletableFuture<SwitchApiResponse> switchApi(SwitchApiRequest request);

    /**
      * The key of tag N.
      * Valid values of N: `1 to 20.`
      *
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
      * Specifies whether to delete all tags. This parameter is valid only when the **TagKey.N**parameter is not specified. Default value: false. Valid values:
      * *   **true**
      * *   **false**
      *
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    CompletableFuture<ValidateVpcConnectivityResponse> validateVpcConnectivity(ValidateVpcConnectivityRequest request);

}
