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
 * {@link QueryOTAJobResponseBody} extends {@link TeaModel}
 *
 * <p>QueryOTAJobResponseBody</p>
 */
public class QueryOTAJobResponseBody extends TeaModel {
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

    private QueryOTAJobResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryOTAJobResponseBody create() {
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

        private Builder(QueryOTAJobResponseBody model) {
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
         * <p>The update batch information returned if the call is successful. For more information, see the following parameters.</p>
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
         * <p>30F1BB8D-EDBF-44FD-BBC0-BE97DEA73991</p>
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

        public QueryOTAJobResponseBody build() {
            return new QueryOTAJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryOTAJobResponseBody} extends {@link TeaModel}
     *
     * <p>QueryOTAJobResponseBody</p>
     */
    public static class SrcVersions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SrcVersion")
        private java.util.List<String> srcVersion;

        private SrcVersions(Builder builder) {
            this.srcVersion = builder.srcVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SrcVersions create() {
            return builder().build();
        }

        /**
         * @return srcVersion
         */
        public java.util.List<String> getSrcVersion() {
            return this.srcVersion;
        }

        public static final class Builder {
            private java.util.List<String> srcVersion; 

            private Builder() {
            } 

            private Builder(SrcVersions model) {
                this.srcVersion = model.srcVersion;
            } 

            /**
             * SrcVersion.
             */
            public Builder srcVersion(java.util.List<String> srcVersion) {
                this.srcVersion = srcVersion;
                return this;
            }

            public SrcVersions build() {
                return new SrcVersions(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryOTAJobResponseBody} extends {@link TeaModel}
     *
     * <p>QueryOTAJobResponseBody</p>
     */
    public static class OtaTagDTO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private OtaTagDTO(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OtaTagDTO create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(OtaTagDTO model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The key of each tag.</p>
             * 
             * <strong>example:</strong>
             * <p>key1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>value1</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public OtaTagDTO build() {
                return new OtaTagDTO(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryOTAJobResponseBody} extends {@link TeaModel}
     *
     * <p>QueryOTAJobResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OtaTagDTO")
        private java.util.List<OtaTagDTO> otaTagDTO;

        private Tags(Builder builder) {
            this.otaTagDTO = builder.otaTagDTO;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return otaTagDTO
         */
        public java.util.List<OtaTagDTO> getOtaTagDTO() {
            return this.otaTagDTO;
        }

        public static final class Builder {
            private java.util.List<OtaTagDTO> otaTagDTO; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.otaTagDTO = model.otaTagDTO;
            } 

            /**
             * OtaTagDTO.
             */
            public Builder otaTagDTO(java.util.List<OtaTagDTO> otaTagDTO) {
                this.otaTagDTO = otaTagDTO;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryOTAJobResponseBody} extends {@link TeaModel}
     *
     * <p>QueryOTAJobResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DestVersion")
        private String destVersion;

        @com.aliyun.core.annotation.NameInMap("DownloadProtocol")
        private String downloadProtocol;

        @com.aliyun.core.annotation.NameInMap("DynamicMode")
        private Integer dynamicMode;

        @com.aliyun.core.annotation.NameInMap("FirmwareId")
        private String firmwareId;

        @com.aliyun.core.annotation.NameInMap("GrayPercent")
        private String grayPercent;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("JobDesc")
        private String jobDesc;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("JobStatus")
        private String jobStatus;

        @com.aliyun.core.annotation.NameInMap("JobType")
        private String jobType;

        @com.aliyun.core.annotation.NameInMap("MaximumPerMinute")
        private Integer maximumPerMinute;

        @com.aliyun.core.annotation.NameInMap("MultiModuleMode")
        private Boolean multiModuleMode;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NeedConfirm")
        private Boolean needConfirm;

        @com.aliyun.core.annotation.NameInMap("NeedPush")
        private Boolean needPush;

        @com.aliyun.core.annotation.NameInMap("OverwriteMode")
        private Integer overwriteMode;

        @com.aliyun.core.annotation.NameInMap("ProductKey")
        private String productKey;

        @com.aliyun.core.annotation.NameInMap("RetryCount")
        private Integer retryCount;

        @com.aliyun.core.annotation.NameInMap("RetryInterval")
        private Integer retryInterval;

        @com.aliyun.core.annotation.NameInMap("SelectionType")
        private String selectionType;

        @com.aliyun.core.annotation.NameInMap("SrcVersions")
        private SrcVersions srcVersions;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("TargetSelection")
        private String targetSelection;

        @com.aliyun.core.annotation.NameInMap("TimeoutInMinutes")
        private Integer timeoutInMinutes;

        @com.aliyun.core.annotation.NameInMap("UtcCreate")
        private String utcCreate;

        @com.aliyun.core.annotation.NameInMap("UtcEndTime")
        private String utcEndTime;

        @com.aliyun.core.annotation.NameInMap("UtcModified")
        private String utcModified;

        @com.aliyun.core.annotation.NameInMap("UtcScheduleFinishTime")
        private String utcScheduleFinishTime;

        @com.aliyun.core.annotation.NameInMap("UtcScheduleTime")
        private String utcScheduleTime;

        @com.aliyun.core.annotation.NameInMap("UtcStartTime")
        private String utcStartTime;

        private Data(Builder builder) {
            this.destVersion = builder.destVersion;
            this.downloadProtocol = builder.downloadProtocol;
            this.dynamicMode = builder.dynamicMode;
            this.firmwareId = builder.firmwareId;
            this.grayPercent = builder.grayPercent;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.jobDesc = builder.jobDesc;
            this.jobId = builder.jobId;
            this.jobStatus = builder.jobStatus;
            this.jobType = builder.jobType;
            this.maximumPerMinute = builder.maximumPerMinute;
            this.multiModuleMode = builder.multiModuleMode;
            this.name = builder.name;
            this.needConfirm = builder.needConfirm;
            this.needPush = builder.needPush;
            this.overwriteMode = builder.overwriteMode;
            this.productKey = builder.productKey;
            this.retryCount = builder.retryCount;
            this.retryInterval = builder.retryInterval;
            this.selectionType = builder.selectionType;
            this.srcVersions = builder.srcVersions;
            this.tags = builder.tags;
            this.targetSelection = builder.targetSelection;
            this.timeoutInMinutes = builder.timeoutInMinutes;
            this.utcCreate = builder.utcCreate;
            this.utcEndTime = builder.utcEndTime;
            this.utcModified = builder.utcModified;
            this.utcScheduleFinishTime = builder.utcScheduleFinishTime;
            this.utcScheduleTime = builder.utcScheduleTime;
            this.utcStartTime = builder.utcStartTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return destVersion
         */
        public String getDestVersion() {
            return this.destVersion;
        }

        /**
         * @return downloadProtocol
         */
        public String getDownloadProtocol() {
            return this.downloadProtocol;
        }

        /**
         * @return dynamicMode
         */
        public Integer getDynamicMode() {
            return this.dynamicMode;
        }

        /**
         * @return firmwareId
         */
        public String getFirmwareId() {
            return this.firmwareId;
        }

        /**
         * @return grayPercent
         */
        public String getGrayPercent() {
            return this.grayPercent;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return jobDesc
         */
        public String getJobDesc() {
            return this.jobDesc;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return jobStatus
         */
        public String getJobStatus() {
            return this.jobStatus;
        }

        /**
         * @return jobType
         */
        public String getJobType() {
            return this.jobType;
        }

        /**
         * @return maximumPerMinute
         */
        public Integer getMaximumPerMinute() {
            return this.maximumPerMinute;
        }

        /**
         * @return multiModuleMode
         */
        public Boolean getMultiModuleMode() {
            return this.multiModuleMode;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return needConfirm
         */
        public Boolean getNeedConfirm() {
            return this.needConfirm;
        }

        /**
         * @return needPush
         */
        public Boolean getNeedPush() {
            return this.needPush;
        }

        /**
         * @return overwriteMode
         */
        public Integer getOverwriteMode() {
            return this.overwriteMode;
        }

        /**
         * @return productKey
         */
        public String getProductKey() {
            return this.productKey;
        }

        /**
         * @return retryCount
         */
        public Integer getRetryCount() {
            return this.retryCount;
        }

        /**
         * @return retryInterval
         */
        public Integer getRetryInterval() {
            return this.retryInterval;
        }

        /**
         * @return selectionType
         */
        public String getSelectionType() {
            return this.selectionType;
        }

        /**
         * @return srcVersions
         */
        public SrcVersions getSrcVersions() {
            return this.srcVersions;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return targetSelection
         */
        public String getTargetSelection() {
            return this.targetSelection;
        }

        /**
         * @return timeoutInMinutes
         */
        public Integer getTimeoutInMinutes() {
            return this.timeoutInMinutes;
        }

        /**
         * @return utcCreate
         */
        public String getUtcCreate() {
            return this.utcCreate;
        }

        /**
         * @return utcEndTime
         */
        public String getUtcEndTime() {
            return this.utcEndTime;
        }

        /**
         * @return utcModified
         */
        public String getUtcModified() {
            return this.utcModified;
        }

        /**
         * @return utcScheduleFinishTime
         */
        public String getUtcScheduleFinishTime() {
            return this.utcScheduleFinishTime;
        }

        /**
         * @return utcScheduleTime
         */
        public String getUtcScheduleTime() {
            return this.utcScheduleTime;
        }

        /**
         * @return utcStartTime
         */
        public String getUtcStartTime() {
            return this.utcStartTime;
        }

        public static final class Builder {
            private String destVersion; 
            private String downloadProtocol; 
            private Integer dynamicMode; 
            private String firmwareId; 
            private String grayPercent; 
            private String groupId; 
            private String groupName; 
            private String jobDesc; 
            private String jobId; 
            private String jobStatus; 
            private String jobType; 
            private Integer maximumPerMinute; 
            private Boolean multiModuleMode; 
            private String name; 
            private Boolean needConfirm; 
            private Boolean needPush; 
            private Integer overwriteMode; 
            private String productKey; 
            private Integer retryCount; 
            private Integer retryInterval; 
            private String selectionType; 
            private SrcVersions srcVersions; 
            private Tags tags; 
            private String targetSelection; 
            private Integer timeoutInMinutes; 
            private String utcCreate; 
            private String utcEndTime; 
            private String utcModified; 
            private String utcScheduleFinishTime; 
            private String utcScheduleTime; 
            private String utcStartTime; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.destVersion = model.destVersion;
                this.downloadProtocol = model.downloadProtocol;
                this.dynamicMode = model.dynamicMode;
                this.firmwareId = model.firmwareId;
                this.grayPercent = model.grayPercent;
                this.groupId = model.groupId;
                this.groupName = model.groupName;
                this.jobDesc = model.jobDesc;
                this.jobId = model.jobId;
                this.jobStatus = model.jobStatus;
                this.jobType = model.jobType;
                this.maximumPerMinute = model.maximumPerMinute;
                this.multiModuleMode = model.multiModuleMode;
                this.name = model.name;
                this.needConfirm = model.needConfirm;
                this.needPush = model.needPush;
                this.overwriteMode = model.overwriteMode;
                this.productKey = model.productKey;
                this.retryCount = model.retryCount;
                this.retryInterval = model.retryInterval;
                this.selectionType = model.selectionType;
                this.srcVersions = model.srcVersions;
                this.tags = model.tags;
                this.targetSelection = model.targetSelection;
                this.timeoutInMinutes = model.timeoutInMinutes;
                this.utcCreate = model.utcCreate;
                this.utcEndTime = model.utcEndTime;
                this.utcModified = model.utcModified;
                this.utcScheduleFinishTime = model.utcScheduleFinishTime;
                this.utcScheduleTime = model.utcScheduleTime;
                this.utcStartTime = model.utcStartTime;
            } 

            /**
             * <p>The destination firmware version of the update.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.1</p>
             */
            public Builder destVersion(String destVersion) {
                this.destVersion = destVersion;
                return this;
            }

            /**
             * <p>The download protocol of the update package.</p>
             * 
             * <strong>example:</strong>
             * <p>HTTPS</p>
             */
            public Builder downloadProtocol(String downloadProtocol) {
                this.downloadProtocol = downloadProtocol;
                return this;
            }

            /**
             * <p>The mode of dynamic update. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: constantly updates the devices that meet the conditions.</li>
             * <li><strong>2</strong>: updates only the devices that subsequently submit the latest firmware versions.</li>
             * </ul>
             * <p>This parameter is returned only if you perform a dynamic update.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder dynamicMode(Integer dynamicMode) {
                this.dynamicMode = dynamicMode;
                return this;
            }

            /**
             * <p>The ID of the update package.</p>
             * 
             * <strong>example:</strong>
             * <p>UfuxnwygsuSkVE0VCN****0100</p>
             */
            public Builder firmwareId(String firmwareId) {
                this.firmwareId = firmwareId;
                return this;
            }

            /**
             * <p>The phase ratio of the phased update.</p>
             * <p>This parameter is returned only if you perform a phased update.</p>
             * 
             * <strong>example:</strong>
             * <p>50.00</p>
             */
            public Builder grayPercent(String grayPercent) {
                this.grayPercent = grayPercent;
                return this;
            }

            /**
             * <p>The ID of the device group to be updated.</p>
             * 
             * <strong>example:</strong>
             * <p>CtjzCkNuOxUR***</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The name of the device group to be updated.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The description of the update batch.</p>
             * 
             * <strong>example:</strong>
             * <p>batch upgrade</p>
             */
            public Builder jobDesc(String jobDesc) {
                this.jobDesc = jobDesc;
                return this;
            }

            /**
             * <p>The ID of the update batch.</p>
             * 
             * <strong>example:</strong>
             * <p>HvKuBpuk3rdk6E92CP****0200</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The status of the update batch.</p>
             * <ul>
             * <li><strong>PLANNED</strong>: The update batch is being planned. The batch is created, but the scheduled time has not arrived. This parameter is returned only if you perform a static update.</li>
             * <li><strong>IN_PROGRESS</strong>: The update batch is running.</li>
             * <li><strong>COMPLETED</strong>: The update batch is completed.</li>
             * <li><strong>CANCELED</strong>: The update batch is canceled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>IN_PROGRESS</p>
             */
            public Builder jobStatus(String jobStatus) {
                this.jobStatus = jobStatus;
                return this;
            }

            /**
             * <p>The type of the batch. Valid values:</p>
             * <ul>
             * <li><strong>VERFIY_FIRMWARE</strong>: update package verification.</li>
             * <li><strong>UPGRADE_FIRMWARE</strong>: batch update.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>UPGRADE_FIRMWARE</p>
             */
            public Builder jobType(String jobType) {
                this.jobType = jobType;
                return this;
            }

            /**
             * <p>The maximum number of devices to which the download URL of the update package is pushed per minute.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder maximumPerMinute(Integer maximumPerMinute) {
                this.maximumPerMinute = maximumPerMinute;
                return this;
            }

            /**
             * <p>Specifies whether the device supports simultaneous updates of multiple modules.</p>
             * <ul>
             * <li><strong>false</strong> (default): no.</li>
             * <li><strong>true</strong>: yes.</li>
             * </ul>
             * <p>For more information, see <a href="https://help.aliyun.com/document_detail/58328.html">Overview</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder multiModuleMode(Boolean multiModuleMode) {
                this.multiModuleMode = multiModuleMode;
                return this;
            }

            /**
             * <p>The name of the update package.</p>
             * 
             * <strong>example:</strong>
             * <p>Firmware2</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Specifies whether to confirm the update by using your mobile app.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder needConfirm(Boolean needConfirm) {
                this.needConfirm = needConfirm;
                return this;
            }

            /**
             * <p>Specifies whether to automatically push update tasks from IoT Platform to devices.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder needPush(Boolean needPush) {
                this.needPush = needPush;
                return this;
            }

            /**
             * <p>Specifies whether to overwrite the previous update task. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: The previous update task is not overwritten. If a device already has an update task, the previous update task is implemented.</li>
             * <li><strong>2</strong>: The previous update task is overwritten. Only the current update task is implemented.</li>
             * </ul>
             * <p>The update task that is in progress is not overwritten.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder overwriteMode(Integer overwriteMode) {
                this.overwriteMode = overwriteMode;
                return this;
            }

            /**
             * <p>The ProductKey of the product to which the update package belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>a19mzPZ****</p>
             */
            public Builder productKey(String productKey) {
                this.productKey = productKey;
                return this;
            }

            /**
             * <p>The number of automatic retries after a device fails to be updated.</p>
             * <p>This parameter is returned if a retry policy is set when you create the update batch.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder retryCount(Integer retryCount) {
                this.retryCount = retryCount;
                return this;
            }

            /**
             * <p>The automatic retry interval after a device fails to be updated. Unit: minutes.</p>
             * <p>This parameter is returned if a retry policy is set when you create the update batch.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder retryInterval(Integer retryInterval) {
                this.retryInterval = retryInterval;
                return this;
            }

            /**
             * <p>The update policy of the update batch. Valid values:</p>
             * <ul>
             * <li><strong>DYNAMIC</strong>: dynamic update. This value is returned if you call the <a href="https://help.aliyun.com/document_detail/147887.html">CreateOTADynamicUpgradeJob</a> API operation to create an update batch.</li>
             * <li><strong>STATIC</strong>: static update. This value is returned if you call the <a href="https://help.aliyun.com/document_detail/147496.html">CreateOTAStaticUpgradeJob</a> API operation to create an update batch.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>STATIC</p>
             */
            public Builder selectionType(String selectionType) {
                this.selectionType = selectionType;
                return this;
            }

            /**
             * <p>The list of firmware versions to be updated.</p>
             */
            public Builder srcVersions(SrcVersions srcVersions) {
                this.srcVersions = srcVersions;
                return this;
            }

            /**
             * <p>The tags of the update batch.</p>
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The scope of the update batch. Valid values: </p>
             * <ul>
             * <li><strong>ALL</strong>: updates all devices.</li>
             * <li><strong>SPECIFIC</strong>: updates specified devices.</li>
             * <li><strong>GRAY</strong>: performs a phased update.</li>
             * </ul>
             * <blockquote>
             * <p> The value ALL is returned if you call the <a href="/help/en/iot-platform/latest/av6dui">CreateOTADynamicUpgradeJob</a> API operation to create an update batch.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>SPECIFIC</p>
             */
            public Builder targetSelection(String targetSelection) {
                this.targetSelection = targetSelection;
                return this;
            }

            /**
             * <p>The timeout period of the device update. Unit: minutes.</p>
             * <p>This parameter is returned if the timeout period is set when you create the update batch.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder timeoutInMinutes(Integer timeoutInMinutes) {
                this.timeoutInMinutes = timeoutInMinutes;
                return this;
            }

            /**
             * <p>The time when the update batch was created. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-12-28T02:43:10.000Z</p>
             */
            public Builder utcCreate(String utcCreate) {
                this.utcCreate = utcCreate;
                return this;
            }

            /**
             * <p>The end time of the update batch. The time is displayed in UTC.</p>
             * <p>This parameter is returned only after the update batch is completed.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-12-29T02:43:10.000Z</p>
             */
            public Builder utcEndTime(String utcEndTime) {
                this.utcEndTime = utcEndTime;
                return this;
            }

            /**
             * <p>The time when the update batch was last modified. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-12-28T02:43:10.000Z</p>
             */
            public Builder utcModified(String utcModified) {
                this.utcModified = utcModified;
                return this;
            }

            /**
             * <p>The end time of the scheduled update batch. This parameter is returned only if the update batch is scheduled and the end time of the scheduled update batch is specified.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-12-30T02:43:10.000Z</p>
             */
            public Builder utcScheduleFinishTime(String utcScheduleFinishTime) {
                this.utcScheduleFinishTime = utcScheduleFinishTime;
                return this;
            }

            /**
             * <p>The start time of the scheduled update batch. This parameter is returned only for scheduled update batches.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-12-29T02:43:10.000Z</p>
             */
            public Builder utcScheduleTime(String utcScheduleTime) {
                this.utcScheduleTime = utcScheduleTime;
                return this;
            }

            /**
             * <p>The start time of the update batch. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-12-28T02:43:10.000Z</p>
             */
            public Builder utcStartTime(String utcStartTime) {
                this.utcStartTime = utcStartTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
