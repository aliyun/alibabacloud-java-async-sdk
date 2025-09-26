// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link ServiceConfig} extends {@link TeaModel}
 *
 * <p>ServiceConfig</p>
 */
public class ServiceConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("aiServiceConfig")
    private AiServiceConfig aiServiceConfig;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    private ServiceConfig(Builder builder) {
        this.aiServiceConfig = builder.aiServiceConfig;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ServiceConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aiServiceConfig
     */
    public AiServiceConfig getAiServiceConfig() {
        return this.aiServiceConfig;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder {
        private AiServiceConfig aiServiceConfig; 
        private String name; 

        private Builder() {
        } 

        private Builder(ServiceConfig model) {
            this.aiServiceConfig = model.aiServiceConfig;
            this.name = model.name;
        } 

        /**
         * aiServiceConfig.
         */
        public Builder aiServiceConfig(AiServiceConfig aiServiceConfig) {
            this.aiServiceConfig = aiServiceConfig;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public ServiceConfig build() {
            return new ServiceConfig(this);
        } 

    } 

}
