// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateProjectModifyRecordsRequest} extends {@link RequestModel}
 *
 * <p>CreateProjectModifyRecordsRequest</p>
 */
public class CreateProjectModifyRecordsRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Databases")
    @Validation(required = true)
    private java.util.List < Databases> databases;

    @Body
    @NameInMap("Id")
    @Validation(required = true)
    private String id;

    private CreateProjectModifyRecordsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.databases = builder.databases;
        this.id = builder.id;
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
    public java.util.List < Databases> getDatabases() {
        return this.databases;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<CreateProjectModifyRecordsRequest, Builder> {
        private String regionId; 
        private java.util.List < Databases> databases; 
        private String id; 

        private Builder() {
            super();
        } 

        private Builder(CreateProjectModifyRecordsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.databases = request.databases;
            this.id = request.id;
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
        public Builder databases(java.util.List < Databases> databases) {
            String databasesShrink = shrink(databases, "Databases", "json");
            this.putBodyParameter("Databases", databasesShrink);
            this.databases = databases;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public CreateProjectModifyRecordsRequest build() {
            return new CreateProjectModifyRecordsRequest(this);
        } 

    } 

    public static class AdbTableSchema extends TeaModel {
        @NameInMap("DistributedKeys")
        private java.util.List < String > distributedKeys;

        @NameInMap("PartitionLifeCycle")
        private String partitionLifeCycle;

        @NameInMap("PartitionStatement")
        private String partitionStatement;

        @NameInMap("PrimaryKeys")
        private java.util.List < String > primaryKeys;

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
        public java.util.List < String > getDistributedKeys() {
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
        public java.util.List < String > getPrimaryKeys() {
            return this.primaryKeys;
        }

        public static final class Builder {
            private java.util.List < String > distributedKeys; 
            private String partitionLifeCycle; 
            private String partitionStatement; 
            private java.util.List < String > primaryKeys; 

            /**
             * DistributedKeys.
             */
            public Builder distributedKeys(java.util.List < String > distributedKeys) {
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
            public Builder primaryKeys(java.util.List < String > primaryKeys) {
                this.primaryKeys = primaryKeys;
                return this;
            }

            public AdbTableSchema build() {
                return new AdbTableSchema(this);
            } 

        } 

    }
    public static class SpecificTables extends TeaModel {
        @NameInMap("AdbTableSchema")
        private AdbTableSchema adbTableSchema;

        @NameInMap("FilterColumns")
        private java.util.List < String > filterColumns;

        @NameInMap("Id")
        private String id;

        @NameInMap("MappedName")
        private String mappedName;

        @NameInMap("Name")
        private String name;

        @NameInMap("ShardColumns")
        private java.util.List < String > shardColumns;

        @NameInMap("WhereClause")
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
        public java.util.List < String > getFilterColumns() {
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
        public java.util.List < String > getShardColumns() {
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
            private java.util.List < String > filterColumns; 
            private String id; 
            private String mappedName; 
            private String name; 
            private java.util.List < String > shardColumns; 
            private String whereClause; 

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
            public Builder filterColumns(java.util.List < String > filterColumns) {
                this.filterColumns = filterColumns;
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
            public Builder shardColumns(java.util.List < String > shardColumns) {
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
    public static class SpecificViewsAdbTableSchema extends TeaModel {
        @NameInMap("DistributedKeys")
        private java.util.List < String > distributedKeys;

        @NameInMap("PartitionLifeCycle")
        private String partitionLifeCycle;

        @NameInMap("PartitionStatement")
        private String partitionStatement;

        @NameInMap("PrimaryKeys")
        private java.util.List < String > primaryKeys;

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
        public java.util.List < String > getDistributedKeys() {
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
        public java.util.List < String > getPrimaryKeys() {
            return this.primaryKeys;
        }

        public static final class Builder {
            private java.util.List < String > distributedKeys; 
            private String partitionLifeCycle; 
            private String partitionStatement; 
            private java.util.List < String > primaryKeys; 

            /**
             * DistributedKeys.
             */
            public Builder distributedKeys(java.util.List < String > distributedKeys) {
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
            public Builder primaryKeys(java.util.List < String > primaryKeys) {
                this.primaryKeys = primaryKeys;
                return this;
            }

            public SpecificViewsAdbTableSchema build() {
                return new SpecificViewsAdbTableSchema(this);
            } 

        } 

    }
    public static class SpecificViews extends TeaModel {
        @NameInMap("AdbTableSchema")
        private SpecificViewsAdbTableSchema adbTableSchema;

        @NameInMap("FilterColumns")
        private java.util.List < String > filterColumns;

        @NameInMap("Id")
        private String id;

        @NameInMap("MappedName")
        private String mappedName;

        @NameInMap("Name")
        private String name;

        @NameInMap("ShardColumns")
        private java.util.List < String > shardColumns;

        @NameInMap("WhereClause")
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
        public java.util.List < String > getFilterColumns() {
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
        public java.util.List < String > getShardColumns() {
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
            private java.util.List < String > filterColumns; 
            private String id; 
            private String mappedName; 
            private String name; 
            private java.util.List < String > shardColumns; 
            private String whereClause; 

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
            public Builder filterColumns(java.util.List < String > filterColumns) {
                this.filterColumns = filterColumns;
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
            public Builder shardColumns(java.util.List < String > shardColumns) {
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
    public static class TablesAdbTableSchema extends TeaModel {
        @NameInMap("DistributedKeys")
        private java.util.List < String > distributedKeys;

        @NameInMap("PartitionLifeCycle")
        private String partitionLifeCycle;

        @NameInMap("PartitionStatement")
        private String partitionStatement;

        @NameInMap("PrimaryKeys")
        private java.util.List < String > primaryKeys;

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
        public java.util.List < String > getDistributedKeys() {
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
        public java.util.List < String > getPrimaryKeys() {
            return this.primaryKeys;
        }

        public static final class Builder {
            private java.util.List < String > distributedKeys; 
            private String partitionLifeCycle; 
            private String partitionStatement; 
            private java.util.List < String > primaryKeys; 

            /**
             * DistributedKeys.
             */
            public Builder distributedKeys(java.util.List < String > distributedKeys) {
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
            public Builder primaryKeys(java.util.List < String > primaryKeys) {
                this.primaryKeys = primaryKeys;
                return this;
            }

            public TablesAdbTableSchema build() {
                return new TablesAdbTableSchema(this);
            } 

        } 

    }
    public static class Tables extends TeaModel {
        @NameInMap("AdbTableSchema")
        private TablesAdbTableSchema adbTableSchema;

        @NameInMap("FilterColumns")
        private java.util.List < String > filterColumns;

        @NameInMap("Id")
        private String id;

        @NameInMap("MappedName")
        private String mappedName;

        @NameInMap("Name")
        private String name;

        @NameInMap("ShardColumns")
        private java.util.List < String > shardColumns;

        @NameInMap("WhereClause")
        private String whereClause;

        private Tables(Builder builder) {
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
        public java.util.List < String > getFilterColumns() {
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
        public java.util.List < String > getShardColumns() {
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
            private java.util.List < String > filterColumns; 
            private String id; 
            private String mappedName; 
            private String name; 
            private java.util.List < String > shardColumns; 
            private String whereClause; 

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
            public Builder filterColumns(java.util.List < String > filterColumns) {
                this.filterColumns = filterColumns;
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
            public Builder shardColumns(java.util.List < String > shardColumns) {
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
    public static class ViewsAdbTableSchema extends TeaModel {
        @NameInMap("DistributedKeys")
        private java.util.List < String > distributedKeys;

        @NameInMap("PartitionLifeCycle")
        private String partitionLifeCycle;

        @NameInMap("PartitionStatement")
        private String partitionStatement;

        @NameInMap("PrimaryKeys")
        private java.util.List < String > primaryKeys;

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
        public java.util.List < String > getDistributedKeys() {
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
        public java.util.List < String > getPrimaryKeys() {
            return this.primaryKeys;
        }

        public static final class Builder {
            private java.util.List < String > distributedKeys; 
            private String partitionLifeCycle; 
            private String partitionStatement; 
            private java.util.List < String > primaryKeys; 

            /**
             * DistributedKeys.
             */
            public Builder distributedKeys(java.util.List < String > distributedKeys) {
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
            public Builder primaryKeys(java.util.List < String > primaryKeys) {
                this.primaryKeys = primaryKeys;
                return this;
            }

            public ViewsAdbTableSchema build() {
                return new ViewsAdbTableSchema(this);
            } 

        } 

    }
    public static class Views extends TeaModel {
        @NameInMap("AdbTableSchema")
        private ViewsAdbTableSchema adbTableSchema;

        @NameInMap("FilterColumns")
        private java.util.List < String > filterColumns;

        @NameInMap("Id")
        private String id;

        @NameInMap("MappedName")
        private String mappedName;

        @NameInMap("Name")
        private String name;

        @NameInMap("ShardColumns")
        private java.util.List < String > shardColumns;

        @NameInMap("WhereClause")
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
        public java.util.List < String > getFilterColumns() {
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
        public java.util.List < String > getShardColumns() {
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
            private java.util.List < String > filterColumns; 
            private String id; 
            private String mappedName; 
            private String name; 
            private java.util.List < String > shardColumns; 
            private String whereClause; 

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
            public Builder filterColumns(java.util.List < String > filterColumns) {
                this.filterColumns = filterColumns;
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
            public Builder shardColumns(java.util.List < String > shardColumns) {
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
    public static class Databases extends TeaModel {
        @NameInMap("Id")
        private String id;

        @NameInMap("MappedName")
        private String mappedName;

        @NameInMap("Name")
        private String name;

        @NameInMap("SpecificTables")
        private java.util.List < SpecificTables> specificTables;

        @NameInMap("SpecificViews")
        private java.util.List < SpecificViews> specificViews;

        @NameInMap("Tables")
        private java.util.List < Tables> tables;

        @NameInMap("Views")
        private java.util.List < Views> views;

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
        public java.util.List < SpecificTables> getSpecificTables() {
            return this.specificTables;
        }

        /**
         * @return specificViews
         */
        public java.util.List < SpecificViews> getSpecificViews() {
            return this.specificViews;
        }

        /**
         * @return tables
         */
        public java.util.List < Tables> getTables() {
            return this.tables;
        }

        /**
         * @return views
         */
        public java.util.List < Views> getViews() {
            return this.views;
        }

        public static final class Builder {
            private String id; 
            private String mappedName; 
            private String name; 
            private java.util.List < SpecificTables> specificTables; 
            private java.util.List < SpecificViews> specificViews; 
            private java.util.List < Tables> tables; 
            private java.util.List < Views> views; 

            /**
             * Id.
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
            public Builder specificTables(java.util.List < SpecificTables> specificTables) {
                this.specificTables = specificTables;
                return this;
            }

            /**
             * SpecificViews.
             */
            public Builder specificViews(java.util.List < SpecificViews> specificViews) {
                this.specificViews = specificViews;
                return this;
            }

            /**
             * Tables.
             */
            public Builder tables(java.util.List < Tables> tables) {
                this.tables = tables;
                return this;
            }

            /**
             * Views.
             */
            public Builder views(java.util.List < Views> views) {
                this.views = views;
                return this;
            }

            public Databases build() {
                return new Databases(this);
            } 

        } 

    }
}
