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
         * <p>Specifies whether to automatically discover new users.</p>
         * <ul>
         * <li><p>enabled: Enables the feature.</p>
         * </li>
         * <li><p>disabled: Disables the feature.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        public Builder autoScanNew(String autoScanNew) {
            this.putBodyParameter("AutoScanNew", autoScanNew);
            this.autoScanNew = autoScanNew;
            return this;
        }

        /**
         * <p>The mode for batch data ingestion. Valid values:</p>
         * <ul>
         * <li><p>full</p>
         * </li>
         * <li><p>increment</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>full</p>
         */
        public Builder dataBatchIngestionMode(String dataBatchIngestionMode) {
            this.putBodyParameter("DataBatchIngestionMode", dataBatchIngestionMode);
            this.dataBatchIngestionMode = dataBatchIngestionMode;
            return this;
        }

        /**
         * <p>The list of ingestion policy IDs.</p>
         */
        public Builder dataIngestionIds(java.util.List<String> dataIngestionIds) {
            String dataIngestionIdsShrink = shrink(dataIngestionIds, "DataIngestionIds", "simple");
            this.putBodyParameter("DataIngestionIds", dataIngestionIdsShrink);
            this.dataIngestionIds = dataIngestionIds;
            return this;
        }

        /**
         * <p>Specifies whether to automatically discover new Logstores.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder dataSourceRecognizeEnabled(Boolean dataSourceRecognizeEnabled) {
            this.putBodyParameter("DataSourceRecognizeEnabled", dataSourceRecognizeEnabled);
            this.dataSourceRecognizeEnabled = dataSourceRecognizeEnabled;
            return this;
        }

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li><p><strong>zh</strong> (default): Chinese.</p>
         * </li>
         * <li><p><strong>en</strong>: English.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The list of user IDs for batch data ingestion.</p>
         */
        public Builder logUserIds(java.util.List<Long> logUserIds) {
            String logUserIdsShrink = shrink(logUserIds, "LogUserIds", "simple");
            this.putBodyParameter("LogUserIds", logUserIdsShrink);
            this.logUserIds = logUserIds;
            return this;
        }

        /**
         * <p>The region of the Data Management hub for threat analysis. Select a region for the management hub based on the region of your assets. Valid values:</p>
         * <ul>
         * <li><p>cn-hangzhou: Your assets are in the Chinese mainland.</p>
         * </li>
         * <li><p>ap-southeast-1: Your assets are in a region outside China.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The user ID of the member whose perspective the administrator wants to switch to.</p>
         * 
         * <strong>example:</strong>
         * <p>173326*******</p>
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
