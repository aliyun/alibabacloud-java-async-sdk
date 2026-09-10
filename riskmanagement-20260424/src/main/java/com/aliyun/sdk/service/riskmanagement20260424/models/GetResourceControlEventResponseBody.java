// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.riskmanagement20260424.models;

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
 * {@link GetResourceControlEventResponseBody} extends {@link TeaModel}
 *
 * <p>GetResourceControlEventResponseBody</p>
 */
public class GetResourceControlEventResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetResourceControlEventResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceControlEventResponseBody create() {
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
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetResourceControlEventResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data list.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The prompt message.</p>
         * 
         * <strong>example:</strong>
         * <p>successful‌</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6B57D35D-9DAC-5393-AE39-07697E37C2E7</p>
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

        public GetResourceControlEventResponseBody build() {
            return new GetResourceControlEventResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetResourceControlEventResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourceControlEventResponseBody</p>
     */
    public static class EventTimeRecord extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertEndTime")
        private String alertEndTime;

        @com.aliyun.core.annotation.NameInMap("AlertStartTime")
        private String alertStartTime;

        @com.aliyun.core.annotation.NameInMap("AntiPunishTime")
        private String antiPunishTime;

        @com.aliyun.core.annotation.NameInMap("ApplyTime")
        private String applyTime;

        @com.aliyun.core.annotation.NameInMap("IgnoreAlertTime")
        private String ignoreAlertTime;

        @com.aliyun.core.annotation.NameInMap("InstanceCloseTime")
        private String instanceCloseTime;

        @com.aliyun.core.annotation.NameInMap("InstanceScanTime")
        private String instanceScanTime;

        @com.aliyun.core.annotation.NameInMap("LastCheckTime")
        private String lastCheckTime;

        @com.aliyun.core.annotation.NameInMap("MiningAlertProcessTime")
        private String miningAlertProcessTime;

        @com.aliyun.core.annotation.NameInMap("PreCloseTime")
        private String preCloseTime;

        @com.aliyun.core.annotation.NameInMap("ProcessTime")
        private String processTime;

        @com.aliyun.core.annotation.NameInMap("PunishEndTime")
        private String punishEndTime;

        @com.aliyun.core.annotation.NameInMap("PunishStartTime")
        private String punishStartTime;

        @com.aliyun.core.annotation.NameInMap("RejectTime")
        private String rejectTime;

        @com.aliyun.core.annotation.NameInMap("RemoveTime")
        private String removeTime;

        @com.aliyun.core.annotation.NameInMap("RiskCheckSuccessTime")
        private String riskCheckSuccessTime;

        private EventTimeRecord(Builder builder) {
            this.alertEndTime = builder.alertEndTime;
            this.alertStartTime = builder.alertStartTime;
            this.antiPunishTime = builder.antiPunishTime;
            this.applyTime = builder.applyTime;
            this.ignoreAlertTime = builder.ignoreAlertTime;
            this.instanceCloseTime = builder.instanceCloseTime;
            this.instanceScanTime = builder.instanceScanTime;
            this.lastCheckTime = builder.lastCheckTime;
            this.miningAlertProcessTime = builder.miningAlertProcessTime;
            this.preCloseTime = builder.preCloseTime;
            this.processTime = builder.processTime;
            this.punishEndTime = builder.punishEndTime;
            this.punishStartTime = builder.punishStartTime;
            this.rejectTime = builder.rejectTime;
            this.removeTime = builder.removeTime;
            this.riskCheckSuccessTime = builder.riskCheckSuccessTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventTimeRecord create() {
            return builder().build();
        }

        /**
         * @return alertEndTime
         */
        public String getAlertEndTime() {
            return this.alertEndTime;
        }

        /**
         * @return alertStartTime
         */
        public String getAlertStartTime() {
            return this.alertStartTime;
        }

        /**
         * @return antiPunishTime
         */
        public String getAntiPunishTime() {
            return this.antiPunishTime;
        }

        /**
         * @return applyTime
         */
        public String getApplyTime() {
            return this.applyTime;
        }

        /**
         * @return ignoreAlertTime
         */
        public String getIgnoreAlertTime() {
            return this.ignoreAlertTime;
        }

        /**
         * @return instanceCloseTime
         */
        public String getInstanceCloseTime() {
            return this.instanceCloseTime;
        }

        /**
         * @return instanceScanTime
         */
        public String getInstanceScanTime() {
            return this.instanceScanTime;
        }

        /**
         * @return lastCheckTime
         */
        public String getLastCheckTime() {
            return this.lastCheckTime;
        }

        /**
         * @return miningAlertProcessTime
         */
        public String getMiningAlertProcessTime() {
            return this.miningAlertProcessTime;
        }

        /**
         * @return preCloseTime
         */
        public String getPreCloseTime() {
            return this.preCloseTime;
        }

        /**
         * @return processTime
         */
        public String getProcessTime() {
            return this.processTime;
        }

        /**
         * @return punishEndTime
         */
        public String getPunishEndTime() {
            return this.punishEndTime;
        }

        /**
         * @return punishStartTime
         */
        public String getPunishStartTime() {
            return this.punishStartTime;
        }

        /**
         * @return rejectTime
         */
        public String getRejectTime() {
            return this.rejectTime;
        }

        /**
         * @return removeTime
         */
        public String getRemoveTime() {
            return this.removeTime;
        }

        /**
         * @return riskCheckSuccessTime
         */
        public String getRiskCheckSuccessTime() {
            return this.riskCheckSuccessTime;
        }

        public static final class Builder {
            private String alertEndTime; 
            private String alertStartTime; 
            private String antiPunishTime; 
            private String applyTime; 
            private String ignoreAlertTime; 
            private String instanceCloseTime; 
            private String instanceScanTime; 
            private String lastCheckTime; 
            private String miningAlertProcessTime; 
            private String preCloseTime; 
            private String processTime; 
            private String punishEndTime; 
            private String punishStartTime; 
            private String rejectTime; 
            private String removeTime; 
            private String riskCheckSuccessTime; 

            private Builder() {
            } 

            private Builder(EventTimeRecord model) {
                this.alertEndTime = model.alertEndTime;
                this.alertStartTime = model.alertStartTime;
                this.antiPunishTime = model.antiPunishTime;
                this.applyTime = model.applyTime;
                this.ignoreAlertTime = model.ignoreAlertTime;
                this.instanceCloseTime = model.instanceCloseTime;
                this.instanceScanTime = model.instanceScanTime;
                this.lastCheckTime = model.lastCheckTime;
                this.miningAlertProcessTime = model.miningAlertProcessTime;
                this.preCloseTime = model.preCloseTime;
                this.processTime = model.processTime;
                this.punishEndTime = model.punishEndTime;
                this.punishStartTime = model.punishStartTime;
                this.rejectTime = model.rejectTime;
                this.removeTime = model.removeTime;
                this.riskCheckSuccessTime = model.riskCheckSuccessTime;
            } 

            /**
             * <p>The time when the alert ended.</p>
             * <blockquote>
             * <p>Format: yyyy-MM-dd HH:mm:ss</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2026-03-16 15:15:00</p>
             */
            public Builder alertEndTime(String alertEndTime) {
                this.alertEndTime = alertEndTime;
                return this;
            }

            /**
             * <p>The time when the first alert was triggered.</p>
             * <blockquote>
             * <p>Format: yyyy-MM-dd HH:mm:ss</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2026-03-16 15:15:00</p>
             */
            public Builder alertStartTime(String alertStartTime) {
                this.alertStartTime = alertStartTime;
                return this;
            }

            /**
             * <p>The time when the control action was lifted.</p>
             * <blockquote>
             * <p>Format: yyyy-MM-dd HH:mm:ss</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2026-03-16 15:15:00</p>
             */
            public Builder antiPunishTime(String antiPunishTime) {
                this.antiPunishTime = antiPunishTime;
                return this;
            }

            /**
             * <p>The application time.</p>
             * <blockquote>
             * <p>Format: yyyy-MM-dd HH:mm:ss</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2025-08-21T02:26:50Z</p>
             */
            public Builder applyTime(String applyTime) {
                this.applyTime = applyTime;
                return this;
            }

            /**
             * <p>The time when the alert was ignored.</p>
             * <blockquote>
             * <p>Format: yyyy-MM-dd HH:mm:ss</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2026-03-16 15:15:00</p>
             */
            public Builder ignoreAlertTime(String ignoreAlertTime) {
                this.ignoreAlertTime = ignoreAlertTime;
                return this;
            }

            /**
             * <p>The time when the instance was shut down.</p>
             * <blockquote>
             * <p>Format: yyyy-MM-dd HH:mm:ss</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2026-03-16 15:15:00</p>
             */
            public Builder instanceCloseTime(String instanceCloseTime) {
                this.instanceCloseTime = instanceCloseTime;
                return this;
            }

            /**
             * <p>The time when the instance was scanned.</p>
             * <blockquote>
             * <p>Format: yyyy-MM-dd HH:mm:ss</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2026-03-16 15:15:00</p>
             */
            public Builder instanceScanTime(String instanceScanTime) {
                this.instanceScanTime = instanceScanTime;
                return this;
            }

            /**
             * <p>The time of the latest detection.</p>
             * <blockquote>
             * <p>Format: yyyy-MM-dd HH:mm:ss</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2026-03-16 15:15:00</p>
             */
            public Builder lastCheckTime(String lastCheckTime) {
                this.lastCheckTime = lastCheckTime;
                return this;
            }

            /**
             * <p>The time when the mining alert was processed.</p>
             * <blockquote>
             * <p>Format: yyyy-MM-dd HH:mm:ss</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2026-03-16 15:15:00</p>
             */
            public Builder miningAlertProcessTime(String miningAlertProcessTime) {
                this.miningAlertProcessTime = miningAlertProcessTime;
                return this;
            }

            /**
             * <p>The estimated shutdown time.</p>
             * <blockquote>
             * <p>Format: yyyy-MM-dd HH:mm:ss</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2026-03-16 15:15:00</p>
             */
            public Builder preCloseTime(String preCloseTime) {
                this.preCloseTime = preCloseTime;
                return this;
            }

            /**
             * <p>The processing time.</p>
             * <blockquote>
             * <p>Format: yyyy-MM-dd HH:mm:ss</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2025-11-05 10:06:21</p>
             */
            public Builder processTime(String processTime) {
                this.processTime = processTime;
                return this;
            }

            /**
             * <p>The time when the control action ended.</p>
             * <blockquote>
             * <p>Format: yyyy-MM-dd HH:mm:ss</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2026-03-16 15:15:00</p>
             */
            public Builder punishEndTime(String punishEndTime) {
                this.punishEndTime = punishEndTime;
                return this;
            }

            /**
             * <p>The time when the control action started.</p>
             * <blockquote>
             * <p>Format: yyyy-MM-dd HH:mm:ss</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2026-03-16 15:15:00</p>
             */
            public Builder punishStartTime(String punishStartTime) {
                this.punishStartTime = punishStartTime;
                return this;
            }

            /**
             * <p>The rejection time.</p>
             * <blockquote>
             * <p>Format: yyyy-MM-dd HH:mm:ss</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2026-03-16 15:15:00</p>
             */
            public Builder rejectTime(String rejectTime) {
                this.rejectTime = rejectTime;
                return this;
            }

            /**
             * <p>The removal time.</p>
             * <blockquote>
             * <p>Format: yyyy-MM-dd HH:mm:ss</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2026-03-16 15:15:00</p>
             */
            public Builder removeTime(String removeTime) {
                this.removeTime = removeTime;
                return this;
            }

            /**
             * <p>The time when the risk check succeeded.</p>
             * <blockquote>
             * <p>Format: yyyy-MM-dd HH:mm:ss</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2026-03-16 15:15:00</p>
             */
            public Builder riskCheckSuccessTime(String riskCheckSuccessTime) {
                this.riskCheckSuccessTime = riskCheckSuccessTime;
                return this;
            }

            public EventTimeRecord build() {
                return new EventTimeRecord(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetResourceControlEventResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourceControlEventResponseBody</p>
     */
    public static class ApplyRecordList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApprovalReason")
        private String approvalReason;

        @com.aliyun.core.annotation.NameInMap("EventTimeRecord")
        private EventTimeRecord eventTimeRecord;

        @com.aliyun.core.annotation.NameInMap("RejectReason")
        private String rejectReason;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ApplyRecordList(Builder builder) {
            this.approvalReason = builder.approvalReason;
            this.eventTimeRecord = builder.eventTimeRecord;
            this.rejectReason = builder.rejectReason;
            this.remark = builder.remark;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplyRecordList create() {
            return builder().build();
        }

        /**
         * @return approvalReason
         */
        public String getApprovalReason() {
            return this.approvalReason;
        }

        /**
         * @return eventTimeRecord
         */
        public EventTimeRecord getEventTimeRecord() {
            return this.eventTimeRecord;
        }

        /**
         * @return rejectReason
         */
        public String getRejectReason() {
            return this.rejectReason;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String approvalReason; 
            private EventTimeRecord eventTimeRecord; 
            private String rejectReason; 
            private String remark; 
            private String status; 

            private Builder() {
            } 

            private Builder(ApplyRecordList model) {
                this.approvalReason = model.approvalReason;
                this.eventTimeRecord = model.eventTimeRecord;
                this.rejectReason = model.rejectReason;
                this.remark = model.remark;
                this.status = model.status;
            } 

            /**
             * <p>The reason for approval.</p>
             * 
             * <strong>example:</strong>
             * <p>meet the requirements</p>
             */
            public Builder approvalReason(String approvalReason) {
                this.approvalReason = approvalReason;
                return this;
            }

            /**
             * <p>The time records related to the application.</p>
             */
            public Builder eventTimeRecord(EventTimeRecord eventTimeRecord) {
                this.eventTimeRecord = eventTimeRecord;
                return this;
            }

            /**
             * <p>The reason for rejection.</p>
             * 
             * <strong>example:</strong>
             * <p>does not meet the requirements</p>
             */
            public Builder rejectReason(String rejectReason) {
                this.rejectReason = rejectReason;
                return this;
            }

            /**
             * <p>The remarks.</p>
             * 
             * <strong>example:</strong>
             * <p>Test Desc for Draft</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>The task status. Valid values:</p>
             * <ul>
             * <li><strong>Executing</strong>: executing</li>
             * <li><strong>Removed</strong>: removed</li>
             * <li><strong>Alerting</strong>: alerting</li>
             * <li><strong>Ended</strong>: ended</li>
             * <li><strong>Processed</strong>: processed by the user and under platform review</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Executing</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ApplyRecordList build() {
                return new ApplyRecordList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetResourceControlEventResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourceControlEventResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplyRecordList")
        private java.util.List<ApplyRecordList> applyRecordList;

        @com.aliyun.core.annotation.NameInMap("AssistantTip")
        private String assistantTip;

        @com.aliyun.core.annotation.NameInMap("BlockIp")
        private String blockIp;

        @com.aliyun.core.annotation.NameInMap("Direction")
        private String direction;

        @com.aliyun.core.annotation.NameInMap("DstIp")
        private String dstIp;

        @com.aliyun.core.annotation.NameInMap("DstPort")
        private String dstPort;

        @com.aliyun.core.annotation.NameInMap("EventId")
        private String eventId;

        @com.aliyun.core.annotation.NameInMap("EventImpact")
        private String eventImpact;

        @com.aliyun.core.annotation.NameInMap("LeakName")
        private String leakName;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("PunishReason")
        private String punishReason;

        @com.aliyun.core.annotation.NameInMap("SnapshotUrl")
        private String snapshotUrl;

        @com.aliyun.core.annotation.NameInMap("SrcIp")
        private String srcIp;

        @com.aliyun.core.annotation.NameInMap("SrcPort")
        private String srcPort;

        @com.aliyun.core.annotation.NameInMap("Tip")
        private String tip;

        private Data(Builder builder) {
            this.applyRecordList = builder.applyRecordList;
            this.assistantTip = builder.assistantTip;
            this.blockIp = builder.blockIp;
            this.direction = builder.direction;
            this.dstIp = builder.dstIp;
            this.dstPort = builder.dstPort;
            this.eventId = builder.eventId;
            this.eventImpact = builder.eventImpact;
            this.leakName = builder.leakName;
            this.protocol = builder.protocol;
            this.punishReason = builder.punishReason;
            this.snapshotUrl = builder.snapshotUrl;
            this.srcIp = builder.srcIp;
            this.srcPort = builder.srcPort;
            this.tip = builder.tip;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return applyRecordList
         */
        public java.util.List<ApplyRecordList> getApplyRecordList() {
            return this.applyRecordList;
        }

        /**
         * @return assistantTip
         */
        public String getAssistantTip() {
            return this.assistantTip;
        }

        /**
         * @return blockIp
         */
        public String getBlockIp() {
            return this.blockIp;
        }

        /**
         * @return direction
         */
        public String getDirection() {
            return this.direction;
        }

        /**
         * @return dstIp
         */
        public String getDstIp() {
            return this.dstIp;
        }

        /**
         * @return dstPort
         */
        public String getDstPort() {
            return this.dstPort;
        }

        /**
         * @return eventId
         */
        public String getEventId() {
            return this.eventId;
        }

        /**
         * @return eventImpact
         */
        public String getEventImpact() {
            return this.eventImpact;
        }

        /**
         * @return leakName
         */
        public String getLeakName() {
            return this.leakName;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return punishReason
         */
        public String getPunishReason() {
            return this.punishReason;
        }

        /**
         * @return snapshotUrl
         */
        public String getSnapshotUrl() {
            return this.snapshotUrl;
        }

        /**
         * @return srcIp
         */
        public String getSrcIp() {
            return this.srcIp;
        }

        /**
         * @return srcPort
         */
        public String getSrcPort() {
            return this.srcPort;
        }

        /**
         * @return tip
         */
        public String getTip() {
            return this.tip;
        }

        public static final class Builder {
            private java.util.List<ApplyRecordList> applyRecordList; 
            private String assistantTip; 
            private String blockIp; 
            private String direction; 
            private String dstIp; 
            private String dstPort; 
            private String eventId; 
            private String eventImpact; 
            private String leakName; 
            private String protocol; 
            private String punishReason; 
            private String snapshotUrl; 
            private String srcIp; 
            private String srcPort; 
            private String tip; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.applyRecordList = model.applyRecordList;
                this.assistantTip = model.assistantTip;
                this.blockIp = model.blockIp;
                this.direction = model.direction;
                this.dstIp = model.dstIp;
                this.dstPort = model.dstPort;
                this.eventId = model.eventId;
                this.eventImpact = model.eventImpact;
                this.leakName = model.leakName;
                this.protocol = model.protocol;
                this.punishReason = model.punishReason;
                this.snapshotUrl = model.snapshotUrl;
                this.srcIp = model.srcIp;
                this.srcPort = model.srcPort;
                this.tip = model.tip;
            } 

            /**
             * <p>The list of application records.</p>
             */
            public Builder applyRecordList(java.util.List<ApplyRecordList> applyRecordList) {
                this.applyRecordList = applyRecordList;
                return this;
            }

            /**
             * <p>The recommended action from the assistant.</p>
             * 
             * <strong>example:</strong>
             * <p>assistant tip</p>
             */
            public Builder assistantTip(String assistantTip) {
                this.assistantTip = assistantTip;
                return this;
            }

            /**
             * <p>The blocked IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>196.251.81.30</p>
             */
            public Builder blockIp(String blockIp) {
                this.blockIp = blockIp;
                return this;
            }

            /**
             * <p>The traffic direction. Valid values:</p>
             * <ul>
             * <li><strong>in</strong>: inbound to the cloud. </li>
             * <li><strong>out</strong>: outbound from the cloud.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>out</p>
             */
            public Builder direction(String direction) {
                this.direction = direction;
                return this;
            }

            /**
             * <p>The destination IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>10.199.31.155</p>
             */
            public Builder dstIp(String dstIp) {
                this.dstIp = dstIp;
                return this;
            }

            /**
             * <p>The destination port.</p>
             * 
             * <strong>example:</strong>
             * <p>30629</p>
             */
            public Builder dstPort(String dstPort) {
                this.dstPort = dstPort;
                return this;
            }

            /**
             * <p>The ID of the alert event.</p>
             * 
             * <strong>example:</strong>
             * <p>57ed8c6ddc9aafb1a3df38e6e84d2d45</p>
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * <p>The overview of the event impact.</p>
             * 
             * <strong>example:</strong>
             * <p>Instance Stopped</p>
             */
            public Builder eventImpact(String eventImpact) {
                this.eventImpact = eventImpact;
                return this;
            }

            /**
             * <p>The vulnerability name.</p>
             * 
             * <strong>example:</strong>
             * <p>Mining Management Event</p>
             */
            public Builder leakName(String leakName) {
                this.leakName = leakName;
                return this;
            }

            /**
             * <p>The protocol type.</p>
             * 
             * <strong>example:</strong>
             * <p>TCP</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The reason for the penalty.</p>
             * 
             * <strong>example:</strong>
             * <p>This instance is connecting to a Miner Pool and has likely been compromised by hackers for mining or other illicit activities.</p>
             */
            public Builder punishReason(String punishReason) {
                this.punishReason = punishReason;
                return this;
            }

            /**
             * <p>The download URL of the penalty snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://xxx.aliyun.com/v2">https://xxx.aliyun.com/v2</a></p>
             */
            public Builder snapshotUrl(String snapshotUrl) {
                this.snapshotUrl = snapshotUrl;
                return this;
            }

            /**
             * <p>The attack source IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>36.134.124.185</p>
             */
            public Builder srcIp(String srcIp) {
                this.srcIp = srcIp;
                return this;
            }

            /**
             * <p>The source port number.</p>
             * 
             * <strong>example:</strong>
             * <p>2168</p>
             */
            public Builder srcPort(String srcPort) {
                this.srcPort = srcPort;
                return this;
            }

            /**
             * <p>The recommended action.</p>
             * 
             * <strong>example:</strong>
             * <p>Suggestion</p>
             */
            public Builder tip(String tip) {
                this.tip = tip;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
