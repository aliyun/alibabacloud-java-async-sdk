// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>An array that consists of the details of the DDoS attack event.</p>
         */
        public Builder domainAttackEvents(java.util.List < DomainAttackEvents> domainAttackEvents) {
            this.domainAttackEvents = domainAttackEvents;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>C33EB3D5-AF96-43CA-9C7E-37A81BC06A1E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of returned DDoS attack events.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDomainAttackEventsResponseBody build() {
            return new DescribeDomainAttackEventsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDomainAttackEventsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainAttackEventsResponseBody</p>
     */
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
             * <p>The attacked domain name.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The time when the DDoS attack stopped. The value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1560320160</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The peak attack QPS.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder maxQps(Long maxQps) {
                this.maxQps = maxQps;
                return this;
            }

            /**
             * <p>The time when the DDoS attack started. The value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1560312900</p>
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
