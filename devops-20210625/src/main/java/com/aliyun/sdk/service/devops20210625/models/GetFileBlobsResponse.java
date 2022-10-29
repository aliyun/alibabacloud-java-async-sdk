// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFileBlobsResponse} extends {@link TeaModel}
 *
 * <p>GetFileBlobsResponse</p>
 */
public class GetFileBlobsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetFileBlobsResponseBody body;

    private GetFileBlobsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetFileBlobsResponse create() {
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
    public GetFileBlobsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetFileBlobsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetFileBlobsResponseBody body);

        @Override
        GetFileBlobsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetFileBlobsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetFileBlobsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetFileBlobsResponse response) {
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
        public Builder body(GetFileBlobsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetFileBlobsResponse build() {
            return new GetFileBlobsResponse(this);
        } 

    } 

}
