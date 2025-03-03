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
 * {@link CreateResourceAccountResponseBody} extends {@link TeaModel}
 *
 * <p>CreateResourceAccountResponseBody</p>
 */
public class CreateResourceAccountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Account")
    private Account account;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateResourceAccountResponseBody(Builder builder) {
        this.account = builder.account;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateResourceAccountResponseBody create() {
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
         * <p>The information about the member.</p>
         */
        public Builder account(Account account) {
            this.account = account;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B356A415-D860-43E5-865A-E2193D62BBD6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateResourceAccountResponseBody build() {
            return new CreateResourceAccountResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateResourceAccountResponseBody} extends {@link TeaModel}
     *
     * <p>CreateResourceAccountResponseBody</p>
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
            private String resourceDirectoryId; 
            private String status; 
            private String type; 

            /**
             * <p>The ID of the member.</p>
             * 
             * <strong>example:</strong>
             * <p>112730938585****</p>
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The Alibaba Cloud account ID of the member.</p>
             * 
             * <strong>example:</strong>
             * <p>alice@rd-3g****.aliyunid.com</p>
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * <p>The display name of the member.</p>
             * 
             * <strong>example:</strong>
             * <p>Dev</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The ID of the folder.</p>
             * 
             * <strong>example:</strong>
             * <p>fd-r23M55****</p>
             */
            public Builder folderId(String folderId) {
                this.folderId = folderId;
                return this;
            }

            /**
             * <p>The way in which the member joins the resource directory. Valid values:</p>
             * <ul>
             * <li>invited: The member is invited to join the resource directory.</li>
             * <li>created: The member is directly created in the resource directory.</li>
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
             * <p>The time when the member joined the resource directory. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-12-31T03:37:39.456Z</p>
             */
            public Builder joinTime(String joinTime) {
                this.joinTime = joinTime;
                return this;
            }

            /**
             * <p>The time when the member was modified. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-12-31T03:37:39.456Z</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The ID of the resource directory.</p>
             * 
             * <strong>example:</strong>
             * <p>rd-3G****</p>
             */
            public Builder resourceDirectoryId(String resourceDirectoryId) {
                this.resourceDirectoryId = resourceDirectoryId;
                return this;
            }

            /**
             * <p>The status of the member. The value CreateSuccess indicates that the member is created.</p>
             * 
             * <strong>example:</strong>
             * <p>CreateSuccess</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The type of the member. The value ResourceAccount indicates that the member is a resource account.</p>
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
