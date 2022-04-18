// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDataLimitResponse} extends {@link TeaModel}
 *
 * <p>DeleteDataLimitResponse</p>
 */
public class DeleteDataLimitResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDataLimitResponseBody body;

    private DeleteDataLimitResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDataLimitResponse create() {
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
    public DeleteDataLimitResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDataLimitResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDataLimitResponseBody body);

        @Override
        DeleteDataLimitResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDataLimitResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDataLimitResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDataLimitResponse response) {
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
        public Builder body(DeleteDataLimitResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDataLimitResponse build() {
            return new DeleteDataLimitResponse(this);
        } 

    } 

}
