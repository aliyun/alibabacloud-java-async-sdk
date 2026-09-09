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
 * {@link DescribeThreatEventDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeThreatEventDetailResponseBody</p>
 */
public class DescribeThreatEventDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ThreatEventDetail")
    private ThreatEventDetail threatEventDetail;

    private DescribeThreatEventDetailResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.threatEventDetail = builder.threatEventDetail;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeThreatEventDetailResponseBody create() {
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
     * @return threatEventDetail
     */
    public ThreatEventDetail getThreatEventDetail() {
        return this.threatEventDetail;
    }

    public static final class Builder {
        private String requestId; 
        private ThreatEventDetail threatEventDetail; 

        private Builder() {
        } 

        private Builder(DescribeThreatEventDetailResponseBody model) {
            this.requestId = model.requestId;
            this.threatEventDetail = model.threatEventDetail;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D7861F61-5B61-46CE-A47C-6B1****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The details of the security event.</p>
         */
        public Builder threatEventDetail(ThreatEventDetail threatEventDetail) {
            this.threatEventDetail = threatEventDetail;
            return this;
        }

        public DescribeThreatEventDetailResponseBody build() {
            return new DescribeThreatEventDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeThreatEventDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeThreatEventDetailResponseBody</p>
     */
    public static class ThreatEventDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("EventBlock")
        private String eventBlock;

        @com.aliyun.core.annotation.NameInMap("EventCnt")
        private String eventCnt;

        @com.aliyun.core.annotation.NameInMap("EventCondition")
        private String eventCondition;

        @com.aliyun.core.annotation.NameInMap("EventIntelligence")
        private String eventIntelligence;

        @com.aliyun.core.annotation.NameInMap("EventLevel")
        private String eventLevel;

        @com.aliyun.core.annotation.NameInMap("EventSrc")
        private String eventSrc;

        @com.aliyun.core.annotation.NameInMap("EventSrcCountry")
        private String eventSrcCountry;

        @com.aliyun.core.annotation.NameInMap("EventSrcRegion")
        private String eventSrcRegion;

        @com.aliyun.core.annotation.NameInMap("EventSuggest")
        private String eventSuggest;

        @com.aliyun.core.annotation.NameInMap("EventTag")
        private String eventTag;

        @com.aliyun.core.annotation.NameInMap("IsPersistent")
        private Long isPersistent;

        private ThreatEventDetail(Builder builder) {
            this.endTime = builder.endTime;
            this.eventBlock = builder.eventBlock;
            this.eventCnt = builder.eventCnt;
            this.eventCondition = builder.eventCondition;
            this.eventIntelligence = builder.eventIntelligence;
            this.eventLevel = builder.eventLevel;
            this.eventSrc = builder.eventSrc;
            this.eventSrcCountry = builder.eventSrcCountry;
            this.eventSrcRegion = builder.eventSrcRegion;
            this.eventSuggest = builder.eventSuggest;
            this.eventTag = builder.eventTag;
            this.isPersistent = builder.isPersistent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ThreatEventDetail create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return eventBlock
         */
        public String getEventBlock() {
            return this.eventBlock;
        }

        /**
         * @return eventCnt
         */
        public String getEventCnt() {
            return this.eventCnt;
        }

        /**
         * @return eventCondition
         */
        public String getEventCondition() {
            return this.eventCondition;
        }

        /**
         * @return eventIntelligence
         */
        public String getEventIntelligence() {
            return this.eventIntelligence;
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
         * @return eventSrcCountry
         */
        public String getEventSrcCountry() {
            return this.eventSrcCountry;
        }

        /**
         * @return eventSrcRegion
         */
        public String getEventSrcRegion() {
            return this.eventSrcRegion;
        }

        /**
         * @return eventSuggest
         */
        public String getEventSuggest() {
            return this.eventSuggest;
        }

        /**
         * @return eventTag
         */
        public String getEventTag() {
            return this.eventTag;
        }

        /**
         * @return isPersistent
         */
        public Long getIsPersistent() {
            return this.isPersistent;
        }

        public static final class Builder {
            private Long endTime; 
            private String eventBlock; 
            private String eventCnt; 
            private String eventCondition; 
            private String eventIntelligence; 
            private String eventLevel; 
            private String eventSrc; 
            private String eventSrcCountry; 
            private String eventSrcRegion; 
            private String eventSuggest; 
            private String eventTag; 
            private Long isPersistent; 

            private Builder() {
            } 

            private Builder(ThreatEventDetail model) {
                this.endTime = model.endTime;
                this.eventBlock = model.eventBlock;
                this.eventCnt = model.eventCnt;
                this.eventCondition = model.eventCondition;
                this.eventIntelligence = model.eventIntelligence;
                this.eventLevel = model.eventLevel;
                this.eventSrc = model.eventSrc;
                this.eventSrcCountry = model.eventSrcCountry;
                this.eventSrcRegion = model.eventSrcRegion;
                this.eventSuggest = model.eventSuggest;
                this.eventTag = model.eventTag;
                this.isPersistent = model.isPersistent;
            } 

            /**
             * <p>The time of the most recent attack. This value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1749916800000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The number of attacks that were blocked in the security event.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder eventBlock(String eventBlock) {
                this.eventBlock = eventBlock;
                return this;
            }

            /**
             * <p>The total number of attacks in the security event.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder eventCnt(String eventCnt) {
                this.eventCnt = eventCnt;
                return this;
            }

            /**
             * <p>The filter condition for viewing logs. The value is a JSON object in the string format.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;end_ts&quot;: 1766637714, &quot;start_ts&quot;: 1764096746, &quot;condition&quot;: {&quot;real_client_ip&quot;: [&quot;78.153.140.179&quot;, &quot;78.153.140.203&quot;, &quot;78.153.140.177&quot;, &quot;78.153.140.178&quot;, &quot;78.153.140.151&quot;]}}</p>
             */
            public Builder eventCondition(String eventCondition) {
                this.eventCondition = eventCondition;
                return this;
            }

            /**
             * <p>The threat intelligence associated with the event. The value is a JSON array in the string format.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;CVE-2020-14882&quot;,&quot;DDoS Attack&quot;]</p>
             */
            public Builder eventIntelligence(String eventIntelligence) {
                this.eventIntelligence = eventIntelligence;
                return this;
            }

            /**
             * <p>The severity level of the event. Valid values:</p>
             * <ul>
             * <li><p><strong>critical</strong>: Critical severity.</p>
             * </li>
             * <li><p><strong>high</strong>: High severity.</p>
             * </li>
             * <li><p><strong>medium</strong>: Medium severity.</p>
             * </li>
             * <li><p><strong>low</strong>: Low severity.</p>
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
             * <p>XX.XX.XX.XX</p>
             */
            public Builder eventSrc(String eventSrc) {
                this.eventSrc = eventSrc;
                return this;
            }

            /**
             * <p>The country of the source IP address of the attack.</p>
             * 
             * <strong>example:</strong>
             * <p>GB</p>
             */
            public Builder eventSrcCountry(String eventSrcCountry) {
                this.eventSrcCountry = eventSrcCountry;
                return this;
            }

            /**
             * <p>The region of the source IP address of the attack.</p>
             * 
             * <strong>example:</strong>
             * <p>GB-ENG</p>
             */
            public Builder eventSrcRegion(String eventSrcRegion) {
                this.eventSrcRegion = eventSrcRegion;
                return this;
            }

            /**
             * <p>The security suggestion. Valid values:</p>
             * <ul>
             * <li><p><strong>ProtectInterface</strong>: The attack target appears to be a backend management address. If the address has specific access patterns, configure custom rules in the access control module to restrict access.</p>
             * </li>
             * <li><p><strong>BlockArea</strong>: Monitor the attack source region. If the attack source region is different from your normal business regions, configure a location blacklist or an IP address blacklist in the access control module to restrict access.</p>
             * </li>
             * <li><p><strong>SwitchBlock</strong>: The current protection rule is in Alert mode. To ensure business security, switch to Block mode. Before you switch, check for false positives.</p>
             * </li>
             * <li><p><strong>FixBug</strong>: Check the attack target for security vulnerabilities. If any vulnerabilities exist, fix them promptly to prevent exploitation.</p>
             * </li>
             * <li><p><strong>SwitchStrict</strong>: If it does not affect your normal business, change the policies of modules, such as protection rules and scan protection, to a stricter mode. Before you change the policies, check for false positives.</p>
             * </li>
             * <li><p><strong>ProtectFile</strong>: Check the target domain name for sensitive files or paths to prevent them from being detected and exploited.</p>
             * </li>
             * <li><p><strong>BlockIP</strong>: The source IP address has a high degree of maliciousness. Keep monitoring it. If it does not affect your normal business, use an IP address blacklist to block access from the malicious IP address.</p>
             * </li>
             * <li><p><strong>KeepConcerned</strong>: No threats are found. Continue to monitor the situation.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FixBug</p>
             */
            public Builder eventSuggest(String eventSuggest) {
                this.eventSuggest = eventSuggest;
                return this;
            }

            /**
             * <p>The name of the event. Valid values:</p>
             * <ul>
             * <li><p><strong>MultipleDomainDirscan</strong>: A directory and file scan for multiple domain names.</p>
             * </li>
             * <li><p><strong>SingleDomainDirscan</strong>: A directory and file scan for a single domain name.</p>
             * </li>
             * <li><p><strong>MultipleDomainWebscan</strong>: A web vulnerability scan for multiple domain names.</p>
             * </li>
             * <li><p><strong>SingleDomainWebscan</strong>: A web vulnerability scan for a single domain name.</p>
             * </li>
             * <li><p><strong>MultipleDomainWebattack</strong>: A web vulnerability attack on multiple domain names.</p>
             * </li>
             * <li><p><strong>SingleDomainWebattack</strong>: A web vulnerability attack on a single domain name.</p>
             * </li>
             * <li><p><strong>SingleURLWebattack</strong>: A web vulnerability attack on a specific URL.</p>
             * </li>
             * <li><p><strong>SingleURLSqlattack</strong>: An SQL injection attack on a specific URL.</p>
             * </li>
             * <li><p><strong>SingleURLXssattack</strong>: A cross-site scripting (XSS) attack on a specific URL.</p>
             * </li>
             * <li><p><strong>WebshellUpload</strong>: An attempt to upload backdoor trojans.</p>
             * </li>
             * <li><p><strong>RandomVulnTest</strong>: A random web vulnerability probe.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>MultipleDomainWebattack</p>
             */
            public Builder eventTag(String eventTag) {
                this.eventTag = eventTag;
                return this;
            }

            /**
             * <p>Indicates whether the event is a persistent attack. Valid values:</p>
             * <ul>
             * <li><p><strong>0</strong>: The event is not a persistent attack.</p>
             * </li>
             * <li><p><strong>1</strong>: The event is a persistent attack.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder isPersistent(Long isPersistent) {
                this.isPersistent = isPersistent;
                return this;
            }

            public ThreatEventDetail build() {
                return new ThreatEventDetail(this);
            } 

        } 

    }
}
