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
 * {@link ListOptimizeRunsRequest} extends {@link RequestModel}
 *
 * <p>ListOptimizeRunsRequest</p>
 */
public class ListOptimizeRunsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentSpace")
    private String agentSpace;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("optimizeTaskName")
    private String optimizeTaskName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("windowStartTimeBegin")
    private Long windowStartTimeBegin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("windowStartTimeEnd")
    private Long windowStartTimeEnd;

    private ListOptimizeRunsRequest(Builder builder) {
        super(builder);
        this.agentSpace = builder.agentSpace;
        this.optimizeTaskName = builder.optimizeTaskName;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.status = builder.status;
        this.windowStartTimeBegin = builder.windowStartTimeBegin;
        this.windowStartTimeEnd = builder.windowStartTimeEnd;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOptimizeRunsRequest create() {
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
     * @return optimizeTaskName
     */
    public String getOptimizeTaskName() {
        return this.optimizeTaskName;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return windowStartTimeBegin
     */
    public Long getWindowStartTimeBegin() {
        return this.windowStartTimeBegin;
    }

    /**
     * @return windowStartTimeEnd
     */
    public Long getWindowStartTimeEnd() {
        return this.windowStartTimeEnd;
    }

    public static final class Builder extends Request.Builder<ListOptimizeRunsRequest, Builder> {
        private String agentSpace; 
        private String optimizeTaskName; 
        private Integer maxResults; 
        private String nextToken; 
        private String status; 
        private Long windowStartTimeBegin; 
        private Long windowStartTimeEnd; 

        private Builder() {
            super();
        } 

        private Builder(ListOptimizeRunsRequest request) {
            super(request);
            this.agentSpace = request.agentSpace;
            this.optimizeTaskName = request.optimizeTaskName;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.status = request.status;
            this.windowStartTimeBegin = request.windowStartTimeBegin;
            this.windowStartTimeEnd = request.windowStartTimeEnd;
        } 

        /**
         * <p>The name of the AgentSpace.</p>
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
         * <p>The name of the optimization task.</p>
         * 
         * <strong>example:</strong>
         * <p>efficiency-analysis</p>
         */
        public Builder optimizeTaskName(String optimizeTaskName) {
            this.putPathParameter("optimizeTaskName", optimizeTaskName);
            this.optimizeTaskName = optimizeTaskName;
            return this;
        }

        /**
         * <p>The maximum number of entries to return. Default value: 20. Maximum value: 100.</p>
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
         * <p>The pagination token.</p>
         * 
         * <strong>example:</strong>
         * <p>MTIzNDU2Nzg5MA==</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The status used to filter results.</p>
         * 
         * <strong>example:</strong>
         * <p>Succeeded</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The lower bound of the window start time in UNIX seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1786432688000</p>
         */
        public Builder windowStartTimeBegin(Long windowStartTimeBegin) {
            this.putQueryParameter("windowStartTimeBegin", windowStartTimeBegin);
            this.windowStartTimeBegin = windowStartTimeBegin;
            return this;
        }

        /**
         * <p>The upper bound of the window start time in UNIX seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1786432690000</p>
         */
        public Builder windowStartTimeEnd(Long windowStartTimeEnd) {
            this.putQueryParameter("windowStartTimeEnd", windowStartTimeEnd);
            this.windowStartTimeEnd = windowStartTimeEnd;
            return this;
        }

        @Override
        public ListOptimizeRunsRequest build() {
            return new ListOptimizeRunsRequest(this);
        } 

    } 

}
