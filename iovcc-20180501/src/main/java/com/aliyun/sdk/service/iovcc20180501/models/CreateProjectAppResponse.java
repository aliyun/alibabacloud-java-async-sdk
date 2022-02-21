// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateProjectAppResponse} extends {@link TeaModel}
 *
 * <p>CreateProjectAppResponse</p>
 */
public class CreateProjectAppResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateProjectAppResponseBody body;

    private CreateProjectAppResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateProjectAppResponse create() {
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
    public CreateProjectAppResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateProjectAppResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateProjectAppResponseBody body);

        @Override
        CreateProjectAppResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateProjectAppResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateProjectAppResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateProjectAppResponse response) {
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
        public Builder body(CreateProjectAppResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateProjectAppResponse build() {
            return new CreateProjectAppResponse(this);
        } 

    } 

}
