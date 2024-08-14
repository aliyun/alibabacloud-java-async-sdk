// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateProjectRequest} extends {@link RequestModel}
 *
 * <p>CreateProjectRequest</p>
 */
public class CreateProjectRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DisableDevelopment")
    private Boolean disableDevelopment;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsAllowDownload")
    private Integer isAllowDownload;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectDescription")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectIdentifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectIdentifier;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectMode")
    private Integer projectMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceManagerResourceGroupId")
    private String resourceManagerResourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List < Tags> tags;

    private CreateProjectRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clientToken = builder.clientToken;
        this.disableDevelopment = builder.disableDevelopment;
        this.isAllowDownload = builder.isAllowDownload;
        this.projectDescription = builder.projectDescription;
        this.projectIdentifier = builder.projectIdentifier;
        this.projectMode = builder.projectMode;
        this.projectName = builder.projectName;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProjectRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return disableDevelopment
     */
    public Boolean getDisableDevelopment() {
        return this.disableDevelopment;
    }

    /**
     * @return isAllowDownload
     */
    public Integer getIsAllowDownload() {
        return this.isAllowDownload;
    }

    /**
     * @return projectDescription
     */
    public String getProjectDescription() {
        return this.projectDescription;
    }

    /**
     * @return projectIdentifier
     */
    public String getProjectIdentifier() {
        return this.projectIdentifier;
    }

    /**
     * @return projectMode
     */
    public Integer getProjectMode() {
        return this.projectMode;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return resourceManagerResourceGroupId
     */
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    /**
     * @return tags
     */
    public java.util.List < Tags> getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<CreateProjectRequest, Builder> {
        private String regionId; 
        private String clientToken; 
        private Boolean disableDevelopment; 
        private Integer isAllowDownload; 
        private String projectDescription; 
        private String projectIdentifier; 
        private Integer projectMode; 
        private String projectName; 
        private String resourceManagerResourceGroupId; 
        private java.util.List < Tags> tags; 

        private Builder() {
            super();
        } 

        private Builder(CreateProjectRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clientToken = request.clientToken;
            this.disableDevelopment = request.disableDevelopment;
            this.isAllowDownload = request.isAllowDownload;
            this.projectDescription = request.projectDescription;
            this.projectIdentifier = request.projectIdentifier;
            this.projectMode = request.projectMode;
            this.projectName = request.projectName;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
            this.tags = request.tags;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request. This parameter can be left empty.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Specifies whether to disable the Develop role. Valid values:
         * <p>
         * 
         * *   **false** (default)
         * *   **true**
         */
        public Builder disableDevelopment(Boolean disableDevelopment) {
            this.putQueryParameter("DisableDevelopment", disableDevelopment);
            this.disableDevelopment = disableDevelopment;
            return this;
        }

        /**
         * Specifies whether to allow you to download the query result from DataStudio. Valid values:
         * <p>
         * 
         * *   **1** (default): allows you to download the query result from DataStudio.
         * *   **0**: does not allow you to download the query result from DataStudio.
         */
        public Builder isAllowDownload(Integer isAllowDownload) {
            this.putQueryParameter("IsAllowDownload", isAllowDownload);
            this.isAllowDownload = isAllowDownload;
            return this;
        }

        /**
         * The description of the workspace.
         */
        public Builder projectDescription(String projectDescription) {
            this.putQueryParameter("ProjectDescription", projectDescription);
            this.projectDescription = projectDescription;
            return this;
        }

        /**
         * The name of the workspace. The name can contain only letters, digits, and underscores (\_) and must start with a letter or digit.
         */
        public Builder projectIdentifier(String projectIdentifier) {
            this.putQueryParameter("ProjectIdentifier", projectIdentifier);
            this.projectIdentifier = projectIdentifier;
            return this;
        }

        /**
         * The mode of the workspace. For more information about the differences between the modes of workspaces, see [Differences between workspaces in basic mode and workspaces in standard mode](~~85772~~).
         * <p>
         * 
         * Valid values:
         * 
         * *   **2** (default): basic mode
         * *   **3**: standard mode
         */
        public Builder projectMode(Integer projectMode) {
            this.putQueryParameter("ProjectMode", projectMode);
            this.projectMode = projectMode;
            return this;
        }

        /**
         * The display name of the workspace.
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * The resource group ID.
         */
        public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.putQueryParameter("ResourceManagerResourceGroupId", resourceManagerResourceGroupId);
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }

        /**
         * The tags added to the workspace.
         */
        public Builder tags(java.util.List < Tags> tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putQueryParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        @Override
        public CreateProjectRequest build() {
            return new CreateProjectRequest(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        @com.aliyun.core.annotation.Validation(required = true)
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * The tag key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value.
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
