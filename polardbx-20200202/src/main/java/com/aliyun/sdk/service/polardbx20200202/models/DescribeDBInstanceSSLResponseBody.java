// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link DescribeDBInstanceSSLResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceSSLResponseBody</p>
 */
public class DescribeDBInstanceSSLResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDBInstanceSSLResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstanceSSLResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBInstanceSSLResponseBody build() {
            return new DescribeDBInstanceSSLResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBInstanceSSLResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceSSLResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CertCommonName")
        private String certCommonName;

        @com.aliyun.core.annotation.NameInMap("SSLEnabled")
        private Boolean SSLEnabled;

        @com.aliyun.core.annotation.NameInMap("SSLExpiredTime")
        private String SSLExpiredTime;

        private Data(Builder builder) {
            this.certCommonName = builder.certCommonName;
            this.SSLEnabled = builder.SSLEnabled;
            this.SSLExpiredTime = builder.SSLExpiredTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return certCommonName
         */
        public String getCertCommonName() {
            return this.certCommonName;
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

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
