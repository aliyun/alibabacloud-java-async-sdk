// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MoveCdsFileResponse} extends {@link TeaModel}
 *
 * <p>MoveCdsFileResponse</p>
 */
public class MoveCdsFileResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private MoveCdsFileResponseBody body;

    private MoveCdsFileResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static MoveCdsFileResponse create() {
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
    public MoveCdsFileResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<MoveCdsFileResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(MoveCdsFileResponseBody body);

        @Override
        MoveCdsFileResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<MoveCdsFileResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private MoveCdsFileResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(MoveCdsFileResponse response) {
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
        public Builder body(MoveCdsFileResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public MoveCdsFileResponse build() {
            return new MoveCdsFileResponse(this);
        } 

    } 

}
