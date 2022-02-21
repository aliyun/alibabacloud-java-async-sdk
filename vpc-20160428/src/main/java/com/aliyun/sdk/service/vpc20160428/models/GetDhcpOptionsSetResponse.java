// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDhcpOptionsSetResponse} extends {@link TeaModel}
 *
 * <p>GetDhcpOptionsSetResponse</p>
 */
public class GetDhcpOptionsSetResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDhcpOptionsSetResponseBody body;

    private GetDhcpOptionsSetResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDhcpOptionsSetResponse create() {
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
    public GetDhcpOptionsSetResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDhcpOptionsSetResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDhcpOptionsSetResponseBody body);

        @Override
        GetDhcpOptionsSetResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDhcpOptionsSetResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDhcpOptionsSetResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDhcpOptionsSetResponse response) {
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
        public Builder body(GetDhcpOptionsSetResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDhcpOptionsSetResponse build() {
            return new GetDhcpOptionsSetResponse(this);
        } 

    } 

}
