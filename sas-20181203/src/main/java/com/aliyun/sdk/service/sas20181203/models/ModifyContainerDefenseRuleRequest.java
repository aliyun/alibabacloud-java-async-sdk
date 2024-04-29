// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    private java.util.List < Scope> scope;

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
    public java.util.List < Scope> getScope() {
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
        private java.util.List < Scope> scope; 
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
         * The description of the rule.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The action specified in the rule. Valid values:
         * <p>
         * 
         * *   **1**: alert
         * *   **2**: block
         */
        public Builder ruleAction(Integer ruleAction) {
            this.putQueryParameter("RuleAction", ruleAction);
            this.ruleAction = ruleAction;
            return this;
        }

        /**
         * The ID of the rule.
         * <p>
         * 
         * >  You can call the [ListContainerDefenseRule](~~2590599~~) operation to query the IDs of rules.
         */
        public Builder ruleId(Long ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * The name of the rule.
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * The status of the rule. Valid values:
         * <p>
         * 
         * *   **1**: enabled
         * *   **0**: disabled
         */
        public Builder ruleSwitch(Integer ruleSwitch) {
            this.putQueryParameter("RuleSwitch", ruleSwitch);
            this.ruleSwitch = ruleSwitch;
            return this;
        }

        /**
         * The type of the rule. Valid values:
         * <p>
         * 
         * *   1: system rule
         * *   2: custom rule
         */
        public Builder ruleType(Integer ruleType) {
            this.putQueryParameter("RuleType", ruleType);
            this.ruleType = ruleType;
            return this;
        }

        /**
         * The effective scope of the rule.
         */
        public Builder scope(java.util.List < Scope> scope) {
            this.putQueryParameter("Scope", scope);
            this.scope = scope;
            return this;
        }

        /**
         * The whitelist.
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

    public static class Scope extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllNamespace")
        private Integer allNamespace;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("Namespaces")
        private java.util.List < String > namespaces;

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
        public java.util.List < String > getNamespaces() {
            return this.namespaces;
        }

        public static final class Builder {
            private Integer allNamespace; 
            private String clusterId; 
            private java.util.List < String > namespaces; 

            /**
             * Specifies whether to include all namespaces. Valid values:
             * <p>
             * 
             * *   **0**: no
             * *   **1**: yes
             */
            public Builder allNamespace(Integer allNamespace) {
                this.allNamespace = allNamespace;
                return this;
            }

            /**
             * The ID of the cluster on which the rule takes effect.
             * <p>
             * 
             * >  You can call the [DescribeGroupedContainerInstances](~~DescribeGroupedContainerInstances~~) operation to query the IDs of clusters.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The namespaces.
             */
            public Builder namespaces(java.util.List < String > namespaces) {
                this.namespaces = namespaces;
                return this;
            }

            public Scope build() {
                return new Scope(this);
            } 

        } 

    }
    public static class Whitelist extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Hash")
        private java.util.List < String > hash;

        @com.aliyun.core.annotation.NameInMap("Image")
        private java.util.List < String > image;

        @com.aliyun.core.annotation.NameInMap("Path")
        private java.util.List < String > path;

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
        public java.util.List < String > getHash() {
            return this.hash;
        }

        /**
         * @return image
         */
        public java.util.List < String > getImage() {
            return this.image;
        }

        /**
         * @return path
         */
        public java.util.List < String > getPath() {
            return this.path;
        }

        public static final class Builder {
            private java.util.List < String > hash; 
            private java.util.List < String > image; 
            private java.util.List < String > path; 

            /**
             * The hash values of the files that need to be added to the whitelist.
             * <p>
             * 
             * >  This parameter is not supported.
             */
            public Builder hash(java.util.List < String > hash) {
                this.hash = hash;
                return this;
            }

            /**
             * The images that need to be added to the whitelist.
             */
            public Builder image(java.util.List < String > image) {
                this.image = image;
                return this;
            }

            /**
             * The paths to the files that need to be added to the whitelist.
             */
            public Builder path(java.util.List < String > path) {
                this.path = path;
                return this;
            }

            public Whitelist build() {
                return new Whitelist(this);
            } 

        } 

    }
}
