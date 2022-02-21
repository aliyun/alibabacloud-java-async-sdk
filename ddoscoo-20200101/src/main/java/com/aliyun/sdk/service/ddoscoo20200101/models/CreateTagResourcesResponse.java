// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTagResourcesResponse} extends {@link TeaModel}
 *
 * <p>CreateTagResourcesResponse</p>
 */
public class CreateTagResourcesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateTagResourcesResponseBody body;

    private CreateTagResourcesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateTagResourcesResponse create() {
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
    public CreateTagResourcesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateTagResourcesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateTagResourcesResponseBody body);

        @Override
        CreateTagResourcesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateTagResourcesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateTagResourcesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateTagResourcesResponse response) {
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
        public Builder body(CreateTagResourcesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateTagResourcesResponse build() {
            return new CreateTagResourcesResponse(this);
        } 

    } 

}
