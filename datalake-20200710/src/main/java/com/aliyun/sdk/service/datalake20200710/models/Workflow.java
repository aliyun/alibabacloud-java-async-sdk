// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Workflow} extends {@link TeaModel}
 *
 * <p>Workflow</p>
 */
public class Workflow extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LatestEndTime")
    private String latestEndTime;

    @com.aliyun.core.annotation.NameInMap("LatestInstanceId")
    private String latestInstanceId;

    @com.aliyun.core.annotation.NameInMap("LatestInstanceStatus")
    private String latestInstanceStatus;

    @com.aliyun.core.annotation.NameInMap("LatestStartTime")
    private String latestStartTime;

    private Workflow(Builder builder) {
        this.latestEndTime = builder.latestEndTime;
        this.latestInstanceId = builder.latestInstanceId;
        this.latestInstanceStatus = builder.latestInstanceStatus;
        this.latestStartTime = builder.latestStartTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Workflow create() {
        return builder().build();
    }

    /**
     * @return latestEndTime
     */
    public String getLatestEndTime() {
        return this.latestEndTime;
    }

    /**
     * @return latestInstanceId
     */
    public String getLatestInstanceId() {
        return this.latestInstanceId;
    }

    /**
     * @return latestInstanceStatus
     */
    public String getLatestInstanceStatus() {
        return this.latestInstanceStatus;
    }

    /**
     * @return latestStartTime
     */
    public String getLatestStartTime() {
        return this.latestStartTime;
    }

    public static final class Builder {
        private String latestEndTime; 
        private String latestInstanceId; 
        private String latestInstanceStatus; 
        private String latestStartTime; 

        /**
         * LatestEndTime.
         */
        public Builder latestEndTime(String latestEndTime) {
            this.latestEndTime = latestEndTime;
            return this;
        }

        /**
         * LatestInstanceId.
         */
        public Builder latestInstanceId(String latestInstanceId) {
            this.latestInstanceId = latestInstanceId;
            return this;
        }

        /**
         * LatestInstanceStatus.
         */
        public Builder latestInstanceStatus(String latestInstanceStatus) {
            this.latestInstanceStatus = latestInstanceStatus;
            return this;
        }

        /**
         * LatestStartTime.
         */
        public Builder latestStartTime(String latestStartTime) {
            this.latestStartTime = latestStartTime;
            return this;
        }

        public Workflow build() {
            return new Workflow(this);
        } 

    } 

}
