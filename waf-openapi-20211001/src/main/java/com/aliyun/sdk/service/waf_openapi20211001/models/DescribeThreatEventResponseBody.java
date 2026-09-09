// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeThreatEventResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeThreatEventResponseBody</p>
 */
public class DescribeThreatEventResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ThreatEvents")
    private java.util.List<ThreatEvents> threatEvents;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeThreatEventResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.threatEvents = builder.threatEvents;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeThreatEventResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return threatEvents
     */
    public java.util.List<ThreatEvents> getThreatEvents() {
        return this.threatEvents;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<ThreatEvents> threatEvents; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribeThreatEventResponseBody model) {
            this.requestId = model.requestId;
            this.threatEvents = model.threatEvents;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>98106632-6865-5600-A834-3D909***</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of notable security events.</p>
         */
        public Builder threatEvents(java.util.List<ThreatEvents> threatEvents) {
            this.threatEvents = threatEvents;
            return this;
        }

        /**
         * <p>The total number of security events that match the query conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeThreatEventResponseBody build() {
            return new DescribeThreatEventResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeThreatEventResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeThreatEventResponseBody</p>
     */
    public static class ThreatEvents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BlockRate")
        private String blockRate;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("EventId")
        private String eventId;

        @com.aliyun.core.annotation.NameInMap("EventLevel")
        private String eventLevel;

        @com.aliyun.core.annotation.NameInMap("EventSrc")
        private String eventSrc;

        @com.aliyun.core.annotation.NameInMap("EventTag")
        private String eventTag;

        @com.aliyun.core.annotation.NameInMap("EventTarget")
        private String eventTarget;

        private ThreatEvents(Builder builder) {
            this.blockRate = builder.blockRate;
            this.endTime = builder.endTime;
            this.eventId = builder.eventId;
            this.eventLevel = builder.eventLevel;
            this.eventSrc = builder.eventSrc;
            this.eventTag = builder.eventTag;
            this.eventTarget = builder.eventTarget;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ThreatEvents create() {
            return builder().build();
        }

        /**
         * @return blockRate
         */
        public String getBlockRate() {
            return this.blockRate;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return eventId
         */
        public String getEventId() {
            return this.eventId;
        }

        /**
         * @return eventLevel
         */
        public String getEventLevel() {
            return this.eventLevel;
        }

        /**
         * @return eventSrc
         */
        public String getEventSrc() {
            return this.eventSrc;
        }

        /**
         * @return eventTag
         */
        public String getEventTag() {
            return this.eventTag;
        }

        /**
         * @return eventTarget
         */
        public String getEventTarget() {
            return this.eventTarget;
        }

        public static final class Builder {
            private String blockRate; 
            private Long endTime; 
            private String eventId; 
            private String eventLevel; 
            private String eventSrc; 
            private String eventTag; 
            private String eventTarget; 

            private Builder() {
            } 

            private Builder(ThreatEvents model) {
                this.blockRate = model.blockRate;
                this.endTime = model.endTime;
                this.eventId = model.eventId;
                this.eventLevel = model.eventLevel;
                this.eventSrc = model.eventSrc;
                this.eventTag = model.eventTag;
                this.eventTarget = model.eventTarget;
            } 

            /**
             * <p>The percentage of attack requests that were blocked by WAF.</p>
             * 
             * <strong>example:</strong>
             * <p>100%</p>
             */
            public Builder blockRate(String blockRate) {
                this.blockRate = blockRate;
                return this;
            }

            /**
             * <p>The time when the last attack occurred. This value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1768406400000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The ID of the security event.</p>
             * 
             * <strong>example:</strong>
             * <p>f439994c8ab39f84eced33490f0c4388</p>
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * <p>The severity level of the security event. Valid values:</p>
             * <ul>
             * <li><p><strong>critical</strong></p>
             * </li>
             * <li><p><strong>high</strong></p>
             * </li>
             * <li><p><strong>medium</strong></p>
             * </li>
             * <li><p><strong>low</strong></p>
             * </li>
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
             * <p>The source IP address of the attack.</p>
             * <blockquote>
             * <p>A security event may have multiple source IP addresses. This operation returns only one of them.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>3.3.3.3</p>
             */
            public Builder eventSrc(String eventSrc) {
                this.eventSrc = eventSrc;
                return this;
            }

            /**
             * <p>The type of the security event. Valid values:</p>
             * <ul>
             * <li><p><strong>MultipleDomainDirscan</strong>: a directory and file scan against multiple domain names.</p>
             * </li>
             * <li><p><strong>SingleDomainDirscan</strong>: a directory and file scan against a single domain name.</p>
             * </li>
             * <li><p><strong>MultipleDomainWebscan</strong>: a web vulnerability scan against multiple domain names.</p>
             * </li>
             * <li><p><strong>SingleDomainWebscan</strong>: a web vulnerability scan against a single domain name.</p>
             * </li>
             * <li><p><strong>MultipleDomainWebattack</strong>: a web vulnerability attack against multiple domain names.</p>
             * </li>
             * <li><p><strong>SingleDomainWebattack</strong>: a web vulnerability attack against a single domain name.</p>
             * </li>
             * <li><p><strong>SingleURLWebattack</strong>: a web vulnerability attack against a specific URL.</p>
             * </li>
             * <li><p><strong>SingleURLSqlattack</strong>: an SQL injection attack against a specific URL.</p>
             * </li>
             * <li><p><strong>SingleURLXssattack</strong>: an XSS attack against a specific URL.</p>
             * </li>
             * <li><p><strong>WebshellUpload</strong>: an attack that attempts to upload backdoor trojans.</p>
             * </li>
             * <li><p><strong>RandomVulnTest</strong>: a random web vulnerability probe.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Event_InternalLoginWeakPasswd</p>
             */
            public Builder eventTag(String eventTag) {
                this.eventTag = eventTag;
                return this;
            }

            /**
             * <p>The protected object that is the target of the attack.</p>
             * <blockquote>
             * <p>A security event may have multiple protected objects as targets. This operation returns only one of them.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>test.aliyundemo.com-waf</p>
             */
            public Builder eventTarget(String eventTarget) {
                this.eventTarget = eventTarget;
                return this;
            }

            public ThreatEvents build() {
                return new ThreatEvents(this);
            } 

        } 

    }
}
