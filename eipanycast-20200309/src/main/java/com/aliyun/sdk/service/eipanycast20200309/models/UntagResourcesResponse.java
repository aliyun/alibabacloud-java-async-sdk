// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eipanycast20200309.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UntagResourcesResponse} extends {@link TeaModel}
 *
 * <p>UntagResourcesResponse</p>
 */
public class UntagResourcesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UntagResourcesResponseBody body;

    private UntagResourcesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UntagResourcesResponse create() {
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
    public UntagResourcesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UntagResourcesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UntagResourcesResponseBody body);

        @Override
        UntagResourcesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UntagResourcesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UntagResourcesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UntagResourcesResponse response) {
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
        public Builder body(UntagResourcesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UntagResourcesResponse build() {
            return new UntagResourcesResponse(this);
        } 

    } 

}
