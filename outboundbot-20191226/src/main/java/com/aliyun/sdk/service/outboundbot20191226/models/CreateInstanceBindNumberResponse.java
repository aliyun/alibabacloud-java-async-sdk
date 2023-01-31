// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateInstanceBindNumberResponse} extends {@link TeaModel}
 *
 * <p>CreateInstanceBindNumberResponse</p>
 */
public class CreateInstanceBindNumberResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateInstanceBindNumberResponseBody body;

    private CreateInstanceBindNumberResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateInstanceBindNumberResponse create() {
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
    public CreateInstanceBindNumberResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateInstanceBindNumberResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateInstanceBindNumberResponseBody body);

        @Override
        CreateInstanceBindNumberResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateInstanceBindNumberResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateInstanceBindNumberResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateInstanceBindNumberResponse response) {
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
        public Builder body(CreateInstanceBindNumberResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateInstanceBindNumberResponse build() {
            return new CreateInstanceBindNumberResponse(this);
        } 

    } 

}
