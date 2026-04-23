// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link ListExecutorLogsRequest} extends {@link RequestModel}
 *
 * <p>ListExecutorLogsRequest</p>
 */
public class ListExecutorLogsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("jobRunId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobRunId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("executorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String executorId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("logType")
    private String logType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    private ListExecutorLogsRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.jobRunId = builder.jobRunId;
        this.executorId = builder.executorId;
        this.logType = builder.logType;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListExecutorLogsRequest create() {
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
     * @return jobRunId
     */
    public String getJobRunId() {
        return this.jobRunId;
    }

    /**
     * @return executorId
     */
    public String getExecutorId() {
        return this.executorId;
    }

    /**
     * @return logType
     */
    public String getLogType() {
        return this.logType;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListExecutorLogsRequest, Builder> {
        private String workspaceId; 
        private String jobRunId; 
        private String executorId; 
        private String logType; 
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListExecutorLogsRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.jobRunId = request.jobRunId;
            this.executorId = request.executorId;
            this.logType = request.logType;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>w-d2d82aa09155****</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>jr-f09a8fda2396****</p>
         */
        public Builder jobRunId(String jobRunId) {
            this.putPathParameter("jobRunId", jobRunId);
            this.jobRunId = jobRunId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder executorId(String executorId) {
            this.putPathParameter("executorId", executorId);
            this.executorId = executorId;
            return this;
        }

        /**
         * logType.
         */
        public Builder logType(String logType) {
            this.putQueryParameter("logType", logType);
            this.logType = logType;
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
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListExecutorLogsRequest build() {
            return new ListExecutorLogsRequest(this);
        } 

    } 

}
