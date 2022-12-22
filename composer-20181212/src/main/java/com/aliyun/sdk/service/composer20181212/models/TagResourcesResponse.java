// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.composer20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TagResourcesResponse} extends {@link TeaModel}
 *
 * <p>TagResourcesResponse</p>
 */
public class TagResourcesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private TagResourcesResponseBody body;

    private TagResourcesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static TagResourcesResponse create() {
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
    public TagResourcesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TagResourcesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(TagResourcesResponseBody body);

        @Override
        TagResourcesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TagResourcesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private TagResourcesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TagResourcesResponse response) {
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
        public Builder body(TagResourcesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TagResourcesResponse build() {
            return new TagResourcesResponse(this);
        } 

    } 

}
