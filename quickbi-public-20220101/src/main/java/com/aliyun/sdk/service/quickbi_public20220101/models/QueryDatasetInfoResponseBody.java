// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDatasetInfoResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDatasetInfoResponseBody</p>
 */
public class QueryDatasetInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * Whether the operation is successfully returned. Valid values:
         * <p>
         * 
         * *   true: The call is successful.
         * *   false: The call fails.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * The unique ID of the dataset.
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
        @com.aliyun.core.annotation.NameInMap("Caption")
        private String caption;

        @com.aliyun.core.annotation.NameInMap("Customsql")
        private Boolean customsql;

        @com.aliyun.core.annotation.NameInMap("DatasourceId")
        private String datasourceId;

        @com.aliyun.core.annotation.NameInMap("DsType")
        private String dsType;

        @com.aliyun.core.annotation.NameInMap("FactTable")
        private Boolean factTable;

        @com.aliyun.core.annotation.NameInMap("Sql")
        private String sql;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        @com.aliyun.core.annotation.NameInMap("UniqueId")
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
             * Indicates whether the data source table is valid. Valid values:
             * <p>
             * 
             * *   true: data source table
             * *   false: custom table
             */
            public Builder caption(String caption) {
                this.caption = caption;
                return this;
            }

            /**
             * The display name of the table.
             */
            public Builder customsql(Boolean customsql) {
                this.customsql = customsql;
                return this;
            }

            /**
             * The name of the table.
             */
            public Builder datasourceId(String datasourceId) {
                this.datasourceId = datasourceId;
                return this;
            }

            /**
             * The ID of the data source.
             */
            public Builder dsType(String dsType) {
                this.dsType = dsType;
                return this;
            }

            /**
             * The unique ID of the table.
             */
            public Builder factTable(Boolean factTable) {
                this.factTable = factTable;
                return this;
            }

            /**
             * Indicates whether the table is a custom SQL table. Valid values:
             * <p>
             * 
             * *   true: custom SQL table
             * *   false: non-custom SQL table
             */
            public Builder sql(String sql) {
                this.sql = sql;
                return this;
            }

            /**
             * The list of tables used by the dataset.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * The type of the data source. Valid values:
             * <p>
             * 
             * *   mysql
             * *   odps
             * *   oracle
             * *   ... and other data source types supported by Quick BI
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
        @com.aliyun.core.annotation.NameInMap("Caption")
        private String caption;

        @com.aliyun.core.annotation.NameInMap("DataType")
        private String dataType;

        @com.aliyun.core.annotation.NameInMap("DimensionType")
        private String dimensionType;

        @com.aliyun.core.annotation.NameInMap("Expression")
        private String expression;

        @com.aliyun.core.annotation.NameInMap("FactColumn")
        private String factColumn;

        @com.aliyun.core.annotation.NameInMap("Granularity")
        private String granularity;

        @com.aliyun.core.annotation.NameInMap("RefUid")
        private String refUid;

        @com.aliyun.core.annotation.NameInMap("TableUniqueId")
        private String tableUniqueId;

        @com.aliyun.core.annotation.NameInMap("Uid")
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
             * The unique ID of the field that is referenced by the group measure. Non-NULL if and only if the metric is a grouping metric.
             */
            public Builder caption(String caption) {
                this.caption = caption;
                return this;
            }

            /**
             * A list of all dimensions in the dataset.
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * The actual physical field.
             */
            public Builder dimensionType(String dimensionType) {
                this.dimensionType = dimensionType;
                return this;
            }

            /**
             * Data type; value:
             * <p>
             * 
             * *   string: character
             * *   number: a number
             * *   datetime: time
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            /**
             * Expression for a calculated dimension; valid only for calculated dimensions.
             */
            public Builder factColumn(String factColumn) {
                this.factColumn = factColumn;
                return this;
            }

            /**
             * The type of the dimension. Valid values:
             * <p>
             * 
             * *   standard_dimension: General Dimension
             * *   calculate_dimension: calculating dimensions
             * *   group_dimension: grouping dimensions
             */
            public Builder granularity(String granularity) {
                this.granularity = granularity;
                return this;
            }

            /**
             * The granularity.
             */
            public Builder refUid(String refUid) {
                this.refUid = refUid;
                return this;
            }

            /**
             * The ARN.
             */
            public Builder tableUniqueId(String tableUniqueId) {
                this.tableUniqueId = tableUniqueId;
                return this;
            }

            /**
             * The display name of the dimension.
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
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PathId")
        private String pathId;

        @com.aliyun.core.annotation.NameInMap("PathName")
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
             * Test directory
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Test directory
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The information about the directory to which the dataset belongs.
             */
            public Builder pathId(String pathId) {
                this.pathId = pathId;
                return this;
            }

            /**
             * The path of the directory ID, for example, aa/bb/cc/dd.
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
        @com.aliyun.core.annotation.NameInMap("Caption")
        private String caption;

        @com.aliyun.core.annotation.NameInMap("DataType")
        private String dataType;

        @com.aliyun.core.annotation.NameInMap("Expression")
        private String expression;

        @com.aliyun.core.annotation.NameInMap("FactColumn")
        private String factColumn;

        @com.aliyun.core.annotation.NameInMap("MeasureType")
        private String measureType;

        @com.aliyun.core.annotation.NameInMap("TableUniqueId")
        private String tableUniqueId;

        @com.aliyun.core.annotation.NameInMap("Uid")
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
             * The actual physical field.
             */
            public Builder caption(String caption) {
                this.caption = caption;
                return this;
            }

            /**
             * A list of all measures for the dataset.
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * Data type; value:
             * <p>
             * 
             * *   string: character
             * *   number: a number
             * *   datetime: time
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            /**
             * The type of the measure. Valid values:
             * <p>
             * 
             * *   standard_measure: General Metrics
             * *   calculate_measure: Calculating Measures
             */
            public Builder factColumn(String factColumn) {
                this.factColumn = factColumn;
                return this;
            }

            /**
             * An expression that calculates a measure; valid only for calculated measures.
             */
            public Builder measureType(String measureType) {
                this.measureType = measureType;
                return this;
            }

            /**
             * The display name of the metric.
             */
            public Builder tableUniqueId(String tableUniqueId) {
                this.tableUniqueId = tableUniqueId;
                return this;
            }

            /**
             * The unique ID of the table to which the table belongs, which corresponds to the UniqueId of the CubeTypeList.
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
        @com.aliyun.core.annotation.NameInMap("CubeTableList")
        private java.util.List < CubeTableList> cubeTableList;

        @com.aliyun.core.annotation.NameInMap("CustimzeSql")
        private Boolean custimzeSql;

        @com.aliyun.core.annotation.NameInMap("DatasetId")
        private String datasetId;

        @com.aliyun.core.annotation.NameInMap("DatasetName")
        private String datasetName;

        @com.aliyun.core.annotation.NameInMap("DimensionList")
        private java.util.List < DimensionList> dimensionList;

        @com.aliyun.core.annotation.NameInMap("Directory")
        private Directory directory;

        @com.aliyun.core.annotation.NameInMap("DsId")
        private String dsId;

        @com.aliyun.core.annotation.NameInMap("DsName")
        private String dsName;

        @com.aliyun.core.annotation.NameInMap("DsType")
        private String dsType;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModify")
        private String gmtModify;

        @com.aliyun.core.annotation.NameInMap("MeasureList")
        private java.util.List < MeasureList> measureList;

        @com.aliyun.core.annotation.NameInMap("OpenOfflineAcceleration")
        private Boolean openOfflineAcceleration;

        @com.aliyun.core.annotation.NameInMap("OwnerId")
        private String ownerId;

        @com.aliyun.core.annotation.NameInMap("OwnerName")
        private String ownerName;

        @com.aliyun.core.annotation.NameInMap("RowLevel")
        private Boolean rowLevel;

        @com.aliyun.core.annotation.NameInMap("WorkspaceId")
        private String workspaceId;

        @com.aliyun.core.annotation.NameInMap("WorkspaceName")
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
            this.openOfflineAcceleration = builder.openOfflineAcceleration;
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
         * @return openOfflineAcceleration
         */
        public Boolean getOpenOfflineAcceleration() {
            return this.openOfflineAcceleration;
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
            private Boolean openOfflineAcceleration; 
            private String ownerId; 
            private String ownerName; 
            private Boolean rowLevel; 
            private String workspaceId; 
            private String workspaceName; 

            /**
             * The unique ID of the dataset.
             */
            public Builder cubeTableList(java.util.List < CubeTableList> cubeTableList) {
                this.cubeTableList = cubeTableList;
                return this;
            }

            /**
             * The unique ID of the workspace to which the dataset belongs.
             */
            public Builder custimzeSql(Boolean custimzeSql) {
                this.custimzeSql = custimzeSql;
                return this;
            }

            /**
             * The type of the data source. Valid values:
             * <p>
             * 
             * *   mysql
             * *   odps
             * *   oracle
             * *   ... Data source types supported by Quick BI such as
             */
            public Builder datasetId(String datasetId) {
                this.datasetId = datasetId;
                return this;
            }

            /**
             * The user ID of the dataset owner in the Quick BI.
             */
            public Builder datasetName(String datasetName) {
                this.datasetName = datasetName;
                return this;
            }

            /**
             * If it is a custom SQL table, this is the specific SQL.
             */
            public Builder dimensionList(java.util.List < DimensionList> dimensionList) {
                this.dimensionList = dimensionList;
                return this;
            }

            /**
             * The unique ID of the metric.
             */
            public Builder directory(Directory directory) {
                this.directory = directory;
                return this;
            }

            /**
             * The name of the data source.
             */
            public Builder dsId(String dsId) {
                this.dsId = dsId;
                return this;
            }

            /**
             * The time when the dataset was last modified.
             */
            public Builder dsName(String dsName) {
                this.dsName = dsName;
                return this;
            }

            /**
             * The point in time when the training dataset was created.
             */
            public Builder dsType(String dsType) {
                this.dsType = dsType;
                return this;
            }

            /**
             * Indicates whether to customize SQL statements. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The information about the dataset.
             */
            public Builder gmtModify(String gmtModify) {
                this.gmtModify = gmtModify;
                return this;
            }

            /**
             * The unique ID of the table to which the table belongs, which corresponds to the UniqueId of the CubeTypeList.
             */
            public Builder measureList(java.util.List < MeasureList> measureList) {
                this.measureList = measureList;
                return this;
            }

            /**
             * OpenOfflineAcceleration.
             */
            public Builder openOfflineAcceleration(Boolean openOfflineAcceleration) {
                this.openOfflineAcceleration = openOfflineAcceleration;
                return this;
            }

            /**
             * Test Space
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * The unique ID of the data source.
             */
            public Builder ownerName(String ownerName) {
                this.ownerName = ownerName;
                return this;
            }

            /**
             * The name of the training dataset.
             */
            public Builder rowLevel(Boolean rowLevel) {
                this.rowLevel = rowLevel;
                return this;
            }

            /**
             * Whether row-level permissions are enabled. Valid values:
             * <p>
             * 
             * *   true: The VIP Netty channel is enabled.
             * *   false: The VIP Netty channel is disabled.
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            /**
             * Big Baby
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
