// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ft20180713.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TestHttpApiResponseBody} extends {@link TeaModel}
 *
 * <p>TestHttpApiResponseBody</p>
 */
public class TestHttpApiResponseBody extends TeaModel {
    @NameInMap("Params")
    private String params;

    @NameInMap("ServiceRpcSign")
    private String serviceRpcSign;

    private TestHttpApiResponseBody(Builder builder) {
        this.params = builder.params;
        this.serviceRpcSign = builder.serviceRpcSign;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TestHttpApiResponseBody create() {
        return builder().build();
    }

    /**
     * @return params
     */
    public String getParams() {
        return this.params;
    }

    /**
     * @return serviceRpcSign
     */
    public String getServiceRpcSign() {
        return this.serviceRpcSign;
    }

    public static final class Builder {
        private String params; 
        private String serviceRpcSign; 

        /**
         * Params.
         */
        public Builder params(String params) {
            this.params = params;
            return this;
        }

        /**
         * ServiceRpcSign.
         */
        public Builder serviceRpcSign(String serviceRpcSign) {
            this.serviceRpcSign = serviceRpcSign;
            return this;
        }

        public TestHttpApiResponseBody build() {
            return new TestHttpApiResponseBody(this);
        } 

    } 

}
