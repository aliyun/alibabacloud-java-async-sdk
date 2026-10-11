// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.epg20260715.models;

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
 * {@link CreateEgressProxyRulesRequest} extends {@link RequestModel}
 *
 * <p>CreateEgressProxyRulesRequest</p>
 */
public class CreateEgressProxyRulesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EgressProxyRuleGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String egressProxyRuleGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EgressProxyRules")
    @com.aliyun.core.annotation.Validation(required = true)
    private EgressProxyRules egressProxyRules;

    private CreateEgressProxyRulesRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.egressProxyRuleGroupId = builder.egressProxyRuleGroupId;
        this.egressProxyRules = builder.egressProxyRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEgressProxyRulesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return egressProxyRuleGroupId
     */
    public String getEgressProxyRuleGroupId() {
        return this.egressProxyRuleGroupId;
    }

    /**
     * @return egressProxyRules
     */
    public EgressProxyRules getEgressProxyRules() {
        return this.egressProxyRules;
    }

    public static final class Builder extends Request.Builder<CreateEgressProxyRulesRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String egressProxyRuleGroupId; 
        private EgressProxyRules egressProxyRules; 

        private Builder() {
            super();
        } 

        private Builder(CreateEgressProxyRulesRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.egressProxyRuleGroupId = request.egressProxyRuleGroupId;
            this.egressProxyRules = request.egressProxyRules;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the value, but you must ensure that it is unique among different requests. The client token can contain only ASCII characters.</p>
         * <blockquote>
         * <p>Note If you do not specify this parameter, the system automatically uses the RequestId of the API request as the client token. The RequestId of each API request is different.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5A2CFF0E-5718-45B5-9D4D-70B******</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run on the request. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: performs a dry run. The system checks the request for potential issues, including missing required parameters, invalid request formats, and service limits, but does not create the rules. If the request fails the dry run, an error message is returned. If the request passes the dry run, the DryRunOperation error code is returned.</p>
         * </li>
         * <li><p><strong>false</strong> (default): performs a dry run and sends the request. If the request passes the dry run, an HTTP 2xx status code is returned and the operation is performed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putBodyParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The ID of the egress proxy rule group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eprg-uf60966a9633667c****</p>
         */
        public Builder egressProxyRuleGroupId(String egressProxyRuleGroupId) {
            this.putBodyParameter("EgressProxyRuleGroupId", egressProxyRuleGroupId);
            this.egressProxyRuleGroupId = egressProxyRuleGroupId;
            return this;
        }

        /**
         * <p>The list of egress rules grouped by effective phase (PreDns, PreRequest, or PostResponse).</p>
         * <p>This parameter is required.</p>
         */
        public Builder egressProxyRules(EgressProxyRules egressProxyRules) {
            this.putBodyParameter("EgressProxyRules", egressProxyRules);
            this.egressProxyRules = egressProxyRules;
            return this;
        }

        @Override
        public CreateEgressProxyRulesRequest build() {
            return new CreateEgressProxyRulesRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateEgressProxyRulesRequest} extends {@link TeaModel}
     *
     * <p>CreateEgressProxyRulesRequest</p>
     */
    public static class Conditions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConditionKey")
        @com.aliyun.core.annotation.Validation(required = true)
        private String conditionKey;

        @com.aliyun.core.annotation.NameInMap("ConditionOperator")
        @com.aliyun.core.annotation.Validation(required = true)
        private String conditionOperator;

        @com.aliyun.core.annotation.NameInMap("ConditionValues")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> conditionValues;

        private Conditions(Builder builder) {
            this.conditionKey = builder.conditionKey;
            this.conditionOperator = builder.conditionOperator;
            this.conditionValues = builder.conditionValues;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Conditions create() {
            return builder().build();
        }

        /**
         * @return conditionKey
         */
        public String getConditionKey() {
            return this.conditionKey;
        }

        /**
         * @return conditionOperator
         */
        public String getConditionOperator() {
            return this.conditionOperator;
        }

        /**
         * @return conditionValues
         */
        public java.util.List<String> getConditionValues() {
            return this.conditionValues;
        }

        public static final class Builder {
            private String conditionKey; 
            private String conditionOperator; 
            private java.util.List<String> conditionValues; 

            private Builder() {
            } 

            private Builder(Conditions model) {
                this.conditionKey = model.conditionKey;
                this.conditionOperator = model.conditionOperator;
                this.conditionValues = model.conditionValues;
            } 

            /**
             * <p>The key of the matching condition. The value must match the effective phase (Phase) of the rule and be used with an operator (ConditionOperator) of the corresponding category. Valid values:</p>
             * <ul>
             * <li><p><strong>request:SourceIp</strong>: the source IP address of the request. Used with IP address operators. Supported in the PreDns and PreRequest phases.</p>
             * </li>
             * <li><p><strong>request:DestinationDomain</strong>: the destination domain name of the request. Used with string operators. Supported in the PreDns and PreRequest phases.</p>
             * </li>
             * <li><p><strong>request:Http:Uri</strong>: the URI of the HTTP request. Used with string operators. Supported in the PreRequest phase.</p>
             * </li>
             * <li><p><strong>request:Http:Method</strong>: the HTTP request method. Used with string operators. Supported in the PreRequest phase.</p>
             * </li>
             * <li><p><strong>request:Http:UserAgent</strong>: the User-Agent of the HTTP request. Used with string operators. Supported in the PreRequest phase.</p>
             * </li>
             * <li><p><strong>request:Http:ContentType</strong>: the Content-Type of the HTTP request. Used with string operators. Supported in the PreRequest phase.</p>
             * </li>
             * <li><p><strong>request:Http:Header</strong>: the HTTP request header. Used with string operators. Supported in the PreRequest phase. When you use this key, append the request header name to the key in the format of request:Http:Header/<HeaderName>.</p>
             * </li>
             * <li><p><strong>request:Protocol</strong>: the request protocol. Used with string operators. Supported in the PreRequest phase.</p>
             * </li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>request:SourceIp</p>
             */
            public Builder conditionKey(String conditionKey) {
                this.conditionKey = conditionKey;
                return this;
            }

            /**
             * <p>The operator of the matching condition. Must be used with a condition key (ConditionKey). Valid values:</p>
             * <ul>
             * <li><p><strong>StringEquals</strong>: exact string match.</p>
             * </li>
             * <li><p><strong>StringNotEquals</strong>: string not equal.</p>
             * </li>
             * <li><p><strong>StringEqualsIgnoreCase</strong>: case-insensitive exact string match.</p>
             * </li>
             * <li><p><strong>StringNotEqualsIgnoreCase</strong>: case-insensitive string not equal.</p>
             * </li>
             * <li><p><strong>StringPrefixMatch</strong>: string prefix match.</p>
             * </li>
             * <li><p><strong>StringPrefixMatchIgnoreCase</strong>: case-insensitive string prefix match.</p>
             * </li>
             * <li><p><strong>StringPrefixNotMatch</strong>: string prefix not match.</p>
             * </li>
             * <li><p><strong>StringPrefixNotMatchIgnoreCase</strong>: case-insensitive string prefix not match.</p>
             * </li>
             * <li><p><strong>StringSuffixMatch</strong>: string suffix match.</p>
             * </li>
             * <li><p><strong>StringSuffixMatchIgnoreCase</strong>: case-insensitive string suffix match.</p>
             * </li>
             * <li><p><strong>StringSuffixNotMatch</strong>: string suffix not match.</p>
             * </li>
             * <li><p><strong>StringSuffixNotMatchIgnoreCase</strong>: case-insensitive string suffix not match.</p>
             * </li>
             * <li><p><strong>StringRegexMatch</strong>: string regular expression match.</p>
             * </li>
             * <li><p><strong>StringRegexNotMatch</strong>: string regular expression not match.</p>
             * </li>
             * <li><p><strong>StringWildcardMatch</strong>: string wildcard match.</p>
             * </li>
             * <li><p><strong>StringWildcardMatchIgnoreCase</strong>: case-insensitive string wildcard match.</p>
             * </li>
             * <li><p><strong>StringWildcardNotMatch</strong>: string wildcard not match.</p>
             * </li>
             * <li><p><strong>StringWildcardNotMatchIgnoreCase</strong>: case-insensitive string wildcard not match.</p>
             * </li>
             * <li><p><strong>IpAddress</strong>: the source IP address belongs to the specified IP address or CIDR block.</p>
             * </li>
             * <li><p><strong>NotIpAddress</strong>: the source IP address does not belong to the specified IP address or CIDR block.</p>
             * </li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>IpAddress</p>
             */
            public Builder conditionOperator(String conditionOperator) {
                this.conditionOperator = conditionOperator;
                return this;
            }

            /**
             * <p>The list of condition values.</p>
             * <p>This parameter is required.</p>
             */
            public Builder conditionValues(java.util.List<String> conditionValues) {
                this.conditionValues = conditionValues;
                return this;
            }

            public Conditions build() {
                return new Conditions(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEgressProxyRulesRequest} extends {@link TeaModel}
     *
     * <p>CreateEgressProxyRulesRequest</p>
     */
    public static class PostResponse extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        @com.aliyun.core.annotation.Validation(required = true)
        private String action;

        @com.aliyun.core.annotation.NameInMap("Conditions")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<Conditions> conditions;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EgressProxyRuleName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String egressProxyRuleName;

        @com.aliyun.core.annotation.NameInMap("Priority")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer priority;

        private PostResponse(Builder builder) {
            this.action = builder.action;
            this.conditions = builder.conditions;
            this.description = builder.description;
            this.egressProxyRuleName = builder.egressProxyRuleName;
            this.priority = builder.priority;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PostResponse create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return conditions
         */
        public java.util.List<Conditions> getConditions() {
            return this.conditions;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return egressProxyRuleName
         */
        public String getEgressProxyRuleName() {
            return this.egressProxyRuleName;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        public static final class Builder {
            private String action; 
            private java.util.List<Conditions> conditions; 
            private String description; 
            private String egressProxyRuleName; 
            private Integer priority; 

            private Builder() {
            } 

            private Builder(PostResponse model) {
                this.action = model.action;
                this.conditions = model.conditions;
                this.description = model.description;
                this.egressProxyRuleName = model.egressProxyRuleName;
                this.priority = model.priority;
            } 

            /**
             * <p>The action to perform on the matched traffic after the rule is hit. Valid values:</p>
             * <ul>
             * <li><p><strong>Allow</strong>: allows the traffic that matches the rule.</p>
             * </li>
             * <li><p><strong>Deny</strong>: denies the traffic that matches the rule.</p>
             * </li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Allow</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The list of matching conditions for the rule. Each condition consists of a condition key (ConditionKey), an operator (ConditionOperator), and condition values (ConditionValues). The combination of a condition key and an operator must be unique within the same rule.</p>
             * <p>This parameter is required.</p>
             */
            public Builder conditions(java.util.List<Conditions> conditions) {
                this.conditions = conditions;
                return this;
            }

            /**
             * <p>The description of the egress rule. The description must be 2 to 256 characters in length, and can contain Chinese characters, letters, digits, hyphens (-), forward slashes (/), periods (.), and underscores (_).</p>
             * 
             * <strong>example:</strong>
             * <p>testEpg</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the egress rule. The name must be 2 to 128 characters in length, and must start with a letter or a Chinese character. It can contain digits, periods (.), underscores (_), and hyphens (-).</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>testEpg</p>
             */
            public Builder egressProxyRuleName(String egressProxyRuleName) {
                this.egressProxyRuleName = egressProxyRuleName;
                return this;
            }

            /**
             * <p>The priority of the egress rule within the phase to which it belongs. Valid values: 1 to 1000. A smaller value indicates a higher priority. Within the same phase of a rule group, the priority of rules must be unique.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            public PostResponse build() {
                return new PostResponse(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEgressProxyRulesRequest} extends {@link TeaModel}
     *
     * <p>CreateEgressProxyRulesRequest</p>
     */
    public static class PreDnsConditions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConditionKey")
        @com.aliyun.core.annotation.Validation(required = true)
        private String conditionKey;

        @com.aliyun.core.annotation.NameInMap("ConditionOperator")
        @com.aliyun.core.annotation.Validation(required = true)
        private String conditionOperator;

        @com.aliyun.core.annotation.NameInMap("ConditionValues")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> conditionValues;

        private PreDnsConditions(Builder builder) {
            this.conditionKey = builder.conditionKey;
            this.conditionOperator = builder.conditionOperator;
            this.conditionValues = builder.conditionValues;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PreDnsConditions create() {
            return builder().build();
        }

        /**
         * @return conditionKey
         */
        public String getConditionKey() {
            return this.conditionKey;
        }

        /**
         * @return conditionOperator
         */
        public String getConditionOperator() {
            return this.conditionOperator;
        }

        /**
         * @return conditionValues
         */
        public java.util.List<String> getConditionValues() {
            return this.conditionValues;
        }

        public static final class Builder {
            private String conditionKey; 
            private String conditionOperator; 
            private java.util.List<String> conditionValues; 

            private Builder() {
            } 

            private Builder(PreDnsConditions model) {
                this.conditionKey = model.conditionKey;
                this.conditionOperator = model.conditionOperator;
                this.conditionValues = model.conditionValues;
            } 

            /**
             * <p>The key of the matching condition. The value must match the effective phase (Phase) of the rule and be used with an operator (ConditionOperator) of the corresponding category. Valid values:</p>
             * <ul>
             * <li><p><strong>request:SourceIp</strong>: the source IP address of the request. Used with IP address operators. Supported in the PreDns and PreRequest phases.</p>
             * </li>
             * <li><p><strong>request:DestinationDomain</strong>: the destination domain name of the request. Used with string operators. Supported in the PreDns and PreRequest phases.</p>
             * </li>
             * <li><p><strong>request:Http:Uri</strong>: the URI of the HTTP request. Used with string operators. Supported in the PreRequest phase.</p>
             * </li>
             * <li><p><strong>request:Http:Method</strong>: the HTTP request method. Used with string operators. Supported in the PreRequest phase.</p>
             * </li>
             * <li><p><strong>request:Http:UserAgent</strong>: the User-Agent of the HTTP request. Used with string operators. Supported in the PreRequest phase.</p>
             * </li>
             * <li><p><strong>request:Http:ContentType</strong>: the Content-Type of the HTTP request. Used with string operators. Supported in the PreRequest phase.</p>
             * </li>
             * <li><p><strong>request:Http:Header</strong>: the HTTP request header. Used with string operators. Supported in the PreRequest phase. When you use this key, append the request header name to the key in the format of request:Http:Header/<HeaderName>.</p>
             * </li>
             * <li><p><strong>request:Protocol</strong>: the request protocol. Used with string operators. Supported in the PreRequest phase.</p>
             * </li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>request:DestinationDomain</p>
             */
            public Builder conditionKey(String conditionKey) {
                this.conditionKey = conditionKey;
                return this;
            }

            /**
             * <p>The operator of the matching condition. Must be used with a condition key (ConditionKey). Valid values:</p>
             * <ul>
             * <li><p><strong>StringEquals</strong>: exact string match.</p>
             * </li>
             * <li><p><strong>StringNotEquals</strong>: string not equal.</p>
             * </li>
             * <li><p><strong>StringEqualsIgnoreCase</strong>: case-insensitive exact string match.</p>
             * </li>
             * <li><p><strong>StringNotEqualsIgnoreCase</strong>: case-insensitive string not equal.</p>
             * </li>
             * <li><p><strong>StringPrefixMatch</strong>: string prefix match.</p>
             * </li>
             * <li><p><strong>StringPrefixMatchIgnoreCase</strong>: case-insensitive string prefix match.</p>
             * </li>
             * <li><p><strong>StringPrefixNotMatch</strong>: string prefix not match.</p>
             * </li>
             * <li><p><strong>StringPrefixNotMatchIgnoreCase</strong>: case-insensitive string prefix not match.</p>
             * </li>
             * <li><p><strong>StringSuffixMatch</strong>: string suffix match.</p>
             * </li>
             * <li><p><strong>StringSuffixMatchIgnoreCase</strong>: case-insensitive string suffix match.</p>
             * </li>
             * <li><p><strong>StringSuffixNotMatch</strong>: string suffix not match.</p>
             * </li>
             * <li><p><strong>StringSuffixNotMatchIgnoreCase</strong>: case-insensitive string suffix not match.</p>
             * </li>
             * <li><p><strong>StringRegexMatch</strong>: string regular expression match.</p>
             * </li>
             * <li><p><strong>StringRegexNotMatch</strong>: string regular expression not match.</p>
             * </li>
             * <li><p><strong>StringWildcardMatch</strong>: string wildcard match.</p>
             * </li>
             * <li><p><strong>StringWildcardMatchIgnoreCase</strong>: case-insensitive string wildcard match.</p>
             * </li>
             * <li><p><strong>StringWildcardNotMatch</strong>: string wildcard not match.</p>
             * </li>
             * <li><p><strong>StringWildcardNotMatchIgnoreCase</strong>: case-insensitive string wildcard not match.</p>
             * </li>
             * <li><p><strong>IpAddress</strong>: the source IP address belongs to the specified IP address or CIDR block.</p>
             * </li>
             * <li><p><strong>NotIpAddress</strong>: the source IP address does not belong to the specified IP address or CIDR block.</p>
             * </li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>StringEquals</p>
             */
            public Builder conditionOperator(String conditionOperator) {
                this.conditionOperator = conditionOperator;
                return this;
            }

            /**
             * <p>The list of condition values.</p>
             * <p>This parameter is required.</p>
             */
            public Builder conditionValues(java.util.List<String> conditionValues) {
                this.conditionValues = conditionValues;
                return this;
            }

            public PreDnsConditions build() {
                return new PreDnsConditions(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEgressProxyRulesRequest} extends {@link TeaModel}
     *
     * <p>CreateEgressProxyRulesRequest</p>
     */
    public static class PreDns extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        @com.aliyun.core.annotation.Validation(required = true)
        private String action;

        @com.aliyun.core.annotation.NameInMap("Conditions")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<PreDnsConditions> conditions;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EgressProxyRuleName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String egressProxyRuleName;

        @com.aliyun.core.annotation.NameInMap("Priority")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer priority;

        private PreDns(Builder builder) {
            this.action = builder.action;
            this.conditions = builder.conditions;
            this.description = builder.description;
            this.egressProxyRuleName = builder.egressProxyRuleName;
            this.priority = builder.priority;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PreDns create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return conditions
         */
        public java.util.List<PreDnsConditions> getConditions() {
            return this.conditions;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return egressProxyRuleName
         */
        public String getEgressProxyRuleName() {
            return this.egressProxyRuleName;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        public static final class Builder {
            private String action; 
            private java.util.List<PreDnsConditions> conditions; 
            private String description; 
            private String egressProxyRuleName; 
            private Integer priority; 

            private Builder() {
            } 

            private Builder(PreDns model) {
                this.action = model.action;
                this.conditions = model.conditions;
                this.description = model.description;
                this.egressProxyRuleName = model.egressProxyRuleName;
                this.priority = model.priority;
            } 

            /**
             * <p>The action to perform on the matched traffic after the rule is hit. Valid values:</p>
             * <ul>
             * <li><p><strong>Allow</strong>: allows the traffic that matches the rule.</p>
             * </li>
             * <li><p><strong>Deny</strong>: denies the traffic that matches the rule.</p>
             * </li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Allow</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The list of matching conditions for the rule. Each condition consists of a condition key (ConditionKey), an operator (ConditionOperator), and condition values (ConditionValues). The combination of a condition key and an operator must be unique within the same rule.</p>
             * <p>This parameter is required.</p>
             */
            public Builder conditions(java.util.List<PreDnsConditions> conditions) {
                this.conditions = conditions;
                return this;
            }

            /**
             * <p>The description of the egress rule. The description must be 2 to 256 characters in length and can contain Chinese characters, letters, digits, hyphens (-), forward slashes (/), periods (.), and underscores (_).</p>
             * 
             * <strong>example:</strong>
             * <p>testEpg</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the egress rule. The name must be 2 to 128 characters in length, and must start with a letter or a Chinese character. It can contain digits, periods (.), underscores (_), and hyphens (-).</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>testEpg</p>
             */
            public Builder egressProxyRuleName(String egressProxyRuleName) {
                this.egressProxyRuleName = egressProxyRuleName;
                return this;
            }

            /**
             * <p>The priority of the egress rule within the phase to which it belongs. Valid values: 1 to 1000. A smaller value indicates a higher priority. Within the same phase of a rule group, the priority of rules must be unique.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            public PreDns build() {
                return new PreDns(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEgressProxyRulesRequest} extends {@link TeaModel}
     *
     * <p>CreateEgressProxyRulesRequest</p>
     */
    public static class PreRequestConditions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConditionKey")
        @com.aliyun.core.annotation.Validation(required = true)
        private String conditionKey;

        @com.aliyun.core.annotation.NameInMap("ConditionOperator")
        @com.aliyun.core.annotation.Validation(required = true)
        private String conditionOperator;

        @com.aliyun.core.annotation.NameInMap("ConditionValues")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> conditionValues;

        private PreRequestConditions(Builder builder) {
            this.conditionKey = builder.conditionKey;
            this.conditionOperator = builder.conditionOperator;
            this.conditionValues = builder.conditionValues;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PreRequestConditions create() {
            return builder().build();
        }

        /**
         * @return conditionKey
         */
        public String getConditionKey() {
            return this.conditionKey;
        }

        /**
         * @return conditionOperator
         */
        public String getConditionOperator() {
            return this.conditionOperator;
        }

        /**
         * @return conditionValues
         */
        public java.util.List<String> getConditionValues() {
            return this.conditionValues;
        }

        public static final class Builder {
            private String conditionKey; 
            private String conditionOperator; 
            private java.util.List<String> conditionValues; 

            private Builder() {
            } 

            private Builder(PreRequestConditions model) {
                this.conditionKey = model.conditionKey;
                this.conditionOperator = model.conditionOperator;
                this.conditionValues = model.conditionValues;
            } 

            /**
             * <p>The key of the matching condition. The value must match the effective phase (Phase) of the rule and be used with an operator (ConditionOperator) of the corresponding category. Valid values:</p>
             * <ul>
             * <li><p><strong>request:SourceIp</strong>: the source IP address of the request. Used with IP address operators. Supported in the PreDns and PreRequest phases.</p>
             * </li>
             * <li><p><strong>request:DestinationDomain</strong>: the destination domain name of the request. Used with string operators. Supported in the PreDns and PreRequest phases.</p>
             * </li>
             * <li><p><strong>request:Http:Uri</strong>: the URI of the HTTP request. Used with string operators. Supported in the PreRequest phase.</p>
             * </li>
             * <li><p><strong>request:Http:Method</strong>: the HTTP request method. Used with string operators. Supported in the PreRequest phase.</p>
             * </li>
             * <li><p><strong>request:Http:UserAgent</strong>: the User-Agent of the HTTP request. Used with string operators. Supported in the PreRequest phase.</p>
             * </li>
             * <li><p><strong>request:Http:ContentType</strong>: the Content-Type of the HTTP request. Used with string operators. Supported in the PreRequest phase.</p>
             * </li>
             * <li><p><strong>request:Http:Header</strong>: the HTTP request header. Used with string operators. Supported in the PreRequest phase. When you use this key, append the request header name to the key in the format of request:Http:Header/<HeaderName>.</p>
             * </li>
             * <li><p><strong>request:Protocol</strong>: the request protocol. Used with string operators. Supported in the PreRequest phase.</p>
             * </li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>request:DestinationDomain</p>
             */
            public Builder conditionKey(String conditionKey) {
                this.conditionKey = conditionKey;
                return this;
            }

            /**
             * <p>The operator of the matching condition. Must be used with a condition key (ConditionKey). Valid values:</p>
             * <ul>
             * <li><p><strong>StringEquals</strong>: exact string match.</p>
             * </li>
             * <li><p><strong>StringNotEquals</strong>: string not equal.</p>
             * </li>
             * <li><p><strong>StringEqualsIgnoreCase</strong>: case-insensitive exact string match.</p>
             * </li>
             * <li><p><strong>StringNotEqualsIgnoreCase</strong>: case-insensitive string not equal.</p>
             * </li>
             * <li><p><strong>StringPrefixMatch</strong>: string prefix match.</p>
             * </li>
             * <li><p><strong>StringPrefixMatchIgnoreCase</strong>: case-insensitive string prefix match.</p>
             * </li>
             * <li><p><strong>StringPrefixNotMatch</strong>: string prefix not match.</p>
             * </li>
             * <li><p><strong>StringPrefixNotMatchIgnoreCase</strong>: case-insensitive string prefix not match.</p>
             * </li>
             * <li><p><strong>StringSuffixMatch</strong>: string suffix match.</p>
             * </li>
             * <li><p><strong>StringSuffixMatchIgnoreCase</strong>: case-insensitive string suffix match.</p>
             * </li>
             * <li><p><strong>StringSuffixNotMatch</strong>: string suffix not match.</p>
             * </li>
             * <li><p><strong>StringSuffixNotMatchIgnoreCase</strong>: case-insensitive string suffix not match.</p>
             * </li>
             * <li><p><strong>StringRegexMatch</strong>: string regular expression match.</p>
             * </li>
             * <li><p><strong>StringRegexNotMatch</strong>: string regular expression not match.</p>
             * </li>
             * <li><p><strong>StringWildcardMatch</strong>: string wildcard match.</p>
             * </li>
             * <li><p><strong>StringWildcardMatchIgnoreCase</strong>: case-insensitive string wildcard match.</p>
             * </li>
             * <li><p><strong>StringWildcardNotMatch</strong>: string wildcard not match.</p>
             * </li>
             * <li><p><strong>StringWildcardNotMatchIgnoreCase</strong>: case-insensitive string wildcard not match.</p>
             * </li>
             * <li><p><strong>IpAddress</strong>: the source IP address belongs to the specified IP address or CIDR block.</p>
             * </li>
             * <li><p><strong>NotIpAddress</strong>: the source IP address does not belong to the specified IP address or CIDR block.</p>
             * </li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>StringEquals</p>
             */
            public Builder conditionOperator(String conditionOperator) {
                this.conditionOperator = conditionOperator;
                return this;
            }

            /**
             * <p>The list of condition values.</p>
             * <p>This parameter is required.</p>
             */
            public Builder conditionValues(java.util.List<String> conditionValues) {
                this.conditionValues = conditionValues;
                return this;
            }

            public PreRequestConditions build() {
                return new PreRequestConditions(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEgressProxyRulesRequest} extends {@link TeaModel}
     *
     * <p>CreateEgressProxyRulesRequest</p>
     */
    public static class PreRequest extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        @com.aliyun.core.annotation.Validation(required = true)
        private String action;

        @com.aliyun.core.annotation.NameInMap("Conditions")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<PreRequestConditions> conditions;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EgressProxyRuleName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String egressProxyRuleName;

        @com.aliyun.core.annotation.NameInMap("Priority")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer priority;

        private PreRequest(Builder builder) {
            this.action = builder.action;
            this.conditions = builder.conditions;
            this.description = builder.description;
            this.egressProxyRuleName = builder.egressProxyRuleName;
            this.priority = builder.priority;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PreRequest create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return conditions
         */
        public java.util.List<PreRequestConditions> getConditions() {
            return this.conditions;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return egressProxyRuleName
         */
        public String getEgressProxyRuleName() {
            return this.egressProxyRuleName;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        public static final class Builder {
            private String action; 
            private java.util.List<PreRequestConditions> conditions; 
            private String description; 
            private String egressProxyRuleName; 
            private Integer priority; 

            private Builder() {
            } 

            private Builder(PreRequest model) {
                this.action = model.action;
                this.conditions = model.conditions;
                this.description = model.description;
                this.egressProxyRuleName = model.egressProxyRuleName;
                this.priority = model.priority;
            } 

            /**
             * <p>The action to perform on the matched traffic after the rule is hit. Valid values:</p>
             * <ul>
             * <li><p><strong>Allow</strong>: allows the traffic that matches the rule.</p>
             * </li>
             * <li><p><strong>Deny</strong>: denies the traffic that matches the rule.</p>
             * </li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Allow</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The list of matching conditions for the rule. Each condition consists of a condition key (ConditionKey), an operator (ConditionOperator), and condition values (ConditionValues). The combination of a condition key and an operator must be unique within the same rule.</p>
             * <p>This parameter is required.</p>
             */
            public Builder conditions(java.util.List<PreRequestConditions> conditions) {
                this.conditions = conditions;
                return this;
            }

            /**
             * <p>The description of the egress rule. The description must be 2 to 256 characters in length, and can contain Chinese characters, letters, digits, hyphens (-), forward slashes (/), periods (.), and underscores (_).</p>
             * 
             * <strong>example:</strong>
             * <p>testEpg</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the egress rule. The name must be 2 to 128 characters in length, and must start with a letter or a Chinese character. It can contain digits, periods (.), underscores (_), and hyphens (-).</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>testEpg</p>
             */
            public Builder egressProxyRuleName(String egressProxyRuleName) {
                this.egressProxyRuleName = egressProxyRuleName;
                return this;
            }

            /**
             * <p>The priority of the egress rule within the phase to which it belongs. Valid values: 1 to 1000. A smaller value indicates a higher priority. Within the same phase of a rule group, the priority of rules must be unique.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            public PreRequest build() {
                return new PreRequest(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEgressProxyRulesRequest} extends {@link TeaModel}
     *
     * <p>CreateEgressProxyRulesRequest</p>
     */
    public static class EgressProxyRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PostResponse")
        private java.util.List<PostResponse> postResponse;

        @com.aliyun.core.annotation.NameInMap("PreDns")
        private java.util.List<PreDns> preDns;

        @com.aliyun.core.annotation.NameInMap("PreRequest")
        private java.util.List<PreRequest> preRequest;

        private EgressProxyRules(Builder builder) {
            this.postResponse = builder.postResponse;
            this.preDns = builder.preDns;
            this.preRequest = builder.preRequest;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EgressProxyRules create() {
            return builder().build();
        }

        /**
         * @return postResponse
         */
        public java.util.List<PostResponse> getPostResponse() {
            return this.postResponse;
        }

        /**
         * @return preDns
         */
        public java.util.List<PreDns> getPreDns() {
            return this.preDns;
        }

        /**
         * @return preRequest
         */
        public java.util.List<PreRequest> getPreRequest() {
            return this.preRequest;
        }

        public static final class Builder {
            private java.util.List<PostResponse> postResponse; 
            private java.util.List<PreDns> preDns; 
            private java.util.List<PreRequest> preRequest; 

            private Builder() {
            } 

            private Builder(EgressProxyRules model) {
                this.postResponse = model.postResponse;
                this.preDns = model.preDns;
                this.preRequest = model.preRequest;
            } 

            /**
             * <p>The list of rules in the PostResponse phase (after the response is returned).</p>
             */
            public Builder postResponse(java.util.List<PostResponse> postResponse) {
                this.postResponse = postResponse;
                return this;
            }

            /**
             * <p>The list of rules for the pre-DNS stage (before DNS resolution).</p>
             */
            public Builder preDns(java.util.List<PreDns> preDns) {
                this.preDns = preDns;
                return this;
            }

            /**
             * <p>The list of rules in the PreRequest stage (before request forwarding).</p>
             */
            public Builder preRequest(java.util.List<PreRequest> preRequest) {
                this.preRequest = preRequest;
                return this;
            }

            public EgressProxyRules build() {
                return new EgressProxyRules(this);
            } 

        } 

    }
}
