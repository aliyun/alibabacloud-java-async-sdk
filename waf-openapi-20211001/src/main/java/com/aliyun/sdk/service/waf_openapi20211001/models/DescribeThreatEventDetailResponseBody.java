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
         * <p>The ID of the request.</p>
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
             * <p>The most recent attack time. The value is a UNIX timestamp in UTC. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1749916800000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The number of blocked attacks.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder eventBlock(String eventBlock) {
                this.eventBlock = eventBlock;
                return this;
            }

            /**
             * <p>The total number of attacks.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder eventCnt(String eventCnt) {
                this.eventCnt = eventCnt;
                return this;
            }

            /**
             * <p>The filter condition for the log query feature. The value is a string converted from a <strong>JSON</strong> structure constructed with a series of parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;end_ts&quot;: 1766637714, &quot;start_ts&quot;: 1764096746, &quot;condition&quot;: {&quot;real_client_ip&quot;: [&quot;78.153.140.179&quot;, &quot;78.153.140.203&quot;, &quot;78.153.140.177&quot;, &quot;78.153.140.178&quot;, &quot;78.153.140.151&quot;]}}</p>
             */
            public Builder eventCondition(String eventCondition) {
                this.eventCondition = eventCondition;
                return this;
            }

            /**
             * <p>The threat intelligence associated with the event. The value is a string converted from a <strong>JSON</strong> array.</p>
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
             * <li><strong>critical</strong>: critical.</li>
             * <li><strong>high</strong>: high.</li>
             * <li><strong>medium</strong>: medium.</li>
             * <li><strong>low</strong>: low.</li>
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
             * <p>The attack source IP addresses.</p>
             * <blockquote>
             * <p>A security event may have multiple attack source IP addresses. This operation returns only one.</p>
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
             * <p>The country to which the attack source IP addresses belong.</p>
             * 
             * <strong>example:</strong>
             * <p>GB</p>
             */
            public Builder eventSrcCountry(String eventSrcCountry) {
                this.eventSrcCountry = eventSrcCountry;
                return this;
            }

            /**
             * <p>The region to which the attack source IP addresses belong.</p>
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
             * <li><strong>ProtectInterface</strong>: The Attack Target is suspected to be a backend management address. If the address has fixed access characteristics, configure custom rules in the access control module to restrict access.</li>
             * <li><strong>BlockArea</strong>: Monitor the source region of the attack. If the attack source differs from the normal regional distribution of your service, configure Location Blacklist or IP blacklist rules in the access control module to restrict access.</li>
             * <li><strong>SwitchBlock</strong>: The current rule protection is in alerting mode. To ensure service security, switch to block mode. Before switching, check for false positives.</li>
             * <li><strong>FixBug</strong>: Check whether the Attack Target has a security vulnerability. If the security vulnerability exists, fix it promptly to prevent exploitation by attackers.</li>
             * <li><strong>SwitchStrict</strong>: If normal service is not affected, adjust the policy of modules such as rule protection and scan protection to a stricter pattern. Before adjusting the policy, check for false positives.</li>
             * <li><strong>ProtectFile</strong>: Check whether sensitive files or paths exist under the target domain name to prevent detection and exploitation by attackers.</li>
             * <li><strong>BlockIP</strong>: The source IP address of the attack is highly malicious. Monitor the IP address. If normal service is not affected, block access from the malicious IP address by using an IP blacklist.</li>
             * <li><strong>KeepConcerned</strong>: No risks are detected. Continue to monitor the event.</li>
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
             * <li><strong>MultipleDomainDirscan</strong>: directory and file scanning targeting multiple domain names</li>
             * <li><strong>SingleDomainDirscan</strong>: directory and file scanning targeting a single domain name</li>
             * <li><strong>MultipleDomainWebscan</strong>: web vulnerability scanning targeting multiple domain names</li>
             * <li><strong>SingleDomainWebscan</strong>: web vulnerability scanning targeting a single domain name</li>
             * <li><strong>MultipleDomainWebattack</strong>: web vulnerability attacks targeting multiple domain names</li>
             * <li><strong>SingleDomainWebattack</strong>: web vulnerability attacks targeting a single domain name</li>
             * <li><strong>SingleURLWebattack</strong>: web vulnerability attacks targeting a specific URL</li>
             * <li><strong>SingleURLSqlattack</strong>: SQL injection attacks targeting a specific URL</li>
             * <li><strong>SingleURLXssattack</strong>: XSS attacks targeting a specific URL</li>
             * <li><strong>WebshellUpload</strong>: attack behavior attempting to upload backdoor trojans</li>
             * <li><strong>RandomVulnTest</strong>: random web vulnerability detection behavior</li>
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
             * <p>Indicates whether the attack event is a targeted persistent attack event. Valid values:</p>
             * <ul>
             * <li><p><strong>0</strong>: non-persistent attack.</p>
             * </li>
             * <li><p><strong>1</strong>: persistent attack.</p>
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
