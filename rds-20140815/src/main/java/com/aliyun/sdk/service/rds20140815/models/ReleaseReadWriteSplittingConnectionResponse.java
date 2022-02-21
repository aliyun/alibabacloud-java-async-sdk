// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReleaseReadWriteSplittingConnectionResponse} extends {@link TeaModel}
 *
 * <p>ReleaseReadWriteSplittingConnectionResponse</p>
 */
public class ReleaseReadWriteSplittingConnectionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ReleaseReadWriteSplittingConnectionResponseBody body;

    private ReleaseReadWriteSplittingConnectionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ReleaseReadWriteSplittingConnectionResponse create() {
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
    public ReleaseReadWriteSplittingConnectionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ReleaseReadWriteSplittingConnectionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ReleaseReadWriteSplittingConnectionResponseBody body);

        @Override
        ReleaseReadWriteSplittingConnectionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReleaseReadWriteSplittingConnectionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ReleaseReadWriteSplittingConnectionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReleaseReadWriteSplittingConnectionResponse response) {
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
        public Builder body(ReleaseReadWriteSplittingConnectionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ReleaseReadWriteSplittingConnectionResponse build() {
            return new ReleaseReadWriteSplittingConnectionResponse(this);
        } 

    } 

}
