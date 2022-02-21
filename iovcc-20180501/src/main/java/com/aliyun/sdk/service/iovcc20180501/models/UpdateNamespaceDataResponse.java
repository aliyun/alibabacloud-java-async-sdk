// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateNamespaceDataResponse} extends {@link TeaModel}
 *
 * <p>UpdateNamespaceDataResponse</p>
 */
public class UpdateNamespaceDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateNamespaceDataResponseBody body;

    private UpdateNamespaceDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateNamespaceDataResponse create() {
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
    public UpdateNamespaceDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateNamespaceDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateNamespaceDataResponseBody body);

        @Override
        UpdateNamespaceDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateNamespaceDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateNamespaceDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateNamespaceDataResponse response) {
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
        public Builder body(UpdateNamespaceDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateNamespaceDataResponse build() {
            return new UpdateNamespaceDataResponse(this);
        } 

    } 

}
