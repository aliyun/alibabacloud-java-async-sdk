// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDBResponse} extends {@link TeaModel}
 *
 * <p>CreateDBResponse</p>
 */
public class CreateDBResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDBResponseBody body;

    private CreateDBResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDBResponse create() {
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
    public CreateDBResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDBResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDBResponseBody body);

        @Override
        CreateDBResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDBResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDBResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDBResponse response) {
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
        public Builder body(CreateDBResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDBResponse build() {
            return new CreateDBResponse(this);
        } 

    } 

}
