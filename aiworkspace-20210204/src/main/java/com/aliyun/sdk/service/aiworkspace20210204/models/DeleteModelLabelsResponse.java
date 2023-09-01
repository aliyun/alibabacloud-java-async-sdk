// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteModelLabelsResponse} extends {@link TeaModel}
 *
 * <p>DeleteModelLabelsResponse</p>
 */
public class DeleteModelLabelsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteModelLabelsResponseBody body;

    private DeleteModelLabelsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteModelLabelsResponse create() {
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
    public DeleteModelLabelsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteModelLabelsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteModelLabelsResponseBody body);

        @Override
        DeleteModelLabelsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteModelLabelsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteModelLabelsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteModelLabelsResponse response) {
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
        public Builder body(DeleteModelLabelsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteModelLabelsResponse build() {
            return new DeleteModelLabelsResponse(this);
        } 

    } 

}
