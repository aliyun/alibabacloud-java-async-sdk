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
 * {@link GetAccountResponseBody} extends {@link TeaModel}
 *
 * <p>GetAccountResponseBody</p>
 */
public class GetAccountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Account")
    private Account account;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The information about the member.</p>
         */
        public Builder account(Account account) {
            this.account = account;
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

        public GetAccountResponseBody build() {
            return new GetAccountResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAccountResponseBody} extends {@link TeaModel}
     *
     * <p>GetAccountResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>tag_key</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>tag_value</p>
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
    /**
     * 
     * {@link GetAccountResponseBody} extends {@link TeaModel}
     *
     * <p>GetAccountResponseBody</p>
     */
    public static class Account extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("AccountName")
        private String accountName;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("EmailStatus")
        private String emailStatus;

        @com.aliyun.core.annotation.NameInMap("FolderId")
        private String folderId;

        @com.aliyun.core.annotation.NameInMap("HasSecureMobilePhone")
        private Boolean hasSecureMobilePhone;

        @com.aliyun.core.annotation.NameInMap("IdentityInformation")
        private String identityInformation;

        @com.aliyun.core.annotation.NameInMap("JoinMethod")
        private String joinMethod;

        @com.aliyun.core.annotation.NameInMap("JoinTime")
        private String joinTime;

        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("ResourceDirectoryId")
        private String resourceDirectoryId;

        @com.aliyun.core.annotation.NameInMap("ResourceDirectoryPath")
        private String resourceDirectoryPath;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Account(Builder builder) {
            this.accountId = builder.accountId;
            this.accountName = builder.accountName;
            this.displayName = builder.displayName;
            this.emailStatus = builder.emailStatus;
            this.folderId = builder.folderId;
            this.hasSecureMobilePhone = builder.hasSecureMobilePhone;
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
         * @return hasSecureMobilePhone
         */
        public Boolean getHasSecureMobilePhone() {
            return this.hasSecureMobilePhone;
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
        public java.util.List<Tags> getTags() {
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
            private Boolean hasSecureMobilePhone; 
            private String identityInformation; 
            private String joinMethod; 
            private String joinTime; 
            private String location; 
            private String modifyTime; 
            private String resourceDirectoryId; 
            private String resourceDirectoryPath; 
            private String status; 
            private java.util.List<Tags> tags; 
            private String type; 

            /**
             * <p>The Alibaba Cloud account ID of the member.</p>
             * 
             * <strong>example:</strong>
             * <p>181761095690****</p>
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The Alibaba Cloud account name of the member.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:someone@example.com">someone@example.com</a></p>
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * <p>The display name of the member.</p>
             * 
             * <strong>example:</strong>
             * <p>admin</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The status of the modification for the email address bound to the member. Valid values:</p>
             * <ul>
             * <li>If the value of this parameter is empty, no modification is performed for the email address.</li>
             * <li>WAIT_MODIFY: The modification is being performed.</li>
             * <li>CANCELLED: The modification is canceled.</li>
             * <li>EXPIRED: The modification expires.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>WAIT_MODIFY</p>
             */
            public Builder emailStatus(String emailStatus) {
                this.emailStatus = emailStatus;
                return this;
            }

            /**
             * <p>The ID of the folder.</p>
             * 
             * <strong>example:</strong>
             * <p>fd-bVaRIG****</p>
             */
            public Builder folderId(String folderId) {
                this.folderId = folderId;
                return this;
            }

            /**
             * <p>Indicates whether a mobile phone number is bound to the member for security purposes. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hasSecureMobilePhone(Boolean hasSecureMobilePhone) {
                this.hasSecureMobilePhone = hasSecureMobilePhone;
                return this;
            }

            /**
             * <p>The real-name verification information.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyun-admin</p>
             */
            public Builder identityInformation(String identityInformation) {
                this.identityInformation = identityInformation;
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
             * <p>The time when the member joined the resource directory.</p>
             * 
             * <strong>example:</strong>
             * <p>2015-01-23T12:33:18Z</p>
             */
            public Builder joinTime(String joinTime) {
                this.joinTime = joinTime;
                return this;
            }

            /**
             * <p>The location of the member in the resource directory.</p>
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * <p>The time when the member was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2015-01-23T12:33:18Z</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The ID of the resource directory.</p>
             * 
             * <strong>example:</strong>
             * <p>rd-k3****</p>
             */
            public Builder resourceDirectoryId(String resourceDirectoryId) {
                this.resourceDirectoryId = resourceDirectoryId;
                return this;
            }

            /**
             * <p>The path of the member in the resource directory.</p>
             */
            public Builder resourceDirectoryPath(String resourceDirectoryPath) {
                this.resourceDirectoryPath = resourceDirectoryPath;
                return this;
            }

            /**
             * <p>The status of the member. Valid values:</p>
             * <ul>
             * <li>CreateSuccess: The member is created.</li>
             * <li>PromoteVerifying: The upgrade of the member is being confirmed.</li>
             * <li>PromoteFailed: The upgrade of the member fails.</li>
             * <li>PromoteExpired: The upgrade of the member expires.</li>
             * <li>PromoteCancelled: The upgrade of the member is canceled.</li>
             * <li>PromoteSuccess: The member is upgraded.</li>
             * <li>InviteSuccess: The member accepts the invitation.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CreateSuccess</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tags of the member.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The type of the member. Valid values:</p>
             * <ul>
             * <li>CloudAccount: cloud account</li>
             * <li>ResourceAccount: resource account</li>
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
