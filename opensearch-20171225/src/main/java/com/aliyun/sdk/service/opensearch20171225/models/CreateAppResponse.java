// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAppResponse} extends {@link TeaModel}
 *
 * <p>CreateAppResponse</p>
 */
public class CreateAppResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateAppResponseBody body;

    private CreateAppResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateAppResponse create() {
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
    public CreateAppResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateAppResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateAppResponseBody body);

        @Override
        CreateAppResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateAppResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateAppResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateAppResponse response) {
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
        public Builder body(CreateAppResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateAppResponse build() {
            return new CreateAppResponse(this);
        } 

    } 

}
