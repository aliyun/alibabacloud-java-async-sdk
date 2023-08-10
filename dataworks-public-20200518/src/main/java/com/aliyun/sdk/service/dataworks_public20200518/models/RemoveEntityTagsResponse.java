// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveEntityTagsResponse} extends {@link TeaModel}
 *
 * <p>RemoveEntityTagsResponse</p>
 */
public class RemoveEntityTagsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveEntityTagsResponseBody body;

    private RemoveEntityTagsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveEntityTagsResponse create() {
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
    public RemoveEntityTagsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveEntityTagsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveEntityTagsResponseBody body);

        @Override
        RemoveEntityTagsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveEntityTagsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveEntityTagsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveEntityTagsResponse response) {
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
        public Builder body(RemoveEntityTagsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveEntityTagsResponse build() {
            return new RemoveEntityTagsResponse(this);
        } 

    } 

}
