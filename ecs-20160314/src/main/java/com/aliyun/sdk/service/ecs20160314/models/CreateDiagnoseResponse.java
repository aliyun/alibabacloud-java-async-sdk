// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDiagnoseResponse} extends {@link TeaModel}
 *
 * <p>CreateDiagnoseResponse</p>
 */
public class CreateDiagnoseResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDiagnoseResponseBody body;

    private CreateDiagnoseResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDiagnoseResponse create() {
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
    public CreateDiagnoseResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDiagnoseResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDiagnoseResponseBody body);

        @Override
        CreateDiagnoseResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDiagnoseResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDiagnoseResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDiagnoseResponse response) {
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
        public Builder body(CreateDiagnoseResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDiagnoseResponse build() {
            return new CreateDiagnoseResponse(this);
        } 

    } 

}
