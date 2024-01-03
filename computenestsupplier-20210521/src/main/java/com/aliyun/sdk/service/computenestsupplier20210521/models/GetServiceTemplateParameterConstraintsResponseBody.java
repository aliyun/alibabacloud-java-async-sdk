// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetServiceTemplateParameterConstraintsResponseBody} extends {@link TeaModel}
 *
 * <p>GetServiceTemplateParameterConstraintsResponseBody</p>
 */
public class GetServiceTemplateParameterConstraintsResponseBody extends TeaModel {
    @NameInMap("FamilyConstraints")
    private java.util.List < String > familyConstraints;

    @NameInMap("ParameterConstraints")
    private java.util.List < ParameterConstraints> parameterConstraints;

    @NameInMap("RequestId")
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
         * FamilyConstraints.
         */
        public Builder familyConstraints(java.util.List < String > familyConstraints) {
            this.familyConstraints = familyConstraints;
            return this;
        }

        /**
         * ParameterConstraints.
         */
        public Builder parameterConstraints(java.util.List < ParameterConstraints> parameterConstraints) {
            this.parameterConstraints = parameterConstraints;
            return this;
        }

        /**
         * RequestId.
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
        @NameInMap("AllowedValues")
        private java.util.List < String > allowedValues;

        @NameInMap("PropertyName")
        private String propertyName;

        @NameInMap("ResourceName")
        private String resourceName;

        @NameInMap("ResourceType")
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
             * AllowedValues.
             */
            public Builder allowedValues(java.util.List < String > allowedValues) {
                this.allowedValues = allowedValues;
                return this;
            }

            /**
             * PropertyName.
             */
            public Builder propertyName(String propertyName) {
                this.propertyName = propertyName;
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

            public OriginalConstraints build() {
                return new OriginalConstraints(this);
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

        @NameInMap("OriginalConstraints")
        private java.util.List < OriginalConstraints> originalConstraints;

        @NameInMap("ParameterKey")
        private String parameterKey;

        @NameInMap("Type")
        private String type;

        private ParameterConstraints(Builder builder) {
            this.allowedValues = builder.allowedValues;
            this.associationParameterNames = builder.associationParameterNames;
            this.behavior = builder.behavior;
            this.behaviorReason = builder.behaviorReason;
            this.originalConstraints = builder.originalConstraints;
            this.parameterKey = builder.parameterKey;
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
            private String type; 

            /**
             * AllowedValues.
             */
            public Builder allowedValues(java.util.List < String > allowedValues) {
                this.allowedValues = allowedValues;
                return this;
            }

            /**
             * AssociationParameterNames.
             */
            public Builder associationParameterNames(java.util.List < String > associationParameterNames) {
                this.associationParameterNames = associationParameterNames;
                return this;
            }

            /**
             * Behavior.
             */
            public Builder behavior(String behavior) {
                this.behavior = behavior;
                return this;
            }

            /**
             * BehaviorReason.
             */
            public Builder behaviorReason(String behaviorReason) {
                this.behaviorReason = behaviorReason;
                return this;
            }

            /**
             * OriginalConstraints.
             */
            public Builder originalConstraints(java.util.List < OriginalConstraints> originalConstraints) {
                this.originalConstraints = originalConstraints;
                return this;
            }

            /**
             * ParameterKey.
             */
            public Builder parameterKey(String parameterKey) {
                this.parameterKey = parameterKey;
                return this;
            }

            /**
             * Type.
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
