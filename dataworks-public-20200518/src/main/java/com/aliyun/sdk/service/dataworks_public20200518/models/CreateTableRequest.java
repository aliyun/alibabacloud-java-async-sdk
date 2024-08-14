// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTableRequest} extends {@link RequestModel}
 *
 * <p>CreateTableRequest</p>
 */
public class CreateTableRequest extends Request {
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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Columns")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < Columns> columns;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

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
    private java.util.List < Themes> themes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Visibility")
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
         * The ID of the MaxCompute project. Specify the ID in the odps.{projectName} format.
         */
        public Builder appGuid(String appGuid) {
            this.putQueryParameter("AppGuid", appGuid);
            this.appGuid = appGuid;
            return this;
        }

        /**
         * The ID of the associated category. You can call the [GetMetaCategory](~~173932~~) operation to query the IDs of all categories that can be associated.
         */
        public Builder categoryId(Long categoryId) {
            this.putQueryParameter("CategoryId", categoryId);
            this.categoryId = categoryId;
            return this;
        }

        /**
         * A reserved parameter.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The list of fields. A maximum of 1,000 fields are supported.
         */
        public Builder columns(java.util.List < Columns> columns) {
            this.putBodyParameter("Columns", columns);
            this.columns = columns;
            return this;
        }

        /**
         * The comment.
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * The endpoint of MaxCompute.
         */
        public Builder endpoint(String endpoint) {
            this.putBodyParameter("Endpoint", endpoint);
            this.endpoint = endpoint;
            return this;
        }

        /**
         * The environment type of the DataWorks workspace. Valid values:
         * <p>
         * 
         * *   0: development environment
         * *   1: production environment
         */
        public Builder envType(Integer envType) {
            this.putBodyParameter("EnvType", envType);
            this.envType = envType;
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
        public Builder externalTableType(String externalTableType) {
            this.putQueryParameter("ExternalTableType", externalTableType);
            this.externalTableType = externalTableType;
            return this;
        }

        /**
         * Specifies whether to create a MaxCompute partitioned table. Valid values: 1 and 0. The value 1 indicates a partitioned table. The value 0 indicates a non-partitioned table. This parameter is deprecated. Do not use this parameter. The Column.N.isPartitionCol parameter is used to specify whether to create a MaxCompute partitioned table. If the Column.N.isPartitionCol parameter is set to true, a MaxCompute partitioned table is created.
         */
        public Builder hasPart(Integer hasPart) {
            this.putQueryParameter("HasPart", hasPart);
            this.hasPart = hasPart;
            return this;
        }

        /**
         * Specifies whether to create a view or table. Valid values:
         * <p>
         * 
         * *   0: Create a table.
         * *   1: Create a view.
         */
        public Builder isView(Integer isView) {
            this.putQueryParameter("IsView", isView);
            this.isView = isView;
            return this;
        }

        /**
         * The lifecycle of the table. Unit: days. By default, this parameter is left empty, which indicates that the table is permanently stored.
         */
        public Builder lifeCycle(Integer lifeCycle) {
            this.putQueryParameter("LifeCycle", lifeCycle);
            this.lifeCycle = lifeCycle;
            return this;
        }

        /**
         * The storage location of the external table.
         */
        public Builder location(String location) {
            this.putQueryParameter("Location", location);
            this.location = location;
            return this;
        }

        /**
         * The ID of the logical level.
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
         * The ID of the physical level.
         */
        public Builder physicsLevelId(Long physicsLevelId) {
            this.putQueryParameter("PhysicsLevelId", physicsLevelId);
            this.physicsLevelId = physicsLevelId;
            return this;
        }

        /**
         * The DataWorks workspace ID.
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * The schema information of the table. You need to enter the schema information of the table if you enable the table schema in MaxCompute.
         */
        public Builder schema(String schema) {
            this.putQueryParameter("Schema", schema);
            this.schema = schema;
            return this;
        }

        /**
         * The name of the table.
         */
        public Builder tableName(String tableName) {
            this.putQueryParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        /**
         * The list of themes.
         */
        public Builder themes(java.util.List < Themes> themes) {
            this.putBodyParameter("Themes", themes);
            this.themes = themes;
            return this;
        }

        /**
         * Specifies whether the table or workspace is visible. Valid values:
         * <p>
         * 
         * *   0: Both the table and workspace are invisible.
         * *   1: Both the table and workspace are visible.
         * *   2: Only the workspace is visible.
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
             * The name of the field. You can configure a maximum of 1,000 fields when you call the CreateTable operation to create a table.
             */
            public Builder columnName(String columnName) {
                this.columnName = columnName;
                return this;
            }

            /**
             * The display name of the field.
             */
            public Builder columnNameCn(String columnNameCn) {
                this.columnNameCn = columnNameCn;
                return this;
            }

            /**
             * The data type of the field. For information about supported data types, see [Data type editions](~~27821~~) in MaxCompute documentation.
             */
            public Builder columnType(String columnType) {
                this.columnType = columnType;
                return this;
            }

            /**
             * The comment of the field.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * Specifies whether the field is a partition field.
             */
            public Builder isPartitionCol(Boolean isPartitionCol) {
                this.isPartitionCol = isPartitionCol;
                return this;
            }

            /**
             * The length of the field. For more information, see [MaxCompute data type editions](~~159541~~).
             */
            public Builder length(Integer length) {
                this.length = length;
                return this;
            }

            /**
             * The sequence number of the field. You can use this parameter to specify how fields are sorted in a table. By default, fields are sorted based on the order in which requests are created. If the field is a partition field, this parameter is not supported.
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
             * The theme ID.
             */
            public Builder themeId(Long themeId) {
                this.themeId = themeId;
                return this;
            }

            /**
             * The level that corresponds to the theme ID.
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
