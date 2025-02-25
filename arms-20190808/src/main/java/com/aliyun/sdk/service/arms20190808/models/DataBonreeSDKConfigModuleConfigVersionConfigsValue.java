// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link DataBonreeSDKConfigModuleConfigVersionConfigsValue} extends {@link TeaModel}
 *
 * <p>DataBonreeSDKConfigModuleConfigVersionConfigsValue</p>
 */
public class DataBonreeSDKConfigModuleConfigVersionConfigsValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("useCustom")
    private Boolean useCustom;

    @com.aliyun.core.annotation.NameInMap("customConfig")
    private java.util.Map<String, DataBonreeSDKConfigModuleConfigVersionConfigsValueCustomConfigValue> customConfig;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("updateTime")
    private Long updateTime;

    private DataBonreeSDKConfigModuleConfigVersionConfigsValue(Builder builder) {
        this.useCustom = builder.useCustom;
        this.customConfig = builder.customConfig;
        this.description = builder.description;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataBonreeSDKConfigModuleConfigVersionConfigsValue create() {
        return builder().build();
    }

    /**
     * @return useCustom
     */
    public Boolean getUseCustom() {
        return this.useCustom;
    }

    /**
     * @return customConfig
     */
    public java.util.Map<String, DataBonreeSDKConfigModuleConfigVersionConfigsValueCustomConfigValue> getCustomConfig() {
        return this.customConfig;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return updateTime
     */
    public Long getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private Boolean useCustom; 
        private java.util.Map<String, DataBonreeSDKConfigModuleConfigVersionConfigsValueCustomConfigValue> customConfig; 
        private String description; 
        private Long updateTime; 

        /**
         * <p>Indicates whether the custom configuration is used.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder useCustom(Boolean useCustom) {
            this.useCustom = useCustom;
            return this;
        }

        /**
         * <p>The custom configuration.</p>
         */
        public Builder customConfig(java.util.Map<String, DataBonreeSDKConfigModuleConfigVersionConfigsValueCustomConfigValue> customConfig) {
            this.customConfig = customConfig;
            return this;
        }

        /**
         * <p>The description of the version configuration.</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The time when the version configuration was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1721112372055</p>
         */
        public Builder updateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public DataBonreeSDKConfigModuleConfigVersionConfigsValue build() {
            return new DataBonreeSDKConfigModuleConfigVersionConfigsValue(this);
        } 

    } 

}
