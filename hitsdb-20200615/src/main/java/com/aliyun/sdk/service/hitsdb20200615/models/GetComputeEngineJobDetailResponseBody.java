// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20200615.models;

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
 * {@link GetComputeEngineJobDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetComputeEngineJobDetailResponseBody</p>
 */
public class GetComputeEngineJobDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Configs")
    private java.util.Map<String, ?> configs;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("Endpoint")
    private String endpoint;

    @com.aliyun.core.annotation.NameInMap("ExtraInfo")
    private java.util.Map<String, ?> extraInfo;

    @com.aliyun.core.annotation.NameInMap("FinishTime")
    private String finishTime;

    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("JobName")
    private String jobName;

    @com.aliyun.core.annotation.NameInMap("JobType")
    private String jobType;

    @com.aliyun.core.annotation.NameInMap("LastErrorCode")
    private String lastErrorCode;

    @com.aliyun.core.annotation.NameInMap("LastErrorInfo")
    private String lastErrorInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    private GetComputeEngineJobDetailResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.configs = builder.configs;
        this.createTime = builder.createTime;
        this.endpoint = builder.endpoint;
        this.extraInfo = builder.extraInfo;
        this.finishTime = builder.finishTime;
        this.jobId = builder.jobId;
        this.jobName = builder.jobName;
        this.jobType = builder.jobType;
        this.lastErrorCode = builder.lastErrorCode;
        this.lastErrorInfo = builder.lastErrorInfo;
        this.requestId = builder.requestId;
        this.state = builder.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetComputeEngineJobDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return configs
     */
    public java.util.Map<String, ?> getConfigs() {
        return this.configs;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return endpoint
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * @return extraInfo
     */
    public java.util.Map<String, ?> getExtraInfo() {
        return this.extraInfo;
    }

    /**
     * @return finishTime
     */
    public String getFinishTime() {
        return this.finishTime;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return jobName
     */
    public String getJobName() {
        return this.jobName;
    }

    /**
     * @return jobType
     */
    public String getJobType() {
        return this.jobType;
    }

    /**
     * @return lastErrorCode
     */
    public String getLastErrorCode() {
        return this.lastErrorCode;
    }

    /**
     * @return lastErrorInfo
     */
    public String getLastErrorInfo() {
        return this.lastErrorInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private java.util.Map<String, ?> configs; 
        private String createTime; 
        private String endpoint; 
        private java.util.Map<String, ?> extraInfo; 
        private String finishTime; 
        private String jobId; 
        private String jobName; 
        private String jobType; 
        private String lastErrorCode; 
        private String lastErrorInfo; 
        private String requestId; 
        private String state; 

        private Builder() {
        } 

        private Builder(GetComputeEngineJobDetailResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.configs = model.configs;
            this.createTime = model.createTime;
            this.endpoint = model.endpoint;
            this.extraInfo = model.extraInfo;
            this.finishTime = model.finishTime;
            this.jobId = model.jobId;
            this.jobName = model.jobName;
            this.jobType = model.jobType;
            this.lastErrorCode = model.lastErrorCode;
            this.lastErrorInfo = model.lastErrorInfo;
            this.requestId = model.requestId;
            this.state = model.state;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * Configs.
         */
        public Builder configs(java.util.Map<String, ?> configs) {
            this.configs = configs;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * Endpoint.
         */
        public Builder endpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        /**
         * ExtraInfo.
         */
        public Builder extraInfo(java.util.Map<String, ?> extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }

        /**
         * FinishTime.
         */
        public Builder finishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }

        /**
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * JobName.
         */
        public Builder jobName(String jobName) {
            this.jobName = jobName;
            return this;
        }

        /**
         * JobType.
         */
        public Builder jobType(String jobType) {
            this.jobType = jobType;
            return this;
        }

        /**
         * LastErrorCode.
         */
        public Builder lastErrorCode(String lastErrorCode) {
            this.lastErrorCode = lastErrorCode;
            return this;
        }

        /**
         * LastErrorInfo.
         */
        public Builder lastErrorInfo(String lastErrorInfo) {
            this.lastErrorInfo = lastErrorInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * State.
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        public GetComputeEngineJobDetailResponseBody build() {
            return new GetComputeEngineJobDetailResponseBody(this);
        } 

    } 

}
