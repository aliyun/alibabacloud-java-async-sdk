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
 * {@link ModifyDBInstanceConnectionStringResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDBInstanceConnectionStringResponseBody</p>
 */
public class ModifyDBInstanceConnectionStringResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyDBInstanceConnectionStringResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBInstanceConnectionStringResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ModifyDBInstanceConnectionStringResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The new connection string information.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message, which is typically an error message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID, which is a unique identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>c3cf535c-a585-11ea-8263-00163e04d3a7</p>
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

        @com.aliyun.core.annotation.NameInMap("DBInstanceName")
        private String DBInstanceName;

        @com.aliyun.core.annotation.NameInMap("DBInstanceNetType")
        private String DBInstanceNetType;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        private Data(Builder builder) {
            this.connectionString = builder.connectionString;
            this.DBInstanceName = builder.DBInstanceName;
            this.DBInstanceNetType = builder.DBInstanceNetType;
            this.port = builder.port;
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
         * @return DBInstanceName
         */
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        /**
         * @return DBInstanceNetType
         */
        public String getDBInstanceNetType() {
            return this.DBInstanceNetType;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        public static final class Builder {
            private String connectionString; 
            private String DBInstanceName; 
            private String DBInstanceNetType; 
            private String port; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.connectionString = model.connectionString;
                this.DBInstanceName = model.DBInstanceName;
                this.DBInstanceNetType = model.DBInstanceNetType;
                this.port = model.port;
            } 

            /**
             * <p>The connection string.</p>
             * 
             * <strong>example:</strong>
             * <p>test2.polarx.huhehaote.rds.aliyuncs.com</p>
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pxc-unrf5ssig0ecg8</p>
             */
            public Builder DBInstanceName(String DBInstanceName) {
                this.DBInstanceName = DBInstanceName;
                return this;
            }

            /**
             * <p>The network type of the connection string.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder DBInstanceNetType(String DBInstanceNetType) {
                this.DBInstanceNetType = DBInstanceNetType;
                return this;
            }

            /**
             * <p>The port number.</p>
             * 
             * <strong>example:</strong>
             * <p>3300</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
