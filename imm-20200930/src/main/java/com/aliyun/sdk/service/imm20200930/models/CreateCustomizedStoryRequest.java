// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
    private java.util.Map<String, ?> customLabels;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DatasetName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasetName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Files")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Files> files;

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
    public java.util.Map<String, ?> getCustomLabels() {
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
    public java.util.List<Files> getFiles() {
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
        private java.util.Map<String, ?> customLabels; 
        private String datasetName; 
        private java.util.List<Files> files; 
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
         * <p>The cover image of the story. You can specify an image as the cover image of the custom story.</p>
         * <p>This parameter is required.</p>
         */
        public Builder cover(Cover cover) {
            String coverShrink = shrink(cover, "Cover", "json");
            this.putBodyParameter("Cover", coverShrink);
            this.cover = cover;
            return this;
        }

        /**
         * <p>The custom labels. You can specify labels to help you identify and retrieve the story.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Bucket&quot;: &quot;examplebucket&quot;}</p>
         */
        public Builder customLabels(java.util.Map<String, ?> customLabels) {
            String customLabelsShrink = shrink(customLabels, "CustomLabels", "json");
            this.putBodyParameter("CustomLabels", customLabelsShrink);
            this.customLabels = customLabels;
            return this;
        }

        /**
         * <p>The name of the dataset.<a href="~~478160~~"></a></p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dataset001</p>
         */
        public Builder datasetName(String datasetName) {
            this.putBodyParameter("DatasetName", datasetName);
            this.datasetName = datasetName;
            return this;
        }

        /**
         * <p>The files of the story. You can specify up to 100 files in a custom story.</p>
         * <p>This parameter is required.</p>
         */
        public Builder files(java.util.List<Files> files) {
            String filesShrink = shrink(files, "Files", "json");
            this.putBodyParameter("Files", filesShrink);
            this.files = files;
            return this;
        }

        /**
         * <p>The name of the project.<a href="~~478153~~"></a></p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>immtest</p>
         */
        public Builder projectName(String projectName) {
            this.putBodyParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>The name of the story.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>name1</p>
         */
        public Builder storyName(String storyName) {
            this.putBodyParameter("StoryName", storyName);
            this.storyName = storyName;
            return this;
        }

        /**
         * <p>The subtype of the story. For information about valid subtypes, see <a href="https://help.aliyun.com/document_detail/2743998.html">Story types and subtypes</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Solo</p>
         */
        public Builder storySubType(String storySubType) {
            this.putBodyParameter("StorySubType", storySubType);
            this.storySubType = storySubType;
            return this;
        }

        /**
         * <p>The type of the story. For information about valid types, see <a href="https://help.aliyun.com/document_detail/2743998.html">Story types and subtypes</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PeopleMemory</p>
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

    /**
     * 
     * {@link CreateCustomizedStoryRequest} extends {@link TeaModel}
     *
     * <p>CreateCustomizedStoryRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(Cover model) {
                this.URI = model.URI;
            } 

            /**
             * <p>The URI of the cover image.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://bucket1/cover</p>
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
    /**
     * 
     * {@link CreateCustomizedStoryRequest} extends {@link TeaModel}
     *
     * <p>CreateCustomizedStoryRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(Files model) {
                this.URI = model.URI;
            } 

            /**
             * <p>The URIs of the files.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;URI&quot;:&quot;oss://bucket1/file1&quot;}]</p>
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
