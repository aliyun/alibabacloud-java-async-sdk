// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.cloudapi20160714.models.*;
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
     * <b>description</b> :
     * <p>  This operation is intended for API providers and is the opposite of DeployApi.</p>
     * <ul>
     * <li>An API can be unpublished from a specified runtime environment in under 5 seconds.</li>
     * <li>An unpublished API cannot be called in the specified runtime environment.</li>
     * </ul>
     * 
     * @param request the request parameters of AbolishApi  AbolishApiRequest
     * @return AbolishApiResponse
     */
    CompletableFuture<AbolishApiResponse> abolishApi(AbolishApiRequest request);

    /**
     * @param request the request parameters of AddAccessControlListEntry  AddAccessControlListEntryRequest
     * @return AddAccessControlListEntryResponse
     */
    CompletableFuture<AddAccessControlListEntryResponse> addAccessControlListEntry(AddAccessControlListEntryRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation, note that:</p>
     * <ul>
     * <li>This operation is intended for API providers.</li>
     * <li>An added policy immediately takes effect on all APIs that are bound to the access control list (ACL).</li>
     * <li>A maximum of 100 policies can be added to an ACL.</li>
     * </ul>
     * 
     * @param request the request parameters of AddIpControlPolicyItem  AddIpControlPolicyItemRequest
     * @return AddIpControlPolicyItemResponse
     */
    CompletableFuture<AddIpControlPolicyItemResponse> addIpControlPolicyItem(AddIpControlPolicyItemRequest request);

    /**
     * <b>description</b> :
     * <p>  This API is intended for API providers.</p>
     * <ul>
     * <li>If the input SpecialKey already exists, the previous configuration is overwritten. Use caution when calling this operation.</li>
     * <li>Special throttling policies must be added to an existing throttling policy, and can take effect on all the APIs to which the throttling policy is bound.</li>
     * </ul>
     * 
     * @param request the request parameters of AddTrafficSpecialControl  AddTrafficSpecialControlRequest
     * @return AddTrafficSpecialControlResponse
     */
    CompletableFuture<AddTrafficSpecialControlResponse> addTrafficSpecialControl(AddTrafficSpecialControlRequest request);

    /**
     * <b>description</b> :
     * <p>An internal domain name resolution can be associated only with a dedicated instance, not with a shared instance or shared instance cluster.</p>
     * 
     * @param request the request parameters of AssociateInstanceWithPrivateDNS  AssociateInstanceWithPrivateDNSRequest
     * @return AssociateInstanceWithPrivateDNSResponse
     */
    CompletableFuture<AssociateInstanceWithPrivateDNSResponse> associateInstanceWithPrivateDNS(AssociateInstanceWithPrivateDNSRequest request);

    /**
     * @param request the request parameters of AttachApiProduct  AttachApiProductRequest
     * @return AttachApiProductResponse
     */
    CompletableFuture<AttachApiProductResponse> attachApiProduct(AttachApiProductRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API providers.</p>
     * <ul>
     * <li>You can only bind plug-ins to published APIs.</li>
     * <li>The plug-in takes effect immediately after it is bound to an API.</li>
     * <li>If you bind a different plug-in to an API, this plug-in takes effect immediately.</li>
     * </ul>
     * 
     * @param request the request parameters of AttachPlugin  AttachPluginRequest
     * @return AttachPluginResponse
     */
    CompletableFuture<AttachPluginResponse> attachPlugin(AttachPluginRequest request);

    /**
     * @param request the request parameters of BatchAbolishApis  BatchAbolishApisRequest
     * @return BatchAbolishApisResponse
     */
    CompletableFuture<BatchAbolishApisResponse> batchAbolishApis(BatchAbolishApisRequest request);

    /**
     * @param request the request parameters of BatchDeployApis  BatchDeployApisRequest
     * @return BatchDeployApisResponse
     */
    CompletableFuture<BatchDeployApisResponse> batchDeployApis(BatchDeployApisRequest request);

    /**
     * @param request the request parameters of CreateAccessControlList  CreateAccessControlListRequest
     * @return CreateAccessControlListResponse
     */
    CompletableFuture<CreateAccessControlListResponse> createAccessControlList(CreateAccessControlListRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API providers.</p>
     * <ul>
     * <li>The name of an API must be unique within an API group.</li>
     * <li>A request path must be unique within an API group.</li>
     * <li>The QPS limit on this operation is 50 per user.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateApi  CreateApiRequest
     * @return CreateApiResponse
     */
    CompletableFuture<CreateApiResponse> createApi(CreateApiRequest request);

    /**
     * @param request the request parameters of CreateApiGroup  CreateApiGroupRequest
     * @return CreateApiGroupResponse
     */
    CompletableFuture<CreateApiGroupResponse> createApiGroup(CreateApiGroupRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API providers.</p>
     * 
     * @param request the request parameters of CreateApiStageVariable  CreateApiStageVariableRequest
     * @return CreateApiStageVariableResponse
     */
    CompletableFuture<CreateApiStageVariableResponse> createApiStageVariable(CreateApiStageVariableRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API callers.</p>
     * <ul>
     * <li>Each application has a key-value pair which is used for identity verification when you call an API.</li>
     * <li>An application must be authorized to call an API.</li>
     * <li>Each application has only one key-value pair, which can be reset if the pair is leaked.</li>
     * <li>A maximum of 1,000 applications can be created for each Alibaba Cloud account.</li>
     * <li>You can call this operation up to 50 times per second per account.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateApp  CreateAppRequest
     * @return CreateAppResponse
     */
    CompletableFuture<CreateAppResponse> createApp(CreateAppRequest request);

    /**
     * @param request the request parameters of CreateAppCode  CreateAppCodeRequest
     * @return CreateAppCodeResponse
     */
    CompletableFuture<CreateAppCodeResponse> createAppCode(CreateAppCodeRequest request);

    /**
     * @param request the request parameters of CreateAppKey  CreateAppKeyRequest
     * @return CreateAppKeyResponse
     */
    CompletableFuture<CreateAppKeyResponse> createAppKey(CreateAppKeyRequest request);

    /**
     * @param request the request parameters of CreateBackend  CreateBackendRequest
     * @return CreateBackendResponse
     */
    CompletableFuture<CreateBackendResponse> createBackend(CreateBackendRequest request);

    /**
     * @param request the request parameters of CreateBackendModel  CreateBackendModelRequest
     * @return CreateBackendModelResponse
     */
    CompletableFuture<CreateBackendModelResponse> createBackendModel(CreateBackendModelRequest request);

    /**
     * @param request the request parameters of CreateDataset  CreateDatasetRequest
     * @return CreateDatasetResponse
     */
    CompletableFuture<CreateDatasetResponse> createDataset(CreateDatasetRequest request);

    /**
     * @param request the request parameters of CreateDatasetItem  CreateDatasetItemRequest
     * @return CreateDatasetItemResponse
     */
    CompletableFuture<CreateDatasetItemResponse> createDatasetItem(CreateDatasetItemRequest request);

    /**
     * @param request the request parameters of CreateInstance  CreateInstanceRequest
     * @return CreateInstanceResponse
     */
    CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request);

    /**
     * @param request the request parameters of CreateIntranetDomain  CreateIntranetDomainRequest
     * @return CreateIntranetDomainResponse
     */
    CompletableFuture<CreateIntranetDomainResponse> createIntranetDomain(CreateIntranetDomainRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API providers.</p>
     * <ul>
     * <li>An ACL must be bound to an API to take effect. After an ACL is bound to an API, the ACL takes effect on the API immediately.</li>
     * <li>You can add policies to an ACL when you create the ACL.</li>
     * <li>If an ACL does not have any policy, the ACL is ineffective.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateIpControl  CreateIpControlRequest
     * @return CreateIpControlResponse
     */
    CompletableFuture<CreateIpControlResponse> createIpControl(CreateIpControlRequest request);

    /**
     * @param request the request parameters of CreateLogConfig  CreateLogConfigRequest
     * @return CreateLogConfigResponse
     */
    CompletableFuture<CreateLogConfigResponse> createLogConfig(CreateLogConfigRequest request);

    /**
     * <b>description</b> :
     * <p>  For more information about the model definition, see <a href="https://tools.ietf.org/html/draft-zyp-json-schema-04?spm=a2c4g.11186623.2.10.2e977ff7p4BpQd">JSON Schema Draft 4</a>.</p>
     * <ul>
     * <li>JSON Schema supports only element attributes of the Object type.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateModel  CreateModelRequest
     * @return CreateModelResponse
     */
    CompletableFuture<CreateModelResponse> createModel(CreateModelRequest request);

    /**
     * @param request the request parameters of CreateMonitorGroup  CreateMonitorGroupRequest
     * @return CreateMonitorGroupResponse
     */
    CompletableFuture<CreateMonitorGroupResponse> createMonitorGroup(CreateMonitorGroupRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API providers.</p>
     * <ul>
     * <li>The number of plug-ins of the same type that each user can create is limited. Different limits apply to different plug-in types.</li>
     * <li>The plug-in definitions for advanced features are restricted.</li>
     * <li>Plug-ins must be bound to APIs to take effect. After a plug-in is bound, it takes effect on that API immediately.</li>
     * </ul>
     * 
     * @param request the request parameters of CreatePlugin  CreatePluginRequest
     * @return CreatePluginResponse
     */
    CompletableFuture<CreatePluginResponse> createPlugin(CreatePluginRequest request);

    /**
     * <b>description</b> :
     * <p>An internal domain name resolution of the virtual private cloud (VPC) type can be bound only to traditional dedicated instances. An internal domain name resolution of the A type can be bound only to VPC integration dedicated instances.</p>
     * 
     * @param request the request parameters of CreatePrivateDNS  CreatePrivateDNSRequest
     * @return CreatePrivateDNSResponse
     */
    CompletableFuture<CreatePrivateDNSResponse> createPrivateDNS(CreatePrivateDNSRequest request);

    /**
     * <b>description</b> :
     * <p>  This API is intended for API providers.</p>
     * <ul>
     * <li>The API operation only creates a key policy. You must call the binding operation to bind the key to an API.</li>
     * <li>After the key is bound to the API, requests sent from API Gateway to the backend service contain signature strings. You can specify whether your backend service verifies these signature strings.</li>
     * <li>The QPS limit on this operation is 50 per user.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateSignature  CreateSignatureRequest
     * @return CreateSignatureResponse
     */
    CompletableFuture<CreateSignatureResponse> createSignature(CreateSignatureRequest request);

    /**
     * <b>description</b> :
     * <p>  This API is intended for API providers.</p>
     * <ul>
     * <li>Throttling policies must be bound to APIs to take effect. After a policy is bound to an API, it goes into effect on that API immediately.</li>
     * <li>The QPS limit on this operation is 50 per user.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateTrafficControl  CreateTrafficControlRequest
     * @return CreateTrafficControlResponse
     */
    CompletableFuture<CreateTrafficControlResponse> createTrafficControl(CreateTrafficControlRequest request);

    /**
     * @param request the request parameters of DeleteAccessControlList  DeleteAccessControlListRequest
     * @return DeleteAccessControlListResponse
     */
    CompletableFuture<DeleteAccessControlListResponse> deleteAccessControlList(DeleteAccessControlListRequest request);

    /**
     * <b>description</b> :
     * <p>  This API is intended for API providers.</p>
     * 
     * @param request the request parameters of DeleteAllTrafficSpecialControl  DeleteAllTrafficSpecialControlRequest
     * @return DeleteAllTrafficSpecialControlResponse
     */
    CompletableFuture<DeleteAllTrafficSpecialControlResponse> deleteAllTrafficSpecialControl(DeleteAllTrafficSpecialControlRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API providers and cannot be undone after it is complete.</p>
     * <ul>
     * <li>An API that is running in the runtime environment must be unpublished before you can delete the API.****</li>
     * <li>The QPS limit on this operation is 50 per user.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteApi  DeleteApiRequest
     * @return DeleteApiResponse
     */
    CompletableFuture<DeleteApiResponse> deleteApi(DeleteApiRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API providers.</p>
     * <ul>
     * <li>An API group that contains APIs cannot be deleted. To delete the API group, you must first delete its APIs.</li>
     * <li>After an API group is deleted, the second-level domain name bound to the API group is automatically invalidated.</li>
     * <li>If the specified API group does not exist, a success response is returned.</li>
     * <li>The QPS limit on this operation is 50 per user.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteApiGroup  DeleteApiGroupRequest
     * @return DeleteApiGroupResponse
     */
    CompletableFuture<DeleteApiGroupResponse> deleteApiGroup(DeleteApiGroupRequest request);

    /**
     * @param request the request parameters of DeleteApiProduct  DeleteApiProductRequest
     * @return DeleteApiProductResponse
     */
    CompletableFuture<DeleteApiProductResponse> deleteApiProduct(DeleteApiProductRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API providers.</p>
     * 
     * @param request the request parameters of DeleteApiStageVariable  DeleteApiStageVariableRequest
     * @return DeleteApiStageVariableResponse
     */
    CompletableFuture<DeleteApiStageVariableResponse> deleteApiStageVariable(DeleteApiStageVariableRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API callers.</p>
     * <ul>
     * <li>After an application is deleted, the application and its API authorization cannot be restored.</li>
     * <li>You can call this operation up to 50 times per second per account.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteApp  DeleteAppRequest
     * @return DeleteAppResponse
     */
    CompletableFuture<DeleteAppResponse> deleteApp(DeleteAppRequest request);

    /**
     * @param request the request parameters of DeleteAppCode  DeleteAppCodeRequest
     * @return DeleteAppCodeResponse
     */
    CompletableFuture<DeleteAppCodeResponse> deleteAppCode(DeleteAppCodeRequest request);

    /**
     * @param request the request parameters of DeleteAppKey  DeleteAppKeyRequest
     * @return DeleteAppKeyResponse
     */
    CompletableFuture<DeleteAppKeyResponse> deleteAppKey(DeleteAppKeyRequest request);

    /**
     * @param request the request parameters of DeleteBackend  DeleteBackendRequest
     * @return DeleteBackendResponse
     */
    CompletableFuture<DeleteBackendResponse> deleteBackend(DeleteBackendRequest request);

    /**
     * @param request the request parameters of DeleteBackendModel  DeleteBackendModelRequest
     * @return DeleteBackendModelResponse
     */
    CompletableFuture<DeleteBackendModelResponse> deleteBackendModel(DeleteBackendModelRequest request);

    /**
     * @param request the request parameters of DeleteDataset  DeleteDatasetRequest
     * @return DeleteDatasetResponse
     */
    CompletableFuture<DeleteDatasetResponse> deleteDataset(DeleteDatasetRequest request);

    /**
     * @param request the request parameters of DeleteDatasetItem  DeleteDatasetItemRequest
     * @return DeleteDatasetItemResponse
     */
    CompletableFuture<DeleteDatasetItemResponse> deleteDatasetItem(DeleteDatasetItemRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API providers.</p>
     * <ul>
     * <li>If the specified domain name does not exist, a successful response will still appear.</li>
     * <li>Unbinding a domain name from an API group will affect access to the APIs in the group. Exercise caution when using this operation.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteDomain  DeleteDomainRequest
     * @return DeleteDomainResponse
     */
    CompletableFuture<DeleteDomainResponse> deleteDomain(DeleteDomainRequest request);

    /**
     * @param request the request parameters of DeleteDomainCertificate  DeleteDomainCertificateRequest
     * @return DeleteDomainCertificateResponse
     */
    CompletableFuture<DeleteDomainCertificateResponse> deleteDomainCertificate(DeleteDomainCertificateRequest request);

    /**
     * @param request the request parameters of DeleteInstance  DeleteInstanceRequest
     * @return DeleteInstanceResponse
     */
    CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API providers.</p>
     * <ul>
     * <li>If the ACL is bound to an API, you must unbind the ACL from the API before you can delete the ACL. Otherwise, an error is returned.</li>
     * <li>If you call this operation on an ACL that does not exist, a success message is returned.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteIpControl  DeleteIpControlRequest
     * @return DeleteIpControlResponse
     */
    CompletableFuture<DeleteIpControlResponse> deleteIpControl(DeleteIpControlRequest request);

    /**
     * @param request the request parameters of DeleteLogConfig  DeleteLogConfigRequest
     * @return DeleteLogConfigResponse
     */
    CompletableFuture<DeleteLogConfigResponse> deleteLogConfig(DeleteLogConfigRequest request);

    /**
     * @param request the request parameters of DeleteModel  DeleteModelRequest
     * @return DeleteModelResponse
     */
    CompletableFuture<DeleteModelResponse> deleteModel(DeleteModelRequest request);

    /**
     * @param request the request parameters of DeleteMonitorGroup  DeleteMonitorGroupRequest
     * @return DeleteMonitorGroupResponse
     */
    CompletableFuture<DeleteMonitorGroupResponse> deleteMonitorGroup(DeleteMonitorGroupRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API providers.</p>
     * <ul>
     * <li>You must first unbind the plug-in from the API. Otherwise, an error is reported when you delete the plug-in.</li>
     * </ul>
     * 
     * @param request the request parameters of DeletePlugin  DeletePluginRequest
     * @return DeletePluginResponse
     */
    CompletableFuture<DeletePluginResponse> deletePlugin(DeletePluginRequest request);

    /**
     * @param request the request parameters of DeletePrivateDNS  DeletePrivateDNSRequest
     * @return DeletePrivateDNSResponse
     */
    CompletableFuture<DeletePrivateDNSResponse> deletePrivateDNS(DeletePrivateDNSRequest request);

    /**
     * <b>description</b> :
     * <p>  This API is intended for API providers.</p>
     * <ul>
     * <li>This API operation deletes an existing backend signature key.</li>
     * <li>You cannot delete a key that is bound to an API. To delete the key, you must unbind it first.</li>
     * <li>The QPS limit on this operation is 50 per user.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteSignature  DeleteSignatureRequest
     * @return DeleteSignatureResponse
     */
    CompletableFuture<DeleteSignatureResponse> deleteSignature(DeleteSignatureRequest request);

    /**
     * <b>description</b> :
     * <p>  This API is intended for API providers.</p>
     * <ul>
     * <li>If the throttling policy you want to delete is bound to APIs, you need to unbind the policy first. Otherwise, an error is reported when you delete the policy.</li>
     * <li>The QPS limit on this operation is 50 per user.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteTrafficControl  DeleteTrafficControlRequest
     * @return DeleteTrafficControlResponse
     */
    CompletableFuture<DeleteTrafficControlResponse> deleteTrafficControl(DeleteTrafficControlRequest request);

    /**
     * <b>description</b> :
     * <p>  This API is intended for API providers.</p>
     * <ul>
     * <li>You can obtain the input parameters required in this operation by calling other APIs.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteTrafficSpecialControl  DeleteTrafficSpecialControlRequest
     * @return DeleteTrafficSpecialControlResponse
     */
    CompletableFuture<DeleteTrafficSpecialControlResponse> deleteTrafficSpecialControl(DeleteTrafficSpecialControlRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API providers. Only the API that you have defined and published to a runtime environment can be called.</p>
     * <ul>
     * <li>An API is published to a cluster in under 5 seconds.</li>
     * <li>The QPS limit on this operation is 50 per user.</li>
     * </ul>
     * 
     * @param request the request parameters of DeployApi  DeployApiRequest
     * @return DeployApiResponse
     */
    CompletableFuture<DeployApiResponse> deployApi(DeployApiRequest request);

    /**
     * @param request the request parameters of DescribeAbolishApiTask  DescribeAbolishApiTaskRequest
     * @return DescribeAbolishApiTaskResponse
     */
    CompletableFuture<DescribeAbolishApiTaskResponse> describeAbolishApiTask(DescribeAbolishApiTaskRequest request);

    /**
     * @param request the request parameters of DescribeAccessControlListAttribute  DescribeAccessControlListAttributeRequest
     * @return DescribeAccessControlListAttributeResponse
     */
    CompletableFuture<DescribeAccessControlListAttributeResponse> describeAccessControlListAttribute(DescribeAccessControlListAttributeRequest request);

    /**
     * @param request the request parameters of DescribeAccessControlLists  DescribeAccessControlListsRequest
     * @return DescribeAccessControlListsResponse
     */
    CompletableFuture<DescribeAccessControlListsResponse> describeAccessControlLists(DescribeAccessControlListsRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API providers.</p>
     * 
     * @param request the request parameters of DescribeApi  DescribeApiRequest
     * @return DescribeApiResponse
     */
    CompletableFuture<DescribeApiResponse> describeApi(DescribeApiRequest request);

    /**
     * <b>description</b> :
     * <p>  For API callers, the specified API must be a public or authorized private API that has been published to a runtime environment.</p>
     * <ul>
     * <li>When you call this operation as an API caller, the service information, parameter definitions, and other details of the API you specify are returned.</li>
     * <li>When you call this operation as an API provider, the definition of the specified API running in the specified runtime environment is returned. The returned definition takes effect in the runtime environment, and may be different from the definition of the API you modify.</li>
     * <li>Before you call this operation as an API provider, ensure that the API to be queried is a public one or that your application has been authorized to call the API, because authentication on API callers is required.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeApiDoc  DescribeApiDocRequest
     * @return DescribeApiDocResponse
     */
    CompletableFuture<DescribeApiDocResponse> describeApiDoc(DescribeApiDocRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API providers.</p>
     * 
     * @param request the request parameters of DescribeApiGroup  DescribeApiGroupRequest
     * @return DescribeApiGroupResponse
     */
    CompletableFuture<DescribeApiGroupResponse> describeApiGroup(DescribeApiGroupRequest request);

    /**
     * @param request the request parameters of DescribeApiGroupVpcWhitelist  DescribeApiGroupVpcWhitelistRequest
     * @return DescribeApiGroupVpcWhitelistResponse
     */
    CompletableFuture<DescribeApiGroupVpcWhitelistResponse> describeApiGroupVpcWhitelist(DescribeApiGroupVpcWhitelistRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API providers.</p>
     * 
     * @param request the request parameters of DescribeApiGroups  DescribeApiGroupsRequest
     * @return DescribeApiGroupsResponse
     */
    CompletableFuture<DescribeApiGroupsResponse> describeApiGroups(DescribeApiGroupsRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API providers. Only APIs that have been published have historical version records.</p>
     * <ul>
     * <li>This operation allows you to obtain the historical versions of an API. This operation is always called by other operations.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeApiHistories  DescribeApiHistoriesRequest
     * @return DescribeApiHistoriesResponse
     */
    CompletableFuture<DescribeApiHistoriesResponse> describeApiHistories(DescribeApiHistoriesRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the details of a specified historical version of a specified API definition.</p>
     * <ul>
     * <li>This API is intended for API providers.</li>
     * <li>API Gateway records the time and definition of an API every time the API is published. You can use the version number obtained from other operations to query definition details at a certain publication.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeApiHistory  DescribeApiHistoryRequest
     * @return DescribeApiHistoryResponse
     */
    CompletableFuture<DescribeApiHistoryResponse> describeApiHistory(DescribeApiHistoryRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API callers.</p>
     * <ul>
     * <li>If an optional parameter is not specified, all results are returned on separate pages.
     * ·</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeApiIpControls  DescribeApiIpControlsRequest
     * @return DescribeApiIpControlsResponse
     */
    CompletableFuture<DescribeApiIpControlsResponse> describeApiIpControls(DescribeApiIpControlsRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the latency metrics in milliseconds for a specified API.</p>
     * <ul>
     * <li>This API is intended for API providers.</li>
     * <li>Only statistics for API calls made in the release environment are collected by default.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeApiLatencyData  DescribeApiLatencyDataRequest
     * @return DescribeApiLatencyDataResponse
     */
    CompletableFuture<DescribeApiLatencyDataResponse> describeApiLatencyData(DescribeApiLatencyDataRequest request);

    /**
     * @param request the request parameters of DescribeApiMarketAttributes  DescribeApiMarketAttributesRequest
     * @return DescribeApiMarketAttributesResponse
     */
    CompletableFuture<DescribeApiMarketAttributesResponse> describeApiMarketAttributes(DescribeApiMarketAttributesRequest request);

    /**
     * @param request the request parameters of DescribeApiProductApis  DescribeApiProductApisRequest
     * @return DescribeApiProductApisResponse
     */
    CompletableFuture<DescribeApiProductApisResponse> describeApiProductApis(DescribeApiProductApisRequest request);

    /**
     * @param request the request parameters of DescribeApiProductsByApp  DescribeApiProductsByAppRequest
     * @return DescribeApiProductsByAppResponse
     */
    CompletableFuture<DescribeApiProductsByAppResponse> describeApiProductsByApp(DescribeApiProductsByAppRequest request);

    /**
     * <b>description</b> :
     * <p>  This API is intended for API providers.</p>
     * <ul>
     * <li>Only statistics for API calls made in the release environment are collected by default.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeApiQpsData  DescribeApiQpsDataRequest
     * @return DescribeApiQpsDataResponse
     */
    CompletableFuture<DescribeApiQpsDataResponse> describeApiQpsData(DescribeApiQpsDataRequest request);

    /**
     * <b>description</b> :
     * <p>  This API is intended for API providers.</p>
     * <ul>
     * <li>The ApiIds parameter is optional. If this parameter is not specified, all results in the specified environment of an API group are returned.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeApiSignatures  DescribeApiSignaturesRequest
     * @return DescribeApiSignaturesResponse
     */
    CompletableFuture<DescribeApiSignaturesResponse> describeApiSignatures(DescribeApiSignaturesRequest request);

    /**
     * <b>description</b> :
     * <p>  This API is intended for API providers.</p>
     * <ul>
     * <li>The ApiIds parameter is optional. If this parameter is not specified, all results in the specified environment of an API group are returned.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeApiTrafficControls  DescribeApiTrafficControlsRequest
     * @return DescribeApiTrafficControlsResponse
     */
    CompletableFuture<DescribeApiTrafficControlsResponse> describeApiTrafficControls(DescribeApiTrafficControlsRequest request);

    /**
     * <b>description</b> :
     * <p>  This API is intended for API providers.</p>
     * <ul>
     * <li>Only statistics for API calls made in the release environment are collected by default.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeApiTrafficData  DescribeApiTrafficDataRequest
     * @return DescribeApiTrafficDataResponse
     */
    CompletableFuture<DescribeApiTrafficDataResponse> describeApiTrafficData(DescribeApiTrafficDataRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API callers.</p>
     * <ul>
     * <li>This operation returns a list of all APIs that are being defined. The basic information about these APIs is also returned in the list.</li>
     * <li>This operation returns all APIs that are being edited, regardless of their environments. The returned definitions may be different from the definitions in the environments.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeApis  DescribeApisRequest
     * @return DescribeApisResponse
     */
    CompletableFuture<DescribeApisResponse> describeApis(DescribeApisRequest request);

    /**
     * @param request the request parameters of DescribeApisByApp  DescribeApisByAppRequest
     * @return DescribeApisByAppResponse
     */
    CompletableFuture<DescribeApisByAppResponse> describeApisByApp(DescribeApisByAppRequest request);

    /**
     * @param request the request parameters of DescribeApisByBackend  DescribeApisByBackendRequest
     * @return DescribeApisByBackendResponse
     */
    CompletableFuture<DescribeApisByBackendResponse> describeApisByBackend(DescribeApisByBackendRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API callers.</p>
     * <ul>
     * <li>You can specify PageNumber to obtain the result on the specified page.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeApisByIpControl  DescribeApisByIpControlRequest
     * @return DescribeApisByIpControlResponse
     */
    CompletableFuture<DescribeApisByIpControlResponse> describeApisByIpControl(DescribeApisByIpControlRequest request);

    /**
     * <b>description</b> :
     * <p>  This API is intended for API providers.</p>
     * <ul>
     * <li>The results are returned on separate pages. You can specify PageNumber to obtain the result on the specified page.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeApisBySignature  DescribeApisBySignatureRequest
     * @return DescribeApisBySignatureResponse
     */
    CompletableFuture<DescribeApisBySignatureResponse> describeApisBySignature(DescribeApisBySignatureRequest request);

    /**
     * <b>description</b> :
     * <p>  This API is intended for API providers.</p>
     * <ul>
     * <li>You can specify PageNumber to obtain the result on the specified page.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeApisByTrafficControl  DescribeApisByTrafficControlRequest
     * @return DescribeApisByTrafficControlResponse
     */
    CompletableFuture<DescribeApisByTrafficControlResponse> describeApisByTrafficControl(DescribeApisByTrafficControlRequest request);

    /**
     * @param request the request parameters of DescribeApisByVpcAccess  DescribeApisByVpcAccessRequest
     * @return DescribeApisByVpcAccessResponse
     */
    CompletableFuture<DescribeApisByVpcAccessResponse> describeApisByVpcAccess(DescribeApisByVpcAccessRequest request);

    /**
     * @param request the request parameters of DescribeApisWithStageNameIntegratedByApp  DescribeApisWithStageNameIntegratedByAppRequest
     * @return DescribeApisWithStageNameIntegratedByAppResponse
     */
    CompletableFuture<DescribeApisWithStageNameIntegratedByAppResponse> describeApisWithStageNameIntegratedByApp(DescribeApisWithStageNameIntegratedByAppRequest request);

    /**
     * @param request the request parameters of DescribeApp  DescribeAppRequest
     * @return DescribeAppResponse
     */
    CompletableFuture<DescribeAppResponse> describeApp(DescribeAppRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API callers.</p>
     * <ul>
     * <li>AppId is optional.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeAppAttributes  DescribeAppAttributesRequest
     * @return DescribeAppAttributesResponse
     */
    CompletableFuture<DescribeAppAttributesResponse> describeAppAttributes(DescribeAppAttributesRequest request);

    /**
     * @param request the request parameters of DescribeAppSecurities  DescribeAppSecuritiesRequest
     * @return DescribeAppSecuritiesResponse
     */
    CompletableFuture<DescribeAppSecuritiesResponse> describeAppSecurities(DescribeAppSecuritiesRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API callers.</p>
     * 
     * @param request the request parameters of DescribeAppSecurity  DescribeAppSecurityRequest
     * @return DescribeAppSecurityResponse
     */
    CompletableFuture<DescribeAppSecurityResponse> describeAppSecurity(DescribeAppSecurityRequest request);

    /**
     * <b>description</b> :
     * <p>  This API is intended for API providers.</p>
     * <ul>
     * <li>API providers can use the app IDs or their Alibaba Cloud accounts to query app information.</li>
     * <li>Each provider can call this operation for a maximum of 200 times every day in a region.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeApps  DescribeAppsRequest
     * @return DescribeAppsResponse
     */
    CompletableFuture<DescribeAppsResponse> describeApps(DescribeAppsRequest request);

    /**
     * @param request the request parameters of DescribeAppsByApiProduct  DescribeAppsByApiProductRequest
     * @return DescribeAppsByApiProductResponse
     */
    CompletableFuture<DescribeAppsByApiProductResponse> describeAppsByApiProduct(DescribeAppsByApiProductRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API callers.</p>
     * <ul>
     * <li>The specified application can call all APIs included in the responses.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeAuthorizedApis  DescribeAuthorizedApisRequest
     * @return DescribeAuthorizedApisResponse
     */
    CompletableFuture<DescribeAuthorizedApisResponse> describeAuthorizedApis(DescribeAuthorizedApisRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API providers.</p>
     * <ul>
     * <li>All applications included in the responses have access to the specified API.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeAuthorizedApps  DescribeAuthorizedAppsRequest
     * @return DescribeAuthorizedAppsResponse
     */
    CompletableFuture<DescribeAuthorizedAppsResponse> describeAuthorizedApps(DescribeAuthorizedAppsRequest request);

    /**
     * @param request the request parameters of DescribeBackendInfo  DescribeBackendInfoRequest
     * @return DescribeBackendInfoResponse
     */
    CompletableFuture<DescribeBackendInfoResponse> describeBackendInfo(DescribeBackendInfoRequest request);

    /**
     * @param request the request parameters of DescribeBackendList  DescribeBackendListRequest
     * @return DescribeBackendListResponse
     */
    CompletableFuture<DescribeBackendListResponse> describeBackendList(DescribeBackendListRequest request);

    /**
     * @param request the request parameters of DescribeDatasetInfo  DescribeDatasetInfoRequest
     * @return DescribeDatasetInfoResponse
     */
    CompletableFuture<DescribeDatasetInfoResponse> describeDatasetInfo(DescribeDatasetInfoRequest request);

    /**
     * @param request the request parameters of DescribeDatasetItemInfo  DescribeDatasetItemInfoRequest
     * @return DescribeDatasetItemInfoResponse
     */
    CompletableFuture<DescribeDatasetItemInfoResponse> describeDatasetItemInfo(DescribeDatasetItemInfoRequest request);

    /**
     * @param request the request parameters of DescribeDatasetItemList  DescribeDatasetItemListRequest
     * @return DescribeDatasetItemListResponse
     */
    CompletableFuture<DescribeDatasetItemListResponse> describeDatasetItemList(DescribeDatasetItemListRequest request);

    /**
     * @param request the request parameters of DescribeDatasetList  DescribeDatasetListRequest
     * @return DescribeDatasetListResponse
     */
    CompletableFuture<DescribeDatasetListResponse> describeDatasetList(DescribeDatasetListRequest request);

    /**
     * @param request the request parameters of DescribeDeployApiTask  DescribeDeployApiTaskRequest
     * @return DescribeDeployApiTaskResponse
     */
    CompletableFuture<DescribeDeployApiTaskResponse> describeDeployApiTask(DescribeDeployApiTaskRequest request);

    /**
     * @param request the request parameters of DescribeDeployedApi  DescribeDeployedApiRequest
     * @return DescribeDeployedApiResponse
     */
    CompletableFuture<DescribeDeployedApiResponse> describeDeployedApi(DescribeDeployedApiRequest request);

    /**
     * <b>description</b> :
     * <p>  This API is intended for API providers.</p>
     * 
     * @param request the request parameters of DescribeDeployedApis  DescribeDeployedApisRequest
     * @return DescribeDeployedApisResponse
     */
    CompletableFuture<DescribeDeployedApisResponse> describeDeployedApis(DescribeDeployedApisRequest request);

    /**
     * @param request the request parameters of DescribeDomain  DescribeDomainRequest
     * @return DescribeDomainResponse
     */
    CompletableFuture<DescribeDomainResponse> describeDomain(DescribeDomainRequest request);

    /**
     * @param request the request parameters of DescribeGroupLatency  DescribeGroupLatencyRequest
     * @return DescribeGroupLatencyResponse
     */
    CompletableFuture<DescribeGroupLatencyResponse> describeGroupLatency(DescribeGroupLatencyRequest request);

    /**
     * @param request the request parameters of DescribeGroupQps  DescribeGroupQpsRequest
     * @return DescribeGroupQpsResponse
     */
    CompletableFuture<DescribeGroupQpsResponse> describeGroupQps(DescribeGroupQpsRequest request);

    /**
     * @param request the request parameters of DescribeGroupTraffic  DescribeGroupTrafficRequest
     * @return DescribeGroupTrafficResponse
     */
    CompletableFuture<DescribeGroupTrafficResponse> describeGroupTraffic(DescribeGroupTrafficRequest request);

    /**
     * @param request the request parameters of DescribeHistoryApis  DescribeHistoryApisRequest
     * @return DescribeHistoryApisResponse
     */
    CompletableFuture<DescribeHistoryApisResponse> describeHistoryApis(DescribeHistoryApisRequest request);

    /**
     * @param request the request parameters of DescribeImportOASTask  DescribeImportOASTaskRequest
     * @return DescribeImportOASTaskResponse
     */
    CompletableFuture<DescribeImportOASTaskResponse> describeImportOASTask(DescribeImportOASTaskRequest request);

    /**
     * @param request the request parameters of DescribeInstanceClusterInfo  DescribeInstanceClusterInfoRequest
     * @return DescribeInstanceClusterInfoResponse
     */
    CompletableFuture<DescribeInstanceClusterInfoResponse> describeInstanceClusterInfo(DescribeInstanceClusterInfoRequest request);

    /**
     * @param request the request parameters of DescribeInstanceClusterList  DescribeInstanceClusterListRequest
     * @return DescribeInstanceClusterListResponse
     */
    CompletableFuture<DescribeInstanceClusterListResponse> describeInstanceClusterList(DescribeInstanceClusterListRequest request);

    /**
     * @param request the request parameters of DescribeInstanceDropConnections  DescribeInstanceDropConnectionsRequest
     * @return DescribeInstanceDropConnectionsResponse
     */
    CompletableFuture<DescribeInstanceDropConnectionsResponse> describeInstanceDropConnections(DescribeInstanceDropConnectionsRequest request);

    /**
     * @param request the request parameters of DescribeInstanceDropPacket  DescribeInstanceDropPacketRequest
     * @return DescribeInstanceDropPacketResponse
     */
    CompletableFuture<DescribeInstanceDropPacketResponse> describeInstanceDropPacket(DescribeInstanceDropPacketRequest request);

    /**
     * @param request the request parameters of DescribeInstanceHttpCode  DescribeInstanceHttpCodeRequest
     * @return DescribeInstanceHttpCodeResponse
     */
    CompletableFuture<DescribeInstanceHttpCodeResponse> describeInstanceHttpCode(DescribeInstanceHttpCodeRequest request);

    /**
     * @param request the request parameters of DescribeInstanceLatency  DescribeInstanceLatencyRequest
     * @return DescribeInstanceLatencyResponse
     */
    CompletableFuture<DescribeInstanceLatencyResponse> describeInstanceLatency(DescribeInstanceLatencyRequest request);

    /**
     * @param request the request parameters of DescribeInstanceNewConnections  DescribeInstanceNewConnectionsRequest
     * @return DescribeInstanceNewConnectionsResponse
     */
    CompletableFuture<DescribeInstanceNewConnectionsResponse> describeInstanceNewConnections(DescribeInstanceNewConnectionsRequest request);

    /**
     * @param request the request parameters of DescribeInstancePackets  DescribeInstancePacketsRequest
     * @return DescribeInstancePacketsResponse
     */
    CompletableFuture<DescribeInstancePacketsResponse> describeInstancePackets(DescribeInstancePacketsRequest request);

    /**
     * @param request the request parameters of DescribeInstanceQps  DescribeInstanceQpsRequest
     * @return DescribeInstanceQpsResponse
     */
    CompletableFuture<DescribeInstanceQpsResponse> describeInstanceQps(DescribeInstanceQpsRequest request);

    /**
     * @param request the request parameters of DescribeInstanceSlbConnect  DescribeInstanceSlbConnectRequest
     * @return DescribeInstanceSlbConnectResponse
     */
    CompletableFuture<DescribeInstanceSlbConnectResponse> describeInstanceSlbConnect(DescribeInstanceSlbConnectRequest request);

    /**
     * @param request the request parameters of DescribeInstanceTraffic  DescribeInstanceTrafficRequest
     * @return DescribeInstanceTrafficResponse
     */
    CompletableFuture<DescribeInstanceTrafficResponse> describeInstanceTraffic(DescribeInstanceTrafficRequest request);

    /**
     * @param request the request parameters of DescribeInstances  DescribeInstancesRequest
     * @return DescribeInstancesResponse
     */
    CompletableFuture<DescribeInstancesResponse> describeInstances(DescribeInstancesRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API providers.</p>
     * <ul>
     * <li>You can filter the query results by policy ID.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeIpControlPolicyItems  DescribeIpControlPolicyItemsRequest
     * @return DescribeIpControlPolicyItemsResponse
     */
    CompletableFuture<DescribeIpControlPolicyItemsResponse> describeIpControlPolicyItems(DescribeIpControlPolicyItemsRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API providers.</p>
     * <ul>
     * <li>This operation is used to query the ACLs in a region. Region is a system parameter.</li>
     * <li>You can filter the query results by ACL ID, name, or type.</li>
     * <li>This operation cannot be used to query specific policies. If you want to query specific policies, call the <a href="~~DescribeIpControlPolicyItems~~">DescribeIpControlPolicyItems</a> operation.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeIpControls  DescribeIpControlsRequest
     * @return DescribeIpControlsResponse
     */
    CompletableFuture<DescribeIpControlsResponse> describeIpControls(DescribeIpControlsRequest request);

    /**
     * @param request the request parameters of DescribeLogConfig  DescribeLogConfigRequest
     * @return DescribeLogConfigResponse
     */
    CompletableFuture<DescribeLogConfigResponse> describeLogConfig(DescribeLogConfigRequest request);

    /**
     * @param request the request parameters of DescribeMarketRemainsQuota  DescribeMarketRemainsQuotaRequest
     * @return DescribeMarketRemainsQuotaResponse
     */
    CompletableFuture<DescribeMarketRemainsQuotaResponse> describeMarketRemainsQuota(DescribeMarketRemainsQuotaRequest request);

    /**
     * <b>description</b> :
     * <p>  Fuzzy queries are supported.</p>
     * 
     * @param request the request parameters of DescribeModels  DescribeModelsRequest
     * @return DescribeModelsResponse
     */
    CompletableFuture<DescribeModelsResponse> describeModels(DescribeModelsRequest request);

    /**
     * @param request the request parameters of DescribePluginApis  DescribePluginApisRequest
     * @return DescribePluginApisResponse
     */
    CompletableFuture<DescribePluginApisResponse> describePluginApis(DescribePluginApisRequest request);

    /**
     * @param request the request parameters of DescribePluginSchemas  DescribePluginSchemasRequest
     * @return DescribePluginSchemasResponse
     */
    CompletableFuture<DescribePluginSchemasResponse> describePluginSchemas(DescribePluginSchemasRequest request);

    /**
     * @param request the request parameters of DescribePluginTemplates  DescribePluginTemplatesRequest
     * @return DescribePluginTemplatesResponse
     */
    CompletableFuture<DescribePluginTemplatesResponse> describePluginTemplates(DescribePluginTemplatesRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation supports pagination.</p>
     * <ul>
     * <li>This operation allows you to query plug-ins by business type.</li>
     * <li>This operation allows you to query plug-ins by ID.</li>
     * <li>This operation allows you to query plug-ins by name.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribePlugins  DescribePluginsRequest
     * @return DescribePluginsResponse
     */
    CompletableFuture<DescribePluginsResponse> describePlugins(DescribePluginsRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API callers.</p>
     * <ul>
     * <li>This operation supports pagination.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribePluginsByApi  DescribePluginsByApiRequest
     * @return DescribePluginsByApiResponse
     */
    CompletableFuture<DescribePluginsByApiResponse> describePluginsByApi(DescribePluginsByApiRequest request);

    /**
     * @param request the request parameters of DescribePurchasedApiGroup  DescribePurchasedApiGroupRequest
     * @return DescribePurchasedApiGroupResponse
     */
    CompletableFuture<DescribePurchasedApiGroupResponse> describePurchasedApiGroup(DescribePurchasedApiGroupRequest request);

    /**
     * @param request the request parameters of DescribePurchasedApiGroups  DescribePurchasedApiGroupsRequest
     * @return DescribePurchasedApiGroupsResponse
     */
    CompletableFuture<DescribePurchasedApiGroupsResponse> describePurchasedApiGroups(DescribePurchasedApiGroupsRequest request);

    /**
     * @param request the request parameters of DescribePurchasedApis  DescribePurchasedApisRequest
     * @return DescribePurchasedApisResponse
     */
    CompletableFuture<DescribePurchasedApisResponse> describePurchasedApis(DescribePurchasedApisRequest request);

    /**
     * <b>description</b> :
     * <p>This operation queries regions in which API Gateway is available.</p>
     * <ul>
     * <li>This operation is intended for API providers and callers.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * <b>description</b> :
     * <p>  This API is intended for API providers.</p>
     * <ul>
     * <li>This operation is used to query the backend signature keys in a Region. Region is a system parameter.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSignatures  DescribeSignaturesRequest
     * @return DescribeSignaturesResponse
     */
    CompletableFuture<DescribeSignaturesResponse> describeSignatures(DescribeSignaturesRequest request);

    /**
     * <b>description</b> :
     * <p>  This API is intended for API providers.</p>
     * 
     * @param request the request parameters of DescribeSignaturesByApi  DescribeSignaturesByApiRequest
     * @return DescribeSignaturesByApiResponse
     */
    CompletableFuture<DescribeSignaturesByApiResponse> describeSignaturesByApi(DescribeSignaturesByApiRequest request);

    /**
     * @param request the request parameters of DescribeSummaryData  DescribeSummaryDataRequest
     * @return DescribeSummaryDataResponse
     */
    CompletableFuture<DescribeSummaryDataResponse> describeSummaryData(DescribeSummaryDataRequest request);

    /**
     * <b>description</b> :
     * <p>  This API is intended for API callers.</p>
     * <ul>
     * <li>The response of this API contains the system parameters that are optional in API definitions.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSystemParameters  DescribeSystemParametersRequest
     * @return DescribeSystemParametersResponse
     */
    CompletableFuture<DescribeSystemParametersResponse> describeSystemParameters(DescribeSystemParametersRequest request);

    /**
     * <b>description</b> :
     * <p>  This API is intended for API providers.</p>
     * <ul>
     * <li>This API can be used to query all existing throttling policies (including special throttling policies) and their details.</li>
     * <li>You can specify query conditions. For example, you can query the throttling policies bound to a specified API or in a specified environment.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeTrafficControls  DescribeTrafficControlsRequest
     * @return DescribeTrafficControlsResponse
     */
    CompletableFuture<DescribeTrafficControlsResponse> describeTrafficControls(DescribeTrafficControlsRequest request);

    /**
     * <b>description</b> :
     * <p>  This API is intended for API providers.</p>
     * 
     * @param request the request parameters of DescribeTrafficControlsByApi  DescribeTrafficControlsByApiRequest
     * @return DescribeTrafficControlsByApiResponse
     */
    CompletableFuture<DescribeTrafficControlsByApiResponse> describeTrafficControlsByApi(DescribeTrafficControlsByApiRequest request);

    /**
     * @param request the request parameters of DescribeUpdateBackendTask  DescribeUpdateBackendTaskRequest
     * @return DescribeUpdateBackendTaskResponse
     */
    CompletableFuture<DescribeUpdateBackendTaskResponse> describeUpdateBackendTask(DescribeUpdateBackendTaskRequest request);

    /**
     * @param request the request parameters of DescribeUpdateVpcInfoTask  DescribeUpdateVpcInfoTaskRequest
     * @return DescribeUpdateVpcInfoTaskResponse
     */
    CompletableFuture<DescribeUpdateVpcInfoTaskResponse> describeUpdateVpcInfoTask(DescribeUpdateVpcInfoTaskRequest request);

    /**
     * @param request the request parameters of DescribeVpcAccesses  DescribeVpcAccessesRequest
     * @return DescribeVpcAccessesResponse
     */
    CompletableFuture<DescribeVpcAccessesResponse> describeVpcAccesses(DescribeVpcAccessesRequest request);

    /**
     * @param request the request parameters of DescribeZones  DescribeZonesRequest
     * @return DescribeZonesResponse
     */
    CompletableFuture<DescribeZonesResponse> describeZones(DescribeZonesRequest request);

    /**
     * @param request the request parameters of DetachApiProduct  DetachApiProductRequest
     * @return DetachApiProductResponse
     */
    CompletableFuture<DetachApiProductResponse> detachApiProduct(DetachApiProductRequest request);

    /**
     * @param request the request parameters of DetachPlugin  DetachPluginRequest
     * @return DetachPluginResponse
     */
    CompletableFuture<DetachPluginResponse> detachPlugin(DetachPluginRequest request);

    /**
     * @param request the request parameters of DisableInstanceAccessControl  DisableInstanceAccessControlRequest
     * @return DisableInstanceAccessControlResponse
     */
    CompletableFuture<DisableInstanceAccessControlResponse> disableInstanceAccessControl(DisableInstanceAccessControlRequest request);

    /**
     * @param request the request parameters of DissociateInstanceWithPrivateDNS  DissociateInstanceWithPrivateDNSRequest
     * @return DissociateInstanceWithPrivateDNSResponse
     */
    CompletableFuture<DissociateInstanceWithPrivateDNSResponse> dissociateInstanceWithPrivateDNS(DissociateInstanceWithPrivateDNSRequest request);

    /**
     * @param request the request parameters of DryRunSwagger  DryRunSwaggerRequest
     * @return DryRunSwaggerResponse
     */
    CompletableFuture<DryRunSwaggerResponse> dryRunSwagger(DryRunSwaggerRequest request);

    /**
     * @param request the request parameters of EnableInstanceAccessControl  EnableInstanceAccessControlRequest
     * @return EnableInstanceAccessControlResponse
     */
    CompletableFuture<EnableInstanceAccessControlResponse> enableInstanceAccessControl(EnableInstanceAccessControlRequest request);

    /**
     * @param request the request parameters of ExportOAS  ExportOASRequest
     * @return ExportOASResponse
     */
    CompletableFuture<ExportOASResponse> exportOAS(ExportOASRequest request);

    /**
     * @param request the request parameters of ImportOAS  ImportOASRequest
     * @return ImportOASResponse
     */
    CompletableFuture<ImportOASResponse> importOAS(ImportOASRequest request);

    /**
     * <b>description</b> :
     * <p>  Alibaba Cloud supports extensions based on Swagger 2.0.</p>
     * <ul>
     * <li>Alibaba Cloud supports Swagger configuration files in JSON and YAML formats.</li>
     * </ul>
     * 
     * @param request the request parameters of ImportSwagger  ImportSwaggerRequest
     * @return ImportSwaggerResponse
     */
    CompletableFuture<ImportSwaggerResponse> importSwagger(ImportSwaggerRequest request);

    /**
     * @param request the request parameters of ListPrivateDNS  ListPrivateDNSRequest
     * @return ListPrivateDNSResponse
     */
    CompletableFuture<ListPrivateDNSResponse> listPrivateDNS(ListPrivateDNSRequest request);

    /**
     * <b>description</b> :
     * <p>  The Tag.N.Key and Tag.N.Value parameters constitute a key-value pair.</p>
     * <ul>
     * <li>ResourceId.N must meet all the key-value pairs that are entered. If you enter multiple key-value pairs, resources that contain the specified key-value pairs are returned.</li>
     * <li>This operation is used to query resource tags based on conditions. If no relationship matches the conditions, an empty list is returned.</li>
     * <li>You can query both user tags and visible system tags.</li>
     * <li>In addition to the required parameters, you can also specify ResourceId.N to query the visible resource tags of a specified resource in a region.</li>
     * <li>You can also specify Tag.N.Key to query the visible keys of a specified key in a region.</li>
     * <li>At least one of ResourceId.N, Tag.N.Key, and Tag.N.Value exists.</li>
     * <li>You can query tags of the same type or different types in a single operation.</li>
     * <li>You can query all your user types and visible system tags.</li>
     * </ul>
     * 
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * <b>description</b> :
     * <p><em>This operation is intended for API providers.</em>*</p>
     * <ul>
     * <li>This API operation requires a full update. Updates of partial parameters are not supported.</li>
     * <li>When you modify an API name, make sure that the name of each API within the same group is unique.</li>
     * <li>When you modify the request path, make sure that each request path within the same group is unique.</li>
     * <li>The QPS limit on this operation is 50 per user.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyApi  ModifyApiRequest
     * @return ModifyApiResponse
     */
    CompletableFuture<ModifyApiResponse> modifyApi(ModifyApiRequest request);

    /**
     * @param request the request parameters of ModifyApiConfiguration  ModifyApiConfigurationRequest
     * @return ModifyApiConfigurationResponse
     */
    CompletableFuture<ModifyApiConfigurationResponse> modifyApiConfiguration(ModifyApiConfigurationRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API providers.</p>
     * <ul>
     * <li>The QPS limit on this operation is 50 per user.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyApiGroup  ModifyApiGroupRequest
     * @return ModifyApiGroupResponse
     */
    CompletableFuture<ModifyApiGroupResponse> modifyApiGroup(ModifyApiGroupRequest request);

    /**
     * @param request the request parameters of ModifyApiGroupInstance  ModifyApiGroupInstanceRequest
     * @return ModifyApiGroupInstanceResponse
     */
    CompletableFuture<ModifyApiGroupInstanceResponse> modifyApiGroupInstance(ModifyApiGroupInstanceRequest request);

    /**
     * @param request the request parameters of ModifyApiGroupNetworkPolicy  ModifyApiGroupNetworkPolicyRequest
     * @return ModifyApiGroupNetworkPolicyResponse
     */
    CompletableFuture<ModifyApiGroupNetworkPolicyResponse> modifyApiGroupNetworkPolicy(ModifyApiGroupNetworkPolicyRequest request);

    /**
     * @param request the request parameters of ModifyApiGroupVpcWhitelist  ModifyApiGroupVpcWhitelistRequest
     * @return ModifyApiGroupVpcWhitelistResponse
     */
    CompletableFuture<ModifyApiGroupVpcWhitelistResponse> modifyApiGroupVpcWhitelist(ModifyApiGroupVpcWhitelistRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API callers.</p>
     * <ul>
     * <li>AppName or Description can be modified. If these parameters are not specified, no modifications are made and the operation will directly return a successful response.********</li>
     * <li>The QPS limit on this operation is 50 per user.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyApp  ModifyAppRequest
     * @return ModifyAppResponse
     */
    CompletableFuture<ModifyAppResponse> modifyApp(ModifyAppRequest request);

    /**
     * @param request the request parameters of ModifyBackend  ModifyBackendRequest
     * @return ModifyBackendResponse
     */
    CompletableFuture<ModifyBackendResponse> modifyBackend(ModifyBackendRequest request);

    /**
     * @param request the request parameters of ModifyBackendModel  ModifyBackendModelRequest
     * @return ModifyBackendModelResponse
     */
    CompletableFuture<ModifyBackendModelResponse> modifyBackendModel(ModifyBackendModelRequest request);

    /**
     * @param request the request parameters of ModifyDataset  ModifyDatasetRequest
     * @return ModifyDatasetResponse
     */
    CompletableFuture<ModifyDatasetResponse> modifyDataset(ModifyDatasetRequest request);

    /**
     * @param request the request parameters of ModifyDatasetItem  ModifyDatasetItemRequest
     * @return ModifyDatasetItemResponse
     */
    CompletableFuture<ModifyDatasetItemResponse> modifyDatasetItem(ModifyDatasetItemRequest request);

    /**
     * @param request the request parameters of ModifyInstanceAttribute  ModifyInstanceAttributeRequest
     * @return ModifyInstanceAttributeResponse
     */
    CompletableFuture<ModifyInstanceAttributeResponse> modifyInstanceAttribute(ModifyInstanceAttributeRequest request);

    /**
     * @param request the request parameters of ModifyInstanceSpec  ModifyInstanceSpecRequest
     * @return ModifyInstanceSpecResponse
     */
    CompletableFuture<ModifyInstanceSpecResponse> modifyInstanceSpec(ModifyInstanceSpecRequest request);

    /**
     * @param request the request parameters of ModifyInstanceVpcAttributeForConsole  ModifyInstanceVpcAttributeForConsoleRequest
     * @return ModifyInstanceVpcAttributeForConsoleResponse
     */
    CompletableFuture<ModifyInstanceVpcAttributeForConsoleResponse> modifyInstanceVpcAttributeForConsole(ModifyInstanceVpcAttributeForConsoleRequest request);

    /**
     * @param request the request parameters of ModifyIntranetDomainPolicy  ModifyIntranetDomainPolicyRequest
     * @return ModifyIntranetDomainPolicyResponse
     */
    CompletableFuture<ModifyIntranetDomainPolicyResponse> modifyIntranetDomainPolicy(ModifyIntranetDomainPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API providers.</p>
     * <ul>
     * <li>This operation allows you to modify only the name and description of an ACL. You cannot modify the type of the ACL.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyIpControl  ModifyIpControlRequest
     * @return ModifyIpControlResponse
     */
    CompletableFuture<ModifyIpControlResponse> modifyIpControl(ModifyIpControlRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API providers.</p>
     * <ul>
     * <li>The modification immediately takes effect on all the APIs that are bound to the policy.</li>
     * <li>This operation causes a full modification of the content of a policy.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyIpControlPolicyItem  ModifyIpControlPolicyItemRequest
     * @return ModifyIpControlPolicyItemResponse
     */
    CompletableFuture<ModifyIpControlPolicyItemResponse> modifyIpControlPolicyItem(ModifyIpControlPolicyItemRequest request);

    /**
     * @param request the request parameters of ModifyLogConfig  ModifyLogConfigRequest
     * @return ModifyLogConfigResponse
     */
    CompletableFuture<ModifyLogConfigResponse> modifyLogConfig(ModifyLogConfigRequest request);

    /**
     * @param request the request parameters of ModifyModel  ModifyModelRequest
     * @return ModifyModelResponse
     */
    CompletableFuture<ModifyModelResponse> modifyModel(ModifyModelRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API providers.</p>
     * <ul>
     * <li>The name of the plug-in must be unique.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyPlugin  ModifyPluginRequest
     * @return ModifyPluginResponse
     */
    CompletableFuture<ModifyPluginResponse> modifyPlugin(ModifyPluginRequest request);

    /**
     * <b>description</b> :
     * <p>  This API is intended for API providers.</p>
     * <ul>
     * <li>This API operation modifies the name, Key value, and Secret value of an existing signature key.</li>
     * <li>Note that the modification takes effect immediately. If the key has been bound to an API, you must adjust the backend signature verification based on the new key accordingly.</li>
     * <li>The QPS limit on this operation is 50 per user.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifySignature  ModifySignatureRequest
     * @return ModifySignatureResponse
     */
    CompletableFuture<ModifySignatureResponse> modifySignature(ModifySignatureRequest request);

    /**
     * <b>description</b> :
     * <p>  This API is intended for API providers.</p>
     * <ul>
     * <li>The modifications take effect on the bound APIs instantly.</li>
     * <li>The QPS limit on this operation is 50 per user.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyTrafficControl  ModifyTrafficControlRequest
     * @return ModifyTrafficControlResponse
     */
    CompletableFuture<ModifyTrafficControlResponse> modifyTrafficControl(ModifyTrafficControlRequest request);

    /**
     * @param request the request parameters of ModifyVpcAccessAndUpdateApis  ModifyVpcAccessAndUpdateApisRequest
     * @return ModifyVpcAccessAndUpdateApisResponse
     */
    CompletableFuture<ModifyVpcAccessAndUpdateApisResponse> modifyVpcAccessAndUpdateApis(ModifyVpcAccessAndUpdateApisRequest request);

    /**
     * @param request the request parameters of OpenApiGatewayService  OpenApiGatewayServiceRequest
     * @return OpenApiGatewayServiceResponse
     */
    CompletableFuture<OpenApiGatewayServiceResponse> openApiGatewayService(OpenApiGatewayServiceRequest request);

    /**
     * @param request the request parameters of QueryRequestLogs  QueryRequestLogsRequest
     * @return QueryRequestLogsResponse
     */
    CompletableFuture<QueryRequestLogsResponse> queryRequestLogs(QueryRequestLogsRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API providers.</p>
     * <ul>
     * <li>You must solve the problem that is mentioned in the domain name exception prompt before you can reactivate the domain name.</li>
     * <li>A typical reason why a custom domain name becomes abnormal is that the domain name does not have an ICP filing or the domain name is included in a blacklist by the administration. When a custom domain name is abnormal, users cannot use it to call APIs.</li>
     * <li>You can call this operation to reactivate the domain name to resume normal access.</li>
     * </ul>
     * 
     * @param request the request parameters of ReactivateDomain  ReactivateDomainRequest
     * @return ReactivateDomainResponse
     */
    CompletableFuture<ReactivateDomainResponse> reactivateDomain(ReactivateDomainRequest request);

    /**
     * @param request the request parameters of RemoveAccessControlListEntry  RemoveAccessControlListEntryRequest
     * @return RemoveAccessControlListEntryResponse
     */
    CompletableFuture<RemoveAccessControlListEntryResponse> removeAccessControlListEntry(RemoveAccessControlListEntryRequest request);

    /**
     * @param request the request parameters of RemoveApiProductsAuthorities  RemoveApiProductsAuthoritiesRequest
     * @return RemoveApiProductsAuthoritiesResponse
     */
    CompletableFuture<RemoveApiProductsAuthoritiesResponse> removeApiProductsAuthorities(RemoveApiProductsAuthoritiesRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API providers and callers.</p>
     * <ul>
     * <li>Before you revoke access permissions, check by whom the permissions were granted. API providers can only revoke permissions granted by a Provider, and API callers can only revoke permissions granted by a Consumer.</li>
     * </ul>
     * 
     * @param request the request parameters of RemoveApisAuthorities  RemoveApisAuthoritiesRequest
     * @return RemoveApisAuthoritiesResponse
     */
    CompletableFuture<RemoveApisAuthoritiesResponse> removeApisAuthorities(RemoveApisAuthoritiesRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API providers and callers.</p>
     * <ul>
     * <li>Before you revoke access permissions, check by whom the permissions were granted. API providers can only revoke permissions granted by a Provider, and API callers can only revoke permissions granted by a Consumer.</li>
     * </ul>
     * 
     * @param request the request parameters of RemoveAppsAuthorities  RemoveAppsAuthoritiesRequest
     * @return RemoveAppsAuthoritiesResponse
     */
    CompletableFuture<RemoveAppsAuthoritiesResponse> removeAppsAuthorities(RemoveAppsAuthoritiesRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API callers.</p>
     * <ul>
     * <li>The unbinding takes effect immediately. After the API is unbound from the ACL, the corresponding environment does not have any IP address access control in place for the API.</li>
     * </ul>
     * 
     * @param request the request parameters of RemoveIpControlApis  RemoveIpControlApisRequest
     * @return RemoveIpControlApisResponse
     */
    CompletableFuture<RemoveIpControlApisResponse> removeIpControlApis(RemoveIpControlApisRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API providers.</p>
     * 
     * @param request the request parameters of RemoveIpControlPolicyItem  RemoveIpControlPolicyItemRequest
     * @return RemoveIpControlPolicyItemResponse
     */
    CompletableFuture<RemoveIpControlPolicyItemResponse> removeIpControlPolicyItem(RemoveIpControlPolicyItemRequest request);

    /**
     * <b>description</b> :
     * <p>  This API is intended for API providers.</p>
     * <ul>
     * <li>The operation takes effect immediately. The request sent from API Gateway to the backend service does not contain the signature string. The corresponding verification step can be removed from the backend.</li>
     * </ul>
     * 
     * @param request the request parameters of RemoveSignatureApis  RemoveSignatureApisRequest
     * @return RemoveSignatureApisResponse
     */
    CompletableFuture<RemoveSignatureApisResponse> removeSignatureApis(RemoveSignatureApisRequest request);

    /**
     * <b>description</b> :
     * <p>  This API is intended for API providers.</p>
     * <ul>
     * <li>This API allows you to unbind a specified throttling policy from up to 100 APIs at a time.</li>
     * </ul>
     * 
     * @param request the request parameters of RemoveTrafficControlApis  RemoveTrafficControlApisRequest
     * @return RemoveTrafficControlApisResponse
     */
    CompletableFuture<RemoveTrafficControlApisResponse> removeTrafficControlApis(RemoveTrafficControlApisRequest request);

    /**
     * <b>description</b> :
     * <p>  This API is intended for API providers.</p>
     * <ul>
     * <li>Revokes the permissions of API Gateway to access your VPC instance.<blockquote>
     * <p> Deleting an authorization affects the associated API. Before you delete the authorization, make sure that it is not used by the API.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of RemoveVpcAccess  RemoveVpcAccessRequest
     * @return RemoveVpcAccessResponse
     */
    CompletableFuture<RemoveVpcAccessResponse> removeVpcAccess(RemoveVpcAccessRequest request);

    /**
     * @param request the request parameters of RemoveVpcAccessAndAbolishApis  RemoveVpcAccessAndAbolishApisRequest
     * @return RemoveVpcAccessAndAbolishApisResponse
     */
    CompletableFuture<RemoveVpcAccessAndAbolishApisResponse> removeVpcAccessAndAbolishApis(RemoveVpcAccessAndAbolishApisRequest request);

    /**
     * @param request the request parameters of ResetAppCode  ResetAppCodeRequest
     * @return ResetAppCodeResponse
     */
    CompletableFuture<ResetAppCodeResponse> resetAppCode(ResetAppCodeRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API callers.</p>
     * <ul>
     * <li>A new secret is automatically generated after you have called this operation. This secret cannot be customized.</li>
     * <li>The results returned by this operation do not contain the application secret. You can obtain the secret by calling DescribeAppSecurity.</li>
     * </ul>
     * 
     * @param request the request parameters of ResetAppSecret  ResetAppSecretRequest
     * @return ResetAppSecretResponse
     */
    CompletableFuture<ResetAppSecretResponse> resetAppSecret(ResetAppSecretRequest request);

    /**
     * @param request the request parameters of SdkGenerateByApp  SdkGenerateByAppRequest
     * @return SdkGenerateByAppResponse
     */
    CompletableFuture<SdkGenerateByAppResponse> sdkGenerateByApp(SdkGenerateByAppRequest request);

    /**
     * @param request the request parameters of SdkGenerateByAppForRegion  SdkGenerateByAppForRegionRequest
     * @return SdkGenerateByAppForRegionResponse
     */
    CompletableFuture<SdkGenerateByAppForRegionResponse> sdkGenerateByAppForRegion(SdkGenerateByAppForRegionRequest request);

    /**
     * @param request the request parameters of SdkGenerateByGroup  SdkGenerateByGroupRequest
     * @return SdkGenerateByGroupResponse
     */
    CompletableFuture<SdkGenerateByGroupResponse> sdkGenerateByGroup(SdkGenerateByGroupRequest request);

    /**
     * @param request the request parameters of SetAccessControlListAttribute  SetAccessControlListAttributeRequest
     * @return SetAccessControlListAttributeResponse
     */
    CompletableFuture<SetAccessControlListAttributeResponse> setAccessControlListAttribute(SetAccessControlListAttributeRequest request);

    /**
     * @param request the request parameters of SetApiProductsAuthorities  SetApiProductsAuthoritiesRequest
     * @return SetApiProductsAuthoritiesResponse
     */
    CompletableFuture<SetApiProductsAuthoritiesResponse> setApiProductsAuthorities(SetApiProductsAuthoritiesRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API providers and callers.</p>
     * <ul>
     * <li>API providers can authorize all applications to call their APIs.</li>
     * <li>API callers can authorize their own applications to call the APIs that they have purchased.</li>
     * </ul>
     * 
     * @param request the request parameters of SetApisAuthorities  SetApisAuthoritiesRequest
     * @return SetApisAuthoritiesResponse
     */
    CompletableFuture<SetApisAuthoritiesResponse> setApisAuthorities(SetApisAuthoritiesRequest request);

    /**
     * @param request the request parameters of SetAppsAuthToApiProduct  SetAppsAuthToApiProductRequest
     * @return SetAppsAuthToApiProductResponse
     */
    CompletableFuture<SetAppsAuthToApiProductResponse> setAppsAuthToApiProduct(SetAppsAuthToApiProductRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API providers and callers.</p>
     * <ul>
     * <li>API providers can authorize all applications to call their APIs.</li>
     * <li>API callers can authorize their own applications to call the APIs that they have purchased.</li>
     * </ul>
     * 
     * @param request the request parameters of SetAppsAuthorities  SetAppsAuthoritiesRequest
     * @return SetAppsAuthoritiesResponse
     */
    CompletableFuture<SetAppsAuthoritiesResponse> setAppsAuthorities(SetAppsAuthoritiesRequest request);

    /**
     * @param request the request parameters of SetDomain  SetDomainRequest
     * @return SetDomainResponse
     */
    CompletableFuture<SetDomainResponse> setDomain(SetDomainRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API providers.</p>
     * <ul>
     * <li>The SSL certificate must match the custom domain name.</li>
     * <li>After the SSL certificate is bound, HTTPS-based API services become available.</li>
     * </ul>
     * 
     * @param request the request parameters of SetDomainCertificate  SetDomainCertificateRequest
     * @return SetDomainCertificateResponse
     */
    CompletableFuture<SetDomainCertificateResponse> setDomainCertificate(SetDomainCertificateRequest request);

    /**
     * @param request the request parameters of SetDomainWebSocketStatus  SetDomainWebSocketStatusRequest
     * @return SetDomainWebSocketStatusResponse
     */
    CompletableFuture<SetDomainWebSocketStatusResponse> setDomainWebSocketStatus(SetDomainWebSocketStatusRequest request);

    /**
     * @param request the request parameters of SetGroupAuthAppCode  SetGroupAuthAppCodeRequest
     * @return SetGroupAuthAppCodeResponse
     */
    CompletableFuture<SetGroupAuthAppCodeResponse> setGroupAuthAppCode(SetGroupAuthAppCodeRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is intended for API callers.</p>
     * <ul>
     * <li>A maximum of 100 APIs can be bound at a time.</li>
     * </ul>
     * 
     * @param request the request parameters of SetIpControlApis  SetIpControlApisRequest
     * @return SetIpControlApisResponse
     */
    CompletableFuture<SetIpControlApisResponse> setIpControlApis(SetIpControlApisRequest request);

    /**
     * @param request the request parameters of SetSignatureApis  SetSignatureApisRequest
     * @return SetSignatureApisResponse
     */
    CompletableFuture<SetSignatureApisResponse> setSignatureApis(SetSignatureApisRequest request);

    /**
     * <b>description</b> :
     * <p>  This API is intended for API providers.</p>
     * <ul>
     * <li>This API allows you to bind a specific throttling policy to up to 100 APIs at a time.</li>
     * </ul>
     * 
     * @param request the request parameters of SetTrafficControlApis  SetTrafficControlApisRequest
     * @return SetTrafficControlApisResponse
     */
    CompletableFuture<SetTrafficControlApisResponse> setTrafficControlApis(SetTrafficControlApisRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is intended for API providers.</p>
     * <ul>
     * <li>This operation is used to authorize API Gateway to access your VPC instance.</li>
     * </ul>
     * 
     * @param request the request parameters of SetVpcAccess  SetVpcAccessRequest
     * @return SetVpcAccessResponse
     */
    CompletableFuture<SetVpcAccessResponse> setVpcAccess(SetVpcAccessRequest request);

    /**
     * @param request the request parameters of SetWildcardDomainPatterns  SetWildcardDomainPatternsRequest
     * @return SetWildcardDomainPatternsResponse
     */
    CompletableFuture<SetWildcardDomainPatternsResponse> setWildcardDomainPatterns(SetWildcardDomainPatternsRequest request);

    /**
     * @param request the request parameters of SwitchApi  SwitchApiRequest
     * @return SwitchApiResponse
     */
    CompletableFuture<SwitchApiResponse> switchApi(SwitchApiRequest request);

    /**
     * <b>description</b> :
     * <p>  All tags (key-value pairs) are applied to all resources of a specified ResourceId, with each resource specified as ResourceId.N.</p>
     * <ul>
     * <li>Tag.N is a resource tag consisting of a key-value pair: Tag.N.Key and Tag.N.Value.</li>
     * <li>If you call this operation to tag multiple resources simultaneously, either all or none of the resources will be tagged.</li>
     * <li>If you specify Tag.1.Value in addition to required parameters, you must also specify Tag.1.Key. Otherwise, an InvalidParameter.TagKey error is reported. A tag that has a value must have the corresponding key, but the key can be an empty string.</li>
     * <li>If a tag with the same key has been bound to a resource, the new tag will overwrite the existing one.</li>
     * </ul>
     * 
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>  If you call this operation to untag multiple resources simultaneously, either all or none of the resources will be untagged.</p>
     * <ul>
     * <li>If you specify resource IDs without specifying tag keys and set the All parameter to true, all tags bound to the specified resources will be deleted. If a resource does not have any tags, the request is not processed but a success is returned.</li>
     * <li>If you specify resource IDs without specifying tag keys and set the All parameter to false, the request is not processed but a success is returned.</li>
     * <li>When tag keys are specified, the All parameter is invalid.</li>
     * <li>When multiple resources and key-value pairs are specified, the specified tags bound to the resources are deleted.</li>
     * </ul>
     * 
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
     * @param request the request parameters of UpdatePrivateDNS  UpdatePrivateDNSRequest
     * @return UpdatePrivateDNSResponse
     */
    CompletableFuture<UpdatePrivateDNSResponse> updatePrivateDNS(UpdatePrivateDNSRequest request);

    /**
     * @param request the request parameters of ValidateVpcConnectivity  ValidateVpcConnectivityRequest
     * @return ValidateVpcConnectivityResponse
     */
    CompletableFuture<ValidateVpcConnectivityResponse> validateVpcConnectivity(ValidateVpcConnectivityRequest request);

}
