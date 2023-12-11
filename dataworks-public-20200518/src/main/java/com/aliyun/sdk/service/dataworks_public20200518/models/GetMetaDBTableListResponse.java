// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMetaDBTableListResponse} extends {@link TeaModel}
 *
 * <p>GetMetaDBTableListResponse</p>
 */
public class GetMetaDBTableListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetMetaDBTableListResponseBody body;

    private GetMetaDBTableListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetMetaDBTableListResponse create() {
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
    public GetMetaDBTableListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetMetaDBTableListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetMetaDBTableListResponseBody body);

        @Override
        GetMetaDBTableListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetMetaDBTableListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetMetaDBTableListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetMetaDBTableListResponse response) {
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
        public Builder body(GetMetaDBTableListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetMetaDBTableListResponse build() {
            return new GetMetaDBTableListResponse(this);
        } 

    } 

}
