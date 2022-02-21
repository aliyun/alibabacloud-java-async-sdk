// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHDMLastAliyunResourceSyncResultResponse} extends {@link TeaModel}
 *
 * <p>GetHDMLastAliyunResourceSyncResultResponse</p>
 */
public class GetHDMLastAliyunResourceSyncResultResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetHDMLastAliyunResourceSyncResultResponseBody body;

    private GetHDMLastAliyunResourceSyncResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetHDMLastAliyunResourceSyncResultResponse create() {
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
    public GetHDMLastAliyunResourceSyncResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetHDMLastAliyunResourceSyncResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetHDMLastAliyunResourceSyncResultResponseBody body);

        @Override
        GetHDMLastAliyunResourceSyncResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetHDMLastAliyunResourceSyncResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetHDMLastAliyunResourceSyncResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetHDMLastAliyunResourceSyncResultResponse response) {
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
        public Builder body(GetHDMLastAliyunResourceSyncResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetHDMLastAliyunResourceSyncResultResponse build() {
            return new GetHDMLastAliyunResourceSyncResultResponse(this);
        } 

    } 

}
