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
 * {@link CreateErrorPagesRedirectRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateErrorPagesRedirectRuleRequest</p>
 */
public class CreateErrorPagesRedirectRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ErrorPagesRedirect")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<ErrorPagesRedirect> errorPagesRedirect;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Rule")
    private String rule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleEnable")
    private String ruleEnable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    private String ruleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sequence")
    private Integer sequence;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteVersion")
    private Integer siteVersion;

    private CreateErrorPagesRedirectRuleRequest(Builder builder) {
        super(builder);
        this.errorPagesRedirect = builder.errorPagesRedirect;
        this.rule = builder.rule;
        this.ruleEnable = builder.ruleEnable;
        this.ruleName = builder.ruleName;
        this.sequence = builder.sequence;
        this.siteId = builder.siteId;
        this.siteVersion = builder.siteVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateErrorPagesRedirectRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return errorPagesRedirect
     */
    public java.util.List<ErrorPagesRedirect> getErrorPagesRedirect() {
        return this.errorPagesRedirect;
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
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    /**
     * @return siteVersion
     */
    public Integer getSiteVersion() {
        return this.siteVersion;
    }

    public static final class Builder extends Request.Builder<CreateErrorPagesRedirectRuleRequest, Builder> {
        private java.util.List<ErrorPagesRedirect> errorPagesRedirect; 
        private String rule; 
        private String ruleEnable; 
        private String ruleName; 
        private Integer sequence; 
        private Long siteId; 
        private Integer siteVersion; 

        private Builder() {
            super();
        } 

        private Builder(CreateErrorPagesRedirectRuleRequest request) {
            super(request);
            this.errorPagesRedirect = request.errorPagesRedirect;
            this.rule = request.rule;
            this.ruleEnable = request.ruleEnable;
            this.ruleName = request.ruleName;
            this.sequence = request.sequence;
            this.siteId = request.siteId;
            this.siteVersion = request.siteVersion;
        } 

        /**
         * <p>The error code redirection.</p>
         * <p>This parameter is required.</p>
         */
        public Builder errorPagesRedirect(java.util.List<ErrorPagesRedirect> errorPagesRedirect) {
            String errorPagesRedirectShrink = shrink(errorPagesRedirect, "ErrorPagesRedirect", "json");
            this.putQueryParameter("ErrorPagesRedirect", errorPagesRedirectShrink);
            this.errorPagesRedirect = errorPagesRedirect;
            return this;
        }

        /**
         * <p>The rule content, which uses conditional expressions to match user requests. You do not need to set this parameter when adding a global configuration. Two scenarios are supported:</p>
         * <ul>
         * <li>Match all incoming requests: Set the value to true.</li>
         * <li>Match specific requests: Set the value to a custom expression, such as (http.host eq &quot;video.example.com&quot;).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>(http.host eq &quot;video.example.com&quot;)</p>
         */
        public Builder rule(String rule) {
            this.putQueryParameter("Rule", rule);
            this.rule = rule;
            return this;
        }

        /**
         * <p>The rule switch. You do not need to set this parameter when adding a global configuration. Valid values:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder ruleEnable(String ruleEnable) {
            this.putQueryParameter("RuleEnable", ruleEnable);
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
            this.putQueryParameter("RuleName", ruleName);
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
            this.putQueryParameter("Sequence", sequence);
            this.sequence = sequence;
            return this;
        }

        /**
         * <p>The site ID. You can call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation to obtain the site ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>478016908379824</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        /**
         * <p>The version number of the site configuration. For sites with configuration version management enabled, you can use this parameter to specify the site version for which the configuration takes effect. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder siteVersion(Integer siteVersion) {
            this.putQueryParameter("SiteVersion", siteVersion);
            this.siteVersion = siteVersion;
            return this;
        }

        @Override
        public CreateErrorPagesRedirectRuleRequest build() {
            return new CreateErrorPagesRedirectRuleRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateErrorPagesRedirectRuleRequest} extends {@link TeaModel}
     *
     * <p>CreateErrorPagesRedirectRuleRequest</p>
     */
    public static class ErrorPagesRedirect extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StatusCode")
        @com.aliyun.core.annotation.Validation(required = true)
        private String statusCode;

        @com.aliyun.core.annotation.NameInMap("TargetURL")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>400</p>
             */
            public Builder statusCode(String statusCode) {
                this.statusCode = statusCode;
                return this;
            }

            /**
             * <p>The target URL after redirection.</p>
             * <p>This parameter is required.</p>
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
