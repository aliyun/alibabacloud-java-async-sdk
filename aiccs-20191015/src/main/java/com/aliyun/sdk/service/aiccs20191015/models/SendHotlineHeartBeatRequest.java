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
 * {@link SendHotlineHeartBeatRequest} extends {@link RequestModel}
 *
 * <p>SendHotlineHeartBeatRequest</p>
 */
public class SendHotlineHeartBeatRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("Token")
    @com.aliyun.core.annotation.Validation(required = true)
    private String token;

    private SendHotlineHeartBeatRequest(Builder builder) {
        super(builder);
        this.accountName = builder.accountName;
        this.clientToken = builder.clientToken;
        this.instanceId = builder.instanceId;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendHotlineHeartBeatRequest create() {
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
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    public static final class Builder extends Request.Builder<SendHotlineHeartBeatRequest, Builder> {
        private String accountName; 
        private String clientToken; 
        private String instanceId; 
        private String token; 

        private Builder() {
            super();
        } 

        private Builder(SendHotlineHeartBeatRequest request) {
            super(request);
            this.accountName = request.accountName;
            this.clientToken = request.clientToken;
            this.instanceId = request.instanceId;
            this.token = request.token;
        } 

        /**
         * <p>Agent account name, which is the phone number or mailbox specified during account registration. It is unique within the instance.</p>
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
         * <p>Artificial Intelligence Cloud Call Service (AICCS) instance ID.<br>You can obtain it in the <b>Instance Management</b> section of the left-side navigation pane in the <a href="https://aiccs.console.aliyun.com/overview">Artificial Intelligence Cloud Call Service console</a>.</p>
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
         * <p>Heartbeat signature.  </p>
         * <p>You can obtain the token by invoking the <a href="https://help.aliyun.com/document_detail/2718045.html">StartHotlineService</a> API.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0079e7a845e373****</p>
         */
        public Builder token(String token) {
            this.putBodyParameter("Token", token);
            this.token = token;
            return this;
        }

        @Override
        public SendHotlineHeartBeatRequest build() {
            return new SendHotlineHeartBeatRequest(this);
        } 

    } 

}
