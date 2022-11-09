// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RestoreInstanceResponse} extends {@link TeaModel}
 *
 * <p>RestoreInstanceResponse</p>
 */
public class RestoreInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RestoreInstanceResponseBody body;

    private RestoreInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RestoreInstanceResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
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
    public RestoreInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RestoreInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RestoreInstanceResponseBody body);

        @Override
        RestoreInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RestoreInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RestoreInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RestoreInstanceResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(RestoreInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RestoreInstanceResponse build() {
            return new RestoreInstanceResponse(this);
        } 

    } 

}
