// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDISyncTaskMetricInfoResponse} extends {@link TeaModel}
 *
 * <p>GetDISyncTaskMetricInfoResponse</p>
 */
public class GetDISyncTaskMetricInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDISyncTaskMetricInfoResponseBody body;

    private GetDISyncTaskMetricInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDISyncTaskMetricInfoResponse create() {
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
    public GetDISyncTaskMetricInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDISyncTaskMetricInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDISyncTaskMetricInfoResponseBody body);

        @Override
        GetDISyncTaskMetricInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDISyncTaskMetricInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDISyncTaskMetricInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDISyncTaskMetricInfoResponse response) {
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
        public Builder body(GetDISyncTaskMetricInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDISyncTaskMetricInfoResponse build() {
            return new GetDISyncTaskMetricInfoResponse(this);
        } 

    } 

}
