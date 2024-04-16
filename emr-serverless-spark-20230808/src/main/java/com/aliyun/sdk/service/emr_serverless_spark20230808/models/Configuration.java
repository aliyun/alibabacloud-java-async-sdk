// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Configuration} extends {@link TeaModel}
 *
 * <p>Configuration</p>
 */
public class Configuration extends TeaModel {
    @NameInMap("configFileName")
    private String configFileName;

    @NameInMap("configItemKey")
    private String configItemKey;

    @NameInMap("configItemValue")
    private String configItemValue;

    private Configuration(Builder builder) {
        this.configFileName = builder.configFileName;
        this.configItemKey = builder.configItemKey;
        this.configItemValue = builder.configItemValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Configuration create() {
        return builder().build();
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
        private String configFileName; 
        private String configItemKey; 
        private String configItemValue; 

        /**
         * configFileName.
         */
        public Builder configFileName(String configFileName) {
            this.configFileName = configFileName;
            return this;
        }

        /**
         * configItemKey.
         */
        public Builder configItemKey(String configItemKey) {
            this.configItemKey = configItemKey;
            return this;
        }

        /**
         * configItemValue.
         */
        public Builder configItemValue(String configItemValue) {
            this.configItemValue = configItemValue;
            return this;
        }

        public Configuration build() {
            return new Configuration(this);
        } 

    } 

}
