// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link DescribeDDoSAllEventListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDDoSAllEventListResponseBody</p>
 */
public class DescribeDDoSAllEventListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataList")
    private java.util.List<DataList> dataList;

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
        private java.util.List<DataList> dataList; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Long siteId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeDDoSAllEventListResponseBody model) {
            this.dataList = model.dataList;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.siteId = model.siteId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>A list of DDoS attack event details.</p>
         */
        public Builder dataList(java.util.List<DataList> dataList) {
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
         * <p>The page size.</p>
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
         * <p>The site ID.</p>
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

            private Builder() {
            } 

            private Builder(DataList model) {
                this.bps = model.bps;
                this.coverage = model.coverage;
                this.cps = model.cps;
                this.endTime = model.endTime;
                this.eventId = model.eventId;
                this.eventResult = model.eventResult;
                this.eventType = model.eventType;
                this.pps = model.pps;
                this.qps = model.qps;
                this.startTime = model.startTime;
                this.target = model.target;
                this.targetId = model.targetId;
            } 

            /**
             * <p>The peak bits per second (Bps) of a volumetric attack.</p>
             * 
             * <strong>example:</strong>
             * <p>800</p>
             */
            public Builder bps(Long bps) {
                this.bps = bps;
                return this;
            }

            /**
             * <p>The attack region. Valid values:</p>
             * <ul>
             * <li><p><strong>domestic</strong>: Chinese mainland.</p>
             * </li>
             * <li><p><strong>global</strong>: Global.</p>
             * </li>
             * <li><p><strong>overseas</strong>: global (excluding Chinese mainland).</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>domestic</p>
             */
            public Builder coverage(String coverage) {
                this.coverage = coverage;
                return this;
            }

            /**
             * <p>The peak connections per second (Cps) of a connection-based attack.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder cps(Long cps) {
                this.cps = cps;
                return this;
            }

            /**
             * <p>The end time of the DDoS attack event.</p>
             * <p>The time is in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format and is in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-02-12T15:59:59Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The event ID.</p>
             * 
             * <strong>example:</strong>
             * <p>web-cc_1</p>
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * <p>The event result. Valid values:</p>
             * <ul>
             * <li><p><strong>clean</strong>: The attack was successfully cleaned.</p>
             * </li>
             * <li><p><strong>ratelimit</strong>: Rate limiting was applied.</p>
             * </li>
             * <li><p><strong>blackhole</strong>: Blackhole filtering was triggered.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>clean</p>
             */
            public Builder eventResult(String eventResult) {
                this.eventResult = eventResult;
                return this;
            }

            /**
             * <p>The type of the DDoS attack event. Valid values:</p>
             * <ul>
             * <li><p><strong>web-cc</strong>: A web resource exhaustion attack.</p>
             * </li>
             * <li><p><strong>cc</strong>: A connection-based attack.</p>
             * </li>
             * <li><p><strong>traffic</strong>: A volumetric attack.</p>
             * </li>
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
             * <p>The peak packets per second (Pps) of a volumetric attack.</p>
             * 
             * <strong>example:</strong>
             * <p>12000</p>
             */
            public Builder pps(Long pps) {
                this.pps = pps;
                return this;
            }

            /**
             * <p>The peak queries per second (Qps) of a web resource exhaustion attack.</p>
             * 
             * <strong>example:</strong>
             * <p>7692</p>
             */
            public Builder qps(Long qps) {
                this.qps = qps;
                return this;
            }

            /**
             * <p>The start time of the DDoS attack event.</p>
             * <p>The time is in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format and is in UTC.</p>
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
             * <p>The ID of the attack target.</p>
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
