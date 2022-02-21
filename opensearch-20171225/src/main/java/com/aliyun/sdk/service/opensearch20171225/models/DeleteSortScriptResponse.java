// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSortScriptResponse} extends {@link TeaModel}
 *
 * <p>DeleteSortScriptResponse</p>
 */
public class DeleteSortScriptResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteSortScriptResponseBody body;

    private DeleteSortScriptResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteSortScriptResponse create() {
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
    public DeleteSortScriptResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteSortScriptResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteSortScriptResponseBody body);

        @Override
        DeleteSortScriptResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteSortScriptResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteSortScriptResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteSortScriptResponse response) {
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
        public Builder body(DeleteSortScriptResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteSortScriptResponse build() {
            return new DeleteSortScriptResponse(this);
        } 

    } 

}
