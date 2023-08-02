// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PauseInstanceResponse} extends {@link TeaModel}
 *
 * <p>PauseInstanceResponse</p>
 */
public class PauseInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PauseInstanceResponseBody body;

    private PauseInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PauseInstanceResponse create() {
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
    public PauseInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PauseInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PauseInstanceResponseBody body);

        @Override
        PauseInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PauseInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PauseInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PauseInstanceResponse response) {
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
        public Builder body(PauseInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PauseInstanceResponse build() {
            return new PauseInstanceResponse(this);
        } 

    } 

}
