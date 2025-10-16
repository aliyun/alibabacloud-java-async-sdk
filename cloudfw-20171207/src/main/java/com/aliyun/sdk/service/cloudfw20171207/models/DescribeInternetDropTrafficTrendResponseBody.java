// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeInternetDropTrafficTrendResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInternetDropTrafficTrendResponseBody</p>
 */
public class DescribeInternetDropTrafficTrendResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataList")
    private java.util.List<DataList> dataList;

    @com.aliyun.core.annotation.NameInMap("DropSessionMax")
    private Long dropSessionMax;

    @com.aliyun.core.annotation.NameInMap("RatioAverage")
    private String ratioAverage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RingRatioAverage")
    private String ringRatioAverage;

    private DescribeInternetDropTrafficTrendResponseBody(Builder builder) {
        this.dataList = builder.dataList;
        this.dropSessionMax = builder.dropSessionMax;
        this.ratioAverage = builder.ratioAverage;
        this.requestId = builder.requestId;
        this.ringRatioAverage = builder.ringRatioAverage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInternetDropTrafficTrendResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataList
     */
    public java.util.List<DataList> getDataList() {
        return this.dataList;
    }

    /**
     * @return dropSessionMax
     */
    public Long getDropSessionMax() {
        return this.dropSessionMax;
    }

    /**
     * @return ratioAverage
     */
    public String getRatioAverage() {
        return this.ratioAverage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return ringRatioAverage
     */
    public String getRingRatioAverage() {
        return this.ringRatioAverage;
    }

    public static final class Builder {
        private java.util.List<DataList> dataList; 
        private Long dropSessionMax; 
        private String ratioAverage; 
        private String requestId; 
        private String ringRatioAverage; 

        private Builder() {
        } 

        private Builder(DescribeInternetDropTrafficTrendResponseBody model) {
            this.dataList = model.dataList;
            this.dropSessionMax = model.dropSessionMax;
            this.ratioAverage = model.ratioAverage;
            this.requestId = model.requestId;
            this.ringRatioAverage = model.ringRatioAverage;
        } 

        /**
         * DataList.
         */
        public Builder dataList(java.util.List<DataList> dataList) {
            this.dataList = dataList;
            return this;
        }

        /**
         * DropSessionMax.
         */
        public Builder dropSessionMax(Long dropSessionMax) {
            this.dropSessionMax = dropSessionMax;
            return this;
        }

        /**
         * RatioAverage.
         */
        public Builder ratioAverage(String ratioAverage) {
            this.ratioAverage = ratioAverage;
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
         * RingRatioAverage.
         */
        public Builder ringRatioAverage(String ringRatioAverage) {
            this.ringRatioAverage = ringRatioAverage;
            return this;
        }

        public DescribeInternetDropTrafficTrendResponseBody build() {
            return new DescribeInternetDropTrafficTrendResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInternetDropTrafficTrendResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInternetDropTrafficTrendResponseBody</p>
     */
    public static class DataList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AclDrop")
        private Long aclDrop;

        @com.aliyun.core.annotation.NameInMap("DataTime")
        private String dataTime;

        @com.aliyun.core.annotation.NameInMap("DropRatio")
        private String dropRatio;

        @com.aliyun.core.annotation.NameInMap("DropRing")
        private Long dropRing;

        @com.aliyun.core.annotation.NameInMap("DropRingRatio")
        private String dropRingRatio;

        @com.aliyun.core.annotation.NameInMap("DropSession")
        private Long dropSession;

        @com.aliyun.core.annotation.NameInMap("IpsDrop")
        private Long ipsDrop;

        @com.aliyun.core.annotation.NameInMap("RingDataTime")
        private String ringDataTime;

        @com.aliyun.core.annotation.NameInMap("RingTime")
        private Long ringTime;

        @com.aliyun.core.annotation.NameInMap("Time")
        private Long time;

        @com.aliyun.core.annotation.NameInMap("TotalSession")
        private Long totalSession;

        private DataList(Builder builder) {
            this.aclDrop = builder.aclDrop;
            this.dataTime = builder.dataTime;
            this.dropRatio = builder.dropRatio;
            this.dropRing = builder.dropRing;
            this.dropRingRatio = builder.dropRingRatio;
            this.dropSession = builder.dropSession;
            this.ipsDrop = builder.ipsDrop;
            this.ringDataTime = builder.ringDataTime;
            this.ringTime = builder.ringTime;
            this.time = builder.time;
            this.totalSession = builder.totalSession;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataList create() {
            return builder().build();
        }

        /**
         * @return aclDrop
         */
        public Long getAclDrop() {
            return this.aclDrop;
        }

        /**
         * @return dataTime
         */
        public String getDataTime() {
            return this.dataTime;
        }

        /**
         * @return dropRatio
         */
        public String getDropRatio() {
            return this.dropRatio;
        }

        /**
         * @return dropRing
         */
        public Long getDropRing() {
            return this.dropRing;
        }

        /**
         * @return dropRingRatio
         */
        public String getDropRingRatio() {
            return this.dropRingRatio;
        }

        /**
         * @return dropSession
         */
        public Long getDropSession() {
            return this.dropSession;
        }

        /**
         * @return ipsDrop
         */
        public Long getIpsDrop() {
            return this.ipsDrop;
        }

        /**
         * @return ringDataTime
         */
        public String getRingDataTime() {
            return this.ringDataTime;
        }

        /**
         * @return ringTime
         */
        public Long getRingTime() {
            return this.ringTime;
        }

        /**
         * @return time
         */
        public Long getTime() {
            return this.time;
        }

        /**
         * @return totalSession
         */
        public Long getTotalSession() {
            return this.totalSession;
        }

        public static final class Builder {
            private Long aclDrop; 
            private String dataTime; 
            private String dropRatio; 
            private Long dropRing; 
            private String dropRingRatio; 
            private Long dropSession; 
            private Long ipsDrop; 
            private String ringDataTime; 
            private Long ringTime; 
            private Long time; 
            private Long totalSession; 

            private Builder() {
            } 

            private Builder(DataList model) {
                this.aclDrop = model.aclDrop;
                this.dataTime = model.dataTime;
                this.dropRatio = model.dropRatio;
                this.dropRing = model.dropRing;
                this.dropRingRatio = model.dropRingRatio;
                this.dropSession = model.dropSession;
                this.ipsDrop = model.ipsDrop;
                this.ringDataTime = model.ringDataTime;
                this.ringTime = model.ringTime;
                this.time = model.time;
                this.totalSession = model.totalSession;
            } 

            /**
             * AclDrop.
             */
            public Builder aclDrop(Long aclDrop) {
                this.aclDrop = aclDrop;
                return this;
            }

            /**
             * DataTime.
             */
            public Builder dataTime(String dataTime) {
                this.dataTime = dataTime;
                return this;
            }

            /**
             * DropRatio.
             */
            public Builder dropRatio(String dropRatio) {
                this.dropRatio = dropRatio;
                return this;
            }

            /**
             * DropRing.
             */
            public Builder dropRing(Long dropRing) {
                this.dropRing = dropRing;
                return this;
            }

            /**
             * DropRingRatio.
             */
            public Builder dropRingRatio(String dropRingRatio) {
                this.dropRingRatio = dropRingRatio;
                return this;
            }

            /**
             * DropSession.
             */
            public Builder dropSession(Long dropSession) {
                this.dropSession = dropSession;
                return this;
            }

            /**
             * IpsDrop.
             */
            public Builder ipsDrop(Long ipsDrop) {
                this.ipsDrop = ipsDrop;
                return this;
            }

            /**
             * RingDataTime.
             */
            public Builder ringDataTime(String ringDataTime) {
                this.ringDataTime = ringDataTime;
                return this;
            }

            /**
             * RingTime.
             */
            public Builder ringTime(Long ringTime) {
                this.ringTime = ringTime;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            /**
             * TotalSession.
             */
            public Builder totalSession(Long totalSession) {
                this.totalSession = totalSession;
                return this;
            }

            public DataList build() {
                return new DataList(this);
            } 

        } 

    }
}
