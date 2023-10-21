// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDbProxyInstanceSslResponseBody} extends {@link TeaModel}
 *
 * <p>GetDbProxyInstanceSslResponseBody</p>
 */
public class GetDbProxyInstanceSslResponseBody extends TeaModel {
    @NameInMap("DbProxyCertListItems")
    private DbProxyCertListItems dbProxyCertListItems;

    @NameInMap("RequestId")
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

        /**
         * An array that consists of SSL encryption settings.
         */
        public Builder dbProxyCertListItems(DbProxyCertListItems dbProxyCertListItems) {
            this.dbProxyCertListItems = dbProxyCertListItems;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDbProxyInstanceSslResponseBody build() {
            return new GetDbProxyInstanceSslResponseBody(this);
        } 

    } 

    public static class DbProxyCertListItemsDbProxyCertListItems extends TeaModel {
        @NameInMap("CertCommonName")
        private String certCommonName;

        @NameInMap("DbInstanceName")
        private String dbInstanceName;

        @NameInMap("EndpointName")
        private String endpointName;

        @NameInMap("EndpointType")
        private String endpointType;

        @NameInMap("SslExpiredTime")
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

            /**
             * The dedicated proxy endpoint for which SSL encryption is enabled.
             */
            public Builder certCommonName(String certCommonName) {
                this.certCommonName = certCommonName;
                return this;
            }

            /**
             * The instance ID.
             */
            public Builder dbInstanceName(String dbInstanceName) {
                this.dbInstanceName = dbInstanceName;
                return this;
            }

            /**
             * The ID of the dedicated proxy endpoint.
             */
            public Builder endpointName(String endpointName) {
                this.endpointName = endpointName;
                return this;
            }

            /**
             * The default identifier of the dedicated proxy endpoint. The value is fixed as **RWSplit**.
             */
            public Builder endpointType(String endpointType) {
                this.endpointType = endpointType;
                return this;
            }

            /**
             * The time at which the certificate expires.
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
    public static class DbProxyCertListItems extends TeaModel {
        @NameInMap("DbProxyCertListItems")
        private java.util.List < DbProxyCertListItemsDbProxyCertListItems> dbProxyCertListItems;

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
        public java.util.List < DbProxyCertListItemsDbProxyCertListItems> getDbProxyCertListItems() {
            return this.dbProxyCertListItems;
        }

        public static final class Builder {
            private java.util.List < DbProxyCertListItemsDbProxyCertListItems> dbProxyCertListItems; 

            /**
             * An array that consists of SSL encryption settings.
             */
            public Builder dbProxyCertListItems(java.util.List < DbProxyCertListItemsDbProxyCertListItems> dbProxyCertListItems) {
                this.dbProxyCertListItems = dbProxyCertListItems;
                return this;
            }

            public DbProxyCertListItems build() {
                return new DbProxyCertListItems(this);
            } 

        } 

    }
}
