// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link JaegerConfig} extends {@link TeaModel}
 *
 * <p>JaegerConfig</p>
 */
public class JaegerConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("endpoint")
    private String endpoint;

    private JaegerConfig(Builder builder) {
        this.endpoint = builder.endpoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static JaegerConfig create() {
        return builder().build();
    }

    /**
     * @return endpoint
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    public static final class Builder {
        private String endpoint; 

        /**
         * endpoint.
         */
        public Builder endpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        public JaegerConfig build() {
            return new JaegerConfig(this);
        } 

    } 

}
