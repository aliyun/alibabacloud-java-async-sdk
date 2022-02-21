// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AnswerCallRequest} extends {@link RequestModel}
 *
 * <p>AnswerCallRequest</p>
 */
public class AnswerCallRequest extends Request {
    @Body
    @NameInMap("AccountName")
    @Validation(required = true)
    private String accountName;

    @Body
    @NameInMap("CallId")
    private String callId;

    @Body
    @NameInMap("ClientToken")
    private String clientToken;

    @Body
    @NameInMap("ConnectionId")
    private String connectionId;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("JobId")
    private String jobId;

    private AnswerCallRequest(Builder builder) {
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

    public static AnswerCallRequest create() {
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

    public static final class Builder extends Request.Builder<AnswerCallRequest, Builder> {
        private String accountName; 
        private String callId; 
        private String clientToken; 
        private String connectionId; 
        private String instanceId; 
        private String jobId; 

        private Builder() {
            super();
        } 

        private Builder(AnswerCallRequest response) {
            super(response);
            this.accountName = response.accountName;
            this.callId = response.callId;
            this.clientToken = response.clientToken;
            this.connectionId = response.connectionId;
            this.instanceId = response.instanceId;
            this.jobId = response.jobId;
        } 

        /**
         * AccountName.
         */
        public Builder accountName(String accountName) {
            this.putBodyParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * CallId.
         */
        public Builder callId(String callId) {
            this.putBodyParameter("CallId", callId);
            this.callId = callId;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * ConnectionId.
         */
        public Builder connectionId(String connectionId) {
            this.putBodyParameter("ConnectionId", connectionId);
            this.connectionId = connectionId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.putBodyParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        @Override
        public AnswerCallRequest build() {
            return new AnswerCallRequest(this);
        } 

    } 

}
