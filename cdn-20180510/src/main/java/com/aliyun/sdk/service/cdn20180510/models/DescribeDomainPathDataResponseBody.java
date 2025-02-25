// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDomainPathDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainPathDataResponseBody</p>
 */
public class DescribeDomainPathDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataInterval")
    private String dataInterval;

    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("PathDataPerInterval")
    private PathDataPerInterval pathDataPerInterval;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDomainPathDataResponseBody(Builder builder) {
        this.dataInterval = builder.dataInterval;
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.pathDataPerInterval = builder.pathDataPerInterval;
        this.startTime = builder.startTime;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainPathDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataInterval
     */
    public String getDataInterval() {
        return this.dataInterval;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return pathDataPerInterval
     */
    public PathDataPerInterval getPathDataPerInterval() {
        return this.pathDataPerInterval;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String dataInterval; 
        private String domainName; 
        private String endTime; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private PathDataPerInterval pathDataPerInterval; 
        private String startTime; 
        private Integer totalCount; 

        /**
         * <p>The time interval. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder dataInterval(String dataInterval) {
            this.dataInterval = dataInterval;
            return this;
        }

        /**
         * <p>The accelerated domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The end of the time range during which data was queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-09-30T17:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The page number of the returned page. Pages start from page <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>A list of bandwidth values collected at each time interval.</p>
         */
        public Builder pathDataPerInterval(PathDataPerInterval pathDataPerInterval) {
            this.pathDataPerInterval = pathDataPerInterval;
            return this;
        }

        /**
         * <p>The start of the time range during which data was queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-09-30T16:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDomainPathDataResponseBody build() {
            return new DescribeDomainPathDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDomainPathDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainPathDataResponseBody</p>
     */
    public static class UsageData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Acc")
        private Integer acc;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("Time")
        private String time;

        @com.aliyun.core.annotation.NameInMap("Traffic")
        private Integer traffic;

        private UsageData(Builder builder) {
            this.acc = builder.acc;
            this.path = builder.path;
            this.time = builder.time;
            this.traffic = builder.traffic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UsageData create() {
            return builder().build();
        }

        /**
         * @return acc
         */
        public Integer getAcc() {
            return this.acc;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        /**
         * @return traffic
         */
        public Integer getTraffic() {
            return this.traffic;
        }

        public static final class Builder {
            private Integer acc; 
            private String path; 
            private String time; 
            private Integer traffic; 

            /**
             * <p>The number of visits to the URL.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder acc(Integer acc) {
                this.acc = acc;
                return this;
            }

            /**
             * <p>The path.</p>
             * 
             * <strong>example:</strong>
             * <p>/path/</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The point in time.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-09-30T16:00:00Z</p>
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * <p>The amount of network traffic. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>346</p>
             */
            public Builder traffic(Integer traffic) {
                this.traffic = traffic;
                return this;
            }

            public UsageData build() {
                return new UsageData(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDomainPathDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainPathDataResponseBody</p>
     */
    public static class PathDataPerInterval extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UsageData")
        private java.util.List < UsageData> usageData;

        private PathDataPerInterval(Builder builder) {
            this.usageData = builder.usageData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PathDataPerInterval create() {
            return builder().build();
        }

        /**
         * @return usageData
         */
        public java.util.List < UsageData> getUsageData() {
            return this.usageData;
        }

        public static final class Builder {
            private java.util.List < UsageData> usageData; 

            /**
             * UsageData.
             */
            public Builder usageData(java.util.List < UsageData> usageData) {
                this.usageData = usageData;
                return this;
            }

            public PathDataPerInterval build() {
                return new PathDataPerInterval(this);
            } 

        } 

    }
}
