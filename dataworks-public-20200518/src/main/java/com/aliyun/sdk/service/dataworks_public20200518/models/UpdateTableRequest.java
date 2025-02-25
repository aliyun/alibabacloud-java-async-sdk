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
 * {@link UpdateTableRequest} extends {@link RequestModel}
 *
 * <p>UpdateTableRequest</p>
 */
public class UpdateTableRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppGuid")
    private String appGuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CategoryId")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long categoryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Columns")
    private java.util.List<Columns> columns;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateIfNotExists")
    private Boolean createIfNotExists;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Endpoint")
    private String endpoint;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnvType")
    private Integer envType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExternalTableType")
    private String externalTableType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HasPart")
    private Integer hasPart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsView")
    private Integer isView;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LifeCycle")
    private Integer lifeCycle;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Location")
    private String location;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogicalLevelId")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long logicalLevelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhysicsLevelId")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long physicsLevelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Schema")
    private String schema;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tableName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Themes")
    private java.util.List<Themes> themes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Visibility")
    private Integer visibility;

    private UpdateTableRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appGuid = builder.appGuid;
        this.categoryId = builder.categoryId;
        this.columns = builder.columns;
        this.comment = builder.comment;
        this.createIfNotExists = builder.createIfNotExists;
        this.endpoint = builder.endpoint;
        this.envType = builder.envType;
        this.externalTableType = builder.externalTableType;
        this.hasPart = builder.hasPart;
        this.isView = builder.isView;
        this.lifeCycle = builder.lifeCycle;
        this.location = builder.location;
        this.logicalLevelId = builder.logicalLevelId;
        this.ownerId = builder.ownerId;
        this.physicsLevelId = builder.physicsLevelId;
        this.projectId = builder.projectId;
        this.schema = builder.schema;
        this.tableName = builder.tableName;
        this.themes = builder.themes;
        this.visibility = builder.visibility;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTableRequest create() {
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
     * @return appGuid
     */
    public String getAppGuid() {
        return this.appGuid;
    }

    /**
     * @return categoryId
     */
    public Long getCategoryId() {
        return this.categoryId;
    }

    /**
     * @return columns
     */
    public java.util.List<Columns> getColumns() {
        return this.columns;
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return createIfNotExists
     */
    public Boolean getCreateIfNotExists() {
        return this.createIfNotExists;
    }

    /**
     * @return endpoint
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * @return envType
     */
    public Integer getEnvType() {
        return this.envType;
    }

    /**
     * @return externalTableType
     */
    public String getExternalTableType() {
        return this.externalTableType;
    }

    /**
     * @return hasPart
     */
    public Integer getHasPart() {
        return this.hasPart;
    }

    /**
     * @return isView
     */
    public Integer getIsView() {
        return this.isView;
    }

    /**
     * @return lifeCycle
     */
    public Integer getLifeCycle() {
        return this.lifeCycle;
    }

    /**
     * @return location
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * @return logicalLevelId
     */
    public Long getLogicalLevelId() {
        return this.logicalLevelId;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return physicsLevelId
     */
    public Long getPhysicsLevelId() {
        return this.physicsLevelId;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return schema
     */
    public String getSchema() {
        return this.schema;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * @return themes
     */
    public java.util.List<Themes> getThemes() {
        return this.themes;
    }

    /**
     * @return visibility
     */
    public Integer getVisibility() {
        return this.visibility;
    }

    public static final class Builder extends Request.Builder<UpdateTableRequest, Builder> {
        private String regionId; 
        private String appGuid; 
        private Long categoryId; 
        private java.util.List<Columns> columns; 
        private String comment; 
        private Boolean createIfNotExists; 
        private String endpoint; 
        private Integer envType; 
        private String externalTableType; 
        private Integer hasPart; 
        private Integer isView; 
        private Integer lifeCycle; 
        private String location; 
        private Long logicalLevelId; 
        private String ownerId; 
        private Long physicsLevelId; 
        private Long projectId; 
        private String schema; 
        private String tableName; 
        private java.util.List<Themes> themes; 
        private Integer visibility; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTableRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appGuid = request.appGuid;
            this.categoryId = request.categoryId;
            this.columns = request.columns;
            this.comment = request.comment;
            this.createIfNotExists = request.createIfNotExists;
            this.endpoint = request.endpoint;
            this.envType = request.envType;
            this.externalTableType = request.externalTableType;
            this.hasPart = request.hasPart;
            this.isView = request.isView;
            this.lifeCycle = request.lifeCycle;
            this.location = request.location;
            this.logicalLevelId = request.logicalLevelId;
            this.ownerId = request.ownerId;
            this.physicsLevelId = request.physicsLevelId;
            this.projectId = request.projectId;
            this.schema = request.schema;
            this.tableName = request.tableName;
            this.themes = request.themes;
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
         * <p>The unique identifier of the MaxCompute project. Specify the GUID in the odps.{projectName} format.</p>
         * 
         * <strong>example:</strong>
         * <p>odps.test</p>
         */
        public Builder appGuid(String appGuid) {
            this.putQueryParameter("AppGuid", appGuid);
            this.appGuid = appGuid;
            return this;
        }

        /**
         * <p>The ID of the associated category.</p>
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
         * <p>The list of fields.</p>
         */
        public Builder columns(java.util.List<Columns> columns) {
            this.putBodyParameter("Columns", columns);
            this.columns = columns;
            return this;
        }

        /**
         * <p>The comment.</p>
         * 
         * <strong>example:</strong>
         * <p>comment</p>
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * <p>Specifies whether the table exists. Valid values:</p>
         * <ul>
         * <li>true: The table exists.</li>
         * <li>false: The table does not exist.</li>
         * </ul>
         * <p>This parameter is deprecated. Do not use this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder createIfNotExists(Boolean createIfNotExists) {
            this.putQueryParameter("CreateIfNotExists", createIfNotExists);
            this.createIfNotExists = createIfNotExists;
            return this;
        }

        /**
         * <p>The endpoint of MaxCompute. If you do not specify this parameter, the endpoint of the MaxCompute project is used.</p>
         * 
         * <strong>example:</strong>
         * <p>odps://</p>
         */
        public Builder endpoint(String endpoint) {
            this.putBodyParameter("Endpoint", endpoint);
            this.endpoint = endpoint;
            return this;
        }

        /**
         * <p>The environment of the DataWorks workspace. Valid values: 0 and 1. The value 0 indicates the development environment. The value 1 indicates the production environment.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder envType(Integer envType) {
            this.putBodyParameter("EnvType", envType);
            this.envType = envType;
            return this;
        }

        /**
         * <p>The type of the external table. Valid values: 0, 1, 2, and 3. The value 0 indicates that the external table is an OSS external table. The value 1 indicates that the external table is a Tablestore external table. The value 2 indicates that the external table is a volume external table. The value 3 indicates that the external table is a MySQL external table. This parameter is deprecated. Do not use this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder externalTableType(String externalTableType) {
            this.putQueryParameter("ExternalTableType", externalTableType);
            this.externalTableType = externalTableType;
            return this;
        }

        /**
         * <p>Specifies whether the table that you want to update is a partitioned table. Valid values: 0 and 1. The value 0 indicates that the table is not a partitioned table. The value 1 indicates that the table is a partitioned table. This parameter is deprecated. Do not use this parameter. The Column.N.isPartitionCol parameter is used instead of the HasPart parameter to specify whether the MaxCompute table is a partitioned table. If the Column.N.isPartitionCol parameter is set to 1, the MaxCompute table is a partitioned table.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder hasPart(Integer hasPart) {
            this.putQueryParameter("HasPart", hasPart);
            this.hasPart = hasPart;
            return this;
        }

        /**
         * <p>Specifies whether the table is a view. Valid values: 0 and 1. The value 0 indicates that the table is not a view. The value 1 indicates that the table is a view. This parameter is deprecated. Do not use this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder isView(Integer isView) {
            this.putQueryParameter("IsView", isView);
            this.isView = isView;
            return this;
        }

        /**
         * <p>The lifecycle of the table. Unit: days. If this parameter is left empty, the table is permanently stored.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder lifeCycle(Integer lifeCycle) {
            this.putQueryParameter("LifeCycle", lifeCycle);
            this.lifeCycle = lifeCycle;
            return this;
        }

        /**
         * <p>The storage location of the external table. This parameter is deprecated. Do not use this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>location</p>
         */
        public Builder location(String location) {
            this.putQueryParameter("Location", location);
            this.location = location;
            return this;
        }

        /**
         * <p>The ID of the logical level.</p>
         * 
         * <strong>example:</strong>
         * <p>101</p>
         */
        public Builder logicalLevelId(Long logicalLevelId) {
            this.putQueryParameter("LogicalLevelId", logicalLevelId);
            this.logicalLevelId = logicalLevelId;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The ID of the physical layer.</p>
         * 
         * <strong>example:</strong>
         * <p>101</p>
         */
        public Builder physicsLevelId(Long physicsLevelId) {
            this.putQueryParameter("PhysicsLevelId", physicsLevelId);
            this.physicsLevelId = physicsLevelId;
            return this;
        }

        /**
         * <p>The DataWorks workspace ID. You can log on to the DataWorks console to obtain the ID of the DataWorks workspace.</p>
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
         * <p>The schema information of the table. You need to enter the schema information of the table if you enable the table schema in MaxCompute.</p>
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
         * <p>The name of the MaxCompute table.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        public Builder tableName(String tableName) {
            this.putQueryParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        /**
         * <p>The list of fields.</p>
         */
        public Builder themes(java.util.List<Themes> themes) {
            this.putBodyParameter("Themes", themes);
            this.themes = themes;
            return this;
        }

        /**
         * <p>The scope in which the table is visible. Valid values: 0, 1, and 2. The value 0 indicates that the table is invisible to all workspace members. The value 1 indicates that the table is visible to all workspace members. The value 2 indicates that the table is visible to workspace members.</p>
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
        public UpdateTableRequest build() {
            return new UpdateTableRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateTableRequest} extends {@link TeaModel}
     *
     * <p>UpdateTableRequest</p>
     */
    public static class Columns extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ColumnName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String columnName;

        @com.aliyun.core.annotation.NameInMap("ColumnNameCn")
        private String columnNameCn;

        @com.aliyun.core.annotation.NameInMap("ColumnType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String columnType;

        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("IsPartitionCol")
        private Boolean isPartitionCol;

        @com.aliyun.core.annotation.NameInMap("Length")
        private Integer length;

        @com.aliyun.core.annotation.NameInMap("SeqNumber")
        private Integer seqNumber;

        private Columns(Builder builder) {
            this.columnName = builder.columnName;
            this.columnNameCn = builder.columnNameCn;
            this.columnType = builder.columnType;
            this.comment = builder.comment;
            this.isPartitionCol = builder.isPartitionCol;
            this.length = builder.length;
            this.seqNumber = builder.seqNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Columns create() {
            return builder().build();
        }

        /**
         * @return columnName
         */
        public String getColumnName() {
            return this.columnName;
        }

        /**
         * @return columnNameCn
         */
        public String getColumnNameCn() {
            return this.columnNameCn;
        }

        /**
         * @return columnType
         */
        public String getColumnType() {
            return this.columnType;
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return isPartitionCol
         */
        public Boolean getIsPartitionCol() {
            return this.isPartitionCol;
        }

        /**
         * @return length
         */
        public Integer getLength() {
            return this.length;
        }

        /**
         * @return seqNumber
         */
        public Integer getSeqNumber() {
            return this.seqNumber;
        }

        public static final class Builder {
            private String columnName; 
            private String columnNameCn; 
            private String columnType; 
            private String comment; 
            private Boolean isPartitionCol; 
            private Integer length; 
            private Integer seqNumber; 

            /**
             * <p>The name of the field.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>abc</p>
             */
            public Builder columnName(String columnName) {
                this.columnName = columnName;
                return this;
            }

            /**
             * <p>The display name of the field.</p>
             * 
             * <strong>example:</strong>
             * <p>名称</p>
             */
            public Builder columnNameCn(String columnNameCn) {
                this.columnNameCn = columnNameCn;
                return this;
            }

            /**
             * <p>The type of the field. For more information, see MaxCompute field types.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>string</p>
             */
            public Builder columnType(String columnType) {
                this.columnType = columnType;
                return this;
            }

            /**
             * <p>The comment of the field.</p>
             * 
             * <strong>example:</strong>
             * <p>comment</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>Specifies whether the field is a partition field. Valid values: 0 and 1. The value 0 indicates that the field is not a partition field. The value 1 indicates that the field is a partition field.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder isPartitionCol(Boolean isPartitionCol) {
                this.isPartitionCol = isPartitionCol;
                return this;
            }

            /**
             * <p>The length of the field.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder length(Integer length) {
                this.length = length;
                return this;
            }

            /**
             * <p>The sequence number of the field. If the field is a partition field, this parameter is not supported.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder seqNumber(Integer seqNumber) {
                this.seqNumber = seqNumber;
                return this;
            }

            public Columns build() {
                return new Columns(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateTableRequest} extends {@link TeaModel}
     *
     * <p>UpdateTableRequest</p>
     */
    public static class Themes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ThemeId")
        @com.aliyun.core.annotation.Validation(minimum = 1)
        private Long themeId;

        @com.aliyun.core.annotation.NameInMap("ThemeLevel")
        private Integer themeLevel;

        private Themes(Builder builder) {
            this.themeId = builder.themeId;
            this.themeLevel = builder.themeLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Themes create() {
            return builder().build();
        }

        /**
         * @return themeId
         */
        public Long getThemeId() {
            return this.themeId;
        }

        /**
         * @return themeLevel
         */
        public Integer getThemeLevel() {
            return this.themeLevel;
        }

        public static final class Builder {
            private Long themeId; 
            private Integer themeLevel; 

            /**
             * <p>The ID of the associated topic.</p>
             * 
             * <strong>example:</strong>
             * <p>101</p>
             */
            public Builder themeId(Long themeId) {
                this.themeId = themeId;
                return this;
            }

            /**
             * <p>The level that corresponds to the topic ID.</p>
             * 
             * <strong>example:</strong>
             * <p>101</p>
             */
            public Builder themeLevel(Integer themeLevel) {
                this.themeLevel = themeLevel;
                return this;
            }

            public Themes build() {
                return new Themes(this);
            } 

        } 

    }
}
