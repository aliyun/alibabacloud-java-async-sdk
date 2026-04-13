// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link GetTerraformStateDetectionResponseBody} extends {@link TeaModel}
 *
 * <p>GetTerraformStateDetectionResponseBody</p>
 */
public class GetTerraformStateDetectionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("job")
    private Job job;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetTerraformStateDetectionResponseBody(Builder builder) {
        this.job = builder.job;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTerraformStateDetectionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return job
     */
    public Job getJob() {
        return this.job;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Job job; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetTerraformStateDetectionResponseBody model) {
            this.job = model.job;
            this.requestId = model.requestId;
        } 

        /**
         * job.
         */
        public Builder job(Job job) {
            this.job = job;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>B6ED9F71-7FA8-598E-B64D-4606FB3FCCC9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetTerraformStateDetectionResponseBody build() {
            return new GetTerraformStateDetectionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTerraformStateDetectionResponseBody} extends {@link TeaModel}
     *
     * <p>GetTerraformStateDetectionResponseBody</p>
     */
    public static class AttributeChanges extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("attributePath")
        private String attributePath;

        @com.aliyun.core.annotation.NameInMap("remoteValue")
        private String remoteValue;

        @com.aliyun.core.annotation.NameInMap("templateValue")
        private String templateValue;

        private AttributeChanges(Builder builder) {
            this.attributePath = builder.attributePath;
            this.remoteValue = builder.remoteValue;
            this.templateValue = builder.templateValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AttributeChanges create() {
            return builder().build();
        }

        /**
         * @return attributePath
         */
        public String getAttributePath() {
            return this.attributePath;
        }

        /**
         * @return remoteValue
         */
        public String getRemoteValue() {
            return this.remoteValue;
        }

        /**
         * @return templateValue
         */
        public String getTemplateValue() {
            return this.templateValue;
        }

        public static final class Builder {
            private String attributePath; 
            private String remoteValue; 
            private String templateValue; 

            private Builder() {
            } 

            private Builder(AttributeChanges model) {
                this.attributePath = model.attributePath;
                this.remoteValue = model.remoteValue;
                this.templateValue = model.templateValue;
            } 

            /**
             * attributePath.
             */
            public Builder attributePath(String attributePath) {
                this.attributePath = attributePath;
                return this;
            }

            /**
             * remoteValue.
             */
            public Builder remoteValue(String remoteValue) {
                this.remoteValue = remoteValue;
                return this;
            }

            /**
             * templateValue.
             */
            public Builder templateValue(String templateValue) {
                this.templateValue = templateValue;
                return this;
            }

            public AttributeChanges build() {
                return new AttributeChanges(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTerraformStateDetectionResponseBody} extends {@link TeaModel}
     *
     * <p>GetTerraformStateDetectionResponseBody</p>
     */
    public static class ChangedResources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("attributeChanges")
        private java.util.List<AttributeChanges> attributeChanges;

        @com.aliyun.core.annotation.NameInMap("changedType")
        private String changedType;

        @com.aliyun.core.annotation.NameInMap("hasDrift")
        private Boolean hasDrift;

        @com.aliyun.core.annotation.NameInMap("resourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("resourceIdentifier")
        private String resourceIdentifier;

        private ChangedResources(Builder builder) {
            this.attributeChanges = builder.attributeChanges;
            this.changedType = builder.changedType;
            this.hasDrift = builder.hasDrift;
            this.resourceId = builder.resourceId;
            this.resourceIdentifier = builder.resourceIdentifier;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChangedResources create() {
            return builder().build();
        }

        /**
         * @return attributeChanges
         */
        public java.util.List<AttributeChanges> getAttributeChanges() {
            return this.attributeChanges;
        }

        /**
         * @return changedType
         */
        public String getChangedType() {
            return this.changedType;
        }

        /**
         * @return hasDrift
         */
        public Boolean getHasDrift() {
            return this.hasDrift;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceIdentifier
         */
        public String getResourceIdentifier() {
            return this.resourceIdentifier;
        }

        public static final class Builder {
            private java.util.List<AttributeChanges> attributeChanges; 
            private String changedType; 
            private Boolean hasDrift; 
            private String resourceId; 
            private String resourceIdentifier; 

            private Builder() {
            } 

            private Builder(ChangedResources model) {
                this.attributeChanges = model.attributeChanges;
                this.changedType = model.changedType;
                this.hasDrift = model.hasDrift;
                this.resourceId = model.resourceId;
                this.resourceIdentifier = model.resourceIdentifier;
            } 

            /**
             * attributeChanges.
             */
            public Builder attributeChanges(java.util.List<AttributeChanges> attributeChanges) {
                this.attributeChanges = attributeChanges;
                return this;
            }

            /**
             * changedType.
             */
            public Builder changedType(String changedType) {
                this.changedType = changedType;
                return this;
            }

            /**
             * hasDrift.
             */
            public Builder hasDrift(Boolean hasDrift) {
                this.hasDrift = hasDrift;
                return this;
            }

            /**
             * resourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * resourceIdentifier.
             */
            public Builder resourceIdentifier(String resourceIdentifier) {
                this.resourceIdentifier = resourceIdentifier;
                return this;
            }

            public ChangedResources build() {
                return new ChangedResources(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTerraformStateDetectionResponseBody} extends {@link TeaModel}
     *
     * <p>GetTerraformStateDetectionResponseBody</p>
     */
    public static class AttributeDrifts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("attributePath")
        private String attributePath;

        @com.aliyun.core.annotation.NameInMap("remoteValue")
        private String remoteValue;

        @com.aliyun.core.annotation.NameInMap("stateValue")
        private String stateValue;

        private AttributeDrifts(Builder builder) {
            this.attributePath = builder.attributePath;
            this.remoteValue = builder.remoteValue;
            this.stateValue = builder.stateValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AttributeDrifts create() {
            return builder().build();
        }

        /**
         * @return attributePath
         */
        public String getAttributePath() {
            return this.attributePath;
        }

        /**
         * @return remoteValue
         */
        public String getRemoteValue() {
            return this.remoteValue;
        }

        /**
         * @return stateValue
         */
        public String getStateValue() {
            return this.stateValue;
        }

        public static final class Builder {
            private String attributePath; 
            private String remoteValue; 
            private String stateValue; 

            private Builder() {
            } 

            private Builder(AttributeDrifts model) {
                this.attributePath = model.attributePath;
                this.remoteValue = model.remoteValue;
                this.stateValue = model.stateValue;
            } 

            /**
             * attributePath.
             */
            public Builder attributePath(String attributePath) {
                this.attributePath = attributePath;
                return this;
            }

            /**
             * remoteValue.
             */
            public Builder remoteValue(String remoteValue) {
                this.remoteValue = remoteValue;
                return this;
            }

            /**
             * stateValue.
             */
            public Builder stateValue(String stateValue) {
                this.stateValue = stateValue;
                return this;
            }

            public AttributeDrifts build() {
                return new AttributeDrifts(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTerraformStateDetectionResponseBody} extends {@link TeaModel}
     *
     * <p>GetTerraformStateDetectionResponseBody</p>
     */
    public static class DriftedResources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("attributeDrifts")
        private java.util.List<AttributeDrifts> attributeDrifts;

        @com.aliyun.core.annotation.NameInMap("driftedType")
        private String driftedType;

        @com.aliyun.core.annotation.NameInMap("resourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("resourceIdentifier")
        private String resourceIdentifier;

        private DriftedResources(Builder builder) {
            this.attributeDrifts = builder.attributeDrifts;
            this.driftedType = builder.driftedType;
            this.resourceId = builder.resourceId;
            this.resourceIdentifier = builder.resourceIdentifier;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DriftedResources create() {
            return builder().build();
        }

        /**
         * @return attributeDrifts
         */
        public java.util.List<AttributeDrifts> getAttributeDrifts() {
            return this.attributeDrifts;
        }

        /**
         * @return driftedType
         */
        public String getDriftedType() {
            return this.driftedType;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceIdentifier
         */
        public String getResourceIdentifier() {
            return this.resourceIdentifier;
        }

        public static final class Builder {
            private java.util.List<AttributeDrifts> attributeDrifts; 
            private String driftedType; 
            private String resourceId; 
            private String resourceIdentifier; 

            private Builder() {
            } 

            private Builder(DriftedResources model) {
                this.attributeDrifts = model.attributeDrifts;
                this.driftedType = model.driftedType;
                this.resourceId = model.resourceId;
                this.resourceIdentifier = model.resourceIdentifier;
            } 

            /**
             * attributeDrifts.
             */
            public Builder attributeDrifts(java.util.List<AttributeDrifts> attributeDrifts) {
                this.attributeDrifts = attributeDrifts;
                return this;
            }

            /**
             * driftedType.
             */
            public Builder driftedType(String driftedType) {
                this.driftedType = driftedType;
                return this;
            }

            /**
             * resourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * resourceIdentifier.
             */
            public Builder resourceIdentifier(String resourceIdentifier) {
                this.resourceIdentifier = resourceIdentifier;
                return this;
            }

            public DriftedResources build() {
                return new DriftedResources(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTerraformStateDetectionResponseBody} extends {@link TeaModel}
     *
     * <p>GetTerraformStateDetectionResponseBody</p>
     */
    public static class Job extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("changedResources")
        private java.util.List<ChangedResources> changedResources;

        @com.aliyun.core.annotation.NameInMap("driftedResources")
        private java.util.List<DriftedResources> driftedResources;

        @com.aliyun.core.annotation.NameInMap("errorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("identifier")
        private String identifier;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Job(Builder builder) {
            this.changedResources = builder.changedResources;
            this.driftedResources = builder.driftedResources;
            this.errorMessage = builder.errorMessage;
            this.identifier = builder.identifier;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Job create() {
            return builder().build();
        }

        /**
         * @return changedResources
         */
        public java.util.List<ChangedResources> getChangedResources() {
            return this.changedResources;
        }

        /**
         * @return driftedResources
         */
        public java.util.List<DriftedResources> getDriftedResources() {
            return this.driftedResources;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return identifier
         */
        public String getIdentifier() {
            return this.identifier;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List<ChangedResources> changedResources; 
            private java.util.List<DriftedResources> driftedResources; 
            private String errorMessage; 
            private String identifier; 
            private String status; 
            private String type; 

            private Builder() {
            } 

            private Builder(Job model) {
                this.changedResources = model.changedResources;
                this.driftedResources = model.driftedResources;
                this.errorMessage = model.errorMessage;
                this.identifier = model.identifier;
                this.status = model.status;
                this.type = model.type;
            } 

            /**
             * changedResources.
             */
            public Builder changedResources(java.util.List<ChangedResources> changedResources) {
                this.changedResources = changedResources;
                return this;
            }

            /**
             * driftedResources.
             */
            public Builder driftedResources(java.util.List<DriftedResources> driftedResources) {
                this.driftedResources = driftedResources;
                return this;
            }

            /**
             * errorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * identifier.
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Job build() {
                return new Job(this);
            } 

        } 

    }
}
