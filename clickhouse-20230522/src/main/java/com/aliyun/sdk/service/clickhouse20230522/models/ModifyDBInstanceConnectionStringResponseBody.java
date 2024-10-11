// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20230522.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyDBInstanceConnectionStringResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDBInstanceConnectionStringResponseBody</p>
 */
public class ModifyDBInstanceConnectionStringResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyDBInstanceConnectionStringResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBInstanceConnectionStringResponseBody create() {
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

        public ModifyDBInstanceConnectionStringResponseBody build() {
            return new ModifyDBInstanceConnectionStringResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ModifyDBInstanceConnectionStringResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyDBInstanceConnectionStringResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectionString")
        private String connectionString;

        @com.aliyun.core.annotation.NameInMap("DBInstanceID")
        private Integer DBInstanceID;

        @com.aliyun.core.annotation.NameInMap("DBInstanceName")
        private String DBInstanceName;

        private Data(Builder builder) {
            this.connectionString = builder.connectionString;
            this.DBInstanceID = builder.DBInstanceID;
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
         * @return DBInstanceID
         */
        public Integer getDBInstanceID() {
            return this.DBInstanceID;
        }

        /**
         * @return DBInstanceName
         */
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        public static final class Builder {
            private String connectionString; 
            private Integer DBInstanceID; 
            private String DBInstanceName; 

            /**
             * ConnectionString.
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            /**
             * DBInstanceID.
             */
            public Builder DBInstanceID(Integer DBInstanceID) {
                this.DBInstanceID = DBInstanceID;
                return this;
            }

            /**
             * DBInstanceName.
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
