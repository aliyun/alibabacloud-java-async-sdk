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

    /**
     * @param request the request parameters of CreateLabReservation  CreateLabReservationRequest
     * @return CreateLabReservationResponse
     */
    CompletableFuture<CreateLabReservationResponse> createLabReservation(CreateLabReservationRequest request);

    /**
     * @param request the request parameters of CreateLabSession  CreateLabSessionRequest
     * @return CreateLabSessionResponse
     */
    CompletableFuture<CreateLabSessionResponse> createLabSession(CreateLabSessionRequest request);

    /**
     * @param request the request parameters of DescribeCourse  DescribeCourseRequest
     * @return DescribeCourseResponse
     */
    CompletableFuture<DescribeCourseResponse> describeCourse(DescribeCourseRequest request);

    /**
     * @param request the request parameters of DescribeCourseLesson  DescribeCourseLessonRequest
     * @return DescribeCourseLessonResponse
     */
    CompletableFuture<DescribeCourseLessonResponse> describeCourseLesson(DescribeCourseLessonRequest request);

    /**
     * @param request the request parameters of DescribeLab  DescribeLabRequest
     * @return DescribeLabResponse
     */
    CompletableFuture<DescribeLabResponse> describeLab(DescribeLabRequest request);

    /**
     * @param request the request parameters of DescribeLabReservation  DescribeLabReservationRequest
     * @return DescribeLabReservationResponse
     */
    CompletableFuture<DescribeLabReservationResponse> describeLabReservation(DescribeLabReservationRequest request);

    /**
     * @param request the request parameters of DescribeLabSession  DescribeLabSessionRequest
     * @return DescribeLabSessionResponse
     */
    CompletableFuture<DescribeLabSessionResponse> describeLabSession(DescribeLabSessionRequest request);

    /**
     * @param request the request parameters of ListCourses  ListCoursesRequest
     * @return ListCoursesResponse
     */
    CompletableFuture<ListCoursesResponse> listCourses(ListCoursesRequest request);

    /**
     * @param request the request parameters of PageListLabReservations  PageListLabReservationsRequest
     * @return PageListLabReservationsResponse
     */
    CompletableFuture<PageListLabReservationsResponse> pageListLabReservations(PageListLabReservationsRequest request);

    /**
     * @param request the request parameters of PageListLabSessions  PageListLabSessionsRequest
     * @return PageListLabSessionsResponse
     */
    CompletableFuture<PageListLabSessionsResponse> pageListLabSessions(PageListLabSessionsRequest request);

    /**
     * @param request the request parameters of PageListLabs  PageListLabsRequest
     * @return PageListLabsResponse
     */
    CompletableFuture<PageListLabsResponse> pageListLabs(PageListLabsRequest request);

    /**
     * @param request the request parameters of RemoveLabReservation  RemoveLabReservationRequest
     * @return RemoveLabReservationResponse
     */
    CompletableFuture<RemoveLabReservationResponse> removeLabReservation(RemoveLabReservationRequest request);

}
