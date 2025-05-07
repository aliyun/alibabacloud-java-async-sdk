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
 * {@link SearchPunishRequestRequest} extends {@link RequestModel}
 *
 * <p>SearchPunishRequestRequest</p>
 */
public class SearchPunishRequestRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AntiStatuses")
    private java.util.List<String> antiStatuses;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BussinessCodes")
    private java.util.List<String> bussinessCodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Class")
    private String _class;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndDate")
    private Long endDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventCodes")
    private java.util.List<String> eventCodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtRequestId")
    private String extRequestId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdType")
    private String idType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Page")
    private Long page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PunishDomain")
    private String punishDomain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PunishIp")
    private String punishIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PunishStatuses")
    private java.util.List<String> punishStatuses;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PunishUrl")
    private String punishUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PunishUrlFull")
    private String punishUrlFull;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceCodes")
    private java.util.List<String> sourceCodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartDate")
    private Long startDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserIds")
    private java.util.List<String> userIds;

    private SearchPunishRequestRequest(Builder builder) {
        super(builder);
        this.antiStatuses = builder.antiStatuses;
        this.bussinessCodes = builder.bussinessCodes;
        this._class = builder._class;
        this.endDate = builder.endDate;
        this.eventCodes = builder.eventCodes;
        this.extRequestId = builder.extRequestId;
        this.id = builder.id;
        this.idType = builder.idType;
        this.instanceId = builder.instanceId;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.punishDomain = builder.punishDomain;
        this.punishIp = builder.punishIp;
        this.punishStatuses = builder.punishStatuses;
        this.punishUrl = builder.punishUrl;
        this.punishUrlFull = builder.punishUrlFull;
        this.sourceCodes = builder.sourceCodes;
        this.startDate = builder.startDate;
        this.userIds = builder.userIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchPunishRequestRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return antiStatuses
     */
    public java.util.List<String> getAntiStatuses() {
        return this.antiStatuses;
    }

    /**
     * @return bussinessCodes
     */
    public java.util.List<String> getBussinessCodes() {
        return this.bussinessCodes;
    }

    /**
     * @return _class
     */
    public String get_class() {
        return this._class;
    }

    /**
     * @return endDate
     */
    public Long getEndDate() {
        return this.endDate;
    }

    /**
     * @return eventCodes
     */
    public java.util.List<String> getEventCodes() {
        return this.eventCodes;
    }

    /**
     * @return extRequestId
     */
    public String getExtRequestId() {
        return this.extRequestId;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return idType
     */
    public String getIdType() {
        return this.idType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return page
     */
    public Long getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return punishDomain
     */
    public String getPunishDomain() {
        return this.punishDomain;
    }

    /**
     * @return punishIp
     */
    public String getPunishIp() {
        return this.punishIp;
    }

    /**
     * @return punishStatuses
     */
    public java.util.List<String> getPunishStatuses() {
        return this.punishStatuses;
    }

    /**
     * @return punishUrl
     */
    public String getPunishUrl() {
        return this.punishUrl;
    }

    /**
     * @return punishUrlFull
     */
    public String getPunishUrlFull() {
        return this.punishUrlFull;
    }

    /**
     * @return sourceCodes
     */
    public java.util.List<String> getSourceCodes() {
        return this.sourceCodes;
    }

    /**
     * @return startDate
     */
    public Long getStartDate() {
        return this.startDate;
    }

    /**
     * @return userIds
     */
    public java.util.List<String> getUserIds() {
        return this.userIds;
    }

    public static final class Builder extends Request.Builder<SearchPunishRequestRequest, Builder> {
        private java.util.List<String> antiStatuses; 
        private java.util.List<String> bussinessCodes; 
        private String _class; 
        private Long endDate; 
        private java.util.List<String> eventCodes; 
        private String extRequestId; 
        private Long id; 
        private String idType; 
        private String instanceId; 
        private Long page; 
        private Long pageSize; 
        private String punishDomain; 
        private String punishIp; 
        private java.util.List<String> punishStatuses; 
        private String punishUrl; 
        private String punishUrlFull; 
        private java.util.List<String> sourceCodes; 
        private Long startDate; 
        private java.util.List<String> userIds; 

        private Builder() {
            super();
        } 

        private Builder(SearchPunishRequestRequest request) {
            super(request);
            this.antiStatuses = request.antiStatuses;
            this.bussinessCodes = request.bussinessCodes;
            this._class = request._class;
            this.endDate = request.endDate;
            this.eventCodes = request.eventCodes;
            this.extRequestId = request.extRequestId;
            this.id = request.id;
            this.idType = request.idType;
            this.instanceId = request.instanceId;
            this.page = request.page;
            this.pageSize = request.pageSize;
            this.punishDomain = request.punishDomain;
            this.punishIp = request.punishIp;
            this.punishStatuses = request.punishStatuses;
            this.punishUrl = request.punishUrl;
            this.punishUrlFull = request.punishUrlFull;
            this.sourceCodes = request.sourceCodes;
            this.startDate = request.startDate;
            this.userIds = request.userIds;
        } 

        /**
         * AntiStatuses.
         */
        public Builder antiStatuses(java.util.List<String> antiStatuses) {
            String antiStatusesShrink = shrink(antiStatuses, "AntiStatuses", "json");
            this.putQueryParameter("AntiStatuses", antiStatusesShrink);
            this.antiStatuses = antiStatuses;
            return this;
        }

        /**
         * BussinessCodes.
         */
        public Builder bussinessCodes(java.util.List<String> bussinessCodes) {
            String bussinessCodesShrink = shrink(bussinessCodes, "BussinessCodes", "json");
            this.putQueryParameter("BussinessCodes", bussinessCodesShrink);
            this.bussinessCodes = bussinessCodes;
            return this;
        }

        /**
         * Class.
         */
        public Builder _class(String _class) {
            this.putQueryParameter("Class", _class);
            this._class = _class;
            return this;
        }

        /**
         * EndDate.
         */
        public Builder endDate(Long endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
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
         * ExtRequestId.
         */
        public Builder extRequestId(String extRequestId) {
            this.putQueryParameter("ExtRequestId", extRequestId);
            this.extRequestId = extRequestId;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * IdType.
         */
        public Builder idType(String idType) {
            this.putQueryParameter("IdType", idType);
            this.idType = idType;
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
         * Page.
         */
        public Builder page(Long page) {
            this.putQueryParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PunishDomain.
         */
        public Builder punishDomain(String punishDomain) {
            this.putQueryParameter("PunishDomain", punishDomain);
            this.punishDomain = punishDomain;
            return this;
        }

        /**
         * PunishIp.
         */
        public Builder punishIp(String punishIp) {
            this.putQueryParameter("PunishIp", punishIp);
            this.punishIp = punishIp;
            return this;
        }

        /**
         * PunishStatuses.
         */
        public Builder punishStatuses(java.util.List<String> punishStatuses) {
            String punishStatusesShrink = shrink(punishStatuses, "PunishStatuses", "json");
            this.putQueryParameter("PunishStatuses", punishStatusesShrink);
            this.punishStatuses = punishStatuses;
            return this;
        }

        /**
         * PunishUrl.
         */
        public Builder punishUrl(String punishUrl) {
            this.putQueryParameter("PunishUrl", punishUrl);
            this.punishUrl = punishUrl;
            return this;
        }

        /**
         * PunishUrlFull.
         */
        public Builder punishUrlFull(String punishUrlFull) {
            this.putQueryParameter("PunishUrlFull", punishUrlFull);
            this.punishUrlFull = punishUrlFull;
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
         * StartDate.
         */
        public Builder startDate(Long startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * UserIds.
         */
        public Builder userIds(java.util.List<String> userIds) {
            String userIdsShrink = shrink(userIds, "UserIds", "json");
            this.putQueryParameter("UserIds", userIdsShrink);
            this.userIds = userIds;
            return this;
        }

        @Override
        public SearchPunishRequestRequest build() {
            return new SearchPunishRequestRequest(this);
        } 

    } 

}
