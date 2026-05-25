// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emas_appmonitor20190611;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.emas_appmonitor20190611.models.*;
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
     * @param request the request parameters of CreateTlogTask  CreateTlogTaskRequest
     * @return CreateTlogTaskResponse
     */
    CompletableFuture<CreateTlogTaskResponse> createTlogTask(CreateTlogTaskRequest request);

    /**
     * @param request the request parameters of GetError  GetErrorRequest
     * @return GetErrorResponse
     */
    CompletableFuture<GetErrorResponse> getError(GetErrorRequest request);

    /**
     * @param request the request parameters of GetErrors  GetErrorsRequest
     * @return GetErrorsResponse
     */
    CompletableFuture<GetErrorsResponse> getErrors(GetErrorsRequest request);

    /**
     * @param request the request parameters of GetIssue  GetIssueRequest
     * @return GetIssueResponse
     */
    CompletableFuture<GetIssueResponse> getIssue(GetIssueRequest request);

    /**
     * @param request the request parameters of GetIssues  GetIssuesRequest
     * @return GetIssuesResponse
     */
    CompletableFuture<GetIssuesResponse> getIssues(GetIssuesRequest request);

    /**
     * @param request the request parameters of GetSymbolicFiles  GetSymbolicFilesRequest
     * @return GetSymbolicFilesResponse
     */
    CompletableFuture<GetSymbolicFilesResponse> getSymbolicFiles(GetSymbolicFilesRequest request);

    /**
     * @param request the request parameters of GetTlogCollectList  GetTlogCollectListRequest
     * @return GetTlogCollectListResponse
     */
    CompletableFuture<GetTlogCollectListResponse> getTlogCollectList(GetTlogCollectListRequest request);

    /**
     * @param request the request parameters of GetTlogDeviceInfo  GetTlogDeviceInfoRequest
     * @return GetTlogDeviceInfoResponse
     */
    CompletableFuture<GetTlogDeviceInfoResponse> getTlogDeviceInfo(GetTlogDeviceInfoRequest request);

    /**
     * @param request the request parameters of GetTlogDeviceList  GetTlogDeviceListRequest
     * @return GetTlogDeviceListResponse
     */
    CompletableFuture<GetTlogDeviceListResponse> getTlogDeviceList(GetTlogDeviceListRequest request);

    /**
     * @param request the request parameters of GetTlogTaskCollections  GetTlogTaskCollectionsRequest
     * @return GetTlogTaskCollectionsResponse
     */
    CompletableFuture<GetTlogTaskCollectionsResponse> getTlogTaskCollections(GetTlogTaskCollectionsRequest request);

    /**
     * @param request the request parameters of GetTlogTaskInfo  GetTlogTaskInfoRequest
     * @return GetTlogTaskInfoResponse
     */
    CompletableFuture<GetTlogTaskInfoResponse> getTlogTaskInfo(GetTlogTaskInfoRequest request);

    /**
     * @param request the request parameters of RequestUploadToken  RequestUploadTokenRequest
     * @return RequestUploadTokenResponse
     */
    CompletableFuture<RequestUploadTokenResponse> requestUploadToken(RequestUploadTokenRequest request);

    /**
     * @param request the request parameters of SearchTlog  SearchTlogRequest
     * @return SearchTlogResponse
     */
    CompletableFuture<SearchTlogResponse> searchTlog(SearchTlogRequest request);

    /**
     * @param request the request parameters of SubmitSymbolic  SubmitSymbolicRequest
     * @return SubmitSymbolicResponse
     */
    CompletableFuture<SubmitSymbolicResponse> submitSymbolic(SubmitSymbolicRequest request);

}
