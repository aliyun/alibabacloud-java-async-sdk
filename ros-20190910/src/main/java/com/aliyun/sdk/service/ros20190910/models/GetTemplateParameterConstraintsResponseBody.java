// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

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
 * {@link GetTemplateParameterConstraintsResponseBody} extends {@link TeaModel}
 *
 * <p>GetTemplateParameterConstraintsResponseBody</p>
 */
public class GetTemplateParameterConstraintsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ParameterConstraints")
    private java.util.List<ParameterConstraints> parameterConstraints;

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

    public Builder toBuilder() {
        return new Builder(this);
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
        private java.util.List<ParameterConstraints> parameterConstraints; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetTemplateParameterConstraintsResponseBody model) {
            this.parameterConstraints = model.parameterConstraints;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The constraints of the parameters.</p>
         */
        public Builder parameterConstraints(java.util.List<ParameterConstraints> parameterConstraints) {
            this.parameterConstraints = parameterConstraints;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>9816785B-BCF8-514D-8B76-C1EC2BC954FC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetTemplateParameterConstraintsResponseBody build() {
            return new GetTemplateParameterConstraintsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTemplateParameterConstraintsResponseBody} extends {@link TeaModel}
     *
     * <p>GetTemplateParameterConstraintsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(NotSupportResources model) {
                this.propertyName = model.propertyName;
                this.resourceType = model.resourceType;
            } 

            /**
             * <p>The name of the resource property.</p>
             * 
             * <strong>example:</strong>
             * <p>InstanceName</p>
             */
            public Builder propertyName(String propertyName) {
                this.propertyName = propertyName;
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

            public NotSupportResources build() {
                return new NotSupportResources(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTemplateParameterConstraintsResponseBody} extends {@link TeaModel}
     *
     * <p>GetTemplateParameterConstraintsResponseBody</p>
     */
    public static class OriginalConstraints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowedValues")
        private java.util.List<?> allowedValues;

        @com.aliyun.core.annotation.NameInMap("Behavior")
        private String behavior;

        @com.aliyun.core.annotation.NameInMap("BehaviorReason")
        private String behaviorReason;

        @com.aliyun.core.annotation.NameInMap("PropertyName")
        private String propertyName;

        @com.aliyun.core.annotation.NameInMap("ResourceName")
        private String resourceName;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        private OriginalConstraints(Builder builder) {
            this.allowedValues = builder.allowedValues;
            this.behavior = builder.behavior;
            this.behaviorReason = builder.behaviorReason;
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
        public java.util.List<?> getAllowedValues() {
            return this.allowedValues;
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
            private java.util.List<?> allowedValues; 
            private String behavior; 
            private String behaviorReason; 
            private String propertyName; 
            private String resourceName; 
            private String resourceType; 

            private Builder() {
            } 

            private Builder(OriginalConstraints model) {
                this.allowedValues = model.allowedValues;
                this.behavior = model.behavior;
                this.behaviorReason = model.behaviorReason;
                this.propertyName = model.propertyName;
                this.resourceName = model.resourceName;
                this.resourceType = model.resourceType;
            } 

            /**
             * <p>The values of the parameter.</p>
             */
            public Builder allowedValues(java.util.List<?> allowedValues) {
                this.allowedValues = allowedValues;
                return this;
            }

            /**
             * <p>Behavior of the parameter</p>
             * 
             * <strong>example:</strong>
             * <p>QueryError</p>
             */
            public Builder behavior(String behavior) {
                this.behavior = behavior;
                return this;
            }

            /**
             * <p>The reason for the parameter behavior</p>
             * 
             * <strong>example:</strong>
             * <p>No resource property refer to the parameter</p>
             */
            public Builder behaviorReason(String behaviorReason) {
                this.behaviorReason = behaviorReason;
                return this;
            }

            /**
             * <p>The name of the resource property.</p>
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
     * {@link GetTemplateParameterConstraintsResponseBody} extends {@link TeaModel}
     *
     * <p>GetTemplateParameterConstraintsResponseBody</p>
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
             * <p>ALIYUN::ECS::InstanceGroup</p>
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
             * <p>InstanceType is needed while query DataDisk</p>
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
     * {@link GetTemplateParameterConstraintsResponseBody} extends {@link TeaModel}
     *
     * <p>GetTemplateParameterConstraintsResponseBody</p>
     */
    public static class QueryTimeoutDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("ResourceName")
        private String resourceName;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        private QueryTimeoutDetails(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.resourceName = builder.resourceName;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryTimeoutDetails create() {
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

            private Builder(QueryTimeoutDetails model) {
                this.errorMessage = model.errorMessage;
                this.resourceName = model.resourceName;
                this.resourceType = model.resourceType;
            } 

            /**
             * <p>Error message.</p>
             * 
             * <strong>example:</strong>
             * <p>query property SlaveZoneIds.* in resource rds error, error message: query 8 seconds timeout</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>Resource name.</p>
             * 
             * <strong>example:</strong>
             * <p>rds</p>
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * <p>Resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>ALIYUN::RDS::DBInstance</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public QueryTimeoutDetails build() {
                return new QueryTimeoutDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTemplateParameterConstraintsResponseBody} extends {@link TeaModel}
     *
     * <p>GetTemplateParameterConstraintsResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("IllegalValueByParameterConstraints")
        private java.util.List<?> illegalValueByParameterConstraints;

        @com.aliyun.core.annotation.NameInMap("IllegalValueByRules")
        private java.util.List<?> illegalValueByRules;

        @com.aliyun.core.annotation.NameInMap("NotSupportResources")
        private java.util.List<NotSupportResources> notSupportResources;

        @com.aliyun.core.annotation.NameInMap("OriginalConstraints")
        private java.util.List<OriginalConstraints> originalConstraints;

        @com.aliyun.core.annotation.NameInMap("ParameterKey")
        private String parameterKey;

        @com.aliyun.core.annotation.NameInMap("QueryErrors")
        private java.util.List<QueryErrors> queryErrors;

        @com.aliyun.core.annotation.NameInMap("QueryTimeoutDetails")
        private java.util.List<QueryTimeoutDetails> queryTimeoutDetails;

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
            this.queryTimeoutDetails = builder.queryTimeoutDetails;
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
         * @return illegalValueByParameterConstraints
         */
        public java.util.List<?> getIllegalValueByParameterConstraints() {
            return this.illegalValueByParameterConstraints;
        }

        /**
         * @return illegalValueByRules
         */
        public java.util.List<?> getIllegalValueByRules() {
            return this.illegalValueByRules;
        }

        /**
         * @return notSupportResources
         */
        public java.util.List<NotSupportResources> getNotSupportResources() {
            return this.notSupportResources;
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
         * @return queryTimeoutDetails
         */
        public java.util.List<QueryTimeoutDetails> getQueryTimeoutDetails() {
            return this.queryTimeoutDetails;
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
            private java.util.List<?> illegalValueByParameterConstraints; 
            private java.util.List<?> illegalValueByRules; 
            private java.util.List<NotSupportResources> notSupportResources; 
            private java.util.List<OriginalConstraints> originalConstraints; 
            private String parameterKey; 
            private java.util.List<QueryErrors> queryErrors; 
            private java.util.List<QueryTimeoutDetails> queryTimeoutDetails; 
            private String type; 

            private Builder() {
            } 

            private Builder(ParameterConstraints model) {
                this.allowedValues = model.allowedValues;
                this.associationParameterNames = model.associationParameterNames;
                this.behavior = model.behavior;
                this.behaviorReason = model.behaviorReason;
                this.illegalValueByParameterConstraints = model.illegalValueByParameterConstraints;
                this.illegalValueByRules = model.illegalValueByRules;
                this.notSupportResources = model.notSupportResources;
                this.originalConstraints = model.originalConstraints;
                this.parameterKey = model.parameterKey;
                this.queryErrors = model.queryErrors;
                this.queryTimeoutDetails = model.queryTimeoutDetails;
                this.type = model.type;
            } 

            /**
             * <p>The values of the parameter.</p>
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
             * <p>If AllowedValues is not returned, Behavior and BehaviorReason are returned.</p>
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
             * <p>The values that do not conform to the parameter constraints.</p>
             * <blockquote>
             * <p>If AllowedValues is returned, IllegalValueByParameterConstraints and IllegalValueByRules are returned at the same time.</p>
             * </blockquote>
             */
            public Builder illegalValueByParameterConstraints(java.util.List<?> illegalValueByParameterConstraints) {
                this.illegalValueByParameterConstraints = illegalValueByParameterConstraints;
                return this;
            }

            /**
             * <p>The values that do not match the rules in the template.</p>
             * <blockquote>
             * <p>If AllowedValues is returned, IllegalValueByParameterConstraints and IllegalValueByRules are returned at the same time.</p>
             * </blockquote>
             */
            public Builder illegalValueByRules(java.util.List<?> illegalValueByRules) {
                this.illegalValueByRules = illegalValueByRules;
                return this;
            }

            /**
             * <p>The unsupported resource in the template.</p>
             */
            public Builder notSupportResources(java.util.List<NotSupportResources> notSupportResources) {
                this.notSupportResources = notSupportResources;
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
             * <p>The error that is returned when the request fails.</p>
             */
            public Builder queryErrors(java.util.List<QueryErrors> queryErrors) {
                this.queryErrors = queryErrors;
                return this;
            }

            /**
             * <p>Query the details of timeout.</p>
             */
            public Builder queryTimeoutDetails(java.util.List<QueryTimeoutDetails> queryTimeoutDetails) {
                this.queryTimeoutDetails = queryTimeoutDetails;
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
