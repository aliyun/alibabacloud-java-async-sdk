// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20200615;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.hitsdb20200615.models.*;
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
     * @param request the request parameters of ChangeResourceGroup  ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    /**
     * @param request the request parameters of CheckLdpsColumnarIndexStatus  CheckLdpsColumnarIndexStatusRequest
     * @return CheckLdpsColumnarIndexStatusResponse
     */
    CompletableFuture<CheckLdpsColumnarIndexStatusResponse> checkLdpsColumnarIndexStatus(CheckLdpsColumnarIndexStatusRequest request);

    /**
     * @param request the request parameters of CreateAutoScalingConfig  CreateAutoScalingConfigRequest
     * @return CreateAutoScalingConfigResponse
     */
    CompletableFuture<CreateAutoScalingConfigResponse> createAutoScalingConfig(CreateAutoScalingConfigRequest request);

    /**
     * @param request the request parameters of CreateAutoScalingRule  CreateAutoScalingRuleRequest
     * @return CreateAutoScalingRuleResponse
     */
    CompletableFuture<CreateAutoScalingRuleResponse> createAutoScalingRule(CreateAutoScalingRuleRequest request);

    /**
     * @param request the request parameters of CreateLdpsComputeGroup  CreateLdpsComputeGroupRequest
     * @return CreateLdpsComputeGroupResponse
     */
    CompletableFuture<CreateLdpsComputeGroupResponse> createLdpsComputeGroup(CreateLdpsComputeGroupRequest request);

    /**
     * <b>description</b> :
     * <p>You must select at least one engine when you create a Lindorm instance. For more information about how to select the storage type and engine type when you create a Lindorm instance, see <a href="https://help.aliyun.com/document_detail/181971.html">Select engine types</a> and <a href="https://help.aliyun.com/document_detail/174643.html">Select storage types</a>.</p>
     * 
     * @param request the request parameters of CreateLindormInstance  CreateLindormInstanceRequest
     * @return CreateLindormInstanceResponse
     */
    CompletableFuture<CreateLindormInstanceResponse> createLindormInstance(CreateLindormInstanceRequest request);

    /**
     * @param request the request parameters of CreateLindormV2Instance  CreateLindormV2InstanceRequest
     * @return CreateLindormV2InstanceResponse
     */
    CompletableFuture<CreateLindormV2InstanceResponse> createLindormV2Instance(CreateLindormV2InstanceRequest request);

    /**
     * @param request the request parameters of DeleteAutoScalingConfig  DeleteAutoScalingConfigRequest
     * @return DeleteAutoScalingConfigResponse
     */
    CompletableFuture<DeleteAutoScalingConfigResponse> deleteAutoScalingConfig(DeleteAutoScalingConfigRequest request);

    /**
     * @param request the request parameters of DeleteAutoScalingRule  DeleteAutoScalingRuleRequest
     * @return DeleteAutoScalingRuleResponse
     */
    CompletableFuture<DeleteAutoScalingRuleResponse> deleteAutoScalingRule(DeleteAutoScalingRuleRequest request);

    /**
     * @param request the request parameters of DeleteCustomResource  DeleteCustomResourceRequest
     * @return DeleteCustomResourceResponse
     */
    CompletableFuture<DeleteCustomResourceResponse> deleteCustomResource(DeleteCustomResourceRequest request);

    /**
     * @param request the request parameters of DeleteLdpsComputeGroup  DeleteLdpsComputeGroupRequest
     * @return DeleteLdpsComputeGroupResponse
     */
    CompletableFuture<DeleteLdpsComputeGroupResponse> deleteLdpsComputeGroup(DeleteLdpsComputeGroupRequest request);

    /**
     * @param request the request parameters of DeployLdpsSemiManagedComponent  DeployLdpsSemiManagedComponentRequest
     * @return DeployLdpsSemiManagedComponentResponse
     */
    CompletableFuture<DeployLdpsSemiManagedComponentResponse> deployLdpsSemiManagedComponent(DeployLdpsSemiManagedComponentRequest request);

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * @param request the request parameters of GetAutoScalingConfig  GetAutoScalingConfigRequest
     * @return GetAutoScalingConfigResponse
     */
    CompletableFuture<GetAutoScalingConfigResponse> getAutoScalingConfig(GetAutoScalingConfigRequest request);

    /**
     * @param request the request parameters of GetAutoScalingRule  GetAutoScalingRuleRequest
     * @return GetAutoScalingRuleResponse
     */
    CompletableFuture<GetAutoScalingRuleResponse> getAutoScalingRule(GetAutoScalingRuleRequest request);

    /**
     * @param request the request parameters of GetClientSourceIp  GetClientSourceIpRequest
     * @return GetClientSourceIpResponse
     */
    CompletableFuture<GetClientSourceIpResponse> getClientSourceIp(GetClientSourceIpRequest request);

    /**
     * @param request the request parameters of GetEngineDefaultAuth  GetEngineDefaultAuthRequest
     * @return GetEngineDefaultAuthResponse
     */
    CompletableFuture<GetEngineDefaultAuthResponse> getEngineDefaultAuth(GetEngineDefaultAuthRequest request);

    /**
     * @param request the request parameters of GetInstanceIpWhiteList  GetInstanceIpWhiteListRequest
     * @return GetInstanceIpWhiteListResponse
     */
    CompletableFuture<GetInstanceIpWhiteListResponse> getInstanceIpWhiteList(GetInstanceIpWhiteListRequest request);

    /**
     * @param request the request parameters of GetInstanceSecurityGroups  GetInstanceSecurityGroupsRequest
     * @return GetInstanceSecurityGroupsResponse
     */
    CompletableFuture<GetInstanceSecurityGroupsResponse> getInstanceSecurityGroups(GetInstanceSecurityGroupsRequest request);

    /**
     * @param request the request parameters of GetLdpsComputeGroup  GetLdpsComputeGroupRequest
     * @return GetLdpsComputeGroupResponse
     */
    CompletableFuture<GetLdpsComputeGroupResponse> getLdpsComputeGroup(GetLdpsComputeGroupRequest request);

    /**
     * @param request the request parameters of GetLdpsNamespacedQuota  GetLdpsNamespacedQuotaRequest
     * @return GetLdpsNamespacedQuotaResponse
     */
    CompletableFuture<GetLdpsNamespacedQuotaResponse> getLdpsNamespacedQuota(GetLdpsNamespacedQuotaRequest request);

    /**
     * @param request the request parameters of GetLdpsResourceCost  GetLdpsResourceCostRequest
     * @return GetLdpsResourceCostResponse
     */
    CompletableFuture<GetLdpsResourceCostResponse> getLdpsResourceCost(GetLdpsResourceCostRequest request);

    /**
     * <b>description</b> :
     * <p>If the version of the underlying storage engine in a Lindorm cluster is 4.1.9 or later, the storage usage values returned for the LStorageUsageList parameter prevail.</p>
     * 
     * @param request the request parameters of GetLindormFsUsedDetail  GetLindormFsUsedDetailRequest
     * @return GetLindormFsUsedDetailResponse
     */
    CompletableFuture<GetLindormFsUsedDetailResponse> getLindormFsUsedDetail(GetLindormFsUsedDetailRequest request);

    /**
     * @param request the request parameters of GetLindormInstance  GetLindormInstanceRequest
     * @return GetLindormInstanceResponse
     */
    CompletableFuture<GetLindormInstanceResponse> getLindormInstance(GetLindormInstanceRequest request);

    /**
     * @param request the request parameters of GetLindormInstanceEngineList  GetLindormInstanceEngineListRequest
     * @return GetLindormInstanceEngineListResponse
     */
    CompletableFuture<GetLindormInstanceEngineListResponse> getLindormInstanceEngineList(GetLindormInstanceEngineListRequest request);

    /**
     * @param request the request parameters of GetLindormInstanceList  GetLindormInstanceListRequest
     * @return GetLindormInstanceListResponse
     */
    CompletableFuture<GetLindormInstanceListResponse> getLindormInstanceList(GetLindormInstanceListRequest request);

    /**
     * @param request the request parameters of GetLindormV2Instance  GetLindormV2InstanceRequest
     * @return GetLindormV2InstanceResponse
     */
    CompletableFuture<GetLindormV2InstanceResponse> getLindormV2Instance(GetLindormV2InstanceRequest request);

    /**
     * @param request the request parameters of GetLindormV2InstanceEngineList  GetLindormV2InstanceEngineListRequest
     * @return GetLindormV2InstanceEngineListResponse
     */
    CompletableFuture<GetLindormV2InstanceEngineListResponse> getLindormV2InstanceEngineList(GetLindormV2InstanceEngineListRequest request);

    /**
     * @param request the request parameters of GetLindormV2StorageUsage  GetLindormV2StorageUsageRequest
     * @return GetLindormV2StorageUsageResponse
     */
    CompletableFuture<GetLindormV2StorageUsageResponse> getLindormV2StorageUsage(GetLindormV2StorageUsageRequest request);

    /**
     * @param request the request parameters of ListAutoScalingConfigs  ListAutoScalingConfigsRequest
     * @return ListAutoScalingConfigsResponse
     */
    CompletableFuture<ListAutoScalingConfigsResponse> listAutoScalingConfigs(ListAutoScalingConfigsRequest request);

    /**
     * @param request the request parameters of ListAutoScalingRecords  ListAutoScalingRecordsRequest
     * @return ListAutoScalingRecordsResponse
     */
    CompletableFuture<ListAutoScalingRecordsResponse> listAutoScalingRecords(ListAutoScalingRecordsRequest request);

    /**
     * @param request the request parameters of ListAutoScalingRules  ListAutoScalingRulesRequest
     * @return ListAutoScalingRulesResponse
     */
    CompletableFuture<ListAutoScalingRulesResponse> listAutoScalingRules(ListAutoScalingRulesRequest request);

    /**
     * @param request the request parameters of ListLdpsComputeGroups  ListLdpsComputeGroupsRequest
     * @return ListLdpsComputeGroupsResponse
     */
    CompletableFuture<ListLdpsComputeGroupsResponse> listLdpsComputeGroups(ListLdpsComputeGroupsRequest request);

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * @param request the request parameters of ModifyAutoScalingConfig  ModifyAutoScalingConfigRequest
     * @return ModifyAutoScalingConfigResponse
     */
    CompletableFuture<ModifyAutoScalingConfigResponse> modifyAutoScalingConfig(ModifyAutoScalingConfigRequest request);

    /**
     * @param request the request parameters of ModifyAutoScalingRule  ModifyAutoScalingRuleRequest
     * @return ModifyAutoScalingRuleResponse
     */
    CompletableFuture<ModifyAutoScalingRuleResponse> modifyAutoScalingRule(ModifyAutoScalingRuleRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to change the billing method of an instance to subscription or pay-as-you-go.
     * Before you call this operation, make sure that you fully understand the billing methods and <a href="https://www.alibabacloud.com/en/pricing-calculator?spm=a2c63.p38356.0.0.2b024c2adcHeXL&_p_lc=1#/commodity/hitsdb_lindormpre_public_intl">pricing</a> of Lindorm. Published on only international site (alibabacloud.com).</p>
     * 
     * @param request the request parameters of ModifyInstancePayType  ModifyInstancePayTypeRequest
     * @return ModifyInstancePayTypeResponse
     */
    CompletableFuture<ModifyInstancePayTypeResponse> modifyInstancePayType(ModifyInstancePayTypeRequest request);

    /**
     * @param request the request parameters of ModifyLindormV2Instance  ModifyLindormV2InstanceRequest
     * @return ModifyLindormV2InstanceResponse
     */
    CompletableFuture<ModifyLindormV2InstanceResponse> modifyLindormV2Instance(ModifyLindormV2InstanceRequest request);

    /**
     * @param request the request parameters of ModifyLindormV2WhiteIpList  ModifyLindormV2WhiteIpListRequest
     * @return ModifyLindormV2WhiteIpListResponse
     */
    CompletableFuture<ModifyLindormV2WhiteIpListResponse> modifyLindormV2WhiteIpList(ModifyLindormV2WhiteIpListRequest request);

    /**
     * @param request the request parameters of OpenComputeEngine  OpenComputeEngineRequest
     * @return OpenComputeEngineResponse
     */
    CompletableFuture<OpenComputeEngineResponse> openComputeEngine(OpenComputeEngineRequest request);

    /**
     * @param request the request parameters of OpenComputePreCheck  OpenComputePreCheckRequest
     * @return OpenComputePreCheckResponse
     */
    CompletableFuture<OpenComputePreCheckResponse> openComputePreCheck(OpenComputePreCheckRequest request);

    /**
     * @param request the request parameters of ReleaseLindormInstance  ReleaseLindormInstanceRequest
     * @return ReleaseLindormInstanceResponse
     */
    CompletableFuture<ReleaseLindormInstanceResponse> releaseLindormInstance(ReleaseLindormInstanceRequest request);

    /**
     * @param request the request parameters of ReleaseLindormV2Instance  ReleaseLindormV2InstanceRequest
     * @return ReleaseLindormV2InstanceResponse
     */
    CompletableFuture<ReleaseLindormV2InstanceResponse> releaseLindormV2Instance(ReleaseLindormV2InstanceRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to renew a subscription Lindorm instance for 1 to 9 months or 1 to 3 years.
     * Before you call this operation, make sure that you fully understand the billing methods and pricing of Lindorm.</p>
     * 
     * @param request the request parameters of RenewLindormInstance  RenewLindormInstanceRequest
     * @return RenewLindormInstanceResponse
     */
    CompletableFuture<RenewLindormInstanceResponse> renewLindormInstance(RenewLindormInstanceRequest request);

    /**
     * @param request the request parameters of RestartLdpsComputeGroup  RestartLdpsComputeGroupRequest
     * @return RestartLdpsComputeGroupResponse
     */
    CompletableFuture<RestartLdpsComputeGroupResponse> restartLdpsComputeGroup(RestartLdpsComputeGroupRequest request);

    /**
     * @param request the request parameters of SetDefaultOlapComputeGroup  SetDefaultOlapComputeGroupRequest
     * @return SetDefaultOlapComputeGroupResponse
     */
    CompletableFuture<SetDefaultOlapComputeGroupResponse> setDefaultOlapComputeGroup(SetDefaultOlapComputeGroupRequest request);

    /**
     * <b>description</b> :
     * <p>Prerequisites</p>
     * <ul>
     * <li>The LindormTable version of your instance is 2.6.0 or later.</li>
     * <li>The LindormTable of your instance supports LindormSQL V3. The value of the EnableLsqlVersionV3 parameter in the response of the GetLindormInstance operation is true for Lindorm instances purchased after Oct 24, 2023, which indicates that LindormSQL is supported by these instances by default. If you want to enable LindormSQL for instances purchased before Oct 24, 2023, contact the on-duty technical support.
     * You can enable the MySQL compatibility feature for a Lindorm instance only when the instance meets the preceding requirements.</li>
     * </ul>
     * 
     * @param request the request parameters of SwitchLSQLV3MySQLService  SwitchLSQLV3MySQLServiceRequest
     * @return SwitchLSQLV3MySQLServiceResponse
     */
    CompletableFuture<SwitchLSQLV3MySQLServiceResponse> switchLSQLV3MySQLService(SwitchLSQLV3MySQLServiceRequest request);

    /**
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>If a tag is not added to any Lindorm instance, it is deleted.</p>
     * 
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
     * @param request the request parameters of UpdateInstanceIpWhiteList  UpdateInstanceIpWhiteListRequest
     * @return UpdateInstanceIpWhiteListResponse
     */
    CompletableFuture<UpdateInstanceIpWhiteListResponse> updateInstanceIpWhiteList(UpdateInstanceIpWhiteListRequest request);

    /**
     * @param request the request parameters of UpdateInstanceSecurityGroups  UpdateInstanceSecurityGroupsRequest
     * @return UpdateInstanceSecurityGroupsResponse
     */
    CompletableFuture<UpdateInstanceSecurityGroupsResponse> updateInstanceSecurityGroups(UpdateInstanceSecurityGroupsRequest request);

    /**
     * @param request the request parameters of UpdateLdpsComputeGroup  UpdateLdpsComputeGroupRequest
     * @return UpdateLdpsComputeGroupResponse
     */
    CompletableFuture<UpdateLdpsComputeGroupResponse> updateLdpsComputeGroup(UpdateLdpsComputeGroupRequest request);

    /**
     * @param request the request parameters of UpdateLindormV2InstanceParameter  UpdateLindormV2InstanceParameterRequest
     * @return UpdateLindormV2InstanceParameterResponse
     */
    CompletableFuture<UpdateLindormV2InstanceParameterResponse> updateLindormV2InstanceParameter(UpdateLindormV2InstanceParameterRequest request);

    /**
     * <b>description</b> :
     * <p>For more information about how to select the storage type and engine type when you create a Lindorm instance, see <a href="https://help.aliyun.com/document_detail/181971.html">Select engine typpes</a> and <a href="https://help.aliyun.com/document_detail/174643.html">Select storage types</a>.</p>
     * 
     * @param request the request parameters of UpgradeLindormInstance  UpgradeLindormInstanceRequest
     * @return UpgradeLindormInstanceResponse
     */
    CompletableFuture<UpgradeLindormInstanceResponse> upgradeLindormInstance(UpgradeLindormInstanceRequest request);

    /**
     * @param request the request parameters of UpgradeLindormV2StreamEngine  UpgradeLindormV2StreamEngineRequest
     * @return UpgradeLindormV2StreamEngineResponse
     */
    CompletableFuture<UpgradeLindormV2StreamEngineResponse> upgradeLindormV2StreamEngine(UpgradeLindormV2StreamEngineRequest request);

}
