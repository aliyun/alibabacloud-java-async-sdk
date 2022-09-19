// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cddc20200320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TagResponse} extends {@link TeaModel}
 *
 * <p>TagResponse</p>
 */
public class TagResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private TagResponseBody body;

    private TagResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static TagResponse create() {
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
    public TagResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TagResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(TagResponseBody body);

        @Override
        TagResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TagResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private TagResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TagResponse response) {
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
        public Builder body(TagResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TagResponse build() {
            return new TagResponse(this);
        } 

    } 

}
