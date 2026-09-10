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
     * <b>description</b> :
     * <p>The AddGateway operation requires software stack version 1.7.6 or later and at least three front-end (FE) nodes.</p>
     * 
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
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you fully understand the billing method and &lt;props=&quot;china&quot;&gt;<a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items">billable items</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a> of Serverless StarRocks.</p>
     * 
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
     * <b>description</b> :
     * <p>Deletes a data backup.</p>
     * 
     * @param request the request parameters of DeleteBackup  DeleteBackupRequest
     * @return DeleteBackupResponse
     */
    CompletableFuture<DeleteBackupResponse> deleteBackup(DeleteBackupRequest request);

    /**
     * <b>description</b> :
     * <p>Deletes a backup policy.</p>
     * 
     * @param request the request parameters of DeleteBackupPolicy  DeleteBackupPolicyRequest
     * @return DeleteBackupPolicyResponse
     */
    CompletableFuture<DeleteBackupPolicyResponse> deleteBackupPolicy(DeleteBackupPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>Deletes a gateway group. After the gateway group is deleted, its FE nodes are automatically assigned to the default gateway group.</p>
     * 
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
     * <b>description</b> :
     * <p>Retrieve details of backup policies.</p>
     * 
     * @param request the request parameters of DescribeBackupPolicies  DescribeBackupPoliciesRequest
     * @return DescribeBackupPoliciesResponse
     */
    CompletableFuture<DescribeBackupPoliciesResponse> describeBackupPolicies(DescribeBackupPoliciesRequest request);

    /**
     * <b>description</b> :
     * <p>This is an asynchronous interface. Instance restarts are not immediate. After a successful call, the instance first enters the restarting state. The instance is successfully restarted when its status returns to running.</p>
     * 
     * @param request the request parameters of DescribeBackups  DescribeBackupsRequest
     * @return DescribeBackupsResponse
     */
    CompletableFuture<DescribeBackupsResponse> describeBackups(DescribeBackupsRequest request);

    /**
     * <b>description</b> :
     * <p>This is an asynchronous API, meaning the instance restart is not immediate. After a successful call, the instance enters the <code>restarting</code> state, and the process completes when its state changes to <code>running</code>.</p>
     * 
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
     * <b>description</b> :
     * <p>This operation is asynchronous. After you call this operation, the instance enters a restarting state but does not restart immediately. The restart is complete when the instance status changes to running.</p>
     * 
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
     * <b>description</b> :
     * <p>The instance must be in the Running state when you call this operation.</p>
     * 
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
     * <b>description</b> :
     * <p>You can call this operation only when the instance is in the Running state.</p>
     * 
     * @param request the request parameters of EnableSSLConnection  EnableSSLConnectionRequest
     * @return EnableSSLConnectionResponse
     */
    CompletableFuture<EnableSSLConnectionResponse> enableSSLConnection(EnableSSLConnectionRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing methods and &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c4g.11186623.help-menu-28066.d_0_1_1.4db82b05p3Gg0G">billable items</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a> of Serverless StarRocks.</p>
     * 
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
     * <b>description</b> :
     * <p>The instance must be in the running state when you call this operation.</p>
     * 
     * @param request the request parameters of IsolateLeader  IsolateLeaderRequest
     * @return IsolateLeaderResponse
     */
    CompletableFuture<IsolateLeaderResponse> isolateLeader(IsolateLeaderRequest request);

    /**
     * <b>description</b> :
     * <p>Lists the gateways of a cluster.</p>
     * 
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
     * <b>description</b> :
     * <p>Retrieves the ssl certificate details for a cluster.</p>
     * 
     * @param request the request parameters of ListSSLDetails  ListSSLDetailsRequest
     * @return ListSSLDetailsResponse
     */
    CompletableFuture<ListSSLDetailsResponse> listSSLDetails(ListSSLDetailsRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, review the billing methods for Serverless StarRocks and the &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c4g.11186623.help-menu-28066.d_0_1_1.4db82b05p3Gg0G">billable items</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a>.
     * When you call this operation, note the following:</p>
     * <ul>
     * <li>Only standard instances support changing the number of compute group Compute Units (CUs). Entry-level instances do not support this change.</li>
     * <li>Only instances of the standard compute group specification type support increasing the number of disks.</li>
     * <li>The instance must be in the Running state.
     * After you change the CU count, billing changes as follows:</li>
     * <li>Pay-as-you-go: You are billed based on the new CU count.</li>
     * <li>Subscription: During the current billing cycle, you pay the difference between the old and new configurations. This amount is calculated based on the number of days remaining in the subscription period, starting from 00:00 of the following day.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyChargeType  ModifyChargeTypeRequest
     * @return ModifyChargeTypeResponse
     */
    CompletableFuture<ModifyChargeTypeResponse> modifyChargeType(ModifyChargeTypeRequest request);

    /**
     * <b>description</b> :
     * <p>Before you use this operation, make sure that you fully understand the billing method and &lt;props=&quot;china&quot;&gt;<a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items">billable items</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a> of Serverless StarRocks.
     * When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>Only standard instances support modifying the number of CUs for a compute group. Starter instances do not support this operation.</li>
     * <li>Only instances whose compute group specification type is Standard (standard) support increasing the number of cloud disks.</li>
     * <li>The instance must be in the Running state.
     * After you modify the number of CUs, billing changes are as follows:</li>
     * <li>Pay-as-you-go: You are charged based on the new number of CUs.</li>
     * <li>Subscription: Within the billing cycle, the supplemental fee is calculated based on the price difference between the old and new configurations and the remaining days (from 00:00 of the next day to the end of the validity period).</li>
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
     * <p>Before you call this operation, make sure that you fully understand the billing method and &lt;props=&quot;china&quot;&gt;<a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items">billable items</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a> of Serverless StarRocks.
     * When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>Only standard instances support increasing the disk count. Entry-level instances do not support this operation.</li>
     * <li>Only instances whose compute group specification type is Standard (standard) support increasing the disk count.</li>
     * <li>The instance must be in the Running state.
     * After you increase the disk count, billing changes are as follows:</li>
     * <li>Pay-as-you-go: You are charged based on the new disk type.</li>
     * <li>Subscription: Within the billing cycle, the supplemental fee is calculated based on the price difference between the old and new configurations and the remaining days (from 00:00 of the next day to the end of the validity period).</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDiskNumber  ModifyDiskNumberRequest
     * @return ModifyDiskNumberResponse
     */
    CompletableFuture<ModifyDiskNumberResponse> modifyDiskNumber(ModifyDiskNumberRequest request);

    /**
     * <b>description</b> :
     * <p>Before you use this operation, make sure that you fully understand the billing and &lt;props=&quot;china&quot;&gt;<a href="https://www.aliyun.com/price/product?spm=openapi-amp.newDocPublishment.0.0.1837281f3hbi2d#/ecs/detail/vm">pricing</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/zh/product/ecs?_p_lc=1#pricing">pricing</a> of Serverless StarRocks.
     * When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>Only standard instances support disk specification changes. Entry-level instances are not supported.</li>
     * <li>Only instances whose compute group specification type is Standard (standard) support disk specification changes.</li>
     * <li>The instance must be in the Running state.</li>
     * <li>Downgrading the disk to PL0 is not supported.</li>
     * <li>Because the performance level (PL) of an ESSD is limited by its capacity, if you cannot upgrade the performance level (PL), expand the cloud disk capacity and try again. For more information, see &lt;props=&quot;china&quot;&gt;<a href="https://www.alibabacloud.com/help/en/ecs/user-guide/essds">ESSDs</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/ecs/user-guide/essds">ESSDs</a>.
     * After the disk specification is changed, billing changes are as follows:</li>
     * <li>Pay-as-you-go: Billed based on the new disk type.</li>
     * <li>Subscription: Within the billing cycle, the additional fee is calculated based on the price difference between the old and new configurations and the remaining days (from 00:00 of the next day to the end of the validity period).</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDiskPerformanceLevel  ModifyDiskPerformanceLevelRequest
     * @return ModifyDiskPerformanceLevelResponse
     */
    CompletableFuture<ModifyDiskPerformanceLevelResponse> modifyDiskPerformanceLevel(ModifyDiskPerformanceLevelRequest request);

    /**
     * <b>description</b> :
     * <p>Before you use this operation, make sure that you fully understand the billing method and &lt;props=&quot;china&quot;&gt;<a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items">billable items</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a> of Serverless StarRocks.
     * When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>Only standard instances support disk scale-up. Entry-level instances do not support this operation.</li>
     * <li>Only instances whose compute group specification type is Standard (standard) support disk scale-up.</li>
     * <li>The instance must be in the Running state.
     * After the disk is scaled up, billing changes are as follows:</li>
     * <li>Pay-as-you-go: You are billed based on the new disk size.</li>
     * <li>Subscription: Within the billing cycle, the supplemental fee is calculated based on the price difference between the old and new configurations and the remaining days (from 00:00 of the next day to the end of the validity period).</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDiskSize  ModifyDiskSizeRequest
     * @return ModifyDiskSizeResponse
     */
    CompletableFuture<ModifyDiskSizeResponse> modifyDiskSize(ModifyDiskSizeRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you fully understand the billing method and &lt;props=&quot;china&quot;&gt;<a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items">billable items</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a> of Serverless StarRocks.
     * When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>Only Standard Standard instances support disk expansion. Starter Standard instances do not support disk expansion.</li>
     * <li>Only instances whose compute group specification type is Standard (standard) support disk expansion.</li>
     * <li>The instance must be in the Running state.
     * After disk expansion, billing changes are as follows:</li>
     * <li>Pay-as-you-go: You are billed based on the new disk size.</li>
     * <li>Subscription: Within the billing cycle, the supplemental fee is calculated based on the price difference between the old and new configurations and the remaining days (from 00:00 of the next day to the end of the validity period).</li>
     * </ul>
     * 
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
     * <p>Before using this operation, make sure that you fully understand the billing method and &lt;props=&quot;china&quot;&gt;<a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items">billable items</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a> of Serverless StarRocks.
     * When calling this operation, note the following:</p>
     * <ul>
     * <li>Only Standard Standard instances support modifying the number of nodes in a compute group. Entry Standard instances do not support this operation.</li>
     * <li>The instance must be in the Running state.</li>
     * <li>The number of FE nodes cannot be an even number, and FE nodes do not support scale-in.
     * After modifying the node count, billing changes are as follows:</li>
     * <li>Pay-as-you-go: Billed based on the new node count.</li>
     * <li>Subscription: Within the billing cycle, the supplemental fee is calculated based on the price difference between the old and new configurations and the remaining days (from 00:00 of the next day to the end of the validity period).</li>
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
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you fully understand the billing methods and &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c4g.11186623.help-menu-28066.d_0_1_1.4db82b05p3Gg0G">billable items</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a> of Serverless StarRocks.
     * Note the following when you call this operation:</p>
     * <ul>
     * <li>You can change the number of compute units (CUs) in a compute group only for Standard Edition instances. This feature is not supported for Starter Edition instances.</li>
     * <li>You can increase the disk size only for instances that have a standard compute group specification.</li>
     * <li>The instance must be in the Running state.
     * After you change the number of CUs, the billing changes as follows:</li>
     * <li>Pay-as-you-go: You are billed based on the new number of CUs.</li>
     * <li>Subscription: The system calculates the supplementary fee based on the price difference between the old and new configurations and the remaining days in the billing cycle. The calculation starts from 00:00 on the following day.</li>
     * </ul>
     * 
     * @param request the request parameters of QueryModifyChargeTypePrice  QueryModifyChargeTypePriceRequest
     * @return QueryModifyChargeTypePriceResponse
     */
    CompletableFuture<QueryModifyChargeTypePriceResponse> queryModifyChargeTypePrice(QueryModifyChargeTypePriceRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you fully understand the billing method and &lt;props=&quot;china&quot;&gt;<a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items">billable items</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a> of Serverless StarRocks.
     * When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>Only standard instances support modifying the CU count of a compute group. Starter instances do not support this operation.</li>
     * <li>Only instances whose compute group specification type is Standard (standard) support increasing the number of disks.</li>
     * <li>The instance must be in the Running state.
     * After you modify the CU count, billing changes are as follows:</li>
     * <li>Pay-as-you-go: You are billed based on the new CU count.</li>
     * <li>Subscription: Within the billing cycle, the supplemental fee is calculated based on the price difference between the old and new configurations and the remaining days (from 00:00 of the next day to the end of the validity period).</li>
     * </ul>
     * 
     * @param request the request parameters of QueryModifyCuPrice  QueryModifyCuPriceRequest
     * @return QueryModifyCuPriceResponse
     */
    CompletableFuture<QueryModifyCuPriceResponse> queryModifyCuPrice(QueryModifyCuPriceRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, review the billing methods and &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c4g.11186623.help-menu-28066.d_0_1_1.4db82b05p3Gg0G">billable items</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a> for Serverless StarRocks.</p>
     * <ul>
     * <li>You can increase the disk count only for Standard Edition instances. You cannot increase the disk count for Starter Edition instances.</li>
     * <li>You can increase the disk count only for instances with a compute group specification type of Standard Edition (standard).</li>
     * <li>The instance must be in the Running state.
     * After you increase the disk count, billing changes as follows:</li>
     * <li>Pay-as-you-go: Billing is based on the new disk type.</li>
     * <li>Subscription: During the billing cycle, the additional fee is calculated based on the price difference between the new and original configurations and the remaining days—from 00:00 the next day to the end of the validity period.</li>
     * </ul>
     * 
     * @param request the request parameters of QueryModifyDiskNumberPrice  QueryModifyDiskNumberPriceRequest
     * @return QueryModifyDiskNumberPriceResponse
     */
    CompletableFuture<QueryModifyDiskNumberPriceResponse> queryModifyDiskNumberPrice(QueryModifyDiskNumberPriceRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing methods and &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/product/ecs?_p_lc=1#pricing">pricing</a> of Serverless StarRocks.
     * Note the following when you call this operation:</p>
     * <ul>
     * <li>Only standard instances support disk upgrade or downgrade. Entry-level instances do not.</li>
     * <li>Only instances with a standard compute group specification support disk upgrade or downgrade.</li>
     * <li>The instance must be in the running state.</li>
     * <li>You cannot downgrade the disk to performance level (PL) 0.</li>
     * <li>The performance level of an Enhanced SSD (ESSD) is limited by its capacity. If you cannot upgrade the performance level, scale out the disk and try again. For more information, see &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/ecs/user-guide/essds">ESSDs</a>.
     * After you upgrade or downgrade a disk, the billing changes as follows:</li>
     * <li>Pay-as-you-go: You are charged based on the new disk type.</li>
     * <li>Subscription: A supplementary fee is calculated based on the price difference between the new and old configurations and the remaining days in the subscription period, starting from 00:00 on the following day.</li>
     * </ul>
     * 
     * @param request the request parameters of QueryModifyDiskPerformanceLevelPrice  QueryModifyDiskPerformanceLevelPriceRequest
     * @return QueryModifyDiskPerformanceLevelPriceResponse
     */
    CompletableFuture<QueryModifyDiskPerformanceLevelPriceResponse> queryModifyDiskPerformanceLevelPrice(QueryModifyDiskPerformanceLevelPriceRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure you understand the billing methods and &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c4g.11186623.help-menu-28066.d_0_1_1.4db82b05p3Gg0G">billable items</a> &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a> of Serverless StarRocks. When you call this operation, note the following:</p>
     * <ul>
     * <li>Disk scale-out is supported only for standard instances. It is not supported for entry-level instances.</li>
     * <li>Disk scale-out is supported only for instances that use the standard compute group specification.</li>
     * <li>The instance must be in the Running state.
     * After you scale out the disk, the billing changes are as follows:</li>
     * <li>Pay-as-you-go: You are billed for the new disk size.</li>
     * <li>Subscription: A supplementary fee is calculated based on the price difference between the old and new configurations and the remaining days in your subscription. The remaining days are calculated from 00:00 on the next day until the subscription expires.</li>
     * </ul>
     * 
     * @param request the request parameters of QueryModifyDiskSizePrice  QueryModifyDiskSizePriceRequest
     * @return QueryModifyDiskSizePriceResponse
     */
    CompletableFuture<QueryModifyDiskSizePriceResponse> queryModifyDiskSizePrice(QueryModifyDiskSizePriceRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this API, make sure that you understand the billing methods and &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c4g.11186623.help-menu-28066.d_0_1_1.4db82b05p3Gg0G">billable items</a> &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a> of the Serverless StarRocks product. Take note of the following:</p>
     * <ul>
     * <li>Only standard instances support disk scale-out. Entry-level instances do not.</li>
     * <li>Only instances that have a compute group of the Standard Edition (standard) specification type support disk scale-out.</li>
     * <li>Instances must be in the running (Running) state.
     * After a disk scale-out, the billing changes as follows:</li>
     * <li>Pay-as-you-go: You are billed based on the new disk size.</li>
     * <li>Subscription: A supplemental fee is calculated based on the price difference between the new and old configurations for the remaining duration of the subscription. The remaining duration is calculated from 00:00 on the next day until the subscription expires.</li>
     * </ul>
     * 
     * @param request the request parameters of QueryModifyDiskTypePrice  QueryModifyDiskTypePriceRequest
     * @return QueryModifyDiskTypePriceResponse
     */
    CompletableFuture<QueryModifyDiskTypePriceResponse> queryModifyDiskTypePrice(QueryModifyDiskTypePriceRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this API, make sure you understand the billing methods and &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c4g.11186623.help-menu-28066.d_0_1_1.4db82b05p3Gg0G">billable items</a> &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a> of Serverless StarRocks.
     * When you call this API, note the following:</p>
     * <ul>
     * <li>You can change the number of nodes in a compute group only for standard instances. This operation is not supported for entry-level instances.</li>
     * <li>The instance must be in the Running state.</li>
     * <li>The number of frontend (FE) nodes cannot be an even number. You cannot scale in FE nodes.
     * After you change the number of nodes, billing is affected as follows:</li>
     * <li>Pay-as-you-go: You are charged based on the new number of nodes.</li>
     * <li>Subscription: A supplemental fee is calculated based on the price difference between the old and new configurations and the number of remaining days in the subscription period. The remaining period is calculated from 00:00 of the next day until the subscription expires.</li>
     * </ul>
     * 
     * @param request the request parameters of QueryModifyNodeNumberPrice  QueryModifyNodeNumberPriceRequest
     * @return QueryModifyNodeNumberPriceResponse
     */
    CompletableFuture<QueryModifyNodeNumberPriceResponse> queryModifyNodeNumberPrice(QueryModifyNodeNumberPriceRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, ensure that you understand the billing methods and &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c4g.11186623.help-menu-28066.d_0_1_1.4db82b05p3Gg0G">billable items</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a> of Serverless StarRocks. Note the following:</p>
     * <ul>
     * <li>Only standard instances support disk scale-out. Basic instances do not.</li>
     * <li>Only instances with the Standard (standard) compute group specification type support disk scale-out.</li>
     * <li>The instance must be in the Running state.
     * After a disk scale-out, the billing changes are as follows:</li>
     * <li>Pay-as-you-go: You are billed based on the new disk size.</li>
     * <li>Subscription: A supplementary fee is calculated based on the price difference between the old and new configurations and the number of remaining days in the subscription period (from 00:00 on the next day to the end of the validity period).</li>
     * </ul>
     * 
     * @param request the request parameters of QueryModifySpecTypePrice  QueryModifySpecTypePriceRequest
     * @return QueryModifySpecTypePriceResponse
     */
    CompletableFuture<QueryModifySpecTypePriceResponse> queryModifySpecTypePrice(QueryModifySpecTypePriceRequest request);

    /**
     * <b>description</b> :
     * <p>Before you use this API, review the billing model and &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c4g.11186623.help-menu-28066.d_0_1_1.4db82b05p3Gg0G">billable items</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a> for Serverless StarRocks.</p>
     * 
     * @param request the request parameters of QueryPriceV1  QueryPriceV1Request
     * @return QueryPriceV1Response
     */
    CompletableFuture<QueryPriceV1Response> queryPriceV1(QueryPriceV1Request request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Danger: 
     * After you release an instance, Alibaba Cloud reclaims all physical resources used by the instance. All associated data is permanently lost and cannot be recovered.</p>
     * </blockquote>
     * 
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
     * <b>description</b> :
     * <p>Queries the unpaid orders of a compute group or cluster.</p>
     * 
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
     * <b>description</b> :
     * <p>This operation is asynchronous. The instance does not reboot immediately. After a successful call, the instance enters the Rebooting state. The reboot is complete when the instance status changes to Running.</p>
     * 
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
     * <b>description</b> :
     * <p>Before you call this API, make sure that you fully understand the billing model and &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c4g.11186623.help-menu-28066.d_0_1_1.4db82b05p3Gg0G">billable items</a> &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/en/emr/emr-serverless-starrocks/product-overview/billable-items?spm=a2c63.p38356.help-menu-28066.d_0_1_0.3aaf4b0b69jN1P">billable items</a> of Serverless StarRocks.
     * When you call this API, note that only subscription instances can be renewed.</p>
     * 
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
     * <b>description</b> :
     * <p>This operation is asynchronous. The instance does not restart immediately. After you call the operation successfully, the instance enters the restarting state. When the instance status changes to running, the restart is complete.</p>
     * 
     * @param request the request parameters of RestartNodeGroup  RestartNodeGroupRequest
     * @return RestartNodeGroupResponse
     */
    CompletableFuture<RestartNodeGroupResponse> restartNodeGroup(RestartNodeGroupRequest request);

    /**
     * <b>description</b> :
     * <p>This API is asynchronous. The instance restart is not immediate. After a successful call, the instance enters the restarting state. The restart is complete when the returned status is running.</p>
     * 
     * @param request the request parameters of RestartNodes  RestartNodesRequest
     * @return RestartNodesResponse
     */
    CompletableFuture<RestartNodesResponse> restartNodes(RestartNodesRequest request);

    /**
     * <b>description</b> :
     * <p>This is an asynchronous API. The instance does not restart immediately. After you call this API successfully, the instance enters the restarting state. When the instance status changes to running, the restore is complete.</p>
     * 
     * @param request the request parameters of RestoreInstance  RestoreInstanceRequest
     * @return RestoreInstanceResponse
     */
    CompletableFuture<RestoreInstanceResponse> restoreInstance(RestoreInstanceRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Danger: 
     * When you release an instance, its physical resources are reclaimed. All data on the instance is lost and cannot be recovered.</p>
     * </blockquote>
     * 
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
     * <b>description</b> :
     * <p>Switches the active and standby zones.</p>
     * 
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
     * <b>description</b> :
     * <blockquote>
     * <p>Danger: 
     * After you release an instance, Alibaba Cloud reclaims all physical resources used by the instance. All associated data is permanently lost and cannot be recovered.</p>
     * </blockquote>
     * 
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
     * <b>description</b> :
     * <p>Updates the number of gateway nodes.</p>
     * 
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
