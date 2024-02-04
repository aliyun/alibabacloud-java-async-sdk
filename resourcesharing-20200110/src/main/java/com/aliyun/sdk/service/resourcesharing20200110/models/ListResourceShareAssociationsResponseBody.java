// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcesharing20200110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListResourceShareAssociationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListResourceShareAssociationsResponseBody</p>
 */
public class ListResourceShareAssociationsResponseBody extends TeaModel {
    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceShareAssociations")
    private java.util.List < ResourceShareAssociations> resourceShareAssociations;

    private ListResourceShareAssociationsResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.resourceShareAssociations = builder.resourceShareAssociations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceShareAssociationsResponseBody create() {
        return builder().build();
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
        private String nextToken; 
        private String requestId; 
        private java.util.List < ResourceShareAssociations> resourceShareAssociations; 

        /**
         * The `token` that is used to initiate the next request. If the response of the current request is truncated, you can use the token to initiate another request and obtain the remaining records.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information of the entities.
         */
        public Builder resourceShareAssociations(java.util.List < ResourceShareAssociations> resourceShareAssociations) {
            this.resourceShareAssociations = resourceShareAssociations;
            return this;
        }

        public ListResourceShareAssociationsResponseBody build() {
            return new ListResourceShareAssociationsResponseBody(this);
        } 

    } 

    public static class AssociationFailedDetails extends TeaModel {
        @NameInMap("AssociateType")
        private String associateType;

        @NameInMap("EntityId")
        private String entityId;

        @NameInMap("EntityType")
        private String entityType;

        @NameInMap("FailureDescription")
        private String failureDescription;

        @NameInMap("FailureReason")
        private String failureReason;

        @NameInMap("OperationType")
        private String operationType;

        @NameInMap("Status")
        private String status;

        @NameInMap("StatusMessage")
        private String statusMessage;

