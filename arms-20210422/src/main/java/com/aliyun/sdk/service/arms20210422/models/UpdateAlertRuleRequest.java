// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAlertRuleRequest} extends {@link RequestModel}
 *
 * <p>UpdateAlertRuleRequest</p>
 */
public class UpdateAlertRuleRequest extends Request {
    @Query
    @NameInMap("AlertId")
    @Validation(required = true)
    private Long alertId;

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
    @Validation(required = true)
    private String templageAlertConfig;

    private UpdateAlertRuleRequest(Builder builder) {
        super(builder);
        this.alertId = builder.alertId;
        this.contactGroupIds = builder.contactGroupIds;
        this.isAutoStart = builder.isAutoStart;
        this.regionId = builder.regionId;
        this.templageAlertConfig = builder.templageAlertConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAlertRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertId
     */
    public Long getAlertId() {
        return this.alertId;
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

    public static final class Builder extends Request.Builder<UpdateAlertRuleRequest, Builder> {
        private Long alertId; 
        private String contactGroupIds; 
        private Boolean isAutoStart; 
        private String regionId; 
        private String templageAlertConfig; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAlertRuleRequest request) {
            super(request);
            this.alertId = request.alertId;
            this.contactGroupIds = request.contactGroupIds;
            this.isAutoStart = request.isAutoStart;
            this.regionId = request.regionId;
            this.templageAlertConfig = request.templageAlertConfig;
        } 

        /**
         * AlertId.
         */
        public Builder alertId(Long alertId) {
            this.putQueryParameter("AlertId", alertId);
            this.alertId = alertId;
            return this;
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

        @Override
        public UpdateAlertRuleRequest build() {
            return new UpdateAlertRuleRequest(this);
        } 

    } 

}
