// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PublishServiceVersionResponse} extends {@link TeaModel}
 *
 * <p>PublishServiceVersionResponse</p>
 */
public class PublishServiceVersionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PublishServiceVersionResponseBody body;

    private PublishServiceVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PublishServiceVersionResponse create() {
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
    public PublishServiceVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PublishServiceVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PublishServiceVersionResponseBody body);

        @Override
        PublishServiceVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PublishServiceVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PublishServiceVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PublishServiceVersionResponse response) {
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
        public Builder body(PublishServiceVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PublishServiceVersionResponse build() {
            return new PublishServiceVersionResponse(this);
        } 

    } 

}
