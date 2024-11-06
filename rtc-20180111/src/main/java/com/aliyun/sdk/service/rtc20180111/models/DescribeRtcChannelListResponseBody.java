// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeRtcChannelListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRtcChannelListResponseBody</p>
 */
public class DescribeRtcChannelListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ChannelList")
    private ChannelList channelList;

    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Long pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCnt")
    private Long totalCnt;

    private DescribeRtcChannelListResponseBody(Builder builder) {
        this.channelList = builder.channelList;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCnt = builder.totalCnt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRtcChannelListResponseBody create() {
        return builder().build();
    }

    /**
     * @return channelList
     */
    public ChannelList getChannelList() {
        return this.channelList;
    }

    /**
     * @return pageNo
     */
    public Long getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCnt
     */
    public Long getTotalCnt() {
        return this.totalCnt;
    }

    public static final class Builder {
        private ChannelList channelList; 
        private Long pageNo; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCnt; 

        /**
         * ChannelList.
         */
        public Builder channelList(ChannelList channelList) {
            this.channelList = channelList;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
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
         * TotalCnt.
         */
        public Builder totalCnt(Long totalCnt) {
            this.totalCnt = totalCnt;
            return this;
        }

        public DescribeRtcChannelListResponseBody build() {
            return new DescribeRtcChannelListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRtcChannelListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRtcChannelListResponseBody</p>
     */
    public static class CallArea extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallArea")
        private java.util.List < String > callArea;

        private CallArea(Builder builder) {
            this.callArea = builder.callArea;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CallArea create() {
            return builder().build();
        }

        /**
         * @return callArea
         */
        public java.util.List < String > getCallArea() {
            return this.callArea;
        }

        public static final class Builder {
            private java.util.List < String > callArea; 

            /**
             * CallArea.
             */
            public Builder callArea(java.util.List < String > callArea) {
                this.callArea = callArea;
                return this;
            }

            public CallArea build() {
                return new CallArea(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRtcChannelListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRtcChannelListResponseBody</p>
     */
    public static class ChannelListChannelList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallArea")
        private CallArea callArea;

        @com.aliyun.core.annotation.NameInMap("ChannelId")
        private String channelId;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("TotalUserCnt")
        private Long totalUserCnt;

        private ChannelListChannelList(Builder builder) {
            this.callArea = builder.callArea;
            this.channelId = builder.channelId;
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
            this.totalUserCnt = builder.totalUserCnt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChannelListChannelList create() {
            return builder().build();
        }

        /**
         * @return callArea
         */
        public CallArea getCallArea() {
            return this.callArea;
        }

        /**
         * @return channelId
         */
        public String getChannelId() {
            return this.channelId;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return totalUserCnt
         */
        public Long getTotalUserCnt() {
            return this.totalUserCnt;
        }

        public static final class Builder {
            private CallArea callArea; 
            private String channelId; 
            private String endTime; 
            private String startTime; 
            private Long totalUserCnt; 

            /**
             * CallArea.
             */
            public Builder callArea(CallArea callArea) {
                this.callArea = callArea;
                return this;
            }

            /**
             * ChannelId.
             */
            public Builder channelId(String channelId) {
                this.channelId = channelId;
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
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * TotalUserCnt.
             */
            public Builder totalUserCnt(Long totalUserCnt) {
                this.totalUserCnt = totalUserCnt;
                return this;
            }

            public ChannelListChannelList build() {
                return new ChannelListChannelList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRtcChannelListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRtcChannelListResponseBody</p>
     */
    public static class ChannelList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChannelList")
        private java.util.List < ChannelListChannelList> channelList;

        private ChannelList(Builder builder) {
            this.channelList = builder.channelList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChannelList create() {
            return builder().build();
        }

        /**
         * @return channelList
         */
        public java.util.List < ChannelListChannelList> getChannelList() {
            return this.channelList;
        }

        public static final class Builder {
            private java.util.List < ChannelListChannelList> channelList; 

            /**
             * ChannelList.
             */
            public Builder channelList(java.util.List < ChannelListChannelList> channelList) {
                this.channelList = channelList;
                return this;
            }

            public ChannelList build() {
                return new ChannelList(this);
            } 

        } 

    }
}
