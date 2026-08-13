// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link QuerySemanticKnowledgeRequest} extends {@link RequestModel}
 *
 * <p>QuerySemanticKnowledgeRequest</p>
 */
public class QuerySemanticKnowledgeRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("agentName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("graphName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String graphName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("query")
    @com.aliyun.core.annotation.Validation(required = true)
    private String query;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tenantId;

    private QuerySemanticKnowledgeRequest(Builder builder) {
        super(builder);
        this.agentName = builder.agentName;
        this.graphName = builder.graphName;
        this.query = builder.query;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySemanticKnowledgeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentName
     */
    public String getAgentName() {
        return this.agentName;
    }

    /**
     * @return graphName
     */
    public String getGraphName() {
        return this.graphName;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<QuerySemanticKnowledgeRequest, Builder> {
        private String agentName; 
        private String graphName; 
        private String query; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(QuerySemanticKnowledgeRequest request) {
            super(request);
            this.agentName = request.agentName;
            this.graphName = request.graphName;
            this.query = request.query;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>数字员工名称，可先调用 listAuthorizedAgents 获取 USE 权限列表</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例数字员工</p>
         */
        public Builder agentName(String agentName) {
            this.putBodyParameter("agentName", agentName);
            this.agentName = agentName;
            return this;
        }

        /**
         * <p>图谱名称，可先调用 listGraphs 获取</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder graphName(String graphName) {
            this.putBodyParameter("graphName", graphName);
            this.graphName = graphName;
            return this;
        }

        /**
         * <p>自然语言查询问题</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder query(String query) {
            this.putBodyParameter("query", query);
            this.query = query;
            return this;
        }

        /**
         * <p>租户ID，公共参数；winnexo-cli 通过 --tenant-id 显式传入</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>21577</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public QuerySemanticKnowledgeRequest build() {
            return new QuerySemanticKnowledgeRequest(this);
        } 

    } 

}
