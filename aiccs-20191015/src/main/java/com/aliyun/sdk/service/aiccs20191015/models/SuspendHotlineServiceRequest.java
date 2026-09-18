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
 * {@link SuspendHotlineServiceRequest} extends {@link RequestModel}
 *
 * <p>SuspendHotlineServiceRequest</p>
 */
public class SuspendHotlineServiceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccountName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accountName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(maximum = 5, minimum = 1)
    private Integer type;

    private SuspendHotlineServiceRequest(Builder builder) {
        super(builder);
        this.accountName = builder.accountName;
        this.clientToken = builder.clientToken;
        this.instanceId = builder.instanceId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SuspendHotlineServiceRequest create() {
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<SuspendHotlineServiceRequest, Builder> {
        private String accountName; 
        private String clientToken; 
        private String instanceId; 
        private Integer type; 

        private Builder() {
            super();
        } 

        private Builder(SuspendHotlineServiceRequest request) {
            super(request);
            this.accountName = request.accountName;
            this.clientToken = request.clientToken;
            this.instanceId = request.instanceId;
            this.type = request.type;
        } 

        /**
         * <p>Agent account name, which is the phone number or mailbox entered during account registration. It is unique within the instance.</p>
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
         * <p>Unique ID of the customer request. Used for idempotency validation. You can generate it using UUID.</p>
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
         * <p>Artificial Intelligence Cloud Call Service (AICCS) instance ID.<br>You can obtain it from <strong>Instance Management</strong> in the left-side navigation pane of the <a href="https://aiccs.console.aliyun.com/overview">Artificial Intelligence Cloud Call Service console</a>.</p>
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
         * <p>Reason for the short break. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Short break (default value).</li>
         * <li><strong>2</strong>: Meal break.</li>
         * <li><strong>3</strong>: Meeting.</li>
         * <li><strong>4</strong>: Coaching.</li>
         * <li><strong>5</strong>: Training.</li>
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
        public SuspendHotlineServiceRequest build() {
            return new SuspendHotlineServiceRequest(this);
        } 

    } 

}
