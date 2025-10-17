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
 * {@link ListJobExecutorsRequest} extends {@link RequestModel}
 *
 * <p>ListJobExecutorsRequest</p>
 */
public class ListJobExecutorsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("jobRunId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobRunId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("executorType")
    private String executorType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private ListJobExecutorsRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.jobRunId = builder.jobRunId;
        this.executorType = builder.executorType;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListJobExecutorsRequest create() {
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
     * @return executorType
     */
    public String getExecutorType() {
        return this.executorType;
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

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListJobExecutorsRequest, Builder> {
        private String workspaceId; 
        private String jobRunId; 
        private String executorType; 
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListJobExecutorsRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.jobRunId = request.jobRunId;
            this.executorType = request.executorType;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
            this.status = request.status;
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
         * executorType.
         */
        public Builder executorType(String executorType) {
            this.putQueryParameter("executorType", executorType);
            this.executorType = executorType;
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

        /**
         * status.
         */
        public Builder status(String status) {
            this.putQueryParameter("status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListJobExecutorsRequest build() {
            return new ListJobExecutorsRequest(this);
        } 

    } 

}
