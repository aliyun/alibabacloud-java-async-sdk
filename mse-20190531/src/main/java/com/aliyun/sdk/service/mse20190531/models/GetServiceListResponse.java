// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetServiceListResponse} extends {@link TeaModel}
 *
 * <p>GetServiceListResponse</p>
 */
public class GetServiceListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetServiceListResponseBody body;

    private GetServiceListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetServiceListResponse create() {
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
    public GetServiceListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetServiceListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetServiceListResponseBody body);

        @Override
        GetServiceListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetServiceListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetServiceListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetServiceListResponse response) {
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
        public Builder body(GetServiceListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetServiceListResponse build() {
            return new GetServiceListResponse(this);
        } 

    } 

}
