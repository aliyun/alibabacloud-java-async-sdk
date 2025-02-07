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
 * {@link CreateRewriteUrlRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateRewriteUrlRuleRequest</p>
 */
public class CreateRewriteUrlRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryString")
    private String queryString;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RewriteQueryStringType")
    private String rewriteQueryStringType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RewriteUriType")
    private String rewriteUriType;

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
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteVersion")
    private Integer siteVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uri")
    private String uri;

    private CreateRewriteUrlRuleRequest(Builder builder) {
        super(builder);
        this.queryString = builder.queryString;
        this.rewriteQueryStringType = builder.rewriteQueryStringType;
        this.rewriteUriType = builder.rewriteUriType;
        this.rule = builder.rule;
        this.ruleEnable = builder.ruleEnable;
        this.ruleName = builder.ruleName;
        this.siteId = builder.siteId;
        this.siteVersion = builder.siteVersion;
        this.uri = builder.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRewriteUrlRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return queryString
     */
    public String getQueryString() {
        return this.queryString;
    }

    /**
     * @return rewriteQueryStringType
     */
    public String getRewriteQueryStringType() {
        return this.rewriteQueryStringType;
    }

    /**
     * @return rewriteUriType
     */
    public String getRewriteUriType() {
        return this.rewriteUriType;
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
     * @return uri
     */
    public String getUri() {
        return this.uri;
    }

    public static final class Builder extends Request.Builder<CreateRewriteUrlRuleRequest, Builder> {
        private String queryString; 
        private String rewriteQueryStringType; 
        private String rewriteUriType; 
        private String rule; 
        private String ruleEnable; 
        private String ruleName; 
        private Long siteId; 
        private Integer siteVersion; 
        private String uri; 

        private Builder() {
            super();
        } 

        private Builder(CreateRewriteUrlRuleRequest request) {
            super(request);
            this.queryString = request.queryString;
            this.rewriteQueryStringType = request.rewriteQueryStringType;
            this.rewriteUriType = request.rewriteUriType;
            this.rule = request.rule;
            this.ruleEnable = request.ruleEnable;
            this.ruleName = request.ruleName;
            this.siteId = request.siteId;
            this.siteVersion = request.siteVersion;
            this.uri = request.uri;
        } 

        /**
         * QueryString.
         */
        public Builder queryString(String queryString) {
            this.putQueryParameter("QueryString", queryString);
            this.queryString = queryString;
            return this;
        }

        /**
         * RewriteQueryStringType.
         */
        public Builder rewriteQueryStringType(String rewriteQueryStringType) {
            this.putQueryParameter("RewriteQueryStringType", rewriteQueryStringType);
            this.rewriteQueryStringType = rewriteQueryStringType;
            return this;
        }

        /**
         * RewriteUriType.
         */
        public Builder rewriteUriType(String rewriteUriType) {
            this.putQueryParameter("RewriteUriType", rewriteUriType);
            this.rewriteUriType = rewriteUriType;
            return this;
        }

        /**
         * Rule.
         */
        public Builder rule(String rule) {
            this.putQueryParameter("Rule", rule);
            this.rule = rule;
            return this;
        }

        /**
         * RuleEnable.
         */
        public Builder ruleEnable(String ruleEnable) {
            this.putQueryParameter("RuleEnable", ruleEnable);
            this.ruleEnable = ruleEnable;
            return this;
        }

        /**
         * RuleName.
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
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
         * SiteVersion.
         */
        public Builder siteVersion(Integer siteVersion) {
            this.putQueryParameter("SiteVersion", siteVersion);
            this.siteVersion = siteVersion;
            return this;
        }

        /**
         * Uri.
         */
        public Builder uri(String uri) {
            this.putQueryParameter("Uri", uri);
            this.uri = uri;
            return this;
        }

        @Override
        public CreateRewriteUrlRuleRequest build() {
            return new CreateRewriteUrlRuleRequest(this);
        } 

    } 

}
