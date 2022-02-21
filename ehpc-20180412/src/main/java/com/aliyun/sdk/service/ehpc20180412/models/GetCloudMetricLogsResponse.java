// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCloudMetricLogsResponse} extends {@link TeaModel}
 *
 * <p>GetCloudMetricLogsResponse</p>
 */
public class GetCloudMetricLogsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetCloudMetricLogsResponseBody body;

    private GetCloudMetricLogsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetCloudMetricLogsResponse create() {
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
    public GetCloudMetricLogsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetCloudMetricLogsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetCloudMetricLogsResponseBody body);

        @Override
        GetCloudMetricLogsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetCloudMetricLogsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetCloudMetricLogsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetCloudMetricLogsResponse response) {
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
        public Builder body(GetCloudMetricLogsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetCloudMetricLogsResponse build() {
            return new GetCloudMetricLogsResponse(this);
        } 

    } 

}
