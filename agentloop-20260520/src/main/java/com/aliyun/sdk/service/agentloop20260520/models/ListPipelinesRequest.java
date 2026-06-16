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
 * {@link ListPipelinesRequest} extends {@link RequestModel}
 *
 * <p>ListPipelinesRequest</p>
 */
public class ListPipelinesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentSpace")
    private String agentSpace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pipelineName")
    private String pipelineName;

    private ListPipelinesRequest(Builder builder) {
        super(builder);
        this.agentSpace = builder.agentSpace;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pipelineName = builder.pipelineName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPipelinesRequest create() {
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

    /**
     * @return pipelineName
     */
    public String getPipelineName() {
        return this.pipelineName;
    }

    public static final class Builder extends Request.Builder<ListPipelinesRequest, Builder> {
        private String agentSpace; 
        private Integer maxResults; 
        private String nextToken; 
        private String pipelineName; 

        private Builder() {
            super();
        } 

        private Builder(ListPipelinesRequest request) {
            super(request);
            this.agentSpace = request.agentSpace;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.pipelineName = request.pipelineName;
        } 

        /**
         * agentSpace.
         */
        public Builder agentSpace(String agentSpace) {
            this.putPathParameter("agentSpace", agentSpace);
            this.agentSpace = agentSpace;
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

        /**
         * pipelineName.
         */
        public Builder pipelineName(String pipelineName) {
            this.putQueryParameter("pipelineName", pipelineName);
            this.pipelineName = pipelineName;
            return this;
        }

        @Override
        public ListPipelinesRequest build() {
            return new ListPipelinesRequest(this);
        } 

    } 

}
