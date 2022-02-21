// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AgreeLinkMicResponse} extends {@link TeaModel}
 *
 * <p>AgreeLinkMicResponse</p>
 */
public class AgreeLinkMicResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AgreeLinkMicResponseBody body;

    private AgreeLinkMicResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AgreeLinkMicResponse create() {
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
    public AgreeLinkMicResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AgreeLinkMicResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AgreeLinkMicResponseBody body);

        @Override
        AgreeLinkMicResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AgreeLinkMicResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AgreeLinkMicResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AgreeLinkMicResponse response) {
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
        public Builder body(AgreeLinkMicResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AgreeLinkMicResponse build() {
            return new AgreeLinkMicResponse(this);
        } 

    } 

}
