// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qssj20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTrendImageListResponse} extends {@link TeaModel}
 *
 * <p>GetTrendImageListResponse</p>
 */
public class GetTrendImageListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetTrendImageListResponseBody body;

    private GetTrendImageListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetTrendImageListResponse create() {
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
    public GetTrendImageListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTrendImageListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetTrendImageListResponseBody body);

        @Override
        GetTrendImageListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTrendImageListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetTrendImageListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTrendImageListResponse response) {
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
        public Builder body(GetTrendImageListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetTrendImageListResponse build() {
            return new GetTrendImageListResponse(this);
        } 

    } 

}
