// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateLocationDateClusterRequest} extends {@link RequestModel}
 *
 * <p>UpdateLocationDateClusterRequest</p>
 */
public class UpdateLocationDateClusterRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomId")
    private String customId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomLabels")
    private java.util.Map < String, ? > customLabels;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatasetName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasetName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ObjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String objectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    private UpdateLocationDateClusterRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.customId = builder.customId;
        this.customLabels = builder.customLabels;
        this.datasetName = builder.datasetName;
        this.objectId = builder.objectId;
        this.projectName = builder.projectName;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLocationDateClusterRequest create() {
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
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder extends Request.Builder<UpdateLocationDateClusterRequest, Builder> {
        private String regionId; 
        private String customId; 
        private java.util.Map < String, ? > customLabels; 
        private String datasetName; 
        private String objectId; 
        private String projectName; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLocationDateClusterRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.customId = request.customId;
            this.customLabels = request.customLabels;
            this.datasetName = request.datasetName;
            this.objectId = request.objectId;
            this.projectName = request.projectName;
            this.title = request.title;
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
         * CustomId.
         */
        public Builder customId(String customId) {
            this.putQueryParameter("CustomId", customId);
            this.customId = customId;
            return this;
        }

        /**
         * CustomLabels.
         */
        public Builder customLabels(java.util.Map < String, ? > customLabels) {
            String customLabelsShrink = shrink(customLabels, "CustomLabels", "json");
            this.putQueryParameter("CustomLabels", customLabelsShrink);
            this.customLabels = customLabels;
            return this;
        }

        /**
         * DatasetName.
         */
        public Builder datasetName(String datasetName) {
            this.putQueryParameter("DatasetName", datasetName);
            this.datasetName = datasetName;
            return this;
        }

        /**
         * ObjectId.
         */
        public Builder objectId(String objectId) {
            this.putQueryParameter("ObjectId", objectId);
            this.objectId = objectId;
            return this;
        }

        /**
         * ProjectName.
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * Title.
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        @Override
        public UpdateLocationDateClusterRequest build() {
            return new UpdateLocationDateClusterRequest(this);
        } 

    } 

}
