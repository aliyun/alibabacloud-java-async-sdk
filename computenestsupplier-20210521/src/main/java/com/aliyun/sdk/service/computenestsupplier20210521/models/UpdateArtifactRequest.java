// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateArtifactRequest} extends {@link RequestModel}
 *
 * <p>UpdateArtifactRequest</p>
 */
public class UpdateArtifactRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ArtifactId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String artifactId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ArtifactProperty")
    @com.aliyun.core.annotation.Validation(required = true)
    private ArtifactProperty artifactProperty;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SupportRegionIds")
    private java.util.List < String > supportRegionIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VersionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String versionName;

    private UpdateArtifactRequest(Builder builder) {
        super(builder);
        this.artifactId = builder.artifactId;
        this.artifactProperty = builder.artifactProperty;
        this.description = builder.description;
        this.supportRegionIds = builder.supportRegionIds;
        this.versionName = builder.versionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateArtifactRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return artifactId
     */
    public String getArtifactId() {
        return this.artifactId;
    }

    /**
     * @return artifactProperty
     */
    public ArtifactProperty getArtifactProperty() {
        return this.artifactProperty;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return supportRegionIds
     */
    public java.util.List < String > getSupportRegionIds() {
        return this.supportRegionIds;
    }

    /**
     * @return versionName
     */
    public String getVersionName() {
        return this.versionName;
    }

    public static final class Builder extends Request.Builder<UpdateArtifactRequest, Builder> {
        private String artifactId; 
        private ArtifactProperty artifactProperty; 
        private String description; 
        private java.util.List < String > supportRegionIds; 
        private String versionName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateArtifactRequest request) {
            super(request);
            this.artifactId = request.artifactId;
            this.artifactProperty = request.artifactProperty;
            this.description = request.description;
            this.supportRegionIds = request.supportRegionIds;
            this.versionName = request.versionName;
        } 

        /**
         * The ID of the deployment package.
         */
        public Builder artifactId(String artifactId) {
            this.putQueryParameter("ArtifactId", artifactId);
            this.artifactId = artifactId;
            return this;
        }

        /**
         * The properties of the deployment package.
         */
        public Builder artifactProperty(ArtifactProperty artifactProperty) {
            String artifactPropertyShrink = shrink(artifactProperty, "ArtifactProperty", "json");
            this.putQueryParameter("ArtifactProperty", artifactPropertyShrink);
            this.artifactProperty = artifactProperty;
            return this;
        }

        /**
         * The description of the deployment package.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The IDs of the regions that support the deployment package.
         */
        public Builder supportRegionIds(java.util.List < String > supportRegionIds) {
            this.putQueryParameter("SupportRegionIds", supportRegionIds);
            this.supportRegionIds = supportRegionIds;
            return this;
        }

        /**
         * The version name of the deployment package.
         */
        public Builder versionName(String versionName) {
            this.putQueryParameter("VersionName", versionName);
            this.versionName = versionName;
            return this;
        }

        @Override
        public UpdateArtifactRequest build() {
            return new UpdateArtifactRequest(this);
        } 

    } 

    public static class ArtifactProperty extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CommodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("CommodityVersion")
        private String commodityVersion;

        @com.aliyun.core.annotation.NameInMap("FileScriptMetadata")
        private String fileScriptMetadata;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ScriptMetadata")
        private String scriptMetadata;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private ArtifactProperty(Builder builder) {
            this.commodityCode = builder.commodityCode;
            this.commodityVersion = builder.commodityVersion;
            this.fileScriptMetadata = builder.fileScriptMetadata;
            this.imageId = builder.imageId;
            this.regionId = builder.regionId;
            this.scriptMetadata = builder.scriptMetadata;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ArtifactProperty create() {
            return builder().build();
        }

        /**
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
        }

        /**
         * @return commodityVersion
         */
        public String getCommodityVersion() {
            return this.commodityVersion;
        }

        /**
         * @return fileScriptMetadata
         */
        public String getFileScriptMetadata() {
            return this.fileScriptMetadata;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return scriptMetadata
         */
        public String getScriptMetadata() {
            return this.scriptMetadata;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String commodityCode; 
            private String commodityVersion; 
            private String fileScriptMetadata; 
            private String imageId; 
            private String regionId; 
            private String scriptMetadata; 
            private String url; 

            /**
             * The commodity code of the service in Alibaba Cloud Marketplace.
             * <p>
             * 
             * >  This parameter is available only if the deployment package is an image.
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * The commodity version of the service in Alibaba Cloud Marketplace.
             * <p>
             * 
             * >  This parameter is available only if the deployment package is an image.
             */
            public Builder commodityVersion(String commodityVersion) {
                this.commodityVersion = commodityVersion;
                return this;
            }

            /**
             * The metadata of the Object Storage Service (OSS) object.
             * <p>
             * 
             * >  This parameter is available only if the deployment package is an OSS object.
             */
            public Builder fileScriptMetadata(String fileScriptMetadata) {
                this.fileScriptMetadata = fileScriptMetadata;
                return this;
            }

            /**
             * The image ID.
             * <p>
             * 
             * >  This parameter is available only if the deployment package is an image.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * The region ID.
             * <p>
             * 
             * >  This parameter is available only if the deployment package is an image.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The script content of the deployment package.
             * <p>
             * 
             * >  This parameter is available only if the deployment package is a script.
             */
            public Builder scriptMetadata(String scriptMetadata) {
                this.scriptMetadata = scriptMetadata;
                return this;
            }

            /**
             * The URL of the deployment package object.
             * <p>
             * 
             * 
             * > Note This parameter is available only if the deployment package is an file.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public ArtifactProperty build() {
                return new ArtifactProperty(this);
            } 

        } 

    }
}
