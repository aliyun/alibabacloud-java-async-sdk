// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DataBonreeSDKConfigModuleConfigVersionConfigsValueCustomConfigValue} extends {@link TeaModel}
 *
 * <p>DataBonreeSDKConfigModuleConfigVersionConfigsValueCustomConfigValue</p>
 */
public class DataBonreeSDKConfigModuleConfigVersionConfigsValueCustomConfigValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("enable")
    private Boolean enable;

    private DataBonreeSDKConfigModuleConfigVersionConfigsValueCustomConfigValue(Builder builder) {
        this.enable = builder.enable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataBonreeSDKConfigModuleConfigVersionConfigsValueCustomConfigValue create() {
        return builder().build();
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    public static final class Builder {
        private Boolean enable; 

        /**
         * Indicates whether the configuration is enabled.
         */
        public Builder enable(Boolean enable) {
            this.enable = enable;
            return this;
        }

        public DataBonreeSDKConfigModuleConfigVersionConfigsValueCustomConfigValue build() {
            return new DataBonreeSDKConfigModuleConfigVersionConfigsValueCustomConfigValue(this);
        } 

    } 

}
