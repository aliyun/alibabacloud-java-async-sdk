// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableProxyProtocolRequest} extends {@link RequestModel}
 *
 * <p>EnableProxyProtocolRequest</p>
 */
public class EnableProxyProtocolRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableProxyProtocol")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean enableProxyProtocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gatewayUniqueId;

    private EnableProxyProtocolRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.enableProxyProtocol = builder.enableProxyProtocol;
        this.gatewayUniqueId = builder.gatewayUniqueId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableProxyProtocolRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return enableProxyProtocol
     */
    public Boolean getEnableProxyProtocol() {
        return this.enableProxyProtocol;
    }

    /**
     * @return gatewayUniqueId
     */
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public static final class Builder extends Request.Builder<EnableProxyProtocolRequest, Builder> {
        private String acceptLanguage; 
        private Boolean enableProxyProtocol; 
        private String gatewayUniqueId; 

        private Builder() {
            super();
        } 

        private Builder(EnableProxyProtocolRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.enableProxyProtocol = request.enableProxyProtocol;
            this.gatewayUniqueId = request.gatewayUniqueId;
        } 

        /**
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * EnableProxyProtocol.
         */
        public Builder enableProxyProtocol(Boolean enableProxyProtocol) {
            this.putQueryParameter("EnableProxyProtocol", enableProxyProtocol);
            this.enableProxyProtocol = enableProxyProtocol;
            return this;
        }

        /**
         * GatewayUniqueId.
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        @Override
        public EnableProxyProtocolRequest build() {
            return new EnableProxyProtocolRequest(this);
        } 

    } 

}
