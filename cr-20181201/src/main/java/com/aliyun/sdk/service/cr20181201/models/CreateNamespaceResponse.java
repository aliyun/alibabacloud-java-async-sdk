// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateNamespaceResponse} extends {@link TeaModel}
 *
 * <p>CreateNamespaceResponse</p>
 */
public class CreateNamespaceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateNamespaceResponseBody body;

    private CreateNamespaceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateNamespaceResponse create() {
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
    public CreateNamespaceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateNamespaceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateNamespaceResponseBody body);

        @Override
        CreateNamespaceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateNamespaceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateNamespaceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateNamespaceResponse response) {
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
        public Builder body(CreateNamespaceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateNamespaceResponse build() {
            return new CreateNamespaceResponse(this);
        } 

    } 

}
