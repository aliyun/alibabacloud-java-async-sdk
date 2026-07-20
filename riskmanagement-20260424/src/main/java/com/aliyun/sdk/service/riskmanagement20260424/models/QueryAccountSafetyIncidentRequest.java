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
 * {@link QueryAccountSafetyIncidentRequest} extends {@link RequestModel}
 *
 * <p>QueryAccountSafetyIncidentRequest</p>
 */
public class QueryAccountSafetyIncidentRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliyunLang")
    private String aliyunLang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CaseCode")
    private String caseCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Current")
    private String current;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventId")
    private String eventId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PunishEndTime")
    private String punishEndTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PunishStartTime")
    private String punishStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private String resourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private QueryAccountSafetyIncidentRequest(Builder builder) {
        super(builder);
        this.aliyunLang = builder.aliyunLang;
        this.caseCode = builder.caseCode;
        this.current = builder.current;
        this.eventId = builder.eventId;
        this.pageSize = builder.pageSize;
        this.punishEndTime = builder.punishEndTime;
        this.punishStartTime = builder.punishStartTime;
        this.resourceId = builder.resourceId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAccountSafetyIncidentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliyunLang
     */
    public String getAliyunLang() {
        return this.aliyunLang;
    }

    /**
     * @return caseCode
     */
    public String getCaseCode() {
        return this.caseCode;
    }

    /**
     * @return current
     */
    public String getCurrent() {
        return this.current;
    }

    /**
     * @return eventId
     */
    public String getEventId() {
        return this.eventId;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
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
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<QueryAccountSafetyIncidentRequest, Builder> {
        private String aliyunLang; 
        private String caseCode; 
        private String current; 
        private String eventId; 
        private String pageSize; 
        private String punishEndTime; 
        private String punishStartTime; 
        private String resourceId; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(QueryAccountSafetyIncidentRequest request) {
            super(request);
            this.aliyunLang = request.aliyunLang;
            this.caseCode = request.caseCode;
            this.current = request.current;
            this.eventId = request.eventId;
            this.pageSize = request.pageSize;
            this.punishEndTime = request.punishEndTime;
            this.punishStartTime = request.punishStartTime;
            this.resourceId = request.resourceId;
            this.status = request.status;
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
         * CaseCode.
         */
        public Builder caseCode(String caseCode) {
            this.putQueryParameter("CaseCode", caseCode);
            this.caseCode = caseCode;
            return this;
        }

        /**
         * Current.
         */
        public Builder current(String current) {
            this.putQueryParameter("Current", current);
            this.current = current;
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
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
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
         * ResourceId.
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
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

        @Override
        public QueryAccountSafetyIncidentRequest build() {
            return new QueryAccountSafetyIncidentRequest(this);
        } 

    } 

}
