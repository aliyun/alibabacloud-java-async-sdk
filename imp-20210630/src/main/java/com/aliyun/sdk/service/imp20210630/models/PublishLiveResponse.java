// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PublishLiveResponse} extends {@link TeaModel}
 *
 * <p>PublishLiveResponse</p>
 */
public class PublishLiveResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PublishLiveResponseBody body;

    private PublishLiveResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PublishLiveResponse create() {
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
    public PublishLiveResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PublishLiveResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PublishLiveResponseBody body);

        @Override
        PublishLiveResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PublishLiveResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PublishLiveResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PublishLiveResponse response) {
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
        public Builder body(PublishLiveResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PublishLiveResponse build() {
            return new PublishLiveResponse(this);
        } 

    } 

}
