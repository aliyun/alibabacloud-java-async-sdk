// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAIJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetAIJobResponseBody</p>
 */
public class GetAIJobResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetAIJobResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAIJobResponseBody create() {
        return builder().build();
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
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private Data data; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

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
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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

        public GetAIJobResponseBody build() {
            return new GetAIJobResponseBody(this);
        } 

    } 

    public static class ActionJobDTO extends TeaModel {
        @NameInMap("ActionId")
        private String actionId;

        @NameInMap("IotId")
        private String iotId;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("Status")
        private Integer status;

        private ActionJobDTO(Builder builder) {
            this.actionId = builder.actionId;
            this.iotId = builder.iotId;
            this.jobId = builder.jobId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ActionJobDTO create() {
            return builder().build();
        }

        /**
         * @return actionId
         */
        public String getActionId() {
            return this.actionId;
        }

        /**
         * @return iotId
         */
        public String getIotId() {
            return this.iotId;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String actionId; 
            private String iotId; 
            private String jobId; 
            private Integer status; 

            /**
             * ActionId.
             */
            public Builder actionId(String actionId) {
                this.actionId = actionId;
                return this;
            }

            /**
             * IotId.
             */
            public Builder iotId(String iotId) {
                this.iotId = iotId;
                return this;
            }

            /**
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public ActionJobDTO build() {
                return new ActionJobDTO(this);
            } 

        } 

    }
    public static class DataDTOList extends TeaModel {
        @NameInMap("AlgoData")
        private String algoData;

        @NameInMap("DataId")
        private String dataId;

        @NameInMap("DataSource")
        private String dataSource;

        @NameInMap("DataType")
        private String dataType;

        @NameInMap("IotId")
        private String iotId;

        @NameInMap("JobId")
        private String jobId;

        private DataDTOList(Builder builder) {
            this.algoData = builder.algoData;
            this.dataId = builder.dataId;
            this.dataSource = builder.dataSource;
            this.dataType = builder.dataType;
            this.iotId = builder.iotId;
            this.jobId = builder.jobId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataDTOList create() {
            return builder().build();
        }

        /**
         * @return algoData
         */
        public String getAlgoData() {
            return this.algoData;
        }

        /**
         * @return dataId
         */
        public String getDataId() {
            return this.dataId;
        }

        /**
         * @return dataSource
         */
        public String getDataSource() {
            return this.dataSource;
        }

        /**
         * @return dataType
         */
        public String getDataType() {
            return this.dataType;
        }

        /**
         * @return iotId
         */
        public String getIotId() {
            return this.iotId;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        public static final class Builder {
            private String algoData; 
            private String dataId; 
            private String dataSource; 
            private String dataType; 
            private String iotId; 
            private String jobId; 

            /**
             * AlgoData.
             */
            public Builder algoData(String algoData) {
                this.algoData = algoData;
                return this;
            }

            /**
             * DataId.
             */
            public Builder dataId(String dataId) {
                this.dataId = dataId;
                return this;
            }

            /**
             * DataSource.
             */
            public Builder dataSource(String dataSource) {
                this.dataSource = dataSource;
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
             * IotId.
             */
            public Builder iotId(String iotId) {
                this.iotId = iotId;
                return this;
            }

            /**
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            public DataDTOList build() {
                return new DataDTOList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("ActionJobDTO")
        private ActionJobDTO actionJobDTO;

        @NameInMap("DataDTOList")
        private java.util.List < DataDTOList> dataDTOList;

        private Data(Builder builder) {
            this.actionJobDTO = builder.actionJobDTO;
            this.dataDTOList = builder.dataDTOList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return actionJobDTO
         */
        public ActionJobDTO getActionJobDTO() {
            return this.actionJobDTO;
        }

        /**
         * @return dataDTOList
         */
        public java.util.List < DataDTOList> getDataDTOList() {
            return this.dataDTOList;
        }

        public static final class Builder {
            private ActionJobDTO actionJobDTO; 
            private java.util.List < DataDTOList> dataDTOList; 

            /**
             * ActionJobDTO.
             */
            public Builder actionJobDTO(ActionJobDTO actionJobDTO) {
                this.actionJobDTO = actionJobDTO;
                return this;
            }

            /**
             * DataDTOList.
             */
            public Builder dataDTOList(java.util.List < DataDTOList> dataDTOList) {
                this.dataDTOList = dataDTOList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
