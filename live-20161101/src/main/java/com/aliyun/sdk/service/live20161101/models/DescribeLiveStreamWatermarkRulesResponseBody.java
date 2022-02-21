// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveStreamWatermarkRulesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveStreamWatermarkRulesResponseBody</p>
 */
public class DescribeLiveStreamWatermarkRulesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RuleInfoList")
    private RuleInfoList ruleInfoList;

    private DescribeLiveStreamWatermarkRulesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.ruleInfoList = builder.ruleInfoList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveStreamWatermarkRulesResponseBody create() {
        return builder().build();
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

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RuleInfoList.
         */
        public Builder ruleInfoList(RuleInfoList ruleInfoList) {
            this.ruleInfoList = ruleInfoList;
            return this;
        }

        public DescribeLiveStreamWatermarkRulesResponseBody build() {
            return new DescribeLiveStreamWatermarkRulesResponseBody(this);
        } 

    } 

    public static class RuleInfo extends TeaModel {
        @NameInMap("App")
        private String app;

        @NameInMap("Description")
        private String description;

        @NameInMap("Domain")
        private String domain;

        @NameInMap("Name")
        private String name;

        @NameInMap("RuleId")
        private String ruleId;

        @NameInMap("Stream")
        private String stream;

        @NameInMap("TemplateId")
        private String templateId;

        private RuleInfo(Builder builder) {
            this.app = builder.app;
            this.description = builder.description;
            this.domain = builder.domain;
            this.name = builder.name;
            this.ruleId = builder.ruleId;
            this.stream = builder.stream;
            this.templateId = builder.templateId;
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
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        /**
         * @return stream
         */
        public String getStream() {
            return this.stream;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        public static final class Builder {
            private String app; 
            private String description; 
            private String domain; 
            private String name; 
            private String ruleId; 
            private String stream; 
            private String templateId; 

            /**
             * App.
             */
            public Builder app(String app) {
                this.app = app;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * RuleId.
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * Stream.
             */
            public Builder stream(String stream) {
                this.stream = stream;
                return this;
            }

            /**
             * TemplateId.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            public RuleInfo build() {
                return new RuleInfo(this);
            } 

        } 

    }
    public static class RuleInfoList extends TeaModel {
        @NameInMap("RuleInfo")
        private java.util.List < RuleInfo> ruleInfo;

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
        public java.util.List < RuleInfo> getRuleInfo() {
            return this.ruleInfo;
        }

        public static final class Builder {
            private java.util.List < RuleInfo> ruleInfo; 

            /**
             * RuleInfo.
             */
            public Builder ruleInfo(java.util.List < RuleInfo> ruleInfo) {
                this.ruleInfo = ruleInfo;
                return this;
            }

            public RuleInfoList build() {
                return new RuleInfoList(this);
            } 

        } 

    }
}
