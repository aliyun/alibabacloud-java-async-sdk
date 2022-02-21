// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePipelineMemberResponse} extends {@link TeaModel}
 *
 * <p>DeletePipelineMemberResponse</p>
 */
public class DeletePipelineMemberResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeletePipelineMemberResponseBody body;

    private DeletePipelineMemberResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeletePipelineMemberResponse create() {
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
    public DeletePipelineMemberResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeletePipelineMemberResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeletePipelineMemberResponseBody body);

        @Override
        DeletePipelineMemberResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeletePipelineMemberResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeletePipelineMemberResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeletePipelineMemberResponse response) {
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
        public Builder body(DeletePipelineMemberResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeletePipelineMemberResponse build() {
            return new DeletePipelineMemberResponse(this);
        } 

    } 

}
