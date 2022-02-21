// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInstanceSSLResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceSSLResponseBody</p>
 */
public class DescribeDBInstanceSSLResponseBody extends TeaModel {
    @NameInMap("CertCommonName")
    private String certCommonName;

    @NameInMap("DBInstanceId")
    private String DBInstanceId;

    @NameInMap("DBInstanceName")
    private String DBInstanceName;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SSLEnabled")
    private Boolean SSLEnabled;

    @NameInMap("SSLExpiredTime")
    private String SSLExpiredTime;

    private DescribeDBInstanceSSLResponseBody(Builder builder) {
        this.certCommonName = builder.certCommonName;
        this.DBInstanceId = builder.DBInstanceId;
        this.DBInstanceName = builder.DBInstanceName;
        this.requestId = builder.requestId;
        this.SSLEnabled = builder.SSLEnabled;
        this.SSLExpiredTime = builder.SSLExpiredTime;
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
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
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
    public Boolean getSSLEnabled() {
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
        private String DBInstanceId; 
        private String DBInstanceName; 
        private String requestId; 
        private Boolean SSLEnabled; 
        private String SSLExpiredTime; 

        /**
         * CertCommonName.
         */
        public Builder certCommonName(String certCommonName) {
            this.certCommonName = certCommonName;
            return this;
        }

        /**
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * DBInstanceName.
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
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
        public Builder SSLEnabled(Boolean SSLEnabled) {
            this.SSLEnabled = SSLEnabled;
            return this;
        }

        /**
         * SSLExpiredTime.
         */
        public Builder SSLExpiredTime(String SSLExpiredTime) {
            this.SSLExpiredTime = SSLExpiredTime;
            return this;
        }

        public DescribeDBInstanceSSLResponseBody build() {
            return new DescribeDBInstanceSSLResponseBody(this);
        } 

    } 

}
