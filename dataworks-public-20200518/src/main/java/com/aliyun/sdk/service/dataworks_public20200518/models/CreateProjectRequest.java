// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
    private java.util.List<Tags> tags;

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
    public java.util.List<Tags> getTags() {
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
        private java.util.List<Tags> tags; 

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
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. This parameter can be left empty.</p>
         * 
         * <strong>example:</strong>
         * <p>ABFUOEUOTRTRJKE</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to disable the Develop role. Valid values:</p>
         * <ul>
         * <li><strong>false</strong> (default)</li>
         * <li><strong>true</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder disableDevelopment(Boolean disableDevelopment) {
            this.putQueryParameter("DisableDevelopment", disableDevelopment);
            this.disableDevelopment = disableDevelopment;
            return this;
        }

        /**
         * <p>Specifies whether to allow you to download the query result from DataStudio. Valid values:</p>
         * <ul>
         * <li><strong>1</strong> (default): allows you to download the query result from DataStudio.</li>
         * <li><strong>0</strong>: does not allow you to download the query result from DataStudio.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder isAllowDownload(Integer isAllowDownload) {
            this.putQueryParameter("IsAllowDownload", isAllowDownload);
            this.isAllowDownload = isAllowDownload;
            return this;
        }

        /**
         * <p>The description of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>test_describe</p>
         */
        public Builder projectDescription(String projectDescription) {
            this.putQueryParameter("ProjectDescription", projectDescription);
            this.projectDescription = projectDescription;
            return this;
        }

        /**
         * <p>The name of the workspace. The name can contain only letters, digits, and underscores (_) and must start with a letter or digit.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_project</p>
         */
        public Builder projectIdentifier(String projectIdentifier) {
            this.putQueryParameter("ProjectIdentifier", projectIdentifier);
            this.projectIdentifier = projectIdentifier;
            return this;
        }

        /**
         * <p>The mode of the workspace. For more information about the differences between the modes of workspaces, see <a href="https://help.aliyun.com/document_detail/85772.html">Differences between workspaces in basic mode and workspaces in standard mode</a>.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><strong>2</strong> (default): basic mode</li>
         * <li><strong>3</strong>: standard mode</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder projectMode(Integer projectMode) {
            this.putQueryParameter("ProjectMode", projectMode);
            this.projectMode = projectMode;
            return this;
        }

        /**
         * <p>The display name of the workspace.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_project</p>
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzbn7pti3****</p>
         */
        public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.putQueryParameter("ResourceManagerResourceGroupId", resourceManagerResourceGroupId);
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }

        /**
         * <p>The tags added to the workspace.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
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

    /**
     * 
     * {@link CreateProjectRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectRequest</p>
     */
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
             * <p>The tag key.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>key</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>value</p>
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
