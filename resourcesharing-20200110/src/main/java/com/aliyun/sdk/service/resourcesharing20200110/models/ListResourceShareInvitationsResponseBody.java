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
         * The status of the invitation. Valid values:
         * <p>
         * 
         * *   Pending: The invitation is waiting for confirmation.
         * *   Accepted: The invitation is accepted.
         * *   Cancelled: The invitation is canceled.
         * *   Rejected: The invitation is rejected.
         * *   Expired: The invitation has expired.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The time when the invitation was created. The time is displayed in UTC.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the resource share.
         */
        public Builder resourceShareInvitations(java.util.List < ResourceShareInvitations> resourceShareInvitations) {
            this.resourceShareInvitations = resourceShareInvitations;
            return this;
        }

        public ListResourceShareInvitationsResponseBody build() {
            return new ListResourceShareInvitationsResponseBody(this);
        } 

    } 

    public static class ResourceShareInvitations extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

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
            private String receiverAccountId; 
            private String resourceShareId; 
            private String resourceShareInvitationId; 
            private String resourceShareName; 
            private String senderAccountId; 
            private String status; 

            /**
             * The Alibaba Cloud account ID of the inviter.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * ReceiverAccountId.
             */
            public Builder receiverAccountId(String receiverAccountId) {
                this.receiverAccountId = receiverAccountId;
                return this;
            }

            /**
             * The Alibaba Cloud account ID of the invitee.
             */
            public Builder resourceShareId(String resourceShareId) {
                this.resourceShareId = resourceShareId;
                return this;
            }

            /**
             * ResourceShareInvitationId.
             */
            public Builder resourceShareInvitationId(String resourceShareInvitationId) {
                this.resourceShareInvitationId = resourceShareInvitationId;
                return this;
            }

            /**
             * The ID of the invitation.
             */
            public Builder resourceShareName(String resourceShareName) {
                this.resourceShareName = resourceShareName;
                return this;
            }

            /**
             * SenderAccountId.
             */
            public Builder senderAccountId(String senderAccountId) {
                this.senderAccountId = senderAccountId;
                return this;
            }

            /**
             * The name of the resource share.
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
