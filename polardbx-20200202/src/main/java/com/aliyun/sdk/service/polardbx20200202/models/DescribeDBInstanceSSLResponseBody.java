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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeDBInstanceSSLResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The data struct.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C458B1E8-1683-3645-B154-6BA32080EEA</p>
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.certCommonName = model.certCommonName;
                this.SSLEnabled = model.SSLEnabled;
                this.SSLExpiredTime = model.SSLExpiredTime;
            } 

            /**
             * <p>The domain name bound to the certificate.</p>
             * 
             * <strong>example:</strong>
             * <p>pxc-sddddddcym7g7w****.polarx.singapore.rds.aliyuncs.com</p>
             */
            public Builder certCommonName(String certCommonName) {
                this.certCommonName = certCommonName;
                return this;
            }

            /**
             * <p>Indicates whether SSL is enabled for the instance. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Enabled.</li>
             * <li><strong>false</strong>: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder SSLEnabled(Boolean SSLEnabled) {
                this.SSLEnabled = SSLEnabled;
                return this;
            }

            /**
             * <p>The expiration time of the certificate. The time is in the YYYY-MM-DDTHH:mm:ssZ format and is in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-11-04T09:39:07Z</p>
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
