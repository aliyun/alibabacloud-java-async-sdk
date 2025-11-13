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
        private String errorPrompt; 
        private String instanceId; 
        private String transferPrompt; 

        private Builder() {
            super();
        } 

        private Builder(ForwardAIAgentCallRequest request) {
            super(request);
            this.calledNumber = request.calledNumber;
            this.errorPrompt = request.errorPrompt;
            this.instanceId = request.instanceId;
            this.transferPrompt = request.transferPrompt;
        } 

        /**
         * CalledNumber.
         */
        public Builder calledNumber(String calledNumber) {
            this.putQueryParameter("CalledNumber", calledNumber);
            this.calledNumber = calledNumber;
            return this;
        }

        /**
         * ErrorPrompt.
         */
        public Builder errorPrompt(String errorPrompt) {
            this.putQueryParameter("ErrorPrompt", errorPrompt);
            this.errorPrompt = errorPrompt;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * TransferPrompt.
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
