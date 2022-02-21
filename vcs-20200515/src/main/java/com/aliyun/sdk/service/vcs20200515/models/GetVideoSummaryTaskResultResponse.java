// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVideoSummaryTaskResultResponse} extends {@link TeaModel}
 *
 * <p>GetVideoSummaryTaskResultResponse</p>
 */
public class GetVideoSummaryTaskResultResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetVideoSummaryTaskResultResponseBody body;

    private GetVideoSummaryTaskResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetVideoSummaryTaskResultResponse create() {
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
    public GetVideoSummaryTaskResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetVideoSummaryTaskResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetVideoSummaryTaskResultResponseBody body);

        @Override
        GetVideoSummaryTaskResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetVideoSummaryTaskResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetVideoSummaryTaskResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetVideoSummaryTaskResultResponse response) {
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
        public Builder body(GetVideoSummaryTaskResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetVideoSummaryTaskResultResponse build() {
            return new GetVideoSummaryTaskResultResponse(this);
        } 

    } 

}
