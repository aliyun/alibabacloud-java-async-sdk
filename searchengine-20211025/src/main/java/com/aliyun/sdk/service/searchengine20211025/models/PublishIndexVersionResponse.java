// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PublishIndexVersionResponse} extends {@link TeaModel}
 *
 * <p>PublishIndexVersionResponse</p>
 */
public class PublishIndexVersionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PublishIndexVersionResponseBody body;

    private PublishIndexVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PublishIndexVersionResponse create() {
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
    public PublishIndexVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PublishIndexVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PublishIndexVersionResponseBody body);

        @Override
        PublishIndexVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PublishIndexVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PublishIndexVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PublishIndexVersionResponse response) {
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
        public Builder body(PublishIndexVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PublishIndexVersionResponse build() {
            return new PublishIndexVersionResponse(this);
        } 

    } 

}
