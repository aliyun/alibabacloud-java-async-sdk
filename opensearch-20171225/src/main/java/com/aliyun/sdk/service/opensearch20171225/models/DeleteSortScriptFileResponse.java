// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSortScriptFileResponse} extends {@link TeaModel}
 *
 * <p>DeleteSortScriptFileResponse</p>
 */
public class DeleteSortScriptFileResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteSortScriptFileResponseBody body;

    private DeleteSortScriptFileResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteSortScriptFileResponse create() {
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
    public DeleteSortScriptFileResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteSortScriptFileResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteSortScriptFileResponseBody body);

        @Override
        DeleteSortScriptFileResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteSortScriptFileResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteSortScriptFileResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteSortScriptFileResponse response) {
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
        public Builder body(DeleteSortScriptFileResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteSortScriptFileResponse build() {
            return new DeleteSortScriptFileResponse(this);
        } 

    } 

}
