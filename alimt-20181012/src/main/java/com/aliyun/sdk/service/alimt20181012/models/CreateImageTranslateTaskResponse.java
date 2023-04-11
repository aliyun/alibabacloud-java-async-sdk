// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alimt20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateImageTranslateTaskResponse} extends {@link TeaModel}
 *
 * <p>CreateImageTranslateTaskResponse</p>
 */
public class CreateImageTranslateTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateImageTranslateTaskResponseBody body;

    private CreateImageTranslateTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateImageTranslateTaskResponse create() {
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
    public CreateImageTranslateTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateImageTranslateTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateImageTranslateTaskResponseBody body);

        @Override
        CreateImageTranslateTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateImageTranslateTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateImageTranslateTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateImageTranslateTaskResponse response) {
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
        public Builder body(CreateImageTranslateTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateImageTranslateTaskResponse build() {
            return new CreateImageTranslateTaskResponse(this);
        } 

    } 

}
