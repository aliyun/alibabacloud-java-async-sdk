// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.winnexo20260512.models.*;
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
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation supports batch addition of members by providing a user group ID and one or more user IDs.</li>
     * <li>Duplicate entries in the user ID list do not cause errors. The system automatically handles duplicates to ensure each user is added only once.</li>
     * <li>The caller must have the required permissions to perform this operation.</li>
     * <li>This operation is applicable to scenarios that require quick team structure management or access control policy adjustments.</li>
     * </ul>
     * 
     * @param request the request parameters of AddUserGroupMembers  AddUserGroupMembersRequest
     * @return AddUserGroupMembersResponse
     */
    CompletableFuture<AddUserGroupMembersResponse> addUserGroupMembers(AddUserGroupMembersRequest request);

    /**
     * <b>description</b> :
     * <p>Idempotently cancels subscriptions along three independent dimensions: graphName, operatingObjectName, and objectType. The input array accepts 1 to 200 items per request. Each item must be a non-empty string with a maximum length of 128 characters. After server-side validation, items are deduplicated while preserving order. Non-string values, values that exceed the length limit, or arrays that exceed the size limit are rejected. The delete operation, per-item status tracking, and remaining valid count are completed within a single transaction. To safely cancel all subscriptions, you must also invoke ClearOperatingObjectFavorites to clean up historical, MISSING, or permission-hidden records that are invisible in the list, and then read back to confirm that total is 0.</p>
     * 
     * @param request the request parameters of BatchRemoveOperatingObjectFavorites  BatchRemoveOperatingObjectFavoritesRequest
     * @return BatchRemoveOperatingObjectFavoritesResponse
     */
    CompletableFuture<BatchRemoveOperatingObjectFavoritesResponse> batchRemoveOperatingObjectFavorites(BatchRemoveOperatingObjectFavoritesRequest request);

    /**
     * @param request the request parameters of CheckHealth  CheckHealthRequest
     * @return CheckHealthResponse
     */
    CompletableFuture<CheckHealthResponse> checkHealth(CheckHealthRequest request);

    /**
     * <b>description</b> :
     * <p>Clears all persisted follows for the current calling user across three independent dimensions: graphName, operatingObjectName, and objectType. This includes historical records, MISSING records, and permission-hidden records that are not visible in the list. The operation does not return invisible object IDs and verifies that the remaining physical record count is zero within the same transaction.</p>
     * 
     * @param request the request parameters of ClearOperatingObjectFavorites  ClearOperatingObjectFavoritesRequest
     * @return ClearOperatingObjectFavoritesResponse
     */
    CompletableFuture<ClearOperatingObjectFavoritesResponse> clearOperatingObjectFavorites(ClearOperatingObjectFavoritesRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Creates a service notice. The caller must be mapped to a real platform user in the system O&amp;M tenant and must have announcement management permissions.</p>
     * <ul>
     * <li><code>priority</code>: The importance level of the notice. Valid values: URGENT, IMPORTANT, and GENERAL.</li>
     * <li><code>targetTenantIds</code> / <code>targetRoleCodes</code>: Used only when the corresponding target mode is set to SPECIFIED. Pass values as a JSON array.</li>
     * <li><code>effectiveStart</code> / <code>effectiveEnd</code>: ISO 8601 time with time zone.</li>
     * <li><code>publishNow</code>: If set to true, the notice is published immediately after creation. Otherwise, it is saved as a draft.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateAnnouncement  CreateAnnouncementRequest
     * @return CreateAnnouncementResponse
     */
    CompletableFuture<CreateAnnouncementResponse> createAnnouncement(CreateAnnouncementRequest request);

    /**
     * @param request the request parameters of CreateConversation  CreateConversationRequest
     * @return CreateConversationResponse
     */
    CompletableFuture<CreateConversationResponse> createConversation(CreateConversationRequest request);

    /**
     * <b>description</b> :
     * <p>Registers a custom-only organization for subsequent department tree push through syncOrgStructure.
     *     Registration logic:
     *     1. Validates the corpId format (must start with a lowercase letter or digit, 3-64 characters, hyphens allowed).
     *     2. Delegates to OrgSyncAuthorizedService to execute registration (includes permission verification and tenant-level uniqueness check).
     *     3. Returns the registration result.
     *     Note: Custom-only organizations support only department tree synchronization. Member relationship synchronization is not supported.</p>
     * 
     * @param request the request parameters of CreateCustomOrg  CreateCustomOrgRequest
     * @return CreateCustomOrgResponse
     */
    CompletableFuture<CreateCustomOrgResponse> createCustomOrg(CreateCustomOrgRequest request);

    /**
     * <b>description</b> :
     * <p>OpenAPI 创建语义图谱（同步快建占位记录 0.0.0）并在创建时绑定数据源。
     *     内容编辑走个人草稿接口，正式发布走产品控制台。
     *     业务编排：
     *     1. 权限校验（个人 Token 校验语义管理权限；部署/系统级 Token 放行）
     *     2. 同步落库 active 占位记录（schemaVersion 固定 0.0.0）并绑定数据源；
     *        不写 history、不触发 runtime 重建
     *     3. 图谱内容后续经个人草稿编辑，在控制台正式发布
     *     错误码：
     *     - ERR.GraphSchema.GraphNameInvalid: 图谱名称不合法
     *     - ERR.GraphSchema.GraphNameDuplicated: 图谱名称已存在
     *     - ERR.GraphSchema.DisplayNameInvalid: 展示名不合法或重复
     *     - ERR.GraphDataSource.*: 数据源不存在 / 非 RDB 类不可绑定</p>
     * 
     * @param request the request parameters of CreateGraph  CreateGraphRequest
     * @return CreateGraphResponse
     */
    CompletableFuture<CreateGraphResponse> createGraph(CreateGraphRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>Connects a specified DingTalk group chat to a group knowledge base that the caller has joined.</li>
     * <li>The resource type is fixed to ALI_DING, the scope is fixed to GROUP, and the owning user is resolved from the gateway authentication identity.</li>
     * <li>groupId, chatId, and historyStartTime are required.</li>
     * <li>updateFrequency can be configured by using a preset or a five-field cron expression for subsequent synchronization frequency.</li>
     * <li>The server verifies the caller\&quot;s group membership, the target group directory permissions, and the uniqueness of chatId within the scope.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateGroupAliDingChat  CreateGroupAliDingChatRequest
     * @return CreateGroupAliDingChatResponse
     */
    CompletableFuture<CreateGroupAliDingChatResponse> createGroupAliDingChat(CreateGroupAliDingChatRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>Connects a specified standard DingTalk group chat to the group knowledge base that the caller has joined.</li>
     * <li>The resource type is fixed to DINGTALK, the scope is fixed to GROUP, and the owning user is parsed from the gateway authentication identity.</li>
     * <li>groupId, chatId, and historyStartTime are required.</li>
     * <li>updateFrequency can be configured through preset or a five-segment cron expression for subsequent synchronization frequency.</li>
     * <li>The server verifies the caller\&quot;s group member identity and target group directory permissions. The same group chat can be created as different Sources.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateGroupDingtalkChat  CreateGroupDingtalkChatRequest
     * @return CreateGroupDingtalkChatResponse
     */
    CompletableFuture<CreateGroupDingtalkChatResponse> createGroupDingtalkChat(CreateGroupDingtalkChatRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description\n\nFixed as <code>ONLINE_DOC + FEISHU + GROUP</code>. <code>groupId</code> is required. If <code>directoryId</code> is omitted, the root directory of the group knowledge base is used. Group membership and directory write permissions are verified by the backend.</h2>
     * 
     * @param request the request parameters of CreateGroupFeishuDoc  CreateGroupFeishuDocRequest
     * @return CreateGroupFeishuDocResponse
     */
    CompletableFuture<CreateGroupFeishuDocResponse> createGroupFeishuDoc(CreateGroupFeishuDocRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation adds an AliDing online document to a specified enterprise knowledge base.</li>
     * <li>The caller must have the <code>DEVELOPMENT_KB_MANAGE</code> permission.</li>
     * <li><code>source_type</code> is fixed to <code>ONLINE_DOC</code>, <code>platform</code> is fixed to <code>ALI_DING</code>, and <code>scope</code> is fixed to <code>TENANT</code>.</li>
     * <li>If <code>directoryId</code> is not provided, the document is bound to the root directory of the current digital employee by default. If provided, it must be a valid directory ID under the current tenant.</li>
     * <li>The <code>filePublicUrl</code> parameter is required and specifies the publicly accessible URL of the AliDing online document to upload.</li>
     * <li>Optional parameters include <code>operatingObjectName</code> (digital employee name), <code>description</code> (resource description), <code>knowledgeId</code> (knowledge base ID), and <code>sourceTags</code> (resource tags).</li>
     * <li>A successful response returns information about the newly created resource, such as <code>sourceId</code>, <code>name</code>, <code>status</code>, <code>directoryId</code>, and creation time.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateKnowledgeBaseAliDingDoc  CreateKnowledgeBaseAliDingDocRequest
     * @return CreateKnowledgeBaseAliDingDocResponse
     */
    CompletableFuture<CreateKnowledgeBaseAliDingDocResponse> createKnowledgeBaseAliDingDoc(CreateKnowledgeBaseAliDingDocRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation allows users with the <code>DEVELOPMENT_KB_MANAGE</code> permission to create a category for the enterprise knowledge base.</li>
     * <li>You can specify a parent category ID when creating a category. If no parent category ID is specified, the new category is mounted directly under the root directory of the enterprise knowledge base.</li>
     * <li>The system automatically checks for name conflicts and directory depth limits.</li>
     * <li><code>tenant_id</code> and <code>user_id</code> are obtained only through authentication. These parameters are ignored even if they are provided in the request body.</li>
     * <li>Ensure that the specified <code>parentDirectoryId</code> (if any) belongs to the current tenant.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateKnowledgeBaseDirectory  CreateKnowledgeBaseDirectoryRequest
     * @return CreateKnowledgeBaseDirectoryResponse
     */
    CompletableFuture<CreateKnowledgeBaseDirectoryResponse> createKnowledgeBaseDirectory(CreateKnowledgeBaseDirectoryRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description\n\nFixed as <code>ONLINE_DOC + FEISHU + TENANT</code>. <code>directoryId</code> is required. The invoker must have the enterprise knowledge base feature permission and knowledge base management permission on the target knowledge base.</h2>
     * 
     * @param request the request parameters of CreateKnowledgeBaseFeishuDoc  CreateKnowledgeBaseFeishuDocRequest
     * @return CreateKnowledgeBaseFeishuDocResponse
     */
    CompletableFuture<CreateKnowledgeBaseFeishuDocResponse> createKnowledgeBaseFeishuDoc(CreateKnowledgeBaseFeishuDocRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation uploads a file to the enterprise knowledge base.</li>
     * <li>The <code>DEVELOPMENT_KB_MANAGE</code> permission is required to call this operation.</li>
     * <li>You must provide the Object Storage Service (OSS) persistent address (<code>filePath</code>) of the file when uploading.</li>
     * <li>Optional parameters include the public access URL and original file name to enhance the completeness of file information.</li>
     * <li>If <code>directoryId</code> is specified, the file is placed in the corresponding enterprise knowledge base directory. Otherwise, the file is bound to the default root directory of the current digital employee.</li>
     * <li>You can use <code>sourceTags</code> to add labels to resources for subsequent management and retrieval.</li>
     * <li>This operation initiates a billing item (UNSTRUCTURED_PARSE). Ensure that your account balance is sufficient.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateKnowledgeBaseFile  CreateKnowledgeBaseFileRequest
     * @return CreateKnowledgeBaseFileResponse
     */
    CompletableFuture<CreateKnowledgeBaseFileResponse> createKnowledgeBaseFile(CreateKnowledgeBaseFileRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API is used to upload plain text information to an enterprise knowledge base. The caller must have the required management permissions.</li>
     * <li>The <code>textContent</code> field is required and represents the plain text content to upload.</li>
     * <li>Optional parameters include the digital employee name (<code>operatingObjectName</code>) and resource description (<code>description</code>), which allow users to customize additional details.</li>
     * <li>If <code>directoryId</code> is provided, the uploaded text is attached to the specified knowledge base folder. If not provided, the text is attached to the root folder of the current digital employee by default.</li>
     * <li>You can use <code>sourceTags</code> to add labels to resources for easier management and retrieval.</li>
     * <li>Before invoking this operation, make sure that you have correctly configured the authentication method (AK, BearerToken, and APP authentication are supported) and have the <code>DEVELOPMENT_KB_MANAGE</code> permission.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateKnowledgeBaseText  CreateKnowledgeBaseTextRequest
     * @return CreateKnowledgeBaseTextResponse
     */
    CompletableFuture<CreateKnowledgeBaseTextResponse> createKnowledgeBaseText(CreateKnowledgeBaseTextRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>Connects the specified AliDing group chat to the current user\&quot;s personal knowledge base.</li>
     * <li>The resource type is fixed to ALI_DING, the scope is fixed to PERSONAL, and the owning user is parsed from the gateway authentication identity.</li>
     * <li>historyStartTime is required and supports YYYY-MM-DD or YYYY-MM-DD HH:MM:SS format.</li>
     * <li>updateFrequency can be configured with a preset or a five-field cron expression for subsequent synchronization frequency.</li>
     * <li>chatId must be unique within the target personal scope.</li>
     * </ul>
     * 
     * @param request the request parameters of CreatePersonalAliDingChat  CreatePersonalAliDingChatRequest
     * @return CreatePersonalAliDingChatResponse
     */
    CompletableFuture<CreatePersonalAliDingChatResponse> createPersonalAliDingChat(CreatePersonalAliDingChatRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API uploads AliDing meeting materials (such as audio/video files and Shanji links) to the &quot;My Resources&quot; section of a specified digital employee.</li>
     * <li>The <code>source_type</code> is fixed to <code>ALI_DING_MEETING</code>, and the <code>scope</code> is fixed to <code>PERSONAL</code>.</li>
     * <li>You must provide a public audio/video OSS URL (<code>ossUrl</code>) and the original Shanji link (<code>shanjiUrl</code>).</li>
     * <li>Optionally, you can specify a target personal directory ID (<code>directoryId</code>). If not specified, the resource is automatically bound to the default root directory of the current digital employee.</li>
     * <li>You can add a resource description (<code>description</code>) and meeting notes (<code>notes</code>). The meeting notes can be used for auxiliary analysis.</li>
     * <li>This operation requires authentication. AK, BearerToken, and APP authentication methods are supported.</li>
     * </ul>
     * 
     * @param request the request parameters of CreatePersonalAliDingMeeting  CreatePersonalAliDingMeetingRequest
     * @return CreatePersonalAliDingMeetingResponse
     */
    CompletableFuture<CreatePersonalAliDingMeetingResponse> createPersonalAliDingMeeting(CreatePersonalAliDingMeetingRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API operation adds an AliDing online document to the &quot;My Resources&quot; section of a specified digital employee.</li>
     * <li>Fixed parameters include <code>source_type=ONLINE_DOC</code>, <code>platform=ALI_DING</code>, and <code>scope=PERSONAL</code>.</li>
     * <li>If <code>directoryId</code> is not provided, the document is attached to the root folder of the current digital employee by default. If <code>directoryId</code> is provided, make sure that the folder belongs to the current user and exists under the current digital employee.</li>
     * <li>During the invoke process, metering is started and related operation logs are recorded.</li>
     * <li>For security purposes, <code>tenant_id</code> and <code>user_id</code> are obtained only from the authentication identity. Values provided by the caller for these fields are ignored.</li>
     * <li>Any validation or execute failure throws an exception through the service and is transformed to a POP error code returned to the caller.</li>
     * </ul>
     * <h2>Related operations</h2>
     * 
     * @param request the request parameters of CreatePersonalAlidingDoc  CreatePersonalAlidingDocRequest
     * @return CreatePersonalAlidingDocResponse
     */
    CompletableFuture<CreatePersonalAlidingDocResponse> createPersonalAlidingDoc(CreatePersonalAlidingDocRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API creates an AliDing knowledge base and mounts it under the personal resource directory of the specified digital employee.</li>
     * <li><code>platform</code> is fixed to <code>ALI_DING</code>, and <code>directory_type</code> is fixed to <code>PERSONAL</code>.</li>
     * <li>If <code>directoryId</code> is provided, the system verifies that the directory exists and belongs to the current tenant and is of the personal type.</li>
     * <li>During creation, the knowledge base root directory is initialized (with the status set to <code>RUNNING</code>), and background tasks are dispatched based on the provided synchronization configuration to pull the remote directory tree and create child nodes.</li>
     * <li>For security purposes, <code>tenant_id</code> and <code>user_id</code> are obtained only from the authenticated identity. These fields in the request body are ignored.</li>
     * <li>The synchronization configuration is optional. If enabled, a cron expression is required. If not provided or disabled, scheduled synchronization is not performed by default.</li>
     * <li>The knowledge base name can be customized. If not provided, it is automatically populated after background synchronization.</li>
     * <li>Multi-value object binding is supported. Related information is serialized and stored in the knowledge base metadata.</li>
     * </ul>
     * 
     * @param request the request parameters of CreatePersonalAlidingKnowledgeBase  CreatePersonalAlidingKnowledgeBaseRequest
     * @return CreatePersonalAlidingKnowledgeBaseResponse
     */
    CompletableFuture<CreatePersonalAlidingKnowledgeBaseResponse> createPersonalAlidingKnowledgeBase(CreatePersonalAlidingKnowledgeBaseRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>Connects a specified DingTalk group chat to the personal knowledge base of the current user.</li>
     * <li>The resource type is fixed to DINGTALK, the scope is fixed to PERSONAL, and the owning user is parsed from the gateway authentication identity.</li>
     * <li>historyStartTime is required and supports YYYY-MM-DD or YYYY-MM-DD HH:MM:SS format.</li>
     * <li>updateFrequency can be configured with a preset or a five-field cron expression for subsequent synchronization frequency.</li>
     * <li>The same group chat can be created as different sources. Each source is isolated by sourceId.</li>
     * </ul>
     * 
     * @param request the request parameters of CreatePersonalDingtalkChat  CreatePersonalDingtalkChatRequest
     * @return CreatePersonalDingtalkChatResponse
     */
    CompletableFuture<CreatePersonalDingtalkChatResponse> createPersonalDingtalkChat(CreatePersonalDingtalkChatRequest request);

    /**
     * @deprecated OpenAPI CreatePersonalDingtalkMeeting is deprecated  * @description ## Request description
     * - This operation uploads a DingTalk meeting as a resource to the "My Resources" section of a specified digital employee.
     * - `source_type` is fixed to `DINGTALK_MEETING`, and `scope` is fixed to `PERSONAL`.
     * - If `credentialId` is not provided, the system default configurations are used.
     * - If `directoryId` is not specified, the resource is automatically attached to the default root folder of the current digital employee. If specified, it must be an existing personal folder of the invoker under the digital employee.
     * - The optional parameters `description` and `notes` are used to describe the resource and record meeting notes, respectively. The `notes` value is used for auxiliary analysis.
     * 
     * @param request the request parameters of CreatePersonalDingtalkMeeting  CreatePersonalDingtalkMeetingRequest
     * @return CreatePersonalDingtalkMeetingResponse
     */
    @Deprecated
    CompletableFuture<CreatePersonalDingtalkMeetingResponse> createPersonalDingtalkMeeting(CreatePersonalDingtalkMeetingRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API creates a meeting resource by using a standard DingTalk Shanji note link. The collection method is fixed to the DWS corresponding to personal OAuth.</li>
     * <li><code>source_type</code> is fixed to <code>DINGTALK_MEETING</code>, and <code>scope</code> is fixed to <code>PERSONAL</code>.</li>
     * <li>You must provide a standard DingTalk Shanji note link or taskUuid (<code>shanjiUrl</code>).</li>
     * <li>Optionally specify a target personal directory ID (<code>directoryId</code>). If not specified, the default root directory of the current digital employee is used.</li>
     * <li>You can add a resource description (<code>description</code>) and meeting notes (<code>notes</code>).</li>
     * <li>This operation supports one of the following authentication methods: AK, BearerToken, or APP.</li>
     * </ul>
     * 
     * @param request the request parameters of CreatePersonalDingtalkMinutes  CreatePersonalDingtalkMinutesRequest
     * @return CreatePersonalDingtalkMinutesResponse
     */
    CompletableFuture<CreatePersonalDingtalkMinutesResponse> createPersonalDingtalkMinutes(CreatePersonalDingtalkMinutesRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API is used to create a personal folder (category) under &quot;My Resources&quot;.</li>
     * <li>If <code>parentDirectoryId</code> is not specified, the system automatically uses or creates the default root folder of the current digital employee as the parent folder.</li>
     * <li>If <code>parentDirectoryId</code> is specified, it must be an existing personal folder of the current user under the current digital employee.</li>
     * <li><code>tenant_id</code> and <code>user_id</code> are derived from the authenticated identity only. These fields are ignored if passed in the request body.</li>
     * </ul>
     * 
     * @param request the request parameters of CreatePersonalDirectory  CreatePersonalDirectoryRequest
     * @return CreatePersonalDirectoryResponse
     */
    CompletableFuture<CreatePersonalDirectoryResponse> createPersonalDirectory(CreatePersonalDirectoryRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This API uses the Lark application connection managed by the user corresponding to the current OpenAPI identity. It pulls the name and historical messages of the specified group chat through the built-in CLI of the project and creates a knowledge resource in the user\&quot;s personal knowledge base.</p>
     * <ul>
     * <li><code>chatId</code>: The Lark group chat ID. Must start with <code>oc_</code>.</li>
     * <li><code>directoryId</code> (optional): The target personal directory ID. If omitted, the current user\&quot;s default personal root directory is used.</li>
     * <li><code>historyStartTime</code> (optional): The start time for historical messages. Supports <code>YYYY-MM-DD</code> or <code>YYYY-MM-DD HH:MM:SS</code>.</li>
     * <li><code>updateFrequency</code> (optional): The Source-level scheduled synchronization configuration. Supports preset frequencies or five-field cron expressions.</li>
     * <li><code>description</code>, <code>operatingObjectName</code>, <code>notes</code>, <code>sourceTags</code>: Optional Source metadata.
     * Security constraints: The Source Type is fixed to FEISHU, and the knowledge scope is fixed to PERSONAL. The Lark connector user is determined by the POP trusted identity. Credentials or user IDs passed by the caller are not accepted.</li>
     * </ul>
     * 
     * @param request the request parameters of CreatePersonalFeishuChat  CreatePersonalFeishuChatRequest
     * @return CreatePersonalFeishuChatResponse
     */
    CompletableFuture<CreatePersonalFeishuChatResponse> createPersonalFeishuChat(CreatePersonalFeishuChatRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description\n\nFixed as <code>ONLINE_DOC + FEISHU + PERSONAL</code>. The Lark connector user is determined by the trusted OpenAPI identity. If <code>directoryId</code> is omitted, the current user\&quot;s default personal root directory is used.</h2>
     * 
     * @param request the request parameters of CreatePersonalFeishuDoc  CreatePersonalFeishuDocRequest
     * @return CreatePersonalFeishuDocResponse
     */
    CompletableFuture<CreatePersonalFeishuDocResponse> createPersonalFeishuDoc(CreatePersonalFeishuDocRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This API uploads a meeting record from Lark Minutes to the &quot;My Resources&quot; section of a specified digital employee. By providing the required parameters, such as the unique identifier of the Lark Minutes record (<code>minuteToken</code>) and the credential ID (<code>credentialId</code>), you can migrate and save meeting content. If no target directory is specified, the resource is bound to the root directory of the current digital employee by default.</p>
     * <ul>
     * <li><code>operatingObjectName</code>: The name of the digital employee that performs the operation.</li>
     * <li><code>name</code>: The display name of the uploaded resource in the system.</li>
     * <li><code>minuteToken</code>: The unique identifier of the meeting from the Lark Minutes platform.</li>
     * <li><code>credentialId</code>: The ID associated with specific authentication information, used to verify the validity of the request.</li>
     * <li><code>directoryId</code> (optional): The ID of the target personal directory in which to store the resource. If this field is omitted, the resource is automatically placed in the default location.</li>
     * <li><code>description</code> (optional): A brief description or note about the uploaded resource.
     * Precautions:</li>
     * <li>Ensure that the provided <code>minuteToken</code> and <code>credentialId</code> are valid.</li>
     * <li>If <code>directoryId</code> is specified, confirm that it belongs to one of the available personal directories of the caller in the current digital employee environment.</li>
     * </ul>
     * 
     * @param request the request parameters of CreatePersonalFeishuMinute  CreatePersonalFeishuMinuteRequest
     * @return CreatePersonalFeishuMinuteResponse
     */
    CompletableFuture<CreatePersonalFeishuMinuteResponse> createPersonalFeishuMinute(CreatePersonalFeishuMinuteRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API is used to upload a file to the &quot;My Resources&quot; section of a specified digital employee.</li>
     * <li><code>source_type</code> is fixed to <code>FILE</code>, <code>scope</code> is fixed to <code>PERSONAL</code>, and <code>platform</code> is fixed to <code>LOCAL</code>.</li>
     * <li>The file must include an OSS persistent address (<code>filePath</code>). Other information such as the public access URL and original file name is optional.</li>
     * <li>If the target folder ID (<code>directoryId</code>) is not specified, the file is automatically attached to the default root folder of the current digital employee. If specified, ensure that the folder belongs to the personal folder of the caller.</li>
     * <li>Security authentication is supported through multiple authentication methods (AK, BearerToken, and APP) to authenticate requests.</li>
     * <li>The operation type is write (<code>write</code>), and operation logs are recorded for subsequent auditing.
     * To invoke this operation, you can use AK, BearerToken, or APP authentication.</li>
     * </ul>
     * 
     * @param request the request parameters of CreatePersonalFile  CreatePersonalFileRequest
     * @return CreatePersonalFileResponse
     */
    CompletableFuture<CreatePersonalFileResponse> createPersonalFile(CreatePersonalFileRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API is used to add plain text content to the personal resources of a specified digital employee.</li>
     * <li><code>source_type</code> is fixed to <code>TEXT</code>, and <code>scope</code> is fixed to <code>PERSONAL</code>.</li>
     * <li>If <code>directoryId</code> is not provided, the content is bound to the root directory of the current digital employee by default. If provided, it must be an existing personal directory of the caller under the digital employee.</li>
     * <li><code>tenant_id</code> and <code>user_id</code> can only be obtained from the authentication identity information. These parameters are ignored if passed in the request body.</li>
     * <li>The call initiates metering and generates a corresponding <code>billing_id</code>.</li>
     * <li>The text content is written to <code>unstructured_docs</code>, and an initial resource record is generated.</li>
     * <li>Any validation or execution failure throws a <code>RobjectException</code>, which is converted to a POP error code by the global middleware and returned to the caller.</li>
     * </ul>
     * 
     * @param request the request parameters of CreatePersonalText  CreatePersonalTextRequest
     * @return CreatePersonalTextResponse
     */
    CompletableFuture<CreatePersonalTextResponse> createPersonalText(CreatePersonalTextRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API operation uploads an offline meeting audio file to the My Resources section of a specified digital employee.</li>
     * <li><code>source_type</code> is fixed to <code>VOICE_MEETING</code>, <code>scope</code> is fixed to <code>PERSONAL</code>, and <code>voice_meeting_type</code> is fixed to <code>OFFLINE</code>.</li>
     * <li>If <code>directoryId</code> is not provided in the request body, the resource is automatically bound to the default root directory. If <code>directoryId</code> is provided, it must be an existing personal directory of the current user under the current digital employee.</li>
     * <li>Calling this operation starts a background process to transcribe the audio file and returns information about the newly created resource.</li>
     * <li>For security purposes, <code>tenant_id</code> and <code>user_id</code> are obtained only from the authenticated identity. These fields are ignored even if they are included in the request body.</li>
     * <li>Any validation or execution failure throws a <code>RobjectException</code>, which is converted to a POP error code through the global middleware.</li>
     * </ul>
     * 
     * @param request the request parameters of CreatePersonalVoiceMeeting  CreatePersonalVoiceMeetingRequest
     * @return CreatePersonalVoiceMeetingResponse
     */
    CompletableFuture<CreatePersonalVoiceMeetingResponse> createPersonalVoiceMeeting(CreatePersonalVoiceMeetingRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation is used to upload files to an enterprise knowledge base.</li>
     * <li>You must have the <code>DEVELOPMENT_KB_MANAGE</code> permission to call this API operation.</li>
     * <li>You must provide the OSS persistent address (<code>filePath</code>) of the file when uploading.</li>
     * <li>Optional parameters include the public access URL of the file and the original file name to enhance the completeness of file information.</li>
     * <li>If <code>directoryId</code> is specified, the file is placed in the corresponding enterprise knowledge base directory. Otherwise, the file is bound to the default root directory of the current digital employee by default.</li>
     * <li>You can add tags to resources by using <code>sourceTags</code> for subsequent management and retrieval.</li>
     * <li>This operation initiates a billing item (UNSTRUCTURED_PARSE). Make sure that your account balance is sufficient.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateScheduledTask  CreateScheduledTaskRequest
     * @return CreateScheduledTaskResponse
     */
    CompletableFuture<CreateScheduledTaskResponse> createScheduledTask(CreateScheduledTaskRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API is used to create a new enterprise knowledge base folder under a specified tenant.</li>
     * <li>You can set the <code>parentId</code> parameter to specify the parent folder of the new folder. If this parameter is not specified, the folder is created as a root folder by default.</li>
     * <li>The <code>path</code> parameter is optional. If this parameter is not specified, the system automatically calculates the path based on the parent folder.</li>
     * <li>Calling this operation requires the corresponding permissions. Multiple authentication methods are supported, including AK, BearerToken, and APP authentication.</li>
     * <li>After the folder is created, the related information about the new folder is returned, such as the folder ID and name.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateTenantDirectory  CreateTenantDirectoryRequest
     * @return CreateTenantDirectoryResponse
     */
    CompletableFuture<CreateTenantDirectoryResponse> createTenantDirectory(CreateTenantDirectoryRequest request);

    /**
     * <b>description</b> :
     * <p>Creates a user by using OpenAPI.
     *     Business orchestration:
     *     1. Parses roleCodes into role_ids (validates against system role enumerations).
     *     2. Checks whether the user already exists (used to return the isNewUser flag).
     *     3. Calls UserManagementService.add_tenant_member to create or add the user (the password must be passed by the caller as an RSA ciphertext).
     *     4. Returns the creation result (including the isNewUser flag).
     *     Error codes:
     *     - ERR.User.DeactivatedInTenant: The user is deactivated in the tenant. Use updateUser to restore the user.
     *     - ERR.User.AlreadyInTenant: The user is already an active member of the tenant.
     *     - ERR.User.DisplayNameDuplicateInTenant: The display name is duplicate within the tenant.</p>
     * 
     * @param request the request parameters of CreateUser  CreateUserRequest
     * @return CreateUserResponse
     */
    CompletableFuture<CreateUserResponse> createUser(CreateUserRequest request);

    /**
     * <b>description</b> :
     * <p>WinNexo user management OpenAPI: Creates a user group. The tenant identity is derived from the authentication context.</p>
     * 
     * @param request the request parameters of CreateUserGroup  CreateUserGroupRequest
     * @return CreateUserGroupResponse
     */
    CompletableFuture<CreateUserGroupResponse> createUserGroup(CreateUserGroupRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation creates a WINNEXO user under a specified tenant and optionally assigns system roles and user groups to the user.</li>
     * <li>The <code>accountId</code> parameter serves as the logon account for the user and must be unique.</li>
     * <li>The <code>displayName</code> parameter specifies the display name of the user, which must also be unique within the tenant and cannot exceed 100 characters in length.</li>
     * <li>The optional <code>roleCodes</code> parameter specifies a list of roles for the user. By default, the <code>APPLICATION_USER</code> role is assigned.</li>
     * <li>The <code>userGroupIds</code> parameter allows you to add up to 100 user group IDs to the new user. Make sure that all specified user groups belong to the same tenant.</li>
     * <li>The password must be encrypted by using the RSA-OAEP-SHA256 algorithm and submitted in Base64 format.</li>
     * <li>This operation supports calls over HTTPS and requires the request body in JSON format.</li>
     * <li>For security authentication, AK, BearerToken, and APP are supported.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateUserWithGroups  CreateUserWithGroupsRequest
     * @return CreateUserWithGroupsResponse
     */
    CompletableFuture<CreateUserWithGroupsResponse> createUserWithGroups(CreateUserWithGroupsRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API is used to upload a file to the &quot;My Resources&quot; section of a specified digital employee.</li>
     * <li><code>source_type</code> is fixed to <code>FILE</code>, <code>scope</code> is fixed to <code>PERSONAL</code>, and <code>platform</code> is fixed to <code>LOCAL</code>.</li>
     * <li>The file must include an OSS persistent address (<code>filePath</code>). Other information such as the public access URL and original file name is optional.</li>
     * <li>If the target directory ID (<code>directoryId</code>) is not specified, the file is automatically bound to the default root directory of the current digital employee. If specified, ensure that the directory belongs to the caller\&quot;s personal directory.</li>
     * <li>Multiple authentication methods (AK, BearerToken, APP) are supported for security authentication.</li>
     * <li>The operation type is write (<code>write</code>), and operation logs are recorded for subsequent auditing.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteChatSession  DeleteChatSessionRequest
     * @return DeleteChatSessionResponse
     */
    CompletableFuture<DeleteChatSessionResponse> deleteChatSession(DeleteChatSessionRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li><code>tenantId</code> is derived from the authenticated identity only. Any value passed by the caller is ignored.</li>
     * <li><code>sourceId</code> is passed through the request body. The registration path is the flat URI <code>/openapi/deleteSource</code> and does not contain a <code>{sourceId}</code> path template. Do not append the resource ID as a path segment. The gateway performs exact routing based on the flat URI and returns <code>InvalidAction.NotFound</code> if the path does not match.</li>
     * <li>Deletion is irreversible. The parsing results and bindings associated with the resource are invalidated.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteSource  DeleteSourceRequest
     * @return DeleteSourceResponse
     */
    CompletableFuture<DeleteSourceResponse> deleteSource(DeleteSourceRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API allows you to delete a specific enterprise knowledge base directory.</li>
     * <li>Set the <code>deleteMode</code> parameter to select different deletion strategies, including reject deletion (reject), recursive deletion (recursive), or move the directory to the root directory (move_to_root).</li>
     * <li>If <code>deleteMode</code> is not provided, the default behavior is to reject deletion.</li>
     * <li>The enterprise directory boundary is validated before the deletion operation.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteTenantDirectory  DeleteTenantDirectoryRequest
     * @return DeleteTenantDirectoryResponse
     */
    CompletableFuture<DeleteTenantDirectoryResponse> deleteTenantDirectory(DeleteTenantDirectoryRequest request);

    /**
     * <b>description</b> :
     * <p>Disables the INSTANCE token of a user.
     *     Business logic:
     *     1. Retrieves user_id from identity (caller_type=user is enforced).
     *     2. Constructs an AuthContext and delegates permission verification to UserTokenAuthorizedService.
     *     3. Calls disable_token (ACTIVE → INACTIVE).
     *     4. Returns disabled=True.
     *     Idempotence: If no ACTIVE token exists, deactivate_all affects 0 rows and does not return an error.</p>
     * 
     * @param request the request parameters of DisableToken  DisableTokenRequest
     * @return DisableTokenResponse
     */
    CompletableFuture<DisableTokenResponse> disableToken(DisableTokenRequest request);

    /**
     * <b>description</b> :
     * <p>Enables the INSTANCE token for a user (idempotent).
     *     Business logic:
     *     1. Retrieves user_id from identity (caller_type=user is required).
     *     2. Constructs an AuthContext and delegates permission verification to UserTokenAuthorizedService.
     *     3. Calls enable_token:
     *        - If an ACTIVE token exists, returns idempotently (only the masked value is returned, and the plaintext is not issued again).
     *        - If an INACTIVE token exists, reactivates it (returns the plaintext).
     *        - If no token exists, creates one (returns the plaintext).
     *     Security constraint: The token plaintext is returned only once when the token is first enabled. Subsequent idempotent calls do not return the plaintext.</p>
     * 
     * @param request the request parameters of EnableToken  EnableTokenRequest
     * @return EnableTokenResponse
     */
    CompletableFuture<EnableTokenResponse> enableToken(EnableTokenRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API is exclusively for the Winnexo Lite Workbench.</li>
     * <li>Retrieves the title, meeting summary, to-do items, and full transcription based on a DingTalk minutes ID.</li>
     * <li>Audio and video files are not downloaded. If any content fails to be read, the entire request fails.</li>
     * </ul>
     * 
     * @param request the request parameters of GetAliDingMinutesContent  GetAliDingMinutesContentRequest
     * @return GetAliDingMinutesContentResponse
     */
    CompletableFuture<GetAliDingMinutesContentResponse> getAliDingMinutesContent(GetAliDingMinutesContentRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API is used to upload files to the &quot;My Resources&quot; section of a specified digital employee.</li>
     * <li><code>source_type</code> is fixed to <code>FILE</code>, <code>scope</code> is fixed to <code>PERSONAL</code>, and <code>platform</code> is fixed to <code>LOCAL</code>.</li>
     * <li>The file must include an OSS persistent address (<code>filePath</code>). Other information such as the public access URL and original file name is optional.</li>
     * <li>If the target folder ID (<code>directoryId</code>) is not specified, the file is automatically attached to the default root folder of the current digital employee. If specified, ensure that the folder belongs to the invoker\&quot;s personal folder.</li>
     * <li>Multiple authentication methods (AK, BearerToken, APP) are supported to authenticate requests.</li>
     * <li>The operation type is write (<code>write</code>), and operation logs are recorded for subsequent auditing.</li>
     * </ul>
     * 
     * @param request the request parameters of GetChatSession  GetChatSessionRequest
     * @return GetChatSessionResponse
     */
    CompletableFuture<GetChatSessionResponse> getChatSession(GetChatSessionRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the full schema YAML by merging the active schema with the current user\&quot;s draft via OpenAPI (personal token only).
     *     Business orchestration:
     *     1. Draft domain identity verification (personal token only. Deploy/system-level tokens are rejected)
     *        and semantic view permission verification.
     *     2. If no personal draft exists, the full active YAML is returned (underlying short path).
     *        If a draft exists, the merged full YAML is returned for editor rendering and pre-publish preview.
     *     Error codes:
     *     - ERR.User.TokenUserOnly: Personal drafts support only user tokens.
     *     - ERR.GraphSchema.*: The knowledge graph does not exist.</p>
     * 
     * @param request the request parameters of GetGraphDraftAssembled  GetGraphDraftAssembledRequest
     * @return GetGraphDraftAssembledResponse
     */
    CompletableFuture<GetGraphDraftAssembledResponse> getGraphDraftAssembled(GetGraphDraftAssembledRequest request);

    /**
     * <b>description</b> :
     * <p>Reads the active schema_content and securely trims it based on the token user\&quot;s semantic resource READ permissions.</p>
     * 
     * @param request the request parameters of GetGraphSchema  GetGraphSchemaRequest
     * @return GetGraphSchemaResponse
     */
    CompletableFuture<GetGraphSchemaResponse> getGraphSchema(GetGraphSchemaRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the complete active schema of a graph from the OpenAPI management perspective. This operation does not perform resource-level permission trimming, but requires semantic view permission at the entry point.
     * graphStatus and hasDraft reflect the personal draft and publish status from the current caller\&quot;s perspective. Deployment or system-level tokens have no personal identity, so hasDraft is always false.
     * Error codes:</p>
     * <ul>
     * <li>ERR.GraphSchema.GraphSchemaNotFound: The graph does not exist.</li>
     * </ul>
     * 
     * @param request the request parameters of GetGraphSchemaDetail  GetGraphSchemaDetailRequest
     * @return GetGraphSchemaDetailResponse
     */
    CompletableFuture<GetGraphSchemaDetailResponse> getGraphSchemaDetail(GetGraphSchemaDetailRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API operation queries the expiration time of the most recently created standard package instance for a specified tenant.</li>
     * <li>If no standard package instance is found, the <code>found</code> field returns <code>False</code>.</li>
     * <li>You can use the <code>tenantId</code> parameter to specify the tenant ID. By default, the tenant ID of the caller is used.</li>
     * <li>The request method is POST and must be called over HTTPS.</li>
     * <li>Valid authentication information (such as AK, BearerToken, or APP) is required to complete the request.</li>
     * </ul>
     * 
     * @param request the request parameters of GetInstanceExpireTime  GetInstanceExpireTimeRequest
     * @return GetInstanceExpireTimeResponse
     */
    CompletableFuture<GetInstanceExpireTimeResponse> getInstanceExpireTime(GetInstanceExpireTimeRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API operation retrieves the details of a specific knowledge item in the enterprise knowledge base.</li>
     * <li>Calling this operation requires the <code>DEVELOPMENT_KB_VIEW</code> feature permission.</li>
     * <li>Knowledge details include but are not limited to the knowledge type, name, and description.</li>
     * <li>The <code>sourceId</code> parameter is required to identify the knowledge item to query.</li>
     * <li><code>tenantId</code> is an optional parameter. The tenant ID of the caller is used by default.</li>
     * <li>Authentication is supported through <code>AK</code>, <code>BearerToken</code>, or <code>APP</code> methods.</li>
     * <li>Security constraint: <code>tenant_id</code> and <code>user_id</code> can only be derived from the authenticated identity.</li>
     * </ul>
     * 
     * @param request the request parameters of GetKnowledgeBaseSource  GetKnowledgeBaseSourceRequest
     * @return GetKnowledgeBaseSourceResponse
     */
    CompletableFuture<GetKnowledgeBaseSourceResponse> getKnowledgeBaseSource(GetKnowledgeBaseSourceRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation uploads a file to an enterprise knowledge base.</li>
     * <li>You must have the <code>DEVELOPMENT_KB_MANAGE</code> permission to call this API operation.</li>
     * <li>You must provide the OSS persistent address (<code>filePath</code>) of the file when uploading.</li>
     * <li>Optional parameters include the public access URL and original file name to enhance the completeness of file information.</li>
     * <li>If <code>directoryId</code> is specified, the file is placed in the corresponding enterprise knowledge base directory. Otherwise, the file is bound to the default root directory of the current digital employee.</li>
     * <li>You can add tags to the resource by using <code>sourceTags</code> for subsequent management and retrieval.</li>
     * <li>This operation initiates a billing item (UNSTRUCTURED_PARSE). Make sure your account balance is sufficient.</li>
     * </ul>
     * 
     * @param request the request parameters of GetScheduledTaskExecutionDetail  GetScheduledTaskExecutionDetailRequest
     * @return GetScheduledTaskExecutionDetailResponse
     */
    CompletableFuture<GetScheduledTaskExecutionDetailResponse> getScheduledTaskExecutionDetail(GetScheduledTaskExecutionDetailRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation uploads files to an enterprise knowledge base.</li>
     * <li>You must have the <code>DEVELOPMENT_KB_MANAGE</code> feature permission to call this operation.</li>
     * <li>You must provide the OSS persistent address (<code>filePath</code>) of the file when uploading.</li>
     * <li>Optional parameters include the public access URL and original file name to enhance the completeness of file information.</li>
     * <li>If <code>directoryId</code> is specified, the file is placed in the corresponding enterprise knowledge base folder. Otherwise, the file is bound to the default root folder of the current digital employee.</li>
     * <li>You can add tags to resources by using <code>sourceTags</code> for subsequent management and retrieval.</li>
     * <li>This operation initiates a billing item (UNSTRUCTURED_PARSE). Make sure that your account balance is sufficient.</li>
     * </ul>
     * 
     * @param request the request parameters of GetScheduledTaskExecutionRecords  GetScheduledTaskExecutionRecordsRequest
     * @return GetScheduledTaskExecutionRecordsResponse
     */
    CompletableFuture<GetScheduledTaskExecutionRecordsResponse> getScheduledTaskExecutionRecords(GetScheduledTaskExecutionRecordsRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the channels and methods available to the current user for scheduled task push notifications.</p>
     * 
     * @param request the request parameters of GetScheduledTaskPushOptions  GetScheduledTaskPushOptionsRequest
     * @return GetScheduledTaskPushOptionsResponse
     */
    CompletableFuture<GetScheduledTaskPushOptionsResponse> getScheduledTaskPushOptions(GetScheduledTaskPushOptionsRequest request);

    /**
     * @deprecated OpenAPI GetScheduledTaskUnderstandDetail is deprecated  * @description ## Request description
     * - This operation uploads a file to the enterprise knowledge base.
     * - You must have the `DEVELOPMENT_KB_MANAGE` permission to call this operation.
     * - You must provide the OSS persistent address (`filePath`) of the file when uploading.
     * - Optional parameters include the public access URL and original file name of the file to enhance the completeness of file information.
     * - If `directoryId` is specified, the file is placed in the corresponding enterprise knowledge base directory. Otherwise, the file is bound to the default root directory of the current digital employee by default.
     * - You can add tags to the resource by using `sourceTags` for subsequent management and retrieval.
     * - This operation initiates a billing item (UNSTRUCTURED_PARSE). Make sure that your account balance is sufficient.
     * 
     * @param request the request parameters of GetScheduledTaskUnderstandDetail  GetScheduledTaskUnderstandDetailRequest
     * @return GetScheduledTaskUnderstandDetailResponse
     */
    @Deprecated
    CompletableFuture<GetScheduledTaskUnderstandDetailResponse> getScheduledTaskUnderstandDetail(GetScheduledTaskUnderstandDetailRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Queries skill details by SkillCode or SkillName, including metadata, input parameter schema, and SKILL.md summary.</p>
     * <ul>
     * <li><strong>TenantId</strong>: Optional common parameter passed through by the gateway to the backend header. If not specified, the default tenant of the current caller is used.</li>
     * <li><strong>SkillCode</strong>: Mutually exclusive with SkillName. If both are specified, SkillCode takes precedence.</li>
     * <li><strong>SkillName</strong>: Mutually exclusive with SkillCode. If the name is not unique within the tenant, <code>ERR.SkillHub.SkillNameAmbiguous</code> is returned.</li>
     * <li><strong>ViewMode</strong>: Optional. Valid values: <code>draft</code> (draft/editing view) or <code>published</code> (published view, default).</li>
     * <li><strong>IncludeSkillFiles</strong>: Optional. Specifies whether to return the complete skill file tree (SKILL.md / scripts / templates). Default value: <code>false</code>.</li>
     * </ul>
     * 
     * @param request the request parameters of GetSkill  GetSkillRequest
     * @return GetSkillResponse
     */
    CompletableFuture<GetSkillResponse> getSkill(GetSkillRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Queries the current status and result of an asynchronous task by <code>RunId</code>.</p>
     * <ul>
     * <li><strong>State machine</strong>: Running (PENDING/RUNNING) → Succeeded / Failed / Cancelled</li>
     * <li><strong>TenantId</strong>: An optional common parameter passed through by the gateway. The backend verifies that the RunId belongs to the current tenant. Otherwise, <code>ERR.SkillHub.RunNotFound</code> is returned to avoid exposing existence information.</li>
     * <li><strong>IncludeLogs</strong>: Optional. Specifies whether to return execution logs. Default value: <code>false</code>.
     * When execution succeeds, <code>Result.Content[]</code> is an MCP-style Content block array (Text / File / Image).</li>
     * </ul>
     * 
     * @param request the request parameters of GetSkillRun  GetSkillRunRequest
     * @return GetSkillRunResponse
     */
    CompletableFuture<GetSkillRunResponse> getSkillRun(GetSkillRunRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li><code>tenant_id</code> is derived from the authenticated identity only. Any value passed in the body is ignored.</li>
     * <li>Response parameters do not expose audit fields such as <code>creator</code> or <code>modifier</code>. The <code>unstructured_docs[ ].content</code> field is not returned by default to avoid large responses.</li>
     * <li>Set the <code>includeDetails</code> parameter to <code>True</code> to retrieve additional details including <code>settings</code>, <code>notes</code>, <code>structuredTables</code>, and <code>unstructuredDocs</code>.</li>
     * </ul>
     * 
     * @param request the request parameters of GetSource  GetSourceRequest
     * @return GetSourceResponse
     */
    CompletableFuture<GetSourceResponse> getSource(GetSourceRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This API allows callers to obtain a signed URL for directly uploading files to Alibaba Cloud Object Storage Service (OSS) based on the provided file name and other information. With this URL, users can upload files directly to the specified OSS location without routing through an intermediate server, which improves efficiency and security.</p>
     * <ul>
     * <li><strong>Security constraint</strong>: <code>tenant_id</code>/<code>user_id</code> are derived only from the authenticated identity. Values provided in the request body are ignored.</li>
     * <li><strong>Default value</strong>: If the <code>expires</code> parameter is not specified, the default expiration time is 3600 seconds (1 hour).</li>
     * <li><strong>Content-Type</strong>: If <code>contentType</code> is not provided, the system attempts to automatically infer the file type.</li>
     * <li><strong>Scope</strong>: The <code>scope</code> parameter defines whether the data source belongs to a personal or enterprise knowledge base. In most cases, this does not need to be set.</li>
     * </ul>
     * 
     * @param request the request parameters of GetSourceUploadSignature  GetSourceUploadSignatureRequest
     * @return GetSourceUploadSignatureResponse
     */
    CompletableFuture<GetSourceUploadSignatureResponse> getSourceUploadSignature(GetSourceUploadSignatureRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the INSTANCE token for a user and ensures that it is in an active state (idempotent).
     *     Business logic:
     *     1. Obtains user_id from identity (caller_type=user is enforced).
     *     2. Constructs an AuthContext and delegates permission verification to UserTokenAuthorizedService.
     *     3. Calls ensure_active_token:
     *        - If an ACTIVE token exists, returns the token in plaintext as-is (no reset, no key rotation).
     *        - If an INACTIVE token exists, automatically re-enables it and returns the plaintext.
     *        - If no token exists (or only expired RESET records exist), creates a new token and returns the plaintext.
     *     Difference from EnableToken: When an ACTIVE token already exists, EnableToken returns only the masked value. This operation guarantees that a usable plaintext credential is returned without destroying the existing token.</p>
     * 
     * @param request the request parameters of GetTokenEnsureEnable  GetTokenEnsureEnableRequest
     * @return GetTokenEnsureEnableResponse
     */
    CompletableFuture<GetTokenEnsureEnableResponse> getTokenEnsureEnable(GetTokenEnsureEnableRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the INSTANCE token status of a user.
     *     Business logic:
     *     1. Retrieves user_id from identity (caller_type=user is required).
     *     2. Constructs an AuthContext and delegates permission verification to UserTokenAuthorizedService.
     *     3. Queries the ACTIVE INSTANCE token.
     *     4. If the token exists, returns enabled=True with the masked value and creation time.
     *     5. If the token does not exist, returns enabled=False.</p>
     * 
     * @param request the request parameters of GetTokenInfo  GetTokenInfoRequest
     * @return GetTokenInfoResponse
     */
    CompletableFuture<GetTokenInfoResponse> getTokenInfo(GetTokenInfoRequest request);

    /**
     * <b>description</b> :
     * <p>Queries user details through OpenAPI.
     *     Business orchestration:
     *     1. Locate the user by wnUserId or accountId.
     *     2. Query the user mapping information in the current tenant (status, join time, and last logon time).
     *     3. Query the role list of the user in the current tenant.
     *     4. Query the user group list of the user in the current tenant.
     *     5. Assemble the response.
     *     Error codes:
     *     - ERR.User.NotFound: The user does not exist.
     *     - ERR.User.NotInTenant: The user does not belong to the current tenant.</p>
     * 
     * @param request the request parameters of GetUser  GetUserRequest
     * @return GetUserResponse
     */
    CompletableFuture<GetUserResponse> getUser(GetUserRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API is used to retrieve the credit usage details of the current logged-on user, including the credit limit, consumed credits, and remaining credits.</li>
     * <li>Data is sourced from a real-time Redis cache, ensuring information immediacy.</li>
     * <li>You can specify a tenant ID to query the credit usage of a user under a specific tenant. By default, the caller\&quot;s default tenant is used.</li>
     * <li>You can optionally provide a <code>RequestId</code> as a request identifier, but this is not required.</li>
     * </ul>
     * 
     * @param request the request parameters of GetUserCreditUsage  GetUserCreditUsageRequest
     * @return GetUserCreditUsageResponse
     */
    CompletableFuture<GetUserCreditUsageResponse> getUserCreditUsage(GetUserCreditUsageRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation retrieves the details of a specified user group, including the basic information of the user group, parent user group information, direct child user group list, and direct member list.</li>
     * <li><code>userGroupId</code> is a required parameter that must be provided in the request body.</li>
     * <li><code>tenantId</code> is an optional parameter that can be passed through the query string.</li>
     * <li>The operation supports multiple authentication methods, including AK, BearerToken, and APP authentication.</li>
     * <li>The content type for both requests and responses is <code>application/json</code>.</li>
     * <li>Ensure that you have the required permissions (such as <code>winnexo:GetUserGroup</code>) before calling this operation.</li>
     * </ul>
     * 
     * @param request the request parameters of GetUserGroup  GetUserGroupRequest
     * @return GetUserGroupResponse
     */
    CompletableFuture<GetUserGroupResponse> getUserGroup(GetUserGroupRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation returns the detailed information of the current authenticated user.</li>
     * <li>If the tenant information is invalid, the corresponding error message is returned.</li>
     * <li>tenantId is an optional parameter. If not provided, the default tenant ID of the caller is used.</li>
     * <li>Multiple authentication methods are supported: AccessKey, BearerToken, and APP authentication.</li>
     * <li>The returned data includes the user profile (such as username and profile picture URL), role preference settings, and details of all tenants to which the user belongs.</li>
     * <li>Note that if the current logon tenant is a system tenant (tenantId=10000), this is explicitly indicated in the response.</li>
     * </ul>
     * 
     * @param request the request parameters of GetUserInfo  GetUserInfoRequest
     * @return GetUserInfoResponse
     */
    CompletableFuture<GetUserInfoResponse> getUserInfo(GetUserInfoRequest request);

    /**
     * <b>description</b> :
     * <p>Grants authorization to authorized users or user groups to use a specified digital human.
     *     Business logic:
     *     1. Constructs an AuthContext from identity.
     *     2. Performs mutual exclusion validation on the request body: specify either userIds or userGroupIds.
     *     3. Delegates to AgentAuthorizationAuthorizedService.grant_authorization to execute.
     *     4. Pre-validation: verifies MANAGE permission and agent existence (performed at the AuthorizedService layer, which performs authentication first before it exposes existence).
     *     5. Existing authorization records are updated (expire_date / permissions).</p>
     * 
     * @param request the request parameters of GrantAgentUsers  GrantAgentUsersRequest
     * @return GrantAgentUsersResponse
     */
    CompletableFuture<GrantAgentUsersResponse> grantAgentUsers(GrantAgentUsersRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Performs a paging query for published platform announcements that are effective within the current database time window. The caller must be a real user in the system O&amp;M tenant who has the permission to view announcements.</p>
     * 
     * @param request the request parameters of ListActiveAnnouncements  ListActiveAnnouncementsRequest
     * @return ListActiveAnnouncementsResponse
     */
    CompletableFuture<ListActiveAnnouncementsResponse> listActiveAnnouncements(ListActiveAnnouncementsRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API supports two modes: when <code>directoryId</code> is empty or set to \&quot;root\&quot;, the top-level knowledge base list is returned. When <code>directoryId</code> has a specific value, a drill-down operation is performed to return subdirectories and resources under the specified directory.</li>
     * <li><code>tenantId</code> is a common parameter. If not provided, the tenant ID of the caller is used by default.</li>
     * <li>In drill-down mode (when <code>directoryId</code> is not empty), use the <code>sourceTypes</code> parameter to filter resources of specific types.</li>
     * <li>The sort field (<code>sortField</code>) and sort order (<code>sortOrder</code>) can be customized. Invalid values are reset to default settings.</li>
     * <li>The search feature is effective only when retrieving the top-level list and supports only fuzzy matching on names or descriptions.</li>
     * <li>For security purposes, <code>tenant_id</code> is strictly obtained from the authenticated identity and cannot be passed through the request body.</li>
     * </ul>
     * 
     * @param request the request parameters of ListAdminKnowledgeBases  ListAdminKnowledgeBasesRequest
     * @return ListAdminKnowledgeBasesResponse
     */
    CompletableFuture<ListAdminKnowledgeBasesResponse> listAdminKnowledgeBases(ListAdminKnowledgeBasesRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the full list of digital employees under a tenant, including deactivated ones.
     *     Business logic:
     *     1. Constructs an AuthContext from the identity.
     *     2. Delegates to AgentAuthorizationAuthorizedService.list_agents to perform permission verification (APPLICATION_AGENT_VIEW).
     *     3. Returns rich fields for all digital employees of the tenant (operatingObjectName, displayName, authMode, and isActive).
     *     4. System-level tokens are automatically allowed through ctx.skip_permission.
     *     Difference from listAuthorizedAgents: This operation returns all digital employees of the tenant (including deactivated ones, without authorization filtering) and includes rich fields such as displayName and isActive for management console display.</p>
     * 
     * @param request the request parameters of ListAgents  ListAgentsRequest
     * @return ListAgentsResponse
     */
    CompletableFuture<ListAgentsResponse> listAgents(ListAgentsRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation is exclusively for the Winnexo lightweight workbench.</li>
     * <li>Uses the existing time, direction, and pageSize time-watermark protocol to read messages from a specified group chat.</li>
     * <li>Does not introduce start or end time ranges. The response does not include raw DWS objects, attachment locators, or temporary download URLs.</li>
     * </ul>
     * 
     * @param request the request parameters of ListAliDingGroupMessages  ListAliDingGroupMessagesRequest
     * @return ListAliDingGroupMessagesResponse
     */
    CompletableFuture<ListAliDingGroupMessagesResponse> listAliDingGroupMessages(ListAliDingGroupMessagesRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation is exclusively for the Winnexo lightweight workbench.</li>
     * <li>Queries DingTalk meeting transcripts that the current platform user has access to, based on the startTime and endTime provided by the caller.</li>
     * <li>The time must include a time zone. This operation does not use recentDays and does not determine the time range on behalf of the caller.</li>
     * </ul>
     * 
     * @param request the request parameters of ListAliDingMinutes  ListAliDingMinutesRequest
     * @return ListAliDingMinutesResponse
     */
    CompletableFuture<ListAliDingMinutesResponse> listAliDingMinutes(ListAliDingMinutesRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the list of digital human names for which the current caller (or a specified target user) has specified permissions (USE/MANAGE).
     *     Business logic:
     *     1. Constructs an AuthContext from the identity.
     *     2. Delegates to AgentAuthorizationAuthorizedService.list_authorized_agents to execute the query.
     *     3. When skip_permission=True, returns all active agents for the tenant.
     *     4. Regular users are filtered based on authorization records and auth_mode.
     *     5. When targetUserId is specified (querying on behalf of another user), the APPLICATION_AGENT_VIEW gate is required, and the query is restricted to the current tenant. If the target user is not a member of the current tenant, a USER_NOT_IN_TENANT error is thrown (an empty list is not silently returned).</p>
     * 
     * @param request the request parameters of ListAuthorizedAgents  ListAuthorizedAgentsRequest
     * @return ListAuthorizedAgentsResponse
     */
    CompletableFuture<ListAuthorizedAgentsResponse> listAuthorizedAgents(ListAuthorizedAgentsRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the list of authorized users or user groups for a specified digital employee.
     *     Business logic:
     *     1. Constructs an AuthContext from the identity.
     *     2. Delegates to AgentAuthorizationAuthorizedService.list_authorized_users to execute the query.
     *     3. Permission verification is performed at the AuthorizedService layer by @require_permission(APPLICATION_AGENT_VIEW).
     *     4. When auth_mode=ALL_USERS, only records with MANAGE permissions are displayed.</p>
     * 
     * @param request the request parameters of ListAuthorizedUsers  ListAuthorizedUsersRequest
     * @return ListAuthorizedUsersResponse
     */
    CompletableFuture<ListAuthorizedUsersResponse> listAuthorizedUsers(ListAuthorizedUsersRequest request);

    /**
     * <b>description</b> :
     * <p>Enumerates all available organization synchronization configurations under the current tenant.
     *     Returns a unified configs list covering four platform types:
     *     - <strong>wecom</strong>: Retrieves active WeCom SSO configurations from SsoProviderRegistry.
     *     - <strong>saml</strong>: Retrieves active SAML SSO configurations from SsoProviderRegistry. The corpId is set to idpEntityId.
     *     - <strong>oauth2</strong>: Retrieves active OAuth2 SSO configurations from SsoProviderRegistry. The corpId is set to clientId.
     *     - <strong>custom</strong>: Queries the database for pure custom organizations registered under the tenant.
     *     The client distinguishes processing logic based on the returned platformType. The corpId is a required parameter for subsequent synchronization operations.</p>
     * 
     * @param request the request parameters of ListAvailableConfigs  ListAvailableConfigsRequest
     * @return ListAvailableConfigsResponse
     */
    CompletableFuture<ListAvailableConfigsResponse> listAvailableConfigs(ListAvailableConfigsRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation queries the bill list based on specified conditions.</li>
     * <li>Filtering is supported by tenant, user, operation type, status, time range, business source, and other conditions.</li>
     * <li>Bill data is returned in pages. By default, 20 records are displayed per page.</li>
     * <li>You can choose whether to filter out bills with zero credit consumption. By default, such bills are filtered out.</li>
     * <li>Provide the required authentication information (such as AccessKey pair, BearerToken, or APP authentication) when you send a request.</li>
     * </ul>
     * 
     * @param request the request parameters of ListBilling  ListBillingRequest
     * @return ListBillingResponse
     */
    CompletableFuture<ListBillingResponse> listBilling(ListBillingRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API supports filtering and sorting by multiple parameters, including tenant ID, page size, pagination token, keyword search, digital employee name, and update time range.</li>
     * <li>By default, results are sorted in descending order by the <code>UpdatedAt</code> field.</li>
     * <li>If an invalid <code>NextToken</code> is provided or <code>PageSize</code> exceeds the allowed range (1-100), the API returns a 400 error.</li>
     * </ul>
     * 
     * @param request the request parameters of ListChatSessions  ListChatSessionsRequest
     * @return ListChatSessionsResponse
     */
    CompletableFuture<ListChatSessionsResponse> listChatSessions(ListChatSessionsRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the list of personal draft changes for the current user under a specified graph (personal token only).
     *     Business orchestration:
     *     1. Draft domain identity verification (personal token only. Deployment/system-level tokens are rejected)
     *        and semantic view permission verification.
     *     2. Returns the active drafts of the current user (with online change risks).
     *        In permission revocation scenarios, the system also cleans up unauthorized drafts (existing behavior).
     *     Online risk aggregation (riskCode / riskMessage) is serialized as risk JSON text.
     *     Error codes:
     *     - ERR.User.TokenUserOnly: Personal drafts support only user tokens.
     *     - ERR.GraphSchema.*: The graph does not exist.</p>
     * 
     * @param request the request parameters of ListGraphDraftResources  ListGraphDraftResourcesRequest
     * @return ListGraphDraftResourcesResponse
     */
    CompletableFuture<ListGraphDraftResourcesResponse> listGraphDraftResources(ListGraphDraftResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>OpenAPI 管理视角图谱列表（含草稿/发布中状态）。
     *     返回租户级 active 图谱；graphStatus 三态：PUBLISHED / DEVELOPING（当前用户有活动草稿）/
     *     PUBLISHING（当前用户发布中）；部署/系统级 Token 无个人身份，hasDraft 恒 false。
     *     keyword 匹配 graphName / displayName（忽略大小写）；semanticTags 命中任一标签即保留。</p>
     * 
     * @param request the request parameters of ListGraphSchemas  ListGraphSchemasRequest
     * @return ListGraphSchemasResponse
     */
    CompletableFuture<ListGraphSchemasResponse> listGraphSchemas(ListGraphSchemasRequest request);

    /**
     * <b>description</b> :
     * <p>Lists published knowledge graphs under an identity tenant.
     *     CLI mapping: <code>winnexo graph list</code>. <code>tenantId</code> is a required common parameter and is not included in the request body.
     *     The returned <code>graphName</code> can be used directly in <code>querySemanticKnowledge</code>. This query is consistent with the existing frontend knowledge graph list and does not apply digital worker permission filtering. Specific semantic queries still verify agent USE permissions.
     *     Database exceptions go directly into unified 5xx error handling and are not disguised as a successful empty list.</p>
     * 
     * @param request the request parameters of ListGraphs  ListGraphsRequest
     * @return ListGraphsResponse
     */
    CompletableFuture<ListGraphsResponse> listGraphs(ListGraphsRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API retrieves the category list (subdirectory tree) of an enterprise knowledge base. You must have the knowledge base view permission.</li>
     * <li>If the <code>directoryId</code> parameter is not provided, the API returns all category trees under the root directory of the enterprise knowledge base. If <code>directoryId</code> is provided, the API returns the subdirectory tree rooted at the specified directory.</li>
     * <li>You can sort results by using the <code>sortField</code> and <code>sortOrder</code> parameters. By default, results are sorted by creation time in descending order.</li>
     * <li>Security constraints: <code>tenant_id</code> and <code>user_id</code> are derived only from the authenticated identity, and the caller must have the <code>DEVELOPMENT_KB_VIEW</code> feature permission.</li>
     * </ul>
     * 
     * @param request the request parameters of ListKnowledgeBaseDirectories  ListKnowledgeBaseDirectoriesRequest
     * @return ListKnowledgeBaseDirectoriesResponse
     */
    CompletableFuture<ListKnowledgeBaseDirectoriesResponse> listKnowledgeBaseDirectories(ListKnowledgeBaseDirectoriesRequest request);

    /**
     * <b>description</b> :
     * <p>Queries follows by three independent dimensions: graphName, operatingObjectName, and objectType. Supports primary objects and explicit first-level associated objects. Uses opaque cursor pagination and is not limited by the 1000-item display window of the follow panel.</p>
     * 
     * @param request the request parameters of ListOperatingObjectFavorites  ListOperatingObjectFavoritesRequest
     * @return ListOperatingObjectFavoritesResponse
     */
    CompletableFuture<ListOperatingObjectFavoritesResponse> listOperatingObjectFavorites(ListOperatingObjectFavoritesRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API operation queries the output list of the current logged-in user.</li>
     * <li><code>tenantId</code> is a common parameter. If not specified, the default tenant of the caller is used.</li>
     * <li>Supports filtering by parameters such as <code>operatingObjectName</code>, <code>itemType</code>, and <code>keyword</code>.</li>
     * <li>Set <code>sharedOnly</code> to <code>true</code> to display only outputs with sharing enabled.</li>
     * <li>Pagination is controlled by <code>page</code> (page number) and <code>pageSize</code> (number of items per page). By default, results start from page 1 with 20 records per page.</li>
     * <li>Results are sorted by update time in descending order by default.</li>
     * <li>The <code>tenant_id</code> or <code>user_id</code> passed in the request body by the caller is ignored. This information is derived only from the authenticated identity.</li>
     * </ul>
     * 
     * @param request the request parameters of ListOutputFiles  ListOutputFilesRequest
     * @return ListOutputFilesResponse
     */
    CompletableFuture<ListOutputFilesResponse> listOutputFiles(ListOutputFilesRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API is used to drill down and query the subdirectories and resources under the &quot;My Resources&quot; directory.</li>
     * <li>When <code>directoryId</code> is set to \&quot;root\&quot;, the service automatically resolves and returns the content under the current digital employee\&quot;s default root directory. If a specific directory ID is provided, the subdirectories and resources under that directory are returned.</li>
     * <li>Security constraint: <code>tenant_id</code> and <code>user_id</code> can only come from the authenticated identity information. These fields provided by the caller in the request body are ignored.</li>
     * <li>You can use the <code>sourceTypes</code> parameter to filter resources of specific types. When this parameter has a value, only resources that match the type condition are returned, and subdirectories are not included.</li>
     * <li>Sorting is supported by name (<code>name</code>), creation time (<code>gmt_create</code>), or modification time (<code>gmt_modified</code>) in ascending or descending order.</li>
     * <li>The pagination feature allows you to customize the number of items displayed per page (maximum 100) and the current page number.</li>
     * </ul>
     * 
     * @param request the request parameters of ListPersonalDirectoryContents  ListPersonalDirectoryContentsRequest
     * @return ListPersonalDirectoryContentsResponse
     */
    CompletableFuture<ListPersonalDirectoryContentsResponse> listPersonalDirectoryContents(ListPersonalDirectoryContentsRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the list of system built-in roles.
     *     Business logic:
     *     1. Constructs AuthContext from identity.
     *     2. Delegates to UserManagementAuthorizedService.list_system_roles for permission verification (PLATFORM_USER_VIEW).
     *     3. Renders role names and descriptions based on the request Accept-Language header.
     *     4. Returns a fixed set of 7 system built-in roles.
     *     The returned roleCode field can be directly used as the roleCodes parameter for createUser or updateUser.</p>
     * 
     * @param request the request parameters of ListRoles  ListRolesRequest
     * @return ListRolesResponse
     */
    CompletableFuture<ListRolesResponse> listRoles(ListRolesRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation uploads a file to an enterprise knowledge base.</li>
     * <li>The DEVELOPMENT_KB_MANAGE permission is required to call this operation.</li>
     * <li>You must provide the OSS persistent address (<code>filePath</code>) of the file when uploading.</li>
     * <li>Optional parameters include the public access URL and original file name to enhance the completeness of file information.</li>
     * <li>If <code>directoryId</code> is specified, the file is placed in the corresponding enterprise knowledge base directory. Otherwise, the file is bound to the default root directory of the current digital employee.</li>
     * <li>You can add tags to the resource by using <code>sourceTags</code> for subsequent management and retrieval.</li>
     * <li>This operation initiates a billing item (UNSTRUCTURED_PARSE). Make sure your account balance is sufficient.</li>
     * </ul>
     * 
     * @param request the request parameters of ListScheduledTasks  ListScheduledTasksRequest
     * @return ListScheduledTasksResponse
     */
    CompletableFuture<ListScheduledTasksResponse> listScheduledTasks(ListScheduledTasksRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This API retrieves all visible skills under the current tenant. It supports filtering by digital employee binding relationship, skill source, tags, keywords, and other conditions, and supports pagination.</p>
     * <h3>Request parameters</h3>
     * <ul>
     * <li><strong>TenantId</strong>: Optional. A common parameter passed through by the gateway to the backend header. If not specified, the default tenant of the current caller is used.</li>
     * <li><strong>FilterType</strong>: Optional. The skill filtering dimension. Valid values: <code>ALL</code> (all published), <code>BUILTIN</code> (built-in published), <code>CUSTOM</code> (custom published), <code>DRAFT</code> (drafts, including published skills with unpublished modifications). Default value: <code>ALL</code>.</li>
     * <li><strong>Tags</strong>: Optional. Filters by tags. A match is returned if any tag in the array is hit.</li>
     * <li><strong>Keyword</strong>: Optional. Performs a fuzzy match on the skill name or description.</li>
     * <li><strong>Page</strong>: Optional. The page number. Minimum value: 1. Default value: 1.</li>
     * <li><strong>PageSize</strong>: Optional. The number of entries per page. Valid values: 1 to 100. Default value: 20.</li>
     * <li><strong>OperatingObjectName</strong>: Optional. The name of the digital employee. If specified, results are filtered by binding relationship. Must be used together with <code>BindStatus</code>.</li>
     * <li><strong>BindStatus</strong>: Optional. The binding status. Valid values: <code>BOUND</code> (bound), <code>UNBOUND</code> (unbound global skills).</li>
     * </ul>
     * <h3>Response parameters</h3>
     * <p>The response contains the skill list <code>items</code>, the total count <code>total</code>, the current page <code>page</code>, and the number of entries per page <code>pageSize</code>.</p>
     * 
     * @param request the request parameters of ListSkills  ListSkillsRequest
     * @return ListSkillsResponse
     */
    CompletableFuture<ListSkillsResponse> listSkills(ListSkillsRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API is used to perform a paging query on the folder content and resources in an enterprise knowledge base.</li>
     * <li>Multiple parameters are supported for filtering and sorting, such as <code>directoryId</code>, <code>page</code>, <code>pageSize</code>, <code>sortField</code>, <code>sortOrder</code>, and others.</li>
     * <li>The <code>sourceTypes</code> parameter allows you to filter by resource type. Separate multiple types with commas.</li>
     * <li>When <code>directoryId</code> is not specified or set to <code>root</code>, the root folder list of the knowledge base is queried by default.</li>
     * <li>The default sort field is <code>name</code>, and the default sort order is ascending (<code>asc</code>).</li>
     * </ul>
     * 
     * @param request the request parameters of ListTenantDirectory  ListTenantDirectoryRequest
     * @return ListTenantDirectoryResponse
     */
    CompletableFuture<ListTenantDirectoryResponse> listTenantDirectory(ListTenantDirectoryRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This API is used to query the complete user group hierarchy under a specified tenant, including the basic information of each user group and its direct child user group list. Use the <code>tenantId</code> parameter to specify the tenant ID to query. If this parameter is not provided, the caller\&quot;s tenant ID is used by default.</p>
     * <h3>Precautions</h3>
     * <ul>
     * <li>This operation returns only the direct member count and direct child user group count. It does not include information about indirect members or child groups.</li>
     * <li>The external synchronization status field is empty when data is normal. It is populated with relevant information only when data is out of sync between an external system (such as WeCom) and the internal system.</li>
     * </ul>
     * 
     * @param request the request parameters of ListUserGroups  ListUserGroupsRequest
     * @return ListUserGroupsResponse
     */
    CompletableFuture<ListUserGroupsResponse> listUserGroups(ListUserGroupsRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation returns subdirectories and READY resources under the specified directory based on the enterprise knowledge base frontend scope.</li>
     * <li>The user identity and directory visibility scope are derived from the OpenAPI authentication context.</li>
     * <li>When <code>sourceTypes</code> has a value, only resources are returned. <code>keyword</code> searches only the current directory level.</li>
     * </ul>
     * 
     * @param request the request parameters of ListUserVisibleKnowledgeBaseContents  ListUserVisibleKnowledgeBaseContentsRequest
     * @return ListUserVisibleKnowledgeBaseContentsResponse
     */
    CompletableFuture<ListUserVisibleKnowledgeBaseContentsResponse> listUserVisibleKnowledgeBaseContents(ListUserVisibleKnowledgeBaseContentsRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation queries the enterprise knowledge bases visible to the platform user mapped from the OpenAPI authentication identity.</li>
     * <li>Both the tenant and user identities are determined by the authentication context. Callers cannot expand the visible scope through business parameters.</li>
     * <li><code>tenantId</code> is an optional common parameter. <code>keyword</code> can filter by knowledge base name or description.</li>
     * </ul>
     * 
     * @param request the request parameters of ListUserVisibleKnowledgeBases  ListUserVisibleKnowledgeBasesRequest
     * @return ListUserVisibleKnowledgeBasesResponse
     */
    CompletableFuture<ListUserVisibleKnowledgeBasesResponse> listUserVisibleKnowledgeBases(ListUserVisibleKnowledgeBasesRequest request);

    /**
     * <b>description</b> :
     * <p>Queries a paged list of tenant members by using OpenAPI.
     *     Business orchestration:
     *     1. Parse filter conditions (roleCodes → role_ids).
     *     2. Call UserTenantMappingRepository.query_paged_tenant_members to perform a paged query.
     *     3. Convert role_id in the results to roleCode and assemble the response.
     *     Error codes:
     *     - An error is thrown when an invalid roleCode parameter is specified.</p>
     * 
     * @param request the request parameters of ListUsers  ListUsersRequest
     * @return ListUsersResponse
     */
    CompletableFuture<ListUsersResponse> listUsers(ListUsersRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation queries all subdirectories and resources under a specified knowledge base directory for a specific digital employee.</li>
     * <li>The user must have the USE permission on the target digital employee, and the digital employee must have access to the directory and its subdirectories specified in the request.</li>
     * <li>You must provide the digital employee name (<code>operatingObjectName</code>) and the directory ID (<code>directoryId</code>) to query. Other parameters such as pagination information and sorting method are optional.</li>
     * <li>The response includes the list of subdirectories and resources under the directory, and supports pagination.</li>
     * <li>The <code>sourceStatus</code> field filters only resources in the <code>READY</code> state.</li>
     * <li>For security purposes, <code>tenant_id</code> and <code>user_id</code> are obtained only from the authenticated identity. Values passed in the request body by the caller are ignored.</li>
     * </ul>
     * 
     * @param request the request parameters of ListVisibleKnowledgeBaseContents  ListVisibleKnowledgeBaseContentsRequest
     * @return ListVisibleKnowledgeBaseContentsResponse
     */
    CompletableFuture<ListVisibleKnowledgeBaseContentsResponse> listVisibleKnowledgeBaseContents(ListVisibleKnowledgeBaseContentsRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API operation retrieves the list of top-level knowledge base directories visible to a specified digital employee (operating object) within the enterprise.</li>
     * </ul>
     * 
     * @param request the request parameters of ListVisibleKnowledgeBases  ListVisibleKnowledgeBasesRequest
     * @return ListVisibleKnowledgeBasesResponse
     */
    CompletableFuture<ListVisibleKnowledgeBasesResponse> listVisibleKnowledgeBases(ListVisibleKnowledgeBasesRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li><strong>Authentication flow</strong>:<ol>
     * <li>Basic authentication is performed by the root router (<code>request.state.openapi_identity</code>).</li>
     * <li>This handler checks the <code>DEVELOPMENT_KB_MANAGE</code> feature permission.</li>
     * </ol>
     * </li>
     * <li><strong>Procedure</strong>:<ol>
     * <li>Check that the source directory and target directory are not the same.</li>
     * <li>Confirm that the target directory exists.</li>
     * <li>Verify that the resource to be moved is in the source directory.</li>
     * <li>Update the directory binding of the resource.</li>
     * <li>Best-effort update of <code>source.settings[&quot;knowledge_id&quot;]</code> to the target knowledge base ID.</li>
     * <li>Best-effort notification to DocumentAgent to sync <code>knowledge_id</code> and <code>update_time</code>.</li>
     * </ol>
     * </li>
     * <li><strong>Security constraints</strong>:<ul>
     * <li><code>tenant_id</code> and <code>user_id</code> must come from the authenticated identity.</li>
     * <li>The caller must have KB management permissions.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of MoveKnowledgeBaseResource  MoveKnowledgeBaseResourceRequest
     * @return MoveKnowledgeBaseResourceResponse
     */
    CompletableFuture<MoveKnowledgeBaseResourceResponse> moveKnowledgeBaseResource(MoveKnowledgeBaseResourceRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li><strong>The source directory and target directory cannot be the same</strong>. Otherwise, the <code>ERR.Robject.UserDirectory.InvalidOperation</code> error is returned.</li>
     * <li><strong>The target directory must exist</strong>. If it does not exist, the <code>ERR.Robject.UserDirectory.DirectoryNotFound</code> error is returned.</li>
     * <li><strong>The resource to be moved must exist in the source directory</strong>. If it is not in the source directory, the <code>ERR.Robject.UserDirectory.ResourceNotInDirectory</code> error is returned.</li>
     * <li>After a successful move, the system attempts to notify DocumentAgent to update the new path (<code>source_path</code>) of the resource. This step is best-effort. Even if it fails, the overall operation success status is not affected. Only an error log is recorded.</li>
     * <li>For security purposes, the value of <code>tenant_id</code> can only be derived from the authenticated identity information.</li>
     * </ul>
     * 
     * @param request the request parameters of MoveResource  MoveResourceRequest
     * @return MoveResourceResponse
     */
    CompletableFuture<MoveResourceResponse> moveResource(MoveResourceRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Idempotently takes a platform announcement offline by announcement ID. Returns <code>changed=true</code> when a PUBLISHED announcement is taken offline for the first time. Returns <code>changed=false</code> when the announcement is already offline or expired.
     * The caller must belong to the system operations tenant and have announcement management permissions.</p>
     * 
     * @param request the request parameters of OfflineAnnouncement  OfflineAnnouncementRequest
     * @return OfflineAnnouncementResponse
     */
    CompletableFuture<OfflineAnnouncementResponse> offlineAnnouncement(OfflineAnnouncementRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation previews the content of a specified knowledge entry in an enterprise knowledge base.</li>
     * <li>The <code>DEVELOPMENT_KB_VIEW</code> permission is required to call this API.</li>
     * <li><code>sourceId</code> is a required parameter that identifies the knowledge entry to preview.</li>
     * <li>The optional parameter <code>tenantId</code> specifies the tenant ID. If not provided, the default tenant ID of the caller is used.</li>
     * <li>Multiple preview types are supported, including but not limited to images, audio, video, and text.</li>
     * </ul>
     * 
     * @param request the request parameters of PreviewKnowledgeBaseSource  PreviewKnowledgeBaseSourceRequest
     * @return PreviewKnowledgeBaseSourceResponse
     */
    CompletableFuture<PreviewKnowledgeBaseSourceResponse> previewKnowledgeBaseSource(PreviewKnowledgeBaseSourceRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation only allows a user to preview resources in their own personal directory.</li>
     * <li>The authentication process includes basic authentication and data source ownership verification to ensure that the requester can only access knowledge in their personal directory.</li>
     * <li>You must provide the unique identifier <code>sourceId</code> of the knowledge content in the request. The system queries and returns the corresponding preview information based on this ID and the user\&quot;s tenant information.</li>
     * <li>Multiple preview types are supported, such as image, audio, and video. The system returns the corresponding preview URL or direct content display based on the type.</li>
     * </ul>
     * 
     * @param request the request parameters of PreviewPersonalSource  PreviewPersonalSourceRequest
     * @return PreviewPersonalSourceResponse
     */
    CompletableFuture<PreviewPersonalSourceResponse> previewPersonalSource(PreviewPersonalSourceRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API operation queries primary object data with paging by a specified operating object name (such as <code>customer_1</code>).</li>
     * <li>You can search by keyword and specify whether to return only objects marked as favorites.</li>
     * <li>You can use complex filter conditions to further narrow results, including but not limited to operators such as equal to, not equal to, greater than, and less than.</li>
     * <li>If no primary object type is configured, an empty result set is returned.</li>
     * <li>The data in the request is subject to authentication and filtering to ensure security and accuracy.</li>
     * </ul>
     * 
     * @param request the request parameters of QueryPrimaryObjectData  QueryPrimaryObjectDataRequest
     * @return QueryPrimaryObjectDataResponse
     */
    CompletableFuture<QueryPrimaryObjectDataResponse> queryPrimaryObjectData(QueryPrimaryObjectDataRequest request);

    /**
     * <b>description</b> :
     * <p>Exposes only the schema_knowledge semantic recall capability of smart-query.
     *     CLI mapping: <code>winnexo semantic query</code>. <code>tenantId</code> is passed through common parameters. <code>userId</code>
     *     is read only from the Token identity and cannot be overridden by the request body. The service validates
     *     the ownership of <code>graphName + agentName</code>, active graph status, digital human enablement status, and
     *     the current user\&quot;s USE permission. A cross-graph agent with the same name will fail and be closed.
     *     Then <code>outputs=[schema_knowledge]</code> is fixed.</p>
     * 
     * @param request the request parameters of QuerySemanticKnowledge  QuerySemanticKnowledgeRequest
     * @return QuerySemanticKnowledgeResponse
     */
    CompletableFuture<QuerySemanticKnowledgeResponse> querySemanticKnowledge(QuerySemanticKnowledgeRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the execution status and result of an organization synchronization task based on the task ID.
     *     Task status transitions: PENDING → RUNNING → COMPLETED / FAILED / TIMEOUT / CANCELED
     *     Recommended client polling interval: 3 to 5 seconds.</p>
     * 
     * @param request the request parameters of QuerySyncResult  QuerySyncResultRequest
     * @return QuerySyncResultResponse
     */
    CompletableFuture<QuerySyncResultResponse> querySyncResult(QuerySyncResultRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Based on the most recent N messages in a session and the skills attached to the agent, invokes an LLM to generate 0 to 3 next-step recommendations (follow-up questions or recommended skills to execute).</p>
     * <ul>
     * <li><code>sessionId</code>: The session ID. Required. Only sessions that the currently authenticated user has permission to access are allowed.</li>
     * <li><code>recentMessageCount</code>: The number of recent messages used to assemble the contextual information. Valid values: 1 to 30. Default value: 10 (approximately 5 rounds of user+assistant conversation).</li>
     * <li><code>customPrompt</code>: A custom recommendation instruction (up to 10,000 characters). This instruction is injected into the default recommendation template before the output format constraints. The output is still subject to the JSON format and type constraints of the template.</li>
     * <li><code>outputType</code>: Filters the output type. followUpOnly = follow-up question recommendations only (default). skillOnly = skill recommendations only. both = generates both types.
     * Unlike internal endpoints, API calls are not restricted by the next-step recommendation toggle in user personal settings and always perform recommendation generation.</li>
     * </ul>
     * 
     * @param request the request parameters of RecommendNextActions  RecommendNextActionsRequest
     * @return RecommendNextActionsResponse
     */
    CompletableFuture<RecommendNextActionsResponse> recommendNextActions(RecommendNextActionsRequest request);

    /**
     * <b>description</b> :
     * <p>Removes a user from a tenant.
     *     Business orchestration:
     *     1. Obtains tenant_id from identity.
     *     2. Calls delete_user_from_tenant (includes last admin protection).
     *     3. Returns success.
     *     This operation:
     *     - Removes all role associations of the user under the tenant.
     *     - Removes all user group associations of the user under the tenant.
     *     - Revokes all digital employee usage authorizations of the user under the tenant.
     *     - Deletes the user-tenant mapping.</p>
     * 
     * @param request the request parameters of RemoveUser  RemoveUserRequest
     * @return RemoveUserResponse
     */
    CompletableFuture<RemoveUserResponse> removeUser(RemoveUserRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation supports batch removal of direct member relationships between users and a specified user group by providing the user group ID and one or more user IDs.</li>
     * <li>The <code>userIds</code> parameter accepts an integer array that represents the list of platform user IDs to be removed.</li>
     * <li>If a user you attempt to remove is not a direct member of the user group, the final result count is not affected.</li>
     * <li>After a successful call, the response returns information such as the number of members actually removed and the number of members before the request was processed.</li>
     * <li>This operation requires appropriate permission authentication and is recorded in operation logs.</li>
     * </ul>
     * 
     * @param request the request parameters of RemoveUserGroupMembers  RemoveUserGroupMembersRequest
     * @return RemoveUserGroupMembersResponse
     */
    CompletableFuture<RemoveUserGroupMembersResponse> removeUserGroupMembers(RemoveUserGroupMembersRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation allows users with the required permissions to modify the name of a specific data source in an enterprise knowledge base.</li>
     * <li>You must provide the ID of the data source to be renamed (sourceId) and the new name (newName).</li>
     * <li>The rename operation only updates the name field of the data source and does not trigger other processing flows.</li>
     * <li>After successful execution, the system publishes a <code>SOURCE_CHANGED</code> event for frontend display refresh and attempts to notify DocumentAgent to synchronize the latest source_name information. However, if this step fails, it does not affect the completion status of the main flow.</li>
     * <li>If the specified sourceId does not exist, the error code <code>ERR.Robject.Source.NotFound</code> is returned.</li>
     * <li>To invoke this API, you must have the <code>DEVELOPMENT_KB_MANAGE</code> feature permission.</li>
     * <li>Identity verification is supported through AccessKey, BearerToken, or APP methods to authenticate requests.</li>
     * </ul>
     * 
     * @param request the request parameters of RenameKnowledgeBaseSource  RenameKnowledgeBaseSourceRequest
     * @return RenameKnowledgeBaseSourceResponse
     */
    CompletableFuture<RenameKnowledgeBaseSourceResponse> renameKnowledgeBaseSource(RenameKnowledgeBaseSourceRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API updates only the <code>name</code> field of the data source and does not trigger <code>process_source</code>.</li>
     * <li>After a successful update, a <code>SOURCE_CHANGED</code> event is published for the frontend to refresh the display.</li>
     * <li>The system makes a best-effort attempt to notify DocumentAgent to sync the new <code>source_name</code>. Even if the sync fails, the main process is not blocked.</li>
     * <li>If the specified data source does not exist, the <code>ERR.Robject.Source.NotFound</code> error is returned. The global middleware converts this error into a POP error code.</li>
     * <li>Security constraint: <code>tenant_id</code> and <code>user_id</code> must be derived from the authenticated identity.</li>
     * </ul>
     * 
     * @param request the request parameters of RenameSource  RenameSourceRequest
     * @return RenameSourceResponse
     */
    CompletableFuture<RenameSourceResponse> renameSource(RenameSourceRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This API operation re-parses a specified data source. You can choose synchronous or asynchronous execution. You must provide the data source ID in the request. You can optionally specify whether to synchronously wait for parsing to complete. By default, the request is processed asynchronously by being added to a queue. You can also use the <code>tenantId</code> parameter to specify a tenant ID, but this parameter is optional.</p>
     * <ul>
     * <li><strong>forceSync</strong>: If set to <code>true</code>, the operation synchronously waits for the re-parsing to complete. Default value: <code>false</code>, which indicates that the request is processed asynchronously.</li>
     * <li>When the service returns <code>None</code>, it is converted to a <code>SourceNotFound</code> exception. Other exceptions are handled by the OpenAPI global exception chain.</li>
     * </ul>
     * 
     * @param request the request parameters of ReparseSource  ReparseSourceRequest
     * @return ReparseSourceResponse
     */
    CompletableFuture<ReparseSourceResponse> reparseSource(ReparseSourceRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This API allows you to update a specific FILE-type data source in a self-built enterprise knowledge base and trigger the system to re-parse the data source by providing a new file path and public access URL. Operations can be performed in synchronous or asynchronous mode. In synchronous mode, the client waits until the parsing process is complete.</p>
     * <ul>
     * <li>The <strong>forceSync</strong> parameter controls whether the request is processed synchronously. The default value is <code>false</code>, which indicates asynchronous processing.</li>
     * <li>If <strong>fileName</strong> is not provided or its value is empty, the newly uploaded file retains the original file name.</li>
     * <li>Ensure that the provided <strong>filePath</strong> and <strong>filePublicUrl</strong> are valid and point to the same file entity.</li>
     * </ul>
     * 
     * @param request the request parameters of ReplaceKnowledgeBaseSourceFile  ReplaceKnowledgeBaseSourceFileRequest
     * @return ReplaceKnowledgeBaseSourceFileResponse
     */
    CompletableFuture<ReplaceKnowledgeBaseSourceFileResponse> replaceKnowledgeBaseSourceFile(ReplaceKnowledgeBaseSourceFileRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This API performs a full replacement of object bindings for a specified data source (deletes existing bindings first, then inserts new bindings). If an empty list is passed, all bindings are cleared.</p>
     * <ul>
     * <li><strong>Security constraints</strong>: <code>tenant_id</code> and <code>user_id</code> must come from the authenticated identity.</li>
     * <li><strong>Error handling</strong>: If the specified data source does not exist, an <code>ERR.Robject.InvalidParameter</code> error is thrown and converted to a POP error code by the global middleware.</li>
     * <li><strong>Synchronous notification</strong>: After a successful replacement, the system makes a best-effort synchronous notification to DocumentAgent to update <code>semantics.object_bindings</code>. However, failures are only logged and do not block the main process.</li>
     * </ul>
     * 
     * @param request the request parameters of ReplaceObjectBindings  ReplaceObjectBindingsRequest
     * @return ReplaceObjectBindingsResponse
     */
    CompletableFuture<ReplaceObjectBindingsResponse> replaceObjectBindings(ReplaceObjectBindingsRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API operation replaces a personal FILE resource created by the current platform user and triggers the system to re-parse the file.</li>
     * <li>The <code>tenant_id</code>, operator, and creator constraints are read only from the authenticated identity. Requests without a platform user are rejected to prevent bypassing ownership verification.</li>
     * <li>If the server returns <code>None</code>, it is converted to a <code>NotFound</code> exception. Other exceptions are handled by the OpenAPI global exception chain.</li>
     * <li>This operation supports synchronous or asynchronous waiting for re-parsing to complete. The default behavior is asynchronous queuing (controlled by the <code>forceSync</code> parameter).</li>
     * </ul>
     * 
     * @param request the request parameters of ReplaceSourceFile  ReplaceSourceFileRequest
     * @return ReplaceSourceFileResponse
     */
    CompletableFuture<ReplaceSourceFileResponse> replaceSourceFile(ReplaceSourceFileRequest request);

    /**
     * <b>description</b> :
     * <p>Resets the password of a user through OpenAPI.
     *     Business orchestration:
     *     1. Call UserManagementService.reset_member_password with password_encrypted (required).
     *        The service internally performs RSA decryption, complexity validation, bcrypt hashing, and writes the result.
     *     2. Returns the reset result.
     *     Error codes:
     *     - ERR.User.NotFound: The user does not exist.
     *     - ERR.User.NotInTenant: The user does not belong to the current tenant.
     *     - ERR.User.WinnexoPasswordRequired: The user does not have password credentials (non-WINNEXO type).</p>
     * 
     * @param request the request parameters of ResetPassword  ResetPasswordRequest
     * @return ResetPasswordResponse
     */
    CompletableFuture<ResetPasswordResponse> resetPassword(ResetPasswordRequest request);

    /**
     * <b>description</b> :
     * <p>Resets the token of a user.
     *     Business logic:
     *     1. Retrieves user_id from identity (caller_type=user is required).
     *     2. Constructs an AuthContext and delegates permission verification to UserTokenAuthorizedService.
     *     3. Calls reset_token:
     *        - Changes the old ACTIVE token to RESET (permanently invalidated).
     *        - Generates a new ACTIVE token.
     *     4. Returns the new token in plaintext and the masked value.
     *     Note: After the reset, the old token is permanently invalidated and cannot be recovered. The new token in plaintext is returned only in this response.</p>
     * 
     * @param request the request parameters of ResetToken  ResetTokenRequest
     * @return ResetTokenResponse
     */
    CompletableFuture<ResetTokenResponse> resetToken(ResetTokenRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This API retrieves and retries data sources with a FAILED status in the specified personal folder of a user (including all subfolders). The request returns immediately, and the actual retry tasks are executed asynchronously in the background. Only resources that the current logged-in user has access to and that were created by the user can be retried.</p>
     * <h3>Security and permissions</h3>
     * <ul>
     * <li>This operation requires appropriate RAM permissions.</li>
     * <li>You can only operate on resources within the tenant to which the current user belongs.</li>
     * <li>Ensure that <code>tenantId</code> and <code>userId</code> come from verified identity information.</li>
     * </ul>
     * <h3>Precautions</h3>
     * <ul>
     * <li><code>directoryId</code> is a required parameter that specifies the target folder in which to check and retry failed data sources.</li>
     * <li>If <code>tenantId</code> is not provided, the caller\&quot;s tenant ID is used by default.</li>
     * <li>The API supports multiple authentication methods, including AccessKey, BearerToken, and APP authentication.</li>
     * </ul>
     * 
     * @param request the request parameters of RetryDirectoryFailedSources  RetryDirectoryFailedSourcesRequest
     * @return RetryDirectoryFailedSourcesResponse
     */
    CompletableFuture<RetryDirectoryFailedSourcesResponse> retryDirectoryFailedSources(RetryDirectoryFailedSourcesRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This API retrieves and retries all data sources in FAILED status under a specified enterprise knowledge base directory (including its subdirectories). The request returns immediately, and the actual retry operations are executed asynchronously in the background.</p>
     * <ul>
     * <li><strong>Authentication</strong>: In addition to basic authentication, the DEVELOPMENT_KB_MANAGE permission is required.</li>
     * <li><strong>Security constraints</strong>: Only callers with the corresponding tenant and user identity are allowed access, and KB management permission is required. Administrators can initiate retries for failed resources of any user.</li>
     * <li><strong>Parameters</strong>:<ul>
     * <li><code>directoryId</code> (required): The ID of the enterprise knowledge base directory for which to check and retry failed data sources.</li>
     * <li><code>tenantId</code> (optional): The tenant ID. The default tenant of the caller is used if this parameter is not specified.</li>
     * </ul>
     * </li>
     * <li><strong>Response</strong>: On success, the response includes the number of data sources enqueued for retry and their details.</li>
     * </ul>
     * 
     * @param request the request parameters of RetryKnowledgeBaseFailedSources  RetryKnowledgeBaseFailedSourcesRequest
     * @return RetryKnowledgeBaseFailedSourcesResponse
     */
    CompletableFuture<RetryKnowledgeBaseFailedSourcesResponse> retryKnowledgeBaseFailedSources(RetryKnowledgeBaseFailedSourcesRequest request);

    /**
     * <b>description</b> :
     * <p>Revokes a single semantic resource draft via OpenAPI (personal token only).
     *     Business orchestration:
     *     1. Draft domain identity verification (personal token only. Deploy/system-level tokens are rejected)
     *        and semantic management permission verification.
     *     2. When graphName is provided, verifies draft ownership consistency (prevents accidental cross-knowledge-graph deletion).
     *        If the draft no longer exists, returns reverted=false (idempotent semantics, no error is reported).
     *     Error codes:
     *     - ERR.User.TokenUserOnly: Personal drafts support only user tokens.
     *     - ERR.Robject.Global.InvalidParameter: draftChangeId does not belong to the specified knowledge graph.</p>
     * 
     * @param request the request parameters of RevertGraphDraftResource  RevertGraphDraftResourceRequest
     * @return RevertGraphDraftResourceResponse
     */
    CompletableFuture<RevertGraphDraftResourceResponse> revertGraphDraftResource(RevertGraphDraftResourceRequest request);

    /**
     * <b>description</b> :
     * <p>Revokes the usage permissions of a user or user group on a specified digital human.
     *     Business logic:
     *     1. Constructs an AuthContext from identity.
     *     2. Performs mutual exclusion validation on the request body: either userIds or userGroupIds must be specified.
     *     3. Delegates to AgentAuthorizationAuthorizedService.revoke_authorization for execution.
     *     4. Pre-validation: MANAGE permission + agent existence check (performed by the AuthorizedService layer, which authenticates before exposing existence).
     *     5. After direct user authorization is revoked, the user may still have access through user group authorization.</p>
     * 
     * @param request the request parameters of RevokeAgentUsers  RevokeAgentUsersRequest
     * @return RevokeAgentUsersResponse
     */
    CompletableFuture<RevokeAgentUsersResponse> revokeAgentUsers(RevokeAgentUsersRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This operation supports only asynchronous mode. After submission, the operation immediately returns a <code>RunId</code> and <code>Status=Running</code>. The client polls for the final result by calling <code>GetSkillRun</code>.</p>
     * <ul>
     * <li><strong>TenantId</strong>: An optional common parameter that the gateway passes through to the backend header.</li>
     * <li><strong>SkillCode</strong> / <strong>SkillName</strong>: Specify one of the two parameters. SkillCode takes priority. If SkillName is not unique, <code>ERR.SkillHub.SkillNameAmbiguous</code> is returned.</li>
     * <li><strong>Arguments</strong>: Required. The skill input parameter object. The structure is described by the inputConfig returned by <code>GetSkill</code>.</li>
     * <li><strong>ClientToken</strong>: An optional idempotency key. In the current version, this value is only recorded in the task metadata and is not used for strict idempotency deduplication.
     * Note: Synchronous mode (Async=false), Stream, and CallbackUrl are not supported in the first release and will be available in later versions.</li>
     * </ul>
     * 
     * @param request the request parameters of RunSkill  RunSkillRequest
     * @return RunSkillResponse
     */
    CompletableFuture<RunSkillResponse> runSkill(RunSkillRequest request);

    /**
     * <b>description</b> :
     * <p>OpenAPI 保存单个语义资源草稿（仅个人 Token）。
     *     业务编排：
     *     1. 草稿域身份校验（仅个人 Token；部署/系统级 Token 被拒绝）
     *        与语义管理权限校验
     *     2. 委托个人草稿服务保存（来源固定 YAML），底层含资源级写权限校验；
     *        内容与在线完全一致时跳过落库，摘要字段返回 null
     *     错误码：
     *     - ERR.User.TokenUserOnly: 个人草稿仅支持用户 Token
     *     - ERR.Robject.Global.InvalidParameter: resourceType/elementType 组合不合法
     *     - ERR.GraphSchema.*: 图谱不存在 / 资源命名与归属校验失败
     *     - ERR.Robject.Global.ResourceNotFound: 资源不存在等底层校验失败</p>
     * 
     * @param request the request parameters of SaveGraphDraftResource  SaveGraphDraftResourceRequest
     * @return SaveGraphDraftResourceResponse
     */
    CompletableFuture<SaveGraphDraftResourceResponse> saveGraphDraftResource(SaveGraphDraftResourceRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>Saves specified group outputs to the repository directory of the same collaboration group.</li>
     * <li>Supports two modes: <code>link</code> (maintains output association) and <code>copy</code> (creates an independent snapshot).</li>
     * <li>The caller must be a platform user and a member of the target group. The caller can archive group outputs visible to them, including outputs created by other members.</li>
     * <li>If <code>directoryId</code> is not specified, the default repository directory of the target group is used.</li>
     * <li>A maximum of 50 outputs can be processed per batch. All entries are validated before saving. If any entry does not exist, is not visible, or cannot be operated on, the entire batch fails.</li>
     * <li>After unified validation passes, entries are saved one by one. The response results maintain the same order as <code>itemIds</code>. A failure of a single entry does not affect other entries.</li>
     * </ul>
     * 
     * @param request the request parameters of SaveGroupOutputFileToGroupResource  SaveGroupOutputFileToGroupResourceRequest
     * @return SaveGroupOutputFileToGroupResourceResponse
     */
    CompletableFuture<SaveGroupOutputFileToGroupResourceResponse> saveGroupOutputFileToGroupResource(SaveGroupOutputFileToGroupResourceRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>Saves specified group outputs to the current operator\&quot;s personal knowledge base.</li>
     * <li>Supports two modes: <code>link</code> (maintains output association) and <code>copy</code> (creates an independent snapshot).</li>
     * <li>The caller must be a member of the target group who is associated with a platform user. Regular members can only archive outputs they created, while group administrators can archive visible outputs from other members. Personal ownership is always derived from the gateway authentication identity.</li>
     * <li>If <code>directoryId</code> is not specified, the current operator\&quot;s default personal directory is used.</li>
     * <li>A maximum of 50 outputs can be processed per batch. All entries are validated before saving. The entire batch fails if any entry does not exist, is not visible, or cannot be operated on.</li>
     * <li>After unified validation passes, entries are saved one by one. The response results maintain the same order as <code>itemIds</code>. A failure to save a single entry does not affect other entries.</li>
     * </ul>
     * 
     * @param request the request parameters of SaveGroupOutputFileToPersonalResource  SaveGroupOutputFileToPersonalResourceRequest
     * @return SaveGroupOutputFileToPersonalResourceResponse
     */
    CompletableFuture<SaveGroupOutputFileToPersonalResourceResponse> saveGroupOutputFileToPersonalResource(SaveGroupOutputFileToPersonalResourceRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API saves a batch of output details as personal resources for the user.</li>
     * <li>Two save modes are supported: <code>link</code> and <code>copy</code>. When <code>link</code> is selected, edits to the output are synchronized to the resource. When <code>copy</code> is selected, a snapshot is created with no limit on the number of copies.</li>
     * <li><code>tenant_id</code> and <code>user_id</code> are derived only from the authenticated identity.</li>
     * <li>If <code>operating_object</code> values are inconsistent within the batch and <code>directoryId</code> is not specified, the entire batch fails with a pre-check error.</li>
     * <li>The processing result of a single record does not affect other records. Failure information for individual records is returned in the response.</li>
     * <li>A maximum of 50 records are supported per batch operation.</li>
     * <li>Batch-level pre-check failures are returned in a POP-compatible error format by the global exception middleware.</li>
     * </ul>
     * 
     * @param request the request parameters of SaveOutputFileToResource  SaveOutputFileToResourceRequest
     * @return SaveOutputFileToResourceResponse
     */
    CompletableFuture<SaveOutputFileToResourceResponse> saveOutputFileToResource(SaveOutputFileToResourceRequest request);

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>仅供 Winnexo 轻量工作台使用。</li>
     * <li>按关键词分页搜索当前平台用户可见的阿里钉群聊。</li>
     * <li>响应不包含 DWS 原始对象。</li>
     * </ul>
     * 
     * @param request the request parameters of SearchAliDingGroupChats  SearchAliDingGroupChatsRequest
     * @return SearchAliDingGroupChatsResponse
     */
    CompletableFuture<SearchAliDingGroupChatsResponse> searchAliDingGroupChats(SearchAliDingGroupChatsRequest request);

    /**
     * <b>description</b> :
     * <p>Asynchronously sends a session message.</p>
     * 
     * @param request the request parameters of SendAsyncChatMessage  SendAsyncChatMessageRequest
     * @return SendAsyncChatMessageResponse
     */
    CompletableFuture<SendAsyncChatMessageResponse> sendAsyncChatMessage(SendAsyncChatMessageRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API operation is used to upload a file to the &quot;My Resources&quot; section of a specified digital employee.</li>
     * <li><code>source_type</code> is fixed to <code>FILE</code>, <code>scope</code> is fixed to <code>PERSONAL</code>, and <code>platform</code> is fixed to <code>LOCAL</code>.</li>
     * <li>A persistent OSS address (<code>filePath</code>) must be provided for the file. Other information such as the public access URL and original file name is optional.</li>
     * <li>If the target folder ID (<code>directoryId</code>) is not specified, the file is automatically attached to the default root folder of the current digital employee. If specified, ensure that the folder belongs to the personal folder of the invoker.</li>
     * <li>Multiple authentication methods (AK, BearerToken, APP) are supported for security authentication.</li>
     * <li>The operation type is write (<code>write</code>), and operation logs are recorded for subsequent auditing.</li>
     * </ul>
     * 
     * @param request the request parameters of SendChatMessage  SendChatMessageRequest
     * @return SendChatMessageResponse
     */
    CompletableFuture<SendChatMessageResponse> sendChatMessage(SendChatMessageRequest request);

<ReturnT> CompletableFuture<ReturnT> sendChatMessageWithAsyncResponseHandler(SendChatMessageRequest request, AsyncResponseHandler<SendChatMessageResponse, ReturnT> responseHandler);

    ResponseIterable<SendChatMessageResponseBody> sendChatMessageWithResponseIterable(SendChatMessageRequest request);

    /**
     * @param request the request parameters of StopChatMessage  StopChatMessageRequest
     * @return StopChatMessageResponse
     */
    CompletableFuture<StopChatMessageResponse> stopChatMessage(StopChatMessageRequest request);

    /**
     * <b>description</b> :
     * <p>Subscribes to a conversation message stream.</p>
     * 
     * @param request the request parameters of StreamChatMessage  StreamChatMessageRequest
     * @return StreamChatMessageResponse
     */
    CompletableFuture<StreamChatMessageResponse> streamChatMessage(StreamChatMessageRequest request);

<ReturnT> CompletableFuture<ReturnT> streamChatMessageWithAsyncResponseHandler(StreamChatMessageRequest request, AsyncResponseHandler<StreamChatMessageResponse, ReturnT> responseHandler);

    ResponseIterable<StreamChatMessageResponseBody> streamChatMessageWithResponseIterable(StreamChatMessageRequest request);

    /**
     * <b>description</b> :
     * <p>Accepts a department tree and member relationships pushed from the client and creates an asynchronous synchronization task.
     *     Processing flow:
     *     1. Validates platformType (only saml, oauth2, or custom are allowed).
     *     2. Validates data volume limits (departments + members &lt;= 50000).
     *     3. Validates the compatibility between syncMembers and platformType.
     *     4. SAML/OAuth2 scenario: Parses or automatically derives ssoSettingsId.
     *     5. Custom scenario: Validates that corpId has been registered through createCustomOrg.
     *     6. Delegates to OrgSyncAuthorizedService to create the task (which includes permission verification).
     *     7. Returns taskId for polling.</p>
     * 
     * @param request the request parameters of SyncOrgStructure  SyncOrgStructureRequest
     * @return SyncOrgStructureResponse
     */
    CompletableFuture<SyncOrgStructureResponse> syncOrgStructure(SyncOrgStructureRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li><strong>Precheck</strong>:<ol>
     * <li>When adding a follow: The system checks whether the primary object is already followed to prevent duplicates, and authenticates that the primary object exists.</li>
     * <li>When unfollowing: This is an idempotent operation. Regardless of whether the user has previously followed the object, <code>success=true</code> is returned.</li>
     * </ol>
     * </li>
     * <li><strong>Security</strong>: Three authentication methods are supported: AK, BearerToken, and APP.</li>
     * <li><strong>Request frequency limit</strong>: A maximum of 100 requests can be send per second.</li>
     * <li><strong>Response log</strong>: The response log record feature is enabled.</li>
     * <li><strong>Tenant relevance</strong>: This API is associated with a specific tenant. The tenant ID of the invoker is used by default.</li>
     * <li><strong>Operation type</strong>: Write operation.</li>
     * <li><strong>Backend service</strong>: Requests are forwarded to an internal service for processing. The timeout period is 3 seconds.</li>
     * </ul>
     * 
     * @param request the request parameters of TogglePrimaryObjectFavorite  TogglePrimaryObjectFavoriteRequest
     * @return TogglePrimaryObjectFavoriteResponse
     */
    CompletableFuture<TogglePrimaryObjectFavoriteResponse> togglePrimaryObjectFavorite(TogglePrimaryObjectFavoriteRequest request);

    /**
     * <b>description</b> :
     * <p>Switches the authorization mode for digital employee usage permissions.
     *     Business logic:
     *     1. Constructs an AuthContext from the identity.
     *     2. Delegates to AgentAuthorizationAuthorizedService.update_auth_mode for execution.
     *     3. Pre-validation: MANAGE permission + agent existence check (performed by the AuthorizedService layer, which authenticates before exposing existence).
     *     4. SPECIFIED_USERS: Explicit authorization is required before usage.
     *     5. ALL_USERS: All users can use the digital employee without authorization (management permissions are not affected).</p>
     * 
     * @param request the request parameters of UpdateAgentAuthMode  UpdateAgentAuthModeRequest
     * @return UpdateAgentAuthModeResponse
     */
    CompletableFuture<UpdateAgentAuthModeResponse> updateAgentAuthMode(UpdateAgentAuthModeRequest request);

    /**
     * <b>description</b> :
     * <p>Updates a session.</p>
     * 
     * @param request the request parameters of UpdateChatSession  UpdateChatSessionRequest
     * @return UpdateChatSessionResponse
     */
    CompletableFuture<UpdateChatSessionResponse> updateChatSession(UpdateChatSessionRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This API operation updates the personal directory information of a specified user, including the name, description, and parent directory. Ensure that the directory corresponding to the provided <code>directoryId</code> exists and belongs to the current user. If the <code>name</code> or <code>path</code> of the directory is changed, the system automatically and recursively updates the paths of all subdirectories to maintain consistency. When adjusting the parent directory, ensure the validity of the new parent directory (that is, it is not the directory itself and does not cause a circular dependency).</p>
     * <ul>
     * <li><strong>Security constraints</strong>: <code>tenant_id</code> and <code>user_id</code> must be derived from the authenticated identity.</li>
     * <li><strong>Permission requirements</strong>: Corresponding RAM permissions are required to perform this operation.</li>
     * <li><strong>Input parameters</strong>:<ul>
     * <li><code>directoryId</code>: Required. The unique identifier of the directory to update.</li>
     * <li><code>name</code>: Optional. The new directory name.</li>
     * <li><code>description</code>: Optional. The new directory description.</li>
     * <li><code>parentId</code>: Optional. The ID of the new parent directory.</li>
     * <li><code>path</code>: Optional. When specified, the system cascades the update to the paths of the current directory and all its subdirectories.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of UpdateDirectory  UpdateDirectoryRequest
     * @return UpdateDirectoryResponse
     */
    CompletableFuture<UpdateDirectoryResponse> updateDirectory(UpdateDirectoryRequest request);

    /**
     * <b>description</b> :
     * <p>OpenAPI 快更图谱元信息（displayName / businessProfile），同步更新 active 记录。
     *     displayName 与 businessProfile 至少传其一，否则返回 ERR.GraphSchema.QuickUpdateNoFieldsToUpdate。
     *     错误码：
     *     - ERR.GraphSchema.QuickUpdateNoFieldsToUpdate: 未传任何可更新字段
     *     - ERR.GraphSchema.GraphNameInvalid: 图谱名称不合法
     *     - ERR.GraphSchema.GraphSchemaNotFound: 图谱不存在
     *     - ERR.GraphSchema.DisplayNameInvalid: 展示名不合法或重复</p>
     * 
     * @param request the request parameters of UpdateGraphInfo  UpdateGraphInfoRequest
     * @return UpdateGraphInfoResponse
     */
    CompletableFuture<UpdateGraphInfoResponse> updateGraphInfo(UpdateGraphInfoRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation modifies a directory in the enterprise knowledge base.</li>
     * <li>You must have the <code>DEVELOPMENT_KB_MANAGE</code> permission to call this API operation.</li>
     * <li>The <code>tenantId</code> parameter is optional. If not provided, the tenant ID of the caller is used by default.</li>
     * <li>You must specify the <code>directoryId</code> of the directory to modify. The <code>name</code>, <code>description</code>, and <code>parentDirectoryId</code> parameters are optional. If not provided, the corresponding fields remain unchanged.</li>
     * <li>When a new <code>parentDirectoryId</code> is specified, the system checks whether the new parent directory belongs to the current tenant and does not cause a circular dependency.</li>
     * <li>This API operation supports multiple authentication methods (AK, BearerToken, APP) and has RAM permission control and operation auditing enabled.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateKnowledgeBaseDirectory  UpdateKnowledgeBaseDirectoryRequest
     * @return UpdateKnowledgeBaseDirectoryResponse
     */
    CompletableFuture<UpdateKnowledgeBaseDirectoryResponse> updateKnowledgeBaseDirectory(UpdateKnowledgeBaseDirectoryRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This operation allows you to update the body content of a specified enterprise knowledge base data source and optionally wait synchronously for parsing to complete. By setting the <code>forceSync</code> parameter, you can control whether the parsing process is executed synchronously or asynchronously. The default is asynchronous processing.</p>
     * <ul>
     * <li><strong>Note</strong>: When the <code>content</code> field is an empty string, the original content is cleared.</li>
     * <li><strong>Permission requirement</strong>: Calling this operation requires the corresponding RAM action permission (<code>winnexo:UpdateKnowledgeBaseSourceContent</code>).</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateKnowledgeBaseSourceContent  UpdateKnowledgeBaseSourceContentRequest
     * @return UpdateKnowledgeBaseSourceContentResponse
     */
    CompletableFuture<UpdateKnowledgeBaseSourceContentResponse> updateKnowledgeBaseSourceContent(UpdateKnowledgeBaseSourceContentRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation updates the labels of a specific data source in an enterprise knowledge base.</li>
     * <li>You must have knowledge base management permissions to invoke this operation.</li>
     * <li>The <code>sourceTags</code> parameter accepts a JSON character string list, such as <code>[&quot;tagA&quot;, &quot;tagB&quot;]</code>. If you set this parameter to <code>null</code>, all existing labels are cleared.</li>
     * <li>The update operation affects only the <code>sourceTags</code> and <code>gmt_modified</code> fields and does not trigger the <code>process_source</code> workflow.</li>
     * <li>If the specified data source does not exist, the <code>ERR.Robject.Source.NotFound</code> fault is returned.</li>
     * <li>This operation supports authentication through AccessKey, BearerToken, or APP methods.</li>
     * <li>When you invoke this operation, make sure that <code>tenant_id</code> and <code>user_id</code> are from valid authentication identity information.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateKnowledgeBaseSourceTags  UpdateKnowledgeBaseSourceTagsRequest
     * @return UpdateKnowledgeBaseSourceTagsResponse
     */
    CompletableFuture<UpdateKnowledgeBaseSourceTagsResponse> updateKnowledgeBaseSourceTags(UpdateKnowledgeBaseSourceTagsRequest request);

    /**
     * <b>description</b> :
     * <p>Updates a scheduled task.</p>
     * 
     * @param request the request parameters of UpdateScheduledTask  UpdateScheduledTaskRequest
     * @return UpdateScheduledTaskResponse
     */
    CompletableFuture<UpdateScheduledTaskResponse> updateScheduledTask(UpdateScheduledTaskRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API operation updates the content of a data source within a specified tenant and triggers synchronous or asynchronous re-parsing of the data source as needed.</li>
     * <li><code>tenant_id</code> and <code>user_id</code> are used only for authentication and are not involved in actual business logic processing.</li>
     * <li>When the provided content is an empty string, the system performs the operation according to the existing service contract.</li>
     * <li>If the specified data source does not exist, a standard NotFound error is returned. Other exceptions are handled by the global exception chain.</li>
     * <li>Set the <code>forceSync</code> parameter to determine whether to wait for the parsing process to complete. The default behavior is asynchronous queuing.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateSourceContent  UpdateSourceContentRequest
     * @return UpdateSourceContentResponse
     */
    CompletableFuture<UpdateSourceContentResponse> updateSourceContent(UpdateSourceContentRequest request);

    /**
     * <b>description</b> :
     * <p>Modifies knowledge base folder information.</p>
     * 
     * @param request the request parameters of UpdateTenantDirectory  UpdateTenantDirectoryRequest
     * @return UpdateTenantDirectoryResponse
     */
    CompletableFuture<UpdateTenantDirectoryResponse> updateTenantDirectory(UpdateTenantDirectoryRequest request);

    /**
     * <b>description</b> :
     * <p>Modifies user information through OpenAPI.
     *     Business orchestration:
     *     1. Parse roleCodes → role_ids
     *     2. If isActive has changed, perform the status switch first (including last super admin protection)
     *     3. Call update_tenant_member to modify other fields (displayName / roleCodes / userGroupIds)
     *     4. Return HTTP 200 if all steps succeed
     *     Execution order notes:
     *     - The isActive status change is performed before other field writes. The two steps are not in the same transaction.
     *     - If validation fails (such as last super admin protection) → an exception is thrown and subsequent steps are not executed.
     *     - If the isActive change has been persisted but a subsequent step fails, the isActive change is not rolled back.</p>
     * 
     * @param request the request parameters of UpdateUser  UpdateUserRequest
     * @return UpdateUserResponse
     */
    CompletableFuture<UpdateUserResponse> updateUser(UpdateUserRequest request);

    /**
     * <b>description</b> :
     * <p>WinNexo user management OpenAPI: updates a user group. The tenant identity is obtained from the authentication context.</p>
     * 
     * @param request the request parameters of UpdateUserGroup  UpdateUserGroupRequest
     * @return UpdateUserGroupResponse
     */
    CompletableFuture<UpdateUserGroupResponse> updateUserGroup(UpdateUserGroupRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API allows the caller to update some or all optional fields of a specified user. Fields that are not provided retain their original values.</li>
     * <li>Use the <code>tenantId</code> parameter to specify a tenant ID. If omitted, the default tenant of the caller is used.</li>
     * <li>After a successful update, the response body contains the complete user information object.</li>
     * <li>This operation requires authentication and supports three security schemes: AK, BearerToken, and APP.</li>
     * <li>The request content type is JSON, and the operation is available only over HTTPS.</li>
     * <li>Note: The <code>profileRoleInfo</code> field is valid only when the user role is set to Others. It describes the specific role information of the user.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateUserInfo  UpdateUserInfoRequest
     * @return UpdateUserInfoResponse
     */
    CompletableFuture<UpdateUserInfoResponse> updateUserInfo(UpdateUserInfoRequest request);

}
