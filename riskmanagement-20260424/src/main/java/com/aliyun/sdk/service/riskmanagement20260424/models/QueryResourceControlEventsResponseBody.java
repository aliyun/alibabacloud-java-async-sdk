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
 * {@link QueryResourceControlEventsResponseBody} extends {@link TeaModel}
 *
 * <p>QueryResourceControlEventsResponseBody</p>
 */
public class QueryResourceControlEventsResponseBody extends TeaModel {
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

    private QueryResourceControlEventsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryResourceControlEventsResponseBody create() {
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

        private Builder(QueryResourceControlEventsResponseBody model) {
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

        public QueryResourceControlEventsResponseBody build() {
            return new QueryResourceControlEventsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryResourceControlEventsResponseBody} extends {@link TeaModel}
     *
     * <p>QueryResourceControlEventsResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActionCode")
        private String actionCode;

        @com.aliyun.core.annotation.NameInMap("ActionName")
        private String actionName;

        @com.aliyun.core.annotation.NameInMap("AlertEndTime")
        private String alertEndTime;

        @com.aliyun.core.annotation.NameInMap("AlertStartTime")
        private String alertStartTime;

        @com.aliyun.core.annotation.NameInMap("AntiPunishTime")
        private String antiPunishTime;

        @com.aliyun.core.annotation.NameInMap("ApplyRecordCount")
        private Integer applyRecordCount;

        @com.aliyun.core.annotation.NameInMap("ApplyStatus")
        private String applyStatus;

        @com.aliyun.core.annotation.NameInMap("ApplyTrial")
        private Boolean applyTrial;

        @com.aliyun.core.annotation.NameInMap("BusinessName")
        private String businessName;

        @com.aliyun.core.annotation.NameInMap("CaseCode")
        private String caseCode;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("EventId")
        private String eventId;

        @com.aliyun.core.annotation.NameInMap("EventName")
        private String eventName;

        @com.aliyun.core.annotation.NameInMap("Extras")
        private String extras;

        @com.aliyun.core.annotation.NameInMap("FormType")
        private String formType;

        @com.aliyun.core.annotation.NameInMap("GmtLatest")
        private String gmtLatest;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("LastCheckTime")
        private String lastCheckTime;

        @com.aliyun.core.annotation.NameInMap("PreCloseTime")
        private String preCloseTime;

        @com.aliyun.core.annotation.NameInMap("PunishFrom")
        private String punishFrom;

        @com.aliyun.core.annotation.NameInMap("PunishTime")
        private String punishTime;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Reinforcement")
        private String reinforcement;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SupportBatchApply")
        private Boolean supportBatchApply;

        @com.aliyun.core.annotation.NameInMap("SupportSingleApply")
        private Boolean supportSingleApply;

        @com.aliyun.core.annotation.NameInMap("TriggerType")
        private String triggerType;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private List(Builder builder) {
            this.actionCode = builder.actionCode;
            this.actionName = builder.actionName;
            this.alertEndTime = builder.alertEndTime;
            this.alertStartTime = builder.alertStartTime;
            this.antiPunishTime = builder.antiPunishTime;
            this.applyRecordCount = builder.applyRecordCount;
            this.applyStatus = builder.applyStatus;
            this.applyTrial = builder.applyTrial;
            this.businessName = builder.businessName;
            this.caseCode = builder.caseCode;
            this.domain = builder.domain;
            this.eventId = builder.eventId;
            this.eventName = builder.eventName;
            this.extras = builder.extras;
            this.formType = builder.formType;
            this.gmtLatest = builder.gmtLatest;
            this.instanceId = builder.instanceId;
            this.ip = builder.ip;
            this.lastCheckTime = builder.lastCheckTime;
            this.preCloseTime = builder.preCloseTime;
            this.punishFrom = builder.punishFrom;
            this.punishTime = builder.punishTime;
            this.reason = builder.reason;
            this.region = builder.region;
            this.regionId = builder.regionId;
            this.reinforcement = builder.reinforcement;
            this.status = builder.status;
            this.supportBatchApply = builder.supportBatchApply;
            this.supportSingleApply = builder.supportSingleApply;
            this.triggerType = builder.triggerType;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return actionCode
         */
        public String getActionCode() {
            return this.actionCode;
        }

        /**
         * @return actionName
         */
        public String getActionName() {
            return this.actionName;
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
         * @return applyRecordCount
         */
        public Integer getApplyRecordCount() {
            return this.applyRecordCount;
        }

        /**
         * @return applyStatus
         */
        public String getApplyStatus() {
            return this.applyStatus;
        }

        /**
         * @return applyTrial
         */
        public Boolean getApplyTrial() {
            return this.applyTrial;
        }

        /**
         * @return businessName
         */
        public String getBusinessName() {
            return this.businessName;
        }

        /**
         * @return caseCode
         */
        public String getCaseCode() {
            return this.caseCode;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return eventId
         */
        public String getEventId() {
            return this.eventId;
        }

        /**
         * @return eventName
         */
        public String getEventName() {
            return this.eventName;
        }

        /**
         * @return extras
         */
        public String getExtras() {
            return this.extras;
        }

        /**
         * @return formType
         */
        public String getFormType() {
            return this.formType;
        }

        /**
         * @return gmtLatest
         */
        public String getGmtLatest() {
            return this.gmtLatest;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return lastCheckTime
         */
        public String getLastCheckTime() {
            return this.lastCheckTime;
        }

        /**
         * @return preCloseTime
         */
        public String getPreCloseTime() {
            return this.preCloseTime;
        }

        /**
         * @return punishFrom
         */
        public String getPunishFrom() {
            return this.punishFrom;
        }

        /**
         * @return punishTime
         */
        public String getPunishTime() {
            return this.punishTime;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return reinforcement
         */
        public String getReinforcement() {
            return this.reinforcement;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return supportBatchApply
         */
        public Boolean getSupportBatchApply() {
            return this.supportBatchApply;
        }

        /**
         * @return supportSingleApply
         */
        public Boolean getSupportSingleApply() {
            return this.supportSingleApply;
        }

        /**
         * @return triggerType
         */
        public String getTriggerType() {
            return this.triggerType;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String actionCode; 
            private String actionName; 
            private String alertEndTime; 
            private String alertStartTime; 
            private String antiPunishTime; 
            private Integer applyRecordCount; 
            private String applyStatus; 
            private Boolean applyTrial; 
            private String businessName; 
            private String caseCode; 
            private String domain; 
            private String eventId; 
            private String eventName; 
            private String extras; 
            private String formType; 
            private String gmtLatest; 
            private String instanceId; 
            private String ip; 
            private String lastCheckTime; 
            private String preCloseTime; 
            private String punishFrom; 
            private String punishTime; 
            private String reason; 
            private String region; 
            private String regionId; 
            private String reinforcement; 
            private String status; 
            private Boolean supportBatchApply; 
            private Boolean supportSingleApply; 
            private String triggerType; 
            private String url; 

            private Builder() {
            } 

            private Builder(List model) {
                this.actionCode = model.actionCode;
                this.actionName = model.actionName;
                this.alertEndTime = model.alertEndTime;
                this.alertStartTime = model.alertStartTime;
                this.antiPunishTime = model.antiPunishTime;
                this.applyRecordCount = model.applyRecordCount;
                this.applyStatus = model.applyStatus;
                this.applyTrial = model.applyTrial;
                this.businessName = model.businessName;
                this.caseCode = model.caseCode;
                this.domain = model.domain;
                this.eventId = model.eventId;
                this.eventName = model.eventName;
                this.extras = model.extras;
                this.formType = model.formType;
                this.gmtLatest = model.gmtLatest;
                this.instanceId = model.instanceId;
                this.ip = model.ip;
                this.lastCheckTime = model.lastCheckTime;
                this.preCloseTime = model.preCloseTime;
                this.punishFrom = model.punishFrom;
                this.punishTime = model.punishTime;
                this.reason = model.reason;
                this.region = model.region;
                this.regionId = model.regionId;
                this.reinforcement = model.reinforcement;
                this.status = model.status;
                this.supportBatchApply = model.supportBatchApply;
                this.supportSingleApply = model.supportSingleApply;
                this.triggerType = model.triggerType;
                this.url = model.url;
            } 

            /**
             * ActionCode.
             */
            public Builder actionCode(String actionCode) {
                this.actionCode = actionCode;
                return this;
            }

            /**
             * ActionName.
             */
            public Builder actionName(String actionName) {
                this.actionName = actionName;
                return this;
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
             * ApplyRecordCount.
             */
            public Builder applyRecordCount(Integer applyRecordCount) {
                this.applyRecordCount = applyRecordCount;
                return this;
            }

            /**
             * ApplyStatus.
             */
            public Builder applyStatus(String applyStatus) {
                this.applyStatus = applyStatus;
                return this;
            }

            /**
             * ApplyTrial.
             */
            public Builder applyTrial(Boolean applyTrial) {
                this.applyTrial = applyTrial;
                return this;
            }

            /**
             * BusinessName.
             */
            public Builder businessName(String businessName) {
                this.businessName = businessName;
                return this;
            }

            /**
             * CaseCode.
             */
            public Builder caseCode(String caseCode) {
                this.caseCode = caseCode;
                return this;
            }

            /**
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
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
             * EventName.
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * Extras.
             */
            public Builder extras(String extras) {
                this.extras = extras;
                return this;
            }

            /**
             * FormType.
             */
            public Builder formType(String formType) {
                this.formType = formType;
                return this;
            }

            /**
             * GmtLatest.
             */
            public Builder gmtLatest(String gmtLatest) {
                this.gmtLatest = gmtLatest;
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
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
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
             * PreCloseTime.
             */
            public Builder preCloseTime(String preCloseTime) {
                this.preCloseTime = preCloseTime;
                return this;
            }

            /**
             * PunishFrom.
             */
            public Builder punishFrom(String punishFrom) {
                this.punishFrom = punishFrom;
                return this;
            }

            /**
             * PunishTime.
             */
            public Builder punishTime(String punishTime) {
                this.punishTime = punishTime;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Reinforcement.
             */
            public Builder reinforcement(String reinforcement) {
                this.reinforcement = reinforcement;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * SupportBatchApply.
             */
            public Builder supportBatchApply(Boolean supportBatchApply) {
                this.supportBatchApply = supportBatchApply;
                return this;
            }

            /**
             * SupportSingleApply.
             */
            public Builder supportSingleApply(Boolean supportSingleApply) {
                this.supportSingleApply = supportSingleApply;
                return this;
            }

            /**
             * TriggerType.
             */
            public Builder triggerType(String triggerType) {
                this.triggerType = triggerType;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryResourceControlEventsResponseBody} extends {@link TeaModel}
     *
     * <p>QueryResourceControlEventsResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Current")
        private Integer current;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private PageInfo(Builder builder) {
            this.current = builder.current;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return current
         */
        public Integer getCurrent() {
            return this.current;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer current; 
            private Integer pageSize; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(PageInfo model) {
                this.current = model.current;
                this.pageSize = model.pageSize;
                this.total = model.total;
            } 

            /**
             * Current.
             */
            public Builder current(Integer current) {
                this.current = current;
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
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryResourceControlEventsResponseBody} extends {@link TeaModel}
     *
     * <p>QueryResourceControlEventsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

        @com.aliyun.core.annotation.NameInMap("PageInfo")
        private PageInfo pageInfo;

        private Data(Builder builder) {
            this.list = builder.list;
            this.pageInfo = builder.pageInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List<List> getList() {
            return this.list;
        }

        /**
         * @return pageInfo
         */
        public PageInfo getPageInfo() {
            return this.pageInfo;
        }

        public static final class Builder {
            private java.util.List<List> list; 
            private PageInfo pageInfo; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.list = model.list;
                this.pageInfo = model.pageInfo;
            } 

            /**
             * List.
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * PageInfo.
             */
            public Builder pageInfo(PageInfo pageInfo) {
                this.pageInfo = pageInfo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
