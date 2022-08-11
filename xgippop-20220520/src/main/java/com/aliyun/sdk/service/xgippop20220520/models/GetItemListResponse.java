// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xgippop20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetItemListResponse} extends {@link TeaModel}
 *
 * <p>GetItemListResponse</p>
 */
public class GetItemListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetItemListResponseBody body;

    private GetItemListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetItemListResponse create() {
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
    public GetItemListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetItemListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetItemListResponseBody body);

        @Override
        GetItemListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetItemListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetItemListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetItemListResponse response) {
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
        public Builder body(GetItemListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetItemListResponse build() {
            return new GetItemListResponse(this);
        } 

    } 

}
