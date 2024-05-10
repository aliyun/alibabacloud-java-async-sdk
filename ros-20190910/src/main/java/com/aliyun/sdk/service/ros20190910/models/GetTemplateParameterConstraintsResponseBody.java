// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTemplateParameterConstraintsResponseBody} extends {@link TeaModel}
 *
 * <p>GetTemplateParameterConstraintsResponseBody</p>
 */
public class GetTemplateParameterConstraintsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ParameterConstraints")
    private java.util.List < ParameterConstraints> parameterConstraints;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetTemplateParameterConstraintsResponseBody(Builder builder) {
        this.parameterConstraints = builder.parameterConstraints;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTemplateParameterConstraintsResponseBody create() {
        return builder().build();
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
        private java.util.List < ParameterConstraints> parameterConstraints; 
        private String requestId; 

        /**
         * The constraints of the parameters.
         */
        public Builder parameterConstraints(java.util.List < ParameterConstraints> parameterConstraints) {
            this.parameterConstraints = parameterConstraints;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetTemplateParameterConstraintsResponseBody build() {
            return new GetTemplateParameterConstraintsResponseBody(this);
        } 

    } 

    public static class NotSupportResources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PropertyName")
        private String propertyName;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        private NotSupportResources(Builder builder) {
            this.propertyName = builder.propertyName;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NotSupportResources create() {
            return builder().build();
        }

        /**
         * @return propertyName
         */
        public String getPropertyName() {
            return this.propertyName;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private String propertyName; 
            private String resourceType; 

            /**
             * The name of the resource property.
             */
            public Builder propertyName(String propertyName) {
                this.propertyName = propertyName;
                return this;
            }

            /**
             * The resource type.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public NotSupportResources build() {
                return new NotSupportResources(this);
            } 

        } 

    }
    public static class OriginalConstraints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowedValues")
        private java.util.List < ? > allowedValues;

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
        public java.util.List < ? > getAllowedValues() {
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
            private java.util.List < ? > allowedValues; 
            private String propertyName; 
            private String resourceName; 
            private String resourceType; 

            /**
             * The values of the parameter.
             */
            public Builder allowedValues(java.util.List < ? > allowedValues) {
                this.allowedValues = allowedValues;
                return this;
            }

            /**
             * The name of the resource property.
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

        @com.aliyun.core.annotation.NameInMap("IllegalValueByParameterConstraints")
        private java.util.List < ? > illegalValueByParameterConstraints;

        @com.aliyun.core.annotation.NameInMap("IllegalValueByRules")
        private java.util.List < ? > illegalValueByRules;

        @com.aliyun.core.annotation.NameInMap("NotSupportResources")
        private java.util.List < NotSupportResources> notSupportResources;

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
            this.illegalValueByParameterConstraints = builder.illegalValueByParameterConstraints;
            this.illegalValueByRules = builder.illegalValueByRules;
            this.notSupportResources = builder.notSupportResources;
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
         * @return illegalValueByParameterConstraints
         */
        public java.util.List < ? > getIllegalValueByParameterConstraints() {
            return this.illegalValueByParameterConstraints;
        }

        /**
         * @return illegalValueByRules
         */
        public java.util.List < ? > getIllegalValueByRules() {
            return this.illegalValueByRules;
        }

        /**
         * @return notSupportResources
         */
        public java.util.List < NotSupportResources> getNotSupportResources() {
            return this.notSupportResources;
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
            private java.util.List < ? > illegalValueByParameterConstraints; 
            private java.util.List < ? > illegalValueByRules; 
            private java.util.List < NotSupportResources> notSupportResources; 
            private java.util.List < OriginalConstraints> originalConstraints; 
            private String parameterKey; 
            private java.util.List < QueryErrors> queryErrors; 
            private String type; 

            /**
             * The values of the parameter.
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
             * > If AllowedValues is not returned, Behavior and BehaviorReason are returned.
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
             * The values that do not conform to the parameter constraints.
             * <p>
             * 
             * > If AllowedValues is returned, IllegalValueByParameterConstraints and IllegalValueByRules are returned at the same time.
             */
            public Builder illegalValueByParameterConstraints(java.util.List < ? > illegalValueByParameterConstraints) {
                this.illegalValueByParameterConstraints = illegalValueByParameterConstraints;
                return this;
            }

            /**
             * The values that do not match the rules in the template.
             * <p>
             * 
             * > If AllowedValues is returned, IllegalValueByParameterConstraints and IllegalValueByRules are returned at the same time.
             */
            public Builder illegalValueByRules(java.util.List < ? > illegalValueByRules) {
                this.illegalValueByRules = illegalValueByRules;
                return this;
            }

            /**
             * The unsupported resource in the template.
             */
            public Builder notSupportResources(java.util.List < NotSupportResources> notSupportResources) {
                this.notSupportResources = notSupportResources;
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
             * The error that is returned when the request fails.
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
