// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAccountResponseBody} extends {@link TeaModel}
 *
 * <p>GetAccountResponseBody</p>
 */
public class GetAccountResponseBody extends TeaModel {
    @NameInMap("Account")
    private Account account;

    @NameInMap("RequestId")
    private String requestId;

    private GetAccountResponseBody(Builder builder) {
        this.account = builder.account;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccountResponseBody create() {
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
         * The information of the member.
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

        public GetAccountResponseBody build() {
            return new GetAccountResponseBody(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * A tag key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * A tag value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class Account extends TeaModel {
        @NameInMap("AccountId")
        private String accountId;

        @NameInMap("AccountName")
        private String accountName;

        @NameInMap("DisplayName")
        private String displayName;

        @NameInMap("EmailStatus")
        private String emailStatus;

        @NameInMap("FolderId")
        private String folderId;

        @NameInMap("IdentityInformation")
        private String identityInformation;

        @NameInMap("JoinMethod")
        private String joinMethod;

        @NameInMap("JoinTime")
        private String joinTime;

        @NameInMap("Location")
        private String location;

        @NameInMap("ModifyTime")
        private String modifyTime;

        @NameInMap("ResourceDirectoryId")
        private String resourceDirectoryId;

        @NameInMap("ResourceDirectoryPath")
        private String resourceDirectoryPath;

        @NameInMap("Status")
        private String status;

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

        @NameInMap("Type")
        private String type;

        private Account(Builder builder) {
            this.accountId = builder.accountId;
            this.accountName = builder.accountName;
            this.displayName = builder.displayName;
            this.emailStatus = builder.emailStatus;
            this.folderId = builder.folderId;
            this.identityInformation = builder.identityInformation;
            this.joinMethod = builder.joinMethod;
            this.joinTime = builder.joinTime;
            this.location = builder.location;
            this.modifyTime = builder.modifyTime;
            this.resourceDirectoryId = builder.resourceDirectoryId;
            this.resourceDirectoryPath = builder.resourceDirectoryPath;
            this.status = builder.status;
            this.tags = builder.tags;
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
         * @return emailStatus
         */
        public String getEmailStatus() {
            return this.emailStatus;
        }

        /**
         * @return folderId
         */
        public String getFolderId() {
            return this.folderId;
        }

        /**
         * @return identityInformation
         */
        public String getIdentityInformation() {
            return this.identityInformation;
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
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return resourceDirectoryId
         */
        public String getResourceDirectoryId() {
            return this.resourceDirectoryId;
        }

        /**
         * @return resourceDirectoryPath
         */
        public String getResourceDirectoryPath() {
            return this.resourceDirectoryPath;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
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
            private String emailStatus; 
            private String folderId; 
            private String identityInformation; 
            private String joinMethod; 
            private String joinTime; 
            private String location; 
            private String modifyTime; 
            private String resourceDirectoryId; 
            private String resourceDirectoryPath; 
            private String status; 
            private java.util.List < Tags> tags; 
            private String type; 

            /**
             * The Alibaba Cloud account ID of the member.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * The Alibaba Cloud account name of the member.
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * The display name of the member.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * The status of the modification for the email address bound to the member. Valid values:
             * <p>
             * 
             * *   WAIT_MODIFY: in progress
             * *   CANCELLED: canceled
             * *   EXPIRED: expired
             * 
             * If the value of this parameter is empty, no modification is performed for the email address.
             */
            public Builder emailStatus(String emailStatus) {
                this.emailStatus = emailStatus;
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
             * The real-name verification information.
             */
            public Builder identityInformation(String identityInformation) {
                this.identityInformation = identityInformation;
                return this;
            }

            /**
             * The way in which the member joins the resource directory. Valid values:
             * <p>
             * 
             * *   invited: The member is invited to join the resource directory.
             * *   created: The member is directly created in the resource directory.
             */
            public Builder joinMethod(String joinMethod) {
                this.joinMethod = joinMethod;
                return this;
            }

            /**
             * The time when the member joined the resource directory.
             */
            public Builder joinTime(String joinTime) {
                this.joinTime = joinTime;
                return this;
            }

            /**
             * The location of the member in the resource directory.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * The time when the member was modified.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
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
             * The path of the member in the resource directory.
             */
            public Builder resourceDirectoryPath(String resourceDirectoryPath) {
                this.resourceDirectoryPath = resourceDirectoryPath;
                return this;
            }

            /**
             * The status of the member. Valid values:
             * <p>
             * 
             * *   CreateSuccess: The member is created.
             * *   PromoteVerifying: The upgrade of the member is being confirmed.
             * *   PromoteFailed: The upgrade of the member fails.
             * *   PromoteExpired: The upgrade of the member expires.
             * *   PromoteCancelled: The upgrade of the member is canceled.
             * *   PromoteSuccess: The member is upgraded.
             * *   InviteSuccess: The member accepts the invitation.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The tags that are added to the member.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The type of the member. Valid values:
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
