// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PublishStatusResponse} extends {@link TeaModel}
 *
 * <p>PublishStatusResponse</p>
 */
public class PublishStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PublishStatusResponseBody body;

    private PublishStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PublishStatusResponse create() {
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
    public PublishStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PublishStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PublishStatusResponseBody body);

        @Override
        PublishStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PublishStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PublishStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PublishStatusResponse response) {
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
        public Builder body(PublishStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PublishStatusResponse build() {
            return new PublishStatusResponse(this);
        } 

    } 

}
