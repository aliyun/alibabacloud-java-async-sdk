// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20161111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourceDirectoryAccountResponseBody} extends {@link TeaModel}
 *
 * <p>GetResourceDirectoryAccountResponseBody</p>
 */
public class GetResourceDirectoryAccountResponseBody extends TeaModel {
    @NameInMap("Account")
    private Account account;

    @NameInMap("RequestId")
    private String requestId;

    private GetResourceDirectoryAccountResponseBody(Builder builder) {
        this.account = builder.account;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceDirectoryAccountResponseBody create() {
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
         * Account.
         */
        public Builder account(Account account) {
            this.account = account;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetResourceDirectoryAccountResponseBody build() {
            return new GetResourceDirectoryAccountResponseBody(this);
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

        @NameInMap("IdentityInformation")
        private String identityInformation;

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

        @NameInMap("Type")
        private String type;

        private Account(Builder builder) {
            this.accountId = builder.accountId;
            this.accountName = builder.accountName;
            this.displayName = builder.displayName;
            this.folderId = builder.folderId;
            this.identityInformation = builder.identityInformation;
            this.joinMethod = builder.joinMethod;
            this.joinTime = builder.joinTime;
            this.modifyTime = builder.modifyTime;
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
            private String identityInformation; 
            private String joinMethod; 
            private String joinTime; 
            private String modifyTime; 
            private String resourceDirectoryId; 
            private String status; 
            private String type; 

            /**
             * AccountId.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * AccountName.
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * FolderId.
             */
            public Builder folderId(String folderId) {
                this.folderId = folderId;
                return this;
            }

            /**
             * IdentityInformation.
             */
            public Builder identityInformation(String identityInformation) {
                this.identityInformation = identityInformation;
                return this;
            }

            /**
             * JoinMethod.
             */
            public Builder joinMethod(String joinMethod) {
                this.joinMethod = joinMethod;
                return this;
            }

            /**
             * JoinTime.
             */
            public Builder joinTime(String joinTime) {
                this.joinTime = joinTime;
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
             * Type.
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
