// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PostMSDataProcessingCountResponseBody} extends {@link TeaModel}
 *
 * <p>PostMSDataProcessingCountResponseBody</p>
 */
public class PostMSDataProcessingCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private PostMSDataProcessingCountResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.msg = builder.msg;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PostMSDataProcessingCountResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
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
        private Integer code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String msg; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
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
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
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

        public PostMSDataProcessingCountResponseBody build() {
            return new PostMSDataProcessingCountResponseBody(this);
        } 

    } 

    public static class ErrorDataList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("OpType")
        private String opType;

        private ErrorDataList(Builder builder) {
            this.count = builder.count;
            this.errorCode = builder.errorCode;
            this.opType = builder.opType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ErrorDataList create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return opType
         */
        public String getOpType() {
            return this.opType;
        }

        public static final class Builder {
            private Integer count; 
            private String errorCode; 
            private String opType; 

            /**
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * OpType.
             */
            public Builder opType(String opType) {
                this.opType = opType;
                return this;
            }

            public ErrorDataList build() {
                return new ErrorDataList(this);
            } 

        } 

    }
    public static class DataProcessedStatuses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChunkNum")
        private String chunkNum;

        @com.aliyun.core.annotation.NameInMap("DataId")
        private String dataId;

        @com.aliyun.core.annotation.NameInMap("ErrorDataList")
        private java.util.List < ErrorDataList> errorDataList;

        @com.aliyun.core.annotation.NameInMap("OpStatus")
        private java.util.Map < String, Integer > opStatus;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("VersionValue")
        private String versionValue;

        private DataProcessedStatuses(Builder builder) {
            this.chunkNum = builder.chunkNum;
            this.dataId = builder.dataId;
            this.errorDataList = builder.errorDataList;
            this.opStatus = builder.opStatus;
            this.status = builder.status;
            this.versionValue = builder.versionValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataProcessedStatuses create() {
            return builder().build();
        }

        /**
         * @return chunkNum
         */
        public String getChunkNum() {
            return this.chunkNum;
        }

        /**
         * @return dataId
         */
        public String getDataId() {
            return this.dataId;
        }

        /**
         * @return errorDataList
         */
        public java.util.List < ErrorDataList> getErrorDataList() {
            return this.errorDataList;
        }

        /**
         * @return opStatus
         */
        public java.util.Map < String, Integer > getOpStatus() {
            return this.opStatus;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return versionValue
         */
        public String getVersionValue() {
            return this.versionValue;
        }

        public static final class Builder {
            private String chunkNum; 
            private String dataId; 
            private java.util.List < ErrorDataList> errorDataList; 
            private java.util.Map < String, Integer > opStatus; 
            private String status; 
            private String versionValue; 

            /**
             * ChunkNum.
             */
            public Builder chunkNum(String chunkNum) {
                this.chunkNum = chunkNum;
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
             * ErrorDataList.
             */
            public Builder errorDataList(java.util.List < ErrorDataList> errorDataList) {
                this.errorDataList = errorDataList;
                return this;
            }

            /**
             * OpStatus.
             */
            public Builder opStatus(java.util.Map < String, Integer > opStatus) {
                this.opStatus = opStatus;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * VersionValue.
             */
            public Builder versionValue(String versionValue) {
                this.versionValue = versionValue;
                return this;
            }

            public DataProcessedStatuses build() {
                return new DataProcessedStatuses(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataProcessedStatuses")
        private java.util.List < DataProcessedStatuses> dataProcessedStatuses;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.dataProcessedStatuses = builder.dataProcessedStatuses;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return dataProcessedStatuses
         */
        public java.util.List < DataProcessedStatuses> getDataProcessedStatuses() {
            return this.dataProcessedStatuses;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.List < DataProcessedStatuses> dataProcessedStatuses; 
            private String status; 

            /**
             * DataProcessedStatuses.
             */
            public Builder dataProcessedStatuses(java.util.List < DataProcessedStatuses> dataProcessedStatuses) {
                this.dataProcessedStatuses = dataProcessedStatuses;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
