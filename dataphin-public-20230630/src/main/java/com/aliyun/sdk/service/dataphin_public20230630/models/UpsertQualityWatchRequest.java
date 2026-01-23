// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link UpsertQualityWatchRequest} extends {@link RequestModel}
 *
 * <p>UpsertQualityWatchRequest</p>
 */
public class UpsertQualityWatchRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UpsertCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private UpsertCommand upsertCommand;

    private UpsertQualityWatchRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.opTenantId = builder.opTenantId;
        this.upsertCommand = builder.upsertCommand;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpsertQualityWatchRequest create() {
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
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return upsertCommand
     */
    public UpsertCommand getUpsertCommand() {
        return this.upsertCommand;
    }

    public static final class Builder extends Request.Builder<UpsertQualityWatchRequest, Builder> {
        private String regionId; 
        private Long opTenantId; 
        private UpsertCommand upsertCommand; 

        private Builder() {
            super();
        } 

        private Builder(UpsertQualityWatchRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.opTenantId = request.opTenantId;
            this.upsertCommand = request.upsertCommand;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder upsertCommand(UpsertCommand upsertCommand) {
            String upsertCommandShrink = shrink(upsertCommand, "UpsertCommand", "json");
            this.putBodyParameter("UpsertCommand", upsertCommandShrink);
            this.upsertCommand = upsertCommand;
            return this;
        }

        @Override
        public UpsertQualityWatchRequest build() {
            return new UpsertQualityWatchRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpsertQualityWatchRequest} extends {@link TeaModel}
     *
     * <p>UpsertQualityWatchRequest</p>
     */
    public static class DataSourceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        private DataSourceInfo(Builder builder) {
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSourceInfo create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        public static final class Builder {
            private String id; 

            private Builder() {
            } 

            private Builder(DataSourceInfo model) {
                this.id = model.id;
            } 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            public DataSourceInfo build() {
                return new DataSourceInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpsertQualityWatchRequest} extends {@link TeaModel}
     *
     * <p>UpsertQualityWatchRequest</p>
     */
    public static class IndexInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizUnitId")
        private Long bizUnitId;

        @com.aliyun.core.annotation.NameInMap("CellSumLogicTableName")
        private String cellSumLogicTableName;

        @com.aliyun.core.annotation.NameInMap("ComputeType")
        private String computeType;

        @com.aliyun.core.annotation.NameInMap("DateType")
        private String dateType;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("GranularityDisplayName")
        private String granularityDisplayName;

        @com.aliyun.core.annotation.NameInMap("GranularityId")
        private Long granularityId;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private IndexInfo(Builder builder) {
            this.bizUnitId = builder.bizUnitId;
            this.cellSumLogicTableName = builder.cellSumLogicTableName;
            this.computeType = builder.computeType;
            this.dateType = builder.dateType;
            this.description = builder.description;
            this.displayName = builder.displayName;
            this.granularityDisplayName = builder.granularityDisplayName;
            this.granularityId = builder.granularityId;
            this.id = builder.id;
            this.name = builder.name;
            this.projectId = builder.projectId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IndexInfo create() {
            return builder().build();
        }

        /**
         * @return bizUnitId
         */
        public Long getBizUnitId() {
            return this.bizUnitId;
        }

        /**
         * @return cellSumLogicTableName
         */
        public String getCellSumLogicTableName() {
            return this.cellSumLogicTableName;
        }

        /**
         * @return computeType
         */
        public String getComputeType() {
            return this.computeType;
        }

        /**
         * @return dateType
         */
        public String getDateType() {
            return this.dateType;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return granularityDisplayName
         */
        public String getGranularityDisplayName() {
            return this.granularityDisplayName;
        }

        /**
         * @return granularityId
         */
        public Long getGranularityId() {
            return this.granularityId;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long bizUnitId; 
            private String cellSumLogicTableName; 
            private String computeType; 
            private String dateType; 
            private String description; 
            private String displayName; 
            private String granularityDisplayName; 
            private Long granularityId; 
            private String id; 
            private String name; 
            private Long projectId; 
            private String type; 

            private Builder() {
            } 

            private Builder(IndexInfo model) {
                this.bizUnitId = model.bizUnitId;
                this.cellSumLogicTableName = model.cellSumLogicTableName;
                this.computeType = model.computeType;
                this.dateType = model.dateType;
                this.description = model.description;
                this.displayName = model.displayName;
                this.granularityDisplayName = model.granularityDisplayName;
                this.granularityId = model.granularityId;
                this.id = model.id;
                this.name = model.name;
                this.projectId = model.projectId;
                this.type = model.type;
            } 

            /**
             * BizUnitId.
             */
            public Builder bizUnitId(Long bizUnitId) {
                this.bizUnitId = bizUnitId;
                return this;
            }

            /**
             * CellSumLogicTableName.
             */
            public Builder cellSumLogicTableName(String cellSumLogicTableName) {
                this.cellSumLogicTableName = cellSumLogicTableName;
                return this;
            }

            /**
             * ComputeType.
             */
            public Builder computeType(String computeType) {
                this.computeType = computeType;
                return this;
            }

            /**
             * DateType.
             */
            public Builder dateType(String dateType) {
                this.dateType = dateType;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * GranularityDisplayName.
             */
            public Builder granularityDisplayName(String granularityDisplayName) {
                this.granularityDisplayName = granularityDisplayName;
                return this;
            }

            /**
             * GranularityId.
             */
            public Builder granularityId(Long granularityId) {
                this.granularityId = granularityId;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public IndexInfo build() {
                return new IndexInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpsertQualityWatchRequest} extends {@link TeaModel}
     *
     * <p>UpsertQualityWatchRequest</p>
     */
    public static class TableInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        private TableInfo(Builder builder) {
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableInfo create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        public static final class Builder {
            private String id; 

            private Builder() {
            } 

            private Builder(TableInfo model) {
                this.id = model.id;
            } 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            public TableInfo build() {
                return new TableInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpsertQualityWatchRequest} extends {@link TeaModel}
     *
     * <p>UpsertQualityWatchRequest</p>
     */
    public static class UpsertCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataSourceInfo")
        private DataSourceInfo dataSourceInfo;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IndexInfo")
        private IndexInfo indexInfo;

        @com.aliyun.core.annotation.NameInMap("QualityOwner")
        @com.aliyun.core.annotation.Validation(required = true)
        private String qualityOwner;

        @com.aliyun.core.annotation.NameInMap("TableInfo")
        private TableInfo tableInfo;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private UpsertCommand(Builder builder) {
            this.dataSourceInfo = builder.dataSourceInfo;
            this.id = builder.id;
            this.indexInfo = builder.indexInfo;
            this.qualityOwner = builder.qualityOwner;
            this.tableInfo = builder.tableInfo;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpsertCommand create() {
            return builder().build();
        }

        /**
         * @return dataSourceInfo
         */
        public DataSourceInfo getDataSourceInfo() {
            return this.dataSourceInfo;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return indexInfo
         */
        public IndexInfo getIndexInfo() {
            return this.indexInfo;
        }

        /**
         * @return qualityOwner
         */
        public String getQualityOwner() {
            return this.qualityOwner;
        }

        /**
         * @return tableInfo
         */
        public TableInfo getTableInfo() {
            return this.tableInfo;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private DataSourceInfo dataSourceInfo; 
            private Long id; 
            private IndexInfo indexInfo; 
            private String qualityOwner; 
            private TableInfo tableInfo; 
            private String type; 

            private Builder() {
            } 

            private Builder(UpsertCommand model) {
                this.dataSourceInfo = model.dataSourceInfo;
                this.id = model.id;
                this.indexInfo = model.indexInfo;
                this.qualityOwner = model.qualityOwner;
                this.tableInfo = model.tableInfo;
                this.type = model.type;
            } 

            /**
             * DataSourceInfo.
             */
            public Builder dataSourceInfo(DataSourceInfo dataSourceInfo) {
                this.dataSourceInfo = dataSourceInfo;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * IndexInfo.
             */
            public Builder indexInfo(IndexInfo indexInfo) {
                this.indexInfo = indexInfo;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>30001011</p>
             */
            public Builder qualityOwner(String qualityOwner) {
                this.qualityOwner = qualityOwner;
                return this;
            }

            /**
             * TableInfo.
             */
            public Builder tableInfo(TableInfo tableInfo) {
                this.tableInfo = tableInfo;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>TABLE</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public UpsertCommand build() {
                return new UpsertCommand(this);
            } 

        } 

    }
}
