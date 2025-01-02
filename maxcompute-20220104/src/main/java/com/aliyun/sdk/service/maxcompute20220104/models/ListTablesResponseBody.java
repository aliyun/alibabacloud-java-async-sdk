// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link ListTablesResponseBody} extends {@link TeaModel}
 *
 * <p>ListTablesResponseBody</p>
 */
public class ListTablesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListTablesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTablesResponseBody create() {
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

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0a06dd4516687375802853481ec9fd</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListTablesResponseBody build() {
            return new ListTablesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTablesResponseBody} extends {@link TeaModel}
     *
     * <p>ListTablesResponseBody</p>
     */
    public static class Tables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("creationTime")
        private Long creationTime;

        @com.aliyun.core.annotation.NameInMap("displayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("schema")
        private String schema;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Tables(Builder builder) {
            this.creationTime = builder.creationTime;
            this.displayName = builder.displayName;
            this.name = builder.name;
            this.owner = builder.owner;
            this.schema = builder.schema;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tables create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public Long getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return schema
         */
        public String getSchema() {
            return this.schema;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long creationTime; 
            private String displayName; 
            private String name; 
            private String owner; 
            private String schema; 
            private String type; 

            /**
             * <p>The time when the table was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-17T07:07:47Z</p>
             */
            public Builder creationTime(Long creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The display name of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>sale_detail</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The name of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>dim_odps</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The owner of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>1887853961230110</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The schema to which the table belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder schema(String schema) {
                this.schema = schema;
                return this;
            }

            /**
             * <p>The type of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>internal</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Tables build() {
                return new Tables(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTablesResponseBody} extends {@link TeaModel}
     *
     * <p>ListTablesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("marker")
        private String marker;

        @com.aliyun.core.annotation.NameInMap("maxItem")
        private Integer maxItem;

        @com.aliyun.core.annotation.NameInMap("tables")
        private java.util.List<Tables> tables;

        private Data(Builder builder) {
            this.marker = builder.marker;
            this.maxItem = builder.maxItem;
            this.tables = builder.tables;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return marker
         */
        public String getMarker() {
            return this.marker;
        }

        /**
         * @return maxItem
         */
        public Integer getMaxItem() {
            return this.maxItem;
        }

        /**
         * @return tables
         */
        public java.util.List<Tables> getTables() {
            return this.tables;
        }

        public static final class Builder {
            private String marker; 
            private Integer maxItem; 
            private java.util.List<Tables> tables; 

            /**
             * <p>Indicates the marker after which the returned list begins.</p>
             * 
             * <strong>example:</strong>
             * <p>cHlvZHBzX3VkZl8xMDExNV8xNDU3NDI4NDkzKg==</p>
             */
            public Builder marker(String marker) {
                this.marker = marker;
                return this;
            }

            /**
             * <p>The maximum number of entries returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder maxItem(Integer maxItem) {
                this.maxItem = maxItem;
                return this;
            }

            /**
             * <p>The information about tables.</p>
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
