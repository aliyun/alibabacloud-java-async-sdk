// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link RevokeAtiAgentRegisterInfoRequest} extends {@link RequestModel}
 *
 * <p>RevokeAtiAgentRegisterInfoRequest</p>
 */
public class RevokeAtiAgentRegisterInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentRegisterInfoId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentRegisterInfoId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Reason")
    private String reason;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReasonCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String reasonCode;

    private RevokeAtiAgentRegisterInfoRequest(Builder builder) {
        super(builder);
        this.agentRegisterInfoId = builder.agentRegisterInfoId;
        this.clientToken = builder.clientToken;
        this.reason = builder.reason;
        this.reasonCode = builder.reasonCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RevokeAtiAgentRegisterInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentRegisterInfoId
     */
    public String getAgentRegisterInfoId() {
        return this.agentRegisterInfoId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * @return reasonCode
     */
    public String getReasonCode() {
        return this.reasonCode;
    }

    public static final class Builder extends Request.Builder<RevokeAtiAgentRegisterInfoRequest, Builder> {
        private String agentRegisterInfoId; 
        private String clientToken; 
        private String reason; 
        private String reasonCode; 

        private Builder() {
            super();
        } 

        private Builder(RevokeAtiAgentRegisterInfoRequest request) {
            super(request);
            this.agentRegisterInfoId = request.agentRegisterInfoId;
            this.clientToken = request.clientToken;
            this.reason = request.reason;
            this.reasonCode = request.reasonCode;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2074753647748672512</p>
         */
        public Builder agentRegisterInfoId(String agentRegisterInfoId) {
            this.putQueryParameter("AgentRegisterInfoId", agentRegisterInfoId);
            this.agentRegisterInfoId = agentRegisterInfoId;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Reason.
         */
        public Builder reason(String reason) {
            this.putQueryParameter("Reason", reason);
            this.reason = reason;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>unspecified</p>
         */
        public Builder reasonCode(String reasonCode) {
            this.putQueryParameter("ReasonCode", reasonCode);
            this.reasonCode = reasonCode;
            return this;
        }

        @Override
        public RevokeAtiAgentRegisterInfoRequest build() {
            return new RevokeAtiAgentRegisterInfoRequest(this);
        } 

    } 

}
