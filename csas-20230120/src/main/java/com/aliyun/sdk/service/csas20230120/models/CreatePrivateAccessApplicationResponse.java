// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePrivateAccessApplicationResponse} extends {@link TeaModel}
 *
 * <p>CreatePrivateAccessApplicationResponse</p>
 */
public class CreatePrivateAccessApplicationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreatePrivateAccessApplicationResponseBody body;

    private CreatePrivateAccessApplicationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreatePrivateAccessApplicationResponse create() {
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
    public CreatePrivateAccessApplicationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreatePrivateAccessApplicationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreatePrivateAccessApplicationResponseBody body);

        @Override
        CreatePrivateAccessApplicationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreatePrivateAccessApplicationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreatePrivateAccessApplicationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreatePrivateAccessApplicationResponse response) {
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
        public Builder body(CreatePrivateAccessApplicationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreatePrivateAccessApplicationResponse build() {
            return new CreatePrivateAccessApplicationResponse(this);
        } 

    } 

}
