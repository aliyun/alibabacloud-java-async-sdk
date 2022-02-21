// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateNamespaceResponse} extends {@link TeaModel}
 *
 * <p>UpdateNamespaceResponse</p>
 */
public class UpdateNamespaceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateNamespaceResponseBody body;

    private UpdateNamespaceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateNamespaceResponse create() {
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
    public UpdateNamespaceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateNamespaceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateNamespaceResponseBody body);

        @Override
        UpdateNamespaceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateNamespaceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateNamespaceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateNamespaceResponse response) {
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
        public Builder body(UpdateNamespaceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateNamespaceResponse build() {
            return new UpdateNamespaceResponse(this);
        } 

    } 

}
