// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcesharing20200110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RejectResourceShareInvitationResponseBody} extends {@link TeaModel}
 *
 * <p>RejectResourceShareInvitationResponseBody</p>
 */
public class RejectResourceShareInvitationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceShareInvitation")
    private ResourceShareInvitation resourceShareInvitation;

    private RejectResourceShareInvitationResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceShareInvitation = builder.resourceShareInvitation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RejectResourceShareInvitationResponseBody create() {
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information of the resource sharing invitation.
         */
        public Builder resourceShareInvitation(ResourceShareInvitation resourceShareInvitation) {
            this.resourceShareInvitation = resourceShareInvitation;
            return this;
        }

        public RejectResourceShareInvitationResponseBody build() {
            return new RejectResourceShareInvitationResponseBody(this);
        } 

    } 

    public static class ResourceShareInvitation extends TeaModel {
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
             * *   Pending: The invitation is waiting for confirmation.
             * *   Accepted: The invitation is accepted.
             * *   Cancelled: The invitation is canceled.
             * *   Rejected: The invitation is rejected.
             * *   Expired: The invitation has expired.
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
