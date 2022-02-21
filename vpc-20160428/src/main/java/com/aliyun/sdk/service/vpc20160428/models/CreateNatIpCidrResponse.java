// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateNatIpCidrResponse} extends {@link TeaModel}
 *
 * <p>CreateNatIpCidrResponse</p>
 */
public class CreateNatIpCidrResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateNatIpCidrResponseBody body;

    private CreateNatIpCidrResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateNatIpCidrResponse create() {
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
    public CreateNatIpCidrResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateNatIpCidrResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateNatIpCidrResponseBody body);

        @Override
        CreateNatIpCidrResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateNatIpCidrResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateNatIpCidrResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateNatIpCidrResponse response) {
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
        public Builder body(CreateNatIpCidrResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateNatIpCidrResponse build() {
            return new CreateNatIpCidrResponse(this);
        } 

    } 

}
