// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSyncResultResponse} extends {@link TeaModel}
 *
 * <p>GetSyncResultResponse</p>
 */
public class GetSyncResultResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSyncResultResponseBody body;

    private GetSyncResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSyncResultResponse create() {
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
    public GetSyncResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSyncResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSyncResultResponseBody body);

        @Override
        GetSyncResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSyncResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSyncResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSyncResultResponse response) {
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
        public Builder body(GetSyncResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSyncResultResponse build() {
            return new GetSyncResultResponse(this);
        } 

    } 

}
