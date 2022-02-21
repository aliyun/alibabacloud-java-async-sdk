// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TagDbfsResponse} extends {@link TeaModel}
 *
 * <p>TagDbfsResponse</p>
 */
public class TagDbfsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private TagDbfsResponseBody body;

    private TagDbfsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static TagDbfsResponse create() {
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
    public TagDbfsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TagDbfsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(TagDbfsResponseBody body);

        @Override
        TagDbfsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TagDbfsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private TagDbfsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TagDbfsResponse response) {
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
        public Builder body(TagDbfsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TagDbfsResponse build() {
            return new TagDbfsResponse(this);
        } 

    } 

}
