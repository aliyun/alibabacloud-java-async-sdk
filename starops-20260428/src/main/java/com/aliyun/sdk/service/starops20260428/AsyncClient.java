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
     * <b>description</b> :
     * <p>Obtains the link required to upload content. This operation is applicable to large files.</p>
     * 
     * @param request the request parameters of CreateArtifactUploadToken  CreateArtifactUploadTokenRequest
     * @return CreateArtifactUploadTokenResponse
     */
    CompletableFuture<CreateArtifactUploadTokenResponse> createArtifactUploadToken(CreateArtifactUploadTokenRequest request);

    /**
     * <b>description</b> :
     * <p>Initiates a conversation.</p>
     * 
     * @param request the request parameters of CreateChat  CreateChatRequest
     * @return CreateChatResponse
     */
    CompletableFuture<CreateChatResponse> createChat(CreateChatRequest request);

    CompletableFuture<CreateChatResponse> createChatWithRequestBody(CreateChatRequest request, RequestBody requestBody);

<ReturnT> CompletableFuture<ReturnT> createChatWithAsyncResponseHandler(CreateChatRequest request, AsyncResponseHandler<CreateChatResponse, ReturnT> responseHandler);

    ResponseIterable<CreateChatResponseBody> createChatWithResponseIterable(CreateChatRequest request);

    /**
     * <b>description</b> :
     * <p>Creates a digital employee.</p>
     * 
     * @param request the request parameters of CreateDigitalEmployee  CreateDigitalEmployeeRequest
     * @return CreateDigitalEmployeeResponse
     */
    CompletableFuture<CreateDigitalEmployeeResponse> createDigitalEmployee(CreateDigitalEmployeeRequest request);

    /**
     * <b>description</b> :
     * <p>Creates a new skill for a specified digital employee.</p>
     * 
     * @param request the request parameters of CreateDigitalEmployeeSkill  CreateDigitalEmployeeSkillRequest
     * @return CreateDigitalEmployeeSkillResponse
     */
    CompletableFuture<CreateDigitalEmployeeSkillResponse> createDigitalEmployeeSkill(CreateDigitalEmployeeSkillRequest request);

    /**
     * <b>description</b> :
     * <p>Creates an MCP service.</p>
     * 
     * @param request the request parameters of CreateMcpService  CreateMcpServiceRequest
     * @return CreateMcpServiceResponse
     */
    CompletableFuture<CreateMcpServiceResponse> createMcpService(CreateMcpServiceRequest request);

    /**
     * <b>description</b> :
     * <p>Creates a thread for a specified digital employee.</p>
     * 
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
     * <b>description</b> :
     * <p>Deletes a digital employee.</p>
     * 
     * @param request the request parameters of DeleteDigitalEmployee  DeleteDigitalEmployeeRequest
     * @return DeleteDigitalEmployeeResponse
     */
    CompletableFuture<DeleteDigitalEmployeeResponse> deleteDigitalEmployee(DeleteDigitalEmployeeRequest request);

    /**
     * <b>description</b> :
     * <p>Deletes a skill from the specified digital employee.</p>
     * 
     * @param request the request parameters of DeleteDigitalEmployeeSkill  DeleteDigitalEmployeeSkillRequest
     * @return DeleteDigitalEmployeeSkillResponse
     */
    CompletableFuture<DeleteDigitalEmployeeSkillResponse> deleteDigitalEmployeeSkill(DeleteDigitalEmployeeSkillRequest request);

    /**
     * @param request the request parameters of DeleteDigitalEmployeeUmodelCommonSchemaRef  DeleteDigitalEmployeeUmodelCommonSchemaRefRequest
     * @return DeleteDigitalEmployeeUmodelCommonSchemaRefResponse
     */
    CompletableFuture<DeleteDigitalEmployeeUmodelCommonSchemaRefResponse> deleteDigitalEmployeeUmodelCommonSchemaRef(DeleteDigitalEmployeeUmodelCommonSchemaRefRequest request);

    /**
     * @param request the request parameters of DeleteMcpService  DeleteMcpServiceRequest
     * @return DeleteMcpServiceResponse
     */
    CompletableFuture<DeleteMcpServiceResponse> deleteMcpService(DeleteMcpServiceRequest request);

    /**
     * <b>description</b> :
     * <p>This operation deletes a specified thread.</p>
     * 
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
     * <b>description</b> :
     * <p>Retrieves the content of an artifact.</p>
     * 
     * @param request the request parameters of GetArtifact  GetArtifactRequest
     * @return GetArtifactResponse
     */
    CompletableFuture<GetArtifactResponse> getArtifact(GetArtifactRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the download URL for artifact content. This operation is suitable for large files.</p>
     * 
     * @param request the request parameters of GetArtifactDownloadUrl  GetArtifactDownloadUrlRequest
     * @return GetArtifactDownloadUrlResponse
     */
    CompletableFuture<GetArtifactDownloadUrlResponse> getArtifactDownloadUrl(GetArtifactDownloadUrlRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves a digital employee.</p>
     * 
     * @param request the request parameters of GetDigitalEmployee  GetDigitalEmployeeRequest
     * @return GetDigitalEmployeeResponse
     */
    CompletableFuture<GetDigitalEmployeeResponse> getDigitalEmployee(GetDigitalEmployeeRequest request);

    /**
     * @param request the request parameters of GetDigitalEmployeeEntityData  GetDigitalEmployeeEntityDataRequest
     * @return GetDigitalEmployeeEntityDataResponse
     */
    CompletableFuture<GetDigitalEmployeeEntityDataResponse> getDigitalEmployeeEntityData(GetDigitalEmployeeEntityDataRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the details of a specified skill for a digital employee.</p>
     * 
     * @param request the request parameters of GetDigitalEmployeeSkill  GetDigitalEmployeeSkillRequest
     * @return GetDigitalEmployeeSkillResponse
     */
    CompletableFuture<GetDigitalEmployeeSkillResponse> getDigitalEmployeeSkill(GetDigitalEmployeeSkillRequest request);

    /**
     * @param request the request parameters of GetDigitalEmployeeUmodel  GetDigitalEmployeeUmodelRequest
     * @return GetDigitalEmployeeUmodelResponse
     */
    CompletableFuture<GetDigitalEmployeeUmodelResponse> getDigitalEmployeeUmodel(GetDigitalEmployeeUmodelRequest request);

    /**
     * @param request the request parameters of GetMcpService  GetMcpServiceRequest
     * @return GetMcpServiceResponse
     */
    CompletableFuture<GetMcpServiceResponse> getMcpService(GetMcpServiceRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the details of a thread.</p>
     * 
     * @param request the request parameters of GetThread  GetThreadRequest
     * @return GetThreadResponse
     */
    CompletableFuture<GetThreadResponse> getThread(GetThreadRequest request);

    /**
     * <b>description</b> :
     * <p>Gets session data.</p>
     * 
     * @param request the request parameters of GetThreadData  GetThreadDataRequest
     * @return GetThreadDataResponse
     */
    CompletableFuture<GetThreadDataResponse> getThreadData(GetThreadDataRequest request);

    /**
     * <b>description</b> :
     * <p>Lists the artifacts for a specified digital employee.</p>
     * 
     * @param request the request parameters of ListArtifacts  ListArtifactsRequest
     * @return ListArtifactsResponse
     */
    CompletableFuture<ListArtifactsResponse> listArtifacts(ListArtifactsRequest request);

    /**
     * <b>description</b> :
     * <p>Lists the previous versions of a skill.</p>
     * 
     * @param request the request parameters of ListDigitalEmployeeSkillVersions  ListDigitalEmployeeSkillVersionsRequest
     * @return ListDigitalEmployeeSkillVersionsResponse
     */
    CompletableFuture<ListDigitalEmployeeSkillVersionsResponse> listDigitalEmployeeSkillVersions(ListDigitalEmployeeSkillVersionsRequest request);

    /**
     * <b>description</b> :
     * <p>Lists the skills of a specified digital employee.</p>
     * 
     * @param request the request parameters of ListDigitalEmployeeSkills  ListDigitalEmployeeSkillsRequest
     * @return ListDigitalEmployeeSkillsResponse
     */
    CompletableFuture<ListDigitalEmployeeSkillsResponse> listDigitalEmployeeSkills(ListDigitalEmployeeSkillsRequest request);

    /**
     * <b>description</b> :
     * <p>Lists digital employees.</p>
     * 
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
     * <b>description</b> :
     * <p>List sessions</p>
     * 
     * @param request the request parameters of ListThreads  ListThreadsRequest
     * @return ListThreadsResponse
     */
    CompletableFuture<ListThreadsResponse> listThreads(ListThreadsRequest request);

    /**
     * <b>description</b> :
     * <p>Updates a digital employee.</p>
     * 
     * @param request the request parameters of UpdateDigitalEmployee  UpdateDigitalEmployeeRequest
     * @return UpdateDigitalEmployeeResponse
     */
    CompletableFuture<UpdateDigitalEmployeeResponse> updateDigitalEmployee(UpdateDigitalEmployeeRequest request);

    /**
     * <b>description</b> :
     * <p>This operation updates a skill for a specified digital employee.</p>
     * 
     * @param request the request parameters of UpdateDigitalEmployeeSkill  UpdateDigitalEmployeeSkillRequest
     * @return UpdateDigitalEmployeeSkillResponse
     */
    CompletableFuture<UpdateDigitalEmployeeSkillResponse> updateDigitalEmployeeSkill(UpdateDigitalEmployeeSkillRequest request);

    /**
     * @param request the request parameters of UpdateDigitalEmployeeUmodel  UpdateDigitalEmployeeUmodelRequest
     * @return UpdateDigitalEmployeeUmodelResponse
     */
    CompletableFuture<UpdateDigitalEmployeeUmodelResponse> updateDigitalEmployeeUmodel(UpdateDigitalEmployeeUmodelRequest request);

    /**
     * @param request the request parameters of UpdateMcpService  UpdateMcpServiceRequest
     * @return UpdateMcpServiceResponse
     */
    CompletableFuture<UpdateMcpServiceResponse> updateMcpService(UpdateMcpServiceRequest request);

    /**
     * <b>description</b> :
     * <p>Updates a thread.</p>
     * 
     * @param request the request parameters of UpdateThread  UpdateThreadRequest
     * @return UpdateThreadResponse
     */
    CompletableFuture<UpdateThreadResponse> updateThread(UpdateThreadRequest request);

    /**
     * @param request the request parameters of UpsertDigitalEmployeeUmodelCommonSchemaRef  UpsertDigitalEmployeeUmodelCommonSchemaRefRequest
     * @return UpsertDigitalEmployeeUmodelCommonSchemaRefResponse
     */
    CompletableFuture<UpsertDigitalEmployeeUmodelCommonSchemaRefResponse> upsertDigitalEmployeeUmodelCommonSchemaRef(UpsertDigitalEmployeeUmodelCommonSchemaRefRequest request);

}
