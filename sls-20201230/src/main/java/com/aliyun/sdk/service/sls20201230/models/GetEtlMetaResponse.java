// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link GetEtlMetaResponse} extends {@link TeaModel}
 *
 * <p>GetEtlMetaResponse</p>
 */
public class GetEtlMetaResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetEtlMetaResponseBody body;

    private GetEtlMetaResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetEtlMetaResponse create() {
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
    public GetEtlMetaResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetEtlMetaResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetEtlMetaResponseBody body);

        @Override
        GetEtlMetaResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetEtlMetaResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetEtlMetaResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetEtlMetaResponse response) {
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
        public Builder body(GetEtlMetaResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetEtlMetaResponse build() {
            return new GetEtlMetaResponse(this);
        } 

    } 

}
