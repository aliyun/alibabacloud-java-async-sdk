// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetJobInstanceResponse} extends {@link TeaModel}
 *
 * <p>GetJobInstanceResponse</p>
 */
public class GetJobInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetJobInstanceResponseBody body;

    private GetJobInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetJobInstanceResponse create() {
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
    public GetJobInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetJobInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetJobInstanceResponseBody body);

        @Override
        GetJobInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetJobInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetJobInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetJobInstanceResponse response) {
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
        public Builder body(GetJobInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetJobInstanceResponse build() {
            return new GetJobInstanceResponse(this);
        } 

    } 

}
