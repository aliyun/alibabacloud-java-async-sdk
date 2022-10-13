// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateMetaTableRequest} extends {@link RequestModel}
 *
 * <p>UpdateMetaTableRequest</p>
 */
public class UpdateMetaTableRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("AddedLabels")
    private String addedLabels;

    @Query
    @NameInMap("Caption")
    private String caption;

    @Query
    @NameInMap("CategoryId")
    @Validation()
    private Long categoryId;

    @Query
    @NameInMap("EnvType")
    private Integer envType;

    @Query
    @NameInMap("NewOwnerId")
    private String newOwnerId;

    @Query
    @NameInMap("ProjectId")
    @Validation()
    private Long projectId;

    @Body
    @NameInMap("RemovedLabels")
    private String removedLabels;

    @Query
    @NameInMap("Schema")
    private String schema;

    @Query
    @NameInMap("TableGuid")
    private String tableGuid;

    @Query
    @NameInMap("TableName")
    private String tableName;

    @Query
    @NameInMap("Visibility")
    @Validation(maximum = 100)
    private Integer visibility;

    private UpdateMetaTableRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.addedLabels = builder.addedLabels;
        this.caption = builder.caption;
        this.categoryId = builder.categoryId;
        this.envType = builder.envType;
        this.newOwnerId = builder.newOwnerId;
        this.projectId = builder.projectId;
        this.removedLabels = builder.removedLabels;
        this.schema = builder.schema;
        this.tableGuid = builder.tableGuid;
        this.tableName = builder.tableName;
        this.visibility = builder.visibility;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMetaTableRequest create() {
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
     * @return addedLabels
     */
    public String getAddedLabels() {
        return this.addedLabels;
    }

    /**
     * @return caption
     */
    public String getCaption() {
        return this.caption;
    }

    /**
     * @return categoryId
     */
    public Long getCategoryId() {
        return this.categoryId;
    }

    /**
     * @return envType
     */
    public Integer getEnvType() {
        return this.envType;
    }

    /**
     * @return newOwnerId
     */
    public String getNewOwnerId() {
        return this.newOwnerId;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return removedLabels
     */
    public String getRemovedLabels() {
        return this.removedLabels;
    }

    /**
     * @return schema
     */
    public String getSchema() {
        return this.schema;
    }

    /**
     * @return tableGuid
     */
    public String getTableGuid() {
        return this.tableGuid;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * @return visibility
     */
    public Integer getVisibility() {
        return this.visibility;
    }

    public static final class Builder extends Request.Builder<UpdateMetaTableRequest, Builder> {
        private String regionId; 
        private String addedLabels; 
        private String caption; 
        private Long categoryId; 
        private Integer envType; 
        private String newOwnerId; 
        private Long projectId; 
        private String removedLabels; 
        private String schema; 
        private String tableGuid; 
        private String tableName; 
        private Integer visibility; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMetaTableRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.addedLabels = request.addedLabels;
            this.caption = request.caption;
            this.categoryId = request.categoryId;
            this.envType = request.envType;
            this.newOwnerId = request.newOwnerId;
            this.projectId = request.projectId;
            this.removedLabels = request.removedLabels;
            this.schema = request.schema;
            this.tableGuid = request.tableGuid;
            this.tableName = request.tableName;
            this.visibility = request.visibility;
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
         * AddedLabels.
         */
        public Builder addedLabels(String addedLabels) {
            this.putBodyParameter("AddedLabels", addedLabels);
            this.addedLabels = addedLabels;
            return this;
        }

        /**
         * Caption.
         */
        public Builder caption(String caption) {
            this.putQueryParameter("Caption", caption);
            this.caption = caption;
            return this;
        }

        /**
         * CategoryId.
         */
        public Builder categoryId(Long categoryId) {
            this.putQueryParameter("CategoryId", categoryId);
            this.categoryId = categoryId;
            return this;
        }

        /**
         * EnvType.
         */
        public Builder envType(Integer envType) {
            this.putQueryParameter("EnvType", envType);
            this.envType = envType;
            return this;
        }

        /**
         * NewOwnerId.
         */
        public Builder newOwnerId(String newOwnerId) {
            this.putQueryParameter("NewOwnerId", newOwnerId);
            this.newOwnerId = newOwnerId;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * RemovedLabels.
         */
        public Builder removedLabels(String removedLabels) {
            this.putBodyParameter("RemovedLabels", removedLabels);
            this.removedLabels = removedLabels;
            return this;
        }

        /**
         * Schema.
         */
        public Builder schema(String schema) {
            this.putQueryParameter("Schema", schema);
            this.schema = schema;
            return this;
        }

        /**
         * TableGuid.
         */
        public Builder tableGuid(String tableGuid) {
            this.putQueryParameter("TableGuid", tableGuid);
            this.tableGuid = tableGuid;
            return this;
        }

        /**
         * TableName.
         */
        public Builder tableName(String tableName) {
            this.putQueryParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        /**
         * Visibility.
         */
        public Builder visibility(Integer visibility) {
            this.putQueryParameter("Visibility", visibility);
            this.visibility = visibility;
            return this;
        }

        @Override
        public UpdateMetaTableRequest build() {
            return new UpdateMetaTableRequest(this);
        } 

    } 

}
