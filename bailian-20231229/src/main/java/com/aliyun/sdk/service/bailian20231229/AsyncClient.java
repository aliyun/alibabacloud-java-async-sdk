// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20231229;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.bailian20231229.models.*;
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
    CompletableFuture<AddCategoryResponse> addCategory(AddCategoryRequest request);

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
    CompletableFuture<AddChunkResponse> addChunk(AddChunkRequest request);

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
    CompletableFuture<AddConnectorResponse> addConnector(AddConnectorRequest request);

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
    CompletableFuture<AddFileResponse> addFile(AddFileRequest request);

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
    CompletableFuture<AddFilesFromAuthorizedOssResponse> addFilesFromAuthorizedOss(AddFilesFromAuthorizedOssRequest request);

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
    CompletableFuture<AddTableResponse> addTable(AddTableRequest request);

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
    CompletableFuture<ApplyFileUploadLeaseResponse> applyFileUploadLease(ApplyFileUploadLeaseRequest request);

    /**
     * <b>description</b> :
     * <p>1\. This interface is intended for pro-code deployment only; other scenarios are currently not supported. 2. After obtaining the temporary file upload lease via this interface, upload the file manually.</p>
     * 
     * @param request the request parameters of ApplyTempStorageLease  ApplyTempStorageLeaseRequest
     * @return ApplyTempStorageLeaseResponse
     */
    CompletableFuture<ApplyTempStorageLeaseResponse> applyTempStorageLease(ApplyTempStorageLeaseRequest request);

    /**
     * @param request the request parameters of BatchUpdateFileTag  BatchUpdateFileTagRequest
     * @return BatchUpdateFileTagResponse
     */
    CompletableFuture<BatchUpdateFileTagResponse> batchUpdateFileTag(BatchUpdateFileTagRequest request);

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
    CompletableFuture<ChangeParseSettingResponse> changeParseSetting(ChangeParseSettingRequest request);

    /**
     * @param request the request parameters of CreateAndPulishAgent  CreateAndPulishAgentRequest
     * @return CreateAndPulishAgentResponse
     */
    CompletableFuture<CreateAndPulishAgentResponse> createAndPulishAgent(CreateAndPulishAgentRequest request);

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
    CompletableFuture<CreateIndexResponse> createIndex(CreateIndexRequest request);

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
    CompletableFuture<CreateMemoryResponse> createMemory(CreateMemoryRequest request);

    /**
     * @param request the request parameters of CreateMemoryNode  CreateMemoryNodeRequest
     * @return CreateMemoryNodeResponse
     */
    CompletableFuture<CreateMemoryNodeResponse> createMemoryNode(CreateMemoryNodeRequest request);

    /**
     * <b>description</b> :
     * <p>This API does not currently support the creation of text-to-image prompt templates.</p>
     * 
     * @param request the request parameters of CreatePromptTemplate  CreatePromptTemplateRequest
     * @return CreatePromptTemplateResponse
     */
    CompletableFuture<CreatePromptTemplateResponse> createPromptTemplate(CreatePromptTemplateRequest request);

    /**
     * @param request the request parameters of DeleteAgent  DeleteAgentRequest
     * @return DeleteAgentResponse
     */
    CompletableFuture<DeleteAgentResponse> deleteAgent(DeleteAgentRequest request);

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
    CompletableFuture<DeleteCategoryResponse> deleteCategory(DeleteCategoryRequest request);

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
    CompletableFuture<DeleteChunkResponse> deleteChunk(DeleteChunkRequest request);

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
    CompletableFuture<DeleteConnectorResponse> deleteConnector(DeleteConnectorRequest request);

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
    CompletableFuture<DeleteFileResponse> deleteFile(DeleteFileRequest request);

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
    CompletableFuture<DeleteFilesResponse> deleteFiles(DeleteFilesRequest request);

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
    CompletableFuture<DeleteIndexResponse> deleteIndex(DeleteIndexRequest request);

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
    CompletableFuture<DeleteIndexDocumentResponse> deleteIndexDocument(DeleteIndexDocumentRequest request);

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
    CompletableFuture<DeleteMemoryResponse> deleteMemory(DeleteMemoryRequest request);

    /**
     * @param request the request parameters of DeleteMemoryNode  DeleteMemoryNodeRequest
     * @return DeleteMemoryNodeResponse
     */
    CompletableFuture<DeleteMemoryNodeResponse> deleteMemoryNode(DeleteMemoryNodeRequest request);

    /**
     * @param request the request parameters of DeletePromptTemplate  DeletePromptTemplateRequest
     * @return DeletePromptTemplateResponse
     */
    CompletableFuture<DeletePromptTemplateResponse> deletePromptTemplate(DeletePromptTemplateRequest request);

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
    CompletableFuture<DescribeFileResponse> describeFile(DescribeFileRequest request);

    /**
     * @param request the request parameters of GetAlipayTransferStatus  GetAlipayTransferStatusRequest
     * @return GetAlipayTransferStatusResponse
     */
    CompletableFuture<GetAlipayTransferStatusResponse> getAlipayTransferStatus(GetAlipayTransferStatusRequest request);

    /**
     * @param request the request parameters of GetAlipayUrl  GetAlipayUrlRequest
     * @return GetAlipayUrlResponse
     */
    CompletableFuture<GetAlipayUrlResponse> getAlipayUrl(GetAlipayUrlRequest request);

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
    CompletableFuture<GetAvailableParserTypesResponse> getAvailableParserTypes(GetAvailableParserTypesRequest request);

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
    CompletableFuture<GetConnectorResponse> getConnector(GetConnectorRequest request);

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
    CompletableFuture<GetIndexJobStatusResponse> getIndexJobStatus(GetIndexJobStatusRequest request);

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
    CompletableFuture<GetIndexMonitorResponse> getIndexMonitor(GetIndexMonitorRequest request);

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
    CompletableFuture<GetMemoryResponse> getMemory(GetMemoryRequest request);

    /**
     * @param request the request parameters of GetMemoryNode  GetMemoryNodeRequest
     * @return GetMemoryNodeResponse
     */
    CompletableFuture<GetMemoryNodeResponse> getMemoryNode(GetMemoryNodeRequest request);

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
    CompletableFuture<GetParseSettingsResponse> getParseSettings(GetParseSettingsRequest request);

    /**
     * @param request the request parameters of GetPromptTemplate  GetPromptTemplateRequest
     * @return GetPromptTemplateResponse
     */
    CompletableFuture<GetPromptTemplateResponse> getPromptTemplate(GetPromptTemplateRequest request);

    /**
     * @param request the request parameters of GetPublishedAgent  GetPublishedAgentRequest
     * @return GetPublishedAgentResponse
     */
    CompletableFuture<GetPublishedAgentResponse> getPublishedAgent(GetPublishedAgentRequest request);

    /**
     * @param request the request parameters of HighCodeDeploy  HighCodeDeployRequest
     * @return HighCodeDeployResponse
     */
    CompletableFuture<HighCodeDeployResponse> highCodeDeploy(HighCodeDeployRequest request);

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
    CompletableFuture<ListCategoryResponse> listCategory(ListCategoryRequest request);

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
    CompletableFuture<ListChunksResponse> listChunks(ListChunksRequest request);

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
    CompletableFuture<ListFileResponse> listFile(ListFileRequest request);

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
    CompletableFuture<ListIndexDocumentsResponse> listIndexDocuments(ListIndexDocumentsRequest request);

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
    CompletableFuture<ListIndexFileDetailsResponse> listIndexFileDetails(ListIndexFileDetailsRequest request);

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
    CompletableFuture<ListIndicesResponse> listIndices(ListIndicesRequest request);

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
    CompletableFuture<ListMemoriesResponse> listMemories(ListMemoriesRequest request);

    /**
     * @param request the request parameters of ListMemoryNodes  ListMemoryNodesRequest
     * @return ListMemoryNodesResponse
     */
    CompletableFuture<ListMemoryNodesResponse> listMemoryNodes(ListMemoryNodesRequest request);

    /**
     * @param request the request parameters of ListPromptTemplates  ListPromptTemplatesRequest
     * @return ListPromptTemplatesResponse
     */
    CompletableFuture<ListPromptTemplatesResponse> listPromptTemplates(ListPromptTemplatesRequest request);

    /**
     * @param request the request parameters of ListPublishedAgent  ListPublishedAgentRequest
     * @return ListPublishedAgentResponse
     */
    CompletableFuture<ListPublishedAgentResponse> listPublishedAgent(ListPublishedAgentRequest request);

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
    CompletableFuture<RetrieveResponse> retrieve(RetrieveRequest request);

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
    CompletableFuture<SubmitIndexAddDocumentsJobResponse> submitIndexAddDocumentsJob(SubmitIndexAddDocumentsJobRequest request);

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
    CompletableFuture<SubmitIndexJobResponse> submitIndexJob(SubmitIndexJobRequest request);

    /**
     * @param request the request parameters of UpdateAndPublishAgent  UpdateAndPublishAgentRequest
     * @return UpdateAndPublishAgentResponse
     */
    CompletableFuture<UpdateAndPublishAgentResponse> updateAndPublishAgent(UpdateAndPublishAgentRequest request);

    /**
     * @param request the request parameters of UpdateAndPublishAgentSelective  UpdateAndPublishAgentSelectiveRequest
     * @return UpdateAndPublishAgentSelectiveResponse
     */
    CompletableFuture<UpdateAndPublishAgentSelectiveResponse> updateAndPublishAgentSelective(UpdateAndPublishAgentSelectiveRequest request);

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
    CompletableFuture<UpdateChunkResponse> updateChunk(UpdateChunkRequest request);

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
    CompletableFuture<UpdateConnectorResponse> updateConnector(UpdateConnectorRequest request);

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
    CompletableFuture<UpdateFileTagResponse> updateFileTag(UpdateFileTagRequest request);

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
    CompletableFuture<UpdateIndexResponse> updateIndex(UpdateIndexRequest request);

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
    CompletableFuture<UpdateMemoryResponse> updateMemory(UpdateMemoryRequest request);

    /**
     * @param request the request parameters of UpdateMemoryNode  UpdateMemoryNodeRequest
     * @return UpdateMemoryNodeResponse
     */
    CompletableFuture<UpdateMemoryNodeResponse> updateMemoryNode(UpdateMemoryNodeRequest request);

    /**
     * @param request the request parameters of UpdatePromptTemplate  UpdatePromptTemplateRequest
     * @return UpdatePromptTemplateResponse
     */
    CompletableFuture<UpdatePromptTemplateResponse> updatePromptTemplate(UpdatePromptTemplateRequest request);

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
    CompletableFuture<UpdateTableFromAuthorizedOssResponse> updateTableFromAuthorizedOss(UpdateTableFromAuthorizedOssRequest request);

}
