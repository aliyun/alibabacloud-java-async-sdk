// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteStudioLayoutResponse} extends {@link TeaModel}
 *
 * <p>DeleteStudioLayoutResponse</p>
 */
public class DeleteStudioLayoutResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteStudioLayoutResponseBody body;

    private DeleteStudioLayoutResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteStudioLayoutResponse create() {
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
    public DeleteStudioLayoutResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteStudioLayoutResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteStudioLayoutResponseBody body);

        @Override
        DeleteStudioLayoutResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteStudioLayoutResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteStudioLayoutResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteStudioLayoutResponse response) {
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
        public Builder body(DeleteStudioLayoutResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteStudioLayoutResponse build() {
            return new DeleteStudioLayoutResponse(this);
        } 

    } 

}
