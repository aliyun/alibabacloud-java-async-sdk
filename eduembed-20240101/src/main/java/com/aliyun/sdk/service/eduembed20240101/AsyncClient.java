// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eduembed20240101;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.eduembed20240101.models.*;
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

    CompletableFuture<CreateLabReservationResponse> createLabReservation(CreateLabReservationRequest request);

    CompletableFuture<CreateLabSessionResponse> createLabSession(CreateLabSessionRequest request);

    CompletableFuture<DescribeLabResponse> describeLab(DescribeLabRequest request);

    CompletableFuture<DescribeLabReservationResponse> describeLabReservation(DescribeLabReservationRequest request);

    CompletableFuture<DescribeLabSessionResponse> describeLabSession(DescribeLabSessionRequest request);

    CompletableFuture<PageListLabReservationsResponse> pageListLabReservations(PageListLabReservationsRequest request);

    CompletableFuture<PageListLabSessionsResponse> pageListLabSessions(PageListLabSessionsRequest request);

    CompletableFuture<PageListLabsResponse> pageListLabs(PageListLabsRequest request);

    CompletableFuture<RemoveLabReservationResponse> removeLabReservation(RemoveLabReservationRequest request);

}
