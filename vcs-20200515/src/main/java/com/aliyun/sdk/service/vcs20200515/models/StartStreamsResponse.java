// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartStreamsResponse} extends {@link TeaModel}
 *
 * <p>StartStreamsResponse</p>
 */
public class StartStreamsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartStreamsResponseBody body;

    private StartStreamsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartStreamsResponse create() {
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
    public StartStreamsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartStreamsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartStreamsResponseBody body);

        @Override
        StartStreamsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartStreamsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartStreamsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartStreamsResponse response) {
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
        public Builder body(StartStreamsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartStreamsResponse build() {
            return new StartStreamsResponse(this);
        } 

    } 

}
