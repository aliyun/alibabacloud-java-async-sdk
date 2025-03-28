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
 * {@link UpdateMetaTableRequest} extends {@link RequestModel}
 *
 * <p>UpdateMetaTableRequest</p>
 */
public class UpdateMetaTableRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AddedLabels")
    private String addedLabels;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Caption")
    private String caption;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CategoryId")
    @com.aliyun.core.annotation.Validation()
    private Long categoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnvType")
    private Integer envType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewOwnerId")
    private String newOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation()
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RemovedLabels")
    private String removedLabels;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Schema")
    private String schema;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableGuid")
    private String tableGuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableName")
    private String tableName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Visibility")
    @com.aliyun.core.annotation.Validation(maximum = 100)
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
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The names of the labels that you want to add. Separate the labels with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>a,b,c</p>
         */
        public Builder addedLabels(String addedLabels) {
            this.putBodyParameter("AddedLabels", addedLabels);
            this.addedLabels = addedLabels;
            return this;
        }

        /**
         * <p>The display name of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder caption(String caption) {
            this.putQueryParameter("Caption", caption);
            this.caption = caption;
            return this;
        }

        /**
         * <p>The ID of the category that you want to associate.</p>
         * 
         * <strong>example:</strong>
         * <p>101</p>
         */
        public Builder categoryId(Long categoryId) {
            this.putQueryParameter("CategoryId", categoryId);
            this.categoryId = categoryId;
            return this;
        }

        /**
         * <p>The environment of the DataWorks workspace. Valid values: 0 and 1. The value 0 indicates the development environment. The value 1 indicates the production environment.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder envType(Integer envType) {
            this.putQueryParameter("EnvType", envType);
            this.envType = envType;
            return this;
        }

        /**
         * <p>The new owner ID. If you leave this parameter empty, the owner ID is not updated.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        public Builder newOwnerId(String newOwnerId) {
            this.putQueryParameter("NewOwnerId", newOwnerId);
            this.newOwnerId = newOwnerId;
            return this;
        }

        /**
         * <p>The DataWorks workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>101</p>
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The names of labels that you want to remove. Separate the labels with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>a,b,c</p>
         */
        public Builder removedLabels(String removedLabels) {
            this.putBodyParameter("RemovedLabels", removedLabels);
            this.removedLabels = removedLabels;
            return this;
        }

        /**
         * <p>The schema information about the table. You must configure this parameter if you enable the three-layer model of MaxCompute.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder schema(String schema) {
            this.putQueryParameter("Schema", schema);
            this.schema = schema;
            return this;
        }

        /**
         * <p>The GUID of the table. Specify the GUID in the format of odps.{projectName}.{tableName}.</p>
         * 
         * <strong>example:</strong>
         * <p>odps.test.table1</p>
         */
        public Builder tableGuid(String tableGuid) {
            this.putQueryParameter("TableGuid", tableGuid);
            this.tableGuid = tableGuid;
            return this;
        }

        /**
         * <p>The name of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>table1</p>
         */
        public Builder tableName(String tableName) {
            this.putQueryParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        /**
         * <p>The scope in which the table is visible. Valid values: 0, 1, and 2. The value 0 indicates that the table is invisible to all members. The value 1 indicates that the table is visible to all members. The value 2 indicates that the table is visible to workspace members.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
