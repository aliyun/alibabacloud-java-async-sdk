// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qssj20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTrendIndexResponse} extends {@link TeaModel}
 *
 * <p>GetTrendIndexResponse</p>
 */
public class GetTrendIndexResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetTrendIndexResponseBody body;

    private GetTrendIndexResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetTrendIndexResponse create() {
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
    public GetTrendIndexResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTrendIndexResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetTrendIndexResponseBody body);

        @Override
        GetTrendIndexResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTrendIndexResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetTrendIndexResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTrendIndexResponse response) {
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
        public Builder body(GetTrendIndexResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetTrendIndexResponse build() {
            return new GetTrendIndexResponse(this);
        } 

    } 

}
