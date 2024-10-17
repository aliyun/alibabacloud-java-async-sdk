// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateGrafanaWorkspaceRequest} extends {@link RequestModel}
 *
 * <p>CreateGrafanaWorkspaceRequest</p>
 */
public class CreateGrafanaWorkspaceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliyunLang")
    private String aliyunLang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GrafanaVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String grafanaVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GrafanaWorkspaceEdition")
    @com.aliyun.core.annotation.Validation(required = true)
    private String grafanaWorkspaceEdition;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GrafanaWorkspaceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String grafanaWorkspaceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Password")
    private String password;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List < Tags> tags;

    private CreateGrafanaWorkspaceRequest(Builder builder) {
        super(builder);
        this.aliyunLang = builder.aliyunLang;
        this.description = builder.description;
        this.grafanaVersion = builder.grafanaVersion;
        this.grafanaWorkspaceEdition = builder.grafanaWorkspaceEdition;
        this.grafanaWorkspaceName = builder.grafanaWorkspaceName;
        this.password = builder.password;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGrafanaWorkspaceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliyunLang
     */
    public String getAliyunLang() {
        return this.aliyunLang;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return grafanaVersion
     */
    public String getGrafanaVersion() {
        return this.grafanaVersion;
    }

    /**
     * @return grafanaWorkspaceEdition
     */
    public String getGrafanaWorkspaceEdition() {
        return this.grafanaWorkspaceEdition;
    }

    /**
     * @return grafanaWorkspaceName
     */
    public String getGrafanaWorkspaceName() {
        return this.grafanaWorkspaceName;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return tags
     */
    public java.util.List < Tags> getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<CreateGrafanaWorkspaceRequest, Builder> {
        private String aliyunLang; 
        private String description; 
        private String grafanaVersion; 
        private String grafanaWorkspaceEdition; 
        private String grafanaWorkspaceName; 
        private String password; 
        private String regionId; 
        private String resourceGroupId; 
        private java.util.List < Tags> tags; 

        private Builder() {
            super();
        } 

        private Builder(CreateGrafanaWorkspaceRequest request) {
            super(request);
            this.aliyunLang = request.aliyunLang;
            this.description = request.description;
            this.grafanaVersion = request.grafanaVersion;
            this.grafanaWorkspaceEdition = request.grafanaWorkspaceEdition;
            this.grafanaWorkspaceName = request.grafanaWorkspaceName;
            this.password = request.password;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.tags = request.tags;
        } 

        /**
         * <p>The language. Default value: zh. Valid values:</p>
         * <ul>
         * <li>zh</li>
         * <li>en</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder aliyunLang(String aliyunLang) {
            this.putQueryParameter("AliyunLang", aliyunLang);
            this.aliyunLang = aliyunLang;
            return this;
        }

        /**
         * <p>The description of the workspace</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.x</p>
         */
        public Builder grafanaVersion(String grafanaVersion) {
            this.putQueryParameter("GrafanaVersion", grafanaVersion);
            this.grafanaVersion = grafanaVersion;
            return this;
        }

        /**
         * <p>The edition.</p>
         * <p><strong>Valid values:</strong></p>
         * <ul>
         * <li>standard: <code>Beta Edition or Standard Edition</code></li>
         * <li>personal_edition: Developer Edition</li>
         * <li>experts_edition: Pro Edition</li>
         * <li>advanced_edition: Advanced Edition</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>experts_edition</p>
         */
        public Builder grafanaWorkspaceEdition(String grafanaWorkspaceEdition) {
            this.putQueryParameter("GrafanaWorkspaceEdition", grafanaWorkspaceEdition);
            this.grafanaWorkspaceEdition = grafanaWorkspaceEdition;
            return this;
        }

        /**
         * <p>The name of the Grafana workspace.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testgrafana</p>
         */
        public Builder grafanaWorkspaceName(String grafanaWorkspaceName) {
            this.putQueryParameter("GrafanaWorkspaceName", grafanaWorkspaceName);
            this.grafanaWorkspaceName = grafanaWorkspaceName;
            return this;
        }

        /**
         * <p>The password of the workspace. The password must be 8 to 30 characters in length. It must include at least three of the following characters types: uppercase letter, lowercase letter, digit, and special character. Special characters include () &quot; ~ ! @ # $ % ^ &amp; * - _ + =.</p>
         * 
         * <strong>example:</strong>
         * <p>Test123456!</p>
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxyexli2****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The list of tags.</p>
         */
        public Builder tags(java.util.List < Tags> tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putQueryParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        @Override
        public CreateGrafanaWorkspaceRequest build() {
            return new CreateGrafanaWorkspaceRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateGrafanaWorkspaceRequest} extends {@link TeaModel}
     *
     * <p>CreateGrafanaWorkspaceRequest</p>
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

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
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
