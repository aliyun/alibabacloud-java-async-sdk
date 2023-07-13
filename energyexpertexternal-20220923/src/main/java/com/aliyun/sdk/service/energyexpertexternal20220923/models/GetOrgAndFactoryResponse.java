// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOrgAndFactoryResponse} extends {@link TeaModel}
 *
 * <p>GetOrgAndFactoryResponse</p>
 */
public class GetOrgAndFactoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetOrgAndFactoryResponseBody body;

    private GetOrgAndFactoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetOrgAndFactoryResponse create() {
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
    public GetOrgAndFactoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOrgAndFactoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetOrgAndFactoryResponseBody body);

        @Override
        GetOrgAndFactoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOrgAndFactoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetOrgAndFactoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOrgAndFactoryResponse response) {
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
        public Builder body(GetOrgAndFactoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOrgAndFactoryResponse build() {
            return new GetOrgAndFactoryResponse(this);
        } 

    } 

}
