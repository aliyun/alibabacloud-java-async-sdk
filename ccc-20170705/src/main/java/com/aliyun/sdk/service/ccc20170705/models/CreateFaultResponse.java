// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFaultResponse} extends {@link TeaModel}
 *
 * <p>CreateFaultResponse</p>
 */
public class CreateFaultResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateFaultResponseBody body;

    private CreateFaultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateFaultResponse create() {
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
    public CreateFaultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateFaultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateFaultResponseBody body);

        @Override
        CreateFaultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateFaultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateFaultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateFaultResponse response) {
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
        public Builder body(CreateFaultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateFaultResponse build() {
            return new CreateFaultResponse(this);
        } 

    } 

}
