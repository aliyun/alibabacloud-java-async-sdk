// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBClusterSpaceSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBClusterSpaceSummaryResponseBody</p>
 */
public class DescribeDBClusterSpaceSummaryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDBClusterSpaceSummaryResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBClusterSpaceSummaryResponseBody create() {
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
         * The queried storage overview information.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBClusterSpaceSummaryResponseBody build() {
            return new DescribeDBClusterSpaceSummaryResponseBody(this);
        } 

    } 

    public static class ColdData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataSize")
        private Long dataSize;

        @com.aliyun.core.annotation.NameInMap("IndexSize")
        private Long indexSize;

        @com.aliyun.core.annotation.NameInMap("OtherSize")
        private Long otherSize;

        @com.aliyun.core.annotation.NameInMap("PrimaryKeyIndexSize")
        private Long primaryKeyIndexSize;

        @com.aliyun.core.annotation.NameInMap("TotalSize")
        private Long totalSize;

        private ColdData(Builder builder) {
            this.dataSize = builder.dataSize;
            this.indexSize = builder.indexSize;
            this.otherSize = builder.otherSize;
            this.primaryKeyIndexSize = builder.primaryKeyIndexSize;
            this.totalSize = builder.totalSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ColdData create() {
            return builder().build();
        }

        /**
         * @return dataSize
         */
        public Long getDataSize() {
            return this.dataSize;
        }

        /**
         * @return indexSize
         */
        public Long getIndexSize() {
            return this.indexSize;
        }

        /**
         * @return otherSize
         */
        public Long getOtherSize() {
            return this.otherSize;
        }

        /**
         * @return primaryKeyIndexSize
         */
        public Long getPrimaryKeyIndexSize() {
            return this.primaryKeyIndexSize;
        }

        /**
         * @return totalSize
         */
        public Long getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private Long dataSize; 
            private Long indexSize; 
            private Long otherSize; 
            private Long primaryKeyIndexSize; 
            private Long totalSize; 

            /**
             * The data size of table records. Unit: bytes.
             */
            public Builder dataSize(Long dataSize) {
                this.dataSize = dataSize;
                return this;
            }

            /**
             * The data size of regular indexes. Unit: bytes.
             */
            public Builder indexSize(Long indexSize) {
                this.indexSize = indexSize;
                return this;
            }

            /**
             * The data size of other data. Unit: bytes.
             */
            public Builder otherSize(Long otherSize) {
                this.otherSize = otherSize;
                return this;
            }

            /**
             * The data size of primary key indexes. Unit: bytes.
             */
            public Builder primaryKeyIndexSize(Long primaryKeyIndexSize) {
                this.primaryKeyIndexSize = primaryKeyIndexSize;
                return this;
            }

            /**
             * The cold data size. Unit: bytes.
             * <p>
             * 
             * >  Formula: Cold data size = Data size of table records + Data size of regular indexes + Data size of primary key indexes + Data size of other data.
             */
            public Builder totalSize(Long totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public ColdData build() {
                return new ColdData(this);
            } 

        } 

    }
    public static class DataGrowth extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DayGrowth")
        private Long dayGrowth;

        @com.aliyun.core.annotation.NameInMap("WeekGrowth")
        private Long weekGrowth;

        private DataGrowth(Builder builder) {
            this.dayGrowth = builder.dayGrowth;
            this.weekGrowth = builder.weekGrowth;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataGrowth create() {
            return builder().build();
        }

        /**
         * @return dayGrowth
         */
        public Long getDayGrowth() {
            return this.dayGrowth;
        }

        /**
         * @return weekGrowth
         */
        public Long getWeekGrowth() {
            return this.weekGrowth;
        }

        public static final class Builder {
            private Long dayGrowth; 
            private Long weekGrowth; 

            /**
             * The data growth within the last day. Unit: bytes.
             * <p>
             * 
             * >  Formula: Data growth within the last day = Current data size - Data size one day ago.
             */
            public Builder dayGrowth(Long dayGrowth) {
                this.dayGrowth = dayGrowth;
                return this;
            }

            /**
             * The daily data growth within the last seven days. Unit: bytes.
             * <p>
             * 
             * >  Formula: Daily data growth within the last seven days = (Current data size - Data size seven days ago)/7.
             */
            public Builder weekGrowth(Long weekGrowth) {
                this.weekGrowth = weekGrowth;
                return this;
            }

            public DataGrowth build() {
                return new DataGrowth(this);
            } 

        } 

    }
    public static class HotData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataSize")
        private Long dataSize;

        @com.aliyun.core.annotation.NameInMap("IndexSize")
        private Long indexSize;

        @com.aliyun.core.annotation.NameInMap("OtherSize")
        private Long otherSize;

        @com.aliyun.core.annotation.NameInMap("PrimaryKeyIndexSize")
        private Long primaryKeyIndexSize;

        @com.aliyun.core.annotation.NameInMap("TotalSize")
        private Long totalSize;

        private HotData(Builder builder) {
            this.dataSize = builder.dataSize;
            this.indexSize = builder.indexSize;
            this.otherSize = builder.otherSize;
            this.primaryKeyIndexSize = builder.primaryKeyIndexSize;
            this.totalSize = builder.totalSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HotData create() {
            return builder().build();
        }

        /**
         * @return dataSize
         */
        public Long getDataSize() {
            return this.dataSize;
        }

        /**
         * @return indexSize
         */
        public Long getIndexSize() {
            return this.indexSize;
        }

        /**
         * @return otherSize
         */
        public Long getOtherSize() {
            return this.otherSize;
        }

        /**
         * @return primaryKeyIndexSize
         */
        public Long getPrimaryKeyIndexSize() {
            return this.primaryKeyIndexSize;
        }

        /**
         * @return totalSize
         */
        public Long getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private Long dataSize; 
            private Long indexSize; 
            private Long otherSize; 
            private Long primaryKeyIndexSize; 
            private Long totalSize; 

            /**
             * The data size of table records. Unit: bytes.
             */
            public Builder dataSize(Long dataSize) {
                this.dataSize = dataSize;
                return this;
            }

            /**
             * The data size of regular indexes. Unit: bytes.
             */
            public Builder indexSize(Long indexSize) {
                this.indexSize = indexSize;
                return this;
            }

            /**
             * The data size of other data. Unit: bytes.
             */
            public Builder otherSize(Long otherSize) {
                this.otherSize = otherSize;
                return this;
            }

            /**
             * The data size of primary key indexes. Unit: bytes.
             */
            public Builder primaryKeyIndexSize(Long primaryKeyIndexSize) {
                this.primaryKeyIndexSize = primaryKeyIndexSize;
                return this;
            }

            /**
             * The hot data size. Unit: bytes.
             * <p>
             * 
             * >  Formula: Hot data size = Data size of table records + Data size of regular indexes + Data size of primary key indexes + Data size of other data.
             */
            public Builder totalSize(Long totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public HotData build() {
                return new HotData(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ColdData")
        private ColdData coldData;

        @com.aliyun.core.annotation.NameInMap("DataGrowth")
        private DataGrowth dataGrowth;

        @com.aliyun.core.annotation.NameInMap("HotData")
        private HotData hotData;

        @com.aliyun.core.annotation.NameInMap("TotalSize")
        private String totalSize;

        private Data(Builder builder) {
            this.coldData = builder.coldData;
            this.dataGrowth = builder.dataGrowth;
            this.hotData = builder.hotData;
            this.totalSize = builder.totalSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return coldData
         */
        public ColdData getColdData() {
            return this.coldData;
        }

        /**
         * @return dataGrowth
         */
        public DataGrowth getDataGrowth() {
            return this.dataGrowth;
        }

        /**
         * @return hotData
         */
        public HotData getHotData() {
            return this.hotData;
        }

        /**
         * @return totalSize
         */
        public String getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private ColdData coldData; 
            private DataGrowth dataGrowth; 
            private HotData hotData; 
            private String totalSize; 

            /**
             * The cold data.
             */
            public Builder coldData(ColdData coldData) {
                this.coldData = coldData;
                return this;
            }

            /**
             * The data growth.
             */
            public Builder dataGrowth(DataGrowth dataGrowth) {
                this.dataGrowth = dataGrowth;
                return this;
            }

            /**
             * The hot data.
             */
            public Builder hotData(HotData hotData) {
                this.hotData = hotData;
                return this;
            }

            /**
             * The total data size. Unit: bytes.
             * <p>
             * 
             * >  Formula: Total data size = Hot data size+ Cold data size.
             */
            public Builder totalSize(String totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
