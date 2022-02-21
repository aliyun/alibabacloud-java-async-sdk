// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSparkJobExecutorLogsResponse} extends {@link TeaModel}
 *
 * <p>GetSparkJobExecutorLogsResponse</p>
 */
public class GetSparkJobExecutorLogsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSparkJobExecutorLogsResponseBody body;

    private GetSparkJobExecutorLogsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSparkJobExecutorLogsResponse create() {
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
    public GetSparkJobExecutorLogsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSparkJobExecutorLogsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSparkJobExecutorLogsResponseBody body);

        @Override
        GetSparkJobExecutorLogsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSparkJobExecutorLogsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSparkJobExecutorLogsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSparkJobExecutorLogsResponse response) {
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
        public Builder body(GetSparkJobExecutorLogsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSparkJobExecutorLogsResponse build() {
            return new GetSparkJobExecutorLogsResponse(this);
        } 

    } 

}
