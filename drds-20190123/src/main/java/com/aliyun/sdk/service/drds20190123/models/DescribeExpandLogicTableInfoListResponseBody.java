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
 * {@link DescribeExpandLogicTableInfoListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeExpandLogicTableInfoListResponseBody</p>
 */
public class DescribeExpandLogicTableInfoListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeExpandLogicTableInfoListResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExpandLogicTableInfoListResponseBody create() {
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
         * <p>Indicates the result that is returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0B6B7BDC-575D-4A77-A4F8-24B7EF******</p>
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

        public DescribeExpandLogicTableInfoListResponseBody build() {
            return new DescribeExpandLogicTableInfoListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeExpandLogicTableInfoListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeExpandLogicTableInfoListResponseBody</p>
     */
    public static class DataData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ShardDbKey")
        private String shardDbKey;

        @com.aliyun.core.annotation.NameInMap("ShardTbKey")
        private String shardTbKey;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        private DataData(Builder builder) {
            this.shardDbKey = builder.shardDbKey;
            this.shardTbKey = builder.shardTbKey;
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataData create() {
            return builder().build();
        }

        /**
         * @return shardDbKey
         */
        public String getShardDbKey() {
            return this.shardDbKey;
        }

        /**
         * @return shardTbKey
         */
        public String getShardTbKey() {
            return this.shardTbKey;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private String shardDbKey; 
            private String shardTbKey; 
            private String tableName; 

            /**
             * <p>Indicates the database sharding key.</p>
             * 
             * <strong>example:</strong>
             * <p>id</p>
             */
            public Builder shardDbKey(String shardDbKey) {
                this.shardDbKey = shardDbKey;
                return this;
            }

            /**
             * <p>Indicates the table sharding key.</p>
             * 
             * <strong>example:</strong>
             * <p>address</p>
             */
            public Builder shardTbKey(String shardTbKey) {
                this.shardTbKey = shardTbKey;
                return this;
            }

            /**
             * <p>Indicates the name of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>employee_split2</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            public DataData build() {
                return new DataData(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeExpandLogicTableInfoListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeExpandLogicTableInfoListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("data")
        private java.util.List<DataData> data;

        private Data(Builder builder) {
            this.data = builder.data;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List<DataData> getData() {
            return this.data;
        }

        public static final class Builder {
            private java.util.List<DataData> data; 

            /**
             * data.
             */
            public Builder data(java.util.List<DataData> data) {
                this.data = data;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
