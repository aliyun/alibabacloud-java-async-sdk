// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link CheckTransitRouterServiceResponse} extends {@link TeaModel}
 *
 * <p>CheckTransitRouterServiceResponse</p>
 */
public class CheckTransitRouterServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CheckTransitRouterServiceResponseBody body;


    private CheckTransitRouterServiceResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckTransitRouterServiceResponse create() {
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
    public CheckTransitRouterServiceResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private CheckTransitRouterServiceResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(CheckTransitRouterServiceResponse response) {
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
        public Builder body(CheckTransitRouterServiceResponseBody body) {
            this.body = body;
            return this;
        }

        public CheckTransitRouterServiceResponse build() {
            return new CheckTransitRouterServiceResponse(this);
        } 

    } 

}
