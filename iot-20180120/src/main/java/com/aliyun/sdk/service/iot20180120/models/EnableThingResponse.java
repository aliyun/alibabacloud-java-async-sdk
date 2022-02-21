// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableThingResponse} extends {@link TeaModel}
 *
 * <p>EnableThingResponse</p>
 */
public class EnableThingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableThingResponseBody body;

    private EnableThingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableThingResponse create() {
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
    public EnableThingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableThingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableThingResponseBody body);

        @Override
        EnableThingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableThingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableThingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableThingResponse response) {
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
        public Builder body(EnableThingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableThingResponse build() {
            return new EnableThingResponse(this);
        } 

    } 

}
