// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLiveDomainStatusResponse} extends {@link TeaModel}
 *
 * <p>GetLiveDomainStatusResponse</p>
 */
public class GetLiveDomainStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetLiveDomainStatusResponseBody body;

    private GetLiveDomainStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetLiveDomainStatusResponse create() {
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
    public GetLiveDomainStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetLiveDomainStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetLiveDomainStatusResponseBody body);

        @Override
        GetLiveDomainStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetLiveDomainStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetLiveDomainStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetLiveDomainStatusResponse response) {
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
        public Builder body(GetLiveDomainStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetLiveDomainStatusResponse build() {
            return new GetLiveDomainStatusResponse(this);
        } 

    } 

}
