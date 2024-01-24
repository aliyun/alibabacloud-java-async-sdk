// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExpandLogicTableInfoListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeExpandLogicTableInfoListResponseBody</p>
 */
public class DescribeExpandLogicTableInfoListResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * Indicates the result that is returned.
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

        /**
         * Indicates whether the request is successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeExpandLogicTableInfoListResponseBody build() {
            return new DescribeExpandLogicTableInfoListResponseBody(this);
        } 

    } 

    public static class DataData extends TeaModel {
        @NameInMap("ShardDbKey")
        private String shardDbKey;

        @NameInMap("ShardTbKey")
        private String shardTbKey;

        @NameInMap("TableName")
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
             * Indicates the database sharding key.
             */
            public Builder shardDbKey(String shardDbKey) {
                this.shardDbKey = shardDbKey;
                return this;
            }

            /**
             * Indicates the table sharding key.
             */
            public Builder shardTbKey(String shardTbKey) {
                this.shardTbKey = shardTbKey;
                return this;
            }

            /**
             * Indicates the name of the table.
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
    public static class Data extends TeaModel {
        @NameInMap("data")
        private java.util.List < DataData> data;

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
        public java.util.List < DataData> getData() {
            return this.data;
        }

        public static final class Builder {
            private java.util.List < DataData> data; 

            /**
             * data.
             */
            public Builder data(java.util.List < DataData> data) {
                this.data = data;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
