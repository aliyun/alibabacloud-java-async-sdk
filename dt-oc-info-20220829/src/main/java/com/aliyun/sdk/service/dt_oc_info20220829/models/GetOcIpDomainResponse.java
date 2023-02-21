// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcIpDomainResponse} extends {@link TeaModel}
 *
 * <p>GetOcIpDomainResponse</p>
 */
public class GetOcIpDomainResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetOcIpDomainResponseBody body;

    private GetOcIpDomainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetOcIpDomainResponse create() {
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
    public GetOcIpDomainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOcIpDomainResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetOcIpDomainResponseBody body);

        @Override
        GetOcIpDomainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOcIpDomainResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetOcIpDomainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOcIpDomainResponse response) {
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
        public Builder body(GetOcIpDomainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOcIpDomainResponse build() {
            return new GetOcIpDomainResponse(this);
        } 

    } 

}
