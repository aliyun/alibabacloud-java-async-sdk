// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>GetTemplateResponseBody</p>
 */
public class GetTemplateResponseBody extends TeaModel {
    @NameInMap("ChangeSetId")
    private String changeSetId;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("Description")
    private String description;

    @NameInMap("Interface")
    private String _interface;

    @NameInMap("OwnerId")
    private String ownerId;

    @NameInMap("Permissions")
    private java.util.List < Permissions> permissions;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @NameInMap("ShareType")
    private String shareType;

    @NameInMap("StackGroupName")
    private String stackGroupName;

    @NameInMap("StackId")
    private String stackId;

    @NameInMap("Tags")
    private java.util.List < Tags> tags;

    @NameInMap("TemplateARN")
    private String templateARN;

    @NameInMap("TemplateBody")
    private String templateBody;

    @NameInMap("TemplateId")
    private String templateId;

    @NameInMap("TemplateName")
    private String templateName;

    @NameInMap("TemplateVersion")
    private String templateVersion;

    @NameInMap("UpdateTime")
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
         * The ID of the change set. This parameter is returned only if the ChangeSetId parameter is specified.
         */
        public Builder changeSetId(String changeSetId) {
            this.changeSetId = changeSetId;
            return this;
        }

        /**
         * The time when the template was created. This parameter is returned only if the TemplateId parameter is specified.
         * <p>
         * 
         * > 
         * *   If the TemplateVersion parameter is specified, the creation time of the template whose version is specified by using the TemplateVersion parameter is returned.
         * *   If the TemplateVersion parameter is not specified, the creation time of the template whose version is the default version is returned.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * The description of the template. This parameter is returned only if the TemplateId parameter is specified.
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
         * The ID of the Alibaba Cloud account to which the template belongs. This parameter is returned only if the TemplateId parameter is specified.
         */
        public Builder ownerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        /**
         * Details of the sharing status of the template. This parameter is returned only if the TemplateId parameter is specified and the IncludePermission parameter is set to Enabled.
         * <p>
         * 
         * > 
         * *   If the TemplateVersion parameter is not specified or does not take effect, the details of the sharing status of the template whose version is the default version is returned.
         * *   If the TemplateVersion parameter is specified and takes effect, the details of the sharing status of the template whose version is specified by using the TemplateVersion parameter is returned.
         */
        public Builder permissions(java.util.List < Permissions> permissions) {
            this.permissions = permissions;
            return this;
        }

        /**
         * The ID of the region to which the stack or stack group defined in the template belongs. This parameter is returned only if the StackId, ChangeSetId, or StackGroupName parameter is specified.
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
         * The sharing type of the template. This parameter is returned only if the TemplateId parameter is specified.
         * <p>
         * 
         * Valid values:
         * 
         * *   Private: The template can be used only by the template owner.
         * *   Shared: The template is shared with other users.
         */
        public Builder shareType(String shareType) {
            this.shareType = shareType;
            return this;
        }

        /**
         * The name of the stack group. This parameter is returned only if the StackGroupName parameter is specified.
         */
        public Builder stackGroupName(String stackGroupName) {
            this.stackGroupName = stackGroupName;
            return this;
        }

        /**
         * The ID of the stack. This parameter is returned only if the StackId parameter is specified.
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
         * The Alibaba Cloud Resource Name (ARN) of the template. This parameter is returned only if the TemplateId parameter is specified.
         */
        public Builder templateARN(String templateARN) {
            this.templateARN = templateARN;
            return this;
        }

        /**
         * The body of the template.
         */
        public Builder templateBody(String templateBody) {
            this.templateBody = templateBody;
            return this;
        }

        /**
         * The ID of the template. This parameter is returned only if the TemplateId parameter is specified.
         * <p>
         * 
         * If the template is a shared template, the value of this parameter is the same as the value of the TemplateARN parameter.
         */
        public Builder templateId(String templateId) {
            this.templateId = templateId;
            return this;
        }

        /**
         * The name of the template. This parameter is returned only if the TemplateId parameter is specified.
         * <p>
         * 
         * > 
         * *   If the TemplateVersion parameter is specified, the name of the template whose version is specified by using the TemplateVersion parameter is returned.
         * *   If the TemplateVersion parameter is not specified, the name of the template whose version is the default version is returned.
         */
        public Builder templateName(String templateName) {
            this.templateName = templateName;
            return this;
        }

        /**
         * The version of the template. This parameter is returned only if the TemplateId parameter is specified.
         * <p>
         * 
         * If the TemplateVersion parameter is not specified or does not take effect, the value of this parameter is the default version of the template.
         * 
         * If the template is a shared template, this parameter is returned only if the VersionOption parameter is set to AllVersions.
         */
        public Builder templateVersion(String templateVersion) {
            this.templateVersion = templateVersion;
            return this;
        }

        /**
         * The time when the template was last updated. This parameter is returned only if the TemplateId parameter is specified.
         * <p>
         * 
         * > 
         * *   If the TemplateVersion parameter is specified, the last update time of the template whose version is specified by using the TemplateVersion parameter is returned.
         * *   If the TemplateVersion parameter is not specified, the last update time of the template whose version is the default version is returned.
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
        @NameInMap("AccountId")
        private String accountId;

        @NameInMap("ShareOption")
        private String shareOption;

        @NameInMap("ShareSource")
        private String shareSource;

        @NameInMap("TemplateVersion")
        private String templateVersion;

        @NameInMap("VersionOption")
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
             * The value is set to ShareToAccounts, which indicates that the template is shared with one or more Alibaba Cloud accounts.
             */
            public Builder shareOption(String shareOption) {
                this.shareOption = shareOption;
                return this;
            }

            /**
             * The service that is used for resource sharing.
             * <p>
             * 
             * Valid values:
             * 
             * *   ROS: Resources are shared from ROS by using the ROS console or calling the ROS API.
             * *   ResourceDirectory: Resources are shared with accounts in a resource directory from Resource Management by using the resource sharing feature.
             * 
             * > 
             * *   The number of accounts with which resources are shared from ROS is independent of the number of accounts with which resources are shared from the resource directory.
             * *   The shared resources from ROS cannot override or overwrite the shared resources from the resource directory.
             * *   The shared resources from the resource directory can overwrite the shared resources from ROS.
             */
            public Builder shareSource(String shareSource) {
                this.shareSource = shareSource;
                return this;
            }

            /**
             * The version of the shared template. This parameter is returned only if the ShareOption parameter is set to ShareToAccounts and the VersionOption parameter is set to Specified or Current.
             * <p>
             * 
             * Valid values: v1 to v100.
             */
            public Builder templateVersion(String templateVersion) {
                this.templateVersion = templateVersion;
                return this;
            }

            /**
             * The version option for the shared template. This parameter is returned only if the ShareOption parameter is set to ShareToAccounts.
             * <p>
             * 
             * Valid values:
             * 
             * *   AllVersions: All template versions are shared.
             * *   Latest: Only the latest template version is shared. When the version of the template is updated, ROS updates the shared version to the latest version.
             * *   Current: Only the default template version when you configure template sharing is shared. When the version of the template is updated, ROS does not update the shared version.
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

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
