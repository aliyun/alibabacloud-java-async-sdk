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
     * @param request the request parameters of CheckCreateLindormV2Instance  CheckCreateLindormV2InstanceRequest
     * @return CheckCreateLindormV2InstanceResponse
     */
    CompletableFuture<CheckCreateLindormV2InstanceResponse> checkCreateLindormV2Instance(CheckCreateLindormV2InstanceRequest request);

    /**
     * @param request the request parameters of CheckLdpsColumnarIndexStatus  CheckLdpsColumnarIndexStatusRequest
     * @return CheckLdpsColumnarIndexStatusResponse
     */
    CompletableFuture<CheckLdpsColumnarIndexStatusResponse> checkLdpsColumnarIndexStatus(CheckLdpsColumnarIndexStatusRequest request);

    /**
     * @param request the request parameters of CreateAdditionalVpcLink  CreateAdditionalVpcLinkRequest
     * @return CreateAdditionalVpcLinkResponse
     */
    CompletableFuture<CreateAdditionalVpcLinkResponse> createAdditionalVpcLink(CreateAdditionalVpcLinkRequest request);

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
     * <p>When you create an instance, you must select at least one data engine.
     * For example, to create a LindormTable engine, you must specify both the <strong>LindormNum</strong> (number of LindormTable engine nodes) and <strong>LindormSpec</strong> (LindormTable engine node specifications) parameters. For more information about data engines and storage specifications, see <a href="https://help.aliyun.com/document_detail/174643.html">How to select a data engine</a> and <a href="https://help.aliyun.com/document_detail/181971.html">How to select a storage specification</a>.</p>
     * <blockquote>
     * <p>Notice: If you do not specify data engine parameters when creating an instance, the API invoke will fail.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateLindormInstance  CreateLindormInstanceRequest
     * @return CreateLindormInstanceResponse
     */
    CompletableFuture<CreateLindormInstanceResponse> createLindormInstance(CreateLindormInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>You must select at least one data engine when you create an instance. For more information about data engines and storage specifications, see <a href="https://help.aliyun.com/document_detail/174643.html">How to select a data engine</a> and <a href="https://help.aliyun.com/document_detail/181971.html">How to select a storage specification</a>.</p>
     * <blockquote>
     * <p>Notice: If you do not specify the data engine parameter when you create an instance, the API call fails.</p>
     * </blockquote>
     * 
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
     * @param request the request parameters of GetComputeEngineJobDetail  GetComputeEngineJobDetailRequest
     * @return GetComputeEngineJobDetailResponse
     */
    CompletableFuture<GetComputeEngineJobDetailResponse> getComputeEngineJobDetail(GetComputeEngineJobDetailRequest request);

    /**
     * @param request the request parameters of GetComputeEngineJobLog  GetComputeEngineJobLogRequest
     * @return GetComputeEngineJobLogResponse
     */
    CompletableFuture<GetComputeEngineJobLogResponse> getComputeEngineJobLog(GetComputeEngineJobLogRequest request);

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
     * @param request the request parameters of GetInstanceSummary  GetInstanceSummaryRequest
     * @return GetInstanceSummaryResponse
     */
    CompletableFuture<GetInstanceSummaryResponse> getInstanceSummary(GetInstanceSummaryRequest request);

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
     * @param request the request parameters of GetLindormEngineConfig  GetLindormEngineConfigRequest
     * @return GetLindormEngineConfigResponse
     */
    CompletableFuture<GetLindormEngineConfigResponse> getLindormEngineConfig(GetLindormEngineConfigRequest request);

    /**
     * <b>description</b> :
     * <p>For Lindorm clusters with an underlying storage version of 4.1.9 or later, refer to the list values returned by LStorageUsageList for storage usage details.</p>
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
     * <b>description</b> :
     * <p>For Lindorm clusters with an underlying storage version of 4.1.9 or later, refer to the list values returned by LStorageUsageList for storage usage details.</p>
     * 
     * @param request the request parameters of GetLindormV2InstanceDetails  GetLindormV2InstanceDetailsRequest
     * @return GetLindormV2InstanceDetailsResponse
     */
    CompletableFuture<GetLindormV2InstanceDetailsResponse> getLindormV2InstanceDetails(GetLindormV2InstanceDetailsRequest request);

    /**
     * @param request the request parameters of GetLindormV2InstanceEngineList  GetLindormV2InstanceEngineListRequest
     * @return GetLindormV2InstanceEngineListResponse
     */
    CompletableFuture<GetLindormV2InstanceEngineListResponse> getLindormV2InstanceEngineList(GetLindormV2InstanceEngineListRequest request);

    /**
     * @param request the request parameters of GetLindormV2InstanceForTerraform  GetLindormV2InstanceForTerraformRequest
     * @return GetLindormV2InstanceForTerraformResponse
     */
    CompletableFuture<GetLindormV2InstanceForTerraformResponse> getLindormV2InstanceForTerraform(GetLindormV2InstanceForTerraformRequest request);

    /**
     * @param request the request parameters of GetLindormV2InstanceSecurityGroups  GetLindormV2InstanceSecurityGroupsRequest
     * @return GetLindormV2InstanceSecurityGroupsResponse
     */
    CompletableFuture<GetLindormV2InstanceSecurityGroupsResponse> getLindormV2InstanceSecurityGroups(GetLindormV2InstanceSecurityGroupsRequest request);

    /**
     * @param request the request parameters of GetLindormV2StorageUsage  GetLindormV2StorageUsageRequest
     * @return GetLindormV2StorageUsageResponse
     */
    CompletableFuture<GetLindormV2StorageUsageResponse> getLindormV2StorageUsage(GetLindormV2StorageUsageRequest request);

    /**
     * @param request the request parameters of GetLindormV2StreamEngineInfo  GetLindormV2StreamEngineInfoRequest
     * @return GetLindormV2StreamEngineInfoResponse
     */
    CompletableFuture<GetLindormV2StreamEngineInfoResponse> getLindormV2StreamEngineInfo(GetLindormV2StreamEngineInfoRequest request);

    /**
     * @param request the request parameters of KillQuery  KillQueryRequest
     * @return KillQueryResponse
     */
    CompletableFuture<KillQueryResponse> killQuery(KillQueryRequest request);

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
     * @param request the request parameters of ListComputeEngineJob  ListComputeEngineJobRequest
     * @return ListComputeEngineJobResponse
     */
    CompletableFuture<ListComputeEngineJobResponse> listComputeEngineJob(ListComputeEngineJobRequest request);

    /**
     * @param request the request parameters of ListHBaseQuotas  ListHBaseQuotasRequest
     * @return ListHBaseQuotasResponse
     */
    CompletableFuture<ListHBaseQuotasResponse> listHBaseQuotas(ListHBaseQuotasRequest request);

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
     * @param request the request parameters of MigrateSingleZoneToMultiZone  MigrateSingleZoneToMultiZoneRequest
     * @return MigrateSingleZoneToMultiZoneResponse
     */
    CompletableFuture<MigrateSingleZoneToMultiZoneResponse> migrateSingleZoneToMultiZone(MigrateSingleZoneToMultiZoneRequest request);

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
     * <p>Adjusts the billing method of an instance. You can switch between the subscription and pay-as-you-go billing methods.
     * Before you call this operation, make sure that you fully understand the billing methods and &lt;props=&quot;china&quot;&gt;<a href="https://www.aliyun.com/price/product?spm=openapi-amp.newDocPublishment.0.0.6345281fu63xJ3#/hitsdb/detail/hitsdb_lindormpre_public_cn">pricing</a> of Lindorm. Published only on the China site.
     * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/zh/pricing-calculator?_p_lc=1&spm=a2796.7960336.3034855210.1.7396b91aC5VjZ7#/commodity/vm_intl">pricing</a>. Published only on the International site.</p>
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
     * @param request the request parameters of ModifyLindormV2InstanceSecurityGroups  ModifyLindormV2InstanceSecurityGroupsRequest
     * @return ModifyLindormV2InstanceSecurityGroupsResponse
     */
    CompletableFuture<ModifyLindormV2InstanceSecurityGroupsResponse> modifyLindormV2InstanceSecurityGroups(ModifyLindormV2InstanceSecurityGroupsRequest request);

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
     * @param request the request parameters of OpenLdpsColumnarIndex  OpenLdpsColumnarIndexRequest
     * @return OpenLdpsColumnarIndexResponse
     */
    CompletableFuture<OpenLdpsColumnarIndexResponse> openLdpsColumnarIndex(OpenLdpsColumnarIndexRequest request);

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
     * <p>Renews a subscription instance. The renewal period can be measured in months or years. The renewal duration ranges from 1 to 9 months or 1 to 3 years. Before you call this operation, make sure that you fully understand the billing methods and pricing of Lindorm.</p>
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
     * @param request the request parameters of SetHBaseQuotas  SetHBaseQuotasRequest
     * @return SetHBaseQuotasResponse
     */
    CompletableFuture<SetHBaseQuotasResponse> setHBaseQuotas(SetHBaseQuotasRequest request);

    /**
     * @param request the request parameters of ShowProcessList  ShowProcessListRequest
     * @return ShowProcessListResponse
     */
    CompletableFuture<ShowProcessListResponse> showProcessList(ShowProcessListRequest request);

    /**
     * <b>description</b> :
     * <p>Before you begin:</p>
     * <ul>
     * <li>The LindormTable database engine version number must be 2.6.0 or later.</li>
     * <li>The LindormTable DPI engine must support LindormSQL V3. You can check this by verifying that the EnableLsqlVersionV3 field in the response of the GetLindormInstance operation is set to true. Instances purchased after October 24, 2023 support EnableLsqlVersionV3=true by default. For existing instances, contact technical support for evaluation before enabling this feature.
     * Both conditions must be met before you can enable the MySQL-compatible protocol. You can call the <a href="https://help.aliyun.com/document_detail/2056440.html">GetLindormInstance</a> operation to view instance details.</li>
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
     * <p>If a tag is not attached to any Lindorm instance, the tag is deleted.</p>
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
     * <b>description</b> :
     * <p>When you create an instance, select at least one data engine.
     * For example, to create a LindormTable engine, you must specify both the <strong>LindormNum</strong> (number of LindormTable engine nodes) and <strong>LindormSpec</strong> (LindormTable engine node specifications) parameters. For more information about data engines and storage specifications, see <a href="https://help.aliyun.com/document_detail/174643.html">How to select a data engine</a> and <a href="https://help.aliyun.com/document_detail/181971.html">How to select storage specifications</a>.</p>
     * <blockquote>
     * <p>Notice: If you do not specify data engine parameters when creating an instance, the API call fails.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UpdateLindormInstanceAttribute  UpdateLindormInstanceAttributeRequest
     * @return UpdateLindormInstanceAttributeResponse
     */
    CompletableFuture<UpdateLindormInstanceAttributeResponse> updateLindormInstanceAttribute(UpdateLindormInstanceAttributeRequest request);

    /**
     * @param request the request parameters of UpdateLindormV2Instance  UpdateLindormV2InstanceRequest
     * @return UpdateLindormV2InstanceResponse
     */
    CompletableFuture<UpdateLindormV2InstanceResponse> updateLindormV2Instance(UpdateLindormV2InstanceRequest request);

    /**
     * @param request the request parameters of UpdateLindormV2InstanceParameter  UpdateLindormV2InstanceParameterRequest
     * @return UpdateLindormV2InstanceParameterResponse
     */
    CompletableFuture<UpdateLindormV2InstanceParameterResponse> updateLindormV2InstanceParameter(UpdateLindormV2InstanceParameterRequest request);

    /**
     * @param request the request parameters of UpdateLindormV2WhiteIpList  UpdateLindormV2WhiteIpListRequest
     * @return UpdateLindormV2WhiteIpListResponse
     */
    CompletableFuture<UpdateLindormV2WhiteIpListResponse> updateLindormV2WhiteIpList(UpdateLindormV2WhiteIpListRequest request);

    /**
     * <b>description</b> :
     * <p>For information about data engines and storage specifications of Lindorm instances, see <a href="https://help.aliyun.com/document_detail/174643.html">How to select a data engine</a> and <a href="https://help.aliyun.com/document_detail/181971.html">How to select a storage specification</a>.</p>
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
