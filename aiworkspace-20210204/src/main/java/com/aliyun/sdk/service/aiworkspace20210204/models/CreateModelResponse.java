// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateModelResponse} extends {@link TeaModel}
 *
 * <p>CreateModelResponse</p>
 */
public class CreateModelResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateModelResponseBody body;

    private CreateModelResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateModelResponse create() {
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
    public CreateModelResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateModelResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateModelResponseBody body);

        @Override
        CreateModelResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateModelResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateModelResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateModelResponse response) {
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
        public Builder body(CreateModelResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateModelResponse build() {
            return new CreateModelResponse(this);
        } 

    } 

}
