// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTemplateParameterConstraintsResponseBody} extends {@link TeaModel}
 *
 * <p>GetTemplateParameterConstraintsResponseBody</p>
 */
public class GetTemplateParameterConstraintsResponseBody extends TeaModel {
    @NameInMap("ParameterConstraints")
    private java.util.List < ParameterConstraints> parameterConstraints;

    @NameInMap("RequestId")
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
        @NameInMap("PropertyName")
        private String propertyName;

        @NameInMap("ResourceType")
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
             * PropertyName.
             */
            public Builder propertyName(String propertyName) {
                this.propertyName = propertyName;
                return this;
            }

            /**
             * ResourceType.
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
    public static class QueryErrors extends TeaModel {
        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("ResourceName")
        private String resourceName;

        @NameInMap("ResourceType")
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
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * ResourceName.
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * ResourceType.
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
        @NameInMap("AllowedValues")
        private java.util.List < String > allowedValues;

        @NameInMap("AssociationParameterNames")
        private java.util.List < String > associationParameterNames;

        @NameInMap("Behavior")
        private String behavior;

        @NameInMap("BehaviorReason")
        private String behaviorReason;

        @NameInMap("IllegalValueByParameterConstraints")
        private java.util.List < ? > illegalValueByParameterConstraints;

        @NameInMap("IllegalValueByRules")
        private java.util.List < ? > illegalValueByRules;

        @NameInMap("NotSupportResources")
        private java.util.List < NotSupportResources> notSupportResources;

        @NameInMap("ParameterKey")
        private String parameterKey;

        @NameInMap("QueryErrors")
        private java.util.List < QueryErrors> queryErrors;

        @NameInMap("Type")
        private String type;

        private ParameterConstraints(Builder builder) {
            this.allowedValues = builder.allowedValues;
            this.associationParameterNames = builder.associationParameterNames;
            this.behavior = builder.behavior;
            this.behaviorReason = builder.behaviorReason;
            this.illegalValueByParameterConstraints = builder.illegalValueByParameterConstraints;
            this.illegalValueByRules = builder.illegalValueByRules;
            this.notSupportResources = builder.notSupportResources;
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
             * >  If the AllowedValues parameter is not returned, the Behavior and BehaviorReason parameters are returned.
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
             * >  If the `AllowedValues` parameter is returned, the `IllegalValueByParameterConstraints` and `IllegalValueByRules` parameters are returned at the same time.
             */
            public Builder illegalValueByParameterConstraints(java.util.List < ? > illegalValueByParameterConstraints) {
                this.illegalValueByParameterConstraints = illegalValueByParameterConstraints;
                return this;
            }

            /**
             * The values that do not match the rules in the template.
             * <p>
             * 
             * >  If the `AllowedValues` parameter is returned, the `IllegalValueByParameterConstraints` and `IllegalValueByRules` parameters are returned at the same time.
             */
            public Builder illegalValueByRules(java.util.List < ? > illegalValueByRules) {
                this.illegalValueByRules = illegalValueByRules;
                return this;
            }

            /**
             * NotSupportResources.
             */
            public Builder notSupportResources(java.util.List < NotSupportResources> notSupportResources) {
                this.notSupportResources = notSupportResources;
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
             * QueryErrors.
             */
            public Builder queryErrors(java.util.List < QueryErrors> queryErrors) {
                this.queryErrors = queryErrors;
                return this;
            }

            /**
             * The type of the parameter.
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
