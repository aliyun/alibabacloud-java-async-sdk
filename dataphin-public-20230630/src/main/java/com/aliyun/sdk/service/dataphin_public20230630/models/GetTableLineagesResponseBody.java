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
 * {@link GetTableLineagesResponseBody} extends {@link TeaModel}
 *
 * <p>GetTableLineagesResponseBody</p>
 */
public class GetTableLineagesResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("TableLineageList")
    private java.util.List<TableLineageList> tableLineageList;

    private GetTableLineagesResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.tableLineageList = builder.tableLineageList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTableLineagesResponseBody create() {
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
     * @return tableLineageList
     */
    public java.util.List<TableLineageList> getTableLineageList() {
        return this.tableLineageList;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private java.util.List<TableLineageList> tableLineageList; 

        private Builder() {
        } 

        private Builder(GetTableLineagesResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.tableLineageList = model.tableLineageList;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TableLineageList.
         */
        public Builder tableLineageList(java.util.List<TableLineageList> tableLineageList) {
            this.tableLineageList = tableLineageList;
            return this;
        }

        public GetTableLineagesResponseBody build() {
            return new GetTableLineagesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTableLineagesResponseBody} extends {@link TeaModel}
     *
     * <p>GetTableLineagesResponseBody</p>
     */
    public static class TableLineageList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InputBizUnitId")
        private Long inputBizUnitId;

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

        private TableLineageList(Builder builder) {
            this.inputBizUnitId = builder.inputBizUnitId;
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

        public static TableLineageList create() {
            return builder().build();
        }

        /**
         * @return inputBizUnitId
         */
        public Long getInputBizUnitId() {
            return this.inputBizUnitId;
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
            private Long outputDataSourceId; 
            private String outputDataSourceType; 
            private Long outputProjectId; 
            private Boolean outputTableDeleted; 
            private String outputTableEnv; 
            private String outputTableGuid; 
            private String outputTableName; 

            private Builder() {
            } 

            private Builder(TableLineageList model) {
                this.inputBizUnitId = model.inputBizUnitId;
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
                this.outputDataSourceId = model.outputDataSourceId;
                this.outputDataSourceType = model.outputDataSourceType;
                this.outputProjectId = model.outputProjectId;
                this.outputTableDeleted = model.outputTableDeleted;
                this.outputTableEnv = model.outputTableEnv;
                this.outputTableGuid = model.outputTableGuid;
                this.outputTableName = model.outputTableName;
            } 

            /**
             * InputBizUnitId.
             */
            public Builder inputBizUnitId(Long inputBizUnitId) {
                this.inputBizUnitId = inputBizUnitId;
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
             * InputTableEnv.
             */
            public Builder inputTableEnv(String inputTableEnv) {
                this.inputTableEnv = inputTableEnv;
                return this;
            }

            /**
             * InputTableGuid.
             */
            public Builder inputTableGuid(String inputTableGuid) {
                this.inputTableGuid = inputTableGuid;
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
             * NodeEnv.
             */
            public Builder nodeEnv(String nodeEnv) {
                this.nodeEnv = nodeEnv;
                return this;
            }

            /**
             * NodeId.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
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
             * OutputTableEnv.
             */
            public Builder outputTableEnv(String outputTableEnv) {
                this.outputTableEnv = outputTableEnv;
                return this;
            }

            /**
             * OutputTableGuid.
             */
            public Builder outputTableGuid(String outputTableGuid) {
                this.outputTableGuid = outputTableGuid;
                return this;
            }

            /**
             * OutputTableName.
             */
            public Builder outputTableName(String outputTableName) {
                this.outputTableName = outputTableName;
                return this;
            }

            public TableLineageList build() {
                return new TableLineageList(this);
            } 

        } 

    }
}
