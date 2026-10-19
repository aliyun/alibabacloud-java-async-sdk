// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

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
 * {@link DescribeTairSkvDdbTableResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTairSkvDdbTableResponseBody</p>
 */
public class DescribeTairSkvDdbTableResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Tables")
    private Tables tables;

    private DescribeTairSkvDdbTableResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.tables = builder.tables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTairSkvDdbTableResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tables
     */
    public Tables getTables() {
        return this.tables;
    }

    public static final class Builder {
        private String requestId; 
        private Tables tables; 

        private Builder() {
        } 

        private Builder(DescribeTairSkvDdbTableResponseBody model) {
            this.requestId = model.requestId;
            this.tables = model.tables;
        } 

        /**
         * <p>The request ID, which is used to locate logs and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>2363CEDF-C697-14B6-AB9E-C57A4AA0EAD4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Tables.
         */
        public Builder tables(Tables tables) {
            this.tables = tables;
            return this;
        }

        public DescribeTairSkvDdbTableResponseBody build() {
            return new DescribeTairSkvDdbTableResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeTairSkvDdbTableResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTairSkvDdbTableResponseBody</p>
     */
    public static class GlobalSecondaryIndex extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GsiId")
        private String gsiId;

        @com.aliyun.core.annotation.NameInMap("IndexName")
        private String indexName;

        private GlobalSecondaryIndex(Builder builder) {
            this.gsiId = builder.gsiId;
            this.indexName = builder.indexName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GlobalSecondaryIndex create() {
            return builder().build();
        }

        /**
         * @return gsiId
         */
        public String getGsiId() {
            return this.gsiId;
        }

        /**
         * @return indexName
         */
        public String getIndexName() {
            return this.indexName;
        }

        public static final class Builder {
            private String gsiId; 
            private String indexName; 

            private Builder() {
            } 

            private Builder(GlobalSecondaryIndex model) {
                this.gsiId = model.gsiId;
                this.indexName = model.indexName;
            } 

            /**
             * GsiId.
             */
            public Builder gsiId(String gsiId) {
                this.gsiId = gsiId;
                return this;
            }

            /**
             * IndexName.
             */
            public Builder indexName(String indexName) {
                this.indexName = indexName;
                return this;
            }

            public GlobalSecondaryIndex build() {
                return new GlobalSecondaryIndex(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeTairSkvDdbTableResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTairSkvDdbTableResponseBody</p>
     */
    public static class GlobalSecondaryIndexList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GlobalSecondaryIndex")
        private java.util.List<GlobalSecondaryIndex> globalSecondaryIndex;

        private GlobalSecondaryIndexList(Builder builder) {
            this.globalSecondaryIndex = builder.globalSecondaryIndex;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GlobalSecondaryIndexList create() {
            return builder().build();
        }

        /**
         * @return globalSecondaryIndex
         */
        public java.util.List<GlobalSecondaryIndex> getGlobalSecondaryIndex() {
            return this.globalSecondaryIndex;
        }

        public static final class Builder {
            private java.util.List<GlobalSecondaryIndex> globalSecondaryIndex; 

            private Builder() {
            } 

            private Builder(GlobalSecondaryIndexList model) {
                this.globalSecondaryIndex = model.globalSecondaryIndex;
            } 

            /**
             * GlobalSecondaryIndex.
             */
            public Builder globalSecondaryIndex(java.util.List<GlobalSecondaryIndex> globalSecondaryIndex) {
                this.globalSecondaryIndex = globalSecondaryIndex;
                return this;
            }

            public GlobalSecondaryIndexList build() {
                return new GlobalSecondaryIndexList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeTairSkvDdbTableResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTairSkvDdbTableResponseBody</p>
     */
    public static class Table extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private Long bandwidth;

        @com.aliyun.core.annotation.NameInMap("Connections")
        private Long connections;

        @com.aliyun.core.annotation.NameInMap("GlobalSecondaryIndexList")
        private GlobalSecondaryIndexList globalSecondaryIndexList;

        @com.aliyun.core.annotation.NameInMap("TableId")
        private String tableId;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        private Table(Builder builder) {
            this.bandwidth = builder.bandwidth;
            this.connections = builder.connections;
            this.globalSecondaryIndexList = builder.globalSecondaryIndexList;
            this.tableId = builder.tableId;
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Table create() {
            return builder().build();
        }

        /**
         * @return bandwidth
         */
        public Long getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return connections
         */
        public Long getConnections() {
            return this.connections;
        }

        /**
         * @return globalSecondaryIndexList
         */
        public GlobalSecondaryIndexList getGlobalSecondaryIndexList() {
            return this.globalSecondaryIndexList;
        }

        /**
         * @return tableId
         */
        public String getTableId() {
            return this.tableId;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private Long bandwidth; 
            private Long connections; 
            private GlobalSecondaryIndexList globalSecondaryIndexList; 
            private String tableId; 
            private String tableName; 

            private Builder() {
            } 

            private Builder(Table model) {
                this.bandwidth = model.bandwidth;
                this.connections = model.connections;
                this.globalSecondaryIndexList = model.globalSecondaryIndexList;
                this.tableId = model.tableId;
                this.tableName = model.tableName;
            } 

            /**
             * Bandwidth.
             */
            public Builder bandwidth(Long bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * Connections.
             */
            public Builder connections(Long connections) {
                this.connections = connections;
                return this;
            }

            /**
             * GlobalSecondaryIndexList.
             */
            public Builder globalSecondaryIndexList(GlobalSecondaryIndexList globalSecondaryIndexList) {
                this.globalSecondaryIndexList = globalSecondaryIndexList;
                return this;
            }

            /**
             * TableId.
             */
            public Builder tableId(String tableId) {
                this.tableId = tableId;
                return this;
            }

            /**
             * TableName.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            public Table build() {
                return new Table(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeTairSkvDdbTableResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTairSkvDdbTableResponseBody</p>
     */
    public static class Tables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Table")
        private java.util.List<Table> table;

        private Tables(Builder builder) {
            this.table = builder.table;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tables create() {
            return builder().build();
        }

        /**
         * @return table
         */
        public java.util.List<Table> getTable() {
            return this.table;
        }

        public static final class Builder {
            private java.util.List<Table> table; 

            private Builder() {
            } 

            private Builder(Tables model) {
                this.table = model.table;
            } 

            /**
             * Table.
             */
            public Builder table(java.util.List<Table> table) {
                this.table = table;
                return this;
            }

            public Tables build() {
                return new Tables(this);
            } 

        } 

    }
}
