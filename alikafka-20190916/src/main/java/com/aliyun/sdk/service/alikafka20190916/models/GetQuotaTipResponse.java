// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQuotaTipResponse} extends {@link TeaModel}
 *
 * <p>GetQuotaTipResponse</p>
 */
public class GetQuotaTipResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetQuotaTipResponseBody body;

    private GetQuotaTipResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetQuotaTipResponse create() {
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
    public GetQuotaTipResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetQuotaTipResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetQuotaTipResponseBody body);

        @Override
        GetQuotaTipResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetQuotaTipResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetQuotaTipResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetQuotaTipResponse response) {
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
        public Builder body(GetQuotaTipResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetQuotaTipResponse build() {
            return new GetQuotaTipResponse(this);
        } 

    } 

}
