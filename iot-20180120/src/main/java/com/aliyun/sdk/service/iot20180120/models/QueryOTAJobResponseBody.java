// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryOTAJobResponseBody} extends {@link TeaModel}
 *
 * <p>QueryOTAJobResponseBody</p>
 */
public class QueryOTAJobResponseBody extends TeaModel {
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

        public QueryOTAJobResponseBody build() {
            return new QueryOTAJobResponseBody(this);
        } 

    } 

    public static class SrcVersions extends TeaModel {
        @NameInMap("SrcVersion")
        private java.util.List < String > srcVersion;

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
        public java.util.List < String > getSrcVersion() {
            return this.srcVersion;
        }

        public static final class Builder {
            private java.util.List < String > srcVersion; 

            /**
             * SrcVersion.
             */
            public Builder srcVersion(java.util.List < String > srcVersion) {
                this.srcVersion = srcVersion;
                return this;
            }

            public SrcVersions build() {
                return new SrcVersions(this);
            } 

        } 

    }
    public static class OtaTagDTO extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
    public static class Tags extends TeaModel {
        @NameInMap("OtaTagDTO")
        private java.util.List < OtaTagDTO> otaTagDTO;

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
        public java.util.List < OtaTagDTO> getOtaTagDTO() {
            return this.otaTagDTO;
        }

        public static final class Builder {
            private java.util.List < OtaTagDTO> otaTagDTO; 

            /**
             * OtaTagDTO.
             */
            public Builder otaTagDTO(java.util.List < OtaTagDTO> otaTagDTO) {
                this.otaTagDTO = otaTagDTO;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("DestVersion")
        private String destVersion;

        @NameInMap("DynamicMode")
        private Integer dynamicMode;

        @NameInMap("FirmwareId")
        private String firmwareId;

        @NameInMap("GrayPercent")
        private String grayPercent;

        @NameInMap("JobDesc")
        private String jobDesc;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("JobStatus")
        private String jobStatus;

        @NameInMap("JobType")
        private String jobType;

        @NameInMap("MaximumPerMinute")
        private Integer maximumPerMinute;

        @NameInMap("Name")
        private String name;

        @NameInMap("NeedConfirm")
        private Boolean needConfirm;

        @NameInMap("NeedPush")
        private Boolean needPush;

        @NameInMap("OverwriteMode")
        private Integer overwriteMode;

        @NameInMap("ProductKey")
        private String productKey;

        @NameInMap("RetryCount")
        private Integer retryCount;

        @NameInMap("RetryInterval")
        private Integer retryInterval;

        @NameInMap("SelectionType")
        private String selectionType;

        @NameInMap("SrcVersions")
        private SrcVersions srcVersions;

        @NameInMap("Tags")
        private Tags tags;

        @NameInMap("TargetSelection")
        private String targetSelection;

        @NameInMap("TimeoutInMinutes")
        private Integer timeoutInMinutes;

        @NameInMap("UtcCreate")
        private String utcCreate;

        @NameInMap("UtcEndTime")
        private String utcEndTime;

        @NameInMap("UtcModified")
        private String utcModified;

        @NameInMap("UtcScheduleFinishTime")
        private String utcScheduleFinishTime;

        @NameInMap("UtcScheduleTime")
        private String utcScheduleTime;

        @NameInMap("UtcStartTime")
        private String utcStartTime;

        private Data(Builder builder) {
            this.destVersion = builder.destVersion;
            this.dynamicMode = builder.dynamicMode;
            this.firmwareId = builder.firmwareId;
            this.grayPercent = builder.grayPercent;
            this.jobDesc = builder.jobDesc;
            this.jobId = builder.jobId;
            this.jobStatus = builder.jobStatus;
            this.jobType = builder.jobType;
            this.maximumPerMinute = builder.maximumPerMinute;
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
            private Integer dynamicMode; 
            private String firmwareId; 
            private String grayPercent; 
            private String jobDesc; 
            private String jobId; 
            private String jobStatus; 
            private String jobType; 
            private Integer maximumPerMinute; 
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

            /**
             * DestVersion.
             */
            public Builder destVersion(String destVersion) {
                this.destVersion = destVersion;
                return this;
            }

            /**
             * DynamicMode.
             */
            public Builder dynamicMode(Integer dynamicMode) {
                this.dynamicMode = dynamicMode;
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
             * GrayPercent.
             */
            public Builder grayPercent(String grayPercent) {
                this.grayPercent = grayPercent;
                return this;
            }

            /**
             * JobDesc.
             */
            public Builder jobDesc(String jobDesc) {
                this.jobDesc = jobDesc;
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
             * JobStatus.
             */
            public Builder jobStatus(String jobStatus) {
                this.jobStatus = jobStatus;
                return this;
            }

            /**
             * JobType.
             */
            public Builder jobType(String jobType) {
                this.jobType = jobType;
                return this;
            }

            /**
             * MaximumPerMinute.
             */
            public Builder maximumPerMinute(Integer maximumPerMinute) {
                this.maximumPerMinute = maximumPerMinute;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * NeedConfirm.
             */
            public Builder needConfirm(Boolean needConfirm) {
                this.needConfirm = needConfirm;
                return this;
            }

            /**
             * NeedPush.
             */
            public Builder needPush(Boolean needPush) {
                this.needPush = needPush;
                return this;
            }

            /**
             * OverwriteMode.
             */
            public Builder overwriteMode(Integer overwriteMode) {
                this.overwriteMode = overwriteMode;
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
             * RetryCount.
             */
            public Builder retryCount(Integer retryCount) {
                this.retryCount = retryCount;
                return this;
            }

            /**
             * RetryInterval.
             */
            public Builder retryInterval(Integer retryInterval) {
                this.retryInterval = retryInterval;
                return this;
            }

            /**
             * SelectionType.
             */
            public Builder selectionType(String selectionType) {
                this.selectionType = selectionType;
                return this;
            }

            /**
             * SrcVersions.
             */
            public Builder srcVersions(SrcVersions srcVersions) {
                this.srcVersions = srcVersions;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * TargetSelection.
             */
            public Builder targetSelection(String targetSelection) {
                this.targetSelection = targetSelection;
                return this;
            }

            /**
             * TimeoutInMinutes.
             */
            public Builder timeoutInMinutes(Integer timeoutInMinutes) {
                this.timeoutInMinutes = timeoutInMinutes;
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
             * UtcEndTime.
             */
            public Builder utcEndTime(String utcEndTime) {
                this.utcEndTime = utcEndTime;
                return this;
            }

            /**
             * UtcModified.
             */
            public Builder utcModified(String utcModified) {
                this.utcModified = utcModified;
                return this;
            }

            /**
             * UtcScheduleFinishTime.
             */
            public Builder utcScheduleFinishTime(String utcScheduleFinishTime) {
                this.utcScheduleFinishTime = utcScheduleFinishTime;
                return this;
            }

            /**
             * UtcScheduleTime.
             */
            public Builder utcScheduleTime(String utcScheduleTime) {
                this.utcScheduleTime = utcScheduleTime;
                return this;
            }

            /**
             * UtcStartTime.
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
