// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCheckTypeToSchemeResponse} extends {@link TeaModel}
 *
 * <p>CreateCheckTypeToSchemeResponse</p>
 */
public class CreateCheckTypeToSchemeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateCheckTypeToSchemeResponseBody body;

    private CreateCheckTypeToSchemeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateCheckTypeToSchemeResponse create() {
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
    public CreateCheckTypeToSchemeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateCheckTypeToSchemeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateCheckTypeToSchemeResponseBody body);

        @Override
        CreateCheckTypeToSchemeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateCheckTypeToSchemeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateCheckTypeToSchemeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateCheckTypeToSchemeResponse response) {
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
        public Builder body(CreateCheckTypeToSchemeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateCheckTypeToSchemeResponse build() {
            return new CreateCheckTypeToSchemeResponse(this);
        } 

    } 

}
