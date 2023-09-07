// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBClusterSSLResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBClusterSSLResponseBody</p>
 */
public class DescribeDBClusterSSLResponseBody extends TeaModel {
    @NameInMap("Items")
    private java.util.List < Items> items;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SSLAutoRotate")
    private String SSLAutoRotate;

    private DescribeDBClusterSSLResponseBody(Builder builder) {
        this.items = builder.items;
        this.requestId = builder.requestId;
        this.SSLAutoRotate = builder.SSLAutoRotate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBClusterSSLResponseBody create() {
        return builder().build();
    }

    /**
     * @return items
     */
    public java.util.List < Items> getItems() {
        return this.items;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return SSLAutoRotate
     */
    public String getSSLAutoRotate() {
        return this.SSLAutoRotate;
    }

    public static final class Builder {
        private java.util.List < Items> items; 
        private String requestId; 
        private String SSLAutoRotate; 

        /**
         * The list of SSL connections.
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
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
         * Indicates whether automatic rotation of SSL certificates is enabled. Valid values:
         * <p>
         * 
         * *   **Enable**: The feature is enabled.
         * *   **Disable**: The feature is disabled.
         * 
         * > This parameter is valid only for a PolarDB for MySQL cluster.
         */
        public Builder SSLAutoRotate(String SSLAutoRotate) {
            this.SSLAutoRotate = SSLAutoRotate;
            return this;
        }

        public DescribeDBClusterSSLResponseBody build() {
            return new DescribeDBClusterSSLResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("DBEndpointId")
        private String DBEndpointId;

        @NameInMap("SSLConnectionString")
        private String SSLConnectionString;

        @NameInMap("SSLEnabled")
        private String SSLEnabled;

        @NameInMap("SSLExpireTime")
        private String SSLExpireTime;

        private Items(Builder builder) {
            this.DBEndpointId = builder.DBEndpointId;
            this.SSLConnectionString = builder.SSLConnectionString;
            this.SSLEnabled = builder.SSLEnabled;
            this.SSLExpireTime = builder.SSLExpireTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return DBEndpointId
         */
        public String getDBEndpointId() {
            return this.DBEndpointId;
        }

        /**
         * @return SSLConnectionString
         */
        public String getSSLConnectionString() {
            return this.SSLConnectionString;
        }

        /**
         * @return SSLEnabled
         */
        public String getSSLEnabled() {
            return this.SSLEnabled;
        }

        /**
         * @return SSLExpireTime
         */
        public String getSSLExpireTime() {
            return this.SSLExpireTime;
        }

        public static final class Builder {
            private String DBEndpointId; 
            private String SSLConnectionString; 
            private String SSLEnabled; 
            private String SSLExpireTime; 

            /**
             * The ID of the endpoint.
             */
            public Builder DBEndpointId(String DBEndpointId) {
                this.DBEndpointId = DBEndpointId;
                return this;
            }

            /**
             * The SSL connection string.
             */
            public Builder SSLConnectionString(String SSLConnectionString) {
                this.SSLConnectionString = SSLConnectionString;
                return this;
            }

            /**
             * Indicates whether SSL encryption is enabled. Valid values:
             * <p>
             * 
             * *   **Enabled**: SSL is enabled.
             * *   **Disable**: SSL is disabled.
             */
            public Builder SSLEnabled(String SSLEnabled) {
                this.SSLEnabled = SSLEnabled;
                return this;
            }

            /**
             * The time when the server certificate expires. The time is in the `yyyy-MM-ddTHH:mm:ssZ` format. The time is displayed in UTC.
             */
            public Builder SSLExpireTime(String SSLExpireTime) {
                this.SSLExpireTime = SSLExpireTime;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
