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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeDistributeTableListResponseBody model) {
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The data struct.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message. &quot;success&quot; is returned if the request is successful. Otherwise, an error code is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C458B1E8-1683-3645-B154-6BA32080EEA</p>
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

        public DescribeDistributeTableListResponseBody build() {
            return new DescribeDistributeTableListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDistributeTableListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDistributeTableListResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Tables model) {
                this.dbKey = model.dbKey;
                this.tableName = model.tableName;
                this.tableType = model.tableType;
                this.tbKey = model.tbKey;
            } 

            /**
             * <p>The data key.</p>
             * 
             * <strong>example:</strong>
             * <p>id</p>
             */
            public Builder dbKey(String dbKey) {
                this.dbKey = dbKey;
                return this;
            }

            /**
             * <p>The table name.</p>
             * 
             * <strong>example:</strong>
             * <p>sbtest1</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * <p>The table type.</p>
             * 
             * <strong>example:</strong>
             * <p>multi</p>
             */
            public Builder tableType(String tableType) {
                this.tableType = tableType;
                return this;
            }

            /**
             * <p>The table key.</p>
             * 
             * <strong>example:</strong>
             * <p>“”</p>
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
    /**
     * 
     * {@link DescribeDistributeTableListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDistributeTableListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tables")
        private java.util.List<Tables> tables;

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
        public java.util.List<Tables> getTables() {
            return this.tables;
        }

        public static final class Builder {
            private java.util.List<Tables> tables; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.tables = model.tables;
            } 

            /**
             * <p>The list of tables.</p>
             */
            public Builder tables(java.util.List<Tables> tables) {
                this.tables = tables;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
