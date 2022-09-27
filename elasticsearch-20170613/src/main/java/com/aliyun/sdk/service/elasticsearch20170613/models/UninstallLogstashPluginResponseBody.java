// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UninstallLogstashPluginResponseBody} extends {@link TeaModel}
 *
 * <p>UninstallLogstashPluginResponseBody</p>
 */
public class UninstallLogstashPluginResponseBody extends TeaModel {
    @NameInMap("Headers")
    private java.util.Map < String, ? > headers;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private java.util.List < String > result;

    private UninstallLogstashPluginResponseBody(Builder builder) {
        this.headers = builder.headers;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UninstallLogstashPluginResponseBody create() {
        return builder().build();
    }

    /**
     * @return headers
     */
    public java.util.Map < String, ? > getHeaders() {
        return this.headers;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List < String > getResult() {
        return this.result;
    }

    public static final class Builder {
        private java.util.Map < String, ? > headers; 
        private String requestId; 
        private java.util.List < String > result; 

        /**
         * Headers.
         */
        public Builder headers(java.util.Map < String, ? > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(java.util.List < String > result) {
            this.result = result;
            return this;
        }

        public UninstallLogstashPluginResponseBody build() {
            return new UninstallLogstashPluginResponseBody(this);
        } 

    } 

}
