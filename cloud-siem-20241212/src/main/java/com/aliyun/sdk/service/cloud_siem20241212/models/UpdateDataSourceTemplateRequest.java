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
 * {@link UpdateDataSourceTemplateRequest} extends {@link RequestModel}
 *
 * <p>UpdateDataSourceTemplateRequest</p>
 */
public class UpdateDataSourceTemplateRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoScanNew")
    private String autoScanNew;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataSourceRecognizeEnabled")
    private Boolean dataSourceRecognizeEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSourceTemplateId")
    private String dataSourceTemplateId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSourceTemplateName")
    private String dataSourceTemplateName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LogProjectPattern")
    private String logProjectPattern;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LogRegionIds")
    private String logRegionIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LogStorePattern")
    private String logStorePattern;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LogUserIds")
    private java.util.List<String> logUserIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    private UpdateDataSourceTemplateRequest(Builder builder) {
        super(builder);
        this.autoScanNew = builder.autoScanNew;
        this.dataSourceRecognizeEnabled = builder.dataSourceRecognizeEnabled;
        this.dataSourceTemplateId = builder.dataSourceTemplateId;
        this.dataSourceTemplateName = builder.dataSourceTemplateName;
        this.lang = builder.lang;
        this.logProjectPattern = builder.logProjectPattern;
        this.logRegionIds = builder.logRegionIds;
        this.logStorePattern = builder.logStorePattern;
        this.logUserIds = builder.logUserIds;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDataSourceTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoScanNew
     */
    public String getAutoScanNew() {
        return this.autoScanNew;
    }

    /**
     * @return dataSourceRecognizeEnabled
     */
    public Boolean getDataSourceRecognizeEnabled() {
        return this.dataSourceRecognizeEnabled;
    }

    /**
     * @return dataSourceTemplateId
     */
    public String getDataSourceTemplateId() {
        return this.dataSourceTemplateId;
    }

    /**
     * @return dataSourceTemplateName
     */
    public String getDataSourceTemplateName() {
        return this.dataSourceTemplateName;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return logProjectPattern
     */
    public String getLogProjectPattern() {
        return this.logProjectPattern;
    }

    /**
     * @return logRegionIds
     */
    public String getLogRegionIds() {
        return this.logRegionIds;
    }

    /**
     * @return logStorePattern
     */
    public String getLogStorePattern() {
        return this.logStorePattern;
    }

    /**
     * @return logUserIds
     */
    public java.util.List<String> getLogUserIds() {
        return this.logUserIds;
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

    public static final class Builder extends Request.Builder<UpdateDataSourceTemplateRequest, Builder> {
        private String autoScanNew; 
        private Boolean dataSourceRecognizeEnabled; 
        private String dataSourceTemplateId; 
        private String dataSourceTemplateName; 
        private String lang; 
        private String logProjectPattern; 
        private String logRegionIds; 
        private String logStorePattern; 
        private java.util.List<String> logUserIds; 
        private String regionId; 
        private Long roleFor; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDataSourceTemplateRequest request) {
            super(request);
            this.autoScanNew = request.autoScanNew;
            this.dataSourceRecognizeEnabled = request.dataSourceRecognizeEnabled;
            this.dataSourceTemplateId = request.dataSourceTemplateId;
            this.dataSourceTemplateName = request.dataSourceTemplateName;
            this.lang = request.lang;
            this.logProjectPattern = request.logProjectPattern;
            this.logRegionIds = request.logRegionIds;
            this.logStorePattern = request.logStorePattern;
            this.logUserIds = request.logUserIds;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
        } 

        /**
         * AutoScanNew.
         */
        public Builder autoScanNew(String autoScanNew) {
            this.putBodyParameter("AutoScanNew", autoScanNew);
            this.autoScanNew = autoScanNew;
            return this;
        }

        /**
         * DataSourceRecognizeEnabled.
         */
        public Builder dataSourceRecognizeEnabled(Boolean dataSourceRecognizeEnabled) {
            this.putQueryParameter("DataSourceRecognizeEnabled", dataSourceRecognizeEnabled);
            this.dataSourceRecognizeEnabled = dataSourceRecognizeEnabled;
            return this;
        }

        /**
         * DataSourceTemplateId.
         */
        public Builder dataSourceTemplateId(String dataSourceTemplateId) {
            this.putBodyParameter("DataSourceTemplateId", dataSourceTemplateId);
            this.dataSourceTemplateId = dataSourceTemplateId;
            return this;
        }

        /**
         * DataSourceTemplateName.
         */
        public Builder dataSourceTemplateName(String dataSourceTemplateName) {
            this.putBodyParameter("DataSourceTemplateName", dataSourceTemplateName);
            this.dataSourceTemplateName = dataSourceTemplateName;
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
         * LogProjectPattern.
         */
        public Builder logProjectPattern(String logProjectPattern) {
            this.putBodyParameter("LogProjectPattern", logProjectPattern);
            this.logProjectPattern = logProjectPattern;
            return this;
        }

        /**
         * LogRegionIds.
         */
        public Builder logRegionIds(String logRegionIds) {
            this.putBodyParameter("LogRegionIds", logRegionIds);
            this.logRegionIds = logRegionIds;
            return this;
        }

        /**
         * LogStorePattern.
         */
        public Builder logStorePattern(String logStorePattern) {
            this.putBodyParameter("LogStorePattern", logStorePattern);
            this.logStorePattern = logStorePattern;
            return this;
        }

        /**
         * LogUserIds.
         */
        public Builder logUserIds(java.util.List<String> logUserIds) {
            String logUserIdsShrink = shrink(logUserIds, "LogUserIds", "simple");
            this.putBodyParameter("LogUserIds", logUserIdsShrink);
            this.logUserIds = logUserIds;
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

        @Override
        public UpdateDataSourceTemplateRequest build() {
            return new UpdateDataSourceTemplateRequest(this);
        } 

    } 

}
