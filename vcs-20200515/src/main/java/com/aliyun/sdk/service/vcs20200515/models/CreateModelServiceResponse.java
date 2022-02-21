// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateModelServiceResponse} extends {@link TeaModel}
 *
 * <p>CreateModelServiceResponse</p>
 */
public class CreateModelServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateModelServiceResponseBody body;

    private CreateModelServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateModelServiceResponse create() {
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
    public CreateModelServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateModelServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateModelServiceResponseBody body);

        @Override
        CreateModelServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateModelServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateModelServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateModelServiceResponse response) {
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
        public Builder body(CreateModelServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateModelServiceResponse build() {
            return new CreateModelServiceResponse(this);
        } 

    } 

}
