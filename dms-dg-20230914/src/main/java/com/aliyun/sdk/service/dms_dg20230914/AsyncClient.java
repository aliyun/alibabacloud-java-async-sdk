// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_dg20230914;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.dms_dg20230914.models.*;
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

    CompletableFuture<AddDatabaseResponse> addDatabase(AddDatabaseRequest request);

    CompletableFuture<AddDatabaseListResponse> addDatabaseList(AddDatabaseListRequest request);

    CompletableFuture<CheckDGEnabledResponse> checkDGEnabled(CheckDGEnabledRequest request);

    CompletableFuture<ConnectDatabaseResponse> connectDatabase(ConnectDatabaseRequest request);

    CompletableFuture<CreateGatewayResponse> createGateway(CreateGatewayRequest request);

    CompletableFuture<CreateGatewayVerifyCodeResponse> createGatewayVerifyCode(CreateGatewayVerifyCodeRequest request);

    CompletableFuture<DeleteDatabaseResponse> deleteDatabase(DeleteDatabaseRequest request);

    CompletableFuture<DeleteGatewayResponse> deleteGateway(DeleteGatewayRequest request);

    CompletableFuture<DeleteGatewayInstanceResponse> deleteGatewayInstance(DeleteGatewayInstanceRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<DownloadGatewayProgramResponse> downloadGatewayProgram(DownloadGatewayProgramRequest request);

    CompletableFuture<FindUserGatewayByIdResponse> findUserGatewayById(FindUserGatewayByIdRequest request);

    CompletableFuture<GetUserDatabasesResponse> getUserDatabases(GetUserDatabasesRequest request);

    CompletableFuture<GetUserGatewayInstancesResponse> getUserGatewayInstances(GetUserGatewayInstancesRequest request);

    CompletableFuture<GetUserGatewaysResponse> getUserGateways(GetUserGatewaysRequest request);

    CompletableFuture<ListDatabaseAccessPointResponse> listDatabaseAccessPoint(ListDatabaseAccessPointRequest request);

    CompletableFuture<ModifyDatabaseResponse> modifyDatabase(ModifyDatabaseRequest request);

    CompletableFuture<ModifyGatewayResponse> modifyGateway(ModifyGatewayRequest request);

    CompletableFuture<RetryDatabaseResponse> retryDatabase(RetryDatabaseRequest request);

    CompletableFuture<StopGatewayResponse> stopGateway(StopGatewayRequest request);

}
