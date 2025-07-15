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
 * {@link DescribeLiveStreamWatermarkRulesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveStreamWatermarkRulesResponseBody</p>
 */
public class DescribeLiveStreamWatermarkRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RuleInfoList")
    private RuleInfoList ruleInfoList;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private DescribeLiveStreamWatermarkRulesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.ruleInfoList = builder.ruleInfoList;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveStreamWatermarkRulesResponseBody create() {
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

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String requestId; 
        private RuleInfoList ruleInfoList; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(DescribeLiveStreamWatermarkRulesResponseBody model) {
            this.requestId = model.requestId;
            this.ruleInfoList = model.ruleInfoList;
            this.total = model.total;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5c6a2a0df228-4a64- af62-20e91b9676b3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The watermark rules.</p>
         */
        public Builder ruleInfoList(RuleInfoList ruleInfoList) {
            this.ruleInfoList = ruleInfoList;
            return this;
        }

        /**
         * <p>The total number of entries that meet the specified conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeLiveStreamWatermarkRulesResponseBody build() {
            return new DescribeLiveStreamWatermarkRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveStreamWatermarkRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveStreamWatermarkRulesResponseBody</p>
     */
    public static class RuleInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("App")
        private String app;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("Stream")
        private String stream;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
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

            private Builder() {
            } 

            private Builder(RuleInfo model) {
                this.app = model.app;
                this.description = model.description;
                this.domain = model.domain;
                this.name = model.name;
                this.ruleId = model.ruleId;
                this.stream = model.stream;
                this.templateId = model.templateId;
            } 

            /**
             * <p>The name of the application to which the live stream belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>liveApp****</p>
             */
            public Builder app(String app) {
                this.app = app;
                return this;
            }

            /**
             * <p>The description of the custom rule.</p>
             * 
             * <strong>example:</strong>
             * <p>my rule</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The streaming domain.</p>
             * 
             * <strong>example:</strong>
             * <p>example.aliyundoc.com</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The name of the custom rule.</p>
             * 
             * <strong>example:</strong>
             * <p>WatermarkRule****</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the watermark rule.</p>
             * <blockquote>
             * <p> You can obtain the rule ID by checking the value of the RuleId parameter that is returned by the <a href="https://help.aliyun.com/document_detail/2848100.html">AddLiveStreamWatermarkRule</a> operation.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>445409ec-7eaa-461d -8f29-4bec2eb9****</p>
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The name of the live stream. The following matching rules apply:</p>
             * <ul>
             * <li>A stream name can be exactly matched. Example: liveStreamA.</li>
             * <li>Fuzzy match is also supported. The use of an asterisk (<code>*</code>) allows all approximate matches to be found.</li>
             * <li>You can place the asterisk before or after an approximate string.</li>
             * </ul>
             * <blockquote>
             * </blockquote>
             * <ul>
             * <li><p>Fuzzy match: Only one asterisk (<code>*</code>) before or after an approximate string is allowed. The approximate string must be enclosed in <code>()</code>. Separate multiple strings with vertical bars (<code>|</code>).</p>
             * </li>
             * <li><p>For example, <code>*(t1|t2)</code> matches all streams whose name has the <code>t1</code> or <code>t2</code> suffix, and <code>(abc|123)*</code> matches all streams whose name has the <code>abc</code> or <code>123</code> prefix.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>liveStreamA</p>
             */
            public Builder stream(String stream) {
                this.stream = stream;
                return this;
            }

            /**
             * <p>The ID of the watermark template.</p>
             * <blockquote>
             * <p> You can obtain the template ID by checking the value of the TemplateId parameter that is returned by the <a href="https://help.aliyun.com/document_detail/2848096.html">AddLiveStreamWatermark</a> operation.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>445409ec-7eaa-461d-8f29-4bec2eb9 ****</p>
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
    /**
     * 
     * {@link DescribeLiveStreamWatermarkRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveStreamWatermarkRulesResponseBody</p>
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
