// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fnf20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetExecutionHistoryRequest} extends {@link RequestModel}
 *
 * <p>GetExecutionHistoryRequest</p>
 */
public class GetExecutionHistoryRequest extends Request {
    @Query
    @NameInMap("ExecutionName")
    @Validation(required = true)
    private String executionName;

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

    private GetExecutionHistoryRequest(Builder builder) {
        super(builder);
        this.executionName = builder.executionName;
        this.flowName = builder.flowName;
        this.limit = builder.limit;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetExecutionHistoryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return executionName
     */
    public String getExecutionName() {
        return this.executionName;
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

    public static final class Builder extends Request.Builder<GetExecutionHistoryRequest, Builder> {
        private String executionName; 
        private String flowName; 
        private Integer limit; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
            super();
        } 

        private Builder(GetExecutionHistoryRequest request) {
            super(request);
            this.executionName = request.executionName;
            this.flowName = request.flowName;
            this.limit = request.limit;
            this.nextToken = request.nextToken;
            this.requestId = request.requestId;
        } 

        /**
         * The name of the execution, which is unique within a flow. Configure this parameter based on the following rules:
         * <p>
         * 
         * *   The name can contain letters, digits, underscores (\_), and hyphens (-).
         * *   The name must start with a letter or an underscore (\_).
         * *   The name is case-sensitive.
         * *   The name must be 1 to 128 characters in length.
         */
        public Builder executionName(String executionName) {
            this.putQueryParameter("ExecutionName", executionName);
            this.executionName = executionName;
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
         * The maximum number of steps to be queried. Valid values: 1 to 1000.
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * The name of the event to start the query. You can obtain the value from the response data.
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

        @Override
        public GetExecutionHistoryRequest build() {
            return new GetExecutionHistoryRequest(this);
        } 

    } 

}
