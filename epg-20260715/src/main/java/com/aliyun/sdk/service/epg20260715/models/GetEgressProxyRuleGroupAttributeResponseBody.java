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
 * {@link GetEgressProxyRuleGroupAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>GetEgressProxyRuleGroupAttributeResponseBody</p>
 */
public class GetEgressProxyRuleGroupAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("EgressProxyIpPoolId")
    private String egressProxyIpPoolId;

    @com.aliyun.core.annotation.NameInMap("EgressProxyRuleGroupId")
    private String egressProxyRuleGroupId;

    @com.aliyun.core.annotation.NameInMap("EgressProxyRuleGroupName")
    private String egressProxyRuleGroupName;

    @com.aliyun.core.annotation.NameInMap("EgressProxyRules")
    private EgressProxyRules egressProxyRules;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    private GetEgressProxyRuleGroupAttributeResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.egressProxyIpPoolId = builder.egressProxyIpPoolId;
        this.egressProxyRuleGroupId = builder.egressProxyRuleGroupId;
        this.egressProxyRuleGroupName = builder.egressProxyRuleGroupName;
        this.egressProxyRules = builder.egressProxyRules;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.status = builder.status;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEgressProxyRuleGroupAttributeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return egressProxyIpPoolId
     */
    public String getEgressProxyIpPoolId() {
        return this.egressProxyIpPoolId;
    }

    /**
     * @return egressProxyRuleGroupId
     */
    public String getEgressProxyRuleGroupId() {
        return this.egressProxyRuleGroupId;
    }

    /**
     * @return egressProxyRuleGroupName
     */
    public String getEgressProxyRuleGroupName() {
        return this.egressProxyRuleGroupName;
    }

    /**
     * @return egressProxyRules
     */
    public EgressProxyRules getEgressProxyRules() {
        return this.egressProxyRules;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    public static final class Builder {
        private String createTime; 
        private String description; 
        private String egressProxyIpPoolId; 
        private String egressProxyRuleGroupId; 
        private String egressProxyRuleGroupName; 
        private EgressProxyRules egressProxyRules; 
        private String requestId; 
        private String resourceGroupId; 
        private String status; 
        private java.util.List<Tags> tags; 

        private Builder() {
        } 

        private Builder(GetEgressProxyRuleGroupAttributeResponseBody model) {
            this.createTime = model.createTime;
            this.description = model.description;
            this.egressProxyIpPoolId = model.egressProxyIpPoolId;
            this.egressProxyRuleGroupId = model.egressProxyRuleGroupId;
            this.egressProxyRuleGroupName = model.egressProxyRuleGroupName;
            this.egressProxyRules = model.egressProxyRules;
            this.requestId = model.requestId;
            this.resourceGroupId = model.resourceGroupId;
            this.status = model.status;
            this.tags = model.tags;
        } 

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
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
         * EgressProxyIpPoolId.
         */
        public Builder egressProxyIpPoolId(String egressProxyIpPoolId) {
            this.egressProxyIpPoolId = egressProxyIpPoolId;
            return this;
        }

        /**
         * EgressProxyRuleGroupId.
         */
        public Builder egressProxyRuleGroupId(String egressProxyRuleGroupId) {
            this.egressProxyRuleGroupId = egressProxyRuleGroupId;
            return this;
        }

        /**
         * EgressProxyRuleGroupName.
         */
        public Builder egressProxyRuleGroupName(String egressProxyRuleGroupName) {
            this.egressProxyRuleGroupName = egressProxyRuleGroupName;
            return this;
        }

        /**
         * EgressProxyRules.
         */
        public Builder egressProxyRules(EgressProxyRules egressProxyRules) {
            this.egressProxyRules = egressProxyRules;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.tags = tags;
            return this;
        }

        public GetEgressProxyRuleGroupAttributeResponseBody build() {
            return new GetEgressProxyRuleGroupAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetEgressProxyRuleGroupAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>GetEgressProxyRuleGroupAttributeResponseBody</p>
     */
    public static class Conditions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConditionKey")
        private String conditionKey;

        @com.aliyun.core.annotation.NameInMap("ConditionOperator")
        private String conditionOperator;

        @com.aliyun.core.annotation.NameInMap("ConditionValues")
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
             * ConditionKey.
             */
            public Builder conditionKey(String conditionKey) {
                this.conditionKey = conditionKey;
                return this;
            }

            /**
             * ConditionOperator.
             */
            public Builder conditionOperator(String conditionOperator) {
                this.conditionOperator = conditionOperator;
                return this;
            }

            /**
             * ConditionValues.
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
     * {@link GetEgressProxyRuleGroupAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>GetEgressProxyRuleGroupAttributeResponseBody</p>
     */
    public static class PostResponse extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("Conditions")
        private java.util.List<Conditions> conditions;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EgressProxyRuleId")
        private String egressProxyRuleId;

        @com.aliyun.core.annotation.NameInMap("EgressProxyRuleName")
        private String egressProxyRuleName;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        private PostResponse(Builder builder) {
            this.action = builder.action;
            this.conditions = builder.conditions;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.egressProxyRuleId = builder.egressProxyRuleId;
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
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
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

        public static final class Builder {
            private String action; 
            private java.util.List<Conditions> conditions; 
            private String createTime; 
            private String description; 
            private String egressProxyRuleId; 
            private String egressProxyRuleName; 
            private Integer priority; 

            private Builder() {
            } 

            private Builder(PostResponse model) {
                this.action = model.action;
                this.conditions = model.conditions;
                this.createTime = model.createTime;
                this.description = model.description;
                this.egressProxyRuleId = model.egressProxyRuleId;
                this.egressProxyRuleName = model.egressProxyRuleName;
                this.priority = model.priority;
            } 

            /**
             * Action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * Conditions.
             */
            public Builder conditions(java.util.List<Conditions> conditions) {
                this.conditions = conditions;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
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
             * EgressProxyRuleId.
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

            public PostResponse build() {
                return new PostResponse(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEgressProxyRuleGroupAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>GetEgressProxyRuleGroupAttributeResponseBody</p>
     */
    public static class PreDnsConditions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConditionKey")
        private String conditionKey;

        @com.aliyun.core.annotation.NameInMap("ConditionOperator")
        private String conditionOperator;

        @com.aliyun.core.annotation.NameInMap("ConditionValues")
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
             * ConditionKey.
             */
            public Builder conditionKey(String conditionKey) {
                this.conditionKey = conditionKey;
                return this;
            }

            /**
             * ConditionOperator.
             */
            public Builder conditionOperator(String conditionOperator) {
                this.conditionOperator = conditionOperator;
                return this;
            }

            /**
             * ConditionValues.
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
     * {@link GetEgressProxyRuleGroupAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>GetEgressProxyRuleGroupAttributeResponseBody</p>
     */
    public static class PreDns extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("Conditions")
        private java.util.List<PreDnsConditions> conditions;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EgressProxyRuleId")
        private String egressProxyRuleId;

        @com.aliyun.core.annotation.NameInMap("EgressProxyRuleName")
        private String egressProxyRuleName;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        private PreDns(Builder builder) {
            this.action = builder.action;
            this.conditions = builder.conditions;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.egressProxyRuleId = builder.egressProxyRuleId;
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
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
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

        public static final class Builder {
            private String action; 
            private java.util.List<PreDnsConditions> conditions; 
            private String createTime; 
            private String description; 
            private String egressProxyRuleId; 
            private String egressProxyRuleName; 
            private Integer priority; 

            private Builder() {
            } 

            private Builder(PreDns model) {
                this.action = model.action;
                this.conditions = model.conditions;
                this.createTime = model.createTime;
                this.description = model.description;
                this.egressProxyRuleId = model.egressProxyRuleId;
                this.egressProxyRuleName = model.egressProxyRuleName;
                this.priority = model.priority;
            } 

            /**
             * Action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * Conditions.
             */
            public Builder conditions(java.util.List<PreDnsConditions> conditions) {
                this.conditions = conditions;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
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
             * EgressProxyRuleId.
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

            public PreDns build() {
                return new PreDns(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEgressProxyRuleGroupAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>GetEgressProxyRuleGroupAttributeResponseBody</p>
     */
    public static class PreRequestConditions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConditionKey")
        private String conditionKey;

        @com.aliyun.core.annotation.NameInMap("ConditionOperator")
        private String conditionOperator;

        @com.aliyun.core.annotation.NameInMap("ConditionValues")
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
             * ConditionKey.
             */
            public Builder conditionKey(String conditionKey) {
                this.conditionKey = conditionKey;
                return this;
            }

            /**
             * ConditionOperator.
             */
            public Builder conditionOperator(String conditionOperator) {
                this.conditionOperator = conditionOperator;
                return this;
            }

            /**
             * ConditionValues.
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
     * {@link GetEgressProxyRuleGroupAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>GetEgressProxyRuleGroupAttributeResponseBody</p>
     */
    public static class PreRequest extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("Conditions")
        private java.util.List<PreRequestConditions> conditions;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EgressProxyRuleId")
        private String egressProxyRuleId;

        @com.aliyun.core.annotation.NameInMap("EgressProxyRuleName")
        private String egressProxyRuleName;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        private PreRequest(Builder builder) {
            this.action = builder.action;
            this.conditions = builder.conditions;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.egressProxyRuleId = builder.egressProxyRuleId;
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
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
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

        public static final class Builder {
            private String action; 
            private java.util.List<PreRequestConditions> conditions; 
            private String createTime; 
            private String description; 
            private String egressProxyRuleId; 
            private String egressProxyRuleName; 
            private Integer priority; 

            private Builder() {
            } 

            private Builder(PreRequest model) {
                this.action = model.action;
                this.conditions = model.conditions;
                this.createTime = model.createTime;
                this.description = model.description;
                this.egressProxyRuleId = model.egressProxyRuleId;
                this.egressProxyRuleName = model.egressProxyRuleName;
                this.priority = model.priority;
            } 

            /**
             * Action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * Conditions.
             */
            public Builder conditions(java.util.List<PreRequestConditions> conditions) {
                this.conditions = conditions;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
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
             * EgressProxyRuleId.
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

            public PreRequest build() {
                return new PreRequest(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEgressProxyRuleGroupAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>GetEgressProxyRuleGroupAttributeResponseBody</p>
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
             * PostResponse.
             */
            public Builder postResponse(java.util.List<PostResponse> postResponse) {
                this.postResponse = postResponse;
                return this;
            }

            /**
             * PreDns.
             */
            public Builder preDns(java.util.List<PreDns> preDns) {
                this.preDns = preDns;
                return this;
            }

            /**
             * PreRequest.
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
    /**
     * 
     * {@link GetEgressProxyRuleGroupAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>GetEgressProxyRuleGroupAttributeResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
