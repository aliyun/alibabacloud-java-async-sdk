// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

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
 * {@link DescribeDrdsDBResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDrdsDBResponseBody</p>
 */
public class DescribeDrdsDBResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>Indicates the details about the database.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Indicates the ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>58FB0EC7-CF71-4E48-92FB-CF070D******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeDrdsDBResponseBody build() {
            return new DescribeDrdsDBResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDrdsDBResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDrdsDBResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DbInstType")
        private String dbInstType;

        @com.aliyun.core.annotation.NameInMap("DbName")
        private String dbName;

        @com.aliyun.core.annotation.NameInMap("InstRole")
        private String instRole;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("Schema")
        private String schema;

        @com.aliyun.core.annotation.NameInMap("Status")
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
             * <p>Indicates the time when the database was created. The value is in the UNIX timestamp format. Unit: ms.</p>
             * 
             * <strong>example:</strong>
             * <p>1602050276000</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Indicates the storage type of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>RDS</p>
             */
            public Builder dbInstType(String dbInstType) {
                this.dbInstType = dbInstType;
                return this;
            }

            /**
             * <p>Indicates the name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>db_test</p>
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * <p>Indicates the type of the instance in which the database is deployed. Valid values:</p>
             * <ul>
             * <li><strong>MASTER</strong>: The instance is a primary instance.</li>
             * <li><strong>SLAVE</strong>: The instance is a read-only instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>MASTER</p>
             */
            public Builder instRole(String instRole) {
                this.instRole = instRole;
                return this;
            }

            /**
             * <p>Indicates the database sharding method.</p>
             * <ul>
             * <li><strong>HORIZONTAL</strong>: The database is horizontally sharded.</li>
             * <li><strong>VERTICAL</strong>: The database is vertically sharded.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>HORIZONTAL</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>Indicates the schema name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>db_test*******************</p>
             */
            public Builder schema(String schema) {
                this.schema = schema;
                return this;
            }

            /**
             * <p>Indicates the state of the database. Valid values:</p>
             * <ul>
             * <li><strong>TO_BE_INIT</strong>: The database is being created.</li>
             * <li><strong>NORMAL</strong>: The database is running.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
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
