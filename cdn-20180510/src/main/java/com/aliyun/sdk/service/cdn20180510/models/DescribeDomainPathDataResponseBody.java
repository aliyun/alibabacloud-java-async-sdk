// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainPathDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainPathDataResponseBody</p>
 */
public class DescribeDomainPathDataResponseBody extends TeaModel {
    @NameInMap("DataInterval")
    private String dataInterval;

    @NameInMap("DomainName")
    private String domainName;

    @NameInMap("EndTime")
    private String endTime;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("PathDataPerInterval")
    private PathDataPerInterval pathDataPerInterval;

    @NameInMap("StartTime")
    private String startTime;

    @NameInMap("TotalCount")
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
         * DataInterval.
         */
        public Builder dataInterval(String dataInterval) {
            this.dataInterval = dataInterval;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
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
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PathDataPerInterval.
         */
        public Builder pathDataPerInterval(PathDataPerInterval pathDataPerInterval) {
            this.pathDataPerInterval = pathDataPerInterval;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDomainPathDataResponseBody build() {
            return new DescribeDomainPathDataResponseBody(this);
        } 

    } 

    public static class UsageData extends TeaModel {
        @NameInMap("Acc")
        private Integer acc;

        @NameInMap("Path")
        private String path;

        @NameInMap("Time")
        private String time;

        @NameInMap("Traffic")
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
             * Acc.
             */
            public Builder acc(Integer acc) {
                this.acc = acc;
                return this;
            }

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * Traffic.
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
    public static class PathDataPerInterval extends TeaModel {
        @NameInMap("UsageData")
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
