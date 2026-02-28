// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link ListOTAUnfinishedTaskByDeviceResponseBody} extends {@link TeaModel}
 *
 * <p>ListOTAUnfinishedTaskByDeviceResponseBody</p>
 */
public class ListOTAUnfinishedTaskByDeviceResponseBody extends TeaModel {
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

        private Builder(ListOTAUnfinishedTaskByDeviceResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot.system.SystemException</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The update task information returned if the call is successful. For more information, see the following <strong>SimpleOTATaskInfo</strong>.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message returned if the call fails.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>A59D3BE1-E9A3-43F3-9B50-B7C8DE165D9B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful.</p>
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

        public ListOTAUnfinishedTaskByDeviceResponseBody build() {
            return new ListOTAUnfinishedTaskByDeviceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListOTAUnfinishedTaskByDeviceResponseBody} extends {@link TeaModel}
     *
     * <p>ListOTAUnfinishedTaskByDeviceResponseBody</p>
     */
    public static class SimpleOTATaskInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DestVersion")
        private String destVersion;

        @com.aliyun.core.annotation.NameInMap("DeviceName")
        private String deviceName;

        @com.aliyun.core.annotation.NameInMap("FirmwareId")
        private String firmwareId;

        @com.aliyun.core.annotation.NameInMap("IotId")
        private String iotId;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("ModuleName")
        private String moduleName;

        @com.aliyun.core.annotation.NameInMap("ProductKey")
        private String productKey;

        @com.aliyun.core.annotation.NameInMap("ProductName")
        private String productName;

        @com.aliyun.core.annotation.NameInMap("SrcVersion")
        private String srcVersion;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskStatus")
        private String taskStatus;

        @com.aliyun.core.annotation.NameInMap("UtcCreate")
        private String utcCreate;

        @com.aliyun.core.annotation.NameInMap("UtcModified")
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

            private Builder() {
            } 

            private Builder(SimpleOTATaskInfo model) {
                this.destVersion = model.destVersion;
                this.deviceName = model.deviceName;
                this.firmwareId = model.firmwareId;
                this.iotId = model.iotId;
                this.jobId = model.jobId;
                this.moduleName = model.moduleName;
                this.productKey = model.productKey;
                this.productName = model.productName;
                this.srcVersion = model.srcVersion;
                this.taskId = model.taskId;
                this.taskStatus = model.taskStatus;
                this.utcCreate = model.utcCreate;
                this.utcModified = model.utcModified;
            } 

            /**
             * <p>The firmware version after the update.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.1</p>
             */
            public Builder destVersion(String destVersion) {
                this.destVersion = destVersion;
                return this;
            }

            /**
             * <p>The DeviceName of the device.</p>
             * 
             * <strong>example:</strong>
             * <p>light</p>
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * <p>The ID of the update package.</p>
             * 
             * <strong>example:</strong>
             * <p>q3j9OYBjUAZMv1hlMgdo03****</p>
             */
            public Builder firmwareId(String firmwareId) {
                this.firmwareId = firmwareId;
                return this;
            }

            /**
             * <p>The ID of the device. The ID is a unique identifier that is issued by IoT Platform to the device.</p>
             * 
             * <strong>example:</strong>
             * <p>nadRdeffljdEndlfadgadfse****</p>
             */
            public Builder iotId(String iotId) {
                this.iotId = iotId;
                return this;
            }

            /**
             * <p>The ID of the update batch.</p>
             * 
             * <strong>example:</strong>
             * <p>7glPHmaDYLAYMD1HHutT02****</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The name of the OTA module.</p>
             * 
             * <strong>example:</strong>
             * <p>WifiConfigModify</p>
             */
            public Builder moduleName(String moduleName) {
                this.moduleName = moduleName;
                return this;
            }

            /**
             * <p>The ProductKey of the product to which the device belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>a1GUfrM****</p>
             */
            public Builder productKey(String productKey) {
                this.productKey = productKey;
                return this;
            }

            /**
             * <p>The name of the product to which the device belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>MyProduct</p>
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * <p>The firmware version before the update.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder srcVersion(String srcVersion) {
                this.srcVersion = srcVersion;
                return this;
            }

            /**
             * <p>The ID of the update task.</p>
             * 
             * <strong>example:</strong>
             * <p>y3tOmCDNgpR8F9jnVEzC01****</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The status of the update task.</p>
             * <ul>
             * <li><strong>CONFIRM</strong>: The update task is pending confirmation.</li>
             * <li><strong>QUEUED</strong>: The update notification is to be pushed.</li>
             * <li><strong>NOTIFIED</strong>: The update notification is pushed to the device.</li>
             * <li><strong>IN_PROGRESS</strong>: The update task is in progress.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CONFIRM</p>
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            /**
             * <p>The time when the update task was created. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-11-04T03:38:22.000Z</p>
             */
            public Builder utcCreate(String utcCreate) {
                this.utcCreate = utcCreate;
                return this;
            }

            /**
             * <p>The time when the update task was last modified. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-11-04T03:38:22.000Z</p>
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
    /**
     * 
     * {@link ListOTAUnfinishedTaskByDeviceResponseBody} extends {@link TeaModel}
     *
     * <p>ListOTAUnfinishedTaskByDeviceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SimpleOTATaskInfo")
        private java.util.List<SimpleOTATaskInfo> simpleOTATaskInfo;

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
        public java.util.List<SimpleOTATaskInfo> getSimpleOTATaskInfo() {
            return this.simpleOTATaskInfo;
        }

        public static final class Builder {
            private java.util.List<SimpleOTATaskInfo> simpleOTATaskInfo; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.simpleOTATaskInfo = model.simpleOTATaskInfo;
            } 

            /**
             * SimpleOTATaskInfo.
             */
            public Builder simpleOTATaskInfo(java.util.List<SimpleOTATaskInfo> simpleOTATaskInfo) {
                this.simpleOTATaskInfo = simpleOTATaskInfo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
