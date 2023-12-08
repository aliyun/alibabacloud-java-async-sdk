// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEnterpriseDataChunkResponse} extends {@link TeaModel}
 *
 * <p>GetEnterpriseDataChunkResponse</p>
 */
public class GetEnterpriseDataChunkResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetEnterpriseDataChunkResponseBody body;

    private GetEnterpriseDataChunkResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetEnterpriseDataChunkResponse create() {
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
    public GetEnterpriseDataChunkResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetEnterpriseDataChunkResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetEnterpriseDataChunkResponseBody body);

        @Override
        GetEnterpriseDataChunkResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetEnterpriseDataChunkResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetEnterpriseDataChunkResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetEnterpriseDataChunkResponse response) {
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
        public Builder body(GetEnterpriseDataChunkResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetEnterpriseDataChunkResponse build() {
            return new GetEnterpriseDataChunkResponse(this);
        } 

    } 

}
