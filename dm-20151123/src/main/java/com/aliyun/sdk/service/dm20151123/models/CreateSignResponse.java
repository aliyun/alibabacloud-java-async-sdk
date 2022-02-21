// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSignResponse} extends {@link TeaModel}
 *
 * <p>CreateSignResponse</p>
 */
public class CreateSignResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateSignResponseBody body;

    private CreateSignResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateSignResponse create() {
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
    public CreateSignResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateSignResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateSignResponseBody body);

        @Override
        CreateSignResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateSignResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateSignResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateSignResponse response) {
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
        public Builder body(CreateSignResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateSignResponse build() {
            return new CreateSignResponse(this);
        } 

    } 

}
