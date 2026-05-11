// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starops20260428;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.starops20260428.models.*;
import darabonba.core.sse.SSEHttpResponseHandler;
import darabonba.core.utils.*;
import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;

import java.util.concurrent.CompletableFuture;


/**
 * <p>Main client.</p>
 */
public final class DefaultAsyncClient implements AsyncClient {

    protected final String product;
    protected final String version;
    protected final String endpointRule;
    protected final java.util.Map<String, String> endpointMap;
    protected final TeaRequest REQUEST;
    protected final TeaAsyncHandler handler;

    protected DefaultAsyncClient(ClientConfiguration configuration) {
        this.handler = new TeaAsyncHandler(configuration);
        this.product = "STAROps";
        this.version = "2026-04-28";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of CreateChat  CreateChatRequest
     * @return CreateChatResponse
     */
    @Override
    public CompletableFuture<CreateChatResponse> createChat(CreateChatRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateChat").setMethod(HttpMethod.POST).setPathRegex("/chat").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateChatResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateChatResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateChatResponse> createChatWithRequestBody(CreateChatRequest request, RequestBody requestBody) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateChat").setMethod(HttpMethod.POST).setPathRegex("/chat").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withRequestBody(requestBody).withOutput(CreateChatResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateChatResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public <ReturnT> CompletableFuture<ReturnT> createChatWithAsyncResponseHandler(CreateChatRequest request, AsyncResponseHandler<CreateChatResponse, ReturnT> responseHandler) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateChat").setMethod(HttpMethod.POST).setPathRegex("/chat").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withResponseHandler(responseHandler).withOutput(CreateChatResponse.create());
            return this.handler.execute(params)
                    .thenCompose((output) -> CompletableFuture.completedFuture(responseHandler.transform((CreateChatResponse)output)));
        } catch (Exception e) {
            CompletableFuture<ReturnT> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public ResponseIterable<CreateChatResponseBody> createChatWithResponseIterable(CreateChatRequest request) {
        this.handler.validateRequestModel(request);
        TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.SSE).setAction("CreateChat").setMethod(HttpMethod.POST).setPathRegex("/chat").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
        CreateChatResponseBodyIterator iterator = CreateChatResponseBodyIterator.create();
        ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withHttpResponseHandler(new SSEHttpResponseHandler(iterator));
        this.handler.execute(params);
        return new ResponseIterable<>(iterator);
    }

    /**
     * @param request the request parameters of CreateDigitalEmployee  CreateDigitalEmployeeRequest
     * @return CreateDigitalEmployeeResponse
     */
    @Override
    public CompletableFuture<CreateDigitalEmployeeResponse> createDigitalEmployee(CreateDigitalEmployeeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateDigitalEmployee").setMethod(HttpMethod.POST).setPathRegex("/digital-employee").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDigitalEmployeeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDigitalEmployeeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateDigitalEmployeeSkill  CreateDigitalEmployeeSkillRequest
     * @return CreateDigitalEmployeeSkillResponse
     */
    @Override
    public CompletableFuture<CreateDigitalEmployeeSkillResponse> createDigitalEmployeeSkill(CreateDigitalEmployeeSkillRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateDigitalEmployeeSkill").setMethod(HttpMethod.POST).setPathRegex("/digitalEmployee/{name}/skill").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDigitalEmployeeSkillResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDigitalEmployeeSkillResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateThread  CreateThreadRequest
     * @return CreateThreadResponse
     */
    @Override
    public CompletableFuture<CreateThreadResponse> createThread(CreateThreadRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateThread").setMethod(HttpMethod.POST).setPathRegex("/digitalEmployee/{name}/thread").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateThreadResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateThreadResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateTicket  CreateTicketRequest
     * @return CreateTicketResponse
     */
    @Override
    public CompletableFuture<CreateTicketResponse> createTicket(CreateTicketRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateTicket").setMethod(HttpMethod.POST).setPathRegex("/tickets").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTicketResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTicketResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteDigitalEmployee  DeleteDigitalEmployeeRequest
     * @return DeleteDigitalEmployeeResponse
     */
    @Override
    public CompletableFuture<DeleteDigitalEmployeeResponse> deleteDigitalEmployee(DeleteDigitalEmployeeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteDigitalEmployee").setMethod(HttpMethod.DELETE).setPathRegex("/digital-employee/{name}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDigitalEmployeeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDigitalEmployeeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteDigitalEmployeeSkill  DeleteDigitalEmployeeSkillRequest
     * @return DeleteDigitalEmployeeSkillResponse
     */
    @Override
    public CompletableFuture<DeleteDigitalEmployeeSkillResponse> deleteDigitalEmployeeSkill(DeleteDigitalEmployeeSkillRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteDigitalEmployeeSkill").setMethod(HttpMethod.DELETE).setPathRegex("/digitalEmployee/{name}/skill/{skillName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDigitalEmployeeSkillResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDigitalEmployeeSkillResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteThread  DeleteThreadRequest
     * @return DeleteThreadResponse
     */
    @Override
    public CompletableFuture<DeleteThreadResponse> deleteThread(DeleteThreadRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteThread").setMethod(HttpMethod.DELETE).setPathRegex("/digitalEmployee/{name}/thread/{threadId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteThreadResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteThreadResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetArtifact  GetArtifactRequest
     * @return GetArtifactResponse
     */
    @Override
    public CompletableFuture<GetArtifactResponse> getArtifact(GetArtifactRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetArtifact").setMethod(HttpMethod.GET).setPathRegex("/digitalEmployee/{name}/artifact").setBodyType(BodyType.BINARY).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetArtifactResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetArtifactResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDigitalEmployee  GetDigitalEmployeeRequest
     * @return GetDigitalEmployeeResponse
     */
    @Override
    public CompletableFuture<GetDigitalEmployeeResponse> getDigitalEmployee(GetDigitalEmployeeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetDigitalEmployee").setMethod(HttpMethod.GET).setPathRegex("/digital-employee/{name}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDigitalEmployeeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDigitalEmployeeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDigitalEmployeeSkill  GetDigitalEmployeeSkillRequest
     * @return GetDigitalEmployeeSkillResponse
     */
    @Override
    public CompletableFuture<GetDigitalEmployeeSkillResponse> getDigitalEmployeeSkill(GetDigitalEmployeeSkillRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetDigitalEmployeeSkill").setMethod(HttpMethod.GET).setPathRegex("/digitalEmployee/{name}/skill/{skillName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDigitalEmployeeSkillResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDigitalEmployeeSkillResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetThread  GetThreadRequest
     * @return GetThreadResponse
     */
    @Override
    public CompletableFuture<GetThreadResponse> getThread(GetThreadRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetThread").setMethod(HttpMethod.GET).setPathRegex("/digitalEmployee/{name}/thread/{threadId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetThreadResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetThreadResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetThreadData  GetThreadDataRequest
     * @return GetThreadDataResponse
     */
    @Override
    public CompletableFuture<GetThreadDataResponse> getThreadData(GetThreadDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetThreadData").setMethod(HttpMethod.GET).setPathRegex("/digitalEmployee/{name}/thread/{threadId}/data").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetThreadDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetThreadDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListArtifacts  ListArtifactsRequest
     * @return ListArtifactsResponse
     */
    @Override
    public CompletableFuture<ListArtifactsResponse> listArtifacts(ListArtifactsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListArtifacts").setMethod(HttpMethod.GET).setPathRegex("/digitalEmployee/{name}/artifacts").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListArtifactsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListArtifactsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDigitalEmployeeSkillVersions  ListDigitalEmployeeSkillVersionsRequest
     * @return ListDigitalEmployeeSkillVersionsResponse
     */
    @Override
    public CompletableFuture<ListDigitalEmployeeSkillVersionsResponse> listDigitalEmployeeSkillVersions(ListDigitalEmployeeSkillVersionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListDigitalEmployeeSkillVersions").setMethod(HttpMethod.GET).setPathRegex("/digitalEmployee/{name}/skill/{skillName}/versions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDigitalEmployeeSkillVersionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDigitalEmployeeSkillVersionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDigitalEmployeeSkills  ListDigitalEmployeeSkillsRequest
     * @return ListDigitalEmployeeSkillsResponse
     */
    @Override
    public CompletableFuture<ListDigitalEmployeeSkillsResponse> listDigitalEmployeeSkills(ListDigitalEmployeeSkillsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListDigitalEmployeeSkills").setMethod(HttpMethod.GET).setPathRegex("/digitalEmployee/{name}/skills").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDigitalEmployeeSkillsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDigitalEmployeeSkillsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDigitalEmployees  ListDigitalEmployeesRequest
     * @return ListDigitalEmployeesResponse
     */
    @Override
    public CompletableFuture<ListDigitalEmployeesResponse> listDigitalEmployees(ListDigitalEmployeesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListDigitalEmployees").setMethod(HttpMethod.GET).setPathRegex("/digital-employee").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDigitalEmployeesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDigitalEmployeesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListThreads  ListThreadsRequest
     * @return ListThreadsResponse
     */
    @Override
    public CompletableFuture<ListThreadsResponse> listThreads(ListThreadsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListThreads").setMethod(HttpMethod.GET).setPathRegex("/digitalEmployee/{name}/threads").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListThreadsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListThreadsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateDigitalEmployee  UpdateDigitalEmployeeRequest
     * @return UpdateDigitalEmployeeResponse
     */
    @Override
    public CompletableFuture<UpdateDigitalEmployeeResponse> updateDigitalEmployee(UpdateDigitalEmployeeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateDigitalEmployee").setMethod(HttpMethod.PATCH).setPathRegex("/digital-employee/{name}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDigitalEmployeeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDigitalEmployeeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateDigitalEmployeeSkill  UpdateDigitalEmployeeSkillRequest
     * @return UpdateDigitalEmployeeSkillResponse
     */
    @Override
    public CompletableFuture<UpdateDigitalEmployeeSkillResponse> updateDigitalEmployeeSkill(UpdateDigitalEmployeeSkillRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateDigitalEmployeeSkill").setMethod(HttpMethod.PUT).setPathRegex("/digitalEmployee/{name}/skill/{skillName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDigitalEmployeeSkillResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDigitalEmployeeSkillResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateThread  UpdateThreadRequest
     * @return UpdateThreadResponse
     */
    @Override
    public CompletableFuture<UpdateThreadResponse> updateThread(UpdateThreadRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateThread").setMethod(HttpMethod.PUT).setPathRegex("/digitalEmployee/{name}/thread/{threadId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateThreadResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateThreadResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
