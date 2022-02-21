// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateWebRuleTfResponse} extends {@link TeaModel}
 *
 * <p>CreateWebRuleTfResponse</p>
 */
public class CreateWebRuleTfResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateWebRuleTfResponseBody body;

    private CreateWebRuleTfResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateWebRuleTfResponse create() {
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
    public CreateWebRuleTfResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateWebRuleTfResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateWebRuleTfResponseBody body);

        @Override
        CreateWebRuleTfResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateWebRuleTfResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateWebRuleTfResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateWebRuleTfResponse response) {
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
        public Builder body(CreateWebRuleTfResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateWebRuleTfResponse build() {
            return new CreateWebRuleTfResponse(this);
        } 

    } 

}
