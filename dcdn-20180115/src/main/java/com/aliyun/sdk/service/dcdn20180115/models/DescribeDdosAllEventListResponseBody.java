// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDdosAllEventListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDdosAllEventListResponseBody</p>
 */
public class DescribeDdosAllEventListResponseBody extends TeaModel {
    @NameInMap("DataList")
    private java.util.List < DataList> dataList;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Total")
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
         * The list of events.
         */
        public Builder dataList(java.util.List < DataList> dataList) {
            this.dataList = dataList;
            return this;
        }

        /**
         * The number of the page to return. Default value: **1**.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned on each page. Default value: **10**. Valid values: 5, 10, and 20.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public DescribeDdosAllEventListResponseBody build() {
            return new DescribeDdosAllEventListResponseBody(this);
        } 

    } 

    public static class DataList extends TeaModel {
        @NameInMap("Bps")
        private Long bps;

        @NameInMap("Cps")
        private Long cps;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("EventId")
        private String eventId;

        @NameInMap("EventType")
        private String eventType;

        @NameInMap("Pps")
        private Long pps;

        @NameInMap("Qps")
        private Long qps;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Target")
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
             * The peak attack traffic of volumetric attacks. Unit: bit/s.
             */
            public Builder bps(Long bps) {
                this.bps = bps;
                return this;
            }

            /**
             * The peak of connection flood attacks. Unit: connections per seconds (CPS).
             */
            public Builder cps(Long cps) {
                this.cps = cps;
                return this;
            }

            /**
             * The end of the time range during which data was queried. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The event ID.
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * The type of the DDoS attack event that was queried. Valid values:
             * <p>
             * 
             * *   **web-cc**: web resource exhaustion attacks
             * *   **cc**: connection flood attacks
             * *   **traffic**: volumetric attacks
             * *   If you do not configure this parameter, DDoS attack events of all types are queried.
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * The peak attack traffic of volumetric attacks. Unit: packets per second (PPS).
             */
            public Builder pps(Long pps) {
                this.pps = pps;
                return this;
            }

            /**
             * The peak of web resource exhaustion attacks. Unit: queries per second (QPS).
             */
            public Builder qps(Long qps) {
                this.qps = qps;
                return this;
            }

            /**
             * The beginning of the time range during which data was queried. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The attack target.
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
