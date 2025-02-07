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
 * {@link CreateHttpRequestHeaderModificationRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateHttpRequestHeaderModificationRuleRequest</p>
 */
public class CreateHttpRequestHeaderModificationRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestHeaderModification")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<RequestHeaderModification> requestHeaderModification;

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

    private CreateHttpRequestHeaderModificationRuleRequest(Builder builder) {
        super(builder);
        this.requestHeaderModification = builder.requestHeaderModification;
        this.rule = builder.rule;
        this.ruleEnable = builder.ruleEnable;
        this.ruleName = builder.ruleName;
        this.siteId = builder.siteId;
        this.siteVersion = builder.siteVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateHttpRequestHeaderModificationRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestHeaderModification
     */
    public java.util.List<RequestHeaderModification> getRequestHeaderModification() {
        return this.requestHeaderModification;
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

    public static final class Builder extends Request.Builder<CreateHttpRequestHeaderModificationRuleRequest, Builder> {
        private java.util.List<RequestHeaderModification> requestHeaderModification; 
        private String rule; 
        private String ruleEnable; 
        private String ruleName; 
        private Long siteId; 
        private Integer siteVersion; 

        private Builder() {
            super();
        } 

        private Builder(CreateHttpRequestHeaderModificationRuleRequest request) {
            super(request);
            this.requestHeaderModification = request.requestHeaderModification;
            this.rule = request.rule;
            this.ruleEnable = request.ruleEnable;
            this.ruleName = request.ruleName;
            this.siteId = request.siteId;
            this.siteVersion = request.siteVersion;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder requestHeaderModification(java.util.List<RequestHeaderModification> requestHeaderModification) {
            String requestHeaderModificationShrink = shrink(requestHeaderModification, "RequestHeaderModification", "json");
            this.putQueryParameter("RequestHeaderModification", requestHeaderModificationShrink);
            this.requestHeaderModification = requestHeaderModification;
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
         * <p>5407498413****</p>
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

        @Override
        public CreateHttpRequestHeaderModificationRuleRequest build() {
            return new CreateHttpRequestHeaderModificationRuleRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateHttpRequestHeaderModificationRuleRequest} extends {@link TeaModel}
     *
     * <p>CreateHttpRequestHeaderModificationRuleRequest</p>
     */
    public static class RequestHeaderModification extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("Operation")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>headername</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>add</p>
             */
            public Builder operation(String operation) {
                this.operation = operation;
                return this;
            }

            /**
             * Value.
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
