// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteHaVipResponse} extends {@link TeaModel}
 *
 * <p>DeleteHaVipResponse</p>
 */
public class DeleteHaVipResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteHaVipResponseBody body;

    private DeleteHaVipResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteHaVipResponse create() {
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
    public DeleteHaVipResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteHaVipResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteHaVipResponseBody body);

        @Override
        DeleteHaVipResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteHaVipResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteHaVipResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteHaVipResponse response) {
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
        public Builder body(DeleteHaVipResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteHaVipResponse build() {
            return new DeleteHaVipResponse(this);
        } 

    } 

}
