// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link KillSemanticJobRequest} extends {@link RequestModel}
 *
 * <p>KillSemanticJobRequest</p>
 */
public class KillSemanticJobRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExecutorJobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String executorJobId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RetryTimes")
    private Integer retryTimes;

    private KillSemanticJobRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.executorJobId = builder.executorJobId;
        this.projectId = builder.projectId;
        this.retryTimes = builder.retryTimes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static KillSemanticJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return executorJobId
     */
    public String getExecutorJobId() {
        return this.executorJobId;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return retryTimes
     */
    public Integer getRetryTimes() {
        return this.retryTimes;
    }

    public static final class Builder extends Request.Builder<KillSemanticJobRequest, Builder> {
        private String regionId; 
        private String executorJobId; 
        private Long projectId; 
        private Integer retryTimes; 

        private Builder() {
            super();
        } 

        private Builder(KillSemanticJobRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.executorJobId = request.executorJobId;
            this.projectId = request.projectId;
            this.retryTimes = request.retryTimes;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>exec-job-demo</p>
         */
        public Builder executorJobId(String executorJobId) {
            this.putBodyParameter("ExecutorJobId", executorJobId);
            this.executorJobId = executorJobId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * RetryTimes.
         */
        public Builder retryTimes(Integer retryTimes) {
            this.putBodyParameter("RetryTimes", retryTimes);
            this.retryTimes = retryTimes;
            return this;
        }

        @Override
        public KillSemanticJobRequest build() {
            return new KillSemanticJobRequest(this);
        } 

    } 

}
