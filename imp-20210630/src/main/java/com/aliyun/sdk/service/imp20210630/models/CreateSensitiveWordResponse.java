// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSensitiveWordResponse} extends {@link TeaModel}
 *
 * <p>CreateSensitiveWordResponse</p>
 */
public class CreateSensitiveWordResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateSensitiveWordResponseBody body;

    private CreateSensitiveWordResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateSensitiveWordResponse create() {
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
    public CreateSensitiveWordResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateSensitiveWordResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateSensitiveWordResponseBody body);

        @Override
        CreateSensitiveWordResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateSensitiveWordResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateSensitiveWordResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateSensitiveWordResponse response) {
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
        public Builder body(CreateSensitiveWordResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateSensitiveWordResponse build() {
            return new CreateSensitiveWordResponse(this);
        } 

    } 

}
