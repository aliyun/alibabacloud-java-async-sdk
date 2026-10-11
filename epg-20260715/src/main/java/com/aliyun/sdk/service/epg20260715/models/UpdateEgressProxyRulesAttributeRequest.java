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
 * {@link UpdateEgressProxyRulesAttributeRequest} extends {@link RequestModel}
 *
 * <p>UpdateEgressProxyRulesAttributeRequest</p>
 */
public class UpdateEgressProxyRulesAttributeRequest extends Request {
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
    private java.util.List<EgressProxyRules> egressProxyRules;

    private UpdateEgressProxyRulesAttributeRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.egressProxyRuleGroupId = builder.egressProxyRuleGroupId;
        this.egressProxyRules = builder.egressProxyRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEgressProxyRulesAttributeRequest create() {
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
    public java.util.List<EgressProxyRules> getEgressProxyRules() {
        return this.egressProxyRules;
    }

    public static final class Builder extends Request.Builder<UpdateEgressProxyRulesAttributeRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String egressProxyRuleGroupId; 
        private java.util.List<EgressProxyRules> egressProxyRules; 

        private Builder() {
            super();
        } 

        private Builder(UpdateEgressProxyRulesAttributeRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.egressProxyRuleGroupId = request.egressProxyRuleGroupId;
            this.egressProxyRules = request.egressProxyRules;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putBodyParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eprg-gw80bb6a95380edb****</p>
         */
        public Builder egressProxyRuleGroupId(String egressProxyRuleGroupId) {
            this.putBodyParameter("EgressProxyRuleGroupId", egressProxyRuleGroupId);
            this.egressProxyRuleGroupId = egressProxyRuleGroupId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder egressProxyRules(java.util.List<EgressProxyRules> egressProxyRules) {
            this.putBodyParameter("EgressProxyRules", egressProxyRules);
            this.egressProxyRules = egressProxyRules;
            return this;
        }

        @Override
        public UpdateEgressProxyRulesAttributeRequest build() {
            return new UpdateEgressProxyRulesAttributeRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateEgressProxyRulesAttributeRequest} extends {@link TeaModel}
     *
     * <p>UpdateEgressProxyRulesAttributeRequest</p>
     */
    public static class AddConditions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConditionKey")
        @com.aliyun.core.annotation.Validation(required = true)
        private String conditionKey;

        @com.aliyun.core.annotation.NameInMap("ConditionOperator")
        @com.aliyun.core.annotation.Validation(required = true)
        private String conditionOperator;

        @com.aliyun.core.annotation.NameInMap("ConditionValues")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> conditionValues;

        private AddConditions(Builder builder) {
            this.conditionKey = builder.conditionKey;
            this.conditionOperator = builder.conditionOperator;
            this.conditionValues = builder.conditionValues;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddConditions create() {
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

            private Builder(AddConditions model) {
                this.conditionKey = model.conditionKey;
                this.conditionOperator = model.conditionOperator;
                this.conditionValues = model.conditionValues;
            } 

            /**
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
             * <p>This parameter is required.</p>
             */
            public Builder conditionValues(java.util.List<String> conditionValues) {
                this.conditionValues = conditionValues;
                return this;
            }

            public AddConditions build() {
                return new AddConditions(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateEgressProxyRulesAttributeRequest} extends {@link TeaModel}
     *
     * <p>UpdateEgressProxyRulesAttributeRequest</p>
     */
    public static class RemoveConditions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConditionKey")
        @com.aliyun.core.annotation.Validation(required = true)
        private String conditionKey;

        @com.aliyun.core.annotation.NameInMap("ConditionOperator")
        @com.aliyun.core.annotation.Validation(required = true)
        private String conditionOperator;

        @com.aliyun.core.annotation.NameInMap("ConditionValues")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> conditionValues;

        private RemoveConditions(Builder builder) {
            this.conditionKey = builder.conditionKey;
            this.conditionOperator = builder.conditionOperator;
            this.conditionValues = builder.conditionValues;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RemoveConditions create() {
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

            private Builder(RemoveConditions model) {
                this.conditionKey = model.conditionKey;
                this.conditionOperator = model.conditionOperator;
                this.conditionValues = model.conditionValues;
            } 

            /**
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
             * <p>This parameter is required.</p>
             */
            public Builder conditionValues(java.util.List<String> conditionValues) {
                this.conditionValues = conditionValues;
                return this;
            }

            public RemoveConditions build() {
                return new RemoveConditions(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateEgressProxyRulesAttributeRequest} extends {@link TeaModel}
     *
     * <p>UpdateEgressProxyRulesAttributeRequest</p>
     */
    public static class EgressProxyRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("AddConditions")
        private java.util.List<AddConditions> addConditions;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EgressProxyRuleId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String egressProxyRuleId;

        @com.aliyun.core.annotation.NameInMap("EgressProxyRuleName")
        private String egressProxyRuleName;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("RemoveConditions")
        private java.util.List<RemoveConditions> removeConditions;

        private EgressProxyRules(Builder builder) {
            this.action = builder.action;
            this.addConditions = builder.addConditions;
            this.description = builder.description;
            this.egressProxyRuleId = builder.egressProxyRuleId;
            this.egressProxyRuleName = builder.egressProxyRuleName;
            this.priority = builder.priority;
            this.removeConditions = builder.removeConditions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EgressProxyRules create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return addConditions
         */
        public java.util.List<AddConditions> getAddConditions() {
            return this.addConditions;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return egressProxyRuleId
         */
        public String getEgressProxyRuleId() {
            return this.egressProxyRuleId;
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

        /**
         * @return removeConditions
         */
        public java.util.List<RemoveConditions> getRemoveConditions() {
            return this.removeConditions;
        }

        public static final class Builder {
            private String action; 
            private java.util.List<AddConditions> addConditions; 
            private String description; 
            private String egressProxyRuleId; 
            private String egressProxyRuleName; 
            private Integer priority; 
            private java.util.List<RemoveConditions> removeConditions; 

            private Builder() {
            } 

            private Builder(EgressProxyRules model) {
                this.action = model.action;
                this.addConditions = model.addConditions;
                this.description = model.description;
                this.egressProxyRuleId = model.egressProxyRuleId;
                this.egressProxyRuleName = model.egressProxyRuleName;
                this.priority = model.priority;
                this.removeConditions = model.removeConditions;
            } 

            /**
             * Action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * AddConditions.
             */
            public Builder addConditions(java.util.List<AddConditions> addConditions) {
                this.addConditions = addConditions;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>epr-gw80bb6a91dbb775****</p>
             */
            public Builder egressProxyRuleId(String egressProxyRuleId) {
                this.egressProxyRuleId = egressProxyRuleId;
                return this;
            }

            /**
             * EgressProxyRuleName.
             */
            public Builder egressProxyRuleName(String egressProxyRuleName) {
                this.egressProxyRuleName = egressProxyRuleName;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * RemoveConditions.
             */
            public Builder removeConditions(java.util.List<RemoveConditions> removeConditions) {
                this.removeConditions = removeConditions;
                return this;
            }

            public EgressProxyRules build() {
                return new EgressProxyRules(this);
            } 

        } 

    }
}
