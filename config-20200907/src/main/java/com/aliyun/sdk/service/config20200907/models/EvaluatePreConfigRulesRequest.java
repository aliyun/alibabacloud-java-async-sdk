// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link EvaluatePreConfigRulesRequest} extends {@link RequestModel}
 *
 * <p>EvaluatePreConfigRulesRequest</p>
 */
public class EvaluatePreConfigRulesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnableManagedRules")
    private Boolean enableManagedRules;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceEvaluateItems")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<ResourceEvaluateItems> resourceEvaluateItems;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceTypeFormat")
    private String resourceTypeFormat;

    private EvaluatePreConfigRulesRequest(Builder builder) {
        super(builder);
        this.enableManagedRules = builder.enableManagedRules;
        this.resourceEvaluateItems = builder.resourceEvaluateItems;
        this.resourceTypeFormat = builder.resourceTypeFormat;
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
    public java.util.List<ResourceEvaluateItems> getResourceEvaluateItems() {
        return this.resourceEvaluateItems;
    }

    /**
     * @return resourceTypeFormat
     */
    public String getResourceTypeFormat() {
        return this.resourceTypeFormat;
    }

    public static final class Builder extends Request.Builder<EvaluatePreConfigRulesRequest, Builder> {
        private Boolean enableManagedRules; 
        private java.util.List<ResourceEvaluateItems> resourceEvaluateItems; 
        private String resourceTypeFormat; 

        private Builder() {
            super();
        } 

        private Builder(EvaluatePreConfigRulesRequest request) {
            super(request);
            this.enableManagedRules = request.enableManagedRules;
            this.resourceEvaluateItems = request.resourceEvaluateItems;
            this.resourceTypeFormat = request.resourceTypeFormat;
        } 

        /**
         * <p>Specifies whether to enable the managed rule. Valid values:</p>
         * <ul>
         * <li>true: enables the managed rule.</li>
         * <li>false: does not enable the managed rule. This is the default value.</li>
         * </ul>
         * <blockquote>
         * <p> After you create an evaluation rule, a managed rule that has the same settings as the evaluation rule is created. After you create a resource, the managed rule can be used to continuously check the compliance of the resource.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableManagedRules(Boolean enableManagedRules) {
            this.putBodyParameter("EnableManagedRules", enableManagedRules);
            this.enableManagedRules = enableManagedRules;
            return this;
        }

        /**
         * <p>The resources that you want to evaluate.</p>
         * <p>This parameter is required.</p>
         */
        public Builder resourceEvaluateItems(java.util.List<ResourceEvaluateItems> resourceEvaluateItems) {
            String resourceEvaluateItemsShrink = shrink(resourceEvaluateItems, "ResourceEvaluateItems", "json");
            this.putBodyParameter("ResourceEvaluateItems", resourceEvaluateItemsShrink);
            this.resourceEvaluateItems = resourceEvaluateItems;
            return this;
        }

        /**
         * <p>下一个查询开始Token</p>
         * 
         * <strong>example:</strong>
         * <p>ros</p>
         */
        public Builder resourceTypeFormat(String resourceTypeFormat) {
            this.putBodyParameter("ResourceTypeFormat", resourceTypeFormat);
            this.resourceTypeFormat = resourceTypeFormat;
            return this;
        }

        @Override
        public EvaluatePreConfigRulesRequest build() {
            return new EvaluatePreConfigRulesRequest(this);
        } 

    } 

    /**
     * 
     * {@link EvaluatePreConfigRulesRequest} extends {@link TeaModel}
     *
     * <p>EvaluatePreConfigRulesRequest</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Identifier")
        private String identifier;

        @com.aliyun.core.annotation.NameInMap("InputParameters")
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

            private Builder() {
            } 

            private Builder(Rules model) {
                this.identifier = model.identifier;
                this.inputParameters = model.inputParameters;
            } 

            /**
             * <p>The identifier of the evaluation rule.</p>
             * <p>For more information about how to obtain the identifier of an evaluation rule, see <a href="https://help.aliyun.com/document_detail/467810.html">ListManagedRules</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs-instance-deletion-protection-enabled</p>
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * <p>The input parameters of the evaluation rule.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
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
    /**
     * 
     * {@link EvaluatePreConfigRulesRequest} extends {@link TeaModel}
     *
     * <p>EvaluatePreConfigRulesRequest</p>
     */
    public static class ResourceEvaluateItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceLogicalId")
        private String resourceLogicalId;

        @com.aliyun.core.annotation.NameInMap("ResourceProperties")
        private String resourceProperties;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("Rules")
        private java.util.List<Rules> rules;

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
        public java.util.List<Rules> getRules() {
            return this.rules;
        }

        public static final class Builder {
            private String resourceLogicalId; 
            private String resourceProperties; 
            private String resourceType; 
            private java.util.List<Rules> rules; 

            private Builder() {
            } 

            private Builder(ResourceEvaluateItems model) {
                this.resourceLogicalId = model.resourceLogicalId;
                this.resourceProperties = model.resourceProperties;
                this.resourceType = model.resourceType;
                this.rules = model.rules;
            } 

            /**
             * <p>The logical ID of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>ResourceLogicId-test</p>
             */
            public Builder resourceLogicalId(String resourceLogicalId) {
                this.resourceLogicalId = resourceLogicalId;
                return this;
            }

            /**
             * <p>The properties of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;ImageId&quot;: &quot;ubuntu_18_04_64_20G_alibase_20190624.vhd&quot;,
             *     &quot;SecurityGroupId&quot;: &quot;sg-bp15ed6xe1yxeycg****&quot;,
             *     &quot;HostName&quot;: &quot;LocalHostName&quot;,
             *     &quot;RegionId&quot;: &quot;cn-hangzhou&quot;
             * }</p>
             */
            public Builder resourceProperties(String resourceProperties) {
                this.resourceProperties = resourceProperties;
                return this;
            }

            /**
             * <p>The type of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>ACS::ECS::Instance</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The evaluation rules.</p>
             */
            public Builder rules(java.util.List<Rules> rules) {
                this.rules = rules;
                return this;
            }

            public ResourceEvaluateItems build() {
                return new ResourceEvaluateItems(this);
            } 

        } 

    }
}
