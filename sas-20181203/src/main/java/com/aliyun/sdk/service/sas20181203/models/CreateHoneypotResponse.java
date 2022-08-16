// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateHoneypotResponse} extends {@link TeaModel}
 *
 * <p>CreateHoneypotResponse</p>
 */
public class CreateHoneypotResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateHoneypotResponseBody body;

    private CreateHoneypotResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateHoneypotResponse create() {
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
    public CreateHoneypotResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateHoneypotResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateHoneypotResponseBody body);

        @Override
        CreateHoneypotResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateHoneypotResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateHoneypotResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateHoneypotResponse response) {
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
        public Builder body(CreateHoneypotResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateHoneypotResponse build() {
            return new CreateHoneypotResponse(this);
        } 

    } 

}
