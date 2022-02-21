// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveTagsFromResourceResponse} extends {@link TeaModel}
 *
 * <p>RemoveTagsFromResourceResponse</p>
 */
public class RemoveTagsFromResourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveTagsFromResourceResponseBody body;

    private RemoveTagsFromResourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveTagsFromResourceResponse create() {
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
    public RemoveTagsFromResourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveTagsFromResourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveTagsFromResourceResponseBody body);

        @Override
        RemoveTagsFromResourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveTagsFromResourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveTagsFromResourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveTagsFromResourceResponse response) {
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
        public Builder body(RemoveTagsFromResourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveTagsFromResourceResponse build() {
            return new RemoveTagsFromResourceResponse(this);
        } 

    } 

}
