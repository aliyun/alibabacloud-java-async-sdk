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
 * {@link ListExperimentPlansRequest} extends {@link RequestModel}
 *
 * <p>ListExperimentPlansRequest</p>
 */
public class ListExperimentPlansRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentSpace")
    private String agentSpace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("limit")
    private Integer limit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("offset")
    private Integer offset;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("planName")
    private String planName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private ListExperimentPlansRequest(Builder builder) {
        super(builder);
        this.agentSpace = builder.agentSpace;
        this.limit = builder.limit;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.offset = builder.offset;
        this.planName = builder.planName;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListExperimentPlansRequest create() {
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
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
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
     * @return offset
     */
    public Integer getOffset() {
        return this.offset;
    }

    /**
     * @return planName
     */
    public String getPlanName() {
        return this.planName;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListExperimentPlansRequest, Builder> {
        private String agentSpace; 
        private Integer limit; 
        private Integer maxResults; 
        private String nextToken; 
        private Integer offset; 
        private String planName; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListExperimentPlansRequest request) {
            super(request);
            this.agentSpace = request.agentSpace;
            this.limit = request.limit;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.offset = request.offset;
            this.planName = request.planName;
            this.status = request.status;
        } 

        /**
         * <p>The AgentSpace name.</p>
         * 
         * <strong>example:</strong>
         * <p>al-playground-cn-hongkong</p>
         */
        public Builder agentSpace(String agentSpace) {
            this.putPathParameter("agentSpace", agentSpace);
            this.agentSpace = agentSpace;
            return this;
        }

        /**
         * <p>The number of entries to return. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * <p>Optional. Use <code>offset</code> and <code>limit</code> for pagination instead.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>Optional. Use <code>offset</code> and <code>limit</code> for pagination instead.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJsYXN0SWQiOjEyM30=</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The offset. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder offset(Integer offset) {
            this.putQueryParameter("offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * <p>Fuzzy matches experiment plans by plan name.</p>
         * 
         * <strong>example:</strong>
         * <p>arms_agent</p>
         */
        public Builder planName(String planName) {
            this.putQueryParameter("planName", planName);
            this.planName = planName;
            return this;
        }

        /**
         * <p>Filters experiment plans by exact status.</p>
         * 
         * <strong>example:</strong>
         * <p>pending</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListExperimentPlansRequest build() {
            return new ListExperimentPlansRequest(this);
        } 

    } 

}
