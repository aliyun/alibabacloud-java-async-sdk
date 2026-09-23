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
 * {@link GetTableColumnLineageByTaskIdResponseBody} extends {@link TeaModel}
 *
 * <p>GetTableColumnLineageByTaskIdResponseBody</p>
 */
public class GetTableColumnLineageByTaskIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetTableColumnLineageByTaskIdResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTableColumnLineageByTaskIdResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetTableColumnLineageByTaskIdResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>Error code. A value of OK indicates that the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Query results.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Error message.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetTableColumnLineageByTaskIdResponseBody build() {
            return new GetTableColumnLineageByTaskIdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTableColumnLineageByTaskIdResponseBody} extends {@link TeaModel}
     *
     * <p>GetTableColumnLineageByTaskIdResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InputBizUnitId")
        private Long inputBizUnitId;

        @com.aliyun.core.annotation.NameInMap("InputColumnId")
        private String inputColumnId;

        @com.aliyun.core.annotation.NameInMap("InputColumnName")
        private String inputColumnName;

        @com.aliyun.core.annotation.NameInMap("InputDataSourceId")
        private Long inputDataSourceId;

        @com.aliyun.core.annotation.NameInMap("InputDataSourceType")
        private String inputDataSourceType;

        @com.aliyun.core.annotation.NameInMap("InputDbType")
        private String inputDbType;

        @com.aliyun.core.annotation.NameInMap("InputEnv")
        private String inputEnv;

        @com.aliyun.core.annotation.NameInMap("InputProjectId")
        private Long inputProjectId;

        @com.aliyun.core.annotation.NameInMap("InputTableDeleted")
        private Boolean inputTableDeleted;

        @com.aliyun.core.annotation.NameInMap("InputTableId")
        private String inputTableId;

        @com.aliyun.core.annotation.NameInMap("InputTableName")
        private String inputTableName;

        @com.aliyun.core.annotation.NameInMap("InputTableType")
        private String inputTableType;

        @com.aliyun.core.annotation.NameInMap("OutputBizUnitId")
        private Long outputBizUnitId;

        @com.aliyun.core.annotation.NameInMap("OutputColumnId")
        private String outputColumnId;

        @com.aliyun.core.annotation.NameInMap("OutputColumnName")
        private String outputColumnName;

        @com.aliyun.core.annotation.NameInMap("OutputDataSourceId")
        private Long outputDataSourceId;

        @com.aliyun.core.annotation.NameInMap("OutputDataSourceType")
        private String outputDataSourceType;

        @com.aliyun.core.annotation.NameInMap("OutputDbType")
        private String outputDbType;

        @com.aliyun.core.annotation.NameInMap("OutputEnv")
        private String outputEnv;

        @com.aliyun.core.annotation.NameInMap("OutputProjectId")
        private Long outputProjectId;

        @com.aliyun.core.annotation.NameInMap("OutputTableDeleted")
        private Boolean outputTableDeleted;

        @com.aliyun.core.annotation.NameInMap("OutputTableId")
        private String outputTableId;

        @com.aliyun.core.annotation.NameInMap("OutputTableName")
        private String outputTableName;

        @com.aliyun.core.annotation.NameInMap("OutputTableType")
        private String outputTableType;

        @com.aliyun.core.annotation.NameInMap("TaskEnv")
        private String taskEnv;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private Long tenantId;

        private Data(Builder builder) {
            this.inputBizUnitId = builder.inputBizUnitId;
            this.inputColumnId = builder.inputColumnId;
            this.inputColumnName = builder.inputColumnName;
            this.inputDataSourceId = builder.inputDataSourceId;
            this.inputDataSourceType = builder.inputDataSourceType;
            this.inputDbType = builder.inputDbType;
            this.inputEnv = builder.inputEnv;
            this.inputProjectId = builder.inputProjectId;
            this.inputTableDeleted = builder.inputTableDeleted;
            this.inputTableId = builder.inputTableId;
            this.inputTableName = builder.inputTableName;
            this.inputTableType = builder.inputTableType;
            this.outputBizUnitId = builder.outputBizUnitId;
            this.outputColumnId = builder.outputColumnId;
            this.outputColumnName = builder.outputColumnName;
            this.outputDataSourceId = builder.outputDataSourceId;
            this.outputDataSourceType = builder.outputDataSourceType;
            this.outputDbType = builder.outputDbType;
            this.outputEnv = builder.outputEnv;
            this.outputProjectId = builder.outputProjectId;
            this.outputTableDeleted = builder.outputTableDeleted;
            this.outputTableId = builder.outputTableId;
            this.outputTableName = builder.outputTableName;
            this.outputTableType = builder.outputTableType;
            this.taskEnv = builder.taskEnv;
            this.taskId = builder.taskId;
            this.tenantId = builder.tenantId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return inputBizUnitId
         */
        public Long getInputBizUnitId() {
            return this.inputBizUnitId;
        }

        /**
         * @return inputColumnId
         */
        public String getInputColumnId() {
            return this.inputColumnId;
        }

        /**
         * @return inputColumnName
         */
        public String getInputColumnName() {
            return this.inputColumnName;
        }

        /**
         * @return inputDataSourceId
         */
        public Long getInputDataSourceId() {
            return this.inputDataSourceId;
        }

        /**
         * @return inputDataSourceType
         */
        public String getInputDataSourceType() {
            return this.inputDataSourceType;
        }

        /**
         * @return inputDbType
         */
        public String getInputDbType() {
            return this.inputDbType;
        }

        /**
         * @return inputEnv
         */
        public String getInputEnv() {
            return this.inputEnv;
        }

        /**
         * @return inputProjectId
         */
        public Long getInputProjectId() {
            return this.inputProjectId;
        }

        /**
         * @return inputTableDeleted
         */
        public Boolean getInputTableDeleted() {
            return this.inputTableDeleted;
        }

        /**
         * @return inputTableId
         */
        public String getInputTableId() {
            return this.inputTableId;
        }

        /**
         * @return inputTableName
         */
        public String getInputTableName() {
            return this.inputTableName;
        }

        /**
         * @return inputTableType
         */
        public String getInputTableType() {
            return this.inputTableType;
        }

        /**
         * @return outputBizUnitId
         */
        public Long getOutputBizUnitId() {
            return this.outputBizUnitId;
        }

        /**
         * @return outputColumnId
         */
        public String getOutputColumnId() {
            return this.outputColumnId;
        }

        /**
         * @return outputColumnName
         */
        public String getOutputColumnName() {
            return this.outputColumnName;
        }

        /**
         * @return outputDataSourceId
         */
        public Long getOutputDataSourceId() {
            return this.outputDataSourceId;
        }

        /**
         * @return outputDataSourceType
         */
        public String getOutputDataSourceType() {
            return this.outputDataSourceType;
        }

        /**
         * @return outputDbType
         */
        public String getOutputDbType() {
            return this.outputDbType;
        }

        /**
         * @return outputEnv
         */
        public String getOutputEnv() {
            return this.outputEnv;
        }

        /**
         * @return outputProjectId
         */
        public Long getOutputProjectId() {
            return this.outputProjectId;
        }

        /**
         * @return outputTableDeleted
         */
        public Boolean getOutputTableDeleted() {
            return this.outputTableDeleted;
        }

        /**
         * @return outputTableId
         */
        public String getOutputTableId() {
            return this.outputTableId;
        }

        /**
         * @return outputTableName
         */
        public String getOutputTableName() {
            return this.outputTableName;
        }

        /**
         * @return outputTableType
         */
        public String getOutputTableType() {
            return this.outputTableType;
        }

        /**
         * @return taskEnv
         */
        public String getTaskEnv() {
            return this.taskEnv;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return tenantId
         */
        public Long getTenantId() {
            return this.tenantId;
        }

        public static final class Builder {
            private Long inputBizUnitId; 
            private String inputColumnId; 
            private String inputColumnName; 
            private Long inputDataSourceId; 
            private String inputDataSourceType; 
            private String inputDbType; 
            private String inputEnv; 
            private Long inputProjectId; 
            private Boolean inputTableDeleted; 
            private String inputTableId; 
            private String inputTableName; 
            private String inputTableType; 
            private Long outputBizUnitId; 
            private String outputColumnId; 
            private String outputColumnName; 
            private Long outputDataSourceId; 
            private String outputDataSourceType; 
            private String outputDbType; 
            private String outputEnv; 
            private Long outputProjectId; 
            private Boolean outputTableDeleted; 
            private String outputTableId; 
            private String outputTableName; 
            private String outputTableType; 
            private String taskEnv; 
            private String taskId; 
            private Long tenantId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.inputBizUnitId = model.inputBizUnitId;
                this.inputColumnId = model.inputColumnId;
                this.inputColumnName = model.inputColumnName;
                this.inputDataSourceId = model.inputDataSourceId;
                this.inputDataSourceType = model.inputDataSourceType;
                this.inputDbType = model.inputDbType;
                this.inputEnv = model.inputEnv;
                this.inputProjectId = model.inputProjectId;
                this.inputTableDeleted = model.inputTableDeleted;
                this.inputTableId = model.inputTableId;
                this.inputTableName = model.inputTableName;
                this.inputTableType = model.inputTableType;
                this.outputBizUnitId = model.outputBizUnitId;
                this.outputColumnId = model.outputColumnId;
                this.outputColumnName = model.outputColumnName;
                this.outputDataSourceId = model.outputDataSourceId;
                this.outputDataSourceType = model.outputDataSourceType;
                this.outputDbType = model.outputDbType;
                this.outputEnv = model.outputEnv;
                this.outputProjectId = model.outputProjectId;
                this.outputTableDeleted = model.outputTableDeleted;
                this.outputTableId = model.outputTableId;
                this.outputTableName = model.outputTableName;
                this.outputTableType = model.outputTableType;
                this.taskEnv = model.taskEnv;
                this.taskId = model.taskId;
                this.tenantId = model.tenantId;
            } 

            /**
             * <p>Business unit ID of the input table.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder inputBizUnitId(Long inputBizUnitId) {
                this.inputBizUnitId = inputBizUnitId;
                return this;
            }

            /**
             * <p>GUID of the input column.</p>
             * 
             * <strong>example:</strong>
             * <p>odps.123.test_project.input_table.id</p>
             */
            public Builder inputColumnId(String inputColumnId) {
                this.inputColumnId = inputColumnId;
                return this;
            }

            /**
             * <p>Input column name.</p>
             * 
             * <strong>example:</strong>
             * <p>id</p>
             */
            public Builder inputColumnName(String inputColumnName) {
                this.inputColumnName = inputColumnName;
                return this;
            }

            /**
             * <p>Data source ID of the input table.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder inputDataSourceId(Long inputDataSourceId) {
                this.inputDataSourceId = inputDataSourceId;
                return this;
            }

            /**
             * <p>Storage type of the input table.</p>
             * 
             * <strong>example:</strong>
             * <p>MAX_COMPUTE</p>
             */
            public Builder inputDataSourceType(String inputDataSourceType) {
                this.inputDataSourceType = inputDataSourceType;
                return this;
            }

            /**
             * <p>Database type of the input table.</p>
             * 
             * <strong>example:</strong>
             * <p>MAX_COMPUTE</p>
             */
            public Builder inputDbType(String inputDbType) {
                this.inputDbType = inputDbType;
                return this;
            }

            /**
             * <p>Environment of the input table: DEV or PROD.</p>
             * 
             * <strong>example:</strong>
             * <p>DEV</p>
             */
            public Builder inputEnv(String inputEnv) {
                this.inputEnv = inputEnv;
                return this;
            }

            /**
             * <p>Project ID of the input table.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder inputProjectId(Long inputProjectId) {
                this.inputProjectId = inputProjectId;
                return this;
            }

            /**
             * <p>Indicates whether the input table is deleted.</p>
             */
            public Builder inputTableDeleted(Boolean inputTableDeleted) {
                this.inputTableDeleted = inputTableDeleted;
                return this;
            }

            /**
             * <p>GUID of the input table. Each asset has a unique GUID in the following format: </p>
             * <ul>
             * <li>Logical table: dp_table.[TenantId].[BizUnitName].[TableName]</li>
             * <li>Compute source physical table: [EngineType].[TenantId].[ProjectName].[TableName]</li>
             * <li>Data source table: dp_ds_table.[TenantId].[DataSourceId].[SchemaName].[TableName]</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>odps.123.test_project.order</p>
             */
            public Builder inputTableId(String inputTableId) {
                this.inputTableId = inputTableId;
                return this;
            }

            /**
             * <p>Input table name.</p>
             * 
             * <strong>example:</strong>
             * <p>order</p>
             */
            public Builder inputTableName(String inputTableName) {
                this.inputTableName = inputTableName;
                return this;
            }

            /**
             * <p>Input table type. Valid values:</p>
             * <ul>
             * <li>PHYSICAL_TABLE: Physical table (compute source)</li>
             * <li>DIM_LOGIC_TABLE: Dimension logical table</li>
             * <li>FACT_LOGIC_TABLE: Fact logical table</li>
             * <li>SUM_LOGIC_TABLE: Summary logical table</li>
             * <li>REAL_TIME_LOGIC_TABLE: Real-time meta table</li>
             * <li>REAL_TIME_MIRROR_TABLE: Real-time mirror table</li>
             * <li>PHYSICAL_VIEW: Physical view</li>
             * <li>LOGICAL_VIEW: Logical view</li>
             * <li>DATA_SOURCE_PHYSICAL_TABLE: Data source table</li>
             * <li>DATA_SOURCE_VIEW: Data source view</li>
             * <li>DATA_SOURCE_MATERIALIZED_VIEW: Data source materialized view</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PHYSICAL_TABLE</p>
             */
            public Builder inputTableType(String inputTableType) {
                this.inputTableType = inputTableType;
                return this;
            }

            /**
             * <p>Business unit ID of the output table.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder outputBizUnitId(Long outputBizUnitId) {
                this.outputBizUnitId = outputBizUnitId;
                return this;
            }

            /**
             * <p>GUID of the output column.</p>
             * 
             * <strong>example:</strong>
             * <p>odps.123.test_project.input_table.id</p>
             */
            public Builder outputColumnId(String outputColumnId) {
                this.outputColumnId = outputColumnId;
                return this;
            }

            /**
             * <p>Output column name.</p>
             * 
             * <strong>example:</strong>
             * <p>id</p>
             */
            public Builder outputColumnName(String outputColumnName) {
                this.outputColumnName = outputColumnName;
                return this;
            }

            /**
             * <p>Data source ID of the output table.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder outputDataSourceId(Long outputDataSourceId) {
                this.outputDataSourceId = outputDataSourceId;
                return this;
            }

            /**
             * <p>Storage type of the output table.</p>
             * 
             * <strong>example:</strong>
             * <p>MAX_COMPUTE</p>
             */
            public Builder outputDataSourceType(String outputDataSourceType) {
                this.outputDataSourceType = outputDataSourceType;
                return this;
            }

            /**
             * <p>Database type of the output table.</p>
             * 
             * <strong>example:</strong>
             * <p>MAX_COMPUTE</p>
             */
            public Builder outputDbType(String outputDbType) {
                this.outputDbType = outputDbType;
                return this;
            }

            /**
             * <p>Environment of the output table: DEV or PROD.</p>
             * 
             * <strong>example:</strong>
             * <p>DEV</p>
             */
            public Builder outputEnv(String outputEnv) {
                this.outputEnv = outputEnv;
                return this;
            }

            /**
             * <p>Project ID of the output table.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder outputProjectId(Long outputProjectId) {
                this.outputProjectId = outputProjectId;
                return this;
            }

            /**
             * <p>Indicates whether the output table is deleted.</p>
             */
            public Builder outputTableDeleted(Boolean outputTableDeleted) {
                this.outputTableDeleted = outputTableDeleted;
                return this;
            }

            /**
             * <p>GUID of the output table. Each asset has a unique GUID. For the format, see InputTableId.</p>
             * 
             * <strong>example:</strong>
             * <p>odps.123.test_project.order</p>
             */
            public Builder outputTableId(String outputTableId) {
                this.outputTableId = outputTableId;
                return this;
            }

            /**
             * <p>Output table name.</p>
             * 
             * <strong>example:</strong>
             * <p>order</p>
             */
            public Builder outputTableName(String outputTableName) {
                this.outputTableName = outputTableName;
                return this;
            }

            /**
             * <p>Output table type. For valid values, see InputTableType.</p>
             * 
             * <strong>example:</strong>
             * <p>PHYSICAL_TABLE</p>
             */
            public Builder outputTableType(String outputTableType) {
                this.outputTableType = outputTableType;
                return this;
            }

            /**
             * <p>Environment of the task (node) associated with the lineage: DEV or PROD.</p>
             * 
             * <strong>example:</strong>
             * <p>DEV</p>
             */
            public Builder taskEnv(String taskEnv) {
                this.taskEnv = taskEnv;
                return this;
            }

            /**
             * <p>Task (node) ID associated with the lineage.</p>
             * 
             * <strong>example:</strong>
             * <p>n_123</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>Tenant ID.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder tenantId(Long tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
