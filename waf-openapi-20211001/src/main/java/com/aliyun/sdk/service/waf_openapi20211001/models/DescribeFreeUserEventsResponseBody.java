// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeFreeUserEventsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFreeUserEventsResponseBody</p>
 */
public class DescribeFreeUserEventsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Event")
    private java.util.List < Event> event;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeFreeUserEventsResponseBody(Builder builder) {
        this.event = builder.event;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFreeUserEventsResponseBody create() {
        return builder().build();
    }

    /**
     * @return event
     */
    public java.util.List < Event> getEvent() {
        return this.event;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Event> event; 
        private String requestId; 

        /**
         * <p>The security events on which basic detection is performed.</p>
         */
        public Builder event(java.util.List < Event> event) {
            this.event = event;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8A2DF88D-90C2-56E9-B8D5-36BB9646791C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeFreeUserEventsResponseBody build() {
            return new DescribeFreeUserEventsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeFreeUserEventsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFreeUserEventsResponseBody</p>
     */
    public static class Event extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiFormat")
        private String apiFormat;

        @com.aliyun.core.annotation.NameInMap("AttackIP")
        private String attackIP;

        @com.aliyun.core.annotation.NameInMap("AttackTime")
        private Long attackTime;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("EventLevel")
        private String eventLevel;

        @com.aliyun.core.annotation.NameInMap("EventTag")
        private String eventTag;

        private Event(Builder builder) {
            this.apiFormat = builder.apiFormat;
            this.attackIP = builder.attackIP;
            this.attackTime = builder.attackTime;
            this.domain = builder.domain;
            this.eventLevel = builder.eventLevel;
            this.eventTag = builder.eventTag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Event create() {
            return builder().build();
        }

        /**
         * @return apiFormat
         */
        public String getApiFormat() {
            return this.apiFormat;
        }

        /**
         * @return attackIP
         */
        public String getAttackIP() {
            return this.attackIP;
        }

        /**
         * @return attackTime
         */
        public Long getAttackTime() {
            return this.attackTime;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return eventLevel
         */
        public String getEventLevel() {
            return this.eventLevel;
        }

        /**
         * @return eventTag
         */
        public String getEventTag() {
            return this.eventTag;
        }

        public static final class Builder {
            private String apiFormat; 
            private String attackIP; 
            private Long attackTime; 
            private String domain; 
            private String eventLevel; 
            private String eventTag; 

            /**
             * <p>The API.</p>
             * 
             * <strong>example:</strong>
             * <p>/api/login</p>
             */
            public Builder apiFormat(String apiFormat) {
                this.apiFormat = apiFormat;
                return this;
            }

            /**
             * <p>The attacker IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>104.234.140.**</p>
             */
            public Builder attackIP(String attackIP) {
                this.attackIP = attackIP;
                return this;
            }

            /**
             * <p>The time at which the attack was launched. The value is a UNIX timestamp displayed in UTC. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1683703260</p>
             */
            public Builder attackTime(Long attackTime) {
                this.attackTime = attackTime;
                return this;
            }

            /**
             * <p>The domain name of the API.</p>
             * 
             * <strong>example:</strong>
             * <p>www.***.cn</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The severity level of the security event. Valid values:</p>
             * <ul>
             * <li><strong>high</strong></li>
             * <li><strong>medium</strong></li>
             * <li><strong>low</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder eventLevel(String eventLevel) {
                this.eventLevel = eventLevel;
                return this;
            }

            /**
             * <p>The type of the security event.</p>
             * <blockquote>
             * <p> You can call the <a href="~~DescribeApisecRules~~">DescribeApisecRules</a> operation to query the supported types of security events.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Event_DataTraverse</p>
             */
            public Builder eventTag(String eventTag) {
                this.eventTag = eventTag;
                return this;
            }

            public Event build() {
                return new Event(this);
            } 

        } 

    }
}
