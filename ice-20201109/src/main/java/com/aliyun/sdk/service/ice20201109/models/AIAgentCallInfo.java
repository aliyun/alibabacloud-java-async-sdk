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
 * {@link AIAgentCallInfo} extends {@link TeaModel}
 *
 * <p>AIAgentCallInfo</p>
 */
public class AIAgentCallInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CallDuration")
    private Integer callDuration;

    @com.aliyun.core.annotation.NameInMap("CallEndTime")
    private String callEndTime;

    @com.aliyun.core.annotation.NameInMap("CallStartTime")
    private String callStartTime;

    @com.aliyun.core.annotation.NameInMap("CalleeNumber")
    private String calleeNumber;

    @com.aliyun.core.annotation.NameInMap("CallerNumber")
    private String callerNumber;

    @com.aliyun.core.annotation.NameInMap("HangupRole")
    private Integer hangupRole;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private AIAgentCallInfo(Builder builder) {
        this.callDuration = builder.callDuration;
        this.callEndTime = builder.callEndTime;
        this.callStartTime = builder.callStartTime;
        this.calleeNumber = builder.calleeNumber;
        this.callerNumber = builder.callerNumber;
        this.hangupRole = builder.hangupRole;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AIAgentCallInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callDuration
     */
    public Integer getCallDuration() {
        return this.callDuration;
    }

    /**
     * @return callEndTime
     */
    public String getCallEndTime() {
        return this.callEndTime;
    }

    /**
     * @return callStartTime
     */
    public String getCallStartTime() {
        return this.callStartTime;
    }

    /**
     * @return calleeNumber
     */
    public String getCalleeNumber() {
        return this.calleeNumber;
    }

    /**
     * @return callerNumber
     */
    public String getCallerNumber() {
        return this.callerNumber;
    }

    /**
     * @return hangupRole
     */
    public Integer getHangupRole() {
        return this.hangupRole;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private Integer callDuration; 
        private String callEndTime; 
        private String callStartTime; 
        private String calleeNumber; 
        private String callerNumber; 
        private Integer hangupRole; 
        private String status; 

        private Builder() {
        } 

        private Builder(AIAgentCallInfo model) {
            this.callDuration = model.callDuration;
            this.callEndTime = model.callEndTime;
            this.callStartTime = model.callStartTime;
            this.calleeNumber = model.calleeNumber;
            this.callerNumber = model.callerNumber;
            this.hangupRole = model.hangupRole;
            this.status = model.status;
        } 

        /**
         * CallDuration.
         */
        public Builder callDuration(Integer callDuration) {
            this.callDuration = callDuration;
            return this;
        }

        /**
         * CallEndTime.
         */
        public Builder callEndTime(String callEndTime) {
            this.callEndTime = callEndTime;
            return this;
        }

        /**
         * CallStartTime.
         */
        public Builder callStartTime(String callStartTime) {
            this.callStartTime = callStartTime;
            return this;
        }

        /**
         * CalleeNumber.
         */
        public Builder calleeNumber(String calleeNumber) {
            this.calleeNumber = calleeNumber;
            return this;
        }

        /**
         * CallerNumber.
         */
        public Builder callerNumber(String callerNumber) {
            this.callerNumber = callerNumber;
            return this;
        }

        /**
         * HangupRole.
         */
        public Builder hangupRole(Integer hangupRole) {
            this.hangupRole = hangupRole;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public AIAgentCallInfo build() {
            return new AIAgentCallInfo(this);
        } 

    } 

}
