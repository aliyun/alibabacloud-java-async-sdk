// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetApplicationListResponse} extends {@link TeaModel}
 *
 * <p>GetApplicationListResponse</p>
 */
public class GetApplicationListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetApplicationListResponseBody body;

    private GetApplicationListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetApplicationListResponse create() {
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
    public GetApplicationListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetApplicationListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetApplicationListResponseBody body);

        @Override
        GetApplicationListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetApplicationListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetApplicationListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetApplicationListResponse response) {
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
        public Builder body(GetApplicationListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetApplicationListResponse build() {
            return new GetApplicationListResponse(this);
        } 

    } 

}
