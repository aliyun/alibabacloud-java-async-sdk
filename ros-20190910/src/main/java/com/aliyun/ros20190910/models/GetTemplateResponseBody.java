// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

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
        this.ownerId = builder.ownerId;
        this.permissions = builder.permissions;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.shareType = builder.shareType;
        this.stackGroupName = builder.stackGroupName;
        this.stackId = builder.stackId;
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
        private String ownerId; 
        private java.util.List < Permissions> permissions; 
        private String regionId; 
        private String requestId; 
        private String resourceGroupId; 
        private String shareType; 
        private String stackGroupName; 
        private String stackId; 
        private String templateARN; 
        private String templateBody; 
        private String templateId; 
        private String templateName; 
        private String templateVersion; 
        private String updateTime; 

        /**
         * <p>ChangeSetId.</p>
         */
        public Builder changeSetId(String changeSetId) {
            this.changeSetId = changeSetId;
            return this;
        }

        /**
         * <p>CreateTime.</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>Description.</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>OwnerId.</p>
         */
        public Builder ownerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>Permissions.</p>
         */
        public Builder permissions(java.util.List < Permissions> permissions) {
            this.permissions = permissions;
            return this;
        }

        /**
         * <p>RegionId.</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>ResourceGroupId.</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>ShareType.</p>
         */
        public Builder shareType(String shareType) {
            this.shareType = shareType;
            return this;
        }

        /**
         * <p>StackGroupName.</p>
         */
        public Builder stackGroupName(String stackGroupName) {
            this.stackGroupName = stackGroupName;
            return this;
        }

        /**
         * <p>StackId.</p>
         */
        public Builder stackId(String stackId) {
            this.stackId = stackId;
            return this;
        }

        /**
         * <p>TemplateARN.</p>
         */
        public Builder templateARN(String templateARN) {
            this.templateARN = templateARN;
            return this;
        }

        /**
         * <p>TemplateBody.</p>
         */
        public Builder templateBody(String templateBody) {
            this.templateBody = templateBody;
            return this;
        }

        /**
         * <p>TemplateId.</p>
         */
        public Builder templateId(String templateId) {
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>TemplateName.</p>
         */
        public Builder templateName(String templateName) {
            this.templateName = templateName;
            return this;
        }

        /**
         * <p>TemplateVersion.</p>
         */
        public Builder templateVersion(String templateVersion) {
            this.templateVersion = templateVersion;
            return this;
        }

        /**
         * <p>UpdateTime.</p>
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

        @NameInMap("TemplateVersion")
        private String templateVersion;

        @NameInMap("VersionOption")
        private String versionOption;


        private Permissions(Builder builder) {
            this.accountId = builder.accountId;
            this.shareOption = builder.shareOption;
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
            private String templateVersion; 
            private String versionOption; 

            /**
             * <p>AccountId.</p>
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>ShareOption.</p>
             */
            public Builder shareOption(String shareOption) {
                this.shareOption = shareOption;
                return this;
            }

            /**
             * <p>TemplateVersion.</p>
             */
            public Builder templateVersion(String templateVersion) {
                this.templateVersion = templateVersion;
                return this;
            }

            /**
             * <p>VersionOption.</p>
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
}
