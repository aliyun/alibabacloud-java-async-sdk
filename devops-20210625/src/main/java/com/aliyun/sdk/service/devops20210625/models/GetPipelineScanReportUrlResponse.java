// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPipelineScanReportUrlResponse} extends {@link TeaModel}
 *
 * <p>GetPipelineScanReportUrlResponse</p>
 */
public class GetPipelineScanReportUrlResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetPipelineScanReportUrlResponseBody body;

    private GetPipelineScanReportUrlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetPipelineScanReportUrlResponse create() {
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
    public GetPipelineScanReportUrlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetPipelineScanReportUrlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetPipelineScanReportUrlResponseBody body);

        @Override
        GetPipelineScanReportUrlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetPipelineScanReportUrlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetPipelineScanReportUrlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetPipelineScanReportUrlResponse response) {
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
        public Builder body(GetPipelineScanReportUrlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetPipelineScanReportUrlResponse build() {
            return new GetPipelineScanReportUrlResponse(this);
        } 

    } 

}
