// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRunningJobsResponse} extends {@link TeaModel}
 *
 * <p>GetRunningJobsResponse</p>
 */
public class GetRunningJobsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetRunningJobsResponseBody body;

    private GetRunningJobsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetRunningJobsResponse create() {
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
    public GetRunningJobsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetRunningJobsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetRunningJobsResponseBody body);

        @Override
        GetRunningJobsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetRunningJobsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetRunningJobsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetRunningJobsResponse response) {
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
        public Builder body(GetRunningJobsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetRunningJobsResponse build() {
            return new GetRunningJobsResponse(this);
        } 

    } 

}
