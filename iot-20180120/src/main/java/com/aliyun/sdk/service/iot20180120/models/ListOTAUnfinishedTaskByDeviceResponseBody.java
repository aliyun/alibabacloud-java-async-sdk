// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOTAUnfinishedTaskByDeviceResponseBody} extends {@link TeaModel}
 *
 * <p>ListOTAUnfinishedTaskByDeviceResponseBody</p>
 */
public class ListOTAUnfinishedTaskByDeviceResponseBody extends TeaModel {
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

    private ListOTAUnfinishedTaskByDeviceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOTAUnfinishedTaskByDeviceResponseBody create() {
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

        public ListOTAUnfinishedTaskByDeviceResponseBody build() {
            return new ListOTAUnfinishedTaskByDeviceResponseBody(this);
        } 

    } 

    public static class SimpleOTATaskInfo extends TeaModel {
        @NameInMap("DestVersion")
        private String destVersion;

        @NameInMap("DeviceName")
        private String deviceName;

        @NameInMap("FirmwareId")
        private String firmwareId;

        @NameInMap("IotId")
        private String iotId;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("ModuleName")
        private String moduleName;

        @NameInMap("ProductKey")
        private String productKey;

        @NameInMap("ProductName")
        private String productName;

        @NameInMap("SrcVersion")
        private String srcVersion;

        @NameInMap("TaskId")
        private String taskId;

        @NameInMap("TaskStatus")
        private String taskStatus;

        @NameInMap("UtcCreate")
        private String utcCreate;

        @NameInMap("UtcModified")
        private String utcModified;

        private SimpleOTATaskInfo(Builder builder) {
            this.destVersion = builder.destVersion;
            this.deviceName = builder.deviceName;
            this.firmwareId = builder.firmwareId;
            this.iotId = builder.iotId;
            this.jobId = builder.jobId;
            this.moduleName = builder.moduleName;
            this.productKey = builder.productKey;
            this.productName = builder.productName;
            this.srcVersion = builder.srcVersion;
            this.taskId = builder.taskId;
            this.taskStatus = builder.taskStatus;
            this.utcCreate = builder.utcCreate;
            this.utcModified = builder.utcModified;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SimpleOTATaskInfo create() {
            return builder().build();
        }

        /**
         * @return destVersion
         */
        public String getDestVersion() {
            return this.destVersion;
        }

        /**
         * @return deviceName
         */
        public String getDeviceName() {
            return this.deviceName;
        }

        /**
         * @return firmwareId
         */
        public String getFirmwareId() {
            return this.firmwareId;
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
         * @return moduleName
         */
        public String getModuleName() {
            return this.moduleName;
        }

        /**
         * @return productKey
         */
        public String getProductKey() {
            return this.productKey;
        }

        /**
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        /**
         * @return srcVersion
         */
        public String getSrcVersion() {
            return this.srcVersion;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskStatus
         */
        public String getTaskStatus() {
            return this.taskStatus;
        }

        /**
         * @return utcCreate
         */
        public String getUtcCreate() {
            return this.utcCreate;
        }

        /**
         * @return utcModified
         */
        public String getUtcModified() {
            return this.utcModified;
        }

        public static final class Builder {
            private String destVersion; 
            private String deviceName; 
            private String firmwareId; 
            private String iotId; 
            private String jobId; 
            private String moduleName; 
            private String productKey; 
            private String productName; 
            private String srcVersion; 
            private String taskId; 
            private String taskStatus; 
            private String utcCreate; 
            private String utcModified; 

            /**
             * DestVersion.
             */
            public Builder destVersion(String destVersion) {
                this.destVersion = destVersion;
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
             * FirmwareId.
             */
            public Builder firmwareId(String firmwareId) {
                this.firmwareId = firmwareId;
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
             * ModuleName.
             */
            public Builder moduleName(String moduleName) {
                this.moduleName = moduleName;
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
             * ProductName.
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * SrcVersion.
             */
            public Builder srcVersion(String srcVersion) {
                this.srcVersion = srcVersion;
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
             * TaskStatus.
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            /**
             * UtcCreate.
             */
            public Builder utcCreate(String utcCreate) {
                this.utcCreate = utcCreate;
                return this;
            }

            /**
             * UtcModified.
             */
            public Builder utcModified(String utcModified) {
                this.utcModified = utcModified;
                return this;
            }

            public SimpleOTATaskInfo build() {
                return new SimpleOTATaskInfo(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("SimpleOTATaskInfo")
        private java.util.List < SimpleOTATaskInfo> simpleOTATaskInfo;

        private Data(Builder builder) {
            this.simpleOTATaskInfo = builder.simpleOTATaskInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return simpleOTATaskInfo
         */
        public java.util.List < SimpleOTATaskInfo> getSimpleOTATaskInfo() {
            return this.simpleOTATaskInfo;
        }

        public static final class Builder {
            private java.util.List < SimpleOTATaskInfo> simpleOTATaskInfo; 

            /**
             * SimpleOTATaskInfo.
             */
            public Builder simpleOTATaskInfo(java.util.List < SimpleOTATaskInfo> simpleOTATaskInfo) {
                this.simpleOTATaskInfo = simpleOTATaskInfo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
