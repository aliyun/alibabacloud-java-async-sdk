// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHandshakeResponseBody} extends {@link TeaModel}
 *
 * <p>GetHandshakeResponseBody</p>
 */
public class GetHandshakeResponseBody extends TeaModel {
    @NameInMap("Handshake")
    private Handshake handshake;

    @NameInMap("RequestId")
    private String requestId;

    private GetHandshakeResponseBody(Builder builder) {
        this.handshake = builder.handshake;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHandshakeResponseBody create() {
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
         * Handshake.
         */
        public Builder handshake(Handshake handshake) {
            this.handshake = handshake;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetHandshakeResponseBody build() {
            return new GetHandshakeResponseBody(this);
        } 

    } 

    public static class Handshake extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("ExpireTime")
        private String expireTime;

        @NameInMap("HandshakeId")
        private String handshakeId;

        @NameInMap("InvitedAccountRealName")
        private String invitedAccountRealName;

        @NameInMap("MasterAccountId")
        private String masterAccountId;

        @NameInMap("MasterAccountName")
        private String masterAccountName;

        @NameInMap("MasterAccountRealName")
        private String masterAccountRealName;

        @NameInMap("ModifyTime")
        private String modifyTime;

        @NameInMap("Note")
        private String note;

        @NameInMap("ResourceDirectoryId")
        private String resourceDirectoryId;

        @NameInMap("Status")
        private String status;

        @NameInMap("TargetEntity")
        private String targetEntity;

        @NameInMap("TargetType")
        private String targetType;

        private Handshake(Builder builder) {
            this.createTime = builder.createTime;
            this.expireTime = builder.expireTime;
            this.handshakeId = builder.handshakeId;
            this.invitedAccountRealName = builder.invitedAccountRealName;
            this.masterAccountId = builder.masterAccountId;
            this.masterAccountName = builder.masterAccountName;
            this.masterAccountRealName = builder.masterAccountRealName;
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
         * @return invitedAccountRealName
         */
        public String getInvitedAccountRealName() {
            return this.invitedAccountRealName;
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
         * @return masterAccountRealName
         */
        public String getMasterAccountRealName() {
            return this.masterAccountRealName;
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
            private String invitedAccountRealName; 
            private String masterAccountId; 
            private String masterAccountName; 
            private String masterAccountRealName; 
            private String modifyTime; 
            private String note; 
            private String resourceDirectoryId; 
            private String status; 
            private String targetEntity; 
            private String targetType; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * ExpireTime.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * HandshakeId.
             */
            public Builder handshakeId(String handshakeId) {
                this.handshakeId = handshakeId;
                return this;
            }

            /**
             * InvitedAccountRealName.
             */
            public Builder invitedAccountRealName(String invitedAccountRealName) {
                this.invitedAccountRealName = invitedAccountRealName;
                return this;
            }

            /**
             * MasterAccountId.
             */
            public Builder masterAccountId(String masterAccountId) {
                this.masterAccountId = masterAccountId;
                return this;
            }

            /**
             * MasterAccountName.
             */
            public Builder masterAccountName(String masterAccountName) {
                this.masterAccountName = masterAccountName;
                return this;
            }

            /**
             * MasterAccountRealName.
             */
            public Builder masterAccountRealName(String masterAccountRealName) {
                this.masterAccountRealName = masterAccountRealName;
                return this;
            }

            /**
             * ModifyTime.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * Note.
             */
            public Builder note(String note) {
                this.note = note;
                return this;
            }

            /**
             * ResourceDirectoryId.
             */
            public Builder resourceDirectoryId(String resourceDirectoryId) {
                this.resourceDirectoryId = resourceDirectoryId;
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
             * TargetEntity.
             */
            public Builder targetEntity(String targetEntity) {
                this.targetEntity = targetEntity;
                return this;
            }

            /**
             * TargetType.
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
