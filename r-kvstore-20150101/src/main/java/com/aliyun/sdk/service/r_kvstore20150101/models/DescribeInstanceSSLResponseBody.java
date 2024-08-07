// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceSSLResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceSSLResponseBody</p>
 */
public class DescribeInstanceSSLResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CertCommonName")
    private String certCommonName;

    @com.aliyun.core.annotation.NameInMap("CertDownloadURL")
    private String certDownloadURL;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SSLEnabled")
    private String SSLEnabled;

    @com.aliyun.core.annotation.NameInMap("SSLExpiredTime")
    private String SSLExpiredTime;

    private DescribeInstanceSSLResponseBody(Builder builder) {
        this.certCommonName = builder.certCommonName;
        this.certDownloadURL = builder.certDownloadURL;
        this.instanceId = builder.instanceId;
        this.requestId = builder.requestId;
        this.SSLEnabled = builder.SSLEnabled;
        this.SSLExpiredTime = builder.SSLExpiredTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceSSLResponseBody create() {
        return builder().build();
    }

    /**
     * @return certCommonName
     */
    public String getCertCommonName() {
        return this.certCommonName;
    }

    /**
     * @return certDownloadURL
     */
    public String getCertDownloadURL() {
        return this.certDownloadURL;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
     * @return SSLExpiredTime
     */
    public String getSSLExpiredTime() {
        return this.SSLExpiredTime;
    }

    public static final class Builder {
        private String certCommonName; 
        private String certDownloadURL; 
        private String instanceId; 
        private String requestId; 
        private String SSLEnabled; 
        private String SSLExpiredTime; 

        /**
         * The common name of the CA certificate. The default value is the internal endpoint of the instance.
         */
        public Builder certCommonName(String certCommonName) {
            this.certCommonName = certCommonName;
            return this;
        }

        /**
         * The download URL of the CA certificate.
         */
        public Builder certDownloadURL(String certDownloadURL) {
            this.certDownloadURL = certDownloadURL;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The status of the TLS (SSL) encryption feature. Valid values:
         * <p>
         * 
         * *   **Enable**: SSL encryption is enabled.
         * *   **Disable**: SSL encryption is disabled.
         */
        public Builder SSLEnabled(String SSLEnabled) {
            this.SSLEnabled = SSLEnabled;
            return this;
        }

        /**
         * The time when the CA certificate expires.
         */
        public Builder SSLExpiredTime(String SSLExpiredTime) {
            this.SSLExpiredTime = SSLExpiredTime;
            return this;
        }

        public DescribeInstanceSSLResponseBody build() {
            return new DescribeInstanceSSLResponseBody(this);
        } 

    } 

}
