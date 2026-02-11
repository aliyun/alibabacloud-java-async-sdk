// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

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
 * {@link ImportAppAlertRulesRequest} extends {@link RequestModel}
 *
 * <p>ImportAppAlertRulesRequest</p>
 */
public class ImportAppAlertRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactGroupIds")
    private String contactGroupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsAutoStart")
    private Boolean isAutoStart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Pids")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pids;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplageAlertConfig")
    private String templageAlertConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateAlertId")
    private String templateAlertId;

    private ImportAppAlertRulesRequest(Builder builder) {
        super(builder);
        this.contactGroupIds = builder.contactGroupIds;
        this.isAutoStart = builder.isAutoStart;
        this.pids = builder.pids;
        this.regionId = builder.regionId;
        this.templageAlertConfig = builder.templageAlertConfig;
        this.templateAlertId = builder.templateAlertId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportAppAlertRulesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contactGroupIds
     */
    public String getContactGroupIds() {
        return this.contactGroupIds;
    }

    /**
     * @return isAutoStart
     */
    public Boolean getIsAutoStart() {
        return this.isAutoStart;
    }

    /**
     * @return pids
     */
    public String getPids() {
        return this.pids;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return templageAlertConfig
     */
    public String getTemplageAlertConfig() {
        return this.templageAlertConfig;
    }

    /**
     * @return templateAlertId
     */
    public String getTemplateAlertId() {
        return this.templateAlertId;
    }

    public static final class Builder extends Request.Builder<ImportAppAlertRulesRequest, Builder> {
        private String contactGroupIds; 
        private Boolean isAutoStart; 
        private String pids; 
        private String regionId; 
        private String templageAlertConfig; 
        private String templateAlertId; 

        private Builder() {
            super();
        } 

        private Builder(ImportAppAlertRulesRequest request) {
            super(request);
            this.contactGroupIds = request.contactGroupIds;
            this.isAutoStart = request.isAutoStart;
            this.pids = request.pids;
            this.regionId = request.regionId;
            this.templageAlertConfig = request.templageAlertConfig;
            this.templateAlertId = request.templateAlertId;
        } 

        /**
         * ContactGroupIds.
         */
        public Builder contactGroupIds(String contactGroupIds) {
            this.putQueryParameter("ContactGroupIds", contactGroupIds);
            this.contactGroupIds = contactGroupIds;
            return this;
        }

        /**
         * IsAutoStart.
         */
        public Builder isAutoStart(Boolean isAutoStart) {
            this.putQueryParameter("IsAutoStart", isAutoStart);
            this.isAutoStart = isAutoStart;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder pids(String pids) {
            this.putQueryParameter("Pids", pids);
            this.pids = pids;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * TemplageAlertConfig.
         */
        public Builder templageAlertConfig(String templageAlertConfig) {
            this.putQueryParameter("TemplageAlertConfig", templageAlertConfig);
            this.templageAlertConfig = templageAlertConfig;
            return this;
        }

        /**
         * TemplateAlertId.
         */
        public Builder templateAlertId(String templateAlertId) {
            this.putQueryParameter("TemplateAlertId", templateAlertId);
            this.templateAlertId = templateAlertId;
            return this;
        }

        @Override
        public ImportAppAlertRulesRequest build() {
            return new ImportAppAlertRulesRequest(this);
        } 

    } 

}
