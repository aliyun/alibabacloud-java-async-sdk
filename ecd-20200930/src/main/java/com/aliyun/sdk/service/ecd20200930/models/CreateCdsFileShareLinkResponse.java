// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCdsFileShareLinkResponse} extends {@link TeaModel}
 *
 * <p>CreateCdsFileShareLinkResponse</p>
 */
public class CreateCdsFileShareLinkResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateCdsFileShareLinkResponseBody body;

    private CreateCdsFileShareLinkResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateCdsFileShareLinkResponse create() {
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
    public CreateCdsFileShareLinkResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateCdsFileShareLinkResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateCdsFileShareLinkResponseBody body);

        @Override
        CreateCdsFileShareLinkResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateCdsFileShareLinkResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateCdsFileShareLinkResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateCdsFileShareLinkResponse response) {
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
        public Builder body(CreateCdsFileShareLinkResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateCdsFileShareLinkResponse build() {
            return new CreateCdsFileShareLinkResponse(this);
        } 

    } 

}
