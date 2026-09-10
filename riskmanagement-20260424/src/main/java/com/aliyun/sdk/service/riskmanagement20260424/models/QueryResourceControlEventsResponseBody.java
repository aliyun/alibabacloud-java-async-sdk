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
         * <p>The metadata returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>739705BB-B0EF-554B-B3A8-383F4F93E067</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
             * <p>The action code.</p>
             * 
             * <strong>example:</strong>
             * <p>DEPLOY_STAGE_REBOOT_TASK</p>
             */
            public Builder actionCode(String actionCode) {
                this.actionCode = actionCode;
                return this;
            }

            /**
             * <p>The action name.</p>
             * 
             * <strong>example:</strong>
             * <p>Cryptomining alert</p>
             */
            public Builder actionName(String actionName) {
                this.actionName = actionName;
                return this;
            }

            /**
             * <p>The alert end time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-03-16 15:15:00</p>
             */
            public Builder alertEndTime(String alertEndTime) {
                this.alertEndTime = alertEndTime;
                return this;
            }

            /**
             * <p>The first alert time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-03-16 15:15:00</p>
             */
            public Builder alertStartTime(String alertStartTime) {
                this.alertStartTime = alertStartTime;
                return this;
            }

            /**
             * <p>The time when the control action was released.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-03-16 15:15:00</p>
             */
            public Builder antiPunishTime(String antiPunishTime) {
                this.antiPunishTime = antiPunishTime;
                return this;
            }

            /**
             * <p>The number of unblock application records.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder applyRecordCount(Integer applyRecordCount) {
                this.applyRecordCount = applyRecordCount;
                return this;
            }

            /**
             * <p>The application status.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><strong>AUDIT</strong>: Under review.</li>
             * <li><strong>SUCCESS</strong>: Approved.</li>
             * <li><strong>FAIL</strong>: Rejected.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AUDIT</p>
             */
            public Builder applyStatus(String applyStatus) {
                this.applyStatus = applyStatus;
                return this;
            }

            /**
             * <p>Indicates whether the unblock application is processed through the review platform.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder applyTrial(Boolean applyTrial) {
                this.applyTrial = applyTrial;
                return this;
            }

            /**
             * <p>The product type name.</p>
             * 
             * <strong>example:</strong>
             * <p>e\&quot;c\&quot;s</p>
             */
            public Builder businessName(String businessName) {
                this.businessName = businessName;
                return this;
            }

            /**
             * <p>The event name code.</p>
             * 
             * <strong>example:</strong>
             * <p>TEST_IMS_ACCOUNT_PUNISH_WHITE_TEST</p>
             */
            public Builder caseCode(String caseCode) {
                this.caseCode = caseCode;
                return this;
            }

            /**
             * <p>The controlled domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>ubs-mm-nwwss-ddos.purchern.com</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The event ID.</p>
             * 
             * <strong>example:</strong>
             * <p>e791c08281b41e8240f897a424c188ae</p>
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * <p>The event name.</p>
             * 
             * <strong>example:</strong>
             * <p>Mining control event</p>
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * <p>The extended information about the penalty.</p>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;createAt\&quot;:\&quot;2025-08-03 11:18:59\&quot;,\&quot;updatedAt\&quot;:\&quot;2025-08-03 11:18:59\&quot;}</p>
             */
            public Builder extras(String extras) {
                this.extras = extras;
                return this;
            }

            /**
             * <p>The event type.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder formType(String formType) {
                this.formType = formType;
                return this;
            }

            /**
             * <p>The latest time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-03-16 15:15:00</p>
             */
            public Builder gmtLatest(String gmtLatest) {
                this.gmtLatest = gmtLatest;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-3nsvwmt67pn72py1z</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The controlled IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.158.58</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The latest detection time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-03-16 15:15:00</p>
             */
            public Builder lastCheckTime(String lastCheckTime) {
                this.lastCheckTime = lastCheckTime;
                return this;
            }

            /**
             * <p>The estimated shutdown time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-03-16 15:15:00</p>
             */
            public Builder preCloseTime(String preCloseTime) {
                this.preCloseTime = preCloseTime;
                return this;
            }

            /**
             * <p>The source of the penalty.</p>
             * 
             * <strong>example:</strong>
             * <p>MRM</p>
             */
            public Builder punishFrom(String punishFrom) {
                this.punishFrom = punishFrom;
                return this;
            }

            /**
             * <p>The time when the control action was applied.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-03-16 15:15:00</p>
             */
            public Builder punishTime(String punishTime) {
                this.punishTime = punishTime;
                return this;
            }

            /**
             * <p>The event reason.</p>
             * 
             * <strong>example:</strong>
             * <p>Cryptomining alert</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>The region information.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The security hardening suggestion.</p>
             * 
             * <strong>example:</strong>
             * <p>Suggestion</p>
             */
            public Builder reinforcement(String reinforcement) {
                this.reinforcement = reinforcement;
                return this;
            }

            /**
             * <p>The task status.</p>
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

            /**
             * <p>Indicates whether batch unblock applications are supported.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder supportBatchApply(Boolean supportBatchApply) {
                this.supportBatchApply = supportBatchApply;
                return this;
            }

            /**
             * <p>Indicates whether a single unblock application is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder supportSingleApply(Boolean supportSingleApply) {
                this.supportSingleApply = supportSingleApply;
                return this;
            }

            /**
             * <p>The trigger type.</p>
             * 
             * <strong>example:</strong>
             * <p>miner</p>
             */
            public Builder triggerType(String triggerType) {
                this.triggerType = triggerType;
                return this;
            }

            /**
             * <p>The controlled URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://pm.alicdn.com/quali/bc98e42b619ad4127bf6437b87045597.jpg?auth_key=1758682451-0-0-897be72852503566bd6775cd9914f5aa">https://pm.alicdn.com/quali/bc98e42b619ad4127bf6437b87045597.jpg?auth_key=1758682451-0-0-897be72852503566bd6775cd9914f5aa</a></p>
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
             * <p>The current page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder current(Integer current) {
                this.current = current;
                return this;
            }

            /**
             * <p>The number of records returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>24</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of events.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
             * <p>The event list data.</p>
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * <p>The pagination information.</p>
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
