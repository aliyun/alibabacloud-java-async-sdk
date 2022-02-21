// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PublishSceneResponse} extends {@link TeaModel}
 *
 * <p>PublishSceneResponse</p>
 */
public class PublishSceneResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PublishSceneResponseBody body;

    private PublishSceneResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PublishSceneResponse create() {
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
    public PublishSceneResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PublishSceneResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PublishSceneResponseBody body);

        @Override
        PublishSceneResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PublishSceneResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PublishSceneResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PublishSceneResponse response) {
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
        public Builder body(PublishSceneResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PublishSceneResponse build() {
            return new PublishSceneResponse(this);
        } 

    } 

}
