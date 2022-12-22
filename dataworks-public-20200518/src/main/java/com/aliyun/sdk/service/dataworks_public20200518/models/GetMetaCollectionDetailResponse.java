// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMetaCollectionDetailResponse} extends {@link TeaModel}
 *
 * <p>GetMetaCollectionDetailResponse</p>
 */
public class GetMetaCollectionDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetMetaCollectionDetailResponseBody body;

    private GetMetaCollectionDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetMetaCollectionDetailResponse create() {
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
    public GetMetaCollectionDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetMetaCollectionDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetMetaCollectionDetailResponseBody body);

        @Override
        GetMetaCollectionDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetMetaCollectionDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetMetaCollectionDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetMetaCollectionDetailResponse response) {
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
        public Builder body(GetMetaCollectionDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetMetaCollectionDetailResponse build() {
            return new GetMetaCollectionDetailResponse(this);
        } 

    } 

}
