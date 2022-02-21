// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopClassResponse} extends {@link TeaModel}
 *
 * <p>StopClassResponse</p>
 */
public class StopClassResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopClassResponseBody body;

    private StopClassResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopClassResponse create() {
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
    public StopClassResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopClassResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopClassResponseBody body);

        @Override
        StopClassResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopClassResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopClassResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopClassResponse response) {
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
        public Builder body(StopClassResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopClassResponse build() {
            return new StopClassResponse(this);
        } 

    } 

}
