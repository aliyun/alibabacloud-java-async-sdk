// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInclinedTablesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInclinedTablesResponseBody</p>
 */
public class DescribeInclinedTablesResponseBody extends TeaModel {
    @NameInMap("Items")
    private Items items;

    @NameInMap("PageNumber")
    private String pageNumber;

    @NameInMap("PageSize")
    private String pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private String totalCount;

    private DescribeInclinedTablesResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInclinedTablesResponseBody create() {
        return builder().build();
    }

    /**
     * @return items
     */
    public Items getItems() {
        return this.items;
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
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Items items; 
        private String pageNumber; 
        private String pageSize; 
        private String requestId; 
        private String totalCount; 

        /**
         * Items.
         */
        public Builder items(Items items) {
            this.items = items;
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
         * TotalCount.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeInclinedTablesResponseBody build() {
            return new DescribeInclinedTablesResponseBody(this);
        } 

    } 

    public static class Table extends TeaModel {
        @NameInMap("IsIncline")
        private Boolean isIncline;

        @NameInMap("Name")
        private String name;

        @NameInMap("Schema")
        private String schema;

        @NameInMap("Size")
        private Long size;

        @NameInMap("Type")
        private String type;

        private Table(Builder builder) {
            this.isIncline = builder.isIncline;
            this.name = builder.name;
            this.schema = builder.schema;
            this.size = builder.size;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Table create() {
            return builder().build();
        }

        /**
         * @return isIncline
         */
        public Boolean getIsIncline() {
            return this.isIncline;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return schema
         */
        public String getSchema() {
            return this.schema;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Boolean isIncline; 
            private String name; 
            private String schema; 
            private Long size; 
            private String type; 

            /**
             * IsIncline.
             */
            public Builder isIncline(Boolean isIncline) {
                this.isIncline = isIncline;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
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
             * Size.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Table build() {
                return new Table(this);
            } 

        } 

    }
    public static class Items extends TeaModel {
        @NameInMap("Table")
        private java.util.List < Table> table;

        private Items(Builder builder) {
            this.table = builder.table;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return table
         */
        public java.util.List < Table> getTable() {
            return this.table;
        }

        public static final class Builder {
            private java.util.List < Table> table; 

            /**
             * Table.
             */
            public Builder table(java.util.List < Table> table) {
                this.table = table;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
