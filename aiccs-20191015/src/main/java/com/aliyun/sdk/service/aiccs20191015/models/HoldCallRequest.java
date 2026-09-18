// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link HoldCallRequest} extends {@link RequestModel}
 *
 * <p>HoldCallRequest</p>
 */
public class HoldCallRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccountName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accountName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CallId")
    private String callId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConnectionId")
    private String connectionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    private HoldCallRequest(Builder builder) {
        super(builder);
        this.accountName = builder.accountName;
        this.callId = builder.callId;
        this.clientToken = builder.clientToken;
        this.connectionId = builder.connectionId;
        this.instanceId = builder.instanceId;
        this.jobId = builder.jobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HoldCallRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountName
     */
    public String getAccountName() {
        return this.accountName;
    }

    /**
     * @return callId
     */
    public String getCallId() {
        return this.callId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return connectionId
     */
    public String getConnectionId() {
        return this.connectionId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    public static final class Builder extends Request.Builder<HoldCallRequest, Builder> {
        private String accountName; 
        private String callId; 
        private String clientToken; 
        private String connectionId; 
        private String instanceId; 
        private String jobId; 

        private Builder() {
            super();
        } 

        private Builder(HoldCallRequest request) {
            super(request);
            this.accountName = request.accountName;
            this.callId = request.callId;
            this.clientToken = request.clientToken;
            this.connectionId = request.connectionId;
            this.instanceId = request.instanceId;
            this.jobId = request.jobId;
        } 

        /**
         * <p>Agent account name (agent logon name)</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:123@123.com">123@123.com</a></p>
         */
        public Builder accountName(String accountName) {
            this.putBodyParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * <p>acid in WebSocket after an inbound call</p>
         * 
         * <strong>example:</strong>
         * <p>7719786</p>
         */
        public Builder callId(String callId) {
            this.putBodyParameter("CallId", callId);
            this.callId = callId;
            return this;
        }

        /**
         * <p>Unique ID of the customer request, used for idempotency validation; can be generated using UUID</p>
         * 
         * <strong>example:</strong>
         * <p>46c1341e-2648-447a-9b11-70b6a298d94d</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>connId in WebSocket after an inbound call</p>
         * 
         * <strong>example:</strong>
         * <p>7719788</p>
         */
        public Builder connectionId(String connectionId) {
            this.putBodyParameter("ConnectionId", connectionId);
            this.connectionId = connectionId;
            return this;
        }

        /**
         * <p>Artificial Intelligence Cloud Call Service (AICCS) instance ID, visible in the Artificial Intelligence Cloud Call Service console</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc_xp_pre-cn-***</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>jobId in WebSocket after an inbound call</p>
         * 
         * <strong>example:</strong>
         * <p>7719787</p>
         */
        public Builder jobId(String jobId) {
            this.putBodyParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        @Override
        public HoldCallRequest build() {
            return new HoldCallRequest(this);
        } 

    } 

}
