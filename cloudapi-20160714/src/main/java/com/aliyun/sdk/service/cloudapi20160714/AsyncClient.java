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

    /**
      * *   This operation is intended for API providers and is the opposite of DeployApi.
      * *   An API can be unpublished from a specified runtime environment in under 5 seconds.
      * *   An unpublished API cannot be called in the specified runtime environment.
      *
     */
    CompletableFuture<AbolishApiResponse> abolishApi(AbolishApiRequest request);

    CompletableFuture<AddAccessControlListEntryResponse> addAccessControlListEntry(AddAccessControlListEntryRequest request);

    /**
      * When you call this operation, note that:
      * *   This operation is intended for API providers.
      * *   An added policy immediately takes effect on all APIs that are bound to the access control list (ACL).
      * *   A maximum of 100 policies can be added to an ACL.
      *
     */
    CompletableFuture<AddIpControlPolicyItemResponse> addIpControlPolicyItem(AddIpControlPolicyItemRequest request);

    /**
      * *   This API is intended for API providers.
      * *   If the input SpecialKey already exists, the previous configuration is overwritten. Use caution when calling this operation.
      * *   Special throttling policies must be added to an existing throttling policy, and can take effect on all the APIs to which the throttling policy is bound.
      *
     */
    CompletableFuture<AddTrafficSpecialControlResponse> addTrafficSpecialControl(AddTrafficSpecialControlRequest request);

    CompletableFuture<AttachApiProductResponse> attachApiProduct(AttachApiProductRequest request);

    /**
      * *   This operation is intended for API providers.
      * *   You can only bind plug-ins to published APIs.
      * *   The plug-in takes effect immediately after it is bound to an API.
      * *   If you bind a different plug-in to an API, this plug-in takes effect immediately.
      *
     */
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

    /**
      * *   This operation is intended for API providers.
      *
     */
    CompletableFuture<CreateApiStageVariableResponse> createApiStageVariable(CreateApiStageVariableRequest request);

    /**
      * *   This operation is intended for API callers.
      * *   Each application has a key-value pair which is used for identity verification when you call an API.
      * *   An application must be authorized to call an API.
      * *   Each application has only one key-value pair, which can be reset if the pair is leaked.
      * *   A maximum of 1,000 applications can be created for each Alibaba Cloud account.
      * *   You can call this operation up to 50 times per second per account.
      *
     */
    CompletableFuture<CreateAppResponse> createApp(CreateAppRequest request);

    CompletableFuture<CreateBackendResponse> createBackend(CreateBackendRequest request);

    CompletableFuture<CreateBackendModelResponse> createBackendModel(CreateBackendModelRequest request);

    CompletableFuture<CreateDatasetResponse> createDataset(CreateDatasetRequest request);

    CompletableFuture<CreateDatasetItemResponse> createDatasetItem(CreateDatasetItemRequest request);

    CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request);

    CompletableFuture<CreateIntranetDomainResponse> createIntranetDomain(CreateIntranetDomainRequest request);

    /**
      * *   This operation is intended for API providers.
      * *   An ACL must be bound to an API to take effect. After an ACL is bound to an API, the ACL takes effect on the API immediately.
      * *   You can add policies to an ACL when you create the ACL.
      * *   If an ACL does not have any policy, the ACL is ineffective.
      *
     */
    CompletableFuture<CreateIpControlResponse> createIpControl(CreateIpControlRequest request);

    CompletableFuture<CreateLogConfigResponse> createLogConfig(CreateLogConfigRequest request);

    /**
      * *   For more information about the model definition, see [JSON Schema Draft 4](https://tools.ietf.org/html/draft-zyp-json-schema-04?spm=a2c4g.11186623.2.10.2e977ff7p4BpQd).
      * *   JSON Schema supports only element attributes of the Object type.
      *
     */
    CompletableFuture<CreateModelResponse> createModel(CreateModelRequest request);

    CompletableFuture<CreateMonitorGroupResponse> createMonitorGroup(CreateMonitorGroupRequest request);

    /**
      * *   This operation is intended for API providers.
      * *   The number of plug-ins of the same type that each user can create is limited. Different limits apply to different plug-in types.
      * *   The plug-in definitions for advanced features are restricted.
      * *   Plug-ins must be bound to APIs to take effect. After a plug-in is bound, it takes effect on that API immediately.
      *
     */
    CompletableFuture<CreatePluginResponse> createPlugin(CreatePluginRequest request);

    /**
      * *   This API is intended for API providers.
      * *   The API operation only creates a key policy. You must call the binding operation to bind the key to an API.
      * *   After the key is bound to the API, requests sent from API Gateway to the backend service contain signature strings. You can specify whether your backend service verifies these signature strings.
      * *   The QPS limit on this operation is 50 per user.
      *
     */
    CompletableFuture<CreateSignatureResponse> createSignature(CreateSignatureRequest request);

    /**
      * *   This API is intended for API providers.
      * *   Throttling policies must be bound to APIs to take effect. After a policy is bound to an API, it goes into effect on that API immediately.
      * *   The QPS limit on this operation is 50 per user.
      *
     */
    CompletableFuture<CreateTrafficControlResponse> createTrafficControl(CreateTrafficControlRequest request);

    CompletableFuture<DeleteAccessControlListResponse> deleteAccessControlList(DeleteAccessControlListRequest request);

    /**
      * *   This API is intended for API providers.
      *
     */
    CompletableFuture<DeleteAllTrafficSpecialControlResponse> deleteAllTrafficSpecialControl(DeleteAllTrafficSpecialControlRequest request);

    /**
      * *   This operation is intended for API providers and cannot be undone after it is complete.
      * *   An API that is running in the runtime environment must be unpublished before you can delete the API.****
      * *   The QPS limit on this operation is 50 per user.
      *
     */
    CompletableFuture<DeleteApiResponse> deleteApi(DeleteApiRequest request);

    /**
      * *   This operation is intended for API providers.
      * *   An API group that contains APIs cannot be deleted. To delete the API group, you must first delete its APIs.
      * *   After an API group is deleted, the second-level domain name bound to the API group is automatically invalidated.
      * *   If the specified API group does not exist, a success response is returned.
      * *   The QPS limit on this operation is 50 per user.
      *
     */
    CompletableFuture<DeleteApiGroupResponse> deleteApiGroup(DeleteApiGroupRequest request);

    CompletableFuture<DeleteApiProductResponse> deleteApiProduct(DeleteApiProductRequest request);

    /**
      * *   This operation is intended for API providers.
      *
     */
    CompletableFuture<DeleteApiStageVariableResponse> deleteApiStageVariable(DeleteApiStageVariableRequest request);

    /**
      * *   This operation is intended for API callers.
      * *   After an application is deleted, the application and its API authorization cannot be restored.
      * *   You can call this operation up to 50 times per second per account.
      *
     */
    CompletableFuture<DeleteAppResponse> deleteApp(DeleteAppRequest request);

    CompletableFuture<DeleteBackendResponse> deleteBackend(DeleteBackendRequest request);

    CompletableFuture<DeleteBackendModelResponse> deleteBackendModel(DeleteBackendModelRequest request);

    CompletableFuture<DeleteDatasetResponse> deleteDataset(DeleteDatasetRequest request);

    CompletableFuture<DeleteDatasetItemResponse> deleteDatasetItem(DeleteDatasetItemRequest request);

    /**
      * *   This operation is intended for API providers.
      * *   If the specified domain name does not exist, a successful response will still appear.
      * *   Unbinding a domain name from an API group will affect access to the APIs in the group. Exercise caution when using this operation.
      *
     */
    CompletableFuture<DeleteDomainResponse> deleteDomain(DeleteDomainRequest request);

    CompletableFuture<DeleteDomainCertificateResponse> deleteDomainCertificate(DeleteDomainCertificateRequest request);

    CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request);

    /**
      * *   This operation is intended for API providers.
      * *   If the ACL is bound to an API, you must unbind the ACL from the API before you can delete the ACL. Otherwise, an error is returned.
      * *   If you call this operation on an ACL that does not exist, a success message is returned.
      *
     */
    CompletableFuture<DeleteIpControlResponse> deleteIpControl(DeleteIpControlRequest request);

    CompletableFuture<DeleteLogConfigResponse> deleteLogConfig(DeleteLogConfigRequest request);

    CompletableFuture<DeleteModelResponse> deleteModel(DeleteModelRequest request);

    CompletableFuture<DeleteMonitorGroupResponse> deleteMonitorGroup(DeleteMonitorGroupRequest request);

    /**
      * *   This operation is intended for API providers.
      * *   You must first unbind the plug-in from the API. Otherwise, an error is reported when you delete the plug-in.
      *
     */
    CompletableFuture<DeletePluginResponse> deletePlugin(DeletePluginRequest request);

    /**
      * *   This API is intended for API providers.
      * *   This API operation deletes an existing backend signature key.
      * *   You cannot delete a key that is bound to an API. To delete the key, you must unbind it first.
      * *   The QPS limit on this operation is 50 per user.
      *
     */
    CompletableFuture<DeleteSignatureResponse> deleteSignature(DeleteSignatureRequest request);

    /**
      * *   This API is intended for API providers.
      * *   If the throttling policy you want to delete is bound to APIs, you need to unbind the policy first. Otherwise, an error is reported when you delete the policy.
      * *   The QPS limit on this operation is 50 per user.
      *
     */
    CompletableFuture<DeleteTrafficControlResponse> deleteTrafficControl(DeleteTrafficControlRequest request);

    /**
      * *   This API is intended for API providers.
      * *   You can obtain the input parameters required in this operation by calling other APIs.
      *
     */
    CompletableFuture<DeleteTrafficSpecialControlResponse> deleteTrafficSpecialControl(DeleteTrafficSpecialControlRequest request);

    /**
      * *   This operation is intended for API providers. Only the API that you have defined and published to a runtime environment can be called.
      * *   An API is published to a cluster in under 5 seconds.
      * *   The QPS limit on this operation is 50 per user.
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

    /**
      * *   For API callers, the specified API must be a public or authorized private API that has been published to a runtime environment.****************
      * *   When you call this operation as an API caller, the service information, parameter definitions, and other details of the API you specify are returned.
      * *   When you call this operation as an API provider, the definition of the specified API running in the specified runtime environment is returned. The returned definition takes effect in the runtime environment, and may be different from the definition of the API you modify.
      * *   Before you call this operation as an API provider, ensure that the API to be queried is a public one or that your application has been authorized to call the API, because authentication on API callers is required.
      *
     */
    CompletableFuture<DescribeApiDocResponse> describeApiDoc(DescribeApiDocRequest request);

    /**
      * *   This operation is intended for API providers.
      *
     */
    CompletableFuture<DescribeApiGroupResponse> describeApiGroup(DescribeApiGroupRequest request);

    CompletableFuture<DescribeApiGroupVpcWhitelistResponse> describeApiGroupVpcWhitelist(DescribeApiGroupVpcWhitelistRequest request);

    /**
      * *   This operation is intended for API providers.
      *
     */
    CompletableFuture<DescribeApiGroupsResponse> describeApiGroups(DescribeApiGroupsRequest request);

    /**
      * *   This operation is intended for API providers. Only APIs that have been published have historical version records.
      * *   This operation allows you to obtain the historical versions of an API. This operation is always called by other operations.
      *
     */
    CompletableFuture<DescribeApiHistoriesResponse> describeApiHistories(DescribeApiHistoriesRequest request);

    /**
      * Queries the details of a specified historical version of a specified API definition.
      * *   This API is intended for API providers.
      * *   API Gateway records the time and definition of an API every time the API is published. You can use the version number obtained from other operations to query definition details at a certain publication.
      *
     */
    CompletableFuture<DescribeApiHistoryResponse> describeApiHistory(DescribeApiHistoryRequest request);

    /**
      * *   This operation is intended for API callers.
      * *   If an optional parameter is not specified, all results are returned on separate pages.
      * ·
      *
     */
    CompletableFuture<DescribeApiIpControlsResponse> describeApiIpControls(DescribeApiIpControlsRequest request);

    /**
      * You can call this operation to query the latency metrics in milliseconds for a specified API.
      * *   This API is intended for API providers.
      * *   Only statistics for API calls made in the release environment are collected by default.
      *
     */
    CompletableFuture<DescribeApiLatencyDataResponse> describeApiLatencyData(DescribeApiLatencyDataRequest request);

    CompletableFuture<DescribeApiMarketAttributesResponse> describeApiMarketAttributes(DescribeApiMarketAttributesRequest request);

    CompletableFuture<DescribeApiProductApisResponse> describeApiProductApis(DescribeApiProductApisRequest request);

    CompletableFuture<DescribeApiProductsByAppResponse> describeApiProductsByApp(DescribeApiProductsByAppRequest request);

    /**
      * *   This API is intended for API providers.
      * *   Only statistics for API calls made in the release environment are collected by default.
      *
     */
    CompletableFuture<DescribeApiQpsDataResponse> describeApiQpsData(DescribeApiQpsDataRequest request);

    /**
      * *   This API is intended for API providers.
      * *   The ApiIds parameter is optional. If this parameter is not specified, all results in the specified environment of an API group are returned.
      *
     */
    CompletableFuture<DescribeApiSignaturesResponse> describeApiSignatures(DescribeApiSignaturesRequest request);

    /**
      * *   This API is intended for API providers.
      * *   The ApiIds parameter is optional. If this parameter is not specified, all results in the specified environment of an API group are returned.
      *
     */
    CompletableFuture<DescribeApiTrafficControlsResponse> describeApiTrafficControls(DescribeApiTrafficControlsRequest request);

    /**
      * *   This API is intended for API providers.
      * *   Only statistics for API calls made in the release environment are collected by default.
      *
     */
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
      * *   This operation is intended for API callers.
      * *   You can specify PageNumber to obtain the result on the specified page.
      *
     */
    CompletableFuture<DescribeApisByIpControlResponse> describeApisByIpControl(DescribeApisByIpControlRequest request);

    /**
      * *   This API is intended for API providers.
      * *   The results are returned on separate pages. You can specify PageNumber to obtain the result on the specified page.
      *
     */
    CompletableFuture<DescribeApisBySignatureResponse> describeApisBySignature(DescribeApisBySignatureRequest request);

    /**
      * *   This API is intended for API providers.
      * *   You can specify PageNumber to obtain the result on the specified page.
      *
     */
    CompletableFuture<DescribeApisByTrafficControlResponse> describeApisByTrafficControl(DescribeApisByTrafficControlRequest request);

    CompletableFuture<DescribeApisWithStageNameIntegratedByAppResponse> describeApisWithStageNameIntegratedByApp(DescribeApisWithStageNameIntegratedByAppRequest request);

    CompletableFuture<DescribeAppResponse> describeApp(DescribeAppRequest request);

    /**
      * *   This operation is intended for API callers.
      * *   AppId is optional.
      *
     */
    CompletableFuture<DescribeAppAttributesResponse> describeAppAttributes(DescribeAppAttributesRequest request);

    CompletableFuture<DescribeAppSecurityResponse> describeAppSecurity(DescribeAppSecurityRequest request);

    /**
      * *   This API is intended for API providers.
      * *   API providers can use the app IDs or their Apsara Stack tenant accounts to query app information.
      * *   Each provider can call this operation for a maximum of 200 times every day in a region.
      *
     */
    CompletableFuture<DescribeAppsResponse> describeApps(DescribeAppsRequest request);

    CompletableFuture<DescribeAppsByApiProductResponse> describeAppsByApiProduct(DescribeAppsByApiProductRequest request);

    /**
      * *   This operation is intended for API callers.
      * *   The specified application can call all APIs included in the responses.
      *
     */
    CompletableFuture<DescribeAuthorizedApisResponse> describeAuthorizedApis(DescribeAuthorizedApisRequest request);

    /**
      * *   This operation is intended for API providers.
      * *   All applications included in the responses have access to the specified API.
      *
     */
    CompletableFuture<DescribeAuthorizedAppsResponse> describeAuthorizedApps(DescribeAuthorizedAppsRequest request);

    CompletableFuture<DescribeBackendInfoResponse> describeBackendInfo(DescribeBackendInfoRequest request);

    CompletableFuture<DescribeBackendListResponse> describeBackendList(DescribeBackendListRequest request);

    CompletableFuture<DescribeDatasetInfoResponse> describeDatasetInfo(DescribeDatasetInfoRequest request);

    CompletableFuture<DescribeDatasetItemInfoResponse> describeDatasetItemInfo(DescribeDatasetItemInfoRequest request);

    CompletableFuture<DescribeDatasetItemListResponse> describeDatasetItemList(DescribeDatasetItemListRequest request);

    CompletableFuture<DescribeDatasetListResponse> describeDatasetList(DescribeDatasetListRequest request);

    CompletableFuture<DescribeDeployApiTaskResponse> describeDeployApiTask(DescribeDeployApiTaskRequest request);

    CompletableFuture<DescribeDeployedApiResponse> describeDeployedApi(DescribeDeployedApiRequest request);

    /**
      * *   This API is intended for API providers.
      *
     */
    CompletableFuture<DescribeDeployedApisResponse> describeDeployedApis(DescribeDeployedApisRequest request);

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

    /**
      * *   This operation is intended for API providers.
      * *   You can filter the query results by policy ID.
      *
     */
    CompletableFuture<DescribeIpControlPolicyItemsResponse> describeIpControlPolicyItems(DescribeIpControlPolicyItemsRequest request);

    /**
      * *   This operation is intended for API providers.
      * *   This operation is used to query the ACLs in a Region. Region is a system parameter.
      * *   You can filter the query results by ACL ID, name, or type.
      * *   This operation cannot be used to query specific policies. If you want to query specific policies, use the DescribeIpControlPolicyItems operation.
      *
     */
    CompletableFuture<DescribeIpControlsResponse> describeIpControls(DescribeIpControlsRequest request);

    CompletableFuture<DescribeLogConfigResponse> describeLogConfig(DescribeLogConfigRequest request);

    CompletableFuture<DescribeMarketRemainsQuotaResponse> describeMarketRemainsQuota(DescribeMarketRemainsQuotaRequest request);

    /**
      * *   Fuzzy queries are supported.
      *
     */
    CompletableFuture<DescribeModelsResponse> describeModels(DescribeModelsRequest request);

    CompletableFuture<DescribePluginApisResponse> describePluginApis(DescribePluginApisRequest request);

    CompletableFuture<DescribePluginSchemasResponse> describePluginSchemas(DescribePluginSchemasRequest request);

    CompletableFuture<DescribePluginTemplatesResponse> describePluginTemplates(DescribePluginTemplatesRequest request);

    /**
      * *   This operation supports pagination.
      * *   This operation allows you to query plug-ins by business type.
      * *   This operation allows you to query plug-ins by ID.
      * *   This operation allows you to query plug-ins by name.
      *
     */
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

    /**
      * This operation queries regions in which API Gateway is available.
      * *   This operation is intended for API providers and callers.
      *
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
      * *   This API is intended for API providers.
      * *   This operation is used to query the backend signature keys in a Region. Region is a system parameter.
      *
     */
    CompletableFuture<DescribeSignaturesResponse> describeSignatures(DescribeSignaturesRequest request);

    /**
      * *   This API is intended for API providers.
      *
     */
    CompletableFuture<DescribeSignaturesByApiResponse> describeSignaturesByApi(DescribeSignaturesByApiRequest request);

    CompletableFuture<DescribeSummaryDataResponse> describeSummaryData(DescribeSummaryDataRequest request);

    /**
      * *   This API is intended for API callers.
      * *   The response of this API contains the system parameters that are optional in API definitions.
      *
     */
    CompletableFuture<DescribeSystemParametersResponse> describeSystemParameters(DescribeSystemParametersRequest request);

    /**
      * *   This API is intended for API providers.
      * *   This API can be used to query all existing throttling policies (including special throttling policies) and their details.
      * *   You can specify query conditions. For example, you can query the throttling policies bound to a specified API or in a specified environment.
      *
     */
    CompletableFuture<DescribeTrafficControlsResponse> describeTrafficControls(DescribeTrafficControlsRequest request);

    /**
      * *   This API is intended for API providers.
      *
     */
    CompletableFuture<DescribeTrafficControlsByApiResponse> describeTrafficControlsByApi(DescribeTrafficControlsByApiRequest request);

    CompletableFuture<DescribeUpdateBackendTaskResponse> describeUpdateBackendTask(DescribeUpdateBackendTaskRequest request);

    CompletableFuture<DescribeUpdateVpcInfoTaskResponse> describeUpdateVpcInfoTask(DescribeUpdateVpcInfoTaskRequest request);

    CompletableFuture<DescribeVpcAccessesResponse> describeVpcAccesses(DescribeVpcAccessesRequest request);

    CompletableFuture<DescribeZonesResponse> describeZones(DescribeZonesRequest request);

    CompletableFuture<DetachApiProductResponse> detachApiProduct(DetachApiProductRequest request);

    CompletableFuture<DetachPluginResponse> detachPlugin(DetachPluginRequest request);

    CompletableFuture<DisableInstanceAccessControlResponse> disableInstanceAccessControl(DisableInstanceAccessControlRequest request);

    CompletableFuture<DryRunSwaggerResponse> dryRunSwagger(DryRunSwaggerRequest request);

    CompletableFuture<EnableInstanceAccessControlResponse> enableInstanceAccessControl(EnableInstanceAccessControlRequest request);

    CompletableFuture<ImportOASResponse> importOAS(ImportOASRequest request);

    /**
      * *   Alibaba Cloud supports extensions based on Swagger 2.0.
      * *   Alibaba Cloud supports Swagger configuration files in JSON and YAML formats.
      *
     */
    CompletableFuture<ImportSwaggerResponse> importSwagger(ImportSwaggerRequest request);

    /**
      * *   The Tag.N.Key and Tag.N.Value parameters constitute a key-value pair.
      * *   ResourceId.N must meet all the key-value pairs that are entered. If you enter multiple key-value pairs, resources that contain the specified key-value pairs are returned.
      * *   This operation is used to query resource tags based on conditions. If no relationship matches the conditions, an empty list is returned.
      * *   You can query both user tags and visible system tags.
      * *   In addition to the required parameters, you can also specify ResourceId.N to query the visible resource tags of a specified resource in a region.
      * *   You can also specify Tag.N.Key to query the visible keys of a specified key in a region.
      * *   At least one of ResourceId.N, Tag.N.Key, and Tag.N.Value exists.
      * *   You can query tags of the same type or different types in a single operation.
      * *   You can query all your user tags and visible system tags.
      *
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
      * **This operation is intended for API providers.**
      * *   This API operation requires a full update. Updates of partial parameters are not supported.
      * *   When you modify an API name, make sure that the name of each API within the same group is unique.
      * *   When you modify the request path, make sure that each request path within the same group is unique.
      * *   The QPS limit on this operation is 50 per user.
      *
     */
    CompletableFuture<ModifyApiResponse> modifyApi(ModifyApiRequest request);

    CompletableFuture<ModifyApiConfigurationResponse> modifyApiConfiguration(ModifyApiConfigurationRequest request);

    /**
      * *   This operation is intended for API providers.
      * *   The QPS limit on this operation is 50 per user.
      *
     */
    CompletableFuture<ModifyApiGroupResponse> modifyApiGroup(ModifyApiGroupRequest request);

    CompletableFuture<ModifyApiGroupVpcWhitelistResponse> modifyApiGroupVpcWhitelist(ModifyApiGroupVpcWhitelistRequest request);

    /**
      * *   This operation is intended for API callers.
      * *   **AppName** or **Description** can be modified. If these parameters are not specified, no modifications are made and the operation will directly return a success response.
      * *   You can call this operation up to 50 times per second per account.
      *
     */
    CompletableFuture<ModifyAppResponse> modifyApp(ModifyAppRequest request);

    CompletableFuture<ModifyBackendResponse> modifyBackend(ModifyBackendRequest request);

    CompletableFuture<ModifyBackendModelResponse> modifyBackendModel(ModifyBackendModelRequest request);

    CompletableFuture<ModifyDatasetResponse> modifyDataset(ModifyDatasetRequest request);

    CompletableFuture<ModifyDatasetItemResponse> modifyDatasetItem(ModifyDatasetItemRequest request);

    CompletableFuture<ModifyInstanceSpecResponse> modifyInstanceSpec(ModifyInstanceSpecRequest request);

    CompletableFuture<ModifyIntranetDomainPolicyResponse> modifyIntranetDomainPolicy(ModifyIntranetDomainPolicyRequest request);

    /**
      * *   This operation is intended for API providers.
      * *   This operation allows you to modify only the name and description of an ACL. You cannot modify the type of the ACL.
      *
     */
    CompletableFuture<ModifyIpControlResponse> modifyIpControl(ModifyIpControlRequest request);

    /**
      * *   This operation is intended for API providers.
      * *   The modification immediately takes effect on all the APIs that are bound to the policy.
      * *   This operation causes a full modification of the content of a policy.
      *
     */
    CompletableFuture<ModifyIpControlPolicyItemResponse> modifyIpControlPolicyItem(ModifyIpControlPolicyItemRequest request);

    CompletableFuture<ModifyLogConfigResponse> modifyLogConfig(ModifyLogConfigRequest request);

    CompletableFuture<ModifyModelResponse> modifyModel(ModifyModelRequest request);

    /**
      * *   This operation is intended for API providers.
      * *   The name of the plug-in must be unique.
      *
     */
    CompletableFuture<ModifyPluginResponse> modifyPlugin(ModifyPluginRequest request);

    /**
      * *   This API is intended for API providers.
      * *   This API operation modifies the name, Key value, and Secret value of an existing signature key.
      * *   Note that the modification takes effect immediately. If the key has been bound to an API, you must adjust the backend signature verification based on the new key accordingly.
      * *   The QPS limit on this operation is 50 per user.
      *
     */
    CompletableFuture<ModifySignatureResponse> modifySignature(ModifySignatureRequest request);

    /**
      * *   This API is intended for API providers.
      * *   The modifications take effect on the bound APIs instantly.
      * *   The QPS limit on this operation is 50 per user.
      *
     */
    CompletableFuture<ModifyTrafficControlResponse> modifyTrafficControl(ModifyTrafficControlRequest request);

    CompletableFuture<ModifyVpcAccessAndUpdateApisResponse> modifyVpcAccessAndUpdateApis(ModifyVpcAccessAndUpdateApisRequest request);

    CompletableFuture<OpenApiGatewayServiceResponse> openApiGatewayService(OpenApiGatewayServiceRequest request);

    CompletableFuture<QueryRequestLogsResponse> queryRequestLogs(QueryRequestLogsRequest request);

    /**
      * *   This operation is intended for API providers.
      * *   You must solve the problem that is mentioned in the domain name exception prompt before you can reactivate the domain name.
      * *   A typical reason why a custom domain name becomes abnormal is that the domain name does not have an ICP filing or the domain name is included in a blacklist by the administration. When a custom domain name is abnormal, users cannot use it to access APIs.
      * *   You can call this operation to reactivate the domain name to resume normal access.
      *
     */
    CompletableFuture<ReactivateDomainResponse> reactivateDomain(ReactivateDomainRequest request);

    CompletableFuture<RemoveAccessControlListEntryResponse> removeAccessControlListEntry(RemoveAccessControlListEntryRequest request);

    CompletableFuture<RemoveApiProductsAuthoritiesResponse> removeApiProductsAuthorities(RemoveApiProductsAuthoritiesRequest request);

    /**
      * *   This operation is intended for API providers and callers.
      * *   Before you revoke access permissions, check by whom the permissions were granted. API providers can only revoke permissions granted by a Provider, and API callers can only revoke permissions granted by a Consumer.
      *
     */
    CompletableFuture<RemoveApisAuthoritiesResponse> removeApisAuthorities(RemoveApisAuthoritiesRequest request);

    /**
      * *   This operation is intended for API providers and callers.
      * *   Before you revoke access permissions, check by whom the permissions were granted. API providers can only revoke permissions granted by a Provider, and API callers can only revoke permissions granted by a Consumer.
      *
     */
    CompletableFuture<RemoveAppsAuthoritiesResponse> removeAppsAuthorities(RemoveAppsAuthoritiesRequest request);

    /**
      * *   This operation is intended for API callers.
      * *   The unbinding takes effect immediately. After the API is unbound from the ACL, the corresponding environment does not have any IP address access control in place for the API.
      *
     */
    CompletableFuture<RemoveIpControlApisResponse> removeIpControlApis(RemoveIpControlApisRequest request);

    /**
      * *   This operation is intended for API providers.
      *
     */
    CompletableFuture<RemoveIpControlPolicyItemResponse> removeIpControlPolicyItem(RemoveIpControlPolicyItemRequest request);

    /**
      * *   This API is intended for API providers.
      * *   The operation takes effect immediately. The request sent from API Gateway to the backend service does not contain the signature string. The corresponding verification step can be removed from the backend.
      *
     */
    CompletableFuture<RemoveSignatureApisResponse> removeSignatureApis(RemoveSignatureApisRequest request);

    /**
      * *   This API is intended for API providers.
      * *   This API allows you to unbind a specified throttling policy from up to 100 APIs at a time.
      *
     */
    CompletableFuture<RemoveTrafficControlApisResponse> removeTrafficControlApis(RemoveTrafficControlApisRequest request);

    /**
      * *   This API is intended for API providers.
      * *   Revokes the permissions of API Gateway to access your VPC instance.
      * >  Deleting an authorization affects the associated API. Before you delete the authorization, make sure that it is not used by the API.
      *
     */
    CompletableFuture<RemoveVpcAccessResponse> removeVpcAccess(RemoveVpcAccessRequest request);

    CompletableFuture<RemoveVpcAccessAndAbolishApisResponse> removeVpcAccessAndAbolishApis(RemoveVpcAccessAndAbolishApisRequest request);

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

    CompletableFuture<SetApiProductsAuthoritiesResponse> setApiProductsAuthorities(SetApiProductsAuthoritiesRequest request);

    /**
      * *   This operation is intended for API providers and callers.
      * *   API providers can authorize any apps to call their APIs.
      * *   API callers can authorize their own apps to call the APIs that they have purchased.
      *
     */
    CompletableFuture<SetApisAuthoritiesResponse> setApisAuthorities(SetApisAuthoritiesRequest request);

    /**
      * *   This operation is intended for API providers and callers.
      * *   API providers can authorize any apps to call their APIs.
      * *   API callers can authorize their own apps to call the APIs that they have purchased.
      *
     */
    CompletableFuture<SetAppsAuthoritiesResponse> setAppsAuthorities(SetAppsAuthoritiesRequest request);

    CompletableFuture<SetDomainResponse> setDomain(SetDomainRequest request);

    /**
      * *   This operation is intended for API providers.
      * *   The SSL certificate must match the custom domain name.
      * *   After the SSL certificate is bound, HTTPS-based API services become available.
      *
     */
    CompletableFuture<SetDomainCertificateResponse> setDomainCertificate(SetDomainCertificateRequest request);

    CompletableFuture<SetDomainWebSocketStatusResponse> setDomainWebSocketStatus(SetDomainWebSocketStatusRequest request);

    CompletableFuture<SetGroupAuthAppCodeResponse> setGroupAuthAppCode(SetGroupAuthAppCodeRequest request);

    /**
      * *   This operation is intended for API callers.
      * *   A maximum of 100 APIs can be bound at a time.
      *
     */
    CompletableFuture<SetIpControlApisResponse> setIpControlApis(SetIpControlApisRequest request);

    /**
      * *   This API is intended for API providers.
      * *   This operation allows you to bind a signature key to an API. You can bind signature keys for up to 100 APIs at a time.
      *
     */
    CompletableFuture<SetSignatureApisResponse> setSignatureApis(SetSignatureApisRequest request);

    /**
      * *   This API is intended for API providers.
      * *   This API allows you to bind a specific throttling policy to up to 100 APIs at a time.
      *
     */
    CompletableFuture<SetTrafficControlApisResponse> setTrafficControlApis(SetTrafficControlApisRequest request);

    CompletableFuture<SetVpcAccessResponse> setVpcAccess(SetVpcAccessRequest request);

    CompletableFuture<SetWildcardDomainPatternsResponse> setWildcardDomainPatterns(SetWildcardDomainPatternsRequest request);

    /**
      * *   This API is intended for API providers.
      * *   The historical version can be obtained by calling the **DescribeHistoryApis** operation.
      * *   Only APIs that have been published more than once have historical versions.
      * *   This operation can only be performed on running APIs. Exercise caution when you perform this operation because the operation cannot be undone. The operation takes up to 5 seconds.
      * *   The switch operation is essentially a publish operation. A reason for this operation must be provided.
      *
     */
    CompletableFuture<SwitchApiResponse> switchApi(SwitchApiRequest request);

    /**
      * *   All tags (key-value pairs) are applied to all resources of a specified ResourceId, with each resource specified as ResourceId.N.
      * *   Tag.N is a resource tag consisting of a key-value pair: Tag.N.Key and Tag.N.Value.
      * *   If you call this operation to tag multiple resources simultaneously, either all or none of the resources will be tagged.
      * *   If you specify Tag.1.Value in addition to required parameters, you must also specify Tag.1.Key. Otherwise, an InvalidParameter.TagKey error is reported. A tag that has a value must have the corresponding key, but the key can be an empty string.
      * *   If a tag with the same key has been bound to a resource, the new tag will overwrite the existing one.
      *
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
      * *   If you call this operation to untag multiple resources simultaneously, either all or none of the resources will be untagged.
      * *   If you specify resource IDs without specifying tag keys and set the All parameter to true, all tags bound to the specified resources will be deleted. If a resource does not have any tags, the request is not processed but a success is returned.
      * *   If you specify resource IDs without specifying tag keys and set the All parameter to false, the request is not processed but a success is returned.
      * *   When tag keys are specified, the All parameter is invalid.
      * *   When multiple resources and key-value pairs are specified, the specified tags bound to the resources are deleted.
      *
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    CompletableFuture<ValidateVpcConnectivityResponse> validateVpcConnectivity(ValidateVpcConnectivityRequest request);

}
