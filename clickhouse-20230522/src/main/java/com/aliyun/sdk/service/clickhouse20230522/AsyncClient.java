// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20230522;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.clickhouse20230522.models.*;
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
     * @param request the request parameters of CreateAccount  CreateAccountRequest
     * @return CreateAccountResponse
     */
    CompletableFuture<CreateAccountResponse> createAccount(CreateAccountRequest request);

    /**
     * @param request the request parameters of CreateDB  CreateDBRequest
     * @return CreateDBResponse
     */
    CompletableFuture<CreateDBResponse> createDB(CreateDBRequest request);

    /**
     * @param request the request parameters of CreateDBInstance  CreateDBInstanceRequest
     * @return CreateDBInstanceResponse
     */
    CompletableFuture<CreateDBInstanceResponse> createDBInstance(CreateDBInstanceRequest request);

    /**
     * @param request the request parameters of CreateEndpoint  CreateEndpointRequest
     * @return CreateEndpointResponse
     */
    CompletableFuture<CreateEndpointResponse> createEndpoint(CreateEndpointRequest request);

    /**
     * @param request the request parameters of DeleteAccount  DeleteAccountRequest
     * @return DeleteAccountResponse
     */
    CompletableFuture<DeleteAccountResponse> deleteAccount(DeleteAccountRequest request);

    /**
     * @param request the request parameters of DeleteDB  DeleteDBRequest
     * @return DeleteDBResponse
     */
    CompletableFuture<DeleteDBResponse> deleteDB(DeleteDBRequest request);

    /**
     * @param request the request parameters of DeleteDBInstance  DeleteDBInstanceRequest
     * @return DeleteDBInstanceResponse
     */
    CompletableFuture<DeleteDBInstanceResponse> deleteDBInstance(DeleteDBInstanceRequest request);

    /**
     * @param request the request parameters of DeleteEndpoint  DeleteEndpointRequest
     * @return DeleteEndpointResponse
     */
    CompletableFuture<DeleteEndpointResponse> deleteEndpoint(DeleteEndpointRequest request);

    /**
     * @param request the request parameters of DescribeAccountAuthority  DescribeAccountAuthorityRequest
     * @return DescribeAccountAuthorityResponse
     */
    CompletableFuture<DescribeAccountAuthorityResponse> describeAccountAuthority(DescribeAccountAuthorityRequest request);

    /**
     * @param request the request parameters of DescribeAccounts  DescribeAccountsRequest
     * @return DescribeAccountsResponse
     */
    CompletableFuture<DescribeAccountsResponse> describeAccounts(DescribeAccountsRequest request);

    /**
     * @param request the request parameters of DescribeDBInstanceAttribute  DescribeDBInstanceAttributeRequest
     * @return DescribeDBInstanceAttributeResponse
     */
    CompletableFuture<DescribeDBInstanceAttributeResponse> describeDBInstanceAttribute(DescribeDBInstanceAttributeRequest request);

    /**
     * @param request the request parameters of DescribeDBInstanceDataSources  DescribeDBInstanceDataSourcesRequest
     * @return DescribeDBInstanceDataSourcesResponse
     */
    CompletableFuture<DescribeDBInstanceDataSourcesResponse> describeDBInstanceDataSources(DescribeDBInstanceDataSourcesRequest request);

    /**
     * @param request the request parameters of DescribeDBInstances  DescribeDBInstancesRequest
     * @return DescribeDBInstancesResponse
     */
    CompletableFuture<DescribeDBInstancesResponse> describeDBInstances(DescribeDBInstancesRequest request);

    /**
     * @param request the request parameters of DescribeEndpoints  DescribeEndpointsRequest
     * @return DescribeEndpointsResponse
     */
    CompletableFuture<DescribeEndpointsResponse> describeEndpoints(DescribeEndpointsRequest request);

    /**
     * @param request the request parameters of DescribeProcessList  DescribeProcessListRequest
     * @return DescribeProcessListResponse
     */
    CompletableFuture<DescribeProcessListResponse> describeProcessList(DescribeProcessListRequest request);

    /**
     * @param request the request parameters of DescribeSecurityIPList  DescribeSecurityIPListRequest
     * @return DescribeSecurityIPListResponse
     */
    CompletableFuture<DescribeSecurityIPListResponse> describeSecurityIPList(DescribeSecurityIPListRequest request);

    /**
     * @param request the request parameters of DescribeSlowLogRecords  DescribeSlowLogRecordsRequest
     * @return DescribeSlowLogRecordsResponse
     */
    CompletableFuture<DescribeSlowLogRecordsResponse> describeSlowLogRecords(DescribeSlowLogRecordsRequest request);

    /**
     * @param request the request parameters of DescribeSlowLogTrend  DescribeSlowLogTrendRequest
     * @return DescribeSlowLogTrendResponse
     */
    CompletableFuture<DescribeSlowLogTrendResponse> describeSlowLogTrend(DescribeSlowLogTrendRequest request);

    /**
     * @param request the request parameters of KillProcess  KillProcessRequest
     * @return KillProcessResponse
     */
    CompletableFuture<KillProcessResponse> killProcess(KillProcessRequest request);

    /**
     * @param request the request parameters of ModifyAccountAuthority  ModifyAccountAuthorityRequest
     * @return ModifyAccountAuthorityResponse
     */
    CompletableFuture<ModifyAccountAuthorityResponse> modifyAccountAuthority(ModifyAccountAuthorityRequest request);

    /**
     * @param request the request parameters of ModifyAccountDescription  ModifyAccountDescriptionRequest
     * @return ModifyAccountDescriptionResponse
     */
    CompletableFuture<ModifyAccountDescriptionResponse> modifyAccountDescription(ModifyAccountDescriptionRequest request);

    /**
     * @param request the request parameters of ModifyDBInstanceAttribute  ModifyDBInstanceAttributeRequest
     * @return ModifyDBInstanceAttributeResponse
     */
    CompletableFuture<ModifyDBInstanceAttributeResponse> modifyDBInstanceAttribute(ModifyDBInstanceAttributeRequest request);

    /**
     * @param request the request parameters of ModifyDBInstanceClass  ModifyDBInstanceClassRequest
     * @return ModifyDBInstanceClassResponse
     */
    CompletableFuture<ModifyDBInstanceClassResponse> modifyDBInstanceClass(ModifyDBInstanceClassRequest request);

    /**
     * @param request the request parameters of ModifyDBInstanceConnectionString  ModifyDBInstanceConnectionStringRequest
     * @return ModifyDBInstanceConnectionStringResponse
     */
    CompletableFuture<ModifyDBInstanceConnectionStringResponse> modifyDBInstanceConnectionString(ModifyDBInstanceConnectionStringRequest request);

    /**
     * @param request the request parameters of ModifySecurityIPList  ModifySecurityIPListRequest
     * @return ModifySecurityIPListResponse
     */
    CompletableFuture<ModifySecurityIPListResponse> modifySecurityIPList(ModifySecurityIPListRequest request);

    /**
     * @param request the request parameters of ResetAccountPassword  ResetAccountPasswordRequest
     * @return ResetAccountPasswordResponse
     */
    CompletableFuture<ResetAccountPasswordResponse> resetAccountPassword(ResetAccountPasswordRequest request);

    /**
     * @param request the request parameters of RestartDBInstance  RestartDBInstanceRequest
     * @return RestartDBInstanceResponse
     */
    CompletableFuture<RestartDBInstanceResponse> restartDBInstance(RestartDBInstanceRequest request);

    /**
     * @param request the request parameters of StartDBInstance  StartDBInstanceRequest
     * @return StartDBInstanceResponse
     */
    CompletableFuture<StartDBInstanceResponse> startDBInstance(StartDBInstanceRequest request);

    /**
     * @param request the request parameters of StopDBInstance  StopDBInstanceRequest
     * @return StopDBInstanceResponse
     */
    CompletableFuture<StopDBInstanceResponse> stopDBInstance(StopDBInstanceRequest request);

    /**
     * @param request the request parameters of UpgradeMinorVersion  UpgradeMinorVersionRequest
     * @return UpgradeMinorVersionResponse
     */
    CompletableFuture<UpgradeMinorVersionResponse> upgradeMinorVersion(UpgradeMinorVersionRequest request);

}
