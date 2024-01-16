// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateGrafanaWorkspaceRequest} extends {@link RequestModel}
 *
 * <p>CreateGrafanaWorkspaceRequest</p>
 */
public class CreateGrafanaWorkspaceRequest extends Request {
    @Query
    @NameInMap("AliyunLang")
    private String aliyunLang;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("GrafanaVersion")
    @Validation(required = true)
    private String grafanaVersion;

    @Query
    @NameInMap("GrafanaWorkspaceEdition")
    @Validation(required = true)
    private String grafanaWorkspaceEdition;

    @Query
    @NameInMap("GrafanaWorkspaceName")
    @Validation(required = true)
    private String grafanaWorkspaceName;

    @Query
    @NameInMap("Password")
    @Validation(required = true)
    private String password;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("Tags")
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
         * AliyunLang.
         */
        public Builder aliyunLang(String aliyunLang) {
            this.putQueryParameter("AliyunLang", aliyunLang);
            this.aliyunLang = aliyunLang;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * GrafanaVersion.
         */
        public Builder grafanaVersion(String grafanaVersion) {
            this.putQueryParameter("GrafanaVersion", grafanaVersion);
            this.grafanaVersion = grafanaVersion;
            return this;
        }

        /**
         * GrafanaWorkspaceEdition.
         */
        public Builder grafanaWorkspaceEdition(String grafanaWorkspaceEdition) {
            this.putQueryParameter("GrafanaWorkspaceEdition", grafanaWorkspaceEdition);
            this.grafanaWorkspaceEdition = grafanaWorkspaceEdition;
            return this;
        }

        /**
         * GrafanaWorkspaceName.
         */
        public Builder grafanaWorkspaceName(String grafanaWorkspaceName) {
            this.putQueryParameter("GrafanaWorkspaceName", grafanaWorkspaceName);
            this.grafanaWorkspaceName = grafanaWorkspaceName;
            return this;
        }

        /**
         * Password.
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * Tags.
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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
