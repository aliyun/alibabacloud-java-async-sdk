// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeDomainSecureAlarmListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainSecureAlarmListResponseBody</p>
 */
public class DescribeDomainSecureAlarmListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AlarmList")
    private java.util.List<AlarmList> alarmList;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alarmList
     */
    public java.util.List<AlarmList> getAlarmList() {
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
        private java.util.List<AlarmList> alarmList; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeDomainSecureAlarmListResponseBody model) {
            this.alarmList = model.alarmList;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The security alerts in your website assets.</p>
         */
        public Builder alarmList(java.util.List<AlarmList> alarmList) {
            this.alarmList = alarmList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D03DD0FD-6041-5107-AC00-383E28F1****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>42</p>
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

            private Builder() {
            } 

            private Builder(AlarmList model) {
                this.alarmEventName = model.alarmEventName;
                this.alarmEventNameOriginal = model.alarmEventNameOriginal;
                this.alarmEventType = model.alarmEventType;
                this.alarmUniqueInfo = model.alarmUniqueInfo;
                this.autoBreaking = model.autoBreaking;
                this.canBeDealOnLine = model.canBeDealOnLine;
                this.canCancelFault = model.canCancelFault;
                this.containHwMode = model.containHwMode;
                this.dataSource = model.dataSource;
                this.dealed = model.dealed;
                this.description = model.description;
                this.endTime = model.endTime;
                this.gmtModified = model.gmtModified;
                this.hasTraceInfo = model.hasTraceInfo;
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
                this.internetIp = model.internetIp;
                this.intranetIp = model.intranetIp;
                this.level = model.level;
                this.operateErrorCode = model.operateErrorCode;
                this.operateTime = model.operateTime;
                this.saleVersion = model.saleVersion;
                this.securityEventIds = model.securityEventIds;
                this.solution = model.solution;
                this.stages = model.stages;
                this.startTime = model.startTime;
                this.suspiciousEventCount = model.suspiciousEventCount;
                this.uuid = model.uuid;
            } 

            /**
             * <p>The name of the alert event.</p>
             * 
             * <strong>example:</strong>
             * <p>Trojan</p>
             */
            public Builder alarmEventName(String alarmEventName) {
                this.alarmEventName = alarmEventName;
                return this;
            }

            /**
             * <p>The original parent name of the alert event.</p>
             * 
             * <strong>example:</strong>
             * <p>login_common_location</p>
             */
            public Builder alarmEventNameOriginal(String alarmEventNameOriginal) {
                this.alarmEventNameOriginal = alarmEventNameOriginal;
                return this;
            }

            /**
             * <p>The type of the alert event.</p>
             * 
             * <strong>example:</strong>
             * <p>Malicious Software</p>
             */
            public Builder alarmEventType(String alarmEventType) {
                this.alarmEventType = alarmEventType;
                return this;
            }

            /**
             * <p>The unique ID of the alert event.</p>
             * 
             * <strong>example:</strong>
             * <p>8df914418f4211fbf756efe7a6f4****</p>
             */
            public Builder alarmUniqueInfo(String alarmUniqueInfo) {
                this.alarmUniqueInfo = alarmUniqueInfo;
                return this;
            }

            /**
             * <p>Indicates whether automatic defense is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoBreaking(Boolean autoBreaking) {
                this.autoBreaking = autoBreaking;
                return this;
            }

            /**
             * <p>Indicates whether the alert event can be handled online, such as quarantining the source file of the malicious process, adding the alert event to the whitelist, and ignoring the alert event. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder canBeDealOnLine(Boolean canBeDealOnLine) {
                this.canBeDealOnLine = canBeDealOnLine;
                return this;
            }

            /**
             * <p>Indicates whether you can cancel marking the alert event as a false positive. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder canCancelFault(Boolean canCancelFault) {
                this.canCancelFault = canCancelFault;
                return this;
            }

            /**
             * <p>Indicates whether the safeguard mode for major activities is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder containHwMode(Boolean containHwMode) {
                this.containHwMode = containHwMode;
                return this;
            }

            /**
             * <p>The data source of the alert event.</p>
             * 
             * <strong>example:</strong>
             * <p>aegis_****</p>
             */
            public Builder dataSource(String dataSource) {
                this.dataSource = dataSource;
                return this;
            }

            /**
             * <p>Indicates whether the alert event is handled. Valid values:</p>
             * <ul>
             * <li><strong>N</strong>: unhandled</li>
             * <li><strong>Y</strong>: handled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>y</p>
             */
            public Builder dealed(Boolean dealed) {
                this.dealed = dealed;
                return this;
            }

            /**
             * <p>The description of the alert event.</p>
             * 
             * <strong>example:</strong>
             * <p>The detection model finds that there is a Trojan horse program on your server. The Trojan horse program is a program specially used to invade the user&quot;s host. Generally, it will download and release another malicious program after being implanted into the system through disguise.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The timestamp generated when the alert event was last detected. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1543740301000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The time of the last modification.</p>
             * 
             * <strong>example:</strong>
             * <p>1656901794000</p>
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>Indicates whether the alert event has tracing information. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hasTraceInfo(Boolean hasTraceInfo) {
                this.hasTraceInfo = hasTraceInfo;
                return this;
            }

            /**
             * <p>The instance ID of the affected asset.</p>
             * 
             * <strong>example:</strong>
             * <p>i-e****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The instance name of the affected asset.</p>
             * 
             * <strong>example:</strong>
             * <p>TestInstance</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The public IP address of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>95.214.<em>.</em></p>
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * <p>The private IP address of the affected instance.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * <p>The risk level of the alert event. Valid values:</p>
             * <ul>
             * <li><strong>serious</strong></li>
             * <li><strong>suspicious</strong></li>
             * <li><strong>remind</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>serious</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The handling result code of the alert event.</p>
             * 
             * <strong>example:</strong>
             * <p>kill_and_quara.Success</p>
             */
            public Builder operateErrorCode(String operateErrorCode) {
                this.operateErrorCode = operateErrorCode;
                return this;
            }

            /**
             * <p>The timestamp generated when the alert event was handled. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1631699497000</p>
             */
            public Builder operateTime(Long operateTime) {
                this.operateTime = operateTime;
                return this;
            }

            /**
             * <p>The edition of Security Center in which the alert event can be detected. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Basic edition.</li>
             * <li><strong>1</strong>: Advanced edition.</li>
             * <li><strong>2</strong>: Enterprise edition.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder saleVersion(String saleVersion) {
                this.saleVersion = saleVersion;
                return this;
            }

            /**
             * <p>The ID of the associated alert event.</p>
             * 
             * <strong>example:</strong>
             * <p>270789</p>
             */
            public Builder securityEventIds(String securityEventIds) {
                this.securityEventIds = securityEventIds;
                return this;
            }

            /**
             * <p>The solution to the alert event.</p>
             * 
             * <strong>example:</strong>
             * <p>A malicious program implanted by hacker after intrusion will occupy your bandwidth and attack other servers, and may affect you own service. The malicious process may also have self-deleting behavior or disguise as a system service to evade detection.</p>
             */
            public Builder solution(String solution) {
                this.solution = solution;
                return this;
            }

            /**
             * <p>The stage at which the attack or intrusion is detected.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;authority_maintenance&quot;]</p>
             */
            public Builder stages(String stages) {
                this.stages = stages;
                return this;
            }

            /**
             * <p>The timestamp generated when the alert event was first detected. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1543740301000</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The total number of security alerts in your website assets.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder suspiciousEventCount(Integer suspiciousEventCount) {
                this.suspiciousEventCount = suspiciousEventCount;
                return this;
            }

            /**
             * <p>The unique ID of the associated instance.</p>
             * 
             * <strong>example:</strong>
             * <p>47900178-885d-4fa4-9d77-****</p>
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
