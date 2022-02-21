// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetStructSyncJobAnalyzeResultResponse} extends {@link TeaModel}
 *
 * <p>GetStructSyncJobAnalyzeResultResponse</p>
 */
public class GetStructSyncJobAnalyzeResultResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetStructSyncJobAnalyzeResultResponseBody body;

    private GetStructSyncJobAnalyzeResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetStructSyncJobAnalyzeResultResponse create() {
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
    public GetStructSyncJobAnalyzeResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetStructSyncJobAnalyzeResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetStructSyncJobAnalyzeResultResponseBody body);

        @Override
        GetStructSyncJobAnalyzeResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetStructSyncJobAnalyzeResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetStructSyncJobAnalyzeResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetStructSyncJobAnalyzeResultResponse response) {
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
        public Builder body(GetStructSyncJobAnalyzeResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetStructSyncJobAnalyzeResultResponse build() {
            return new GetStructSyncJobAnalyzeResultResponse(this);
        } 

    } 

}
