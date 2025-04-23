// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paillmtrace20240311.models;

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
 * {@link ModelConfig} extends {@link TeaModel}
 *
 * <p>ModelConfig</p>
 */
public class ModelConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApiKey")
    private String apiKey;

    @com.aliyun.core.annotation.NameInMap("Endpoint")
    private String endpoint;

    @com.aliyun.core.annotation.NameInMap("IsSelfHost")
    private Boolean isSelfHost;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Temperature")
    private Float temperature;

    @com.aliyun.core.annotation.NameInMap("TopP")
    private Float topP;

    @com.aliyun.core.annotation.NameInMap("UseFunctionCall")
    private Boolean useFunctionCall;

    private ModelConfig(Builder builder) {
        this.apiKey = builder.apiKey;
        this.endpoint = builder.endpoint;
        this.isSelfHost = builder.isSelfHost;
        this.name = builder.name;
        this.temperature = builder.temperature;
        this.topP = builder.topP;
        this.useFunctionCall = builder.useFunctionCall;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiKey
     */
    public String getApiKey() {
        return this.apiKey;
    }

    /**
     * @return endpoint
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * @return isSelfHost
     */
    public Boolean getIsSelfHost() {
        return this.isSelfHost;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return temperature
     */
    public Float getTemperature() {
        return this.temperature;
    }

    /**
     * @return topP
     */
    public Float getTopP() {
        return this.topP;
    }

    /**
     * @return useFunctionCall
     */
    public Boolean getUseFunctionCall() {
        return this.useFunctionCall;
    }

    public static final class Builder {
        private String apiKey; 
        private String endpoint; 
        private Boolean isSelfHost; 
        private String name; 
        private Float temperature; 
        private Float topP; 
        private Boolean useFunctionCall; 

        private Builder() {
        } 

        private Builder(ModelConfig model) {
            this.apiKey = model.apiKey;
            this.endpoint = model.endpoint;
            this.isSelfHost = model.isSelfHost;
            this.name = model.name;
            this.temperature = model.temperature;
            this.topP = model.topP;
            this.useFunctionCall = model.useFunctionCall;
        } 

        /**
         * ApiKey.
         */
        public Builder apiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        /**
         * Endpoint.
         */
        public Builder endpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        /**
         * IsSelfHost.
         */
        public Builder isSelfHost(Boolean isSelfHost) {
            this.isSelfHost = isSelfHost;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Temperature.
         */
        public Builder temperature(Float temperature) {
            this.temperature = temperature;
            return this;
        }

        /**
         * TopP.
         */
        public Builder topP(Float topP) {
            this.topP = topP;
            return this;
        }

        /**
         * UseFunctionCall.
         */
        public Builder useFunctionCall(Boolean useFunctionCall) {
            this.useFunctionCall = useFunctionCall;
            return this;
        }

        public ModelConfig build() {
            return new ModelConfig(this);
        } 

    } 

}
