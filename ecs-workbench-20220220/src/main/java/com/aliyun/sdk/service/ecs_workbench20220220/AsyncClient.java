// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs_workbench20220220;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.ecs_workbench20220220.models.*;
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
     * @param request the request parameters of GetInstanceRecordConfig  GetInstanceRecordConfigRequest
     * @return GetInstanceRecordConfigResponse
     */
    CompletableFuture<GetInstanceRecordConfigResponse> getInstanceRecordConfig(GetInstanceRecordConfigRequest request);

    /**
     * @param request the request parameters of ListInstanceRecords  ListInstanceRecordsRequest
     * @return ListInstanceRecordsResponse
     */
    CompletableFuture<ListInstanceRecordsResponse> listInstanceRecords(ListInstanceRecordsRequest request);

    /**
     * @param request the request parameters of ListTerminalCommands  ListTerminalCommandsRequest
     * @return ListTerminalCommandsResponse
     */
    CompletableFuture<ListTerminalCommandsResponse> listTerminalCommands(ListTerminalCommandsRequest request);

    /**
     * @param request the request parameters of LoginInstance  LoginInstanceRequest
     * @return LoginInstanceResponse
     */
    CompletableFuture<LoginInstanceResponse> loginInstance(LoginInstanceRequest request);

    /**
     * @param request the request parameters of SetInstanceRecordConfig  SetInstanceRecordConfigRequest
     * @return SetInstanceRecordConfigResponse
     */
    CompletableFuture<SetInstanceRecordConfigResponse> setInstanceRecordConfig(SetInstanceRecordConfigRequest request);

    /**
     * @param request the request parameters of ViewInstanceRecords  ViewInstanceRecordsRequest
     * @return ViewInstanceRecordsResponse
     */
    CompletableFuture<ViewInstanceRecordsResponse> viewInstanceRecords(ViewInstanceRecordsRequest request);

}
