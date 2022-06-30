// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qssj20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTrendImageDetailResponse} extends {@link TeaModel}
 *
 * <p>GetTrendImageDetailResponse</p>
 */
public class GetTrendImageDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetTrendImageDetailResponseBody body;

    private GetTrendImageDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetTrendImageDetailResponse create() {
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
    public GetTrendImageDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTrendImageDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetTrendImageDetailResponseBody body);

        @Override
        GetTrendImageDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTrendImageDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetTrendImageDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTrendImageDetailResponse response) {
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
        public Builder body(GetTrendImageDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetTrendImageDetailResponse build() {
            return new GetTrendImageDetailResponse(this);
        } 

    } 

}
