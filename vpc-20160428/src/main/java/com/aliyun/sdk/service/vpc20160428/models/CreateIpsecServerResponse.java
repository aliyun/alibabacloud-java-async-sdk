// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateIpsecServerResponse} extends {@link TeaModel}
 *
 * <p>CreateIpsecServerResponse</p>
 */
public class CreateIpsecServerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateIpsecServerResponseBody body;

    private CreateIpsecServerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateIpsecServerResponse create() {
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
    public CreateIpsecServerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateIpsecServerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateIpsecServerResponseBody body);

        @Override
        CreateIpsecServerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateIpsecServerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateIpsecServerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateIpsecServerResponse response) {
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
        public Builder body(CreateIpsecServerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateIpsecServerResponse build() {
            return new CreateIpsecServerResponse(this);
        } 

    } 

}
