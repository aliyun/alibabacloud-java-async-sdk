// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateImageCacheResponse} extends {@link TeaModel}
 *
 * <p>CreateImageCacheResponse</p>
 */
public class CreateImageCacheResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateImageCacheResponseBody body;

    private CreateImageCacheResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateImageCacheResponse create() {
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
    public CreateImageCacheResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateImageCacheResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateImageCacheResponseBody body);

        @Override
        CreateImageCacheResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateImageCacheResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateImageCacheResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateImageCacheResponse response) {
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
        public Builder body(CreateImageCacheResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateImageCacheResponse build() {
            return new CreateImageCacheResponse(this);
        } 

    } 

}
