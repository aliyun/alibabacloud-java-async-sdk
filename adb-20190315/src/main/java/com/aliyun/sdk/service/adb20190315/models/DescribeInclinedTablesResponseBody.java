// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

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
 * {@link DescribeInclinedTablesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInclinedTablesResponseBody</p>
 */
public class DescribeInclinedTablesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DetectionItems")
    private java.util.List<DetectionItems> detectionItems;

    @com.aliyun.core.annotation.NameInMap("Items")
    private Items items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private DescribeInclinedTablesResponseBody(Builder builder) {
        this.detectionItems = builder.detectionItems;
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return detectionItems
     */
    public java.util.List<DetectionItems> getDetectionItems() {
        return this.detectionItems;
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
        private java.util.List<DetectionItems> detectionItems; 
        private Items items; 
        private String pageNumber; 
        private String pageSize; 
        private String requestId; 
        private String totalCount; 

        private Builder() {
        } 

        private Builder(DescribeInclinedTablesResponseBody model) {
            this.detectionItems = model.detectionItems;
            this.items = model.items;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The queried detection items and detection results.</p>
         */
        public Builder detectionItems(java.util.List<DetectionItems> detectionItems) {
            this.detectionItems = detectionItems;
            return this;
        }

        /**
         * <p>The queried tables.</p>
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeInclinedTablesResponseBody build() {
            return new DescribeInclinedTablesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInclinedTablesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInclinedTablesResponseBody</p>
     */
    public static class DetectionItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private DetectionItems(Builder builder) {
            this.message = builder.message;
            this.name = builder.name;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DetectionItems create() {
            return builder().build();
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String message; 
            private String name; 
            private String status; 

            private Builder() {
            } 

            private Builder(DetectionItems model) {
                this.message = model.message;
                this.name = model.name;
                this.status = model.status;
            } 

            /**
             * <p>The message of the detection result.</p>
             * 
             * <strong>example:</strong>
             * <p>There are a total of 10 tables with an excessive number of primary keys.</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The name of the detection item.</p>
             * 
             * <strong>example:</strong>
             * <p>Excessive primary key fields</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The severity level of the detection result. Valid values:</p>
             * <ul>
             * <li>NORMAL</li>
             * <li>WARNING</li>
             * <li>CRITICAL</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>WARNING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public DetectionItems build() {
                return new DetectionItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInclinedTablesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInclinedTablesResponseBody</p>
     */
    public static class Table extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IsIncline")
        private String isIncline;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RowCount")
        private Long rowCount;

        @com.aliyun.core.annotation.NameInMap("Schema")
        private String schema;

        @com.aliyun.core.annotation.NameInMap("Size")
        private String size;

        @com.aliyun.core.annotation.NameInMap("SpaceRatio")
        private Double spaceRatio;

        @com.aliyun.core.annotation.NameInMap("TotalSize")
        private Long totalSize;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Table(Builder builder) {
            this.isIncline = builder.isIncline;
            this.name = builder.name;
            this.rowCount = builder.rowCount;
            this.schema = builder.schema;
            this.size = builder.size;
            this.spaceRatio = builder.spaceRatio;
            this.totalSize = builder.totalSize;
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
        public String getIsIncline() {
            return this.isIncline;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return rowCount
         */
        public Long getRowCount() {
            return this.rowCount;
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
        public String getSize() {
            return this.size;
        }

        /**
         * @return spaceRatio
         */
        public Double getSpaceRatio() {
            return this.spaceRatio;
        }

        /**
         * @return totalSize
         */
        public Long getTotalSize() {
            return this.totalSize;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String isIncline; 
            private String name; 
            private Long rowCount; 
            private String schema; 
            private String size; 
            private Double spaceRatio; 
            private Long totalSize; 
            private String type; 

            private Builder() {
            } 

            private Builder(Table model) {
                this.isIncline = model.isIncline;
                this.name = model.name;
                this.rowCount = model.rowCount;
                this.schema = model.schema;
                this.size = model.size;
                this.spaceRatio = model.spaceRatio;
                this.totalSize = model.totalSize;
                this.type = model.type;
            } 

            /**
             * <p>Indicates whether data is skewed in the table.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isIncline(String isIncline) {
                this.isIncline = isIncline;
                return this;
            }

            /**
             * <p>The name of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>ff</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The number of rows in the table.</p>
             * 
             * <strong>example:</strong>
             * <p>2565</p>
             */
            public Builder rowCount(Long rowCount) {
                this.rowCount = rowCount;
                return this;
            }

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>adm_analyze</p>
             */
            public Builder schema(String schema) {
                this.schema = schema;
                return this;
            }

            /**
             * <p>The number of rows in the table.</p>
             * 
             * <strong>example:</strong>
             * <p>2416527</p>
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The percentage of the table size.</p>
             * 
             * <strong>example:</strong>
             * <p>89</p>
             */
            public Builder spaceRatio(Double spaceRatio) {
                this.spaceRatio = spaceRatio;
                return this;
            }

            /**
             * <p>The total data size of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>65</p>
             */
            public Builder totalSize(Long totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            /**
             * <p>The column type.</p>
             * 
             * <strong>example:</strong>
             * <p>executor</p>
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
    /**
     * 
     * {@link DescribeInclinedTablesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInclinedTablesResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Table")
        private java.util.List<Table> table;

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
        public java.util.List<Table> getTable() {
            return this.table;
        }

        public static final class Builder {
            private java.util.List<Table> table; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.table = model.table;
            } 

            /**
             * <p>The queried table.</p>
             */
            public Builder table(java.util.List<Table> table) {
                this.table = table;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
