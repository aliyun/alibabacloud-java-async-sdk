// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trusted_server20200613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TrustEventsResponse} extends {@link TeaModel}
 *
 * <p>TrustEventsResponse</p>
 */
public class TrustEventsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private TrustEventsResponseBody body;

    private TrustEventsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static TrustEventsResponse create() {
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
    public TrustEventsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TrustEventsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(TrustEventsResponseBody body);

        @Override
        TrustEventsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TrustEventsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private TrustEventsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TrustEventsResponse response) {
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
        public Builder body(TrustEventsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TrustEventsResponse build() {
            return new TrustEventsResponse(this);
        } 

    } 

}
