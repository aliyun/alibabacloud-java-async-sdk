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
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
             * AlertEndTime.
             */
            public Builder alertEndTime(String alertEndTime) {
                this.alertEndTime = alertEndTime;
                return this;
            }

            /**
             * AlertStartTime.
             */
            public Builder alertStartTime(String alertStartTime) {
                this.alertStartTime = alertStartTime;
                return this;
            }

            /**
             * AntiPunishTime.
             */
            public Builder antiPunishTime(String antiPunishTime) {
                this.antiPunishTime = antiPunishTime;
                return this;
            }

            /**
             * ApplyTime.
             */
            public Builder applyTime(String applyTime) {
                this.applyTime = applyTime;
                return this;
            }

            /**
             * IgnoreAlertTime.
             */
            public Builder ignoreAlertTime(String ignoreAlertTime) {
                this.ignoreAlertTime = ignoreAlertTime;
                return this;
            }

            /**
             * InstanceCloseTime.
             */
            public Builder instanceCloseTime(String instanceCloseTime) {
                this.instanceCloseTime = instanceCloseTime;
                return this;
            }

            /**
             * InstanceScanTime.
             */
            public Builder instanceScanTime(String instanceScanTime) {
                this.instanceScanTime = instanceScanTime;
                return this;
            }

            /**
             * LastCheckTime.
             */
            public Builder lastCheckTime(String lastCheckTime) {
                this.lastCheckTime = lastCheckTime;
                return this;
            }

            /**
             * MiningAlertProcessTime.
             */
            public Builder miningAlertProcessTime(String miningAlertProcessTime) {
                this.miningAlertProcessTime = miningAlertProcessTime;
                return this;
            }

            /**
             * PreCloseTime.
             */
            public Builder preCloseTime(String preCloseTime) {
                this.preCloseTime = preCloseTime;
                return this;
            }

            /**
             * ProcessTime.
             */
            public Builder processTime(String processTime) {
                this.processTime = processTime;
                return this;
            }

            /**
             * PunishEndTime.
             */
            public Builder punishEndTime(String punishEndTime) {
                this.punishEndTime = punishEndTime;
                return this;
            }

            /**
             * PunishStartTime.
             */
            public Builder punishStartTime(String punishStartTime) {
                this.punishStartTime = punishStartTime;
                return this;
            }

            /**
             * RejectTime.
             */
            public Builder rejectTime(String rejectTime) {
                this.rejectTime = rejectTime;
                return this;
            }

            /**
             * RemoveTime.
             */
            public Builder removeTime(String removeTime) {
                this.removeTime = removeTime;
                return this;
            }

            /**
             * RiskCheckSuccessTime.
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
             * ApprovalReason.
             */
            public Builder approvalReason(String approvalReason) {
                this.approvalReason = approvalReason;
                return this;
            }

            /**
             * EventTimeRecord.
             */
            public Builder eventTimeRecord(EventTimeRecord eventTimeRecord) {
                this.eventTimeRecord = eventTimeRecord;
                return this;
            }

            /**
             * RejectReason.
             */
            public Builder rejectReason(String rejectReason) {
                this.rejectReason = rejectReason;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * Status.
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
             * ApplyRecordList.
             */
            public Builder applyRecordList(java.util.List<ApplyRecordList> applyRecordList) {
                this.applyRecordList = applyRecordList;
                return this;
            }

            /**
             * AssistantTip.
             */
            public Builder assistantTip(String assistantTip) {
                this.assistantTip = assistantTip;
                return this;
            }

            /**
             * BlockIp.
             */
            public Builder blockIp(String blockIp) {
                this.blockIp = blockIp;
                return this;
            }

            /**
             * Direction.
             */
            public Builder direction(String direction) {
                this.direction = direction;
                return this;
            }

            /**
             * DstIp.
             */
            public Builder dstIp(String dstIp) {
                this.dstIp = dstIp;
                return this;
            }

            /**
             * DstPort.
             */
            public Builder dstPort(String dstPort) {
                this.dstPort = dstPort;
                return this;
            }

            /**
             * EventId.
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * EventImpact.
             */
            public Builder eventImpact(String eventImpact) {
                this.eventImpact = eventImpact;
                return this;
            }

            /**
             * LeakName.
             */
            public Builder leakName(String leakName) {
                this.leakName = leakName;
                return this;
            }

            /**
             * Protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * PunishReason.
             */
            public Builder punishReason(String punishReason) {
                this.punishReason = punishReason;
                return this;
            }

            /**
             * SnapshotUrl.
             */
            public Builder snapshotUrl(String snapshotUrl) {
                this.snapshotUrl = snapshotUrl;
                return this;
            }

            /**
             * SrcIp.
             */
            public Builder srcIp(String srcIp) {
                this.srcIp = srcIp;
                return this;
            }

            /**
             * SrcPort.
             */
            public Builder srcPort(String srcPort) {
                this.srcPort = srcPort;
                return this;
            }

            /**
             * Tip.
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
