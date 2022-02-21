// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RectifyImageResponse} extends {@link TeaModel}
 *
 * <p>RectifyImageResponse</p>
 */
public class RectifyImageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RectifyImageResponseBody body;

    private RectifyImageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RectifyImageResponse create() {
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
    public RectifyImageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RectifyImageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RectifyImageResponseBody body);

        @Override
        RectifyImageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RectifyImageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RectifyImageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RectifyImageResponse response) {
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
        public Builder body(RectifyImageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RectifyImageResponse build() {
            return new RectifyImageResponse(this);
        } 

    } 

}
