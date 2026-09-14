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
 * {@link ListEvaluationTasksRequest} extends {@link RequestModel}
 *
 * <p>ListEvaluationTasksRequest</p>
 */
public class ListEvaluationTasksRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("agentSpace")
    private String agentSpace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("channel")
    private String channel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dataType")
    private String dataType;

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
    @com.aliyun.core.annotation.NameInMap("taskMode")
    private String taskMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("taskName")
    private String taskName;

    private ListEvaluationTasksRequest(Builder builder) {
        super(builder);
        this.agentSpace = builder.agentSpace;
        this.channel = builder.channel;
        this.dataType = builder.dataType;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.status = builder.status;
        this.taskMode = builder.taskMode;
        this.taskName = builder.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEvaluationTasksRequest create() {
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
     * @return channel
     */
    public String getChannel() {
        return this.channel;
    }

    /**
     * @return dataType
     */
    public String getDataType() {
        return this.dataType;
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
     * @return taskMode
     */
    public String getTaskMode() {
        return this.taskMode;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    public static final class Builder extends Request.Builder<ListEvaluationTasksRequest, Builder> {
        private String agentSpace; 
        private String channel; 
        private String dataType; 
        private Integer maxResults; 
        private String nextToken; 
        private String status; 
        private String taskMode; 
        private String taskName; 

        private Builder() {
            super();
        } 

        private Builder(ListEvaluationTasksRequest request) {
            super(request);
            this.agentSpace = request.agentSpace;
            this.channel = request.channel;
            this.dataType = request.dataType;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.status = request.status;
            this.taskMode = request.taskMode;
            this.taskName = request.taskName;
        } 

        /**
         * <p>The AgentSpace name.</p>
         * 
         * <strong>example:</strong>
         * <p>prod-agentspace</p>
         */
        public Builder agentSpace(String agentSpace) {
            this.putQueryParameter("agentSpace", agentSpace);
            this.agentSpace = agentSpace;
            return this;
        }

        /**
         * <p>The filter condition for the task source. If this parameter is not specified, tasks from the default source are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder channel(String channel) {
            this.putQueryParameter("channel", channel);
            this.channel = channel;
            return this;
        }

        /**
         * <p>The data source type of the evaluation object. Set this parameter to <code>trace</code> for trace-based evaluation.</p>
         * 
         * <strong>example:</strong>
         * <p>trace</p>
         */
        public Builder dataType(String dataType) {
            this.putQueryParameter("dataType", dataType);
            this.dataType = dataType;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 20. Maximum value: 100.</p>
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
         * <p>The pagination token for the next page, obtained from the previous response.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJsYXN0SWQiOjEyMywib2Zmc2V0IjoyMH0=</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The filter condition for the evaluation task status.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The evaluation task mode. If this parameter is not specified, the default value is <code>batch</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>batch</p>
         */
        public Builder taskMode(String taskMode) {
            this.putQueryParameter("taskMode", taskMode);
            this.taskMode = taskMode;
            return this;
        }

        /**
         * <p>The fuzzy match condition for the task name.</p>
         * 
         * <strong>example:</strong>
         * <p>trace_task_completion_eval</p>
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("taskName", taskName);
            this.taskName = taskName;
            return this;
        }

        @Override
        public ListEvaluationTasksRequest build() {
            return new ListEvaluationTasksRequest(this);
        } 

    } 

}
