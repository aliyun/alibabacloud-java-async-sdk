// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSchemeTaskConfigResponse} extends {@link TeaModel}
 *
 * <p>CreateSchemeTaskConfigResponse</p>
 */
public class CreateSchemeTaskConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateSchemeTaskConfigResponseBody body;

    private CreateSchemeTaskConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateSchemeTaskConfigResponse create() {
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
    public CreateSchemeTaskConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateSchemeTaskConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateSchemeTaskConfigResponseBody body);

        @Override
        CreateSchemeTaskConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateSchemeTaskConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateSchemeTaskConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateSchemeTaskConfigResponse response) {
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
        public Builder body(CreateSchemeTaskConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateSchemeTaskConfigResponse build() {
            return new CreateSchemeTaskConfigResponse(this);
        } 

    } 

}
