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
         * CAType.
         */
        public Builder CAType(String CAType) {
            this.CAType = CAType;
            return this;
        }

        /**
         * InstanceName.
         */
        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SSLEnabled.
         */
        public Builder SSLEnabled(String SSLEnabled) {
            this.SSLEnabled = SSLEnabled;
            return this;
        }

        /**
         * ServerCert.
         */
        public Builder serverCert(String serverCert) {
            this.serverCert = serverCert;
            return this;
        }

        /**
         * ServerKey.
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
