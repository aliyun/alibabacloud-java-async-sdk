// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRelationProductListResponse} extends {@link TeaModel}
 *
 * <p>GetRelationProductListResponse</p>
 */
public class GetRelationProductListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetRelationProductListResponseBody body;

    private GetRelationProductListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetRelationProductListResponse create() {
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
    public GetRelationProductListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetRelationProductListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetRelationProductListResponseBody body);

        @Override
        GetRelationProductListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetRelationProductListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetRelationProductListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetRelationProductListResponse response) {
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
        public Builder body(GetRelationProductListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetRelationProductListResponse build() {
            return new GetRelationProductListResponse(this);
        } 

    } 

}
