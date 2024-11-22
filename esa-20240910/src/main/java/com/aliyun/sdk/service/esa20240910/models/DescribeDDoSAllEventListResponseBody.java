// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDDoSAllEventListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDDoSAllEventListResponseBody</p>
 */
public class DescribeDDoSAllEventListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataList")
    private java.util.List < DataList> dataList;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SiteId")
    private Long siteId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDDoSAllEventListResponseBody(Builder builder) {
        this.dataList = builder.dataList;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.siteId = builder.siteId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDDoSAllEventListResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataList
     */
    public java.util.List < DataList> getDataList() {
        return this.dataList;
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

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < DataList> dataList; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Long siteId; 
        private Integer totalCount; 

        /**
         * <p>The DDoS attack events.</p>
         */
        public Builder dataList(java.util.List < DataList> dataList) {
            this.dataList = dataList;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D73A4243-CFBD-5110-876F-09237E77ECBD</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The website ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7096621098****</p>
         */
        public Builder siteId(Long siteId) {
            this.siteId = siteId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDDoSAllEventListResponseBody build() {
            return new DescribeDDoSAllEventListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDDoSAllEventListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDDoSAllEventListResponseBody</p>
     */
    public static class DataList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bps")
        private Long bps;

        @com.aliyun.core.annotation.NameInMap("Coverage")
        private String coverage;

        @com.aliyun.core.annotation.NameInMap("Cps")
        private Long cps;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("EventId")
        private String eventId;

        @com.aliyun.core.annotation.NameInMap("EventResult")
        private String eventResult;

        @com.aliyun.core.annotation.NameInMap("EventType")
        private String eventType;

        @com.aliyun.core.annotation.NameInMap("Pps")
        private Long pps;

        @com.aliyun.core.annotation.NameInMap("Qps")
        private Long qps;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Target")
        private String target;

        @com.aliyun.core.annotation.NameInMap("TargetId")
        private String targetId;

        private DataList(Builder builder) {
            this.bps = builder.bps;
            this.coverage = builder.coverage;
            this.cps = builder.cps;
            this.endTime = builder.endTime;
            this.eventId = builder.eventId;
            this.eventResult = builder.eventResult;
            this.eventType = builder.eventType;
            this.pps = builder.pps;
            this.qps = builder.qps;
            this.startTime = builder.startTime;
            this.target = builder.target;
            this.targetId = builder.targetId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataList create() {
            return builder().build();
        }

        /**
         * @return bps
         */
        public Long getBps() {
            return this.bps;
        }

        /**
         * @return coverage
         */
        public String getCoverage() {
            return this.coverage;
        }

        /**
         * @return cps
         */
        public Long getCps() {
            return this.cps;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return eventId
         */
        public String getEventId() {
            return this.eventId;
        }

        /**
         * @return eventResult
         */
        public String getEventResult() {
            return this.eventResult;
        }

        /**
         * @return eventType
         */
        public String getEventType() {
            return this.eventType;
        }

        /**
         * @return pps
         */
        public Long getPps() {
            return this.pps;
        }

        /**
         * @return qps
         */
        public Long getQps() {
            return this.qps;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return target
         */
        public String getTarget() {
            return this.target;
        }

        /**
         * @return targetId
         */
        public String getTargetId() {
            return this.targetId;
        }

        public static final class Builder {
            private Long bps; 
            private String coverage; 
            private Long cps; 
            private String endTime; 
            private String eventId; 
            private String eventResult; 
            private String eventType; 
            private Long pps; 
            private Long qps; 
            private String startTime; 
            private String target; 
            private String targetId; 

            /**
             * <p>The peak of volumetric attacks. Unit: bit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>800</p>
             */
            public Builder bps(Long bps) {
                this.bps = bps;
                return this;
            }

            /**
             * Coverage.
             */
            public Builder coverage(String coverage) {
                this.coverage = coverage;
                return this;
            }

            /**
             * <p>The peak of connection flood attacks. Unit: connections per seconds (CPS).</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder cps(Long cps) {
                this.cps = cps;
                return this;
            }

            /**
             * <p>The time when the DDoS attack ends.</p>
             * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-02-12T15:59:59Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The attack event ID.</p>
             * 
             * <strong>example:</strong>
             * <p>web-cc_1</p>
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * EventResult.
             */
            public Builder eventResult(String eventResult) {
                this.eventResult = eventResult;
                return this;
            }

            /**
             * <p>The type of DDoS attacks that was queried. Valid values:</p>
             * <ul>
             * <li><strong>web-cc</strong>: web resource exhaustion attacks.</li>
             * <li><strong>cc</strong>: connection flood attacks.</li>
             * <li><strong>traffic</strong>: volumetric attacks.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>web-cc</p>
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * <p>The peak of volumetric attacks. Unit: packets per second (PPS).</p>
             * 
             * <strong>example:</strong>
             * <p>12000</p>
             */
            public Builder pps(Long pps) {
                this.pps = pps;
                return this;
            }

            /**
             * <p>The peak QPS of web resource exhaustion attacks.</p>
             * 
             * <strong>example:</strong>
             * <p>7692</p>
             */
            public Builder qps(Long qps) {
                this.qps = qps;
                return this;
            }

            /**
             * <p>The time when the DDoS attack starts.</p>
             * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-02-12T15:00:00Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The attack target.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * <p>The ID of the web resource exhaustion attack target.</p>
             * 
             * <strong>example:</strong>
             * <p>000000000155****</p>
             */
            public Builder targetId(String targetId) {
                this.targetId = targetId;
                return this;
            }

            public DataList build() {
                return new DataList(this);
            } 

        } 

    }
}
