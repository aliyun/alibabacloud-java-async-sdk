// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link BeginAssetUploadRequest} extends {@link RequestModel}
 *
 * <p>BeginAssetUploadRequest</p>
 */
public class BeginAssetUploadRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("knowledgeBaseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String knowledgeBaseId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
    private BeginAssetUploadRequestBody body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private BeginAssetUploadRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.knowledgeBaseId = builder.knowledgeBaseId;
        this.body = builder.body;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BeginAssetUploadRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return knowledgeBaseId
     */
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * @return body
     */
    public BeginAssetUploadRequestBody getBody() {
        return this.body;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<BeginAssetUploadRequest, Builder> {
        private String workspaceId; 
        private String knowledgeBaseId; 
        private BeginAssetUploadRequestBody body; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(BeginAssetUploadRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.knowledgeBaseId = request.knowledgeBaseId;
            this.body = request.body;
            this.clientToken = request.clientToken;
        } 

        /**
         * <p>由 Magic 从可信网关调用身份解析 tenantId 并校验工作空间归属；知识库在该租户及工作空间内创建或访问，不能仅凭 knowledgeBaseId 跨租户查询。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-2f5f9c5a8d0e4c3b</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>接收资产的知识库。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>kb-2f5f9c5a8d0e4c3b</p>
         */
        public Builder knowledgeBaseId(String knowledgeBaseId) {
            this.putPathParameter("knowledgeBaseId", knowledgeBaseId);
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }

        /**
         * <p>登记新资产，或为指定资产创建、复用上传会话。覆盖授权、最近 token 幂等检查、来源版本去重与加工代次分配由管控层原子完成。</p>
         * <p>This parameter is required.</p>
         */
        public Builder body(BeginAssetUploadRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putBodyParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        /**
         * <p>可选。提供时须为非空白字符串，最长 128 个字符；仅对该资产最近一次 Begin 保存的 token 幂等，后续 Begin（包括省略 clientToken 的请求）会替换最近请求标识。命中时必须使用相同规范化请求，包括 sourceETag，否则返回幂等冲突。未提供时按新的上传意图处理，不保证跨请求重试幂等；同时未指定 assetId 时每次请求创建新资产。与来源版本去重独立：被后续 Begin 替换的旧 token 再次到来时按新意图处理；覆盖已有资产仍须 overwrite=true，并可在指定稳定 assetId 时按 sourceETag 规则复用当前会话。</p>
         * 
         * <strong>example:</strong>
         * <p>asset-upload-001</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public BeginAssetUploadRequest build() {
            return new BeginAssetUploadRequest(this);
        } 

    } 

    /**
     * 
     * {@link BeginAssetUploadRequest} extends {@link TeaModel}
     *
     * <p>BeginAssetUploadRequest</p>
     */
    public static class PreprocessRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("removeUrlsAndEmails")
        private Boolean removeUrlsAndEmails;

        @com.aliyun.core.annotation.NameInMap("replaceConsecutiveWhitespace")
        private Boolean replaceConsecutiveWhitespace;

        private PreprocessRules(Builder builder) {
            this.removeUrlsAndEmails = builder.removeUrlsAndEmails;
            this.replaceConsecutiveWhitespace = builder.replaceConsecutiveWhitespace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PreprocessRules create() {
            return builder().build();
        }

        /**
         * @return removeUrlsAndEmails
         */
        public Boolean getRemoveUrlsAndEmails() {
            return this.removeUrlsAndEmails;
        }

        /**
         * @return replaceConsecutiveWhitespace
         */
        public Boolean getReplaceConsecutiveWhitespace() {
            return this.replaceConsecutiveWhitespace;
        }

        public static final class Builder {
            private Boolean removeUrlsAndEmails; 
            private Boolean replaceConsecutiveWhitespace; 

            private Builder() {
            } 

            private Builder(PreprocessRules model) {
                this.removeUrlsAndEmails = model.removeUrlsAndEmails;
                this.replaceConsecutiveWhitespace = model.replaceConsecutiveWhitespace;
            } 

            /**
             * <p>是否在解析时删除 URL 和邮箱地址。</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder removeUrlsAndEmails(Boolean removeUrlsAndEmails) {
                this.removeUrlsAndEmails = removeUrlsAndEmails;
                return this;
            }

            /**
             * <p>是否将连续空格、换行、制表符替换为单个空格。</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder replaceConsecutiveWhitespace(Boolean replaceConsecutiveWhitespace) {
                this.replaceConsecutiveWhitespace = replaceConsecutiveWhitespace;
                return this;
            }

            public PreprocessRules build() {
                return new PreprocessRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link BeginAssetUploadRequest} extends {@link TeaModel}
     *
     * <p>BeginAssetUploadRequest</p>
     */
    public static class ChunkConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("headingLevel")
        private Integer headingLevel;

        @com.aliyun.core.annotation.NameInMap("maxChunkSize")
        @com.aliyun.core.annotation.Validation(maximum = 6000, minimum = 1)
        private Integer maxChunkSize;

        @com.aliyun.core.annotation.NameInMap("overlapSize")
        private Integer overlapSize;

        @com.aliyun.core.annotation.NameInMap("preprocessRules")
        private PreprocessRules preprocessRules;

        @com.aliyun.core.annotation.NameInMap("separator")
        @com.aliyun.core.annotation.Validation(maxLength = 32)
        private String separator;

        @com.aliyun.core.annotation.NameInMap("strategy")
        @com.aliyun.core.annotation.Validation(required = true)
        private String strategy;

        private ChunkConfiguration(Builder builder) {
            this.headingLevel = builder.headingLevel;
            this.maxChunkSize = builder.maxChunkSize;
            this.overlapSize = builder.overlapSize;
            this.preprocessRules = builder.preprocessRules;
            this.separator = builder.separator;
            this.strategy = builder.strategy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChunkConfiguration create() {
            return builder().build();
        }

        /**
         * @return headingLevel
         */
        public Integer getHeadingLevel() {
            return this.headingLevel;
        }

        /**
         * @return maxChunkSize
         */
        public Integer getMaxChunkSize() {
            return this.maxChunkSize;
        }

        /**
         * @return overlapSize
         */
        public Integer getOverlapSize() {
            return this.overlapSize;
        }

        /**
         * @return preprocessRules
         */
        public PreprocessRules getPreprocessRules() {
            return this.preprocessRules;
        }

        /**
         * @return separator
         */
        public String getSeparator() {
            return this.separator;
        }

        /**
         * @return strategy
         */
        public String getStrategy() {
            return this.strategy;
        }

        public static final class Builder {
            private Integer headingLevel; 
            private Integer maxChunkSize; 
            private Integer overlapSize; 
            private PreprocessRules preprocessRules; 
            private String separator; 
            private String strategy; 

            private Builder() {
            } 

            private Builder(ChunkConfiguration model) {
                this.headingLevel = model.headingLevel;
                this.maxChunkSize = model.maxChunkSize;
                this.overlapSize = model.overlapSize;
                this.preprocessRules = model.preprocessRules;
                this.separator = model.separator;
                this.strategy = model.strategy;
            } 

            /**
             * <p>BY_HEADING 下必填且范围为 1 至 6。小于等于此级数的标题均作为边界；更深标题保留在正文，超长节按段落或句子回退，无标题文档退化为智能切分。其他策略忽略，由后端按策略校验。</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder headingLevel(Integer headingLevel) {
                this.headingLevel = headingLevel;
                return this;
            }

            /**
             * <p>1 至 6000 字符，沿用 EB 的字符长度口径，不是 Token 数；省略使用服务端默认值。</p>
             * 
             * <strong>example:</strong>
             * <p>512</p>
             */
            public Builder maxChunkSize(Integer maxChunkSize) {
                this.maxChunkSize = maxChunkSize;
                return this;
            }

            /**
             * <p>仅 BY_LENGTH 生效，单位为字符，缺省为 0；有效值须大于等于 0 且小于有效 maxChunkSize，重叠后仍不超过最大分块长度。其他策略忽略，由后端按策略校验。</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
             */
            public Builder overlapSize(Integer overlapSize) {
                this.overlapSize = overlapSize;
                return this;
            }

            /**
             * <p>切分前的文本预处理规则。</p>
             */
            public Builder preprocessRules(PreprocessRules preprocessRules) {
                this.preprocessRules = preprocessRules;
                return this;
            }

            /**
             * <p>BY_SEPARATOR 下必填且非空，按字面字符串整体匹配，不使用正则；其他策略忽略。</p>
             * 
             * <strong>example:</strong>
             * <p>\n\n</p>
             */
            public Builder separator(String separator) {
                this.separator = separator;
                return this;
            }

            /**
             * <p>返回已保存的分块策略。AUTO 为自动分块，BY_SEPARATOR 为分隔符分块；BY_LENGTH 和 BY_HEADING 仅为历史配置兼容返回，新建或更新配置时一期仅接受 AUTO 和 BY_SEPARATOR。</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>AUTO</p>
             */
            public Builder strategy(String strategy) {
                this.strategy = strategy;
                return this;
            }

            public ChunkConfiguration build() {
                return new ChunkConfiguration(this);
            } 

        } 

    }
    /**
     * 
     * {@link BeginAssetUploadRequest} extends {@link TeaModel}
     *
     * <p>BeginAssetUploadRequest</p>
     */
    public static class Metadata extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("key")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
        private String key;

        @com.aliyun.core.annotation.NameInMap("value")
        @com.aliyun.core.annotation.Validation(maxLength = 1024)
        private String value;

        private Metadata(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Metadata create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Metadata model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>metadataSchema 中声明的字段名；同一请求中不得重复。固定值及系统变量字段由服务端生成，不接受客户覆盖。</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>department</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>按 schema 类型解析的字符串。上传时省略或空值表示未赋值，由 schema 填充；UpdateAsset 中省略、null 或空串表示删除该 key，未提交的 key 保持不变。DATETIME 接受 ISO 8601 含时区、yyyy-MM-dd HH:mm:ss 或 yyyy-MM-dd。</p>
             * 
             * <strong>example:</strong>
             * <p>engineering</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Metadata build() {
                return new Metadata(this);
            } 

        } 

    }
    /**
     * 
     * {@link BeginAssetUploadRequest} extends {@link TeaModel}
     *
     * <p>BeginAssetUploadRequest</p>
     */
    public static class BeginAssetUploadRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("assetId")
        private String assetId;

        @com.aliyun.core.annotation.NameInMap("chunkConfiguration")
        private ChunkConfiguration chunkConfiguration;

        @com.aliyun.core.annotation.NameInMap("contentType")
        private String contentType;

        @com.aliyun.core.annotation.NameInMap("fileName")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 255)
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("metadata")
        private java.util.List<Metadata> metadata;

        @com.aliyun.core.annotation.NameInMap("overwrite")
        private Boolean overwrite;

        @com.aliyun.core.annotation.NameInMap("sourceETag")
        @com.aliyun.core.annotation.Validation(maxLength = 1024)
        private String sourceETag;

        @com.aliyun.core.annotation.NameInMap("sourceModifiedTime")
        private Long sourceModifiedTime;

        @com.aliyun.core.annotation.NameInMap("sourceUri")
        @com.aliyun.core.annotation.Validation(maxLength = 1024)
        private String sourceUri;

        private BeginAssetUploadRequestBody(Builder builder) {
            this.assetId = builder.assetId;
            this.chunkConfiguration = builder.chunkConfiguration;
            this.contentType = builder.contentType;
            this.fileName = builder.fileName;
            this.metadata = builder.metadata;
            this.overwrite = builder.overwrite;
            this.sourceETag = builder.sourceETag;
            this.sourceModifiedTime = builder.sourceModifiedTime;
            this.sourceUri = builder.sourceUri;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BeginAssetUploadRequestBody create() {
            return builder().build();
        }

        /**
         * @return assetId
         */
        public String getAssetId() {
            return this.assetId;
        }

        /**
         * @return chunkConfiguration
         */
        public ChunkConfiguration getChunkConfiguration() {
            return this.chunkConfiguration;
        }

        /**
         * @return contentType
         */
        public String getContentType() {
            return this.contentType;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return metadata
         */
        public java.util.List<Metadata> getMetadata() {
            return this.metadata;
        }

        /**
         * @return overwrite
         */
        public Boolean getOverwrite() {
            return this.overwrite;
        }

        /**
         * @return sourceETag
         */
        public String getSourceETag() {
            return this.sourceETag;
        }

        /**
         * @return sourceModifiedTime
         */
        public Long getSourceModifiedTime() {
            return this.sourceModifiedTime;
        }

        /**
         * @return sourceUri
         */
        public String getSourceUri() {
            return this.sourceUri;
        }

        public static final class Builder {
            private String assetId; 
            private ChunkConfiguration chunkConfiguration; 
            private String contentType; 
            private String fileName; 
            private java.util.List<Metadata> metadata; 
            private Boolean overwrite; 
            private String sourceETag; 
            private Long sourceModifiedTime; 
            private String sourceUri; 

            private Builder() {
            } 

            private Builder(BeginAssetUploadRequestBody model) {
                this.assetId = model.assetId;
                this.chunkConfiguration = model.chunkConfiguration;
                this.contentType = model.contentType;
                this.fileName = model.fileName;
                this.metadata = model.metadata;
                this.overwrite = model.overwrite;
                this.sourceETag = model.sourceETag;
                this.sourceModifiedTime = model.sourceModifiedTime;
                this.sourceUri = model.sourceUri;
            } 

            /**
             * <p>可选的稳定资产标识，限定在当前租户、工作空间和知识库内。未指定 assetId 但提供 clientToken 时，按完整资源范围和 clientToken 稳定派生；两者均未提供时，每次请求创建新资产。指定已有资产且开始新会话时必须设置 overwrite=true；来源版本去重也要求指定稳定 assetId 和 overwrite=true。</p>
             * 
             * <strong>example:</strong>
             * <p>asset-001</p>
             */
            public Builder assetId(String assetId) {
                this.assetId = assetId;
                return this;
            }

            /**
             * <p>仅对本次资产内容生效的分块策略快照；省略时使用知识库默认配置。maxChunkSize 以字符计，范围 1 至 6000，一期仅支持 AUTO 和 BY_SEPARATOR，其他限制见 KnowledgeBaseChunkConfigurationInput。</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;strategy&quot;:&quot;AUTO&quot;,&quot;maxChunkSize&quot;:1000}</p>
             */
            public Builder chunkConfiguration(ChunkConfiguration chunkConfiguration) {
                this.chunkConfiguration = chunkConfiguration;
                return this;
            }

            /**
             * <p>可选的原件 MIME 类型；省略时平台根据 fileName 推导。有效类型通过响应 contentType 和签名 headers 返回，上传时必须原样携带 Content-Type；CompleteAssetUpload 再与 OSS 对象核验。</p>
             * 
             * <strong>example:</strong>
             * <p>application/pdf</p>
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * <p>原件文件名，最长 255 个字符；不得包含由客户端控制的 OSS 路径。</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>guide.pdf</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>资产级元数据键值对，仅允许 metadataSchema 声明的字段，value 使用字符串表示并按字段类型校验。value 省略、为 null 或空字符串时视为未提供，按 schema 中的固定值或系统变量自动填充；客户端显式覆盖固定值或系统变量字段时由后端拒绝。</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;key&quot;:&quot;category&quot;,&quot;value&quot;:&quot;manual&quot;}]</p>
             */
            public Builder metadata(java.util.List<Metadata> metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * <p>默认 false。true 授权覆盖同一 assetId，但不强制重新导入；满足 sourceETag 去重条件时复用当前会话，否则创建新的上传会话和加工代次。旧发布结果在新结果处理成功前保持可用，不会原地覆盖旧会话的 OSS 对象。</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder overwrite(Boolean overwrite) {
                this.overwrite = overwrite;
                return this;
            }

            /**
             * <p>可选的上游来源不透明版本标记，最长 1024 个字符；非 null 时不得为空字符串或仅包含空白，由后端校验。OSS 来源使用源对象 ETag，飞书来源可使用毫秒更新时间字符串。仅用于来源版本相等判断，不与目标 OSS 对象 ETag 比较，也不用于版本排序。指定稳定 assetId、overwrite=true 且来源身份及版本、导入参数和有效处理配置均未变化时可复用当前会话，是否提供 clientToken 不影响此规则；显式提供且命中最近 clientToken 时仍要求完整规范化请求相同。未提供 sourceETag 时不启用来源版本去重。</p>
             * 
             * <strong>example:</strong>
             * <p>source-etag-v1</p>
             */
            public Builder sourceETag(String sourceETag) {
                this.sourceETag = sourceETag;
                return this;
            }

            /**
             * <p>可选的上游源系统最后修改时间，epoch 毫秒，由客户声明、系统不核实；用于 SOURCE_MODIFIED_TIME 系统变量，不传时该变量为空，事件流导入时由系统维护。</p>
             * 
             * <strong>example:</strong>
             * <p>1788000000000</p>
             */
            public Builder sourceModifiedTime(Long sourceModifiedTime) {
                this.sourceModifiedTime = sourceModifiedTime;
                return this;
            }

            /**
             * <p>可选的上游原件出处，最长 1024 个字符，由客户声明、系统不核实；用于 SOURCE_URI 系统变量，不传时该变量为空，事件流导入时由系统维护。</p>
             * 
             * <strong>example:</strong>
             * <p>oss://my-bucket/docs/guide.pdf</p>
             */
            public Builder sourceUri(String sourceUri) {
                this.sourceUri = sourceUri;
                return this;
            }

            public BeginAssetUploadRequestBody build() {
                return new BeginAssetUploadRequestBody(this);
            } 

        } 

    }
}
