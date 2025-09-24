// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeDBLogFilesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBLogFilesResponseBody</p>
 */
public class DescribeDBLogFilesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    private String DBInstanceName;

    @com.aliyun.core.annotation.NameInMap("DBInstanceType")
    private String DBInstanceType;

    @com.aliyun.core.annotation.NameInMap("HaLogItems")
    private java.util.List<HaLogItems> haLogItems;

    @com.aliyun.core.annotation.NameInMap("HaStatus")
    private Integer haStatus;

    @com.aliyun.core.annotation.NameInMap("ItemsNumbers")
    private Integer itemsNumbers;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SwitchListItems")
    private java.util.List<SwitchListItems> switchListItems;

    @com.aliyun.core.annotation.NameInMap("SwitchLogItems")
    private java.util.List<SwitchLogItems> switchLogItems;

    @com.aliyun.core.annotation.NameInMap("TotalRecords")
    private Integer totalRecords;

    private DescribeDBLogFilesResponseBody(Builder builder) {
        this.DBInstanceName = builder.DBInstanceName;
        this.DBInstanceType = builder.DBInstanceType;
        this.haLogItems = builder.haLogItems;
        this.haStatus = builder.haStatus;
        this.itemsNumbers = builder.itemsNumbers;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.switchListItems = builder.switchListItems;
        this.switchLogItems = builder.switchLogItems;
        this.totalRecords = builder.totalRecords;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBLogFilesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * @return DBInstanceType
     */
    public String getDBInstanceType() {
        return this.DBInstanceType;
    }

    /**
     * @return haLogItems
     */
    public java.util.List<HaLogItems> getHaLogItems() {
        return this.haLogItems;
    }

    /**
     * @return haStatus
     */
    public Integer getHaStatus() {
        return this.haStatus;
    }

    /**
     * @return itemsNumbers
     */
    public Integer getItemsNumbers() {
        return this.itemsNumbers;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
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
     * @return switchListItems
     */
    public java.util.List<SwitchListItems> getSwitchListItems() {
        return this.switchListItems;
    }

    /**
     * @return switchLogItems
     */
    public java.util.List<SwitchLogItems> getSwitchLogItems() {
        return this.switchLogItems;
    }

    /**
     * @return totalRecords
     */
    public Integer getTotalRecords() {
        return this.totalRecords;
    }

    public static final class Builder {
        private String DBInstanceName; 
        private String DBInstanceType; 
        private java.util.List<HaLogItems> haLogItems; 
        private Integer haStatus; 
        private Integer itemsNumbers; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List<SwitchListItems> switchListItems; 
        private java.util.List<SwitchLogItems> switchLogItems; 
        private Integer totalRecords; 

        private Builder() {
        } 

        private Builder(DescribeDBLogFilesResponseBody model) {
            this.DBInstanceName = model.DBInstanceName;
            this.DBInstanceType = model.DBInstanceType;
            this.haLogItems = model.haLogItems;
            this.haStatus = model.haStatus;
            this.itemsNumbers = model.itemsNumbers;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.switchListItems = model.switchListItems;
            this.switchLogItems = model.switchLogItems;
            this.totalRecords = model.totalRecords;
        } 

        /**
         * DBInstanceName.
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * DBInstanceType.
         */
        public Builder DBInstanceType(String DBInstanceType) {
            this.DBInstanceType = DBInstanceType;
            return this;
        }

        /**
         * HaLogItems.
         */
        public Builder haLogItems(java.util.List<HaLogItems> haLogItems) {
            this.haLogItems = haLogItems;
            return this;
        }

        /**
         * HaStatus.
         */
        public Builder haStatus(Integer haStatus) {
            this.haStatus = haStatus;
            return this;
        }

        /**
         * ItemsNumbers.
         */
        public Builder itemsNumbers(Integer itemsNumbers) {
            this.itemsNumbers = itemsNumbers;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * SwitchListItems.
         */
        public Builder switchListItems(java.util.List<SwitchListItems> switchListItems) {
            this.switchListItems = switchListItems;
            return this;
        }

        /**
         * SwitchLogItems.
         */
        public Builder switchLogItems(java.util.List<SwitchLogItems> switchLogItems) {
            this.switchLogItems = switchLogItems;
            return this;
        }

        /**
         * TotalRecords.
         */
        public Builder totalRecords(Integer totalRecords) {
            this.totalRecords = totalRecords;
            return this;
        }

        public DescribeDBLogFilesResponseBody build() {
            return new DescribeDBLogFilesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBLogFilesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBLogFilesResponseBody</p>
     */
    public static class HaLogItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AffectedSessions")
        private Long affectedSessions;

        @com.aliyun.core.annotation.NameInMap("FromDBType")
        private String fromDBType;

        @com.aliyun.core.annotation.NameInMap("SwitchCauseCode")
        private String switchCauseCode;

        @com.aliyun.core.annotation.NameInMap("SwitchCauseDetail")
        private String switchCauseDetail;

        @com.aliyun.core.annotation.NameInMap("SwitchFinishTime")
        private String switchFinishTime;

        @com.aliyun.core.annotation.NameInMap("SwitchId")
        private String switchId;

        @com.aliyun.core.annotation.NameInMap("SwitchStartTime")
        private String switchStartTime;

        @com.aliyun.core.annotation.NameInMap("SwitchType")
        private Long switchType;

        @com.aliyun.core.annotation.NameInMap("TotalSessions")
        private Long totalSessions;

        private HaLogItems(Builder builder) {
            this.affectedSessions = builder.affectedSessions;
            this.fromDBType = builder.fromDBType;
            this.switchCauseCode = builder.switchCauseCode;
            this.switchCauseDetail = builder.switchCauseDetail;
            this.switchFinishTime = builder.switchFinishTime;
            this.switchId = builder.switchId;
            this.switchStartTime = builder.switchStartTime;
            this.switchType = builder.switchType;
            this.totalSessions = builder.totalSessions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HaLogItems create() {
            return builder().build();
        }

        /**
         * @return affectedSessions
         */
        public Long getAffectedSessions() {
            return this.affectedSessions;
        }

        /**
         * @return fromDBType
         */
        public String getFromDBType() {
            return this.fromDBType;
        }

        /**
         * @return switchCauseCode
         */
        public String getSwitchCauseCode() {
            return this.switchCauseCode;
        }

        /**
         * @return switchCauseDetail
         */
        public String getSwitchCauseDetail() {
            return this.switchCauseDetail;
        }

        /**
         * @return switchFinishTime
         */
        public String getSwitchFinishTime() {
            return this.switchFinishTime;
        }

        /**
         * @return switchId
         */
        public String getSwitchId() {
            return this.switchId;
        }

        /**
         * @return switchStartTime
         */
        public String getSwitchStartTime() {
            return this.switchStartTime;
        }

        /**
         * @return switchType
         */
        public Long getSwitchType() {
            return this.switchType;
        }

        /**
         * @return totalSessions
         */
        public Long getTotalSessions() {
            return this.totalSessions;
        }

        public static final class Builder {
            private Long affectedSessions; 
            private String fromDBType; 
            private String switchCauseCode; 
            private String switchCauseDetail; 
            private String switchFinishTime; 
            private String switchId; 
            private String switchStartTime; 
            private Long switchType; 
            private Long totalSessions; 

            private Builder() {
            } 

            private Builder(HaLogItems model) {
                this.affectedSessions = model.affectedSessions;
                this.fromDBType = model.fromDBType;
                this.switchCauseCode = model.switchCauseCode;
                this.switchCauseDetail = model.switchCauseDetail;
                this.switchFinishTime = model.switchFinishTime;
                this.switchId = model.switchId;
                this.switchStartTime = model.switchStartTime;
                this.switchType = model.switchType;
                this.totalSessions = model.totalSessions;
            } 

            /**
             * AffectedSessions.
             */
            public Builder affectedSessions(Long affectedSessions) {
                this.affectedSessions = affectedSessions;
                return this;
            }

            /**
             * FromDBType.
             */
            public Builder fromDBType(String fromDBType) {
                this.fromDBType = fromDBType;
                return this;
            }

            /**
             * SwitchCauseCode.
             */
            public Builder switchCauseCode(String switchCauseCode) {
                this.switchCauseCode = switchCauseCode;
                return this;
            }

            /**
             * SwitchCauseDetail.
             */
            public Builder switchCauseDetail(String switchCauseDetail) {
                this.switchCauseDetail = switchCauseDetail;
                return this;
            }

            /**
             * SwitchFinishTime.
             */
            public Builder switchFinishTime(String switchFinishTime) {
                this.switchFinishTime = switchFinishTime;
                return this;
            }

            /**
             * SwitchId.
             */
            public Builder switchId(String switchId) {
                this.switchId = switchId;
                return this;
            }

            /**
             * SwitchStartTime.
             */
            public Builder switchStartTime(String switchStartTime) {
                this.switchStartTime = switchStartTime;
                return this;
            }

            /**
             * SwitchType.
             */
            public Builder switchType(Long switchType) {
                this.switchType = switchType;
                return this;
            }

            /**
             * TotalSessions.
             */
            public Builder totalSessions(Long totalSessions) {
                this.totalSessions = totalSessions;
                return this;
            }

            public HaLogItems build() {
                return new HaLogItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBLogFilesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBLogFilesResponseBody</p>
     */
    public static class SwitchStepItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("IsSuccess")
        private String isSuccess;

        @com.aliyun.core.annotation.NameInMap("SimulatePhase")
        private String simulatePhase;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("StepName")
        private String stepName;

        @com.aliyun.core.annotation.NameInMap("TimeCost")
        private String timeCost;

        private SwitchStepItems(Builder builder) {
            this.endTime = builder.endTime;
            this.isSuccess = builder.isSuccess;
            this.simulatePhase = builder.simulatePhase;
            this.startTime = builder.startTime;
            this.stepName = builder.stepName;
            this.timeCost = builder.timeCost;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SwitchStepItems create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return isSuccess
         */
        public String getIsSuccess() {
            return this.isSuccess;
        }

        /**
         * @return simulatePhase
         */
        public String getSimulatePhase() {
            return this.simulatePhase;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return stepName
         */
        public String getStepName() {
            return this.stepName;
        }

        /**
         * @return timeCost
         */
        public String getTimeCost() {
            return this.timeCost;
        }

        public static final class Builder {
            private String endTime; 
            private String isSuccess; 
            private String simulatePhase; 
            private String startTime; 
            private String stepName; 
            private String timeCost; 

            private Builder() {
            } 

            private Builder(SwitchStepItems model) {
                this.endTime = model.endTime;
                this.isSuccess = model.isSuccess;
                this.simulatePhase = model.simulatePhase;
                this.startTime = model.startTime;
                this.stepName = model.stepName;
                this.timeCost = model.timeCost;
            } 

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * IsSuccess.
             */
            public Builder isSuccess(String isSuccess) {
                this.isSuccess = isSuccess;
                return this;
            }

            /**
             * SimulatePhase.
             */
            public Builder simulatePhase(String simulatePhase) {
                this.simulatePhase = simulatePhase;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * StepName.
             */
            public Builder stepName(String stepName) {
                this.stepName = stepName;
                return this;
            }

            /**
             * TimeCost.
             */
            public Builder timeCost(String timeCost) {
                this.timeCost = timeCost;
                return this;
            }

            public SwitchStepItems build() {
                return new SwitchStepItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBLogFilesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBLogFilesResponseBody</p>
     */
    public static class SwitchListItemsSwitchLogItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstanceId")
        private String DBInstanceId;

        @com.aliyun.core.annotation.NameInMap("DstDbType")
        private String dstDbType;

        @com.aliyun.core.annotation.NameInMap("EventFinishTime")
        private String eventFinishTime;

        @com.aliyun.core.annotation.NameInMap("EventStartTime")
        private String eventStartTime;

        @com.aliyun.core.annotation.NameInMap("SimulateListId")
        private String simulateListId;

        @com.aliyun.core.annotation.NameInMap("SimulateLogId")
        private String simulateLogId;

        @com.aliyun.core.annotation.NameInMap("SimulateStatus")
        private String simulateStatus;

        @com.aliyun.core.annotation.NameInMap("SrcDbType")
        private String srcDbType;

        @com.aliyun.core.annotation.NameInMap("SwitchStepItems")
        private java.util.List<SwitchStepItems> switchStepItems;

        private SwitchListItemsSwitchLogItems(Builder builder) {
            this.DBInstanceId = builder.DBInstanceId;
            this.dstDbType = builder.dstDbType;
            this.eventFinishTime = builder.eventFinishTime;
            this.eventStartTime = builder.eventStartTime;
            this.simulateListId = builder.simulateListId;
            this.simulateLogId = builder.simulateLogId;
            this.simulateStatus = builder.simulateStatus;
            this.srcDbType = builder.srcDbType;
            this.switchStepItems = builder.switchStepItems;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SwitchListItemsSwitchLogItems create() {
            return builder().build();
        }

        /**
         * @return DBInstanceId
         */
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        /**
         * @return dstDbType
         */
        public String getDstDbType() {
            return this.dstDbType;
        }

        /**
         * @return eventFinishTime
         */
        public String getEventFinishTime() {
            return this.eventFinishTime;
        }

        /**
         * @return eventStartTime
         */
        public String getEventStartTime() {
            return this.eventStartTime;
        }

        /**
         * @return simulateListId
         */
        public String getSimulateListId() {
            return this.simulateListId;
        }

        /**
         * @return simulateLogId
         */
        public String getSimulateLogId() {
            return this.simulateLogId;
        }

        /**
         * @return simulateStatus
         */
        public String getSimulateStatus() {
            return this.simulateStatus;
        }

        /**
         * @return srcDbType
         */
        public String getSrcDbType() {
            return this.srcDbType;
        }

        /**
         * @return switchStepItems
         */
        public java.util.List<SwitchStepItems> getSwitchStepItems() {
            return this.switchStepItems;
        }

        public static final class Builder {
            private String DBInstanceId; 
            private String dstDbType; 
            private String eventFinishTime; 
            private String eventStartTime; 
            private String simulateListId; 
            private String simulateLogId; 
            private String simulateStatus; 
            private String srcDbType; 
            private java.util.List<SwitchStepItems> switchStepItems; 

            private Builder() {
            } 

            private Builder(SwitchListItemsSwitchLogItems model) {
                this.DBInstanceId = model.DBInstanceId;
                this.dstDbType = model.dstDbType;
                this.eventFinishTime = model.eventFinishTime;
                this.eventStartTime = model.eventStartTime;
                this.simulateListId = model.simulateListId;
                this.simulateLogId = model.simulateLogId;
                this.simulateStatus = model.simulateStatus;
                this.srcDbType = model.srcDbType;
                this.switchStepItems = model.switchStepItems;
            } 

            /**
             * DBInstanceId.
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * DstDbType.
             */
            public Builder dstDbType(String dstDbType) {
                this.dstDbType = dstDbType;
                return this;
            }

            /**
             * EventFinishTime.
             */
            public Builder eventFinishTime(String eventFinishTime) {
                this.eventFinishTime = eventFinishTime;
                return this;
            }

            /**
             * EventStartTime.
             */
            public Builder eventStartTime(String eventStartTime) {
                this.eventStartTime = eventStartTime;
                return this;
            }

            /**
             * SimulateListId.
             */
            public Builder simulateListId(String simulateListId) {
                this.simulateListId = simulateListId;
                return this;
            }

            /**
             * SimulateLogId.
             */
            public Builder simulateLogId(String simulateLogId) {
                this.simulateLogId = simulateLogId;
                return this;
            }

            /**
             * SimulateStatus.
             */
            public Builder simulateStatus(String simulateStatus) {
                this.simulateStatus = simulateStatus;
                return this;
            }

            /**
             * SrcDbType.
             */
            public Builder srcDbType(String srcDbType) {
                this.srcDbType = srcDbType;
                return this;
            }

            /**
             * SwitchStepItems.
             */
            public Builder switchStepItems(java.util.List<SwitchStepItems> switchStepItems) {
                this.switchStepItems = switchStepItems;
                return this;
            }

            public SwitchListItemsSwitchLogItems build() {
                return new SwitchListItemsSwitchLogItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBLogFilesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBLogFilesResponseBody</p>
     */
    public static class SwitchListItemsSwitchStepItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBNodeId")
        private String DBNodeId;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("IsSuccess")
        private String isSuccess;

        @com.aliyun.core.annotation.NameInMap("SimulatePhase")
        private String simulatePhase;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("StepName")
        private String stepName;

        @com.aliyun.core.annotation.NameInMap("TimeCost")
        private String timeCost;

        private SwitchListItemsSwitchStepItems(Builder builder) {
            this.DBNodeId = builder.DBNodeId;
            this.endTime = builder.endTime;
            this.isSuccess = builder.isSuccess;
            this.simulatePhase = builder.simulatePhase;
            this.startTime = builder.startTime;
            this.stepName = builder.stepName;
            this.timeCost = builder.timeCost;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SwitchListItemsSwitchStepItems create() {
            return builder().build();
        }

        /**
         * @return DBNodeId
         */
        public String getDBNodeId() {
            return this.DBNodeId;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return isSuccess
         */
        public String getIsSuccess() {
            return this.isSuccess;
        }

        /**
         * @return simulatePhase
         */
        public String getSimulatePhase() {
            return this.simulatePhase;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return stepName
         */
        public String getStepName() {
            return this.stepName;
        }

        /**
         * @return timeCost
         */
        public String getTimeCost() {
            return this.timeCost;
        }

        public static final class Builder {
            private String DBNodeId; 
            private String endTime; 
            private String isSuccess; 
            private String simulatePhase; 
            private String startTime; 
            private String stepName; 
            private String timeCost; 

            private Builder() {
            } 

            private Builder(SwitchListItemsSwitchStepItems model) {
                this.DBNodeId = model.DBNodeId;
                this.endTime = model.endTime;
                this.isSuccess = model.isSuccess;
                this.simulatePhase = model.simulatePhase;
                this.startTime = model.startTime;
                this.stepName = model.stepName;
                this.timeCost = model.timeCost;
            } 

            /**
             * DBNodeId.
             */
            public Builder DBNodeId(String DBNodeId) {
                this.DBNodeId = DBNodeId;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * IsSuccess.
             */
            public Builder isSuccess(String isSuccess) {
                this.isSuccess = isSuccess;
                return this;
            }

            /**
             * SimulatePhase.
             */
            public Builder simulatePhase(String simulatePhase) {
                this.simulatePhase = simulatePhase;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * StepName.
             */
            public Builder stepName(String stepName) {
                this.stepName = stepName;
                return this;
            }

            /**
             * TimeCost.
             */
            public Builder timeCost(String timeCost) {
                this.timeCost = timeCost;
                return this;
            }

            public SwitchListItemsSwitchStepItems build() {
                return new SwitchListItemsSwitchStepItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBLogFilesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBLogFilesResponseBody</p>
     */
    public static class SwitchListItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBNodeCrashList")
        private java.util.List<String> DBNodeCrashList;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("EventFinishTime")
        private String eventFinishTime;

        @com.aliyun.core.annotation.NameInMap("EventStartTime")
        private String eventStartTime;

        @com.aliyun.core.annotation.NameInMap("FaultInjectionType")
        private String faultInjectionType;

        @com.aliyun.core.annotation.NameInMap("SimulateListId")
        private String simulateListId;

        @com.aliyun.core.annotation.NameInMap("SimulateMode")
        private String simulateMode;

        @com.aliyun.core.annotation.NameInMap("SimulateStatus")
        private String simulateStatus;

        @com.aliyun.core.annotation.NameInMap("SimulateTaskId")
        private String simulateTaskId;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("SwitchLogItems")
        private java.util.List<SwitchListItemsSwitchLogItems> switchLogItems;

        @com.aliyun.core.annotation.NameInMap("SwitchStepItems")
        private java.util.List<SwitchListItemsSwitchStepItems> switchStepItems;

        private SwitchListItems(Builder builder) {
            this.DBNodeCrashList = builder.DBNodeCrashList;
            this.endTime = builder.endTime;
            this.eventFinishTime = builder.eventFinishTime;
            this.eventStartTime = builder.eventStartTime;
            this.faultInjectionType = builder.faultInjectionType;
            this.simulateListId = builder.simulateListId;
            this.simulateMode = builder.simulateMode;
            this.simulateStatus = builder.simulateStatus;
            this.simulateTaskId = builder.simulateTaskId;
            this.startTime = builder.startTime;
            this.switchLogItems = builder.switchLogItems;
            this.switchStepItems = builder.switchStepItems;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SwitchListItems create() {
            return builder().build();
        }

        /**
         * @return DBNodeCrashList
         */
        public java.util.List<String> getDBNodeCrashList() {
            return this.DBNodeCrashList;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return eventFinishTime
         */
        public String getEventFinishTime() {
            return this.eventFinishTime;
        }

        /**
         * @return eventStartTime
         */
        public String getEventStartTime() {
            return this.eventStartTime;
        }

        /**
         * @return faultInjectionType
         */
        public String getFaultInjectionType() {
            return this.faultInjectionType;
        }

        /**
         * @return simulateListId
         */
        public String getSimulateListId() {
            return this.simulateListId;
        }

        /**
         * @return simulateMode
         */
        public String getSimulateMode() {
            return this.simulateMode;
        }

        /**
         * @return simulateStatus
         */
        public String getSimulateStatus() {
            return this.simulateStatus;
        }

        /**
         * @return simulateTaskId
         */
        public String getSimulateTaskId() {
            return this.simulateTaskId;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return switchLogItems
         */
        public java.util.List<SwitchListItemsSwitchLogItems> getSwitchLogItems() {
            return this.switchLogItems;
        }

        /**
         * @return switchStepItems
         */
        public java.util.List<SwitchListItemsSwitchStepItems> getSwitchStepItems() {
            return this.switchStepItems;
        }

        public static final class Builder {
            private java.util.List<String> DBNodeCrashList; 
            private String endTime; 
            private String eventFinishTime; 
            private String eventStartTime; 
            private String faultInjectionType; 
            private String simulateListId; 
            private String simulateMode; 
            private String simulateStatus; 
            private String simulateTaskId; 
            private String startTime; 
            private java.util.List<SwitchListItemsSwitchLogItems> switchLogItems; 
            private java.util.List<SwitchListItemsSwitchStepItems> switchStepItems; 

            private Builder() {
            } 

            private Builder(SwitchListItems model) {
                this.DBNodeCrashList = model.DBNodeCrashList;
                this.endTime = model.endTime;
                this.eventFinishTime = model.eventFinishTime;
                this.eventStartTime = model.eventStartTime;
                this.faultInjectionType = model.faultInjectionType;
                this.simulateListId = model.simulateListId;
                this.simulateMode = model.simulateMode;
                this.simulateStatus = model.simulateStatus;
                this.simulateTaskId = model.simulateTaskId;
                this.startTime = model.startTime;
                this.switchLogItems = model.switchLogItems;
                this.switchStepItems = model.switchStepItems;
            } 

            /**
             * DBNodeCrashList.
             */
            public Builder DBNodeCrashList(java.util.List<String> DBNodeCrashList) {
                this.DBNodeCrashList = DBNodeCrashList;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * EventFinishTime.
             */
            public Builder eventFinishTime(String eventFinishTime) {
                this.eventFinishTime = eventFinishTime;
                return this;
            }

            /**
             * EventStartTime.
             */
            public Builder eventStartTime(String eventStartTime) {
                this.eventStartTime = eventStartTime;
                return this;
            }

            /**
             * FaultInjectionType.
             */
            public Builder faultInjectionType(String faultInjectionType) {
                this.faultInjectionType = faultInjectionType;
                return this;
            }

            /**
             * SimulateListId.
             */
            public Builder simulateListId(String simulateListId) {
                this.simulateListId = simulateListId;
                return this;
            }

            /**
             * SimulateMode.
             */
            public Builder simulateMode(String simulateMode) {
                this.simulateMode = simulateMode;
                return this;
            }

            /**
             * SimulateStatus.
             */
            public Builder simulateStatus(String simulateStatus) {
                this.simulateStatus = simulateStatus;
                return this;
            }

            /**
             * SimulateTaskId.
             */
            public Builder simulateTaskId(String simulateTaskId) {
                this.simulateTaskId = simulateTaskId;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * SwitchLogItems.
             */
            public Builder switchLogItems(java.util.List<SwitchListItemsSwitchLogItems> switchLogItems) {
                this.switchLogItems = switchLogItems;
                return this;
            }

            /**
             * SwitchStepItems.
             */
            public Builder switchStepItems(java.util.List<SwitchListItemsSwitchStepItems> switchStepItems) {
                this.switchStepItems = switchStepItems;
                return this;
            }

            public SwitchListItems build() {
                return new SwitchListItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBLogFilesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBLogFilesResponseBody</p>
     */
    public static class SwitchLogItemsSwitchStepItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBNodeId")
        private String DBNodeId;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("IsSuccess")
        private String isSuccess;

        @com.aliyun.core.annotation.NameInMap("SimulatePhase")
        private String simulatePhase;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("StepMsg")
        private String stepMsg;

        @com.aliyun.core.annotation.NameInMap("StepName")
        private String stepName;

        @com.aliyun.core.annotation.NameInMap("TimeCost")
        private String timeCost;

        private SwitchLogItemsSwitchStepItems(Builder builder) {
            this.DBNodeId = builder.DBNodeId;
            this.endTime = builder.endTime;
            this.isSuccess = builder.isSuccess;
            this.simulatePhase = builder.simulatePhase;
            this.startTime = builder.startTime;
            this.stepMsg = builder.stepMsg;
            this.stepName = builder.stepName;
            this.timeCost = builder.timeCost;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SwitchLogItemsSwitchStepItems create() {
            return builder().build();
        }

        /**
         * @return DBNodeId
         */
        public String getDBNodeId() {
            return this.DBNodeId;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return isSuccess
         */
        public String getIsSuccess() {
            return this.isSuccess;
        }

        /**
         * @return simulatePhase
         */
        public String getSimulatePhase() {
            return this.simulatePhase;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return stepMsg
         */
        public String getStepMsg() {
            return this.stepMsg;
        }

        /**
         * @return stepName
         */
        public String getStepName() {
            return this.stepName;
        }

        /**
         * @return timeCost
         */
        public String getTimeCost() {
            return this.timeCost;
        }

        public static final class Builder {
            private String DBNodeId; 
            private String endTime; 
            private String isSuccess; 
            private String simulatePhase; 
            private String startTime; 
            private String stepMsg; 
            private String stepName; 
            private String timeCost; 

            private Builder() {
            } 

            private Builder(SwitchLogItemsSwitchStepItems model) {
                this.DBNodeId = model.DBNodeId;
                this.endTime = model.endTime;
                this.isSuccess = model.isSuccess;
                this.simulatePhase = model.simulatePhase;
                this.startTime = model.startTime;
                this.stepMsg = model.stepMsg;
                this.stepName = model.stepName;
                this.timeCost = model.timeCost;
            } 

            /**
             * DBNodeId.
             */
            public Builder DBNodeId(String DBNodeId) {
                this.DBNodeId = DBNodeId;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * IsSuccess.
             */
            public Builder isSuccess(String isSuccess) {
                this.isSuccess = isSuccess;
                return this;
            }

            /**
             * SimulatePhase.
             */
            public Builder simulatePhase(String simulatePhase) {
                this.simulatePhase = simulatePhase;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * StepMsg.
             */
            public Builder stepMsg(String stepMsg) {
                this.stepMsg = stepMsg;
                return this;
            }

            /**
             * StepName.
             */
            public Builder stepName(String stepName) {
                this.stepName = stepName;
                return this;
            }

            /**
             * TimeCost.
             */
            public Builder timeCost(String timeCost) {
                this.timeCost = timeCost;
                return this;
            }

            public SwitchLogItemsSwitchStepItems build() {
                return new SwitchLogItemsSwitchStepItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBLogFilesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBLogFilesResponseBody</p>
     */
    public static class SwitchLogItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstanceId")
        private String DBInstanceId;

        @com.aliyun.core.annotation.NameInMap("DstDbType")
        private String dstDbType;

        @com.aliyun.core.annotation.NameInMap("EventFinishTime")
        private String eventFinishTime;

        @com.aliyun.core.annotation.NameInMap("EventStartTime")
        private String eventStartTime;

        @com.aliyun.core.annotation.NameInMap("SimulateListId")
        private String simulateListId;

        @com.aliyun.core.annotation.NameInMap("SimulateStatus")
        private String simulateStatus;

        @com.aliyun.core.annotation.NameInMap("Simulatecode")
        private String simulatecode;

        @com.aliyun.core.annotation.NameInMap("SrcDbType")
        private String srcDbType;

        @com.aliyun.core.annotation.NameInMap("SwitchStepItems")
        private java.util.List<SwitchLogItemsSwitchStepItems> switchStepItems;

        private SwitchLogItems(Builder builder) {
            this.DBInstanceId = builder.DBInstanceId;
            this.dstDbType = builder.dstDbType;
            this.eventFinishTime = builder.eventFinishTime;
            this.eventStartTime = builder.eventStartTime;
            this.simulateListId = builder.simulateListId;
            this.simulateStatus = builder.simulateStatus;
            this.simulatecode = builder.simulatecode;
            this.srcDbType = builder.srcDbType;
            this.switchStepItems = builder.switchStepItems;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SwitchLogItems create() {
            return builder().build();
        }

        /**
         * @return DBInstanceId
         */
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        /**
         * @return dstDbType
         */
        public String getDstDbType() {
            return this.dstDbType;
        }

        /**
         * @return eventFinishTime
         */
        public String getEventFinishTime() {
            return this.eventFinishTime;
        }

        /**
         * @return eventStartTime
         */
        public String getEventStartTime() {
            return this.eventStartTime;
        }

        /**
         * @return simulateListId
         */
        public String getSimulateListId() {
            return this.simulateListId;
        }

        /**
         * @return simulateStatus
         */
        public String getSimulateStatus() {
            return this.simulateStatus;
        }

        /**
         * @return simulatecode
         */
        public String getSimulatecode() {
            return this.simulatecode;
        }

        /**
         * @return srcDbType
         */
        public String getSrcDbType() {
            return this.srcDbType;
        }

        /**
         * @return switchStepItems
         */
        public java.util.List<SwitchLogItemsSwitchStepItems> getSwitchStepItems() {
            return this.switchStepItems;
        }

        public static final class Builder {
            private String DBInstanceId; 
            private String dstDbType; 
            private String eventFinishTime; 
            private String eventStartTime; 
            private String simulateListId; 
            private String simulateStatus; 
            private String simulatecode; 
            private String srcDbType; 
            private java.util.List<SwitchLogItemsSwitchStepItems> switchStepItems; 

            private Builder() {
            } 

            private Builder(SwitchLogItems model) {
                this.DBInstanceId = model.DBInstanceId;
                this.dstDbType = model.dstDbType;
                this.eventFinishTime = model.eventFinishTime;
                this.eventStartTime = model.eventStartTime;
                this.simulateListId = model.simulateListId;
                this.simulateStatus = model.simulateStatus;
                this.simulatecode = model.simulatecode;
                this.srcDbType = model.srcDbType;
                this.switchStepItems = model.switchStepItems;
            } 

            /**
             * DBInstanceId.
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * DstDbType.
             */
            public Builder dstDbType(String dstDbType) {
                this.dstDbType = dstDbType;
                return this;
            }

            /**
             * EventFinishTime.
             */
            public Builder eventFinishTime(String eventFinishTime) {
                this.eventFinishTime = eventFinishTime;
                return this;
            }

            /**
             * EventStartTime.
             */
            public Builder eventStartTime(String eventStartTime) {
                this.eventStartTime = eventStartTime;
                return this;
            }

            /**
             * SimulateListId.
             */
            public Builder simulateListId(String simulateListId) {
                this.simulateListId = simulateListId;
                return this;
            }

            /**
             * SimulateStatus.
             */
            public Builder simulateStatus(String simulateStatus) {
                this.simulateStatus = simulateStatus;
                return this;
            }

            /**
             * Simulatecode.
             */
            public Builder simulatecode(String simulatecode) {
                this.simulatecode = simulatecode;
                return this;
            }

            /**
             * SrcDbType.
             */
            public Builder srcDbType(String srcDbType) {
                this.srcDbType = srcDbType;
                return this;
            }

            /**
             * SwitchStepItems.
             */
            public Builder switchStepItems(java.util.List<SwitchLogItemsSwitchStepItems> switchStepItems) {
                this.switchStepItems = switchStepItems;
                return this;
            }

            public SwitchLogItems build() {
                return new SwitchLogItems(this);
            } 

        } 

    }
}
