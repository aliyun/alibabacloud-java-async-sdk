// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20210101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ServiceRouteTestResponse} extends {@link TeaModel}
 *
 * <p>ServiceRouteTestResponse</p>
 */
public class ServiceRouteTestResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ServiceRouteTestResponseBody body;


    private ServiceRouteTestResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ServiceRouteTestResponse create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return body
     */
    public ServiceRouteTestResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private ServiceRouteTestResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(ServiceRouteTestResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * <p>headers.</p>
         */
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * <p>body.</p>
         */
        public Builder body(ServiceRouteTestResponseBody body) {
            this.body = body;
            return this;
        }

        public ServiceRouteTestResponse build() {
            return new ServiceRouteTestResponse(this);
        } 

    } 

}
