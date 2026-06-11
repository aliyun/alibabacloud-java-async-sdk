// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aisc20260101;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.aisc20260101.models.*;
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
     * @param request the request parameters of CreateSkillFileCheck  CreateSkillFileCheckRequest
     * @return CreateSkillFileCheckResponse
     */
    CompletableFuture<CreateSkillFileCheckResponse> createSkillFileCheck(CreateSkillFileCheckRequest request);

    /**
     * @param request the request parameters of ListSubTasks  ListSubTasksRequest
     * @return ListSubTasksResponse
     */
    CompletableFuture<ListSubTasksResponse> listSubTasks(ListSubTasksRequest request);

}
