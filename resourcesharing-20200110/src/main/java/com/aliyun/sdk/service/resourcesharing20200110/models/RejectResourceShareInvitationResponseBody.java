// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcesharing20200110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RejectResourceShareInvitationResponseBody} extends {@link TeaModel}
 *
 * <p>RejectResourceShareInvitationResponseBody</p>
 */
public class RejectResourceShareInvitationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceShareInvitation")
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E446D6DE-BFC8-5F37-A494-33D7B118147D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information of the resource sharing invitation.</p>
         */
        public Builder resourceShareInvitation(ResourceShareInvitation resourceShareInvitation) {
            this.resourceShareInvitation = resourceShareInvitation;
            return this;
        }

        public RejectResourceShareInvitationResponseBody build() {
            return new RejectResourceShareInvitationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RejectResourceShareInvitationResponseBody} extends {@link TeaModel}
     *
     * <p>RejectResourceShareInvitationResponseBody</p>
     */
    public static class ResourceShareInvitation extends TeaModel {
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
             * <p>The time when the invitation was created. The time is displayed in UTC.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-09-02T07:07:30.809Z</p>
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
             * <p>rs-JoA1Ayjm****</p>
             */
            public Builder resourceShareId(String resourceShareId) {
                this.resourceShareId = resourceShareId;
                return this;
            }

            /**
             * <p>The ID of the invitation.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>i-yyTWbkjHArYh****</p>
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
             * <li>Pending: The invitation is waiting for confirmation.</li>
             * <li>Accepted: The invitation is accepted.</li>
             * <li>Cancelled: The invitation is canceled.</li>
             * <li>Rejected: The invitation is rejected.</li>
             * <li>Expired: The invitation has expired.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Rejected</p>
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
