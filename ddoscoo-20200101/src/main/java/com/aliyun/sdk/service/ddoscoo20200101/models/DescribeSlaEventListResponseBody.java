// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
 * {@link DescribeSlaEventListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSlaEventListResponseBody</p>
 */
public class DescribeSlaEventListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SlaEvent")
    private java.util.List<SlaEvent> slaEvent;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    private DescribeSlaEventListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.slaEvent = builder.slaEvent;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSlaEventListResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return slaEvent
     */
    public java.util.List<SlaEvent> getSlaEvent() {
        return this.slaEvent;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<SlaEvent> slaEvent; 
        private Long total; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CF33B4C3-196E-4015-AADD-5CAD00057B80</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The destination rate limit events.</p>
         */
        public Builder slaEvent(java.util.List<SlaEvent> slaEvent) {
            this.slaEvent = slaEvent;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public DescribeSlaEventListResponseBody build() {
            return new DescribeSlaEventListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSlaEventListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSlaEventListResponseBody</p>
     */
    public static class SlaEvent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        private SlaEvent(Builder builder) {
            this.endTime = builder.endTime;
            this.ip = builder.ip;
            this.region = builder.region;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlaEvent create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private Long endTime; 
            private String ip; 
            private String region; 
            private Long startTime; 

            /**
             * <p>The end of the time range. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1671886740</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The IP address of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>203.107.XX.XX</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The region to which the destination IP address belongs. Valid values:</p>
             * <ul>
             * <li><strong>cn</strong>: a region in the Chinese mainland</li>
             * <li><strong>cn-hongkong</strong>: China (Hong Kong)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cn</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The beginning of the time range. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1678080840</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            public SlaEvent build() {
                return new SlaEvent(this);
            } 

        } 

    }
}
