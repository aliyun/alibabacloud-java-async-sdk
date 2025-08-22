// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx320240624.models;

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
 * {@link GetJobExecutionThreadDumpRequest} extends {@link RequestModel}
 *
 * <p>GetJobExecutionThreadDumpRequest</p>
 */
public class GetJobExecutionThreadDumpRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExecutorAddr")
    private String executorAddr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobExecutionId")
    private String jobExecutionId;

    private GetJobExecutionThreadDumpRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appName = builder.appName;
        this.clusterId = builder.clusterId;
        this.executorAddr = builder.executorAddr;
        this.jobExecutionId = builder.jobExecutionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJobExecutionThreadDumpRequest create() {
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
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return executorAddr
     */
    public String getExecutorAddr() {
        return this.executorAddr;
    }

    /**
     * @return jobExecutionId
     */
    public String getJobExecutionId() {
        return this.jobExecutionId;
    }

    public static final class Builder extends Request.Builder<GetJobExecutionThreadDumpRequest, Builder> {
        private String regionId; 
        private String appName; 
        private String clusterId; 
        private String executorAddr; 
        private String jobExecutionId; 

        private Builder() {
            super();
        } 

        private Builder(GetJobExecutionThreadDumpRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appName = request.appName;
            this.clusterId = request.clusterId;
            this.executorAddr = request.executorAddr;
            this.jobExecutionId = request.jobExecutionId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * ExecutorAddr.
         */
        public Builder executorAddr(String executorAddr) {
            this.putQueryParameter("ExecutorAddr", executorAddr);
            this.executorAddr = executorAddr;
            return this;
        }

        /**
         * JobExecutionId.
         */
        public Builder jobExecutionId(String jobExecutionId) {
            this.putQueryParameter("JobExecutionId", jobExecutionId);
            this.jobExecutionId = jobExecutionId;
            return this;
        }

        @Override
        public GetJobExecutionThreadDumpRequest build() {
            return new GetJobExecutionThreadDumpRequest(this);
        } 

    } 

}
