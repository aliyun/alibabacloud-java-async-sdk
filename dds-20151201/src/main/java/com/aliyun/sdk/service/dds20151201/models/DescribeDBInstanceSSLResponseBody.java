// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInstanceSSLResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceSSLResponseBody</p>
 */
public class DescribeDBInstanceSSLResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CertCommonName")
    private String certCommonName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SSLExpiredTime")
    private String SSLExpiredTime;

    @com.aliyun.core.annotation.NameInMap("SSLStatus")
    private String SSLStatus;

    private DescribeDBInstanceSSLResponseBody(Builder builder) {
        this.certCommonName = builder.certCommonName;
        this.requestId = builder.requestId;
        this.SSLExpiredTime = builder.SSLExpiredTime;
        this.SSLStatus = builder.SSLStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstanceSSLResponseBody create() {
        return builder().build();
    }

    /**
     * @return certCommonName
     */
    public String getCertCommonName() {
        return this.certCommonName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return SSLExpiredTime
     */
    public String getSSLExpiredTime() {
        return this.SSLExpiredTime;
    }

    /**
     * @return SSLStatus
     */
    public String getSSLStatus() {
        return this.SSLStatus;
    }

    public static final class Builder {
        private String certCommonName; 
        private String requestId; 
        private String SSLExpiredTime; 
        private String SSLStatus; 

        /**
         * The name of the SSL certificate.
         */
        public Builder certCommonName(String certCommonName) {
            this.certCommonName = certCommonName;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The time when the SSL certificate expires. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in Coordinated Universal Time (UTC).
         */
        public Builder SSLExpiredTime(String SSLExpiredTime) {
            this.SSLExpiredTime = SSLExpiredTime;
            return this;
        }

        /**
         * The status of the SSL feature. Valid values:
         * <p>
         * 
         * *   **Open**: The SSL feature is enabled.
         * *   **Closed**: The SSL feature is disabled.
         */
        public Builder SSLStatus(String SSLStatus) {
            this.SSLStatus = SSLStatus;
            return this;
        }

        public DescribeDBInstanceSSLResponseBody build() {
            return new DescribeDBInstanceSSLResponseBody(this);
        } 

    } 

}
