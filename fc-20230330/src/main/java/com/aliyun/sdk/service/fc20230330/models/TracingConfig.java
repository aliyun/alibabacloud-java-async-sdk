// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link TracingConfig} extends {@link TeaModel}
 *
 * <p>TracingConfig</p>
 */
public class TracingConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("params")
    private java.util.Map<String, String> params;

    @com.aliyun.core.annotation.NameInMap("type")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return params
     */
    public java.util.Map<String, String> getParams() {
        return this.params;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private java.util.Map<String, String> params; 
        private String type; 

        private Builder() {
        } 

        private Builder(TracingConfig model) {
            this.params = model.params;
            this.type = model.type;
        } 

        /**
         * params.
         */
        public Builder params(java.util.Map<String, String> params) {
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
