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
 * {@link ForwardAIAgentCallRequest} extends {@link RequestModel}
 *
 * <p>ForwardAIAgentCallRequest</p>
 */
public class ForwardAIAgentCallRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CalledNumber")
    private String calledNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallerNumber")
    private String callerNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ErrorPrompt")
    private String errorPrompt;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransferPrompt")
    private String transferPrompt;

    private ForwardAIAgentCallRequest(Builder builder) {
        super(builder);
        this.calledNumber = builder.calledNumber;
        this.callerNumber = builder.callerNumber;
        this.errorPrompt = builder.errorPrompt;
        this.instanceId = builder.instanceId;
        this.transferPrompt = builder.transferPrompt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ForwardAIAgentCallRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return calledNumber
     */
    public String getCalledNumber() {
        return this.calledNumber;
    }

    /**
     * @return callerNumber
     */
    public String getCallerNumber() {
        return this.callerNumber;
    }

    /**
     * @return errorPrompt
     */
    public String getErrorPrompt() {
        return this.errorPrompt;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return transferPrompt
     */
    public String getTransferPrompt() {
        return this.transferPrompt;
    }

    public static final class Builder extends Request.Builder<ForwardAIAgentCallRequest, Builder> {
        private String calledNumber; 
        private String callerNumber; 
        private String errorPrompt; 
        private String instanceId; 
        private String transferPrompt; 

        private Builder() {
            super();
        } 

        private Builder(ForwardAIAgentCallRequest request) {
            super(request);
            this.calledNumber = request.calledNumber;
            this.callerNumber = request.callerNumber;
            this.errorPrompt = request.errorPrompt;
            this.instanceId = request.instanceId;
            this.transferPrompt = request.transferPrompt;
        } 

        /**
         * <p>The destination phone number to which the call is transferred.</p>
         * 
         * <strong>example:</strong>
         * <p>13**********</p>
         */
        public Builder calledNumber(String calledNumber) {
            this.putQueryParameter("CalledNumber", calledNumber);
            this.calledNumber = calledNumber;
            return this;
        }

        /**
         * <p>The caller phone number for the transferred call. This parameter is optional.</p>
         * <notice>
         * By default, CallerNumber is the phone number of the agent after the call is started: 1. For inbound lines, the agent number is the agent seat number. 2. For outbound lines, the agent number is the caller number.</notice>
         * <warning>Alibaba Cloud lines do not support this parameter.</warning>
         * 
         * <strong>example:</strong>
         * <p>13**********</p>
         */
        public Builder callerNumber(String callerNumber) {
            this.putQueryParameter("CallerNumber", callerNumber);
            this.callerNumber = callerNumber;
            return this;
        }

        /**
         * <p>The error prompt text to play when the transfer fails. Default value: empty.</p>
         * 
         * <strong>example:</strong>
         * <p>We’re sorry, we’re unable to transfer your call at the moment. Please try again later.</p>
         */
        public Builder errorPrompt(String errorPrompt) {
            this.putQueryParameter("ErrorPrompt", errorPrompt);
            this.errorPrompt = errorPrompt;
            return this;
        }

        /**
         * <p>The current call instance ID. This parameter is used only in inbound call transfer scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>call_instance_202******</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The prompt text to play before the transfer begins. If this parameter is left empty, the prompt is skipped and the ringtone is played directly. Default value: empty.</p>
         * 
         * <strong>example:</strong>
         * <p>Please hold while I transfer your call.</p>
         */
        public Builder transferPrompt(String transferPrompt) {
            this.putQueryParameter("TransferPrompt", transferPrompt);
            this.transferPrompt = transferPrompt;
            return this;
        }

        @Override
        public ForwardAIAgentCallRequest build() {
            return new ForwardAIAgentCallRequest(this);
        } 

    } 

}
