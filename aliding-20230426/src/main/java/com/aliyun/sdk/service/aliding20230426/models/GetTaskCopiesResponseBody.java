// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTaskCopiesResponseBody} extends {@link TeaModel}
 *
 * <p>GetTaskCopiesResponseBody</p>
 */
public class GetTaskCopiesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Long totalCount;

    @com.aliyun.core.annotation.NameInMap("vendorRequestId")
    private String vendorRequestId;

    @com.aliyun.core.annotation.NameInMap("vendorType")
    private String vendorType;

    private GetTaskCopiesResponseBody(Builder builder) {
        this.data = builder.data;
        this.pageNumber = builder.pageNumber;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.vendorRequestId = builder.vendorRequestId;
        this.vendorType = builder.vendorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTaskCopiesResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return vendorRequestId
     */
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    /**
     * @return vendorType
     */
    public String getVendorType() {
        return this.vendorType;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private Long pageNumber; 
        private String requestId; 
        private Long totalCount; 
        private String vendorRequestId; 
        private String vendorType; 

        /**
         * data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * vendorRequestId.
         */
        public Builder vendorRequestId(String vendorRequestId) {
            this.vendorRequestId = vendorRequestId;
            return this;
        }

        /**
         * vendorType.
         */
        public Builder vendorType(String vendorType) {
            this.vendorType = vendorType;
            return this;
        }

        public GetTaskCopiesResponseBody build() {
            return new GetTaskCopiesResponseBody(this);
        } 

    } 

    public static class CurrentActivityInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActivityId")
        private String activityId;

        @com.aliyun.core.annotation.NameInMap("ActivityInstanceStatus")
        private String activityInstanceStatus;

        @com.aliyun.core.annotation.NameInMap("ActivityName")
        private String activityName;

        @com.aliyun.core.annotation.NameInMap("ActivityNameInEnglish")
        private String activityNameInEnglish;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        private CurrentActivityInstances(Builder builder) {
            this.activityId = builder.activityId;
            this.activityInstanceStatus = builder.activityInstanceStatus;
            this.activityName = builder.activityName;
            this.activityNameInEnglish = builder.activityNameInEnglish;
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CurrentActivityInstances create() {
            return builder().build();
        }

        /**
         * @return activityId
         */
        public String getActivityId() {
            return this.activityId;
        }

        /**
         * @return activityInstanceStatus
         */
        public String getActivityInstanceStatus() {
            return this.activityInstanceStatus;
        }

        /**
         * @return activityName
         */
        public String getActivityName() {
            return this.activityName;
        }

        /**
         * @return activityNameInEnglish
         */
        public String getActivityNameInEnglish() {
            return this.activityNameInEnglish;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        public static final class Builder {
            private String activityId; 
            private String activityInstanceStatus; 
            private String activityName; 
            private String activityNameInEnglish; 
            private Long id; 

            /**
             * ActivityId.
             */
            public Builder activityId(String activityId) {
                this.activityId = activityId;
                return this;
            }

            /**
             * ActivityInstanceStatus.
             */
            public Builder activityInstanceStatus(String activityInstanceStatus) {
                this.activityInstanceStatus = activityInstanceStatus;
                return this;
            }

            /**
             * ActivityName.
             */
            public Builder activityName(String activityName) {
                this.activityName = activityName;
                return this;
            }

            /**
             * ActivityNameInEnglish.
             */
            public Builder activityNameInEnglish(String activityNameInEnglish) {
                this.activityNameInEnglish = activityNameInEnglish;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            public CurrentActivityInstances build() {
                return new CurrentActivityInstances(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActionExecutorId")
        private java.util.List < String > actionExecutorId;

        @com.aliyun.core.annotation.NameInMap("ActionExecutorName")
        private java.util.List < String > actionExecutorName;

        @com.aliyun.core.annotation.NameInMap("AppType")
        private String appType;

        @com.aliyun.core.annotation.NameInMap("CarbonActivityId")
        private String carbonActivityId;

        @com.aliyun.core.annotation.NameInMap("CreateTimeGMT")
        private String createTimeGMT;

        @com.aliyun.core.annotation.NameInMap("CurrentActivityInstances")
        private java.util.List < CurrentActivityInstances> currentActivityInstances;

        @com.aliyun.core.annotation.NameInMap("DataMap")
        private java.util.Map < String, ? > dataMap;

        @com.aliyun.core.annotation.NameInMap("DataType")
        private String dataType;

        @com.aliyun.core.annotation.NameInMap("FinishTimeGMT")
        private String finishTimeGMT;

        @com.aliyun.core.annotation.NameInMap("FormInstanceId")
        private String formInstanceId;

        @com.aliyun.core.annotation.NameInMap("FormUuid")
        private String formUuid;

        @com.aliyun.core.annotation.NameInMap("InstanceValue")
        private String instanceValue;

        @com.aliyun.core.annotation.NameInMap("ModifiedTimeGMT")
        private String modifiedTimeGMT;

        @com.aliyun.core.annotation.NameInMap("OriginatorAvatar")
        private String originatorAvatar;

        @com.aliyun.core.annotation.NameInMap("OriginatorDisplayName")
        private String originatorDisplayName;

        @com.aliyun.core.annotation.NameInMap("OriginatorId")
        private String originatorId;

        @com.aliyun.core.annotation.NameInMap("ProcessApprovedResult")
        private String processApprovedResult;

        @com.aliyun.core.annotation.NameInMap("ProcessApprovedResultText")
        private String processApprovedResultText;

        @com.aliyun.core.annotation.NameInMap("ProcessCode")
        private String processCode;

        @com.aliyun.core.annotation.NameInMap("ProcessId")
        private Long processId;

        @com.aliyun.core.annotation.NameInMap("ProcessInstanceId")
        private String processInstanceId;

        @com.aliyun.core.annotation.NameInMap("ProcessInstanceStatus")
        private String processInstanceStatus;

        @com.aliyun.core.annotation.NameInMap("ProcessInstanceStatusText")
        private String processInstanceStatusText;

        @com.aliyun.core.annotation.NameInMap("ProcessName")
        private String processName;

        @com.aliyun.core.annotation.NameInMap("SerialNumber")
        private String serialNumber;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Version")
        private Long version;

        private Data(Builder builder) {
            this.actionExecutorId = builder.actionExecutorId;
            this.actionExecutorName = builder.actionExecutorName;
            this.appType = builder.appType;
            this.carbonActivityId = builder.carbonActivityId;
            this.createTimeGMT = builder.createTimeGMT;
            this.currentActivityInstances = builder.currentActivityInstances;
            this.dataMap = builder.dataMap;
            this.dataType = builder.dataType;
            this.finishTimeGMT = builder.finishTimeGMT;
            this.formInstanceId = builder.formInstanceId;
            this.formUuid = builder.formUuid;
            this.instanceValue = builder.instanceValue;
            this.modifiedTimeGMT = builder.modifiedTimeGMT;
            this.originatorAvatar = builder.originatorAvatar;
            this.originatorDisplayName = builder.originatorDisplayName;
            this.originatorId = builder.originatorId;
            this.processApprovedResult = builder.processApprovedResult;
            this.processApprovedResultText = builder.processApprovedResultText;
            this.processCode = builder.processCode;
            this.processId = builder.processId;
            this.processInstanceId = builder.processInstanceId;
            this.processInstanceStatus = builder.processInstanceStatus;
            this.processInstanceStatusText = builder.processInstanceStatusText;
            this.processName = builder.processName;
            this.serialNumber = builder.serialNumber;
            this.title = builder.title;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return actionExecutorId
         */
        public java.util.List < String > getActionExecutorId() {
            return this.actionExecutorId;
        }

        /**
         * @return actionExecutorName
         */
        public java.util.List < String > getActionExecutorName() {
            return this.actionExecutorName;
        }

        /**
         * @return appType
         */
        public String getAppType() {
            return this.appType;
        }

        /**
         * @return carbonActivityId
         */
        public String getCarbonActivityId() {
            return this.carbonActivityId;
        }

        /**
         * @return createTimeGMT
         */
        public String getCreateTimeGMT() {
            return this.createTimeGMT;
        }

        /**
         * @return currentActivityInstances
         */
        public java.util.List < CurrentActivityInstances> getCurrentActivityInstances() {
            return this.currentActivityInstances;
        }

        /**
         * @return dataMap
         */
        public java.util.Map < String, ? > getDataMap() {
            return this.dataMap;
        }

        /**
         * @return dataType
         */
        public String getDataType() {
            return this.dataType;
        }

        /**
         * @return finishTimeGMT
         */
        public String getFinishTimeGMT() {
            return this.finishTimeGMT;
        }

        /**
         * @return formInstanceId
         */
        public String getFormInstanceId() {
            return this.formInstanceId;
        }

        /**
         * @return formUuid
         */
        public String getFormUuid() {
            return this.formUuid;
        }

        /**
         * @return instanceValue
         */
        public String getInstanceValue() {
            return this.instanceValue;
        }

        /**
         * @return modifiedTimeGMT
         */
        public String getModifiedTimeGMT() {
            return this.modifiedTimeGMT;
        }

        /**
         * @return originatorAvatar
         */
        public String getOriginatorAvatar() {
            return this.originatorAvatar;
        }

        /**
         * @return originatorDisplayName
         */
        public String getOriginatorDisplayName() {
            return this.originatorDisplayName;
        }

        /**
         * @return originatorId
         */
        public String getOriginatorId() {
            return this.originatorId;
        }

        /**
         * @return processApprovedResult
         */
        public String getProcessApprovedResult() {
            return this.processApprovedResult;
        }

        /**
         * @return processApprovedResultText
         */
        public String getProcessApprovedResultText() {
            return this.processApprovedResultText;
        }

        /**
         * @return processCode
         */
        public String getProcessCode() {
            return this.processCode;
        }

        /**
         * @return processId
         */
        public Long getProcessId() {
            return this.processId;
        }

        /**
         * @return processInstanceId
         */
        public String getProcessInstanceId() {
            return this.processInstanceId;
        }

        /**
         * @return processInstanceStatus
         */
        public String getProcessInstanceStatus() {
            return this.processInstanceStatus;
        }

        /**
         * @return processInstanceStatusText
         */
        public String getProcessInstanceStatusText() {
            return this.processInstanceStatusText;
        }

        /**
         * @return processName
         */
        public String getProcessName() {
            return this.processName;
        }

        /**
         * @return serialNumber
         */
        public String getSerialNumber() {
            return this.serialNumber;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return version
         */
        public Long getVersion() {
            return this.version;
        }

        public static final class Builder {
            private java.util.List < String > actionExecutorId; 
            private java.util.List < String > actionExecutorName; 
            private String appType; 
            private String carbonActivityId; 
            private String createTimeGMT; 
            private java.util.List < CurrentActivityInstances> currentActivityInstances; 
            private java.util.Map < String, ? > dataMap; 
            private String dataType; 
            private String finishTimeGMT; 
            private String formInstanceId; 
            private String formUuid; 
            private String instanceValue; 
            private String modifiedTimeGMT; 
            private String originatorAvatar; 
            private String originatorDisplayName; 
            private String originatorId; 
            private String processApprovedResult; 
            private String processApprovedResultText; 
            private String processCode; 
            private Long processId; 
            private String processInstanceId; 
            private String processInstanceStatus; 
            private String processInstanceStatusText; 
            private String processName; 
            private String serialNumber; 
            private String title; 
            private Long version; 

            /**
             * ActionExecutorId.
             */
            public Builder actionExecutorId(java.util.List < String > actionExecutorId) {
                this.actionExecutorId = actionExecutorId;
                return this;
            }

            /**
             * ActionExecutorName.
             */
            public Builder actionExecutorName(java.util.List < String > actionExecutorName) {
                this.actionExecutorName = actionExecutorName;
                return this;
            }

            /**
             * AppType.
             */
            public Builder appType(String appType) {
                this.appType = appType;
                return this;
            }

            /**
             * CarbonActivityId.
             */
            public Builder carbonActivityId(String carbonActivityId) {
                this.carbonActivityId = carbonActivityId;
                return this;
            }

            /**
             * CreateTimeGMT.
             */
            public Builder createTimeGMT(String createTimeGMT) {
                this.createTimeGMT = createTimeGMT;
                return this;
            }

            /**
             * CurrentActivityInstances.
             */
            public Builder currentActivityInstances(java.util.List < CurrentActivityInstances> currentActivityInstances) {
                this.currentActivityInstances = currentActivityInstances;
                return this;
            }

            /**
             * DataMap.
             */
            public Builder dataMap(java.util.Map < String, ? > dataMap) {
                this.dataMap = dataMap;
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
             * FinishTimeGMT.
             */
            public Builder finishTimeGMT(String finishTimeGMT) {
                this.finishTimeGMT = finishTimeGMT;
                return this;
            }

            /**
             * FormInstanceId.
             */
            public Builder formInstanceId(String formInstanceId) {
                this.formInstanceId = formInstanceId;
                return this;
            }

            /**
             * FormUuid.
             */
            public Builder formUuid(String formUuid) {
                this.formUuid = formUuid;
                return this;
            }

            /**
             * InstanceValue.
             */
            public Builder instanceValue(String instanceValue) {
                this.instanceValue = instanceValue;
                return this;
            }

            /**
             * ModifiedTimeGMT.
             */
            public Builder modifiedTimeGMT(String modifiedTimeGMT) {
                this.modifiedTimeGMT = modifiedTimeGMT;
                return this;
            }

            /**
             * OriginatorAvatar.
             */
            public Builder originatorAvatar(String originatorAvatar) {
                this.originatorAvatar = originatorAvatar;
                return this;
            }

            /**
             * OriginatorDisplayName.
             */
            public Builder originatorDisplayName(String originatorDisplayName) {
                this.originatorDisplayName = originatorDisplayName;
                return this;
            }

            /**
             * OriginatorId.
             */
            public Builder originatorId(String originatorId) {
                this.originatorId = originatorId;
                return this;
            }

            /**
             * ProcessApprovedResult.
             */
            public Builder processApprovedResult(String processApprovedResult) {
                this.processApprovedResult = processApprovedResult;
                return this;
            }

            /**
             * ProcessApprovedResultText.
             */
            public Builder processApprovedResultText(String processApprovedResultText) {
                this.processApprovedResultText = processApprovedResultText;
                return this;
            }

            /**
             * ProcessCode.
             */
            public Builder processCode(String processCode) {
                this.processCode = processCode;
                return this;
            }

            /**
             * ProcessId.
             */
            public Builder processId(Long processId) {
                this.processId = processId;
                return this;
            }

            /**
             * ProcessInstanceId.
             */
            public Builder processInstanceId(String processInstanceId) {
                this.processInstanceId = processInstanceId;
                return this;
            }

            /**
             * ProcessInstanceStatus.
             */
            public Builder processInstanceStatus(String processInstanceStatus) {
                this.processInstanceStatus = processInstanceStatus;
                return this;
            }

            /**
             * ProcessInstanceStatusText.
             */
            public Builder processInstanceStatusText(String processInstanceStatusText) {
                this.processInstanceStatusText = processInstanceStatusText;
                return this;
            }

            /**
             * ProcessName.
             */
            public Builder processName(String processName) {
                this.processName = processName;
                return this;
            }

            /**
             * SerialNumber.
             */
            public Builder serialNumber(String serialNumber) {
                this.serialNumber = serialNumber;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(Long version) {
                this.version = version;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
