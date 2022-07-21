// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetJobResponse} extends {@link TeaModel}
 *
 * <p>GetJobResponse</p>
 */
public class GetJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetJobResponseBody body;

    private GetJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetJobResponse create() {
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
    public GetJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetJobResponseBody body);

        @Override
        GetJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetJobResponse response) {
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
        public Builder body(GetJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetJobResponse build() {
            return new GetJobResponse(this);
        } 

    } 

}
