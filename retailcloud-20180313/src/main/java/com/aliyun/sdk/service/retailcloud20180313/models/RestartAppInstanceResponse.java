// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RestartAppInstanceResponse} extends {@link TeaModel}
 *
 * <p>RestartAppInstanceResponse</p>
 */
public class RestartAppInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RestartAppInstanceResponseBody body;

    private RestartAppInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RestartAppInstanceResponse create() {
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
    public RestartAppInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RestartAppInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RestartAppInstanceResponseBody body);

        @Override
        RestartAppInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RestartAppInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RestartAppInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RestartAppInstanceResponse response) {
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
        public Builder body(RestartAppInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RestartAppInstanceResponse build() {
            return new RestartAppInstanceResponse(this);
        } 

    } 

}
