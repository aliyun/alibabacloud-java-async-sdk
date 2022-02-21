// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openanalytics_open20180619.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetJobStatusResponse} extends {@link TeaModel}
 *
 * <p>GetJobStatusResponse</p>
 */
public class GetJobStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetJobStatusResponseBody body;

    private GetJobStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetJobStatusResponse create() {
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
    public GetJobStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetJobStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetJobStatusResponseBody body);

        @Override
        GetJobStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetJobStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetJobStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetJobStatusResponse response) {
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
        public Builder body(GetJobStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetJobStatusResponse build() {
            return new GetJobStatusResponse(this);
        } 

    } 

}
