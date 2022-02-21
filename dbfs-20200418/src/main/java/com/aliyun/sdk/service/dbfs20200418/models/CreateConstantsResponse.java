// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateConstantsResponse} extends {@link TeaModel}
 *
 * <p>CreateConstantsResponse</p>
 */
public class CreateConstantsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateConstantsResponseBody body;

    private CreateConstantsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateConstantsResponse create() {
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
    public CreateConstantsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateConstantsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateConstantsResponseBody body);

        @Override
        CreateConstantsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateConstantsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateConstantsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateConstantsResponse response) {
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
        public Builder body(CreateConstantsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateConstantsResponse build() {
            return new CreateConstantsResponse(this);
        } 

    } 

}
