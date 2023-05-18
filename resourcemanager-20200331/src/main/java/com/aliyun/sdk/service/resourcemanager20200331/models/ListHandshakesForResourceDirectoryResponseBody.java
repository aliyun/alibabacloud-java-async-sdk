// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHandshakesForResourceDirectoryResponseBody} extends {@link TeaModel}
 *
 * <p>ListHandshakesForResourceDirectoryResponseBody</p>
 */
public class ListHandshakesForResourceDirectoryResponseBody extends TeaModel {
    @NameInMap("Handshakes")
    private Handshakes handshakes;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListHandshakesForResourceDirectoryResponseBody(Builder builder) {
        this.handshakes = builder.handshakes;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHandshakesForResourceDirectoryResponseBody create() {
        return builder().build();
    }

    /**
     * @return handshakes
     */
    public Handshakes getHandshakes() {
        return this.handshakes;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Handshakes handshakes; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The information of the invitations.
         */
        public Builder handshakes(Handshakes handshakes) {
            this.handshakes = handshakes;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListHandshakesForResourceDirectoryResponseBody build() {
            return new ListHandshakesForResourceDirectoryResponseBody(this);
        } 

    } 

    public static class Handshake extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("ExpireTime")
        private String expireTime;

        @NameInMap("HandshakeId")
        private String handshakeId;

        @NameInMap("MasterAccountId")
        private String masterAccountId;

        @NameInMap("MasterAccountName")
        private String masterAccountName;

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
             * The comment on the invitation.
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
             * *   Pending: The invitation is waiting for confirmation.
             * *   Accepted: The invitation is accepted.
             * *   Cancelled: The invitation is canceled.
             * *   Declined: The invitation is rejected.
             * *   Expired: The invitation expires.
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
    public static class Handshakes extends TeaModel {
        @NameInMap("Handshake")
        private java.util.List < Handshake> handshake;

        private Handshakes(Builder builder) {
            this.handshake = builder.handshake;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Handshakes create() {
            return builder().build();
        }

        /**
         * @return handshake
         */
        public java.util.List < Handshake> getHandshake() {
            return this.handshake;
        }

        public static final class Builder {
            private java.util.List < Handshake> handshake; 

            /**
             * Handshake.
             */
            public Builder handshake(java.util.List < Handshake> handshake) {
                this.handshake = handshake;
                return this;
            }

            public Handshakes build() {
                return new Handshakes(this);
            } 

        } 

    }
}
