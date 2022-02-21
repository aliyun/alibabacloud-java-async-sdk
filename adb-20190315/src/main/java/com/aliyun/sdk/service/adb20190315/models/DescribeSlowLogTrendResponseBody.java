// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSlowLogTrendResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSlowLogTrendResponseBody</p>
 */
public class DescribeSlowLogTrendResponseBody extends TeaModel {
    @NameInMap("DBClusterId")
    private String DBClusterId;

    @NameInMap("EndTime")
    private String endTime;

    @NameInMap("Items")
    private Items items;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StartTime")
    private String startTime;

    private DescribeSlowLogTrendResponseBody(Builder builder) {
        this.DBClusterId = builder.DBClusterId;
        this.endTime = builder.endTime;
        this.items = builder.items;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSlowLogTrendResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return items
     */
    public Items getItems() {
        return this.items;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder {
        private String DBClusterId; 
        private String endTime; 
        private Items items; 
        private String requestId; 
        private String startTime; 

        /**
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * Items.
         */
        public Builder items(Items items) {
            this.items = items;
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
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeSlowLogTrendResponseBody build() {
            return new DescribeSlowLogTrendResponseBody(this);
        } 

    } 

    public static class SeriesItem extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Values")
        private String values;

        private SeriesItem(Builder builder) {
            this.name = builder.name;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SeriesItem create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return values
         */
        public String getValues() {
            return this.values;
        }

        public static final class Builder {
            private String name; 
            private String values; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Values.
             */
            public Builder values(String values) {
                this.values = values;
                return this;
            }

            public SeriesItem build() {
                return new SeriesItem(this);
            } 

        } 

    }
    public static class Series extends TeaModel {
        @NameInMap("SeriesItem")
        private java.util.List < SeriesItem> seriesItem;

        private Series(Builder builder) {
            this.seriesItem = builder.seriesItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Series create() {
            return builder().build();
        }

        /**
         * @return seriesItem
         */
        public java.util.List < SeriesItem> getSeriesItem() {
            return this.seriesItem;
        }

        public static final class Builder {
            private java.util.List < SeriesItem> seriesItem; 

            /**
             * SeriesItem.
             */
            public Builder seriesItem(java.util.List < SeriesItem> seriesItem) {
                this.seriesItem = seriesItem;
                return this;
            }

            public Series build() {
                return new Series(this);
            } 

        } 

    }
    public static class SlowLogTrendItem extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Series")
        private Series series;

        @NameInMap("Unit")
        private String unit;

        private SlowLogTrendItem(Builder builder) {
            this.key = builder.key;
            this.series = builder.series;
            this.unit = builder.unit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlowLogTrendItem create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return series
         */
        public Series getSeries() {
            return this.series;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        public static final class Builder {
            private String key; 
            private Series series; 
            private String unit; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Series.
             */
            public Builder series(Series series) {
                this.series = series;
                return this;
            }

            /**
             * Unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            public SlowLogTrendItem build() {
                return new SlowLogTrendItem(this);
            } 

        } 

    }
    public static class Items extends TeaModel {
        @NameInMap("SlowLogTrendItem")
        private java.util.List < SlowLogTrendItem> slowLogTrendItem;

        private Items(Builder builder) {
            this.slowLogTrendItem = builder.slowLogTrendItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return slowLogTrendItem
         */
        public java.util.List < SlowLogTrendItem> getSlowLogTrendItem() {
            return this.slowLogTrendItem;
        }

        public static final class Builder {
            private java.util.List < SlowLogTrendItem> slowLogTrendItem; 

            /**
             * SlowLogTrendItem.
             */
            public Builder slowLogTrendItem(java.util.List < SlowLogTrendItem> slowLogTrendItem) {
                this.slowLogTrendItem = slowLogTrendItem;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
