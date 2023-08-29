// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOpenGlobalDataResponse} extends {@link TeaModel}
 *
 * <p>CreateOpenGlobalDataResponse</p>
 */
public class CreateOpenGlobalDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateOpenGlobalDataResponseBody body;

    private CreateOpenGlobalDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateOpenGlobalDataResponse create() {
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
    public CreateOpenGlobalDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateOpenGlobalDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateOpenGlobalDataResponseBody body);

        @Override
        CreateOpenGlobalDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateOpenGlobalDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateOpenGlobalDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateOpenGlobalDataResponse response) {
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
        public Builder body(CreateOpenGlobalDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateOpenGlobalDataResponse build() {
            return new CreateOpenGlobalDataResponse(this);
        } 

    } 

}
