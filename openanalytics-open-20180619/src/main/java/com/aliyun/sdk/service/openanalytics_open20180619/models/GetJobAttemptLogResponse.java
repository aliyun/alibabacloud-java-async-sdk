// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openanalytics_open20180619.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetJobAttemptLogResponse} extends {@link TeaModel}
 *
 * <p>GetJobAttemptLogResponse</p>
 */
public class GetJobAttemptLogResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetJobAttemptLogResponseBody body;

    private GetJobAttemptLogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetJobAttemptLogResponse create() {
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
    public GetJobAttemptLogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetJobAttemptLogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetJobAttemptLogResponseBody body);

        @Override
        GetJobAttemptLogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetJobAttemptLogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetJobAttemptLogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetJobAttemptLogResponse response) {
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
        public Builder body(GetJobAttemptLogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetJobAttemptLogResponse build() {
            return new GetJobAttemptLogResponse(this);
        } 

    } 

}
