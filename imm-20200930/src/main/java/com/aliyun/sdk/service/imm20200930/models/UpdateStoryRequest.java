// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateStoryRequest} extends {@link RequestModel}
 *
 * <p>UpdateStoryRequest</p>
 */
public class UpdateStoryRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Cover")
    private Cover cover;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CustomId")
    private String customId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CustomLabels")
    private java.util.Map < String, ? > customLabels;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DatasetName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasetName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ObjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String objectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StoryName")
    private String storyName;

    private UpdateStoryRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.cover = builder.cover;
        this.customId = builder.customId;
        this.customLabels = builder.customLabels;
        this.datasetName = builder.datasetName;
        this.objectId = builder.objectId;
        this.projectName = builder.projectName;
        this.storyName = builder.storyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateStoryRequest create() {
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
     * @return customId
     */
    public String getCustomId() {
        return this.customId;
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
     * @return objectId
     */
    public String getObjectId() {
        return this.objectId;
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

    public static final class Builder extends Request.Builder<UpdateStoryRequest, Builder> {
        private String regionId; 
        private Cover cover; 
        private String customId; 
        private java.util.Map < String, ? > customLabels; 
        private String datasetName; 
        private String objectId; 
        private String projectName; 
        private String storyName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateStoryRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.cover = request.cover;
            this.customId = request.customId;
            this.customLabels = request.customLabels;
            this.datasetName = request.datasetName;
            this.objectId = request.objectId;
            this.projectName = request.projectName;
            this.storyName = request.storyName;
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
         * CustomId.
         */
        public Builder customId(String customId) {
            this.putBodyParameter("CustomId", customId);
            this.customId = customId;
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
         * ObjectId.
         */
        public Builder objectId(String objectId) {
            this.putBodyParameter("ObjectId", objectId);
            this.objectId = objectId;
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

        @Override
        public UpdateStoryRequest build() {
            return new UpdateStoryRequest(this);
        } 

    } 

    public static class Cover extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("URI")
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
}
