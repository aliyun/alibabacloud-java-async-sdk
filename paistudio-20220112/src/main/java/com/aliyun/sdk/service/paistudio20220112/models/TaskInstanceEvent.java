// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link TaskInstanceEvent} extends {@link TeaModel}
 *
 * <p>TaskInstanceEvent</p>
 */
public class TaskInstanceEvent extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GmtEndTime")
    private String gmtEndTime;

    @com.aliyun.core.annotation.NameInMap("GmtStartTime")
    private String gmtStartTime;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PodName")
    private String podName;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("WorkloadType")
    private String workloadType;

    private TaskInstanceEvent(Builder builder) {
        this.gmtEndTime = builder.gmtEndTime;
        this.gmtStartTime = builder.gmtStartTime;
        this.message = builder.message;
        this.podName = builder.podName;
        this.status = builder.status;
        this.workloadType = builder.workloadType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TaskInstanceEvent create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gmtEndTime
     */
    public String getGmtEndTime() {
        return this.gmtEndTime;
    }

    /**
     * @return gmtStartTime
     */
    public String getGmtStartTime() {
        return this.gmtStartTime;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return podName
     */
    public String getPodName() {
        return this.podName;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return workloadType
     */
    public String getWorkloadType() {
        return this.workloadType;
    }

    public static final class Builder {
        private String gmtEndTime; 
        private String gmtStartTime; 
        private String message; 
        private String podName; 
        private String status; 
        private String workloadType; 

        private Builder() {
        } 

        private Builder(TaskInstanceEvent model) {
            this.gmtEndTime = model.gmtEndTime;
            this.gmtStartTime = model.gmtStartTime;
            this.message = model.message;
            this.podName = model.podName;
            this.status = model.status;
            this.workloadType = model.workloadType;
        } 

        /**
         * GmtEndTime.
         */
        public Builder gmtEndTime(String gmtEndTime) {
            this.gmtEndTime = gmtEndTime;
            return this;
        }

        /**
         * GmtStartTime.
         */
        public Builder gmtStartTime(String gmtStartTime) {
            this.gmtStartTime = gmtStartTime;
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
         * PodName.
         */
        public Builder podName(String podName) {
            this.podName = podName;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * WorkloadType.
         */
        public Builder workloadType(String workloadType) {
            this.workloadType = workloadType;
            return this;
        }

        public TaskInstanceEvent build() {
            return new TaskInstanceEvent(this);
        } 

    } 

}
