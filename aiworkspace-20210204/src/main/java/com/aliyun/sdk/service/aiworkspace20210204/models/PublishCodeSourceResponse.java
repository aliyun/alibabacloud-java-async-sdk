// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PublishCodeSourceResponse} extends {@link TeaModel}
 *
 * <p>PublishCodeSourceResponse</p>
 */
public class PublishCodeSourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PublishCodeSourceResponseBody body;

    private PublishCodeSourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PublishCodeSourceResponse create() {
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
    public PublishCodeSourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PublishCodeSourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PublishCodeSourceResponseBody body);

        @Override
        PublishCodeSourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PublishCodeSourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PublishCodeSourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PublishCodeSourceResponse response) {
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
        public Builder body(PublishCodeSourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PublishCodeSourceResponse build() {
            return new PublishCodeSourceResponse(this);
        } 

    } 

}
