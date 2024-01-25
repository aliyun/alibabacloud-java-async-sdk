// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nbf20211110_21312586.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenApiGenericProxyResponseBody} extends {@link TeaModel}
 *
 * <p>OpenApiGenericProxyResponseBody</p>
 */
public class OpenApiGenericProxyResponseBody extends TeaModel {
    @NameInMap("data")
    private String data;

    private OpenApiGenericProxyResponseBody(Builder builder) {
        this.data = builder.data;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenApiGenericProxyResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    public static final class Builder {
        private String data; 

        /**
         * data.
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        public OpenApiGenericProxyResponseBody build() {
            return new OpenApiGenericProxyResponseBody(this);
        } 

    } 

}
