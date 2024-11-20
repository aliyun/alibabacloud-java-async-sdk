// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SetTemplatePermissionRequest} extends {@link RequestModel}
 *
 * <p>SetTemplatePermissionRequest</p>
 */
public class SetTemplatePermissionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > accountIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShareOption")
    @com.aliyun.core.annotation.Validation(required = true)
    private String shareOption;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateVersion")
    private String templateVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VersionOption")
    private String versionOption;

    private SetTemplatePermissionRequest(Builder builder) {
        super(builder);
        this.accountIds = builder.accountIds;
        this.shareOption = builder.shareOption;
        this.templateId = builder.templateId;
        this.templateVersion = builder.templateVersion;
        this.versionOption = builder.versionOption;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetTemplatePermissionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountIds
     */
    public java.util.List < String > getAccountIds() {
        return this.accountIds;
    }

    /**
     * @return shareOption
     */
    public String getShareOption() {
        return this.shareOption;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return templateVersion
     */
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    /**
     * @return versionOption
     */
    public String getVersionOption() {
        return this.versionOption;
    }

    public static final class Builder extends Request.Builder<SetTemplatePermissionRequest, Builder> {
        private java.util.List < String > accountIds; 
        private String shareOption; 
        private String templateId; 
        private String templateVersion; 
        private String versionOption; 

        private Builder() {
            super();
        } 

        private Builder(SetTemplatePermissionRequest request) {
            super(request);
            this.accountIds = request.accountIds;
            this.shareOption = request.shareOption;
            this.templateId = request.templateId;
            this.templateVersion = request.templateVersion;
            this.versionOption = request.versionOption;
        } 

        /**
         * <p>The Alibaba Cloud accounts with or from which you want to share or unshare the template.<br>Valid values of N: 1, 2, 3, 4, and 5.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter cannot be set to the ID of the Alibaba Cloud account that owns the template, or the RAM users of this Alibaba Cloud account.</li>
         * <li>When ShareOption is set to CancelSharing, you can unshare the template from all the specified Alibaba Cloud accounts by using an asterisk (*).</li>
         * </ul>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        public Builder accountIds(java.util.List < String > accountIds) {
            this.putQueryParameter("AccountIds", accountIds);
            this.accountIds = accountIds;
            return this;
        }

        /**
         * <p>The sharing option.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>ShareToAccounts: shares the template with other Alibaba Cloud accounts.</li>
         * <li>CancelSharing: unshares the template.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ShareToAccounts</p>
         */
        public Builder shareOption(String shareOption) {
            this.putQueryParameter("ShareOption", shareOption);
            this.shareOption = shareOption;
            return this;
        }

        /**
         * <p>The ID of the template.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5ecd1e10-b0e9-4389-a565-e4c15efc****</p>
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>The version of the shared template. This parameter takes effect only if you set ShareOption to ShareToAccounts and set VersionOption to Specified.</p>
         * <p>Valid values: v1 to v100.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        public Builder templateVersion(String templateVersion) {
            this.putQueryParameter("TemplateVersion", templateVersion);
            this.templateVersion = templateVersion;
            return this;
        }

        /**
         * <p>The version option for the shared template. This parameter takes effect only if you set ShareOption to ShareToAccounts.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>AllVersions (default): shares all versions of the template.</li>
         * <li>Latest: shares only the latest version of template. When the version of the template is updated, ROS updates the shared version to the latest version.</li>
         * <li>Current: shares only the current version of the template. When the version of the template is updated, ROS does not update the shared version.</li>
         * <li>Specified: shares only the specified version of the template.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Specified</p>
         */
        public Builder versionOption(String versionOption) {
            this.putQueryParameter("VersionOption", versionOption);
            this.versionOption = versionOption;
            return this;
        }

        @Override
        public SetTemplatePermissionRequest build() {
            return new SetTemplatePermissionRequest(this);
        } 

    } 

}
