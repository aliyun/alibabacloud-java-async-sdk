// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteIpSetResponse} extends {@link TeaModel}
 *
 * <p>DeleteIpSetResponse</p>
 */
public class DeleteIpSetResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteIpSetResponseBody body;

    private DeleteIpSetResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteIpSetResponse create() {
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
    public DeleteIpSetResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteIpSetResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteIpSetResponseBody body);

        @Override
        DeleteIpSetResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteIpSetResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteIpSetResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteIpSetResponse response) {
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
        public Builder body(DeleteIpSetResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteIpSetResponse build() {
            return new DeleteIpSetResponse(this);
        } 

    } 

}
