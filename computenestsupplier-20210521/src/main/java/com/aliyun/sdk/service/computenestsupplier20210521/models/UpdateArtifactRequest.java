// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateArtifactRequest} extends {@link RequestModel}
 *
 * <p>UpdateArtifactRequest</p>
 */
public class UpdateArtifactRequest extends Request {
    @Query
    @NameInMap("ArtifactId")
    @Validation(required = true)
    private String artifactId;

    @Query
    @NameInMap("ArtifactProperty")
    @Validation(required = true)
    private ArtifactProperty artifactProperty;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("SupportRegionIds")
    private java.util.List < String > supportRegionIds;

    @Query
    @NameInMap("VersionName")
    @Validation(required = true)
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
         * ArtifactId.
         */
        public Builder artifactId(String artifactId) {
            this.putQueryParameter("ArtifactId", artifactId);
            this.artifactId = artifactId;
            return this;
        }

        /**
         * ArtifactProperty.
         */
        public Builder artifactProperty(ArtifactProperty artifactProperty) {
            String artifactPropertyShrink = shrink(artifactProperty, "ArtifactProperty", "json");
            this.putQueryParameter("ArtifactProperty", artifactPropertyShrink);
            this.artifactProperty = artifactProperty;
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
         * SupportRegionIds.
         */
        public Builder supportRegionIds(java.util.List < String > supportRegionIds) {
            this.putQueryParameter("SupportRegionIds", supportRegionIds);
            this.supportRegionIds = supportRegionIds;
            return this;
        }

        /**
         * VersionName.
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
        @NameInMap("CommodityCode")
        private String commodityCode;

        @NameInMap("CommodityVersion")
        private String commodityVersion;

        @NameInMap("FileScriptMetadata")
        private String fileScriptMetadata;

        @NameInMap("ImageId")
        private String imageId;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ScriptMetadata")
        private String scriptMetadata;

        @NameInMap("Url")
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
             * CommodityCode.
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * CommodityVersion.
             */
            public Builder commodityVersion(String commodityVersion) {
                this.commodityVersion = commodityVersion;
                return this;
            }

            /**
             * FileScriptMetadata.
             */
            public Builder fileScriptMetadata(String fileScriptMetadata) {
                this.fileScriptMetadata = fileScriptMetadata;
                return this;
            }

            /**
             * ImageId.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * ScriptMetadata.
             */
            public Builder scriptMetadata(String scriptMetadata) {
                this.scriptMetadata = scriptMetadata;
                return this;
            }

            /**
             * Url.
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
