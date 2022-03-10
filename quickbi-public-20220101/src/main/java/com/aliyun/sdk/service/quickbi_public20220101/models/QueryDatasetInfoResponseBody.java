// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDatasetInfoResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDatasetInfoResponseBody</p>
 */
public class QueryDatasetInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    @NameInMap("Success")
    private Boolean success;

    private QueryDatasetInfoResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDatasetInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 
        private Boolean success; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryDatasetInfoResponseBody build() {
            return new QueryDatasetInfoResponseBody(this);
        } 

    } 

    public static class CubeTableList extends TeaModel {
        @NameInMap("Caption")
        private String caption;

        @NameInMap("Customsql")
        private Boolean customsql;

        @NameInMap("DatasourceId")
        private String datasourceId;

        @NameInMap("DsType")
        private String dsType;

        @NameInMap("FactTable")
        private Boolean factTable;

        @NameInMap("Sql")
        private String sql;

        @NameInMap("TableName")
        private String tableName;

        @NameInMap("UniqueId")
        private String uniqueId;

        private CubeTableList(Builder builder) {
            this.caption = builder.caption;
            this.customsql = builder.customsql;
            this.datasourceId = builder.datasourceId;
            this.dsType = builder.dsType;
            this.factTable = builder.factTable;
            this.sql = builder.sql;
            this.tableName = builder.tableName;
            this.uniqueId = builder.uniqueId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CubeTableList create() {
            return builder().build();
        }

        /**
         * @return caption
         */
        public String getCaption() {
            return this.caption;
        }

        /**
         * @return customsql
         */
        public Boolean getCustomsql() {
            return this.customsql;
        }

        /**
         * @return datasourceId
         */
        public String getDatasourceId() {
            return this.datasourceId;
        }

        /**
         * @return dsType
         */
        public String getDsType() {
            return this.dsType;
        }

        /**
         * @return factTable
         */
        public Boolean getFactTable() {
            return this.factTable;
        }

        /**
         * @return sql
         */
        public String getSql() {
            return this.sql;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        /**
         * @return uniqueId
         */
        public String getUniqueId() {
            return this.uniqueId;
        }

        public static final class Builder {
            private String caption; 
            private Boolean customsql; 
            private String datasourceId; 
            private String dsType; 
            private Boolean factTable; 
            private String sql; 
            private String tableName; 
            private String uniqueId; 

            /**
             * Caption.
             */
            public Builder caption(String caption) {
                this.caption = caption;
                return this;
            }

            /**
             * Customsql.
             */
            public Builder customsql(Boolean customsql) {
                this.customsql = customsql;
                return this;
            }

            /**
             * DatasourceId.
             */
            public Builder datasourceId(String datasourceId) {
                this.datasourceId = datasourceId;
                return this;
            }

            /**
             * DsType.
             */
            public Builder dsType(String dsType) {
                this.dsType = dsType;
                return this;
            }

            /**
             * FactTable.
             */
            public Builder factTable(Boolean factTable) {
                this.factTable = factTable;
                return this;
            }

            /**
             * Sql.
             */
            public Builder sql(String sql) {
                this.sql = sql;
                return this;
            }

            /**
             * TableName.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * UniqueId.
             */
            public Builder uniqueId(String uniqueId) {
                this.uniqueId = uniqueId;
                return this;
            }

            public CubeTableList build() {
                return new CubeTableList(this);
            } 

        } 

    }
    public static class DimensionList extends TeaModel {
        @NameInMap("Caption")
        private String caption;

        @NameInMap("DataType")
        private String dataType;

        @NameInMap("DimensionType")
        private String dimensionType;

        @NameInMap("Expression")
        private String expression;

        @NameInMap("FactColumn")
        private String factColumn;

        @NameInMap("Granularity")
        private String granularity;

        @NameInMap("RefUid")
        private String refUid;

        @NameInMap("TableUniqueId")
        private String tableUniqueId;

        @NameInMap("Uid")
        private String uid;

        private DimensionList(Builder builder) {
            this.caption = builder.caption;
            this.dataType = builder.dataType;
            this.dimensionType = builder.dimensionType;
            this.expression = builder.expression;
            this.factColumn = builder.factColumn;
            this.granularity = builder.granularity;
            this.refUid = builder.refUid;
            this.tableUniqueId = builder.tableUniqueId;
            this.uid = builder.uid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DimensionList create() {
            return builder().build();
        }

        /**
         * @return caption
         */
        public String getCaption() {
            return this.caption;
        }

        /**
         * @return dataType
         */
        public String getDataType() {
            return this.dataType;
        }

        /**
         * @return dimensionType
         */
        public String getDimensionType() {
            return this.dimensionType;
        }

        /**
         * @return expression
         */
        public String getExpression() {
            return this.expression;
        }

        /**
         * @return factColumn
         */
        public String getFactColumn() {
            return this.factColumn;
        }

        /**
         * @return granularity
         */
        public String getGranularity() {
            return this.granularity;
        }

        /**
         * @return refUid
         */
        public String getRefUid() {
            return this.refUid;
        }

        /**
         * @return tableUniqueId
         */
        public String getTableUniqueId() {
            return this.tableUniqueId;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        public static final class Builder {
            private String caption; 
            private String dataType; 
            private String dimensionType; 
            private String expression; 
            private String factColumn; 
            private String granularity; 
            private String refUid; 
            private String tableUniqueId; 
            private String uid; 

            /**
             * Caption.
             */
            public Builder caption(String caption) {
                this.caption = caption;
                return this;
            }

            /**
             * DataType.
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * DimensionType.
             */
            public Builder dimensionType(String dimensionType) {
                this.dimensionType = dimensionType;
                return this;
            }

            /**
             * Expression.
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            /**
             * FactColumn.
             */
            public Builder factColumn(String factColumn) {
                this.factColumn = factColumn;
                return this;
            }

            /**
             * Granularity.
             */
            public Builder granularity(String granularity) {
                this.granularity = granularity;
                return this;
            }

            /**
             * RefUid.
             */
            public Builder refUid(String refUid) {
                this.refUid = refUid;
                return this;
            }

            /**
             * TableUniqueId.
             */
            public Builder tableUniqueId(String tableUniqueId) {
                this.tableUniqueId = tableUniqueId;
                return this;
            }

            /**
             * Uid.
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            public DimensionList build() {
                return new DimensionList(this);
            } 

        } 

    }
    public static class Directory extends TeaModel {
        @NameInMap("Id")
        private String id;

        @NameInMap("Name")
        private String name;

        @NameInMap("PathId")
        private String pathId;

        @NameInMap("PathName")
        private String pathName;

        private Directory(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
            this.pathId = builder.pathId;
            this.pathName = builder.pathName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Directory create() {
            return builder().build();
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
         * @return pathId
         */
        public String getPathId() {
            return this.pathId;
        }

        /**
         * @return pathName
         */
        public String getPathName() {
            return this.pathName;
        }

        public static final class Builder {
            private String id; 
            private String name; 
            private String pathId; 
            private String pathName; 

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
             * PathId.
             */
            public Builder pathId(String pathId) {
                this.pathId = pathId;
                return this;
            }

            /**
             * PathName.
             */
            public Builder pathName(String pathName) {
                this.pathName = pathName;
                return this;
            }

            public Directory build() {
                return new Directory(this);
            } 

        } 

    }
    public static class MeasureList extends TeaModel {
        @NameInMap("Caption")
        private String caption;

        @NameInMap("DataType")
        private String dataType;

        @NameInMap("Expression")
        private String expression;

        @NameInMap("FactColumn")
        private String factColumn;

        @NameInMap("MeasureType")
        private String measureType;

        @NameInMap("TableUniqueId")
        private String tableUniqueId;

        @NameInMap("Uid")
        private String uid;

        private MeasureList(Builder builder) {
            this.caption = builder.caption;
            this.dataType = builder.dataType;
            this.expression = builder.expression;
            this.factColumn = builder.factColumn;
            this.measureType = builder.measureType;
            this.tableUniqueId = builder.tableUniqueId;
            this.uid = builder.uid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MeasureList create() {
            return builder().build();
        }

        /**
         * @return caption
         */
        public String getCaption() {
            return this.caption;
        }

        /**
         * @return dataType
         */
        public String getDataType() {
            return this.dataType;
        }

        /**
         * @return expression
         */
        public String getExpression() {
            return this.expression;
        }

        /**
         * @return factColumn
         */
        public String getFactColumn() {
            return this.factColumn;
        }

        /**
         * @return measureType
         */
        public String getMeasureType() {
            return this.measureType;
        }

        /**
         * @return tableUniqueId
         */
        public String getTableUniqueId() {
            return this.tableUniqueId;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        public static final class Builder {
            private String caption; 
            private String dataType; 
            private String expression; 
            private String factColumn; 
            private String measureType; 
            private String tableUniqueId; 
            private String uid; 

            /**
             * Caption.
             */
            public Builder caption(String caption) {
                this.caption = caption;
                return this;
            }

            /**
             * DataType.
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * Expression.
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            /**
             * FactColumn.
             */
            public Builder factColumn(String factColumn) {
                this.factColumn = factColumn;
                return this;
            }

            /**
             * MeasureType.
             */
            public Builder measureType(String measureType) {
                this.measureType = measureType;
                return this;
            }

            /**
             * TableUniqueId.
             */
            public Builder tableUniqueId(String tableUniqueId) {
                this.tableUniqueId = tableUniqueId;
                return this;
            }

            /**
             * Uid.
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            public MeasureList build() {
                return new MeasureList(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("CubeTableList")
        private java.util.List < CubeTableList> cubeTableList;

        @NameInMap("CustimzeSql")
        private Boolean custimzeSql;

        @NameInMap("DatasetId")
        private String datasetId;

        @NameInMap("DatasetName")
        private String datasetName;

        @NameInMap("DimensionList")
        private java.util.List < DimensionList> dimensionList;

        @NameInMap("Directory")
        private Directory directory;

        @NameInMap("DsId")
        private String dsId;

        @NameInMap("DsName")
        private String dsName;

        @NameInMap("DsType")
        private String dsType;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModify")
        private String gmtModify;

        @NameInMap("MeasureList")
        private java.util.List < MeasureList> measureList;

        @NameInMap("OwnerId")
        private String ownerId;

        @NameInMap("OwnerName")
        private String ownerName;

        @NameInMap("RowLevel")
        private Boolean rowLevel;

        @NameInMap("WorkspaceId")
        private String workspaceId;

        @NameInMap("WorkspaceName")
        private String workspaceName;

        private Result(Builder builder) {
            this.cubeTableList = builder.cubeTableList;
            this.custimzeSql = builder.custimzeSql;
            this.datasetId = builder.datasetId;
            this.datasetName = builder.datasetName;
            this.dimensionList = builder.dimensionList;
            this.directory = builder.directory;
            this.dsId = builder.dsId;
            this.dsName = builder.dsName;
            this.dsType = builder.dsType;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModify = builder.gmtModify;
            this.measureList = builder.measureList;
            this.ownerId = builder.ownerId;
            this.ownerName = builder.ownerName;
            this.rowLevel = builder.rowLevel;
            this.workspaceId = builder.workspaceId;
            this.workspaceName = builder.workspaceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return cubeTableList
         */
        public java.util.List < CubeTableList> getCubeTableList() {
            return this.cubeTableList;
        }

        /**
         * @return custimzeSql
         */
        public Boolean getCustimzeSql() {
            return this.custimzeSql;
        }

        /**
         * @return datasetId
         */
        public String getDatasetId() {
            return this.datasetId;
        }

        /**
         * @return datasetName
         */
        public String getDatasetName() {
            return this.datasetName;
        }

        /**
         * @return dimensionList
         */
        public java.util.List < DimensionList> getDimensionList() {
            return this.dimensionList;
        }

        /**
         * @return directory
         */
        public Directory getDirectory() {
            return this.directory;
        }

        /**
         * @return dsId
         */
        public String getDsId() {
            return this.dsId;
        }

        /**
         * @return dsName
         */
        public String getDsName() {
            return this.dsName;
        }

        /**
         * @return dsType
         */
        public String getDsType() {
            return this.dsType;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModify
         */
        public String getGmtModify() {
            return this.gmtModify;
        }

        /**
         * @return measureList
         */
        public java.util.List < MeasureList> getMeasureList() {
            return this.measureList;
        }

        /**
         * @return ownerId
         */
        public String getOwnerId() {
            return this.ownerId;
        }

        /**
         * @return ownerName
         */
        public String getOwnerName() {
            return this.ownerName;
        }

        /**
         * @return rowLevel
         */
        public Boolean getRowLevel() {
            return this.rowLevel;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        /**
         * @return workspaceName
         */
        public String getWorkspaceName() {
            return this.workspaceName;
        }

        public static final class Builder {
            private java.util.List < CubeTableList> cubeTableList; 
            private Boolean custimzeSql; 
            private String datasetId; 
            private String datasetName; 
            private java.util.List < DimensionList> dimensionList; 
            private Directory directory; 
            private String dsId; 
            private String dsName; 
            private String dsType; 
            private String gmtCreate; 
            private String gmtModify; 
            private java.util.List < MeasureList> measureList; 
            private String ownerId; 
            private String ownerName; 
            private Boolean rowLevel; 
            private String workspaceId; 
            private String workspaceName; 

            /**
             * CubeTableList.
             */
            public Builder cubeTableList(java.util.List < CubeTableList> cubeTableList) {
                this.cubeTableList = cubeTableList;
                return this;
            }

            /**
             * CustimzeSql.
             */
            public Builder custimzeSql(Boolean custimzeSql) {
                this.custimzeSql = custimzeSql;
                return this;
            }

            /**
             * DatasetId.
             */
            public Builder datasetId(String datasetId) {
                this.datasetId = datasetId;
                return this;
            }

            /**
             * DatasetName.
             */
            public Builder datasetName(String datasetName) {
                this.datasetName = datasetName;
                return this;
            }

            /**
             * DimensionList.
             */
            public Builder dimensionList(java.util.List < DimensionList> dimensionList) {
                this.dimensionList = dimensionList;
                return this;
            }

            /**
             * Directory.
             */
            public Builder directory(Directory directory) {
                this.directory = directory;
                return this;
            }

            /**
             * DsId.
             */
            public Builder dsId(String dsId) {
                this.dsId = dsId;
                return this;
            }

            /**
             * DsName.
             */
            public Builder dsName(String dsName) {
                this.dsName = dsName;
                return this;
            }

            /**
             * DsType.
             */
            public Builder dsType(String dsType) {
                this.dsType = dsType;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModify.
             */
            public Builder gmtModify(String gmtModify) {
                this.gmtModify = gmtModify;
                return this;
            }

            /**
             * MeasureList.
             */
            public Builder measureList(java.util.List < MeasureList> measureList) {
                this.measureList = measureList;
                return this;
            }

            /**
             * OwnerId.
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * OwnerName.
             */
            public Builder ownerName(String ownerName) {
                this.ownerName = ownerName;
                return this;
            }

            /**
             * RowLevel.
             */
            public Builder rowLevel(Boolean rowLevel) {
                this.rowLevel = rowLevel;
                return this;
            }

            /**
             * WorkspaceId.
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            /**
             * WorkspaceName.
             */
            public Builder workspaceName(String workspaceName) {
                this.workspaceName = workspaceName;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
