// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StatusTransitionItem} extends {@link TeaModel}
 *
 * <p>StatusTransitionItem</p>
 */
public class StatusTransitionItem extends TeaModel {
    @NameInMap("EndTime")
    private String endTime;

    @NameInMap("ReasonCode")
    private String reasonCode;

    @NameInMap("ReasonMessage")
    private String reasonMessage;

    @NameInMap("StartTime")
    private String startTime;

    @NameInMap("Status")
    private String status;

    private StatusTransitionItem(Builder builder) {
        this.endTime = builder.endTime;
        this.reasonCode = builder.reasonCode;
        this.reasonMessage = builder.reasonMessage;
        this.startTime = builder.startTime;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StatusTransitionItem create() {
        return builder().build();
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return reasonCode
     */
    public String getReasonCode() {
        return this.reasonCode;
    }

    /**
     * @return reasonMessage
     */
    public String getReasonMessage() {
        return this.reasonMessage;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String endTime; 
        private String reasonCode; 
        private String reasonMessage; 
        private String startTime; 
        private String status; 

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * ReasonCode.
         */
        public Builder reasonCode(String reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }

        /**
         * ReasonMessage.
         */
        public Builder reasonMessage(String reasonMessage) {
            this.reasonMessage = reasonMessage;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public StatusTransitionItem build() {
            return new StatusTransitionItem(this);
        } 

    } 

}
