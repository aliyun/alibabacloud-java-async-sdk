// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DataBonreeSDKConfigModuleConfigValue} extends {@link TeaModel}
 *
 * <p>DataBonreeSDKConfigModuleConfigValue</p>
 */
public class DataBonreeSDKConfigModuleConfigValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("enable")
    private Boolean enable;

    private DataBonreeSDKConfigModuleConfigValue(Builder builder) {
        this.enable = builder.enable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataBonreeSDKConfigModuleConfigValue create() {
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
         * enable.
         */
        public Builder enable(Boolean enable) {
            this.enable = enable;
            return this;
        }

        public DataBonreeSDKConfigModuleConfigValue build() {
            return new DataBonreeSDKConfigModuleConfigValue(this);
        } 

    } 

}
