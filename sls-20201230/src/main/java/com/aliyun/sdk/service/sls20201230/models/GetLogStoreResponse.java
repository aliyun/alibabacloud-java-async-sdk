// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link GetLogStoreResponse} extends {@link TeaModel}
 *
 * <p>GetLogStoreResponse</p>
 */
public class GetLogStoreResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private Logstore body;

    private GetLogStoreResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetLogStoreResponse create() {
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
    public Logstore getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetLogStoreResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(Logstore body);

        @Override
        GetLogStoreResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetLogStoreResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Logstore body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetLogStoreResponse response) {
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
        public Builder body(Logstore body) {
            this.body = body;
            return this;
        }

        @Override
        public GetLogStoreResponse build() {
            return new GetLogStoreResponse(this);
        } 

    } 

}
