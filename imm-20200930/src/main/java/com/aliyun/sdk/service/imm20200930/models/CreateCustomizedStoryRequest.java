// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCustomizedStoryRequest} extends {@link RequestModel}
 *
 * <p>CreateCustomizedStoryRequest</p>
 */
public class CreateCustomizedStoryRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Cover")
    @com.aliyun.core.annotation.Validation(required = true)
    private Cover cover;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CustomLabels")
    private java.util.Map < String, ? > customLabels;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DatasetName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasetName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Files")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < Files> files;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StoryName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String storyName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StorySubType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String storySubType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StoryType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String storyType;

    private CreateCustomizedStoryRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.cover = builder.cover;
        this.customLabels = builder.customLabels;
        this.datasetName = builder.datasetName;
        this.files = builder.files;
        this.projectName = builder.projectName;
        this.storyName = builder.storyName;
        this.storySubType = builder.storySubType;
        this.storyType = builder.storyType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCustomizedStoryRequest create() {
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
     * @return cover
     */
    public Cover getCover() {
        return this.cover;
    }

    /**
     * @return customLabels
     */
    public java.util.Map < String, ? > getCustomLabels() {
        return this.customLabels;
    }

    /**
     * @return datasetName
     */
    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * @return files
     */
    public java.util.List < Files> getFiles() {
        return this.files;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return storyName
     */
    public String getStoryName() {
        return this.storyName;
    }

    /**
     * @return storySubType
     */
    public String getStorySubType() {
        return this.storySubType;
    }

    /**
     * @return storyType
     */
    public String getStoryType() {
        return this.storyType;
    }

    public static final class Builder extends Request.Builder<CreateCustomizedStoryRequest, Builder> {
        private String regionId; 
        private Cover cover; 
        private java.util.Map < String, ? > customLabels; 
        private String datasetName; 
        private java.util.List < Files> files; 
        private String projectName; 
        private String storyName; 
        private String storySubType; 
        private String storyType; 

        private Builder() {
            super();
        } 

        private Builder(CreateCustomizedStoryRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.cover = request.cover;
            this.customLabels = request.customLabels;
            this.datasetName = request.datasetName;
            this.files = request.files;
            this.projectName = request.projectName;
            this.storyName = request.storyName;
            this.storySubType = request.storySubType;
            this.storyType = request.storyType;
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
         * Cover.
         */
        public Builder cover(Cover cover) {
            String coverShrink = shrink(cover, "Cover", "json");
            this.putBodyParameter("Cover", coverShrink);
            this.cover = cover;
            return this;
        }

        /**
         * CustomLabels.
         */
        public Builder customLabels(java.util.Map < String, ? > customLabels) {
            String customLabelsShrink = shrink(customLabels, "CustomLabels", "json");
            this.putBodyParameter("CustomLabels", customLabelsShrink);
            this.customLabels = customLabels;
            return this;
        }

        /**
         * DatasetName.
         */
        public Builder datasetName(String datasetName) {
            this.putBodyParameter("DatasetName", datasetName);
            this.datasetName = datasetName;
            return this;
        }

        /**
         * Files.
         */
        public Builder files(java.util.List < Files> files) {
            String filesShrink = shrink(files, "Files", "json");
            this.putBodyParameter("Files", filesShrink);
            this.files = files;
            return this;
        }

        /**
         * ProjectName.
         */
        public Builder projectName(String projectName) {
            this.putBodyParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * StoryName.
         */
        public Builder storyName(String storyName) {
            this.putBodyParameter("StoryName", storyName);
            this.storyName = storyName;
            return this;
        }

        /**
         * StorySubType.
         */
        public Builder storySubType(String storySubType) {
            this.putBodyParameter("StorySubType", storySubType);
            this.storySubType = storySubType;
            return this;
        }

        /**
         * StoryType.
         */
        public Builder storyType(String storyType) {
            this.putBodyParameter("StoryType", storyType);
            this.storyType = storyType;
            return this;
        }

        @Override
        public CreateCustomizedStoryRequest build() {
            return new CreateCustomizedStoryRequest(this);
        } 

    } 

    public static class Cover extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("URI")
        @com.aliyun.core.annotation.Validation(required = true)
        private String URI;

        private Cover(Builder builder) {
            this.URI = builder.URI;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Cover create() {
            return builder().build();
        }

        /**
         * @return URI
         */
        public String getURI() {
            return this.URI;
        }

        public static final class Builder {
            private String URI; 

            /**
             * URI.
             */
            public Builder URI(String URI) {
                this.URI = URI;
                return this;
            }

            public Cover build() {
                return new Cover(this);
            } 

        } 

    }
    public static class Files extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("URI")
        @com.aliyun.core.annotation.Validation(required = true)
        private String URI;

        private Files(Builder builder) {
            this.URI = builder.URI;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Files create() {
            return builder().build();
        }

        /**
         * @return URI
         */
        public String getURI() {
            return this.URI;
        }

        public static final class Builder {
            private String URI; 

            /**
             * URI.
             */
            public Builder URI(String URI) {
                this.URI = URI;
                return this;
            }

            public Files build() {
                return new Files(this);
            } 

        } 

    }
}
