// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eais20190624.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPrivateIpResponse} extends {@link TeaModel}
 *
 * <p>GetPrivateIpResponse</p>
 */
public class GetPrivateIpResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetPrivateIpResponseBody body;

    private GetPrivateIpResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetPrivateIpResponse create() {
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
    public GetPrivateIpResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetPrivateIpResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetPrivateIpResponseBody body);

        @Override
        GetPrivateIpResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetPrivateIpResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetPrivateIpResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetPrivateIpResponse response) {
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
        public Builder body(GetPrivateIpResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetPrivateIpResponse build() {
            return new GetPrivateIpResponse(this);
        } 

    } 

}
