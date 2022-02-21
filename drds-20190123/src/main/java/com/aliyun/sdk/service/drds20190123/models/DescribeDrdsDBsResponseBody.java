// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDrdsDBsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDrdsDBsResponseBody</p>
 */
public class DescribeDrdsDBsResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("PageNumber")
    private String pageNumber;

    @NameInMap("PageSize")
    private String pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("Total")
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
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(String total) {
            this.total = total;
            return this;
        }

        public DescribeDrdsDBsResponseBody build() {
            return new DescribeDrdsDBsResponseBody(this);
        } 

    } 

    public static class Db extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DbInstType")
        private String dbInstType;

        @NameInMap("DbName")
        private String dbName;

        @NameInMap("Mode")
        private String mode;

        @NameInMap("Schema")
        private String schema;

        @NameInMap("Status")
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
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DbInstType.
             */
            public Builder dbInstType(String dbInstType) {
                this.dbInstType = dbInstType;
                return this;
            }

            /**
             * DbName.
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * Mode.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * Schema.
             */
            public Builder schema(String schema) {
                this.schema = schema;
                return this;
            }

            /**
             * Status.
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
    public static class Data extends TeaModel {
        @NameInMap("Db")
        private java.util.List < Db> db;

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
        public java.util.List < Db> getDb() {
            return this.db;
        }

        public static final class Builder {
            private java.util.List < Db> db; 

            /**
             * Db.
             */
            public Builder db(java.util.List < Db> db) {
                this.db = db;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
