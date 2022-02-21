// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteResourceMemberResponse} extends {@link TeaModel}
 *
 * <p>DeleteResourceMemberResponse</p>
 */
public class DeleteResourceMemberResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteResourceMemberResponseBody body;

    private DeleteResourceMemberResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteResourceMemberResponse create() {
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
    public DeleteResourceMemberResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteResourceMemberResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteResourceMemberResponseBody body);

        @Override
        DeleteResourceMemberResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteResourceMemberResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteResourceMemberResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteResourceMemberResponse response) {
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
        public Builder body(DeleteResourceMemberResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteResourceMemberResponse build() {
            return new DeleteResourceMemberResponse(this);
        } 

    } 

}
