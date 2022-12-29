// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qssj20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTrendWordAndIndexResponse} extends {@link TeaModel}
 *
 * <p>GetTrendWordAndIndexResponse</p>
 */
public class GetTrendWordAndIndexResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetTrendWordAndIndexResponseBody body;

    private GetTrendWordAndIndexResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetTrendWordAndIndexResponse create() {
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
    public GetTrendWordAndIndexResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTrendWordAndIndexResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetTrendWordAndIndexResponseBody body);

        @Override
        GetTrendWordAndIndexResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTrendWordAndIndexResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetTrendWordAndIndexResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTrendWordAndIndexResponse response) {
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
        public Builder body(GetTrendWordAndIndexResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetTrendWordAndIndexResponse build() {
            return new GetTrendWordAndIndexResponse(this);
        } 

    } 

}
