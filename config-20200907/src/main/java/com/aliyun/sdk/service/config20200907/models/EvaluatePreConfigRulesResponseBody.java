// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EvaluatePreConfigRulesResponseBody} extends {@link TeaModel}
 *
 * <p>EvaluatePreConfigRulesResponseBody</p>
 */
public class EvaluatePreConfigRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceEvaluations")
    private java.util.List < ResourceEvaluations> resourceEvaluations;

    private EvaluatePreConfigRulesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceEvaluations = builder.resourceEvaluations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EvaluatePreConfigRulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceEvaluations
     */
    public java.util.List < ResourceEvaluations> getResourceEvaluations() {
        return this.resourceEvaluations;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < ResourceEvaluations> resourceEvaluations; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The details of the compliance evaluation result.
         */
        public Builder resourceEvaluations(java.util.List < ResourceEvaluations> resourceEvaluations) {
            this.resourceEvaluations = resourceEvaluations;
            return this;
        }

        public EvaluatePreConfigRulesResponseBody build() {
            return new EvaluatePreConfigRulesResponseBody(this);
        } 

    } 

    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Annotation")
        private String annotation;

        @com.aliyun.core.annotation.NameInMap("ComplianceType")
        private String complianceType;

        @com.aliyun.core.annotation.NameInMap("HelpUrl")
        private String helpUrl;

        @com.aliyun.core.annotation.NameInMap("Identifier")
        private String identifier;

        private Rules(Builder builder) {
            this.annotation = builder.annotation;
            this.complianceType = builder.complianceType;
            this.helpUrl = builder.helpUrl;
            this.identifier = builder.identifier;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return annotation
         */
        public String getAnnotation() {
            return this.annotation;
        }

        /**
         * @return complianceType
         */
        public String getComplianceType() {
            return this.complianceType;
        }

        /**
         * @return helpUrl
         */
        public String getHelpUrl() {
            return this.helpUrl;
        }

        /**
         * @return identifier
         */
        public String getIdentifier() {
            return this.identifier;
        }

        public static final class Builder {
            private String annotation; 
            private String complianceType; 
            private String helpUrl; 
            private String identifier; 

            /**
             * The reason why the resource was evaluated as incompliant.
             */
            public Builder annotation(String annotation) {
                this.annotation = annotation;
                return this;
            }

            /**
             * The compliance type of the resource that was evaluated by using the evaluation rule. Valid values:
             * <p>
             * 
             * *   COMPLIANT: The resource was evaluated as compliant.
             * *   NON_COMPLIANT: The resource was evaluated as incompliant.
             * *   NOT_APPLICABLE: The evaluation rule does not apply to the resource.
             */
            public Builder complianceType(String complianceType) {
                this.complianceType = complianceType;
                return this;
            }

            /**
             * The URL of the topic that describes how the managed rule remediates the incompliant configurations.
             */
            public Builder helpUrl(String helpUrl) {
                this.helpUrl = helpUrl;
                return this;
            }

            /**
             * The identifier of the evaluation rule.
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
    public static class ResourceEvaluations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceLogicalId")
        private String resourceLogicalId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("Rules")
        private java.util.List < Rules> rules;

        private ResourceEvaluations(Builder builder) {
            this.resourceLogicalId = builder.resourceLogicalId;
            this.resourceType = builder.resourceType;
            this.rules = builder.rules;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceEvaluations create() {
            return builder().build();
        }

        /**
         * @return resourceLogicalId
         */
        public String getResourceLogicalId() {
            return this.resourceLogicalId;
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
            private String resourceType; 
            private java.util.List < Rules> rules; 

            /**
             * The logical ID of the resource.
             * <p>
             * 
             * >  If the ResourceLogicalId request parameter is left empty, the value of the ResourceLogicalId response parameter is generated based on the value of the `ResourceProperties` parameter.
             */
            public Builder resourceLogicalId(String resourceLogicalId) {
                this.resourceLogicalId = resourceLogicalId;
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

            public ResourceEvaluations build() {
                return new ResourceEvaluations(this);
            } 

        } 

    }
}
