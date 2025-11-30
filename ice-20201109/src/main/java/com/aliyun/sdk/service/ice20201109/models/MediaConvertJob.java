// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link MediaConvertJob} extends {@link TeaModel}
 *
 * <p>MediaConvertJob</p>
 */
public class MediaConvertJob extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Config")
    private MediaConvertJobConfig config;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("FinishTime")
    private String finishTime;

    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("OutputDetails")
    private java.util.List<MediaConvertOutputDetail> outputDetails;

    @com.aliyun.core.annotation.NameInMap("OutputGroupDetails")
    private java.util.List<MediaConvertOutputGroupDetail> outputGroupDetails;

    @com.aliyun.core.annotation.NameInMap("Percent")
    private Integer percent;

    @com.aliyun.core.annotation.NameInMap("PipelineId")
    private String pipelineId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private MediaConvertJob(Builder builder) {
        this.clientToken = builder.clientToken;
        this.code = builder.code;
        this.config = builder.config;
        this.createTime = builder.createTime;
        this.finishTime = builder.finishTime;
        this.jobId = builder.jobId;
        this.message = builder.message;
        this.outputDetails = builder.outputDetails;
        this.outputGroupDetails = builder.outputGroupDetails;
        this.percent = builder.percent;
        this.pipelineId = builder.pipelineId;
        this.requestId = builder.requestId;
        this.state = builder.state;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MediaConvertJob create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return config
     */
    public MediaConvertJobConfig getConfig() {
        return this.config;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
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
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return outputDetails
     */
    public java.util.List<MediaConvertOutputDetail> getOutputDetails() {
        return this.outputDetails;
    }

    /**
     * @return outputGroupDetails
     */
    public java.util.List<MediaConvertOutputGroupDetail> getOutputGroupDetails() {
        return this.outputGroupDetails;
    }

    /**
     * @return percent
     */
    public Integer getPercent() {
        return this.percent;
    }

    /**
     * @return pipelineId
     */
    public String getPipelineId() {
        return this.pipelineId;
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

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder {
        private String clientToken; 
        private String code; 
        private MediaConvertJobConfig config; 
        private String createTime; 
        private String finishTime; 
        private String jobId; 
        private String message; 
        private java.util.List<MediaConvertOutputDetail> outputDetails; 
        private java.util.List<MediaConvertOutputGroupDetail> outputGroupDetails; 
        private Integer percent; 
        private String pipelineId; 
        private String requestId; 
        private String state; 
        private String userData; 

        private Builder() {
        } 

        private Builder(MediaConvertJob model) {
            this.clientToken = model.clientToken;
            this.code = model.code;
            this.config = model.config;
            this.createTime = model.createTime;
            this.finishTime = model.finishTime;
            this.jobId = model.jobId;
            this.message = model.message;
            this.outputDetails = model.outputDetails;
            this.outputGroupDetails = model.outputGroupDetails;
            this.percent = model.percent;
            this.pipelineId = model.pipelineId;
            this.requestId = model.requestId;
            this.state = model.state;
            this.userData = model.userData;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Config.
         */
        public Builder config(MediaConvertJobConfig config) {
            this.config = config;
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
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * OutputDetails.
         */
        public Builder outputDetails(java.util.List<MediaConvertOutputDetail> outputDetails) {
            this.outputDetails = outputDetails;
            return this;
        }

        /**
         * OutputGroupDetails.
         */
        public Builder outputGroupDetails(java.util.List<MediaConvertOutputGroupDetail> outputGroupDetails) {
            this.outputGroupDetails = outputGroupDetails;
            return this;
        }

        /**
         * Percent.
         */
        public Builder percent(Integer percent) {
            this.percent = percent;
            return this;
        }

        /**
         * PipelineId.
         */
        public Builder pipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
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

        /**
         * UserData.
         */
        public Builder userData(String userData) {
            this.userData = userData;
            return this;
        }

        public MediaConvertJob build() {
            return new MediaConvertJob(this);
        } 

    } 

}
