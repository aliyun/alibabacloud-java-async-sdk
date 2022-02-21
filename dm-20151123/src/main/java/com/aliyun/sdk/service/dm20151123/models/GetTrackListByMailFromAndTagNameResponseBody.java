// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTrackListByMailFromAndTagNameResponseBody} extends {@link TeaModel}
 *
 * <p>GetTrackListByMailFromAndTagNameResponseBody</p>
 */
public class GetTrackListByMailFromAndTagNameResponseBody extends TeaModel {
    @NameInMap("OffsetCreateTime")
    private String offsetCreateTime;

    @NameInMap("OffsetCreateTimeDesc")
    private String offsetCreateTimeDesc;

    @NameInMap("PageNo")
    private Integer pageNo;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Total")
    private Integer total;

    @NameInMap("TrackList")
    private TrackList trackList;

    private GetTrackListByMailFromAndTagNameResponseBody(Builder builder) {
        this.offsetCreateTime = builder.offsetCreateTime;
        this.offsetCreateTimeDesc = builder.offsetCreateTimeDesc;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
        this.trackList = builder.trackList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTrackListByMailFromAndTagNameResponseBody create() {
        return builder().build();
    }

    /**
     * @return offsetCreateTime
     */
    public String getOffsetCreateTime() {
        return this.offsetCreateTime;
    }

    /**
     * @return offsetCreateTimeDesc
     */
    public String getOffsetCreateTimeDesc() {
        return this.offsetCreateTimeDesc;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
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

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    /**
     * @return trackList
     */
    public TrackList getTrackList() {
        return this.trackList;
    }

    public static final class Builder {
        private String offsetCreateTime; 
        private String offsetCreateTimeDesc; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private Integer total; 
        private TrackList trackList; 

        /**
         * OffsetCreateTime.
         */
        public Builder offsetCreateTime(String offsetCreateTime) {
            this.offsetCreateTime = offsetCreateTime;
            return this;
        }

        /**
         * OffsetCreateTimeDesc.
         */
        public Builder offsetCreateTimeDesc(String offsetCreateTimeDesc) {
            this.offsetCreateTimeDesc = offsetCreateTimeDesc;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        /**
         * TrackList.
         */
        public Builder trackList(TrackList trackList) {
            this.trackList = trackList;
            return this;
        }

        public GetTrackListByMailFromAndTagNameResponseBody build() {
            return new GetTrackListByMailFromAndTagNameResponseBody(this);
        } 

    } 

    public static class Stat extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("RcptClickCount")
        private String rcptClickCount;

        @NameInMap("RcptClickRate")
        private String rcptClickRate;

        @NameInMap("RcptOpenCount")
        private String rcptOpenCount;

        @NameInMap("RcptOpenRate")
        private String rcptOpenRate;

        @NameInMap("RcptUniqueClickCount")
        private String rcptUniqueClickCount;

        @NameInMap("RcptUniqueClickRate")
        private String rcptUniqueClickRate;

        @NameInMap("RcptUniqueOpenCount")
        private String rcptUniqueOpenCount;

        @NameInMap("RcptUniqueOpenRate")
        private String rcptUniqueOpenRate;

        @NameInMap("TotalNumber")
        private String totalNumber;

        private Stat(Builder builder) {
            this.createTime = builder.createTime;
            this.rcptClickCount = builder.rcptClickCount;
            this.rcptClickRate = builder.rcptClickRate;
            this.rcptOpenCount = builder.rcptOpenCount;
            this.rcptOpenRate = builder.rcptOpenRate;
            this.rcptUniqueClickCount = builder.rcptUniqueClickCount;
            this.rcptUniqueClickRate = builder.rcptUniqueClickRate;
            this.rcptUniqueOpenCount = builder.rcptUniqueOpenCount;
            this.rcptUniqueOpenRate = builder.rcptUniqueOpenRate;
            this.totalNumber = builder.totalNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Stat create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return rcptClickCount
         */
        public String getRcptClickCount() {
            return this.rcptClickCount;
        }

        /**
         * @return rcptClickRate
         */
        public String getRcptClickRate() {
            return this.rcptClickRate;
        }

        /**
         * @return rcptOpenCount
         */
        public String getRcptOpenCount() {
            return this.rcptOpenCount;
        }

        /**
         * @return rcptOpenRate
         */
        public String getRcptOpenRate() {
            return this.rcptOpenRate;
        }

        /**
         * @return rcptUniqueClickCount
         */
        public String getRcptUniqueClickCount() {
            return this.rcptUniqueClickCount;
        }

        /**
         * @return rcptUniqueClickRate
         */
        public String getRcptUniqueClickRate() {
            return this.rcptUniqueClickRate;
        }

        /**
         * @return rcptUniqueOpenCount
         */
        public String getRcptUniqueOpenCount() {
            return this.rcptUniqueOpenCount;
        }

        /**
         * @return rcptUniqueOpenRate
         */
        public String getRcptUniqueOpenRate() {
            return this.rcptUniqueOpenRate;
        }

        /**
         * @return totalNumber
         */
        public String getTotalNumber() {
            return this.totalNumber;
        }

        public static final class Builder {
            private String createTime; 
            private String rcptClickCount; 
            private String rcptClickRate; 
            private String rcptOpenCount; 
            private String rcptOpenRate; 
            private String rcptUniqueClickCount; 
            private String rcptUniqueClickRate; 
            private String rcptUniqueOpenCount; 
            private String rcptUniqueOpenRate; 
            private String totalNumber; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * RcptClickCount.
             */
            public Builder rcptClickCount(String rcptClickCount) {
                this.rcptClickCount = rcptClickCount;
                return this;
            }

            /**
             * RcptClickRate.
             */
            public Builder rcptClickRate(String rcptClickRate) {
                this.rcptClickRate = rcptClickRate;
                return this;
            }

            /**
             * RcptOpenCount.
             */
            public Builder rcptOpenCount(String rcptOpenCount) {
                this.rcptOpenCount = rcptOpenCount;
                return this;
            }

            /**
             * RcptOpenRate.
             */
            public Builder rcptOpenRate(String rcptOpenRate) {
                this.rcptOpenRate = rcptOpenRate;
                return this;
            }

            /**
             * RcptUniqueClickCount.
             */
            public Builder rcptUniqueClickCount(String rcptUniqueClickCount) {
                this.rcptUniqueClickCount = rcptUniqueClickCount;
                return this;
            }

            /**
             * RcptUniqueClickRate.
             */
            public Builder rcptUniqueClickRate(String rcptUniqueClickRate) {
                this.rcptUniqueClickRate = rcptUniqueClickRate;
                return this;
            }

            /**
             * RcptUniqueOpenCount.
             */
            public Builder rcptUniqueOpenCount(String rcptUniqueOpenCount) {
                this.rcptUniqueOpenCount = rcptUniqueOpenCount;
                return this;
            }

            /**
             * RcptUniqueOpenRate.
             */
            public Builder rcptUniqueOpenRate(String rcptUniqueOpenRate) {
                this.rcptUniqueOpenRate = rcptUniqueOpenRate;
                return this;
            }

            /**
             * TotalNumber.
             */
            public Builder totalNumber(String totalNumber) {
                this.totalNumber = totalNumber;
                return this;
            }

            public Stat build() {
                return new Stat(this);
            } 

        } 

    }
    public static class TrackList extends TeaModel {
        @NameInMap("Stat")
        private java.util.List < Stat> stat;

        private TrackList(Builder builder) {
            this.stat = builder.stat;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrackList create() {
            return builder().build();
        }

        /**
         * @return stat
         */
        public java.util.List < Stat> getStat() {
            return this.stat;
        }

        public static final class Builder {
            private java.util.List < Stat> stat; 

            /**
             * Stat.
             */
            public Builder stat(java.util.List < Stat> stat) {
                this.stat = stat;
                return this;
            }

            public TrackList build() {
                return new TrackList(this);
            } 

        } 

    }
}
