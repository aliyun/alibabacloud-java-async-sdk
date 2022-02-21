// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPrecisionTaskResponse} extends {@link TeaModel}
 *
 * <p>GetPrecisionTaskResponse</p>
 */
public class GetPrecisionTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetPrecisionTaskResponseBody body;

    private GetPrecisionTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetPrecisionTaskResponse create() {
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
    public GetPrecisionTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetPrecisionTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetPrecisionTaskResponseBody body);

        @Override
        GetPrecisionTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetPrecisionTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetPrecisionTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetPrecisionTaskResponse response) {
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
        public Builder body(GetPrecisionTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetPrecisionTaskResponse build() {
            return new GetPrecisionTaskResponse(this);
        } 

    } 

}
