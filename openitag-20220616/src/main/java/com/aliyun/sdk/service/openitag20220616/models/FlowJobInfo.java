// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openitag20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FlowJobInfo} extends {@link TeaModel}
 *
 * <p>FlowJobInfo</p>
 */
public class FlowJobInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Display")
    private Boolean display;

    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("JobType")
    private String jobType;

    @com.aliyun.core.annotation.NameInMap("MessageId")
    private String messageId;

    @com.aliyun.core.annotation.NameInMap("ProcessType")
    private String processType;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private FlowJobInfo(Builder builder) {
        this.display = builder.display;
        this.jobId = builder.jobId;
        this.jobType = builder.jobType;
        this.messageId = builder.messageId;
        this.processType = builder.processType;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FlowJobInfo create() {
        return builder().build();
    }

    /**
     * @return display
     */
    public Boolean getDisplay() {
        return this.display;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return jobType
     */
    public String getJobType() {
        return this.jobType;
    }

    /**
     * @return messageId
     */
    public String getMessageId() {
        return this.messageId;
    }

    /**
     * @return processType
     */
    public String getProcessType() {
        return this.processType;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private Boolean display; 
        private String jobId; 
        private String jobType; 
        private String messageId; 
        private String processType; 
        private String taskId; 

        /**
         * Display.
         */
        public Builder display(Boolean display) {
            this.display = display;
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
         * JobType.
         */
        public Builder jobType(String jobType) {
            this.jobType = jobType;
            return this;
        }

        /**
         * MessageId.
         */
        public Builder messageId(String messageId) {
            this.messageId = messageId;
            return this;
        }

        /**
         * ProcessType.
         */
        public Builder processType(String processType) {
            this.processType = processType;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        public FlowJobInfo build() {
            return new FlowJobInfo(this);
        } 

    } 

}
