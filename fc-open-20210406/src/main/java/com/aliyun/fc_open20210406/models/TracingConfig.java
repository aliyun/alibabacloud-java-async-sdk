// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link TracingConfig} extends {@link TeaModel}
 *
 * <p>TracingConfig</p>
 */
public class TracingConfig extends TeaModel {
    @NameInMap("jaegerConfig")
    private JaegerConfig jaegerConfig;

    @NameInMap("params")
    private java.util.Map < String, String > params;

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
    public java.util.Map < String, String > getParams() {
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
        private java.util.Map < String, String > params; 
        private String type; 

        /**
         * <p>jaegerConfig.</p>
         */
        public Builder jaegerConfig(JaegerConfig jaegerConfig) {
            this.jaegerConfig = jaegerConfig;
            return this;
        }

        /**
         * <p>链路追踪参数</p>
         */
        public Builder params(java.util.Map < String, String > params) {
            this.params = params;
            return this;
        }

        /**
         * <p>链路追踪类型</p>
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
