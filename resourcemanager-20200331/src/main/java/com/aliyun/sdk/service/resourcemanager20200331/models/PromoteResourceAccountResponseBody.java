// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

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
 * {@link PromoteResourceAccountResponseBody} extends {@link TeaModel}
 *
 * <p>PromoteResourceAccountResponseBody</p>
 */
public class PromoteResourceAccountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Account")
    private Account account;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private PromoteResourceAccountResponseBody(Builder builder) {
        this.account = builder.account;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PromoteResourceAccountResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return account
     */
    public Account getAccount() {
        return this.account;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Account account; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(PromoteResourceAccountResponseBody model) {
            this.account = model.account;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The member account information.</p>
         */
        public Builder account(Account account) {
            this.account = account;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9B34724D-54B0-4A51-B34D-4512372FE1BE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public PromoteResourceAccountResponseBody build() {
            return new PromoteResourceAccountResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link PromoteResourceAccountResponseBody} extends {@link TeaModel}
     *
     * <p>PromoteResourceAccountResponseBody</p>
     */
    public static class Account extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("AccountName")
        private String accountName;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("FolderId")
        private String folderId;

        @com.aliyun.core.annotation.NameInMap("JoinMethod")
        private String joinMethod;

        @com.aliyun.core.annotation.NameInMap("JoinTime")
        private String joinTime;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("RecordId")
        private String recordId;

        @com.aliyun.core.annotation.NameInMap("ResourceDirectoryId")
        private String resourceDirectoryId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Account(Builder builder) {
            this.accountId = builder.accountId;
            this.accountName = builder.accountName;
            this.displayName = builder.displayName;
            this.folderId = builder.folderId;
            this.joinMethod = builder.joinMethod;
            this.joinTime = builder.joinTime;
            this.modifyTime = builder.modifyTime;
            this.recordId = builder.recordId;
            this.resourceDirectoryId = builder.resourceDirectoryId;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Account create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return accountName
         */
        public String getAccountName() {
            return this.accountName;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return folderId
         */
        public String getFolderId() {
            return this.folderId;
        }

        /**
         * @return joinMethod
         */
        public String getJoinMethod() {
            return this.joinMethod;
        }

        /**
         * @return joinTime
         */
        public String getJoinTime() {
            return this.joinTime;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return recordId
         */
        public String getRecordId() {
            return this.recordId;
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
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String accountId; 
            private String accountName; 
            private String displayName; 
            private String folderId; 
            private String joinMethod; 
            private String joinTime; 
            private String modifyTime; 
            private String recordId; 
            private String resourceDirectoryId; 
            private String status; 
            private String type; 

            private Builder() {
            } 

            private Builder(Account model) {
                this.accountId = model.accountId;
                this.accountName = model.accountName;
                this.displayName = model.displayName;
                this.folderId = model.folderId;
                this.joinMethod = model.joinMethod;
                this.joinTime = model.joinTime;
                this.modifyTime = model.modifyTime;
                this.recordId = model.recordId;
                this.resourceDirectoryId = model.resourceDirectoryId;
                this.status = model.status;
                this.type = model.type;
            } 

            /**
             * <p>The account ID.</p>
             * 
             * <strong>example:</strong>
             * <p>12323344****</p>
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The account name.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:someone@example.com">someone@example.com</a></p>
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * <p>The member name.</p>
             * 
             * <strong>example:</strong>
             * <p>admin</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The folder ID.</p>
             * 
             * <strong>example:</strong>
             * <p>fd-bVaRIG****</p>
             */
            public Builder folderId(String folderId) {
                this.folderId = folderId;
                return this;
            }

            /**
             * <p>The method used by the member to join the resource directory. Valid values:</p>
             * <ul>
             * <li>invited: Invited.</li>
             * <li>created: Created.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>created</p>
             */
            public Builder joinMethod(String joinMethod) {
                this.joinMethod = joinMethod;
                return this;
            }

            /**
             * <p>The time when the member joined the resource directory. The time is displayed in UTC in RFC 3339 format, indicated by Z.</p>
             * 
             * <strong>example:</strong>
             * <p>2015-01-23T12:33:18Z</p>
             */
            public Builder joinTime(String joinTime) {
                this.joinTime = joinTime;
                return this;
            }

            /**
             * <p>The time when the member was last modified. The time is displayed in UTC in RFC 3339 format, indicated by Z.</p>
             * 
             * <strong>example:</strong>
             * <p>2015-01-23T12:33:18Z</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The account record ID.</p>
             * 
             * <strong>example:</strong>
             * <p>06950264-3f0d-4ca9-82dd-6ee7a3d33d6b</p>
             */
            public Builder recordId(String recordId) {
                this.recordId = recordId;
                return this;
            }

            /**
             * <p>The resource directory ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rd-k3****</p>
             */
            public Builder resourceDirectoryId(String resourceDirectoryId) {
                this.resourceDirectoryId = resourceDirectoryId;
                return this;
            }

            /**
             * <p>The status of the member. Valid values:</p>
             * <ul>
             * <li>CreateSuccess: Created.</li>
             * <li>CreateVerifying: Pending creation confirmation.</li>
             * <li>CreateFailed: Creation failed.</li>
             * <li>CreateExpired: Creation expired.</li>
             * <li>CreateCancelled: Creation canceled.</li>
             * <li>PromoteVerifying: Pending upgrade confirmation.</li>
             * <li>PromoteFailed: Upgrade failed.</li>
             * <li>PromoteExpired: Upgrade expired.</li>
             * <li>PromoteCancelled: Upgrade canceled.</li>
             * <li>PromoteSuccess: Upgraded.</li>
             * <li>InviteSuccess: Invited.</li>
             * <li>Removed: Removed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PromoteVerifying</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The type of the member. Valid values:</p>
             * <ul>
             * <li>CloudAccount: Alibaba Cloud account.</li>
             * <li>ResourceAccount: Resource account.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ResourceAccount</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Account build() {
                return new Account(this);
            } 

        } 

    }
}
