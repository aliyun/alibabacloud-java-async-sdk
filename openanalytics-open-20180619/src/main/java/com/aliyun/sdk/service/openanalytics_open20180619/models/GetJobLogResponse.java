// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openanalytics_open20180619.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetJobLogResponse} extends {@link TeaModel}
 *
 * <p>GetJobLogResponse</p>
 */
public class GetJobLogResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetJobLogResponseBody body;

    private GetJobLogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetJobLogResponse create() {
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
    public GetJobLogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetJobLogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetJobLogResponseBody body);

        @Override
        GetJobLogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetJobLogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetJobLogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetJobLogResponse response) {
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
        public Builder body(GetJobLogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetJobLogResponse build() {
            return new GetJobLogResponse(this);
        } 

    } 

}
