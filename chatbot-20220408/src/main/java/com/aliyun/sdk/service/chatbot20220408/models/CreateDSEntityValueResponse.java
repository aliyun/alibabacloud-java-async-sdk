// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDSEntityValueResponse} extends {@link TeaModel}
 *
 * <p>CreateDSEntityValueResponse</p>
 */
public class CreateDSEntityValueResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDSEntityValueResponseBody body;

    private CreateDSEntityValueResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDSEntityValueResponse create() {
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
    public CreateDSEntityValueResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDSEntityValueResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDSEntityValueResponseBody body);

        @Override
        CreateDSEntityValueResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDSEntityValueResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDSEntityValueResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDSEntityValueResponse response) {
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
        public Builder body(CreateDSEntityValueResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDSEntityValueResponse build() {
            return new CreateDSEntityValueResponse(this);
        } 

    } 

}
