// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateKeyVersionResponse} extends {@link TeaModel}
 *
 * <p>CreateKeyVersionResponse</p>
 */
public class CreateKeyVersionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateKeyVersionResponseBody body;

    private CreateKeyVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateKeyVersionResponse create() {
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
    public CreateKeyVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateKeyVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateKeyVersionResponseBody body);

        @Override
        CreateKeyVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateKeyVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateKeyVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateKeyVersionResponse response) {
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
        public Builder body(CreateKeyVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateKeyVersionResponse build() {
            return new CreateKeyVersionResponse(this);
        } 

    } 

}
