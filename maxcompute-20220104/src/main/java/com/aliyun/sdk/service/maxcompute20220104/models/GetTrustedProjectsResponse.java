// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTrustedProjectsResponse} extends {@link TeaModel}
 *
 * <p>GetTrustedProjectsResponse</p>
 */
public class GetTrustedProjectsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetTrustedProjectsResponseBody body;

    private GetTrustedProjectsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetTrustedProjectsResponse create() {
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
    public GetTrustedProjectsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTrustedProjectsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetTrustedProjectsResponseBody body);

        @Override
        GetTrustedProjectsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTrustedProjectsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetTrustedProjectsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTrustedProjectsResponse response) {
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
        public Builder body(GetTrustedProjectsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetTrustedProjectsResponse build() {
            return new GetTrustedProjectsResponse(this);
        } 

    } 

}
