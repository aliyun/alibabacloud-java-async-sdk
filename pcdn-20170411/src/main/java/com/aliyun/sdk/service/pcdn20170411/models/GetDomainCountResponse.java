// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pcdn20170411.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDomainCountResponse} extends {@link TeaModel}
 *
 * <p>GetDomainCountResponse</p>
 */
public class GetDomainCountResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDomainCountResponseBody body;

    private GetDomainCountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDomainCountResponse create() {
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
    public GetDomainCountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDomainCountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDomainCountResponseBody body);

        @Override
        GetDomainCountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDomainCountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDomainCountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDomainCountResponse response) {
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
        public Builder body(GetDomainCountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDomainCountResponse build() {
            return new GetDomainCountResponse(this);
        } 

    } 

}
