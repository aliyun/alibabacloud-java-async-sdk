// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCorpGroupResponse} extends {@link TeaModel}
 *
 * <p>DeleteCorpGroupResponse</p>
 */
public class DeleteCorpGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteCorpGroupResponseBody body;

    private DeleteCorpGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteCorpGroupResponse create() {
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
    public DeleteCorpGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteCorpGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteCorpGroupResponseBody body);

        @Override
        DeleteCorpGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteCorpGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteCorpGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteCorpGroupResponse response) {
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
        public Builder body(DeleteCorpGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteCorpGroupResponse build() {
            return new DeleteCorpGroupResponse(this);
        } 

    } 

}
