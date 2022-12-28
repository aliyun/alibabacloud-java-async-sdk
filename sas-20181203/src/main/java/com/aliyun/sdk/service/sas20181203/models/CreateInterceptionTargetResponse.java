// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateInterceptionTargetResponse} extends {@link TeaModel}
 *
 * <p>CreateInterceptionTargetResponse</p>
 */
public class CreateInterceptionTargetResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateInterceptionTargetResponseBody body;

    private CreateInterceptionTargetResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateInterceptionTargetResponse create() {
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
    public CreateInterceptionTargetResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateInterceptionTargetResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateInterceptionTargetResponseBody body);

        @Override
        CreateInterceptionTargetResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateInterceptionTargetResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateInterceptionTargetResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateInterceptionTargetResponse response) {
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
        public Builder body(CreateInterceptionTargetResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateInterceptionTargetResponse build() {
            return new CreateInterceptionTargetResponse(this);
        } 

    } 

}
