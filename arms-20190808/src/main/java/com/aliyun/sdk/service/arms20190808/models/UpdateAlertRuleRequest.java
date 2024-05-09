// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAlertRuleRequest} extends {@link RequestModel}
 *
 * <p>UpdateAlertRuleRequest</p>
 */
public class UpdateAlertRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlertId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long alertId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactGroupIds")
    private String contactGroupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsAutoStart")
    private Boolean isAutoStart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplageAlertConfig")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * The ID of the alert rule.
         */
        public Builder alertId(Long alertId) {
            this.putQueryParameter("AlertId", alertId);
            this.alertId = alertId;
            return this;
        }

        /**
         * The IDs of the alert contact groups. The value must be a JSON array.
         */
        public Builder contactGroupIds(String contactGroupIds) {
            this.putQueryParameter("ContactGroupIds", contactGroupIds);
            this.contactGroupIds = contactGroupIds;
            return this;
        }

        /**
         * Specifies whether to enable the alert rule after it is created. Default value: `false`.
         * <p>
         * 
         * *   `true`: enables the alert rule.
         * *   `false`: disables the alert rule.
         */
        public Builder isAutoStart(Boolean isAutoStart) {
            this.putQueryParameter("IsAutoStart", isAutoStart);
            this.isAutoStart = isAutoStart;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The configurations of the alert template based on which you want to create an alert rule. The value must be a JSON string. You must set at least one of the **TemplateAlertId** and **TemplageAlertConfig** parameters. If you set both parameters, the **TemplateAlertId** parameter prevails. For more information about the TemplageAlertConfig parameter, see the following **additional information about the TemplageAlertConfig parameter**.
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
