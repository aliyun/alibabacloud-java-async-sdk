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
 * {@link ListContextStoresRequest} extends {@link RequestModel}
 *
 * <p>ListContextStoresRequest</p>
 */
public class ListContextStoresRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentSpace")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 2)
    private String agentSpace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("contextStoreName")
    private String contextStoreName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("contextType")
    private String contextType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    private ListContextStoresRequest(Builder builder) {
        super(builder);
        this.agentSpace = builder.agentSpace;
        this.contextStoreName = builder.contextStoreName;
        this.contextType = builder.contextType;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListContextStoresRequest create() {
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
     * @return contextStoreName
     */
    public String getContextStoreName() {
        return this.contextStoreName;
    }

    /**
     * @return contextType
     */
    public String getContextType() {
        return this.contextType;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    public static final class Builder extends Request.Builder<ListContextStoresRequest, Builder> {
        private String agentSpace; 
        private String contextStoreName; 
        private String contextType; 
        private Integer maxResults; 
        private String nextToken; 

        private Builder() {
            super();
        } 

        private Builder(ListContextStoresRequest request) {
            super(request);
            this.agentSpace = request.agentSpace;
            this.contextStoreName = request.contextStoreName;
            this.contextType = request.contextType;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent-space</p>
         */
        public Builder agentSpace(String agentSpace) {
            this.putPathParameter("agentSpace", agentSpace);
            this.agentSpace = agentSpace;
            return this;
        }

        /**
         * contextStoreName.
         */
        public Builder contextStoreName(String contextStoreName) {
            this.putQueryParameter("contextStoreName", contextStoreName);
            this.contextStoreName = contextStoreName;
            return this;
        }

        /**
         * contextType.
         */
        public Builder contextType(String contextType) {
            this.putQueryParameter("contextType", contextType);
            this.contextType = contextType;
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
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        @Override
        public ListContextStoresRequest build() {
            return new ListContextStoresRequest(this);
        } 

    } 

}
