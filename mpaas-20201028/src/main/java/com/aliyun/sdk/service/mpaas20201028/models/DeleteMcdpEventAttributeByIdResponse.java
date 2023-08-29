// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMcdpEventAttributeByIdResponse} extends {@link TeaModel}
 *
 * <p>DeleteMcdpEventAttributeByIdResponse</p>
 */
public class DeleteMcdpEventAttributeByIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteMcdpEventAttributeByIdResponseBody body;

    private DeleteMcdpEventAttributeByIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteMcdpEventAttributeByIdResponse create() {
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
    public DeleteMcdpEventAttributeByIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteMcdpEventAttributeByIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteMcdpEventAttributeByIdResponseBody body);

        @Override
        DeleteMcdpEventAttributeByIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteMcdpEventAttributeByIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteMcdpEventAttributeByIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteMcdpEventAttributeByIdResponse response) {
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
        public Builder body(DeleteMcdpEventAttributeByIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteMcdpEventAttributeByIdResponse build() {
            return new DeleteMcdpEventAttributeByIdResponse(this);
        } 

    } 

}
