// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRetcodeAppByPidResponse} extends {@link TeaModel}
 *
 * <p>GetRetcodeAppByPidResponse</p>
 */
public class GetRetcodeAppByPidResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetRetcodeAppByPidResponseBody body;

    private GetRetcodeAppByPidResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetRetcodeAppByPidResponse create() {
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
    public GetRetcodeAppByPidResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetRetcodeAppByPidResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetRetcodeAppByPidResponseBody body);

        @Override
        GetRetcodeAppByPidResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetRetcodeAppByPidResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetRetcodeAppByPidResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetRetcodeAppByPidResponse response) {
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
        public Builder body(GetRetcodeAppByPidResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetRetcodeAppByPidResponse build() {
            return new GetRetcodeAppByPidResponse(this);
        } 

    } 

}
