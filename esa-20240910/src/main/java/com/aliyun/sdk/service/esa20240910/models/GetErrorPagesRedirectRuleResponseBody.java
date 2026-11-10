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
 * {@link GetErrorPagesRedirectRuleResponseBody} extends {@link TeaModel}
 *
 * <p>GetErrorPagesRedirectRuleResponseBody</p>
 */
public class GetErrorPagesRedirectRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConfigId")
    private Long configId;

    @com.aliyun.core.annotation.NameInMap("ConfigType")
    private String configType;

    @com.aliyun.core.annotation.NameInMap("ErrorPagesRedirect")
    private java.util.List<ErrorPagesRedirect> errorPagesRedirect;

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

    private GetErrorPagesRedirectRuleResponseBody(Builder builder) {
        this.configId = builder.configId;
        this.configType = builder.configType;
        this.errorPagesRedirect = builder.errorPagesRedirect;
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

    public static GetErrorPagesRedirectRuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return errorPagesRedirect
     */
    public java.util.List<ErrorPagesRedirect> getErrorPagesRedirect() {
        return this.errorPagesRedirect;
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
        private java.util.List<ErrorPagesRedirect> errorPagesRedirect; 
        private String requestId; 
        private String rule; 
        private String ruleEnable; 
        private String ruleName; 
        private Integer sequence; 
        private Integer siteVersion; 

        private Builder() {
        } 

        private Builder(GetErrorPagesRedirectRuleResponseBody model) {
            this.configId = model.configId;
            this.configType = model.configType;
            this.errorPagesRedirect = model.errorPagesRedirect;
            this.requestId = model.requestId;
            this.rule = model.rule;
            this.ruleEnable = model.ruleEnable;
            this.ruleName = model.ruleName;
            this.sequence = model.sequence;
            this.siteVersion = model.siteVersion;
        } 

        /**
         * <p>The ID of the configuration. You can call the <a href="https://help.aliyun.com/document_detail/2867498.html">ListCompressionRules</a> operation to obtain the configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>352816096987136</p>
         */
        public Builder configId(Long configId) {
            this.configId = configId;
            return this;
        }

        /**
         * <p>The configuration type. You can use this parameter to query global configurations or rule configurations. Valid values:</p>
         * <ul>
         * <li>global: queries global configurations</li>
         * <li>rule: queries rule configurations</li>
         * </ul>
         * <p>This parameter is optional. If you do not specify this parameter, global and rule configurations are not distinguished. This parameter takes effect only when the functionName parameter is specified.</p>
         * 
         * <strong>example:</strong>
         * <p>rule</p>
         */
        public Builder configType(String configType) {
            this.configType = configType;
            return this;
        }

        /**
         * <p>The error code redirect.</p>
         */
        public Builder errorPagesRedirect(java.util.List<ErrorPagesRedirect> errorPagesRedirect) {
            this.errorPagesRedirect = errorPagesRedirect;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>CB1A380B-09F0-41BB-280B-72F8FD6DA2FE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The rule content, which uses conditional expressions to match user requests. You do not need to set this parameter when adding a global configuration. Two scenarios are supported:</p>
         * <ul>
         * <li>Match all incoming requests: Set the value to true.</li>
         * <li>Match specific requests: Set the value to a custom expression, such as (http.host eq \&quot;video.example.com\&quot;).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>(http.host eq \&quot;video.example.com\&quot;)</p>
         */
        public Builder rule(String rule) {
            this.rule = rule;
            return this;
        }

        /**
         * <p>The rule switch. You do not need to set this parameter when adding a global configuration. Valid values:</p>
         * <ul>
         * <li>on: enables the rule</li>
         * <li>off: disables the rule</li>
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
         * <p>The name of the rule. You do not need to set this parameter when adding a global configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>rule_example</p>
         */
        public Builder ruleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }

        /**
         * <p>The execution sequence of the rule. A smaller value indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder sequence(Integer sequence) {
            this.sequence = sequence;
            return this;
        }

        /**
         * <p>The version number of the site configuration. For sites with configuration version management enabled, you can use this parameter to specify the site version for which the configuration takes effect. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder siteVersion(Integer siteVersion) {
            this.siteVersion = siteVersion;
            return this;
        }

        public GetErrorPagesRedirectRuleResponseBody build() {
            return new GetErrorPagesRedirectRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetErrorPagesRedirectRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetErrorPagesRedirectRuleResponseBody</p>
     */
    public static class ErrorPagesRedirect extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StatusCode")
        private String statusCode;

        @com.aliyun.core.annotation.NameInMap("TargetURL")
        private String targetURL;

        private ErrorPagesRedirect(Builder builder) {
            this.statusCode = builder.statusCode;
            this.targetURL = builder.targetURL;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ErrorPagesRedirect create() {
            return builder().build();
        }

        /**
         * @return statusCode
         */
        public String getStatusCode() {
            return this.statusCode;
        }

        /**
         * @return targetURL
         */
        public String getTargetURL() {
            return this.targetURL;
        }

        public static final class Builder {
            private String statusCode; 
            private String targetURL; 

            private Builder() {
            } 

            private Builder(ErrorPagesRedirect model) {
                this.statusCode = model.statusCode;
                this.targetURL = model.targetURL;
            } 

            /**
             * <p>The response status code used by the node when responding to the client with a redirect address. Valid values:</p>
             * <ul>
             * <li>400</li>
             * <li>403</li>
             * <li>404</li>
             * <li>405</li>
             * <li>414</li>
             * <li>416</li>
             * <li>500</li>
             * <li>501</li>
             * <li>502</li>
             * <li>503</li>
             * <li>504</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>400</p>
             */
            public Builder statusCode(String statusCode) {
                this.statusCode = statusCode;
                return this;
            }

            /**
             * <p>The target URL after the redirect.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://example.com/test">http://example.com/test</a></p>
             */
            public Builder targetURL(String targetURL) {
                this.targetURL = targetURL;
                return this;
            }

            public ErrorPagesRedirect build() {
                return new ErrorPagesRedirect(this);
            } 

        } 

    }
}
