// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSpareIpResponse} extends {@link TeaModel}
 *
 * <p>GetSpareIpResponse</p>
 */
public class GetSpareIpResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSpareIpResponseBody body;

    private GetSpareIpResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSpareIpResponse create() {
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
    public GetSpareIpResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSpareIpResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSpareIpResponseBody body);

        @Override
        GetSpareIpResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSpareIpResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSpareIpResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSpareIpResponse response) {
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
        public Builder body(GetSpareIpResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSpareIpResponse build() {
            return new GetSpareIpResponse(this);
        } 

    } 

}
