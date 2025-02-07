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
 * {@link UpdateRedirectRuleRequest} extends {@link RequestModel}
 *
 * <p>UpdateRedirectRuleRequest</p>
 */
public class UpdateRedirectRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long configId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReserveQueryString")
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
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StatusCode")
    private String statusCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetUrl")
    private String targetUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private UpdateRedirectRuleRequest(Builder builder) {
        super(builder);
        this.configId = builder.configId;
        this.reserveQueryString = builder.reserveQueryString;
        this.rule = builder.rule;
        this.ruleEnable = builder.ruleEnable;
        this.ruleName = builder.ruleName;
        this.siteId = builder.siteId;
        this.statusCode = builder.statusCode;
        this.targetUrl = builder.targetUrl;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRedirectRuleRequest create() {
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
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
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

    public static final class Builder extends Request.Builder<UpdateRedirectRuleRequest, Builder> {
        private Long configId; 
        private String reserveQueryString; 
        private String rule; 
        private String ruleEnable; 
        private String ruleName; 
        private Long siteId; 
        private String statusCode; 
        private String targetUrl; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRedirectRuleRequest request) {
            super(request);
            this.configId = request.configId;
            this.reserveQueryString = request.reserveQueryString;
            this.rule = request.rule;
            this.ruleEnable = request.ruleEnable;
            this.ruleName = request.ruleName;
            this.siteId = request.siteId;
            this.statusCode = request.statusCode;
            this.targetUrl = request.targetUrl;
            this.type = request.type;
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
         * ReserveQueryString.
         */
        public Builder reserveQueryString(String reserveQueryString) {
            this.putQueryParameter("ReserveQueryString", reserveQueryString);
            this.reserveQueryString = reserveQueryString;
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
         * StatusCode.
         */
        public Builder statusCode(String statusCode) {
            this.putQueryParameter("StatusCode", statusCode);
            this.statusCode = statusCode;
            return this;
        }

        /**
         * TargetUrl.
         */
        public Builder targetUrl(String targetUrl) {
            this.putQueryParameter("TargetUrl", targetUrl);
            this.targetUrl = targetUrl;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public UpdateRedirectRuleRequest build() {
            return new UpdateRedirectRuleRequest(this);
        } 

    } 

}
