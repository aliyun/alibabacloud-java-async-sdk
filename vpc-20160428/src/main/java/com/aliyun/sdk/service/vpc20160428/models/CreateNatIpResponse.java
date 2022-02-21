// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateNatIpResponse} extends {@link TeaModel}
 *
 * <p>CreateNatIpResponse</p>
 */
public class CreateNatIpResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateNatIpResponseBody body;

    private CreateNatIpResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateNatIpResponse create() {
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
    public CreateNatIpResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateNatIpResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateNatIpResponseBody body);

        @Override
        CreateNatIpResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateNatIpResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateNatIpResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateNatIpResponse response) {
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
        public Builder body(CreateNatIpResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateNatIpResponse build() {
            return new CreateNatIpResponse(this);
        } 

    } 

}
