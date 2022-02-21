// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateNetworkRulesTfResponse} extends {@link TeaModel}
 *
 * <p>CreateNetworkRulesTfResponse</p>
 */
public class CreateNetworkRulesTfResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateNetworkRulesTfResponseBody body;

    private CreateNetworkRulesTfResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateNetworkRulesTfResponse create() {
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
    public CreateNetworkRulesTfResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateNetworkRulesTfResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateNetworkRulesTfResponseBody body);

        @Override
        CreateNetworkRulesTfResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateNetworkRulesTfResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateNetworkRulesTfResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateNetworkRulesTfResponse response) {
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
        public Builder body(CreateNetworkRulesTfResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateNetworkRulesTfResponse build() {
            return new CreateNetworkRulesTfResponse(this);
        } 

    } 

}
