// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDdosAllEventListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDdosAllEventListResponseBody</p>
 */
public class DescribeDdosAllEventListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataList")
    private java.util.List < DataList> dataList;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    private DescribeDdosAllEventListResponseBody(Builder builder) {
        this.dataList = builder.dataList;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDdosAllEventListResponseBody create() {
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
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List < DataList> dataList; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Long total; 

        /**
         * <p>The list of events.</p>
         */
        public Builder dataList(java.util.List < DataList> dataList) {
            this.dataList = dataList;
            return this;
        }

        /**
         * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned on each page. Default value: <strong>10</strong>. Valid values: 5, 10, and 20.</p>
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
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public DescribeDdosAllEventListResponseBody build() {
            return new DescribeDdosAllEventListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDdosAllEventListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDdosAllEventListResponseBody</p>
     */
    public static class DataList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bps")
        private Long bps;

        @com.aliyun.core.annotation.NameInMap("Cps")
        private Long cps;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("EventId")
        private String eventId;

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

        private DataList(Builder builder) {
            this.bps = builder.bps;
            this.cps = builder.cps;
            this.endTime = builder.endTime;
            this.eventId = builder.eventId;
            this.eventType = builder.eventType;
            this.pps = builder.pps;
            this.qps = builder.qps;
            this.startTime = builder.startTime;
            this.target = builder.target;
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

        public static final class Builder {
            private Long bps; 
            private Long cps; 
            private String endTime; 
            private String eventId; 
            private String eventType; 
            private Long pps; 
            private Long qps; 
            private String startTime; 
            private String target; 

            /**
             * <p>The peak attack traffic of volumetric attacks. Unit: bit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>800</p>
             */
            public Builder bps(Long bps) {
                this.bps = bps;
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
             * <p>The end of the time range during which data was queried. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-11-26T15:59:00Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The event ID.</p>
             * 
             * <strong>example:</strong>
             * <p>28069</p>
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * <p>The type of the DDoS attack event that was queried. Valid values:</p>
             * <ul>
             * <li><strong>web-cc</strong>: web resource exhaustion attacks</li>
             * <li><strong>cc</strong>: connection flood attacks</li>
             * <li><strong>traffic</strong>: volumetric attacks</li>
             * <li>If you do not configure this parameter, DDoS attack events of all types are queried.</li>
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
             * <p>The peak attack traffic of volumetric attacks. Unit: packets per second (PPS).</p>
             * 
             * <strong>example:</strong>
             * <p>12000</p>
             */
            public Builder pps(Long pps) {
                this.pps = pps;
                return this;
            }

            /**
             * <p>The peak of web resource exhaustion attacks. Unit: queries per second (QPS).</p>
             * 
             * <strong>example:</strong>
             * <p>7692</p>
             */
            public Builder qps(Long qps) {
                this.qps = qps;
                return this;
            }

            /**
             * <p>The beginning of the time range during which data was queried. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-10-09T10:03:31Z</p>
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

            public DataList build() {
                return new DataList(this);
            } 

        } 

    }
}
