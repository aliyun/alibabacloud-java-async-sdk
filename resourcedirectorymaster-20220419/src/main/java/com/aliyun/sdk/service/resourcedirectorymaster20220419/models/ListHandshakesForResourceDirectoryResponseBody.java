// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListHandshakesForResourceDirectoryResponseBody} extends {@link TeaModel}
 *
 * <p>ListHandshakesForResourceDirectoryResponseBody</p>
 */
public class ListHandshakesForResourceDirectoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Handshakes")
    private Handshakes handshakes;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * <p>The information of the invitations.</p>
         */
        public Builder handshakes(Handshakes handshakes) {
            this.handshakes = handshakes;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>9B34724D-54B0-4A51-B34D-4512372FE1BE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListHandshakesForResourceDirectoryResponseBody build() {
            return new ListHandshakesForResourceDirectoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListHandshakesForResourceDirectoryResponseBody} extends {@link TeaModel}
     *
     * <p>ListHandshakesForResourceDirectoryResponseBody</p>
     */
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
             * <p>The time when the invitation was created. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-08-10T09:55:41Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The time when the invitation expires. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-08-24T09:55:41Z</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The ID of the invitation.</p>
             * 
             * <strong>example:</strong>
             * <p>h-ycm4rp****</p>
             */
            public Builder handshakeId(String handshakeId) {
                this.handshakeId = handshakeId;
                return this;
            }

            /**
             * <p>The ID of the management account of the resource directory.</p>
             * 
             * <strong>example:</strong>
             * <p>172841235500****</p>
             */
            public Builder masterAccountId(String masterAccountId) {
                this.masterAccountId = masterAccountId;
                return this;
            }

            /**
             * <p>The name of the management account of the resource directory.</p>
             * 
             * <strong>example:</strong>
             * <p>Alice</p>
             */
            public Builder masterAccountName(String masterAccountName) {
                this.masterAccountName = masterAccountName;
                return this;
            }

            /**
             * <p>The time when the invitation was modified. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-08-10T09:55:41Z</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The description of the invitation.</p>
             * 
             * <strong>example:</strong>
             * <p>Welcome</p>
             */
            public Builder note(String note) {
                this.note = note;
                return this;
            }

            /**
             * <p>The ID of the resource directory.</p>
             * 
             * <strong>example:</strong>
             * <p>rd-abcdef****</p>
             */
            public Builder resourceDirectoryId(String resourceDirectoryId) {
                this.resourceDirectoryId = resourceDirectoryId;
                return this;
            }

            /**
             * <p>The status of the invitation. Valid values:</p>
             * <ul>
             * <li>Pending: The invitation is waiting for confirmation.</li>
             * <li>Accepted: The invitation is accepted.</li>
             * <li>Cancelled: The invitation is canceled.</li>
             * <li>Declined: The invitation is rejected.</li>
             * <li>Expired: The invitation expires.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Pending</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID or logon email address of the invited account.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:someone@example.com">someone@example.com</a></p>
             */
            public Builder targetEntity(String targetEntity) {
                this.targetEntity = targetEntity;
                return this;
            }

            /**
             * <p>The type of the invited account. Valid values:</p>
             * <ul>
             * <li>Account: indicates the ID of the account.</li>
             * <li>Email: indicates the logon email address of the account.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Email</p>
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
    /**
     * 
     * {@link ListHandshakesForResourceDirectoryResponseBody} extends {@link TeaModel}
     *
     * <p>ListHandshakesForResourceDirectoryResponseBody</p>
     */
    public static class Handshakes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Handshake")
        private java.util.List<Handshake> handshake;

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
        public java.util.List<Handshake> getHandshake() {
            return this.handshake;
        }

        public static final class Builder {
            private java.util.List<Handshake> handshake; 

            /**
             * Handshake.
             */
            public Builder handshake(java.util.List<Handshake> handshake) {
                this.handshake = handshake;
                return this;
            }

            public Handshakes build() {
                return new Handshakes(this);
            } 

        } 

    }
}
