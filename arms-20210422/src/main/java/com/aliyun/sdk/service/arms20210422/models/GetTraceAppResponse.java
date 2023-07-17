// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTraceAppResponse} extends {@link TeaModel}
 *
 * <p>GetTraceAppResponse</p>
 */
public class GetTraceAppResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetTraceAppResponseBody body;

    private GetTraceAppResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetTraceAppResponse create() {
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
    public GetTraceAppResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTraceAppResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetTraceAppResponseBody body);

        @Override
        GetTraceAppResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTraceAppResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetTraceAppResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTraceAppResponse response) {
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
        public Builder body(GetTraceAppResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetTraceAppResponse build() {
            return new GetTraceAppResponse(this);
        } 

    } 

}
