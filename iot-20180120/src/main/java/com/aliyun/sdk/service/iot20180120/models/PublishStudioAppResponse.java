// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PublishStudioAppResponse} extends {@link TeaModel}
 *
 * <p>PublishStudioAppResponse</p>
 */
public class PublishStudioAppResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PublishStudioAppResponseBody body;

    private PublishStudioAppResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PublishStudioAppResponse create() {
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
    public PublishStudioAppResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PublishStudioAppResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PublishStudioAppResponseBody body);

        @Override
        PublishStudioAppResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PublishStudioAppResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PublishStudioAppResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PublishStudioAppResponse response) {
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
        public Builder body(PublishStudioAppResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PublishStudioAppResponse build() {
            return new PublishStudioAppResponse(this);
        } 

    } 

}
