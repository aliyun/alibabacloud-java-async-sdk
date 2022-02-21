// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMcuLvsIpResponse} extends {@link TeaModel}
 *
 * <p>GetMcuLvsIpResponse</p>
 */
public class GetMcuLvsIpResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetMcuLvsIpResponseBody body;

    private GetMcuLvsIpResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetMcuLvsIpResponse create() {
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
    public GetMcuLvsIpResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetMcuLvsIpResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetMcuLvsIpResponseBody body);

        @Override
        GetMcuLvsIpResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetMcuLvsIpResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetMcuLvsIpResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetMcuLvsIpResponse response) {
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
        public Builder body(GetMcuLvsIpResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetMcuLvsIpResponse build() {
            return new GetMcuLvsIpResponse(this);
        } 

    } 

}
