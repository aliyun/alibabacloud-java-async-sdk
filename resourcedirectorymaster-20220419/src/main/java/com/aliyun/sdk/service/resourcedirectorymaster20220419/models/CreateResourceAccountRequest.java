// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateResourceAccountRequest} extends {@link RequestModel}
 *
 * <p>CreateResourceAccountRequest</p>
 */
public class CreateResourceAccountRequest extends Request {
    @Query
    @NameInMap("AccountNamePrefix")
    private String accountNamePrefix;

    @Query
    @NameInMap("DisplayName")
    @Validation(required = true)
    private String displayName;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("ParentFolderId")
    private String parentFolderId;

    @Query
    @NameInMap("PayerAccountId")
    private String payerAccountId;

    @Query
    @NameInMap("ResellAccountType")
    private String resellAccountType;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    private CreateResourceAccountRequest(Builder builder) {
        super(builder);
        this.accountNamePrefix = builder.accountNamePrefix;
        this.displayName = builder.displayName;
        this.dryRun = builder.dryRun;
        this.parentFolderId = builder.parentFolderId;
        this.payerAccountId = builder.payerAccountId;
        this.resellAccountType = builder.resellAccountType;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateResourceAccountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountNamePrefix
     */
    public String getAccountNamePrefix() {
        return this.accountNamePrefix;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return parentFolderId
     */
    public String getParentFolderId() {
        return this.parentFolderId;
    }

    /**
     * @return payerAccountId
     */
    public String getPayerAccountId() {
        return this.payerAccountId;
    }

    /**
     * @return resellAccountType
     */
    public String getResellAccountType() {
        return this.resellAccountType;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<CreateResourceAccountRequest, Builder> {
        private String accountNamePrefix; 
        private String displayName; 
        private Boolean dryRun; 
        private String parentFolderId; 
        private String payerAccountId; 
        private String resellAccountType; 
        private java.util.List < Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(CreateResourceAccountRequest request) {
            super(request);
            this.accountNamePrefix = request.accountNamePrefix;
            this.displayName = request.displayName;
            this.dryRun = request.dryRun;
            this.parentFolderId = request.parentFolderId;
            this.payerAccountId = request.payerAccountId;
            this.resellAccountType = request.resellAccountType;
            this.tag = request.tag;
        } 

        /**
         * The prefix for the Alibaba Cloud account name of the member. If you leave this parameter empty, the system randomly generates a prefix.
         * <p>
         * 
         * The prefix must be 2 to 37 characters in length.
         * 
         * The prefix can contain letters, digits, and special characters but cannot contain consecutive special characters. The prefix must start with a letter or digit and end with a letter or digit. Valid special characters include underscores (`_`), periods (.), and hyphens (`-`).
         * 
         * The complete Alibaba Cloud account name of a member in a resource directory is in the @.aliyunid.com format, such as `alice@rd-3G****.aliyunid.com`.
         * 
         * Each name must be unique in the resource directory.
         */
        public Builder accountNamePrefix(String accountNamePrefix) {
            this.putQueryParameter("AccountNamePrefix", accountNamePrefix);
            this.accountNamePrefix = accountNamePrefix;
            return this;
        }

        /**
         * The display name of the member.
         * <p>
         * 
         * The name must be 2 to 50 characters in length.
         * 
         * The name can contain letters, digits, underscores (\_), periods (.), hyphens (-), and spaces.
         * 
         * The name must be unique in the resource directory.
         */
        public Builder displayName(String displayName) {
            this.putQueryParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * The ID of the parent folder.
         */
        public Builder parentFolderId(String parentFolderId) {
            this.putQueryParameter("ParentFolderId", parentFolderId);
            this.parentFolderId = parentFolderId;
            return this;
        }

        /**
         * The ID of the billing account. If you leave this parameter empty, the member is used as its own billing account.
         */
        public Builder payerAccountId(String payerAccountId) {
            this.putQueryParameter("PayerAccountId", payerAccountId);
            this.payerAccountId = payerAccountId;
            return this;
        }

        /**
         * The identity type of the member. Valid values:
         * <p>
         * 
         * *   resell: The member is an account for a reseller. This is the default value. A relationship is automatically established between the member and the reseller. The management account of the resource directory must be used as the billing account of the member.
         * *   non_resell: The member is not an account for a reseller. The member is an account that is not associated with a reseller. You can directly use the account to purchase Alibaba Cloud resources. The member is used as its own billing account.
         * 
         * > This parameter is available only for resellers at the international site (alibabacloud.com).
         */
        public Builder resellAccountType(String resellAccountType) {
            this.putQueryParameter("ResellAccountType", resellAccountType);
            this.resellAccountType = resellAccountType;
            return this;
        }

        /**
         * The tag of the member.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public CreateResourceAccountRequest build() {
            return new CreateResourceAccountRequest(this);
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
             * The key of the tag.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the tag.
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
}
