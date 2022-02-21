// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSQLLogReportListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSQLLogReportListResponseBody</p>
 */
public class DescribeSQLLogReportListResponseBody extends TeaModel {
    @NameInMap("Items")
    private Items items;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalRecordCount")
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
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageRecordCount.
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
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
         * TotalRecordCount.
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeSQLLogReportListResponseBody build() {
            return new DescribeSQLLogReportListResponseBody(this);
        } 

    } 

    public static class LatencyTopNItem extends TeaModel {
        @NameInMap("AvgLatency")
        private Long avgLatency;

        @NameInMap("SQLExecuteTimes")
        private Long SQLExecuteTimes;

        @NameInMap("SQLText")
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

            /**
             * AvgLatency.
             */
            public Builder avgLatency(Long avgLatency) {
                this.avgLatency = avgLatency;
                return this;
            }

            /**
             * SQLExecuteTimes.
             */
            public Builder SQLExecuteTimes(Long SQLExecuteTimes) {
                this.SQLExecuteTimes = SQLExecuteTimes;
                return this;
            }

            /**
             * SQLText.
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
    public static class LatencyTopNItems extends TeaModel {
        @NameInMap("LatencyTopNItem")
        private java.util.List < LatencyTopNItem> latencyTopNItem;

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
        public java.util.List < LatencyTopNItem> getLatencyTopNItem() {
            return this.latencyTopNItem;
        }

        public static final class Builder {
            private java.util.List < LatencyTopNItem> latencyTopNItem; 

            /**
             * LatencyTopNItem.
             */
            public Builder latencyTopNItem(java.util.List < LatencyTopNItem> latencyTopNItem) {
                this.latencyTopNItem = latencyTopNItem;
                return this;
            }

            public LatencyTopNItems build() {
                return new LatencyTopNItems(this);
            } 

        } 

    }
    public static class QPSTopNItem extends TeaModel {
        @NameInMap("SQLExecuteTimes")
        private Long SQLExecuteTimes;

        @NameInMap("SQLText")
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

            /**
             * SQLExecuteTimes.
             */
            public Builder SQLExecuteTimes(Long SQLExecuteTimes) {
                this.SQLExecuteTimes = SQLExecuteTimes;
                return this;
            }

            /**
             * SQLText.
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
    public static class QPSTopNItems extends TeaModel {
        @NameInMap("QPSTopNItem")
        private java.util.List < QPSTopNItem> QPSTopNItem;

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
        public java.util.List < QPSTopNItem> getQPSTopNItem() {
            return this.QPSTopNItem;
        }

        public static final class Builder {
            private java.util.List < QPSTopNItem> QPSTopNItem; 

            /**
             * QPSTopNItem.
             */
            public Builder QPSTopNItem(java.util.List < QPSTopNItem> QPSTopNItem) {
                this.QPSTopNItem = QPSTopNItem;
                return this;
            }

            public QPSTopNItems build() {
                return new QPSTopNItems(this);
            } 

        } 

    }
    public static class Item extends TeaModel {
        @NameInMap("LatencyTopNItems")
        private LatencyTopNItems latencyTopNItems;

        @NameInMap("QPSTopNItems")
        private QPSTopNItems QPSTopNItems;

        @NameInMap("ReportTime")
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

            /**
             * LatencyTopNItems.
             */
            public Builder latencyTopNItems(LatencyTopNItems latencyTopNItems) {
                this.latencyTopNItems = latencyTopNItems;
                return this;
            }

            /**
             * QPSTopNItems.
             */
            public Builder QPSTopNItems(QPSTopNItems QPSTopNItems) {
                this.QPSTopNItems = QPSTopNItems;
                return this;
            }

            /**
             * ReportTime.
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
    public static class Items extends TeaModel {
        @NameInMap("Item")
        private java.util.List < Item> item;

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
        public java.util.List < Item> getItem() {
            return this.item;
        }

        public static final class Builder {
            private java.util.List < Item> item; 

            /**
             * Item.
             */
            public Builder item(java.util.List < Item> item) {
                this.item = item;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
