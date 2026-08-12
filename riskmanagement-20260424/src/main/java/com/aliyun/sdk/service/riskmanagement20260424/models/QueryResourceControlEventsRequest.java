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
 * {@link QueryResourceControlEventsRequest} extends {@link RequestModel}
 *
 * <p>QueryResourceControlEventsRequest</p>
 */
public class QueryResourceControlEventsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActionCode")
    private String actionCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActionCodes")
    private java.util.List<String> actionCodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliyunLang")
    private String aliyunLang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessCode")
    private String businessCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessCodes")
    private java.util.List<String> businessCodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CaseCodesPrefix")
    private java.util.List<String> caseCodesPrefix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Current")
    private Integer current;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventCode")
    private String eventCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventCodes")
    private java.util.List<String> eventCodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventId")
    private String eventId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventIdList")
    private java.util.List<String> eventIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExcludeActionCodes")
    private java.util.List<String> excludeActionCodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExcludeEventCodes")
    private java.util.List<String> excludeEventCodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExcludeReasons")
    private java.util.List<String> excludeReasons;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludeReasons")
    private java.util.List<String> includeReasons;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ip")
    private String ip;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PunishEndTime")
    private String punishEndTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PunishStartTime")
    private String punishStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Reason")
    private String reason;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceCodes")
    private java.util.List<String> sourceCodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StatusList")
    private java.util.List<String> statusList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Url")
    private String url;

    private QueryResourceControlEventsRequest(Builder builder) {
        super(builder);
        this.actionCode = builder.actionCode;
        this.actionCodes = builder.actionCodes;
        this.aliyunLang = builder.aliyunLang;
        this.businessCode = builder.businessCode;
        this.businessCodes = builder.businessCodes;
        this.caseCodesPrefix = builder.caseCodesPrefix;
        this.current = builder.current;
        this.domain = builder.domain;
        this.eventCode = builder.eventCode;
        this.eventCodes = builder.eventCodes;
        this.eventId = builder.eventId;
        this.eventIdList = builder.eventIdList;
        this.excludeActionCodes = builder.excludeActionCodes;
        this.excludeEventCodes = builder.excludeEventCodes;
        this.excludeReasons = builder.excludeReasons;
        this.includeReasons = builder.includeReasons;
        this.instanceId = builder.instanceId;
        this.ip = builder.ip;
        this.pageSize = builder.pageSize;
        this.punishEndTime = builder.punishEndTime;
        this.punishStartTime = builder.punishStartTime;
        this.reason = builder.reason;
        this.sourceCodes = builder.sourceCodes;
        this.status = builder.status;
        this.statusList = builder.statusList;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryResourceControlEventsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actionCode
     */
    public String getActionCode() {
        return this.actionCode;
    }

    /**
     * @return actionCodes
     */
    public java.util.List<String> getActionCodes() {
        return this.actionCodes;
    }

    /**
     * @return aliyunLang
     */
    public String getAliyunLang() {
        return this.aliyunLang;
    }

    /**
     * @return businessCode
     */
    public String getBusinessCode() {
        return this.businessCode;
    }

    /**
     * @return businessCodes
     */
    public java.util.List<String> getBusinessCodes() {
        return this.businessCodes;
    }

    /**
     * @return caseCodesPrefix
     */
    public java.util.List<String> getCaseCodesPrefix() {
        return this.caseCodesPrefix;
    }

    /**
     * @return current
     */
    public Integer getCurrent() {
        return this.current;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return eventCode
     */
    public String getEventCode() {
        return this.eventCode;
    }

    /**
     * @return eventCodes
     */
    public java.util.List<String> getEventCodes() {
        return this.eventCodes;
    }

    /**
     * @return eventId
     */
    public String getEventId() {
        return this.eventId;
    }

    /**
     * @return eventIdList
     */
    public java.util.List<String> getEventIdList() {
        return this.eventIdList;
    }

    /**
     * @return excludeActionCodes
     */
    public java.util.List<String> getExcludeActionCodes() {
        return this.excludeActionCodes;
    }

    /**
     * @return excludeEventCodes
     */
    public java.util.List<String> getExcludeEventCodes() {
        return this.excludeEventCodes;
    }

    /**
     * @return excludeReasons
     */
    public java.util.List<String> getExcludeReasons() {
        return this.excludeReasons;
    }

    /**
     * @return includeReasons
     */
    public java.util.List<String> getIncludeReasons() {
        return this.includeReasons;
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
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * @return sourceCodes
     */
    public java.util.List<String> getSourceCodes() {
        return this.sourceCodes;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return statusList
     */
    public java.util.List<String> getStatusList() {
        return this.statusList;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder extends Request.Builder<QueryResourceControlEventsRequest, Builder> {
        private String actionCode; 
        private java.util.List<String> actionCodes; 
        private String aliyunLang; 
        private String businessCode; 
        private java.util.List<String> businessCodes; 
        private java.util.List<String> caseCodesPrefix; 
        private Integer current; 
        private String domain; 
        private String eventCode; 
        private java.util.List<String> eventCodes; 
        private String eventId; 
        private java.util.List<String> eventIdList; 
        private java.util.List<String> excludeActionCodes; 
        private java.util.List<String> excludeEventCodes; 
        private java.util.List<String> excludeReasons; 
        private java.util.List<String> includeReasons; 
        private String instanceId; 
        private String ip; 
        private Integer pageSize; 
        private String punishEndTime; 
        private String punishStartTime; 
        private String reason; 
        private java.util.List<String> sourceCodes; 
        private String status; 
        private java.util.List<String> statusList; 
        private String url; 

        private Builder() {
            super();
        } 

        private Builder(QueryResourceControlEventsRequest request) {
            super(request);
            this.actionCode = request.actionCode;
            this.actionCodes = request.actionCodes;
            this.aliyunLang = request.aliyunLang;
            this.businessCode = request.businessCode;
            this.businessCodes = request.businessCodes;
            this.caseCodesPrefix = request.caseCodesPrefix;
            this.current = request.current;
            this.domain = request.domain;
            this.eventCode = request.eventCode;
            this.eventCodes = request.eventCodes;
            this.eventId = request.eventId;
            this.eventIdList = request.eventIdList;
            this.excludeActionCodes = request.excludeActionCodes;
            this.excludeEventCodes = request.excludeEventCodes;
            this.excludeReasons = request.excludeReasons;
            this.includeReasons = request.includeReasons;
            this.instanceId = request.instanceId;
            this.ip = request.ip;
            this.pageSize = request.pageSize;
            this.punishEndTime = request.punishEndTime;
            this.punishStartTime = request.punishStartTime;
            this.reason = request.reason;
            this.sourceCodes = request.sourceCodes;
            this.status = request.status;
            this.statusList = request.statusList;
            this.url = request.url;
        } 

        /**
         * ActionCode.
         */
        public Builder actionCode(String actionCode) {
            this.putQueryParameter("ActionCode", actionCode);
            this.actionCode = actionCode;
            return this;
        }

        /**
         * ActionCodes.
         */
        public Builder actionCodes(java.util.List<String> actionCodes) {
            String actionCodesShrink = shrink(actionCodes, "ActionCodes", "json");
            this.putQueryParameter("ActionCodes", actionCodesShrink);
            this.actionCodes = actionCodes;
            return this;
        }

        /**
         * AliyunLang.
         */
        public Builder aliyunLang(String aliyunLang) {
            this.putQueryParameter("AliyunLang", aliyunLang);
            this.aliyunLang = aliyunLang;
            return this;
        }

        /**
         * BusinessCode.
         */
        public Builder businessCode(String businessCode) {
            this.putQueryParameter("BusinessCode", businessCode);
            this.businessCode = businessCode;
            return this;
        }

        /**
         * BusinessCodes.
         */
        public Builder businessCodes(java.util.List<String> businessCodes) {
            String businessCodesShrink = shrink(businessCodes, "BusinessCodes", "json");
            this.putQueryParameter("BusinessCodes", businessCodesShrink);
            this.businessCodes = businessCodes;
            return this;
        }

        /**
         * CaseCodesPrefix.
         */
        public Builder caseCodesPrefix(java.util.List<String> caseCodesPrefix) {
            String caseCodesPrefixShrink = shrink(caseCodesPrefix, "CaseCodesPrefix", "json");
            this.putQueryParameter("CaseCodesPrefix", caseCodesPrefixShrink);
            this.caseCodesPrefix = caseCodesPrefix;
            return this;
        }

        /**
         * Current.
         */
        public Builder current(Integer current) {
            this.putQueryParameter("Current", current);
            this.current = current;
            return this;
        }

        /**
         * Domain.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * EventCode.
         */
        public Builder eventCode(String eventCode) {
            this.putQueryParameter("EventCode", eventCode);
            this.eventCode = eventCode;
            return this;
        }

        /**
         * EventCodes.
         */
        public Builder eventCodes(java.util.List<String> eventCodes) {
            String eventCodesShrink = shrink(eventCodes, "EventCodes", "json");
            this.putQueryParameter("EventCodes", eventCodesShrink);
            this.eventCodes = eventCodes;
            return this;
        }

        /**
         * EventId.
         */
        public Builder eventId(String eventId) {
            this.putQueryParameter("EventId", eventId);
            this.eventId = eventId;
            return this;
        }

        /**
         * EventIdList.
         */
        public Builder eventIdList(java.util.List<String> eventIdList) {
            String eventIdListShrink = shrink(eventIdList, "EventIdList", "json");
            this.putQueryParameter("EventIdList", eventIdListShrink);
            this.eventIdList = eventIdList;
            return this;
        }

        /**
         * ExcludeActionCodes.
         */
        public Builder excludeActionCodes(java.util.List<String> excludeActionCodes) {
            String excludeActionCodesShrink = shrink(excludeActionCodes, "ExcludeActionCodes", "json");
            this.putQueryParameter("ExcludeActionCodes", excludeActionCodesShrink);
            this.excludeActionCodes = excludeActionCodes;
            return this;
        }

        /**
         * ExcludeEventCodes.
         */
        public Builder excludeEventCodes(java.util.List<String> excludeEventCodes) {
            String excludeEventCodesShrink = shrink(excludeEventCodes, "ExcludeEventCodes", "json");
            this.putQueryParameter("ExcludeEventCodes", excludeEventCodesShrink);
            this.excludeEventCodes = excludeEventCodes;
            return this;
        }

        /**
         * ExcludeReasons.
         */
        public Builder excludeReasons(java.util.List<String> excludeReasons) {
            String excludeReasonsShrink = shrink(excludeReasons, "ExcludeReasons", "json");
            this.putQueryParameter("ExcludeReasons", excludeReasonsShrink);
            this.excludeReasons = excludeReasons;
            return this;
        }

        /**
         * IncludeReasons.
         */
        public Builder includeReasons(java.util.List<String> includeReasons) {
            String includeReasonsShrink = shrink(includeReasons, "IncludeReasons", "json");
            this.putQueryParameter("IncludeReasons", includeReasonsShrink);
            this.includeReasons = includeReasons;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>IP</p>
         * 
         * <strong>example:</strong>
         * <p>12.3*.22.11</p>
         */
        public Builder ip(String ip) {
            this.putQueryParameter("Ip", ip);
            this.ip = ip;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PunishEndTime.
         */
        public Builder punishEndTime(String punishEndTime) {
            this.putQueryParameter("PunishEndTime", punishEndTime);
            this.punishEndTime = punishEndTime;
            return this;
        }

        /**
         * PunishStartTime.
         */
        public Builder punishStartTime(String punishStartTime) {
            this.putQueryParameter("PunishStartTime", punishStartTime);
            this.punishStartTime = punishStartTime;
            return this;
        }

        /**
         * Reason.
         */
        public Builder reason(String reason) {
            this.putQueryParameter("Reason", reason);
            this.reason = reason;
            return this;
        }

        /**
         * SourceCodes.
         */
        public Builder sourceCodes(java.util.List<String> sourceCodes) {
            String sourceCodesShrink = shrink(sourceCodes, "SourceCodes", "json");
            this.putQueryParameter("SourceCodes", sourceCodesShrink);
            this.sourceCodes = sourceCodes;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * StatusList.
         */
        public Builder statusList(java.util.List<String> statusList) {
            String statusListShrink = shrink(statusList, "StatusList", "json");
            this.putQueryParameter("StatusList", statusListShrink);
            this.statusList = statusList;
            return this;
        }

        /**
         * Url.
         */
        public Builder url(String url) {
            this.putQueryParameter("Url", url);
            this.url = url;
            return this;
        }

        @Override
        public QueryResourceControlEventsRequest build() {
            return new QueryResourceControlEventsRequest(this);
        } 

    } 

}
