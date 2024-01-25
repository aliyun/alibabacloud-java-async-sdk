// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vdmeter20210425.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNewPlayVideoPlaySessionEventDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNewPlayVideoPlaySessionEventDetailResponseBody</p>
 */
public class DescribeNewPlayVideoPlaySessionEventDetailResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("PageNum")
    private Long pageNum;

    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("ReadyTs")
    private Long readyTs;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalNum")
    private Long totalNum;

    private DescribeNewPlayVideoPlaySessionEventDetailResponseBody(Builder builder) {
        this.data = builder.data;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.readyTs = builder.readyTs;
        this.requestId = builder.requestId;
        this.totalNum = builder.totalNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNewPlayVideoPlaySessionEventDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return pageNum
     */
    public Long getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return readyTs
     */
    public Long getReadyTs() {
        return this.readyTs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalNum
     */
    public Long getTotalNum() {
        return this.totalNum;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private Long pageNum; 
        private Long pageSize; 
        private Long readyTs; 
        private String requestId; 
        private Long totalNum; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Long pageNum) {
            this.pageNum = pageNum;
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
         * ReadyTs.
         */
        public Builder readyTs(Long readyTs) {
            this.readyTs = readyTs;
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
         * TotalNum.
         */
        public Builder totalNum(Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        public DescribeNewPlayVideoPlaySessionEventDetailResponseBody build() {
            return new DescribeNewPlayVideoPlaySessionEventDetailResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("BizTime")
        private String bizTime;

        @NameInMap("Cost")
        private String cost;

        @NameInMap("Details")
        private String details;

        @NameInMap("EventName")
        private String eventName;

        @NameInMap("IP")
        private String ip;

        @NameInMap("ISP")
        private String ISP;

        @NameInMap("IsNormal")
        private Integer isNormal;

        @NameInMap("NetworkType")
        private String networkType;

        @NameInMap("Region")
        private String region;

        @NameInMap("Subject")
        private String subject;

        private Data(Builder builder) {
            this.bizTime = builder.bizTime;
            this.cost = builder.cost;
            this.details = builder.details;
            this.eventName = builder.eventName;
            this.ip = builder.ip;
            this.ISP = builder.ISP;
            this.isNormal = builder.isNormal;
            this.networkType = builder.networkType;
            this.region = builder.region;
            this.subject = builder.subject;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bizTime
         */
        public String getBizTime() {
            return this.bizTime;
        }

        /**
         * @return cost
         */
        public String getCost() {
            return this.cost;
        }

        /**
         * @return details
         */
        public String getDetails() {
            return this.details;
        }

        /**
         * @return eventName
         */
        public String getEventName() {
            return this.eventName;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return ISP
         */
        public String getISP() {
            return this.ISP;
        }

        /**
         * @return isNormal
         */
        public Integer getIsNormal() {
            return this.isNormal;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return subject
         */
        public String getSubject() {
            return this.subject;
        }

        public static final class Builder {
            private String bizTime; 
            private String cost; 
            private String details; 
            private String eventName; 
            private String ip; 
            private String ISP; 
            private Integer isNormal; 
            private String networkType; 
            private String region; 
            private String subject; 

            /**
             * BizTime.
             */
            public Builder bizTime(String bizTime) {
                this.bizTime = bizTime;
                return this;
            }

            /**
             * Cost.
             */
            public Builder cost(String cost) {
                this.cost = cost;
                return this;
            }

            /**
             * Details.
             */
            public Builder details(String details) {
                this.details = details;
                return this;
            }

            /**
             * EventName.
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * IP.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * ISP.
             */
            public Builder ISP(String ISP) {
                this.ISP = ISP;
                return this;
            }

            /**
             * IsNormal.
             */
            public Builder isNormal(Integer isNormal) {
                this.isNormal = isNormal;
                return this;
            }

            /**
             * NetworkType.
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * Subject.
             */
            public Builder subject(String subject) {
                this.subject = subject;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
