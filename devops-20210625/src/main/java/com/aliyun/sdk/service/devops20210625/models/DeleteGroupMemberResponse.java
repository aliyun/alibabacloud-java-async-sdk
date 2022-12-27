// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteGroupMemberResponse} extends {@link TeaModel}
 *
 * <p>DeleteGroupMemberResponse</p>
 */
public class DeleteGroupMemberResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteGroupMemberResponseBody body;

    private DeleteGroupMemberResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteGroupMemberResponse create() {
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
    public DeleteGroupMemberResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteGroupMemberResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteGroupMemberResponseBody body);

        @Override
        DeleteGroupMemberResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteGroupMemberResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteGroupMemberResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteGroupMemberResponse response) {
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
        public Builder body(DeleteGroupMemberResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteGroupMemberResponse build() {
            return new DeleteGroupMemberResponse(this);
        } 

    } 

}
