// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDomainSecureAlarmListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainSecureAlarmListResponseBody</p>
 */
public class DescribeDomainSecureAlarmListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AlarmList")
    private java.util.List < AlarmList> alarmList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDomainSecureAlarmListResponseBody(Builder builder) {
        this.alarmList = builder.alarmList;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainSecureAlarmListResponseBody create() {
        return builder().build();
    }

    /**
     * @return alarmList
     */
    public java.util.List < AlarmList> getAlarmList() {
        return this.alarmList;
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < AlarmList> alarmList; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * AlarmList.
         */
        public Builder alarmList(java.util.List < AlarmList> alarmList) {
            this.alarmList = alarmList;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDomainSecureAlarmListResponseBody build() {
            return new DescribeDomainSecureAlarmListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDomainSecureAlarmListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainSecureAlarmListResponseBody</p>
     */
    public static class AlarmList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlarmEventName")
        private String alarmEventName;

        @com.aliyun.core.annotation.NameInMap("AlarmEventNameOriginal")
        private String alarmEventNameOriginal;

        @com.aliyun.core.annotation.NameInMap("AlarmEventType")
        private String alarmEventType;

        @com.aliyun.core.annotation.NameInMap("AlarmUniqueInfo")
        private String alarmUniqueInfo;

        @com.aliyun.core.annotation.NameInMap("AutoBreaking")
        private Boolean autoBreaking;

        @com.aliyun.core.annotation.NameInMap("CanBeDealOnLine")
        private Boolean canBeDealOnLine;

        @com.aliyun.core.annotation.NameInMap("CanCancelFault")
        private Boolean canCancelFault;

        @com.aliyun.core.annotation.NameInMap("ContainHwMode")
        private Boolean containHwMode;

        @com.aliyun.core.annotation.NameInMap("DataSource")
        private String dataSource;

        @com.aliyun.core.annotation.NameInMap("Dealed")
        private Boolean dealed;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("HasTraceInfo")
        private Boolean hasTraceInfo;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InternetIp")
        private String internetIp;

        @com.aliyun.core.annotation.NameInMap("IntranetIp")
        private String intranetIp;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("OperateErrorCode")
        private String operateErrorCode;

        @com.aliyun.core.annotation.NameInMap("OperateTime")
        private Long operateTime;

        @com.aliyun.core.annotation.NameInMap("SaleVersion")
        private String saleVersion;

        @com.aliyun.core.annotation.NameInMap("SecurityEventIds")
        private String securityEventIds;

        @com.aliyun.core.annotation.NameInMap("Solution")
        private String solution;

        @com.aliyun.core.annotation.NameInMap("Stages")
        private String stages;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("SuspiciousEventCount")
        private Integer suspiciousEventCount;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private AlarmList(Builder builder) {
            this.alarmEventName = builder.alarmEventName;
            this.alarmEventNameOriginal = builder.alarmEventNameOriginal;
            this.alarmEventType = builder.alarmEventType;
            this.alarmUniqueInfo = builder.alarmUniqueInfo;
            this.autoBreaking = builder.autoBreaking;
            this.canBeDealOnLine = builder.canBeDealOnLine;
            this.canCancelFault = builder.canCancelFault;
            this.containHwMode = builder.containHwMode;
            this.dataSource = builder.dataSource;
            this.dealed = builder.dealed;
            this.description = builder.description;
            this.endTime = builder.endTime;
            this.gmtModified = builder.gmtModified;
            this.hasTraceInfo = builder.hasTraceInfo;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.internetIp = builder.internetIp;
            this.intranetIp = builder.intranetIp;
            this.level = builder.level;
            this.operateErrorCode = builder.operateErrorCode;
            this.operateTime = builder.operateTime;
            this.saleVersion = builder.saleVersion;
            this.securityEventIds = builder.securityEventIds;
            this.solution = builder.solution;
            this.stages = builder.stages;
            this.startTime = builder.startTime;
            this.suspiciousEventCount = builder.suspiciousEventCount;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlarmList create() {
            return builder().build();
        }

        /**
         * @return alarmEventName
         */
        public String getAlarmEventName() {
            return this.alarmEventName;
        }

        /**
         * @return alarmEventNameOriginal
         */
        public String getAlarmEventNameOriginal() {
            return this.alarmEventNameOriginal;
        }

        /**
         * @return alarmEventType
         */
        public String getAlarmEventType() {
            return this.alarmEventType;
        }

        /**
         * @return alarmUniqueInfo
         */
        public String getAlarmUniqueInfo() {
            return this.alarmUniqueInfo;
        }

        /**
         * @return autoBreaking
         */
        public Boolean getAutoBreaking() {
            return this.autoBreaking;
        }

        /**
         * @return canBeDealOnLine
         */
        public Boolean getCanBeDealOnLine() {
            return this.canBeDealOnLine;
        }

        /**
         * @return canCancelFault
         */
        public Boolean getCanCancelFault() {
            return this.canCancelFault;
        }

        /**
         * @return containHwMode
         */
        public Boolean getContainHwMode() {
            return this.containHwMode;
        }

        /**
         * @return dataSource
         */
        public String getDataSource() {
            return this.dataSource;
        }

        /**
         * @return dealed
         */
        public Boolean getDealed() {
            return this.dealed;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return hasTraceInfo
         */
        public Boolean getHasTraceInfo() {
            return this.hasTraceInfo;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return internetIp
         */
        public String getInternetIp() {
            return this.internetIp;
        }

        /**
         * @return intranetIp
         */
        public String getIntranetIp() {
            return this.intranetIp;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return operateErrorCode
         */
        public String getOperateErrorCode() {
            return this.operateErrorCode;
        }

        /**
         * @return operateTime
         */
        public Long getOperateTime() {
            return this.operateTime;
        }

        /**
         * @return saleVersion
         */
        public String getSaleVersion() {
            return this.saleVersion;
        }

        /**
         * @return securityEventIds
         */
        public String getSecurityEventIds() {
            return this.securityEventIds;
        }

        /**
         * @return solution
         */
        public String getSolution() {
            return this.solution;
        }

        /**
         * @return stages
         */
        public String getStages() {
            return this.stages;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return suspiciousEventCount
         */
        public Integer getSuspiciousEventCount() {
            return this.suspiciousEventCount;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String alarmEventName; 
            private String alarmEventNameOriginal; 
            private String alarmEventType; 
            private String alarmUniqueInfo; 
            private Boolean autoBreaking; 
            private Boolean canBeDealOnLine; 
            private Boolean canCancelFault; 
            private Boolean containHwMode; 
            private String dataSource; 
            private Boolean dealed; 
            private String description; 
            private Long endTime; 
            private Long gmtModified; 
            private Boolean hasTraceInfo; 
            private String instanceId; 
            private String instanceName; 
            private String internetIp; 
            private String intranetIp; 
            private String level; 
            private String operateErrorCode; 
            private Long operateTime; 
            private String saleVersion; 
            private String securityEventIds; 
            private String solution; 
            private String stages; 
            private Long startTime; 
            private Integer suspiciousEventCount; 
            private String uuid; 

            /**
             * AlarmEventName.
             */
            public Builder alarmEventName(String alarmEventName) {
                this.alarmEventName = alarmEventName;
                return this;
            }

            /**
             * AlarmEventNameOriginal.
             */
            public Builder alarmEventNameOriginal(String alarmEventNameOriginal) {
                this.alarmEventNameOriginal = alarmEventNameOriginal;
                return this;
            }

            /**
             * AlarmEventType.
             */
            public Builder alarmEventType(String alarmEventType) {
                this.alarmEventType = alarmEventType;
                return this;
            }

            /**
             * AlarmUniqueInfo.
             */
            public Builder alarmUniqueInfo(String alarmUniqueInfo) {
                this.alarmUniqueInfo = alarmUniqueInfo;
                return this;
            }

            /**
             * AutoBreaking.
             */
            public Builder autoBreaking(Boolean autoBreaking) {
                this.autoBreaking = autoBreaking;
                return this;
            }

            /**
             * CanBeDealOnLine.
             */
            public Builder canBeDealOnLine(Boolean canBeDealOnLine) {
                this.canBeDealOnLine = canBeDealOnLine;
                return this;
            }

            /**
             * CanCancelFault.
             */
            public Builder canCancelFault(Boolean canCancelFault) {
                this.canCancelFault = canCancelFault;
                return this;
            }

            /**
             * ContainHwMode.
             */
            public Builder containHwMode(Boolean containHwMode) {
                this.containHwMode = containHwMode;
                return this;
            }

            /**
             * DataSource.
             */
            public Builder dataSource(String dataSource) {
                this.dataSource = dataSource;
                return this;
            }

            /**
             * Dealed.
             */
            public Builder dealed(Boolean dealed) {
                this.dealed = dealed;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * HasTraceInfo.
             */
            public Builder hasTraceInfo(Boolean hasTraceInfo) {
                this.hasTraceInfo = hasTraceInfo;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * InternetIp.
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * IntranetIp.
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * Level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * OperateErrorCode.
             */
            public Builder operateErrorCode(String operateErrorCode) {
                this.operateErrorCode = operateErrorCode;
                return this;
            }

            /**
             * OperateTime.
             */
            public Builder operateTime(Long operateTime) {
                this.operateTime = operateTime;
                return this;
            }

            /**
             * SaleVersion.
             */
            public Builder saleVersion(String saleVersion) {
                this.saleVersion = saleVersion;
                return this;
            }

            /**
             * SecurityEventIds.
             */
            public Builder securityEventIds(String securityEventIds) {
                this.securityEventIds = securityEventIds;
                return this;
            }

            /**
             * Solution.
             */
            public Builder solution(String solution) {
                this.solution = solution;
                return this;
            }

            /**
             * Stages.
             */
            public Builder stages(String stages) {
                this.stages = stages;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * SuspiciousEventCount.
             */
            public Builder suspiciousEventCount(Integer suspiciousEventCount) {
                this.suspiciousEventCount = suspiciousEventCount;
                return this;
            }

            /**
             * Uuid.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public AlarmList build() {
                return new AlarmList(this);
            } 

        } 

    }
}
