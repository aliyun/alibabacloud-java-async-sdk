// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link GetHttpRequestHeaderModificationRuleResponseBody} extends {@link TeaModel}
 *
 * <p>GetHttpRequestHeaderModificationRuleResponseBody</p>
 */
public class GetHttpRequestHeaderModificationRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConfigId")
    private Long configId;

    @com.aliyun.core.annotation.NameInMap("ConfigType")
    private String configType;

    @com.aliyun.core.annotation.NameInMap("RequestHeaderModification")
    private java.util.List<RequestHeaderModification> requestHeaderModification;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Rule")
    private String rule;

    @com.aliyun.core.annotation.NameInMap("RuleEnable")
    private String ruleEnable;

    @com.aliyun.core.annotation.NameInMap("RuleName")
    private String ruleName;

    @com.aliyun.core.annotation.NameInMap("Sequence")
    private Integer sequence;

    @com.aliyun.core.annotation.NameInMap("SiteVersion")
    private Integer siteVersion;

    private GetHttpRequestHeaderModificationRuleResponseBody(Builder builder) {
        this.configId = builder.configId;
        this.configType = builder.configType;
        this.requestHeaderModification = builder.requestHeaderModification;
        this.requestId = builder.requestId;
        this.rule = builder.rule;
        this.ruleEnable = builder.ruleEnable;
        this.ruleName = builder.ruleName;
        this.sequence = builder.sequence;
        this.siteVersion = builder.siteVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHttpRequestHeaderModificationRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return configId
     */
    public Long getConfigId() {
        return this.configId;
    }

    /**
     * @return configType
     */
    public String getConfigType() {
        return this.configType;
    }

    /**
     * @return requestHeaderModification
     */
    public java.util.List<RequestHeaderModification> getRequestHeaderModification() {
        return this.requestHeaderModification;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return rule
     */
    public String getRule() {
        return this.rule;
    }

    /**
     * @return ruleEnable
     */
    public String getRuleEnable() {
        return this.ruleEnable;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * @return sequence
     */
    public Integer getSequence() {
        return this.sequence;
    }

    /**
     * @return siteVersion
     */
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

    public static final class Builder {
        private Long configId; 
        private String configType; 
        private java.util.List<RequestHeaderModification> requestHeaderModification; 
        private String requestId; 
        private String rule; 
        private String ruleEnable; 
        private String ruleName; 
        private Integer sequence; 
        private Integer siteVersion; 

        /**
         * <p>The configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3528160969****</p>
         */
        public Builder configId(Long configId) {
            this.configId = configId;
            return this;
        }

        /**
         * <p>The configuration type. Valid values:</p>
         * <ul>
         * <li>global: global configuration.</li>
         * <li>rule: rule configuration.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>global</p>
         */
        public Builder configType(String configType) {
            this.configType = configType;
            return this;
        }

        /**
         * <p>The configurations of modifying request headers. You can add, delete, or modify a request header.</p>
         */
        public Builder requestHeaderModification(java.util.List<RequestHeaderModification> requestHeaderModification) {
            this.requestHeaderModification = requestHeaderModification;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The rule content.</p>
         * 
         * <strong>example:</strong>
         * <p>(http.host eq &quot;video.example.com&quot;)</p>
         */
        public Builder rule(String rule) {
            this.rule = rule;
            return this;
        }

        /**
         * <p>Indicates whether the rule is enabled. Valid values:</p>
         * <ul>
         * <li>on</li>
         * <li>off</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder ruleEnable(String ruleEnable) {
            this.ruleEnable = ruleEnable;
            return this;
        }

        /**
         * <p>The rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>rule_example</p>
         */
        public Builder ruleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }

        /**
         * <p>The order in which the rule is executed.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder sequence(Integer sequence) {
            this.sequence = sequence;
            return this;
        }

        /**
         * <p>The version number of the website configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder siteVersion(Integer siteVersion) {
            this.siteVersion = siteVersion;
            return this;
        }

        public GetHttpRequestHeaderModificationRuleResponseBody build() {
            return new GetHttpRequestHeaderModificationRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetHttpRequestHeaderModificationRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetHttpRequestHeaderModificationRuleResponseBody</p>
     */
    public static class RequestHeaderModification extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Operation")
        private String operation;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private RequestHeaderModification(Builder builder) {
            this.name = builder.name;
            this.operation = builder.operation;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RequestHeaderModification create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return operation
         */
        public String getOperation() {
            return this.operation;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String operation; 
            private String value; 

            /**
             * <p>The name of the request header.</p>
             * 
             * <strong>example:</strong>
             * <p>headerName</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The action. Valid values:</p>
             * <ul>
             * <li>add: adds a header.</li>
             * <li>del: deletes a header.</li>
             * <li>modify: modifies a header.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>add</p>
             */
            public Builder operation(String operation) {
                this.operation = operation;
                return this;
            }

            /**
             * <p>The value of the request header.</p>
             * 
             * <strong>example:</strong>
             * <p>headValue</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public RequestHeaderModification build() {
                return new RequestHeaderModification(this);
            } 

        } 

    }
}
