// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.iacservice20210806.models.*;
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
        this.product = "IaCService";
        this.version = "2021-08-06";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("cn-zhangjiakou", "iac.cn-zhangjiakou.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * <b>description</b> :
     * <p>Per-user call frequency: 100 calls per second.</p>
     * 
     * @param request the request parameters of AddSharedAccounts  AddSharedAccountsRequest
     * @return AddSharedAccountsResponse
     */
    @Override
    public CompletableFuture<AddSharedAccountsResponse> addSharedAccounts(AddSharedAccountsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AddSharedAccounts").setMethod(HttpMethod.PUT).setPathRegex("/sharedAccounts").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddSharedAccountsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddSharedAccountsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AssociateDetectConfig  AssociateDetectConfigRequest
     * @return AssociateDetectConfigResponse
     */
    @Override
    public CompletableFuture<AssociateDetectConfigResponse> associateDetectConfig(AssociateDetectConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AssociateDetectConfig").setMethod(HttpMethod.POST).setPathRegex("/terraformState/detectConfig/operations/associate").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AssociateDetectConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AssociateDetectConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AssociateGroup  AssociateGroupRequest
     * @return AssociateGroupResponse
     */
    @Override
    public CompletableFuture<AssociateGroupResponse> associateGroup(AssociateGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AssociateGroup").setMethod(HttpMethod.POST).setPathRegex("/group/{groupId}/associate").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AssociateGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AssociateGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>After creating a parameter set, you need to associate it with a resource. Valid values for the resource type:</p>
     * <ul>
     * <li>Module: template</li>
     * <li>ModuleVersion: template version</li>
     * <li>Task: node.</li>
     * </ul>
     * 
     * @param request the request parameters of AssociateParameterSet  AssociateParameterSetRequest
     * @return AssociateParameterSetResponse
     */
    @Override
    public CompletableFuture<AssociateParameterSetResponse> associateParameterSet(AssociateParameterSetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AssociateParameterSet").setMethod(HttpMethod.POST).setPathRegex("/parameterSets/operations/associate").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AssociateParameterSetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AssociateParameterSetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.</p>
     * 
     * @param request the request parameters of CancelResourceExportTask  CancelResourceExportTaskRequest
     * @return CancelResourceExportTaskResponse
     */
    @Override
    public CompletableFuture<CancelResourceExportTaskResponse> cancelResourceExportTask(CancelResourceExportTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CancelResourceExportTask").setMethod(HttpMethod.PUT).setPathRegex("/exportTasks/cancel/{exportTaskId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelResourceExportTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelResourceExportTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <ul>
     * <li>When <code>triggerType</code> is set to <code>Cron</code>, a valid <code>cronExpression</code> must be provided.  </li>
     * <li>Each element in the <code>alarmConfigs</code> list must specify the alerting method <code>type</code> and the corresponding alerting address <code>address</code>.  </li>
     * <li>If the <code>enabled</code> parameter is not explicitly set, its default value is <code>true</code>, meaning newly created detection configurations are enabled by default.  </li>
     * <li>It is recommended to use a UUID as the value of <code>clientToken</code> to ensure request idempotence.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateDetectConfig  CreateDetectConfigRequest
     * @return CreateDetectConfigResponse
     */
    @Override
    public CompletableFuture<CreateDetectConfigResponse> createDetectConfig(CreateDetectConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateDetectConfig").setMethod(HttpMethod.POST).setPathRegex("/terraformState/detectConfig").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDetectConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDetectConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateGroup  CreateGroupRequest
     * @return CreateGroupResponse
     */
    @Override
    public CompletableFuture<CreateGroupResponse> createGroup(CreateGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateGroup").setMethod(HttpMethod.POST).setPathRegex("/group").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.</p>
     * 
     * @param request the request parameters of CreateJob  CreateJobRequest
     * @return CreateJobResponse
     */
    @Override
    public CompletableFuture<CreateJobResponse> createJob(CreateJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateJob").setMethod(HttpMethod.POST).setPathRegex("/tasks/{taskId}/jobs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.</p>
     * 
     * @param request the request parameters of CreateModule  CreateModuleRequest
     * @return CreateModuleResponse
     */
    @Override
    public CompletableFuture<CreateModuleResponse> createModule(CreateModuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateModule").setMethod(HttpMethod.POST).setPathRegex("/modules").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateModuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateModuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>Use the <code>clientToken</code> parameter to ensure idempotence of the request and prevent duplicate submissions caused by network retries.</li>
     * <li>Use semantic versioning (such as <code>v1.0.0</code>).</li>
     * </ul>
     * 
     * @param request the request parameters of CreateModuleVersion  CreateModuleVersionRequest
     * @return CreateModuleVersionResponse
     */
    @Override
    public CompletableFuture<CreateModuleVersionResponse> createModuleVersion(CreateModuleVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateModuleVersion").setMethod(HttpMethod.POST).setPathRegex("/modules/{moduleId}/versions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateModuleVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateModuleVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation creates a new parameter set.</li>
     * <li>The <code>name</code> field is required and can be up to 128 characters in length.</li>
     * <li>Each element in the <code>parameters</code> array must contain the <code>name</code> field. Other fields are optional.</li>
     * <li>Use the <code>clientToken</code> field to ensure idempotence of the request.</li>
     * <li>The request header must contain authentication information to ensure secure access.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateParameterSet  CreateParameterSetRequest
     * @return CreateParameterSetResponse
     */
    @Override
    public CompletableFuture<CreateParameterSetResponse> createParameterSet(CreateParameterSetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateParameterSet").setMethod(HttpMethod.POST).setPathRegex("/parameterSets").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateParameterSetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateParameterSetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateProject  CreateProjectRequest
     * @return CreateProjectResponse
     */
    @Override
    public CompletableFuture<CreateProjectResponse> createProject(CreateProjectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateProject").setMethod(HttpMethod.POST).setPathRegex("/project").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateProjectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateProjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Per-user call frequency: 100 calls per second.</p>
     * 
     * @param request the request parameters of CreateRegistryModule  CreateRegistryModuleRequest
     * @return CreateRegistryModuleResponse
     */
    @Override
    public CompletableFuture<CreateRegistryModuleResponse> createRegistryModule(CreateRegistryModuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateRegistryModule").setMethod(HttpMethod.POST).setPathRegex("/registryModule").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateRegistryModuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateRegistryModuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.</p>
     * 
     * @param request the request parameters of CreateRegistryNamespace  CreateRegistryNamespaceRequest
     * @return CreateRegistryNamespaceResponse
     */
    @Override
    public CompletableFuture<CreateRegistryNamespaceResponse> createRegistryNamespace(CreateRegistryNamespaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateRegistryNamespace").setMethod(HttpMethod.POST).setPathRegex("/registryNamespace").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateRegistryNamespaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateRegistryNamespaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.</p>
     * 
     * @param request the request parameters of CreateResourceExportTask  CreateResourceExportTaskRequest
     * @return CreateResourceExportTaskResponse
     */
    @Override
    public CompletableFuture<CreateResourceExportTaskResponse> createResourceExportTask(CreateResourceExportTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateResourceExportTask").setMethod(HttpMethod.POST).setPathRegex("/exportTasks").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateResourceExportTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateResourceExportTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateStack  CreateStackRequest
     * @return CreateStackResponse
     */
    @Override
    public CompletableFuture<CreateStackResponse> createStack(CreateStackRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateStack").setMethod(HttpMethod.POST).setPathRegex("/stacks").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateStackResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateStackResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.</p>
     * 
     * @param request the request parameters of CreateTask  CreateTaskRequest
     * @return CreateTaskResponse
     */
    @Override
    public CompletableFuture<CreateTaskResponse> createTask(CreateTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateTask").setMethod(HttpMethod.POST).setPathRegex("/tasks").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateTaskFromResourceImport  CreateTaskFromResourceImportRequest
     * @return CreateTaskFromResourceImportResponse
     */
    @Override
    public CompletableFuture<CreateTaskFromResourceImportResponse> createTaskFromResourceImport(CreateTaskFromResourceImportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateTaskFromResourceImport").setMethod(HttpMethod.POST).setPathRegex("/tasks/operations/createTaskFromResourceImport").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTaskFromResourceImportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTaskFromResourceImportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteDetectConfig  DeleteDetectConfigRequest
     * @return DeleteDetectConfigResponse
     */
    @Override
    public CompletableFuture<DeleteDetectConfigResponse> deleteDetectConfig(DeleteDetectConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteDetectConfig").setMethod(HttpMethod.DELETE).setPathRegex("/terraformState/detectConfig/{detectConfigId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDetectConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDetectConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteGroup  DeleteGroupRequest
     * @return DeleteGroupResponse
     */
    @Override
    public CompletableFuture<DeleteGroupResponse> deleteGroup(DeleteGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteGroup").setMethod(HttpMethod.DELETE).setPathRegex("/group/{groupId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation deletes a specified template.</li>
     * <li>Deletion is irreversible. Proceed with caution.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteModule  DeleteModuleRequest
     * @return DeleteModuleResponse
     */
    @Override
    public CompletableFuture<DeleteModuleResponse> deleteModule(DeleteModuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteModule").setMethod(HttpMethod.DELETE).setPathRegex("/modules/{moduleId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteModuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteModuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Deletes a specified parameter set.</p>
     * 
     * @param request the request parameters of DeleteParameterSet  DeleteParameterSetRequest
     * @return DeleteParameterSetResponse
     */
    @Override
    public CompletableFuture<DeleteParameterSetResponse> deleteParameterSet(DeleteParameterSetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteParameterSet").setMethod(HttpMethod.DELETE).setPathRegex("/parameterSets/{parameterSetId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteParameterSetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteParameterSetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteProject  DeleteProjectRequest
     * @return DeleteProjectResponse
     */
    @Override
    public CompletableFuture<DeleteProjectResponse> deleteProject(DeleteProjectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteProject").setMethod(HttpMethod.DELETE).setPathRegex("/project/{projectId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteProjectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteProjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.</p>
     * 
     * @param request the request parameters of DeleteRegistryModule  DeleteRegistryModuleRequest
     * @return DeleteRegistryModuleResponse
     */
    @Override
    public CompletableFuture<DeleteRegistryModuleResponse> deleteRegistryModule(DeleteRegistryModuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteRegistryModule").setMethod(HttpMethod.DELETE).setPathRegex("/registryModule/{namespaceName}/{moduleName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteRegistryModuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteRegistryModuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.</p>
     * 
     * @param request the request parameters of DeleteRegistryModuleVersion  DeleteRegistryModuleVersionRequest
     * @return DeleteRegistryModuleVersionResponse
     */
    @Override
    public CompletableFuture<DeleteRegistryModuleVersionResponse> deleteRegistryModuleVersion(DeleteRegistryModuleVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteRegistryModuleVersion").setMethod(HttpMethod.DELETE).setPathRegex("/registryModuleVersion/{namespaceName}/{moduleName}/{version}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteRegistryModuleVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteRegistryModuleVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.</p>
     * 
     * @param request the request parameters of DeleteRegistryNamespace  DeleteRegistryNamespaceRequest
     * @return DeleteRegistryNamespaceResponse
     */
    @Override
    public CompletableFuture<DeleteRegistryNamespaceResponse> deleteRegistryNamespace(DeleteRegistryNamespaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteRegistryNamespace").setMethod(HttpMethod.DELETE).setPathRegex("/registryNamespace/{namespaceName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteRegistryNamespaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteRegistryNamespaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.</p>
     * 
     * @param request the request parameters of DeleteResourceExportTask  DeleteResourceExportTaskRequest
     * @return DeleteResourceExportTaskResponse
     */
    @Override
    public CompletableFuture<DeleteResourceExportTaskResponse> deleteResourceExportTask(DeleteResourceExportTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteResourceExportTask").setMethod(HttpMethod.DELETE).setPathRegex("/exportTasks/{exportTaskId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteResourceExportTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteResourceExportTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteStack  DeleteStackRequest
     * @return DeleteStackResponse
     */
    @Override
    public CompletableFuture<DeleteStackResponse> deleteStack(DeleteStackRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteStack").setMethod(HttpMethod.DELETE).setPathRegex("/stacks/{stackId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteStackResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteStackResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.
     * Deletes a node. If the node has resources that have not been destroyed, the deletion is not allowed.</p>
     * 
     * @param request the request parameters of DeleteTask  DeleteTaskRequest
     * @return DeleteTaskResponse
     */
    @Override
    public CompletableFuture<DeleteTaskResponse> deleteTask(DeleteTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteTask").setMethod(HttpMethod.DELETE).setPathRegex("/tasks/{taskId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This API is used to perform drift detection on the state files of resource orchestration tasks and stack tasks in the automated service desk.</p>
     * 
     * @param request the request parameters of DetectTerraformState  DetectTerraformStateRequest
     * @return DetectTerraformStateResponse
     */
    @Override
    public CompletableFuture<DetectTerraformStateResponse> detectTerraformState(DetectTerraformStateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DetectTerraformState").setMethod(HttpMethod.POST).setPathRegex("/terraformState/detect").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetectTerraformStateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetectTerraformStateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DissociateDetectConfig  DissociateDetectConfigRequest
     * @return DissociateDetectConfigResponse
     */
    @Override
    public CompletableFuture<DissociateDetectConfigResponse> dissociateDetectConfig(DissociateDetectConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DissociateDetectConfig").setMethod(HttpMethod.PUT).setPathRegex("/terraformState/detectConfig/operations/dissociate").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DissociateDetectConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DissociateDetectConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DissociateGroup  DissociateGroupRequest
     * @return DissociateGroupResponse
     */
    @Override
    public CompletableFuture<DissociateGroupResponse> dissociateGroup(DissociateGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DissociateGroup").setMethod(HttpMethod.POST).setPathRegex("/group/{groupId}/dissociate").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DissociateGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DissociateGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DissociateParameterSet  DissociateParameterSetRequest
     * @return DissociateParameterSetResponse
     */
    @Override
    public CompletableFuture<DissociateParameterSetResponse> dissociateParameterSet(DissociateParameterSetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DissociateParameterSet").setMethod(HttpMethod.POST).setPathRegex("/parameterSets/operations/dissociate").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DissociateParameterSetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DissociateParameterSetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This API operation is used to execute Terraform Module code to create or update cloud resources. Before using this API operation, make sure that all required authentication information is correctly configured and that the Terraform code corresponding to the Module meets the expected functional requirements.</p>
     * 
     * @param request the request parameters of ExecuteRegistryModule  ExecuteRegistryModuleRequest
     * @return ExecuteRegistryModuleResponse
     */
    @Override
    public CompletableFuture<ExecuteRegistryModuleResponse> executeRegistryModule(ExecuteRegistryModuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ExecuteRegistryModule").setMethod(HttpMethod.PUT).setPathRegex("/registryModule/{namespaceName}/{moduleName}/execution").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExecuteRegistryModuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExecuteRegistryModuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.</p>
     * 
     * @param request the request parameters of ExecuteResourceExportTask  ExecuteResourceExportTaskRequest
     * @return ExecuteResourceExportTaskResponse
     */
    @Override
    public CompletableFuture<ExecuteResourceExportTaskResponse> executeResourceExportTask(ExecuteResourceExportTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ExecuteResourceExportTask").setMethod(HttpMethod.PUT).setPathRegex("/exportTasks/execute/{exportTaskId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExecuteResourceExportTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExecuteResourceExportTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Executes the Terraform Apply command to create or update cloud resources based on the provided Terraform code. This API can handle complex scenarios such as operations that depend on a previous state.
     * Before calling this API, ensure that all required authentication information is properly configured and that the Terraform code meets the expected functional requirements.</p>
     * 
     * @param request the request parameters of ExecuteTerraformApply  ExecuteTerraformApplyRequest
     * @return ExecuteTerraformApplyResponse
     */
    @Override
    public CompletableFuture<ExecuteTerraformApplyResponse> executeTerraformApply(ExecuteTerraformApplyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ExecuteTerraformApply").setMethod(HttpMethod.POST).setPathRegex("/terraform/execution/apply").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExecuteTerraformApplyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExecuteTerraformApplyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Executes the Terraform Destroy command to destroy resources created by Terraform.</p>
     * 
     * @param request the request parameters of ExecuteTerraformDestroy  ExecuteTerraformDestroyRequest
     * @return ExecuteTerraformDestroyResponse
     */
    @Override
    public CompletableFuture<ExecuteTerraformDestroyResponse> executeTerraformDestroy(ExecuteTerraformDestroyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ExecuteTerraformDestroy").setMethod(HttpMethod.PUT).setPathRegex("/terraform/execution/destroy").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExecuteTerraformDestroyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExecuteTerraformDestroyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Executes a Terraform Plan command by using the provided Terraform code to create or update cloud resources. This API operation can handle complex scenarios such as operations that depend on a previous state.
     * Before calling this API operation, ensure that all required authentication information is properly configured and that the Terraform code meets the expected functional requirements.</p>
     * 
     * @param request the request parameters of ExecuteTerraformPlan  ExecuteTerraformPlanRequest
     * @return ExecuteTerraformPlanResponse
     */
    @Override
    public CompletableFuture<ExecuteTerraformPlanResponse> executeTerraformPlan(ExecuteTerraformPlanRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ExecuteTerraformPlan").setMethod(HttpMethod.POST).setPathRegex("/terraform/execution/plan").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExecuteTerraformPlanResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExecuteTerraformPlanResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GenerateModule  GenerateModuleRequest
     * @return GenerateModuleResponse
     */
    @Override
    public CompletableFuture<GenerateModuleResponse> generateModule(GenerateModuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GenerateModule").setMethod(HttpMethod.POST).setPathRegex("/explorer/generate/module").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GenerateModuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GenerateModuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDetectConfig  GetDetectConfigRequest
     * @return GetDetectConfigResponse
     */
    @Override
    public CompletableFuture<GetDetectConfigResponse> getDetectConfig(GetDetectConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetDetectConfig").setMethod(HttpMethod.GET).setPathRegex("/terraformState/detectConfig/{detectConfigId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDetectConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDetectConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetEncryptionConfig  GetEncryptionConfigRequest
     * @return GetEncryptionConfigResponse
     */
    @Override
    public CompletableFuture<GetEncryptionConfigResponse> getEncryptionConfig(GetEncryptionConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetEncryptionConfig").setMethod(HttpMethod.GET).setPathRegex("/encryption/config").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetEncryptionConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetEncryptionConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Retrieves the result of a Terraform run.</p>
     * 
     * @param request the request parameters of GetExecuteState  GetExecuteStateRequest
     * @return GetExecuteStateResponse
     */
    @Override
    public CompletableFuture<GetExecuteStateResponse> getExecuteState(GetExecuteStateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetExecuteState").setMethod(HttpMethod.GET).setPathRegex("/terraform/execution/{stateId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetExecuteStateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetExecuteStateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetGroup  GetGroupRequest
     * @return GetGroupResponse
     */
    @Override
    public CompletableFuture<GetGroupResponse> getGroup(GetGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetGroup").setMethod(HttpMethod.GET).setPathRegex("/group/{groupId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.</p>
     * 
     * @param request the request parameters of GetJob  GetJobRequest
     * @return GetJobResponse
     */
    @Override
    public CompletableFuture<GetJobResponse> getJob(GetJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetJob").setMethod(HttpMethod.GET).setPathRegex("/tasks/{taskId}/jobs/{jobId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>You can call this operation to query the details of a specified template, including but not limited to the template name, description, source, status, and latest version. You must specify the template ID and include authentication information in the request.</p>
     * 
     * @param request the request parameters of GetModule  GetModuleRequest
     * @return GetModuleResponse
     */
    @Override
    public CompletableFuture<GetModuleResponse> getModule(GetModuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetModule").setMethod(HttpMethod.GET).setPathRegex("/modules/{moduleId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetModuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetModuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>You can call this operation to query the details of a specific version of a specified template, including the version number, description, and release time. Make sure that the template ID and version number are correct.</p>
     * 
     * @param request the request parameters of GetModuleVersion  GetModuleVersionRequest
     * @return GetModuleVersionResponse
     */
    @Override
    public CompletableFuture<GetModuleVersionResponse> getModuleVersion(GetModuleVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetModuleVersion").setMethod(HttpMethod.GET).setPathRegex("/modules/{moduleId}/versions/{moduleVersion}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetModuleVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetModuleVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation retrieves detailed parameter set information by specifying a <code>parameterSetId</code>.</li>
     * <li>Authentication is required to access this operation.</li>
     * <li>If the request is successful, detailed data including the parameter set name, description, and parameter list is returned.</li>
     * </ul>
     * 
     * @param request the request parameters of GetParameterSet  GetParameterSetRequest
     * @return GetParameterSetResponse
     */
    @Override
    public CompletableFuture<GetParameterSetResponse> getParameterSet(GetParameterSetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetParameterSet").setMethod(HttpMethod.GET).setPathRegex("/parameterSets/{parameterSetId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetParameterSetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetParameterSetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetProject  GetProjectRequest
     * @return GetProjectResponse
     */
    @Override
    public CompletableFuture<GetProjectResponse> getProject(GetProjectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetProject").setMethod(HttpMethod.GET).setPathRegex("/project/{projectId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetProjectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetProjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetProviderDocument  GetProviderDocumentRequest
     * @return GetProviderDocumentResponse
     */
    @Override
    public CompletableFuture<GetProviderDocumentResponse> getProviderDocument(GetProviderDocumentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetProviderDocument").setMethod(HttpMethod.GET).setPathRegex("/version/terraform/provider/document").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetProviderDocumentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetProviderDocumentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 200 calls per second.</p>
     * 
     * @param request the request parameters of GetRegistryModule  GetRegistryModuleRequest
     * @return GetRegistryModuleResponse
     */
    @Override
    public CompletableFuture<GetRegistryModuleResponse> getRegistryModule(GetRegistryModuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetRegistryModule").setMethod(HttpMethod.GET).setPathRegex("/registryModule/{namespaceName}/{moduleName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetRegistryModuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetRegistryModuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 200 calls per second.</p>
     * 
     * @param request the request parameters of GetRegistryModuleVersion  GetRegistryModuleVersionRequest
     * @return GetRegistryModuleVersionResponse
     */
    @Override
    public CompletableFuture<GetRegistryModuleVersionResponse> getRegistryModuleVersion(GetRegistryModuleVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetRegistryModuleVersion").setMethod(HttpMethod.GET).setPathRegex("/registryModuleVersion/{namespaceName}/{moduleName}/{version}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetRegistryModuleVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetRegistryModuleVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 200 calls per second.</p>
     * 
     * @param request the request parameters of GetRegistryNamespace  GetRegistryNamespaceRequest
     * @return GetRegistryNamespaceResponse
     */
    @Override
    public CompletableFuture<GetRegistryNamespaceResponse> getRegistryNamespace(GetRegistryNamespaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetRegistryNamespace").setMethod(HttpMethod.GET).setPathRegex("/registryNamespace/{namespaceName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetRegistryNamespaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetRegistryNamespaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.</p>
     * 
     * @param request the request parameters of GetResourceExportTask  GetResourceExportTaskRequest
     * @return GetResourceExportTaskResponse
     */
    @Override
    public CompletableFuture<GetResourceExportTaskResponse> getResourceExportTask(GetResourceExportTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetResourceExportTask").setMethod(HttpMethod.GET).setPathRegex("/exportTasks/{exportTaskId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetResourceExportTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetResourceExportTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request description.</h2>
     * 
     * @param request the request parameters of GetResourceType  GetResourceTypeRequest
     * @return GetResourceTypeResponse
     */
    @Override
    public CompletableFuture<GetResourceTypeResponse> getResourceType(GetResourceTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetResourceType").setMethod(HttpMethod.GET).setPathRegex("/resourceType/{resourceType}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetResourceTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetResourceTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetStack  GetStackRequest
     * @return GetStackResponse
     */
    @Override
    public CompletableFuture<GetStackResponse> getStack(GetStackRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetStack").setMethod(HttpMethod.GET).setPathRegex("/stacks/{stackId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetStackResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetStackResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetStackDeployments  GetStackDeploymentsRequest
     * @return GetStackDeploymentsResponse
     */
    @Override
    public CompletableFuture<GetStackDeploymentsResponse> getStackDeployments(GetStackDeploymentsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetStackDeployments").setMethod(HttpMethod.GET).setPathRegex("/stacks/{stackId}/deployments").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetStackDeploymentsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetStackDeploymentsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetStackExecutionResult  GetStackExecutionResultRequest
     * @return GetStackExecutionResultResponse
     */
    @Override
    public CompletableFuture<GetStackExecutionResultResponse> getStackExecutionResult(GetStackExecutionResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetStackExecutionResult").setMethod(HttpMethod.GET).setPathRegex("/stacks/trigger/{triggerId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetStackExecutionResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetStackExecutionResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Per-user call frequency: 100 calls per second.</p>
     * 
     * @param request the request parameters of GetTask  GetTaskRequest
     * @return GetTaskResponse
     */
    @Override
    public CompletableFuture<GetTaskResponse> getTask(GetTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetTask").setMethod(HttpMethod.GET).setPathRegex("/tasks/{taskId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This API is used to retrieve the detection results of state files for resource orchestration tasks and stack tasks on the automation service desk.</p>
     * 
     * @param request the request parameters of GetTerraformStateDetection  GetTerraformStateDetectionRequest
     * @return GetTerraformStateDetectionResponse
     */
    @Override
    public CompletableFuture<GetTerraformStateDetectionResponse> getTerraformStateDetection(GetTerraformStateDetectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetTerraformStateDetection").setMethod(HttpMethod.GET).setPathRegex("/terraformState/detect/{detectionId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTerraformStateDetectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTerraformStateDetectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDetectConfigRelations  ListDetectConfigRelationsRequest
     * @return ListDetectConfigRelationsResponse
     */
    @Override
    public CompletableFuture<ListDetectConfigRelationsResponse> listDetectConfigRelations(ListDetectConfigRelationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListDetectConfigRelations").setMethod(HttpMethod.GET).setPathRegex("/terraformState/detectConfig/operations/relation").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDetectConfigRelationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDetectConfigRelationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDetectConfigs  ListDetectConfigsRequest
     * @return ListDetectConfigsResponse
     */
    @Override
    public CompletableFuture<ListDetectConfigsResponse> listDetectConfigs(ListDetectConfigsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListDetectConfigs").setMethod(HttpMethod.GET).setPathRegex("/terraformState/detectConfig").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDetectConfigsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDetectConfigsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation queries the example information of Terraform Modules officially provided by Alibaba Cloud.
     * You can use the <code>maxResults</code> parameter to adjust the maximum number of entries to return.</p>
     * <ul>
     * <li>If <code>nextToken</code> is not included in the response, no more data is available. Otherwise, more data is available. To query the next page, set the <code>nextToken</code> parameter of the ListExplorerRegistryModuleExamples operation to the <code>nextToken</code> value returned in the previous response. If the <code>NextToken</code> parameter is not specified, the first page of data is returned by default.</li>
     * <li>You can use keyword, namespaceName, moduleName, moduleVersion, and exampleName as conditional filter settings to narrow down the search scope. Multiple filter conditions have a logical <code>AND</code> relationship, and only resources that meet all filter conditions are returned.<ul>
     * <li>keyword: optional. Searches by keyword and supports fuzzy match on exampleName. For example, if keyword is set to ecs, module examples whose names contain ecs are returned.</li>
     * <li>namespaceName: optional. Filters module examples by a specific workspace. For example, if namespaceName is set to alibaba, module examples in the alibaba workspace are returned.</li>
     * <li>moduleName: optional. Filters module examples by a specific module name. For example, if moduleName is set to ecs, module examples whose module name is ecs are returned.</li>
     * <li>moduleVersion: optional. Filters module examples by a specific module version. For example, if moduleVersion is set to 1.0.0, module examples whose module version is 1.0.0 are returned.</li>
     * <li>exampleName: optional. Filters module examples by a specific example name. For example, if exampleName is set to ecs, module examples whose example name is ecs are returned.
     * The response contains the request ID, total number of entries, data of the current page, and pagination information, which facilitates processing of query results.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ListExplorerRegistryModuleExamples  ListExplorerRegistryModuleExamplesRequest
     * @return ListExplorerRegistryModuleExamplesResponse
     */
    @Override
    public CompletableFuture<ListExplorerRegistryModuleExamplesResponse> listExplorerRegistryModuleExamples(ListExplorerRegistryModuleExamplesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListExplorerRegistryModuleExamples").setMethod(HttpMethod.GET).setPathRegex("/explorerRegistryModule/example").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListExplorerRegistryModuleExamplesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListExplorerRegistryModuleExamplesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation queries the version information of official Terraform modules provided by Alibaba Cloud.
     * You can use the <code>maxResults</code> parameter to adjust the maximum number of entries to return.</p>
     * <ul>
     * <li>If <code>nextToken</code> is not included in the response, no more data is available. Otherwise, more data is available. To query the next page, set the <code>nextToken</code> parameter of the ListExplorerRegistryModules operation to the <code>nextToken</code> value returned in the previous response. If the <code>NextToken</code> parameter is not specified, the first page of data is returned by default.</li>
     * <li>You can use keyword, namespaceName, moduleName, and moduleVersion as conditional filter Settings to narrow the search scope. Multiple filter conditions have a logical <code>AND</code> relationship. Only resources that meet all filter conditions are returned.<ul>
     * <li>keyword: optional. Performs a fuzzy match on the module name. For example, if keyword is set to ecs, modules whose names contain ecs are returned.</li>
     * <li>namespaceName: optional. Filters modules by a specific workspace. For example, if namespaceName is set to alibaba, modules whose workspace is alibaba are returned. When moduleName is specified, namespaceName must also be specified. You can call the ListExplorerRegistryModule operation to obtain the namespaceName information.</li>
     * <li>moduleName: optional. Filters modules by a specific name. For example, if moduleName is set to ecs, modules whose name is ecs are returned.</li>
     * <li>moduleVersion: optional. Filters modules by a specific version. For example, if moduleVersion is set to 1.0.0, modules whose version is 1.0.0 are returned.
     * The response contains the request ID, total number of entries, data on the current page, and pagination information, which facilitates the processing of query results.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ListExplorerRegistryModuleVersions  ListExplorerRegistryModuleVersionsRequest
     * @return ListExplorerRegistryModuleVersionsResponse
     */
    @Override
    public CompletableFuture<ListExplorerRegistryModuleVersionsResponse> listExplorerRegistryModuleVersions(ListExplorerRegistryModuleVersionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListExplorerRegistryModuleVersions").setMethod(HttpMethod.GET).setPathRegex("/explorerRegistryModule/version").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListExplorerRegistryModuleVersionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListExplorerRegistryModuleVersionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation queries information about official Terraform modules provided by Alibaba Cloud.
     * You can use the <code>maxResults</code> parameter to adjust the maximum number of entries to return.</p>
     * <ul>
     * <li>If the <code>nextToken</code> parameter is not included in the response, no more data is available. Otherwise, more data is available. To query the next page, set the <code>nextToken</code> parameter of the ListExplorerRegistryModules operation to the <code>nextToken</code> value returned in the previous response. If you do not specify the <code>NextToken</code> parameter, the first page of data is returned by default.</li>
     * <li>You can use keyword and moduleName as filter conditions to narrow the search scope. Multiple filter conditions are evaluated by using a logical <code>AND</code>. Only resources that meet all filter conditions are returned.<ul>
     * <li>keyword: optional. Searches by keyword through fuzzy matching against ModuleName. For example, if keyword is set to ecs, modules whose names contain ecs are returned.</li>
     * <li>moduleName: optional. Filters modules by a specific name. For example, if moduleName is set to ecs, only the module whose name is exactly ecs is returned.
     * The response contains the request ID, total number of entries, data of the current page, and pagination information, which facilitates the processing of query results.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ListExplorerRegistryModules  ListExplorerRegistryModulesRequest
     * @return ListExplorerRegistryModulesResponse
     */
    @Override
    public CompletableFuture<ListExplorerRegistryModulesResponse> listExplorerRegistryModules(ListExplorerRegistryModulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListExplorerRegistryModules").setMethod(HttpMethod.GET).setPathRegex("/explorerRegistryModule").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListExplorerRegistryModulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListExplorerRegistryModulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListGroup  ListGroupRequest
     * @return ListGroupResponse
     */
    @Override
    public CompletableFuture<ListGroupResponse> listGroup(ListGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListGroup").setMethod(HttpMethod.GET).setPathRegex("/group").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.</p>
     * 
     * @param request the request parameters of ListJobs  ListJobsRequest
     * @return ListJobsResponse
     */
    @Override
    public CompletableFuture<ListJobsResponse> listJobs(ListJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListJobs").setMethod(HttpMethod.GET).setPathRegex("/tasks/{taskId}/jobs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListJobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.</p>
     * 
     * @param request the request parameters of ListModuleVersion  ListModuleVersionRequest
     * @return ListModuleVersionResponse
     */
    @Override
    public CompletableFuture<ListModuleVersionResponse> listModuleVersion(ListModuleVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListModuleVersion").setMethod(HttpMethod.GET).setPathRegex("/modules/{moduleId}/versions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListModuleVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListModuleVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This operation lists all Terraform templates under the current user. You can specify query parameters to implement pagination, fuzzy match template names, filter templates by source or status, and more. You can also filter templates by tags for more granular results.</p>
     * <h3>Precautions</h3>
     * <ul>
     * <li>The pagination parameters <code>pageNumber</code> and <code>pageSize</code> help control the number of returned results.</li>
     * <li>Use the <code>name</code> parameter to perform a fuzzy match search on template names.</li>
     * <li>Use the <code>source</code> parameter to filter templates by source (such as OSS import or file upload).</li>
     * <li>Use the <code>status</code> parameter to filter templates by status (such as created or published).</li>
     * <li>Tag filtering requires a JSON-formatted string, for example, <code>[{&quot;key&quot;:&quot;env&quot;,&quot;value&quot;:&quot;prod&quot;}]</code>.</li>
     * </ul>
     * 
     * @param request the request parameters of ListModules  ListModulesRequest
     * @return ListModulesResponse
     */
    @Override
    public CompletableFuture<ListModulesResponse> listModules(ListModulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListModules").setMethod(HttpMethod.GET).setPathRegex("/modules").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListModulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListModulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListParameterSetRelation  ListParameterSetRelationRequest
     * @return ListParameterSetRelationResponse
     */
    @Override
    public CompletableFuture<ListParameterSetRelationResponse> listParameterSetRelation(ListParameterSetRelationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListParameterSetRelation").setMethod(HttpMethod.GET).setPathRegex("/parameterSets/operations/relation").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListParameterSetRelationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListParameterSetRelationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This operation queries all parameter sets in the system and supports filtering by keyword and paginated results. Authentication information is required in the request.</p>
     * <h3>Notes</h3>
     * <ul>
     * <li>The <code>keyword</code> parameter can be used to fuzzy match parameter sets by name or description.</li>
     * <li>Pagination is controlled by <code>pageNumber</code> and <code>pageSize</code>. By default, results start from the first page. The page size is customizable but should be set to a reasonable value to avoid performance issues.</li>
     * </ul>
     * 
     * @param request the request parameters of ListParameterSets  ListParameterSetsRequest
     * @return ListParameterSetsResponse
     */
    @Override
    public CompletableFuture<ListParameterSetsResponse> listParameterSets(ListParameterSetsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListParameterSets").setMethod(HttpMethod.GET).setPathRegex("/parameterSets").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListParameterSetsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListParameterSetsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li><strong>Keyword search</strong>: Use the <code>keyword</code> parameter for fuzzy matching.</li>
     * <li><strong>Paged query</strong>: Use <code>nextToken</code> for pagination and <code>maxResults</code> to specify the maximum number of results per page (default: 100, maximum: 200).</li>
     * <li><strong>Terraform Provider version</strong>: The optional <code>terraformProviderVersion</code> parameter filters products associated with a specific Provider version.</li>
     * <li><strong>Response structure</strong>: The response contains the request ID, total number of entries, data of the current page, and pagination information for easy processing of query results.</li>
     * </ul>
     * 
     * @param request the request parameters of ListProducts  ListProductsRequest
     * @return ListProductsResponse
     */
    @Override
    public CompletableFuture<ListProductsResponse> listProducts(ListProductsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListProducts").setMethod(HttpMethod.GET).setPathRegex("/products").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListProductsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListProductsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListProject  ListProjectRequest
     * @return ListProjectResponse
     */
    @Override
    public CompletableFuture<ListProjectResponse> listProject(ListProjectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListProject").setMethod(HttpMethod.GET).setPathRegex("/project").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListProjectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListProjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 200 calls per second.</p>
     * 
     * @param request the request parameters of ListRegistryModuleVersions  ListRegistryModuleVersionsRequest
     * @return ListRegistryModuleVersionsResponse
     */
    @Override
    public CompletableFuture<ListRegistryModuleVersionsResponse> listRegistryModuleVersions(ListRegistryModuleVersionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListRegistryModuleVersions").setMethod(HttpMethod.GET).setPathRegex("/registryModuleVersion").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRegistryModuleVersionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRegistryModuleVersionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 200 calls per second.</p>
     * 
     * @param request the request parameters of ListRegistryModules  ListRegistryModulesRequest
     * @return ListRegistryModulesResponse
     */
    @Override
    public CompletableFuture<ListRegistryModulesResponse> listRegistryModules(ListRegistryModulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListRegistryModules").setMethod(HttpMethod.GET).setPathRegex("/registryModules").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRegistryModulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRegistryModulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 200 calls per second.</p>
     * 
     * @param request the request parameters of ListRegistryNamespaces  ListRegistryNamespacesRequest
     * @return ListRegistryNamespacesResponse
     */
    @Override
    public CompletableFuture<ListRegistryNamespacesResponse> listRegistryNamespaces(ListRegistryNamespacesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListRegistryNamespaces").setMethod(HttpMethod.GET).setPathRegex("/registryNamespace").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRegistryNamespacesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRegistryNamespacesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.</p>
     * 
     * @param request the request parameters of ListResourceExportTaskVersions  ListResourceExportTaskVersionsRequest
     * @return ListResourceExportTaskVersionsResponse
     */
    @Override
    public CompletableFuture<ListResourceExportTaskVersionsResponse> listResourceExportTaskVersions(ListResourceExportTaskVersionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListResourceExportTaskVersions").setMethod(HttpMethod.GET).setPathRegex("/exportTasks/{exportTaskId}/exportVersions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListResourceExportTaskVersionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListResourceExportTaskVersionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Rate limit per user: 100 calls per second.</p>
     * 
     * @param request the request parameters of ListResourceExportTasks  ListResourceExportTasksRequest
     * @return ListResourceExportTasksResponse
     */
    @Override
    public CompletableFuture<ListResourceExportTasksResponse> listResourceExportTasks(ListResourceExportTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListResourceExportTasks").setMethod(HttpMethod.GET).setPathRegex("/exportTasks").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListResourceExportTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListResourceExportTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This API allows you to perform a conditional query for a list of resource types based on conditions such as product code, Terraform Provider version, child class, status, and keyword. The results contain detailed information about resources, including product code, status, status effective version, child class, Terraform Provider version, and resource type code. Paging is supported for handling large amounts of data.</p>
     * 
     * @param request the request parameters of ListResourceTypes  ListResourceTypesRequest
     * @return ListResourceTypesResponse
     */
    @Override
    public CompletableFuture<ListResourceTypesResponse> listResourceTypes(ListResourceTypesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListResourceTypes").setMethod(HttpMethod.GET).setPathRegex("/resourceTypes").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListResourceTypesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListResourceTypesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListResources  ListResourcesRequest
     * @return ListResourcesResponse
     */
    @Override
    public CompletableFuture<ListResourcesResponse> listResources(ListResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListResources").setMethod(HttpMethod.GET).setPathRegex("/resources/stateparser").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListStackConfigs  ListStackConfigsRequest
     * @return ListStackConfigsResponse
     */
    @Override
    public CompletableFuture<ListStackConfigsResponse> listStackConfigs(ListStackConfigsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListStackConfigs").setMethod(HttpMethod.GET).setPathRegex("/stacks/{stackId}/configs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListStackConfigsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListStackConfigsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListStacks  ListStacksRequest
     * @return ListStacksResponse
     */
    @Override
    public CompletableFuture<ListStacksResponse> listStacks(ListStacksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListStacks").setMethod(HttpMethod.GET).setPathRegex("/stacks").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListStacksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListStacksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Per-user call frequency: 100 calls per second.</p>
     * 
     * @param request the request parameters of ListTasks  ListTasksRequest
     * @return ListTasksResponse
     */
    @Override
    public CompletableFuture<ListTasksResponse> listTasks(ListTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListTasks").setMethod(HttpMethod.GET).setPathRegex("/tasks").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTerraformProviderVersions  ListTerraformProviderVersionsRequest
     * @return ListTerraformProviderVersionsResponse
     */
    @Override
    public CompletableFuture<ListTerraformProviderVersionsResponse> listTerraformProviderVersions(ListTerraformProviderVersionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListTerraformProviderVersions").setMethod(HttpMethod.GET).setPathRegex("/version/terraform/provider").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTerraformProviderVersionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTerraformProviderVersionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This API is used to manage state files for resource orchestration tasks and stack tasks on the automated service desk.
     * Before using this API, make sure that all required authentication information is correctly configured and that the Terraform code meets the expected functional requirements.</p>
     * 
     * @param request the request parameters of ManageTerraformState  ManageTerraformStateRequest
     * @return ManageTerraformStateResponse
     */
    @Override
    public CompletableFuture<ManageTerraformStateResponse> manageTerraformState(ManageTerraformStateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ManageTerraformState").setMethod(HttpMethod.POST).setPathRegex("/terraformState/manage").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ManageTerraformStateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ManageTerraformStateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Per-user call frequency: 100 calls per second.</p>
     * 
     * @param request the request parameters of OperateJob  OperateJobRequest
     * @return OperateJobResponse
     */
    @Override
    public CompletableFuture<OperateJobResponse> operateJob(OperateJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("OperateJob").setMethod(HttpMethod.POST).setPathRegex("/tasks/{taskId}/jobs/{jobId}/operation/{operationType}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OperateJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OperateJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.</p>
     * 
     * @param request the request parameters of PublishRegistryModuleVersion  PublishRegistryModuleVersionRequest
     * @return PublishRegistryModuleVersionResponse
     */
    @Override
    public CompletableFuture<PublishRegistryModuleVersionResponse> publishRegistryModuleVersion(PublishRegistryModuleVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PublishRegistryModuleVersion").setMethod(HttpMethod.POST).setPathRegex("/registryModuleVersion").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PublishRegistryModuleVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PublishRegistryModuleVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.</p>
     * 
     * @param request the request parameters of RemoveSharedAccounts  RemoveSharedAccountsRequest
     * @return RemoveSharedAccountsResponse
     */
    @Override
    public CompletableFuture<RemoveSharedAccountsResponse> removeSharedAccounts(RemoveSharedAccountsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RemoveSharedAccounts").setMethod(HttpMethod.DELETE).setPathRegex("/sharedAccounts").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveSharedAccountsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveSharedAccountsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetEncryptionConfig  SetEncryptionConfigRequest
     * @return SetEncryptionConfigResponse
     */
    @Override
    public CompletableFuture<SetEncryptionConfigResponse> setEncryptionConfig(SetEncryptionConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SetEncryptionConfig").setMethod(HttpMethod.PUT).setPathRegex("/encryption/config").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetEncryptionConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetEncryptionConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TriggerStackExecution  TriggerStackExecutionRequest
     * @return TriggerStackExecutionResponse
     */
    @Override
    public CompletableFuture<TriggerStackExecutionResponse> triggerStackExecution(TriggerStackExecutionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("TriggerStackExecution").setMethod(HttpMethod.POST).setPathRegex("/stacks/trigger").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TriggerStackExecutionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TriggerStackExecutionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <ul>
     * <li><code>detectConfigId</code> is a required parameter used to identify the specific detection configuration to update.  </li>
     * <li>When <code>triggerType</code> is set to <code>Cron</code>, a valid <code>cronExpression</code> must be provided.  </li>
     * <li>Each element in the <code>alarmConfigs</code> list must include an alert type (<code>type</code>) and an address (<code>address</code>).  </li>
     * <li>If you do not want to change certain properties (such as <code>name</code>, <code>description</code>, etc.), you can omit these fields from the request body.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateDetectConfig  UpdateDetectConfigRequest
     * @return UpdateDetectConfigResponse
     */
    @Override
    public CompletableFuture<UpdateDetectConfigResponse> updateDetectConfig(UpdateDetectConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateDetectConfig").setMethod(HttpMethod.PUT).setPathRegex("/terraformState/detectConfig/{detectConfigId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDetectConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDetectConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Updates an Explorer template.</p>
     * 
     * @param request the request parameters of UpdateExplorerModuleAttribute  UpdateExplorerModuleAttributeRequest
     * @return UpdateExplorerModuleAttributeResponse
     */
    @Override
    public CompletableFuture<UpdateExplorerModuleAttributeResponse> updateExplorerModuleAttribute(UpdateExplorerModuleAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateExplorerModuleAttribute").setMethod(HttpMethod.PUT).setPathRegex("/explorerModule/{explorerModuleId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateExplorerModuleAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateExplorerModuleAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateGroup  UpdateGroupRequest
     * @return UpdateGroupResponse
     */
    @Override
    public CompletableFuture<UpdateGroupResponse> updateGroup(UpdateGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateGroup").setMethod(HttpMethod.POST).setPathRegex("/group/{groupId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation allows you to modify the basic attributes of an existing template, including but not limited to the template name, description, and tags.</li>
     * <li>The update operation does not affect the content or version information of the template.</li>
     * <li>To enable or disable deletion protection, use the deletionProtection parameter.</li>
     * <li>Use clientToken to ensure the idempotence of the request and avoid duplicate submissions caused by network issues.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateModuleAttribute  UpdateModuleAttributeRequest
     * @return UpdateModuleAttributeResponse
     */
    @Override
    public CompletableFuture<UpdateModuleAttributeResponse> updateModuleAttribute(UpdateModuleAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateModuleAttribute").setMethod(HttpMethod.PUT).setPathRegex("/modules/{moduleId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateModuleAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateModuleAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation allows you to modify the basic information of an existing parameter set, including the name and description.</li>
     * <li>If the request includes the <code>parameters</code> field, the parameter list in the parameter set is updated.</li>
     * <li>The <code>clientToken</code> field can be used to ensure the idempotence of the request.</li>
     * <li>The update operation requires a valid <code>parameterSetId</code> as a path parameter.</li>
     * <li>The request must include authentication information to pass identity verification.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateParameterSetAttribute  UpdateParameterSetAttributeRequest
     * @return UpdateParameterSetAttributeResponse
     */
    @Override
    public CompletableFuture<UpdateParameterSetAttributeResponse> updateParameterSetAttribute(UpdateParameterSetAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateParameterSetAttribute").setMethod(HttpMethod.PUT).setPathRegex("/parameterSets/{parameterSetId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateParameterSetAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateParameterSetAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateProject  UpdateProjectRequest
     * @return UpdateProjectResponse
     */
    @Override
    public CompletableFuture<UpdateProjectResponse> updateProject(UpdateProjectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateProject").setMethod(HttpMethod.POST).setPathRegex("/project/{projectId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateProjectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateProjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.</p>
     * 
     * @param request the request parameters of UpdateRegistryModuleAttribute  UpdateRegistryModuleAttributeRequest
     * @return UpdateRegistryModuleAttributeResponse
     */
    @Override
    public CompletableFuture<UpdateRegistryModuleAttributeResponse> updateRegistryModuleAttribute(UpdateRegistryModuleAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateRegistryModuleAttribute").setMethod(HttpMethod.PUT).setPathRegex("/registryModule/{namespaceName}/{moduleName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateRegistryModuleAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateRegistryModuleAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.</p>
     * 
     * @param request the request parameters of UpdateRegistryNamespaceAttribute  UpdateRegistryNamespaceAttributeRequest
     * @return UpdateRegistryNamespaceAttributeResponse
     */
    @Override
    public CompletableFuture<UpdateRegistryNamespaceAttributeResponse> updateRegistryNamespaceAttribute(UpdateRegistryNamespaceAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateRegistryNamespaceAttribute").setMethod(HttpMethod.PUT).setPathRegex("/registryNamespace/{namespaceName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateRegistryNamespaceAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateRegistryNamespaceAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.</p>
     * 
     * @param request the request parameters of UpdateResourceExportTaskAttribute  UpdateResourceExportTaskAttributeRequest
     * @return UpdateResourceExportTaskAttributeResponse
     */
    @Override
    public CompletableFuture<UpdateResourceExportTaskAttributeResponse> updateResourceExportTaskAttribute(UpdateResourceExportTaskAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateResourceExportTaskAttribute").setMethod(HttpMethod.PUT).setPathRegex("/exportTasks/{exportTaskId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateResourceExportTaskAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateResourceExportTaskAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateStack  UpdateStackRequest
     * @return UpdateStackResponse
     */
    @Override
    public CompletableFuture<UpdateStackResponse> updateStack(UpdateStackRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateStack").setMethod(HttpMethod.PUT).setPathRegex("/stacks/{stackId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateStackResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateStackResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Single-user call frequency: 100 calls per second.</p>
     * 
     * @param request the request parameters of UpdateTaskAttribute  UpdateTaskAttributeRequest
     * @return UpdateTaskAttributeResponse
     */
    @Override
    public CompletableFuture<UpdateTaskAttributeResponse> updateTaskAttribute(UpdateTaskAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateTaskAttribute").setMethod(HttpMethod.PUT).setPathRegex("/tasks/{taskId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateTaskAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateTaskAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Performs a dry run on the content of a Terraform configuration file.</p>
     * 
     * @param request the request parameters of ValidateModule  ValidateModuleRequest
     * @return ValidateModuleResponse
     */
    @Override
    public CompletableFuture<ValidateModuleResponse> validateModule(ValidateModuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ValidateModule").setMethod(HttpMethod.POST).setPathRegex("/module/validation").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ValidateModuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ValidateModuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public ResponseIterable<ValidateModuleResponseBody> validateModuleWithResponseIterable(ValidateModuleRequest request) {
        this.handler.validateRequestModel(request);
        TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.SSE).setAction("ValidateModule").setMethod(HttpMethod.POST).setPathRegex("/module/validation").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
        ValidateModuleResponseBodyIterator iterator = ValidateModuleResponseBodyIterator.create();
        ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withHttpResponseHandler(new SSEHttpResponseHandler(iterator));
        this.handler.execute(params);
        return new ResponseIterable<>(iterator);
    }

}
