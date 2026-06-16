// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

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
 * {@link SearchMem0MemoriesRequest} extends {@link RequestModel}
 *
 * <p>SearchMem0MemoriesRequest</p>
 */
public class SearchMem0MemoriesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("agentSpace")
    private String agentSpace;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private java.util.Map<String, ?> body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("context_store_id")
    private String contextStoreId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("enable_graph")
    private Boolean enableGraph;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("org_id")
    private String orgId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("project_id")
    private String projectId;

    private SearchMem0MemoriesRequest(Builder builder) {
        super(builder);
        this.agentSpace = builder.agentSpace;
        this.body = builder.body;
        this.contextStoreId = builder.contextStoreId;
        this.enableGraph = builder.enableGraph;
        this.orgId = builder.orgId;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchMem0MemoriesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentSpace
     */
    public String getAgentSpace() {
        return this.agentSpace;
    }

    /**
     * @return body
     */
    public java.util.Map<String, ?> getBody() {
        return this.body;
    }

    /**
     * @return contextStoreId
     */
    public String getContextStoreId() {
        return this.contextStoreId;
    }

    /**
     * @return enableGraph
     */
    public Boolean getEnableGraph() {
        return this.enableGraph;
    }

    /**
     * @return orgId
     */
    public String getOrgId() {
        return this.orgId;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<SearchMem0MemoriesRequest, Builder> {
        private String agentSpace; 
        private java.util.Map<String, ?> body; 
        private String contextStoreId; 
        private Boolean enableGraph; 
        private String orgId; 
        private String projectId; 

        private Builder() {
            super();
        } 

        private Builder(SearchMem0MemoriesRequest request) {
            super(request);
            this.agentSpace = request.agentSpace;
            this.body = request.body;
            this.contextStoreId = request.contextStoreId;
            this.enableGraph = request.enableGraph;
            this.orgId = request.orgId;
            this.projectId = request.projectId;
        } 

        /**
         * agentSpace.
         */
        public Builder agentSpace(String agentSpace) {
            this.putQueryParameter("agentSpace", agentSpace);
            this.agentSpace = agentSpace;
            return this;
        }

        /**
         * body.
         */
        public Builder body(java.util.Map<String, ?> body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * context_store_id.
         */
        public Builder contextStoreId(String contextStoreId) {
            this.putQueryParameter("context_store_id", contextStoreId);
            this.contextStoreId = contextStoreId;
            return this;
        }

        /**
         * enable_graph.
         */
        public Builder enableGraph(Boolean enableGraph) {
            this.putQueryParameter("enable_graph", enableGraph);
            this.enableGraph = enableGraph;
            return this;
        }

        /**
         * org_id.
         */
        public Builder orgId(String orgId) {
            this.putQueryParameter("org_id", orgId);
            this.orgId = orgId;
            return this;
        }

        /**
         * project_id.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("project_id", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public SearchMem0MemoriesRequest build() {
            return new SearchMem0MemoriesRequest(this);
        } 

    } 

}
