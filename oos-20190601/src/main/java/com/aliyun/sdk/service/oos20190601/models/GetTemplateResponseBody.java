// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

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
    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Template")
    private Template template;

    private GetTemplateResponseBody(Builder builder) {
        this.content = builder.content;
        this.requestId = builder.requestId;
        this.template = builder.template;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTemplateResponseBody create() {
        return builder().build();
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return template
     */
    public Template getTemplate() {
        return this.template;
    }

    public static final class Builder {
        private String content; 
        private String requestId; 
        private Template template; 

        /**
         * <p>The content of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;FormatVersion: OOS-2019-06-01\nDescription:\n  en:  Creates an ECS image\n  zh-cn: 创建一个ECS镜像\n  name-en: Create Image\n  name-zh-cn: 创建镜像\n  categories:\n    - image_manage\n    - application_manage\nParameters:\n  regionId:\n    Type: String\n    Label:\n      en: RegionId\n      zh-cn: 地域ID\n    AssociationProperty: RegionId\n    Default: &quot;{{ ACS::RegionId }}&quot;\n  instanceId:\n    Label:\n      en: InstanceId\n      zh-cn: ECS实例ID\n    Type: String\n    AssociationProperty: ALIYUN::ECS::Instance::InstanceId\n    AssociationPropertyMetadata:\n      RegionId: regionId\n  imageName:\n    Label:\n      en: ImageName\n      zh-cn: 新镜像的名称\n    Type: String\n    Description:\n      en: &lt;p class=&quot;p&quot;&gt;Note:</p> &lt;ul class=&quot;ul&quot;&gt; &lt;li class=&quot;li&quot;&gt;Length is 2<del>128 English or Chinese characters</li> &lt;li class=&quot;li&quot;&gt;&lt;font color=&quot;red&quot;&gt;must start with big or small letters or Chinese, not http:// and https://. </font></li> &lt;li class=&quot;li&quot;&gt;Can contain numbers, colons (:), underscores (_), or dashes (-). </li> </ul>\n      zh-cn: &lt;p class=&quot;p&quot;&gt;注意：</p> &lt;ul class=&quot;ul&quot;&gt; &lt;li class=&quot;li&quot;&gt;长度为2</del>128个英文或中文字符</li> &lt;li class=&quot;li&quot;&gt;&lt;font color=&quot;red&quot;&gt;必须以大小字母或中文开头，不能以http://和https://开头。</font></li> &lt;li class=&quot;li&quot;&gt;可以包含数字、半角冒号（:）、下划线（_）或者短划线（-）。</li> </ul>\n  tags:\n    Label:\n      en: Tags\n      zh-cn: 镜像标签\n    Type: Json\n    AssociationProperty: Tags\n    AssociationPropertyMetadata:\n      ShowSystem: false\n    Default: []\n  OOSAssumeRole:\n    Label:\n      en: OOSAssumeRole\n      zh-cn: OOS扮演的RAM角色\n    Type: String\n    Default: OOSServiceRole\nRamRole: &quot;{{ OOSAssumeRole }}&quot;\nTasks:\n- Name: createImage\n  Action: ACS::ECS::CreateImage\n  Description:\n    en: Create new image with the specified image name and instance ID\n    zh-cn: 通过指定实例ID和镜像名称创建新的镜像\n  Properties:\n    regionId: &quot;{{ regionId }}&quot;\n    imageName: &quot;{{ imageName }}_<em>on</em>{{ ACS::ExecutionId }}<em>at</em>{{ Acs::CurrentDate }}&quot;\n    instanceId: &quot;{{ instanceId }}&quot;\n    tags: &quot;{{tags}}&quot;\n  Outputs:\n    imageId:\n      ValueSelector: imageId\n      Type: String\nOutputs:\n  imageId:\n    Type: String\n    Value: &quot;{{ createImage.imageId }}&quot;\nMetadata:\n  ALIYUN::OOS::Interface:\n    ParameterGroups:\n      - Parameters:\n          - regionId\n          - instanceId\n        Label:\n          default:\n            zh-cn: 选择实例\n            en: Select Ecs Instances\n      - Parameters:\n          - imageName\n          - tags\n        Label:\n          default:\n            zh-cn: 镜像设置\n            en: Image Configure\n      - Parameters:\n          - OOSAssumeRole\n        Label:\n          default:\n            zh-cn: 高级选项\n            en: Control Options&quot;</p>
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5BBE2663-A18E-5261-9BBB-F4832F5294D9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The metadata of the template.</p>
         */
        public Builder template(Template template) {
            this.template = template;
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
    public static class Template extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatedBy")
        private String createdBy;

        @com.aliyun.core.annotation.NameInMap("CreatedDate")
        private String createdDate;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("HasTrigger")
        private Boolean hasTrigger;

        @com.aliyun.core.annotation.NameInMap("Hash")
        private String hash;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ShareType")
        private String shareType;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.Map < String, ? > tags;

        @com.aliyun.core.annotation.NameInMap("TemplateFormat")
        private String templateFormat;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        @com.aliyun.core.annotation.NameInMap("TemplateType")
        private String templateType;

        @com.aliyun.core.annotation.NameInMap("TemplateVersion")
        private String templateVersion;

        @com.aliyun.core.annotation.NameInMap("UpdatedBy")
        private String updatedBy;

        @com.aliyun.core.annotation.NameInMap("UpdatedDate")
        private String updatedDate;

        @com.aliyun.core.annotation.NameInMap("VersionName")
        private String versionName;

        private Template(Builder builder) {
            this.createdBy = builder.createdBy;
            this.createdDate = builder.createdDate;
            this.description = builder.description;
            this.hasTrigger = builder.hasTrigger;
            this.hash = builder.hash;
            this.resourceGroupId = builder.resourceGroupId;
            this.shareType = builder.shareType;
            this.tags = builder.tags;
            this.templateFormat = builder.templateFormat;
            this.templateId = builder.templateId;
            this.templateName = builder.templateName;
            this.templateType = builder.templateType;
            this.templateVersion = builder.templateVersion;
            this.updatedBy = builder.updatedBy;
            this.updatedDate = builder.updatedDate;
            this.versionName = builder.versionName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Template create() {
            return builder().build();
        }

        /**
         * @return createdBy
         */
        public String getCreatedBy() {
            return this.createdBy;
        }

        /**
         * @return createdDate
         */
        public String getCreatedDate() {
            return this.createdDate;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return hasTrigger
         */
        public Boolean getHasTrigger() {
            return this.hasTrigger;
        }

        /**
         * @return hash
         */
        public String getHash() {
            return this.hash;
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
         * @return tags
         */
        public java.util.Map < String, ? > getTags() {
            return this.tags;
        }

        /**
         * @return templateFormat
         */
        public String getTemplateFormat() {
            return this.templateFormat;
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
         * @return templateType
         */
        public String getTemplateType() {
            return this.templateType;
        }

        /**
         * @return templateVersion
         */
        public String getTemplateVersion() {
            return this.templateVersion;
        }

        /**
         * @return updatedBy
         */
        public String getUpdatedBy() {
            return this.updatedBy;
        }

        /**
         * @return updatedDate
         */
        public String getUpdatedDate() {
            return this.updatedDate;
        }

        /**
         * @return versionName
         */
        public String getVersionName() {
            return this.versionName;
        }

        public static final class Builder {
            private String createdBy; 
            private String createdDate; 
            private String description; 
            private Boolean hasTrigger; 
            private String hash; 
            private String resourceGroupId; 
            private String shareType; 
            private java.util.Map < String, ? > tags; 
            private String templateFormat; 
            private String templateId; 
            private String templateName; 
            private String templateType; 
            private String templateVersion; 
            private String updatedBy; 
            private String updatedDate; 
            private String versionName; 

            /**
             * <p>The creator of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>ACS</p>
             */
            public Builder createdBy(String createdBy) {
                this.createdBy = createdBy;
                return this;
            }

            /**
             * <p>The time when the template was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-05-16T10:26:14Z</p>
             */
            public Builder createdDate(String createdDate) {
                this.createdDate = createdDate;
                return this;
            }

            /**
             * <p>The description of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;{&quot;en&quot;: &quot;Creates an ECS image&quot;, &quot;zh-cn&quot;: &quot;创建一个ECS镜像&quot;, &quot;name-en&quot;: &quot;Create Image&quot;, &quot;name-zh-cn&quot;: &quot;创建镜像&quot;, &quot;categories&quot;: [&quot;image_manage&quot;, &quot;application_manage&quot;]}&quot;</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Indicates whether the template was configured with a trigger.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder hasTrigger(Boolean hasTrigger) {
                this.hasTrigger = hasTrigger;
                return this;
            }

            /**
             * <p>The SHA-256 value of the template content.</p>
             * 
             * <strong>example:</strong>
             * <p>40fb5e3e08ef6c8a499ff7cd8441194f518028ad08338a84cb70c023a64576f1</p>
             */
            public Builder hash(String hash) {
                this.hash = hash;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmxsn4m4******</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The share type of the template. The share type of a user-created template is <strong>Private</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>Public</p>
             */
            public Builder shareType(String shareType) {
                this.shareType = shareType;
                return this;
            }

            /**
             * <p>The tag keys and values. The number of key-value pairs ranges from 1 to 20.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;k1&quot;:&quot;k2&quot;,&quot;k2&quot;:&quot;v2&quot;}</p>
             */
            public Builder tags(java.util.Map < String, ? > tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The format of the template. The system automatically determines whether the format is JSON or YAML.</p>
             * 
             * <strong>example:</strong>
             * <p>YAML</p>
             */
            public Builder templateFormat(String templateFormat) {
                this.templateFormat = templateFormat;
                return this;
            }

            /**
             * <p>The ID of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>t-4bdb1745c171401883a2</p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>The name of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>ACS-ECS-CreateImage</p>
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * <p>The type of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>Automation</p>
             */
            public Builder templateType(String templateType) {
                this.templateType = templateType;
                return this;
            }

            /**
             * <p>The version of the template. The name of the version consists of the letter v and a number. The number starts from 1.</p>
             * 
             * <strong>example:</strong>
             * <p>v15</p>
             */
            public Builder templateVersion(String templateVersion) {
                this.templateVersion = templateVersion;
                return this;
            }

            /**
             * <p>The user who last updated the template.</p>
             * 
             * <strong>example:</strong>
             * <p>ACS</p>
             */
            public Builder updatedBy(String updatedBy) {
                this.updatedBy = updatedBy;
                return this;
            }

            /**
             * <p>The time when the template was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-04-26T08:37:07Z</p>
             */
            public Builder updatedDate(String updatedDate) {
                this.updatedDate = updatedDate;
                return this;
            }

            /**
             * <p>The name of the version of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>version15</p>
             */
            public Builder versionName(String versionName) {
                this.versionName = versionName;
                return this;
            }

            public Template build() {
                return new Template(this);
            } 

        } 

    }
}
