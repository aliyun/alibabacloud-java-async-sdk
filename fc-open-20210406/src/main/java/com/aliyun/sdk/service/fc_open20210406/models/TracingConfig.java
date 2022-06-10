// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

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
    @NameInMap("params")
    @Validation(required = true)
    private java.util.Map < String, String > params;

    @NameInMap("type")
    @Validation(required = true)
    private String type;

    private TracingConfig(Builder builder) {
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
        private java.util.Map < String, String > params; 
        private String type; 

        /**
         * 链路追踪参数。当协议类型为 Jaeger 时，参数为 map[string]string，其中 key 为 "endpoint"，value 为您的链路追踪内网接入点。例如 endpoint: http://tracing-analysis-dc-hz.aliyuncs.com/adapt_xxx/api/otlp/traces
         */
        public Builder params(java.util.Map < String, String > params) {
            this.params = params;
            return this;
        }

        /**
         * 链路追踪协议类型，目前只支持 Jaeger
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
