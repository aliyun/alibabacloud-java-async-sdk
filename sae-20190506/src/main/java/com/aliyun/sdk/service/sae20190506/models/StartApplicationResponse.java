// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartApplicationResponse} extends {@link TeaModel}
 *
 * <p>StartApplicationResponse</p>
 */
public class StartApplicationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartApplicationResponseBody body;

    private StartApplicationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartApplicationResponse create() {
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
    public StartApplicationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartApplicationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartApplicationResponseBody body);

        @Override
        StartApplicationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartApplicationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartApplicationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartApplicationResponse response) {
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
        public Builder body(StartApplicationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartApplicationResponse build() {
            return new StartApplicationResponse(this);
        } 

    } 

}
