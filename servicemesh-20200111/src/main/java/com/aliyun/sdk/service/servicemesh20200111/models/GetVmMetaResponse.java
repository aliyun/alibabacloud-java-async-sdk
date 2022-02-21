// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVmMetaResponse} extends {@link TeaModel}
 *
 * <p>GetVmMetaResponse</p>
 */
public class GetVmMetaResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetVmMetaResponseBody body;

    private GetVmMetaResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetVmMetaResponse create() {
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
    public GetVmMetaResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetVmMetaResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetVmMetaResponseBody body);

        @Override
        GetVmMetaResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetVmMetaResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetVmMetaResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetVmMetaResponse response) {
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
        public Builder body(GetVmMetaResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetVmMetaResponse build() {
            return new GetVmMetaResponse(this);
        } 

    } 

}
