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
 * {@link SubmitAtiAgentRegisterInfoRequest} extends {@link RequestModel}
 *
 * <p>SubmitAtiAgentRegisterInfoRequest</p>
 */
public class SubmitAtiAgentRegisterInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentRegisterInfoId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentRegisterInfoId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdentityCsr")
    @com.aliyun.core.annotation.Validation(required = true)
    private String identityCsr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerCertPem")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serverCertPem;

    private SubmitAtiAgentRegisterInfoRequest(Builder builder) {
        super(builder);
        this.agentRegisterInfoId = builder.agentRegisterInfoId;
        this.clientToken = builder.clientToken;
        this.identityCsr = builder.identityCsr;
        this.serverCertPem = builder.serverCertPem;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitAtiAgentRegisterInfoRequest create() {
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
     * @return identityCsr
     */
    public String getIdentityCsr() {
        return this.identityCsr;
    }

    /**
     * @return serverCertPem
     */
    public String getServerCertPem() {
        return this.serverCertPem;
    }

    public static final class Builder extends Request.Builder<SubmitAtiAgentRegisterInfoRequest, Builder> {
        private String agentRegisterInfoId; 
        private String clientToken; 
        private String identityCsr; 
        private String serverCertPem; 

        private Builder() {
            super();
        } 

        private Builder(SubmitAtiAgentRegisterInfoRequest request) {
            super(request);
            this.agentRegisterInfoId = request.agentRegisterInfoId;
            this.clientToken = request.clientToken;
            this.identityCsr = request.identityCsr;
            this.serverCertPem = request.serverCertPem;
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
         * <p>This parameter is required.</p>
         */
        public Builder identityCsr(String identityCsr) {
            this.putQueryParameter("IdentityCsr", identityCsr);
            this.identityCsr = identityCsr;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder serverCertPem(String serverCertPem) {
            this.putQueryParameter("ServerCertPem", serverCertPem);
            this.serverCertPem = serverCertPem;
            return this;
        }

        @Override
        public SubmitAtiAgentRegisterInfoRequest build() {
            return new SubmitAtiAgentRegisterInfoRequest(this);
        } 

    } 

}
