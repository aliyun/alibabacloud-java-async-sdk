// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

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
 * {@link QueryLocalFileUploadJobResponseBody} extends {@link TeaModel}
 *
 * <p>QueryLocalFileUploadJobResponseBody</p>
 */
public class QueryLocalFileUploadJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

        private Builder() {
        } 

        private Builder(QueryLocalFileUploadJobResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The response code:</p>
         * <ul>
         * <li><strong>200</strong>: The call is successful.</li>
         * <li>Other values: An error occurred. For more information about error codes, see <a href="https://help.aliyun.com/document_detail/145071.html">Error codes</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The query result.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message returned if the call fails.</p>
         * 
         * <strong>example:</strong>
         * <p>tenant auth error</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>449ECE75-A36A-4ACE-B253-147C78C440C5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The call was successful.</li>
         * <li><strong>false</strong>: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryLocalFileUploadJobResponseBody build() {
            return new QueryLocalFileUploadJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryLocalFileUploadJobResponseBody} extends {@link TeaModel}
     *
     * <p>QueryLocalFileUploadJobResponseBody</p>
     */
    public static class FileList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileEndTime")
        private Integer fileEndTime;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("FileStartTime")
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

            private Builder() {
            } 

            private Builder(FileList model) {
                this.fileEndTime = model.fileEndTime;
                this.fileName = model.fileName;
                this.fileStartTime = model.fileStartTime;
            } 

            /**
             * <p>The end time of the video recording file.</p>
             * 
             * <strong>example:</strong>
             * <p>1634746054</p>
             */
            public Builder fileEndTime(Integer fileEndTime) {
                this.fileEndTime = fileEndTime;
                return this;
            }

            /**
             * <p>The name of the video recording file.</p>
             * 
             * <strong>example:</strong>
             * <p>video1</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The start time of the video recording file.</p>
             * 
             * <strong>example:</strong>
             * <p>1634747054</p>
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
    /**
     * 
     * {@link QueryLocalFileUploadJobResponseBody} extends {@link TeaModel}
     *
     * <p>QueryLocalFileUploadJobResponseBody</p>
     */
    public static class ResultList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private Integer code;

        @com.aliyun.core.annotation.NameInMap("DeviceName")
        private String deviceName;

        @com.aliyun.core.annotation.NameInMap("FileList")
        private java.util.List<FileList> fileList;

        @com.aliyun.core.annotation.NameInMap("IotId")
        private String iotId;

        @com.aliyun.core.annotation.NameInMap("ProductKey")
        private String productKey;

        @com.aliyun.core.annotation.NameInMap("SlotEndTime")
        private Integer slotEndTime;

        @com.aliyun.core.annotation.NameInMap("SlotStartTime")
        private Integer slotStartTime;

        @com.aliyun.core.annotation.NameInMap("SlotStatus")
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
        public java.util.List<FileList> getFileList() {
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
            private java.util.List<FileList> fileList; 
            private String iotId; 
            private String productKey; 
            private Integer slotEndTime; 
            private Integer slotStartTime; 
            private Integer slotStatus; 

            private Builder() {
            } 

            private Builder(ResultList model) {
                this.code = model.code;
                this.deviceName = model.deviceName;
                this.fileList = model.fileList;
                this.iotId = model.iotId;
                this.productKey = model.productKey;
                this.slotEndTime = model.slotEndTime;
                this.slotStartTime = model.slotStartTime;
                this.slotStatus = model.slotStatus;
            } 

            /**
             * <p>The status code of the video recording upload task. Valid values:</p>
             * <ul>
             * <li>200: Normal.</li>
             * <li>9201: The device is offline. Bring the device online and try again.</li>
             * <li>9409: No cloud storage quota is available. Check the cloud storage quota and try again.</li>
             * <li>9417: A device, network, or other exception occurred. Try again, or check the device and network status.</li>
             * <li>9435: The video recording file does not exist. Make sure that the video recording file is stored locally on the video device and try again.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>9201</p>
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The DeviceName of the video device.</p>
             * 
             * <strong>example:</strong>
             * <p>gb_hik_IPC</p>
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * <p>The list of video recording files.</p>
             */
            public Builder fileList(java.util.List<FileList> fileList) {
                this.fileList = fileList;
                return this;
            }

            /**
             * <p>The ID of the video device. The ID is issued by IoT Platform and uniquely identifies the device.</p>
             * 
             * <strong>example:</strong>
             * <p>IQ9mO4tvMnAj****QUdcg2n400</p>
             */
            public Builder iotId(String iotId) {
                this.iotId = iotId;
                return this;
            }

            /**
             * <p>The ProductKey of the product to which the video device belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>g2****Q6ggK</p>
             */
            public Builder productKey(String productKey) {
                this.productKey = productKey;
                return this;
            }

            /**
             * <p>The end time of the video recording upload task.</p>
             * 
             * <strong>example:</strong>
             * <p>1634746054</p>
             */
            public Builder slotEndTime(Integer slotEndTime) {
                this.slotEndTime = slotEndTime;
                return this;
            }

            /**
             * <p>The start time of the video recording upload task.</p>
             * 
             * <strong>example:</strong>
             * <p>1634745754</p>
             */
            public Builder slotStartTime(Integer slotStartTime) {
                this.slotStartTime = slotStartTime;
                return this;
            }

            /**
             * <p>The execution status of the video recording upload task within the time period specified by <strong>SlotStartTime</strong> and <strong>SlotEndTime</strong>. Valid values:</p>
             * <ul>
             * <li>0: The task is being initialized.</li>
             * <li>1: The task is running.</li>
             * <li>2: The task is completed.</li>
             * <li>3: An exception occurred during task execution.</li>
             * <li>4: The task is manually terminated.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3</p>
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
    /**
     * 
     * {@link QueryLocalFileUploadJobResponseBody} extends {@link TeaModel}
     *
     * <p>QueryLocalFileUploadJobResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResultList")
        private java.util.List<ResultList> resultList;

        @com.aliyun.core.annotation.NameInMap("Status")
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
        public java.util.List<ResultList> getResultList() {
            return this.resultList;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.List<ResultList> resultList; 
            private Integer status; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.resultList = model.resultList;
                this.status = model.status;
            } 

            /**
             * <p>The task list.</p>
             */
            public Builder resultList(java.util.List<ResultList> resultList) {
                this.resultList = resultList;
                return this;
            }

            /**
             * <p>The status of the video recording upload task. Valid values:</p>
             * <ul>
             * <li>0: The task is being initialized.</li>
             * <li>1: The task is running.</li>
             * <li>2: The task is completed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
