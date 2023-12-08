// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddContainerDefenseRuleRequest} extends {@link RequestModel}
 *
 * <p>AddContainerDefenseRuleRequest</p>
 */
public class AddContainerDefenseRuleRequest extends Request {
    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("RuleAction")
    private Integer ruleAction;

    @Query
    @NameInMap("RuleId")
    private Long ruleId;

    @Query
    @NameInMap("RuleName")
    private String ruleName;

    @Query
    @NameInMap("RuleSwitch")
    private Integer ruleSwitch;

    @Query
    @NameInMap("RuleType")
    private Integer ruleType;

    @Query
    @NameInMap("Scope")
    private java.util.List < Scope> scope;

    @Query
    @NameInMap("Whitelist")
    private Whitelist whitelist;

    private AddContainerDefenseRuleRequest(Builder builder) {
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

    public static AddContainerDefenseRuleRequest create() {
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

    public static final class Builder extends Request.Builder<AddContainerDefenseRuleRequest, Builder> {
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

        private Builder(AddContainerDefenseRuleRequest request) {
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
         * The action that is performed when the rule is hit. Valid values:
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
         * The ID of the rule. You do not need to manually specify the ID.
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
         * The switch of the rule. Valid values:
         * <p>
         * 
         * *   **0**: off
         * *   **1**: on
         */
        public Builder ruleSwitch(Integer ruleSwitch) {
            this.putQueryParameter("RuleSwitch", ruleSwitch);
            this.ruleSwitch = ruleSwitch;
            return this;
        }

        /**
         * The rule type. Valid values:
         * <p>
         * 
         * *   2: user-defined rules
         * 
         * > Only the value 2 is supported.
         */
        public Builder ruleType(Integer ruleType) {
            this.putQueryParameter("RuleType", ruleType);
            this.ruleType = ruleType;
            return this;
        }

        /**
         * The scope.
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
        public AddContainerDefenseRuleRequest build() {
            return new AddContainerDefenseRuleRequest(this);
        } 

    } 

    public static class Scope extends TeaModel {
        @NameInMap("AllNamespace")
        private Integer allNamespace;

        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("Namespaces")
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
             * *   **0**: You can use the Namespaces parameter to specify the namespaces to include.
             * *   **1**: All namespaces are included.
             */
            public Builder allNamespace(Integer allNamespace) {
                this.allNamespace = allNamespace;
                return this;
            }

            /**
             * The ID of the cluster.
             * <p>
             * 
             * >  You can call the [DescribeGroupedContainerInstances](~~182997~~) operation to query the IDs of clusters.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The namespaces to include.
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
        @NameInMap("Hash")
        private java.util.List < String > hash;

        @NameInMap("Image")
        private java.util.List < String > image;

        @NameInMap("Path")
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
             * > This parameter is not supported.
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
