// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSpaceWithOrderResponse} extends {@link TeaModel}
 *
 * <p>CreateSpaceWithOrderResponse</p>
 */
public class CreateSpaceWithOrderResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateSpaceWithOrderResponseBody body;

    private CreateSpaceWithOrderResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateSpaceWithOrderResponse create() {
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
    public CreateSpaceWithOrderResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateSpaceWithOrderResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateSpaceWithOrderResponseBody body);

        @Override
        CreateSpaceWithOrderResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateSpaceWithOrderResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateSpaceWithOrderResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateSpaceWithOrderResponse response) {
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
        public Builder body(CreateSpaceWithOrderResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateSpaceWithOrderResponse build() {
            return new CreateSpaceWithOrderResponse(this);
        } 

    } 

}
