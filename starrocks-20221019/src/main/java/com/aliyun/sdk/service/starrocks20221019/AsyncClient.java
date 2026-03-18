// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starrocks20221019;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.starrocks20221019.models.*;
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
     * @param request the request parameters of AddBackupPolicy  AddBackupPolicyRequest
     * @return AddBackupPolicyResponse
     */
    CompletableFuture<AddBackupPolicyResponse> addBackupPolicy(AddBackupPolicyRequest request);

    /**
     * @param request the request parameters of AddGateway  AddGatewayRequest
     * @return AddGatewayResponse
     */
    CompletableFuture<AddGatewayResponse> addGateway(AddGatewayRequest request);

    /**
     * @param request the request parameters of ChangeResourceGroup  ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    /**
     * @param request the request parameters of CheckInventory  CheckInventoryRequest
     * @return CheckInventoryResponse
     */
    CompletableFuture<CheckInventoryResponse> checkInventory(CheckInventoryRequest request);

    /**
     * @param request the request parameters of CreateAgentResource  CreateAgentResourceRequest
     * @return CreateAgentResourceResponse
     */
    CompletableFuture<CreateAgentResourceResponse> createAgentResource(CreateAgentResourceRequest request);

    /**
     * @param request the request parameters of CreateInstanceV1  CreateInstanceV1Request
     * @return CreateInstanceV1Response
     */
    CompletableFuture<CreateInstanceV1Response> createInstanceV1(CreateInstanceV1Request request);

    /**
     * @param request the request parameters of CreateScalingRule  CreateScalingRuleRequest
     * @return CreateScalingRuleResponse
     */
    CompletableFuture<CreateScalingRuleResponse> createScalingRule(CreateScalingRuleRequest request);

    /**
     * @param request the request parameters of CreateServiceLinkedRole  CreateServiceLinkedRoleRequest
     * @return CreateServiceLinkedRoleResponse
     */
    CompletableFuture<CreateServiceLinkedRoleResponse> createServiceLinkedRole(CreateServiceLinkedRoleRequest request);

    /**
     * @param request the request parameters of DeleteBackup  DeleteBackupRequest
     * @return DeleteBackupResponse
     */
    CompletableFuture<DeleteBackupResponse> deleteBackup(DeleteBackupRequest request);

    /**
     * @param request the request parameters of DeleteBackupPolicy  DeleteBackupPolicyRequest
     * @return DeleteBackupPolicyResponse
     */
    CompletableFuture<DeleteBackupPolicyResponse> deleteBackupPolicy(DeleteBackupPolicyRequest request);

    /**
     * @param request the request parameters of DeleteGateway  DeleteGatewayRequest
     * @return DeleteGatewayResponse
     */
    CompletableFuture<DeleteGatewayResponse> deleteGateway(DeleteGatewayRequest request);

    /**
     * @param request the request parameters of DeleteInnerIpWhitelistGroup  DeleteInnerIpWhitelistGroupRequest
     * @return DeleteInnerIpWhitelistGroupResponse
     */
    CompletableFuture<DeleteInnerIpWhitelistGroupResponse> deleteInnerIpWhitelistGroup(DeleteInnerIpWhitelistGroupRequest request);

    /**
     * @param request the request parameters of DeleteScalingRule  DeleteScalingRuleRequest
     * @return DeleteScalingRuleResponse
     */
    CompletableFuture<DeleteScalingRuleResponse> deleteScalingRule(DeleteScalingRuleRequest request);

    /**
     * @param request the request parameters of DescribeAvailableZones  DescribeAvailableZonesRequest
     * @return DescribeAvailableZonesResponse
     */
    CompletableFuture<DescribeAvailableZonesResponse> describeAvailableZones(DescribeAvailableZonesRequest request);

    /**
     * @param request the request parameters of DescribeBackupPolicies  DescribeBackupPoliciesRequest
     * @return DescribeBackupPoliciesResponse
     */
    CompletableFuture<DescribeBackupPoliciesResponse> describeBackupPolicies(DescribeBackupPoliciesRequest request);

    /**
     * @param request the request parameters of DescribeBackups  DescribeBackupsRequest
     * @return DescribeBackupsResponse
     */
    CompletableFuture<DescribeBackupsResponse> describeBackups(DescribeBackupsRequest request);

    /**
     * @param request the request parameters of DescribeConfigHistory  DescribeConfigHistoryRequest
     * @return DescribeConfigHistoryResponse
     */
    CompletableFuture<DescribeConfigHistoryResponse> describeConfigHistory(DescribeConfigHistoryRequest request);

    /**
     * @param request the request parameters of DescribeEventNames  DescribeEventNamesRequest
     * @return DescribeEventNamesResponse
     */
    CompletableFuture<DescribeEventNamesResponse> describeEventNames(DescribeEventNamesRequest request);

    /**
     * @param request the request parameters of DescribeInnerIpWhitelistGroups  DescribeInnerIpWhitelistGroupsRequest
     * @return DescribeInnerIpWhitelistGroupsResponse
     */
    CompletableFuture<DescribeInnerIpWhitelistGroupsResponse> describeInnerIpWhitelistGroups(DescribeInnerIpWhitelistGroupsRequest request);

    /**
     * @param request the request parameters of DescribeInstanceConfigs  DescribeInstanceConfigsRequest
     * @return DescribeInstanceConfigsResponse
     */
    CompletableFuture<DescribeInstanceConfigsResponse> describeInstanceConfigs(DescribeInstanceConfigsRequest request);

    /**
     * @param request the request parameters of DescribeInstanceDiagnosisResult  DescribeInstanceDiagnosisResultRequest
     * @return DescribeInstanceDiagnosisResultResponse
     */
    CompletableFuture<DescribeInstanceDiagnosisResultResponse> describeInstanceDiagnosisResult(DescribeInstanceDiagnosisResultRequest request);

    /**
     * @param request the request parameters of DescribeInstanceMetaToken  DescribeInstanceMetaTokenRequest
     * @return DescribeInstanceMetaTokenResponse
     */
    CompletableFuture<DescribeInstanceMetaTokenResponse> describeInstanceMetaToken(DescribeInstanceMetaTokenRequest request);

    /**
     * @param request the request parameters of DescribeInstances  DescribeInstancesRequest
     * @return DescribeInstancesResponse
     */
    CompletableFuture<DescribeInstancesResponse> describeInstances(DescribeInstancesRequest request);

    /**
     * @param request the request parameters of DescribeNodeGroups  DescribeNodeGroupsRequest
     * @return DescribeNodeGroupsResponse
     */
    CompletableFuture<DescribeNodeGroupsResponse> describeNodeGroups(DescribeNodeGroupsRequest request);

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * @param request the request parameters of DescribeResourceConstraints  DescribeResourceConstraintsRequest
     * @return DescribeResourceConstraintsResponse
     */
    CompletableFuture<DescribeResourceConstraintsResponse> describeResourceConstraints(DescribeResourceConstraintsRequest request);

    /**
     * @param request the request parameters of DescribeSystemTimezone  DescribeSystemTimezoneRequest
     * @return DescribeSystemTimezoneResponse
     */
    CompletableFuture<DescribeSystemTimezoneResponse> describeSystemTimezone(DescribeSystemTimezoneRequest request);

    /**
     * @param request the request parameters of DescribeTimeTriggerScalingRules  DescribeTimeTriggerScalingRulesRequest
     * @return DescribeTimeTriggerScalingRulesResponse
     */
    CompletableFuture<DescribeTimeTriggerScalingRulesResponse> describeTimeTriggerScalingRules(DescribeTimeTriggerScalingRulesRequest request);

    /**
     * @param request the request parameters of DisableSSLConnection  DisableSSLConnectionRequest
     * @return DisableSSLConnectionResponse
     */
    CompletableFuture<DisableSSLConnectionResponse> disableSSLConnection(DisableSSLConnectionRequest request);

    /**
     * @param request the request parameters of EnableInternalSlb  EnableInternalSlbRequest
     * @return EnableInternalSlbResponse
     */
    CompletableFuture<EnableInternalSlbResponse> enableInternalSlb(EnableInternalSlbRequest request);

    /**
     * @param request the request parameters of EnableMultiAz  EnableMultiAzRequest
     * @return EnableMultiAzResponse
     */
    CompletableFuture<EnableMultiAzResponse> enableMultiAz(EnableMultiAzRequest request);

    /**
     * @param request the request parameters of EnableSSLConnection  EnableSSLConnectionRequest
     * @return EnableSSLConnectionResponse
     */
    CompletableFuture<EnableSSLConnectionResponse> enableSSLConnection(EnableSSLConnectionRequest request);

    /**
     * @param request the request parameters of GetInstanceFeatureGate  GetInstanceFeatureGateRequest
     * @return GetInstanceFeatureGateResponse
     */
    CompletableFuture<GetInstanceFeatureGateResponse> getInstanceFeatureGate(GetInstanceFeatureGateRequest request);

    /**
     * @param request the request parameters of GetNodeGroupFeatureGate  GetNodeGroupFeatureGateRequest
     * @return GetNodeGroupFeatureGateResponse
     */
    CompletableFuture<GetNodeGroupFeatureGateResponse> getNodeGroupFeatureGate(GetNodeGroupFeatureGateRequest request);

    /**
     * @param request the request parameters of IsolateLeader  IsolateLeaderRequest
     * @return IsolateLeaderResponse
     */
    CompletableFuture<IsolateLeaderResponse> isolateLeader(IsolateLeaderRequest request);

    /**
     * @param request the request parameters of ListGateway  ListGatewayRequest
     * @return ListGatewayResponse
     */
    CompletableFuture<ListGatewayResponse> listGateway(ListGatewayRequest request);

    /**
     * @param request the request parameters of ListOperationActivity  ListOperationActivityRequest
     * @return ListOperationActivityResponse
     */
    CompletableFuture<ListOperationActivityResponse> listOperationActivity(ListOperationActivityRequest request);

    /**
     * @param request the request parameters of ListOperationHistory  ListOperationHistoryRequest
     * @return ListOperationHistoryResponse
     */
    CompletableFuture<ListOperationHistoryResponse> listOperationHistory(ListOperationHistoryRequest request);

    /**
     * @param request the request parameters of ModifyChargeType  ModifyChargeTypeRequest
     * @return ModifyChargeTypeResponse
     */
    CompletableFuture<ModifyChargeTypeResponse> modifyChargeType(ModifyChargeTypeRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing methods and <a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a> of EMR Serverless StarRocks instances.
     * Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>You can modify the number of CUs for a warehouse of only StarRocks instances of Standard Edition.</li>
     * <li>You can increase the number of disks only for warehouses of the standard specifications.</li>
     * <li>The instance must be in the Running state.
     * After you modify the number of CUs for a warehouse, the billing of CUs has the following changes:</li>
     * <li>Pay-as-you-go StarRocks instances: You are charged based on the number of CUs.</li>
     * <li>Subscription StarRocks instances: You are charged additionally based on the price difference between the number of CUs before and after the change and the remaining days of the billing cycle. The billing cycle starts from 00:00 the next day until the end of the subscription period.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyCu  ModifyCuRequest
     * @return ModifyCuResponse
     */
    CompletableFuture<ModifyCuResponse> modifyCu(ModifyCuRequest request);

    /**
     * @param request the request parameters of ModifyCuPreCheck  ModifyCuPreCheckRequest
     * @return ModifyCuPreCheckResponse
     */
    CompletableFuture<ModifyCuPreCheckResponse> modifyCuPreCheck(ModifyCuPreCheckRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing methods and <a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a> of EMR Serverless StarRocks instances. Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>You can increase the number of disks only for StarRocks instances of Standard Edition.</li>
     * <li>You can increase the number of disks only for warehouses of the standard specifications.</li>
     * <li>The instance must be in the Running state.
     * After you increase the number of disks for a warehouse, the billing of disks has the following changes:</li>
     * <li>Pay-as-you-go StarRocks instances: You are charged for the disk based on the new disk type.</li>
     * <li>Subscription StarRocks instances: You are charged additionally based on the price difference between the number of disks before and after the change and the remaining days of the billing cycle. The billing cycle starts from 00:00 the next day until the end of the subscription period.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDiskNumber  ModifyDiskNumberRequest
     * @return ModifyDiskNumberResponse
     */
    CompletableFuture<ModifyDiskNumberResponse> modifyDiskNumber(ModifyDiskNumberRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing methods and <a href="https://www.alibabacloud.com/en/product/ecs?_p_lc=1&spm=openapi-amp.newDocPublishment.0.0.47c9281fkIZGiB#pricing">pricing</a> of EMR Serverless StarRocks instances.
     * Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>You can modify the disk performance level only for StarRocks instances of Standard Edition.</li>
     * <li>You can modify the disk performance level only for warehouses of the standard specifications.</li>
     * <li>The instance must be in the Running state.</li>
     * <li>You cannot downgrade the performance level to PL0.</li>
     * <li>The performance level of an Enterprise SSD (ESSD) is limited by the ESSD disk size. If you cannot upgrade the performance level of an ESSD, expand the ESSD and try again. For more information, see <a href="https://help.aliyun.com/document_detail/122389.html">Enterprise SSDs</a>.
     * After the disk performance level is changed, the billing of the disk has the following changes:</li>
     * <li>Pay-as-you-go StarRocks instances: You are charged for the disk based on the new disk type.</li>
     * <li>Subscription StarRocks instances: You are charged additionally based on the price difference between the disk performance level before and after the change and the remaining days of the billing cycle. The billing cycle starts from 00:00 the next day until the end of the subscription period.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDiskPerformanceLevel  ModifyDiskPerformanceLevelRequest
     * @return ModifyDiskPerformanceLevelResponse
     */
    CompletableFuture<ModifyDiskPerformanceLevelResponse> modifyDiskPerformanceLevel(ModifyDiskPerformanceLevelRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing methods and <a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a> of EMR Serverless StarRocks instances. Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>You can expand the disk size only for StarRocks instances of Standard Edition.</li>
     * <li>You can expand the disk size only for warehouses of the standard specifications.</li>
     * <li>The instance must be in the Running state.
     * After you expand the disk size, the billing of disks has the following changes:</li>
     * <li>Pay-as-you-go StarRocks instances: You are charged for the disk based on the new disk size.</li>
     * <li>Subscription StarRocks instances: You are charged additionally based on the price difference between the disk size before and after the change and the remaining days of the billing cycle. The billing cycle starts from 00:00 the next day until the end of the subscription period.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDiskSize  ModifyDiskSizeRequest
     * @return ModifyDiskSizeResponse
     */
    CompletableFuture<ModifyDiskSizeResponse> modifyDiskSize(ModifyDiskSizeRequest request);

    /**
     * @param request the request parameters of ModifyDiskType  ModifyDiskTypeRequest
     * @return ModifyDiskTypeResponse
     */
    CompletableFuture<ModifyDiskTypeResponse> modifyDiskType(ModifyDiskTypeRequest request);

    /**
     * @param request the request parameters of ModifyHostAlias  ModifyHostAliasRequest
     * @return ModifyHostAliasResponse
     */
    CompletableFuture<ModifyHostAliasResponse> modifyHostAlias(ModifyHostAliasRequest request);

    /**
     * @param request the request parameters of ModifyInstanceConfig  ModifyInstanceConfigRequest
     * @return ModifyInstanceConfigResponse
     */
    CompletableFuture<ModifyInstanceConfigResponse> modifyInstanceConfig(ModifyInstanceConfigRequest request);

    /**
     * @param request the request parameters of ModifyInstanceConfigPreCheck  ModifyInstanceConfigPreCheckRequest
     * @return ModifyInstanceConfigPreCheckResponse
     */
    CompletableFuture<ModifyInstanceConfigPreCheckResponse> modifyInstanceConfigPreCheck(ModifyInstanceConfigPreCheckRequest request);

    /**
     * @param request the request parameters of ModifyMaintainableTime  ModifyMaintainableTimeRequest
     * @return ModifyMaintainableTimeResponse
     */
    CompletableFuture<ModifyMaintainableTimeResponse> modifyMaintainableTime(ModifyMaintainableTimeRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing methods and <a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a> of EMR Serverless StarRocks instances. Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>You can modify the number of nodes in a warehouse of only StarRocks instances of Standard Edition.</li>
     * <li>The instance must be in the Running state.</li>
     * <li>The number of frontend nodes (FEs) cannot be an even number, and you cannot reduce the number of FE nodes.
     * After you modify the number of nodes in a warehouse, the billing of nodes has the following changes:</li>
     * <li>Pay-as-you-go StarRocks instances: You are charged based on the number of nodes.</li>
     * <li>Subscription StarRocks instances: You are charged additionally based on the price difference between the number of nodes before and after the change and the remaining days of the billing cycle. The billing cycle starts from 00:00 the next day until the end of the subscription period.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyNodeNumber  ModifyNodeNumberRequest
     * @return ModifyNodeNumberResponse
     */
    CompletableFuture<ModifyNodeNumberResponse> modifyNodeNumber(ModifyNodeNumberRequest request);

    /**
     * @param request the request parameters of ModifyNodeNumberPreCheck  ModifyNodeNumberPreCheckRequest
     * @return ModifyNodeNumberPreCheckResponse
     */
    CompletableFuture<ModifyNodeNumberPreCheckResponse> modifyNodeNumberPreCheck(ModifyNodeNumberPreCheckRequest request);

    /**
     * @param request the request parameters of ModifyScalingRule  ModifyScalingRuleRequest
     * @return ModifyScalingRuleResponse
     */
    CompletableFuture<ModifyScalingRuleResponse> modifyScalingRule(ModifyScalingRuleRequest request);

    /**
     * @param request the request parameters of ModifySpecType  ModifySpecTypeRequest
     * @return ModifySpecTypeResponse
     */
    CompletableFuture<ModifySpecTypeResponse> modifySpecType(ModifySpecTypeRequest request);

    /**
     * @param request the request parameters of ModifySpecTypePreCheck  ModifySpecTypePreCheckRequest
     * @return ModifySpecTypePreCheckResponse
     */
    CompletableFuture<ModifySpecTypePreCheckResponse> modifySpecTypePreCheck(ModifySpecTypePreCheckRequest request);

    /**
     * @param request the request parameters of ModifyUserPassword  ModifyUserPasswordRequest
     * @return ModifyUserPasswordResponse
     */
    CompletableFuture<ModifyUserPasswordResponse> modifyUserPassword(ModifyUserPasswordRequest request);

    /**
     * @param request the request parameters of QueryEnableMultiAzPrice  QueryEnableMultiAzPriceRequest
     * @return QueryEnableMultiAzPriceResponse
     */
    CompletableFuture<QueryEnableMultiAzPriceResponse> queryEnableMultiAzPrice(QueryEnableMultiAzPriceRequest request);

    /**
     * @param request the request parameters of QueryMinorVersion  QueryMinorVersionRequest
     * @return QueryMinorVersionResponse
     */
    CompletableFuture<QueryMinorVersionResponse> queryMinorVersion(QueryMinorVersionRequest request);

    /**
     * @param request the request parameters of QueryModifyChargeTypePrice  QueryModifyChargeTypePriceRequest
     * @return QueryModifyChargeTypePriceResponse
     */
    CompletableFuture<QueryModifyChargeTypePriceResponse> queryModifyChargeTypePrice(QueryModifyChargeTypePriceRequest request);

    /**
     * @param request the request parameters of QueryModifyCuPrice  QueryModifyCuPriceRequest
     * @return QueryModifyCuPriceResponse
     */
    CompletableFuture<QueryModifyCuPriceResponse> queryModifyCuPrice(QueryModifyCuPriceRequest request);

    /**
     * @param request the request parameters of QueryModifyDiskNumberPrice  QueryModifyDiskNumberPriceRequest
     * @return QueryModifyDiskNumberPriceResponse
     */
    CompletableFuture<QueryModifyDiskNumberPriceResponse> queryModifyDiskNumberPrice(QueryModifyDiskNumberPriceRequest request);

    /**
     * @param request the request parameters of QueryModifyDiskPerformanceLevelPrice  QueryModifyDiskPerformanceLevelPriceRequest
     * @return QueryModifyDiskPerformanceLevelPriceResponse
     */
    CompletableFuture<QueryModifyDiskPerformanceLevelPriceResponse> queryModifyDiskPerformanceLevelPrice(QueryModifyDiskPerformanceLevelPriceRequest request);

    /**
     * @param request the request parameters of QueryModifyDiskSizePrice  QueryModifyDiskSizePriceRequest
     * @return QueryModifyDiskSizePriceResponse
     */
    CompletableFuture<QueryModifyDiskSizePriceResponse> queryModifyDiskSizePrice(QueryModifyDiskSizePriceRequest request);

    /**
     * @param request the request parameters of QueryModifyDiskTypePrice  QueryModifyDiskTypePriceRequest
     * @return QueryModifyDiskTypePriceResponse
     */
    CompletableFuture<QueryModifyDiskTypePriceResponse> queryModifyDiskTypePrice(QueryModifyDiskTypePriceRequest request);

    /**
     * @param request the request parameters of QueryModifyNodeNumberPrice  QueryModifyNodeNumberPriceRequest
     * @return QueryModifyNodeNumberPriceResponse
     */
    CompletableFuture<QueryModifyNodeNumberPriceResponse> queryModifyNodeNumberPrice(QueryModifyNodeNumberPriceRequest request);

    /**
     * @param request the request parameters of QueryModifySpecTypePrice  QueryModifySpecTypePriceRequest
     * @return QueryModifySpecTypePriceResponse
     */
    CompletableFuture<QueryModifySpecTypePriceResponse> queryModifySpecTypePrice(QueryModifySpecTypePriceRequest request);

    /**
     * @param request the request parameters of QueryPriceV1  QueryPriceV1Request
     * @return QueryPriceV1Response
     */
    CompletableFuture<QueryPriceV1Response> queryPriceV1(QueryPriceV1Request request);

    /**
     * @param request the request parameters of QueryRefundPrice  QueryRefundPriceRequest
     * @return QueryRefundPriceResponse
     */
    CompletableFuture<QueryRefundPriceResponse> queryRefundPrice(QueryRefundPriceRequest request);

    /**
     * @param request the request parameters of QueryRenewPrice  QueryRenewPriceRequest
     * @return QueryRenewPriceResponse
     */
    CompletableFuture<QueryRenewPriceResponse> queryRenewPrice(QueryRenewPriceRequest request);

    /**
     * @param request the request parameters of QueryUnpaidOrder  QueryUnpaidOrderRequest
     * @return QueryUnpaidOrderResponse
     */
    CompletableFuture<QueryUnpaidOrderResponse> queryUnpaidOrder(QueryUnpaidOrderRequest request);

    /**
     * @param request the request parameters of QueryUpgradableVersions  QueryUpgradableVersionsRequest
     * @return QueryUpgradableVersionsResponse
     */
    CompletableFuture<QueryUpgradableVersionsResponse> queryUpgradableVersions(QueryUpgradableVersionsRequest request);

    /**
     * @param request the request parameters of RebootECS  RebootECSRequest
     * @return RebootECSResponse
     */
    CompletableFuture<RebootECSResponse> rebootECS(RebootECSRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li><strong>Warning:</strong> After an instance is released, all physical resources used by the instance are recycled. Relevant data is erased and cannot be restored.</li>
     * </ul>
     * 
     * @param request the request parameters of ReleaseInstance  ReleaseInstanceRequest
     * @return ReleaseInstanceResponse
     */
    CompletableFuture<ReleaseInstanceResponse> releaseInstance(ReleaseInstanceRequest request);

    /**
     * @param request the request parameters of RenewInstance  RenewInstanceRequest
     * @return RenewInstanceResponse
     */
    CompletableFuture<RenewInstanceResponse> renewInstance(RenewInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is an asynchronous operation. After you call this operation to restart a StarRocks instance, the operation sets the status of the instance to Restarting and begins the restart process. When the status of the instance changes to Running, the instance is restarted.</p>
     * 
     * @param request the request parameters of RestartInstance  RestartInstanceRequest
     * @return RestartInstanceResponse
     */
    CompletableFuture<RestartInstanceResponse> restartInstance(RestartInstanceRequest request);

    /**
     * @param request the request parameters of RestartNodeGroup  RestartNodeGroupRequest
     * @return RestartNodeGroupResponse
     */
    CompletableFuture<RestartNodeGroupResponse> restartNodeGroup(RestartNodeGroupRequest request);

    /**
     * @param request the request parameters of RestartNodes  RestartNodesRequest
     * @return RestartNodesResponse
     */
    CompletableFuture<RestartNodesResponse> restartNodes(RestartNodesRequest request);

    /**
     * @param request the request parameters of RestoreInstance  RestoreInstanceRequest
     * @return RestoreInstanceResponse
     */
    CompletableFuture<RestoreInstanceResponse> restoreInstance(RestoreInstanceRequest request);

    /**
     * @param request the request parameters of ResumeInstance  ResumeInstanceRequest
     * @return ResumeInstanceResponse
     */
    CompletableFuture<ResumeInstanceResponse> resumeInstance(ResumeInstanceRequest request);

    /**
     * @param request the request parameters of RollbackConfigModification  RollbackConfigModificationRequest
     * @return RollbackConfigModificationResponse
     */
    CompletableFuture<RollbackConfigModificationResponse> rollbackConfigModification(RollbackConfigModificationRequest request);

    /**
     * @param request the request parameters of SwitchActiveStandbyZones  SwitchActiveStandbyZonesRequest
     * @return SwitchActiveStandbyZonesResponse
     */
    CompletableFuture<SwitchActiveStandbyZonesResponse> switchActiveStandbyZones(SwitchActiveStandbyZonesRequest request);

    /**
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * @param request the request parameters of ToggleAutoMinorVersionUpgrade  ToggleAutoMinorVersionUpgradeRequest
     * @return ToggleAutoMinorVersionUpgradeResponse
     */
    CompletableFuture<ToggleAutoMinorVersionUpgradeResponse> toggleAutoMinorVersionUpgrade(ToggleAutoMinorVersionUpgradeRequest request);

    /**
     * @param request the request parameters of TogglePublicSlb  TogglePublicSlbRequest
     * @return TogglePublicSlbResponse
     */
    CompletableFuture<TogglePublicSlbResponse> togglePublicSlb(TogglePublicSlbRequest request);

    /**
     * @param request the request parameters of UnTagResources  UnTagResourcesRequest
     * @return UnTagResourcesResponse
     */
    CompletableFuture<UnTagResourcesResponse> unTagResources(UnTagResourcesRequest request);

    /**
     * @param request the request parameters of UpdateBackup  UpdateBackupRequest
     * @return UpdateBackupResponse
     */
    CompletableFuture<UpdateBackupResponse> updateBackup(UpdateBackupRequest request);

    /**
     * @param request the request parameters of UpdateBackupPolicy  UpdateBackupPolicyRequest
     * @return UpdateBackupPolicyResponse
     */
    CompletableFuture<UpdateBackupPolicyResponse> updateBackupPolicy(UpdateBackupPolicyRequest request);

    /**
     * @param request the request parameters of UpdateGateway  UpdateGatewayRequest
     * @return UpdateGatewayResponse
     */
    CompletableFuture<UpdateGatewayResponse> updateGateway(UpdateGatewayRequest request);

    /**
     * @param request the request parameters of UpdateInnerIpWhitelistGroup  UpdateInnerIpWhitelistGroupRequest
     * @return UpdateInnerIpWhitelistGroupResponse
     */
    CompletableFuture<UpdateInnerIpWhitelistGroupResponse> updateInnerIpWhitelistGroup(UpdateInnerIpWhitelistGroupRequest request);

    /**
     * @param request the request parameters of UpdateInstanceName  UpdateInstanceNameRequest
     * @return UpdateInstanceNameResponse
     */
    CompletableFuture<UpdateInstanceNameResponse> updateInstanceName(UpdateInstanceNameRequest request);

    /**
     * @param request the request parameters of UpdateNodeGroupDescription  UpdateNodeGroupDescriptionRequest
     * @return UpdateNodeGroupDescriptionResponse
     */
    CompletableFuture<UpdateNodeGroupDescriptionResponse> updateNodeGroupDescription(UpdateNodeGroupDescriptionRequest request);

    /**
     * @param request the request parameters of UpdatePublicNetworkStatus  UpdatePublicNetworkStatusRequest
     * @return UpdatePublicNetworkStatusResponse
     */
    CompletableFuture<UpdatePublicNetworkStatusResponse> updatePublicNetworkStatus(UpdatePublicNetworkStatusRequest request);

    /**
     * <b>description</b> :
     * <p>The instance must be in the Running state when you call this operation.</p>
     * 
     * @param request the request parameters of UpgradeVersion  UpgradeVersionRequest
     * @return UpgradeVersionResponse
     */
    CompletableFuture<UpgradeVersionResponse> upgradeVersion(UpgradeVersionRequest request);

}
