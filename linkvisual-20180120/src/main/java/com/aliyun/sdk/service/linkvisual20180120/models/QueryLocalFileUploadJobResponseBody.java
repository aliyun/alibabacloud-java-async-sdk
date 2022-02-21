// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryLocalFileUploadJobResponseBody} extends {@link TeaModel}
 *
 * <p>QueryLocalFileUploadJobResponseBody</p>
 */
public class QueryLocalFileUploadJobResponseBody extends TeaModel {
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

    private QueryLocalFileUploadJobResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryLocalFileUploadJobResponseBody create() {
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

        public QueryLocalFileUploadJobResponseBody build() {
            return new QueryLocalFileUploadJobResponseBody(this);
        } 

    } 

    public static class FileList extends TeaModel {
        @NameInMap("FileEndTime")
        private Integer fileEndTime;

        @NameInMap("FileName")
        private String fileName;

        @NameInMap("FileStartTime")
        private Integer fileStartTime;

        private FileList(Builder builder) {
            this.fileEndTime = builder.fileEndTime;
            this.fileName = builder.fileName;
            this.fileStartTime = builder.fileStartTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileList create() {
            return builder().build();
        }

        /**
         * @return fileEndTime
         */
        public Integer getFileEndTime() {
            return this.fileEndTime;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return fileStartTime
         */
        public Integer getFileStartTime() {
            return this.fileStartTime;
        }

        public static final class Builder {
            private Integer fileEndTime; 
            private String fileName; 
            private Integer fileStartTime; 

            /**
             * FileEndTime.
             */
            public Builder fileEndTime(Integer fileEndTime) {
                this.fileEndTime = fileEndTime;
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
             * FileStartTime.
             */
            public Builder fileStartTime(Integer fileStartTime) {
                this.fileStartTime = fileStartTime;
                return this;
            }

            public FileList build() {
                return new FileList(this);
            } 

        } 

    }
    public static class ResultList extends TeaModel {
        @NameInMap("Code")
        private Integer code;

        @NameInMap("DeviceName")
        private String deviceName;

        @NameInMap("FileList")
        private java.util.List < FileList> fileList;

        @NameInMap("IotId")
        private String iotId;

        @NameInMap("ProductKey")
        private String productKey;

        @NameInMap("SlotEndTime")
        private Integer slotEndTime;

        @NameInMap("SlotStartTime")
        private Integer slotStartTime;

        @NameInMap("SlotStatus")
        private Integer slotStatus;

        private ResultList(Builder builder) {
            this.code = builder.code;
            this.deviceName = builder.deviceName;
            this.fileList = builder.fileList;
            this.iotId = builder.iotId;
            this.productKey = builder.productKey;
            this.slotEndTime = builder.slotEndTime;
            this.slotStartTime = builder.slotStartTime;
            this.slotStatus = builder.slotStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultList create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public Integer getCode() {
            return this.code;
        }

        /**
         * @return deviceName
         */
        public String getDeviceName() {
            return this.deviceName;
        }

        /**
         * @return fileList
         */
        public java.util.List < FileList> getFileList() {
            return this.fileList;
        }

        /**
         * @return iotId
         */
        public String getIotId() {
            return this.iotId;
        }

        /**
         * @return productKey
         */
        public String getProductKey() {
            return this.productKey;
        }

        /**
         * @return slotEndTime
         */
        public Integer getSlotEndTime() {
            return this.slotEndTime;
        }

        /**
         * @return slotStartTime
         */
        public Integer getSlotStartTime() {
            return this.slotStartTime;
        }

        /**
         * @return slotStatus
         */
        public Integer getSlotStatus() {
            return this.slotStatus;
        }

        public static final class Builder {
            private Integer code; 
            private String deviceName; 
            private java.util.List < FileList> fileList; 
            private String iotId; 
            private String productKey; 
            private Integer slotEndTime; 
            private Integer slotStartTime; 
            private Integer slotStatus; 

            /**
             * Code.
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            /**
             * DeviceName.
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * FileList.
             */
            public Builder fileList(java.util.List < FileList> fileList) {
                this.fileList = fileList;
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
             * ProductKey.
             */
            public Builder productKey(String productKey) {
                this.productKey = productKey;
                return this;
            }

            /**
             * SlotEndTime.
             */
            public Builder slotEndTime(Integer slotEndTime) {
                this.slotEndTime = slotEndTime;
                return this;
            }

            /**
             * SlotStartTime.
             */
            public Builder slotStartTime(Integer slotStartTime) {
                this.slotStartTime = slotStartTime;
                return this;
            }

            /**
             * SlotStatus.
             */
            public Builder slotStatus(Integer slotStatus) {
                this.slotStatus = slotStatus;
                return this;
            }

            public ResultList build() {
                return new ResultList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("ResultList")
        private java.util.List < ResultList> resultList;

        @NameInMap("Status")
        private Integer status;

        private Data(Builder builder) {
            this.resultList = builder.resultList;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return resultList
         */
        public java.util.List < ResultList> getResultList() {
            return this.resultList;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.List < ResultList> resultList; 
            private Integer status; 

            /**
             * ResultList.
             */
            public Builder resultList(java.util.List < ResultList> resultList) {
                this.resultList = resultList;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
