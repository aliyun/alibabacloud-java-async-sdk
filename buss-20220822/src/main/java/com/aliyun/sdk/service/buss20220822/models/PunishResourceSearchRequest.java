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
 * {@link PunishResourceSearchRequest} extends {@link RequestModel}
 *
 * <p>PunishResourceSearchRequest</p>
 */
public class PunishResourceSearchRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActionCodes")
    private java.util.List<String> actionCodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BussinessCodes")
    private java.util.List<String> bussinessCodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Class")
    private String _class;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndDate")
    private Long endDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ip")
    private String ip;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Page")
    private Long page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceCodes")
    private java.util.List<String> sourceCodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartDate")
    private Long startDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Url")
    private String url;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserIds")
    private java.util.List<String> userIds;

    private PunishResourceSearchRequest(Builder builder) {
        super(builder);
        this.actionCodes = builder.actionCodes;
        this.bussinessCodes = builder.bussinessCodes;
        this._class = builder._class;
        this.domain = builder.domain;
        this.endDate = builder.endDate;
        this.instanceId = builder.instanceId;
        this.ip = builder.ip;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.sourceCodes = builder.sourceCodes;
        this.startDate = builder.startDate;
        this.status = builder.status;
        this.url = builder.url;
        this.userIds = builder.userIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PunishResourceSearchRequest create() {
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
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return endDate
     */
    public Long getEndDate() {
        return this.endDate;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * @return userIds
     */
    public java.util.List<String> getUserIds() {
        return this.userIds;
    }

    public static final class Builder extends Request.Builder<PunishResourceSearchRequest, Builder> {
        private java.util.List<String> actionCodes; 
        private java.util.List<String> bussinessCodes; 
        private String _class; 
        private String domain; 
        private Long endDate; 
        private String instanceId; 
        private String ip; 
        private Long page; 
        private Long pageSize; 
        private java.util.List<String> sourceCodes; 
        private Long startDate; 
        private String status; 
        private String url; 
        private java.util.List<String> userIds; 

        private Builder() {
            super();
        } 

        private Builder(PunishResourceSearchRequest request) {
            super(request);
            this.actionCodes = request.actionCodes;
            this.bussinessCodes = request.bussinessCodes;
            this._class = request._class;
            this.domain = request.domain;
            this.endDate = request.endDate;
            this.instanceId = request.instanceId;
            this.ip = request.ip;
            this.page = request.page;
            this.pageSize = request.pageSize;
            this.sourceCodes = request.sourceCodes;
            this.startDate = request.startDate;
            this.status = request.status;
            this.url = request.url;
            this.userIds = request.userIds;
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
         * Domain.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
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
         * UserIds.
         */
        public Builder userIds(java.util.List<String> userIds) {
            String userIdsShrink = shrink(userIds, "UserIds", "json");
            this.putQueryParameter("UserIds", userIdsShrink);
            this.userIds = userIds;
            return this;
        }

        @Override
        public PunishResourceSearchRequest build() {
            return new PunishResourceSearchRequest(this);
        } 

    } 

}
