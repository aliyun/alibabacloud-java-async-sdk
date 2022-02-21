// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSpareIpResponse} extends {@link TeaModel}
 *
 * <p>CreateSpareIpResponse</p>
 */
public class CreateSpareIpResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateSpareIpResponseBody body;

    private CreateSpareIpResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateSpareIpResponse create() {
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
    public CreateSpareIpResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateSpareIpResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateSpareIpResponseBody body);

        @Override
        CreateSpareIpResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateSpareIpResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateSpareIpResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateSpareIpResponse response) {
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
        public Builder body(CreateSpareIpResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateSpareIpResponse build() {
            return new CreateSpareIpResponse(this);
        } 

    } 

}
