// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTableRequest} extends {@link RequestModel}
 *
 * <p>UpdateTableRequest</p>
 */
public class UpdateTableRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("AppGuid")
    private String appGuid;

    @Query
    @NameInMap("CategoryId")
    @Validation(minimum = 1)
    private Long categoryId;

    @Body
    @NameInMap("Columns")
    private java.util.List < Columns> columns;

    @Query
    @NameInMap("Comment")
    private String comment;

    @Query
    @NameInMap("CreateIfNotExists")
    private Boolean createIfNotExists;

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
    public java.util.List < Themes> getThemes() {
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
        private java.util.List < Columns> columns; 
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
        private java.util.List < Themes> themes; 
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * AppGuid.
         */
        public Builder appGuid(String appGuid) {
            this.putQueryParameter("AppGuid", appGuid);
            this.appGuid = appGuid;
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
         * Columns.
         */
        public Builder columns(java.util.List < Columns> columns) {
            this.putBodyParameter("Columns", columns);
            this.columns = columns;
            return this;
        }

        /**
         * Comment.
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * CreateIfNotExists.
         */
        public Builder createIfNotExists(Boolean createIfNotExists) {
            this.putQueryParameter("CreateIfNotExists", createIfNotExists);
            this.createIfNotExists = createIfNotExists;
            return this;
        }

        /**
         * Endpoint.
         */
        public Builder endpoint(String endpoint) {
            this.putBodyParameter("Endpoint", endpoint);
            this.endpoint = endpoint;
            return this;
        }

        /**
         * EnvType.
         */
        public Builder envType(Integer envType) {
            this.putBodyParameter("EnvType", envType);
            this.envType = envType;
            return this;
        }

        /**
         * ExternalTableType.
         */
        public Builder externalTableType(String externalTableType) {
            this.putQueryParameter("ExternalTableType", externalTableType);
            this.externalTableType = externalTableType;
            return this;
        }

        /**
         * HasPart.
         */
        public Builder hasPart(Integer hasPart) {
            this.putQueryParameter("HasPart", hasPart);
            this.hasPart = hasPart;
            return this;
        }

        /**
         * IsView.
         */
        public Builder isView(Integer isView) {
            this.putQueryParameter("IsView", isView);
            this.isView = isView;
            return this;
        }

        /**
         * LifeCycle.
         */
        public Builder lifeCycle(Integer lifeCycle) {
            this.putQueryParameter("LifeCycle", lifeCycle);
            this.lifeCycle = lifeCycle;
            return this;
        }

        /**
         * Location.
         */
        public Builder location(String location) {
            this.putQueryParameter("Location", location);
            this.location = location;
            return this;
        }

        /**
         * LogicalLevelId.
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
         * PhysicsLevelId.
         */
        public Builder physicsLevelId(Long physicsLevelId) {
            this.putQueryParameter("PhysicsLevelId", physicsLevelId);
            this.physicsLevelId = physicsLevelId;
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
         * Schema.
         */
        public Builder schema(String schema) {
            this.putQueryParameter("Schema", schema);
            this.schema = schema;
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
         * Themes.
         */
        public Builder themes(java.util.List < Themes> themes) {
            this.putBodyParameter("Themes", themes);
            this.themes = themes;
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
        public UpdateTableRequest build() {
            return new UpdateTableRequest(this);
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
             * ColumnName.
             */
            public Builder columnName(String columnName) {
                this.columnName = columnName;
                return this;
            }

            /**
             * ColumnNameCn.
             */
            public Builder columnNameCn(String columnNameCn) {
                this.columnNameCn = columnNameCn;
                return this;
            }

            /**
             * ColumnType.
             */
            public Builder columnType(String columnType) {
                this.columnType = columnType;
                return this;
            }

            /**
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * IsPartitionCol.
             */
            public Builder isPartitionCol(Boolean isPartitionCol) {
                this.isPartitionCol = isPartitionCol;
                return this;
            }

            /**
             * Length.
             */
            public Builder length(Integer length) {
                this.length = length;
                return this;
            }

            /**
             * SeqNumber.
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
             * ThemeId.
             */
            public Builder themeId(Long themeId) {
                this.themeId = themeId;
                return this;
            }

            /**
             * ThemeLevel.
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
