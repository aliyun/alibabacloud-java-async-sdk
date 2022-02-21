// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TagDcdnResourcesResponse} extends {@link TeaModel}
 *
 * <p>TagDcdnResourcesResponse</p>
 */
public class TagDcdnResourcesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private TagDcdnResourcesResponseBody body;

    private TagDcdnResourcesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static TagDcdnResourcesResponse create() {
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
    public TagDcdnResourcesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TagDcdnResourcesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(TagDcdnResourcesResponseBody body);

        @Override
        TagDcdnResourcesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TagDcdnResourcesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private TagDcdnResourcesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TagDcdnResourcesResponse response) {
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
        public Builder body(TagDcdnResourcesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TagDcdnResourcesResponse build() {
            return new TagDcdnResourcesResponse(this);
        } 

    } 

}
