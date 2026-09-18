// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aisc20260101;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.aisc20260101.models.*;
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
        this.product = "AISC";
        this.version = "2026-01-01";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("cn-zhangjiakou", "aisc.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "aisc.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-qingdao", "aisc.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-nanjing", "aisc.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "aisc.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "aisc.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-guangzhou", "aisc.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-beijing", "aisc.cn-shanghai.aliyuncs.com"),
            new TeaPair("ap-southeast-7", "aisc.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-6", "aisc.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "aisc.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-northeast-2", "aisc.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "aisc.ap-southeast-1.aliyuncs.com"),
            new TeaPair("eu-central-1", "aisc.ap-southeast-1.aliyuncs.com"),
            new TeaPair("eu-west-1", "aisc.ap-southeast-1.aliyuncs.com"),
            new TeaPair("us-east-1", "aisc.ap-southeast-1.aliyuncs.com"),
            new TeaPair("us-west-1", "aisc.ap-southeast-1.aliyuncs.com"),
            new TeaPair("me-east-1", "aisc.ap-southeast-1.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "aisc.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "aisc.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-heyuan-acdr-1", "aisc.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "aisc.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "aisc.cn-shanghai.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * <b>description</b> :
     * <p>Creates an attack target (agent or model) and saves its connection configuration for subsequent connectivity tests and scan tasks.
     * This is a synchronous call. Upon success, the system-generated TargetId is returned in Data. You can use this TargetId as a parameter in subsequent calls such as TestConnectivity and scan task creation.
     * Metric description:</p>
     * <ul>
     * <li>When ConnectionMethod is set to enterprise_relay (access through a corporate internal network agent), the values of Endpoint and ModelName are ignored. The platform uses fixed internal network values. The actual target endpoint and credentials are held by the corporate internal network agent.</li>
     * <li>After ApiKey is submitted, it is encrypted and stored. Subsequent queries do not return the plaintext value.</li>
     * <li>ConnectionConfig is a JSON character string in JSON format that specifies advanced connection settings. For common provider templates, refer to the metric description of this parameter.
     * After the target is created, its initial connectivity status is verified. You can call TestConnectivity at any time to re-verify.
     * Internal network access (enterprise_relay) workflow:</li>
     * <li>After the target is created, invoke GenerateRelayPollerScript to obtain an installation script (Linux only) and run it on a machine within the corporate internal network. The actual target endpoint and credentials are entered interactively during installation. The platform does not retain them.</li>
     * <li>After installation, the poller automatically registers and enters a polling loop. No manual registration or polling invocations are required.</li>
     * <li>After invoking TestConnectivity to authenticate end-to-end connectivity, you can use CreateTargetScanTask to initiate a scan.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateAttackTarget  CreateAttackTargetRequest
     * @return CreateAttackTargetResponse
     */
    @Override
    public CompletableFuture<CreateAttackTargetResponse> createAttackTarget(CreateAttackTargetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAttackTarget").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAttackTargetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAttackTargetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateSkillFileCheck  CreateSkillFileCheckRequest
     * @return CreateSkillFileCheckResponse
     */
    @Override
    public CompletableFuture<CreateSkillFileCheckResponse> createSkillFileCheck(CreateSkillFileCheckRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSkillFileCheck").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSkillFileCheckResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSkillFileCheckResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><em>Before you use this operation, make sure that you fully understand the billing method and <a href="https://www.alibabacloud.com/help/en/asc/user-guide/ai-red-teaming#aefbf9b5b4noh">pricing</a> of AI Red Teaming.</em>*
     * Initiates a security scan (AI Red Teaming detection) task against a specified scan target.
     * Before you begin:</p>
     * <ul>
     * <li>The account must have a normal subscription status. Otherwise, a 403 error is returned.</li>
     * <li>The TargetId must exist and belong to the current tenant.</li>
     * <li>The connectivity verification status of the target must be verified. You can call TestConnectivity to verify the target first. Otherwise, a 400 error is returned.</li>
     * <li>Available attack samples must exist within the current scan scope. Otherwise, a 400 error is returned.
     * Execution mode:</li>
     * <li>The call synchronously returns a TaskId. The initial task status is PREPARING. Sample preparation and scan execution are performed asynchronously. You can call ListScanTasksByTarget to query the task status and progress.
     * Sample selection:</li>
     * <li>The sample scope is determined based on the target type (agent/model) plus general-purpose samples. SampleLevel determines the detection intensity and derives the technique level. Lang is used to filter samples by language.</li>
     * <li>If no sample intent is specified, the system automatically derives all available intents based on the scope described above.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateTargetScanTask  CreateTargetScanTaskRequest
     * @return CreateTargetScanTaskResponse
     */
    @Override
    public CompletableFuture<CreateTargetScanTaskResponse> createTargetScanTask(CreateTargetScanTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateTargetScanTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTargetScanTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTargetScanTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Deletes a specified scan target by TargetId. The target is physically deleted.</p>
     * <ul>
     * <li>You can delete only targets that belong to the current tenant. If the target does not exist or belongs to another tenant, a 400 error is returned. This prevents exposing whether the resource exists.</li>
     * <li>Physical deletion: The target cannot be recovered after deletion. Confirm before you proceed.</li>
     * <li>This operation deletes only the target record. It does not stop scan tasks that are in progress for the target or delete historical scan task records. To stop or clean up tasks, call StopScannerTask or DeleteScannerTask first.</li>
     * <li>After deletion, the connection configurations of the target, including encrypted credentials and connectivity verification results, are also removed.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteAttackTarget  DeleteAttackTargetRequest
     * @return DeleteAttackTargetResponse
     */
    @Override
    public CompletableFuture<DeleteAttackTargetResponse> deleteAttackTarget(DeleteAttackTargetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteAttackTarget").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAttackTargetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAttackTargetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Physically deletes a specified scan task by ScannerTaskId.</p>
     * <ul>
     * <li>Only tasks that belong to the current tenant can be deleted. If the task does not exist or belongs to another tenant, a 400 error is returned without exposing whether the resource exists.</li>
     * <li>If the task is in progress (sample preparation, waiting, processing, or report generation), the task is automatically canceled before deletion. A cancellation failure does not block the deletion.</li>
     * <li>Physical deletion: After deletion, the task record and its status and progress information cannot be queried or recovered. Confirm before you delete.</li>
     * <li>Deleting a task record does not affect the scan target itself.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteScannerTask  DeleteScannerTaskRequest
     * @return DeleteScannerTaskResponse
     */
    @Override
    public CompletableFuture<DeleteScannerTaskResponse> deleteScannerTask(DeleteScannerTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteScannerTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteScannerTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteScannerTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Generates an installation script for the internal network agent (relay-poller) for a specified scan target.</p>
     * <ul>
     * <li>The target must use the enterprise_relay connection method (see CreateAttackTarget). Otherwise, HTTP status code 400 is returned. If the target does not exist or belongs to another tenant, HTTP status code 400 is returned without exposing whether the resource exists.</li>
     * <li>Only Linux is supported for the platform. The Platform parameter uses the &quot;operating system-architecture&quot; format and accepts only linux-amd64 and linux-arm64. Compatible architecture values include amd64, x86_64, x86, arm64, and aarch64. If only the architecture is specified, the operating system defaults to linux. Other operating systems such as macOS and Windows return HTTP status code 400. If this parameter is not specified, the default value is linux-amd64.</li>
     * <li>The script contains a one-time access code. Each call issues a new access code, and the previous code automatically expires. Re-downloading the script generates a new access code. Use the latest generated script for installation.</li>
     * <li>The script contains a temporary download link (a signed link valid for 1 hour) and a checksum for the poller binary. The binary is available only for Linux in both architectures.</li>
     * <li>The script does not contain the actual endpoint or credentials of the target. The installer interactively enters these values when running the script. The platform does not store them.</li>
     * <li>After installation, the poller automatically completes registration and enters a polling cycle. The registration and polling operations are automatically called by the script and do not require manual invocation. You can call TestConnectivity to verify end-to-end connectivity.</li>
     * </ul>
     * 
     * @param request the request parameters of GenerateRelayPollerScript  GenerateRelayPollerScriptRequest
     * @return GenerateRelayPollerScriptResponse
     */
    @Override
    public CompletableFuture<GenerateRelayPollerScriptResponse> generateRelayPollerScript(GenerateRelayPollerScriptRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GenerateRelayPollerScript").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GenerateRelayPollerScriptResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GenerateRelayPollerScriptResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the details of a scan target by TargetId.</p>
     * <ul>
     * <li>Only targets that belong to the current tenant can be queried. If the target does not exist or belongs to another tenant, a 400 error is returned to avoid exposing whether the resource exists.</li>
     * <li>The response includes basic target information, advanced connection configuration (ConnectionConfig), and scan task configuration (ScanTaskConfig).</li>
     * <li>The following six aggregate fields are not populated by this operation and return empty values: cumulative scan count (ScanCount), last scan status (LastScanStatus), risk level (RiskLevel), first scan time (FirstScanTime), last scan time (LastScanTime), and last scan failure reason (LastScanFailMessage). Query these fields by calling ListAttackTargets or ListScanTasksByTarget.</li>
     * <li>The response does not include sensitive credentials such as ApiKey in plaintext.</li>
     * </ul>
     * 
     * @param request the request parameters of GetAttackTarget  GetAttackTargetRequest
     * @return GetAttackTargetResponse
     */
    @Override
    public CompletableFuture<GetAttackTargetResponse> getAttackTarget(GetAttackTargetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAttackTarget").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAttackTargetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAttackTargetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Retrieves a temporary download URL for the attack hit data (hits.csv) of a specified scan task.</p>
     * <ul>
     * <li>ScannerTaskId is required in practice. An empty value returns HTTP status code 400.</li>
     * <li>You can query only tasks that belong to the current tenant. If the task does not exist or belongs to another tenant, HTTP status code 400 is returned uniformly to avoid exposing whether the resource exists.</li>
     * <li>The download URL is a signed temporary URL of Object Storage Service (OSS) that is valid for 2 hours (7,200 seconds). After the URL expires, call this operation again to obtain a new URL.</li>
     * <li>If the attack hit data has not been generated (for existing tasks or when the agent execution mode does not produce hit data), the download URL in the response is an empty string. No error is returned.</li>
     * <li>This operation is a read-only action (with the Get prefix). A RAM user with read-only permissions can call this operation. The behavior is consistent with the deprecated GenerateScannerTaskHitDataUrl operation.</li>
     * </ul>
     * 
     * @param request the request parameters of GetScannerTaskHitDataUrl  GetScannerTaskHitDataUrlRequest
     * @return GetScannerTaskHitDataUrlResponse
     */
    @Override
    public CompletableFuture<GetScannerTaskHitDataUrlResponse> getScannerTaskHitDataUrl(GetScannerTaskHitDataUrlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetScannerTaskHitDataUrl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetScannerTaskHitDataUrlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetScannerTaskHitDataUrlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Retrieves a temporary download URL for the HTML result report of a specified scan task.</p>
     * <ul>
     * <li>You can only query tasks that belong to the current tenant. If the task does not exist or belongs to another tenant, a 400 error is returned to avoid exposing whether the resource exists.</li>
     * <li>The download URL is a signed temporary URL from object storage, valid for 2 hours (7,200 seconds). After the URL expires, call this operation again to obtain a new URL.</li>
     * <li>If the task result report has not been generated (the task is not complete or the report has not been produced), the download URL in the response is an empty string and no error is returned. Call this operation after the task status changes to completed.</li>
     * </ul>
     * 
     * @param request the request parameters of GetScannerTaskResultHtmlUrl  GetScannerTaskResultHtmlUrlRequest
     * @return GetScannerTaskResultHtmlUrlResponse
     */
    @Override
    public CompletableFuture<GetScannerTaskResultHtmlUrlResponse> getScannerTaskResultHtmlUrl(GetScannerTaskResultHtmlUrlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetScannerTaskResultHtmlUrl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetScannerTaskResultHtmlUrlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetScannerTaskResultHtmlUrlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAIAgentEvent  ListAIAgentEventRequest
     * @return ListAIAgentEventResponse
     */
    @Override
    public CompletableFuture<ListAIAgentEventResponse> listAIAgentEvent(ListAIAgentEventRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAIAgentEvent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAIAgentEventResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAIAgentEventResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAttackTargets  ListAttackTargetsRequest
     * @return ListAttackTargetsResponse
     */
    @Override
    public CompletableFuture<ListAttackTargetsResponse> listAttackTargets(ListAttackTargetsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAttackTargets").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAttackTargetsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAttackTargetsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Performs a paged query of the scan task list under a specified scan target. Only tasks belonging to targets owned by the current tenant are returned.
     * Query scope and sorting:</p>
     * <ul>
     * <li>Only tasks created within the last 366 days are returned.</li>
     * <li>Results are sorted by creation time in descending order.</li>
     * <li>TaskStatus filters by task status. ScanType filters by scan mode. The scan mode is stored in the task execute parameters. Historical tasks without a recorded scan mode are treated as attack.
     * Paged query rules:</li>
     * <li>PageNumber starts from 1. Values less than 1 are normalized to 1.</li>
     * <li>PageSize defaults to 10, with a maximum of 100 per page. Values greater than 100 are clamped to 100. Values less than 1 return HTTP status code 400.</li>
     * <li>The PageNumber and PageSize values in the response are the normalization values that actually take effect.</li>
     * </ul>
     * 
     * @param request the request parameters of ListScanTasksByTarget  ListScanTasksByTargetRequest
     * @return ListScanTasksByTargetResponse
     */
    @Override
    public CompletableFuture<ListScanTasksByTargetResponse> listScanTasksByTarget(ListScanTasksByTargetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListScanTasksByTarget").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListScanTasksByTargetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListScanTasksByTargetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSubTasks  ListSubTasksRequest
     * @return ListSubTasksResponse
     */
    @Override
    public CompletableFuture<ListSubTasksResponse> listSubTasks(ListSubTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListSubTasks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSubTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSubTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Stops (cancels) the scan task specified by ScannerTaskId.</p>
     * <ul>
     * <li>You can only operate on tasks that belong to the current tenant. If the task does not exist or belongs to another tenant, a 400 error is returned without exposing whether the resource exists.</li>
     * <li>Only tasks in an in-progress state (sample preparation, waiting, processing, or report generation) are actually canceled. The task status is set to canceled, the end time is recorded, and the underlying execution job is stopped asynchronously.</li>
     * <li>Idempotent: If the task is already in a desired state (completed, failed, timed out, or canceled), the call returns success without modifying the task.</li>
     * <li>The underlying execution job is stopped asynchronously. A failure to stop the job does not affect the cancellation result of the task itself.</li>
     * </ul>
     * 
     * @param request the request parameters of StopScannerTask  StopScannerTaskRequest
     * @return StopScannerTaskResponse
     */
    @Override
    public CompletableFuture<StopScannerTaskResponse> stopScannerTask(StopScannerTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopScannerTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopScannerTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopScannerTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Tests the network connectivity and authentication validity of a specified attack target.
     * This operation uses an asynchronous polling model:</p>
     * <ul>
     * <li>First call (without CheckId): Immediately returns a CheckId with VerifyStatus=checking. The actual test runs asynchronously in the background for up to 60 seconds.</li>
     * <li>Subsequent calls (with the CheckId returned from the first call): Queries the latest status of the corresponding CheckId, which may be checking, verified, or failed.</li>
     * <li>Poll at 2-second intervals for up to 60 seconds. After the CheckId expires, the operation returns failed with VerifyMessage set to &quot;check expired, please retry&quot;.
     * Use one of the following two approaches for parameters:</li>
     * <li>Approach A: Specify only TargetId. The system reads Endpoint, ApiKey, ModelName, ConnectionMethod, and ConnectionConfig from the saved target configuration and ignores any parameters with the same names in the request.</li>
     * <li>Approach B: Do not specify TargetId. Instead, provide the five connection parameters directly in the request.</li>
     * </ul>
     * 
     * @param request the request parameters of TestConnectivity  TestConnectivityRequest
     * @return TestConnectivityResponse
     */
    @Override
    public CompletableFuture<TestConnectivityResponse> testConnectivity(TestConnectivityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TestConnectivity").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TestConnectivityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TestConnectivityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
