// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link QueryNetworkRttReportResponseBody} extends {@link TeaModel}
 *
 * <p>QueryNetworkRttReportResponseBody</p>
 */
public class QueryNetworkRttReportResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NetworkRttReportDataModel")
    private java.util.List<NetworkRttReportDataModel> networkRttReportDataModel;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryNetworkRttReportResponseBody(Builder builder) {
        this.code = builder.code;
        this.count = builder.count;
        this.message = builder.message;
        this.networkRttReportDataModel = builder.networkRttReportDataModel;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryNetworkRttReportResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return networkRttReportDataModel
     */
    public java.util.List<NetworkRttReportDataModel> getNetworkRttReportDataModel() {
        return this.networkRttReportDataModel;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Integer count; 
        private String message; 
        private java.util.List<NetworkRttReportDataModel> networkRttReportDataModel; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(QueryNetworkRttReportResponseBody model) {
            this.code = model.code;
            this.count = model.count;
            this.message = model.message;
            this.networkRttReportDataModel = model.networkRttReportDataModel;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The business status code. <code>200</code> indicates that the request is processed successfully. Other values indicate that the processing failed.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The total number of records that meet the query conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The description of the request processing result. If the request is successful, <code>success</code> is usually returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The list of network RTT report data.</p>
         */
        public Builder networkRttReportDataModel(java.util.List<NetworkRttReportDataModel> networkRttReportDataModel) {
            this.networkRttReportDataModel = networkRttReportDataModel;
            return this;
        }

        /**
         * <p>The page number corresponding to the current response.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page used in the current response.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The unique identifier of the request, which can be used to troubleshoot request issues.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryNetworkRttReportResponseBody build() {
            return new QueryNetworkRttReportResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryNetworkRttReportResponseBody} extends {@link TeaModel}
     *
     * <p>QueryNetworkRttReportResponseBody</p>
     */
    public static class NetworkRttReportDataModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppInstanceGroupId")
        private String appInstanceGroupId;

        @com.aliyun.core.annotation.NameInMap("LowRttUserCount")
        private Long lowRttUserCount;

        @com.aliyun.core.annotation.NameInMap("LowRttUserRate")
        private Double lowRttUserRate;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RttAvg")
        private Double rttAvg;

        @com.aliyun.core.annotation.NameInMap("RttMax")
        private Double rttMax;

        @com.aliyun.core.annotation.NameInMap("RttMin")
        private Double rttMin;

        @com.aliyun.core.annotation.NameInMap("StatEndDate")
        private String statEndDate;

        @com.aliyun.core.annotation.NameInMap("StatStartDate")
        private String statStartDate;

        @com.aliyun.core.annotation.NameInMap("TotalUserCount")
        private Long totalUserCount;

        private NetworkRttReportDataModel(Builder builder) {
            this.appInstanceGroupId = builder.appInstanceGroupId;
            this.lowRttUserCount = builder.lowRttUserCount;
            this.lowRttUserRate = builder.lowRttUserRate;
            this.regionId = builder.regionId;
            this.rttAvg = builder.rttAvg;
            this.rttMax = builder.rttMax;
            this.rttMin = builder.rttMin;
            this.statEndDate = builder.statEndDate;
            this.statStartDate = builder.statStartDate;
            this.totalUserCount = builder.totalUserCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkRttReportDataModel create() {
            return builder().build();
        }

        /**
         * @return appInstanceGroupId
         */
        public String getAppInstanceGroupId() {
            return this.appInstanceGroupId;
        }

        /**
         * @return lowRttUserCount
         */
        public Long getLowRttUserCount() {
            return this.lowRttUserCount;
        }

        /**
         * @return lowRttUserRate
         */
        public Double getLowRttUserRate() {
            return this.lowRttUserRate;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return rttAvg
         */
        public Double getRttAvg() {
            return this.rttAvg;
        }

        /**
         * @return rttMax
         */
        public Double getRttMax() {
            return this.rttMax;
        }

        /**
         * @return rttMin
         */
        public Double getRttMin() {
            return this.rttMin;
        }

        /**
         * @return statEndDate
         */
        public String getStatEndDate() {
            return this.statEndDate;
        }

        /**
         * @return statStartDate
         */
        public String getStatStartDate() {
            return this.statStartDate;
        }

        /**
         * @return totalUserCount
         */
        public Long getTotalUserCount() {
            return this.totalUserCount;
        }

        public static final class Builder {
            private String appInstanceGroupId; 
            private Long lowRttUserCount; 
            private Double lowRttUserRate; 
            private String regionId; 
            private Double rttAvg; 
            private Double rttMax; 
            private Double rttMin; 
            private String statEndDate; 
            private String statStartDate; 
            private Long totalUserCount; 

            private Builder() {
            } 

            private Builder(NetworkRttReportDataModel model) {
                this.appInstanceGroupId = model.appInstanceGroupId;
                this.lowRttUserCount = model.lowRttUserCount;
                this.lowRttUserRate = model.lowRttUserRate;
                this.regionId = model.regionId;
                this.rttAvg = model.rttAvg;
                this.rttMax = model.rttMax;
                this.rttMin = model.rttMin;
                this.statEndDate = model.statEndDate;
                this.statStartDate = model.statStartDate;
                this.totalUserCount = model.totalUserCount;
            } 

            /**
             * <p>The ID of the app instance group.</p>
             * 
             * <strong>example:</strong>
             * <p>aig-9ciijz60n4xsv****</p>
             */
            public Builder appInstanceGroupId(String appInstanceGroupId) {
                this.appInstanceGroupId = appInstanceGroupId;
                return this;
            }

            /**
             * <p>The number of users that meet the low-RTT criteria of the report. Unit: users. The current API operation does not return the specific threshold.</p>
             * 
             * <strong>example:</strong>
             * <p>85</p>
             */
            public Builder lowRttUserCount(Long lowRttUserCount) {
                this.lowRttUserCount = lowRttUserCount;
                return this;
            }

            /**
             * <p>The ratio of low-RTT users to the total number of users involved in the statistics. Valid values: 0 to 1. To obtain the percentage, multiply the value by 100.</p>
             * 
             * <strong>example:</strong>
             * <p>0.85</p>
             */
            public Builder lowRttUserRate(Double lowRttUserRate) {
                this.lowRttUserRate = lowRttUserRate;
                return this;
            }

            /**
             * <p>The ID of the business region to which the report data belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The average RTT of all users involved in the statistics. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>35.8</p>
             */
            public Builder rttAvg(Double rttAvg) {
                this.rttAvg = rttAvg;
                return this;
            }

            /**
             * <p>The maximum value among the average RTTs of all users. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>86.2</p>
             */
            public Builder rttMax(Double rttMax) {
                this.rttMax = rttMax;
                return this;
            }

            /**
             * <p>The minimum value among the average RTTs of all users. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>12.5</p>
             */
            public Builder rttMin(Double rttMin) {
                this.rttMin = rttMin;
                return this;
            }

            /**
             * <p>The end time of the statistical window. Format: <code>yyyy-MM-dd HH:mm:ss</code>. The string itself does not carry a time zone and is interpreted as Asia/Shanghai (UTC+8).</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-01 10:05:00</p>
             */
            public Builder statEndDate(String statEndDate) {
                this.statEndDate = statEndDate;
                return this;
            }

            /**
             * <p>The start time of the statistical window. Format: <code>yyyy-MM-dd HH:mm:ss</code>. The string itself does not carry a time zone and is interpreted as Asia/Shanghai (UTC+8).</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-01 10:00:00</p>
             */
            public Builder statStartDate(String statStartDate) {
                this.statStartDate = statStartDate;
                return this;
            }

            /**
             * <p>The total number of users involved in the RTT calculation for the current statistical window. Unit: users.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder totalUserCount(Long totalUserCount) {
                this.totalUserCount = totalUserCount;
                return this;
            }

            public NetworkRttReportDataModel build() {
                return new NetworkRttReportDataModel(this);
            } 

        } 

    }
}
