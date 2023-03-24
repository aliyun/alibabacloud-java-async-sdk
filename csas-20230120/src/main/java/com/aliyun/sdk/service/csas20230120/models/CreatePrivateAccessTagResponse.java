// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePrivateAccessTagResponse} extends {@link TeaModel}
 *
 * <p>CreatePrivateAccessTagResponse</p>
 */
public class CreatePrivateAccessTagResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreatePrivateAccessTagResponseBody body;

    private CreatePrivateAccessTagResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreatePrivateAccessTagResponse create() {
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
    public CreatePrivateAccessTagResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreatePrivateAccessTagResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreatePrivateAccessTagResponseBody body);

        @Override
        CreatePrivateAccessTagResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreatePrivateAccessTagResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreatePrivateAccessTagResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreatePrivateAccessTagResponse response) {
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
        public Builder body(CreatePrivateAccessTagResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreatePrivateAccessTagResponse build() {
            return new CreatePrivateAccessTagResponse(this);
        } 

    } 

}
