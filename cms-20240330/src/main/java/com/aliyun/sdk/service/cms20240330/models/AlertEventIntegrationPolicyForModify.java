// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AlertEventIntegrationPolicyForModify} extends {@link TeaModel}
 *
 * <p>AlertEventIntegrationPolicyForModify</p>
 */
public class AlertEventIntegrationPolicyForModify extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("alertEventIntegrationPolicyName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String alertEventIntegrationPolicyName;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("filterSetting")
    private FilterSetting filterSetting;

    @com.aliyun.core.annotation.NameInMap("integrationSetting")
    private String integrationSetting;

    @com.aliyun.core.annotation.NameInMap("transformerSetting")
    private java.util.List < TransformAction > transformerSetting;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private AlertEventIntegrationPolicyForModify(Builder builder) {
        this.alertEventIntegrationPolicyName = builder.alertEventIntegrationPolicyName;
        this.description = builder.description;
        this.filterSetting = builder.filterSetting;
        this.integrationSetting = builder.integrationSetting;
        this.transformerSetting = builder.transformerSetting;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AlertEventIntegrationPolicyForModify create() {
        return builder().build();
    }

    /**
     * @return alertEventIntegrationPolicyName
     */
    public String getAlertEventIntegrationPolicyName() {
        return this.alertEventIntegrationPolicyName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return filterSetting
     */
    public FilterSetting getFilterSetting() {
        return this.filterSetting;
    }

    /**
     * @return integrationSetting
     */
    public String getIntegrationSetting() {
        return this.integrationSetting;
    }

    /**
     * @return transformerSetting
     */
    public java.util.List < TransformAction > getTransformerSetting() {
        return this.transformerSetting;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String alertEventIntegrationPolicyName; 
        private String description; 
        private FilterSetting filterSetting; 
        private String integrationSetting; 
        private java.util.List < TransformAction > transformerSetting; 
        private String type; 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder alertEventIntegrationPolicyName(String alertEventIntegrationPolicyName) {
            this.alertEventIntegrationPolicyName = alertEventIntegrationPolicyName;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * filterSetting.
         */
        public Builder filterSetting(FilterSetting filterSetting) {
            this.filterSetting = filterSetting;
            return this;
        }

        /**
         * integrationSetting.
         */
        public Builder integrationSetting(String integrationSetting) {
            this.integrationSetting = integrationSetting;
            return this;
        }

        /**
         * transformerSetting.
         */
        public Builder transformerSetting(java.util.List < TransformAction > transformerSetting) {
            this.transformerSetting = transformerSetting;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public AlertEventIntegrationPolicyForModify build() {
            return new AlertEventIntegrationPolicyForModify(this);
        } 

    } 

}
