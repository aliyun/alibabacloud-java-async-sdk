// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainAttackEventsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainAttackEventsResponseBody</p>
 */
public class DescribeDomainAttackEventsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainAttackEvents")
    private java.util.List < DomainAttackEvents> domainAttackEvents;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeDomainAttackEventsResponseBody(Builder builder) {
        this.domainAttackEvents = builder.domainAttackEvents;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainAttackEventsResponseBody create() {
        return builder().build();
    }

    /**
     * @return domainAttackEvents
     */
    public java.util.List < DomainAttackEvents> getDomainAttackEvents() {
        return this.domainAttackEvents;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < DomainAttackEvents> domainAttackEvents; 
        private String requestId; 
        private Long totalCount; 

        /**
         * An array that consists of the details of the DDoS attack event.
         */
        public Builder domainAttackEvents(java.util.List < DomainAttackEvents> domainAttackEvents) {
            this.domainAttackEvents = domainAttackEvents;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of returned DDoS attack events.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDomainAttackEventsResponseBody build() {
            return new DescribeDomainAttackEventsResponseBody(this);
        } 

    } 

    public static class DomainAttackEvents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("MaxQps")
        private Long maxQps;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        private DomainAttackEvents(Builder builder) {
            this.domain = builder.domain;
            this.endTime = builder.endTime;
            this.maxQps = builder.maxQps;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainAttackEvents create() {
            return builder().build();
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return maxQps
         */
        public Long getMaxQps() {
            return this.maxQps;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String domain; 
            private Long endTime; 
            private Long maxQps; 
            private Long startTime; 

            /**
             * The attacked domain name.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * The time when the DDoS attack stopped. The value is a UNIX timestamp. Unit: seconds.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The peak attack QPS.
             */
            public Builder maxQps(Long maxQps) {
                this.maxQps = maxQps;
                return this;
            }

            /**
             * The time when the DDoS attack started. The value is a UNIX timestamp. Unit: seconds.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            public DomainAttackEvents build() {
                return new DomainAttackEvents(this);
            } 

        } 

    }
}
