// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AllocatePublicConnectionResponse} extends {@link TeaModel}
 *
 * <p>AllocatePublicConnectionResponse</p>
 */
public class AllocatePublicConnectionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AllocatePublicConnectionResponseBody body;

    private AllocatePublicConnectionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AllocatePublicConnectionResponse create() {
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
    public AllocatePublicConnectionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AllocatePublicConnectionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AllocatePublicConnectionResponseBody body);

        @Override
        AllocatePublicConnectionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AllocatePublicConnectionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AllocatePublicConnectionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AllocatePublicConnectionResponse response) {
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
        public Builder body(AllocatePublicConnectionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AllocatePublicConnectionResponse build() {
            return new AllocatePublicConnectionResponse(this);
        } 

    } 

}
