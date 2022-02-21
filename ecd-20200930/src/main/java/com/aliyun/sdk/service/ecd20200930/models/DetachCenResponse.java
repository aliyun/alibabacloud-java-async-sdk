// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachCenResponse} extends {@link TeaModel}
 *
 * <p>DetachCenResponse</p>
 */
public class DetachCenResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DetachCenResponseBody body;

    private DetachCenResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DetachCenResponse create() {
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
    public DetachCenResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DetachCenResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DetachCenResponseBody body);

        @Override
        DetachCenResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DetachCenResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DetachCenResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DetachCenResponse response) {
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
        public Builder body(DetachCenResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DetachCenResponse build() {
            return new DetachCenResponse(this);
        } 

    } 

}
