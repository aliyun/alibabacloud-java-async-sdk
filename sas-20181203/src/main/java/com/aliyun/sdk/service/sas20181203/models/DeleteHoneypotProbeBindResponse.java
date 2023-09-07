// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteHoneypotProbeBindResponse} extends {@link TeaModel}
 *
 * <p>DeleteHoneypotProbeBindResponse</p>
 */
public class DeleteHoneypotProbeBindResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteHoneypotProbeBindResponseBody body;

    private DeleteHoneypotProbeBindResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteHoneypotProbeBindResponse create() {
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
    public DeleteHoneypotProbeBindResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteHoneypotProbeBindResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteHoneypotProbeBindResponseBody body);

        @Override
        DeleteHoneypotProbeBindResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteHoneypotProbeBindResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteHoneypotProbeBindResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteHoneypotProbeBindResponse response) {
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
        public Builder body(DeleteHoneypotProbeBindResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteHoneypotProbeBindResponse build() {
            return new DeleteHoneypotProbeBindResponse(this);
        } 

    } 

}
