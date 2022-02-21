// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMultipleTraceResponse} extends {@link TeaModel}
 *
 * <p>GetMultipleTraceResponse</p>
 */
public class GetMultipleTraceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetMultipleTraceResponseBody body;

    private GetMultipleTraceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetMultipleTraceResponse create() {
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
    public GetMultipleTraceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetMultipleTraceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetMultipleTraceResponseBody body);

        @Override
        GetMultipleTraceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetMultipleTraceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetMultipleTraceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetMultipleTraceResponse response) {
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
        public Builder body(GetMultipleTraceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetMultipleTraceResponse build() {
            return new GetMultipleTraceResponse(this);
        } 

    } 

}
