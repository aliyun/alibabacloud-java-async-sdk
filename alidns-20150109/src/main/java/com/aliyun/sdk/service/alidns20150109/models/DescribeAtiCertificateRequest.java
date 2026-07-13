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
 * {@link DescribeAtiCertificateRequest} extends {@link RequestModel}
 *
 * <p>DescribeAtiCertificateRequest</p>
 */
public class DescribeAtiCertificateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentCertificateId")
    private String agentCertificateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    private DescribeAtiCertificateRequest(Builder builder) {
        super(builder);
        this.agentCertificateId = builder.agentCertificateId;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAtiCertificateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentCertificateId
     */
    public String getAgentCertificateId() {
        return this.agentCertificateId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<DescribeAtiCertificateRequest, Builder> {
        private String agentCertificateId; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAtiCertificateRequest request) {
            super(request);
            this.agentCertificateId = request.agentCertificateId;
            this.clientToken = request.clientToken;
        } 

        /**
         * AgentCertificateId.
         */
        public Builder agentCertificateId(String agentCertificateId) {
            this.putQueryParameter("AgentCertificateId", agentCertificateId);
            this.agentCertificateId = agentCertificateId;
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

        @Override
        public DescribeAtiCertificateRequest build() {
            return new DescribeAtiCertificateRequest(this);
        } 

    } 

}
