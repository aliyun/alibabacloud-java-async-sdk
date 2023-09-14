// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateApplicationConfig} extends {@link TeaModel}
 *
 * <p>UpdateApplicationConfig</p>
 */
public class UpdateApplicationConfig extends TeaModel {
    @NameInMap("ConfigDescription")
    private String configDescription;

    @NameInMap("ConfigFileName")
    private String configFileName;

    @NameInMap("ConfigItemKey")
    private String configItemKey;

    @NameInMap("ConfigItemValue")
    private String configItemValue;

    private UpdateApplicationConfig(Builder builder) {
        this.configDescription = builder.configDescription;
        this.configFileName = builder.configFileName;
        this.configItemKey = builder.configItemKey;
        this.configItemValue = builder.configItemValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateApplicationConfig create() {
        return builder().build();
    }

    /**
     * @return configDescription
     */
    public String getConfigDescription() {
        return this.configDescription;
    }

    /**
     * @return configFileName
     */
    public String getConfigFileName() {
        return this.configFileName;
    }

    /**
     * @return configItemKey
     */
    public String getConfigItemKey() {
        return this.configItemKey;
    }

    /**
     * @return configItemValue
     */
    public String getConfigItemValue() {
        return this.configItemValue;
    }

    public static final class Builder {
        private String configDescription; 
        private String configFileName; 
        private String configItemKey; 
        private String configItemValue; 

        /**
         * 修改描述。
         */
        public Builder configDescription(String configDescription) {
            this.configDescription = configDescription;
            return this;
        }

        /**
         * 应用配置文件名。
         */
        public Builder configFileName(String configFileName) {
            this.configFileName = configFileName;
            return this;
        }

        /**
         * 配置项键。
         */
        public Builder configItemKey(String configItemKey) {
            this.configItemKey = configItemKey;
            return this;
        }

        /**
         * 配置项值。
         */
        public Builder configItemValue(String configItemValue) {
            this.configItemValue = configItemValue;
            return this;
        }

        public UpdateApplicationConfig build() {
            return new UpdateApplicationConfig(this);
        } 

    } 

}
