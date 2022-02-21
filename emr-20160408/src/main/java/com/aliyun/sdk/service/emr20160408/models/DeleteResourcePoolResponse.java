// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteResourcePoolResponse} extends {@link TeaModel}
 *
 * <p>DeleteResourcePoolResponse</p>
 */
public class DeleteResourcePoolResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteResourcePoolResponseBody body;

    private DeleteResourcePoolResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteResourcePoolResponse create() {
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
    public DeleteResourcePoolResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteResourcePoolResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteResourcePoolResponseBody body);

        @Override
        DeleteResourcePoolResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteResourcePoolResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteResourcePoolResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteResourcePoolResponse response) {
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
        public Builder body(DeleteResourcePoolResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteResourcePoolResponse build() {
            return new DeleteResourcePoolResponse(this);
        } 

    } 

}
