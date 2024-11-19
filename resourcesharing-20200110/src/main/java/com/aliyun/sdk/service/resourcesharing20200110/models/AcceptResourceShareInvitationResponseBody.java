// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcesharing20200110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AcceptResourceShareInvitationResponseBody} extends {@link TeaModel}
 *
 * <p>AcceptResourceShareInvitationResponseBody</p>
 */
public class AcceptResourceShareInvitationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceShareInvitation")
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>08F18B04-47CB-5C0E-A6D2-37DEF5C2A961</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the resource sharing invitation.</p>
         */
        public Builder resourceShareInvitation(ResourceShareInvitation resourceShareInvitation) {
            this.resourceShareInvitation = resourceShareInvitation;
            return this;
        }

        public AcceptResourceShareInvitationResponseBody build() {
            return new AcceptResourceShareInvitationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AcceptResourceShareInvitationResponseBody} extends {@link TeaModel}
     *
     * <p>AcceptResourceShareInvitationResponseBody</p>
     */
    public static class AcceptInvitationFailedDetails extends TeaModel {
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
             * <p>This parameter is deprecated. The OperationType parameter is used instead.</p>
             * 
             * <strong>example:</strong>
             * <p>Associate</p>
             */
            public Builder associateType(String associateType) {
                this.associateType = associateType;
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
             * <li>Unavailable: The resource cannot be shared.</li>
             * <li>LimitExceeded: The number of shared resources within the Alibaba Cloud account exceeds the upper limit.</li>
             * <li>ZonalResourceInaccessible: The resource is unavailable in this region.</li>
             * <li>InternalError: An internal error occurred during the check.</li>
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
             * <p>This parameter is deprecated. The FailureReason parameter is used instead.</p>
             * 
             * <strong>example:</strong>
             * <p>Unavailable</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>This parameter is deprecated. The FailureDescription parameter is used instead.</p>
             * 
             * <strong>example:</strong>
             * <p>You cannot access the specified resource at this time.</p>
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
    /**
     * 
     * {@link AcceptResourceShareInvitationResponseBody} extends {@link TeaModel}
     *
     * <p>AcceptResourceShareInvitationResponseBody</p>
     */
    public static class ResourceShareInvitation extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AcceptInvitationFailedDetails")
        private java.util.List < AcceptInvitationFailedDetails> acceptInvitationFailedDetails;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        @com.aliyun.core.annotation.Validation(required = true)
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("ReceiverAccountId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String receiverAccountId;

        @com.aliyun.core.annotation.NameInMap("ResourceShareId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String resourceShareId;

        @com.aliyun.core.annotation.NameInMap("ResourceShareInvitationId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String resourceShareInvitationId;

        @com.aliyun.core.annotation.NameInMap("ResourceShareName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String resourceShareName;

        @com.aliyun.core.annotation.NameInMap("SenderAccountId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String senderAccountId;

        @com.aliyun.core.annotation.NameInMap("Status")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>The information about the failure.</p>
             */
            public Builder acceptInvitationFailedDetails(java.util.List < AcceptInvitationFailedDetails> acceptInvitationFailedDetails) {
                this.acceptInvitationFailedDetails = acceptInvitationFailedDetails;
                return this;
            }

            /**
             * <p>The time when the invitation was created. The time is displayed in UTC.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-09-02T06:43:12.353Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The Alibaba Cloud account ID of the invitee.</p>
             * <p>This parameter is required.</p>
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>rs-ysGRci9z****</p>
             */
            public Builder resourceShareId(String resourceShareId) {
                this.resourceShareId = resourceShareId;
                return this;
            }

            /**
             * <p>The ID of the resource sharing invitation.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>i-pMnItMX19fBJ****</p>
             */
            public Builder resourceShareInvitationId(String resourceShareInvitationId) {
                this.resourceShareInvitationId = resourceShareInvitationId;
                return this;
            }

            /**
             * <p>The name of the resource share.</p>
             * <p>This parameter is required.</p>
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
             * <p>This parameter is required.</p>
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>AcceptFailed</p>
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
