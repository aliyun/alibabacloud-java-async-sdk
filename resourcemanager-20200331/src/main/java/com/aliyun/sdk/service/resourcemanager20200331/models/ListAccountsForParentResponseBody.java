// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAccountsForParentResponseBody} extends {@link TeaModel}
 *
 * <p>ListAccountsForParentResponseBody</p>
 */
public class ListAccountsForParentResponseBody extends TeaModel {
    @NameInMap("Accounts")
    private Accounts accounts;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListAccountsForParentResponseBody(Builder builder) {
        this.accounts = builder.accounts;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAccountsForParentResponseBody create() {
        return builder().build();
    }

    /**
     * @return accounts
     */
    public Accounts getAccounts() {
        return this.accounts;
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
        private Accounts accounts; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The information of the members.
         */
        public Builder accounts(Accounts accounts) {
            this.accounts = accounts;
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

        public ListAccountsForParentResponseBody build() {
            return new ListAccountsForParentResponseBody(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
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

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("Tag")
        private java.util.List < Tag> tag;

        private Tags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List < Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List < Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List < Tag> tag) {
                this.tag = tag;
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

        @NameInMap("ResourceDirectoryId")
        private String resourceDirectoryId;

        @NameInMap("Status")
        private String status;

        @NameInMap("Tags")
        private Tags tags;

        @NameInMap("Type")
        private String type;

        private Account(Builder builder) {
            this.accountId = builder.accountId;
            this.displayName = builder.displayName;
            this.folderId = builder.folderId;
            this.joinMethod = builder.joinMethod;
            this.joinTime = builder.joinTime;
            this.modifyTime = builder.modifyTime;
            this.resourceDirectoryId = builder.resourceDirectoryId;
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
         * @return tags
         */
        public Tags getTags() {
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
            private String displayName; 
            private String folderId; 
            private String joinMethod; 
            private String joinTime; 
            private String modifyTime; 
            private String resourceDirectoryId; 
            private String status; 
            private Tags tags; 
            private String type; 

            /**
             * The Alibaba Cloud account ID of the member.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
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
             * The ID of the folder.
             */
            public Builder folderId(String folderId) {
                this.folderId = folderId;
                return this;
            }

            /**
             * The way in which the member joins the resource directory.
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
             * The time when the member joined the resource directory. The time is displayed in UTC.
             */
            public Builder joinTime(String joinTime) {
                this.joinTime = joinTime;
                return this;
            }

            /**
             * The time when the member was modified. The time is displayed in UTC.
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
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The type of the member.
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
    public static class Accounts extends TeaModel {
        @NameInMap("Account")
        private java.util.List < Account> account;

        private Accounts(Builder builder) {
            this.account = builder.account;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Accounts create() {
            return builder().build();
        }

        /**
         * @return account
         */
        public java.util.List < Account> getAccount() {
            return this.account;
        }

        public static final class Builder {
            private java.util.List < Account> account; 

            /**
             * Account.
             */
            public Builder account(java.util.List < Account> account) {
                this.account = account;
                return this;
            }

            public Accounts build() {
                return new Accounts(this);
            } 

        } 

    }
}
