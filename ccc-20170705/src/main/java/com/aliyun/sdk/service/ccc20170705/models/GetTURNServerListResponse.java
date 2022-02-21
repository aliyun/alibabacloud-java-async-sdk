// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTURNServerListResponse} extends {@link TeaModel}
 *
 * <p>GetTURNServerListResponse</p>
 */
public class GetTURNServerListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetTURNServerListResponseBody body;

    private GetTURNServerListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetTURNServerListResponse create() {
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
    public GetTURNServerListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTURNServerListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetTURNServerListResponseBody body);

        @Override
        GetTURNServerListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTURNServerListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetTURNServerListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTURNServerListResponse response) {
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
        public Builder body(GetTURNServerListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetTURNServerListResponse build() {
            return new GetTURNServerListResponse(this);
        } 

    } 

}
