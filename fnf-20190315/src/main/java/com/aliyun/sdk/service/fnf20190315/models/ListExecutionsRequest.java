// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fnf20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListExecutionsRequest} extends {@link RequestModel}
 *
 * <p>ListExecutionsRequest</p>
 */
public class ListExecutionsRequest extends Request {
    @Query
    @NameInMap("ExecutionNamePrefix")
    private String executionNamePrefix;

    @Query
    @NameInMap("FlowName")
    @Validation(required = true)
    private String flowName;

    @Query
    @NameInMap("Limit")
    private Integer limit;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("RequestId")
    private String requestId;

    @Query
    @NameInMap("StartedTimeBegin")
    private String startedTimeBegin;

    @Query
    @NameInMap("StartedTimeEnd")
    private String startedTimeEnd;

    @Query
    @NameInMap("Status")
    private String status;

    private ListExecutionsRequest(Builder builder) {
        super(builder);
        this.executionNamePrefix = builder.executionNamePrefix;
        this.flowName = builder.flowName;
        this.limit = builder.limit;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.startedTimeBegin = builder.startedTimeBegin;
        this.startedTimeEnd = builder.startedTimeEnd;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListExecutionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return executionNamePrefix
     */
    public String getExecutionNamePrefix() {
        return this.executionNamePrefix;
    }

    /**
     * @return flowName
     */
    public String getFlowName() {
        return this.flowName;
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return startedTimeBegin
     */
    public String getStartedTimeBegin() {
        return this.startedTimeBegin;
    }

    /**
     * @return startedTimeEnd
     */
    public String getStartedTimeEnd() {
        return this.startedTimeEnd;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListExecutionsRequest, Builder> {
        private String executionNamePrefix; 
        private String flowName; 
        private Integer limit; 
        private String nextToken; 
        private String requestId; 
        private String startedTimeBegin; 
        private String startedTimeEnd; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListExecutionsRequest request) {
            super(request);
            this.executionNamePrefix = request.executionNamePrefix;
            this.flowName = request.flowName;
            this.limit = request.limit;
            this.nextToken = request.nextToken;
            this.requestId = request.requestId;
            this.startedTimeBegin = request.startedTimeBegin;
            this.startedTimeEnd = request.startedTimeEnd;
            this.status = request.status;
        } 

        /**
         * The name prefix of the execution.
         */
        public Builder executionNamePrefix(String executionNamePrefix) {
            this.putQueryParameter("ExecutionNamePrefix", executionNamePrefix);
            this.executionNamePrefix = executionNamePrefix;
            return this;
        }

        /**
         * The name of the flow. The name is unique within the region and cannot be modified after the flow is created. Configure this parameter based on the following rules:
         * <p>
         * 
         * *   The name can contain letters, digits, underscores (\_), and hyphens (-).
         * *   The name must start with a letter or an underscore (\_).
         * *   The name is case-sensitive.
         * *   The name must be 1 to 128 characters in length.
         */
        public Builder flowName(String flowName) {
            this.putQueryParameter("FlowName", flowName);
            this.flowName = flowName;
            return this;
        }

        /**
         * The maximum number of executions to be queried. Valid values: 1 to 100.
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * The name of the execution to start the query. You can obtain the value from the response data. You do not need to specify this parameter for the first request.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The request ID. If you specify this parameter, the system uses this value as the ID of the request. If you do not specify this parameter, the system generates a value at random.
         */
        public Builder requestId(String requestId) {
            this.putQueryParameter("RequestId", requestId);
            this.requestId = requestId;
            return this;
        }

        /**
         * The beginning of the time range to query executions. Specify the value in the UTC RFC3339 format.
         */
        public Builder startedTimeBegin(String startedTimeBegin) {
            this.putQueryParameter("StartedTimeBegin", startedTimeBegin);
            this.startedTimeBegin = startedTimeBegin;
            return this;
        }

        /**
         * The end of the time range to query executions. Specify the value in the UTC RFC3339 format.
         */
        public Builder startedTimeEnd(String startedTimeEnd) {
            this.putQueryParameter("StartedTimeEnd", startedTimeEnd);
            this.startedTimeEnd = startedTimeEnd;
            return this;
        }

        /**
         * The state of the execution that you want to filter. Valid values:
         * <p>
         * 
         * *   **Running**
         * *   **Stopped**
         * *   **Succeeded**
         * *   **Failed**
         * *   **TimedOut**
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListExecutionsRequest build() {
            return new ListExecutionsRequest(this);
        } 

    } 

}
