// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMonitorResultResponse} extends {@link TeaModel}
 *
 * <p>GetMonitorResultResponse</p>
 */
public class GetMonitorResultResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetMonitorResultResponseBody body;

    private GetMonitorResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetMonitorResultResponse create() {
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
    public GetMonitorResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetMonitorResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetMonitorResultResponseBody body);

        @Override
        GetMonitorResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetMonitorResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetMonitorResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetMonitorResultResponse response) {
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
        public Builder body(GetMonitorResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetMonitorResultResponse build() {
            return new GetMonitorResultResponse(this);
        } 

    } 

}
