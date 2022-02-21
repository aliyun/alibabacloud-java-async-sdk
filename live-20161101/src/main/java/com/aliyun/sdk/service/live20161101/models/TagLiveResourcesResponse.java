// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TagLiveResourcesResponse} extends {@link TeaModel}
 *
 * <p>TagLiveResourcesResponse</p>
 */
public class TagLiveResourcesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private TagLiveResourcesResponseBody body;

    private TagLiveResourcesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static TagLiveResourcesResponse create() {
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
    public TagLiveResourcesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TagLiveResourcesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(TagLiveResourcesResponseBody body);

        @Override
        TagLiveResourcesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TagLiveResourcesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private TagLiveResourcesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TagLiveResourcesResponse response) {
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
        public Builder body(TagLiveResourcesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TagLiveResourcesResponse build() {
            return new TagLiveResourcesResponse(this);
        } 

    } 

}
