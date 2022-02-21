// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LinkImageResponse} extends {@link TeaModel}
 *
 * <p>LinkImageResponse</p>
 */
public class LinkImageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private LinkImageResponseBody body;

    private LinkImageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static LinkImageResponse create() {
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
    public LinkImageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<LinkImageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(LinkImageResponseBody body);

        @Override
        LinkImageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<LinkImageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private LinkImageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(LinkImageResponse response) {
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
        public Builder body(LinkImageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public LinkImageResponse build() {
            return new LinkImageResponse(this);
        } 

    } 

}
