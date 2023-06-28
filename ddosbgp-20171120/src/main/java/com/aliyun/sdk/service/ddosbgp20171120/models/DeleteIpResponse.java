// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20171120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteIpResponse} extends {@link TeaModel}
 *
 * <p>DeleteIpResponse</p>
 */
public class DeleteIpResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteIpResponseBody body;

    private DeleteIpResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteIpResponse create() {
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
    public DeleteIpResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteIpResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteIpResponseBody body);

        @Override
        DeleteIpResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteIpResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteIpResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteIpResponse response) {
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
        public Builder body(DeleteIpResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteIpResponse build() {
            return new DeleteIpResponse(this);
        } 

    } 

}
