// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ClusterConfig} extends {@link TeaModel}
 *
 * <p>ClusterConfig</p>
 */
public class ClusterConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConfigValue")
    private String configValue;

    @com.aliyun.core.annotation.NameInMap("EnableOverwrite")
    private Boolean enableOverwrite;

    @com.aliyun.core.annotation.NameInMap("ModuleName")
    private String moduleName;

    private ClusterConfig(Builder builder) {
        this.configValue = builder.configValue;
        this.enableOverwrite = builder.enableOverwrite;
        this.moduleName = builder.moduleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClusterConfig create() {
        return builder().build();
    }

    /**
     * @return configValue
     */
    public String getConfigValue() {
        return this.configValue;
    }

    /**
     * @return enableOverwrite
     */
    public Boolean getEnableOverwrite() {
        return this.enableOverwrite;
    }

    /**
     * @return moduleName
     */
    public String getModuleName() {
        return this.moduleName;
    }

    public static final class Builder {
        private String configValue; 
        private Boolean enableOverwrite; 
        private String moduleName; 

        /**
         * ConfigValue.
         */
        public Builder configValue(String configValue) {
            this.configValue = configValue;
            return this;
        }

        /**
         * EnableOverwrite.
         */
        public Builder enableOverwrite(Boolean enableOverwrite) {
            this.enableOverwrite = enableOverwrite;
            return this;
        }

        /**
         * ModuleName.
         */
        public Builder moduleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }

        public ClusterConfig build() {
            return new ClusterConfig(this);
        } 

    } 

}
