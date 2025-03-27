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
 * {@link CreateRedirectRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateRedirectRuleRequest</p>
 */
public class CreateRedirectRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReserveQueryString")
    @com.aliyun.core.annotation.Validation(required = true)
    private String reserveQueryString;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StatusCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String statusCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private CreateRedirectRuleRequest(Builder builder) {
        super(builder);
        this.reserveQueryString = builder.reserveQueryString;
        this.rule = builder.rule;
        this.ruleEnable = builder.ruleEnable;
        this.ruleName = builder.ruleName;
        this.sequence = builder.sequence;
        this.siteId = builder.siteId;
        this.siteVersion = builder.siteVersion;
        this.statusCode = builder.statusCode;
        this.targetUrl = builder.targetUrl;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRedirectRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return reserveQueryString
     */
    public String getReserveQueryString() {
        return this.reserveQueryString;
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

    /**
     * @return statusCode
     */
    public String getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return targetUrl
     */
    public String getTargetUrl() {
        return this.targetUrl;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateRedirectRuleRequest, Builder> {
        private String reserveQueryString; 
        private String rule; 
        private String ruleEnable; 
        private String ruleName; 
        private Integer sequence; 
        private Long siteId; 
        private Integer siteVersion; 
        private String statusCode; 
        private String targetUrl; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateRedirectRuleRequest request) {
            super(request);
            this.reserveQueryString = request.reserveQueryString;
            this.rule = request.rule;
            this.ruleEnable = request.ruleEnable;
            this.ruleName = request.ruleName;
            this.sequence = request.sequence;
            this.siteId = request.siteId;
            this.siteVersion = request.siteVersion;
            this.statusCode = request.statusCode;
            this.targetUrl = request.targetUrl;
            this.type = request.type;
        } 

        /**
         * <p>Preserve query string. Value range:</p>
         * <ul>
         * <li>on: Enabled.</li>
         * <li>off: Disabled.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder reserveQueryString(String reserveQueryString) {
            this.putQueryParameter("ReserveQueryString", reserveQueryString);
            this.reserveQueryString = reserveQueryString;
            return this;
        }

        /**
         * <p>Rule content, using conditional expressions to match user requests. This parameter is not required when adding a global configuration. There are two usage scenarios:</p>
         * <ul>
         * <li>To match all incoming requests: Set the value to true</li>
         * <li>To match specific requests: Set the value to a custom expression, e.g., (http.host eq &quot;video.example.com&quot;)</li>
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
         * <p>Rule switch. This parameter is not required when adding a global configuration. Value range:</p>
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
         * <p>Rule name. This parameter is not required when adding a global configuration.</p>
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
         * Sequence.
         */
        public Builder sequence(Integer sequence) {
            this.putQueryParameter("Sequence", sequence);
            this.sequence = sequence;
            return this;
        }

        /**
         * <p>Site ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> interface.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456****</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        /**
         * <p>Version number of the site configuration. For sites with version management enabled, you can use this parameter to specify the version of the site for which the configuration will take effect. The default is version 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder siteVersion(Integer siteVersion) {
            this.putQueryParameter("SiteVersion", siteVersion);
            this.siteVersion = siteVersion;
            return this;
        }

        /**
         * <p>Response status code used by the node to respond to the client with the redirect address. Value range:</p>
         * <ul>
         * <li>301</li>
         * <li>302</li>
         * <li>303</li>
         * <li>307</li>
         * <li>308</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>301</p>
         */
        public Builder statusCode(String statusCode) {
            this.putQueryParameter("StatusCode", statusCode);
            this.statusCode = statusCode;
            return this;
        }

        /**
         * <p>Target URL after redirection.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.exapmle.com/index.html">http://www.exapmle.com/index.html</a></p>
         */
        public Builder targetUrl(String targetUrl) {
            this.putQueryParameter("TargetUrl", targetUrl);
            this.targetUrl = targetUrl;
            return this;
        }

        /**
         * <p>Redirect type. Value range:</p>
         * <ul>
         * <li>static: Static mode.</li>
         * <li>dynamic: Dynamic mode.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>static</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateRedirectRuleRequest build() {
            return new CreateRedirectRuleRequest(this);
        } 

    } 

}
