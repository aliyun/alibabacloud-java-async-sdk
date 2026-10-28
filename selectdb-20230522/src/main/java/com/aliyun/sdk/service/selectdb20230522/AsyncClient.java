// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.selectdb20230522;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.selectdb20230522.models.*;
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
     * @param request the request parameters of AllocateInstancePublicConnection  AllocateInstancePublicConnectionRequest
     * @return AllocateInstancePublicConnectionResponse
     */
    CompletableFuture<AllocateInstancePublicConnectionResponse> allocateInstancePublicConnection(AllocateInstancePublicConnectionRequest request);

    /**
     * @param request the request parameters of ChangeResourceGroup  ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    /**
     * @param request the request parameters of CheckCreateDBInstance  CheckCreateDBInstanceRequest
     * @return CheckCreateDBInstanceResponse
     */
    CompletableFuture<CheckCreateDBInstanceResponse> checkCreateDBInstance(CheckCreateDBInstanceRequest request);

    /**
     * @param request the request parameters of CheckIpExistsInSecurityIpList  CheckIpExistsInSecurityIpListRequest
     * @return CheckIpExistsInSecurityIpListResponse
     */
    CompletableFuture<CheckIpExistsInSecurityIpListResponse> checkIpExistsInSecurityIpList(CheckIpExistsInSecurityIpListRequest request);

    /**
     * @param request the request parameters of CheckServiceLinkedRole  CheckServiceLinkedRoleRequest
     * @return CheckServiceLinkedRoleResponse
     */
    CompletableFuture<CheckServiceLinkedRoleResponse> checkServiceLinkedRole(CheckServiceLinkedRoleRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Warning: You can only create pay-as-you-go clusters for pay-as-you-go instances. You can create clusters of either billing method for subscription instances.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateDBCluster  CreateDBClusterRequest
     * @return CreateDBClusterResponse
     */
    CompletableFuture<CreateDBClusterResponse> createDBCluster(CreateDBClusterRequest request);

    /**
     * <b>description</b> :
     * <p>Only instances deployed in zone-disaster recovery mode support this operation. The following conditions must be met:</p>
     * <ul>
     * <li>The clusters must be located in different zones.</li>
     * <li>The billing methods of the clusters must be the same.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateDBClusterBinding  CreateDBClusterBindingRequest
     * @return CreateDBClusterBindingResponse
     */
    CompletableFuture<CreateDBClusterBindingResponse> createDBClusterBinding(CreateDBClusterBindingRequest request);

    /**
     * <b>description</b> :
     * <p>Subscription instances cannot be deleted.</p>
     * 
     * @param request the request parameters of CreateDBInstance  CreateDBInstanceRequest
     * @return CreateDBInstanceResponse
     */
    CompletableFuture<CreateDBInstanceResponse> createDBInstance(CreateDBInstanceRequest request);

    /**
     * @param request the request parameters of CreateElasticRule  CreateElasticRuleRequest
     * @return CreateElasticRuleResponse
     */
    CompletableFuture<CreateElasticRuleResponse> createElasticRule(CreateElasticRuleRequest request);

    /**
     * @param request the request parameters of CreateServiceLinkedRoleForSelectDB  CreateServiceLinkedRoleForSelectDBRequest
     * @return CreateServiceLinkedRoleForSelectDBResponse
     */
    CompletableFuture<CreateServiceLinkedRoleForSelectDBResponse> createServiceLinkedRoleForSelectDB(CreateServiceLinkedRoleForSelectDBRequest request);

    /**
     * <b>description</b> :
     * <p>Only zone-disaster recovery instances support this operation. The following conditions must be met:</p>
     * <ul>
     * <li>The minor engine version of the instance is 4.0.7 or later.</li>
     * <li>The primary and standby clusters are deployed in different zones.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateVirtualCluster  CreateVirtualClusterRequest
     * @return CreateVirtualClusterResponse
     */
    CompletableFuture<CreateVirtualClusterResponse> createVirtualCluster(CreateVirtualClusterRequest request);

    /**
     * @param request the request parameters of DeleteDBCluster  DeleteDBClusterRequest
     * @return DeleteDBClusterResponse
     */
    CompletableFuture<DeleteDBClusterResponse> deleteDBCluster(DeleteDBClusterRequest request);

    /**
     * @param request the request parameters of DeleteDBClusterBinding  DeleteDBClusterBindingRequest
     * @return DeleteDBClusterBindingResponse
     */
    CompletableFuture<DeleteDBClusterBindingResponse> deleteDBClusterBinding(DeleteDBClusterBindingRequest request);

    /**
     * <b>description</b> :
     * <p>You cannot delete subscription instances.</p>
     * 
     * @param request the request parameters of DeleteDBInstance  DeleteDBInstanceRequest
     * @return DeleteDBInstanceResponse
     */
    CompletableFuture<DeleteDBInstanceResponse> deleteDBInstance(DeleteDBInstanceRequest request);

    /**
     * @param request the request parameters of DeleteElasticRule  DeleteElasticRuleRequest
     * @return DeleteElasticRuleResponse
     */
    CompletableFuture<DeleteElasticRuleResponse> deleteElasticRule(DeleteElasticRuleRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>Only the virtual cluster is deleted. The bound primary and secondary clusters are <strong>not</strong> deleted.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteVirtualCluster  DeleteVirtualClusterRequest
     * @return DeleteVirtualClusterResponse
     */
    CompletableFuture<DeleteVirtualClusterResponse> deleteVirtualCluster(DeleteVirtualClusterRequest request);

    /**
     * @param request the request parameters of DescribeAllDBInstanceClass  DescribeAllDBInstanceClassRequest
     * @return DescribeAllDBInstanceClassResponse
     */
    CompletableFuture<DescribeAllDBInstanceClassResponse> describeAllDBInstanceClass(DescribeAllDBInstanceClassRequest request);

    /**
     * @param request the request parameters of DescribeDBClusterConfig  DescribeDBClusterConfigRequest
     * @return DescribeDBClusterConfigResponse
     */
    CompletableFuture<DescribeDBClusterConfigResponse> describeDBClusterConfig(DescribeDBClusterConfigRequest request);

    /**
     * @param request the request parameters of DescribeDBClusterConfigChangeLogs  DescribeDBClusterConfigChangeLogsRequest
     * @return DescribeDBClusterConfigChangeLogsResponse
     */
    CompletableFuture<DescribeDBClusterConfigChangeLogsResponse> describeDBClusterConfigChangeLogs(DescribeDBClusterConfigChangeLogsRequest request);

    /**
     * @param request the request parameters of DescribeDBClusterStorageLimitation  DescribeDBClusterStorageLimitationRequest
     * @return DescribeDBClusterStorageLimitationResponse
     */
    CompletableFuture<DescribeDBClusterStorageLimitationResponse> describeDBClusterStorageLimitation(DescribeDBClusterStorageLimitationRequest request);

    /**
     * <b>description</b> :
     * <p>Subscription instances cannot be deleted.</p>
     * 
     * @param request the request parameters of DescribeDBInstanceAttribute  DescribeDBInstanceAttributeRequest
     * @return DescribeDBInstanceAttributeResponse
     */
    CompletableFuture<DescribeDBInstanceAttributeResponse> describeDBInstanceAttribute(DescribeDBInstanceAttributeRequest request);

    /**
     * @param request the request parameters of DescribeDBInstanceNetInfo  DescribeDBInstanceNetInfoRequest
     * @return DescribeDBInstanceNetInfoResponse
     */
    CompletableFuture<DescribeDBInstanceNetInfoResponse> describeDBInstanceNetInfo(DescribeDBInstanceNetInfoRequest request);

    /**
     * @param request the request parameters of DescribeDBInstances  DescribeDBInstancesRequest
     * @return DescribeDBInstancesResponse
     */
    CompletableFuture<DescribeDBInstancesResponse> describeDBInstances(DescribeDBInstancesRequest request);

    /**
     * @param request the request parameters of DescribeElasticRules  DescribeElasticRulesRequest
     * @return DescribeElasticRulesResponse
     */
    CompletableFuture<DescribeElasticRulesResponse> describeElasticRules(DescribeElasticRulesRequest request);

    /**
     * <b>description</b> :
     * <p>We recommend using the visual interface to run a query and obtain its QueryID. For more information, see <a href="https://help.aliyun.com/zh/selectdb/audit-queries">query audit</a>.</p>
     * <blockquote>
     * <p>Notice: 
     * Version limitations</p>
     * </blockquote>
     * <ul>
     * <li>Version 3.0 is not supported.</li>
     * <li>This feature is not available for instances created before 2025-08-01. To enable this feature for an older instance, please submit a ticket.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeProfile  DescribeProfileRequest
     * @return DescribeProfileResponse
     */
    CompletableFuture<DescribeProfileResponse> describeProfile(DescribeProfileRequest request);

    /**
     * @param request the request parameters of DescribeQueryExplain  DescribeQueryExplainRequest
     * @return DescribeQueryExplainResponse
     */
    CompletableFuture<DescribeQueryExplainResponse> describeQueryExplain(DescribeQueryExplainRequest request);

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * @param request the request parameters of DescribeSecurityIPList  DescribeSecurityIPListRequest
     * @return DescribeSecurityIPListResponse
     */
    CompletableFuture<DescribeSecurityIPListResponse> describeSecurityIPList(DescribeSecurityIPListRequest request);

    /**
     * @param request the request parameters of DescribeSlowQueryStats  DescribeSlowQueryStatsRequest
     * @return DescribeSlowQueryStatsResponse
     */
    CompletableFuture<DescribeSlowQueryStatsResponse> describeSlowQueryStats(DescribeSlowQueryStatsRequest request);

    /**
     * @param request the request parameters of DescribeTableSchema  DescribeTableSchemaRequest
     * @return DescribeTableSchemaResponse
     */
    CompletableFuture<DescribeTableSchemaResponse> describeTableSchema(DescribeTableSchemaRequest request);

    /**
     * @param request the request parameters of DescribeVSwitches  DescribeVSwitchesRequest
     * @return DescribeVSwitchesResponse
     */
    CompletableFuture<DescribeVSwitchesResponse> describeVSwitches(DescribeVSwitchesRequest request);

    /**
     * @param request the request parameters of DescribeZones  DescribeZonesRequest
     * @return DescribeZonesResponse
     */
    CompletableFuture<DescribeZonesResponse> describeZones(DescribeZonesRequest request);

    /**
     * @param request the request parameters of EnDisableScalingRules  EnDisableScalingRulesRequest
     * @return EnDisableScalingRulesResponse
     */
    CompletableFuture<EnDisableScalingRulesResponse> enDisableScalingRules(EnDisableScalingRulesRequest request);

    /**
     * @param request the request parameters of GetCreateBEClusterInquiry  GetCreateBEClusterInquiryRequest
     * @return GetCreateBEClusterInquiryResponse
     */
    CompletableFuture<GetCreateBEClusterInquiryResponse> getCreateBEClusterInquiry(GetCreateBEClusterInquiryRequest request);

    /**
     * @param request the request parameters of GetModifyBEClusterInquiry  GetModifyBEClusterInquiryRequest
     * @return GetModifyBEClusterInquiryResponse
     */
    CompletableFuture<GetModifyBEClusterInquiryResponse> getModifyBEClusterInquiry(GetModifyBEClusterInquiryRequest request);

    /**
     * @param request the request parameters of ModifyBEClusterAttribute  ModifyBEClusterAttributeRequest
     * @return ModifyBEClusterAttributeResponse
     */
    CompletableFuture<ModifyBEClusterAttributeResponse> modifyBEClusterAttribute(ModifyBEClusterAttributeRequest request);

    /**
     * @param request the request parameters of ModifyDBCluster  ModifyDBClusterRequest
     * @return ModifyDBClusterResponse
     */
    CompletableFuture<ModifyDBClusterResponse> modifyDBCluster(ModifyDBClusterRequest request);

    /**
     * @param request the request parameters of ModifyDBClusterConfig  ModifyDBClusterConfigRequest
     * @return ModifyDBClusterConfigResponse
     */
    CompletableFuture<ModifyDBClusterConfigResponse> modifyDBClusterConfig(ModifyDBClusterConfigRequest request);

    /**
     * @param request the request parameters of ModifyDBInstanceAttribute  ModifyDBInstanceAttributeRequest
     * @return ModifyDBInstanceAttributeResponse
     */
    CompletableFuture<ModifyDBInstanceAttributeResponse> modifyDBInstanceAttribute(ModifyDBInstanceAttributeRequest request);

    /**
     * @param request the request parameters of ModifyElasticRule  ModifyElasticRuleRequest
     * @return ModifyElasticRuleResponse
     */
    CompletableFuture<ModifyElasticRuleResponse> modifyElasticRule(ModifyElasticRuleRequest request);

    /**
     * @param request the request parameters of ModifySecurityIPList  ModifySecurityIPListRequest
     * @return ModifySecurityIPListResponse
     */
    CompletableFuture<ModifySecurityIPListResponse> modifySecurityIPList(ModifySecurityIPListRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Supports modifying the primary cluster separately.</li>
     * <li>Supports modifying the secondary cluster separately.</li>
     * <li>Supports switching between the primary and secondary clusters.<blockquote>
     * <p>Warning: Modifying both the primary and secondary clusters to other clusters at the same time is not supported.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ModifyVirtualCluster  ModifyVirtualClusterRequest
     * @return ModifyVirtualClusterResponse
     */
    CompletableFuture<ModifyVirtualClusterResponse> modifyVirtualCluster(ModifyVirtualClusterRequest request);

    /**
     * @param request the request parameters of ReleaseInstancePublicConnection  ReleaseInstancePublicConnectionRequest
     * @return ReleaseInstancePublicConnectionResponse
     */
    CompletableFuture<ReleaseInstancePublicConnectionResponse> releaseInstancePublicConnection(ReleaseInstancePublicConnectionRequest request);

    /**
     * @param request the request parameters of ResetAccountPassword  ResetAccountPasswordRequest
     * @return ResetAccountPasswordResponse
     */
    CompletableFuture<ResetAccountPasswordResponse> resetAccountPassword(ResetAccountPasswordRequest request);

    /**
     * @param request the request parameters of RestartDBCluster  RestartDBClusterRequest
     * @return RestartDBClusterResponse
     */
    CompletableFuture<RestartDBClusterResponse> restartDBCluster(RestartDBClusterRequest request);

    /**
     * @param request the request parameters of StartBECluster  StartBEClusterRequest
     * @return StartBEClusterResponse
     */
    CompletableFuture<StartBEClusterResponse> startBECluster(StartBEClusterRequest request);

    /**
     * @param request the request parameters of StopBECluster  StopBEClusterRequest
     * @return StopBEClusterResponse
     */
    CompletableFuture<StopBEClusterResponse> stopBECluster(StopBEClusterRequest request);

    /**
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>After the instance is upgraded to zone-redundant architecture, the storage is upgraded to zone-redundant specifications, and the unit storage cost changes. For pricing details, see <a href="https://www.alibabacloud.com/help/en/selectdb/product-overview/billing-item-new-version">Billing items and pricing</a>.</p>
     * <blockquote>
     * <p>Version limits</p>
     * <ul>
     * <li>The minor engine version of the instance must be 4.0.4 or later.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of UpgradeDBInstanceDeployScheme  UpgradeDBInstanceDeploySchemeRequest
     * @return UpgradeDBInstanceDeploySchemeResponse
     */
    CompletableFuture<UpgradeDBInstanceDeploySchemeResponse> upgradeDBInstanceDeployScheme(UpgradeDBInstanceDeploySchemeRequest request);

    /**
     * @param request the request parameters of UpgradeDBInstanceEngineVersion  UpgradeDBInstanceEngineVersionRequest
     * @return UpgradeDBInstanceEngineVersionResponse
     */
    CompletableFuture<UpgradeDBInstanceEngineVersionResponse> upgradeDBInstanceEngineVersion(UpgradeDBInstanceEngineVersionRequest request);

}
