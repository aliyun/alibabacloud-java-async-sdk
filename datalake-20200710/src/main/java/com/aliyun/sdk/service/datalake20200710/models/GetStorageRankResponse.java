// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetStorageRankResponse} extends {@link TeaModel}
 *
 * <p>GetStorageRankResponse</p>
 */
public class GetStorageRankResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetStorageRankResponseBody body;

    private GetStorageRankResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetStorageRankResponse create() {
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
    public GetStorageRankResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetStorageRankResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetStorageRankResponseBody body);

        @Override
        GetStorageRankResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetStorageRankResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetStorageRankResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetStorageRankResponse response) {
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
        public Builder body(GetStorageRankResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetStorageRankResponse build() {
            return new GetStorageRankResponse(this);
        } 

    } 

}
