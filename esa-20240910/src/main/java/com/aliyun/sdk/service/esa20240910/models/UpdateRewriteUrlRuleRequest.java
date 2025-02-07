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
 * {@link UpdateRewriteUrlRuleRequest} extends {@link RequestModel}
 *
 * <p>UpdateRewriteUrlRuleRequest</p>
 */
public class UpdateRewriteUrlRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long configId;

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
    @com.aliyun.core.annotation.NameInMap("Uri")
    private String uri;

    private UpdateRewriteUrlRuleRequest(Builder builder) {
        super(builder);
        this.configId = builder.configId;
        this.queryString = builder.queryString;
        this.rewriteQueryStringType = builder.rewriteQueryStringType;
        this.rewriteUriType = builder.rewriteUriType;
        this.rule = builder.rule;
        this.ruleEnable = builder.ruleEnable;
        this.ruleName = builder.ruleName;
        this.siteId = builder.siteId;
        this.uri = builder.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRewriteUrlRuleRequest create() {
        return builder().build();
    }

    @Override
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
     * @return uri
     */
    public String getUri() {
        return this.uri;
    }

    public static final class Builder extends Request.Builder<UpdateRewriteUrlRuleRequest, Builder> {
        private Long configId; 
        private String queryString; 
        private String rewriteQueryStringType; 
        private String rewriteUriType; 
        private String rule; 
        private String ruleEnable; 
        private String ruleName; 
        private Long siteId; 
        private String uri; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRewriteUrlRuleRequest request) {
            super(request);
            this.configId = request.configId;
            this.queryString = request.queryString;
            this.rewriteQueryStringType = request.rewriteQueryStringType;
            this.rewriteUriType = request.rewriteUriType;
            this.rule = request.rule;
            this.ruleEnable = request.ruleEnable;
            this.ruleName = request.ruleName;
            this.siteId = request.siteId;
            this.uri = request.uri;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3528160969****</p>
         */
        public Builder configId(Long configId) {
            this.putQueryParameter("ConfigId", configId);
            this.configId = configId;
            return this;
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
         * <p>123456789****</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
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
        public UpdateRewriteUrlRuleRequest build() {
            return new UpdateRewriteUrlRuleRequest(this);
        } 

    } 

}
