// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSyncQualityCheckResultResponse} extends {@link TeaModel}
 *
 * <p>GetSyncQualityCheckResultResponse</p>
 */
public class GetSyncQualityCheckResultResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSyncQualityCheckResultResponseBody body;

    private GetSyncQualityCheckResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSyncQualityCheckResultResponse create() {
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
    public GetSyncQualityCheckResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSyncQualityCheckResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSyncQualityCheckResultResponseBody body);

        @Override
        GetSyncQualityCheckResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSyncQualityCheckResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSyncQualityCheckResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSyncQualityCheckResultResponse response) {
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
        public Builder body(GetSyncQualityCheckResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSyncQualityCheckResultResponse build() {
            return new GetSyncQualityCheckResultResponse(this);
        } 

    } 

}
