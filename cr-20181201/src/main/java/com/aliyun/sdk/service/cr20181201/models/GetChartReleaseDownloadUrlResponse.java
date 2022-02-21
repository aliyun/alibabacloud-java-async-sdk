// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetChartReleaseDownloadUrlResponse} extends {@link TeaModel}
 *
 * <p>GetChartReleaseDownloadUrlResponse</p>
 */
public class GetChartReleaseDownloadUrlResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetChartReleaseDownloadUrlResponseBody body;

    private GetChartReleaseDownloadUrlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetChartReleaseDownloadUrlResponse create() {
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
    public GetChartReleaseDownloadUrlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetChartReleaseDownloadUrlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetChartReleaseDownloadUrlResponseBody body);

        @Override
        GetChartReleaseDownloadUrlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetChartReleaseDownloadUrlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetChartReleaseDownloadUrlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetChartReleaseDownloadUrlResponse response) {
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
        public Builder body(GetChartReleaseDownloadUrlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetChartReleaseDownloadUrlResponse build() {
            return new GetChartReleaseDownloadUrlResponse(this);
        } 

    } 

}
