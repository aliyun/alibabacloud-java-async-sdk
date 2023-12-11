// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteProjectMemberResponse} extends {@link TeaModel}
 *
 * <p>DeleteProjectMemberResponse</p>
 */
public class DeleteProjectMemberResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteProjectMemberResponseBody body;

    private DeleteProjectMemberResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteProjectMemberResponse create() {
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
    public DeleteProjectMemberResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteProjectMemberResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteProjectMemberResponseBody body);

        @Override
        DeleteProjectMemberResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteProjectMemberResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteProjectMemberResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteProjectMemberResponse response) {
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
        public Builder body(DeleteProjectMemberResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteProjectMemberResponse build() {
            return new DeleteProjectMemberResponse(this);
        } 

    } 

}
