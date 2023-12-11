// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateConnectionResponse} extends {@link TeaModel}
 *
 * <p>CreateConnectionResponse</p>
 */
public class CreateConnectionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateConnectionResponseBody body;

    private CreateConnectionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateConnectionResponse create() {
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
    public CreateConnectionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateConnectionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateConnectionResponseBody body);

        @Override
        CreateConnectionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateConnectionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateConnectionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateConnectionResponse response) {
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
        public Builder body(CreateConnectionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateConnectionResponse build() {
            return new CreateConnectionResponse(this);
        } 

    } 

}
