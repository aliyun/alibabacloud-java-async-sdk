// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateForwardingRulesResponse} extends {@link TeaModel}
 *
 * <p>CreateForwardingRulesResponse</p>
 */
public class CreateForwardingRulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateForwardingRulesResponseBody body;

    private CreateForwardingRulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateForwardingRulesResponse create() {
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
    public CreateForwardingRulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateForwardingRulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateForwardingRulesResponseBody body);

        @Override
        CreateForwardingRulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateForwardingRulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateForwardingRulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateForwardingRulesResponse response) {
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
        public Builder body(CreateForwardingRulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateForwardingRulesResponse build() {
            return new CreateForwardingRulesResponse(this);
        } 

    } 

}
