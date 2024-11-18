// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcesharing20200110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListResourceShareInvitationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListResourceShareInvitationsResponseBody</p>
 */
public class ListResourceShareInvitationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceShareInvitations")
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
         * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of <code>NextToken</code>.</p>
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
         * <p>30EC8328-1BDE-51D5-BFAB-039508BD91A1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the resource sharing invitations.</p>
         */
        public Builder resourceShareInvitations(java.util.List < ResourceShareInvitations> resourceShareInvitations) {
            this.resourceShareInvitations = resourceShareInvitations;
            return this;
        }

        public ListResourceShareInvitationsResponseBody build() {
            return new ListResourceShareInvitationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListResourceShareInvitationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourceShareInvitationsResponseBody</p>
     */
    public static class InvitationFailedDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssociateType")
        private String associateType;

        @com.aliyun.core.annotation.NameInMap("FailureDescription")
        private String failureDescription;

        @com.aliyun.core.annotation.NameInMap("FailureReason")
        private String failureReason;

        @com.aliyun.core.annotation.NameInMap("OperationType")
        private String operationType;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusMessage")
        private String statusMessage;

        private InvitationFailedDetails(Builder builder) {
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
             * <p>The type of the sharing operation. Valid values:</p>
             * <ul>
             * <li>Associate</li>
             * <li>Disassociate</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Associate</p>
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
             * <p>The ID of the shared resource.</p>
             * 
             * <strong>example:</strong>
             * <p>s-7xvh46nx5oqlre0wv***</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The type of the shared resource.</p>
             * <p>For more information about the types of resources that can be shared, see <a href="https://help.aliyun.com/document_detail/450526.html">Services that work with Resource Sharing</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>Snapshot</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The failure status. Valid values:</p>
             * <ul>
             * <li>Unavailable: The resource cannot be shared.</li>
             * <li>LimitExceeded: The number of shared resources within the Alibaba Cloud account exceeds the upper limit.</li>
             * <li>ZonalResourceInaccessible: The resource is unavailable in this region.</li>
             * <li>UnsupportedOperation: The operation is not allowed because another association exists.</li>
             * <li>InternalError: An internal error occurred during the check.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Unavailable</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The failure cause.</p>
             * 
             * <strong>example:</strong>
             * <p>You cannot access the specified resource at this time.</p>
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
    /**
     * 
     * {@link ListResourceShareInvitationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListResourceShareInvitationsResponseBody</p>
     */
    public static class ResourceShareInvitations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("InvitationFailedDetails")
        private java.util.List < InvitationFailedDetails> invitationFailedDetails;

        @com.aliyun.core.annotation.NameInMap("ReceiverAccountId")
        private String receiverAccountId;

        @com.aliyun.core.annotation.NameInMap("ResourceShareId")
        private String resourceShareId;

        @com.aliyun.core.annotation.NameInMap("ResourceShareInvitationId")
        private String resourceShareInvitationId;

        @com.aliyun.core.annotation.NameInMap("ResourceShareName")
        private String resourceShareName;

        @com.aliyun.core.annotation.NameInMap("SenderAccountId")
        private String senderAccountId;

        @com.aliyun.core.annotation.NameInMap("Status")
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
             * <p>The time when the invitation was created. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-08-18T05:36:45.024Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The information about the failure.</p>
             */
            public Builder invitationFailedDetails(java.util.List < InvitationFailedDetails> invitationFailedDetails) {
                this.invitationFailedDetails = invitationFailedDetails;
                return this;
            }

            /**
             * <p>The Alibaba Cloud account ID of the invitee.</p>
             * 
             * <strong>example:</strong>
             * <p>134254031178****</p>
             */
            public Builder receiverAccountId(String receiverAccountId) {
                this.receiverAccountId = receiverAccountId;
                return this;
            }

            /**
             * <p>The ID of the resource share.</p>
             * 
             * <strong>example:</strong>
             * <p>rs-ysGRci9z****</p>
             */
            public Builder resourceShareId(String resourceShareId) {
                this.resourceShareId = resourceShareId;
                return this;
            }

            /**
             * <p>The ID of the invitation.</p>
             * 
             * <strong>example:</strong>
             * <p>i-p6eRytrkjVvM****</p>
             */
            public Builder resourceShareInvitationId(String resourceShareInvitationId) {
                this.resourceShareInvitationId = resourceShareInvitationId;
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
             * <p>The Alibaba Cloud account ID of the inviter.</p>
             * 
             * <strong>example:</strong>
             * <p>151266687691****</p>
             */
            public Builder senderAccountId(String senderAccountId) {
                this.senderAccountId = senderAccountId;
                return this;
            }

            /**
             * <p>The status of the invitation. Valid values:</p>
             * <ul>
             * <li>Pending</li>
             * <li>Accepted</li>
             * <li>Cancelled</li>
             * <li>Rejected</li>
             * <li>Expired</li>
             * <li>AcceptFailed</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Pending</p>
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
