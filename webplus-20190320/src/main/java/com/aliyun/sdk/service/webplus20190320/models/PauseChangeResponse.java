// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PauseChangeResponse} extends {@link TeaModel}
 *
 * <p>PauseChangeResponse</p>
 */
public class PauseChangeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PauseChangeResponseBody body;

    private PauseChangeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PauseChangeResponse create() {
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
    public PauseChangeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PauseChangeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PauseChangeResponseBody body);

        @Override
        PauseChangeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PauseChangeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PauseChangeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PauseChangeResponse response) {
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
        public Builder body(PauseChangeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PauseChangeResponse build() {
            return new PauseChangeResponse(this);
        } 

    } 

}
