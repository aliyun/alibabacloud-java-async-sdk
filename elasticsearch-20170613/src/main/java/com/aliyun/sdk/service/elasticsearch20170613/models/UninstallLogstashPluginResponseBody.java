// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link UninstallLogstashPluginResponseBody} extends {@link TeaModel}
 *
 * <p>UninstallLogstashPluginResponseBody</p>
 */
public class UninstallLogstashPluginResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Headers")
    private java.util.Map<String, ?> headers;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<String> result;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return headers
     */
    public java.util.Map<String, ?> getHeaders() {
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
    public java.util.List<String> getResult() {
        return this.result;
    }

    public static final class Builder {
        private java.util.Map<String, ?> headers; 
        private String requestId; 
        private java.util.List<String> result; 

        private Builder() {
        } 

        private Builder(UninstallLogstashPluginResponseBody model) {
            this.headers = model.headers;
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * Headers.
         */
        public Builder headers(java.util.Map<String, ?> headers) {
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
        public Builder result(java.util.List<String> result) {
            this.result = result;
            return this;
        }

        public UninstallLogstashPluginResponseBody build() {
            return new UninstallLogstashPluginResponseBody(this);
        } 

    } 

}
