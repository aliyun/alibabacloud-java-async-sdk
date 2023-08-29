// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PushSimpleResponse} extends {@link TeaModel}
 *
 * <p>PushSimpleResponse</p>
 */
public class PushSimpleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PushSimpleResponseBody body;

    private PushSimpleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PushSimpleResponse create() {
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
    public PushSimpleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PushSimpleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PushSimpleResponseBody body);

        @Override
        PushSimpleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PushSimpleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PushSimpleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PushSimpleResponse response) {
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
        public Builder body(PushSimpleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PushSimpleResponse build() {
            return new PushSimpleResponse(this);
        } 

    } 

}
