// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link SearchMemoriesRequest} extends {@link RequestModel}
 *
 * <p>SearchMemoriesRequest</p>
 */
public class SearchMemoriesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 2)
    private String workspace;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("memoryStoreName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 2)
    private String memoryStoreName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("agentId")
    private String agentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("appId")
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("metadata")
    private java.util.Map<String, ?> metadata;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("query")
    private String query;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("rerank")
    private Boolean rerank;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("runId")
    private String runId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("topK")
    private Integer topK;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("userId")
    private String userId;

    private SearchMemoriesRequest(Builder builder) {
        super(builder);
        this.workspace = builder.workspace;
        this.memoryStoreName = builder.memoryStoreName;
        this.agentId = builder.agentId;
        this.appId = builder.appId;
        this.metadata = builder.metadata;
        this.query = builder.query;
        this.rerank = builder.rerank;
        this.runId = builder.runId;
        this.topK = builder.topK;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchMemoriesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    /**
     * @return memoryStoreName
     */
    public String getMemoryStoreName() {
        return this.memoryStoreName;
    }

    /**
     * @return agentId
     */
    public String getAgentId() {
        return this.agentId;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return metadata
     */
    public java.util.Map<String, ?> getMetadata() {
        return this.metadata;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return rerank
     */
    public Boolean getRerank() {
        return this.rerank;
    }

    /**
     * @return runId
     */
    public String getRunId() {
        return this.runId;
    }

    /**
     * @return topK
     */
    public Integer getTopK() {
        return this.topK;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<SearchMemoriesRequest, Builder> {
        private String workspace; 
        private String memoryStoreName; 
        private String agentId; 
        private String appId; 
        private java.util.Map<String, ?> metadata; 
        private String query; 
        private Boolean rerank; 
        private String runId; 
        private Integer topK; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(SearchMemoriesRequest request) {
            super(request);
            this.workspace = request.workspace;
            this.memoryStoreName = request.memoryStoreName;
            this.agentId = request.agentId;
            this.appId = request.appId;
            this.metadata = request.metadata;
            this.query = request.query;
            this.rerank = request.rerank;
            this.runId = request.runId;
            this.topK = request.topK;
            this.userId = request.userId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace-test</p>
         */
        public Builder workspace(String workspace) {
            this.putPathParameter("workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>qianyi_test_1</p>
         */
        public Builder memoryStoreName(String memoryStoreName) {
            this.putPathParameter("memoryStoreName", memoryStoreName);
            this.memoryStoreName = memoryStoreName;
            return this;
        }

        /**
         * agentId.
         */
        public Builder agentId(String agentId) {
            this.putBodyParameter("agentId", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * appId.
         */
        public Builder appId(String appId) {
            this.putBodyParameter("appId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * metadata.
         */
        public Builder metadata(java.util.Map<String, ?> metadata) {
            this.putBodyParameter("metadata", metadata);
            this.metadata = metadata;
            return this;
        }

        /**
         * query.
         */
        public Builder query(String query) {
            this.putBodyParameter("query", query);
            this.query = query;
            return this;
        }

        /**
         * rerank.
         */
        public Builder rerank(Boolean rerank) {
            this.putBodyParameter("rerank", rerank);
            this.rerank = rerank;
            return this;
        }

        /**
         * runId.
         */
        public Builder runId(String runId) {
            this.putBodyParameter("runId", runId);
            this.runId = runId;
            return this;
        }

        /**
         * topK.
         */
        public Builder topK(Integer topK) {
            this.putBodyParameter("topK", topK);
            this.topK = topK;
            return this;
        }

        /**
         * userId.
         */
        public Builder userId(String userId) {
            this.putBodyParameter("userId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public SearchMemoriesRequest build() {
            return new SearchMemoriesRequest(this);
        } 

    } 

}
