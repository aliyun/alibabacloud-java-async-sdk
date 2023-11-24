// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TracingConfig} extends {@link TeaModel}
 *
 * <p>TracingConfig</p>
 */
public class TracingConfig extends TeaModel {
    @NameInMap("jaegerConfig")
    private JaegerConfig jaegerConfig;

    @NameInMap("params")
    private Object params;

    @NameInMap("type")
    private String type;

    private TracingConfig(Builder builder) {
        this.jaegerConfig = builder.jaegerConfig;
        this.params = builder.params;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TracingConfig create() {
        return builder().build();
    }

    /**
     * @return jaegerConfig
     */
    public JaegerConfig getJaegerConfig() {
        return this.jaegerConfig;
    }

    /**
     * @return params
     */
    public Object getParams() {
        return this.params;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private JaegerConfig jaegerConfig; 
        private Object params; 
        private String type; 

        /**
         * jaegerConfig.
         */
        public Builder jaegerConfig(JaegerConfig jaegerConfig) {
            this.jaegerConfig = jaegerConfig;
            return this;
        }

        /**
         * params.
         */
        public Builder params(Object params) {
            this.params = params;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public TracingConfig build() {
            return new TracingConfig(this);
        } 

    } 

}
