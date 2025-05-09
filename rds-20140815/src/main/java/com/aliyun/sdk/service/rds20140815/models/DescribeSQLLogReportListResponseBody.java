// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribeSQLLogReportListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSQLLogReportListResponseBody</p>
 */
public class DescribeSQLLogReportListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private Items items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private DescribeSQLLogReportListResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSQLLogReportListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalRecordCount
     */
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private Items items; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private Integer totalRecordCount; 

        private Builder() {
        } 

        private Builder(DescribeSQLLogReportListResponseBody model) {
            this.items = model.items;
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.requestId = model.requestId;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * <p>An array that consists of SQL log reports.</p>
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
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of SQL log reports on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>08A3B71B-FE08-4B03-974F-CC7EA6DB1828</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeSQLLogReportListResponseBody build() {
            return new DescribeSQLLogReportListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSQLLogReportListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSQLLogReportListResponseBody</p>
     */
    public static class LatencyTopNItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvgLatency")
        private Long avgLatency;

        @com.aliyun.core.annotation.NameInMap("SQLExecuteTimes")
        private Long SQLExecuteTimes;

        @com.aliyun.core.annotation.NameInMap("SQLText")
        private String SQLText;

        private LatencyTopNItem(Builder builder) {
            this.avgLatency = builder.avgLatency;
            this.SQLExecuteTimes = builder.SQLExecuteTimes;
            this.SQLText = builder.SQLText;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LatencyTopNItem create() {
            return builder().build();
        }

        /**
         * @return avgLatency
         */
        public Long getAvgLatency() {
            return this.avgLatency;
        }

        /**
         * @return SQLExecuteTimes
         */
        public Long getSQLExecuteTimes() {
            return this.SQLExecuteTimes;
        }

        /**
         * @return SQLText
         */
        public String getSQLText() {
            return this.SQLText;
        }

        public static final class Builder {
            private Long avgLatency; 
            private Long SQLExecuteTimes; 
            private String SQLText; 

            private Builder() {
            } 

            private Builder(LatencyTopNItem model) {
                this.avgLatency = model.avgLatency;
                this.SQLExecuteTimes = model.SQLExecuteTimes;
                this.SQLText = model.SQLText;
            } 

            /**
             * <p>The average time that is required to execute the SQL statement. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder avgLatency(Long avgLatency) {
                this.avgLatency = avgLatency;
                return this;
            }

            /**
             * <p>The number of times that the SQL statement is executed.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder SQLExecuteTimes(Long SQLExecuteTimes) {
                this.SQLExecuteTimes = SQLExecuteTimes;
                return this;
            }

            /**
             * <p>The SQL statement.</p>
             * <blockquote>
             * <p> Only the first 128 characters of the SQL statement are returned. In addition, only the SQL statements that take more than 100 ms to execute are returned.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>SELECT * FROM table_name;</p>
             */
            public Builder SQLText(String SQLText) {
                this.SQLText = SQLText;
                return this;
            }

            public LatencyTopNItem build() {
                return new LatencyTopNItem(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSQLLogReportListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSQLLogReportListResponseBody</p>
     */
    public static class LatencyTopNItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LatencyTopNItem")
        private java.util.List<LatencyTopNItem> latencyTopNItem;

        private LatencyTopNItems(Builder builder) {
            this.latencyTopNItem = builder.latencyTopNItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LatencyTopNItems create() {
            return builder().build();
        }

        /**
         * @return latencyTopNItem
         */
        public java.util.List<LatencyTopNItem> getLatencyTopNItem() {
            return this.latencyTopNItem;
        }

        public static final class Builder {
            private java.util.List<LatencyTopNItem> latencyTopNItem; 

            private Builder() {
            } 

            private Builder(LatencyTopNItems model) {
                this.latencyTopNItem = model.latencyTopNItem;
            } 

            /**
             * LatencyTopNItem.
             */
            public Builder latencyTopNItem(java.util.List<LatencyTopNItem> latencyTopNItem) {
                this.latencyTopNItem = latencyTopNItem;
                return this;
            }

            public LatencyTopNItems build() {
                return new LatencyTopNItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSQLLogReportListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSQLLogReportListResponseBody</p>
     */
    public static class QPSTopNItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SQLExecuteTimes")
        private Long SQLExecuteTimes;

        @com.aliyun.core.annotation.NameInMap("SQLText")
        private String SQLText;

        private QPSTopNItem(Builder builder) {
            this.SQLExecuteTimes = builder.SQLExecuteTimes;
            this.SQLText = builder.SQLText;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QPSTopNItem create() {
            return builder().build();
        }

        /**
         * @return SQLExecuteTimes
         */
        public Long getSQLExecuteTimes() {
            return this.SQLExecuteTimes;
        }

        /**
         * @return SQLText
         */
        public String getSQLText() {
            return this.SQLText;
        }

        public static final class Builder {
            private Long SQLExecuteTimes; 
            private String SQLText; 

            private Builder() {
            } 

            private Builder(QPSTopNItem model) {
                this.SQLExecuteTimes = model.SQLExecuteTimes;
                this.SQLText = model.SQLText;
            } 

            /**
             * <p>The number of times that the SQL statement is executed.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder SQLExecuteTimes(Long SQLExecuteTimes) {
                this.SQLExecuteTimes = SQLExecuteTimes;
                return this;
            }

            /**
             * <p>The SQL statement.</p>
             * <blockquote>
             * <p> Only the first 128 characters of the SQL statement are returned. In addition, only the SQL statements that take more than 5 ms to execute are returned.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>SELECT * FROM table_name;</p>
             */
            public Builder SQLText(String SQLText) {
                this.SQLText = SQLText;
                return this;
            }

            public QPSTopNItem build() {
                return new QPSTopNItem(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSQLLogReportListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSQLLogReportListResponseBody</p>
     */
    public static class QPSTopNItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("QPSTopNItem")
        private java.util.List<QPSTopNItem> QPSTopNItem;

        private QPSTopNItems(Builder builder) {
            this.QPSTopNItem = builder.QPSTopNItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QPSTopNItems create() {
            return builder().build();
        }

        /**
         * @return QPSTopNItem
         */
        public java.util.List<QPSTopNItem> getQPSTopNItem() {
            return this.QPSTopNItem;
        }

        public static final class Builder {
            private java.util.List<QPSTopNItem> QPSTopNItem; 

            private Builder() {
            } 

            private Builder(QPSTopNItems model) {
                this.QPSTopNItem = model.QPSTopNItem;
            } 

            /**
             * QPSTopNItem.
             */
            public Builder QPSTopNItem(java.util.List<QPSTopNItem> QPSTopNItem) {
                this.QPSTopNItem = QPSTopNItem;
                return this;
            }

            public QPSTopNItems build() {
                return new QPSTopNItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSQLLogReportListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSQLLogReportListResponseBody</p>
     */
    public static class Item extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LatencyTopNItems")
        private LatencyTopNItems latencyTopNItems;

        @com.aliyun.core.annotation.NameInMap("QPSTopNItems")
        private QPSTopNItems QPSTopNItems;

        @com.aliyun.core.annotation.NameInMap("ReportTime")
        private String reportTime;

        private Item(Builder builder) {
            this.latencyTopNItems = builder.latencyTopNItems;
            this.QPSTopNItems = builder.QPSTopNItems;
            this.reportTime = builder.reportTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Item create() {
            return builder().build();
        }

        /**
         * @return latencyTopNItems
         */
        public LatencyTopNItems getLatencyTopNItems() {
            return this.latencyTopNItems;
        }

        /**
         * @return QPSTopNItems
         */
        public QPSTopNItems getQPSTopNItems() {
            return this.QPSTopNItems;
        }

        /**
         * @return reportTime
         */
        public String getReportTime() {
            return this.reportTime;
        }

        public static final class Builder {
            private LatencyTopNItems latencyTopNItems; 
            private QPSTopNItems QPSTopNItems; 
            private String reportTime; 

            private Builder() {
            } 

            private Builder(Item model) {
                this.latencyTopNItems = model.latencyTopNItems;
                this.QPSTopNItems = model.QPSTopNItems;
                this.reportTime = model.reportTime;
            } 

            /**
             * <p>An array that consists of SQL statements executed with the highest latency.</p>
             */
            public Builder latencyTopNItems(LatencyTopNItems latencyTopNItems) {
                this.latencyTopNItems = latencyTopNItems;
                return this;
            }

            /**
             * <p>An array that consists of SQL statements executed the most frequently.</p>
             */
            public Builder QPSTopNItems(QPSTopNItems QPSTopNItems) {
                this.QPSTopNItems = QPSTopNItems;
                return this;
            }

            /**
             * <p>The time when the report was generated. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-03-27T16:00:00Z</p>
             */
            public Builder reportTime(String reportTime) {
                this.reportTime = reportTime;
                return this;
            }

            public Item build() {
                return new Item(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSQLLogReportListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSQLLogReportListResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Item")
        private java.util.List<Item> item;

        private Items(Builder builder) {
            this.item = builder.item;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return item
         */
        public java.util.List<Item> getItem() {
            return this.item;
        }

        public static final class Builder {
            private java.util.List<Item> item; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.item = model.item;
            } 

            /**
             * Item.
             */
            public Builder item(java.util.List<Item> item) {
                this.item = item;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
