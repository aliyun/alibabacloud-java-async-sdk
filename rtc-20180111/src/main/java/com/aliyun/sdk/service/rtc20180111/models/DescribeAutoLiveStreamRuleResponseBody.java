// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAutoLiveStreamRuleResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAutoLiveStreamRuleResponseBody</p>
 */
public class DescribeAutoLiveStreamRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Rules")
    private java.util.List < Rules> rules;

    private DescribeAutoLiveStreamRuleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.rules = builder.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAutoLiveStreamRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return rules
     */
    public java.util.List < Rules> getRules() {
        return this.rules;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Rules> rules; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Rules.
         */
        public Builder rules(java.util.List < Rules> rules) {
            this.rules = rules;
            return this;
        }

        public DescribeAutoLiveStreamRuleResponseBody build() {
            return new DescribeAutoLiveStreamRuleResponseBody(this);
        } 

    } 

    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallBack")
        private String callBack;

        @com.aliyun.core.annotation.NameInMap("ChannelIdPrefixes")
        private java.util.List < String > channelIdPrefixes;

        @com.aliyun.core.annotation.NameInMap("ChannelIds")
        private java.util.List < String > channelIds;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("MediaEncode")
        private Integer mediaEncode;

        @com.aliyun.core.annotation.NameInMap("PlayDomain")
        private String playDomain;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private Long ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Rules(Builder builder) {
            this.callBack = builder.callBack;
            this.channelIdPrefixes = builder.channelIdPrefixes;
            this.channelIds = builder.channelIds;
            this.createTime = builder.createTime;
            this.mediaEncode = builder.mediaEncode;
            this.playDomain = builder.playDomain;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return callBack
         */
        public String getCallBack() {
            return this.callBack;
        }

        /**
         * @return channelIdPrefixes
         */
        public java.util.List < String > getChannelIdPrefixes() {
            return this.channelIdPrefixes;
        }

        /**
         * @return channelIds
         */
        public java.util.List < String > getChannelIds() {
            return this.channelIds;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return mediaEncode
         */
        public Integer getMediaEncode() {
            return this.mediaEncode;
        }

        /**
         * @return playDomain
         */
        public String getPlayDomain() {
            return this.playDomain;
        }

        /**
         * @return ruleId
         */
        public Long getRuleId() {
            return this.ruleId;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String callBack; 
            private java.util.List < String > channelIdPrefixes; 
            private java.util.List < String > channelIds; 
            private String createTime; 
            private Integer mediaEncode; 
            private String playDomain; 
            private Long ruleId; 
            private String ruleName; 
            private String status; 

            /**
             * CallBack.
             */
            public Builder callBack(String callBack) {
                this.callBack = callBack;
                return this;
            }

            /**
             * ChannelIdPrefixes.
             */
            public Builder channelIdPrefixes(java.util.List < String > channelIdPrefixes) {
                this.channelIdPrefixes = channelIdPrefixes;
                return this;
            }

            /**
             * ChannelIds.
             */
            public Builder channelIds(java.util.List < String > channelIds) {
                this.channelIds = channelIds;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * MediaEncode.
             */
            public Builder mediaEncode(Integer mediaEncode) {
                this.mediaEncode = mediaEncode;
                return this;
            }

            /**
             * PlayDomain.
             */
            public Builder playDomain(String playDomain) {
                this.playDomain = playDomain;
                return this;
            }

            /**
             * RuleId.
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * RuleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
}
