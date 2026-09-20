// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ClusterConfig model) {
            this.configValue = model.configValue;
            this.enableOverwrite = model.enableOverwrite;
            this.moduleName = model.moduleName;
        } 

        /**
         * <p>The configuration value.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;spark.driver.memory&quot;:&quot;1g&quot;}</p>
         */
        public Builder configValue(String configValue) {
            this.configValue = configValue;
            return this;
        }

        /**
         * <p>Specifies whether to overwrite the advanced settings of nodes in DataStudio. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableOverwrite(Boolean enableOverwrite) {
            this.enableOverwrite = enableOverwrite;
            return this;
        }

        /**
         * <p>The module in which the cluster is configured. Valid values:</p>
         * <ul>
         * <li>ide: DataStudio.</li>
         * <li>da: DataAnalysis.</li>
         * <li>scheduler.auto: Operation Center - auto triggered instances.</li>
         * <li>scheduler.backfill: Operation Center - data backfill instances.</li>
         * <li>scheduler.test: Operation Center - test instances.</li>
         * <li>scheduler.manual: Operation Center - manually triggered instances.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ide</p>
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
