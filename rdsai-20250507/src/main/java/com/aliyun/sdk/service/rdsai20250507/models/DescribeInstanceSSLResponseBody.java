// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link DescribeInstanceSSLResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceSSLResponseBody</p>
 */
public class DescribeInstanceSSLResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CAType")
    private String CAType;

    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SSLEnabled")
    private String SSLEnabled;

    @com.aliyun.core.annotation.NameInMap("ServerCert")
    private String serverCert;

    @com.aliyun.core.annotation.NameInMap("ServerKey")
    private String serverKey;

    private DescribeInstanceSSLResponseBody(Builder builder) {
        this.CAType = builder.CAType;
        this.instanceName = builder.instanceName;
        this.requestId = builder.requestId;
        this.SSLEnabled = builder.SSLEnabled;
        this.serverCert = builder.serverCert;
        this.serverKey = builder.serverKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceSSLResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return CAType
     */
    public String getCAType() {
        return this.CAType;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return SSLEnabled
     */
    public String getSSLEnabled() {
        return this.SSLEnabled;
    }

    /**
     * @return serverCert
     */
    public String getServerCert() {
        return this.serverCert;
    }

    /**
     * @return serverKey
     */
    public String getServerKey() {
        return this.serverKey;
    }

    public static final class Builder {
        private String CAType; 
        private String instanceName; 
        private String requestId; 
        private String SSLEnabled; 
        private String serverCert; 
        private String serverKey; 

        private Builder() {
        } 

        private Builder(DescribeInstanceSSLResponseBody model) {
            this.CAType = model.CAType;
            this.instanceName = model.instanceName;
            this.requestId = model.requestId;
            this.SSLEnabled = model.SSLEnabled;
            this.serverCert = model.serverCert;
            this.serverKey = model.serverKey;
        } 

        /**
         * <p>The type of the certificate. Set the value to <strong>custom</strong>, which indicates that a custom certificate is used.</p>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        public Builder CAType(String CAType) {
            this.CAType = CAType;
            return this;
        }

        /**
         * <p>The ID of the RDS Supabase instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ra-supabase-8moov5lxba****</p>
         */
        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>32DEFB4A-861F-5D1D-ADD5-918E4FD7AB8C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Specifies whether to enable SSL encryption. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: enables SSL encryption.</li>
         * <li><strong>0</strong>: disables SSL encryption.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder SSLEnabled(String SSLEnabled) {
            this.SSLEnabled = SSLEnabled;
            return this;
        }

        /**
         * <p>The content of the custom certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE-----MIID*****QqEP-----END CERTIFICATE-----</p>
         */
        public Builder serverCert(String serverCert) {
            this.serverCert = serverCert;
            return this;
        }

        /**
         * <p>The private key of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN PRIVATE KEY-----MIIE****ihfg==-----END PRIVATE KEY-----</p>
         */
        public Builder serverKey(String serverKey) {
            this.serverKey = serverKey;
            return this;
        }

        public DescribeInstanceSSLResponseBody build() {
            return new DescribeInstanceSSLResponseBody(this);
        } 

    } 

}
