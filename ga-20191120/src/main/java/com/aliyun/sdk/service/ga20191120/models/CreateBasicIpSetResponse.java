// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBasicIpSetResponse} extends {@link TeaModel}
 *
 * <p>CreateBasicIpSetResponse</p>
 */
public class CreateBasicIpSetResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateBasicIpSetResponseBody body;

    private CreateBasicIpSetResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateBasicIpSetResponse create() {
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
    public CreateBasicIpSetResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateBasicIpSetResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateBasicIpSetResponseBody body);

        @Override
        CreateBasicIpSetResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateBasicIpSetResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateBasicIpSetResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateBasicIpSetResponse response) {
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
        public Builder body(CreateBasicIpSetResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateBasicIpSetResponse build() {
            return new CreateBasicIpSetResponse(this);
        } 

    } 

}
