// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

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
 * {@link CreateProjectModifyRecordsRequest} extends {@link RequestModel}
 *
 * <p>CreateProjectModifyRecordsRequest</p>
 */
public class CreateProjectModifyRecordsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Databases")
    private java.util.List<Databases> databases;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TransferMapping")
    private TransferMapping transferMapping;

    private CreateProjectModifyRecordsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.databases = builder.databases;
        this.id = builder.id;
        this.transferMapping = builder.transferMapping;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProjectModifyRecordsRequest create() {
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
     * @return databases
     */
    public java.util.List<Databases> getDatabases() {
        return this.databases;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return transferMapping
     */
    public TransferMapping getTransferMapping() {
        return this.transferMapping;
    }

    public static final class Builder extends Request.Builder<CreateProjectModifyRecordsRequest, Builder> {
        private String regionId; 
        private java.util.List<Databases> databases; 
        private String id; 
        private TransferMapping transferMapping; 

        private Builder() {
            super();
        } 

        private Builder(CreateProjectModifyRecordsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.databases = request.databases;
            this.id = request.id;
            this.transferMapping = request.transferMapping;
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
         * Databases.
         */
        public Builder databases(java.util.List<Databases> databases) {
            String databasesShrink = shrink(databases, "Databases", "json");
            this.putBodyParameter("Databases", databasesShrink);
            this.databases = databases;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>np_fe****</p>
         */
        public Builder id(String id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * TransferMapping.
         */
        public Builder transferMapping(TransferMapping transferMapping) {
            String transferMappingShrink = shrink(transferMapping, "TransferMapping", "json");
            this.putBodyParameter("TransferMapping", transferMappingShrink);
            this.transferMapping = transferMapping;
            return this;
        }

        @Override
        public CreateProjectModifyRecordsRequest build() {
            return new CreateProjectModifyRecordsRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateProjectModifyRecordsRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectModifyRecordsRequest</p>
     */
    public static class AdbTableSchema extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DistributedKeys")
        private java.util.List<String> distributedKeys;

        @com.aliyun.core.annotation.NameInMap("PartitionLifeCycle")
        private String partitionLifeCycle;

        @com.aliyun.core.annotation.NameInMap("PartitionStatement")
        private String partitionStatement;

        @com.aliyun.core.annotation.NameInMap("PrimaryKeys")
        private java.util.List<String> primaryKeys;

        private AdbTableSchema(Builder builder) {
            this.distributedKeys = builder.distributedKeys;
            this.partitionLifeCycle = builder.partitionLifeCycle;
            this.partitionStatement = builder.partitionStatement;
            this.primaryKeys = builder.primaryKeys;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdbTableSchema create() {
            return builder().build();
        }

        /**
         * @return distributedKeys
         */
        public java.util.List<String> getDistributedKeys() {
            return this.distributedKeys;
        }

        /**
         * @return partitionLifeCycle
         */
        public String getPartitionLifeCycle() {
            return this.partitionLifeCycle;
        }

        /**
         * @return partitionStatement
         */
        public String getPartitionStatement() {
            return this.partitionStatement;
        }

        /**
         * @return primaryKeys
         */
        public java.util.List<String> getPrimaryKeys() {
            return this.primaryKeys;
        }

        public static final class Builder {
            private java.util.List<String> distributedKeys; 
            private String partitionLifeCycle; 
            private String partitionStatement; 
            private java.util.List<String> primaryKeys; 

            private Builder() {
            } 

            private Builder(AdbTableSchema model) {
                this.distributedKeys = model.distributedKeys;
                this.partitionLifeCycle = model.partitionLifeCycle;
                this.partitionStatement = model.partitionStatement;
                this.primaryKeys = model.primaryKeys;
            } 

            /**
             * DistributedKeys.
             */
            public Builder distributedKeys(java.util.List<String> distributedKeys) {
                this.distributedKeys = distributedKeys;
                return this;
            }

            /**
             * PartitionLifeCycle.
             */
            public Builder partitionLifeCycle(String partitionLifeCycle) {
                this.partitionLifeCycle = partitionLifeCycle;
                return this;
            }

            /**
             * PartitionStatement.
             */
            public Builder partitionStatement(String partitionStatement) {
                this.partitionStatement = partitionStatement;
                return this;
            }

            /**
             * PrimaryKeys.
             */
            public Builder primaryKeys(java.util.List<String> primaryKeys) {
                this.primaryKeys = primaryKeys;
                return this;
            }

            public AdbTableSchema build() {
                return new AdbTableSchema(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectModifyRecordsRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectModifyRecordsRequest</p>
     */
    public static class SpecificTables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdbTableSchema")
        private AdbTableSchema adbTableSchema;

        @com.aliyun.core.annotation.NameInMap("FilterColumns")
        private java.util.List<String> filterColumns;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("MappedName")
        private String mappedName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ShardColumns")
        private java.util.List<String> shardColumns;

        @com.aliyun.core.annotation.NameInMap("WhereClause")
        private String whereClause;

        private SpecificTables(Builder builder) {
            this.adbTableSchema = builder.adbTableSchema;
            this.filterColumns = builder.filterColumns;
            this.id = builder.id;
            this.mappedName = builder.mappedName;
            this.name = builder.name;
            this.shardColumns = builder.shardColumns;
            this.whereClause = builder.whereClause;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpecificTables create() {
            return builder().build();
        }

        /**
         * @return adbTableSchema
         */
        public AdbTableSchema getAdbTableSchema() {
            return this.adbTableSchema;
        }

        /**
         * @return filterColumns
         */
        public java.util.List<String> getFilterColumns() {
            return this.filterColumns;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return mappedName
         */
        public String getMappedName() {
            return this.mappedName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return shardColumns
         */
        public java.util.List<String> getShardColumns() {
            return this.shardColumns;
        }

        /**
         * @return whereClause
         */
        public String getWhereClause() {
            return this.whereClause;
        }

        public static final class Builder {
            private AdbTableSchema adbTableSchema; 
            private java.util.List<String> filterColumns; 
            private String id; 
            private String mappedName; 
            private String name; 
            private java.util.List<String> shardColumns; 
            private String whereClause; 

            private Builder() {
            } 

            private Builder(SpecificTables model) {
                this.adbTableSchema = model.adbTableSchema;
                this.filterColumns = model.filterColumns;
                this.id = model.id;
                this.mappedName = model.mappedName;
                this.name = model.name;
                this.shardColumns = model.shardColumns;
                this.whereClause = model.whereClause;
            } 

            /**
             * AdbTableSchema.
             */
            public Builder adbTableSchema(AdbTableSchema adbTableSchema) {
                this.adbTableSchema = adbTableSchema;
                return this;
            }

            /**
             * FilterColumns.
             */
            public Builder filterColumns(java.util.List<String> filterColumns) {
                this.filterColumns = filterColumns;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>np_fe****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * MappedName.
             */
            public Builder mappedName(String mappedName) {
                this.mappedName = mappedName;
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
             * ShardColumns.
             */
            public Builder shardColumns(java.util.List<String> shardColumns) {
                this.shardColumns = shardColumns;
                return this;
            }

            /**
             * WhereClause.
             */
            public Builder whereClause(String whereClause) {
                this.whereClause = whereClause;
                return this;
            }

            public SpecificTables build() {
                return new SpecificTables(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectModifyRecordsRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectModifyRecordsRequest</p>
     */
    public static class SpecificViewsAdbTableSchema extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DistributedKeys")
        private java.util.List<String> distributedKeys;

        @com.aliyun.core.annotation.NameInMap("PartitionLifeCycle")
        private String partitionLifeCycle;

        @com.aliyun.core.annotation.NameInMap("PartitionStatement")
        private String partitionStatement;

        @com.aliyun.core.annotation.NameInMap("PrimaryKeys")
        private java.util.List<String> primaryKeys;

        private SpecificViewsAdbTableSchema(Builder builder) {
            this.distributedKeys = builder.distributedKeys;
            this.partitionLifeCycle = builder.partitionLifeCycle;
            this.partitionStatement = builder.partitionStatement;
            this.primaryKeys = builder.primaryKeys;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpecificViewsAdbTableSchema create() {
            return builder().build();
        }

        /**
         * @return distributedKeys
         */
        public java.util.List<String> getDistributedKeys() {
            return this.distributedKeys;
        }

        /**
         * @return partitionLifeCycle
         */
        public String getPartitionLifeCycle() {
            return this.partitionLifeCycle;
        }

        /**
         * @return partitionStatement
         */
        public String getPartitionStatement() {
            return this.partitionStatement;
        }

        /**
         * @return primaryKeys
         */
        public java.util.List<String> getPrimaryKeys() {
            return this.primaryKeys;
        }

        public static final class Builder {
            private java.util.List<String> distributedKeys; 
            private String partitionLifeCycle; 
            private String partitionStatement; 
            private java.util.List<String> primaryKeys; 

            private Builder() {
            } 

            private Builder(SpecificViewsAdbTableSchema model) {
                this.distributedKeys = model.distributedKeys;
                this.partitionLifeCycle = model.partitionLifeCycle;
                this.partitionStatement = model.partitionStatement;
                this.primaryKeys = model.primaryKeys;
            } 

            /**
             * DistributedKeys.
             */
            public Builder distributedKeys(java.util.List<String> distributedKeys) {
                this.distributedKeys = distributedKeys;
                return this;
            }

            /**
             * PartitionLifeCycle.
             */
            public Builder partitionLifeCycle(String partitionLifeCycle) {
                this.partitionLifeCycle = partitionLifeCycle;
                return this;
            }

            /**
             * PartitionStatement.
             */
            public Builder partitionStatement(String partitionStatement) {
                this.partitionStatement = partitionStatement;
                return this;
            }

            /**
             * PrimaryKeys.
             */
            public Builder primaryKeys(java.util.List<String> primaryKeys) {
                this.primaryKeys = primaryKeys;
                return this;
            }

            public SpecificViewsAdbTableSchema build() {
                return new SpecificViewsAdbTableSchema(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectModifyRecordsRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectModifyRecordsRequest</p>
     */
    public static class SpecificViews extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdbTableSchema")
        private SpecificViewsAdbTableSchema adbTableSchema;

        @com.aliyun.core.annotation.NameInMap("FilterColumns")
        private java.util.List<String> filterColumns;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("MappedName")
        private String mappedName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ShardColumns")
        private java.util.List<String> shardColumns;

        @com.aliyun.core.annotation.NameInMap("WhereClause")
        private String whereClause;

        private SpecificViews(Builder builder) {
            this.adbTableSchema = builder.adbTableSchema;
            this.filterColumns = builder.filterColumns;
            this.id = builder.id;
            this.mappedName = builder.mappedName;
            this.name = builder.name;
            this.shardColumns = builder.shardColumns;
            this.whereClause = builder.whereClause;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpecificViews create() {
            return builder().build();
        }

        /**
         * @return adbTableSchema
         */
        public SpecificViewsAdbTableSchema getAdbTableSchema() {
            return this.adbTableSchema;
        }

        /**
         * @return filterColumns
         */
        public java.util.List<String> getFilterColumns() {
            return this.filterColumns;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return mappedName
         */
        public String getMappedName() {
            return this.mappedName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return shardColumns
         */
        public java.util.List<String> getShardColumns() {
            return this.shardColumns;
        }

        /**
         * @return whereClause
         */
        public String getWhereClause() {
            return this.whereClause;
        }

        public static final class Builder {
            private SpecificViewsAdbTableSchema adbTableSchema; 
            private java.util.List<String> filterColumns; 
            private String id; 
            private String mappedName; 
            private String name; 
            private java.util.List<String> shardColumns; 
            private String whereClause; 

            private Builder() {
            } 

            private Builder(SpecificViews model) {
                this.adbTableSchema = model.adbTableSchema;
                this.filterColumns = model.filterColumns;
                this.id = model.id;
                this.mappedName = model.mappedName;
                this.name = model.name;
                this.shardColumns = model.shardColumns;
                this.whereClause = model.whereClause;
            } 

            /**
             * AdbTableSchema.
             */
            public Builder adbTableSchema(SpecificViewsAdbTableSchema adbTableSchema) {
                this.adbTableSchema = adbTableSchema;
                return this;
            }

            /**
             * FilterColumns.
             */
            public Builder filterColumns(java.util.List<String> filterColumns) {
                this.filterColumns = filterColumns;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>np_fe****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * MappedName.
             */
            public Builder mappedName(String mappedName) {
                this.mappedName = mappedName;
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
             * ShardColumns.
             */
            public Builder shardColumns(java.util.List<String> shardColumns) {
                this.shardColumns = shardColumns;
                return this;
            }

            /**
             * WhereClause.
             */
            public Builder whereClause(String whereClause) {
                this.whereClause = whereClause;
                return this;
            }

            public SpecificViews build() {
                return new SpecificViews(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectModifyRecordsRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectModifyRecordsRequest</p>
     */
    public static class TablesAdbTableSchema extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DistributedKeys")
        private java.util.List<String> distributedKeys;

        @com.aliyun.core.annotation.NameInMap("PartitionLifeCycle")
        private String partitionLifeCycle;

        @com.aliyun.core.annotation.NameInMap("PartitionStatement")
        private String partitionStatement;

        @com.aliyun.core.annotation.NameInMap("PrimaryKeys")
        private java.util.List<String> primaryKeys;

        private TablesAdbTableSchema(Builder builder) {
            this.distributedKeys = builder.distributedKeys;
            this.partitionLifeCycle = builder.partitionLifeCycle;
            this.partitionStatement = builder.partitionStatement;
            this.primaryKeys = builder.primaryKeys;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TablesAdbTableSchema create() {
            return builder().build();
        }

        /**
         * @return distributedKeys
         */
        public java.util.List<String> getDistributedKeys() {
            return this.distributedKeys;
        }

        /**
         * @return partitionLifeCycle
         */
        public String getPartitionLifeCycle() {
            return this.partitionLifeCycle;
        }

        /**
         * @return partitionStatement
         */
        public String getPartitionStatement() {
            return this.partitionStatement;
        }

        /**
         * @return primaryKeys
         */
        public java.util.List<String> getPrimaryKeys() {
            return this.primaryKeys;
        }

        public static final class Builder {
            private java.util.List<String> distributedKeys; 
            private String partitionLifeCycle; 
            private String partitionStatement; 
            private java.util.List<String> primaryKeys; 

            private Builder() {
            } 

            private Builder(TablesAdbTableSchema model) {
                this.distributedKeys = model.distributedKeys;
                this.partitionLifeCycle = model.partitionLifeCycle;
                this.partitionStatement = model.partitionStatement;
                this.primaryKeys = model.primaryKeys;
            } 

            /**
             * DistributedKeys.
             */
            public Builder distributedKeys(java.util.List<String> distributedKeys) {
                this.distributedKeys = distributedKeys;
                return this;
            }

            /**
             * PartitionLifeCycle.
             */
            public Builder partitionLifeCycle(String partitionLifeCycle) {
                this.partitionLifeCycle = partitionLifeCycle;
                return this;
            }

            /**
             * PartitionStatement.
             */
            public Builder partitionStatement(String partitionStatement) {
                this.partitionStatement = partitionStatement;
                return this;
            }

            /**
             * PrimaryKeys.
             */
            public Builder primaryKeys(java.util.List<String> primaryKeys) {
                this.primaryKeys = primaryKeys;
                return this;
            }

            public TablesAdbTableSchema build() {
                return new TablesAdbTableSchema(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectModifyRecordsRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectModifyRecordsRequest</p>
     */
    public static class ObkvPartitionConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PartitionSize")
        @com.aliyun.core.annotation.Validation(maximum = 1024, minimum = 1)
        private Integer partitionSize;

        @com.aliyun.core.annotation.NameInMap("PartitionType")
        private String partitionType;

        @com.aliyun.core.annotation.NameInMap("VirtualColumn")
        private String virtualColumn;

        private ObkvPartitionConfig(Builder builder) {
            this.partitionSize = builder.partitionSize;
            this.partitionType = builder.partitionType;
            this.virtualColumn = builder.virtualColumn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ObkvPartitionConfig create() {
            return builder().build();
        }

        /**
         * @return partitionSize
         */
        public Integer getPartitionSize() {
            return this.partitionSize;
        }

        /**
         * @return partitionType
         */
        public String getPartitionType() {
            return this.partitionType;
        }

        /**
         * @return virtualColumn
         */
        public String getVirtualColumn() {
            return this.virtualColumn;
        }

        public static final class Builder {
            private Integer partitionSize; 
            private String partitionType; 
            private String virtualColumn; 

            private Builder() {
            } 

            private Builder(ObkvPartitionConfig model) {
                this.partitionSize = model.partitionSize;
                this.partitionType = model.partitionType;
                this.virtualColumn = model.virtualColumn;
            } 

            /**
             * PartitionSize.
             */
            public Builder partitionSize(Integer partitionSize) {
                this.partitionSize = partitionSize;
                return this;
            }

            /**
             * PartitionType.
             */
            public Builder partitionType(String partitionType) {
                this.partitionType = partitionType;
                return this;
            }

            /**
             * VirtualColumn.
             */
            public Builder virtualColumn(String virtualColumn) {
                this.virtualColumn = virtualColumn;
                return this;
            }

            public ObkvPartitionConfig build() {
                return new ObkvPartitionConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectModifyRecordsRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectModifyRecordsRequest</p>
     */
    public static class Tables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdbTableSchema")
        private TablesAdbTableSchema adbTableSchema;

        @com.aliyun.core.annotation.NameInMap("FilterColumns")
        private java.util.List<String> filterColumns;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("MappedName")
        private String mappedName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ObkvPartitionConfig")
        private ObkvPartitionConfig obkvPartitionConfig;

        @com.aliyun.core.annotation.NameInMap("ShardColumns")
        private java.util.List<String> shardColumns;

        @com.aliyun.core.annotation.NameInMap("WhereClause")
        private String whereClause;

        private Tables(Builder builder) {
            this.adbTableSchema = builder.adbTableSchema;
            this.filterColumns = builder.filterColumns;
            this.id = builder.id;
            this.mappedName = builder.mappedName;
            this.name = builder.name;
            this.obkvPartitionConfig = builder.obkvPartitionConfig;
            this.shardColumns = builder.shardColumns;
            this.whereClause = builder.whereClause;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tables create() {
            return builder().build();
        }

        /**
         * @return adbTableSchema
         */
        public TablesAdbTableSchema getAdbTableSchema() {
            return this.adbTableSchema;
        }

        /**
         * @return filterColumns
         */
        public java.util.List<String> getFilterColumns() {
            return this.filterColumns;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return mappedName
         */
        public String getMappedName() {
            return this.mappedName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return obkvPartitionConfig
         */
        public ObkvPartitionConfig getObkvPartitionConfig() {
            return this.obkvPartitionConfig;
        }

        /**
         * @return shardColumns
         */
        public java.util.List<String> getShardColumns() {
            return this.shardColumns;
        }

        /**
         * @return whereClause
         */
        public String getWhereClause() {
            return this.whereClause;
        }

        public static final class Builder {
            private TablesAdbTableSchema adbTableSchema; 
            private java.util.List<String> filterColumns; 
            private String id; 
            private String mappedName; 
            private String name; 
            private ObkvPartitionConfig obkvPartitionConfig; 
            private java.util.List<String> shardColumns; 
            private String whereClause; 

            private Builder() {
            } 

            private Builder(Tables model) {
                this.adbTableSchema = model.adbTableSchema;
                this.filterColumns = model.filterColumns;
                this.id = model.id;
                this.mappedName = model.mappedName;
                this.name = model.name;
                this.obkvPartitionConfig = model.obkvPartitionConfig;
                this.shardColumns = model.shardColumns;
                this.whereClause = model.whereClause;
            } 

            /**
             * AdbTableSchema.
             */
            public Builder adbTableSchema(TablesAdbTableSchema adbTableSchema) {
                this.adbTableSchema = adbTableSchema;
                return this;
            }

            /**
             * FilterColumns.
             */
            public Builder filterColumns(java.util.List<String> filterColumns) {
                this.filterColumns = filterColumns;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>np_fe****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * MappedName.
             */
            public Builder mappedName(String mappedName) {
                this.mappedName = mappedName;
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
             * ObkvPartitionConfig.
             */
            public Builder obkvPartitionConfig(ObkvPartitionConfig obkvPartitionConfig) {
                this.obkvPartitionConfig = obkvPartitionConfig;
                return this;
            }

            /**
             * ShardColumns.
             */
            public Builder shardColumns(java.util.List<String> shardColumns) {
                this.shardColumns = shardColumns;
                return this;
            }

            /**
             * WhereClause.
             */
            public Builder whereClause(String whereClause) {
                this.whereClause = whereClause;
                return this;
            }

            public Tables build() {
                return new Tables(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectModifyRecordsRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectModifyRecordsRequest</p>
     */
    public static class ViewsAdbTableSchema extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DistributedKeys")
        private java.util.List<String> distributedKeys;

        @com.aliyun.core.annotation.NameInMap("PartitionLifeCycle")
        private String partitionLifeCycle;

        @com.aliyun.core.annotation.NameInMap("PartitionStatement")
        private String partitionStatement;

        @com.aliyun.core.annotation.NameInMap("PrimaryKeys")
        private java.util.List<String> primaryKeys;

        private ViewsAdbTableSchema(Builder builder) {
            this.distributedKeys = builder.distributedKeys;
            this.partitionLifeCycle = builder.partitionLifeCycle;
            this.partitionStatement = builder.partitionStatement;
            this.primaryKeys = builder.primaryKeys;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ViewsAdbTableSchema create() {
            return builder().build();
        }

        /**
         * @return distributedKeys
         */
        public java.util.List<String> getDistributedKeys() {
            return this.distributedKeys;
        }

        /**
         * @return partitionLifeCycle
         */
        public String getPartitionLifeCycle() {
            return this.partitionLifeCycle;
        }

        /**
         * @return partitionStatement
         */
        public String getPartitionStatement() {
            return this.partitionStatement;
        }

        /**
         * @return primaryKeys
         */
        public java.util.List<String> getPrimaryKeys() {
            return this.primaryKeys;
        }

        public static final class Builder {
            private java.util.List<String> distributedKeys; 
            private String partitionLifeCycle; 
            private String partitionStatement; 
            private java.util.List<String> primaryKeys; 

            private Builder() {
            } 

            private Builder(ViewsAdbTableSchema model) {
                this.distributedKeys = model.distributedKeys;
                this.partitionLifeCycle = model.partitionLifeCycle;
                this.partitionStatement = model.partitionStatement;
                this.primaryKeys = model.primaryKeys;
            } 

            /**
             * DistributedKeys.
             */
            public Builder distributedKeys(java.util.List<String> distributedKeys) {
                this.distributedKeys = distributedKeys;
                return this;
            }

            /**
             * PartitionLifeCycle.
             */
            public Builder partitionLifeCycle(String partitionLifeCycle) {
                this.partitionLifeCycle = partitionLifeCycle;
                return this;
            }

            /**
             * PartitionStatement.
             */
            public Builder partitionStatement(String partitionStatement) {
                this.partitionStatement = partitionStatement;
                return this;
            }

            /**
             * PrimaryKeys.
             */
            public Builder primaryKeys(java.util.List<String> primaryKeys) {
                this.primaryKeys = primaryKeys;
                return this;
            }

            public ViewsAdbTableSchema build() {
                return new ViewsAdbTableSchema(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectModifyRecordsRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectModifyRecordsRequest</p>
     */
    public static class Views extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdbTableSchema")
        private ViewsAdbTableSchema adbTableSchema;

        @com.aliyun.core.annotation.NameInMap("FilterColumns")
        private java.util.List<String> filterColumns;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("MappedName")
        private String mappedName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ShardColumns")
        private java.util.List<String> shardColumns;

        @com.aliyun.core.annotation.NameInMap("WhereClause")
        private String whereClause;

        private Views(Builder builder) {
            this.adbTableSchema = builder.adbTableSchema;
            this.filterColumns = builder.filterColumns;
            this.id = builder.id;
            this.mappedName = builder.mappedName;
            this.name = builder.name;
            this.shardColumns = builder.shardColumns;
            this.whereClause = builder.whereClause;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Views create() {
            return builder().build();
        }

        /**
         * @return adbTableSchema
         */
        public ViewsAdbTableSchema getAdbTableSchema() {
            return this.adbTableSchema;
        }

        /**
         * @return filterColumns
         */
        public java.util.List<String> getFilterColumns() {
            return this.filterColumns;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return mappedName
         */
        public String getMappedName() {
            return this.mappedName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return shardColumns
         */
        public java.util.List<String> getShardColumns() {
            return this.shardColumns;
        }

        /**
         * @return whereClause
         */
        public String getWhereClause() {
            return this.whereClause;
        }

        public static final class Builder {
            private ViewsAdbTableSchema adbTableSchema; 
            private java.util.List<String> filterColumns; 
            private String id; 
            private String mappedName; 
            private String name; 
            private java.util.List<String> shardColumns; 
            private String whereClause; 

            private Builder() {
            } 

            private Builder(Views model) {
                this.adbTableSchema = model.adbTableSchema;
                this.filterColumns = model.filterColumns;
                this.id = model.id;
                this.mappedName = model.mappedName;
                this.name = model.name;
                this.shardColumns = model.shardColumns;
                this.whereClause = model.whereClause;
            } 

            /**
             * AdbTableSchema.
             */
            public Builder adbTableSchema(ViewsAdbTableSchema adbTableSchema) {
                this.adbTableSchema = adbTableSchema;
                return this;
            }

            /**
             * FilterColumns.
             */
            public Builder filterColumns(java.util.List<String> filterColumns) {
                this.filterColumns = filterColumns;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>np_fe****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * MappedName.
             */
            public Builder mappedName(String mappedName) {
                this.mappedName = mappedName;
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
             * ShardColumns.
             */
            public Builder shardColumns(java.util.List<String> shardColumns) {
                this.shardColumns = shardColumns;
                return this;
            }

            /**
             * WhereClause.
             */
            public Builder whereClause(String whereClause) {
                this.whereClause = whereClause;
                return this;
            }

            public Views build() {
                return new Views(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectModifyRecordsRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectModifyRecordsRequest</p>
     */
    public static class Databases extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("MappedName")
        private String mappedName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SpecificTables")
        private java.util.List<SpecificTables> specificTables;

        @com.aliyun.core.annotation.NameInMap("SpecificViews")
        private java.util.List<SpecificViews> specificViews;

        @com.aliyun.core.annotation.NameInMap("Tables")
        private java.util.List<Tables> tables;

        @com.aliyun.core.annotation.NameInMap("Views")
        private java.util.List<Views> views;

        private Databases(Builder builder) {
            this.id = builder.id;
            this.mappedName = builder.mappedName;
            this.name = builder.name;
            this.specificTables = builder.specificTables;
            this.specificViews = builder.specificViews;
            this.tables = builder.tables;
            this.views = builder.views;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Databases create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return mappedName
         */
        public String getMappedName() {
            return this.mappedName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return specificTables
         */
        public java.util.List<SpecificTables> getSpecificTables() {
            return this.specificTables;
        }

        /**
         * @return specificViews
         */
        public java.util.List<SpecificViews> getSpecificViews() {
            return this.specificViews;
        }

        /**
         * @return tables
         */
        public java.util.List<Tables> getTables() {
            return this.tables;
        }

        /**
         * @return views
         */
        public java.util.List<Views> getViews() {
            return this.views;
        }

        public static final class Builder {
            private String id; 
            private String mappedName; 
            private String name; 
            private java.util.List<SpecificTables> specificTables; 
            private java.util.List<SpecificViews> specificViews; 
            private java.util.List<Tables> tables; 
            private java.util.List<Views> views; 

            private Builder() {
            } 

            private Builder(Databases model) {
                this.id = model.id;
                this.mappedName = model.mappedName;
                this.name = model.name;
                this.specificTables = model.specificTables;
                this.specificViews = model.specificViews;
                this.tables = model.tables;
                this.views = model.views;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>np_fe****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * MappedName.
             */
            public Builder mappedName(String mappedName) {
                this.mappedName = mappedName;
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
             * SpecificTables.
             */
            public Builder specificTables(java.util.List<SpecificTables> specificTables) {
                this.specificTables = specificTables;
                return this;
            }

            /**
             * SpecificViews.
             */
            public Builder specificViews(java.util.List<SpecificViews> specificViews) {
                this.specificViews = specificViews;
                return this;
            }

            /**
             * Tables.
             */
            public Builder tables(java.util.List<Tables> tables) {
                this.tables = tables;
                return this;
            }

            /**
             * Views.
             */
            public Builder views(java.util.List<Views> views) {
                this.views = views;
                return this;
            }

            public Databases build() {
                return new Databases(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectModifyRecordsRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectModifyRecordsRequest</p>
     */
    public static class ObjectMapping extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MappedName")
        private String mappedName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private ObjectMapping(Builder builder) {
            this.mappedName = builder.mappedName;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ObjectMapping create() {
            return builder().build();
        }

        /**
         * @return mappedName
         */
        public String getMappedName() {
            return this.mappedName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String mappedName; 
            private String name; 

            private Builder() {
            } 

            private Builder(ObjectMapping model) {
                this.mappedName = model.mappedName;
                this.name = model.name;
            } 

            /**
             * MappedName.
             */
            public Builder mappedName(String mappedName) {
                this.mappedName = mappedName;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public ObjectMapping build() {
                return new ObjectMapping(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectModifyRecordsRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectModifyRecordsRequest</p>
     */
    public static class SchemaMapping extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MappedName")
        private String mappedName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private SchemaMapping(Builder builder) {
            this.mappedName = builder.mappedName;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SchemaMapping create() {
            return builder().build();
        }

        /**
         * @return mappedName
         */
        public String getMappedName() {
            return this.mappedName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String mappedName; 
            private String name; 

            private Builder() {
            } 

            private Builder(SchemaMapping model) {
                this.mappedName = model.mappedName;
                this.name = model.name;
            } 

            /**
             * MappedName.
             */
            public Builder mappedName(String mappedName) {
                this.mappedName = mappedName;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public SchemaMapping build() {
                return new SchemaMapping(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectModifyRecordsRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectModifyRecordsRequest</p>
     */
    public static class BlackTableRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ObjectMapping")
        private ObjectMapping objectMapping;

        @com.aliyun.core.annotation.NameInMap("SchemaMapping")
        private SchemaMapping schemaMapping;

        private BlackTableRules(Builder builder) {
            this.objectMapping = builder.objectMapping;
            this.schemaMapping = builder.schemaMapping;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BlackTableRules create() {
            return builder().build();
        }

        /**
         * @return objectMapping
         */
        public ObjectMapping getObjectMapping() {
            return this.objectMapping;
        }

        /**
         * @return schemaMapping
         */
        public SchemaMapping getSchemaMapping() {
            return this.schemaMapping;
        }

        public static final class Builder {
            private ObjectMapping objectMapping; 
            private SchemaMapping schemaMapping; 

            private Builder() {
            } 

            private Builder(BlackTableRules model) {
                this.objectMapping = model.objectMapping;
                this.schemaMapping = model.schemaMapping;
            } 

            /**
             * ObjectMapping.
             */
            public Builder objectMapping(ObjectMapping objectMapping) {
                this.objectMapping = objectMapping;
                return this;
            }

            /**
             * SchemaMapping.
             */
            public Builder schemaMapping(SchemaMapping schemaMapping) {
                this.schemaMapping = schemaMapping;
                return this;
            }

            public BlackTableRules build() {
                return new BlackTableRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectModifyRecordsRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectModifyRecordsRequest</p>
     */
    public static class BlackViewRulesObjectMapping extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MappedName")
        private String mappedName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private BlackViewRulesObjectMapping(Builder builder) {
            this.mappedName = builder.mappedName;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BlackViewRulesObjectMapping create() {
            return builder().build();
        }

        /**
         * @return mappedName
         */
        public String getMappedName() {
            return this.mappedName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String mappedName; 
            private String name; 

            private Builder() {
            } 

            private Builder(BlackViewRulesObjectMapping model) {
                this.mappedName = model.mappedName;
                this.name = model.name;
            } 

            /**
             * MappedName.
             */
            public Builder mappedName(String mappedName) {
                this.mappedName = mappedName;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public BlackViewRulesObjectMapping build() {
                return new BlackViewRulesObjectMapping(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectModifyRecordsRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectModifyRecordsRequest</p>
     */
    public static class BlackViewRulesSchemaMapping extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MappedName")
        private String mappedName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private BlackViewRulesSchemaMapping(Builder builder) {
            this.mappedName = builder.mappedName;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BlackViewRulesSchemaMapping create() {
            return builder().build();
        }

        /**
         * @return mappedName
         */
        public String getMappedName() {
            return this.mappedName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String mappedName; 
            private String name; 

            private Builder() {
            } 

            private Builder(BlackViewRulesSchemaMapping model) {
                this.mappedName = model.mappedName;
                this.name = model.name;
            } 

            /**
             * MappedName.
             */
            public Builder mappedName(String mappedName) {
                this.mappedName = mappedName;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public BlackViewRulesSchemaMapping build() {
                return new BlackViewRulesSchemaMapping(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectModifyRecordsRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectModifyRecordsRequest</p>
     */
    public static class BlackViewRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ObjectMapping")
        private BlackViewRulesObjectMapping objectMapping;

        @com.aliyun.core.annotation.NameInMap("SchemaMapping")
        private BlackViewRulesSchemaMapping schemaMapping;

        private BlackViewRules(Builder builder) {
            this.objectMapping = builder.objectMapping;
            this.schemaMapping = builder.schemaMapping;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BlackViewRules create() {
            return builder().build();
        }

        /**
         * @return objectMapping
         */
        public BlackViewRulesObjectMapping getObjectMapping() {
            return this.objectMapping;
        }

        /**
         * @return schemaMapping
         */
        public BlackViewRulesSchemaMapping getSchemaMapping() {
            return this.schemaMapping;
        }

        public static final class Builder {
            private BlackViewRulesObjectMapping objectMapping; 
            private BlackViewRulesSchemaMapping schemaMapping; 

            private Builder() {
            } 

            private Builder(BlackViewRules model) {
                this.objectMapping = model.objectMapping;
                this.schemaMapping = model.schemaMapping;
            } 

            /**
             * ObjectMapping.
             */
            public Builder objectMapping(BlackViewRulesObjectMapping objectMapping) {
                this.objectMapping = objectMapping;
                return this;
            }

            /**
             * SchemaMapping.
             */
            public Builder schemaMapping(BlackViewRulesSchemaMapping schemaMapping) {
                this.schemaMapping = schemaMapping;
                return this;
            }

            public BlackViewRules build() {
                return new BlackViewRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectModifyRecordsRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectModifyRecordsRequest</p>
     */
    public static class SpecificTablesAdbTableSchema extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DistributedKeys")
        private java.util.List<String> distributedKeys;

        @com.aliyun.core.annotation.NameInMap("PartitionLifeCycle")
        private String partitionLifeCycle;

        @com.aliyun.core.annotation.NameInMap("PartitionStatement")
        private String partitionStatement;

        @com.aliyun.core.annotation.NameInMap("PrimaryKeys")
        private java.util.List<String> primaryKeys;

        private SpecificTablesAdbTableSchema(Builder builder) {
            this.distributedKeys = builder.distributedKeys;
            this.partitionLifeCycle = builder.partitionLifeCycle;
            this.partitionStatement = builder.partitionStatement;
            this.primaryKeys = builder.primaryKeys;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpecificTablesAdbTableSchema create() {
            return builder().build();
        }

        /**
         * @return distributedKeys
         */
        public java.util.List<String> getDistributedKeys() {
            return this.distributedKeys;
        }

        /**
         * @return partitionLifeCycle
         */
        public String getPartitionLifeCycle() {
            return this.partitionLifeCycle;
        }

        /**
         * @return partitionStatement
         */
        public String getPartitionStatement() {
            return this.partitionStatement;
        }

        /**
         * @return primaryKeys
         */
        public java.util.List<String> getPrimaryKeys() {
            return this.primaryKeys;
        }

        public static final class Builder {
            private java.util.List<String> distributedKeys; 
            private String partitionLifeCycle; 
            private String partitionStatement; 
            private java.util.List<String> primaryKeys; 

            private Builder() {
            } 

            private Builder(SpecificTablesAdbTableSchema model) {
                this.distributedKeys = model.distributedKeys;
                this.partitionLifeCycle = model.partitionLifeCycle;
                this.partitionStatement = model.partitionStatement;
                this.primaryKeys = model.primaryKeys;
            } 

            /**
             * DistributedKeys.
             */
            public Builder distributedKeys(java.util.List<String> distributedKeys) {
                this.distributedKeys = distributedKeys;
                return this;
            }

            /**
             * PartitionLifeCycle.
             */
            public Builder partitionLifeCycle(String partitionLifeCycle) {
                this.partitionLifeCycle = partitionLifeCycle;
                return this;
            }

            /**
             * PartitionStatement.
             */
            public Builder partitionStatement(String partitionStatement) {
                this.partitionStatement = partitionStatement;
                return this;
            }

            /**
             * PrimaryKeys.
             */
            public Builder primaryKeys(java.util.List<String> primaryKeys) {
                this.primaryKeys = primaryKeys;
                return this;
            }

            public SpecificTablesAdbTableSchema build() {
                return new SpecificTablesAdbTableSchema(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectModifyRecordsRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectModifyRecordsRequest</p>
     */
    public static class DatabasesSpecificTables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdbTableSchema")
        private SpecificTablesAdbTableSchema adbTableSchema;

        @com.aliyun.core.annotation.NameInMap("FilterColumns")
        private java.util.List<String> filterColumns;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("MappedName")
        private String mappedName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ShardColumns")
        private java.util.List<String> shardColumns;

        @com.aliyun.core.annotation.NameInMap("WhereClause")
        private String whereClause;

        private DatabasesSpecificTables(Builder builder) {
            this.adbTableSchema = builder.adbTableSchema;
            this.filterColumns = builder.filterColumns;
            this.id = builder.id;
            this.mappedName = builder.mappedName;
            this.name = builder.name;
            this.shardColumns = builder.shardColumns;
            this.whereClause = builder.whereClause;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DatabasesSpecificTables create() {
            return builder().build();
        }

        /**
         * @return adbTableSchema
         */
        public SpecificTablesAdbTableSchema getAdbTableSchema() {
            return this.adbTableSchema;
        }

        /**
         * @return filterColumns
         */
        public java.util.List<String> getFilterColumns() {
            return this.filterColumns;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return mappedName
         */
        public String getMappedName() {
            return this.mappedName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return shardColumns
         */
        public java.util.List<String> getShardColumns() {
            return this.shardColumns;
        }

        /**
         * @return whereClause
         */
        public String getWhereClause() {
            return this.whereClause;
        }

        public static final class Builder {
            private SpecificTablesAdbTableSchema adbTableSchema; 
            private java.util.List<String> filterColumns; 
            private String id; 
            private String mappedName; 
            private String name; 
            private java.util.List<String> shardColumns; 
            private String whereClause; 

            private Builder() {
            } 

            private Builder(DatabasesSpecificTables model) {
                this.adbTableSchema = model.adbTableSchema;
                this.filterColumns = model.filterColumns;
                this.id = model.id;
                this.mappedName = model.mappedName;
                this.name = model.name;
                this.shardColumns = model.shardColumns;
                this.whereClause = model.whereClause;
            } 

            /**
             * AdbTableSchema.
             */
            public Builder adbTableSchema(SpecificTablesAdbTableSchema adbTableSchema) {
                this.adbTableSchema = adbTableSchema;
                return this;
            }

            /**
             * FilterColumns.
             */
            public Builder filterColumns(java.util.List<String> filterColumns) {
                this.filterColumns = filterColumns;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>np_fe****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * MappedName.
             */
            public Builder mappedName(String mappedName) {
                this.mappedName = mappedName;
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
             * ShardColumns.
             */
            public Builder shardColumns(java.util.List<String> shardColumns) {
                this.shardColumns = shardColumns;
                return this;
            }

            /**
             * WhereClause.
             */
            public Builder whereClause(String whereClause) {
                this.whereClause = whereClause;
                return this;
            }

            public DatabasesSpecificTables build() {
                return new DatabasesSpecificTables(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectModifyRecordsRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectModifyRecordsRequest</p>
     */
    public static class DatabasesSpecificViewsAdbTableSchema extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DistributedKeys")
        private java.util.List<String> distributedKeys;

        @com.aliyun.core.annotation.NameInMap("PartitionLifeCycle")
        private String partitionLifeCycle;

        @com.aliyun.core.annotation.NameInMap("PartitionStatement")
        private String partitionStatement;

        @com.aliyun.core.annotation.NameInMap("PrimaryKeys")
        private java.util.List<String> primaryKeys;

        private DatabasesSpecificViewsAdbTableSchema(Builder builder) {
            this.distributedKeys = builder.distributedKeys;
            this.partitionLifeCycle = builder.partitionLifeCycle;
            this.partitionStatement = builder.partitionStatement;
            this.primaryKeys = builder.primaryKeys;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DatabasesSpecificViewsAdbTableSchema create() {
            return builder().build();
        }

        /**
         * @return distributedKeys
         */
        public java.util.List<String> getDistributedKeys() {
            return this.distributedKeys;
        }

        /**
         * @return partitionLifeCycle
         */
        public String getPartitionLifeCycle() {
            return this.partitionLifeCycle;
        }

        /**
         * @return partitionStatement
         */
        public String getPartitionStatement() {
            return this.partitionStatement;
        }

        /**
         * @return primaryKeys
         */
        public java.util.List<String> getPrimaryKeys() {
            return this.primaryKeys;
        }

        public static final class Builder {
            private java.util.List<String> distributedKeys; 
            private String partitionLifeCycle; 
            private String partitionStatement; 
            private java.util.List<String> primaryKeys; 

            private Builder() {
            } 

            private Builder(DatabasesSpecificViewsAdbTableSchema model) {
                this.distributedKeys = model.distributedKeys;
                this.partitionLifeCycle = model.partitionLifeCycle;
                this.partitionStatement = model.partitionStatement;
                this.primaryKeys = model.primaryKeys;
            } 

            /**
             * DistributedKeys.
             */
            public Builder distributedKeys(java.util.List<String> distributedKeys) {
                this.distributedKeys = distributedKeys;
                return this;
            }

            /**
             * PartitionLifeCycle.
             */
            public Builder partitionLifeCycle(String partitionLifeCycle) {
                this.partitionLifeCycle = partitionLifeCycle;
                return this;
            }

            /**
             * PartitionStatement.
             */
            public Builder partitionStatement(String partitionStatement) {
                this.partitionStatement = partitionStatement;
                return this;
            }

            /**
             * PrimaryKeys.
             */
            public Builder primaryKeys(java.util.List<String> primaryKeys) {
                this.primaryKeys = primaryKeys;
                return this;
            }

            public DatabasesSpecificViewsAdbTableSchema build() {
                return new DatabasesSpecificViewsAdbTableSchema(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectModifyRecordsRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectModifyRecordsRequest</p>
     */
    public static class DatabasesSpecificViews extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdbTableSchema")
        private DatabasesSpecificViewsAdbTableSchema adbTableSchema;

        @com.aliyun.core.annotation.NameInMap("FilterColumns")
        private java.util.List<String> filterColumns;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("MappedName")
        private String mappedName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ShardColumns")
        private java.util.List<String> shardColumns;

        @com.aliyun.core.annotation.NameInMap("WhereClause")
        private String whereClause;

        private DatabasesSpecificViews(Builder builder) {
            this.adbTableSchema = builder.adbTableSchema;
            this.filterColumns = builder.filterColumns;
            this.id = builder.id;
            this.mappedName = builder.mappedName;
            this.name = builder.name;
            this.shardColumns = builder.shardColumns;
            this.whereClause = builder.whereClause;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DatabasesSpecificViews create() {
            return builder().build();
        }

        /**
         * @return adbTableSchema
         */
        public DatabasesSpecificViewsAdbTableSchema getAdbTableSchema() {
            return this.adbTableSchema;
        }

        /**
         * @return filterColumns
         */
        public java.util.List<String> getFilterColumns() {
            return this.filterColumns;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return mappedName
         */
        public String getMappedName() {
            return this.mappedName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return shardColumns
         */
        public java.util.List<String> getShardColumns() {
            return this.shardColumns;
        }

        /**
         * @return whereClause
         */
        public String getWhereClause() {
            return this.whereClause;
        }

        public static final class Builder {
            private DatabasesSpecificViewsAdbTableSchema adbTableSchema; 
            private java.util.List<String> filterColumns; 
            private String id; 
            private String mappedName; 
            private String name; 
            private java.util.List<String> shardColumns; 
            private String whereClause; 

            private Builder() {
            } 

            private Builder(DatabasesSpecificViews model) {
                this.adbTableSchema = model.adbTableSchema;
                this.filterColumns = model.filterColumns;
                this.id = model.id;
                this.mappedName = model.mappedName;
                this.name = model.name;
                this.shardColumns = model.shardColumns;
                this.whereClause = model.whereClause;
            } 

            /**
             * AdbTableSchema.
             */
            public Builder adbTableSchema(DatabasesSpecificViewsAdbTableSchema adbTableSchema) {
                this.adbTableSchema = adbTableSchema;
                return this;
            }

            /**
             * FilterColumns.
             */
            public Builder filterColumns(java.util.List<String> filterColumns) {
                this.filterColumns = filterColumns;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>np_fe****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * MappedName.
             */
            public Builder mappedName(String mappedName) {
                this.mappedName = mappedName;
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
             * ShardColumns.
             */
            public Builder shardColumns(java.util.List<String> shardColumns) {
                this.shardColumns = shardColumns;
                return this;
            }

            /**
             * WhereClause.
             */
            public Builder whereClause(String whereClause) {
                this.whereClause = whereClause;
                return this;
            }

            public DatabasesSpecificViews build() {
                return new DatabasesSpecificViews(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectModifyRecordsRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectModifyRecordsRequest</p>
     */
    public static class DatabasesTablesAdbTableSchema extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DistributedKeys")
        private java.util.List<String> distributedKeys;

        @com.aliyun.core.annotation.NameInMap("PartitionLifeCycle")
        private String partitionLifeCycle;

        @com.aliyun.core.annotation.NameInMap("PartitionStatement")
        private String partitionStatement;

        @com.aliyun.core.annotation.NameInMap("PrimaryKeys")
        private java.util.List<String> primaryKeys;

        private DatabasesTablesAdbTableSchema(Builder builder) {
            this.distributedKeys = builder.distributedKeys;
            this.partitionLifeCycle = builder.partitionLifeCycle;
            this.partitionStatement = builder.partitionStatement;
            this.primaryKeys = builder.primaryKeys;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DatabasesTablesAdbTableSchema create() {
            return builder().build();
        }

        /**
         * @return distributedKeys
         */
        public java.util.List<String> getDistributedKeys() {
            return this.distributedKeys;
        }

        /**
         * @return partitionLifeCycle
         */
        public String getPartitionLifeCycle() {
            return this.partitionLifeCycle;
        }

        /**
         * @return partitionStatement
         */
        public String getPartitionStatement() {
            return this.partitionStatement;
        }

        /**
         * @return primaryKeys
         */
        public java.util.List<String> getPrimaryKeys() {
            return this.primaryKeys;
        }

        public static final class Builder {
            private java.util.List<String> distributedKeys; 
            private String partitionLifeCycle; 
            private String partitionStatement; 
            private java.util.List<String> primaryKeys; 

            private Builder() {
            } 

            private Builder(DatabasesTablesAdbTableSchema model) {
                this.distributedKeys = model.distributedKeys;
                this.partitionLifeCycle = model.partitionLifeCycle;
                this.partitionStatement = model.partitionStatement;
                this.primaryKeys = model.primaryKeys;
            } 

            /**
             * DistributedKeys.
             */
            public Builder distributedKeys(java.util.List<String> distributedKeys) {
                this.distributedKeys = distributedKeys;
                return this;
            }

            /**
             * PartitionLifeCycle.
             */
            public Builder partitionLifeCycle(String partitionLifeCycle) {
                this.partitionLifeCycle = partitionLifeCycle;
                return this;
            }

            /**
             * PartitionStatement.
             */
            public Builder partitionStatement(String partitionStatement) {
                this.partitionStatement = partitionStatement;
                return this;
            }

            /**
             * PrimaryKeys.
             */
            public Builder primaryKeys(java.util.List<String> primaryKeys) {
                this.primaryKeys = primaryKeys;
                return this;
            }

            public DatabasesTablesAdbTableSchema build() {
                return new DatabasesTablesAdbTableSchema(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectModifyRecordsRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectModifyRecordsRequest</p>
     */
    public static class TablesObkvPartitionConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PartitionSize")
        @com.aliyun.core.annotation.Validation(maximum = 1024, minimum = 1)
        private Integer partitionSize;

        @com.aliyun.core.annotation.NameInMap("PartitionType")
        private String partitionType;

        @com.aliyun.core.annotation.NameInMap("VirtualColumn")
        private String virtualColumn;

        private TablesObkvPartitionConfig(Builder builder) {
            this.partitionSize = builder.partitionSize;
            this.partitionType = builder.partitionType;
            this.virtualColumn = builder.virtualColumn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TablesObkvPartitionConfig create() {
            return builder().build();
        }

        /**
         * @return partitionSize
         */
        public Integer getPartitionSize() {
            return this.partitionSize;
        }

        /**
         * @return partitionType
         */
        public String getPartitionType() {
            return this.partitionType;
        }

        /**
         * @return virtualColumn
         */
        public String getVirtualColumn() {
            return this.virtualColumn;
        }

        public static final class Builder {
            private Integer partitionSize; 
            private String partitionType; 
            private String virtualColumn; 

            private Builder() {
            } 

            private Builder(TablesObkvPartitionConfig model) {
                this.partitionSize = model.partitionSize;
                this.partitionType = model.partitionType;
                this.virtualColumn = model.virtualColumn;
            } 

            /**
             * PartitionSize.
             */
            public Builder partitionSize(Integer partitionSize) {
                this.partitionSize = partitionSize;
                return this;
            }

            /**
             * PartitionType.
             */
            public Builder partitionType(String partitionType) {
                this.partitionType = partitionType;
                return this;
            }

            /**
             * VirtualColumn.
             */
            public Builder virtualColumn(String virtualColumn) {
                this.virtualColumn = virtualColumn;
                return this;
            }

            public TablesObkvPartitionConfig build() {
                return new TablesObkvPartitionConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectModifyRecordsRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectModifyRecordsRequest</p>
     */
    public static class DatabasesTables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdbTableSchema")
        private DatabasesTablesAdbTableSchema adbTableSchema;

        @com.aliyun.core.annotation.NameInMap("FilterColumns")
        private java.util.List<String> filterColumns;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("MappedName")
        private String mappedName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ObkvPartitionConfig")
        private TablesObkvPartitionConfig obkvPartitionConfig;

        @com.aliyun.core.annotation.NameInMap("ShardColumns")
        private java.util.List<String> shardColumns;

        @com.aliyun.core.annotation.NameInMap("WhereClause")
        private String whereClause;

        private DatabasesTables(Builder builder) {
            this.adbTableSchema = builder.adbTableSchema;
            this.filterColumns = builder.filterColumns;
            this.id = builder.id;
            this.mappedName = builder.mappedName;
            this.name = builder.name;
            this.obkvPartitionConfig = builder.obkvPartitionConfig;
            this.shardColumns = builder.shardColumns;
            this.whereClause = builder.whereClause;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DatabasesTables create() {
            return builder().build();
        }

        /**
         * @return adbTableSchema
         */
        public DatabasesTablesAdbTableSchema getAdbTableSchema() {
            return this.adbTableSchema;
        }

        /**
         * @return filterColumns
         */
        public java.util.List<String> getFilterColumns() {
            return this.filterColumns;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return mappedName
         */
        public String getMappedName() {
            return this.mappedName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return obkvPartitionConfig
         */
        public TablesObkvPartitionConfig getObkvPartitionConfig() {
            return this.obkvPartitionConfig;
        }

        /**
         * @return shardColumns
         */
        public java.util.List<String> getShardColumns() {
            return this.shardColumns;
        }

        /**
         * @return whereClause
         */
        public String getWhereClause() {
            return this.whereClause;
        }

        public static final class Builder {
            private DatabasesTablesAdbTableSchema adbTableSchema; 
            private java.util.List<String> filterColumns; 
            private String id; 
            private String mappedName; 
            private String name; 
            private TablesObkvPartitionConfig obkvPartitionConfig; 
            private java.util.List<String> shardColumns; 
            private String whereClause; 

            private Builder() {
            } 

            private Builder(DatabasesTables model) {
                this.adbTableSchema = model.adbTableSchema;
                this.filterColumns = model.filterColumns;
                this.id = model.id;
                this.mappedName = model.mappedName;
                this.name = model.name;
                this.obkvPartitionConfig = model.obkvPartitionConfig;
                this.shardColumns = model.shardColumns;
                this.whereClause = model.whereClause;
            } 

            /**
             * AdbTableSchema.
             */
            public Builder adbTableSchema(DatabasesTablesAdbTableSchema adbTableSchema) {
                this.adbTableSchema = adbTableSchema;
                return this;
            }

            /**
             * FilterColumns.
             */
            public Builder filterColumns(java.util.List<String> filterColumns) {
                this.filterColumns = filterColumns;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>np_fe****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * MappedName.
             */
            public Builder mappedName(String mappedName) {
                this.mappedName = mappedName;
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
             * ObkvPartitionConfig.
             */
            public Builder obkvPartitionConfig(TablesObkvPartitionConfig obkvPartitionConfig) {
                this.obkvPartitionConfig = obkvPartitionConfig;
                return this;
            }

            /**
             * ShardColumns.
             */
            public Builder shardColumns(java.util.List<String> shardColumns) {
                this.shardColumns = shardColumns;
                return this;
            }

            /**
             * WhereClause.
             */
            public Builder whereClause(String whereClause) {
                this.whereClause = whereClause;
                return this;
            }

            public DatabasesTables build() {
                return new DatabasesTables(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectModifyRecordsRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectModifyRecordsRequest</p>
     */
    public static class DatabasesViewsAdbTableSchema extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DistributedKeys")
        private java.util.List<String> distributedKeys;

        @com.aliyun.core.annotation.NameInMap("PartitionLifeCycle")
        private String partitionLifeCycle;

        @com.aliyun.core.annotation.NameInMap("PartitionStatement")
        private String partitionStatement;

        @com.aliyun.core.annotation.NameInMap("PrimaryKeys")
        private java.util.List<String> primaryKeys;

        private DatabasesViewsAdbTableSchema(Builder builder) {
            this.distributedKeys = builder.distributedKeys;
            this.partitionLifeCycle = builder.partitionLifeCycle;
            this.partitionStatement = builder.partitionStatement;
            this.primaryKeys = builder.primaryKeys;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DatabasesViewsAdbTableSchema create() {
            return builder().build();
        }

        /**
         * @return distributedKeys
         */
        public java.util.List<String> getDistributedKeys() {
            return this.distributedKeys;
        }

        /**
         * @return partitionLifeCycle
         */
        public String getPartitionLifeCycle() {
            return this.partitionLifeCycle;
        }

        /**
         * @return partitionStatement
         */
        public String getPartitionStatement() {
            return this.partitionStatement;
        }

        /**
         * @return primaryKeys
         */
        public java.util.List<String> getPrimaryKeys() {
            return this.primaryKeys;
        }

        public static final class Builder {
            private java.util.List<String> distributedKeys; 
            private String partitionLifeCycle; 
            private String partitionStatement; 
            private java.util.List<String> primaryKeys; 

            private Builder() {
            } 

            private Builder(DatabasesViewsAdbTableSchema model) {
                this.distributedKeys = model.distributedKeys;
                this.partitionLifeCycle = model.partitionLifeCycle;
                this.partitionStatement = model.partitionStatement;
                this.primaryKeys = model.primaryKeys;
            } 

            /**
             * DistributedKeys.
             */
            public Builder distributedKeys(java.util.List<String> distributedKeys) {
                this.distributedKeys = distributedKeys;
                return this;
            }

            /**
             * PartitionLifeCycle.
             */
            public Builder partitionLifeCycle(String partitionLifeCycle) {
                this.partitionLifeCycle = partitionLifeCycle;
                return this;
            }

            /**
             * PartitionStatement.
             */
            public Builder partitionStatement(String partitionStatement) {
                this.partitionStatement = partitionStatement;
                return this;
            }

            /**
             * PrimaryKeys.
             */
            public Builder primaryKeys(java.util.List<String> primaryKeys) {
                this.primaryKeys = primaryKeys;
                return this;
            }

            public DatabasesViewsAdbTableSchema build() {
                return new DatabasesViewsAdbTableSchema(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectModifyRecordsRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectModifyRecordsRequest</p>
     */
    public static class DatabasesViews extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdbTableSchema")
        private DatabasesViewsAdbTableSchema adbTableSchema;

        @com.aliyun.core.annotation.NameInMap("FilterColumns")
        private java.util.List<String> filterColumns;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("MappedName")
        private String mappedName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ShardColumns")
        private java.util.List<String> shardColumns;

        @com.aliyun.core.annotation.NameInMap("WhereClause")
        private String whereClause;

        private DatabasesViews(Builder builder) {
            this.adbTableSchema = builder.adbTableSchema;
            this.filterColumns = builder.filterColumns;
            this.id = builder.id;
            this.mappedName = builder.mappedName;
            this.name = builder.name;
            this.shardColumns = builder.shardColumns;
            this.whereClause = builder.whereClause;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DatabasesViews create() {
            return builder().build();
        }

        /**
         * @return adbTableSchema
         */
        public DatabasesViewsAdbTableSchema getAdbTableSchema() {
            return this.adbTableSchema;
        }

        /**
         * @return filterColumns
         */
        public java.util.List<String> getFilterColumns() {
            return this.filterColumns;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return mappedName
         */
        public String getMappedName() {
            return this.mappedName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return shardColumns
         */
        public java.util.List<String> getShardColumns() {
            return this.shardColumns;
        }

        /**
         * @return whereClause
         */
        public String getWhereClause() {
            return this.whereClause;
        }

        public static final class Builder {
            private DatabasesViewsAdbTableSchema adbTableSchema; 
            private java.util.List<String> filterColumns; 
            private String id; 
            private String mappedName; 
            private String name; 
            private java.util.List<String> shardColumns; 
            private String whereClause; 

            private Builder() {
            } 

            private Builder(DatabasesViews model) {
                this.adbTableSchema = model.adbTableSchema;
                this.filterColumns = model.filterColumns;
                this.id = model.id;
                this.mappedName = model.mappedName;
                this.name = model.name;
                this.shardColumns = model.shardColumns;
                this.whereClause = model.whereClause;
            } 

            /**
             * AdbTableSchema.
             */
            public Builder adbTableSchema(DatabasesViewsAdbTableSchema adbTableSchema) {
                this.adbTableSchema = adbTableSchema;
                return this;
            }

            /**
             * FilterColumns.
             */
            public Builder filterColumns(java.util.List<String> filterColumns) {
                this.filterColumns = filterColumns;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>np_fe****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * MappedName.
             */
            public Builder mappedName(String mappedName) {
                this.mappedName = mappedName;
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
             * ShardColumns.
             */
            public Builder shardColumns(java.util.List<String> shardColumns) {
                this.shardColumns = shardColumns;
                return this;
            }

            /**
             * WhereClause.
             */
            public Builder whereClause(String whereClause) {
                this.whereClause = whereClause;
                return this;
            }

            public DatabasesViews build() {
                return new DatabasesViews(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectModifyRecordsRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectModifyRecordsRequest</p>
     */
    public static class TransferMappingDatabases extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("MappedName")
        private String mappedName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SpecificTables")
        private java.util.List<DatabasesSpecificTables> specificTables;

        @com.aliyun.core.annotation.NameInMap("SpecificViews")
        private java.util.List<DatabasesSpecificViews> specificViews;

        @com.aliyun.core.annotation.NameInMap("Tables")
        private java.util.List<DatabasesTables> tables;

        @com.aliyun.core.annotation.NameInMap("TenantName")
        private String tenantName;

        @com.aliyun.core.annotation.NameInMap("Views")
        private java.util.List<DatabasesViews> views;

        private TransferMappingDatabases(Builder builder) {
            this.clusterName = builder.clusterName;
            this.id = builder.id;
            this.mappedName = builder.mappedName;
            this.name = builder.name;
            this.specificTables = builder.specificTables;
            this.specificViews = builder.specificViews;
            this.tables = builder.tables;
            this.tenantName = builder.tenantName;
            this.views = builder.views;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransferMappingDatabases create() {
            return builder().build();
        }

        /**
         * @return clusterName
         */
        public String getClusterName() {
            return this.clusterName;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return mappedName
         */
        public String getMappedName() {
            return this.mappedName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return specificTables
         */
        public java.util.List<DatabasesSpecificTables> getSpecificTables() {
            return this.specificTables;
        }

        /**
         * @return specificViews
         */
        public java.util.List<DatabasesSpecificViews> getSpecificViews() {
            return this.specificViews;
        }

        /**
         * @return tables
         */
        public java.util.List<DatabasesTables> getTables() {
            return this.tables;
        }

        /**
         * @return tenantName
         */
        public String getTenantName() {
            return this.tenantName;
        }

        /**
         * @return views
         */
        public java.util.List<DatabasesViews> getViews() {
            return this.views;
        }

        public static final class Builder {
            private String clusterName; 
            private String id; 
            private String mappedName; 
            private String name; 
            private java.util.List<DatabasesSpecificTables> specificTables; 
            private java.util.List<DatabasesSpecificViews> specificViews; 
            private java.util.List<DatabasesTables> tables; 
            private String tenantName; 
            private java.util.List<DatabasesViews> views; 

            private Builder() {
            } 

            private Builder(TransferMappingDatabases model) {
                this.clusterName = model.clusterName;
                this.id = model.id;
                this.mappedName = model.mappedName;
                this.name = model.name;
                this.specificTables = model.specificTables;
                this.specificViews = model.specificViews;
                this.tables = model.tables;
                this.tenantName = model.tenantName;
                this.views = model.views;
            } 

            /**
             * ClusterName.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>np_fe****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * MappedName.
             */
            public Builder mappedName(String mappedName) {
                this.mappedName = mappedName;
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
             * SpecificTables.
             */
            public Builder specificTables(java.util.List<DatabasesSpecificTables> specificTables) {
                this.specificTables = specificTables;
                return this;
            }

            /**
             * SpecificViews.
             */
            public Builder specificViews(java.util.List<DatabasesSpecificViews> specificViews) {
                this.specificViews = specificViews;
                return this;
            }

            /**
             * Tables.
             */
            public Builder tables(java.util.List<DatabasesTables> tables) {
                this.tables = tables;
                return this;
            }

            /**
             * TenantName.
             */
            public Builder tenantName(String tenantName) {
                this.tenantName = tenantName;
                return this;
            }

            /**
             * Views.
             */
            public Builder views(java.util.List<DatabasesViews> views) {
                this.views = views;
                return this;
            }

            public TransferMappingDatabases build() {
                return new TransferMappingDatabases(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectModifyRecordsRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectModifyRecordsRequest</p>
     */
    public static class DatabasesBlackSpecificTablesAdbTableSchema extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DistributedKeys")
        private java.util.List<String> distributedKeys;

        @com.aliyun.core.annotation.NameInMap("PartitionLifeCycle")
        private String partitionLifeCycle;

        @com.aliyun.core.annotation.NameInMap("PartitionStatement")
        private String partitionStatement;

        @com.aliyun.core.annotation.NameInMap("PrimaryKeys")
        private java.util.List<String> primaryKeys;

        private DatabasesBlackSpecificTablesAdbTableSchema(Builder builder) {
            this.distributedKeys = builder.distributedKeys;
            this.partitionLifeCycle = builder.partitionLifeCycle;
            this.partitionStatement = builder.partitionStatement;
            this.primaryKeys = builder.primaryKeys;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DatabasesBlackSpecificTablesAdbTableSchema create() {
            return builder().build();
        }

        /**
         * @return distributedKeys
         */
        public java.util.List<String> getDistributedKeys() {
            return this.distributedKeys;
        }

        /**
         * @return partitionLifeCycle
         */
        public String getPartitionLifeCycle() {
            return this.partitionLifeCycle;
        }

        /**
         * @return partitionStatement
         */
        public String getPartitionStatement() {
            return this.partitionStatement;
        }

        /**
         * @return primaryKeys
         */
        public java.util.List<String> getPrimaryKeys() {
            return this.primaryKeys;
        }

        public static final class Builder {
            private java.util.List<String> distributedKeys; 
            private String partitionLifeCycle; 
            private String partitionStatement; 
            private java.util.List<String> primaryKeys; 

            private Builder() {
            } 

            private Builder(DatabasesBlackSpecificTablesAdbTableSchema model) {
                this.distributedKeys = model.distributedKeys;
                this.partitionLifeCycle = model.partitionLifeCycle;
                this.partitionStatement = model.partitionStatement;
                this.primaryKeys = model.primaryKeys;
            } 

            /**
             * DistributedKeys.
             */
            public Builder distributedKeys(java.util.List<String> distributedKeys) {
                this.distributedKeys = distributedKeys;
                return this;
            }

            /**
             * PartitionLifeCycle.
             */
            public Builder partitionLifeCycle(String partitionLifeCycle) {
                this.partitionLifeCycle = partitionLifeCycle;
                return this;
            }

            /**
             * PartitionStatement.
             */
            public Builder partitionStatement(String partitionStatement) {
                this.partitionStatement = partitionStatement;
                return this;
            }

            /**
             * PrimaryKeys.
             */
            public Builder primaryKeys(java.util.List<String> primaryKeys) {
                this.primaryKeys = primaryKeys;
                return this;
            }

            public DatabasesBlackSpecificTablesAdbTableSchema build() {
                return new DatabasesBlackSpecificTablesAdbTableSchema(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectModifyRecordsRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectModifyRecordsRequest</p>
     */
    public static class DatabasesBlackSpecificTables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdbTableSchema")
        private DatabasesBlackSpecificTablesAdbTableSchema adbTableSchema;

        @com.aliyun.core.annotation.NameInMap("FilterColumns")
        private java.util.List<String> filterColumns;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("MappedName")
        private String mappedName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ShardColumns")
        private java.util.List<String> shardColumns;

        @com.aliyun.core.annotation.NameInMap("WhereClause")
        private String whereClause;

        private DatabasesBlackSpecificTables(Builder builder) {
            this.adbTableSchema = builder.adbTableSchema;
            this.filterColumns = builder.filterColumns;
            this.id = builder.id;
            this.mappedName = builder.mappedName;
            this.name = builder.name;
            this.shardColumns = builder.shardColumns;
            this.whereClause = builder.whereClause;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DatabasesBlackSpecificTables create() {
            return builder().build();
        }

        /**
         * @return adbTableSchema
         */
        public DatabasesBlackSpecificTablesAdbTableSchema getAdbTableSchema() {
            return this.adbTableSchema;
        }

        /**
         * @return filterColumns
         */
        public java.util.List<String> getFilterColumns() {
            return this.filterColumns;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return mappedName
         */
        public String getMappedName() {
            return this.mappedName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return shardColumns
         */
        public java.util.List<String> getShardColumns() {
            return this.shardColumns;
        }

        /**
         * @return whereClause
         */
        public String getWhereClause() {
            return this.whereClause;
        }

        public static final class Builder {
            private DatabasesBlackSpecificTablesAdbTableSchema adbTableSchema; 
            private java.util.List<String> filterColumns; 
            private String id; 
            private String mappedName; 
            private String name; 
            private java.util.List<String> shardColumns; 
            private String whereClause; 

            private Builder() {
            } 

            private Builder(DatabasesBlackSpecificTables model) {
                this.adbTableSchema = model.adbTableSchema;
                this.filterColumns = model.filterColumns;
                this.id = model.id;
                this.mappedName = model.mappedName;
                this.name = model.name;
                this.shardColumns = model.shardColumns;
                this.whereClause = model.whereClause;
            } 

            /**
             * AdbTableSchema.
             */
            public Builder adbTableSchema(DatabasesBlackSpecificTablesAdbTableSchema adbTableSchema) {
                this.adbTableSchema = adbTableSchema;
                return this;
            }

            /**
             * FilterColumns.
             */
            public Builder filterColumns(java.util.List<String> filterColumns) {
                this.filterColumns = filterColumns;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>np_fe****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * MappedName.
             */
            public Builder mappedName(String mappedName) {
                this.mappedName = mappedName;
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
             * ShardColumns.
             */
            public Builder shardColumns(java.util.List<String> shardColumns) {
                this.shardColumns = shardColumns;
                return this;
            }

            /**
             * WhereClause.
             */
            public Builder whereClause(String whereClause) {
                this.whereClause = whereClause;
                return this;
            }

            public DatabasesBlackSpecificTables build() {
                return new DatabasesBlackSpecificTables(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectModifyRecordsRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectModifyRecordsRequest</p>
     */
    public static class DatabasesBlackSpecificViewsAdbTableSchema extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DistributedKeys")
        private java.util.List<String> distributedKeys;

        @com.aliyun.core.annotation.NameInMap("PartitionLifeCycle")
        private String partitionLifeCycle;

        @com.aliyun.core.annotation.NameInMap("PartitionStatement")
        private String partitionStatement;

        @com.aliyun.core.annotation.NameInMap("PrimaryKeys")
        private java.util.List<String> primaryKeys;

        private DatabasesBlackSpecificViewsAdbTableSchema(Builder builder) {
            this.distributedKeys = builder.distributedKeys;
            this.partitionLifeCycle = builder.partitionLifeCycle;
            this.partitionStatement = builder.partitionStatement;
            this.primaryKeys = builder.primaryKeys;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DatabasesBlackSpecificViewsAdbTableSchema create() {
            return builder().build();
        }

        /**
         * @return distributedKeys
         */
        public java.util.List<String> getDistributedKeys() {
            return this.distributedKeys;
        }

        /**
         * @return partitionLifeCycle
         */
        public String getPartitionLifeCycle() {
            return this.partitionLifeCycle;
        }

        /**
         * @return partitionStatement
         */
        public String getPartitionStatement() {
            return this.partitionStatement;
        }

        /**
         * @return primaryKeys
         */
        public java.util.List<String> getPrimaryKeys() {
            return this.primaryKeys;
        }

        public static final class Builder {
            private java.util.List<String> distributedKeys; 
            private String partitionLifeCycle; 
            private String partitionStatement; 
            private java.util.List<String> primaryKeys; 

            private Builder() {
            } 

            private Builder(DatabasesBlackSpecificViewsAdbTableSchema model) {
                this.distributedKeys = model.distributedKeys;
                this.partitionLifeCycle = model.partitionLifeCycle;
                this.partitionStatement = model.partitionStatement;
                this.primaryKeys = model.primaryKeys;
            } 

            /**
             * DistributedKeys.
             */
            public Builder distributedKeys(java.util.List<String> distributedKeys) {
                this.distributedKeys = distributedKeys;
                return this;
            }

            /**
             * PartitionLifeCycle.
             */
            public Builder partitionLifeCycle(String partitionLifeCycle) {
                this.partitionLifeCycle = partitionLifeCycle;
                return this;
            }

            /**
             * PartitionStatement.
             */
            public Builder partitionStatement(String partitionStatement) {
                this.partitionStatement = partitionStatement;
                return this;
            }

            /**
             * PrimaryKeys.
             */
            public Builder primaryKeys(java.util.List<String> primaryKeys) {
                this.primaryKeys = primaryKeys;
                return this;
            }

            public DatabasesBlackSpecificViewsAdbTableSchema build() {
                return new DatabasesBlackSpecificViewsAdbTableSchema(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectModifyRecordsRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectModifyRecordsRequest</p>
     */
    public static class DatabasesBlackSpecificViews extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdbTableSchema")
        private DatabasesBlackSpecificViewsAdbTableSchema adbTableSchema;

        @com.aliyun.core.annotation.NameInMap("FilterColumns")
        private java.util.List<String> filterColumns;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("MappedName")
        private String mappedName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ShardColumns")
        private java.util.List<String> shardColumns;

        @com.aliyun.core.annotation.NameInMap("WhereClause")
        private String whereClause;

        private DatabasesBlackSpecificViews(Builder builder) {
            this.adbTableSchema = builder.adbTableSchema;
            this.filterColumns = builder.filterColumns;
            this.id = builder.id;
            this.mappedName = builder.mappedName;
            this.name = builder.name;
            this.shardColumns = builder.shardColumns;
            this.whereClause = builder.whereClause;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DatabasesBlackSpecificViews create() {
            return builder().build();
        }

        /**
         * @return adbTableSchema
         */
        public DatabasesBlackSpecificViewsAdbTableSchema getAdbTableSchema() {
            return this.adbTableSchema;
        }

        /**
         * @return filterColumns
         */
        public java.util.List<String> getFilterColumns() {
            return this.filterColumns;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return mappedName
         */
        public String getMappedName() {
            return this.mappedName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return shardColumns
         */
        public java.util.List<String> getShardColumns() {
            return this.shardColumns;
        }

        /**
         * @return whereClause
         */
        public String getWhereClause() {
            return this.whereClause;
        }

        public static final class Builder {
            private DatabasesBlackSpecificViewsAdbTableSchema adbTableSchema; 
            private java.util.List<String> filterColumns; 
            private String id; 
            private String mappedName; 
            private String name; 
            private java.util.List<String> shardColumns; 
            private String whereClause; 

            private Builder() {
            } 

            private Builder(DatabasesBlackSpecificViews model) {
                this.adbTableSchema = model.adbTableSchema;
                this.filterColumns = model.filterColumns;
                this.id = model.id;
                this.mappedName = model.mappedName;
                this.name = model.name;
                this.shardColumns = model.shardColumns;
                this.whereClause = model.whereClause;
            } 

            /**
             * AdbTableSchema.
             */
            public Builder adbTableSchema(DatabasesBlackSpecificViewsAdbTableSchema adbTableSchema) {
                this.adbTableSchema = adbTableSchema;
                return this;
            }

            /**
             * FilterColumns.
             */
            public Builder filterColumns(java.util.List<String> filterColumns) {
                this.filterColumns = filterColumns;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>np_fe****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * MappedName.
             */
            public Builder mappedName(String mappedName) {
                this.mappedName = mappedName;
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
             * ShardColumns.
             */
            public Builder shardColumns(java.util.List<String> shardColumns) {
                this.shardColumns = shardColumns;
                return this;
            }

            /**
             * WhereClause.
             */
            public Builder whereClause(String whereClause) {
                this.whereClause = whereClause;
                return this;
            }

            public DatabasesBlackSpecificViews build() {
                return new DatabasesBlackSpecificViews(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectModifyRecordsRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectModifyRecordsRequest</p>
     */
    public static class DatabasesBlackTablesAdbTableSchema extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DistributedKeys")
        private java.util.List<String> distributedKeys;

        @com.aliyun.core.annotation.NameInMap("PartitionLifeCycle")
        private String partitionLifeCycle;

        @com.aliyun.core.annotation.NameInMap("PartitionStatement")
        private String partitionStatement;

        @com.aliyun.core.annotation.NameInMap("PrimaryKeys")
        private java.util.List<String> primaryKeys;

        private DatabasesBlackTablesAdbTableSchema(Builder builder) {
            this.distributedKeys = builder.distributedKeys;
            this.partitionLifeCycle = builder.partitionLifeCycle;
            this.partitionStatement = builder.partitionStatement;
            this.primaryKeys = builder.primaryKeys;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DatabasesBlackTablesAdbTableSchema create() {
            return builder().build();
        }

        /**
         * @return distributedKeys
         */
        public java.util.List<String> getDistributedKeys() {
            return this.distributedKeys;
        }

        /**
         * @return partitionLifeCycle
         */
        public String getPartitionLifeCycle() {
            return this.partitionLifeCycle;
        }

        /**
         * @return partitionStatement
         */
        public String getPartitionStatement() {
            return this.partitionStatement;
        }

        /**
         * @return primaryKeys
         */
        public java.util.List<String> getPrimaryKeys() {
            return this.primaryKeys;
        }

        public static final class Builder {
            private java.util.List<String> distributedKeys; 
            private String partitionLifeCycle; 
            private String partitionStatement; 
            private java.util.List<String> primaryKeys; 

            private Builder() {
            } 

            private Builder(DatabasesBlackTablesAdbTableSchema model) {
                this.distributedKeys = model.distributedKeys;
                this.partitionLifeCycle = model.partitionLifeCycle;
                this.partitionStatement = model.partitionStatement;
                this.primaryKeys = model.primaryKeys;
            } 

            /**
             * DistributedKeys.
             */
            public Builder distributedKeys(java.util.List<String> distributedKeys) {
                this.distributedKeys = distributedKeys;
                return this;
            }

            /**
             * PartitionLifeCycle.
             */
            public Builder partitionLifeCycle(String partitionLifeCycle) {
                this.partitionLifeCycle = partitionLifeCycle;
                return this;
            }

            /**
             * PartitionStatement.
             */
            public Builder partitionStatement(String partitionStatement) {
                this.partitionStatement = partitionStatement;
                return this;
            }

            /**
             * PrimaryKeys.
             */
            public Builder primaryKeys(java.util.List<String> primaryKeys) {
                this.primaryKeys = primaryKeys;
                return this;
            }

            public DatabasesBlackTablesAdbTableSchema build() {
                return new DatabasesBlackTablesAdbTableSchema(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectModifyRecordsRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectModifyRecordsRequest</p>
     */
    public static class DatabasesBlackTables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdbTableSchema")
        private DatabasesBlackTablesAdbTableSchema adbTableSchema;

        @com.aliyun.core.annotation.NameInMap("FilterColumns")
        private java.util.List<String> filterColumns;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("MappedName")
        private String mappedName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ShardColumns")
        private java.util.List<String> shardColumns;

        @com.aliyun.core.annotation.NameInMap("WhereClause")
        private String whereClause;

        private DatabasesBlackTables(Builder builder) {
            this.adbTableSchema = builder.adbTableSchema;
            this.filterColumns = builder.filterColumns;
            this.id = builder.id;
            this.mappedName = builder.mappedName;
            this.name = builder.name;
            this.shardColumns = builder.shardColumns;
            this.whereClause = builder.whereClause;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DatabasesBlackTables create() {
            return builder().build();
        }

        /**
         * @return adbTableSchema
         */
        public DatabasesBlackTablesAdbTableSchema getAdbTableSchema() {
            return this.adbTableSchema;
        }

        /**
         * @return filterColumns
         */
        public java.util.List<String> getFilterColumns() {
            return this.filterColumns;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return mappedName
         */
        public String getMappedName() {
            return this.mappedName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return shardColumns
         */
        public java.util.List<String> getShardColumns() {
            return this.shardColumns;
        }

        /**
         * @return whereClause
         */
        public String getWhereClause() {
            return this.whereClause;
        }

        public static final class Builder {
            private DatabasesBlackTablesAdbTableSchema adbTableSchema; 
            private java.util.List<String> filterColumns; 
            private String id; 
            private String mappedName; 
            private String name; 
            private java.util.List<String> shardColumns; 
            private String whereClause; 

            private Builder() {
            } 

            private Builder(DatabasesBlackTables model) {
                this.adbTableSchema = model.adbTableSchema;
                this.filterColumns = model.filterColumns;
                this.id = model.id;
                this.mappedName = model.mappedName;
                this.name = model.name;
                this.shardColumns = model.shardColumns;
                this.whereClause = model.whereClause;
            } 

            /**
             * AdbTableSchema.
             */
            public Builder adbTableSchema(DatabasesBlackTablesAdbTableSchema adbTableSchema) {
                this.adbTableSchema = adbTableSchema;
                return this;
            }

            /**
             * FilterColumns.
             */
            public Builder filterColumns(java.util.List<String> filterColumns) {
                this.filterColumns = filterColumns;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>np_fe****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * MappedName.
             */
            public Builder mappedName(String mappedName) {
                this.mappedName = mappedName;
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
             * ShardColumns.
             */
            public Builder shardColumns(java.util.List<String> shardColumns) {
                this.shardColumns = shardColumns;
                return this;
            }

            /**
             * WhereClause.
             */
            public Builder whereClause(String whereClause) {
                this.whereClause = whereClause;
                return this;
            }

            public DatabasesBlackTables build() {
                return new DatabasesBlackTables(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectModifyRecordsRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectModifyRecordsRequest</p>
     */
    public static class DatabasesBlackViewsAdbTableSchema extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DistributedKeys")
        private java.util.List<String> distributedKeys;

        @com.aliyun.core.annotation.NameInMap("PartitionLifeCycle")
        private String partitionLifeCycle;

        @com.aliyun.core.annotation.NameInMap("PartitionStatement")
        private String partitionStatement;

        @com.aliyun.core.annotation.NameInMap("PrimaryKeys")
        private java.util.List<String> primaryKeys;

        private DatabasesBlackViewsAdbTableSchema(Builder builder) {
            this.distributedKeys = builder.distributedKeys;
            this.partitionLifeCycle = builder.partitionLifeCycle;
            this.partitionStatement = builder.partitionStatement;
            this.primaryKeys = builder.primaryKeys;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DatabasesBlackViewsAdbTableSchema create() {
            return builder().build();
        }

        /**
         * @return distributedKeys
         */
        public java.util.List<String> getDistributedKeys() {
            return this.distributedKeys;
        }

        /**
         * @return partitionLifeCycle
         */
        public String getPartitionLifeCycle() {
            return this.partitionLifeCycle;
        }

        /**
         * @return partitionStatement
         */
        public String getPartitionStatement() {
            return this.partitionStatement;
        }

        /**
         * @return primaryKeys
         */
        public java.util.List<String> getPrimaryKeys() {
            return this.primaryKeys;
        }

        public static final class Builder {
            private java.util.List<String> distributedKeys; 
            private String partitionLifeCycle; 
            private String partitionStatement; 
            private java.util.List<String> primaryKeys; 

            private Builder() {
            } 

            private Builder(DatabasesBlackViewsAdbTableSchema model) {
                this.distributedKeys = model.distributedKeys;
                this.partitionLifeCycle = model.partitionLifeCycle;
                this.partitionStatement = model.partitionStatement;
                this.primaryKeys = model.primaryKeys;
            } 

            /**
             * DistributedKeys.
             */
            public Builder distributedKeys(java.util.List<String> distributedKeys) {
                this.distributedKeys = distributedKeys;
                return this;
            }

            /**
             * PartitionLifeCycle.
             */
            public Builder partitionLifeCycle(String partitionLifeCycle) {
                this.partitionLifeCycle = partitionLifeCycle;
                return this;
            }

            /**
             * PartitionStatement.
             */
            public Builder partitionStatement(String partitionStatement) {
                this.partitionStatement = partitionStatement;
                return this;
            }

            /**
             * PrimaryKeys.
             */
            public Builder primaryKeys(java.util.List<String> primaryKeys) {
                this.primaryKeys = primaryKeys;
                return this;
            }

            public DatabasesBlackViewsAdbTableSchema build() {
                return new DatabasesBlackViewsAdbTableSchema(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectModifyRecordsRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectModifyRecordsRequest</p>
     */
    public static class DatabasesBlackViews extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdbTableSchema")
        private DatabasesBlackViewsAdbTableSchema adbTableSchema;

        @com.aliyun.core.annotation.NameInMap("FilterColumns")
        private java.util.List<String> filterColumns;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("MappedName")
        private String mappedName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ShardColumns")
        private java.util.List<String> shardColumns;

        @com.aliyun.core.annotation.NameInMap("WhereClause")
        private String whereClause;

        private DatabasesBlackViews(Builder builder) {
            this.adbTableSchema = builder.adbTableSchema;
            this.filterColumns = builder.filterColumns;
            this.id = builder.id;
            this.mappedName = builder.mappedName;
            this.name = builder.name;
            this.shardColumns = builder.shardColumns;
            this.whereClause = builder.whereClause;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DatabasesBlackViews create() {
            return builder().build();
        }

        /**
         * @return adbTableSchema
         */
        public DatabasesBlackViewsAdbTableSchema getAdbTableSchema() {
            return this.adbTableSchema;
        }

        /**
         * @return filterColumns
         */
        public java.util.List<String> getFilterColumns() {
            return this.filterColumns;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return mappedName
         */
        public String getMappedName() {
            return this.mappedName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return shardColumns
         */
        public java.util.List<String> getShardColumns() {
            return this.shardColumns;
        }

        /**
         * @return whereClause
         */
        public String getWhereClause() {
            return this.whereClause;
        }

        public static final class Builder {
            private DatabasesBlackViewsAdbTableSchema adbTableSchema; 
            private java.util.List<String> filterColumns; 
            private String id; 
            private String mappedName; 
            private String name; 
            private java.util.List<String> shardColumns; 
            private String whereClause; 

            private Builder() {
            } 

            private Builder(DatabasesBlackViews model) {
                this.adbTableSchema = model.adbTableSchema;
                this.filterColumns = model.filterColumns;
                this.id = model.id;
                this.mappedName = model.mappedName;
                this.name = model.name;
                this.shardColumns = model.shardColumns;
                this.whereClause = model.whereClause;
            } 

            /**
             * AdbTableSchema.
             */
            public Builder adbTableSchema(DatabasesBlackViewsAdbTableSchema adbTableSchema) {
                this.adbTableSchema = adbTableSchema;
                return this;
            }

            /**
             * FilterColumns.
             */
            public Builder filterColumns(java.util.List<String> filterColumns) {
                this.filterColumns = filterColumns;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>np_fe****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * MappedName.
             */
            public Builder mappedName(String mappedName) {
                this.mappedName = mappedName;
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
             * ShardColumns.
             */
            public Builder shardColumns(java.util.List<String> shardColumns) {
                this.shardColumns = shardColumns;
                return this;
            }

            /**
             * WhereClause.
             */
            public Builder whereClause(String whereClause) {
                this.whereClause = whereClause;
                return this;
            }

            public DatabasesBlackViews build() {
                return new DatabasesBlackViews(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectModifyRecordsRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectModifyRecordsRequest</p>
     */
    public static class DatabasesBlack extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("MappedName")
        private String mappedName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SpecificTables")
        private java.util.List<DatabasesBlackSpecificTables> specificTables;

        @com.aliyun.core.annotation.NameInMap("SpecificViews")
        private java.util.List<DatabasesBlackSpecificViews> specificViews;

        @com.aliyun.core.annotation.NameInMap("Tables")
        private java.util.List<DatabasesBlackTables> tables;

        @com.aliyun.core.annotation.NameInMap("TenantName")
        private String tenantName;

        @com.aliyun.core.annotation.NameInMap("Views")
        private java.util.List<DatabasesBlackViews> views;

        private DatabasesBlack(Builder builder) {
            this.clusterName = builder.clusterName;
            this.id = builder.id;
            this.mappedName = builder.mappedName;
            this.name = builder.name;
            this.specificTables = builder.specificTables;
            this.specificViews = builder.specificViews;
            this.tables = builder.tables;
            this.tenantName = builder.tenantName;
            this.views = builder.views;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DatabasesBlack create() {
            return builder().build();
        }

        /**
         * @return clusterName
         */
        public String getClusterName() {
            return this.clusterName;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return mappedName
         */
        public String getMappedName() {
            return this.mappedName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return specificTables
         */
        public java.util.List<DatabasesBlackSpecificTables> getSpecificTables() {
            return this.specificTables;
        }

        /**
         * @return specificViews
         */
        public java.util.List<DatabasesBlackSpecificViews> getSpecificViews() {
            return this.specificViews;
        }

        /**
         * @return tables
         */
        public java.util.List<DatabasesBlackTables> getTables() {
            return this.tables;
        }

        /**
         * @return tenantName
         */
        public String getTenantName() {
            return this.tenantName;
        }

        /**
         * @return views
         */
        public java.util.List<DatabasesBlackViews> getViews() {
            return this.views;
        }

        public static final class Builder {
            private String clusterName; 
            private String id; 
            private String mappedName; 
            private String name; 
            private java.util.List<DatabasesBlackSpecificTables> specificTables; 
            private java.util.List<DatabasesBlackSpecificViews> specificViews; 
            private java.util.List<DatabasesBlackTables> tables; 
            private String tenantName; 
            private java.util.List<DatabasesBlackViews> views; 

            private Builder() {
            } 

            private Builder(DatabasesBlack model) {
                this.clusterName = model.clusterName;
                this.id = model.id;
                this.mappedName = model.mappedName;
                this.name = model.name;
                this.specificTables = model.specificTables;
                this.specificViews = model.specificViews;
                this.tables = model.tables;
                this.tenantName = model.tenantName;
                this.views = model.views;
            } 

            /**
             * ClusterName.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>np_fe****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * MappedName.
             */
            public Builder mappedName(String mappedName) {
                this.mappedName = mappedName;
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
             * SpecificTables.
             */
            public Builder specificTables(java.util.List<DatabasesBlackSpecificTables> specificTables) {
                this.specificTables = specificTables;
                return this;
            }

            /**
             * SpecificViews.
             */
            public Builder specificViews(java.util.List<DatabasesBlackSpecificViews> specificViews) {
                this.specificViews = specificViews;
                return this;
            }

            /**
             * Tables.
             */
            public Builder tables(java.util.List<DatabasesBlackTables> tables) {
                this.tables = tables;
                return this;
            }

            /**
             * TenantName.
             */
            public Builder tenantName(String tenantName) {
                this.tenantName = tenantName;
                return this;
            }

            /**
             * Views.
             */
            public Builder views(java.util.List<DatabasesBlackViews> views) {
                this.views = views;
                return this;
            }

            public DatabasesBlack build() {
                return new DatabasesBlack(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectModifyRecordsRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectModifyRecordsRequest</p>
     */
    public static class SchemasSpecificTablesAdbTableSchema extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DistributedKeys")
        private java.util.List<String> distributedKeys;

        @com.aliyun.core.annotation.NameInMap("PartitionLifeCycle")
        private String partitionLifeCycle;

        @com.aliyun.core.annotation.NameInMap("PartitionStatement")
        private String partitionStatement;

        @com.aliyun.core.annotation.NameInMap("PrimaryKeys")
        private java.util.List<String> primaryKeys;

        private SchemasSpecificTablesAdbTableSchema(Builder builder) {
            this.distributedKeys = builder.distributedKeys;
            this.partitionLifeCycle = builder.partitionLifeCycle;
            this.partitionStatement = builder.partitionStatement;
            this.primaryKeys = builder.primaryKeys;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SchemasSpecificTablesAdbTableSchema create() {
            return builder().build();
        }

        /**
         * @return distributedKeys
         */
        public java.util.List<String> getDistributedKeys() {
            return this.distributedKeys;
        }

        /**
         * @return partitionLifeCycle
         */
        public String getPartitionLifeCycle() {
            return this.partitionLifeCycle;
        }

        /**
         * @return partitionStatement
         */
        public String getPartitionStatement() {
            return this.partitionStatement;
        }

        /**
         * @return primaryKeys
         */
        public java.util.List<String> getPrimaryKeys() {
            return this.primaryKeys;
        }

        public static final class Builder {
            private java.util.List<String> distributedKeys; 
            private String partitionLifeCycle; 
            private String partitionStatement; 
            private java.util.List<String> primaryKeys; 

            private Builder() {
            } 

            private Builder(SchemasSpecificTablesAdbTableSchema model) {
                this.distributedKeys = model.distributedKeys;
                this.partitionLifeCycle = model.partitionLifeCycle;
                this.partitionStatement = model.partitionStatement;
                this.primaryKeys = model.primaryKeys;
            } 

            /**
             * DistributedKeys.
             */
            public Builder distributedKeys(java.util.List<String> distributedKeys) {
                this.distributedKeys = distributedKeys;
                return this;
            }

            /**
             * PartitionLifeCycle.
             */
            public Builder partitionLifeCycle(String partitionLifeCycle) {
                this.partitionLifeCycle = partitionLifeCycle;
                return this;
            }

            /**
             * PartitionStatement.
             */
            public Builder partitionStatement(String partitionStatement) {
                this.partitionStatement = partitionStatement;
                return this;
            }

            /**
             * PrimaryKeys.
             */
            public Builder primaryKeys(java.util.List<String> primaryKeys) {
                this.primaryKeys = primaryKeys;
                return this;
            }

            public SchemasSpecificTablesAdbTableSchema build() {
                return new SchemasSpecificTablesAdbTableSchema(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectModifyRecordsRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectModifyRecordsRequest</p>
     */
    public static class SchemasSpecificTables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdbTableSchema")
        private SchemasSpecificTablesAdbTableSchema adbTableSchema;

        @com.aliyun.core.annotation.NameInMap("FilterColumns")
        private java.util.List<String> filterColumns;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("MappedName")
        private String mappedName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ShardColumns")
        private java.util.List<String> shardColumns;

        @com.aliyun.core.annotation.NameInMap("WhereClause")
        private String whereClause;

        private SchemasSpecificTables(Builder builder) {
            this.adbTableSchema = builder.adbTableSchema;
            this.filterColumns = builder.filterColumns;
            this.id = builder.id;
            this.mappedName = builder.mappedName;
            this.name = builder.name;
            this.shardColumns = builder.shardColumns;
            this.whereClause = builder.whereClause;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SchemasSpecificTables create() {
            return builder().build();
        }

        /**
         * @return adbTableSchema
         */
        public SchemasSpecificTablesAdbTableSchema getAdbTableSchema() {
            return this.adbTableSchema;
        }

        /**
         * @return filterColumns
         */
        public java.util.List<String> getFilterColumns() {
            return this.filterColumns;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return mappedName
         */
        public String getMappedName() {
            return this.mappedName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return shardColumns
         */
        public java.util.List<String> getShardColumns() {
            return this.shardColumns;
        }

        /**
         * @return whereClause
         */
        public String getWhereClause() {
            return this.whereClause;
        }

        public static final class Builder {
            private SchemasSpecificTablesAdbTableSchema adbTableSchema; 
            private java.util.List<String> filterColumns; 
            private String id; 
            private String mappedName; 
            private String name; 
            private java.util.List<String> shardColumns; 
            private String whereClause; 

            private Builder() {
            } 

            private Builder(SchemasSpecificTables model) {
                this.adbTableSchema = model.adbTableSchema;
                this.filterColumns = model.filterColumns;
                this.id = model.id;
                this.mappedName = model.mappedName;
                this.name = model.name;
                this.shardColumns = model.shardColumns;
                this.whereClause = model.whereClause;
            } 

            /**
             * AdbTableSchema.
             */
            public Builder adbTableSchema(SchemasSpecificTablesAdbTableSchema adbTableSchema) {
                this.adbTableSchema = adbTableSchema;
                return this;
            }

            /**
             * FilterColumns.
             */
            public Builder filterColumns(java.util.List<String> filterColumns) {
                this.filterColumns = filterColumns;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>np_fe****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * MappedName.
             */
            public Builder mappedName(String mappedName) {
                this.mappedName = mappedName;
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
             * ShardColumns.
             */
            public Builder shardColumns(java.util.List<String> shardColumns) {
                this.shardColumns = shardColumns;
                return this;
            }

            /**
             * WhereClause.
             */
            public Builder whereClause(String whereClause) {
                this.whereClause = whereClause;
                return this;
            }

            public SchemasSpecificTables build() {
                return new SchemasSpecificTables(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectModifyRecordsRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectModifyRecordsRequest</p>
     */
    public static class SchemasSpecificViewsAdbTableSchema extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DistributedKeys")
        private java.util.List<String> distributedKeys;

        @com.aliyun.core.annotation.NameInMap("PartitionLifeCycle")
        private String partitionLifeCycle;

        @com.aliyun.core.annotation.NameInMap("PartitionStatement")
        private String partitionStatement;

        @com.aliyun.core.annotation.NameInMap("PrimaryKeys")
        private java.util.List<String> primaryKeys;

        private SchemasSpecificViewsAdbTableSchema(Builder builder) {
            this.distributedKeys = builder.distributedKeys;
            this.partitionLifeCycle = builder.partitionLifeCycle;
            this.partitionStatement = builder.partitionStatement;
            this.primaryKeys = builder.primaryKeys;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SchemasSpecificViewsAdbTableSchema create() {
            return builder().build();
        }

        /**
         * @return distributedKeys
         */
        public java.util.List<String> getDistributedKeys() {
            return this.distributedKeys;
        }

        /**
         * @return partitionLifeCycle
         */
        public String getPartitionLifeCycle() {
            return this.partitionLifeCycle;
        }

        /**
         * @return partitionStatement
         */
        public String getPartitionStatement() {
            return this.partitionStatement;
        }

        /**
         * @return primaryKeys
         */
        public java.util.List<String> getPrimaryKeys() {
            return this.primaryKeys;
        }

        public static final class Builder {
            private java.util.List<String> distributedKeys; 
            private String partitionLifeCycle; 
            private String partitionStatement; 
            private java.util.List<String> primaryKeys; 

            private Builder() {
            } 

            private Builder(SchemasSpecificViewsAdbTableSchema model) {
                this.distributedKeys = model.distributedKeys;
                this.partitionLifeCycle = model.partitionLifeCycle;
                this.partitionStatement = model.partitionStatement;
                this.primaryKeys = model.primaryKeys;
            } 

            /**
             * DistributedKeys.
             */
            public Builder distributedKeys(java.util.List<String> distributedKeys) {
                this.distributedKeys = distributedKeys;
                return this;
            }

            /**
             * PartitionLifeCycle.
             */
            public Builder partitionLifeCycle(String partitionLifeCycle) {
                this.partitionLifeCycle = partitionLifeCycle;
                return this;
            }

            /**
             * PartitionStatement.
             */
            public Builder partitionStatement(String partitionStatement) {
                this.partitionStatement = partitionStatement;
                return this;
            }

            /**
             * PrimaryKeys.
             */
            public Builder primaryKeys(java.util.List<String> primaryKeys) {
                this.primaryKeys = primaryKeys;
                return this;
            }

            public SchemasSpecificViewsAdbTableSchema build() {
                return new SchemasSpecificViewsAdbTableSchema(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectModifyRecordsRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectModifyRecordsRequest</p>
     */
    public static class SchemasSpecificViews extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdbTableSchema")
        private SchemasSpecificViewsAdbTableSchema adbTableSchema;

        @com.aliyun.core.annotation.NameInMap("FilterColumns")
        private java.util.List<String> filterColumns;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("MappedName")
        private String mappedName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ShardColumns")
        private java.util.List<String> shardColumns;

        @com.aliyun.core.annotation.NameInMap("WhereClause")
        private String whereClause;

        private SchemasSpecificViews(Builder builder) {
            this.adbTableSchema = builder.adbTableSchema;
            this.filterColumns = builder.filterColumns;
            this.id = builder.id;
            this.mappedName = builder.mappedName;
            this.name = builder.name;
            this.shardColumns = builder.shardColumns;
            this.whereClause = builder.whereClause;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SchemasSpecificViews create() {
            return builder().build();
        }

        /**
         * @return adbTableSchema
         */
        public SchemasSpecificViewsAdbTableSchema getAdbTableSchema() {
            return this.adbTableSchema;
        }

        /**
         * @return filterColumns
         */
        public java.util.List<String> getFilterColumns() {
            return this.filterColumns;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return mappedName
         */
        public String getMappedName() {
            return this.mappedName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return shardColumns
         */
        public java.util.List<String> getShardColumns() {
            return this.shardColumns;
        }

        /**
         * @return whereClause
         */
        public String getWhereClause() {
            return this.whereClause;
        }

        public static final class Builder {
            private SchemasSpecificViewsAdbTableSchema adbTableSchema; 
            private java.util.List<String> filterColumns; 
            private String id; 
            private String mappedName; 
            private String name; 
            private java.util.List<String> shardColumns; 
            private String whereClause; 

            private Builder() {
            } 

            private Builder(SchemasSpecificViews model) {
                this.adbTableSchema = model.adbTableSchema;
                this.filterColumns = model.filterColumns;
                this.id = model.id;
                this.mappedName = model.mappedName;
                this.name = model.name;
                this.shardColumns = model.shardColumns;
                this.whereClause = model.whereClause;
            } 

            /**
             * AdbTableSchema.
             */
            public Builder adbTableSchema(SchemasSpecificViewsAdbTableSchema adbTableSchema) {
                this.adbTableSchema = adbTableSchema;
                return this;
            }

            /**
             * FilterColumns.
             */
            public Builder filterColumns(java.util.List<String> filterColumns) {
                this.filterColumns = filterColumns;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>np_fe****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * MappedName.
             */
            public Builder mappedName(String mappedName) {
                this.mappedName = mappedName;
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
             * ShardColumns.
             */
            public Builder shardColumns(java.util.List<String> shardColumns) {
                this.shardColumns = shardColumns;
                return this;
            }

            /**
             * WhereClause.
             */
            public Builder whereClause(String whereClause) {
                this.whereClause = whereClause;
                return this;
            }

            public SchemasSpecificViews build() {
                return new SchemasSpecificViews(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectModifyRecordsRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectModifyRecordsRequest</p>
     */
    public static class SchemasTablesAdbTableSchema extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DistributedKeys")
        private java.util.List<String> distributedKeys;

        @com.aliyun.core.annotation.NameInMap("PartitionLifeCycle")
        private String partitionLifeCycle;

        @com.aliyun.core.annotation.NameInMap("PartitionStatement")
        private String partitionStatement;

        @com.aliyun.core.annotation.NameInMap("PrimaryKeys")
        private java.util.List<String> primaryKeys;

        private SchemasTablesAdbTableSchema(Builder builder) {
            this.distributedKeys = builder.distributedKeys;
            this.partitionLifeCycle = builder.partitionLifeCycle;
            this.partitionStatement = builder.partitionStatement;
            this.primaryKeys = builder.primaryKeys;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SchemasTablesAdbTableSchema create() {
            return builder().build();
        }

        /**
         * @return distributedKeys
         */
        public java.util.List<String> getDistributedKeys() {
            return this.distributedKeys;
        }

        /**
         * @return partitionLifeCycle
         */
        public String getPartitionLifeCycle() {
            return this.partitionLifeCycle;
        }

        /**
         * @return partitionStatement
         */
        public String getPartitionStatement() {
            return this.partitionStatement;
        }

        /**
         * @return primaryKeys
         */
        public java.util.List<String> getPrimaryKeys() {
            return this.primaryKeys;
        }

        public static final class Builder {
            private java.util.List<String> distributedKeys; 
            private String partitionLifeCycle; 
            private String partitionStatement; 
            private java.util.List<String> primaryKeys; 

            private Builder() {
            } 

            private Builder(SchemasTablesAdbTableSchema model) {
                this.distributedKeys = model.distributedKeys;
                this.partitionLifeCycle = model.partitionLifeCycle;
                this.partitionStatement = model.partitionStatement;
                this.primaryKeys = model.primaryKeys;
            } 

            /**
             * DistributedKeys.
             */
            public Builder distributedKeys(java.util.List<String> distributedKeys) {
                this.distributedKeys = distributedKeys;
                return this;
            }

            /**
             * PartitionLifeCycle.
             */
            public Builder partitionLifeCycle(String partitionLifeCycle) {
                this.partitionLifeCycle = partitionLifeCycle;
                return this;
            }

            /**
             * PartitionStatement.
             */
            public Builder partitionStatement(String partitionStatement) {
                this.partitionStatement = partitionStatement;
                return this;
            }

            /**
             * PrimaryKeys.
             */
            public Builder primaryKeys(java.util.List<String> primaryKeys) {
                this.primaryKeys = primaryKeys;
                return this;
            }

            public SchemasTablesAdbTableSchema build() {
                return new SchemasTablesAdbTableSchema(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectModifyRecordsRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectModifyRecordsRequest</p>
     */
    public static class SchemasTablesObkvPartitionConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PartitionSize")
        @com.aliyun.core.annotation.Validation(maximum = 1024, minimum = 1)
        private Integer partitionSize;

        @com.aliyun.core.annotation.NameInMap("PartitionType")
        private String partitionType;

        @com.aliyun.core.annotation.NameInMap("VirtualColumn")
        private String virtualColumn;

        private SchemasTablesObkvPartitionConfig(Builder builder) {
            this.partitionSize = builder.partitionSize;
            this.partitionType = builder.partitionType;
            this.virtualColumn = builder.virtualColumn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SchemasTablesObkvPartitionConfig create() {
            return builder().build();
        }

        /**
         * @return partitionSize
         */
        public Integer getPartitionSize() {
            return this.partitionSize;
        }

        /**
         * @return partitionType
         */
        public String getPartitionType() {
            return this.partitionType;
        }

        /**
         * @return virtualColumn
         */
        public String getVirtualColumn() {
            return this.virtualColumn;
        }

        public static final class Builder {
            private Integer partitionSize; 
            private String partitionType; 
            private String virtualColumn; 

            private Builder() {
            } 

            private Builder(SchemasTablesObkvPartitionConfig model) {
                this.partitionSize = model.partitionSize;
                this.partitionType = model.partitionType;
                this.virtualColumn = model.virtualColumn;
            } 

            /**
             * PartitionSize.
             */
            public Builder partitionSize(Integer partitionSize) {
                this.partitionSize = partitionSize;
                return this;
            }

            /**
             * PartitionType.
             */
            public Builder partitionType(String partitionType) {
                this.partitionType = partitionType;
                return this;
            }

            /**
             * VirtualColumn.
             */
            public Builder virtualColumn(String virtualColumn) {
                this.virtualColumn = virtualColumn;
                return this;
            }

            public SchemasTablesObkvPartitionConfig build() {
                return new SchemasTablesObkvPartitionConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectModifyRecordsRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectModifyRecordsRequest</p>
     */
    public static class SchemasTables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdbTableSchema")
        private SchemasTablesAdbTableSchema adbTableSchema;

        @com.aliyun.core.annotation.NameInMap("FilterColumns")
        private java.util.List<String> filterColumns;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("MappedName")
        private String mappedName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ObkvPartitionConfig")
        private SchemasTablesObkvPartitionConfig obkvPartitionConfig;

        @com.aliyun.core.annotation.NameInMap("ShardColumns")
        private java.util.List<String> shardColumns;

        @com.aliyun.core.annotation.NameInMap("WhereClause")
        private String whereClause;

        private SchemasTables(Builder builder) {
            this.adbTableSchema = builder.adbTableSchema;
            this.filterColumns = builder.filterColumns;
            this.id = builder.id;
            this.mappedName = builder.mappedName;
            this.name = builder.name;
            this.obkvPartitionConfig = builder.obkvPartitionConfig;
            this.shardColumns = builder.shardColumns;
            this.whereClause = builder.whereClause;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SchemasTables create() {
            return builder().build();
        }

        /**
         * @return adbTableSchema
         */
        public SchemasTablesAdbTableSchema getAdbTableSchema() {
            return this.adbTableSchema;
        }

        /**
         * @return filterColumns
         */
        public java.util.List<String> getFilterColumns() {
            return this.filterColumns;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return mappedName
         */
        public String getMappedName() {
            return this.mappedName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return obkvPartitionConfig
         */
        public SchemasTablesObkvPartitionConfig getObkvPartitionConfig() {
            return this.obkvPartitionConfig;
        }

        /**
         * @return shardColumns
         */
        public java.util.List<String> getShardColumns() {
            return this.shardColumns;
        }

        /**
         * @return whereClause
         */
        public String getWhereClause() {
            return this.whereClause;
        }

        public static final class Builder {
            private SchemasTablesAdbTableSchema adbTableSchema; 
            private java.util.List<String> filterColumns; 
            private String id; 
            private String mappedName; 
            private String name; 
            private SchemasTablesObkvPartitionConfig obkvPartitionConfig; 
            private java.util.List<String> shardColumns; 
            private String whereClause; 

            private Builder() {
            } 

            private Builder(SchemasTables model) {
                this.adbTableSchema = model.adbTableSchema;
                this.filterColumns = model.filterColumns;
                this.id = model.id;
                this.mappedName = model.mappedName;
                this.name = model.name;
                this.obkvPartitionConfig = model.obkvPartitionConfig;
                this.shardColumns = model.shardColumns;
                this.whereClause = model.whereClause;
            } 

            /**
             * AdbTableSchema.
             */
            public Builder adbTableSchema(SchemasTablesAdbTableSchema adbTableSchema) {
                this.adbTableSchema = adbTableSchema;
                return this;
            }

            /**
             * FilterColumns.
             */
            public Builder filterColumns(java.util.List<String> filterColumns) {
                this.filterColumns = filterColumns;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>np_fe****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * MappedName.
             */
            public Builder mappedName(String mappedName) {
                this.mappedName = mappedName;
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
             * ObkvPartitionConfig.
             */
            public Builder obkvPartitionConfig(SchemasTablesObkvPartitionConfig obkvPartitionConfig) {
                this.obkvPartitionConfig = obkvPartitionConfig;
                return this;
            }

            /**
             * ShardColumns.
             */
            public Builder shardColumns(java.util.List<String> shardColumns) {
                this.shardColumns = shardColumns;
                return this;
            }

            /**
             * WhereClause.
             */
            public Builder whereClause(String whereClause) {
                this.whereClause = whereClause;
                return this;
            }

            public SchemasTables build() {
                return new SchemasTables(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectModifyRecordsRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectModifyRecordsRequest</p>
     */
    public static class SchemasViewsAdbTableSchema extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DistributedKeys")
        private java.util.List<String> distributedKeys;

        @com.aliyun.core.annotation.NameInMap("PartitionLifeCycle")
        private String partitionLifeCycle;

        @com.aliyun.core.annotation.NameInMap("PartitionStatement")
        private String partitionStatement;

        @com.aliyun.core.annotation.NameInMap("PrimaryKeys")
        private java.util.List<String> primaryKeys;

        private SchemasViewsAdbTableSchema(Builder builder) {
            this.distributedKeys = builder.distributedKeys;
            this.partitionLifeCycle = builder.partitionLifeCycle;
            this.partitionStatement = builder.partitionStatement;
            this.primaryKeys = builder.primaryKeys;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SchemasViewsAdbTableSchema create() {
            return builder().build();
        }

        /**
         * @return distributedKeys
         */
        public java.util.List<String> getDistributedKeys() {
            return this.distributedKeys;
        }

        /**
         * @return partitionLifeCycle
         */
        public String getPartitionLifeCycle() {
            return this.partitionLifeCycle;
        }

        /**
         * @return partitionStatement
         */
        public String getPartitionStatement() {
            return this.partitionStatement;
        }

        /**
         * @return primaryKeys
         */
        public java.util.List<String> getPrimaryKeys() {
            return this.primaryKeys;
        }

        public static final class Builder {
            private java.util.List<String> distributedKeys; 
            private String partitionLifeCycle; 
            private String partitionStatement; 
            private java.util.List<String> primaryKeys; 

            private Builder() {
            } 

            private Builder(SchemasViewsAdbTableSchema model) {
                this.distributedKeys = model.distributedKeys;
                this.partitionLifeCycle = model.partitionLifeCycle;
                this.partitionStatement = model.partitionStatement;
                this.primaryKeys = model.primaryKeys;
            } 

            /**
             * DistributedKeys.
             */
            public Builder distributedKeys(java.util.List<String> distributedKeys) {
                this.distributedKeys = distributedKeys;
                return this;
            }

            /**
             * PartitionLifeCycle.
             */
            public Builder partitionLifeCycle(String partitionLifeCycle) {
                this.partitionLifeCycle = partitionLifeCycle;
                return this;
            }

            /**
             * PartitionStatement.
             */
            public Builder partitionStatement(String partitionStatement) {
                this.partitionStatement = partitionStatement;
                return this;
            }

            /**
             * PrimaryKeys.
             */
            public Builder primaryKeys(java.util.List<String> primaryKeys) {
                this.primaryKeys = primaryKeys;
                return this;
            }

            public SchemasViewsAdbTableSchema build() {
                return new SchemasViewsAdbTableSchema(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectModifyRecordsRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectModifyRecordsRequest</p>
     */
    public static class SchemasViews extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdbTableSchema")
        private SchemasViewsAdbTableSchema adbTableSchema;

        @com.aliyun.core.annotation.NameInMap("FilterColumns")
        private java.util.List<String> filterColumns;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("MappedName")
        private String mappedName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ShardColumns")
        private java.util.List<String> shardColumns;

        @com.aliyun.core.annotation.NameInMap("WhereClause")
        private String whereClause;

        private SchemasViews(Builder builder) {
            this.adbTableSchema = builder.adbTableSchema;
            this.filterColumns = builder.filterColumns;
            this.id = builder.id;
            this.mappedName = builder.mappedName;
            this.name = builder.name;
            this.shardColumns = builder.shardColumns;
            this.whereClause = builder.whereClause;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SchemasViews create() {
            return builder().build();
        }

        /**
         * @return adbTableSchema
         */
        public SchemasViewsAdbTableSchema getAdbTableSchema() {
            return this.adbTableSchema;
        }

        /**
         * @return filterColumns
         */
        public java.util.List<String> getFilterColumns() {
            return this.filterColumns;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return mappedName
         */
        public String getMappedName() {
            return this.mappedName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return shardColumns
         */
        public java.util.List<String> getShardColumns() {
            return this.shardColumns;
        }

        /**
         * @return whereClause
         */
        public String getWhereClause() {
            return this.whereClause;
        }

        public static final class Builder {
            private SchemasViewsAdbTableSchema adbTableSchema; 
            private java.util.List<String> filterColumns; 
            private String id; 
            private String mappedName; 
            private String name; 
            private java.util.List<String> shardColumns; 
            private String whereClause; 

            private Builder() {
            } 

            private Builder(SchemasViews model) {
                this.adbTableSchema = model.adbTableSchema;
                this.filterColumns = model.filterColumns;
                this.id = model.id;
                this.mappedName = model.mappedName;
                this.name = model.name;
                this.shardColumns = model.shardColumns;
                this.whereClause = model.whereClause;
            } 

            /**
             * AdbTableSchema.
             */
            public Builder adbTableSchema(SchemasViewsAdbTableSchema adbTableSchema) {
                this.adbTableSchema = adbTableSchema;
                return this;
            }

            /**
             * FilterColumns.
             */
            public Builder filterColumns(java.util.List<String> filterColumns) {
                this.filterColumns = filterColumns;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>np_fe****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * MappedName.
             */
            public Builder mappedName(String mappedName) {
                this.mappedName = mappedName;
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
             * ShardColumns.
             */
            public Builder shardColumns(java.util.List<String> shardColumns) {
                this.shardColumns = shardColumns;
                return this;
            }

            /**
             * WhereClause.
             */
            public Builder whereClause(String whereClause) {
                this.whereClause = whereClause;
                return this;
            }

            public SchemasViews build() {
                return new SchemasViews(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectModifyRecordsRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectModifyRecordsRequest</p>
     */
    public static class Schemas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("MappedName")
        private String mappedName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SpecificTables")
        private java.util.List<SchemasSpecificTables> specificTables;

        @com.aliyun.core.annotation.NameInMap("SpecificViews")
        private java.util.List<SchemasSpecificViews> specificViews;

        @com.aliyun.core.annotation.NameInMap("Tables")
        private java.util.List<SchemasTables> tables;

        @com.aliyun.core.annotation.NameInMap("TenantName")
        private String tenantName;

        @com.aliyun.core.annotation.NameInMap("Views")
        private java.util.List<SchemasViews> views;

        private Schemas(Builder builder) {
            this.clusterName = builder.clusterName;
            this.id = builder.id;
            this.mappedName = builder.mappedName;
            this.name = builder.name;
            this.specificTables = builder.specificTables;
            this.specificViews = builder.specificViews;
            this.tables = builder.tables;
            this.tenantName = builder.tenantName;
            this.views = builder.views;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Schemas create() {
            return builder().build();
        }

        /**
         * @return clusterName
         */
        public String getClusterName() {
            return this.clusterName;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return mappedName
         */
        public String getMappedName() {
            return this.mappedName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return specificTables
         */
        public java.util.List<SchemasSpecificTables> getSpecificTables() {
            return this.specificTables;
        }

        /**
         * @return specificViews
         */
        public java.util.List<SchemasSpecificViews> getSpecificViews() {
            return this.specificViews;
        }

        /**
         * @return tables
         */
        public java.util.List<SchemasTables> getTables() {
            return this.tables;
        }

        /**
         * @return tenantName
         */
        public String getTenantName() {
            return this.tenantName;
        }

        /**
         * @return views
         */
        public java.util.List<SchemasViews> getViews() {
            return this.views;
        }

        public static final class Builder {
            private String clusterName; 
            private String id; 
            private String mappedName; 
            private String name; 
            private java.util.List<SchemasSpecificTables> specificTables; 
            private java.util.List<SchemasSpecificViews> specificViews; 
            private java.util.List<SchemasTables> tables; 
            private String tenantName; 
            private java.util.List<SchemasViews> views; 

            private Builder() {
            } 

            private Builder(Schemas model) {
                this.clusterName = model.clusterName;
                this.id = model.id;
                this.mappedName = model.mappedName;
                this.name = model.name;
                this.specificTables = model.specificTables;
                this.specificViews = model.specificViews;
                this.tables = model.tables;
                this.tenantName = model.tenantName;
                this.views = model.views;
            } 

            /**
             * ClusterName.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>np_fe****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * MappedName.
             */
            public Builder mappedName(String mappedName) {
                this.mappedName = mappedName;
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
             * SpecificTables.
             */
            public Builder specificTables(java.util.List<SchemasSpecificTables> specificTables) {
                this.specificTables = specificTables;
                return this;
            }

            /**
             * SpecificViews.
             */
            public Builder specificViews(java.util.List<SchemasSpecificViews> specificViews) {
                this.specificViews = specificViews;
                return this;
            }

            /**
             * Tables.
             */
            public Builder tables(java.util.List<SchemasTables> tables) {
                this.tables = tables;
                return this;
            }

            /**
             * TenantName.
             */
            public Builder tenantName(String tenantName) {
                this.tenantName = tenantName;
                return this;
            }

            /**
             * Views.
             */
            public Builder views(java.util.List<SchemasViews> views) {
                this.views = views;
                return this;
            }

            public Schemas build() {
                return new Schemas(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectModifyRecordsRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectModifyRecordsRequest</p>
     */
    public static class WhiteTableRulesObjectMapping extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MappedName")
        private String mappedName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private WhiteTableRulesObjectMapping(Builder builder) {
            this.mappedName = builder.mappedName;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WhiteTableRulesObjectMapping create() {
            return builder().build();
        }

        /**
         * @return mappedName
         */
        public String getMappedName() {
            return this.mappedName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String mappedName; 
            private String name; 

            private Builder() {
            } 

            private Builder(WhiteTableRulesObjectMapping model) {
                this.mappedName = model.mappedName;
                this.name = model.name;
            } 

            /**
             * MappedName.
             */
            public Builder mappedName(String mappedName) {
                this.mappedName = mappedName;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public WhiteTableRulesObjectMapping build() {
                return new WhiteTableRulesObjectMapping(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectModifyRecordsRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectModifyRecordsRequest</p>
     */
    public static class WhiteTableRulesSchemaMapping extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MappedName")
        private String mappedName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private WhiteTableRulesSchemaMapping(Builder builder) {
            this.mappedName = builder.mappedName;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WhiteTableRulesSchemaMapping create() {
            return builder().build();
        }

        /**
         * @return mappedName
         */
        public String getMappedName() {
            return this.mappedName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String mappedName; 
            private String name; 

            private Builder() {
            } 

            private Builder(WhiteTableRulesSchemaMapping model) {
                this.mappedName = model.mappedName;
                this.name = model.name;
            } 

            /**
             * MappedName.
             */
            public Builder mappedName(String mappedName) {
                this.mappedName = mappedName;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public WhiteTableRulesSchemaMapping build() {
                return new WhiteTableRulesSchemaMapping(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectModifyRecordsRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectModifyRecordsRequest</p>
     */
    public static class WhiteTableRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ObjectMapping")
        private WhiteTableRulesObjectMapping objectMapping;

        @com.aliyun.core.annotation.NameInMap("SchemaMapping")
        private WhiteTableRulesSchemaMapping schemaMapping;

        private WhiteTableRules(Builder builder) {
            this.objectMapping = builder.objectMapping;
            this.schemaMapping = builder.schemaMapping;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WhiteTableRules create() {
            return builder().build();
        }

        /**
         * @return objectMapping
         */
        public WhiteTableRulesObjectMapping getObjectMapping() {
            return this.objectMapping;
        }

        /**
         * @return schemaMapping
         */
        public WhiteTableRulesSchemaMapping getSchemaMapping() {
            return this.schemaMapping;
        }

        public static final class Builder {
            private WhiteTableRulesObjectMapping objectMapping; 
            private WhiteTableRulesSchemaMapping schemaMapping; 

            private Builder() {
            } 

            private Builder(WhiteTableRules model) {
                this.objectMapping = model.objectMapping;
                this.schemaMapping = model.schemaMapping;
            } 

            /**
             * ObjectMapping.
             */
            public Builder objectMapping(WhiteTableRulesObjectMapping objectMapping) {
                this.objectMapping = objectMapping;
                return this;
            }

            /**
             * SchemaMapping.
             */
            public Builder schemaMapping(WhiteTableRulesSchemaMapping schemaMapping) {
                this.schemaMapping = schemaMapping;
                return this;
            }

            public WhiteTableRules build() {
                return new WhiteTableRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectModifyRecordsRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectModifyRecordsRequest</p>
     */
    public static class WhiteViewRulesObjectMapping extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MappedName")
        private String mappedName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private WhiteViewRulesObjectMapping(Builder builder) {
            this.mappedName = builder.mappedName;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WhiteViewRulesObjectMapping create() {
            return builder().build();
        }

        /**
         * @return mappedName
         */
        public String getMappedName() {
            return this.mappedName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String mappedName; 
            private String name; 

            private Builder() {
            } 

            private Builder(WhiteViewRulesObjectMapping model) {
                this.mappedName = model.mappedName;
                this.name = model.name;
            } 

            /**
             * MappedName.
             */
            public Builder mappedName(String mappedName) {
                this.mappedName = mappedName;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public WhiteViewRulesObjectMapping build() {
                return new WhiteViewRulesObjectMapping(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectModifyRecordsRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectModifyRecordsRequest</p>
     */
    public static class WhiteViewRulesSchemaMapping extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MappedName")
        private String mappedName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private WhiteViewRulesSchemaMapping(Builder builder) {
            this.mappedName = builder.mappedName;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WhiteViewRulesSchemaMapping create() {
            return builder().build();
        }

        /**
         * @return mappedName
         */
        public String getMappedName() {
            return this.mappedName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String mappedName; 
            private String name; 

            private Builder() {
            } 

            private Builder(WhiteViewRulesSchemaMapping model) {
                this.mappedName = model.mappedName;
                this.name = model.name;
            } 

            /**
             * MappedName.
             */
            public Builder mappedName(String mappedName) {
                this.mappedName = mappedName;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public WhiteViewRulesSchemaMapping build() {
                return new WhiteViewRulesSchemaMapping(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectModifyRecordsRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectModifyRecordsRequest</p>
     */
    public static class WhiteViewRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ObjectMapping")
        private WhiteViewRulesObjectMapping objectMapping;

        @com.aliyun.core.annotation.NameInMap("SchemaMapping")
        private WhiteViewRulesSchemaMapping schemaMapping;

        private WhiteViewRules(Builder builder) {
            this.objectMapping = builder.objectMapping;
            this.schemaMapping = builder.schemaMapping;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WhiteViewRules create() {
            return builder().build();
        }

        /**
         * @return objectMapping
         */
        public WhiteViewRulesObjectMapping getObjectMapping() {
            return this.objectMapping;
        }

        /**
         * @return schemaMapping
         */
        public WhiteViewRulesSchemaMapping getSchemaMapping() {
            return this.schemaMapping;
        }

        public static final class Builder {
            private WhiteViewRulesObjectMapping objectMapping; 
            private WhiteViewRulesSchemaMapping schemaMapping; 

            private Builder() {
            } 

            private Builder(WhiteViewRules model) {
                this.objectMapping = model.objectMapping;
                this.schemaMapping = model.schemaMapping;
            } 

            /**
             * ObjectMapping.
             */
            public Builder objectMapping(WhiteViewRulesObjectMapping objectMapping) {
                this.objectMapping = objectMapping;
                return this;
            }

            /**
             * SchemaMapping.
             */
            public Builder schemaMapping(WhiteViewRulesSchemaMapping schemaMapping) {
                this.schemaMapping = schemaMapping;
                return this;
            }

            public WhiteViewRules build() {
                return new WhiteViewRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProjectModifyRecordsRequest} extends {@link TeaModel}
     *
     * <p>CreateProjectModifyRecordsRequest</p>
     */
    public static class TransferMapping extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BlackTableRules")
        private java.util.List<BlackTableRules> blackTableRules;

        @com.aliyun.core.annotation.NameInMap("BlackViewRules")
        private java.util.List<BlackViewRules> blackViewRules;

        @com.aliyun.core.annotation.NameInMap("Databases")
        private java.util.List<TransferMappingDatabases> databases;

        @com.aliyun.core.annotation.NameInMap("DatabasesBlack")
        private java.util.List<DatabasesBlack> databasesBlack;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("Schemas")
        private java.util.List<Schemas> schemas;

        @com.aliyun.core.annotation.NameInMap("TableAndViewBlackList")
        private java.util.List<String> tableAndViewBlackList;

        @com.aliyun.core.annotation.NameInMap("TableAndViewWhiteList")
        private java.util.List<String> tableAndViewWhiteList;

        @com.aliyun.core.annotation.NameInMap("WhiteTableRules")
        private java.util.List<WhiteTableRules> whiteTableRules;

        @com.aliyun.core.annotation.NameInMap("WhiteViewRules")
        private java.util.List<WhiteViewRules> whiteViewRules;

        private TransferMapping(Builder builder) {
            this.blackTableRules = builder.blackTableRules;
            this.blackViewRules = builder.blackViewRules;
            this.databases = builder.databases;
            this.databasesBlack = builder.databasesBlack;
            this.mode = builder.mode;
            this.schemas = builder.schemas;
            this.tableAndViewBlackList = builder.tableAndViewBlackList;
            this.tableAndViewWhiteList = builder.tableAndViewWhiteList;
            this.whiteTableRules = builder.whiteTableRules;
            this.whiteViewRules = builder.whiteViewRules;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransferMapping create() {
            return builder().build();
        }

        /**
         * @return blackTableRules
         */
        public java.util.List<BlackTableRules> getBlackTableRules() {
            return this.blackTableRules;
        }

        /**
         * @return blackViewRules
         */
        public java.util.List<BlackViewRules> getBlackViewRules() {
            return this.blackViewRules;
        }

        /**
         * @return databases
         */
        public java.util.List<TransferMappingDatabases> getDatabases() {
            return this.databases;
        }

        /**
         * @return databasesBlack
         */
        public java.util.List<DatabasesBlack> getDatabasesBlack() {
            return this.databasesBlack;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return schemas
         */
        public java.util.List<Schemas> getSchemas() {
            return this.schemas;
        }

        /**
         * @return tableAndViewBlackList
         */
        public java.util.List<String> getTableAndViewBlackList() {
            return this.tableAndViewBlackList;
        }

        /**
         * @return tableAndViewWhiteList
         */
        public java.util.List<String> getTableAndViewWhiteList() {
            return this.tableAndViewWhiteList;
        }

        /**
         * @return whiteTableRules
         */
        public java.util.List<WhiteTableRules> getWhiteTableRules() {
            return this.whiteTableRules;
        }

        /**
         * @return whiteViewRules
         */
        public java.util.List<WhiteViewRules> getWhiteViewRules() {
            return this.whiteViewRules;
        }

        public static final class Builder {
            private java.util.List<BlackTableRules> blackTableRules; 
            private java.util.List<BlackViewRules> blackViewRules; 
            private java.util.List<TransferMappingDatabases> databases; 
            private java.util.List<DatabasesBlack> databasesBlack; 
            private String mode; 
            private java.util.List<Schemas> schemas; 
            private java.util.List<String> tableAndViewBlackList; 
            private java.util.List<String> tableAndViewWhiteList; 
            private java.util.List<WhiteTableRules> whiteTableRules; 
            private java.util.List<WhiteViewRules> whiteViewRules; 

            private Builder() {
            } 

            private Builder(TransferMapping model) {
                this.blackTableRules = model.blackTableRules;
                this.blackViewRules = model.blackViewRules;
                this.databases = model.databases;
                this.databasesBlack = model.databasesBlack;
                this.mode = model.mode;
                this.schemas = model.schemas;
                this.tableAndViewBlackList = model.tableAndViewBlackList;
                this.tableAndViewWhiteList = model.tableAndViewWhiteList;
                this.whiteTableRules = model.whiteTableRules;
                this.whiteViewRules = model.whiteViewRules;
            } 

            /**
             * BlackTableRules.
             */
            public Builder blackTableRules(java.util.List<BlackTableRules> blackTableRules) {
                this.blackTableRules = blackTableRules;
                return this;
            }

            /**
             * BlackViewRules.
             */
            public Builder blackViewRules(java.util.List<BlackViewRules> blackViewRules) {
                this.blackViewRules = blackViewRules;
                return this;
            }

            /**
             * Databases.
             */
            public Builder databases(java.util.List<TransferMappingDatabases> databases) {
                this.databases = databases;
                return this;
            }

            /**
             * DatabasesBlack.
             */
            public Builder databasesBlack(java.util.List<DatabasesBlack> databasesBlack) {
                this.databasesBlack = databasesBlack;
                return this;
            }

            /**
             * Mode.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * Schemas.
             */
            public Builder schemas(java.util.List<Schemas> schemas) {
                this.schemas = schemas;
                return this;
            }

            /**
             * TableAndViewBlackList.
             */
            public Builder tableAndViewBlackList(java.util.List<String> tableAndViewBlackList) {
                this.tableAndViewBlackList = tableAndViewBlackList;
                return this;
            }

            /**
             * TableAndViewWhiteList.
             */
            public Builder tableAndViewWhiteList(java.util.List<String> tableAndViewWhiteList) {
                this.tableAndViewWhiteList = tableAndViewWhiteList;
                return this;
            }

            /**
             * WhiteTableRules.
             */
            public Builder whiteTableRules(java.util.List<WhiteTableRules> whiteTableRules) {
                this.whiteTableRules = whiteTableRules;
                return this;
            }

            /**
             * WhiteViewRules.
             */
            public Builder whiteViewRules(java.util.List<WhiteViewRules> whiteViewRules) {
                this.whiteViewRules = whiteViewRules;
                return this;
            }

            public TransferMapping build() {
                return new TransferMapping(this);
            } 

        } 

    }
}
