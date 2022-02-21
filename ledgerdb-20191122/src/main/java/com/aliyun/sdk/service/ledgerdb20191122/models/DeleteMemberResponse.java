// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ledgerdb20191122.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMemberResponse} extends {@link TeaModel}
 *
 * <p>DeleteMemberResponse</p>
 */
public class DeleteMemberResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteMemberResponseBody body;

    private DeleteMemberResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteMemberResponse create() {
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
    public DeleteMemberResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteMemberResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteMemberResponseBody body);

        @Override
        DeleteMemberResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteMemberResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteMemberResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteMemberResponse response) {
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
        public Builder body(DeleteMemberResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteMemberResponse build() {
            return new DeleteMemberResponse(this);
        } 

    } 

}
