// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TagResourceResponse} extends {@link TeaModel}
 *
 * <p>TagResourceResponse</p>
 */
public class TagResourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private Tag body;

    private TagResourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static TagResourceResponse create() {
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
    public Tag getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TagResourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(Tag body);

        @Override
        TagResourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TagResourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Tag body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TagResourceResponse response) {
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
        public Builder body(Tag body) {
            this.body = body;
            return this;
        }

        @Override
        public TagResourceResponse build() {
            return new TagResourceResponse(this);
        } 

    } 

}
