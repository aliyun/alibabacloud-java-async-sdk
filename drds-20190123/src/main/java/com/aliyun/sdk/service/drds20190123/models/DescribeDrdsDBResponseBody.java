// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDrdsDBResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDrdsDBResponseBody</p>
 */
public class DescribeDrdsDBResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeDrdsDBResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDrdsDBResponseBody create() {
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 
        private Boolean success; 

        /**
         * Indicates the details about the database.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Indicates the ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request is successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeDrdsDBResponseBody build() {
            return new DescribeDrdsDBResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DbInstType")
        private String dbInstType;

        @NameInMap("DbName")
        private String dbName;

        @NameInMap("InstRole")
        private String instRole;

        @NameInMap("Mode")
        private String mode;

        @NameInMap("Schema")
        private String schema;

        @NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.createTime = builder.createTime;
            this.dbInstType = builder.dbInstType;
            this.dbName = builder.dbName;
            this.instRole = builder.instRole;
            this.mode = builder.mode;
            this.schema = builder.schema;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dbInstType
         */
        public String getDbInstType() {
            return this.dbInstType;
        }

        /**
         * @return dbName
         */
        public String getDbName() {
            return this.dbName;
        }

        /**
         * @return instRole
         */
        public String getInstRole() {
            return this.instRole;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return schema
         */
        public String getSchema() {
            return this.schema;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String createTime; 
            private String dbInstType; 
            private String dbName; 
            private String instRole; 
            private String mode; 
            private String schema; 
            private String status; 

            /**
             * Indicates the time when the database was created. The value is in the UNIX timestamp format. Unit: ms.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Indicates the storage type of the database.
             */
            public Builder dbInstType(String dbInstType) {
                this.dbInstType = dbInstType;
                return this;
            }

            /**
             * Indicates the name of the database.
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * Indicates the type of the instance in which the database is deployed. Valid values:
             * <p>
             * 
             * *   **MASTER**: The instance is a primary instance.
             * *   **SLAVE**: The instance is a read-only instance.
             */
            public Builder instRole(String instRole) {
                this.instRole = instRole;
                return this;
            }

            /**
             * Indicates the database sharding method.
             * <p>
             * 
             * *   **HORIZONTAL**: The database is horizontally sharded.
             * *   **VERTICAL**: The database is vertically sharded.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * Indicates the schema name of the database.
             */
            public Builder schema(String schema) {
                this.schema = schema;
                return this;
            }

            /**
             * Indicates the state of the database. Valid values:
             * <p>
             * 
             * *   **TO_BE_INIT**: The database is being created.
             * *   **NORMAL**: The database is running.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
