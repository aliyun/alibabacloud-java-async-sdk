// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateComponentIndexResponse} extends {@link TeaModel}
 *
 * <p>CreateComponentIndexResponse</p>
 */
public class CreateComponentIndexResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateComponentIndexResponseBody body;

    private CreateComponentIndexResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateComponentIndexResponse create() {
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
    public CreateComponentIndexResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateComponentIndexResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateComponentIndexResponseBody body);

        @Override
        CreateComponentIndexResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateComponentIndexResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateComponentIndexResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateComponentIndexResponse response) {
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
        public Builder body(CreateComponentIndexResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateComponentIndexResponse build() {
            return new CreateComponentIndexResponse(this);
        } 

    } 

}
