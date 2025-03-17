// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(QueryDatasetInfoResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * <p>Whether the operation is successfully returned. Valid values:</p>
         * <ul>
         * <li>true: The call is successful.</li>
         * <li>false: The call fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>a4d1a221d-41za1-****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * <p>The unique ID of the dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryDatasetInfoResponseBody build() {
            return new QueryDatasetInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryDatasetInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDatasetInfoResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(CubeTableList model) {
                this.caption = model.caption;
                this.customsql = model.customsql;
                this.datasourceId = model.datasourceId;
                this.dsType = model.dsType;
                this.factTable = model.factTable;
                this.sql = model.sql;
                this.tableName = model.tableName;
                this.uniqueId = model.uniqueId;
            } 

            /**
             * <p>Indicates whether the data source table is valid. Valid values:</p>
             * <ul>
             * <li>true: data source table</li>
             * <li>false: custom table</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>odps_40</p>
             */
            public Builder caption(String caption) {
                this.caption = caption;
                return this;
            }

            /**
             * <p>The display name of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder customsql(Boolean customsql) {
                this.customsql = customsql;
                return this;
            }

            /**
             * <p>The name of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>dfefd7f4-fc6e-42c9-b4******</p>
             */
            public Builder datasourceId(String datasourceId) {
                this.datasourceId = datasourceId;
                return this;
            }

            /**
             * <p>The ID of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>maxcompute</p>
             */
            public Builder dsType(String dsType) {
                this.dsType = dsType;
                return this;
            }

            /**
             * <p>The unique ID of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder factTable(Boolean factTable) {
                this.factTable = factTable;
                return this;
            }

            /**
             * <p>Indicates whether the table is a custom SQL table. Valid values:</p>
             * <ul>
             * <li>true: custom SQL table</li>
             * <li>false: non-custom SQL table</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>select * from ****</p>
             */
            public Builder sql(String sql) {
                this.sql = sql;
                return this;
            }

            /**
             * <p>The list of tables used by the dataset.</p>
             * 
             * <strong>example:</strong>
             * <p>viewdasb8494aab2612473cb74992159fe****</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * <p>The type of the data source. Valid values:</p>
             * <ul>
             * <li>mysql</li>
             * <li>odps</li>
             * <li>oracle</li>
             * <li>... and other data source types supported by Quick BI</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>7a62530b36</p>
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
    /**
     * 
     * {@link QueryDatasetInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDatasetInfoResponseBody</p>
     */
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

        @com.aliyun.core.annotation.NameInMap("FieldDescription")
        private String fieldDescription;

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
            this.fieldDescription = builder.fieldDescription;
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
         * @return fieldDescription
         */
        public String getFieldDescription() {
            return this.fieldDescription;
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
            private String fieldDescription; 
            private String granularity; 
            private String refUid; 
            private String tableUniqueId; 
            private String uid; 

            private Builder() {
            } 

            private Builder(DimensionList model) {
                this.caption = model.caption;
                this.dataType = model.dataType;
                this.dimensionType = model.dimensionType;
                this.expression = model.expression;
                this.factColumn = model.factColumn;
                this.fieldDescription = model.fieldDescription;
                this.granularity = model.granularity;
                this.refUid = model.refUid;
                this.tableUniqueId = model.tableUniqueId;
                this.uid = model.uid;
            } 

            /**
             * <p>The unique ID of the field that is referenced by the group measure. Non-NULL if and only if the metric is a grouping metric.</p>
             * 
             * <strong>example:</strong>
             * <p>city</p>
             */
            public Builder caption(String caption) {
                this.caption = caption;
                return this;
            }

            /**
             * <p>A list of all dimensions in the dataset.</p>
             * 
             * <strong>example:</strong>
             * <p>string</p>
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * <p>The actual physical field.</p>
             * 
             * <strong>example:</strong>
             * <p>group_dimension</p>
             */
            public Builder dimensionType(String dimensionType) {
                this.dimensionType = dimensionType;
                return this;
            }

            /**
             * <p>Data type; value:</p>
             * <ul>
             * <li>string: character</li>
             * <li>number: a number</li>
             * <li>datetime: time</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>example_expression</p>
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            /**
             * <p>Expression for a calculated dimension; valid only for calculated dimensions.</p>
             * 
             * <strong>example:</strong>
             * <p>city</p>
             */
            public Builder factColumn(String factColumn) {
                this.factColumn = factColumn;
                return this;
            }

            /**
             * FieldDescription.
             */
            public Builder fieldDescription(String fieldDescription) {
                this.fieldDescription = fieldDescription;
                return this;
            }

            /**
             * <p>The type of the dimension. Valid values:</p>
             * <ul>
             * <li>standard_dimension: General Dimension</li>
             * <li>calculate_dimension: calculating dimensions</li>
             * <li>group_dimension: grouping dimensions</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>example_granularity</p>
             */
            public Builder granularity(String granularity) {
                this.granularity = granularity;
                return this;
            }

            /**
             * <p>The granularity.</p>
             * 
             * <strong>example:</strong>
             * <p>308f7****</p>
             */
            public Builder refUid(String refUid) {
                this.refUid = refUid;
                return this;
            }

            /**
             * <p>The ARN.</p>
             * 
             * <strong>example:</strong>
             * <p>7a62530***</p>
             */
            public Builder tableUniqueId(String tableUniqueId) {
                this.tableUniqueId = tableUniqueId;
                return this;
            }

            /**
             * <p>The display name of the dimension.</p>
             * 
             * <strong>example:</strong>
             * <p>a69774***</p>
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
    /**
     * 
     * {@link QueryDatasetInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDatasetInfoResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Directory model) {
                this.id = model.id;
                this.name = model.name;
                this.pathId = model.pathId;
                this.pathName = model.pathName;
            } 

            /**
             * <p>Test directory</p>
             * 
             * <strong>example:</strong>
             * <p>a3eecab7-618d-4f9f-*****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Test directory</p>
             * 
             * <strong>example:</strong>
             * <p>The name of the directory.</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The information about the directory to which the dataset belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>88b680****</p>
             */
            public Builder pathId(String pathId) {
                this.pathId = pathId;
                return this;
            }

            /**
             * <p>The path of the directory ID, for example, aa/bb/cc/dd.</p>
             * 
             * <strong>example:</strong>
             * <p>The path name of the directory ID, for example, one-level directory /two-level directory.</p>
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
    /**
     * 
     * {@link QueryDatasetInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDatasetInfoResponseBody</p>
     */
    public static class MeasureList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Caption")
        private String caption;

        @com.aliyun.core.annotation.NameInMap("DataType")
        private String dataType;

        @com.aliyun.core.annotation.NameInMap("Expression")
        private String expression;

        @com.aliyun.core.annotation.NameInMap("FactColumn")
        private String factColumn;

        @com.aliyun.core.annotation.NameInMap("FieldDescription")
        private String fieldDescription;

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
            this.fieldDescription = builder.fieldDescription;
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
         * @return fieldDescription
         */
        public String getFieldDescription() {
            return this.fieldDescription;
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
            private String fieldDescription; 
            private String measureType; 
            private String tableUniqueId; 
            private String uid; 

            private Builder() {
            } 

            private Builder(MeasureList model) {
                this.caption = model.caption;
                this.dataType = model.dataType;
                this.expression = model.expression;
                this.factColumn = model.factColumn;
                this.fieldDescription = model.fieldDescription;
                this.measureType = model.measureType;
                this.tableUniqueId = model.tableUniqueId;
                this.uid = model.uid;
            } 

            /**
             * <p>The actual physical field.</p>
             * 
             * <strong>example:</strong>
             * <p>profit_amt</p>
             */
            public Builder caption(String caption) {
                this.caption = caption;
                return this;
            }

            /**
             * <p>A list of all measures for the dataset.</p>
             * 
             * <strong>example:</strong>
             * <p>string</p>
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * <p>Data type; value:</p>
             * <ul>
             * <li>string: character</li>
             * <li>number: a number</li>
             * <li>datetime: time</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>example_expression</p>
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            /**
             * <p>The type of the measure. Valid values:</p>
             * <ul>
             * <li>standard_measure: General Metrics</li>
             * <li>calculate_measure: Calculating Measures</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>profit_amt</p>
             */
            public Builder factColumn(String factColumn) {
                this.factColumn = factColumn;
                return this;
            }

            /**
             * FieldDescription.
             */
            public Builder fieldDescription(String fieldDescription) {
                this.fieldDescription = fieldDescription;
                return this;
            }

            /**
             * <p>An expression that calculates a measure; valid only for calculated measures.</p>
             * 
             * <strong>example:</strong>
             * <p>calculate_measure</p>
             */
            public Builder measureType(String measureType) {
                this.measureType = measureType;
                return this;
            }

            /**
             * <p>The display name of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>7a62530b36</p>
             */
            public Builder tableUniqueId(String tableUniqueId) {
                this.tableUniqueId = tableUniqueId;
                return this;
            }

            /**
             * <p>The unique ID of the table to which the table belongs, which corresponds to the UniqueId of the CubeTypeList.</p>
             * 
             * <strong>example:</strong>
             * <p>88b680****</p>
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
    /**
     * 
     * {@link QueryDatasetInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDatasetInfoResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CubeTableList")
        private java.util.List<CubeTableList> cubeTableList;

        @com.aliyun.core.annotation.NameInMap("CustimzeSql")
        private Boolean custimzeSql;

        @com.aliyun.core.annotation.NameInMap("DatasetId")
        private String datasetId;

        @com.aliyun.core.annotation.NameInMap("DatasetName")
        private String datasetName;

        @com.aliyun.core.annotation.NameInMap("DimensionList")
        private java.util.List<DimensionList> dimensionList;

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
        private java.util.List<MeasureList> measureList;

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
        public java.util.List<CubeTableList> getCubeTableList() {
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
        public java.util.List<DimensionList> getDimensionList() {
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
        public java.util.List<MeasureList> getMeasureList() {
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
            private java.util.List<CubeTableList> cubeTableList; 
            private Boolean custimzeSql; 
            private String datasetId; 
            private String datasetName; 
            private java.util.List<DimensionList> dimensionList; 
            private Directory directory; 
            private String dsId; 
            private String dsName; 
            private String dsType; 
            private String gmtCreate; 
            private String gmtModify; 
            private java.util.List<MeasureList> measureList; 
            private Boolean openOfflineAcceleration; 
            private String ownerId; 
            private String ownerName; 
            private Boolean rowLevel; 
            private String workspaceId; 
            private String workspaceName; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.cubeTableList = model.cubeTableList;
                this.custimzeSql = model.custimzeSql;
                this.datasetId = model.datasetId;
                this.datasetName = model.datasetName;
                this.dimensionList = model.dimensionList;
                this.directory = model.directory;
                this.dsId = model.dsId;
                this.dsName = model.dsName;
                this.dsType = model.dsType;
                this.gmtCreate = model.gmtCreate;
                this.gmtModify = model.gmtModify;
                this.measureList = model.measureList;
                this.openOfflineAcceleration = model.openOfflineAcceleration;
                this.ownerId = model.ownerId;
                this.ownerName = model.ownerName;
                this.rowLevel = model.rowLevel;
                this.workspaceId = model.workspaceId;
                this.workspaceName = model.workspaceName;
            } 

            /**
             * <p>The unique ID of the dataset.</p>
             */
            public Builder cubeTableList(java.util.List<CubeTableList> cubeTableList) {
                this.cubeTableList = cubeTableList;
                return this;
            }

            /**
             * <p>The unique ID of the workspace to which the dataset belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder custimzeSql(Boolean custimzeSql) {
                this.custimzeSql = custimzeSql;
                return this;
            }

            /**
             * <p>The type of the data source. Valid values:</p>
             * <ul>
             * <li>mysql</li>
             * <li>odps</li>
             * <li>oracle</li>
             * <li>... Data source types supported by Quick BI such as</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>a201c85c-******</p>
             */
            public Builder datasetId(String datasetId) {
                this.datasetId = datasetId;
                return this;
            }

            /**
             * <p>The user ID of the dataset owner in the Quick BI.</p>
             * 
             * <strong>example:</strong>
             * <p>opds_40</p>
             */
            public Builder datasetName(String datasetName) {
                this.datasetName = datasetName;
                return this;
            }

            /**
             * <p>If it is a custom SQL table, this is the specific SQL.</p>
             */
            public Builder dimensionList(java.util.List<DimensionList> dimensionList) {
                this.dimensionList = dimensionList;
                return this;
            }

            /**
             * <p>The unique ID of the metric.</p>
             */
            public Builder directory(Directory directory) {
                this.directory = directory;
                return this;
            }

            /**
             * <p>The name of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>a201c85c-******</p>
             */
            public Builder dsId(String dsId) {
                this.dsId = dsId;
                return this;
            }

            /**
             * <p>The time when the dataset was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>odps</p>
             */
            public Builder dsName(String dsName) {
                this.dsName = dsName;
                return this;
            }

            /**
             * <p>The point in time when the training dataset was created.</p>
             * 
             * <strong>example:</strong>
             * <p>odps</p>
             */
            public Builder dsType(String dsType) {
                this.dsType = dsType;
                return this;
            }

            /**
             * <p>Indicates whether to customize SQL statements. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1629450382000</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The information about the dataset.</p>
             * 
             * <strong>example:</strong>
             * <p>1629450382000</p>
             */
            public Builder gmtModify(String gmtModify) {
                this.gmtModify = gmtModify;
                return this;
            }

            /**
             * <p>The unique ID of the table to which the table belongs, which corresponds to the UniqueId of the CubeTypeList.</p>
             */
            public Builder measureList(java.util.List<MeasureList> measureList) {
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
             * <p>Test Space</p>
             * 
             * <strong>example:</strong>
             * <p>b8494aab26124*****</p>
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * <p>The unique ID of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>The name of the dataset owner.</p>
             */
            public Builder ownerName(String ownerName) {
                this.ownerName = ownerName;
                return this;
            }

            /**
             * <p>The name of the training dataset.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder rowLevel(Boolean rowLevel) {
                this.rowLevel = rowLevel;
                return this;
            }

            /**
             * <p>Whether row-level permissions are enabled. Valid values:</p>
             * <ul>
             * <li>true: The VIP Netty channel is enabled.</li>
             * <li>false: The VIP Netty channel is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>420abef4-a79b-4289-b12****</p>
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            /**
             * <p>Big Baby</p>
             * 
             * <strong>example:</strong>
             * <p>The name of the workspace in which the dataset resides.</p>
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
