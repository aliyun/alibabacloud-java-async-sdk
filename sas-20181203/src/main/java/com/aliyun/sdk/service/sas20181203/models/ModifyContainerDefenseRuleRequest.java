// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ModifyContainerDefenseRuleRequest} extends {@link RequestModel}
 *
 * <p>ModifyContainerDefenseRuleRequest</p>
 */
public class ModifyContainerDefenseRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleAction")
    private Integer ruleAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
    private Long ruleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    private String ruleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleSwitch")
    private Integer ruleSwitch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleType")
    private Integer ruleType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scope")
    private java.util.List<Scope> scope;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Whitelist")
    private Whitelist whitelist;

    private ModifyContainerDefenseRuleRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.ruleAction = builder.ruleAction;
        this.ruleId = builder.ruleId;
        this.ruleName = builder.ruleName;
        this.ruleSwitch = builder.ruleSwitch;
        this.ruleType = builder.ruleType;
        this.scope = builder.scope;
        this.whitelist = builder.whitelist;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyContainerDefenseRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return ruleAction
     */
    public Integer getRuleAction() {
        return this.ruleAction;
    }

    /**
     * @return ruleId
     */
    public Long getRuleId() {
        return this.ruleId;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * @return ruleSwitch
     */
    public Integer getRuleSwitch() {
        return this.ruleSwitch;
    }

    /**
     * @return ruleType
     */
    public Integer getRuleType() {
        return this.ruleType;
    }

    /**
     * @return scope
     */
    public java.util.List<Scope> getScope() {
        return this.scope;
    }

    /**
     * @return whitelist
     */
    public Whitelist getWhitelist() {
        return this.whitelist;
    }

    public static final class Builder extends Request.Builder<ModifyContainerDefenseRuleRequest, Builder> {
        private String description; 
        private Integer ruleAction; 
        private Long ruleId; 
        private String ruleName; 
        private Integer ruleSwitch; 
        private Integer ruleType; 
        private java.util.List<Scope> scope; 
        private Whitelist whitelist; 

        private Builder() {
            super();
        } 

        private Builder(ModifyContainerDefenseRuleRequest request) {
            super(request);
            this.description = request.description;
            this.ruleAction = request.ruleAction;
            this.ruleId = request.ruleId;
            this.ruleName = request.ruleName;
            this.ruleSwitch = request.ruleSwitch;
            this.ruleType = request.ruleType;
            this.scope = request.scope;
            this.whitelist = request.whitelist;
        } 

        /**
         * <p>The description of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>Prevent non-mirror programs from starting in containers</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The action specified in the rule. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: alert</li>
         * <li><strong>2</strong>: block</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder ruleAction(Integer ruleAction) {
            this.putQueryParameter("RuleAction", ruleAction);
            this.ruleAction = ruleAction;
            return this;
        }

        /**
         * <p>The ID of the rule.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/2590599.html">ListContainerDefenseRule</a> operation to query the IDs of rules.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder ruleId(Long ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * <p>The name of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>text-001</p>
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * <p>The status of the rule. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: enabled</li>
         * <li><strong>0</strong>: disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder ruleSwitch(Integer ruleSwitch) {
            this.putQueryParameter("RuleSwitch", ruleSwitch);
            this.ruleSwitch = ruleSwitch;
            return this;
        }

        /**
         * <p>The type of the rule. Valid values:</p>
         * <ul>
         * <li>1: system rule</li>
         * <li>2: custom rule</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder ruleType(Integer ruleType) {
            this.putQueryParameter("RuleType", ruleType);
            this.ruleType = ruleType;
            return this;
        }

        /**
         * <p>The effective scope of the rule.</p>
         */
        public Builder scope(java.util.List<Scope> scope) {
            this.putQueryParameter("Scope", scope);
            this.scope = scope;
            return this;
        }

        /**
         * <p>The whitelist.</p>
         */
        public Builder whitelist(Whitelist whitelist) {
            String whitelistShrink = shrink(whitelist, "Whitelist", "json");
            this.putQueryParameter("Whitelist", whitelistShrink);
            this.whitelist = whitelist;
            return this;
        }

        @Override
        public ModifyContainerDefenseRuleRequest build() {
            return new ModifyContainerDefenseRuleRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyContainerDefenseRuleRequest} extends {@link TeaModel}
     *
     * <p>ModifyContainerDefenseRuleRequest</p>
     */
    public static class Scope extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllNamespace")
        private Integer allNamespace;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("Namespaces")
        private java.util.List<String> namespaces;

        private Scope(Builder builder) {
            this.allNamespace = builder.allNamespace;
            this.clusterId = builder.clusterId;
            this.namespaces = builder.namespaces;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Scope create() {
            return builder().build();
        }

        /**
         * @return allNamespace
         */
        public Integer getAllNamespace() {
            return this.allNamespace;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return namespaces
         */
        public java.util.List<String> getNamespaces() {
            return this.namespaces;
        }

        public static final class Builder {
            private Integer allNamespace; 
            private String clusterId; 
            private java.util.List<String> namespaces; 

            /**
             * <p>Specifies whether to include all namespaces. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: no</li>
             * <li><strong>1</strong>: yes</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder allNamespace(Integer allNamespace) {
                this.allNamespace = allNamespace;
                return this;
            }

            /**
             * <p>The ID of the cluster on which the rule takes effect.</p>
             * <blockquote>
             * <p> You can call the <a href="~~DescribeGroupedContainerInstances~~">DescribeGroupedContainerInstances</a> operation to query the IDs of clusters.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>c54b***1501</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The namespaces.</p>
             */
            public Builder namespaces(java.util.List<String> namespaces) {
                this.namespaces = namespaces;
                return this;
            }

            public Scope build() {
                return new Scope(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyContainerDefenseRuleRequest} extends {@link TeaModel}
     *
     * <p>ModifyContainerDefenseRuleRequest</p>
     */
    public static class Whitelist extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Hash")
        @Deprecated
        private java.util.List<String> hash;

        @com.aliyun.core.annotation.NameInMap("Image")
        private java.util.List<String> image;

        @com.aliyun.core.annotation.NameInMap("Path")
        private java.util.List<String> path;

        private Whitelist(Builder builder) {
            this.hash = builder.hash;
            this.image = builder.image;
            this.path = builder.path;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Whitelist create() {
            return builder().build();
        }

        /**
         * @return hash
         */
        public java.util.List<String> getHash() {
            return this.hash;
        }

        /**
         * @return image
         */
        public java.util.List<String> getImage() {
            return this.image;
        }

        /**
         * @return path
         */
        public java.util.List<String> getPath() {
            return this.path;
        }

        public static final class Builder {
            private java.util.List<String> hash; 
            private java.util.List<String> image; 
            private java.util.List<String> path; 

            /**
             * <p>The hash values of the files that need to be added to the whitelist.</p>
             * <blockquote>
             * <p> This parameter is not supported.</p>
             * </blockquote>
             */
            public Builder hash(java.util.List<String> hash) {
                this.hash = hash;
                return this;
            }

            /**
             * <p>The images that need to be added to the whitelist.</p>
             */
            public Builder image(java.util.List<String> image) {
                this.image = image;
                return this;
            }

            /**
             * <p>The paths to the files that need to be added to the whitelist.</p>
             */
            public Builder path(java.util.List<String> path) {
                this.path = path;
                return this;
            }

            public Whitelist build() {
                return new Whitelist(this);
            } 

        } 

    }
}
