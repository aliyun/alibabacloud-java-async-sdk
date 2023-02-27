// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReleaseCallResponse} extends {@link TeaModel}
 *
 * <p>ReleaseCallResponse</p>
 */
public class ReleaseCallResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ReleaseCallResponseBody body;

    private ReleaseCallResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ReleaseCallResponse create() {
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
    public ReleaseCallResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ReleaseCallResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ReleaseCallResponseBody body);

        @Override
        ReleaseCallResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReleaseCallResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ReleaseCallResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReleaseCallResponse response) {
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
        public Builder body(ReleaseCallResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ReleaseCallResponse build() {
            return new ReleaseCallResponse(this);
        } 

    } 

}
