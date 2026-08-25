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
 * {@link ListModelsRequest} extends {@link RequestModel}
 *
 * <p>ListModelsRequest</p>
 */
public class ListModelsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("connectionId")
    private String connectionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("modelName")
    private String modelName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    private ListModelsRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.connectionId = builder.connectionId;
        this.maxResults = builder.maxResults;
        this.modelName = builder.modelName;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListModelsRequest create() {
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
     * @return connectionId
     */
    public String getConnectionId() {
        return this.connectionId;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return modelName
     */
    public String getModelName() {
        return this.modelName;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    public static final class Builder extends Request.Builder<ListModelsRequest, Builder> {
        private String workspaceId; 
        private String connectionId; 
        private Integer maxResults; 
        private String modelName; 
        private String nextToken; 

        private Builder() {
            super();
        } 

        private Builder(ListModelsRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.connectionId = request.connectionId;
            this.maxResults = request.maxResults;
            this.modelName = request.modelName;
            this.nextToken = request.nextToken;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-1</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * connectionId.
         */
        public Builder connectionId(String connectionId) {
            this.putQueryParameter("connectionId", connectionId);
            this.connectionId = connectionId;
            return this;
        }

        /**
         * maxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * modelName.
         */
        public Builder modelName(String modelName) {
            this.putQueryParameter("modelName", modelName);
            this.modelName = modelName;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        @Override
        public ListModelsRequest build() {
            return new ListModelsRequest(this);
        } 

    } 

}
