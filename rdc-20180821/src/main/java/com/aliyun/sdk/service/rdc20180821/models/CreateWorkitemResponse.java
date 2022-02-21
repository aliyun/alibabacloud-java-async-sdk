// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdc20180821.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateWorkitemResponse} extends {@link TeaModel}
 *
 * <p>CreateWorkitemResponse</p>
 */
public class CreateWorkitemResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateWorkitemResponseBody body;

    private CreateWorkitemResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateWorkitemResponse create() {
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
    public CreateWorkitemResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateWorkitemResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateWorkitemResponseBody body);

        @Override
        CreateWorkitemResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateWorkitemResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateWorkitemResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateWorkitemResponse response) {
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
        public Builder body(CreateWorkitemResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateWorkitemResponse build() {
            return new CreateWorkitemResponse(this);
        } 

    } 

}
