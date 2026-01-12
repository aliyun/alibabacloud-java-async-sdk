// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.agentrun20250910.models.*;
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
     * @param request the request parameters of ActivateTemplateMCP  ActivateTemplateMCPRequest
     * @return ActivateTemplateMCPResponse
     */
    CompletableFuture<ActivateTemplateMCPResponse> activateTemplateMCP(ActivateTemplateMCPRequest request);

    /**
     * <b>description</b> :
     * <p>创建一个新的智能体运行时实例，用于执行AI代理任务。智能体运行时是AgentRun服务的核心组件，提供代码执行、浏览器操作、内存管理等能力。</p>
     * 
     * @param request the request parameters of CreateAgentRuntime  CreateAgentRuntimeRequest
     * @return CreateAgentRuntimeResponse
     */
    CompletableFuture<CreateAgentRuntimeResponse> createAgentRuntime(CreateAgentRuntimeRequest request);

    /**
     * <b>description</b> :
     * <p>为指定的智能体运行时创建新的端点，用于外部访问和调用。端点是智能体运行时对外提供服务的入口。</p>
     * 
     * @param request the request parameters of CreateAgentRuntimeEndpoint  CreateAgentRuntimeEndpointRequest
     * @return CreateAgentRuntimeEndpointResponse
     */
    CompletableFuture<CreateAgentRuntimeEndpointResponse> createAgentRuntimeEndpoint(CreateAgentRuntimeEndpointRequest request);

    /**
     * <b>description</b> :
     * <p>创建一个新的浏览器实例，用于执行网页自动化任务。浏览器实例提供网页浏览、元素操作、截图录制等功能。</p>
     * 
     * @param request the request parameters of CreateBrowser  CreateBrowserRequest
     * @return CreateBrowserResponse
     */
    CompletableFuture<CreateBrowserResponse> createBrowser(CreateBrowserRequest request);

    /**
     * <b>description</b> :
     * <p>创建一个新的代码解释器实例，用于执行代码解释和运行任务。代码解释器提供Python代码执行、数据处理、机器学习等功能。</p>
     * 
     * @param request the request parameters of CreateCodeInterpreter  CreateCodeInterpreterRequest
     * @return CreateCodeInterpreterResponse
     */
    CompletableFuture<CreateCodeInterpreterResponse> createCodeInterpreter(CreateCodeInterpreterRequest request);

    /**
     * @param request the request parameters of CreateCredential  CreateCredentialRequest
     * @return CreateCredentialResponse
     */
    CompletableFuture<CreateCredentialResponse> createCredential(CreateCredentialRequest request);

    /**
     * @param request the request parameters of CreateKnowledgeBase  CreateKnowledgeBaseRequest
     * @return CreateKnowledgeBaseResponse
     */
    CompletableFuture<CreateKnowledgeBaseResponse> createKnowledgeBase(CreateKnowledgeBaseRequest request);

    /**
     * @param request the request parameters of CreateMemoryCollection  CreateMemoryCollectionRequest
     * @return CreateMemoryCollectionResponse
     */
    CompletableFuture<CreateMemoryCollectionResponse> createMemoryCollection(CreateMemoryCollectionRequest request);

    /**
     * @param request the request parameters of CreateModelProxy  CreateModelProxyRequest
     * @return CreateModelProxyResponse
     */
    CompletableFuture<CreateModelProxyResponse> createModelProxy(CreateModelProxyRequest request);

    /**
     * @param request the request parameters of CreateModelService  CreateModelServiceRequest
     * @return CreateModelServiceResponse
     */
    CompletableFuture<CreateModelServiceResponse> createModelService(CreateModelServiceRequest request);

    /**
     * <b>description</b> :
     * <p>根据模板创建一个新的沙箱实例。沙箱是运行时的执行环境，可以执行代码或运行浏览器。</p>
     * 
     * @param request the request parameters of CreateSandbox  CreateSandboxRequest
     * @return CreateSandboxResponse
     */
    CompletableFuture<CreateSandboxResponse> createSandbox(CreateSandboxRequest request);

    /**
     * <b>description</b> :
     * <p>创建一个新的模板，用于后续创建沙箱。模板定义了沙箱的运行时环境、资源配置等。</p>
     * 
     * @param request the request parameters of CreateTemplate  CreateTemplateRequest
     * @return CreateTemplateResponse
     */
    CompletableFuture<CreateTemplateResponse> createTemplate(CreateTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>删除指定的智能体运行时实例，包括其所有相关资源和数据。删除操作不可逆，请谨慎操作。</p>
     * 
     * @param request the request parameters of DeleteAgentRuntime  DeleteAgentRuntimeRequest
     * @return DeleteAgentRuntimeResponse
     */
    CompletableFuture<DeleteAgentRuntimeResponse> deleteAgentRuntime(DeleteAgentRuntimeRequest request);

    /**
     * @param request the request parameters of DeleteAgentRuntimeEndpoint  DeleteAgentRuntimeEndpointRequest
     * @return DeleteAgentRuntimeEndpointResponse
     */
    CompletableFuture<DeleteAgentRuntimeEndpointResponse> deleteAgentRuntimeEndpoint(DeleteAgentRuntimeEndpointRequest request);

    /**
     * <b>description</b> :
     * <p>删除指定的浏览器实例，包括其所有相关资源和数据。删除操作不可逆，请谨慎操作。</p>
     * 
     * @param request the request parameters of DeleteBrowser  DeleteBrowserRequest
     * @return DeleteBrowserResponse
     */
    CompletableFuture<DeleteBrowserResponse> deleteBrowser(DeleteBrowserRequest request);

    /**
     * <b>description</b> :
     * <p>删除指定的代码解释器实例，包括其所有相关资源和数据。删除操作不可逆，请谨慎操作。</p>
     * 
     * @param request the request parameters of DeleteCodeInterpreter  DeleteCodeInterpreterRequest
     * @return DeleteCodeInterpreterResponse
     */
    CompletableFuture<DeleteCodeInterpreterResponse> deleteCodeInterpreter(DeleteCodeInterpreterRequest request);

    /**
     * @param request the request parameters of DeleteCredential  DeleteCredentialRequest
     * @return DeleteCredentialResponse
     */
    CompletableFuture<DeleteCredentialResponse> deleteCredential(DeleteCredentialRequest request);

    /**
     * @param request the request parameters of DeleteKnowledgeBase  DeleteKnowledgeBaseRequest
     * @return DeleteKnowledgeBaseResponse
     */
    CompletableFuture<DeleteKnowledgeBaseResponse> deleteKnowledgeBase(DeleteKnowledgeBaseRequest request);

    /**
     * @param request the request parameters of DeleteMemoryCollection  DeleteMemoryCollectionRequest
     * @return DeleteMemoryCollectionResponse
     */
    CompletableFuture<DeleteMemoryCollectionResponse> deleteMemoryCollection(DeleteMemoryCollectionRequest request);

    /**
     * @param request the request parameters of DeleteModelProxy  DeleteModelProxyRequest
     * @return DeleteModelProxyResponse
     */
    CompletableFuture<DeleteModelProxyResponse> deleteModelProxy(DeleteModelProxyRequest request);

    /**
     * @param request the request parameters of DeleteModelService  DeleteModelServiceRequest
     * @return DeleteModelServiceResponse
     */
    CompletableFuture<DeleteModelServiceResponse> deleteModelService(DeleteModelServiceRequest request);

    /**
     * @param request the request parameters of DeleteSandbox  DeleteSandboxRequest
     * @return DeleteSandboxResponse
     */
    CompletableFuture<DeleteSandboxResponse> deleteSandbox(DeleteSandboxRequest request);

    /**
     * <b>description</b> :
     * <p>删除指定的模板。删除后，该模板将无法再用于创建新的沙箱。</p>
     * 
     * @param request the request parameters of DeleteTemplate  DeleteTemplateRequest
     * @return DeleteTemplateResponse
     */
    CompletableFuture<DeleteTemplateResponse> deleteTemplate(DeleteTemplateRequest request);

    /**
     * @param request the request parameters of GetAccessToken  GetAccessTokenRequest
     * @return GetAccessTokenResponse
     */
    CompletableFuture<GetAccessTokenResponse> getAccessToken(GetAccessTokenRequest request);

    /**
     * <b>description</b> :
     * <p>根据智能体运行时ID获取指定智能体运行时的详细信息，包括配置、状态、资源使用情况等。</p>
     * 
     * @param request the request parameters of GetAgentRuntime  GetAgentRuntimeRequest
     * @return GetAgentRuntimeResponse
     */
    CompletableFuture<GetAgentRuntimeResponse> getAgentRuntime(GetAgentRuntimeRequest request);

    /**
     * @param request the request parameters of GetAgentRuntimeEndpoint  GetAgentRuntimeEndpointRequest
     * @return GetAgentRuntimeEndpointResponse
     */
    CompletableFuture<GetAgentRuntimeEndpointResponse> getAgentRuntimeEndpoint(GetAgentRuntimeEndpointRequest request);

    /**
     * <b>description</b> :
     * <p>根据浏览器ID获取指定浏览器实例的详细信息，包括配置、状态、资源使用情况等。</p>
     * 
     * @param request the request parameters of GetBrowser  GetBrowserRequest
     * @return GetBrowserResponse
     */
    CompletableFuture<GetBrowserResponse> getBrowser(GetBrowserRequest request);

    /**
     * <b>description</b> :
     * <p>根据代码解释器ID获取指定代码解释器实例的详细信息，包括配置、状态、资源使用情况等。</p>
     * 
     * @param request the request parameters of GetCodeInterpreter  GetCodeInterpreterRequest
     * @return GetCodeInterpreterResponse
     */
    CompletableFuture<GetCodeInterpreterResponse> getCodeInterpreter(GetCodeInterpreterRequest request);

    /**
     * @param request the request parameters of GetCredential  GetCredentialRequest
     * @return GetCredentialResponse
     */
    CompletableFuture<GetCredentialResponse> getCredential(GetCredentialRequest request);

    /**
     * @param request the request parameters of GetKnowledgeBase  GetKnowledgeBaseRequest
     * @return GetKnowledgeBaseResponse
     */
    CompletableFuture<GetKnowledgeBaseResponse> getKnowledgeBase(GetKnowledgeBaseRequest request);

    /**
     * @param request the request parameters of GetMemoryCollection  GetMemoryCollectionRequest
     * @return GetMemoryCollectionResponse
     */
    CompletableFuture<GetMemoryCollectionResponse> getMemoryCollection(GetMemoryCollectionRequest request);

    /**
     * @param request the request parameters of GetModelProxy  GetModelProxyRequest
     * @return GetModelProxyResponse
     */
    CompletableFuture<GetModelProxyResponse> getModelProxy(GetModelProxyRequest request);

    /**
     * @param request the request parameters of GetModelService  GetModelServiceRequest
     * @return GetModelServiceResponse
     */
    CompletableFuture<GetModelServiceResponse> getModelService(GetModelServiceRequest request);

    /**
     * <b>description</b> :
     * <p>根据沙箱ID获取指定沙箱的详细信息，包括状态、配置等。</p>
     * 
     * @param request the request parameters of GetSandbox  GetSandboxRequest
     * @return GetSandboxResponse
     */
    CompletableFuture<GetSandboxResponse> getSandbox(GetSandboxRequest request);

    /**
     * <b>description</b> :
     * <p>根据模板名称获取指定模板的详细信息，包括配置、状态等。</p>
     * 
     * @param request the request parameters of GetTemplate  GetTemplateRequest
     * @return GetTemplateResponse
     */
    CompletableFuture<GetTemplateResponse> getTemplate(GetTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>获取指定智能体运行时的所有端点列表，支持按名称过滤和分页查询。端点用于外部系统访问智能体运行时服务。</p>
     * 
     * @param request the request parameters of ListAgentRuntimeEndpoints  ListAgentRuntimeEndpointsRequest
     * @return ListAgentRuntimeEndpointsResponse
     */
    CompletableFuture<ListAgentRuntimeEndpointsResponse> listAgentRuntimeEndpoints(ListAgentRuntimeEndpointsRequest request);

    /**
     * @param request the request parameters of ListAgentRuntimeVersions  ListAgentRuntimeVersionsRequest
     * @return ListAgentRuntimeVersionsResponse
     */
    CompletableFuture<ListAgentRuntimeVersionsResponse> listAgentRuntimeVersions(ListAgentRuntimeVersionsRequest request);

    /**
     * <b>description</b> :
     * <p>获取当前用户的所有智能体运行时列表，支持按名称、标签等条件过滤，支持分页查询。</p>
     * 
     * @param request the request parameters of ListAgentRuntimes  ListAgentRuntimesRequest
     * @return ListAgentRuntimesResponse
     */
    CompletableFuture<ListAgentRuntimesResponse> listAgentRuntimes(ListAgentRuntimesRequest request);

    /**
     * <b>description</b> :
     * <p>获取当前用户的所有浏览器实例列表，支持按名称、状态等条件过滤，支持分页查询。</p>
     * 
     * @param request the request parameters of ListBrowsers  ListBrowsersRequest
     * @return ListBrowsersResponse
     */
    CompletableFuture<ListBrowsersResponse> listBrowsers(ListBrowsersRequest request);

    /**
     * <b>description</b> :
     * <p>获取当前用户的所有代码解释器实例列表，支持按名称等条件过滤，支持分页查询。</p>
     * 
     * @param request the request parameters of ListCodeInterpreters  ListCodeInterpretersRequest
     * @return ListCodeInterpretersResponse
     */
    CompletableFuture<ListCodeInterpretersResponse> listCodeInterpreters(ListCodeInterpretersRequest request);

    /**
     * @param request the request parameters of ListCredentials  ListCredentialsRequest
     * @return ListCredentialsResponse
     */
    CompletableFuture<ListCredentialsResponse> listCredentials(ListCredentialsRequest request);

    /**
     * @param request the request parameters of ListKnowledgeBases  ListKnowledgeBasesRequest
     * @return ListKnowledgeBasesResponse
     */
    CompletableFuture<ListKnowledgeBasesResponse> listKnowledgeBases(ListKnowledgeBasesRequest request);

    /**
     * @param request the request parameters of ListMemoryCollections  ListMemoryCollectionsRequest
     * @return ListMemoryCollectionsResponse
     */
    CompletableFuture<ListMemoryCollectionsResponse> listMemoryCollections(ListMemoryCollectionsRequest request);

    /**
     * @param request the request parameters of ListModelProviders  ListModelProvidersRequest
     * @return ListModelProvidersResponse
     */
    CompletableFuture<ListModelProvidersResponse> listModelProviders(ListModelProvidersRequest request);

    /**
     * @param request the request parameters of ListModelProxies  ListModelProxiesRequest
     * @return ListModelProxiesResponse
     */
    CompletableFuture<ListModelProxiesResponse> listModelProxies(ListModelProxiesRequest request);

    /**
     * @param request the request parameters of ListModelServices  ListModelServicesRequest
     * @return ListModelServicesResponse
     */
    CompletableFuture<ListModelServicesResponse> listModelServices(ListModelServicesRequest request);

    /**
     * <b>description</b> :
     * <p>获取当前用户的所有沙箱列表，支持按模板名称过滤，支持分页查询。</p>
     * 
     * @param request the request parameters of ListSandboxes  ListSandboxesRequest
     * @return ListSandboxesResponse
     */
    CompletableFuture<ListSandboxesResponse> listSandboxes(ListSandboxesRequest request);

    /**
     * <b>description</b> :
     * <p>获取当前用户的所有模板列表，支持按模板类型过滤，支持分页查询。</p>
     * 
     * @param request the request parameters of ListTemplates  ListTemplatesRequest
     * @return ListTemplatesResponse
     */
    CompletableFuture<ListTemplatesResponse> listTemplates(ListTemplatesRequest request);

    /**
     * <b>description</b> :
     * <p>为指定的智能体运行时发布新版本，用于版本管理和部署。新版本可以包含代码更新、配置变更等内容。</p>
     * 
     * @param request the request parameters of PublishRuntimeVersion  PublishRuntimeVersionRequest
     * @return PublishRuntimeVersionResponse
     */
    CompletableFuture<PublishRuntimeVersionResponse> publishRuntimeVersion(PublishRuntimeVersionRequest request);

    /**
     * <b>description</b> :
     * <p>停止指定的沙箱实例。停止后，沙箱将进入TERMINATED状态。</p>
     * 
     * @param request the request parameters of StopSandbox  StopSandboxRequest
     * @return StopSandboxResponse
     */
    CompletableFuture<StopSandboxResponse> stopSandbox(StopSandboxRequest request);

    /**
     * @param request the request parameters of StopTemplateMCP  StopTemplateMCPRequest
     * @return StopTemplateMCPResponse
     */
    CompletableFuture<StopTemplateMCPResponse> stopTemplateMCP(StopTemplateMCPRequest request);

    /**
     * <b>description</b> :
     * <p>更新指定智能体运行时的配置信息，包括资源分配、网络配置、环境变量等。更新操作会触发运行时重启。</p>
     * 
     * @param request the request parameters of UpdateAgentRuntime  UpdateAgentRuntimeRequest
     * @return UpdateAgentRuntimeResponse
     */
    CompletableFuture<UpdateAgentRuntimeResponse> updateAgentRuntime(UpdateAgentRuntimeRequest request);

    /**
     * @param request the request parameters of UpdateAgentRuntimeEndpoint  UpdateAgentRuntimeEndpointRequest
     * @return UpdateAgentRuntimeEndpointResponse
     */
    CompletableFuture<UpdateAgentRuntimeEndpointResponse> updateAgentRuntimeEndpoint(UpdateAgentRuntimeEndpointRequest request);

    /**
     * @param request the request parameters of UpdateCredential  UpdateCredentialRequest
     * @return UpdateCredentialResponse
     */
    CompletableFuture<UpdateCredentialResponse> updateCredential(UpdateCredentialRequest request);

    /**
     * @param request the request parameters of UpdateKnowledgeBase  UpdateKnowledgeBaseRequest
     * @return UpdateKnowledgeBaseResponse
     */
    CompletableFuture<UpdateKnowledgeBaseResponse> updateKnowledgeBase(UpdateKnowledgeBaseRequest request);

    /**
     * @param request the request parameters of UpdateMemoryCollection  UpdateMemoryCollectionRequest
     * @return UpdateMemoryCollectionResponse
     */
    CompletableFuture<UpdateMemoryCollectionResponse> updateMemoryCollection(UpdateMemoryCollectionRequest request);

    /**
     * @param request the request parameters of UpdateModelProxy  UpdateModelProxyRequest
     * @return UpdateModelProxyResponse
     */
    CompletableFuture<UpdateModelProxyResponse> updateModelProxy(UpdateModelProxyRequest request);

    /**
     * @param request the request parameters of UpdateModelService  UpdateModelServiceRequest
     * @return UpdateModelServiceResponse
     */
    CompletableFuture<UpdateModelServiceResponse> updateModelService(UpdateModelServiceRequest request);

    /**
     * <b>description</b> :
     * <p>更新指定模板的配置信息，包括资源配置、网络配置、环境变量等。</p>
     * 
     * @param request the request parameters of UpdateTemplate  UpdateTemplateRequest
     * @return UpdateTemplateResponse
     */
    CompletableFuture<UpdateTemplateResponse> updateTemplate(UpdateTemplateRequest request);

}
