// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PublishAppVersionResponse} extends {@link TeaModel}
 *
 * <p>PublishAppVersionResponse</p>
 */
public class PublishAppVersionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PublishAppVersionResponseBody body;

    private PublishAppVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PublishAppVersionResponse create() {
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
    public PublishAppVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PublishAppVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PublishAppVersionResponseBody body);

        @Override
        PublishAppVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PublishAppVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PublishAppVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PublishAppVersionResponse response) {
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
        public Builder body(PublishAppVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PublishAppVersionResponse build() {
            return new PublishAppVersionResponse(this);
        } 

    } 

}
