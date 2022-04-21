// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteConnectionPoolResponse} extends {@link TeaModel}
 *
 * <p>DeleteConnectionPoolResponse</p>
 */
public class DeleteConnectionPoolResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteConnectionPoolResponseBody body;

    private DeleteConnectionPoolResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteConnectionPoolResponse create() {
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
    public DeleteConnectionPoolResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteConnectionPoolResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteConnectionPoolResponseBody body);

        @Override
        DeleteConnectionPoolResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteConnectionPoolResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteConnectionPoolResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteConnectionPoolResponse response) {
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
        public Builder body(DeleteConnectionPoolResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteConnectionPoolResponse build() {
            return new DeleteConnectionPoolResponse(this);
        } 

    } 

}
