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
 * {@link ListOTATaskByJobResponseBody} extends {@link TeaModel}
 *
 * <p>ListOTATaskByJobResponseBody</p>
 */
public class ListOTATaskByJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("PageCount")
    private Integer pageCount;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private ListOTATaskByJobResponseBody(Builder builder) {
        this.code = builder.code;
        this.currentPage = builder.currentPage;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.pageCount = builder.pageCount;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOTATaskByJobResponseBody create() {
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
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
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
     * @return pageCount
     */
    public Integer getPageCount() {
        return this.pageCount;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private Integer currentPage; 
        private Data data; 
        private String errorMessage; 
        private Integer pageCount; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(ListOTATaskByJobResponseBody model) {
            this.code = model.code;
            this.currentPage = model.currentPage;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.pageCount = model.pageCount;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.total = model.total;
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
         * <p>The number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The update task information returned if the call is successful. For more information, see <strong>SimpleOTATaskInfo</strong>.</p>
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
         * <p>The total number of pages returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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

        /**
         * <p>The total number of update tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListOTATaskByJobResponseBody build() {
            return new ListOTATaskByJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListOTATaskByJobResponseBody} extends {@link TeaModel}
     *
     * <p>ListOTATaskByJobResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("ProductKey")
        private String productKey;

        @com.aliyun.core.annotation.NameInMap("ProductName")
        private String productName;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("SrcVersion")
        private String srcVersion;

        @com.aliyun.core.annotation.NameInMap("TaskDesc")
        private String taskDesc;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskStatus")
        private String taskStatus;

        @com.aliyun.core.annotation.NameInMap("Timeout")
        private String timeout;

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
            this.productKey = builder.productKey;
            this.productName = builder.productName;
            this.progress = builder.progress;
            this.srcVersion = builder.srcVersion;
            this.taskDesc = builder.taskDesc;
            this.taskId = builder.taskId;
            this.taskStatus = builder.taskStatus;
            this.timeout = builder.timeout;
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
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return srcVersion
         */
        public String getSrcVersion() {
            return this.srcVersion;
        }

        /**
         * @return taskDesc
         */
        public String getTaskDesc() {
            return this.taskDesc;
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
         * @return timeout
         */
        public String getTimeout() {
            return this.timeout;
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
            private String productKey; 
            private String productName; 
            private String progress; 
            private String srcVersion; 
            private String taskDesc; 
            private String taskId; 
            private String taskStatus; 
            private String timeout; 
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
                this.productKey = model.productKey;
                this.productName = model.productName;
                this.progress = model.progress;
                this.srcVersion = model.srcVersion;
                this.taskDesc = model.taskDesc;
                this.taskId = model.taskId;
                this.taskStatus = model.taskStatus;
                this.timeout = model.timeout;
                this.utcCreate = model.utcCreate;
                this.utcModified = model.utcModified;
            } 

            /**
             * <p>The version of the destination over-the-air (OTA) update package.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.1</p>
             */
            public Builder destVersion(String destVersion) {
                this.destVersion = destVersion;
                return this;
            }

            /**
             * <p>The name of the device.</p>
             * 
             * <strong>example:</strong>
             * <p>testDevice2</p>
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
             * <p>The ID of the device.</p>
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
             * <p>The current update progress.</p>
             * 
             * <strong>example:</strong>
             * <p>0.00</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
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
             * <p>The description of the update task. This parameter displays an error message if the device update times out or the update task is canceled.</p>
             * 
             * <strong>example:</strong>
             * <p>report version is not conform</p>
             */
            public Builder taskDesc(String taskDesc) {
                this.taskDesc = taskDesc;
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
             * <p>The update status of the device.</p>
             * <ul>
             * <li><strong>CONFIRM</strong>: The update task is pending confirmation.</li>
             * <li><strong>QUEUED</strong>: The update notification is to be pushed.</li>
             * <li><strong>NOTIFIED</strong>: The update notification is pushed to the device.</li>
             * <li><strong>IN_PROGRESS</strong>: The update task is in progress.</li>
             * <li><strong>SUCCEEDED</strong>: The update is successful.</li>
             * <li><strong>FAILED</strong>: The update failed.</li>
             * <li><strong>CANCELED</strong>: The update batch is canceled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FAILED</p>
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            /**
             * <p>The timeout period of the device update. Unit: minutes.</p>
             * <blockquote>
             * <p> If no timeout period is specified for the update batch, the return value is null.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1440</p>
             */
            public Builder timeout(String timeout) {
                this.timeout = timeout;
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
             * <p>2019-11-04T03:38:22.000Z</p>
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
     * {@link ListOTATaskByJobResponseBody} extends {@link TeaModel}
     *
     * <p>ListOTATaskByJobResponseBody</p>
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
