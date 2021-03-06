// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ShrinkNodeResponse} extends {@link TeaModel}
 *
 * <p>ShrinkNodeResponse</p>
 */
public class ShrinkNodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ShrinkNodeResponseBody body;

    private ShrinkNodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ShrinkNodeResponse create() {
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
    public ShrinkNodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ShrinkNodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ShrinkNodeResponseBody body);

        @Override
        ShrinkNodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ShrinkNodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ShrinkNodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ShrinkNodeResponse response) {
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
        public Builder body(ShrinkNodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ShrinkNodeResponse build() {
            return new ShrinkNodeResponse(this);
        } 

    } 

}
