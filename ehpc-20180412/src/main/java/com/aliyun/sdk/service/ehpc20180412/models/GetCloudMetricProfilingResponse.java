// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCloudMetricProfilingResponse} extends {@link TeaModel}
 *
 * <p>GetCloudMetricProfilingResponse</p>
 */
public class GetCloudMetricProfilingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetCloudMetricProfilingResponseBody body;

    private GetCloudMetricProfilingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetCloudMetricProfilingResponse create() {
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
    public GetCloudMetricProfilingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetCloudMetricProfilingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetCloudMetricProfilingResponseBody body);

        @Override
        GetCloudMetricProfilingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetCloudMetricProfilingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetCloudMetricProfilingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetCloudMetricProfilingResponse response) {
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
        public Builder body(GetCloudMetricProfilingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetCloudMetricProfilingResponse build() {
            return new GetCloudMetricProfilingResponse(this);
        } 

    } 

}
