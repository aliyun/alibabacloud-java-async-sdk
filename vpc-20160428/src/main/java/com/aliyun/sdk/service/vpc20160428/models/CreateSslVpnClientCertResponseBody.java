// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link CreateSslVpnClientCertResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSslVpnClientCertResponseBody</p>
 */
public class CreateSslVpnClientCertResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SslVpnClientCertId")
    private String sslVpnClientCertId;

    private CreateSslVpnClientCertResponseBody(Builder builder) {
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.sslVpnClientCertId = builder.sslVpnClientCertId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSslVpnClientCertResponseBody create() {
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
         * <p>SslVpnClientCert</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>079874CD-AEC1-43E6-AC03-ADD96B6E4907</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the SSL client certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>vsc-m5euof6s5jy8vs5kd****</p>
         */
        public Builder sslVpnClientCertId(String sslVpnClientCertId) {
            this.sslVpnClientCertId = sslVpnClientCertId;
            return this;
        }

        public CreateSslVpnClientCertResponseBody build() {
            return new CreateSslVpnClientCertResponseBody(this);
        } 

    } 

}
