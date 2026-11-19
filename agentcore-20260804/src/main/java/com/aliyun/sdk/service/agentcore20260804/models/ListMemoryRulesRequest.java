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
 * {@link ListMemoryRulesRequest} extends {@link RequestModel}
 *
 * <p>ListMemoryRulesRequest</p>
 */
public class ListMemoryRulesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("memoryStoreName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String memoryStoreName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nameLike")
    private String nameLike;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    private ListMemoryRulesRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.memoryStoreName = builder.memoryStoreName;
        this.enabled = builder.enabled;
        this.maxResults = builder.maxResults;
        this.nameLike = builder.nameLike;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMemoryRulesRequest create() {
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
     * @return memoryStoreName
     */
    public String getMemoryStoreName() {
        return this.memoryStoreName;
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nameLike
     */
    public String getNameLike() {
        return this.nameLike;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    public static final class Builder extends Request.Builder<ListMemoryRulesRequest, Builder> {
        private String workspaceId; 
        private String memoryStoreName; 
        private Boolean enabled; 
        private Integer maxResults; 
        private String nameLike; 
        private String nextToken; 

        private Builder() {
            super();
        } 

        private Builder(ListMemoryRulesRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.memoryStoreName = request.memoryStoreName;
            this.enabled = request.enabled;
            this.maxResults = request.maxResults;
            this.nameLike = request.nameLike;
            this.nextToken = request.nextToken;
        } 

        /**
         * <p>The workspace ID.</p>
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
         * <p>The name of the memory store.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>customer-memory</p>
         */
        public Builder memoryStoreName(String memoryStoreName) {
            this.putPathParameter("memoryStoreName", memoryStoreName);
            this.memoryStoreName = memoryStoreName;
            return this;
        }

        /**
         * <p>Filters by the enabled status.</p>
         */
        public Builder enabled(Boolean enabled) {
            this.putQueryParameter("enabled", enabled);
            this.enabled = enabled;
            return this;
        }

        /**
         * <p>The maximum number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>nameLike</p>
         * 
         * <strong>example:</strong>
         * <p>Preference</p>
         */
        public Builder nameLike(String nameLike) {
            this.putQueryParameter("nameLike", nameLike);
            this.nameLike = nameLike;
            return this;
        }

        /**
         * <p>The pagination token returned for the same resource and filter conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJvZmZzZXQiOjIwMH0=</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        @Override
        public ListMemoryRulesRequest build() {
            return new ListMemoryRulesRequest(this);
        } 

    } 

}
