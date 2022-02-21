// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteGadInstanceResponse} extends {@link TeaModel}
 *
 * <p>DeleteGadInstanceResponse</p>
 */
public class DeleteGadInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteGadInstanceResponseBody body;

    private DeleteGadInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteGadInstanceResponse create() {
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
    public DeleteGadInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteGadInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteGadInstanceResponseBody body);

        @Override
        DeleteGadInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteGadInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteGadInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteGadInstanceResponse response) {
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
        public Builder body(DeleteGadInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteGadInstanceResponse build() {
            return new DeleteGadInstanceResponse(this);
        } 

    } 

}
