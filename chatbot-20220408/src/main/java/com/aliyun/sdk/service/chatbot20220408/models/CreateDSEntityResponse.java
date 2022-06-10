// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDSEntityResponse} extends {@link TeaModel}
 *
 * <p>CreateDSEntityResponse</p>
 */
public class CreateDSEntityResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDSEntityResponseBody body;

    private CreateDSEntityResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDSEntityResponse create() {
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
    public CreateDSEntityResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDSEntityResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDSEntityResponseBody body);

        @Override
        CreateDSEntityResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDSEntityResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDSEntityResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDSEntityResponse response) {
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
        public Builder body(CreateDSEntityResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDSEntityResponse build() {
            return new CreateDSEntityResponse(this);
        } 

    } 

}
