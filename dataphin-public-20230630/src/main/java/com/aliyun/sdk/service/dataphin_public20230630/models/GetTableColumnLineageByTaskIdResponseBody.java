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
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
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
             * InputBizUnitId.
             */
            public Builder inputBizUnitId(Long inputBizUnitId) {
                this.inputBizUnitId = inputBizUnitId;
                return this;
            }

            /**
             * InputColumnId.
             */
            public Builder inputColumnId(String inputColumnId) {
                this.inputColumnId = inputColumnId;
                return this;
            }

            /**
             * InputColumnName.
             */
            public Builder inputColumnName(String inputColumnName) {
                this.inputColumnName = inputColumnName;
                return this;
            }

            /**
             * InputDataSourceId.
             */
            public Builder inputDataSourceId(Long inputDataSourceId) {
                this.inputDataSourceId = inputDataSourceId;
                return this;
            }

            /**
             * InputDataSourceType.
             */
            public Builder inputDataSourceType(String inputDataSourceType) {
                this.inputDataSourceType = inputDataSourceType;
                return this;
            }

            /**
             * InputDbType.
             */
            public Builder inputDbType(String inputDbType) {
                this.inputDbType = inputDbType;
                return this;
            }

            /**
             * InputEnv.
             */
            public Builder inputEnv(String inputEnv) {
                this.inputEnv = inputEnv;
                return this;
            }

            /**
             * InputProjectId.
             */
            public Builder inputProjectId(Long inputProjectId) {
                this.inputProjectId = inputProjectId;
                return this;
            }

            /**
             * InputTableDeleted.
             */
            public Builder inputTableDeleted(Boolean inputTableDeleted) {
                this.inputTableDeleted = inputTableDeleted;
                return this;
            }

            /**
             * InputTableId.
             */
            public Builder inputTableId(String inputTableId) {
                this.inputTableId = inputTableId;
                return this;
            }

            /**
             * InputTableName.
             */
            public Builder inputTableName(String inputTableName) {
                this.inputTableName = inputTableName;
                return this;
            }

            /**
             * InputTableType.
             */
            public Builder inputTableType(String inputTableType) {
                this.inputTableType = inputTableType;
                return this;
            }

            /**
             * OutputBizUnitId.
             */
            public Builder outputBizUnitId(Long outputBizUnitId) {
                this.outputBizUnitId = outputBizUnitId;
                return this;
            }

            /**
             * OutputColumnId.
             */
            public Builder outputColumnId(String outputColumnId) {
                this.outputColumnId = outputColumnId;
                return this;
            }

            /**
             * OutputColumnName.
             */
            public Builder outputColumnName(String outputColumnName) {
                this.outputColumnName = outputColumnName;
                return this;
            }

            /**
             * OutputDataSourceId.
             */
            public Builder outputDataSourceId(Long outputDataSourceId) {
                this.outputDataSourceId = outputDataSourceId;
                return this;
            }

            /**
             * OutputDataSourceType.
             */
            public Builder outputDataSourceType(String outputDataSourceType) {
                this.outputDataSourceType = outputDataSourceType;
                return this;
            }

            /**
             * OutputDbType.
             */
            public Builder outputDbType(String outputDbType) {
                this.outputDbType = outputDbType;
                return this;
            }

            /**
             * OutputEnv.
             */
            public Builder outputEnv(String outputEnv) {
                this.outputEnv = outputEnv;
                return this;
            }

            /**
             * OutputProjectId.
             */
            public Builder outputProjectId(Long outputProjectId) {
                this.outputProjectId = outputProjectId;
                return this;
            }

            /**
             * OutputTableDeleted.
             */
            public Builder outputTableDeleted(Boolean outputTableDeleted) {
                this.outputTableDeleted = outputTableDeleted;
                return this;
            }

            /**
             * OutputTableId.
             */
            public Builder outputTableId(String outputTableId) {
                this.outputTableId = outputTableId;
                return this;
            }

            /**
             * OutputTableName.
             */
            public Builder outputTableName(String outputTableName) {
                this.outputTableName = outputTableName;
                return this;
            }

            /**
             * OutputTableType.
             */
            public Builder outputTableType(String outputTableType) {
                this.outputTableType = outputTableType;
                return this;
            }

            /**
             * TaskEnv.
             */
            public Builder taskEnv(String taskEnv) {
                this.taskEnv = taskEnv;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * TenantId.
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
