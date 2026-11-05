// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agenticbas20260630;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.agenticbas20260630.models.*;
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
        this.product = "AgenticBAS";
        this.version = "2026-06-30";
        this.endpointRule = "regional";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * <b>description</b> :
     * <p>Creates penetration testing tasks for authorized assets of the current account and returns the task IDs. You can specify up to five targets at a time, and one task is created for each target.
     * Before you call this operation, you must activate the AgenticBAS service or meet the validity period and quota conditions of the trial service. The target assets must meet the ownership verification requirements of the selected asset source. Business parameters are passed in OperationInput. VulnCheckItems and PentestRequirement cannot be empty at the same time. Currently, only IMMEDIATE execution is supported, and scheduled execution is not supported.
     * A successful creation response only indicates that the tasks are created and does not wait for the scan to complete. Save the TaskId in TaskList, query the status and usage by calling DescribePentestTaskList, and then use the same TaskId to query vulnerabilities or reports. Tasks may enter a queue. If a report is not generated, the query response may not contain a download link.
     * Credentials use an object structure of &quot;identity name -&gt; credential configuration&quot;. The following are synthetic examples. Replace them with authorized test identities in actual calls.</p>
     * <pre><code class="language-json">{
     *   &quot;Credentials&quot;: {
     *     &quot;accountUser&quot;: {
     *       &quot;account&quot;: {
     *         &quot;username&quot;: &quot;example-user&quot;,
     *         &quot;password&quot;: &quot;example-password&quot;
     *       }
     *     },
     *     &quot;cookieUser&quot;: {
     *       &quot;cookies&quot;: [
     *         {
     *           &quot;name&quot;: &quot;session&quot;,
     *           &quot;value&quot;: &quot;example-session&quot;,
     *           &quot;domain&quot;: &quot;example.com&quot;,
     *           &quot;path&quot;: &quot;/&quot;,
     *           &quot;secure&quot;: true,
     *           &quot;httpOnly&quot;: true,
     *           &quot;sameSite&quot;: &quot;Lax&quot;
     *         }
     *       ]
     *     },
     *     &quot;localUser&quot;: {
     *       &quot;localStorage&quot;: {
     *         &quot;access_token&quot;: &quot;example-local-token&quot;
     *       }
     *     },
     *     &quot;sessionUser&quot;: {
     *       &quot;sessionStorage&quot;: {
     *         &quot;session_token&quot;: &quot;example-session-token&quot;
     *       }
     *     },
     *     &quot;headerUser&quot;: {
     *       &quot;extraHeaders&quot;: {
     *         &quot;Authorization&quot;: &quot;Bearer example-token&quot;
     *       }
     *     }
     *   }
     * }
     * </code></pre>
     * 
     * @param request the request parameters of CreatePentestTask  CreatePentestTaskRequest
     * @return CreatePentestTaskResponse
     */
    @Override
    public CompletableFuture<CreatePentestTaskResponse> createPentestTask(CreatePentestTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreatePentestTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePentestTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePentestTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribePentestReportContent  DescribePentestReportContentRequest
     * @return DescribePentestReportContentResponse
     */
    @Override
    public CompletableFuture<DescribePentestReportContentResponse> describePentestReportContent(DescribePentestReportContentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePentestReportContent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePentestReportContentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePentestReportContentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the penetration testing tasks of the current account by using paging and returns the task status, execution duration, Credits usage, time, and vulnerability statistics.
     * Use OperationInput to specify query conditions. Paging is implemented by using CurrentPage and PageSize. By default, the first page is queried and each page contains 10 entries. You can filter tasks by task name keyword and task status.
     * The response includes TaskList and PageInfo. Duration indicates the execution duration in seconds. CreditsUsed indicates the used Credits. Tasks that have not started may not have a start time or execution duration, and unfinished tasks may not have a completion time. UNIX timestamps uniformly use UNIX seconds. When displaying, you can convert them to the time zone of the caller.</p>
     * 
     * @param request the request parameters of DescribePentestTaskList  DescribePentestTaskListRequest
     * @return DescribePentestTaskListResponse
     */
    @Override
    public CompletableFuture<DescribePentestTaskListResponse> describePentestTaskList(DescribePentestTaskListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePentestTaskList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePentestTaskListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePentestTaskListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribePentestVulnList  DescribePentestVulnListRequest
     * @return DescribePentestVulnListResponse
     */
    @Override
    public CompletableFuture<DescribePentestVulnListResponse> describePentestVulnList(DescribePentestVulnListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePentestVulnList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePentestVulnListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePentestVulnListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
