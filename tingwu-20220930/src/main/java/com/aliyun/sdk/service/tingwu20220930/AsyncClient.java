// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tingwu20220930;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.tingwu20220930.models.*;
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

    CompletableFuture<CreateFileTransResponse> createFileTrans(CreateFileTransRequest request);

    CompletableFuture<CreateMeetingTransResponse> createMeetingTrans(CreateMeetingTransRequest request);

    CompletableFuture<GetFileTransResponse> getFileTrans(GetFileTransRequest request);

    CompletableFuture<GetMeetingTransResponse> getMeetingTrans(GetMeetingTransRequest request);

    CompletableFuture<StopMeetingTransResponse> stopMeetingTrans(StopMeetingTransRequest request);

}
