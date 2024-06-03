// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigEffectActions} extends {@link TeaModel}
 *
 * <p>ConfigEffectActions</p>
 */
public class ConfigEffectActions extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConfigEffectAction")
    private String configEffectAction;

    @com.aliyun.core.annotation.NameInMap("ConfigFiles")
    private java.util.List < String > configFiles;

    private ConfigEffectActions(Builder builder) {
        this.configEffectAction = builder.configEffectAction;
        this.configFiles = builder.configFiles;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigEffectActions create() {
        return builder().build();
    }

    /**
     * @return configEffectAction
     */
    public String getConfigEffectAction() {
        return this.configEffectAction;
    }

    /**
     * @return configFiles
     */
    public java.util.List < String > getConfigFiles() {
        return this.configFiles;
    }

    public static final class Builder {
        private String configEffectAction; 
        private java.util.List < String > configFiles; 

        /**
         * 配置生效动作。
         */
        public Builder configEffectAction(String configEffectAction) {
            this.configEffectAction = configEffectAction;
            return this;
        }

        /**
         * 配置生效配置文件。
         */
        public Builder configFiles(java.util.List < String > configFiles) {
            this.configFiles = configFiles;
            return this;
        }

        public ConfigEffectActions build() {
            return new ConfigEffectActions(this);
        } 

    } 

}
