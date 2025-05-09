// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

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
 * {@link GetServiceTemplateParameterConstraintsResponseBody} extends {@link TeaModel}
 *
 * <p>GetServiceTemplateParameterConstraintsResponseBody</p>
 */
public class GetServiceTemplateParameterConstraintsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FamilyConstraints")
    private java.util.List<String> familyConstraints;

    @com.aliyun.core.annotation.NameInMap("ParameterConstraints")
    private java.util.List<ParameterConstraints> parameterConstraints;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return familyConstraints
     */
    public java.util.List<String> getFamilyConstraints() {
        return this.familyConstraints;
    }

    /**
     * @return parameterConstraints
     */
    public java.util.List<ParameterConstraints> getParameterConstraints() {
        return this.parameterConstraints;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> familyConstraints; 
        private java.util.List<ParameterConstraints> parameterConstraints; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetServiceTemplateParameterConstraintsResponseBody model) {
            this.familyConstraints = model.familyConstraints;
            this.parameterConstraints = model.parameterConstraints;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The package family constraints.</p>
         */
        public Builder familyConstraints(java.util.List<String> familyConstraints) {
            this.familyConstraints = familyConstraints;
            return this;
        }

        /**
         * <p>The constraints on the parameters.</p>
         */
        public Builder parameterConstraints(java.util.List<ParameterConstraints> parameterConstraints) {
            this.parameterConstraints = parameterConstraints;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>449DC03D-A039-56A6-8D6F-6EBCCCE0EE2C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetServiceTemplateParameterConstraintsResponseBody build() {
            return new GetServiceTemplateParameterConstraintsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetServiceTemplateParameterConstraintsResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceTemplateParameterConstraintsResponseBody</p>
     */
    public static class OriginalConstraints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowedValues")
        private java.util.List<String> allowedValues;

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
        public java.util.List<String> getAllowedValues() {
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
            private java.util.List<String> allowedValues; 
            private String propertyName; 
            private String resourceName; 
            private String resourceType; 

            private Builder() {
            } 

            private Builder(OriginalConstraints model) {
                this.allowedValues = model.allowedValues;
                this.propertyName = model.propertyName;
                this.resourceName = model.resourceName;
                this.resourceType = model.resourceType;
            } 

            /**
             * <p>The valid values of the parameter.</p>
             */
            public Builder allowedValues(java.util.List<String> allowedValues) {
                this.allowedValues = allowedValues;
                return this;
            }

            /**
             * <p>The property name.</p>
             * 
             * <strong>example:</strong>
             * <p>ZoneId</p>
             */
            public Builder propertyName(String propertyName) {
                this.propertyName = propertyName;
                return this;
            }

            /**
             * <p>The name of the resource that is defined in the template.</p>
             * 
             * <strong>example:</strong>
             * <p>MyECS</p>
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>ALIYUN::ECS::InstanceGroup</p>
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
    /**
     * 
     * {@link GetServiceTemplateParameterConstraintsResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceTemplateParameterConstraintsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(QueryErrors model) {
                this.errorMessage = model.errorMessage;
                this.resourceName = model.resourceName;
                this.resourceType = model.resourceType;
            } 

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>record not exist</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The resource name.</p>
             * 
             * <strong>example:</strong>
             * <p>MyECS</p>
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>ALIYUN::ECS::InstanceGroup</p>
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
    /**
     * 
     * {@link GetServiceTemplateParameterConstraintsResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceTemplateParameterConstraintsResponseBody</p>
     */
    public static class ParameterConstraints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowedValues")
        private java.util.List<String> allowedValues;

        @com.aliyun.core.annotation.NameInMap("AssociationParameterNames")
        private java.util.List<String> associationParameterNames;

        @com.aliyun.core.annotation.NameInMap("Behavior")
        private String behavior;

        @com.aliyun.core.annotation.NameInMap("BehaviorReason")
        private String behaviorReason;

        @com.aliyun.core.annotation.NameInMap("OriginalConstraints")
        private java.util.List<OriginalConstraints> originalConstraints;

        @com.aliyun.core.annotation.NameInMap("ParameterKey")
        private String parameterKey;

        @com.aliyun.core.annotation.NameInMap("QueryErrors")
        private java.util.List<QueryErrors> queryErrors;

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
        public java.util.List<String> getAllowedValues() {
            return this.allowedValues;
        }

        /**
         * @return associationParameterNames
         */
        public java.util.List<String> getAssociationParameterNames() {
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
        public java.util.List<OriginalConstraints> getOriginalConstraints() {
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
        public java.util.List<QueryErrors> getQueryErrors() {
            return this.queryErrors;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List<String> allowedValues; 
            private java.util.List<String> associationParameterNames; 
            private String behavior; 
            private String behaviorReason; 
            private java.util.List<OriginalConstraints> originalConstraints; 
            private String parameterKey; 
            private java.util.List<QueryErrors> queryErrors; 
            private String type; 

            private Builder() {
            } 

            private Builder(ParameterConstraints model) {
                this.allowedValues = model.allowedValues;
                this.associationParameterNames = model.associationParameterNames;
                this.behavior = model.behavior;
                this.behaviorReason = model.behaviorReason;
                this.originalConstraints = model.originalConstraints;
                this.parameterKey = model.parameterKey;
                this.queryErrors = model.queryErrors;
                this.type = model.type;
            } 

            /**
             * <p>The valid values of the parameter.</p>
             */
            public Builder allowedValues(java.util.List<String> allowedValues) {
                this.allowedValues = allowedValues;
                return this;
            }

            /**
             * <p>The names of the associated parameters.</p>
             */
            public Builder associationParameterNames(java.util.List<String> associationParameterNames) {
                this.associationParameterNames = associationParameterNames;
                return this;
            }

            /**
             * <p>The behavior of the parameter. Valid values:</p>
             * <ul>
             * <li>NoLimit: No limit is imposed on the value of this parameter.</li>
             * <li>NotSupport: The value of this parameter cannot be queried.</li>
             * <li>QueryError: This parameter failed to be queried.</li>
             * </ul>
             * <blockquote>
             * <p> If AllowedValues is not returned, Behavior and BehaviorReason are returned, which indicate the behavior of the parameter and the reason for the behavior.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>NoLimit</p>
             */
            public Builder behavior(String behavior) {
                this.behavior = behavior;
                return this;
            }

            /**
             * <p>The reason why the behavior of the parameter is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>No resource property refer to the parameter</p>
             */
            public Builder behaviorReason(String behaviorReason) {
                this.behaviorReason = behaviorReason;
                return this;
            }

            /**
             * <p>The original constraint information.</p>
             */
            public Builder originalConstraints(java.util.List<OriginalConstraints> originalConstraints) {
                this.originalConstraints = originalConstraints;
                return this;
            }

            /**
             * <p>The name of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>ZoneInfo</p>
             */
            public Builder parameterKey(String parameterKey) {
                this.parameterKey = parameterKey;
                return this;
            }

            /**
             * <p>The error details that are returned if the request fails.</p>
             */
            public Builder queryErrors(java.util.List<QueryErrors> queryErrors) {
                this.queryErrors = queryErrors;
                return this;
            }

            /**
             * <p>The data type of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>String</p>
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
