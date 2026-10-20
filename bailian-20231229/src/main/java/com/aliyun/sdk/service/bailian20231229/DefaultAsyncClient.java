// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20231229;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.bailian20231229.models.*;
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
        this.product = "bailian";
        this.version = "2023-12-29";
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
     * <ul>
     * <li>Creating data tables through the API is not supported. Use the &lt;props=&quot;china&quot;&gt;<a href="https://bailian.console.aliyun.com/?tab=app#/data-center">Application Data</a>&lt;props=&quot;intl&quot;&gt;<a href="https://modelstudio.console.alibabacloud.com/?tab=app#/data-center">Application Data</a> page in the console.</li>
     * <li>A Resource Access Management (RAM) user must first obtain <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Alibaba Cloud Model Studio (requires <code>AliyunBailianDataFullAccess</code>, which includes the sfm:AddCategory permission) and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a> before invoking this operation. An Alibaba Cloud account can invoke this operation directly without authorization. Use the latest &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a> to invoke this operation.</li>
     * <li>This operation does not support idempotence.
     * <strong>Throttling:</strong>
     * This operation is throttled if called too frequently. Do not exceed 5 calls per second. If you are throttled, retry later.</li>
     * </ul>
     * 
     * @param request the request parameters of AddCategory  AddCategoryRequest
     * @return AddCategoryResponse
     */
    @Override
    public CompletableFuture<AddCategoryResponse> addCategory(AddCategoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AddCategory").setMethod(HttpMethod.POST).setPathRegex("/{WorkspaceId}/datacenter/category/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddCategoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddCategoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation adds chunk content to a specified knowledge base of the document search (document), data query (table), or image Q&amp;A (image) type. Related operations on multimedia search (multimedia) knowledge bases are not supported. For data query and image Q&amp;A knowledge bases, this operation takes effect only when the data source is a spreadsheet connector (excel).</li>
     * <li>Resource Access Management (RAM) users must first obtain <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Model Studio (requiring <code>AliyunBailianDataFullAccess</code>, which includes the sfm:ChunkList permission) and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a> before invoking this operation. Alibaba Cloud accounts can invoke this operation directly without authorization. Use the latest <a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Model Studio SDK</a><a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Model Studio SDK</a> to invoke this operation.</li>
     * <li>Before invoking this operation, make sure that your knowledge base has been created and has not been deleted (that is, the knowledge base ID <code>IndexId</code> is valid).</li>
     * <li>This operation has idempotence.
     * <strong>Throttling:</strong>
     * This operation is throttled if called too frequently. Do not exceed 10 calls per second. If throttled, retry later.</li>
     * </ul>
     * 
     * @param request the request parameters of AddChunk  AddChunkRequest
     * @return AddChunkResponse
     */
    @Override
    public CompletableFuture<AddChunkResponse> addChunk(AddChunkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AddChunk").setMethod(HttpMethod.POST).setPathRegex("/{WorkspaceId}/chunk/create").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddChunkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddChunkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Resource Access Management (RAM) users must first obtain <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Alibaba Cloud Model Studio (requires <code>AliyunBailianDataFullAccess</code>, which includes the sfm:AddCategory permission), and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a> before calling this operation. Alibaba Cloud accounts can call this operation directly without authorization. Use the latest &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a> to call this operation.</li>
     * <li>This operation is not idempotent.
     * <strong>Rate limit:</strong>
     * This operation is throttled if called too frequently. Do not exceed 5 calls per second. If you are throttled, retry later.</li>
     * </ul>
     * 
     * @param request the request parameters of AddConnector  AddConnectorRequest
     * @return AddConnectorResponse
     */
    @Override
    public CompletableFuture<AddConnectorResponse> addConnector(AddConnectorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AddConnector").setMethod(HttpMethod.POST).setPathRegex("/{WorkspaceId}/datacenter/connector").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddConnectorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddConnectorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before invoking this operation, a Resource Access Management (RAM) user must obtain <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Alibaba Cloud Model Studio (requires <code>AliyunBailianDataFullAccess</code>, which includes the sfm:AddFile permission) and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a>. An Alibaba Cloud account can invoke this operation directly without authorization. Use the latest &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a> to invoke this operation.</li>
     * <li>This operation is not idempotent.
     * <strong>Throttling:</strong>
     * This operation is throttled if called too frequently. Do not exceed 10 calls per second. If you are throttled, retry later.</li>
     * </ul>
     * 
     * @param request the request parameters of AddFile  AddFileRequest
     * @return AddFileResponse
     */
    @Override
    public CompletableFuture<AddFileResponse> addFile(AddFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AddFile").setMethod(HttpMethod.PUT).setPathRegex("/{WorkspaceId}/datacenter/file").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li><p>Ensure that the OSS bucket and Alibaba Cloud Model Studio belong to the same Alibaba Cloud account. Before you call this operation, you must authorize the OSS service-linked role as prompted in the Model Studio console (service name: datahub.sfm.aliyuncs.com) and add a tag with the key bailian-datahub-access and the value read to the destination bucket. This tag is used to authorize OSS data import for this operation and is different from the bailian-connector-access tag used in the console data connection process.</p>
     * <ul>
     * <li>Supported bucket storage classes do not include Archive, Cold Archive, or Deep Cold Archive. Buckets with content encryption are supported. Buckets with public read/write, public read, or private ACLs are supported.</li>
     * <li>To use a bucket with <a href="https://help.aliyun.com/document_detail/2636937.html">Referer-based hotlink protection</a> enabled, you must add the domain name *.console.aliyun.com to the Referer whitelist by referring to <a href="https://help.aliyun.com/document_detail/2636937.html">Allow access only from trusted websites</a>.</li>
     * </ul>
     * </li>
     * <li><p>Resource Access Management (RAM) users must first obtain the <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Alibaba Cloud Model Studio (the AliyunBailianDataFullAccess policy is required, which includes the sfm:AddFilesFromAuthorizedOss permission) and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a> before they can call this operation. Alibaba Cloud accounts can call this operation directly without authorization. We recommend that you use the latest version of the &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a> to call this operation.</p>
     * </li>
     * <li><p>This operation is not idempotent.
     * <strong>Throttling:</strong>
     * Frequent calls to this operation are throttled. Do not exceed 5 calls per second. If throttling occurs, retry later.</p>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of AddFilesFromAuthorizedOss  AddFilesFromAuthorizedOssRequest
     * @return AddFilesFromAuthorizedOssResponse
     */
    @Override
    public CompletableFuture<AddFilesFromAuthorizedOssResponse> addFilesFromAuthorizedOss(AddFilesFromAuthorizedOssRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AddFilesFromAuthorizedOss").setMethod(HttpMethod.POST).setPathRegex("/{WorkspaceId}/datacenter/file/fromoss").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddFilesFromAuthorizedOssResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddFilesFromAuthorizedOssResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Resource Access Management (RAM) users must first obtain <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Alibaba Cloud Model Studio (requires <code>AliyunBailianDataFullAccess</code>, which includes the sfm:AddTable permission) and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a> before calling this operation. Alibaba Cloud accounts can call this operation directly without authorization. Use the latest &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a> to call this operation.</li>
     * <li>This operation is not idempotent.
     * <strong>Rate limit:</strong>
     * This operation is throttled if called too frequently. Do not exceed 10 calls per second. If throttled, retry later.</li>
     * </ul>
     * 
     * @param request the request parameters of AddTable  AddTableRequest
     * @return AddTableResponse
     */
    @Override
    public CompletableFuture<AddTableResponse> addTable(AddTableRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AddTable").setMethod(HttpMethod.POST).setPathRegex("/{WorkspaceId}/datacenter/table").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddTableResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddTableResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Resource Access Management (RAM) users must first obtain <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Alibaba Cloud Model Studio (requires <code>AliyunBailianDataFullAccess</code>, which includes the sfm:ApplyFileUploadLease permission), and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a> before invoking this operation. Alibaba Cloud accounts can invoke this operation directly without authorization. Use the latest &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a> to invoke this operation.</li>
     * <li>This operation is not idempotent.
     * <strong>Throttling:</strong>
     * This operation is throttled if called too frequently. Do not exceed 10 calls per second. If you are throttled, retry later.</li>
     * </ul>
     * 
     * @param request the request parameters of ApplyFileUploadLease  ApplyFileUploadLeaseRequest
     * @return ApplyFileUploadLeaseResponse
     */
    @Override
    public CompletableFuture<ApplyFileUploadLeaseResponse> applyFileUploadLease(ApplyFileUploadLeaseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ApplyFileUploadLease").setMethod(HttpMethod.POST).setPathRegex("/{WorkspaceId}/datacenter/category/{CategoryId}").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ApplyFileUploadLeaseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ApplyFileUploadLeaseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>1\. This interface is intended for pro-code deployment only; other scenarios are currently not supported. 2. After obtaining the temporary file upload lease via this interface, upload the file manually.</p>
     * 
     * @param request the request parameters of ApplyTempStorageLease  ApplyTempStorageLeaseRequest
     * @return ApplyTempStorageLeaseResponse
     */
    @Override
    public CompletableFuture<ApplyTempStorageLeaseResponse> applyTempStorageLease(ApplyTempStorageLeaseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ApplyTempStorageLease").setMethod(HttpMethod.POST).setPathRegex("/{WorkspaceId}/datacenter").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ApplyTempStorageLeaseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ApplyTempStorageLeaseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BatchUpdateFileTag  BatchUpdateFileTagRequest
     * @return BatchUpdateFileTagResponse
     */
    @Override
    public CompletableFuture<BatchUpdateFileTagResponse> batchUpdateFileTag(BatchUpdateFileTagRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("BatchUpdateFileTag").setMethod(HttpMethod.PUT).setPathRegex("/{WorkspaceId}/datacenter/batchupdatetag").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchUpdateFileTagResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchUpdateFileTagResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>A Resource Access Management (RAM) user must first obtain <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Alibaba Cloud Model Studio (requires <code>AliyunBailianDataFullAccess</code>, which includes the sfm:ChangeParseSetting permission), and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a> before invoking this operation. An Alibaba Cloud account can invoke this operation directly without authorization. Use the latest &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a> to invoke this operation.</li>
     * <li>This operation is not idempotent.
     * <strong>Rate limit:</strong>
     * This operation is rate-limited. Do not exceed 10 calls per second. If you are throttled, retry later.</li>
     * </ul>
     * 
     * @param request the request parameters of ChangeParseSetting  ChangeParseSettingRequest
     * @return ChangeParseSettingResponse
     */
    @Override
    public CompletableFuture<ChangeParseSettingResponse> changeParseSetting(ChangeParseSettingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ChangeParseSetting").setMethod(HttpMethod.PUT).setPathRegex("/{WorkspaceId}/datacenter/parser/settings").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChangeParseSettingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChangeParseSettingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateAndPulishAgent  CreateAndPulishAgentRequest
     * @return CreateAndPulishAgentResponse
     */
    @Override
    public CompletableFuture<CreateAndPulishAgentResponse> createAndPulishAgent(CreateAndPulishAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateAndPulishAgent").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/application/agents").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAndPulishAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAndPulishAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li><strong>Permission requirements</strong>:<ul>
     * <li><strong>Resource Access Management (RAM) users</strong>: You must first obtain the <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Alibaba Cloud Model Studio (you can use the AliyunBailianDataFullAccess policy, which includes the sfm:CreateIndex permission required by this operation) and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a> before you can invoke this operation.</li>
     * <li><strong>Alibaba Cloud accounts</strong>: By default, Alibaba Cloud accounts have the required permissions and can directly invoke this operation.</li>
     * </ul>
     * </li>
     * <li><strong>Invocation method</strong>: Use the latest version of the &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a> to invoke this operation. The SDK provides encapsulation for the complex signature calculation logic and simplifies the procedure to invoke the operation.</li>
     * <li><strong>What to do next</strong>: This operation only performs the initialization of the knowledge base creation job. After you invoke this operation, you must invoke the <strong>SubmitIndexJob</strong> operation to complete the creation. Otherwise, you will get an empty knowledge base. For corresponding code examples, refer to the <a href="https://help.aliyun.com/document_detail/2852772.html">Knowledge Base API Guide</a>.</li>
     * <li><strong>Idempotence</strong>: This operation is not idempotent. If you invoke this operation repeatedly, multiple knowledge bases with the same name may be created. Implement idempotence by using the &quot;query first, then create&quot; logic when you invoke this operation.
     * <strong>Throttling:</strong>
     * This operation is throttled if called frequently. Do not exceed 10 calls per second. If throttling occurs, retry later.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateIndex  CreateIndexRequest
     * @return CreateIndexResponse
     */
    @Override
    public CompletableFuture<CreateIndexResponse> createIndex(CreateIndexRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateIndex").setMethod(HttpMethod.POST).setPathRegex("/{WorkspaceId}/index/create").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateIndexResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateIndexResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can store specific information from the conversation procedure (memory nodes. For more information, see <a href="https://www.alibabacloud.com/help/en/model-studio/user-guide/long-term-memory">Long-term memory</a>) in a long-term memory. Agent applications can then reference this information in subsequent conversations. This is not automatic. You must first invoke the <a href="https://www.alibabacloud.com/help/en/model-studio/developer-reference/api-bailian-2023-12-29-creatememory">CreateMemory</a> operation to create a long-term memory and obtain the <code>memoryId</code>. Then pass the <code>memoryId</code> when you <a href="https://www.alibabacloud.com/help/en/model-studio/user-guide/application-calling">invoke the agent application through the API</a>.<blockquote>
     * <p>Long-term memory does not support storing and managing user profiles. Perform related operations in the console. For more information, see <a href="https://www.alibabacloud.com/help/en/model-studio/user-guide/long-term-memory#578ebae524m6l">Long-term memory</a>.</p>
     * </blockquote>
     * </li>
     * <li>If you pass a <code>memoryId</code>, the system performs automatic creation of memory nodes (MemoryNode) under the specified long-term memory based on conversation records. You can also invoke the <a href="https://www.alibabacloud.com/help/en/model-studio/developer-reference/api-bailian-2023-12-29-creatememorynode">CreateMemoryNode</a> operation to manually create memory nodes.</li>
     * <li>This operation does not support idempotence.
     * <strong>Throttling:</strong> Ensure that the interval between two consecutive requests is at least 1 second. Otherwise, throttling may be triggered. If throttling occurs, retry later.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateMemory  CreateMemoryRequest
     * @return CreateMemoryResponse
     */
    @Override
    public CompletableFuture<CreateMemoryResponse> createMemory(CreateMemoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateMemory").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/memories").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMemoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMemoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateMemoryNode  CreateMemoryNodeRequest
     * @return CreateMemoryNodeResponse
     */
    @Override
    public CompletableFuture<CreateMemoryNodeResponse> createMemoryNode(CreateMemoryNodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateMemoryNode").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/memories/{memoryId}/memoryNodes").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMemoryNodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMemoryNodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This API does not currently support the creation of text-to-image prompt templates.</p>
     * 
     * @param request the request parameters of CreatePromptTemplate  CreatePromptTemplateRequest
     * @return CreatePromptTemplateResponse
     */
    @Override
    public CompletableFuture<CreatePromptTemplateResponse> createPromptTemplate(CreatePromptTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreatePromptTemplate").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/promptTemplates").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePromptTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePromptTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteAgent  DeleteAgentRequest
     * @return DeleteAgentResponse
     */
    @Override
    public CompletableFuture<DeleteAgentResponse> deleteAgent(DeleteAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteAgent").setMethod(HttpMethod.DELETE).setPathRegex("/{workspaceId}/application/agents/{appCode}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>A Resource Access Management (RAM) user must first obtain <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Alibaba Cloud Model Studio (requires <code>AliyunBailianDataFullAccess</code>, which includes the sfm:DeleteCategory permission), and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a> before invoking this operation. An Alibaba Cloud account can invoke this operation directly without authorization. Use the latest &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a> to invoke this operation.</li>
     * <li>This operation has idempotence.
     * <strong>Throttling:</strong>
     * This operation is subject to throttling. Do not exceed 5 calls per second. If you are throttled, retry later.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteCategory  DeleteCategoryRequest
     * @return DeleteCategoryResponse
     */
    @Override
    public CompletableFuture<DeleteCategoryResponse> deleteCategory(DeleteCategoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteCategory").setMethod(HttpMethod.DELETE).setPathRegex("/{WorkspaceId}/datacenter/category/{CategoryId}/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCategoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCategoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><warning>  Deleted text chunks cannot be recovered (hard delete). Proceed with caution.</p>
     * <ul>
     * <li><strong>Permission requirements</strong>:<ul>
     * <li><strong>Resource Access Management (RAM) user (sub-account)</strong>: You must first obtain <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Alibaba Cloud Model Studio (you can use the <code>AliyunBailianDataFullAccess</code> policy, which includes the sfm:DeleteChunk permission required by this operation), and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a> before invoking this operation.</li>
     * <li><strong>Alibaba Cloud account (main account)</strong>: Has permissions by default and can invoke this operation directly.</li>
     * </ul>
     * </li>
     * <li><strong>Calling method</strong>: Use the latest version of the &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>. The SDK encapsulates the complex signature calculation logic as an encapsulation of the signing procedure, simplifying your invocation process.</li>
     * <li><strong>Effective delay</strong>: Updates typically take effect immediately. During peak periods, a slight delay (in seconds) may occur.</li>
     * <li><strong>Idempotence</strong>: This operation is idempotent. If you repeat the operation on a text chunk that has already been successfully deleted, the operation returns a success response.
     * <strong>Rate limiting:</strong>
     * Frequent calls to this operation may be throttled. Do not exceed 10 calls per second. If throttled, retry after a short wait.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteChunk  DeleteChunkRequest
     * @return DeleteChunkResponse
     */
    @Override
    public CompletableFuture<DeleteChunkResponse> deleteChunk(DeleteChunkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteChunk").setMethod(HttpMethod.POST).setPathRegex("/{WorkspaceId}/chunk/delete").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteChunkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteChunkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Resource Access Management (RAM) users must first obtain <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Alibaba Cloud Model Studio (requires <code>AliyunBailianDataFullAccess</code>, which includes the sfm:DeleteConnector permission), and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a> before calling this operation. Alibaba Cloud accounts can call this operation directly without authorization. Use the latest <a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a><a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a> to call this operation.</li>
     * <li>This operation is not idempotent.
     * <strong>Throttling:</strong>
     * This operation is throttled if called too frequently. Do not exceed 5 calls per second. If throttled, retry later.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteConnector  DeleteConnectorRequest
     * @return DeleteConnectorResponse
     */
    @Override
    public CompletableFuture<DeleteConnectorResponse> deleteConnector(DeleteConnectorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteConnector").setMethod(HttpMethod.DELETE).setPathRegex("/{WorkspaceId}/datacenter/connector/{ConnectorId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteConnectorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteConnectorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Deleting data tables through the API is not supported. To delete a data table or specific data in a table, go to &lt;props=&quot;china&quot;&gt;<a href="https://bailian.console.aliyun.com/?tab=app#/data-center">Application Data</a>&lt;props=&quot;intl&quot;&gt;<a href="https://modelstudio.console.alibabacloud.com/?tab=app#/data-center">Application Data</a>.</li>
     * <li>This operation deletes files from &lt;props=&quot;china&quot;&gt;<a href="https://bailian.console.aliyun.com/?tab=app#/data-center">Application Data</a>&lt;props=&quot;intl&quot;&gt;<a href="https://modelstudio.console.alibabacloud.com/?tab=app#/data-center">Application Data</a> and does not affect knowledge bases that have already been built. To delete files from a knowledge base, invoke the <strong>DeleteIndexDocument</strong> operation.</li>
     * <li>A Resource Access Management (RAM) user must first obtain <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Alibaba Cloud Model Studio (requires <code>AliyunBailianDataFullAccess</code>, which includes the sfm:DeleteFile permission) and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a> before invoking this operation. An Alibaba Cloud account can invoke this operation directly without authorization. Use the latest &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a> to invoke this operation.</li>
     * <li>This operation can only delete files in the parsing failed (PARSE_FAILED) or parsing completed (PARSE_SUCCESS) state.</li>
     * <li>This operation has idempotence.
     * <strong>Rate limit:</strong>
     * This operation is throttled if called too frequently. Do not exceed 10 calls per second. If you are throttled, retry later.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteFile  DeleteFileRequest
     * @return DeleteFileResponse
     */
    @Override
    public CompletableFuture<DeleteFileResponse> deleteFile(DeleteFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteFile").setMethod(HttpMethod.DELETE).setPathRegex("/{WorkspaceId}/datacenter/file/{FileId}/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Deleting data tables through the API is not supported. To delete a data table or specific data in a table, go to &lt;props=&quot;china&quot;&gt;<a href="https://bailian.console.aliyun.com/?tab=app#/data-center">Application Data</a>&lt;props=&quot;intl&quot;&gt;<a href="https://modelstudio.console.alibabacloud.com/?tab=app#/data-center">Application Data</a>.</li>
     * <li>This operation deletes files from &lt;props=&quot;china&quot;&gt;<a href="https://bailian.console.aliyun.com/?tab=app#/data-center">Application Data</a>&lt;props=&quot;intl&quot;&gt;<a href="https://modelstudio.console.alibabacloud.com/?tab=app#/data-center">Application Data</a> and does not affect knowledge bases that have already been built. To delete files from a knowledge base, invoke the <strong>DeleteIndexDocument</strong> operation.</li>
     * <li>A Resource Access Management (RAM) user must first obtain <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Alibaba Cloud Model Studio (requires <code>AliyunBailianDataFullAccess</code>, which includes the sfm:DeleteFiles permission) and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a> before invoking this operation. An Alibaba Cloud account can invoke this operation directly without authorization. Use the latest &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a> to invoke this operation.</li>
     * <li>This operation can only delete files with a status of parsing failed (PARSE_FAILED) or parsing completed (PARSE_SUCCESS).</li>
     * <li>This operation has idempotence.
     * <strong>Throttling:</strong>
     * This operation is throttled if called too frequently. Do not exceed 10 calls per second. If you are throttled, retry later.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteFiles  DeleteFilesRequest
     * @return DeleteFilesResponse
     */
    @Override
    public CompletableFuture<DeleteFilesResponse> deleteFiles(DeleteFilesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteFiles").setMethod(HttpMethod.POST).setPathRegex("/{WorkspaceId}/datacenter/file/delete").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteFilesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteFilesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Resource Access Management (RAM) users must first obtain <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Model Studio (requiring <code>AliyunBailianDataFullAccess</code>, which includes the sfm:DeleteIndex permission) and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a> before invoking this operation. Alibaba Cloud accounts can invoke this operation directly without authorization. Use the latest &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Model Studio SDK</a> to invoke this operation.</li>
     * <li>Before invoking this operation, make sure that your knowledge base has been created and has not been deleted (that is, the knowledge base ID <code>IndexId</code> is valid).</li>
     * <li>If the knowledge base is associated with an application, you must first dissociate it from the application before deleting it. This can currently only be done through the console. For more information, see <a href="https://help.aliyun.com/document_detail/2807740.html">Knowledge base</a>.</li>
     * <li>Deletion is irreversible. A deleted knowledge base cannot be recovered. Proceed with caution.</li>
     * <li>Invoking this operation does not delete files that have been imported into &lt;props=&quot;china&quot;&gt;<a href="https://bailian.console.aliyun.com/?tab=app#/data-center">Application Data</a>&lt;props=&quot;intl&quot;&gt;<a href="https://modelstudio.console.alibabacloud.com/?tab=app#/data-center">Application Data</a>.</li>
     * <li>This operation has idempotence.
     * <strong>Rate limit:</strong>
     * This operation is throttled if called too frequently. Do not exceed 10 calls per second. If you are throttled, retry later.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteIndex  DeleteIndexRequest
     * @return DeleteIndexResponse
     */
    @Override
    public CompletableFuture<DeleteIndexResponse> deleteIndex(DeleteIndexRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteIndex").setMethod(HttpMethod.POST).setPathRegex("/{WorkspaceId}/index/delete").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteIndexResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteIndexResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation does not support deleting data from data query or image Q&amp;A knowledge bases. Use the Model Studio console instead.</li>
     * <li>Resource Access Management (RAM) users must first obtain <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Model Studio (requiring <code>AliyunBailianDataFullAccess</code>, which includes the sfm:DeleteIndexDocument permission), before calling this operation. Alibaba Cloud accounts can call this operation directly without authorization. Use the latest &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Model Studio SDK</a> to call this operation.</li>
     * <li>Before calling this operation, make sure that your knowledge base has been created and has not been deleted (that is, the knowledge base ID <code>IndexId</code> is valid).</li>
     * <li>You can only delete files whose status is import failed (INSERT_ERROR) or import succeeded (FINISH) in the knowledge base. To query the file status in a specified knowledge base, call the <strong>ListIndexDocuments</strong> operation.</li>
     * <li>Deletion is irreversible. The content of deleted files cannot be recovered, and the <strong>Retrieve</strong> operation can no longer retrieve related information. Proceed with caution.</li>
     * <li>Calling this operation does not delete documents that have been imported into &lt;props=&quot;china&quot;&gt;<a href="https://bailian.console.aliyun.com/?tab=app#/data-center">Application Data</a>&lt;props=&quot;intl&quot;&gt;<a href="https://modelstudio.console.alibabacloud.com/?tab=app#/data-center">Application Data</a>.</li>
     * <li>This operation is idempotent.
     * <strong>Throttling:</strong>
     * This operation is throttled if called too frequently. Do not exceed 10 calls per second. If you are throttled, retry later.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteIndexDocument  DeleteIndexDocumentRequest
     * @return DeleteIndexDocumentResponse
     */
    @Override
    public CompletableFuture<DeleteIndexDocumentResponse> deleteIndexDocument(DeleteIndexDocumentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteIndexDocument").setMethod(HttpMethod.POST).setPathRegex("/{WorkspaceId}/index/delete_index_document").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteIndexDocumentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteIndexDocumentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before calling this operation, make sure that your long-term memory has been created and has not been deleted (that is, the memoryId is valid).</li>
     * <li>The delete operation is irreversible. The deleted long-term memory, including all of its long-term memory nodes, cannot be recovered. The <a href="https://www.alibabacloud.com/help/en/model-studio/developer-reference/api-bailian-2023-12-29-getmemory">GetMemory</a> operation will no longer be able to retrieve its information. Proceed with caution.</li>
     * <li>This operation is idempotent.
     * <strong>Rate limit:</strong> Make sure that the interval between two requests is at least 1 second. Otherwise, throttling may be triggered. If throttling occurs, retry later.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteMemory  DeleteMemoryRequest
     * @return DeleteMemoryResponse
     */
    @Override
    public CompletableFuture<DeleteMemoryResponse> deleteMemory(DeleteMemoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteMemory").setMethod(HttpMethod.DELETE).setPathRegex("/{workspaceId}/memories/{memoryId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMemoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMemoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteMemoryNode  DeleteMemoryNodeRequest
     * @return DeleteMemoryNodeResponse
     */
    @Override
    public CompletableFuture<DeleteMemoryNodeResponse> deleteMemoryNode(DeleteMemoryNodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteMemoryNode").setMethod(HttpMethod.DELETE).setPathRegex("/{workspaceId}/memories/{memoryId}/memoryNodes/{memoryNodeId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMemoryNodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMemoryNodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeletePromptTemplate  DeletePromptTemplateRequest
     * @return DeletePromptTemplateResponse
     */
    @Override
    public CompletableFuture<DeletePromptTemplateResponse> deletePromptTemplate(DeletePromptTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeletePromptTemplate").setMethod(HttpMethod.DELETE).setPathRegex("/{workspaceId}/promptTemplates/{promptTemplateId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeletePromptTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeletePromptTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Resource Access Management (RAM) users must first obtain the <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Model Studio (<code>AliyunBailianDataFullAccess</code> or <code>AliyunBailianDataReadOnlyAccess</code>, both of which include the <code>sfm:DescribeFile</code> permission) and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a> before they can call this operation. Alibaba Cloud accounts can call this operation directly without authorization. We recommend that you use the latest version of the &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Model Studio SDK</a> to call this operation.</li>
     * <li>This operation is idempotent.
     * <strong>Throttling rules:</strong>
     * This operation is throttled if it is called too frequently. Do not call this operation more than 10 times per second. If the operation is throttled, retry later.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeFile  DescribeFileRequest
     * @return DescribeFileResponse
     */
    @Override
    public CompletableFuture<DescribeFileResponse> describeFile(DescribeFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeFile").setMethod(HttpMethod.GET).setPathRegex("/{WorkspaceId}/datacenter/file/{FileId}/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAlipayTransferStatus  GetAlipayTransferStatusRequest
     * @return GetAlipayTransferStatusResponse
     */
    @Override
    public CompletableFuture<GetAlipayTransferStatusResponse> getAlipayTransferStatus(GetAlipayTransferStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAlipayTransferStatus").setMethod(HttpMethod.POST).setPathRegex("/openapi/alipay/transfer/status").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAlipayTransferStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAlipayTransferStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAlipayUrl  GetAlipayUrlRequest
     * @return GetAlipayUrlResponse
     */
    @Override
    public CompletableFuture<GetAlipayUrlResponse> getAlipayUrl(GetAlipayUrlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAlipayUrl").setMethod(HttpMethod.GET).setPathRegex("/openapi/alipay/transfer/url").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAlipayUrlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAlipayUrlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Resource Access Management (RAM) users must first obtain <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Model Studio (<code>AliyunBailianDataFullAccess</code> or <code>AliyunBailianDataReadOnlyAccess</code>, both of which include the sfm:GetAvailableParserTypes permission), and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a> before invoking this operation. Alibaba Cloud accounts can invoke this operation directly without authorization. Use the latest &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Model Studio SDK</a> to invoke this operation.</li>
     * <li>This operation is idempotent.
     * <strong>Throttling:</strong>
     * This operation is throttled if called too frequently. Do not exceed 10 calls per second. If you are throttled, retry later.</li>
     * </ul>
     * 
     * @param request the request parameters of GetAvailableParserTypes  GetAvailableParserTypesRequest
     * @return GetAvailableParserTypesResponse
     */
    @Override
    public CompletableFuture<GetAvailableParserTypesResponse> getAvailableParserTypes(GetAvailableParserTypesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAvailableParserTypes").setMethod(HttpMethod.GET).setPathRegex("/{WorkspaceId}/datacenter/parser/parsertype").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAvailableParserTypesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAvailableParserTypesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>To call this operation, a RAM user (sub-account) must have the required <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Alibaba Cloud Model Studio and must <a href="https://help.aliyun.com/document_detail/2851098.html">join a business space</a>. This requires the <code>AliyunBailianDataFullAccess</code> policy, which includes the sfm:GetConnector permission. An Alibaba Cloud account (primary account) can call this operation directly. We recommend using the latest <a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a><a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a> to call this operation.</li>
     * <li>This operation is idempotent.
     * <strong>Throttling:</strong>
     * This operation is subject to throttling. Do not exceed a frequency of 5 calls per second. If a request is throttled, try again later.</li>
     * </ul>
     * 
     * @param request the request parameters of GetConnector  GetConnectorRequest
     * @return GetConnectorResponse
     */
    @Override
    public CompletableFuture<GetConnectorResponse> getConnector(GetConnectorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetConnector").setMethod(HttpMethod.GET).setPathRegex("/{WorkspaceId}/datacenter/connector").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetConnectorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetConnectorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>To invoke this operation, a Resource Access Management (RAM) user must first obtain the <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Model Studio (<code>AliyunBailianDataFullAccess</code> or <code>AliyunBailianDataReadOnlyAccess</code>, both of which include the sfm:GetIndexJobStatus permission) and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a>. An Alibaba Cloud account can invoke this operation directly without authorization. Use the latest version of the &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Model Studio SDK</a> to invoke this operation.</li>
     * <li>You must have a knowledge base job task that is being executed. To create a knowledge base task, invoke the <strong>SubmitIndexJob</strong> operation. To create a knowledge base append task, invoke the <strong>SubmitIndexAddDocumentsJob</strong> operation. You must also obtain the corresponding <code>JobId</code>.</li>
     * <li>Set the interval between invocations of this operation to at least 5 seconds.</li>
     * <li>This operation is idempotent.</li>
     * </ul>
     * 
     * @param request the request parameters of GetIndexJobStatus  GetIndexJobStatusRequest
     * @return GetIndexJobStatusResponse
     */
    @Override
    public CompletableFuture<GetIndexJobStatusResponse> getIndexJobStatus(GetIndexJobStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetIndexJobStatus").setMethod(HttpMethod.GET).setPathRegex("/{WorkspaceId}/index/job/status").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetIndexJobStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetIndexJobStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;intl&quot;&gt;
     * This operation is not available on the Alibaba Cloud International Website (www\.alibabacloud.com).
     * &lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>Before you call this operation, a RAM user must obtain the required <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Alibaba Cloud Model Studio (which requires the <code>AliyunBailianDataFullAccess</code> permission) and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a>. Alibaba Cloud accounts can call this operation directly without authorization. You can call this operation using the latest version of the <a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio software development kit (SDK)</a>. Before you call this operation, make sure that the specified knowledge base has been created and has not been deleted. This means that the knowledge base ID (<code>IndexId</code>) must be valid. This operation is idempotent. The maximum query time range (EndTimestamp - StartTimestamp) is 30 days. The granularity of the time window in the returned data is dynamically adjusted based on the query time range.</li>
     * </ul>
     * 
     * @param request the request parameters of GetIndexMonitor  GetIndexMonitorRequest
     * @return GetIndexMonitorResponse
     */
    @Override
    public CompletableFuture<GetIndexMonitorResponse> getIndexMonitor(GetIndexMonitorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetIndexMonitor").setMethod(HttpMethod.GET).setPathRegex("/{WorkspaceId}/rag/index/monitor").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetIndexMonitorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetIndexMonitorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation is idempotent.
     * <strong>Rate limit:</strong> Ensure that the interval between two consecutive requests is at least 1 second. Otherwise, throttling may be triggered. If throttling occurs, retry later.</li>
     * </ul>
     * 
     * @param request the request parameters of GetMemory  GetMemoryRequest
     * @return GetMemoryResponse
     */
    @Override
    public CompletableFuture<GetMemoryResponse> getMemory(GetMemoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetMemory").setMethod(HttpMethod.GET).setPathRegex("/{workspaceId}/memories/{memoryId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMemoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMemoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMemoryNode  GetMemoryNodeRequest
     * @return GetMemoryNodeResponse
     */
    @Override
    public CompletableFuture<GetMemoryNodeResponse> getMemoryNode(GetMemoryNodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetMemoryNode").setMethod(HttpMethod.GET).setPathRegex("/{workspaceId}/memories/{memoryId}/memoryNodes/{memoryNodeId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMemoryNodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMemoryNodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Resource Access Management (RAM) users must first obtain <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Alibaba Cloud Model Studio (<code>AliyunBailianDataFullAccess</code> or <code>AliyunBailianDataReadOnlyAccess</code>, both of which include the sfm:GetParseSettings permission), and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a> before calling this operation. Alibaba Cloud accounts can call this operation directly without authorization. Call this operation by using the latest &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>.</li>
     * <li>This operation is idempotent.
     * <strong>Throttling:</strong>
     * This operation is subject to throttling. Do not exceed 10 calls per second. If you are throttled, retry later.</li>
     * </ul>
     * 
     * @param request the request parameters of GetParseSettings  GetParseSettingsRequest
     * @return GetParseSettingsResponse
     */
    @Override
    public CompletableFuture<GetParseSettingsResponse> getParseSettings(GetParseSettingsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetParseSettings").setMethod(HttpMethod.GET).setPathRegex("/{WorkspaceId}/datacenter/parser/settings").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetParseSettingsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetParseSettingsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetPromptTemplate  GetPromptTemplateRequest
     * @return GetPromptTemplateResponse
     */
    @Override
    public CompletableFuture<GetPromptTemplateResponse> getPromptTemplate(GetPromptTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetPromptTemplate").setMethod(HttpMethod.GET).setPathRegex("/{workspaceId}/promptTemplates/{promptTemplateId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPromptTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPromptTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetPublishedAgent  GetPublishedAgentRequest
     * @return GetPublishedAgentResponse
     */
    @Override
    public CompletableFuture<GetPublishedAgentResponse> getPublishedAgent(GetPublishedAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetPublishedAgent").setMethod(HttpMethod.GET).setPathRegex("/{workspaceId}/application/agents/{appCode}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPublishedAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPublishedAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of HighCodeDeploy  HighCodeDeployRequest
     * @return HighCodeDeployResponse
     */
    @Override
    public CompletableFuture<HighCodeDeployResponse> highCodeDeploy(HighCodeDeployRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("HighCodeDeploy").setMethod(HttpMethod.POST).setPathRegex("/openapi/{workspaceId}/highCode/publish").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(HighCodeDeployResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<HighCodeDeployResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Querying data tables by using API operations is not supported.</li>
     * <li>A Resource Access Management (RAM) user must first obtain <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Alibaba Cloud Model Studio (requires <code>AliyunBailianDataFullAccess</code>, which includes the sfm:ListCategory permission) and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a> before invoking this operation. An Alibaba Cloud account can invoke this operation directly without authorization. Use the latest &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a> to invoke this operation.</li>
     * <li>When performing a paging query for the first page, set only <code>MaxResults</code> to limit the number of entries returned. The <code>NextToken</code> value in the response serves as the credential for querying subsequent pages. When querying subsequent pages, set the <code>NextToken</code> parameter to the <code>NextToken</code> value obtained from the previous response as the query credential (if <code>NextToken</code> is empty, all results have been returned and no further requests are needed), and set <code>MaxResults</code> to limit the number of entries returned.</li>
     * <li>This operation has idempotence.
     * <strong>Rate limit:</strong>
     * This operation is subject to rate limiting if called too frequently. Do not exceed 5 calls per second. If you are rate-limited, retry later.</li>
     * </ul>
     * 
     * @param request the request parameters of ListCategory  ListCategoryRequest
     * @return ListCategoryResponse
     */
    @Override
    public CompletableFuture<ListCategoryResponse> listCategory(ListCategoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListCategory").setMethod(HttpMethod.POST).setPathRegex("/{WorkspaceId}/datacenter/categories").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCategoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCategoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>For document search&lt;props=&quot;china&quot;&gt; or audio/video search knowledge bases, this operation queries all chunks of a specified file. For data query or image Q&amp;A knowledge bases, this operation retrieves information about all text chunks.</li>
     * <li>Resource Access Management (RAM) users must first obtain <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Model Studio (requires <code>AliyunBailianDataFullAccess</code>, which includes the sfm:ChunkList permission), and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a> before invoking this operation. Alibaba Cloud accounts can invoke this operation directly without authorization. Use the latest &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Model Studio SDK</a> to invoke this operation.</li>
     * <li>Before invoking this operation, make sure that your knowledge base has been created and has not been deleted (that is, the knowledge base ID <code>IndexId</code> is valid).</li>
     * <li>This operation has idempotence.
     * <strong>Rate limit:</strong>
     * This operation is throttled if called too frequently. Do not exceed 10 calls per second. If you are throttled, retry later.</li>
     * </ul>
     * 
     * @param request the request parameters of ListChunks  ListChunksRequest
     * @return ListChunksResponse
     */
    @Override
    public CompletableFuture<ListChunksResponse> listChunks(ListChunksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListChunks").setMethod(HttpMethod.POST).setPathRegex("/{WorkspaceId}/index/list_chunks").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListChunksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListChunksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Resource Access Management (RAM) users must first obtain <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Alibaba Cloud Model Studio (requires <code>AliyunBailianDataFullAccess</code>, which includes the sfm:ListFile permission) and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a> before invoking this operation. Alibaba Cloud accounts can invoke this operation directly without authorization. Call this operation by using the latest &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>.</li>
     * <li>When querying the first page with paging, simply set <code>MaxResults</code> to limit the number of entries returned. The <code>NextToken</code> value in the response serves as the credential for querying subsequent pages. When querying subsequent pages, set the <code>NextToken</code> parameter to the <code>NextToken</code> value obtained from the previous response as the query credential (if <code>NextToken</code> is empty, all results have been returned and no further requests are needed), and set <code>MaxResults</code> to limit the number of entries returned.</li>
     * <li>This operation is idempotent.
     * <strong>Rate limit:</strong>
     * This operation is throttled if called too frequently. Do not exceed 5 calls per second. If you are throttled, retry later.</li>
     * </ul>
     * 
     * @param request the request parameters of ListFile  ListFileRequest
     * @return ListFileResponse
     */
    @Override
    public CompletableFuture<ListFileResponse> listFile(ListFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListFile").setMethod(HttpMethod.GET).setPathRegex("/{WorkspaceId}/datacenter/files").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Resource Access Management (RAM) users must first obtain <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Alibaba Cloud Model Studio (requires <code>AliyunBailianDataFullAccess</code>, which includes the sfm:ListIndexFiles permission), and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a> before invoking this operation. Alibaba Cloud accounts can invoke this operation directly without authorization. Use the latest &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a> to invoke this operation.</li>
     * <li>Before invoking this operation, make sure that your knowledge base has been created and has not been deleted (that is, the knowledge base ID <code>IndexId</code> is valid).</li>
     * <li>This operation has idempotence.
     * <strong>Throttling:</strong>
     * This operation is subject to throttling. Do not exceed 15 calls per second. If you are throttled, retry later.</li>
     * </ul>
     * 
     * @param request the request parameters of ListIndexDocuments  ListIndexDocumentsRequest
     * @return ListIndexDocumentsResponse
     */
    @Override
    public CompletableFuture<ListIndexDocumentsResponse> listIndexDocuments(ListIndexDocumentsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListIndexDocuments").setMethod(HttpMethod.GET).setPathRegex("/{WorkspaceId}/index/list_index_documents").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListIndexDocumentsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListIndexDocumentsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Resource Access Management (RAM) users must first obtain <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Alibaba Cloud Model Studio (requires <code>AliyunBailianDataFullAccess</code>, which includes the sfm:ListIndexFiles permission), before invoking this operation. Alibaba Cloud accounts can invoke this operation directly without authorization. Invoke this operation through the latest &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>.</li>
     * <li>Before invoking this operation, make sure your knowledge base has been created and has not been deleted (that is, the knowledge base ID <code>IndexId</code> is valid).</li>
     * <li>This operation has idempotence.</li>
     * </ul>
     * 
     * @param request the request parameters of ListIndexFileDetails  ListIndexFileDetailsRequest
     * @return ListIndexFileDetailsResponse
     */
    @Override
    public CompletableFuture<ListIndexFileDetailsResponse> listIndexFileDetails(ListIndexFileDetailsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListIndexFileDetails").setMethod(HttpMethod.POST).setPathRegex("/{WorkspaceId}/index/list_index_file_detail").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListIndexFileDetailsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListIndexFileDetailsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Resource Access Management (RAM) users must first obtain <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Alibaba Cloud Model Studio (requires <code>AliyunBailianDataFullAccess</code>, which includes the sfm:ListIndex permission). Alibaba Cloud accounts can invoke this operation directly without authorization. Invoke this operation by using the latest &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>.</li>
     * <li>This operation has idempotence.
     * <strong>Throttling:</strong>
     * This operation is subject to throttling. Do not exceed 10 calls per second. If you are throttled, retry later.</li>
     * </ul>
     * 
     * @param request the request parameters of ListIndices  ListIndicesRequest
     * @return ListIndicesResponse
     */
    @Override
    public CompletableFuture<ListIndicesResponse> listIndices(ListIndicesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListIndices").setMethod(HttpMethod.GET).setPathRegex("/{WorkspaceId}/index/list_indices").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListIndicesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListIndicesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>When performing a paged query for the first page, only set <code>MaxResults</code> to limit the number of entries returned. The <code>NextToken</code> value in the response serves as the credential for querying subsequent pages. When querying subsequent pages, set the <code>NextToken</code> parameter to the <code>NextToken</code> value obtained from the previous response as the query credential (if <code>NextToken</code> is empty, all results have been returned and no further requests are needed), and set <code>MaxResults</code> to limit the number of entries returned.</li>
     * <li>This operation supports idempotence.
     * <strong>Rate limit:</strong> Ensure that the interval between two consecutive requests is at least 1 second. Otherwise, throttling may be triggered. If throttling occurs, retry later.</li>
     * </ul>
     * 
     * @param request the request parameters of ListMemories  ListMemoriesRequest
     * @return ListMemoriesResponse
     */
    @Override
    public CompletableFuture<ListMemoriesResponse> listMemories(ListMemoriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListMemories").setMethod(HttpMethod.GET).setPathRegex("/{workspaceId}/memories").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMemoriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMemoriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListMemoryNodes  ListMemoryNodesRequest
     * @return ListMemoryNodesResponse
     */
    @Override
    public CompletableFuture<ListMemoryNodesResponse> listMemoryNodes(ListMemoryNodesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListMemoryNodes").setMethod(HttpMethod.GET).setPathRegex("/{workspaceId}/memories/{memoryId}/memoryNodes").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMemoryNodesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMemoryNodesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPromptTemplates  ListPromptTemplatesRequest
     * @return ListPromptTemplatesResponse
     */
    @Override
    public CompletableFuture<ListPromptTemplatesResponse> listPromptTemplates(ListPromptTemplatesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListPromptTemplates").setMethod(HttpMethod.GET).setPathRegex("/{workspaceId}/promptTemplates").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPromptTemplatesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPromptTemplatesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPublishedAgent  ListPublishedAgentRequest
     * @return ListPublishedAgentResponse
     */
    @Override
    public CompletableFuture<ListPublishedAgentResponse> listPublishedAgent(ListPublishedAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListPublishedAgent").setMethod(HttpMethod.GET).setPathRegex("/{workspaceId}/application/agents").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPublishedAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPublishedAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li><strong>Invocation method</strong>: You can retrieve the knowledge base by using the latest <a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a> (with an Alibaba Cloud <a href="https://help.aliyun.com/document_detail/116401.html">AccessKey</a>) or <a href="https://help.aliyun.com/document_detail/2990886.html">Spring AI Alibaba</a> (with an Alibaba Cloud Model Studio <a href="https://help.aliyun.com/document_detail/2712195.html">API key</a>). Both methods provide encapsulation of complex signature calculation logic to simplify the invocation procedure.</li>
     * <li><strong>Permission requirements</strong>:<ul>
     * <li><strong>Resource Access Management (RAM) user</strong>: You must first obtain the <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Alibaba Cloud Model Studio (you can use the <code>AliyunBailianDataFullAccess</code> policy, which includes the sfm:Retrieve permission required by this operation) and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a> before you can invoke this operation.</li>
     * <li><strong>Alibaba Cloud account</strong>: By default, an Alibaba Cloud account has the required permissions and can directly invoke this operation.</li>
     * </ul>
     * </li>
     * <li><strong>Response latency</strong>: Because the operation involves complex retrieval and matching, the response time may be long. Configure appropriate timeout and retry settings for your requests.</li>
     * <li><strong>Idempotence</strong>: This operation is idempotent.
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li><strong>Invocation method</strong>: Use the latest <a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>. The SDK provides encapsulation of complex signature calculation logic to simplify the invocation procedure.</li>
     * <li><strong>Permission requirements</strong>:<ul>
     * <li><strong>Resource Access Management (RAM) user</strong>: You must first obtain the <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Alibaba Cloud Model Studio (you can use the <code>AliyunBailianDataFullAccess</code> policy, which includes the sfm:Retrieve permission required by this operation) and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a> before you can invoke this operation.</li>
     * <li><strong>Alibaba Cloud account</strong>: By default, an Alibaba Cloud account has the required permissions and can directly invoke this operation.</li>
     * </ul>
     * </li>
     * <li><strong>Response latency</strong>: Because the operation involves complex retrieval and matching, the response time may be long. Configure appropriate timeout and retry settings for your requests.</li>
     * <li><strong>Idempotence</strong>: This operation is idempotent.</li>
     * </ul>
     * 
     * @param request the request parameters of Retrieve  RetrieveRequest
     * @return RetrieveResponse
     */
    @Override
    public CompletableFuture<RetrieveResponse> retrieve(RetrieveRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("Retrieve").setMethod(HttpMethod.POST).setPathRegex("/{WorkspaceId}/index/retrieve").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RetrieveResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RetrieveResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>This operation does not support data query or image Q&amp;A knowledge bases. For information about how to update data query or image Q&amp;A knowledge bases, see the knowledge base update instructions in <a href="https://help.aliyun.com/document_detail/2807740.html">Knowledge base</a>.
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>This operation does not support data query or image Q&amp;A knowledge bases. For information about how to update data query or image Q&amp;A knowledge bases, see the knowledge base update instructions in <a href="https://help.aliyun.com/document_detail/2807740.html">Knowledge base</a>.</li>
     * <li>Resource Access Management (RAM) users must first obtain <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Model Studio (requiring <code>AliyunBailianDataFullAccess</code>, which includes the sfm:SubmitIndexAddDocumentsJob permission), and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a> before invoking this operation. Alibaba Cloud accounts can invoke this operation directly without authorization. Use the latest &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Model Studio SDK</a> to invoke this operation.</li>
     * <li>Before invoking this operation, make sure that your knowledge base has been created and has not been deleted (that is, the knowledge base ID <code>IndexId</code> is valid).</li>
     * <li>Before invoking this operation, invoke the <strong>AddFile</strong> operation to upload the files you want to append to Model Studio.</li>
     * <li>After invoking this operation, the node requires time to execute and may take several hours during peak periods. Do not submit duplicate requests before the node is complete. To query the node execution status, invoke the <strong>GetIndexJobStatus</strong> operation. The <code>Documents</code> file list returned by this operation contains all files in this append job (uniquely identified by the <code>job_id</code> you provide), and you can check whether each file was imported (parsed) successfully. Note that invoking GetIndexJobStatus too frequently will trigger rate limiting. Do not exceed a frequency of 20 times per minute.</li>
     * <li>After this operation is invoked successfully, it takes some time to execute. Do not submit duplicate requests before the response is returned. This operation does not have idempotence.
     * <strong>Rate limit:</strong>
     * Frequent calls to this operation will be throttled. Do not exceed 10 calls per second. If throttled, retry later.</li>
     * </ul>
     * 
     * @param request the request parameters of SubmitIndexAddDocumentsJob  SubmitIndexAddDocumentsJobRequest
     * @return SubmitIndexAddDocumentsJobResponse
     */
    @Override
    public CompletableFuture<SubmitIndexAddDocumentsJobResponse> submitIndexAddDocumentsJob(SubmitIndexAddDocumentsJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SubmitIndexAddDocumentsJob").setMethod(HttpMethod.POST).setPathRegex("/{WorkspaceId}/index/add_documents_to_index").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitIndexAddDocumentsJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitIndexAddDocumentsJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Resource Access Management (RAM) users must first obtain <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Model Studio (requires <code>AliyunBailianDataFullAccess</code>, which includes the sfm:SubmitIndexJob permission), and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a> before invoking this operation. Alibaba Cloud accounts can invoke this operation directly without authorization. Use the latest &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Model Studio SDK</a> to invoke this operation.</li>
     * <li>Before invoking this operation, you must invoke the <strong>CreateIndex</strong> operation and obtain the corresponding <code>IndexId</code>.</li>
     * <li>After invoking this operation, the node requires time to execute and may take several hours during peak periods. Do not submit duplicate requests before the node completes. To query the node execution status, invoke the <strong>GetIndexJobStatus</strong> operation.</li>
     * <li>After the knowledge base is created, you can associate it with an agent application&lt;props=&quot;china&quot;&gt; or workflow application in the same workspace through &lt;props=&quot;china&quot;&gt;<a href="https://bailian.console.aliyun.com/?tab=app#/app-center">Application Management</a>&lt;props=&quot;intl&quot;&gt;<a href="https://modelstudio.console.alibabacloud.com/?tab=app#/app-center">Application Management</a> (or pass the <code>IndexID</code> through <code>rag_options</code> in <a href="https://help.aliyun.com/document_detail/2846132.html">Application Calls</a>) to supplement your Model Studio application with private knowledge and up-to-date information. You can also choose not to use a Model Studio application and directly query the knowledge base by invoking the <strong>Retrieve</strong> operation.</li>
     * <li>This operation does not support idempotence.
     * <strong>Rate limit:</strong>
     * This operation is throttled if called too frequently. Do not exceed 10 calls per second. If throttled, retry later.</li>
     * </ul>
     * 
     * @param request the request parameters of SubmitIndexJob  SubmitIndexJobRequest
     * @return SubmitIndexJobResponse
     */
    @Override
    public CompletableFuture<SubmitIndexJobResponse> submitIndexJob(SubmitIndexJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SubmitIndexJob").setMethod(HttpMethod.POST).setPathRegex("/{WorkspaceId}/index/submit_index_job").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitIndexJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitIndexJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateAndPublishAgent  UpdateAndPublishAgentRequest
     * @return UpdateAndPublishAgentResponse
     */
    @Override
    public CompletableFuture<UpdateAndPublishAgentResponse> updateAndPublishAgent(UpdateAndPublishAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateAndPublishAgent").setMethod(HttpMethod.PUT).setPathRegex("/{workspaceId}/application/agents/{appCode}").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAndPublishAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAndPublishAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateAndPublishAgentSelective  UpdateAndPublishAgentSelectiveRequest
     * @return UpdateAndPublishAgentSelectiveResponse
     */
    @Override
    public CompletableFuture<UpdateAndPublishAgentSelectiveResponse> updateAndPublishAgentSelective(UpdateAndPublishAgentSelectiveRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateAndPublishAgentSelective").setMethod(HttpMethod.PUT).setPathRegex("/{workspaceId}/application/agents/{appCode}/updateAndPublishAgentSelective").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAndPublishAgentSelectiveResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAndPublishAgentSelectiveResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li><strong>Key restrictions</strong>: This operation supports only document search knowledge bases. Data query and image-based Q&amp;A knowledge bases are not supported.</li>
     * <li><strong>Permission requirements</strong>:<ul>
     * <li><strong>Resource Access Management (RAM) user (sub-account)</strong>: You must first obtain <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Alibaba Cloud Model Studio (you can use the <code>AliyunBailianDataFullAccess</code> policy, which includes the sfm:UpdateChunk permission required by this operation), and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a> before you invoke this operation.</li>
     * <li><strong>Alibaba Cloud account</strong>: Has permissions by default and can invoke this operation directly.</li>
     * </ul>
     * </li>
     * <li><strong>Calling method</strong>: Use the latest version of the &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>. The SDK encapsulates the complex signature calculation logic as encapsulation to simplify the invocation procedure.</li>
     * <li><strong>Propagation delay</strong>: Updates typically take effect immediately. During peak periods, a slight delay (in seconds) may occur.</li>
     * <li><strong>Idempotence</strong>: This operation is idempotent. If you repeat the operation on a text chunk that has already been successfully updated, the operation returns a success response.
     * <strong>Rate limit:</strong>
     * This operation is throttled if called too frequently. Do not exceed 10 calls per second. If throttled, retry after a short wait.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateChunk  UpdateChunkRequest
     * @return UpdateChunkResponse
     */
    @Override
    public CompletableFuture<UpdateChunkResponse> updateChunk(UpdateChunkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateChunk").setMethod(HttpMethod.POST).setPathRegex("/{WorkspaceId}/chunk/update").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateChunkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateChunkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>A RAM user can call this operation only after they join a workspace and are granted the required <a href="https://help.aliyun.com/document_detail/2848578.html">API permission</a> for Alibaba Cloud Model Studio (Bailian). The <code>AliyunBailianDataFullAccess</code> policy, which includes the <code>sfm:UpdateConnector</code> permission, is required. An Alibaba Cloud account can call this operation directly. Use the latest version of the &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio (Bailian) SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio (Bailian) SDK</a> to call this operation.</li>
     * <li>This operation is not idempotent.
     * <strong>Throttling:</strong> If you call this operation too frequently, the system may throttle your requests. Do not exceed a frequency of 5 calls per second. If a request is throttled, try again later.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateConnector  UpdateConnectorRequest
     * @return UpdateConnectorResponse
     */
    @Override
    public CompletableFuture<UpdateConnectorResponse> updateConnector(UpdateConnectorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateConnector").setMethod(HttpMethod.PUT).setPathRegex("/{WorkspaceId}/datacenter/connector/{ConnectorId}").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateConnectorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateConnectorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Resource Access Management (RAM) users must first obtain <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Alibaba Cloud Model Studio (requires <code>AliyunBailianDataFullAccess</code>, which includes the sfm:UpdateFileTag permission), and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a> before calling this operation. Alibaba Cloud accounts can call this operation directly without authorization. Use the latest &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a> to call this operation.
     * <strong>Rate limiting:</strong>
     * This operation is rate-limited. Do not exceed 5 calls per second. If you are throttled, retry later.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateFileTag  UpdateFileTagRequest
     * @return UpdateFileTagResponse
     */
    @Override
    public CompletableFuture<UpdateFileTagResponse> updateFileTag(UpdateFileTagRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateFileTag").setMethod(HttpMethod.PUT).setPathRegex("/{WorkspaceId}/datacenter/file/{FileId}").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateFileTagResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateFileTagResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;intl&quot;&gt;This operation is not supported on the Chinese site.
     * &lt;props=&quot;china&quot;&gt;
     * A Resource Access Management (RAM) user must first obtain <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Alibaba Cloud Model Studio (<code>AliyunBailianDataFullAccess</code> is required) and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a> before invoking this operation. An Alibaba Cloud account can invoke this operation directly without authorization. Use the latest <a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a> to invoke this operation.
     * Before invoking this operation, make sure that your knowledge base has been created and has not been deleted (that is, the knowledge base ID <code>IndexId</code> is valid).
     * This operation supports idempotence.</p>
     * 
     * @param request the request parameters of UpdateIndex  UpdateIndexRequest
     * @return UpdateIndexResponse
     */
    @Override
    public CompletableFuture<UpdateIndexResponse> updateIndex(UpdateIndexRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateIndex").setMethod(HttpMethod.POST).setPathRegex("/{WorkspaceId}/index/update").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateIndexResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateIndexResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation is idempotent.
     * <strong>Rate limit:</strong> Ensure that the interval between two requests is at least 1 second. Otherwise, throttling may be triggered. If throttling occurs, retry later.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateMemory  UpdateMemoryRequest
     * @return UpdateMemoryResponse
     */
    @Override
    public CompletableFuture<UpdateMemoryResponse> updateMemory(UpdateMemoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateMemory").setMethod(HttpMethod.PUT).setPathRegex("/{workspaceId}/memories/{memoryId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateMemoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateMemoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateMemoryNode  UpdateMemoryNodeRequest
     * @return UpdateMemoryNodeResponse
     */
    @Override
    public CompletableFuture<UpdateMemoryNodeResponse> updateMemoryNode(UpdateMemoryNodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateMemoryNode").setMethod(HttpMethod.PUT).setPathRegex("/{workspaceId}/memories/{memoryId}/memoryNodes/{memoryNodeId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateMemoryNodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateMemoryNodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdatePromptTemplate  UpdatePromptTemplateRequest
     * @return UpdatePromptTemplateResponse
     */
    @Override
    public CompletableFuture<UpdatePromptTemplateResponse> updatePromptTemplate(UpdatePromptTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdatePromptTemplate").setMethod(HttpMethod.PATCH).setPathRegex("/{workspaceId}/promptTemplates/{promptTemplateId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdatePromptTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdatePromptTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li><p>Before calling this operation, the target data table must already exist. Pass its table ID as <code>TableId</code>. This operation only updates the specified table and does not create data tables.</p>
     * </li>
     * <li><p>Make sure the OSS bucket and Alibaba Cloud Model Studio belong to the same Alibaba Cloud account. Add the tag key <code>bailian-datahub-access</code> and tag value <code>read</code> to the target bucket before importing.</p>
     * <ul>
     * <li>Supported bucket storage classes exclude Archive, Cold Archive, and Deep Cold Archive. Buckets with content encryption enabled are supported. Buckets with public read/write, public read, or private access are supported.</li>
     * <li>To use a bucket with <a href="https://help.aliyun.com/document_detail/2636937.html">Referer-based hotlink protection</a> enabled, refer to <a href="https://help.aliyun.com/document_detail/2636937.html">Allow only trusted websites to access</a> and add the domain <code>*.console.aliyun.com</code> to the Referer whitelist.</li>
     * </ul>
     * </li>
     * <li><p>Resource Access Management (RAM) users must first obtain <a href="https://help.aliyun.com/document_detail/2848578.html">API permissions</a> for Alibaba Cloud Model Studio (the <code>AliyunBailianDataFullAccess</code> permission policy is required, which includes the sfm:UpdateTableFromAuthorizedOss permission) and <a href="https://help.aliyun.com/document_detail/2851098.html">join a workspace</a> before invoking this operation. Alibaba Cloud accounts can invoke this operation directly without authorization. Use the latest version of the &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Alibaba Cloud Model Studio SDK</a> to invoke this operation.</p>
     * </li>
     * <li><p>This operation does not guarantee idempotence.
     * <strong>Rate limit:</strong>
     * This operation is subject to rate limiting if called too frequently. Do not exceed 5 calls per second. If rate limiting occurs, retry after a short wait.</p>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of UpdateTableFromAuthorizedOss  UpdateTableFromAuthorizedOssRequest
     * @return UpdateTableFromAuthorizedOssResponse
     */
    @Override
    public CompletableFuture<UpdateTableFromAuthorizedOssResponse> updateTableFromAuthorizedOss(UpdateTableFromAuthorizedOssRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateTableFromAuthorizedOss").setMethod(HttpMethod.PUT).setPathRegex("/{WorkspaceId}/datacenter/table/fromoss/{TableId}").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateTableFromAuthorizedOssResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateTableFromAuthorizedOssResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
