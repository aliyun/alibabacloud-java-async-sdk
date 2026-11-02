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
         * <p>The duration of the call, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder callDuration(Integer callDuration) {
            this.callDuration = callDuration;
            return this;
        }

        /**
         * <p>The time the call ended, in ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-01T16:53:58.875932+00:00</p>
         */
        public Builder callEndTime(String callEndTime) {
            this.callEndTime = callEndTime;
            return this;
        }

        /**
         * <p>The time the call started, in ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-01T16:53:53.184797+00:00</p>
         */
        public Builder callStartTime(String callStartTime) {
            this.callStartTime = callStartTime;
            return this;
        }

        /**
         * <p>The number of the called party.</p>
         * 
         * <strong>example:</strong>
         * <p>136******794</p>
         */
        public Builder calleeNumber(String calleeNumber) {
            this.calleeNumber = calleeNumber;
            return this;
        }

        /**
         * <p>The number of the calling party.</p>
         * 
         * <strong>example:</strong>
         * <p>183*****333</p>
         */
        public Builder callerNumber(String callerNumber) {
            this.callerNumber = callerNumber;
            return this;
        }

        /**
         * <p>Indicates which party ended the call.
         * 0: The agent ended the call.
         * 1: The user ended the call.
         * 2: The system ended the call for a transfer.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder hangupRole(Integer hangupRole) {
            this.hangupRole = hangupRole;
            return this;
        }

        /**
         * <p>The status of the call.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
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
