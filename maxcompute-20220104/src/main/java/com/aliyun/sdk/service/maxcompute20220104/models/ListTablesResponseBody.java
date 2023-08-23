// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTablesResponseBody} extends {@link TeaModel}
 *
 * <p>ListTablesResponseBody</p>
 */
public class ListTablesResponseBody extends TeaModel {
    @NameInMap("data")
    private Data data;

    @NameInMap("requestId")
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
         * The returned data.
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

        public ListTablesResponseBody build() {
            return new ListTablesResponseBody(this);
        } 

    } 

    public static class Tables extends TeaModel {
        @NameInMap("creationTime")
        private Long creationTime;

        @NameInMap("name")
        private String name;

        @NameInMap("owner")
        private String owner;

        @NameInMap("schema")
        private String schema;

        @NameInMap("type")
        private String type;

        private Tables(Builder builder) {
            this.creationTime = builder.creationTime;
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
            private String name; 
            private String owner; 
            private String schema; 
            private String type; 

            /**
             * The time when the table was created.
             */
            public Builder creationTime(Long creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The name of the table.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The owner of the table.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * The schema of the table.
             */
            public Builder schema(String schema) {
                this.schema = schema;
                return this;
            }

            /**
             * The type of the table.
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
    public static class Data extends TeaModel {
        @NameInMap("marker")
        private String marker;

        @NameInMap("maxItem")
        private Integer maxItem;

        @NameInMap("tables")
        private java.util.List < Tables> tables;

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
        public java.util.List < Tables> getTables() {
            return this.tables;
        }

        public static final class Builder {
            private String marker; 
            private Integer maxItem; 
            private java.util.List < Tables> tables; 

            /**
             * Indicates the marker after which the returned list begins.
             */
            public Builder marker(String marker) {
                this.marker = marker;
                return this;
            }

            /**
             * The maximum number of entries returned per page.
             */
            public Builder maxItem(Integer maxItem) {
                this.maxItem = maxItem;
                return this;
            }

            /**
             * The information about tables.
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
