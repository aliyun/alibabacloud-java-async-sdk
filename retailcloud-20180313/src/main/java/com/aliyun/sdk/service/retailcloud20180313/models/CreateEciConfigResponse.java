// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEciConfigResponse} extends {@link TeaModel}
 *
 * <p>CreateEciConfigResponse</p>
 */
public class CreateEciConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateEciConfigResponseBody body;

    private CreateEciConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateEciConfigResponse create() {
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
    public CreateEciConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateEciConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateEciConfigResponseBody body);

        @Override
        CreateEciConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateEciConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateEciConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateEciConfigResponse response) {
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
        public Builder body(CreateEciConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateEciConfigResponse build() {
            return new CreateEciConfigResponse(this);
        } 

    } 

}
