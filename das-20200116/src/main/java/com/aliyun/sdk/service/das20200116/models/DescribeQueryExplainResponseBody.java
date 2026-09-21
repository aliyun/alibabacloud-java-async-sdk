// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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
 * {@link DescribeQueryExplainResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeQueryExplainResponseBody</p>
 */
public class DescribeQueryExplainResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private DescribeQueryExplainResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeQueryExplainResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 
        private String success; 

        private Builder() {
        } 

        private Builder(DescribeQueryExplainResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The status code returned. A value of 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>List of execution plans.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message.</p>
         * <blockquote>
         * <p>If the request succeeds, this parameter returns Successful. If the request fails, this parameter returns error details such as an error code.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>B6D17591-B48B-4D31-9CD6-9B9796B2****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request succeeded:</p>
         * <ul>
         * <li><p><strong>true</strong>: The request succeeded.</p>
         * </li>
         * <li><p><strong>false</strong>: The request failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public DescribeQueryExplainResponseBody build() {
            return new DescribeQueryExplainResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeQueryExplainResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeQueryExplainResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Argument")
        private String argument;

        @com.aliyun.core.annotation.NameInMap("AvgRowSize")
        private String avgRowSize;

        @com.aliyun.core.annotation.NameInMap("DefinedValues")
        private String definedValues;

        @com.aliyun.core.annotation.NameInMap("EstimateCPU")
        private String estimateCPU;

        @com.aliyun.core.annotation.NameInMap("EstimateExecutions")
        private String estimateExecutions;

        @com.aliyun.core.annotation.NameInMap("EstimateIO")
        private String estimateIO;

        @com.aliyun.core.annotation.NameInMap("EstimateRows")
        private String estimateRows;

        @com.aliyun.core.annotation.NameInMap("Extra")
        private String extra;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("IndexList")
        private java.util.List<String> indexList;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("KeyLen")
        private String keyLen;

        @com.aliyun.core.annotation.NameInMap("LogicalOp")
        private String logicalOp;

        @com.aliyun.core.annotation.NameInMap("LogicalPlanList")
        private java.util.List<String> logicalPlanList;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("OutputList")
        private String outputList;

        @com.aliyun.core.annotation.NameInMap("Parallel")
        private String parallel;

        @com.aliyun.core.annotation.NameInMap("Parent")
        private String parent;

        @com.aliyun.core.annotation.NameInMap("PhysicalOp")
        private String physicalOp;

        @com.aliyun.core.annotation.NameInMap("PossibleKeys")
        private String possibleKeys;

        @com.aliyun.core.annotation.NameInMap("QueryPlan")
        private String queryPlan;

        @com.aliyun.core.annotation.NameInMap("Ref")
        private String ref;

        @com.aliyun.core.annotation.NameInMap("Rows")
        private String rows;

        @com.aliyun.core.annotation.NameInMap("SelectType")
        private String selectType;

        @com.aliyun.core.annotation.NameInMap("StmtId")
        private String stmtId;

        @com.aliyun.core.annotation.NameInMap("StmtText")
        private String stmtText;

        @com.aliyun.core.annotation.NameInMap("Table")
        private String table;

        @com.aliyun.core.annotation.NameInMap("TableList")
        private java.util.List<String> tableList;

        @com.aliyun.core.annotation.NameInMap("TotalSubtreeCost")
        private String totalSubtreeCost;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Warnings")
        private String warnings;

        private Data(Builder builder) {
            this.argument = builder.argument;
            this.avgRowSize = builder.avgRowSize;
            this.definedValues = builder.definedValues;
            this.estimateCPU = builder.estimateCPU;
            this.estimateExecutions = builder.estimateExecutions;
            this.estimateIO = builder.estimateIO;
            this.estimateRows = builder.estimateRows;
            this.extra = builder.extra;
            this.id = builder.id;
            this.indexList = builder.indexList;
            this.key = builder.key;
            this.keyLen = builder.keyLen;
            this.logicalOp = builder.logicalOp;
            this.logicalPlanList = builder.logicalPlanList;
            this.nodeId = builder.nodeId;
            this.outputList = builder.outputList;
            this.parallel = builder.parallel;
            this.parent = builder.parent;
            this.physicalOp = builder.physicalOp;
            this.possibleKeys = builder.possibleKeys;
            this.queryPlan = builder.queryPlan;
            this.ref = builder.ref;
            this.rows = builder.rows;
            this.selectType = builder.selectType;
            this.stmtId = builder.stmtId;
            this.stmtText = builder.stmtText;
            this.table = builder.table;
            this.tableList = builder.tableList;
            this.totalSubtreeCost = builder.totalSubtreeCost;
            this.type = builder.type;
            this.warnings = builder.warnings;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return argument
         */
        public String getArgument() {
            return this.argument;
        }

        /**
         * @return avgRowSize
         */
        public String getAvgRowSize() {
            return this.avgRowSize;
        }

        /**
         * @return definedValues
         */
        public String getDefinedValues() {
            return this.definedValues;
        }

        /**
         * @return estimateCPU
         */
        public String getEstimateCPU() {
            return this.estimateCPU;
        }

        /**
         * @return estimateExecutions
         */
        public String getEstimateExecutions() {
            return this.estimateExecutions;
        }

        /**
         * @return estimateIO
         */
        public String getEstimateIO() {
            return this.estimateIO;
        }

        /**
         * @return estimateRows
         */
        public String getEstimateRows() {
            return this.estimateRows;
        }

        /**
         * @return extra
         */
        public String getExtra() {
            return this.extra;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return indexList
         */
        public java.util.List<String> getIndexList() {
            return this.indexList;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return keyLen
         */
        public String getKeyLen() {
            return this.keyLen;
        }

        /**
         * @return logicalOp
         */
        public String getLogicalOp() {
            return this.logicalOp;
        }

        /**
         * @return logicalPlanList
         */
        public java.util.List<String> getLogicalPlanList() {
            return this.logicalPlanList;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return outputList
         */
        public String getOutputList() {
            return this.outputList;
        }

        /**
         * @return parallel
         */
        public String getParallel() {
            return this.parallel;
        }

        /**
         * @return parent
         */
        public String getParent() {
            return this.parent;
        }

        /**
         * @return physicalOp
         */
        public String getPhysicalOp() {
            return this.physicalOp;
        }

        /**
         * @return possibleKeys
         */
        public String getPossibleKeys() {
            return this.possibleKeys;
        }

        /**
         * @return queryPlan
         */
        public String getQueryPlan() {
            return this.queryPlan;
        }

        /**
         * @return ref
         */
        public String getRef() {
            return this.ref;
        }

        /**
         * @return rows
         */
        public String getRows() {
            return this.rows;
        }

        /**
         * @return selectType
         */
        public String getSelectType() {
            return this.selectType;
        }

        /**
         * @return stmtId
         */
        public String getStmtId() {
            return this.stmtId;
        }

        /**
         * @return stmtText
         */
        public String getStmtText() {
            return this.stmtText;
        }

        /**
         * @return table
         */
        public String getTable() {
            return this.table;
        }

        /**
         * @return tableList
         */
        public java.util.List<String> getTableList() {
            return this.tableList;
        }

        /**
         * @return totalSubtreeCost
         */
        public String getTotalSubtreeCost() {
            return this.totalSubtreeCost;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return warnings
         */
        public String getWarnings() {
            return this.warnings;
        }

        public static final class Builder {
            private String argument; 
            private String avgRowSize; 
            private String definedValues; 
            private String estimateCPU; 
            private String estimateExecutions; 
            private String estimateIO; 
            private String estimateRows; 
            private String extra; 
            private String id; 
            private java.util.List<String> indexList; 
            private String key; 
            private String keyLen; 
            private String logicalOp; 
            private java.util.List<String> logicalPlanList; 
            private String nodeId; 
            private String outputList; 
            private String parallel; 
            private String parent; 
            private String physicalOp; 
            private String possibleKeys; 
            private String queryPlan; 
            private String ref; 
            private String rows; 
            private String selectType; 
            private String stmtId; 
            private String stmtText; 
            private String table; 
            private java.util.List<String> tableList; 
            private String totalSubtreeCost; 
            private String type; 
            private String warnings; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.argument = model.argument;
                this.avgRowSize = model.avgRowSize;
                this.definedValues = model.definedValues;
                this.estimateCPU = model.estimateCPU;
                this.estimateExecutions = model.estimateExecutions;
                this.estimateIO = model.estimateIO;
                this.estimateRows = model.estimateRows;
                this.extra = model.extra;
                this.id = model.id;
                this.indexList = model.indexList;
                this.key = model.key;
                this.keyLen = model.keyLen;
                this.logicalOp = model.logicalOp;
                this.logicalPlanList = model.logicalPlanList;
                this.nodeId = model.nodeId;
                this.outputList = model.outputList;
                this.parallel = model.parallel;
                this.parent = model.parent;
                this.physicalOp = model.physicalOp;
                this.possibleKeys = model.possibleKeys;
                this.queryPlan = model.queryPlan;
                this.ref = model.ref;
                this.rows = model.rows;
                this.selectType = model.selectType;
                this.stmtId = model.stmtId;
                this.stmtText = model.stmtText;
                this.table = model.table;
                this.tableList = model.tableList;
                this.totalSubtreeCost = model.totalSubtreeCost;
                this.type = model.type;
                this.warnings = model.warnings;
            } 

            /**
             * <p>A reserved field for the SQL Server engine.</p>
             * 
             * <strong>example:</strong>
             * <p>无</p>
             */
            public Builder argument(String argument) {
                this.argument = argument;
                return this;
            }

            /**
             * <p>A reserved field for the SQL Server engine.</p>
             * 
             * <strong>example:</strong>
             * <p>无</p>
             */
            public Builder avgRowSize(String avgRowSize) {
                this.avgRowSize = avgRowSize;
                return this;
            }

            /**
             * <p>A reserved field for the SQL Server engine.</p>
             * 
             * <strong>example:</strong>
             * <p>无</p>
             */
            public Builder definedValues(String definedValues) {
                this.definedValues = definedValues;
                return this;
            }

            /**
             * <p>A reserved field for the SQL Server engine.</p>
             * 
             * <strong>example:</strong>
             * <p>无</p>
             */
            public Builder estimateCPU(String estimateCPU) {
                this.estimateCPU = estimateCPU;
                return this;
            }

            /**
             * <p>A reserved field for the SQL Server engine.</p>
             * 
             * <strong>example:</strong>
             * <p>无</p>
             */
            public Builder estimateExecutions(String estimateExecutions) {
                this.estimateExecutions = estimateExecutions;
                return this;
            }

            /**
             * <p>A reserved field for the SQL Server engine.</p>
             * 
             * <strong>example:</strong>
             * <p>无</p>
             */
            public Builder estimateIO(String estimateIO) {
                this.estimateIO = estimateIO;
                return this;
            }

            /**
             * <p>A reserved field for the SQL Server engine.</p>
             * 
             * <strong>example:</strong>
             * <p>无</p>
             */
            public Builder estimateRows(String estimateRows) {
                this.estimateRows = estimateRows;
                return this;
            }

            /**
             * <p>Additional information.</p>
             * 
             * <strong>example:</strong>
             * <p>无</p>
             */
            public Builder extra(String extra) {
                this.extra = extra;
                return this;
            }

            /**
             * <p>The ID of the query.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>A reserved field for the PostgreSQL engine.</p>
             */
            public Builder indexList(java.util.List<String> indexList) {
                this.indexList = indexList;
                return this;
            }

            /**
             * <p>The index actually used in the execution plan.</p>
             * 
             * <strong>example:</strong>
             * <p>PRIMARY</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The length of the index actually used.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder keyLen(String keyLen) {
                this.keyLen = keyLen;
                return this;
            }

            /**
             * <p>A reserved field for the SQL Server engine.</p>
             * 
             * <strong>example:</strong>
             * <p>无</p>
             */
            public Builder logicalOp(String logicalOp) {
                this.logicalOp = logicalOp;
                return this;
            }

            /**
             * <p>A reserved field for the PolarDB X engine.</p>
             */
            public Builder logicalPlanList(java.util.List<String> logicalPlanList) {
                this.logicalPlanList = logicalPlanList;
                return this;
            }

            /**
             * <p>A reserved field for the SQL Server engine.</p>
             * 
             * <strong>example:</strong>
             * <p>无</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>A reserved field for the SQL Server engine.</p>
             * 
             * <strong>example:</strong>
             * <p>无</p>
             */
            public Builder outputList(String outputList) {
                this.outputList = outputList;
                return this;
            }

            /**
             * <p>A reserved field for the SQL Server engine.</p>
             * 
             * <strong>example:</strong>
             * <p>无</p>
             */
            public Builder parallel(String parallel) {
                this.parallel = parallel;
                return this;
            }

            /**
             * <p>A reserved field for the SQL Server engine.</p>
             * 
             * <strong>example:</strong>
             * <p>无</p>
             */
            public Builder parent(String parent) {
                this.parent = parent;
                return this;
            }

            /**
             * <p>A reserved field for the SQL Server engine.</p>
             * 
             * <strong>example:</strong>
             * <p>无</p>
             */
            public Builder physicalOp(String physicalOp) {
                this.physicalOp = physicalOp;
                return this;
            }

            /**
             * <p>The indexes that might be used.</p>
             * 
             * <strong>example:</strong>
             * <p>test_idx</p>
             */
            public Builder possibleKeys(String possibleKeys) {
                this.possibleKeys = possibleKeys;
                return this;
            }

            /**
             * <p>A reserved field for the PostgreSQL engine.</p>
             * 
             * <strong>example:</strong>
             * <p>无</p>
             */
            public Builder queryPlan(String queryPlan) {
                this.queryPlan = queryPlan;
                return this;
            }

            /**
             * <p>The column used by the index.</p>
             * 
             * <strong>example:</strong>
             * <p>test_column</p>
             */
            public Builder ref(String ref) {
                this.ref = ref;
                return this;
            }

            /**
             * <p>The number of rows to scan.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder rows(String rows) {
                this.rows = rows;
                return this;
            }

            /**
             * <p>The type of the query.</p>
             * 
             * <strong>example:</strong>
             * <p>SIMPLE</p>
             */
            public Builder selectType(String selectType) {
                this.selectType = selectType;
                return this;
            }

            /**
             * <p>A reserved field for the SQL Server engine.</p>
             * 
             * <strong>example:</strong>
             * <p>无</p>
             */
            public Builder stmtId(String stmtId) {
                this.stmtId = stmtId;
                return this;
            }

            /**
             * <p>A reserved field for the SQL Server engine.</p>
             * 
             * <strong>example:</strong>
             * <p>无</p>
             */
            public Builder stmtText(String stmtText) {
                this.stmtText = stmtText;
                return this;
            }

            /**
             * <p>The name of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder table(String table) {
                this.table = table;
                return this;
            }

            /**
             * <p>A reserved field for the PostgreSQL engine.</p>
             */
            public Builder tableList(java.util.List<String> tableList) {
                this.tableList = tableList;
                return this;
            }

            /**
             * <p>A reserved field for the SQL Server engine.</p>
             * 
             * <strong>example:</strong>
             * <p>无</p>
             */
            public Builder totalSubtreeCost(String totalSubtreeCost) {
                this.totalSubtreeCost = totalSubtreeCost;
                return this;
            }

            /**
             * <p>The join type.</p>
             * 
             * <strong>example:</strong>
             * <p>eq_ref</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>A reserved field for the SQL Server engine.</p>
             * 
             * <strong>example:</strong>
             * <p>无</p>
             */
            public Builder warnings(String warnings) {
                this.warnings = warnings;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
