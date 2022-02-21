// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteHtmlResourceResponse} extends {@link TeaModel}
 *
 * <p>DeleteHtmlResourceResponse</p>
 */
public class DeleteHtmlResourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteHtmlResourceResponseBody body;

    private DeleteHtmlResourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteHtmlResourceResponse create() {
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
    public DeleteHtmlResourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteHtmlResourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteHtmlResourceResponseBody body);

        @Override
        DeleteHtmlResourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteHtmlResourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteHtmlResourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteHtmlResourceResponse response) {
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
        public Builder body(DeleteHtmlResourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteHtmlResourceResponse build() {
            return new DeleteHtmlResourceResponse(this);
        } 

    } 

}
