// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveTagsResponse} extends {@link TeaModel}
 *
 * <p>RemoveTagsResponse</p>
 */
public class RemoveTagsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveTagsResponseBody body;

    private RemoveTagsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveTagsResponse create() {
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
    public RemoveTagsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveTagsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveTagsResponseBody body);

        @Override
        RemoveTagsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveTagsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveTagsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveTagsResponse response) {
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
        public Builder body(RemoveTagsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveTagsResponse build() {
            return new RemoveTagsResponse(this);
        } 

    } 

}
