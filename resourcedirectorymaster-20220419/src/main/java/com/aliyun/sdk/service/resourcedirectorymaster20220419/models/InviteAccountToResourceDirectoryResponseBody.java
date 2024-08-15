// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InviteAccountToResourceDirectoryResponseBody} extends {@link TeaModel}
 *
 * <p>InviteAccountToResourceDirectoryResponseBody</p>
 */
public class InviteAccountToResourceDirectoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Handshake")
    private Handshake handshake;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private InviteAccountToResourceDirectoryResponseBody(Builder builder) {
        this.handshake = builder.handshake;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InviteAccountToResourceDirectoryResponseBody create() {
        return builder().build();
    }

    /**
     * @return handshake
     */
    public Handshake getHandshake() {
        return this.handshake;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Handshake handshake; 
        private String requestId; 

        /**
         * The information about the invitation.
         */
        public Builder handshake(Handshake handshake) {
            this.handshake = handshake;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public InviteAccountToResourceDirectoryResponseBody build() {
            return new InviteAccountToResourceDirectoryResponseBody(this);
        } 

    } 

    public static class Handshake extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("HandshakeId")
        private String handshakeId;

        @com.aliyun.core.annotation.NameInMap("MasterAccountId")
        private String masterAccountId;

        @com.aliyun.core.annotation.NameInMap("MasterAccountName")
        private String masterAccountName;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("Note")
        private String note;

        @com.aliyun.core.annotation.NameInMap("ResourceDirectoryId")
        private String resourceDirectoryId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TargetEntity")
        private String targetEntity;

        @com.aliyun.core.annotation.NameInMap("TargetType")
        private String targetType;

        private Handshake(Builder builder) {
            this.createTime = builder.createTime;
            this.expireTime = builder.expireTime;
            this.handshakeId = builder.handshakeId;
            this.masterAccountId = builder.masterAccountId;
            this.masterAccountName = builder.masterAccountName;
            this.modifyTime = builder.modifyTime;
            this.note = builder.note;
            this.resourceDirectoryId = builder.resourceDirectoryId;
            this.status = builder.status;
            this.targetEntity = builder.targetEntity;
            this.targetType = builder.targetType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Handshake create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return handshakeId
         */
        public String getHandshakeId() {
            return this.handshakeId;
        }

        /**
         * @return masterAccountId
         */
        public String getMasterAccountId() {
            return this.masterAccountId;
        }

        /**
         * @return masterAccountName
         */
        public String getMasterAccountName() {
            return this.masterAccountName;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return note
         */
        public String getNote() {
            return this.note;
        }

        /**
         * @return resourceDirectoryId
         */
        public String getResourceDirectoryId() {
            return this.resourceDirectoryId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return targetEntity
         */
        public String getTargetEntity() {
            return this.targetEntity;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        public static final class Builder {
            private String createTime; 
            private String expireTime; 
            private String handshakeId; 
            private String masterAccountId; 
            private String masterAccountName; 
            private String modifyTime; 
            private String note; 
            private String resourceDirectoryId; 
            private String status; 
            private String targetEntity; 
            private String targetType; 

            /**
             * The time when the invitation was created. The time is displayed in UTC.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The time when the invitation expires. The time is displayed in UTC.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * The ID of the invitation.
             */
            public Builder handshakeId(String handshakeId) {
                this.handshakeId = handshakeId;
                return this;
            }

            /**
             * The ID of the management account of the resource directory.
             */
            public Builder masterAccountId(String masterAccountId) {
                this.masterAccountId = masterAccountId;
                return this;
            }

            /**
             * The name of the management account of the resource directory.
             */
            public Builder masterAccountName(String masterAccountName) {
                this.masterAccountName = masterAccountName;
                return this;
            }

            /**
             * The time when the invitation was modified. The time is displayed in UTC.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * The description of the invitation.
             */
            public Builder note(String note) {
                this.note = note;
                return this;
            }

            /**
             * The ID of the resource directory.
             */
            public Builder resourceDirectoryId(String resourceDirectoryId) {
                this.resourceDirectoryId = resourceDirectoryId;
                return this;
            }

            /**
             * The status of the invitation. Valid values:
             * <p>
             * 
             * *   Pending
             * *   Accepted
             * *   Cancelled
             * *   Declined
             * *   Expired
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The ID or logon email address of the invited account.
             */
            public Builder targetEntity(String targetEntity) {
                this.targetEntity = targetEntity;
                return this;
            }

            /**
             * The type of the invited account. Valid values:
             * <p>
             * 
             * *   Account: indicates the ID of the account.
             * *   Email: indicates the logon email address of the account.
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            public Handshake build() {
                return new Handshake(this);
            } 

        } 

    }
}
