// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs_workbench20251111;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.ecs_workbench20251111.models.*;
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
     * <b>description</b> :
     * <p>查询Workbench终端配置</p>
     * 
     * @param request the request parameters of DescribeTerminalSettings  DescribeTerminalSettingsRequest
     * @return DescribeTerminalSettingsResponse
     */
    CompletableFuture<DescribeTerminalSettingsResponse> describeTerminalSettings(DescribeTerminalSettingsRequest request);

    /**
     * <b>description</b> :
     * <p>修改Workbench终端配置</p>
     * 
     * @param request the request parameters of ModifyTerminalSettings  ModifyTerminalSettingsRequest
     * @return ModifyTerminalSettingsResponse
     */
    CompletableFuture<ModifyTerminalSettingsResponse> modifyTerminalSettings(ModifyTerminalSettingsRequest request);

}
