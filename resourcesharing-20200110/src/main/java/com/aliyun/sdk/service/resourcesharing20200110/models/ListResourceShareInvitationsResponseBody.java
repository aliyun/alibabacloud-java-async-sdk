// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcesharing20200110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListResourceShareInvitationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListResourceShareInvitationsResponseBody</p>
 */
public class ListResourceShareInvitationsResponseBody extends TeaModel {
    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceShareInvitations")
    private java.util.List < ResourceShareInvitations> resourceShareInvitations;

    private ListResourceShareInvitationsResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.resourceShareInvitations = builder.resourceShareInvitations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceShareInvitationsResponseBody create() {
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
     * @return resourceShareInvitations
     */
    public java.util.List < ResourceShareInvitations> getResourceShareInvitations() {
        return this.resourceShareInvitations;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private java.util.List < ResourceShareInvitations> resourceShareInvitations; 

        /**
         * The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of `NextToken`.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the resource sharing invitations.
         */
        public Builder resourceShareInvitations(java.util.List < ResourceShareInvitations> resourceShareInvitations) {
            this.resourceShareInvitations = resourceShareInvitations;
            return this;
        }

        public ListResourceShareInvitationsResponseBody build() {
            return new ListResourceShareInvitationsResponseBody(this);
        } 

    } 

    public static class InvitationFailedDetails extends TeaModel {
        @NameInMap("AssociateType")
        private String associateType;

        @NameInMap("ResourceId")
        private String resourceId;

        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("Status")
        private String status;

        @NameInMap("StatusMessage")
        private String statusMessage;

        private InvitationFailedDetails(Builder builder) {
            this.associateType = builder.associateType;
            this.resourceId = builder.resourceId;
            this.resourceType = builder.resourceType;
            this.status = builder.status;
            this.statusMessage = builder.statusMessage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InvitationFailedDetails create() {
            return builder().build();
        }

        /**
         * @return associateType
         */
        public String getAssociateType() {
            return this.associateType;
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
            private String resourceId; 
            private String resourceType; 
            private String status; 
            private String statusMessage; 

            /**
             * The type of the sharing operation. Valid values:
             * <p>
             * 
             * *   Associate
             * *   Disassociate
             */
            public Builder associateType(String associateType) {
                this.associateType = associateType;
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
             * *   UnsupportedOperation: The operation is not allowed because another association exists.
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

            public InvitationFailedDetails build() {
                return new InvitationFailedDetails(this);
            } 

        } 

    }
    public static class ResourceShareInvitations extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("InvitationFailedDetails")
        private java.util.List < InvitationFailedDetails> invitationFailedDetails;

        @NameInMap("ReceiverAccountId")
        private String receiverAccountId;

        @NameInMap("ResourceShareId")
        private String resourceShareId;

        @NameInMap("ResourceShareInvitationId")
        private String resourceShareInvitationId;

        @NameInMap("ResourceShareName")
        private String resourceShareName;

        @NameInMap("SenderAccountId")
        private String senderAccountId;

        @NameInMap("Status")
        private String status;

        private ResourceShareInvitations(Builder builder) {
            this.createTime = builder.createTime;
            this.invitationFailedDetails = builder.invitationFailedDetails;
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

        public static ResourceShareInvitations create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return invitationFailedDetails
         */
        public java.util.List < InvitationFailedDetails> getInvitationFailedDetails() {
            return this.invitationFailedDetails;
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
            private String createTime; 
            private java.util.List < InvitationFailedDetails> invitationFailedDetails; 
            private String receiverAccountId; 
            private String resourceShareId; 
            private String resourceShareInvitationId; 
            private String resourceShareName; 
            private String senderAccountId; 
            private String status; 

            /**
             * The time when the invitation was created. The time is displayed in UTC.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The information about the failure.
             */
            public Builder invitationFailedDetails(java.util.List < InvitationFailedDetails> invitationFailedDetails) {
                this.invitationFailedDetails = invitationFailedDetails;
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
             * The ID of the invitation.
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

            public ResourceShareInvitations build() {
                return new ResourceShareInvitations(this);
            } 

        } 

    }
}
