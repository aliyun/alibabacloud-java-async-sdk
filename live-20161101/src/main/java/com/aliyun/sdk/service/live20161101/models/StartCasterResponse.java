// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartCasterResponse} extends {@link TeaModel}
 *
 * <p>StartCasterResponse</p>
 */
public class StartCasterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartCasterResponseBody body;

    private StartCasterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartCasterResponse create() {
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
    public StartCasterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartCasterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartCasterResponseBody body);

        @Override
        StartCasterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartCasterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartCasterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartCasterResponse response) {
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
        public Builder body(StartCasterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartCasterResponse build() {
            return new StartCasterResponse(this);
        } 

    } 

}
