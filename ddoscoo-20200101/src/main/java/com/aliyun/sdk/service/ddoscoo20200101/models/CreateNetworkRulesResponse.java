// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateNetworkRulesResponse} extends {@link TeaModel}
 *
 * <p>CreateNetworkRulesResponse</p>
 */
public class CreateNetworkRulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateNetworkRulesResponseBody body;

    private CreateNetworkRulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateNetworkRulesResponse create() {
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
    public CreateNetworkRulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateNetworkRulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateNetworkRulesResponseBody body);

        @Override
        CreateNetworkRulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateNetworkRulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateNetworkRulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateNetworkRulesResponse response) {
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
        public Builder body(CreateNetworkRulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateNetworkRulesResponse build() {
            return new CreateNetworkRulesResponse(this);
        } 

    } 

}
