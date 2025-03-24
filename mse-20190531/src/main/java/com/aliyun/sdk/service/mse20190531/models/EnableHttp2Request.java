// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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
 * {@link EnableHttp2Request} extends {@link RequestModel}
 *
 * <p>EnableHttp2Request</p>
 */
public class EnableHttp2Request extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableHttp2")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean enableHttp2;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gatewayUniqueId;

    private EnableHttp2Request(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.enableHttp2 = builder.enableHttp2;
        this.gatewayUniqueId = builder.gatewayUniqueId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableHttp2Request create() {
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
     * @return enableHttp2
     */
    public Boolean getEnableHttp2() {
        return this.enableHttp2;
    }

    /**
     * @return gatewayUniqueId
     */
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public static final class Builder extends Request.Builder<EnableHttp2Request, Builder> {
        private String acceptLanguage; 
        private Boolean enableHttp2; 
        private String gatewayUniqueId; 

        private Builder() {
            super();
        } 

        private Builder(EnableHttp2Request request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.enableHttp2 = request.enableHttp2;
            this.gatewayUniqueId = request.gatewayUniqueId;
        } 

        /**
         * <p>The language in which you want to display the results. Valid values: zh and en. zh indicates Chinese, which is the default value. en indicates English.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>Specifies whether to enable HTTP/2 for negotiation between the server and client. This parameter applies to requests. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableHttp2(Boolean enableHttp2) {
            this.putQueryParameter("EnableHttp2", enableHttp2);
            this.enableHttp2 = enableHttp2;
            return this;
        }

        /**
         * <p>The unique ID of the gateway.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-0adf3ad751284cc69fcf9669fba*****</p>
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        @Override
        public EnableHttp2Request build() {
            return new EnableHttp2Request(this);
        } 

    } 

}
