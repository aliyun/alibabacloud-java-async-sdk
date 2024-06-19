// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDistributeTableListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDistributeTableListResponseBody</p>
 */
public class DescribeDistributeTableListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeDistributeTableListResponseBody(Builder builder) {
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDistributeTableListResponseBody create() {
        return builder().build();
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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

        public DescribeDistributeTableListResponseBody build() {
            return new DescribeDistributeTableListResponseBody(this);
        } 

    } 

    public static class Tables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DbKey")
        private String dbKey;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        @com.aliyun.core.annotation.NameInMap("TableType")
        private String tableType;

        @com.aliyun.core.annotation.NameInMap("TbKey")
        private String tbKey;

        private Tables(Builder builder) {
            this.dbKey = builder.dbKey;
            this.tableName = builder.tableName;
            this.tableType = builder.tableType;
            this.tbKey = builder.tbKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tables create() {
            return builder().build();
        }

        /**
         * @return dbKey
         */
        public String getDbKey() {
            return this.dbKey;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        /**
         * @return tableType
         */
        public String getTableType() {
            return this.tableType;
        }

        /**
         * @return tbKey
         */
        public String getTbKey() {
            return this.tbKey;
        }

        public static final class Builder {
            private String dbKey; 
            private String tableName; 
            private String tableType; 
            private String tbKey; 

            /**
             * DbKey.
             */
            public Builder dbKey(String dbKey) {
                this.dbKey = dbKey;
                return this;
            }

            /**
             * TableName.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * TableType.
             */
            public Builder tableType(String tableType) {
                this.tableType = tableType;
                return this;
            }

            /**
             * TbKey.
             */
            public Builder tbKey(String tbKey) {
                this.tbKey = tbKey;
                return this;
            }

            public Tables build() {
                return new Tables(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tables")
        private java.util.List < Tables> tables;

        private Data(Builder builder) {
            this.tables = builder.tables;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return tables
         */
        public java.util.List < Tables> getTables() {
            return this.tables;
        }

        public static final class Builder {
            private java.util.List < Tables> tables; 

            /**
             * Tables.
             */
            public Builder tables(java.util.List < Tables> tables) {
                this.tables = tables;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
