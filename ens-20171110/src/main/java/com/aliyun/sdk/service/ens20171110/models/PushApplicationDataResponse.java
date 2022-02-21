// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PushApplicationDataResponse} extends {@link TeaModel}
 *
 * <p>PushApplicationDataResponse</p>
 */
public class PushApplicationDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PushApplicationDataResponseBody body;

    private PushApplicationDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PushApplicationDataResponse create() {
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
    public PushApplicationDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PushApplicationDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PushApplicationDataResponseBody body);

        @Override
        PushApplicationDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PushApplicationDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PushApplicationDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PushApplicationDataResponse response) {
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
        public Builder body(PushApplicationDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PushApplicationDataResponse build() {
            return new PushApplicationDataResponse(this);
        } 

    } 

}
