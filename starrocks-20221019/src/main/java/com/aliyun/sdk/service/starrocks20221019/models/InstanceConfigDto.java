// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starrocks20221019.models;

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
 * {@link InstanceConfigDto} extends {@link TeaModel}
 *
 * <p>InstanceConfigDto</p>
 */
public class InstanceConfigDto extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("configKey")
    private String configKey;

    @com.aliyun.core.annotation.NameInMap("configType")
    private String configType;

    @com.aliyun.core.annotation.NameInMap("configValue")
    private String configValue;

    @com.aliyun.core.annotation.NameInMap("nodeGroupId")
    private String nodeGroupId;

    private InstanceConfigDto(Builder builder) {
        this.configKey = builder.configKey;
        this.configType = builder.configType;
        this.configValue = builder.configValue;
        this.nodeGroupId = builder.nodeGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstanceConfigDto create() {
        return builder().build();
    }

    /**
     * @return configKey
     */
    public String getConfigKey() {
        return this.configKey;
    }

    /**
     * @return configType
     */
    public String getConfigType() {
        return this.configType;
    }

    /**
     * @return configValue
     */
    public String getConfigValue() {
        return this.configValue;
    }

    /**
     * @return nodeGroupId
     */
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    public static final class Builder {
        private String configKey; 
        private String configType; 
        private String configValue; 
        private String nodeGroupId; 

        /**
         * configKey.
         */
        public Builder configKey(String configKey) {
            this.configKey = configKey;
            return this;
        }

        /**
         * configType.
         */
        public Builder configType(String configType) {
            this.configType = configType;
            return this;
        }

        /**
         * configValue.
         */
        public Builder configValue(String configValue) {
            this.configValue = configValue;
            return this;
        }

        /**
         * nodeGroupId.
         */
        public Builder nodeGroupId(String nodeGroupId) {
            this.nodeGroupId = nodeGroupId;
            return this;
        }

        public InstanceConfigDto build() {
            return new InstanceConfigDto(this);
        } 

    } 

}
