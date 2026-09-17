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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("scheduleStatus")
    private String scheduleStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("scheduleType")
    private String scheduleType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sinkName")
    private String sinkName;

    private ListPipelinesRequest(Builder builder) {
        super(builder);
        this.agentSpace = builder.agentSpace;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pipelineName = builder.pipelineName;
        this.scheduleStatus = builder.scheduleStatus;
        this.scheduleType = builder.scheduleType;
        this.sinkName = builder.sinkName;
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

    /**
     * @return scheduleStatus
     */
    public String getScheduleStatus() {
        return this.scheduleStatus;
    }

    /**
     * @return scheduleType
     */
    public String getScheduleType() {
        return this.scheduleType;
    }

    /**
     * @return sinkName
     */
    public String getSinkName() {
        return this.sinkName;
    }

    public static final class Builder extends Request.Builder<ListPipelinesRequest, Builder> {
        private String agentSpace; 
        private Integer maxResults; 
        private String nextToken; 
        private String pipelineName; 
        private String scheduleStatus; 
        private String scheduleType; 
        private String sinkName; 

        private Builder() {
            super();
        } 

        private Builder(ListPipelinesRequest request) {
            super(request);
            this.agentSpace = request.agentSpace;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.pipelineName = request.pipelineName;
            this.scheduleStatus = request.scheduleStatus;
            this.scheduleType = request.scheduleType;
            this.sinkName = request.sinkName;
        } 

        /**
         * <p>The name of the AgentSpace. Pipelines under this AgentSpace are listed.</p>
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
         * <p>The maximum number of pipelines to return. Default value: 20. Maximum value: 100.</p>
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
         * <p>The pagination token. Set this parameter to the nextToken value returned in the previous response to retrieve the next page. Do not specify this parameter for the first request.</p>
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
         * <p>Filters pipelines by name using exact match. If this parameter is not specified, no filtering is applied.</p>
         * 
         * <strong>example:</strong>
         * <p>my-pipeline</p>
         */
        public Builder pipelineName(String pipelineName) {
            this.putQueryParameter("pipelineName", pipelineName);
            this.pipelineName = pipelineName;
            return this;
        }

        /**
         * <p>Filters pipelines by schedule status. If this parameter is not specified, no filtering is applied. Valid values:</p>
         * <ul>
         * <li>None: No schedule.</li>
         * <li>Active: Active.</li>
         * <li>Paused: Paused.</li>
         * <li>Terminated: Terminated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        public Builder scheduleStatus(String scheduleStatus) {
            this.putQueryParameter("scheduleStatus", scheduleStatus);
            this.scheduleStatus = scheduleStatus;
            return this;
        }

        /**
         * <p>Filters pipelines by schedule type. If this parameter is not specified, no filtering is applied. Valid values:</p>
         * <ul>
         * <li>RunOnce: One-time execution.</li>
         * <li>Scheduled: Periodic scheduling.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RunOnce</p>
         */
        public Builder scheduleType(String scheduleType) {
            this.putQueryParameter("scheduleType", scheduleType);
            this.scheduleType = scheduleType;
            return this;
        }

        /**
         * <p>Filters pipelines by the exact name of the output dataset. Matches standard sinks, conditional branch sinks, and default sinks. If this parameter is not specified, no filtering is applied.</p>
         * 
         * <strong>example:</strong>
         * <p>my-dataset</p>
         */
        public Builder sinkName(String sinkName) {
            this.putQueryParameter("sinkName", sinkName);
            this.sinkName = sinkName;
            return this;
        }

        @Override
        public ListPipelinesRequest build() {
            return new ListPipelinesRequest(this);
        } 

    } 

}
