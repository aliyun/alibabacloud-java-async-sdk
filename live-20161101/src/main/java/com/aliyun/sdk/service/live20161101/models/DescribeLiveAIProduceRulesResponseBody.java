// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DescribeLiveAIProduceRulesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveAIProduceRulesResponseBody</p>
 */
public class DescribeLiveAIProduceRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RuleInfoList")
    private RuleInfoList ruleInfoList;

    private DescribeLiveAIProduceRulesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.ruleInfoList = builder.ruleInfoList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveAIProduceRulesResponseBody create() {
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
     * @return ruleInfoList
     */
    public RuleInfoList getRuleInfoList() {
        return this.ruleInfoList;
    }

    public static final class Builder {
        private String requestId; 
        private RuleInfoList ruleInfoList; 

        private Builder() {
        } 

        private Builder(DescribeLiveAIProduceRulesResponseBody model) {
            this.requestId = model.requestId;
            this.ruleInfoList = model.ruleInfoList;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>5c6a2a0df228-4a64- af62-20e91b96****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The subtitle rules.</p>
         */
        public Builder ruleInfoList(RuleInfoList ruleInfoList) {
            this.ruleInfoList = ruleInfoList;
            return this;
        }

        public DescribeLiveAIProduceRulesResponseBody build() {
            return new DescribeLiveAIProduceRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveAIProduceRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveAIProduceRulesResponseBody</p>
     */
    public static class RuleInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("App")
        private String app;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("GmtModifyTime")
        private String gmtModifyTime;

        @com.aliyun.core.annotation.NameInMap("IsLazy")
        private Boolean isLazy;

        @com.aliyun.core.annotation.NameInMap("LiveTemplate")
        private String liveTemplate;

        @com.aliyun.core.annotation.NameInMap("RulesId")
        private String rulesId;

        @com.aliyun.core.annotation.NameInMap("StudioName")
        private String studioName;

        @com.aliyun.core.annotation.NameInMap("SubtitleName")
        private String subtitleName;

        @com.aliyun.core.annotation.NameInMap("SuffixName")
        private String suffixName;

        private RuleInfo(Builder builder) {
            this.app = builder.app;
            this.description = builder.description;
            this.domain = builder.domain;
            this.gmtModifyTime = builder.gmtModifyTime;
            this.isLazy = builder.isLazy;
            this.liveTemplate = builder.liveTemplate;
            this.rulesId = builder.rulesId;
            this.studioName = builder.studioName;
            this.subtitleName = builder.subtitleName;
            this.suffixName = builder.suffixName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleInfo create() {
            return builder().build();
        }

        /**
         * @return app
         */
        public String getApp() {
            return this.app;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return gmtModifyTime
         */
        public String getGmtModifyTime() {
            return this.gmtModifyTime;
        }

        /**
         * @return isLazy
         */
        public Boolean getIsLazy() {
            return this.isLazy;
        }

        /**
         * @return liveTemplate
         */
        public String getLiveTemplate() {
            return this.liveTemplate;
        }

        /**
         * @return rulesId
         */
        public String getRulesId() {
            return this.rulesId;
        }

        /**
         * @return studioName
         */
        public String getStudioName() {
            return this.studioName;
        }

        /**
         * @return subtitleName
         */
        public String getSubtitleName() {
            return this.subtitleName;
        }

        /**
         * @return suffixName
         */
        public String getSuffixName() {
            return this.suffixName;
        }

        public static final class Builder {
            private String app; 
            private String description; 
            private String domain; 
            private String gmtModifyTime; 
            private Boolean isLazy; 
            private String liveTemplate; 
            private String rulesId; 
            private String studioName; 
            private String subtitleName; 
            private String suffixName; 

            private Builder() {
            } 

            private Builder(RuleInfo model) {
                this.app = model.app;
                this.description = model.description;
                this.domain = model.domain;
                this.gmtModifyTime = model.gmtModifyTime;
                this.isLazy = model.isLazy;
                this.liveTemplate = model.liveTemplate;
                this.rulesId = model.rulesId;
                this.studioName = model.studioName;
                this.subtitleName = model.subtitleName;
                this.suffixName = model.suffixName;
            } 

            /**
             * <p>The name of the application to which the live stream belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>App Name</p>
             */
            public Builder app(String app) {
                this.app = app;
                return this;
            }

            /**
             * <p>The description of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>live AI subtitle template</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The streaming domain.</p>
             * 
             * <strong>example:</strong>
             * <p>demo.aliyundoc.com</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The last time when the rule was modified. The value is a timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1715594344000</p>
             */
            public Builder gmtModifyTime(String gmtModifyTime) {
                this.gmtModifyTime = gmtModifyTime;
                return this;
            }

            /**
             * <p>Indicates whether the rule takes effect when stream pulling starts.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isLazy(Boolean isLazy) {
                this.isLazy = isLazy;
                return this;
            }

            /**
             * <p>The specification of the exported subtitles.</p>
             * 
             * <strong>example:</strong>
             * <p>lp_ld</p>
             */
            public Builder liveTemplate(String liveTemplate) {
                this.liveTemplate = liveTemplate;
                return this;
            }

            /**
             * <p>The ID of the subtitle rule.</p>
             * 
             * <strong>example:</strong>
             * <p>72fba656-2cc2-40fd-923c-2a10c3b9****</p>
             */
            public Builder rulesId(String rulesId) {
                this.rulesId = rulesId;
                return this;
            }

            /**
             * <p>The name of the virtual background template.</p>
             * 
             * <strong>example:</strong>
             * <p>test0708</p>
             */
            public Builder studioName(String studioName) {
                this.studioName = studioName;
                return this;
            }

            /**
             * <p>The name of the subtitle template.</p>
             * 
             * <strong>example:</strong>
             * <p>sub1</p>
             */
            public Builder subtitleName(String subtitleName) {
                this.subtitleName = subtitleName;
                return this;
            }

            /**
             * <p>The suffix of the subtitle rule.</p>
             * 
             * <strong>example:</strong>
             * <p>test0506</p>
             */
            public Builder suffixName(String suffixName) {
                this.suffixName = suffixName;
                return this;
            }

            public RuleInfo build() {
                return new RuleInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveAIProduceRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveAIProduceRulesResponseBody</p>
     */
    public static class RuleInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RuleInfo")
        private java.util.List<RuleInfo> ruleInfo;

        private RuleInfoList(Builder builder) {
            this.ruleInfo = builder.ruleInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleInfoList create() {
            return builder().build();
        }

        /**
         * @return ruleInfo
         */
        public java.util.List<RuleInfo> getRuleInfo() {
            return this.ruleInfo;
        }

        public static final class Builder {
            private java.util.List<RuleInfo> ruleInfo; 

            private Builder() {
            } 

            private Builder(RuleInfoList model) {
                this.ruleInfo = model.ruleInfo;
            } 

            /**
             * RuleInfo.
             */
            public Builder ruleInfo(java.util.List<RuleInfo> ruleInfo) {
                this.ruleInfo = ruleInfo;
                return this;
            }

            public RuleInfoList build() {
                return new RuleInfoList(this);
            } 

        } 

    }
}
