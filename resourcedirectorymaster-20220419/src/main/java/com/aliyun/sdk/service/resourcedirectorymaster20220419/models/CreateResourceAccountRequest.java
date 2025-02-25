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
 * {@link CreateResourceAccountRequest} extends {@link RequestModel}
 *
 * <p>CreateResourceAccountRequest</p>
 */
public class CreateResourceAccountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountNamePrefix")
    private String accountNamePrefix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DisplayName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String displayName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentFolderId")
    private String parentFolderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayerAccountId")
    private String payerAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResellAccountType")
    private String resellAccountType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

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
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<CreateResourceAccountRequest, Builder> {
        private String accountNamePrefix; 
        private String displayName; 
        private Boolean dryRun; 
        private String parentFolderId; 
        private String payerAccountId; 
        private String resellAccountType; 
        private java.util.List<Tag> tag; 

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
         * <p>The prefix for the Alibaba Cloud account name of the member. If you leave this parameter empty, the system randomly generates a prefix.</p>
         * <p>The prefix must be 2 to 37 characters in length.</p>
         * <p>The prefix can contain letters, digits, and special characters but cannot contain consecutive special characters. The prefix must start with a letter or digit and end with a letter or digit. Valid special characters include underscores (<code>_</code>), periods (.), and hyphens (<code>-</code>).</p>
         * <p>The complete Alibaba Cloud account name of a member in a resource directory is in the @.aliyunid.com format, such as <code>alice@rd-3G****.aliyunid.com</code>.</p>
         * <p>Each name must be unique in the resource directory.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        public Builder accountNamePrefix(String accountNamePrefix) {
            this.putQueryParameter("AccountNamePrefix", accountNamePrefix);
            this.accountNamePrefix = accountNamePrefix;
            return this;
        }

        /**
         * <p>The display name of the member.</p>
         * <p>The name must be 2 to 50 characters in length.</p>
         * <p>The name can contain letters, digits, underscores (_), periods (.), hyphens (-), and spaces.</p>
         * <p>The name must be unique in the resource directory.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Dev</p>
         */
        public Builder displayName(String displayName) {
            this.putQueryParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
         * <ul>
         * <li>true: performs only a dry run. The system checks whether an identity type can be specified for the member. If the request does not pass the dry run, an error code is returned.</li>
         * <li>false (default): performs a dry run and performs the actual request.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The ID of the parent folder.</p>
         * 
         * <strong>example:</strong>
         * <p>fd-r23M55****</p>
         */
        public Builder parentFolderId(String parentFolderId) {
            this.putQueryParameter("ParentFolderId", parentFolderId);
            this.parentFolderId = parentFolderId;
            return this;
        }

        /**
         * <p>The ID of the billing account. If you leave this parameter empty, the newly created member is used as its billing account.</p>
         * 
         * <strong>example:</strong>
         * <p>12323344****</p>
         */
        public Builder payerAccountId(String payerAccountId) {
            this.putQueryParameter("PayerAccountId", payerAccountId);
            this.payerAccountId = payerAccountId;
            return this;
        }

        /**
         * <p>The identity type of the member. Valid values:</p>
         * <ul>
         * <li>resell: The member is an account for a reseller. This is the default value. A relationship is automatically established between the member and the reseller. The management account of the resource directory must be used as the billing account of the member.</li>
         * <li>non_resell: The member is not an account for a reseller. The member is an account that is not associated with a reseller. You can directly use the account to purchase Alibaba Cloud resources. The member is used as its own billing account.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is available only for resellers at the international site (alibabacloud.com).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>resell</p>
         */
        public Builder resellAccountType(String resellAccountType) {
            this.putQueryParameter("ResellAccountType", resellAccountType);
            this.resellAccountType = resellAccountType;
            return this;
        }

        /**
         * <p>The tag of the member.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public CreateResourceAccountRequest build() {
            return new CreateResourceAccountRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateResourceAccountRequest} extends {@link TeaModel}
     *
     * <p>CreateResourceAccountRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The key of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>k1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
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
