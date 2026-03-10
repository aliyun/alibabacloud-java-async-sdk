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
 * {@link ListMemoryStoresRequest} extends {@link RequestModel}
 *
 * <p>ListMemoryStoresRequest</p>
 */
public class ListMemoryStoresRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 2)
    private String workspace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("memoryStoreName")
    private String memoryStoreName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    private ListMemoryStoresRequest(Builder builder) {
        super(builder);
        this.workspace = builder.workspace;
        this.maxResults = builder.maxResults;
        this.memoryStoreName = builder.memoryStoreName;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMemoryStoresRequest create() {
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
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return memoryStoreName
     */
    public String getMemoryStoreName() {
        return this.memoryStoreName;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    public static final class Builder extends Request.Builder<ListMemoryStoresRequest, Builder> {
        private String workspace; 
        private Integer maxResults; 
        private String memoryStoreName; 
        private String nextToken; 

        private Builder() {
            super();
        } 

        private Builder(ListMemoryStoresRequest request) {
            super(request);
            this.workspace = request.workspace;
            this.maxResults = request.maxResults;
            this.memoryStoreName = request.memoryStoreName;
            this.nextToken = request.nextToken;
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
         * maxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * memoryStoreName.
         */
        public Builder memoryStoreName(String memoryStoreName) {
            this.putQueryParameter("memoryStoreName", memoryStoreName);
            this.memoryStoreName = memoryStoreName;
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
        public ListMemoryStoresRequest build() {
            return new ListMemoryStoresRequest(this);
        } 

    } 

}
