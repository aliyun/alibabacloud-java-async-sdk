// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20171016;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.drds20171016.models.*;
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

    CompletableFuture<CreateDrdsAccountResponse> createDrdsAccount(CreateDrdsAccountRequest request);

    CompletableFuture<CreateDrdsDBResponse> createDrdsDB(CreateDrdsDBRequest request);

    CompletableFuture<CreateDrdsInstanceResponse> createDrdsInstance(CreateDrdsInstanceRequest request);

    CompletableFuture<CreateReadOnlyAccountResponse> createReadOnlyAccount(CreateReadOnlyAccountRequest request);

    CompletableFuture<DeleteDrdsDBResponse> deleteDrdsDB(DeleteDrdsDBRequest request);

    CompletableFuture<DeleteFailedDrdsDBResponse> deleteFailedDrdsDB(DeleteFailedDrdsDBRequest request);

    CompletableFuture<DescribeCreateDrdsInstanceStatusResponse> describeCreateDrdsInstanceStatus(DescribeCreateDrdsInstanceStatusRequest request);

    CompletableFuture<DescribeDrdsDBResponse> describeDrdsDB(DescribeDrdsDBRequest request);

    CompletableFuture<DescribeDrdsDBIpWhiteListResponse> describeDrdsDBIpWhiteList(DescribeDrdsDBIpWhiteListRequest request);

    CompletableFuture<DescribeDrdsDBsResponse> describeDrdsDBs(DescribeDrdsDBsRequest request);

    CompletableFuture<DescribeDrdsInstanceResponse> describeDrdsInstance(DescribeDrdsInstanceRequest request);

    CompletableFuture<DescribeDrdsInstanceDbMonitorResponse> describeDrdsInstanceDbMonitor(DescribeDrdsInstanceDbMonitorRequest request);

    CompletableFuture<DescribeDrdsInstanceMonitorResponse> describeDrdsInstanceMonitor(DescribeDrdsInstanceMonitorRequest request);

    CompletableFuture<DescribeDrdsInstanceNetInfoForInnerResponse> describeDrdsInstanceNetInfoForInner(DescribeDrdsInstanceNetInfoForInnerRequest request);

    CompletableFuture<DescribeDrdsInstancesResponse> describeDrdsInstances(DescribeDrdsInstancesRequest request);

    CompletableFuture<DescribeRdsListResponse> describeRdsList(DescribeRdsListRequest request);

    CompletableFuture<DescribeReadOnlyAccountResponse> describeReadOnlyAccount(DescribeReadOnlyAccountRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<DescribeShardDBsResponse> describeShardDBs(DescribeShardDBsRequest request);

    CompletableFuture<DescribeShardDbConnectionInfoResponse> describeShardDbConnectionInfo(DescribeShardDbConnectionInfoRequest request);

    CompletableFuture<EnableInstanceResponse> enableInstance(EnableInstanceRequest request);

    CompletableFuture<ModifyDrdsDBPasswdResponse> modifyDrdsDBPasswd(ModifyDrdsDBPasswdRequest request);

    CompletableFuture<ModifyDrdsInstanceDescriptionResponse> modifyDrdsInstanceDescription(ModifyDrdsInstanceDescriptionRequest request);

    CompletableFuture<ModifyDrdsIpWhiteListResponse> modifyDrdsIpWhiteList(ModifyDrdsIpWhiteListRequest request);

    CompletableFuture<ModifyFullTableScanResponse> modifyFullTableScan(ModifyFullTableScanRequest request);

    CompletableFuture<ModifyRdsReadWeightResponse> modifyRdsReadWeight(ModifyRdsReadWeightRequest request);

    CompletableFuture<ModifyReadOnlyAccountPasswordResponse> modifyReadOnlyAccountPassword(ModifyReadOnlyAccountPasswordRequest request);

    CompletableFuture<QueryInstanceInfoByConnResponse> queryInstanceInfoByConn(QueryInstanceInfoByConnRequest request);

    CompletableFuture<RemoveDrdsInstanceResponse> removeDrdsInstance(RemoveDrdsInstanceRequest request);

    CompletableFuture<RemoveReadOnlyAccountResponse> removeReadOnlyAccount(RemoveReadOnlyAccountRequest request);

}
