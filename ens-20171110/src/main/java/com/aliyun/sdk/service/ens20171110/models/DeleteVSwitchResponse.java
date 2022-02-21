// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteVSwitchResponse} extends {@link TeaModel}
 *
 * <p>DeleteVSwitchResponse</p>
 */
public class DeleteVSwitchResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteVSwitchResponseBody body;

    private DeleteVSwitchResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteVSwitchResponse create() {
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
    public DeleteVSwitchResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteVSwitchResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteVSwitchResponseBody body);

        @Override
        DeleteVSwitchResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteVSwitchResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteVSwitchResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteVSwitchResponse response) {
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
        public Builder body(DeleteVSwitchResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteVSwitchResponse build() {
            return new DeleteVSwitchResponse(this);
        } 

    } 

}
