// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PublishAdvanceConfigResponse} extends {@link TeaModel}
 *
 * <p>PublishAdvanceConfigResponse</p>
 */
public class PublishAdvanceConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PublishAdvanceConfigResponseBody body;

    private PublishAdvanceConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PublishAdvanceConfigResponse create() {
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
    public PublishAdvanceConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PublishAdvanceConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PublishAdvanceConfigResponseBody body);

        @Override
        PublishAdvanceConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PublishAdvanceConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PublishAdvanceConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PublishAdvanceConfigResponse response) {
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
        public Builder body(PublishAdvanceConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PublishAdvanceConfigResponse build() {
            return new PublishAdvanceConfigResponse(this);
        } 

    } 

}
