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
 * {@link DescribeDrdsDBsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDrdsDBsResponseBody</p>
 */
public class DescribeDrdsDBsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
    private String total;

    private DescribeDrdsDBsResponseBody(Builder builder) {
        this.data = builder.data;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDrdsDBsResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
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

    /**
     * @return total
     */
    public String getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Data data; 
        private String pageNumber; 
        private String pageSize; 
        private String requestId; 
        private Boolean success; 
        private String total; 

        /**
         * <p>The list of returned databases.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of databases returned on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>006B7D19-8CDB-4AA6-AAE7-23C107GS3W2T</p>
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

        /**
         * <p>The number of returned databases.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder total(String total) {
            this.total = total;
            return this;
        }

        public DescribeDrdsDBsResponseBody build() {
            return new DescribeDrdsDBsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDrdsDBsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDrdsDBsResponseBody</p>
     */
    public static class Db extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DbInstType")
        private String dbInstType;

        @com.aliyun.core.annotation.NameInMap("DbName")
        private String dbName;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("Schema")
        private String schema;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Db(Builder builder) {
            this.createTime = builder.createTime;
            this.dbInstType = builder.dbInstType;
            this.dbName = builder.dbName;
            this.mode = builder.mode;
            this.schema = builder.schema;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Db create() {
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
            private String mode; 
            private String schema; 
            private String status; 

            /**
             * <p>The time when the database is created. The value of this parameter is a UNIX timestamp. Unit: ms.</p>
             * 
             * <strong>example:</strong>
             * <p>1563773824000</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The type of the database. Valid values: <strong>RDS</strong> and <strong>POLARDB</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>RDS</p>
             */
            public Builder dbInstType(String dbInstType) {
                this.dbInstType = dbInstType;
                return this;
            }

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>drds_test</p>
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * <p>The partitioning mode of the database. Valid values:</p>
             * <ul>
             * <li><strong>HORIZONTAL</strong>: The database is horizontally partitioned.</li>
             * <li><strong>VERTICAL</strong>: The database is vertically partitioned.</li>
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
             * <p>The schema ID that is assigned to the partitioned database.</p>
             * 
             * <strong>example:</strong>
             * <p>drds_test_1563773871118kxqd</p>
             */
            public Builder schema(String schema) {
                this.schema = schema;
                return this;
            }

            /**
             * <p>The state of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Db build() {
                return new Db(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDrdsDBsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDrdsDBsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Db")
        private java.util.List<Db> db;

        private Data(Builder builder) {
            this.db = builder.db;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return db
         */
        public java.util.List<Db> getDb() {
            return this.db;
        }

        public static final class Builder {
            private java.util.List<Db> db; 

            /**
             * Db.
             */
            public Builder db(java.util.List<Db> db) {
                this.db = db;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
