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
     * @param request the request parameters of CheckCreateDBInstance  CheckCreateDBInstanceRequest
     * @return CheckCreateDBInstanceResponse
     */
    CompletableFuture<CheckCreateDBInstanceResponse> checkCreateDBInstance(CheckCreateDBInstanceRequest request);

    /**
     * @param request the request parameters of CheckServiceLinkedRole  CheckServiceLinkedRoleRequest
     * @return CheckServiceLinkedRoleResponse
     */
    CompletableFuture<CheckServiceLinkedRoleResponse> checkServiceLinkedRole(CheckServiceLinkedRoleRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>: For an instance that uses the pay-as-you-go billing method, you can create only pay-as-you-go clusters. For an instance that uses the subscription billing method, you can create pay-as-you-go or subscription clusters.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateDBCluster  CreateDBClusterRequest
     * @return CreateDBClusterResponse
     */
    CompletableFuture<CreateDBClusterResponse> createDBCluster(CreateDBClusterRequest request);

    /**
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
     * @param request the request parameters of DeleteDBCluster  DeleteDBClusterRequest
     * @return DeleteDBClusterResponse
     */
    CompletableFuture<DeleteDBClusterResponse> deleteDBCluster(DeleteDBClusterRequest request);

    /**
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
     * @param request the request parameters of DescribeSecurityIPList  DescribeSecurityIPListRequest
     * @return DescribeSecurityIPListResponse
     */
    CompletableFuture<DescribeSecurityIPListResponse> describeSecurityIPList(DescribeSecurityIPListRequest request);

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
     * @param request the request parameters of UpgradeDBInstanceEngineVersion  UpgradeDBInstanceEngineVersionRequest
     * @return UpgradeDBInstanceEngineVersionResponse
     */
    CompletableFuture<UpgradeDBInstanceEngineVersionResponse> upgradeDBInstanceEngineVersion(UpgradeDBInstanceEngineVersionRequest request);

}
