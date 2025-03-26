// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link GetDbProxyInstanceSslResponseBody} extends {@link TeaModel}
 *
 * <p>GetDbProxyInstanceSslResponseBody</p>
 */
public class GetDbProxyInstanceSslResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DbProxyCertListItems")
    private DbProxyCertListItems dbProxyCertListItems;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetDbProxyInstanceSslResponseBody(Builder builder) {
        this.dbProxyCertListItems = builder.dbProxyCertListItems;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDbProxyInstanceSslResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dbProxyCertListItems
     */
    public DbProxyCertListItems getDbProxyCertListItems() {
        return this.dbProxyCertListItems;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DbProxyCertListItems dbProxyCertListItems; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetDbProxyInstanceSslResponseBody model) {
            this.dbProxyCertListItems = model.dbProxyCertListItems;
            this.requestId = model.requestId;
        } 

        /**
         * <p>An array that consists of SSL encryption settings.</p>
         */
        public Builder dbProxyCertListItems(DbProxyCertListItems dbProxyCertListItems) {
            this.dbProxyCertListItems = dbProxyCertListItems;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D330E60C-8AAA-4D63-8F64-5B78F4692F98</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDbProxyInstanceSslResponseBody build() {
            return new GetDbProxyInstanceSslResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDbProxyInstanceSslResponseBody} extends {@link TeaModel}
     *
     * <p>GetDbProxyInstanceSslResponseBody</p>
     */
    public static class DbProxyCertListItemsDbProxyCertListItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CertCommonName")
        private String certCommonName;

        @com.aliyun.core.annotation.NameInMap("DbInstanceName")
        private String dbInstanceName;

        @com.aliyun.core.annotation.NameInMap("EndpointName")
        private String endpointName;

        @com.aliyun.core.annotation.NameInMap("EndpointType")
        private String endpointType;

        @com.aliyun.core.annotation.NameInMap("SslExpiredTime")
        private String sslExpiredTime;

        private DbProxyCertListItemsDbProxyCertListItems(Builder builder) {
            this.certCommonName = builder.certCommonName;
            this.dbInstanceName = builder.dbInstanceName;
            this.endpointName = builder.endpointName;
            this.endpointType = builder.endpointType;
            this.sslExpiredTime = builder.sslExpiredTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DbProxyCertListItemsDbProxyCertListItems create() {
            return builder().build();
        }

        /**
         * @return certCommonName
         */
        public String getCertCommonName() {
            return this.certCommonName;
        }

        /**
         * @return dbInstanceName
         */
        public String getDbInstanceName() {
            return this.dbInstanceName;
        }

        /**
         * @return endpointName
         */
        public String getEndpointName() {
            return this.endpointName;
        }

        /**
         * @return endpointType
         */
        public String getEndpointType() {
            return this.endpointType;
        }

        /**
         * @return sslExpiredTime
         */
        public String getSslExpiredTime() {
            return this.sslExpiredTime;
        }

        public static final class Builder {
            private String certCommonName; 
            private String dbInstanceName; 
            private String endpointName; 
            private String endpointType; 
            private String sslExpiredTime; 

            private Builder() {
            } 

            private Builder(DbProxyCertListItemsDbProxyCertListItems model) {
                this.certCommonName = model.certCommonName;
                this.dbInstanceName = model.dbInstanceName;
                this.endpointName = model.endpointName;
                this.endpointType = model.endpointType;
                this.sslExpiredTime = model.sslExpiredTime;
            } 

            /**
             * <p>The dedicated proxy endpoint for which SSL encryption is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>test1234.rwlb.rds.aliyuncs.com</p>
             */
            public Builder certCommonName(String certCommonName) {
                this.certCommonName = certCommonName;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-t4n3axxxxx</p>
             */
            public Builder dbInstanceName(String dbInstanceName) {
                this.dbInstanceName = dbInstanceName;
                return this;
            }

            /**
             * <p>The ID of the dedicated proxy endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>buxxxxxxx</p>
             */
            public Builder endpointName(String endpointName) {
                this.endpointName = endpointName;
                return this;
            }

            /**
             * <p>The default identifier of the dedicated proxy endpoint. The value is fixed as <strong>RWSplit</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>RWSplit</p>
             */
            public Builder endpointType(String endpointType) {
                this.endpointType = endpointType;
                return this;
            }

            /**
             * <p>The time at which the certificate expires.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-16T08:43:20Z</p>
             */
            public Builder sslExpiredTime(String sslExpiredTime) {
                this.sslExpiredTime = sslExpiredTime;
                return this;
            }

            public DbProxyCertListItemsDbProxyCertListItems build() {
                return new DbProxyCertListItemsDbProxyCertListItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDbProxyInstanceSslResponseBody} extends {@link TeaModel}
     *
     * <p>GetDbProxyInstanceSslResponseBody</p>
     */
    public static class DbProxyCertListItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DbProxyCertListItems")
        private java.util.List<DbProxyCertListItemsDbProxyCertListItems> dbProxyCertListItems;

        private DbProxyCertListItems(Builder builder) {
            this.dbProxyCertListItems = builder.dbProxyCertListItems;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DbProxyCertListItems create() {
            return builder().build();
        }

        /**
         * @return dbProxyCertListItems
         */
        public java.util.List<DbProxyCertListItemsDbProxyCertListItems> getDbProxyCertListItems() {
            return this.dbProxyCertListItems;
        }

        public static final class Builder {
            private java.util.List<DbProxyCertListItemsDbProxyCertListItems> dbProxyCertListItems; 

            private Builder() {
            } 

            private Builder(DbProxyCertListItems model) {
                this.dbProxyCertListItems = model.dbProxyCertListItems;
            } 

            /**
             * <p>An array that consists of SSL encryption settings.</p>
             */
            public Builder dbProxyCertListItems(java.util.List<DbProxyCertListItemsDbProxyCertListItems> dbProxyCertListItems) {
                this.dbProxyCertListItems = dbProxyCertListItems;
                return this;
            }

            public DbProxyCertListItems build() {
                return new DbProxyCertListItems(this);
            } 

        } 

    }
}
