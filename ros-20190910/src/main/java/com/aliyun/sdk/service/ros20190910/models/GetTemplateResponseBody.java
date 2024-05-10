// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>GetTemplateResponseBody</p>
 */
public class GetTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ChangeSetId")
    private String changeSetId;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("Interface")
    private String _interface;

    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.NameInMap("Permissions")
    private java.util.List < Permissions> permissions;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("ShareType")
    private String shareType;

    @com.aliyun.core.annotation.NameInMap("StackGroupName")
    private String stackGroupName;

    @com.aliyun.core.annotation.NameInMap("StackId")
    private String stackId;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List < Tags> tags;

    @com.aliyun.core.annotation.NameInMap("TemplateARN")
    private String templateARN;

    @com.aliyun.core.annotation.NameInMap("TemplateBody")
    private String templateBody;

    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    @com.aliyun.core.annotation.NameInMap("TemplateName")
    private String templateName;

    @com.aliyun.core.annotation.NameInMap("TemplateVersion")
    private String templateVersion;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private String updateTime;

    private GetTemplateResponseBody(Builder builder) {
        this.changeSetId = builder.changeSetId;
        this.createTime = builder.createTime;
        this.description = builder.description;
        this._interface = builder._interface;
        this.ownerId = builder.ownerId;
        this.permissions = builder.permissions;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.shareType = builder.shareType;
        this.stackGroupName = builder.stackGroupName;
        this.stackId = builder.stackId;
        this.tags = builder.tags;
        this.templateARN = builder.templateARN;
        this.templateBody = builder.templateBody;
        this.templateId = builder.templateId;
        this.templateName = builder.templateName;
        this.templateVersion = builder.templateVersion;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTemplateResponseBody create() {
        return builder().build();
    }

    /**
     * @return changeSetId
     */
    public String getChangeSetId() {
        return this.changeSetId;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return _interface
     */
    public String get_interface() {
        return this._interface;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return permissions
     */
    public java.util.List < Permissions> getPermissions() {
        return this.permissions;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return shareType
     */
    public String getShareType() {
        return this.shareType;
    }

    /**
     * @return stackGroupName
     */
    public String getStackGroupName() {
        return this.stackGroupName;
    }

    /**
     * @return stackId
     */
    public String getStackId() {
        return this.stackId;
    }

    /**
     * @return tags
     */
    public java.util.List < Tags> getTags() {
        return this.tags;
    }

    /**
     * @return templateARN
     */
    public String getTemplateARN() {
        return this.templateARN;
    }

    /**
     * @return templateBody
     */
    public String getTemplateBody() {
        return this.templateBody;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * @return templateVersion
     */
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private String changeSetId; 
        private String createTime; 
        private String description; 
        private String _interface; 
        private String ownerId; 
        private java.util.List < Permissions> permissions; 
        private String regionId; 
        private String requestId; 
        private String resourceGroupId; 
        private String shareType; 
        private String stackGroupName; 
        private String stackId; 
        private java.util.List < Tags> tags; 
        private String templateARN; 
        private String templateBody; 
        private String templateId; 
        private String templateName; 
        private String templateVersion; 
        private String updateTime; 

        /**
         * The ID of the change set. This parameter is returned only if you specify ChangeSetId.
         */
        public Builder changeSetId(String changeSetId) {
            this.changeSetId = changeSetId;
            return this;
        }

        /**
         * The time when the template was created. This parameter is returned only if you specify TemplateId.
         * <p>
         * 
         * > - If you specify TemplateVersion, the creation time of the template whose version is specified by TemplateVersion is returned.
         * > - If you do not specify TemplateVersion, the creation time of the template whose version is the default version is returned.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * The description of the template. This parameter is returned only if you specify TemplateId.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * The description of the web UI in the ROS console.
         */
        public Builder _interface(String _interface) {
            this._interface = _interface;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud account to which the template belongs. This parameter is returned only if you specify TemplateId.
         */
        public Builder ownerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        /**
         * Details of the sharing status of the template. This parameter is returned only if you specify TemplateId and set IncludePermission to Enabled.
         * <p>
         * 
         * > - If TemplateVersion is not specified or does not take effect, the details of the sharing status of the template whose version is the default version is returned.
         * > - If TemplateVersion is specified and takes effect, the details of the sharing status of the template whose version is specified by TemplateVersion is returned.
         */
        public Builder permissions(java.util.List < Permissions> permissions) {
            this.permissions = permissions;
            return this;
        }

        /**
         * The region ID of the stack or stack group that uses the template. This parameter is returned only if you specify StackId, ChangeSetId, or StackGroupName.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
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
         * The ID of the resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The sharing type of the template. This parameter is returned only if you specify TemplateId.
         * <p>
         * 
         * Valid values:
         * 
         * *   Private: The template belongs to the template owner.
         * *   Shared: The template is shared by other users.
         */
        public Builder shareType(String shareType) {
            this.shareType = shareType;
            return this;
        }

        /**
         * The name of the stack group. This parameter is returned only if you specify StackGroupName.
         */
        public Builder stackGroupName(String stackGroupName) {
            this.stackGroupName = stackGroupName;
            return this;
        }

        /**
         * The ID of the stack. This parameter is returned only if you specify StackId.
         */
        public Builder stackId(String stackId) {
            this.stackId = stackId;
            return this;
        }

        /**
         * The tags of the template.
         */
        public Builder tags(java.util.List < Tags> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * The Alibaba Cloud Resource Name (ARN) of the template. This parameter is returned only if you specify TemplateId.
         */
        public Builder templateARN(String templateARN) {
            this.templateARN = templateARN;
            return this;
        }

        /**
         * The content of the template.
         */
        public Builder templateBody(String templateBody) {
            this.templateBody = templateBody;
            return this;
        }

        /**
         * The ID of the template. This parameter is returned only if you specify TemplateId.
         * <p>
         * 
         * If the template is a shared template, the value of this parameter is the same as the value of TemplateARN.
         */
        public Builder templateId(String templateId) {
            this.templateId = templateId;
            return this;
        }

        /**
         * The name of the template. This parameter is returned only if you specify TemplateId.
         * <p>
         * 
         * > -   If you specify TemplateVersion, the name of the template whose version is specified by TemplateVersion is returned.
         * > -  If you not specify TemplateVersion, the name of the template whose version is the default version is returned.
         */
        public Builder templateName(String templateName) {
            this.templateName = templateName;
            return this;
        }

        /**
         * The version of the template. This parameter is returned only if you specify TemplateId.\
         * <p>
         * If TemplateVersion is not specified or does not take effect, the default version is used.
         * 
         * If the template is a shared template, this parameter is returned only if you set VersionOption to AllVersions.
         */
        public Builder templateVersion(String templateVersion) {
            this.templateVersion = templateVersion;
            return this;
        }

        /**
         * The time when the template was last updated. This parameter is returned only if you specify TemplateId.
         * <p>
         * 
         * > - If you specify TemplateVersion, the last update time of the template whose version is specified by TemplateVersion is returned.
         * > - If you do not specify TemplateVersion, the last update time of the template whose version is the default version is returned.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public GetTemplateResponseBody build() {
            return new GetTemplateResponseBody(this);
        } 

    } 

    public static class Permissions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("ShareOption")
        private String shareOption;

        @com.aliyun.core.annotation.NameInMap("ShareSource")
        private String shareSource;

        @com.aliyun.core.annotation.NameInMap("TemplateVersion")
        private String templateVersion;

        @com.aliyun.core.annotation.NameInMap("VersionOption")
        private String versionOption;

        private Permissions(Builder builder) {
            this.accountId = builder.accountId;
            this.shareOption = builder.shareOption;
            this.shareSource = builder.shareSource;
            this.templateVersion = builder.templateVersion;
            this.versionOption = builder.versionOption;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Permissions create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return shareOption
         */
        public String getShareOption() {
            return this.shareOption;
        }

        /**
         * @return shareSource
         */
        public String getShareSource() {
            return this.shareSource;
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

        public static final class Builder {
            private String accountId; 
            private String shareOption; 
            private String shareSource; 
            private String templateVersion; 
            private String versionOption; 

            /**
             * The ID of the Alibaba Cloud account with which the template is shared.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * The sharing option.
             * <p>
             * 
             * The value ShareToAccounts indicates that the template is shared with one or more Alibaba Cloud accounts.
             */
            public Builder shareOption(String shareOption) {
                this.shareOption = shareOption;
                return this;
            }

            /**
             * The service that is used for resource sharing. Valid values:
             * <p>
             * 
             * - ROS: Resources are shared from ROS by using the ROS console or calling the ROS API.
             * - ResourceDirectory: Resources are shared with accounts in a resource directory from Resource Management by using the resource sharing feature.
             * > -  The number of accounts with which resources are shared from ROS is independent of the number of accounts with which resources are shared from the resource directory.
             * > -  The shared resources from ROS cannot override or overwrite the shared resources from the resource directory.
             * > -  The shared resources from the resource directory can overwrite the shared resources from ROS.
             */
            public Builder shareSource(String shareSource) {
                this.shareSource = shareSource;
                return this;
            }

            /**
             * The version of the shared template. This parameter is returned only if you set ShareOption to ShareToAccounts and set VersionOption to Specified or Current.
             * <p>
             * 
             * Valid values: v1 to v100.
             */
            public Builder templateVersion(String templateVersion) {
                this.templateVersion = templateVersion;
                return this;
            }

            /**
             * The version option for the shared template. This parameter is returned only if you set ShareOption to ShareToAccounts.
             * <p>
             * 
             * Valid values:
             * 
             * *   AllVersions: All template versions are shared.
             * *   Latest: Only the latest template version is shared. When the version of the template is updated, Resource Orchestration Service (ROS) updates the shared version to the latest version.
             * *   Current: Only the latest template version is shared. When the version of the template is updated, ROS does not update the shared version.
             * *   Specified: Only the specified template version is shared.
             */
            public Builder versionOption(String versionOption) {
                this.versionOption = versionOption;
                return this;
            }

            public Permissions build() {
                return new Permissions(this);
            } 

        } 

    }
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
             * The tag key of the template.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value of the template.
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
}
