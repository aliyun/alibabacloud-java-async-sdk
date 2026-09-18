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
 * {@link TransferCallToSkillGroupRequest} extends {@link RequestModel}
 *
 * <p>TransferCallToSkillGroupRequest</p>
 */
public class TransferCallToSkillGroupRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("HoldConnectionId")
    private String holdConnectionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IsSingleTransfer")
    private Boolean isSingleTransfer;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SkillGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long skillGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(maximum = 2, minimum = 1)
    private Integer type;

    private TransferCallToSkillGroupRequest(Builder builder) {
        super(builder);
        this.accountName = builder.accountName;
        this.callId = builder.callId;
        this.clientToken = builder.clientToken;
        this.connectionId = builder.connectionId;
        this.holdConnectionId = builder.holdConnectionId;
        this.instanceId = builder.instanceId;
        this.isSingleTransfer = builder.isSingleTransfer;
        this.jobId = builder.jobId;
        this.skillGroupId = builder.skillGroupId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TransferCallToSkillGroupRequest create() {
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
     * @return holdConnectionId
     */
    public String getHoldConnectionId() {
        return this.holdConnectionId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return isSingleTransfer
     */
    public Boolean getIsSingleTransfer() {
        return this.isSingleTransfer;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return skillGroupId
     */
    public Long getSkillGroupId() {
        return this.skillGroupId;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<TransferCallToSkillGroupRequest, Builder> {
        private String accountName; 
        private String callId; 
        private String clientToken; 
        private String connectionId; 
        private String holdConnectionId; 
        private String instanceId; 
        private Boolean isSingleTransfer; 
        private String jobId; 
        private Long skillGroupId; 
        private Integer type; 

        private Builder() {
            super();
        } 

        private Builder(TransferCallToSkillGroupRequest request) {
            super(request);
            this.accountName = request.accountName;
            this.callId = request.callId;
            this.clientToken = request.clientToken;
            this.connectionId = request.connectionId;
            this.holdConnectionId = request.holdConnectionId;
            this.instanceId = request.instanceId;
            this.isSingleTransfer = request.isSingleTransfer;
            this.jobId = request.jobId;
            this.skillGroupId = request.skillGroupId;
            this.type = request.type;
        } 

        /**
         * <p>The agent account name, which is the phone number or mailbox entered during account registration. It is unique within the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:username@example.com">username@example.com</a></p>
         */
        public Builder accountName(String accountName) {
            this.putBodyParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * <p>Hotline session ID.</p>
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
         * <p>Unique ID for the customer request. Used for idempotency validation. You can generate it using UUID.</p>
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
         * <p>The connId in the WebSocket after an inbound call.</p>
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
         * <p>The holdConnId in the WebSocket after an inbound call (required only for two-step transfer).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder holdConnectionId(String holdConnectionId) {
            this.putBodyParameter("HoldConnectionId", holdConnectionId);
            this.holdConnectionId = holdConnectionId;
            return this;
        }

        /**
         * <p>Artificial Intelligence Cloud Call Service (AICCS) instance ID.
         * You can obtain it from <strong>Instance Management</strong> in the left-side navigation pane of the <a href="https://aiccs.console.aliyun.com/overview">Artificial Intelligence Cloud Call Service console</a>.</p>
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
         * <p>Default value: <strong>true</strong>. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Single-step transfer.</li>
         * <li><strong>false</strong>: Two-step transfer.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isSingleTransfer(Boolean isSingleTransfer) {
            this.putBodyParameter("IsSingleTransfer", isSingleTransfer);
            this.isSingleTransfer = isSingleTransfer;
            return this;
        }

        /**
         * <p>The jobId in the WebSocket after an inbound call.</p>
         * 
         * <strong>example:</strong>
         * <p>7719787</p>
         */
        public Builder jobId(String jobId) {
            this.putBodyParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>Skill group ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>356543</p>
         */
        public Builder skillGroupId(Long skillGroupId) {
            this.putBodyParameter("SkillGroupId", skillGroupId);
            this.skillGroupId = skillGroupId;
            return this;
        }

        /**
         * <p>Default value: <strong>1</strong>. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Single-step transfer.</li>
         * <li><strong>2</strong>: Two-step transfer.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder type(Integer type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public TransferCallToSkillGroupRequest build() {
            return new TransferCallToSkillGroupRequest(this);
        } 

    } 

}
