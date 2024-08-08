// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailadvqa20230417;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.retailadvqa20230417.models.*;
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

    CompletableFuture<AddMemberBasicInfoResponse> addMemberBasicInfo(AddMemberBasicInfoRequest request);

    CompletableFuture<BatchSaveOrderPopResponse> batchSaveOrderPop(BatchSaveOrderPopRequest request);

    CompletableFuture<CalculateMemberLevelResponse> calculateMemberLevel(CalculateMemberLevelRequest request);

    CompletableFuture<EditMemberBasicInfoResponse> editMemberBasicInfo(EditMemberBasicInfoRequest request);

    CompletableFuture<MemberAccountDetailPageQueryResponse> memberAccountDetailPageQuery(MemberAccountDetailPageQueryRequest request);

    CompletableFuture<MemberPointChangeResponse> memberPointChange(MemberPointChangeRequest request);

    CompletableFuture<QueryMemberBasicInfoResponse> queryMemberBasicInfo(QueryMemberBasicInfoRequest request);

    CompletableFuture<SyncCardInfoResponse> syncCardInfo(SyncCardInfoRequest request);

    CompletableFuture<SyncMemberBehaviorInfoResponse> syncMemberBehaviorInfo(SyncMemberBehaviorInfoRequest request);

}
