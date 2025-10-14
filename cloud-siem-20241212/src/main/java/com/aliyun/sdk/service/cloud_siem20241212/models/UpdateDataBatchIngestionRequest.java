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
 * {@link UpdateDataBatchIngestionRequest} extends {@link RequestModel}
 *
 * <p>UpdateDataBatchIngestionRequest</p>
 */
public class UpdateDataBatchIngestionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoScanNew")
    private String autoScanNew;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataBatchIngestionMode")
    private String dataBatchIngestionMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataIngestionIds")
    private java.util.List<String> dataIngestionIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSourceRecognizeEnabled")
    private Boolean dataSourceRecognizeEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LogUserIds")
    private java.util.List<Long> logUserIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    private UpdateDataBatchIngestionRequest(Builder builder) {
        super(builder);
        this.autoScanNew = builder.autoScanNew;
        this.dataBatchIngestionMode = builder.dataBatchIngestionMode;
        this.dataIngestionIds = builder.dataIngestionIds;
        this.dataSourceRecognizeEnabled = builder.dataSourceRecognizeEnabled;
        this.lang = builder.lang;
        this.logUserIds = builder.logUserIds;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDataBatchIngestionRequest create() {
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
     * @return dataBatchIngestionMode
     */
    public String getDataBatchIngestionMode() {
        return this.dataBatchIngestionMode;
    }

    /**
     * @return dataIngestionIds
     */
    public java.util.List<String> getDataIngestionIds() {
        return this.dataIngestionIds;
    }

    /**
     * @return dataSourceRecognizeEnabled
     */
    public Boolean getDataSourceRecognizeEnabled() {
        return this.dataSourceRecognizeEnabled;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return logUserIds
     */
    public java.util.List<Long> getLogUserIds() {
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

    public static final class Builder extends Request.Builder<UpdateDataBatchIngestionRequest, Builder> {
        private String autoScanNew; 
        private String dataBatchIngestionMode; 
        private java.util.List<String> dataIngestionIds; 
        private Boolean dataSourceRecognizeEnabled; 
        private String lang; 
        private java.util.List<Long> logUserIds; 
        private String regionId; 
        private Long roleFor; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDataBatchIngestionRequest request) {
            super(request);
            this.autoScanNew = request.autoScanNew;
            this.dataBatchIngestionMode = request.dataBatchIngestionMode;
            this.dataIngestionIds = request.dataIngestionIds;
            this.dataSourceRecognizeEnabled = request.dataSourceRecognizeEnabled;
            this.lang = request.lang;
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
         * DataBatchIngestionMode.
         */
        public Builder dataBatchIngestionMode(String dataBatchIngestionMode) {
            this.putBodyParameter("DataBatchIngestionMode", dataBatchIngestionMode);
            this.dataBatchIngestionMode = dataBatchIngestionMode;
            return this;
        }

        /**
         * DataIngestionIds.
         */
        public Builder dataIngestionIds(java.util.List<String> dataIngestionIds) {
            String dataIngestionIdsShrink = shrink(dataIngestionIds, "DataIngestionIds", "simple");
            this.putBodyParameter("DataIngestionIds", dataIngestionIdsShrink);
            this.dataIngestionIds = dataIngestionIds;
            return this;
        }

        /**
         * DataSourceRecognizeEnabled.
         */
        public Builder dataSourceRecognizeEnabled(Boolean dataSourceRecognizeEnabled) {
            this.putBodyParameter("DataSourceRecognizeEnabled", dataSourceRecognizeEnabled);
            this.dataSourceRecognizeEnabled = dataSourceRecognizeEnabled;
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
         * LogUserIds.
         */
        public Builder logUserIds(java.util.List<Long> logUserIds) {
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
        public UpdateDataBatchIngestionRequest build() {
            return new UpdateDataBatchIngestionRequest(this);
        } 

    } 

}
