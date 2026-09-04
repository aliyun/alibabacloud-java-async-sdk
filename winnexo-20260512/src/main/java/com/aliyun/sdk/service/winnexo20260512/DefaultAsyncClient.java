// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.winnexo20260512.models.*;
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
        this.product = "WinNexo";
        this.version = "2026-05-12";
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
     * <p>WinNexo 用户管理 OpenAPI：批量添加用户组成员。租户身份来自鉴权上下文。</p>
     * 
     * @param request the request parameters of AddUserGroupMembers  AddUserGroupMembersRequest
     * @return AddUserGroupMembersResponse
     */
    @Override
    public CompletableFuture<AddUserGroupMembersResponse> addUserGroupMembers(AddUserGroupMembersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AddUserGroupMembers").setMethod(HttpMethod.POST).setPathRegex("/openapi/addUserGroupMembers").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddUserGroupMembersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddUserGroupMembersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>按 graphName、operatingObjectName、objectType 三个独立维度幂等取消关注。原始数组单次 1 至 200 项，每项为最长 128 字符的非空字符串；服务端校验后保持顺序去重，非字符串、超长值或数组超限均被拒绝。删除、逐项状态和剩余有效数量在同一事务内完成。要安全取消全部关注，还必须调用 ClearOperatingObjectFavorites 清理列表不可见的历史、MISSING 或权限隐藏记录，并最终读回确认 total 为 0。</p>
     * 
     * @param request the request parameters of BatchRemoveOperatingObjectFavorites  BatchRemoveOperatingObjectFavoritesRequest
     * @return BatchRemoveOperatingObjectFavoritesResponse
     */
    @Override
    public CompletableFuture<BatchRemoveOperatingObjectFavoritesResponse> batchRemoveOperatingObjectFavorites(BatchRemoveOperatingObjectFavoritesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("BatchRemoveOperatingObjectFavorites").setMethod(HttpMethod.POST).setPathRegex("/openapi/batchRemoveOperatingObjectFavorites").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchRemoveOperatingObjectFavoritesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchRemoveOperatingObjectFavoritesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CheckHealth  CheckHealthRequest
     * @return CheckHealthResponse
     */
    @Override
    public CompletableFuture<CheckHealthResponse> checkHealth(CheckHealthRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CheckHealth").setMethod(HttpMethod.GET).setPathRegex("/openapi/checkHealth").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckHealthResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckHealthResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>按 graphName、operatingObjectName、objectType 三个独立维度清空当前调用用户的全部持久化关注，包括列表不可见的历史、MISSING 和权限隐藏记录。接口不返回不可见对象 ID，并在同一事务内复核剩余物理记录为零。</p>
     * 
     * @param request the request parameters of ClearOperatingObjectFavorites  ClearOperatingObjectFavoritesRequest
     * @return ClearOperatingObjectFavoritesResponse
     */
    @Override
    public CompletableFuture<ClearOperatingObjectFavoritesResponse> clearOperatingObjectFavorites(ClearOperatingObjectFavoritesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ClearOperatingObjectFavorites").setMethod(HttpMethod.POST).setPathRegex("/openapi/clearOperatingObjectFavorites").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ClearOperatingObjectFavoritesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ClearOperatingObjectFavoritesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <p>创建一条平台公告。调用身份必须映射到系统运维租户中的真实平台用户，并拥有公告管理权限。</p>
     * <ul>
     * <li><code>priority</code>：公告重要性，支持 URGENT、IMPORTANT、GENERAL。</li>
     * <li><code>targetTenantIds</code> / <code>targetRoleCodes</code>：仅在对应目标模式为 SPECIFIED 时使用，按 JSON array 传递。</li>
     * <li><code>effectiveStart</code> / <code>effectiveEnd</code>：带时区的 ISO8601 时间。</li>
     * <li><code>publishNow</code>：为 true 时创建后立即发布，否则保存为草稿。</li>
     * </ul>
     * 
     * @param request the request parameters of CreateAnnouncement  CreateAnnouncementRequest
     * @return CreateAnnouncementResponse
     */
    @Override
    public CompletableFuture<CreateAnnouncementResponse> createAnnouncement(CreateAnnouncementRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateAnnouncement").setMethod(HttpMethod.POST).setPathRegex("/openapi/createAnnouncement").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAnnouncementResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAnnouncementResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateConversation  CreateConversationRequest
     * @return CreateConversationResponse
     */
    @Override
    public CompletableFuture<CreateConversationResponse> createConversation(CreateConversationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateConversation").setMethod(HttpMethod.POST).setPathRegex("/openapi/createConversation").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateConversationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateConversationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>注册一个纯自定义组织，用于后续通过 syncOrgStructure 推送部门树。
     *     注册逻辑：
     *     1. 校验 corpId 格式（小写字母/数字开头，3-64 位，允许中划线）
     *     2. 委托 OrgSyncAuthorizedService 执行注册（内含权限校验 + 租户内唯一性检查）
     *     3. 返回注册结果
     *     注意：纯自定义组织仅支持部门树同步，不支持成员关系同步。</p>
     * 
     * @param request the request parameters of CreateCustomOrg  CreateCustomOrgRequest
     * @return CreateCustomOrgResponse
     */
    @Override
    public CompletableFuture<CreateCustomOrgResponse> createCustomOrg(CreateCustomOrgRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateCustomOrg").setMethod(HttpMethod.POST).setPathRegex("/openapi/createCustomOrg").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCustomOrgResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCustomOrgResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>将指定阿里钉群聊接入调用方已加入的群组知识库。</li>
     * <li>资源类型固定为 ALI_DING，作用范围固定为 GROUP，归属用户从网关鉴权身份解析。</li>
     * <li>groupId、chatId 与 historyStartTime 为必填项。</li>
     * <li>updateFrequency 可通过 preset 或五段 cron 配置后续同步频率。</li>
     * <li>服务端校验调用方群成员身份、目标群组目录权限及 chatId 作用域内唯一性。</li>
     * </ul>
     * 
     * @param request the request parameters of CreateGroupAliDingChat  CreateGroupAliDingChatRequest
     * @return CreateGroupAliDingChatResponse
     */
    @Override
    public CompletableFuture<CreateGroupAliDingChatResponse> createGroupAliDingChat(CreateGroupAliDingChatRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateGroupAliDingChat").setMethod(HttpMethod.POST).setPathRegex("/openapi/createGroupAliDingChat").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateGroupAliDingChatResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateGroupAliDingChatResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>将指定普通钉钉群聊接入调用方已加入的群组知识库。</li>
     * <li>资源类型固定为 DINGTALK，作用范围固定为 GROUP，归属用户从网关鉴权身份解析。</li>
     * <li>groupId、chatId 与 historyStartTime 为必填项。</li>
     * <li>updateFrequency 可通过 preset 或五段 cron 配置后续同步频率。</li>
     * <li>服务端校验调用方群成员身份和目标群组目录权限；同一群聊可创建为不同 Source。</li>
     * </ul>
     * 
     * @param request the request parameters of CreateGroupDingtalkChat  CreateGroupDingtalkChatRequest
     * @return CreateGroupDingtalkChatResponse
     */
    @Override
    public CompletableFuture<CreateGroupDingtalkChatResponse> createGroupDingtalkChat(CreateGroupDingtalkChatRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateGroupDingtalkChat").setMethod(HttpMethod.POST).setPathRegex("/openapi/createGroupDingtalkChat").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateGroupDingtalkChatResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateGroupDingtalkChatResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明\n\n固定 <code>ONLINE_DOC + FEISHU + GROUP</code>。<code>groupId</code> 必填，<code>directoryId</code> 省略时使用该群知识库根目录；群成员与目录写权限由后端校验。</h2>
     * 
     * @param request the request parameters of CreateGroupFeishuDoc  CreateGroupFeishuDocRequest
     * @return CreateGroupFeishuDocResponse
     */
    @Override
    public CompletableFuture<CreateGroupFeishuDocResponse> createGroupFeishuDoc(CreateGroupFeishuDocRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateGroupFeishuDoc").setMethod(HttpMethod.POST).setPathRegex("/openapi/createGroupFeishuDoc").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateGroupFeishuDocResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateGroupFeishuDocResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于将阿里钉在线文档添加到指定的企业知识库中。</li>
     * <li>调用者必须具备<code>DEVELOPMENT_KB_MANAGE</code>功能权限。</li>
     * <li><code>source_type</code>固定为<code>ONLINE_DOC</code>，<code>platform</code>固定为<code>ALI_DING</code>，<code>scope</code>固定为<code>TENANT</code>。</li>
     * <li>如果不提供<code>directoryId</code>，则默认绑定到当前数字员工的根目录；若提供，则必须是当前租户下的有效目录ID。</li>
     * <li><code>filePublicUrl</code>参数是必需的，表示要上传的阿里钉在线文档的公开访问URL。</li>
     * <li>可选参数包括<code>operatingObjectName</code>（数字员工名称）、<code>description</code>（资源描述）、<code>knowledgeId</code>（知识库ID）和<code>sourceTags</code>（资源标签）等。</li>
     * <li>成功响应会返回新创建资源的相关信息，如<code>sourceId</code>、<code>name</code>、<code>status</code>、<code>directoryId</code>及创建时间等。</li>
     * </ul>
     * 
     * @param request the request parameters of CreateKnowledgeBaseAliDingDoc  CreateKnowledgeBaseAliDingDocRequest
     * @return CreateKnowledgeBaseAliDingDocResponse
     */
    @Override
    public CompletableFuture<CreateKnowledgeBaseAliDingDocResponse> createKnowledgeBaseAliDingDoc(CreateKnowledgeBaseAliDingDocRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateKnowledgeBaseAliDingDoc").setMethod(HttpMethod.POST).setPathRegex("/openapi/createKnowledgeBaseAlidingDoc").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateKnowledgeBaseAliDingDocResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateKnowledgeBaseAliDingDocResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口允许具有<code>DEVELOPMENT_KB_MANAGE</code>权限的用户为企业知识库创建新的分类。</li>
     * <li>创建时可指定父分类ID，若未指定，则新分类将直接挂载于企业知识库根目录下。</li>
     * <li>系统会自动检查同名冲突及目录深度限制等问题。</li>
     * <li><code>tenant_id</code>和<code>user_id</code>仅通过鉴权身份获取，请求体中即使提供也会被忽略。</li>
     * <li>需要确保提供的<code>parentDirectoryId</code>（如果有的话）属于当前租户。</li>
     * </ul>
     * 
     * @param request the request parameters of CreateKnowledgeBaseDirectory  CreateKnowledgeBaseDirectoryRequest
     * @return CreateKnowledgeBaseDirectoryResponse
     */
    @Override
    public CompletableFuture<CreateKnowledgeBaseDirectoryResponse> createKnowledgeBaseDirectory(CreateKnowledgeBaseDirectoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateKnowledgeBaseDirectory").setMethod(HttpMethod.POST).setPathRegex("/openapi/createKnowledgeBaseDirectory").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateKnowledgeBaseDirectoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateKnowledgeBaseDirectoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明\n\n固定 <code>ONLINE_DOC + FEISHU + TENANT</code>。<code>directoryId</code> 必填，调用者必须具备企业知识库功能权限及目标知识库管理权限。</h2>
     * 
     * @param request the request parameters of CreateKnowledgeBaseFeishuDoc  CreateKnowledgeBaseFeishuDocRequest
     * @return CreateKnowledgeBaseFeishuDocResponse
     */
    @Override
    public CompletableFuture<CreateKnowledgeBaseFeishuDocResponse> createKnowledgeBaseFeishuDoc(CreateKnowledgeBaseFeishuDocRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateKnowledgeBaseFeishuDoc").setMethod(HttpMethod.POST).setPathRegex("/openapi/createKnowledgeBaseFeishuDoc").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateKnowledgeBaseFeishuDocResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateKnowledgeBaseFeishuDocResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于向企业知识库中上传文件。</li>
     * <li>需要拥有<code>DEVELOPMENT_KB_MANAGE</code>功能权限才能调用此API。</li>
     * <li>文件上传时必须提供文件的OSS持久化地址(<code>filePath</code>)。</li>
     * <li>可选参数包括文件公开访问URL、原始文件名等，以增强文件信息的完整性。</li>
     * <li>如果指定了<code>directoryId</code>，则文件会被放置在对应的企业知识库目录下；否则，默认绑定到当前数字员工默认根目录。</li>
     * <li>支持通过<code>sourceTags</code>为资源添加标签，便于后续管理和检索。</li>
     * <li>本操作会启动计费账单（UNSTRUCTURED_PARSE），请确保账户余额充足。</li>
     * </ul>
     * 
     * @param request the request parameters of CreateKnowledgeBaseFile  CreateKnowledgeBaseFileRequest
     * @return CreateKnowledgeBaseFileResponse
     */
    @Override
    public CompletableFuture<CreateKnowledgeBaseFileResponse> createKnowledgeBaseFile(CreateKnowledgeBaseFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateKnowledgeBaseFile").setMethod(HttpMethod.POST).setPathRegex("/openapi/createKnowledgeBaseFile").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateKnowledgeBaseFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateKnowledgeBaseFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API用于向企业知识库上传纯文本信息，要求调用者具备相应的管理权限。</li>
     * <li><code>textContent</code>字段为必填项，代表要上传的纯文本内容。</li>
     * <li>可选参数包括数字员工名称(<code>operatingObjectName</code>)、资源描述(<code>description</code>)等，允许用户自定义更多细节。</li>
     * <li>如果提供了<code>directoryId</code>，则会将上传的文本绑定到指定的知识库目录下；若未提供，则默认绑定到当前数字员工的根目录。</li>
     * <li>支持通过<code>sourceTags</code>给资源打标签，方便后续管理和检索。</li>
     * <li>调用此接口前，请确保已正确配置身份验证方式（支持AK、BearerToken及APP认证）并拥有<code>DEVELOPMENT_KB_MANAGE</code>权限。</li>
     * </ul>
     * 
     * @param request the request parameters of CreateKnowledgeBaseText  CreateKnowledgeBaseTextRequest
     * @return CreateKnowledgeBaseTextResponse
     */
    @Override
    public CompletableFuture<CreateKnowledgeBaseTextResponse> createKnowledgeBaseText(CreateKnowledgeBaseTextRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateKnowledgeBaseText").setMethod(HttpMethod.POST).setPathRegex("/openapi/createKnowledgeBaseText").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateKnowledgeBaseTextResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateKnowledgeBaseTextResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>将指定阿里钉群聊接入当前用户的个人知识库。</li>
     * <li>资源类型固定为 ALI_DING，作用范围固定为 PERSONAL，归属用户从网关鉴权身份解析。</li>
     * <li>historyStartTime 为必填项，支持 YYYY-MM-DD 或 YYYY-MM-DD HH:MM:SS。</li>
     * <li>updateFrequency 可通过 preset 或五段 cron 配置后续同步频率。</li>
     * <li>chatId 在目标个人作用域内不可重复。</li>
     * </ul>
     * 
     * @param request the request parameters of CreatePersonalAliDingChat  CreatePersonalAliDingChatRequest
     * @return CreatePersonalAliDingChatResponse
     */
    @Override
    public CompletableFuture<CreatePersonalAliDingChatResponse> createPersonalAliDingChat(CreatePersonalAliDingChatRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreatePersonalAliDingChat").setMethod(HttpMethod.POST).setPathRegex("/openapi/createPersonalAliDingChat").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePersonalAliDingChatResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePersonalAliDingChatResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API用于将阿里钉会议相关资料（如音视频、闪记链接等）上传至指定数字员工的“我的资源”中。</li>
     * <li><code>source_type</code> 固定为 <code>ALI_DING_MEETING</code>，且作用范围 <code>scope</code> 固定为 <code>PERSONAL</code>。</li>
     * <li>必须提供公开的音视频OSS地址 (<code>ossUrl</code>) 和原始的闪记链接 (<code>shanjiUrl</code>)。</li>
     * <li>可选地，可以指定目标个人目录ID (<code>directoryId</code>)；若未指定，则自动绑定到当前数字员工默认根目录。</li>
     * <li>支持添加资源描述 (<code>description</code>) 和会议笔记内容 (<code>notes</code>)，其中会议笔记可用于辅助分析。</li>
     * <li>此操作需要相应的权限认证，支持AK、BearerToken和APP三种认证方式之一。</li>
     * </ul>
     * 
     * @param request the request parameters of CreatePersonalAliDingMeeting  CreatePersonalAliDingMeetingRequest
     * @return CreatePersonalAliDingMeetingResponse
     */
    @Override
    public CompletableFuture<CreatePersonalAliDingMeetingResponse> createPersonalAliDingMeeting(CreatePersonalAliDingMeetingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreatePersonalAliDingMeeting").setMethod(HttpMethod.POST).setPathRegex("/openapi/createPersonalAliDingMeeting").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePersonalAliDingMeetingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePersonalAliDingMeetingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API用于将阿里钉在线文档添加到指定数字员工的&quot;我的资源&quot;中。</li>
     * <li>固定参数包括 <code>source_type=ONLINE_DOC</code>、<code>platform=ALI_DING</code> 和 <code>scope=PERSONAL</code>。</li>
     * <li>如果未提供<code>directoryId</code>，则默认绑定到当前数字员工的根目录；若提供了，则需确保该目录属于当前用户且在当前数字员工下存在。</li>
     * <li>调用过程中会启动计量并记录相关操作日志。</li>
     * <li>安全性方面，<code>tenant_id</code>和<code>user_id</code>仅从鉴权身份获取，调用方提供的这些字段值将被忽略。</li>
     * <li>任何校验或执行失败都会通过服务抛出异常，并转换为POP错误码返回给调用者。</li>
     * </ul>
     * 
     * @param request the request parameters of CreatePersonalAlidingDoc  CreatePersonalAlidingDocRequest
     * @return CreatePersonalAlidingDocResponse
     */
    @Override
    public CompletableFuture<CreatePersonalAlidingDocResponse> createPersonalAlidingDoc(CreatePersonalAlidingDocRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreatePersonalAlidingDoc").setMethod(HttpMethod.POST).setPathRegex("/openapi/createPersonalAliDingDoc").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePersonalAlidingDocResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePersonalAlidingDocResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API用于创建一个阿里钉知识库，并将其挂载到指定数字员工的个人资源目录下。</li>
     * <li><code>platform</code>固定为<code>ALI_DING</code>，<code>directory_type</code>固定为<code>PERSONAL</code>。</li>
     * <li>如果提供了<code>directoryId</code>，则会验证该目录是否存在且属于当前租户和个人类型。</li>
     * <li>创建过程中会初始化知识库根目录（状态设置为<code>RUNNING</code>），并根据提供的同步配置派发后台任务以拉取远程目录树和创建子节点。</li>
     * <li>安全性方面，<code>tenant_id</code>与<code>user_id</code>仅从鉴权身份获取，请求体中的这些字段会被忽略。</li>
     * <li>同步配置可选，若启用需提供cron表达式；未传或禁用时，默认不进行定时同步。</li>
     * <li>知识库名称可以自定义，如果不提供，则会在后台同步后自动填充。</li>
     * <li>支持多值对象绑定，相关信息将被序列化并存储于知识库元数据中。</li>
     * </ul>
     * 
     * @param request the request parameters of CreatePersonalAlidingKnowledgeBase  CreatePersonalAlidingKnowledgeBaseRequest
     * @return CreatePersonalAlidingKnowledgeBaseResponse
     */
    @Override
    public CompletableFuture<CreatePersonalAlidingKnowledgeBaseResponse> createPersonalAlidingKnowledgeBase(CreatePersonalAlidingKnowledgeBaseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreatePersonalAlidingKnowledgeBase").setMethod(HttpMethod.POST).setPathRegex("/openapi/createPersonalAliDingKnowledgeBase").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePersonalAlidingKnowledgeBaseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePersonalAlidingKnowledgeBaseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>将指定普通钉钉群聊接入当前用户的个人知识库。</li>
     * <li>资源类型固定为 DINGTALK，作用范围固定为 PERSONAL，归属用户从网关鉴权身份解析。</li>
     * <li>historyStartTime 为必填项，支持 YYYY-MM-DD 或 YYYY-MM-DD HH:MM:SS。</li>
     * <li>updateFrequency 可通过 preset 或五段 cron 配置后续同步频率。</li>
     * <li>同一群聊可创建为不同 Source，各 Source 按 sourceId 隔离。</li>
     * </ul>
     * 
     * @param request the request parameters of CreatePersonalDingtalkChat  CreatePersonalDingtalkChatRequest
     * @return CreatePersonalDingtalkChatResponse
     */
    @Override
    public CompletableFuture<CreatePersonalDingtalkChatResponse> createPersonalDingtalkChat(CreatePersonalDingtalkChatRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreatePersonalDingtalkChat").setMethod(HttpMethod.POST).setPathRegex("/openapi/createPersonalDingtalkChat").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePersonalDingtalkChatResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePersonalDingtalkChatResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI CreatePersonalDingtalkMeeting is deprecated  * @description ## 请求说明
     * - 该 API 已废弃，请改用 `CreatePersonalDingtalkMinutes`。
     * - 为兼容存量 SDK，本接口保留最初发布的参数名称与必填性，不增加 `shanjiUrl`。
     * - 调用成功后仅返回废弃提示，不校验目录、不计费，也不会创建或修改任何资源。
     * 
     * @param request the request parameters of CreatePersonalDingtalkMeeting  CreatePersonalDingtalkMeetingRequest
     * @return CreatePersonalDingtalkMeetingResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<CreatePersonalDingtalkMeetingResponse> createPersonalDingtalkMeeting(CreatePersonalDingtalkMeetingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreatePersonalDingtalkMeeting").setMethod(HttpMethod.POST).setPathRegex("/openapi/createPersonalDingtalkMeeting").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePersonalDingtalkMeetingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePersonalDingtalkMeetingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该 API 通过普通钉钉闪记链接创建会议资源，采集方式固定为个人 OAuth 对应的 DWS。</li>
     * <li><code>source_type</code> 固定为 <code>DINGTALK_MEETING</code>，且作用范围 <code>scope</code> 固定为 <code>PERSONAL</code>。</li>
     * <li>必须提供普通钉钉闪记链接或 taskUuid（<code>shanjiUrl</code>）。</li>
     * <li>可选地指定目标个人目录 ID（<code>directoryId</code>）；未指定时使用当前数字员工默认根目录。</li>
     * <li>支持添加资源描述（<code>description</code>）和会议笔记（<code>notes</code>）。</li>
     * <li>此操作支持 AK、BearerToken 和 APP 三种认证方式之一。</li>
     * </ul>
     * 
     * @param request the request parameters of CreatePersonalDingtalkMinutes  CreatePersonalDingtalkMinutesRequest
     * @return CreatePersonalDingtalkMinutesResponse
     */
    @Override
    public CompletableFuture<CreatePersonalDingtalkMinutesResponse> createPersonalDingtalkMinutes(CreatePersonalDingtalkMinutesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreatePersonalDingtalkMinutes").setMethod(HttpMethod.POST).setPathRegex("/openapi/createPersonalDingtalkMinutes").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePersonalDingtalkMinutesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePersonalDingtalkMinutesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该 API 用于在“我的资源”下创建个人目录（分类）。</li>
     * <li>若未传 <code>parentDirectoryId</code>，系统将自动使用或创建当前数字员工的默认根目录作为父目录。</li>
     * <li>若传入 <code>parentDirectoryId</code>，则必须是当前用户在当前数字员工下的已有个人目录。</li>
     * <li><code>tenant_id</code> 和 <code>user_id</code> 仅来自鉴权身份，调用方在请求体中传入这些字段会被忽略。</li>
     * </ul>
     * 
     * @param request the request parameters of CreatePersonalDirectory  CreatePersonalDirectoryRequest
     * @return CreatePersonalDirectoryResponse
     */
    @Override
    public CompletableFuture<CreatePersonalDirectoryResponse> createPersonalDirectory(CreatePersonalDirectoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreatePersonalDirectory").setMethod(HttpMethod.POST).setPathRegex("/openapi/createPersonalDirectory").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePersonalDirectoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePersonalDirectoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <p>该 API 使用当前 OpenAPI 身份对应用户已托管的飞书应用连接，通过项目内置 CLI 拉取指定群聊的名称和历史消息，并创建到该用户的个人知识库。</p>
     * <ul>
     * <li><code>chatId</code>：飞书群聊 ID，必须以 <code>oc_</code> 开头。</li>
     * <li><code>directoryId</code>（可选）：目标个人目录 ID；省略时使用当前用户默认个人根目录。</li>
     * <li><code>historyStartTime</code>（可选）：历史消息起始时间，支持 <code>YYYY-MM-DD</code> 或 <code>YYYY-MM-DD HH:MM:SS</code>。</li>
     * <li><code>updateFrequency</code>（可选）：Source 级定时同步配置，支持预设频率或五段 cron。</li>
     * <li><code>description</code>、<code>operatingObjectName</code>、<code>notes</code>、<code>sourceTags</code>：可选的 Source 元数据。
     * 安全约束：Source Type 固定为 FEISHU，知识范围固定为 PERSONAL；飞书连接器用户由 POP 可信身份确定，不接受调用方传入凭证或用户 ID。</li>
     * </ul>
     * 
     * @param request the request parameters of CreatePersonalFeishuChat  CreatePersonalFeishuChatRequest
     * @return CreatePersonalFeishuChatResponse
     */
    @Override
    public CompletableFuture<CreatePersonalFeishuChatResponse> createPersonalFeishuChat(CreatePersonalFeishuChatRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreatePersonalFeishuChat").setMethod(HttpMethod.POST).setPathRegex("/openapi/createPersonalFeishuChat").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePersonalFeishuChatResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePersonalFeishuChatResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明\n\n固定 <code>ONLINE_DOC + FEISHU + PERSONAL</code>，飞书连接器用户由可信 OpenAPI 身份确定。<code>directoryId</code> 省略时使用当前用户默认个人根目录。</h2>
     * 
     * @param request the request parameters of CreatePersonalFeishuDoc  CreatePersonalFeishuDocRequest
     * @return CreatePersonalFeishuDocResponse
     */
    @Override
    public CompletableFuture<CreatePersonalFeishuDocResponse> createPersonalFeishuDoc(CreatePersonalFeishuDocRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreatePersonalFeishuDoc").setMethod(HttpMethod.POST).setPathRegex("/openapi/createPersonalFeishuDoc").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePersonalFeishuDocResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePersonalFeishuDocResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <p>该 API 用于将飞书妙记中的会议记录上传至指定数字员工的&quot;我的资源&quot;中。通过提供必要的参数，如飞书妙记的唯一标识符（<code>minuteToken</code>）和凭证 ID（<code>credentialId</code>），可以实现会议内容的迁移与保存。若未指定目标目录，则默认绑定到当前数字员工下的根目录。</p>
     * <ul>
     * <li><code>operatingObjectName</code>：执行操作的数字员工名称。</li>
     * <li><code>name</code>：上传后资源在系统内的显示名称。</li>
     * <li><code>minuteToken</code>：来自飞书妙记平台的会议唯一标识符。</li>
     * <li><code>credentialId</code>：关联到特定认证信息的ID，用于验证请求合法性。</li>
     * <li><code>directoryId</code>（可选）：指定要存放资源的目标个人目录ID；如果省略此字段，则资源将被自动放置于默认位置。</li>
     * <li><code>description</code>（可选）：对所上传资源的简短描述或备注。
     * 注意事项：</li>
     * <li>确保提供的 <code>minuteToken</code> 和 <code>credentialId</code> 的有效性。</li>
     * <li>当指定了 <code>directoryId</code> 时，请确认其属于调用者在当前数字员工环境下的可用个人目录之一。</li>
     * </ul>
     * 
     * @param request the request parameters of CreatePersonalFeishuMinute  CreatePersonalFeishuMinuteRequest
     * @return CreatePersonalFeishuMinuteResponse
     */
    @Override
    public CompletableFuture<CreatePersonalFeishuMinuteResponse> createPersonalFeishuMinute(CreatePersonalFeishuMinuteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreatePersonalFeishuMinute").setMethod(HttpMethod.POST).setPathRegex("/openapi/createPersonalFeishuMinute").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePersonalFeishuMinuteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePersonalFeishuMinuteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API用于将文件上传到指定数字员工的&quot;我的资源&quot;中。</li>
     * <li><code>source_type</code> 固定为 <code>FILE</code>，<code>scope</code> 固定为 <code>PERSONAL</code>，<code>platform</code> 固定为 <code>LOCAL</code>。</li>
     * <li>文件必须提供OSS持久化地址 (<code>filePath</code>)，其他如公开访问URL、原始文件名等信息可选提供。</li>
     * <li>如果不指定目标目录ID (<code>directoryId</code>)，则文件会被自动绑定到当前数字员工默认根目录下；如果指定，则需确保该目录属于调用者的个人目录。</li>
     * <li>支持通过多种认证方式（AK、BearerToken、APP）进行安全验证。</li>
     * <li>操作类型为写入(<code>write</code>)，并记录操作日志以供后续审计使用。</li>
     * </ul>
     * 
     * @param request the request parameters of CreatePersonalFile  CreatePersonalFileRequest
     * @return CreatePersonalFileResponse
     */
    @Override
    public CompletableFuture<CreatePersonalFileResponse> createPersonalFile(CreatePersonalFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreatePersonalFile").setMethod(HttpMethod.POST).setPathRegex("/openapi/createPersonalFile").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePersonalFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePersonalFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API用于向指定数字员工的个人资源中添加纯文本内容。</li>
     * <li><code>source_type</code> 固定为 <code>TEXT</code>，<code>scope</code> 固定为 <code>PERSONAL</code>。</li>
     * <li>如果不提供<code>directoryId</code>，则默认绑定到当前数字员工的根目录；若提供，则必须是调用者在该数字员工下的已有个人目录。</li>
     * <li><code>tenant_id</code> 和 <code>user_id</code> 只能来自鉴权身份信息，通过请求体传递这些参数将被忽略。</li>
     * <li>调用过程中会启动计量并生成相应的<code>billing_id</code>。</li>
     * <li>文本内容将被写入<code>unstructured_docs</code>，并生成初始资源记录。</li>
     * <li>任何校验或执行失败都将抛出<code>RobjectException</code>异常，并由全局中间件转换为POP错误码返回给调用方。</li>
     * </ul>
     * 
     * @param request the request parameters of CreatePersonalText  CreatePersonalTextRequest
     * @return CreatePersonalTextResponse
     */
    @Override
    public CompletableFuture<CreatePersonalTextResponse> createPersonalText(CreatePersonalTextRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreatePersonalText").setMethod(HttpMethod.POST).setPathRegex("/openapi/createPersonalText").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePersonalTextResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePersonalTextResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API用于将离线会议的音频文件上传到指定数字员工的“我的资源”中。</li>
     * <li><code>source_type</code>固定为<code>VOICE_MEETING</code>，<code>scope</code>固定为<code>PERSONAL</code>，且<code>voice_meeting_type</code>固定为<code>OFFLINE</code>。</li>
     * <li>如果请求体中未提供<code>directoryId</code>，则资源将自动绑定到默认根目录；若提供了<code>directoryId</code>，则必须是当前用户在当前数字员工下的已有个人目录。</li>
     * <li>调用此接口会启动一个后台流程来处理音频文件转写，并返回新建资源的相关信息。</li>
     * <li>安全性方面，<code>tenant_id</code>和<code>user_id</code>仅从鉴权身份获取，即使请求体中包含这些字段也会被忽略。</li>
     * <li>任何校验或执行失败都会抛出<code>RobjectException</code>，并通过全局中间件转换为POP错误码。</li>
     * </ul>
     * 
     * @param request the request parameters of CreatePersonalVoiceMeeting  CreatePersonalVoiceMeetingRequest
     * @return CreatePersonalVoiceMeetingResponse
     */
    @Override
    public CompletableFuture<CreatePersonalVoiceMeetingResponse> createPersonalVoiceMeeting(CreatePersonalVoiceMeetingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreatePersonalVoiceMeeting").setMethod(HttpMethod.POST).setPathRegex("/openapi/createPersonalVoiceMeeting").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePersonalVoiceMeetingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePersonalVoiceMeetingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateScheduledTask  CreateScheduledTaskRequest
     * @return CreateScheduledTaskResponse
     */
    @Override
    public CompletableFuture<CreateScheduledTaskResponse> createScheduledTask(CreateScheduledTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateScheduledTask").setMethod(HttpMethod.POST).setPathRegex("/openapi/createScheduledTask").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateScheduledTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateScheduledTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该 API 用于在指定租户下创建新的企业知识库目录。</li>
     * <li>可以通过设置 <code>parentId</code> 参数来指定新目录的父目录，如果不传则默认创建为根目录。</li>
     * <li><code>path</code> 参数可选，不提供时系统会根据父目录自动计算路径。</li>
     * <li>调用此接口需要具备相应的权限，并且支持多种认证方式包括 AK、BearerToken 和 APP 认证。</li>
     * <li>创建成功后返回新目录的相关信息，如目录 ID、名称等。</li>
     * </ul>
     * 
     * @param request the request parameters of CreateTenantDirectory  CreateTenantDirectoryRequest
     * @return CreateTenantDirectoryResponse
     */
    @Override
    public CompletableFuture<CreateTenantDirectoryResponse> createTenantDirectory(CreateTenantDirectoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateTenantDirectory").setMethod(HttpMethod.POST).setPathRegex("/openapi/createTenantDirectory").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTenantDirectoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTenantDirectoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>OpenAPI 创建用户。
     *     业务编排：
     *     1. 按有效配置与可选 ssoProvider 解析唯一登录方式；仅当主账号 ACTIVE 订阅授权目标租户时，公共云网关链路兼容无租户 SSO 绑定的唯一 AGENT_ONE
     *     2. 解析 roleCodes → role_ids（系统角色枚举校验）
     *     3. 判断用户是否已存在（用于返回 isNewUser 标记）
     *     4. 调用 UserManagementService.add_tenant_member 完成创建/加入
     *     5. 返回创建结果（含 isNewUser 标记）
     *     错误码：
     *     - ERR.User.DeactivatedInTenant: 用户在租户中已停用，请使用 updateUser 恢复
     *     - ERR.User.AlreadyInTenant: 用户已是租户活跃成员
     *     - ERR.User.DisplayNameDuplicateInTenant: 租户内显示名重复
     *     - ERR.User.CreateUserSsoProviderRequired: 多个外部 provider，无法唯一选择
     *     - ERR.User.CreateUserSsoProviderUnavailable: provider 未绑定、未启用或暂不支持
     *     - ERR.User.CreateUserRamAccountRequired: 公共云 RAM 登录方式传入了阿里云主账号</p>
     * 
     * @param request the request parameters of CreateUser  CreateUserRequest
     * @return CreateUserResponse
     */
    @Override
    public CompletableFuture<CreateUserResponse> createUser(CreateUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateUser").setMethod(HttpMethod.POST).setPathRegex("/openapi/createUser").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>WinNexo 用户管理 OpenAPI：创建用户组。租户身份来自鉴权上下文。</p>
     * 
     * @param request the request parameters of CreateUserGroup  CreateUserGroupRequest
     * @return CreateUserGroupResponse
     */
    @Override
    public CompletableFuture<CreateUserGroupResponse> createUserGroup(CreateUserGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateUserGroup").setMethod(HttpMethod.POST).setPathRegex("/openapi/createUserGroup").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateUserGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateUserGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>OpenAPI 创建用户并设置初始角色和用户组。
     *     业务编排：
     *     1. 解析 roleCodes → role_ids（系统角色枚举校验）
     *     2. 判断用户是否已存在（用于返回 isNewUser 标记）
     *     3. 校验 userGroupIds 的租户归属并完成创建/加入（密码由调用方强制传入 RSA 密文）
     *     4. 返回创建结果（含 isNewUser 标记）
     *     错误码：
     *     - ERR.User.DeactivatedInTenant: 用户在租户中已停用，请使用 updateUser 恢复
     *     - ERR.User.AlreadyInTenant: 用户已是租户活跃成员
     *     - ERR.User.DisplayNameDuplicateInTenant: 租户内显示名重复</p>
     * 
     * @param request the request parameters of CreateUserWithGroups  CreateUserWithGroupsRequest
     * @return CreateUserWithGroupsResponse
     */
    @Override
    public CompletableFuture<CreateUserWithGroupsResponse> createUserWithGroups(CreateUserWithGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateUserWithGroups").setMethod(HttpMethod.POST).setPathRegex("/openapi/createUserWithGroups").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateUserWithGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateUserWithGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteChatSession  DeleteChatSessionRequest
     * @return DeleteChatSessionResponse
     */
    @Override
    public CompletableFuture<DeleteChatSessionResponse> deleteChatSession(DeleteChatSessionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteChatSession").setMethod(HttpMethod.DELETE).setPathRegex("/openapi/deleteChatSession").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteChatSessionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteChatSessionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li><code>tenantId</code> 仅来自鉴权身份；调用方传入会被忽略。</li>
     * <li><code>sourceId</code> 通过 body 传递，注册路径为扁平的 <code>/openapi/deleteSource</code>，不含 <code>{sourceId}</code> 路径模板；请勿以路径段形式追加资源 ID，网关按扁平 URI 精确路由，会回 <code>InvalidAction.NotFound</code>。</li>
     * <li>删除为不可逆操作，资源关联的解析结果与绑定关系会一并失效。</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteSource  DeleteSourceRequest
     * @return DeleteSourceResponse
     */
    @Override
    public CompletableFuture<DeleteSourceResponse> deleteSource(DeleteSourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteSource").setMethod(HttpMethod.POST).setPathRegex("/openapi/deleteSource").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API允许用户删除特定的企业知识库目录。</li>
     * <li>用户可以通过设置<code>deleteMode</code>参数来选择不同的删除策略，包括拒绝删除（reject）、递归删除（recursive）或将目录移动到根目录（move_to_root）。</li>
     * <li>如果不提供<code>deleteMode</code>，默认行为是拒绝删除。</li>
     * <li>删除操作前会校验企业目录边界。</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteTenantDirectory  DeleteTenantDirectoryRequest
     * @return DeleteTenantDirectoryResponse
     */
    @Override
    public CompletableFuture<DeleteTenantDirectoryResponse> deleteTenantDirectory(DeleteTenantDirectoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteTenantDirectory").setMethod(HttpMethod.POST).setPathRegex("/openapi/deleteTenantDirectory").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteTenantDirectoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteTenantDirectoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>关闭用户的 INSTANCE Token。
     *     业务逻辑：
     *     1. 从 identity 取 user_id（强制 caller_type=user）
     *     2. 构造 AuthContext，委托 UserTokenAuthorizedService 完成权限校验
     *     3. 调用 disable_token（ACTIVE → INACTIVE）
     *     4. 返回 disabled=True
     *     幂等性：若当前无 ACTIVE Token，deactivate_all 影响 0 行，不报错。</p>
     * 
     * @param request the request parameters of DisableToken  DisableTokenRequest
     * @return DisableTokenResponse
     */
    @Override
    public CompletableFuture<DisableTokenResponse> disableToken(DisableTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DisableToken").setMethod(HttpMethod.POST).setPathRegex("/openapi/disableToken").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableTokenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>开启用户的 INSTANCE Token（幂等）。
     *     业务逻辑：
     *     1. 从 identity 取 user_id（强制 caller_type=user）
     *     2. 构造 AuthContext，委托 UserTokenAuthorizedService 完成权限校验
     *     3. 调用 enable_token：
     *        - 已有 ACTIVE → 幂等返回（仅脱敏值，不重复下发明文）
     *        - 有 INACTIVE → 重新激活（返回明文）
     *        - 都没有 → 新建（返回明文）
     *     安全约束：Token 明文仅在首次开启时返回一次，后续幂等调用不再下发明文。</p>
     * 
     * @param request the request parameters of EnableToken  EnableTokenRequest
     * @return EnableTokenResponse
     */
    @Override
    public CompletableFuture<EnableTokenResponse> enableToken(EnableTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("EnableToken").setMethod(HttpMethod.POST).setPathRegex("/openapi/enableToken").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableTokenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetChatSession  GetChatSessionRequest
     * @return GetChatSessionResponse
     */
    @Override
    public CompletableFuture<GetChatSessionResponse> getChatSession(GetChatSessionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetChatSession").setMethod(HttpMethod.GET).setPathRegex("/openapi/getChatSession").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetChatSessionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetChatSessionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>读取 active schema_content，并按 Token 用户的语义资源 READ 权限安全裁剪。</p>
     * 
     * @param request the request parameters of GetGraphSchema  GetGraphSchemaRequest
     * @return GetGraphSchemaResponse
     */
    @Override
    public CompletableFuture<GetGraphSchemaResponse> getGraphSchema(GetGraphSchemaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetGraphSchema").setMethod(HttpMethod.POST).setPathRegex("/openapi/getGraphSchema").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetGraphSchemaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetGraphSchemaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API用于查询指定租户下最新创建的标准包实例的过期时间。</li>
     * <li>如果未找到相关标准包实例，<code>found</code> 字段将返回 <code>False</code>。</li>
     * <li>支持通过 <code>tenantId</code> 参数指定查询的租户ID，默认使用调用方的租户ID。</li>
     * <li>请求方法为 POST，且需要通过 HTTPS 协议进行调用。</li>
     * <li>需要提供有效的认证信息（如 AK、BearerToken 或 APP）以完成请求。</li>
     * </ul>
     * 
     * @param request the request parameters of GetInstanceExpireTime  GetInstanceExpireTimeRequest
     * @return GetInstanceExpireTimeResponse
     */
    @Override
    public CompletableFuture<GetInstanceExpireTimeResponse> getInstanceExpireTime(GetInstanceExpireTimeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetInstanceExpireTime").setMethod(HttpMethod.POST).setPathRegex("/openapi/getInstanceExpireTime").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetInstanceExpireTimeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetInstanceExpireTimeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该 API 用于获取企业知识库下特定知识的详情。</li>
     * <li>调用此接口需要具备 <code>DEVELOPMENT_KB_VIEW</code> 功能权限。</li>
     * <li>知识详情包括但不限于知识类型、名称、描述等。</li>
     * <li>请求时必须提供 <code>sourceId</code> 参数，标识要查询的知识。</li>
     * <li><code>tenantId</code> 是可选参数，默认使用调用方的租户ID。</li>
     * <li>支持通过 <code>AK</code>、<code>BearerToken</code> 或 <code>APP</code> 方式进行鉴权。</li>
     * <li>安全约束：<code>tenant_id</code> 和 <code>user_id</code> 只能来自鉴权身份。</li>
     * </ul>
     * 
     * @param request the request parameters of GetKnowledgeBaseSource  GetKnowledgeBaseSourceRequest
     * @return GetKnowledgeBaseSourceResponse
     */
    @Override
    public CompletableFuture<GetKnowledgeBaseSourceResponse> getKnowledgeBaseSource(GetKnowledgeBaseSourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetKnowledgeBaseSource").setMethod(HttpMethod.POST).setPathRegex("/openapi/getKnowledgeBaseSource").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetKnowledgeBaseSourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetKnowledgeBaseSourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetScheduledTaskExecutionDetail  GetScheduledTaskExecutionDetailRequest
     * @return GetScheduledTaskExecutionDetailResponse
     */
    @Override
    public CompletableFuture<GetScheduledTaskExecutionDetailResponse> getScheduledTaskExecutionDetail(GetScheduledTaskExecutionDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetScheduledTaskExecutionDetail").setMethod(HttpMethod.GET).setPathRegex("/openapi/getScheduledTaskExecutionDetail").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetScheduledTaskExecutionDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetScheduledTaskExecutionDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetScheduledTaskExecutionRecords  GetScheduledTaskExecutionRecordsRequest
     * @return GetScheduledTaskExecutionRecordsResponse
     */
    @Override
    public CompletableFuture<GetScheduledTaskExecutionRecordsResponse> getScheduledTaskExecutionRecords(GetScheduledTaskExecutionRecordsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetScheduledTaskExecutionRecords").setMethod(HttpMethod.GET).setPathRegex("/openapi/getScheduledTaskExecutionRecords").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetScheduledTaskExecutionRecordsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetScheduledTaskExecutionRecordsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>查询当前用户可用于定时任务推送的渠道与方式。</p>
     * 
     * @param request the request parameters of GetScheduledTaskPushOptions  GetScheduledTaskPushOptionsRequest
     * @return GetScheduledTaskPushOptionsResponse
     */
    @Override
    public CompletableFuture<GetScheduledTaskPushOptionsResponse> getScheduledTaskPushOptions(GetScheduledTaskPushOptionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetScheduledTaskPushOptions").setMethod(HttpMethod.POST).setPathRegex("/openapi/getScheduledTaskPushOptions").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetScheduledTaskPushOptionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetScheduledTaskPushOptionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI GetScheduledTaskUnderstandDetail is deprecated  * @description **本接口已下线**：任务理解能力已整体下线，后端不再提供任何业务逻辑，任何调用均返回 Code=OperationDenied.ApiOffline（httpStatusCode=410）。保留 operation 而非下线，是为了让存量 SDK 调用拿到明确的下线错误码，而不是与「路径写错」无法区分的 404。请迁移到 CreateScheduledTask，直接以 segments 传入任务描述。
     * 
     * @param request the request parameters of GetScheduledTaskUnderstandDetail  GetScheduledTaskUnderstandDetailRequest
     * @return GetScheduledTaskUnderstandDetailResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<GetScheduledTaskUnderstandDetailResponse> getScheduledTaskUnderstandDetail(GetScheduledTaskUnderstandDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetScheduledTaskUnderstandDetail").setMethod(HttpMethod.GET).setPathRegex("/openapi/getScheduledTaskUnderstandDetail").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetScheduledTaskUnderstandDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetScheduledTaskUnderstandDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <p>根据 SkillCode 或 SkillName 查询技能详情，包括元数据、入参 Schema、SKILL.md 摘要等。</p>
     * <ul>
     * <li><strong>TenantId</strong>：可选公共参数，由网关透传到后端 Header；不传时使用当前调用方的默认租户。</li>
     * <li><strong>SkillCode</strong>：与 SkillName 二选一；同时传入时 SkillCode 优先。</li>
     * <li><strong>SkillName</strong>：与 SkillCode 二选一；租户内不唯一时返回 <code>ERR.SkillHub.SkillNameAmbiguous</code>。</li>
     * <li><strong>ViewMode</strong>：可选，<code>draft</code>（草稿/编辑视角）或 <code>published</code>（已发布视角，默认）。</li>
     * <li><strong>IncludeSkillFiles</strong>：可选，是否返回完整技能文件树（SKILL.md / scripts / templates），默认 <code>false</code>。</li>
     * </ul>
     * 
     * @param request the request parameters of GetSkill  GetSkillRequest
     * @return GetSkillResponse
     */
    @Override
    public CompletableFuture<GetSkillResponse> getSkill(GetSkillRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetSkill").setMethod(HttpMethod.POST).setPathRegex("/openapi/getSkill").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSkillResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSkillResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <p>通过 <code>RunId</code> 查询异步任务的当前状态与结果。</p>
     * <ul>
     * <li><strong>状态机</strong>：Running（PENDING/RUNNING）→ Succeeded / Failed / Cancelled</li>
     * <li><strong>TenantId</strong>：可选公共参数，由网关透传；后端会校验 RunId 必须属于当前租户，否则统一返回 <code>ERR.SkillHub.RunNotFound</code>（避免泄漏存在性）。</li>
     * <li><strong>IncludeLogs</strong>：可选，是否返回执行日志，默认 <code>false</code>。
     * 执行成功时 <code>Result.Content[]</code> 为 MCP 风格 Content 块数组（Text / File / Image）。</li>
     * </ul>
     * 
     * @param request the request parameters of GetSkillRun  GetSkillRunRequest
     * @return GetSkillRunResponse
     */
    @Override
    public CompletableFuture<GetSkillRunResponse> getSkillRun(GetSkillRunRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetSkillRun").setMethod(HttpMethod.POST).setPathRegex("/openapi/getSkillRun").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSkillRunResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSkillRunResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li><code>tenant_id</code> 仅来自鉴权身份；调用方在 body 中传入会被忽略。</li>
     * <li>出参不暴露 <code>creator</code> / <code>modifier</code> 等审计字段；<code>unstructured_docs[ ].content</code> 默认不返回，以避免大体积响应。</li>
     * <li>通过设置 <code>includeDetails</code> 参数为 <code>True</code> 可以获取包括 <code>settings</code>, <code>notes</code>, <code>structuredTables</code>, 和 <code>unstructuredDocs</code> 在内的更多细节信息。</li>
     * </ul>
     * 
     * @param request the request parameters of GetSource  GetSourceRequest
     * @return GetSourceResponse
     */
    @Override
    public CompletableFuture<GetSourceResponse> getSource(GetSourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetSource").setMethod(HttpMethod.POST).setPathRegex("/openapi/getSource").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <p>该API允许调用方根据提供的文件名等信息，获取一个可用于直接上传文件至阿里云OSS（对象存储服务）的签名URL。通过此URL，用户可以将文件直接上传至指定的OSS位置而无需经过中间服务器转发，从而提高效率和安全性。</p>
     * <ul>
     * <li><strong>安全约束</strong>：<code>tenant_id</code>/<code>user_id</code>仅来自鉴权身份，即使在请求体中提供也会被忽略。</li>
     * <li><strong>默认值</strong>：如果未指定<code>expires</code>参数，则默认过期时间为3600秒（即1小时）。</li>
     * <li><strong>Content-Type</strong>：如果不提供<code>contentType</code>，系统会尝试自动推断文件类型。</li>
     * <li><strong>归属范围</strong>：通过<code>scope</code>参数定义数据源是属于个人还是企业知识库，默认情况下可能不需要设置。</li>
     * </ul>
     * 
     * @param request the request parameters of GetSourceUploadSignature  GetSourceUploadSignatureRequest
     * @return GetSourceUploadSignatureResponse
     */
    @Override
    public CompletableFuture<GetSourceUploadSignatureResponse> getSourceUploadSignature(GetSourceUploadSignatureRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetSourceUploadSignature").setMethod(HttpMethod.POST).setPathRegex("/openapi/getSourceUploadSignature").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSourceUploadSignatureResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSourceUploadSignatureResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>获取用户的 INSTANCE Token，并确保其处于生效状态（幂等）。
     *     业务逻辑：
     *     1. 从 identity 取 user_id（强制 caller_type=user）
     *     2. 构造 AuthContext，委托 UserTokenAuthorizedService 完成权限校验
     *     3. 调用 ensure_active_token：
     *        - 已有 ACTIVE → 原样返回该 Token 明文（不重置、不换密钥）
     *        - 有 INACTIVE → 自动重新启用并返回明文
     *        - 都没有（或仅有已失效的 RESET 记录）→ 新建并返回明文
     *     与 EnableToken 的差异：EnableToken 在已有 ACTIVE Token 时只回脱敏值，
     *     本接口保证在不破坏已有 Token 的前提下一定返回可用的明文凭证。</p>
     * 
     * @param request the request parameters of GetTokenEnsureEnable  GetTokenEnsureEnableRequest
     * @return GetTokenEnsureEnableResponse
     */
    @Override
    public CompletableFuture<GetTokenEnsureEnableResponse> getTokenEnsureEnable(GetTokenEnsureEnableRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetTokenEnsureEnable").setMethod(HttpMethod.POST).setPathRegex("/openapi/getTokenEnsureEnable").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTokenEnsureEnableResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTokenEnsureEnableResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>查询用户的 INSTANCE Token 状态。
     *     业务逻辑：
     *     1. 从 identity 取 user_id（强制 caller_type=user）
     *     2. 构造 AuthContext，委托 UserTokenAuthorizedService 完成权限校验
     *     3. 查询 ACTIVE INSTANCE Token
     *     4. 存在 → 返回 enabled=True + 脱敏值 + 创建时间
     *     5. 不存在 → 返回 enabled=False</p>
     * 
     * @param request the request parameters of GetTokenInfo  GetTokenInfoRequest
     * @return GetTokenInfoResponse
     */
    @Override
    public CompletableFuture<GetTokenInfoResponse> getTokenInfo(GetTokenInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetTokenInfo").setMethod(HttpMethod.POST).setPathRegex("/openapi/getTokenInfo").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTokenInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTokenInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>OpenAPI 查询用户详情。
     *     业务编排：
     *     1. 按 wnUserId 或平台 accountId 定位 WINNEXO/BUC/SSO 用户
     *     2. 校验用户是当前租户正式成员（排除 RECEIVER）并查询映射信息（状态、加入时间、最后登录）
     *     3. 查询用户在当前租户的角色列表
     *     4. 查询用户在当前租户的用户组列表
     *     5. 组装响应
     *     错误码：
     *     - ERR.User.NotFound: 用户不存在或不是正式成员
     *     - ERR.User.NotInTenant: 用户不在当前租户下</p>
     * 
     * @param request the request parameters of GetUser  GetUserRequest
     * @return GetUserResponse
     */
    @Override
    public CompletableFuture<GetUserResponse> getUser(GetUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetUser").setMethod(HttpMethod.POST).setPathRegex("/openapi/getUser").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API用于获取当前登录用户的信用使用详情，包括信用限额、已消耗的信用额度以及剩余信用额度。</li>
     * <li>数据来源于Redis实时缓存，确保了信息的即时性。</li>
     * <li>支持通过租户ID来指定查询特定租户下的用户信用使用情况，默认情况下将使用调用方的默认租户。</li>
     * <li>请求时可选择提供<code>RequestId</code>作为请求标识符，但这不是必需的。</li>
     * </ul>
     * 
     * @param request the request parameters of GetUserCreditUsage  GetUserCreditUsageRequest
     * @return GetUserCreditUsageResponse
     */
    @Override
    public CompletableFuture<GetUserCreditUsageResponse> getUserCreditUsage(GetUserCreditUsageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetUserCreditUsage").setMethod(HttpMethod.POST).setPathRegex("/openapi/getUserCreditUsage").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetUserCreditUsageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetUserCreditUsageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>WinNexo 用户管理 OpenAPI：查询用户组详情。租户身份来自鉴权上下文。</p>
     * 
     * @param request the request parameters of GetUserGroup  GetUserGroupRequest
     * @return GetUserGroupResponse
     */
    @Override
    public CompletableFuture<GetUserGroupResponse> getUserGroup(GetUserGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetUserGroup").setMethod(HttpMethod.POST).setPathRegex("/openapi/getUserGroup").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetUserGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetUserGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于返回当前鉴权用户的详细信息。</li>
     * <li>当租户信息失效时，将返回对应的错误信息。</li>
     * <li><code>tenantId</code>为可选参数，若未提供，则使用调用方默认的租户ID。</li>
     * <li>支持多种认证方式：AK、BearerToken和APP认证。</li>
     * <li>返回的数据中包含了用户的个人资料（如用户名、头像链接）、角色偏好设置以及所属的所有租户详情。</li>
     * <li>特别注意，如果当前登录的租户是系统租户（即<code>tenantId=10000</code>），则会在响应中明确标识出来。</li>
     * </ul>
     * 
     * @param request the request parameters of GetUserInfo  GetUserInfoRequest
     * @return GetUserInfoResponse
     */
    @Override
    public CompletableFuture<GetUserInfoResponse> getUserInfo(GetUserInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetUserInfo").setMethod(HttpMethod.GET).setPathRegex("/openapi/getUserInfo").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetUserInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetUserInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>授权用户或用户组使用指定数字员工。
     *     业务逻辑：
     *     1. 从 identity 构造 AuthContext
     *     2. 请求体互斥校验：userIds / userGroupIds 二选一
     *     3. 委托 AgentAuthorizationAuthorizedService.grant_authorization 执行
     *     4. 前置校验：MANAGE 权限 + agent 存在性（由 AuthorizedService 层执行，先鉴权后暴露存在性）
     *     5. 已存在的授权记录会被更新（expire_date / permissions）</p>
     * 
     * @param request the request parameters of GrantAgentUsers  GrantAgentUsersRequest
     * @return GrantAgentUsersResponse
     */
    @Override
    public CompletableFuture<GrantAgentUsersResponse> grantAgentUsers(GrantAgentUsersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GrantAgentUsers").setMethod(HttpMethod.POST).setPathRegex("/openapi/grantAgentUsers").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GrantAgentUsersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GrantAgentUsersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <p>分页查询当前数据库时间窗口内生效的已发布平台公告。调用身份必须是系统运维租户中拥有公告查看权限的真实用户。</p>
     * 
     * @param request the request parameters of ListActiveAnnouncements  ListActiveAnnouncementsRequest
     * @return ListActiveAnnouncementsResponse
     */
    @Override
    public CompletableFuture<ListActiveAnnouncementsResponse> listActiveAnnouncements(ListActiveAnnouncementsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListActiveAnnouncements").setMethod(HttpMethod.POST).setPathRegex("/openapi/listActiveAnnouncements").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListActiveAnnouncementsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListActiveAnnouncementsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该 API 支持两种模式：当 <code>directoryId</code> 为空或为 &#39;root&#39; 时，返回知识库的顶层列表；当 <code>directoryId</code> 有具体值时，则进行下钻操作，返回指定目录下的子目录和资源。</li>
     * <li><code>tenantId</code> 作为公共参数，若未提供则默认使用调用方的租户 ID。</li>
     * <li>在下钻模式下（即 <code>directoryId</code> 非空），可以通过 <code>sourceTypes</code> 参数来过滤特定类型的资源。</li>
     * <li>排序字段 (<code>sortField</code>) 和排序方向 (<code>sortOrder</code>) 可以自定义，但非法值将被重置为默认设置。</li>
     * <li>搜索功能仅在获取顶层列表时有效，并且只支持模糊匹配名称或描述。</li>
     * <li>安全性方面，<code>tenant_id</code> 严格从鉴权身份中获取，不允许通过请求体传递。</li>
     * </ul>
     * 
     * @param request the request parameters of ListAdminKnowledgeBases  ListAdminKnowledgeBasesRequest
     * @return ListAdminKnowledgeBasesResponse
     */
    @Override
    public CompletableFuture<ListAdminKnowledgeBasesResponse> listAdminKnowledgeBases(ListAdminKnowledgeBasesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAdminKnowledgeBases").setMethod(HttpMethod.POST).setPathRegex("/openapi/listAdminKnowledgeBases").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAdminKnowledgeBasesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAdminKnowledgeBasesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>查询租户下全部数字员工列表（含停用）。
     *     业务逻辑：
     *     1. 从 identity 构造 AuthContext
     *     2. 委托 AgentAuthorizationAuthorizedService.list_agents 完成权限校验（APPLICATION_AGENT_VIEW）
     *     3. 返回租户全量数字员工的富字段（operatingObjectName / displayName / authMode / isActive）
     *     4. 系统级 Token 通过 ctx.skip_permission 自动放行
     *     与 listAuthorizedAgents 区别：本接口返回租户全量（含停用、不做授权过滤），
     *     并携带 displayName / isActive 等富字段，供管理端展示。</p>
     * 
     * @param request the request parameters of ListAgents  ListAgentsRequest
     * @return ListAgentsResponse
     */
    @Override
    public CompletableFuture<ListAgentsResponse> listAgents(ListAgentsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAgents").setMethod(HttpMethod.POST).setPathRegex("/openapi/listAgents").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAgentsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAgentsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>查询当前调用方（或指定目标用户）拥有指定权限（USE/MANAGE）的数字员工名称列表。
     *     业务逻辑：
     *     1. 从 identity 构造 AuthContext
     *     2. 委托 AgentAuthorizationAuthorizedService.list_authorized_agents 执行查询
     *     3. skip_permission=True 时返回租户全量活跃 agent
     *     4. 普通用户根据授权记录 + auth_mode 过滤
     *     5. 传入 targetUserId（代查他人）时需 APPLICATION_AGENT_VIEW 门控，查询限定本租户；
     *        目标用户非本租户成员时抛 USER_NOT_IN_TENANT（不静默返回空列表）</p>
     * 
     * @param request the request parameters of ListAuthorizedAgents  ListAuthorizedAgentsRequest
     * @return ListAuthorizedAgentsResponse
     */
    @Override
    public CompletableFuture<ListAuthorizedAgentsResponse> listAuthorizedAgents(ListAuthorizedAgentsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAuthorizedAgents").setMethod(HttpMethod.POST).setPathRegex("/openapi/listAuthorizedAgents").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAuthorizedAgentsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAuthorizedAgentsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>查询某数字员工已授权的用户/用户组列表。
     *     业务逻辑：
     *     1. 从 identity 构造 AuthContext
     *     2. 委托 AgentAuthorizationAuthorizedService.list_authorized_users 执行查询
     *     3. 权限校验由 AuthorizedService 层 @require_permission(APPLICATION_AGENT_VIEW) 完成
     *     4. auth_mode=ALL_USERS 时仅展示有 MANAGE 权限的记录</p>
     * 
     * @param request the request parameters of ListAuthorizedUsers  ListAuthorizedUsersRequest
     * @return ListAuthorizedUsersResponse
     */
    @Override
    public CompletableFuture<ListAuthorizedUsersResponse> listAuthorizedUsers(ListAuthorizedUsersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAuthorizedUsers").setMethod(HttpMethod.POST).setPathRegex("/openapi/listAuthorizedUsers").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAuthorizedUsersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAuthorizedUsersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>枚举当前租户下所有可用的组织同步配置。
     *     返回统一格式的 configs 列表，涵盖四种平台类型：
     *     - <strong>wecom</strong>：从 SsoProviderRegistry 获取活跃的企微 SSO 配置
     *     - <strong>saml</strong>：从 SsoProviderRegistry 获取活跃的 SAML SSO 配置，corpId 取 idpEntityId
     *     - <strong>oauth2</strong>：从 SsoProviderRegistry 获取活跃的 OAuth2 SSO 配置，corpId 取 clientId
     *     - <strong>custom</strong>：从数据库查询该租户已注册的纯自定义组织
     *     客户端根据返回的 platformType 区分处理逻辑，corpId 为后续同步接口的必传参数。</p>
     * 
     * @param request the request parameters of ListAvailableConfigs  ListAvailableConfigsRequest
     * @return ListAvailableConfigsResponse
     */
    @Override
    public CompletableFuture<ListAvailableConfigsResponse> listAvailableConfigs(ListAvailableConfigsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAvailableConfigs").setMethod(HttpMethod.POST).setPathRegex("/openapi/listAvailableConfigs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAvailableConfigsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAvailableConfigsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询指定条件下的账单列表。</li>
     * <li>支持按租户、用户、操作类型、状态、时间范围、业务来源等条件进行筛选。</li>
     * <li>分页返回账单数据，默认每页显示20条记录。</li>
     * <li>可选择是否过滤掉credit消耗为0的账单，默认过滤。</li>
     * <li>请求时需提供必要的认证信息（如AK、BearerToken或APP认证）。</li>
     * </ul>
     * 
     * @param request the request parameters of ListBilling  ListBillingRequest
     * @return ListBillingResponse
     */
    @Override
    public CompletableFuture<ListBillingResponse> listBilling(ListBillingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListBilling").setMethod(HttpMethod.POST).setPathRegex("/openapi/listBilling").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListBillingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListBillingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该 API 支持通过多种参数进行过滤和排序，包括租户 ID、分页大小、分页令牌、关键词搜索、数字员工名称以及更新时间区间。</li>
     * <li>默认情况下，结果将按照 <code>UpdatedAt</code> 字段降序排列。</li>
     * <li>如果提供了无效的 <code>NextToken</code> 或者 <code>PageSize</code> 超出了允许范围（1-100），API 将返回 400 错误。</li>
     * </ul>
     * 
     * @param request the request parameters of ListChatSessions  ListChatSessionsRequest
     * @return ListChatSessionsResponse
     */
    @Override
    public CompletableFuture<ListChatSessionsResponse> listChatSessions(ListChatSessionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListChatSessions").setMethod(HttpMethod.GET).setPathRegex("/openapi/listChatSessions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListChatSessionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListChatSessionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>列出身份租户下的已发布图谱。
     *     CLI 映射为 <code>winnexo graph list</code>；<code>tenantId</code> 是必传公共参数，不进入请求体。
     *     返回的 <code>graphName</code> 可直接用于 <code>querySemanticKnowledge</code>。该查询与现有前台
     *     图谱列表保持一致，不做数字员工权限过滤；具体语义查询仍会校验 agent USE 权限。
     *     数据库异常直接进入统一 5xx 错误处理，不会伪装为成功空列表。</p>
     * 
     * @param request the request parameters of ListGraphs  ListGraphsRequest
     * @return ListGraphsResponse
     */
    @Override
    public CompletableFuture<ListGraphsResponse> listGraphs(ListGraphsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListGraphs").setMethod(HttpMethod.POST).setPathRegex("/openapi/listGraphs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListGraphsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListGraphsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该 API 用于获取企业知识库的分类列表（子目录树），需要具备知识库查看权限。</li>
     * <li>如果未提供 <code>directoryId</code> 参数，则返回企业知识库根目录下的所有分类树；如果提供了 <code>directoryId</code>，则以该目录为根返回其子目录树。</li>
     * <li>支持通过 <code>sortField</code> 和 <code>sortOrder</code> 参数对结果进行排序，默认按照创建时间降序排列。</li>
     * <li>安全约束：<code>tenant_id</code> 和 <code>user_id</code> 仅来自鉴权身份，并且调用者必须拥有 <code>DEVELOPMENT_KB_VIEW</code> 功能权限。</li>
     * </ul>
     * 
     * @param request the request parameters of ListKnowledgeBaseDirectories  ListKnowledgeBaseDirectoriesRequest
     * @return ListKnowledgeBaseDirectoriesResponse
     */
    @Override
    public CompletableFuture<ListKnowledgeBaseDirectoriesResponse> listKnowledgeBaseDirectories(ListKnowledgeBaseDirectoriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListKnowledgeBaseDirectories").setMethod(HttpMethod.POST).setPathRegex("/openapi/listKnowledgeBaseDirectories").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListKnowledgeBaseDirectoriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListKnowledgeBaseDirectoriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>按 graphName、operatingObjectName、objectType 三个独立维度查询关注。支持主对象与显式一级关联对象，使用不透明游标分页，不受关注面板 1000 条展示窗口限制。</p>
     * 
     * @param request the request parameters of ListOperatingObjectFavorites  ListOperatingObjectFavoritesRequest
     * @return ListOperatingObjectFavoritesResponse
     */
    @Override
    public CompletableFuture<ListOperatingObjectFavoritesResponse> listOperatingObjectFavorites(ListOperatingObjectFavoritesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListOperatingObjectFavorites").setMethod(HttpMethod.POST).setPathRegex("/openapi/listOperatingObjectFavorites").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListOperatingObjectFavoritesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListOperatingObjectFavoritesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API用于查询当前登录用户的产出列表。</li>
     * <li><code>tenantId</code>作为公共参数，缺省时使用调用方默认租户。</li>
     * <li>支持通过<code>operatingObjectName</code>、<code>itemType</code>、<code>keyword</code>等参数进行过滤查询。</li>
     * <li>可以设置<code>sharedOnly</code>为<code>true</code>来仅展示开启分享的产出。</li>
     * <li>分页信息通过<code>page</code>（页码）和<code>pageSize</code>（每页数量）控制，默认从第1页开始，每页显示20条记录。</li>
     * <li>默认按更新时间倒序排列。</li>
     * <li>调用者在请求体中传入的<code>tenant_id</code>或<code>user_id</code>将被忽略，这些信息仅来自鉴权身份。</li>
     * </ul>
     * 
     * @param request the request parameters of ListOutputFiles  ListOutputFilesRequest
     * @return ListOutputFilesResponse
     */
    @Override
    public CompletableFuture<ListOutputFilesResponse> listOutputFiles(ListOutputFilesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListOutputFiles").setMethod(HttpMethod.POST).setPathRegex("/openapi/listOutputFiles").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListOutputFilesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListOutputFilesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该 API 用于下钻查询&quot;我的资源&quot;目录下的子目录与资源。</li>
     * <li>当 <code>directoryId</code> 设置为 &#39;root&#39; 时，服务将自动解析并返回当前数字员工默认根目录下的内容；若提供具体的目录 ID，则返回该目录下的子目录和资源。</li>
     * <li>安全约束：<code>tenant_id</code> 和 <code>user_id</code> 只能来自鉴权身份信息，调用方在请求体中提供的这些字段将被忽略。</li>
     * <li>支持通过 <code>sourceTypes</code> 参数筛选特定类型的资源，当此参数有值时，仅返回符合类型条件的资源而不包含子目录。</li>
     * <li>排序支持按名称 (<code>name</code>)、创建时间 (<code>gmt_create</code>) 或修改时间 (<code>gmt_modified</code>) 进行升序或降序排列。</li>
     * <li>分页功能允许用户自定义每页显示的数量（最大100）及当前查看的页码。</li>
     * </ul>
     * 
     * @param request the request parameters of ListPersonalDirectoryContents  ListPersonalDirectoryContentsRequest
     * @return ListPersonalDirectoryContentsResponse
     */
    @Override
    public CompletableFuture<ListPersonalDirectoryContentsResponse> listPersonalDirectoryContents(ListPersonalDirectoryContentsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListPersonalDirectoryContents").setMethod(HttpMethod.POST).setPathRegex("/openapi/listPersonalDirectoryContents").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPersonalDirectoryContentsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPersonalDirectoryContentsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>查询系统内置角色列表。
     *     业务逻辑：
     *     1. 从 identity 构造 AuthContext
     *     2. 委托 UserManagementAuthorizedService.list_system_roles 完成权限校验（PLATFORM_USER_VIEW）
     *     3. 按请求 Accept-Language 渲染角色名称与说明
     *     4. 返回固定的 7 个系统内置角色
     *     返回字段 roleCode 可直接用于 createUser / updateUser 的 roleCodes 参数。</p>
     * 
     * @param request the request parameters of ListRoles  ListRolesRequest
     * @return ListRolesResponse
     */
    @Override
    public CompletableFuture<ListRolesResponse> listRoles(ListRolesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListRoles").setMethod(HttpMethod.POST).setPathRegex("/openapi/listRoles").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRolesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRolesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListScheduledTasks  ListScheduledTasksRequest
     * @return ListScheduledTasksResponse
     */
    @Override
    public CompletableFuture<ListScheduledTasksResponse> listScheduledTasks(ListScheduledTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListScheduledTasks").setMethod(HttpMethod.GET).setPathRegex("/openapi/listScheduledTasks").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListScheduledTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListScheduledTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <p>该 API 用于获取当前租户下所有可见的技能列表。支持按数字员工绑定关系、技能来源、标签、关键词等条件进行过滤，并支持分页。</p>
     * <h3>入参</h3>
     * <ul>
     * <li><strong>TenantId</strong>：可选，公共参数，由网关透传到后端 Header；不传时使用当前调用方所属的默认租户。</li>
     * <li><strong>FilterType</strong>：可选，技能筛选维度。可选值：<code>ALL</code>(全部已发布)、<code>BUILTIN</code>(内置已发布)、<code>CUSTOM</code>(自定义已发布)、<code>DRAFT</code>(草稿箱，含未发布修改的已发布技能)。默认 <code>ALL</code>。</li>
     * <li><strong>Tags</strong>：可选，按标签过滤，数组任一命中即匹配。</li>
     * <li><strong>Keyword</strong>：可选，按技能名称或描述模糊匹配。</li>
     * <li><strong>Page</strong>：可选，页码，最小 1，默认 1。</li>
     * <li><strong>PageSize</strong>：可选，每页数量，范围 1~100，默认 20。</li>
     * <li><strong>OperatingObjectName</strong>：可选，数字员工名称，传入时按绑定关系过滤；必须配合 <code>BindStatus</code> 使用。</li>
     * <li><strong>BindStatus</strong>：可选，绑定状态。可选值：<code>BOUND</code>(已绑定)、<code>UNBOUND</code>(未绑定的全局技能)。</li>
     * </ul>
     * <h3>出参</h3>
     * <p>响应包含技能列表 <code>items</code>、总数 <code>total</code>、当前页 <code>page</code> 与每页数量 <code>pageSize</code>。</p>
     * 
     * @param request the request parameters of ListSkills  ListSkillsRequest
     * @return ListSkillsResponse
     */
    @Override
    public CompletableFuture<ListSkillsResponse> listSkills(ListSkillsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListSkills").setMethod(HttpMethod.POST).setPathRegex("/openapi/listSkills").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSkillsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSkillsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API用于分页查询企业知识库中的目录内容和资源。</li>
     * <li>支持通过多种参数进行过滤和排序，如<code>directoryId</code>、<code>page</code>、<code>pageSize</code>、<code>sortField</code>、<code>sortOrder</code>等。</li>
     * <li><code>sourceTypes</code>参数允许用户根据资源类型进行过滤，多个类型使用逗号分隔。</li>
     * <li>当不传或传入<code>root</code>作为<code>directoryId</code>时，默认查询知识库根目录列表。</li>
     * <li>默认的排序字段为<code>name</code>，默认排序方向为升序（<code>asc</code>）。</li>
     * </ul>
     * 
     * @param request the request parameters of ListTenantDirectory  ListTenantDirectoryRequest
     * @return ListTenantDirectoryResponse
     */
    @Override
    public CompletableFuture<ListTenantDirectoryResponse> listTenantDirectory(ListTenantDirectoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListTenantDirectory").setMethod(HttpMethod.POST).setPathRegex("/openapi/listTenantDirectory").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTenantDirectoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTenantDirectoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>WinNexo 用户管理 OpenAPI：查询当前租户用户组树。租户身份来自鉴权上下文。</p>
     * 
     * @param request the request parameters of ListUserGroups  ListUserGroupsRequest
     * @return ListUserGroupsResponse
     */
    @Override
    public CompletableFuture<ListUserGroupsResponse> listUserGroups(ListUserGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListUserGroups").setMethod(HttpMethod.POST).setPathRegex("/openapi/listUserGroups").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListUserGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListUserGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>本接口按企业知识库前台口径返回指定目录的子目录和 READY 资源。</li>
     * <li>用户身份与目录可见范围均来自 OpenAPI 鉴权上下文。</li>
     * <li><code>sourceTypes</code> 有值时仅返回资源；<code>keyword</code> 仅搜索当前目录层级。</li>
     * </ul>
     * 
     * @param request the request parameters of ListUserVisibleKnowledgeBaseContents  ListUserVisibleKnowledgeBaseContentsRequest
     * @return ListUserVisibleKnowledgeBaseContentsResponse
     */
    @Override
    public CompletableFuture<ListUserVisibleKnowledgeBaseContentsResponse> listUserVisibleKnowledgeBaseContents(ListUserVisibleKnowledgeBaseContentsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListUserVisibleKnowledgeBaseContents").setMethod(HttpMethod.POST).setPathRegex("/openapi/listUserVisibleKnowledgeBaseContents").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListUserVisibleKnowledgeBaseContentsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListUserVisibleKnowledgeBaseContentsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>本接口按 OpenAPI 鉴权身份映射的平台用户查询其可见企业知识库。</li>
     * <li>租户和用户身份均由鉴权上下文确定，调用方不能通过业务参数扩大可见范围。</li>
     * <li><code>tenantId</code> 为可选公共参数；<code>keyword</code> 可按知识库名称或描述过滤。</li>
     * </ul>
     * 
     * @param request the request parameters of ListUserVisibleKnowledgeBases  ListUserVisibleKnowledgeBasesRequest
     * @return ListUserVisibleKnowledgeBasesResponse
     */
    @Override
    public CompletableFuture<ListUserVisibleKnowledgeBasesResponse> listUserVisibleKnowledgeBases(ListUserVisibleKnowledgeBasesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListUserVisibleKnowledgeBases").setMethod(HttpMethod.POST).setPathRegex("/openapi/listUserVisibleKnowledgeBases").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListUserVisibleKnowledgeBasesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListUserVisibleKnowledgeBasesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>OpenAPI 分页查询租户成员列表。
     *     业务编排：
     *     1. 解析筛选条件（roleCodes → role_ids）
     *     2. 调用 UserTenantMappingRepository.query_paged_tenant_members 分页查询当前租户所有来源的正式成员（WINNEXO/BUC/SSO）
     *     3. 将结果中的 role_id 转为 roleCode 并组装响应
     *     错误码：
     *     - 非法 roleCode 参数时抛出错误</p>
     * 
     * @param request the request parameters of ListUsers  ListUsersRequest
     * @return ListUsersResponse
     */
    @Override
    public CompletableFuture<ListUsersResponse> listUsers(ListUsersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListUsers").setMethod(HttpMethod.POST).setPathRegex("/openapi/listUsers").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListUsersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListUsersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>本接口用于查询特定数字员工在指定知识库目录下的所有子目录和资源。</li>
     * <li>用户需拥有对目标数字员工的USE权限，且该数字员工必须有权访问请求中指定的目录及其子目录。</li>
     * <li>请求时需要提供数字员工名称（<code>operatingObjectName</code>）及要查询的目录ID（<code>directoryId</code>），其他参数如分页信息、排序方式等为可选项。</li>
     * <li>接口返回结果包括目录下的子目录和资源列表，并支持按页码分页显示。</li>
     * <li><code>sourceStatus</code>字段固定过滤值为<code>READY</code>状态的资源。</li>
     * <li>安全性方面，<code>tenant_id</code>与<code>user_id</code>仅从鉴权身份获取，调用方即使在请求体中传递也会被忽略。</li>
     * </ul>
     * 
     * @param request the request parameters of ListVisibleKnowledgeBaseContents  ListVisibleKnowledgeBaseContentsRequest
     * @return ListVisibleKnowledgeBaseContentsResponse
     */
    @Override
    public CompletableFuture<ListVisibleKnowledgeBaseContentsResponse> listVisibleKnowledgeBaseContents(ListVisibleKnowledgeBaseContentsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListVisibleKnowledgeBaseContents").setMethod(HttpMethod.POST).setPathRegex("/openapi/listVisibleKnowledgeBaseContents").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListVisibleKnowledgeBaseContentsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListVisibleKnowledgeBaseContentsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API用于获取指定数字员工（运营对象）在企业内可见的知识库顶层目录列表。</li>
     * </ul>
     * 
     * @param request the request parameters of ListVisibleKnowledgeBases  ListVisibleKnowledgeBasesRequest
     * @return ListVisibleKnowledgeBasesResponse
     */
    @Override
    public CompletableFuture<ListVisibleKnowledgeBasesResponse> listVisibleKnowledgeBases(ListVisibleKnowledgeBasesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListVisibleKnowledgeBases").setMethod(HttpMethod.POST).setPathRegex("/openapi/listVisibleKnowledgeBases").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListVisibleKnowledgeBasesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListVisibleKnowledgeBasesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li><strong>鉴权流程</strong>：<ol>
     * <li>基础鉴权由根 router 统一完成（<code>request.state.openapi_identity</code>）。</li>
     * <li>本 handler 校验 <code>DEVELOPMENT_KB_MANAGE</code> 功能权限。</li>
     * </ol>
     * </li>
     * <li><strong>操作步骤</strong>：<ol>
     * <li>检查源目录与目标目录不能相同。</li>
     * <li>确认目标目录存在。</li>
     * <li>验证待移动的资源确实位于源目录中。</li>
     * <li>更新资源的目录绑定关系。</li>
     * <li>尽力更新 <code>source.settings[&quot;knowledge_id&quot;]</code> 为目标知识库 ID。</li>
     * <li>尽力通知 DocumentAgent 同步 <code>knowledge_id</code> 和 <code>update_time</code>。</li>
     * </ol>
     * </li>
     * <li><strong>安全约束</strong>：<ul>
     * <li><code>tenant_id</code> 和 <code>user_id</code> 必须来自鉴权身份。</li>
     * <li>调用者需要拥有 KB 管理权限。</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of MoveKnowledgeBaseResource  MoveKnowledgeBaseResourceRequest
     * @return MoveKnowledgeBaseResourceResponse
     */
    @Override
    public CompletableFuture<MoveKnowledgeBaseResourceResponse> moveKnowledgeBaseResource(MoveKnowledgeBaseResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("MoveKnowledgeBaseResource").setMethod(HttpMethod.POST).setPathRegex("/openapi/moveKnowledgeBaseResource").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MoveKnowledgeBaseResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MoveKnowledgeBaseResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li><strong>源目录与目标目录不能相同</strong>，否则将返回 <code>ERR.Robject.UserDirectory.InvalidOperation</code> 错误。</li>
     * <li><strong>目标目录必须存在</strong>，如果不存在则会返回 <code>ERR.Robject.UserDirectory.DirectoryNotFound</code> 错误。</li>
     * <li><strong>待移动的资源必须存在于源目录中</strong>，若不在源目录中，则会收到 <code>ERR.Robject.UserDirectory.ResourceNotInDirectory</code> 错误。</li>
     * <li>成功移动后，系统会尝试通知 DocumentAgent 更新资源的新路径 (<code>source_path</code>)，但此步骤为尽力而为（best-effort），即使失败也不会影响整体操作的成功状态，仅记录错误日志。</li>
     * <li>安全性方面，<code>tenant_id</code> 的值只能来源于鉴权身份信息。</li>
     * </ul>
     * 
     * @param request the request parameters of MoveResource  MoveResourceRequest
     * @return MoveResourceResponse
     */
    @Override
    public CompletableFuture<MoveResourceResponse> moveResource(MoveResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("MoveResource").setMethod(HttpMethod.POST).setPathRegex("/openapi/moveResource").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MoveResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MoveResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <p>按公告 ID 幂等下线平台公告。首次将 PUBLISHED 公告下线时返回 <code>changed=true</code>；公告已经下线或过期时返回 <code>changed=false</code>。
     * 调用身份必须属于系统运维租户并拥有公告管理权限。</p>
     * 
     * @param request the request parameters of OfflineAnnouncement  OfflineAnnouncementRequest
     * @return OfflineAnnouncementResponse
     */
    @Override
    public CompletableFuture<OfflineAnnouncementResponse> offlineAnnouncement(OfflineAnnouncementRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("OfflineAnnouncement").setMethod(HttpMethod.POST).setPathRegex("/openapi/offlineAnnouncement").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OfflineAnnouncementResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OfflineAnnouncementResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于预览企业知识库下指定知识的内容。</li>
     * <li>需要具备<code>DEVELOPMENT_KB_VIEW</code>功能权限才能调用此API。</li>
     * <li><code>sourceId</code>是必需参数，用来标识要预览的知识条目。</li>
     * <li>可选参数<code>tenantId</code>允许指定租户ID；若未提供，则使用调用方默认的租户ID。</li>
     * <li>支持多种类型的预览，包括但不限于图片、音频、视频及文本等。</li>
     * </ul>
     * 
     * @param request the request parameters of PreviewKnowledgeBaseSource  PreviewKnowledgeBaseSourceRequest
     * @return PreviewKnowledgeBaseSourceResponse
     */
    @Override
    public CompletableFuture<PreviewKnowledgeBaseSourceResponse> previewKnowledgeBaseSource(PreviewKnowledgeBaseSourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PreviewKnowledgeBaseSource").setMethod(HttpMethod.POST).setPathRegex("/openapi/previewKnowledgeBaseSource").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PreviewKnowledgeBaseSourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PreviewKnowledgeBaseSourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口仅允许用户预览属于自己的个人目录下的资源。</li>
     * <li>鉴权流程包括基础鉴权和数据源归属校验，确保请求者只能访问其个人目录中的知识。</li>
     * <li>请求时需提供知识的唯一标识 <code>sourceId</code>，系统将根据此ID及用户的租户信息查询并返回相应的预览信息。</li>
     * <li>支持多种类型的预览，如图片、音频、视频等，并根据不同类型返回对应的预览URL或直接的内容展示。</li>
     * </ul>
     * 
     * @param request the request parameters of PreviewPersonalSource  PreviewPersonalSourceRequest
     * @return PreviewPersonalSourceResponse
     */
    @Override
    public CompletableFuture<PreviewPersonalSourceResponse> previewPersonalSource(PreviewPersonalSourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PreviewPersonalSource").setMethod(HttpMethod.POST).setPathRegex("/openapi/previewPersonalSource").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PreviewPersonalSourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PreviewPersonalSourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API用于根据给定的数字员工技术名（如 <code>customer_1</code>）分页查询其主对象数据；不支持关系对象。</li>
     * <li>支持通过关键字进行搜索，并且可以设置是否仅返回被标记为关注的对象。</li>
     * <li>可以使用复杂的过滤条件来进一步筛选结果，包括但不限于等于、不等于、大于、小于等逻辑操作符。</li>
     * <li>数字员工不存在、无 USE 权限或没有配置主对象类型时返回明确错误，不会静默返回空结果。</li>
     * <li><code>operatingObjectName</code> 与对象类型是不同维度，禁止将 <code>objectType</code> 值替换到该字段。</li>
     * <li>请求中包含的数据将经过鉴权与过滤处理，确保安全性和准确性。</li>
     * </ul>
     * 
     * @param request the request parameters of QueryPrimaryObjectData  QueryPrimaryObjectDataRequest
     * @return QueryPrimaryObjectDataResponse
     */
    @Override
    public CompletableFuture<QueryPrimaryObjectDataResponse> queryPrimaryObjectData(QueryPrimaryObjectDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryPrimaryObjectData").setMethod(HttpMethod.POST).setPathRegex("/openapi/queryPrimaryObjectData").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryPrimaryObjectDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryPrimaryObjectDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>仅开放 smart-query 的 schema_knowledge 语义召回能力。
     *     CLI 映射为 <code>winnexo semantic query</code>。<code>tenantId</code> 由公共参数传入，<code>userId</code>
     *     仅从 Token 身份读取，禁止请求体覆盖。服务会校验 <code>graphName + agentName</code> 归属、
     *     active graph、数字员工启用状态及当前用户 USE 权限；跨图同名 agent 会失败关闭，
     *     随后固定 <code>outputs=[schema_knowledge]</code>。</p>
     * 
     * @param request the request parameters of QuerySemanticKnowledge  QuerySemanticKnowledgeRequest
     * @return QuerySemanticKnowledgeResponse
     */
    @Override
    public CompletableFuture<QuerySemanticKnowledgeResponse> querySemanticKnowledge(QuerySemanticKnowledgeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QuerySemanticKnowledge").setMethod(HttpMethod.POST).setPathRegex("/openapi/querySemanticKnowledge").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QuerySemanticKnowledgeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QuerySemanticKnowledgeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>根据 taskId 查询组织同步任务的执行状态和结果。
     *     任务状态流转：PENDING → RUNNING → COMPLETED / FAILED / TIMEOUT / CANCELED
     *     建议客户端轮询间隔：3-5 秒。</p>
     * 
     * @param request the request parameters of QuerySyncResult  QuerySyncResultRequest
     * @return QuerySyncResultResponse
     */
    @Override
    public CompletableFuture<QuerySyncResultResponse> querySyncResult(QuerySyncResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QuerySyncResult").setMethod(HttpMethod.POST).setPathRegex("/openapi/querySyncResult").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QuerySyncResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QuerySyncResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <p>基于会话最近 N 条消息与智能体绑定的 skill，调用 LLM 生成 0~3 项下一步推荐（继续追问或推荐执行的技能）。</p>
     * <ul>
     * <li><code>sessionId</code>：会话 ID，必填；仅允许当前鉴权用户有权限的会话。</li>
     * <li><code>recentMessageCount</code>：组装上下文的最近消息条数，范围 1-30，默认 10（约 5 轮 user+assistant 对话回合）。</li>
     * <li><code>customPrompt</code>：自定义推荐指令（不超过 10000 字符），作为自定义指令注入默认推荐模板（位于输出格式约束之前），输出仍受模板的 JSON 格式与类型约束。</li>
     * <li><code>outputType</code>：输出类型过滤。followUpOnly=仅追问类推荐（默认），skillOnly=仅技能推荐，both=同时生成两类。
     * 与内部端点不同，OpenAPI 调用不受用户个人设置中下一步推荐开关的限制，始终执行推荐生成。</li>
     * </ul>
     * 
     * @param request the request parameters of RecommendNextActions  RecommendNextActionsRequest
     * @return RecommendNextActionsResponse
     */
    @Override
    public CompletableFuture<RecommendNextActionsResponse> recommendNextActions(RecommendNextActionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RecommendNextActions").setMethod(HttpMethod.POST).setPathRegex("/openapi/recommendNextActions").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecommendNextActionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecommendNextActionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>OpenAPI 从租户移除用户。
     *     业务编排：
     *     1. 从 identity 获取 tenant_id
     *     2. 调用 delete_user_from_tenant（内部含最后超管保护）
     *     3. 返回成功
     *     该操作会：
     *     - 移除用户在租户下的所有角色关联
     *     - 移除用户在租户下的所有用户组关联
     *     - 撤销用户在租户下的全部数字员工使用授权
     *     - 删除用户-租户映射</p>
     * 
     * @param request the request parameters of RemoveUser  RemoveUserRequest
     * @return RemoveUserResponse
     */
    @Override
    public CompletableFuture<RemoveUserResponse> removeUser(RemoveUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RemoveUser").setMethod(HttpMethod.POST).setPathRegex("/openapi/removeUser").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>WinNexo 用户管理 OpenAPI：批量移除用户组成员。租户身份来自鉴权上下文。</p>
     * 
     * @param request the request parameters of RemoveUserGroupMembers  RemoveUserGroupMembersRequest
     * @return RemoveUserGroupMembersResponse
     */
    @Override
    public CompletableFuture<RemoveUserGroupMembersResponse> removeUserGroupMembers(RemoveUserGroupMembersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RemoveUserGroupMembers").setMethod(HttpMethod.POST).setPathRegex("/openapi/removeUserGroupMembers").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveUserGroupMembersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveUserGroupMembersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口允许具有相应权限的用户修改企业知识库中的特定数据源名称。</li>
     * <li>需要提供待修改的数据源ID(<code>sourceId</code>)及新的名称(<code>newName</code>)。</li>
     * <li>修改操作仅更新数据源的名字字段，不会触发其他处理流程。</li>
     * <li>成功执行后，系统会发布<code>SOURCE_CHANGED</code>事件以供前端刷新显示，并尝试通知DocumentAgent同步最新的source_name信息，但此步骤失败不会影响主流程的完成状态。</li>
     * <li>如果提供的<code>sourceId</code>不存在，则返回错误码<code>ERR.Robject.Source.NotFound</code>。</li>
     * <li>此API调用需具备<code>DEVELOPMENT_KB_MANAGE</code>功能权限。</li>
     * <li>支持通过AK、BearerToken或APP方式进行身份验证。</li>
     * </ul>
     * 
     * @param request the request parameters of RenameKnowledgeBaseSource  RenameKnowledgeBaseSourceRequest
     * @return RenameKnowledgeBaseSourceResponse
     */
    @Override
    public CompletableFuture<RenameKnowledgeBaseSourceResponse> renameKnowledgeBaseSource(RenameKnowledgeBaseSourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RenameKnowledgeBaseSource").setMethod(HttpMethod.POST).setPathRegex("/openapi/renameKnowledgeBaseSource").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RenameKnowledgeBaseSourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RenameKnowledgeBaseSourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该 API 仅更新数据源的 <code>name</code> 字段，不会触发 <code>process_source</code>。</li>
     * <li>成功后会发布 <code>SOURCE_CHANGED</code> 事件供前端刷新显示。</li>
     * <li>将尽力通知 DocumentAgent 同步新的 <code>source_name</code>，即使同步失败也不会阻断主流程。</li>
     * <li>如果指定的数据源不存在，则抛出 <code>ERR.Robject.Source.NotFound</code> 错误，并由全局中间件统一转换为 POP 错误码。</li>
     * <li>安全约束：<code>tenant_id</code> 和 <code>user_id</code> 必须来自鉴权身份。</li>
     * </ul>
     * 
     * @param request the request parameters of RenameSource  RenameSourceRequest
     * @return RenameSourceResponse
     */
    @Override
    public CompletableFuture<RenameSourceResponse> renameSource(RenameSourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RenameSource").setMethod(HttpMethod.POST).setPathRegex("/openapi/renameSource").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RenameSourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RenameSourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <p>该 API 用于重新解析指定的数据源，支持同步或异步执行。请求时需提供数据源 ID，并可选择是否同步等待解析完成，默认为异步入队处理。此外，可以通过 <code>tenantId</code> 参数指定租户ID，但此参数非必填。</p>
     * <ul>
     * <li><strong>forceSync</strong>：若设置为 <code>true</code>，则会同步等待重新解析操作完成；默认值为 <code>false</code>，表示以异步方式处理请求。</li>
     * <li>当服务返回 <code>None</code> 时，将被转换成 <code>SourceNotFound</code> 异常；其他异常情况将由 OpenAPI 的全局异常链进行处理。</li>
     * </ul>
     * 
     * @param request the request parameters of ReparseSource  ReparseSourceRequest
     * @return ReparseSourceResponse
     */
    @Override
    public CompletableFuture<ReparseSourceResponse> reparseSource(ReparseSourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ReparseSource").setMethod(HttpMethod.POST).setPathRegex("/openapi/reparseSource").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReparseSourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReparseSourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <p>该API允许用户更新企业自建知识库中特定的FILE类型的数据源，并通过提供新的文件路径和公开访问URL来触发系统对该数据源的重新解析。支持同步或异步模式下的操作执行，其中同步模式下客户端将等待直到解析过程完成。</p>
     * <ul>
     * <li><strong>forceSync</strong> 参数控制是否采用同步方式处理请求，默认为 <code>false</code>，即以异步方式进行。</li>
     * <li>当不提供 <strong>fileName</strong> 或其值为空时，新上传的文件将保留原有的文件名。</li>
     * <li>必须确保提供的 <strong>filePath</strong> 和 <strong>filePublicUrl</strong> 是有效的且指向同一个文件实体。</li>
     * </ul>
     * 
     * @param request the request parameters of ReplaceKnowledgeBaseSourceFile  ReplaceKnowledgeBaseSourceFileRequest
     * @return ReplaceKnowledgeBaseSourceFileResponse
     */
    @Override
    public CompletableFuture<ReplaceKnowledgeBaseSourceFileResponse> replaceKnowledgeBaseSourceFile(ReplaceKnowledgeBaseSourceFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ReplaceKnowledgeBaseSourceFile").setMethod(HttpMethod.POST).setPathRegex("/openapi/replaceKnowledgeBaseSourceFile").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReplaceKnowledgeBaseSourceFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReplaceKnowledgeBaseSourceFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <p>该 API 用于全量替换特定数据源的对象绑定（先删除现有绑定，再插入新的绑定）。如果传入空列表，则表示清空所有绑定。</p>
     * <ul>
     * <li><strong>安全约束</strong>：<code>tenant_id</code> 和 <code>user_id</code> 必须来自鉴权身份。</li>
     * <li><strong>错误处理</strong>：若指定的数据源不存在，将抛出 <code>ERR.Robject.InvalidParameter</code> 错误，并由全局中间件转换为 POP 错误码。</li>
     * <li><strong>同步通知</strong>：替换成功后会尽力同步通知 DocumentAgent 更新 <code>semantics.object_bindings</code>，但失败仅记录日志，不会阻断主流程。</li>
     * </ul>
     * 
     * @param request the request parameters of ReplaceObjectBindings  ReplaceObjectBindingsRequest
     * @return ReplaceObjectBindingsResponse
     */
    @Override
    public CompletableFuture<ReplaceObjectBindingsResponse> replaceObjectBindings(ReplaceObjectBindingsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ReplaceObjectBindings").setMethod(HttpMethod.POST).setPathRegex("/openapi/replaceObjectBindings").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReplaceObjectBindingsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReplaceObjectBindingsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>此 API 用于替换当前平台用户创建的个人 FILE 资源，并触发系统对该文件的重新解析。</li>
     * <li><code>tenant_id</code>、操作人和创建者约束只读取鉴权身份。缺少平台用户时请求将被拒绝，以防止绕过所有权校验。</li>
     * <li>如果服务端返回 <code>None</code>，则会被转换为 <code>NotFound</code> 异常；其他异常由 OpenAPI 全局异常链处理。</li>
     * <li>该接口支持同步或异步等待重新解析完成，默认为异步入队（通过设置 <code>forceSync</code> 参数控制）。</li>
     * </ul>
     * 
     * @param request the request parameters of ReplaceSourceFile  ReplaceSourceFileRequest
     * @return ReplaceSourceFileResponse
     */
    @Override
    public CompletableFuture<ReplaceSourceFileResponse> replaceSourceFile(ReplaceSourceFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ReplaceSourceFile").setMethod(HttpMethod.POST).setPathRegex("/openapi/replaceSourceFile").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReplaceSourceFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReplaceSourceFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>OpenAPI 重置用户密码。
     *     业务编排：
     *     1. 调用 UserManagementService.reset_member_password 传入 password_encrypted（必填）
     *        → service 内部完成 RSA 解密 + 复杂度校验 + bcrypt hash + 写入
     *     2. 返回重置结果
     *     错误码：
     *     - ERR.User.NotFound: 用户不存在
     *     - ERR.User.NotInTenant: 用户不在当前租户下
     *     - ERR.User.WinnexoPasswordRequired: 用户无密码凭证（非 WINNEXO 类型）</p>
     * 
     * @param request the request parameters of ResetPassword  ResetPasswordRequest
     * @return ResetPasswordResponse
     */
    @Override
    public CompletableFuture<ResetPasswordResponse> resetPassword(ResetPasswordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ResetPassword").setMethod(HttpMethod.POST).setPathRegex("/openapi/resetPassword").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResetPasswordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResetPasswordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>重置用户的 INSTANCE Token。
     *     业务逻辑：
     *     1. 从 identity 取 user_id（强制 caller_type=user）
     *     2. 构造 AuthContext，委托 UserTokenAuthorizedService 完成权限校验
     *     3. 调用 reset_token：
     *        - 旧 ACTIVE Token → RESET（永久失效）
     *        - 生成新 ACTIVE Token
     *     4. 返回新 Token 明文 + 脱敏值
     *     注意：重置后旧 Token 永久失效且不可恢复。新 Token 明文仅在本次响应中返回。</p>
     * 
     * @param request the request parameters of ResetToken  ResetTokenRequest
     * @return ResetTokenResponse
     */
    @Override
    public CompletableFuture<ResetTokenResponse> resetToken(ResetTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ResetToken").setMethod(HttpMethod.POST).setPathRegex("/openapi/resetToken").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResetTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResetTokenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <p>该API用于获取并重试指定用户个人目录（包括其所有子目录）中状态为FAILED的数据源。请求将立即返回，实际的重试任务将在后台异步执行。请注意，只有当前登录用户有权访问且属于其创建的资源才能被重试。</p>
     * <h3>安全与权限</h3>
     * <ul>
     * <li>此操作需要适当的RAM权限。</li>
     * <li>只能对当前用户所属租户内的资源进行操作。</li>
     * <li>确保<code>tenantId</code>和<code>userId</code>来自经过验证的身份信息。</li>
     * </ul>
     * <h3>注意事项</h3>
     * <ul>
     * <li><code>directoryId</code>是必需参数，指定了要检查和重试失败数据源的目标目录。</li>
     * <li>如果没有提供<code>tenantId</code>，则默认使用调用方的租户ID。</li>
     * <li>API支持多种认证方式，包括AK、BearerToken以及APP认证。</li>
     * </ul>
     * 
     * @param request the request parameters of RetryDirectoryFailedSources  RetryDirectoryFailedSourcesRequest
     * @return RetryDirectoryFailedSourcesResponse
     */
    @Override
    public CompletableFuture<RetryDirectoryFailedSourcesResponse> retryDirectoryFailedSources(RetryDirectoryFailedSourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RetryDirectoryFailedSources").setMethod(HttpMethod.POST).setPathRegex("/openapi/retryDirectoryFailedSources").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RetryDirectoryFailedSourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RetryDirectoryFailedSourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <p>该API用于获取并重试指定企业知识库目录（包括其子目录）下的所有处于FAILED状态的数据源。请求将立即返回，实际的重试操作将在后台异步执行。</p>
     * <ul>
     * <li><strong>鉴权</strong>：除了基础鉴权外，还需具备<code>DEVELOPMENT_KB_MANAGE</code>权限。</li>
     * <li><strong>安全约束</strong>：仅允许具有相应租户和用户身份的调用者访问，并且需要KB管理权限；管理员可以对任何用户的失败资源发起重试。</li>
     * <li><strong>参数</strong>：<ul>
     * <li><code>directoryId</code> (必填)：指定要检查和重试失败数据源的企业知识库目录ID。</li>
     * <li><code>tenantId</code> (可选)：指定租户ID，默认使用调用方的默认租户。</li>
     * </ul>
     * </li>
     * <li><strong>响应</strong>：成功时返回已入队等待重试的数据源数量及详情等信息。</li>
     * </ul>
     * 
     * @param request the request parameters of RetryKnowledgeBaseFailedSources  RetryKnowledgeBaseFailedSourcesRequest
     * @return RetryKnowledgeBaseFailedSourcesResponse
     */
    @Override
    public CompletableFuture<RetryKnowledgeBaseFailedSourcesResponse> retryKnowledgeBaseFailedSources(RetryKnowledgeBaseFailedSourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RetryKnowledgeBaseFailedSources").setMethod(HttpMethod.POST).setPathRegex("/openapi/retryKnowledgeBaseFailedSources").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RetryKnowledgeBaseFailedSourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RetryKnowledgeBaseFailedSourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>撤销用户或用户组对指定数字员工的使用权限。
     *     业务逻辑：
     *     1. 从 identity 构造 AuthContext
     *     2. 请求体互斥校验：userIds / userGroupIds 二选一
     *     3. 委托 AgentAuthorizationAuthorizedService.revoke_authorization 执行
     *     4. 前置校验：MANAGE 权限 + agent 存在性（由 AuthorizedService 层执行，先鉴权后暴露存在性）
     *     5. 撤销用户直接授权后，用户可能仍通过用户组获得授权</p>
     * 
     * @param request the request parameters of RevokeAgentUsers  RevokeAgentUsersRequest
     * @return RevokeAgentUsersResponse
     */
    @Override
    public CompletableFuture<RevokeAgentUsersResponse> revokeAgentUsers(RevokeAgentUsersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RevokeAgentUsers").setMethod(HttpMethod.POST).setPathRegex("/openapi/revokeAgentUsers").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RevokeAgentUsersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RevokeAgentUsersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <p>本接口仅支持异步模式：提交后立即返回 <code>RunId</code> 和 <code>Status=Running</code>，客户端通过 <code>GetSkillRun</code> 轮询最终结果。</p>
     * <ul>
     * <li><strong>TenantId</strong>：可选公共参数，由网关透传到后端 Header。</li>
     * <li><strong>SkillCode</strong> / <strong>SkillName</strong>：二选一；SkillCode 优先；SkillName 不唯一时返回 <code>ERR.SkillHub.SkillNameAmbiguous</code>。</li>
     * <li><strong>Arguments</strong>：必填，技能入参对象，结构由 <code>GetSkill</code> 返回的 inputConfig 描述。</li>
     * <li><strong>ClientToken</strong>：可选幂等键；当前版本仅记录到任务元数据，不做强幂等去重。
     * 注意：同步模式（Async=false）、Stream、CallbackUrl 一期不支持，将在后续版本提供。</li>
     * </ul>
     * 
     * @param request the request parameters of RunSkill  RunSkillRequest
     * @return RunSkillResponse
     */
    @Override
    public CompletableFuture<RunSkillResponse> runSkill(RunSkillRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RunSkill").setMethod(HttpMethod.POST).setPathRegex("/openapi/runSkill").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RunSkillResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RunSkillResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>将指定群产出保存到同一协作群的资料目录。</li>
     * <li>支持 <code>link</code>（保持产出关联）与 <code>copy</code>（创建独立快照）两种模式。</li>
     * <li>调用方必须是平台用户且为目标群成员；可归档当前调用方可见的群产出，包括其他成员创建的产出。</li>
     * <li><code>directoryId</code> 不传时使用目标群的默认资料目录。</li>
     * <li>单批最多处理 50 条产出；保存前会统一校验全部条目，任一条目不存在、不可见或无权操作时整批失败。</li>
     * <li>通过统一校验后逐条保存，响应结果与 <code>itemIds</code> 保持同序，单条保存失败不影响其他条目。</li>
     * </ul>
     * 
     * @param request the request parameters of SaveGroupOutputFileToGroupResource  SaveGroupOutputFileToGroupResourceRequest
     * @return SaveGroupOutputFileToGroupResourceResponse
     */
    @Override
    public CompletableFuture<SaveGroupOutputFileToGroupResourceResponse> saveGroupOutputFileToGroupResource(SaveGroupOutputFileToGroupResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SaveGroupOutputFileToGroupResource").setMethod(HttpMethod.POST).setPathRegex("/openapi/saveGroupOutputFileToGroupResource").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveGroupOutputFileToGroupResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveGroupOutputFileToGroupResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>将指定群产出保存到当前操作人的个人知识库。</li>
     * <li>支持 <code>link</code>（保持产出关联）与 <code>copy</code>（创建独立快照）两种模式。</li>
     * <li>调用方必须是已关联平台用户的目标群成员；普通成员仅可归档本人创建的产出，群管理员可归档其可见的其他成员产出，个人归属始终取自网关鉴权身份。</li>
     * <li><code>directoryId</code> 不传时使用当前操作人的默认个人目录。</li>
     * <li>单批最多处理 50 条产出；保存前会统一校验全部条目，任一条目不存在、不可见或无权操作时整批失败。</li>
     * <li>通过统一校验后逐条保存，响应结果与 <code>itemIds</code> 保持同序，单条保存失败不影响其他条目。</li>
     * </ul>
     * 
     * @param request the request parameters of SaveGroupOutputFileToPersonalResource  SaveGroupOutputFileToPersonalResourceRequest
     * @return SaveGroupOutputFileToPersonalResourceResponse
     */
    @Override
    public CompletableFuture<SaveGroupOutputFileToPersonalResourceResponse> saveGroupOutputFileToPersonalResource(SaveGroupOutputFileToPersonalResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SaveGroupOutputFileToPersonalResource").setMethod(HttpMethod.POST).setPathRegex("/openapi/saveGroupOutputFileToPersonalResource").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveGroupOutputFileToPersonalResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveGroupOutputFileToPersonalResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API用于将一批产出明细保存为用户的个人资源。</li>
     * <li>支持两种保存方式：<code>link</code>（链接）和<code>copy</code>（复制）。选择<code>link</code>时，编辑产出会同步到资源；选择<code>copy</code>则创建快照，不限次数。</li>
     * <li><code>tenant_id</code> 和 <code>user_id</code> 仅来自鉴权身份。</li>
     * <li>如果批内 <code>operating_object</code> 不一致且未传 <code>directoryId</code>，则整批请求前置失败。</li>
     * <li>单条记录的处理结果不会影响其他记录的结果，单条失败信息会在响应中返回。</li>
     * <li>批量操作最多支持50条记录。</li>
     * <li>整批前置失败的情况由全局异常中间件统一返回POP兼容错误格式。</li>
     * </ul>
     * 
     * @param request the request parameters of SaveOutputFileToResource  SaveOutputFileToResourceRequest
     * @return SaveOutputFileToResourceResponse
     */
    @Override
    public CompletableFuture<SaveOutputFileToResourceResponse> saveOutputFileToResource(SaveOutputFileToResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SaveOutputFileToResource").setMethod(HttpMethod.POST).setPathRegex("/openapi/saveOutputFileToResource").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveOutputFileToResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveOutputFileToResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SendAsyncChatMessage  SendAsyncChatMessageRequest
     * @return SendAsyncChatMessageResponse
     */
    @Override
    public CompletableFuture<SendAsyncChatMessageResponse> sendAsyncChatMessage(SendAsyncChatMessageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SendAsyncChatMessage").setMethod(HttpMethod.POST).setPathRegex("/openapi/sendAsyncChatMessage").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SendAsyncChatMessageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SendAsyncChatMessageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SendChatMessage  SendChatMessageRequest
     * @return SendChatMessageResponse
     */
    @Override
    public CompletableFuture<SendChatMessageResponse> sendChatMessage(SendChatMessageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SendChatMessage").setMethod(HttpMethod.POST).setPathRegex("/openapi/sendChatMessage").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SendChatMessageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SendChatMessageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public <ReturnT> CompletableFuture<ReturnT> sendChatMessageWithAsyncResponseHandler(SendChatMessageRequest request, AsyncResponseHandler<SendChatMessageResponse, ReturnT> responseHandler) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SendChatMessage").setMethod(HttpMethod.POST).setPathRegex("/openapi/sendChatMessage").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withResponseHandler(responseHandler).withOutput(SendChatMessageResponse.create());
            return this.handler.execute(params)
                    .thenCompose((output) -> CompletableFuture.completedFuture(responseHandler.transform((SendChatMessageResponse)output)));
        } catch (Exception e) {
            CompletableFuture<ReturnT> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public ResponseIterable<SendChatMessageResponseBody> sendChatMessageWithResponseIterable(SendChatMessageRequest request) {
        this.handler.validateRequestModel(request);
        TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.SSE).setAction("SendChatMessage").setMethod(HttpMethod.POST).setPathRegex("/openapi/sendChatMessage").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
        SendChatMessageResponseBodyIterator iterator = SendChatMessageResponseBodyIterator.create();
        ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withHttpResponseHandler(new SSEHttpResponseHandler(iterator));
        this.handler.execute(params);
        return new ResponseIterable<>(iterator);
    }

    /**
     * @param request the request parameters of StopChatMessage  StopChatMessageRequest
     * @return StopChatMessageResponse
     */
    @Override
    public CompletableFuture<StopChatMessageResponse> stopChatMessage(StopChatMessageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StopChatMessage").setMethod(HttpMethod.POST).setPathRegex("/openapi/stopChatMessage").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopChatMessageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopChatMessageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StreamChatMessage  StreamChatMessageRequest
     * @return StreamChatMessageResponse
     */
    @Override
    public CompletableFuture<StreamChatMessageResponse> streamChatMessage(StreamChatMessageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StreamChatMessage").setMethod(HttpMethod.GET).setPathRegex("/openapi/streamChatMessage/{messageId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StreamChatMessageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StreamChatMessageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public <ReturnT> CompletableFuture<ReturnT> streamChatMessageWithAsyncResponseHandler(StreamChatMessageRequest request, AsyncResponseHandler<StreamChatMessageResponse, ReturnT> responseHandler) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StreamChatMessage").setMethod(HttpMethod.GET).setPathRegex("/openapi/streamChatMessage/{messageId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withResponseHandler(responseHandler).withOutput(StreamChatMessageResponse.create());
            return this.handler.execute(params)
                    .thenCompose((output) -> CompletableFuture.completedFuture(responseHandler.transform((StreamChatMessageResponse)output)));
        } catch (Exception e) {
            CompletableFuture<ReturnT> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public ResponseIterable<StreamChatMessageResponseBody> streamChatMessageWithResponseIterable(StreamChatMessageRequest request) {
        this.handler.validateRequestModel(request);
        TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.SSE).setAction("StreamChatMessage").setMethod(HttpMethod.GET).setPathRegex("/openapi/streamChatMessage/{messageId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
        StreamChatMessageResponseBodyIterator iterator = StreamChatMessageResponseBodyIterator.create();
        ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withHttpResponseHandler(new SSEHttpResponseHandler(iterator));
        this.handler.execute(params);
        return new ResponseIterable<>(iterator);
    }

    /**
     * <b>description</b> :
     * <p>接收客户端推送的部门树和成员关系，创建异步同步任务。
     *     处理流程：
     *     1. 校验 platformType（仅允许 saml / oauth2 / custom）
     *     2. 校验数据量限制（departments + members &lt;= 50000）
     *     3. 校验 syncMembers 与 platformType 的兼容性
     *     4. SAML/OAuth2 场景：解析或自动推导 ssoSettingsId
     *     5. Custom 场景：校验 corpId 已通过 createCustomOrg 注册
     *     6. 委托 OrgSyncAuthorizedService 创建任务（内含权限校验）
     *     7. 返回 taskId 供轮询</p>
     * 
     * @param request the request parameters of SyncOrgStructure  SyncOrgStructureRequest
     * @return SyncOrgStructureResponse
     */
    @Override
    public CompletableFuture<SyncOrgStructureResponse> syncOrgStructure(SyncOrgStructureRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SyncOrgStructure").setMethod(HttpMethod.POST).setPathRegex("/openapi/syncOrgStructure").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SyncOrgStructureResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SyncOrgStructureResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li><strong>Precheck</strong>:<ol>
     * <li>添加关注时：系统会检查是否已对该主对象进行了关注以防止重复，并且会验证该主对象是否存在。</li>
     * <li>取消关注时：这是一个幂等操作，无论用户之前是否已经关注了该对象，都会返回 <code>success=true</code>。</li>
     * </ol>
     * </li>
     * <li><strong>安全性</strong>：支持AK、BearerToken和APP三种认证方式。</li>
     * <li><strong>请求频率限制</strong>：每秒最多可发送100次请求。</li>
     * <li><strong>响应日志</strong>：开启响应日志记录功能。</li>
     * <li><strong>租户相关性</strong>：此API与特定租户相关联，默认使用调用方的租户ID。</li>
     * <li><strong>操作类型</strong>：属于写入型操作。</li>
     * <li><strong>后端服务</strong>：请求将被转发至内部服务进行处理，超时时间为3秒。</li>
     * </ul>
     * 
     * @param request the request parameters of TogglePrimaryObjectFavorite  TogglePrimaryObjectFavoriteRequest
     * @return TogglePrimaryObjectFavoriteResponse
     */
    @Override
    public CompletableFuture<TogglePrimaryObjectFavoriteResponse> togglePrimaryObjectFavorite(TogglePrimaryObjectFavoriteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("TogglePrimaryObjectFavorite").setMethod(HttpMethod.POST).setPathRegex("/openapi/togglePrimaryObjectFavorite").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TogglePrimaryObjectFavoriteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TogglePrimaryObjectFavoriteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>切换数字员工的使用权限授权模式。
     *     业务逻辑：
     *     1. 从 identity 构造 AuthContext
     *     2. 委托 AgentAuthorizationAuthorizedService.update_auth_mode 执行
     *     3. 前置校验：MANAGE 权限 + agent 存在性（由 AuthorizedService 层执行，先鉴权后暴露存在性）
     *     4. SPECIFIED_USERS：需显式授权才能使用
     *     5. ALL_USERS：所有用户无需授权即可使用（管理权限不受影响）</p>
     * 
     * @param request the request parameters of UpdateAgentAuthMode  UpdateAgentAuthModeRequest
     * @return UpdateAgentAuthModeResponse
     */
    @Override
    public CompletableFuture<UpdateAgentAuthModeResponse> updateAgentAuthMode(UpdateAgentAuthModeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateAgentAuthMode").setMethod(HttpMethod.POST).setPathRegex("/openapi/updateAgentAuthMode").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAgentAuthModeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAgentAuthModeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateChatSession  UpdateChatSessionRequest
     * @return UpdateChatSessionResponse
     */
    @Override
    public CompletableFuture<UpdateChatSessionResponse> updateChatSession(UpdateChatSessionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateChatSession").setMethod(HttpMethod.POST).setPathRegex("/openapi/updateChatSession").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateChatSessionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateChatSessionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <p>该 API 用于更新指定用户的个人目录信息，包括名称、描述、父目录等。请求时需确保提供的 <code>directoryId</code> 对应的目录存在且属于当前用户。此外，如果更改了目录的 <code>name</code> 或 <code>path</code>，系统将自动递归更新所有子目录的路径以保持一致性。特别注意，在调整父目录时，必须保证新父目录的有效性（即非自身或不会导致循环引用）。</p>
     * <ul>
     * <li><strong>安全约束</strong>：<code>tenant_id</code> 和 <code>user_id</code> 必须来自于鉴权身份。</li>
     * <li><strong>权限要求</strong>：执行此操作需要相应的 RAM 权限。</li>
     * <li><strong>输入参数</strong>：<ul>
     * <li><code>directoryId</code>：必填，表示要更新的目录唯一标识。</li>
     * <li><code>name</code>：选填，设置新的目录名称。</li>
     * <li><code>description</code>：选填，提供新的目录描述。</li>
     * <li><code>parentId</code>：选填，指定新的父目录ID。</li>
     * <li><code>path</code>：选填，当传入时会级联更新当前及所有子目录的路径。</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of UpdateDirectory  UpdateDirectoryRequest
     * @return UpdateDirectoryResponse
     */
    @Override
    public CompletableFuture<UpdateDirectoryResponse> updateDirectory(UpdateDirectoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateDirectory").setMethod(HttpMethod.POST).setPathRegex("/openapi/updateDirectory").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDirectoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDirectoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于修改企业知识库中的某个分类。</li>
     * <li>需要具有<code>DEVELOPMENT_KB_MANAGE</code>功能权限才能调用此API。</li>
     * <li><code>tenantId</code>参数为可选，若未提供，则默认使用调用者的租户ID。</li>
     * <li>必须提供待修改的<code>directoryId</code>，而<code>name</code>、<code>description</code>和<code>parentDirectoryId</code>均为可选项，不提供则表示这些字段保持不变。</li>
     * <li>当指定了新的<code>parentDirectoryId</code>时，系统会检查新父目录是否属于当前租户，并且不会导致循环引用问题。</li>
     * <li>安全性方面，本API支持多种认证方式（AK、BearerToken、APP），并启用了RAM权限控制与操作审计。</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateKnowledgeBaseDirectory  UpdateKnowledgeBaseDirectoryRequest
     * @return UpdateKnowledgeBaseDirectoryResponse
     */
    @Override
    public CompletableFuture<UpdateKnowledgeBaseDirectoryResponse> updateKnowledgeBaseDirectory(UpdateKnowledgeBaseDirectoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateKnowledgeBaseDirectory").setMethod(HttpMethod.POST).setPathRegex("/openapi/updateKnowledgeBaseDirectory").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateKnowledgeBaseDirectoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateKnowledgeBaseDirectoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <p>本接口允许用户更新指定的企业知识库数据源的正文内容，并可选择是否同步等待解析完成。通过设置<code>forceSync</code>参数，可以控制解析过程是同步还是异步执行，默认为异步处理。</p>
     * <ul>
     * <li><strong>注意</strong>：当<code>content</code>字段为空字符串时，表示清空原有内容。</li>
     * <li><strong>权限要求</strong>：调用此接口需要具备相应的RAM操作权限（<code>winnexo:UpdateKnowledgeBaseSourceContent</code>）。</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateKnowledgeBaseSourceContent  UpdateKnowledgeBaseSourceContentRequest
     * @return UpdateKnowledgeBaseSourceContentResponse
     */
    @Override
    public CompletableFuture<UpdateKnowledgeBaseSourceContentResponse> updateKnowledgeBaseSourceContent(UpdateKnowledgeBaseSourceContentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateKnowledgeBaseSourceContent").setMethod(HttpMethod.POST).setPathRegex("/openapi/updateKnowledgeBaseSourceContent").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateKnowledgeBaseSourceContentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateKnowledgeBaseSourceContentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于更新企业知识库中特定数据源的标签。</li>
     * <li>需要具备知识库管理权限才能调用此接口。</li>
     * <li><code>sourceTags</code> 参数接受 JSON 字符串列表形式，例如 <code>[&quot;tagA&quot;, &quot;tagB&quot;]</code>；若传入 <code>null</code> 则表示清空所有现有标签。</li>
     * <li>更新操作仅影响 <code>sourceTags</code> 和 <code>gmt_modified</code> 字段，并不会触发 <code>process_source</code> 流程。</li>
     * <li>如果指定的数据源不存在，则会抛出 <code>ERR.Robject.Source.NotFound</code> 错误。</li>
     * <li>接口支持通过 AK、BearerToken 或 APP 方式进行身份验证。</li>
     * <li>调用时需确保 <code>tenant_id</code> 和 <code>user_id</code> 来自有效的鉴权身份信息。</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateKnowledgeBaseSourceTags  UpdateKnowledgeBaseSourceTagsRequest
     * @return UpdateKnowledgeBaseSourceTagsResponse
     */
    @Override
    public CompletableFuture<UpdateKnowledgeBaseSourceTagsResponse> updateKnowledgeBaseSourceTags(UpdateKnowledgeBaseSourceTagsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateKnowledgeBaseSourceTags").setMethod(HttpMethod.POST).setPathRegex("/openapi/updateKnowledgeBaseSourceTags").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateKnowledgeBaseSourceTagsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateKnowledgeBaseSourceTagsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateScheduledTask  UpdateScheduledTaskRequest
     * @return UpdateScheduledTaskResponse
     */
    @Override
    public CompletableFuture<UpdateScheduledTaskResponse> updateScheduledTask(UpdateScheduledTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateScheduledTask").setMethod(HttpMethod.PUT).setPathRegex("/openapi/updateScheduledTask").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateScheduledTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateScheduledTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API用于更新指定租户内的数据源内容，并根据需要触发同步或异步的数据源重新解析。</li>
     * <li><code>tenant_id</code> 和 <code>user_id</code> 仅用于鉴权，不参与实际业务逻辑处理。</li>
     * <li>当提供的正文为空字符串时，系统将按照现有服务契约执行操作。</li>
     * <li>如果指定的数据源不存在，则返回标准的NotFound错误；其他异常情况则由全局异常链处理。</li>
     * <li>可通过设置<code>forceSync</code>参数来决定是否等待解析过程完成（默认为异步入队）。</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateSourceContent  UpdateSourceContentRequest
     * @return UpdateSourceContentResponse
     */
    @Override
    public CompletableFuture<UpdateSourceContentResponse> updateSourceContent(UpdateSourceContentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateSourceContent").setMethod(HttpMethod.POST).setPathRegex("/openapi/updateSourceContent").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSourceContentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSourceContentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * 
     * @param request the request parameters of UpdateTenantDirectory  UpdateTenantDirectoryRequest
     * @return UpdateTenantDirectoryResponse
     */
    @Override
    public CompletableFuture<UpdateTenantDirectoryResponse> updateTenantDirectory(UpdateTenantDirectoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateTenantDirectory").setMethod(HttpMethod.POST).setPathRegex("/openapi/updateTenantDirectory").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateTenantDirectoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateTenantDirectoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>OpenAPI 修改用户信息。
     *     业务编排：
     *     1. 解析 roleCodes → role_ids
     *     2. 若 isActive 有变更，先执行状态切换（含最后超管保护）
     *     3. 调用 update_tenant_member 修改其他字段（displayName / roleCodes / userGroupIds）
     *     4. 全部成功返回 HTTP 200
     *     执行顺序说明：
     *     - isActive 状态变更先于其他字段写入。两步不在同一事务中。
     *     - 校验失败（如最后超管保护）→ 抛出异常，后续步骤不执行。
     *     - 若 isActive 变更已落库但后续步骤异常，isActive 不会回滚。</p>
     * 
     * @param request the request parameters of UpdateUser  UpdateUserRequest
     * @return UpdateUserResponse
     */
    @Override
    public CompletableFuture<UpdateUserResponse> updateUser(UpdateUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateUser").setMethod(HttpMethod.POST).setPathRegex("/openapi/updateUser").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>WinNexo 用户管理 OpenAPI：更新用户组。租户身份来自鉴权上下文。</p>
     * 
     * @param request the request parameters of UpdateUserGroup  UpdateUserGroupRequest
     * @return UpdateUserGroupResponse
     */
    @Override
    public CompletableFuture<UpdateUserGroupResponse> updateUserGroup(UpdateUserGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateUserGroup").setMethod(HttpMethod.POST).setPathRegex("/openapi/updateUserGroup").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateUserGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateUserGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API允许调用者更新指定用户的部分或全部可选字段，未提供的字段将保持原有值。</li>
     * <li>支持通过<code>tenantId</code>参数指定租户ID；若省略，则默认使用调用方的默认租户。</li>
     * <li>更新成功后，响应体中会包含完整的用户信息对象。</li>
     * <li>此接口要求认证，支持AK、BearerToken和APP三种安全方案。</li>
     * <li>接口消费类型为JSON格式，且仅在HTTPS协议下可用。</li>
     * <li>特别注意：<code>profileRoleInfo</code>字段仅当用户角色设置为Others时有效，用于描述用户的具体角色信息。</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateUserInfo  UpdateUserInfoRequest
     * @return UpdateUserInfoResponse
     */
    @Override
    public CompletableFuture<UpdateUserInfoResponse> updateUserInfo(UpdateUserInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateUserInfo").setMethod(HttpMethod.POST).setPathRegex("/openapi/updateUserInfo").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateUserInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateUserInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
