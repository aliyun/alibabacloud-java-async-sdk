// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteBasicIpSetResponse} extends {@link TeaModel}
 *
 * <p>DeleteBasicIpSetResponse</p>
 */
public class DeleteBasicIpSetResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteBasicIpSetResponseBody body;

    private DeleteBasicIpSetResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteBasicIpSetResponse create() {
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
    public DeleteBasicIpSetResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteBasicIpSetResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteBasicIpSetResponseBody body);

        @Override
        DeleteBasicIpSetResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteBasicIpSetResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteBasicIpSetResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteBasicIpSetResponse response) {
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
        public Builder body(DeleteBasicIpSetResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteBasicIpSetResponse build() {
            return new DeleteBasicIpSetResponse(this);
        } 

    } 

}
