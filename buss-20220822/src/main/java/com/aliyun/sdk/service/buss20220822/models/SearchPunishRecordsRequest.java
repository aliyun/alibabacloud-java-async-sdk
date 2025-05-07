// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.buss20220822.models;

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
 * {@link SearchPunishRecordsRequest} extends {@link RequestModel}
 *
 * <p>SearchPunishRecordsRequest</p>
 */
public class SearchPunishRecordsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActionCodes")
    private java.util.List<String> actionCodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliUid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aliUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BussinessCodes")
    private String bussinessCodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CaseCodes")
    private java.util.List<String> caseCodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventCodes")
    private java.util.List<String> eventCodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ip")
    private String ip;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Page")
    private String page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PunishStatus")
    private java.util.List<String> punishStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private String resourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceCodes")
    private java.util.List<String> sourceCodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Url")
    private String url;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UrlFuzzy")
    private String urlFuzzy;

    private SearchPunishRecordsRequest(Builder builder) {
        super(builder);
        this.actionCodes = builder.actionCodes;
        this.aliUid = builder.aliUid;
        this.bussinessCodes = builder.bussinessCodes;
        this.caseCodes = builder.caseCodes;
        this.domain = builder.domain;
        this.endTime = builder.endTime;
        this.eventCodes = builder.eventCodes;
        this.ip = builder.ip;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.punishStatus = builder.punishStatus;
        this.resourceId = builder.resourceId;
        this.sourceCodes = builder.sourceCodes;
        this.startTime = builder.startTime;
        this.url = builder.url;
        this.urlFuzzy = builder.urlFuzzy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchPunishRecordsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actionCodes
     */
    public java.util.List<String> getActionCodes() {
        return this.actionCodes;
    }

    /**
     * @return aliUid
     */
    public String getAliUid() {
        return this.aliUid;
    }

    /**
     * @return bussinessCodes
     */
    public String getBussinessCodes() {
        return this.bussinessCodes;
    }

    /**
     * @return caseCodes
     */
    public java.util.List<String> getCaseCodes() {
        return this.caseCodes;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return eventCodes
     */
    public java.util.List<String> getEventCodes() {
        return this.eventCodes;
    }

    /**
     * @return ip
     */
    public String getIp() {
        return this.ip;
    }

    /**
     * @return page
     */
    public String getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return punishStatus
     */
    public java.util.List<String> getPunishStatus() {
        return this.punishStatus;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return sourceCodes
     */
    public java.util.List<String> getSourceCodes() {
        return this.sourceCodes;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * @return urlFuzzy
     */
    public String getUrlFuzzy() {
        return this.urlFuzzy;
    }

    public static final class Builder extends Request.Builder<SearchPunishRecordsRequest, Builder> {
        private java.util.List<String> actionCodes; 
        private String aliUid; 
        private String bussinessCodes; 
        private java.util.List<String> caseCodes; 
        private String domain; 
        private Long endTime; 
        private java.util.List<String> eventCodes; 
        private String ip; 
        private String page; 
        private String pageSize; 
        private java.util.List<String> punishStatus; 
        private String resourceId; 
        private java.util.List<String> sourceCodes; 
        private Long startTime; 
        private String url; 
        private String urlFuzzy; 

        private Builder() {
            super();
        } 

        private Builder(SearchPunishRecordsRequest request) {
            super(request);
            this.actionCodes = request.actionCodes;
            this.aliUid = request.aliUid;
            this.bussinessCodes = request.bussinessCodes;
            this.caseCodes = request.caseCodes;
            this.domain = request.domain;
            this.endTime = request.endTime;
            this.eventCodes = request.eventCodes;
            this.ip = request.ip;
            this.page = request.page;
            this.pageSize = request.pageSize;
            this.punishStatus = request.punishStatus;
            this.resourceId = request.resourceId;
            this.sourceCodes = request.sourceCodes;
            this.startTime = request.startTime;
            this.url = request.url;
            this.urlFuzzy = request.urlFuzzy;
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
         * <p>This parameter is required.</p>
         */
        public Builder aliUid(String aliUid) {
            this.putQueryParameter("AliUid", aliUid);
            this.aliUid = aliUid;
            return this;
        }

        /**
         * BussinessCodes.
         */
        public Builder bussinessCodes(String bussinessCodes) {
            this.putQueryParameter("BussinessCodes", bussinessCodes);
            this.bussinessCodes = bussinessCodes;
            return this;
        }

        /**
         * CaseCodes.
         */
        public Builder caseCodes(java.util.List<String> caseCodes) {
            String caseCodesShrink = shrink(caseCodes, "CaseCodes", "json");
            this.putQueryParameter("CaseCodes", caseCodesShrink);
            this.caseCodes = caseCodes;
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
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
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
         * Ip.
         */
        public Builder ip(String ip) {
            this.putQueryParameter("Ip", ip);
            this.ip = ip;
            return this;
        }

        /**
         * Page.
         */
        public Builder page(String page) {
            this.putQueryParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PunishStatus.
         */
        public Builder punishStatus(java.util.List<String> punishStatus) {
            String punishStatusShrink = shrink(punishStatus, "PunishStatus", "json");
            this.putQueryParameter("PunishStatus", punishStatusShrink);
            this.punishStatus = punishStatus;
            return this;
        }

        /**
         * ResourceId.
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
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
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
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

        /**
         * UrlFuzzy.
         */
        public Builder urlFuzzy(String urlFuzzy) {
            this.putQueryParameter("UrlFuzzy", urlFuzzy);
            this.urlFuzzy = urlFuzzy;
            return this;
        }

        @Override
        public SearchPunishRecordsRequest build() {
            return new SearchPunishRecordsRequest(this);
        } 

    } 

}
