// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDomainOwnerVerifyContentResponse} extends {@link TeaModel}
 *
 * <p>GetDomainOwnerVerifyContentResponse</p>
 */
public class GetDomainOwnerVerifyContentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDomainOwnerVerifyContentResponseBody body;

    private GetDomainOwnerVerifyContentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDomainOwnerVerifyContentResponse create() {
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
    public GetDomainOwnerVerifyContentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDomainOwnerVerifyContentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDomainOwnerVerifyContentResponseBody body);

        @Override
        GetDomainOwnerVerifyContentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDomainOwnerVerifyContentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDomainOwnerVerifyContentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDomainOwnerVerifyContentResponse response) {
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
        public Builder body(GetDomainOwnerVerifyContentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDomainOwnerVerifyContentResponse build() {
            return new GetDomainOwnerVerifyContentResponse(this);
        } 

    } 

}
