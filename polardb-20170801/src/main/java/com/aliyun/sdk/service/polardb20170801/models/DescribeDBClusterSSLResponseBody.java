// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDBClusterSSLResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBClusterSSLResponseBody</p>
 */
public class DescribeDBClusterSSLResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List < Items> items;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SSLAutoRotate")
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
         * <p>The list of SSL connections.</p>
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>C890995A-CF06-4F4D-8DB8-DD26C2******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether automatic rotation of SSL certificates is enabled. Valid values:</p>
         * <ul>
         * <li><strong>Enable</strong>: The feature is enabled.</li>
         * <li><strong>Disable</strong>: The feature is disabled.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is valid only for a PolarDB for MySQL cluster.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        public Builder SSLAutoRotate(String SSLAutoRotate) {
            this.SSLAutoRotate = SSLAutoRotate;
            return this;
        }

        public DescribeDBClusterSSLResponseBody build() {
            return new DescribeDBClusterSSLResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBClusterSSLResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterSSLResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBEndpointId")
        private String DBEndpointId;

        @com.aliyun.core.annotation.NameInMap("SSLConnectionString")
        private String SSLConnectionString;

        @com.aliyun.core.annotation.NameInMap("SSLEnabled")
        private String SSLEnabled;

        @com.aliyun.core.annotation.NameInMap("SSLExpireTime")
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
             * <p>The ID of the endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>pe-************</p>
             */
            public Builder DBEndpointId(String DBEndpointId) {
                this.DBEndpointId = DBEndpointId;
                return this;
            }

            /**
             * <p>The SSL connection string.</p>
             * 
             * <strong>example:</strong>
             * <p>pc-************.mysql.polardb.rds.aliyuncs.com</p>
             */
            public Builder SSLConnectionString(String SSLConnectionString) {
                this.SSLConnectionString = SSLConnectionString;
                return this;
            }

            /**
             * <p>Indicates whether SSL encryption is enabled. Valid values:</p>
             * <ul>
             * <li><strong>Enabled</strong>: SSL is enabled.</li>
             * <li><strong>Disable</strong>: SSL is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enabled</p>
             */
            public Builder SSLEnabled(String SSLEnabled) {
                this.SSLEnabled = SSLEnabled;
                return this;
            }

            /**
             * <p>The time when the server certificate expires. The time is in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-11-13T07:14:22Z</p>
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
