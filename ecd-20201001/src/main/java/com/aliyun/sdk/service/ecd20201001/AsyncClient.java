// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20201001;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.ecd20201001.models.*;
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
     * @param request the request parameters of CalMcpTool  CalMcpToolRequest
     * @return CalMcpToolResponse
     */
    CompletableFuture<CalMcpToolResponse> calMcpTool(CalMcpToolRequest request);

    /**
     * @param request the request parameters of CreateMcpSession  CreateMcpSessionRequest
     * @return CreateMcpSessionResponse
     */
    CompletableFuture<CreateMcpSessionResponse> createMcpSession(CreateMcpSessionRequest request);

    /**
     * @param request the request parameters of DescribeDesktops  DescribeDesktopsRequest
     * @return DescribeDesktopsResponse
     */
    CompletableFuture<DescribeDesktopsResponse> describeDesktops(DescribeDesktopsRequest request);

    /**
     * @param request the request parameters of DescribeDirectories  DescribeDirectoriesRequest
     * @return DescribeDirectoriesResponse
     */
    CompletableFuture<DescribeDirectoriesResponse> describeDirectories(DescribeDirectoriesRequest request);

    /**
     * @param request the request parameters of GetConnectionTicket  GetConnectionTicketRequest
     * @return GetConnectionTicketResponse
     */
    CompletableFuture<GetConnectionTicketResponse> getConnectionTicket(GetConnectionTicketRequest request);

    /**
     * @param request the request parameters of GetMcpResource  GetMcpResourceRequest
     * @return GetMcpResourceResponse
     */
    CompletableFuture<GetMcpResourceResponse> getMcpResource(GetMcpResourceRequest request);

    /**
     * @param request the request parameters of ListMcpTools  ListMcpToolsRequest
     * @return ListMcpToolsResponse
     */
    CompletableFuture<ListMcpToolsResponse> listMcpTools(ListMcpToolsRequest request);

    /**
     * @param request the request parameters of RebootDesktops  RebootDesktopsRequest
     * @return RebootDesktopsResponse
     */
    CompletableFuture<RebootDesktopsResponse> rebootDesktops(RebootDesktopsRequest request);

    /**
     * @param request the request parameters of ReleaseMcpSession  ReleaseMcpSessionRequest
     * @return ReleaseMcpSessionResponse
     */
    CompletableFuture<ReleaseMcpSessionResponse> releaseMcpSession(ReleaseMcpSessionRequest request);

    /**
     * @param request the request parameters of StartDesktops  StartDesktopsRequest
     * @return StartDesktopsResponse
     */
    CompletableFuture<StartDesktopsResponse> startDesktops(StartDesktopsRequest request);

    /**
     * @param request the request parameters of StopDesktops  StopDesktopsRequest
     * @return StopDesktopsResponse
     */
    CompletableFuture<StopDesktopsResponse> stopDesktops(StopDesktopsRequest request);

}
