// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210903;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.appstream_center20210903.models.*;
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
        this.product = "appstream-center";
        this.version = "2021-09-03";
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
     * <p>It is a time-consuming operation to issue connection credentials. Therefore, you may need to invoke this API operation multiple times to obtain the connection credentials.</p>
     * <ol>
     * <li>When you invoke the API for the first time, an application instance is allocated to the specified convenience account, and the application is started. The start node ID (<code>TaskId</code>) is returned.</li>
     * <li>When you invoke the API subsequently, you must pass the <code>TaskId</code> parameter as a request parameter to check whether the node is completed. When the returned node status (<code>TaskStatus</code>) is <code>Finished</code>, the connection ticket (<code>Ticket</code>) is also returned.<blockquote>
     * <ul>
     * <li>If the startup process is fast enough, the connection ticket (<code>Ticket</code>) may also be returned when you invoke the API for the first time.</li>
     * </ul>
     * </blockquote>
     * </li>
     * </ol>
     * 
     * @param request the request parameters of GetConnectionTicket  GetConnectionTicketRequest
     * @return GetConnectionTicketResponse
     */
    @Override
    public CompletableFuture<GetConnectionTicketResponse> getConnectionTicket(GetConnectionTicketRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetConnectionTicket").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetConnectionTicketResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetConnectionTicketResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPublishedAppInfo  ListPublishedAppInfoRequest
     * @return ListPublishedAppInfoResponse
     */
    @Override
    public CompletableFuture<ListPublishedAppInfoResponse> listPublishedAppInfo(ListPublishedAppInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListPublishedAppInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPublishedAppInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPublishedAppInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Prerequisites</h2>
     * <p>This operation is an anonymous API operation, but the server still verifies the logon status. The <code>LoginToken</code> and <code>SessionId</code> request parameters are actually required. If either parameter is missing, an HTTP 400 error is returned with the error code <code>InvalidParameter.loginToken</code> or <code>InvalidParameter.sessionId</code>.</p>
     * <h2>Obtain credentials</h2>
     * <p>To obtain the <code>LoginToken</code> and <code>SessionId</code> by using <code>GetLoginToken</code>, call the <code>GetLoginToken</code> operation of the <code>appstream-center</code> 2021-02-20 version. The 2021-09-03 version does not provide this operation. You can also call <code>RefreshLoginToken</code> to update and obtain the <code>LoginToken</code>.</p>
     * 
     * @param request the request parameters of ListRunningApps  ListRunningAppsRequest
     * @return ListRunningAppsResponse
     */
    @Override
    public CompletableFuture<ListRunningAppsResponse> listRunningApps(ListRunningAppsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListRunningApps").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRunningAppsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRunningAppsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ResetAppResources  ResetAppResourcesRequest
     * @return ResetAppResourcesResponse
     */
    @Override
    public CompletableFuture<ResetAppResourcesResponse> resetAppResources(ResetAppResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ResetAppResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResetAppResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResetAppResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RestartAppResources  RestartAppResourcesRequest
     * @return RestartAppResourcesResponse
     */
    @Override
    public CompletableFuture<RestartAppResourcesResponse> restartAppResources(RestartAppResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RestartAppResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RestartAppResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RestartAppResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StartAppResources  StartAppResourcesRequest
     * @return StartAppResourcesResponse
     */
    @Override
    public CompletableFuture<StartAppResourcesResponse> startAppResources(StartAppResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartAppResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartAppResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartAppResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Credential acquisition</h2>
     * <p>To obtain the <code>LoginToken</code> and <code>SessionId</code> by using <code>GetLoginToken</code>, call the <code>GetLoginToken</code> operation of the <code>appstream-center</code> 2021-02-20 version. The 2021-09-03 version does not provide this operation. You can also update and obtain the <code>LoginToken</code> by using <code>RefreshLoginToken</code>.</p>
     * <h3>Required parameters and authentication invocation flow for GetLoginToken (2021-02-20 version)</h3>
     * <p>API documentation: <a href="https://www.alibabacloud.com/help/en/wuying-appstreaming/developer-reference/api-appstream-center-2021-02-20-getlogintoken">GetLoginToken (2021-02-20)</a>
     * Required metric descriptions:</p>
     * <ul>
     * <li><code>ClientId</code>: Required. The unique ID generated by the client, serving as the identity for the client that initiates the logon. Reuse the same value within the same session.</li>
     * <li><code>LoginIdentifier</code>: The enterprise identity (i.e., enterprise alias). This parameter is required when you use the enterprise identity logon method. Note that the parameter name is <code>LoginIdentifier</code>, not <code>TenantAlias</code>.</li>
     * <li>When you use a convenience account or an AD domain account for authentication, the Settings for <code>CurrentStage</code> must be <code>ADPassword</code>, and you must provide both <code>EndUserId</code> (username) and <code>Password</code> (password).
     * Complete authentication invocation flow:</li>
     * </ul>
     * <ol>
     * <li>Invoke <code>GetLoginToken</code> for the first time with <code>ClientId</code>, <code>LoginIdentifier</code>, <code>CurrentStage</code> based on the logon method, and the corresponding credentials. Save the returned <code>LoginToken</code> and <code>SessionId</code>. <code>SessionId</code> is returned only during the first invocation in the same session and must be reused in subsequent stage invocations.</li>
     * <li>If <code>NextStage</code> (such as <code>MFAVerify</code>, <code>TokenVerify</code>, or <code>ChangePassword</code>) is returned, carry the same <code>SessionId</code> and <code>ClientId</code>, update the Settings of <code>CurrentStage</code> to the value of <code>NextStage</code>, and provide the parameters required for this stage (such as <code>AuthenticationCode</code> for the <code>MFAVerify</code> stage and <code>TokenCode</code> for the <code>TokenVerify</code> stage). Repeat the invocation until the final <code>LoginToken</code> is obtained.</li>
     * <li>Use the final <code>LoginToken</code> and <code>SessionId</code> to invoke this operation (<code>StopApp</code>).</li>
     * </ol>
     * 
     * @param request the request parameters of StopApp  StopAppRequest
     * @return StopAppResponse
     */
    @Override
    public CompletableFuture<StopAppResponse> stopApp(StopAppRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopApp").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopAppResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopAppResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Before you begin</h2>
     * <p>Before you call this operation, you must complete user logon authentication to obtain the <code>LoginToken</code> and <code>SessionId</code>. This <code>StopAppResources</code> operation uses the <strong>2021-09-03</strong> version of <code>appstream-center</code>. The prerequisite logon operation uses the <strong>2021-02-20</strong> version of <a href="https://www.alibabacloud.com/help/en/wuying-appstreaming/developer-reference/api-appstream-center-2021-02-20-getlogintoken">GetLoginToken</a>. Use the respective API versions for each operation.</p>
     * <h3>1. Prepare the enterprise identifier and account information</h3>
     * <p>The following procedure applies to password authentication for convenience accounts or AD domain accounts that log on by using an enterprise identifier.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Parameter</th>
     * <th>Description</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>ClientId</code></td>
     * <td>The unique ID generated by the client. This parameter is required when you call <code>GetLoginToken</code>. The same client ID is reused in the following call sequence.</td>
     * </tr>
     * <tr>
     * <td><code>LoginIdentifier</code></td>
     * <td>The enterprise identifier for logon, which is the <code>TenantAlias</code>. The parameter name in the logon request is <code>LoginIdentifier</code>, not <code>TenantAlias</code>. To query the logon configuration of this identifier, you can call <a href="https://www.alibabacloud.com/help/en/wuying-appstreaming/developer-reference/api-appstream-center-2021-02-20-findidplistbyloginidentifier">FindIdpListByLoginIdentifier (2021-02-20)</a>. The <code>TenantAliasInfo.TenantAlias</code> field in the response indicates the enterprise identifier.</td>
     * </tr>
     * <tr>
     * <td><code>CurrentStage</code></td>
     * <td>Set this parameter to <code>ADPassword</code> for password authentication. This value applies to both convenience accounts and AD domain accounts, not only AD domain accounts.</td>
     * </tr>
     * <tr>
     * <td><code>EndUserId</code></td>
     * <td>The username of the convenience account or AD domain account. This parameter is required when <code>CurrentStage</code> is set to <code>ADPassword</code>.</td>
     * </tr>
     * <tr>
     * <td><code>Password</code></td>
     * <td>The password of the corresponding account. This parameter is required when <code>CurrentStage</code> is set to <code>ADPassword</code>.</td>
     * </tr>
     * </tbody></table>
     * <h3>2. Continue logon based on the returned authentication stage</h3>
     * <p>After you invoke <code>GetLoginToken</code> for the first time, save the returned <code>SessionId</code>. This value is returned only during the first invocation in the same logon session. If you need to authenticate further, include the saved <code>SessionId</code> in subsequent requests. Do not clear this value even if it is not returned in subsequent responses.
     * Determine whether you still need to authenticate based on the <code>NextStage</code> field in the response, and set the required next authentication stage as the <code>CurrentStage</code> for subsequent requests. Examples:</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Next authentication stage</th>
     * <th>What to do next</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>MFAVerify</code></td>
     * <td>Include the <code>SessionId</code> and the <code>AuthenticationCode</code> generated by the virtual MFA device to continue to invoke <code>GetLoginToken</code>.</td>
     * </tr>
     * <tr>
     * <td><code>TokenVerify</code></td>
     * <td>Include the <code>SessionId</code> and the client secondary authentication verification code <code>TokenCode</code> to continue to authenticate.</td>
     * </tr>
     * <tr>
     * <td><code>ChangePassword</code></td>
     * <td>Specify <code>OldPassword</code> and <code>NewPassword</code> as required to complete the password change stage.</td>
     * </tr>
     * <tr>
     * <td><code>MFABind</code> or other authentication stages</td>
     * <td>Complete the corresponding operations based on the actual returned stage and the <code>GetLoginToken</code> documentation. Do not directly apply the request parameters of <code>MFAVerify</code>.</td>
     * </tr>
     * <tr>
     * <td>The authentication stages are determined by the account configuration and the result of the current logon. Not every logon must go through all the preceding stages in sequence. Invoke <code>StopAppResources</code> only after logon authentication is complete and the <code>LoginToken</code> is obtained. Do not proceed with the shutdown of resources if authentication failed or if there are pending authentication stages.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h3>3. Call sequence example</h3>
     * <p>The following is pseudocode for parameter passing and is not an executable SDK example. <code>clientId</code>, <code>tenantAlias</code>, <code>endUserId</code>, <code>password</code>, and <code>authenticationCode</code> are runtime variables of the caller. <code>resourceIds</code>, <code>productType</code>, and <code>appInstanceGroupId</code> are business parameters for this operation. Do not write real passwords, verification codes, or logon credentials in examples or logs.</p>
     * <pre><code class="language-text">login1 = GetLoginToken(version=&quot;2021-02-20&quot;,
     *     ClientId=clientId, LoginIdentifier=tenantAlias,
     *     CurrentStage=&quot;ADPassword&quot;, EndUserId=endUserId, Password=password)
     * sessionId = login1.SessionId
     * loginResult = login1
     * if loginResult.NextStage == &quot;MFAVerify&quot;:
     *     loginResult = GetLoginToken(version=&quot;2021-02-20&quot;,
     *         ClientId=clientId, LoginIdentifier=tenantAlias,
     *         SessionId=sessionId, CurrentStage=&quot;MFAVerify&quot;,
     *         AuthenticationCode=authenticationCode)
     * </code></pre>
     * <p>If other authentication stages are still required, continue processing based on <code>NextStage</code>. Do not treat the preceding single MFA call as a fixed endpoint. After logon is complete, call this operation by using the <code>LoginToken</code> obtained during this logon and the saved <code>SessionId</code>:</p>
     * <pre><code class="language-text">StopAppResources(version=&quot;2021-09-03&quot;,
     *     ClientId=clientId, LoginToken=loginResult.LoginToken, SessionId=sessionId,
     *     ProductType=productType, AppInstanceGroupId=appInstanceGroupId,
     *     ResourceIds=resourceIds)
     * </code></pre>
     * <p><code>Password</code>, <code>LoginIdentifier</code>, and <code>CurrentStage</code> belong to the prerequisite logon request and are not request parameters of <code>StopAppResources</code>. For the rules on how to specify other parameters and resource IDs for this operation, see the request parameter table below.</p>
     * 
     * @param request the request parameters of StopAppResources  StopAppResourcesRequest
     * @return StopAppResourcesResponse
     */
    @Override
    public CompletableFuture<StopAppResourcesResponse> stopAppResources(StopAppResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopAppResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopAppResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopAppResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of Unbind  UnbindRequest
     * @return UnbindResponse
     */
    @Override
    public CompletableFuture<UnbindResponse> unbind(UnbindRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("Unbind").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnbindResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnbindResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
