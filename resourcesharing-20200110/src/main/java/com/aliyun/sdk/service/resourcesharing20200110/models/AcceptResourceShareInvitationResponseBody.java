// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcesharing20200110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AcceptResourceShareInvitationResponseBody} extends {@link TeaModel}
 *
 * <p>AcceptResourceShareInvitationResponseBody</p>
 */
public class AcceptResourceShareInvitationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceShareInvitation")
    private ResourceShareInvitation resourceShareInvitation;

    private AcceptResourceShareInvitationResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceShareInvitation = builder.resourceShareInvitation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AcceptResourceShareInvitationResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceShareInvitation
     */
    public ResourceShareInvitation getResourceShareInvitation() {
        return this.resourceShareInvitation;
    }

    public static final class Builder {
        private String requestId; 
        private ResourceShareInvitation resourceShareInvitation; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the resource sharing invitation.
         */
        public Builder resourceShareInvitation(ResourceShareInvitation resourceShareInvitation) {
            this.resourceShareInvitation = resourceShareInvitation;
            return this;
        }

        public AcceptResourceShareInvitationResponseBody build() {
            return new AcceptResourceShareInvitationResponseBody(this);
        } 

    } 

    public static class AcceptInvitationFailedDetails extends TeaModel {
        @NameInMap("AssociateType")
        private String associateType;

        @NameInMap("FailureDescription")
        private String failureDescription;

        @NameInMap("FailureReason")
        private String failureReason;

        @NameInMap("OperationType")
        private String operationType;

        @NameInMap("ResourceId")
        private String resourceId;

        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("Status")
        private String status;

        @NameInMap("StatusMessage")
        private String statusMessage;

        private AcceptInvitationFailedDetails(Builder builder) {
            this.associateType = builder.associateType;
            this.failureDescription = builder.failureDescription;
            this.failureReason = builder.failureReason;
            this.operationType = builder.operationType;
            this.resourceId = builder.resourceId;
            this.resourceType = builder.resourceType;
            this.status = builder.status;
            this.statusMessage = builder.statusMessage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AcceptInvitationFailedDetails create() {
            return builder().build();
        }

        /**
         * @return associateType
         */
        public String getAssociateType() {
            return this.associateType;
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
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
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
            private String failureDescription; 
            private String failureReason; 
            private String operationType; 
            private String resourceId; 
            private String resourceType; 
            private String status; 
            private String statusMessage; 

            /**
             * The type of the sharing operation. Valid values:
             * <p>
             * 
             * *   Associate
             */
            public Builder associateType(String associateType) {
                this.associateType = associateType;
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
             * The ID of the shared resource.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * The type of the shared resource.
             * <p>
             * 
             * For more information about the types of resources that can be shared, see [Services that work with Resource Sharing](~~450526~~).
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * The failure status. Valid values:
             * <p>
             * 
             * *   Unavailable: The resource cannot be shared.
             * *   LimitExceeded: The number of shared resources within the Alibaba Cloud account exceeds the upper limit.
             * *   ZonalResourceInaccessible: The resource is unavailable in this region.
             * *   InternalError: An internal error occurred during the check.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The failure cause.
             */
            public Builder statusMessage(String statusMessage) {
                this.statusMessage = statusMessage;
                return this;
            }

            public AcceptInvitationFailedDetails build() {
                return new AcceptInvitationFailedDetails(this);
            } 

        } 

    }
    public static class ResourceShareInvitation extends TeaModel {
        @NameInMap("AcceptInvitationFailedDetails")
        private java.util.List < AcceptInvitationFailedDetails> acceptInvitationFailedDetails;

        @NameInMap("CreateTime")
        @Validation(required = true)
        private String createTime;

        @NameInMap("ReceiverAccountId")
        @Validation(required = true)
        private String receiverAccountId;

        @NameInMap("ResourceShareId")
        @Validation(required = true)
        private String resourceShareId;

        @NameInMap("ResourceShareInvitationId")
        @Validation(required = true)
        private String resourceShareInvitationId;

        @NameInMap("ResourceShareName")
        @Validation(required = true)
        private String resourceShareName;

        @NameInMap("SenderAccountId")
        @Validation(required = true)
        private String senderAccountId;

        @NameInMap("Status")
        @Validation(required = true)
        private String status;

        private ResourceShareInvitation(Builder builder) {
            this.acceptInvitationFailedDetails = builder.acceptInvitationFailedDetails;
            this.createTime = builder.createTime;
            this.receiverAccountId = builder.receiverAccountId;
            this.resourceShareId = builder.resourceShareId;
            this.resourceShareInvitationId = builder.resourceShareInvitationId;
            this.resourceShareName = builder.resourceShareName;
            this.senderAccountId = builder.senderAccountId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceShareInvitation create() {
            return builder().build();
        }

        /**
         * @return acceptInvitationFailedDetails
         */
        public java.util.List < AcceptInvitationFailedDetails> getAcceptInvitationFailedDetails() {
            return this.acceptInvitationFailedDetails;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return receiverAccountId
         */
        public String getReceiverAccountId() {
            return this.receiverAccountId;
        }

        /**
         * @return resourceShareId
         */
        public String getResourceShareId() {
            return this.resourceShareId;
        }

        /**
         * @return resourceShareInvitationId
         */
        public String getResourceShareInvitationId() {
            return this.resourceShareInvitationId;
        }

        /**
         * @return resourceShareName
         */
        public String getResourceShareName() {
            return this.resourceShareName;
        }

        /**
         * @return senderAccountId
         */
        public String getSenderAccountId() {
            return this.senderAccountId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.List < AcceptInvitationFailedDetails> acceptInvitationFailedDetails; 
            private String createTime; 
            private String receiverAccountId; 
            private String resourceShareId; 
            private String resourceShareInvitationId; 
            private String resourceShareName; 
            private String senderAccountId; 
            private String status; 

            /**
             * The information about the failure.
             */
            public Builder acceptInvitationFailedDetails(java.util.List < AcceptInvitationFailedDetails> acceptInvitationFailedDetails) {
                this.acceptInvitationFailedDetails = acceptInvitationFailedDetails;
                return this;
            }

            /**
             * The time when the invitation was created. The time is displayed in UTC.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The Alibaba Cloud account ID of the invitee.
             */
            public Builder receiverAccountId(String receiverAccountId) {
                this.receiverAccountId = receiverAccountId;
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
             * The ID of the resource sharing invitation.
             */
            public Builder resourceShareInvitationId(String resourceShareInvitationId) {
                this.resourceShareInvitationId = resourceShareInvitationId;
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
             * The Alibaba Cloud account ID of the inviter.
             */
            public Builder senderAccountId(String senderAccountId) {
                this.senderAccountId = senderAccountId;
                return this;
            }

            /**
             * The status of the invitation. Valid values:
             * <p>
             * 
             * *   Pending
             * *   Accepted
             * *   Cancelled
             * *   Rejected
             * *   Expired
             * *   AcceptFailed
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ResourceShareInvitation build() {
                return new ResourceShareInvitation(this);
            } 

        } 

    }
}
