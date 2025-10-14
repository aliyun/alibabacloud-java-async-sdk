// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link ExecuteLogQueryRequest} extends {@link RequestModel}
 *
 * <p>ExecuteLogQueryRequest</p>
 */
public class ExecuteLogQueryRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExtendContentPacked")
    private String extendContentPacked;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LogProjectName")
    private String logProjectName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LogQuery")
    private String logQuery;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LogRegionId")
    private String logRegionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LogStoreName")
    private String logStoreName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LogUserId")
    private Long logUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NormalizationSchemaId")
    private String normalizationSchemaId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private ExecuteLogQueryRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.extendContentPacked = builder.extendContentPacked;
        this.lang = builder.lang;
        this.logProjectName = builder.logProjectName;
        this.logQuery = builder.logQuery;
        this.logRegionId = builder.logRegionId;
        this.logStoreName = builder.logStoreName;
        this.logUserId = builder.logUserId;
        this.normalizationSchemaId = builder.normalizationSchemaId;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteLogQueryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return extendContentPacked
     */
    public String getExtendContentPacked() {
        return this.extendContentPacked;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return logProjectName
     */
    public String getLogProjectName() {
        return this.logProjectName;
    }

    /**
     * @return logQuery
     */
    public String getLogQuery() {
        return this.logQuery;
    }

    /**
     * @return logRegionId
     */
    public String getLogRegionId() {
        return this.logRegionId;
    }

    /**
     * @return logStoreName
     */
    public String getLogStoreName() {
        return this.logStoreName;
    }

    /**
     * @return logUserId
     */
    public Long getLogUserId() {
        return this.logUserId;
    }

    /**
     * @return normalizationSchemaId
     */
    public String getNormalizationSchemaId() {
        return this.normalizationSchemaId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return roleFor
     */
    public Long getRoleFor() {
        return this.roleFor;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<ExecuteLogQueryRequest, Builder> {
        private String endTime; 
        private String extendContentPacked; 
        private String lang; 
        private String logProjectName; 
        private String logQuery; 
        private String logRegionId; 
        private String logStoreName; 
        private Long logUserId; 
        private String normalizationSchemaId; 
        private String regionId; 
        private Long roleFor; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(ExecuteLogQueryRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.extendContentPacked = request.extendContentPacked;
            this.lang = request.lang;
            this.logProjectName = request.logProjectName;
            this.logQuery = request.logQuery;
            this.logRegionId = request.logRegionId;
            this.logStoreName = request.logStoreName;
            this.logUserId = request.logUserId;
            this.normalizationSchemaId = request.normalizationSchemaId;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
            this.startTime = request.startTime;
        } 

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * ExtendContentPacked.
         */
        public Builder extendContentPacked(String extendContentPacked) {
            this.putBodyParameter("ExtendContentPacked", extendContentPacked);
            this.extendContentPacked = extendContentPacked;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * LogProjectName.
         */
        public Builder logProjectName(String logProjectName) {
            this.putBodyParameter("LogProjectName", logProjectName);
            this.logProjectName = logProjectName;
            return this;
        }

        /**
         * LogQuery.
         */
        public Builder logQuery(String logQuery) {
            this.putBodyParameter("LogQuery", logQuery);
            this.logQuery = logQuery;
            return this;
        }

        /**
         * LogRegionId.
         */
        public Builder logRegionId(String logRegionId) {
            this.putBodyParameter("LogRegionId", logRegionId);
            this.logRegionId = logRegionId;
            return this;
        }

        /**
         * LogStoreName.
         */
        public Builder logStoreName(String logStoreName) {
            this.putBodyParameter("LogStoreName", logStoreName);
            this.logStoreName = logStoreName;
            return this;
        }

        /**
         * LogUserId.
         */
        public Builder logUserId(Long logUserId) {
            this.putBodyParameter("LogUserId", logUserId);
            this.logUserId = logUserId;
            return this;
        }

        /**
         * NormalizationSchemaId.
         */
        public Builder normalizationSchemaId(String normalizationSchemaId) {
            this.putBodyParameter("NormalizationSchemaId", normalizationSchemaId);
            this.normalizationSchemaId = normalizationSchemaId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * RoleFor.
         */
        public Builder roleFor(Long roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public ExecuteLogQueryRequest build() {
            return new ExecuteLogQueryRequest(this);
        } 

    } 

}
