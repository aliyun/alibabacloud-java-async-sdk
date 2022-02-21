// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCertifyResultResponse} extends {@link TeaModel}
 *
 * <p>GetCertifyResultResponse</p>
 */
public class GetCertifyResultResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetCertifyResultResponseBody body;

    private GetCertifyResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetCertifyResultResponse create() {
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
    public GetCertifyResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetCertifyResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetCertifyResultResponseBody body);

        @Override
        GetCertifyResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetCertifyResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetCertifyResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetCertifyResultResponse response) {
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
        public Builder body(GetCertifyResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetCertifyResultResponse build() {
            return new GetCertifyResultResponse(this);
        } 

    } 

}
