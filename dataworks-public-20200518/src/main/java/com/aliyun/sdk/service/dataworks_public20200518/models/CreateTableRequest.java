// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTableRequest} extends {@link RequestModel}
 *
 * <p>CreateTableRequest</p>
 */
public class CreateTableRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("AppGuid")
    private String appGuid;

    @Query
    @NameInMap("CategoryId")
    @Validation(minimum = 1)
    private Long categoryId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Body
    @NameInMap("Columns")
    @Validation(required = true)
    private java.util.List < Columns> columns;

    @Query
    @NameInMap("Comment")
    private String comment;

    @Body
    @NameInMap("Endpoint")
    private String endpoint;

    @Body
    @NameInMap("EnvType")
    private Integer envType;

    @Query
    @NameInMap("ExternalTableType")
    private String externalTableType;

    @Query
    @NameInMap("HasPart")
    private Integer hasPart;

    @Query
    @NameInMap("IsView")
    private Integer isView;

    @Query
    @NameInMap("LifeCycle")
    private Integer lifeCycle;

    @Query
    @NameInMap("Location")
    private String location;

    @Query
    @NameInMap("LogicalLevelId")
    @Validation(minimum = 1)
    private Long logicalLevelId;

    @Query
    @NameInMap("OwnerId")
    private String ownerId;

    @Query
    @NameInMap("PhysicsLevelId")
    @Validation(minimum = 1)
    private Long physicsLevelId;

    @Query
    @NameInMap("ProjectId")
    @Validation(minimum = 1)
    private Long projectId;

    @Query
    @NameInMap("Schema")
    private String schema;

    @Query
    @NameInMap("TableName")
    @Validation(required = true)
    private String tableName;

    @Body
    @NameInMap("Themes")
    private java.util.List < Themes> themes;

    @Query
    @NameInMap("Visibility")
    private Integer visibility;

    private CreateTableRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appGuid = builder.appGuid;
        this.categoryId = builder.categoryId;
        this.clientToken = builder.clientToken;
        this.columns = builder.columns;
        this.comment = builder.comment;
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

    public static CreateTableRequest create() {
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return columns
     */
    public java.util.List < Columns> getColumns() {
        return this.columns;
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
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
    public java.util.List < Themes> getThemes() {
        return this.themes;
    }

    /**
     * @return visibility
     */
    public Integer getVisibility() {
        return this.visibility;
    }

    public static final class Builder extends Request.Builder<CreateTableRequest, Builder> {
        private String regionId; 
        private String appGuid; 
        private Long categoryId; 
        private String clientToken; 
        private java.util.List < Columns> columns; 
        private String comment; 
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
        private java.util.List < Themes> themes; 
        private Integer visibility; 

        private Builder() {
            super();
        } 

        private Builder(CreateTableRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appGuid = request.appGuid;
            this.categoryId = request.categoryId;
            this.clientToken = request.clientToken;
            this.columns = request.columns;
            this.comment = request.comment;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The comment.
         */
        public Builder appGuid(String appGuid) {
            this.putQueryParameter("AppGuid", appGuid);
            this.appGuid = appGuid;
            return this;
        }

        /**
         * The ID of the logical level.
         */
        public Builder categoryId(Long categoryId) {
            this.putQueryParameter("CategoryId", categoryId);
            this.categoryId = categoryId;
            return this;
        }

        /**
         * The schema information of the table. You need to enter the schema information of the table if you enable the table schema in MaxCompute.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Columns.
         */
        public Builder columns(java.util.List < Columns> columns) {
            this.putBodyParameter("Columns", columns);
            this.columns = columns;
            return this;
        }

        /**
         * Specifies whether the MaxCompute table is a partitioned table. Valid values: 1 and 0. The value 1 indicates that the MaxCompute table is a partitioned table. The value 0 indicates that the MaxCompute table is not a partitioned table. This parameter is deprecated. Do not use this parameter.
         * <p>
         * 
         * The Column.N.isPartitionCol parameter is used to specify whether the MaxCompute table is a partitioned table. If the Column.N.isPartitionCol parameter is set to true, the MaxCompute table is a partitioned table.
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * The environment of the DataWorks workspace. Valid values:
         * <p>
         * 
         * *   0: development environment
         * *   1: production environment
         */
        public Builder endpoint(String endpoint) {
            this.putBodyParameter("Endpoint", endpoint);
            this.endpoint = endpoint;
            return this;
        }

        /**
         * The globally unique identifier (GUID) of the MaxCompute project. Specify the GUID in the odps.{projectName} format.
         */
        public Builder envType(Integer envType) {
            this.putBodyParameter("EnvType", envType);
            this.envType = envType;
            return this;
        }

        /**
         * The storage location of the external table.
         */
        public Builder externalTableType(String externalTableType) {
            this.putQueryParameter("ExternalTableType", externalTableType);
            this.externalTableType = externalTableType;
            return this;
        }

        /**
         * A reserved parameter.
         */
        public Builder hasPart(Integer hasPart) {
            this.putQueryParameter("HasPart", hasPart);
            this.hasPart = hasPart;
            return this;
        }

        /**
         * Specifies whether the table or workspace is visible:
         * <p>
         * 
         * *   0: Both the table and workspace are not visible.
         * *   1: The table and workspace are visible.
         * *   2: Only the workspace is visible.
         */
        public Builder isView(Integer isView) {
            this.putQueryParameter("IsView", isView);
            this.isView = isView;
            return this;
        }

        /**
         * The ID of the associated category. You can call the [GetMetaCategory](~~173932~~) operation to query the ID of the category that can be associated.
         */
        public Builder lifeCycle(Integer lifeCycle) {
            this.putQueryParameter("LifeCycle", lifeCycle);
            this.lifeCycle = lifeCycle;
            return this;
        }

        /**
         * The ID of the DataWorks workspace.
         */
        public Builder location(String location) {
            this.putQueryParameter("Location", location);
            this.location = location;
            return this;
        }

        /**
         * The ID of the physical level.
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
         * The storage type of the external table. Valid values:
         * <p>
         * 
         * *   0: Object Storage Service (OSS)
         * *   1: Tablestore
         * *   2: Volume
         * *   3: MySQL
         */
        public Builder physicsLevelId(Long physicsLevelId) {
            this.putQueryParameter("PhysicsLevelId", physicsLevelId);
            this.physicsLevelId = physicsLevelId;
            return this;
        }

        /**
         * The name of the table.
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * The display name of the field.
         */
        public Builder schema(String schema) {
            this.putQueryParameter("Schema", schema);
            this.schema = schema;
            return this;
        }

        /**
         * The endpoint of MaxCompute.
         */
        public Builder tableName(String tableName) {
            this.putQueryParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        /**
         * Themes.
         */
        public Builder themes(java.util.List < Themes> themes) {
            this.putBodyParameter("Themes", themes);
            this.themes = themes;
            return this;
        }

        /**
         * The lifecycle of the table. Unit: days. By default, this parameter is left empty, which indicates that the table is permanently stored.
         */
        public Builder visibility(Integer visibility) {
            this.putQueryParameter("Visibility", visibility);
            this.visibility = visibility;
            return this;
        }

        @Override
        public CreateTableRequest build() {
            return new CreateTableRequest(this);
        } 

    } 

    public static class Columns extends TeaModel {
        @NameInMap("ColumnName")
        @Validation(required = true)
        private String columnName;

        @NameInMap("ColumnNameCn")
        private String columnNameCn;

        @NameInMap("ColumnType")
        @Validation(required = true)
        private String columnType;

        @NameInMap("Comment")
        private String comment;

        @NameInMap("IsPartitionCol")
        private Boolean isPartitionCol;

        @NameInMap("Length")
        private Integer length;

        @NameInMap("SeqNumber")
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
             * The comment of the field.
             */
            public Builder columnName(String columnName) {
                this.columnName = columnName;
                return this;
            }

            /**
             * The name of the field.
             * <p>
             * 
             * You can call the CreateTable operation to configure a maximum of 1,000 fields.
             */
            public Builder columnNameCn(String columnNameCn) {
                this.columnNameCn = columnNameCn;
                return this;
            }

            /**
             * The sequence number of the field. You can use this parameter to specify how fields are sorted in a table. By default, fields are sorted in the order in which requests are created.
             * <p>
             * 
             * If the field is a partition field, this parameter is not supported.
             */
            public Builder columnType(String columnType) {
                this.columnType = columnType;
                return this;
            }

            /**
             * The data type of the field.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * The ID of the topic.
             */
            public Builder isPartitionCol(Boolean isPartitionCol) {
                this.isPartitionCol = isPartitionCol;
                return this;
            }

            /**
             * Specifies whether the current field is a partition field.
             */
            public Builder length(Integer length) {
                this.length = length;
                return this;
            }

            /**
             * The length of the field. For more information, see [MaxCompute V2.0 data type edition](~~159541#concept-2454988~~).
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
    public static class Themes extends TeaModel {
        @NameInMap("ThemeId")
        @Validation(minimum = 1)
        private Long themeId;

        @NameInMap("ThemeLevel")
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
             * The level that corresponds to the topic ID.
             */
            public Builder themeId(Long themeId) {
                this.themeId = themeId;
                return this;
            }

            /**
             * The ID of the request.
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
