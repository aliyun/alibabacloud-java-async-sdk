// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starops20260428;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.starops20260428.models.*;
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
     * @param request the request parameters of CreateChat  CreateChatRequest
     * @return CreateChatResponse
     */
    CompletableFuture<CreateChatResponse> createChat(CreateChatRequest request);

    CompletableFuture<CreateChatResponse> createChatWithRequestBody(CreateChatRequest request, RequestBody requestBody);

<ReturnT> CompletableFuture<ReturnT> createChatWithAsyncResponseHandler(CreateChatRequest request, AsyncResponseHandler<CreateChatResponse, ReturnT> responseHandler);

    ResponseIterable<CreateChatResponseBody> createChatWithResponseIterable(CreateChatRequest request);

    /**
     * @param request the request parameters of CreateDigitalEmployee  CreateDigitalEmployeeRequest
     * @return CreateDigitalEmployeeResponse
     */
    CompletableFuture<CreateDigitalEmployeeResponse> createDigitalEmployee(CreateDigitalEmployeeRequest request);

    /**
     * @param request the request parameters of CreateDigitalEmployeeSkill  CreateDigitalEmployeeSkillRequest
     * @return CreateDigitalEmployeeSkillResponse
     */
    CompletableFuture<CreateDigitalEmployeeSkillResponse> createDigitalEmployeeSkill(CreateDigitalEmployeeSkillRequest request);

    /**
     * @param request the request parameters of CreateMcpService  CreateMcpServiceRequest
     * @return CreateMcpServiceResponse
     */
    CompletableFuture<CreateMcpServiceResponse> createMcpService(CreateMcpServiceRequest request);

    /**
     * @param request the request parameters of CreateThread  CreateThreadRequest
     * @return CreateThreadResponse
     */
    CompletableFuture<CreateThreadResponse> createThread(CreateThreadRequest request);

    /**
     * @param request the request parameters of CreateTicket  CreateTicketRequest
     * @return CreateTicketResponse
     */
    CompletableFuture<CreateTicketResponse> createTicket(CreateTicketRequest request);

    /**
     * @param request the request parameters of DeleteDigitalEmployee  DeleteDigitalEmployeeRequest
     * @return DeleteDigitalEmployeeResponse
     */
    CompletableFuture<DeleteDigitalEmployeeResponse> deleteDigitalEmployee(DeleteDigitalEmployeeRequest request);

    /**
     * @param request the request parameters of DeleteDigitalEmployeeSkill  DeleteDigitalEmployeeSkillRequest
     * @return DeleteDigitalEmployeeSkillResponse
     */
    CompletableFuture<DeleteDigitalEmployeeSkillResponse> deleteDigitalEmployeeSkill(DeleteDigitalEmployeeSkillRequest request);

    /**
     * @param request the request parameters of DeleteMcpService  DeleteMcpServiceRequest
     * @return DeleteMcpServiceResponse
     */
    CompletableFuture<DeleteMcpServiceResponse> deleteMcpService(DeleteMcpServiceRequest request);

    /**
     * @param request the request parameters of DeleteThread  DeleteThreadRequest
     * @return DeleteThreadResponse
     */
    CompletableFuture<DeleteThreadResponse> deleteThread(DeleteThreadRequest request);

    /**
     * @param request the request parameters of FetchRemoteMcpTools  FetchRemoteMcpToolsRequest
     * @return FetchRemoteMcpToolsResponse
     */
    CompletableFuture<FetchRemoteMcpToolsResponse> fetchRemoteMcpTools(FetchRemoteMcpToolsRequest request);

    /**
     * @param request the request parameters of GetArtifact  GetArtifactRequest
     * @return GetArtifactResponse
     */
    CompletableFuture<GetArtifactResponse> getArtifact(GetArtifactRequest request);

    /**
     * @param request the request parameters of GetDigitalEmployee  GetDigitalEmployeeRequest
     * @return GetDigitalEmployeeResponse
     */
    CompletableFuture<GetDigitalEmployeeResponse> getDigitalEmployee(GetDigitalEmployeeRequest request);

    /**
     * @param request the request parameters of GetDigitalEmployeeSkill  GetDigitalEmployeeSkillRequest
     * @return GetDigitalEmployeeSkillResponse
     */
    CompletableFuture<GetDigitalEmployeeSkillResponse> getDigitalEmployeeSkill(GetDigitalEmployeeSkillRequest request);

    /**
     * @param request the request parameters of GetMcpService  GetMcpServiceRequest
     * @return GetMcpServiceResponse
     */
    CompletableFuture<GetMcpServiceResponse> getMcpService(GetMcpServiceRequest request);

    /**
     * @param request the request parameters of GetThread  GetThreadRequest
     * @return GetThreadResponse
     */
    CompletableFuture<GetThreadResponse> getThread(GetThreadRequest request);

    /**
     * @param request the request parameters of GetThreadData  GetThreadDataRequest
     * @return GetThreadDataResponse
     */
    CompletableFuture<GetThreadDataResponse> getThreadData(GetThreadDataRequest request);

    /**
     * @param request the request parameters of ListArtifacts  ListArtifactsRequest
     * @return ListArtifactsResponse
     */
    CompletableFuture<ListArtifactsResponse> listArtifacts(ListArtifactsRequest request);

    /**
     * @param request the request parameters of ListDigitalEmployeeSkillVersions  ListDigitalEmployeeSkillVersionsRequest
     * @return ListDigitalEmployeeSkillVersionsResponse
     */
    CompletableFuture<ListDigitalEmployeeSkillVersionsResponse> listDigitalEmployeeSkillVersions(ListDigitalEmployeeSkillVersionsRequest request);

    /**
     * @param request the request parameters of ListDigitalEmployeeSkills  ListDigitalEmployeeSkillsRequest
     * @return ListDigitalEmployeeSkillsResponse
     */
    CompletableFuture<ListDigitalEmployeeSkillsResponse> listDigitalEmployeeSkills(ListDigitalEmployeeSkillsRequest request);

    /**
     * @param request the request parameters of ListDigitalEmployees  ListDigitalEmployeesRequest
     * @return ListDigitalEmployeesResponse
     */
    CompletableFuture<ListDigitalEmployeesResponse> listDigitalEmployees(ListDigitalEmployeesRequest request);

    /**
     * @param request the request parameters of ListMcpServices  ListMcpServicesRequest
     * @return ListMcpServicesResponse
     */
    CompletableFuture<ListMcpServicesResponse> listMcpServices(ListMcpServicesRequest request);

    /**
     * @param request the request parameters of ListThreads  ListThreadsRequest
     * @return ListThreadsResponse
     */
    CompletableFuture<ListThreadsResponse> listThreads(ListThreadsRequest request);

    /**
     * @param request the request parameters of UpdateDigitalEmployee  UpdateDigitalEmployeeRequest
     * @return UpdateDigitalEmployeeResponse
     */
    CompletableFuture<UpdateDigitalEmployeeResponse> updateDigitalEmployee(UpdateDigitalEmployeeRequest request);

    /**
     * @param request the request parameters of UpdateDigitalEmployeeSkill  UpdateDigitalEmployeeSkillRequest
     * @return UpdateDigitalEmployeeSkillResponse
     */
    CompletableFuture<UpdateDigitalEmployeeSkillResponse> updateDigitalEmployeeSkill(UpdateDigitalEmployeeSkillRequest request);

    /**
     * @param request the request parameters of UpdateMcpService  UpdateMcpServiceRequest
     * @return UpdateMcpServiceResponse
     */
    CompletableFuture<UpdateMcpServiceResponse> updateMcpService(UpdateMcpServiceRequest request);

    /**
     * @param request the request parameters of UpdateThread  UpdateThreadRequest
     * @return UpdateThreadResponse
     */
    CompletableFuture<UpdateThreadResponse> updateThread(UpdateThreadRequest request);

}
