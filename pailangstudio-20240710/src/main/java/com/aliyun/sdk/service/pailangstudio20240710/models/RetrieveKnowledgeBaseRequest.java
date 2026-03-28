// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pailangstudio20240710.models;

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
 * {@link RetrieveKnowledgeBaseRequest} extends {@link RequestModel}
 *
 * <p>RetrieveKnowledgeBaseRequest</p>
 */
public class RetrieveKnowledgeBaseRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseId")
    private String knowledgeBaseId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HybridStrategyConfig")
    private String hybridStrategyConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MetaDataFilterConditions")
    private String metaDataFilterConditions;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Query")
    @com.aliyun.core.annotation.Validation(required = true)
    private String query;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("QueryMode")
    private String queryMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RerankConfig")
    private String rerankConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RewriteConfig")
    private String rewriteConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ScoreThreshold")
    private Float scoreThreshold;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TopK")
    private Integer topK;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VersionName")
    private String versionName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private RetrieveKnowledgeBaseRequest(Builder builder) {
        super(builder);
        this.knowledgeBaseId = builder.knowledgeBaseId;
        this.hybridStrategyConfig = builder.hybridStrategyConfig;
        this.metaDataFilterConditions = builder.metaDataFilterConditions;
        this.query = builder.query;
        this.queryMode = builder.queryMode;
        this.rerankConfig = builder.rerankConfig;
        this.rewriteConfig = builder.rewriteConfig;
        this.scoreThreshold = builder.scoreThreshold;
        this.topK = builder.topK;
        this.versionName = builder.versionName;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RetrieveKnowledgeBaseRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return knowledgeBaseId
     */
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * @return hybridStrategyConfig
     */
    public String getHybridStrategyConfig() {
        return this.hybridStrategyConfig;
    }

    /**
     * @return metaDataFilterConditions
     */
    public String getMetaDataFilterConditions() {
        return this.metaDataFilterConditions;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return queryMode
     */
    public String getQueryMode() {
        return this.queryMode;
    }

    /**
     * @return rerankConfig
     */
    public String getRerankConfig() {
        return this.rerankConfig;
    }

    /**
     * @return rewriteConfig
     */
    public String getRewriteConfig() {
        return this.rewriteConfig;
    }

    /**
     * @return scoreThreshold
     */
    public Float getScoreThreshold() {
        return this.scoreThreshold;
    }

    /**
     * @return topK
     */
    public Integer getTopK() {
        return this.topK;
    }

    /**
     * @return versionName
     */
    public String getVersionName() {
        return this.versionName;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<RetrieveKnowledgeBaseRequest, Builder> {
        private String knowledgeBaseId; 
        private String hybridStrategyConfig; 
        private String metaDataFilterConditions; 
        private String query; 
        private String queryMode; 
        private String rerankConfig; 
        private String rewriteConfig; 
        private Float scoreThreshold; 
        private Integer topK; 
        private String versionName; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(RetrieveKnowledgeBaseRequest request) {
            super(request);
            this.knowledgeBaseId = request.knowledgeBaseId;
            this.hybridStrategyConfig = request.hybridStrategyConfig;
            this.metaDataFilterConditions = request.metaDataFilterConditions;
            this.query = request.query;
            this.queryMode = request.queryMode;
            this.rerankConfig = request.rerankConfig;
            this.rewriteConfig = request.rewriteConfig;
            this.scoreThreshold = request.scoreThreshold;
            this.topK = request.topK;
            this.versionName = request.versionName;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>知识库ID。</p>
         * 
         * <strong>example:</strong>
         * <p>d-ksicx823d</p>
         */
        public Builder knowledgeBaseId(String knowledgeBaseId) {
            this.putPathParameter("KnowledgeBaseId", knowledgeBaseId);
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }

        /**
         * <p>混合检索策略配置，选填。JSON格式字符串，JSON字段定义如下：</p>
         * <ul>
         * <li><p>Strategy：混合检索策略。取值为rrf（RRF融合）和weighted（加权融合）</p>
         * </li>
         * <li><p>RRFK：RRF融合平滑参数，取值范围 [1, 100]</p>
         * </li>
         * <li><p>Weight：weighted策略的权重，该值表示向量语义检索对最终得分的贡献比例。取值范围 [0, 1.0]</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;Strategy&quot;: &quot;rrf&quot;,
         *   &quot;RRFK&quot;:60,
         *   &quot;Weight&quot;: 0.5
         * }</p>
         */
        public Builder hybridStrategyConfig(String hybridStrategyConfig) {
            this.putBodyParameter("HybridStrategyConfig", hybridStrategyConfig);
            this.hybridStrategyConfig = hybridStrategyConfig;
            return this;
        }

        /**
         * <p>选填。元数据过滤检索条件。格式为JSON格式字符串，JSON字段定义如下：</p>
         * <ul>
         * <li>FilterCondition: 逻辑关系，取值：and、or。</li>
         * <li>MetaDataFilters：过滤条件。多个条件之间按FilterCondition的逻辑关系处理。其中Key表示元数据Key；Value表示元数据值；Operator表示运算符，取值：==、!=、contains，contains仅支持file_name字段。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;FilterCondition&quot;: &quot;and&quot;, 
         *     &quot;MetaDataFilters&quot;: [
         *         {
         *             &quot;Key&quot;: &quot;key1&quot;, 
         *             &quot;Value&quot;: &quot;value1&quot;, 
         *             &quot;Operator&quot;: &quot;==&quot;
         *         },
         *         {
         *             &quot;Key&quot;: &quot;key2&quot;, 
         *             &quot;Value&quot;: &quot;value2&quot;, 
         *             &quot;Operator&quot;: &quot;!=&quot;
         *         },
         *         {
         *             &quot;Key&quot;: &quot;file_name&quot;, 
         *             &quot;Value&quot;: &quot;prefix&quot;, 
         *             &quot;Operator&quot;: &quot;contains&quot;
         *         }
         *     ]
         * }</p>
         */
        public Builder metaDataFilterConditions(String metaDataFilterConditions) {
            this.putBodyParameter("MetaDataFilterConditions", metaDataFilterConditions);
            this.metaDataFilterConditions = metaDataFilterConditions;
            return this;
        }

        /**
         * <p>检索内容。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>red car</p>
         */
        public Builder query(String query) {
            this.putBodyParameter("Query", query);
            this.query = query;
            return this;
        }

        /**
         * <p>检索模式。</p>
         * <ul>
         * <li>dense: 语义检索。</li>
         * <li>hybrid: 混合检索。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>dense</p>
         */
        public Builder queryMode(String queryMode) {
            this.putBodyParameter("QueryMode", queryMode);
            this.queryMode = queryMode;
            return this;
        }

        /**
         * <p>Rerank配置，选填。JSON格式字符串，JSON字段定义如下：</p>
         * <ul>
         * <li><p>ConnectionId：模型服务连接ID</p>
         * </li>
         * <li><p>Model：模型名称。若为百炼类型连接，支持的模型为 gte-rerank-v2</p>
         * </li>
         * <li><p>TopK：返回排名最高的结果数</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{
         *    &quot;ConnectionId&quot;:&quot;conn-xxx&quot;,
         *     &quot;Model&quot;: &quot;qwen-max&quot;,
         *     &quot;TopK&quot;: 5
         * }</p>
         */
        public Builder rerankConfig(String rerankConfig) {
            this.putBodyParameter("RerankConfig", rerankConfig);
            this.rerankConfig = rerankConfig;
            return this;
        }

        /**
         * <p>Rewrite配置，选填。JSON格式字符串，JSON字段定义如下：</p>
         * <ul>
         * <li><p>ConnectionId：模型服务连接ID</p>
         * </li>
         * <li><p>Model：模型名称。百炼连接支持的模型为qwen3-max、qwen-plus、qwen-flash</p>
         * </li>
         * <li><p>Temprature：用于控制大模型生成内容的随机性，值越高结果越随机。取值范围 [0, 2.0]。</p>
         * </li>
         * <li><p>TopP：生成过程中的核采样方法概率阈值，取值范围 [0, 1.0]</p>
         * </li>
         * <li><p>PresensePenalty：存在惩罚，取值范围 [-2.0, 2.0]</p>
         * </li>
         * <li><p>FrequencyPenalty：频率惩罚，取值范围 [-2.0~2.0]</p>
         * </li>
         * <li><p>Seed：随机数种子，取值范围 [0, 2147483647]</p>
         * </li>
         * <li><p>MaxTokens：控制模型生成结果的长度</p>
         * </li>
         * <li><p>Stop：停止序列列表。遇到列表中的任何一个序列，模型停止输出。最多支持4个序列。</p>
         * </li>
         * <li><p>EnableThingking：是否启用推理</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;ConnectionId&quot;:&quot;conn-xxx&quot;,
         *     &quot;Model&quot;: &quot;qwen-max&quot;,
         *     &quot;Temperature&quot;: 0.7,
         *     &quot;TopP&quot;: 0.9,
         *     &quot;PresencePenalty&quot;: 0.5,
         *     &quot;FrequencyPenalty&quot;: 0.5,
         *     &quot;Seed&quot;: 0,
         *     &quot;MaxTokens&quot;: 1024,
         *     &quot;Stop&quot;: [],
         *     &quot;EnableThinking&quot;: true
         * }</p>
         */
        public Builder rewriteConfig(String rewriteConfig) {
            this.putBodyParameter("RewriteConfig", rewriteConfig);
            this.rewriteConfig = rewriteConfig;
            return this;
        }

        /**
         * <p>相似度分数阈值。浮点型，取值范围[0, 1]。</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        public Builder scoreThreshold(Float scoreThreshold) {
            this.putBodyParameter("ScoreThreshold", scoreThreshold);
            this.scoreThreshold = scoreThreshold;
            return this;
        }

        /**
         * <p>返回排名最高的结果数。</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder topK(Integer topK) {
            this.putBodyParameter("TopK", topK);
            this.topK = topK;
            return this;
        }

        /**
         * <p>知识库版本。默认v1。</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        public Builder versionName(String versionName) {
            this.putBodyParameter("VersionName", versionName);
            this.versionName = versionName;
            return this;
        }

        /**
         * <p>知识库所在工作空间ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>174***</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public RetrieveKnowledgeBaseRequest build() {
            return new RetrieveKnowledgeBaseRequest(this);
        } 

    } 

}
