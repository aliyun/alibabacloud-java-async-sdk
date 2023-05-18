// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResendPromoteResourceAccountEmailResponseBody} extends {@link TeaModel}
 *
 * <p>ResendPromoteResourceAccountEmailResponseBody</p>
 */
public class ResendPromoteResourceAccountEmailResponseBody extends TeaModel {
    @NameInMap("Account")
    private Account account;

    @NameInMap("RequestId")
    private String requestId;

    private ResendPromoteResourceAccountEmailResponseBody(Builder builder) {
        this.account = builder.account;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResendPromoteResourceAccountEmailResponseBody create() {
        return builder().build();
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

        /**
         * The information of the member account.
         */
        public Builder account(Account account) {
            this.account = account;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ResendPromoteResourceAccountEmailResponseBody build() {
            return new ResendPromoteResourceAccountEmailResponseBody(this);
        } 

    } 

    public static class Account extends TeaModel {
        @NameInMap("AccountId")
        private String accountId;

        @NameInMap("AccountName")
        private String accountName;

        @NameInMap("DisplayName")
        private String displayName;

        @NameInMap("FolderId")
        private String folderId;

        @NameInMap("JoinMethod")
        private String joinMethod;

        @NameInMap("JoinTime")
        private String joinTime;

        @NameInMap("ModifyTime")
        private String modifyTime;

        @NameInMap("RecordId")
        private String recordId;

        @NameInMap("ResourceDirectoryId")
        private String resourceDirectoryId;

        @NameInMap("Status")
        private String status;

        @NameInMap("Type")
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

            /**
             * The ID of the account.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * The name of the account.
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * The display name of the member account.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * The ID of the folder.
             */
            public Builder folderId(String folderId) {
                this.folderId = folderId;
                return this;
            }

            /**
             * The way in which the member account joined the resource directory. Valid values:
             * <p>
             * 
             * *   invited: The member account is invited to join the resource directory.
             * *   created: The member account is directly created in the resource directory.
             */
            public Builder joinMethod(String joinMethod) {
                this.joinMethod = joinMethod;
                return this;
            }

            /**
             * The time when the member account joined the resource directory.
             */
            public Builder joinTime(String joinTime) {
                this.joinTime = joinTime;
                return this;
            }

            /**
             * The time when the member account was modified.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * The account record ID.
             */
            public Builder recordId(String recordId) {
                this.recordId = recordId;
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
             * The status of the member account. Valid values:
             * <p>
             * 
             * *   CreateSuccess: The member account is created.
             * *   CreateVerifying: The creation of the member account is under confirmation.
             * *   CreateFailed: The member account failed to be created.
             * *   CreateExpired: The creation of the member account expired.
             * *   CreateCancelled: The creation of the member account is canceled.
             * *   PromoteVerifying: The upgrade of the member account is under confirmation.
             * *   PromoteFailed: The member account failed to be upgraded.
             * *   PromoteExpired: The upgrade of the member account expired.
             * *   PromoteCancelled: The upgrade of the member account is canceled.
             * *   PromoteSuccess: The member account is upgraded.
             * *   InviteSuccess: The owner of the member account accepted the invitation.
             * *   Removed: The member account is removed from the resource directory.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The type of the member account. Valid values:
             * <p>
             * 
             * *   CloudAccount: cloud account
             * *   ResourceAccount: resource account
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
