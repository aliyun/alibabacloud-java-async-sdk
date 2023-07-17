// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportCustomAlertRulesRequest} extends {@link RequestModel}
 *
 * <p>ImportCustomAlertRulesRequest</p>
 */
public class ImportCustomAlertRulesRequest extends Request {
    @Query
    @NameInMap("ContactGroupIds")
    private String contactGroupIds;

    @Query
    @NameInMap("IsAutoStart")
    private Boolean isAutoStart;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("TemplageAlertConfig")
    private String templageAlertConfig;

    @Query
    @NameInMap("TemplateAlertConfig")
    private String templateAlertConfig;

    private ImportCustomAlertRulesRequest(Builder builder) {
        super(builder);
        this.contactGroupIds = builder.contactGroupIds;
        this.isAutoStart = builder.isAutoStart;
        this.regionId = builder.regionId;
        this.templageAlertConfig = builder.templageAlertConfig;
        this.templateAlertConfig = builder.templateAlertConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportCustomAlertRulesRequest create() {
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
     * @return templateAlertConfig
     */
    public String getTemplateAlertConfig() {
        return this.templateAlertConfig;
    }

    public static final class Builder extends Request.Builder<ImportCustomAlertRulesRequest, Builder> {
        private String contactGroupIds; 
        private Boolean isAutoStart; 
        private String regionId; 
        private String templageAlertConfig; 
        private String templateAlertConfig; 

        private Builder() {
            super();
        } 

        private Builder(ImportCustomAlertRulesRequest request) {
            super(request);
            this.contactGroupIds = request.contactGroupIds;
            this.isAutoStart = request.isAutoStart;
            this.regionId = request.regionId;
            this.templageAlertConfig = request.templageAlertConfig;
            this.templateAlertConfig = request.templateAlertConfig;
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
         * RegionId.
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
         * TemplateAlertConfig.
         */
        public Builder templateAlertConfig(String templateAlertConfig) {
            this.putQueryParameter("TemplateAlertConfig", templateAlertConfig);
            this.templateAlertConfig = templateAlertConfig;
            return this;
        }

        @Override
        public ImportCustomAlertRulesRequest build() {
            return new ImportCustomAlertRulesRequest(this);
        } 

    } 

}
