// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

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
 * {@link GetTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>GetTemplateResponseBody</p>
 */
public class GetTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AdditionalInfo")
    private java.util.Map<String, ?> additionalInfo;

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
    private java.util.List<Permissions> permissions;

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
    private java.util.List<Tags> tags;

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
        this.additionalInfo = builder.additionalInfo;
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return additionalInfo
     */
    public java.util.Map<String, ?> getAdditionalInfo() {
        return this.additionalInfo;
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
    public java.util.List<Permissions> getPermissions() {
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
    public java.util.List<Tags> getTags() {
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
        private java.util.Map<String, ?> additionalInfo; 
        private String changeSetId; 
        private String createTime; 
        private String description; 
        private String _interface; 
        private String ownerId; 
        private java.util.List<Permissions> permissions; 
        private String regionId; 
        private String requestId; 
        private String resourceGroupId; 
        private String shareType; 
        private String stackGroupName; 
        private String stackId; 
        private java.util.List<Tags> tags; 
        private String templateARN; 
        private String templateBody; 
        private String templateId; 
        private String templateName; 
        private String templateVersion; 
        private String updateTime; 

        private Builder() {
        } 

        private Builder(GetTemplateResponseBody model) {
            this.additionalInfo = model.additionalInfo;
            this.changeSetId = model.changeSetId;
            this.createTime = model.createTime;
            this.description = model.description;
            this._interface = model._interface;
            this.ownerId = model.ownerId;
            this.permissions = model.permissions;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.resourceGroupId = model.resourceGroupId;
            this.shareType = model.shareType;
            this.stackGroupName = model.stackGroupName;
            this.stackId = model.stackId;
            this.tags = model.tags;
            this.templateARN = model.templateARN;
            this.templateBody = model.templateBody;
            this.templateId = model.templateId;
            this.templateName = model.templateName;
            this.templateVersion = model.templateVersion;
            this.updateTime = model.updateTime;
        } 

        /**
         * <p>Supplementary information for the public template.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;DeploymentDuration&quot;:null,&quot;Title&quot;:&quot;Self-Built_ElasticSearch_Snapshot_Saved_To_OSS&quot;,&quot;Labels&quot;:{&quot;ResourceTypes&quot;:[&quot;ALIYUN::ECS::Instance&quot;,&quot;ALIYUN::ECS::SecurityGroup&quot;,&quot;ALIYUN::ECS::VPC&quot;,&quot;ALIYUN::ECS::VSwitch&quot;,&quot;ALIYUN::OSS::Bucket&quot;,&quot;ALIYUN::ROS::WaitCondition&quot;,&quot;ALIYUN::ROS::WaitConditionHandle&quot;],&quot;DeployTypes&quot;:[&quot;ROS&quot;],&quot;ApplicationScenes&quot;:[&quot;其他&quot;]},&quot;Provider&quot;:&quot;ROS&quot;,&quot;Categories&quot;:[&quot;Solution&quot;]}</p>
         */
        public Builder additionalInfo(java.util.Map<String, ?> additionalInfo) {
            this.additionalInfo = additionalInfo;
            return this;
        }

        /**
         * <p>The ID of the change set. This parameter is returned only if you specify ChangeSetId.</p>
         * 
         * <strong>example:</strong>
         * <p>e85abe0c-6528-43fb-ae93-fdf8de22****</p>
         */
        public Builder changeSetId(String changeSetId) {
            this.changeSetId = changeSetId;
            return this;
        }

        /**
         * <p>The time when the template was created. This parameter is returned only if you specify TemplateId.</p>
         * <blockquote>
         * <ul>
         * <li>If you specify TemplateVersion, the creation time of the template whose version is specified by TemplateVersion is returned.</li>
         * <li>If you do not specify TemplateVersion, the creation time of the template whose version is the default version is returned.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2020-11-18T08:49:26</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The description of the template. This parameter is returned only if you specify TemplateId.</p>
         * 
         * <strong>example:</strong>
         * <p>ROS template for create ECS instance.</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The description of the web UI in the ROS console.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder _interface(String _interface) {
            this._interface = _interface;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account to which the template belongs. This parameter is returned only if you specify TemplateId.</p>
         * 
         * <strong>example:</strong>
         * <p>151266687691****</p>
         */
        public Builder ownerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>Details of the sharing status of the template. This parameter is returned only if you specify TemplateId and set IncludePermission to Enabled.</p>
         * <blockquote>
         * <ul>
         * <li>If TemplateVersion is not specified or does not take effect, the details of the sharing status of the template whose version is the default version is returned.</li>
         * <li>If TemplateVersion is specified and takes effect, the details of the sharing status of the template whose version is specified by TemplateVersion is returned.</li>
         * </ul>
         * </blockquote>
         */
        public Builder permissions(java.util.List<Permissions> permissions) {
            this.permissions = permissions;
            return this;
        }

        /**
         * <p>The region ID of the stack or stack group that uses the template. This parameter is returned only if you specify StackId, ChangeSetId, or StackGroupName.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>B288A0BE-D927-4888-B0F7-B35EF84****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxazb4ph6aiy****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The sharing type of the template. This parameter is returned only if you specify TemplateId.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Private: The template belongs to the template owner.</li>
         * <li>Shared: The template is shared by other users.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Private</p>
         */
        public Builder shareType(String shareType) {
            this.shareType = shareType;
            return this;
        }

        /**
         * <p>The name of the stack group. This parameter is returned only if you specify StackGroupName.</p>
         * 
         * <strong>example:</strong>
         * <p>MyStackGroup</p>
         */
        public Builder stackGroupName(String stackGroupName) {
            this.stackGroupName = stackGroupName;
            return this;
        }

        /**
         * <p>The ID of the stack. This parameter is returned only if you specify StackId.</p>
         * 
         * <strong>example:</strong>
         * <p>4a6c9851-3b0f-4f5f-b4ca-a14bf691****</p>
         */
        public Builder stackId(String stackId) {
            this.stackId = stackId;
            return this;
        }

        /**
         * <p>The tags of the template.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the template. This parameter is returned only if you specify TemplateId.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ros:<em>:151266687691</em><em><strong>:template/a52f81be-496f-4e1c-a286-8852ab54</strong></em>*</p>
         */
        public Builder templateARN(String templateARN) {
            this.templateARN = templateARN;
            return this;
        }

        /**
         * <p>The content of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ROSTemplateFormatVersion&quot;: &quot;2015-09-01&quot;}</p>
         */
        public Builder templateBody(String templateBody) {
            this.templateBody = templateBody;
            return this;
        }

        /**
         * <p>The ID of the template. This parameter is returned only if you specify TemplateId.</p>
         * <p>If the template is a shared template, the value of this parameter is the same as the value of TemplateARN.</p>
         * 
         * <strong>example:</strong>
         * <p>a52f81be-496f-4e1c-a286-8852ab54****</p>
         */
        public Builder templateId(String templateId) {
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>The name of the template. This parameter is returned only if you specify TemplateId.</p>
         * <blockquote>
         * <ul>
         * <li>If you specify TemplateVersion, the name of the template whose version is specified by TemplateVersion is returned.</li>
         * <li>If you not specify TemplateVersion, the name of the template whose version is the default version is returned.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>MyTemplate</p>
         */
        public Builder templateName(String templateName) {
            this.templateName = templateName;
            return this;
        }

        /**
         * <p>The version of the template. This parameter is returned only if you specify TemplateId.<br>If TemplateVersion is not specified or does not take effect, the default version is used.</p>
         * <p>If the template is a shared template, this parameter is returned only if you set VersionOption to AllVersions.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        public Builder templateVersion(String templateVersion) {
            this.templateVersion = templateVersion;
            return this;
        }

        /**
         * <p>The time when the template was last updated. This parameter is returned only if you specify TemplateId.</p>
         * <blockquote>
         * <ul>
         * <li>If you specify TemplateVersion, the last update time of the template whose version is specified by TemplateVersion is returned.</li>
         * <li>If you do not specify TemplateVersion, the last update time of the template whose version is the default version is returned.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2020-12-07T06:11:48</p>
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public GetTemplateResponseBody build() {
            return new GetTemplateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>GetTemplateResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Permissions model) {
                this.accountId = model.accountId;
                this.shareOption = model.shareOption;
                this.shareSource = model.shareSource;
                this.templateVersion = model.templateVersion;
                this.versionOption = model.versionOption;
            } 

            /**
             * <p>The ID of the Alibaba Cloud account with which the template is shared.</p>
             * 
             * <strong>example:</strong>
             * <p>142437958638****</p>
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The sharing option.</p>
             * <p>The value ShareToAccounts indicates that the template is shared with one or more Alibaba Cloud accounts.</p>
             * 
             * <strong>example:</strong>
             * <p>ShareToAccounts</p>
             */
            public Builder shareOption(String shareOption) {
                this.shareOption = shareOption;
                return this;
            }

            /**
             * <p>The service that is used for resource sharing. Valid values:</p>
             * <ul>
             * <li>ROS: Resources are shared from ROS by using the ROS console or calling the ROS API.</li>
             * <li>ResourceDirectory: Resources are shared with accounts in a resource directory from Resource Management by using the resource sharing feature.<blockquote>
             * <ul>
             * <li>The number of accounts with which resources are shared from ROS is independent of the number of accounts with which resources are shared from the resource directory.</li>
             * <li>The shared resources from ROS cannot override or overwrite the shared resources from the resource directory.</li>
             * <li>The shared resources from the resource directory can overwrite the shared resources from ROS.</li>
             * </ul>
             * </blockquote>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ROS</p>
             */
            public Builder shareSource(String shareSource) {
                this.shareSource = shareSource;
                return this;
            }

            /**
             * <p>The version of the shared template. This parameter is returned only if you set ShareOption to ShareToAccounts and set VersionOption to Specified or Current.</p>
             * <p>Valid values: v1 to v100.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder templateVersion(String templateVersion) {
                this.templateVersion = templateVersion;
                return this;
            }

            /**
             * <p>The version option for the shared template. This parameter is returned only if you set ShareOption to ShareToAccounts.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>AllVersions: All template versions are shared.</li>
             * <li>Latest: Only the latest template version is shared. When the version of the template is updated, Resource Orchestration Service (ROS) updates the shared version to the latest version.</li>
             * <li>Current: Only the latest template version is shared. When the version of the template is updated, ROS does not update the shared version.</li>
             * <li>Specified: Only the specified template version is shared.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AllVersions</p>
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
    /**
     * 
     * {@link GetTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>GetTemplateResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>usage</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
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
