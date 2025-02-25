// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcesharing20200110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AssociateResourceShareResponseBody} extends {@link TeaModel}
 *
 * <p>AssociateResourceShareResponseBody</p>
 */
public class AssociateResourceShareResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceShareAssociations")
    private java.util.List < ResourceShareAssociations> resourceShareAssociations;

    private AssociateResourceShareResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceShareAssociations = builder.resourceShareAssociations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssociateResourceShareResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceShareAssociations
     */
    public java.util.List < ResourceShareAssociations> getResourceShareAssociations() {
        return this.resourceShareAssociations;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < ResourceShareAssociations> resourceShareAssociations; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>111FB84A-60A9-403E-9067-E55D7EE95BD1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the entities that are associated with the resource share.</p>
         */
        public Builder resourceShareAssociations(java.util.List < ResourceShareAssociations> resourceShareAssociations) {
            this.resourceShareAssociations = resourceShareAssociations;
            return this;
        }

        public AssociateResourceShareResponseBody build() {
            return new AssociateResourceShareResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AssociateResourceShareResponseBody} extends {@link TeaModel}
     *
     * <p>AssociateResourceShareResponseBody</p>
     */
    public static class ResourceShareAssociations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssociationStatus")
        private String associationStatus;

        @com.aliyun.core.annotation.NameInMap("AssociationStatusMessage")
        private String associationStatusMessage;

        @com.aliyun.core.annotation.NameInMap("AssociationType")
        private String associationType;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("EntityId")
        private String entityId;

        @com.aliyun.core.annotation.NameInMap("EntityType")
        private String entityType;

        @com.aliyun.core.annotation.NameInMap("ResourceShareId")
        private String resourceShareId;

        @com.aliyun.core.annotation.NameInMap("ResourceShareName")
        private String resourceShareName;

        @com.aliyun.core.annotation.NameInMap("TargetProperty")
        private String targetProperty;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private ResourceShareAssociations(Builder builder) {
            this.associationStatus = builder.associationStatus;
            this.associationStatusMessage = builder.associationStatusMessage;
            this.associationType = builder.associationType;
            this.createTime = builder.createTime;
            this.entityId = builder.entityId;
            this.entityType = builder.entityType;
            this.resourceShareId = builder.resourceShareId;
            this.resourceShareName = builder.resourceShareName;
            this.targetProperty = builder.targetProperty;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceShareAssociations create() {
            return builder().build();
        }

        /**
         * @return associationStatus
         */
        public String getAssociationStatus() {
            return this.associationStatus;
        }

        /**
         * @return associationStatusMessage
         */
        public String getAssociationStatusMessage() {
            return this.associationStatusMessage;
        }

        /**
         * @return associationType
         */
        public String getAssociationType() {
            return this.associationType;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return entityId
         */
        public String getEntityId() {
            return this.entityId;
        }

        /**
         * @return entityType
         */
        public String getEntityType() {
            return this.entityType;
        }

        /**
         * @return resourceShareId
         */
        public String getResourceShareId() {
            return this.resourceShareId;
        }

        /**
         * @return resourceShareName
         */
        public String getResourceShareName() {
            return this.resourceShareName;
        }

        /**
         * @return targetProperty
         */
        public String getTargetProperty() {
            return this.targetProperty;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String associationStatus; 
            private String associationStatusMessage; 
            private String associationType; 
            private String createTime; 
            private String entityId; 
            private String entityType; 
            private String resourceShareId; 
            private String resourceShareName; 
            private String targetProperty; 
            private String updateTime; 

            /**
             * <p>The association status. Valid values:</p>
             * <ul>
             * <li>Associating: The entity is being associated.</li>
             * <li>Associated: The entity is associated.</li>
             * <li>Failed: The entity fails to be associated.</li>
             * <li>Disassociating: The entity is being disassociated.</li>
             * <li>Disassociated: The entity is disassociated.</li>
             * </ul>
             * <blockquote>
             * <p> The system deletes the records of entities in the <code>Failed</code> or <code>Disassociated</code> state within 48 hours to 96 hours.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Associating</p>
             */
            public Builder associationStatus(String associationStatus) {
                this.associationStatus = associationStatus;
                return this;
            }

            /**
             * <p>The cause of the association failure.</p>
             * 
             * <strong>example:</strong>
             * <p>The reason for the association failure.</p>
             */
            public Builder associationStatusMessage(String associationStatusMessage) {
                this.associationStatusMessage = associationStatusMessage;
                return this;
            }

            /**
             * <p>The association type. Valid values:</p>
             * <ul>
             * <li>Resource</li>
             * <li>Target</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Resource</p>
             */
            public Builder associationType(String associationType) {
                this.associationType = associationType;
                return this;
            }

            /**
             * <p>The time when the association of the entity was created. The value of this parameter depends on the value of the AssociationType parameter:</p>
             * <ul>
             * <li>If the value of <code>AssociationType</code> is <code>Resource</code>, the value of this parameter is the time when the shared resource was associated with the resource share.</li>
             * <li>If the value of <code>AssociationType</code> is <code>Target</code>, the value of this parameter is the time when the principal was associated with the resource share.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2020-12-04T09:40:41.246Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the entity. The value of this parameter depends on the value of the AssociationType parameter:</p>
             * <ul>
             * <li>If the value of <code>AssociationType</code> is <code>Resource</code>, the value of this parameter is the ID of the shared resource.</li>
             * <li>If the value of <code>AssociationType</code> is <code>Target</code>, the value of this parameter is the ID of the principal.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp183p93qs667muql****</p>
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * <p>The type of the entity. The value of this parameter depends on the value of the AssociationType parameter:</p>
             * <ul>
             * <li>If the value of AssociationType is Resource, the value of this parameter is the type of the shared resource. For information about the types of resources that can be shared, see <a href="https://help.aliyun.com/document_detail/450526.html">Services that work with Resource Sharing</a>.</li>
             * <li>If the value of AssociationType is Target, the value of this parameter is <code>Account</code>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>VSwitch</p>
             */
            public Builder entityType(String entityType) {
                this.entityType = entityType;
                return this;
            }

            /**
             * <p>The ID of the resource share.</p>
             * 
             * <strong>example:</strong>
             * <p>rs-6GRmdD3X****</p>
             */
            public Builder resourceShareId(String resourceShareId) {
                this.resourceShareId = resourceShareId;
                return this;
            }

            /**
             * <p>The name of the resource share.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder resourceShareName(String resourceShareName) {
                this.resourceShareName = resourceShareName;
                return this;
            }

            /**
             * <p>The properties of the principal, such as the time range within which the resource is shared.</p>
             * <blockquote>
             * <p> This parameter is returned only if the principal is an Alibaba Cloud service.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;plan&quot;:{
             *         &quot;timeRangeType&quot;:&quot;timeRange&quot;,
             *         &quot;beginAtTime&quot;:&quot;00:00&quot;,
             *         &quot;timezone&quot;:&quot;UTC+8&quot;,
             *         &quot;endAtTime&quot;:&quot;19:59&quot;
             *     }
             * }</p>
             */
            public Builder targetProperty(String targetProperty) {
                this.targetProperty = targetProperty;
                return this;
            }

            /**
             * <p>The time when the association of the entity was updated. The value of this parameter depends on the value of the AssociationType parameter:</p>
             * <ul>
             * <li>If the value of <code>AssociationType</code> is <code>Resource</code>, the value of this parameter is the time when the association of the shared resource was updated.</li>
             * <li>If the value of <code>AssociationType</code> is <code>Target</code>, the value of this parameter is the time when the association of the principal was updated.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2020-12-04T09:40:41.246Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public ResourceShareAssociations build() {
                return new ResourceShareAssociations(this);
            } 

        } 

    }
}
