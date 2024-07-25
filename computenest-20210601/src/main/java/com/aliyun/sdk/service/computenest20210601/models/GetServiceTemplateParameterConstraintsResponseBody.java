// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetServiceTemplateParameterConstraintsResponseBody} extends {@link TeaModel}
 *
 * <p>GetServiceTemplateParameterConstraintsResponseBody</p>
 */
public class GetServiceTemplateParameterConstraintsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FamilyConstraints")
    private java.util.List < String > familyConstraints;

    @com.aliyun.core.annotation.NameInMap("ParameterConstraints")
    private java.util.List < ParameterConstraints> parameterConstraints;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetServiceTemplateParameterConstraintsResponseBody(Builder builder) {
        this.familyConstraints = builder.familyConstraints;
        this.parameterConstraints = builder.parameterConstraints;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceTemplateParameterConstraintsResponseBody create() {
        return builder().build();
    }

    /**
     * @return familyConstraints
     */
    public java.util.List < String > getFamilyConstraints() {
        return this.familyConstraints;
    }

    /**
     * @return parameterConstraints
     */
    public java.util.List < ParameterConstraints> getParameterConstraints() {
        return this.parameterConstraints;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > familyConstraints; 
        private java.util.List < ParameterConstraints> parameterConstraints; 
        private String requestId; 

        /**
         * The package family constraints.
         */
        public Builder familyConstraints(java.util.List < String > familyConstraints) {
            this.familyConstraints = familyConstraints;
            return this;
        }

        /**
         * The constraints on the parameters.
         */
        public Builder parameterConstraints(java.util.List < ParameterConstraints> parameterConstraints) {
            this.parameterConstraints = parameterConstraints;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetServiceTemplateParameterConstraintsResponseBody build() {
            return new GetServiceTemplateParameterConstraintsResponseBody(this);
        } 

    } 

    public static class OriginalConstraints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowedValues")
        private java.util.List < String > allowedValues;

        @com.aliyun.core.annotation.NameInMap("PropertyName")
        private String propertyName;

        @com.aliyun.core.annotation.NameInMap("ResourceName")
        private String resourceName;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        private OriginalConstraints(Builder builder) {
            this.allowedValues = builder.allowedValues;
            this.propertyName = builder.propertyName;
            this.resourceName = builder.resourceName;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OriginalConstraints create() {
            return builder().build();
        }

        /**
         * @return allowedValues
         */
        public java.util.List < String > getAllowedValues() {
            return this.allowedValues;
        }

        /**
         * @return propertyName
         */
        public String getPropertyName() {
            return this.propertyName;
        }

        /**
         * @return resourceName
         */
        public String getResourceName() {
            return this.resourceName;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private java.util.List < String > allowedValues; 
            private String propertyName; 
            private String resourceName; 
            private String resourceType; 

            /**
             * The valid values of the parameter.
             */
            public Builder allowedValues(java.util.List < String > allowedValues) {
                this.allowedValues = allowedValues;
                return this;
            }

            /**
             * The property name.
             */
            public Builder propertyName(String propertyName) {
                this.propertyName = propertyName;
                return this;
            }

            /**
             * The name of the resource that is defined in the template.
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * The resource type.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public OriginalConstraints build() {
                return new OriginalConstraints(this);
            } 

        } 

    }
    public static class QueryErrors extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("ResourceName")
        private String resourceName;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        private QueryErrors(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.resourceName = builder.resourceName;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryErrors create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return resourceName
         */
        public String getResourceName() {
            return this.resourceName;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private String errorMessage; 
            private String resourceName; 
            private String resourceType; 

            /**
             * The error message.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The resource name.
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * The resource type.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public QueryErrors build() {
                return new QueryErrors(this);
            } 

        } 

    }
    public static class ParameterConstraints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowedValues")
        private java.util.List < String > allowedValues;

        @com.aliyun.core.annotation.NameInMap("AssociationParameterNames")
        private java.util.List < String > associationParameterNames;

        @com.aliyun.core.annotation.NameInMap("Behavior")
        private String behavior;

        @com.aliyun.core.annotation.NameInMap("BehaviorReason")
        private String behaviorReason;

        @com.aliyun.core.annotation.NameInMap("OriginalConstraints")
        private java.util.List < OriginalConstraints> originalConstraints;

        @com.aliyun.core.annotation.NameInMap("ParameterKey")
        private String parameterKey;

        @com.aliyun.core.annotation.NameInMap("QueryErrors")
        private java.util.List < QueryErrors> queryErrors;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private ParameterConstraints(Builder builder) {
            this.allowedValues = builder.allowedValues;
            this.associationParameterNames = builder.associationParameterNames;
            this.behavior = builder.behavior;
            this.behaviorReason = builder.behaviorReason;
            this.originalConstraints = builder.originalConstraints;
            this.parameterKey = builder.parameterKey;
            this.queryErrors = builder.queryErrors;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParameterConstraints create() {
            return builder().build();
        }

        /**
         * @return allowedValues
         */
        public java.util.List < String > getAllowedValues() {
            return this.allowedValues;
        }

        /**
         * @return associationParameterNames
         */
        public java.util.List < String > getAssociationParameterNames() {
            return this.associationParameterNames;
        }

        /**
         * @return behavior
         */
        public String getBehavior() {
            return this.behavior;
        }

        /**
         * @return behaviorReason
         */
        public String getBehaviorReason() {
            return this.behaviorReason;
        }

        /**
         * @return originalConstraints
         */
        public java.util.List < OriginalConstraints> getOriginalConstraints() {
            return this.originalConstraints;
        }

        /**
         * @return parameterKey
         */
        public String getParameterKey() {
            return this.parameterKey;
        }

        /**
         * @return queryErrors
         */
        public java.util.List < QueryErrors> getQueryErrors() {
            return this.queryErrors;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List < String > allowedValues; 
            private java.util.List < String > associationParameterNames; 
            private String behavior; 
            private String behaviorReason; 
            private java.util.List < OriginalConstraints> originalConstraints; 
            private String parameterKey; 
            private java.util.List < QueryErrors> queryErrors; 
            private String type; 

            /**
             * The valid values of the parameter.
             */
            public Builder allowedValues(java.util.List < String > allowedValues) {
                this.allowedValues = allowedValues;
                return this;
            }

            /**
             * The names of the associated parameters.
             */
            public Builder associationParameterNames(java.util.List < String > associationParameterNames) {
                this.associationParameterNames = associationParameterNames;
                return this;
            }

            /**
             * The behavior of the parameter. Valid values:
             * <p>
             * 
             * *   NoLimit: No limit is imposed on the value of this parameter.
             * *   NotSupport: The value of this parameter cannot be queried.
             * *   QueryError: This parameter failed to be queried.
             * 
             * >  If AllowedValues is not returned, Behavior and BehaviorReason are returned, which indicate the behavior of the parameter and the reason for the behavior.
             */
            public Builder behavior(String behavior) {
                this.behavior = behavior;
                return this;
            }

            /**
             * The reason why the behavior of the parameter is returned.
             */
            public Builder behaviorReason(String behaviorReason) {
                this.behaviorReason = behaviorReason;
                return this;
            }

            /**
             * The original constraint information.
             */
            public Builder originalConstraints(java.util.List < OriginalConstraints> originalConstraints) {
                this.originalConstraints = originalConstraints;
                return this;
            }

            /**
             * The name of the parameter.
             */
            public Builder parameterKey(String parameterKey) {
                this.parameterKey = parameterKey;
                return this;
            }

            /**
             * The error details that are returned if the request fails.
             */
            public Builder queryErrors(java.util.List < QueryErrors> queryErrors) {
                this.queryErrors = queryErrors;
                return this;
            }

            /**
             * The data type of the parameter.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ParameterConstraints build() {
                return new ParameterConstraints(this);
            } 

        } 

    }
}
