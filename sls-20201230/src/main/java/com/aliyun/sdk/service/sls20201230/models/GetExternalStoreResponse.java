// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link GetExternalStoreResponse} extends {@link TeaModel}
 *
 * <p>GetExternalStoreResponse</p>
 */
public class GetExternalStoreResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ExternalStore body;

    private GetExternalStoreResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetExternalStoreResponse create() {
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
    public ExternalStore getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetExternalStoreResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ExternalStore body);

        @Override
        GetExternalStoreResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetExternalStoreResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ExternalStore body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetExternalStoreResponse response) {
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
        public Builder body(ExternalStore body) {
            this.body = body;
            return this;
        }

        @Override
        public GetExternalStoreResponse build() {
            return new GetExternalStoreResponse(this);
        } 

    } 

}
