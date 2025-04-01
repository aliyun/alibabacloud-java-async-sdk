// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

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
         * <p>The constraint families.</p>
         */
        public Builder familyConstraints(java.util.List<String> familyConstraints) {
            this.familyConstraints = familyConstraints;
            return this;
        }

        /**
         * <p>The parameters in the template.</p>
         */
        public Builder parameterConstraints(java.util.List<ParameterConstraints> parameterConstraints) {
            this.parameterConstraints = parameterConstraints;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C81C0732-DEBC-559C-B563-7EB2BEB21088</p>
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
             * <p>lnch_Source</p>
             */
            public Builder propertyName(String propertyName) {
                this.propertyName = propertyName;
                return this;
            }

            /**
             * <p>The resource name.</p>
             * 
             * <strong>example:</strong>
             * <p>i-8vb0smn1lf6g77md****</p>
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>serviceinstance</p>
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

        @com.aliyun.core.annotation.NameInMap("Type")
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
             * <li>NoLimit: The value of this parameter is not limited.</li>
             * <li>NotSupport: The value of this parameter cannot be queried.</li>
             * <li>QueryError: The query failed.</li>
             * </ul>
             * <blockquote>
             * <p> If AllowedValues is not returned, Behavior and BehaviorReason are returned.</p>
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
             * <p>none</p>
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
             * <p>PayType</p>
             */
            public Builder parameterKey(String parameterKey) {
                this.parameterKey = parameterKey;
                return this;
            }

            /**
             * <p>The type of the parameter.</p>
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
