// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
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

    public static class Data extends TeaModel {
        @NameInMap("CertCommonName")
        private String certCommonName;

        @NameInMap("SSLEnabled")
        private Boolean SSLEnabled;

        @NameInMap("SSLExpiredTime")
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
