// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DataBonreeSDKConfigModuleConfigDefaultConfigValue} extends {@link TeaModel}
 *
 * <p>DataBonreeSDKConfigModuleConfigDefaultConfigValue</p>
 */
public class DataBonreeSDKConfigModuleConfigDefaultConfigValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("enable")
    private Boolean enable;

    private DataBonreeSDKConfigModuleConfigDefaultConfigValue(Builder builder) {
        this.enable = builder.enable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataBonreeSDKConfigModuleConfigDefaultConfigValue create() {
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
         * <p>Indicates whether the configuration is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enable(Boolean enable) {
            this.enable = enable;
            return this;
        }

        public DataBonreeSDKConfigModuleConfigDefaultConfigValue build() {
            return new DataBonreeSDKConfigModuleConfigDefaultConfigValue(this);
        } 

    } 

}
