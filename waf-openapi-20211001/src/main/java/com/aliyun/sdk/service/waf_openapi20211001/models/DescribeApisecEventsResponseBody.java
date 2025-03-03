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
 * {@link DescribeApisecEventsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApisecEventsResponseBody</p>
 */
public class DescribeApisecEventsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeApisecEventsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApisecEventsResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
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
        private java.util.List<Data> data; 
        private String requestId; 
        private Long totalCount; 

        /**
         * <p>The security events.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12F4CC8F-7E9F-5E4D-BF7C-BD1EDDE0C282</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeApisecEventsResponseBody build() {
            return new DescribeApisecEventsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeApisecEventsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApisecEventsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllCnt")
        private Long allCnt;

        @com.aliyun.core.annotation.NameInMap("ApiFormat")
        private String apiFormat;

        @com.aliyun.core.annotation.NameInMap("ApiId")
        private String apiId;

        @com.aliyun.core.annotation.NameInMap("ApiTag")
        private String apiTag;

        @com.aliyun.core.annotation.NameInMap("AttackClient")
        private String attackClient;

        @com.aliyun.core.annotation.NameInMap("AttackCntInfo")
        private String attackCntInfo;

        @com.aliyun.core.annotation.NameInMap("AttackIp")
        private String attackIp;

        @com.aliyun.core.annotation.NameInMap("AttackIpInfo")
        private String attackIpInfo;

        @com.aliyun.core.annotation.NameInMap("AttackIps")
        private java.util.List<String> attackIps;

        @com.aliyun.core.annotation.NameInMap("EndTs")
        private Long endTs;

        @com.aliyun.core.annotation.NameInMap("EventId")
        private String eventId;

        @com.aliyun.core.annotation.NameInMap("EventInfo")
        private String eventInfo;

        @com.aliyun.core.annotation.NameInMap("EventLevel")
        private String eventLevel;

        @com.aliyun.core.annotation.NameInMap("EventTag")
        private String eventTag;

        @com.aliyun.core.annotation.NameInMap("Follow")
        private Integer follow;

        @com.aliyun.core.annotation.NameInMap("MatchedHost")
        private String matchedHost;

        @com.aliyun.core.annotation.NameInMap("Note")
        private String note;

        @com.aliyun.core.annotation.NameInMap("Origin")
        private String origin;

        @com.aliyun.core.annotation.NameInMap("RemoteCountry")
        private String remoteCountry;

        @com.aliyun.core.annotation.NameInMap("RemoteRegion")
        private String remoteRegion;

        @com.aliyun.core.annotation.NameInMap("RequestData")
        private String requestData;

        @com.aliyun.core.annotation.NameInMap("ResponseData")
        private String responseData;

        @com.aliyun.core.annotation.NameInMap("StartTs")
        private Long startTs;

        @com.aliyun.core.annotation.NameInMap("UserStatus")
        private String userStatus;

        private Data(Builder builder) {
            this.allCnt = builder.allCnt;
            this.apiFormat = builder.apiFormat;
            this.apiId = builder.apiId;
            this.apiTag = builder.apiTag;
            this.attackClient = builder.attackClient;
            this.attackCntInfo = builder.attackCntInfo;
            this.attackIp = builder.attackIp;
            this.attackIpInfo = builder.attackIpInfo;
            this.attackIps = builder.attackIps;
            this.endTs = builder.endTs;
            this.eventId = builder.eventId;
            this.eventInfo = builder.eventInfo;
            this.eventLevel = builder.eventLevel;
            this.eventTag = builder.eventTag;
            this.follow = builder.follow;
            this.matchedHost = builder.matchedHost;
            this.note = builder.note;
            this.origin = builder.origin;
            this.remoteCountry = builder.remoteCountry;
            this.remoteRegion = builder.remoteRegion;
            this.requestData = builder.requestData;
            this.responseData = builder.responseData;
            this.startTs = builder.startTs;
            this.userStatus = builder.userStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return allCnt
         */
        public Long getAllCnt() {
            return this.allCnt;
        }

        /**
         * @return apiFormat
         */
        public String getApiFormat() {
            return this.apiFormat;
        }

        /**
         * @return apiId
         */
        public String getApiId() {
            return this.apiId;
        }

        /**
         * @return apiTag
         */
        public String getApiTag() {
            return this.apiTag;
        }

        /**
         * @return attackClient
         */
        public String getAttackClient() {
            return this.attackClient;
        }

        /**
         * @return attackCntInfo
         */
        public String getAttackCntInfo() {
            return this.attackCntInfo;
        }

        /**
         * @return attackIp
         */
        public String getAttackIp() {
            return this.attackIp;
        }

        /**
         * @return attackIpInfo
         */
        public String getAttackIpInfo() {
            return this.attackIpInfo;
        }

        /**
         * @return attackIps
         */
        public java.util.List<String> getAttackIps() {
            return this.attackIps;
        }

        /**
         * @return endTs
         */
        public Long getEndTs() {
            return this.endTs;
        }

        /**
         * @return eventId
         */
        public String getEventId() {
            return this.eventId;
        }

        /**
         * @return eventInfo
         */
        public String getEventInfo() {
            return this.eventInfo;
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

        /**
         * @return follow
         */
        public Integer getFollow() {
            return this.follow;
        }

        /**
         * @return matchedHost
         */
        public String getMatchedHost() {
            return this.matchedHost;
        }

        /**
         * @return note
         */
        public String getNote() {
            return this.note;
        }

        /**
         * @return origin
         */
        public String getOrigin() {
            return this.origin;
        }

        /**
         * @return remoteCountry
         */
        public String getRemoteCountry() {
            return this.remoteCountry;
        }

        /**
         * @return remoteRegion
         */
        public String getRemoteRegion() {
            return this.remoteRegion;
        }

        /**
         * @return requestData
         */
        public String getRequestData() {
            return this.requestData;
        }

        /**
         * @return responseData
         */
        public String getResponseData() {
            return this.responseData;
        }

        /**
         * @return startTs
         */
        public Long getStartTs() {
            return this.startTs;
        }

        /**
         * @return userStatus
         */
        public String getUserStatus() {
            return this.userStatus;
        }

        public static final class Builder {
            private Long allCnt; 
            private String apiFormat; 
            private String apiId; 
            private String apiTag; 
            private String attackClient; 
            private String attackCntInfo; 
            private String attackIp; 
            private String attackIpInfo; 
            private java.util.List<String> attackIps; 
            private Long endTs; 
            private String eventId; 
            private String eventInfo; 
            private String eventLevel; 
            private String eventTag; 
            private Integer follow; 
            private String matchedHost; 
            private String note; 
            private String origin; 
            private String remoteCountry; 
            private String remoteRegion; 
            private String requestData; 
            private String responseData; 
            private Long startTs; 
            private String userStatus; 

            /**
             * <p>The number of attacks.</p>
             * <blockquote>
             * <p>Notice: The parameter has been deprecated, please use the Attackips parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder allCnt(Long allCnt) {
                this.allCnt = allCnt;
                return this;
            }

            /**
             * <p>The API.</p>
             * 
             * <strong>example:</strong>
             * <p>/apisec/v1/register.php</p>
             */
            public Builder apiFormat(String apiFormat) {
                this.apiFormat = apiFormat;
                return this;
            }

            /**
             * <p>The ID of the API that is associated with the security event.</p>
             * 
             * <strong>example:</strong>
             * <p>2ecc1cf67b91853bc55545052ccf06a8</p>
             */
            public Builder apiId(String apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * <p>The business purpose of the API.</p>
             * <blockquote>
             * <p> You can call the <a href="https://help.aliyun.com/document_detail/2859155.html">DescribeApisecRules</a> operation to query the business purpose of the API.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>SendMail</p>
             */
            public Builder apiTag(String apiTag) {
                this.apiTag = apiTag;
                return this;
            }

            /**
             * <p>The client that is attacked.</p>
             * 
             * <strong>example:</strong>
             * <p>Chrome</p>
             */
            public Builder attackClient(String attackClient) {
                this.attackClient = attackClient;
                return this;
            }

            /**
             * <p>The information about the number of attacks. The value of this parameter is a JSON string that contains multiple parameters. Key indicates the timestamp in seconds, and Value indicates the number of attacks.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;1717498320&quot;:500,&quot;1717498380&quot;:529,&quot;1717498440&quot;:20,&quot;1717498260&quot;:518,&quot;1717498200&quot;:481,&quot;1717498140&quot;:52}</p>
             */
            public Builder attackCntInfo(String attackCntInfo) {
                this.attackCntInfo = attackCntInfo;
                return this;
            }

            /**
             * <p>The source IP address of the attack.</p>
             * 
             * <strong>example:</strong>
             * <p>104.234.140.33</p>
             */
            public Builder attackIp(String attackIp) {
                this.attackIp = attackIp;
                return this;
            }

            /**
             * <p>The information about the attack source IP address. The value of this parameter is a JSON string that contains multiple parameters. The value includes the following parameters:</p>
             * <ul>
             * <li><strong>ip</strong>: the IP address</li>
             * <li><strong>country_id</strong>: the country ID</li>
             * <li><strong>region_id</strong>: the region ID</li>
             * <li><strong>cnt</strong>: the number of attacks</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;ip&quot;:&quot;72.<em>.</em>.119&quot;,&quot;country_id&quot;:&quot;US&quot;,&quot;region_id&quot;:&quot;&quot;,&quot;cnt&quot;:&quot;2100&quot;}]</p>
             */
            public Builder attackIpInfo(String attackIpInfo) {
                this.attackIpInfo = attackIpInfo;
                return this;
            }

            /**
             * <p>The source IP addresses of the attacks.</p>
             */
            public Builder attackIps(java.util.List<String> attackIps) {
                this.attackIps = attackIps;
                return this;
            }

            /**
             * <p>The end of the time range to query. This value is a UNIX timestamp in UTC. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1683703260</p>
             */
            public Builder endTs(Long endTs) {
                this.endTs = endTs;
                return this;
            }

            /**
             * <p>The ID of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>c82cb276847e9c96f9597d9f4b0cdcff</p>
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * <p>The details of the event. The value of this parameter is a JSON string that contains multiple parameters. The value includes the following parameters:</p>
             * <ul>
             * <li><strong>ip_info</strong>: the information about the attack source IP address. This parameter corresponds to the <strong>AttackIpInfo</strong> response parameter.</li>
             * <li><strong>rule_id</strong>: the ID of the rule corresponding to the event.</li>
             * <li><strong>rule_tag</strong>: the information about the rule corresponding to the event.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder eventInfo(String eventInfo) {
                this.eventInfo = eventInfo;
                return this;
            }

            /**
             * <p>The severity level of the event. Valid values:</p>
             * <ul>
             * <li><strong>high</strong></li>
             * <li><strong>medium</strong></li>
             * <li><strong>low</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>medium</p>
             */
            public Builder eventLevel(String eventLevel) {
                this.eventLevel = eventLevel;
                return this;
            }

            /**
             * <p>The type of the event.</p>
             * <blockquote>
             * <p> You can call the <a href="https://help.aliyun.com/document_detail/2859155.html">DescribeApisecRules</a> operation to query the supported event types.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>ObtainSensitiveUnauthorized</p>
             */
            public Builder eventTag(String eventTag) {
                this.eventTag = eventTag;
                return this;
            }

            /**
             * <p>Indicates whether the API is followed. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: The API is followed.</li>
             * <li><strong>0</strong>: The API is not followed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder follow(Integer follow) {
                this.follow = follow;
                return this;
            }

            /**
             * <p>The domain name or IP address of the API.</p>
             * 
             * <strong>example:</strong>
             * <p>a.aliyun.com</p>
             */
            public Builder matchedHost(String matchedHost) {
                this.matchedHost = matchedHost;
                return this;
            }

            /**
             * <p>The remarks.</p>
             * 
             * <strong>example:</strong>
             * <p>Notified</p>
             */
            public Builder note(String note) {
                this.note = note;
                return this;
            }

            /**
             * <p>The source of the event type. Valid values:</p>
             * <ul>
             * <li><strong>custom</strong></li>
             * <li><strong>default</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>custom</p>
             */
            public Builder origin(String origin) {
                this.origin = origin;
                return this;
            }

            /**
             * <p>The country to which the attack source IP address belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>US</p>
             */
            public Builder remoteCountry(String remoteCountry) {
                this.remoteCountry = remoteCountry;
                return this;
            }

            /**
             * <p>The region to which the attack source IP address belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>110000</p>
             */
            public Builder remoteRegion(String remoteRegion) {
                this.remoteRegion = remoteRegion;
                return this;
            }

            /**
             * <p>The sample API request. The value of this parameter is a JSON string that contains multiple parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder requestData(String requestData) {
                this.requestData = requestData;
                return this;
            }

            /**
             * <p>The sample API response. The value of this parameter is a JSON string that contains multiple parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder responseData(String responseData) {
                this.responseData = responseData;
                return this;
            }

            /**
             * <p>The beginning of the time range to query. This value is a UNIX timestamp in UTC. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1683648000</p>
             */
            public Builder startTs(Long startTs) {
                this.startTs = startTs;
                return this;
            }

            /**
             * <p>The event status. Valid values:</p>
             * <ul>
             * <li><strong>toBeConfirmed</strong></li>
             * <li><strong>confirmed</strong></li>
             * <li><strong>ignored</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Ignore</p>
             */
            public Builder userStatus(String userStatus) {
                this.userStatus = userStatus;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
