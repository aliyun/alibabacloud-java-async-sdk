// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindAxnResponse} extends {@link TeaModel}
 *
 * <p>BindAxnResponse</p>
 */
public class BindAxnResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BindAxnResponseBody body;

    private BindAxnResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BindAxnResponse create() {
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
    public BindAxnResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BindAxnResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BindAxnResponseBody body);

        @Override
        BindAxnResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BindAxnResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BindAxnResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BindAxnResponse response) {
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
        public Builder body(BindAxnResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BindAxnResponse build() {
            return new BindAxnResponse(this);
        } 

    } 

}
