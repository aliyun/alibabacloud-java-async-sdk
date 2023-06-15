// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDBInstanceEndpointAddressResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDBInstanceEndpointAddressResponseBody</p>
 */
public class CreateDBInstanceEndpointAddressResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
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
         * The data returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDBInstanceEndpointAddressResponseBody build() {
            return new CreateDBInstanceEndpointAddressResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("ConnectionString")
        private String connectionString;

        @NameInMap("DBInstanceEndpointId")
        private String DBInstanceEndpointId;

        @NameInMap("DBInstanceName")
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
             * The public endpoint.
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            /**
             * The endpoint ID of the instance.
             */
            public Builder DBInstanceEndpointId(String DBInstanceEndpointId) {
                this.DBInstanceEndpointId = DBInstanceEndpointId;
                return this;
            }

            /**
             * The ID of the instance.
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
