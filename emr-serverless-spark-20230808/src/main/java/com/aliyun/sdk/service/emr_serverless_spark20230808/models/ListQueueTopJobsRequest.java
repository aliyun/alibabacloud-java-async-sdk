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
 * {@link ListQueueTopJobsRequest} extends {@link RequestModel}
 *
 * <p>ListQueueTopJobsRequest</p>
 */
public class ListQueueTopJobsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("queueName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String queueName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("topN")
    private Integer topN;

    private ListQueueTopJobsRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.queueName = builder.queueName;
        this.regionId = builder.regionId;
        this.topN = builder.topN;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQueueTopJobsRequest create() {
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
     * @return queueName
     */
    public String getQueueName() {
        return this.queueName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return topN
     */
    public Integer getTopN() {
        return this.topN;
    }

    public static final class Builder extends Request.Builder<ListQueueTopJobsRequest, Builder> {
        private String workspaceId; 
        private String queueName; 
        private String regionId; 
        private Integer topN; 

        private Builder() {
            super();
        } 

        private Builder(ListQueueTopJobsRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.queueName = request.queueName;
            this.regionId = request.regionId;
            this.topN = request.topN;
        } 

        /**
         * <p>The workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>w-1234abcd</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The name of the queue.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dev_queue</p>
         */
        public Builder queueName(String queueName) {
            this.putPathParameter("queueName", queueName);
            this.queueName = queueName;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The maximum number of jobs to return. The maximum value is 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder topN(Integer topN) {
            this.putQueryParameter("topN", topN);
            this.topN = topN;
            return this;
        }

        @Override
        public ListQueueTopJobsRequest build() {
            return new ListQueueTopJobsRequest(this);
        } 

    } 

}
