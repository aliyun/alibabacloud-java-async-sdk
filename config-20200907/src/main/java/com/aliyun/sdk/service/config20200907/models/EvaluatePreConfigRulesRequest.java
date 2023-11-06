// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EvaluatePreConfigRulesRequest} extends {@link RequestModel}
 *
 * <p>EvaluatePreConfigRulesRequest</p>
 */
public class EvaluatePreConfigRulesRequest extends Request {
    @Body
    @NameInMap("EnableManagedRules")
    private Boolean enableManagedRules;

    @Body
    @NameInMap("ResourceEvaluateItems")
    @Validation(required = true)
    private java.util.List < ResourceEvaluateItems> resourceEvaluateItems;

    private EvaluatePreConfigRulesRequest(Builder builder) {
        super(builder);
        this.enableManagedRules = builder.enableManagedRules;
        this.resourceEvaluateItems = builder.resourceEvaluateItems;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EvaluatePreConfigRulesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enableManagedRules
     */
    public Boolean getEnableManagedRules() {
        return this.enableManagedRules;
    }

    /**
     * @return resourceEvaluateItems
     */
    public java.util.List < ResourceEvaluateItems> getResourceEvaluateItems() {
        return this.resourceEvaluateItems;
    }

    public static final class Builder extends Request.Builder<EvaluatePreConfigRulesRequest, Builder> {
        private Boolean enableManagedRules; 
        private java.util.List < ResourceEvaluateItems> resourceEvaluateItems; 

        private Builder() {
            super();
        } 

        private Builder(EvaluatePreConfigRulesRequest request) {
            super(request);
            this.enableManagedRules = request.enableManagedRules;
            this.resourceEvaluateItems = request.resourceEvaluateItems;
        } 

        /**
         * Specifies whether to enable the managed rule. Valid values:
         * <p>
         * 
         * *   true: enables the managed rule.
         * *   false: does not enable the managed rule. This is the default value.
         * 
         * >  After you create an evaluation rule, a managed rule that has the same settings as the evaluation rule is created. After you create a resource, the managed rule can be used to continuously check the compliance of the resource.
         */
        public Builder enableManagedRules(Boolean enableManagedRules) {
            this.putBodyParameter("EnableManagedRules", enableManagedRules);
            this.enableManagedRules = enableManagedRules;
            return this;
        }

        /**
         * The resources that you want to evaluate.
         */
        public Builder resourceEvaluateItems(java.util.List < ResourceEvaluateItems> resourceEvaluateItems) {
            String resourceEvaluateItemsShrink = shrink(resourceEvaluateItems, "ResourceEvaluateItems", "json");
            this.putBodyParameter("ResourceEvaluateItems", resourceEvaluateItemsShrink);
            this.resourceEvaluateItems = resourceEvaluateItems;
            return this;
        }

        @Override
        public EvaluatePreConfigRulesRequest build() {
            return new EvaluatePreConfigRulesRequest(this);
        } 

    } 

    public static class Rules extends TeaModel {
        @NameInMap("Identifier")
        private String identifier;

        @NameInMap("InputParameters")
        private String inputParameters;

        private Rules(Builder builder) {
            this.identifier = builder.identifier;
            this.inputParameters = builder.inputParameters;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return identifier
         */
        public String getIdentifier() {
            return this.identifier;
        }

        /**
         * @return inputParameters
         */
        public String getInputParameters() {
            return this.inputParameters;
        }

        public static final class Builder {
            private String identifier; 
            private String inputParameters; 

            /**
             * The identifier of the evaluation rule.
             * <p>
             * 
             * For more information about how to obtain the identifier of an evaluation rule, see [ListManagedRules](~~467810~~).
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * The input parameters of the evaluation rule.
             */
            public Builder inputParameters(String inputParameters) {
                this.inputParameters = inputParameters;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
    public static class ResourceEvaluateItems extends TeaModel {
        @NameInMap("ResourceLogicalId")
        private String resourceLogicalId;

        @NameInMap("ResourceProperties")
        private String resourceProperties;

        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("Rules")
        private java.util.List < Rules> rules;

        private ResourceEvaluateItems(Builder builder) {
            this.resourceLogicalId = builder.resourceLogicalId;
            this.resourceProperties = builder.resourceProperties;
            this.resourceType = builder.resourceType;
            this.rules = builder.rules;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceEvaluateItems create() {
            return builder().build();
        }

        /**
         * @return resourceLogicalId
         */
        public String getResourceLogicalId() {
            return this.resourceLogicalId;
        }

        /**
         * @return resourceProperties
         */
        public String getResourceProperties() {
            return this.resourceProperties;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return rules
         */
        public java.util.List < Rules> getRules() {
            return this.rules;
        }

        public static final class Builder {
            private String resourceLogicalId; 
            private String resourceProperties; 
            private String resourceType; 
            private java.util.List < Rules> rules; 

            /**
             * The logical ID of the resource.
             */
            public Builder resourceLogicalId(String resourceLogicalId) {
                this.resourceLogicalId = resourceLogicalId;
                return this;
            }

            /**
             * The properties of the resource.
             */
            public Builder resourceProperties(String resourceProperties) {
                this.resourceProperties = resourceProperties;
                return this;
            }

            /**
             * The type of the resource.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * The evaluation rules.
             */
            public Builder rules(java.util.List < Rules> rules) {
                this.rules = rules;
                return this;
            }

            public ResourceEvaluateItems build() {
                return new ResourceEvaluateItems(this);
            } 

        } 

    }
}
