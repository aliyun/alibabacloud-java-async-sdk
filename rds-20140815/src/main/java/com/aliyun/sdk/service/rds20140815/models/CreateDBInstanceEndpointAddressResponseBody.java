// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateDBInstanceEndpointAddressResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDBInstanceEndpointAddressResponseBody</p>
 */
public class CreateDBInstanceEndpointAddressResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateDBInstanceEndpointAddressResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDBInstanceEndpointAddressResponseBody create() {
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
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>08A3B71B-FE08-4B03-974F-CC7EA6DB1828</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDBInstanceEndpointAddressResponseBody build() {
            return new CreateDBInstanceEndpointAddressResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateDBInstanceEndpointAddressResponseBody} extends {@link TeaModel}
     *
     * <p>CreateDBInstanceEndpointAddressResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectionString")
        private String connectionString;

        @com.aliyun.core.annotation.NameInMap("DBInstanceEndpointId")
        private String DBInstanceEndpointId;

        @com.aliyun.core.annotation.NameInMap("DBInstanceName")
        private String DBInstanceName;

        private Data(Builder builder) {
            this.connectionString = builder.connectionString;
            this.DBInstanceEndpointId = builder.DBInstanceEndpointId;
            this.DBInstanceName = builder.DBInstanceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return connectionString
         */
        public String getConnectionString() {
            return this.connectionString;
        }

        /**
         * @return DBInstanceEndpointId
         */
        public String getDBInstanceEndpointId() {
            return this.DBInstanceEndpointId;
        }

        /**
         * @return DBInstanceName
         */
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        public static final class Builder {
            private String connectionString; 
            private String DBInstanceEndpointId; 
            private String DBInstanceName; 

            /**
             * <p>The public endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-******.mysql.rds.aliyuncs.com</p>
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            /**
             * <p>The endpoint ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ep-****</p>
             */
            public Builder DBInstanceEndpointId(String DBInstanceEndpointId) {
                this.DBInstanceEndpointId = DBInstanceEndpointId;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-****</p>
             */
            public Builder DBInstanceName(String DBInstanceName) {
                this.DBInstanceName = DBInstanceName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
