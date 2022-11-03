// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xgippop20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetItemInstListResponse} extends {@link TeaModel}
 *
 * <p>GetItemInstListResponse</p>
 */
public class GetItemInstListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetItemInstListResponseBody body;

    private GetItemInstListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetItemInstListResponse create() {
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
    public GetItemInstListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetItemInstListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetItemInstListResponseBody body);

        @Override
        GetItemInstListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetItemInstListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetItemInstListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetItemInstListResponse response) {
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
        public Builder body(GetItemInstListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetItemInstListResponse build() {
            return new GetItemInstListResponse(this);
        } 

    } 

}
