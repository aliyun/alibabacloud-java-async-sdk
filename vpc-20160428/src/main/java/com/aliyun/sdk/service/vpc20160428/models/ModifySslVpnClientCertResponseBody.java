// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifySslVpnClientCertResponseBody} extends {@link TeaModel}
 *
 * <p>ModifySslVpnClientCertResponseBody</p>
 */
public class ModifySslVpnClientCertResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SslVpnClientCertId")
    private String sslVpnClientCertId;

    private ModifySslVpnClientCertResponseBody(Builder builder) {
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.sslVpnClientCertId = builder.sslVpnClientCertId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySslVpnClientCertResponseBody create() {
        return builder().build();
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sslVpnClientCertId
     */
    public String getSslVpnClientCertId() {
        return this.sslVpnClientCertId;
    }

    public static final class Builder {
        private String name; 
        private String requestId; 
        private String sslVpnClientCertId; 

        /**
         * <p>The name of the SSL client certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>cert2</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>606998F0-B94D-48FE-8316-ACA81BB230DA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the SSL client certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>vsc-bp1n8wcf134yl0osr****</p>
         */
        public Builder sslVpnClientCertId(String sslVpnClientCertId) {
            this.sslVpnClientCertId = sslVpnClientCertId;
            return this;
        }

        public ModifySslVpnClientCertResponseBody build() {
            return new ModifySslVpnClientCertResponseBody(this);
        } 

    } 

}
