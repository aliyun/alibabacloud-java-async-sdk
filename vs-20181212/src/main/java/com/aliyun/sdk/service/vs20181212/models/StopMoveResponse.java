// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopMoveResponse} extends {@link TeaModel}
 *
 * <p>StopMoveResponse</p>
 */
public class StopMoveResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopMoveResponseBody body;

    private StopMoveResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopMoveResponse create() {
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
    public StopMoveResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopMoveResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopMoveResponseBody body);

        @Override
        StopMoveResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopMoveResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopMoveResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopMoveResponse response) {
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
        public Builder body(StopMoveResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopMoveResponse build() {
            return new StopMoveResponse(this);
        } 

    } 

}
