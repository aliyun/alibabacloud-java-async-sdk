// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableSlowQueryResponse} extends {@link TeaModel}
 *
 * <p>DisableSlowQueryResponse</p>
 */
public class DisableSlowQueryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisableSlowQueryResponseBody body;

    private DisableSlowQueryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisableSlowQueryResponse create() {
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
    public DisableSlowQueryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableSlowQueryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisableSlowQueryResponseBody body);

        @Override
        DisableSlowQueryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableSlowQueryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisableSlowQueryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableSlowQueryResponse response) {
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
        public Builder body(DisableSlowQueryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableSlowQueryResponse build() {
            return new DisableSlowQueryResponse(this);
        } 

    } 

}
