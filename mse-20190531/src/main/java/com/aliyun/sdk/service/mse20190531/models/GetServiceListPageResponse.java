// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetServiceListPageResponse} extends {@link TeaModel}
 *
 * <p>GetServiceListPageResponse</p>
 */
public class GetServiceListPageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetServiceListPageResponseBody body;

    private GetServiceListPageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetServiceListPageResponse create() {
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
    public GetServiceListPageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetServiceListPageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetServiceListPageResponseBody body);

        @Override
        GetServiceListPageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetServiceListPageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetServiceListPageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetServiceListPageResponse response) {
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
        public Builder body(GetServiceListPageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetServiceListPageResponse build() {
            return new GetServiceListPageResponse(this);
        } 

    } 

}
