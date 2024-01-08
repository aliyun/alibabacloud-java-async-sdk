// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryRecordDownloadJobByIdResponseBody} extends {@link TeaModel}
 *
 * <p>QueryRecordDownloadJobByIdResponseBody</p>
 */
public class QueryRecordDownloadJobByIdResponseBody extends TeaModel {
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

    private QueryRecordDownloadJobByIdResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryRecordDownloadJobByIdResponseBody create() {
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

        public QueryRecordDownloadJobByIdResponseBody build() {
            return new QueryRecordDownloadJobByIdResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("BeginTime")
        private Integer beginTime;

        @NameInMap("EndTime")
        private Integer endTime;

        @NameInMap("FileName")
        private String fileName;

        @NameInMap("IotId")
        private String iotId;

        @NameInMap("JobErrorCode")
        private Integer jobErrorCode;

        @NameInMap("Progress")
        private Integer progress;

        @NameInMap("RecordType")
        private Integer recordType;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("StreamType")
        private Integer streamType;

        @NameInMap("Type")
        private Integer type;

        @NameInMap("Url")
        private String url;

        private Data(Builder builder) {
            this.beginTime = builder.beginTime;
            this.endTime = builder.endTime;
            this.fileName = builder.fileName;
            this.iotId = builder.iotId;
            this.jobErrorCode = builder.jobErrorCode;
            this.progress = builder.progress;
            this.recordType = builder.recordType;
            this.status = builder.status;
            this.streamType = builder.streamType;
            this.type = builder.type;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return beginTime
         */
        public Integer getBeginTime() {
            return this.beginTime;
        }

        /**
         * @return endTime
         */
        public Integer getEndTime() {
            return this.endTime;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return iotId
         */
        public String getIotId() {
            return this.iotId;
        }

        /**
         * @return jobErrorCode
         */
        public Integer getJobErrorCode() {
            return this.jobErrorCode;
        }

        /**
         * @return progress
         */
        public Integer getProgress() {
            return this.progress;
        }

        /**
         * @return recordType
         */
        public Integer getRecordType() {
            return this.recordType;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return streamType
         */
        public Integer getStreamType() {
            return this.streamType;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private Integer beginTime; 
            private Integer endTime; 
            private String fileName; 
            private String iotId; 
            private Integer jobErrorCode; 
            private Integer progress; 
            private Integer recordType; 
            private Integer status; 
            private Integer streamType; 
            private Integer type; 
            private String url; 

            /**
             * BeginTime.
             */
            public Builder beginTime(Integer beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(Integer endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * FileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
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
             * JobErrorCode.
             */
            public Builder jobErrorCode(Integer jobErrorCode) {
                this.jobErrorCode = jobErrorCode;
                return this;
            }

            /**
             * Progress.
             */
            public Builder progress(Integer progress) {
                this.progress = progress;
                return this;
            }

            /**
             * RecordType.
             */
            public Builder recordType(Integer recordType) {
                this.recordType = recordType;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * StreamType.
             */
            public Builder streamType(Integer streamType) {
                this.streamType = streamType;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
