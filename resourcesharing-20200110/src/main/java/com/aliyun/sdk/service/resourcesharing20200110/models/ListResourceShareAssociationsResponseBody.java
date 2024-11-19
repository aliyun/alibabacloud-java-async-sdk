// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcesharing20200110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListResourceShareAssociationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListResourceShareAssociationsResponseBody</p>
 */
public class ListResourceShareAssociationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceShareAssociations")
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
         * <p>The <code>token</code> that is used to initiate the next request if the response of the current request is truncated. You can use the token to initiate another request and obtain the remaining records.</p>
         * 
         * <strong>example:</strong>
         * <p>TGlzdFJlc291cm****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>11BA57B5-7301-4E2F-BBA5-2AE4C2F4FCDB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information of the entities.</p>
         */
        public Builder resourceShareAssociations(java.util.List < ResourceShareAssociations> resourceShareAssociations) {
            this.resourceShareAssociations = resourceShareAssociations;
            return this;
        }

        public ListResourceShareAssociationsResponseBody build() {
            return new ListResourceShareAssociationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListResourceShareAssociationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourceShareAssociationsResponseBody</p>
     */
    public static class AssociationFailedDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssociateType")
        private String associateType;

        @com.aliyun.core.annotation.NameInMap("EntityId")
        private String entityId;

        @com.aliyun.core.annotation.NameInMap("EntityType")
        private String entityType;

        @com.aliyun.core.annotation.NameInMap("FailureDescription")
        private String failureDescription;

        @com.aliyun.core.annotation.NameInMap("FailureReason")
        private String failureReason;

        @com.aliyun.core.annotation.NameInMap("OperationType")
        private String operationType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusMessage")
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
             * <p>This parameter is deprecated. The OperationType parameter is used instead.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder associateType(String associateType) {
                this.associateType = associateType;
                return this;
            }

            /**
             * <p>The ID of the entity. The value of this parameter depends on the value of the AssociationType parameter:</p>
             * <ul>
             * <li>If the value of AssociationType is Resource, the value of this parameter is the ID of the principal.</li>
             * <li>If the value of AssociationType is Target, the value of this parameter is the ID of the resource.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>172050525300****</p>
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * <p>The type of the entity. The value of this parameter depends on the value of the AssociationType parameter:</p>
             * <ul>
             * <li>If the value of AssociationType is Resource, the value of this parameter is the type of the resource. For information about the types of resources that can be shared, see Services that work with Resource Sharing.</li>
             * <li>If the value of AssociationType is Target, the value of this parameter is <code>ResourceDirectory</code>, <code>Folder</code>, <code>Account</code>, or <code>Service</code>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Account</p>
             */
            public Builder entityType(String entityType) {
                this.entityType = entityType;
                return this;
            }

            /**
             * <p>The failure description.</p>
             * 
             * <strong>example:</strong>
             * <p>You cannot access the specified resource at this time.</p>
             */
            public Builder failureDescription(String failureDescription) {
                this.failureDescription = failureDescription;
                return this;
            }

            /**
             * <p>The failure cause. Valid values:</p>
             * <ul>
             * <li>Unavailable: The resource does not exist.</li>
             * <li>LimitExceeded: The number of principals for the resource exceeds the upper limit.</li>
             * <li>ZonalResourceInaccessible: The resource is unavailable in this region.</li>
             * <li>InternalError: An internal error occurred.</li>
             * <li>UnsupportedOperation: You cannot perform this operation.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Unavailable</p>
             */
            public Builder failureReason(String failureReason) {
                this.failureReason = failureReason;
                return this;
            }

            /**
             * <p>The operation type. Valid values:</p>
             * <ul>
             * <li>Associate</li>
             * <li>Disassociate</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Associate</p>
             */
            public Builder operationType(String operationType) {
                this.operationType = operationType;
                return this;
            }

            /**
             * <p>This parameter is deprecated. The FailureReason parameter is used instead.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>This parameter is deprecated. The FailureDescription parameter is used instead.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
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
    /**
     * 
     * {@link ListResourceShareAssociationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourceShareAssociationsResponseBody</p>
     */
    public static class ResourceShareAssociations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssociationFailedDetails")
        private java.util.List < AssociationFailedDetails> associationFailedDetails;

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

        @com.aliyun.core.annotation.NameInMap("External")
        private Boolean external;

        @com.aliyun.core.annotation.NameInMap("ResourceShareId")
        private String resourceShareId;

        @com.aliyun.core.annotation.NameInMap("ResourceShareName")
        private String resourceShareName;

        @com.aliyun.core.annotation.NameInMap("TargetProperty")
        private String targetProperty;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
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
             * <p>The information about the failure.</p>
             */
            public Builder associationFailedDetails(java.util.List < AssociationFailedDetails> associationFailedDetails) {
                this.associationFailedDetails = associationFailedDetails;
                return this;
            }

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
             * <p>Associated</p>
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
             * <li>If the value of <code>AssociationType</code> is <code>Resource</code>, the value of this parameter is the time when the shared resource was associated with or disassociated from the resource share.</li>
             * <li>If the value of <code>AssociationType</code> is <code>Target</code>, the value of this parameter is the time when the principal was associated with or disassociated from the resource share.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2020-12-07T07:39:01.818Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the entity. The value of this parameter depends on the value of the AssociationType parameter:</p>
             * <ul>
             * <li>If the value of <code>AssociationType</code> is <code>Resource</code>, the value of this parameter is the ID of the resource.</li>
             * <li>If the value of <code>AssociationType</code> is <code>Target</code>, the value of this parameter is the ID of the principal.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp1upw03qyz8n7us9****</p>
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * <p>The type of the entity. The value of this parameter depends on the value of the AssociationType parameter:</p>
             * <ul>
             * <li>If the value of AssociationType is Resource, the value of this parameter is the type of the resource. For information about the types of resources that can be shared, see <a href="https://help.aliyun.com/document_detail/450526.html">Services that work with Resource Sharing</a>.</li>
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
             * <p>Indicates whether the principal is outside the resource directory. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder external(Boolean external) {
                this.external = external;
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
             * <p>example</p>
             */
            public Builder resourceShareName(String resourceShareName) {
                this.resourceShareName = resourceShareName;
                return this;
            }

            /**
             * <p>The properties of the principal, such as the time range within which the resource is shared. Valid values of <code>timeRangeType</code>:</p>
             * <ul>
             * <li>timeRange: a specific time range</li>
             * <li>day: all day</li>
             * </ul>
             * <blockquote>
             * <p> This parameter is returned only if the principal is an Alibaba Cloud service.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;timeRange&quot;:{
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
             * <p>2020-12-07T07:39:02.920Z</p>
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
