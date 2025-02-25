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
 * {@link DescribeApisecAbnormalsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApisecAbnormalsResponseBody</p>
 */
public class DescribeApisecAbnormalsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeApisecAbnormalsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApisecAbnormalsResponseBody create() {
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
         * <p>The risks.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9469646C-F2CC-5F0F-8401-C53***4F46</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>35</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeApisecAbnormalsResponseBody build() {
            return new DescribeApisecAbnormalsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeApisecAbnormalsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApisecAbnormalsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AbnormalEventNumber")
        private Long abnormalEventNumber;

        @com.aliyun.core.annotation.NameInMap("AbnormalId")
        private String abnormalId;

        @com.aliyun.core.annotation.NameInMap("AbnormalInfo")
        private String abnormalInfo;

        @com.aliyun.core.annotation.NameInMap("AbnormalLevel")
        private String abnormalLevel;

        @com.aliyun.core.annotation.NameInMap("AbnormalTag")
        private String abnormalTag;

        @com.aliyun.core.annotation.NameInMap("AbnromalStatus")
        private String abnromalStatus;

        @com.aliyun.core.annotation.NameInMap("ApiFormat")
        private String apiFormat;

        @com.aliyun.core.annotation.NameInMap("ApiId")
        private String apiId;

        @com.aliyun.core.annotation.NameInMap("ApiTag")
        private String apiTag;

        @com.aliyun.core.annotation.NameInMap("DiscoverTime")
        private Long discoverTime;

        @com.aliyun.core.annotation.NameInMap("Examples")
        private java.util.List<String> examples;

        @com.aliyun.core.annotation.NameInMap("FirstTime")
        private Long firstTime;

        @com.aliyun.core.annotation.NameInMap("Follow")
        private Long follow;

        @com.aliyun.core.annotation.NameInMap("IgnoreTime")
        private Long ignoreTime;

        @com.aliyun.core.annotation.NameInMap("LastestTime")
        private Long lastestTime;

        @com.aliyun.core.annotation.NameInMap("MatchedHost")
        private String matchedHost;

        @com.aliyun.core.annotation.NameInMap("Note")
        private String note;

        @com.aliyun.core.annotation.NameInMap("Origin")
        private String origin;

        @com.aliyun.core.annotation.NameInMap("UserStatus")
        private String userStatus;

        private Data(Builder builder) {
            this.abnormalEventNumber = builder.abnormalEventNumber;
            this.abnormalId = builder.abnormalId;
            this.abnormalInfo = builder.abnormalInfo;
            this.abnormalLevel = builder.abnormalLevel;
            this.abnormalTag = builder.abnormalTag;
            this.abnromalStatus = builder.abnromalStatus;
            this.apiFormat = builder.apiFormat;
            this.apiId = builder.apiId;
            this.apiTag = builder.apiTag;
            this.discoverTime = builder.discoverTime;
            this.examples = builder.examples;
            this.firstTime = builder.firstTime;
            this.follow = builder.follow;
            this.ignoreTime = builder.ignoreTime;
            this.lastestTime = builder.lastestTime;
            this.matchedHost = builder.matchedHost;
            this.note = builder.note;
            this.origin = builder.origin;
            this.userStatus = builder.userStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return abnormalEventNumber
         */
        public Long getAbnormalEventNumber() {
            return this.abnormalEventNumber;
        }

        /**
         * @return abnormalId
         */
        public String getAbnormalId() {
            return this.abnormalId;
        }

        /**
         * @return abnormalInfo
         */
        public String getAbnormalInfo() {
            return this.abnormalInfo;
        }

        /**
         * @return abnormalLevel
         */
        public String getAbnormalLevel() {
            return this.abnormalLevel;
        }

        /**
         * @return abnormalTag
         */
        public String getAbnormalTag() {
            return this.abnormalTag;
        }

        /**
         * @return abnromalStatus
         */
        public String getAbnromalStatus() {
            return this.abnromalStatus;
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
         * @return discoverTime
         */
        public Long getDiscoverTime() {
            return this.discoverTime;
        }

        /**
         * @return examples
         */
        public java.util.List<String> getExamples() {
            return this.examples;
        }

        /**
         * @return firstTime
         */
        public Long getFirstTime() {
            return this.firstTime;
        }

        /**
         * @return follow
         */
        public Long getFollow() {
            return this.follow;
        }

        /**
         * @return ignoreTime
         */
        public Long getIgnoreTime() {
            return this.ignoreTime;
        }

        /**
         * @return lastestTime
         */
        public Long getLastestTime() {
            return this.lastestTime;
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
         * @return userStatus
         */
        public String getUserStatus() {
            return this.userStatus;
        }

        public static final class Builder {
            private Long abnormalEventNumber; 
            private String abnormalId; 
            private String abnormalInfo; 
            private String abnormalLevel; 
            private String abnormalTag; 
            private String abnromalStatus; 
            private String apiFormat; 
            private String apiId; 
            private String apiTag; 
            private Long discoverTime; 
            private java.util.List<String> examples; 
            private Long firstTime; 
            private Long follow; 
            private Long ignoreTime; 
            private Long lastestTime; 
            private String matchedHost; 
            private String note; 
            private String origin; 
            private String userStatus; 

            /**
             * <p>The number of risk-related security events.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder abnormalEventNumber(Long abnormalEventNumber) {
                this.abnormalEventNumber = abnormalEventNumber;
                return this;
            }

            /**
             * <p>The ID of the risk.</p>
             * 
             * <strong>example:</strong>
             * <p>7c1431f27ae7e9c8cc64095***68e</p>
             */
            public Builder abnormalId(String abnormalId) {
                this.abnormalId = abnormalId;
                return this;
            }

            /**
             * <p>The details of the risk. The value is a string that consists of multiple parameters in the JSON format. Valid values:</p>
             * <ul>
             * <li><strong>rule</strong>: risk-related rule</li>
             * <li><strong>data_type</strong>: sensitive data type</li>
             * <li><strong>custom_rule_name</strong>: custom rule name</li>
             * <li><strong>rule_name</strong>: built-in rule name</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{ &quot;data_type&quot;: [&quot;1005&quot;,&quot;1004&quot;], &quot;rule&quot;: { &quot;parent&quot;: &quot;RiskType_Permission&quot;, &quot;code&quot;: &quot;Risk_UnauthSensitive&quot;, &quot;level&quot;: &quot;high&quot;, &quot;origin&quot;: &quot;default&quot;, &quot;name&quot;: &quot;Risk_UnauthSensitive&quot; } }</p>
             */
            public Builder abnormalInfo(String abnormalInfo) {
                this.abnormalInfo = abnormalInfo;
                return this;
            }

            /**
             * <p>The level of the risk. Valid values:</p>
             * <ul>
             * <li><strong>high</strong></li>
             * <li><strong>medium</strong></li>
             * <li><strong>low</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder abnormalLevel(String abnormalLevel) {
                this.abnormalLevel = abnormalLevel;
                return this;
            }

            /**
             * <p>The type of the risk.</p>
             * <blockquote>
             * <p> You can call the <a href="https://help.aliyun.com/document_detail/2859155.html">DescribeApisecRules</a> operation to query the supported types of risks.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>LackOfSpeedLimit</p>
             */
            public Builder abnormalTag(String abnormalTag) {
                this.abnormalTag = abnormalTag;
                return this;
            }

            /**
             * <p>The status of the risk.</p>
             * 
             * <strong>example:</strong>
             * <p>unresolved</p>
             */
            public Builder abnromalStatus(String abnromalStatus) {
                this.abnromalStatus = abnromalStatus;
                return this;
            }

            /**
             * <p>The risk-related API.</p>
             * 
             * <strong>example:</strong>
             * <p>/api/login</p>
             */
            public Builder apiFormat(String apiFormat) {
                this.apiFormat = apiFormat;
                return this;
            }

            /**
             * <p>The ID of the risk-related API.</p>
             * 
             * <strong>example:</strong>
             * <p>09559c0d71ca2ffc996b81***836d8</p>
             */
            public Builder apiId(String apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * <p>The business purpose of the API.</p>
             * <blockquote>
             * <p> You can call the <a href="https://help.aliyun.com/document_detail/2859155.html">DescribeApisecRules</a> operation to query the business purposes of APIs.</p>
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
             * <p>The time at which the risk was detected. The value is a UNIX timestamp displayed in UTC. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1684252800</p>
             */
            public Builder discoverTime(Long discoverTime) {
                this.discoverTime = discoverTime;
                return this;
            }

            /**
             * <p>The risk-related samples.</p>
             */
            public Builder examples(java.util.List<String> examples) {
                this.examples = examples;
                return this;
            }

            /**
             * <p>The time at which the risk was first detected. The value is a UNIX timestamp displayed in UTC. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1701138088</p>
             */
            public Builder firstTime(Long firstTime) {
                this.firstTime = firstTime;
                return this;
            }

            /**
             * <p>Indicates whether the API is followed. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: yes</li>
             * <li><strong>0</strong>(default): no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder follow(Long follow) {
                this.follow = follow;
                return this;
            }

            /**
             * <p>The time at which the risk was marked as ignored. The value is a UNIX timestamp displayed in UTC. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1684252800</p>
             */
            public Builder ignoreTime(Long ignoreTime) {
                this.ignoreTime = ignoreTime;
                return this;
            }

            /**
             * <p>The time at which the risk was last active. The value is a UNIX timestamp displayed in UTC. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1684252800</p>
             */
            public Builder lastestTime(Long lastestTime) {
                this.lastestTime = lastestTime;
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
             * <p>Business side notified</p>
             */
            public Builder note(String note) {
                this.note = note;
                return this;
            }

            /**
             * <p>The source of the risk type. Valid values:</p>
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
             * <p>The status of the risk. Valid values:</p>
             * <ul>
             * <li><strong>toBeConfirmed</strong></li>
             * <li><strong>confirmed</strong></li>
             * <li><strong>toBeFixed</strong></li>
             * <li><strong>fixed</strong></li>
             * <li><strong>ignored</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Confirmed</p>
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
