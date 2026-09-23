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
 * {@link GetTableColumnLineagesResponseBody} extends {@link TeaModel}
 *
 * <p>GetTableColumnLineagesResponseBody</p>
 */
public class GetTableColumnLineagesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TableColumnLineageList")
    private java.util.List<TableColumnLineageList> tableColumnLineageList;

    private GetTableColumnLineagesResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.tableColumnLineageList = builder.tableColumnLineageList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTableColumnLineagesResponseBody create() {
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

    /**
     * @return tableColumnLineageList
     */
    public java.util.List<TableColumnLineageList> getTableColumnLineageList() {
        return this.tableColumnLineageList;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private java.util.List<TableColumnLineageList> tableColumnLineageList; 

        private Builder() {
        } 

        private Builder(GetTableColumnLineagesResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.tableColumnLineageList = model.tableColumnLineageList;
        } 

        /**
         * <p>The backend response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The details of the backend exception.</p>
         * 
         * <strong>example:</strong>
         * <p>internal error</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The list of table column lineage records.</p>
         */
        public Builder tableColumnLineageList(java.util.List<TableColumnLineageList> tableColumnLineageList) {
            this.tableColumnLineageList = tableColumnLineageList;
            return this;
        }

        public GetTableColumnLineagesResponseBody build() {
            return new GetTableColumnLineagesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTableColumnLineagesResponseBody} extends {@link TeaModel}
     *
     * <p>GetTableColumnLineagesResponseBody</p>
     */
    public static class TableColumnLineageList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InputBizUnitId")
        private Long inputBizUnitId;

        @com.aliyun.core.annotation.NameInMap("InputColumnGuid")
        private String inputColumnGuid;

        @com.aliyun.core.annotation.NameInMap("InputColumnName")
        private String inputColumnName;

        @com.aliyun.core.annotation.NameInMap("InputDataSourceId")
        private Long inputDataSourceId;

        @com.aliyun.core.annotation.NameInMap("InputDataSourceType")
        private String inputDataSourceType;

        @com.aliyun.core.annotation.NameInMap("InputProjectId")
        private Long inputProjectId;

        @com.aliyun.core.annotation.NameInMap("InputTableDeleted")
        private Boolean inputTableDeleted;

        @com.aliyun.core.annotation.NameInMap("InputTableEnv")
        private String inputTableEnv;

        @com.aliyun.core.annotation.NameInMap("InputTableGuid")
        private String inputTableGuid;

        @com.aliyun.core.annotation.NameInMap("InputTableName")
        private String inputTableName;

        @com.aliyun.core.annotation.NameInMap("NodeEnv")
        private String nodeEnv;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("OutputBizUnitId")
        private Long outputBizUnitId;

        @com.aliyun.core.annotation.NameInMap("OutputColumnGuid")
        private String outputColumnGuid;

        @com.aliyun.core.annotation.NameInMap("OutputColumnName")
        private String outputColumnName;

        @com.aliyun.core.annotation.NameInMap("OutputDataSourceId")
        private Long outputDataSourceId;

        @com.aliyun.core.annotation.NameInMap("OutputDataSourceType")
        private String outputDataSourceType;

        @com.aliyun.core.annotation.NameInMap("OutputProjectId")
        private Long outputProjectId;

        @com.aliyun.core.annotation.NameInMap("OutputTableDeleted")
        private Boolean outputTableDeleted;

        @com.aliyun.core.annotation.NameInMap("OutputTableEnv")
        private String outputTableEnv;

        @com.aliyun.core.annotation.NameInMap("OutputTableGuid")
        private String outputTableGuid;

        @com.aliyun.core.annotation.NameInMap("OutputTableName")
        private String outputTableName;

        private TableColumnLineageList(Builder builder) {
            this.inputBizUnitId = builder.inputBizUnitId;
            this.inputColumnGuid = builder.inputColumnGuid;
            this.inputColumnName = builder.inputColumnName;
            this.inputDataSourceId = builder.inputDataSourceId;
            this.inputDataSourceType = builder.inputDataSourceType;
            this.inputProjectId = builder.inputProjectId;
            this.inputTableDeleted = builder.inputTableDeleted;
            this.inputTableEnv = builder.inputTableEnv;
            this.inputTableGuid = builder.inputTableGuid;
            this.inputTableName = builder.inputTableName;
            this.nodeEnv = builder.nodeEnv;
            this.nodeId = builder.nodeId;
            this.outputBizUnitId = builder.outputBizUnitId;
            this.outputColumnGuid = builder.outputColumnGuid;
            this.outputColumnName = builder.outputColumnName;
            this.outputDataSourceId = builder.outputDataSourceId;
            this.outputDataSourceType = builder.outputDataSourceType;
            this.outputProjectId = builder.outputProjectId;
            this.outputTableDeleted = builder.outputTableDeleted;
            this.outputTableEnv = builder.outputTableEnv;
            this.outputTableGuid = builder.outputTableGuid;
            this.outputTableName = builder.outputTableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableColumnLineageList create() {
            return builder().build();
        }

        /**
         * @return inputBizUnitId
         */
        public Long getInputBizUnitId() {
            return this.inputBizUnitId;
        }

        /**
         * @return inputColumnGuid
         */
        public String getInputColumnGuid() {
            return this.inputColumnGuid;
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
         * @return inputTableEnv
         */
        public String getInputTableEnv() {
            return this.inputTableEnv;
        }

        /**
         * @return inputTableGuid
         */
        public String getInputTableGuid() {
            return this.inputTableGuid;
        }

        /**
         * @return inputTableName
         */
        public String getInputTableName() {
            return this.inputTableName;
        }

        /**
         * @return nodeEnv
         */
        public String getNodeEnv() {
            return this.nodeEnv;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return outputBizUnitId
         */
        public Long getOutputBizUnitId() {
            return this.outputBizUnitId;
        }

        /**
         * @return outputColumnGuid
         */
        public String getOutputColumnGuid() {
            return this.outputColumnGuid;
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
         * @return outputTableEnv
         */
        public String getOutputTableEnv() {
            return this.outputTableEnv;
        }

        /**
         * @return outputTableGuid
         */
        public String getOutputTableGuid() {
            return this.outputTableGuid;
        }

        /**
         * @return outputTableName
         */
        public String getOutputTableName() {
            return this.outputTableName;
        }

        public static final class Builder {
            private Long inputBizUnitId; 
            private String inputColumnGuid; 
            private String inputColumnName; 
            private Long inputDataSourceId; 
            private String inputDataSourceType; 
            private Long inputProjectId; 
            private Boolean inputTableDeleted; 
            private String inputTableEnv; 
            private String inputTableGuid; 
            private String inputTableName; 
            private String nodeEnv; 
            private String nodeId; 
            private Long outputBizUnitId; 
            private String outputColumnGuid; 
            private String outputColumnName; 
            private Long outputDataSourceId; 
            private String outputDataSourceType; 
            private Long outputProjectId; 
            private Boolean outputTableDeleted; 
            private String outputTableEnv; 
            private String outputTableGuid; 
            private String outputTableName; 

            private Builder() {
            } 

            private Builder(TableColumnLineageList model) {
                this.inputBizUnitId = model.inputBizUnitId;
                this.inputColumnGuid = model.inputColumnGuid;
                this.inputColumnName = model.inputColumnName;
                this.inputDataSourceId = model.inputDataSourceId;
                this.inputDataSourceType = model.inputDataSourceType;
                this.inputProjectId = model.inputProjectId;
                this.inputTableDeleted = model.inputTableDeleted;
                this.inputTableEnv = model.inputTableEnv;
                this.inputTableGuid = model.inputTableGuid;
                this.inputTableName = model.inputTableName;
                this.nodeEnv = model.nodeEnv;
                this.nodeId = model.nodeId;
                this.outputBizUnitId = model.outputBizUnitId;
                this.outputColumnGuid = model.outputColumnGuid;
                this.outputColumnName = model.outputColumnName;
                this.outputDataSourceId = model.outputDataSourceId;
                this.outputDataSourceType = model.outputDataSourceType;
                this.outputProjectId = model.outputProjectId;
                this.outputTableDeleted = model.outputTableDeleted;
                this.outputTableEnv = model.outputTableEnv;
                this.outputTableGuid = model.outputTableGuid;
                this.outputTableName = model.outputTableName;
            } 

            /**
             * <p>The ID of the business unit to which the input table belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder inputBizUnitId(Long inputBizUnitId) {
                this.inputBizUnitId = inputBizUnitId;
                return this;
            }

            /**
             * <p>The GUID of the input column. Format: TableGuid.ColumnName.</p>
             * 
             * <strong>example:</strong>
             * <p>1121.col1</p>
             */
            public Builder inputColumnGuid(String inputColumnGuid) {
                this.inputColumnGuid = inputColumnGuid;
                return this;
            }

            /**
             * <p>The name of the input column.</p>
             * 
             * <strong>example:</strong>
             * <p>col1</p>
             */
            public Builder inputColumnName(String inputColumnName) {
                this.inputColumnName = inputColumnName;
                return this;
            }

            /**
             * <p>The ID of the data source to which the input table belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder inputDataSourceId(Long inputDataSourceId) {
                this.inputDataSourceId = inputDataSourceId;
                return this;
            }

            /**
             * <p>The type of the data source to which the input table belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>MAX_COMPUTE</p>
             */
            public Builder inputDataSourceType(String inputDataSourceType) {
                this.inputDataSourceType = inputDataSourceType;
                return this;
            }

            /**
             * <p>The ID of the project to which the input table belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1233</p>
             */
            public Builder inputProjectId(Long inputProjectId) {
                this.inputProjectId = inputProjectId;
                return this;
            }

            /**
             * <p>Indicates whether the input table has been deleted.</p>
             */
            public Builder inputTableDeleted(Boolean inputTableDeleted) {
                this.inputTableDeleted = inputTableDeleted;
                return this;
            }

            /**
             * <p>The environment of the input table. Valid values: dev and prod.</p>
             * 
             * <strong>example:</strong>
             * <p>dev</p>
             */
            public Builder inputTableEnv(String inputTableEnv) {
                this.inputTableEnv = inputTableEnv;
                return this;
            }

            /**
             * <p>The GUID of the input table. Each asset has a unique identifier.</p>
             * 
             * <strong>example:</strong>
             * <p>123211</p>
             */
            public Builder inputTableGuid(String inputTableGuid) {
                this.inputTableGuid = inputTableGuid;
                return this;
            }

            /**
             * <p>The name of the input table.</p>
             * 
             * <strong>example:</strong>
             * <p>t_input</p>
             */
            public Builder inputTableName(String inputTableName) {
                this.inputTableName = inputTableName;
                return this;
            }

            /**
             * <p>The environment of the node. Valid values: dev and prod.</p>
             * 
             * <strong>example:</strong>
             * <p>dev</p>
             */
            public Builder nodeEnv(String nodeEnv) {
                this.nodeEnv = nodeEnv;
                return this;
            }

            /**
             * <p>The node ID associated with the lineage.</p>
             * 
             * <strong>example:</strong>
             * <p>110021</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The ID of the business unit to which the output table belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder outputBizUnitId(Long outputBizUnitId) {
                this.outputBizUnitId = outputBizUnitId;
                return this;
            }

            /**
             * <p>The GUID of the output column. Format: TableId.ColumnName.</p>
             * 
             * <strong>example:</strong>
             * <p>2231.col2</p>
             */
            public Builder outputColumnGuid(String outputColumnGuid) {
                this.outputColumnGuid = outputColumnGuid;
                return this;
            }

            /**
             * <p>The name of the output column.</p>
             * 
             * <strong>example:</strong>
             * <p>col2</p>
             */
            public Builder outputColumnName(String outputColumnName) {
                this.outputColumnName = outputColumnName;
                return this;
            }

            /**
             * <p>The ID of the data source to which the output table belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder outputDataSourceId(Long outputDataSourceId) {
                this.outputDataSourceId = outputDataSourceId;
                return this;
            }

            /**
             * <p>The type of the data source to which the output table belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>MAX_COMPUTE</p>
             */
            public Builder outputDataSourceType(String outputDataSourceType) {
                this.outputDataSourceType = outputDataSourceType;
                return this;
            }

            /**
             * <p>The ID of the project to which the output table belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1233</p>
             */
            public Builder outputProjectId(Long outputProjectId) {
                this.outputProjectId = outputProjectId;
                return this;
            }

            /**
             * <p>Indicates whether the output table has been deleted.</p>
             */
            public Builder outputTableDeleted(Boolean outputTableDeleted) {
                this.outputTableDeleted = outputTableDeleted;
                return this;
            }

            /**
             * <p>The environment of the output table. Valid values: dev and prod.</p>
             * 
             * <strong>example:</strong>
             * <p>dev</p>
             */
            public Builder outputTableEnv(String outputTableEnv) {
                this.outputTableEnv = outputTableEnv;
                return this;
            }

            /**
             * <p>The GUID of the output table. Each asset has a unique identifier.</p>
             * 
             * <strong>example:</strong>
             * <p>2231</p>
             */
            public Builder outputTableGuid(String outputTableGuid) {
                this.outputTableGuid = outputTableGuid;
                return this;
            }

            /**
             * <p>The name of the output table.</p>
             * 
             * <strong>example:</strong>
             * <p>t_output</p>
             */
            public Builder outputTableName(String outputTableName) {
                this.outputTableName = outputTableName;
                return this;
            }

            public TableColumnLineageList build() {
                return new TableColumnLineageList(this);
            } 

        } 

    }
}
