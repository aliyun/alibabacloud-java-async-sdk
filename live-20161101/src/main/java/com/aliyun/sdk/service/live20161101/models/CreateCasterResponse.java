// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCasterResponse} extends {@link TeaModel}
 *
 * <p>CreateCasterResponse</p>
 */
public class CreateCasterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateCasterResponseBody body;

    private CreateCasterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateCasterResponse create() {
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
    public CreateCasterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateCasterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateCasterResponseBody body);

        @Override
        CreateCasterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateCasterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateCasterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateCasterResponse response) {
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
        public Builder body(CreateCasterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateCasterResponse build() {
            return new CreateCasterResponse(this);
        } 

    } 

}
