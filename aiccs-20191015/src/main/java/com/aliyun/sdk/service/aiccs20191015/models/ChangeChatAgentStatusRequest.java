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
 * {@link ChangeChatAgentStatusRequest} extends {@link RequestModel}
 *
 * <p>ChangeChatAgentStatusRequest</p>
 */
public class ChangeChatAgentStatusRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("Method")
    @com.aliyun.core.annotation.Validation(required = true)
    private String method;

    private ChangeChatAgentStatusRequest(Builder builder) {
        super(builder);
        this.accountName = builder.accountName;
        this.clientToken = builder.clientToken;
        this.instanceId = builder.instanceId;
        this.method = builder.method;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeChatAgentStatusRequest create() {
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
     * @return method
     */
    public String getMethod() {
        return this.method;
    }

    public static final class Builder extends Request.Builder<ChangeChatAgentStatusRequest, Builder> {
        private String accountName; 
        private String clientToken; 
        private String instanceId; 
        private String method; 

        private Builder() {
            super();
        } 

        private Builder(ChangeChatAgentStatusRequest request) {
            super(request);
            this.accountName = request.accountName;
            this.clientToken = request.clientToken;
            this.instanceId = request.instanceId;
            this.method = request.method;
        } 

        /**
         * <p>Agent account.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>account1</p>
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
         * <p>Artificial Intelligence Cloud Call Service (AICCS) instance ID. You can obtain it from the Artificial Intelligence Cloud Call Service console.</p>
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
         * <p>The target online status to switch to. Currently, only <strong>requestLogout</strong> (request offline) is supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>requestLogout</p>
         */
        public Builder method(String method) {
            this.putBodyParameter("Method", method);
            this.method = method;
            return this;
        }

        @Override
        public ChangeChatAgentStatusRequest build() {
            return new ChangeChatAgentStatusRequest(this);
        } 

    } 

}
