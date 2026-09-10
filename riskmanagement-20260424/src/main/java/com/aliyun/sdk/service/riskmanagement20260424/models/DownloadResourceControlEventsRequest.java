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
 * {@link DownloadResourceControlEventsRequest} extends {@link RequestModel}
 *
 * <p>DownloadResourceControlEventsRequest</p>
 */
public class DownloadResourceControlEventsRequest extends Request {
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

    private DownloadResourceControlEventsRequest(Builder builder) {
        super(builder);
        this.actionCode = builder.actionCode;
        this.actionCodes = builder.actionCodes;
        this.aliyunLang = builder.aliyunLang;
        this.businessCode = builder.businessCode;
        this.caseCodesPrefix = builder.caseCodesPrefix;
        this.current = builder.current;
        this.domain = builder.domain;
        this.eventCode = builder.eventCode;
        this.eventCodes = builder.eventCodes;
        this.eventId = builder.eventId;
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

    public static DownloadResourceControlEventsRequest create() {
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

    public static final class Builder extends Request.Builder<DownloadResourceControlEventsRequest, Builder> {
        private String actionCode; 
        private java.util.List<String> actionCodes; 
        private String aliyunLang; 
        private String businessCode; 
        private java.util.List<String> caseCodesPrefix; 
        private Integer current; 
        private String domain; 
        private String eventCode; 
        private java.util.List<String> eventCodes; 
        private String eventId; 
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

        private Builder(DownloadResourceControlEventsRequest request) {
            super(request);
            this.actionCode = request.actionCode;
            this.actionCodes = request.actionCodes;
            this.aliyunLang = request.aliyunLang;
            this.businessCode = request.businessCode;
            this.caseCodesPrefix = request.caseCodesPrefix;
            this.current = request.current;
            this.domain = request.domain;
            this.eventCode = request.eventCode;
            this.eventCodes = request.eventCodes;
            this.eventId = request.eventId;
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
         * <p>The action name code.</p>
         * 
         * <strong>example:</strong>
         * <p>shutdown</p>
         */
        public Builder actionCode(String actionCode) {
            this.putQueryParameter("ActionCode", actionCode);
            this.actionCode = actionCode;
            return this;
        }

        /**
         * <p>The collection of control action name codes.</p>
         * <blockquote>
         * <p>Example: [\\\&quot;shutdown\\\&quot;]</p>
         * </blockquote>
         */
        public Builder actionCodes(java.util.List<String> actionCodes) {
            String actionCodesShrink = shrink(actionCodes, "ActionCodes", "json");
            this.putQueryParameter("ActionCodes", actionCodesShrink);
            this.actionCodes = actionCodes;
            return this;
        }

        /**
         * <p>The language. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese (default).</li>
         * <li><strong>en</strong>: English.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder aliyunLang(String aliyunLang) {
            this.putQueryParameter("AliyunLang", aliyunLang);
            this.aliyunLang = aliyunLang;
            return this;
        }

        /**
         * <p>The product.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        public Builder businessCode(String businessCode) {
            this.putQueryParameter("BusinessCode", businessCode);
            this.businessCode = businessCode;
            return this;
        }

        /**
         * <p>The collection of event name code prefixes.</p>
         * <blockquote>
         * <p>Example: [\\\&quot;BANFF\\\&quot;]</p>
         * </blockquote>
         */
        public Builder caseCodesPrefix(java.util.List<String> caseCodesPrefix) {
            String caseCodesPrefixShrink = shrink(caseCodesPrefix, "CaseCodesPrefix", "json");
            this.putQueryParameter("CaseCodesPrefix", caseCodesPrefixShrink);
            this.caseCodesPrefix = caseCodesPrefix;
            return this;
        }

        /**
         * <p>The current page number.</p>
         * <blockquote>
         * <p>Must be greater than 0.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder current(Integer current) {
            this.putQueryParameter("Current", current);
            this.current = current;
            return this;
        }

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>short.industry.taobao.com</p>
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * <p>The event name code.</p>
         * 
         * <strong>example:</strong>
         * <p>BANFF_ECS_PE_ECS_MINING_SHUTDOWN</p>
         */
        public Builder eventCode(String eventCode) {
            this.putQueryParameter("EventCode", eventCode);
            this.eventCode = eventCode;
            return this;
        }

        /**
         * <p>The collection of event name codes.</p>
         * <blockquote>
         * <p>Example: [\\\&quot;BANFF_ECS_PE_ECS_MINING_SHUTDOWN\\\&quot;]</p>
         * </blockquote>
         */
        public Builder eventCodes(java.util.List<String> eventCodes) {
            String eventCodesShrink = shrink(eventCodes, "EventCodes", "json");
            this.putQueryParameter("EventCodes", eventCodesShrink);
            this.eventCodes = eventCodes;
            return this;
        }

        /**
         * <p>The alert event ID.</p>
         * 
         * <strong>example:</strong>
         * <p>09C-2PpwIzkpx2zG2fuFrAH55CpJaTK</p>
         */
        public Builder eventId(String eventId) {
            this.putQueryParameter("EventId", eventId);
            this.eventId = eventId;
            return this;
        }

        /**
         * <p>The collection of excluded control action name codes.</p>
         * <blockquote>
         * <p>Example: [\\\&quot;shutdown\\\&quot;]</p>
         * </blockquote>
         */
        public Builder excludeActionCodes(java.util.List<String> excludeActionCodes) {
            String excludeActionCodesShrink = shrink(excludeActionCodes, "ExcludeActionCodes", "json");
            this.putQueryParameter("ExcludeActionCodes", excludeActionCodesShrink);
            this.excludeActionCodes = excludeActionCodes;
            return this;
        }

        /**
         * <p>The collection of excluded event name codes.</p>
         * <blockquote>
         * <p>Example: [\\\&quot;TEST_CASE\\\&quot;]</p>
         * </blockquote>
         */
        public Builder excludeEventCodes(java.util.List<String> excludeEventCodes) {
            String excludeEventCodesShrink = shrink(excludeEventCodes, "ExcludeEventCodes", "json");
            this.putQueryParameter("ExcludeEventCodes", excludeEventCodesShrink);
            this.excludeEventCodes = excludeEventCodes;
            return this;
        }

        /**
         * <p>The collection of excluded event reasons.</p>
         * <blockquote>
         * <p>Example: [\\\&quot;Mining alert\\\&quot;]</p>
         * </blockquote>
         */
        public Builder excludeReasons(java.util.List<String> excludeReasons) {
            String excludeReasonsShrink = shrink(excludeReasons, "ExcludeReasons", "json");
            this.putQueryParameter("ExcludeReasons", excludeReasonsShrink);
            this.excludeReasons = excludeReasons;
            return this;
        }

        /**
         * <p>The collection of included event reasons.</p>
         * <blockquote>
         * <p>Example: [\\\&quot;Mining alert\\\&quot;]</p>
         * </blockquote>
         */
        public Builder includeReasons(java.util.List<String> includeReasons) {
            String includeReasonsShrink = shrink(includeReasons, "IncludeReasons", "json");
            this.putQueryParameter("IncludeReasons", includeReasonsShrink);
            this.includeReasons = includeReasons;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-0iw73ro05vcwn6ntq</p>
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
         * <p>The number of records per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The penalty end time.</p>
         * <blockquote>
         * <p>Format: yyyy-MM-dd HH:mm:ss</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2026-03-16 15:15:00</p>
         */
        public Builder punishEndTime(String punishEndTime) {
            this.putQueryParameter("PunishEndTime", punishEndTime);
            this.punishEndTime = punishEndTime;
            return this;
        }

        /**
         * <p>The penalty start time.</p>
         * <blockquote>
         * <p>Format: yyyy-MM-dd HH:mm:ss</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2026-03-16 15:15:00</p>
         */
        public Builder punishStartTime(String punishStartTime) {
            this.putQueryParameter("PunishStartTime", punishStartTime);
            this.punishStartTime = punishStartTime;
            return this;
        }

        /**
         * <p>The event reason.</p>
         * 
         * <strong>example:</strong>
         * <p>Mining</p>
         */
        public Builder reason(String reason) {
            this.putQueryParameter("Reason", reason);
            this.reason = reason;
            return this;
        }

        /**
         * <p>The collection of event source codes.</p>
         * <blockquote>
         * <p>Example: [\\\&quot;MRM\\\&quot;]</p>
         * </blockquote>
         */
        public Builder sourceCodes(java.util.List<String> sourceCodes) {
            String sourceCodesShrink = shrink(sourceCodes, "SourceCodes", "json");
            this.putQueryParameter("SourceCodes", sourceCodesShrink);
            this.sourceCodes = sourceCodes;
            return this;
        }

        /**
         * <p>The task status.</p>
         * <ul>
         * <li><strong>Executing</strong>: In progress.</li>
         * <li><strong>Removed</strong>: Removed.</li>
         * <li><strong>Alerting</strong>: Alerting.</li>
         * <li><strong>Ended</strong>: Ended.</li>
         * <li><strong>Processed</strong>: Processed by the user and pending platform review.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Executing</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The collection of task statuses.</p>
         * <ul>
         * <li><strong>Executing</strong>: In progress.</li>
         * <li><strong>Removed</strong>: Removed.</li>
         * <li><strong>Alerting</strong>: Alerting.</li>
         * <li><strong>Ended</strong>: Ended.</li>
         * <li><strong>Processed</strong>: Processed by the user and pending platform review.</li>
         * </ul>
         */
        public Builder statusList(java.util.List<String> statusList) {
            String statusListShrink = shrink(statusList, "StatusList", "json");
            this.putQueryParameter("StatusList", statusListShrink);
            this.statusList = statusList;
            return this;
        }

        /**
         * <p>The control URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://qimg.xiaohongshu.com/circe/1040g1v831qggp28ln0705oft1i6k1jil889lhso?imageView2/2/w/1080/format/jpg">https://qimg.xiaohongshu.com/circe/1040g1v831qggp28ln0705oft1i6k1jil889lhso?imageView2/2/w/1080/format/jpg</a></p>
         */
        public Builder url(String url) {
            this.putQueryParameter("Url", url);
            this.url = url;
            return this;
        }

        @Override
        public DownloadResourceControlEventsRequest build() {
            return new DownloadResourceControlEventsRequest(this);
        } 

    } 

}