        private AssociationFailedDetails(Builder builder) {
            this.associateType = builder.associateType;
            this.entityId = builder.entityId;
            this.entityType = builder.entityType;
            this.failureDescription = builder.failureDescription;
            this.failureReason = builder.failureReason;
            this.operationType = builder.operationType;
            this.status = builder.status;
            this.statusMessage = builder.statusMessage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssociationFailedDetails create() {
            return builder().build();
        }

        /**
         * @return associateType
         */
        public String getAssociateType() {
            return this.associateType;
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
         * @return failureDescription
         */
        public String getFailureDescription() {
            return this.failureDescription;
        }

        /**
         * @return failureReason
         */
        public String getFailureReason() {
            return this.failureReason;
        }

        /**
         * @return operationType
         */
        public String getOperationType() {
            return this.operationType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusMessage
         */
        public String getStatusMessage() {
            return this.statusMessage;
        }

        public static final class Builder {
            private String associateType; 
            private String entityId; 
            private String entityType; 
            private String failureDescription; 
            private String failureReason; 
            private String operationType; 
            private String status; 
            private String statusMessage; 

            /**
             * AssociateType.
             */
            public Builder associateType(String associateType) {
                this.associateType = associateType;
                return this;
            }

            /**
             * EntityId.
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * EntityType.
             */
            public Builder entityType(String entityType) {
                this.entityType = entityType;
                return this;
            }

            /**
             * FailureDescription.
             */
            public Builder failureDescription(String failureDescription) {
                this.failureDescription = failureDescription;
                return this;
            }

            /**
             * FailureReason.
             */
            public Builder failureReason(String failureReason) {
                this.failureReason = failureReason;
                return this;
            }

            /**
             * OperationType.
             */
            public Builder operationType(String operationType) {
                this.operationType = operationType;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * StatusMessage.
             */
            public Builder statusMessage(String statusMessage) {
                this.statusMessage = statusMessage;
                return this;
            }

            public AssociationFailedDetails build() {
                return new AssociationFailedDetails(this);
            } 

        } 

    }
    public static class ResourceShareAssociations extends TeaModel {
        @NameInMap("AssociationFailedDetails")
        private java.util.List < AssociationFailedDetails> associationFailedDetails;

        @NameInMap("AssociationStatus")
        private String associationStatus;

        @NameInMap("AssociationStatusMessage")
        private String associationStatusMessage;

        @NameInMap("AssociationType")
        private String associationType;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("EntityId")
        private String entityId;

        @NameInMap("EntityType")
        private String entityType;

        @NameInMap("External")
        private Boolean external;

        @NameInMap("ResourceShareId")
        private String resourceShareId;

        @NameInMap("ResourceShareName")
        private String resourceShareName;

        @NameInMap("TargetProperty")
        private String targetProperty;

        @NameInMap("UpdateTime")
        private String updateTime;

        private ResourceShareAssociations(Builder builder) {
            this.associationFailedDetails = builder.associationFailedDetails;
            this.associationStatus = builder.associationStatus;
            this.associationStatusMessage = builder.associationStatusMessage;
            this.associationType = builder.associationType;
            this.createTime = builder.createTime;
            this.entityId = builder.entityId;
            this.entityType = builder.entityType;
            this.external = builder.external;
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
         * @return associationFailedDetails
         */
        public java.util.List < AssociationFailedDetails> getAssociationFailedDetails() {
            return this.associationFailedDetails;
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
         * @return external
         */
        public Boolean getExternal() {
            return this.external;
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
            private java.util.List < AssociationFailedDetails> associationFailedDetails; 
            private String associationStatus; 
            private String associationStatusMessage; 
            private String associationType; 
            private String createTime; 
            private String entityId; 
            private String entityType; 
            private Boolean external; 
            private String resourceShareId; 
            private String resourceShareName; 
            private String targetProperty; 
            private String updateTime; 

            /**
             * AssociationFailedDetails.
             */
            public Builder associationFailedDetails(java.util.List < AssociationFailedDetails> associationFailedDetails) {
                this.associationFailedDetails = associationFailedDetails;
                return this;
            }

            /**
             * The association status. Valid values:
             * <p>
             * 
             * *   Associating: The entity is being associated.
             * *   Associated: The entity is associated.
             * *   Failed: The entity fails to be associated.
             * *   Disassociating: The entity is being disassociated.
             * *   Disassociated: The entity is disassociated.
             * 
             * >  The system deletes the records of entities in the `Failed` or `Disassociated` state within 48 hours to 96 hours.
             */
            public Builder associationStatus(String associationStatus) {
                this.associationStatus = associationStatus;
                return this;
            }

            /**
             * The cause of the association failure.
             */
            public Builder associationStatusMessage(String associationStatusMessage) {
                this.associationStatusMessage = associationStatusMessage;
                return this;
            }

            /**
             * The association type. Valid values:
             * <p>
             * 
             * *   Resource
             * *   Target
             */
            public Builder associationType(String associationType) {
                this.associationType = associationType;
                return this;
            }

            /**
             * The time when the association of the entity was created. The value of this parameter depends on the value of the AssociationType parameter:
             * <p>
             * 
             * *   If the value of `AssociationType` is `Resource`, the value of this parameter is the time when the shared resource was associated with or disassociated from the resource share.
             * *   If the value of `AssociationType` is `Target`, the value of this parameter is the time when the principal was associated with or disassociated from the resource share.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The ID of the entity. The value of this parameter depends on the value of the AssociationType parameter:
             * <p>
             * 
             * *   If the value of `AssociationType` is `Resource`, the value of this parameter is the ID of the shared resource.
             * *   If the value of `AssociationType` is `Target`, the value of this parameter is the ID of the principal.
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * The type of the entity. The value of this parameter depends on the value of the AssociationType parameter:
             * <p>
             * 
             * *   If the value of AssociationType is Resource, the value of this parameter is the type of the resource. For more information about the types of resources that can be shared, see [Services that work with Resource Sharing](~~450526~~).
             * *   If the value of AssociationType is Target, the value of this parameter is `Account`.
             */
            public Builder entityType(String entityType) {
                this.entityType = entityType;
                return this;
            }

            /**
             * Indicates whether the principal is outside the resource directory. Valid values:
             * <p>
             * 
             * *   true: The principal is outside the resource directory.
             * *   false: The principal is in the resource directory.
             */
            public Builder external(Boolean external) {
                this.external = external;
                return this;
            }

            /**
             * The ID of the resource share.
             */
            public Builder resourceShareId(String resourceShareId) {
                this.resourceShareId = resourceShareId;
                return this;
            }

            /**
             * The name of the resource share.
             */
            public Builder resourceShareName(String resourceShareName) {
                this.resourceShareName = resourceShareName;
                return this;
            }

            /**
             * TargetProperty.
             */
            public Builder targetProperty(String targetProperty) {
                this.targetProperty = targetProperty;
                return this;
            }

            /**
             * The time when the association of the entity was updated. The value of this parameter depends on the value of the AssociationType parameter:
             * <p>
             * 
             * *   If the value of `AssociationType` is `Resource`, the value of this parameter is the time when the association of the shared resource was updated.
             * *   If the value of `AssociationType` is `Target`, the value of this parameter is the time when the association of the principal was updated.
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
