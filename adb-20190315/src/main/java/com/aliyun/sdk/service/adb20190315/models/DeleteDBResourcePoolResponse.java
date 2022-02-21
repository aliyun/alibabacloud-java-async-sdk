// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDBResourcePoolResponse} extends {@link TeaModel}
 *
 * <p>DeleteDBResourcePoolResponse</p>
 */
public class DeleteDBResourcePoolResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDBResourcePoolResponseBody body;

    private DeleteDBResourcePoolResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDBResourcePoolResponse create() {
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
    public DeleteDBResourcePoolResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDBResourcePoolResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDBResourcePoolResponseBody body);

        @Override
        DeleteDBResourcePoolResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDBResourcePoolResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDBResourcePoolResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDBResourcePoolResponse response) {
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
        public Builder body(DeleteDBResourcePoolResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDBResourcePoolResponse build() {
            return new DeleteDBResourcePoolResponse(this);
        } 

    } 

}
