// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TagCustomPersonResponse} extends {@link TeaModel}
 *
 * <p>TagCustomPersonResponse</p>
 */
public class TagCustomPersonResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private TagCustomPersonResponseBody body;

    private TagCustomPersonResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static TagCustomPersonResponse create() {
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
    public TagCustomPersonResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TagCustomPersonResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(TagCustomPersonResponseBody body);

        @Override
        TagCustomPersonResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TagCustomPersonResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private TagCustomPersonResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TagCustomPersonResponse response) {
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
        public Builder body(TagCustomPersonResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TagCustomPersonResponse build() {
            return new TagCustomPersonResponse(this);
        } 

    } 

}
