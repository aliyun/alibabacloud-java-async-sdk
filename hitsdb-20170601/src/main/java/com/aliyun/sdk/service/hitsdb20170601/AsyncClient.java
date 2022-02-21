// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20170601;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.hitsdb20170601.models.*;
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

    CompletableFuture<CreateHiTSDBInstanceResponse> createHiTSDBInstance(CreateHiTSDBInstanceRequest request);

    CompletableFuture<DeleteHiTSDBInstanceResponse> deleteHiTSDBInstance(DeleteHiTSDBInstanceRequest request);

    CompletableFuture<DescribeHiTSDBInstanceResponse> describeHiTSDBInstance(DescribeHiTSDBInstanceRequest request);

    CompletableFuture<DescribeHiTSDBInstanceListResponse> describeHiTSDBInstanceList(DescribeHiTSDBInstanceListRequest request);

    CompletableFuture<DescribeHiTSDBInstanceSecurityIpListResponse> describeHiTSDBInstanceSecurityIpList(DescribeHiTSDBInstanceSecurityIpListRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<DescribeZonesResponse> describeZones(DescribeZonesRequest request);

    CompletableFuture<ModifyHiTSDBInstanceClassResponse> modifyHiTSDBInstanceClass(ModifyHiTSDBInstanceClassRequest request);

    CompletableFuture<ModifyHiTSDBInstanceSecurityIpListResponse> modifyHiTSDBInstanceSecurityIpList(ModifyHiTSDBInstanceSecurityIpListRequest request);

    CompletableFuture<RenameHiTSDBInstanceAliasResponse> renameHiTSDBInstanceAlias(RenameHiTSDBInstanceAliasRequest request);

    CompletableFuture<RenewTSDBInstanceResponse> renewTSDBInstance(RenewTSDBInstanceRequest request);

    CompletableFuture<RestartHiTSDBInstanceResponse> restartHiTSDBInstance(RestartHiTSDBInstanceRequest request);

    CompletableFuture<SwitchHiTSDBInstancePublicNetResponse> switchHiTSDBInstancePublicNet(SwitchHiTSDBInstancePublicNetRequest request);

}
