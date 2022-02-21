// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TagVodResourcesResponse} extends {@link TeaModel}
 *
 * <p>TagVodResourcesResponse</p>
 */
public class TagVodResourcesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private TagVodResourcesResponseBody body;

    private TagVodResourcesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static TagVodResourcesResponse create() {
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
    public TagVodResourcesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TagVodResourcesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(TagVodResourcesResponseBody body);

        @Override
        TagVodResourcesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TagVodResourcesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private TagVodResourcesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TagVodResourcesResponse response) {
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
        public Builder body(TagVodResourcesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TagVodResourcesResponse build() {
            return new TagVodResourcesResponse(this);
        } 

    } 

}
